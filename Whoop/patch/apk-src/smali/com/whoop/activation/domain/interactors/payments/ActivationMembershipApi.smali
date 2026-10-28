.class public interface abstract Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00052\u0014\u0008\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0008H\u00a7@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001c\u0010\u0010\u001a\u00020\u000f2\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00a7@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J \u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00132\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0012H\u00a7@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J \u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00132\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0017H\u00a7@\u00a2\u0006\u0004\u0008\u0015\u0010\u0018\u00a8\u0006\u0019\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;",
        "",
        "",
        "",
        "body",
        "Lcom/whoop/membership/extensions/domain/models/ProgressContent;",
        "placeOrder",
        "(Ljava/util/Map;Lq83/d;)Ljava/lang/Object;",
        "Lkotlinx/serialization/json/JsonObject;",
        "placeOrderV2",
        "(Lkotlinx/serialization/json/JsonObject;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/activation/domain/models/steps/OrderDetails;",
        "getOrderDetails",
        "(Lq83/d;)Ljava/lang/Object;",
        "flow",
        "Lcom/whoop/activation/domain/models/steps/FinalizedUpcycleDetails;",
        "getUpcycleDetails",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/activation/domain/models/steps/StripeTokenRequest;",
        "Lpg3/v0;",
        "Ll83/a0;",
        "savePaymentMethod",
        "(Lcom/whoop/activation/domain/models/steps/StripeTokenRequest;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/activation/domain/models/steps/PaymenthMethodRequest;",
        "(Lcom/whoop/activation/domain/models/steps/PaymenthMethodRequest;Lq83/d;)Ljava/lang/Object;",
        "activation_release"
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
.method public abstract getOrderDetails(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/activation/domain/models/steps/OrderDetails;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "membership-service/v1/upcycle/onboarding/order-details"
    .end annotation
.end method

.method public abstract getUpcycleDetails(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "flow"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/activation/domain/models/steps/FinalizedUpcycleDetails;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "membership-service/v2/upcycle/onboarding/finalizedContent"
    .end annotation
.end method

.method public abstract placeOrder(Ljava/util/Map;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/util/Map;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lq83/d<",
            "Lcom/whoop/membership/extensions/domain/models/ProgressContent;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "membership-service/v1/extensions/native-checkout"
    .end annotation
.end method

.method public abstract placeOrderV2(Lkotlinx/serialization/json/JsonObject;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lkotlinx/serialization/json/JsonObject;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/serialization/json/JsonObject;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/membership/extensions/domain/models/ProgressContent;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "membership-service/v1/extensions/native-checkout"
    .end annotation
.end method

.method public abstract savePaymentMethod(Lcom/whoop/activation/domain/models/steps/PaymenthMethodRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/activation/domain/models/steps/PaymenthMethodRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/activation/domain/models/steps/PaymenthMethodRequest;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "membership-service/v2/payment/default"
    .end annotation
.end method

.method public abstract savePaymentMethod(Lcom/whoop/activation/domain/models/steps/StripeTokenRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/activation/domain/models/steps/StripeTokenRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/activation/domain/models/steps/StripeTokenRequest;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "membership-service/v1/payment/default"
    .end annotation
.end method
