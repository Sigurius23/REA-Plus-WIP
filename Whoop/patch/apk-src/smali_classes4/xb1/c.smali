.class public abstract Lxb1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a#\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "",
        "Lcom/whoop/design/models/items/graph/plot/GraphPlot;",
        "graphPlotEntries",
        "Lj71/b;",
        "a",
        "(Ljava/util/List;)Ljava/util/List;",
        "Lj71/b;",
        "unknownPlot",
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
.field private static final a:Lj71/b;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lj71/b$b;

    const/16 v5, 0x9

    const/4 v6, 0x0

    const/4 v1, 0x0

    const-string v2, "unknown"

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lj71/b$b;-><init>(Ljava/util/List;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lxb1/c;->a:Lj71/b;

    return-void
.end method

.method public static final a(Ljava/util/List;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/items/graph/plot/GraphPlot;",
            ">;)",
            "Ljava/util/List<",
            "Lj71/b;",
            ">;"
        }
    .end annotation

    const-string v0, "graphPlotEntries"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/items/graph/plot/GraphPlot;

    sget-object v2, Lcom/whoop/design/models/items/graph/plot/UnknownPlotModel;->INSTANCE:Lcom/whoop/design/models/items/graph/plot/UnknownPlotModel;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v1, Lxb1/c;->a:Lj71/b;

    goto/16 :goto_d

    :cond_0
    instance-of v2, v1, Lcom/whoop/design/models/items/graph/plot/BandPlotModel;

    if-eqz v2, :cond_1

    check-cast v1, Lcom/whoop/design/models/items/graph/plot/BandPlotModel;

    invoke-static {v1}, Lyb1/c;->a(Lcom/whoop/design/models/items/graph/plot/BandPlotModel;)Lj71/b$a;

    move-result-object v1

    goto/16 :goto_d

    :cond_1
    instance-of v2, v1, Lcom/whoop/design/models/items/graph/plot/BarPlotModel;

    if-eqz v2, :cond_2

    check-cast v1, Lcom/whoop/design/models/items/graph/plot/BarPlotModel;

    invoke-static {v1}, Lzb1/a;->a(Lcom/whoop/design/models/items/graph/plot/BarPlotModel;)Lj71/b$b;

    move-result-object v1

    goto/16 :goto_d

    :cond_2
    instance-of v2, v1, Lcom/whoop/design/models/items/graph/plot/CalibratingPlotModel;

    const/4 v3, 0x0

    if-eqz v2, :cond_7

    check-cast v1, Lcom/whoop/design/models/items/graph/plot/CalibratingPlotModel;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/CalibratingPlotModel;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/CalibratingPlotModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-nez v2, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    move-object v6, v2

    goto :goto_3

    :cond_4
    :goto_2
    sget v2, Lgy0/f;->G:I

    invoke-static {v2}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    goto :goto_1

    :goto_3
    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/CalibratingPlotModel;->getHideWhileScrubbing()Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    move v9, v2

    goto :goto_4

    :cond_5
    move v9, v3

    :goto_4
    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/CalibratingPlotModel;->getSkipScrubbing()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :cond_6
    move v8, v3

    new-instance v4, Lj71/b$c;

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v11}, Lj71/b$c;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_5
    move-object v1, v4

    goto/16 :goto_d

    :cond_7
    instance-of v2, v1, Lcom/whoop/design/models/items/graph/plot/CenterScrubBandPlotModel;

    if-eqz v2, :cond_8

    check-cast v1, Lcom/whoop/design/models/items/graph/plot/CenterScrubBandPlotModel;

    invoke-static {v1}, Lyb1/c;->b(Lcom/whoop/design/models/items/graph/plot/CenterScrubBandPlotModel;)Lj71/b$a;

    move-result-object v1

    goto/16 :goto_d

    :cond_8
    instance-of v2, v1, Lcom/whoop/design/models/items/graph/plot/EmptyPlotModel;

    if-eqz v2, :cond_f

    check-cast v1, Lcom/whoop/design/models/items/graph/plot/EmptyPlotModel;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/EmptyPlotModel;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/EmptyPlotModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-nez v2, :cond_9

    goto :goto_7

    :cond_9
    :goto_6
    move-object v6, v2

    goto :goto_8

    :cond_a
    :goto_7
    sget v2, Lgy0/f;->n1:I

    invoke-static {v2}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    goto :goto_6

    :goto_8
    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/EmptyPlotModel;->getSubtitle()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_c

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-nez v2, :cond_b

    goto :goto_a

    :cond_b
    :goto_9
    move-object v7, v2

    goto :goto_b

    :cond_c
    :goto_a
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    goto :goto_9

    :goto_b
    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/EmptyPlotModel;->getHideWhileScrubbing()Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v2, :cond_d

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    move v10, v2

    goto :goto_c

    :cond_d
    move v10, v3

    :goto_c
    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/EmptyPlotModel;->getSkipScrubbing()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_e

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :cond_e
    move v9, v3

    new-instance v4, Lj71/b$d;

    const/16 v11, 0x8

    const/4 v12, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v12}, Lj71/b$d;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_5

    :cond_f
    instance-of v2, v1, Lcom/whoop/design/models/items/graph/plot/GridLinePlotModel;

    if-eqz v2, :cond_10

    check-cast v1, Lcom/whoop/design/models/items/graph/plot/GridLinePlotModel;

    invoke-static {v1}, Lbc1/a;->a(Lcom/whoop/design/models/items/graph/plot/GridLinePlotModel;)Lj71/b$h;

    move-result-object v1

    goto :goto_d

    :cond_10
    instance-of v2, v1, Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotModel;

    if-eqz v2, :cond_11

    check-cast v1, Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotModel;

    invoke-static {v1}, Lac1/b;->a(Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotModel;)Lj71/b$e;

    move-result-object v1

    goto :goto_d

    :cond_11
    instance-of v2, v1, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;

    if-eqz v2, :cond_12

    check-cast v1, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;

    invoke-static {v1}, Lcc1/a;->a(Lcom/whoop/design/models/items/graph/plot/IconPlotModel;)Lj71/b$f;

    move-result-object v1

    goto :goto_d

    :cond_12
    instance-of v2, v1, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;

    if-eqz v2, :cond_13

    check-cast v1, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;

    invoke-static {v1}, Ldc1/e;->a(Lcom/whoop/design/models/items/graph/plot/LinePlotModel;)Lj71/b$g;

    move-result-object v1

    goto :goto_d

    :cond_13
    instance-of v2, v1, Lcom/whoop/design/models/items/graph/plot/OverlayPlotModel;

    if-eqz v2, :cond_14

    check-cast v1, Lcom/whoop/design/models/items/graph/plot/OverlayPlotModel;

    invoke-static {v1}, Lec1/a;->c(Lcom/whoop/design/models/items/graph/plot/OverlayPlotModel;)Lj71/b$i;

    move-result-object v1

    goto :goto_d

    :cond_14
    instance-of v2, v1, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;

    if-eqz v2, :cond_15

    check-cast v1, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;

    invoke-static {v1}, Lfc1/b;->a(Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;)Lj71/b$j;

    move-result-object v1

    goto :goto_d

    :cond_15
    instance-of v2, v1, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;

    if-eqz v2, :cond_16

    check-cast v1, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;

    invoke-static {v1}, Lhc1/b;->a(Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;)Lj71/b$k;

    move-result-object v1

    goto :goto_d

    :cond_16
    instance-of v2, v1, Lcom/whoop/design/models/items/graph/plot/VerticalMarkerPlotModel;

    if-eqz v2, :cond_17

    check-cast v1, Lcom/whoop/design/models/items/graph/plot/VerticalMarkerPlotModel;

    invoke-static {v1}, Lic1/a;->a(Lcom/whoop/design/models/items/graph/plot/VerticalMarkerPlotModel;)Lj71/b$l;

    move-result-object v1

    goto :goto_d

    :cond_17
    instance-of v2, v1, Lcom/whoop/design/models/items/graph/plot/XLabelPlotModel;

    if-eqz v2, :cond_18

    check-cast v1, Lcom/whoop/design/models/items/graph/plot/XLabelPlotModel;

    invoke-static {v1}, Ljc1/a;->a(Lcom/whoop/design/models/items/graph/plot/XLabelPlotModel;)Lj71/b$m;

    move-result-object v1

    :goto_d
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_18
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_19
    return-object v0
.end method
