.class public abstract Lg1/w4;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:F

.field public static final d:F

.field public static final e:F

.field public static final f:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x18

    int-to-float v0, v0

    sput v0, Lg1/w4;->a:F

    const/4 v0, 0x2

    int-to-float v0, v0

    sput v0, Lg1/w4;->b:F

    const/16 v1, 0x14

    int-to-float v1, v1

    sput v1, Lg1/w4;->c:F

    div-float/2addr v1, v0

    sput v1, Lg1/w4;->d:F

    const/16 v1, 0xc

    int-to-float v1, v1

    sput v1, Lg1/w4;->e:F

    sput v0, Lg1/w4;->f:F

    return-void
.end method

.method public static final a(ZLc93/a;Landroidx/compose/ui/Modifier;ZLg1/v1;Landroidx/compose/runtime/Composer;II)V
    .locals 20

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v7, p2

    move-object/from16 v8, p4

    move/from16 v9, p6

    move-object/from16 v13, p5

    check-cast v13, Lp1/q;

    const v0, 0x4e58b201    # 9.088861E8f

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v9, 0x6

    const/4 v3, 0x4

    const/4 v4, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v13, v1}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v4

    :goto_0
    or-int/2addr v0, v9

    goto :goto_1

    :cond_1
    move v0, v9

    :goto_1
    and-int/lit8 v5, v9, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit16 v5, v9, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v13, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    :cond_5
    and-int/lit8 v5, p7, 0x8

    if-eqz v5, :cond_7

    or-int/lit16 v0, v0, 0xc00

    :cond_6
    move/from16 v6, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v6, v9, 0xc00

    if-nez v6, :cond_6

    move/from16 v6, p3

    invoke-virtual {v13, v6}, Lp1/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x800

    goto :goto_4

    :cond_8
    const/16 v10, 0x400

    :goto_4
    or-int/2addr v0, v10

    :goto_5
    or-int/lit16 v0, v0, 0x6000

    const/high16 v10, 0x30000

    and-int/2addr v10, v9

    if-nez v10, :cond_a

    invoke-virtual {v13, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    const/high16 v10, 0x20000

    goto :goto_6

    :cond_9
    const/high16 v10, 0x10000

    :goto_6
    or-int/2addr v0, v10

    :cond_a
    const v10, 0x12493

    and-int/2addr v10, v0

    const v11, 0x12492

    const/4 v12, 0x0

    const/4 v14, 0x1

    if-eq v10, v11, :cond_b

    move v10, v14

    goto :goto_7

    :cond_b
    move v10, v12

    :goto_7
    and-int/2addr v0, v14

    invoke-virtual {v13, v0, v10}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-virtual {v13}, Lp1/q;->Z()V

    and-int/lit8 v0, v9, 0x1

    if-eqz v0, :cond_d

    invoke-virtual {v13}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_8

    :cond_c
    invoke-virtual {v13}, Lp1/q;->X()V

    goto :goto_a

    :cond_d
    :goto_8
    if-eqz v5, :cond_e

    goto :goto_9

    :cond_e
    move v14, v6

    :goto_9
    move v6, v14

    :goto_a
    invoke-virtual {v13}, Lp1/q;->r()V

    if-eqz v1, :cond_f

    sget v0, Lg1/w4;->e:F

    int-to-float v5, v4

    div-float/2addr v0, v5

    :goto_b
    move v10, v0

    goto :goto_c

    :cond_f
    int-to-float v0, v12

    goto :goto_b

    :goto_c
    const/16 v0, 0x64

    const/4 v5, 0x0

    const/4 v11, 0x6

    move v14, v11

    invoke-static {v0, v12, v5, v14}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v11

    move v15, v14

    const/16 v14, 0x30

    move/from16 v16, v15

    const/16 v15, 0xc

    move/from16 v17, v12

    const/4 v12, 0x0

    move/from16 v4, v16

    move/from16 v2, v17

    invoke-static/range {v10 .. v15}, Ld0/g;->a(FLd0/l;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v10

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v11, 0x4a1d1c8a    # 2574114.5f

    invoke-virtual {v13, v11}, Lp1/q;->e0(I)V

    if-nez v6, :cond_10

    iget-wide v11, v8, Lg1/v1;->c:J

    goto :goto_d

    :cond_10
    if-nez v1, :cond_11

    iget-wide v11, v8, Lg1/v1;->b:J

    goto :goto_d

    :cond_11
    iget-wide v11, v8, Lg1/v1;->a:J

    :goto_d
    if-eqz v6, :cond_12

    const v14, -0x4e3d566b

    invoke-virtual {v13, v14}, Lp1/q;->e0(I)V

    invoke-static {v0, v2, v5, v4}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v0

    const/16 v15, 0x30

    const/16 v16, 0xc

    move-object v14, v13

    const/4 v13, 0x0

    move-wide/from16 v18, v11

    move-object v12, v0

    move-object v0, v10

    move-wide/from16 v10, v18

    invoke-static/range {v10 .. v16}, Lc0/m1;->a(JLd0/c0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v4

    move-object v13, v14

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    :goto_e
    move-object v10, v4

    goto :goto_f

    :cond_12
    move-object v0, v10

    move-wide v10, v11

    const v4, -0x4e3bc53c

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    new-instance v4, Li2/x;

    invoke-direct {v4, v10, v11}, Li2/x;-><init>(J)V

    invoke-static {v4, v13}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v4

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    goto :goto_e

    :goto_f
    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    move-object v4, v0

    sget-object v0, Lb2/t;->w:Lb2/t;

    if-eqz p1, :cond_13

    sget v5, Lg1/w4;->a:F

    const-wide/16 v11, 0x0

    invoke-static {v11, v12, v3, v2, v5}, Lg1/z4;->a(JIZF)Landroidx/compose/material/d;

    move-result-object v3

    new-instance v5, Li3/i;

    const/4 v11, 0x3

    invoke-direct {v5, v11}, Li3/i;-><init>(I)V

    move/from16 v17, v2

    const/4 v2, 0x0

    move-object v11, v4

    move v4, v6

    move/from16 v14, v17

    const/4 v12, 0x2

    move-object/from16 v6, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/selection/b;->a(Landroidx/compose/ui/Modifier;ZLj0/i;Lf0/v0;ZLi3/i;Lc93/a;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    goto :goto_10

    :cond_13
    move v14, v2

    move-object v11, v4

    move v4, v6

    const/4 v12, 0x2

    move-object v2, v0

    :goto_10
    if-eqz p1, :cond_14

    sget-object v0, Lg1/h3;->a:Lp1/u2;

    sget-object v0, Landroidx/compose/material/MinimumInteractiveModifier;->w:Landroidx/compose/material/MinimumInteractiveModifier;

    :cond_14
    invoke-interface {v7, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-interface {v0, v2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->E:Lb2/m;

    invoke-static {v0, v1, v14, v12}, Landroidx/compose/foundation/layout/d;->y(Landroidx/compose/ui/Modifier;Lb2/m;ZI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget v1, Lg1/w4;->b:F

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget v1, Lg1/w4;->c:F

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->l(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v13, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v13, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_15

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v2, v1, :cond_16

    :cond_15
    new-instance v2, Lfd3/a;

    const/16 v1, 0xa

    invoke-direct {v2, v1, v10, v11}, Lfd3/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v13, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v2, v13, v14}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_11

    :cond_17
    invoke-virtual {v13}, Lp1/q;->X()V

    move v4, v6

    :goto_11
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_18

    new-instance v0, Lep1/p;

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v7

    move-object v5, v8

    move v6, v9

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lep1/p;-><init>(ZLc93/a;Landroidx/compose/ui/Modifier;ZLg1/v1;II)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method
