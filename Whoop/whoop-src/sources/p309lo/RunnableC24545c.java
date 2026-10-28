package p309lo;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* JADX INFO: renamed from: lo.c */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC24545c implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: G */
    public static final int[] f95807G = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: E */
    public EGLSurface f95808E;

    /* JADX INFO: renamed from: F */
    public SurfaceTexture f95809F;

    /* JADX INFO: renamed from: w */
    public final Handler f95810w;

    /* JADX INFO: renamed from: x */
    public final int[] f95811x = new int[1];

    /* JADX INFO: renamed from: y */
    public EGLDisplay f95812y;

    /* JADX INFO: renamed from: z */
    public EGLContext f95813z;

    public RunnableC24545c(Handler handler) {
        this.f95810w = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f95810w.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f95809F;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
