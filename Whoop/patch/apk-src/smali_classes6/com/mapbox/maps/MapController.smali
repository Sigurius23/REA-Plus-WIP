.class public final Lcom/mapbox/maps/MapController;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmv/f;
.implements Lcom/mapbox/maps/MapControllable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/maps/MapController$LifecycleState;,
        Lcom/mapbox/maps/MapController$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00d6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u0000 \u0081\u00012\u00020\u00012\u00020\u0002:\u0004\u0081\u0001\u0082\u0001B\u0019\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008BK\u0008\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0007\u0010\u0015J\r\u0010\u0016\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u000fH\u0007\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010\u001dJ\u000f\u0010 \u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008 \u0010\u001dJ\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0016\u00a2\u0006\u0004\u0008$\u0010%J\u0017\u0010&\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0016\u00a2\u0006\u0004\u0008&\u0010%J\u001f\u0010*\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\'2\u0006\u0010)\u001a\u00020\'H\u0016\u00a2\u0006\u0004\u0008*\u0010+J\u001f\u0010.\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020,2\u0006\u0010-\u001a\u00020#H\u0016\u00a2\u0006\u0004\u0008.\u0010/J\u0011\u00101\u001a\u0004\u0018\u000100H\u0016\u00a2\u0006\u0004\u00081\u00102J\u0017\u00101\u001a\u00020\u001b2\u0006\u00104\u001a\u000203H\u0016\u00a2\u0006\u0004\u00081\u00105J\u0017\u00107\u001a\u00020\u001b2\u0006\u00106\u001a\u00020\'H\u0016\u00a2\u0006\u0004\u00087\u00108J\u0017\u0010:\u001a\u00020\u001b2\u0006\u00104\u001a\u000209H\u0016\u00a2\u0006\u0004\u0008:\u0010;J\u0017\u0010>\u001a\u00020\u001b2\u0006\u0010=\u001a\u00020<H\u0016\u00a2\u0006\u0004\u0008>\u0010?J\u0017\u0010B\u001a\u00020\u001b2\u0006\u0010A\u001a\u00020@H\u0016\u00a2\u0006\u0004\u0008B\u0010CJ\u0017\u0010D\u001a\u00020#2\u0006\u0010A\u001a\u00020@H\u0016\u00a2\u0006\u0004\u0008D\u0010EJ\u0017\u0010H\u001a\u00020\u001b2\u0006\u0010G\u001a\u00020FH\u0016\u00a2\u0006\u0004\u0008H\u0010IJ\u0017\u0010J\u001a\u00020\u001b2\u0006\u0010G\u001a\u00020FH\u0016\u00a2\u0006\u0004\u0008J\u0010IJ\u0017\u0010M\u001a\u00020\u001b2\u0006\u0010K\u001a\u00020\'H\u0000\u00a2\u0006\u0004\u0008L\u00108J#\u0010R\u001a\u0004\u0018\u00018\u0000\"\u0008\u0008\u0000\u0010O*\u00020N2\u0006\u0010Q\u001a\u00020PH\u0016\u00a2\u0006\u0004\u0008R\u0010SJ\u001f\u0010X\u001a\u00020\u001b2\u0008\u0010U\u001a\u0004\u0018\u00010T2\u0006\u0010W\u001a\u00020V\u00a2\u0006\u0004\u0008X\u0010YJ\u0015\u0010Z\u001a\u00020\u001b2\u0006\u0010Q\u001a\u00020P\u00a2\u0006\u0004\u0008Z\u0010[J!\u0010]\u001a\u00020\u001b2\u0006\u0010\\\u001a\u00020\u00052\n\u0008\u0002\u0010U\u001a\u0004\u0018\u00010T\u00a2\u0006\u0004\u0008]\u0010^J\u0017\u0010a\u001a\u00020\u001b2\u0006\u0010U\u001a\u00020TH\u0000\u00a2\u0006\u0004\u0008_\u0010`R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010b\u001a\u0004\u0008c\u0010dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010gR\u0014\u0010h\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008h\u0010iR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010jR\u0014\u0010k\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008k\u0010lR\u001a\u0010n\u001a\u00020m8\u0002X\u0082\u0004\u00a2\u0006\u000c\n\u0004\u0008n\u0010o\u0012\u0004\u0008p\u0010\u001dR\u001a\u0010s\u001a\u0008\u0012\u0004\u0012\u00020r0q8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008s\u0010tR(\u0010v\u001a\u00020u8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008v\u0010w\u0012\u0004\u0008|\u0010\u001d\u001a\u0004\u0008x\u0010y\"\u0004\u0008z\u0010{R\u0018\u0010~\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008~\u0010\u007fR\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u000c\u0010\u0080\u0001R\u0014\u0010\u0010\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u0019\u00a8\u0006\u0083\u0001"
    }
    d2 = {
        "Lcom/mapbox/maps/MapController;",
        "Lmv/f;",
        "Lcom/mapbox/maps/MapControllable;",
        "Lcom/mapbox/maps/renderer/MapboxRenderer;",
        "renderer",
        "Lcom/mapbox/maps/MapInitOptions;",
        "mapInitOptions",
        "<init>",
        "(Lcom/mapbox/maps/renderer/MapboxRenderer;Lcom/mapbox/maps/MapInitOptions;)V",
        "Lcom/mapbox/maps/NativeObserver;",
        "nativeObserver",
        "Lcom/mapbox/maps/ContextMode;",
        "contextMode",
        "Lcom/mapbox/maps/NativeMapImpl;",
        "nativeMap",
        "Lcom/mapbox/maps/MapboxMap;",
        "mapboxMap",
        "Lev/k;",
        "pluginRegistry",
        "Lcom/mapbox/maps/StyleDataLoadedCallback;",
        "onStyleLoadingFinishedListener",
        "(Lcom/mapbox/maps/renderer/MapboxRenderer;Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/MapInitOptions;Lcom/mapbox/maps/ContextMode;Lcom/mapbox/maps/NativeMapImpl;Lcom/mapbox/maps/MapboxMap;Lev/k;Lcom/mapbox/maps/StyleDataLoadedCallback;)V",
        "getNativeMap",
        "()Lcom/mapbox/maps/NativeMapImpl;",
        "getMapboxMapDeprecated",
        "()Lcom/mapbox/maps/MapboxMap;",
        "getMapboxMap",
        "Ll83/a0;",
        "onStart",
        "()V",
        "onStop",
        "onDestroy",
        "onLowMemory",
        "Landroid/view/MotionEvent;",
        "event",
        "",
        "onTouchEvent",
        "(Landroid/view/MotionEvent;)Z",
        "onGenericMotionEvent",
        "",
        "w",
        "h",
        "onSizeChanged",
        "(II)V",
        "Ljava/lang/Runnable;",
        "needRender",
        "queueEvent",
        "(Ljava/lang/Runnable;Z)V",
        "Landroid/graphics/Bitmap;",
        "snapshot",
        "()Landroid/graphics/Bitmap;",
        "Lcom/mapbox/maps/MapView$OnSnapshotReady;",
        "listener",
        "(Lcom/mapbox/maps/MapView$OnSnapshotReady;)V",
        "fps",
        "setMaximumFps",
        "(I)V",
        "Lcom/mapbox/maps/renderer/OnFpsChangedListener;",
        "setOnFpsChangedListener",
        "(Lcom/mapbox/maps/renderer/OnFpsChangedListener;)V",
        "Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;",
        "renderThreadStatsRecorder",
        "setRenderThreadStatsRecorder",
        "(Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;)V",
        "Lcom/mapbox/maps/renderer/widget/Widget;",
        "widget",
        "addWidget",
        "(Lcom/mapbox/maps/renderer/widget/Widget;)V",
        "removeWidget",
        "(Lcom/mapbox/maps/renderer/widget/Widget;)Z",
        "Lcom/mapbox/maps/renderer/RendererSetupErrorListener;",
        "rendererSetupErrorListener",
        "addRendererSetupErrorListener",
        "(Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V",
        "removeRendererSetupErrorListener",
        "refreshRate",
        "setScreenRefreshRate$maps_sdk_release",
        "setScreenRefreshRate",
        "Lev/j;",
        "T",
        "",
        "id",
        "getPlugin",
        "(Ljava/lang/String;)Lev/j;",
        "Lcom/mapbox/maps/MapView;",
        "mapView",
        "Lev/q;",
        "plugin",
        "createPlugin",
        "(Lcom/mapbox/maps/MapView;Lev/q;)V",
        "removePlugin",
        "(Ljava/lang/String;)V",
        "options",
        "initializePlugins",
        "(Lcom/mapbox/maps/MapInitOptions;Lcom/mapbox/maps/MapView;)V",
        "onAttachedToWindow$maps_sdk_release",
        "(Lcom/mapbox/maps/MapView;)V",
        "onAttachedToWindow",
        "Lcom/mapbox/maps/renderer/MapboxRenderer;",
        "getRenderer$maps_sdk_release",
        "()Lcom/mapbox/maps/renderer/MapboxRenderer;",
        "Lcom/mapbox/maps/NativeObserver;",
        "Lcom/mapbox/maps/MapInitOptions;",
        "Lcom/mapbox/maps/NativeMapImpl;",
        "_mapboxMap",
        "Lcom/mapbox/maps/MapboxMap;",
        "Lev/k;",
        "styleDataLoadedCallback",
        "Lcom/mapbox/maps/StyleDataLoadedCallback;",
        "Lcom/mapbox/maps/CameraChangedCoalescedCallback;",
        "cameraChangedCoalescedCallback",
        "Lcom/mapbox/maps/CameraChangedCoalescedCallback;",
        "getCameraChangedCoalescedCallback$annotations",
        "Ljava/util/concurrent/CopyOnWriteArraySet;",
        "Lcom/mapbox/common/Cancelable;",
        "cancelableSubscriberSet",
        "Ljava/util/concurrent/CopyOnWriteArraySet;",
        "Lcom/mapbox/maps/MapController$LifecycleState;",
        "lifecycleState",
        "Lcom/mapbox/maps/MapController$LifecycleState;",
        "getLifecycleState$maps_sdk_release",
        "()Lcom/mapbox/maps/MapController$LifecycleState;",
        "setLifecycleState$maps_sdk_release",
        "(Lcom/mapbox/maps/MapController$LifecycleState;)V",
        "getLifecycleState$maps_sdk_release$annotations",
        "Lcom/mapbox/maps/Style;",
        "style",
        "Lcom/mapbox/maps/Style;",
        "Lcom/mapbox/maps/ContextMode;",
        "Companion",
        "LifecycleState",
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
.field public static final Companion:Lcom/mapbox/maps/MapController$Companion;

.field private static final PLUGIN_MISSING_TEMPLATE:Ljava/lang/String; = "Add %s plugin dependency to the classpath take automatically load the plugin implementation."

.field public static final TAG:Ljava/lang/String; = "MapController"

.field private static final VIEW_HIERARCHY_MISSING_TEMPLATE:Ljava/lang/String; = "%s plugin requires a View hierarchy to be injected, plugin is ignored."


# instance fields
.field private final _mapboxMap:Lcom/mapbox/maps/MapboxMap;

.field private final cameraChangedCoalescedCallback:Lcom/mapbox/maps/CameraChangedCoalescedCallback;

.field private final cancelableSubscriberSet:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lcom/mapbox/common/Cancelable;",
            ">;"
        }
    .end annotation
