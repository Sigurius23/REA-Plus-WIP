.class public abstract Lqz1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\"\u001a\u0010\r\u001a\u00020\u00088\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/whoop/nativestore/home/domain/model/ShopBannerCarouselModel;",
        "Luz1/o;",
        "e",
        "(Lcom/whoop/nativestore/home/domain/model/ShopBannerCarouselModel;)Luz1/o;",
        "Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;",
        "Luz1/r;",
        "f",
        "(Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;)Luz1/r;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "d",
        "()Ljb1/a;",
        "shopBannerCarouselReducer",
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

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lqt2/w;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lqz1/b;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/nativestore/home/domain/model/ShopBannerCarouselModel;)Luz1/o;
    .locals 0

    invoke-static {p0}, Lqz1/b;->i(Lcom/whoop/nativestore/home/domain/model/ShopBannerCarouselModel;)Luz1/o;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqz1/b;->g(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqz1/b;->h(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Ljb1/a;
    .locals 1

    sget-object v0, Lqz1/b;->a:Ljb1/a;

    return-object v0
.end method

.method public static final e(Lcom/whoop/nativestore/home/domain/model/ShopBannerCarouselModel;)Luz1/o;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/nativestore/home/domain/model/ShopBannerCarouselModel;->getBanners()Ljava/util/List;

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

    check-cast v1, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;

    invoke-static {v1}, Lqz1/b;->f(Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;)Luz1/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Luz1/o;

    invoke-direct {p0, v0}, Luz1/o;-><init>(Ljava/util/List;)V

    return-object p0
.end method

.method private static final f(Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;)Luz1/r;
    .locals 11

    invoke-virtual {p0}, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->getSubCopy()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->getCtaText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->getBackgroundMedia()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    new-instance v4, Lkd1/o$c;

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->getIndex()Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->getAnalyticsValue()Ljava/lang/String;

    move-result-object v7

    new-instance v0, Luz1/r;

    invoke-direct/range {v0 .. v7}, Luz1/r;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final g(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqt2/w;

    const/4 v1, 0x4

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

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lqt2/w;-><init>(I)V

    const-class v1, Lcom/whoop/nativestore/home/domain/model/ShopBannerCarouselModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lqz1/b$a;

    invoke-direct {v2, v0}, Lqz1/b$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lcom/whoop/nativestore/home/domain/model/ShopBannerCarouselModel;)Luz1/o;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lqz1/b;->e(Lcom/whoop/nativestore/home/domain/model/ShopBannerCarouselModel;)Luz1/o;

    move-result-object p0

    return-object p0
.end method
