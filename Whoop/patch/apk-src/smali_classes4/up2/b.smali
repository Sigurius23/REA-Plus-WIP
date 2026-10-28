.class public final Lup2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lup2/b;",
        "",
        "Lj02/o0;",
        "navigator",
        "Leb/a0;",
        "navController",
        "Lqp2/a;",
        "analyticsHelper",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lj02/o0;Leb/a0;Lqp2/a;Ltr2/n;)V",
        "Lm91/u;",
        "Ll83/a0;",
        "a",
        "(Lm91/u;)V",
        "Lvp2/a$g;",
        "event",
        "b",
        "(Lvp2/a$g;)V",
        "Lj02/o0;",
        "Leb/a0;",
        "c",
        "Lqp2/a;",
        "d",
        "Ltr2/n;",
        "universal-checkout_release"
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
.field private final a:Lj02/o0;

.field private final b:Leb/a0;

.field private final c:Lqp2/a;

.field private final d:Ltr2/n;


# direct methods
.method public constructor <init>(Lj02/o0;Leb/a0;Lqp2/a;Ltr2/n;)V
    .locals 1

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lup2/b;->a:Lj02/o0;

    .line 3
    iput-object p2, p0, Lup2/b;->b:Leb/a0;

    .line 4
    iput-object p3, p0, Lup2/b;->c:Lqp2/a;

    .line 5
    iput-object p4, p0, Lup2/b;->d:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lj02/o0;Leb/a0;Lqp2/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 6
    sget-object p4, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "ShippingMethodNavigationRouter"

    invoke-virtual {p4, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p4

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lup2/b;-><init>(Lj02/o0;Leb/a0;Lqp2/a;Ltr2/n;)V

    return-void
.end method

.method private final a(Lm91/u;)V
    .locals 3

    iget-object v0, p0, Lup2/b;->d:Ltr2/n;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "itemClicked "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method


# virtual methods
.method public final b(Lvp2/a$g;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lvp2/a$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lup2/b;->a:Lj02/o0;

    check-cast p1, Lvp2/a$c;

    invoke-virtual {p1}, Lvp2/a$c;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_0
    instance-of v0, p1, Lvp2/a$b;

    if-eqz v0, :cond_1

    check-cast p1, Lvp2/a$b;

    invoke-virtual {p1}, Lvp2/a$b;->a()Lm91/u;

    move-result-object p1

    invoke-direct {p0, p1}, Lup2/b;->a(Lm91/u;)V

    return-void

    :cond_1
    instance-of p1, p1, Lvp2/a$e;

    if-eqz p1, :cond_3

    sget-object p1, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$e;->a:Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$e;

    iget-object v0, p0, Lup2/b;->b:Leb/a0;

    invoke-virtual {p1, v0}, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$e;->d(Leb/a0;)Lvp2/a$a;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, Lup2/b;->c:Lqp2/a;

    invoke-virtual {v0, p1}, Lqp2/a;->a(Lvp2/a$a;)V

    :cond_2
    return-void

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
