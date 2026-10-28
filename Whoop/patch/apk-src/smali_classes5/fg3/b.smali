.class public interface abstract Lfg3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a()Z
.end method

.method public abstract b()Z
.end method

.method public varargs abstract c(Ljava/lang/String;[Ljava/lang/Object;)V
.end method

.method public abstract d()Z
.end method

.method public abstract debug(Ljava/lang/String;)V
.end method

.method public abstract e()Z
.end method

.method public abstract error(Ljava/lang/String;)V
.end method

.method public varargs abstract f(Ljava/lang/String;[Ljava/lang/Object;)V
.end method

.method public g(I)Lig3/a;
    .locals 1

    invoke-interface {p0, p1}, Lfg3/b;->t(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0, p1}, Lfg3/b;->m(I)Lig3/a;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Lig3/c;->w:Lig3/c;

    return-object p1
.end method

.method public abstract getName()Ljava/lang/String;
.end method

.method public varargs abstract h(Ljava/lang/String;[Ljava/lang/Object;)V
.end method

.method public abstract i(Ljava/lang/String;Ljava/lang/Throwable;)V
.end method

.method public abstract info(Ljava/lang/String;)V
.end method

.method public abstract j(Ljava/lang/String;Ljava/lang/Throwable;)V
.end method

.method public abstract k(Ljava/lang/String;Ljava/lang/Throwable;)V
.end method

.method public varargs abstract l(Ljava/lang/String;[Ljava/lang/Object;)V
.end method

.method public m(I)Lig3/a;
    .locals 1

    new-instance v0, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v0, p0, p1}, Lio/sentry/internal/debugmeta/c;-><init>(Lfg3/b;I)V

    return-object v0
.end method

.method public abstract n(Ljava/lang/String;Ljava/lang/Throwable;)V
.end method

.method public abstract o(Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Object;)V
.end method

.method public abstract p()Z
.end method

.method public abstract q(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;)V
.end method

.method public abstract r(Ljava/lang/String;Ljava/lang/Throwable;)V
.end method

.method public abstract s(Ljava/lang/String;)V
.end method

.method public t(I)Z
    .locals 3

    invoke-static {p1}, Lev/n;->d(I)I

    move-result v0

    if-eqz v0, :cond_4

    const/16 v1, 0xa

    if-eq v0, v1, :cond_3

    const/16 v1, 0x14

    if-eq v0, v1, :cond_2

    const/16 v1, 0x1e

    if-eq v0, v1, :cond_1

    const/16 v1, 0x28

    if-ne v0, v1, :cond_0

    invoke-interface {p0}, Lfg3/b;->p()Z

    move-result p1

    return p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Level ["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lev/n;->D(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "] not recognized."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-interface {p0}, Lfg3/b;->a()Z

    move-result p1

    return p1

    :cond_2
    invoke-interface {p0}, Lfg3/b;->d()Z

    move-result p1

    return p1

    :cond_3
    invoke-interface {p0}, Lfg3/b;->b()Z

    move-result p1

    return p1

    :cond_4
    invoke-interface {p0}, Lfg3/b;->e()Z

    move-result p1

    return p1
.end method

.method public varargs abstract u(Ljava/lang/String;[Ljava/lang/Object;)V
.end method

.method public abstract v(Ljava/lang/String;Ljava/lang/Number;)V
.end method

.method public abstract warn(Ljava/lang/String;)V
.end method
