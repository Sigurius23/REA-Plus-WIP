.class public final La3/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La3/n0;

.field public b:Z

.field public c:Z

.field public d:La3/h0;

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:I

.field public i:I

.field public j:Z

.field public k:Z

.field public l:I

.field public m:Z

.field public n:Z

.field public o:I

.field public final p:La3/g1;

.field public q:La3/c1;


# direct methods
.method public constructor <init>(La3/n0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La3/r0;->a:La3/n0;

    sget-object p1, La3/h0;->E:La3/h0;

    iput-object p1, p0, La3/r0;->d:La3/h0;

    new-instance p1, La3/g1;

    invoke-direct {p1, p0}, La3/g1;-><init>(La3/r0;)V

    iput-object p1, p0, La3/r0;->p:La3/g1;

    return-void
.end method


# virtual methods
.method public final a()Landroidx/compose/ui/node/NodeCoordinator;
    .locals 1

    iget-object v0, p0, La3/r0;->a:La3/n0;

    iget-object v0, v0, La3/n0;->e0:La3/l1;

    iget-object v0, v0, La3/l1;->e:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/node/NodeCoordinator;

    return-object v0
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, La3/r0;->a:La3/n0;

    invoke-virtual {v0}, La3/n0;->v()La3/h0;

    move-result-object v0

    sget-object v1, La3/h0;->y:La3/h0;

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    sget-object v1, La3/h0;->z:La3/h0;

    if-ne v0, v1, :cond_2

    :cond_0
    iget-object v1, p0, La3/r0;->p:La3/g1;

    iget-boolean v1, v1, La3/g1;->b0:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0, v2}, La3/r0;->g(Z)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v2}, La3/r0;->f(Z)V

    :cond_2
    :goto_0
    sget-object v1, La3/h0;->z:La3/h0;

    if-ne v0, v1, :cond_4

    iget-object v0, p0, La3/r0;->q:La3/c1;

    if-eqz v0, :cond_3

    iget-boolean v0, v0, La3/c1;->V:Z

    if-ne v0, v2, :cond_3

    invoke-virtual {p0, v2}, La3/r0;->i(Z)V

    return-void

    :cond_3
    invoke-virtual {p0, v2}, La3/r0;->h(Z)V

    :cond_4
    return-void
.end method

.method public final c(J)V
    .locals 6

    iget-object v0, p0, La3/r0;->q:La3/c1;

    if-eqz v0, :cond_2

    sget-object v1, La3/h0;->x:La3/h0;

    iget-object v2, v0, La3/c1;->F:La3/r0;

    iput-object v1, v2, La3/r0;->d:La3/h0;

    iget-object v1, v2, La3/r0;->p:La3/g1;

    iget-object v3, v2, La3/r0;->a:La3/n0;

    const/4 v4, 0x0

    iput-boolean v4, v2, La3/r0;->e:Z

    invoke-static {v3}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object v4

    invoke-interface {v4}, Landroidx/compose/ui/node/Owner;->getSnapshotObserver()La3/c2;

    move-result-object v4

    new-instance v5, La3/a1;

    invoke-direct {v5, v0, p1, p2}, La3/a1;-><init>(La3/c1;J)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, v3, La3/n0;->G:La3/n0;

    if-eqz p1, :cond_0

    iget-object p1, v4, La3/c2;->b:La3/f;

    invoke-virtual {v4, v3, p1, v5}, La3/c2;->a(La3/b2;Lkotlin/jvm/functions/Function1;Lc93/a;)V

    goto :goto_0

    :cond_0
    iget-object p1, v4, La3/c2;->c:La3/f;

    invoke-virtual {v4, v3, p1, v5}, La3/c2;->a(La3/b2;Lkotlin/jvm/functions/Function1;Lc93/a;)V

    :goto_0
    const/4 p1, 0x1

    iput-boolean p1, v2, La3/r0;->f:Z

    iput-boolean p1, v2, La3/r0;->g:Z

    invoke-static {v3}, La3/g;->k(La3/n0;)Z

    move-result p2

    if-eqz p2, :cond_1

    iput-boolean p1, v1, La3/g1;->W:Z

    iput-boolean p1, v1, La3/g1;->X:Z

    goto :goto_1

    :cond_1
    iput-boolean p1, v1, La3/g1;->V:Z

    :goto_1
    sget-object p1, La3/h0;->E:La3/h0;

    iput-object p1, v2, La3/r0;->d:La3/h0;

    :cond_2
    return-void
.end method

.method public final d(I)V
    .locals 3

    iget v0, p0, La3/r0;->l:I

    iput p1, p0, La3/r0;->l:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez p1, :cond_1

    move v1, v2

    :cond_1
    if-eq v0, v1, :cond_4

    iget-object v0, p0, La3/r0;->a:La3/n0;

    invoke-virtual {v0}, La3/n0;->G()La3/n0;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, La3/n0;->t()La3/r0;

    move-result-object v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_4

    if-nez p1, :cond_3

    iget p1, v0, La3/r0;->l:I

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v0, p1}, La3/r0;->d(I)V

    return-void

    :cond_3
    iget p1, v0, La3/r0;->l:I

    add-int/2addr p1, v2

    invoke-virtual {v0, p1}, La3/r0;->d(I)V

    :cond_4
    return-void
.end method

