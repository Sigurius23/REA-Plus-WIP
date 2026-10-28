.class public abstract Ljy0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001aY\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00002\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\'\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "",
        "isEmpty",
        "emptyTile",
        "Li91/a;",
        "pillBackground",
        "Li2/x;",
        "backgroundColor",
        "Lkd1/o;",
        "icon",
        "Lcom/whoop/design/util/TextResource;",
        "secondaryText",
        "Lgz0/m0;",
        "secondaryIcon",
        "Ll83/a0;",
        "b",
        "(ZZLi91/a;JLkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;Landroidx/compose/runtime/Composer;II)V",
        "emptyPill",
        "d",
        "(ZZJLandroidx/compose/runtime/Composer;I)J",
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
.method public static synthetic a(ZZLi91/a;JLkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p11}, Ljy0/b;->c(ZZLi91/a;JLkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(ZZLi91/a;JLkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;Landroidx/compose/runtime/Composer;II)V
    .locals 43

    move-object/from16 v6, p5

    move/from16 v9, p9

    const-string v0, "icon"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p8

    check-cast v14, Lp1/q;

    const v0, 0x130d2665

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p10, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v2, v9, 0x6

    move v3, v2

    move/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v9, 0x6

    if-nez v2, :cond_2

    move/from16 v2, p0

    invoke-virtual {v14, v2}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v9

    goto :goto_1

    :cond_2
    move/from16 v2, p0

    move v3, v9

    :goto_1
    and-int/lit8 v4, p10, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move/from16 v5, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v5, v9, 0x30

    if-nez v5, :cond_3

    move/from16 v5, p1

    invoke-virtual {v14, v5}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x20

    goto :goto_2

    :cond_5
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v3, v8

    :goto_3
    and-int/lit8 v8, p10, 0x4

    if-eqz v8, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move-object/from16 v10, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v10, v9, 0x180

    if-nez v10, :cond_6

    move-object/from16 v10, p2

    invoke-virtual {v14, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x100

    goto :goto_4

    :cond_8
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v3, v11

    :goto_5
    and-int/lit16 v11, v9, 0xc00

    if-nez v11, :cond_b

    and-int/lit8 v11, p10, 0x8

    if-nez v11, :cond_9

    move-wide/from16 v11, p3

    invoke-virtual {v14, v11, v12}, Lp1/q;->f(J)Z

    move-result v13

    if-eqz v13, :cond_a

    const/16 v13, 0x800

    goto :goto_6

    :cond_9
    move-wide/from16 v11, p3

    :cond_a
    const/16 v13, 0x400

    :goto_6
    or-int/2addr v3, v13

    goto :goto_7

    :cond_b
    move-wide/from16 v11, p3

    :goto_7
    and-int/lit16 v13, v9, 0x6000

    if-nez v13, :cond_d

    invoke-virtual {v14, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_c

    const/16 v13, 0x4000

    goto :goto_8

    :cond_c
    const/16 v13, 0x2000

    :goto_8
    or-int/2addr v3, v13

    :cond_d
    and-int/lit8 v13, p10, 0x20

    const/high16 v15, 0x30000

    if-eqz v13, :cond_f

    or-int/2addr v3, v15

    :cond_e
    move-object/from16 v15, p6

    goto :goto_a

    :cond_f
    and-int/2addr v15, v9

    if-nez v15, :cond_e

    move-object/from16 v15, p6

    invoke-virtual {v14, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x20000

    goto :goto_9

    :cond_10
    const/high16 v16, 0x10000

    :goto_9
    or-int v3, v3, v16

    :goto_a
    and-int/lit8 v16, p10, 0x40

    const/high16 v17, 0x180000

    if-eqz v16, :cond_11

    or-int v3, v3, v17

    goto :goto_e

    :cond_11
    and-int v17, v9, v17

    if-nez v17, :cond_14

    if-nez p7, :cond_12

    const/16 v17, -0x1

    :goto_b
    move/from16 v7, v17

    goto :goto_c

    :cond_12
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Enum;->ordinal()I

    move-result v17

    goto :goto_b

    :goto_c
    invoke-virtual {v14, v7}, Lp1/q;->e(I)Z

    move-result v7

    if-eqz v7, :cond_13

    const/high16 v7, 0x100000

    goto :goto_d

    :cond_13
    const/high16 v7, 0x80000

    :goto_d
    or-int/2addr v3, v7

    :cond_14
    :goto_e
    const v7, 0x92493

    and-int/2addr v7, v3

    const v1, 0x92492

    move/from16 v18, v8

    const/4 v8, 0x0

    const/4 v2, 0x1

    if-eq v7, v1, :cond_15

    move v1, v2

    goto :goto_f

    :cond_15
    move v1, v8

    :goto_f
    and-int/lit8 v7, v3, 0x1

    invoke-virtual {v14, v7, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_26

    invoke-virtual {v14}, Lp1/q;->Z()V

    and-int/lit8 v1, v9, 0x1

    const/4 v7, 0x6

    if-eqz v1, :cond_18

    invoke-virtual {v14}, Lp1/q;->C()Z

    move-result v1

    if-eqz v1, :cond_16

    goto :goto_10

    :cond_16
    invoke-virtual {v14}, Lp1/q;->X()V

    and-int/lit8 v0, p10, 0x8

    if-eqz v0, :cond_17

    and-int/lit16 v3, v3, -0x1c01

    :cond_17
    move-object/from16 v37, p7

    move/from16 v16, v3

    move-object/from16 v36, v10

    move-wide v12, v11

    move-object v0, v15

    move/from16 v11, p0

    move v10, v5

    goto :goto_13

    :cond_18
    :goto_10
    if-eqz v0, :cond_19

    move v0, v8

    goto :goto_11

    :cond_19
    move/from16 v0, p0

    :goto_11
    if-eqz v4, :cond_1a

    move v5, v8

    :cond_1a
    const/4 v1, 0x0

    if-eqz v18, :cond_1b

    move-object v10, v1

    :cond_1b
    and-int/lit8 v4, p10, 0x8

    if-eqz v4, :cond_1c

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-virtual {v4, v14, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->q()J

    move-result-wide v11

    and-int/lit16 v3, v3, -0x1c01

    :cond_1c
    if-eqz v13, :cond_1d

    move-object v15, v1

    :cond_1d
    if-eqz v16, :cond_1e

    move-object/from16 v37, v1

    :goto_12
    move/from16 v16, v3

    move-object/from16 v36, v10

    move-wide v12, v11

    move v11, v0

    move v10, v5

    move-object v0, v15

    goto :goto_13

    :cond_1e
    move-object/from16 v37, p7

    goto :goto_12

    :goto_13
    invoke-virtual {v14}, Lp1/q;->r()V

    if-eqz v36, :cond_1f

    const v1, 0x74cec50

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1, v14, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->V0()J

    move-result-wide v3

    invoke-virtual {v14, v8}, Lp1/q;->q(Z)V

    move/from16 v38, v10

    move/from16 v39, v11

    move-wide/from16 v40, v12

    goto :goto_14

    :cond_1f
    const v1, 0x74db953

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    shr-int/lit8 v1, v16, 0x3

    and-int/lit8 v3, v1, 0xe

    shl-int/lit8 v4, v16, 0x3

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v3, v4

    and-int/lit16 v1, v1, 0x380

    or-int v15, v3, v1

    invoke-static/range {v10 .. v15}, Ljy0/b;->d(ZZJLandroidx/compose/runtime/Composer;I)J

    move-result-wide v3

    move/from16 v38, v10

    move/from16 v39, v11

    move-wide/from16 v40, v12

    invoke-virtual {v14, v8}, Lp1/q;->q(Z)V

    :goto_14
    sget-object v1, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v1}, Lkd1/w;->b()Lk91/a;

    move-result-object v1

    invoke-virtual {v1}, Lk91/a;->c()Lt0/i;

    move-result-object v1

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v1}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v18

    if-nez v36, :cond_20

    invoke-static/range {v40 .. v41}, Li91/c;->o(J)Li91/a;

    move-result-object v5

    move-object/from16 v19, v5

    goto :goto_15

    :cond_20
    move-object/from16 v19, v36

    :goto_15
    const/16 v22, 0x4

    const/16 v23, 0x0

    const/16 v21, 0x0

    move-object/from16 v20, v1

    invoke-static/range {v18 .. v23}, Li91/c;->e(Landroidx/compose/ui/Modifier;Li91/a;Li2/a1;Ljava/lang/Float;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v5, v20

    int-to-float v11, v2

    invoke-static {v1, v11, v3, v4, v5}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v11, v3

    invoke-static {v11, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v3, 0x15

    int-to-float v3, v3

    const/4 v4, 0x4

    int-to-float v11, v4

    mul-float/2addr v3, v11

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Ll0/m;->e:Ll0/h;

    sget-object v4, Lb2/e;->K:Lb2/l;

    const/16 v5, 0x36

    invoke-static {v3, v4, v14, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v4, v14, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v14, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v13, v14, Lp1/q;->S:Z

    if-eqz v13, :cond_21

    invoke-virtual {v14, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_16

    :cond_21
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_16
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v14, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v14, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v14, Lp1/q;->S:Z

    if-nez v5, :cond_22

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v5, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_23

    :cond_22
    invoke-static {v4, v14, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_23
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v14, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v1, v7

    mul-float v12, v1, v11

    invoke-static {v12, v10}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    shr-int/lit8 v1, v16, 0xc

    and-int/lit8 v4, v1, 0xe

    const/4 v5, 0x3

    const/4 v1, 0x0

    move v3, v2

    const/4 v2, 0x0

    move v15, v3

    move-object v3, v14

    move-object v14, v0

    move-object v0, v6

    invoke-static/range {v0 .. v5}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v1

    move-object v6, v3

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v6, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v4

    move v2, v7

    const/16 v7, 0x1b0

    move v3, v8

    const/4 v8, 0x0

    move/from16 v17, v2

    const/4 v2, 0x0

    move-object v3, v13

    move/from16 v15, v17

    const/4 v13, 0x2

    invoke-static/range {v1 .. v8}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    if-nez v39, :cond_24

    if-eqz v14, :cond_24

    const v1, 0x444283c6

    invoke-virtual {v6, v1}, Lp1/q;->e0(I)V

    int-to-float v1, v13

    invoke-static {v1, v11, v10, v6}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    shr-int/lit8 v1, v16, 0xf

    and-int/lit8 v1, v1, 0xe

    invoke-static {v14, v6, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v6, v15}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->C()Lb91/a;

    move-result-object v30

    invoke-virtual {v0, v6, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v12

    const/16 v34, 0x0

    const v35, 0x2fffa

    const/4 v11, 0x0

    move-object v0, v14

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    move-object/from16 v42, v0

    move-object/from16 v32, v6

    const/4 v3, 0x1

    invoke-static/range {v10 .. v35}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    const/4 v14, 0x0

    invoke-virtual {v6, v14}, Lp1/q;->q(Z)V

    move v15, v3

    goto :goto_17

    :cond_24
    move-object/from16 v42, v14

    const/4 v3, 0x1

    const/4 v14, 0x0

    if-eqz v37, :cond_25

    const v1, 0x4446dab0

    invoke-virtual {v6, v1}, Lp1/q;->e0(I)V

    int-to-float v1, v13

    invoke-static {v1, v11, v10, v6}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    invoke-static {v12, v10}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual/range {v37 .. v37}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    invoke-static {v2, v6, v15}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v2

    invoke-virtual {v0, v6, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v4

    const/16 v7, 0x1b0

    const/4 v8, 0x0

    move v15, v3

    move-object v3, v1

    move-object v1, v2

    const/4 v2, 0x0

    invoke-static/range {v1 .. v8}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v6, v14}, Lp1/q;->q(Z)V

    goto :goto_17

    :cond_25
    move v15, v3

    const v0, 0x444bcbc1

    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v14}, Lp1/q;->q(Z)V

    :goto_17
    invoke-virtual {v6, v15}, Lp1/q;->q(Z)V

    move-object/from16 v3, v36

    move-object/from16 v8, v37

    move/from16 v2, v38

    move/from16 v1, v39

    move-wide/from16 v4, v40

    move-object/from16 v7, v42

    goto :goto_18

    :cond_26
    move-object v6, v14

    invoke-virtual {v6}, Lp1/q;->X()V

    move/from16 v1, p0

    move-object/from16 v8, p7

    move v2, v5

    move-object v3, v10

    move-wide v4, v11

    move-object v7, v15

    :goto_18
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_27

    new-instance v0, Ljy0/a;

    move-object/from16 v6, p5

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Ljy0/a;-><init>(ZZLi91/a;JLkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;II)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_27
    return-void
.end method

.method private static final c(ZZLi91/a;JLkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    or-int/lit8 v0, p8, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v10

    move v1, p0

    move v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v11, p9

    move-object/from16 v9, p10

    invoke-static/range {v1 .. v11}, Ljy0/b;->b(ZZLi91/a;JLkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(ZZJLandroidx/compose/runtime/Composer;I)J
    .locals 0

    check-cast p4, Lp1/q;

    const p5, 0x2e4e8cf1

    invoke-virtual {p4, p5}, Lp1/q;->e0(I)V

    const/4 p5, 0x0

    if-eqz p1, :cond_0

    if-nez p0, :cond_0

    const p0, -0x38fa8482

    invoke-virtual {p4, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    const/4 p1, 0x6

    invoke-virtual {p0, p4, p1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->w()J

    move-result-wide p0

    invoke-virtual {p4, p5}, Lp1/q;->q(Z)V

    :goto_0
    invoke-virtual {p4, p5}, Lp1/q;->q(Z)V

    return-wide p0

    :cond_0
    const p1, -0x38f99acc

    invoke-virtual {p4, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p4, p5}, Lp1/q;->q(Z)V

    if-eqz p0, :cond_1

    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    const/high16 p0, 0x3f800000    # 1.0f

    :goto_1
    invoke-static {p0, p2, p3}, Li2/x;->c(FJ)J

    move-result-wide p0

    goto :goto_0
.end method
