.class public abstract Llb1/k5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\t\u0010\n\"\u001a\u0010\u0010\u001a\u00020\u000b8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;",
        "model",
        "",
        "scrollWidthMultiplier",
        "Lt81/s;",
        "d",
        "(Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;F)Lt81/s;",
        "Lcom/whoop/design/models/items/graph/ZoomToggleModel;",
        "Lt81/e;",
        "e",
        "(Lcom/whoop/design/models/items/graph/ZoomToggleModel;F)Lt81/e;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "zoomableGraphModelMapper",
        "design-models_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llb1/z4;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Llb1/z4;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/k5;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/k5;->f(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/graph/ZoomableGraphModel;)Lt81/r;
    .locals 0

    invoke-static {p0}, Llb1/k5;->g(Lcom/whoop/design/models/items/graph/ZoomableGraphModel;)Lt81/r;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/k5;->a:Llb1/y0;

    return-object v0
.end method

.method private static final d(Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;F)Lt81/s;
    .locals 3

    new-instance v0, Lt81/s;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;->getDefaultZoomLevel()F

    move-result v1

    mul-float/2addr v1, p1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;->getMinZoomLevel()F

    move-result v2

    mul-float/2addr v2, p1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;->getMaxZoomLevel()F

    move-result p0

    mul-float/2addr p0, p1

    invoke-direct {v0, v1, v2, p0}, Lt81/s;-><init>(FFF)V

    return-object v0
.end method

.method private static final e(Lcom/whoop/design/models/items/graph/ZoomToggleModel;F)Lt81/e;
    .locals 2

    new-instance v0, Lt81/e;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/ZoomToggleModel;->getZoomInLevel()F

    move-result v1

    mul-float/2addr v1, p1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/ZoomToggleModel;->getZoomOutLevel()F

    move-result p0

    mul-float/2addr p0, p1

    invoke-direct {v0, v1, p0}, Lt81/e;-><init>(FF)V

    return-object v0
.end method

.method private static final f(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/z4;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Llb1/z4;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/k5$a;

    invoke-direct {v2, v0}, Llb1/k5$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/models/items/graph/ZoomableGraphModel;)Lt81/r;
    .locals 18

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->getPlots()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lxb1/c;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->getPlane()Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;

    move-result-object v0

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lwb1/j;->a(Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;Z)Lh71/k;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->getScrollWidthMultiplier()D

    move-result-wide v5

    double-to-float v8, v5

    new-instance v1, Lt81/r;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->getZoomLevel()Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;

    move-result-object v0

    invoke-static {v0, v8}, Llb1/k5;->d(Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;F)Lt81/s;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->getZoomToggle()Lcom/whoop/design/models/items/graph/ZoomToggleModel;

    move-result-object v0

    invoke-static {v0, v8}, Llb1/k5;->e(Lcom/whoop/design/models/items/graph/ZoomToggleModel;F)Lt81/e;

    move-result-object v10

    const/16 v16, 0x1f1a

    const/16 v17, 0x0

    const/4 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v1 .. v17}, Lt81/r;-><init>(Lh71/k;Lh2/c;Ljava/util/List;JLcom/whoop/design/util/TextResource;FLt81/s;Lt81/e;ZLd61/a;Ljava/lang/String;Lh71/l;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
