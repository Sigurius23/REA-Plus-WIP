.class public final Ll0/h2;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/c0;


# instance fields
.field public O:Ll0/f0;

.field public P:Z

.field public Q:Lc93/m;


# virtual methods
.method public final b(Ly2/t0;Ly2/q0;J)Ly2/s0;
    .locals 8

    iget-object v0, p0, Ll0/h2;->O:Ll0/f0;

    sget-object v1, Ll0/f0;->w:Ll0/f0;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    invoke-static {p3, p4}, Ly3/a;->k(J)I

    move-result v0

    :goto_0
    iget-object v3, p0, Ll0/h2;->O:Ll0/f0;

    sget-object v4, Ll0/f0;->x:Ll0/f0;

    if-eq v3, v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p3, p4}, Ly3/a;->j(J)I

    move-result v2

    :goto_1
    iget-object v3, p0, Ll0/h2;->O:Ll0/f0;

    const v5, 0x7fffffff

    if-eq v3, v1, :cond_2

    iget-boolean v1, p0, Ll0/h2;->P:Z

    if-eqz v1, :cond_2

    move v1, v5

    goto :goto_2

    :cond_2
    invoke-static {p3, p4}, Ly3/a;->i(J)I

    move-result v1

    :goto_2
    iget-object v3, p0, Ll0/h2;->O:Ll0/f0;

    if-eq v3, v4, :cond_3

    iget-boolean v3, p0, Ll0/h2;->P:Z

    if-eqz v3, :cond_3

    goto :goto_3

    :cond_3
    invoke-static {p3, p4}, Ly3/a;->h(J)I

    move-result v5

    :goto_3
    invoke-static {v0, v1, v2, v5}, Ly3/b;->a(IIII)J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v5

    iget p2, v5, Ly2/j1;->w:I

    invoke-static {p3, p4}, Ly3/a;->k(J)I

    move-result v0

    invoke-static {p3, p4}, Ly3/a;->i(J)I

    move-result v1

    invoke-static {p2, v0, v1}, Le93/b;->n(III)I

    move-result v4

    iget p2, v5, Ly2/j1;->x:I

    invoke-static {p3, p4}, Ly3/a;->j(J)I

    move-result v0

    invoke-static {p3, p4}, Ly3/a;->h(J)I

    move-result p3

    invoke-static {p2, v0, p3}, Le93/b;->n(III)I

    move-result v6

    new-instance v2, Ll0/q1;

    move-object v3, p0

    move-object v7, p1

    invoke-direct/range {v2 .. v7}, Ll0/q1;-><init>(Ll0/h2;ILy2/j1;ILy2/t0;)V

    sget-object p1, Lm83/z;->w:Lm83/z;

    invoke-interface {v7, v4, v6, p1, v2}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method
