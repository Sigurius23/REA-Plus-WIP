.class public abstract Li92/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lbh3/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbh3/g;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li5/c;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Li5/c;-><init>(I)V

    sput-object v0, Li92/s;->a:Lbh3/g;

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Li92/p;Lpg3/v0;)Lpg3/v0;
    .locals 0

    invoke-static {p0, p1, p2}, Li92/s;->i(Ljava/lang/String;Li92/p;Lpg3/v0;)Lpg3/v0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Li92/p;Ljava/lang/Throwable;)Lpg3/v0;
    .locals 0

    invoke-static {p0, p1}, Li92/s;->h(Li92/p;Ljava/lang/Throwable;)Lpg3/v0;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lxg3/g;)Llh3/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lxg3/g<",
            "TT;>;)",
            "Llh3/k;"
        }
    .end annotation

    invoke-static {}, Lze1/d;->Y()Lze1/d;

    move-result-object v0

    invoke-virtual {p0, v0}, Lxg3/g;->M(Lxg3/h;)Lxg3/t;

    return-object v0
.end method

.method public static d(Ljava/lang/Throwable;)Z
    .locals 1

    :goto_0
    if-eqz p0, :cond_2

    instance-of v0, p0, Ljava/net/UnknownHostException;

    if-nez v0, :cond_1

    instance-of v0, p0, Ljava/net/SocketTimeoutException;

    if-nez v0, :cond_1

    instance-of v0, p0, Ljava/net/SocketException;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    goto :goto_0

    :cond_1
    :goto_1
    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method private static e(Lxg3/g;Li92/p;)Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lxg3/g<",
            "Lpg3/v0<",
            "TT;>;>;",
            "Li92/p;",
            ")",
            "Lxg3/g<",
            "Lpg3/v0<",
            "TT;>;>;"
        }
    .end annotation

    new-instance v0, Li92/r;

    invoke-direct {v0, p1}, Li92/r;-><init>(Li92/p;)V

    invoke-virtual {p0, v0}, Lxg3/g;->H(Lbh3/g;)Lxg3/g;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lpg3/v0;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpg3/v0<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lpg3/v0;->a:Lud3/x0;

    iget v1, v1, Lud3/x0;->z:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lpg3/v0;->a:Lud3/x0;

    iget-object p0, p0, Lud3/x0;->y:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static g(Lpg3/v0;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpg3/v0<",
            "*>;)Z"
        }
    .end annotation

    if-eqz p0, :cond_0

    iget-object p0, p0, Lpg3/v0;->a:Lud3/x0;

    iget-boolean p0, p0, Lud3/x0;->Q:Z

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static h(Li92/p;Ljava/lang/Throwable;)Lpg3/v0;
    .locals 1

    const-string v0, "converting to response"

    invoke-static {p0, p1, v0}, Li92/s;->j(Li92/p;Ljava/lang/Throwable;Ljava/lang/String;)V

    sget-object p0, Lud3/a1;->x:Lud3/z0;

    const-string p0, ""

    const/4 p1, 0x0

    invoke-static {p0, p1}, Ldt/b;->k(Ljava/lang/String;Lud3/h0;)Lud3/z0;

    move-result-object p0

    const/16 p1, 0x28a

    invoke-static {p1, p0}, Lpg3/v0;->a(ILud3/a1;)Lpg3/v0;

    move-result-object p0

    return-object p0
.end method

