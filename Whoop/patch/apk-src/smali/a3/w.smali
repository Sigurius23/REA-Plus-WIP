.class public final La3/w;
.super La3/x0;
.source "SourceFile"


# virtual methods
.method public final C(I)I
    .locals 3

    iget-object v0, p0, La3/x0;->O:Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v0, v0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-virtual {v0}, La3/n0;->E()Lcom/google/crypto/tink/internal/l0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/l0;->R()Ly2/r0;

    move-result-object v1

    iget-object v0, v0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, La3/n0;

    iget-object v2, v0, La3/n0;->e0:La3/l1;

    iget-object v2, v2, La3/l1;->e:Ljava/lang/Object;

    check-cast v2, Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {v0}, La3/n0;->o()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v2, v0, p1}, Ly2/r0;->b(Ly2/r;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final F0(Ly2/a;)I
    .locals 6

    iget-object v0, p0, La3/x0;->O:Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v0, v0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-virtual {v0}, La3/n0;->t()La3/r0;

    move-result-object v0

    iget-object v0, v0, La3/r0;->q:La3/c1;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v1, v0, La3/c1;->S:La3/s0;

    iget-boolean v2, v0, La3/c1;->K:Z

    const/4 v3, 0x1

    if-nez v2, :cond_1

    iget-object v2, v0, La3/c1;->F:La3/r0;

    iget-object v4, v2, La3/r0;->d:La3/h0;

    sget-object v5, La3/h0;->x:La3/h0;

    if-ne v4, v5, :cond_0

    iput-boolean v3, v1, La3/a;->f:Z

    iget-boolean v4, v1, La3/a;->b:Z

    if-eqz v4, :cond_1

    iput-boolean v3, v2, La3/r0;->f:Z

    iput-boolean v3, v2, La3/r0;->g:Z

    goto :goto_0

    :cond_0
    iput-boolean v3, v1, La3/a;->g:Z

    :cond_1
    :goto_0
    invoke-virtual {v0}, La3/c1;->J()Landroidx/compose/ui/node/a;

    move-result-object v2

    iget-object v2, v2, Landroidx/compose/ui/node/a;->q0:La3/w;

    if-eqz v2, :cond_2

    iput-boolean v3, v2, La3/w0;->K:Z

    :cond_2
    invoke-virtual {v0}, La3/c1;->t()V

    invoke-virtual {v0}, La3/c1;->J()Landroidx/compose/ui/node/a;

    move-result-object v0

    iget-object v0, v0, Landroidx/compose/ui/node/a;->q0:La3/w;

    if-eqz v0, :cond_3

    const/4 v2, 0x0

    iput-boolean v2, v0, La3/w0;->K:Z

    :cond_3
    iget-object v0, v1, La3/a;->i:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_1

    :cond_4
    const/high16 v0, -0x80000000

    :goto_1
    iget-object v1, p0, La3/x0;->T:La0/m0;

    invoke-virtual {v1, p1, v0}, La0/m0;->h(Ljava/lang/Object;I)V

    return v0
.end method

.method public final O(I)I
    .locals 3

    iget-object v0, p0, La3/x0;->O:Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v0, v0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-virtual {v0}, La3/n0;->E()Lcom/google/crypto/tink/internal/l0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/l0;->R()Ly2/r0;

    move-result-object v1

    iget-object v0, v0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, La3/n0;

    iget-object v2, v0, La3/n0;->e0:La3/l1;

    iget-object v2, v2, La3/l1;->e:Ljava/lang/Object;

    check-cast v2, Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {v0}, La3/n0;->o()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v2, v0, p1}, Ly2/r0;->e(Ly2/r;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final Q(I)I
    .locals 3

    iget-object v0, p0, La3/x0;->O:Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v0, v0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-virtual {v0}, La3/n0;->E()Lcom/google/crypto/tink/internal/l0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/l0;->R()Ly2/r0;

    move-result-object v1

    iget-object v0, v0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, La3/n0;

    iget-object v2, v0, La3/n0;->e0:La3/l1;

    iget-object v2, v2, La3/l1;->e:Ljava/lang/Object;

    check-cast v2, Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {v0}, La3/n0;->o()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v2, v0, p1}, Ly2/r0;->c(Ly2/r;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final T(J)Ly2/j1;
    .locals 6

    invoke-virtual {p0, p1, p2}, Ly2/j1;->v0(J)V

    iget-object v0, p0, La3/x0;->O:Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v1, v0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-virtual {v1}, La3/n0;->M()Lr1/c;

    move-result-object v1

    iget-object v2, v1, Lr1/c;->w:[Ljava/lang/Object;

    iget v1, v1, Lr1/c;->y:I

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v2, v3

    check-cast v4, La3/n0;

    invoke-virtual {v4}, La3/n0;->y()La3/c1;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object v5, La3/j0;->y:La3/j0;

    iput-object v5, v4, La3/c1;->J:La3/j0;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, v0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    iget-object v1, v0, La3/n0;->V:Ly2/r0;

    invoke-virtual {v0}, La3/n0;->o()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, p0, v0, p1, p2}, Ly2/r0;->a(Ly2/t0;Ljava/util/List;J)Ly2/s0;

    move-result-object p1

    invoke-static {p0, p1}, La3/x0;->V0(La3/x0;Ly2/s0;)V

    return-object p0
.end method

.method public final W0()V
    .locals 1

    iget-object v0, p0, La3/x0;->O:Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v0, v0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-virtual {v0}, La3/n0;->y()La3/c1;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, La3/c1;->I0()V

    return-void
.end method

.method public final b(I)I
    .locals 3

    iget-object v0, p0, La3/x0;->O:Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v0, v0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-virtual {v0}, La3/n0;->E()Lcom/google/crypto/tink/internal/l0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/l0;->R()Ly2/r0;

    move-result-object v1

    iget-object v0, v0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, La3/n0;

    iget-object v2, v0, La3/n0;->e0:La3/l1;

    iget-object v2, v2, La3/l1;->e:Ljava/lang/Object;

    check-cast v2, Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {v0}, La3/n0;->o()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v2, v0, p1}, Ly2/r0;->d(Ly2/r;Ljava/util/List;I)I

    move-result p1

    return p1
.end method
