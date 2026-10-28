package wz2;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: wz2.c */
/* JADX INFO: loaded from: classes11.dex */
public class C37784c {

    /* JADX INFO: renamed from: a */
    private C37782a f161883a;

    /* JADX INFO: renamed from: b */
    private EGLSurface f161884b;

    /* JADX INFO: renamed from: c */
    private int f161885c = -1;

    /* JADX INFO: renamed from: d */
    private int f161886d = -1;

    /* JADX INFO: renamed from: e */
    private InterfaceC34116n f161887e;

    public C37784c(C37782a c37782a, SurfaceTexture surfaceTexture, InterfaceC34116n interfaceC34116n) {
        this.f161884b = EGL14.EGL_NO_SURFACE;
        this.f161883a = c37782a;
        this.f161887e = interfaceC34116n;
        this.f161884b = c37782a.m121247b(surfaceTexture);
    }

    /* JADX INFO: renamed from: a */
    public void m121277a() {
        this.f161883a.m121248d(this.f161884b);
    }

    /* JADX INFO: renamed from: b */
    public void m121278b() {
        this.f161883a.m121250f(this.f161884b);
        this.f161884b = EGL14.EGL_NO_SURFACE;
        this.f161885c = -1;
        this.f161886d = -1;
    }

    /* JADX INFO: renamed from: c */
    public boolean m121279c() {
        boolean zM121251g = this.f161883a.m121251g(this.f161884b);
        if (!zM121251g) {
            this.f161887e.mo85226q("swapBuffers() failed", new AbstractC30556a.a[0]);
        }
        return zM121251g;
    }
}
