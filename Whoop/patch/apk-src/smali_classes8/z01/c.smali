.class public abstract Lz01/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a1\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lz01/d;",
        "viewState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll83/a0;",
        "f",
        "(Lz01/d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "Lz01/d$a;",
        "cell",
        "",
        "isHeader",
        "isFirstColumn",
        "d",
        "(Lz01/d$a;ZZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lz01/d$a;ZZLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lz01/c;->e(Lz01/d$a;ZZLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lz01/d;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lz01/c;->h(Lz01/d;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lz01/d;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lz01/c;->g(Lz01/d;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lz01/d$a;ZZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 34

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v5, p5

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v0, 0xf5f444d

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    const/4 v4, 0x4

    if-nez v0, :cond_2

    and-int/lit8 v0, v5, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v5

    goto :goto_2

    :cond_2
    move v0, v5

    :goto_2
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v9, v2}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_3

    :cond_3
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v0, v6

    :cond_4
    and-int/lit16 v6, v5, 0x180

    if-nez v6, :cond_6

    invoke-virtual {v9, v3}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x100

    goto :goto_4

    :cond_5
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v0, v6

    :cond_6
    and-int/lit8 v6, p6, 0x8

    if-eqz v6, :cond_8

    or-int/lit16 v0, v0, 0xc00

    :cond_7
    move-object/from16 v7, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v7, v5, 0xc00

    if-nez v7, :cond_7

    move-object/from16 v7, p3

    invoke-virtual {v9, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    const/16 v8, 0x800

    goto :goto_5

    :cond_9
    const/16 v8, 0x400

    :goto_5
    or-int/2addr v0, v8

    :goto_6
    and-int/lit16 v8, v0, 0x493

    const/16 v10, 0x492

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eq v8, v10, :cond_a

    move v8, v11

    goto :goto_7

    :cond_a
    move v8, v12

    :goto_7
    and-int/2addr v0, v11

    invoke-virtual {v9, v0, v8}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_16

    sget-object v0, Lb2/t;->w:Lb2/t;

    if-eqz v6, :cond_b

    move-object v6, v0

    goto :goto_8

    :cond_b
    move-object v6, v7

    :goto_8
    if-eqz v3, :cond_c

    sget-object v7, Lb2/e;->z:Lb2/m;

    goto :goto_9

    :cond_c
    sget-object v7, Lb2/e;->E:Lb2/m;

    :goto_9
    invoke-static {v7, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v13, v9, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v9, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v15, v9, Lp1/q;->S:Z

    if-eqz v15, :cond_d

    invoke-virtual {v9, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_d
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_a
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v9, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v9, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-nez v10, :cond_e

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v10, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_f

    :cond_e
    invoke-static {v8, v9, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v9, v7, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    instance-of v7, v1, Lz01/d$a$a;

    if-eqz v7, :cond_10

    const v4, -0x2e42121d

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    invoke-static {v9, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    move-object/from16 v32, v6

    move v13, v11

    goto/16 :goto_f

    :cond_10
    instance-of v7, v1, Lz01/d$a$f;

    const/4 v8, 0x6

    if-eqz v7, :cond_13

    const v0, 0x66010e2f

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    move-object v0, v1

    check-cast v0, Lz01/d$a$f;

    invoke-interface {v0}, Lz01/d$a$f;->getText()Ljava/lang/String;

    move-result-object v0

    if-eqz v2, :cond_11

    const v4, -0x2e41fbcb

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-virtual {v4, v9, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->s()Lb91/a;

    move-result-object v4

    :goto_b
    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    move-object/from16 v26, v4

    goto :goto_c

    :cond_11
    const v4, -0x2e41f80b

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-virtual {v4, v9, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->c()Lb91/a;

    move-result-object v4

    goto :goto_b

    :goto_c
    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-virtual {v4, v9, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->c1()J

    move-result-wide v7

    if-eqz v3, :cond_12

    const/4 v4, 0x5

    goto :goto_d

    :cond_12
    const/4 v4, 0x3

    :goto_d
    new-instance v10, Lw3/k;

    invoke-direct {v10, v4}, Lw3/k;-><init>(I)V

    const/16 v30, 0x0

    const v31, 0x2fdfa

    move-object/from16 v28, v9

    move-wide v8, v7

    const/4 v7, 0x0

    move-object/from16 v18, v10

    move v4, v11

    const-wide/16 v10, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v14, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    const-wide/16 v15, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v21, v19

    const-wide/16 v19, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    move/from16 v27, v25

    const/16 v25, 0x0

    move/from16 v29, v27

    const/16 v27, 0x0

    move/from16 v32, v29

    const/16 v29, 0x0

    move-object/from16 v33, v6

    move-object v6, v0

    move/from16 v0, v32

    move-object/from16 v32, v33

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v28

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    :goto_e
    move v13, v4

    goto/16 :goto_f

    :cond_13
    move-object/from16 v32, v6

    move/from16 v25, v12

    move v12, v11

    instance-of v6, v1, Lz01/d$a$c;

    if-eqz v6, :cond_14

    const v6, 0x6606a80e

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    move-object v6, v1

    check-cast v6, Lz01/d$a$c;

    invoke-virtual {v6}, Lz01/d$a$c;->a()Lkd1/o;

    move-result-object v6

    const/4 v10, 0x0

    const/4 v11, 0x3

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v6

    const/16 v7, 0xb

    int-to-float v7, v7

    int-to-float v4, v4

    mul-float/2addr v7, v4

    invoke-static {v7, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v14, 0x61b0

    const/16 v15, 0x68

    const/4 v7, 0x0

    move-object/from16 v28, v9

    const/4 v9, 0x0

    sget-object v10, Ly2/j;->b:Ly2/b1;

    const/4 v11, 0x0

    move v4, v12

    const/4 v12, 0x0

    move/from16 v0, v25

    move-object/from16 v13, v28

    invoke-static/range {v6 .. v15}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v13

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_14
    move v13, v12

    move/from16 v14, v25

    instance-of v6, v1, Lz01/d$a$b;

    if-eqz v6, :cond_15

    const v6, 0x660ae6c0

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    move-object v6, v1

    check-cast v6, Lz01/d$a$b;

    invoke-virtual {v6}, Lz01/d$a$b;->a()Lgz0/m0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/m0;->toWhoopIcon()I

    move-result v6

    invoke-static {v6, v9, v14}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v6

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-virtual {v7, v9, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v7

    const/16 v10, 0x9

    int-to-float v10, v10

    int-to-float v4, v4

    mul-float/2addr v10, v4

    invoke-static {v10, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v28, v9

    move-wide v9, v7

    const/4 v7, 0x0

    const/16 v12, 0x1b0

    move-object v8, v0

    move-object/from16 v11, v28

    invoke-static/range {v6 .. v12}, Ll1/r1;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;I)V

    move-object v9, v11

    invoke-virtual {v9, v14}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    move-object/from16 v4, v32

    goto :goto_10

    :cond_15
    const v0, -0x2e42169a

    invoke-static {v0, v9, v14}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_16
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v4, v7

    :goto_10
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_17

    new-instance v0, Lb30/k4;

    const/16 v7, 0x8

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lb30/k4;-><init>(Ljava/lang/Object;ZZLjava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final e(Lz01/d$a;ZZLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lz01/c;->d(Lz01/d$a;ZZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final f(Lz01/d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 20

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p2

    check-cast v5, Lp1/q;

    const v0, 0x1f14812e

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v2, 0x4

    const/4 v3, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v4, p4, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_2

    move-object/from16 v6, p1

    invoke-virtual {v5, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :goto_3
    and-int/lit8 v7, v0, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eq v7, v8, :cond_5

    move v7, v9

    goto :goto_4

    :cond_5
    move v7, v10

    :goto_4
    and-int/2addr v0, v9

    invoke-virtual {v5, v0, v7}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1f

    sget-object v0, Lb2/t;->w:Lb2/t;

    if-eqz v4, :cond_6

    move v4, v2

    move-object v2, v0

    goto :goto_5

    :cond_6
    move v4, v2

    move-object v2, v6

    :goto_5
    invoke-virtual {v1}, Lz01/d;->a()I

    move-result v6

    if-nez v6, :cond_7

    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_20

    new-instance v0, Lz01/b;

    const/4 v5, 0x0

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lz01/b;-><init>(Lz01/d;Landroidx/compose/ui/Modifier;III)V

    :goto_6
    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_7
    move-object v8, v2

    int-to-float v1, v3

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float v11, v1, v2

    invoke-static {v11, v8}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v13, v5, Lp1/q;->S:Z

    if-eqz v13, :cond_8

    invoke-virtual {v5, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_8
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_7
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v5, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v5, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v14, v5, Lp1/q;->S:Z

    if-nez v14, :cond_9

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_a

    :cond_9
    invoke-static {v6, v5, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v5, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lz01/d;->c()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    const-string v14, "invalid weight; must be greater than zero"

    const-wide/16 p1, 0x0

    const/4 v10, 0x6

    if-nez v2, :cond_11

    const v2, -0x3f60e865

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    sget-object v2, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v2, v0}, Landroidx/compose/foundation/layout/b;->b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v11}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    sget-object v9, Lb2/e;->J:Lb2/l;

    invoke-static {v4, v9, v5, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    move v9, v11

    iget-wide v10, v5, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v15, v5, Lp1/q;->S:Z

    if-eqz v15, :cond_b

    invoke-virtual {v5, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_b
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v5, v13, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v3, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v5, Lp1/q;->S:Z

    if-nez v3, :cond_c

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    :cond_c
    invoke-static {v10, v5, v10, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    invoke-static {v5, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, -0x65b3a266

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lz01/d;->a()I

    move-result v2

    const/4 v3, 0x0

    :goto_9
    if-ge v3, v2, :cond_10

    const/high16 v4, 0x3f800000    # 1.0f

    float-to-double v6, v4

    cmpl-double v6, v6, p1

    if-lez v6, :cond_e

    goto :goto_a

    :cond_e
    invoke-static {v14}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_a
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v7, 0x1

    invoke-direct {v6, v4, v7}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v4, 0x4

    int-to-float v7, v4

    invoke-static {v6, v1, v7}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lz01/d;->c()Ljava/util/Set;

    move-result-object v7

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v7, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_f

    const v7, -0x5597b741

    invoke-virtual {v5, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    const/4 v10, 0x6

    invoke-virtual {v7, v5, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->a1()J

    move-result-wide v10

    const/4 v7, 0x0

    invoke-virtual {v5, v7}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_f
    const/4 v7, 0x0

    const v10, -0x55962957

    invoke-virtual {v5, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v7}, Lp1/q;->q(Z)V

    sget-wide v10, Li2/x;->m:J

    :goto_b
    sget-object v12, Li2/w0;->a:Li2/v0;

    invoke-static {v6, v10, v11, v12}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v6, v5, v7}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_9

    :cond_10
    const/4 v3, 0x1

    const/4 v7, 0x0

    invoke-static {v5, v7, v3, v7}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_c

    :cond_11
    move v9, v11

    const/4 v7, 0x0

    const v1, -0x3f53f5b2

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v7}, Lp1/q;->q(Z)V

    :goto_c
    invoke-static {v9}, Ll0/m;->i(F)Ll0/k;

    move-result-object v1

    sget-object v2, Lb2/e;->M:Lb2/k;

    const/4 v10, 0x6

    invoke-static {v1, v2, v5, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v2, v5, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v5, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-eqz v7, :cond_12

    invoke-virtual {v5, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_12
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_d
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v5, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v5, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v3, v5, Lp1/q;->S:Z

    if-nez v3, :cond_13

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_14

    :cond_13
    invoke-static {v2, v5, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v5, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, -0x5d4b8bb5

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lz01/d;->e()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    const/4 v11, 0x0

    :goto_e
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1e

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v12, v11, 0x1

    if-ltz v11, :cond_1d

    move-object v13, v1

    check-cast v13, Lz01/d$b;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v9}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    sget-object v3, Lb2/e;->K:Lb2/l;

    const/16 v4, 0x36

    invoke-static {v2, v3, v5, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v3, v5, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v5, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-eqz v7, :cond_15

    invoke-virtual {v5, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_15
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_f
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v5, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v5, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v5, Lp1/q;->S:Z

    if-nez v4, :cond_16

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_17

    :cond_16
    invoke-static {v3, v5, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v5, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, 0x765476ab

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lz01/d;->a()I

    move-result v15

    const/4 v1, 0x0

    :goto_10
    if-ge v1, v15, :cond_1c

    invoke-virtual {v13}, Lz01/d$b;->a()Ljava/util/List;

    move-result-object v2

    invoke-static {v1, v2}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz01/d$a;

    if-nez v2, :cond_18

    sget-object v2, Lz01/d$a$a;->a:Lz01/d$a$a;

    :cond_18
    invoke-virtual/range {p0 .. p0}, Lz01/d;->b()Z

    move-result v3

    if-eqz v3, :cond_19

    if-nez v11, :cond_19

    const/4 v7, 0x1

    goto :goto_11

    :cond_19
    const/4 v7, 0x0

    :goto_11
    if-nez v1, :cond_1a

    const/4 v3, 0x1

    :goto_12
    move-object/from16 v16, v0

    move v6, v1

    const/high16 v4, 0x3f800000    # 1.0f

    goto :goto_13

    :cond_1a
    const/4 v3, 0x0

    goto :goto_12

    :goto_13
    float-to-double v0, v4

    cmpl-double v0, v0, p1

    if-lez v0, :cond_1b

    goto :goto_14

    :cond_1b
    invoke-static {v14}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_14
    new-instance v0, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v1, 0x1

    invoke-direct {v0, v4, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    move/from16 v17, v6

    const/4 v6, 0x0

    move/from16 v18, v1

    move-object v1, v2

    move v2, v7

    const/4 v7, 0x0

    move/from16 v19, v4

    move-object v4, v0

    move/from16 v0, v18

    invoke-static/range {v1 .. v7}, Lz01/c;->d(Lz01/d$a;ZZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    add-int/lit8 v1, v17, 0x1

    move-object/from16 v0, v16

    goto :goto_10

    :cond_1c
    move-object/from16 v16, v0

    const/4 v0, 0x1

    const/4 v7, 0x0

    const/high16 v19, 0x3f800000    # 1.0f

    invoke-virtual {v5, v7}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    move v11, v12

    move-object/from16 v0, v16

    goto/16 :goto_e

    :cond_1d
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_1e
    const/4 v0, 0x1

    const/4 v7, 0x0

    invoke-static {v5, v7, v0, v0}, Lm4/a;->y(Lp1/q;ZZZ)V

    move-object v2, v8

    goto :goto_15

    :cond_1f
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v2, v6

    :goto_15
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_20

    new-instance v0, Lz01/b;

    const/4 v5, 0x1

    move-object/from16 v1, p0

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lz01/b;-><init>(Lz01/d;Landroidx/compose/ui/Modifier;III)V

    goto/16 :goto_6

    :cond_20
    return-void
.end method

.method private static final g(Lz01/d;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lz01/c;->f(Lz01/d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lz01/d;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lz01/c;->f(Lz01/d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
