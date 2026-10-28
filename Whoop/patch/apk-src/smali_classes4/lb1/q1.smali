.class public abstract Llb1/q1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\nH\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\r\"\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/whoop/design/models/cards/FertilityCardModel;",
        "model",
        "Lg01/d;",
        "k",
        "(Lcom/whoop/design/models/cards/FertilityCardModel;)Lg01/d;",
        "Lcom/whoop/design/models/cards/FertilityCardBodyModel;",
        "body",
        "Lg01/a;",
        "o",
        "(Lcom/whoop/design/models/cards/FertilityCardBodyModel;)Lg01/a;",
        "Lcom/whoop/design/models/cards/FertilityStatusItemModel;",
        "Lg01/g;",
        "p",
        "(Lcom/whoop/design/models/cards/FertilityStatusItemModel;)Lg01/g;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "j",
        "()Llb1/y0;",
        "fertilityCardMapper",
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

    new-instance v0, Llb1/e1;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Llb1/e1;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/q1;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/cards/FertilityCardModel;)Lg01/d;
    .locals 0

    invoke-static {p0}, Llb1/q1;->h(Lcom/whoop/design/models/cards/FertilityCardModel;)Lg01/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/cards/FertilityStatusItemModel;)Lg01/g;
    .locals 0

    invoke-static {p0}, Llb1/q1;->i(Lcom/whoop/design/models/cards/FertilityStatusItemModel;)Lg01/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/design/models/items/AnnotatedTextModel;)Lsz0/c;
    .locals 0

    invoke-static {p0}, Llb1/q1;->n(Lcom/whoop/design/models/items/AnnotatedTextModel;)Lsz0/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/q1;->l(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/q1;->m(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/q1;->g(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/e1;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Llb1/e1;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/cards/FertilityCardModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/q1$a;

    invoke-direct {v3, v0}, Llb1/q1$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/e1;

    const/16 v2, 0x13

    invoke-direct {v0, v2}, Llb1/e1;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/cards/FertilityStatusItemModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/q1$b;

    invoke-direct {v2, v0}, Llb1/q1$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lcom/whoop/design/models/cards/FertilityCardModel;)Lg01/d;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/q1;->k(Lcom/whoop/design/models/cards/FertilityCardModel;)Lg01/d;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Lcom/whoop/design/models/cards/FertilityStatusItemModel;)Lg01/g;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/q1;->p(Lcom/whoop/design/models/cards/FertilityStatusItemModel;)Lg01/g;

    move-result-object p0

    return-object p0
.end method

.method public static final j()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/q1;->a:Llb1/y0;

    return-object v0
.end method

.method public static final k(Lcom/whoop/design/models/cards/FertilityCardModel;)Lg01/d;
    .locals 10

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/m;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Llb1/m;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/FertilityCardModel;->getCardTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/FertilityCardModel;->getIcon()Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lgz0/m0;->EDUCATION:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    const/4 v7, 0x0

    if-ge v6, v5, :cond_1

    aget-object v8, v4, v6

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    move-object v8, v7

    :goto_1
    if-nez v8, :cond_2

    goto :goto_2

    :cond_2
    move-object v3, v8

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/cards/FertilityCardModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/FertilityCardModel;->getBody()Lcom/whoop/design/models/cards/FertilityCardBodyModel;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v1}, Llb1/q1;->o(Lcom/whoop/design/models/cards/FertilityCardBodyModel;)Lg01/a;

    move-result-object v1

    move-object v5, v1

    goto :goto_3

    :cond_3
    move-object v5, v7

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/design/models/cards/FertilityCardModel;->getItems()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/FertilityCardModel;->getTrend()Lcom/whoop/design/models/items/ImpactModel;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-static {p0}, Llb1/g2;->d(Lcom/whoop/design/models/items/ImpactModel;)Lhy0/c2;

    move-result-object v7

    :cond_4
    new-instance v1, Lg01/d;

    invoke-direct/range {v1 .. v7}, Lg01/d;-><init>(Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/e;Lg01/a;Ljava/util/List;Lhy0/c2;)V

    return-object v1
.end method

.method private static final l(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/m;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Llb1/m;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/m;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Llb1/m;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/AnnotatedTextModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/q1$c;

    invoke-direct {v2, v0}, Llb1/q1$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lcom/whoop/design/models/items/AnnotatedTextModel;)Lsz0/c;
    .locals 2

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lsz0/c;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AnnotatedTextModel;->getText()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lsz0/c;-><init>(Ljava/lang/String;Z)V

    return-object v0
.end method

.method private static final o(Lcom/whoop/design/models/cards/FertilityCardBodyModel;)Lg01/a;
    .locals 3

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/FertilityCardBodyModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/FertilityCardBodyModel;->getSubtitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/FertilityCardBodyModel;->getTag()Lcom/whoop/design/models/items/TagModel;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Llb1/q4;->d(Lcom/whoop/design/models/items/TagModel;)Lhy0/h1;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    new-instance v2, Lg01/a;

    invoke-direct {v2, v0, v1, p0}, Lg01/a;-><init>(Ljava/lang/String;Ljava/lang/String;Lhy0/h1;)V

    return-object v2
.end method

.method public static final p(Lcom/whoop/design/models/cards/FertilityStatusItemModel;)Lg01/g;
    .locals 11

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/FertilityStatusItemModel;->getStartTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/FertilityStatusItemModel;->getEndTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/FertilityStatusItemModel;->getIcon()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lgz0/m0;->TINY_ELLIPSE:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    const/4 v8, 0x0

    if-ge v7, v5, :cond_1

    aget-object v9, v4, v7

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    move-object v9, v8

    :goto_1
    if-nez v9, :cond_2

    goto :goto_2

    :cond_2
    move-object v3, v9

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/cards/FertilityStatusItemModel;->getStatus()Ljava/lang/String;

    move-result-object p0

    sget-object v2, Lc41/w3;->CALIBRATING:Lc41/w3;

    invoke-static {}, Lc41/w3;->values()[Lc41/w3;

    move-result-object v4

    array-length v5, v4

    :goto_3
    if-ge v6, v5, :cond_4

    aget-object v7, v4, v6

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    move-object v8, v7

    goto :goto_4

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_4
    :goto_4
    if-nez v8, :cond_5

    goto :goto_5

    :cond_5
    move-object v2, v8

    :goto_5
    new-instance p0, Lg01/g;

    invoke-direct {p0, v0, v1, v3, v2}, Lg01/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lc41/w3;)V

    return-object p0
.end method
