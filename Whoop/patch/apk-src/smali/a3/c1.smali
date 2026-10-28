.class public final La3/c1;
.super Ly2/j1;
.source "SourceFile"

# interfaces
.implements Ly2/q0;
.implements La3/b;
.implements La3/i1;


# instance fields
.field public final F:La3/r0;

.field public G:Z

.field public H:I

.field public I:I

.field public J:La3/j0;

.field public K:Z

.field public L:Z

.field public M:Z

.field public N:Ly3/a;

.field public O:J

.field public P:Lkotlin/jvm/functions/Function1;

.field public Q:Ll2/c;

.field public R:La3/y0;

.field public final S:La3/s0;

.field public final T:Lr1/c;

.field public U:Z

.field public V:Z

.field public W:Z

.field public X:Ljava/lang/Object;

.field public Y:Z


# direct methods
.method public constructor <init>(La3/r0;)V
    .locals 2

    invoke-direct {p0}, Ly2/j1;-><init>()V

    iput-object p1, p0, La3/c1;->F:La3/r0;

    const v0, 0x7fffffff

    iput v0, p0, La3/c1;->H:I

    iput v0, p0, La3/c1;->I:I

    sget-object v0, La3/j0;->y:La3/j0;

    iput-object v0, p0, La3/c1;->J:La3/j0;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, La3/c1;->O:J

    sget-object v0, La3/y0;->y:La3/y0;

    iput-object v0, p0, La3/c1;->R:La3/y0;

    new-instance v0, La3/s0;

    invoke-direct {v0, p0}, La3/s0;-><init>(La3/c1;)V

    iput-object v0, p0, La3/c1;->S:La3/s0;

    new-instance v0, Lr1/c;

    const/16 v1, 0x10

    new-array v1, v1, [La3/c1;

    invoke-direct {v0, v1}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iput-object v0, p0, La3/c1;->T:Lr1/c;

    const/4 v0, 0x1

    iput-boolean v0, p0, La3/c1;->U:Z

    iput-boolean v0, p0, La3/c1;->W:Z

    iget-object p1, p1, La3/r0;->p:La3/g1;

    iget-object p1, p1, La3/g1;->S:Ljava/lang/Object;

    iput-object p1, p0, La3/c1;->X:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final C(I)I
    .locals 1

    invoke-virtual {p0}, La3/c1;->H0()V

    iget-object v0, p0, La3/c1;->F:La3/r0;

    invoke-virtual {v0}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->e1()La3/x0;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v0, p1}, Ly2/q0;->C(I)I

    move-result p1

    return p1
.end method

