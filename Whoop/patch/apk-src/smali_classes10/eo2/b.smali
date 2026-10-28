.class public abstract Leo2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\"\u001a\u0010\r\u001a\u00020\u00088\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;",
        "Lfo2/d;",
        "p",
        "(Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;)Lfo2/d;",
        "Lcom/whoop/universalcheckout/features/cart/domain/models/items/EmptyCartContentModel;",
        "Lfo2/h;",
        "q",
        "(Lcom/whoop/universalcheckout/features/cart/domain/models/items/EmptyCartContentModel;)Lfo2/h;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "o",
        "()Ljb1/a;",
        "cartReducer",
        "universal-checkout_release"
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

    new-instance v0, Lej1/n;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lej1/n;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Leo2/b;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;
    .locals 0

    invoke-static {p0}, Leo2/b;->m(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/ShippingProgressBarModel;)Lsz0/b1;
    .locals 0

    invoke-static {p0}, Leo2/b;->n(Lcom/whoop/design/models/items/ShippingProgressBarModel;)Lsz0/b1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;)Lfo2/d;
    .locals 0

    invoke-static {p0}, Leo2/b;->j(Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;)Lfo2/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Leo2/b;->h(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;)Lio2/k;
    .locals 0

    invoke-static {p0}, Leo2/b;->l(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;)Lio2/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/whoop/universalcheckout/features/cart/domain/models/items/EmptyCartContentModel;)Lfo2/h;
    .locals 0

    invoke-static {p0}, Leo2/b;->k(Lcom/whoop/universalcheckout/features/cart/domain/models/items/EmptyCartContentModel;)Lfo2/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Leo2/b;->i(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lej1/n;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lej1/n;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lej1/n;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lej1/n;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Leo2/b$a;

    invoke-direct {v3, v0}, Leo2/b$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lej1/n;

    const/16 v2, 0x17

    invoke-direct {v0, v2}, Lej1/n;-><init>(I)V

    const-class v2, Lcom/whoop/universalcheckout/features/cart/domain/models/items/EmptyCartContentModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Leo2/b$b;

    invoke-direct {v3, v0}, Leo2/b$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lej1/n;

    const/16 v2, 0x18

    invoke-direct {v0, v2}, Lej1/n;-><init>(I)V

    const-class v2, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Leo2/b$c;

    invoke-direct {v3, v0}, Leo2/b$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lej1/n;

    const/16 v2, 0x19

    invoke-direct {v0, v2}, Lej1/n;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/items/CardButtonModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Leo2/b$d;

    invoke-direct {v3, v0}, Leo2/b$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lej1/n;

    const/16 v2, 0x1a

    invoke-direct {v0, v2}, Lej1/n;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/items/ShippingProgressBarModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Leo2/b$e;

    invoke-direct {v2, v0}, Leo2/b$e;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;)Lfo2/d;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Leo2/b;->p(Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;)Lfo2/d;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Lcom/whoop/universalcheckout/features/cart/domain/models/items/EmptyCartContentModel;)Lfo2/h;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Leo2/b;->q(Lcom/whoop/universalcheckout/features/cart/domain/models/items/EmptyCartContentModel;)Lfo2/h;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;)Lio2/k;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lmn2/a;->u(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;)Lio2/k;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;
    .locals 2

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Llb1/d4;->l(Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;ILjava/lang/Object;)Lny0/h;

    move-result-object p0

    return-object p0
.end method

.method private static final n(Lcom/whoop/design/models/items/ShippingProgressBarModel;)Lsz0/b1;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/k4;->a(Lcom/whoop/design/models/items/ShippingProgressBarModel;)Lsz0/b1;

    move-result-object p0

    return-object p0
.end method

.method public static final o()Ljb1/a;
    .locals 1

    sget-object v0, Leo2/b;->a:Ljb1/a;

    return-object v0
.end method

.method public static final p(Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;)Lfo2/d;
    .locals 18

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->getImage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v5

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v0

    move-object v4, v0

    goto :goto_1

    :cond_1
    move-object v4, v5

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->getStackedImages()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    check-cast v0, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v0, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-static {v7}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    move-object v6, v5

    :cond_3
    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->getPrice()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->getStrikethroughPrice()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_4

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    :cond_4
    move-object v7, v5

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->getQuantity()I

    move-result v8

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->getMinQuantity()I

    move-result v9

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->getMaxQuantity()I

    move-result v10

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->getMinQuantity()I

    move-result v5

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->getMaxQuantity()I

    move-result v11

    if-ne v5, v11, :cond_5

    const/4 v5, 0x1

    :goto_3
    move v11, v5

    goto :goto_4

    :cond_5
    const/4 v5, 0x0

    goto :goto_3

    :goto_4
    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->getHideQuantity()Z

    move-result v12

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->getLineItemId()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->getAnalyticsLabel()Ljava/lang/String;

    move-result-object v14

    new-instance v1, Lfo2/d;

    const/4 v15, 0x0

    const/16 v16, 0x2000

    const/16 v17, 0x0

    move-object v5, v6

    move-object v6, v0

    invoke-direct/range {v1 .. v17}, Lfo2/d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIIZZLjava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final q(Lcom/whoop/universalcheckout/features/cart/domain/models/items/EmptyCartContentModel;)Lfo2/h;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lfo2/h;

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/cart/domain/models/items/EmptyCartContentModel;->getIcon()Lgz0/m0;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/cart/domain/models/items/EmptyCartContentModel;->getText()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lfo2/h;-><init>(Lgz0/m0;Lcom/whoop/design/util/TextResource;)V

    return-object v0
.end method
