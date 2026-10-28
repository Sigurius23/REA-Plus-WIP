.class public abstract Lsz0/m1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aU\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\n\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "icon",
        "Lcom/whoop/design/util/TextResource;",
        "stat",
        "Lsz0/g1;",
        "statTrend",
        "statTitle",
        "",
        "isPressed",
        "Li2/x;",
        "statValueTextColor",
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZJLandroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZJIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p11}, Lsz0/m1;->c(Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZJIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZJLandroidx/compose/runtime/Composer;II)V
    .locals 44

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v9, p9

    const-string v0, "stat"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "statTitle"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p8

    check-cast v15, Lp1/q;

    const v0, 0x12fe0553

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p10, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v2, v9, 0x6

    move v4, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v9, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v15, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v9

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v4, v9

    :goto_1
    and-int/lit8 v6, p10, 0x2

    if-eqz v6, :cond_4

    or-int/lit8 v4, v4, 0x30

    :cond_3
    move-object/from16 v7, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v7, v9, 0x30

    if-nez v7, :cond_3

    move-object/from16 v7, p1

    invoke-virtual {v15, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x20

    goto :goto_2

    :cond_5
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v4, v8

    :goto_3
    and-int/lit16 v8, v9, 0x180

    if-nez v8, :cond_7

    invoke-virtual {v15, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x100

    goto :goto_4

    :cond_6
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v4, v8

    :cond_7
    and-int/lit8 v8, p10, 0x8

    if-eqz v8, :cond_9

    or-int/lit16 v4, v4, 0xc00

    :cond_8
    move-object/from16 v10, p3

    goto :goto_6

    :cond_9
    and-int/lit16 v10, v9, 0xc00

    if-nez v10, :cond_8

    move-object/from16 v10, p3

    invoke-virtual {v15, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_5

    :cond_a
    const/16 v11, 0x400

    :goto_5
    or-int/2addr v4, v11

    :goto_6
    and-int/lit16 v11, v9, 0x6000

    if-nez v11, :cond_c

    invoke-virtual {v15, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_b

    const/16 v11, 0x4000

    goto :goto_7

    :cond_b
    const/16 v11, 0x2000

    :goto_7
    or-int/2addr v4, v11

    :cond_c
    and-int/lit8 v11, p10, 0x20

    const/high16 v12, 0x30000

    if-eqz v11, :cond_e

    or-int/2addr v4, v12

    :cond_d
    move/from16 v12, p5

    goto :goto_9

    :cond_e
    and-int/2addr v12, v9

    if-nez v12, :cond_d

    move/from16 v12, p5

    invoke-virtual {v15, v12}, Lp1/q;->h(Z)Z

    move-result v13

    if-eqz v13, :cond_f

    const/high16 v13, 0x20000

    goto :goto_8

    :cond_f
    const/high16 v13, 0x10000

    :goto_8
    or-int/2addr v4, v13

    :goto_9
    const/high16 v13, 0x180000

    and-int/2addr v13, v9

    if-nez v13, :cond_12

    and-int/lit8 v13, p10, 0x40

    if-nez v13, :cond_10

    move-wide/from16 v13, p6

    invoke-virtual {v15, v13, v14}, Lp1/q;->f(J)Z

    move-result v16

    if-eqz v16, :cond_11

    const/high16 v16, 0x100000

    goto :goto_a

    :cond_10
    move-wide/from16 v13, p6

    :cond_11
    const/high16 v16, 0x80000

    :goto_a
    or-int v4, v4, v16

    goto :goto_b

    :cond_12
    move-wide/from16 v13, p6

    :goto_b
    const v16, 0x92493

    and-int v1, v4, v16

    move/from16 v16, v0

    const v0, 0x92492

    move/from16 v17, v11

    if-eq v1, v0, :cond_13

    const/4 v0, 0x1

    goto :goto_c

    :cond_13
    const/4 v0, 0x0

    :goto_c
    and-int/lit8 v1, v4, 0x1

    invoke-virtual {v15, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_20

    invoke-virtual {v15}, Lp1/q;->Z()V

    and-int/lit8 v0, v9, 0x1

    sget-object v1, Lb2/t;->w:Lb2/t;

    const v19, -0x380001

    const/4 v11, 0x6

    if-eqz v0, :cond_16

    invoke-virtual {v15}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_14

    goto :goto_e

    :cond_14
    invoke-virtual {v15}, Lp1/q;->X()V

    and-int/lit8 v0, p10, 0x40

    if-eqz v0, :cond_15

    :goto_d
    and-int v4, v4, v19

    :cond_15
    move v6, v4

    move-object v0, v10

    move v4, v12

    move-wide/from16 v36, v13

    goto :goto_f

    :cond_16
    :goto_e
    if-eqz v16, :cond_17

    move-object v2, v1

    :cond_17
    const/4 v0, 0x0

    if-eqz v6, :cond_18

    move-object v7, v0

    :cond_18
    if-eqz v8, :cond_19

    move-object v10, v0

    :cond_19
    if-eqz v17, :cond_1a

    const/4 v12, 0x0

    :cond_1a
    and-int/lit8 v0, p10, 0x40

    if-eqz v0, :cond_15

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v15, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v13

    goto :goto_d

    :goto_f
    invoke-virtual {v15}, Lp1/q;->r()V

    sget-object v8, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    const/4 v12, 0x0

    invoke-static {v8, v10, v15, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v12, v15, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v15, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v11, v15, Lp1/q;->S:Z

    if-eqz v11, :cond_1b

    invoke-virtual {v15, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_1b
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_10
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v15, v11, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v15, v8, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v11, v15, Lp1/q;->S:Z

    if-nez v11, :cond_1c

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1d

    :cond_1c
    invoke-static {v10, v15, v10, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1d
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v15, v8, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-nez v7, :cond_1e

    const v8, 0x4da8a282    # 3.536528E8f

    invoke-virtual {v15, v8}, Lp1/q;->e0(I)V

    const/4 v12, 0x0

    invoke-virtual {v15, v12}, Lp1/q;->q(Z)V

    move-object/from16 p0, v0

    move v8, v12

    const/4 v0, 0x6

    :goto_11
    const/4 v11, 0x4

    goto :goto_12

    :cond_1e
    const/4 v12, 0x0

    const v8, 0x4da8a283    # 3.5365283E8f

    invoke-virtual {v15, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v8

    const/4 v10, 0x5

    int-to-float v10, v10

    const/4 v11, 0x4

    int-to-float v13, v11

    mul-float/2addr v10, v13

    invoke-static {v10, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/4 v11, 0x6

    invoke-static {v8, v15, v11}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v8

    sget-object v13, Lx81/d;->a:Lx81/d;

    invoke-virtual {v13, v15, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->b1()J

    move-result-wide v13

    const/16 v16, 0x1b0

    const/16 v17, 0x0

    move/from16 v18, v11

    const/4 v11, 0x0

    move-object/from16 p0, v10

    move-object v10, v8

    move v8, v12

    move-object/from16 v12, p0

    move-object/from16 p0, v0

    move/from16 v0, v18

    invoke-static/range {v10 .. v17}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15, v8}, Lp1/q;->q(Z)V

    goto :goto_11

    :goto_12
    int-to-float v10, v11

    invoke-static {v10, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v15, v11}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    shr-int/lit8 v11, v6, 0xc

    and-int/lit8 v12, v11, 0xe

    invoke-static {v5, v15, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v12

    sget-object v13, Lx81/d;->a:Lx81/d;

    invoke-virtual {v13, v15, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v14

    invoke-virtual {v14}, Lb91/d;->M()Lb91/a;

    move-result-object v30

    invoke-virtual {v13, v15, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->b1()J

    move-result-wide v16

    const/16 v34, 0x0

    const v35, 0x2fffa

    move v14, v11

    const/4 v11, 0x0

    move/from16 v18, v14

    move-object/from16 v32, v15

    const-wide/16 v14, 0x0

    move-object/from16 v19, v13

    move-wide/from16 v42, v16

    move/from16 v17, v10

    move-object v10, v12

    move-wide/from16 v12, v42

    const/16 v16, 0x0

    move/from16 v20, v17

    const/16 v17, 0x0

    move/from16 v21, v18

    const/16 v18, 0x0

    move-object/from16 v23, v19

    move/from16 v22, v20

    const-wide/16 v19, 0x0

    move/from16 v24, v21

    const/16 v21, 0x0

    move/from16 v25, v22

    const/16 v22, 0x0

    move-object/from16 v27, v23

    move/from16 v26, v24

    const-wide/16 v23, 0x0

    move/from16 v28, v25

    const/16 v25, 0x0

    move/from16 v29, v26

    const/16 v26, 0x0

    move-object/from16 v31, v27

    const/16 v27, 0x0

    move/from16 v33, v28

    const/16 v28, 0x0

    move/from16 v38, v29

    const/16 v29, 0x0

    move-object/from16 v39, v31

    const/16 v31, 0x0

    move/from16 v40, v33

    const/16 v33, 0x0

    move-object/from16 v8, v39

    move-object/from16 v39, v2

    move-object v2, v8

    move/from16 v8, v38

    move/from16 v41, v40

    invoke-static/range {v10 .. v35}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v32

    shr-int/2addr v6, v0

    and-int/lit8 v10, v6, 0xe

    invoke-static {v3, v15, v10}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2, v15, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->y()Lb91/a;

    move-result-object v30

    and-int/lit16 v0, v8, 0x380

    const-wide/16 v14, 0x0

    move/from16 v33, v0

    move-wide/from16 v12, v36

    invoke-static/range {v10 .. v35}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-wide/from16 v29, v12

    move-object/from16 v15, v32

    if-nez p0, :cond_1f

    const v0, 0x4db297a7    # 3.745354E8f

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    const/4 v12, 0x0

    invoke-virtual {v15, v12}, Lp1/q;->q(Z)V

    move v13, v4

    :goto_13
    const/4 v0, 0x1

    goto :goto_14

    :cond_1f
    const v0, 0x4db297a8    # 3.7453542E8f

    move/from16 v2, v41

    invoke-static {v15, v0, v1, v2, v15}, Lr80/c;->C(Lp1/q;ILb2/t;FLp1/q;)V

    invoke-virtual/range {p0 .. p0}, Lsz0/g1;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Lsz0/g1;->b()Lhy0/b2;

    move-result-object v12

    and-int/lit16 v0, v6, 0x1c00

    or-int/lit8 v26, v0, 0x30

    const/16 v27, 0x0

    const/16 v28, 0x7ff0

    const/4 v11, 0x1

    const/4 v14, 0x0

    move-object/from16 v32, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move v13, v4

    move-object/from16 v25, v32

    invoke-static/range {v10 .. v28}, Lhy0/z1;->e(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;FLhy0/s0;ZFLl0/k1;ZIILb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v25

    const/4 v12, 0x0

    invoke-virtual {v15, v12}, Lp1/q;->q(Z)V

    goto :goto_13

    :goto_14
    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    move-object/from16 v4, p0

    move-object v2, v7

    move v6, v13

    move-wide/from16 v7, v29

    move-object/from16 v1, v39

    goto :goto_15

    :cond_20
    invoke-virtual {v15}, Lp1/q;->X()V

    move-object v1, v2

    move-object v2, v7

    move-object v4, v10

    move v6, v12

    move-wide v7, v13

    :goto_15
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_21

    new-instance v0, Lg1/d0;

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lg1/d0;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZJII)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_21
    return-void
.end method

.method private static final c(Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZJIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    or-int/lit8 v0, p8, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-wide/from16 v7, p6

    move/from16 v11, p9

    move-object/from16 v9, p10

    invoke-static/range {v1 .. v11}, Lsz0/m1;->b(Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZJLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
