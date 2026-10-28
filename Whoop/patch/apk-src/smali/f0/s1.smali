.class public final Lf0/s1;
.super La3/o;
.source "SourceFile"

# interfaces
.implements La3/m;
.implements La3/w1;


# instance fields
.field public Q:Lh0/x2;

.field public R:Lh0/d2;

.field public S:Z

.field public T:Lh0/o1;

.field public U:Lj0/i;

.field public V:Lh0/s;

.field public W:Z

.field public X:Lf0/k;

.field public Y:Lh0/w2;

.field public Z:La3/n;

.field public a0:Lf0/l;

.field public b0:Lf0/k;

.field public c0:Z


# virtual methods
.method public final C()V
    .locals 11

    sget-object v0, Lf0/g1;->a:Lp1/b0;

    invoke-static {p0, v0}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf0/l;

    iget-object v1, p0, Lf0/s1;->a0:Lf0/l;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    iput-object v0, p0, Lf0/s1;->a0:Lf0/l;

    const/4 v0, 0x0

    iput-object v0, p0, Lf0/s1;->b0:Lf0/k;

    iget-object v1, p0, Lf0/s1;->Z:La3/n;

    if-eqz v1, :cond_0

    invoke-virtual {p0, v1}, La3/o;->Y0(La3/n;)V

    :cond_0
    iput-object v0, p0, Lf0/s1;->Z:La3/n;

    invoke-virtual {p0}, Lf0/s1;->a1()V

    iget-object v2, p0, Lf0/s1;->Y:Lh0/w2;

    if-eqz v2, :cond_2

    iget-object v7, p0, Lf0/s1;->Q:Lh0/x2;

    iget-object v6, p0, Lf0/s1;->R:Lh0/d2;

    iget-boolean v0, p0, Lf0/s1;->W:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lf0/s1;->b0:Lf0/k;

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lf0/s1;->X:Lf0/k;

    goto :goto_0

    :goto_1
    iget-boolean v9, p0, Lf0/s1;->S:Z

    iget-boolean v10, p0, Lf0/s1;->c0:Z

    iget-object v5, p0, Lf0/s1;->T:Lh0/o1;

    iget-object v8, p0, Lf0/s1;->U:Lj0/i;

    iget-object v4, p0, Lf0/s1;->V:Lh0/s;

    invoke-virtual/range {v2 .. v10}, Lh0/w2;->j1(Lf0/k;Lh0/s;Lh0/o1;Lh0/d2;Lh0/x2;Lj0/i;ZZ)V

    :cond_2
    return-void
.end method

.method public final M0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final P0()V
    .locals 10

    invoke-virtual {p0}, Lf0/s1;->b1()Z

    move-result v0

    iput-boolean v0, p0, Lf0/s1;->c0:Z

    invoke-virtual {p0}, Lf0/s1;->a1()V

    iget-object v0, p0, Lf0/s1;->Y:Lh0/w2;

    if-nez v0, :cond_1

    new-instance v1, Lh0/w2;

    iget-object v6, p0, Lf0/s1;->Q:Lh0/x2;

    iget-boolean v0, p0, Lf0/s1;->W:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf0/s1;->b0:Lf0/k;

    :goto_0
    move-object v2, v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lf0/s1;->X:Lf0/k;

    goto :goto_0

    :goto_1
    iget-object v4, p0, Lf0/s1;->T:Lh0/o1;

    iget-object v5, p0, Lf0/s1;->R:Lh0/d2;

    iget-boolean v8, p0, Lf0/s1;->S:Z

    iget-boolean v9, p0, Lf0/s1;->c0:Z

    iget-object v7, p0, Lf0/s1;->U:Lj0/i;

    iget-object v3, p0, Lf0/s1;->V:Lh0/s;

    invoke-direct/range {v1 .. v9}, Lh0/w2;-><init>(Lf0/k;Lh0/s;Lh0/o1;Lh0/d2;Lh0/x2;Lj0/i;ZZ)V

    invoke-virtual {p0, v1}, La3/o;->X0(La3/n;)La3/n;

    iput-object v1, p0, Lf0/s1;->Y:Lh0/w2;

    :cond_1
    return-void
.end method

.method public final Q0()V
    .locals 1

    iget-object v0, p0, Lf0/s1;->Z:La3/n;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, La3/o;->Y0(La3/n;)V

    :cond_0
    return-void
.end method

.method public final a1()V
    .locals 2

    iget-object v0, p0, Lf0/s1;->Z:La3/n;

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lf0/s1;->W:Z

    if-eqz v0, :cond_0

    new-instance v0, La6/l0;

    const/16 v1, 0xd

    invoke-direct {v0, p0, v1}, La6/l0;-><init>(Ljava/lang/Object;I)V

    invoke-static {p0, v0}, La3/g;->l(Lb2/v;Lc93/a;)V

    :cond_0
    iget-boolean v0, p0, Lf0/s1;->W:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lf0/s1;->b0:Lf0/k;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lf0/s1;->X:Lf0/k;

    :goto_0
    if-eqz v0, :cond_3

    iget-object v0, v0, Lf0/k;->i:La3/o;

    iget-object v1, v0, Lb2/v;->w:Lb2/v;

    iget-boolean v1, v1, Lb2/v;->N:Z

    if-nez v1, :cond_3

    invoke-virtual {p0, v0}, La3/o;->X0(La3/n;)La3/n;

    iput-object v0, p0, Lf0/s1;->Z:La3/n;

    return-void

    :cond_2
    move-object v1, v0

    check-cast v1, Lb2/v;

    iget-object v1, v1, Lb2/v;->w:Lb2/v;

    iget-boolean v1, v1, Lb2/v;->N:Z

    if-nez v1, :cond_3

    invoke-virtual {p0, v0}, La3/o;->X0(La3/n;)La3/n;

    :cond_3
    return-void
