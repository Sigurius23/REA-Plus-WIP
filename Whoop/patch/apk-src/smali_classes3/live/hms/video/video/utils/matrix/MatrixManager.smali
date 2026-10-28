.class public final Llive/hms/video/video/utils/matrix/MatrixManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/video/utils/matrix/MatrixManager$Callback;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u000f\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0014\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001:\u0001:B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ3\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\'\u0010\u001d\u001a\u00020\u00082\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00082\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bH\u0000\u00a2\u0006\u0004\u0008\u001e\u0010\u0016J\u001f\u0010$\u001a\u00020\u00082\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bH\u0000\u00a2\u0006\u0004\u0008\"\u0010#J\u000f\u0010&\u001a\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008%\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010(R\u001a\u0010*\u001a\u00020)8\u0006X\u0086D\u00a2\u0006\u000c\n\u0004\u0008*\u0010+\u001a\u0004\u0008,\u0010-R\u0016\u0010.\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u0016\u00100\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00080\u0010/R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u00103R\u0014\u00105\u001a\u0002018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u00103R\u0014\u00106\u001a\u00020\u000b8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u00086\u0010/R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00109\u00a8\u0006;"
    }
    d2 = {
        "Llive/hms/video/video/utils/matrix/MatrixManager;",
        "",
        "Llive/hms/videoview/ZoomPanManager;",
        "zoomPanManager",
        "Llive/hms/video/video/utils/matrix/MatrixManager$Callback;",
        "callback",
        "<init>",
        "(Llive/hms/videoview/ZoomPanManager;Llive/hms/video/video/utils/matrix/MatrixManager$Callback;)V",
        "Ll83/a0;",
        "limitToBoundary",
        "()V",
        "",
        "currentScale",
        "scaleFactor",
        "maxZoom",
        "minZoom",
        "applyScaleWithLimit",
        "(FFFF)F",
        "Landroid/graphics/PointF;",
        "currentFocusPoint",
        "scaleMultiplier",
        "applyScale",
        "(Landroid/graphics/PointF;F)V",
        "width",
        "height",
        "",
        "forceReset",
        "setContainerSize$videoview_release",
        "(FFZ)V",
        "setContainerSize",
        "onZoom$videoview_release",
        "onZoom",
        "distanceX",
        "distanceY",
        "onPan$videoview_release",
        "(FF)V",
        "onPan",
        "reset$videoview_release",
        "reset",
        "Llive/hms/videoview/ZoomPanManager;",
        "Llive/hms/video/video/utils/matrix/MatrixManager$Callback;",
        "",
        "TAG",
        "Ljava/lang/String;",
        "getTAG",
        "()Ljava/lang/String;",
        "containerWidth",
        "F",
        "containerHeight",
        "Landroid/graphics/Matrix;",
        "scaleMatrix",
        "Landroid/graphics/Matrix;",
        "outputMatrix",
        "boundaryFixMatrix",
        "totalWidth",
        "",
        "value",
        "[F",
        "Callback",
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


# instance fields
.field private final TAG:Ljava/lang/String;

.field private final boundaryFixMatrix:Landroid/graphics/Matrix;

.field private final callback:Llive/hms/video/video/utils/matrix/MatrixManager$Callback;

.field private containerHeight:F

.field private containerWidth:F

.field private final outputMatrix:Landroid/graphics/Matrix;

.field private final scaleMatrix:Landroid/graphics/Matrix;

.field private final totalWidth:F

.field private final value:[F

.field private final zoomPanManager:Llive/hms/videoview/ZoomPanManager;


# direct methods
.method public constructor <init>(Llive/hms/videoview/ZoomPanManager;Llive/hms/video/video/utils/matrix/MatrixManager$Callback;)V
    .locals 1

    const-string v0, "zoomPanManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->zoomPanManager:Llive/hms/videoview/ZoomPanManager;

    iput-object p2, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->callback:Llive/hms/video/video/utils/matrix/MatrixManager$Callback;

    const-string p1, "MatrixManager"

    iput-object p1, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->TAG:Ljava/lang/String;

    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->scaleMatrix:Landroid/graphics/Matrix;

    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->outputMatrix:Landroid/graphics/Matrix;

    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->boundaryFixMatrix:Landroid/graphics/Matrix;

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->totalWidth:F

    const/16 p1, 0x9

    new-array p1, p1, [F

    iput-object p1, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->value:[F

    return-void
.end method

.method private final applyScale(Landroid/graphics/PointF;F)V
    .locals 10

    iget v0, p1, Landroid/graphics/PointF;->x:F

    iget v1, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->containerWidth:F

    div-float/2addr v0, v1

    iget p1, p1, Landroid/graphics/PointF;->y:F

    iget v1, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->containerHeight:F

    div-float/2addr p1, v1

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float p1, v1, p1

    iget-object v2, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->outputMatrix:Landroid/graphics/Matrix;

    iget-object v3, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->value:[F

    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->getValues([F)V

    iget-object v2, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->value:[F

    const/4 v3, 0x0

    aget v2, v2, v3

    div-float v4, v1, v2

    const/16 v8, 0xc

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, p0

    move v5, p2

    invoke-static/range {v3 .. v9}, Llive/hms/video/video/utils/matrix/MatrixManager;->applyScaleWithLimit$default(Llive/hms/video/video/utils/matrix/MatrixManager;FFFFILjava/lang/Object;)F

    move-result p2

    const/4 v1, 0x1

    int-to-float v1, v1

    div-float/2addr v1, p2

    iget-object p2, v3, Llive/hms/video/video/utils/matrix/MatrixManager;->scaleMatrix:Landroid/graphics/Matrix;

    invoke-virtual {p2}, Landroid/graphics/Matrix;->reset()V

    invoke-virtual {p2, v0, p1}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    invoke-virtual {p2, v1, v1}, Landroid/graphics/Matrix;->preScale(FF)Z

    neg-float v0, v0

    neg-float p1, p1

    invoke-virtual {p2, v0, p1}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    iget-object p1, v3, Llive/hms/video/video/utils/matrix/MatrixManager;->outputMatrix:Landroid/graphics/Matrix;

    iget-object p2, v3, Llive/hms/video/video/utils/matrix/MatrixManager;->scaleMatrix:Landroid/graphics/Matrix;

    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    invoke-direct {p0}, Llive/hms/video/video/utils/matrix/MatrixManager;->limitToBoundary()V

    return-void
.end method

.method private final applyScaleWithLimit(FFFF)F
    .locals 1

    mul-float v0, p1, p2

    cmpl-float v0, v0, p3

    if-lez v0, :cond_0

    div-float p2, p3, p1

    :cond_0
    mul-float p3, p1, p2

    cmpg-float p3, p3, p4

    if-gez p3, :cond_1

    div-float/2addr p4, p1

    return p4

    :cond_1
    return p2
.end method

.method public static synthetic applyScaleWithLimit$default(Llive/hms/video/video/utils/matrix/MatrixManager;FFFFILjava/lang/Object;)F
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    iget-object p3, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->zoomPanManager:Llive/hms/videoview/ZoomPanManager;

    invoke-virtual {p3}, Llive/hms/videoview/ZoomPanManager;->getCurrentZoom$videoview_release()F

    move-result p3

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    sget-object p4, Llive/hms/videoview/ZoomPanManager;->Companion:Llive/hms/videoview/ZoomPanManager$Companion;

    invoke-virtual {p4}, Llive/hms/videoview/ZoomPanManager$Companion;->getMIN_ZOOM()F

    move-result p4

    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Llive/hms/video/video/utils/matrix/MatrixManager;->applyScaleWithLimit(FFFF)F

    move-result p0

    return p0
.end method

.method private final limitToBoundary()V
    .locals 7

    iget-object v0, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->outputMatrix:Landroid/graphics/Matrix;

    iget-object v1, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->value:[F

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    iget-object v0, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->value:[F

    const/4 v1, 0x2

    aget v1, v0, v1

    const/4 v2, 0x5

    aget v2, v0, v2

    const/4 v3, 0x0

    aget v0, v0, v3

    const/high16 v4, 0x3f800000    # 1.0f

    div-float/2addr v4, v0

    iget-object v0, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->boundaryFixMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    const/4 v0, 0x0

    cmpg-float v5, v1, v0

    const/4 v6, 0x1

    if-gez v5, :cond_0

    iget-object v3, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->boundaryFixMatrix:Landroid/graphics/Matrix;

    neg-float v5, v1

    invoke-virtual {v3, v5, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    move v3, v6

    :cond_0
    cmpg-float v5, v2, v0

    if-gez v5, :cond_1

    iget-object v3, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->boundaryFixMatrix:Landroid/graphics/Matrix;

    neg-float v5, v2

    invoke-virtual {v3, v0, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    move v3, v6

    :cond_1
    iget v5, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->totalWidth:F

    div-float v4, v5, v4

    sub-float/2addr v5, v4

    cmpl-float v4, v1, v5

    if-lez v4, :cond_2

    iget-object v3, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->boundaryFixMatrix:Landroid/graphics/Matrix;

    sub-float/2addr v1, v5

    neg-float v1, v1

    invoke-virtual {v3, v1, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    move v3, v6

    :cond_2
    cmpl-float v1, v2, v5

    if-lez v1, :cond_3

    iget-object v1, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->boundaryFixMatrix:Landroid/graphics/Matrix;

    sub-float/2addr v2, v5

    neg-float v2, v2

    invoke-virtual {v1, v0, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto :goto_0

    :cond_3
    move v6, v3

    :goto_0
    if-eqz v6, :cond_4

    iget-object v0, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->outputMatrix:Landroid/graphics/Matrix;

    iget-object v1, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->boundaryFixMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    :cond_4
    iget-object v0, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->outputMatrix:Landroid/graphics/Matrix;

    iget-object v1, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->value:[F

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    iget-object v0, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->callback:Llive/hms/video/video/utils/matrix/MatrixManager$Callback;

    iget-object v1, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->outputMatrix:Landroid/graphics/Matrix;

    invoke-interface {v0, v1}, Llive/hms/video/video/utils/matrix/MatrixManager$Callback;->onMatrixUpdate(Landroid/graphics/Matrix;)V

    return-void
.end method


# virtual methods
.method public final getTAG()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method public final onPan$videoview_release(FF)V
    .locals 3

    iget v0, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->containerWidth:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->containerHeight:F

    cmpg-float v1, v0, v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    div-float/2addr p2, v0

    const/high16 v0, -0x40800000    # -1.0f

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p2, v0, v1}, Le93/b;->m(FFF)F

    move-result p2

    iget v2, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->containerWidth:F

    div-float/2addr p1, v2

    invoke-static {p1, v0, v1}, Le93/b;->m(FFF)F

    move-result p1

    iget-object v0, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->outputMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    invoke-direct {p0}, Llive/hms/video/video/utils/matrix/MatrixManager;->limitToBoundary()V

    return-void
.end method

.method public final onZoom$videoview_release(Landroid/graphics/PointF;F)V
    .locals 2

    const-string v0, "currentFocusPoint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->containerWidth:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->containerHeight:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-direct {p0, p1, p2}, Llive/hms/video/video/utils/matrix/MatrixManager;->applyScale(Landroid/graphics/PointF;F)V

    return-void
.end method

.method public final reset$videoview_release()V
    .locals 2

    iget-object v0, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->outputMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    iget-object v0, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->callback:Llive/hms/video/video/utils/matrix/MatrixManager$Callback;

    iget-object v1, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->outputMatrix:Landroid/graphics/Matrix;

    invoke-interface {v0, v1}, Llive/hms/video/video/utils/matrix/MatrixManager$Callback;->onMatrixUpdate(Landroid/graphics/Matrix;)V

    return-void
.end method

.method public final setContainerSize$videoview_release(FFZ)V
    .locals 2

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-lez v1, :cond_2

    cmpg-float v0, p2, v0

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->containerWidth:F

    cmpg-float v0, p1, v0

    if-nez v0, :cond_1

    iget v0, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->containerHeight:F

    cmpg-float v0, p2, v0

    if-nez v0, :cond_1

    if-eqz p3, :cond_2

    :cond_1
    iput p1, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->containerWidth:F

    iput p2, p0, Llive/hms/video/video/utils/matrix/MatrixManager;->containerHeight:F

    :cond_2
    :goto_0
    return-void
.end method
