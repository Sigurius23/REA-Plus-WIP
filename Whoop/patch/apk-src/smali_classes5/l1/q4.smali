.class public final Ll1/q4;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/c0;


# instance fields
.field public O:Lj0/i;

.field public P:Z

.field public Q:Ld0/i1;

.field public R:Z

.field public S:Ld0/e;

.field public T:Ld0/e;

.field public U:F

.field public V:F


# virtual methods
.method public final M0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final P0()V
    .locals 4

    invoke-virtual {p0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v0

    new-instance v1, Lkd/f;

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-direct {v1, p0, v3, v2}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v2, 0x3

    invoke-static {v0, v3, v3, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final b(Ly2/t0;Ly2/q0;J)Ly2/s0;
    .locals 6

    invoke-static {p3, p4}, Ly3/a;->i(J)I

    move-result v0

    invoke-interface {p2, v0}, Ly2/q0;->b(I)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-static {p3, p4}, Ly3/a;->h(J)I

    move-result p3

    invoke-interface {p2, p3}, Ly2/q0;->Q(I)I

    move-result p3

    if-eqz p3, :cond_0

    move p3, v2

    goto :goto_0

    :cond_0
    move p3, v1

    :goto_0
    iget-boolean p4, p0, Ll1/q4;->R:Z

    if-eqz p4, :cond_1

    sget p3, Lo1/y;->n:F

    goto :goto_2

    :cond_1
    if-nez p3, :cond_3

    iget-boolean p3, p0, Ll1/q4;->P:Z

    if-eqz p3, :cond_2

    goto :goto_1

    :cond_2
    sget p3, Landroidx/compose/material3/d;->b:F

    goto :goto_2

    :cond_3
    :goto_1
    sget p3, Landroidx/compose/material3/d;->a:F

    :goto_2
    invoke-interface {p1, p3}, Ly3/c;->q0(F)F

    move-result p3

    iget-object p4, p0, Ll1/q4;->T:Ld0/e;

    if-eqz p4, :cond_4

    invoke-virtual {p4}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->floatValue()F

    move-result p4

    goto :goto_3

    :cond_4
    move p4, p3

    :goto_3
    float-to-int p4, p4

    if-ltz p4, :cond_5

    move v0, v2

    goto :goto_4

    :cond_5
    move v0, v1

    :goto_4
    if-ltz p4, :cond_6

    move v1, v2

    :cond_6
    and-int/2addr v0, v1

    if-nez v0, :cond_7

    const-string v0, "width and height must be >= 0"

    invoke-static {v0}, Ly3/i;->a(Ljava/lang/String;)V

    :cond_7
    invoke-static {p4, p4, p4, p4}, Ly3/b;->h(IIII)J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    sget v0, Landroidx/compose/material3/d;->d:F

    invoke-interface {p1, p3}, Ly3/c;->f0(F)F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-interface {p1, v0}, Ly3/c;->q0(F)F

    move-result v0

    sget v1, Landroidx/compose/material3/d;->c:F

    sget v2, Landroidx/compose/material3/d;->a:F

    sub-float/2addr v1, v2

    sget v2, Landroidx/compose/material3/d;->e:F

    sub-float/2addr v1, v2

    invoke-interface {p1, v1}, Ly3/c;->q0(F)F

    move-result v1

    iget-boolean v2, p0, Ll1/q4;->R:Z

    if-eqz v2, :cond_8

    iget-boolean v3, p0, Ll1/q4;->P:Z

    if-eqz v3, :cond_8

    sget v0, Lo1/y;->u:F

    invoke-interface {p1, v0}, Ly3/c;->q0(F)F

    move-result v0

    sub-float v0, v1, v0

    goto :goto_5

    :cond_8
    if-eqz v2, :cond_9

    iget-boolean v2, p0, Ll1/q4;->P:Z

    if-nez v2, :cond_9

    sget v0, Lo1/y;->u:F

    invoke-interface {p1, v0}, Ly3/c;->q0(F)F

    move-result v0

    goto :goto_5

    :cond_9
    iget-boolean v2, p0, Ll1/q4;->P:Z

    if-eqz v2, :cond_a

    move v0, v1

    :cond_a
    :goto_5
    iget-object v1, p0, Ll1/q4;->T:Ld0/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_b

    iget-object v1, v1, Ld0/e;->e:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    goto :goto_6

    :cond_b
    move-object v1, v2

    :goto_6
    invoke-static {v1, p3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Float;F)Z

    move-result v1

    const/4 v3, 0x3

    if-nez v1, :cond_c

    invoke-virtual {p0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v1

    new-instance v4, Ll1/p4;

    const/4 v5, 0x0

    invoke-direct {v4, p0, p3, v2, v5}, Ll1/p4;-><init>(Ll1/q4;FLq83/d;I)V

    invoke-static {v1, v2, v2, v4, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_c
    iget-object v1, p0, Ll1/q4;->S:Ld0/e;

    if-eqz v1, :cond_d

    iget-object v1, v1, Ld0/e;->e:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    goto :goto_7

    :cond_d
    move-object v1, v2

    :goto_7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Float;F)Z

    move-result v1

    if-nez v1, :cond_e

    invoke-virtual {p0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v1

    new-instance v4, Ll1/p4;

    const/4 v5, 0x1

    invoke-direct {v4, p0, v0, v2, v5}, Ll1/p4;-><init>(Ll1/q4;FLq83/d;I)V

    invoke-static {v1, v2, v2, v4, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_e
    iget v1, p0, Ll1/q4;->V:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-eqz v1, :cond_f

    iget v1, p0, Ll1/q4;->U:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-eqz v1, :cond_f

    iput p3, p0, Ll1/q4;->V:F

    iput v0, p0, Ll1/q4;->U:F

    :cond_f
    new-instance p3, Lh0/b4;

    invoke-direct {p3, p2, p0, v0}, Lh0/b4;-><init>(Ly2/j1;Ll1/q4;F)V

    sget-object p2, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p4, p4, p2, p3}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method
