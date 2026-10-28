package com.mapbox.maps.renderer;

import android.opengl.EGLContext;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.renderer.egl.EGLCore;
import com.mapbox.maps.renderer.widget.Widget;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\nJ\r\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\nJ\r\u0010 \u001a\u00020\b¢\u0006\u0004\b \u0010\nJ\u0015\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\b¢\u0006\u0004\b'\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010.R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020!078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010(R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010(R\u001a\u0010:\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\f\n\u0004\b:\u0010)\u0012\u0004\b;\u0010\nR\u0011\u0010=\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b<\u0010\u0013¨\u0006>"}, m65681d2 = {"Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;", "", "", "antialiasingSampleCount", "", "mapName", "<init>", "(ILjava/lang/String;)V", "Ll83/a0;", "prepareFrameBufferWithTexture", "()V", "", "resizing", "releaseAll", "(Z)V", "deleteFrameBufferWithTexture", "checkSizeChanged", "checkEgl", "hasWidgets", "()Z", "hasTexture", "getTexture", "()I", "Landroid/opengl/EGLContext;", "sharedContext", "setSharedContext", "(Landroid/opengl/EGLContext;)V", "width", "height", "onSurfaceChanged", "(II)V", "release", "renderToFrameBuffer", "Lcom/mapbox/maps/renderer/widget/Widget;", "widget", "addWidget", "(Lcom/mapbox/maps/renderer/widget/Widget;)V", "removeWidget", "(Lcom/mapbox/maps/renderer/widget/Widget;)Z", "cleanUpAllWidgets", "I", "Ljava/lang/String;", "Lcom/mapbox/maps/renderer/egl/EGLCore;", "eglCore", "Lcom/mapbox/maps/renderer/egl/EGLCore;", "eglContextCreated", "Z", "Landroid/opengl/EGLSurface;", "eglSurface", "Landroid/opengl/EGLSurface;", "sizeChanged", "", "textures", "[I", "framebuffers", "Ljava/util/concurrent/CopyOnWriteArraySet;", "widgets", "Ljava/util/concurrent/CopyOnWriteArraySet;", "TAG", "getTAG$annotations", "getNeedRender", "needRender", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class MapboxWidgetRenderer {
    private final String TAG;
    private final int antialiasingSampleCount;
    private boolean eglContextCreated;
    private EGLCore eglCore;
    private EGLSurface eglSurface;
    private final int[] framebuffers;
    private int height;
    private final String mapName;
    private boolean sizeChanged;
    private final int[] textures;
    private final CopyOnWriteArraySet<Widget> widgets;
    private int width;

    public MapboxWidgetRenderer(int i13, String mapName) {
        AbstractC22676k.m65750j(mapName, "mapName");
        this.antialiasingSampleCount = i13;
        this.mapName = mapName;
        this.textures = new int[]{0};
        this.framebuffers = new int[]{0};
        this.widgets = new CopyOnWriteArraySet<>();
        StringBuilder sb4 = new StringBuilder("MapboxWidgetRenderer");
        sb4.append(!AbstractC39414r.m125890i0(mapName) ? AbstractC11266d.m30461o("\\", mapName) : "");
        this.TAG = sb4.toString();
    }

    private final void checkEgl() {
        EGLSurface eGLSurface = this.eglSurface;
        EGLCore eGLCore = this.eglCore;
        if (eGLCore == null) {
            MapboxLogger.logE(this.TAG, "Cannot prepare egl, eglCore has not been initialized yet.");
            return;
        }
        if (eGLSurface == null || eGLSurface.equals(eGLCore.getEglNoSurface())) {
            if (!this.eglContextCreated) {
                boolean zPrepareEgl = eGLCore.prepareEgl();
                this.eglContextCreated = zPrepareEgl;
                if (!zPrepareEgl) {
                    MapboxLogger.logE(this.TAG, "Widget EGL was not configured, please check logs above.");
                    return;
                }
            }
            if (eGLSurface == null || eGLSurface.equals(eGLCore.getEglNoSurface())) {
                EGLSurface eGLSurfaceCreateOffscreenSurface = eGLCore.createOffscreenSurface(this.width, this.height);
                this.eglSurface = eGLSurfaceCreateOffscreenSurface;
                if (AbstractC22676k.m65745e(eGLSurfaceCreateOffscreenSurface, eGLCore.getEglNoSurface())) {
                    MapboxLogger.logE(this.TAG, "Widget offscreen surface was not configured, please check logs above.");
                }
            }
        }
    }

    private final void checkSizeChanged() {
        if (this.sizeChanged) {
            EGLCore eGLCore = this.eglCore;
            EGLSurface eGLSurface = this.eglSurface;
            if (eGLCore != null && eGLSurface != null && !eGLSurface.equals(eGLCore.getEglNoSurface())) {
                releaseAll(true);
            }
            this.sizeChanged = false;
        }
    }

    private final void deleteFrameBufferWithTexture() {
        int[] iArr = this.framebuffers;
        GLES20.glDeleteFramebuffers(iArr.length, iArr, 0);
        int[] iArr2 = this.textures;
        GLES20.glDeleteTextures(iArr2.length, iArr2, 0);
        this.framebuffers[0] = 0;
        this.textures[0] = 0;
    }

    private static /* synthetic */ void getTAG$annotations() {
    }

    private final void prepareFrameBufferWithTexture() {
        GLES20.glGenFramebuffers(1, this.framebuffers, 0);
        GLES20.glGenTextures(1, this.textures, 0);
        GLES20.glBindTexture(3553, this.textures[0]);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glTexImage2D(3553, 0, 6408, this.width, this.height, 0, 6408, 5121, null);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindFramebuffer(36160, this.framebuffers[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.textures[0], 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    private final void releaseAll(boolean resizing) {
        EGLCore eGLCore = this.eglCore;
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLCore != null) {
            if (eGLSurface != null && !eGLSurface.equals(eGLCore.getEglNoSurface())) {
                eGLCore.makeCurrent(eGLSurface);
                deleteFrameBufferWithTexture();
                Iterator<T> it = this.widgets.iterator();
                while (it.hasNext()) {
                    ((Widget) it.next()).getRenderer().release();
                }
                eGLCore.releaseSurface(eGLSurface);
            }
            eGLCore.release();
        }
        this.eglSurface = null;
        if (!resizing) {
            this.eglCore = null;
        }
        this.eglContextCreated = false;
    }

    public final void addWidget(Widget widget) {
        AbstractC22676k.m65750j(widget, "widget");
        widget.getRenderer().onSurfaceChanged(this.width, this.height);
        this.widgets.add(widget);
    }

    public final void cleanUpAllWidgets() {
        Iterator<T> it = this.widgets.iterator();
        while (it.hasNext()) {
            ((Widget) it.next()).setTriggerRepaintAction$maps_sdk_release(null);
        }
        this.widgets.clear();
    }

    public final boolean getNeedRender() {
        CopyOnWriteArraySet<Widget> copyOnWriteArraySet = this.widgets;
        if (copyOnWriteArraySet != null && copyOnWriteArraySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            if (((Widget) it.next()).getRenderer().getNeedRender()) {
                return true;
            }
        }
        return false;
    }

    public final int getTexture() {
        return this.textures[0];
    }

    public final boolean hasTexture() {
        return this.textures[0] != 0;
    }

    public final boolean hasWidgets() {
        return !this.widgets.isEmpty();
    }

    public final void onSurfaceChanged(int width, int height) {
        this.sizeChanged = true;
        this.width = width;
        this.height = height;
        Iterator<T> it = this.widgets.iterator();
        while (it.hasNext()) {
            ((Widget) it.next()).getRenderer().onSurfaceChanged(width, height);
        }
    }

    public final void release() {
        releaseAll(false);
    }

    public final boolean removeWidget(Widget widget) {
        AbstractC22676k.m65750j(widget, "widget");
        boolean zRemove = this.widgets.remove(widget);
        if (zRemove) {
            widget.setTriggerRepaintAction$maps_sdk_release(null);
        }
        return zRemove;
    }

    public final void renderToFrameBuffer() {
        checkSizeChanged();
        checkEgl();
        EGLCore eGLCore = this.eglCore;
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLCore == null || eGLSurface == null || eGLSurface.equals(eGLCore.getEglNoSurface())) {
            return;
        }
        eGLCore.makeCurrent(eGLSurface);
        if (!hasTexture()) {
            prepareFrameBufferWithTexture();
        }
        GLES20.glBindFramebuffer(36160, this.framebuffers[0]);
        GLES20.glClear(17664);
        Iterator<T> it = this.widgets.iterator();
        while (it.hasNext()) {
            ((Widget) it.next()).getRenderer().render();
        }
        GLES20.glBindFramebuffer(36160, 0);
    }

    public final void setSharedContext(EGLContext sharedContext) {
        AbstractC22676k.m65750j(sharedContext, "sharedContext");
        if (this.eglContextCreated) {
            release();
        }
        this.eglCore = new EGLCore(false, this.antialiasingSampleCount, sharedContext, this.mapName);
    }
}
