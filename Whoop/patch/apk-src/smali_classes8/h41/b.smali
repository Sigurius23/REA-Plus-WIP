.class public abstract Lh41/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a/\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u001a3\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0005H\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lh41/c;",
        "itemState",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "i",
        "(Landroidx/compose/ui/Modifier;Lh41/c;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "o",
        "(Lh41/c;Landroidx/compose/runtime/Composer;I)V",
        "Lcom/whoop/design/util/TextResource;",
        "priceWithoutDiscount",
        "finalPrice",
        "",
        "isWhoopProPrice",
        "Lh41/e;",
        "shoppingTileTagType",
        "g",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLh41/e;Landroidx/compose/runtime/Composer;II)V",
        "m",
        "(Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lh41/b;->j(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLh41/e;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lh41/b;->h(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLh41/e;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lh41/c;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lh41/b;->l(Landroidx/compose/ui/Modifier;Lh41/c;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lh41/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lh41/b;->p(Lh41/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lh41/b;->n(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lh41/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lh41/b;->k(Lh41/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLh41/e;Landroidx/compose/runtime/Composer;II)V
    .locals 51

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v0, p3

    move/from16 v5, p5

    const-string v4, "priceWithoutDiscount"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "finalPrice"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    const v4, -0x15608165

    invoke-virtual {v11, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v5, 0x6

    const/4 v6, 0x4

    const/4 v7, 0x2

    if-nez v4, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v6

    goto :goto_0

    :cond_0
    move v4, v7

    :goto_0
    or-int/2addr v4, v5

    goto :goto_1

    :cond_1
    move v4, v5

    :goto_1
    and-int/lit8 v8, v5, 0x30

    if-nez v8, :cond_3

    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x20

    goto :goto_2

    :cond_2
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v4, v8

    :cond_3
    and-int/lit16 v8, v5, 0x180

    if-nez v8, :cond_5

    invoke-virtual {v11, v3}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x100

    goto :goto_3

    :cond_4
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v4, v8

    :cond_5
    and-int/lit8 v8, p6, 0x8

    if-eqz v8, :cond_6

    or-int/lit16 v4, v4, 0xc00

    goto :goto_6

    :cond_6
    and-int/lit16 v9, v5, 0xc00

    if-nez v9, :cond_9

    and-int/lit16 v9, v5, 0x1000

    if-nez v9, :cond_7

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_4

    :cond_7
    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    :goto_4
    if-eqz v9, :cond_8

    const/16 v9, 0x800

    goto :goto_5

    :cond_8
    const/16 v9, 0x400

    :goto_5
    or-int/2addr v4, v9

    :cond_9
    :goto_6
    and-int/lit16 v9, v4, 0x493

    const/16 v10, 0x492

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eq v9, v10, :cond_a

    move v9, v12

    goto :goto_7

    :cond_a
    move v9, v13

    :goto_7
    and-int/lit8 v10, v4, 0x1

    invoke-virtual {v11, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_15

    const/4 v9, 0x0

    if-eqz v8, :cond_b

    move-object v0, v9

    :cond_b
    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lh41/e;->b()Lj91/b;

    move-result-object v8

    goto :goto_8

    :cond_c
    move-object v8, v9

    :goto_8
    const/4 v10, 0x6

    if-eqz v3, :cond_d

    const v14, -0x3f4593d8

    invoke-virtual {v11, v14}, Lp1/q;->e0(I)V

    sget-object v14, Lx81/d;->a:Lx81/d;

    invoke-virtual {v14, v11, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->z()J

    move-result-wide v14

    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    :goto_9
    move-wide/from16 v32, v14

    goto :goto_a

    :cond_d
    invoke-static {v1}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v14

    if-eqz v14, :cond_e

    const v14, -0x3f458a3f

    invoke-virtual {v11, v14}, Lp1/q;->e0(I)V

    sget-object v14, Lx81/d;->a:Lx81/d;

    invoke-virtual {v14, v11, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->k0()J

    move-result-wide v14

    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_e
    const v14, -0x3f45851b

    invoke-virtual {v11, v14}, Lp1/q;->e0(I)V

    sget-object v14, Lx81/d;->a:Lx81/d;

    invoke-static {v14, v11, v10, v13}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v14

    goto :goto_9

    :goto_a
    sget-object v14, Lx81/d;->a:Lx81/d;

    invoke-virtual {v14, v11, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v15

    invoke-virtual {v15}, Lb91/d;->E()Lb91/a;

    move-result-object v15

    invoke-virtual {v14, v11, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lb91/d;->E()Lb91/a;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lb91/a;->d()Ll3/v0;

    move-result-object v17

    if-nez v8, :cond_f

    const v8, 0x56971c73

    invoke-virtual {v11, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    move-object/from16 v18, v9

    goto :goto_b

    :cond_f
    const v10, -0x3f4572b2

    invoke-virtual {v11, v10}, Lp1/q;->e0(I)V

    invoke-interface {v8, v11, v13}, Lj91/b;->a(Landroidx/compose/runtime/Composer;I)Li2/t;

    move-result-object v8

    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    move-object/from16 v18, v8

    :goto_b
    const-wide/16 v23, 0x0

    const v25, 0x1fffffe

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v17 .. v25}, Ll3/v0;->a(Ll3/v0;Li2/t;JLp3/r;Lp3/i;JI)Ll3/v0;

    move-result-object v8

    invoke-static {v15, v8, v9, v7, v9}, Lb91/a;->c(Lb91/a;Ll3/v0;Lb91/b;ILjava/lang/Object;)Lb91/a;

    move-result-object v34

    int-to-float v8, v12

    int-to-float v6, v6

    mul-float v16, v8, v6

    int-to-float v8, v7

    mul-float v17, v8, v6

    const/16 v19, 0x0

    const/16 v20, 0x8

    sget-object v15, Lb2/t;->w:Lb2/t;

    move/from16 v18, v16

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v10, Lb2/e;->K:Lb2/l;

    invoke-static/range {v16 .. v16}, Ll0/m;->i(F)Ll0/k;

    move-result-object v12

    const/16 v13, 0x36

    invoke-static {v12, v10, v11, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v10

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v11, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v9, v11, Lp1/q;->S:Z

    if-eqz v9, :cond_10

    invoke-virtual {v11, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_10
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_c
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v11, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v11, v7, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v9, v11, Lp1/q;->S:Z

    if-nez v9, :cond_11

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_12

    :cond_11
    invoke-static {v12, v11, v12, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v11, v7, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v7

    if-eqz v7, :cond_13

    const v7, 0x46d3554f

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    and-int/lit8 v7, v4, 0xe

    invoke-static {v1, v11, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x6

    invoke-virtual {v14, v11, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->E()Lb91/a;

    move-result-object v9

    invoke-virtual {v14, v11, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->E()Lb91/a;

    move-result-object v8

    invoke-virtual {v8}, Lb91/a;->d()Ll3/v0;

    move-result-object v35

    const/16 v48, 0x0

    const v49, 0xffefff

    const-wide/16 v36, 0x0

    const-wide/16 v38, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const-wide/16 v42, 0x0

    const/16 v44, 0x0

    const-wide/16 v45, 0x0

    const/16 v47, 0x0

    invoke-static/range {v35 .. v49}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v8

    const/4 v10, 0x2

    const/4 v12, 0x0

    invoke-static {v9, v8, v12, v10, v12}, Lb91/a;->c(Lb91/a;Ll3/v0;Lb91/b;ILjava/lang/Object;)Lb91/a;

    move-result-object v26

    const/4 v8, 0x6

    invoke-virtual {v14, v11, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->b1()J

    move-result-wide v9

    const/16 v30, 0x0

    const v31, 0x2fffa

    move v12, v6

    move-object v6, v7

    const/4 v7, 0x0

    move v13, v8

    move-wide v8, v9

    move-object/from16 v28, v11

    const-wide/16 v10, 0x0

    move/from16 v17, v12

    const/4 v12, 0x0

    move/from16 v18, v13

    const/4 v13, 0x0

    move-object/from16 v19, v14

    const/4 v14, 0x0

    move-object/from16 v21, v15

    const/16 v20, 0x0

    const-wide/16 v15, 0x0

    move/from16 v22, v17

    const/16 v17, 0x0

    move/from16 v23, v18

    const/16 v18, 0x0

    move-object/from16 v24, v19

    move/from16 v25, v20

    const-wide/16 v19, 0x0

    move-object/from16 v27, v21

    const/16 v21, 0x0

    move/from16 v29, v22

    const/16 v22, 0x0

    move/from16 v35, v23

    const/16 v23, 0x0

    move-object/from16 v36, v24

    const/16 v24, 0x0

    move/from16 v37, v25

    const/16 v25, 0x0

    move-object/from16 v38, v27

    const/16 v27, 0x0

    move/from16 v39, v29

    const/16 v29, 0x0

    move-object/from16 p4, v0

    move/from16 v1, v35

    move-object/from16 p3, v36

    move/from16 v0, v37

    move-object/from16 v50, v38

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v28

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_13
    move-object/from16 p4, v0

    move/from16 v39, v6

    move-object/from16 p3, v14

    move-object/from16 v50, v15

    const/4 v0, 0x0

    const/4 v1, 0x6

    const v6, 0x46d81e4b

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    :goto_d
    if-eqz v3, :cond_14

    const v6, 0x46d8b872

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    invoke-virtual/range {p3 .. p3}, Lx81/d;->d()Lgz0/o0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/o0;->h()Lgz0/u;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/u;->d()I

    move-result v6

    invoke-static {v6, v11, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v6

    const/4 v7, 0x5

    int-to-float v7, v7

    mul-float v7, v7, v39

    move-object/from16 v15, v50

    invoke-static {v7, v15}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-object/from16 v7, p3

    invoke-virtual {v7, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->z()J

    move-result-wide v9

    const/16 v12, 0x1b0

    const/4 v13, 0x0

    const/4 v7, 0x0

    invoke-static/range {v6 .. v13}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_14
    const v1, 0x46dd4f6b

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    :goto_e
    shr-int/lit8 v0, v4, 0x3

    and-int/lit8 v0, v0, 0xe

    invoke-static {v2, v11, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    const/16 v30, 0x0

    const v31, 0x2fffa

    const/4 v7, 0x0

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

    const/16 v29, 0x0

    move-wide/from16 v8, v32

    move-object/from16 v26, v34

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v28

    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    move-object/from16 v4, p4

    goto :goto_f

    :cond_15
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v4, v0

    :goto_f
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_16

    new-instance v0, Law0/h;

    const/16 v7, 0xb

    move-object/from16 v1, p0

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Law0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final h(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLh41/e;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lh41/b;->g(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLh41/e;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final i(Landroidx/compose/ui/Modifier;Lh41/c;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lh41/c;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v6, p1

    move-object/from16 v5, p2

    move/from16 v1, p4

    const-string v0, "itemState"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v2, 0x1ab6abd7

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p5, 0x1

    const/4 v3, 0x4

    if-eqz v2, :cond_0

    or-int/lit8 v4, v1, 0x6

    move v7, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v1, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v7, v3

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v1

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v7, v1

    :goto_1
    and-int/lit8 v8, v1, 0x30

    if-nez v8, :cond_4

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, 0x20

    goto :goto_2

    :cond_3
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_4
    and-int/lit16 v8, v1, 0x180

    const/16 v9, 0x100

    if-nez v8, :cond_6

    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    move v8, v9

    goto :goto_3

    :cond_5
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v7, v8

    :cond_6
    and-int/lit16 v8, v7, 0x93

    const/16 v10, 0x92

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eq v8, v10, :cond_7

    move v8, v12

    goto :goto_4

    :cond_7
    move v8, v11

    :goto_4
    and-int/lit8 v10, v7, 0x1

    invoke-virtual {v0, v10, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_c

    sget-object v13, Lb2/t;->w:Lb2/t;

    if-eqz v2, :cond_8

    move-object v4, v13

    :cond_8
    and-int/lit16 v2, v7, 0x380

    if-ne v2, v9, :cond_9

    move v11, v12

    :cond_9
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v11, :cond_a

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v2, v7, :cond_b

    :cond_a
    new-instance v2, Lg40/i3;

    const/16 v7, 0xc

    invoke-direct {v2, v5, v7}, Lg40/i3;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object/from16 v17, v2

    check-cast v17, Lc93/a;

    const/16 v18, 0xf

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v7, 0x28

    int-to-float v7, v7

    int-to-float v3, v3

    mul-float/2addr v7, v3

    invoke-static {v7, v2}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v7, 0x2f

    int-to-float v7, v7

    mul-float/2addr v7, v3

    invoke-static {v7, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-interface {v2, v4}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v2, Lx81/d;->a:Lx81/d;

    const/4 v3, 0x6

    invoke-virtual {v2, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->W0()J

    move-result-wide v9

    new-instance v2, Lej1/h;

    const/16 v3, 0x1a

    invoke-direct {v2, v6, v3}, Lej1/h;-><init>(Ljava/lang/Object;I)V

    const v3, 0x1a343247

    invoke-static {v3, v0, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v15

    const/high16 v17, 0xc00000

    const/16 v18, 0x7a

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v16, v0

    invoke-static/range {v7 .. v18}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_c
    move-object/from16 v16, v0

    invoke-virtual/range {v16 .. v16}, Lp1/q;->X()V

    :goto_5
    invoke-virtual/range {v16 .. v16}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_d

    new-instance v0, Lf02/c;

    const/16 v3, 0x1a

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lf02/c;-><init>(IIILandroidx/compose/ui/Modifier;Ll83/e;Lm91/u;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final j(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lh41/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_5

    int-to-float p2, v2

    const/4 v0, 0x4

    int-to-float v0, v0

    mul-float/2addr p2, v0

    sget-object v0, Lb2/t;->w:Lb2/t;

    invoke-static {p2, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object v0, Ll0/m;->c:Ll0/g;

    sget-object v1, Lb2/e;->M:Lb2/k;

    invoke-static {v0, v1, p1, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v4, p1, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {p1}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {p1, p2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {p1}, Lp1/q;->i0()V

    iget-boolean v6, p1, Lp1/q;->S:Z

    if-eqz v6, :cond_1

    invoke-virtual {p1, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->s0()V

    :goto_1
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {p1, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {p1, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v4, p1, Lp1/q;->S:Z

    if-nez v4, :cond_2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    invoke-static {v1, p1, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {p1, v0, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lh41/c;->g()Z

    move-result p2

    if-eqz p2, :cond_4

    const p0, -0x24edd92a

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    invoke-static {p1, v3}, Lh41/b;->m(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    const p2, -0x24ecdade

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    invoke-static {p0, p1, v3}, Lh41/b;->o(Lh41/c;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    :goto_2
    invoke-virtual {p1, v2}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_5
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Landroidx/compose/ui/Modifier;Lh41/c;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lh41/b;->i(Landroidx/compose/ui/Modifier;Lh41/c;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final m(Landroidx/compose/runtime/Composer;I)V
    .locals 30

    move-object/from16 v6, p0

    check-cast v6, Lp1/q;

    const v1, 0x134b5856

    invoke-virtual {v6, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v9, 0x0

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v9

    :goto_0
    and-int/lit8 v2, p1, 0x1

    invoke-virtual {v6, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_b

    sget-object v11, Ll0/m;->c:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    invoke-static {v11, v12, v6, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v2, v6, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v5, v6, Lp1/q;->S:Z

    if-eqz v5, :cond_1

    invoke-virtual {v6, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_1
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v6, v15, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v6, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v6, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v2, v6, v2, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v6, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v4}, Lkd1/w;->a()Lk91/a;

    move-result-object v4

    invoke-virtual {v4}, Lk91/a;->c()Lt0/i;

    move-result-object v4

    invoke-static {v13, v4}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lx81/d;->a:Lx81/d;

    const/4 v7, 0x6

    invoke-virtual {v5, v6, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    move-object/from16 v16, v11

    invoke-virtual {v8}, Ly81/i;->n()J

    move-result-wide v10

    sget-object v8, Li2/w0;->a:Li2/v0;

    invoke-static {v4, v10, v11, v8}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v8, 0x66

    int-to-float v8, v8

    invoke-static {v8, v4}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v8, Lb2/e;->E:Lb2/m;

    invoke-static {v8, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    iget-wide v9, v6, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v6, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v11, v6, Lp1/q;->S:Z

    if-eqz v11, :cond_4

    invoke-virtual {v6, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v6, v15, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v1, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-nez v8, :cond_5

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    :cond_5
    invoke-static {v9, v6, v9, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v6, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v5}, Lx81/d;->d()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/a;->n()I

    move-result v4

    invoke-static {v4, v6, v7}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v4

    const/4 v8, 0x7

    int-to-float v8, v8

    const/4 v9, 0x4

    int-to-float v9, v9

    mul-float/2addr v8, v9

    invoke-static {v8, v13}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v8, v10}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v5, v6, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v10

    move/from16 v19, v7

    const/16 v7, 0x1b0

    move-object/from16 v20, v3

    move-object v3, v8

    const/4 v8, 0x0

    move-object/from16 v21, v2

    const/4 v2, 0x0

    move/from16 v28, v19

    move/from16 v19, v9

    move/from16 v9, v28

    move-wide/from16 v28, v10

    move-object v10, v1

    move-object v1, v4

    move-object v11, v5

    move-wide/from16 v4, v28

    invoke-static/range {v1 .. v8}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x1

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    const/high16 v2, 0x3f800000    # 1.0f

    float-to-double v3, v2

    const-wide/16 v7, 0x0

    cmpl-double v3, v3, v7

    if-lez v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "invalid weight; must be greater than zero"

    invoke-static {v3}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_3
    new-instance v3, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v3, v2, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    int-to-float v4, v1

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float v24, v4, v5

    const/16 v26, 0x0

    const/16 v27, 0xd

    const/16 v23, 0x0

    const/16 v25, 0x0

    move-object/from16 v22, v3

    invoke-static/range {v22 .. v27}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object v5, v11

    move-object/from16 v3, v16

    const/4 v11, 0x0

    invoke-static {v3, v12, v6, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    move-object v8, v5

    move-object/from16 v5, v20

    move-object/from16 v7, v21

    iget-wide v11, v6, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v6, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v1, v6, Lp1/q;->S:Z

    if-eqz v1, :cond_8

    invoke-virtual {v6, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_8
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v6, v15, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v10, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v6, Lp1/q;->S:Z

    if-nez v1, :cond_9

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    :cond_9
    invoke-static {v11, v6, v11, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    invoke-static {v6, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v1, Lgy0/f;->k2:I

    const/4 v11, 0x0

    invoke-static {v1, v6, v11}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v6, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->b()Lb91/a;

    move-result-object v21

    invoke-virtual {v8, v6, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v2

    mul-float v4, v4, v19

    const/4 v5, 0x0

    const/4 v7, 0x2

    invoke-static {v13, v4, v5, v7}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v25, 0x0

    const v26, 0x2fff8

    move-object/from16 v23, v6

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x30

    move-wide/from16 v28, v2

    move-object v2, v4

    move-wide/from16 v3, v28

    const/4 v0, 0x1

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v23

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_b
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_c

    new-instance v1, Lf01/c0;

    const/16 v2, 0x13

    const/4 v3, 0x0

    move/from16 v4, p1

    invoke-direct {v1, v3, v4, v2}, Lf01/c0;-><init>(BII)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final n(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lh41/b;->m(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final o(Lh41/c;Landroidx/compose/runtime/Composer;I)V
    .locals 45

    move-object/from16 v0, p0

    const-string v2, "itemState"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p1

    check-cast v6, Lp1/q;

    const v2, 0x13f660b4

    invoke-virtual {v6, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v14, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v14

    :goto_0
    or-int v2, p2, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v2, 0x3

    const/4 v15, 0x0

    const/4 v9, 0x1

    if-eq v3, v14, :cond_2

    move v3, v9

    goto :goto_2

    :cond_2
    move v3, v15

    :goto_2
    and-int/2addr v2, v9

    invoke-virtual {v6, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_12

    sget-object v2, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    invoke-static {v2, v10, v6, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v6, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_3

    invoke-virtual {v6, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_3
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v6, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v6, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v9, v6, Lp1/q;->S:Z

    if-nez v9, :cond_4

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v9, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_5

    :cond_4
    invoke-static {v4, v6, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v14, La3/k;->d:La3/i;

    invoke-static {v6, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, Lx81/d;->a:Lx81/d;

    const/4 v4, 0x6

    invoke-virtual {v9, v6, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    move-object/from16 v18, v14

    invoke-virtual {v7}, Ly81/i;->I()J

    move-result-wide v13

    sget-object v7, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v7}, Lkd1/w;->b()Lk91/a;

    move-result-object v7

    invoke-virtual {v7}, Lk91/a;->c()Lt0/i;

    move-result-object v7

    invoke-static {v11, v13, v14, v7}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v14, 0x66

    int-to-float v14, v14

    invoke-static {v14, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v14, Lb2/e;->y:Lb2/m;

    invoke-static {v14, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v14

    move-object/from16 v19, v5

    iget-wide v4, v6, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v6, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v13, v6, Lp1/q;->S:Z

    if-eqz v13, :cond_6

    invoke-virtual {v6, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v6, v8, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v6, Lp1/q;->S:Z

    if-nez v5, :cond_7

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v5, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    :cond_7
    move-object/from16 v5, v19

    goto :goto_6

    :cond_8
    move-object/from16 v5, v19

    :goto_5
    move-object/from16 v13, v18

    goto :goto_7

    :goto_6
    invoke-static {v4, v6, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_5

    :goto_7
    invoke-static {v6, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v4, v3

    invoke-virtual {v0}, Lh41/c;->c()Lkd1/o;

    move-result-object v3

    if-nez v3, :cond_9

    const v3, 0x655db2b4

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v15}, Lp1/q;->q(Z)V

    move-object/from16 v32, v2

    move-object/from16 v29, v4

    move-object/from16 v30, v5

    move-object v14, v8

    move-object v0, v9

    move-object/from16 p1, v10

    move-object/from16 v33, v11

    move-object v1, v12

    const/4 v2, 0x1

    const/high16 v21, 0x3f800000    # 1.0f

    goto :goto_8

    :cond_9
    const v7, 0x655db2b5

    invoke-virtual {v6, v7}, Lp1/q;->e0(I)V

    const/4 v7, 0x0

    move-object v14, v8

    const/4 v8, 0x3

    move-object/from16 v18, v4

    const/4 v4, 0x0

    move-object/from16 v19, v5

    const/4 v5, 0x0

    move-object/from16 v29, v18

    move-object/from16 v30, v19

    invoke-static/range {v3 .. v8}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v3

    move-object/from16 v25, v6

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v11}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object v6, v11

    const/16 v11, 0x1b0

    move-object v7, v12

    const/16 v12, 0x78

    move/from16 v21, v4

    const/4 v4, 0x0

    move-object v8, v6

    const/4 v6, 0x0

    move-object/from16 v18, v7

    const/4 v7, 0x0

    move-object/from16 v19, v8

    const/4 v8, 0x0

    move-object/from16 v20, v9

    const/4 v9, 0x0

    move-object/from16 v32, v2

    move-object/from16 p1, v10

    move-object/from16 v1, v18

    move-object/from16 v33, v19

    move-object/from16 v0, v20

    move-object/from16 v10, v25

    const/4 v2, 0x1

    invoke-static/range {v3 .. v12}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v10

    invoke-virtual {v6, v15}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual/range {p0 .. p0}, Lh41/c;->e()Lh41/e;

    move-result-object v3

    if-nez v3, :cond_a

    const v3, 0x6562612b

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v15}, Lp1/q;->q(Z)V

    move v3, v2

    move-object/from16 v41, v13

    move-object v2, v14

    move-object/from16 v34, v29

    move-object/from16 v40, v30

    move-object/from16 v42, v33

    move-object/from16 v29, v0

    move v0, v15

    goto/16 :goto_c

    :cond_a
    const v4, 0x6562612c

    invoke-virtual {v6, v4}, Lp1/q;->e0(I)V

    int-to-float v4, v2

    const/4 v5, 0x4

    int-to-float v7, v5

    mul-float/2addr v4, v7

    move-object/from16 v8, v33

    invoke-static {v4, v8}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v10, 0x2

    int-to-float v11, v10

    mul-float/2addr v11, v7

    invoke-static {v11}, Lt0/j;->e(F)Lt0/i;

    move-result-object v7

    invoke-static {v9, v7}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v3}, Lh41/e;->a()Li91/a;

    move-result-object v9

    invoke-static {v7, v9}, Li91/c;->c(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v9, Lb2/e;->w:Lb2/m;

    invoke-static {v9, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    move-object v12, v3

    iget-wide v2, v6, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v6, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v5, v6, Lp1/q;->S:Z

    if-eqz v5, :cond_b

    invoke-virtual {v6, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_b
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v6, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v5, v29

    invoke-static {v6, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v6, Lp1/q;->S:Z

    if-nez v3, :cond_c

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    :cond_c
    move-object/from16 v3, v30

    goto :goto_a

    :cond_d
    move-object/from16 v3, v30

    goto :goto_b

    :goto_a
    invoke-static {v2, v6, v2, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :goto_b
    invoke-static {v6, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v12}, Lh41/e;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v6, v15}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v7}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v7, "toUpperCase(...)"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x6

    invoke-virtual {v0, v6, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->t()Lb91/a;

    move-result-object v23

    invoke-virtual {v12}, Lh41/e;->c()Ly81/e;

    move-result-object v9

    invoke-interface {v9, v6, v15}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v18

    invoke-static {v8, v11, v4}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v27, 0x0

    const v28, 0x2fff8

    move/from16 v31, v7

    move-object v9, v8

    const-wide/16 v7, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    move/from16 v16, v10

    const/4 v10, 0x0

    move-object v12, v11

    const/4 v11, 0x0

    move-object/from16 v22, v12

    move-object/from16 v20, v13

    const-wide/16 v12, 0x0

    move-object/from16 v24, v14

    const/4 v14, 0x0

    move/from16 v25, v15

    const/4 v15, 0x0

    move/from16 v29, v16

    const/16 v26, 0x4

    const-wide/16 v16, 0x0

    move/from16 v30, v25

    move-object/from16 v25, v6

    move-wide/from16 v43, v18

    move-object/from16 v19, v5

    move-wide/from16 v5, v43

    const/16 v18, 0x0

    move-object/from16 v34, v19

    const/16 v19, 0x0

    move-object/from16 v35, v20

    const/16 v20, 0x0

    move/from16 v36, v21

    const/16 v21, 0x0

    move-object/from16 v37, v22

    const/16 v22, 0x0

    move-object/from16 v38, v24

    const/16 v24, 0x0

    move/from16 v39, v26

    const/16 v26, 0x30

    move-object/from16 v29, v0

    move-object/from16 v40, v3

    move/from16 v0, v30

    move-object/from16 v41, v35

    move-object/from16 v42, v37

    move-object v3, v2

    move-object/from16 v2, v38

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v25

    const/4 v3, 0x1

    invoke-virtual {v6, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual {v6, v3}, Lp1/q;->q(Z)V

    const/high16 v4, 0x3f800000    # 1.0f

    float-to-double v7, v4

    const-wide/16 v9, 0x0

    cmpl-double v5, v7, v9

    if-lez v5, :cond_e

    goto :goto_d

    :cond_e
    const-string v5, "invalid weight; must be greater than zero"

    invoke-static {v5}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_d
    new-instance v7, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v7, v4, v3}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    int-to-float v5, v3

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float v9, v5, v3

    const/4 v11, 0x0

    const/16 v12, 0xd

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object/from16 v7, p1

    move-object/from16 v4, v32

    invoke-static {v4, v7, v6, v0}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v6, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v9, v6, Lp1/q;->S:Z

    if-eqz v9, :cond_f

    invoke-virtual {v6, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_f
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v6, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v4, v34

    invoke-static {v6, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v6, Lp1/q;->S:Z

    if-nez v1, :cond_10

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    :cond_10
    move-object/from16 v1, v40

    goto :goto_10

    :cond_11
    :goto_f
    move-object/from16 v13, v41

    goto :goto_11

    :goto_10
    invoke-static {v7, v6, v7, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_f

    :goto_11
    invoke-static {v6, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lh41/c;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static {v1, v6, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v29

    const/4 v7, 0x6

    invoke-virtual {v0, v6, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->b()Lb91/a;

    move-result-object v23

    invoke-virtual {v0, v6, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v0

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float/2addr v5, v2

    const/4 v2, 0x0

    move-object/from16 v8, v42

    const/4 v10, 0x2

    invoke-static {v8, v5, v2, v10}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v27, 0xc30

    const v28, 0x2d7f8

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x2

    const/16 v19, 0x0

    const/16 v20, 0x2

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x30

    move-object/from16 v25, v6

    move-wide v5, v0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual/range {p0 .. p0}, Lh41/c;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lh41/c;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lh41/c;->h()Z

    move-result v5

    invoke-virtual/range {p0 .. p0}, Lh41/c;->e()Lh41/e;

    move-result-object v6

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v7, v25

    invoke-static/range {v3 .. v9}, Lh41/b;->g(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLh41/e;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v7

    const/4 v2, 0x1

    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    goto :goto_12

    :cond_12
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_12
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_13

    new-instance v1, Ld71/c;

    const/16 v2, 0xf

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Ld71/c;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final p(Lh41/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lh41/b;->o(Lh41/c;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