.end field

.field private contextMode:Lcom/mapbox/maps/ContextMode;

.field private lifecycleState:Lcom/mapbox/maps/MapController$LifecycleState;

.field private final mapInitOptions:Lcom/mapbox/maps/MapInitOptions;

.field private final nativeMap:Lcom/mapbox/maps/NativeMapImpl;

.field private final nativeObserver:Lcom/mapbox/maps/NativeObserver;

.field private final pluginRegistry:Lev/k;

.field private final renderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

.field private style:Lcom/mapbox/maps/Style;

.field private final styleDataLoadedCallback:Lcom/mapbox/maps/StyleDataLoadedCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/maps/MapController$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/maps/MapController$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/maps/MapController;->Companion:Lcom/mapbox/maps/MapController$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/mapbox/maps/renderer/MapboxRenderer;Lcom/mapbox/maps/MapInitOptions;)V
    .locals 5

    const-string v0, "renderer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapInitOptions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/mapbox/maps/MapController;->cancelableSubscriberSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 3
    sget-object v0, Lcom/mapbox/maps/MapController$LifecycleState;->STATE_STOPPED:Lcom/mapbox/maps/MapController$LifecycleState;

    iput-object v0, p0, Lcom/mapbox/maps/MapController;->lifecycleState:Lcom/mapbox/maps/MapController$LifecycleState;

    .line 4
    invoke-static {}, Lcom/mapbox/common/MapboxOptions;->getAccessToken()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 5
    iput-object p1, p0, Lcom/mapbox/maps/MapController;->renderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    .line 6
    iput-object p2, p0, Lcom/mapbox/maps/MapController;->mapInitOptions:Lcom/mapbox/maps/MapInitOptions;

    .line 7
    invoke-virtual {p2}, Lcom/mapbox/maps/MapInitOptions;->getMapOptions()Lcom/mapbox/maps/MapOptions;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/MapOptions;->getContextMode()Lcom/mapbox/maps/ContextMode;

    move-result-object v0

    iput-object v0, p0, Lcom/mapbox/maps/MapController;->contextMode:Lcom/mapbox/maps/ContextMode;

    .line 8
    const-string v0, "MapController"

    const-string v1, "Registering asset file source factory"

    invoke-static {v0, v1}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    new-instance v0, Lcom/mapbox/maps/assets/AssetManagerProvider;

    invoke-direct {v0}, Lcom/mapbox/maps/assets/AssetManagerProvider;-><init>()V

    invoke-virtual {p2}, Lcom/mapbox/maps/MapInitOptions;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/assets/AssetManagerProvider;->initialize(Landroid/content/res/AssetManager;)V

    .line 10
    sget-object v0, Lcom/mapbox/maps/MapProvider;->INSTANCE:Lcom/mapbox/maps/MapProvider;

    invoke-virtual {v0, p2, p1}, Lcom/mapbox/maps/MapProvider;->getNativeMapWrapper(Lcom/mapbox/maps/MapInitOptions;Lcom/mapbox/maps/MapClient;)Lcom/mapbox/maps/NativeMapImpl;

    move-result-object v1

    iput-object v1, p0, Lcom/mapbox/maps/MapController;->nativeMap:Lcom/mapbox/maps/NativeMapImpl;

    .line 11
    new-instance v2, Lcom/mapbox/maps/NativeObserver;

    invoke-direct {v2, v1}, Lcom/mapbox/maps/NativeObserver;-><init>(Lcom/mapbox/maps/NativeMapImpl;)V

    iput-object v2, p0, Lcom/mapbox/maps/MapController;->nativeObserver:Lcom/mapbox/maps/NativeObserver;

    .line 12
    invoke-virtual {p2}, Lcom/mapbox/maps/MapInitOptions;->getMapOptions()Lcom/mapbox/maps/MapOptions;

    move-result-object v3

    invoke-virtual {v3}, Lcom/mapbox/maps/MapOptions;->getPixelRatio()F

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/mapbox/maps/MapProvider;->getMapboxMap(Lcom/mapbox/maps/NativeMapImpl;Lcom/mapbox/maps/NativeObserver;F)Lcom/mapbox/maps/MapboxMap;

    move-result-object v2

    .line 13
    iput-object v2, p0, Lcom/mapbox/maps/MapController;->_mapboxMap:Lcom/mapbox/maps/MapboxMap;

    .line 14
    invoke-virtual {p0}, Lcom/mapbox/maps/MapController;->getMapboxMap()Lcom/mapbox/maps/MapboxMap;

    move-result-object v2

    invoke-virtual {p1}, Lcom/mapbox/maps/renderer/MapboxRenderer;->getRenderThread$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxRenderThread;

    move-result-object v3

    invoke-virtual {v3}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->getRenderHandlerThread$maps_sdk_release()Lcom/mapbox/maps/renderer/RenderHandlerThread;

    move-result-object v3

    invoke-virtual {v3}, Lcom/mapbox/maps/renderer/RenderHandlerThread;->getHandler$maps_sdk_release()Landroid/os/Handler;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/mapbox/maps/MapboxMap;->setRenderHandler$maps_sdk_release(Landroid/os/Handler;)V

    .line 15
    invoke-virtual {p0}, Lcom/mapbox/maps/MapController;->getMapboxMap()Lcom/mapbox/maps/MapboxMap;

    move-result-object v2

    .line 16
    invoke-virtual {p2}, Lcom/mapbox/maps/MapInitOptions;->getContext()Landroid/content/Context;

    move-result-object v3

    .line 17
    invoke-virtual {v0, v3}, Lcom/mapbox/maps/MapProvider;->getMapTelemetryInstance(Landroid/content/Context;)Lcom/mapbox/maps/module/MapTelemetry;

    move-result-object v3

    .line 18
    invoke-virtual {v0}, Lcom/mapbox/maps/MapProvider;->getMapGeofencingConsent()Lcom/mapbox/maps/geofencing/MapGeofencingConsent;

    move-result-object v4

    .line 19
    invoke-virtual {v0, v2, p0, v3, v4}, Lcom/mapbox/maps/MapProvider;->getMapPluginRegistry(Lcom/mapbox/maps/MapboxMap;Lcom/mapbox/maps/MapController;Lcom/mapbox/maps/module/MapTelemetry;Lcom/mapbox/maps/geofencing/MapGeofencingConsent;)Lev/k;

    move-result-object v0

    iput-object v0, p0, Lcom/mapbox/maps/MapController;->pluginRegistry:Lev/k;

    .line 20
    new-instance v0, Lcom/mapbox/maps/b;

    invoke-direct {v0, p0}, Lcom/mapbox/maps/b;-><init>(Lcom/mapbox/maps/MapController;)V

    iput-object v0, p0, Lcom/mapbox/maps/MapController;->cameraChangedCoalescedCallback:Lcom/mapbox/maps/CameraChangedCoalescedCallback;

    .line 21
    new-instance v0, Lcom/mapbox/maps/b;

    invoke-direct {v0, p0}, Lcom/mapbox/maps/b;-><init>(Lcom/mapbox/maps/MapController;)V

    iput-object v0, p0, Lcom/mapbox/maps/MapController;->styleDataLoadedCallback:Lcom/mapbox/maps/StyleDataLoadedCallback;

    .line 22
    invoke-virtual {p1, v1}, Lcom/mapbox/maps/renderer/MapboxRenderer;->setMap(Lcom/mapbox/maps/NativeMapImpl;)V

    .line 23
    invoke-virtual {p2}, Lcom/mapbox/maps/MapInitOptions;->getCameraOptions()Lcom/mapbox/maps/CameraOptions;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 24
    invoke-virtual {p0}, Lcom/mapbox/maps/MapController;->getMapboxMap()Lcom/mapbox/maps/MapboxMap;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/mapbox/maps/MapboxMap;->setCamera(Lcom/mapbox/maps/CameraOptions;)V

    :cond_0
    return-void

    .line 25
    :cond_1
    new-instance p1, Lcom/mapbox/maps/MapboxConfigurationException;

    invoke-direct {p1}, Lcom/mapbox/maps/MapboxConfigurationException;-><init>()V

    throw p1
