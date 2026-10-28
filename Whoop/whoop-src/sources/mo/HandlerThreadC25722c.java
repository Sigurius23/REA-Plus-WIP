package mo;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.media3.common.util.GlUtil$GlException;
import com.google.android.exoplayer2.util.EGLSurfaceTexture$GlException;
import java.util.Locale;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p309lo.RunnableC24545c;
import p454r9.C31081f;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p607x8.RunnableC38050e;

/* JADX INFO: renamed from: mo.c */
/* JADX INFO: loaded from: classes6.dex */
public final class HandlerThreadC25722c extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: E */
    public Object f101330E;

    /* JADX INFO: renamed from: F */
    public Surface f101331F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f101332w;

    /* JADX INFO: renamed from: x */
    public Handler f101333x;

    /* JADX INFO: renamed from: y */
    public Error f101334y;

    /* JADX INFO: renamed from: z */
    public RuntimeException f101335z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerThreadC25722c(String str, int i13) {
        super(str);
        this.f101332w = i13;
    }

    /* JADX INFO: renamed from: a */
    public final void m75839a(int i13) throws GlUtil$GlException {
        EGLConfig eGLConfig;
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2;
        switch (this.f101332w) {
            case 0:
                ((RunnableC24545c) this.f101330E).getClass();
                RunnableC24545c runnableC24545c = (RunnableC24545c) this.f101330E;
                int[] iArr = runnableC24545c.f95811x;
                EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                if (eGLDisplayEglGetDisplay == null) {
                    throw new EGLSurfaceTexture$GlException("eglGetDisplay failed");
                }
                int[] iArr2 = new int[2];
                if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr2, 0, iArr2, 1)) {
                    throw new EGLSurfaceTexture$GlException("eglInitialize failed");
                }
                runnableC24545c.f95812y = eGLDisplayEglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr3 = new int[1];
                boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, RunnableC24545c.f95807G, 0, eGLConfigArr, 0, 1, iArr3, 0);
                if (!zEglChooseConfig || iArr3[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
                    Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
                    int i14 = AbstractC24567y.f95875a;
                    throw new EGLSurfaceTexture$GlException(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr));
                }
                EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(runnableC24545c.f95812y, eGLConfig, EGL14.EGL_NO_CONTEXT, i13 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
                if (eGLContextEglCreateContext == null) {
                    throw new EGLSurfaceTexture$GlException("eglCreateContext failed");
                }
                runnableC24545c.f95813z = eGLContextEglCreateContext;
                EGLDisplay eGLDisplay = runnableC24545c.f95812y;
                if (i13 == 1) {
                    eGLSurface = EGL14.EGL_NO_SURFACE;
                } else {
                    EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i13 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                    if (eGLSurfaceEglCreatePbufferSurface == null) {
                        throw new EGLSurfaceTexture$GlException("eglCreatePbufferSurface failed");
                    }
                    eGLSurface = eGLSurfaceEglCreatePbufferSurface;
                }
                if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContextEglCreateContext)) {
                    throw new EGLSurfaceTexture$GlException("eglMakeCurrent failed");
                }
                runnableC24545c.f95808E = eGLSurface;
                GLES20.glGenTextures(1, iArr, 0);
                AbstractC24543a.m71571g();
                SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
                runnableC24545c.f95809F = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(runnableC24545c);
                SurfaceTexture surfaceTexture2 = ((RunnableC24545c) this.f101330E).f95809F;
                surfaceTexture2.getClass();
                this.f101331F = new C25723d(this, surfaceTexture2, i13 != 0);
                return;
            default:
                ((RunnableC38050e) this.f101330E).getClass();
                RunnableC38050e runnableC38050e = (RunnableC38050e) this.f101330E;
                int[] iArr4 = runnableC38050e.f162988x;
                EGLDisplay eGLDisplayEglGetDisplay2 = EGL14.eglGetDisplay(0);
                AbstractC38046a.m121809d("eglGetDisplay failed", eGLDisplayEglGetDisplay2 != null);
                int[] iArr5 = new int[2];
                AbstractC38046a.m121809d("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay2, iArr5, 0, iArr5, 1));
                runnableC38050e.f162989y = eGLDisplayEglGetDisplay2;
                EGLConfig[] eGLConfigArr2 = new EGLConfig[1];
                int[] iArr6 = new int[1];
                boolean zEglChooseConfig2 = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay2, RunnableC38050e.f162984G, 0, eGLConfigArr2, 0, 1, iArr6, 0);
                boolean z4 = zEglChooseConfig2 && iArr6[0] > 0 && eGLConfigArr2[0] != null;
                Object[] objArr2 = {Boolean.valueOf(zEglChooseConfig2), Integer.valueOf(iArr6[0]), eGLConfigArr2[0]};
                int i15 = AbstractC38065t.f163031a;
                AbstractC38046a.m121809d(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr2), z4);
                EGLConfig eGLConfig2 = eGLConfigArr2[0];
                EGLContext eGLContextEglCreateContext2 = EGL14.eglCreateContext(runnableC38050e.f162989y, eGLConfig2, EGL14.EGL_NO_CONTEXT, i13 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
                AbstractC38046a.m121809d("eglCreateContext failed", eGLContextEglCreateContext2 != null);
                runnableC38050e.f162990z = eGLContextEglCreateContext2;
                EGLDisplay eGLDisplay2 = runnableC38050e.f162989y;
                if (i13 == 1) {
                    eGLSurface2 = EGL14.EGL_NO_SURFACE;
                } else {
                    EGLSurface eGLSurfaceEglCreatePbufferSurface2 = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig2, i13 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                    AbstractC38046a.m121809d("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface2 != null);
                    eGLSurface2 = eGLSurfaceEglCreatePbufferSurface2;
                }
                AbstractC38046a.m121809d("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, eGLContextEglCreateContext2));
                runnableC38050e.f162985E = eGLSurface2;
                GLES20.glGenTextures(1, iArr4, 0);
                AbstractC38046a.m121808c();
                SurfaceTexture surfaceTexture3 = new SurfaceTexture(iArr4[0]);
                runnableC38050e.f162986F = surfaceTexture3;
                surfaceTexture3.setOnFrameAvailableListener(runnableC38050e);
                SurfaceTexture surfaceTexture4 = ((RunnableC38050e) this.f101330E).f162986F;
                surfaceTexture4.getClass();
                this.f101331F = new C31081f(this, surfaceTexture4, i13 != 0);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final void m75840b() {
        switch (this.f101332w) {
            case 0:
                ((RunnableC24545c) this.f101330E).getClass();
                RunnableC24545c runnableC24545c = (RunnableC24545c) this.f101330E;
                runnableC24545c.f95810w.removeCallbacks(runnableC24545c);
                try {
                    SurfaceTexture surfaceTexture = runnableC24545c.f95809F;
                    if (surfaceTexture != null) {
                        surfaceTexture.release();
                        GLES20.glDeleteTextures(1, runnableC24545c.f95811x, 0);
                        break;
                    }
                    return;
                } finally {
                    EGLDisplay eGLDisplay = runnableC24545c.f95812y;
                    if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGLDisplay eGLDisplay2 = runnableC24545c.f95812y;
                        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                    }
                    EGLSurface eGLSurface2 = runnableC24545c.f95808E;
                    if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                        EGL14.eglDestroySurface(runnableC24545c.f95812y, runnableC24545c.f95808E);
                    }
                    EGLContext eGLContext = runnableC24545c.f95813z;
                    if (eGLContext != null) {
                        EGL14.eglDestroyContext(runnableC24545c.f95812y, eGLContext);
                    }
                    if (AbstractC24567y.f95875a >= 19) {
                        EGL14.eglReleaseThread();
                    }
                    EGLDisplay eGLDisplay3 = runnableC24545c.f95812y;
                    if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGL14.eglTerminate(runnableC24545c.f95812y);
                    }
                    runnableC24545c.f95812y = null;
                    runnableC24545c.f95813z = null;
                    runnableC24545c.f95808E = null;
                    runnableC24545c.f95809F = null;
                }
            default:
                ((RunnableC38050e) this.f101330E).getClass();
                RunnableC38050e runnableC38050e = (RunnableC38050e) this.f101330E;
                runnableC38050e.f162987w.removeCallbacks(runnableC38050e);
                try {
                    SurfaceTexture surfaceTexture2 = runnableC38050e.f162986F;
                    if (surfaceTexture2 != null) {
                        surfaceTexture2.release();
                        GLES20.glDeleteTextures(1, runnableC38050e.f162988x, 0);
                        break;
                    }
                    return;
                } finally {
                    EGLDisplay eGLDisplay4 = runnableC38050e.f162989y;
                    if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGLDisplay eGLDisplay5 = runnableC38050e.f162989y;
                        EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
                    }
                    EGLSurface eGLSurface4 = runnableC38050e.f162985E;
                    if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                        EGL14.eglDestroySurface(runnableC38050e.f162989y, runnableC38050e.f162985E);
                    }
                    EGLContext eGLContext2 = runnableC38050e.f162990z;
                    if (eGLContext2 != null) {
                        EGL14.eglDestroyContext(runnableC38050e.f162989y, eGLContext2);
                    }
                    EGL14.eglReleaseThread();
                    EGLDisplay eGLDisplay6 = runnableC38050e.f162989y;
                    if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGL14.eglTerminate(runnableC38050e.f162989y);
                    }
                    runnableC38050e.f162989y = null;
                    runnableC38050e.f162990z = null;
                    runnableC38050e.f162985E = null;
                    runnableC38050e.f162986F = null;
                }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f101332w) {
            case 0:
                int i13 = message.what;
                try {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            try {
                                m75840b();
                            } catch (Throwable th3) {
                                try {
                                    AbstractC24543a.m71578n("DummySurface", "Failed to release dummy surface", th3);
                                } finally {
                                    quit();
                                }
                            }
                        }
                        break;
                    } else {
                        try {
                            m75839a(message.arg1);
                            synchronized (this) {
                                notify();
                            }
                        } catch (Error e5) {
                            AbstractC24543a.m71578n("DummySurface", "Failed to initialize dummy surface", e5);
                            this.f101334y = e5;
                            synchronized (this) {
                                notify();
                            }
                        } catch (RuntimeException e13) {
                            AbstractC24543a.m71578n("DummySurface", "Failed to initialize dummy surface", e13);
                            this.f101335z = e13;
                            synchronized (this) {
                                notify();
                            }
                        }
                        break;
                    }
                    return true;
                } catch (Throwable th4) {
                    synchronized (this) {
                        notify();
                        throw th4;
                    }
                }
            default:
                int i14 = message.what;
                try {
                    if (i14 != 1) {
                        if (i14 == 2) {
                            try {
                                m75840b();
                            } catch (Throwable th5) {
                                try {
                                    AbstractC38046a.m121813h("PlaceholderSurface", "Failed to release placeholder surface", th5);
                                } finally {
                                    quit();
                                }
                            }
                        }
                        break;
                    } else {
                        try {
                            try {
                                m75839a(message.arg1);
                                synchronized (this) {
                                    notify();
                                }
                            } catch (Error e14) {
                                AbstractC38046a.m121813h("PlaceholderSurface", "Failed to initialize placeholder surface", e14);
                                this.f101334y = e14;
                                synchronized (this) {
                                    notify();
                                }
                            }
                        } catch (GlUtil$GlException e15) {
                            AbstractC38046a.m121813h("PlaceholderSurface", "Failed to initialize placeholder surface", e15);
                            this.f101335z = new IllegalStateException(e15);
                            synchronized (this) {
                                notify();
                            }
                        } catch (RuntimeException e16) {
                            AbstractC38046a.m121813h("PlaceholderSurface", "Failed to initialize placeholder surface", e16);
                            this.f101335z = e16;
                            synchronized (this) {
                                notify();
                            }
                        }
                        break;
                    }
                    return true;
                } catch (Throwable th6) {
                    synchronized (this) {
                        notify();
                        throw th6;
                    }
                }
        }
    }
}
