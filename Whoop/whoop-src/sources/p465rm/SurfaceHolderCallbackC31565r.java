package p465rm;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* JADX INFO: renamed from: rm.r */
/* JADX INFO: loaded from: classes6.dex */
public final class SurfaceHolderCallbackC31565r implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C31571u f130359w;

    public SurfaceHolderCallbackC31565r(C31571u c31571u) {
        this.f130359w = c31571u;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i13, int i14) {
        Surface surface = new Surface(surfaceTexture);
        C31571u c31571u = this.f130359w;
        c31571u.m97228w0(surface);
        c31571u.f130428s0 = surface;
        c31571u.m97217l0(i13, i14);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C31571u c31571u = this.f130359w;
        c31571u.m97228w0(null);
        c31571u.m97217l0(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i13, int i14) {
        this.f130359w.m97217l0(i13, i14);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i13, int i14, int i15) {
        this.f130359w.m97217l0(i14, i15);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C31571u c31571u = this.f130359w;
        if (c31571u.f130431v0) {
            c31571u.m97228w0(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C31571u c31571u = this.f130359w;
        if (c31571u.f130431v0) {
            c31571u.m97228w0(null);
        }
        c31571u.m97217l0(0, 0);
    }
}
