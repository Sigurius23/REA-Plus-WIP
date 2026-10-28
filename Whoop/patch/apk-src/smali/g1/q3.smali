.class public final Lg1/q3;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/m;
.implements La3/c0;


# virtual methods
.method public final b(Ly2/t0;Ly2/q0;J)Ly2/s0;
    .locals 3

    iget-boolean v0, p0, Lb2/v;->N:Z

    if-eqz v0, :cond_0

    sget-object v0, Lg1/h3;->a:Lp1/u2;

    invoke-static {p0, v0}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-wide v1, Lg1/h3;->b:J

    invoke-interface {p2, p3, p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    if-eqz v0, :cond_1

    iget p3, p2, Ly2/j1;->w:I

    invoke-static {v1, v2}, Ly3/h;->c(J)F

    move-result p4

    invoke-interface {p1, p4}, Ly3/c;->F(F)I

    move-result p4

    invoke-static {p3, p4}, Ljava/lang/Math;->max(II)I

    move-result p3

    goto :goto_1

    :cond_1
    iget p3, p2, Ly2/j1;->w:I

    :goto_1
    if-eqz v0, :cond_2

    iget p4, p2, Ly2/j1;->x:I

    invoke-static {v1, v2}, Ly3/h;->b(J)F

    move-result v0

    invoke-interface {p1, v0}, Ly3/c;->F(F)I

    move-result v0

    invoke-static {p4, v0}, Ljava/lang/Math;->max(II)I

    move-result p4

    goto :goto_2

    :cond_2
    iget p4, p2, Ly2/j1;->x:I

    :goto_2
    new-instance v0, Lg1/p3;

    invoke-direct {v0, p3, p2, p4}, Lg1/p3;-><init>(ILy2/j1;I)V

    sget-object p2, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p3, p4, p2, v0}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method
