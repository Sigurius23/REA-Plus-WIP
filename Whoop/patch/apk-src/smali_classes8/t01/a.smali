.class public abstract Lt01/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt01/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a1\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lt01/k;",
        "state",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "b",
        "(Lt01/k;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lt01/k;Lc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lt01/a;->c(Lt01/k;Lc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lt01/k;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt01/k;",
            "Lc93/a;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v0, p4

    sget-object v8, Lb2/e;->K:Lb2/l;

    const-string v3, "state"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    const v3, -0x2e28be04

    invoke-virtual {v14, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v0, 0x6

    const/4 v4, 0x4

    const/4 v5, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    or-int/2addr v3, v0

    goto :goto_1

    :cond_1
    move v3, v0

    :goto_1
    and-int/lit8 v6, v0, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :cond_3
    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_5

    or-int/lit16 v3, v3, 0x180

    :cond_4
    move-object/from16 v7, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v7, v0, 0x180

    if-nez v7, :cond_4

    move-object/from16 v7, p2

    invoke-virtual {v14, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x100

    goto :goto_3

    :cond_6
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v3, v9

    :goto_4
    and-int/lit16 v9, v3, 0x93

    const/16 v10, 0x92

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eq v9, v10, :cond_7

    move v9, v11

    goto :goto_5

    :cond_7
    move v9, v12

    :goto_5
    and-int/2addr v3, v11

    invoke-virtual {v14, v3, v9}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_1c

    sget-object v9, Lb2/t;->w:Lb2/t;

    if-eqz v6, :cond_8

    move-object v10, v9

    goto :goto_6

    :cond_8
    move-object v10, v7

    :goto_6
    int-to-float v3, v5

    int-to-float v13, v4

    mul-float/2addr v3, v13

    invoke-static {v3}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    invoke-virtual {v1}, Lt01/k;->c()Lt01/j;

    move-result-object v4

    sget-object v6, Lt01/a$a;->a:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v6, v4

    const/4 v7, 0x3

    const/4 v15, 0x6

    if-eq v4, v11, :cond_b

    if-eq v4, v5, :cond_a

    if-ne v4, v7, :cond_9

    const v4, -0x46f119dd

    invoke-virtual {v14, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-static {v4, v14, v15, v12}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v16

    :goto_7
    move-wide/from16 v35, v16

    goto :goto_8

    :cond_9
    const v0, -0x46f132c9

    invoke-static {v0, v14, v12}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_a
    const v4, -0x46f121bd

    invoke-virtual {v14, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-static {v4, v14, v15, v12}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v16

    goto :goto_7

    :cond_b
    const v4, -0x46f1299a

    invoke-virtual {v14, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-static {v4, v14, v15, v12}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v16

    goto :goto_7

    :goto_8
    invoke-virtual {v1}, Lt01/k;->c()Lt01/j;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v6, v4

    if-eq v4, v11, :cond_e

    if-eq v4, v5, :cond_d

    if-ne v4, v7, :cond_c

    const v4, -0x46f0fb7a

    invoke-virtual {v14, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-static {v4, v14, v15, v12}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v4

    :goto_9
    move-wide/from16 v16, v4

    goto :goto_a

    :cond_c
    const v0, -0x46f114c3

    invoke-static {v0, v14, v12}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_d
    const v4, -0x46f103ba

    invoke-virtual {v14, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-static {v4, v14, v15, v12}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v4

    goto :goto_9

    :cond_e
    const v4, -0x46f10b9a

    invoke-virtual {v14, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-static {v4, v14, v15, v12}, Ldc/b;->e(Lx81/d;Lp1/q;IZ)J

    move-result-wide v4

    goto :goto_9

    :goto_a
    invoke-static {v10, v3}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Li2/w0;->a:Li2/v0;

    move-wide/from16 v5, v35

    invoke-static {v3, v5, v6, v4}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v1}, Lt01/k;->e()Z

    move-result v4

    if-eqz v4, :cond_f

    if-eqz v2, :cond_f

    const/4 v5, 0x0

    const/16 v7, 0xf

    move-object v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v6, p1

    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-string v3, "CollapsibleRowEndItem"

    invoke-static {v2, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    goto :goto_b

    :cond_f
    move-object v2, v3

    move-object v3, v2

    :goto_b
    const-wide/high16 v4, 0x3ff8000000000000L    # 1.5

    double-to-float v2, v4

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v2, v4

    int-to-float v5, v11

    mul-float/2addr v5, v4

    invoke-static {v3, v2, v5}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v1}, Lt01/k;->f()Z

    move-result v3

    if-eqz v3, :cond_14

    const v3, 0x68d85e0b

    invoke-virtual {v14, v3}, Lp1/q;->e0(I)V

    invoke-static {v5}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    const/16 v4, 0x36

    invoke-static {v3, v8, v14, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v4, v14, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v14, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v7, v14, Lp1/q;->S:Z

    if-eqz v7, :cond_10

    invoke-virtual {v14, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_10
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_c
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v14, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v14, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v14, Lp1/q;->S:Z

    if-nez v5, :cond_11

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_12

    :cond_11
    invoke-static {v4, v14, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v14, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lt01/k;->b()Lgz0/m0;

    move-result-object v2

    if-nez v2, :cond_13

    const v2, 0x65a6777e

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    move-object v7, v10

    move v3, v11

    move v5, v12

    move v4, v15

    move-wide/from16 v11, v16

    goto :goto_d

    :cond_13
    const v3, 0x65a6777f

    invoke-virtual {v14, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    invoke-static {v2, v14, v12}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v2

    mul-float/2addr v13, v13

    invoke-static {v13, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move v4, v15

    const/16 v15, 0x1b0

    move v5, v12

    move-wide/from16 v12, v16

    const/16 v16, 0x0

    move-object v7, v10

    const/4 v10, 0x0

    move v9, v11

    move-object v11, v3

    move v3, v9

    move-object v9, v2

    invoke-static/range {v9 .. v16}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-wide v11, v12

    invoke-virtual {v14, v5}, Lp1/q;->q(Z)V

    :goto_d
    invoke-virtual {v1}, Lt01/k;->a()Ljava/lang/String;

    move-result-object v9

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2, v14, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->M()Lb91/a;

    move-result-object v29

    const/16 v33, 0x0

    const v34, 0x2fffa

    const/4 v10, 0x0

    move-object/from16 v31, v14

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    invoke-static/range {v9 .. v34}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v31

    invoke-virtual {v14, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v14, v5}, Lp1/q;->q(Z)V

    goto/16 :goto_12

    :cond_14
    move-object v7, v10

    move v3, v11

    move v5, v12

    move v4, v15

    move-wide/from16 v11, v16

    const v6, 0x68e2c105

    invoke-virtual {v14, v6}, Lp1/q;->e0(I)V

    sget-object v6, Ll0/m;->a:Ll0/e;

    const/16 v10, 0x30

    invoke-static {v6, v8, v14, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v3, v14, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v14, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v15, v14, Lp1/q;->S:Z

    if-eqz v15, :cond_15

    invoke-virtual {v14, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_15
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_e
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v14, v15, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v14, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v5, v14, Lp1/q;->S:Z

    if-nez v5, :cond_16

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_17

    :cond_16
    invoke-static {v3, v14, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v14, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lt01/k;->d()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1b

    const v2, -0x7c3ac5b4

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lb2/e;->L:Lb2/l;

    const/16 v5, 0x30

    invoke-static {v6, v2, v14, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v5, v14, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v14, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v10, v14, Lp1/q;->S:Z

    if-eqz v10, :cond_18

    invoke-virtual {v14, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_18
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_f
    invoke-static {v14, v15, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v14, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v14, Lp1/q;->S:Z

    if-nez v2, :cond_19

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1a

    :cond_19
    invoke-static {v5, v14, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1a
    invoke-static {v14, v3, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lt01/k;->a()Ljava/lang/String;

    move-result-object v9

    sget-object v2, Lx81/d;->a:Lx81/d;

    const/4 v4, 0x6

    invoke-virtual {v2, v14, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->C()Lb91/a;

    move-result-object v29

    const/16 v33, 0x0

    const v34, 0x2fffa

    const/4 v10, 0x0

    move-object/from16 v31, v14

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    invoke-static/range {v9 .. v34}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v31

    invoke-virtual {v1}, Lt01/k;->d()Ljava/lang/String;

    move-result-object v9

    const/4 v4, 0x6

    invoke-virtual {v2, v14, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->D()Lb91/a;

    move-result-object v29

    const-wide/16 v13, 0x0

    invoke-static/range {v9 .. v34}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v31

    const/4 v3, 0x1

    invoke-virtual {v14, v3}, Lp1/q;->q(Z)V

    const/4 v5, 0x0

    invoke-virtual {v14, v5}, Lp1/q;->q(Z)V

    :goto_10
    const/4 v3, 0x1

    goto :goto_11

    :cond_1b
    const v2, -0x7c32ece1

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lt01/k;->a()Ljava/lang/String;

    move-result-object v9

    sget-object v2, Lx81/d;->a:Lx81/d;

    const/4 v4, 0x6

    invoke-virtual {v2, v14, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->C()Lb91/a;

    move-result-object v29

    const/16 v33, 0x0

    const v34, 0x2fffa

    const/4 v10, 0x0

    move-object/from16 v31, v14

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    invoke-static/range {v9 .. v34}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v31

    const/4 v5, 0x0

    invoke-virtual {v14, v5}, Lp1/q;->q(Z)V

    goto :goto_10

    :goto_11
    invoke-virtual {v14, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v14, v5}, Lp1/q;->q(Z)V

    :goto_12
    move-object v3, v7

    goto :goto_13

    :cond_1c
    invoke-virtual {v14}, Lp1/q;->X()V

    goto :goto_12

    :goto_13
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1d

    new-instance v0, Ls51/b;

    const/16 v6, 0x1d

    move-object/from16 v2, p1

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Ls51/b;-><init>(Ljava/lang/Object;Ll83/e;Landroidx/compose/ui/Modifier;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1d
    return-void
.end method

.method private static final c(Lt01/k;Lc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lt01/a;->b(Lt01/k;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
