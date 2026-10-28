.class public final Ll0/n;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/c0;


# instance fields
.field public O:F

.field public P:Z


# virtual methods
.method public final E(La3/w0;Ly2/q0;I)I
    .locals 0

    const p1, 0x7fffffff

    if-eq p3, p1, :cond_0

    int-to-float p1, p3

    iget p2, p0, Ll0/n;->O:F

    div-float/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    return p1

    :cond_0
    invoke-interface {p2, p3}, Ly2/q0;->b(I)I

    move-result p1

    return p1
.end method

.method public final X0(JZ)J
    .locals 4

    invoke-static {p1, p2}, Ly3/a;->h(J)I

    move-result v0

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_1

    int-to-float v1, v0

    iget v2, p0, Ll0/n;->O:F

    mul-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    if-lez v1, :cond_1

    if-eqz p3, :cond_0

    invoke-static {v1, p1, p2, v0}, Landroidx/compose/foundation/layout/a;->k(IJI)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    int-to-long p1, v1

    const/16 p3, 0x20

    shl-long/2addr p1, p3

    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    or-long/2addr p1, v0

    return-wide p1

    :cond_1
    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public final Y0(JZ)J
    .locals 4

    invoke-static {p1, p2}, Ly3/a;->i(J)I

    move-result v0

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_1

    int-to-float v1, v0

    iget v2, p0, Ll0/n;->O:F

    div-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    if-lez v1, :cond_1

    if-eqz p3, :cond_0

    invoke-static {v0, p1, p2, v1}, Landroidx/compose/foundation/layout/a;->k(IJI)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    int-to-long p1, v0

    const/16 p3, 0x20

    shl-long/2addr p1, p3

    int-to-long v0, v1

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    or-long/2addr p1, v0

    return-wide p1

    :cond_1
    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public final Z0(JZ)J
    .locals 4

    invoke-static {p1, p2}, Ly3/a;->j(J)I

    move-result v0

    int-to-float v1, v0

    iget v2, p0, Ll0/n;->O:F

    mul-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    if-lez v1, :cond_1

    if-eqz p3, :cond_0

    invoke-static {v1, p1, p2, v0}, Landroidx/compose/foundation/layout/a;->k(IJI)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    int-to-long p1, v1

    const/16 p3, 0x20

    shl-long/2addr p1, p3

    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    or-long/2addr p1, v0

    return-wide p1

    :cond_1
    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public final a1(JZ)J
    .locals 4

    invoke-static {p1, p2}, Ly3/a;->k(J)I

    move-result v0

    int-to-float v1, v0

    iget v2, p0, Ll0/n;->O:F

    div-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    if-lez v1, :cond_1

    if-eqz p3, :cond_0

    invoke-static {v0, p1, p2, v1}, Landroidx/compose/foundation/layout/a;->k(IJI)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    int-to-long p1, v0

    const/16 p3, 0x20

    shl-long/2addr p1, p3

    int-to-long v0, v1

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    or-long/2addr p1, v0

    return-wide p1

    :cond_1
    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public final b(Ly2/t0;Ly2/q0;J)Ly2/s0;
    .locals 7

    iget-boolean v0, p0, Ll0/n;->P:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-wide/16 v3, 0x0

    if-nez v0, :cond_7

    invoke-virtual {p0, p3, p4, v2}, Ll0/n;->Y0(JZ)J

    move-result-wide v5

    invoke-static {v5, v6, v3, v4}, Ly3/l;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-virtual {p0, p3, p4, v2}, Ll0/n;->X0(JZ)J

    move-result-wide v5

    invoke-static {v5, v6, v3, v4}, Ly3/l;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    invoke-virtual {p0, p3, p4, v2}, Ll0/n;->a1(JZ)J

    move-result-wide v5

    invoke-static {v5, v6, v3, v4}, Ly3/l;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    invoke-virtual {p0, p3, p4, v2}, Ll0/n;->Z0(JZ)J

    move-result-wide v5

    invoke-static {v5, v6, v3, v4}, Ly3/l;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    invoke-virtual {p0, p3, p4, v1}, Ll0/n;->Y0(JZ)J

    move-result-wide v5

    invoke-static {v5, v6, v3, v4}, Ly3/l;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    invoke-virtual {p0, p3, p4, v1}, Ll0/n;->X0(JZ)J

    move-result-wide v5

    invoke-static {v5, v6, v3, v4}, Ly3/l;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    invoke-virtual {p0, p3, p4, v1}, Ll0/n;->a1(JZ)J

    move-result-wide v5

    invoke-static {v5, v6, v3, v4}, Ly3/l;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    invoke-virtual {p0, p3, p4, v1}, Ll0/n;->Z0(JZ)J

    move-result-wide v5

    invoke-static {v5, v6, v3, v4}, Ly3/l;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_0

    :cond_7
    invoke-virtual {p0, p3, p4, v2}, Ll0/n;->X0(JZ)J

    move-result-wide v5

    invoke-static {v5, v6, v3, v4}, Ly3/l;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    invoke-virtual {p0, p3, p4, v2}, Ll0/n;->Y0(JZ)J

    move-result-wide v5

    invoke-static {v5, v6, v3, v4}, Ly3/l;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_0

    :cond_9
    invoke-virtual {p0, p3, p4, v2}, Ll0/n;->Z0(JZ)J

    move-result-wide v5

    invoke-static {v5, v6, v3, v4}, Ly3/l;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_0

    :cond_a
    invoke-virtual {p0, p3, p4, v2}, Ll0/n;->a1(JZ)J

    move-result-wide v5

    invoke-static {v5, v6, v3, v4}, Ly3/l;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_0

    :cond_b
    invoke-virtual {p0, p3, p4, v1}, Ll0/n;->X0(JZ)J

    move-result-wide v5

    invoke-static {v5, v6, v3, v4}, Ly3/l;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_0

    :cond_c
    invoke-virtual {p0, p3, p4, v1}, Ll0/n;->Y0(JZ)J

    move-result-wide v5

    invoke-static {v5, v6, v3, v4}, Ly3/l;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_0

    :cond_d
    invoke-virtual {p0, p3, p4, v1}, Ll0/n;->Z0(JZ)J

    move-result-wide v5

    invoke-static {v5, v6, v3, v4}, Ly3/l;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_0

    :cond_e
    invoke-virtual {p0, p3, p4, v1}, Ll0/n;->a1(JZ)J

    move-result-wide v5

    invoke-static {v5, v6, v3, v4}, Ly3/l;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_0

    :cond_f
    move-wide v5, v3

    :goto_0
    invoke-static {v5, v6, v3, v4}, Ly3/l;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_13

    const/16 p3, 0x20

    shr-long p3, v5, p3

    long-to-int p3, p3

    const-wide v3, 0xffffffffL

    and-long/2addr v3, v5

    long-to-int p4, v3

    if-ltz p3, :cond_10

    move v0, v2

    goto :goto_1

    :cond_10
    move v0, v1

    :goto_1
    if-ltz p4, :cond_11

    move v1, v2

    :cond_11
    and-int/2addr v0, v1

    if-nez v0, :cond_12

    const-string v0, "width and height must be >= 0"

    invoke-static {v0}, Ly3/i;->a(Ljava/lang/String;)V

    :cond_12
    invoke-static {p3, p3, p4, p4}, Ly3/b;->h(IIII)J

    move-result-wide p3

    :cond_13
    invoke-interface {p2, p3, p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    iget p3, p2, Ly2/j1;->w:I

    iget p4, p2, Ly2/j1;->x:I

    new-instance v0, Le1/m;

    const/4 v1, 0x2

    invoke-direct {v0, p2, v1}, Le1/m;-><init>(Ly2/j1;I)V

    sget-object p2, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p3, p4, p2, v0}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method

.method public final g0(La3/w0;Ly2/q0;I)I
    .locals 0

    const p1, 0x7fffffff

    if-eq p3, p1, :cond_0

    int-to-float p1, p3

    iget p2, p0, Ll0/n;->O:F

    mul-float/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    return p1

    :cond_0
    invoke-interface {p2, p3}, Ly2/q0;->O(I)I

    move-result p1

    return p1
.end method

.method public final o(La3/w0;Ly2/q0;I)I
    .locals 0

    const p1, 0x7fffffff

    if-eq p3, p1, :cond_0

    int-to-float p1, p3

    iget p2, p0, Ll0/n;->O:F

    mul-float/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    return p1

    :cond_0
    invoke-interface {p2, p3}, Ly2/q0;->Q(I)I

    move-result p1

    return p1
.end method

.method public final y(La3/w0;Ly2/q0;I)I
    .locals 0

    const p1, 0x7fffffff

    if-eq p3, p1, :cond_0

    int-to-float p1, p3

    iget p2, p0, Ll0/n;->O:F

    div-float/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    return p1

    :cond_0
    invoke-interface {p2, p3}, Ly2/q0;->C(I)I

    move-result p1

    return p1
.end method
