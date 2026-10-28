package hms.webrtc;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.opengl.GLException;
import android.view.Surface;
import android.view.SurfaceHolder;
import hc3.AbstractC17176i;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import p000.AbstractC11266d;

/* JADX INFO: loaded from: classes11.dex */
class EglBase10Impl implements EglBase10 {
    private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private static final String TAG = "EglBase10Impl";
    private final EGL10 egl;
    private EGLConfig eglConfig;
    private EGLContext eglContext;
    private EGLDisplay eglDisplay;
    private EGLSurface eglSurface = EGL10.EGL_NO_SURFACE;

    public static class Context implements EglBase10.Context {
        private final EGL10 egl;
        private final EGLContext eglContext;
        private final EGLConfig eglContextConfig;

        public Context(EGL10 egl10, EGLContext eGLContext, EGLConfig eGLConfig) {
            this.egl = egl10;
            this.eglContext = eGLContext;
            this.eglContextConfig = eGLConfig;
        }

        @Override // hms.webrtc.EglBase.Context
        public long getNativeEglContext() {
            EGLContext eGLContextEglGetCurrentContext = this.egl.eglGetCurrentContext();
            EGLDisplay eGLDisplayEglGetCurrentDisplay = this.egl.eglGetCurrentDisplay();
            EGLSurface eGLSurfaceEglGetCurrentSurface = this.egl.eglGetCurrentSurface(12377);
            EGLSurface eGLSurfaceEglGetCurrentSurface2 = this.egl.eglGetCurrentSurface(12378);
            if (eGLDisplayEglGetCurrentDisplay == EGL10.EGL_NO_DISPLAY) {
                eGLDisplayEglGetCurrentDisplay = this.egl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            }
            EGLSurface eGLSurfaceEglCreatePbufferSurface = null;
            try {
                if (eGLContextEglGetCurrentContext != this.eglContext) {
                    eGLSurfaceEglCreatePbufferSurface = this.egl.eglCreatePbufferSurface(eGLDisplayEglGetCurrentDisplay, this.eglContextConfig, new int[]{12375, 1, 12374, 1, 12344});
                    if (!this.egl.eglMakeCurrent(eGLDisplayEglGetCurrentDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, this.eglContext)) {
                        throw new GLException(this.egl.eglGetError(), "Failed to make temporary EGL surface active: " + this.egl.eglGetError());
                    }
                }
                long jNativeGetCurrentNativeEGLContext = EglBase10Impl.nativeGetCurrentNativeEGLContext();
                if (eGLSurfaceEglCreatePbufferSurface != null) {
                    this.egl.eglMakeCurrent(eGLDisplayEglGetCurrentDisplay, eGLSurfaceEglGetCurrentSurface, eGLSurfaceEglGetCurrentSurface2, eGLContextEglGetCurrentContext);
                    this.egl.eglDestroySurface(eGLDisplayEglGetCurrentDisplay, eGLSurfaceEglCreatePbufferSurface);
                }
                return jNativeGetCurrentNativeEGLContext;
            } catch (Throwable th3) {
                if (0 != 0) {
                    this.egl.eglMakeCurrent(eGLDisplayEglGetCurrentDisplay, eGLSurfaceEglGetCurrentSurface, eGLSurfaceEglGetCurrentSurface2, eGLContextEglGetCurrentContext);
                    this.egl.eglDestroySurface(eGLDisplayEglGetCurrentDisplay, null);
                }
                throw th3;
            }
        }

        @Override // hms.webrtc.EglBase10.Context
        public EGLContext getRawContext() {
            return this.eglContext;
        }
    }

    public EglBase10Impl(EGLContext eGLContext, int[] iArr) {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.egl = egl10;
        EGLDisplay eglDisplay = getEglDisplay();
        this.eglDisplay = eglDisplay;
        this.eglConfig = getEglConfig(egl10, eglDisplay, iArr);
        int openGlesVersionFromConfig = EglBase.getOpenGlesVersionFromConfig(iArr);
        AbstractC17176i.m48509k(openGlesVersionFromConfig, "Using OpenGL ES version ", TAG);
        this.eglContext = createEglContext(eGLContext, this.eglDisplay, this.eglConfig, openGlesVersionFromConfig);
    }

