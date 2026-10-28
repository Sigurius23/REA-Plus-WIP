.class public abstract Lw71/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001as\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u000cH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "question",
        "context",
        "level",
        "",
        "min",
        "max",
        "increment",
        "preSetNumber",
        "",
        "isSubQuestion",
        "enabled",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "selectedNumber",
        "c",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILjava/lang/Integer;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILjava/lang/Integer;ZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p13}, Lw71/p;->e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILjava/lang/Integer;ZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lw71/p;->d(Lkotlin/jvm/functions/Function1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILjava/lang/Integer;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 44
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "III",
            "Ljava/lang/Integer;",
            "ZZ",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v7, p2

    move/from16 v8, p3

    move/from16 v9, p4

    move-object/from16 v10, p9

    move/from16 v11, p11

    move/from16 v12, p12

    const-string v2, "question"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "level"

    invoke-static {v7, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "selectedNumber"

    invoke-static {v10, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p10

    check-cast v4, Lp1/q;

    const v2, 0x1ebec0ae

    invoke-virtual {v4, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v11, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v11

    goto :goto_1

    :cond_1
    move v2, v11

    :goto_1
    and-int/lit8 v3, v11, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, v11, 0x180

    if-nez v3, :cond_5

    invoke-virtual {v4, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v2, v3

    :cond_5
    and-int/lit16 v3, v11, 0xc00

    if-nez v3, :cond_7

    invoke-virtual {v4, v8}, Lp1/q;->e(I)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x800

    goto :goto_4

    :cond_6
    const/16 v3, 0x400

    :goto_4
    or-int/2addr v2, v3

    :cond_7
    and-int/lit16 v3, v11, 0x6000

    if-nez v3, :cond_9

    invoke-virtual {v4, v9}, Lp1/q;->e(I)Z

    move-result v3

    if-eqz v3, :cond_8

    const/16 v3, 0x4000

    goto :goto_5

    :cond_8
    const/16 v3, 0x2000

    :goto_5
    or-int/2addr v2, v3

    :cond_9
    and-int/lit8 v3, v12, 0x20

    const/high16 v5, 0x30000

    if-eqz v3, :cond_b

    or-int/2addr v2, v5

    :cond_a
    move/from16 v5, p5

    goto :goto_7

    :cond_b
    and-int/2addr v5, v11

    if-nez v5, :cond_a

    move/from16 v5, p5

    invoke-virtual {v4, v5}, Lp1/q;->e(I)Z

    move-result v6

    if-eqz v6, :cond_c

    const/high16 v6, 0x20000

    goto :goto_6

    :cond_c
    const/high16 v6, 0x10000

    :goto_6
    or-int/2addr v2, v6

    :goto_7
    and-int/lit8 v6, v12, 0x40

    const/high16 v14, 0x180000

    if-eqz v6, :cond_e

    or-int/2addr v2, v14

    :cond_d
    move-object/from16 v14, p6

    goto :goto_9

    :cond_e
    and-int/2addr v14, v11

    if-nez v14, :cond_d

    move-object/from16 v14, p6

    invoke-virtual {v4, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_f

    const/high16 v15, 0x100000

    goto :goto_8

    :cond_f
    const/high16 v15, 0x80000

    :goto_8
    or-int/2addr v2, v15

    :goto_9
    and-int/lit16 v15, v12, 0x80

    const/high16 v16, 0xc00000

    if-eqz v15, :cond_10

    or-int v2, v2, v16

    move/from16 v13, p7

    goto :goto_b

    :cond_10
    and-int v16, v11, v16

    move/from16 v13, p7

    if-nez v16, :cond_12

    invoke-virtual {v4, v13}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_11

    const/high16 v16, 0x800000

    goto :goto_a

    :cond_11
    const/high16 v16, 0x400000

    :goto_a
    or-int v2, v2, v16

    :cond_12
    :goto_b
    const/high16 v16, 0x6000000

    and-int v16, v11, v16

    if-nez v16, :cond_14

    move/from16 v16, v3

    move/from16 v3, p8

    invoke-virtual {v4, v3}, Lp1/q;->h(Z)Z

    move-result v17

    if-eqz v17, :cond_13

    const/high16 v17, 0x4000000

    goto :goto_c

    :cond_13
    const/high16 v17, 0x2000000

    :goto_c
    or-int v2, v2, v17

    goto :goto_d

    :cond_14
    move/from16 v16, v3

    move/from16 v3, p8

    :goto_d
    const/high16 v17, 0x30000000

    and-int v17, v11, v17

    if-nez v17, :cond_16

    invoke-virtual {v4, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_15

    const/high16 v17, 0x20000000

    goto :goto_e

    :cond_15
    const/high16 v17, 0x10000000

    :goto_e
    or-int v2, v2, v17

    :cond_16
    move/from16 v39, v2

    const v2, 0x12492493

    and-int v2, v39, v2

    const v3, 0x12492492

    const/16 v40, 0x0

    move/from16 v18, v6

    if-eq v2, v3, :cond_17

    const/4 v2, 0x1

    goto :goto_f

    :cond_17
    move/from16 v2, v40

    :goto_f
    and-int/lit8 v3, v39, 0x1

    invoke-virtual {v4, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_29

    if-eqz v16, :cond_18

    const/4 v5, 0x1

    :cond_18
    if-eqz v18, :cond_19

    const/4 v2, 0x0

    move-object/from16 v41, v2

    goto :goto_10

    :cond_19
    move-object/from16 v41, v14

    :goto_10
    if-eqz v15, :cond_1a

    move/from16 v42, v40

    goto :goto_11

    :cond_1a
    move/from16 v42, v13

    :goto_11
    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-ne v2, v13, :cond_1b

    invoke-static/range {v41 .. v41}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    move-object/from16 v43, v2

    check-cast v43, Lp1/c1;

    sget-object v2, Lw71/c;->a:Lw71/c;

    if-eqz v42, :cond_1c

    invoke-virtual {v2}, Lw71/c;->b()F

    move-result v2

    :goto_12
    move/from16 v19, v2

    goto :goto_13

    :cond_1c
    invoke-virtual {v2}, Lw71/c;->a()F

    move-result v2

    goto :goto_12

    :goto_13
    const/high16 v14, 0x3f800000    # 1.0f

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v14, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v18

    const/16 v22, 0x0

    const/16 v23, 0xe

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->K:Lb2/l;

    sget-object v6, Ll0/m;->g:Ll0/h;

    const/16 v14, 0x36

    invoke-static {v6, v3, v4, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    move/from16 v18, v5

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v4, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v0, v4, Lp1/q;->S:Z

    if-eqz v0, :cond_1d

    invoke-virtual {v4, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_14

    :cond_1d
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_14
    sget-object v0, La3/k;->g:La3/i;

    invoke-static {v4, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v4, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    move-object/from16 p6, v0

    iget-boolean v0, v4, Lp1/q;->S:Z

    if-nez v0, :cond_1e

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 p7, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    goto :goto_15

    :cond_1e
    move-object/from16 p7, v3

    :goto_15
    invoke-static {v5, v4, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1f
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v4, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v2, v39, 0x3

    and-int/lit8 v2, v2, 0xe

    invoke-static {v1, v4, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_20

    const/4 v2, 0x1

    goto :goto_16

    :cond_20
    move/from16 v2, v40

    :goto_16
    and-int/lit8 v5, v39, 0x7e

    move-object v3, v6

    const/16 v6, 0x8

    move-object/from16 v20, v3

    const/4 v3, 0x0

    const/4 v9, 0x1

    move-object/from16 v10, p6

    move-object/from16 v11, p7

    move-object/from16 p7, v0

    move/from16 p6, v18

    move/from16 v12, v19

    move-object/from16 v8, v20

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v6}, Lw71/z;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLw71/a0;Landroidx/compose/runtime/Composer;II)V

    shr-int/lit8 v0, v39, 0x6

    and-int/lit8 v0, v0, 0xe

    invoke-static {v7, v4, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    int-to-float v1, v9

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v15, v1, v2, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v5, Lx81/d;->a:Lx81/d;

    const/4 v6, 0x6

    invoke-virtual {v5, v4, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ly81/i;->X()J

    move-result-wide v16

    invoke-virtual {v5, v4, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Lb91/d;->s()Lb91/a;

    move-result-object v33

    const/16 v37, 0x0

    const v38, 0x2fff8

    move-object/from16 v19, v15

    move-wide/from16 v15, v16

    const-wide/16 v17, 0x0

    move-object/from16 v20, v19

    const/16 v19, 0x0

    move-object/from16 v21, v20

    const/16 v20, 0x0

    move-object/from16 v22, v21

    const/16 v21, 0x0

    move-object/from16 v24, v22

    const-wide/16 v22, 0x0

    move-object/from16 v25, v24

    const/16 v24, 0x0

    move-object/from16 v26, v25

    const/16 v25, 0x0

    move-object/from16 v28, v26

    const-wide/16 v26, 0x0

    move-object/from16 v29, v28

    const/16 v28, 0x0

    move-object/from16 v30, v29

    const/16 v29, 0x0

    move-object/from16 v31, v30

    const/16 v30, 0x0

    move-object/from16 v32, v31

    const/16 v31, 0x0

    move-object/from16 v34, v32

    const/16 v32, 0x0

    move-object/from16 v35, v34

    const/16 v34, 0x0

    const/16 v36, 0x30

    move-object/from16 v6, v35

    move-object/from16 v35, v4

    move-object v4, v13

    move-object v13, v0

    move-object v0, v14

    move-object v14, v1

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static/range {v13 .. v38}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v35

    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    invoke-static {v1, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1, v12, v2, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Ll0/m;->e:Ll0/h;

    sget-object v3, Lb2/e;->J:Lb2/l;

    const/4 v6, 0x6

    invoke-static {v2, v3, v13, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v14, v13, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v13, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-eqz v12, :cond_21

    invoke-virtual {v13, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_17

    :cond_21
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_17
    invoke-static {v13, v10, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v11, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v13, Lp1/q;->S:Z

    if-nez v0, :cond_23

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_22

    goto :goto_19

    :cond_22
    :goto_18
    move-object/from16 v0, p7

    goto :goto_1a

    :cond_23
    :goto_19
    invoke-static {v3, v13, v3, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_18

    :goto_1a
    invoke-static {v13, v0, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v6, 0x6

    invoke-virtual {v5, v13, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->X()J

    move-result-wide v0

    new-instance v2, Li93/j;

    move/from16 v8, p3

    move/from16 v3, p4

    invoke-direct {v2, v8, v3, v9}, Li93/h;-><init>(III)V

    move/from16 v5, p6

    invoke-static {v5, v2}, Le93/b;->d0(ILi93/j;)Li93/h;

    move-result-object v2

    invoke-interface/range {v43 .. v43}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v6

    move-object v14, v6

    check-cast v14, Ljava/lang/Integer;

    invoke-virtual {v13, v0, v1}, Lp1/q;->f(J)Z

    move-result v6

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v6, :cond_24

    if-ne v10, v4, :cond_25

    :cond_24
    new-instance v10, Lw71/p$a;

    invoke-direct {v10, v0, v1}, Lw71/p$a;-><init>(J)V

    invoke-virtual {v13, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_25
    move-object/from16 v16, v10

    check-cast v16, Lc93/a;

    const/high16 v0, 0x70000000

    and-int v0, v39, v0

    const/high16 v1, 0x20000000

    if-ne v0, v1, :cond_26

    move/from16 v40, v9

    :cond_26
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v40, :cond_28

    if-ne v0, v4, :cond_27

    goto :goto_1b

    :cond_27
    move-object/from16 v10, p9

    goto :goto_1c

    :cond_28
    :goto_1b
    new-instance v0, Lv41/b0;

    const/16 v1, 0x19

    move-object/from16 v10, p9

    invoke-direct {v0, v10, v1}, Lv41/b0;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1c
    move-object/from16 v17, v0

    check-cast v17, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v0, v39, 0x12

    and-int/lit16 v0, v0, 0x380

    const/16 v20, 0x0

    move/from16 v15, p8

    move/from16 v19, v0

    move-object/from16 v18, v13

    move-object v13, v2

    invoke-static/range {v13 .. v20}, Lz21/b;->l(Li93/h;Ljava/lang/Integer;ZLc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v4, v18

    invoke-virtual {v4, v9}, Lp1/q;->q(Z)V

    move-object/from16 v7, v41

    move/from16 v8, v42

    :goto_1d
    move v6, v5

    goto :goto_1e

    :cond_29
    move v3, v9

    invoke-virtual {v4}, Lp1/q;->X()V

    move v8, v13

    move-object v7, v14

    goto :goto_1d

    :goto_1e
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v13

    if-eqz v13, :cond_2a

    new-instance v0, Lw71/o;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p3

    move/from16 v9, p8

    move/from16 v11, p11

    move/from16 v12, p12

    move v5, v3

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v12}, Lw71/o;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILjava/lang/Integer;ZZLkotlin/jvm/functions/Function1;II)V

    iput-object v0, v13, Lp1/v1;->d:Lc93/m;

    :cond_2a
    return-void
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;I)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILjava/lang/Integer;ZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 14

    or-int/lit8 v0, p10, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v12

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v13, p11

    move-object/from16 v11, p12

    invoke-static/range {v1 .. v13}, Lw71/p;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILjava/lang/Integer;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
