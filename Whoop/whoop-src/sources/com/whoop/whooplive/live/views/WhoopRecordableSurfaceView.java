package com.whoop.whooplive.live.views;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaRecorder;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import e50.C12723b;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p319m4.AbstractC25012a;
import qr2.AbstractC30556a;
import tr2.C34117o;
import vz2.AbstractC36615a;

/* JADX INFO: loaded from: classes11.dex */
public class WhoopRecordableSurfaceView extends SurfaceView {

    /* JADX INFO: renamed from: O */
    public static int f33402O = 0;

    /* JADX INFO: renamed from: P */
    public static int f33403P = 1;

    /* JADX INFO: renamed from: E */
    private boolean f33404E;

    /* JADX INFO: renamed from: F */
    protected MediaRecorder f33405F;

    /* JADX INFO: renamed from: G */
    private SurfaceHolderCallback2C10865a f33406G;

    /* JADX INFO: renamed from: H */
    private AtomicBoolean f33407H;

    /* JADX INFO: renamed from: I */
    private AtomicBoolean f33408I;

    /* JADX INFO: renamed from: J */
    private WeakReference<InterfaceC10866b> f33409J;

    /* JADX INFO: renamed from: K */
    private AtomicBoolean f33410K;

    /* JADX INFO: renamed from: L */
    private AtomicBoolean f33411L;

    /* JADX INFO: renamed from: M */
    private C34117o f33412M;

    /* JADX INFO: renamed from: N */
    private boolean f33413N;

    /* JADX INFO: renamed from: w */
    protected Surface f33414w;

    /* JADX INFO: renamed from: x */
    private AtomicInteger f33415x;

    /* JADX INFO: renamed from: y */
    private int f33416y;

    /* JADX INFO: renamed from: z */
    private int f33417z;

    /* JADX INFO: renamed from: com.whoop.whooplive.live.views.WhoopRecordableSurfaceView$a */
    public class SurfaceHolderCallback2C10865a extends Thread implements SurfaceHolder.Callback2 {

        /* JADX INFO: renamed from: E */
        LinkedList<Runnable> f33418E = new LinkedList<>();

        /* JADX INFO: renamed from: F */
        int[] f33419F = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12325, 16, 12344};

        /* JADX INFO: renamed from: G */
        private AtomicBoolean f33420G = new AtomicBoolean(false);

        /* JADX INFO: renamed from: w */
        EGLDisplay f33422w;

        /* JADX INFO: renamed from: x */
        EGLContext f33423x;

        /* JADX INFO: renamed from: y */
        EGLSurface f33424y;

        /* JADX INFO: renamed from: z */
        EGLSurface f33425z;

        public SurfaceHolderCallback2C10865a() {
            this.f33419F[10] = 12610;
        }