    private void checkIsNotReleased() {
        if (this.eglDisplay == EGL10.EGL_NO_DISPLAY || this.eglContext == EGL10.EGL_NO_CONTEXT || this.eglConfig == null) {
            throw new RuntimeException("This object has been released");
        }
    }

    private EGLContext createEglContext(EGLContext eGLContext, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i13) {
        EGLContext eGLContextEglCreateContext;
        if (eGLContext != null && eGLContext == EGL10.EGL_NO_CONTEXT) {
            throw new RuntimeException("Invalid sharedContext");
        }
        int[] iArr = {EGL_CONTEXT_CLIENT_VERSION, i13, 12344};
        if (eGLContext == null) {
            eGLContext = EGL10.EGL_NO_CONTEXT;
        }
        synchronized (EglBase.lock) {
            eGLContextEglCreateContext = this.egl.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }
        if (eGLContextEglCreateContext != EGL10.EGL_NO_CONTEXT) {
            return eGLContextEglCreateContext;
        }
        throw new GLException(this.egl.eglGetError(), AbstractC11266d.m30461o("Failed to create EGL context: 0x", Integer.toHexString(this.egl.eglGetError())));
    }

    private void createSurfaceInternal(Object obj) {
        if (!(obj instanceof SurfaceHolder) && !(obj instanceof SurfaceTexture)) {
            throw new IllegalStateException("Input must be either a SurfaceHolder or SurfaceTexture");
        }
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            throw new RuntimeException("Already has an EGLSurface");
        }
        EGLSurface eGLSurfaceEglCreateWindowSurface = this.egl.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, obj, new int[]{12344});
        this.eglSurface = eGLSurfaceEglCreateWindowSurface;
        if (eGLSurfaceEglCreateWindowSurface == eGLSurface2) {
            throw new GLException(this.egl.eglGetError(), AbstractC11266d.m30461o("Failed to create window surface: 0x", Integer.toHexString(this.egl.eglGetError())));
        }
    }

    private static EGLConfig getEglConfig(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, 1, iArr2)) {
            throw new GLException(egl10.eglGetError(), AbstractC11266d.m30461o("eglChooseConfig failed: 0x", Integer.toHexString(egl10.eglGetError())));
        }
        if (iArr2[0] <= 0) {
            throw new RuntimeException("Unable to find any matching EGL config");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        if (eGLConfig != null) {
            return eGLConfig;
        }
        throw new RuntimeException("eglChooseConfig returned null");
    }

    private EGLDisplay getEglDisplay() {
        EGLDisplay eGLDisplayEglGetDisplay = this.egl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            throw new GLException(this.egl.eglGetError(), AbstractC11266d.m30461o("Unable to get EGL10 display: 0x", Integer.toHexString(this.egl.eglGetError())));
        }
        if (this.egl.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
            return eGLDisplayEglGetDisplay;
        }
        throw new GLException(this.egl.eglGetError(), AbstractC11266d.m30461o("Unable to initialize EGL10: 0x", Integer.toHexString(this.egl.eglGetError())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeGetCurrentNativeEGLContext();

    @Override // hms.webrtc.EglBase
    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    @Override // hms.webrtc.EglBase
    public void createPbufferSurface(int i13, int i14) {
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            throw new RuntimeException("Already has an EGLSurface");
        }
        EGLSurface eGLSurfaceEglCreatePbufferSurface = this.egl.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, new int[]{12375, i13, 12374, i14, 12344});
        this.eglSurface = eGLSurfaceEglCreatePbufferSurface;
        if (eGLSurfaceEglCreatePbufferSurface != eGLSurface2) {
            return;
        }
        int iEglGetError = this.egl.eglGetError();
        String hexString = Integer.toHexString(this.egl.eglGetError());
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "Failed to create pixel buffer surface with size ", "x", ": 0x");
        sbM30465s.append(hexString);
        throw new GLException(iEglGetError, sbM30465s.toString());
    }

    @Override // hms.webrtc.EglBase
    public void createSurface(Surface surface) {
        createSurfaceInternal(new SurfaceHolder(surface) { // from class: hms.webrtc.EglBase10Impl.1FakeSurfaceHolder
            private final Surface surface;

            {
                this.surface = surface;
            }

            @Override // android.view.SurfaceHolder
            public void addCallback(SurfaceHolder.Callback callback) {
            }

            @Override // android.view.SurfaceHolder
            public Surface getSurface() {
                return this.surface;
            }

            @Override // android.view.SurfaceHolder
            public Rect getSurfaceFrame() {
                return null;
            }

            @Override // android.view.SurfaceHolder
            public boolean isCreating() {
                return false;
            }

            @Override // android.view.SurfaceHolder
            public Canvas lockCanvas() {
                return null;
            }

            @Override // android.view.SurfaceHolder
            public void removeCallback(SurfaceHolder.Callback callback) {
            }

            @Override // android.view.SurfaceHolder
            public void setFixedSize(int i13, int i14) {
            }

            @Override // android.view.SurfaceHolder
            public void setFormat(int i13) {
            }

            @Override // android.view.SurfaceHolder
            public void setKeepScreenOn(boolean z4) {
            }

            @Override // android.view.SurfaceHolder
            public void setSizeFromLayout() {
            }

            @Override // android.view.SurfaceHolder
            @Deprecated
            public void setType(int i13) {
            }

            @Override // android.view.SurfaceHolder
            public void unlockCanvasAndPost(Canvas canvas) {
            }

            @Override // android.view.SurfaceHolder
            public Canvas lockCanvas(Rect rect) {
                return null;
            }
        });
    }

    @Override // hms.webrtc.EglBase
    public void detachCurrent() {
        synchronized (EglBase.lock) {
            try {
                EGL10 egl10 = this.egl;
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT)) {
                    throw new GLException(this.egl.eglGetError(), "eglDetachCurrent failed: 0x" + Integer.toHexString(this.egl.eglGetError()));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // hms.webrtc.EglBase
    public EglBase.Context getEglBaseContext() {
        return new Context(this.egl, this.eglContext, this.eglConfig);
    }

    @Override // hms.webrtc.EglBase
    public boolean hasSurface() {
        return this.eglSurface != EGL10.EGL_NO_SURFACE;
    }

    @Override // hms.webrtc.EglBase
    public void makeCurrent() {
        checkIsNotReleased();
        if (this.eglSurface == EGL10.EGL_NO_SURFACE) {
            throw new RuntimeException("No EGLSurface - can't make current");
        }
        synchronized (EglBase.lock) {
            try {
                EGL10 egl10 = this.egl;
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = this.eglSurface;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                    throw new GLException(this.egl.eglGetError(), "eglMakeCurrent failed: 0x" + Integer.toHexString(this.egl.eglGetError()));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // hms.webrtc.EglBase
    public void release() {
        checkIsNotReleased();
        releaseSurface();
        detachCurrent();
        this.egl.eglDestroyContext(this.eglDisplay, this.eglContext);
        this.egl.eglTerminate(this.eglDisplay);
        this.eglContext = EGL10.EGL_NO_CONTEXT;
        this.eglDisplay = EGL10.EGL_NO_DISPLAY;
        this.eglConfig = null;
    }

    @Override // hms.webrtc.EglBase
    public void releaseSurface() {
        EGLSurface eGLSurface = this.eglSurface;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            this.egl.eglDestroySurface(this.eglDisplay, eGLSurface);
            this.eglSurface = eGLSurface2;
        }
    }

    @Override // hms.webrtc.EglBase
    public int surfaceHeight() {
        int[] iArr = new int[1];
        this.egl.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr);
        return iArr[0];
    }

    @Override // hms.webrtc.EglBase
    public int surfaceWidth() {
        int[] iArr = new int[1];
        this.egl.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, iArr);
        return iArr[0];
    }

    @Override // hms.webrtc.EglBase
    public void swapBuffers() {
        checkIsNotReleased();
        if (this.eglSurface == EGL10.EGL_NO_SURFACE) {
            throw new RuntimeException("No EGLSurface - can't swap buffers");
        }
        synchronized (EglBase.lock) {
            this.egl.eglSwapBuffers(this.eglDisplay, this.eglSurface);
        }
    }

    @Override // hms.webrtc.EglBase
    public void createSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture);
    }

    @Override // hms.webrtc.EglBase
    public void swapBuffers(long j7) {
        swapBuffers();
    }
}
