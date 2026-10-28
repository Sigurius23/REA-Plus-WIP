.class public abstract Ljk1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0004\u001a\u001b\u0010\u0008\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\"\u001a\u0010\u001d\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lfk1/a;",
        "drawerIdProvider",
        "Ljb1/a;",
        "u",
        "(Lfk1/a;)Ljb1/a;",
        "y",
        "Llb1/z0;",
        "Ll83/a0;",
        "m",
        "(Llb1/z0;Lfk1/a;)V",
        "k",
        "(Llb1/z0;)V",
        "Lcom/whoop/healthspan/domain/models/SingleContributorContainer;",
        "model",
        "Lc11/p;",
        "s",
        "(Lcom/whoop/healthspan/domain/models/SingleContributorContainer;Lfk1/a;)Lc11/p;",
        "Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;",
        "Lc11/i;",
        "t",
        "(Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;)Lc11/i;",
        "Lcom/whoop/healthspan/domain/models/ContributorRangeValue;",
        "Lc11/l;",
        "r",
        "(Lcom/whoop/healthspan/domain/models/ContributorRangeValue;)Lc11/l;",
        "a",
        "Ljb1/a;",
        "getContributorContainerDependentReducer",
        "()Ljb1/a;",
        "contributorContainerDependentReducer",
        "healthspan_release"
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
.field private static final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljg/c;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Ljg/c;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Ljk1/b;->a:Ljb1/a;

    return-void
.end method

