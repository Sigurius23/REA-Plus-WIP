.class public final Lff1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0013\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u001c\u0010\u000cJ\u001d\u0010!\u001a\u00020 *\u00020\u001d2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\u0004\u0008!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lff1/b;",
        "",
        "Ljb1/a;",
        "reducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lcf1/a$b;",
        "Lef1/c;",
        "g",
        "(Lcf1/a$b;)Lef1/c;",
        "Lcf1/c;",
        "h",
        "(Lcf1/c;)Lef1/c;",
        "Lcom/whoop/design/models/TimeSegmentModel;",
        "timeSegment",
        "Lef1/c$c;",
        "a",
        "(Lcom/whoop/design/models/TimeSegmentModel;)Lef1/c$c;",
        "Lcom/whoop/design/models/items/graph/GraphModel;",
        "graphModel",
        "",
        "b",
        "(Lcom/whoop/design/models/items/graph/GraphModel;)Z",
        "Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;",
        "plane",
        "c",
        "(Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;)Z",
        "domainResult",
        "d",
        "Lcom/whoop/design/models/LegendItemModel;",
        "Ly81/f;",
        "legendTextColor",
        "Lk71/d;",
        "e",
        "(Lcom/whoop/design/models/LegendItemModel;Ly81/f;)Lk71/d;",
        "Ljb1/a;",
        "exercise-progress-mini-arch_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:I


# instance fields
.field private final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Lff1/b;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lff1/b;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Lff1/c;->d()Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lff1/b;-><init>(Ljb1/a;)V

    return-void
.end method

.method private final a(Lcom/whoop/design/models/TimeSegmentModel;)Lef1/c$c;
    .locals 23

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/design/models/TimeSegmentModel;->getMetrics()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v8, v5, 0x1

    if-ltz v5, :cond_0

    check-cast v6, Lcom/whoop/design/models/TrendMetricModel;

    invoke-virtual {v6}, Lcom/whoop/design/models/TrendMetricModel;->getMetricName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v6}, Lcom/whoop/design/models/TrendMetricModel;->getMetricValue()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v6}, Lcom/whoop/design/models/TrendMetricModel;->getTrendDirection()Lv41/j0;

    move-result-object v13

    invoke-virtual {v6}, Lcom/whoop/design/models/TrendMetricModel;->getMetricUnits()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v6}, Lcom/whoop/design/models/TrendMetricModel;->getTrendText()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    sget-object v5, Lff1/b$a;->w:Lff1/b$a;

    invoke-static {v5}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v16

    invoke-virtual {v6}, Lcom/whoop/design/models/TrendMetricModel;->getTrendStyle()Lv41/l0;

    move-result-object v14

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v17

    new-instance v9, Lv41/m;

    const/16 v20, 0x300

    const/16 v21, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v9 .. v21}, Lv41/m;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lv41/j0;Lv41/l0;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Lv41/k0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v5, v8

    goto :goto_0

    :cond_0
    invoke-static {}, Lwb3/f;->d0()V

    throw v7

    :cond_1
    sget-object v11, Ll0/m;->b:Ll0/e;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/design/models/TimeSegmentModel;->getDatePicker()Lcom/whoop/design/models/items/DateSelectorModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/DateSelectorModel;->getCurrentDateRange()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/design/models/TimeSegmentModel;->getDatePicker()Lcom/whoop/design/models/items/DateSelectorModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/DateSelectorModel;->getPrevDateTime()Ljava/lang/String;

    move-result-object v1

    const/4 v5, 0x1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_2

    move v1, v5

    goto :goto_1

    :cond_2
    move v1, v4

    :goto_1
    move v13, v1

    goto :goto_2

    :cond_3
    move v13, v4

    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/design/models/TimeSegmentModel;->getDatePicker()Lcom/whoop/design/models/items/DateSelectorModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/DateSelectorModel;->getNextDateTime()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_4

    move v4, v5

    :cond_4
    move v15, v4

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/design/models/TimeSegmentModel;->getDatePicker()Lcom/whoop/design/models/items/DateSelectorModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/DateSelectorModel;->getPrevDateTime()Ljava/lang/String;

    move-result-object v1

    const-string v4, ""

    if-nez v1, :cond_5

    move-object v14, v4

    goto :goto_3

    :cond_5
    move-object v14, v1

    :goto_3
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/design/models/TimeSegmentModel;->getDatePicker()Lcom/whoop/design/models/items/DateSelectorModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/DateSelectorModel;->getNextDateTime()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_6

    move-object/from16 v16, v4

    goto :goto_4

    :cond_6
    move-object/from16 v16, v1

    :goto_4
    new-instance v4, Li11/f;

    const/16 v21, 0x3c0

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v10, v4

    invoke-direct/range {v10 .. v22}, Li11/f;-><init>(Ll0/i;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;ZLjava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/design/models/TimeSegmentModel;->getGraph()Lcom/whoop/design/models/items/graph/GraphModel;

    move-result-object v1

    const-string v6, "null cannot be cast to non-null type com.whoop.design.models.items.graph.GraphModel"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lff1/b;->b(Lcom/whoop/design/models/items/graph/GraphModel;)Z

    move-result v1

    if-eqz v1, :cond_8

    :cond_7
    move-object v1, v7

    goto :goto_5

    :cond_8
    iget-object v1, v0, Lff1/b;->a:Ljb1/a;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/design/models/TimeSegmentModel;->getGraph()Lcom/whoop/design/models/items/graph/GraphModel;

    move-result-object v8

    invoke-static {v8, v6}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v8}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v1

    instance-of v6, v1, Lj71/c;

    if-eqz v6, :cond_7

    check-cast v1, Lj71/c;

    :goto_5
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/design/models/TimeSegmentModel;->getLegend()Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_a

    check-cast v6, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v6, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v8, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/design/models/LegendItemModel;

    invoke-static {v0, v6, v7, v5, v7}, Lff1/b;->f(Lff1/b;Lcom/whoop/design/models/LegendItemModel;Ly81/f;ILjava/lang/Object;)Lk71/d;

    move-result-object v6

    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_9
    move-object v6, v8

    goto :goto_7

    :cond_a
    move-object v6, v7

    :goto_7
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/design/models/TimeSegmentModel;->getWhoopCoachVow()Lcom/whoop/design/models/items/WhoopCoachVowModel;

    move-result-object v2

    if-eqz v2, :cond_b

    iget-object v5, v0, Lff1/b;->a:Ljb1/a;

    invoke-virtual {v5, v2}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v2

    instance-of v5, v2, Ls01/d;

    if-eqz v5, :cond_b

    move-object v7, v2

    check-cast v7, Ls01/d;

    :cond_b
    new-instance v2, Lef1/c$c;

    move-object v5, v1

    invoke-direct/range {v2 .. v7}, Lef1/c$c;-><init>(Ljava/util/List;Li11/f;Lm91/u;Ljava/util/List;Ls01/d;)V

    return-object v2
