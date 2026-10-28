.class public final Lcom/mapbox/maps/renderer/MapboxRenderThread;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/maps/renderer/MapboxRenderThread$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u001d\n\u0002\u0018\u0002\n\u0002\u0008\u001c\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0001\u0018\u0000 \u00c0\u00012\u00020\u0001:\u0002\u00c0\u0001B9\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fBQ\u0008\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u000e\u0010\u001dJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00082\u0006\u0010\u001f\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008!\u0010\"J\u000f\u0010#\u001a\u00020 H\u0007\u00a2\u0006\u0004\u0008#\u0010$J\u0015\u0010\'\u001a\u00020 2\u0006\u0010&\u001a\u00020%\u00a2\u0006\u0004\u0008\'\u0010(J\u0015\u0010)\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%\u00a2\u0006\u0004\u0008)\u0010*J\'\u0010/\u001a\u00020 2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u001e\u001a\u00020\u00082\u0006\u0010\u001f\u001a\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008-\u0010.J\u0017\u00101\u001a\u00020 2\u0006\u00100\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u00081\u00102J\'\u00103\u001a\u00020 2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u001e\u001a\u00020\u00082\u0006\u0010\u001f\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u00083\u0010.J\u0017\u00105\u001a\u00020 2\u0006\u00104\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u00085\u00102J\u0017\u00108\u001a\u00020 2\u0006\u00107\u001a\u000206H\u0016\u00a2\u0006\u0004\u00088\u00109J\u0017\u0010<\u001a\u00020 2\u0006\u0010;\u001a\u00020:H\u0007\u00a2\u0006\u0004\u0008<\u0010=J\u000f\u0010>\u001a\u00020 H\u0007\u00a2\u0006\u0004\u0008>\u0010$J\u000f\u0010?\u001a\u00020 H\u0007\u00a2\u0006\u0004\u0008?\u0010$J\u000f\u0010A\u001a\u00020 H\u0001\u00a2\u0006\u0004\u0008@\u0010$J&\u0010E\u001a\u00020 2\u0006\u0010B\u001a\u00020\u000c2\u000c\u0010D\u001a\u0008\u0012\u0004\u0012\u00020 0CH\u0082\u0008\u00a2\u0006\u0004\u0008E\u0010FJ\u0019\u0010H\u001a\u00020 2\u0008\u0008\u0002\u0010G\u001a\u000206H\u0002\u00a2\u0006\u0004\u0008H\u00109J\u0017\u0010J\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008J\u0010KJ\u000f\u0010L\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008L\u0010MJ\u000f\u0010N\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008N\u0010MJ\u0017\u0010O\u001a\u00020\u00062\u0006\u0010,\u001a\u00020+H\u0002\u00a2\u0006\u0004\u0008O\u0010PJ\u000f\u0010Q\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008Q\u0010MJ\u000f\u0010R\u001a\u00020 H\u0002\u00a2\u0006\u0004\u0008R\u0010$J\u000f\u0010S\u001a\u00020 H\u0002\u00a2\u0006\u0004\u0008S\u0010$J\u000f\u0010T\u001a\u00020 H\u0002\u00a2\u0006\u0004\u0008T\u0010$J\u0017\u0010U\u001a\u00020 2\u0006\u00107\u001a\u000206H\u0002\u00a2\u0006\u0004\u0008U\u00109J\u000f\u0010V\u001a\u00020 H\u0002\u00a2\u0006\u0004\u0008V\u0010$J\u000f\u0010W\u001a\u00020 H\u0002\u00a2\u0006\u0004\u0008W\u0010$J\u0019\u0010Y\u001a\u00020 2\u0008\u0008\u0002\u0010X\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008Y\u0010ZJ\u0019\u0010[\u001a\u00020 2\u0008\u0008\u0002\u0010I\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008[\u0010ZJ \u0010]\u001a\u00020 2\u000e\u0008\u0004\u0010\\\u001a\u0008\u0012\u0004\u0012\u00020 0CH\u0082\u0008\u00a2\u0006\u0004\u0008]\u0010^J!\u0010_\u001a\u00020 2\u0006\u0010;\u001a\u00020:2\u0008\u0008\u0002\u0010G\u001a\u000206H\u0002\u00a2\u0006\u0004\u0008_\u0010`J\u001d\u0010c\u001a\u00020 2\u000c\u0010b\u001a\u0008\u0012\u0004\u0012\u00020:0aH\u0002\u00a2\u0006\u0004\u0008c\u0010dR\u001a\u0010e\u001a\u00020\u00108\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008e\u0010f\u001a\u0004\u0008g\u0010hR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010iR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010jR\u001a\u0010\u0013\u001a\u00020\u00128\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010k\u001a\u0004\u0008l\u0010mR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010nR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010oR\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010oR&\u0010p\u001a\u0008\u0012\u0004\u0012\u00020:0a8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008p\u0010q\u0012\u0004\u0008t\u0010$\u001a\u0004\u0008r\u0010sR&\u0010u\u001a\u0008\u0012\u0004\u0012\u00020:0a8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008u\u0010q\u0012\u0004\u0008w\u0010$\u001a\u0004\u0008v\u0010sR*\u0010,\u001a\u0004\u0018\u00010+8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008,\u0010x\u0012\u0004\u0008}\u0010$\u001a\u0004\u0008y\u0010z\"\u0004\u0008{\u0010|R.\u0010\u007f\u001a\u00020~8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u001e\n\u0005\u0008\u007f\u0010\u0080\u0001\u0012\u0005\u0008\u0085\u0001\u0010$\u001a\u0006\u0008\u0081\u0001\u0010\u0082\u0001\"\u0006\u0008\u0083\u0001\u0010\u0084\u0001R\u0017\u0010\u001e\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u001e\u0010\u0086\u0001R\u0017\u0010\u001f\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u001f\u0010\u0086\u0001R\u0017\u0010\u0087\u0001\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u0089\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0089\u0001\u0010iR\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0017\u0010\u008a\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u000b\u0010\u008b\u0001R-\u0010\u008c\u0001\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e\u00a2\u0006\u001c\n\u0005\u0008\u008c\u0001\u0010i\u0012\u0005\u0008\u008f\u0001\u0010$\u001a\u0005\u0008\u008d\u0001\u0010M\"\u0005\u0008\u008e\u0001\u0010ZR\u0018\u0010\u0090\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0090\u0001\u0010iR-\u0010\u0091\u0001\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e\u00a2\u0006\u001c\n\u0005\u0008\u0091\u0001\u0010i\u0012\u0005\u0008\u0094\u0001\u0010$\u001a\u0005\u0008\u0092\u0001\u0010M\"\u0005\u0008\u0093\u0001\u0010ZR3\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0000@\u0000X\u0080\u000e\u00a2\u0006\u001f\n\u0006\u0008\u0096\u0001\u0010\u0097\u0001\u0012\u0005\u0008\u009c\u0001\u0010$\u001a\u0006\u0008\u0098\u0001\u0010\u0099\u0001\"\u0006\u0008\u009a\u0001\u0010\u009b\u0001R(\u0010\u009e\u0001\u001a\u00020\u00062\u0007\u0010\u009d\u0001\u001a\u00020\u00068\u0002@BX\u0082\u000e\u00a2\u0006\u000e\n\u0005\u0008\u009e\u0001\u0010i\"\u0005\u0008\u009f\u0001\u0010ZR6\u0010\u00a0\u0001\u001a\u00020\u00062\u0007\u0010\u009d\u0001\u001a\u00020\u00068\u0000@@X\u0081\u000e\u00a2\u0006\u001c\n\u0005\u0008\u00a0\u0001\u0010i\u0012\u0005\u0008\u00a3\u0001\u0010$\u001a\u0005\u0008\u00a1\u0001\u0010M\"\u0005\u0008\u00a2\u0001\u0010ZR\u0016\u0010\u00a4\u0001\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u00a4\u0001\u0010nR\u0018\u0010\u00a5\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u00a5\u0001\u0010iR\u0018\u0010\u00a6\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u00a6\u0001\u0010iR9\u0010\u00af\u0001\u001a\u0005\u0018\u00010\u00a7\u00012\n\u0010\u00a8\u0001\u001a\u0005\u0018\u00010\u00a7\u00018@@@X\u0080\u008e\u0002\u00a2\u0006\u0018\n\u0006\u0008\u00a9\u0001\u0010\u00aa\u0001\u001a\u0006\u0008\u00ab\u0001\u0010\u00ac\u0001\"\u0006\u0008\u00ad\u0001\u0010\u00ae\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0015\u0010\u00b0\u0001R&\u0010\u00b1\u0001\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0015\n\u0005\u0008\u00b1\u0001\u0010i\u001a\u0005\u0008\u00b2\u0001\u0010M\"\u0005\u0008\u00b3\u0001\u0010ZR*\u0010\u00b5\u0001\u001a\u00030\u00b4\u00018\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00b5\u0001\u0010\u00b6\u0001\u001a\u0006\u0008\u00b7\u0001\u0010\u00b8\u0001\"\u0006\u0008\u00b9\u0001\u0010\u00ba\u0001R\u001e\u0010\u00bb\u0001\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u000f\n\u0006\u0008\u00bb\u0001\u0010\u00bc\u0001\u0012\u0005\u0008\u00bd\u0001\u0010$R\u0016\u0010\u00bf\u0001\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00be\u0001\u0010M\u00a8\u0006\u00c1\u0001"
    }
    d2 = {
        "Lcom/mapbox/maps/renderer/MapboxRenderThread;",
        "Landroid/view/Choreographer$FrameCallback;",
        "Lcom/mapbox/maps/renderer/MapboxRenderer;",
        "mapboxRenderer",
        "Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;",
        "mapboxWidgetRenderer",
        "",
        "translucentSurface",
        "",
        "antialiasingSampleCount",
        "Lcom/mapbox/maps/ContextMode;",
        "contextMode",
        "",
        "mapName",
        "<init>",
        "(Lcom/mapbox/maps/renderer/MapboxRenderer;Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;ZILcom/mapbox/maps/ContextMode;Ljava/lang/String;)V",
        "Lcom/mapbox/maps/renderer/RenderHandlerThread;",
        "handlerThread",
        "Lcom/mapbox/maps/renderer/egl/EGLCore;",
        "eglCore",
        "Lcom/mapbox/maps/renderer/FpsManager;",
        "fpsManager",
        "Lcom/mapbox/maps/renderer/gl/TextureRenderer;",
        "widgetTextureRenderer",
        "Ljava/util/concurrent/locks/ReentrantLock;",
        "surfaceProcessingLock",
        "Ljava/util/concurrent/locks/Condition;",
        "createCondition",
        "destroyCondition",
        "(Lcom/mapbox/maps/renderer/MapboxRenderer;Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;Lcom/mapbox/maps/renderer/RenderHandlerThread;Lcom/mapbox/maps/renderer/egl/EGLCore;Lcom/mapbox/maps/renderer/FpsManager;Lcom/mapbox/maps/renderer/gl/TextureRenderer;Ljava/util/concurrent/locks/ReentrantLock;Ljava/util/concurrent/locks/Condition;Ljava/util/concurrent/locks/Condition;)V",
        "width",
        "height",
        "Ll83/a0;",
        "onSurfaceSizeChanged",
        "(II)V",
        "onSurfaceDestroyed",
        "()V",
        "Lcom/mapbox/maps/renderer/widget/Widget;",
        "widget",
        "addWidget",
        "(Lcom/mapbox/maps/renderer/widget/Widget;)V",
        "removeWidget",
        "(Lcom/mapbox/maps/renderer/widget/Widget;)Z",
        "Landroid/view/Surface;",
        "surface",
        "processAndroidSurface$maps_sdk_release",
        "(Landroid/view/Surface;II)V",
        "processAndroidSurface",
        "refreshRate",
        "setScreenRefreshRate",
        "(I)V",
        "onSurfaceCreated",
        "fps",
        "setUserRefreshRate",
        "",
        "frameTimeNanos",
        "doFrame",
        "(J)V",
        "Lcom/mapbox/maps/renderer/RenderEvent;",
        "renderEvent",
        "queueRenderEvent",
        "(Lcom/mapbox/maps/renderer/RenderEvent;)V",
        "pause",
        "resume",
        "destroy$maps_sdk_release",
        "destroy",
        "sectionName",
        "Lkotlin/Function0;",
        "section",
        "trace",
        "(Ljava/lang/String;Lc93/a;)V",
        "delayMillis",
        "postPrepareRenderFrame",
        "creatingSurface",
        "setUpRenderThread",
        "(Z)Z",
        "checkEglConfig",
        "()Z",
        "checkAndroidSurface",
        "checkEglSurface",
        "(Landroid/view/Surface;)Z",
        "checkEglContextCurrent",
        "checkSurfaceSizeChanged",
        "checkWidgetRender",
        "resetGlState",
        "draw",
        "swapBuffers",
        "releaseEglSurface",
        "tryRecreate",
        "releaseAll",
        "(Z)V",
        "prepareRenderFrame",
        "block",
        "renderPreparedGuardedRun",
        "(Lc93/a;)V",
        "postNonRenderEvent",
        "(Lcom/mapbox/maps/renderer/RenderEvent;J)V",
        "Ljava/util/concurrent/ConcurrentLinkedQueue;",
        "originalQueue",
        "drainQueue",
        "(Ljava/util/concurrent/ConcurrentLinkedQueue;)V",
        "renderHandlerThread",
        "Lcom/mapbox/maps/renderer/RenderHandlerThread;",
        "getRenderHandlerThread$maps_sdk_release",
        "()Lcom/mapbox/maps/renderer/RenderHandlerThread;",
        "Z",
        "Lcom/mapbox/maps/renderer/MapboxRenderer;",
        "Lcom/mapbox/maps/renderer/egl/EGLCore;",
        "getEglCore$maps_sdk_release",
        "()Lcom/mapbox/maps/renderer/egl/EGLCore;",
        "Ljava/util/concurrent/locks/ReentrantLock;",
        "Ljava/util/concurrent/locks/Condition;",
        "renderEventQueue",
        "Ljava/util/concurrent/ConcurrentLinkedQueue;",
        "getRenderEventQueue$maps_sdk_release",
        "()Ljava/util/concurrent/ConcurrentLinkedQueue;",
        "getRenderEventQueue$maps_sdk_release$annotations",
        "nonRenderEventQueue",
        "getNonRenderEventQueue$maps_sdk_release",
        "getNonRenderEventQueue$maps_sdk_release$annotations",
        "Landroid/view/Surface;",
        "getSurface$maps_sdk_release",
        "()Landroid/view/Surface;",
        "setSurface$maps_sdk_release",
        "(Landroid/view/Surface;)V",
        "getSurface$maps_sdk_release$annotations",
        "Landroid/opengl/EGLSurface;",
        "eglSurface",
        "Landroid/opengl/EGLSurface;",
        "getEglSurface$maps_sdk_release",
        "()Landroid/opengl/EGLSurface;",
        "setEglSurface$maps_sdk_release",
        "(Landroid/opengl/EGLSurface;)V",
        "getEglSurface$maps_sdk_release$annotations",
        "I",
        "widgetRenderer",
        "Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;",
        "widgetRenderCreated",
        "Lcom/mapbox/maps/renderer/gl/TextureRenderer;",
        "Lcom/mapbox/maps/ContextMode;",
        "awaitingNextVsync",
        "getAwaitingNextVsync$maps_sdk_release",
        "setAwaitingNextVsync$maps_sdk_release",
        "getAwaitingNextVsync$maps_sdk_release$annotations",
        "sizeChanged",
        "paused",
        "getPaused$maps_sdk_release",
        "setPaused$maps_sdk_release",
        "getPaused$maps_sdk_release$annotations",
        "Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;",
        "renderThreadStatsRecorder",
        "Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;",
        "getRenderThreadStatsRecorder$maps_sdk_release",
        "()Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;",
        "setRenderThreadStatsRecorder$maps_sdk_release",
        "(Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;)V",
        "getRenderThreadStatsRecorder$maps_sdk_release$annotations",
        "value",
        "nativeRenderCreated",
        "setNativeRenderCreated",
        "eglContextMadeCurrent",
        "getEglContextMadeCurrent$maps_sdk_release",
        "setEglContextMadeCurrent$maps_sdk_release",
        "getEglContextMadeCurrent$maps_sdk_release$annotations",
        "renderThreadPreparedLock",
        "eglContextCreated",
        "renderNotSupported",
        "Lcom/mapbox/maps/renderer/OnFpsChangedListener;",
        "<set-?>",
        "fpsChangedListener$delegate",
        "Lf93/d;",
        "getFpsChangedListener$maps_sdk_release",
        "()Lcom/mapbox/maps/renderer/OnFpsChangedListener;",
        "setFpsChangedListener$maps_sdk_release",
        "(Lcom/mapbox/maps/renderer/OnFpsChangedListener;)V",
        "fpsChangedListener",
        "Lcom/mapbox/maps/renderer/FpsManager;",
        "needViewAnnotationSync",
        "getNeedViewAnnotationSync$maps_sdk_release",
        "setNeedViewAnnotationSync$maps_sdk_release",
        "Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;",
        "viewAnnotationMode",
        "Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;",
        "getViewAnnotationMode$maps_sdk_release",
        "()Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;",
        "setViewAnnotationMode$maps_sdk_release",
        "(Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;)V",
        "TAG",
        "Ljava/lang/String;",
        "getTAG$annotations",
        "getRenderThreadPrepared",
        "renderThreadPrepared",
        "Companion",
        "maps-sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field static final synthetic $$delegatedProperties:[Lj93/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lj93/z;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/mapbox/maps/renderer/MapboxRenderThread$Companion;

.field public static final RETRY_DELAY_MS:J = 0x32L


# instance fields
.field private final TAG:Ljava/lang/String;

.field private volatile awaitingNextVsync:Z

.field private final contextMode:Lcom/mapbox/maps/ContextMode;

.field private final createCondition:Ljava/util/concurrent/locks/Condition;

.field private final destroyCondition:Ljava/util/concurrent/locks/Condition;

.field private eglContextCreated:Z

.field private eglContextMadeCurrent:Z

.field private final eglCore:Lcom/mapbox/maps/renderer/egl/EGLCore;

.field private eglSurface:Landroid/opengl/EGLSurface;

.field private final fpsChangedListener$delegate:Lf93/d;

.field private final fpsManager:Lcom/mapbox/maps/renderer/FpsManager;

.field private height:I

.field private final mapboxRenderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

.field private nativeRenderCreated:Z

.field private needViewAnnotationSync:Z

.field private final nonRenderEventQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/mapbox/maps/renderer/RenderEvent;",
            ">;"
        }
    .end annotation
