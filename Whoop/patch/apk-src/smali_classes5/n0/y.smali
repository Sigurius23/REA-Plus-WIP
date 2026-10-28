.class public final Ln0/y;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/c0;


# instance fields
.field public O:F

.field public P:Lp1/t2;

.field public Q:Lp1/t2;


# virtual methods
.method public final b(Ly2/t0;Ly2/q0;J)Ly2/s0;
    .locals 5

    iget-object v0, p0, Ln0/y;->P:Lp1/t2;

    const v1, 0x7fffffff

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    if-eq v2, v1, :cond_0

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v2, p0, Ln0/y;->O:F

    mul-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p0, Ln0/y;->Q:Lp1/t2;

    if-eqz v2, :cond_1

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    if-eq v3, v1, :cond_1

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    iget v3, p0, Ln0/y;->O:F

    mul-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    if-eq v0, v1, :cond_2

    move v3, v0

    goto :goto_2

    :cond_2
    invoke-static {p3, p4}, Ly3/a;->k(J)I

    move-result v3

    :goto_2
    if-eq v2, v1, :cond_3

    move v4, v2

    goto :goto_3

    :cond_3
    invoke-static {p3, p4}, Ly3/a;->j(J)I

    move-result v4

    :goto_3
    if-eq v0, v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-static {p3, p4}, Ly3/a;->i(J)I

    move-result v0

    :goto_4
    if-eq v2, v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-static {p3, p4}, Ly3/a;->h(J)I

    move-result v2

    :goto_5
    invoke-static {v3, v0, v4, v2}, Ly3/b;->a(IIII)J

    move-result-wide p3

    invoke-interface {p2, p3, p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    iget p3, p2, Ly2/j1;->w:I

    iget p4, p2, Ly2/j1;->x:I

    new-instance v0, Lch/m;

    const/4 v1, 0x6

    invoke-direct {v0, p2, v1}, Lch/m;-><init>(Ly2/j1;I)V

    sget-object p2, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p3, p4, p2, v0}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method
