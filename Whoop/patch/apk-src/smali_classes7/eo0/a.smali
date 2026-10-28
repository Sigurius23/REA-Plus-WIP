.class public abstract Leo0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a+\u0010\u0004\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onSendResetLink",
        "onClose",
        "c",
        "(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "change-password_release"
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
.method public static synthetic a(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Leo0/a;->e(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Leo0/a;->d(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 51
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v13, p0

    move-object/from16 v0, p1

    const-string v1, "onSendResetLink"

    invoke-static {v13, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onClose"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p2

    check-cast v14, Lp1/q;

    const v1, 0x5d606d2b

    invoke-virtual {v14, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p3, 0x6

    const/4 v12, 0x2

    if-nez v1, :cond_1

    invoke-virtual {v14, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v12

    :goto_0
    or-int v1, p3, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p3

    :goto_1
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v14, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    move/from16 v40, v1

    and-int/lit8 v1, v40, 0x13

    const/16 v3, 0x12

    const/4 v5, 0x0

    if-eq v1, v3, :cond_4

    const/4 v1, 0x1

    goto :goto_3

    :cond_4
    move v1, v5

    :goto_3
    and-int/lit8 v7, v40, 0x1

    invoke-virtual {v14, v7, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_e

    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v7}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {}, Lgb1/b0;->U()Li2/t;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v15, 0x6

    invoke-static {v8, v9, v10, v11, v15}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v8}, Ll0/f;->l(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Lb2/e;->w:Lb2/m;

    invoke-static {v9, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v4, v14, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v14, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v19, La3/l;->a:La3/k;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v10, v14, Lp1/q;->S:Z

    if-eqz v10, :cond_5

    invoke-virtual {v14, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_4
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v14, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v14, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v15, v14, Lp1/q;->S:Z

    if-nez v15, :cond_6

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v15, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :cond_6
    invoke-static {v4, v14, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v14, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v7}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v8, v12

    const/16 v15, 0x8

    int-to-float v15, v15

    mul-float/2addr v8, v15

    invoke-static {v4, v8, v11, v12}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v11, Lb2/e;->N:Lb2/k;

    sget-object v1, Ll0/m;->e:Ll0/h;

    const/16 v12, 0x36

    invoke-static {v1, v11, v14, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v11, v14, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v14, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v0, v14, Lp1/q;->S:Z

    if-eqz v0, :cond_8

    invoke-virtual {v14, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_8
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v14, v10, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v14, v3, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v14, Lp1/q;->S:Z

    if-nez v0, :cond_9

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    :cond_9
    invoke-static {v11, v14, v11, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    invoke-static {v14, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v0, Lsn0/a;->a:I

    const/4 v1, 0x0

    invoke-static {v0, v14, v1}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v2

    const/16 v0, 0xc

    int-to-float v0, v0

    const/4 v3, 0x4

    int-to-float v12, v3

    mul-float/2addr v0, v12

    invoke-static {v0, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v10, 0x61b0

    const/16 v11, 0x68

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v0, v7

    const/4 v7, 0x0

    move v6, v8

    const/4 v8, 0x0

    move/from16 v18, v6

    sget-object v6, Ly2/j;->b:Ly2/b1;

    move-object/from16 v17, v14

    move-object v14, v0

    move-object v0, v9

    move-object/from16 v9, v17

    move/from16 v41, v1

    move/from16 v1, v18

    const/16 v17, 0x20

    const/16 v19, 0x1

    const/16 v20, 0x0

    const/16 v23, 0x0

    const/16 v42, 0x12

    invoke-static/range {v2 .. v11}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v9

    mul-float/2addr v12, v15

    invoke-static {v12, v14}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v8, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget v2, Lsn0/b;->i:I

    invoke-static {v8, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v8, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->q()Lb91/a;

    move-result-object v34

    invoke-virtual {v3, v8, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    new-instance v7, Lw3/k;

    const/4 v9, 0x3

    invoke-direct {v7, v9}, Lw3/k;-><init>(I)V

    sget v9, Lb91/a;->d:I

    shl-int/lit8 v38, v9, 0x12

    const v39, 0x2fdfa

    move v9, v15

    const/4 v15, 0x0

    move/from16 v10, v19

    const-wide/16 v18, 0x0

    move-object/from16 v11, v20

    const/16 v20, 0x0

    const/16 v16, 0x6

    const/16 v21, 0x0

    const/16 v22, 0x0

    move/from16 v25, v23

    const-wide/16 v23, 0x0

    move/from16 v26, v25

    const/16 v25, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    move-object/from16 v36, v8

    move/from16 v43, v9

    move/from16 v44, v16

    move-object/from16 v47, v14

    move-object v14, v2

    const/16 v2, 0x10

    move/from16 v48, v26

    move-object/from16 v26, v7

    move-object/from16 v7, v47

    move-wide/from16 v49, v5

    move/from16 v5, v17

    move-wide/from16 v16, v49

    move/from16 v6, v48

    invoke-static/range {v14 .. v39}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    invoke-static {v1, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v8, v9}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget v9, Lsn0/b;->h:I

    invoke-static {v8, v9}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v3, v8, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->a()Lb91/a;

    move-result-object v34

    invoke-virtual {v3, v8, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->c1()J

    move-result-wide v16

    const/4 v9, 0x2

    invoke-static {v7, v1, v6, v9}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v15

    new-instance v1, Lw3/k;

    const/4 v6, 0x3

    invoke-direct {v1, v6}, Lw3/k;-><init>(I)V

    const/16 v37, 0x30

    const v39, 0x2fdf8

    move-object/from16 v26, v1

    invoke-static/range {v14 .. v39}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    invoke-static {v12, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v8, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v1, Lcom/whoop/design/util/TextResource$b;

    sget v6, Lsn0/b;->g:I

    const/4 v9, 0x2

    invoke-direct {v1, v6, v11, v9, v11}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v6, Lg1/v0;->a:Ll0/l1;

    invoke-virtual {v3, v8, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v11

    invoke-virtual {v3, v8, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->w()J

    move-result-wide v15

    move v6, v2

    move-object v4, v3

    move-wide v2, v11

    const/4 v11, 0x0

    const/16 v12, 0xc

    move v9, v6

    move-object/from16 v17, v7

    const-wide/16 v6, 0x0

    move/from16 v18, v9

    const-wide/16 v8, 0x0

    move/from16 v10, v18

    move-object/from16 v18, v4

    move-wide v4, v15

    move v15, v10

    move-object/from16 v45, v17

    move-object/from16 v10, v36

    invoke-static/range {v2 .. v12}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v7

    move-object v8, v10

    sget v2, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v2, v2, 0x12

    or-int/lit8 v2, v2, 0x6

    shl-int/lit8 v3, v40, 0x9

    and-int/lit16 v3, v3, 0x1c00

    const/16 v17, 0x1f3e

    move-object v6, v1

    const/4 v1, 0x0

    move v9, v15

    move v15, v2

    const/4 v2, 0x0

    move/from16 v16, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v36, v8

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v12, v11

    const/4 v11, 0x0

    move/from16 v19, v12

    const/4 v12, 0x0

    move-object/from16 v46, v0

    move-object v0, v14

    move-object/from16 v14, v36

    invoke-static/range {v0 .. v17}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object v8, v14

    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    sget-object v1, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    move-object/from16 v14, v45

    move-object/from16 v2, v46

    invoke-virtual {v1, v14, v2}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v19

    const-wide/high16 v1, 0x3ff8000000000000L    # 1.5

    double-to-float v1, v1

    mul-float v21, v1, v43

    const/16 v23, 0x0

    const/16 v24, 0xd

    const/16 v20, 0x0

    const/16 v22, 0x0

    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    new-instance v19, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v20

    invoke-static/range {v18 .. v18}, Lev/n;->h(Lx81/d;)Ljava/lang/Integer;

    move-result-object v22

    sget v1, Lgy0/f;->K:I

    invoke-static {v8, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v23

    const v36, 0xfff2

    const/16 v37, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v34, 0x0

    invoke-direct/range {v19 .. v37}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v1, v40, 0x70

    const/16 v5, 0x20

    if-ne v1, v5, :cond_b

    move v5, v0

    goto :goto_6

    :cond_b
    move/from16 v5, v41

    :goto_6
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v5, :cond_d

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v1, v3, :cond_c

    goto :goto_7

    :cond_c
    move-object/from16 v11, p1

    goto :goto_8

    :cond_d
    :goto_7
    new-instance v1, Ld42/o;

    move-object/from16 v11, p1

    const/16 v9, 0x10

    invoke-direct {v1, v11, v9}, Ld42/o;-><init>(Lc93/a;I)V

    invoke-virtual {v8, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_8
    move-object v5, v1

    check-cast v5, Lc93/a;

    sget v1, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v9, v1, 0x3

    const/16 v10, 0x34

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v3, v19

    invoke-static/range {v2 .. v10}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_e
    move-object v11, v0

    move-object v8, v14

    const/4 v0, 0x1

    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_f

    new-instance v2, Lam2/g;

    move/from16 v3, p3

    invoke-direct {v2, v13, v11, v3, v0}, Lam2/g;-><init>(Lc93/a;Lc93/a;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final d(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Leo0/a;->c(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