.end method

.method public constructor <init>(Lcom/mapbox/maps/renderer/MapboxRenderer;Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/MapInitOptions;Lcom/mapbox/maps/ContextMode;Lcom/mapbox/maps/NativeMapImpl;Lcom/mapbox/maps/MapboxMap;Lev/k;Lcom/mapbox/maps/StyleDataLoadedCallback;)V
    .locals 1

    const-string v0, "renderer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeObserver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapInitOptions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeMap"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapboxMap"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pluginRegistry"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onStyleLoadingFinishedListener"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/mapbox/maps/MapController;->cancelableSubscriberSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 28
    sget-object v0, Lcom/mapbox/maps/MapController$LifecycleState;->STATE_STOPPED:Lcom/mapbox/maps/MapController$LifecycleState;

    iput-object v0, p0, Lcom/mapbox/maps/MapController;->lifecycleState:Lcom/mapbox/maps/MapController$LifecycleState;

    .line 29
    iput-object p1, p0, Lcom/mapbox/maps/MapController;->renderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    .line 30
    iput-object p2, p0, Lcom/mapbox/maps/MapController;->nativeObserver:Lcom/mapbox/maps/NativeObserver;

    .line 31
    iput-object p3, p0, Lcom/mapbox/maps/MapController;->mapInitOptions:Lcom/mapbox/maps/MapInitOptions;

    .line 32
    iput-object p4, p0, Lcom/mapbox/maps/MapController;->contextMode:Lcom/mapbox/maps/ContextMode;

    .line 33
    iput-object p5, p0, Lcom/mapbox/maps/MapController;->nativeMap:Lcom/mapbox/maps/NativeMapImpl;

    .line 34
    iput-object p6, p0, Lcom/mapbox/maps/MapController;->_mapboxMap:Lcom/mapbox/maps/MapboxMap;

    .line 35
    iput-object p7, p0, Lcom/mapbox/maps/MapController;->pluginRegistry:Lev/k;

    .line 36
    new-instance p1, Lab/g0;

    const/16 p2, 0x11

    invoke-direct {p1, p7, p2}, Lab/g0;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lcom/mapbox/maps/MapController;->cameraChangedCoalescedCallback:Lcom/mapbox/maps/CameraChangedCoalescedCallback;

    .line 37
    iput-object p8, p0, Lcom/mapbox/maps/MapController;->styleDataLoadedCallback:Lcom/mapbox/maps/StyleDataLoadedCallback;

    return-void
.end method

