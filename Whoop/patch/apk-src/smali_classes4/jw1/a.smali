.class public final Ljw1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J#\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00062\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0000\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Ljw1/a;",
        "",
        "Lew1/a;",
        "analytics",
        "<init>",
        "(Lew1/a;)V",
        "",
        "Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;",
        "list",
        "Llw1/i;",
        "a",
        "(Ljava/util/List;)Ljava/util/List;",
        "Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;",
        "promoCode",
        "Llw1/k;",
        "c",
        "(Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;)Llw1/k;",
        "Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;",
        "paymentOptions",
        "Lcom/whoop/payments/domain/models/Card;",
        "card",
        "Llw1/j;",
        "b",
        "(Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;Lcom/whoop/payments/domain/models/Card;)Llw1/j;",
        "Lfw1/c;",
        "domainResult",
        "Liw1/i;",
        "d",
        "(Lfw1/c;)Liw1/i;",
        "Lew1/a;",
        "membership_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lew1/a;


# direct methods
.method public constructor <init>(Lew1/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljw1/a;->a:Lew1/a;

    return-void
.end method

.method private final a(Ljava/util/List;)Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;",
            ">;)",
            "Ljava/util/List<",
            "Llw1/i;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;

    invoke-virtual {v2}, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->getPrice()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->getPriceSubtitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->getSelected()Z

    move-result v7

    invoke-virtual {v2}, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->getTrackingLabel()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2}, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->getDisclaimer()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->getStrikethroughPrice()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2}, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->getCtaTitle()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2}, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->getSecondaryCtaTitle()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2}, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->getCheckout()Lcom/whoop/navigation/e;

    move-result-object v13

    invoke-virtual {v2}, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->getAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v14

    invoke-virtual {v2}, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->getTag()Ljava/lang/String;

    move-result-object v15

    new-instance v3, Llw1/i;

    invoke-direct/range {v3 .. v15}, Llw1/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private final b(Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;Lcom/whoop/payments/domain/models/Card;)Llw1/j;
    .locals 3

    new-instance v0, Llw1/j;

    invoke-virtual {p1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;->getExistingLabel()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;->getAlternateLabel()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    filled-new-array {v2, p1}, [Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-static {p1}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p2}, Lcom/whoop/payments/domain/models/Card;->isEmpty()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    invoke-direct {v0, v1, p1, v2, p2}, Llw1/j;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;ILcom/whoop/payments/domain/models/Card;)V

    return-object v0
.end method

