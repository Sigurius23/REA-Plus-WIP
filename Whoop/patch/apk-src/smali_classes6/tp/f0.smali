.class public final Ltp/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    check-cast p1, Ltp/b;

    check-cast p2, Ltp/b;

    invoke-static {p1}, Luo/w;->f(Ljava/lang/Object;)V

    invoke-static {p2}, Luo/w;->f(Ljava/lang/Object;)V

    iget v0, p1, Ltp/b;->w:I

    iget v1, p2, Ltp/b;->w:I

    if-eq v0, v1, :cond_0

    if-lt v0, v1, :cond_2

    goto :goto_0

    :cond_0
    iget p1, p1, Ltp/b;->x:I

    iget p2, p2, Ltp/b;->x:I

    if-ne p1, p2, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    if-ge p1, p2, :cond_3

    :cond_2
    const/4 p1, -0x1

    return p1

    :cond_3
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
