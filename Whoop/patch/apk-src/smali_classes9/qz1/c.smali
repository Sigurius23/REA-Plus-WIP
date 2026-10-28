.class public abstract Lqz1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/nativestore/home/domain/model/ShopCategoryModel;",
        "Luz1/u;",
        "e",
        "(Lcom/whoop/nativestore/home/domain/model/ShopCategoryModel;)Luz1/u;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "d",
        "()Ljb1/a;",
        "shopCategoryReducer",
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

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lqt2/w;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lqz1/c;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqz1/c;->g(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/nativestore/home/domain/model/ShopCategoryModel;)Luz1/u;
    .locals 0

    invoke-static {p0}, Lqz1/c;->h(Lcom/whoop/nativestore/home/domain/model/ShopCategoryModel;)Luz1/u;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqz1/c;->f(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Ljb1/a;
    .locals 1

    sget-object v0, Lqz1/c;->a:Ljb1/a;

    return-object v0
.end method

.method public static final e(Lcom/whoop/nativestore/home/domain/model/ShopCategoryModel;)Luz1/u;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/nativestore/home/domain/model/ShopCategoryModel;->getImageUrl()Ljava/lang/String;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/whoop/nativestore/home/domain/model/ShopCategoryModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    move-object v3, v0

    invoke-virtual {p0}, Lcom/whoop/nativestore/home/domain/model/ShopCategoryModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/nativestore/home/domain/model/ShopCategoryModel;->getInternalName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/nativestore/home/domain/model/ShopCategoryModel;->getAnalyticsValue()Ljava/lang/String;

    move-result-object v5

    move-object v2, v1

    new-instance v1, Luz1/u;

    invoke-direct/range {v1 .. v6}, Luz1/u;-><init>(Lkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V

    return-object v1
.end method

.method private static final f(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqt2/w;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lqt2/w;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqt2/w;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lqt2/w;-><init>(I)V

    const-class v1, Lcom/whoop/nativestore/home/domain/model/ShopCategoryModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lqz1/c$a;

    invoke-direct {v2, v0}, Lqz1/c$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lcom/whoop/nativestore/home/domain/model/ShopCategoryModel;)Luz1/u;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lqz1/c;->e(Lcom/whoop/nativestore/home/domain/model/ShopCategoryModel;)Luz1/u;

    move-result-object p0

    return-object p0
.end method
