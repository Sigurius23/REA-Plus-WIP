package no;

import android.graphics.SurfaceTexture;
import p484s9.C32283h;

/* JADX INFO: renamed from: no.j */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C26877j implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f107254w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f107255x;

    public /* synthetic */ C26877j(Object obj, int i13) {
        this.f107254w = i13;
        this.f107255x = obj;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f107254w) {
            case 0:
                ((C26878k) this.f107255x).f107265w.set(true);
                break;
            default:
                ((C32283h) this.f107255x).f133603w.set(true);
                break;
        }
    }
}
