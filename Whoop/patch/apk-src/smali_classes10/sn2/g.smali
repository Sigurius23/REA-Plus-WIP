.class public final Lsn2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsn2/g$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0014\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lsn2/g;",
        "",
        "Lad3/c;",
        "json",
        "<init>",
        "(Lad3/c;)V",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "interaction",
        "Lsn2/f;",
        "c",
        "(Lcom/whoop/navigation/models/GenericInteraction;)Lsn2/f;",
        "Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;",
        "response",
        "d",
        "(Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;)Lsn2/f;",
        "",
        "field",
        "Lsn2/f$b;",
        "a",
        "(Ljava/lang/String;)Lsn2/f$b;",
        "b",
        "Lad3/c;",
        "universal-checkout_release"
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
.field private static final b:Lsn2/g$a;

.field public static final c:I


# instance fields
.field private final a:Lad3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsn2/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lsn2/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lsn2/g;->b:Lsn2/g$a;

    const/16 v0, 0x8

    sput v0, Lsn2/g;->c:I

    return-void
.end method

.method public constructor <init>(Lad3/c;)V
    .locals 1

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsn2/g;->a:Lad3/c;

    return-void
.end method

.method private final a(Ljava/lang/String;)Lsn2/f$b;
    .locals 2

    new-instance v0, Lsn2/f$b;

    const-string v1, "sheet response is missing "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lsn2/f$b;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method private final c(Lcom/whoop/navigation/models/GenericInteraction;)Lsn2/f;
    .locals 5

    iget-object v0, p0, Lsn2/g;->a:Lad3/c;

    invoke-static {p1, v0}, Lcom/whoop/design/models/modal/GenericInteractionDecoderKt;->toDecodedGenericInteraction(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/design/models/modal/DecodedGenericInteraction;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lcom/whoop/design/models/modal/DecodedGenericInteraction;->getNavigation()Lcom/whoop/navigation/e;

    move-result-object p1

    if-nez p1, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    sget-object v1, Lcom/whoop/navigation/AppScreen$h1;->w:Lcom/whoop/navigation/AppScreen$h1;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lsn2/f$b;

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unexpected navigation target "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lsn2/f$b;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_1
    invoke-virtual {p1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v0

    instance-of v1, v0, Lcom/whoop/navigation/CheckoutWithCartScreenModel;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast v0, Lcom/whoop/navigation/CheckoutWithCartScreenModel;

    goto :goto_0

    :cond_2
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_3

    new-instance p1, Lsn2/f$b;

    const-string v0, "CHECKOUT_WITH_CART without checkout parameters"

    invoke-direct {p1, v0}, Lsn2/f$b;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_3
    invoke-virtual {v0}, Lcom/whoop/navigation/CheckoutWithCartScreenModel;->getPayload()Lcom/whoop/navigation/CheckoutWithCartPayload;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/whoop/navigation/CheckoutWithCartPayload;->getCartId()Ljava/lang/String;

    move-result-object v2

    :cond_4
    if-eqz v2, :cond_9

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v0}, Lcom/whoop/navigation/CheckoutWithCartScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lmn2/b;->BUY_NOW_WITH_CART:Lmn2/b;

    invoke-virtual {v3}, Lmn2/b;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    new-instance p1, Lsn2/f$b;

    invoke-virtual {v0}, Lcom/whoop/navigation/CheckoutWithCartScreenModel;->getSource()Ljava/lang/String;

    move-result-object v0

    const-string v1, "CHECKOUT_WITH_CART with source "

    invoke-static {v1, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lsn2/f$b;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_6
    invoke-virtual {v0}, Lcom/whoop/navigation/CheckoutWithCartScreenModel;->getMethod()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_1

    :cond_7
    invoke-virtual {v0}, Lcom/whoop/navigation/CheckoutWithCartScreenModel;->getMethod()Ljava/lang/String;

    move-result-object v1

    const-string v3, "GET"

    const/4 v4, 0x1

    invoke-static {v1, v3, v4}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_8

    new-instance p1, Lsn2/f$b;

    invoke-virtual {v0}, Lcom/whoop/navigation/CheckoutWithCartScreenModel;->getMethod()Ljava/lang/String;

    move-result-object v0

    const-string v1, "CHECKOUT_WITH_CART with method "

    invoke-static {v1, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lsn2/f$b;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_8
    :goto_1
    new-instance v0, Lsn2/f$a;

    invoke-direct {v0, p1, v2}, Lsn2/f$a;-><init>(Lcom/whoop/navigation/e;Ljava/lang/String;)V

    return-object v0

    :cond_9
    :goto_2
    new-instance p1, Lsn2/f$b;

    const-string v0, "CHECKOUT_WITH_CART without a cart id"

    invoke-direct {p1, v0}, Lsn2/f$b;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_a
    :goto_3
    new-instance p1, Lsn2/f$b;

    const-string v0, "navigation could not be decoded"

    invoke-direct {p1, v0}, Lsn2/f$b;-><init>(Ljava/lang/String;)V

    return-object p1
.end method

.method private final d(Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;)Lsn2/f;
    .locals 7

    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->getTitle()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string p1, "title"

    invoke-direct {p0, p1}, Lsn2/g;->a(Ljava/lang/String;)Lsn2/f$b;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->getSections()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    const-string p1, "sections"

    invoke-direct {p0, p1}, Lsn2/g;->a(Ljava/lang/String;)Lsn2/f$b;

    move-result-object p1

    return-object p1

    :cond_1
    move-object v2, v0

    check-cast v2, Ljava/util/List;

    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->getCheckoutFooter()Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;

    move-result-object v3

    if-nez v3, :cond_2

    const-string p1, "checkout_footer"

    invoke-direct {p0, p1}, Lsn2/g;->a(Ljava/lang/String;)Lsn2/f$b;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->getAnalyticsSubtotalValue()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_3

    const-string p1, "analytics_subtotal_value"

    invoke-direct {p0, p1}, Lsn2/g;->a(Ljava/lang/String;)Lsn2/f$b;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->getCheckoutDestination()Lcom/whoop/navigation/e;

    move-result-object v5

    if-nez v5, :cond_4

    const-string p1, "checkout_destination"

    invoke-direct {p0, p1}, Lsn2/g;->a(Ljava/lang/String;)Lsn2/f$b;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->getPaymentMethodId()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_5

    const-string p1, "payment_method_id"

    invoke-direct {p0, p1}, Lsn2/g;->a(Ljava/lang/String;)Lsn2/f$b;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance v0, Lsn2/i;

    invoke-direct/range {v0 .. v6}, Lsn2/i;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)V

    invoke-virtual {v0}, Lsn2/i;->e()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;

    invoke-virtual {v2}, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;->getItems()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_6
    new-instance p1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v2}, Lcom/whoop/design/models/DesignSystemModelKt;->unwrap(Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_7
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_8

    goto/16 :goto_4

    :cond_8
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/DesignSystemModel;

    instance-of v2, v2, Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;

    if-eqz v2, :cond_9

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_3

    :cond_a
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/DesignSystemModel;

    instance-of v1, v1, Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoModel;

    if-eqz v1, :cond_b

    invoke-virtual {v0}, Lsn2/i;->c()Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;->getItems()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of v1, p1, Ljava/util/Collection;

    if-eqz v1, :cond_c

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_2

    :cond_c
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1}, Lcom/whoop/design/models/DesignSystemModelKt;->unwrap(Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v1

    instance-of v1, v1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;

    if-eqz v1, :cond_d

    new-instance p1, Lsn2/f$c;

    invoke-direct {p1, v0}, Lsn2/f$c;-><init>(Lsn2/i;)V

    return-object p1

    :cond_e
    :goto_2
    const-string p1, "a CHECKOUT_FOOTER"

    invoke-direct {p0, p1}, Lsn2/g;->a(Ljava/lang/String;)Lsn2/f$b;

    move-result-object p1

    return-object p1

    :cond_f
    :goto_3
    const-string p1, "a BUY_NOW_CHECKOUT_INFO"

    invoke-direct {p0, p1}, Lsn2/g;->a(Ljava/lang/String;)Lsn2/f$b;

    move-result-object p1

    return-object p1

    :cond_10
    :goto_4
    const-string p1, "a BUY_NOW_ITEM"

    invoke-direct {p0, p1}, Lsn2/g;->a(Ljava/lang/String;)Lsn2/f$b;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final b(Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;)Lsn2/f;
    .locals 2

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->getGenericInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/navigation/models/GenericInteraction;->getNavigation()Lkotlinx/serialization/json/JsonElement;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    invoke-direct {p0, v0}, Lsn2/g;->c(Lcom/whoop/navigation/models/GenericInteraction;)Lsn2/f;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-direct {p0, p1}, Lsn2/g;->d(Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;)Lsn2/f;

    move-result-object p1

    return-object p1
.end method
