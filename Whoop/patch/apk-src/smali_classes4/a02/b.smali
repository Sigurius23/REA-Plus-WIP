.class public final La02/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f*\u00020\u000c2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\rH\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J)\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\u0019\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u001cR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "La02/b;",
        "",
        "Leb/a0;",
        "navController",
        "Lj02/o0;",
        "navigator",
        "Lao2/a;",
        "cartIndicatorRepository",
        "Lwz1/a;",
        "analyticsHelper",
        "<init>",
        "(Leb/a0;Lj02/o0;Lao2/a;Lwz1/a;)V",
        "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;",
        "",
        "storeDomain",
        "Lj02/m0$i5;",
        "c",
        "(Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;Ljava/lang/String;)Lj02/m0$i5;",
        "Lb02/c$i;",
        "event",
        "productName",
        "price",
        "Ll83/a0;",
        "a",
        "(Lb02/c$i;Ljava/lang/String;Ljava/lang/String;)V",
        "b",
        "Leb/a0;",
        "Lj02/o0;",
        "Lao2/a;",
        "d",
        "Lwz1/a;",
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
.field private final a:Leb/a0;

.field private final b:Lj02/o0;

.field private final c:Lao2/a;

.field private final d:Lwz1/a;


# direct methods
.method public constructor <init>(Leb/a0;Lj02/o0;Lao2/a;Lwz1/a;)V
    .locals 1

    const-string v0, "navController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cartIndicatorRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La02/b;->a:Leb/a0;

    iput-object p2, p0, La02/b;->b:Lj02/o0;

    iput-object p3, p0, La02/b;->c:Lao2/a;

    iput-object p4, p0, La02/b;->d:Lwz1/a;

    return-void
.end method

.method private final a(Lb02/c$i;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-nez p2, :cond_0

    return-void

    :cond_0
    sget-object v0, Lb02/c$b;->a:Lb02/c$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, La02/b;->d:Lwz1/a;

    invoke-virtual {p1, p2, p3}, Lwz1/a;->g(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    instance-of v0, p1, Lb02/c$a;

    if-eqz v0, :cond_2

    iget-object p1, p0, La02/b;->d:Lwz1/a;

    invoke-virtual {p1, p2, p3}, Lwz1/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    instance-of v0, p1, Lb02/c$d;

    if-eqz v0, :cond_3

    iget-object p1, p0, La02/b;->d:Lwz1/a;

    invoke-virtual {p1, p2, p3}, Lwz1/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    instance-of v0, p1, Lb02/c$e;

    if-eqz v0, :cond_4

    iget-object p1, p0, La02/b;->d:Lwz1/a;

    invoke-virtual {p1, p2, p3}, Lwz1/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_4
    instance-of p1, p1, Lb02/c$c;

    if-eqz p1, :cond_5

    return-void

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final c(Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;Ljava/lang/String;)Lj02/m0$i5;
    .locals 15

    move-object/from16 v0, p1

    instance-of v1, v0, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Standalone;

    if-eqz v1, :cond_0

    new-instance v2, Lj02/m0$i5;

    check-cast v0, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Standalone;

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Standalone;->getSku()Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0xfe

    const/4 v13, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v11, p2

    invoke-direct/range {v2 .. v13}, Lj02/m0$i5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_0
    instance-of v1, v0, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Pack;

    if-eqz v1, :cond_1

    new-instance v3, Lj02/m0$i5;

    check-cast v0, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Pack;

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Pack;->getPackSku()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Pack;->getChildItemSkus()Ljava/util/List;

    move-result-object v6

    const/16 v13, 0xf9

    const/4 v14, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v12, p2

    invoke-direct/range {v3 .. v14}, Lj02/m0$i5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_1
    instance-of v1, v0, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;

    if-eqz v1, :cond_2

    new-instance v3, Lj02/m0$i5;

    check-cast v0, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;->getWywSku()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;->getBandSku()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;->getClaspSku()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;->getHookSku()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;->getFastLinkSku()Ljava/lang/String;

    move-result-object v11

    const/4 v13, 0x7

    const/4 v14, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v12, p2

    invoke-direct/range {v3 .. v14}, Lj02/m0$i5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method


# virtual methods
.method public final b(Lb02/c$i;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, La02/b;->a(Lb02/c$i;Ljava/lang/String;Ljava/lang/String;)V

    sget-object p2, Lb02/c$b;->a:Lb02/c$b;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p1, p0, La02/b;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_0
    instance-of p2, p1, Lb02/c$a;

    if-eqz p2, :cond_1

    iget-object p2, p0, La02/b;->b:Lj02/o0;

    sget-object p3, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;->Companion:Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$a;

    check-cast p1, Lb02/c$a;

    invoke-virtual {p1}, Lb02/c$a;->a()Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$a;->d(Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;)Ljava/lang/String;

    move-result-object v4

    iget-object p1, p0, La02/b;->c:Lao2/a;

    invoke-virtual {p1}, Lao2/a;->h()Lec3/f2;

    move-result-object p1

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lao2/b;

    invoke-virtual {p1}, Lao2/b;->a()Ljava/lang/String;

    move-result-object v1

    new-instance v0, Lj02/m0$j5;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v6}, Lj02/m0$j5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p2, v0}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_1
    instance-of p2, p1, Lb02/c$d;

    if-eqz p2, :cond_2

    iget-object p2, p0, La02/b;->b:Lj02/o0;

    check-cast p1, Lb02/c$d;

    invoke-virtual {p1}, Lb02/c$d;->a()Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;

    move-result-object p3

    invoke-virtual {p1}, Lb02/c$d;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p3, p1}, La02/b;->c(Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;Ljava/lang/String;)Lj02/m0$i5;

    move-result-object p1

    invoke-interface {p2, p1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_2
    instance-of p2, p1, Lb02/c$e;

    if-eqz p2, :cond_3

    iget-object p2, p0, La02/b;->b:Lj02/o0;

    check-cast p1, Lb02/c$e;

    invoke-virtual {p1}, Lb02/c$e;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p2, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_3
    instance-of p2, p1, Lb02/c$c;

    if-eqz p2, :cond_4

    iget-object p2, p0, La02/b;->b:Lj02/o0;

    check-cast p1, Lb02/c$c;

    invoke-virtual {p1}, Lb02/c$c;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p2, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
