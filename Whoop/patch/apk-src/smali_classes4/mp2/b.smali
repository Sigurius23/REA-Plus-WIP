.class public final Lmp2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lmp2/b;",
        "",
        "Lj02/o0;",
        "navigator",
        "Leb/a0;",
        "navController",
        "Lip2/a;",
        "analyticsHelper",
        "",
        "source",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lj02/o0;Leb/a0;Lip2/a;Ljava/lang/String;Ltr2/n;)V",
        "Lm91/u;",
        "Ll83/a0;",
        "a",
        "(Lm91/u;)V",
        "Lnp2/a$n;",
        "event",
        "b",
        "(Lnp2/a$n;)V",
        "Lj02/o0;",
        "Leb/a0;",
        "c",
        "Lip2/a;",
        "d",
        "Ljava/lang/String;",
        "e",
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

.field private final c:Lip2/a;

.field private final d:Ljava/lang/String;

.field private final e:Ltr2/n;


# direct methods
.method public constructor <init>(Lj02/o0;Leb/a0;Lip2/a;Ljava/lang/String;Ltr2/n;)V
    .locals 1

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lmp2/b;->a:Lj02/o0;

    .line 3
    iput-object p2, p0, Lmp2/b;->b:Leb/a0;

    .line 4
    iput-object p3, p0, Lmp2/b;->c:Lip2/a;

    .line 5
    iput-object p4, p0, Lmp2/b;->d:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lmp2/b;->e:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lj02/o0;Leb/a0;Lip2/a;Ljava/lang/String;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 7
    sget-object p5, Ltr2/n;->a:Ltr2/n$a;

    const-string p6, "ShippingAddressNavigationRouter"

    invoke-virtual {p5, p6}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p5

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 8
    invoke-direct/range {v0 .. v5}, Lmp2/b;-><init>(Lj02/o0;Leb/a0;Lip2/a;Ljava/lang/String;Ltr2/n;)V

    return-void
.end method

.method private final a(Lm91/u;)V
    .locals 3

    iget-object v0, p0, Lmp2/b;->e:Ltr2/n;

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
.method public final b(Lnp2/a$n;)V
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lnp2/a$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lmp2/b;->a:Lj02/o0;

    check-cast p1, Lnp2/a$c;

    invoke-virtual {p1}, Lnp2/a$c;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_0
    instance-of v0, p1, Lnp2/a$b;

    if-eqz v0, :cond_1

    check-cast p1, Lnp2/a$b;

    invoke-virtual {p1}, Lnp2/a$b;->a()Lm91/u;

    move-result-object p1

    invoke-direct {p0, p1}, Lmp2/b;->a(Lm91/u;)V

    return-void

    :cond_1
    instance-of p1, p1, Lnp2/a$l;

    if-eqz p1, :cond_3

    sget-object p1, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d;->a:Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d;

    iget-object v0, p0, Lmp2/b;->b:Leb/a0;

    iget-object v1, p0, Lmp2/b;->d:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d;->e(Leb/a0;Ljava/lang/String;)Lnp2/a$a;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, Lmp2/b;->c:Lip2/a;

    invoke-virtual {v0, p1}, Lip2/a;->a(Lnp2/a$a;)V

    :cond_2
    return-void

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
