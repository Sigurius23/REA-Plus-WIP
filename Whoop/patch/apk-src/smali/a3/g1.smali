.class public final La3/g1;
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

.field public J:Z

.field public K:Z

.field public L:La3/j0;

.field public M:Z

.field public N:J

.field public O:Lkotlin/jvm/functions/Function1;

.field public P:Ll2/c;

.field public Q:F

.field public R:Z

.field public S:Ljava/lang/Object;

.field public T:Z

.field public U:Z

.field public V:Z

.field public W:Z

.field public X:Z

.field public final Y:La3/o0;

.field public final Z:Lr1/c;

.field public a0:Z

.field public b0:Z

.field public c0:J

.field public final d0:La3/f1;

.field public final e0:La3/f1;

.field public f0:F

.field public g0:Z

.field public h0:Lkotlin/jvm/functions/Function1;

.field public i0:Ll2/c;

.field public j0:J

.field public k0:F

.field public final l0:La3/f1;

.field public m0:Z


# direct methods
.method public constructor <init>(La3/r0;)V
    .locals 4

    invoke-direct {p0}, Ly2/j1;-><init>()V

    iput-object p1, p0, La3/g1;->F:La3/r0;

    const p1, 0x7fffffff

    iput p1, p0, La3/g1;->H:I

    iput p1, p0, La3/g1;->I:I

    sget-object p1, La3/j0;->y:La3/j0;

    iput-object p1, p0, La3/g1;->L:La3/j0;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, La3/g1;->N:J

    const/4 p1, 0x1

    iput-boolean p1, p0, La3/g1;->R:Z

    new-instance v2, La3/o0;

    invoke-direct {v2, p0}, La3/a;-><init>(La3/b;)V

    iput-object v2, p0, La3/g1;->Y:La3/o0;

    new-instance v2, Lr1/c;

    const/16 v3, 0x10

    new-array v3, v3, [La3/g1;

    invoke-direct {v2, v3}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iput-object v2, p0, La3/g1;->Z:Lr1/c;

    iput-boolean p1, p0, La3/g1;->a0:Z

    const/4 p1, 0x0

    const/16 v2, 0xf

    invoke-static {p1, p1, v2}, Ly3/b;->b(III)J

    move-result-wide v2

    iput-wide v2, p0, La3/g1;->c0:J

    new-instance p1, La3/f1;

    const/4 v2, 0x1

    invoke-direct {p1, p0, v2}, La3/f1;-><init>(La3/g1;I)V

    iput-object p1, p0, La3/g1;->d0:La3/f1;

    new-instance p1, La3/f1;

    const/4 v2, 0x0

    invoke-direct {p1, p0, v2}, La3/f1;-><init>(La3/g1;I)V

    iput-object p1, p0, La3/g1;->e0:La3/f1;

    iput-wide v0, p0, La3/g1;->j0:J

    new-instance p1, La3/f1;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v0}, La3/f1;-><init>(La3/g1;I)V

    iput-object p1, p0, La3/g1;->l0:La3/f1;

    return-void
.end method


# virtual methods
.method public final C(I)I
    .locals 2

    iget-object v0, p0, La3/g1;->F:La3/r0;

    iget-object v1, v0, La3/r0;->a:La3/n0;

    invoke-static {v1}, La3/g;->k(La3/n0;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, La3/r0;->q:La3/c1;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, La3/c1;->C(I)I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p0}, La3/g1;->I0()V

    invoke-virtual {v0}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    invoke-interface {v0, p1}, Ly2/q0;->C(I)I

    move-result p1

    return p1
.end method

