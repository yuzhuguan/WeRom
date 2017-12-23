package com.mocity.rom.allapps;

import android.content.res.Resources;
import android.graphics.Outline;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewOutlineProvider;

import com.mocity.rom.BaseRecyclerView;
import com.mocity.rom.R;
import com.mocity.rom.Utilities;

/**
 * Helper class for controlling the header elevation in response to RecyclerView scroll.
 */
public class HeaderElevationController extends RecyclerView.OnScrollListener {

    private final View mHeader;
    private final float mMaxElevation;
    private final float mScrollToElevation;

    private int mCurrentY = 0;

    public HeaderElevationController(View header) {
        mHeader = header;
        final Resources res = mHeader.getContext().getResources();
        mMaxElevation = res.getDimension(R.dimen.all_apps_header_max_elevation);
        mScrollToElevation = res.getDimension(R.dimen.all_apps_header_scroll_to_elevation);

        // We need to provide a custom outline so the shadow only appears on the bottom edge.
        // The top, left and right edges are all extended out, and the shadow is clipped
        // by the parent.
        final ViewOutlineProvider vop = new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                final View parent = (View) mHeader.getParent();

                final int left = parent.getLeft(); // Use the parent to account for offsets
                final int top = view.getTop();
                final int right = left + view.getWidth();
                final int bottom = view.getBottom();

                final int offset = Utilities.pxFromDp(mMaxElevation, res.getDisplayMetrics());
                outline.setRect(left - offset, top - offset, right + offset, bottom);
            }
        };
        mHeader.setOutlineProvider(vop);
    }

    public void reset() {
        mCurrentY = 0;
        onScroll(mCurrentY);
    }

    @Override
    public final void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        mCurrentY = ((BaseRecyclerView) recyclerView).getCurrentScrollY();
        onScroll(mCurrentY);
    }

    private void onScroll(int scrollY) {
        float elevationPct = Math.min(scrollY, mScrollToElevation) / mScrollToElevation;
        float newElevation = mMaxElevation * elevationPct;
        if (Float.compare(mHeader.getElevation(), newElevation) != 0) {
            mHeader.setElevation(newElevation);
        }
    }

}
