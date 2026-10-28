package p031b9;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* JADX INFO: renamed from: b9.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class SurfaceHolderCallbackC2821c0 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C2830f0 f11043w;

    public SurfaceHolderCallbackC2821c0(C2830f0 c2830f0) {
        this.f11043w = c2830f0;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i13, int i14) {
        Surface surface = new Surface(surfaceTexture);
        C2830f0 c2830f0 = this.f11043w;
        c2830f0.m8084E0(surface);
        c2830f0.f11149s0 = surface;
        c2830f0.m8115p0(i13, i14);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C2830f0 c2830f0 = this.f11043w;
        c2830f0.m8084E0(null);
        c2830f0.m8115p0(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i13, int i14) {
        this.f11043w.m8115p0(i13, i14);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i13, int i14, int i15) {
        this.f11043w.m8115p0(i14, i15);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C2830f0 c2830f0 = this.f11043w;
        if (c2830f0.f11152v0) {
            c2830f0.m8084E0(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C2830f0 c2830f0 = this.f11043w;
        if (c2830f0.f11152v0) {
            c2830f0.m8084E0(null);
        }
        c2830f0.m8115p0(0, 0);
    }
}
