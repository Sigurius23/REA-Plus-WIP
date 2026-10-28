.class public abstract Lp0/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Lp0/t;

.field public static final b:Lm3/g;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Lp0/t;

    sput-object v0, Lp0/y;->a:[Lp0/t;

    new-instance v0, Lm3/g;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lm3/g;-><init>(I)V

    sput-object v0, Lp0/y;->b:Lm3/g;

    return-void
.end method

.method public static final c(Lc93/a;Landroidx/compose/ui/Modifier;Lp0/l0;Lp0/c0;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    check-cast p4, Lp1/q;

    const v0, 0x3ee63d6d

    invoke-virtual {p4, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p5

    invoke-virtual {p4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x20

    goto :goto_1

    :cond_1
    const/16 v1, 0x10

    :goto_1
    or-int/2addr v0, v1

    invoke-virtual {p4, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x100

    goto :goto_2

    :cond_2
    const/16 v1, 0x80

    :goto_2
    or-int/2addr v0, v1

    invoke-virtual {p4, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x800

    goto :goto_3

    :cond_3
    const/16 v1, 0x400

    :goto_3
    or-int/2addr v0, v1

    and-int/lit16 v1, v0, 0x493

    const/16 v2, 0x492

    const/4 v3, 0x1

    if-eq v1, v2, :cond_4

    move v1, v3

    goto :goto_4

    :cond_4
    const/4 v1, 0x0

    :goto_4
    and-int/2addr v0, v3

    invoke-virtual {p4, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p0, p4}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v0

    new-instance v1, Landroidx/compose/foundation/lazy/layout/c;

    invoke-direct {v1, p2, p1, p3, v0}, Landroidx/compose/foundation/lazy/layout/c;-><init>(Lp0/l0;Landroidx/compose/ui/Modifier;Lp0/c0;Lp1/c1;)V

    const v0, -0x379ecb6b

    invoke-static {v0, p4, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, p4, v1}, Lp0/y;->e(Lx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p4}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {p4}, Lp1/q;->u()Lp1/v1;

    move-result-object p4

    if-eqz p4, :cond_6

    new-instance v0, Lo71/b;

    const/4 v6, 0x1

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lo71/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p4, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static final d(Ljava/lang/Object;ILp0/h0;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v4, p0

    move/from16 v1, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move/from16 v2, p5

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v3, 0x340208e3

    invoke-virtual {v0, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v7, v2, 0x30

    if-nez v7, :cond_3

    invoke-virtual {v0, v1}, Lp1/q;->e(I)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v3, v7

    :cond_3
    and-int/lit16 v7, v2, 0x180

    if-nez v7, :cond_5

    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v3, v7

    :cond_5
    and-int/lit16 v7, v2, 0xc00

    if-nez v7, :cond_7

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_4

    :cond_6
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v3, v7

    :cond_7
    and-int/lit16 v7, v3, 0x493

    const/16 v8, 0x492

    if-eq v7, v8, :cond_8

    const/4 v7, 0x1

    goto :goto_5

    :cond_8
    const/4 v7, 0x0

    :goto_5
    and-int/lit8 v8, v3, 0x1

    invoke-virtual {v0, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_11

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-nez v7, :cond_9

    if-ne v8, v9, :cond_a

    :cond_9
    new-instance v8, Lp0/g0;

    invoke-direct {v8, v4, v5}, Lp0/g0;-><init>(Ljava/lang/Object;Lp0/h0;)V

    invoke-virtual {v0, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v8, Lp0/g0;

    iput v1, v8, Lp0/g0;->c:I

    iget-object v7, v8, Lp0/g0;->g:Lp1/k1;

    sget-object v10, Ly2/h1;->a:Lp1/b0;

    invoke-virtual {v0, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lp0/g0;

    invoke-static {}, Lyl/a;->c()Lz1/f;

    move-result-object v12

    if-eqz v12, :cond_b

    invoke-virtual {v12}, Lz1/f;->e()Lkotlin/jvm/functions/Function1;

    move-result-object v14

    goto :goto_6

    :cond_b
    const/4 v14, 0x0

    :goto_6
    invoke-static {v12}, Lyl/a;->e(Lz1/f;)Lz1/f;

    move-result-object v15

    :try_start_0
    invoke-virtual {v7}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v13, v16

    check-cast v13, Lp0/g0;

    if-eq v11, v13, :cond_e

    invoke-virtual {v7, v11}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget v7, v8, Lp0/g0;->d:I

    if-lez v7, :cond_e

    iget-object v7, v8, Lp0/g0;->e:Lp0/g0;

    if-eqz v7, :cond_c

    invoke-virtual {v7}, Lp0/g0;->b()V

    goto :goto_7

    :catchall_0
    move-exception v0

    goto :goto_9

    :cond_c
    :goto_7
    if-eqz v11, :cond_d

    invoke-virtual {v11}, Lp0/g0;->a()Lp0/g0;

    goto :goto_8

    :cond_d
    const/4 v11, 0x0

    :goto_8
    iput-object v11, v8, Lp0/g0;->e:Lp0/g0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_e
    invoke-static {v12, v15, v14}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v7, :cond_f

    if-ne v11, v9, :cond_10

    :cond_f
    new-instance v11, Lno0/e0;

    const/16 v7, 0x15

    invoke-direct {v11, v8, v7}, Lno0/e0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v11, Lkotlin/jvm/functions/Function1;

    invoke-static {v8, v11, v0}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {v10, v8}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v7

    shr-int/lit8 v3, v3, 0x6

    and-int/lit8 v3, v3, 0x70

    const/16 v8, 0x8

    or-int/2addr v3, v8

    invoke-static {v7, v6, v0, v3}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_a

    :goto_9
    invoke-static {v12, v15, v14}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    throw v0

    :cond_11
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_12

    new-instance v0, Lot1/f;

    const/4 v3, 0x7

    invoke-direct/range {v0 .. v6}, Lot1/f;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method public static final e(Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 9

    check-cast p1, Lp1/q;

    const v0, -0x2a4a252b

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p2, 0x1

    invoke-virtual {p1, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Ly1/h;->a:Lp1/u2;

    invoke-virtual {p1, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly1/f;

    invoke-static {p1}, Ly1/k;->g(Landroidx/compose/runtime/Composer;)Ly1/d;

    move-result-object v3

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v4

    new-instance v5, Lp0/w0;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, Lp0/w0;-><init>(I)V

    new-instance v6, Lnq0/m;

    const/16 v7, 0x10

    invoke-direct {v6, v7, v1, v3}, Lnq0/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v7, Lp0/n0;

    const/16 v8, 0xa

    invoke-direct {v7, v8, v5, v6}, Lp0/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {p1, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_1

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v6, v5, :cond_2

    :cond_1
    new-instance v6, Lox0/b;

    const/4 v5, 0x6

    invoke-direct {v6, v5, v1, v3}, Lox0/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v6, Lc93/a;

    invoke-static {v4, v7, v6, p1, v2}, Ly1/k;->d([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp0/x0;

    invoke-virtual {v0, v1}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    new-instance v2, Lb30/w2;

    const/16 v3, 0x1a

    invoke-direct {v2, v3, p0, v1}, Lb30/w2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v1, -0x189b31eb

    invoke-static {v1, p1, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p1, v2}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance v0, Lf1/z;

    const/4 v1, 0x4

    invoke-direct {v0, p0, p2, v1}, Lf1/z;-><init>(Lx1/b;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method public static final f(Lp0/b0;Ljava/lang/Object;ILjava/lang/Object;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    check-cast p4, Lp1/q;

    const v0, 0x55d242fd

    invoke-virtual {p4, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p5

    invoke-virtual {p4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x20

    goto :goto_1

    :cond_1
    const/16 v1, 0x10

    :goto_1
    or-int/2addr v0, v1

    invoke-virtual {p4, p2}, Lp1/q;->e(I)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x100

    goto :goto_2

    :cond_2
    const/16 v1, 0x80

    :goto_2
    or-int/2addr v0, v1

    invoke-virtual {p4, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x800

    goto :goto_3

    :cond_3
    const/16 v1, 0x400

    :goto_3
    or-int/2addr v0, v1

    and-int/lit16 v1, v0, 0x493

    const/16 v2, 0x492

    const/4 v3, 0x1

    if-eq v1, v2, :cond_4

    move v1, v3

    goto :goto_4

    :cond_4
    const/4 v1, 0x0

    :goto_4
    and-int/2addr v0, v3

    invoke-virtual {p4, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Ly1/c;

    new-instance v1, Ll1/y0;

    invoke-direct {v1, p2, p3, p0}, Ll1/y0;-><init>(ILjava/lang/Object;Lp0/b0;)V

    const v2, 0x3a785bde

    invoke-static {v2, p4, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x30

    invoke-interface {v0, p3, v1, p4, v2}, Ly1/c;->c(Ljava/lang/Object;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p4}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {p4}, Lp1/q;->u()Lp1/v1;

    move-result-object p4

    if-eqz p4, :cond_6

    new-instance v0, Lnx1/g;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lnx1/g;-><init>(Lp0/b0;Ljava/lang/Object;ILjava/lang/Object;I)V

    iput-object v0, p4, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static final g(ILr1/c;)I
    .locals 5

    iget v0, p1, Lr1/c;->y:I

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    :cond_0
    :goto_0
    if-ge v1, v0, :cond_3

    sub-int v2, v0, v1

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v2, v1

    iget-object v3, p1, Lr1/c;->w:[Ljava/lang/Object;

    aget-object v4, v3, v2

    check-cast v4, Lp0/h;

    iget v4, v4, Lp0/h;->a:I

    if-ne v4, p0, :cond_1

    goto :goto_1

    :cond_1
    if-ge v4, p0, :cond_2

    add-int/lit8 v1, v2, 0x1

    aget-object v3, v3, v1

    check-cast v3, Lp0/h;

    iget v3, v3, Lp0/h;->a:I

    if-ge p0, v3, :cond_0

    :goto_1
    return v2

    :cond_2
    add-int/lit8 v0, v2, -0x1

    goto :goto_0

    :cond_3
    return v1
.end method

.method public static final h(Ljava/lang/Object;)Lp0/j;
    .locals 1

    instance-of v0, p0, Lp0/j;

    if-eqz v0, :cond_0

    check-cast p0, Lp0/j;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final i(Lp0/e1;IILjava/util/ArrayList;La0/f0;IIILkotlin/jvm/functions/Function1;)Ljava/util/List;
    .locals 19

    move/from16 v0, p1

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move/from16 v3, p5

    if-eqz p0, :cond_13

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_13

    iget v4, v2, La0/f0;->b:I

    if-eqz v4, :cond_13

    sub-int v5, p2, v0

    const/4 v6, -0x1

    const/4 v7, 0x0

    if-ltz v5, :cond_3

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v7, v4}, Le93/b;->i0(II)Li93/j;

    move-result-object v4

    iget v5, v4, Li93/h;->w:I

    iget v4, v4, Li93/h;->x:I

    move v8, v6

    if-gt v5, v4, :cond_1

    :goto_0
    invoke-virtual {v2, v5}, La0/f0;->c(I)I

    move-result v9

    if-gt v9, v0, :cond_1

    invoke-virtual {v2, v5}, La0/f0;->c(I)I

    move-result v8

    if-eq v5, v4, :cond_1

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    if-ne v8, v6, :cond_2

    sget-object v0, La0/r;->a:La0/f0;

    goto :goto_2

    :cond_2
    sget-object v0, La0/r;->a:La0/f0;

    new-instance v0, La0/f0;

    const/4 v4, 0x1

    invoke-direct {v0, v4}, La0/f0;-><init>(I)V

    invoke-virtual {v0, v8}, La0/f0;->a(I)V

    goto :goto_2

    :cond_3
    :goto_1
    sget-object v0, La0/r;->a:La0/f0;

    :goto_2
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v8

    invoke-direct {v5, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v8

    move v9, v7

    :goto_3
    if-ge v9, v8, :cond_6

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Lp0/e0;

    invoke-interface {v11}, Lp0/e0;->getIndex()I

    move-result v11

    iget-object v12, v2, La0/f0;->a:[I

    iget v13, v2, La0/f0;->b:I

    move v14, v7

    :goto_4
    if-ge v14, v13, :cond_5

    aget v15, v12, v14

    if-ne v15, v11, :cond_4

    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_4
    add-int/lit8 v14, v14, 0x1

    goto :goto_4

    :cond_5
    :goto_5
    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_6
    iget-object v2, v0, La0/f0;->a:[I

    iget v0, v0, La0/f0;->b:I

    move v8, v7

    :goto_6
    if-ge v8, v0, :cond_12

    aget v9, v2, v8

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move v11, v7

    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_8

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lp0/e0;

    invoke-interface {v12}, Lp0/e0;->getIndex()I

    move-result v12

    if-ne v12, v9, :cond_7

    goto :goto_8

    :cond_7
    add-int/lit8 v11, v11, 0x1

    goto :goto_7

    :cond_8
    move v11, v6

    :goto_8
    if-ne v11, v6, :cond_9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    move-object/from16 v12, p8

    invoke-interface {v12, v10}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lp0/e0;

    goto :goto_9

    :cond_9
    move-object/from16 v12, p8

    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lp0/e0;

    :goto_9
    invoke-interface {v10}, Lp0/e0;->g()I

    move-result v13

    const/16 p0, 0x20

    if-ne v11, v6, :cond_a

    const-wide p1, 0xffffffffL

    const/high16 v11, -0x80000000

    goto :goto_b

    :cond_a
    invoke-interface {v10, v7}, Lp0/e0;->j(I)J

    move-result-wide v17

    invoke-interface {v10}, Lp0/e0;->e()Z

    move-result v11

    if-eqz v11, :cond_b

    const-wide p1, 0xffffffffL

    and-long v14, v17, p1

    :goto_a
    long-to-int v11, v14

    goto :goto_b

    :cond_b
    const-wide p1, 0xffffffffL

    shr-long v14, v17, p0

    goto :goto_a

    :goto_b
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v14

    move v15, v7

    :goto_c
    if-ge v15, v14, :cond_d

    invoke-virtual {v5, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v17, v16

    check-cast v17, Lp0/e0;

    invoke-interface/range {v17 .. v17}, Lp0/e0;->getIndex()I

    move-result v6

    if-eq v6, v9, :cond_c

    goto :goto_d

    :cond_c
    add-int/lit8 v15, v15, 0x1

    const/4 v6, -0x1

    goto :goto_c

    :cond_d
    const/16 v16, 0x0

    :goto_d
    move-object/from16 v6, v16

    check-cast v6, Lp0/e0;

    if-eqz v6, :cond_f

    invoke-interface {v6, v7}, Lp0/e0;->j(I)J

    move-result-wide v14

    invoke-interface {v6}, Lp0/e0;->e()Z

    move-result v6

    if-eqz v6, :cond_e

    and-long v14, v14, p1

    :goto_e
    long-to-int v6, v14

    goto :goto_f

    :cond_e
    shr-long v14, v14, p0

    goto :goto_e

    :goto_f
    const/high16 v9, -0x80000000

    goto :goto_10

    :cond_f
    const/high16 v6, -0x80000000

    goto :goto_f

    :goto_10
    if-ne v11, v9, :cond_10

    neg-int v11, v3

    goto :goto_11

    :cond_10
    neg-int v14, v3

    invoke-static {v14, v11}, Ljava/lang/Math;->max(II)I

    move-result v11

    :goto_11
    if-eq v6, v9, :cond_11

    sub-int/2addr v6, v13

    invoke-static {v11, v6}, Ljava/lang/Math;->min(II)I

    move-result v11

    :cond_11
    invoke-interface {v10}, Lp0/e0;->i()V

    move/from16 v6, p6

    move/from16 v9, p7

    invoke-interface {v10, v11, v7, v6, v9}, Lp0/e0;->a(IIII)V

    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    const/4 v6, -0x1

    goto/16 :goto_6

    :cond_12
    return-object v4

    :cond_13
    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0
.end method

.method public static final j(Lp0/b0;Lp0/h0;Laj/d;)Ljava/util/List;
    .locals 10

    iget-object v0, p2, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, Lr1/c;

    iget v1, v0, Lr1/c;->y:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    if-nez v1, :cond_1

    iget-object v1, p1, Lp0/h0;->w:Lz1/p;

    invoke-virtual {v1}, Lz1/p;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object p0, Lm83/y;->w:Lm83/y;

    return-object p0

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object p2, p2, Laj/d;->w:Ljava/lang/Object;

    check-cast p2, Lr1/c;

    iget p2, p2, Lr1/c;->y:I

    if-eqz p2, :cond_9

    new-instance p2, Li93/j;

    iget v4, v0, Lr1/c;->y:I

    const-string v5, "MutableVector is empty."

    if-eqz v4, :cond_8

    iget-object v6, v0, Lr1/c;->w:[Ljava/lang/Object;

    aget-object v7, v6, v2

    check-cast v7, Lp0/k;

    iget v7, v7, Lp0/k;->a:I

    move v8, v2

    :goto_1
    if-ge v8, v4, :cond_3

    aget-object v9, v6, v8

    check-cast v9, Lp0/k;

    iget v9, v9, Lp0/k;->a:I

    if-ge v9, v7, :cond_2

    move v7, v9

    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_3
    if-ltz v7, :cond_4

    goto :goto_2

    :cond_4
    const-string v4, "negative minIndex"

    invoke-static {v4}, Lk0/a;->a(Ljava/lang/String;)V

    :goto_2
    iget v4, v0, Lr1/c;->y:I

    if-eqz v4, :cond_7

    iget-object v0, v0, Lr1/c;->w:[Ljava/lang/Object;

    aget-object v5, v0, v2

    check-cast v5, Lp0/k;

    iget v5, v5, Lp0/k;->b:I

    move v6, v2

    :goto_3
    if-ge v6, v4, :cond_6

    aget-object v8, v0, v6

    check-cast v8, Lp0/k;

    iget v8, v8, Lp0/k;->b:I

    if-le v8, v5, :cond_5

    move v5, v8

    :cond_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_6
    invoke-interface {p0}, Lp0/b0;->getItemCount()I

    move-result v0

    sub-int/2addr v0, v3

    invoke-static {v5, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-direct {p2, v7, v0, v3}, Li93/h;-><init>(III)V

    goto :goto_4

    :cond_7
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0, v5}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0, v5}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_9
    sget-object p2, Li93/j;->z:Li93/j;

    :goto_4
    iget-object v0, p1, Lp0/h0;->w:Lz1/p;

    invoke-virtual {v0}, Lz1/p;->size()I

    move-result v0

    :goto_5
    if-ge v2, v0, :cond_c

    invoke-virtual {p1, v2}, Lp0/h0;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp0/g0;

    iget-object v4, v3, Lp0/g0;->a:Ljava/lang/Object;

    iget v3, v3, Lp0/g0;->c:I

    invoke-static {v3, v4, p0}, Lp0/y;->k(ILjava/lang/Object;Lp0/b0;)I

    move-result v3

    iget v4, p2, Li93/h;->w:I

    iget v5, p2, Li93/h;->x:I

    if-gt v3, v5, :cond_a

    if-gt v4, v3, :cond_a

    goto :goto_6

    :cond_a
    if-ltz v3, :cond_b

    invoke-interface {p0}, Lp0/b0;->getItemCount()I

    move-result v4

    if-ge v3, v4, :cond_b

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b
    :goto_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_c
    iget p0, p2, Li93/h;->w:I

    iget p1, p2, Li93/h;->x:I

    if-gt p0, p1, :cond_d

    :goto_7
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eq p0, p1, :cond_d

    add-int/lit8 p0, p0, 0x1

    goto :goto_7

    :cond_d
    return-object v1
.end method

.method public static final k(ILjava/lang/Object;Lp0/b0;)I
    .locals 1

    if-eqz p1, :cond_2

    invoke-interface {p2}, Lp0/b0;->getItemCount()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Lp0/b0;->getItemCount()I

    move-result v0

    if-ge p0, v0, :cond_1

    invoke-interface {p2, p0}, Lp0/b0;->c(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p2, p1}, Lp0/b0;->b(Ljava/lang/Object;)I

    move-result p1

    const/4 p2, -0x1

    if-eq p1, p2, :cond_2

    return p1

    :cond_2
    :goto_0
    return p0
.end method

.method public static o()V
    .locals 1

    sget v0, Lp0/t;->t:I

    return-void
.end method

.method public static final p(IILjava/util/ArrayList;Ljava/util/List;)Ljava/util/List;
    .locals 4

    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lm83/y;->w:Lm83/y;

    return-object p0

    :cond_0
    check-cast p3, Ljava/util/Collection;

    invoke-static {p3}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p3

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp0/e0;

    invoke-interface {v2}, Lp0/e0;->getIndex()I

    move-result v3

    if-gt p0, v3, :cond_1

    if-gt v3, p1, :cond_1

    invoke-virtual {p3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    sget-object p0, Lp0/y;->b:Lm3/g;

    invoke-static {p3, p0}, Lm83/w;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    return-object p3
.end method


# virtual methods
.method public l(I)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lp0/y;->m()Lab/h0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lab/h0;->m(I)Lp0/h;

    move-result-object v0

    iget v1, v0, Lp0/h;->a:I

    sub-int/2addr p1, v1

    iget-object v0, v0, Lp0/h;->c:Lp0/q;

    invoke-interface {v0}, Lp0/q;->getType()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract m()Lab/h0;
.end method

.method public n(I)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lp0/y;->m()Lab/h0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lab/h0;->m(I)Lp0/h;

    move-result-object v0

    iget v1, v0, Lp0/h;->a:I

    sub-int v1, p1, v1

    iget-object v0, v0, Lp0/h;->c:Lp0/q;

    invoke-interface {v0}, Lp0/q;->getKey()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    new-instance v0, Lp0/f;

    invoke-direct {v0, p1}, Lp0/f;-><init>(I)V

    return-object v0
.end method