.method private final c(Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;)Llw1/k;
    .locals 9

    new-instance v0, Llw1/k;

    invoke-virtual {p1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;->getEnabled()Z

    move-result v1

    invoke-virtual {p1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;->getStatusText()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lor2/o1;->d(Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {p1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;->getExpandedInputTitle()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;->getInputTitle()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;->getApplyCtaText()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {p1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;->getPromoCode()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;->getStatusText()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {p1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;->getStatus()Ljava/lang/String;

    move-result-object p1

    const-string v8, "error"

    invoke-static {p1, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    sget-object p1, Ly81/f;->ACCENT_ALERT:Ly81/f;

    :goto_0
    move-object v8, p1

    goto :goto_1

    :cond_0
    const-string v8, "success"

    invoke-static {p1, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Ly81/f;->ACCENT_ACTION:Ly81/f;

    goto :goto_0

    :cond_1
    sget-object p1, Ly81/f;->ACCENT_ALERT:Ly81/f;

    goto :goto_0

    :goto_1
    invoke-direct/range {v0 .. v8}, Llw1/k;-><init>(ZZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ly81/f;)V

    return-object v0
.end method


# virtual methods
.method public final d(Lfw1/c;)Liw1/i;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "domainResult"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v1, Lfw1/g;

    const/16 v3, 0xa

    if-eqz v2, :cond_5

    move-object v2, v1

    check-cast v2, Lfw1/g;

    invoke-virtual {v2}, Lfw1/g;->a()Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v1, Liw1/k$b;->a:Liw1/k$b;

    return-object v1

    :cond_0
    invoke-virtual {v2}, Lfw1/g;->isError()Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v1, Liw1/k$a;->a:Liw1/k$a;

    return-object v1

    :cond_1
    invoke-interface {v1}, Lfw1/c;->b()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v2}, Lfw1/g;->g()Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v2}, Lfw1/g;->g()Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->getSegments()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v2}, Lfw1/g;->e()I

    move-result v4

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellSegment;

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellSegment;->getSections()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v10, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/membership/extensions/domain/models/SectionItems;

    new-instance v5, Liw1/k$c;

    invoke-static {}, Lkx1/c;->i()Ljb1/a;

    move-result-object v6

    invoke-virtual {v4}, Lcom/whoop/membership/extensions/domain/models/SectionItems;->getItems()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    invoke-direct {v5, v4}, Liw1/k$c;-><init>(Ljava/util/List;)V

    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Lfw1/g;->g()Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->getNavigationBarText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v2}, Lfw1/g;->g()Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->getTrackingLabel()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Lfw1/g;->g()Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->getTrackingValue()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2}, Lfw1/g;->e()I

    move-result v8

    invoke-virtual {v2}, Lfw1/g;->g()Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->getSegments()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v9, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellSegment;

    invoke-virtual {v2}, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellSegment;->getControlTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    new-instance v4, Liw1/k$d;

    invoke-direct/range {v4 .. v10}, Liw1/k$d;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;)V

    return-object v4

    :cond_4
    sget-object v1, Liw1/k$a;->a:Liw1/k$a;

    return-object v1

    :cond_5
    instance-of v2, v1, Lfw1/e;

    if-eqz v2, :cond_9

    check-cast v1, Lfw1/e;

    invoke-virtual {v1}, Lfw1/e;->a()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {v1}, Lfw1/e;->f()Z

    move-result v2

    if-nez v2, :cond_6

    sget-object v1, Liw1/d$b;->a:Liw1/d$b;

    return-object v1

    :cond_6
    invoke-virtual {v1}, Lfw1/e;->isError()Z

    move-result v2

    if-eqz v2, :cond_7

    sget-object v1, Liw1/d$a;->a:Liw1/d$a;

    return-object v1

    :cond_7
    invoke-virtual {v1}, Lfw1/e;->e()Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingResponse;

    move-result-object v2

    if-eqz v2, :cond_8

    new-instance v2, Liw1/d$c;

    invoke-virtual {v1}, Lfw1/e;->e()Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingResponse;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingResponse;->getHeader()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v1}, Lfw1/e;->e()Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingResponse;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingResponse;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v1}, Lfw1/e;->e()Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingResponse;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingResponse;->getSubtitle()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v1}, Lfw1/e;->e()Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingResponse;->getOptions()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljw1/a;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v2, v3, v4, v5, v1}, Liw1/d$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    return-object v2

    :cond_8
    sget-object v1, Liw1/d$b;->a:Liw1/d$b;

    return-object v1

    :cond_9
    instance-of v2, v1, Lfw1/a;

    const/4 v4, 0x0

    if-eqz v2, :cond_1a

    move-object v2, v1

    check-cast v2, Lfw1/a;

    invoke-virtual {v2}, Lfw1/a;->a()Z

    move-result v5

    if-eqz v5, :cond_c

    new-instance v6, Liw1/b$b;

    invoke-virtual {v2}, Lfw1/a;->l()Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;->getLoadingProgressContent()Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    move-result-object v1

    move-object v7, v1

    goto :goto_2

    :cond_a
    move-object v7, v4

    :goto_2
    invoke-virtual {v2}, Lfw1/a;->f()Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->getPromoCode()Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;->getPromoCode()Ljava/lang/String;

    move-result-object v4

    :cond_b
    move-object v8, v4

    invoke-virtual {v2}, Lfw1/a;->i()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2}, Lfw1/a;->h()Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    invoke-direct/range {v6 .. v11}, Liw1/b$b;-><init>(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;)V

    return-object v6

    :cond_c
    invoke-virtual {v2}, Lfw1/a;->isError()Z

    move-result v5

    if-eqz v5, :cond_f

    iget-object v1, v0, Ljw1/a;->a:Lew1/a;

    invoke-virtual {v2}, Lfw1/a;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lew1/a;->r(Ljava/lang/String;)V

    new-instance v5, Liw1/b$a;

    invoke-virtual {v2}, Lfw1/a;->l()Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;

    move-result-object v1

    if-eqz v1, :cond_d

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;->getGenericErrorProgressContent()Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    move-result-object v1

    move-object v6, v1

    goto :goto_3

    :cond_d
    move-object v6, v4

    :goto_3
    invoke-virtual {v2}, Lfw1/a;->f()Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;

    move-result-object v1

    if-eqz v1, :cond_e

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->getPromoCode()Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;

    move-result-object v1

    if-eqz v1, :cond_e

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;->getPromoCode()Ljava/lang/String;

    move-result-object v4

    :cond_e
    move-object v7, v4

    invoke-virtual {v2}, Lfw1/a;->i()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lfw1/a;->h()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2}, Lfw1/a;->k()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    move-result-object v10

    invoke-direct/range {v5 .. v10}, Liw1/b$a;-><init>(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;)V

    return-object v5

    :cond_f
    invoke-interface {v1}, Lfw1/c;->b()Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-virtual {v2}, Lfw1/a;->f()Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;

    move-result-object v1

    if-eqz v1, :cond_17

    iget-object v1, v0, Ljw1/a;->a:Lew1/a;

    invoke-virtual {v2}, Lfw1/a;->i()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lew1/a;->s(Ljava/lang/String;)V

    invoke-virtual {v2}, Lfw1/a;->k()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    move-result-object v1

    if-eqz v1, :cond_10

    iget-object v1, v0, Ljw1/a;->a:Lew1/a;

    invoke-virtual {v1}, Lew1/a;->t()V

    :cond_10
    invoke-virtual {v2}, Lfw1/a;->f()Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Lfw1/a;->f()Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->getPaymentOptions()Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;

    move-result-object v1

    invoke-virtual {v2}, Lfw1/a;->e()Lcom/whoop/payments/domain/models/Card;

    move-result-object v5

    invoke-direct {v0, v1, v5}, Ljw1/a;->b(Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;Lcom/whoop/payments/domain/models/Card;)Llw1/j;

    move-result-object v7

    invoke-virtual {v2}, Lfw1/a;->f()Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->getOrderDetails()Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;

    move-result-object v8

    invoke-virtual {v2}, Lfw1/a;->f()Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->getOrderOptions()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v9, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_14

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/membership/extensions/domain/models/OrderOption;

    invoke-virtual {v2}, Lfw1/a;->g()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_11
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_12

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Lcom/whoop/membership/extensions/domain/models/OrderOption;

    invoke-virtual {v11}, Lcom/whoop/membership/extensions/domain/models/OrderOption;->getParameter()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v3}, Lcom/whoop/membership/extensions/domain/models/OrderOption;->getParameter()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_11

    goto :goto_5

    :cond_12
    move-object v10, v4

    :goto_5
    check-cast v10, Lcom/whoop/membership/extensions/domain/models/OrderOption;

    if-nez v10, :cond_13

    goto :goto_6

    :cond_13
    move-object v3, v10

    :goto_6
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_14
    invoke-virtual {v2}, Lfw1/a;->f()Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->getPromoCode()Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;

    move-result-object v1

    if-eqz v1, :cond_15

    invoke-virtual {v2}, Lfw1/a;->f()Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->getPromoCode()Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;

    move-result-object v1

    invoke-direct {v0, v1}, Ljw1/a;->c(Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;)Llw1/k;

    move-result-object v1

    move-object v10, v1

    goto :goto_7

    :cond_15
    move-object v10, v4

    :goto_7
    invoke-virtual {v2}, Lfw1/a;->f()Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->getPromoCode()Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;

    move-result-object v1

    if-eqz v1, :cond_16

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;->getPromoCode()Ljava/lang/String;

    move-result-object v4

    :cond_16
    move-object v11, v4

    invoke-virtual {v2}, Lfw1/a;->f()Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->getCheckoutCtaTitle()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2}, Lfw1/a;->f()Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->getSecurityFooter()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v2}, Lfw1/a;->f()Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->getDisclaimerFooterMarkdown()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v2}, Lfw1/a;->f()Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->getPayload()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v2}, Lfw1/a;->f()Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->getCheckoutStep()Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;

    move-result-object v16

    invoke-virtual {v2}, Lfw1/a;->h()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v2}, Lfw1/a;->k()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    move-result-object v18

    invoke-virtual {v2}, Lfw1/a;->j()Ljava/util/Map;

    move-result-object v19

    new-instance v5, Liw1/b$c;

    invoke-direct/range {v5 .. v19}, Liw1/b$c;-><init>(Ljava/lang/String;Llw1/j;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;Ljava/util/List;Llw1/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Ljava/util/Map;)V

    return-object v5

    :cond_17
    iget-object v1, v0, Ljw1/a;->a:Lew1/a;

    invoke-virtual {v2}, Lfw1/a;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lew1/a;->r(Ljava/lang/String;)V

    new-instance v5, Liw1/b$a;

    invoke-virtual {v2}, Lfw1/a;->l()Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;

    move-result-object v1

    if-eqz v1, :cond_18

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;->getGenericErrorProgressContent()Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    move-result-object v1

    move-object v6, v1

    goto :goto_8

    :cond_18
    move-object v6, v4

    :goto_8
    invoke-virtual {v2}, Lfw1/a;->f()Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;

    move-result-object v1

    if-eqz v1, :cond_19

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->getPromoCode()Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;

    move-result-object v1

    if-eqz v1, :cond_19

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;->getPromoCode()Ljava/lang/String;

    move-result-object v4

    :cond_19
    move-object v7, v4

    invoke-virtual {v2}, Lfw1/a;->i()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lfw1/a;->h()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2}, Lfw1/a;->k()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    move-result-object v10

    invoke-direct/range {v5 .. v10}, Liw1/b$a;-><init>(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;)V

    return-object v5

    :cond_1a
    instance-of v2, v1, Lfw1/f;

    if-eqz v2, :cond_24

    move-object v2, v1

    check-cast v2, Lfw1/f;

    invoke-virtual {v2}, Lfw1/f;->a()Z

    move-result v3

    if-eqz v3, :cond_1d

    invoke-virtual {v2}, Lfw1/f;->i()Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    move-result-object v1

    if-nez v1, :cond_1c

    invoke-virtual {v2}, Lfw1/f;->k()Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;

    move-result-object v1

    if-eqz v1, :cond_1b

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;->getLoadingProgressContent()Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    move-result-object v4

    :cond_1b
    move-object v6, v4

    goto :goto_9

    :cond_1c
    move-object v6, v1

    :goto_9
    invoke-virtual {v2}, Lfw1/f;->e()Lcom/whoop/payments/domain/models/Card;

    move-result-object v9

    invoke-virtual {v2}, Lfw1/f;->h()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    move-result-object v12

    invoke-virtual {v2}, Lfw1/f;->j()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lfw1/f;->f()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v2}, Lfw1/f;->g()Ljava/lang/String;

    move-result-object v11

    new-instance v5, Liw1/f$b;

    const-string v7, ""

    invoke-direct/range {v5 .. v12}, Liw1/f$b;-><init>(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;Ljava/util/List;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;)V

    return-object v5

    :cond_1d
    invoke-virtual {v2}, Lfw1/f;->isError()Z

    move-result v3

    if-eqz v3, :cond_20

    invoke-virtual {v2}, Lfw1/f;->i()Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    move-result-object v1

    if-nez v1, :cond_1f

    invoke-virtual {v2}, Lfw1/f;->k()Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;

    move-result-object v1

    if-eqz v1, :cond_1e

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;->getGenericErrorProgressContent()Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    move-result-object v4

    :cond_1e
    move-object v6, v4

    goto :goto_a

    :cond_1f
    move-object v6, v1

    :goto_a
    invoke-virtual {v2}, Lfw1/f;->e()Lcom/whoop/payments/domain/models/Card;

    move-result-object v9

    invoke-virtual {v2}, Lfw1/f;->h()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    move-result-object v12

    invoke-virtual {v2}, Lfw1/f;->j()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lfw1/f;->f()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v2}, Lfw1/f;->g()Ljava/lang/String;

    move-result-object v11

    new-instance v5, Liw1/f$a;

    const/16 v14, 0x80

    const/4 v15, 0x0

    const-string v7, ""

    const/4 v13, 0x0

    invoke-direct/range {v5 .. v15}, Liw1/f$a;-><init>(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;Ljava/util/List;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5

    :cond_20
    invoke-interface {v1}, Lfw1/c;->b()Z

    move-result v1

    if-eqz v1, :cond_21

    invoke-virtual {v2}, Lfw1/f;->i()Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    move-result-object v6

    invoke-virtual {v2}, Lfw1/f;->e()Lcom/whoop/payments/domain/models/Card;

    move-result-object v9

    invoke-virtual {v2}, Lfw1/f;->h()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    move-result-object v12

    invoke-virtual {v2}, Lfw1/f;->j()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lfw1/f;->f()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v2}, Lfw1/f;->g()Ljava/lang/String;

    move-result-object v11

    new-instance v5, Liw1/f$c;

    const-string v7, ""

    invoke-direct/range {v5 .. v12}, Liw1/f$c;-><init>(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;Ljava/util/List;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;)V

    return-object v5

    :cond_21
    invoke-virtual {v2}, Lfw1/f;->i()Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    move-result-object v1

    if-nez v1, :cond_23

    invoke-virtual {v2}, Lfw1/f;->k()Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;

    move-result-object v1

    if-eqz v1, :cond_22

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;->getGenericErrorProgressContent()Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    move-result-object v4

    :cond_22
    move-object v6, v4

    goto :goto_b

    :cond_23
    move-object v6, v1

    :goto_b
    invoke-virtual {v2}, Lfw1/f;->h()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    move-result-object v12

    invoke-virtual {v2}, Lfw1/f;->j()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lfw1/f;->f()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v2}, Lfw1/f;->g()Ljava/lang/String;

    move-result-object v11

    new-instance v5, Liw1/f$a;

    const/16 v14, 0x88

    const/4 v15, 0x0

    const-string v7, ""

    const/4 v9, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v5 .. v15}, Liw1/f$a;-><init>(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;Ljava/util/List;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5

    :cond_24
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
