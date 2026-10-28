.class public abstract Lyz1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/whoop/nativestore/pdp/domain/model/ProductImageGalleryModel;",
        "Lh02/c0;",
        "a",
        "(Lcom/whoop/nativestore/pdp/domain/model/ProductImageGalleryModel;)Lh02/c0;",
        "Lcom/whoop/nativestore/pdp/domain/model/ProductImageGalleryTagModel;",
        "Lh02/d0;",
        "b",
        "(Lcom/whoop/nativestore/pdp/domain/model/ProductImageGalleryTagModel;)Lh02/d0;",
        "native-store_release"
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
.method public static final a(Lcom/whoop/nativestore/pdp/domain/model/ProductImageGalleryModel;)Lh02/c0;
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/nativestore/pdp/domain/model/ProductImageGalleryModel;->getImages()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    new-instance v3, Lkd1/o$c;

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/nativestore/pdp/domain/model/ProductImageGalleryModel;->getProductTag()Lcom/whoop/nativestore/pdp/domain/model/ProductImageGalleryTagModel;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, Lyz1/e;->b(Lcom/whoop/nativestore/pdp/domain/model/ProductImageGalleryTagModel;)Lh02/d0;

    move-result-object p0

    :goto_1
    move-object v3, p0

    goto :goto_2

    :cond_1
    const/4 p0, 0x0

    goto :goto_1

    :goto_2
    new-instance v1, Lh02/c0;

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v6}, Lh02/c0;-><init>(Ljava/util/List;Lh02/d0;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final b(Lcom/whoop/nativestore/pdp/domain/model/ProductImageGalleryTagModel;)Lh02/d0;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh02/d0;

    invoke-virtual {p0}, Lcom/whoop/nativestore/pdp/domain/model/ProductImageGalleryTagModel;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/nativestore/pdp/domain/model/ProductImageGalleryTagModel;->getStyle()Lcom/whoop/nativestore/pdp/domain/model/ProductImageGalleryTagStyle;

    move-result-object p0

    if-nez p0, :cond_0

    sget-object p0, Lcom/whoop/nativestore/pdp/domain/model/ProductImageGalleryTagStyle;->DEFAULT:Lcom/whoop/nativestore/pdp/domain/model/ProductImageGalleryTagStyle;

    :cond_0
    invoke-direct {v0, v1, p0}, Lh02/d0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/nativestore/pdp/domain/model/ProductImageGalleryTagStyle;)V

    return-object v0
.end method
