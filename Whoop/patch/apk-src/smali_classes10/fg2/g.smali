.class public abstract Lfg2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a=\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000c\u00b2\u0006\u000e\u0010\n\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u000b\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "isStartingTextingWhoop",
        "isTextingWhoopError",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onNext",
        "e",
        "(Landroidx/compose/ui/Modifier;ZZLc93/a;Landroidx/compose/runtime/Composer;II)V",
        "termsAcceptedCheckboxOne",
        "termsAcceptedCheckboxTwo",
        "sms_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;ZZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lfg2/g;->m(Landroidx/compose/ui/Modifier;ZZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lfg2/g;->l(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lfg2/g;->f()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lfg2/g;->k(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;ZZLc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 53
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "ZZ",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v5, p5

    move-object/from16 v13, p4

    check-cast v13, Lp1/q;

    const v0, 0x7b7034f

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v3, v5, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v5, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v13, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v5

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v5

    :goto_1
    and-int/lit8 v6, p6, 0x2

    if-eqz v6, :cond_4

    or-int/lit8 v4, v4, 0x30

    :cond_3
    move/from16 v7, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v7, v5, 0x30

    if-nez v7, :cond_3

    move/from16 v7, p1

    invoke-virtual {v13, v7}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x20

    goto :goto_2

    :cond_5
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v4, v8

    :goto_3
    and-int/lit8 v8, p6, 0x4

    if-eqz v8, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move/from16 v9, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v9, v5, 0x180

    if-nez v9, :cond_6

    move/from16 v9, p2

    invoke-virtual {v13, v9}, Lp1/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x100

    goto :goto_4

    :cond_8
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v4, v10

    :goto_5
    and-int/lit8 v10, p6, 0x8

    if-eqz v10, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move-object/from16 v11, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v11, v5, 0xc00

    if-nez v11, :cond_9

    move-object/from16 v11, p3

    invoke-virtual {v13, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x800

    goto :goto_6

    :cond_b
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v4, v12

    :goto_7
    and-int/lit16 v12, v4, 0x493

    const/16 v14, 0x492

    const/4 v15, 0x0

    if-eq v12, v14, :cond_c

    const/4 v12, 0x1

    goto :goto_8

    :cond_c
    move v12, v15

    :goto_8
    and-int/lit8 v14, v4, 0x1

    invoke-virtual {v13, v14, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_26

    sget-object v12, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_d

    move-object v3, v12

    :cond_d
    if-eqz v6, :cond_e

    move v0, v15

    goto :goto_9

    :cond_e
    move v0, v7

    :goto_9
    if-eqz v8, :cond_f

    move/from16 v32, v15

    goto :goto_a

    :cond_f
    move/from16 v32, v9

    :goto_a
    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v10, :cond_11

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v6, :cond_10

    new-instance v7, Lf1/z1;

    const/16 v8, 0xe

    invoke-direct {v7, v8}, Lf1/z1;-><init>(I)V

    invoke-virtual {v13, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v7, Lc93/a;

    move-object/from16 v33, v7

    goto :goto_b

    :cond_11
    move-object/from16 v33, v11

    :goto_b
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v6, :cond_12

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v7

    invoke-virtual {v13, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v7, Lp1/c1;

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v6, :cond_13

    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v8}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v13, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v8, Lp1/c1;

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Lb2/e;->w:Lb2/m;

    invoke-static {v11, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v14

    iget-wide v1, v13, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v13, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 p0, v7

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v15, v13, Lp1/q;->S:Z

    if-eqz v15, :cond_14

    invoke-virtual {v13, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_14
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_c
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v13, v15, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->f:La3/i;

    invoke-static {v13, v14, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-nez v9, :cond_15

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    move/from16 v34, v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto :goto_d

    :cond_15
    move/from16 v34, v0

    :goto_d
    invoke-static {v1, v13, v1, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v13, v0, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Ll0/m;->d:Ll0/g;

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v12}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move-object/from16 v35, v3

    const/4 v10, 0x2

    int-to-float v3, v10

    const/16 v10, 0x8

    int-to-float v10, v10

    mul-float/2addr v3, v10

    move/from16 v36, v4

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-static {v9, v3, v4, v5}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->M:Lb2/k;

    const/4 v9, 0x6

    invoke-static {v1, v5, v13, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    move v5, v10

    iget-wide v9, v13, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v13, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v13}, Lp1/q;->i0()V

    move/from16 p2, v3

    iget-boolean v3, v13, Lp1/q;->S:Z

    if-eqz v3, :cond_17

    invoke-virtual {v13, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_17
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v13, v15, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v14, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v13, Lp1/q;->S:Z

    if-nez v1, :cond_18

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    :cond_18
    invoke-static {v9, v13, v9, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    invoke-static {v13, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v1, Lvf2/a;->d:I

    const/4 v3, 0x0

    invoke-static {v1, v13, v3}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v1

    move-object v4, v14

    const/16 v14, 0x30

    move-object v9, v15

    const/16 v15, 0x7c

    move-object v10, v7

    const/4 v7, 0x0

    move-object/from16 v16, v8

    const/4 v8, 0x0

    move-object/from16 v17, v9

    const/4 v9, 0x0

    move-object/from16 v18, v10

    const/4 v10, 0x0

    move-object/from16 v19, v11

    const/4 v11, 0x0

    move-object/from16 v20, v12

    const/4 v12, 0x0

    move-object/from16 v39, v4

    move/from16 v40, v5

    move-object/from16 v41, v6

    move-object/from16 v4, v16

    move-object/from16 v38, v17

    move-object/from16 v37, v18

    move-object/from16 v5, v19

    move-object/from16 v16, v20

    const/16 v42, 0x6

    move-object v6, v1

    move-object/from16 v1, p0

    invoke-static/range {v6 .. v15}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    const/4 v6, 0x4

    int-to-float v6, v6

    mul-float v18, v6, v40

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object/from16 v44, v16

    move/from16 v43, v18

    sget v8, Lvf2/b;->i:I

    invoke-static {v8, v13, v3}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v9, v13, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->P()Lb91/a;

    move-result-object v26

    invoke-virtual {v9, v13, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v11

    sget v14, Lb91/a;->d:I

    shl-int/lit8 v30, v14, 0x12

    const v31, 0x2fff8

    move v14, v6

    move-object v6, v8

    move-object v15, v9

    move-wide v8, v11

    move v12, v10

    const-wide/16 v10, 0x0

    move/from16 v16, v12

    const/4 v12, 0x0

    move-object/from16 v28, v13

    const/4 v13, 0x0

    move/from16 v17, v14

    const/4 v14, 0x0

    move-object/from16 v18, v15

    move/from16 v19, v16

    const-wide/16 v15, 0x0

    move/from16 v20, v17

    const/16 v17, 0x0

    move-object/from16 v21, v18

    const/16 v18, 0x0

    move/from16 v23, v19

    move/from16 v22, v20

    const-wide/16 v19, 0x0

    move-object/from16 v24, v21

    const/16 v21, 0x0

    move/from16 v25, v22

    const/16 v22, 0x0

    move/from16 v27, v23

    const/16 v23, 0x0

    move-object/from16 v29, v24

    const/16 v24, 0x0

    move/from16 v45, v25

    const/16 v25, 0x0

    move/from16 v46, v27

    const/16 v27, 0x0

    move-object/from16 v47, v29

    const/16 v29, 0x30

    move/from16 v48, v45

    move/from16 v50, v46

    move-object/from16 v49, v47

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v28

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move/from16 v18, p2

    move-object/from16 v16, v44

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object/from16 v45, v16

    move/from16 v44, v18

    sget v6, Lvf2/b;->g:I

    invoke-static {v6, v13, v3}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v15, v49

    move/from16 v12, v50

    invoke-virtual {v15, v13, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->a()Lb91/a;

    move-result-object v26

    invoke-virtual {v15, v13, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->c1()J

    move-result-wide v8

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v28

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move/from16 v18, v43

    move-object/from16 v16, v45

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v5, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v8, v13, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v13, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-eqz v10, :cond_1a

    move-object/from16 v10, v37

    invoke-virtual {v13, v10}, Lp1/q;->l(Lc93/a;)V

    :goto_f
    move-object/from16 v11, v38

    goto :goto_10

    :cond_1a
    move-object/from16 v10, v37

    invoke-virtual {v13}, Lp1/q;->s0()V

    goto :goto_f

    :goto_10
    invoke-static {v13, v11, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v7, v39

    invoke-static {v13, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-nez v9, :cond_1b

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1c

    :cond_1b
    invoke-static {v8, v13, v8, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1c
    invoke-static {v13, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v6, Lvf2/b;->c:I

    invoke-static {v6}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v6

    move-object/from16 v39, v7

    new-instance v7, Lsy0/k$g;

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->a()Lb91/a;

    move-result-object v8

    sget-object v9, Lb2/e;->J:Lb2/l;

    invoke-direct {v7, v8, v9}, Lsy0/k$g;-><init>(Lb91/a;Lb2/g;)V

    invoke-static {v1}, Lfg2/g;->g(Lp1/c1;)Z

    move-result v8

    int-to-float v12, v3

    mul-float v12, v12, v40

    new-instance v14, Ll0/l1;

    invoke-direct {v14, v12, v12, v12, v12}, Ll0/l1;-><init>(FFFF)V

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v3, v41

    if-ne v15, v3, :cond_1d

    new-instance v15, Lf1/a0;

    move-object/from16 p0, v6

    const/4 v6, 0x3

    invoke-direct {v15, v6, v1}, Lf1/a0;-><init>(ILp1/c1;)V

    invoke-virtual {v13, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_11

    :cond_1d
    move-object/from16 p0, v6

    :goto_11
    move-object/from16 v18, v15

    check-cast v18, Lkotlin/jvm/functions/Function1;

    sget v6, Lcom/whoop/design/util/TextResource$b;->c:I

    const/high16 v15, 0xc00000

    or-int/2addr v6, v15

    sget v15, Lsy0/k$g;->d:I

    shl-int/lit8 v15, v15, 0x3

    or-int v20, v6, v15

    const/16 v21, 0x6

    const/16 v22, 0x378

    move-object v6, v9

    const/4 v9, 0x0

    move-object/from16 v37, v10

    const/4 v10, 0x0

    move-object/from16 v17, v11

    move v15, v12

    const-wide/16 v11, 0x0

    move-object/from16 v28, v13

    const/4 v13, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v19, v16

    move-object/from16 v38, v17

    const-wide/16 v16, 0x0

    move-object/from16 p1, v1

    move-object/from16 v41, v3

    move-object/from16 v51, v6

    move/from16 v52, v19

    move-object/from16 v19, v28

    move-object/from16 v1, v37

    move-object/from16 v3, v39

    move-object/from16 v6, p0

    move-object/from16 p0, v4

    move-object/from16 v4, v38

    invoke-static/range {v6 .. v22}, Lsy0/j;->f(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v19

    move/from16 v6, v20

    const/4 v7, 0x1

    invoke-virtual {v13, v7}, Lp1/q;->q(Z)V

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move/from16 v18, v43

    move-object/from16 v16, v45

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static {v5, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v10, v13, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v13, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v11, v13, Lp1/q;->S:Z

    if-eqz v11, :cond_1e

    invoke-virtual {v13, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_1e
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_12
    invoke-static {v13, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-nez v9, :cond_1f

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_20

    :cond_1f
    invoke-static {v8, v13, v8, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_20
    invoke-static {v13, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v7, Lvf2/b;->d:I

    invoke-static {v7}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v7

    move/from16 v20, v6

    move-object v6, v7

    new-instance v7, Lsy0/k$g;

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->a()Lb91/a;

    move-result-object v8

    move-object/from16 v9, v51

    invoke-direct {v7, v8, v9}, Lsy0/k$g;-><init>(Lb91/a;Lb2/g;)V

    invoke-static/range {p0 .. p0}, Lfg2/g;->i(Lp1/c1;)Z

    move-result v8

    new-instance v14, Ll0/l1;

    move/from16 v15, v52

    invoke-direct {v14, v15, v15, v15, v15}, Ll0/l1;-><init>(FFFF)V

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    move-object/from16 v10, v41

    if-ne v9, v10, :cond_21

    new-instance v9, Lf1/a0;

    const/4 v10, 0x4

    move-object/from16 v11, p0

    invoke-direct {v9, v10, v11}, Lf1/a0;-><init>(ILp1/c1;)V

    invoke-virtual {v13, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_13

    :cond_21
    move-object/from16 v11, p0

    :goto_13
    check-cast v9, Lkotlin/jvm/functions/Function1;

    const/16 v21, 0x6

    const/16 v22, 0x378

    move/from16 v43, v18

    move-object/from16 v18, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v16, v11

    const-wide/16 v11, 0x0

    move-object/from16 v28, v13

    const/4 v13, 0x0

    const/4 v15, 0x0

    move-object/from16 v19, v16

    const-wide/16 v16, 0x0

    move-object/from16 p0, v0

    move-object/from16 v24, v19

    move-object/from16 v19, v28

    move/from16 v0, v43

    invoke-static/range {v6 .. v22}, Lsy0/j;->f(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v19

    const/4 v7, 0x1

    invoke-virtual {v13, v7}, Lp1/q;->q(Z)V

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move/from16 v18, v44

    move-object/from16 v16, v45

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v6, Lfg2/a;->a:Lfg2/a;

    invoke-virtual {v6}, Lfg2/a;->b()Lkotlin/jvm/functions/Function3;

    move-result-object v12

    shr-int/lit8 v6, v36, 0x3

    and-int/lit8 v6, v6, 0x70

    const v7, 0x180186

    or-int v14, v7, v6

    const/16 v15, 0x1c

    sget-object v6, Ll0/z;->a:Ll0/z;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 p2, v2

    move-object/from16 v2, v16

    move/from16 v7, v32

    invoke-static/range {v6 .. v15}, Landroidx/compose/animation/b;->e(Ll0/y;ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move v15, v7

    const/16 v6, 0x23

    int-to-float v6, v6

    move/from16 v14, v48

    const/4 v7, 0x1

    invoke-static {v6, v14, v2, v13, v7}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    sget-object v6, Lb2/e;->H:Lb2/m;

    sget-object v7, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v7, v2, v6}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v8, 0x0

    invoke-static {v5, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v5, v13, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v13, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v7, v13, Lp1/q;->S:Z

    if-eqz v7, :cond_22

    invoke-virtual {v13, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_14

    :cond_22
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_14
    invoke-static {v13, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v13, Lp1/q;->S:Z

    if-nez v1, :cond_23

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    :cond_23
    move-object/from16 v1, p2

    goto :goto_16

    :cond_24
    :goto_15
    move-object/from16 v1, p0

    goto :goto_17

    :goto_16
    invoke-static {v5, v13, v5, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_15

    :goto_17
    invoke-static {v13, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {p1 .. p1}, Lfg2/g;->g(Lp1/c1;)Z

    move-result v0

    if-eqz v0, :cond_25

    invoke-static/range {v24 .. v24}, Lfg2/g;->i(Lp1/c1;)Z

    move-result v0

    if-eqz v0, :cond_25

    const/4 v7, 0x1

    goto :goto_18

    :cond_25
    move v7, v8

    :goto_18
    sget-object v6, Leg2/k;->COMPLETED:Leg2/k;

    shl-int/lit8 v0, v36, 0x3

    and-int/lit16 v1, v0, 0x380

    or-int/lit8 v1, v1, 0x6

    const v2, 0xe000

    and-int/2addr v0, v2

    or-int v12, v1, v0

    move-object/from16 v28, v13

    const/16 v13, 0x8

    const/4 v9, 0x0

    move-object/from16 v11, v28

    move-object/from16 v10, v33

    move/from16 v8, v34

    invoke-static/range {v6 .. v13}, Leg2/e;->k(Leg2/k;ZZZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v13, v11

    const/4 v7, 0x1

    invoke-virtual {v13, v7}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v7}, Lp1/q;->q(Z)V

    move-object v4, v10

    move v3, v15

    move/from16 v2, v34

    move-object/from16 v1, v35

    goto :goto_19

    :cond_26
    invoke-virtual {v13}, Lp1/q;->X()V

    move-object v1, v3

    move v2, v7

    move v3, v9

    move-object v4, v11

    :goto_19
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_27

    new-instance v0, Lb30/k4;

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lb30/k4;-><init>(Landroidx/compose/ui/Modifier;ZZLc93/a;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_27
    return-void
.end method

.method private static final f()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final h(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final i(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final j(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final k(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lfg2/g;->h(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lfg2/g;->j(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Landroidx/compose/ui/Modifier;ZZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lfg2/g;->e(Landroidx/compose/ui/Modifier;ZZLc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
