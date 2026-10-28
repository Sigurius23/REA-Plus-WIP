.class public final La3/d;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/c0;
.implements La3/r;
.implements La3/j2;
.implements La3/f2;
.implements Lz2/e;
.implements Lz2/g;
.implements La3/d2;
.implements La3/a0;
.implements La3/s;
.implements Lg2/e;
.implements Lg2/q;
.implements Lg2/t;
.implements La3/b2;
.implements Lf2/b;


# instance fields
.field public O:Lb2/u;

.field public P:Lz2/a;

.field public Q:Ljava/util/HashSet;


# virtual methods
.method public final C0()Z
    .locals 2

    iget-object v0, p0, La3/d;->O:Lb2/u;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lu2/u;

    check-cast v0, Lu2/y;

    invoke-virtual {v0}, Lu2/y;->j()Lq/f;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    return v0
.end method

.method public final E(La3/w0;Ly2/q0;I)I
    .locals 2

    iget-object v0, p0, La3/d;->O:Lb2/u;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ly2/c0;

    invoke-static {v0, p1, p2, p3}, Ls4/b;->t(Ly2/c0;La3/w0;Ly2/q0;I)I

    move-result p1

    return p1
.end method

.method public final I0(Landroidx/compose/ui/node/NodeCoordinator;)V
    .locals 4

    iget-object p1, p0, La3/d;->O:Lb2/u;

    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp0/d;

    iget-object v0, p1, Lp0/d;->x:Ljava/util/ArrayList;

    iget-boolean v1, p1, Lp0/d;->w:Z

    if-nez v1, :cond_1

    const/4 v1, 0x1

    iput-boolean v1, p1, Lp0/d;->w:Z

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq83/d;

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    invoke-interface {v2, v3}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    :cond_1
    return-void
.end method

.method public final N(Ly2/y;)V
    .locals 0

    return-void
.end method

.method public final O(La3/p0;)V
    .locals 2

    iget-object v0, p0, La3/d;->O:Lb2/u;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lf2/f;

    check-cast v0, Lf0/t0;

    invoke-virtual {v0, p1}, Lf0/t0;->j(La3/p0;)V

    return-void
.end method

.method public final P0()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, La3/d;->X0(Z)V

    return-void
.end method

.method public final Q0()V
    .locals 0

    invoke-virtual {p0}, La3/d;->Y0()V

    return-void
.end method

.method public final U()Z
    .locals 1

    iget-boolean v0, p0, Lb2/v;->N:Z

    return v0
.end method

