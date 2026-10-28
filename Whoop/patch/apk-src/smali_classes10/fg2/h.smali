.class public abstract Lfg2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a]\u0010\r\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0014\u0008\u0002\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u000bH\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010\u00b2\u0006\u000e\u0010\u000f\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "maskedPhoneNumber",
        "",
        "isLoading",
        "Lcom/whoop/design/util/TextResource;",
        "errorMessage",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onResendCode",
        "Lkotlin/Function1;",
        "onNext",
        "i",
        "(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "code",
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
.method public static synthetic a(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lfg2/h;->q(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lfg2/h;->n()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lfg2/h;->j()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lfg2/h;->o(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lfg2/h;->r(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lfg2/h;->s(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lfg2/h;->k(Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/whoop/design/util/TextResource;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lfg2/h;->p(Lcom/whoop/design/util/TextResource;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 71
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ljava/lang/String;",
            "Z",
            "Lcom/whoop/design/util/TextResource;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p3

    move/from16 v7, p7

    move-object/from16 v13, p6

    check-cast v13, Lp1/q;

    const v1, -0x39b33a0a

    invoke-virtual {v13, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p8, 0x1

    const/4 v3, 0x2

    if-eqz v1, :cond_0

    or-int/lit8 v4, v7, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v7, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v13, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    move v5, v3

    :goto_0
    or-int/2addr v5, v7

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v7

    :goto_1
    and-int/lit8 v6, p8, 0x2

    if-eqz v6, :cond_4

    or-int/lit8 v5, v5, 0x30

    :cond_3
    move-object/from16 v9, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v9, v7, 0x30

    if-nez v9, :cond_3

    move-object/from16 v9, p1

    invoke-virtual {v13, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    const/16 v10, 0x20

    goto :goto_2

    :cond_5
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v5, v10

    :goto_3
    and-int/lit8 v10, p8, 0x4

    if-eqz v10, :cond_7

    or-int/lit16 v5, v5, 0x180

    :cond_6
    move/from16 v11, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v11, v7, 0x180

    if-nez v11, :cond_6

    move/from16 v11, p2

    invoke-virtual {v13, v11}, Lp1/q;->h(Z)Z

    move-result v12

    if-eqz v12, :cond_8

    const/16 v12, 0x100

    goto :goto_4

    :cond_8
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v5, v12

    :goto_5
    and-int/lit16 v12, v7, 0xc00

    if-nez v12, :cond_b

    and-int/lit8 v12, p8, 0x8

    if-nez v12, :cond_a

    and-int/lit16 v12, v7, 0x1000

    if-nez v12, :cond_9

    invoke-virtual {v13, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    goto :goto_6

    :cond_9
    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    :goto_6
    if-eqz v12, :cond_a

    const/16 v12, 0x800

    goto :goto_7

    :cond_a
    const/16 v12, 0x400

    :goto_7
    or-int/2addr v5, v12

    :cond_b
    and-int/lit8 v12, p8, 0x10

    if-eqz v12, :cond_d

    or-int/lit16 v5, v5, 0x6000

    :cond_c
    move-object/from16 v15, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v15, v7, 0x6000

    if-nez v15, :cond_c

    move-object/from16 v15, p4

    invoke-virtual {v13, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_e

    const/16 v16, 0x4000

    goto :goto_8

    :cond_e
    const/16 v16, 0x2000

    :goto_8
    or-int v5, v5, v16

    :goto_9
    and-int/lit8 v16, p8, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_f

    or-int v5, v5, v17

    move-object/from16 v8, p5

    goto :goto_b

    :cond_f
    and-int v17, v7, v17

    move-object/from16 v8, p5

    if-nez v17, :cond_11

    invoke-virtual {v13, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_10

    const/high16 v18, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v18, 0x10000

    :goto_a
    or-int v5, v5, v18

    :cond_11
    :goto_b
    const v18, 0x12493

    and-int v14, v5, v18

    const v2, 0x12492

    move/from16 v18, v12

    const/4 v12, 0x1

    if-eq v14, v2, :cond_12

    move v2, v12

    goto :goto_c

    :cond_12
    const/4 v2, 0x0

    :goto_c
    and-int/lit8 v14, v5, 0x1

    invoke-virtual {v13, v14, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_31

    invoke-virtual {v13}, Lp1/q;->Z()V

    and-int/lit8 v2, v7, 0x1

    const/16 v14, 0xf

    sget-object v34, Lb2/t;->w:Lb2/t;

    const-string v20, ""

    sget-object v15, Lp1/l;->a:Lp1/v0;

    const/16 v9, 0x12

    if-eqz v2, :cond_15

    invoke-virtual {v13}, Lp1/q;->C()Z

    move-result v2

    if-eqz v2, :cond_13

    goto :goto_d

    :cond_13
    invoke-virtual {v13}, Lp1/q;->X()V

    and-int/lit8 v1, p8, 0x8

    if-eqz v1, :cond_14

    and-int/lit16 v5, v5, -0x1c01

    :cond_14
    move-object/from16 v1, p1

    move-object v2, v0

    move-object v6, v8

    move v0, v11

    move v8, v5

    move-object/from16 v5, p4

    goto :goto_11

    :cond_15
    :goto_d
    if-eqz v1, :cond_16

    move-object/from16 v4, v34

    :cond_16
    if-eqz v6, :cond_17

    move-object/from16 v1, v20

    goto :goto_e

    :cond_17
    move-object/from16 v1, p1

    :goto_e
    if-eqz v10, :cond_18

    const/4 v11, 0x0

    :cond_18
    and-int/lit8 v2, p8, 0x8

    if-eqz v2, :cond_19

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    and-int/lit16 v5, v5, -0x1c01

    :cond_19
    if-eqz v18, :cond_1b

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v15, :cond_1a

    new-instance v2, Lf1/z1;

    invoke-direct {v2, v14}, Lf1/z1;-><init>(I)V

    invoke-virtual {v13, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast v2, Lc93/a;

    goto :goto_f

    :cond_1b
    move-object/from16 v2, p4

    :goto_f
    if-eqz v16, :cond_1d

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v15, :cond_1c

    new-instance v6, Lf41/f;

    invoke-direct {v6, v9}, Lf41/f;-><init>(I)V

    invoke-virtual {v13, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    check-cast v6, Lkotlin/jvm/functions/Function1;

    :goto_10
    move v8, v5

    move-object v5, v2

    move-object v2, v0

    move v0, v11

    goto :goto_11

    :cond_1d
    move-object v6, v8

    goto :goto_10

    :goto_11
    invoke-virtual {v13}, Lp1/q;->r()V

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v15, :cond_1e

    invoke-static/range {v20 .. v20}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v10

    invoke-virtual {v13, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    check-cast v10, Lp1/c1;

    invoke-static {v10}, Lfg2/h;->l(Lp1/c1;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v11

    if-lez v11, :cond_1f

    move/from16 v48, v12

    goto :goto_12

    :cond_1f
    const/16 v48, 0x0

    :goto_12
    invoke-static {v2}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v49

    const/high16 v11, 0x3f800000    # 1.0f

    move/from16 v16, v9

    invoke-static {v11, v4}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    int-to-float v11, v3

    const/16 v14, 0x8

    int-to-float v14, v14

    mul-float/2addr v11, v14

    move/from16 v50, v0

    const/4 v0, 0x0

    invoke-static {v9, v11, v0, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v22

    int-to-float v0, v12

    mul-float v26, v0, v14

    const/16 v27, 0x7

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v22 .. v27}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move/from16 v3, v26

    sget-object v9, Ll0/m;->d:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    move-object/from16 v51, v1

    const/16 v1, 0x36

    invoke-static {v9, v12, v13, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    move/from16 p2, v3

    move-object/from16 v52, v4

    iget-wide v3, v13, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v13, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-eqz v12, :cond_20

    invoke-virtual {v13, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_20
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_13
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v13, v12, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v13, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v7, v13, Lp1/q;->S:Z

    if-nez v7, :cond_21

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    move/from16 p1, v8

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_22

    goto :goto_14

    :cond_21
    move/from16 p1, v8

    :goto_14
    invoke-static {v3, v13, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_22
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v13, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v0, Lvf2/b;->o:I

    const/4 v7, 0x0

    invoke-static {v0, v13, v7}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v0, v13, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Lb91/d;->P()Lb91/a;

    move-result-object v28

    invoke-virtual {v0, v13, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ly81/i;->y()J

    move-result-wide v22

    sget v24, Lb91/a;->d:I

    shl-int/lit8 v32, v24, 0x12

    const v33, 0x2fffa

    move-object/from16 v16, v9

    const/4 v9, 0x0

    move-object/from16 v24, v12

    move-object/from16 v30, v13

    const-wide/16 v12, 0x0

    move/from16 v25, v14

    const/4 v14, 0x0

    move-object/from16 v26, v15

    const/4 v15, 0x0

    move-object/from16 v27, v16

    const/16 v16, 0x0

    const/16 v29, 0xf

    const/16 v31, 0x10

    const-wide/16 v17, 0x0

    const/16 v35, 0x4000

    const/16 v19, 0x0

    const/16 v36, 0x1

    const/16 v20, 0x0

    move/from16 v37, v11

    const/16 v38, 0x0

    move-wide/from16 v69, v22

    move-object/from16 v23, v10

    move-wide/from16 v10, v69

    const-wide/16 v21, 0x0

    move-object/from16 v39, v23

    const/16 v23, 0x0

    move-object/from16 v40, v24

    const/16 v24, 0x0

    move/from16 v41, v25

    const/16 v25, 0x0

    move-object/from16 v42, v26

    const/16 v26, 0x0

    move-object/from16 v43, v27

    const/16 v27, 0x0

    move/from16 v44, v29

    const/16 v29, 0x0

    move/from16 v45, v31

    const/16 v31, 0x0

    move/from16 v54, p1

    move-object/from16 v59, v3

    move-object/from16 v58, v5

    move-object/from16 v53, v6

    move/from16 v57, v37

    move-object/from16 v55, v39

    move-object/from16 v5, v40

    move/from16 v56, v41

    move-object/from16 v61, v42

    move-object/from16 v6, v43

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v30

    const/4 v8, 0x0

    const/16 v9, 0xd

    const/4 v10, 0x0

    const/4 v11, 0x0

    move/from16 p4, v8

    move/from16 p5, v9

    move/from16 p1, v10

    move/from16 p3, v11

    move-object/from16 p0, v34

    invoke-static/range {p0 .. p5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move-object/from16 v8, p0

    sget v10, Lvf2/b;->n:I

    filled-new-array/range {v51 .. v51}, [Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10, v11, v13}, Lq83/g;->X(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v13, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->a()Lb91/a;

    move-result-object v28

    invoke-virtual {v0, v13, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->c1()J

    move-result-wide v11

    const/16 v31, 0x30

    const v33, 0x2fff8

    move-object v14, v8

    move-object v8, v10

    move-wide v10, v11

    const-wide/16 v12, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v17, v16

    const/16 v16, 0x0

    move-object/from16 v19, v17

    const-wide/16 v17, 0x0

    move-object/from16 v20, v19

    const/16 v19, 0x0

    move-object/from16 v21, v20

    const/16 v20, 0x0

    move-object/from16 v23, v21

    const-wide/16 v21, 0x0

    move-object/from16 v24, v23

    const/16 v23, 0x0

    move-object/from16 v25, v24

    const/16 v24, 0x0

    move-object/from16 v26, v25

    const/16 v25, 0x0

    move-object/from16 v27, v26

    const/16 v26, 0x0

    move-object/from16 v29, v27

    const/16 v27, 0x0

    move-object/from16 v34, v29

    const/16 v29, 0x0

    move-object/from16 v62, v4

    move-object/from16 v4, v34

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v30

    move/from16 v63, v32

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v9, 0x4

    int-to-float v9, v9

    mul-float v14, v9, v56

    const/4 v10, 0x0

    const/16 v11, 0xd

    const/4 v12, 0x0

    const/4 v15, 0x0

    move-object/from16 p0, v8

    move/from16 p4, v10

    move/from16 p5, v11

    move/from16 p1, v12

    move/from16 p2, v14

    move/from16 p3, v15

    invoke-static/range {p0 .. p5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v36

    move/from16 v64, p2

    invoke-static/range {v55 .. v55}, Lfg2/h;->l(Lp1/c1;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v37

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v38

    sget-object v8, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v8}, Lkd1/w;->a()Lk91/a;

    move-result-object v8

    invoke-virtual {v8}, Lk91/a;->c()Lt0/i;

    move-result-object v39

    sget-object v8, Lg1/i8;->a:Lg1/i8;

    invoke-virtual {v0, v13, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v10

    invoke-virtual {v0, v13, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->r()J

    move-result-wide v14

    invoke-virtual {v0, v13, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v16

    invoke-virtual {v0, v13, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v18

    invoke-virtual {v0, v13, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v20

    const-wide/16 v32, 0x0

    const v35, 0x1fff92

    move v12, v9

    move-wide v8, v10

    const-wide/16 v10, 0x0

    move/from16 v22, v12

    move-wide v12, v14

    move-wide/from16 v14, v16

    const-wide/16 v16, 0x0

    move/from16 v24, v22

    const-wide/16 v22, 0x0

    move/from16 v26, v24

    const-wide/16 v24, 0x0

    move/from16 v28, v26

    const-wide/16 v26, 0x0

    move/from16 v31, v28

    const-wide/16 v28, 0x0

    move-object/from16 v41, v30

    move/from16 v34, v31

    const-wide/16 v30, 0x0

    move/from16 v65, v34

    move-object/from16 v34, v41

    invoke-static/range {v8 .. v35}, Lg1/i8;->h(JJJJJJJJJJJJJLandroidx/compose/runtime/Composer;I)Lg1/y1;

    move-result-object v35

    move-object/from16 v13, v34

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v9, v61

    if-ne v8, v9, :cond_23

    new-instance v8, Lf1/z1;

    const/16 v10, 0x10

    invoke-direct {v8, v10}, Lf1/z1;-><init>(I)V

    invoke-virtual {v13, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_23
    check-cast v8, Lc93/a;

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    const/4 v11, 0x5

    if-ne v10, v9, :cond_24

    new-instance v10, Lf1/a0;

    move-object/from16 v12, v55

    invoke-direct {v10, v11, v12}, Lf1/a0;-><init>(ILp1/c1;)V

    invoke-virtual {v13, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_15

    :cond_24
    move-object/from16 v12, v55

    :goto_15
    move-object/from16 v40, v10

    check-cast v40, Lkotlin/jvm/functions/Function1;

    sget v10, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v14, v10, 0x3

    const v15, 0x30000006

    or-int/2addr v14, v15

    shl-int/lit8 v10, v10, 0x18

    or-int v42, v14, v10

    const v46, 0x39fc9cfc

    const/16 v47, 0x0

    const/4 v10, 0x0

    move v14, v11

    const/4 v11, 0x0

    move-object/from16 v23, v12

    const/4 v12, 0x0

    move-object/from16 v30, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x1

    move-object/from16 v55, v23

    const/16 v23, 0x3

    const/16 v24, 0x0

    const/16 v25, 0x7

    const/16 v26, 0x1

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    move-object/from16 v41, v30

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    move-object/from16 v34, v39

    move-object/from16 v39, v8

    move-object/from16 v8, v36

    const/16 v36, 0x0

    move-object/from16 v61, v9

    move-object/from16 v9, v37

    const/16 v37, 0x0

    move/from16 v43, v16

    move-object/from16 v16, v38

    const/16 v38, 0x0

    move/from16 v44, v43

    const v43, 0xd86c00

    move/from16 v45, v44

    const/16 v44, 0x0

    move/from16 v60, v45

    const/16 v45, 0x36

    move-object/from16 v66, v55

    move-object/from16 v67, v61

    invoke-static/range {v8 .. v47}, Lqz0/k;->l(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Lb91/a;Lc93/m;Lc93/m;Lqz0/c;Lcom/whoop/design/util/TextResource;ZZLb91/a;JZIIIZLq3/g0;ZZIZLj0/i;Ljava/lang/String;Li2/a1;Lg1/e8;Ll0/k1;Ll0/k1;Lu0/q0;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIIIII)V

    move-object/from16 v13, v41

    const/4 v8, 0x0

    const/16 v9, 0xd

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 p0, v4

    move/from16 p4, v8

    move/from16 p5, v9

    move/from16 p1, v10

    move/from16 p3, v11

    move/from16 p2, v57

    invoke-static/range {p0 .. p5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    new-instance v8, Lby1/c;

    const/4 v9, 0x1

    invoke-direct {v8, v2, v9}, Lby1/c;-><init>(Lcom/whoop/design/util/TextResource;I)V

    const v11, 0x4c9540e8    # 7.825184E7f

    invoke-static {v11, v13, v8}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v14

    const v16, 0x180186

    const/16 v17, 0x1c

    sget-object v8, Ll0/z;->a:Ll0/z;

    const/4 v11, 0x0

    move-object/from16 v30, v13

    const/4 v13, 0x0

    move-object/from16 p6, v2

    move v2, v9

    move-object/from16 v15, v30

    move/from16 v9, v49

    invoke-static/range {v8 .. v17}, Landroidx/compose/animation/b;->e(Ll0/y;ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move/from16 v34, v9

    move-object v13, v15

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v8, 0x0

    const/16 v9, 0xd

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 p0, v3

    move/from16 p4, v8

    move/from16 p5, v9

    move/from16 p1, v10

    move/from16 p3, v11

    move/from16 p2, v64

    invoke-static/range {p0 .. p5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, Ll0/m;->e:Ll0/h;

    sget-object v9, Lb2/e;->J:Lb2/l;

    const/4 v10, 0x6

    invoke-static {v8, v9, v13, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v11, v13, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v13, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-eqz v12, :cond_25

    invoke-virtual {v13, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_16

    :cond_25
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_16
    invoke-static {v13, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v1, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v8, v13, Lp1/q;->S:Z

    if-nez v8, :cond_26

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_27

    :cond_26
    move-object/from16 v8, v62

    goto :goto_18

    :cond_27
    move-object/from16 v8, v62

    :goto_17
    move-object/from16 v9, v59

    goto :goto_19

    :goto_18
    invoke-static {v9, v13, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_17

    :goto_19
    invoke-static {v13, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v3, Lvf2/b;->k:I

    const/4 v11, 0x0

    invoke-static {v3, v13, v11}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v13, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->M()Lb91/a;

    move-result-object v28

    invoke-virtual {v0, v13, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->c1()J

    move-result-wide v11

    const/16 v31, 0x0

    const v33, 0x2fffa

    move-object/from16 v59, v9

    const/4 v9, 0x0

    move v14, v10

    move-wide v10, v11

    move-object/from16 v30, v13

    const-wide/16 v12, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v19, v17

    const-wide/16 v17, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v23, v21

    const-wide/16 v21, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    move/from16 v26, v25

    const/16 v25, 0x0

    move/from16 v27, v26

    const/16 v26, 0x0

    move/from16 v29, v27

    const/16 v27, 0x0

    move/from16 v32, v29

    const/16 v29, 0x0

    move-object/from16 v35, v8

    move-object v8, v3

    move-object/from16 v3, v35

    move/from16 v35, v32

    move-object/from16 v68, v59

    move/from16 v32, v63

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v30

    const/4 v8, 0x0

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 p0, v4

    move/from16 p4, v8

    move/from16 p5, v9

    move/from16 p2, v10

    move/from16 p3, v11

    move/from16 p1, v65

    invoke-static/range {p0 .. p5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object/from16 v36, p0

    const v8, 0xe000

    and-int v8, v54, v8

    const/16 v9, 0x4000

    if-ne v8, v9, :cond_28

    move v9, v2

    goto :goto_1a

    :cond_28
    const/4 v9, 0x0

    :goto_1a
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v9, :cond_2a

    move-object/from16 v9, v67

    if-ne v8, v9, :cond_29

    goto :goto_1b

    :cond_29
    move-object/from16 v11, v58

    goto :goto_1c

    :cond_2a
    move-object/from16 v9, v67

    :goto_1b
    new-instance v8, Ld42/o;

    const/16 v10, 0x17

    move-object/from16 v11, v58

    invoke-direct {v8, v11, v10}, Ld42/o;-><init>(Lc93/a;I)V

    invoke-virtual {v13, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1c
    check-cast v8, Lc93/a;

    const/16 v10, 0xf

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 p0, v4

    move-object/from16 p4, v8

    move/from16 p5, v10

    move/from16 p1, v12

    move-object/from16 p2, v14

    move-object/from16 p3, v15

    invoke-static/range {p0 .. p5}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget v8, Lvf2/b;->m:I

    const/4 v10, 0x0

    invoke-static {v8, v13, v10}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v13, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->M()Lb91/a;

    move-result-object v28

    invoke-virtual {v0, v13, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v14

    const/16 v31, 0x0

    const v33, 0x2fff8

    move-object/from16 v30, v13

    const-wide/16 v12, 0x0

    move-object/from16 v58, v11

    move-wide v10, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    move-object v0, v9

    move-object v9, v4

    move-object v4, v0

    move/from16 v0, v54

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v30

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    const/4 v14, 0x5

    int-to-float v7, v14

    mul-float v7, v7, v56

    const/4 v8, 0x3

    int-to-float v8, v8

    mul-float v8, v8, v56

    const/4 v9, 0x0

    const/4 v10, 0x1

    move/from16 p2, v7

    move/from16 p4, v8

    move/from16 p1, v9

    move/from16 p5, v10

    move-object/from16 p0, v36

    move/from16 p3, v57

    invoke-static/range {p0 .. p5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Lb2/e;->w:Lb2/m;

    const/4 v10, 0x0

    invoke-static {v8, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    iget-wide v11, v13, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v13, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-eqz v12, :cond_2b

    invoke-virtual {v13, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1d

    :cond_2b
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_1d
    invoke-static {v13, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v1, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v13, Lp1/q;->S:Z

    if-nez v1, :cond_2d

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2c

    goto :goto_1f

    :cond_2c
    :goto_1e
    move-object/from16 v9, v68

    goto :goto_20

    :cond_2d
    :goto_1f
    invoke-static {v9, v13, v9, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_1e

    :goto_20
    invoke-static {v13, v9, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, Leg2/k;->ENTER_CODE:Leg2/k;

    const/high16 v1, 0x70000

    and-int/2addr v1, v0

    const/high16 v3, 0x20000

    if-ne v1, v3, :cond_2e

    move v9, v2

    goto :goto_21

    :cond_2e
    move v9, v10

    :goto_21
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v9, :cond_30

    if-ne v1, v4, :cond_2f

    goto :goto_22

    :cond_2f
    move-object/from16 v6, v53

    goto :goto_23

    :cond_30
    :goto_22
    new-instance v1, Lbs1/i;

    move-object/from16 v6, v53

    move-object/from16 v12, v66

    const/16 v3, 0xf

    invoke-direct {v1, v6, v12, v3}, Lbs1/i;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v13, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_23
    move-object v12, v1

    check-cast v12, Lc93/a;

    and-int/lit16 v0, v0, 0x380

    or-int/lit8 v14, v0, 0x6

    const/4 v15, 0x0

    move/from16 v11, v34

    move/from16 v9, v48

    move/from16 v10, v50

    invoke-static/range {v8 .. v15}, Leg2/e;->g(Leg2/k;ZZZLc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    move-object/from16 v4, p6

    move v3, v10

    move-object/from16 v2, v51

    move-object/from16 v1, v52

    move-object/from16 v5, v58

    goto :goto_24

    :cond_31
    invoke-virtual {v13}, Lp1/q;->X()V

    move-object/from16 v2, p1

    move-object/from16 v5, p4

    move-object v1, v4

    move-object v6, v8

    move v3, v11

    move-object v4, v0

    :goto_24
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_32

    new-instance v0, Lb30/i2;

    const/4 v9, 0x5

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Lb30/i2;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_32
    return-void
.end method

.method private static final j()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final k(Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lp1/c1;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final m(Lp1/c1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final n()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final o(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lfg2/h;->m(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lcom/whoop/design/util/TextResource;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 26

    const-string v0, "$this$AnimatedVisibility"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Lgz0/m0;->TINY_INFORMATION:Lgz0/m0;

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v1, v3, :cond_0

    sget-object v1, Lfg2/h$a;->w:Lfg2/h$a;

    invoke-virtual {v0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v10

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_1

    sget-object v1, Lfg2/h$b;->w:Lfg2/h$b;

    invoke-virtual {v0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v12

    new-instance v3, Lc41/p2;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const v24, 0xffeae

    const/16 v25, 0x0

    move-object/from16 v8, p0

    invoke-direct/range {v3 .. v25}, Lc41/p2;-><init>(Lgz0/m0;FLc41/n2;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/c;Ly81/e;Ly81/e;Ly81/e;Ly81/e;Ly81/e;Lrz0/f;Ly81/e;ZLjava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;Lc41/o2;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v1, Lc41/p2;->v:I

    shl-int/lit8 v1, v1, 0x3

    or-int/lit8 v6, v1, 0x6

    const/4 v7, 0x4

    const/4 v4, 0x0

    move-object v5, v0

    invoke-static/range {v2 .. v7}, Lc41/r2;->f(Landroidx/compose/ui/Modifier;Lc41/p2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final q(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1}, Lfg2/h;->l(Lp1/c1;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lfg2/h;->i(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
