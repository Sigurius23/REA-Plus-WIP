.class public final Lf70/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lf70/t0;",
        "",
        "Lwn0/b;",
        "passwordRequirementsFetcher",
        "Lvn0/e;",
        "passwordValidator",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lwn0/b;Lvn0/e;Ltr2/n;)V",
        "",
        "password",
        "",
        "a",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lwn0/b;",
        "b",
        "Lvn0/e;",
        "c",
        "Ltr2/n;",
        "activation_release"
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
.field private final a:Lwn0/b;

.field private final b:Lvn0/e;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lwn0/b;Lvn0/e;Ltr2/n;)V
    .locals 1

    const-string v0, "passwordRequirementsFetcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "passwordValidator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lf70/t0;->a:Lwn0/b;

    .line 3
    iput-object p2, p0, Lf70/t0;->b:Lvn0/e;

    .line 4
    iput-object p3, p0, Lf70/t0;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lwn0/b;Lvn0/e;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "PasswordComplianceCheckHandler"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lf70/t0;-><init>(Lwn0/b;Lvn0/e;Ltr2/n;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lf70/t0$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lf70/t0$a;

    iget v1, v0, Lf70/t0$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lf70/t0$a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lf70/t0$a;

    invoke-direct {v0, p0, p2}, Lf70/t0$a;-><init>(Lf70/t0;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lf70/t0$a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lf70/t0$a;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lf70/t0$a;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lf70/t0;->a:Lwn0/b;

    iput-object p1, v0, Lf70/t0$a;->w:Ljava/lang/Object;

    iput v3, v0, Lf70/t0$a;->z:I

    invoke-virtual {p2, v0}, Lwn0/b;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lwn0/a;

    instance-of v0, p2, Lwn0/a$b;

    const/4 v1, 0x0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lf70/t0;->b:Lvn0/e;

    check-cast p2, Lwn0/a$b;

    invoke-virtual {p2}, Lwn0/a$b;->a()Ljava/util/List;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lvn0/e;->a(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of p2, p1, Ljava/util/Collection;

    if-eqz p2, :cond_5

    move-object p2, p1

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_5

    :cond_4
    move v3, v1

    goto :goto_2

    :cond_5
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lwn0/g;

    invoke-virtual {p2}, Lwn0/g;->b()Z

    move-result p2

    if-nez p2, :cond_6

    :goto_2
    move v1, v3

    goto :goto_3

    :cond_7
    instance-of p1, p2, Lwn0/a$a;

    if-eqz p1, :cond_8

    iget-object p1, p0, Lf70/t0;->c:Ltr2/n;

    check-cast p2, Lwn0/a$a;

    invoke-virtual {p2}, Lwn0/a$a;->a()Lwn0/c;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Failed to fetch password requirements (non-blocking), treating as compliant. Error: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array v0, v1, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_3
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
