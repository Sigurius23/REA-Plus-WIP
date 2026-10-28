.class public abstract Lq62/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aI\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lm62/e;",
        "viewState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "Lm62/j;",
        "Ll83/a0;",
        "onViewEvent",
        "Lh62/a;",
        "onAnalyticsEvent",
        "c",
        "(Lm62/e;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "refer-a-friend_release"
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
.method public static synthetic a(Lm62/e;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lq62/a;->e(Lm62/e;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lm62/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lq62/a;->d(Lm62/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lm62/e;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 63
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm62/e;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onAnalyticsEvent"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    const v0, 0x56b5e8a0    # 1.0000536E14f

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v7, p6, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v8, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v5, 0x30

    if-nez v8, :cond_2

    move-object/from16 v8, p1

    invoke-virtual {v11, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x20

    goto :goto_2

    :cond_4
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v0, v9

    :goto_3
    and-int/lit16 v9, v5, 0x180

    if-nez v9, :cond_6

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    const/16 v9, 0x100

    goto :goto_4

    :cond_5
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v0, v9

    :cond_6
    and-int/lit16 v9, v5, 0xc00

    if-nez v9, :cond_8

    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x800

    goto :goto_5

    :cond_7
    const/16 v9, 0x400

    :goto_5
    or-int/2addr v0, v9

    :cond_8
    and-int/lit16 v9, v0, 0x493

    const/16 v13, 0x492

    const/4 v14, 0x0

    if-eq v9, v13, :cond_9

    const/4 v9, 0x1

    goto :goto_6

    :cond_9
    move v9, v14

    :goto_6
    and-int/lit8 v13, v0, 0x1

    invoke-virtual {v11, v13, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_1b

    sget-object v16, Lb2/t;->w:Lb2/t;

    if-eqz v7, :cond_a

    move-object/from16 v7, v16

    goto :goto_7

    :cond_a
    move-object v7, v8

    :goto_7
    invoke-static {}, Lgb1/b0;->U()Li2/t;

    move-result-object v8

    int-to-float v9, v2

    mul-float/2addr v9, v9

    invoke-static {v9}, Lt0/j;->e(F)Lt0/i;

    move-result-object v13

    const/4 v10, 0x0

    invoke-static {v7, v8, v13, v10, v2}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v13, Ll0/m;->c:Ll0/g;

    move-object/from16 v22, v7

    sget-object v7, Lb2/e;->M:Lb2/k;

    invoke-static {v13, v7, v11, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    move-object/from16 p1, v13

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v11, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v25, v7

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-eqz v14, :cond_b

    invoke-virtual {v11, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_b
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_8
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v11, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v11, v6, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-nez v15, :cond_c

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v15, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    :cond_c
    invoke-static {v12, v11, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v11, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v8, 0x3

    int-to-float v8, v8

    const/16 v12, 0x8

    int-to-float v12, v12

    mul-float v20, v8, v12

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {}, Lgb1/b0;->E0()Li2/t;

    move-result-object v15

    move/from16 v17, v12

    const/16 v12, 0xc

    invoke-static {v9, v9, v10, v10, v12}, Lt0/j;->g(FFFFI)Lt0/i;

    move-result-object v9

    const/4 v12, 0x4

    invoke-static {v8, v15, v9, v10, v12}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-object/from16 v28, v11

    const-wide/high16 v10, 0x3ff8000000000000L    # 1.5

    double-to-float v10, v10

    mul-float v10, v10, v17

    invoke-static {v10, v8}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v10, Ll0/m;->g:Ll0/h;

    sget-object v11, Lb2/e;->J:Lb2/l;

    const/4 v12, 0x6

    move-object/from16 v15, v28

    invoke-static {v10, v11, v15, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v10

    move-object v11, v13

    iget-wide v12, v15, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v15, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v9, v15, Lp1/q;->S:Z

    if-eqz v9, :cond_e

    invoke-virtual {v15, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_e
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v15, v14, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v6, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v9, v15, Lp1/q;->S:Z

    if-nez v9, :cond_f

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_10

    :cond_f
    invoke-static {v12, v15, v12, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    invoke-static {v15, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lm62/e;->a()Lm62/d;

    move-result-object v8

    invoke-virtual {v8}, Lm62/d;->g()Ljava/lang/String;

    move-result-object v8

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v9, v15, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->s()Lb91/a;

    move-result-object v12

    invoke-virtual {v9, v15, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->w()J

    move-result-wide v28

    sget v13, Lb91/a;->d:I

    shl-int/lit8 v30, v13, 0x12

    const v31, 0x2fffa

    move-object v13, v7

    const/4 v7, 0x0

    move/from16 v32, v10

    move-object/from16 v21, v11

    const-wide/16 v10, 0x0

    move-object/from16 v26, v12

    const/16 v33, 0x0

    const/4 v12, 0x0

    move-object/from16 v34, v13

    const/4 v13, 0x0

    move-object/from16 v35, v14

    const/4 v14, 0x0

    move-object/from16 v36, v9

    move-object/from16 v37, v16

    move-wide/from16 v61, v28

    move-object/from16 v29, v6

    move-object v6, v8

    move-object/from16 v28, v15

    move-wide/from16 v8, v61

    const-wide/16 v15, 0x0

    move/from16 v38, v17

    const/16 v17, 0x0

    const/16 v39, 0xc

    const/16 v18, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x6

    const-wide/16 v19, 0x0

    move-object/from16 v42, v21

    const/16 v21, 0x0

    move-object/from16 v43, v22

    const/16 v22, 0x0

    const/16 v44, 0x2

    const/16 v23, 0x0

    const/16 v45, 0x800

    const/16 v24, 0x0

    move-object/from16 v46, v25

    const/16 v25, 0x0

    const/16 v47, 0x1

    const/16 v27, 0x0

    move-object/from16 v48, v29

    const/16 v29, 0x0

    move-object/from16 v49, p1

    move/from16 v57, v32

    move-object/from16 v51, v34

    move-object/from16 v52, v35

    move-object/from16 v56, v36

    move-object/from16 v58, v37

    move/from16 v55, v38

    move-object/from16 v54, v42

    move-object/from16 v50, v46

    move/from16 v5, v47

    move-object/from16 v53, v48

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v28

    const/high16 v6, 0x3f800000    # 1.0f

    float-to-double v7, v6

    const-wide/16 v9, 0x0

    cmpl-double v7, v7, v9

    if-lez v7, :cond_11

    goto :goto_a

    :cond_11
    const-string v7, "invalid weight; must be greater than zero"

    invoke-static {v7}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_a
    new-instance v7, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v7, v6, v5}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v11, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v1}, Lm62/e;->a()Lm62/d;

    move-result-object v6

    invoke-virtual {v6}, Lm62/d;->c()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_12

    const v6, 0x48a97c3

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    const/4 v6, 0x0

    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    move-object/from16 v59, v56

    move/from16 v60, v57

    goto :goto_b

    :cond_12
    const v7, 0x48a97c4

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    move-object/from16 v7, v56

    move/from16 v8, v57

    invoke-virtual {v7, v11, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->s()Lb91/a;

    move-result-object v26

    invoke-virtual {v7, v11, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->w()J

    move-result-wide v9

    const/16 v29, 0x0

    const v31, 0x2fffa

    const/4 v7, 0x0

    move-wide v8, v9

    move-object/from16 v28, v11

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move-object/from16 v59, v56

    move/from16 v60, v57

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v28

    const/4 v6, 0x0

    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    const/4 v7, 0x2

    int-to-float v8, v7

    move/from16 v38, v55

    mul-float v9, v8, v38

    move-object/from16 v10, v58

    const/4 v12, 0x0

    invoke-static {v10, v9, v12, v7}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v13

    move-object/from16 v14, v49

    move-object/from16 v15, v50

    invoke-static {v14, v15, v11, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v14

    move v6, v8

    iget-wide v7, v11, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v11, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-eqz v15, :cond_13

    move-object/from16 v15, v51

    invoke-virtual {v11, v15}, Lp1/q;->l(Lc93/a;)V

    :goto_c
    move-object/from16 v15, v52

    goto :goto_d

    :cond_13
    invoke-virtual {v11}, Lp1/q;->s0()V

    goto :goto_c

    :goto_d
    invoke-static {v11, v15, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v14, v53

    invoke-static {v11, v14, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-nez v8, :cond_14

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v8, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_15

    :cond_14
    move-object/from16 v8, v54

    invoke-static {v7, v11, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    invoke-static {v11, v2, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lm62/e;->a()Lm62/d;

    move-result-object v2

    invoke-virtual {v2}, Lm62/d;->d()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v7, v59

    move/from16 v8, v60

    invoke-virtual {v7, v11, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->M()Lb91/a;

    move-result-object v26

    invoke-virtual {v7, v11, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->b1()J

    move-result-wide v13

    int-to-float v15, v5

    mul-float v20, v15, v38

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v10

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    new-instance v15, Lw3/k;

    const/4 v5, 0x5

    invoke-direct {v15, v5}, Lw3/k;-><init>(I)V

    const/16 v29, 0x30

    const v31, 0x2fdf8

    move-object/from16 v56, v7

    move-object v7, v10

    move-object/from16 v28, v11

    const-wide/16 v10, 0x0

    move/from16 v40, v12

    const/4 v12, 0x0

    move/from16 v57, v8

    move-wide/from16 v61, v13

    move v14, v9

    move-wide/from16 v8, v61

    const/4 v13, 0x0

    move/from16 v17, v14

    const/4 v14, 0x0

    move-object/from16 v18, v15

    move-object/from16 v58, v16

    const-wide/16 v15, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v21, v19

    const-wide/16 v19, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v24, v22

    const/16 v22, 0x0

    const/16 v44, 0x2

    const/16 v23, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    move/from16 v27, v25

    const/16 v25, 0x0

    move/from16 v32, v27

    const/16 v27, 0x0

    move/from16 v34, v0

    move/from16 v3, v32

    move/from16 v0, v40

    move-object/from16 v5, v56

    move/from16 v1, v57

    move-object/from16 v4, v58

    move/from16 v32, v6

    move-object v6, v2

    move/from16 v2, v38

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v28

    invoke-virtual/range {p0 .. p0}, Lm62/e;->a()Lm62/d;

    move-result-object v6

    invoke-virtual {v6}, Lm62/d;->e()I

    move-result v6

    invoke-virtual/range {p0 .. p0}, Lm62/e;->a()Lm62/d;

    move-result-object v7

    invoke-virtual {v7}, Lm62/d;->f()I

    move-result v7

    const/4 v8, 0x0

    invoke-static {v6, v7, v11, v8}, Lq62/b;->b(IILandroidx/compose/runtime/Composer;I)V

    invoke-virtual/range {p0 .. p0}, Lm62/e;->a()Lm62/d;

    move-result-object v6

    invoke-virtual {v6}, Lm62/d;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v11, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->a()Lb91/a;

    move-result-object v26

    invoke-virtual {v5, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->b1()J

    move-result-wide v9

    const/4 v7, 0x1

    invoke-static {v4, v0, v3, v7}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    new-instance v7, Lw3/k;

    const/4 v12, 0x5

    invoke-direct {v7, v12}, Lw3/k;-><init>(I)V

    move/from16 v33, v8

    move-wide v8, v9

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    move-object/from16 v18, v7

    move-object v7, v4

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v28

    invoke-virtual {v5, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->V0()J

    move-result-wide v7

    sget-object v4, Lb2/e;->N:Lb2/k;

    new-instance v6, Landroidx/compose/foundation/layout/HorizontalAlignElement;

    invoke-direct {v6, v4}, Landroidx/compose/foundation/layout/HorizontalAlignElement;-><init>(Lb2/f;)V

    invoke-virtual {v5, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->Y0()J

    move-result-wide v9

    new-instance v1, Lhy0/h;

    const/4 v4, 0x0

    invoke-direct {v1, v2, v4}, Lhy0/h;-><init>(FLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v6, v9, v10, v1}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v12, 0x180

    const/16 v13, 0x8

    const/4 v10, 0x0

    move/from16 v9, v32

    invoke-static/range {v6 .. v13}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    invoke-virtual/range {p0 .. p0}, Lm62/e;->a()Lm62/d;

    move-result-object v1

    invoke-virtual {v1}, Lm62/d;->b()I

    move-result v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v8

    sget-object v7, Lny0/n0;->TextMedium:Lny0/n0;

    new-instance v10, Ly71/g;

    invoke-static {v5}, Lih0/d0;->E(Lx81/d;)I

    move-result v1

    const/4 v2, 0x2

    invoke-direct {v10, v1, v4, v2, v4}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v1, Lb2/e;->O:Lb2/k;

    new-instance v4, Landroidx/compose/foundation/layout/HorizontalAlignElement;

    invoke-direct {v4, v1}, Landroidx/compose/foundation/layout/HorizontalAlignElement;-><init>(Lb2/f;)V

    invoke-static {v4, v3, v0, v2}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    and-int/lit8 v0, v34, 0xe

    const/4 v12, 0x4

    if-ne v0, v12, :cond_16

    const/4 v14, 0x1

    goto :goto_e

    :cond_16
    move/from16 v14, v33

    :goto_e
    move/from16 v0, v34

    and-int/lit16 v1, v0, 0x380

    const/16 v2, 0x100

    if-ne v1, v2, :cond_17

    const/4 v1, 0x1

    goto :goto_f

    :cond_17
    move/from16 v1, v33

    :goto_f
    or-int/2addr v1, v14

    and-int/lit16 v0, v0, 0x1c00

    const/16 v2, 0x800

    if-ne v0, v2, :cond_18

    const/4 v14, 0x1

    goto :goto_10

    :cond_18
    move/from16 v14, v33

    :goto_10
    or-int v0, v1, v14

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1a

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v1, v0, :cond_19

    goto :goto_11

    :cond_19
    move-object/from16 v2, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    goto :goto_12

    :cond_1a
    :goto_11
    new-instance v1, Lno0/j0;

    const/16 v0, 0x14

    move-object/from16 v2, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    invoke-direct {v1, v2, v3, v4, v0}, Lno0/j0;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v11, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_12
    move-object/from16 v18, v1

    check-cast v18, Lkotlin/jvm/functions/Function1;

    sget v0, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v0, v0, 0x6

    or-int/lit8 v0, v0, 0x30

    sget v1, Ly71/g;->c:I

    shl-int/lit8 v1, v1, 0xc

    or-int v20, v0, v1

    const/16 v21, 0x0

    const/16 v22, 0xfe8

    const/4 v9, 0x0

    move-object/from16 v28, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v19, v28

    invoke-static/range {v6 .. v22}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v19

    const/4 v5, 0x1

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_1b
    move-object v2, v1

    invoke-virtual {v11}, Lp1/q;->X()V

    move-object/from16 v43, v8

    :goto_13
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1c

    new-instance v0, Lo72/a;

    move/from16 v5, p5

    move/from16 v6, p6

    move-object v1, v2

    move-object/from16 v2, v43

    invoke-direct/range {v0 .. v6}, Lo72/a;-><init>(Lm62/e;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1c
    return-void
.end method

.method private static final d(Lm62/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 2

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm62/e;->b()Z

    move-result p0

    const/4 p3, 0x3

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    new-instance p0, Lm62/j$d;

    sget-object v1, Lm62/h;->PROMOTION_REWARD:Lm62/h;

    invoke-direct {p0, v1}, Lm62/j$d;-><init>(Lm62/h;)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lh62/a$l;

    invoke-direct {p0, v0, v0, p3, v0}, Lh62/a$l;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p0, Lm62/j$d;

    sget-object v1, Lm62/h;->PROMOTION_TERMS:Lm62/h;

    invoke-direct {p0, v1}, Lm62/j$d;-><init>(Lm62/h;)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lh62/a$g;

    invoke-direct {p0, v0, v0, p3, v0}, Lh62/a$g;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lm62/e;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lq62/a;->c(Lm62/e;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
