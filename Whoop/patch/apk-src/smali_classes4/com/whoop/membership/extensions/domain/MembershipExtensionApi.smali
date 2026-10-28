.class public interface abstract Lcom/whoop/membership/extensions/domain/MembershipExtensionApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u00020\u00042\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0010\u0010\u0008\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ$\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0001\u0010\n\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\r2\u0008\u0008\u0001\u0010\n\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0010\u0010\u0006J$\u0010\u0013\u001a\u00020\u00122\u0008\u0008\u0001\u0010\n\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u0011H\u00a7@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J$\u0010\u0016\u001a\u00020\u00122\u0008\u0008\u0001\u0010\n\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u0015H\u00a7@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/membership/extensions/domain/MembershipExtensionApi;",
        "",
        "",
        "promoCode",
        "Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingResponse;",
        "getV2Selection",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;",
        "getReactivationUpsellSelection",
        "(Lq83/d;)Ljava/lang/Object;",
        "url",
        "Lkotlinx/serialization/json/JsonObject;",
        "body",
        "Lcom/whoop/membership/extensions/domain/models/ProgressContent;",
        "placeDynamicCheckoutOrder",
        "(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lq83/d;)Ljava/lang/Object;",
        "placeDynamicFreeOrder",
        "Lcom/whoop/membership/extensions/domain/models/OrderRequestBodyV2;",
        "Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;",
        "getDynamicOrder",
        "(Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/OrderRequestBodyV2;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/membership/extensions/domain/models/OrderRequestBodyReactivations;",
        "getDynamicOrderV2",
        "(Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/OrderRequestBodyReactivations;Lq83/d;)Ljava/lang/Object;",
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


# virtual methods
.method public abstract getDynamicOrder(Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/OrderRequestBodyV2;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/y;
        .end annotation
    .end param
    .param p2    # Lcom/whoop/membership/extensions/domain/models/OrderRequestBodyV2;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/membership/extensions/domain/models/OrderRequestBodyV2;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
    .end annotation
.end method

.method public abstract getDynamicOrderV2(Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/OrderRequestBodyReactivations;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/y;
        .end annotation
    .end param
    .param p2    # Lcom/whoop/membership/extensions/domain/models/OrderRequestBodyReactivations;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/membership/extensions/domain/models/OrderRequestBodyReactivations;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
    .end annotation
.end method

.method public abstract getReactivationUpsellSelection(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "membership-service/v1/reactivations-content/upsell"
    .end annotation
.end method

.method public abstract getV2Selection(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "promoCode"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "membership-service/v3/extensions/selection"
    .end annotation
.end method

.method public abstract placeDynamicCheckoutOrder(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/y;
        .end annotation
    .end param
    .param p2    # Lkotlinx/serialization/json/JsonObject;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlinx/serialization/json/JsonObject;",
            "Lq83/d<",
            "Lcom/whoop/membership/extensions/domain/models/ProgressContent;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
    .end annotation
.end method

.method public abstract placeDynamicFreeOrder(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/y;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/membership/extensions/domain/models/ProgressContent;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
    .end annotation
.end method
