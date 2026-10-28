.class public final Ly2/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/v1;
.implements Ly2/t0;


# instance fields
.field public final synthetic w:Ly2/h0;

.field public final synthetic x:Ly2/n0;


# direct methods
.method public constructor <init>(Ly2/n0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly2/e0;->x:Ly2/n0;

    iget-object p1, p1, Ly2/n0;->H:Ly2/h0;

    iput-object p1, p0, Ly2/e0;->w:Ly2/h0;

    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 1

    iget-object v0, p0, Ly2/e0;->w:Ly2/h0;

    invoke-virtual {v0}, Ly2/h0;->A()Z

    move-result v0

    return v0
.end method

.method public final D0(J)J
    .locals 1

    iget-object v0, p0, Ly2/e0;->w:Ly2/h0;

    invoke-interface {v0, p1, p2}, Ly3/c;->D0(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final F(F)I
    .locals 1

    iget-object v0, p0, Ly2/e0;->w:Ly2/h0;

    invoke-interface {v0, p1}, Ly3/c;->F(F)I

    move-result p1

    return p1
.end method

.method public final K(J)F
    .locals 1

    iget-object v0, p0, Ly2/e0;->w:Ly2/h0;

    invoke-interface {v0, p1, p2}, Ly3/c;->K(J)F

    move-result p1

    return p1
.end method

.method public final W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;
    .locals 6

    iget-object v0, p0, Ly2/e0;->w:Ly2/h0;

    const/4 v4, 0x0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Ly2/h0;->x0(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method

.method public final e0(I)F
    .locals 1

    iget-object v0, p0, Ly2/e0;->w:Ly2/h0;

    invoke-interface {v0, p1}, Ly3/c;->e0(I)F

    move-result p1

    return p1
.end method

.method public final f0(F)F
    .locals 1

    iget-object v0, p0, Ly2/e0;->w:Ly2/h0;

    invoke-virtual {v0}, Ly2/h0;->getDensity()F

    move-result v0

    div-float/2addr p1, v0

    return p1
.end method

.method public final getDensity()F
    .locals 1

    iget-object v0, p0, Ly2/e0;->w:Ly2/h0;

    iget v0, v0, Ly2/h0;->x:F

    return v0
.end method

.method public final getLayoutDirection()Ly3/m;
    .locals 1

    iget-object v0, p0, Ly2/e0;->w:Ly2/h0;

    iget-object v0, v0, Ly2/h0;->w:Ly3/m;

    return-object v0
.end method

.method public final h(F)J
    .locals 2

    iget-object v0, p0, Ly2/e0;->w:Ly2/h0;

    invoke-interface {v0, p1}, Ly3/c;->h(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public final i(J)J
    .locals 1

    iget-object v0, p0, Ly2/e0;->w:Ly2/h0;

    invoke-interface {v0, p1, p2}, Ly3/c;->i(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final l(J)F
    .locals 1

    iget-object v0, p0, Ly2/e0;->w:Ly2/h0;

    invoke-interface {v0, p1, p2}, Ly3/c;->l(J)F

    move-result p1

    return p1
.end method

.method public final m0()F
    .locals 1

    iget-object v0, p0, Ly2/e0;->w:Ly2/h0;

    iget v0, v0, Ly2/h0;->y:F

    return v0
.end method

.method public final q(F)J
    .locals 2

    iget-object v0, p0, Ly2/e0;->w:Ly2/h0;

    invoke-interface {v0, p1}, Ly3/c;->q(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public final q0(F)F
    .locals 1

    iget-object v0, p0, Ly2/e0;->w:Ly2/h0;

    invoke-virtual {v0}, Ly2/h0;->getDensity()F

    move-result v0

    mul-float/2addr v0, p1

    return v0
.end method

.method public final s0(Ljava/lang/Object;Lc93/m;)Ljava/util/List;
    .locals 9

    iget-object v0, p0, Ly2/e0;->x:Ly2/n0;

    iget-object v1, v0, Ly2/n0;->L:La0/v0;

    iget-object v2, v0, Ly2/n0;->J:La0/v0;

    iget-object v3, v0, Ly2/n0;->w:La3/n0;

    iget-object v4, v0, Ly2/n0;->G:La0/v0;

    invoke-virtual {v4, p1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La3/n0;

    if-eqz v5, :cond_0

    invoke-virtual {v3}, La3/n0;->r()Ljava/util/List;

    move-result-object v6

    check-cast v6, Lr1/b;

    iget-object v6, v6, Lr1/b;->w:Lr1/c;

    invoke-virtual {v6, v5}, Lr1/c;->j(Ljava/lang/Object;)I

    move-result v6

    iget v7, v0, Ly2/n0;->z:I

    if-ge v6, v7, :cond_0

    invoke-virtual {v5}, La3/n0;->p()Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v5, v0, Ly2/n0;->M:Lr1/c;

    iget v6, v5, Lr1/c;->y:I

    iget v7, v0, Ly2/n0;->E:I

    if-lt v6, v7, :cond_1

    goto :goto_0

    :cond_1
    const-string v6, "Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list."

    invoke-static {v6}, Lx2/a;->a(Ljava/lang/String;)V

    :goto_0
    iget v6, v5, Lr1/c;->y:I

    iget v7, v0, Ly2/n0;->E:I

    if-ne v6, v7, :cond_2

    invoke-virtual {v5, p1}, Lr1/c;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    iget-object v5, v5, Lr1/c;->w:[Ljava/lang/Object;

    aget-object v6, v5, v7

    aput-object p1, v5, v7

    :goto_1
    iget v5, v0, Ly2/n0;->E:I

    const/4 v6, 0x1

    add-int/2addr v5, v6

    iput v5, v0, Ly2/n0;->E:I

    invoke-virtual {v2, p1}, La0/v0;->b(Ljava/lang/Object;)Z

    move-result v5

    const/4 v7, 0x0

    if-nez v5, :cond_9

    invoke-virtual {v3}, La3/n0;->X()Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Ly2/n0;->d()V

    invoke-virtual {v4, p1}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    invoke-virtual {v1, p1}, La0/v0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, p1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_5

    invoke-virtual {v0, p1}, Ly2/n0;->j(Ljava/lang/Object;)La3/n0;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v3}, La3/n0;->r()Ljava/util/List;

    move-result-object v5

    check-cast v5, Lr1/b;

    iget-object v5, v5, Lr1/b;->w:Lr1/c;

    invoke-virtual {v5, v4}, Lr1/c;->j(Ljava/lang/Object;)I

    move-result v5

    invoke-virtual {v3}, La3/n0;->r()Ljava/util/List;

    move-result-object v8

    check-cast v8, Lr1/b;

    iget-object v8, v8, Lr1/b;->w:Lr1/c;

    iget v8, v8, Lr1/c;->y:I

    iput-boolean v6, v3, La3/n0;->P:Z

    invoke-virtual {v3, v5, v8, v6}, La3/n0;->i0(III)V

    iput-boolean v7, v3, La3/n0;->P:Z

    iget v5, v0, Ly2/n0;->O:I

    add-int/2addr v5, v6

    iput v5, v0, Ly2/n0;->O:I

    goto :goto_2

    :cond_4
    invoke-virtual {v3}, La3/n0;->r()Ljava/util/List;

    move-result-object v4

    check-cast v4, Lr1/b;

    iget-object v4, v4, Lr1/b;->w:Lr1/c;

    iget v4, v4, Lr1/c;->y:I

    new-instance v5, La3/n0;

    const/4 v8, 0x2

    invoke-direct {v5, v8}, La3/n0;-><init>(I)V

    iput-boolean v6, v3, La3/n0;->P:Z

    invoke-virtual {v3, v4, v5}, La3/n0;->O(ILa3/n0;)V

    iput-boolean v7, v3, La3/n0;->P:Z

    iget v4, v0, Ly2/n0;->O:I

    add-int/2addr v4, v6

    iput v4, v0, Ly2/n0;->O:I

    move-object v4, v5

    :goto_2
    invoke-virtual {v2, p1, v4}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_5
    check-cast v4, La3/n0;

    invoke-virtual {v0, v4, p1, v7, p2}, Ly2/n0;->i(La3/n0;Ljava/lang/Object;ZLc93/m;)V

    :cond_6
    :goto_3
    invoke-virtual {v3}, La3/n0;->X()Z

    move-result p2

    if-nez p2, :cond_7

    new-instance p2, Ly2/l0;

    invoke-direct {p2}, Ly2/l0;-><init>()V

    goto :goto_4

    :cond_7
    new-instance p2, Ly2/m0;

    invoke-direct {p2, v0, p1}, Ly2/m0;-><init>(Ly2/n0;Ljava/lang/Object;)V

    :goto_4
    invoke-virtual {v1, p1, p2}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3}, La3/n0;->v()La3/h0;

    move-result-object p2

    sget-object v0, La3/h0;->y:La3/h0;

    if-ne p2, v0, :cond_8

    invoke-virtual {v3, v6}, La3/n0;->s0(Z)V

    goto :goto_6

    :cond_8
    const/4 p2, 0x6

    invoke-static {v3, v6, p2}, La3/n0;->t0(La3/n0;ZI)V

    goto :goto_6

    :cond_9
    invoke-virtual {v2, p1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La3/n0;

    if-eqz v1, :cond_a

    iget-object v3, v0, Ly2/n0;->F:La0/v0;

    invoke-virtual {v3, v1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly2/f0;

    goto :goto_5

    :cond_a
    const/4 v3, 0x0

    :goto_5
    if-eqz v3, :cond_b

    iget-boolean v3, v3, Ly2/f0;->d:Z

    if-ne v3, v6, :cond_b

    invoke-virtual {v0, v1, p1, v7, p2}, Ly2/n0;->i(La3/n0;Ljava/lang/Object;ZLc93/m;)V

    :cond_b
    :goto_6
    invoke-virtual {v2, p1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La3/n0;

    if-eqz p1, :cond_d

    invoke-virtual {p1}, La3/n0;->z()La3/g1;

    move-result-object p1

    invoke-virtual {p1}, La3/g1;->C0()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p2

    :goto_7
    if-ge v7, p2, :cond_c

    move-object v0, p1

    check-cast v0, Lr1/b;

    invoke-virtual {v0, v7}, Lr1/b;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La3/g1;

    iget-object v0, v0, La3/g1;->F:La3/r0;

    iput-boolean v6, v0, La3/r0;->b:Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_7

    :cond_c
    return-object p1

    :cond_d
    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final w0(J)I
    .locals 1

    iget-object v0, p0, Ly2/e0;->w:Ly2/h0;

    invoke-interface {v0, p1, p2}, Ly3/c;->w0(J)I

    move-result p1

    return p1
.end method

.method public final x0(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ly2/s0;
    .locals 6

    iget-object v0, p0, Ly2/e0;->w:Ly2/h0;

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Ly2/h0;->x0(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method
