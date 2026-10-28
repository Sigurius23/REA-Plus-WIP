.class public final Ll0/h0;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/c0;


# instance fields
.field public O:Ll0/f0;

.field public P:F


# virtual methods
.method public final b(Ly2/t0;Ly2/q0;J)Ly2/s0;
    .locals 4

    invoke-static {p3, p4}, Ly3/a;->e(J)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll0/h0;->O:Ll0/f0;

    sget-object v1, Ll0/f0;->w:Ll0/f0;

    if-eq v0, v1, :cond_2

    invoke-static {p3, p4}, Ly3/a;->i(J)I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Ll0/h0;->P:F

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {p3, p4}, Ly3/a;->k(J)I

    move-result v1

    invoke-static {p3, p4}, Ly3/a;->i(J)I

    move-result v2

    if-ge v0, v1, :cond_0

    move v0, v1

    :cond_0
    if-le v0, v2, :cond_1

    goto :goto_0

    :cond_1
    move v2, v0

    :goto_0
    move v0, v2

    goto :goto_1

    :cond_2
    invoke-static {p3, p4}, Ly3/a;->k(J)I

    move-result v2

    invoke-static {p3, p4}, Ly3/a;->i(J)I

    move-result v0

    :goto_1
    invoke-static {p3, p4}, Ly3/a;->d(J)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Ll0/h0;->O:Ll0/f0;

    sget-object v3, Ll0/f0;->x:Ll0/f0;

    if-eq v1, v3, :cond_5

    invoke-static {p3, p4}, Ly3/a;->h(J)I

    move-result v1

    int-to-float v1, v1

    iget v3, p0, Ll0/h0;->P:F

    mul-float/2addr v1, v3

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-static {p3, p4}, Ly3/a;->j(J)I

    move-result v3

    invoke-static {p3, p4}, Ly3/a;->h(J)I

    move-result p3

    if-ge v1, v3, :cond_3

    move v1, v3

    :cond_3
    if-le v1, p3, :cond_4

    goto :goto_2

    :cond_4
    move p3, v1

    :goto_2
    move p4, p3

    goto :goto_3

    :cond_5
    invoke-static {p3, p4}, Ly3/a;->j(J)I

    move-result v1

    invoke-static {p3, p4}, Ly3/a;->h(J)I

    move-result p3

    move p4, p3

    move p3, v1

    :goto_3
    invoke-static {v2, v0, p3, p4}, Ly3/b;->a(IIII)J

    move-result-wide p3

    invoke-interface {p2, p3, p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    iget p3, p2, Ly2/j1;->w:I

    iget p4, p2, Ly2/j1;->x:I

    new-instance v0, Le1/m;

    const/4 v1, 0x3

    invoke-direct {v0, p2, v1}, Le1/m;-><init>(Ly2/j1;I)V

    sget-object p2, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p3, p4, p2, v0}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method
