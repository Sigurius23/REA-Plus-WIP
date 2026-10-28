.class public abstract Lc41/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u001aG\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012\u00b2\u0006\u000c\u0010\u0011\u001a\u00020\r8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lc41/a0;",
        "itemViewState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lj0/i;",
        "interactionSource",
        "",
        "testTag",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "d",
        "(Lc41/a0;Landroidx/compose/ui/Modifier;Lj0/i;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "",
        "isPressedAndEnabled",
        "h",
        "(Lc41/a0;ZLandroidx/compose/runtime/Composer;I)V",
        "isPressed",
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
.method public static synthetic a(Lc41/a0;Landroidx/compose/ui/Modifier;Lj0/i;Ljava/lang/String;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lc41/z;->g(Lc41/a0;Landroidx/compose/ui/Modifier;Lj0/i;Ljava/lang/String;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc41/a0;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lc41/z;->i(Lc41/a0;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lc41/z;->e()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final d(Lc41/a0;Landroidx/compose/ui/Modifier;Lj0/i;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc41/a0;",
            "Landroidx/compose/ui/Modifier;",
            "Lj0/i;",
            "Ljava/lang/String;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v6, p6

    const-string v0, "itemViewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v0, -0x42186362

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v3, p7, 0x2

    const/16 v4, 0x10

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v6, 0x30

    if-nez v5, :cond_2

    move-object/from16 v5, p1

    invoke-virtual {v12, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    move v7, v4

    :goto_2
    or-int/2addr v0, v7

    :goto_3
    and-int/lit8 v7, p7, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v6, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v12, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v0, v9

    :goto_5
    and-int/lit8 v9, p7, 0x8

    if-eqz v9, :cond_9

    or-int/lit16 v0, v0, 0xc00

    :cond_8
    move-object/from16 v10, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v10, v6, 0xc00

    if-nez v10, :cond_8

    move-object/from16 v10, p3

    invoke-virtual {v12, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_6

    :cond_a
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v0, v11

    :goto_7
    and-int/lit8 v11, p7, 0x10

    if-eqz v11, :cond_c

    or-int/lit16 v0, v0, 0x6000

    :cond_b
    move-object/from16 v13, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v13, v6, 0x6000

    if-nez v13, :cond_b

    move-object/from16 v13, p4

    invoke-virtual {v12, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_d

    const/16 v14, 0x4000

    goto :goto_8

    :cond_d
    const/16 v14, 0x2000

    :goto_8
    or-int/2addr v0, v14

    :goto_9
    and-int/lit16 v14, v0, 0x2493

    const/16 v15, 0x2492

    const/4 v13, 0x0

    if-eq v14, v15, :cond_e

    const/4 v14, 0x1

    goto :goto_a

    :cond_e
    move v14, v13

    :goto_a
    and-int/lit8 v15, v0, 0x1

    invoke-virtual {v12, v15, v14}, Lp1/q;->U(IZ)Z

    move-result v14

    if-eqz v14, :cond_20

    sget-object v15, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_f

    move-object v5, v15

    :cond_f
    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_11

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v3, :cond_10

    invoke-static {v12}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v7

    :cond_10
    check-cast v7, Lj0/i;

    move-object v8, v7

    :cond_11
    if-eqz v9, :cond_12

    const/4 v7, 0x0

    goto :goto_b

    :cond_12
    move-object v7, v10

    :goto_b
    if-eqz v11, :cond_14

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v3, :cond_13

    new-instance v9, Lbo2/a;

    invoke-direct {v9, v4}, Lbo2/a;-><init>(I)V

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    move-object v3, v9

    check-cast v3, Lc93/a;

    move-object/from16 v21, v3

    goto :goto_c

    :cond_14
    move-object/from16 v21, p4

    :goto_c
    shr-int/lit8 v3, v0, 0x6

    and-int/lit8 v3, v3, 0xe

    invoke-static {v8, v12, v3}, Lge3/g;->m(Lj0/i;Lp1/q;I)Lp1/c1;

    move-result-object v3

    invoke-static {v3}, Lc41/z;->f(Lp1/t2;)Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-virtual {v1}, Lc41/a0;->e()Z

    move-result v4

    if-eqz v4, :cond_15

    const/4 v4, 0x1

    goto :goto_d

    :cond_15
    move v4, v13

    :goto_d
    if-eqz v4, :cond_16

    const v9, 0x6bf105e9

    invoke-virtual {v12, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lc41/a0;->f()Ly81/e;

    move-result-object v9

    invoke-interface {v9, v12, v13}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v9

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_16
    const v9, 0x6bf20435

    invoke-virtual {v12, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lc41/a0;->f()Ly81/e;

    move-result-object v9

    invoke-interface {v9, v12, v13}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v9

    const v11, 0x3d4ccccd    # 0.05f

    invoke-static {v11, v9, v10}, Li2/x;->c(FJ)J

    move-result-wide v9

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    :goto_e
    const/4 v11, 0x6

    if-eqz v4, :cond_17

    const v14, -0x1d8cc4f8

    invoke-virtual {v12, v14}, Lp1/q;->e0(I)V

    sget-object v14, Lx81/d;->a:Lx81/d;

    invoke-static {v14, v12, v11, v13}, Ldc/b;->e(Lx81/d;Lp1/q;IZ)J

    move-result-wide v16

    :goto_f
    move-wide/from16 v23, v16

    goto :goto_10

    :cond_17
    const v14, -0x1d8cc0b8

    invoke-virtual {v12, v14}, Lp1/q;->e0(I)V

    sget-object v14, Lx81/d;->a:Lx81/d;

    invoke-static {v14, v12, v11, v13}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v16

    goto :goto_f

    :goto_10
    invoke-virtual {v1}, Lc41/a0;->i()Lc41/b0;

    move-result-object v14

    invoke-virtual {v14}, Lc41/b0;->e()F

    move-result v14

    invoke-static {v14, v5}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual {v1}, Lc41/a0;->i()Lc41/b0;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lc41/b0;->f()F

    move-result v16

    invoke-static/range {v16 .. v16}, Lt0/j;->e(F)Lt0/i;

    move-result-object v11

    invoke-static {v14, v9, v10, v11}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v1}, Lc41/a0;->e()Z

    move-result v11

    if-eqz v11, :cond_18

    move v11, v10

    goto :goto_11

    :cond_18
    const v11, 0x3ecccccd    # 0.4f

    :goto_11
    invoke-static {v11, v9}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    invoke-virtual {v1}, Lc41/a0;->e()Z

    move-result v19

    move-object/from16 p2, v3

    const-wide/16 v2, 0x0

    const/4 v9, 0x7

    const/4 v11, 0x0

    invoke-static {v2, v3, v9, v13, v11}, Lg1/z4;->a(JIZF)Landroidx/compose/material/d;

    move-result-object v18

    const/16 v20, 0x0

    const/16 v22, 0x18

    move-object/from16 v17, v8

    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v3, v17

    move-object/from16 v33, v21

    invoke-static {v2, v7}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, Lb2/e;->w:Lb2/m;

    invoke-static {v8, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v12, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-eqz v9, :cond_19

    invoke-virtual {v12, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_19
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_12
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v12, v9, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v12, v8, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-nez v10, :cond_1a

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    move/from16 v17, v0

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    goto :goto_13

    :cond_1a
    move/from16 v17, v0

    :goto_13
    invoke-static {v13, v12, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v12, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {p2 .. p2}, Lc41/z;->f(Lp1/t2;)Z

    move-result v2

    if-nez v2, :cond_1c

    const v2, 0x63557b8a

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lc41/a0;->i()Lc41/b0;

    move-result-object v2

    invoke-virtual {v2}, Lc41/b0;->f()F

    move-result v2

    invoke-static {v2}, Lt0/j;->e(F)Lt0/i;

    move-result-object v2

    invoke-static {v15, v2}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {}, Lz81/d;->q()Lz81/b;

    move-result-object v10

    invoke-virtual {v10}, Lz81/b;->e()Lf0/t;

    move-result-object v10

    iget v10, v10, Lf0/t;->a:F

    move-object v13, v9

    invoke-virtual {v1}, Lc41/a0;->c()Ly81/e;

    move-result-object v9

    move-object/from16 p2, v2

    move-object/from16 v34, v3

    const/4 v2, 0x2

    new-array v3, v2, [F

    fill-array-data v3, :array_0

    move-object v2, v8

    move v8, v10

    new-instance v10, Li2/k;

    move-object/from16 v16, v2

    new-instance v2, Landroid/graphics/DashPathEffect;

    move-object/from16 v35, v5

    const/4 v5, 0x0

    invoke-direct {v2, v3, v5}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-direct {v10, v2}, Li2/k;-><init>(Landroid/graphics/PathEffect;)V

    invoke-virtual {v1}, Lc41/a0;->i()Lc41/b0;

    move-result-object v2

    invoke-virtual {v2}, Lc41/b0;->f()F

    move-result v2

    move-object v3, v13

    const/4 v13, 0x0

    move-object/from16 v18, v14

    const/4 v14, 0x0

    move-object v5, v3

    move-object/from16 p1, v7

    move-object v3, v11

    move-object/from16 v6, v18

    const/4 v1, 0x0

    move-object/from16 v7, p2

    move v11, v2

    move-object/from16 v2, v16

    invoke-static/range {v7 .. v14}, Lz81/d;->i(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_1c
    move-object/from16 v34, v3

    move-object/from16 v35, v5

    move-object/from16 p1, v7

    move-object v2, v8

    move-object v5, v9

    move-object v3, v11

    move-object v6, v14

    const/4 v1, 0x0

    const v7, 0x635c856a

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    :goto_14
    sget-object v7, Lb2/e;->K:Lb2/l;

    sget-object v8, Ll0/m;->a:Ll0/e;

    const/16 v9, 0x30

    invoke-static {v8, v7, v12, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v8, v12, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v12, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-eqz v11, :cond_1d

    invoke-virtual {v12, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_1d
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_15
    invoke-static {v12, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v12, Lp1/q;->S:Z

    if-nez v2, :cond_1e

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1f

    :cond_1e
    invoke-static {v8, v12, v8, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1f
    invoke-static {v12, v0, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v0, v17, 0xe

    move-object/from16 v2, p0

    invoke-static {v2, v4, v12, v0}, Lc41/z;->h(Lc41/a0;ZLandroidx/compose/runtime/Composer;I)V

    const-wide/high16 v3, 0x3ff8000000000000L    # 1.5

    double-to-float v0, v3

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v0, v3

    const/4 v3, 0x2

    const/4 v5, 0x0

    invoke-static {v15, v0, v5, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v2}, Lc41/a0;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0, v12, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    sget-object v0, Lx81/d;->a:Lx81/d;

    const/4 v1, 0x6

    invoke-virtual {v0, v12, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->r()Lb91/a;

    move-result-object v27

    new-instance v0, Lw3/k;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lw3/k;-><init>(I)V

    const/16 v31, 0xc30

    const v32, 0x2d5f8

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x2

    move-wide/from16 v9, v23

    const/16 v23, 0x0

    const/16 v24, 0x2

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x30

    move-object/from16 v19, v0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    move-object/from16 v4, p1

    move-object/from16 v5, v33

    move-object/from16 v3, v34

    goto :goto_16

    :cond_20
    move-object v2, v1

    invoke-virtual {v12}, Lp1/q;->X()V

    move-object/from16 v35, v5

    move-object v3, v8

    move-object v4, v10

    move-object/from16 v5, p4

    :goto_16
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_21

    new-instance v0, La01/f;

    move/from16 v6, p6

    move/from16 v7, p7

    move-object v1, v2

    move-object/from16 v2, v35

    invoke-direct/range {v0 .. v7}, La01/f;-><init>(Lc41/a0;Landroidx/compose/ui/Modifier;Lj0/i;Ljava/lang/String;Lc93/a;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_21
    return-void

    nop

    :array_0
    .array-data 4
        0x41200000    # 10.0f
        0x40a00000    # 5.0f
    .end array-data
.end method

.method private static final e()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Lp1/t2;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
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

.method private static final g(Lc41/a0;Landroidx/compose/ui/Modifier;Lj0/i;Ljava/lang/String;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lc41/z;->d(Lc41/a0;Landroidx/compose/ui/Modifier;Lj0/i;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lc41/a0;ZLandroidx/compose/runtime/Composer;I)V
    .locals 20

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v8, p2

    check-cast v8, Lp1/q;

    const v3, 0x4322d762

    invoke-virtual {v8, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v4, v2, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v8, v1}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit8 v4, v3, 0x13

    const/16 v5, 0x12

    const/4 v11, 0x1

    const/4 v6, 0x0

    if-eq v4, v5, :cond_4

    move v4, v11

    goto :goto_3

    :cond_4
    move v4, v6

    :goto_3
    and-int/2addr v3, v11

    invoke-virtual {v8, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_a

    const/4 v3, 0x6

    if-eqz v1, :cond_5

    const v4, 0x5ca9b49

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-virtual {v4, v8, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->p()J

    move-result-wide v4

    invoke-virtual {v8, v6}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_5
    const v4, 0x5ca9f29

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-static {v4, v8, v3, v6}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v4

    :goto_4
    if-eqz v1, :cond_6

    const v7, 0x5caa8ac

    invoke-virtual {v8, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-static {v7, v8, v3, v6}, Ldc/b;->e(Lx81/d;Lp1/q;IZ)J

    move-result-wide v9

    goto :goto_5

    :cond_6
    const v7, 0x5caacec

    invoke-virtual {v8, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-static {v7, v8, v3, v6}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v9

    :goto_5
    invoke-virtual {v0}, Lc41/a0;->i()Lc41/b0;

    move-result-object v7

    invoke-virtual {v7}, Lc41/b0;->a()F

    move-result v7

    invoke-static {v7}, Lt0/j;->e(F)Lt0/i;

    move-result-object v7

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v7}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v0}, Lc41/a0;->i()Lc41/b0;

    move-result-object v13

    invoke-virtual {v13}, Lc41/b0;->c()F

    move-result v13

    invoke-static {v13, v7}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v0}, Lc41/a0;->i()Lc41/b0;

    move-result-object v13

    invoke-virtual {v13}, Lc41/b0;->e()F

    move-result v13

    invoke-static {v13, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual {v0}, Lc41/a0;->i()Lc41/b0;

    move-result-object v7

    invoke-virtual {v7}, Lc41/b0;->d()F

    move-result v15

    invoke-virtual {v0}, Lc41/a0;->i()Lc41/b0;

    move-result-object v7

    invoke-virtual {v7}, Lc41/b0;->d()F

    move-result v16

    invoke-virtual {v0}, Lc41/a0;->i()Lc41/b0;

    move-result-object v7

    invoke-virtual {v7}, Lc41/b0;->d()F

    move-result v18

    const/16 v19, 0x4

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v0}, Lc41/a0;->i()Lc41/b0;

    move-result-object v13

    invoke-virtual {v13}, Lc41/b0;->a()F

    move-result v13

    invoke-static {v13}, Lt0/j;->e(F)Lt0/i;

    move-result-object v13

    invoke-static {v7, v4, v5, v13}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->E:Lb2/m;

    invoke-static {v5, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v6, v8, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v8, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v14, v8, Lp1/q;->S:Z

    if-eqz v14, :cond_7

    invoke-virtual {v8, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_6
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v8, v13, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v8, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-nez v7, :cond_8

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v7, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_9

    :cond_8
    invoke-static {v6, v8, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v8, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lc41/a0;->g()I

    move-result v4

    invoke-static {v4, v8, v3}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v3

    invoke-virtual {v0}, Lc41/a0;->i()Lc41/b0;

    move-result-object v4

    invoke-virtual {v4}, Lc41/b0;->b()F

    move-result v4

    invoke-static {v4, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-wide v6, v9

    const/16 v9, 0x30

    const/4 v10, 0x0

    const/4 v4, 0x0

    invoke-static/range {v3 .. v10}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_a
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_b

    new-instance v4, Lam0/b;

    const/4 v5, 0x6

    invoke-direct {v4, v0, v1, v2, v5}, Lam0/b;-><init>(Ljava/lang/Object;ZII)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final i(Lc41/a0;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lc41/z;->h(Lc41/a0;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