.end method

.method private final b(Lcom/whoop/design/models/items/graph/GraphModel;)Z
    .locals 1

    invoke-virtual {p1}, Lcom/whoop/design/models/items/graph/GraphModel;->getPlots()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/whoop/design/models/items/graph/GraphModel;->getGraphTitleDisplay()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/whoop/design/models/items/graph/GraphModel;->getGraphButtons()Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/whoop/design/models/items/graph/GraphModel;->getPlane()Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;

    move-result-object p1

    invoke-direct {p0, p1}, Lff1/b;->c(Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final c(Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;)Z
    .locals 1

    invoke-virtual {p1}, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->getLines()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->getAnnotations()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->getStartYAxis()Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->getEndYAxis()Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->getBottomXAxis()Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->getTopXAxis()Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->getAccessibilityInfo()Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;->getLabel()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static synthetic f(Lff1/b;Lcom/whoop/design/models/LegendItemModel;Ly81/f;ILjava/lang/Object;)Lk71/d;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lff1/b;->e(Lcom/whoop/design/models/LegendItemModel;Ly81/f;)Lk71/d;

    move-result-object p0

    return-object p0
.end method

.method private final g(Lcf1/a$b;)Lef1/c;
    .locals 9

    instance-of v0, p1, Lcf1/a$a;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-instance p1, Lef1/c;

    new-instance v3, Lef1/c$a;

    sget-object v0, Le31/d;->a:Le31/d;

    invoke-virtual {v0}, Le31/d;->a()Le31/c;

    move-result-object v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lef1/c$a;-><init>(Le31/c;Lef1/a;Lef1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v3, v2, v1, v2}, Lef1/c;-><init>(Lef1/c$a;Lef1/c$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_0
    instance-of v0, p1, Lcf1/a$c;

    if-eqz v0, :cond_1

    new-instance v0, Lef1/c;

    new-instance v3, Lef1/c$a;

    sget-object v4, Le31/d;->a:Le31/d;

    invoke-virtual {v4}, Le31/d;->c()Le31/c;

    move-result-object v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lef1/c$a;-><init>(Le31/c;Lef1/a;Lef1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lef1/a$f;

    check-cast p1, Lcf1/a$c;

    invoke-virtual {p1}, Lcf1/a$c;->a()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v5, v4}, Lef1/a$f;-><init>(Ljava/lang/String;)V

    new-instance v6, Lef1/a$f;

    invoke-virtual {p1}, Lcf1/a$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v6, p1}, Lef1/a$f;-><init>(Ljava/lang/String;)V

    const/4 v7, 0x1

    const/4 v4, 0x0

    invoke-static/range {v3 .. v8}, Lef1/c$a;->b(Lef1/c$a;Le31/c;Lef1/a;Lef1/a;ILjava/lang/Object;)Lef1/c$a;

    move-result-object p1

    invoke-direct {v0, p1, v2, v1, v2}, Lef1/c;-><init>(Lef1/c$a;Lef1/c$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final h(Lcf1/c;)Lef1/c;
    .locals 14

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {p1}, Lcf1/c;->d()Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->getTimeSegments()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, v3, 0x1

    if-ltz v3, :cond_0

    check-cast v4, Lcom/whoop/design/models/TimeSegmentModel;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {p0, v4}, Lff1/b;->a(Lcom/whoop/design/models/TimeSegmentModel;)Lef1/c$c;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v3, v5

    goto :goto_0

    :cond_0
    invoke-static {}, Lwb3/f;->d0()V

    throw v2

    :cond_1
    invoke-virtual {p1}, Lcf1/c;->d()Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->getSegmentController()Lcom/whoop/design/models/items/SegmentControllerModel;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v1}, Lff1/c;->c(Lcom/whoop/design/models/items/SegmentControllerModel;)Lo51/f;

    move-result-object v1

    goto :goto_1

    :cond_2
    move-object v1, v2

    :goto_1
    invoke-virtual {p1}, Lcf1/c;->d()Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->getNoDataGraphState()Lcom/whoop/design/models/items/NoDataGraphModel;

    move-result-object v3

    if-eqz v3, :cond_3

    new-instance v4, Lo51/e;

    invoke-virtual {v3}, Lcom/whoop/design/models/items/NoDataGraphModel;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v3}, Lcom/whoop/design/models/items/NoDataGraphModel;->getSubtitle()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    new-instance v7, Lkd1/o$c;

    invoke-virtual {v3}, Lcom/whoop/design/models/items/NoDataGraphModel;->getImage()Ljava/lang/String;

    move-result-object v8

    const/16 v12, 0xe

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v4, v5, v6, v7}, Lo51/e;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;)V

    goto :goto_2

    :cond_3
    move-object v4, v2

    :goto_2
    invoke-virtual {p1}, Lcf1/c;->e()Ljava/lang/Integer;

    move-result-object v3

    if-nez v3, :cond_5

    invoke-virtual {p1}, Lcf1/c;->d()Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->getSegmentController()Lcom/whoop/design/models/items/SegmentControllerModel;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/whoop/design/models/items/SegmentControllerModel;->getInitialIndex()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_3

    :cond_4
    move-object v3, v2

    :cond_5
    :goto_3
    new-instance p1, Lef1/c$b;

    invoke-direct {p1, v0, v1, v4, v3}, Lef1/c$b;-><init>(Ljava/util/Map;Lo51/f;Lo51/e;Ljava/lang/Integer;)V

    new-instance v0, Lef1/c;

    const/4 v1, 0x1

    invoke-direct {v0, v2, p1, v1, v2}, Lef1/c;-><init>(Lef1/c$a;Lef1/c$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public final d(Lcf1/c;)Lef1/c;
    .locals 1

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcf1/c;->c()Lcf1/a;

    move-result-object v0

    instance-of v0, v0, Lcf1/a$b;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcf1/c;->c()Lcf1/a;

    move-result-object p1

    check-cast p1, Lcf1/a$b;

    invoke-direct {p0, p1}, Lff1/b;->g(Lcf1/a$b;)Lef1/c;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, Lff1/b;->h(Lcf1/c;)Lef1/c;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lcom/whoop/design/models/LegendItemModel;Ly81/f;)Lk71/d;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lk71/d;

    invoke-virtual {p1}, Lcom/whoop/design/models/LegendItemModel;->getGraphLegendStyle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lvb1/b;->v(Ljava/lang/String;)Li91/a;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/design/models/LegendItemModel;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    if-eqz p2, :cond_0

    invoke-static {p2}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object p2

    :goto_0
    move-object v4, p2

    goto :goto_1

    :cond_0
    sget-object p2, Ly81/f;->WHITE_70:Ly81/f;

    invoke-static {p2}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object p2

    goto :goto_0

    :goto_1
    invoke-virtual {p1}, Lcom/whoop/design/models/LegendItemModel;->getGraphLegendStyle()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lvb1/b;->x(Ljava/lang/String;)Ln21/i;

    move-result-object v5

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lk71/d;-><init>(Li91/a;Lcom/whoop/design/util/TextResource;Li91/a;Ln21/i;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