.method public final C0(Z)V
    .locals 4

    iget-object v0, p0, La3/c1;->F:La3/r0;

    if-eqz p1, :cond_0

    iget-boolean v1, v0, La3/r0;->c:Z

    if-nez v1, :cond_2

    :cond_0
    if-nez p1, :cond_1

    iget-boolean p1, v0, La3/r0;->c:Z

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    sget-object p1, La3/y0;->y:La3/y0;

    iput-object p1, p0, La3/c1;->R:La3/y0;

    iget-object p1, v0, La3/r0;->a:La3/n0;

    invoke-virtual {p1}, La3/n0;->M()Lr1/c;

    move-result-object p1

    iget-object v0, p1, Lr1/c;->w:[Ljava/lang/Object;

    iget p1, p1, Lr1/c;->y:I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_2

    aget-object v2, v0, v1

    check-cast v2, La3/n0;

    invoke-virtual {v2}, La3/n0;->t()La3/r0;

    move-result-object v2

    iget-object v2, v2, La3/r0;->q:La3/c1;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, La3/c1;->C0(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final F0()V
    .locals 7

    iget-object v0, p0, La3/c1;->R:La3/y0;

    iget-object v1, p0, La3/c1;->F:La3/r0;

    iget-boolean v2, v1, La3/r0;->c:Z

    iget-object v3, v1, La3/r0;->a:La3/n0;

    if-eqz v2, :cond_0

    sget-object v2, La3/y0;->x:La3/y0;

    iput-object v2, p0, La3/c1;->R:La3/y0;

    goto :goto_0

    :cond_0
    sget-object v2, La3/y0;->w:La3/y0;

    iput-object v2, p0, La3/c1;->R:La3/y0;

    :goto_0
    sget-object v2, La3/y0;->w:La3/y0;

    if-eq v0, v2, :cond_1

    iget-boolean v0, v1, La3/r0;->e:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x6

    const/4 v1, 0x1

    invoke-static {v3, v1, v0}, La3/n0;->t0(La3/n0;ZI)V

    :cond_1
    invoke-virtual {v3}, La3/n0;->M()Lr1/c;

    move-result-object v0

    iget-object v1, v0, Lr1/c;->w:[Ljava/lang/Object;

    iget v0, v0, Lr1/c;->y:I

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v0, :cond_4

    aget-object v3, v1, v2

    check-cast v3, La3/n0;

    invoke-virtual {v3}, La3/n0;->y()La3/c1;

    move-result-object v4

    if-eqz v4, :cond_3

    iget v5, v4, La3/c1;->I:I

    const v6, 0x7fffffff

    if-eq v5, v6, :cond_2

    invoke-virtual {v4}, La3/c1;->F0()V

    invoke-static {v3}, La3/n0;->w0(La3/n0;)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Error: Child node\'s lookahead pass delegate cannot be null when in a lookahead scope."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    return-void
.end method

.method public final G0()V
    .locals 7

    iget-object v0, p0, La3/c1;->F:La3/r0;

    iget v1, v0, La3/r0;->o:I

    if-lez v1, :cond_3

    iget-object v0, v0, La3/r0;->a:La3/n0;

    invoke-virtual {v0}, La3/n0;->M()Lr1/c;

    move-result-object v0

    iget-object v1, v0, Lr1/c;->w:[Ljava/lang/Object;

    iget v0, v0, Lr1/c;->y:I

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_3

    aget-object v4, v1, v3

    check-cast v4, La3/n0;

    invoke-virtual {v4}, La3/n0;->t()La3/r0;

    move-result-object v5

    iget-boolean v6, v5, La3/r0;->m:Z

    if-nez v6, :cond_0

    iget-boolean v6, v5, La3/r0;->n:Z

    if-eqz v6, :cond_1

    :cond_0
    iget-boolean v6, v5, La3/r0;->f:Z

    if-nez v6, :cond_1

    invoke-virtual {v4, v2}, La3/n0;->s0(Z)V

    :cond_1
    iget-object v4, v5, La3/r0;->q:La3/c1;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, La3/c1;->G0()V

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final H0()V
    .locals 4

    iget-object v0, p0, La3/c1;->F:La3/r0;

    iget-object v1, v0, La3/r0;->a:La3/n0;

    const/4 v2, 0x0

    const/4 v3, 0x7

    invoke-static {v1, v2, v3}, La3/n0;->t0(La3/n0;ZI)V

    iget-object v0, v0, La3/r0;->a:La3/n0;

    invoke-virtual {v0}, La3/n0;->G()La3/n0;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v2, v0, La3/n0;->b0:La3/j0;

    sget-object v3, La3/j0;->y:La3/j0;

    if-ne v2, v3, :cond_2

    invoke-virtual {v1}, La3/n0;->v()La3/h0;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-eqz v2, :cond_1

    const/4 v3, 0x2

    if-eq v2, v3, :cond_0

    iget-object v1, v1, La3/n0;->b0:La3/j0;

    goto :goto_0

    :cond_0
    sget-object v1, La3/j0;->x:La3/j0;

    goto :goto_0

    :cond_1
    sget-object v1, La3/j0;->w:La3/j0;

    :goto_0
    iput-object v1, v0, La3/n0;->b0:La3/j0;

    :cond_2
    return-void
.end method

.method public final I0()V
    .locals 6

    const/4 v0, 0x1

    iput-boolean v0, p0, La3/c1;->Y:Z

    iget-object v1, p0, La3/c1;->F:La3/r0;

    iget-object v2, v1, La3/r0;->a:La3/n0;

    invoke-virtual {v2}, La3/n0;->G()La3/n0;

    move-result-object v2

    iget-object v3, p0, La3/c1;->R:La3/y0;

    sget-object v4, La3/y0;->w:La3/y0;

    const/4 v5, 0x0

    if-eq v3, v4, :cond_0

    iget-boolean v4, v1, La3/r0;->c:Z

    if-eqz v4, :cond_1

    :cond_0
    sget-object v4, La3/y0;->x:La3/y0;

    if-eq v3, v4, :cond_2

    iget-boolean v1, v1, La3/r0;->c:Z

    if-eqz v1, :cond_2

    :cond_1
    invoke-virtual {p0}, La3/c1;->F0()V

    iget-boolean v1, p0, La3/c1;->G:Z

    if-eqz v1, :cond_2

    if-eqz v2, :cond_2

    invoke-virtual {v2, v5}, La3/n0;->s0(Z)V

    :cond_2
    if-eqz v2, :cond_5

    iget-boolean v1, p0, La3/c1;->G:Z

    if-nez v1, :cond_6

    invoke-virtual {v2}, La3/n0;->v()La3/h0;

    move-result-object v1

    sget-object v3, La3/h0;->y:La3/h0;

    if-eq v1, v3, :cond_3

    invoke-virtual {v2}, La3/n0;->v()La3/h0;

    move-result-object v1

    sget-object v3, La3/h0;->z:La3/h0;

    if-ne v1, v3, :cond_6

    :cond_3
    iget v1, p0, La3/c1;->I:I

    const v3, 0x7fffffff

    if-ne v1, v3, :cond_4

    goto :goto_0

    :cond_4
    const-string v1, "Place was called on a node which was placed already"

    invoke-static {v1}, Lx2/a;->b(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v2}, La3/n0;->t()La3/r0;

    move-result-object v1

    iget v1, v1, La3/r0;->h:I

    iput v1, p0, La3/c1;->I:I

    invoke-virtual {v2}, La3/n0;->t()La3/r0;

    move-result-object v1

    iget v2, v1, La3/r0;->h:I

    add-int/2addr v2, v0

    iput v2, v1, La3/r0;->h:I

    goto :goto_1

    :cond_5
    iput v5, p0, La3/c1;->I:I

    :cond_6
    :goto_1
    invoke-virtual {p0}, La3/c1;->t()V

    return-void
.end method

.method public final J()Landroidx/compose/ui/node/a;
    .locals 1

    iget-object v0, p0, La3/c1;->F:La3/r0;

    iget-object v0, v0, La3/r0;->a:La3/n0;

    iget-object v0, v0, La3/n0;->e0:La3/l1;

    iget-object v0, v0, La3/l1;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/node/a;

    return-object v0
.end method

.method public final L0(JLkotlin/jvm/functions/Function1;Ll2/c;)V
    .locals 9

    iget-object v0, p0, La3/c1;->F:La3/r0;

    iget-object v1, v0, La3/r0;->a:La3/n0;

    iget-object v2, v0, La3/r0;->a:La3/n0;

    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {v1}, La3/n0;->G()La3/n0;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v4}, La3/n0;->v()La3/h0;

    move-result-object v4

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_0
    move-object v4, v3

    :goto_0
    sget-object v5, La3/h0;->z:La3/h0;

    const/4 v6, 0x0

    if-ne v4, v5, :cond_1

    iput-boolean v6, v0, La3/r0;->c:Z

    :cond_1
    iget-boolean v4, v2, La3/n0;->o0:Z

    if-eqz v4, :cond_2

    const-string v4, "place is called on a deactivated node"

    invoke-static {v4}, Lx2/a;->a(Ljava/lang/String;)V

    :cond_2
    iput-object v5, v0, La3/r0;->d:La3/h0;

    const/4 v4, 0x1

    iput-boolean v4, p0, La3/c1;->L:Z

    iput-boolean v6, p0, La3/c1;->Y:Z

    iget-wide v7, p0, La3/c1;->O:J

    invoke-static {p1, p2, v7, v8}, Ly3/j;->b(JJ)Z

    move-result v5

    if-nez v5, :cond_5

    iget-boolean v5, v0, La3/r0;->n:Z

    if-nez v5, :cond_3

    iget-boolean v5, v0, La3/r0;->m:Z

    if-eqz v5, :cond_4

    :cond_3
    iput-boolean v4, v0, La3/r0;->f:Z

    :cond_4
    invoke-virtual {p0}, La3/c1;->G0()V

    :cond_5
    invoke-static {v2}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object v4

    iget-boolean v5, v0, La3/r0;->f:Z

    if-nez v5, :cond_6

    invoke-virtual {p0}, La3/c1;->v()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {v0}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/ui/node/NodeCoordinator;->e1()La3/x0;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-wide v4, v2, Ly2/j1;->E:J

    invoke-static {p1, p2, v4, v5}, Ly3/j;->d(JJ)J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, La3/x0;->X0(J)V

    invoke-virtual {p0}, La3/c1;->I0()V

    goto :goto_1

    :cond_6
    invoke-virtual {v0, v6}, La3/r0;->h(Z)V

    iget-object v5, p0, La3/c1;->S:La3/s0;

    iput-boolean v6, v5, La3/a;->g:Z

    invoke-interface {v4}, Landroidx/compose/ui/node/Owner;->getSnapshotObserver()La3/c2;

    move-result-object v5

    new-instance v6, La3/b1;

    invoke-direct {v6, p0, v4, p1, p2}, La3/b1;-><init>(La3/c1;Landroidx/compose/ui/node/Owner;J)V

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v2, La3/n0;->G:La3/n0;

    if-eqz v4, :cond_7

    iget-object v4, v5, La3/c2;->g:La3/f;

    invoke-virtual {v5, v2, v4, v6}, La3/c2;->a(La3/b2;Lkotlin/jvm/functions/Function1;Lc93/a;)V

    goto :goto_1

    :cond_7
    iget-object v4, v5, La3/c2;->f:La3/f;

    invoke-virtual {v5, v2, v4, v6}, La3/c2;->a(La3/b2;Lkotlin/jvm/functions/Function1;Lc93/a;)V

    :goto_1
    iput-wide p1, p0, La3/c1;->O:J

    iput-object p3, p0, La3/c1;->P:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, La3/c1;->Q:Ll2/c;

    sget-object p1, La3/h0;->E:La3/h0;

    iput-object p1, v0, La3/r0;->d:La3/h0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :goto_2
    invoke-virtual {v1, p1}, La3/n0;->y0(Ljava/lang/Throwable;)V

    throw v3
.end method

.method public final M0(J)Z
    .locals 12

    iget-object v0, p0, La3/c1;->F:La3/r0;

    iget-object v1, v0, La3/r0;->a:La3/n0;

    iget-object v2, v0, La3/r0;->a:La3/n0;

    :try_start_0
    iget-boolean v3, v1, La3/n0;->o0:Z

    if-eqz v3, :cond_0

    const-string v3, "measure is called on a deactivated node"

    invoke-static {v3}, Lx2/a;->a(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_9

    :cond_0
    :goto_0
    invoke-virtual {v2}, La3/n0;->G()La3/n0;

    move-result-object v3

    iget-boolean v4, v2, La3/n0;->d0:Z

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-nez v4, :cond_2

    if-eqz v3, :cond_1

    iget-boolean v3, v3, La3/n0;->d0:Z

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    move v3, v6

    goto :goto_2

    :cond_2
    :goto_1
    move v3, v5

    :goto_2
    iput-boolean v3, v2, La3/n0;->d0:Z

    invoke-virtual {v2}, La3/n0;->x()Z

    move-result v3

    if-nez v3, :cond_6

    iget-object v3, p0, La3/c1;->N:Ly3/a;

    if-nez v3, :cond_3

    move v3, v6

    goto :goto_3

    :cond_3
    iget-wide v3, v3, Ly3/a;->a:J

    invoke-static {v3, v4, p1, p2}, Ly3/a;->c(JJ)Z

    move-result v3

    :goto_3
    if-nez v3, :cond_4

    goto :goto_4

    :cond_4
    iget-object p1, v2, La3/n0;->M:Landroidx/compose/ui/node/Owner;

    if-eqz p1, :cond_5

    check-cast p1, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {p1, v2, v5}, Landroidx/compose/ui/platform/AndroidComposeView;->l(La3/n0;Z)V

    :cond_5
    invoke-virtual {v2}, La3/n0;->x0()V

    return v6

    :cond_6
    :goto_4
    new-instance v3, Ly3/a;

    invoke-direct {v3, p1, p2}, Ly3/a;-><init>(J)V

    iput-object v3, p0, La3/c1;->N:Ly3/a;

    invoke-virtual {p0, p1, p2}, Ly2/j1;->v0(J)V

    iget-object v3, p0, La3/c1;->S:La3/s0;

    iput-boolean v6, v3, La3/a;->f:Z

    invoke-virtual {v2}, La3/n0;->M()Lr1/c;

    move-result-object v2

    iget-object v3, v2, Lr1/c;->w:[Ljava/lang/Object;

    iget v2, v2, Lr1/c;->y:I

    move v4, v6

    :goto_5
    if-ge v4, v2, :cond_7

    aget-object v7, v3, v4

    check-cast v7, La3/n0;

    invoke-virtual {v7}, La3/n0;->t()La3/r0;

    move-result-object v7

    iget-object v7, v7, La3/r0;->q:La3/c1;

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v7, v7, La3/c1;->S:La3/s0;

    iput-boolean v6, v7, La3/a;->c:Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_7
    iget-boolean v2, p0, La3/c1;->M:Z

    const-wide v3, 0xffffffffL

    const/16 v7, 0x20

    if-eqz v2, :cond_8

    iget-wide v8, p0, Ly2/j1;->y:J

    goto :goto_6

    :cond_8
    const/high16 v2, -0x80000000

    int-to-long v8, v2

    shl-long v10, v8, v7

    and-long/2addr v8, v3

    or-long/2addr v8, v10

    :goto_6
    iput-boolean v5, p0, La3/c1;->M:Z

    invoke-virtual {v0}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/ui/node/NodeCoordinator;->e1()La3/x0;

    move-result-object v2

    if-eqz v2, :cond_9

    move v10, v5

    goto :goto_7

    :cond_9
    move v10, v6

    :goto_7
    if-nez v10, :cond_a

    const-string v10, "Lookahead result from lookaheadRemeasure cannot be null"

    invoke-static {v10}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_a
    invoke-virtual {v0, p1, p2}, La3/r0;->c(J)V

    iget p1, v2, Ly2/j1;->w:I

    iget p2, v2, Ly2/j1;->x:I

    int-to-long v10, p1

    shl-long/2addr v10, v7

    int-to-long p1, p2

    and-long/2addr p1, v3

    or-long/2addr p1, v10

    invoke-virtual {p0, p1, p2}, Ly2/j1;->r0(J)V

    shr-long p1, v8, v7

    long-to-int p1, p1

    iget p2, v2, Ly2/j1;->w:I

    if-ne p1, p2, :cond_c

    and-long p1, v8, v3

    long-to-int p1, p1

    iget p2, v2, Ly2/j1;->x:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq p1, p2, :cond_b

    goto :goto_8

    :cond_b
    return v6

    :cond_c
    :goto_8
    return v5

    :goto_9
    invoke-virtual {v1, p1}, La3/n0;->y0(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final O(I)I
    .locals 1

    invoke-virtual {p0}, La3/c1;->H0()V

    iget-object v0, p0, La3/c1;->F:La3/r0;

    invoke-virtual {v0}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->e1()La3/x0;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v0, p1}, Ly2/q0;->O(I)I

    move-result p1

    return p1
.end method

.method public final Q(I)I
    .locals 1

    invoke-virtual {p0}, La3/c1;->H0()V

    iget-object v0, p0, La3/c1;->F:La3/r0;

    invoke-virtual {v0}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->e1()La3/x0;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v0, p1}, Ly2/q0;->Q(I)I

    move-result p1

    return p1
.end method

.method public final T(J)Ly2/j1;
    .locals 5

    iget-object v0, p0, La3/c1;->F:La3/r0;

    iget-object v1, v0, La3/r0;->a:La3/n0;

    invoke-virtual {v1}, La3/n0;->G()La3/n0;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, La3/n0;->v()La3/h0;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    sget-object v3, La3/h0;->x:La3/h0;

    if-eq v1, v3, :cond_2

    iget-object v1, v0, La3/r0;->a:La3/n0;

    invoke-virtual {v1}, La3/n0;->G()La3/n0;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, La3/n0;->v()La3/h0;

    move-result-object v2

    :cond_1
    sget-object v1, La3/h0;->z:La3/h0;

    if-ne v2, v1, :cond_3

    :cond_2
    const/4 v1, 0x0

    iput-boolean v1, v0, La3/r0;->b:Z

    :cond_3
    iget-object v1, v0, La3/r0;->a:La3/n0;

    invoke-virtual {v1}, La3/n0;->G()La3/n0;

    move-result-object v2

    if-eqz v2, :cond_9

    iget-object v3, p0, La3/c1;->J:La3/j0;

    sget-object v4, La3/j0;->y:La3/j0;

    if-eq v3, v4, :cond_5

    iget-boolean v1, v1, La3/n0;->d0:Z

    if-eqz v1, :cond_4

    goto :goto_1

    :cond_4
    const-string v1, "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"

    invoke-static {v1}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_5
    :goto_1
    invoke-virtual {v2}, La3/n0;->v()La3/h0;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_8

    const/4 v3, 0x1

    if-eq v1, v3, :cond_8

    const/4 v3, 0x2

    if-eq v1, v3, :cond_7

    const/4 v3, 0x3

    if-ne v1, v3, :cond_6

    goto :goto_2

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Measurable could be only measured from the parent\'s measure or layout block. Parents state is "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, La3/n0;->v()La3/h0;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    :goto_2
    sget-object v1, La3/j0;->x:La3/j0;

    goto :goto_3

    :cond_8
    sget-object v1, La3/j0;->w:La3/j0;

    :goto_3
    iput-object v1, p0, La3/c1;->J:La3/j0;

    goto :goto_4

    :cond_9
    sget-object v1, La3/j0;->y:La3/j0;

    iput-object v1, p0, La3/c1;->J:La3/j0;

    :goto_4
    iget-object v0, v0, La3/r0;->a:La3/n0;

    iget-object v1, v0, La3/n0;->b0:La3/j0;

    sget-object v2, La3/j0;->y:La3/j0;

    if-ne v1, v2, :cond_a

    invoke-virtual {v0}, La3/n0;->d()V

    :cond_a
    invoke-virtual {p0, p1, p2}, La3/c1;->M0(J)Z

    return-object p0
.end method

.method public final a()La3/a;
    .locals 1

    iget-object v0, p0, La3/c1;->S:La3/s0;

    return-object v0
.end method

.method public final b(I)I
    .locals 1

    invoke-virtual {p0}, La3/c1;->H0()V

    iget-object v0, p0, La3/c1;->F:La3/r0;

    invoke-virtual {v0}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->e1()La3/x0;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v0, p1}, Ly2/q0;->b(I)I

    move-result p1

    return p1
.end method

.method public final b0()V
    .locals 3

    iget-object v0, p0, La3/c1;->F:La3/r0;

    iget-object v0, v0, La3/r0;->a:La3/n0;

    const/4 v1, 0x0

    const/4 v2, 0x7

    invoke-static {v0, v1, v2}, La3/n0;->t0(La3/n0;ZI)V

    return-void
.end method

.method public final c0(Ly2/a;)I
    .locals 6

    iget-object v0, p0, La3/c1;->F:La3/r0;

    iget-object v1, v0, La3/r0;->a:La3/n0;

    invoke-virtual {v1}, La3/n0;->G()La3/n0;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, La3/n0;->v()La3/h0;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    sget-object v3, La3/h0;->x:La3/h0;

    iget-object v4, p0, La3/c1;->S:La3/s0;

    const/4 v5, 0x1

    if-ne v1, v3, :cond_1

    iput-boolean v5, v4, La3/a;->c:Z

    goto :goto_1

    :cond_1
    iget-object v1, v0, La3/r0;->a:La3/n0;

    invoke-virtual {v1}, La3/n0;->G()La3/n0;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, La3/n0;->v()La3/h0;

    move-result-object v2

    :cond_2
    sget-object v1, La3/h0;->z:La3/h0;

    if-ne v2, v1, :cond_3

    iput-boolean v5, v4, La3/a;->d:Z

    :cond_3
    :goto_1
    iput-boolean v5, p0, La3/c1;->K:Z

    invoke-virtual {v0}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->e1()La3/x0;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, La3/w0;->c0(Ly2/a;)I

    move-result p1

    const/4 v0, 0x0

    iput-boolean v0, p0, La3/c1;->K:Z

    return p1
.end method

.method public final e(La0/a1;)V
    .locals 4

    iget-object v0, p0, La3/c1;->F:La3/r0;

    iget-object v0, v0, La3/r0;->a:La3/n0;

    invoke-virtual {v0}, La3/n0;->M()Lr1/c;

    move-result-object v0

    iget-object v1, v0, Lr1/c;->w:[Ljava/lang/Object;

    iget v0, v0, Lr1/c;->y:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    aget-object v3, v1, v2

    check-cast v3, La3/n0;

    invoke-virtual {v3}, La3/n0;->t()La3/r0;

    move-result-object v3

    iget-object v3, v3, La3/r0;->q:La3/c1;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1, v3}, La0/a1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final f()La3/b;
    .locals 1

    iget-object v0, p0, La3/c1;->F:La3/r0;

    iget-object v0, v0, La3/r0;->a:La3/n0;

    invoke-virtual {v0}, La3/n0;->G()La3/n0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, La3/n0;->t()La3/r0;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, La3/r0;->q:La3/c1;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final g0()I
    .locals 1

    iget-object v0, p0, La3/c1;->F:La3/r0;

    invoke-virtual {v0}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->e1()La3/x0;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ly2/j1;->g0()I

    move-result v0

    return v0
.end method

.method public final j0()I
    .locals 1

    iget-object v0, p0, La3/c1;->F:La3/r0;

    invoke-virtual {v0}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->e1()La3/x0;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ly2/j1;->j0()I

    move-result v0

    return v0
.end method

.method public final o0(JFLkotlin/jvm/functions/Function1;)V
    .locals 0

    const/4 p3, 0x0

    invoke-virtual {p0, p1, p2, p4, p3}, La3/c1;->L0(JLkotlin/jvm/functions/Function1;Ll2/c;)V

    return-void
.end method

.method public final p()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, La3/c1;->X:Ljava/lang/Object;

    return-object v0
.end method

.method public final p0(JFLl2/c;)V
    .locals 0

    const/4 p3, 0x0

    invoke-virtual {p0, p1, p2, p3, p4}, La3/c1;->L0(JLkotlin/jvm/functions/Function1;Ll2/c;)V

    return-void
.end method

.method public final requestLayout()V
    .locals 2

    iget-object v0, p0, La3/c1;->F:La3/r0;

    iget-object v0, v0, La3/r0;->a:La3/n0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, La3/n0;->s0(Z)V

    return-void
.end method

.method public final s(Z)V
    .locals 3

    iget-object v0, p0, La3/c1;->F:La3/r0;

    invoke-virtual {v0}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/node/NodeCoordinator;->e1()La3/x0;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-boolean v1, v1, La3/w0;->I:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->e1()La3/x0;

    move-result-object v0

    if-eqz v0, :cond_1

    iput-boolean p1, v0, La3/w0;->I:Z

    :cond_1
    return-void
.end method

.method public final t()V
    .locals 12

    const/4 v0, 0x1

    iput-boolean v0, p0, La3/c1;->V:Z

    iget-object v1, p0, La3/c1;->S:La3/s0;

    invoke-virtual {v1}, La3/a;->i()V

    iget-object v2, p0, La3/c1;->F:La3/r0;

    iget-boolean v3, v2, La3/r0;->f:Z

    iget-object v4, v2, La3/r0;->a:La3/n0;

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    invoke-virtual {v4}, La3/n0;->M()Lr1/c;

    move-result-object v3

    iget-object v6, v3, Lr1/c;->w:[Ljava/lang/Object;

    iget v3, v3, Lr1/c;->y:I

    move v7, v5

    :goto_0
    if-ge v7, v3, :cond_2

    aget-object v8, v6, v7

    check-cast v8, La3/n0;

    invoke-virtual {v8}, La3/n0;->x()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-virtual {v8}, La3/n0;->C()La3/j0;

    move-result-object v9

    sget-object v10, La3/j0;->w:La3/j0;

    if-ne v9, v10, :cond_1

    invoke-virtual {v8}, La3/n0;->t()La3/r0;

    move-result-object v9

    iget-object v9, v9, La3/r0;->q:La3/c1;

    invoke-static {v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v8}, La3/n0;->t()La3/r0;

    move-result-object v8

    iget-object v8, v8, La3/r0;->q:La3/c1;

    if-eqz v8, :cond_0

    iget-object v8, v8, La3/c1;->N:Ly3/a;

    goto :goto_1

    :cond_0
    const/4 v8, 0x0

    :goto_1
    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-wide v10, v8, Ly3/a;->a:J

    invoke-virtual {v9, v10, v11}, La3/c1;->M0(J)Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v8, 0x7

    invoke-static {v4, v5, v8}, La3/n0;->t0(La3/n0;ZI)V

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, La3/c1;->J()Landroidx/compose/ui/node/a;

    move-result-object v3

    iget-object v3, v3, Landroidx/compose/ui/node/a;->q0:La3/w;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-boolean v6, v2, La3/r0;->g:Z

    if-nez v6, :cond_3

    iget-boolean v6, p0, La3/c1;->K:Z

    if-nez v6, :cond_6

    iget-boolean v6, v3, La3/w0;->K:Z

    if-nez v6, :cond_6

    iget-boolean v6, v2, La3/r0;->f:Z

    if-eqz v6, :cond_6

    :cond_3
    iput-boolean v5, v2, La3/r0;->f:Z

    iget-object v6, v2, La3/r0;->d:La3/h0;

    sget-object v7, La3/h0;->z:La3/h0;

    iput-object v7, v2, La3/r0;->d:La3/h0;

    invoke-static {v4}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object v7

    invoke-virtual {v2, v5}, La3/r0;->i(Z)V

    invoke-interface {v7}, Landroidx/compose/ui/node/Owner;->getSnapshotObserver()La3/c2;

    move-result-object v7

    new-instance v8, La3/z0;

    const/4 v9, 0x0

    invoke-direct {v8, v9, p0, v3}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v9, v4, La3/n0;->G:La3/n0;

    if-eqz v9, :cond_4

    iget-object v9, v7, La3/c2;->h:La3/f;

    invoke-virtual {v7, v4, v9, v8}, La3/c2;->a(La3/b2;Lkotlin/jvm/functions/Function1;Lc93/a;)V

    goto :goto_2

    :cond_4
    iget-object v9, v7, La3/c2;->e:La3/f;

    invoke-virtual {v7, v4, v9, v8}, La3/c2;->a(La3/b2;Lkotlin/jvm/functions/Function1;Lc93/a;)V

    :goto_2
    iput-object v6, v2, La3/r0;->d:La3/h0;

    iget-boolean v4, v2, La3/r0;->m:Z

    if-eqz v4, :cond_5

    iget-boolean v3, v3, La3/w0;->K:Z

    if-eqz v3, :cond_5

    invoke-virtual {p0}, La3/c1;->requestLayout()V

    :cond_5
    iput-boolean v5, v2, La3/r0;->g:Z

    :cond_6
    iget-boolean v2, v1, La3/a;->d:Z

    if-eqz v2, :cond_7

    iput-boolean v0, v1, La3/a;->e:Z

    :cond_7
    iget-boolean v0, v1, La3/a;->b:Z

    if-eqz v0, :cond_8

    invoke-virtual {v1}, La3/a;->f()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {v1}, La3/a;->h()V

    :cond_8
    iput-boolean v5, p0, La3/c1;->V:Z

    return-void
.end method

.method public final v()Z
    .locals 2

    iget-object v0, p0, La3/c1;->R:La3/y0;

    sget-object v1, La3/y0;->y:La3/y0;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
