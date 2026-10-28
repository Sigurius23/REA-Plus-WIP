.class public interface abstract Lcom/whoop/universalcheckout/features/checkout/domain/CheckoutApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J$\u0010\n\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0001\u0010\t\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00042\u0008\u0008\u0001\u0010\r\u001a\u00020\u000cH\u00a7@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ*\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u00072\u0008\u0008\u0001\u0010\r\u001a\u00020\u0011H\u00a7@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/universalcheckout/features/checkout/domain/CheckoutApi;",
        "",
        "Lcom/whoop/universalcheckout/features/checkout/domain/models/ApplyPromoCodeRequest;",
        "applyPromoCodeBody",
        "Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;",
        "applyPromoCode",
        "(Lcom/whoop/universalcheckout/features/checkout/domain/models/ApplyPromoCodeRequest;Lq83/d;)Ljava/lang/Object;",
        "",
        "cartId",
        "codeId",
        "removePromoCodeById",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/universalcheckout/features/checkout/domain/models/SwitchAnnualCheckboxRequest;",
        "body",
        "toggleAnnualCheckbox",
        "(Lcom/whoop/universalcheckout/features/checkout/domain/models/SwitchAnnualCheckboxRequest;Lq83/d;)Ljava/lang/Object;",
        "url",
        "Lcom/whoop/universalcheckout/features/checkout/domain/models/ProcessCheckoutRequestBody;",
        "Lpg3/v0;",
        "Ll83/a0;",
        "processNoStripeCheckout",
        "(Ljava/lang/String;Lcom/whoop/universalcheckout/features/checkout/domain/models/ProcessCheckoutRequestBody;Lq83/d;)Ljava/lang/Object;",
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


# virtual methods
.method public abstract applyPromoCode(Lcom/whoop/universalcheckout/features/checkout/domain/models/ApplyPromoCodeRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/universalcheckout/features/checkout/domain/models/ApplyPromoCodeRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/universalcheckout/features/checkout/domain/models/ApplyPromoCodeRequest;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "commerce-service/v2/mobile/carts/applyCodeToCart"
    .end annotation
.end method

.method public abstract processNoStripeCheckout(Ljava/lang/String;Lcom/whoop/universalcheckout/features/checkout/domain/models/ProcessCheckoutRequestBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/y;
        .end annotation
    .end param
    .param p2    # Lcom/whoop/universalcheckout/features/checkout/domain/models/ProcessCheckoutRequestBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/universalcheckout/features/checkout/domain/models/ProcessCheckoutRequestBody;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
    .end annotation
.end method

.method public abstract removePromoCodeById(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "cartId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "codeId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "commerce-service/v2/mobile/carts/{cartId}/codes/{codeId}"
    .end annotation
.end method

.method public abstract toggleAnnualCheckbox(Lcom/whoop/universalcheckout/features/checkout/domain/models/SwitchAnnualCheckboxRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/universalcheckout/features/checkout/domain/models/SwitchAnnualCheckboxRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/universalcheckout/features/checkout/domain/models/SwitchAnnualCheckboxRequest;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "commerce-service/v2/mobile/carts/switch-to-annual-billing"
    .end annotation
.end method
