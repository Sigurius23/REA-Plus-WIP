.class public abstract Lv71/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a;\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lv71/e;",
        "headerState",
        "",
        "showCta",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "ctaAction",
        "d",
        "(Landroidx/compose/ui/Modifier;Lv71/e;ZLc93/a;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lv71/e;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lv71/d;->g(Landroidx/compose/ui/Modifier;Lv71/e;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lv71/d;->e()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lv71/d;->f(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lv71/e;ZLc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 41
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lv71/e;",
            "Z",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v5, p5

    const-string v0, "headerState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    const v0, 0x136dd27a

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v4, v5, 0x6

    move v6, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v5, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v11, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v5

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v6, v5

    :goto_1
    and-int/lit8 v7, v5, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_4
    and-int/lit8 v7, p6, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v6, v6, 0x180

    :cond_5
    move/from16 v8, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v8, v5, 0x180

    if-nez v8, :cond_5

    move/from16 v8, p2

    invoke-virtual {v11, v8}, Lp1/q;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_3

    :cond_7
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v6, v9

    :goto_4
    and-int/lit8 v9, p6, 0x8

    if-eqz v9, :cond_9

    or-int/lit16 v6, v6, 0xc00

    :cond_8
    move-object/from16 v10, p3

    :goto_5
    move v15, v6

    goto :goto_7

    :cond_9
    and-int/lit16 v10, v5, 0xc00

    if-nez v10, :cond_8

    move-object/from16 v10, p3

    invoke-virtual {v11, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    const/16 v12, 0x800

    goto :goto_6

    :cond_a
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v6, v12

    goto :goto_5

    :goto_7
    and-int/lit16 v6, v15, 0x493

    const/16 v12, 0x492

    if-eq v6, v12, :cond_b

    const/4 v6, 0x1

    goto :goto_8

    :cond_b
    const/4 v6, 0x0

    :goto_8
    and-int/lit8 v12, v15, 0x1

    invoke-virtual {v11, v12, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_20

    sget-object v6, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_c

    move-object v4, v6

    :cond_c
    if-eqz v7, :cond_d

    const/4 v0, 0x1

    goto :goto_9

    :cond_d
    move v0, v8

    :goto_9
    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-eqz v9, :cond_f

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v7, :cond_e

    new-instance v8, Lv40/d;

    const/16 v9, 0xd

    invoke-direct {v8, v9}, Lv40/d;-><init>(I)V

    invoke-virtual {v11, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v8, Lc93/a;

    move-object v10, v8

    :cond_f
    invoke-static {}, Lx81/e;->p()Lp1/t1;

    move-result-object v8

    invoke-virtual {v11, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v9, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->HOME_ONBOARDING_FUTURE_IA:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {v8, v9}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result v9

    if-nez v9, :cond_11

    const-string v9, "home-future-ia"

    invoke-interface {v8, v9}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_10

    goto :goto_a

    :cond_10
    const/16 v32, 0x0

    goto :goto_b

    :cond_11
    :goto_a
    const/16 v32, 0x1

    :goto_b
    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-interface {v8, v4}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Ll0/f;->c:Ll0/e;

    sget-object v12, Lb2/e;->K:Lb2/l;

    const/16 v14, 0x36

    invoke-static {v9, v12, v11, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v9

    move-object/from16 p0, v4

    iget-wide v3, v11, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v11, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v13, v11, Lp1/q;->S:Z

    if-eqz v13, :cond_12

    invoke-virtual {v11, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_12
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_c
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v11, v13, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v11, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-nez v14, :cond_13

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    move/from16 v33, v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto :goto_d

    :cond_13
    move/from16 v33, v0

    :goto_d
    invoke-static {v3, v11, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v11, v0, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, Ll0/m;->a:Ll0/e;

    const/16 v8, 0x36

    invoke-static {v3, v12, v11, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    move-object/from16 p2, v7

    iget-wide v7, v11, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v11, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-eqz v14, :cond_15

    invoke-virtual {v11, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_15
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v11, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v9, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v11, Lp1/q;->S:Z

    if-nez v1, :cond_16

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    :cond_16
    invoke-static {v7, v11, v7, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    invoke-static {v11, v0, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lv71/e;->f()Ljava/lang/Integer;

    move-result-object v0

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    const/4 v1, 0x0

    const/16 v14, 0x8

    const/4 v7, 0x6

    if-nez v0, :cond_18

    const v0, 0x77f5545e

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    move-object/from16 v34, p2

    move-object v1, v10

    move/from16 v17, v15

    move-object v15, v6

    goto :goto_10

    :cond_18
    const/4 v0, 0x0

    const v8, 0x77f5545f

    invoke-virtual {v11, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lv71/e;->f()Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static {v8, v11, v7}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v8

    sget-object v9, Lx81/d;->a:Lx81/d;

    invoke-virtual {v9, v11, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->b1()J

    move-result-wide v12

    double-to-float v9, v3

    int-to-float v0, v14

    mul-float/2addr v9, v0

    const/4 v0, 0x2

    invoke-static {v6, v9, v1, v0}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    if-eqz v32, :cond_19

    const/4 v0, 0x4

    int-to-float v1, v0

    mul-float/2addr v1, v1

    goto :goto_f

    :cond_19
    const/4 v0, 0x4

    int-to-float v1, v7

    int-to-float v7, v0

    mul-float/2addr v1, v7

    :goto_f
    invoke-static {v1, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object v1, v10

    move-wide v9, v12

    const/16 v12, 0x30

    const/4 v13, 0x0

    const/4 v7, 0x0

    move-object/from16 v34, p2

    move/from16 v17, v15

    move-object v15, v6

    move-object v6, v8

    move-object v8, v0

    const/4 v0, 0x0

    invoke-static/range {v6 .. v13}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual {v2}, Lv71/e;->e()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v11, v0}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    double-to-float v3, v3

    int-to-float v4, v14

    mul-float/2addr v3, v4

    invoke-static {v15, v3, v3}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v7

    if-eqz v32, :cond_1a

    const v4, -0x35ef8394    # -2367259.0f

    invoke-virtual {v11, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    const/4 v8, 0x6

    invoke-static {v4, v11, v8, v0}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v9

    goto :goto_11

    :cond_1a
    const/4 v8, 0x6

    const v4, -0x35ef7f57

    invoke-virtual {v11, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-static {v4, v11, v8, v0}, Lih0/d0;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v9

    :goto_11
    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-virtual {v4, v11, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->L()Lb91/a;

    move-result-object v26

    const/16 v30, 0x0

    const v31, 0x2fff8

    move/from16 v18, v8

    move-wide v8, v9

    move-object/from16 v28, v11

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v19, v15

    const/16 v20, 0x1

    const-wide/16 v15, 0x0

    move/from16 v21, v17

    const/16 v17, 0x0

    move/from16 v35, v18

    const/16 v18, 0x0

    move-object/from16 v22, v19

    move/from16 v23, v20

    const-wide/16 v19, 0x0

    move/from16 v24, v21

    const/16 v21, 0x0

    move-object/from16 v25, v22

    const/16 v22, 0x0

    move/from16 v27, v23

    const/16 v23, 0x0

    move/from16 v29, v24

    const/16 v24, 0x0

    move-object/from16 v36, v25

    const/16 v25, 0x0

    move/from16 v37, v27

    const/16 v27, 0x0

    move/from16 v38, v29

    const/16 v29, 0x0

    move-object/from16 v40, v36

    move/from16 v0, v37

    move/from16 v39, v38

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v28

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    if-eqz v33, :cond_1f

    const v6, -0xf9479bb

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lv71/e;->a()I

    move-result v6

    const/4 v8, 0x6

    invoke-static {v6, v11, v8}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v6

    if-eqz v32, :cond_1b

    const v7, -0x1946ca9b

    invoke-static {v11, v7, v4, v11, v8}, Lr80/c;->c(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v7

    const/4 v9, 0x0

    :goto_12
    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    move-wide v9, v7

    goto :goto_13

    :cond_1b
    const/4 v9, 0x0

    const v7, -0x1946c6b8

    invoke-static {v11, v7, v4, v11, v8}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v7

    goto :goto_12

    :goto_13
    const-string v4, "items_card_header_cta"

    move-object/from16 v15, v40

    invoke-static {v15, v4}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    move/from16 v4, v39

    and-int/lit16 v4, v4, 0x1c00

    const/16 v7, 0x800

    if-ne v4, v7, :cond_1c

    move v13, v0

    goto :goto_14

    :cond_1c
    const/4 v13, 0x0

    :goto_14
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v13, :cond_1d

    move-object/from16 v7, v34

    if-ne v4, v7, :cond_1e

    :cond_1d
    new-instance v4, Lry2/g;

    const/16 v7, 0xc

    invoke-direct {v4, v1, v7}, Lry2/g;-><init>(Lc93/a;I)V

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    move-object/from16 v20, v4

    check-cast v20, Lc93/a;

    const/16 v21, 0xf

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v7, 0x0

    const/4 v8, 0x2

    invoke-static {v4, v3, v7, v8}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float/2addr v4, v4

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v12, 0x30

    const/4 v13, 0x0

    const/4 v7, 0x0

    invoke-static/range {v6 .. v13}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v9, 0x0

    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    goto :goto_15

    :cond_1f
    const/4 v9, 0x0

    const v3, -0xf8d4cdc

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    :goto_15
    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    move-object v4, v1

    move/from16 v3, v33

    move-object/from16 v1, p0

    goto :goto_16

    :cond_20
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v1, v4

    move v3, v8

    move-object v4, v10

    :goto_16
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_21

    new-instance v0, Lry2/h;

    const/4 v7, 0x7

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lry2/h;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;ZLl83/e;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_21
    return-void
.end method

.method private static final e()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Lv71/e;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lv71/d;->d(Landroidx/compose/ui/Modifier;Lv71/e;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