.method public final e(I)V
    .locals 3

    iget v0, p0, La3/r0;->o:I

    iput p1, p0, La3/r0;->o:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez p1, :cond_1

    move v1, v2

    :cond_1
    if-eq v0, v1, :cond_4

    iget-object v0, p0, La3/r0;->a:La3/n0;

    invoke-virtual {v0}, La3/n0;->G()La3/n0;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, La3/n0;->t()La3/r0;

    move-result-object v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_4

    if-nez p1, :cond_3

    iget p1, v0, La3/r0;->o:I

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v0, p1}, La3/r0;->e(I)V

    return-void

    :cond_3
    iget p1, v0, La3/r0;->o:I

    add-int/2addr p1, v2

    invoke-virtual {v0, p1}, La3/r0;->e(I)V

    :cond_4
    return-void
.end method

.method public final f(Z)V
    .locals 1

    iget-boolean v0, p0, La3/r0;->k:Z

    if-eq v0, p1, :cond_1

    iput-boolean p1, p0, La3/r0;->k:Z

    if-eqz p1, :cond_0

    iget-boolean v0, p0, La3/r0;->j:Z

    if-nez v0, :cond_0

    iget p1, p0, La3/r0;->l:I

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, La3/r0;->d(I)V

    return-void

    :cond_0
    if-nez p1, :cond_1

    iget-boolean p1, p0, La3/r0;->j:Z

    if-nez p1, :cond_1

    iget p1, p0, La3/r0;->l:I

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p0, p1}, La3/r0;->d(I)V

    :cond_1
    return-void
.end method

.method public final g(Z)V
    .locals 1

    iget-boolean v0, p0, La3/r0;->j:Z

    if-eq v0, p1, :cond_1

    iput-boolean p1, p0, La3/r0;->j:Z

    if-eqz p1, :cond_0

    iget-boolean v0, p0, La3/r0;->k:Z

    if-nez v0, :cond_0

    iget p1, p0, La3/r0;->l:I

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, La3/r0;->d(I)V

    return-void

    :cond_0
    if-nez p1, :cond_1

    iget-boolean p1, p0, La3/r0;->k:Z

    if-nez p1, :cond_1

    iget p1, p0, La3/r0;->l:I

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p0, p1}, La3/r0;->d(I)V

    :cond_1
    return-void
.end method

.method public final h(Z)V
    .locals 1

    iget-boolean v0, p0, La3/r0;->n:Z

    if-eq v0, p1, :cond_1

    iput-boolean p1, p0, La3/r0;->n:Z

    if-eqz p1, :cond_0

    iget-boolean v0, p0, La3/r0;->m:Z

    if-nez v0, :cond_0

    iget p1, p0, La3/r0;->o:I

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, La3/r0;->e(I)V

    return-void

    :cond_0
    if-nez p1, :cond_1

    iget-boolean p1, p0, La3/r0;->m:Z

    if-nez p1, :cond_1

    iget p1, p0, La3/r0;->o:I

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p0, p1}, La3/r0;->e(I)V

    :cond_1
    return-void
.end method

.method public final i(Z)V
    .locals 1

    iget-boolean v0, p0, La3/r0;->m:Z

    if-eq v0, p1, :cond_1

    iput-boolean p1, p0, La3/r0;->m:Z

    if-eqz p1, :cond_0

    iget-boolean v0, p0, La3/r0;->n:Z

    if-nez v0, :cond_0

    iget p1, p0, La3/r0;->o:I

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, La3/r0;->e(I)V

    return-void

    :cond_0
    if-nez p1, :cond_1

    iget-boolean p1, p0, La3/r0;->n:Z

    if-nez p1, :cond_1

    iget p1, p0, La3/r0;->o:I

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p0, p1}, La3/r0;->e(I)V

    :cond_1
    return-void
.end method

.method public final j()V
    .locals 6

    iget-object v0, p0, La3/r0;->p:La3/g1;

    iget-object v1, v0, La3/g1;->F:La3/r0;

    iget-object v2, v0, La3/g1;->S:Ljava/lang/Object;

    const/4 v3, 0x7

    iget-object v4, p0, La3/r0;->a:La3/n0;

    const/4 v5, 0x0

    if-nez v2, :cond_0

    invoke-virtual {v1}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/ui/node/NodeCoordinator;->p()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v2, v0, La3/g1;->R:Z

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iput-boolean v5, v0, La3/g1;->R:Z

    invoke-virtual {v1}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/node/NodeCoordinator;->p()Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v0, La3/g1;->S:Ljava/lang/Object;

    invoke-virtual {v4}, La3/n0;->G()La3/n0;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0, v5, v3}, La3/n0;->v0(La3/n0;ZI)V

    :cond_2
    :goto_0
    iget-object v0, p0, La3/r0;->q:La3/c1;

    if-eqz v0, :cond_6

    iget-object v1, v0, La3/c1;->F:La3/r0;

    iget-object v2, v0, La3/c1;->X:Ljava/lang/Object;

    if-nez v2, :cond_3

    invoke-virtual {v1}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/ui/node/NodeCoordinator;->e1()La3/x0;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v2, v2, La3/x0;->O:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {v2}, Landroidx/compose/ui/node/NodeCoordinator;->p()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    iget-boolean v2, v0, La3/c1;->W:Z

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    iput-boolean v5, v0, La3/c1;->W:Z

    invoke-virtual {v1}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/node/NodeCoordinator;->e1()La3/x0;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v1, v1, La3/x0;->O:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {v1}, Landroidx/compose/ui/node/NodeCoordinator;->p()Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v0, La3/c1;->X:Ljava/lang/Object;

    invoke-static {v4}, La3/g;->k(La3/n0;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v4}, La3/n0;->G()La3/n0;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {v0, v5, v3}, La3/n0;->v0(La3/n0;ZI)V

    return-void

    :cond_5
    invoke-virtual {v4}, La3/n0;->G()La3/n0;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {v0, v5, v3}, La3/n0;->t0(La3/n0;ZI)V

    :cond_6
    :goto_1
    return-void
.end method
