.class public abstract Lsl0/r2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsl0/r2$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\'\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lnl0/m;",
        "state",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "d",
        "(Lnl0/m;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "bot_release"
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
.method public static synthetic a(Lnl0/m;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lsl0/r2;->g(Lnl0/m;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/r2;->f(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lsl0/r2;->e()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final d(Lnl0/m;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 40
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnl0/m;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p2

    check-cast v11, Lp1/q;

    const v0, 0x671698ef

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v2, 0x4

    const/4 v3, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {v11, v0}, Lp1/q;->e(I)Z

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
    move-object/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_2

    move-object/from16 v5, p1

    invoke-virtual {v11, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :goto_3
    and-int/lit8 v6, v0, 0x13

    const/16 v12, 0x12

    const/4 v14, 0x1

    if-eq v6, v12, :cond_5

    move v6, v14

    goto :goto_4

    :cond_5
    const/4 v6, 0x0

    :goto_4
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v11, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_17

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_7

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v15, :cond_6

    new-instance v4, Lsl0/a1;

    const/16 v5, 0xd

    invoke-direct {v4, v5}, Lsl0/a1;-><init>(I)V

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v4, Lc93/a;

    goto :goto_5

    :cond_7
    move-object v4, v5

    :goto_5
    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v11, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    sget-object v8, Lsl0/r2$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v9, v8, v9

    if-eq v9, v14, :cond_8

    if-eq v9, v3, :cond_8

    invoke-virtual {v7}, Ly81/i;->W0()J

    move-result-wide v16

    :goto_6
    move/from16 p2, v12

    move-wide/from16 v12, v16

    goto :goto_7

    :cond_8
    invoke-virtual {v7}, Ly81/i;->g()J

    move-result-wide v16

    goto :goto_6

    :goto_7
    invoke-virtual {v5, v11, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v9, v8, v9

    if-eq v9, v14, :cond_9

    if-eq v9, v3, :cond_9

    invoke-virtual {v7}, Ly81/i;->b1()J

    move-result-wide v16

    goto :goto_8

    :cond_9
    invoke-virtual {v7}, Ly81/i;->f()J

    move-result-wide v16

    :goto_8
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v7, v8, v7

    if-ne v7, v14, :cond_a

    sget v7, Lwk0/b;->y:I

    goto :goto_9

    :cond_a
    sget v7, Lwk0/b;->q0:I

    :goto_9
    invoke-virtual {v5, v11, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v19

    aget v8, v8, v19

    if-eq v8, v14, :cond_b

    if-eq v8, v3, :cond_b

    invoke-virtual {v9}, Ly81/i;->b1()J

    move-result-wide v8

    :goto_a
    move-wide/from16 v19, v8

    goto :goto_b

    :cond_b
    invoke-virtual {v9}, Ly81/i;->f()J

    move-result-wide v8

    goto :goto_a

    :goto_b
    const-wide/high16 v8, 0x3ff8000000000000L    # 1.5

    double-to-float v8, v8

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float/2addr v8, v9

    int-to-float v10, v14

    mul-float v14, v10, v9

    move/from16 v23, v9

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v8, v14, v8, v14}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move/from16 v28, v0

    sget-object v0, Lb2/e;->K:Lb2/l;

    int-to-float v3, v3

    int-to-float v2, v2

    move-object/from16 p1, v4

    const/16 v4, 0x36

    invoke-static {v3, v2, v0, v11, v4}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v0

    iget-wide v3, v11, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v11, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v24, La3/l;->a:La3/k;

    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v24, v2

    sget-object v2, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    move-object/from16 v25, v5

    iget-boolean v5, v11, Lp1/q;->S:Z

    if-eqz v5, :cond_c

    invoke-virtual {v11, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_c
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_c
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v11, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v11, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    move/from16 v26, v6

    iget-boolean v6, v11, Lp1/q;->S:Z

    if-nez v6, :cond_d

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    move/from16 v27, v7

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_e

    goto :goto_d

    :cond_d
    move/from16 v27, v7

    :goto_d
    invoke-static {v3, v11, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v11, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    mul-float v10, v10, v24

    invoke-static {v10}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    invoke-static {v9, v6}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Li2/w0;->a:Li2/v0;

    invoke-static {v6, v12, v13, v7}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v7, 0x6

    int-to-float v8, v7

    mul-float v8, v8, v24

    invoke-static {v8, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, Lb2/e;->E:Lb2/m;

    const/4 v10, 0x0

    invoke-static {v8, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v11, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v13, v11, Lp1/q;->S:Z

    if-eqz v13, :cond_f

    invoke-virtual {v11, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_f
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v11, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v0, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v11, Lp1/q;->S:Z

    if-nez v0, :cond_10

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    :cond_10
    invoke-static {v10, v11, v10, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    invoke-static {v11, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {v25 .. v25}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/k0;->g()I

    move-result v0

    invoke-static {v0, v11, v7}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v2

    const/4 v0, 0x3

    int-to-float v0, v0

    mul-float v0, v0, v24

    invoke-static {v0, v9}, Landroidx/compose/foundation/layout/d;->l(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v8, 0x1b0

    move-object v0, v9

    const/4 v9, 0x0

    const/4 v3, 0x0

    move-object v13, v0

    move-object v7, v11

    move-wide/from16 v5, v16

    move-object/from16 v10, v25

    move/from16 v11, v26

    move/from16 v12, v27

    move-object/from16 v0, p1

    invoke-static/range {v2 .. v9}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v2, 0x1

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    const/4 v2, 0x0

    invoke-static {v12, v7, v2}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    double-to-float v4, v4

    mul-float v4, v4, v23

    invoke-static {v13, v14, v14, v4, v14}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/high16 v5, 0x3f800000    # 1.0f

    float-to-double v8, v5

    const-wide/16 v12, 0x0

    cmpl-double v6, v8, v12

    if-lez v6, :cond_12

    :goto_f
    const/4 v6, 0x1

    goto :goto_10

    :cond_12
    const-string v6, "invalid weight; must be greater than zero"

    invoke-static {v6}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_f

    :goto_10
    invoke-static {v4, v6, v5}, Ldc/b;->g(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    new-instance v14, Lw3/k;

    const/4 v5, 0x5

    invoke-direct {v14, v5}, Lw3/k;-><init>(I)V

    invoke-virtual {v10, v7, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->c()Lb91/a;

    move-result-object v22

    sget v5, Lb91/a;->d:I

    shl-int/lit8 v26, v5, 0x12

    const v27, 0x2fdf8

    move v5, v6

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v25, v10

    const/4 v10, 0x0

    move v13, v11

    const-wide/16 v11, 0x0

    move/from16 v16, v13

    const/4 v13, 0x0

    move-object/from16 v18, v15

    move/from16 v17, v16

    const-wide/16 v15, 0x0

    move/from16 v23, v17

    const/16 v17, 0x0

    move-object/from16 v29, v18

    const/16 v18, 0x0

    move/from16 v30, v5

    move-wide/from16 v38, v19

    move/from16 v20, v2

    move-object v2, v3

    move-object v3, v4

    move-wide/from16 v4, v38

    const/16 v19, 0x0

    move/from16 v31, v20

    const/16 v20, 0x0

    const/16 v32, 0x20

    const/16 v21, 0x0

    move/from16 v33, v23

    const/16 v23, 0x0

    move-object/from16 v34, v25

    const/16 v25, 0x0

    move-object/from16 p1, v0

    move-object/from16 v37, v29

    move/from16 v0, v31

    move/from16 v36, v33

    move-object/from16 v35, v34

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    sget-object v2, Lnl0/m;->MESSAGE_ERROR:Lnl0/m;

    if-ne v1, v2, :cond_16

    const v2, 0x64838203

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    sget-object v3, Lny0/v;->TextSmall:Lny0/v;

    sget v2, Lwk0/b;->x0:I

    invoke-static {v2, v7, v0}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v10, v35

    move/from16 v11, v36

    invoke-virtual {v10, v7, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->X()J

    move-result-wide v5

    and-int/lit8 v2, v28, 0x70

    const/16 v8, 0x20

    if-ne v2, v8, :cond_13

    const/4 v13, 0x1

    goto :goto_11

    :cond_13
    move v13, v0

    :goto_11
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v13, :cond_15

    move-object/from16 v8, v37

    if-ne v2, v8, :cond_14

    goto :goto_12

    :cond_14
    move-object/from16 v14, p1

    goto :goto_13

    :cond_15
    :goto_12
    new-instance v2, Lsl0/a;

    const/16 v8, 0xd

    move-object/from16 v14, p1

    invoke-direct {v2, v14, v8}, Lsl0/a;-><init>(Lc93/a;I)V

    invoke-virtual {v7, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_13
    move-object v10, v2

    check-cast v10, Lc93/a;

    const/16 v12, 0x30

    const/16 v13, 0x69

    const/4 v2, 0x0

    move-object/from16 v24, v7

    move-wide v6, v5

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v11, v24

    invoke-static/range {v2 .. v13}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v11

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    :goto_14
    const/4 v2, 0x1

    goto :goto_15

    :cond_16
    move-object/from16 v14, p1

    const v2, 0x64869dd7

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto :goto_14

    :goto_15
    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    move-object v3, v14

    goto :goto_16

    :cond_17
    move-object v7, v11

    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v3, v5

    :goto_16
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_18

    new-instance v0, Lqk2/i;

    const/16 v5, 0x15

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lqk2/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final e()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lnl0/m;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lsl0/r2;->d(Lnl0/m;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
