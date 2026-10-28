.class public abstract Lfg2/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001aC\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\r\u00b2\u0006\u000e\u0010\u000b\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u000c\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "isLoading",
        "isError",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onNext",
        "g",
        "(Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "phoneNumber",
        "termsAccepted",
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
.method public static synthetic a(Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lfg2/j;->h(Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lfg2/j;->o(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lfg2/j;->p(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lfg2/j;->q(Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e()Ll83/a0;
    .locals 1

    invoke-static {}, Lfg2/j;->m()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lfg2/j;->n(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 58
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "ZZ",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v5, p5

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    const v0, -0x13983676

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x1

    const/4 v2, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v3, v5, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v5, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    move v4, v2

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

    invoke-virtual {v11, v7}, Lp1/q;->h(Z)Z

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

    invoke-virtual {v11, v9}, Lp1/q;->h(Z)Z

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
    move-object/from16 v13, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v13, v5, 0xc00

    if-nez v13, :cond_9

    move-object/from16 v13, p3

    invoke-virtual {v11, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_b

    const/16 v14, 0x800

    goto :goto_6

    :cond_b
    const/16 v14, 0x400

    :goto_6
    or-int/2addr v4, v14

    :goto_7
    and-int/lit16 v14, v4, 0x493

    const/16 v15, 0x492

    const/4 v1, 0x0

    const/4 v7, 0x1

    if-eq v14, v15, :cond_c

    move v14, v7

    goto :goto_8

    :cond_c
    move v14, v1

    :goto_8
    and-int/lit8 v15, v4, 0x1

    invoke-virtual {v11, v15, v14}, Lp1/q;->U(IZ)Z

    move-result v14

    if-eqz v14, :cond_24

    sget-object v32, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_d

    move-object/from16 v3, v32

    :cond_d
    if-eqz v6, :cond_e

    move v0, v1

    goto :goto_9

    :cond_e
    move/from16 v0, p1

    :goto_9
    if-eqz v8, :cond_f

    move/from16 v46, v1

    goto :goto_a

    :cond_f
    move/from16 v46, v9

    :goto_a
    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v10, :cond_11

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v6, :cond_10

    new-instance v8, Lf41/f;

    const/16 v9, 0x13

    invoke-direct {v8, v9}, Lf41/f;-><init>(I)V

    invoke-virtual {v11, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v8, Lkotlin/jvm/functions/Function1;

    move-object v13, v8

    :cond_11
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v6, :cond_12

    const-string v8, ""

    invoke-static {v8}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v11, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v8, Lp1/c1;

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v6, :cond_13

    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v9}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v9

    invoke-virtual {v11, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v9, Lp1/c1;

    invoke-static {v8}, Lfg2/j;->i(Lp1/c1;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v10

    if-lez v10, :cond_14

    invoke-static {v9}, Lfg2/j;->k(Lp1/c1;)Z

    move-result v10

    if-eqz v10, :cond_14

    move/from16 v47, v7

    goto :goto_b

    :cond_14
    move/from16 v47, v1

    :goto_b
    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    int-to-float v15, v2

    const/16 v10, 0x8

    int-to-float v10, v10

    mul-float/2addr v15, v10

    const/4 v12, 0x0

    invoke-static {v14, v15, v12, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v17

    int-to-float v2, v7

    mul-float v21, v2, v10

    const/16 v22, 0x7

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move/from16 v33, v21

    invoke-static {v1, v11, v7}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v12

    const/16 v14, 0xe

    invoke-static {v2, v12, v14}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v12, Ll0/m;->d:Ll0/g;

    sget-object v14, Lb2/e;->M:Lb2/k;

    const/16 v7, 0x36

    invoke-static {v12, v14, v11, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    move-object/from16 p1, v2

    iget-wide v1, v11, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    move-object/from16 v12, p1

    invoke-static {v11, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    move/from16 p1, v0

    iget-boolean v0, v11, Lp1/q;->S:Z

    if-eqz v0, :cond_15

    invoke-virtual {v11, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_15
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_c
    sget-object v0, La3/k;->g:La3/i;

    invoke-static {v11, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v11, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    move-object/from16 v48, v3

    iget-boolean v3, v11, Lp1/q;->S:Z

    if-nez v3, :cond_16

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_17

    :cond_16
    invoke-static {v1, v11, v1, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v11, v1, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v3, Lvf2/b;->u:I

    const/4 v5, 0x0

    invoke-static {v3, v11, v5}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v5, v11, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Lb91/d;->P()Lb91/a;

    move-result-object v26

    invoke-virtual {v5, v11, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ly81/i;->y()J

    move-result-wide v18

    sget v20, Lb91/a;->d:I

    shl-int/lit8 v30, v20, 0x12

    const v31, 0x2fffa

    move-object/from16 v20, v7

    const/4 v7, 0x0

    move/from16 v21, v10

    move-object/from16 v28, v11

    const-wide/16 v10, 0x0

    move/from16 v22, v12

    const/4 v12, 0x0

    move-object/from16 v23, v13

    const/4 v13, 0x0

    move-object/from16 v24, v14

    const/4 v14, 0x0

    move/from16 v25, v15

    const/16 v27, 0x800

    const-wide/16 v15, 0x0

    const/16 v29, 0x1

    const/16 v17, 0x0

    move-object/from16 v34, v9

    move-wide/from16 v56, v18

    move-object/from16 v19, v8

    move-wide/from16 v8, v56

    const/16 v18, 0x0

    move-object/from16 v35, v19

    move-object/from16 v36, v20

    const-wide/16 v19, 0x0

    move/from16 v37, v21

    const/16 v21, 0x0

    move/from16 v38, v22

    const/16 v22, 0x0

    move-object/from16 v39, v23

    const/16 v23, 0x0

    move-object/from16 v40, v24

    const/16 v24, 0x0

    move/from16 v41, v25

    const/16 v25, 0x0

    move/from16 v42, v27

    const/16 v27, 0x0

    move/from16 v43, v29

    const/16 v29, 0x0

    move-object/from16 v52, v1

    move-object/from16 v53, v2

    move/from16 v51, v4

    move-object/from16 v54, v6

    move-object/from16 p2, v34

    move-object/from16 p0, v35

    move-object/from16 v4, v36

    move/from16 v49, v37

    move/from16 v1, v38

    move-object/from16 p3, v39

    move/from16 v50, v41

    const/high16 v2, 0x3f800000    # 1.0f

    move-object v6, v3

    move-object/from16 v3, v40

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v28

    const/16 v19, 0x0

    const/16 v20, 0xd

    const/16 v16, 0x0

    const/16 v18, 0x0

    move-object/from16 v15, v32

    move/from16 v17, v33

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget v6, Lvf2/b;->s:I

    const/4 v8, 0x0

    invoke-static {v6, v11, v8}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v11, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->a()Lb91/a;

    move-result-object v26

    invoke-virtual {v5, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v8

    const/16 v29, 0x30

    const v31, 0x2fff8

    const-wide/16 v10, 0x0

    move-object v1, v15

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v28

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float v17, v2, v49

    const/4 v9, 0x0

    const/16 v10, 0xd

    const/4 v6, 0x0

    const/4 v8, 0x0

    move/from16 v7, v17

    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move v2, v7

    invoke-static/range {p0 .. p0}, Lfg2/j;->i(Lp1/c1;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget-object v5, Lfg2/b;->a:Lfg2/b;

    invoke-virtual {v5}, Lfg2/b;->c()Lc93/m;

    move-result-object v8

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    sget-object v9, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v9}, Lkd1/w;->a()Lk91/a;

    move-result-object v9

    invoke-virtual {v9}, Lk91/a;->c()Lt0/i;

    move-result-object v32

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    move-object/from16 v10, v54

    if-ne v9, v10, :cond_18

    new-instance v9, Lf1/z1;

    const/16 v12, 0x11

    invoke-direct {v9, v12}, Lf1/z1;-><init>(I)V

    invoke-virtual {v11, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    move-object/from16 v37, v9

    check-cast v37, Lc93/a;

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v10, :cond_19

    new-instance v9, Lf1/a0;

    const/4 v12, 0x6

    move-object/from16 v13, p0

    invoke-direct {v9, v12, v13}, Lf1/a0;-><init>(ILp1/c1;)V

    invoke-virtual {v11, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_d

    :cond_19
    move-object/from16 v13, p0

    :goto_d
    move-object/from16 v38, v9

    check-cast v38, Lkotlin/jvm/functions/Function1;

    sget v9, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v12, v9, 0x3

    const v15, 0x30030006

    or-int/2addr v12, v15

    shl-int/lit8 v9, v9, 0x18

    or-int v40, v12, v9

    const v44, 0x3dfc9cdc

    const/16 v45, 0x0

    move-object/from16 v28, v11

    move-object v11, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v54, v10

    const/4 v10, 0x0

    const/4 v12, 0x0

    move-object/from16 v19, v13

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v35, v19

    const-wide/16 v18, 0x0

    const/16 v20, 0x1

    const/16 v21, 0x4

    const/16 v22, 0x0

    const/16 v23, 0x7

    const/16 v24, 0x1

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v39, v28

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    move-object/from16 v36, v35

    const/16 v35, 0x0

    move-object/from16 v41, v36

    const/16 v36, 0x0

    move-object/from16 v42, v41

    const v41, 0xd86c00

    move-object/from16 v43, v42

    const/16 v42, 0x0

    move-object/from16 v55, v43

    const/16 v43, 0x36

    move-object/from16 p0, v1

    move/from16 p4, v2

    move-object/from16 v2, v54

    move-object/from16 v1, v55

    invoke-static/range {v6 .. v45}, Lqz0/k;->l(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Lb91/a;Lc93/m;Lc93/m;Lqz0/c;Lcom/whoop/design/util/TextResource;ZZLb91/a;JZIIIZLq3/g0;ZZIZLj0/i;Ljava/lang/String;Li2/a1;Lg1/e8;Ll0/k1;Ll0/k1;Lu0/q0;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIIIII)V

    move-object/from16 v28, v39

    const/16 v19, 0x0

    const/16 v20, 0xd

    const/16 v16, 0x0

    const/16 v18, 0x0

    move-object/from16 v15, p0

    move/from16 v17, v50

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-object/from16 v16, v15

    move/from16 v25, v17

    invoke-virtual {v5}, Lfg2/b;->d()Lkotlin/jvm/functions/Function3;

    move-result-object v12

    shr-int/lit8 v5, v51, 0x3

    and-int/lit8 v5, v5, 0x70

    const v6, 0x180186

    or-int v14, v6, v5

    const/16 v15, 0x1c

    sget-object v6, Ll0/z;->a:Ll0/z;

    const/4 v11, 0x0

    move-object/from16 v13, v28

    move/from16 v7, v46

    invoke-static/range {v6 .. v15}, Landroidx/compose/animation/b;->e(Ll0/y;ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move v5, v7

    move-object v11, v13

    move-object/from16 v15, v16

    const/16 v16, 0x0

    move/from16 v17, p4

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object/from16 v24, v15

    move/from16 v23, v17

    sget-object v7, Lb2/e;->w:Lb2/m;

    const/4 v8, 0x0

    invoke-static {v7, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v11, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-eqz v12, :cond_1a

    invoke-virtual {v11, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_1a
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v11, v0, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v9, v11, Lp1/q;->S:Z

    if-nez v9, :cond_1b

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1c

    :cond_1b
    move-object/from16 v9, v53

    goto :goto_10

    :cond_1c
    move-object/from16 v9, v53

    :goto_f
    move-object/from16 v8, v52

    goto :goto_11

    :goto_10
    invoke-static {v8, v11, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_f

    :goto_11
    invoke-static {v11, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v6, Lvf2/b;->t:I

    invoke-static {v6}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v6

    move-object v10, v7

    new-instance v7, Lsy0/k$g;

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->a()Lb91/a;

    move-result-object v12

    sget-object v13, Lb2/e;->J:Lb2/l;

    invoke-direct {v7, v12, v13}, Lsy0/k$g;-><init>(Lb91/a;Lb2/g;)V

    move-object/from16 v52, v8

    invoke-static/range {p2 .. p2}, Lfg2/j;->k(Lp1/c1;)Z

    move-result v8

    const/4 v12, 0x0

    int-to-float v13, v12

    mul-float v13, v13, v49

    new-instance v14, Ll0/l1;

    invoke-direct {v14, v13, v13, v13, v13}, Ll0/l1;-><init>(FFFF)V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v2, :cond_1d

    new-instance v12, Lf1/a0;

    const/4 v13, 0x7

    move-object/from16 v15, p2

    invoke-direct {v12, v13, v15}, Lf1/a0;-><init>(ILp1/c1;)V

    invoke-virtual {v11, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    move-object/from16 v18, v12

    check-cast v18, Lkotlin/jvm/functions/Function1;

    const/high16 v12, 0xc00000

    sget v13, Lcom/whoop/design/util/TextResource$b;->c:I

    or-int/2addr v12, v13

    sget v13, Lsy0/k$g;->d:I

    const/4 v15, 0x3

    shl-int/2addr v13, v15

    or-int v20, v12, v13

    const/16 v21, 0x6

    const/16 v22, 0x378

    move-object/from16 v53, v9

    const/4 v9, 0x0

    move-object v12, v10

    const/4 v10, 0x0

    move-object/from16 v28, v11

    move-object v13, v12

    const-wide/16 v11, 0x0

    move-object/from16 v16, v13

    const/4 v13, 0x0

    move/from16 v17, v15

    const/4 v15, 0x0

    move-object/from16 v19, v16

    move/from16 v26, v17

    const-wide/16 v16, 0x0

    move-object/from16 v35, v1

    move-object/from16 v54, v2

    move/from16 p0, v5

    move-object/from16 v2, v19

    move/from16 v1, v26

    move-object/from16 v19, v28

    move-object/from16 v5, v53

    invoke-static/range {v6 .. v22}, Lsy0/j;->f(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v19

    const/4 v14, 0x1

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    int-to-float v6, v1

    mul-float v19, v6, v49

    const/16 v16, 0x0

    const/16 v20, 0x1

    move/from16 v17, v23

    move-object/from16 v15, v24

    move/from16 v18, v25

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v8, 0x0

    invoke-static {v2, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v9, v11, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v11, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-eqz v10, :cond_1e

    invoke-virtual {v11, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_1e
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_12
    invoke-static {v11, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v11, Lp1/q;->S:Z

    if-nez v0, :cond_20

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    goto :goto_14

    :cond_1f
    :goto_13
    move-object/from16 v0, v52

    goto :goto_15

    :cond_20
    :goto_14
    invoke-static {v7, v11, v7, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_13

    :goto_15
    invoke-static {v11, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, Leg2/k;->INPUT:Leg2/k;

    move/from16 v4, v51

    and-int/lit16 v0, v4, 0x1c00

    const/16 v2, 0x800

    if-ne v0, v2, :cond_21

    move v8, v14

    :cond_21
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v8, :cond_23

    move-object/from16 v10, v54

    if-ne v0, v10, :cond_22

    goto :goto_16

    :cond_22
    move-object/from16 v3, p3

    goto :goto_17

    :cond_23
    :goto_16
    new-instance v0, Lbs1/i;

    const/16 v2, 0x10

    move-object/from16 v3, p3

    move-object/from16 v13, v35

    invoke-direct {v0, v3, v13, v2}, Lbs1/i;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_17
    move-object v10, v0

    check-cast v10, Lc93/a;

    shl-int/lit8 v0, v4, 0x3

    and-int/lit16 v1, v0, 0x380

    or-int/lit8 v1, v1, 0x6

    and-int/lit16 v0, v0, 0x1c00

    or-int v12, v1, v0

    const/4 v13, 0x0

    move/from16 v9, p0

    move/from16 v8, p1

    move/from16 v7, v47

    invoke-static/range {v6 .. v13}, Leg2/e;->g(Leg2/k;ZZZLc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    move-object v4, v3

    move v2, v8

    move-object/from16 v1, v48

    :goto_18
    move v3, v9

    goto :goto_19

    :cond_24
    invoke-virtual {v11}, Lp1/q;->X()V

    move/from16 v2, p1

    move-object v1, v3

    move-object v4, v13

    goto :goto_18

    :goto_19
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_25

    new-instance v0, Lfg2/i;

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lfg2/i;-><init>(Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function1;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_25
    return-void
.end method

.method private static final h(Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lp1/c1;)Ljava/lang/String;
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

.method private static final j(Lp1/c1;Ljava/lang/String;)V
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

.method private static final k(Lp1/c1;)Z
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

.method private static final l(Lp1/c1;Z)V
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

.method private static final m()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final n(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lfg2/j;->j(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lfg2/j;->l(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1}, Lfg2/j;->i(Lp1/c1;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lfg2/j;->g(Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