.method private static final _init_$lambda$0(Lcom/mapbox/maps/MapController;Lcom/mapbox/maps/CameraChangedCoalesced;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/mapbox/maps/MapController;->pluginRegistry:Lev/k;

    invoke-virtual {p1}, Lcom/mapbox/maps/CameraChangedCoalesced;->getCameraState()Lcom/mapbox/maps/CameraState;

    move-result-object p1

    const-string v0, "it.cameraState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lev/k;->a(Lcom/mapbox/maps/CameraState;)V

    return-void
.end method

.method private static final _init_$lambda$2(Lcom/mapbox/maps/MapController;Lcom/mapbox/maps/StyleDataLoaded;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mapbox/maps/StyleDataLoaded;->getType()Lcom/mapbox/maps/StyleDataLoadedType;

    move-result-object p1

    sget-object v0, Lcom/mapbox/maps/StyleDataLoadedType;->STYLE:Lcom/mapbox/maps/StyleDataLoadedType;

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/mapbox/maps/MapController;->getMapboxMap()Lcom/mapbox/maps/MapboxMap;

    move-result-object p1

    new-instance v0, Lcom/mapbox/maps/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/mapbox/maps/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Lcom/mapbox/maps/MapboxMap;->getStyle(Lcom/mapbox/maps/Style$OnStyleLoaded;)V

    :cond_0
    return-void
.end method

.method private static final _init_$lambda$2$lambda$1(Lcom/mapbox/maps/MapController;Lcom/mapbox/maps/Style;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/mapbox/maps/MapController;->style:Lcom/mapbox/maps/Style;

    iget-object p0, p0, Lcom/mapbox/maps/MapController;->pluginRegistry:Lev/k;

    iget-object p0, p0, Lev/k;->g:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lev/m;

    invoke-interface {v0, p1}, Lev/m;->b(Lcom/mapbox/maps/Style;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static final _init_$lambda$4(Lev/k;Lcom/mapbox/maps/CameraChangedCoalesced;)V
    .locals 1

    const-string v0, "$pluginRegistry"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mapbox/maps/CameraChangedCoalesced;->getCameraState()Lcom/mapbox/maps/CameraState;

    move-result-object p1

    const-string v0, "it.cameraState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lev/k;->a(Lcom/mapbox/maps/CameraState;)V

    return-void
.end method

.method public static synthetic a(Lev/k;Lcom/mapbox/maps/CameraChangedCoalesced;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mapbox/maps/MapController;->_init_$lambda$4(Lev/k;Lcom/mapbox/maps/CameraChangedCoalesced;)V

    return-void
.end method

.method public static synthetic b(Lcom/mapbox/maps/MapController;II)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/mapbox/maps/MapController;->onSizeChanged$lambda$9(Lcom/mapbox/maps/MapController;II)V

    return-void
.end method

.method public static synthetic c(Lcom/mapbox/maps/MapController;Lcom/mapbox/maps/Style;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mapbox/maps/MapController;->_init_$lambda$2$lambda$1(Lcom/mapbox/maps/MapController;Lcom/mapbox/maps/Style;)V

    return-void
.end method

.method public static synthetic d(Lcom/mapbox/maps/MapController;Lcom/mapbox/maps/CameraChangedCoalesced;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mapbox/maps/MapController;->_init_$lambda$0(Lcom/mapbox/maps/MapController;Lcom/mapbox/maps/CameraChangedCoalesced;)V

    return-void
.end method

.method public static synthetic e(Lcom/mapbox/maps/MapController;Lcom/mapbox/maps/StyleDataLoaded;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mapbox/maps/MapController;->_init_$lambda$2(Lcom/mapbox/maps/MapController;Lcom/mapbox/maps/StyleDataLoaded;)V

    return-void
.end method

.method private static synthetic getCameraChangedCoalescedCallback$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getLifecycleState$maps_sdk_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic initializePlugins$default(Lcom/mapbox/maps/MapController;Lcom/mapbox/maps/MapInitOptions;Lcom/mapbox/maps/MapView;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/mapbox/maps/MapController;->initializePlugins(Lcom/mapbox/maps/MapInitOptions;Lcom/mapbox/maps/MapView;)V

    return-void
.end method

.method private static final onSizeChanged$lambda$9(Lcom/mapbox/maps/MapController;II)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->renderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/renderer/MapboxRenderer;->onSurfaceChanged(II)V

    iget-object p0, p0, Lcom/mapbox/maps/MapController;->nativeMap:Lcom/mapbox/maps/NativeMapImpl;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/mapbox/maps/NativeMapImpl;->setSizeSet$maps_sdk_release(Z)V

    return-void
.end method


# virtual methods
.method public addRendererSetupErrorListener(Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V
    .locals 2

    const-string v0, "rendererSetupErrorListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->renderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->getRenderThread$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxRenderThread;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->getRenderHandlerThread$maps_sdk_release()Lcom/mapbox/maps/renderer/RenderHandlerThread;

    move-result-object v0

    new-instance v1, Lcom/mapbox/maps/MapController$addRendererSetupErrorListener$1;

    invoke-direct {v1, p0, p1}, Lcom/mapbox/maps/MapController$addRendererSetupErrorListener$1;-><init>(Lcom/mapbox/maps/MapController;Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/renderer/RenderHandlerThread;->post(Lc93/a;)V

    return-void
.end method

.method public addWidget(Lcom/mapbox/maps/renderer/widget/Widget;)V
    .locals 2

    const-string v0, "widget"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->contextMode:Lcom/mapbox/maps/ContextMode;

    sget-object v1, Lcom/mapbox/maps/ContextMode;->SHARED:Lcom/mapbox/maps/ContextMode;

    if-ne v0, v1, :cond_0

    new-instance v0, Lcom/mapbox/maps/MapController$addWidget$1;

    invoke-direct {v0, p0}, Lcom/mapbox/maps/MapController$addWidget$1;-><init>(Lcom/mapbox/maps/MapController;)V

    invoke-virtual {p1, v0}, Lcom/mapbox/maps/renderer/widget/Widget;->setTriggerRepaintAction$maps_sdk_release(Lc93/a;)V

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->renderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->getRenderThread$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxRenderThread;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->addWidget(Lcom/mapbox/maps/renderer/widget/Widget;)V

    iget-object p1, p0, Lcom/mapbox/maps/MapController;->renderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    invoke-virtual {p1}, Lcom/mapbox/maps/renderer/MapboxRenderer;->scheduleRepaint()V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Map view or map surface must be init with MapInitOptions.mapOptions.contextMode = ContextMode.SHARED when using widgets!"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final createPlugin(Lcom/mapbox/maps/MapView;Lev/q;)V
    .locals 5

    const-string v0, "plugin"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->pluginRegistry:Lev/k;

    iget-object v1, p0, Lcom/mapbox/maps/MapController;->mapInitOptions:Lcom/mapbox/maps/MapInitOptions;

    iget-object v2, v0, Lev/k;->d:Ljava/util/LinkedHashMap;

    const-string v3, "mapInitOptions"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p2, Lev/q;->a:Ljava/lang/String;

    iget-object p2, p2, Lev/q;->b:Lev/j;

    if-eqz p2, :cond_b

    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    instance-of v4, p2, Lev/s;

    if-eqz v4, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/mapbox/maps/plugin/InvalidViewPluginHostException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cause: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-interface {v2, v3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v0, Lev/k;->a:Lev/i;

    invoke-interface {p2, v2}, Lev/j;->f(Lev/i;)V

    if-eqz v4, :cond_2

    move-object v2, p2

    check-cast v2, Lev/s;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/mapbox/maps/MapInitOptions;->getAttrs()Landroid/util/AttributeSet;

    move-result-object v3

    invoke-virtual {v1}, Lcom/mapbox/maps/MapInitOptions;->getMapOptions()Lcom/mapbox/maps/MapOptions;

    move-result-object v4

    invoke-virtual {v4}, Lcom/mapbox/maps/MapOptions;->getPixelRatio()F

    move-result v4

    invoke-interface {v2, p1, v3, v4}, Lev/s;->g(Lcom/mapbox/maps/MapView;Landroid/util/AttributeSet;F)Landroid/view/View;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-interface {v2, v3}, Lev/s;->c(Landroid/view/View;)V

    :cond_2
    instance-of p1, p2, Lev/a;

    if-eqz p1, :cond_3

    move-object p1, p2

    check-cast p1, Lev/a;

    invoke-virtual {v1}, Lcom/mapbox/maps/MapInitOptions;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1}, Lcom/mapbox/maps/MapInitOptions;->getAttrs()Landroid/util/AttributeSet;

    move-result-object v3

    invoke-virtual {v1}, Lcom/mapbox/maps/MapInitOptions;->getMapOptions()Lcom/mapbox/maps/MapOptions;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mapbox/maps/MapOptions;->getPixelRatio()F

    move-result v1

    invoke-interface {p1, v2, v3, v1}, Lev/a;->e(Landroid/content/Context;Landroid/util/AttributeSet;F)V

    :cond_3
    instance-of p1, p2, Lev/l;

    if-eqz p1, :cond_4

    iget-object p1, v0, Lev/k;->h:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    iget-object p1, v0, Lev/k;->c:Ll83/k;

    if-eqz p1, :cond_4

    move-object v1, p2

    check-cast v1, Lev/l;

    iget-object v2, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-interface {v1, v2, p1}, Lev/l;->onSizeChanged(II)V

    :cond_4
    instance-of p1, p2, Lev/g;

    if-eqz p1, :cond_5

    iget-object p1, v0, Lev/k;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    :cond_5
    instance-of p1, p2, Lov/c;

    if-eqz p1, :cond_6

    iget-object p1, v0, Lev/k;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    :cond_6
    instance-of p1, p2, Lev/m;

    if-eqz p1, :cond_7

    iget-object p1, v0, Lev/k;->g:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    :cond_7
    instance-of p1, p2, Lqv/c;

    if-eqz p1, :cond_8

    move-object p1, p2

    check-cast p1, Lqv/c;

    iput-object p1, v0, Lev/k;->i:Lqv/c;

    :cond_8
    invoke-interface {p2}, Lev/j;->initialize()V

    iget p1, v0, Lev/k;->b:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_a

    instance-of p1, p2, Lev/b;

    if-eqz p1, :cond_a

    check-cast p2, Lev/b;

    invoke-interface {p2}, Lev/b;->onStart()V

    return-void

    :cond_9
    invoke-virtual {v2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lev/j;

    if-eqz p1, :cond_a

    invoke-interface {p1}, Lev/j;->initialize()V

    :cond_a
    return-void

    :cond_b
    new-instance p1, Lcom/mapbox/maps/MapboxConfigurationException;

    const-string p2, "MapPlugin instance is missing for "

    const/16 v0, 0x21

    invoke-static {v0, p2, v3}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/mapbox/maps/MapboxConfigurationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getLifecycleState$maps_sdk_release()Lcom/mapbox/maps/MapController$LifecycleState;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->lifecycleState:Lcom/mapbox/maps/MapController$LifecycleState;

    return-object v0
.end method

.method public getMapboxMap()Lcom/mapbox/maps/MapboxMap;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->_mapboxMap:Lcom/mapbox/maps/MapboxMap;

    return-object v0
.end method

.method public final synthetic getMapboxMapDeprecated()Lcom/mapbox/maps/MapboxMap;
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    invoke-virtual {p0}, Lcom/mapbox/maps/MapController;->getMapboxMap()Lcom/mapbox/maps/MapboxMap;

    move-result-object v0

    return-object v0
.end method

.method public final getNativeMap()Lcom/mapbox/maps/NativeMapImpl;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->nativeMap:Lcom/mapbox/maps/NativeMapImpl;

    return-object v0
.end method

.method public getPlugin(Ljava/lang/String;)Lev/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lev/j;",
            ">(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->pluginRegistry:Lev/k;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lev/k;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lev/j;

    return-object p1
.end method

.method public final getRenderer$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxRenderer;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->renderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    return-object v0
.end method

.method public final initializePlugins(Lcom/mapbox/maps/MapInitOptions;Lcom/mapbox/maps/MapView;)V
    .locals 8

    const-string v0, "MapController"

    const-string v1, "options"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mapbox/maps/MapInitOptions;->getPlugins()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lev/q;

    const/4 v3, 0x1

    :try_start_0
    iget-object v4, v2, Lev/q;->a:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v5, "MAPBOX_LOCATION_COMPONENT_PLUGIN_ID"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto/16 :goto_1

    :cond_1
    new-instance v4, Lrv/m;

    invoke-direct {v4}, Lrv/m;-><init>()V

    goto/16 :goto_2

    :sswitch_1
    const-string v5, "MAPBOX_CAMERA_PLUGIN_ID"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto/16 :goto_1

    :cond_2
    new-instance v4, Lfv/h;

    invoke-direct {v4}, Lfv/h;-><init>()V

    goto/16 :goto_2

    :sswitch_2
    const-string v5, "MAPBOX_MAP_OVERLAY_PLUGIN_ID"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto/16 :goto_1

    :cond_3
    new-instance v4, Lwv/a;

    invoke-direct {v4}, Lwv/a;-><init>()V

    goto/16 :goto_2

    :sswitch_3
    const-string v5, "MAPBOX_ATTRIBUTION_PLUGIN_ID"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto/16 :goto_1

    :cond_4
    new-instance v4, Liv/g;

    invoke-direct {v4}, Liv/g;-><init>()V

    goto/16 :goto_2

    :sswitch_4
    const-string v5, "MAPBOX_VIEWPORT_PLUGIN_ID"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto/16 :goto_1

    :cond_5
    new-instance v4, Lzv/b;

    invoke-direct {v4}, Lzv/b;-><init>()V

    goto/16 :goto_2

    :sswitch_5
    const-string v5, "MAPBOX_SCALEBAR_PLUGIN_ID"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    goto/16 :goto_1

    :cond_6
    new-instance v4, Lxv/g;

    invoke-direct {v4}, Lxv/g;-><init>()V

    goto/16 :goto_2

    :sswitch_6
    const-string v5, "MAPBOX_LOGO_PLUGIN_ID"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    goto :goto_1

    :cond_7
    new-instance v4, Luv/d;

    invoke-direct {v4}, Luv/d;-><init>()V

    goto/16 :goto_2

    :sswitch_7
    const-string v5, "MAPBOX_GESTURES_PLUGIN_ID"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    goto :goto_1

    :cond_8
    invoke-virtual {p1}, Lcom/mapbox/maps/MapInitOptions;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {p1}, Lcom/mapbox/maps/MapInitOptions;->getAttrs()Landroid/util/AttributeSet;

    move-result-object v5

    invoke-virtual {p1}, Lcom/mapbox/maps/MapInitOptions;->getMapOptions()Lcom/mapbox/maps/MapOptions;

    move-result-object v6

    invoke-virtual {v6}, Lcom/mapbox/maps/MapOptions;->getPixelRatio()F

    move-result v6

    const-string v7, "context"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v5, :cond_9

    new-instance v7, Lov/o;

    invoke-direct {v7, v4, v5, v6}, Lov/o;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;F)V

    move-object v4, v7

    goto :goto_2

    :cond_9
    new-instance v5, Lov/o;

    invoke-direct {v5, v4, v6}, Lov/o;-><init>(Landroid/content/Context;F)V

    move-object v4, v5

    goto :goto_2

    :sswitch_8
    const-string v5, "MAPBOX_ANNOTATION_PLUGIN_ID"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    goto :goto_1

    :cond_a
    new-instance v4, Lhv/a;

    invoke-direct {v4}, Lhv/a;-><init>()V

    goto :goto_2

    :sswitch_9
    const-string v5, "MAPBOX_COMPASS_PLUGIN_ID"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    goto :goto_1

    :cond_b
    new-instance v4, Lkv/d;

    invoke-direct {v4}, Lkv/d;-><init>()V

    goto :goto_2

    :sswitch_a
    const-string v5, "MAPBOX_LIFECYCLE_PLUGIN_ID"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    :goto_1
    iget-object v4, v2, Lev/q;->b:Lev/j;

    if-eqz v4, :cond_c

    goto :goto_2

    :cond_c
    new-instance v4, Lcom/mapbox/maps/MapboxConfigurationException;

    const-string v5, "Custom non Mapbox plugins must have non-null `instance` parameter!"

    invoke-direct {v4, v5}, Lcom/mapbox/maps/MapboxConfigurationException;-><init>(Ljava/lang/String;)V

    throw v4

    :cond_d
    new-instance v4, Lqv/c;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    :goto_2
    new-instance v5, Lev/o;

    iget-object v6, v2, Lev/q;->a:Ljava/lang/String;

    invoke-direct {v5, v6, v4}, Lev/q;-><init>(Ljava/lang/String;Lev/j;)V

    invoke-virtual {p0, p2, v5}, Lcom/mapbox/maps/MapController;->createPlugin(Lcom/mapbox/maps/MapView;Lev/q;)V

    instance-of v5, v2, Lev/p;

    if-eqz v5, :cond_0

    instance-of v5, v4, Lfv/a;

    if-eqz v5, :cond_e

    invoke-virtual {p0}, Lcom/mapbox/maps/MapController;->getMapboxMap()Lcom/mapbox/maps/MapboxMap;

    move-result-object v5

    check-cast v4, Lfv/a;

    invoke-virtual {v5, v4}, Lcom/mapbox/maps/MapboxMap;->setCameraAnimationsPlugin$maps_sdk_release(Lfv/a;)V

    goto/16 :goto_0

    :cond_e
    instance-of v5, v4, Lov/c;

    if-eqz v5, :cond_0

    invoke-virtual {p0}, Lcom/mapbox/maps/MapController;->getMapboxMap()Lcom/mapbox/maps/MapboxMap;

    move-result-object v5

    check-cast v4, Lov/c;

    invoke-virtual {v5, v4}, Lcom/mapbox/maps/MapboxMap;->setGesturesPlugin$maps_sdk_release(Lov/c;)V
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/mapbox/maps/plugin/InvalidViewPluginHostException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    const-string v3, "%s plugin requires a View hierarchy to be injected, plugin is ignored."

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    :catch_1
    iget-object v2, v2, Lev/q;->a:Ljava/lang/String;

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    const-string v3, "Add %s plugin dependency to the classpath take automatically load the plugin implementation."

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_f
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x79ca8a5e -> :sswitch_a
        -0x6a06beb6 -> :sswitch_9
        -0x5c912c19 -> :sswitch_8
        -0xe9d98be -> :sswitch_7
        -0xdb0749d -> :sswitch_6
        0x22100ec1 -> :sswitch_5
        0x343a509e -> :sswitch_4
        0x39572077 -> :sswitch_3
        0x4bd2b6c5 -> :sswitch_2
        0x524ae05d -> :sswitch_1
        0x710f488b -> :sswitch_0
    .end sparse-switch
.end method

.method public final onAttachedToWindow$maps_sdk_release(Lcom/mapbox/maps/MapView;)V
    .locals 3

    const-string v0, "mapView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->pluginRegistry:Lev/k;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lev/k;->i:Lqv/c;

    if-eqz v0, :cond_0

    new-instance v0, Lqv/e;

    invoke-direct {v0, p1}, Lqv/e;-><init>(Lcom/mapbox/maps/MapView;)V

    new-instance v1, Lqv/b;

    invoke-direct {v1, p1}, Lqv/b;-><init>(Lcom/mapbox/maps/MapView;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    new-instance v2, Lqv/a;

    invoke-direct {v2, p1, v0, p1, v1}, Lqv/a;-><init>(Lcom/mapbox/maps/MapView;Lqv/e;Lcom/mapbox/maps/MapView;Lqv/b;)V

    iget-object p1, v0, Lqv/e;->x:Landroidx/lifecycle/i0;

    invoke-virtual {p1, v2}, Landroidx/lifecycle/i0;->a(Landroidx/lifecycle/f0;)V

    :cond_0
    return-void
.end method

.method public onDestroy()V
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->lifecycleState:Lcom/mapbox/maps/MapController$LifecycleState;

    sget-object v1, Lcom/mapbox/maps/MapController$LifecycleState;->STATE_DESTROYED:Lcom/mapbox/maps/MapController$LifecycleState;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iput-object v1, p0, Lcom/mapbox/maps/MapController;->lifecycleState:Lcom/mapbox/maps/MapController$LifecycleState;

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->pluginRegistry:Lev/k;

    iget-object v0, v0, Lev/k;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lev/j;

    invoke-interface {v1}, Lev/j;->a()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/mapbox/maps/MapController;->nativeObserver:Lcom/mapbox/maps/NativeObserver;

    invoke-virtual {v0}, Lcom/mapbox/maps/NativeObserver;->onDestroy()V

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->renderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->onDestroy()V

    invoke-virtual {p0}, Lcom/mapbox/maps/MapController;->getMapboxMap()Lcom/mapbox/maps/MapboxMap;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/MapboxMap;->onDestroy$maps_sdk_release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mapbox/maps/MapController;->style:Lcom/mapbox/maps/Style;

    return-void
.end method

.method public onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 14

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->pluginRegistry:Lev/k;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lev/k;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lov/c;

    check-cast v3, Lov/o;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v4

    const/4 v5, 0x2

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_8

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v4

    const/16 v5, 0x8

    if-ne v4, v5, :cond_8

    iget-object v4, v3, Lov/o;->u0:Lpv/b;

    iget-boolean v4, v4, Lpv/b;->x:Z

    if-nez v4, :cond_1

    goto/16 :goto_1

    :cond_1
    iget-object v2, v3, Lov/o;->K:Lfv/a;

    const/4 v4, 0x0

    const-string v5, "cameraAnimationsPlugin"

    if-eqz v2, :cond_7

    iget-object v6, v3, Lov/o;->L:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-static {v6}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v6

    check-cast v2, Lfv/h;

    invoke-virtual {v2, v6}, Lfv/h;->b(Ljava/util/List;)V

    const/16 v2, 0x9

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v2

    iget-object v6, v3, Lov/o;->I:Lcom/mapbox/maps/MapboxMap;

    if-eqz v6, :cond_6

    invoke-interface {v6}, Lmv/a;->getCameraState()Lcom/mapbox/maps/CameraState;

    move-result-object v6

    invoke-virtual {v6}, Lcom/mapbox/maps/CameraState;->getZoom()D

    move-result-wide v6

    iget-object v8, v3, Lov/o;->K:Lfv/a;

    if-eqz v8, :cond_5

    check-cast v8, Lfv/h;

    invoke-virtual {v8}, Lfv/h;->i()Lcom/mapbox/maps/ScreenCoordinate;

    move-result-object v8

    invoke-static {p1}, Ldc/a;->l(Landroid/view/MotionEvent;)Lcom/mapbox/maps/ScreenCoordinate;

    move-result-object v9

    iget-object v10, v3, Lov/o;->K:Lfv/a;

    if-eqz v10, :cond_4

    float-to-double v10, v2

    invoke-static {v10, v11}, Ljava/lang/Math;->log(D)D

    move-result-wide v10

    sget-wide v12, Le93/a;->a:D

    div-double/2addr v10, v12

    add-double/2addr v10, v6

    iget-object v2, v3, Lov/o;->K:Lfv/a;

    if-eqz v2, :cond_3

    new-instance v6, Lcom/mapbox/maps/CameraOptions$Builder;

    invoke-direct {v6}, Lcom/mapbox/maps/CameraOptions$Builder;-><init>()V

    invoke-virtual {v6, v9}, Lcom/mapbox/maps/CameraOptions$Builder;->anchor(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions$Builder;

    move-result-object v6

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/mapbox/maps/CameraOptions$Builder;->zoom(Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions$Builder;

    move-result-object v6

    invoke-virtual {v6}, Lcom/mapbox/maps/CameraOptions$Builder;->build()Lcom/mapbox/maps/CameraOptions;

    move-result-object v6

    const-string v7, "Builder().anchor(anchor).zoom(zoom).build()"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, Lov/o;->v0:Lfv/p;

    check-cast v2, Lfv/h;

    invoke-virtual {v2, v6, v7, v4}, Lfv/h;->h(Lcom/mapbox/maps/CameraOptions;Lfv/p;Landroid/animation/AnimatorListenerAdapter;)Lcom/mapbox/common/Cancelable;

    iget-object v2, v3, Lov/o;->K:Lfv/a;

    if-eqz v2, :cond_2

    check-cast v2, Lfv/h;

    invoke-virtual {v2, v8}, Lfv/h;->k(Lcom/mapbox/maps/ScreenCoordinate;)V

    goto :goto_2

    :cond_2
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_3
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_4
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_5
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_6
    const-string p1, "mapCameraManagerDelegate"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_7
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_8
    :goto_1
    if-eqz v2, :cond_0

    :goto_2
    const/4 v2, 0x1

    goto/16 :goto_0

    :cond_9
    return v2
.end method

.method public onLowMemory()V
    .locals 1

    invoke-virtual {p0}, Lcom/mapbox/maps/MapController;->getMapboxMap()Lcom/mapbox/maps/MapboxMap;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/MapboxMap;->reduceMemoryUse()V

    return-void
.end method

.method public onSizeChanged(II)V
    .locals 4

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->nativeMap:Lcom/mapbox/maps/NativeMapImpl;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/NativeMapImpl;->setSizeSet$maps_sdk_release(Z)V

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->renderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    new-instance v1, Lcom/mapbox/maps/c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lcom/mapbox/maps/c;-><init>(Ljava/lang/Object;III)V

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/renderer/MapboxRenderer;->queueRenderEvent(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->pluginRegistry:Lev/k;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v3, v0, Lev/k;->c:Ll83/k;

    iget-object v0, v0, Lev/k;->h:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lev/l;

    invoke-interface {v1, p1, p2}, Lev/l;->onSizeChanged(II)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onStart()V
    .locals 10

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->lifecycleState:Lcom/mapbox/maps/MapController$LifecycleState;

    sget-object v1, Lcom/mapbox/maps/MapController$LifecycleState;->STATE_STARTED:Lcom/mapbox/maps/MapController$LifecycleState;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iput-object v1, p0, Lcom/mapbox/maps/MapController;->lifecycleState:Lcom/mapbox/maps/MapController$LifecycleState;

    invoke-virtual {p0}, Lcom/mapbox/maps/MapController;->getMapboxMap()Lcom/mapbox/maps/MapboxMap;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/MapboxMap;->getStyle()Lcom/mapbox/maps/Style;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/mapbox/maps/MapController;->style:Lcom/mapbox/maps/Style;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iput-object v0, p0, Lcom/mapbox/maps/MapController;->style:Lcom/mapbox/maps/Style;

    iget-object v1, p0, Lcom/mapbox/maps/MapController;->pluginRegistry:Lev/k;

    iget-object v1, v1, Lev/k;->g:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lev/m;

    invoke-interface {v2, v0}, Lev/m;->b(Lcom/mapbox/maps/Style;)V

    goto :goto_0

    :cond_1
    iget-object v3, p0, Lcom/mapbox/maps/MapController;->nativeObserver:Lcom/mapbox/maps/NativeObserver;

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->cancelableSubscriberSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    iget-object v1, p0, Lcom/mapbox/maps/MapController;->cameraChangedCoalescedCallback:Lcom/mapbox/maps/CameraChangedCoalescedCallback;

    const/4 v2, 0x0

    const/4 v9, 0x2

    invoke-static {v3, v1, v2, v9, v2}, Lcom/mapbox/maps/NativeObserver;->subscribeCameraChangedCoalesced$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/CameraChangedCoalescedCallback;Lc93/a;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->cancelableSubscriberSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    iget-object v4, p0, Lcom/mapbox/maps/MapController;->styleDataLoadedCallback:Lcom/mapbox/maps/StyleDataLoadedCallback;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/mapbox/maps/NativeObserver;->subscribeStyleDataLoaded$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/StyleDataLoadedCallback;Lc93/a;Lnv/j;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->renderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->onStart()V

    invoke-virtual {p0}, Lcom/mapbox/maps/MapController;->getMapboxMap()Lcom/mapbox/maps/MapboxMap;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/MapboxMap;->isStyleLoadInitiated$maps_sdk_release()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->mapInitOptions:Lcom/mapbox/maps/MapInitOptions;

    invoke-virtual {v0}, Lcom/mapbox/maps/MapInitOptions;->getStyleUri()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/mapbox/maps/MapController;->getMapboxMap()Lcom/mapbox/maps/MapboxMap;

    move-result-object v1

    invoke-static {v1, v0, v2, v9, v2}, Lcom/mapbox/maps/MapboxMap;->loadStyle$default(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Lcom/mapbox/maps/Style$OnStyleLoaded;ILjava/lang/Object;)V

    :cond_2
    iget-object v0, p0, Lcom/mapbox/maps/MapController;->pluginRegistry:Lev/k;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lev/k;->b(I)V

    return-void
.end method

.method public onStop()V
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->lifecycleState:Lcom/mapbox/maps/MapController$LifecycleState;

    sget-object v1, Lcom/mapbox/maps/MapController$LifecycleState;->STATE_STOPPED:Lcom/mapbox/maps/MapController$LifecycleState;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iput-object v1, p0, Lcom/mapbox/maps/MapController;->lifecycleState:Lcom/mapbox/maps/MapController$LifecycleState;

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->cancelableSubscriberSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mapbox/common/Cancelable;

    invoke-interface {v1}, Lcom/mapbox/common/Cancelable;->cancel()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/mapbox/maps/MapController;->cancelableSubscriberSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->renderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->onStop()V

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->pluginRegistry:Lev/k;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lev/k;->b(I)V

    sget-object v0, Lcom/mapbox/maps/MapProvider;->INSTANCE:Lcom/mapbox/maps/MapProvider;

    invoke-virtual {v0}, Lcom/mapbox/maps/MapProvider;->flushPendingEvents()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 17

    move-object/from16 v0, p1

    const-string v1, "event"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p0

    iget-object v2, v1, Lcom/mapbox/maps/MapController;->pluginRegistry:Lev/k;

    iget-object v2, v2, Lev/k;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :cond_0
    move v4, v3

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lov/c;

    check-cast v5, Lov/o;

    iget-object v6, v5, Lov/o;->p0:Ljava/util/ArrayList;

    iget-object v7, v5, Lov/o;->s0:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v8

    const/4 v9, 0x1

    if-eqz v8, :cond_1

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v8

    if-eq v8, v9, :cond_1

    move v11, v3

    goto/16 :goto_3

    :cond_1
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v8

    const/4 v10, 0x0

    if-nez v8, :cond_2

    invoke-virtual {v7, v10}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v8, v5, Lov/o;->p0:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    iget-object v8, v5, Lov/o;->n0:[Landroid/animation/ValueAnimator;

    invoke-virtual {v5, v8}, Lov/o;->o([Landroid/animation/ValueAnimator;)V

    iget-object v8, v5, Lov/o;->o0:[Landroid/animation/ValueAnimator;

    invoke-virtual {v5, v8}, Lov/o;->o([Landroid/animation/ValueAnimator;)V

    :cond_2
    iget-object v8, v5, Lov/o;->y:Lio/sentry/android/replay/video/d;

    if-eqz v8, :cond_10

    iget-object v8, v8, Lio/sentry/android/replay/video/d;->b:Ljava/lang/Object;

    check-cast v8, Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move v11, v3

    :cond_3
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lou/a;

    iget-object v13, v12, Lou/a;->e:Landroid/view/MotionEvent;

    if-eqz v13, :cond_4

    invoke-virtual {v13}, Landroid/view/MotionEvent;->recycle()V

    iput-object v10, v12, Lou/a;->e:Landroid/view/MotionEvent;

    :cond_4
    iget-object v13, v12, Lou/a;->d:Landroid/view/MotionEvent;

    if-eqz v13, :cond_5

    invoke-static {v13}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v13

    iput-object v13, v12, Lou/a;->e:Landroid/view/MotionEvent;

    iget-object v13, v12, Lou/a;->d:Landroid/view/MotionEvent;

    invoke-virtual {v13}, Landroid/view/MotionEvent;->recycle()V

    iput-object v10, v12, Lou/a;->d:Landroid/view/MotionEvent;

    :cond_5
    invoke-static {v0}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v13

    iput-object v13, v12, Lou/a;->d:Landroid/view/MotionEvent;

    invoke-virtual {v13}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v13

    iget-object v15, v12, Lou/a;->d:Landroid/view/MotionEvent;

    invoke-virtual {v15}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide v15

    sub-long/2addr v13, v15

    iput-wide v13, v12, Lou/a;->f:J

    invoke-virtual {v12, v0}, Lou/a;->a(Landroid/view/MotionEvent;)Z

    move-result v12

    if-eqz v12, :cond_3

    move v11, v9

    goto :goto_1

    :cond_6
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v8

    const-string v12, "coreGesturesHandler"

    if-eq v8, v9, :cond_a

    const/4 v7, 0x3

    if-eq v8, v7, :cond_8

    const/4 v6, 0x5

    if-eq v8, v6, :cond_7

    goto/16 :goto_3

    :cond_7
    invoke-virtual {v5}, Lov/o;->j()V

    goto :goto_3

    :cond_8
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    iget-object v6, v5, Lov/o;->r0:Lcom/mapbox/maps/util/CoreGesturesHandler;

    if-eqz v6, :cond_9

    invoke-virtual {v6}, Lcom/mapbox/maps/util/CoreGesturesHandler;->notifyCoreTouchEnded()V

    invoke-virtual {v5}, Lov/o;->j()V

    goto :goto_3

    :cond_9
    invoke-static {v12}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v10

    :cond_a
    invoke-virtual {v5}, Lov/o;->j()V

    iget-object v8, v5, Lov/o;->r0:Lcom/mapbox/maps/util/CoreGesturesHandler;

    if-eqz v8, :cond_f

    invoke-virtual {v8}, Lcom/mapbox/maps/util/CoreGesturesHandler;->notifyCoreTouchEnded()V

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_d

    invoke-virtual {v7, v10}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v5, v5, Lov/o;->K:Lfv/a;

    if-eqz v5, :cond_c

    new-array v7, v3, [Landroid/animation/ValueAnimator;

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v7

    const-string v8, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, [Landroid/animation/ValueAnimator;

    array-length v8, v7

    invoke-static {v7, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [Landroid/animation/ValueAnimator;

    check-cast v5, Lfv/h;

    const-string v8, "cameraAnimators"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance v10, La3/z0;

    const/4 v12, 0x7

    invoke-direct {v10, v12, v7, v5}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v10}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnMainThread(Lc93/a;)V

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/animation/ValueAnimator;

    invoke-virtual {v7}, Landroid/animation/ValueAnimator;->start()V

    goto :goto_2

    :cond_b
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    goto :goto_3

    :cond_c
    const-string v0, "cameraAnimationsPlugin"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v10

    :cond_d
    :goto_3
    if-nez v11, :cond_e

    if-eqz v4, :cond_0

    :cond_e
    move v4, v9

    goto/16 :goto_0

    :cond_f
    invoke-static {v12}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v10

    :cond_10
    const-string v0, "gesturesManager"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v10

    :cond_11
    return v4
.end method

.method public queueEvent(Ljava/lang/Runnable;Z)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/mapbox/maps/MapController;->renderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    invoke-virtual {p2, p1}, Lcom/mapbox/maps/renderer/MapboxRenderer;->queueRenderEvent(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object p2, p0, Lcom/mapbox/maps/MapController;->renderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    invoke-virtual {p2, p1}, Lcom/mapbox/maps/renderer/MapboxRenderer;->queueNonRenderEvent(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final removePlugin(Ljava/lang/String;)V
    .locals 4

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->pluginRegistry:Lev/k;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, Lev/k;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lev/j;

    instance-of v3, v2, Lev/g;

    if-eqz v3, :cond_0

    iget-object v0, v0, Lev/k;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    instance-of v3, v2, Lov/c;

    if-eqz v3, :cond_1

    iget-object v0, v0, Lev/k;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    instance-of v3, v2, Lev/m;

    if-eqz v3, :cond_2

    iget-object v0, v0, Lev/k;->g:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    instance-of v3, v2, Lev/l;

    if-eqz v3, :cond_3

    iget-object v0, v0, Lev/k;->h:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    instance-of v3, v2, Lqv/c;

    if-eqz v3, :cond_4

    const/4 v3, 0x0

    iput-object v3, v0, Lev/k;->i:Lqv/c;

    :cond_4
    :goto_0
    if-eqz v2, :cond_5

    invoke-interface {v2}, Lev/j;->a()V

    :cond_5
    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Removed plugin: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " from the Map."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "MapPluginRegistry"

    invoke-static {v0, p1}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public removeRendererSetupErrorListener(Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V
    .locals 2

    const-string v0, "rendererSetupErrorListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->renderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->getRenderThread$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxRenderThread;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->getRenderHandlerThread$maps_sdk_release()Lcom/mapbox/maps/renderer/RenderHandlerThread;

    move-result-object v0

    new-instance v1, Lcom/mapbox/maps/MapController$removeRendererSetupErrorListener$1;

    invoke-direct {v1, p0, p1}, Lcom/mapbox/maps/MapController$removeRendererSetupErrorListener$1;-><init>(Lcom/mapbox/maps/MapController;Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/renderer/RenderHandlerThread;->post(Lc93/a;)V

    return-void
.end method

.method public removeWidget(Lcom/mapbox/maps/renderer/widget/Widget;)Z
    .locals 1

    const-string v0, "widget"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->renderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->getRenderThread$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxRenderThread;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->removeWidget(Lcom/mapbox/maps/renderer/widget/Widget;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->renderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->scheduleRepaint()V

    :cond_0
    return p1
.end method

.method public final setLifecycleState$maps_sdk_release(Lcom/mapbox/maps/MapController$LifecycleState;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/mapbox/maps/MapController;->lifecycleState:Lcom/mapbox/maps/MapController$LifecycleState;

    return-void
.end method

.method public setMaximumFps(I)V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->renderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/renderer/MapboxRenderer;->setMaximumFps(I)V

    return-void
.end method

.method public setOnFpsChangedListener(Lcom/mapbox/maps/renderer/OnFpsChangedListener;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->renderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/renderer/MapboxRenderer;->setOnFpsChangedListener(Lcom/mapbox/maps/renderer/OnFpsChangedListener;)V

    return-void
.end method

.method public setRenderThreadStatsRecorder(Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;)V
    .locals 1

    const-string v0, "renderThreadStatsRecorder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/MapController;->renderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->getRenderThread$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxRenderThread;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->setRenderThreadStatsRecorder$maps_sdk_release(Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;)V

    return-void
.end method

.method public final setScreenRefreshRate$maps_sdk_release(I)V
    .locals 1

    if-gtz p1, :cond_0

    const-string p1, "MapController"

    const-string v0, "Screen refresh rate could not be <= 0! Setting max fps and fps counter will not work properly."

    invoke-static {p1, v0}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/mapbox/maps/MapController;->renderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->getRenderThread$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxRenderThread;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->setScreenRefreshRate(I)V

    return-void
.end method

.method public snapshot()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mapbox/maps/MapController;->renderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->snapshot()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public snapshot(Lcom/mapbox/maps/MapView$OnSnapshotReady;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/mapbox/maps/MapController;->renderer:Lcom/mapbox/maps/renderer/MapboxRenderer;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/renderer/MapboxRenderer;->snapshot(Lcom/mapbox/maps/MapView$OnSnapshotReady;)V

    return-void
.end method