.method public final X0(Z)V
    .locals 4

    iget-boolean v0, p0, Lb2/v;->N:Z

    if-nez v0, :cond_0

    const-string v0, "initializeModifier called on unattached node"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, La3/d;->O:Lb2/u;

    iget v1, p0, Lb2/v;->y:I

    and-int/lit8 v1, v1, 0x20

    if-eqz v1, :cond_4

    instance-of v1, v0, Lz2/c;

    if-eqz v1, :cond_2

    new-instance v1, La3/c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, La3/c;-><init>(La3/d;I)V

    invoke-static {p0}, La3/g;->q(La3/n;)Landroidx/compose/ui/node/Owner;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/platform/AndroidComposeView;

    iget-object v2, v2, Landroidx/compose/ui/platform/AndroidComposeView;->V0:La0/q0;

    invoke-virtual {v2, v1}, La0/q0;->f(Ljava/lang/Object;)I

    move-result v3

    if-ltz v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v2, v1}, La0/q0;->a(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    instance-of v1, v0, Lz2/f;

    if-eqz v1, :cond_4

    move-object v1, v0

    check-cast v1, Lz2/f;

    iget-object v2, p0, La3/d;->P:Lz2/a;

    if-eqz v2, :cond_3

    invoke-interface {v1}, Lz2/f;->getKey()Lz2/h;

    move-result-object v3

    invoke-virtual {v2, v3}, Lz2/a;->c(Lz2/h;)Z

    move-result v3

    if-eqz v3, :cond_3

    iput-object v1, v2, Lz2/a;->a:Lz2/f;

    invoke-static {p0}, La3/g;->q(La3/n;)Landroidx/compose/ui/node/Owner;

    move-result-object v2

    invoke-interface {v2}, Landroidx/compose/ui/node/Owner;->getModifierLocalManager()Lz2/d;

    move-result-object v2

    invoke-interface {v1}, Lz2/f;->getKey()Lz2/h;

    move-result-object v1

    iget-object v3, v2, Lz2/d;->b:Lr1/c;

    invoke-virtual {v3, p0}, Lr1/c;->b(Ljava/lang/Object;)V

    iget-object v3, v2, Lz2/d;->c:Lr1/c;

    invoke-virtual {v3, v1}, Lr1/c;->b(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lz2/d;->a()V

    goto :goto_1

    :cond_3
    new-instance v2, Lz2/a;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v1, v2, Lz2/a;->a:Lz2/f;

    iput-object v2, p0, La3/d;->P:Lz2/a;

    invoke-static {p0}, La3/g;->b(La3/d;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-static {p0}, La3/g;->q(La3/n;)Landroidx/compose/ui/node/Owner;

    move-result-object v2

    invoke-interface {v2}, Landroidx/compose/ui/node/Owner;->getModifierLocalManager()Lz2/d;

    move-result-object v2

    invoke-interface {v1}, Lz2/f;->getKey()Lz2/h;

    move-result-object v1

    iget-object v3, v2, Lz2/d;->b:Lr1/c;

    invoke-virtual {v3, p0}, Lr1/c;->b(Ljava/lang/Object;)V

    iget-object v3, v2, Lz2/d;->c:Lr1/c;

    invoke-virtual {v3, v1}, Lr1/c;->b(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lz2/d;->a()V

    :cond_4
    :goto_1
    iget v1, p0, Lb2/v;->y:I

    and-int/lit8 v1, v1, 0x4

    const/4 v2, 0x2

    if-eqz v1, :cond_5

    if-nez p1, :cond_5

    invoke-static {p0, v2}, La3/g;->n(La3/n;I)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/node/NodeCoordinator;->n1()V

    :cond_5
    iget v1, p0, Lb2/v;->y:I

    and-int/2addr v1, v2

    if-eqz v1, :cond_7

    invoke-static {p0}, La3/g;->b(La3/d;)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Lb2/v;->H:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-object v3, v1

    check-cast v3, Landroidx/compose/ui/node/b;

    invoke-virtual {v3, p0}, Landroidx/compose/ui/node/b;->J1(La3/c0;)V

    iget-object v1, v1, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    if-eqz v1, :cond_6

    check-cast v1, Lb3/f2;

    invoke-virtual {v1}, Lb3/f2;->invalidate()V

    :cond_6
    if-nez p1, :cond_7

    invoke-static {p0, v2}, La3/g;->n(La3/n;I)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/compose/ui/node/NodeCoordinator;->n1()V

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object p1

    invoke-virtual {p1}, La3/n0;->R()V

    :cond_7
    instance-of p1, v0, Ly2/m1;

    if-eqz p1, :cond_8

    move-object p1, v0

    check-cast p1, Ly2/m1;

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v1

    invoke-interface {p1, v1}, Ly2/m1;->f(La3/n0;)V

    :cond_8
    iget p1, p0, Lb2/v;->y:I

    and-int/lit16 p1, p1, 0x100

    if-eqz p1, :cond_9

    instance-of p1, v0, Lp0/d;

    if-eqz p1, :cond_9

    invoke-static {p0}, La3/g;->b(La3/d;)Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object p1

    invoke-virtual {p1}, La3/n0;->R()V

    :cond_9
    iget p1, p0, Lb2/v;->y:I

    and-int/lit8 p1, p1, 0x10

    if-eqz p1, :cond_a

    instance-of p1, v0, Lu2/u;

    if-eqz p1, :cond_a

    check-cast v0, Lu2/u;

    check-cast v0, Lu2/y;

    invoke-virtual {v0}, Lu2/y;->j()Lq/f;

    move-result-object p1

    iget-object v0, p0, Lb2/v;->H:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {p1, v0}, Lq/f;->N0(Ly2/y;)V

    :cond_a
    iget p1, p0, Lb2/v;->y:I

    and-int/lit8 p1, p1, 0x8

    if-eqz p1, :cond_b

    invoke-static {p0}, La3/g;->q(La3/n;)Landroidx/compose/ui/node/Owner;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->E()V

    :cond_b
    return-void
.end method

.method public final Y(Ly3/c;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, La3/d;->O:Lb2/u;

    const-string p2, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ly2/g1;

    invoke-interface {p1}, Ly2/g1;->g()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final Y0()V
    .locals 5

    iget-boolean v0, p0, Lb2/v;->N:Z

    if-nez v0, :cond_0

    const-string v0, "unInitializeModifier called on unattached node"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, La3/d;->O:Lb2/u;

    iget v1, p0, Lb2/v;->y:I

    and-int/lit8 v1, v1, 0x20

    if-eqz v1, :cond_2

    instance-of v1, v0, Lz2/f;

    if-eqz v1, :cond_1

    invoke-static {p0}, La3/g;->q(La3/n;)Landroidx/compose/ui/node/Owner;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/ui/node/Owner;->getModifierLocalManager()Lz2/d;

    move-result-object v1

    move-object v2, v0

    check-cast v2, Lz2/f;

    invoke-interface {v2}, Lz2/f;->getKey()Lz2/h;

    move-result-object v2

    iget-object v3, v1, Lz2/d;->d:Lr1/c;

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v4

    invoke-virtual {v3, v4}, Lr1/c;->b(Ljava/lang/Object;)V

    iget-object v3, v1, Lz2/d;->e:Lr1/c;

    invoke-virtual {v3, v2}, Lr1/c;->b(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lz2/d;->a()V

    :cond_1
    instance-of v1, v0, Lz2/c;

    if-eqz v1, :cond_2

    check-cast v0, Lz2/c;

    sget-object v1, La3/g;->a:La3/e;

    invoke-interface {v0, v1}, Lz2/c;->h(Lz2/g;)V

    :cond_2
    iget v0, p0, Lb2/v;->y:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_3

    invoke-static {p0}, La3/g;->q(La3/n;)Landroidx/compose/ui/node/Owner;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->E()V

    :cond_3
    return-void
.end method

.method public final Z0()V
    .locals 4

    iget-boolean v0, p0, Lb2/v;->N:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, La3/d;->Q:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    invoke-static {p0}, La3/g;->q(La3/n;)Landroidx/compose/ui/node/Owner;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getSnapshotObserver()La3/c2;

    move-result-object v0

    sget-object v1, La3/f;->x:La3/f;

    new-instance v2, La3/c;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, La3/c;-><init>(La3/d;I)V

    invoke-virtual {v0, p0, v1, v2}, La3/c2;->a(La3/b2;Lkotlin/jvm/functions/Function1;Lc93/a;)V

    :cond_0
    return-void
.end method

.method public final a(Lz2/h;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, La3/d;->Q:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lb2/v;->w:Lb2/v;

    iget-boolean v0, v0, Lb2/v;->N:Z

    if-nez v0, :cond_0

    const-string v0, "visitAncestors called on an unattached node"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lb2/v;->w:Lb2/v;

    iget-object v0, v0, Lb2/v;->E:Lb2/v;

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_b

    iget-object v2, v1, La3/n0;->e0:La3/l1;

    iget-object v2, v2, La3/l1;->g:Ljava/lang/Object;

    check-cast v2, Lb2/v;

    iget v2, v2, Lb2/v;->z:I

    and-int/lit8 v2, v2, 0x20

    const/4 v3, 0x0

    if-eqz v2, :cond_9

    :goto_1
    if-eqz v0, :cond_9

    iget v2, v0, Lb2/v;->y:I

    and-int/lit8 v2, v2, 0x20

    if-eqz v2, :cond_8

    move-object v2, v0

    move-object v4, v3

    :goto_2
    if-eqz v2, :cond_8

    instance-of v5, v2, Lz2/e;

    if-eqz v5, :cond_1

    check-cast v2, Lz2/e;

    invoke-interface {v2}, Lz2/e;->v()Lv63/c;

    move-result-object v5

    invoke-virtual {v5, p1}, Lv63/c;->c(Lz2/h;)Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v2}, Lz2/e;->v()Lv63/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lv63/c;->e(Lz2/h;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    iget v5, v2, Lb2/v;->y:I

    and-int/lit8 v5, v5, 0x20

    if-eqz v5, :cond_7

    instance-of v5, v2, La3/o;

    if-eqz v5, :cond_7

    move-object v5, v2

    check-cast v5, La3/o;

    iget-object v5, v5, La3/o;->P:Lb2/v;

    const/4 v6, 0x0

    :goto_3
    const/4 v7, 0x1

    if-eqz v5, :cond_6

    iget v8, v5, Lb2/v;->y:I

    and-int/lit8 v8, v8, 0x20

    if-eqz v8, :cond_5

    add-int/lit8 v6, v6, 0x1

    if-ne v6, v7, :cond_2

    move-object v2, v5

    goto :goto_4

    :cond_2
    if-nez v4, :cond_3

    new-instance v4, Lr1/c;

    const/16 v7, 0x10

    new-array v7, v7, [Lb2/v;

    invoke-direct {v4, v7}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_3
    if-eqz v2, :cond_4

    invoke-virtual {v4, v2}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v2, v3

    :cond_4
    invoke-virtual {v4, v5}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_5
    :goto_4
    iget-object v5, v5, Lb2/v;->F:Lb2/v;

    goto :goto_3

    :cond_6
    if-ne v6, v7, :cond_7

    goto :goto_2

    :cond_7
    invoke-static {v4}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v2

    goto :goto_2

    :cond_8
    iget-object v0, v0, Lb2/v;->E:Lb2/v;

    goto :goto_1

    :cond_9
    invoke-virtual {v1}, La3/n0;->G()La3/n0;

    move-result-object v1

    if-eqz v1, :cond_a

    iget-object v0, v1, La3/n0;->e0:La3/l1;

    if-eqz v0, :cond_a

    iget-object v0, v0, La3/l1;->f:Ljava/lang/Object;

    check-cast v0, La3/l2;

    goto/16 :goto_0

    :cond_a
    move-object v0, v3

    goto/16 :goto_0

    :cond_b
    iget-object p1, p1, Lz2/h;->a:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ly2/t0;Ly2/q0;J)Ly2/s0;
    .locals 2

    iget-object v0, p0, La3/d;->O:Lb2/u;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ly2/c0;

    invoke-interface {v0, p1, p2, p3, p4}, Ly2/c0;->b(Ly2/t0;Ly2/q0;J)Ly2/s0;

    move-result-object p1

    return-object p1
.end method

.method public final b0()V
    .locals 2

    iget-object v0, p0, La3/d;->O:Lb2/u;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lu2/u;

    check-cast v0, Lu2/y;

    invoke-virtual {v0}, Lu2/y;->j()Lq/f;

    move-result-object v0

    invoke-virtual {v0}, Lq/f;->A0()V

    return-void
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, La3/d;->O:Lb2/u;

    instance-of v0, v0, Lu2/u;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, La3/d;->b0()V

    :cond_0
    return-void
.end method

.method public final c0()V
    .locals 0

    invoke-static {p0}, La3/g;->h(La3/r;)V

    return-void
.end method

.method public final d()J
    .locals 2

    const/16 v0, 0x80

    invoke-static {p0, v0}, La3/g;->n(La3/n;I)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    iget-wide v0, v0, Ly2/j1;->y:J

    invoke-static {v0, v1}, Lv63/b;->l(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final g(J)V
    .locals 0

    return-void
.end method

.method public final g0(La3/w0;Ly2/q0;I)I
    .locals 2

    iget-object v0, p0, La3/d;->O:Lb2/u;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ly2/c0;

    invoke-static {v0, p1, p2, p3}, Ls4/b;->w(Ly2/c0;La3/w0;Ly2/q0;I)I

    move-result p1

    return p1
.end method

.method public final getDensity()Ly3/c;
    .locals 1

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v0

    iget-object v0, v0, La3/n0;->X:Ly3/c;

    return-object v0
.end method

.method public final getLayoutDirection()Ly3/m;
    .locals 1

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v0

    iget-object v0, v0, La3/n0;->Y:Ly3/m;

    return-object v0
.end method

.method public final j0(Lg2/m;)V
    .locals 1

    iget-object p1, p0, La3/d;->O:Lb2/u;

    const-string v0, "applyFocusProperties called on wrong node"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    invoke-static {p1}, Lr;->t(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final k(Lg2/w;)V
    .locals 1

    iget-object p1, p0, La3/d;->O:Lb2/u;

    const-string v0, "onFocusEvent called on wrong node"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    invoke-static {p1}, Lr;->t(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final n(Li3/z;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, La3/d;->O:Lb2/u;

    const-string v3, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Li3/m;

    invoke-interface {v2}, Li3/m;->i()Li3/l;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Li3/l;

    iget-object v3, v1, Li3/l;->w:La0/v0;

    iget-boolean v4, v2, Li3/l;->y:Z

    const/4 v5, 0x1

    if-eqz v4, :cond_0

    iput-boolean v5, v1, Li3/l;->y:Z

    :cond_0
    iget-boolean v4, v2, Li3/l;->z:Z

    if-eqz v4, :cond_1

    iput-boolean v5, v1, Li3/l;->z:Z

    :cond_1
    iget-object v1, v2, Li3/l;->w:La0/v0;

    iget-object v2, v1, La0/v0;->b:[Ljava/lang/Object;

    iget-object v4, v1, La0/v0;->c:[Ljava/lang/Object;

    iget-object v1, v1, La0/v0;->a:[J

    array-length v5, v1

    add-int/lit8 v5, v5, -0x2

    if-ltz v5, :cond_8

    const/4 v7, 0x0

    :goto_0
    aget-wide v8, v1, v7

    not-long v10, v8

    const/4 v12, 0x7

    shl-long/2addr v10, v12

    and-long/2addr v10, v8

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v10, v12

    cmp-long v10, v10, v12

    if-eqz v10, :cond_7

    sub-int v10, v7, v5

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v10, v10, 0x8

    const/4 v12, 0x0

    :goto_1
    if-ge v12, v10, :cond_6

    const-wide/16 v13, 0xff

    and-long/2addr v13, v8

    const-wide/16 v15, 0x80

    cmp-long v13, v13, v15

    if-gez v13, :cond_5

    shl-int/lit8 v13, v7, 0x3

    add-int/2addr v13, v12

    aget-object v14, v2, v13

    aget-object v13, v4, v13

    check-cast v14, Li3/y;

    invoke-virtual {v3, v14}, La0/v0;->b(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_2

    invoke-virtual {v3, v14, v13}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    instance-of v15, v13, Li3/a;

    if-eqz v15, :cond_5

    invoke-virtual {v3, v14}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    const-string v6, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>"

    invoke-static {v15, v6}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v15, Li3/a;

    new-instance v6, Li3/a;

    move/from16 v16, v11

    iget-object v11, v15, Li3/a;->a:Ljava/lang/String;

    if-nez v11, :cond_3

    move-object v11, v13

    check-cast v11, Li3/a;

    iget-object v11, v11, Li3/a;->a:Ljava/lang/String;

    :cond_3
    iget-object v15, v15, Li3/a;->b:Ll83/e;

    if-nez v15, :cond_4

    check-cast v13, Li3/a;

    iget-object v15, v13, Li3/a;->b:Ll83/e;

    :cond_4
    invoke-direct {v6, v11, v15}, Li3/a;-><init>(Ljava/lang/String;Ll83/e;)V

    invoke-virtual {v3, v14, v6}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :cond_5
    :goto_2
    move/from16 v16, v11

    :goto_3
    shr-long v8, v8, v16

    add-int/lit8 v12, v12, 0x1

    move/from16 v11, v16

    goto :goto_1

    :cond_6
    move v6, v11

    if-ne v10, v6, :cond_8

    :cond_7
    if-eq v7, v5, :cond_8

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_8
    return-void
.end method

.method public final o(La3/w0;Ly2/q0;I)I
    .locals 2

    iget-object v0, p0, La3/d;->O:Lb2/u;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ly2/c0;

    invoke-static {v0, p1, p2, p3}, Ls4/b;->u(Ly2/c0;La3/w0;Ly2/q0;I)I

    move-result p1

    return p1
.end method

.method public final r()V
    .locals 2

    iget-object v0, p0, La3/d;->O:Lb2/u;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lu2/u;

    check-cast v0, Lu2/y;

    invoke-virtual {v0}, Lu2/y;->j()Lq/f;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final r0(Lu2/k;Lu2/l;J)V
    .locals 0

    iget-object p3, p0, La3/d;->O:Lb2/u;

    const-string p4, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lu2/u;

    check-cast p3, Lu2/y;

    invoke-virtual {p3}, Lu2/y;->j()Lq/f;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Lq/f;->B0(Lu2/k;Lu2/l;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La3/d;->O:Lb2/u;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final v()Lv63/c;
    .locals 1

    iget-object v0, p0, La3/d;->P:Lz2/a;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lz2/b;->a:Lz2/b;

    return-object v0
.end method

.method public final y(La3/w0;Ly2/q0;I)I
    .locals 2

    iget-object v0, p0, La3/d;->O:Lb2/u;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ly2/c0;

    invoke-static {v0, p1, p2, p3}, Ls4/b;->v(Ly2/c0;La3/w0;Ly2/q0;I)I

    move-result p1

    return p1
.end method
