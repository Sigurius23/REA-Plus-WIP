package wz2;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;
import p031b9.AbstractC2875y;
import p108e4.AbstractC12682p;
import p319m4.AbstractC25012a;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: wz2.a */
/* JADX INFO: loaded from: classes11.dex */
final class C37782a {

    /* JADX INFO: renamed from: a */
    private EGLDisplay f161836a;

    /* JADX INFO: renamed from: b */
    private EGLContext f161837b;

    /* JADX INFO: renamed from: c */
    private EGLConfig f161838c;

    /* JADX INFO: renamed from: d */
    private int f161839d;

    /* JADX INFO: renamed from: e */
    private InterfaceC34116n f161840e;

    public C37782a(int i13, InterfaceC34116n interfaceC34116n) {
        EGLConfig eGLConfigM121246c;
        this.f161836a = EGL14.EGL_NO_DISPLAY;
        EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
        this.f161837b = eGLContext;
        this.f161838c = null;
        this.f161839d = -1;
        this.f161840e = interfaceC34116n;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f161836a = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            this.f161836a = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        if ((i13 & 2) != 0 && (eGLConfigM121246c = m121246c(i13, 3)) != null) {
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f161836a, eGLConfigM121246c, eGLContext, new int[]{12440, 3, 12344}, 0);
            if (EGL14.eglGetError() == 12288) {
                this.f161838c = eGLConfigM121246c;
                this.f161837b = eGLContextEglCreateContext;
                this.f161839d = 3;
            }
        }
        if (this.f161837b == EGL14.EGL_NO_CONTEXT) {
            EGLConfig eGLConfigM121246c2 = m121246c(i13, 2);
            if (eGLConfigM121246c2 == null) {
                throw new RuntimeException("Unable to find a suitable EGLConfig");
            }
            EGLContext eGLContextEglCreateContext2 = EGL14.eglCreateContext(this.f161836a, eGLConfigM121246c2, eGLContext, new int[]{12440, 2, 12344}, 0);
            m121245a("eglCreateContext");
            this.f161838c = eGLConfigM121246c2;
            this.f161837b = eGLContextEglCreateContext2;
            this.f161839d = 2;
        }
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext(this.f161836a, this.f161837b, 12440, iArr2, 0);
        m121245a("eglQueryContext");
        interfaceC34116n.mo85228t("EGLContext created, client version " + iArr2[0], new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: a */
    private void m121245a(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        StringBuilder sbM35484d = AbstractC12682p.m35484d(str, ": EGL error: 0x");
        sbM35484d.append(Integer.toHexString(iEglGetError));
        throw new RuntimeException(sbM35484d.toString());
    }

    /* JADX INFO: renamed from: c */
    private EGLConfig m121246c(int i13, int i14) {
        int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, i14 >= 3 ? 68 : 4, 12344, 0, 12344};
        if ((i13 & 1) != 0) {
            iArr[10] = 12610;
            iArr[11] = 1;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(this.f161836a, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        this.f161840e.mo85226q(AbstractC2875y.m8296i(i14, "unable to find RGB8888 / ", " EGLConfig"), new AbstractC30556a.a[0]);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public EGLSurface m121247b(Object obj) {
        if (!(obj instanceof Surface) && !(obj instanceof SurfaceTexture)) {
            throw new RuntimeException(AbstractC25012a.m73375h(obj, "Invalid surface: "));
        }
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f161836a, this.f161838c, obj, new int[]{12344}, 0);
        m121245a("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        throw new RuntimeException("Surface was null");
    }

    /* JADX INFO: renamed from: d */
    public void m121248d(EGLSurface eGLSurface) {
        if (this.f161836a == EGL14.EGL_NO_DISPLAY) {
            this.f161840e.mo85216g("makeCurrent without display", new AbstractC30556a.a[0]);
        }
        if (!EGL14.eglMakeCurrent(this.f161836a, eGLSurface, eGLSurface, this.f161837b)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    /* JADX INFO: renamed from: e */
    public void m121249e() {
        EGLDisplay eGLDisplay = this.f161836a;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f161836a, this.f161837b);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f161836a);
        }
        this.f161836a = EGL14.EGL_NO_DISPLAY;
        this.f161837b = EGL14.EGL_NO_CONTEXT;
        this.f161838c = null;
    }

    /* JADX INFO: renamed from: f */
    public void m121250f(EGLSurface eGLSurface) {
        EGL14.eglDestroySurface(this.f161836a, eGLSurface);
    }

    public void finalize() throws Throwable {
        try {
            if (this.f161836a != EGL14.EGL_NO_DISPLAY) {
                this.f161840e.mo85226q("EglCore was not explicitly released -- state may be leaked", new AbstractC30556a.a[0]);
                m121249e();
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m121251g(EGLSurface eGLSurface) {
        return EGL14.eglSwapBuffers(this.f161836a, eGLSurface);
    }
}
