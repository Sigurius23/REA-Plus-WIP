package com.mapbox.maps.renderer;

import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Choreographer;
import android.view.Surface;
import c93.InterfaceC4339a;
import com.mapbox.maps.ContextMode;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxTracing;
import com.mapbox.maps.renderer.egl.EGLCore;
import com.mapbox.maps.renderer.p053gl.TextureRenderer;
import com.mapbox.maps.renderer.widget.Widget;
import com.mapbox.maps.viewannotation.ViewAnnotationManager;
import com.mapbox.maps.viewannotation.ViewAnnotationUpdateMode;
import f93.AbstractC14290b;
import f93.InterfaceC14292d;
import j93.InterfaceC21493z;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 À\u00012\u00020\u0001:\u0002À\u0001B9\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fBQ\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u000e\u0010\u001dJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0007¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020 H\u0007¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020 2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b)\u0010*J'\u0010/\u001a\u00020 2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0000¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020 2\u0006\u00100\u001a\u00020\bH\u0007¢\u0006\u0004\b1\u00102J'\u00103\u001a\u00020 2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0007¢\u0006\u0004\b3\u0010.J\u0017\u00105\u001a\u00020 2\u0006\u00104\u001a\u00020\bH\u0007¢\u0006\u0004\b5\u00102J\u0017\u00108\u001a\u00020 2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020 2\u0006\u0010;\u001a\u00020:H\u0007¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020 H\u0007¢\u0006\u0004\b>\u0010$J\u000f\u0010?\u001a\u00020 H\u0007¢\u0006\u0004\b?\u0010$J\u000f\u0010A\u001a\u00020 H\u0001¢\u0006\u0004\b@\u0010$J&\u0010E\u001a\u00020 2\u0006\u0010B\u001a\u00020\f2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020 0CH\u0082\b¢\u0006\u0004\bE\u0010FJ\u0019\u0010H\u001a\u00020 2\b\b\u0002\u0010G\u001a\u000206H\u0002¢\u0006\u0004\bH\u00109J\u0017\u0010J\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\u0006H\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u0006H\u0002¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u0006H\u0002¢\u0006\u0004\bN\u0010MJ\u0017\u0010O\u001a\u00020\u00062\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u0006H\u0002¢\u0006\u0004\bQ\u0010MJ\u000f\u0010R\u001a\u00020 H\u0002¢\u0006\u0004\bR\u0010$J\u000f\u0010S\u001a\u00020 H\u0002¢\u0006\u0004\bS\u0010$J\u000f\u0010T\u001a\u00020 H\u0002¢\u0006\u0004\bT\u0010$J\u0017\u0010U\u001a\u00020 2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\bU\u00109J\u000f\u0010V\u001a\u00020 H\u0002¢\u0006\u0004\bV\u0010$J\u000f\u0010W\u001a\u00020 H\u0002¢\u0006\u0004\bW\u0010$J\u0019\u0010Y\u001a\u00020 2\b\b\u0002\u0010X\u001a\u00020\u0006H\u0002¢\u0006\u0004\bY\u0010ZJ\u0019\u0010[\u001a\u00020 2\b\b\u0002\u0010I\u001a\u00020\u0006H\u0002¢\u0006\u0004\b[\u0010ZJ \u0010]\u001a\u00020 2\u000e\b\u0004\u0010\\\u001a\b\u0012\u0004\u0012\u00020 0CH\u0082\b¢\u0006\u0004\b]\u0010^J!\u0010_\u001a\u00020 2\u0006\u0010;\u001a\u00020:2\b\b\u0002\u0010G\u001a\u000206H\u0002¢\u0006\u0004\b_\u0010`J\u001d\u0010c\u001a\u00020 2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020:0aH\u0002¢\u0006\u0004\bc\u0010dR\u001a\u0010e\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010iR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010jR\u001a\u0010\u0013\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010k\u001a\u0004\bl\u0010mR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010nR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010oR\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010oR&\u0010p\u001a\b\u0012\u0004\u0012\u00020:0a8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bp\u0010q\u0012\u0004\bt\u0010$\u001a\u0004\br\u0010sR&\u0010u\u001a\b\u0012\u0004\u0012\u00020:0a8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bu\u0010q\u0012\u0004\bw\u0010$\u001a\u0004\bv\u0010sR*\u0010,\u001a\u0004\u0018\u00010+8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b,\u0010x\u0012\u0004\b}\u0010$\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R.\u0010\u007f\u001a\u00020~8\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0005\b\u007f\u0010\u0080\u0001\u0012\u0005\b\u0085\u0001\u0010$\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0017\u0010\u001e\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001e\u0010\u0086\u0001R\u0017\u0010\u001f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001f\u0010\u0086\u0001R\u0017\u0010\u0087\u0001\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u0089\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010iR\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010\u008a\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u008b\u0001R-\u0010\u008c\u0001\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u001c\n\u0005\b\u008c\u0001\u0010i\u0012\u0005\b\u008f\u0001\u0010$\u001a\u0005\b\u008d\u0001\u0010M\"\u0005\b\u008e\u0001\u0010ZR\u0018\u0010\u0090\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010iR-\u0010\u0091\u0001\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u001c\n\u0005\b\u0091\u0001\u0010i\u0012\u0005\b\u0094\u0001\u0010$\u001a\u0005\b\u0092\u0001\u0010M\"\u0005\b\u0093\u0001\u0010ZR3\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u001f\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u0012\u0005\b\u009c\u0001\u0010$\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R(\u0010\u009e\u0001\u001a\u00020\u00062\u0007\u0010\u009d\u0001\u001a\u00020\u00068\u0002@BX\u0082\u000e¢\u0006\u000e\n\u0005\b\u009e\u0001\u0010i\"\u0005\b\u009f\u0001\u0010ZR6\u0010 \u0001\u001a\u00020\u00062\u0007\u0010\u009d\u0001\u001a\u00020\u00068\u0000@@X\u0081\u000e¢\u0006\u001c\n\u0005\b \u0001\u0010i\u0012\u0005\b£\u0001\u0010$\u001a\u0005\b¡\u0001\u0010M\"\u0005\b¢\u0001\u0010ZR\u0016\u0010¤\u0001\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b¤\u0001\u0010nR\u0018\u0010¥\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¥\u0001\u0010iR\u0018\u0010¦\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¦\u0001\u0010iR9\u0010¯\u0001\u001a\u0005\u0018\u00010§\u00012\n\u0010¨\u0001\u001a\u0005\u0018\u00010§\u00018@@@X\u0080\u008e\u0002¢\u0006\u0018\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010°\u0001R&\u0010±\u0001\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b±\u0001\u0010i\u001a\u0005\b²\u0001\u0010M\"\u0005\b³\u0001\u0010ZR*\u0010µ\u0001\u001a\u00030´\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R\u001e\u0010»\u0001\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b»\u0001\u0010¼\u0001\u0012\u0005\b½\u0001\u0010$R\u0016\u0010¿\u0001\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010M¨\u0006Á\u0001"}, m65681d2 = {"Lcom/mapbox/maps/renderer/MapboxRenderThread;", "Landroid/view/Choreographer$FrameCallback;", "Lcom/mapbox/maps/renderer/MapboxRenderer;", "mapboxRenderer", "Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;", "mapboxWidgetRenderer", "", "translucentSurface", "", "antialiasingSampleCount", "Lcom/mapbox/maps/ContextMode;", "contextMode", "", "mapName", "<init>", "(Lcom/mapbox/maps/renderer/MapboxRenderer;Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;ZILcom/mapbox/maps/ContextMode;Ljava/lang/String;)V", "Lcom/mapbox/maps/renderer/RenderHandlerThread;", "handlerThread", "Lcom/mapbox/maps/renderer/egl/EGLCore;", "eglCore", "Lcom/mapbox/maps/renderer/FpsManager;", "fpsManager", "Lcom/mapbox/maps/renderer/gl/TextureRenderer;", "widgetTextureRenderer", "Ljava/util/concurrent/locks/ReentrantLock;", "surfaceProcessingLock", "Ljava/util/concurrent/locks/Condition;", "createCondition", "destroyCondition", "(Lcom/mapbox/maps/renderer/MapboxRenderer;Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;Lcom/mapbox/maps/renderer/RenderHandlerThread;Lcom/mapbox/maps/renderer/egl/EGLCore;Lcom/mapbox/maps/renderer/FpsManager;Lcom/mapbox/maps/renderer/gl/TextureRenderer;Ljava/util/concurrent/locks/ReentrantLock;Ljava/util/concurrent/locks/Condition;Ljava/util/concurrent/locks/Condition;)V", "width", "height", "Ll83/a0;", "onSurfaceSizeChanged", "(II)V", "onSurfaceDestroyed", "()V", "Lcom/mapbox/maps/renderer/widget/Widget;", "widget", "addWidget", "(Lcom/mapbox/maps/renderer/widget/Widget;)V", "removeWidget", "(Lcom/mapbox/maps/renderer/widget/Widget;)Z", "Landroid/view/Surface;", "surface", "processAndroidSurface$maps_sdk_release", "(Landroid/view/Surface;II)V", "processAndroidSurface", "refreshRate", "setScreenRefreshRate", "(I)V", "onSurfaceCreated", "fps", "setUserRefreshRate", "", "frameTimeNanos", "doFrame", "(J)V", "Lcom/mapbox/maps/renderer/RenderEvent;", "renderEvent", "queueRenderEvent", "(Lcom/mapbox/maps/renderer/RenderEvent;)V", "pause", "resume", "destroy$maps_sdk_release", "destroy", "sectionName", "Lkotlin/Function0;", "section", "trace", "(Ljava/lang/String;Lc93/a;)V", "delayMillis", "postPrepareRenderFrame", "creatingSurface", "setUpRenderThread", "(Z)Z", "checkEglConfig", "()Z", "checkAndroidSurface", "checkEglSurface", "(Landroid/view/Surface;)Z", "checkEglContextCurrent", "checkSurfaceSizeChanged", "checkWidgetRender", "resetGlState", "draw", "swapBuffers", "releaseEglSurface", "tryRecreate", "releaseAll", "(Z)V", "prepareRenderFrame", "block", "renderPreparedGuardedRun", "(Lc93/a;)V", "postNonRenderEvent", "(Lcom/mapbox/maps/renderer/RenderEvent;J)V", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "originalQueue", "drainQueue", "(Ljava/util/concurrent/ConcurrentLinkedQueue;)V", "renderHandlerThread", "Lcom/mapbox/maps/renderer/RenderHandlerThread;", "getRenderHandlerThread$maps_sdk_release", "()Lcom/mapbox/maps/renderer/RenderHandlerThread;", "Z", "Lcom/mapbox/maps/renderer/MapboxRenderer;", "Lcom/mapbox/maps/renderer/egl/EGLCore;", "getEglCore$maps_sdk_release", "()Lcom/mapbox/maps/renderer/egl/EGLCore;", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/Condition;", "renderEventQueue", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "getRenderEventQueue$maps_sdk_release", "()Ljava/util/concurrent/ConcurrentLinkedQueue;", "getRenderEventQueue$maps_sdk_release$annotations", "nonRenderEventQueue", "getNonRenderEventQueue$maps_sdk_release", "getNonRenderEventQueue$maps_sdk_release$annotations", "Landroid/view/Surface;", "getSurface$maps_sdk_release", "()Landroid/view/Surface;", "setSurface$maps_sdk_release", "(Landroid/view/Surface;)V", "getSurface$maps_sdk_release$annotations", "Landroid/opengl/EGLSurface;", "eglSurface", "Landroid/opengl/EGLSurface;", "getEglSurface$maps_sdk_release", "()Landroid/opengl/EGLSurface;", "setEglSurface$maps_sdk_release", "(Landroid/opengl/EGLSurface;)V", "getEglSurface$maps_sdk_release$annotations", "I", "widgetRenderer", "Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;", "widgetRenderCreated", "Lcom/mapbox/maps/renderer/gl/TextureRenderer;", "Lcom/mapbox/maps/ContextMode;", "awaitingNextVsync", "getAwaitingNextVsync$maps_sdk_release", "setAwaitingNextVsync$maps_sdk_release", "getAwaitingNextVsync$maps_sdk_release$annotations", "sizeChanged", "paused", "getPaused$maps_sdk_release", "setPaused$maps_sdk_release", "getPaused$maps_sdk_release$annotations", "Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;", "renderThreadStatsRecorder", "Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;", "getRenderThreadStatsRecorder$maps_sdk_release", "()Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;", "setRenderThreadStatsRecorder$maps_sdk_release", "(Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;)V", "getRenderThreadStatsRecorder$maps_sdk_release$annotations", "value", "nativeRenderCreated", "setNativeRenderCreated", "eglContextMadeCurrent", "getEglContextMadeCurrent$maps_sdk_release", "setEglContextMadeCurrent$maps_sdk_release", "getEglContextMadeCurrent$maps_sdk_release$annotations", "renderThreadPreparedLock", "eglContextCreated", "renderNotSupported", "Lcom/mapbox/maps/renderer/OnFpsChangedListener;", "<set-?>", "fpsChangedListener$delegate", "Lf93/d;", "getFpsChangedListener$maps_sdk_release", "()Lcom/mapbox/maps/renderer/OnFpsChangedListener;", "setFpsChangedListener$maps_sdk_release", "(Lcom/mapbox/maps/renderer/OnFpsChangedListener;)V", "fpsChangedListener", "Lcom/mapbox/maps/renderer/FpsManager;", "needViewAnnotationSync", "getNeedViewAnnotationSync$maps_sdk_release", "setNeedViewAnnotationSync$maps_sdk_release", "Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;", "viewAnnotationMode", "Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;", "getViewAnnotationMode$maps_sdk_release", "()Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;", "setViewAnnotationMode$maps_sdk_release", "(Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;)V", "TAG", "Ljava/lang/String;", "getTAG$annotations", "getRenderThreadPrepared", "renderThreadPrepared", "Companion", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class MapboxRenderThread implements Choreographer.FrameCallback {
    static final /* synthetic */ InterfaceC21493z[] $$delegatedProperties = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(MapboxRenderThread.class, "fpsChangedListener", "getFpsChangedListener$maps_sdk_release()Lcom/mapbox/maps/renderer/OnFpsChangedListener;", 0))};
    public static final long RETRY_DELAY_MS = 50;
    private final String TAG;
    private volatile boolean awaitingNextVsync;
    private final ContextMode contextMode;
    private final Condition createCondition;
    private final Condition destroyCondition;
    private boolean eglContextCreated;
    private boolean eglContextMadeCurrent;
    private final EGLCore eglCore;
    private EGLSurface eglSurface;

    /* JADX INFO: renamed from: fpsChangedListener$delegate, reason: from kotlin metadata */
    private final InterfaceC14292d fpsChangedListener;
    private final FpsManager fpsManager;
    private int height;
    private final MapboxRenderer mapboxRenderer;
    private boolean nativeRenderCreated;
    private boolean needViewAnnotationSync;
    private final ConcurrentLinkedQueue<RenderEvent> nonRenderEventQueue;
    private volatile boolean paused;
    private final ConcurrentLinkedQueue<RenderEvent> renderEventQueue;
    private final RenderHandlerThread renderHandlerThread;
    private boolean renderNotSupported;
    private final ReentrantLock renderThreadPreparedLock;
    private RenderThreadStatsRecorder renderThreadStatsRecorder;
    private boolean sizeChanged;
    private Surface surface;
    private final ReentrantLock surfaceProcessingLock;
    private final boolean translucentSurface;
    private volatile ViewAnnotationUpdateMode viewAnnotationMode;
    private boolean widgetRenderCreated;
    private final MapboxWidgetRenderer widgetRenderer;
    private final TextureRenderer widgetTextureRenderer;
    private int width;

    /* JADX INFO: renamed from: com.mapbox.maps.renderer.MapboxRenderThread$onSurfaceSizeChanged$1 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C55461 extends AbstractC22680m implements InterfaceC4339a {
        final /* synthetic */ int $height;
        final /* synthetic */ int $width;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C55461(int i13, int i14) {
            super(0);
            this.$width = i13;
            this.$height = i14;
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134123invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134123invoke() {
            MapboxRenderThread.this.width = this.$width;
            MapboxRenderThread.this.height = this.$height;
            MapboxRenderThread.this.sizeChanged = true;
            MapboxRenderThread.prepareRenderFrame$default(MapboxRenderThread.this, false, 1, null);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.renderer.MapboxRenderThread$postNonRenderEvent$1 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C55471 extends AbstractC22680m implements InterfaceC4339a {
        final /* synthetic */ RenderEvent $renderEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C55471(RenderEvent renderEvent) {
            super(0);
            this.$renderEvent = renderEvent;
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134124invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134124invoke() {
            if (MapboxRenderThread.this.getRenderThreadPrepared()) {
                Runnable runnable = this.$renderEvent.getRunnable();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            if (MapboxRenderThread.this.getPaused()) {
                MapboxRenderThread.this.getNonRenderEventQueue$maps_sdk_release().add(this.$renderEvent);
            } else {
                MapboxLogger.logW(MapboxRenderThread.this.TAG, "Non-render event could not be run, retrying in 50 ms...");
                MapboxRenderThread.this.postNonRenderEvent(this.$renderEvent, 50L);
            }
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.renderer.MapboxRenderThread$postPrepareRenderFrame$1 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C55481 extends AbstractC22680m implements InterfaceC4339a {
        public C55481() {
            super(0);
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134125invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134125invoke() {
            MapboxRenderThread.prepareRenderFrame$default(MapboxRenderThread.this, false, 1, null);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.renderer.MapboxRenderThread$renderPreparedGuardedRun$1 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C55501 extends AbstractC22680m implements InterfaceC4339a {
        final /* synthetic */ InterfaceC4339a $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C55501(InterfaceC4339a interfaceC4339a) {
            super(0);
            this.$block = interfaceC4339a;
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134127invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134127invoke() {
            if (!MapboxRenderThread.this.setUpRenderThread(true)) {
                MapboxLogger.logI(MapboxRenderThread.this.TAG, "Setting up render thread failed, check logs above.");
            } else {
                this.$block.invoke();
                MapboxLogger.logI(MapboxRenderThread.this.TAG, "Setting up render thread was OK, map should render again!");
            }
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.renderer.MapboxRenderThread$setScreenRefreshRate$1 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C55511 extends AbstractC22680m implements InterfaceC4339a {
        final /* synthetic */ int $refreshRate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C55511(int i13) {
            super(0);
            this.$refreshRate = i13;
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134129invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134129invoke() {
            MapboxRenderThread.this.fpsManager.setScreenRefreshRate(this.$refreshRate);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.renderer.MapboxRenderThread$setUserRefreshRate$1 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C55521 extends AbstractC22680m implements InterfaceC4339a {
        final /* synthetic */ int $fps;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C55521(int i13) {
            super(0);
            this.$fps = i13;
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134130invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134130invoke() {
            MapboxRenderThread.this.fpsManager.setUserRefreshRate(this.$fps);
        }
    }

    public MapboxRenderThread(MapboxRenderer mapboxRenderer, MapboxWidgetRenderer mapboxWidgetRenderer, boolean z4, int i13, ContextMode contextMode, String mapName) {
        AbstractC22676k.m65750j(mapboxRenderer, "mapboxRenderer");
        AbstractC22676k.m65750j(mapboxWidgetRenderer, "mapboxWidgetRenderer");
        AbstractC22676k.m65750j(contextMode, "contextMode");
        AbstractC22676k.m65750j(mapName, "mapName");
        this.renderEventQueue = new ConcurrentLinkedQueue<>();
        this.nonRenderEventQueue = new ConcurrentLinkedQueue<>();
        this.renderThreadPreparedLock = new ReentrantLock();
        final DefaultConstructorMarker defaultConstructorMarker = null;
        this.fpsChangedListener = new AbstractC14290b(defaultConstructorMarker) { // from class: com.mapbox.maps.renderer.MapboxRenderThread$special$$inlined$observable$1
            @Override // f93.AbstractC14290b
            public void afterChange(InterfaceC21493z property, OnFpsChangedListener oldValue, OnFpsChangedListener newValue) {
                AbstractC22676k.m65750j(property, "property");
                OnFpsChangedListener onFpsChangedListener = newValue;
                if (AbstractC22676k.m65745e(oldValue, onFpsChangedListener)) {
                    return;
                }
                MapboxRenderThread mapboxRenderThread = this;
                MapboxRenderThread.postNonRenderEvent$default(mapboxRenderThread, new RenderEvent(new MapboxRenderThread$fpsChangedListener$2$1(mapboxRenderThread, onFpsChangedListener), false), 0L, 2, null);
            }
        };
        this.viewAnnotationMode = ViewAnnotationManager.DEFAULT_UPDATE_MODE;
        this.translucentSurface = z4;
        this.mapboxRenderer = mapboxRenderer;
        this.widgetRenderer = mapboxWidgetRenderer;
        StringBuilder sb4 = new StringBuilder("Mbgl-RenderThread");
        sb4.append(!AbstractC39414r.m125890i0(mapName) ? "\\".concat(mapName) : "");
        this.TAG = sb4.toString();
        EGLCore eGLCore = new EGLCore(z4, i13, null, mapName, 4, null);
        this.eglCore = eGLCore;
        this.eglSurface = eGLCore.getEglNoSurface();
        this.widgetTextureRenderer = new TextureRenderer(0.0f, 1, defaultConstructorMarker);
        this.contextMode = contextMode;
        RenderHandlerThread renderHandlerThread = new RenderHandlerThread(mapName);
        this.renderHandlerThread = renderHandlerThread;
        this.fpsManager = new FpsManager(renderHandlerThread.start(), mapName);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.surfaceProcessingLock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        AbstractC22676k.m65749i(conditionNewCondition, "surfaceProcessingLock.newCondition()");
        this.createCondition = conditionNewCondition;
        Condition conditionNewCondition2 = reentrantLock.newCondition();
        AbstractC22676k.m65749i(conditionNewCondition2, "surfaceProcessingLock.newCondition()");
        this.destroyCondition = conditionNewCondition2;
    }

    private final boolean checkAndroidSurface() {
        Surface surface = this.surface;
        if (surface != null && surface.isValid()) {
            return true;
        }
        String str = this.TAG;
        StringBuilder sb4 = new StringBuilder("EGL was configured but Android surface.isValid=");
        Surface surface2 = this.surface;
        sb4.append(surface2 != null ? Boolean.valueOf(surface2.isValid()) : null);
        sb4.append(", waiting for a new one...");
        MapboxLogger.logW(str, sb4.toString());
        postPrepareRenderFrame(50L);
        return false;
    }

    private final boolean checkEglConfig() {
        if (!this.eglContextCreated) {
            if (!this.eglCore.prepareEgl()) {
                MapboxLogger.logE(this.TAG, "EGL was not configured, please check logs above.");
                this.renderNotSupported = true;
                return false;
            }
            this.eglContextCreated = true;
        }
        return true;
    }

    private final boolean checkEglContextCurrent() {
        if (this.eglCore.makeCurrent(this.eglSurface)) {
            return true;
        }
        MapboxLogger.logW(this.TAG, "EGL was configured but context could not be made current. Trying again in a moment...");
        postPrepareRenderFrame(50L);
        return false;
    }

    private final boolean checkEglSurface(Surface surface) {
        if (!AbstractC22676k.m65745e(this.eglSurface, this.eglCore.getEglNoSurface())) {
            return true;
        }
        EGLSurface eGLSurfaceCreateWindowSurface = this.eglCore.createWindowSurface(surface);
        this.eglSurface = eGLSurfaceCreateWindowSurface;
        if (!AbstractC22676k.m65745e(eGLSurfaceCreateWindowSurface, this.eglCore.getEglNoSurface())) {
            return true;
        }
        MapboxLogger.logW(this.TAG, "Could not create EGL surface although Android surface was valid, retrying in 50 ms...");
        postPrepareRenderFrame(50L);
        return false;
    }

    private final void checkSurfaceSizeChanged() {
        if (this.sizeChanged) {
            this.mapboxRenderer.onSurfaceChanged(this.width, this.height);
            this.widgetRenderer.onSurfaceChanged(this.width, this.height);
            this.sizeChanged = false;
        }
    }

    private final void checkWidgetRender() {
        if (this.eglContextCreated && !this.widgetRenderCreated && this.widgetRenderer.hasWidgets()) {
            this.widgetRenderer.setSharedContext(this.eglCore.getEglContext());
            this.widgetRenderCreated = true;
        }
    }

    private final void drainQueue(ConcurrentLinkedQueue<RenderEvent> originalQueue) {
        RenderEvent renderEventPoll = originalQueue.poll();
        while (renderEventPoll != null) {
            Runnable runnable = renderEventPoll.getRunnable();
            if (runnable != null) {
                runnable.run();
            }
            renderEventPoll = originalQueue.poll();
        }
    }

    private final void draw(long frameTimeNanos) {
        FpsManager fpsManager = this.fpsManager;
        RenderThreadStatsRecorder renderThreadStatsRecorder = this.renderThreadStatsRecorder;
        if (!fpsManager.preRender(frameTimeNanos, renderThreadStatsRecorder != null && renderThreadStatsRecorder.isRecording())) {
            postPrepareRenderFrame$default(this, 0L, 1, null);
            return;
        }
        if (this.contextMode == ContextMode.SHARED) {
            GLES20.glClear(17664);
        }
        if (this.widgetRenderer.hasWidgets()) {
            if (this.widgetRenderer.getNeedRender()) {
                this.widgetRenderer.renderToFrameBuffer();
                this.eglCore.makeCurrent(this.eglSurface);
            }
            this.mapboxRenderer.render();
            resetGlState();
            if (this.widgetRenderer.hasTexture()) {
                this.widgetTextureRenderer.render(this.widgetRenderer.getTexture());
            }
        } else {
            this.mapboxRenderer.render();
        }
        drainQueue(this.renderEventQueue);
        this.fpsManager.postRender();
        if (this.needViewAnnotationSync && AbstractC22676k.m65745e(this.viewAnnotationMode, ViewAnnotationUpdateMode.MAP_SYNCHRONIZED)) {
            Choreographer.getInstance().postFrameCallback(new ChoreographerFrameCallbackC5553a(this, 0));
            GLES20.glFlush();
        } else {
            swapBuffers();
        }
        this.needViewAnnotationSync = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draw$lambda$5(MapboxRenderThread this$0, long j7) {
        AbstractC22676k.m65750j(this$0, "this$0");
        this$0.swapBuffers();
    }

    public static /* synthetic */ void getAwaitingNextVsync$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void getEglContextMadeCurrent$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void getEglSurface$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void getNonRenderEventQueue$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void getPaused$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void getRenderEventQueue$maps_sdk_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getRenderThreadPrepared() {
        ReentrantLock reentrantLock = this.renderThreadPreparedLock;
        reentrantLock.lock();
        try {
            return this.eglContextMadeCurrent && this.nativeRenderCreated;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static /* synthetic */ void getRenderThreadStatsRecorder$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void getSurface$maps_sdk_release$annotations() {
    }

    private static /* synthetic */ void getTAG$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void postNonRenderEvent(RenderEvent renderEvent, long delayMillis) {
        if (this.awaitingNextVsync) {
            this.nonRenderEventQueue.add(renderEvent);
        } else {
            this.renderHandlerThread.postDelayed(new C55471(renderEvent), delayMillis);
        }
    }

    public static /* synthetic */ void postNonRenderEvent$default(MapboxRenderThread mapboxRenderThread, RenderEvent renderEvent, long j7, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            j7 = 0;
        }
        mapboxRenderThread.postNonRenderEvent(renderEvent, j7);
    }

    private final void postPrepareRenderFrame(long delayMillis) {
        this.renderHandlerThread.postDelayed(new C55481(), delayMillis);
    }

    public static /* synthetic */ void postPrepareRenderFrame$default(MapboxRenderThread mapboxRenderThread, long j7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = 0;
        }
        mapboxRenderThread.postPrepareRenderFrame(j7);
    }

    private final void prepareRenderFrame(boolean creatingSurface) {
        if (!this.awaitingNextVsync || creatingSurface) {
            if ((this.renderNotSupported || this.paused) && !creatingSurface) {
                MapboxLogger.logI(this.TAG, "Skip render frame - NOT creating surface although renderNotSupported (" + this.renderNotSupported + ") || paused (" + this.paused + ')');
                return;
            }
            if (creatingSurface || !getRenderThreadPrepared()) {
                if (MapboxTracing.INSTANCE.getPlatformTracingEnabled$maps_sdk_release()) {
                    Trace.beginSection("mbx: set-up-render-thread");
                    try {
                        if (!setUpRenderThread(creatingSurface)) {
                            String str = this.TAG;
                            StringBuilder sb4 = new StringBuilder("Skip render frame - render thread NOT prepared although creatingSurface (");
                            sb4.append(creatingSurface);
                            sb4.append(") || !renderThreadPrepared (");
                            sb4.append(!getRenderThreadPrepared());
                            sb4.append(')');
                            MapboxLogger.logI(str, sb4.toString());
                        }
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                } else if (!setUpRenderThread(creatingSurface)) {
                    String str2 = this.TAG;
                    StringBuilder sb5 = new StringBuilder("Skip render frame - render thread NOT prepared although creatingSurface (");
                    sb5.append(creatingSurface);
                    sb5.append(") || !renderThreadPrepared (");
                    sb5.append(!getRenderThreadPrepared());
                    sb5.append(')');
                    MapboxLogger.logI(str2, sb5.toString());
                }
            }
            checkWidgetRender();
            checkSurfaceSizeChanged();
            Choreographer.getInstance().postFrameCallback(this);
            this.awaitingNextVsync = true;
        }
    }

    public static /* synthetic */ void prepareRenderFrame$default(MapboxRenderThread mapboxRenderThread, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = false;
        }
        mapboxRenderThread.prepareRenderFrame(z4);
    }

    private final void releaseAll(boolean tryRecreate) {
        if (!MapboxTracing.INSTANCE.getPlatformTracingEnabled$maps_sdk_release()) {
            this.mapboxRenderer.destroyRenderer();
            MapboxLogger.logI(this.TAG, "Native renderer destroyed.");
            this.renderEventQueue.clear();
            this.nonRenderEventQueue.clear();
            setNativeRenderCreated(false);
            releaseEglSurface();
            if (this.eglContextCreated) {
                this.eglCore.release();
            }
            this.eglContextCreated = false;
            if (tryRecreate) {
                setUpRenderThread(true);
                return;
            }
            Surface surface = this.surface;
            if (surface != null) {
                surface.release();
                return;
            }
            return;
        }
        Trace.beginSection("mbx: release-egl-all");
        try {
            this.mapboxRenderer.destroyRenderer();
            MapboxLogger.logI(this.TAG, "Native renderer destroyed.");
            this.renderEventQueue.clear();
            this.nonRenderEventQueue.clear();
            setNativeRenderCreated(false);
            releaseEglSurface();
            if (this.eglContextCreated) {
                this.eglCore.release();
            }
            this.eglContextCreated = false;
            if (tryRecreate) {
                setUpRenderThread(true);
            } else {
                Surface surface2 = this.surface;
                if (surface2 != null) {
                    surface2.release();
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public static /* synthetic */ void releaseAll$default(MapboxRenderThread mapboxRenderThread, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = false;
        }
        mapboxRenderThread.releaseAll(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseEglSurface() {
        if (!MapboxTracing.INSTANCE.getPlatformTracingEnabled$maps_sdk_release()) {
            this.widgetTextureRenderer.release();
            this.eglCore.releaseSurface(this.eglSurface);
            setEglContextMadeCurrent$maps_sdk_release(false);
            this.eglSurface = this.eglCore.getEglNoSurface();
            this.widgetRenderCreated = false;
            this.widgetRenderer.release();
            return;
        }
        Trace.beginSection("mbx: release-egl-surface");
        try {
            this.widgetTextureRenderer.release();
            this.eglCore.releaseSurface(this.eglSurface);
            setEglContextMadeCurrent$maps_sdk_release(false);
            this.eglSurface = this.eglCore.getEglNoSurface();
            this.widgetRenderCreated = false;
            this.widgetRenderer.release();
        } finally {
            Trace.endSection();
        }
    }

    private final void renderPreparedGuardedRun(InterfaceC4339a block) {
        if (getRenderThreadPrepared()) {
            block.invoke();
            return;
        }
        Surface surface = this.surface;
        if (surface != null && surface.isValid()) {
            MapboxLogger.logI(this.TAG, "renderThreadPrepared=false but Android surface is valid, trying to recreate EGL...");
            this.renderHandlerThread.post(new C55501(block));
        } else {
            if (this.paused) {
                return;
            }
            String str = this.TAG;
            StringBuilder sb4 = new StringBuilder("renderThreadPrepared=false and Android surface is not valid (isValid=");
            Surface surface2 = this.surface;
            sb4.append(surface2 != null ? Boolean.valueOf(surface2.isValid()) : null);
            sb4.append("). Waiting for new one.");
            MapboxLogger.logI(str, sb4.toString());
        }
    }

    private final void resetGlState() {
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(1, 771);
        GLES20.glBlendEquation(32774);
        GLES20.glDisable(2960);
        GLES20.glDisable(2929);
        GLES20.glUseProgram(0);
        GLES20.glBindBuffer(34962, 0);
        GLES20.glBindBuffer(34963, 0);
    }

    private final void setNativeRenderCreated(boolean z4) {
        ReentrantLock reentrantLock = this.renderThreadPreparedLock;
        reentrantLock.lock();
        try {
            this.nativeRenderCreated = z4;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean setUpRenderThread(boolean creatingSurface) {
        ReentrantLock reentrantLock = this.surfaceProcessingLock;
        reentrantLock.lock();
        try {
            try {
                MapboxLogger.logI(this.TAG, "Setting up render thread, flags: creatingSurface=" + creatingSurface + ", nativeRenderCreated=" + this.nativeRenderCreated + ", eglContextMadeCurrent=" + this.eglContextMadeCurrent + ", eglContextCreated=" + this.eglContextCreated + ", paused=" + this.paused);
                boolean zCheckEglConfig = checkEglConfig();
                boolean zCheckAndroidSurface = checkAndroidSurface();
                if (zCheckEglConfig && zCheckAndroidSurface) {
                    if (creatingSurface) {
                        this.eglCore.makeNothingCurrent();
                    }
                    Surface surface = this.surface;
                    AbstractC22676k.m65747g(surface);
                    if (checkEglSurface(surface)) {
                        setEglContextMadeCurrent$maps_sdk_release(checkEglContextCurrent());
                        if (this.eglContextMadeCurrent) {
                            if (!this.nativeRenderCreated) {
                                setNativeRenderCreated(true);
                                this.mapboxRenderer.createRenderer();
                                MapboxLogger.logI(this.TAG, "Native renderer created.");
                                this.mapboxRenderer.onSurfaceChanged(this.width, this.height);
                            }
                            this.createCondition.signal();
                            reentrantLock.unlock();
                            return true;
                        }
                    }
                }
                this.createCondition.signal();
                reentrantLock.unlock();
                return false;
            } catch (Throwable th3) {
                this.createCondition.signal();
                throw th3;
            }
        } catch (Throwable th4) {
            reentrantLock.unlock();
            throw th4;
        }
    }

    private final void swapBuffers() {
        int iSwapBuffers = this.eglCore.swapBuffers(this.eglSurface);
        if (iSwapBuffers != 12288) {
            if (iSwapBuffers == 12302) {
                MapboxLogger.logW(this.TAG, "Context lost. Waiting for re-acquire");
                releaseAll(true);
                return;
            }
            MapboxLogger.logW(this.TAG, "eglSwapBuffer error: " + iSwapBuffers + ". Waiting for new surface");
            releaseEglSurface();
        }
    }

    private final void trace(String sectionName, InterfaceC4339a section) {
        if (!MapboxTracing.INSTANCE.getPlatformTracingEnabled$maps_sdk_release()) {
            section.invoke();
            return;
        }
        Trace.beginSection("mbx: " + sectionName);
        try {
            section.invoke();
        } finally {
            Trace.endSection();
        }
    }

    public final void addWidget(Widget widget) {
        AbstractC22676k.m65750j(widget, "widget");
        this.widgetRenderer.addWidget(widget);
    }

    public final void destroy$maps_sdk_release() {
        if (!MapboxTracing.INSTANCE.getPlatformTracingEnabled$maps_sdk_release()) {
            MapboxLogger.logI(this.TAG, "destroy");
            ReentrantLock reentrantLock = this.surfaceProcessingLock;
            reentrantLock.lock();
            try {
                if (this.renderHandlerThread.isRunning$maps_sdk_release()) {
                    this.renderHandlerThread.post(new MapboxRenderThread$destroy$1$1$1(this));
                    MapboxLogger.logI(this.TAG, "destroy: waiting until all resources will be cleaned up...");
                    this.destroyCondition.await();
                    MapboxLogger.logI(this.TAG, "destroy: all resources were cleaned up.");
                } else {
                    MapboxLogger.logI(this.TAG, "destroy: render thread is not running.");
                }
                return;
            } finally {
                reentrantLock.unlock();
            }
        }
        Trace.beginSection("mbx: destroy");
        try {
            MapboxLogger.logI(this.TAG, "destroy");
            ReentrantLock reentrantLock2 = this.surfaceProcessingLock;
            reentrantLock2.lock();
            try {
                if (this.renderHandlerThread.isRunning$maps_sdk_release()) {
                    this.renderHandlerThread.post(new MapboxRenderThread$destroy$1$1$1(this));
                    MapboxLogger.logI(this.TAG, "destroy: waiting until all resources will be cleaned up...");
                    this.destroyCondition.await();
                    MapboxLogger.logI(this.TAG, "destroy: all resources were cleaned up.");
                } else {
                    MapboxLogger.logI(this.TAG, "destroy: render thread is not running.");
                }
                reentrantLock2.unlock();
                Trace.endSection();
            } catch (Throwable th3) {
                reentrantLock2.unlock();
                throw th3;
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long frameTimeNanos) {
        RenderThreadStatsRecorder renderThreadStatsRecorder;
        RenderThreadStatsRecorder renderThreadStatsRecorder2;
        if (!MapboxTracing.INSTANCE.getPlatformTracingEnabled$maps_sdk_release()) {
            RenderThreadStatsRecorder renderThreadStatsRecorder3 = this.renderThreadStatsRecorder;
            long jElapsedRealtimeNanos = (renderThreadStatsRecorder3 == null || !renderThreadStatsRecorder3.isRecording()) ? 0L : SystemClock.elapsedRealtimeNanos();
            if (getRenderThreadPrepared() && !this.paused) {
                draw(frameTimeNanos);
            }
            this.awaitingNextVsync = false;
            drainQueue(this.nonRenderEventQueue);
            RenderThreadStatsRecorder renderThreadStatsRecorder4 = this.renderThreadStatsRecorder;
            long jElapsedRealtimeNanos2 = (renderThreadStatsRecorder4 == null || !renderThreadStatsRecorder4.isRecording()) ? 0L : SystemClock.elapsedRealtimeNanos();
            if (jElapsedRealtimeNanos == 0 || jElapsedRealtimeNanos2 == 0 || (renderThreadStatsRecorder = this.renderThreadStatsRecorder) == null) {
                return;
            }
            renderThreadStatsRecorder.addFrameStats$maps_sdk_release((jElapsedRealtimeNanos2 - jElapsedRealtimeNanos) / 1000000.0d, this.fpsManager.getSkippedNow());
            return;
        }
        Trace.beginSection("mbx: do-frame");
        try {
            RenderThreadStatsRecorder renderThreadStatsRecorder5 = this.renderThreadStatsRecorder;
            long jElapsedRealtimeNanos3 = (renderThreadStatsRecorder5 == null || !renderThreadStatsRecorder5.isRecording()) ? 0L : SystemClock.elapsedRealtimeNanos();
            if (getRenderThreadPrepared() && !this.paused) {
                draw(frameTimeNanos);
            }
            this.awaitingNextVsync = false;
            drainQueue(this.nonRenderEventQueue);
            RenderThreadStatsRecorder renderThreadStatsRecorder6 = this.renderThreadStatsRecorder;
            long jElapsedRealtimeNanos4 = (renderThreadStatsRecorder6 == null || !renderThreadStatsRecorder6.isRecording()) ? 0L : SystemClock.elapsedRealtimeNanos();
            if (jElapsedRealtimeNanos3 != 0 && jElapsedRealtimeNanos4 != 0 && (renderThreadStatsRecorder2 = this.renderThreadStatsRecorder) != null) {
                renderThreadStatsRecorder2.addFrameStats$maps_sdk_release((jElapsedRealtimeNanos4 - jElapsedRealtimeNanos3) / 1000000.0d, this.fpsManager.getSkippedNow());
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: getAwaitingNextVsync$maps_sdk_release, reason: from getter */
    public final boolean getAwaitingNextVsync() {
        return this.awaitingNextVsync;
    }

    /* JADX INFO: renamed from: getEglContextMadeCurrent$maps_sdk_release, reason: from getter */
    public final boolean getEglContextMadeCurrent() {
        return this.eglContextMadeCurrent;
    }

    /* JADX INFO: renamed from: getEglCore$maps_sdk_release, reason: from getter */
    public final EGLCore getEglCore() {
        return this.eglCore;
    }

    /* JADX INFO: renamed from: getEglSurface$maps_sdk_release, reason: from getter */
    public final EGLSurface getEglSurface() {
        return this.eglSurface;
    }

    public final OnFpsChangedListener getFpsChangedListener$maps_sdk_release() {
        return (OnFpsChangedListener) this.fpsChangedListener.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: renamed from: getNeedViewAnnotationSync$maps_sdk_release, reason: from getter */
    public final boolean getNeedViewAnnotationSync() {
        return this.needViewAnnotationSync;
    }

    public final ConcurrentLinkedQueue<RenderEvent> getNonRenderEventQueue$maps_sdk_release() {
        return this.nonRenderEventQueue;
    }

    /* JADX INFO: renamed from: getPaused$maps_sdk_release, reason: from getter */
    public final boolean getPaused() {
        return this.paused;
    }

    public final ConcurrentLinkedQueue<RenderEvent> getRenderEventQueue$maps_sdk_release() {
        return this.renderEventQueue;
    }

    /* JADX INFO: renamed from: getRenderHandlerThread$maps_sdk_release, reason: from getter */
    public final RenderHandlerThread getRenderHandlerThread() {
        return this.renderHandlerThread;
    }

    /* JADX INFO: renamed from: getRenderThreadStatsRecorder$maps_sdk_release, reason: from getter */
    public final RenderThreadStatsRecorder getRenderThreadStatsRecorder() {
        return this.renderThreadStatsRecorder;
    }

    /* JADX INFO: renamed from: getSurface$maps_sdk_release, reason: from getter */
    public final Surface getSurface() {
        return this.surface;
    }

    /* JADX INFO: renamed from: getViewAnnotationMode$maps_sdk_release, reason: from getter */
    public final ViewAnnotationUpdateMode getViewAnnotationMode() {
        return this.viewAnnotationMode;
    }

    public final void onSurfaceCreated(Surface surface, int width, int height) {
        AbstractC22676k.m65750j(surface, "surface");
        if (!MapboxTracing.INSTANCE.getPlatformTracingEnabled$maps_sdk_release()) {
            MapboxLogger.logI(this.TAG, "onSurfaceCreated");
            ReentrantLock reentrantLock = this.surfaceProcessingLock;
            reentrantLock.lock();
            try {
                if (this.renderHandlerThread.isRunning$maps_sdk_release()) {
                    this.renderHandlerThread.post(new MapboxRenderThread$onSurfaceCreated$1$1$1(this, surface, width, height));
                    MapboxLogger.logI(this.TAG, "onSurfaceCreated: waiting Android surface to be processed...");
                    this.createCondition.await();
                    MapboxLogger.logI(this.TAG, "onSurfaceCreated: Android surface was processed.");
                } else {
                    MapboxLogger.logI(this.TAG, "onSurfaceCreated: render thread is not running.");
                }
                return;
            } finally {
                reentrantLock.unlock();
            }
        }
        Trace.beginSection("mbx: surface-created");
        try {
            MapboxLogger.logI(this.TAG, "onSurfaceCreated");
            ReentrantLock reentrantLock2 = this.surfaceProcessingLock;
            reentrantLock2.lock();
            try {
                if (this.renderHandlerThread.isRunning$maps_sdk_release()) {
                    this.renderHandlerThread.post(new MapboxRenderThread$onSurfaceCreated$1$1$1(this, surface, width, height));
                    MapboxLogger.logI(this.TAG, "onSurfaceCreated: waiting Android surface to be processed...");
                    this.createCondition.await();
                    MapboxLogger.logI(this.TAG, "onSurfaceCreated: Android surface was processed.");
                } else {
                    MapboxLogger.logI(this.TAG, "onSurfaceCreated: render thread is not running.");
                }
                reentrantLock2.unlock();
                Trace.endSection();
            } catch (Throwable th3) {
                reentrantLock2.unlock();
                throw th3;
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    public final void onSurfaceDestroyed() {
        if (!MapboxTracing.INSTANCE.getPlatformTracingEnabled$maps_sdk_release()) {
            MapboxLogger.logI(this.TAG, "onSurfaceDestroyed");
            ReentrantLock reentrantLock = this.surfaceProcessingLock;
            reentrantLock.lock();
            try {
                if (this.renderHandlerThread.isRunning$maps_sdk_release()) {
                    this.renderHandlerThread.post(new MapboxRenderThread$onSurfaceDestroyed$1$1$1(this));
                    MapboxLogger.logI(this.TAG, "onSurfaceDestroyed: waiting until EGL will be cleaned up...");
                    this.destroyCondition.await();
                    MapboxLogger.logI(this.TAG, "onSurfaceDestroyed: EGL resources were cleaned up.");
                } else {
                    MapboxLogger.logI(this.TAG, "onSurfaceDestroyed: render thread is not running.");
                }
                return;
            } finally {
                reentrantLock.unlock();
            }
        }
        Trace.beginSection("mbx: surface-destroyed");
        try {
            MapboxLogger.logI(this.TAG, "onSurfaceDestroyed");
            ReentrantLock reentrantLock2 = this.surfaceProcessingLock;
            reentrantLock2.lock();
            try {
                if (this.renderHandlerThread.isRunning$maps_sdk_release()) {
                    this.renderHandlerThread.post(new MapboxRenderThread$onSurfaceDestroyed$1$1$1(this));
                    MapboxLogger.logI(this.TAG, "onSurfaceDestroyed: waiting until EGL will be cleaned up...");
                    this.destroyCondition.await();
                    MapboxLogger.logI(this.TAG, "onSurfaceDestroyed: EGL resources were cleaned up.");
                } else {
                    MapboxLogger.logI(this.TAG, "onSurfaceDestroyed: render thread is not running.");
                }
                reentrantLock2.unlock();
                Trace.endSection();
            } catch (Throwable th3) {
                reentrantLock2.unlock();
                throw th3;
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    public final void onSurfaceSizeChanged(int width, int height) {
        if (this.width == width && this.height == height) {
            return;
        }
        this.renderHandlerThread.post(new C55461(width, height));
    }

    public final void pause() {
        this.paused = true;
        MapboxLogger.logI(this.TAG, "Renderer paused");
    }

    public final void processAndroidSurface$maps_sdk_release(Surface surface, int width, int height) {
        AbstractC22676k.m65750j(surface, "surface");
        if (!AbstractC22676k.m65745e(this.surface, surface)) {
            if (this.surface != null) {
                MapboxLogger.logI(this.TAG, "Processing new android surface while current is not null, releasing current EGL and recreating native renderer.");
                releaseAll$default(this, false, 1, null);
            }
            this.surface = surface;
        }
        this.width = width;
        this.height = height;
        this.widgetRenderer.onSurfaceChanged(width, height);
        prepareRenderFrame(true);
    }

    public final void queueRenderEvent(RenderEvent renderEvent) {
        AbstractC22676k.m65750j(renderEvent, "renderEvent");
        if (!renderEvent.getNeedRender()) {
            postNonRenderEvent$default(this, renderEvent, 0L, 2, null);
            return;
        }
        if (renderEvent.getRunnable() != null) {
            this.renderEventQueue.add(renderEvent);
        }
        if (getRenderThreadPrepared()) {
            postPrepareRenderFrame$default(this, 0L, 1, null);
            return;
        }
        Surface surface = this.surface;
        if (surface != null && surface.isValid()) {
            MapboxLogger.logI(this.TAG, "renderThreadPrepared=false but Android surface is valid, trying to recreate EGL...");
            this.renderHandlerThread.post(new C5549xfe4bb508(this, this));
        } else {
            if (this.paused) {
                return;
            }
            String str = this.TAG;
            StringBuilder sb4 = new StringBuilder("renderThreadPrepared=false and Android surface is not valid (isValid=");
            Surface surface2 = this.surface;
            sb4.append(surface2 != null ? Boolean.valueOf(surface2.isValid()) : null);
            sb4.append("). Waiting for new one.");
            MapboxLogger.logI(str, sb4.toString());
        }
    }

    public final boolean removeWidget(Widget widget) {
        AbstractC22676k.m65750j(widget, "widget");
        return this.widgetRenderer.removeWidget(widget);
    }

    public final void resume() {
        this.paused = false;
        String str = this.TAG;
        StringBuilder sb4 = new StringBuilder("Renderer resumed, renderThreadPrepared=");
        sb4.append(getRenderThreadPrepared());
        sb4.append(", surface.isValid=");
        Surface surface = this.surface;
        sb4.append(surface != null ? Boolean.valueOf(surface.isValid()) : null);
        MapboxLogger.logI(str, sb4.toString());
        if (getRenderThreadPrepared()) {
            postPrepareRenderFrame$default(this, 0L, 1, null);
            return;
        }
        Surface surface2 = this.surface;
        if (surface2 != null && surface2.isValid()) {
            MapboxLogger.logI(this.TAG, "renderThreadPrepared=false but Android surface is valid, trying to recreate EGL...");
            this.renderHandlerThread.post(new MapboxRenderThread$resume$$inlined$renderPreparedGuardedRun$1(this, this));
        } else {
            if (this.paused) {
                return;
            }
            String str2 = this.TAG;
            StringBuilder sb5 = new StringBuilder("renderThreadPrepared=false and Android surface is not valid (isValid=");
            Surface surface3 = this.surface;
            sb5.append(surface3 != null ? Boolean.valueOf(surface3.isValid()) : null);
            sb5.append("). Waiting for new one.");
            MapboxLogger.logI(str2, sb5.toString());
        }
    }

    public final void setAwaitingNextVsync$maps_sdk_release(boolean z4) {
        this.awaitingNextVsync = z4;
    }

    public final void setEglContextMadeCurrent$maps_sdk_release(boolean z4) {
        ReentrantLock reentrantLock = this.renderThreadPreparedLock;
        reentrantLock.lock();
        try {
            this.eglContextMadeCurrent = z4;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void setEglSurface$maps_sdk_release(EGLSurface eGLSurface) {
        AbstractC22676k.m65750j(eGLSurface, "<set-?>");
        this.eglSurface = eGLSurface;
    }

    public final void setFpsChangedListener$maps_sdk_release(OnFpsChangedListener onFpsChangedListener) {
        this.fpsChangedListener.setValue(this, $$delegatedProperties[0], onFpsChangedListener);
    }

    public final void setNeedViewAnnotationSync$maps_sdk_release(boolean z4) {
        this.needViewAnnotationSync = z4;
    }

    public final void setPaused$maps_sdk_release(boolean z4) {
        this.paused = z4;
    }

    public final void setRenderThreadStatsRecorder$maps_sdk_release(RenderThreadStatsRecorder renderThreadStatsRecorder) {
        this.renderThreadStatsRecorder = renderThreadStatsRecorder;
    }

    public final void setScreenRefreshRate(int refreshRate) {
        this.renderHandlerThread.post(new C55511(refreshRate));
    }

    public final void setSurface$maps_sdk_release(Surface surface) {
        this.surface = surface;
    }

    public final void setUserRefreshRate(int fps) {
        this.renderHandlerThread.post(new C55521(fps));
    }

    public final void setViewAnnotationMode$maps_sdk_release(ViewAnnotationUpdateMode viewAnnotationUpdateMode) {
        AbstractC22676k.m65750j(viewAnnotationUpdateMode, "<set-?>");
        this.viewAnnotationMode = viewAnnotationUpdateMode;
    }

    public MapboxRenderThread(MapboxRenderer mapboxRenderer, MapboxWidgetRenderer mapboxWidgetRenderer, RenderHandlerThread handlerThread, EGLCore eglCore, FpsManager fpsManager, TextureRenderer widgetTextureRenderer, ReentrantLock surfaceProcessingLock, Condition createCondition, Condition destroyCondition) {
        AbstractC22676k.m65750j(mapboxRenderer, "mapboxRenderer");
        AbstractC22676k.m65750j(mapboxWidgetRenderer, "mapboxWidgetRenderer");
        AbstractC22676k.m65750j(handlerThread, "handlerThread");
        AbstractC22676k.m65750j(eglCore, "eglCore");
        AbstractC22676k.m65750j(fpsManager, "fpsManager");
        AbstractC22676k.m65750j(widgetTextureRenderer, "widgetTextureRenderer");
        AbstractC22676k.m65750j(surfaceProcessingLock, "surfaceProcessingLock");
        AbstractC22676k.m65750j(createCondition, "createCondition");
        AbstractC22676k.m65750j(destroyCondition, "destroyCondition");
        this.renderEventQueue = new ConcurrentLinkedQueue<>();
        this.nonRenderEventQueue = new ConcurrentLinkedQueue<>();
        this.renderThreadPreparedLock = new ReentrantLock();
        final Object obj = null;
        this.fpsChangedListener = new AbstractC14290b(obj) { // from class: com.mapbox.maps.renderer.MapboxRenderThread$special$$inlined$observable$2
            @Override // f93.AbstractC14290b
            public void afterChange(InterfaceC21493z property, OnFpsChangedListener oldValue, OnFpsChangedListener newValue) {
                AbstractC22676k.m65750j(property, "property");
                OnFpsChangedListener onFpsChangedListener = newValue;
                if (AbstractC22676k.m65745e(oldValue, onFpsChangedListener)) {
                    return;
                }
                MapboxRenderThread mapboxRenderThread = this;
                MapboxRenderThread.postNonRenderEvent$default(mapboxRenderThread, new RenderEvent(new MapboxRenderThread$fpsChangedListener$2$1(mapboxRenderThread, onFpsChangedListener), false), 0L, 2, null);
            }
        };
        this.viewAnnotationMode = ViewAnnotationManager.DEFAULT_UPDATE_MODE;
        this.translucentSurface = false;
        this.mapboxRenderer = mapboxRenderer;
        this.widgetRenderer = mapboxWidgetRenderer;
        this.renderHandlerThread = handlerThread;
        this.eglCore = eglCore;
        this.fpsManager = fpsManager;
        this.widgetTextureRenderer = widgetTextureRenderer;
        this.eglSurface = eglCore.getEglNoSurface();
        this.contextMode = ContextMode.UNIQUE;
        this.surfaceProcessingLock = surfaceProcessingLock;
        this.createCondition = createCondition;
        this.destroyCondition = destroyCondition;
        this.TAG = "";
    }
}