.end field

.field private volatile paused:Z

.field private final renderEventQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/mapbox/maps/renderer/RenderEvent;",
            ">;"
        }
    .end annotation
.end field

.field private final renderHandlerThread:Lcom/mapbox/maps/renderer/RenderHandlerThread;

.field private renderNotSupported:Z

.field private final renderThreadPreparedLock:Ljava/util/concurrent/locks/ReentrantLock;

.field private renderThreadStatsRecorder:Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;

.field private sizeChanged:Z

.field private surface:Landroid/view/Surface;

.field private final surfaceProcessingLock:Ljava/util/concurrent/locks/ReentrantLock;

.field private final translucentSurface:Z

.field private volatile viewAnnotationMode:Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;

.field private widgetRenderCreated:Z

.field private final widgetRenderer:Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;

.field private final widgetTextureRenderer:Lcom/mapbox/maps/renderer/gl/TextureRenderer;

.field private width:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/q;

    const-class v1, Lcom/mapbox/maps/renderer/MapboxRenderThread;

    const-string v2, "fpsChangedListener"

    const-string v3, "getFpsChangedListener$maps_sdk_release()Lcom/mapbox/maps/renderer/OnFpsChangedListener;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->mutableProperty1(Lkotlin/jvm/internal/p;)Lj93/l;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Lcom/mapbox/maps/renderer/MapboxRenderThread;->$$delegatedProperties:[Lj93/z;

    new-instance v0, Lcom/mapbox/maps/renderer/MapboxRenderThread$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/maps/renderer/MapboxRenderThread$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->Companion:Lcom/mapbox/maps/renderer/MapboxRenderThread$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/mapbox/maps/renderer/MapboxRenderer;Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;Lcom/mapbox/maps/renderer/RenderHandlerThread;Lcom/mapbox/maps/renderer/egl/EGLCore;Lcom/mapbox/maps/renderer/FpsManager;Lcom/mapbox/maps/renderer/gl/TextureRenderer;Ljava/util/concurrent/locks/ReentrantLock;Ljava/util/concurrent/locks/Condition;Ljava/util/concurrent/locks/Condition;)V
    .locals 2

    const-string v0, "mapboxRenderer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapboxWidgetRenderer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handlerThread"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eglCore"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fpsManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "widgetTextureRenderer"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "surfaceProcessingLock"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createCondition"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destroyCondition"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderEventQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 24
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->nonRenderEventQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 25
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderThreadPreparedLock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 26
    new-instance v0, Lcom/mapbox/maps/renderer/MapboxRenderThread$special$$inlined$observable$2;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread$special$$inlined$observable$2;-><init>(Ljava/lang/Object;Lcom/mapbox/maps/renderer/MapboxRenderThread;)V

    .line 27
    iput-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->fpsChangedListener$delegate:Lf93/d;

    .line 28
    sget-object v0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManager;->DEFAULT_UPDATE_MODE:Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;

    iput-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->viewAnnotationMode:Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;

    const/4 v0, 0x0

    .line 29
    iput-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->translucentSurface:Z

    .line 30
    iput-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->mapboxRenderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    .line 31
    iput-object p2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->widgetRenderer:Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;

    .line 32
    iput-object p3, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderHandlerThread:Lcom/mapbox/maps/renderer/RenderHandlerThread;

    .line 33
    iput-object p4, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglCore:Lcom/mapbox/maps/renderer/egl/EGLCore;

    .line 34
    iput-object p5, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->fpsManager:Lcom/mapbox/maps/renderer/FpsManager;

    .line 35
    iput-object p6, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->widgetTextureRenderer:Lcom/mapbox/maps/renderer/gl/TextureRenderer;

    .line 36
    invoke-virtual {p4}, Lcom/mapbox/maps/renderer/egl/EGLCore;->getEglNoSurface$maps_sdk_release()Landroid/opengl/EGLSurface;

    move-result-object p1

    iput-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglSurface:Landroid/opengl/EGLSurface;

    .line 37
    sget-object p1, Lcom/mapbox/maps/ContextMode;->UNIQUE:Lcom/mapbox/maps/ContextMode;

    iput-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->contextMode:Lcom/mapbox/maps/ContextMode;

    .line 38
    iput-object p7, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->surfaceProcessingLock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 39
    iput-object p8, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->createCondition:Ljava/util/concurrent/locks/Condition;

    .line 40
    iput-object p9, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->destroyCondition:Ljava/util/concurrent/locks/Condition;

    .line 41
    const-string p1, ""

    iput-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/mapbox/maps/renderer/MapboxRenderer;Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;ZILcom/mapbox/maps/ContextMode;Ljava/lang/String;)V
    .locals 9

    const-string v0, "mapboxRenderer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapboxWidgetRenderer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contextMode"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapName"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderEventQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 3
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->nonRenderEventQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 4
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderThreadPreparedLock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 5
    new-instance v0, Lcom/mapbox/maps/renderer/MapboxRenderThread$special$$inlined$observable$1;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread$special$$inlined$observable$1;-><init>(Ljava/lang/Object;Lcom/mapbox/maps/renderer/MapboxRenderThread;)V

    .line 6
    iput-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->fpsChangedListener$delegate:Lf93/d;

    .line 7
    sget-object v0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManager;->DEFAULT_UPDATE_MODE:Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;

    iput-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->viewAnnotationMode:Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;

    .line 8
    iput-boolean p3, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->translucentSurface:Z

    .line 9
    iput-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->mapboxRenderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    .line 10
    iput-object p2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->widgetRenderer:Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;

    .line 11
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Mbgl-RenderThread"

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p6}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_0

    const-string p2, "\\"

    invoke-virtual {p2, p6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const-string p2, ""

    :goto_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    .line 12
    new-instance v2, Lcom/mapbox/maps/renderer/egl/EGLCore;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    move v3, p3

    move v4, p4

    move-object v6, p6

    invoke-direct/range {v2 .. v8}, Lcom/mapbox/maps/renderer/egl/EGLCore;-><init>(ZILandroid/opengl/EGLContext;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglCore:Lcom/mapbox/maps/renderer/egl/EGLCore;

    .line 13
    invoke-virtual {v2}, Lcom/mapbox/maps/renderer/egl/EGLCore;->getEglNoSurface$maps_sdk_release()Landroid/opengl/EGLSurface;

    move-result-object p1

    iput-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglSurface:Landroid/opengl/EGLSurface;

    .line 14
    new-instance p1, Lcom/mapbox/maps/renderer/gl/TextureRenderer;

    const/4 p2, 0x0

    const/4 p3, 0x1

    invoke-direct {p1, p2, p3, v1}, Lcom/mapbox/maps/renderer/gl/TextureRenderer;-><init>(FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->widgetTextureRenderer:Lcom/mapbox/maps/renderer/gl/TextureRenderer;

    .line 15
    iput-object p5, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->contextMode:Lcom/mapbox/maps/ContextMode;

    .line 16
    new-instance p1, Lcom/mapbox/maps/renderer/RenderHandlerThread;

    invoke-direct {p1, v6}, Lcom/mapbox/maps/renderer/RenderHandlerThread;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderHandlerThread:Lcom/mapbox/maps/renderer/RenderHandlerThread;

    .line 17
    invoke-virtual {p1}, Lcom/mapbox/maps/renderer/RenderHandlerThread;->start()Landroid/os/Handler;

    move-result-object p1

    .line 18
    new-instance p2, Lcom/mapbox/maps/renderer/FpsManager;

    invoke-direct {p2, p1, v6}, Lcom/mapbox/maps/renderer/FpsManager;-><init>(Landroid/os/Handler;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->fpsManager:Lcom/mapbox/maps/renderer/FpsManager;

    .line 19
    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->surfaceProcessingLock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 20
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object p2

    const-string p3, "surfaceProcessingLock.newCondition()"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->createCondition:Ljava/util/concurrent/locks/Condition;

    .line 21
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->destroyCondition:Ljava/util/concurrent/locks/Condition;

    return-void
.end method

.method public static synthetic a(Lcom/mapbox/maps/renderer/MapboxRenderThread;J)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->draw$lambda$5(Lcom/mapbox/maps/renderer/MapboxRenderThread;J)V

    return-void
.end method

.method public static final synthetic access$getCreateCondition$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Ljava/util/concurrent/locks/Condition;
    .locals 0

    iget-object p0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->createCondition:Ljava/util/concurrent/locks/Condition;

    return-object p0
.end method

.method public static final synthetic access$getDestroyCondition$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Ljava/util/concurrent/locks/Condition;
    .locals 0

    iget-object p0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->destroyCondition:Ljava/util/concurrent/locks/Condition;

    return-object p0
.end method

.method public static final synthetic access$getFpsManager$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Lcom/mapbox/maps/renderer/FpsManager;
    .locals 0

    iget-object p0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->fpsManager:Lcom/mapbox/maps/renderer/FpsManager;

    return-object p0
.end method

.method public static final synthetic access$getMapboxRenderer$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Lcom/mapbox/maps/renderer/MapboxRenderer;
    .locals 0

    iget-object p0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->mapboxRenderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    return-object p0
.end method

.method public static final synthetic access$getNativeRenderCreated$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->nativeRenderCreated:Z

    return p0
.end method

.method public static final synthetic access$getRenderThreadPrepared(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Z
    .locals 0

    invoke-direct {p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->getRenderThreadPrepared()Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getSurfaceProcessingLock$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Ljava/util/concurrent/locks/ReentrantLock;
    .locals 0

    iget-object p0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->surfaceProcessingLock:Ljava/util/concurrent/locks/ReentrantLock;

    return-object p0
.end method

.method public static final synthetic access$getTAG$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$postNonRenderEvent(Lcom/mapbox/maps/renderer/MapboxRenderThread;Lcom/mapbox/maps/renderer/RenderEvent;J)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->postNonRenderEvent(Lcom/mapbox/maps/renderer/RenderEvent;J)V

    return-void
.end method

.method public static final synthetic access$releaseEglSurface(Lcom/mapbox/maps/renderer/MapboxRenderThread;)V
    .locals 0

    invoke-direct {p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->releaseEglSurface()V

    return-void
.end method

.method public static final synthetic access$setHeight$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;I)V
    .locals 0

    iput p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->height:I

    return-void
.end method

.method public static final synthetic access$setSizeChanged$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->sizeChanged:Z

    return-void
.end method

.method public static final synthetic access$setUpRenderThread(Lcom/mapbox/maps/renderer/MapboxRenderThread;Z)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->setUpRenderThread(Z)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$setWidth$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;I)V
    .locals 0

    iput p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->width:I

    return-void
.end method

.method private final checkAndroidSurface()Z
    .locals 3

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->surface:Landroid/view/Surface;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Surface;->isValid()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "EGL was configured but Android surface.isValid="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->surface:Landroid/view/Surface;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/view/Surface;->isValid()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", waiting for a new one..."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v0, 0x32

    invoke-direct {p0, v0, v1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->postPrepareRenderFrame(J)V

    const/4 v0, 0x0

    return v0
.end method

.method private final checkEglConfig()Z
    .locals 3

    iget-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglContextCreated:Z

    const/4 v1, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglCore:Lcom/mapbox/maps/renderer/egl/EGLCore;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/egl/EGLCore;->prepareEgl()Z

    move-result v0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglContextCreated:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    const-string v2, "EGL was not configured, please check logs above."

    invoke-static {v0, v2}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    iput-boolean v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderNotSupported:Z

    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    return v1
.end method

.method private final checkEglContextCurrent()Z
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglCore:Lcom/mapbox/maps/renderer/egl/EGLCore;

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglSurface:Landroid/opengl/EGLSurface;

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/renderer/egl/EGLCore;->makeCurrent(Landroid/opengl/EGLSurface;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    const-string v1, "EGL was configured but context could not be made current. Trying again in a moment..."

    invoke-static {v0, v1}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v0, 0x32

    invoke-direct {p0, v0, v1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->postPrepareRenderFrame(J)V

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method private final checkEglSurface(Landroid/view/Surface;)Z
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglSurface:Landroid/opengl/EGLSurface;

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglCore:Lcom/mapbox/maps/renderer/egl/EGLCore;

    invoke-virtual {v1}, Lcom/mapbox/maps/renderer/egl/EGLCore;->getEglNoSurface$maps_sdk_release()Landroid/opengl/EGLSurface;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglCore:Lcom/mapbox/maps/renderer/egl/EGLCore;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/renderer/egl/EGLCore;->createWindowSurface(Landroid/view/Surface;)Landroid/opengl/EGLSurface;

    move-result-object p1

    iput-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglSurface:Landroid/opengl/EGLSurface;

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglCore:Lcom/mapbox/maps/renderer/egl/EGLCore;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/egl/EGLCore;->getEglNoSurface$maps_sdk_release()Landroid/opengl/EGLSurface;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    const-string v0, "Could not create EGL surface although Android surface was valid, retrying in 50 ms..."

    invoke-static {p1, v0}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v0, 0x32

    invoke-direct {p0, v0, v1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->postPrepareRenderFrame(J)V

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private final checkSurfaceSizeChanged()V
    .locals 3

    iget-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->sizeChanged:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->mapboxRenderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    iget v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->width:I

    iget v2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->height:I

    invoke-virtual {v0, v1, v2}, Lcom/mapbox/maps/renderer/MapboxRenderer;->onSurfaceChanged(II)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->widgetRenderer:Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;

    iget v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->width:I

    iget v2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->height:I

    invoke-virtual {v0, v1, v2}, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->onSurfaceChanged(II)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->sizeChanged:Z

    :cond_0
    return-void
.end method

.method private final checkWidgetRender()V
    .locals 2

    iget-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglContextCreated:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->widgetRenderCreated:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->widgetRenderer:Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->hasWidgets()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->widgetRenderer:Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglCore:Lcom/mapbox/maps/renderer/egl/EGLCore;

    invoke-virtual {v1}, Lcom/mapbox/maps/renderer/egl/EGLCore;->getEglContext$maps_sdk_release()Landroid/opengl/EGLContext;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->setSharedContext(Landroid/opengl/EGLContext;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->widgetRenderCreated:Z

    :cond_0
    return-void
.end method

.method private final drainQueue(Ljava/util/concurrent/ConcurrentLinkedQueue;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/mapbox/maps/renderer/RenderEvent;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mapbox/maps/renderer/RenderEvent;

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/RenderEvent;->getRunnable()Ljava/lang/Runnable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mapbox/maps/renderer/RenderEvent;

    goto :goto_0

    :cond_1
    return-void
.end method

.method private final draw(J)V
    .locals 4

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->fpsManager:Lcom/mapbox/maps/renderer/FpsManager;

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderThreadStatsRecorder:Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;->isRecording()Z

    move-result v1

    if-ne v1, v3, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-virtual {v0, p1, p2, v1}, Lcom/mapbox/maps/renderer/FpsManager;->preRender(JZ)Z

    move-result p1

    if-nez p1, :cond_1

    const-wide/16 p1, 0x0

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v3, v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->postPrepareRenderFrame$default(Lcom/mapbox/maps/renderer/MapboxRenderThread;JILjava/lang/Object;)V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->contextMode:Lcom/mapbox/maps/ContextMode;

    sget-object p2, Lcom/mapbox/maps/ContextMode;->SHARED:Lcom/mapbox/maps/ContextMode;

    if-ne p1, p2, :cond_2

    const/16 p1, 0x4500

    invoke-static {p1}, Landroid/opengl/GLES20;->glClear(I)V

    :cond_2
    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->widgetRenderer:Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;

    invoke-virtual {p1}, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->hasWidgets()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->widgetRenderer:Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;

    invoke-virtual {p1}, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->getNeedRender()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->widgetRenderer:Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;

    invoke-virtual {p1}, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->renderToFrameBuffer()V

    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglCore:Lcom/mapbox/maps/renderer/egl/EGLCore;

    iget-object p2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglSurface:Landroid/opengl/EGLSurface;

    invoke-virtual {p1, p2}, Lcom/mapbox/maps/renderer/egl/EGLCore;->makeCurrent(Landroid/opengl/EGLSurface;)Z

    :cond_3
    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->mapboxRenderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    invoke-virtual {p1}, Lcom/mapbox/maps/renderer/MapboxRenderer;->render()V

    invoke-direct {p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->resetGlState()V

    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->widgetRenderer:Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;

    invoke-virtual {p1}, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->hasTexture()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->widgetTextureRenderer:Lcom/mapbox/maps/renderer/gl/TextureRenderer;

    iget-object p2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->widgetRenderer:Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;

    invoke-virtual {p2}, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->getTexture()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->render(I)V

    goto :goto_1

    :cond_4
    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->mapboxRenderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    invoke-virtual {p1}, Lcom/mapbox/maps/renderer/MapboxRenderer;->render()V

    :cond_5
    :goto_1
    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderEventQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {p0, p1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->drainQueue(Ljava/util/concurrent/ConcurrentLinkedQueue;)V

    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->fpsManager:Lcom/mapbox/maps/renderer/FpsManager;

    invoke-virtual {p1}, Lcom/mapbox/maps/renderer/FpsManager;->postRender()V

    iget-boolean p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->needViewAnnotationSync:Z

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->viewAnnotationMode:Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;

    sget-object p2, Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;->MAP_SYNCHRONIZED:Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object p1

    new-instance p2, Lcom/mapbox/maps/renderer/a;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, Lcom/mapbox/maps/renderer/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    invoke-static {}, Landroid/opengl/GLES20;->glFlush()V

    goto :goto_2

    :cond_6
    invoke-direct {p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->swapBuffers()V

    :goto_2
    iput-boolean v2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->needViewAnnotationSync:Z

    return-void
.end method

.method private static final draw$lambda$5(Lcom/mapbox/maps/renderer/MapboxRenderThread;J)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->swapBuffers()V

    return-void
.end method

.method public static synthetic getAwaitingNextVsync$maps_sdk_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getEglContextMadeCurrent$maps_sdk_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getEglSurface$maps_sdk_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getNonRenderEventQueue$maps_sdk_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getPaused$maps_sdk_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getRenderEventQueue$maps_sdk_release$annotations()V
    .locals 0

    return-void
.end method

.method private final getRenderThreadPrepared()Z
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderThreadPreparedLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-boolean v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglContextMadeCurrent:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->nativeRenderCreated:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return v1

    :goto_1
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method

.method public static synthetic getRenderThreadStatsRecorder$maps_sdk_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getSurface$maps_sdk_release$annotations()V
    .locals 0

    return-void
.end method

.method private static synthetic getTAG$annotations()V
    .locals 0

    return-void
.end method

.method private final postNonRenderEvent(Lcom/mapbox/maps/renderer/RenderEvent;J)V
    .locals 2

    iget-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->awaitingNextVsync:Z

    if-eqz v0, :cond_0

    iget-object p2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->nonRenderEventQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderHandlerThread:Lcom/mapbox/maps/renderer/RenderHandlerThread;

    new-instance v1, Lcom/mapbox/maps/renderer/MapboxRenderThread$postNonRenderEvent$1;

    invoke-direct {v1, p0, p1}, Lcom/mapbox/maps/renderer/MapboxRenderThread$postNonRenderEvent$1;-><init>(Lcom/mapbox/maps/renderer/MapboxRenderThread;Lcom/mapbox/maps/renderer/RenderEvent;)V

    invoke-virtual {v0, v1, p2, p3}, Lcom/mapbox/maps/renderer/RenderHandlerThread;->postDelayed(Lc93/a;J)V

    return-void
.end method

.method public static synthetic postNonRenderEvent$default(Lcom/mapbox/maps/renderer/MapboxRenderThread;Lcom/mapbox/maps/renderer/RenderEvent;JILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const-wide/16 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->postNonRenderEvent(Lcom/mapbox/maps/renderer/RenderEvent;J)V

    return-void
.end method

.method private final postPrepareRenderFrame(J)V
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderHandlerThread:Lcom/mapbox/maps/renderer/RenderHandlerThread;

    new-instance v1, Lcom/mapbox/maps/renderer/MapboxRenderThread$postPrepareRenderFrame$1;

    invoke-direct {v1, p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread$postPrepareRenderFrame$1;-><init>(Lcom/mapbox/maps/renderer/MapboxRenderThread;)V

    invoke-virtual {v0, v1, p1, p2}, Lcom/mapbox/maps/renderer/RenderHandlerThread;->postDelayed(Lc93/a;J)V

    return-void
.end method

.method public static synthetic postPrepareRenderFrame$default(Lcom/mapbox/maps/renderer/MapboxRenderThread;JILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->postPrepareRenderFrame(J)V

    return-void
.end method

.method private final prepareRenderFrame(Z)V
    .locals 6

    iget-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->awaitingNextVsync:Z

    if-eqz v0, :cond_0

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderNotSupported:Z

    const/16 v1, 0x29

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->paused:Z

    if-eqz v0, :cond_2

    :cond_1
    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Skip render frame - NOT creating surface although renderNotSupported ("

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderNotSupported:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ") || paused ("

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->paused:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    const/4 v0, 0x1

    if-nez p1, :cond_3

    invoke-direct {p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->getRenderThreadPrepared()Z

    move-result v2

    if-nez v2, :cond_6

    :cond_3
    sget-object v2, Lcom/mapbox/maps/MapboxTracing;->INSTANCE:Lcom/mapbox/maps/MapboxTracing;

    invoke-virtual {v2}, Lcom/mapbox/maps/MapboxTracing;->getPlatformTracingEnabled$maps_sdk_release()Z

    move-result v2

    const-string v3, ") || !renderThreadPrepared ("

    const-string v4, "Skip render frame - render thread NOT prepared although creatingSurface ("

    if-eqz v2, :cond_5

    const-string v2, "mbx: set-up-render-thread"

    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    invoke-direct {p0, p1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->setUpRenderThread(Z)Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->getRenderThreadPrepared()Z

    move-result p1

    xor-int/2addr p1, v0

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_4
    :goto_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    goto :goto_2

    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1

    :cond_5
    invoke-direct {p0, p1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->setUpRenderThread(Z)Z

    move-result v2

    if-nez v2, :cond_6

    iget-object v2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->getRenderThreadPrepared()Z

    move-result p1

    xor-int/2addr p1, v0

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    :goto_2
    invoke-direct {p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->checkWidgetRender()V

    invoke-direct {p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->checkSurfaceSizeChanged()V

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    iput-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->awaitingNextVsync:Z

    return-void
.end method

.method public static synthetic prepareRenderFrame$default(Lcom/mapbox/maps/renderer/MapboxRenderThread;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->prepareRenderFrame(Z)V

    return-void
.end method

.method private final releaseAll(Z)V
    .locals 4

    sget-object v0, Lcom/mapbox/maps/MapboxTracing;->INSTANCE:Lcom/mapbox/maps/MapboxTracing;

    invoke-virtual {v0}, Lcom/mapbox/maps/MapboxTracing;->getPlatformTracingEnabled$maps_sdk_release()Z

    move-result v0

    const/4 v1, 0x1

    const-string v2, "Native renderer destroyed."

    const/4 v3, 0x0

    if-eqz v0, :cond_3

    const-string v0, "mbx: release-egl-all"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->mapboxRenderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->destroyRenderer()V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderEventQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->nonRenderEventQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V

    invoke-direct {p0, v3}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->setNativeRenderCreated(Z)V

    invoke-direct {p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->releaseEglSurface()V

    iget-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglContextCreated:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglCore:Lcom/mapbox/maps/renderer/egl/EGLCore;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/egl/EGLCore;->release()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    iput-boolean v3, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglContextCreated:Z

    if-eqz p1, :cond_1

    invoke-direct {p0, v1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->setUpRenderThread(Z)Z

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->surface:Landroid/view/Surface;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/view/Surface;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :goto_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1

    :cond_3
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->mapboxRenderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->destroyRenderer()V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderEventQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->nonRenderEventQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V

    invoke-direct {p0, v3}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->setNativeRenderCreated(Z)V

    invoke-direct {p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->releaseEglSurface()V

    iget-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglContextCreated:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglCore:Lcom/mapbox/maps/renderer/egl/EGLCore;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/egl/EGLCore;->release()V

    :cond_4
    iput-boolean v3, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglContextCreated:Z

    if-eqz p1, :cond_5

    invoke-direct {p0, v1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->setUpRenderThread(Z)Z

    return-void

    :cond_5
    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->surface:Landroid/view/Surface;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Landroid/view/Surface;->release()V

    :cond_6
    return-void
.end method

.method public static synthetic releaseAll$default(Lcom/mapbox/maps/renderer/MapboxRenderThread;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->releaseAll(Z)V

    return-void
.end method

.method private final releaseEglSurface()V
    .locals 3

    sget-object v0, Lcom/mapbox/maps/MapboxTracing;->INSTANCE:Lcom/mapbox/maps/MapboxTracing;

    invoke-virtual {v0}, Lcom/mapbox/maps/MapboxTracing;->getPlatformTracingEnabled$maps_sdk_release()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v0, "mbx: release-egl-surface"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->widgetTextureRenderer:Lcom/mapbox/maps/renderer/gl/TextureRenderer;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->release()V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglCore:Lcom/mapbox/maps/renderer/egl/EGLCore;

    iget-object v2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglSurface:Landroid/opengl/EGLSurface;

    invoke-virtual {v0, v2}, Lcom/mapbox/maps/renderer/egl/EGLCore;->releaseSurface(Landroid/opengl/EGLSurface;)V

    invoke-virtual {p0, v1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->setEglContextMadeCurrent$maps_sdk_release(Z)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglCore:Lcom/mapbox/maps/renderer/egl/EGLCore;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/egl/EGLCore;->getEglNoSurface$maps_sdk_release()Landroid/opengl/EGLSurface;

    move-result-object v0

    iput-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglSurface:Landroid/opengl/EGLSurface;

    iput-boolean v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->widgetRenderCreated:Z

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->widgetRenderer:Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->widgetTextureRenderer:Lcom/mapbox/maps/renderer/gl/TextureRenderer;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->release()V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglCore:Lcom/mapbox/maps/renderer/egl/EGLCore;

    iget-object v2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglSurface:Landroid/opengl/EGLSurface;

    invoke-virtual {v0, v2}, Lcom/mapbox/maps/renderer/egl/EGLCore;->releaseSurface(Landroid/opengl/EGLSurface;)V

    invoke-virtual {p0, v1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->setEglContextMadeCurrent$maps_sdk_release(Z)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglCore:Lcom/mapbox/maps/renderer/egl/EGLCore;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/egl/EGLCore;->getEglNoSurface$maps_sdk_release()Landroid/opengl/EGLSurface;

    move-result-object v0

    iput-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglSurface:Landroid/opengl/EGLSurface;

    iput-boolean v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->widgetRenderCreated:Z

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->widgetRenderer:Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->release()V

    return-void
.end method

.method private final renderPreparedGuardedRun(Lc93/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->getRenderThreadPrepared()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void

    :cond_0
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->surface:Landroid/view/Surface;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/Surface;->isValid()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    const-string v1, "renderThreadPrepared=false but Android surface is valid, trying to recreate EGL..."

    invoke-static {v0, v1}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderHandlerThread:Lcom/mapbox/maps/renderer/RenderHandlerThread;

    new-instance v1, Lcom/mapbox/maps/renderer/MapboxRenderThread$renderPreparedGuardedRun$1;

    invoke-direct {v1, p0, p1}, Lcom/mapbox/maps/renderer/MapboxRenderThread$renderPreparedGuardedRun$1;-><init>(Lcom/mapbox/maps/renderer/MapboxRenderThread;Lc93/a;)V

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/renderer/RenderHandlerThread;->post(Lc93/a;)V

    return-void

    :cond_1
    iget-boolean p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->paused:Z

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "renderThreadPrepared=false and Android surface is not valid (isValid="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->surface:Landroid/view/Surface;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/view/Surface;->isValid()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "). Waiting for new one."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method private final resetGlState()V
    .locals 2

    const/16 v0, 0xbe2

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnable(I)V

    const/4 v0, 0x1

    const/16 v1, 0x303

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBlendFunc(II)V

    const v0, 0x8006

    invoke-static {v0}, Landroid/opengl/GLES20;->glBlendEquation(I)V

    const/16 v0, 0xb90

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisable(I)V

    const/16 v0, 0xb71

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisable(I)V

    const/4 v0, 0x0

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    const v1, 0x8892

    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    const v1, 0x8893

    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    return-void
.end method

.method private final setNativeRenderCreated(Z)V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderThreadPreparedLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iput-boolean p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->nativeRenderCreated:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method private final setUpRenderThread(Z)Z
    .locals 4

    const-string v0, "Setting up render thread, flags: creatingSurface="

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->surfaceProcessingLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", nativeRenderCreated="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->nativeRenderCreated:Z

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", eglContextMadeCurrent="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglContextMadeCurrent:Z

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", eglContextCreated="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglContextCreated:Z

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", paused="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->paused:Z

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->checkEglConfig()Z

    move-result v0

    invoke-direct {p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->checkAndroidSurface()Z

    move-result v2

    if-eqz v0, :cond_2

    if-eqz v2, :cond_2

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglCore:Lcom/mapbox/maps/renderer/egl/EGLCore;

    invoke-virtual {p1}, Lcom/mapbox/maps/renderer/egl/EGLCore;->makeNothingCurrent()Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->surface:Landroid/view/Surface;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->checkEglSurface(Landroid/view/Surface;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-direct {p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->checkEglContextCurrent()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->setEglContextMadeCurrent$maps_sdk_release(Z)V

    iget-boolean p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglContextMadeCurrent:Z

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->nativeRenderCreated:Z

    const/4 v0, 0x1

    if-nez p1, :cond_1

    invoke-direct {p0, v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->setNativeRenderCreated(Z)V

    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->mapboxRenderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    invoke-virtual {p1}, Lcom/mapbox/maps/renderer/MapboxRenderer;->createRenderer()V

    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    const-string v2, "Native renderer created."

    invoke-static {p1, v2}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->mapboxRenderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    iget v2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->width:I

    iget v3, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->height:I

    invoke-virtual {p1, v2, v3}, Lcom/mapbox/maps/renderer/MapboxRenderer;->onSurfaceChanged(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    :try_start_1
    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->createCondition:Ljava/util/concurrent/locks/Condition;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Condition;->signal()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return v0

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_2
    :try_start_2
    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->createCondition:Ljava/util/concurrent/locks/Condition;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Condition;->signal()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const/4 p1, 0x0

    return p1

    :goto_1
    :try_start_3
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->createCondition:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signal()V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_2
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method private final swapBuffers()V
    .locals 4

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglCore:Lcom/mapbox/maps/renderer/egl/EGLCore;

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglSurface:Landroid/opengl/EGLSurface;

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/renderer/egl/EGLCore;->swapBuffers(Landroid/opengl/EGLSurface;)I

    move-result v0

    const/16 v1, 0x3000

    if-eq v0, v1, :cond_1

    const/16 v1, 0x300e

    if-eq v0, v1, :cond_0

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "eglSwapBuffer error: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ". Waiting for new surface"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->releaseEglSurface()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    const-string v1, "Context lost. Waiting for re-acquire"

    invoke-static {v0, v1}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->releaseAll(Z)V

    :cond_1
    return-void
.end method

.method private final trace(Ljava/lang/String;Lc93/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    sget-object v0, Lcom/mapbox/maps/MapboxTracing;->INSTANCE:Lcom/mapbox/maps/MapboxTracing;

    invoke-virtual {v0}, Lcom/mapbox/maps/MapboxTracing;->getPlatformTracingEnabled$maps_sdk_release()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "mbx: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1

    :cond_0
    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final addWidget(Lcom/mapbox/maps/renderer/widget/Widget;)V
    .locals 1

    const-string v0, "widget"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->widgetRenderer:Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->addWidget(Lcom/mapbox/maps/renderer/widget/Widget;)V

    return-void
.end method

.method public final destroy$maps_sdk_release()V
    .locals 5

    sget-object v0, Lcom/mapbox/maps/MapboxTracing;->INSTANCE:Lcom/mapbox/maps/MapboxTracing;

    invoke-virtual {v0}, Lcom/mapbox/maps/MapboxTracing;->getPlatformTracingEnabled$maps_sdk_release()Z

    move-result v0

    const-string v1, "destroy: render thread is not running."

    const-string v2, "destroy: all resources were cleaned up."

    const-string v3, "destroy: waiting until all resources will be cleaned up..."

    const-string v4, "destroy"

    if-eqz v0, :cond_1

    const-string v0, "mbx: destroy"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    invoke-static {v0, v4}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->surfaceProcessingLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v4, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderHandlerThread:Lcom/mapbox/maps/renderer/RenderHandlerThread;

    invoke-virtual {v4}, Lcom/mapbox/maps/renderer/RenderHandlerThread;->isRunning$maps_sdk_release()Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderHandlerThread:Lcom/mapbox/maps/renderer/RenderHandlerThread;

    new-instance v4, Lcom/mapbox/maps/renderer/MapboxRenderThread$destroy$1$1$1;

    invoke-direct {v4, p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread$destroy$1$1$1;-><init>(Lcom/mapbox/maps/renderer/MapboxRenderThread;)V

    invoke-virtual {v1, v4}, Lcom/mapbox/maps/renderer/RenderHandlerThread;->post(Lc93/a;)V

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    invoke-static {v1, v3}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->destroyCondition:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Condition;->await()V

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    invoke-static {v2, v1}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    :try_start_2
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :catchall_1
    move-exception v0

    goto :goto_2

    :goto_1
    :try_start_3
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :cond_1
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    invoke-static {v0, v4}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->surfaceProcessingLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_4
    iget-object v4, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderHandlerThread:Lcom/mapbox/maps/renderer/RenderHandlerThread;

    invoke-virtual {v4}, Lcom/mapbox/maps/renderer/RenderHandlerThread;->isRunning$maps_sdk_release()Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderHandlerThread:Lcom/mapbox/maps/renderer/RenderHandlerThread;

    new-instance v4, Lcom/mapbox/maps/renderer/MapboxRenderThread$destroy$1$1$1;

    invoke-direct {v4, p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread$destroy$1$1$1;-><init>(Lcom/mapbox/maps/renderer/MapboxRenderThread;)V

    invoke-virtual {v1, v4}, Lcom/mapbox/maps/renderer/RenderHandlerThread;->post(Lc93/a;)V

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    invoke-static {v1, v3}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->destroyCondition:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Condition;->await()V

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :catchall_2
    move-exception v1

    goto :goto_4

    :cond_2
    iget-object v2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    invoke-static {v2, v1}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :goto_3
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :goto_4
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method

.method public doFrame(J)V
    .locals 9

    sget-object v0, Lcom/mapbox/maps/MapboxTracing;->INSTANCE:Lcom/mapbox/maps/MapboxTracing;

    invoke-virtual {v0}, Lcom/mapbox/maps/MapboxTracing;->getPlatformTracingEnabled$maps_sdk_release()Z

    move-result v0

    const-wide v1, 0x412e848000000000L    # 1000000.0

    const/4 v3, 0x0

    const/4 v4, 0x1

    const-wide/16 v5, 0x0

    if-eqz v0, :cond_4

    const-string v0, "mbx: do-frame"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderThreadStatsRecorder:Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;->isRecording()Z

    move-result v0

    if-ne v0, v4, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v7

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    move-wide v7, v5

    :goto_0
    invoke-direct {p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->getRenderThreadPrepared()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->paused:Z

    if-nez v0, :cond_1

    invoke-direct {p0, p1, p2}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->draw(J)V

    :cond_1
    iput-boolean v3, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->awaitingNextVsync:Z

    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->nonRenderEventQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {p0, p1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->drainQueue(Ljava/util/concurrent/ConcurrentLinkedQueue;)V

    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderThreadStatsRecorder:Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;->isRecording()Z

    move-result p1

    if-ne p1, v4, :cond_2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide p1

    goto :goto_1

    :cond_2
    move-wide p1, v5

    :goto_1
    cmp-long v0, v7, v5

    if-eqz v0, :cond_3

    cmp-long v0, p1, v5

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderThreadStatsRecorder:Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;

    if-eqz v0, :cond_3

    sub-long/2addr p1, v7

    long-to-double p1, p1

    div-double/2addr p1, v1

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->fpsManager:Lcom/mapbox/maps/renderer/FpsManager;

    invoke-virtual {v1}, Lcom/mapbox/maps/renderer/FpsManager;->getSkippedNow()I

    move-result v1

    invoke-virtual {v0, p1, p2, v1}, Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;->addFrameStats$maps_sdk_release(DI)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :goto_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1

    :cond_4
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderThreadStatsRecorder:Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;->isRecording()Z

    move-result v0

    if-ne v0, v4, :cond_5

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v7

    goto :goto_3

    :cond_5
    move-wide v7, v5

    :goto_3
    invoke-direct {p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->getRenderThreadPrepared()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->paused:Z

    if-nez v0, :cond_6

    invoke-direct {p0, p1, p2}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->draw(J)V

    :cond_6
    iput-boolean v3, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->awaitingNextVsync:Z

    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->nonRenderEventQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {p0, p1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->drainQueue(Ljava/util/concurrent/ConcurrentLinkedQueue;)V

    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderThreadStatsRecorder:Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;->isRecording()Z

    move-result p1

    if-ne p1, v4, :cond_7

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide p1

    goto :goto_4

    :cond_7
    move-wide p1, v5

    :goto_4
    cmp-long v0, v7, v5

    if-eqz v0, :cond_8

    cmp-long v0, p1, v5

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderThreadStatsRecorder:Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;

    if-eqz v0, :cond_8

    sub-long/2addr p1, v7

    long-to-double p1, p1

    div-double/2addr p1, v1

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->fpsManager:Lcom/mapbox/maps/renderer/FpsManager;

    invoke-virtual {v1}, Lcom/mapbox/maps/renderer/FpsManager;->getSkippedNow()I

    move-result v1

    invoke-virtual {v0, p1, p2, v1}, Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;->addFrameStats$maps_sdk_release(DI)V

    :cond_8
    return-void
.end method

.method public final getAwaitingNextVsync$maps_sdk_release()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->awaitingNextVsync:Z

    return v0
.end method

.method public final getEglContextMadeCurrent$maps_sdk_release()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglContextMadeCurrent:Z

    return v0
.end method

.method public final getEglCore$maps_sdk_release()Lcom/mapbox/maps/renderer/egl/EGLCore;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglCore:Lcom/mapbox/maps/renderer/egl/EGLCore;

    return-object v0
.end method

.method public final getEglSurface$maps_sdk_release()Landroid/opengl/EGLSurface;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglSurface:Landroid/opengl/EGLSurface;

    return-object v0
.end method

.method public final getFpsChangedListener$maps_sdk_release()Lcom/mapbox/maps/renderer/OnFpsChangedListener;
    .locals 3

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->fpsChangedListener$delegate:Lf93/d;

    sget-object v1, Lcom/mapbox/maps/renderer/MapboxRenderThread;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mapbox/maps/renderer/OnFpsChangedListener;

    return-object v0
.end method

.method public final getNeedViewAnnotationSync$maps_sdk_release()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->needViewAnnotationSync:Z

    return v0
.end method

.method public final getNonRenderEventQueue$maps_sdk_release()Ljava/util/concurrent/ConcurrentLinkedQueue;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/mapbox/maps/renderer/RenderEvent;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->nonRenderEventQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    return-object v0
.end method

.method public final getPaused$maps_sdk_release()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->paused:Z

    return v0
.end method

.method public final getRenderEventQueue$maps_sdk_release()Ljava/util/concurrent/ConcurrentLinkedQueue;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/mapbox/maps/renderer/RenderEvent;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderEventQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    return-object v0
.end method

.method public final getRenderHandlerThread$maps_sdk_release()Lcom/mapbox/maps/renderer/RenderHandlerThread;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderHandlerThread:Lcom/mapbox/maps/renderer/RenderHandlerThread;

    return-object v0
.end method

.method public final getRenderThreadStatsRecorder$maps_sdk_release()Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderThreadStatsRecorder:Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;

    return-object v0
.end method

.method public final getSurface$maps_sdk_release()Landroid/view/Surface;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->surface:Landroid/view/Surface;

    return-object v0
.end method

.method public final getViewAnnotationMode$maps_sdk_release()Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->viewAnnotationMode:Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;

    return-object v0
.end method

.method public final onSurfaceCreated(Landroid/view/Surface;II)V
    .locals 5

    const-string v0, "surface"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/MapboxTracing;->INSTANCE:Lcom/mapbox/maps/MapboxTracing;

    invoke-virtual {v0}, Lcom/mapbox/maps/MapboxTracing;->getPlatformTracingEnabled$maps_sdk_release()Z

    move-result v0

    const-string v1, "onSurfaceCreated: render thread is not running."

    const-string v2, "onSurfaceCreated: Android surface was processed."

    const-string v3, "onSurfaceCreated: waiting Android surface to be processed..."

    const-string v4, "onSurfaceCreated"

    if-eqz v0, :cond_1

    const-string v0, "mbx: surface-created"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    invoke-static {v0, v4}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->surfaceProcessingLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v4, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderHandlerThread:Lcom/mapbox/maps/renderer/RenderHandlerThread;

    invoke-virtual {v4}, Lcom/mapbox/maps/renderer/RenderHandlerThread;->isRunning$maps_sdk_release()Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderHandlerThread:Lcom/mapbox/maps/renderer/RenderHandlerThread;

    new-instance v4, Lcom/mapbox/maps/renderer/MapboxRenderThread$onSurfaceCreated$1$1$1;

    invoke-direct {v4, p0, p1, p2, p3}, Lcom/mapbox/maps/renderer/MapboxRenderThread$onSurfaceCreated$1$1$1;-><init>(Lcom/mapbox/maps/renderer/MapboxRenderThread;Landroid/view/Surface;II)V

    invoke-virtual {v1, v4}, Lcom/mapbox/maps/renderer/RenderHandlerThread;->post(Lc93/a;)V

    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    invoke-static {p1, v3}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->createCondition:Ljava/util/concurrent/locks/Condition;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Condition;->await()V

    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    invoke-static {p1, v2}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    invoke-static {p1, v1}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    :try_start_2
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :catchall_1
    move-exception p1

    goto :goto_2

    :goto_1
    :try_start_3
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1

    :cond_1
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    invoke-static {v0, v4}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->surfaceProcessingLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_4
    iget-object v4, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderHandlerThread:Lcom/mapbox/maps/renderer/RenderHandlerThread;

    invoke-virtual {v4}, Lcom/mapbox/maps/renderer/RenderHandlerThread;->isRunning$maps_sdk_release()Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderHandlerThread:Lcom/mapbox/maps/renderer/RenderHandlerThread;

    new-instance v4, Lcom/mapbox/maps/renderer/MapboxRenderThread$onSurfaceCreated$1$1$1;

    invoke-direct {v4, p0, p1, p2, p3}, Lcom/mapbox/maps/renderer/MapboxRenderThread$onSurfaceCreated$1$1$1;-><init>(Lcom/mapbox/maps/renderer/MapboxRenderThread;Landroid/view/Surface;II)V

    invoke-virtual {v1, v4}, Lcom/mapbox/maps/renderer/RenderHandlerThread;->post(Lc93/a;)V

    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    invoke-static {p1, v3}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->createCondition:Ljava/util/concurrent/locks/Condition;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Condition;->await()V

    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    invoke-static {p1, v2}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :catchall_2
    move-exception p1

    goto :goto_4

    :cond_2
    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    invoke-static {p1, v1}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :goto_3
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :goto_4
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public final onSurfaceDestroyed()V
    .locals 5

    sget-object v0, Lcom/mapbox/maps/MapboxTracing;->INSTANCE:Lcom/mapbox/maps/MapboxTracing;

    invoke-virtual {v0}, Lcom/mapbox/maps/MapboxTracing;->getPlatformTracingEnabled$maps_sdk_release()Z

    move-result v0

    const-string v1, "onSurfaceDestroyed: render thread is not running."

    const-string v2, "onSurfaceDestroyed: EGL resources were cleaned up."

    const-string v3, "onSurfaceDestroyed: waiting until EGL will be cleaned up..."

    const-string v4, "onSurfaceDestroyed"

    if-eqz v0, :cond_1

    const-string v0, "mbx: surface-destroyed"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    invoke-static {v0, v4}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->surfaceProcessingLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v4, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderHandlerThread:Lcom/mapbox/maps/renderer/RenderHandlerThread;

    invoke-virtual {v4}, Lcom/mapbox/maps/renderer/RenderHandlerThread;->isRunning$maps_sdk_release()Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderHandlerThread:Lcom/mapbox/maps/renderer/RenderHandlerThread;

    new-instance v4, Lcom/mapbox/maps/renderer/MapboxRenderThread$onSurfaceDestroyed$1$1$1;

    invoke-direct {v4, p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread$onSurfaceDestroyed$1$1$1;-><init>(Lcom/mapbox/maps/renderer/MapboxRenderThread;)V

    invoke-virtual {v1, v4}, Lcom/mapbox/maps/renderer/RenderHandlerThread;->post(Lc93/a;)V

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    invoke-static {v1, v3}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->destroyCondition:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Condition;->await()V

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    invoke-static {v2, v1}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    :try_start_2
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :catchall_1
    move-exception v0

    goto :goto_2

    :goto_1
    :try_start_3
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :cond_1
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    invoke-static {v0, v4}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->surfaceProcessingLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_4
    iget-object v4, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderHandlerThread:Lcom/mapbox/maps/renderer/RenderHandlerThread;

    invoke-virtual {v4}, Lcom/mapbox/maps/renderer/RenderHandlerThread;->isRunning$maps_sdk_release()Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderHandlerThread:Lcom/mapbox/maps/renderer/RenderHandlerThread;

    new-instance v4, Lcom/mapbox/maps/renderer/MapboxRenderThread$onSurfaceDestroyed$1$1$1;

    invoke-direct {v4, p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread$onSurfaceDestroyed$1$1$1;-><init>(Lcom/mapbox/maps/renderer/MapboxRenderThread;)V

    invoke-virtual {v1, v4}, Lcom/mapbox/maps/renderer/RenderHandlerThread;->post(Lc93/a;)V

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    invoke-static {v1, v3}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->destroyCondition:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Condition;->await()V

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :catchall_2
    move-exception v1

    goto :goto_4

    :cond_2
    iget-object v2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    invoke-static {v2, v1}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :goto_3
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :goto_4
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method

.method public final onSurfaceSizeChanged(II)V
    .locals 2

    iget v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->width:I

    if-ne v0, p1, :cond_1

    iget v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->height:I

    if-eq v0, p2, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderHandlerThread:Lcom/mapbox/maps/renderer/RenderHandlerThread;

    new-instance v1, Lcom/mapbox/maps/renderer/MapboxRenderThread$onSurfaceSizeChanged$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/mapbox/maps/renderer/MapboxRenderThread$onSurfaceSizeChanged$1;-><init>(Lcom/mapbox/maps/renderer/MapboxRenderThread;II)V

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/renderer/RenderHandlerThread;->post(Lc93/a;)V

    return-void
.end method

.method public final pause()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->paused:Z

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    const-string v1, "Renderer paused"

    invoke-static {v0, v1}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final processAndroidSurface$maps_sdk_release(Landroid/view/Surface;II)V
    .locals 3

    const-string v0, "surface"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->surface:Landroid/view/Surface;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->surface:Landroid/view/Surface;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    const-string v2, "Processing new android surface while current is not null, releasing current EGL and recreating native renderer."

    invoke-static {v0, v2}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->releaseAll$default(Lcom/mapbox/maps/renderer/MapboxRenderThread;ZILjava/lang/Object;)V

    :cond_0
    iput-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->surface:Landroid/view/Surface;

    :cond_1
    iput p2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->width:I

    iput p3, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->height:I

    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->widgetRenderer:Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;

    invoke-virtual {p1, p2, p3}, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->onSurfaceChanged(II)V

    invoke-direct {p0, v1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->prepareRenderFrame(Z)V

    return-void
.end method

.method public final queueRenderEvent(Lcom/mapbox/maps/renderer/RenderEvent;)V
    .locals 7

    const-string v0, "renderEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mapbox/maps/renderer/RenderEvent;->getNeedRender()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lcom/mapbox/maps/renderer/RenderEvent;->getRunnable()Ljava/lang/Runnable;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderEventQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-direct {p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->getRenderThreadPrepared()Z

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_1

    const-wide/16 v2, 0x0

    invoke-static {p0, v2, v3, v1, v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->postPrepareRenderFrame$default(Lcom/mapbox/maps/renderer/MapboxRenderThread;JILjava/lang/Object;)V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->surface:Landroid/view/Surface;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/view/Surface;->isValid()Z

    move-result p1

    if-ne p1, v1, :cond_2

    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    const-string v0, "renderThreadPrepared=false but Android surface is valid, trying to recreate EGL..."

    invoke-static {p1, v0}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderHandlerThread:Lcom/mapbox/maps/renderer/RenderHandlerThread;

    new-instance v0, Lcom/mapbox/maps/renderer/MapboxRenderThread$queueRenderEvent$$inlined$renderPreparedGuardedRun$1;

    invoke-direct {v0, p0, p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread$queueRenderEvent$$inlined$renderPreparedGuardedRun$1;-><init>(Lcom/mapbox/maps/renderer/MapboxRenderThread;Lcom/mapbox/maps/renderer/MapboxRenderThread;)V

    invoke-virtual {p1, v0}, Lcom/mapbox/maps/renderer/RenderHandlerThread;->post(Lc93/a;)V

    return-void

    :cond_2
    iget-boolean p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->paused:Z

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "renderThreadPrepared=false and Android surface is not valid (isValid="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->surface:Landroid/view/Surface;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroid/view/Surface;->isValid()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :cond_3
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "). Waiting for new one."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    return-void

    :cond_5
    const/4 v5, 0x2

    const/4 v6, 0x0

    const-wide/16 v3, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->postNonRenderEvent$default(Lcom/mapbox/maps/renderer/MapboxRenderThread;Lcom/mapbox/maps/renderer/RenderEvent;JILjava/lang/Object;)V

    return-void
.end method

.method public final removeWidget(Lcom/mapbox/maps/renderer/widget/Widget;)Z
    .locals 1

    const-string v0, "widget"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->widgetRenderer:Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->removeWidget(Lcom/mapbox/maps/renderer/widget/Widget;)Z

    move-result p1

    return p1
.end method

.method public final resume()V
    .locals 6

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->paused:Z

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Renderer resumed, renderThreadPrepared="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->getRenderThreadPrepared()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", surface.isValid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->surface:Landroid/view/Surface;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/view/Surface;->isValid()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->getRenderThreadPrepared()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    const-wide/16 v4, 0x0

    invoke-static {p0, v4, v5, v1, v3}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->postPrepareRenderFrame$default(Lcom/mapbox/maps/renderer/MapboxRenderThread;JILjava/lang/Object;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->surface:Landroid/view/Surface;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/Surface;->isValid()Z

    move-result v0

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    const-string v1, "renderThreadPrepared=false but Android surface is valid, trying to recreate EGL..."

    invoke-static {v0, v1}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderHandlerThread:Lcom/mapbox/maps/renderer/RenderHandlerThread;

    new-instance v1, Lcom/mapbox/maps/renderer/MapboxRenderThread$resume$$inlined$renderPreparedGuardedRun$1;

    invoke-direct {v1, p0, p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread$resume$$inlined$renderPreparedGuardedRun$1;-><init>(Lcom/mapbox/maps/renderer/MapboxRenderThread;Lcom/mapbox/maps/renderer/MapboxRenderThread;)V

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/renderer/RenderHandlerThread;->post(Lc93/a;)V

    return-void

    :cond_2
    iget-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->paused:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "renderThreadPrepared=false and Android surface is not valid (isValid="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->surface:Landroid/view/Surface;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroid/view/Surface;->isValid()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    :cond_3
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "). Waiting for new one."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method public final setAwaitingNextVsync$maps_sdk_release(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->awaitingNextVsync:Z

    return-void
.end method

.method public final setEglContextMadeCurrent$maps_sdk_release(Z)V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderThreadPreparedLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iput-boolean p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglContextMadeCurrent:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public final setEglSurface$maps_sdk_release(Landroid/opengl/EGLSurface;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->eglSurface:Landroid/opengl/EGLSurface;

    return-void
.end method

.method public final setFpsChangedListener$maps_sdk_release(Lcom/mapbox/maps/renderer/OnFpsChangedListener;)V
    .locals 3

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->fpsChangedListener$delegate:Lf93/d;

    sget-object v1, Lcom/mapbox/maps/renderer/MapboxRenderThread;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public final setNeedViewAnnotationSync$maps_sdk_release(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->needViewAnnotationSync:Z

    return-void
.end method

.method public final setPaused$maps_sdk_release(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->paused:Z

    return-void
.end method

.method public final setRenderThreadStatsRecorder$maps_sdk_release(Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;)V
    .locals 0

    iput-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderThreadStatsRecorder:Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;

    return-void
.end method

.method public final setScreenRefreshRate(I)V
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderHandlerThread:Lcom/mapbox/maps/renderer/RenderHandlerThread;

    new-instance v1, Lcom/mapbox/maps/renderer/MapboxRenderThread$setScreenRefreshRate$1;

    invoke-direct {v1, p0, p1}, Lcom/mapbox/maps/renderer/MapboxRenderThread$setScreenRefreshRate$1;-><init>(Lcom/mapbox/maps/renderer/MapboxRenderThread;I)V

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/renderer/RenderHandlerThread;->post(Lc93/a;)V

    return-void
.end method

.method public final setSurface$maps_sdk_release(Landroid/view/Surface;)V
    .locals 0

    iput-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->surface:Landroid/view/Surface;

    return-void
.end method

.method public final setUserRefreshRate(I)V
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->renderHandlerThread:Lcom/mapbox/maps/renderer/RenderHandlerThread;

    new-instance v1, Lcom/mapbox/maps/renderer/MapboxRenderThread$setUserRefreshRate$1;

    invoke-direct {v1, p0, p1}, Lcom/mapbox/maps/renderer/MapboxRenderThread$setUserRefreshRate$1;-><init>(Lcom/mapbox/maps/renderer/MapboxRenderThread;I)V

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/renderer/RenderHandlerThread;->post(Lc93/a;)V

    return-void
.end method

.method public final setViewAnnotationMode$maps_sdk_release(Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread;->viewAnnotationMode:Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;

    return-void
.end method
