.class public interface abstract Log/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static k(Lgm/r;Lvv1/c;)V
    .locals 3

    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Lq83/j;

    iget-object p0, p0, Lgm/r;->z:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Log/b;->y:Log/b;

    const/4 v2, 0x0

    invoke-static {v0, v1, p0, v2, p1}, Lvd/f;->A(Lq83/j;Log/b;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public static synthetic l(Log/g;Lc93/a;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0, p1}, Log/g;->n(Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public static synthetic m(Log/g;Lc93/a;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0, p1}, Log/g;->u(Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public static synthetic p(Log/g;Lc93/a;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0, p1}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method


# virtual methods
.method public abstract g(Log/b;)Log/e;
.end method

.method public abstract j(Log/b;)Z
.end method

.method public abstract n(Ljava/lang/Throwable;Lc93/a;)V
.end method

.method public abstract s(Ljava/lang/Throwable;Lc93/a;)V
.end method

.method public abstract u(Ljava/lang/Throwable;Lc93/a;)V
.end method
