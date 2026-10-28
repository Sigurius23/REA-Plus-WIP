.class public final La3/f1;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:La3/g1;


# direct methods
.method public synthetic constructor <init>(La3/g1;I)V
    .locals 0

    iput p2, p0, La3/f1;->w:I

    iput-object p1, p0, La3/f1;->x:La3/g1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    iget v0, p0, La3/f1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La3/f1;->x:La3/g1;

    iget-object v1, v0, La3/g1;->F:La3/r0;

    invoke-virtual {v1}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v2

    iget-object v2, v2, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    if-eqz v2, :cond_0

    iget-object v2, v2, La3/w0;->L:Ly2/o0;

    if-nez v2, :cond_1

    :cond_0
    iget-object v2, v1, La3/r0;->a:La3/n0;

    invoke-static {v2}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object v2

    invoke-interface {v2}, Landroidx/compose/ui/node/Owner;->getPlacementScope()Ly2/i1;

    move-result-object v2

    :cond_1
    iget-object v3, v0, La3/g1;->h0:Lkotlin/jvm/functions/Function1;

    iget-object v4, v0, La3/g1;->i0:Ll2/c;

    if-eqz v4, :cond_2

    invoke-virtual {v1}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v1

    iget-wide v5, v0, La3/g1;->j0:J

    iget v0, v0, La3/g1;->k0:F

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2}, Ly2/i1;->a(Ly2/j1;Ly2/i1;)V

    iget-wide v2, v1, Ly2/j1;->E:J

    invoke-static {v5, v6, v2, v3}, Ly3/j;->d(JJ)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3, v0, v4}, Landroidx/compose/ui/node/NodeCoordinator;->p0(JFLl2/c;)V

    goto :goto_0

    :cond_2
    if-nez v3, :cond_3

    invoke-virtual {v1}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v1

    iget-wide v3, v0, La3/g1;->j0:J

    iget v0, v0, La3/g1;->k0:F

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2}, Ly2/i1;->a(Ly2/j1;Ly2/i1;)V

    iget-wide v5, v1, Ly2/j1;->E:J

    invoke-static {v3, v4, v5, v6}, Ly3/j;->d(JJ)J

    move-result-wide v2

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v3, v0, v4}, Ly2/j1;->o0(JFLkotlin/jvm/functions/Function1;)V

    goto :goto_0

    :cond_3
    invoke-virtual {v1}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v1

    iget-wide v4, v0, La3/g1;->j0:J

    iget v0, v0, La3/g1;->k0:F

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2}, Ly2/i1;->a(Ly2/j1;Ly2/i1;)V

    iget-wide v6, v1, Ly2/j1;->E:J

    invoke-static {v4, v5, v6, v7}, Ly3/j;->d(JJ)J

    move-result-wide v4

    invoke-virtual {v1, v4, v5, v0, v3}, Ly2/j1;->o0(JFLkotlin/jvm/functions/Function1;)V

    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, La3/f1;->x:La3/g1;

    iget-object v1, v0, La3/g1;->F:La3/r0;

    invoke-virtual {v1}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v1

    iget-wide v2, v0, La3/g1;->c0:J

    invoke-interface {v1, v2, v3}, Ly2/q0;->T(J)Ly2/j1;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1
    iget-object v0, p0, La3/f1;->x:La3/g1;

    iget-object v1, v0, La3/g1;->F:La3/r0;

    const/4 v2, 0x0

    iput v2, v1, La3/r0;->i:I

    iget-object v3, v1, La3/r0;->a:La3/n0;

    invoke-virtual {v3}, La3/n0;->M()Lr1/c;

    move-result-object v3

    iget-object v4, v3, Lr1/c;->w:[Ljava/lang/Object;

    iget v3, v3, Lr1/c;->y:I

    move v5, v2

    :goto_1
    const v6, 0x7fffffff

    if-ge v5, v3, :cond_5

    aget-object v7, v4, v5

    check-cast v7, La3/n0;

    invoke-virtual {v7}, La3/n0;->z()La3/g1;

    move-result-object v7

    iget v8, v7, La3/g1;->I:I

    iput v8, v7, La3/g1;->H:I

    iput v6, v7, La3/g1;->I:I

    iput-boolean v2, v7, La3/g1;->U:Z

    iget-object v6, v7, La3/g1;->L:La3/j0;

    sget-object v8, La3/j0;->x:La3/j0;

    if-ne v6, v8, :cond_4

    sget-object v6, La3/j0;->y:La3/j0;

    iput-object v6, v7, La3/g1;->L:La3/j0;

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_5
    iget-object v3, v1, La3/r0;->a:La3/n0;

    iget-object v1, v1, La3/r0;->a:La3/n0;

    invoke-virtual {v3}, La3/n0;->M()Lr1/c;

    move-result-object v3

    iget-object v4, v3, Lr1/c;->w:[Ljava/lang/Object;

    iget v3, v3, Lr1/c;->y:I

    move v5, v2

    :goto_2
    if-ge v5, v3, :cond_6

    aget-object v7, v4, v5

    check-cast v7, La3/n0;

    invoke-virtual {v7}, La3/n0;->t()La3/r0;

    move-result-object v7

    iget-object v7, v7, La3/r0;->p:La3/g1;

    iget-object v7, v7, La3/g1;->Y:La3/o0;

    iput-boolean v2, v7, La3/a;->d:Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_6
    invoke-virtual {v0}, La3/g1;->J()Landroidx/compose/ui/node/a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->O0()Ly2/s0;

    move-result-object v0

    invoke-interface {v0}, Ly2/s0;->b()V

    invoke-virtual {v1}, La3/n0;->M()Lr1/c;

    move-result-object v0

    iget-object v3, v0, Lr1/c;->w:[Ljava/lang/Object;

    iget v0, v0, Lr1/c;->y:I

    move v4, v2

    :goto_3
    if-ge v4, v0, :cond_9

    aget-object v5, v3, v4

    check-cast v5, La3/n0;

    invoke-virtual {v5}, La3/n0;->z()La3/g1;

    move-result-object v7

    iget v7, v7, La3/g1;->H:I

    invoke-virtual {v5}, La3/n0;->H()I

    move-result v8

    if-eq v7, v8, :cond_8

    invoke-virtual {v1}, La3/n0;->l0()V

    invoke-virtual {v1}, La3/n0;->P()V

    invoke-virtual {v5}, La3/n0;->H()I

    move-result v7

    if-ne v7, v6, :cond_8

    invoke-virtual {v5}, La3/n0;->t()La3/r0;

    move-result-object v7

    iget-boolean v7, v7, La3/r0;->c:Z

    if-eqz v7, :cond_7

    invoke-virtual {v5}, La3/n0;->y()La3/c1;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v7, v2}, La3/c1;->C0(Z)V

    :cond_7
    invoke-virtual {v5}, La3/n0;->z()La3/g1;

    move-result-object v5

    invoke-virtual {v5}, La3/g1;->G0()V

    :cond_8
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_9
    invoke-virtual {v1}, La3/n0;->M()Lr1/c;

    move-result-object v0

    iget-object v1, v0, Lr1/c;->w:[Ljava/lang/Object;

    iget v0, v0, Lr1/c;->y:I

    :goto_4
    if-ge v2, v0, :cond_a

    aget-object v3, v1, v2

    check-cast v3, La3/n0;

    invoke-virtual {v3}, La3/n0;->t()La3/r0;

    move-result-object v3

    iget-object v3, v3, La3/r0;->p:La3/g1;

    iget-object v3, v3, La3/g1;->Y:La3/o0;

    iget-boolean v4, v3, La3/a;->d:Z

    iput-boolean v4, v3, La3/a;->e:Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_a
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
