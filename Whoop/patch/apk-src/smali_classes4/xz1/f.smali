.class public final Lxz1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lxz1/c;",
        "Lxz1/e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ4\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0082@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J#\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u001a2\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lxz1/f;",
        "Lod1/g;",
        "Lxz1/c;",
        "Lxz1/e;",
        "Lcom/whoop/nativestore/pdp/domain/api/PdpApi;",
        "api",
        "Lao2/a;",
        "cartIndicatorRepository",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/nativestore/pdp/domain/api/PdpApi;Lao2/a;Ltr2/n;)V",
        "state",
        "",
        "slug",
        "sku",
        "source",
        "g",
        "(Lxz1/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lxz1/j;",
        "tap",
        "h",
        "(Lxz1/e;Lxz1/j;)Lxz1/e;",
        "tagId",
        "i",
        "(Lxz1/e;Ljava/lang/String;)Lxz1/e;",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/nativestore/pdp/domain/api/PdpApi;",
        "b",
        "Lao2/a;",
        "c",
        "Ltr2/n;",
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


# instance fields
.field private final a:Lcom/whoop/nativestore/pdp/domain/api/PdpApi;

.field private final b:Lao2/a;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/nativestore/pdp/domain/api/PdpApi;Lao2/a;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cartIndicatorRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lxz1/f;->a:Lcom/whoop/nativestore/pdp/domain/api/PdpApi;

    .line 3
    iput-object p2, p0, Lxz1/f;->b:Lao2/a;

    .line 4
    iput-object p3, p0, Lxz1/f;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/nativestore/pdp/domain/api/PdpApi;Lao2/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "PdpInteractor"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lxz1/f;-><init>(Lcom/whoop/nativestore/pdp/domain/api/PdpApi;Lao2/a;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Lxz1/f;Lxz1/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p5}, Lxz1/f;->g(Lxz1/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lxz1/f;)Lcom/whoop/nativestore/pdp/domain/api/PdpApi;
    .locals 0

    iget-object p0, p0, Lxz1/f;->a:Lcom/whoop/nativestore/pdp/domain/api/PdpApi;

    return-object p0
.end method

.method public static final synthetic e(Lxz1/f;Lxz1/e;Lxz1/j;)Lxz1/e;
    .locals 0

    invoke-direct {p0, p1, p2}, Lxz1/f;->h(Lxz1/e;Lxz1/j;)Lxz1/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lxz1/f;Lxz1/e;Ljava/lang/String;)Lxz1/e;
    .locals 0

    invoke-direct {p0, p1, p2}, Lxz1/f;->i(Lxz1/e;Ljava/lang/String;)Lxz1/e;

    move-result-object p0

    return-object p0
.end method

