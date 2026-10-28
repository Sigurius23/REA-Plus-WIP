.class public abstract Lqz1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqz1/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u001d\u0010\u000f\u001a\u00020\u000e*\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\"\u001a\u0010\u0016\u001a\u00020\u00118\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;",
        "Lh51/f;",
        "f",
        "(Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;)Lh51/f;",
        "",
        "Lb91/c;",
        "k",
        "(Ljava/lang/String;)Lb91/c;",
        "Lcom/whoop/nativestore/home/domain/model/ShopProductModel;",
        "Lh41/c;",
        "e",
        "(Lcom/whoop/nativestore/home/domain/model/ShopProductModel;)Lh41/c;",
        "Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;",
        "tagText",
        "Lh41/e;",
        "j",
        "(Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;Ljava/lang/String;)Lh41/e;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "d",
        "()Ljb1/a;",
        "shopProductCarouselReducer",
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


# static fields
.field private static final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqt2/w;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lqt2/w;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lqz1/d;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqz1/d;->h(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;)Lh51/f;
    .locals 0

    invoke-static {p0}, Lqz1/d;->i(Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;)Lh51/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqz1/d;->g(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Ljb1/a;
    .locals 1

    sget-object v0, Lqz1/d;->a:Ljb1/a;

    return-object v0
.end method

.method private static final e(Lcom/whoop/nativestore/home/domain/model/ShopProductModel;)Lh41/c;
    .locals 16

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->getSalePrice()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->getPrice()Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->getSalePrice()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->getPrice()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_1
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_0

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->getTagType()Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->getTagText()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lqz1/d;->j(Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;Ljava/lang/String;)Lh41/e;

    move-result-object v0

    move-object v6, v0

    goto :goto_2

    :cond_2
    move-object v6, v1

    :goto_2
    new-instance v2, Ltz1/l;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->getAnalyticsValue()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->getIndex()Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->getTagType()Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v0

    instance-of v3, v0, Lcom/whoop/navigation/ProductDescriptionPageScreenModel;

    if-eqz v3, :cond_3

    check-cast v0, Lcom/whoop/navigation/ProductDescriptionPageScreenModel;

    goto :goto_3

    :cond_3
    move-object v0, v1

    :goto_3
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/whoop/navigation/ProductDescriptionPageScreenModel;->getSku()Ljava/lang/String;

    move-result-object v1

    :cond_4
    move-object v14, v1

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->getCategory()Ljava/lang/String;

    move-result-object v15

    move-object v9, v2

    invoke-direct/range {v9 .. v15}, Ltz1/l;-><init>(Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lh41/c;

    const/16 v10, 0x82

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v11}, Lh41/c;-><init>(Ljava/lang/Object;ZLkd1/o;Lcom/whoop/design/util/TextResource;Lh41/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final f(Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;)Lh51/f;
    .locals 20

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ltz1/i;

    invoke-virtual {v1}, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->getHeader()Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;

    move-result-object v0

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v3

    :goto_0
    invoke-virtual {v1}, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->getAnalyticsValue()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v0, v4}, Ltz1/i;-><init>(Lcom/whoop/navigation/e;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->getHeader()Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v3

    :goto_1
    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget-object v4, Lqz1/d$b;->w:Lqz1/d$b;

    invoke-static {v4}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->getHeader()Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;->getTypography()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-static {v5}, Lqz1/d;->k(Ljava/lang/String;)Lb91/c;

    move-result-object v5

    goto :goto_2

    :cond_2
    move-object v5, v3

    :goto_2
    invoke-virtual {v1}, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->getHeader()Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v6, :cond_3

    move v9, v8

    goto :goto_3

    :cond_3
    move v9, v7

    :goto_3
    invoke-virtual {v1}, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->getHeader()Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;->getSubtitle()Ljava/lang/String;

    move-result-object v6

    goto :goto_4

    :cond_4
    move-object v6, v3

    :goto_4
    if-eqz v6, :cond_5

    goto :goto_5

    :cond_5
    move v8, v7

    :goto_5
    invoke-virtual {v1}, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->getHeader()Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;

    move-result-object v6

    if-eqz v6, :cond_6

    invoke-virtual {v6}, Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;->getSubtitle()Ljava/lang/String;

    move-result-object v6

    goto :goto_6

    :cond_6
    move-object v6, v3

    :goto_6
    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->getHeader()Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;

    move-result-object v7

    if-eqz v7, :cond_7

    invoke-virtual {v7}, Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;->getSubtitle()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_7

    new-instance v7, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v10

    invoke-virtual {v10}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v10

    invoke-virtual {v10}, Lgz0/w;->b()I

    move-result v10

    const/4 v11, 0x2

    invoke-direct {v7, v10, v3, v11, v3}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_7

    :cond_7
    move-object v7, v3

    :goto_7
    invoke-virtual {v1}, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->getProducts()Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/lang/Iterable;

    new-instance v11, Ljava/util/ArrayList;

    const/16 v12, 0xa

    invoke-static {v10, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_8
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_8

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;

    invoke-static {v12}, Lqz1/d;->e(Lcom/whoop/nativestore/home/domain/model/ShopProductModel;)Lh41/c;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_8
    invoke-virtual {v1}, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->getBackgroundContentUrl()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_a

    invoke-virtual {v1}, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->getBackgroundContentType()Lcom/whoop/design/models/ContentType;

    move-result-object v1

    sget-object v12, Lcom/whoop/design/models/ContentType;->IMAGE:Lcom/whoop/design/models/ContentType;

    if-ne v1, v12, :cond_9

    move-object v14, v10

    goto :goto_9

    :cond_9
    move-object v14, v3

    :goto_9
    if-eqz v14, :cond_a

    new-instance v13, Lkd1/o$c;

    const/16 v18, 0xe

    const/16 v19, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v13 .. v19}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_a

    :cond_a
    move-object v13, v3

    :goto_a
    new-instance v1, Lh51/f;

    const/16 v15, 0x1600

    const/16 v16, 0x0

    move-object v10, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    move-object v3, v0

    invoke-direct/range {v1 .. v16}, Lh51/f;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Li91/a;Lb91/c;Lcom/whoop/design/util/TextResource;Ly71/g;ZZLjava/util/List;Ly81/e;Li91/a;Lkd1/o;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final g(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqt2/w;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lqt2/w;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqt2/w;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lqt2/w;-><init>(I)V

    const-class v1, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lqz1/d$c;

    invoke-direct {v2, v0}, Lqz1/d$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;)Lh51/f;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lqz1/d;->f(Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;)Lh51/f;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;Ljava/lang/String;)Lh41/e;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    new-instance v1, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v1, p1}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    sget-object p1, Lqz1/d$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p1, p0

    const/4 p1, 0x1

    if-eq p0, p1, :cond_9

    const/4 v2, 0x2

    if-eq p0, v2, :cond_7

    const/4 v2, 0x3

    if-eq p0, v2, :cond_5

    const/4 v2, 0x4

    if-eq p0, v2, :cond_3

    const/4 v2, 0x5

    if-ne p0, v2, :cond_2

    new-instance p0, Lh41/e$b;

    if-eqz v1, :cond_1

    invoke-direct {p0, v1}, Lh41/e$b;-><init>(Lcom/whoop/design/util/TextResource;)V

    return-object p0

    :cond_1
    invoke-direct {p0, v0, p1, v0}, Lh41/e$b;-><init>(Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_3
    new-instance p0, Lh41/e$e;

    if-eqz v1, :cond_4

    invoke-direct {p0, v1}, Lh41/e$e;-><init>(Lcom/whoop/design/util/TextResource;)V

    return-object p0

    :cond_4
    invoke-direct {p0, v0, p1, v0}, Lh41/e$e;-><init>(Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :cond_5
    new-instance p0, Lh41/e$f;

    if-eqz v1, :cond_6

    invoke-direct {p0, v1}, Lh41/e$f;-><init>(Lcom/whoop/design/util/TextResource;)V

    return-object p0

    :cond_6
    invoke-direct {p0, v0, p1, v0}, Lh41/e$f;-><init>(Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :cond_7
    new-instance p0, Lh41/e$a;

    if-eqz v1, :cond_8

    invoke-direct {p0, v1}, Lh41/e$a;-><init>(Lcom/whoop/design/util/TextResource;)V

    return-object p0

    :cond_8
    invoke-direct {p0, v0, p1, v0}, Lh41/e$a;-><init>(Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :cond_9
    new-instance p0, Lh41/e$d;

    if-eqz v1, :cond_a

    invoke-direct {p0, v1}, Lh41/e$d;-><init>(Lcom/whoop/design/util/TextResource;)V

    return-object p0

    :cond_a
    invoke-direct {p0, v0, p1, v0}, Lh41/e$d;-><init>(Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method

.method private static final k(Ljava/lang/String;)Lb91/c;
    .locals 5

    invoke-static {}, Lb91/c;->values()[Lb91/c;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method
