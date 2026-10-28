.class public Lcom/mapbox/maps/MapView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Lmv/f;
.implements Lcom/mapbox/maps/MapControllable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/maps/MapView$OnSnapshotReady;,
        Lcom/mapbox/maps/MapView$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00d2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0016\u0018\u0000 \u0087\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0087\u0001\u0088\u0001B\u001b\u0008\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tB\u001b\u0008\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u0008\u0010\u000cB#\u0008\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0008\u0010\u000fB5\u0008\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\u0012B#\u0008\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0008\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ/\u0010 \u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u001f\u0010 \u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008 \u0010\"J\u000f\u0010#\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008#\u0010\u0018J\u000f\u0010$\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008$\u0010\u0018J\u000f\u0010%\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008%\u0010\u0018J\u000f\u0010&\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008&\u0010\u0018J\u000f\u0010*\u001a\u00020\'H\u0007\u00a2\u0006\u0004\u0008(\u0010)J\u001f\u0010/\u001a\u00020\u00162\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0016\u00a2\u0006\u0004\u0008/\u00100J\u0011\u00102\u001a\u0004\u0018\u000101H\u0016\u00a2\u0006\u0004\u00082\u00103J\u0017\u00102\u001a\u00020\u00162\u0006\u00105\u001a\u000204H\u0016\u00a2\u0006\u0004\u00082\u00106J\u0017\u00108\u001a\u00020\u00162\u0006\u00107\u001a\u00020-H\u0007\u00a2\u0006\u0004\u00088\u00109J\u0019\u0010;\u001a\u00020\u00162\u0008\u0008\u0001\u0010:\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008;\u0010<J\u0015\u0010?\u001a\u00020\u00162\u0006\u0010>\u001a\u00020=\u00a2\u0006\u0004\u0008?\u0010@J\u0015\u0010C\u001a\u00020\u00162\u0006\u0010B\u001a\u00020A\u00a2\u0006\u0004\u0008C\u0010DJ#\u0010G\u001a\u0004\u0018\u00018\u0000\"\u0008\u0008\u0000\u0010F*\u00020E2\u0006\u0010B\u001a\u00020AH\u0016\u00a2\u0006\u0004\u0008G\u0010HJ\u0017\u0010J\u001a\u00020-2\u0006\u0010,\u001a\u00020IH\u0017\u00a2\u0006\u0004\u0008J\u0010KJ\u0017\u0010L\u001a\u00020-2\u0006\u0010,\u001a\u00020IH\u0016\u00a2\u0006\u0004\u0008L\u0010KJ\u0017\u0010M\u001a\u00020-2\u0006\u0010,\u001a\u00020IH\u0016\u00a2\u0006\u0004\u0008M\u0010KJ\u0017\u0010O\u001a\u00020\u00162\u0006\u00105\u001a\u00020NH\u0016\u00a2\u0006\u0004\u0008O\u0010PJ\u0017\u0010S\u001a\u00020\u00162\u0006\u0010R\u001a\u00020QH\u0017\u00a2\u0006\u0004\u0008S\u0010TJ\u0017\u0010W\u001a\u00020\u00162\u0006\u0010V\u001a\u00020UH\u0017\u00a2\u0006\u0004\u0008W\u0010XJ\u0017\u0010Y\u001a\u00020-2\u0006\u0010V\u001a\u00020UH\u0017\u00a2\u0006\u0004\u0008Y\u0010ZJ\u0017\u0010]\u001a\u00020\u00162\u0006\u0010\\\u001a\u00020[H\u0016\u00a2\u0006\u0004\u0008]\u0010^J\u0017\u0010_\u001a\u00020\u00162\u0006\u0010\\\u001a\u00020[H\u0016\u00a2\u0006\u0004\u0008_\u0010^J#\u0010b\u001a\u00020-*\u00020I2\u0006\u0010`\u001a\u00020I2\u0006\u0010a\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008b\u0010cR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010d\u001a\u00020\u00138@@BX\u0080.\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010e\u001a\u0004\u0008f\u0010gR\u001a\u0010j\u001a\u0008\u0012\u0004\u0012\u00020i0h8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008j\u0010kR\u001c\u0010m\u001a\u0008\u0012\u0004\u0012\u00020I0l8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008m\u0010nR\u001b\u0010a\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008o\u0010k\u001a\u0004\u0008p\u0010qR\u001a\u0010s\u001a\u0008\u0012\u0004\u0012\u00020r0h8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008s\u0010kR\u001b\u0010y\u001a\u00020t8FX\u0086\u0084\u0002\u00a2\u0006\u000c\u001a\u0004\u0008u\u0010v*\u0004\u0008w\u0010xR2\u0010\u0081\u0001\u001a\u0008\u0012\u0004\u0012\u00020{0z2\u000c\u0010|\u001a\u0008\u0012\u0004\u0012\u00020{0z8F@FX\u0086\u000e\u00a2\u0006\r\u001a\u0004\u0008}\u0010~\"\u0005\u0008\u007f\u0010\u0080\u0001R\u0015\u0010\u0082\u0001\u001a\u00020\'8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010)R\u001f\u0010\u0086\u0001\u001a\u00020i8BX\u0082\u0084\u0002\u00a2\u0006\u000f\u001a\u0006\u0008\u0083\u0001\u0010\u0084\u0001*\u0005\u0008\u0085\u0001\u0010x\u00a8\u0006\u0089\u0001"
    }
    d2 = {
        "Lcom/mapbox/maps/MapView;",
        "Landroid/widget/FrameLayout;",
        "Lmv/f;",
        "Lcom/mapbox/maps/MapControllable;",
        "Landroid/content/Context;",
        "context",
        "Lcom/mapbox/maps/MapInitOptions;",
        "mapInitOptions",
        "<init>",
        "(Landroid/content/Context;Lcom/mapbox/maps/MapInitOptions;)V",
        "Landroid/util/AttributeSet;",
        "attrs",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "defStyleAttr",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "defStyleRes",
        "initOptions",
        "(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/mapbox/maps/MapInitOptions;)V",
        "Lcom/mapbox/maps/MapController;",
        "mapController",
        "(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/mapbox/maps/MapController;)V",
        "Ll83/a0;",
        "onAttachedToWindow",
        "()V",
        "parseTypedArray$maps_sdk_release",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/mapbox/maps/MapInitOptions;",
        "parseTypedArray",
        "w",
        "h",
        "oldw",
        "oldh",
        "onSizeChanged",
        "(IIII)V",
        "(II)V",
        "onStart",
        "onStop",
        "onLowMemory",
        "onDestroy",
        "Lcom/mapbox/maps/MapboxMap;",
        "getMapboxMapDeprecated",
        "()Lcom/mapbox/maps/MapboxMap;",
        "getMapboxMap",
        "Ljava/lang/Runnable;",
        "event",
        "",
        "needRender",
        "queueEvent",
        "(Ljava/lang/Runnable;Z)V",
        "Landroid/graphics/Bitmap;",
        "snapshot",
        "()Landroid/graphics/Bitmap;",
        "Lcom/mapbox/maps/MapView$OnSnapshotReady;",
        "listener",
        "(Lcom/mapbox/maps/MapView$OnSnapshotReady;)V",
        "enabled",
        "setSnapshotLegacyMode",
        "(Z)V",
        "fps",
        "setMaximumFps",
        "(I)V",
        "Lev/q;",
        "plugin",
        "createPlugin",
        "(Lev/q;)V",
        "",
        "id",
        "removePlugin",
        "(Ljava/lang/String;)V",
        "Lev/j;",
        "T",
        "getPlugin",
        "(Ljava/lang/String;)Lev/j;",
        "Landroid/view/MotionEvent;",
        "onTouchEvent",
        "(Landroid/view/MotionEvent;)Z",
        "onInterceptTouchEvent",
        "onGenericMotionEvent",
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
        "moveEvent",
        "touchSlop",
        "hypot",
        "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;I)Z",
        "<set-?>",
        "Lcom/mapbox/maps/MapController;",
        "getMapController$maps_sdk_release",
        "()Lcom/mapbox/maps/MapController;",
        "Ll83/h;",
        "Lcom/mapbox/maps/debugoptions/DebugOptionsController;",
        "debugOptionsControllerDelegate",
        "Ll83/h;",
        "",
        "interceptedViewAnnotationEvents",
        "Ljava/util/List;",
        "touchSlop$delegate",
        "getTouchSlop",
        "()I",
        "Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;",
        "viewAnnotationManagerDelegate",
        "Lcom/mapbox/maps/viewannotation/ViewAnnotationManager;",
        "getViewAnnotationManager",
        "()Lcom/mapbox/maps/viewannotation/ViewAnnotationManager;",
        "getViewAnnotationManager$delegate",
        "(Lcom/mapbox/maps/MapView;)Ljava/lang/Object;",
        "viewAnnotationManager",
        "",
        "Lcom/mapbox/maps/debugoptions/MapViewDebugOptions;",
        "value",
        "getDebugOptions",
        "()Ljava/util/Set;",
        "setDebugOptions",
        "(Ljava/util/Set;)V",
        "debugOptions",
        "mapboxMap",
        "getDebugOptionsController",
        "()Lcom/mapbox/maps/debugoptions/DebugOptionsController;",
        "getDebugOptionsController$delegate",
        "debugOptionsController",
        "Companion",
        "OnSnapshotReady",
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
.field public static final Companion:Lcom/mapbox/maps/MapView$Companion;

.field public static final synthetic DEFAULT_ANTIALIASING_SAMPLE_COUNT:I = 0x1

.field public static final synthetic DEFAULT_FPS:I = 0x3c


# instance fields
.field private final debugOptionsControllerDelegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field private interceptedViewAnnotationEvents:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/MotionEvent;",
            ">;"
        }
    .end annotation