.method public final C0()Ljava/util/List;
    .locals 9

    iget-object v0, p0, La3/g1;->F:La3/r0;

    iget-object v1, v0, La3/r0;->a:La3/n0;

    invoke-virtual {v1}, La3/n0;->G0()V

    iget-boolean v1, p0, La3/g1;->a0:Z

    iget-object v2, p0, La3/g1;->Z:Lr1/c;

    if-nez v1, :cond_0

    invoke-virtual {v2}, Lr1/c;->f()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, v0, La3/r0;->a:La3/n0;

    invoke-virtual {v0}, La3/n0;->M()Lr1/c;

    move-result-object v1

    iget-object v3, v1, Lr1/c;->w:[Ljava/lang/Object;

    iget v1, v1, Lr1/c;->y:I

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v1, :cond_2

    aget-object v6, v3, v5

    check-cast v6, La3/n0;

    iget v7, v2, Lr1/c;->y:I

    if-gt v7, v5, :cond_1

    invoke-virtual {v6}, La3/n0;->t()La3/r0;

    move-result-object v6

    iget-object v6, v6, La3/r0;->p:La3/g1;

    invoke-virtual {v2, v6}, Lr1/c;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v6}, La3/n0;->t()La3/r0;

    move-result-object v6

    iget-object v6, v6, La3/r0;->p:La3/g1;

    iget-object v7, v2, Lr1/c;->w:[Ljava/lang/Object;

    aget-object v8, v7, v5

    aput-object v6, v7, v5

    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, La3/n0;->q()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lr1/b;

    iget-object v0, v0, Lr1/b;->w:Lr1/c;

    iget v0, v0, Lr1/c;->y:I

    iget v1, v2, Lr1/c;->y:I

    invoke-virtual {v2, v0, v1}, Lr1/c;->m(II)V

    iput-boolean v4, p0, La3/g1;->a0:Z

    invoke-virtual {v2}, Lr1/c;->f()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final F0()V
    .locals 6

    iget-boolean v0, p0, La3/g1;->T:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, La3/g1;->T:Z

    iget-object v2, p0, La3/g1;->F:La3/r0;

    iget-object v2, v2, La3/r0;->a:La3/n0;

    iget-object v3, v2, La3/n0;->e0:La3/l1;

    if-nez v0, :cond_1

    iget-object v0, v3, La3/l1;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/node/a;

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->s1()V

    invoke-virtual {v2}, La3/n0;->A()Z

    move-result v0

    const/4 v4, 0x6

    if-eqz v0, :cond_0

    invoke-static {v2, v1, v4}, La3/n0;->v0(La3/n0;ZI)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, La3/n0;->x()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {v2, v1, v4}, La3/n0;->t0(La3/n0;ZI)V

    :cond_1
    :goto_0
    iget-object v0, v3, La3/l1;->e:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v1, v3, La3/l1;->d:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/node/a;

    iget-object v1, v1, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    :goto_1
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    if-eqz v0, :cond_3

    iget-boolean v3, v0, Landroidx/compose/ui/node/NodeCoordinator;->h0:Z

    if-eqz v3, :cond_2

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->n1()V

    :cond_2
    iget-object v0, v0, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    goto :goto_1

    :cond_3
    invoke-virtual {v2}, La3/n0;->M()Lr1/c;

    move-result-object v0

    iget-object v1, v0, Lr1/c;->w:[Ljava/lang/Object;

    iget v0, v0, Lr1/c;->y:I

    const/4 v2, 0x0

    :goto_2
    if-ge v2, v0, :cond_5

    aget-object v3, v1, v2

    check-cast v3, La3/n0;

    invoke-virtual {v3}, La3/n0;->H()I

    move-result v4

    const v5, 0x7fffffff

    if-eq v4, v5, :cond_4

    invoke-virtual {v3}, La3/n0;->z()La3/g1;

    move-result-object v4

    invoke-virtual {v4}, La3/g1;->F0()V

    invoke-static {v3}, La3/n0;->w0(La3/n0;)V

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    return-void
.end method

.method public final G0()V
    .locals 14

    iget-boolean v0, p0, La3/g1;->T:Z

    if-eqz v0, :cond_b

    const/4 v0, 0x0

    iput-boolean v0, p0, La3/g1;->T:Z

    iget-object v1, p0, La3/g1;->F:La3/r0;

    iget-object v2, v1, La3/r0;->a:La3/n0;

    iget-object v2, v2, La3/n0;->e0:La3/l1;

    iget-object v3, v2, La3/l1;->e:Ljava/lang/Object;

    check-cast v3, Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v2, v2, La3/l1;->d:Ljava/lang/Object;

    check-cast v2, Landroidx/compose/ui/node/a;

    iget-object v2, v2, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    :goto_0
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    if-eqz v3, :cond_a

    const/high16 v4, 0x100000

    invoke-static {v4}, La3/r1;->g(I)Z

    move-result v5

    invoke-virtual {v3, v5}, Landroidx/compose/ui/node/NodeCoordinator;->i1(Z)Lb2/v;

    move-result-object v5

    if-eqz v5, :cond_9

    iget-object v5, v5, Lb2/v;->w:Lb2/v;

    iget v5, v5, Lb2/v;->z:I

    and-int/2addr v5, v4

    if-eqz v5, :cond_9

    invoke-static {v4}, La3/r1;->g(I)Z

    move-result v5

    invoke-virtual {v3}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object v6

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    iget-object v6, v6, Lb2/v;->E:Lb2/v;

    if-nez v6, :cond_1

    goto :goto_6

    :cond_1
    :goto_1
    invoke-virtual {v3, v5}, Landroidx/compose/ui/node/NodeCoordinator;->i1(Z)Lb2/v;

    move-result-object v5

    :goto_2
    if-eqz v5, :cond_9

    iget v7, v5, Lb2/v;->z:I

    and-int/2addr v7, v4

    if-eqz v7, :cond_9

    iget v7, v5, Lb2/v;->y:I

    and-int/2addr v7, v4

    if-eqz v7, :cond_8

    const/4 v7, 0x0

    move-object v8, v5

    move-object v9, v7

    :goto_3
    if-eqz v8, :cond_8

    iget v10, v8, Lb2/v;->y:I

    and-int/2addr v10, v4

    if-eqz v10, :cond_7

    instance-of v10, v8, La3/o;

    if-eqz v10, :cond_7

    move-object v10, v8

    check-cast v10, La3/o;

    iget-object v10, v10, La3/o;->P:Lb2/v;

    move v11, v0

    :goto_4
    const/4 v12, 0x1

    if-eqz v10, :cond_6

    iget v13, v10, Lb2/v;->y:I

    and-int/2addr v13, v4

    if-eqz v13, :cond_5

    add-int/lit8 v11, v11, 0x1

    if-ne v11, v12, :cond_2

    move-object v8, v10

    goto :goto_5

    :cond_2
    if-nez v9, :cond_3

    new-instance v9, Lr1/c;

    const/16 v12, 0x10

    new-array v12, v12, [Lb2/v;

    invoke-direct {v9, v12}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_3
    if-eqz v8, :cond_4

    invoke-virtual {v9, v8}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v8, v7

    :cond_4
    invoke-virtual {v9, v10}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_5
    :goto_5
    iget-object v10, v10, Lb2/v;->F:Lb2/v;

    goto :goto_4

    :cond_6
    if-ne v11, v12, :cond_7

    goto :goto_3

    :cond_7
    invoke-static {v9}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v8

    goto :goto_3

    :cond_8
    if-eq v5, v6, :cond_9

    iget-object v5, v5, Lb2/v;->F:Lb2/v;

    goto :goto_2

    :cond_9
    :goto_6
    invoke-virtual {v3}, Landroidx/compose/ui/node/NodeCoordinator;->y1()V

    iget-object v3, v3, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    goto/16 :goto_0

    :cond_a
    iget-object v1, v1, La3/r0;->a:La3/n0;

    invoke-virtual {v1}, La3/n0;->M()Lr1/c;

    move-result-object v1

    iget-object v2, v1, Lr1/c;->w:[Ljava/lang/Object;

    iget v1, v1, Lr1/c;->y:I

    :goto_7
    if-ge v0, v1, :cond_b

    aget-object v3, v2, v0

    check-cast v3, La3/n0;

    invoke-virtual {v3}, La3/n0;->z()La3/g1;

    move-result-object v3

    invoke-virtual {v3}, La3/g1;->G0()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_7

    :cond_b
    return-void
.end method

.method public final H0()V
    .locals 8

    iget-object v0, p0, La3/g1;->F:La3/r0;

    iget v1, v0, La3/r0;->l:I

    if-lez v1, :cond_2

    iget-object v0, v0, La3/r0;->a:La3/n0;

    invoke-virtual {v0}, La3/n0;->M()Lr1/c;

    move-result-object v0

    iget-object v1, v0, Lr1/c;->w:[Ljava/lang/Object;

    iget v0, v0, Lr1/c;->y:I

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_2

    aget-object v4, v1, v3

    check-cast v4, La3/n0;

    invoke-virtual {v4}, La3/n0;->t()La3/r0;

    move-result-object v5

    iget-boolean v6, v5, La3/r0;->j:Z

    iget-object v7, v5, La3/r0;->p:La3/g1;

    if-nez v6, :cond_0

    iget-boolean v5, v5, La3/r0;->k:Z

    if-eqz v5, :cond_1

    :cond_0
    iget-boolean v5, v7, La3/g1;->W:Z

    if-nez v5, :cond_1

    invoke-virtual {v4, v2}, La3/n0;->u0(Z)V

    :cond_1
    invoke-virtual {v7}, La3/g1;->H0()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final I0()V
    .locals 4

    iget-object v0, p0, La3/g1;->F:La3/r0;

    iget-object v1, v0, La3/r0;->a:La3/n0;

    const/4 v2, 0x0

    const/4 v3, 0x7

    invoke-static {v1, v2, v3}, La3/n0;->v0(La3/n0;ZI)V

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

.method public final J()Landroidx/compose/ui/node/a;
    .locals 1

    iget-object v0, p0, La3/g1;->F:La3/r0;

    iget-object v0, v0, La3/r0;->a:La3/n0;

    iget-object v0, v0, La3/n0;->e0:La3/l1;

    iget-object v0, v0, La3/l1;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/node/a;

    return-object v0
.end method

.method public final L0()V
    .locals 7

    const/4 v0, 0x1

    iput-boolean v0, p0, La3/g1;->g0:Z

    iget-object v1, p0, La3/g1;->F:La3/r0;

    iget-object v2, v1, La3/r0;->a:La3/n0;

    invoke-virtual {v2}, La3/n0;->G()La3/n0;

    move-result-object v2

    invoke-virtual {p0}, La3/g1;->J()Landroidx/compose/ui/node/a;

    move-result-object v3

    iget v3, v3, Landroidx/compose/ui/node/NodeCoordinator;->a0:F

    iget-object v1, v1, La3/r0;->a:La3/n0;

    iget-object v4, v1, La3/n0;->e0:La3/l1;

    iget-object v5, v4, La3/l1;->e:Ljava/lang/Object;

    check-cast v5, Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v4, v4, La3/l1;->d:Ljava/lang/Object;

    check-cast v4, Landroidx/compose/ui/node/a;

    :goto_0
    if-eq v5, v4, :cond_0

    const-string v6, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Landroidx/compose/ui/node/b;

    iget v6, v5, Landroidx/compose/ui/node/NodeCoordinator;->a0:F

    add-float/2addr v3, v6

    iget-object v5, v5, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    goto :goto_0

    :cond_0
    iget v4, p0, La3/g1;->f0:F

    cmpg-float v4, v3, v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    iput v3, p0, La3/g1;->f0:F

    if-eqz v2, :cond_2

    invoke-virtual {v2}, La3/n0;->l0()V

    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {v2}, La3/n0;->P()V

    :cond_3
    :goto_1
    iget-boolean v3, p0, La3/g1;->T:Z

    const/4 v4, 0x0

    if-nez v3, :cond_5

    if-eqz v2, :cond_4

    invoke-virtual {v2}, La3/n0;->P()V

    :cond_4
    invoke-virtual {p0}, La3/g1;->F0()V

    iget-boolean v1, p0, La3/g1;->G:Z

    if-eqz v1, :cond_6

    if-eqz v2, :cond_6

    invoke-virtual {v2, v4}, La3/n0;->u0(Z)V

    goto :goto_2

    :cond_5
    iget-object v1, v1, La3/n0;->e0:La3/l1;

    iget-object v1, v1, La3/l1;->d:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/node/a;

    invoke-virtual {v1}, Landroidx/compose/ui/node/NodeCoordinator;->s1()V

    :cond_6
    :goto_2
    if-eqz v2, :cond_8

    iget-boolean v1, p0, La3/g1;->G:Z

    if-nez v1, :cond_9

    invoke-virtual {v2}, La3/n0;->v()La3/h0;

    move-result-object v1

    sget-object v3, La3/h0;->y:La3/h0;

    if-ne v1, v3, :cond_9

    iget v1, p0, La3/g1;->I:I

    const v3, 0x7fffffff

    if-ne v1, v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v1, "Place was called on a node which was placed already"

    invoke-static {v1}, Lx2/a;->b(Ljava/lang/String;)V

    :goto_3
    invoke-virtual {v2}, La3/n0;->t()La3/r0;

    move-result-object v1

    iget v1, v1, La3/r0;->i:I

    iput v1, p0, La3/g1;->I:I

    invoke-virtual {v2}, La3/n0;->t()La3/r0;

    move-result-object v1

    iget v2, v1, La3/r0;->i:I

    add-int/2addr v2, v0

    iput v2, v1, La3/r0;->i:I

    goto :goto_4

    :cond_8
    iput v4, p0, La3/g1;->I:I

    :cond_9
    :goto_4
    invoke-virtual {p0}, La3/g1;->t()V

    return-void
.end method

.method public final M0(J)V
    .locals 5

    iget-object v0, p0, La3/g1;->F:La3/r0;

    iget-object v1, v0, La3/r0;->d:La3/h0;

    iget-object v2, v0, La3/r0;->a:La3/n0;

    sget-object v3, La3/h0;->E:La3/h0;

    if-ne v1, v3, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "layout state is not idle before measure starts"

    invoke-static {v1}, Lx2/a;->b(Ljava/lang/String;)V

    :goto_0
    iput-wide p1, p0, La3/g1;->c0:J

    sget-object p1, La3/h0;->w:La3/h0;

    iput-object p1, v0, La3/r0;->d:La3/h0;

    const/4 p2, 0x0

    iput-boolean p2, p0, La3/g1;->V:Z

    invoke-static {v2}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object p2

    invoke-interface {p2}, Landroidx/compose/ui/node/Owner;->getSnapshotObserver()La3/c2;

    move-result-object p2

    iget-object v1, p0, La3/g1;->d0:La3/f1;

    iget-object v4, p2, La3/c2;->c:La3/f;

    invoke-virtual {p2, v2, v4, v1}, La3/c2;->a(La3/b2;Lkotlin/jvm/functions/Function1;Lc93/a;)V

    iget-object p2, v0, La3/r0;->d:La3/h0;

    if-ne p2, p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, La3/g1;->W:Z

    iput-boolean p1, p0, La3/g1;->X:Z

    iput-object v3, v0, La3/r0;->d:La3/h0;

    :cond_1
    return-void
.end method

.method public final N0(JFLkotlin/jvm/functions/Function1;Ll2/c;)V
    .locals 8

    iget-object v6, p0, La3/g1;->F:La3/r0;

    iget-object v0, v6, La3/r0;->a:La3/n0;

    iget-object v1, v6, La3/r0;->a:La3/n0;

    iget-boolean v0, v0, La3/n0;->o0:Z

    if-eqz v0, :cond_0

    const-string v0, "place is called on a deactivated node"

    invoke-static {v0}, Lx2/a;->a(Ljava/lang/String;)V

    :cond_0
    sget-object v0, La3/h0;->y:La3/h0;

    iput-object v0, v6, La3/r0;->d:La3/h0;

    iput-wide p1, p0, La3/g1;->N:J

    iput p3, p0, La3/g1;->Q:F

    iput-object p4, p0, La3/g1;->O:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, La3/g1;->P:Ll2/c;

    const/4 v0, 0x0

    iput-boolean v0, p0, La3/g1;->g0:Z

    invoke-static {v1}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object v2

    iget-boolean v3, p0, La3/g1;->W:Z

    if-nez v3, :cond_1

    iget-boolean v3, p0, La3/g1;->T:Z

    if-eqz v3, :cond_1

    invoke-virtual {v6}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    iget-wide v1, v0, Ly2/j1;->E:J

    invoke-static {p1, p2, v1, v2}, Ly3/j;->d(JJ)J

    move-result-wide v1

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Landroidx/compose/ui/node/NodeCoordinator;->w1(JFLkotlin/jvm/functions/Function1;Ll2/c;)V

    invoke-virtual {p0}, La3/g1;->L0()V

    goto :goto_0

    :cond_1
    iget-object v7, p0, La3/g1;->Y:La3/o0;

    iput-boolean v0, v7, La3/a;->g:Z

    invoke-virtual {v6, v0}, La3/r0;->f(Z)V

    iput-object p4, p0, La3/g1;->h0:Lkotlin/jvm/functions/Function1;

    iput-wide p1, p0, La3/g1;->j0:J

    iput p3, p0, La3/g1;->k0:F

    iput-object p5, p0, La3/g1;->i0:Ll2/c;

    invoke-interface {v2}, Landroidx/compose/ui/node/Owner;->getSnapshotObserver()La3/c2;

    move-result-object p1

    iget-object p2, p0, La3/g1;->l0:La3/f1;

    iget-object p3, p1, La3/c2;->f:La3/f;

    invoke-virtual {p1, v1, p3, p2}, La3/c2;->a(La3/b2;Lkotlin/jvm/functions/Function1;Lc93/a;)V

    :goto_0
    sget-object p1, La3/h0;->E:La3/h0;

    iput-object p1, v6, La3/r0;->d:La3/h0;

    const/4 p1, 0x1

    iput-boolean p1, p0, La3/g1;->K:Z

    return-void
.end method

.method public final O(I)I
    .locals 2

    iget-object v0, p0, La3/g1;->F:La3/r0;

    iget-object v1, v0, La3/r0;->a:La3/n0;

    invoke-static {v1}, La3/g;->k(La3/n0;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, La3/r0;->q:La3/c1;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, La3/c1;->O(I)I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p0}, La3/g1;->I0()V

    invoke-virtual {v0}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    invoke-interface {v0, p1}, Ly2/q0;->O(I)I

    move-result p1

    return p1
.end method

.method public final O0(JFLkotlin/jvm/functions/Function1;Ll2/c;)V
    .locals 9

    iget-object v0, p0, La3/g1;->F:La3/r0;

    iget-object v1, v0, La3/r0;->a:La3/n0;

    iget-object v2, v0, La3/r0;->a:La3/n0;

    const/4 v3, 0x1

    :try_start_0
    iput-boolean v3, p0, La3/g1;->U:Z

    iget-wide v4, p0, La3/g1;->N:J

    invoke-static {p1, p2, v4, v5}, Ly3/j;->b(JJ)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    iget-boolean v4, p0, La3/g1;->m0:Z

    if-eqz v4, :cond_3

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_3

    :cond_0
    :goto_0
    iget-boolean v4, v0, La3/r0;->k:Z

    if-nez v4, :cond_1

    iget-boolean v4, v0, La3/r0;->j:Z

    if-nez v4, :cond_1

    iget-boolean v4, p0, La3/g1;->m0:Z

    if-eqz v4, :cond_2

    :cond_1
    iput-boolean v3, p0, La3/g1;->W:Z

    iput-boolean v5, p0, La3/g1;->m0:Z

    :cond_2
    invoke-virtual {p0}, La3/g1;->H0()V

    :cond_3
    iget-object v4, v0, La3/r0;->q:La3/c1;

    if-eqz v4, :cond_9

    iget-object v6, v4, La3/c1;->F:La3/r0;

    iget-object v7, v6, La3/r0;->a:La3/n0;

    invoke-static {v7}, La3/g;->k(La3/n0;)Z

    move-result v7

    if-eqz v7, :cond_4

    move v4, v3

    goto :goto_1

    :cond_4
    iget-object v4, v4, La3/c1;->R:La3/y0;

    sget-object v7, La3/y0;->y:La3/y0;

    if-ne v4, v7, :cond_5

    iget-boolean v4, v6, La3/r0;->b:Z

    if-nez v4, :cond_5

    iput-boolean v3, v6, La3/r0;->c:Z

    :cond_5
    iget-boolean v4, v6, La3/r0;->c:Z

    :goto_1
    if-ne v4, v3, :cond_9

    invoke-virtual {v0}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v4

    iget-object v4, v4, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    if-eqz v4, :cond_6

    iget-object v4, v4, La3/w0;->L:Ly2/o0;

    if-nez v4, :cond_7

    :cond_6
    invoke-static {v2}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object v4

    invoke-interface {v4}, Landroidx/compose/ui/node/Owner;->getPlacementScope()Ly2/i1;

    move-result-object v4

    :cond_7
    iget-object v6, v0, La3/r0;->q:La3/c1;

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2}, La3/n0;->G()La3/n0;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-virtual {v2}, La3/n0;->t()La3/r0;

    move-result-object v2

    iput v5, v2, La3/r0;->h:I

    :cond_8
    const v2, 0x7fffffff

    iput v2, v6, La3/c1;->I:I

    const/16 v2, 0x20

    shr-long v7, p1, v2

    long-to-int v2, v7

    const-wide v7, 0xffffffffL

    and-long/2addr v7, p1

    long-to-int v7, v7

    invoke-static {v6, v2, v7, v4}, Ly2/i1;->g(Ly2/j1;IILy2/i1;)V

    :cond_9
    iget-object v0, v0, La3/r0;->q:La3/c1;

    if-eqz v0, :cond_a

    iget-boolean v0, v0, La3/c1;->L:Z

    if-nez v0, :cond_a

    goto :goto_2

    :cond_a
    move v3, v5

    :goto_2
    if-eqz v3, :cond_b

    const-string v0, "Error: Placement happened before lookahead."

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_b
    move-object v2, p0

    move-wide v3, p1

    move v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-virtual/range {v2 .. v7}, La3/g1;->N0(JFLkotlin/jvm/functions/Function1;Ll2/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :goto_3
    invoke-virtual {v1, p1}, La3/n0;->y0(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final P0(J)Z
    .locals 8

    iget-object v0, p0, La3/g1;->F:La3/r0;

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

    goto/16 :goto_6

    :cond_0
    :goto_0
    invoke-static {v2}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object v3

    invoke-virtual {v2}, La3/n0;->G()La3/n0;

    move-result-object v4

    iget-boolean v5, v2, La3/n0;->d0:Z

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-nez v5, :cond_2

    if-eqz v4, :cond_1

    iget-boolean v4, v4, La3/n0;->d0:Z

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    move v4, v7

    goto :goto_2

    :cond_2
    :goto_1
    move v4, v6

    :goto_2
    iput-boolean v4, v2, La3/n0;->d0:Z

    invoke-virtual {v2}, La3/n0;->A()Z

    move-result v4

    if-nez v4, :cond_4

    iget-wide v4, p0, Ly2/j1;->z:J

    invoke-static {v4, v5, p1, p2}, Ly3/a;->c(JJ)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_3

    :cond_3
    check-cast v3, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v3, v2, v7}, Landroidx/compose/ui/platform/AndroidComposeView;->l(La3/n0;Z)V

    invoke-virtual {v2}, La3/n0;->x0()V

    return v7

    :cond_4
    :goto_3
    iget-object v3, p0, La3/g1;->Y:La3/o0;

    iput-boolean v7, v3, La3/a;->f:Z

    invoke-virtual {v2}, La3/n0;->M()Lr1/c;

    move-result-object v2

    iget-object v3, v2, Lr1/c;->w:[Ljava/lang/Object;

    iget v2, v2, Lr1/c;->y:I

    move v4, v7

    :goto_4
    if-ge v4, v2, :cond_5

    aget-object v5, v3, v4

    check-cast v5, La3/n0;

    invoke-virtual {v5}, La3/n0;->t()La3/r0;

    move-result-object v5

    iget-object v5, v5, La3/r0;->p:La3/g1;

    iget-object v5, v5, La3/g1;->Y:La3/o0;

    iput-boolean v7, v5, La3/a;->c:Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_5
    iput-boolean v6, p0, La3/g1;->J:Z

    invoke-virtual {v0}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v2

    iget-wide v2, v2, Ly2/j1;->y:J

    invoke-virtual {p0, p1, p2}, Ly2/j1;->v0(J)V

    invoke-virtual {p0, p1, p2}, La3/g1;->M0(J)V

    invoke-virtual {v0}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object p1

    iget-wide p1, p1, Ly2/j1;->y:J

    invoke-static {p1, p2, v2, v3}, Ly3/l;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {v0}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object p1

    iget p1, p1, Ly2/j1;->w:I

    iget p2, p0, Ly2/j1;->w:I

    if-ne p1, p2, :cond_7

    invoke-virtual {v0}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object p1

    iget p1, p1, Ly2/j1;->x:I

    iget p2, p0, Ly2/j1;->x:I

    if-eq p1, p2, :cond_6

    goto :goto_5

    :cond_6
    move v6, v7

    :cond_7
    :goto_5
    invoke-virtual {v0}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object p1

    iget p1, p1, Ly2/j1;->w:I

    invoke-virtual {v0}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object p2

    iget p2, p2, Ly2/j1;->x:I

    int-to-long v2, p1

    const/16 p1, 0x20

    shl-long/2addr v2, p1

    int-to-long p1, p2

    const-wide v4, 0xffffffffL

    and-long/2addr p1, v4

    or-long/2addr p1, v2

    invoke-virtual {p0, p1, p2}, Ly2/j1;->r0(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v6

    :goto_6
    invoke-virtual {v1, p1}, La3/n0;->y0(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final Q(I)I
    .locals 2

    iget-object v0, p0, La3/g1;->F:La3/r0;

    iget-object v1, v0, La3/r0;->a:La3/n0;

    invoke-static {v1}, La3/g;->k(La3/n0;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, La3/r0;->q:La3/c1;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, La3/c1;->Q(I)I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p0}, La3/g1;->I0()V

    invoke-virtual {v0}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    invoke-interface {v0, p1}, Ly2/q0;->Q(I)I

    move-result p1

    return p1
.end method

.method public final T(J)Ly2/j1;
    .locals 4

    iget-object v0, p0, La3/g1;->F:La3/r0;

    iget-object v1, v0, La3/r0;->a:La3/n0;

    iget-object v2, v1, La3/n0;->b0:La3/j0;

    sget-object v3, La3/j0;->y:La3/j0;

    if-ne v2, v3, :cond_0

    invoke-virtual {v1}, La3/n0;->d()V

    :cond_0
    iget-object v1, v0, La3/r0;->a:La3/n0;

    invoke-static {v1}, La3/g;->k(La3/n0;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, v0, La3/r0;->q:La3/c1;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v3, v1, La3/c1;->J:La3/j0;

    invoke-virtual {v1, p1, p2}, La3/c1;->T(J)Ly2/j1;

    :cond_1
    iget-object v0, v0, La3/r0;->a:La3/n0;

    invoke-virtual {v0}, La3/n0;->G()La3/n0;

    move-result-object v1

    if-eqz v1, :cond_6

    iget-object v2, p0, La3/g1;->L:La3/j0;

    if-eq v2, v3, :cond_3

    iget-boolean v0, v0, La3/n0;->d0:Z

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const-string v0, "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_3
    :goto_0
    invoke-virtual {v1}, La3/n0;->v()La3/h0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_5

    const/4 v2, 0x2

    if-ne v0, v2, :cond_4

    sget-object v0, La3/j0;->x:La3/j0;

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Measurable could be only measured from the parent\'s measure or layout block. Parents state is "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, La3/n0;->v()La3/h0;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    sget-object v0, La3/j0;->w:La3/j0;

    :goto_1
    iput-object v0, p0, La3/g1;->L:La3/j0;

    goto :goto_2

    :cond_6
    iput-object v3, p0, La3/g1;->L:La3/j0;

    :goto_2
    invoke-virtual {p0, p1, p2}, La3/g1;->P0(J)Z

    return-object p0
.end method

.method public final a()La3/a;
    .locals 1

    iget-object v0, p0, La3/g1;->Y:La3/o0;

    return-object v0
.end method

.method public final b(I)I
    .locals 2

    iget-object v0, p0, La3/g1;->F:La3/r0;

    iget-object v1, v0, La3/r0;->a:La3/n0;

    invoke-static {v1}, La3/g;->k(La3/n0;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, La3/r0;->q:La3/c1;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, La3/c1;->b(I)I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p0}, La3/g1;->I0()V

    invoke-virtual {v0}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    invoke-interface {v0, p1}, Ly2/q0;->b(I)I

    move-result p1

    return p1
.end method

.method public final b0()V
    .locals 3

    iget-object v0, p0, La3/g1;->F:La3/r0;

    iget-object v0, v0, La3/r0;->a:La3/n0;

    const/4 v1, 0x0

    const/4 v2, 0x7

    invoke-static {v0, v1, v2}, La3/n0;->v0(La3/n0;ZI)V

    return-void
.end method

.method public final c0(Ly2/a;)I
    .locals 6

    iget-object v0, p0, La3/g1;->F:La3/r0;

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
    sget-object v3, La3/h0;->w:La3/h0;

    iget-object v4, p0, La3/g1;->Y:La3/o0;

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
    sget-object v1, La3/h0;->y:La3/h0;

    if-ne v2, v1, :cond_3

    iput-boolean v5, v4, La3/a;->d:Z

    :cond_3
    :goto_1
    iput-boolean v5, p0, La3/g1;->M:Z

    invoke-virtual {v0}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    invoke-virtual {v0, p1}, La3/w0;->c0(Ly2/a;)I

    move-result p1

    const/4 v0, 0x0

    iput-boolean v0, p0, La3/g1;->M:Z

    return p1
.end method

.method public final e(La0/a1;)V
    .locals 4

    iget-object v0, p0, La3/g1;->F:La3/r0;

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

    iget-object v3, v3, La3/r0;->p:La3/g1;

    invoke-virtual {p1, v3}, La0/a1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final f()La3/b;
    .locals 1

    iget-object v0, p0, La3/g1;->F:La3/r0;

    iget-object v0, v0, La3/r0;->a:La3/n0;

    invoke-virtual {v0}, La3/n0;->G()La3/n0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, La3/n0;->t()La3/r0;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, La3/r0;->p:La3/g1;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final g0()I
    .locals 1

    iget-object v0, p0, La3/g1;->F:La3/r0;

    invoke-virtual {v0}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    invoke-virtual {v0}, Ly2/j1;->g0()I

    move-result v0

    return v0
.end method

.method public final j0()I
    .locals 1

    iget-object v0, p0, La3/g1;->F:La3/r0;

    invoke-virtual {v0}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    invoke-virtual {v0}, Ly2/j1;->j0()I

    move-result v0

    return v0
.end method

.method public final o0(JFLkotlin/jvm/functions/Function1;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, La3/g1;->O0(JFLkotlin/jvm/functions/Function1;Ll2/c;)V

    return-void
.end method

.method public final p()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, La3/g1;->S:Ljava/lang/Object;

    return-object v0
.end method

.method public final p0(JFLl2/c;)V
    .locals 6

    const/4 v4, 0x0

    move-object v0, p0

    move-wide v1, p1

    move v3, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, La3/g1;->O0(JFLkotlin/jvm/functions/Function1;Ll2/c;)V

    return-void
.end method

.method public final requestLayout()V
    .locals 2

    iget-object v0, p0, La3/g1;->F:La3/r0;

    iget-object v0, v0, La3/r0;->a:La3/n0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, La3/n0;->u0(Z)V

    return-void
.end method

.method public final s(Z)V
    .locals 2

    iget-object v0, p0, La3/g1;->F:La3/r0;

    invoke-virtual {v0}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v1

    iget-boolean v1, v1, La3/w0;->I:Z

    if-eq p1, v1, :cond_0

    invoke-virtual {v0}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    iput-boolean p1, v0, La3/w0;->I:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, La3/g1;->m0:Z

    :cond_0
    return-void
.end method

.method public final t()V
    .locals 10

    const/4 v0, 0x1

    iput-boolean v0, p0, La3/g1;->b0:Z

    iget-object v1, p0, La3/g1;->Y:La3/o0;

    invoke-virtual {v1}, La3/a;->i()V

    iget-boolean v2, p0, La3/g1;->W:Z

    iget-object v3, p0, La3/g1;->F:La3/r0;

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    iget-object v2, v3, La3/r0;->a:La3/n0;

    invoke-virtual {v2}, La3/n0;->M()Lr1/c;

    move-result-object v2

    iget-object v5, v2, Lr1/c;->w:[Ljava/lang/Object;

    iget v2, v2, Lr1/c;->y:I

    move v6, v4

    :goto_0
    if-ge v6, v2, :cond_1

    aget-object v7, v5, v6

    check-cast v7, La3/n0;

    invoke-virtual {v7}, La3/n0;->A()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-virtual {v7}, La3/n0;->B()La3/j0;

    move-result-object v8

    sget-object v9, La3/j0;->w:La3/j0;

    if-ne v8, v9, :cond_0

    invoke-static {v7}, La3/n0;->o0(La3/n0;)Z

    move-result v7

    if-eqz v7, :cond_0

    iget-object v7, v3, La3/r0;->a:La3/n0;

    const/4 v8, 0x7

    invoke-static {v7, v4, v8}, La3/n0;->v0(La3/n0;ZI)V

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    iget-boolean v2, p0, La3/g1;->X:Z

    if-nez v2, :cond_2

    iget-boolean v2, p0, La3/g1;->M:Z

    if-nez v2, :cond_4

    invoke-virtual {p0}, La3/g1;->J()Landroidx/compose/ui/node/a;

    move-result-object v2

    iget-boolean v2, v2, La3/w0;->K:Z

    if-nez v2, :cond_4

    iget-boolean v2, p0, La3/g1;->W:Z

    if-eqz v2, :cond_4

    :cond_2
    iput-boolean v4, p0, La3/g1;->W:Z

    iget-object v2, v3, La3/r0;->d:La3/h0;

    sget-object v5, La3/h0;->y:La3/h0;

    iput-object v5, v3, La3/r0;->d:La3/h0;

    invoke-virtual {v3, v4}, La3/r0;->g(Z)V

    iget-object v5, v3, La3/r0;->a:La3/n0;

    invoke-static {v5}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object v6

    invoke-interface {v6}, Landroidx/compose/ui/node/Owner;->getSnapshotObserver()La3/c2;

    move-result-object v6

    iget-object v7, p0, La3/g1;->e0:La3/f1;

    iget-object v8, v6, La3/c2;->e:La3/f;

    invoke-virtual {v6, v5, v8, v7}, La3/c2;->a(La3/b2;Lkotlin/jvm/functions/Function1;Lc93/a;)V

    iput-object v2, v3, La3/r0;->d:La3/h0;

    invoke-virtual {p0}, La3/g1;->J()Landroidx/compose/ui/node/a;

    move-result-object v2

    iget-boolean v2, v2, La3/w0;->K:Z

    if-eqz v2, :cond_3

    iget-boolean v2, v3, La3/r0;->j:Z

    if-eqz v2, :cond_3

    invoke-virtual {p0}, La3/g1;->requestLayout()V

    :cond_3
    iput-boolean v4, p0, La3/g1;->X:Z

    :cond_4
    iget-boolean v2, v1, La3/a;->d:Z

    if-eqz v2, :cond_5

    iput-boolean v0, v1, La3/a;->e:Z

    :cond_5
    iget-boolean v0, v1, La3/a;->b:Z

    if-eqz v0, :cond_6

    invoke-virtual {v1}, La3/a;->f()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {v1}, La3/a;->h()V

    :cond_6
    iput-boolean v4, p0, La3/g1;->b0:Z

    return-void
.end method

.method public final v()Z
    .locals 1

    iget-boolean v0, p0, La3/g1;->T:Z

    return v0
.end method
