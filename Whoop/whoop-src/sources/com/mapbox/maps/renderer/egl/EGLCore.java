package com.mapbox.maps.renderer.egl;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import androidx.core.app.NotificationCompat;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.renderer.RendererError;
import com.mapbox.maps.renderer.RendererSetupErrorListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import l83.C23454a0;
import p000.AbstractC11266d;
import p009a8.RunnableC0533c;
import p108e4.AbstractC12682p;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 T2\u00020\u0001:\u0001TB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u001d\u0010&\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0002¢\u0006\u0004\b(\u0010\u0017J\u0015\u0010)\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b+\u0010,J\u0017\u00101\u001a\u00020\u00132\u0006\u0010.\u001a\u00020-H\u0000¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u00132\u0006\u0010.\u001a\u00020-H\u0000¢\u0006\u0004\b2\u00100J\u000f\u00105\u001a\u00020\u0013H\u0000¢\u0006\u0004\b4\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00108R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010@\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u00108\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010E\u001a\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00110L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020-0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010R\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bR\u00109\u0012\u0004\bS\u0010\u001b¨\u0006U"}, m65681d2 = {"Lcom/mapbox/maps/renderer/egl/EGLCore;", "", "", "translucentSurface", "", "antialiasingSampleCount", "Landroid/opengl/EGLContext;", "sharedContext", "", "mapName", "<init>", "(ZILandroid/opengl/EGLContext;Ljava/lang/String;)V", "functionName", "checkEglErrorAndNotify", "(Ljava/lang/String;)Ljava/lang/Integer;", NotificationCompat.CATEGORY_MESSAGE, "checkEglError", "Lcom/mapbox/maps/renderer/RendererError;", "error", "Ll83/a0;", "notifyListeners", "(Lcom/mapbox/maps/renderer/RendererError;)V", "prepareEgl", "()Z", "queryContextVersion", "()I", "release", "()V", "Landroid/opengl/EGLSurface;", "eglSurface", "releaseSurface", "(Landroid/opengl/EGLSurface;)V", "Landroid/view/Surface;", "surface", "createWindowSurface", "(Landroid/view/Surface;)Landroid/opengl/EGLSurface;", "width", "height", "createOffscreenSurface", "(II)Landroid/opengl/EGLSurface;", "makeNothingCurrent", "makeCurrent", "(Landroid/opengl/EGLSurface;)Z", "swapBuffers", "(Landroid/opengl/EGLSurface;)I", "Lcom/mapbox/maps/renderer/RendererSetupErrorListener;", "listener", "addRendererStateListener$maps_sdk_release", "(Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V", "addRendererStateListener", "removeRendererStateListener$maps_sdk_release", "removeRendererStateListener", "clearRendererStateListeners$maps_sdk_release", "clearRendererStateListeners", "Z", "I", "Landroid/opengl/EGLContext;", "Ljava/lang/String;", "Landroid/opengl/EGLConfig;", "eglConfig", "Landroid/opengl/EGLConfig;", "Landroid/opengl/EGLDisplay;", "eglDisplay", "Landroid/opengl/EGLDisplay;", "eglContext", "getEglContext$maps_sdk_release", "()Landroid/opengl/EGLContext;", "setEglContext$maps_sdk_release", "(Landroid/opengl/EGLContext;)V", "eglNoSurface", "Landroid/opengl/EGLSurface;", "getEglNoSurface$maps_sdk_release", "()Landroid/opengl/EGLSurface;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "Ljava/util/LinkedList;", "accumulatedRendererErrorList", "Ljava/util/LinkedList;", "Ljava/util/HashSet;", "rendererSetupErrorListenerSet", "Ljava/util/HashSet;", "TAG", "getTAG$annotations", "Companion", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class EGLCore {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final int[] attribsEgl3 = {12440, 3, 12344};
    private final String TAG;
    private final LinkedList<RendererError> accumulatedRendererErrorList;
    private final int antialiasingSampleCount;
    private EGLConfig eglConfig;
    private EGLContext eglContext;
    private EGLDisplay eglDisplay;
    private final EGLSurface eglNoSurface;
    private final Handler mainHandler;
    private final String mapName;
    private final HashSet<RendererSetupErrorListener> rendererSetupErrorListenerSet;
    private final EGLContext sharedContext;
    private final boolean translucentSurface;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m65681d2 = {"Lcom/mapbox/maps/renderer/egl/EGLCore$Companion;", "", "()V", "attribsEgl3", "", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public EGLCore(boolean z4, int i13, EGLContext sharedContext, String mapName) {
        AbstractC22676k.m65750j(sharedContext, "sharedContext");
        AbstractC22676k.m65750j(mapName, "mapName");
        this.translucentSurface = z4;
        this.antialiasingSampleCount = i13;
        this.sharedContext = sharedContext;
        this.mapName = mapName;
        EGLDisplay EGL_NO_DISPLAY = EGL14.EGL_NO_DISPLAY;
        AbstractC22676k.m65749i(EGL_NO_DISPLAY, "EGL_NO_DISPLAY");
        this.eglDisplay = EGL_NO_DISPLAY;
        EGLContext EGL_NO_CONTEXT = EGL14.EGL_NO_CONTEXT;
        AbstractC22676k.m65749i(EGL_NO_CONTEXT, "EGL_NO_CONTEXT");
        this.eglContext = EGL_NO_CONTEXT;
        EGLSurface EGL_NO_SURFACE = EGL14.EGL_NO_SURFACE;
        AbstractC22676k.m65749i(EGL_NO_SURFACE, "EGL_NO_SURFACE");
        this.eglNoSurface = EGL_NO_SURFACE;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.accumulatedRendererErrorList = new LinkedList<>();
        this.rendererSetupErrorListenerSet = new HashSet<>();
        StringBuilder sb4 = new StringBuilder("Mbgl-EglCore");
        sb4.append(!AbstractC39414r.m125890i0(mapName) ? AbstractC11266d.m30461o("\\", mapName) : "");
        this.TAG = sb4.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addRendererStateListener$lambda$3(LinkedList immutableCopy, RendererSetupErrorListener listener) {
        AbstractC22676k.m65750j(immutableCopy, "$immutableCopy");
        AbstractC22676k.m65750j(listener, "$listener");
        Iterator it = immutableCopy.iterator();
        while (it.hasNext()) {
            RendererError error = (RendererError) it.next();
            AbstractC22676k.m65749i(error, "error");
            listener.onError(error);
        }
    }

    private final Integer checkEglError(String msg) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return null;
        }
        String str = this.TAG;
        StringBuilder sbM35484d = AbstractC12682p.m35484d(msg, ": EGL error: 0x");
        sbM35484d.append(Integer.toHexString(iEglGetError));
        MapboxLogger.logE(str, sbM35484d.toString());
        return Integer.valueOf(iEglGetError);
    }

    private final Integer checkEglErrorAndNotify(String functionName) {
        Integer numCheckEglError = checkEglError(functionName);
        if (numCheckEglError != null) {
            RendererError rendererError = numCheckEglError.intValue() == 12291 ? RendererError.OUT_OF_MEMORY : new RendererError(numCheckEglError.intValue());
            MapboxLogger.logE(this.TAG, "EGL error " + rendererError.getEglErrorCode() + " occurred for " + functionName + '!');
            notifyListeners(rendererError);
        }
        return numCheckEglError;
    }

    private static /* synthetic */ void getTAG$annotations() {
    }

    private final void notifyListeners(RendererError error) {
        this.accumulatedRendererErrorList.add(error);
        if (this.rendererSetupErrorListenerSet.isEmpty()) {
            return;
        }
        this.mainHandler.post(new RunnableC0533c(14, new HashSet(this.rendererSetupErrorListenerSet), error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyListeners$lambda$5(HashSet immutableCopy, RendererError error) {
        AbstractC22676k.m65750j(immutableCopy, "$immutableCopy");
        AbstractC22676k.m65750j(error, "$error");
        Iterator it = immutableCopy.iterator();
        while (it.hasNext()) {
            ((RendererSetupErrorListener) it.next()).onError(error);
        }
    }

    public final void addRendererStateListener$maps_sdk_release(RendererSetupErrorListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.rendererSetupErrorListenerSet.add(listener);
        if (this.accumulatedRendererErrorList.isEmpty()) {
            return;
        }
        this.mainHandler.post(new RunnableC0533c(15, new LinkedList(this.accumulatedRendererErrorList), listener));
    }

    public final void clearRendererStateListeners$maps_sdk_release() {
        this.accumulatedRendererErrorList.clear();
        this.rendererSetupErrorListenerSet.clear();
    }

    public final EGLSurface createOffscreenSurface(int width, int height) {
        int[] iArr = {12375, width, 12374, height, 12344};
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLConfig eGLConfig = this.eglConfig;
        if (eGLConfig == null) {
            AbstractC22676k.m65757q("eglConfig");
            throw null;
        }
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
        if (checkEglErrorAndNotify("eglCreatePbufferSurface") != null || eGLSurfaceEglCreatePbufferSurface == null) {
            return this.eglNoSurface;
        }
        MapboxLogger.logI(this.TAG, "Created PBuffer, w = " + width + ", h = " + height);
        return eGLSurfaceEglCreatePbufferSurface;
    }

    public final EGLSurface createWindowSurface(Surface surface) {
        AbstractC22676k.m65750j(surface, "surface");
        try {
            int[] iArr = {12344};
            EGLDisplay eGLDisplay = this.eglDisplay;
            EGLConfig eGLConfig = this.eglConfig;
            if (eGLConfig == null) {
                AbstractC22676k.m65757q("eglConfig");
                throw null;
            }
            EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
            if (checkEglErrorAndNotify("eglCreateWindowSurface") == null && eGLSurfaceEglCreateWindowSurface != null) {
                return eGLSurfaceEglCreateWindowSurface;
            }
            return this.eglNoSurface;
        } catch (Exception e5) {
            MapboxLogger.logE(this.TAG, "eglCreateWindowSurface has thrown an exception:\n" + e5.getLocalizedMessage());
            return this.eglNoSurface;
        }
    }

    /* JADX INFO: renamed from: getEglContext$maps_sdk_release, reason: from getter */
    public final EGLContext getEglContext() {
        return this.eglContext;
    }

    /* JADX INFO: renamed from: getEglNoSurface$maps_sdk_release, reason: from getter */
    public final EGLSurface getEglNoSurface() {
        return this.eglNoSurface;
    }

    public final boolean makeCurrent(EGLSurface eglSurface) {
        AbstractC22676k.m65750j(eglSurface, "eglSurface");
        if (AbstractC22676k.m65745e(EGL14.eglGetCurrentContext(), this.eglContext)) {
            return true;
        }
        if (AbstractC22676k.m65745e(this.eglDisplay, EGL14.EGL_NO_DISPLAY)) {
            MapboxLogger.logI(this.TAG, "NOTE: makeCurrent but eglDisplay is EGL_NO_DISPLAY");
        }
        if (EGL14.eglMakeCurrent(this.eglDisplay, eglSurface, eglSurface, this.eglContext)) {
            return true;
        }
        checkEglErrorAndNotify("eglMakeCurrent");
        return false;
    }

    public final boolean makeNothingCurrent() {
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
            return true;
        }
        checkEglErrorAndNotify("makeNothingCurrent");
        return false;
    }

    public final boolean prepareEgl() {
        C23454a0 c23454a0;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        AbstractC22676k.m65749i(eGLDisplayEglGetDisplay, "eglGetDisplay(EGL14.EGL_DEFAULT_DISPLAY)");
        this.eglDisplay = eGLDisplayEglGetDisplay;
        if (AbstractC22676k.m65745e(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            MapboxLogger.logW(this.TAG, "Unable to get default display, eglInitialize will most likely fail shortly.");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.eglDisplay, iArr, 0, iArr, 1)) {
            checkEglErrorAndNotify("eglInitialize");
            return false;
        }
        EGLConfig eGLConfigChooseConfig = new EGLConfigChooser(this.translucentSurface, this.antialiasingSampleCount, this.mapName).chooseConfig(this.eglDisplay);
        if (eGLConfigChooseConfig != null) {
            this.eglConfig = eGLConfigChooseConfig;
            c23454a0 = C23454a0.f92919a;
        } else {
            c23454a0 = null;
        }
        if (c23454a0 == null) {
            notifyListeners(RendererError.NO_VALID_EGL_CONFIG_FOUND);
            return false;
        }
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLConfig eGLConfig = this.eglConfig;
        if (eGLConfig == null) {
            AbstractC22676k.m65757q("eglConfig");
            throw null;
        }
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, this.sharedContext, attribsEgl3, 0);
        if (checkEglError("eglCreateContext") != null) {
            throw new IllegalStateException("OpenGL ES 3.0 context could not be created");
        }
        AbstractC22676k.m65749i(eGLContextEglCreateContext, "{\n      contextEgl3\n    }");
        this.eglContext = eGLContextEglCreateContext;
        int iQueryContextVersion = queryContextVersion();
        MapboxLogger.logI(this.TAG, "EGLContext created, client version " + iQueryContextVersion);
        return true;
    }

    public final int queryContextVersion() {
        int[] iArr = new int[1];
        if (!EGL14.eglQueryContext(this.eglDisplay, this.eglContext, 12440, iArr, 0)) {
            checkEglErrorAndNotify("eglQueryContext");
        }
        return iArr[0];
    }

    public final void release() {
        if (!AbstractC22676k.m65745e(this.eglDisplay, EGL14.EGL_NO_DISPLAY)) {
            makeNothingCurrent();
            EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
            EGL14.eglTerminate(this.eglDisplay);
        }
        EGLDisplay EGL_NO_DISPLAY = EGL14.EGL_NO_DISPLAY;
        AbstractC22676k.m65749i(EGL_NO_DISPLAY, "EGL_NO_DISPLAY");
        this.eglDisplay = EGL_NO_DISPLAY;
        EGLContext EGL_NO_CONTEXT = EGL14.EGL_NO_CONTEXT;
        AbstractC22676k.m65749i(EGL_NO_CONTEXT, "EGL_NO_CONTEXT");
        this.eglContext = EGL_NO_CONTEXT;
    }

    public final void releaseSurface(EGLSurface eglSurface) {
        AbstractC22676k.m65750j(eglSurface, "eglSurface");
        if (eglSurface.equals(EGL14.EGL_NO_SURFACE) || AbstractC22676k.m65745e(this.eglDisplay, EGL14.EGL_NO_DISPLAY)) {
            MapboxLogger.logI(this.TAG, "EGL surface was already destroyed before.");
        } else {
            EGL14.eglDestroySurface(this.eglDisplay, eglSurface);
            MapboxLogger.logI(this.TAG, "EGL surface was destroyed.");
        }
    }

    public final void removeRendererStateListener$maps_sdk_release(RendererSetupErrorListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.rendererSetupErrorListenerSet.remove(listener);
    }

    public final void setEglContext$maps_sdk_release(EGLContext eGLContext) {
        AbstractC22676k.m65750j(eGLContext, "<set-?>");
        this.eglContext = eGLContext;
    }

    public final int swapBuffers(EGLSurface eglSurface) {
        AbstractC22676k.m65750j(eglSurface, "eglSurface");
        if (EGL14.eglSwapBuffers(this.eglDisplay, eglSurface)) {
            return 12288;
        }
        return EGL14.eglGetError();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EGLCore(boolean z4, int i13, EGLContext EGL_NO_CONTEXT, String str, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i14 & 4) != 0) {
            EGL_NO_CONTEXT = EGL14.EGL_NO_CONTEXT;
            AbstractC22676k.m65749i(EGL_NO_CONTEXT, "EGL_NO_CONTEXT");
        }
        this(z4, i13, EGL_NO_CONTEXT, str);
    }
}
