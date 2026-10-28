.class public interface abstract Lcom/whoop/nativestore/pdp/domain/api/PdpApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J2\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001a\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0001\u0010\t\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/nativestore/pdp/domain/api/PdpApi;",
        "",
        "",
        "slug",
        "sku",
        "source",
        "Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionPageResponse;",
        "getProductDescriptionPage",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "key",
        "Lcom/whoop/nativestore/pdp/domain/model/ProductSizeGuideResponse;",
        "getSizeGuide",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "native-store_release"
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
.method public abstract getProductDescriptionPage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "slug"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "sku"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "source"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionPageResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "commerce-service/v1/mobile/shop/pdp"
    .end annotation
.end method

.method public abstract getSizeGuide(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "key"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/nativestore/pdp/domain/model/ProductSizeGuideResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "commerce-service/v1/mobile/shop/size-guide"
    .end annotation
.end method