        /* JADX INFO: renamed from: a */
        public EGLConfig m28678a(EGLDisplay eGLDisplay) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            EGL14.eglChooseConfig(eGLDisplay, this.f33419F, 0, eGLConfigArr, 0, 1, new int[]{0}, 0);
            return eGLConfigArr[0];
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean z4;
            if (WhoopRecordableSurfaceView.this.f33408I.get()) {
                return;
            }
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            this.f33422w = eGLDisplayEglGetDisplay;
            int[] iArr = new int[2];
            EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1);
            EGLConfig eGLConfigM28678a = m28678a(this.f33422w);
            this.f33423x = EGL14.eglCreateContext(this.f33422w, eGLConfigM28678a, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
            int[] iArr2 = {12344};
            EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f33422w, eGLConfigM28678a, WhoopRecordableSurfaceView.this, iArr2, 0);
            this.f33424y = eGLSurfaceEglCreateWindowSurface;
            EGL14.eglMakeCurrent(this.f33422w, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.f33423x);
            if (WhoopRecordableSurfaceView.this.f33409J != null && WhoopRecordableSurfaceView.this.f33409J.get() != null) {
                ((InterfaceC10866b) WhoopRecordableSurfaceView.this.f33409J.get()).mo28679a();
            }
            this.f33425z = EGL14.eglCreateWindowSurface(this.f33422w, eGLConfigM28678a, WhoopRecordableSurfaceView.this.f33414w, iArr2, 0);
            GLES20.glClearColor(0.1f, 0.1f, 0.1f, 1.0f);
            WhoopRecordableSurfaceView.this.f33408I.set(true);
            if (WhoopRecordableSurfaceView.this.f33409J != null && WhoopRecordableSurfaceView.this.f33409J.get() != null) {
                ((InterfaceC10866b) WhoopRecordableSurfaceView.this.f33409J.get()).mo28680b();
            }
            this.f33420G.set(true);
            while (this.f33420G.get()) {
                if (!WhoopRecordableSurfaceView.this.f33404E) {
                    if (WhoopRecordableSurfaceView.this.f33415x.get() != WhoopRecordableSurfaceView.f33402O) {
                        z4 = true;
                    } else if (WhoopRecordableSurfaceView.this.f33411L.get()) {
                        WhoopRecordableSurfaceView.this.f33411L.set(false);
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (WhoopRecordableSurfaceView.this.f33410K.get()) {
                        GLES20.glViewport(0, 0, WhoopRecordableSurfaceView.this.f33416y, WhoopRecordableSurfaceView.this.f33417z);
                        if (WhoopRecordableSurfaceView.this.f33409J != null && WhoopRecordableSurfaceView.this.f33409J.get() != null) {
                            ((InterfaceC10866b) WhoopRecordableSurfaceView.this.f33409J.get()).onSurfaceChanged(WhoopRecordableSurfaceView.this.f33416y, WhoopRecordableSurfaceView.this.f33417z);
                        }
                        WhoopRecordableSurfaceView.this.f33410K.set(false);
                    }
                    if (z4) {
                        if (WhoopRecordableSurfaceView.this.f33409J != null && WhoopRecordableSurfaceView.this.f33409J.get() != null) {
                            ((InterfaceC10866b) WhoopRecordableSurfaceView.this.f33409J.get()).mo28681c();
                        }
                        if (WhoopRecordableSurfaceView.this.f33409J != null && WhoopRecordableSurfaceView.this.f33409J.get() != null) {
                            ((InterfaceC10866b) WhoopRecordableSurfaceView.this.f33409J.get()).mo28683e();
                        }
                        EGL14.eglSwapBuffers(this.f33422w, this.f33424y);
                        if (WhoopRecordableSurfaceView.this.f33407H.get()) {
                            EGLDisplay eGLDisplay = this.f33422w;
                            EGLSurface eGLSurface = this.f33425z;
                            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f33423x);
                            if (WhoopRecordableSurfaceView.this.f33409J != null && WhoopRecordableSurfaceView.this.f33409J.get() != null) {
                                ((InterfaceC10866b) WhoopRecordableSurfaceView.this.f33409J.get()).mo28683e();
                            }
                            EGL14.eglSwapBuffers(this.f33422w, this.f33425z);
                            EGLDisplay eGLDisplay2 = this.f33422w;
                            EGLSurface eGLSurface2 = this.f33424y;
                            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.f33423x);
                        }
                    }
                    while (this.f33418E.size() > 0) {
                        this.f33418E.remove().run();
                    }
                }
                try {
                    Thread.sleep(16L);
                } catch (InterruptedException unused) {
                    if (WhoopRecordableSurfaceView.this.f33409J != null && WhoopRecordableSurfaceView.this.f33409J.get() != null) {
                        ((InterfaceC10866b) WhoopRecordableSurfaceView.this.f33409J.get()).mo28682d();
                    }
                    EGLDisplay eGLDisplay3 = this.f33422w;
                    if (eGLDisplay3 != null) {
                        EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplay3, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
                        EGLSurface eGLSurface4 = this.f33424y;
                        if (eGLSurface4 != null) {
                            EGL14.eglDestroySurface(this.f33422w, eGLSurface4);
                        }
                        EGLSurface eGLSurface5 = this.f33425z;
                        if (eGLSurface5 != null) {
                            EGL14.eglDestroySurface(this.f33422w, eGLSurface5);
                        }
                        EGL14.eglDestroyContext(this.f33422w, this.f33423x);
                        WhoopRecordableSurfaceView.this.f33408I.set(false);
                        EGL14.eglReleaseThread();
                        EGL14.eglTerminate(this.f33422w);
                        WhoopRecordableSurfaceView.this.f33414w.release();
                        return;
                    }
                    return;
                }
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i13, int i14, int i15) {
            if (i14 == WhoopRecordableSurfaceView.this.f33416y && i15 == WhoopRecordableSurfaceView.this.f33417z) {
                return;
            }
            int iM117627b = AbstractC36615a.m117627b(i15);
            int iM117626a = AbstractC36615a.m117626a(i14);
            WhoopRecordableSurfaceView.this.f33416y = i14;
            WhoopRecordableSurfaceView.this.f33417z = i15;
            if (iM117627b > WhoopRecordableSurfaceView.this.f33416y) {
                WhoopRecordableSurfaceView.this.f33416y = iM117627b;
            }
            if (iM117626a > WhoopRecordableSurfaceView.this.f33417z) {
                WhoopRecordableSurfaceView.this.f33417z = iM117626a;
            }
            WhoopRecordableSurfaceView.this.f33410K.set(true);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (isAlive() || isInterrupted() || getState() == Thread.State.TERMINATED) {
                return;
            }
            start();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            this.f33420G.set(false);
            interrupt();
            WhoopRecordableSurfaceView.this.getHolder().removeCallback(this);
        }

        @Override // android.view.SurfaceHolder.Callback2
        public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplive.live.views.WhoopRecordableSurfaceView$b */
    public interface InterfaceC10866b {
        /* JADX INFO: renamed from: a */
        void mo28679a();

        /* JADX INFO: renamed from: b */
        void mo28680b();

        /* JADX INFO: renamed from: c */
        void mo28681c();

        /* JADX INFO: renamed from: d */
        void mo28682d();

        /* JADX INFO: renamed from: e */
        void mo28683e();

        void onSurfaceChanged(int i13, int i14);
    }

    public WhoopRecordableSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33415x = new AtomicInteger(f33403P);
        this.f33416y = 0;
        this.f33417z = 0;
        this.f33404E = false;
        this.f33407H = new AtomicBoolean(false);
        this.f33408I = new AtomicBoolean(false);
        this.f33410K = new AtomicBoolean(false);
        this.f33411L = new AtomicBoolean(false);
    }

    public int getRenderMode() {
        return this.f33415x.get();
    }

    public InterfaceC10866b getRendererCallbacks() {
        WeakReference<InterfaceC10866b> weakReference = this.f33409J;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public void m28669l() {
        if (!this.f33408I.get()) {
            this.f33414w = MediaCodec.createPersistentInputSurface();
            this.f33406G = new SurfaceHolderCallback2C10865a();
        }
        getHolder().addCallback(this.f33406G);
        if (getHolder().getSurface().isValid()) {
            this.f33406G.surfaceCreated(null);
        }
        this.f33404E = true;
    }

    /* JADX INFO: renamed from: m */
    public void m28670m(File file, int i13, int i14, int i15, MediaRecorder.OnErrorListener onErrorListener, MediaRecorder.OnInfoListener onInfoListener) {
        MediaRecorder mediaRecorder = new MediaRecorder();
        mediaRecorder.setOnInfoListener(onInfoListener);
        mediaRecorder.setOnErrorListener(onErrorListener);
        mediaRecorder.setVideoSource(2);
        mediaRecorder.setInputSurface(this.f33414w);
        mediaRecorder.setAudioSource(1);
        mediaRecorder.setOutputFormat(2);
        mediaRecorder.setAudioEncoder(3);
        mediaRecorder.setAudioSamplingRate(44100);
        mediaRecorder.setAudioEncodingBitRate(96000);
        if (i13 > i14) {
            i13 = 1920;
            i14 = 1080;
        }
        mediaRecorder.setVideoSize(i13, i14);
        this.f33412M.mo85216g(AbstractC25012a.m73372e(i13, i14, "Setting up displayWidth: ", " and diplayHeight: ", " to media recorder"), new AbstractC30556a.a[0]);
        mediaRecorder.setVideoEncoder(0);
        mediaRecorder.setVideoEncodingBitRate(7500000);
        mediaRecorder.setVideoFrameRate(30);
        mediaRecorder.setOrientationHint(i15);
        mediaRecorder.setOutputFile(file.getPath());
        mediaRecorder.setPreviewDisplay(this.f33414w);
        try {
            mediaRecorder.prepare();
        } catch (IOException e5) {
            this.f33412M.mo85222m("IO Exception on Media Recorder init method: " + e5.getLocalizedMessage(), new AbstractC30556a.a[0]);
        }
        this.f33405F = mediaRecorder;
    }

    /* JADX INFO: renamed from: n */
    public void m28671n(File file, int i13, int i14, MediaRecorder.OnErrorListener onErrorListener, MediaRecorder.OnInfoListener onInfoListener) throws IOException {
        this.f33412M = new C34117o(C12723b.m35566a().m35569d(), "WhoopRecordableSurfaceView");
        m28670m(file, i13, i14, 0, onErrorListener, onInfoListener);
    }

    /* JADX INFO: renamed from: o */
    public boolean m28672o() {
        return this.f33413N;
    }

    /* JADX INFO: renamed from: p */
    public void m28673p() {
        this.f33404E = true;
    }

    /* JADX INFO: renamed from: q */
    public void m28674q() {
        m28669l();
        this.f33404E = false;
    }

    /* JADX INFO: renamed from: r */
    public boolean m28675r() {
        MediaRecorder mediaRecorder = this.f33405F;
        if (mediaRecorder == null) {
            return false;
        }
        try {
            mediaRecorder.start();
            this.f33407H.set(true);
            this.f33413N = true;
            return true;
        } catch (IllegalStateException unused) {
            this.f33407H.set(false);
            this.f33405F.reset();
            this.f33405F.release();
            return false;
        }
    }

    /* JADX INFO: renamed from: s */
    public void m28676s() {
        MediaRecorder mediaRecorder;
        this.f33404E = true;
        SurfaceHolderCallback2C10865a surfaceHolderCallback2C10865a = this.f33406G;
        if (surfaceHolderCallback2C10865a != null) {
            surfaceHolderCallback2C10865a.interrupt();
        }
        if (this.f33407H.get() && (mediaRecorder = this.f33405F) != null) {
            try {
                mediaRecorder.stop();
            } catch (IllegalStateException unused) {
            }
        }
        MediaRecorder mediaRecorder2 = this.f33405F;
        if (mediaRecorder2 != null) {
            mediaRecorder2.release();
        }
    }

    public void setRenderMode(int i13) {
        this.f33415x.set(i13);
    }

    public void setRendererCallbacks(InterfaceC10866b interfaceC10866b) {
        this.f33409J = new WeakReference<>(interfaceC10866b);
    }

    /* JADX INFO: renamed from: t */
    public boolean m28677t() throws IllegalStateException {
        if (!this.f33407H.get()) {
            this.f33412M.mo85222m("Cannot stop. Is not recording.", new AbstractC30556a.a[0]);
            throw new IllegalStateException("Cannot stop. Is not recording.");
        }
        this.f33413N = false;
        try {
            this.f33405F.stop();
            this.f33407H.set(false);
            return true;
        } catch (RuntimeException unused) {
            return false;
        } finally {
            this.f33405F.release();
        }
    }
}
