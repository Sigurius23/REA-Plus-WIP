.class public abstract Llb1/z1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\"\u001a\u0010\u0011\u001a\u00020\u000c8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/whoop/design/models/items/ShoppingTileModel;",
        "model",
        "Lh41/c;",
        "j",
        "(Lcom/whoop/design/models/items/ShoppingTileModel;)Lh41/c;",
        "",
        "centsAmount",
        "",
        "currencyCode",
        "Lcom/whoop/design/util/TextResource;",
        "i",
        "(ILjava/lang/String;)Lcom/whoop/design/util/TextResource;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "h",
        "()Llb1/y0;",
        "growthMapper",
        "design-models_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llb1/t1;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Llb1/t1;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/z1;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/PerksListModel;)Ld81/d;
    .locals 0

    invoke-static {p0}, Llb1/z1;->l(Lcom/whoop/design/models/items/PerksListModel;)Ld81/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/z1;->k(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/design/models/items/ShoppingTileCarouselModel;)Lh51/f;
    .locals 0

    invoke-static {p0}, Llb1/z1;->n(Lcom/whoop/design/models/items/ShoppingTileCarouselModel;)Lh51/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/design/models/items/ShoppingTileModel;)Lh41/c;
    .locals 0

    invoke-static {p0}, Llb1/z1;->q(Lcom/whoop/design/models/items/ShoppingTileModel;)Lh41/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Llb1/z1;->p(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/whoop/design/models/items/FaqListModel;)Ly51/c;
    .locals 0

    invoke-static {p0}, Llb1/z1;->m(Lcom/whoop/design/models/items/FaqListModel;)Ly51/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/z1;->o(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/z1;->a:Llb1/y0;

    return-object v0
.end method

.method private static final i(ILjava/lang/String;)Lcom/whoop/design/util/TextResource;
    .locals 4

    int-to-double v0, p0

    const/16 p0, 0x64

    int-to-double v2, p0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int p0, v0

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toUpperCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/util/Currency;->getInstance(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Currency;->getSymbol()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lcom/whoop/design/models/items/ShoppingTileModel;)Lh41/c;
    .locals 24

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->getProduct()Lcom/whoop/design/models/items/ProductModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ProductModel;->getProductInfo()Lcom/whoop/design/models/items/ProductInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ProductInfo;->getHandle()Ljava/lang/String;

    move-result-object v0

    const-string v1, "whoop-your-way-kit"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->isWhoopPro()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->getProduct()Lcom/whoop/design/models/items/ProductModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ProductModel;->getProductInfo()Lcom/whoop/design/models/items/ProductInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ProductInfo;->getProDiscount()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v1, Lh41/e$f;

    new-instance v5, Lcom/whoop/design/util/TextResource$b;

    sget v6, Lgy0/f;->p2:I

    new-instance v7, Lcom/whoop/design/util/TextResource$d$a;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->getProduct()Lcom/whoop/design/models/items/ProductModel;

    move-result-object v8

    invoke-virtual {v8}, Lcom/whoop/design/models/items/ProductModel;->getProductInfo()Lcom/whoop/design/models/items/ProductInfo;

    move-result-object v8

    invoke-virtual {v8}, Lcom/whoop/design/models/items/ProductInfo;->getProDiscount()Ljava/lang/Integer;

    move-result-object v8

    invoke-direct {v7, v8}, Lcom/whoop/design/util/TextResource$d$a;-><init>(Ljava/lang/Object;)V

    new-array v8, v3, [Lcom/whoop/design/util/TextResource$d;

    aput-object v7, v8, v2

    invoke-direct {v5, v6, v8}, Lcom/whoop/design/util/TextResource$b;-><init>(I[Lcom/whoop/design/util/TextResource$d;)V

    invoke-direct {v1, v5}, Lh41/e$f;-><init>(Lcom/whoop/design/util/TextResource;)V

    :goto_0
    move-object v10, v1

    goto/16 :goto_1

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->isWhoopPro()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->getProduct()Lcom/whoop/design/models/items/ProductModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ProductModel;->getProductInfo()Lcom/whoop/design/models/items/ProductInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ProductInfo;->getDiscount()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_1

    new-instance v1, Lh41/e$f;

    new-instance v5, Lcom/whoop/design/util/TextResource$b;

    sget v6, Lgy0/f;->p2:I

    new-instance v7, Lcom/whoop/design/util/TextResource$d$a;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->getProduct()Lcom/whoop/design/models/items/ProductModel;

    move-result-object v8

    invoke-virtual {v8}, Lcom/whoop/design/models/items/ProductModel;->getProductInfo()Lcom/whoop/design/models/items/ProductInfo;

    move-result-object v8

    invoke-virtual {v8}, Lcom/whoop/design/models/items/ProductInfo;->getDiscount()Ljava/lang/Integer;

    move-result-object v8

    invoke-direct {v7, v8}, Lcom/whoop/design/util/TextResource$d$a;-><init>(Ljava/lang/Object;)V

    new-array v8, v3, [Lcom/whoop/design/util/TextResource$d;

    aput-object v7, v8, v2

    invoke-direct {v5, v6, v8}, Lcom/whoop/design/util/TextResource$b;-><init>(I[Lcom/whoop/design/util/TextResource$d;)V

    invoke-direct {v1, v5}, Lh41/e$f;-><init>(Lcom/whoop/design/util/TextResource;)V

    goto :goto_0

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->getProduct()Lcom/whoop/design/models/items/ProductModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ProductModel;->getProductInfo()Lcom/whoop/design/models/items/ProductInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ProductInfo;->getItems()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->getProduct()Lcom/whoop/design/models/items/ProductModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ProductModel;->getProductInfo()Lcom/whoop/design/models/items/ProductInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ProductInfo;->getItems()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/items/ProductItems;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ProductItems;->getNew()Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Lh41/e$d;

    invoke-direct {v1, v4, v3, v4}, Lh41/e$d;-><init>(Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->getProduct()Lcom/whoop/design/models/items/ProductModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ProductModel;->getProductInfo()Lcom/whoop/design/models/items/ProductInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ProductInfo;->getItems()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->getProduct()Lcom/whoop/design/models/items/ProductModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ProductModel;->getProductInfo()Lcom/whoop/design/models/items/ProductInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ProductInfo;->getItems()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/items/ProductItems;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ProductItems;->getProExclusive()Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, Lh41/e$c;

    invoke-direct {v1, v4, v3, v4}, Lh41/e$c;-><init>(Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_0

    :cond_3
    move-object v10, v4

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->getProduct()Lcom/whoop/design/models/items/ProductModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ProductModel;->getProductInfo()Lcom/whoop/design/models/items/ProductInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ProductInfo;->getItems()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const-string v7, "toUpperCase(...)"

    if-eqz v6, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Lcom/whoop/design/models/items/ProductItems;

    invoke-virtual {v8}, Lcom/whoop/design/models/items/ProductItems;->getPrices()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v11, v9

    check-cast v11, Lcom/whoop/design/models/items/Prices;

    invoke-virtual {v11}, Lcom/whoop/design/models/items/Prices;->getCurrency()Ljava/lang/String;

    move-result-object v11

    sget-object v12, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v11, v12}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->getUserCurrencyCode()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13, v12}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v11, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    goto :goto_3

    :cond_6
    move-object v9, v4

    :goto_3
    if-eqz v9, :cond_4

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    const-string v1, "Collection contains no element matching the predicate."

    if-eqz v0, :cond_10

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_8

    move-object v5, v4

    goto/16 :goto_4

    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_9

    goto/16 :goto_4

    :cond_9
    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/items/ProductItems;

    invoke-virtual {v6}, Lcom/whoop/design/models/items/ProductItems;->getPrices()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_f

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/design/models/items/Prices;

    invoke-virtual {v8}, Lcom/whoop/design/models/items/Prices;->getCurrency()Ljava/lang/String;

    move-result-object v9

    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v9, v11}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->getUserCurrencyCode()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12, v11}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    invoke-virtual {v8}, Lcom/whoop/design/models/items/Prices;->getAmount()I

    move-result v6

    :cond_b
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lcom/whoop/design/models/items/ProductItems;

    invoke-virtual {v9}, Lcom/whoop/design/models/items/ProductItems;->getPrices()Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/lang/Iterable;

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_c
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_e

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/whoop/design/models/items/Prices;

    invoke-virtual {v11}, Lcom/whoop/design/models/items/Prices;->getCurrency()Ljava/lang/String;

    move-result-object v12

    sget-object v13, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v12, v13}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->getUserCurrencyCode()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v14, v13}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v12, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_c

    invoke-virtual {v11}, Lcom/whoop/design/models/items/Prices;->getAmount()I

    move-result v9

    if-le v6, v9, :cond_d

    move-object v5, v8

    move v6, v9

    :cond_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_b

    :goto_4
    check-cast v5, Lcom/whoop/design/models/items/ProductItems;

    goto :goto_5

    :cond_e
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    invoke-static {v5}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/whoop/design/models/items/ProductItems;

    :goto_5
    const-string v0, ""

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-eqz v5, :cond_19

    invoke-virtual {v5}, Lcom/whoop/design/models/items/ProductItems;->getPrices()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/items/Prices;

    invoke-virtual {v5}, Lcom/whoop/design/models/items/Prices;->getCurrency()Ljava/lang/String;

    move-result-object v6

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v6, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->getUserCurrencyCode()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->isWhoopPro()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-virtual {v5}, Lcom/whoop/design/models/items/Prices;->getProAmount()I

    move-result v0

    invoke-virtual {v5}, Lcom/whoop/design/models/items/Prices;->getProSaleAmount()I

    move-result v1

    if-eq v0, v1, :cond_13

    :goto_6
    move v2, v3

    goto :goto_7

    :cond_12
    invoke-virtual {v5}, Lcom/whoop/design/models/items/Prices;->getAmount()I

    move-result v0

    invoke-virtual {v5}, Lcom/whoop/design/models/items/Prices;->getSaleAmount()I

    move-result v1

    if-eq v0, v1, :cond_13

    goto :goto_6

    :cond_13
    :goto_7
    if-eqz v2, :cond_14

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->isWhoopPro()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-virtual {v5}, Lcom/whoop/design/models/items/Prices;->getProAmount()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->getUserCurrencyCode()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Llb1/z1;->i(ILjava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    :goto_8
    move-object v6, v0

    goto :goto_9

    :cond_14
    if-eqz v2, :cond_15

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->isWhoopPro()Z

    move-result v0

    if-nez v0, :cond_15

    invoke-virtual {v5}, Lcom/whoop/design/models/items/Prices;->getAmount()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->getUserCurrencyCode()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Llb1/z1;->i(ILjava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_8

    :cond_15
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_8

    :goto_9
    if-eqz v2, :cond_16

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->isWhoopPro()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-virtual {v5}, Lcom/whoop/design/models/items/Prices;->getProSaleAmount()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->getUserCurrencyCode()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Llb1/z1;->i(ILjava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_a

    :cond_16
    if-eqz v2, :cond_17

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->isWhoopPro()Z

    move-result v0

    if-nez v0, :cond_17

    invoke-virtual {v5}, Lcom/whoop/design/models/items/Prices;->getSaleAmount()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->getUserCurrencyCode()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Llb1/z1;->i(ILjava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_a

    :cond_17
    if-nez v2, :cond_18

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->isWhoopPro()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-virtual {v5}, Lcom/whoop/design/models/items/Prices;->getProAmount()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->getUserCurrencyCode()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Llb1/z1;->i(ILjava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_a

    :cond_18
    invoke-virtual {v5}, Lcom/whoop/design/models/items/Prices;->getAmount()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->getUserCurrencyCode()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Llb1/z1;->i(ILjava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    :cond_19
    :goto_a
    move-object v12, v0

    move-object v11, v6

    goto :goto_b

    :cond_1a
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_b
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->isDiscovery()Z

    move-result v0

    if-eqz v0, :cond_1b

    new-instance v13, Lh41/c;

    const/16 v22, 0xfd

    const/16 v23, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v13 .. v23}, Lh41/c;-><init>(Ljava/lang/Object;ZLkd1/o;Lcom/whoop/design/util/TextResource;Lh41/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v13

    :cond_1b
    new-instance v5, Lh41/c;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->getProduct()Lcom/whoop/design/models/items/ProductModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ProductModel;->getProductInfo()Lcom/whoop/design/models/items/ProductInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ProductInfo;->getHandle()Ljava/lang/String;

    move-result-object v6

    new-instance v8, Lkd1/o$c;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->getProduct()Lcom/whoop/design/models/items/ProductModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ProductModel;->getProductInfo()Lcom/whoop/design/models/items/ProductInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ProductInfo;->getFeaturedMedia()Lcom/whoop/design/models/items/Media;

    move-result-object v0

    if-eqz v0, :cond_1c

    invoke-virtual {v0}, Lcom/whoop/design/models/items/Media;->getUrl()Ljava/lang/String;

    move-result-object v4

    :cond_1c
    move-object v14, v4

    const/16 v18, 0xe

    const/16 v19, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v13, v8

    invoke-direct/range {v13 .. v19}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->getProduct()Lcom/whoop/design/models/items/ProductModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ProductModel;->getProductInfo()Lcom/whoop/design/models/items/ProductInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ProductInfo;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ShoppingTileModel;->isWhoopPro()Z

    move-result v13

    const/4 v14, 0x2

    const/4 v15, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v5 .. v15}, Lh41/c;-><init>(Ljava/lang/Object;ZLkd1/o;Lcom/whoop/design/util/TextResource;Lh41/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5
.end method

.method private static final k(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/t1;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Llb1/t1;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/items/PerksListModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/z1$b;

    invoke-direct {v3, v0}, Llb1/z1$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/t1;

    const/4 v2, 0x6

    invoke-direct {v0, v2}, Llb1/t1;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/items/FaqListModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/z1$c;

    invoke-direct {v3, v0}, Llb1/z1$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/t1;

    const/4 v2, 0x7

    invoke-direct {v0, v2}, Llb1/t1;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/items/ShoppingTileCarouselModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/z1$d;

    invoke-direct {v3, v0}, Llb1/z1$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/t1;

    const/16 v2, 0x8

    invoke-direct {v0, v2}, Llb1/t1;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/items/ShoppingTileModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/z1$e;

    invoke-direct {v2, v0}, Llb1/z1$e;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lcom/whoop/design/models/items/PerksListModel;)Ld81/d;
    .locals 5

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/PerksListModel;->getPerks()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/items/PerksModel;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/PerksModel;->getIcon()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v2, v4, v3, v4}, Lgz0/n0;->f(Ljava/lang/String;Lgz0/m0;ILjava/lang/Object;)I

    move-result v2

    invoke-virtual {v1}, Lcom/whoop/design/models/items/PerksModel;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    new-instance v3, Lr81/e;

    invoke-direct {v3, v1, v2}, Lr81/e;-><init>(Lcom/whoop/design/util/TextResource;I)V

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Ld81/d;

    invoke-direct {p0, v0}, Ld81/d;-><init>(Ljava/util/List;)V

    return-object p0
.end method

.method private static final m(Lcom/whoop/design/models/items/FaqListModel;)Ly51/c;
    .locals 9

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/FaqListModel;->getFaqs()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/FaqModel;

    new-instance v3, Lc41/c;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/FaqModel;->getQuestion()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v2}, Lcom/whoop/design/models/items/FaqModel;->getAnswer()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lc41/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v0, Ly51/c;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/FaqListModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/FaqListModel;->getCta()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/FaqListModel;->getTarget()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v2, v3, p0, v1}, Ly51/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method private static final n(Lcom/whoop/design/models/items/ShoppingTileCarouselModel;)Lh51/f;
    .locals 19

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/m;

    const/16 v2, 0x13

    invoke-direct {v0, v2}, Llb1/m;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ShoppingTileCarouselModel;->isWhoopPro()Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Llb1/m;

    const/16 v3, 0x14

    invoke-direct {v2, v3}, Llb1/m;-><init>(I)V

    invoke-static {v2}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    :goto_0
    move-object v6, v2

    goto :goto_1

    :cond_0
    sget-object v2, Llb1/z1$a;->w:Llb1/z1$a;

    invoke-static {v2}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    goto :goto_0

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/design/models/items/ShoppingTileCarouselModel;->getHandle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ShoppingTileCarouselModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ShoppingTileCarouselModel;->getCta()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ShoppingTileCarouselModel;->getTiles()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v12

    new-instance v3, Lh51/f;

    const/16 v17, 0x1ea8

    const/16 v18, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v3 .. v18}, Lh51/f;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Li91/a;Lb91/c;Lcom/whoop/design/util/TextResource;Ly71/g;ZZLjava/util/List;Ly81/e;Li91/a;Lkd1/o;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method

.method private static final o(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Ly81/i;)Li2/t;
    .locals 1

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lgb1/b0;->O0()Li2/t;

    move-result-object p0

    return-object p0
.end method

.method private static final q(Lcom/whoop/design/models/items/ShoppingTileModel;)Lh41/c;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/z1;->j(Lcom/whoop/design/models/items/ShoppingTileModel;)Lh41/c;

    move-result-object p0

    return-object p0
.end method
