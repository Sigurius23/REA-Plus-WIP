.class public final Lj92/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud3/g0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lj92/h;",
        "Lud3/g0;",
        "Ltr2/n;",
        "logger",
        "Lj92/t;",
        "topPrivateDomainHelper",
        "<init>",
        "(Ltr2/n;Lj92/t;)V",
        "Lud3/f0;",
        "chain",
        "Lud3/o0;",
        "a",
        "(Lud3/f0;)Lud3/o0;",
        "Lud3/e0;",
        "request",
        "",
        "b",
        "(Lud3/e0;)Z",
        "Lud3/x0;",
        "intercept",
        "(Lud3/f0;)Lud3/x0;",
        "w",
        "Ltr2/n;",
        "x",
        "Lj92/t;",
        "core_release"
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
.field private final w:Ltr2/n;

.field private final x:Lj92/t;


# direct methods
.method public constructor <init>(Ltr2/n;Lj92/t;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "topPrivateDomainHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lj92/h;->w:Ltr2/n;

    .line 3
    iput-object p2, p0, Lj92/h;->x:Lj92/t;

    return-void
.end method

.method public synthetic constructor <init>(Ltr2/n;Lj92/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    new-instance p2, Lj92/t;

    invoke-direct {p2}, Lj92/t;-><init>()V

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lj92/h;-><init>(Ltr2/n;Lj92/t;)V

    return-void
.end method

.method private final a(Lud3/f0;)Lud3/o0;
    .locals 3

    check-cast p1, Lae3/i;

    iget-object v0, p1, Lae3/i;->e:Lud3/o0;

    iget-object v0, v0, Lud3/o0;->a:Lud3/e0;

    invoke-direct {p0, v0}, Lj92/h;->b(Lud3/e0;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lj92/h;->w:Ltr2/n;

    iget-object p1, p1, Lae3/i;->e:Lud3/o0;

    iget-object v1, p1, Lud3/o0;->a:Lud3/e0;

    iget-object v1, v1, Lud3/e0;->d:Ljava/lang/String;

    const-string v2, "Non WHOOP domain, token will be not be included: "

    invoke-static {v2, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p1}, Lud3/o0;->b()Lud3/n0;

    move-result-object p1

    const-string v0, "Authorization"

    iget-object v1, p1, Lud3/n0;->c:Lkotlin/jvm/internal/k0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/k0;->j(Ljava/lang/String;)V

    new-instance v0, Lud3/o0;

    invoke-direct {v0, p1}, Lud3/o0;-><init>(Lud3/n0;)V

    return-object v0

    :cond_0
    iget-object p1, p1, Lae3/i;->e:Lud3/o0;

    return-object p1
.end method

.method private final b(Lud3/e0;)Z
    .locals 1

    iget-object v0, p0, Lj92/h;->x:Lj92/t;

    invoke-static {v0, p1}, Lj92/u;->b(Lj92/t;Lud3/e0;)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public intercept(Lud3/f0;)Lud3/x0;
    .locals 1

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lj92/h;->a(Lud3/f0;)Lud3/o0;

    move-result-object v0

    check-cast p1, Lae3/i;

    invoke-virtual {p1, v0}, Lae3/i;->b(Lud3/o0;)Lud3/x0;

    move-result-object p1

    return-object p1
.end method
