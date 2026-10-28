.class public abstract Llb1/r3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\"\u001a\u0010\r\u001a\u00020\u00088\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/whoop/design/models/cards/ProductTestCardModel;",
        "Lf01/p1;",
        "f",
        "(Lcom/whoop/design/models/cards/ProductTestCardModel;)Lf01/p1;",
        "Lcom/whoop/design/models/cards/TrailingIconModel;",
        "Lf01/r1;",
        "g",
        "(Lcom/whoop/design/models/cards/TrailingIconModel;)Lf01/r1;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "productTestCardMapper",
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

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Llb1/j3;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/r3;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/r3;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/cards/ProductTestCardModel;)Lf01/p1;
    .locals 0

    invoke-static {p0}, Llb1/r3;->e(Lcom/whoop/design/models/cards/ProductTestCardModel;)Lf01/p1;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/r3;->a:Llb1/y0;

    return-object v0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/j3;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Llb1/j3;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/cards/ProductTestCardModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/r3$a;

    invoke-direct {v2, v0}, Llb1/r3$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/cards/ProductTestCardModel;)Lf01/p1;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/r3;->f(Lcom/whoop/design/models/cards/ProductTestCardModel;)Lf01/p1;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lcom/whoop/design/models/cards/ProductTestCardModel;)Lf01/p1;
    .locals 11

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v1, v0, v1}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/ProductTestCardModel;->getId()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/ProductTestCardModel;->getImageUrl()Ljava/lang/String;

    move-result-object v5

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/ProductTestCardModel;->getItems()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v2}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    :cond_0
    move-object v5, v1

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/ProductTestCardModel;->getTrailingIcon()Lcom/whoop/design/models/cards/TrailingIconModel;

    move-result-object v0

    invoke-static {v0}, Llb1/r3;->g(Lcom/whoop/design/models/cards/TrailingIconModel;)Lf01/r1;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/ProductTestCardModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/ProductTestCardModel;->getModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v8

    new-instance v2, Lf01/p1;

    invoke-direct/range {v2 .. v8}, Lf01/p1;-><init>(Ljava/lang/String;Lkd1/o;Ljava/util/List;Lf01/r1;Lcom/whoop/navigation/e;Ljava/lang/Object;)V

    return-object v2
.end method

.method private static final g(Lcom/whoop/design/models/cards/TrailingIconModel;)Lf01/r1;
    .locals 13

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/TrailingIconModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lgz0/m0;->ARROW_FORWARD:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_1

    aget-object v6, v2, v5

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

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

    move-object v8, v1

    goto :goto_2

    :cond_2
    move-object v8, v6

    :goto_2
    sget-object v0, Lgz0/m0;->CHECKMARK:Lgz0/m0;

    const/4 v1, 0x1

    if-ne v8, v0, :cond_3

    move v4, v1

    :cond_3
    new-instance v7, Lf01/r1;

    if-eqz v4, :cond_4

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/TrailingIconModel;->getDeselectAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/TrailingIconModel;->getDeselectAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v0

    :goto_3
    move-object v9, v0

    goto :goto_4

    :cond_4
    invoke-virtual {p0}, Lcom/whoop/design/models/cards/TrailingIconModel;->getAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v0

    goto :goto_3

    :goto_4
    invoke-virtual {p0}, Lcom/whoop/design/models/cards/TrailingIconModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v10

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/TrailingIconModel;->getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v11

    xor-int/lit8 v12, v4, 0x1

    invoke-direct/range {v7 .. v12}, Lf01/r1;-><init>(Lgz0/m0;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/e;Lcom/whoop/analytics/AnalyticEventModel;Z)V

    return-object v7
.end method
