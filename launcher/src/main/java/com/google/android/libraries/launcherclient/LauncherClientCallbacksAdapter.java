package com.google.android.libraries.launcherclient;

import com.mocity.rom.Workspace;

public class LauncherClientCallbacksAdapter implements LauncherClientCallbacks {
    private Workspace mWorkspace;

    public LauncherClientCallbacksAdapter(Workspace workspace) {
        mWorkspace = workspace;
    }

    @Override
    public void onOverlayScrollChanged(float progress) {
        mWorkspace.onOverlayScrollChanged(progress);
    }

    @Override
    public void onServiceStateChanged(boolean overlayAttached, boolean hotwordActive) {

    }
}
