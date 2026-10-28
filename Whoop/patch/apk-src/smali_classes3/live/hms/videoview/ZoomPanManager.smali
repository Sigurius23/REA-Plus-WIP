.class public final Llive/hms/videoview/ZoomPanManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/video/utils/matrix/MatrixManager$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/videoview/ZoomPanManager$Companion;,
        Llive/hms/videoview/ZoomPanManager$ZoomPanCallBack;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0007\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u0008\u0000\u0018\u0000 @2\u00020\u0001:\u0002@AB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u0011H\u0000\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0000\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010$\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\nH\u0000\u00a2\u0006\u0004\u0008\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008-\u0010(\u001a\u0004\u0008.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00082\u0010(\u001a\u0004\u00083\u00104R\"\u00106\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u00086\u00107\u001a\u0004\u00088\u00109\"\u0004\u0008:\u0010\u001fR\"\u0010;\u001a\u00020\n8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008;\u0010<\u001a\u0004\u0008=\u0010>\"\u0004\u0008?\u0010#\u00a8\u0006B"
    }
    d2 = {
        "Llive/hms/videoview/ZoomPanManager;",
        "Llive/hms/video/video/utils/matrix/MatrixManager$Callback;",
        "Landroid/content/Context;",
        "context",
        "Llive/hms/videoview/ZoomPanManager$ZoomPanCallBack;",
        "zoomPanCallBack",
        "<init>",
        "(Landroid/content/Context;Llive/hms/videoview/ZoomPanManager$ZoomPanCallBack;)V",
        "Landroid/view/MotionEvent;",
        "event",
        "",
        "shouldInterceptGesture$videoview_release",
        "(Landroid/view/MotionEvent;)Z",
        "shouldInterceptGesture",
        "",
        "width",
        "height",
        "Ll83/a0;",
        "setContainerSize$videoview_release",
        "(II)V",
        "setContainerSize",
        "Landroid/graphics/Matrix;",
        "matrix",
        "onMatrixUpdate",
        "(Landroid/graphics/Matrix;)V",
        "resetZoomAndPan$videoview_release",
        "()V",
        "resetZoomAndPan",
        "",
        "zoom",
        "setMaxZoom$videoview_release",
        "(F)V",
        "setMaxZoom",
        "enable",
        "enableZoomAndPan$videoview_release",
        "(Z)V",
        "enableZoomAndPan",
        "Llive/hms/videoview/ZoomPanManager$ZoomPanCallBack;",
        "Llive/hms/video/video/utils/matrix/MatrixManager;",
        "matrixManager$delegate",
        "Ll83/h;",
        "getMatrixManager",
        "()Llive/hms/video/video/utils/matrix/MatrixManager;",
        "matrixManager",
        "Llive/hms/video/video/utils/gesture/ZoomGestureDetector;",
        "zoomGestureDetector$delegate",
        "getZoomGestureDetector",
        "()Llive/hms/video/video/utils/gesture/ZoomGestureDetector;",
        "zoomGestureDetector",
        "Llive/hms/video/video/utils/gesture/PanGestureDetector;",
        "panGestureDetector$delegate",
        "getPanGestureDetector",
        "()Llive/hms/video/video/utils/gesture/PanGestureDetector;",
        "panGestureDetector",
        "currentZoom",
        "F",
        "getCurrentZoom$videoview_release",
        "()F",
        "setCurrentZoom$videoview_release",
        "isZoomEnabled",
        "Z",
        "isZoomEnabled$videoview_release",
        "()Z",
        "setZoomEnabled$videoview_release",
        "Companion",
        "ZoomPanCallBack",
        "videoview_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Llive/hms/videoview/ZoomPanManager$Companion;

.field private static final MAX_ZOOM:F

.field private static final MIN_ZOOM:F


# instance fields
.field private currentZoom:F

.field private isZoomEnabled:Z

.field private final matrixManager$delegate:Ll83/h;

.field private final panGestureDetector$delegate:Ll83/h;

.field private final zoomGestureDetector$delegate:Ll83/h;

.field private final zoomPanCallBack:Llive/hms/videoview/ZoomPanManager$ZoomPanCallBack;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/videoview/ZoomPanManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/videoview/ZoomPanManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/videoview/ZoomPanManager;->Companion:Llive/hms/videoview/ZoomPanManager$Companion;

    const/high16 v0, 0x3f800000    # 1.0f

    sput v0, Llive/hms/videoview/ZoomPanManager;->MIN_ZOOM:F

    const/high16 v0, 0x40400000    # 3.0f

    sput v0, Llive/hms/videoview/ZoomPanManager;->MAX_ZOOM:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Llive/hms/videoview/ZoomPanManager$ZoomPanCallBack;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zoomPanCallBack"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Llive/hms/videoview/ZoomPanManager;->zoomPanCallBack:Llive/hms/videoview/ZoomPanManager$ZoomPanCallBack;

    new-instance p2, Llive/hms/video/connection/degredation/a;

    const/4 v0, 0x5

    invoke-direct {p2, p0, v0}, Llive/hms/video/connection/degredation/a;-><init>(Ljava/lang/Object;I)V

    invoke-static {p2}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p2

    iput-object p2, p0, Llive/hms/videoview/ZoomPanManager;->matrixManager$delegate:Ll83/h;

    new-instance p2, Llive/hms/videoview/b;

    const/4 v0, 0x0

    invoke-direct {p2, p1, p0, v0}, Llive/hms/videoview/b;-><init>(Landroid/content/Context;Llive/hms/videoview/ZoomPanManager;I)V

    invoke-static {p2}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p2

    iput-object p2, p0, Llive/hms/videoview/ZoomPanManager;->zoomGestureDetector$delegate:Ll83/h;

    new-instance p2, Llive/hms/videoview/b;

    const/4 v0, 0x1

    invoke-direct {p2, p1, p0, v0}, Llive/hms/videoview/b;-><init>(Landroid/content/Context;Llive/hms/videoview/ZoomPanManager;I)V

    invoke-static {p2}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llive/hms/videoview/ZoomPanManager;->panGestureDetector$delegate:Ll83/h;

    sget p1, Llive/hms/videoview/ZoomPanManager;->MAX_ZOOM:F

    iput p1, p0, Llive/hms/videoview/ZoomPanManager;->currentZoom:F

    return-void
.end method

.method public static synthetic a(Llive/hms/videoview/ZoomPanManager;)Llive/hms/video/video/utils/matrix/MatrixManager;
    .locals 0

    invoke-static {p0}, Llive/hms/videoview/ZoomPanManager;->matrixManager_delegate$lambda$0(Llive/hms/videoview/ZoomPanManager;)Llive/hms/video/video/utils/matrix/MatrixManager;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMAX_ZOOM$cp()F
    .locals 1

    sget v0, Llive/hms/videoview/ZoomPanManager;->MAX_ZOOM:F

    return v0
.end method

.method public static final synthetic access$getMIN_ZOOM$cp()F
    .locals 1

    sget v0, Llive/hms/videoview/ZoomPanManager;->MIN_ZOOM:F

    return v0
.end method

.method public static synthetic b(Landroid/content/Context;Llive/hms/videoview/ZoomPanManager;)Llive/hms/video/video/utils/gesture/PanGestureDetector;
    .locals 0

    invoke-static {p0, p1}, Llive/hms/videoview/ZoomPanManager;->panGestureDetector_delegate$lambda$2(Landroid/content/Context;Llive/hms/videoview/ZoomPanManager;)Llive/hms/video/video/utils/gesture/PanGestureDetector;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroid/content/Context;Llive/hms/videoview/ZoomPanManager;)Llive/hms/video/video/utils/gesture/ZoomGestureDetector;
    .locals 0

    invoke-static {p0, p1}, Llive/hms/videoview/ZoomPanManager;->zoomGestureDetector_delegate$lambda$1(Landroid/content/Context;Llive/hms/videoview/ZoomPanManager;)Llive/hms/video/video/utils/gesture/ZoomGestureDetector;

    move-result-object p0

    return-object p0
.end method

.method private final getMatrixManager()Llive/hms/video/video/utils/matrix/MatrixManager;
    .locals 1

    iget-object v0, p0, Llive/hms/videoview/ZoomPanManager;->matrixManager$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llive/hms/video/video/utils/matrix/MatrixManager;

    return-object v0
.end method

.method private final getPanGestureDetector()Llive/hms/video/video/utils/gesture/PanGestureDetector;
    .locals 1

    iget-object v0, p0, Llive/hms/videoview/ZoomPanManager;->panGestureDetector$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llive/hms/video/video/utils/gesture/PanGestureDetector;

    return-object v0
.end method

.method private final getZoomGestureDetector()Llive/hms/video/video/utils/gesture/ZoomGestureDetector;
    .locals 1

    iget-object v0, p0, Llive/hms/videoview/ZoomPanManager;->zoomGestureDetector$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llive/hms/video/video/utils/gesture/ZoomGestureDetector;

    return-object v0
.end method

.method private static final matrixManager_delegate$lambda$0(Llive/hms/videoview/ZoomPanManager;)Llive/hms/video/video/utils/matrix/MatrixManager;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/video/utils/matrix/MatrixManager;

    invoke-direct {v0, p0, p0}, Llive/hms/video/video/utils/matrix/MatrixManager;-><init>(Llive/hms/videoview/ZoomPanManager;Llive/hms/video/video/utils/matrix/MatrixManager$Callback;)V

    return-object v0
.end method

.method private static final panGestureDetector_delegate$lambda$2(Landroid/content/Context;Llive/hms/videoview/ZoomPanManager;)Llive/hms/video/video/utils/gesture/PanGestureDetector;
    .locals 1

    const-string v0, "$context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/video/utils/gesture/PanGestureDetector;

    invoke-direct {p1}, Llive/hms/videoview/ZoomPanManager;->getMatrixManager()Llive/hms/video/video/utils/matrix/MatrixManager;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Llive/hms/video/video/utils/gesture/PanGestureDetector;-><init>(Landroid/content/Context;Llive/hms/video/video/utils/matrix/MatrixManager;)V

    return-object v0
.end method

.method private static final zoomGestureDetector_delegate$lambda$1(Landroid/content/Context;Llive/hms/videoview/ZoomPanManager;)Llive/hms/video/video/utils/gesture/ZoomGestureDetector;
    .locals 1

    const-string v0, "$context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/video/utils/gesture/ZoomGestureDetector;

    invoke-direct {p1}, Llive/hms/videoview/ZoomPanManager;->getMatrixManager()Llive/hms/video/video/utils/matrix/MatrixManager;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Llive/hms/video/video/utils/gesture/ZoomGestureDetector;-><init>(Landroid/content/Context;Llive/hms/video/video/utils/matrix/MatrixManager;)V

    return-object v0
.end method


# virtual methods
.method public final enableZoomAndPan$videoview_release(Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/videoview/ZoomPanManager;->isZoomEnabled:Z

    return-void
.end method

.method public final getCurrentZoom$videoview_release()F
    .locals 1

    iget v0, p0, Llive/hms/videoview/ZoomPanManager;->currentZoom:F

    return v0
.end method

.method public final isZoomEnabled$videoview_release()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/videoview/ZoomPanManager;->isZoomEnabled:Z

    return v0
.end method

.method public onMatrixUpdate(Landroid/graphics/Matrix;)V
    .locals 1

    const-string v0, "matrix"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/videoview/ZoomPanManager;->zoomPanCallBack:Llive/hms/videoview/ZoomPanManager$ZoomPanCallBack;

    invoke-interface {v0, p1}, Llive/hms/videoview/ZoomPanManager$ZoomPanCallBack;->onMatrixUpdate(Landroid/graphics/Matrix;)V

    return-void
.end method

.method public final resetZoomAndPan$videoview_release()V
    .locals 1

    invoke-direct {p0}, Llive/hms/videoview/ZoomPanManager;->getMatrixManager()Llive/hms/video/video/utils/matrix/MatrixManager;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/video/utils/matrix/MatrixManager;->reset$videoview_release()V

    return-void
.end method

.method public final setContainerSize$videoview_release(II)V
    .locals 2

    invoke-direct {p0}, Llive/hms/videoview/ZoomPanManager;->getMatrixManager()Llive/hms/video/video/utils/matrix/MatrixManager;

    move-result-object v0

    int-to-float p1, p1

    int-to-float p2, p2

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1}, Llive/hms/video/video/utils/matrix/MatrixManager;->setContainerSize$videoview_release(FFZ)V

    return-void
.end method

.method public final setCurrentZoom$videoview_release(F)V
    .locals 0

    iput p1, p0, Llive/hms/videoview/ZoomPanManager;->currentZoom:F

    return-void
.end method

.method public final setMaxZoom$videoview_release(F)V
    .locals 0

    iput p1, p0, Llive/hms/videoview/ZoomPanManager;->currentZoom:F

    return-void
.end method

.method public final setZoomEnabled$videoview_release(Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/videoview/ZoomPanManager;->isZoomEnabled:Z

    return-void
.end method

.method public final shouldInterceptGesture$videoview_release(Landroid/view/MotionEvent;)Z
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Llive/hms/videoview/ZoomPanManager;->isZoomEnabled:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-direct {p0}, Llive/hms/videoview/ZoomPanManager;->getZoomGestureDetector()Llive/hms/video/video/utils/gesture/ZoomGestureDetector;

    move-result-object v0

    invoke-virtual {v0, p1}, Llive/hms/video/video/utils/gesture/ZoomGestureDetector;->interceptTouch$videoview_release(Landroid/view/MotionEvent;)Z

    move-result v0

    invoke-direct {p0}, Llive/hms/videoview/ZoomPanManager;->getPanGestureDetector()Llive/hms/video/video/utils/gesture/PanGestureDetector;

    move-result-object v2

    invoke-virtual {v2, p1}, Llive/hms/video/video/utils/gesture/PanGestureDetector;->interceptTouch$videoview_release(Landroid/view/MotionEvent;)Z

    move-result p1

    if-nez v0, :cond_2

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    return v1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