.end method

.method public final b1()Z
    .locals 3

    sget-object v0, Ly3/m;->w:Ly3/m;

    iget-boolean v1, p0, Lb2/v;->N:Z

    if-eqz v1, :cond_0

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v0

    iget-object v0, v0, La3/n0;->Y:Ly3/m;

    :cond_0
    iget-object v1, p0, Lf0/s1;->R:Lh0/d2;

    sget-object v2, Ly3/m;->x:Ly3/m;

    if-ne v0, v2, :cond_1

    sget-object v0, Lh0/d2;->w:Lh0/d2;

    if-eq v1, v0, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public final c1(Lf0/k;Lh0/s;Lh0/o1;Lh0/d2;Lh0/x2;Lj0/i;ZZ)V
    .locals 9

    move/from16 v0, p7

    iput-object p5, p0, Lf0/s1;->Q:Lh0/x2;

    iput-object p4, p0, Lf0/s1;->R:Lh0/d2;

    iget-boolean v1, p0, Lf0/s1;->W:Z

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v1, v0, :cond_0

    iput-boolean v0, p0, Lf0/s1;->W:Z

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    iget-object v4, p0, Lf0/s1;->X:Lf0/k;

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    iput-object p1, p0, Lf0/s1;->X:Lf0/k;

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    if-nez v1, :cond_3

    if-eqz v2, :cond_2

    if-nez v0, :cond_2

    goto :goto_3

    :cond_2
    :goto_2
    move/from16 v7, p8

    goto :goto_4

    :cond_3
    :goto_3
    iget-object p1, p0, Lf0/s1;->Z:La3/n;

    if-eqz p1, :cond_4

    invoke-virtual {p0, p1}, La3/o;->Y0(La3/n;)V

    :cond_4
    const/4 p1, 0x0

    iput-object p1, p0, Lf0/s1;->Z:La3/n;

    invoke-virtual {p0}, Lf0/s1;->a1()V

    goto :goto_2

    :goto_4
    iput-boolean v7, p0, Lf0/s1;->S:Z

    iput-object p3, p0, Lf0/s1;->T:Lh0/o1;

    iput-object p6, p0, Lf0/s1;->U:Lj0/i;

    iput-object p2, p0, Lf0/s1;->V:Lh0/s;

    invoke-virtual {p0}, Lf0/s1;->b1()Z

    move-result v8

    iput-boolean v8, p0, Lf0/s1;->c0:Z

    iget-object v0, p0, Lf0/s1;->Y:Lh0/w2;

    if-eqz v0, :cond_6

    iget-boolean p1, p0, Lf0/s1;->W:Z

    if-eqz p1, :cond_5

    iget-object p1, p0, Lf0/s1;->b0:Lf0/k;

    :goto_5
    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    goto :goto_6

    :cond_5
    iget-object p1, p0, Lf0/s1;->X:Lf0/k;

    goto :goto_5

    :goto_6
    invoke-virtual/range {v0 .. v8}, Lh0/w2;->j1(Lf0/k;Lh0/s;Lh0/o1;Lh0/d2;Lh0/x2;Lj0/i;ZZ)V

    :cond_6
    return-void
.end method

.method public final t()V
    .locals 11

    invoke-virtual {p0}, Lf0/s1;->b1()Z

    move-result v0

    iget-boolean v1, p0, Lf0/s1;->c0:Z

    if-eq v1, v0, :cond_1

    iput-boolean v0, p0, Lf0/s1;->c0:Z

    iget-object v7, p0, Lf0/s1;->Q:Lh0/x2;

    iget-object v6, p0, Lf0/s1;->R:Lh0/d2;

    iget-boolean v9, p0, Lf0/s1;->W:Z

    if-eqz v9, :cond_0

    iget-object v0, p0, Lf0/s1;->b0:Lf0/k;

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lf0/s1;->X:Lf0/k;

    goto :goto_0

    :goto_1
    iget-boolean v10, p0, Lf0/s1;->S:Z

    iget-object v5, p0, Lf0/s1;->T:Lh0/o1;

    iget-object v8, p0, Lf0/s1;->U:Lj0/i;

    iget-object v4, p0, Lf0/s1;->V:Lh0/s;

    move-object v2, p0

    invoke-virtual/range {v2 .. v10}, Lf0/s1;->c1(Lf0/k;Lh0/s;Lh0/o1;Lh0/d2;Lh0/x2;Lj0/i;ZZ)V

    :cond_1
    return-void
.end method
