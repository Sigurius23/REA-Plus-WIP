.class public final Lcom/iterable/iterableapi/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    check-cast p1, Lcom/iterable/iterableapi/j1;

    check-cast p2, Lcom/iterable/iterableapi/j1;

    invoke-virtual {p1}, Lcom/iterable/iterableapi/j1;->h()D

    move-result-wide v0

    invoke-virtual {p2}, Lcom/iterable/iterableapi/j1;->h()D

    move-result-wide v2

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    invoke-virtual {p1}, Lcom/iterable/iterableapi/j1;->h()D

    move-result-wide v0

    invoke-virtual {p2}, Lcom/iterable/iterableapi/j1;->h()D

    move-result-wide p1

    cmpl-double p1, v0, p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method
