.class public interface abstract Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J$\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u0003\u001a\u00020\tH\u00a7@\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowApi;",
        "",
        "Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;",
        "request",
        "Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;",
        "buyNow",
        "(Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;Lq83/d;)Ljava/lang/Object;",
        "",
        "path",
        "Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowPlaceOrderRequest;",
        "Lcom/whoop/universalcheckout/features/checkout/domain/models/CheckoutSuccessResponse;",
        "placeOrder",
        "(Ljava/lang/String;Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowPlaceOrderRequest;Lq83/d;)Ljava/lang/Object;",
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
.method public abstract buyNow(Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "commerce-service/v3/mobile/carts/buy-now"
    .end annotation
.end method

.method public abstract placeOrder(Ljava/lang/String;Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowPlaceOrderRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/y;
        .end annotation
    .end param
    .param p2    # Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowPlaceOrderRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowPlaceOrderRequest;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/universalcheckout/features/checkout/domain/models/CheckoutSuccessResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
    .end annotation
.end method
