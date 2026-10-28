.class public final Landroidx/health/platform/client/proto/k1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(ILjava/lang/Object;Ljava/lang/Object;)I
    .locals 5

    check-cast p1, Landroidx/health/platform/client/proto/j1;

    check-cast p2, Landroidx/health/platform/client/proto/i1;

    invoke-virtual {p1}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Landroidx/health/platform/client/proto/j1;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v3

    iget-object v4, p2, Landroidx/health/platform/client/proto/i1;->a:Landroidx/health/platform/client/proto/h1;

    invoke-static {v4, v2, v0}, Landroidx/health/platform/client/proto/i1;->a(Landroidx/health/platform/client/proto/h1;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0, v0, v3, v1}, Lr;->c(IIII)I

    move-result v1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static b(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/health/platform/client/proto/j1;
    .locals 1

    check-cast p0, Landroidx/health/platform/client/proto/j1;

    check-cast p1, Landroidx/health/platform/client/proto/j1;

    invoke-virtual {p1}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Landroidx/health/platform/client/proto/j1;->w:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/j1;->c()Landroidx/health/platform/client/proto/j1;

    move-result-object p0

    :cond_0
    invoke-virtual {p0}, Landroidx/health/platform/client/proto/j1;->b()V

    invoke-virtual {p1}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroidx/health/platform/client/proto/j1;->putAll(Ljava/util/Map;)V

    :cond_1
    return-object p0
.end method
