package p607x8;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* JADX INFO: renamed from: x8.e */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC38050e implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: G */
    public static final int[] f162984G = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: E */
    public EGLSurface f162985E;

    /* JADX INFO: renamed from: F */
    public SurfaceTexture f162986F;

    /* JADX INFO: renamed from: w */
    public final Handler f162987w;

    /* JADX INFO: renamed from: x */
    public final int[] f162988x = new int[1];

    /* JADX INFO: renamed from: y */
    public EGLDisplay f162989y;

    /* JADX INFO: renamed from: z */
    public EGLContext f162990z;

    public RunnableC38050e(Handler handler) {
        this.f162987w = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f162987w.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f162986F;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
