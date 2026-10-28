.class public abstract La3/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La3/e;

.field public static final b:La3/y1;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, La3/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La3/e;-><init>(I)V

    sput-object v0, La3/g;->a:La3/e;

    new-instance v0, La3/y1;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, La3/y1;-><init>(I)V

    sput-object v0, La3/g;->b:La3/y1;

    return-void
.end method

.method public static final a(Lr1/c;Lb2/v;)V
    .locals 2

    invoke-static {p1}, La3/g;->p(La3/n;)La3/n0;

    move-result-object p1

    invoke-virtual {p1}, La3/n0;->M()Lr1/c;

    move-result-object p1

    iget v0, p1, Lr1/c;->y:I

    add-int/lit8 v0, v0, -0x1

    iget-object p1, p1, Lr1/c;->w:[Ljava/lang/Object;

    array-length v1, p1

    if-ge v0, v1, :cond_0

    :goto_0
    if-ltz v0, :cond_0

    aget-object v1, p1, v0

    check-cast v1, La3/n0;

    iget-object v1, v1, La3/n0;->e0:La3/l1;

    iget-object v1, v1, La3/l1;->g:Ljava/lang/Object;

    check-cast v1, Lb2/v;

    invoke-virtual {p0, v1}, Lr1/c;->b(Ljava/lang/Object;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final b(La3/d;)Z
    .locals 1

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object p0

    iget-object p0, p0, La3/n0;->e0:La3/l1;

    iget-object p0, p0, La3/l1;->f:Ljava/lang/Object;

    check-cast p0, La3/l2;

    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p0, p0, La3/l2;->O:Z

    return p0
.end method

.method public static final c(La3/n;I)Lb2/v;
    .locals 2

    check-cast p0, Lb2/v;

    iget-object p0, p0, Lb2/v;->w:Lb2/v;

    iget-object p0, p0, Lb2/v;->F:Lb2/v;

    if-nez p0, :cond_0

    goto :goto_1

    :cond_0
    iget v0, p0, Lb2/v;->z:I

    and-int/2addr v0, p1

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    if-eqz p0, :cond_4

    iget v0, p0, Lb2/v;->y:I

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    and-int/2addr v0, p1

    if-eqz v0, :cond_3

    return-object p0

    :cond_3
    iget-object p0, p0, Lb2/v;->F:Lb2/v;

    goto :goto_0

    :cond_4
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final d(Lr1/c;)Lb2/v;
    .locals 1

    if-eqz p0, :cond_1

    iget v0, p0, Lr1/c;->y:I

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Lr1/c;->l(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lb2/v;

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final e(Lb2/v;)La3/c0;
    .locals 2

    iget v0, p0, Lb2/v;->y:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    instance-of v0, p0, La3/c0;

    if-eqz v0, :cond_0

    check-cast p0, La3/c0;

    return-object p0

    :cond_0
    instance-of v0, p0, La3/o;

    if-eqz v0, :cond_3

    check-cast p0, La3/o;

    iget-object p0, p0, La3/o;->P:Lb2/v;

    :goto_0
    if-eqz p0, :cond_3

    instance-of v0, p0, La3/c0;

    if-eqz v0, :cond_1

    check-cast p0, La3/c0;

    return-object p0

    :cond_1
    instance-of v0, p0, La3/o;

    if-eqz v0, :cond_2

    iget v0, p0, Lb2/v;->y:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_2

    check-cast p0, La3/o;

    iget-object p0, p0, La3/o;->P:Lb2/v;

    goto :goto_0

    :cond_2
    iget-object p0, p0, Lb2/v;->F:Lb2/v;

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method public static final f(La3/m;Lp1/t1;)Ljava/lang/Object;
    .locals 1

    move-object v0, p0

    check-cast v0, Lb2/v;

    iget-object v0, v0, Lb2/v;->w:Lb2/v;

    iget-boolean v0, v0, Lb2/v;->N:Z

    if-nez v0, :cond_0

    const-string v0, "Cannot read CompositionLocal because the Modifier node is not currently attached."

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object p0

    iget-object p0, p0, La3/n0;->a0:Lp1/z;

    check-cast p0, Lx1/g;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, p1}, Lp1/x;->D(Lp1/p1;Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final g(La3/p2;)La3/p2;
    .locals 10

    move-object v0, p0

    check-cast v0, Lb2/v;

    iget-object v1, v0, Lb2/v;->w:Lb2/v;

    iget-boolean v1, v1, Lb2/v;->N:Z

    if-nez v1, :cond_0

    const-string v1, "visitAncestors called on an unattached node"

    invoke-static {v1}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, v0, Lb2/v;->w:Lb2/v;

    iget-object v0, v0, Lb2/v;->E:Lb2/v;

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v1

    :goto_0
    const/4 v2, 0x0

    if-eqz v1, :cond_b

    iget-object v3, v1, La3/n0;->e0:La3/l1;

    iget-object v3, v3, La3/l1;->g:Ljava/lang/Object;

    check-cast v3, Lb2/v;

    iget v3, v3, Lb2/v;->z:I

    const/high16 v4, 0x40000

    and-int/2addr v3, v4

    if-eqz v3, :cond_9

    :goto_1
    if-eqz v0, :cond_9

    iget v3, v0, Lb2/v;->y:I

    and-int/2addr v3, v4

    if-eqz v3, :cond_8

    move-object v3, v0

    move-object v5, v2

    :goto_2
    if-eqz v3, :cond_8

    instance-of v6, v3, La3/p2;

    if-eqz v6, :cond_1

    check-cast v3, La3/p2;

    invoke-interface {p0}, La3/p2;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v3}, La3/p2;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    if-ne v6, v7, :cond_7

    return-object v3

    :cond_1
    iget v6, v3, Lb2/v;->y:I

    and-int/2addr v6, v4

    if-eqz v6, :cond_7

    instance-of v6, v3, La3/o;

    if-eqz v6, :cond_7

    move-object v6, v3

    check-cast v6, La3/o;

    iget-object v6, v6, La3/o;->P:Lb2/v;

    const/4 v7, 0x0

    :goto_3
    const/4 v8, 0x1

    if-eqz v6, :cond_6

    iget v9, v6, Lb2/v;->y:I

    and-int/2addr v9, v4

    if-eqz v9, :cond_5

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v8, :cond_2

    move-object v3, v6

    goto :goto_4

    :cond_2
    if-nez v5, :cond_3

    new-instance v5, Lr1/c;

    const/16 v8, 0x10

    new-array v8, v8, [Lb2/v;

    invoke-direct {v5, v8}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_3
    if-eqz v3, :cond_4

    invoke-virtual {v5, v3}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v3, v2

    :cond_4
    invoke-virtual {v5, v6}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_5
    :goto_4
    iget-object v6, v6, Lb2/v;->F:Lb2/v;

    goto :goto_3

    :cond_6
    if-ne v7, v8, :cond_7

    goto :goto_2

    :cond_7
    invoke-static {v5}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v3

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
    move-object v0, v2

    goto/16 :goto_0

    :cond_b
    return-object v2
.end method

.method public static final h(La3/r;)V
    .locals 1

    move-object v0, p0

    check-cast v0, Lb2/v;

    iget-object v0, v0, Lb2/v;->w:Lb2/v;

    iget-boolean v0, v0, Lb2/v;->N:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-static {p0, v0}, La3/g;->n(La3/n;I)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->n1()V

    :cond_0
    return-void
.end method

.method public static final i(La3/c0;)V
    .locals 0

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object p0

    invoke-virtual {p0}, La3/n0;->R()V

    return-void
.end method

.method public static final j(La3/j2;)V
    .locals 0

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object p0

    invoke-virtual {p0}, La3/n0;->V()V

    return-void
.end method

.method public static final k(La3/n0;)Z
    .locals 1

    iget-object v0, p0, La3/n0;->G:La3/n0;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, La3/n0;->G()La3/n0;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, La3/n0;->G:La3/n0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p0}, La3/n0;->t()La3/r0;

    move-result-object p0

    iget-boolean p0, p0, La3/r0;->b:Z

    if-eqz p0, :cond_2

    :cond_1
    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static final l(Lb2/v;Lc93/a;)V
    .locals 2

    iget-object v0, p0, Lb2/v;->G:La3/x1;

    if-nez v0, :cond_0

    new-instance v0, La3/x1;

    move-object v1, p0

    check-cast v1, La3/w1;

    invoke-direct {v0, v1}, La3/x1;-><init>(La3/w1;)V

    iput-object v0, p0, Lb2/v;->G:La3/x1;

    :cond_0
    invoke-static {p0}, La3/g;->q(La3/n;)Landroidx/compose/ui/node/Owner;

    move-result-object p0

    invoke-interface {p0}, Landroidx/compose/ui/node/Owner;->getSnapshotObserver()La3/c2;

    move-result-object p0

    sget-object v1, La3/f;->F:La3/f;

    invoke-virtual {p0, v0, v1, p1}, La3/c2;->a(La3/b2;Lkotlin/jvm/functions/Function1;Lc93/a;)V

    return-void
.end method

.method public static final m(La3/n;)V
    .locals 5

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object p0

    iget-boolean v0, p0, La3/n0;->S:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    iget-object v0, v0, Landroidx/compose/ui/platform/AndroidComposeView;->i0:Lc2/d;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lc2/d;->d:Lj3/b;

    iget-object v1, v1, Lj3/b;->a:Lae3/k;

    iget v2, p0, La3/n0;->x:I

    new-instance v3, Lc2/c;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v0, p0}, Lc2/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2, v3}, Lae3/k;->g(ILc93/n;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static final n(La3/n;I)Landroidx/compose/ui/node/NodeCoordinator;
    .locals 2

    move-object v0, p0

    check-cast v0, Lb2/v;

    iget-object v0, v0, Lb2/v;->w:Lb2/v;

    iget-object v0, v0, Lb2/v;->H:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object v1

    if-eq v1, p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, La3/r1;->g(I)Z

    move-result p0

    if-eqz p0, :cond_1

    iget-object p0, v0, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static final o(La3/n;)Landroidx/compose/ui/node/NodeCoordinator;
    .locals 1

    move-object v0, p0

    check-cast v0, Lb2/v;

    iget-object v0, v0, Lb2/v;->w:Lb2/v;

    iget-boolean v0, v0, Lb2/v;->N:Z

    if-nez v0, :cond_0

    const-string v0, "Cannot get LayoutCoordinates, Modifier.Node is not attached."

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x2

    invoke-static {p0, v0}, La3/g;->n(La3/n;I)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object v0

    iget-boolean v0, v0, Lb2/v;->N:Z

    if-nez v0, :cond_1

    const-string v0, "LayoutCoordinates is not attached."

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_1
    return-object p0
.end method

.method public static final p(La3/n;)La3/n0;
    .locals 0

    check-cast p0, Lb2/v;

    iget-object p0, p0, Lb2/v;->w:Lb2/v;

    iget-object p0, p0, Lb2/v;->H:Landroidx/compose/ui/node/NodeCoordinator;

    if-eqz p0, :cond_0

    iget-object p0, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    return-object p0

    :cond_0
    const-string p0, "Cannot obtain node coordinator. Is the Modifier.Node attached?"

    invoke-static {p0}, Lb9/y;->w(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    move-result-object p0

    throw p0
.end method

.method public static final q(La3/n;)Landroidx/compose/ui/node/Owner;
    .locals 0

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object p0

    iget-object p0, p0, La3/n0;->M:Landroidx/compose/ui/node/Owner;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    const-string p0, "This node does not have an owner."

    invoke-static {p0}, Lb9/y;->w(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    move-result-object p0

    throw p0
.end method

.method public static final r(La3/n;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 10

    move-object v0, p0

    check-cast v0, Lb2/v;

    iget-object v1, v0, Lb2/v;->w:Lb2/v;

    iget-boolean v1, v1, Lb2/v;->N:Z

    if-nez v1, :cond_0

    const-string v1, "visitAncestors called on an unattached node"

    invoke-static {v1}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, v0, Lb2/v;->w:Lb2/v;

    iget-object v0, v0, Lb2/v;->E:Lb2/v;

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_e

    iget-object v1, p0, La3/n0;->e0:La3/l1;

    iget-object v1, v1, La3/l1;->g:Ljava/lang/Object;

    check-cast v1, Lb2/v;

    iget v1, v1, Lb2/v;->z:I

    const/high16 v2, 0x40000

    and-int/2addr v1, v2

    const/4 v3, 0x0

    if-eqz v1, :cond_c

    :goto_1
    if-eqz v0, :cond_c

    iget v1, v0, Lb2/v;->y:I

    and-int/2addr v1, v2

    if-eqz v1, :cond_b

    move-object v1, v0

    move-object v4, v3

    :goto_2
    if-eqz v1, :cond_b

    instance-of v5, v1, La3/p2;

    const/4 v6, 0x1

    if-eqz v5, :cond_2

    check-cast v1, La3/p2;

    invoke-interface {v1}, La3/p2;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {p1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {p2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    :cond_1
    if-nez v6, :cond_a

    goto/16 :goto_7

    :cond_2
    iget v5, v1, Lb2/v;->y:I

    and-int/2addr v5, v2

    const/4 v7, 0x0

    if-eqz v5, :cond_3

    move v5, v6

    goto :goto_3

    :cond_3
    move v5, v7

    :goto_3
    if-eqz v5, :cond_a

    instance-of v5, v1, La3/o;

    if-eqz v5, :cond_a

    move-object v5, v1

    check-cast v5, La3/o;

    iget-object v5, v5, La3/o;->P:Lb2/v;

    move v8, v7

    :goto_4
    if-eqz v5, :cond_9

    iget v9, v5, Lb2/v;->y:I

    and-int/2addr v9, v2

    if-eqz v9, :cond_4

    move v9, v6

    goto :goto_5

    :cond_4
    move v9, v7

    :goto_5
    if-eqz v9, :cond_8

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v6, :cond_5

    move-object v1, v5

    goto :goto_6

    :cond_5
    if-nez v4, :cond_6

    new-instance v4, Lr1/c;

    const/16 v9, 0x10

    new-array v9, v9, [Lb2/v;

    invoke-direct {v4, v9}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_6
    if-eqz v1, :cond_7

    invoke-virtual {v4, v1}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v1, v3

    :cond_7
    invoke-virtual {v4, v5}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_8
    :goto_6
    iget-object v5, v5, Lb2/v;->F:Lb2/v;

    goto :goto_4

    :cond_9
    if-ne v8, v6, :cond_a

    goto :goto_2

    :cond_a
    invoke-static {v4}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v1

    goto :goto_2

    :cond_b
    iget-object v0, v0, Lb2/v;->E:Lb2/v;

    goto :goto_1

    :cond_c
    invoke-virtual {p0}, La3/n0;->G()La3/n0;

    move-result-object p0

    if-eqz p0, :cond_d

    iget-object v0, p0, La3/n0;->e0:La3/l1;

    if-eqz v0, :cond_d

    iget-object v0, v0, La3/l1;->f:Ljava/lang/Object;

    check-cast v0, La3/l2;

    goto/16 :goto_0

    :cond_d
    move-object v0, v3

    goto/16 :goto_0

    :cond_e
    :goto_7
    return-void
.end method

.method public static final s(La3/p2;Lkotlin/jvm/functions/Function1;)V
    .locals 11

    move-object v0, p0

    check-cast v0, Lb2/v;

    iget-object v1, v0, Lb2/v;->w:Lb2/v;

    iget-boolean v1, v1, Lb2/v;->N:Z

    if-nez v1, :cond_0

    const-string v1, "visitAncestors called on an unattached node"

    invoke-static {v1}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, v0, Lb2/v;->w:Lb2/v;

    iget-object v0, v0, Lb2/v;->E:Lb2/v;

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_e

    iget-object v2, v1, La3/n0;->e0:La3/l1;

    iget-object v2, v2, La3/l1;->g:Ljava/lang/Object;

    check-cast v2, Lb2/v;

    iget v2, v2, Lb2/v;->z:I

    const/high16 v3, 0x40000

    and-int/2addr v2, v3

    const/4 v4, 0x0

    if-eqz v2, :cond_c

    :goto_1
    if-eqz v0, :cond_c

    iget v2, v0, Lb2/v;->y:I

    and-int/2addr v2, v3

    if-eqz v2, :cond_b

    move-object v2, v0

    move-object v5, v4

    :goto_2
    if-eqz v2, :cond_b

    instance-of v6, v2, La3/p2;

    const/4 v7, 0x1

    if-eqz v6, :cond_2

    check-cast v2, La3/p2;

    invoke-interface {p0}, La3/p2;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v2}, La3/p2;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    if-ne v6, v8, :cond_1

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    :cond_1
    if-nez v7, :cond_a

    goto/16 :goto_7

    :cond_2
    iget v6, v2, Lb2/v;->y:I

    and-int/2addr v6, v3

    const/4 v8, 0x0

    if-eqz v6, :cond_3

    move v6, v7

    goto :goto_3

    :cond_3
    move v6, v8

    :goto_3
    if-eqz v6, :cond_a

    instance-of v6, v2, La3/o;

    if-eqz v6, :cond_a

    move-object v6, v2

    check-cast v6, La3/o;

    iget-object v6, v6, La3/o;->P:Lb2/v;

    move v9, v8

    :goto_4
    if-eqz v6, :cond_9

    iget v10, v6, Lb2/v;->y:I

    and-int/2addr v10, v3

    if-eqz v10, :cond_4

    move v10, v7

    goto :goto_5

    :cond_4
    move v10, v8

    :goto_5
    if-eqz v10, :cond_8

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v7, :cond_5

    move-object v2, v6

    goto :goto_6

    :cond_5
    if-nez v5, :cond_6

    new-instance v5, Lr1/c;

    const/16 v10, 0x10

    new-array v10, v10, [Lb2/v;

    invoke-direct {v5, v10}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_6
    if-eqz v2, :cond_7

    invoke-virtual {v5, v2}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v2, v4

    :cond_7
    invoke-virtual {v5, v6}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_8
    :goto_6
    iget-object v6, v6, Lb2/v;->F:Lb2/v;

    goto :goto_4

    :cond_9
    if-ne v9, v7, :cond_a

    goto :goto_2

    :cond_a
    invoke-static {v5}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v2

    goto :goto_2

    :cond_b
    iget-object v0, v0, Lb2/v;->E:Lb2/v;

    goto/16 :goto_1

    :cond_c
    invoke-virtual {v1}, La3/n0;->G()La3/n0;

    move-result-object v1

    if-eqz v1, :cond_d

    iget-object v0, v1, La3/n0;->e0:La3/l1;

    if-eqz v0, :cond_d

    iget-object v0, v0, La3/l1;->f:Ljava/lang/Object;

    check-cast v0, La3/l2;

    goto/16 :goto_0

    :cond_d
    move-object v0, v4

    goto/16 :goto_0

    :cond_e
    :goto_7
    return-void
.end method

.method public static final t(La3/p2;Lkotlin/jvm/functions/Function1;)V
    .locals 12

    move-object v0, p0

    check-cast v0, Lb2/v;

    iget-object v1, v0, Lb2/v;->w:Lb2/v;

    iget-boolean v1, v1, Lb2/v;->N:Z

    if-nez v1, :cond_0

    const-string v1, "visitSubtreeIf called on an unattached node"

    invoke-static {v1}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    new-instance v1, Lr1/c;

    const/16 v2, 0x10

    new-array v3, v2, [Lb2/v;

    invoke-direct {v1, v3}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iget-object v0, v0, Lb2/v;->w:Lb2/v;

    iget-object v3, v0, Lb2/v;->F:Lb2/v;

    if-nez v3, :cond_1

    invoke-static {v1, v0}, La3/g;->a(Lr1/c;Lb2/v;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1, v3}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    iget v0, v1, Lr1/c;->y:I

    if-eqz v0, :cond_e

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Lr1/c;->l(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb2/v;

    iget v3, v0, Lb2/v;->z:I

    const/high16 v4, 0x40000

    and-int/2addr v3, v4

    if-eqz v3, :cond_d

    move-object v3, v0

    :goto_1
    if-eqz v3, :cond_d

    iget v5, v3, Lb2/v;->y:I

    and-int/2addr v5, v4

    if-eqz v5, :cond_c

    const/4 v5, 0x0

    move-object v6, v3

    move-object v7, v5

    :goto_2
    if-eqz v6, :cond_c

    instance-of v8, v6, La3/p2;

    if-eqz v8, :cond_5

    check-cast v6, La3/p2;

    invoke-interface {p0}, La3/p2;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v6}, La3/p2;->f()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    if-ne v8, v9, :cond_3

    invoke-interface {p1, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La3/o2;

    goto :goto_3

    :cond_3
    sget-object v6, La3/o2;->w:La3/o2;

    :goto_3
    sget-object v8, La3/o2;->y:La3/o2;

    if-ne v6, v8, :cond_4

    goto :goto_7

    :cond_4
    sget-object v8, La3/o2;->x:La3/o2;

    if-eq v6, v8, :cond_2

    goto :goto_6

    :cond_5
    iget v8, v6, Lb2/v;->y:I

    and-int/2addr v8, v4

    if-eqz v8, :cond_b

    instance-of v8, v6, La3/o;

    if-eqz v8, :cond_b

    move-object v8, v6

    check-cast v8, La3/o;

    iget-object v8, v8, La3/o;->P:Lb2/v;

    const/4 v9, 0x0

    :goto_4
    const/4 v10, 0x1

    if-eqz v8, :cond_a

    iget v11, v8, Lb2/v;->y:I

    and-int/2addr v11, v4

    if-eqz v11, :cond_9

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v10, :cond_6

    move-object v6, v8

    goto :goto_5

    :cond_6
    if-nez v7, :cond_7

    new-instance v7, Lr1/c;

    new-array v10, v2, [Lb2/v;

    invoke-direct {v7, v10}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_7
    if-eqz v6, :cond_8

    invoke-virtual {v7, v6}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v6, v5

    :cond_8
    invoke-virtual {v7, v8}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_9
    :goto_5
    iget-object v8, v8, Lb2/v;->F:Lb2/v;

    goto :goto_4

    :cond_a
    if-ne v9, v10, :cond_b

    goto :goto_2

    :cond_b
    :goto_6
    invoke-static {v7}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v6

    goto :goto_2

    :cond_c
    iget-object v3, v3, Lb2/v;->F:Lb2/v;

    goto :goto_1

    :cond_d
    invoke-static {v1, v0}, La3/g;->a(Lr1/c;Lb2/v;)V

    goto/16 :goto_0

    :cond_e
    :goto_7
    return-void
.end method