.end field

.field private mapController:Lcom/mapbox/maps/MapController;

.field private final touchSlop$delegate:Ll83/h;

.field private final viewAnnotationManagerDelegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/maps/MapView$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/maps/MapView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/maps/MapView;->Companion:Lcom/mapbox/maps/MapView$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lcom/mapbox/maps/MapView;-><init>(Landroid/content/Context;Lcom/mapbox/maps/MapInitOptions;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, p2, v0}, Lcom/mapbox/maps/MapView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    .line 6
    invoke-direct/range {v1 .. v6}, Lcom/mapbox/maps/MapView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/mapbox/maps/MapInitOptions;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/mapbox/maps/MapInitOptions;)V
    .locals 13

    .line 7
    invoke-direct/range {p0 .. p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 8
    new-instance v0, Lcom/mapbox/maps/MapView$debugOptionsControllerDelegate$1;

    invoke-direct {v0, p0}, Lcom/mapbox/maps/MapView$debugOptionsControllerDelegate$1;-><init>(Lcom/mapbox/maps/MapView;)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/mapbox/maps/MapView;->debugOptionsControllerDelegate:Ll83/h;

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/mapbox/maps/MapView;->interceptedViewAnnotationEvents:Ljava/util/List;

    .line 10
    new-instance v0, Lcom/mapbox/maps/MapView$touchSlop$2;

    invoke-direct {v0, p0}, Lcom/mapbox/maps/MapView$touchSlop$2;-><init>(Lcom/mapbox/maps/MapView;)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/mapbox/maps/MapView;->touchSlop$delegate:Ll83/h;

    .line 11
    new-instance v0, Lcom/mapbox/maps/MapView$viewAnnotationManagerDelegate$1;

    invoke-direct {v0, p0}, Lcom/mapbox/maps/MapView$viewAnnotationManagerDelegate$1;-><init>(Lcom/mapbox/maps/MapView;)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/mapbox/maps/MapView;->viewAnnotationManagerDelegate:Ll83/h;

    if-eqz p2, :cond_0

    .line 12
    invoke-virtual/range {p0 .. p2}, Lcom/mapbox/maps/MapView;->parseTypedArray$maps_sdk_release(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/mapbox/maps/MapInitOptions;

    move-result-object v0

    goto :goto_0

    :cond_0
    if-nez p5, :cond_1

    .line 13
    new-instance v1, Lcom/mapbox/maps/MapInitOptions;

    const/16 v11, 0x1fe

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v2, p1

    invoke-direct/range {v1 .. v12}, Lcom/mapbox/maps/MapInitOptions;-><init>(Landroid/content/Context;Lcom/mapbox/maps/MapOptions;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;ZLjava/lang/String;Landroid/util/AttributeSet;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v1

    goto :goto_0

    :cond_1
    move-object/from16 v0, p5

    .line 14
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v1

    if-eqz v1, :cond_2

    return-void

    .line 15
    :cond_2
    invoke-virtual {v0}, Lcom/mapbox/maps/MapInitOptions;->getTextureView()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 16
    new-instance v1, Landroid/view/TextureView;

    invoke-direct {v1, p1, p2}, Landroid/view/TextureView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_1

    .line 17
    :cond_3
    new-instance v1, Landroid/view/SurfaceView;

    invoke-direct {v1, p1, p2}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 18
    :goto_1
    invoke-virtual {v0}, Lcom/mapbox/maps/MapInitOptions;->getMapOptions()Lcom/mapbox/maps/MapOptions;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mapbox/maps/MapOptions;->getContextMode()Lcom/mapbox/maps/ContextMode;

    move-result-object p1

    if-nez p1, :cond_4

    sget-object p1, Lcom/mapbox/maps/ContextMode;->UNIQUE:Lcom/mapbox/maps/ContextMode;

    :cond_4
    const-string p2, "resolvedMapInitOptions.m\u2026ode ?: ContextMode.UNIQUE"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    new-instance p2, Lcom/mapbox/maps/MapController;

    .line 20
    instance-of v2, v1, Landroid/view/SurfaceView;

    if-eqz v2, :cond_5

    new-instance v2, Lcom/mapbox/maps/renderer/MapboxSurfaceHolderRenderer;

    .line 21
    move-object v3, v1

    check-cast v3, Landroid/view/SurfaceView;

    invoke-virtual {v3}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v3

    const-string v4, "view.holder"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-virtual {v0}, Lcom/mapbox/maps/MapInitOptions;->getAntialiasingSampleCount()I

    move-result v4

    .line 23
    invoke-virtual {v0}, Lcom/mapbox/maps/MapInitOptions;->getMapName()Ljava/lang/String;

    move-result-object v5

    .line 24
    invoke-direct {v2, v3, v4, p1, v5}, Lcom/mapbox/maps/renderer/MapboxSurfaceHolderRenderer;-><init>(Landroid/view/SurfaceHolder;ILcom/mapbox/maps/ContextMode;Ljava/lang/String;)V

    goto :goto_2

    .line 25
    :cond_5
    instance-of v2, v1, Landroid/view/TextureView;

    if-eqz v2, :cond_6

    new-instance v2, Lcom/mapbox/maps/renderer/MapboxTextureViewRenderer;

    .line 26
    move-object v3, v1

    check-cast v3, Landroid/view/TextureView;

    .line 27
    invoke-virtual {v0}, Lcom/mapbox/maps/MapInitOptions;->getAntialiasingSampleCount()I

    move-result v4

    .line 28
    invoke-virtual {v0}, Lcom/mapbox/maps/MapInitOptions;->getMapName()Ljava/lang/String;

    move-result-object v5

    .line 29
    invoke-direct {v2, v3, v4, p1, v5}, Lcom/mapbox/maps/renderer/MapboxTextureViewRenderer;-><init>(Landroid/view/TextureView;ILcom/mapbox/maps/ContextMode;Ljava/lang/String;)V

    .line 30
    :goto_2
    invoke-direct {p2, v2, v0}, Lcom/mapbox/maps/MapController;-><init>(Lcom/mapbox/maps/renderer/MapboxRenderer;Lcom/mapbox/maps/MapInitOptions;)V

    iput-object p2, p0, Lcom/mapbox/maps/MapView;->mapController:Lcom/mapbox/maps/MapController;

    const/4 p1, 0x0

    .line 31
    invoke-virtual {p0, v1, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 32
    invoke-virtual {p0}, Lcom/mapbox/maps/MapView;->getMapController$maps_sdk_release()Lcom/mapbox/maps/MapController;

    move-result-object p1

    invoke-virtual {p1, v0, p0}, Lcom/mapbox/maps/MapController;->initializePlugins(Lcom/mapbox/maps/MapInitOptions;Lcom/mapbox/maps/MapView;)V

    return-void

    .line 33
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Provided view has to be a texture or a surface."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/mapbox/maps/MapController;)V
    .locals 1

    const/4 v0, 0x0

    .line 34
    invoke-direct {p0, p1, p2, v0, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 35
    new-instance p1, Lcom/mapbox/maps/MapView$debugOptionsControllerDelegate$1;

    invoke-direct {p1, p0}, Lcom/mapbox/maps/MapView$debugOptionsControllerDelegate$1;-><init>(Lcom/mapbox/maps/MapView;)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lcom/mapbox/maps/MapView;->debugOptionsControllerDelegate:Ll83/h;

    .line 36
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/mapbox/maps/MapView;->interceptedViewAnnotationEvents:Ljava/util/List;

    .line 37
    new-instance p1, Lcom/mapbox/maps/MapView$touchSlop$2;

    invoke-direct {p1, p0}, Lcom/mapbox/maps/MapView$touchSlop$2;-><init>(Lcom/mapbox/maps/MapView;)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lcom/mapbox/maps/MapView;->touchSlop$delegate:Ll83/h;

    .line 38
    new-instance p1, Lcom/mapbox/maps/MapView$viewAnnotationManagerDelegate$1;

    invoke-direct {p1, p0}, Lcom/mapbox/maps/MapView$viewAnnotationManagerDelegate$1;-><init>(Lcom/mapbox/maps/MapView;)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lcom/mapbox/maps/MapView;->viewAnnotationManagerDelegate:Ll83/h;

    .line 39
    iput-object p3, p0, Lcom/mapbox/maps/MapView;->mapController:Lcom/mapbox/maps/MapController;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/mapbox/maps/MapController;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/mapbox/maps/MapView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/mapbox/maps/MapController;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/mapbox/maps/MapInitOptions;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapInitOptions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v6, p2

    .line 3
    invoke-direct/range {v1 .. v6}, Lcom/mapbox/maps/MapView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/mapbox/maps/MapInitOptions;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lcom/mapbox/maps/MapInitOptions;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    and-int/lit8 v0, p3, 0x2

    if-eqz v0, :cond_0

    .line 4
    new-instance v1, Lcom/mapbox/maps/MapInitOptions;

    const/16 v11, 0x1fe

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v2, p1

    invoke-direct/range {v1 .. v12}, Lcom/mapbox/maps/MapInitOptions;-><init>(Landroid/content/Context;Lcom/mapbox/maps/MapOptions;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;ZLjava/lang/String;Landroid/util/AttributeSet;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p2, v1

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/mapbox/maps/MapView;-><init>(Landroid/content/Context;Lcom/mapbox/maps/MapInitOptions;)V

    return-void
.end method

.method private final getDebugOptionsController()Lcom/mapbox/maps/debugoptions/DebugOptionsController;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/MapView;->debugOptionsControllerDelegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mapbox/maps/debugoptions/DebugOptionsController;

    return-object v0
.end method

.method private static getDebugOptionsController$delegate(Lcom/mapbox/maps/MapView;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/mapbox/maps/MapView;->debugOptionsControllerDelegate:Ll83/h;

    return-object p0
.end method

.method private final getTouchSlop()I
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/MapView;->touchSlop$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method private static getViewAnnotationManager$delegate(Lcom/mapbox/maps/MapView;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/mapbox/maps/MapView;->viewAnnotationManagerDelegate:Ll83/h;

    return-object p0
.end method

.method private final hypot(Landroid/view/MotionEvent;Landroid/view/MotionEvent;I)Z
    .locals 7

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    invoke-virtual {p2, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v4

    invoke-virtual {p2, v3}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v3

    const/4 v5, -0x1

    if-eq v4, v5, :cond_1

    if-ne v3, v5, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getX(I)F

    move-result v5

    invoke-virtual {p2, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v6

    sub-float/2addr v5, v6

    float-to-double v5, v5

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getY(I)F

    move-result v4

    invoke-virtual {p2, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v3

    sub-float/2addr v4, v3

    float-to-double v3, v4

    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v3

    double-to-float v3, v3

    int-to-float v4, p3

    cmpl-float v3, v3, v4

    if-lez v3, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public static final isRenderingSupported()Z
    .locals 1

    sget-object v0, Lcom/mapbox/maps/MapView;->Companion:Lcom/mapbox/maps/MapView$Companion;

    invoke-virtual {v0}, Lcom/mapbox/maps/MapView$Companion;->isRenderingSupported()Z

    move-result v0

    return v0
.end method

.method public static final isTerrainRenderingSupported()Z
    .locals 1

    sget-object v0, Lcom/mapbox/maps/MapView;->Companion:Lcom/mapbox/maps/MapView$Companion;

    invoke-virtual {v0}, Lcom/mapbox/maps/MapView$Companion;->isTerrainRenderingSupported()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public addRendererSetupErrorListener(Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V
    .locals 1

    const-string v0, "rendererSetupErrorListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/maps/MapView;->getMapController$maps_sdk_release()Lcom/mapbox/maps/MapController;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/MapController;->addRendererSetupErrorListener(Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V

    return-void
.end method

.method public addWidget(Lcom/mapbox/maps/renderer/widget/Widget;)V
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    const-string v0, "widget"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/maps/MapView;->getMapController$maps_sdk_release()Lcom/mapbox/maps/MapController;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/MapController;->addWidget(Lcom/mapbox/maps/renderer/widget/Widget;)V

    return-void
.end method

.method public final createPlugin(Lev/q;)V
    .locals 1

    const-string v0, "plugin"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/maps/MapView;->getMapController$maps_sdk_release()Lcom/mapbox/maps/MapController;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/mapbox/maps/MapController;->createPlugin(Lcom/mapbox/maps/MapView;Lev/q;)V

    return-void
.end method

.method public final getDebugOptions()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/mapbox/maps/debugoptions/MapViewDebugOptions;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/mapbox/maps/MapView;->getDebugOptionsController()Lcom/mapbox/maps/debugoptions/DebugOptionsController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/debugoptions/DebugOptionsController;->getOptions()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic getMapController$maps_sdk_release()Lcom/mapbox/maps/MapController;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/MapView;->mapController:Lcom/mapbox/maps/MapController;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mapController"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public getMapboxMap()Lcom/mapbox/maps/MapboxMap;
    .locals 1

    invoke-virtual {p0}, Lcom/mapbox/maps/MapView;->getMapController$maps_sdk_release()Lcom/mapbox/maps/MapController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/MapController;->getMapboxMap()Lcom/mapbox/maps/MapboxMap;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic getMapboxMapDeprecated()Lcom/mapbox/maps/MapboxMap;
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    invoke-virtual {p0}, Lcom/mapbox/maps/MapView;->getMapboxMap()Lcom/mapbox/maps/MapboxMap;

    move-result-object v0

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

    invoke-virtual {p0}, Lcom/mapbox/maps/MapView;->getMapController$maps_sdk_release()Lcom/mapbox/maps/MapController;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/MapController;->getPlugin(Ljava/lang/String;)Lev/j;

    move-result-object p1

    return-object p1
.end method

.method public final getViewAnnotationManager()Lcom/mapbox/maps/viewannotation/ViewAnnotationManager;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/MapView;->viewAnnotationManagerDelegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManager;

    return-object v0
.end method

.method public onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/mapbox/maps/MapView;->getMapController$maps_sdk_release()Lcom/mapbox/maps/MapController;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/mapbox/maps/MapController;->onAttachedToWindow$maps_sdk_release(Lcom/mapbox/maps/MapView;)V

    :cond_0
    return-void
.end method

.method public onDestroy()V
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/MapView;->viewAnnotationManagerDelegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/mapbox/maps/MapView;->getViewAnnotationManager()Lcom/mapbox/maps/viewannotation/ViewAnnotationManager;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.mapbox.maps.viewannotation.ViewAnnotationManagerImpl"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;

    invoke-virtual {v0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->destroy()V

    :cond_0
    invoke-virtual {p0}, Lcom/mapbox/maps/MapView;->getMapController$maps_sdk_release()Lcom/mapbox/maps/MapController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/MapController;->onDestroy()V

    return-void
.end method

.method public onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/maps/MapView;->getMapController$maps_sdk_release()Lcom/mapbox/maps/MapController;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/MapController;->onGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1}, Landroid/view/View;->onGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    const/4 v2, 0x1

    if-eq v0, v2, :cond_5

    const/4 v3, 0x2

    if-eq v0, v3, :cond_1

    const/4 v2, 0x3

    if-eq v0, v2, :cond_5

    const/4 v2, 0x5

    if-eq v0, v2, :cond_6

    const/4 v2, 0x6

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iget-object v0, p0, Lcom/mapbox/maps/MapView;->interceptedViewAnnotationEvents:Ljava/util/List;

    new-instance v2, Lcom/mapbox/maps/MapView$onInterceptTouchEvent$2;

    invoke-direct {v2, p1}, Lcom/mapbox/maps/MapView$onInterceptTouchEvent$2;-><init>(I)V

    invoke-static {v0, v2}, Lm83/s;->j1(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    return v1

    :cond_1
    iget-object v0, p0, Lcom/mapbox/maps/MapView;->interceptedViewAnnotationEvents:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    instance-of v3, v0, Ljava/util/Collection;

    if-eqz v3, :cond_2

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/MotionEvent;

    invoke-direct {p0}, Lcom/mapbox/maps/MapView;->getTouchSlop()I

    move-result v4

    invoke-direct {p0, v3, p1, v4}, Lcom/mapbox/maps/MapView;->hypot(Landroid/view/MotionEvent;Landroid/view/MotionEvent;I)Z

    move-result v3

    if-eqz v3, :cond_3

    return v2

    :cond_4
    :goto_0
    return v1

    :cond_5
    iget-object p1, p0, Lcom/mapbox/maps/MapView;->interceptedViewAnnotationEvents:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return v1

    :cond_6
    iget-object v0, p0, Lcom/mapbox/maps/MapView;->interceptedViewAnnotationEvents:Ljava/util/List;

    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object p1

    const-string v2, "obtain(event)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return v1
.end method

.method public onLowMemory()V
    .locals 1

    invoke-virtual {p0}, Lcom/mapbox/maps/MapView;->getMapController$maps_sdk_release()Lcom/mapbox/maps/MapController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/MapController;->onLowMemory()V

    return-void
.end method

.method public onSizeChanged(II)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/mapbox/maps/MapView;->getMapController$maps_sdk_release()Lcom/mapbox/maps/MapController;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/MapController;->onSizeChanged(II)V

    :cond_0
    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    if-ne p1, p3, :cond_1

    if-eq p2, p4, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 2
    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2}, Lcom/mapbox/maps/MapView;->onSizeChanged(II)V

    return-void
.end method

.method public onStart()V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Display;->getRefreshRate()F

    move-result v0

    float-to-int v0, v0

    goto :goto_0

    :cond_0
    const/16 v0, 0x3c

    :goto_0
    invoke-virtual {p0}, Lcom/mapbox/maps/MapView;->getMapController$maps_sdk_release()Lcom/mapbox/maps/MapController;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/mapbox/maps/MapController;->setScreenRefreshRate$maps_sdk_release(I)V

    invoke-virtual {p0}, Lcom/mapbox/maps/MapView;->getMapController$maps_sdk_release()Lcom/mapbox/maps/MapController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/MapController;->onStart()V

    iget-object v0, p0, Lcom/mapbox/maps/MapView;->debugOptionsControllerDelegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/mapbox/maps/MapView;->getDebugOptionsController()Lcom/mapbox/maps/debugoptions/DebugOptionsController;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/debugoptions/DebugOptionsController;->setStarted(Z)V

    :cond_1
    return-void
.end method

.method public onStop()V
    .locals 2

    invoke-virtual {p0}, Lcom/mapbox/maps/MapView;->getMapController$maps_sdk_release()Lcom/mapbox/maps/MapController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/MapController;->onStop()V

    iget-object v0, p0, Lcom/mapbox/maps/MapView;->debugOptionsControllerDelegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/mapbox/maps/MapView;->getDebugOptionsController()Lcom/mapbox/maps/debugoptions/DebugOptionsController;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/debugoptions/DebugOptionsController;->setStarted(Z)V

    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/MapView;->interceptedViewAnnotationEvents:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/mapbox/maps/MapView;->interceptedViewAnnotationEvents:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    instance-of v3, v0, Ljava/util/Collection;

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/MotionEvent;

    invoke-virtual {v3}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-nez v3, :cond_1

    goto :goto_4

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/mapbox/maps/MapView;->interceptedViewAnnotationEvents:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v3, v2

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/MotionEvent;

    invoke-virtual {p0}, Lcom/mapbox/maps/MapView;->getMapController$maps_sdk_release()Lcom/mapbox/maps/MapController;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/mapbox/maps/MapController;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v5

    if-nez v5, :cond_4

    if-eqz v3, :cond_3

    goto :goto_2

    :cond_3
    move v3, v2

    goto :goto_3

    :cond_4
    :goto_2
    move v3, v1

    :goto_3
    invoke-virtual {v4}, Landroid/view/MotionEvent;->recycle()V

    goto :goto_1

    :cond_5
    :goto_4
    move v3, v2

    :cond_6
    iget-object v0, p0, Lcom/mapbox/maps/MapView;->interceptedViewAnnotationEvents:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-virtual {p0}, Lcom/mapbox/maps/MapView;->getMapController$maps_sdk_release()Lcom/mapbox/maps/MapController;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/MapController;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-nez p1, :cond_8

    if-eqz v3, :cond_7

    goto :goto_5

    :cond_7
    return v2

    :cond_8
    :goto_5
    return v1
.end method

.method public final synthetic parseTypedArray$maps_sdk_release(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/mapbox/maps/MapInitOptions;
    .locals 15
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CustomViewStyleable"
        }
    .end annotation

    move-object/from16 v1, p1

    const-string v0, "context"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/R$styleable;->mapbox_MapView:[I

    const/4 v2, 0x0

    move-object/from16 v7, p2

    invoke-virtual {v1, v7, v0, v2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v12

    const-string v0, "context.obtainStyledAttr\u2026ble.mapbox_MapView, 0, 0)"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Lcom/mapbox/maps/MapAttributeParser;->INSTANCE:Lcom/mapbox/maps/MapAttributeParser;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    invoke-virtual {v0, v12, v3}, Lcom/mapbox/maps/MapAttributeParser;->parseMapOptions(Landroid/content/res/TypedArray;F)Lcom/mapbox/maps/MapOptions;

    move-result-object v0

    sget-object v3, Lcom/mapbox/maps/CameraAttributeParser;->INSTANCE:Lcom/mapbox/maps/CameraAttributeParser;

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v3, v12, v4, v5, v6}, Lcom/mapbox/maps/CameraAttributeParser;->parseCameraOptions$default(Lcom/mapbox/maps/CameraAttributeParser;Landroid/content/res/TypedArray;FILjava/lang/Object;)Lcom/mapbox/maps/CameraOptions;

    move-result-object v13

    sget v3, Lcom/mapbox/maps/R$styleable;->mapbox_MapView_mapbox_mapSurface:I

    invoke-virtual {v12, v3, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    move v14, v4

    goto :goto_0

    :cond_0
    move v14, v2

    :goto_0
    sget v2, Lcom/mapbox/maps/R$styleable;->mapbox_MapView_mapbox_styleUri:I

    invoke-virtual {v12, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    const-string v2, "mapbox://styles/mapbox/standard"

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_1
    :goto_1
    sget v3, Lcom/mapbox/maps/R$styleable;->mapbox_MapView_mapbox_mapAntialiasingSampleCount:I

    invoke-virtual {v12, v3, v4}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v8

    sget v3, Lcom/mapbox/maps/R$styleable;->mapbox_MapView_mapbox_mapName:I

    invoke-virtual {v12, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2

    const-string v3, ""

    :cond_2
    move-object v9, v3

    move-object v3, v2

    move-object v2, v0

    new-instance v0, Lcom/mapbox/maps/MapInitOptions;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    move-object v6, v3

    :goto_2
    const/16 v10, 0x1c

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v11}, Lcom/mapbox/maps/MapInitOptions;-><init>(Landroid/content/Context;Lcom/mapbox/maps/MapOptions;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;ZLjava/lang/String;Landroid/util/AttributeSet;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v13}, Lcom/mapbox/maps/MapInitOptions;->setCameraOptions(Lcom/mapbox/maps/CameraOptions;)V

    invoke-virtual {v0, v14}, Lcom/mapbox/maps/MapInitOptions;->setTextureView(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v12}, Landroid/content/res/TypedArray;->recycle()V

    return-object v0

    :goto_3
    invoke-virtual {v12}, Landroid/content/res/TypedArray;->recycle()V

    throw v0
.end method

.method public queueEvent(Ljava/lang/Runnable;Z)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/maps/MapView;->getMapController$maps_sdk_release()Lcom/mapbox/maps/MapController;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/MapController;->queueEvent(Ljava/lang/Runnable;Z)V

    return-void
.end method

.method public final removePlugin(Ljava/lang/String;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/maps/MapView;->getMapController$maps_sdk_release()Lcom/mapbox/maps/MapController;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/MapController;->removePlugin(Ljava/lang/String;)V

    return-void
.end method

.method public removeRendererSetupErrorListener(Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V
    .locals 1

    const-string v0, "rendererSetupErrorListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/maps/MapView;->getMapController$maps_sdk_release()Lcom/mapbox/maps/MapController;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/MapController;->removeRendererSetupErrorListener(Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V

    return-void
.end method

.method public removeWidget(Lcom/mapbox/maps/renderer/widget/Widget;)Z
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    const-string v0, "widget"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/maps/MapView;->getMapController$maps_sdk_release()Lcom/mapbox/maps/MapController;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/MapController;->removeWidget(Lcom/mapbox/maps/renderer/widget/Widget;)Z

    move-result p1

    return p1
.end method

.method public final setDebugOptions(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/mapbox/maps/debugoptions/MapViewDebugOptions;",
            ">;)V"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/mapbox/maps/MapView;->getDebugOptionsController()Lcom/mapbox/maps/debugoptions/DebugOptionsController;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/debugoptions/DebugOptionsController;->setOptions(Ljava/util/Set;)V

    return-void
.end method

.method public setMaximumFps(I)V
    .locals 1

    invoke-virtual {p0}, Lcom/mapbox/maps/MapView;->getMapController$maps_sdk_release()Lcom/mapbox/maps/MapController;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/MapController;->setMaximumFps(I)V

    return-void
.end method

.method public setOnFpsChangedListener(Lcom/mapbox/maps/renderer/OnFpsChangedListener;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/maps/MapView;->getMapController$maps_sdk_release()Lcom/mapbox/maps/MapController;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/MapController;->setOnFpsChangedListener(Lcom/mapbox/maps/renderer/OnFpsChangedListener;)V

    return-void
.end method

.method public setRenderThreadStatsRecorder(Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;)V
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    const-string v0, "renderThreadStatsRecorder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/maps/MapView;->getMapController$maps_sdk_release()Lcom/mapbox/maps/MapController;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/MapController;->setRenderThreadStatsRecorder(Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;)V

    return-void
.end method

.method public final setSnapshotLegacyMode(Z)V
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    invoke-virtual {p0}, Lcom/mapbox/maps/MapView;->getMapController$maps_sdk_release()Lcom/mapbox/maps/MapController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/MapController;->getRenderer$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxRenderer;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/renderer/MapboxRenderer;->setSnapshotLegacyModeEnabled$maps_sdk_release(Z)V

    return-void
.end method

.method public snapshot()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/mapbox/maps/MapView;->getMapController$maps_sdk_release()Lcom/mapbox/maps/MapController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/MapController;->snapshot()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public snapshot(Lcom/mapbox/maps/MapView$OnSnapshotReady;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/mapbox/maps/MapView;->getMapController$maps_sdk_release()Lcom/mapbox/maps/MapController;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/MapController;->snapshot(Lcom/mapbox/maps/MapView$OnSnapshotReady;)V

    return-void
.end method
