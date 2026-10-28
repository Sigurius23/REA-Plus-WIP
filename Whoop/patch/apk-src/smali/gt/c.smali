.class public interface abstract Lgt/c;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public a(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lgt/p;->a(Ljava/lang/Class;)Lgt/p;

    move-result-object p1

    invoke-interface {p0, p1}, Lgt/c;->h(Lgt/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d(Lgt/p;)Ljava/util/Set;
    .locals 0

    invoke-interface {p0, p1}, Lgt/c;->i(Lgt/p;)Lst/a;

    move-result-object p1

    invoke-interface {p1}, Lst/a;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    return-object p1
.end method

.method public e(Ljava/lang/Class;)Lst/a;
    .locals 0

    invoke-static {p1}, Lgt/p;->a(Ljava/lang/Class;)Lgt/p;

    move-result-object p1

    invoke-interface {p0, p1}, Lgt/c;->f(Lgt/p;)Lst/a;

    move-result-object p1

    return-object p1
.end method

.method public abstract f(Lgt/p;)Lst/a;
.end method

.method public h(Lgt/p;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p0, p1}, Lgt/c;->f(Lgt/p;)Lst/a;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {p1}, Lst/a;->get()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract i(Lgt/p;)Lst/a;
.end method
