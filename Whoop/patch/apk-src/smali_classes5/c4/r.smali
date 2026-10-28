.class public abstract Lc4/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lc4/f;->y:Lc4/f;

    new-instance v1, Lp1/b0;

    invoke-direct {v1, v0}, Lp1/b0;-><init>(Lc93/a;)V

    sput-object v1, Lc4/r;->a:Lp1/b0;

    return-void
.end method

.method public static final a(Lc4/i0;Lc93/a;Lc4/j0;Lx1/b;Landroidx/compose/runtime/Composer;II)V
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v8, p3

    move/from16 v9, p5

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v0, -0x699ff8ef

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v9, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v9

    goto :goto_1

    :cond_1
    move v0, v9

    :goto_1
    and-int/lit8 v2, p6, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v3, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v9, 0x30

    if-nez v3, :cond_2

    move-object/from16 v3, p1

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :goto_3
    and-int/lit16 v4, v9, 0x180

    if-nez v4, :cond_6

    move-object/from16 v4, p2

    invoke-virtual {v10, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x100

    goto :goto_4

    :cond_5
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v0, v5

    goto :goto_5

    :cond_6
    move-object/from16 v4, p2

    :goto_5
    and-int/lit16 v5, v9, 0xc00

    if-nez v5, :cond_8

    invoke-virtual {v10, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    const/16 v5, 0x800

    goto :goto_6

    :cond_7
    const/16 v5, 0x400

    :goto_6
    or-int/2addr v0, v5

    :cond_8
    move v14, v0

    and-int/lit16 v0, v14, 0x493

    const/16 v5, 0x492

    const/4 v15, 0x0

    if-eq v0, v5, :cond_9

    const/4 v0, 0x1

    goto :goto_7

    :cond_9
    move v0, v15

    :goto_7
    and-int/lit8 v5, v14, 0x1

    invoke-virtual {v10, v5, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_21

    if-eqz v2, :cond_a

    const/16 v16, 0x0

    goto :goto_8

    :cond_a
    move-object/from16 v16, v3

    :goto_8
    sget-object v2, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:Lp1/u2;

    invoke-virtual {v10, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    sget-object v3, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v10, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ly3/c;

    sget-object v3, Lc4/r;->a:Lp1/b0;

    invoke-virtual {v10, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v18, v3

    check-cast v18, Ljava/lang/String;

    sget-object v3, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {v10, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v19, v3

    check-cast v19, Ly3/m;

    invoke-static {v10}, Lp1/x;->E(Landroidx/compose/runtime/Composer;)Lp1/o;

    move-result-object v3

    invoke-static {v8, v10}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v7

    new-array v0, v15, [Ljava/lang/Object;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-ne v6, v11, :cond_b

    sget-object v6, Lc4/f;->z:Lc4/f;

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v6, Lc93/a;

    const/16 v15, 0x30

    invoke-static {v0, v6, v10, v15}, Ly1/k;->c([Ljava/lang/Object;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/UUID;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v11, :cond_c

    move-object v15, v7

    move-object v7, v0

    new-instance v0, Lc4/f0;

    move-object v6, v4

    move-object v4, v2

    move-object v2, v6

    move-object v6, v1

    move-object v13, v3

    move-object v12, v15

    move-object/from16 v1, v16

    move-object/from16 v3, v18

    const/4 v15, 0x1

    invoke-direct/range {v0 .. v7}, Lc4/f0;-><init>(Lc93/a;Lc4/j0;Ljava/lang/String;Landroid/view/View;Ly3/c;Lc4/i0;Ljava/util/UUID;)V

    move-object v1, v6

    new-instance v2, Lc4/q;

    const/4 v4, 0x0

    invoke-direct {v2, v4, v0, v12}, Lc4/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Lx1/b;

    const v5, -0x11bbdae4

    invoke-direct {v4, v2, v15, v5}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-virtual {v0, v13, v4}, Lc4/f0;->j(Lp1/t;Lc93/m;)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v6, v0

    goto :goto_9

    :cond_c
    move-object/from16 v3, v18

    const/4 v15, 0x1

    :goto_9
    check-cast v6, Lc4/f0;

    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    and-int/lit8 v2, v14, 0x70

    const/16 v4, 0x20

    if-ne v2, v4, :cond_d

    move v4, v15

    goto :goto_a

    :cond_d
    const/4 v4, 0x0

    :goto_a
    or-int/2addr v0, v4

    and-int/lit16 v4, v14, 0x380

    const/16 v5, 0x100

    if-ne v4, v5, :cond_e

    move v5, v15

    goto :goto_b

    :cond_e
    const/4 v5, 0x0

    :goto_b
    or-int/2addr v0, v5

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v0, v5

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    invoke-virtual {v10, v5}, Lp1/q;->e(I)Z

    move-result v5

    or-int/2addr v0, v5

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_f

    if-ne v5, v11, :cond_10

    :cond_f
    move v0, v14

    goto :goto_c

    :cond_10
    move-object v0, v6

    move-object v6, v3

    move v3, v15

    move-object v15, v0

    move v0, v14

    move-object v14, v5

    const/4 v5, 0x0

    goto :goto_d

    :goto_c
    new-instance v14, Lc4/k;

    const/4 v5, 0x0

    const/16 v20, 0x0

    move-object/from16 v17, p2

    move-object/from16 v18, v3

    move v3, v15

    move-object v15, v6

    invoke-direct/range {v14 .. v20}, Lc4/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v6, v18

    invoke-virtual {v10, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_d
    check-cast v14, Lkotlin/jvm/functions/Function1;

    invoke-static {v15, v14, v10}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {v10, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    const/16 v12, 0x20

    if-ne v2, v12, :cond_11

    move v2, v3

    goto :goto_e

    :cond_11
    move v2, v5

    :goto_e
    or-int/2addr v2, v7

    const/16 v7, 0x100

    if-ne v4, v7, :cond_12

    move v4, v3

    goto :goto_f

    :cond_12
    move v4, v5

    :goto_f
    or-int/2addr v2, v4

    invoke-virtual {v10, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    invoke-virtual {v10, v4}, Lp1/q;->e(I)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_14

    if-ne v4, v11, :cond_13

    goto :goto_10

    :cond_13
    move-object/from16 v2, v19

    goto :goto_11

    :cond_14
    :goto_10
    new-instance v14, Lc4/l;

    const/16 v20, 0x0

    move-object/from16 v17, p2

    move-object/from16 v18, v6

    invoke-direct/range {v14 .. v20}, Lc4/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ly3/m;I)V

    move-object/from16 v2, v19

    invoke-virtual {v10, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v4, v14

    :goto_11
    check-cast v4, Lc93/a;

    invoke-static {v4, v10}, Lp1/x;->k(Lc93/a;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {v10, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    and-int/lit8 v0, v0, 0xe

    const/4 v6, 0x4

    if-ne v0, v6, :cond_15

    move v5, v3

    :cond_15
    or-int v0, v4, v5

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_16

    if-ne v4, v11, :cond_17

    :cond_16
    new-instance v4, Lb2/z;

    const/4 v0, 0x6

    invoke-direct {v4, v0, v15, v1}, Lb2/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v4, v10}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {v10, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_18

    if-ne v4, v11, :cond_19

    :cond_18
    new-instance v4, Le;

    const/16 v0, 0x18

    const/4 v5, 0x0

    invoke-direct {v4, v15, v5, v0}, Le;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v4, Lc93/m;

    invoke-static {v10, v4, v15}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v10, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_1a

    if-ne v4, v11, :cond_1b

    :cond_1a
    new-instance v4, Lc4/n;

    const/4 v0, 0x0

    invoke-direct {v4, v15, v0}, Lc4/n;-><init>(Lc4/f0;I)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v4, Lkotlin/jvm/functions/Function1;

    sget-object v0, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v4}, Landroidx/compose/ui/layout/a;->d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v10, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    invoke-virtual {v10, v5}, Lp1/q;->e(I)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_1c

    if-ne v5, v11, :cond_1d

    :cond_1c
    new-instance v5, Lc4/o;

    const/4 v4, 0x0

    invoke-direct {v5, v4, v15, v2}, Lc4/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v5, Ly2/r0;

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v10, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-eqz v7, :cond_1e

    invoke-virtual {v10, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_1e
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_12
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v10, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v10, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v5, v10, Lp1/q;->S:Z

    if-nez v5, :cond_1f

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_20

    :cond_1f
    invoke-static {v2, v10, v2, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_20
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v10, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    move-object/from16 v2, v16

    goto :goto_13

    :cond_21
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v2, v3

    :goto_13
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_22

    new-instance v0, Lc4/p;

    move-object/from16 v3, p2

    move/from16 v6, p6

    move-object v4, v8

    move v5, v9

    invoke-direct/range {v0 .. v6}, Lc4/p;-><init>(Lc4/i0;Lc93/a;Lc4/j0;Lx1/b;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_22
    return-void
.end method

.method public static final b(Lb2/h;JLc93/a;Lc4/j0;Lx1/b;Landroidx/compose/runtime/Composer;II)V
    .locals 19

    move/from16 v7, p7

    move-object/from16 v4, p6

    check-cast v4, Lp1/q;

    const v0, 0x43b737e

    invoke-virtual {v4, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p8, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v2, v7, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v7, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v4, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v7

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v3, v7

    :goto_1
    and-int/lit8 v5, p8, 0x2

    if-eqz v5, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move-wide/from16 v8, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v8, v7, 0x30

    if-nez v8, :cond_3

    move-wide/from16 v8, p1

    invoke-virtual {v4, v8, v9}, Lp1/q;->f(J)Z

    move-result v10

    if-eqz v10, :cond_5

    const/16 v10, 0x20

    goto :goto_2

    :cond_5
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v3, v10

    :goto_3
    and-int/lit8 v10, p8, 0x4

    if-eqz v10, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move-object/from16 v11, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v11, v7, 0x180

    if-nez v11, :cond_6

    move-object/from16 v11, p3

    invoke-virtual {v4, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    const/16 v12, 0x100

    goto :goto_4

    :cond_8
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v3, v12

    :goto_5
    and-int/lit8 v12, p8, 0x8

    if-eqz v12, :cond_a

    or-int/lit16 v3, v3, 0xc00

    :cond_9
    move-object/from16 v13, p4

    goto :goto_7

    :cond_a
    and-int/lit16 v13, v7, 0xc00

    if-nez v13, :cond_9

    move-object/from16 v13, p4

    invoke-virtual {v4, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_b

    const/16 v14, 0x800

    goto :goto_6

    :cond_b
    const/16 v14, 0x400

    :goto_6
    or-int/2addr v3, v14

    :goto_7
    and-int/lit16 v14, v7, 0x6000

    if-nez v14, :cond_d

    move-object/from16 v14, p5

    invoke-virtual {v4, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_c

    const/16 v15, 0x4000

    goto :goto_8

    :cond_c
    const/16 v15, 0x2000

    :goto_8
    or-int/2addr v3, v15

    goto :goto_9

    :cond_d
    move-object/from16 v14, p5

    :goto_9
    and-int/lit16 v15, v3, 0x2493

    const/16 p6, 0x20

    const/16 v6, 0x2492

    const/4 v1, 0x0

    const/16 v16, 0x1

    if-eq v15, v6, :cond_e

    move/from16 v6, v16

    goto :goto_a

    :cond_e
    move v6, v1

    :goto_a
    and-int/lit8 v15, v3, 0x1

    invoke-virtual {v4, v15, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_17

    if-eqz v0, :cond_f

    sget-object v0, Lb2/e;->w:Lb2/m;

    move-object v15, v0

    goto :goto_b

    :cond_f
    move-object v15, v2

    :goto_b
    if-eqz v5, :cond_10

    int-to-long v5, v1

    shl-long v8, v5, p6

    const-wide v17, 0xffffffffL

    and-long v5, v5, v17

    or-long/2addr v5, v8

    move-wide v8, v5

    :cond_10
    if-eqz v10, :cond_11

    const/4 v0, 0x0

    move-object v11, v0

    :cond_11
    if-eqz v12, :cond_12

    new-instance v0, Lc4/j0;

    const/16 v2, 0xf

    invoke-direct {v0, v1, v2}, Lc4/j0;-><init>(ZI)V

    move-object v2, v0

    goto :goto_c

    :cond_12
    move-object v2, v13

    :goto_c
    and-int/lit8 v0, v3, 0xe

    const/4 v5, 0x4

    if-ne v0, v5, :cond_13

    move/from16 v0, v16

    goto :goto_d

    :cond_13
    move v0, v1

    :goto_d
    and-int/lit8 v5, v3, 0x70

    move/from16 v6, p6

    if-ne v5, v6, :cond_14

    move/from16 v1, v16

    :cond_14
    or-int/2addr v0, v1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_15

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v1, v0, :cond_16

    :cond_15
    new-instance v1, Lc4/a;

    invoke-direct {v1, v15, v8, v9}, Lc4/a;-><init>(Lb2/h;J)V

    invoke-virtual {v4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    move-object v0, v1

    check-cast v0, Lc4/a;

    shr-int/lit8 v1, v3, 0x3

    and-int/lit16 v5, v1, 0x1ff0

    const/4 v6, 0x0

    move-object v1, v11

    move-object v3, v14

    invoke-static/range {v0 .. v6}, Lc4/r;->a(Lc4/i0;Lc93/a;Lc4/j0;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v2

    move-object v0, v4

    move-object v4, v1

    move-object v1, v15

    :goto_e
    move-wide v2, v8

    goto :goto_f

    :cond_17
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object v1, v2

    move-object v0, v4

    move-object v4, v11

    move-object v5, v13

    goto :goto_e

    :goto_f
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_18

    new-instance v0, Lc4/j;

    move-object/from16 v6, p5

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lc4/j;-><init>(Lb2/h;JLc93/a;Lc4/j0;Lx1/b;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method public static final c(Landroid/view/View;)Z
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    instance-of v0, p0, Landroid/view/WindowManager$LayoutParams;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/view/WindowManager$LayoutParams;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    const/4 v0, 0x0

    if-eqz p0, :cond_1

    iget p0, p0, Landroid/view/WindowManager$LayoutParams;->flags:I

    and-int/lit16 p0, p0, 0x2000

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    return v0
.end method