.method private final g(Lxz1/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 39
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxz1/e;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lxz1/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p5

    instance-of v2, v0, Lxz1/f$a;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lxz1/f$a;

    iget v3, v2, Lxz1/f$a;->G:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lxz1/f$a;->G:I

    :goto_0
    move-object v8, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lxz1/f$a;

    invoke-direct {v2, v1, v0}, Lxz1/f$a;-><init>(Lxz1/f;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v0, v8, Lxz1/f$a;->E:Ljava/lang/Object;

    sget-object v11, Lr83/a;->w:Lr83/a;

    iget v2, v8, Lxz1/f$a;->G:I

    const/4 v6, 0x1

    const/4 v12, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v6, :cond_1

    iget-object v2, v8, Lxz1/f$a;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v8, Lxz1/f$a;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v8, Lxz1/f$a;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v8, Lxz1/f$a;->w:Ljava/lang/Object;

    check-cast v2, Lxz1/e;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v13, v2

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v7, Lu02/a;->a:Lu02/a$a;

    iget-object v9, v1, Lxz1/f;->c:Ltr2/n;

    new-instance v0, Lxz1/f$b;

    const/4 v5, 0x0

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lxz1/f$b;-><init>(Lxz1/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    move-object v3, v7

    move-object v7, v0

    move-object/from16 v0, p1

    iput-object v0, v8, Lxz1/f$a;->w:Ljava/lang/Object;

    iput-object v12, v8, Lxz1/f$a;->x:Ljava/lang/Object;

    iput-object v12, v8, Lxz1/f$a;->y:Ljava/lang/Object;

    iput-object v12, v8, Lxz1/f$a;->z:Ljava/lang/Object;

    iput v6, v8, Lxz1/f$a;->G:I

    const/4 v6, 0x0

    move-object v4, v9

    const/4 v9, 0x6

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v11, :cond_3

    return-object v11

    :cond_3
    move-object v13, v0

    move-object v0, v2

    :goto_2
    check-cast v0, Lu02/a;

    invoke-static {v0}, Lu02/b;->b(Lu02/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionPageResponse;

    if-nez v0, :cond_4

    sget-object v14, Lxz1/d$a;->a:Lxz1/d$a;

    const/16 v24, 0x3fe

    const/16 v25, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v13 .. v25}, Lxz1/e;->b(Lxz1/e;Lxz1/d;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/VariantOption;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lxz1/e;

    move-result-object v0

    return-object v0

    :cond_4
    invoke-virtual {v0}, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionPageResponse;->getCart()Lcom/whoop/nativestore/home/domain/model/CartIndicator;

    move-result-object v2

    if-eqz v2, :cond_5

    iget-object v3, v1, Lxz1/f;->b:Lao2/a;

    invoke-virtual {v2}, Lcom/whoop/nativestore/home/domain/model/CartIndicator;->getCartIndicatorQuantity()I

    move-result v4

    invoke-virtual {v2}, Lcom/whoop/nativestore/home/domain/model/CartIndicator;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v2

    invoke-virtual {v3, v4, v2}, Lao2/a;->j(ILcom/whoop/navigation/e;)V

    :cond_5
    new-instance v14, Lxz1/d$b;

    invoke-direct {v14, v0}, Lxz1/d$b;-><init>(Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionPageResponse;)V

    const/16 v24, 0x3fe

    const/16 v25, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v13 .. v25}, Lxz1/e;->b(Lxz1/e;Lxz1/d;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/VariantOption;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lxz1/e;

    move-result-object v26

    invoke-virtual {v0}, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionPageResponse;->getProductMetadata()Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;

    move-result-object v2

    if-nez v2, :cond_6

    return-object v26

    :cond_6
    invoke-virtual {v0}, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionPageResponse;->getSections()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/nativestore/pdp/domain/model/PdpSection;

    invoke-virtual {v4}, Lcom/whoop/nativestore/pdp/domain/model/PdpSection;->getItems()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v3, v4}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_3

    :cond_7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_8
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;

    if-eqz v6, :cond_8

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_9
    invoke-virtual {v2}, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->isWhoopYourWay()Z

    move-result v4

    if-eqz v4, :cond_d

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_a
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/items/TagSelectorModel;

    if-eqz v6, :cond_a

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_b
    invoke-static {v4}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/items/TagSelectorModel;

    if-eqz v3, :cond_d

    invoke-virtual {v3}, Lcom/whoop/design/models/items/TagSelectorModel;->getDefaultTag()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_c

    invoke-virtual {v3}, Lcom/whoop/design/models/items/TagSelectorModel;->getSelectedTag()Ljava/lang/String;

    move-result-object v3

    move-object v12, v3

    goto :goto_6

    :cond_c
    move-object v12, v4

    :cond_d
    :goto_6
    move-object/from16 v35, v12

    sget-object v3, Lxz1/i;->a:Lxz1/i$a;

    invoke-virtual {v3, v2}, Lxz1/i$a;->c(Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;)Lxz1/i;

    move-result-object v3

    const/16 v37, 0x2ff

    const/16 v38, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v36, 0x0

    invoke-static/range {v26 .. v38}, Lxz1/e;->b(Lxz1/e;Lxz1/d;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/VariantOption;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lxz1/e;

    move-result-object v4

    invoke-interface {v3, v4, v2, v0}, Lxz1/i;->b(Lxz1/e;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Ljava/util/List;)Lxz1/e;

    move-result-object v0

    return-object v0
.end method

.method private final h(Lxz1/e;Lxz1/j;)Lxz1/e;
    .locals 2

    invoke-virtual {p1}, Lxz1/e;->k()Lxz1/d;

    move-result-object v0

    instance-of v1, v0, Lxz1/d$b;

    if-eqz v1, :cond_0

    check-cast v0, Lxz1/d$b;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lxz1/d$b;->a()Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionPageResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionPageResponse;->getProductMetadata()Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;

    move-result-object v0

    if-nez v0, :cond_2

    :goto_1
    return-object p1

    :cond_2
    sget-object v1, Lxz1/i;->a:Lxz1/i$a;

    invoke-virtual {v1, v0}, Lxz1/i$a;->c(Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;)Lxz1/i;

    move-result-object v1

    invoke-interface {v1, p1, v0, p2}, Lxz1/i;->a(Lxz1/e;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Lxz1/j;)Lxz1/e;

    move-result-object p1

    return-object p1
.end method

.method private final i(Lxz1/e;Ljava/lang/String;)Lxz1/e;
    .locals 2

    invoke-virtual {p1}, Lxz1/e;->k()Lxz1/d;

    move-result-object v0

    instance-of v1, v0, Lxz1/d$b;

    if-eqz v1, :cond_0

    check-cast v0, Lxz1/d$b;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lxz1/d$b;->a()Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionPageResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionPageResponse;->getProductMetadata()Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;

    move-result-object v0

    if-nez v0, :cond_2

    :goto_1
    return-object p1

    :cond_2
    sget-object v1, Lxz1/l;->b:Lxz1/l;

    invoke-virtual {v1, p1, v0, p2}, Lxz1/l;->r(Lxz1/e;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Ljava/lang/String;)Lxz1/e;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "upstream"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lxz1/f$c;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lxz1/f$c;-><init>(Lq83/d;)V

    invoke-static {v0, v1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v3, Lxz1/e;

    const/16 v14, 0x3ff

    const/4 v15, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v3 .. v15}, Lxz1/e;-><init>(Lxz1/d;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/VariantOption;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lxz1/f$d;

    move-object/from16 v4, p0

    invoke-direct {v1, v4, v2}, Lxz1/f$d;-><init>(Lxz1/f;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v3, v0, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    const/4 v0, 0x1

    invoke-static {v2, v0}, Lec3/v;->v(Lec3/l;I)Lec3/h0;

    move-result-object v0

    return-object v0
.end method
