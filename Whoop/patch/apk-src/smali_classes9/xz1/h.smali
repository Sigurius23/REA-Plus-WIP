.class public final Lxz1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxz1/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxz1/h$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lxz1/h;",
        "Lxz1/i;",
        "<init>",
        "()V",
        "Lxz1/e;",
        "state",
        "Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;",
        "metadata",
        "",
        "Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;",
        "variantSelectors",
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
.field public static final b:Lxz1/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxz1/h;

    invoke-direct {v0}, Lxz1/h;-><init>()V

    sput-object v0, Lxz1/h;->b:Lxz1/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
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

    invoke-virtual {v3}, Lxz1/j;->a()Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

    move-result-object v2

    sget-object v4, Lxz1/h$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v4, v2

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eq v2, v6, :cond_1

    if-ne v2, v5, :cond_0

    invoke-virtual {p1}, Lxz1/e;->f()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    return-object p1

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    invoke-virtual {v3}, Lxz1/j;->b()Ljava/lang/String;

    move-result-object v2

    :cond_2
    invoke-virtual {v3}, Lxz1/j;->a()Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v4, v4, v7

    if-eq v4, v6, :cond_4

    if-ne v4, v5, :cond_3

    invoke-virtual {p1}, Lxz1/e;->j()Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v3}, Lxz1/j;->e()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3}, Lxz1/j;->b()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ll83/k;

    invoke-direct {v7, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4, v7}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object v4

    goto :goto_0

    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_4
    invoke-virtual {p1}, Lxz1/e;->j()Ljava/util/Map;

    move-result-object v4

    :goto_0
    sget-object v5, Lxz1/i;->a:Lxz1/i$a;

    invoke-virtual {v5, v4}, Lxz1/i$a;->a(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, p2, v2, v6}, Lxz1/i$a;->e(Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/nativestore/pdp/domain/model/VariantOption;

    move-result-object v7

    invoke-virtual {v3}, Lxz1/j;->a()Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

    move-result-object v3

    invoke-virtual {v5, p2, v2, v3, v7}, Lxz1/i$a;->b(Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Lcom/whoop/nativestore/pdp/domain/model/VariantOption;)Ljava/util/Map$Entry;

    move-result-object v1

    if-eqz v1, :cond_5

    sget-object v4, Lm83/z;->w:Lm83/z;

    :cond_5
    move-object v3, v4

    if-eqz v1, :cond_6

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-nez v4, :cond_7

    :cond_6
    move-object v4, v6

    :cond_7
    if-nez v7, :cond_9

    if-eqz v1, :cond_8

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;

    goto :goto_1

    :cond_8
    const/4 v5, 0x0

    goto :goto_1

    :cond_9
    move-object v5, v7

    :goto_1
    if-eqz v7, :cond_a

    invoke-virtual {v7}, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->getSku()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_c

    :cond_a
    if-eqz v1, :cond_b

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;

    if-eqz v6, :cond_b

    invoke-virtual {v6}, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->getSku()Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    :cond_b
    invoke-virtual {p1}, Lxz1/e;->g()Ljava/lang/String;

    move-result-object v6

    :cond_c
    :goto_2
    if-eqz v7, :cond_d

    invoke-virtual {v7}, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->getPrice()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_f

    :cond_d
    if-eqz v1, :cond_e

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;

    if-eqz v1, :cond_e

    invoke-virtual {v1}, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->getPrice()Ljava/lang/String;

    move-result-object v7

    goto :goto_3

    :cond_e
    invoke-virtual {p1}, Lxz1/e;->e()Ljava/lang/String;

    move-result-object v7

    :cond_f
    :goto_3
    const/16 v11, 0x381

    const/4 v12, 0x0

    const/4 v1, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v12}, Lxz1/e;->b(Lxz1/e;Lxz1/d;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/VariantOption;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lxz1/e;

    move-result-object v0

    return-object v0
.end method

.method public b(Lxz1/e;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Ljava/util/List;)Lxz1/e;
    .locals 16
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

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    const-string v2, "state"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "metadata"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "variantSelectors"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lxz1/i;->a:Lxz1/i$a;

    invoke-virtual {v0}, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->getInitiallySelectedSku()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v0, v4}, Lxz1/i$a;->d(Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_0

    invoke-virtual {v0}, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->getProducts()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v4}, Lm83/s;->G0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    :cond_0
    move-object v5, v4

    const/4 v4, 0x0

    if-eqz v5, :cond_1

    invoke-virtual {v0}, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->getProducts()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/nativestore/pdp/domain/model/ProductOption;

    goto :goto_0

    :cond_1
    move-object v6, v4

    :goto_0
    if-eqz v6, :cond_2

    invoke-virtual {v0}, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->getInitiallySelectedSku()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v6, v7}, Lxz1/i$a;->f(Lcom/whoop/nativestore/pdp/domain/model/ProductOption;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_4

    :cond_2
    if-eqz v6, :cond_3

    invoke-virtual {v6}, Lcom/whoop/nativestore/pdp/domain/model/ProductOption;->getVariants()Ljava/util/Map;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-interface {v6}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v6

    if-eqz v6, :cond_3

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v6}, Lm83/s;->G0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ljava/lang/String;

    goto :goto_1

    :cond_3
    move-object v7, v4

    :cond_4
    :goto_1
    if-eqz v5, :cond_5

    if-eqz v7, :cond_5

    invoke-virtual {v2, v0, v5, v7}, Lxz1/i$a;->e(Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/nativestore/pdp/domain/model/VariantOption;

    move-result-object v6

    move-object v8, v6

    goto :goto_2

    :cond_5
    move-object v8, v4

    :goto_2
    invoke-virtual {v2, v1, v4}, Lxz1/i$a;->g(Ljava/util/List;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    invoke-virtual {v0}, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->getInitiallySelectedSku()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_6

    if-eqz v8, :cond_7

    invoke-virtual {v8}, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->getSku()Ljava/lang/String;

    move-result-object v1

    :cond_6
    move-object v9, v1

    goto :goto_3

    :cond_7
    move-object v9, v4

    :goto_3
    invoke-virtual {v0}, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->getInitiallySelectedPrice()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_9

    if-eqz v8, :cond_8

    invoke-virtual {v8}, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->getPrice()Ljava/lang/String;

    move-result-object v4

    :cond_8
    move-object v10, v4

    goto :goto_4

    :cond_9
    move-object v10, v0

    :goto_4
    const/16 v14, 0x381

    const/4 v15, 0x0

    const/4 v4, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v3 .. v15}, Lxz1/e;->b(Lxz1/e;Lxz1/d;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/VariantOption;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lxz1/e;

    move-result-object v0

    return-object v0
.end method
