.class public final Lf0/o1;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/c0;
.implements La3/j2;


# instance fields
.field public O:Lf0/r1;

.field public P:Z


# virtual methods
.method public final E(La3/w0;Ly2/q0;I)I
    .locals 0

    iget-boolean p1, p0, Lf0/o1;->P:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const p3, 0x7fffffff

    :goto_0
    invoke-interface {p2, p3}, Ly2/q0;->b(I)I

    move-result p1

    return p1
.end method

.method public final b(Ly2/t0;Ly2/q0;J)Ly2/s0;
    .locals 9

    iget-boolean v0, p0, Lf0/o1;->P:Z

    if-eqz v0, :cond_0

    sget-object v0, Lh0/d2;->w:Lh0/d2;

    goto :goto_0

    :cond_0
    sget-object v0, Lh0/d2;->x:Lh0/d2;

    :goto_0
    invoke-static {p3, p4, v0}, Ljc/x;->q(JLh0/d2;)V

    iget-boolean v0, p0, Lf0/o1;->P:Z

    const v1, 0x7fffffff

    if-eqz v0, :cond_1

    move v7, v1

    goto :goto_1

    :cond_1
    invoke-static {p3, p4}, Ly3/a;->h(J)I

    move-result v0

    move v7, v0

    :goto_1
    iget-boolean v0, p0, Lf0/o1;->P:Z

    if-eqz v0, :cond_2

    invoke-static {p3, p4}, Ly3/a;->i(J)I

    move-result v1

    :cond_2
    move v5, v1

    const/4 v6, 0x0

    const/4 v8, 0x5

    const/4 v4, 0x0

    move-wide v2, p3

    invoke-static/range {v2 .. v8}, Ly3/a;->b(JIIIII)J

    move-result-wide p3

    invoke-interface {p2, p3, p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    iget p3, p2, Ly2/j1;->w:I

    invoke-static {v2, v3}, Ly3/a;->i(J)I

    move-result p4

    if-le p3, p4, :cond_3

    move p3, p4

    :cond_3
    iget p4, p2, Ly2/j1;->x:I

    invoke-static {v2, v3}, Ly3/a;->h(J)I

    move-result v0

    if-le p4, v0, :cond_4

    move p4, v0

    :cond_4
    iget v0, p2, Ly2/j1;->x:I

    sub-int/2addr v0, p4

    iget v1, p2, Ly2/j1;->w:I

    sub-int/2addr v1, p3

    iget-boolean v2, p0, Lf0/o1;->P:Z

    if-eqz v2, :cond_5

    goto :goto_2

    :cond_5
    move v0, v1

    :goto_2
    iget-object v1, p0, Lf0/o1;->O:Lf0/r1;

    iget-object v2, v1, Lf0/r1;->d:Lp1/h1;

    iget-object v1, v1, Lf0/r1;->a:Lp1/h1;

    invoke-virtual {v2, v0}, Lp1/h1;->y(I)V

    invoke-static {}, Lyl/a;->c()Lz1/f;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lz1/f;->e()Lkotlin/jvm/functions/Function1;

    move-result-object v3

    goto :goto_3

    :cond_6
    const/4 v3, 0x0

    :goto_3
    invoke-static {v2}, Lyl/a;->e(Lz1/f;)Lz1/f;

    move-result-object v4

    :try_start_0
    invoke-virtual {v1}, Lp1/h1;->x()I

    move-result v5

    if-le v5, v0, :cond_7

    invoke-virtual {v1, v0}, Lp1/h1;->y(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_6

    :cond_7
    :goto_4
    invoke-static {v2, v4, v3}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    iget-object v1, p0, Lf0/o1;->O:Lf0/r1;

    iget-boolean v2, p0, Lf0/o1;->P:Z

    if-eqz v2, :cond_8

    move v2, p4

    goto :goto_5

    :cond_8
    move v2, p3

    :goto_5
    iget-object v1, v1, Lf0/r1;->b:Lp1/h1;

    invoke-virtual {v1, v2}, Lp1/h1;->y(I)V

    new-instance v1, Lf0/m1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v0, p2, v2}, Lf0/m1;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    sget-object p2, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p3, p4, p2, v1}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1

    :goto_6
    invoke-static {v2, v4, v3}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    throw p1
.end method

.method public final g0(La3/w0;Ly2/q0;I)I
    .locals 0

    iget-boolean p1, p0, Lf0/o1;->P:Z

    if-eqz p1, :cond_0

    const p3, 0x7fffffff

    :cond_0
    invoke-interface {p2, p3}, Ly2/q0;->O(I)I

    move-result p1

    return p1
.end method

.method public final n(Li3/z;)V
    .locals 4

    invoke-static {p1}, Li3/w;->n(Li3/z;)V

    new-instance v0, Li3/j;

    new-instance v1, Lf0/n1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lf0/n1;-><init>(Lf0/o1;I)V

    new-instance v2, Lf0/n1;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Lf0/n1;-><init>(Lf0/o1;I)V

    invoke-direct {v0, v1, v2}, Li3/j;-><init>(Lc93/a;Lc93/a;)V

    iget-boolean v1, p0, Lf0/o1;->P:Z

    if-eqz v1, :cond_0

    sget-object v1, Li3/u;->u:Li3/y;

    sget-object v2, Li3/w;->a:[Lj93/z;

    const/16 v3, 0xc

    aget-object v2, v2, v3

    invoke-virtual {v1, p1, v0}, Li3/y;->a(Li3/z;Ljava/lang/Object;)V

    return-void

    :cond_0
    sget-object v1, Li3/u;->t:Li3/y;

    sget-object v2, Li3/w;->a:[Lj93/z;

    const/16 v3, 0xb

    aget-object v2, v2, v3

    invoke-virtual {v1, p1, v0}, Li3/y;->a(Li3/z;Ljava/lang/Object;)V

    return-void
.end method

.method public final o(La3/w0;Ly2/q0;I)I
    .locals 0

    iget-boolean p1, p0, Lf0/o1;->P:Z

    if-eqz p1, :cond_0

    const p3, 0x7fffffff

    :cond_0
    invoke-interface {p2, p3}, Ly2/q0;->Q(I)I

    move-result p1

    return p1
.end method

.method public final y(La3/w0;Ly2/q0;I)I
    .locals 0

    iget-boolean p1, p0, Lf0/o1;->P:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const p3, 0x7fffffff

    :goto_0
    invoke-interface {p2, p3}, Ly2/q0;->C(I)I

    move-result p1

    return p1
.end method
