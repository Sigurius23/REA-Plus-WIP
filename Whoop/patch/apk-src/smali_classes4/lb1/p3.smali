.class public abstract Llb1/p3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\"\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/whoop/design/models/items/PaceOfAgingMeterModel;",
        "model",
        "",
        "ignoreAnimation",
        "",
        "pastCurrentIndex",
        "Lc81/g;",
        "g",
        "(Lcom/whoop/design/models/items/PaceOfAgingMeterModel;ZLjava/lang/Integer;)Lc81/g;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "d",
        "()Llb1/y0;",
        "paceOfAgingMeterMapper",
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

    new-instance v0, Llb1/j3;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Llb1/j3;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/p3;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/PaceOfAgingMeterModel;)Lc81/g;
    .locals 0

    invoke-static {p0}, Llb1/p3;->f(Lcom/whoop/design/models/items/PaceOfAgingMeterModel;)Lc81/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/p3;->i(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/p3;->e(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/p3;->a:Llb1/y0;

    return-object v0
.end method

.method private static final e(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/j3;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Llb1/j3;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/PaceOfAgingMeterModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/p3$a;

    invoke-direct {v2, v0}, Llb1/p3$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lcom/whoop/design/models/items/PaceOfAgingMeterModel;)Lc81/g;
    .locals 3

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1, v0}, Llb1/p3;->h(Lcom/whoop/design/models/items/PaceOfAgingMeterModel;ZLjava/lang/Integer;ILjava/lang/Object;)Lc81/g;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lcom/whoop/design/models/items/PaceOfAgingMeterModel;ZLjava/lang/Integer;)Lc81/g;
    .locals 20

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/z2;

    const/16 v2, 0x9

    invoke-direct {v0, v2}, Llb1/z2;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/design/models/items/PaceOfAgingMeterModel;->getTicks()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, -0x1

    if-eqz v5, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/items/PaceOfAgingMeterTickModel;

    invoke-virtual {v5}, Lcom/whoop/design/models/items/PaceOfAgingMeterTickModel;->isCurrentValue()Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    move v4, v6

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/design/models/items/PaceOfAgingMeterModel;->getCurrentValueRiseStartTickIndex()Ljava/lang/Integer;

    move-result-object v2

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    :goto_2
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_4

    :cond_2
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    if-eq v4, v6, :cond_3

    goto :goto_3

    :cond_3
    move-object v2, v5

    :goto_3
    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    move v2, v3

    :goto_4
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    if-eq v4, v6, :cond_5

    goto :goto_5

    :cond_5
    move-object v7, v5

    :goto_5
    if-eqz v7, :cond_6

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v6

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Lcom/whoop/design/models/items/PaceOfAgingMeterModel;->getCurrentValueRiseStartTickIndex()Ljava/lang/Integer;

    move-result-object v6

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    goto :goto_6

    :cond_7
    move v6, v3

    :goto_6
    invoke-static {v2, v6}, Lor2/a1;->c(II)Li93/h;

    move-result-object v14

    invoke-virtual {v1}, Lcom/whoop/design/models/items/PaceOfAgingMeterModel;->getTicks()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v2, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v8, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/design/models/items/PaceOfAgingMeterTickModel;

    new-instance v7, Lc81/e;

    invoke-virtual {v6}, Lcom/whoop/design/models/items/PaceOfAgingMeterTickModel;->getTopValueDisplay()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6}, Lcom/whoop/design/models/items/PaceOfAgingMeterTickModel;->getBottomValueDisplay()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6}, Lcom/whoop/design/models/items/PaceOfAgingMeterTickModel;->isCurrentValue()Z

    move-result v11

    invoke-virtual {v6}, Lcom/whoop/design/models/items/PaceOfAgingMeterTickModel;->getStyle()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v7, v9, v10, v11, v6}, Lc81/e;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_8
    invoke-virtual {v1}, Lcom/whoop/design/models/items/PaceOfAgingMeterModel;->getLeftLabelDisplay()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/design/models/items/PaceOfAgingMeterModel;->getLeftIcon()Ljava/lang/String;

    move-result-object v2

    sget-object v6, Lgz0/m0;->SLOW_PACE_OF_AGING:Lgz0/m0;

    invoke-static {v2, v6}, Lgz0/n0;->c(Ljava/lang/String;Lgz0/m0;)Lgz0/m0;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/design/models/items/PaceOfAgingMeterModel;->getRightLabelDisplay()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/design/models/items/PaceOfAgingMeterModel;->getRightIcon()Ljava/lang/String;

    move-result-object v2

    sget-object v6, Lgz0/m0;->FAST_PACE_OF_AGING:Lgz0/m0;

    invoke-static {v2, v6}, Lgz0/n0;->c(Ljava/lang/String;Lgz0/m0;)Lgz0/m0;

    move-result-object v12

    invoke-virtual {v1}, Lcom/whoop/design/models/items/PaceOfAgingMeterModel;->getTitleDisplay()Ljava/lang/String;

    move-result-object v13

    if-nez p1, :cond_b

    if-nez p2, :cond_9

    goto :goto_8

    :cond_9
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v4, v2, :cond_a

    goto :goto_9

    :cond_a
    :goto_8
    move v15, v3

    goto :goto_a

    :cond_b
    :goto_9
    const/4 v3, 0x1

    goto :goto_8

    :goto_a
    invoke-virtual {v1}, Lcom/whoop/design/models/items/PaceOfAgingMeterModel;->getTrend()Lcom/whoop/design/models/items/ImpactModel;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-virtual {v0, v1}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    goto :goto_b

    :cond_c
    move-object v0, v5

    :goto_b
    instance-of v1, v0, Lhy0/c2;

    if-eqz v1, :cond_d

    move-object v5, v0

    check-cast v5, Lhy0/c2;

    :cond_d
    move-object/from16 v17, v5

    new-instance v7, Lc81/g;

    const/16 v18, 0x100

    const/16 v19, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v7 .. v19}, Lc81/g;-><init>(Ljava/util/List;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Li93/h;ZZLhy0/c2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7
.end method

.method public static synthetic h(Lcom/whoop/design/models/items/PaceOfAgingMeterModel;ZLjava/lang/Integer;ILjava/lang/Object;)Lc81/g;
    .locals 0

    and-int/lit8 p4, p3, 0x2

    if-eqz p4, :cond_0

    const/4 p1, 0x1

    :cond_0
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    :cond_1
    invoke-static {p0, p1, p2}, Llb1/p3;->g(Lcom/whoop/design/models/items/PaceOfAgingMeterModel;ZLjava/lang/Integer;)Lc81/g;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
