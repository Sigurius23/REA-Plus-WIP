.class public final Lpz1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lpz1/a;",
        "Lpz1/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ1\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00112\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J+\u0010\u0016\u001a\u00020\u0003*\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ#\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00112\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Lpz1/d;",
        "Lod1/g;",
        "Lpz1/a;",
        "Lpz1/b;",
        "Lnm0/e;",
        "cachedApiSource",
        "Lao2/a;",
        "cartIndicatorRepository",
        "Lxm0/b;",
        "cacheUpdater",
        "<init>",
        "(Lnm0/e;Lao2/a;Lxm0/b;)V",
        "",
        "country",
        "source",
        "",
        "showCachedWhileUpdating",
        "Lec3/l;",
        "f",
        "(Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;",
        "Lpm0/a;",
        "Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;",
        "h",
        "(Lpm0/a;Ljava/lang/String;Z)Lpz1/b;",
        "response",
        "Ll83/a0;",
        "g",
        "(Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;)V",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lnm0/e;",
        "b",
        "Lao2/a;",
        "c",
        "Lxm0/b;",
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
.field private final a:Lnm0/e;

.field private final b:Lao2/a;

.field private final c:Lxm0/b;


# direct methods
.method public constructor <init>(Lnm0/e;Lao2/a;Lxm0/b;)V
    .locals 1

    const-string v0, "cachedApiSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cartIndicatorRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cacheUpdater"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpz1/d;->a:Lnm0/e;

    iput-object p2, p0, Lpz1/d;->b:Lao2/a;

    iput-object p3, p0, Lpz1/d;->c:Lxm0/b;

    return-void
.end method

.method public static final synthetic c(Lpz1/d;Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lpz1/d;->f(Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lpz1/d;)Lxm0/b;
    .locals 0

    iget-object p0, p0, Lpz1/d;->c:Lxm0/b;

    return-object p0
.end method

.method public static final synthetic e(Lpz1/d;Lpm0/a;Ljava/lang/String;Z)Lpz1/b;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lpz1/d;->h(Lpm0/a;Ljava/lang/String;Z)Lpz1/b;

    move-result-object p0

    return-object p0
.end method

.method private final f(Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/nativestore/home/domain/api/GetShopHomeRequest;

    invoke-direct {v0, p1, p2}, Lcom/whoop/nativestore/home/domain/api/GetShopHomeRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p2, La6/u;

    const/4 v1, 0x1

    invoke-direct {p2, v0, v1}, La6/u;-><init>(Ljava/lang/Object;I)V

    const-string v0, "cycle"

    const-string v1, "ShopHomeRefreshScope"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p2, v0, v2, v1, v2}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object p2

    iget-object v0, p0, Lpz1/d;->a:Lnm0/e;

    new-instance v1, Lpz1/d$a;

    invoke-direct {v1, v2, v0}, Lpz1/d$a;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {p2, v1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p2

    new-instance v0, Lpz1/d$b;

    invoke-direct {v0, p2, p0, p1, p3}, Lpz1/d$b;-><init>(Lec3/l;Lpz1/d;Ljava/lang/String;Z)V

    return-object v0
.end method

.method private final g(Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;)V
    .locals 2

    invoke-virtual {p1}, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->getCart()Lcom/whoop/nativestore/home/domain/model/CartIndicator;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lpz1/d;->b:Lao2/a;

    invoke-virtual {p1}, Lcom/whoop/nativestore/home/domain/model/CartIndicator;->getCartIndicatorQuantity()I

    move-result v1

    invoke-virtual {p1}, Lcom/whoop/nativestore/home/domain/model/CartIndicator;->getDestination()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lao2/a;->j(ILcom/whoop/navigation/e;)V

    return-void

    :cond_0
    iget-object p1, p0, Lpz1/d;->b:Lao2/a;

    invoke-virtual {p1}, Lao2/a;->f()V

    return-void
.end method

.method private final h(Lpm0/a;Ljava/lang/String;Z)Lpz1/b;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpm0/a<",
            "Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;",
            ">;",
            "Ljava/lang/String;",
            "Z)",
            "Lpz1/b;"
        }
    .end annotation

    instance-of v0, p1, Lpm0/a$e;

    if-eqz v0, :cond_0

    new-instance p1, Lpz1/b;

    sget-object p3, Lpz1/c$c;->a:Lpz1/c$c;

    invoke-direct {p1, p3, p2}, Lpz1/b;-><init>(Lpz1/c;Ljava/lang/String;)V

    return-object p1

    :cond_0
    instance-of v0, p1, Lpm0/a$a$b;

    if-eqz v0, :cond_2

    if-eqz p3, :cond_1

    check-cast p1, Lpm0/a$a$b;

    invoke-virtual {p1}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;

    invoke-direct {p0, p3}, Lpz1/d;->g(Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;)V

    new-instance p3, Lpz1/b;

    new-instance v0, Lpz1/c$b;

    invoke-virtual {p1}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lpz1/c$b;-><init>(Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;Z)V

    invoke-direct {p3, v0, p2}, Lpz1/b;-><init>(Lpz1/c;Ljava/lang/String;)V

    return-object p3

    :cond_1
    new-instance p1, Lpz1/b;

    sget-object p3, Lpz1/c$c;->a:Lpz1/c$c;

    invoke-direct {p1, p3, p2}, Lpz1/b;-><init>(Lpz1/c;Ljava/lang/String;)V

    return-object p1

    :cond_2
    instance-of v0, p1, Lpm0/a$a$a;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eqz v0, :cond_3

    check-cast p1, Lpm0/a$a$a;

    invoke-virtual {p1}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;

    invoke-direct {p0, p3}, Lpz1/d;->g(Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;)V

    new-instance p3, Lpz1/b;

    new-instance v0, Lpz1/c$b;

    invoke-virtual {p1}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;

    invoke-direct {v0, p1, v3, v2, v1}, Lpz1/c$b;-><init>(Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p3, v0, p2}, Lpz1/b;-><init>(Lpz1/c;Ljava/lang/String;)V

    return-object p3

    :cond_3
    instance-of v0, p1, Lpm0/a$d;

    if-eqz v0, :cond_5

    if-eqz p3, :cond_4

    move-object p3, p1

    check-cast p3, Lpm0/a$d;

    invoke-virtual {p3}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;

    invoke-direct {p0, p3}, Lpz1/d;->g(Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;)V

    :cond_4
    new-instance p3, Lpz1/b;

    new-instance v0, Lpz1/c$b;

    check-cast p1, Lpm0/a$d;

    invoke-virtual {p1}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;

    invoke-direct {v0, p1, v3, v2, v1}, Lpz1/c$b;-><init>(Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p3, v0, p2}, Lpz1/b;-><init>(Lpz1/c;Ljava/lang/String;)V

    return-object p3

    :cond_5
    instance-of p1, p1, Lpm0/a$c;

    if-eqz p1, :cond_6

    new-instance p1, Lpz1/b;

    sget-object p3, Lpz1/c$a;->a:Lpz1/c$a;

    invoke-direct {p1, p3, p2}, Lpz1/b;-><init>(Lpz1/c;Ljava/lang/String;)V

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpz1/d$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lpz1/d$c;-><init>(Lq83/d;Lpz1/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
