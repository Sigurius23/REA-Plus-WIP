.class public final Li3/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lb2/v;

.field public final b:Z

.field public final c:La3/n0;

.field public final d:Li3/l;

.field public e:Z

.field public f:Li3/p;

.field public final g:I


# direct methods
.method public constructor <init>(Lb2/v;ZLa3/n0;Li3/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li3/p;->a:Lb2/v;

    iput-boolean p2, p0, Li3/p;->b:Z

    iput-object p3, p0, Li3/p;->c:La3/n0;

    iput-object p4, p0, Li3/p;->d:Li3/l;

    iget p1, p3, La3/n0;->x:I

    iput p1, p0, Li3/p;->g:I

    return-void
.end method

.method public static synthetic j(ILi3/p;)Ljava/util/List;
    .locals 3

    and-int/lit8 v0, p0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-boolean v0, p1, Li3/p;->b:Z

    xor-int/2addr v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/lit8 p0, p0, 0x2

    if-eqz p0, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    invoke-virtual {p1, v0, v1}, Li3/p;->i(ZZ)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/node/NodeCoordinator;)Lh2/c;
    .locals 10

    invoke-virtual {p0}, Li3/p;->l()Li3/p;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object p1, Lh2/c;->e:Lh2/c;

    return-object p1

    :cond_0
    iget-object v1, v0, Li3/p;->c:La3/n0;

    iget-object v1, v1, La3/n0;->e0:La3/l1;

    iget-object v1, v1, La3/l1;->g:Ljava/lang/Object;

    check-cast v1, Lb2/v;

    iget v2, v1, Lb2/v;->z:I

    const/16 v3, 0x8

    and-int/2addr v2, v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_9

    :goto_0
    if-eqz v1, :cond_9

    iget v2, v1, Lb2/v;->y:I

    and-int/2addr v2, v3

    if-eqz v2, :cond_8

    move-object v2, v1

    move-object v6, v5

    :goto_1
    if-eqz v2, :cond_8

    instance-of v7, v2, La3/j2;

    if-eqz v7, :cond_1

    move-object v7, v2

    check-cast v7, La3/j2;

    invoke-interface {v7}, La3/j2;->e()Z

    move-result v7

    if-eqz v7, :cond_7

    goto :goto_4

    :cond_1
    iget v7, v2, Lb2/v;->y:I

    and-int/2addr v7, v3

    if-eqz v7, :cond_7

    instance-of v7, v2, La3/o;

    if-eqz v7, :cond_7

    move-object v7, v2

    check-cast v7, La3/o;

    iget-object v7, v7, La3/o;->P:Lb2/v;

    const/4 v8, 0x0

    :goto_2
    if-eqz v7, :cond_6

    iget v9, v7, Lb2/v;->y:I

    and-int/2addr v9, v3

    if-eqz v9, :cond_5

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v4, :cond_2

    move-object v2, v7

    goto :goto_3

    :cond_2
    if-nez v6, :cond_3

    new-instance v6, Lr1/c;

    const/16 v9, 0x10

    new-array v9, v9, [Lb2/v;

    invoke-direct {v6, v9}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_3
    if-eqz v2, :cond_4

    invoke-virtual {v6, v2}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v2, v5

    :cond_4
    invoke-virtual {v6, v7}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_5
    :goto_3
    iget-object v7, v7, Lb2/v;->F:Lb2/v;

    goto :goto_2

    :cond_6
    if-ne v8, v4, :cond_7

    goto :goto_1

    :cond_7
    invoke-static {v6}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v2

    goto :goto_1

    :cond_8
    iget v2, v1, Lb2/v;->z:I

    and-int/2addr v2, v3

    if-eqz v2, :cond_9

    iget-object v1, v1, Lb2/v;->F:Lb2/v;

    goto :goto_0

    :cond_9
    move-object v2, v5

    :goto_4
    check-cast v2, La3/j2;

    if-eqz v2, :cond_a

    invoke-static {v2, v3}, La3/g;->n(La3/n;I)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v5

    :cond_a
    if-nez v5, :cond_b

    invoke-virtual {v0, p1}, Li3/p;->a(Landroidx/compose/ui/node/NodeCoordinator;)Lh2/c;

    move-result-object p1

    return-object p1

    :cond_b
    invoke-virtual {v5, p1, v4}, Landroidx/compose/ui/node/NodeCoordinator;->r(Ly2/y;Z)Lh2/c;

    move-result-object p1

    return-object p1
.end method

.method public final b(Li3/i;Lkotlin/jvm/functions/Function1;)Li3/p;
    .locals 5

    new-instance v0, Li3/l;

    invoke-direct {v0}, Li3/l;-><init>()V

    const/4 v1, 0x0

    iput-boolean v1, v0, Li3/l;->y:Z

    iput-boolean v1, v0, Li3/l;->z:Z

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Li3/p;

    new-instance v3, Li3/o;

    invoke-direct {v3, p2}, Li3/o;-><init>(Lkotlin/jvm/functions/Function1;)V

    new-instance p2, La3/n0;

    iget v4, p0, Li3/p;->g:I

    if-eqz p1, :cond_0

    const p1, 0x3b9aca00

    :goto_0
    add-int/2addr v4, p1

    goto :goto_1

    :cond_0
    const p1, 0x77359400

    goto :goto_0

    :goto_1
    const/4 p1, 0x1

    invoke-direct {p2, p1, v4}, La3/n0;-><init>(ZI)V

    invoke-direct {v2, v3, v1, p2, v0}, Li3/p;-><init>(Lb2/v;ZLa3/n0;Li3/l;)V

    iput-boolean p1, v2, Li3/p;->e:Z

    iput-object p0, v2, Li3/p;->f:Li3/p;

    return-object v2
.end method

.method public final c(La3/n0;Ljava/util/ArrayList;)V
    .locals 5

    invoke-virtual {p1}, La3/n0;->L()Lr1/c;

    move-result-object p1

    iget-object v0, p1, Lr1/c;->w:[Ljava/lang/Object;

    iget p1, p1, Lr1/c;->y:I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_2

    aget-object v2, v0, v1

    check-cast v2, La3/n0;

    invoke-virtual {v2}, La3/n0;->X()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-boolean v3, v2, La3/n0;->o0:Z

    if-nez v3, :cond_1

    iget-object v3, v2, La3/n0;->e0:La3/l1;

    const/16 v4, 0x8

    invoke-virtual {v3, v4}, La3/l1;->j(I)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-boolean v3, p0, Li3/p;->b:Z

    invoke-static {v2, v3}, Li3/s;->a(La3/n0;Z)Li3/p;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v2, p2}, Li3/p;->c(La3/n0;Ljava/util/ArrayList;)V

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final d()Landroidx/compose/ui/node/NodeCoordinator;
    .locals 2

    iget-boolean v0, p0, Li3/p;->e:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Li3/p;->l()Li3/p;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Li3/p;->d()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0

    :cond_1
    invoke-virtual {p0}, Li3/p;->f()La3/j2;

    move-result-object v0

    if-eqz v0, :cond_2

    const/16 v1, 0x8

    invoke-static {v0, v1}, La3/g;->n(La3/n;I)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    return-object v0

    :cond_2
    iget-object v0, p0, Li3/p;->c:La3/n0;

    iget-object v0, v0, La3/n0;->e0:La3/l1;

    iget-object v0, v0, La3/l1;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/node/a;

    return-object v0
.end method

.method public final e(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, p1}, Li3/p;->r(ZLjava/util/ArrayList;)Ljava/util/List;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_2

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li3/p;

    invoke-virtual {v2}, Li3/p;->o()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    iget-object v3, v2, Li3/p;->d:Li3/l;

    iget-boolean v3, v3, Li3/l;->z:Z

    if-nez v3, :cond_1

    invoke-virtual {v2, p1, p2}, Li3/p;->e(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final f()La3/j2;
    .locals 11

    iget-object v0, p0, Li3/p;->d:Li3/l;

    iget-boolean v0, v0, Li3/l;->y:Z

    const/16 v1, 0x10

    iget-object v2, p0, Li3/p;->c:La3/n0;

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v0, :cond_a

    iget-object v0, v2, La3/n0;->e0:La3/l1;

    iget-object v0, v0, La3/l1;->g:Ljava/lang/Object;

    check-cast v0, Lb2/v;

    iget v2, v0, Lb2/v;->z:I

    and-int/lit8 v2, v2, 0x8

    if-eqz v2, :cond_13

    move-object v2, v5

    :goto_0
    if-eqz v0, :cond_9

    iget v6, v0, Lb2/v;->y:I

    and-int/lit8 v6, v6, 0x8

    if-eqz v6, :cond_8

    move-object v6, v0

    move-object v7, v5

    :goto_1
    if-eqz v6, :cond_8

    instance-of v8, v6, La3/j2;

    if-eqz v8, :cond_1

    check-cast v6, La3/j2;

    invoke-interface {v6}, La3/j2;->e()Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-interface {v6}, La3/j2;->H0()Z

    move-result v8

    if-eqz v8, :cond_0

    return-object v6

    :cond_0
    if-nez v2, :cond_7

    move-object v2, v6

    goto :goto_4

    :cond_1
    iget v8, v6, Lb2/v;->y:I

    and-int/lit8 v8, v8, 0x8

    if-eqz v8, :cond_7

    instance-of v8, v6, La3/o;

    if-eqz v8, :cond_7

    move-object v8, v6

    check-cast v8, La3/o;

    iget-object v8, v8, La3/o;->P:Lb2/v;

    move v9, v3

    :goto_2
    if-eqz v8, :cond_6

    iget v10, v8, Lb2/v;->y:I

    and-int/lit8 v10, v10, 0x8

    if-eqz v10, :cond_5

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v4, :cond_2

    move-object v6, v8

    goto :goto_3

    :cond_2
    if-nez v7, :cond_3

    new-instance v7, Lr1/c;

    new-array v10, v1, [Lb2/v;

    invoke-direct {v7, v10}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_3
    if-eqz v6, :cond_4

    invoke-virtual {v7, v6}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v6, v5

    :cond_4
    invoke-virtual {v7, v8}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_5
    :goto_3
    iget-object v8, v8, Lb2/v;->F:Lb2/v;

    goto :goto_2

    :cond_6
    if-ne v9, v4, :cond_7

    goto :goto_1

    :cond_7
    :goto_4
    invoke-static {v7}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v6

    goto :goto_1

    :cond_8
    iget v6, v0, Lb2/v;->z:I

    and-int/lit8 v6, v6, 0x8

    if-eqz v6, :cond_9

    iget-object v0, v0, Lb2/v;->F:Lb2/v;

    goto :goto_0

    :cond_9
    :goto_5
    move-object v5, v2

    goto/16 :goto_a

    :cond_a
    iget-object v0, v2, La3/n0;->e0:La3/l1;

    iget-object v0, v0, La3/l1;->g:Ljava/lang/Object;

    check-cast v0, Lb2/v;

    iget v2, v0, Lb2/v;->z:I

    and-int/lit8 v2, v2, 0x8

    if-eqz v2, :cond_13

    :goto_6
    if-eqz v0, :cond_13

    iget v2, v0, Lb2/v;->y:I

    and-int/lit8 v2, v2, 0x8

    if-eqz v2, :cond_12

    move-object v2, v0

    move-object v6, v5

    :goto_7
    if-eqz v2, :cond_12

    instance-of v7, v2, La3/j2;

    if-eqz v7, :cond_b

    move-object v7, v2

    check-cast v7, La3/j2;

    invoke-interface {v7}, La3/j2;->e()Z

    move-result v7

    if-eqz v7, :cond_11

    goto :goto_5

    :cond_b
    iget v7, v2, Lb2/v;->y:I

    and-int/lit8 v7, v7, 0x8

    if-eqz v7, :cond_11

    instance-of v7, v2, La3/o;

    if-eqz v7, :cond_11

    move-object v7, v2

    check-cast v7, La3/o;

    iget-object v7, v7, La3/o;->P:Lb2/v;

    move v8, v3

    :goto_8
    if-eqz v7, :cond_10

    iget v9, v7, Lb2/v;->y:I

    and-int/lit8 v9, v9, 0x8

    if-eqz v9, :cond_f

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v4, :cond_c

    move-object v2, v7

    goto :goto_9

    :cond_c
    if-nez v6, :cond_d

    new-instance v6, Lr1/c;

    new-array v9, v1, [Lb2/v;

    invoke-direct {v6, v9}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_d
    if-eqz v2, :cond_e

    invoke-virtual {v6, v2}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v2, v5

    :cond_e
    invoke-virtual {v6, v7}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_f
    :goto_9
    iget-object v7, v7, Lb2/v;->F:Lb2/v;

    goto :goto_8

    :cond_10
    if-ne v8, v4, :cond_11

    goto :goto_7

    :cond_11
    invoke-static {v6}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v2

    goto :goto_7

    :cond_12
    iget v2, v0, Lb2/v;->z:I

    and-int/lit8 v2, v2, 0x8

    if-eqz v2, :cond_13

    iget-object v0, v0, Lb2/v;->F:Lb2/v;

    goto :goto_6

    :cond_13
    :goto_a
    check-cast v5, La3/j2;

    return-object v5
.end method

.method public final g()Lh2/c;
    .locals 3

    invoke-virtual {p0}, Li3/p;->d()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object v1

    iget-boolean v1, v1, Lb2/v;->N:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Ly2/q1;->h(Ly2/y;)Ly2/y;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v1, v0, v2}, Ly2/y;->r(Ly2/y;Z)Lh2/c;

    move-result-object v0

    return-object v0

    :cond_1
    sget-object v0, Lh2/c;->e:Lh2/c;

    return-object v0
.end method

.method public final h()Lh2/c;
    .locals 2

    invoke-virtual {p0}, Li3/p;->d()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object v1

    iget-boolean v1, v1, Lb2/v;->N:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Ly2/q1;->f(Ly2/y;)Lh2/c;

    move-result-object v0

    return-object v0

    :cond_1
    sget-object v0, Lh2/c;->e:Lh2/c;

    return-object v0
.end method

.method public final i(ZZ)Ljava/util/List;
    .locals 1

    if-nez p1, :cond_0

    iget-object p1, p0, Li3/p;->d:Li3/l;

    iget-boolean p1, p1, Li3/l;->z:Z

    if-eqz p1, :cond_0

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1

    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Li3/p;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, p1, p2}, Li3/p;->e(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    return-object p2

    :cond_1
    invoke-virtual {p0, p2, p1}, Li3/p;->r(ZLjava/util/ArrayList;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final k()Li3/l;
    .locals 2

    invoke-virtual {p0}, Li3/p;->o()Z

    move-result v0

    iget-object v1, p0, Li3/p;->d:Li3/l;

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Li3/l;->a()Li3/l;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, v1, v0}, Li3/p;->q(Ljava/util/ArrayList;Li3/l;)V

    return-object v0

    :cond_0
    return-object v1
.end method

.method public final l()Li3/p;
    .locals 6

    iget-object v0, p0, Li3/p;->f:Li3/p;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Li3/p;->c:La3/n0;

    iget-boolean v1, p0, Li3/p;->b:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v0}, La3/n0;->G()La3/n0;

    move-result-object v3

    :goto_0
    if-eqz v3, :cond_2

    invoke-virtual {v3}, La3/n0;->I()Li3/l;

    move-result-object v4

    if-eqz v4, :cond_1

    iget-boolean v4, v4, Li3/l;->y:Z

    const/4 v5, 0x1

    if-ne v4, v5, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, La3/n0;->G()La3/n0;

    move-result-object v3

    goto :goto_0

    :cond_2
    move-object v3, v2

    :goto_1
    if-nez v3, :cond_5

    invoke-virtual {v0}, La3/n0;->G()La3/n0;

    move-result-object v0

    :goto_2
    if-eqz v0, :cond_4

    iget-object v3, v0, La3/n0;->e0:La3/l1;

    const/16 v4, 0x8

    invoke-virtual {v3, v4}, La3/l1;->j(I)Z

    move-result v3

    if-eqz v3, :cond_3

    move-object v3, v0

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, La3/n0;->G()La3/n0;

    move-result-object v0

    goto :goto_2

    :cond_4
    move-object v3, v2

    :cond_5
    :goto_3
    if-nez v3, :cond_6

    return-object v2

    :cond_6
    invoke-static {v3, v1}, Li3/s;->a(La3/n0;Z)Li3/p;

    move-result-object v0

    return-object v0
.end method

.method public final m()J
    .locals 4

    invoke-virtual {p0}, Li3/p;->d()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object v3

    iget-boolean v3, v3, Lb2/v;->N:Z

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/node/NodeCoordinator;->E(J)J

    move-result-wide v0

    return-wide v0

    :cond_1
    return-wide v1
.end method

.method public final n()Li3/l;
    .locals 1

    iget-object v0, p0, Li3/p;->d:Li3/l;

    return-object v0
.end method

.method public final o()Z
    .locals 1

    iget-boolean v0, p0, Li3/p;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Li3/p;->d:Li3/l;

    iget-boolean v0, v0, Li3/l;->y:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final p()Z
    .locals 3

    iget-boolean v0, p0, Li3/p;->e:Z

    if-nez v0, :cond_2

    const/4 v0, 0x4

    invoke-static {v0, p0}, Li3/p;->j(ILi3/p;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Li3/p;->c:La3/n0;

    invoke-virtual {v0}, La3/n0;->G()La3/n0;

    move-result-object v0

    :goto_0
    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, La3/n0;->I()Li3/l;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-boolean v2, v2, Li3/l;->y:Z

    if-ne v2, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, La3/n0;->G()La3/n0;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_2

    return v1

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final q(Ljava/util/ArrayList;Li3/l;)V
    .locals 4

    iget-object v0, p0, Li3/p;->d:Li3/l;

    iget-boolean v0, v0, Li3/l;->z:Z

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, p1}, Li3/p;->r(ZLjava/util/ArrayList;)Ljava/util/List;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_1

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li3/p;

    invoke-virtual {v2}, Li3/p;->o()Z

    move-result v3

    if-nez v3, :cond_0

    iget-object v3, v2, Li3/p;->d:Li3/l;

    invoke-virtual {p2, v3}, Li3/l;->d(Li3/l;)V

    invoke-virtual {v2, p1, p2}, Li3/p;->q(Ljava/util/ArrayList;Li3/l;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final r(ZLjava/util/ArrayList;)Ljava/util/List;
    .locals 5

    iget-boolean v0, p0, Li3/p;->e:Z

    if-eqz v0, :cond_0

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1

    :cond_0
    iget-object v0, p0, Li3/p;->c:La3/n0;

    invoke-virtual {p0, v0, p2}, Li3/p;->c(La3/n0;Ljava/util/ArrayList;)V

    if-eqz p1, :cond_5

    iget-object p1, p0, Li3/p;->d:Li3/l;

    iget-object v0, p1, Li3/l;->w:La0/v0;

    sget-object v1, Li3/u;->x:Li3/y;

    invoke-virtual {v0, v1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    move-object v1, v2

    :cond_1
    check-cast v1, Li3/i;

    if-eqz v1, :cond_2

    iget-boolean v3, p1, Li3/l;->y:Z

    if-eqz v3, :cond_2

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    new-instance v3, La3/m1;

    const/16 v4, 0x10

    invoke-direct {v3, v1, v4}, La3/m1;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, v1, v3}, Li3/p;->b(Li3/i;Lkotlin/jvm/functions/Function1;)Li3/p;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    sget-object v1, Li3/u;->a:Li3/y;

    invoke-virtual {v0, v1}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_5

    iget-boolean p1, p1, Li3/l;->y:Z

    if-eqz p1, :cond_5

    invoke-virtual {v0, v1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_3

    move-object p1, v2

    :cond_3
    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_4

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_4
    move-object p1, v2

    :goto_0
    if-eqz p1, :cond_5

    new-instance v0, La3/m1;

    const/16 v1, 0x11

    invoke-direct {v0, p1, v1}, La3/m1;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, v2, v0}, Li3/p;->b(Li3/i;Lkotlin/jvm/functions/Function1;)Li3/p;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p2, v0, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :cond_5
    return-object p2
.end method
