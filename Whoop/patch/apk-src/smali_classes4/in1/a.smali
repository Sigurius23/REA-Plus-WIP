.class public final Lin1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ-\u0010\u0017\u001a\u00020\u0016*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u0019*\u00020\u00102\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u001c\u00a2\u0006\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lin1/a;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;",
        "response",
        "Ldn1/i;",
        "selectedValue",
        "Lin1/g;",
        "saveState",
        "Lin1/d;",
        "f",
        "(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;Ldn1/i;Lin1/g;)Lin1/d;",
        "Lin1/h;",
        "e",
        "(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;)Lin1/h;",
        "Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;",
        "",
        "index",
        "",
        "isDraggable",
        "shouldHighlight",
        "Le41/i;",
        "a",
        "(Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;IZZ)Le41/i;",
        "Lln1/d;",
        "d",
        "(Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;Z)Lln1/d;",
        "Ldn1/c;",
        "b",
        "(Ldn1/c;)Lin1/d;",
        "home-customization_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;IZZ)Le41/i;
    .locals 15

    new-instance v0, Le41/i;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;->getMetric()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;->getIcon()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v2

    if-nez v2, :cond_0

    sget-object v2, Lgz0/m0;->WHOOP_W_CIRCLE:Lgz0/m0;

    :cond_0
    move-object v9, v2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;->getPreviewIcon()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    sget-object v12, Le41/k;->NOT_EXPANDED:Le41/k;

    const/16 v13, 0xa2

    const/4 v14, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    move/from16 v5, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v14}, Le41/i;-><init>(Ljava/lang/String;Ljava/lang/Object;ZZZZZZLgz0/m0;Lgz0/m0;Lcom/whoop/design/util/TextResource;Le41/k;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static synthetic c(Lin1/a;Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;IZZILjava/lang/Object;)Le41/i;
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lin1/a;->a(Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;IZZ)Le41/i;

    move-result-object p0

    return-object p0
.end method

.method private final d(Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;Z)Lln1/d;
    .locals 8

    invoke-virtual {p1}, Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;->getMetric()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;->getIcon()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lgz0/m0;->WHOOP_LOGO_CIRCLE:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    :goto_1
    if-nez v6, :cond_2

    goto :goto_2

    :cond_2
    move-object v2, v6

    :goto_2
    invoke-virtual {p1}, Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    new-instance v1, Lln1/d;

    invoke-direct {v1, v0, p2, v2, p1}, Lln1/d;-><init>(Ljava/lang/String;ZLgz0/m0;Lcom/whoop/design/util/TextResource;)V

    return-object v1
.end method

.method private final e(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;)Lin1/h;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method private final f(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;Ldn1/i;Lin1/g;)Lin1/d;
    .locals 21

    sget v0, Lan1/a;->c:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    invoke-direct/range {p0 .. p1}, Lin1/a;->e(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;)Lin1/h;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->getPinnedMetricsHeader()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->getPinnedMetricsSection()Lcom/whoop/homecustomization/domain/models/MetricsSection;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/homecustomization/domain/models/MetricsSection;->getMetrics()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v5, 0x0

    move v8, v5

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v13, v8, 0x1

    if-ltz v8, :cond_0

    move-object v7, v6

    check-cast v7, Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    move-object/from16 v6, p0

    invoke-static/range {v6 .. v12}, Lin1/a;->c(Lin1/a;Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;IZZILjava/lang/Object;)Le41/i;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v8, v13

    goto :goto_0

    :cond_0
    invoke-static {}, Lwb3/f;->d0()V

    throw v7

    :cond_1
    new-instance v1, Lin1/f;

    invoke-direct {v1, v0, v3}, Lin1/f;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->getUnpinnedMetricsHeader()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->getUnpinnedMetricsSection()Lcom/whoop/homecustomization/domain/models/MetricsSection;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/homecustomization/domain/models/MetricsSection;->getMetrics()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v3, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move/from16 v16, v5

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v8, v16, 0x1

    if-ltz v16, :cond_2

    move-object v15, v5

    check-cast v15, Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;

    const/16 v19, 0x4

    const/16 v20, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v14, p0

    invoke-static/range {v14 .. v20}, Lin1/a;->c(Lin1/a;Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;IZZILjava/lang/Object;)Le41/i;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v16, v8

    goto :goto_1

    :cond_2
    invoke-static {}, Lwb3/f;->d0()V

    throw v7

    :cond_3
    new-instance v5, Lin1/f;

    invoke-direct {v5, v0, v6}, Lin1/f;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    sget v0, Lan1/a;->k:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v6

    sget v0, Lan1/a;->g:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    sget v3, Lan1/a;->i:I

    invoke-static {v3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->getBottomSheetMetrics()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v8, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v9, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;

    invoke-virtual {v8}, Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;->getMetric()Ljava/lang/String;

    move-result-object v10

    if-eqz p2, :cond_4

    invoke-virtual/range {p2 .. p2}, Ldn1/i;->d()Ljava/lang/String;

    move-result-object v11

    goto :goto_3

    :cond_4
    move-object v11, v7

    :goto_3
    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    move-object/from16 v14, p0

    invoke-direct {v14, v8, v10}, Lin1/a;->d(Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;Z)Lln1/d;

    move-result-object v8

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    move-object/from16 v14, p0

    sget v4, Lan1/a;->f:I

    invoke-static {v4}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v4

    new-instance v7, Lin1/e;

    invoke-direct {v7, v0, v3, v9, v4}, Lin1/e;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;)V

    move-object v4, v1

    new-instance v1, Lin1/d$c;

    const/4 v3, 0x0

    move-object/from16 v8, p3

    invoke-direct/range {v1 .. v8}, Lin1/d$c;-><init>(Lcom/whoop/design/util/TextResource;Lin1/h;Lin1/f;Lin1/f;Lcom/whoop/design/util/TextResource;Lin1/e;Lin1/g;)V

    return-object v1
.end method

.method public static synthetic g(Lin1/a;Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;Ldn1/i;Lin1/g;ILjava/lang/Object;)Lin1/d;
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lin1/a;->f(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;Ldn1/i;Lin1/g;)Lin1/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Ldn1/c;)Lin1/d;
    .locals 6

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ldn1/c$a;

    if-eqz v0, :cond_0

    sget-object p1, Lin1/d$b;->a:Lin1/d$b;

    return-object p1

    :cond_0
    instance-of v0, p1, Ldn1/d;

    if-eqz v0, :cond_1

    new-instance v0, Lin1/d$a;

    check-cast p1, Ldn1/d;

    invoke-virtual {p1}, Ldn1/d;->b()Ldn1/g;

    move-result-object p1

    invoke-direct {v0, p1}, Lin1/d$a;-><init>(Ldn1/g;)V

    return-object v0

    :cond_1
    instance-of v0, p1, Ldn1/e;

    if-eqz v0, :cond_2

    check-cast p1, Ldn1/e;

    invoke-virtual {p1}, Ldn1/e;->a()Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;

    move-result-object v1

    invoke-virtual {p1}, Ldn1/e;->d()Ldn1/i;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lin1/a;->g(Lin1/a;Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;Ldn1/i;Lin1/g;ILjava/lang/Object;)Lin1/d;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of v0, p1, Ldn1/f$a;

    if-eqz v0, :cond_3

    check-cast p1, Ldn1/f$a;

    invoke-virtual {p1}, Ldn1/f$a;->a()Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;

    move-result-object v1

    sget-object v3, Lin1/g;->ERROR:Lin1/g;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lin1/a;->g(Lin1/a;Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;Ldn1/i;Lin1/g;ILjava/lang/Object;)Lin1/d;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of v0, p1, Ldn1/f$c;

    if-eqz v0, :cond_4

    check-cast p1, Ldn1/f$c;

    invoke-virtual {p1}, Ldn1/f$c;->a()Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;

    move-result-object v1

    sget-object v3, Lin1/g;->SUCCESS:Lin1/g;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lin1/a;->g(Lin1/a;Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;Ldn1/i;Lin1/g;ILjava/lang/Object;)Lin1/d;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of v0, p1, Ldn1/f$b;

    if-eqz v0, :cond_5

    check-cast p1, Ldn1/f$b;

    invoke-virtual {p1}, Ldn1/f$b;->a()Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;

    move-result-object v1

    sget-object v3, Lin1/g;->SAVING:Lin1/g;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lin1/a;->g(Lin1/a;Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;Ldn1/i;Lin1/g;ILjava/lang/Object;)Lin1/d;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
