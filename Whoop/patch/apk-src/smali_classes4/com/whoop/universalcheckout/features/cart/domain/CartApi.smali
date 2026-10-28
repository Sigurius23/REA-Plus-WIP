.class public interface abstract Lcom/whoop/universalcheckout/features/cart/domain/CartApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001a\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\nH\u00a7@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001a\u0010\u000e\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\rH\u00a7@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001c\u0010\u0012\u001a\u00020\u00042\n\u0008\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00a7@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001c\u0010\u0015\u001a\u00020\u00142\n\u0008\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00a7@\u00a2\u0006\u0004\u0008\u0015\u0010\u0013\u00a8\u0006\u0016\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/universalcheckout/features/cart/domain/CartApi;",
        "",
        "Lcom/whoop/universalcheckout/features/cart/domain/models/AddCartItemRequest;",
        "body",
        "Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;",
        "addItem",
        "(Lcom/whoop/universalcheckout/features/cart/domain/models/AddCartItemRequest;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/universalcheckout/features/cart/domain/models/AddPackToCartRequest;",
        "addPack",
        "(Lcom/whoop/universalcheckout/features/cart/domain/models/AddPackToCartRequest;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;",
        "addWyw",
        "(Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/universalcheckout/features/cart/domain/models/UpdateCartQuantityRequest;",
        "updateQuantity",
        "(Lcom/whoop/universalcheckout/features/cart/domain/models/UpdateCartQuantityRequest;Lq83/d;)Ljava/lang/Object;",
        "",
        "cartId",
        "getCart",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/universalcheckout/features/cart/domain/models/CartIndicatorResponse;",
        "getCartIndicator",
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
.method public abstract addItem(Lcom/whoop/universalcheckout/features/cart/domain/models/AddCartItemRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/universalcheckout/features/cart/domain/models/AddCartItemRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/universalcheckout/features/cart/domain/models/AddCartItemRequest;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "commerce-service/v2/mobile/carts/add-item"
    .end annotation
.end method

.method public abstract addPack(Lcom/whoop/universalcheckout/features/cart/domain/models/AddPackToCartRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/universalcheckout/features/cart/domain/models/AddPackToCartRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/universalcheckout/features/cart/domain/models/AddPackToCartRequest;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "commerce-service/v2/mobile/carts/add-pack"
    .end annotation
.end method

.method public abstract addWyw(Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "commerce-service/v2/mobile/carts/add-wyw"
    .end annotation
.end method

.method public abstract getCart(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "cart_id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "commerce-service/v2/mobile/carts/cart"
    .end annotation
.end method

.method public abstract getCartIndicator(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "cart_id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/universalcheckout/features/cart/domain/models/CartIndicatorResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "commerce-service/v2/mobile/carts/indicator"
    .end annotation
.end method

.method public abstract updateQuantity(Lcom/whoop/universalcheckout/features/cart/domain/models/UpdateCartQuantityRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/universalcheckout/features/cart/domain/models/UpdateCartQuantityRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/universalcheckout/features/cart/domain/models/UpdateCartQuantityRequest;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "commerce-service/v2/mobile/carts/update-quantity"
    .end annotation
.end method