.method private static final A(Lfk1/a;Llb1/z0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$addModelMapper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p0}, Ljk1/b;->m(Llb1/z0;Lfk1/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lfk1/a;Ljb1/b;Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ljk1/b;->w(Lfk1/a;Ljb1/b;Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lfk1/a;Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ljk1/b;->A(Lfk1/a;Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lfk1/a;Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ljk1/b;->z(Lfk1/a;Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/healthspan/domain/models/HealthspanVowModel;)Lmk1/e;
    .locals 0

    invoke-static {p0}, Ljk1/b;->l(Lcom/whoop/healthspan/domain/models/HealthspanVowModel;)Lmk1/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lfk1/a;Lcom/whoop/healthspan/domain/models/ContributorsContainerResponse;)Lik1/e;
    .locals 0

    invoke-static {p0, p1}, Ljk1/b;->n(Lfk1/a;Lcom/whoop/healthspan/domain/models/ContributorsContainerResponse;)Lik1/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljk1/b;->q(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lfk1/a;Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ljk1/b;->v(Lfk1/a;Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lfk1/a;Lcom/whoop/healthspan/domain/models/TileSectionModel;)Lok1/a;
    .locals 0

    invoke-static {p0, p1}, Ljk1/b;->x(Lfk1/a;Lcom/whoop/healthspan/domain/models/TileSectionModel;)Lok1/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljk1/b;->p(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lfk1/a;Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;)Lnk1/d;
    .locals 0

    invoke-static {p0, p1}, Ljk1/b;->o(Lfk1/a;Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;)Lnk1/d;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Llb1/z0;)V
    .locals 3

    new-instance v0, Ljg/c;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Ljg/c;-><init>(I)V

    const-class v1, Lcom/whoop/healthspan/domain/models/HealthspanVowModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ljk1/b$a;

    invoke-direct {v2, v0}, Ljk1/b$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final l(Lcom/whoop/healthspan/domain/models/HealthspanVowModel;)Lmk1/e;
    .locals 11

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/healthspan/domain/models/HealthspanVowModel;->getTitleDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/healthspan/domain/models/HealthspanVowModel;->getSubtitleDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/healthspan/domain/models/HealthspanVowModel;->getCtaTextDisplay()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move-object v4, v0

    goto :goto_0

    :cond_0
    move-object v4, v1

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/healthspan/domain/models/HealthspanVowModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/healthspan/domain/models/HealthspanVowModel;->getStyle()Ljava/lang/String;

    move-result-object p0

    sget-object v0, Lmk1/d;->CARD:Lmk1/d;

    invoke-static {}, Lmk1/d;->values()[Lmk1/d;

    move-result-object v6

    array-length v7, v6

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v7, :cond_2

    aget-object v9, v6, v8

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    move-object v1, v9

    goto :goto_2

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    if-nez v1, :cond_3

    move-object v6, v0

    goto :goto_3

    :cond_3
    move-object v6, v1

    :goto_3
    new-instance v1, Lmk1/e;

    invoke-direct/range {v1 .. v6}, Lmk1/e;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lmk1/d;)V

    return-object v1
.end method

.method private static final m(Llb1/z0;Lfk1/a;)V
    .locals 4

    invoke-static {p0}, Ljk1/b;->k(Llb1/z0;)V

    new-instance v0, Ljk1/a;

    const/4 v1, 0x3

    invoke-direct {v0, p1, v1}, Ljk1/a;-><init>(Lfk1/a;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/healthspan/domain/models/ContributorsContainerResponse;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Ljk1/b$b;

    invoke-direct {v3, v0}, Ljk1/b$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Ljk1/a;

    const/4 v2, 0x4

    invoke-direct {v0, p1, v2}, Ljk1/a;-><init>(Lfk1/a;I)V

    const-class p1, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;

    invoke-virtual {v1, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v1, Ljk1/b$c;

    invoke-direct {v1, v0}, Ljk1/b$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, p1, v1}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final n(Lfk1/a;Lcom/whoop/healthspan/domain/models/ContributorsContainerResponse;)Lik1/e;
    .locals 2

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/healthspan/domain/models/ContributorsContainerResponse;->getContributors()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;

    invoke-static {v1, p0}, Ljk1/b;->s(Lcom/whoop/healthspan/domain/models/SingleContributorContainer;Lfk1/a;)Lc11/p;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {}, Llk1/c;->b()Lm91/p;

    move-result-object p0

    new-instance p1, Lik1/e;

    invoke-direct {p1, v0, p0}, Lik1/e;-><init>(Ljava/util/List;Lm91/p;)V

    return-object p1
.end method

.method private static final o(Lfk1/a;Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;)Lnk1/d;
    .locals 10

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lfk1/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->getTrends()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p0, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/design/models/items/ImpactModel;

    invoke-static {v0}, Llb1/g2;->d(Lcom/whoop/design/models/items/ImpactModel;)Lhy0/c2;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->getButton()Lcom/whoop/design/models/items/SecondaryButtonModel;

    move-result-object p0

    invoke-static {p0}, Llb1/d4;->p(Lcom/whoop/design/models/items/SecondaryButtonModel;)Lny0/p0;

    move-result-object v5

    invoke-virtual {p1}, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->getPieChart()Lcom/whoop/design/models/items/PieChartModel;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, Llb1/q3;->f(Lcom/whoop/design/models/items/PieChartModel;)Le81/f0;

    move-result-object p0

    :goto_1
    move-object v6, p0

    goto :goto_2

    :cond_1
    const/4 p0, 0x0

    goto :goto_1

    :goto_2
    invoke-virtual {p1}, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->getCount()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->getCategory()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_2

    const-string p0, ""

    :cond_2
    move-object v9, p0

    new-instance v1, Lnk1/d;

    const/4 v8, 0x1

    invoke-direct/range {v1 .. v9}, Lnk1/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lny0/p0;Le81/f0;Ljava/lang/String;ZLjava/lang/String;)V

    return-object v1
.end method

.method private static final p(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljg/c;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ljg/c;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Llb1/z0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ljk1/b;->k(Llb1/z0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lcom/whoop/healthspan/domain/models/ContributorRangeValue;)Lc11/l;
    .locals 12

    invoke-virtual {p0}, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->getValueDisplay()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, v1

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->getValueUnitDisplay()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move-object v4, v0

    goto :goto_1

    :cond_1
    move-object v4, v1

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->getValueRangePercentage()D

    move-result-wide v5

    invoke-virtual {p0}, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->getStyle()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lc11/o;->ENABLED:Lc11/o;

    invoke-static {}, Lc11/o;->values()[Lc11/o;

    move-result-object v7

    array-length v8, v7

    const/4 v9, 0x0

    :goto_2
    if-ge v9, v8, :cond_3

    aget-object v10, v7, v9

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_3
    move-object v10, v1

    :goto_3
    if-nez v10, :cond_4

    move-object v7, v2

    goto :goto_4

    :cond_4
    move-object v7, v10

    :goto_4
    invoke-virtual {p0}, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->getExpandedValueLabelDisplay()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    :cond_5
    move-object v8, v1

    new-instance v2, Lc11/l;

    invoke-direct/range {v2 .. v8}, Lc11/l;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;DLc11/o;Lcom/whoop/design/util/TextResource;)V

    return-object v2
.end method

.method private static final s(Lcom/whoop/healthspan/domain/models/SingleContributorContainer;Lfk1/a;)Lc11/p;
    .locals 6

    new-instance v0, Lc11/p;

    invoke-virtual {p0}, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->getTitleDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lfk1/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->getTitleDisplay()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->isEnabled()Z

    move-result v3

    invoke-virtual {p0}, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->getContent()Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;

    move-result-object p1

    invoke-static {p1}, Ljk1/b;->t(Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;)Lc11/i;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->isOpen()Ljava/lang/Boolean;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    :goto_0
    move v5, p0

    goto :goto_1

    :cond_0
    const/4 p0, 0x0

    goto :goto_0

    :goto_1
    invoke-direct/range {v0 .. v5}, Lc11/p;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLc11/i;Z)V

    return-object v0
.end method

.method private static final t(Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;)Lc11/i;
    .locals 16

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->getRangeDivisions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/healthspan/domain/models/ContributorRangeDivision;

    invoke-virtual {v1}, Lcom/whoop/healthspan/domain/models/ContributorRangeDivision;->getStyle()Ljava/lang/String;

    move-result-object v1

    sget-object v5, Lc11/m;->NEUTRAL:Lc11/m;

    invoke-static {}, Lc11/m;->values()[Lc11/m;

    move-result-object v6

    array-length v7, v6

    :goto_1
    if-ge v4, v7, :cond_1

    aget-object v8, v6, v4

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    move-object v3, v8

    goto :goto_2

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    if-nez v3, :cond_2

    goto :goto_3

    :cond_2
    move-object v5, v3

    :goto_3
    new-instance v1, Lc11/k;

    invoke-direct {v1, v5}, Lc11/k;-><init>(Lc11/m;)V

    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->getRangeLeftLabelDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->getRangeLeftLabelStyle()Ljava/lang/String;

    move-result-object v1

    sget-object v5, Lc11/m;->NEUTRAL:Lc11/m;

    invoke-static {}, Lc11/m;->values()[Lc11/m;

    move-result-object v6

    array-length v7, v6

    move v8, v4

    :goto_4
    if-ge v8, v7, :cond_5

    aget-object v9, v6, v8

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    goto :goto_5

    :cond_4
    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_5
    move-object v9, v3

    :goto_5
    if-nez v9, :cond_6

    goto :goto_6

    :cond_6
    move-object v5, v9

    :goto_6
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->getRangeRightLabelDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->getRangeRightLabelStyle()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lc11/m;->NEUTRAL:Lc11/m;

    invoke-static {}, Lc11/m;->values()[Lc11/m;

    move-result-object v8

    array-length v9, v8

    move v10, v4

    :goto_7
    if-ge v10, v9, :cond_8

    aget-object v11, v8, v10

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    goto :goto_8

    :cond_7
    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    :cond_8
    move-object v11, v3

    :goto_8
    if-nez v11, :cond_9

    move-object v6, v7

    goto :goto_9

    :cond_9
    move-object v6, v11

    :goto_9
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->getTopRangeValue()Lcom/whoop/healthspan/domain/models/ContributorRangeValue;

    move-result-object v7

    invoke-static {v7}, Ljk1/b;->r(Lcom/whoop/healthspan/domain/models/ContributorRangeValue;)Lc11/l;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->getImpactValueDisplay()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->getImpactValueLabelDisplay()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->getImpactValueStyle()Ljava/lang/String;

    move-result-object v10

    sget-object v11, Lc11/n;->NEUTRAL:Lc11/n;

    invoke-static {}, Lc11/n;->values()[Lc11/n;

    move-result-object v12

    array-length v13, v12

    :goto_a
    if-ge v4, v13, :cond_b

    aget-object v14, v12, v4

    invoke-virtual {v14}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_a

    move-object v3, v14

    goto :goto_b

    :cond_a
    add-int/lit8 v4, v4, 0x1

    goto :goto_a

    :cond_b
    :goto_b
    if-nez v3, :cond_c

    move-object v10, v11

    goto :goto_c

    :cond_c
    move-object v10, v3

    :goto_c
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->getExpandedBottomRangeValue()Lcom/whoop/healthspan/domain/models/ContributorRangeValue;

    move-result-object v3

    invoke-static {v3}, Ljk1/b;->r(Lcom/whoop/healthspan/domain/models/ContributorRangeValue;)Lc11/l;

    move-result-object v11

    sget-object v3, Ljk1/b;->a:Ljb1/a;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->getExpandedItems()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v12

    invoke-static {}, Llk1/c;->b()Lm91/p;

    move-result-object v13

    move-object v4, v5

    move-object v5, v1

    new-instance v1, Lc11/i;

    move-object v3, v0

    invoke-direct/range {v1 .. v13}, Lc11/i;-><init>(Ljava/util/List;Lcom/whoop/design/util/TextResource;Lc11/m;Lcom/whoop/design/util/TextResource;Lc11/m;Lc11/l;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc11/n;Lc11/l;Ljava/util/List;Lm91/p;)V

    return-object v1
.end method

.method public static final u(Lfk1/a;)Ljb1/a;
    .locals 2

    const-string v0, "drawerIdProvider"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljk1/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ljk1/a;-><init>(Lfk1/a;I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final v(Lfk1/a;Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;

    const/16 v1, 0x1d

    invoke-direct {v0, v1, p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lfk1/a;Ljb1/b;Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p0}, Ljk1/b;->m(Llb1/z0;Lfk1/a;)V

    new-instance v0, Ljk1/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Ljk1/a;-><init>(Lfk1/a;I)V

    sget-object p0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/whoop/healthspan/domain/models/TileSectionModel;

    invoke-virtual {p0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ljk1/b$f;

    invoke-direct {v2, v0}, Ljk1/b$f;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    const-class p2, Lk71/m;

    invoke-virtual {p0, p2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p2

    new-instance v0, Ljk1/b$d;

    invoke-direct {v0}, Ljk1/b$d;-><init>()V

    invoke-virtual {p1, p2, v0}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    const-class p2, Ld11/i;

    invoke-virtual {p0, p2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    new-instance p2, Ljk1/b$e;

    invoke-direct {p2}, Ljk1/b$e;-><init>()V

    invoke-virtual {p1, p0, p2}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lfk1/a;Lcom/whoop/healthspan/domain/models/TileSectionModel;)Lok1/a;
    .locals 6

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/healthspan/domain/models/TileSectionModel;->getTitleDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/healthspan/domain/models/TileSectionModel;->getPrimaryDescriptionDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/healthspan/domain/models/TileSectionModel;->getSecondaryDescriptionDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/healthspan/domain/models/TileSectionModel;->getItems()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {p1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {p0}, Ljk1/b;->y(Lfk1/a;)Ljb1/a;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Lok1/a;

    invoke-direct {p0, v0, v1, v2, v3}, Lok1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object p0
.end method

.method public static final y(Lfk1/a;)Ljb1/a;
    .locals 2

    const-string v0, "drawerIdProvider"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljk1/a;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Ljk1/a;-><init>(Lfk1/a;I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final z(Lfk1/a;Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljk1/a;

    const/4 v1, 0x5

    invoke-direct {v0, p0, v1}, Ljk1/a;-><init>(Lfk1/a;I)V

    invoke-virtual {p1, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
