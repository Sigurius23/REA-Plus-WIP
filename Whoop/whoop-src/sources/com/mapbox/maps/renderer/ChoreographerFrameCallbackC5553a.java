package com.mapbox.maps.renderer;

import android.view.Choreographer;

/* JADX INFO: renamed from: com.mapbox.maps.renderer.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ChoreographerFrameCallbackC5553a implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f22056w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f22057x;

    public /* synthetic */ ChoreographerFrameCallbackC5553a(Object obj, int i13) {
        this.f22056w = i13;
        this.f22057x = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j7) {
        switch (this.f22056w) {
            case 0:
                MapboxRenderThread.draw$lambda$5((MapboxRenderThread) this.f22057x, j7);
                break;
            default:
                ((Runnable) this.f22057x).run();
                break;
        }
    }
}
