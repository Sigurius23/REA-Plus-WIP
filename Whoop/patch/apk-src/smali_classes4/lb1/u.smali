.class public abstract Llb1/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a-\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\"\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;",
        "model",
        "Le81/n;",
        "c",
        "(Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;)Le81/n;",
        "",
        "Lcom/whoop/design/models/items/BiomarkerCardModel;",
        "models",
        "Ljb1/a;",
        "reducer",
        "La01/h;",
        "g",
        "(Ljava/util/List;Ljb1/a;)Ljava/util/List;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "f",
        "()Llb1/y0;",
        "biomarkerPieChartSectionMapper",
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

    new-instance v0, Llb1/a;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Llb1/a;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/u;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/u;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;)Le81/n;
    .locals 0

    invoke-static {p0}, Llb1/u;->e(Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;)Le81/n;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;)Le81/n;
    .locals 18

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v2, v0}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;->getOrientation()Ljava/lang/String;

    move-result-object v4

    sget-object v6, Le81/l;->PIE_LEFT:Le81/l;

    invoke-static {}, Le81/l;->values()[Le81/l;

    move-result-object v7

    array-length v8, v7

    const/4 v9, 0x0

    move v10, v9

    :goto_0
    if-ge v10, v8, :cond_1

    aget-object v11, v7, v10

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_1
    move-object v11, v0

    :goto_1
    if-nez v11, :cond_2

    goto :goto_2

    :cond_2
    move-object v6, v11

    :goto_2
    invoke-virtual {v1}, Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;->getPieChart()Lcom/whoop/design/models/items/PieChartModel;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v4

    instance-of v7, v4, Le81/f0;

    if-eqz v7, :cond_3

    check-cast v4, Le81/f0;

    goto :goto_3

    :cond_3
    move-object v4, v0

    :goto_3
    if-nez v4, :cond_4

    new-instance v4, Le81/f0;

    const-string v7, ""

    sget-object v8, Lm83/y;->w:Lm83/y;

    invoke-direct {v4, v7, v9, v8}, Le81/f0;-><init>(Ljava/lang/String;ZLjava/util/List;)V

    :cond_4
    move-object v7, v4

    invoke-virtual {v1}, Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;->getPieChartContent()Lcom/whoop/design/models/items/BiomarkerPieChartContentModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/design/models/items/BiomarkerPieChartContentModel;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;->getPieChartContent()Lcom/whoop/design/models/items/BiomarkerPieChartContentModel;

    move-result-object v8

    invoke-virtual {v8}, Lcom/whoop/design/models/items/BiomarkerPieChartContentModel;->getSubtitle()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;->getPieChartContent()Lcom/whoop/design/models/items/BiomarkerPieChartContentModel;

    move-result-object v10

    invoke-virtual {v10}, Lcom/whoop/design/models/items/BiomarkerPieChartContentModel;->getSubtitleIcon()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_8

    sget-object v11, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v12

    array-length v13, v12

    move v14, v9

    :goto_4
    if-ge v14, v13, :cond_6

    aget-object v15, v12, v14

    invoke-virtual {v15}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_5

    :cond_5
    add-int/lit8 v14, v14, 0x1

    const/4 v0, 0x0

    goto :goto_4

    :cond_6
    const/4 v15, 0x0

    :goto_5
    if-nez v15, :cond_7

    goto :goto_6

    :cond_7
    move-object v11, v15

    goto :goto_6

    :cond_8
    const/4 v11, 0x0

    :goto_6
    invoke-virtual {v1}, Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;->getPieChartContent()Lcom/whoop/design/models/items/BiomarkerPieChartContentModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/BiomarkerPieChartContentModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v0

    new-instance v10, Le81/a;

    invoke-direct {v10, v4, v8, v11, v0}, Le81/a;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/e;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;->getTrendCounts()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    move v4, v9

    new-instance v9, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v0, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v9, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/design/models/items/TrendCountModel;

    new-instance v11, Le81/k0;

    invoke-virtual {v8}, Lcom/whoop/design/models/items/TrendCountModel;->getTrend()Lcom/whoop/design/models/items/ImpactModel;

    move-result-object v12

    invoke-static {v12}, Llb1/g2;->d(Lcom/whoop/design/models/items/ImpactModel;)Lhy0/c2;

    move-result-object v12

    invoke-virtual {v8}, Lcom/whoop/design/models/items/TrendCountModel;->getValue()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v11, v12, v8}, Le81/k0;-><init>(Lhy0/c2;Ljava/lang/String;)V

    invoke-interface {v9, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_9
    invoke-virtual {v1}, Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;->getBiomarkers()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v3}, Llb1/u;->g(Ljava/util/List;Ljb1/a;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;->getCaption()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;->getStyle()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_17

    sget-object v8, Le81/l;->PIE_LEFT:Le81/l;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;->getOrientation()Ljava/lang/String;

    move-result-object v12

    invoke-static {}, Le81/l;->values()[Le81/l;

    move-result-object v13

    array-length v14, v13

    move v15, v4

    :goto_8
    if-ge v15, v14, :cond_b

    aget-object v17, v13, v15

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_9

    :cond_a
    add-int/lit8 v15, v15, 0x1

    const/4 v2, 0x1

    goto :goto_8

    :cond_b
    const/16 v17, 0x0

    :goto_9
    if-nez v17, :cond_c

    move-object v2, v8

    goto :goto_a

    :cond_c
    move-object/from16 v2, v17

    :goto_a
    if-ne v8, v2, :cond_d

    const/4 v2, 0x1

    goto :goto_b

    :cond_d
    move v2, v4

    :goto_b
    sget-object v8, Le81/l;->PIE_RIGHT:Le81/l;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;->getOrientation()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Le81/l;->values()[Le81/l;

    move-result-object v12

    array-length v13, v12

    move v14, v4

    :goto_c
    if-ge v14, v13, :cond_f

    aget-object v15, v12, v14

    invoke-virtual {v15}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    goto :goto_d

    :cond_e
    add-int/lit8 v14, v14, 0x1

    const/4 v4, 0x0

    goto :goto_c

    :cond_f
    const/4 v15, 0x0

    :goto_d
    if-nez v15, :cond_10

    move-object v15, v8

    :cond_10
    if-ne v8, v15, :cond_11

    goto :goto_e

    :cond_11
    if-eqz v2, :cond_12

    :goto_e
    sget-object v1, Le81/m;->DEFAULT:Le81/m;

    goto :goto_11

    :cond_12
    sget-object v1, Le81/m;->DEFAULT:Le81/m;

    invoke-static {}, Le81/m;->values()[Le81/m;

    move-result-object v2

    array-length v4, v2

    const/4 v8, 0x0

    :goto_f
    if-ge v8, v4, :cond_14

    aget-object v12, v2, v8

    invoke-virtual {v12}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_13

    move-object/from16 v16, v12

    goto :goto_10

    :cond_13
    add-int/lit8 v8, v8, 0x1

    goto :goto_f

    :cond_14
    const/16 v16, 0x0

    :goto_10
    if-nez v16, :cond_15

    goto :goto_11

    :cond_15
    move-object/from16 v1, v16

    :goto_11
    if-nez v1, :cond_16

    goto :goto_13

    :cond_16
    :goto_12
    move-object v12, v1

    goto :goto_14

    :cond_17
    :goto_13
    sget-object v1, Le81/m;->DEFAULT:Le81/m;

    goto :goto_12

    :goto_14
    new-instance v4, Le81/n;

    const/4 v13, 0x0

    const/16 v14, 0x100

    const/4 v15, 0x0

    move-object v8, v10

    move-object v10, v0

    invoke-direct/range {v4 .. v15}, Le81/n;-><init>(Ljava/lang/String;Le81/l;Le81/f0;Le81/a;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Le81/m;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/a;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Llb1/a;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/u$a;

    invoke-direct {v2, v0}, Llb1/u$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;)Le81/n;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/u;->c(Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;)Le81/n;

    move-result-object p0

    return-object p0
.end method

.method public static final f()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/u;->a:Llb1/y0;

    return-object v0
.end method

.method public static final g(Ljava/util/List;Ljb1/a;)Ljava/util/List;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/BiomarkerCardModel;",
            ">;",
            "Ljb1/a;",
            ")",
            "Ljava/util/List<",
            "La01/h;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "reducer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lm83/y;->w:Lm83/y;

    if-nez p0, :cond_0

    return-object v1

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/BiomarkerCardModel;

    invoke-virtual {v0, v4}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v4

    instance-of v5, v4, La01/h;

    if-eqz v5, :cond_1

    check-cast v4, La01/h;

    :goto_1
    move-object v5, v4

    goto :goto_2

    :cond_1
    const/4 v4, 0x0

    goto :goto_1

    :goto_2
    if-nez v5, :cond_2

    return-object v1

    :cond_2
    const/16 v22, 0x7fff

    const/16 v23, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v5 .. v23}, La01/h;->b(La01/h;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;La01/m;Lhy0/c2;La01/a;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;La01/n;Ljava/lang/Integer;Lv21/c;Lj71/c;ZILjava/lang/Object;)La01/h;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v2
.end method
