.class public abstract Lwn2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\"\u001a\u0010\r\u001a\u00020\u00088\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;",
        "Lxn2/g;",
        "m",
        "(Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;)Lxn2/g;",
        "Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoModel;",
        "Lxn2/c;",
        "l",
        "(Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoModel;)Lxn2/c;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "k",
        "()Ljb1/a;",
        "buyNowDesignItemReducer",
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

    new-instance v0, Lwd3/b;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lwd3/b;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lwn2/d;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;)Lio2/h;
    .locals 0

    invoke-static {p0}, Lwn2/d;->j(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;)Lio2/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoModel;)Lxn2/c;
    .locals 0

    invoke-static {p0}, Lwn2/d;->i(Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoModel;)Lxn2/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lwn2/d;->f(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lwn2/d;->g(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;)Lxn2/g;
    .locals 0

    invoke-static {p0}, Lwn2/d;->h(Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;)Lxn2/g;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwd3/b;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lwd3/b;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwd3/b;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lwd3/b;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lwn2/d$a;

    invoke-direct {v3, v0}, Lwn2/d$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lwd3/b;

    const/16 v2, 0x11

    invoke-direct {v0, v2}, Lwd3/b;-><init>(I)V

    const-class v2, Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lwn2/d$b;

    invoke-direct {v3, v0}, Lwn2/d$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lwd3/b;

    const/16 v2, 0x12

    invoke-direct {v0, v2}, Lwd3/b;-><init>(I)V

    const-class v2, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lwn2/d$c;

    invoke-direct {v2, v0}, Lwn2/d$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;)Lxn2/g;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lwn2/d;->m(Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;)Lxn2/g;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoModel;)Lxn2/c;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lwn2/d;->l(Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoModel;)Lxn2/c;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;)Lio2/h;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lmn2/a;->t(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;)Lio2/h;

    move-result-object p0

    return-object p0
.end method

.method public static final k()Ljb1/a;
    .locals 1

    sget-object v0, Lwn2/d;->a:Ljb1/a;

    return-object v0
.end method

.method public static final l(Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoModel;)Lxn2/c;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoModel;->getTotalLabel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoModel;->getTotalAmount()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoModel;->getCta()Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoCtaModel;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoCtaModel;->getTextDisplay()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    const-string v0, ""

    :cond_1
    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoModel;->getCta()Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoCtaModel;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoCtaModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v5

    sget-object v6, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    move-object v5, v0

    goto :goto_1

    :cond_2
    move-object v5, v1

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoModel;->getDisclaimerText()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    new-instance v1, Lxn2/c;

    invoke-direct/range {v1 .. v6}, Lxn2/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;)V

    return-object v1
.end method

.method public static final m(Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;)Lxn2/g;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;->getImage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v5, 0x0

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v5

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v5

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;->getStackedImages()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_5

    check-cast v1, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ljava/lang/String;

    invoke-static {v7}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_2

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v5, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-static {v6}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v6

    invoke-interface {v1, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    move-object v6, v1

    goto :goto_4

    :cond_5
    move-object v6, v5

    :goto_4
    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;->getLineItemId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;->getAnalyticsLabel()Ljava/lang/String;

    move-result-object v8

    new-instance v1, Lxn2/g;

    move-object v5, v0

    invoke-direct/range {v1 .. v8}, Lxn2/g;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method
