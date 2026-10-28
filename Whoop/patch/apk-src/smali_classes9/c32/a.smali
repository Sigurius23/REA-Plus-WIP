.class public abstract Lc32/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;",
        "",
        "screenName",
        "Lg32/l;",
        "d",
        "(Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;Ljava/lang/String;)Lg32/l;",
        "payments_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lc32/a;->e(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lc32/a;->f(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;)Ly71/o;
    .locals 0

    invoke-static {p0}, Lc32/a;->g(Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;)Ly71/o;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;Ljava/lang/String;)Lg32/l;
    .locals 19

    move-object/from16 v0, p1

    const-string v1, "<this>"

    move-object/from16 v2, p0

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "screenName"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lc31/m;

    const/4 v3, 0x2

    invoke-direct {v1, v3}, Lc31/m;-><init>(I)V

    invoke-static {v1}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v1

    invoke-virtual {v2}, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->getHeader()Lcom/whoop/design/models/items/HeaderModel;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->getHeader()Lcom/whoop/design/models/items/HeaderModel;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v3

    instance-of v5, v3, Lp31/l;

    if-eqz v5, :cond_0

    check-cast v3, Lp31/l;

    goto :goto_0

    :cond_0
    move-object v3, v4

    :goto_0
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lp31/l;->a()Lp31/p;

    move-result-object v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "HeaderModel could not be reduced to HomeSectionHeaderState"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    move-object v3, v4

    :goto_1
    invoke-virtual {v2}, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->getPaymentMethodTile()Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v1

    instance-of v5, v1, Ly71/o;

    if-eqz v5, :cond_3

    check-cast v1, Ly71/o;

    goto :goto_2

    :cond_3
    move-object v1, v4

    :goto_2
    if-eqz v1, :cond_9

    invoke-virtual {v2}, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->getPaymentSheetMetadata()Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->getDefaultBillingDetails()Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;

    move-result-object v6

    invoke-virtual {v2}, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->getAcceptedPaymentMethods()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    move-object v7, v5

    new-instance v5, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v2, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v5, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v10, v8

    check-cast v10, Ljava/lang/String;

    new-instance v9, Lkd1/o$c;

    const/16 v14, 0xe

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    invoke-virtual {v7}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->getStripePublishableKey()Ljava/lang/String;

    move-result-object v2

    new-instance v8, Lg32/f;

    invoke-virtual {v7}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->getSetupIntentConfiguration()Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;->getCurrencyCode()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->getSetupIntentConfiguration()Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;

    move-result-object v10

    invoke-virtual {v10}, Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;->getFutureUse()Ljava/lang/String;

    move-result-object v10

    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v10, v11}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "toUpperCase(...)"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "ON_SESSION"

    invoke-virtual {v10, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    sget-object v10, Lh20/t2;->w:Lh20/t2;

    goto :goto_4

    :cond_5
    const-string v11, "OFF_SESSION"

    invoke-virtual {v10, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    sget-object v10, Lh20/t2;->x:Lh20/t2;

    :goto_4
    invoke-virtual {v7}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->getPaymentMethodConfigurationId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->getPaymentSheetConfiguration()Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;

    move-result-object v12

    invoke-virtual {v12}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;->getPaymentMethodTypes()Ljava/util/List;

    move-result-object v14

    const/16 v15, 0x18

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v8 .. v16}, Lg32/f;-><init>(Ljava/lang/String;Lh20/t2;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v11, Lg32/c;

    invoke-virtual {v7}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->getPaymentSheetConfiguration()Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;->getCustomer()Lcom/whoop/payments/stripebottomsheettile/model/Customer;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/payments/stripebottomsheettile/model/Customer;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->getPaymentSheetConfiguration()Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;

    move-result-object v10

    invoke-virtual {v10}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;->getCustomer()Lcom/whoop/payments/stripebottomsheettile/model/Customer;

    move-result-object v10

    invoke-virtual {v10}, Lcom/whoop/payments/stripebottomsheettile/model/Customer;->getCustomerSessionClientSecret()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v11, v9, v10}, Lg32/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;->getAddress()Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingAddress;

    move-result-object v9

    if-eqz v9, :cond_6

    new-instance v12, Lg32/a;

    invoke-virtual {v9}, Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingAddress;->getCity()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v9}, Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingAddress;->getCountry()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v9}, Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingAddress;->getLine1()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v9}, Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingAddress;->getLine2()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v9}, Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingAddress;->getPostalCode()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v9}, Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingAddress;->getState()Ljava/lang/String;

    move-result-object v18

    invoke-direct/range {v12 .. v18}, Lg32/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :cond_6
    move-object v12, v4

    :goto_5
    invoke-virtual {v6}, Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;->getEmail()Ljava/lang/String;

    move-result-object v6

    new-instance v9, Lg32/b;

    invoke-direct {v9, v12, v6, v4, v4}, Lg32/b;-><init>(Lg32/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v12, v9

    goto :goto_6

    :cond_7
    move-object v12, v4

    :goto_6
    invoke-virtual {v7}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->getSetupIntentConfiguration()Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;->getCtaText()Ljava/lang/String;

    move-result-object v14

    new-instance v9, Lg32/e;

    const-string v10, "WHOOP"

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v14}, Lg32/e;-><init>(Ljava/lang/String;Lg32/c;Lg32/b;Lg32/d;Ljava/lang/String;)V

    new-instance v6, Lg32/m;

    invoke-direct {v6, v2, v8, v9, v0}, Lg32/m;-><init>(Ljava/lang/String;Lg32/f;Lg32/e;Ljava/lang/String;)V

    invoke-virtual {v7}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->getAutoPopUp()Z

    move-result v7

    new-instance v2, Lg32/l;

    move-object v4, v1

    invoke-direct/range {v2 .. v7}, Lg32/l;-><init>(Lp31/p;Ly71/o;Ljava/util/List;Lg32/m;Z)V

    return-object v2

    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v7}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->getSetupIntentConfiguration()Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;->getFutureUse()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Unknown setupFutureUse value: "

    invoke-static {v2, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "PaymentMethodMenuTileModel could not be reduced to MenuItemState"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final e(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lc31/m;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lc31/m;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lc31/m;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lc31/m;-><init>(I)V

    const-class v1, Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lc32/a$d;

    invoke-direct {v2, v0}, Lc32/a$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;)Ly71/o;
    .locals 31

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;->getPaymentMethodImageUrl()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v6, Lkd1/o$c;

    invoke-virtual {v1}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;->getPaymentMethodImageUrl()Ljava/lang/String;

    move-result-object v7

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v0, Li2/x;->o:I

    sget-wide v3, Li2/x;->n:J

    invoke-static {v3, v4}, Ly81/g;->b(J)Ly81/e;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;->getSuffixTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v1}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;->getRightIcon()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lgz0/n0;->a(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    new-instance v2, Lkd1/o$a;

    invoke-direct {v2, v0}, Lkd1/o$a;-><init>(I)V

    :cond_1
    move-object v11, v2

    sget-object v0, Lc32/a$a;->w:Lc32/a$a;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v12

    new-instance v9, Ly71/l$c;

    const/16 v19, 0xec3

    const/16 v20, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v30, v9

    move-object v9, v6

    move-object/from16 v6, v30

    invoke-direct/range {v6 .. v20}, Ly71/l$c;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;Lkd1/o;Ly81/e;Lkd1/o;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Ly71/o;

    const/4 v4, 0x0

    move-object v9, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x7fdd

    invoke-direct/range {v3 .. v20}, Ly71/o;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLy71/l;ZLy81/e;Lf0/t;Lcom/whoop/navigation/e;ZLy71/q;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_2
    :goto_0
    sget-object v4, Ly71/o;->p:Ly71/o$c;

    invoke-virtual {v1}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;->getLeftIcon()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x2

    if-eqz v0, :cond_3

    new-instance v6, Ly71/g;

    sget-object v7, Lgz0/m0;->CREDIT_CARD:Lgz0/m0;

    invoke-static {v0, v7}, Lgz0/n0;->e(Ljava/lang/String;Lgz0/m0;)I

    move-result v0

    invoke-direct {v6, v0, v2, v3, v2}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v10, v6

    goto :goto_1

    :cond_3
    move-object v10, v2

    :goto_1
    sget-object v0, Lc32/a$b;->w:Lc32/a$b;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;->getSuffixTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-virtual {v1}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;->getSuffixTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_5

    :cond_4
    invoke-virtual {v1}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;->getRightIcon()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_5

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    :goto_2
    move/from16 v22, v0

    goto :goto_4

    :cond_6
    :goto_3
    const/4 v0, 0x1

    goto :goto_2

    :goto_4
    invoke-virtual {v1}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;->getRightIcon()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lgz0/n0;->a(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    new-instance v1, Ly71/g;

    invoke-direct {v1, v0, v2, v3, v2}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v12, v1

    goto :goto_5

    :cond_7
    move-object v12, v2

    :goto_5
    sget-object v0, Lc32/a$c;->w:Lc32/a$c;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v13

    const v28, 0x7df61e

    const/16 v29, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v4 .. v29}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v0

    return-object v0
.end method
