.class public abstract Lu22/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;",
        "",
        "b",
        "(Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;)Z",
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
.method public static final synthetic a(Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;)Z
    .locals 0

    invoke-static {p0}, Lu22/f;->b(Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;)Z

    move-result p0

    return p0
.end method

.method private static final b(Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;)Z
    .locals 3

    invoke-virtual {p0}, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->getSections()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementSectionModel;

    invoke-virtual {v1}, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementSectionModel;->getItems()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;

    if-eqz v2, :cond_1

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-static {p0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->getPaymentSheetMetadata()Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->getAutoPopUp()Z

    move-result p0

    return p0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method
