.class public interface abstract Lgf/t;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract b()Ljava/util/Set;
.end method

.method public c(Lc93/m;)V
    .locals 3

    invoke-interface {p0}, Lgf/t;->b()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {p1, v2, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public abstract d()Z
.end method

.method public abstract e(Ljava/lang/String;)Ljava/util/List;
.end method

.method public abstract f()Z
.end method

.method public get(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p0, p1}, Lgf/t;->e(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public abstract isEmpty()Z
.end method
