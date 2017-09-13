package com.mocity.rom.pixel;

import com.mocity.rom.FastBitmapDrawable;
import com.mocity.rom.ItemInfo;
import android.graphics.Bitmap;
import android.content.Context;
import com.mocity.rom.graphics.DrawableFactory;

public class DynamicDrawableFactory extends DrawableFactory
{
    ClockUpdateReceiver du;

    public DynamicDrawableFactory(final Context context) {
        this.du = ClockUpdateReceiver.getInstance(context);
    }

    public FastBitmapDrawable newIcon(final Bitmap bitmap, final ItemInfo itemInfo) {
        if (itemInfo != null && itemInfo.itemType == 0 && ClockUpdateReceiver.componentName.equals(itemInfo.getTargetComponent())) {
            final ClockStatus b = new ClockStatus(bitmap, this.du);
            b.setFilterBitmap(true);
            return b;
        }
        return super.newIcon(bitmap, itemInfo);
    }
}

