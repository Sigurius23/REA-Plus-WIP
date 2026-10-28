.class public abstract Llb1/m0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/design/models/items/SegmentControllerModel;",
        "model",
        "Lo51/f;",
        "f",
        "(Lcom/whoop/design/models/items/SegmentControllerModel;)Lo51/f;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "e",
        "()Llb1/y0;",
        "compactTrendMapper",
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

    new-instance v0, Llb1/i0;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Llb1/i0;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/m0;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/m0;->c(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/CompactTrendModel;)Lo51/d;
    .locals 0

    invoke-static {p0}, Llb1/m0;->d(Lcom/whoop/design/models/items/CompactTrendModel;)Lo51/d;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/i0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Llb1/i0;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/CompactTrendModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/m0$a;

    invoke-direct {v2, v0}, Llb1/m0$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lcom/whoop/design/models/items/CompactTrendModel;)Lo51/d;
    .locals 21

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/CompactTrendModel;->getSegmentController()Lcom/whoop/design/models/items/SegmentControllerModel;

    move-result-object v0

    invoke-static {v0}, Llb1/m0;->f(Lcom/whoop/design/models/items/SegmentControllerModel;)Lo51/f;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/design/models/items/CompactTrendModel;->getWeekDatePicker()Lcom/whoop/design/models/items/DateSelectorModel;

    move-result-object v0

    invoke-static {v0}, Llb1/w0;->f(Lcom/whoop/design/models/items/DateSelectorModel;)Li11/f;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/design/models/items/CompactTrendModel;->getMonthDatePicker()Lcom/whoop/design/models/items/DateSelectorModel;

    move-result-object v0

    invoke-static {v0}, Llb1/w0;->f(Lcom/whoop/design/models/items/DateSelectorModel;)Li11/f;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/design/models/items/CompactTrendModel;->getSixMonthDatePicker()Lcom/whoop/design/models/items/DateSelectorModel;

    move-result-object v0

    invoke-static {v0}, Llb1/w0;->f(Lcom/whoop/design/models/items/DateSelectorModel;)Li11/f;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/design/models/items/CompactTrendModel;->getWeekGraph()Lcom/whoop/design/models/items/graph/GraphModel;

    move-result-object v0

    invoke-static {v0}, Lvb1/b;->t(Lcom/whoop/design/models/items/graph/GraphModel;)Lj71/c;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/design/models/items/CompactTrendModel;->getMonthGraph()Lcom/whoop/design/models/items/graph/GraphModel;

    move-result-object v0

    invoke-static {v0}, Lvb1/b;->t(Lcom/whoop/design/models/items/graph/GraphModel;)Lj71/c;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/design/models/items/CompactTrendModel;->getSixMonthGraph()Lcom/whoop/design/models/items/graph/GraphModel;

    move-result-object v0

    invoke-static {v0}, Lvb1/b;->t(Lcom/whoop/design/models/items/graph/GraphModel;)Lj71/c;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/design/models/items/CompactTrendModel;->getNoDataGraph()Lcom/whoop/design/models/items/NoDataGraphModel;

    move-result-object v0

    const/4 v9, 0x0

    if-eqz v0, :cond_0

    new-instance v10, Lo51/e;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/NoDataGraphModel;->getTitle()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v0}, Lcom/whoop/design/models/items/NoDataGraphModel;->getSubtitle()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    new-instance v13, Lkd1/o$c;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/NoDataGraphModel;->getImage()Ljava/lang/String;

    move-result-object v14

    const/16 v18, 0xe

    const/16 v19, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v13 .. v19}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v10, v11, v12, v13}, Lo51/e;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;)V

    goto :goto_0

    :cond_0
    move-object v10, v9

    :goto_0
    invoke-virtual {v1}, Lcom/whoop/design/models/items/CompactTrendModel;->getGraphLegends()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v11, 0xa

    invoke-static {v0, v11}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v1, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/whoop/design/models/items/graph/GraphLegendModel;

    const/4 v12, 0x1

    invoke-static {v11, v9, v12, v9}, Lvb1/b;->A(Lcom/whoop/design/models/items/graph/GraphLegendModel;Ly81/f;ILjava/lang/Object;)Lk71/d;

    move-result-object v11

    invoke-interface {v1, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    move-object v9, v1

    :cond_2
    new-instance v1, Lo51/d;

    move-object/from16 v20, v10

    move-object v10, v9

    move-object/from16 v9, v20

    invoke-direct/range {v1 .. v10}, Lo51/d;-><init>(Lo51/f;Li11/f;Li11/f;Li11/f;Lm91/u;Lm91/u;Lm91/u;Lo51/e;Ljava/util/List;)V

    return-object v1
.end method

.method public static final e()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/m0;->a:Llb1/y0;

    return-object v0
.end method

.method private static final f(Lcom/whoop/design/models/items/SegmentControllerModel;)Lo51/f;
    .locals 2

    new-instance v0, Lo51/f;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SegmentControllerModel;->getInitialIndex()I

    move-result v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SegmentControllerModel;->getElementNames()Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lo51/f;-><init>(ILjava/util/List;)V

    return-object v0
.end method
