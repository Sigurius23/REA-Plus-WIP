.class public final Lwo2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0014R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lwo2/b;",
        "",
        "Lj02/o0;",
        "navigator",
        "Leb/a0;",
        "globalNavController",
        "navHostController",
        "Luo2/a;",
        "analyticsHelper",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lj02/o0;Leb/a0;Leb/a0;Luo2/a;Ltr2/n;)V",
        "Lxo2/a$g;",
        "event",
        "Ll83/a0;",
        "a",
        "(Lxo2/a$g;)V",
        "Lj02/o0;",
        "b",
        "Leb/a0;",
        "c",
        "d",
        "Luo2/a;",
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

.field private final c:Leb/a0;

.field private final d:Luo2/a;

.field private final e:Ltr2/n;


# direct methods
.method public constructor <init>(Lj02/o0;Leb/a0;Leb/a0;Luo2/a;Ltr2/n;)V
    .locals 1

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "globalNavController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navHostController"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lwo2/b;->a:Lj02/o0;

    .line 3
    iput-object p2, p0, Lwo2/b;->b:Leb/a0;

    .line 4
    iput-object p3, p0, Lwo2/b;->c:Leb/a0;

    .line 5
    iput-object p4, p0, Lwo2/b;->d:Luo2/a;

    .line 6
    iput-object p5, p0, Lwo2/b;->e:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lj02/o0;Leb/a0;Leb/a0;Luo2/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 7
    sget-object p5, Ltr2/n;->a:Ltr2/n$a;

    const-string p6, "ExternalWebCheckoutNavigationRouter"

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
    invoke-direct/range {v0 .. v5}, Lwo2/b;-><init>(Lj02/o0;Leb/a0;Leb/a0;Luo2/a;Ltr2/n;)V

    return-void
.end method


# virtual methods
.method public final a(Lxo2/a$g;)V
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lxo2/a$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lwo2/b;->a:Lj02/o0;

    check-cast p1, Lxo2/a$b;

    invoke-virtual {p1}, Lxo2/a$b;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_0
    instance-of v0, p1, Lxo2/a$f;

    if-eqz v0, :cond_1

    iget-object p1, p0, Lwo2/b;->d:Luo2/a;

    sget-object v0, Lxo2/a$c;->a:Lxo2/a$c;

    invoke-virtual {p1, v0}, Luo2/a;->a(Lxo2/a$a;)V

    iget-object p1, p0, Lwo2/b;->c:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_1
    instance-of v0, p1, Lxo2/a$h;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lwo2/b;->d:Luo2/a;

    sget-object v1, Lxo2/a$i;->a:Lxo2/a$i;

    invoke-virtual {v0, v1}, Luo2/a;->a(Lxo2/a$a;)V

    iget-object v0, p0, Lwo2/b;->b:Leb/a0;

    invoke-virtual {v0}, Leb/a0;->h()Leb/q;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Leb/q;->b()Landroidx/lifecycle/k1;

    move-result-object v0

    if-eqz v0, :cond_2

    check-cast p1, Lxo2/a$h;

    invoke-virtual {p1}, Lxo2/a$h;->a()Ljava/lang/String;

    move-result-object p1

    const-string v1, "externalCheckoutCartId"

    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    iget-object p1, p0, Lwo2/b;->c:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
