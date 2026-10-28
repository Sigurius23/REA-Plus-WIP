.class public final Ll0/z0;
.super Lc0/k1;
.source "SourceFile"


# instance fields
.field public P:Ll0/a1;

.field public Q:Z


# virtual methods
.method public final E(La3/w0;Ly2/q0;I)I
    .locals 1

    iget-object p1, p0, Ll0/z0;->P:Ll0/a1;

    sget-object v0, Ll0/a1;->w:Ll0/a1;

    if-ne p1, v0, :cond_0

    invoke-interface {p2, p3}, Ly2/q0;->C(I)I

    move-result p1

    return p1

    :cond_0
    invoke-interface {p2, p3}, Ly2/q0;->b(I)I

    move-result p1

    return p1
.end method

.method public final X0(Ly2/q0;J)J
    .locals 2

    iget-object v0, p0, Ll0/z0;->P:Ll0/a1;

    sget-object v1, Ll0/a1;->w:Ll0/a1;

    if-ne v0, v1, :cond_0

    invoke-static {p2, p3}, Ly3/a;->i(J)I

    move-result p2

    invoke-interface {p1, p2}, Ly2/q0;->C(I)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-static {p2, p3}, Ly3/a;->i(J)I

    move-result p2

    invoke-interface {p1, p2}, Ly2/q0;->b(I)I

    move-result p1

    :goto_0
    const/4 p2, 0x0

    if-gez p1, :cond_1

    move p1, p2

    :cond_1
    if-ltz p1, :cond_2

    goto :goto_1

    :cond_2
    const-string p3, "height must be >= 0"

    invoke-static {p3}, Ly3/i;->a(Ljava/lang/String;)V

    :goto_1
    const p3, 0x7fffffff

    invoke-static {p2, p3, p1, p1}, Ly3/b;->h(IIII)J

    move-result-wide p1

    return-wide p1
.end method

.method public final Y0()Z
    .locals 1

    iget-boolean v0, p0, Ll0/z0;->Q:Z

    return v0
.end method

.method public final y(La3/w0;Ly2/q0;I)I
    .locals 1

    iget-object p1, p0, Ll0/z0;->P:Ll0/a1;

    sget-object v0, Ll0/a1;->w:Ll0/a1;

    if-ne p1, v0, :cond_0

    invoke-interface {p2, p3}, Ly2/q0;->C(I)I

    move-result p1

    return p1

    :cond_0
    invoke-interface {p2, p3}, Ly2/q0;->b(I)I

    move-result p1

    return p1
.end method
