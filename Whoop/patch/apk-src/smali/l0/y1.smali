.class public final Ll0/y1;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/c0;


# instance fields
.field public O:F

.field public P:F


# virtual methods
.method public final E(La3/w0;Ly2/q0;I)I
    .locals 0

    invoke-interface {p2, p3}, Ly2/q0;->b(I)I

    move-result p2

    iget p3, p0, Ll0/y1;->P:F

    invoke-static {p3}, Ljava/lang/Float;->isNaN(F)Z

    move-result p3

    if-nez p3, :cond_0

    iget p3, p0, Ll0/y1;->P:F

    invoke-interface {p1, p3}, Ly3/c;->F(F)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-ge p2, p1, :cond_1

    return p1

    :cond_1
    return p2
.end method

.method public final b(Ly2/t0;Ly2/q0;J)Ly2/s0;
    .locals 5

    iget v0, p0, Ll0/y1;->O:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    invoke-static {p3, p4}, Ly3/a;->k(J)I

    move-result v0

    if-nez v0, :cond_2

    iget v0, p0, Ll0/y1;->O:F

    invoke-interface {p1, v0}, Ly3/c;->F(F)I

    move-result v0

    invoke-static {p3, p4}, Ly3/a;->i(J)I

    move-result v2

    if-gez v0, :cond_0

    move v0, v1

    :cond_0
    if-le v0, v2, :cond_1

    goto :goto_0

    :cond_1
    move v2, v0

    goto :goto_0

    :cond_2
    invoke-static {p3, p4}, Ly3/a;->k(J)I

    move-result v2

    :goto_0
    invoke-static {p3, p4}, Ly3/a;->i(J)I

    move-result v0

    iget v3, p0, Ll0/y1;->P:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-static {p3, p4}, Ly3/a;->j(J)I

    move-result v3

    if-nez v3, :cond_5

    iget v3, p0, Ll0/y1;->P:F

    invoke-interface {p1, v3}, Ly3/c;->F(F)I

    move-result v3

    invoke-static {p3, p4}, Ly3/a;->h(J)I

    move-result v4

    if-gez v3, :cond_3

    goto :goto_1

    :cond_3
    move v1, v3

    :goto_1
    if-le v1, v4, :cond_4

    goto :goto_2

    :cond_4
    move v4, v1

    goto :goto_2

    :cond_5
    invoke-static {p3, p4}, Ly3/a;->j(J)I

    move-result v4

    :goto_2
    invoke-static {p3, p4}, Ly3/a;->h(J)I

    move-result p3

    invoke-static {v2, v0, v4, p3}, Ly3/b;->a(IIII)J

    move-result-wide p3

    invoke-interface {p2, p3, p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    iget p3, p2, Ly2/j1;->w:I

    iget p4, p2, Ly2/j1;->x:I

    new-instance v0, Le1/m;

    const/4 v1, 0x6

    invoke-direct {v0, p2, v1}, Le1/m;-><init>(Ly2/j1;I)V

    sget-object p2, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p3, p4, p2, v0}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method

.method public final g0(La3/w0;Ly2/q0;I)I
    .locals 0

    invoke-interface {p2, p3}, Ly2/q0;->O(I)I

    move-result p2

    iget p3, p0, Ll0/y1;->O:F

    invoke-static {p3}, Ljava/lang/Float;->isNaN(F)Z

    move-result p3

    if-nez p3, :cond_0

    iget p3, p0, Ll0/y1;->O:F

    invoke-interface {p1, p3}, Ly3/c;->F(F)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-ge p2, p1, :cond_1

    return p1

    :cond_1
    return p2
.end method

.method public final o(La3/w0;Ly2/q0;I)I
    .locals 0

    invoke-interface {p2, p3}, Ly2/q0;->Q(I)I

    move-result p2

    iget p3, p0, Ll0/y1;->O:F

    invoke-static {p3}, Ljava/lang/Float;->isNaN(F)Z

    move-result p3

    if-nez p3, :cond_0

    iget p3, p0, Ll0/y1;->O:F

    invoke-interface {p1, p3}, Ly3/c;->F(F)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-ge p2, p1, :cond_1

    return p1

    :cond_1
    return p2
.end method

.method public final y(La3/w0;Ly2/q0;I)I
    .locals 0

    invoke-interface {p2, p3}, Ly2/q0;->C(I)I

    move-result p2

    iget p3, p0, Ll0/y1;->P:F

    invoke-static {p3}, Ljava/lang/Float;->isNaN(F)Z

    move-result p3

    if-nez p3, :cond_0

    iget p3, p0, Ll0/y1;->P:F

    invoke-interface {p1, p3}, Ly3/c;->F(F)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-ge p2, p1, :cond_1

    return p1

    :cond_1
    return p2
.end method
