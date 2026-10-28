.class public abstract Li3/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lh2/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lh2/c;

    const/4 v1, 0x0

    const/high16 v2, 0x41200000    # 10.0f

    invoke-direct {v0, v1, v1, v2, v2}, Lh2/c;-><init>(FFFF)V

    sput-object v0, Li3/s;->a:Lh2/c;

    return-void
.end method

.method public static final a(La3/n0;Z)Li3/p;
    .locals 8

    iget-object v0, p0, La3/n0;->e0:La3/l1;

    iget-object v0, v0, La3/l1;->g:Ljava/lang/Object;

    check-cast v0, Lb2/v;

    iget v1, v0, Lb2/v;->z:I

    and-int/lit8 v1, v1, 0x8

    const/4 v2, 0x0

    if-eqz v1, :cond_8

    :goto_0
    if-eqz v0, :cond_8

    iget v1, v0, Lb2/v;->y:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_7

    move-object v1, v0

    move-object v3, v2

    :goto_1
    if-eqz v1, :cond_7

    instance-of v4, v1, La3/j2;

    if-eqz v4, :cond_0

    move-object v2, v1

    goto :goto_4

    :cond_0
    iget v4, v1, Lb2/v;->y:I

    and-int/lit8 v4, v4, 0x8

    if-eqz v4, :cond_6

    instance-of v4, v1, La3/o;

    if-eqz v4, :cond_6

    move-object v4, v1

    check-cast v4, La3/o;

    iget-object v4, v4, La3/o;->P:Lb2/v;

    const/4 v5, 0x0

    :goto_2
    const/4 v6, 0x1

    if-eqz v4, :cond_5

    iget v7, v4, Lb2/v;->y:I

    and-int/lit8 v7, v7, 0x8

    if-eqz v7, :cond_4

    add-int/lit8 v5, v5, 0x1

    if-ne v5, v6, :cond_1

    move-object v1, v4

    goto :goto_3

    :cond_1
    if-nez v3, :cond_2

    new-instance v3, Lr1/c;

    const/16 v6, 0x10

    new-array v6, v6, [Lb2/v;

    invoke-direct {v3, v6}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {v3, v1}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v1, v2

    :cond_3
    invoke-virtual {v3, v4}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_4
    :goto_3
    iget-object v4, v4, Lb2/v;->F:Lb2/v;

    goto :goto_2

    :cond_5
    if-ne v5, v6, :cond_6

    goto :goto_1

    :cond_6
    invoke-static {v3}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v1

    goto :goto_1

    :cond_7
    iget v1, v0, Lb2/v;->z:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_8

    iget-object v0, v0, Lb2/v;->F:Lb2/v;

    goto :goto_0

    :cond_8
    :goto_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v2, La3/j2;

    check-cast v2, Lb2/v;

    iget-object v0, v2, Lb2/v;->w:Lb2/v;

    invoke-virtual {p0}, La3/n0;->I()Li3/l;

    move-result-object v1

    if-nez v1, :cond_9

    new-instance v1, Li3/l;

    invoke-direct {v1}, Li3/l;-><init>()V

    :cond_9
    new-instance v2, Li3/p;

    invoke-direct {v2, v0, p1, p0, v1}, Li3/p;-><init>(Lb2/v;ZLa3/n0;Li3/l;)V

    return-object v2
.end method

.method public static final b(Li3/r;)La0/g0;
    .locals 7

    const-string v0, "getAllUncoveredSemanticsNodesToIntObjectMap"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, Li3/r;->a()Li3/p;

    move-result-object p0

    iget-object v0, p0, Li3/p;->c:La3/n0;

    invoke-virtual {v0}, La3/n0;->Y()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, La3/n0;->X()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, La0/g0;

    const/16 v1, 0x30

    invoke-direct {v0, v1}, La0/g0;-><init>(I)V

    new-instance v1, Lad3/z;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Lad3/z;-><init>(I)V

    invoke-virtual {p0}, Li3/p;->g()Lh2/c;

    move-result-object v2

    invoke-static {v2}, Lvo/c;->c(Lh2/c;)Ly3/k;

    move-result-object v2

    iget-object v3, v1, Lad3/z;->x:Ljava/lang/Object;

    check-cast v3, Landroid/graphics/Region;

    iget v4, v2, Ly3/k;->a:I

    iget v5, v2, Ly3/k;->b:I

    iget v6, v2, Ly3/k;->c:I

    iget v2, v2, Ly3/k;->d:I

    invoke-virtual {v3, v4, v5, v6, v2}, Landroid/graphics/Region;->set(IIII)Z

    new-instance v2, Lad3/z;

    const/16 v3, 0xd

    invoke-direct {v2, v3}, Lad3/z;-><init>(I)V

    invoke-static {v1, p0, v0, p0, v2}, Li3/s;->c(Lad3/z;Li3/p;La0/g0;Li3/p;Lad3/z;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-object v0

    :cond_1
    :goto_0
    :try_start_1
    sget-object p0, La0/t;->a:La0/g0;

    const-string v0, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p0
.end method

.method public static final c(Lad3/z;Li3/p;La0/g0;Li3/p;Lad3/z;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    iget v5, v1, Li3/p;->g:I

    iget-object v6, v4, Lad3/z;->x:Ljava/lang/Object;

    check-cast v6, Landroid/graphics/Region;

    iget-object v7, v3, Li3/p;->c:La3/n0;

    iget v8, v3, Li3/p;->g:I

    invoke-virtual {v7}, La3/n0;->Y()Z

    move-result v9

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eqz v9, :cond_1

    invoke-virtual {v7}, La3/n0;->X()Z

    move-result v9

    if-nez v9, :cond_0

    goto :goto_0

    :cond_0
    move v9, v10

    goto :goto_1

    :cond_1
    :goto_0
    move v9, v11

    :goto_1
    iget-object v12, v0, Lad3/z;->x:Ljava/lang/Object;

    move-object v13, v12

    check-cast v13, Landroid/graphics/Region;

    invoke-virtual {v13}, Landroid/graphics/Region;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_2

    if-ne v8, v5, :cond_f

    :cond_2
    if-eqz v9, :cond_3

    iget-boolean v9, v3, Li3/p;->e:Z

    if-nez v9, :cond_3

    goto/16 :goto_6

    :cond_3
    invoke-virtual {v3}, Li3/p;->f()La3/j2;

    move-result-object v9

    if-nez v9, :cond_4

    iget-object v7, v7, La3/n0;->e0:La3/l1;

    iget-object v7, v7, La3/l1;->d:Ljava/lang/Object;

    check-cast v7, Landroidx/compose/ui/node/a;

    invoke-virtual {v7}, Landroidx/compose/ui/node/NodeCoordinator;->C1()Lh2/c;

    move-result-object v7

    goto :goto_2

    :cond_4
    check-cast v9, Lb2/v;

    iget-object v7, v9, Lb2/v;->w:Lb2/v;

    iget-object v9, v3, Li3/p;->d:Li3/l;

    sget-object v12, Li3/k;->b:Li3/y;

    iget-object v9, v9, Li3/l;->w:La0/v0;

    invoke-virtual {v9, v12}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_5

    const/4 v9, 0x0

    :cond_5
    if-eqz v9, :cond_6

    move v10, v11

    :cond_6
    iget-object v9, v7, Lb2/v;->w:Lb2/v;

    iget-boolean v9, v9, Lb2/v;->N:Z

    if-nez v9, :cond_7

    sget-object v7, Lh2/c;->e:Lh2/c;

    goto :goto_2

    :cond_7
    const/16 v9, 0x8

    if-nez v10, :cond_8

    invoke-static {v7, v9}, La3/g;->n(La3/n;I)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v7

    invoke-static {v7}, Ly2/q1;->h(Ly2/y;)Ly2/y;

    move-result-object v9

    invoke-interface {v9, v7, v11}, Ly2/y;->r(Ly2/y;Z)Lh2/c;

    move-result-object v7

    goto :goto_2

    :cond_8
    invoke-static {v7, v9}, La3/g;->n(La3/n;I)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v7

    invoke-virtual {v7}, Landroidx/compose/ui/node/NodeCoordinator;->C1()Lh2/c;

    move-result-object v7

    :goto_2
    invoke-static {v7}, Lvo/c;->c(Lh2/c;)Ly3/k;

    move-result-object v7

    iget v9, v7, Ly3/k;->a:I

    iget v10, v7, Ly3/k;->b:I

    iget v12, v7, Ly3/k;->c:I

    iget v14, v7, Ly3/k;->d:I

    invoke-virtual {v6, v9, v10, v12, v14}, Landroid/graphics/Region;->set(IIII)Z

    const/4 v9, -0x1

    if-ne v8, v5, :cond_9

    move v8, v9

    :cond_9
    sget-object v5, Landroid/graphics/Region$Op;->INTERSECT:Landroid/graphics/Region$Op;

    invoke-virtual {v6, v13, v5}, Landroid/graphics/Region;->op(Landroid/graphics/Region;Landroid/graphics/Region$Op;)Z

    move-result v5

    if-eqz v5, :cond_c

    new-instance v5, Li3/q;

    invoke-virtual {v6}, Landroid/graphics/Region;->getBounds()Landroid/graphics/Rect;

    move-result-object v6

    new-instance v10, Ly3/k;

    iget v12, v6, Landroid/graphics/Rect;->left:I

    iget v14, v6, Landroid/graphics/Rect;->top:I

    iget v15, v6, Landroid/graphics/Rect;->right:I

    iget v6, v6, Landroid/graphics/Rect;->bottom:I

    invoke-direct {v10, v12, v14, v15, v6}, Ly3/k;-><init>(IIII)V

    invoke-direct {v5, v3, v10}, Li3/q;-><init>(Li3/p;Ly3/k;)V

    invoke-virtual {v2, v8, v5}, La0/g0;->h(ILjava/lang/Object;)V

    const/4 v5, 0x4

    invoke-static {v5, v3}, Li3/p;->j(ILi3/p;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    sub-int/2addr v6, v11

    :goto_3
    if-ge v9, v6, :cond_b

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Li3/p;

    invoke-virtual {v8}, Li3/p;->k()Li3/l;

    move-result-object v8

    sget-object v10, Li3/u;->z:Li3/y;

    iget-object v8, v8, Li3/l;->w:La0/v0;

    invoke-virtual {v8, v10}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    goto :goto_4

    :cond_a
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Li3/p;

    invoke-static {v0, v1, v2, v8, v4}, Li3/s;->c(Lad3/z;Li3/p;La0/g0;Li3/p;Lad3/z;)V

    :goto_4
    add-int/lit8 v6, v6, -0x1

    goto :goto_3

    :cond_b
    invoke-static {v3}, Li3/s;->f(Li3/p;)Z

    move-result v0

    if-eqz v0, :cond_f

    iget v14, v7, Ly3/k;->a:I

    iget v15, v7, Ly3/k;->b:I

    iget v0, v7, Ly3/k;->c:I

    iget v1, v7, Ly3/k;->d:I

    sget-object v18, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    move/from16 v16, v0

    move/from16 v17, v1

    invoke-virtual/range {v13 .. v18}, Landroid/graphics/Region;->op(IIIILandroid/graphics/Region$Op;)Z

    return-void

    :cond_c
    iget-boolean v0, v3, Li3/p;->e:Z

    if-eqz v0, :cond_e

    invoke-virtual {v3}, Li3/p;->l()Li3/p;

    move-result-object v0

    if-eqz v0, :cond_d

    iget-object v1, v0, Li3/p;->c:La3/n0;

    if-eqz v1, :cond_d

    invoke-virtual {v1}, La3/n0;->Y()Z

    move-result v1

    if-ne v1, v11, :cond_d

    invoke-virtual {v0}, Li3/p;->g()Lh2/c;

    move-result-object v0

    goto :goto_5

    :cond_d
    sget-object v0, Li3/s;->a:Lh2/c;

    :goto_5
    new-instance v1, Li3/q;

    invoke-static {v0}, Lvo/c;->c(Lh2/c;)Ly3/k;

    move-result-object v0

    invoke-direct {v1, v3, v0}, Li3/q;-><init>(Li3/p;Ly3/k;)V

    invoke-virtual {v2, v8, v1}, La0/g0;->h(ILjava/lang/Object;)V

    return-void

    :cond_e
    if-ne v8, v9, :cond_f

    new-instance v0, Li3/q;

    invoke-virtual {v6}, Landroid/graphics/Region;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    new-instance v4, Ly3/k;

    iget v5, v1, Landroid/graphics/Rect;->left:I

    iget v6, v1, Landroid/graphics/Rect;->top:I

    iget v7, v1, Landroid/graphics/Rect;->right:I

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    invoke-direct {v4, v5, v6, v7, v1}, Ly3/k;-><init>(IIII)V

    invoke-direct {v0, v3, v4}, Li3/q;-><init>(Li3/p;Ly3/k;)V

    invoke-virtual {v2, v8, v0}, La0/g0;->h(ILjava/lang/Object;)V

    :cond_f
    :goto_6
    return-void
.end method

.method public static final d(Li3/l;Li3/y;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Li3/l;->w:La0/v0;

    invoke-virtual {p0, p1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    :cond_0
    return-object p0
.end method

.method public static final e(Li3/p;)Z
    .locals 3

    invoke-virtual {p0}, Li3/p;->d()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    iget-object p0, p0, Li3/p;->d:Li3/l;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->o1()Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_2

    sget-object v0, Li3/u;->a:Li3/y;

    sget-object v0, Li3/u;->p:Li3/y;

    iget-object v2, p0, Li3/l;->w:La0/v0;

    invoke-virtual {v2, v0}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Li3/u;->o:Li3/y;

    iget-object p0, p0, Li3/l;->w:La0/v0;

    invoke-virtual {p0, v0}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_1

    :cond_1
    return v1

    :cond_2
    :goto_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final f(Li3/p;)Z
    .locals 14

    invoke-static {p0}, Li3/s;->e(Li3/p;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_4

    iget-object p0, p0, Li3/p;->d:Li3/l;

    iget-boolean v0, p0, Li3/l;->y:Z

    if-nez v0, :cond_3

    iget-object p0, p0, Li3/l;->w:La0/v0;

    iget-object v0, p0, La0/v0;->b:[Ljava/lang/Object;

    iget-object v2, p0, La0/v0;->c:[Ljava/lang/Object;

    iget-object p0, p0, La0/v0;->a:[J

    array-length v3, p0

    add-int/lit8 v3, v3, -0x2

    if-ltz v3, :cond_4

    move v4, v1

    :goto_0
    aget-wide v5, p0, v4

    not-long v7, v5

    const/4 v9, 0x7

    shl-long/2addr v7, v9

    and-long/2addr v7, v5

    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v7, v9

    cmp-long v7, v7, v9

    if-eqz v7, :cond_2

    sub-int v7, v4, v3

    not-int v7, v7

    ushr-int/lit8 v7, v7, 0x1f

    const/16 v8, 0x8

    rsub-int/lit8 v7, v7, 0x8

    move v9, v1

    :goto_1
    if-ge v9, v7, :cond_1

    const-wide/16 v10, 0xff

    and-long/2addr v10, v5

    const-wide/16 v12, 0x80

    cmp-long v10, v10, v12

    if-gez v10, :cond_0

    shl-int/lit8 v10, v4, 0x3

    add-int/2addr v10, v9

    aget-object v11, v0, v10

    aget-object v10, v2, v10

    check-cast v11, Li3/y;

    iget-boolean v10, v11, Li3/y;->c:Z

    if-eqz v10, :cond_0

    goto :goto_2

    :cond_0
    shr-long/2addr v5, v8

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_1
    if-ne v7, v8, :cond_4

    :cond_2
    if-eq v4, v3, :cond_4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    const/4 p0, 0x1

    return p0

    :cond_4
    return v1
.end method
