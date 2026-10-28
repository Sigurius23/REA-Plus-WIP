.class public abstract Lr11/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001ac\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "",
        "showOptimalStrain",
        "",
        "optimalStrainPercentage",
        "Ll83/k;",
        "optimalStrainRange",
        "recoveryPercentage",
        "Lz51/k;",
        "recoveryType",
        "strainScorePercentage",
        "Lcom/whoop/design/util/TextResource;",
        "descriptionSubText",
        "descriptionText",
        "hasDivider",
        "Ll83/a0;",
        "b",
        "(ZFLl83/k;FLz51/k;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLandroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(ZFLl83/k;FLz51/k;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p11}, Lr11/c;->c(ZFLl83/k;FLz51/k;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(ZFLl83/k;FLz51/k;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLandroidx/compose/runtime/Composer;I)V
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZF",
            "Ll83/k;",
            "F",
            "Lz51/k;",
            "F",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Z",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v6, p3

    move-object/from16 v0, p4

    move/from16 v2, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p7

    move/from16 v7, p8

    move/from16 v8, p10

    const-string v9, "optimalStrainRange"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v9, v3, Ll83/k;->x:Ljava/lang/Object;

    iget-object v10, v3, Ll83/k;->w:Ljava/lang/Object;

    const-string v11, "recoveryType"

    invoke-static {v0, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "descriptionSubText"

    invoke-static {v4, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "descriptionText"

    invoke-static {v5, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p9

    check-cast v13, Lp1/q;

    const v11, -0x9897579

    invoke-virtual {v13, v11}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v11, v8, 0x6

    if-nez v11, :cond_1

    invoke-virtual {v13, v1}, Lp1/q;->h(Z)Z

    move-result v11

    if-eqz v11, :cond_0

    const/4 v11, 0x4

    goto :goto_0

    :cond_0
    const/4 v11, 0x2

    :goto_0
    or-int/2addr v11, v8

    goto :goto_1

    :cond_1
    move v11, v8

    :goto_1
    and-int/lit8 v15, v8, 0x30

    if-nez v15, :cond_3

    move/from16 v15, p1

    invoke-virtual {v13, v15}, Lp1/q;->d(F)Z

    move-result v16

    if-eqz v16, :cond_2

    const/16 v16, 0x20

    goto :goto_2

    :cond_2
    const/16 v16, 0x10

    :goto_2
    or-int v11, v11, v16

    goto :goto_3

    :cond_3
    move/from16 v15, p1

    :goto_3
    and-int/lit16 v12, v8, 0x180

    if-nez v12, :cond_5

    invoke-virtual {v13, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    const/16 v12, 0x100

    goto :goto_4

    :cond_4
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v11, v12

    :cond_5
    and-int/lit16 v12, v8, 0xc00

    if-nez v12, :cond_7

    invoke-virtual {v13, v6}, Lp1/q;->d(F)Z

    move-result v12

    if-eqz v12, :cond_6

    const/16 v12, 0x800

    goto :goto_5

    :cond_6
    const/16 v12, 0x400

    :goto_5
    or-int/2addr v11, v12

    :cond_7
    and-int/lit16 v12, v8, 0x6000

    if-nez v12, :cond_9

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    invoke-virtual {v13, v12}, Lp1/q;->e(I)Z

    move-result v12

    if-eqz v12, :cond_8

    const/16 v12, 0x4000

    goto :goto_6

    :cond_8
    const/16 v12, 0x2000

    :goto_6
    or-int/2addr v11, v12

    :cond_9
    const/high16 v12, 0x30000

    and-int/2addr v12, v8

    if-nez v12, :cond_b

    invoke-virtual {v13, v2}, Lp1/q;->d(F)Z

    move-result v12

    if-eqz v12, :cond_a

    const/high16 v12, 0x20000

    goto :goto_7

    :cond_a
    const/high16 v12, 0x10000

    :goto_7
    or-int/2addr v11, v12

    :cond_b
    const/high16 v12, 0x180000

    and-int/2addr v12, v8

    if-nez v12, :cond_d

    invoke-virtual {v13, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_c

    const/high16 v12, 0x100000

    goto :goto_8

    :cond_c
    const/high16 v12, 0x80000

    :goto_8
    or-int/2addr v11, v12

    :cond_d
    const/high16 v12, 0xc00000

    and-int/2addr v12, v8

    if-nez v12, :cond_f

    invoke-virtual {v13, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_e

    const/high16 v12, 0x800000

    goto :goto_9

    :cond_e
    const/high16 v12, 0x400000

    :goto_9
    or-int/2addr v11, v12

    :cond_f
    const/high16 v12, 0x6000000

    and-int/2addr v12, v8

    if-nez v12, :cond_11

    invoke-virtual {v13, v7}, Lp1/q;->h(Z)Z

    move-result v12

    if-eqz v12, :cond_10

    const/high16 v12, 0x4000000

    goto :goto_a

    :cond_10
    const/high16 v12, 0x2000000

    :goto_a
    or-int/2addr v11, v12

    :cond_11
    move/from16 v38, v11

    const v11, 0x2492493

    and-int v11, v38, v11

    const v12, 0x2492492

    const/4 v4, 0x0

    if-eq v11, v12, :cond_12

    const/4 v11, 0x1

    goto :goto_b

    :cond_12
    move v11, v4

    :goto_b
    and-int/lit8 v12, v38, 0x1

    invoke-virtual {v13, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_24

    invoke-static {}, Lx81/e;->p()Lp1/t1;

    move-result-object v11

    invoke-virtual {v13, v11}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v12, "wte-new-gauge-android"

    invoke-interface {v11, v12}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v11

    sget-object v12, Ll0/m;->c:Ll0/g;

    move-object/from16 v25, v9

    sget-object v9, Lb2/e;->M:Lb2/k;

    invoke-static {v12, v9, v13, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v14

    iget-wide v4, v13, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    move-object/from16 v27, v9

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v13, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v28, v10

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v2, v13, Lp1/q;->S:Z

    if-eqz v2, :cond_13

    invoke-virtual {v13, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_13
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_c
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v13, v2, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->f:La3/i;

    invoke-static {v13, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v3, v13, Lp1/q;->S:Z

    if-nez v3, :cond_14

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_15

    :cond_14
    invoke-static {v4, v13, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v13, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Lb2/e;->K:Lb2/l;

    sget-object v4, Ll0/m;->a:Ll0/e;

    const/16 v6, 0x30

    invoke-static {v4, v1, v13, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v6, v13, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v13, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v8, v13, Lp1/q;->S:Z

    if-eqz v8, :cond_16

    invoke-virtual {v13, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_16
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v13, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v13, Lp1/q;->S:Z

    if-nez v1, :cond_17

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    :cond_17
    invoke-static {v4, v13, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    invoke-static {v13, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {}, Lz51/h;->N()F

    move-result v1

    invoke-static {v1, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v4, Lb2/e;->E:Lb2/m;

    const/4 v6, 0x0

    invoke-static {v4, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v6, v13, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v13, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v8, v13, Lp1/q;->S:Z

    if-eqz v8, :cond_19

    invoke-virtual {v13, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_19
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v13, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v13, Lp1/q;->S:Z

    if-nez v4, :cond_1a

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1b

    :cond_1a
    invoke-static {v6, v13, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    invoke-static {v13, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v1, 0x6

    if-eqz p0, :cond_1d

    const v4, 0x5708903d

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    if-eqz v11, :cond_1c

    const v6, 0x5708ec64

    invoke-virtual {v13, v6}, Lp1/q;->e0(I)V

    invoke-static {}, Lz51/h;->R()F

    move-result v6

    move-object/from16 v7, v28

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v8

    const/high16 v17, 0x43b40000    # 360.0f

    mul-float v18, v8, v17

    move-object/from16 v8, v25

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    move-result v8

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    sub-float/2addr v8, v7

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-virtual {v7, v13, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ly81/i;->X0()J

    move-result-wide v19

    invoke-static/range {v19 .. v20}, Li91/c;->o(J)Li91/a;

    move-result-object v17

    sget-object v20, Lwy0/d;->ARC:Lwy0/d;

    const/16 v19, 0x2

    invoke-static {}, Lz51/h;->O()F

    move-result v16

    const v22, 0x6036030

    const/16 v23, 0x81

    move-object/from16 v21, v12

    const/4 v12, 0x0

    move-object/from16 v15, v17

    const/16 v17, 0x0

    move/from16 v25, v19

    const/16 v19, 0x0

    move-object/from16 p9, v13

    move v13, v6

    move-object/from16 v6, v21

    move-object/from16 v21, p9

    move-object/from16 p9, v14

    move v14, v8

    move-object/from16 v8, p9

    move-object/from16 v29, v10

    move/from16 v10, v25

    const p9, 0x6036030

    const/4 v4, 0x4

    invoke-static/range {v12 .. v23}, Lwy0/c;->c(Landroidx/compose/ui/Modifier;FFLi91/a;FZFILwy0/d;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v13, v21

    invoke-static {}, Lz51/h;->R()F

    move-result v12

    invoke-virtual {v7, v13, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->V0()J

    move-result-wide v14

    invoke-static {v14, v15}, Li91/c;->o(J)Li91/a;

    move-result-object v15

    invoke-static {}, Lz51/h;->O()F

    move-result v16

    shl-int/lit8 v7, v38, 0x3

    and-int/lit16 v7, v7, 0x380

    or-int v22, v7, p9

    const/16 v23, 0xc1

    move v13, v12

    const/4 v12, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x0

    move/from16 v14, p1

    invoke-static/range {v12 .. v23}, Lwy0/c;->c(Landroidx/compose/ui/Modifier;FFLi91/a;FZFILwy0/d;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v13, v21

    const/4 v7, 0x0

    invoke-virtual {v13, v7}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_1c
    move-object/from16 v29, v10

    move-object v6, v12

    move-object v8, v14

    const p9, 0x6036030

    const/4 v4, 0x4

    const/4 v10, 0x2

    const v7, 0x571a1039

    invoke-virtual {v13, v7}, Lp1/q;->e0(I)V

    invoke-static {}, Lz51/h;->R()F

    move-result v7

    sget-object v12, Lx81/d;->a:Lx81/d;

    invoke-virtual {v12, v13, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->X0()J

    move-result-wide v14

    invoke-static {v14, v15}, Li91/c;->o(J)Li91/a;

    move-result-object v15

    sget-object v20, Lwy0/d;->ARC:Lwy0/d;

    invoke-static {}, Lz51/h;->O()F

    move-result v16

    shl-int/lit8 v12, v38, 0x3

    and-int/lit16 v12, v12, 0x380

    or-int v22, v12, p9

    const/16 v23, 0xc1

    const/4 v12, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    move/from16 v14, p1

    move-object/from16 v21, v13

    move v13, v7

    invoke-static/range {v12 .. v23}, Lwy0/c;->c(Landroidx/compose/ui/Modifier;FFLi91/a;FZFILwy0/d;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v13, v21

    invoke-static {}, Lz51/h;->N()F

    move-result v7

    int-to-float v12, v10

    div-float/2addr v7, v12

    move-object/from16 v12, v28

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->floatValue()F

    move-result v12

    move-object/from16 v14, v25

    check-cast v14, Ljava/lang/Number;

    invoke-virtual {v14}, Ljava/lang/Number;->floatValue()F

    move-result v14

    invoke-static {v7, v12, v14, v13, v1}, Lxy0/b;->c(FFFLandroidx/compose/runtime/Composer;I)V

    const/4 v7, 0x0

    invoke-virtual {v13, v7}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual {v13, v7}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_1d
    move-object/from16 v29, v10

    move-object v6, v12

    move-object v8, v14

    const/4 v4, 0x4

    const/4 v7, 0x0

    const/4 v10, 0x2

    const v12, 0x572347db

    invoke-virtual {v13, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v7}, Lp1/q;->q(Z)V

    :goto_10
    const/4 v12, 0x5

    int-to-float v14, v12

    int-to-float v4, v4

    mul-float/2addr v14, v4

    invoke-static {v14, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-virtual {v4}, Lx81/d;->d()Lgz0/o0;

    move-result-object v15

    invoke-virtual {v15}, Lgz0/o0;->h()Lgz0/u;

    move-result-object v15

    invoke-virtual {v15}, Lgz0/u;->c()I

    move-result v15

    invoke-static {v15, v13, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v15

    invoke-virtual {v4, v13, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ly81/i;->y()J

    move-result-wide v16

    const/16 v18, 0x1b0

    const/16 v19, 0x0

    move-object/from16 v21, v13

    const/4 v13, 0x0

    move-object v12, v15

    move-wide/from16 v15, v16

    move-object/from16 v17, v21

    invoke-static/range {v12 .. v19}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object/from16 v13, v17

    const/4 v12, 0x0

    cmpl-float v14, p3, v12

    if-lez v14, :cond_1e

    const v14, 0x57293222

    invoke-virtual {v13, v14}, Lp1/q;->e0(I)V

    invoke-static {}, Lz51/h;->Q()F

    move-result v14

    invoke-virtual {v4, v13, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->W0()J

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Li91/c;->o(J)Li91/a;

    move-result-object v15

    invoke-static {}, Lz51/h;->O()F

    move-result v16

    const/16 v22, 0x61b0

    const/16 v23, 0x1e1

    move/from16 v17, v12

    const/4 v12, 0x0

    move-object/from16 v21, v13

    move v13, v14

    const/high16 v14, 0x3f800000    # 1.0f

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v25, v20

    const/16 v20, 0x0

    move/from16 v1, v25

    invoke-static/range {v12 .. v23}, Lwy0/c;->c(Landroidx/compose/ui/Modifier;FFLi91/a;FZFILwy0/d;Landroidx/compose/runtime/Composer;II)V

    move-object v12, v5

    move-object/from16 v13, v21

    invoke-static {}, Lz51/h;->Q()F

    move-result v5

    shr-int/lit8 v14, v38, 0xc

    and-int/lit8 v14, v14, 0xe

    invoke-static {v0, v13, v14}, Lz51/d;->t(Lz51/k;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v14

    invoke-static {v14, v15}, Li91/c;->o(J)Li91/a;

    move-result-object v14

    move-object v15, v8

    invoke-static {}, Lz51/h;->O()F

    move-result v8

    shr-int/lit8 v7, v38, 0x3

    and-int/lit16 v7, v7, 0x380

    or-int/lit16 v7, v7, 0x6030

    move-object/from16 v16, v15

    const/16 v15, 0x161

    move-object/from16 v17, v4

    const/4 v4, 0x0

    move-object/from16 v18, v9

    const/4 v9, 0x0

    move/from16 v25, v10

    const/4 v10, 0x0

    move-object/from16 v19, v12

    const/4 v12, 0x0

    move-object v0, v14

    move v14, v7

    move-object v7, v0

    move/from16 v39, v1

    move-object/from16 v25, v2

    move-object/from16 v24, v3

    move-object v1, v6

    move-object/from16 v40, v16

    move-object/from16 v2, v17

    move-object/from16 v42, v18

    move-object/from16 v41, v19

    move-object/from16 v0, v27

    const/4 v3, 0x0

    move/from16 v6, p3

    invoke-static/range {v4 .. v15}, Lwy0/c;->c(Landroidx/compose/ui/Modifier;FFLi91/a;FZFILwy0/d;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_1e
    move-object/from16 v25, v2

    move-object/from16 v24, v3

    move-object v2, v4

    move-object/from16 v41, v5

    move-object v1, v6

    move v3, v7

    move-object/from16 v40, v8

    move-object/from16 v42, v9

    move/from16 v39, v12

    move-object/from16 v0, v27

    const v4, 0x57336a9b

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    :goto_11
    cmpl-float v4, p5, v39

    if-lez v4, :cond_1f

    const v4, 0x5734f486

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    invoke-static {}, Lz51/h;->R()F

    move-result v4

    const/4 v5, 0x6

    invoke-virtual {v2, v13, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->W0()J

    move-result-wide v5

    invoke-static {v5, v6}, Li91/c;->o(J)Li91/a;

    move-result-object v15

    invoke-static {}, Lz51/h;->O()F

    move-result v16

    const/16 v22, 0x61b0

    const/16 v23, 0x1e1

    const/4 v12, 0x0

    const/high16 v14, 0x3f800000    # 1.0f

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v21, v13

    move v13, v4

    invoke-static/range {v12 .. v23}, Lwy0/c;->c(Landroidx/compose/ui/Modifier;FFLi91/a;FZFILwy0/d;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v13, v21

    invoke-static {}, Lz51/h;->R()F

    move-result v5

    const/4 v4, 0x6

    invoke-virtual {v2, v13, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->k0()J

    move-result-wide v6

    invoke-static {v6, v7}, Li91/c;->o(J)Li91/a;

    move-result-object v7

    invoke-static {}, Lz51/h;->O()F

    move-result v8

    shr-int/lit8 v4, v38, 0x9

    and-int/lit16 v4, v4, 0x380

    or-int/lit16 v14, v4, 0x6030

    const/16 v15, 0x161

    const/4 v4, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move/from16 v6, p5

    invoke-static/range {v4 .. v15}, Lwy0/c;->c(Landroidx/compose/ui/Modifier;FFLi91/a;FZFILwy0/d;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    :goto_12
    const/4 v4, 0x1

    goto :goto_13

    :cond_1f
    const v4, 0x573f1dfb

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    goto :goto_12

    :goto_13
    invoke-virtual {v13, v4}, Lp1/q;->q(Z)V

    invoke-static {v1, v0, v13, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v4, v13, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    move-object/from16 v5, v42

    invoke-static {v13, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v7, v13, Lp1/q;->S:Z

    if-eqz v7, :cond_20

    move-object/from16 v7, v29

    invoke-virtual {v13, v7}, Lp1/q;->l(Lc93/a;)V

    :goto_14
    move-object/from16 v7, v25

    goto :goto_15

    :cond_20
    invoke-virtual {v13}, Lp1/q;->s0()V

    goto :goto_14

    :goto_15
    invoke-static {v13, v7, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v8, v40

    invoke-static {v13, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v13, Lp1/q;->S:Z

    if-nez v0, :cond_21

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_22

    :cond_21
    move-object/from16 v12, v41

    goto :goto_17

    :cond_22
    :goto_16
    move-object/from16 v0, v24

    goto :goto_18

    :goto_17
    invoke-static {v1, v13, v1, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_16

    :goto_18
    invoke-static {v13, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v10, 0x2

    int-to-float v0, v10

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    move/from16 v1, v39

    invoke-static {v5, v0, v1, v10}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    shr-int/lit8 v1, v38, 0x15

    and-int/lit8 v1, v1, 0xe

    move-object/from16 v8, p7

    invoke-static {v8, v13, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v12

    const/4 v1, 0x6

    invoke-virtual {v2, v13, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v14

    invoke-virtual {v2, v13, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->C()Lb91/a;

    move-result-object v32

    new-instance v1, Lw3/k;

    const/4 v6, 0x5

    invoke-direct {v1, v6}, Lw3/k;-><init>(I)V

    const/16 v36, 0x0

    const v37, 0x2fdf8

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x30

    move-object/from16 v24, v1

    move-object/from16 v34, v13

    move-object v13, v4

    invoke-static/range {v12 .. v37}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v34

    const/4 v1, 0x0

    invoke-static {v5, v0, v1, v10}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    shr-int/lit8 v1, v38, 0x12

    and-int/lit8 v1, v1, 0xe

    move-object/from16 v7, p6

    invoke-static {v7, v13, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v12

    const/4 v1, 0x6

    invoke-virtual {v2, v13, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->c1()J

    move-result-wide v14

    invoke-virtual {v2, v13, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->b()Lb91/a;

    move-result-object v32

    new-instance v1, Lw3/k;

    invoke-direct {v1, v6}, Lw3/k;-><init>(I)V

    move-object/from16 v24, v1

    move-object v13, v4

    invoke-static/range {v12 .. v37}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v34

    const/4 v4, 0x1

    invoke-virtual {v13, v4}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v4}, Lp1/q;->q(Z)V

    if-eqz p8, :cond_23

    const v1, -0x7d1face9

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    const/4 v1, 0x0

    invoke-static {v5, v0, v1, v10}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const/16 v23, 0x6

    const/16 v24, 0xfe

    move-object/from16 v21, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    move-object/from16 v34, v21

    const/16 v21, 0x0

    move-object/from16 v22, v34

    invoke-static/range {v12 .. v24}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v13, v22

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    :goto_19
    const/4 v4, 0x1

    goto :goto_1a

    :cond_23
    const v0, -0x7d1d97db

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    goto :goto_19

    :goto_1a
    invoke-virtual {v13, v4}, Lp1/q;->q(Z)V

    goto :goto_1b

    :cond_24
    move-object/from16 v7, p6

    move-object v8, v5

    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_1b
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_25

    new-instance v0, Lr11/b;

    move/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v9, p8

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lr11/b;-><init>(ZFLl83/k;FLz51/k;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZI)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_25
    return-void
.end method

.method private static final c(ZFLl83/k;FLz51/k;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    or-int/lit8 v0, p9, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v11

    move v1, p0

    move v2, p1

    move-object v3, p2

    move v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p10

    invoke-static/range {v1 .. v11}, Lr11/c;->b(ZFLl83/k;FLz51/k;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
