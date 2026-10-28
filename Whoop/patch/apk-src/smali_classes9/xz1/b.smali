.class public final Lxz1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxz1/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxz1/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J5\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ-\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\'\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lxz1/b;",
        "Lxz1/i;",
        "<init>",
        "()V",
        "Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;",
        "metadata",
        "",
        "packItemId",
        "Lcom/whoop/nativestore/pdp/domain/model/PackItemProductMetadata;",
        "itemMetadata",
        "",
        "Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;",
        "variantSelectors",
        "Lxz1/a;",
        "c",
        "(Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/PackItemProductMetadata;Ljava/util/List;)Lxz1/a;",
        "Lxz1/e;",
        "state",
        "b",
        "(Lxz1/e;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Ljava/util/List;)Lxz1/e;",
        "Lxz1/j;",
        "tap",
        "a",
        "(Lxz1/e;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Lxz1/j;)Lxz1/e;",
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


# static fields
.field public static final b:Lxz1/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxz1/b;

    invoke-direct {v0}, Lxz1/b;-><init>()V

    sput-object v0, Lxz1/b;->b:Lxz1/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final c(Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/PackItemProductMetadata;Ljava/util/List;)Lxz1/a;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;",
            "Ljava/lang/String;",
            "Lcom/whoop/nativestore/pdp/domain/model/PackItemProductMetadata;",
            "Ljava/util/List<",
            "Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;",
            ">;)",
            "Lxz1/a;"
        }
    .end annotation

    invoke-virtual {p3}, Lcom/whoop/nativestore/pdp/domain/model/PackItemProductMetadata;->getInitiallySelectedSku()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lxz1/i;->a:Lxz1/i$a;

    invoke-virtual {v1, p1, v0}, Lxz1/i$a;->d(Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->getProducts()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/nativestore/pdp/domain/model/ProductOption;

    if-eqz v4, :cond_0

    invoke-virtual {v1, v4, v0}, Lxz1/i$a;->f(Lcom/whoop/nativestore/pdp/domain/model/ProductOption;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v3

    :goto_0
    if-eqz v2, :cond_1

    if-eqz v4, :cond_1

    invoke-virtual {v1, p1, v2, v4}, Lxz1/i$a;->e(Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/nativestore/pdp/domain/model/VariantOption;

    move-result-object v3

    :cond_1
    move-object v8, v3

    new-instance v4, Lxz1/a;

    if-nez v2, :cond_2

    const-string v2, ""

    :cond_2
    move-object v6, v2

    invoke-virtual {v1, p4, p2}, Lxz1/i$a;->g(Ljava/util/List;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v7

    if-eqz v8, :cond_4

    invoke-virtual {v8}, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->getSku()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    move-object v9, p1

    goto :goto_2

    :cond_4
    :goto_1
    move-object v9, v0

    :goto_2
    if-eqz v8, :cond_5

    invoke-virtual {v8}, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->getHasStock()Z

    move-result p1

    :goto_3
    move v10, p1

    move-object v5, p2

    goto :goto_4

    :cond_5
    invoke-virtual {p3}, Lcom/whoop/nativestore/pdp/domain/model/PackItemProductMetadata;->getInitialVariantHasStock()Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_3

    :cond_6
    const/4 p1, 0x1

    goto :goto_3

    :goto_4
    invoke-direct/range {v4 .. v10}, Lxz1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/nativestore/pdp/domain/model/VariantOption;Ljava/lang/String;Z)V

    return-object v4
.end method


# virtual methods
.method public a(Lxz1/e;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Lxz1/j;)Lxz1/e;
    .locals 13

    const-string v2, "state"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "metadata"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "tap"

    move-object/from16 v3, p3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Lxz1/j;->c()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lxz1/e;->d()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lxz1/a;

    invoke-virtual {v3}, Lxz1/j;->a()Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

    move-result-object v5

    sget-object v6, Lxz1/b$a;->a:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v6, v5

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eq v5, v8, :cond_3

    if-ne v5, v7, :cond_2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lxz1/a;->a()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_4

    :cond_1
    invoke-virtual {v3}, Lxz1/j;->d()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_4

    :goto_0
    return-object p1

    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_3
    invoke-virtual {v3}, Lxz1/j;->b()Ljava/lang/String;

    move-result-object v5

    :cond_4
    invoke-virtual {v3}, Lxz1/j;->a()Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v6, v6, v9

    sget-object v9, Lm83/z;->w:Lm83/z;

    const/4 v10, 0x0

    if-eq v6, v8, :cond_8

    if-ne v6, v7, :cond_7

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lxz1/a;->d()Ljava/util/Map;

    move-result-object v6

    goto :goto_1

    :cond_5
    move-object v6, v10

    :goto_1
    if-nez v6, :cond_6

    move-object v6, v9

    :cond_6
    invoke-virtual {v3}, Lxz1/j;->e()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v3}, Lxz1/j;->b()Ljava/lang/String;

    move-result-object v11

    new-instance v12, Ll83/k;

    invoke-direct {v12, v7, v11}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v6, v12}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object v6

    goto :goto_3

    :cond_7
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_8
    if-eqz v2, :cond_9

    invoke-virtual {v2}, Lxz1/a;->d()Ljava/util/Map;

    move-result-object v6

    goto :goto_2

    :cond_9
    move-object v6, v10

    :goto_2
    if-nez v6, :cond_a

    move-object v6, v9

    :cond_a
    :goto_3
    sget-object v7, Lxz1/i;->a:Lxz1/i$a;

    invoke-virtual {v7, v6}, Lxz1/i$a;->a(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7, p2, v5, v11}, Lxz1/i$a;->e(Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/nativestore/pdp/domain/model/VariantOption;

    move-result-object v11

    invoke-virtual {v3}, Lxz1/j;->a()Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

    move-result-object v3

    invoke-virtual {v7, p2, v5, v3, v11}, Lxz1/i$a;->b(Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Lcom/whoop/nativestore/pdp/domain/model/VariantOption;)Ljava/util/Map$Entry;

    move-result-object v1

    if-nez v11, :cond_b

    if-eqz v1, :cond_c

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;

    :cond_b
    move-object v7, v11

    goto :goto_4

    :cond_c
    move-object v7, v10

    :goto_4
    new-instance v3, Lxz1/a;

    if-eqz v1, :cond_d

    move-object v6, v9

    :cond_d
    if-eqz v7, :cond_f

    invoke-virtual {v7}, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->getSku()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_e

    goto :goto_5

    :cond_e
    move-object v10, v1

    goto :goto_6

    :cond_f
    :goto_5
    if-eqz v2, :cond_10

    invoke-virtual {v2}, Lxz1/a;->b()Ljava/lang/String;

    move-result-object v10

    :cond_10
    :goto_6
    if-eqz v7, :cond_12

    invoke-virtual {v7}, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->getHasStock()Z

    move-result v8

    :cond_11
    :goto_7
    move v9, v8

    move-object v8, v10

    goto :goto_8

    :cond_12
    if-eqz v2, :cond_11

    invoke-virtual {v2}, Lxz1/a;->e()Z

    move-result v8

    goto :goto_7

    :goto_8
    invoke-direct/range {v3 .. v9}, Lxz1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/nativestore/pdp/domain/model/VariantOption;Ljava/lang/String;Z)V

    invoke-virtual {p1}, Lxz1/e;->d()Ljava/util/Map;

    move-result-object v1

    new-instance v2, Ll83/k;

    invoke-direct {v2, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v2}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object v8

    const/16 v11, 0x37f

    const/4 v12, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v12}, Lxz1/e;->b(Lxz1/e;Lxz1/d;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/VariantOption;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lxz1/e;

    move-result-object v0

    return-object v0
.end method

.method public b(Lxz1/e;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Ljava/util/List;)Lxz1/e;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxz1/e;",
            "Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;",
            "Ljava/util/List<",
            "Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;",
            ">;)",
            "Lxz1/e;"
        }
    .end annotation

    move-object/from16 v2, p3

    const-string v3, "state"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "metadata"

    invoke-static {p2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "variantSelectors"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->getPackItemMetadata()Ljava/util/Map;

    move-result-object v3

    if-nez v3, :cond_0

    return-object p1

    :cond_0
    new-instance v8, Ljava/util/LinkedHashMap;

    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v4

    invoke-static {v4}, Lm83/g0;->W(I)I

    move-result v4

    invoke-direct {v8, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/nativestore/pdp/domain/model/PackItemProductMetadata;

    sget-object v7, Lxz1/b;->b:Lxz1/b;

    invoke-direct {v7, p2, v6, v4, v2}, Lxz1/b;->c(Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/PackItemProductMetadata;Ljava/util/List;)Lxz1/a;

    move-result-object v4

    invoke-interface {v8, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    const/16 v11, 0x37f

    const/4 v12, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v12}, Lxz1/e;->b(Lxz1/e;Lxz1/d;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/VariantOption;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lxz1/e;

    move-result-object v0

    return-object v0
.end method
