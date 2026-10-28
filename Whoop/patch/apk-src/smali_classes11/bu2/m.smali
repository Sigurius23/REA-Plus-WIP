.class public abstract Lbu2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lbu2/n;",
        "metricSliderRangeItemState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Lbu2/n;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "weekly-plan_release"
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
.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lbu2/m;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(FFFFFLk2/e;)Ll83/a0;
    .locals 8

    const/high16 v2, 0x42a00000    # 80.0f

    const/high16 v3, -0x3d600000    # -80.0f

    move v0, p0

    move v1, p1

    move v4, p2

    move v5, p3

    move v6, p4

    move-object v7, p5

    invoke-static/range {v0 .. v7}, Lbu2/m;->h(FFFFFFFLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lbu2/n;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lbu2/m;->i(Lbu2/n;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lbu2/n;Lkotlin/jvm/functions/Function1;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lbu2/m;->g(Lbu2/n;Lkotlin/jvm/functions/Function1;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lbu2/n;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbu2/n;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v0, "metricSliderRangeItemState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p3

    check-cast v6, Lp1/q;

    const v0, -0x6dd088e2

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_1
    move v0, p4

    :goto_1
    and-int/lit8 v2, p5, 0x2

    if-eqz v2, :cond_2

    or-int/lit8 v0, v0, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v3, p4, 0x30

    if-nez v3, :cond_4

    invoke-virtual {v6, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_2

    :cond_3
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_4
    :goto_3
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_5

    or-int/lit16 v0, v0, 0x180

    goto :goto_5

    :cond_5
    and-int/lit16 v4, p4, 0x180

    if-nez v4, :cond_7

    invoke-virtual {v6, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x100

    goto :goto_4

    :cond_6
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v0, v5

    :cond_7
    :goto_5
    and-int/lit16 v5, v0, 0x93

    const/16 v7, 0x92

    if-eq v5, v7, :cond_8

    const/4 v5, 0x1

    goto :goto_6

    :cond_8
    const/4 v5, 0x0

    :goto_6
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v6, v7, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_c

    if-eqz v2, :cond_9

    sget-object p1, Lb2/t;->w:Lb2/t;

    :cond_9
    move-object v2, p1

    if-eqz v3, :cond_b

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne p1, v3, :cond_a

    new-instance p1, Lbs1/n;

    const/16 v3, 0xb

    invoke-direct {p1, v3}, Lbs1/n;-><init>(I)V

    invoke-virtual {v6, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast p1, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_b
    move-object p1, p2

    :goto_7
    new-instance v3, Ll;

    const/4 v4, 0x6

    invoke-direct {v3, v4, p0, p1}, Ll;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v4, -0x3a490c78

    invoke-static {v4, v6, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0xe

    or-int/lit16 v7, v0, 0xc00

    const/4 v8, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v8}, Ll0/f;->a(Landroidx/compose/ui/Modifier;Lb2/h;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v5, p1

    move-object v4, v2

    goto :goto_8

    :cond_c
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v4, p1

    move-object v5, p2

    :goto_8
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_d

    new-instance v0, La01/e;

    const/16 v3, 0x17

    move-object v6, p0

    move v1, p4

    move v2, p5

    invoke-direct/range {v0 .. v6}, La01/e;-><init>(IIILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lm91/u;)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final f(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lbu2/n;Lkotlin/jvm/functions/Function1;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 18

    move-object/from16 v0, p2

    const-string v1, "$this$BoxWithConstraints"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p4, 0x6

    const/4 v2, 0x2

    const/4 v3, 0x4

    if-nez v1, :cond_1

    move-object/from16 v1, p3

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int v1, p4, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p4

    :goto_1
    and-int/lit8 v4, v1, 0x13

    const/16 v5, 0x12

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v4, v5, :cond_2

    move v4, v7

    goto :goto_2

    :cond_2
    move v4, v6

    :goto_2
    and-int/2addr v1, v7

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v1, v4}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_6

    check-cast v0, Landroidx/compose/foundation/layout/c;

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/c;->c()F

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lbu2/n;->b()F

    move-result v1

    invoke-virtual/range {p0 .. p0}, Lbu2/n;->c()F

    move-result v4

    sub-float/2addr v1, v4

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    mul-float/2addr v1, v0

    sget-object v0, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v11, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly3/c;

    invoke-interface {v4, v1}, Ly3/c;->q0(F)F

    move-result v4

    invoke-virtual {v11, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly3/c;

    int-to-float v7, v7

    int-to-float v3, v3

    mul-float v8, v7, v3

    invoke-interface {v5, v8}, Ly3/c;->q0(F)F

    move-result v13

    invoke-virtual {v11, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly3/c;

    const-wide/high16 v9, 0x3fe0000000000000L    # 0.5

    double-to-float v9, v9

    mul-float/2addr v9, v3

    invoke-interface {v5, v9}, Ly3/c;->q0(F)F

    move-result v14

    invoke-virtual {v11, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/c;

    invoke-interface {v0, v7}, Ly3/c;->q0(F)F

    move-result v15

    invoke-virtual/range {p0 .. p0}, Lbu2/n;->b()F

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lbu2/n;->c()F

    move-result v3

    sub-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const-string v3, "canvas"

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v8, v3}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/d;->k(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v11, v13}, Lp1/q;->d(F)Z

    move-result v7

    invoke-virtual {v11, v14}, Lp1/q;->d(F)Z

    move-result v8

    or-int/2addr v7, v8

    const/high16 v8, -0x3d600000    # -80.0f

    invoke-virtual {v11, v8}, Lp1/q;->d(F)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v11, v15}, Lp1/q;->d(F)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v11, v0}, Lp1/q;->d(F)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v11, v4}, Lp1/q;->d(F)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_3

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v8, v7, :cond_4

    :cond_3
    new-instance v12, Lbu2/l;

    move/from16 v16, v0

    move/from16 v17, v4

    invoke-direct/range {v12 .. v17}, Lbu2/l;-><init>(FFFFF)V

    invoke-virtual {v11, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v8, v12

    :cond_4
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v8, v11, v6}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    int-to-float v0, v6

    const/16 v3, -0x14

    int-to-float v3, v3

    invoke-static {v5, v0, v3}, Landroidx/compose/foundation/layout/a;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lbu2/n;->e()Lbu2/a;

    move-result-object v8

    const/16 v12, 0x30

    const/4 v13, 0x0

    move-object/from16 v10, p1

    invoke-static/range {v8 .. v13}, Lbu2/b;->c(Lbu2/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    int-to-float v2, v2

    add-float/2addr v1, v2

    const/16 v2, 0xc

    int-to-float v2, v2

    cmpg-float v3, v1, v2

    if-gez v3, :cond_5

    move v1, v2

    :cond_5
    invoke-static {v5, v0, v1}, Landroidx/compose/foundation/layout/a;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lbu2/n;->a()Lbu2/a;

    move-result-object v8

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v10, p1

    invoke-static/range {v8 .. v13}, Lbu2/b;->c(Lbu2/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_6
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h(FFFFFFFLk2/e;)Ll83/a0;
    .locals 23

    move/from16 v0, p2

    const-string v1, "$this$Canvas"

    move-object/from16 v2, p7

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-wide v3, Li2/x;->f:J

    const/4 v1, 0x2

    new-array v5, v1, [F

    const/4 v13, 0x0

    aput p0, v5, v13

    const/4 v14, 0x1

    aput p1, v5, v14

    new-instance v11, Li2/k;

    new-instance v6, Landroid/graphics/DashPathEffect;

    const/4 v15, 0x0

    invoke-direct {v6, v5, v15}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-direct {v11, v6}, Li2/k;-><init>(Landroid/graphics/PathEffect;)V

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v5, v5

    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v7, v7

    const/16 v16, 0x20

    shl-long v5, v5, v16

    const-wide v17, 0xffffffffL

    and-long v7, v7, v17

    or-long/2addr v5, v7

    invoke-static/range {p3 .. p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v7, v7

    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v9

    int-to-long v9, v9

    shl-long v7, v7, v16

    and-long v9, v9, v17

    or-long/2addr v7, v9

    const/4 v10, 0x0

    const/16 v12, 0x1d0

    move/from16 v9, p4

    invoke-static/range {v2 .. v12}, Lk2/e;->A0(Lk2/e;JJJFILi2/t0;I)V

    move/from16 v2, p5

    float-to-double v5, v2

    const-wide v7, 0x3f947ae147ae147bL    # 0.02

    cmpl-double v2, v5, v7

    if-lez v2, :cond_0

    sget-object v2, Li2/t;->b:Li2/s;

    const v5, 0x3e99999a    # 0.3f

    invoke-static {v5, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v5

    new-instance v7, Li2/x;

    invoke-direct {v7, v5, v6}, Li2/x;-><init>(J)V

    const v5, 0x3e4ccccd    # 0.2f

    invoke-static {v5, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v5

    new-instance v8, Li2/x;

    invoke-direct {v8, v5, v6}, Li2/x;-><init>(J)V

    const v5, 0x3dcccccd    # 0.1f

    invoke-static {v5, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v5

    new-instance v9, Li2/x;

    invoke-direct {v9, v5, v6}, Li2/x;-><init>(J)V

    const v5, 0x3d4ccccd    # 0.05f

    invoke-static {v5, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v5

    new-instance v10, Li2/x;

    invoke-direct {v10, v5, v6}, Li2/x;-><init>(J)V

    sget-wide v5, Li2/x;->m:J

    new-instance v11, Li2/x;

    invoke-direct {v11, v5, v6}, Li2/x;-><init>(J)V

    filled-new-array {v7, v8, v9, v10, v11}, [Li2/x;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/16 v6, 0x8

    move/from16 v12, p3

    invoke-static {v2, v5, v12, v0, v6}, Li2/s;->a(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v2

    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v5, v5

    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v7, v7

    shl-long v5, v5, v16

    and-long v7, v7, v17

    or-long/2addr v5, v7

    int-to-float v7, v1

    mul-float/2addr v7, v0

    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v7, v7

    invoke-static/range {p6 .. p6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v9

    int-to-long v9, v9

    shl-long v7, v7, v16

    and-long v9, v9, v17

    or-long/2addr v7, v9

    const/4 v10, 0x0

    const/16 v11, 0x78

    move-wide/from16 v19, v3

    move-wide v4, v5

    move-wide v6, v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v3, v2

    move/from16 v21, v13

    move/from16 v22, v14

    move-wide/from16 v13, v19

    move-object/from16 v2, p7

    invoke-static/range {v2 .. v11}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    const v2, 0x3f333333    # 0.7f

    invoke-static {v2, v13, v14}, Li2/x;->c(FJ)J

    move-result-wide v3

    new-array v1, v1, [F

    aput p0, v1, v21

    aput p1, v1, v22

    new-instance v11, Li2/k;

    new-instance v2, Landroid/graphics/DashPathEffect;

    invoke-direct {v2, v1, v15}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-direct {v11, v2}, Li2/k;-><init>(Landroid/graphics/PathEffect;)V

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    invoke-static/range {p6 .. p6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v5, v2

    shl-long v0, v0, v16

    and-long v5, v5, v17

    or-long/2addr v5, v0

    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    invoke-static/range {p6 .. p6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v7, v2

    shl-long v0, v0, v16

    and-long v7, v7, v17

    or-long/2addr v7, v0

    const/16 v12, 0x1d0

    move/from16 v9, p4

    move-object/from16 v2, p7

    invoke-static/range {v2 .. v12}, Lk2/e;->A0(Lk2/e;JJJFILi2/t0;I)V

    :cond_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Lbu2/n;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lbu2/m;->e(Lbu2/n;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
