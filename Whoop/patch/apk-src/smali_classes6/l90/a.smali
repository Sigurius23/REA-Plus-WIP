.class public abstract Ll90/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a1\u0010\u0006\u001a\u00020\u00042\n\u0008\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "",
        "errorMessage",
        "Lkotlin/Function1;",
        "Ll80/o;",
        "Ll83/a0;",
        "onNavigationEvent",
        "e",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "activation_release"
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
.method public static synthetic a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ll90/a;->i(Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Ll90/a;->g()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ll90/a;->h(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ll80/o;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ll90/a;->f(Ll80/o;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 63
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v6, p2

    check-cast v6, Lp1/q;

    const v0, -0x6eb91eee

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v2, p3, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v6, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    move v3, v1

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move/from16 v3, p3

    :goto_1
    and-int/lit8 v4, p4, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move-object/from16 v7, p1

    :goto_2
    move/from16 v26, v3

    goto :goto_4

    :cond_4
    and-int/lit8 v7, p3, 0x30

    if-nez v7, :cond_3

    move-object/from16 v7, p1

    invoke-virtual {v6, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x20

    goto :goto_3

    :cond_5
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v3, v8

    goto :goto_2

    :goto_4
    and-int/lit8 v3, v26, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v3, v8, :cond_6

    move v3, v10

    goto :goto_5

    :cond_6
    move v3, v9

    :goto_5
    and-int/lit8 v11, v26, 0x1

    invoke-virtual {v6, v11, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_18

    if-eqz v0, :cond_7

    const/4 v0, 0x0

    move-object/from16 v27, v0

    goto :goto_6

    :cond_7
    move-object/from16 v27, v2

    :goto_6
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_9

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_8

    new-instance v2, Ll60/a;

    const/16 v3, 0x19

    invoke-direct {v2, v3}, Ll60/a;-><init>(I)V

    invoke-virtual {v6, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v2, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_9
    move-object v2, v7

    :goto_7
    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_a

    new-instance v3, Ll72/f;

    const/4 v4, 0x6

    invoke-direct {v3, v4}, Ll72/f;-><init>(I)V

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v3, Lc93/a;

    const/16 v4, 0x30

    invoke-static {v3, v9, v6, v4, v10}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    const/high16 v3, 0x3f800000    # 1.0f

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v7}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    int-to-float v11, v1

    const/16 v12, 0x8

    int-to-float v12, v12

    mul-float/2addr v11, v12

    const/4 v13, 0x0

    invoke-static {v7, v11, v13, v1}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, Lb2/e;->w:Lb2/m;

    invoke-static {v7, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v13, v6, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v6, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v5, v6, Lp1/q;->S:Z

    if-eqz v5, :cond_b

    invoke-virtual {v6, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_b
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_8
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v6, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v6, v7, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    move/from16 v16, v8

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-nez v8, :cond_c

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_d

    :cond_c
    invoke-static {v13, v6, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v6, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Lb2/e;->E:Lb2/m;

    sget-object v10, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v10, v4, v1}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v13, Ll0/m;->c:Ll0/g;

    move-object/from16 p0, v10

    sget-object v10, Lb2/e;->M:Lb2/k;

    invoke-static {v13, v10, v6, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    move-object/from16 v19, v10

    iget-wide v9, v6, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v6, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v6}, Lp1/q;->i0()V

    move-object/from16 v20, v0

    iget-boolean v0, v6, Lp1/q;->S:Z

    if-eqz v0, :cond_e

    invoke-virtual {v6, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_e
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v6, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v6, Lp1/q;->S:Z

    if-nez v0, :cond_f

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    :cond_f
    invoke-static {v9, v6, v9, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    invoke-static {v6, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget v3, Lx60/b;->J:I

    invoke-static {v6, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v9, v6, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ly81/i;->y()J

    move-result-wide v21

    invoke-virtual {v9, v6, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v23

    invoke-virtual/range {v23 .. v23}, Lb91/d;->Q()Lb91/a;

    move-result-object v23

    move/from16 v24, v12

    new-instance v12, Lw3/k;

    move-object/from16 p1, v4

    const/4 v4, 0x3

    invoke-direct {v12, v4}, Lw3/k;-><init>(I)V

    sget v25, Lb91/a;->d:I

    shl-int/lit8 v16, v25, 0x12

    const v25, 0x2fdf8

    move/from16 v29, v4

    move-object/from16 v28, v5

    const-wide/16 v4, 0x0

    move/from16 v30, v0

    move-object v0, v3

    move-wide/from16 v61, v21

    move-object/from16 v21, v2

    move-object/from16 v22, v6

    move-wide/from16 v2, v61

    const/4 v6, 0x0

    move-object/from16 v31, v7

    const/4 v7, 0x0

    move-object/from16 v32, v8

    const/4 v8, 0x0

    move-object/from16 v33, v9

    move/from16 v34, v10

    const-wide/16 v9, 0x0

    move/from16 v35, v11

    const/4 v11, 0x0

    move-object/from16 v37, v13

    move-object/from16 v36, v14

    const-wide/16 v13, 0x0

    move-object/from16 v38, v15

    const/4 v15, 0x0

    move/from16 v39, v24

    move/from16 v24, v16

    const/16 v16, 0x0

    const/16 v40, 0x1

    const/16 v17, 0x0

    const/16 v41, 0x0

    const/16 v18, 0x0

    move-object/from16 v42, v19

    const/16 v19, 0x0

    move-object/from16 v43, v21

    const/16 v21, 0x0

    move-object/from16 v44, v20

    move-object/from16 v20, v23

    const/16 v23, 0x30

    move-object/from16 v59, p0

    move-object/from16 v58, p1

    move-object/from16 v49, v28

    move-object/from16 v50, v31

    move-object/from16 v52, v32

    move-object/from16 v55, v33

    move/from16 v56, v34

    move/from16 v47, v35

    move-object/from16 v51, v36

    move-object/from16 v53, v37

    move-object/from16 v48, v38

    move/from16 v46, v39

    move-object/from16 v54, v42

    move-object/from16 v45, v43

    move-object/from16 v57, v44

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v22

    if-nez v27, :cond_11

    const v0, 0xfd1d916

    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    move-object/from16 v9, v27

    move-object/from16 v60, v58

    const/16 v29, 0x3

    :goto_a
    const/4 v10, 0x1

    goto :goto_b

    :cond_11
    const/4 v0, 0x0

    const v1, 0xfd1d917

    move/from16 v11, v47

    move-object/from16 v2, v58

    invoke-static {v6, v1, v2, v11, v6}, Lte0/d;->z(Lp1/q;ILb2/t;FLp1/q;)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v3, v55

    move/from16 v4, v56

    invoke-virtual {v3, v6, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->c1()J

    move-result-wide v7

    invoke-virtual {v3, v6, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->a()Lb91/a;

    move-result-object v20

    new-instance v12, Lw3/k;

    const/4 v3, 0x3

    invoke-direct {v12, v3}, Lw3/k;-><init>(I)V

    const/16 v23, 0x30

    const v25, 0x2fdf8

    const-wide/16 v4, 0x0

    move-object/from16 v22, v6

    const/4 v6, 0x0

    move/from16 v29, v3

    move-wide v2, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    move-object/from16 v0, v27

    move-object/from16 v60, v58

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object v9, v0

    move-object/from16 v6, v22

    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    goto :goto_a

    :goto_b
    invoke-virtual {v6, v10}, Lp1/q;->q(Z)V

    sget-object v1, Lb2/e;->H:Lb2/m;

    move-object/from16 v2, v59

    move-object/from16 v11, v60

    invoke-virtual {v2, v11, v1}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v2, v53

    move-object/from16 v3, v54

    invoke-static {v2, v3, v6, v0}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v3, v6, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v6, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v5, v6, Lp1/q;->S:Z

    if-eqz v5, :cond_12

    move-object/from16 v5, v48

    invoke-virtual {v6, v5}, Lp1/q;->l(Lc93/a;)V

    :goto_c
    move-object/from16 v5, v49

    goto :goto_d

    :cond_12
    invoke-virtual {v6}, Lp1/q;->s0()V

    goto :goto_c

    :goto_d
    invoke-static {v6, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v2, v50

    invoke-static {v6, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v6, Lp1/q;->S:Z

    if-nez v2, :cond_13

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_14

    :cond_13
    move-object/from16 v2, v51

    goto :goto_f

    :cond_14
    :goto_e
    move-object/from16 v2, v52

    goto :goto_10

    :goto_f
    invoke-static {v3, v6, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_e

    :goto_10
    invoke-static {v6, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v1, Lx60/b;->I:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v1

    and-int/lit8 v2, v26, 0x70

    const/16 v3, 0x20

    if-ne v2, v3, :cond_15

    move v0, v10

    :cond_15
    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_17

    move-object/from16 v0, v57

    if-ne v2, v0, :cond_16

    goto :goto_11

    :cond_16
    move-object/from16 v12, v45

    goto :goto_12

    :cond_17
    :goto_11
    new-instance v2, Lky2/a;

    const/16 v0, 0x10

    move-object/from16 v12, v45

    invoke-direct {v2, v12, v0}, Lky2/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v6, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_12
    move-object v5, v2

    check-cast v5, Lc93/a;

    sget v0, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v7, v0, 0x3

    const/16 v8, 0x1d

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v8}, Lk80/i;->d(ZLcom/whoop/design/util/TextResource;Lg1/u0;Li2/a1;Lf0/t;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x5

    int-to-float v0, v0

    move/from16 v1, v46

    invoke-static {v0, v1, v11, v6, v10}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    invoke-virtual {v6, v10}, Lp1/q;->q(Z)V

    move-object v14, v9

    move-object v15, v12

    goto :goto_13

    :cond_18
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v14, v2

    move-object v15, v7

    :goto_13
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_19

    new-instance v13, Ljs1/j;

    const/16 v18, 0x1

    move/from16 v16, p3

    move/from16 v17, p4

    invoke-direct/range {v13 .. v18}, Ljs1/j;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;III)V

    iput-object v13, v0, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method private static final f(Ll80/o;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 3

    new-instance v0, Ll80/o$k;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Ll80/o$k;-><init>(Ll80/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Ll90/a;->e(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