.method private static i(Ljava/lang/String;Li92/p;Lpg3/v0;)Lpg3/v0;
    .locals 4

    iget-object v0, p2, Lpg3/v0;->a:Lud3/x0;

    iget v1, v0, Lud3/x0;->z:I

    iget-boolean v0, v0, Lud3/x0;->Q:Z

    if-nez v0, :cond_2

    const/16 v0, 0x190

    if-ge v1, v0, :cond_2

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Response unsuccessful: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-nez v0, :cond_0

    const-string v0, ": "

    invoke-static {p0, v0}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const-string p0, ""

    :goto_0
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Li92/s;->f(Lpg3/v0;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x130

    const/4 v2, 0x0

    const-string v3, "Web Error"

    if-ne v1, v0, :cond_1

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object p1

    invoke-virtual {p1}, Le50/b;->d()Ltr2/n;

    move-result-object p1

    new-array v0, v2, [Lqr2/a$a;

    invoke-interface {p1, v3, p0, v0}, Ltr2/n;->e(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    return-object p2

    :cond_1
    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object v0

    invoke-virtual {v0}, Le50/b;->d()Ltr2/n;

    move-result-object v0

    new-array v1, v2, [Lqr2/a$a;

    invoke-interface {v0, v3, p0, p1, v1}, Ltr2/n;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_2
    return-object p2
.end method

.method private static j(Li92/p;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Caught network error, "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Li92/s;->d(Ljava/lang/Throwable;)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p1, " (Network IO Exception)"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Li92/p;->a(Ljava/lang/Throwable;)Li92/p;

    :goto_0
    const-string p1, "(networkState="

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class p1, Li92/e;

    const/4 v1, 0x0

    invoke-static {p1, v1, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li92/e;

    invoke-interface {p1}, Li92/e;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p1, 0x0

    const-string v1, "Web Error"

    if-eqz p2, :cond_1

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object p0

    invoke-virtual {p0}, Le50/b;->d()Ltr2/n;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array p1, p1, [Lqr2/a$a;

    invoke-interface {p0, v1, p2, p1}, Ltr2/n;->p(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_1
    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object p2

    invoke-virtual {p2}, Le50/b;->d()Ltr2/n;

    move-result-object p2

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array p1, p1, [Lqr2/a$a;

    invoke-interface {p2, v1, v0, p0, p1}, Ltr2/n;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-void
.end method

.method public static k(Lxg3/g;Ljava/lang/String;Li92/p;)Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lxg3/g<",
            "Lpg3/v0<",
            "TT;>;>;",
            "Ljava/lang/String;",
            "Li92/p;",
            ")",
            "Lxg3/g<",
            "Lpg3/v0<",
            "TT;>;>;"
        }
    .end annotation

    new-instance v0, Li92/q;

    invoke-direct {v0, p1, p2}, Li92/q;-><init>(Ljava/lang/String;Li92/p;)V

    invoke-virtual {p0, v0}, Lxg3/g;->x(Lbh3/g;)Lxg3/g;

    move-result-object p0

    return-object p0
.end method

.method public static l(Ljava/lang/Throwable;)Ljava/lang/Exception;
    .locals 1

    new-instance v0, Li92/k;

    invoke-direct {v0, p0}, Li92/k;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0}, Li92/k;->e()Lcom/whoop/network/exception/DomainException;

    move-result-object p0

    return-object p0
.end method

.method public static m(Lxg3/g;)Llh3/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lxg3/g<",
            "Lpg3/v0<",
            "TT;>;>;)",
            "Llh3/k;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, v0}, Li92/s;->n(Lxg3/g;Ljava/lang/String;)Llh3/k;

    move-result-object p0

    return-object p0
.end method

.method public static n(Lxg3/g;Ljava/lang/String;)Llh3/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lxg3/g<",
            "Lpg3/v0<",
            "TT;>;>;",
            "Ljava/lang/String;",
            ")",
            "Llh3/k;"
        }
    .end annotation

    invoke-static {}, Lkh3/a;->a()Lkh3/a;

    move-result-object v0

    iget-object v0, v0, Lkh3/a;->b:Leh3/e;

    invoke-static {p0, p1, v0}, Li92/s;->o(Lxg3/g;Ljava/lang/String;Lxg3/k;)Llh3/k;

    move-result-object p0

    return-object p0
.end method

.method public static o(Lxg3/g;Ljava/lang/String;Lxg3/k;)Llh3/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lxg3/g<",
            "Lpg3/v0<",
            "TT;>;>;",
            "Ljava/lang/String;",
            "Lxg3/k;",
            ")",
            "Llh3/k;"
        }
    .end annotation

    new-instance v0, Li92/p;

    invoke-direct {v0}, Li92/p;-><init>()V

    invoke-virtual {p0, p2}, Lxg3/g;->P(Lxg3/k;)Lxg3/g;

    move-result-object p0

    invoke-static {p0, v0}, Li92/s;->e(Lxg3/g;Li92/p;)Lxg3/g;

    move-result-object p0

    invoke-static {p0, p1, v0}, Li92/s;->k(Lxg3/g;Ljava/lang/String;Li92/p;)Lxg3/g;

    move-result-object p0

    invoke-static {p0}, Li92/s;->c(Lxg3/g;)Llh3/k;

    move-result-object p0

    return-object p0
.end method
