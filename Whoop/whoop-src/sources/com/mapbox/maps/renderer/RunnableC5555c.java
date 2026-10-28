package com.mapbox.maps.renderer;

import android.content.Context;
import com.mapbox.maps.MapView;
import p073cq.C11040i;
import p107e3.AbstractC12601b;

/* JADX INFO: renamed from: com.mapbox.maps.renderer.c */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class RunnableC5555c implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f22063w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f22064x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f22065y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f22066z;

    public /* synthetic */ RunnableC5555c(Context context, boolean z4, C11040i c11040i) {
        this.f22065y = context;
        this.f22064x = z4;
        this.f22066z = c11040i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22063w) {
            case 0:
                MapboxRenderer.snapshot$lambda$4((MapView.OnSnapshotReady) this.f22065y, (MapboxRenderer) this.f22066z, this.f22064x);
                break;
            default:
                AbstractC12601b.m35314a((Context) this.f22065y, this.f22064x, (C11040i) this.f22066z);
                break;
        }
    }

    public /* synthetic */ RunnableC5555c(MapView.OnSnapshotReady onSnapshotReady, MapboxRenderer mapboxRenderer, boolean z4) {
        this.f22065y = onSnapshotReady;
        this.f22066z = mapboxRenderer;
        this.f22064x = z4;
    }
}
