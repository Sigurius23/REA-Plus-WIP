.class public abstract Lbu2/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lbu2/h;",
        "metricSliderLevelItemState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll83/a0;",
        "d",
        "(Lbu2/h;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(JLbu2/h;FFFFLk2/e;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lbu2/j;->f(JLbu2/h;FFFFLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lbu2/h;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lbu2/j;->g(Lbu2/h;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lbu2/h;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lbu2/j;->e(Lbu2/h;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lbu2/h;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 9

    const-string v0, "metricSliderLevelItemState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p2

    check-cast v6, Lp1/q;

    const v0, 0x6279e6e4

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_2

    or-int/lit8 v0, v0, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_4

    invoke-virtual {v6, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :cond_4
    :goto_3
    and-int/lit8 v4, v0, 0x13

    const/16 v5, 0x12

    if-eq v4, v5, :cond_5

    const/4 v4, 0x1

    goto :goto_4

    :cond_5
    const/4 v4, 0x0

    :goto_4
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v6, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_7

    if-eqz v2, :cond_6

    sget-object v2, Lb2/t;->w:Lb2/t;

    goto :goto_5

    :cond_6
    move-object v2, p1

    :goto_5
    new-instance v3, Lbu2/f;

    const/4 v4, 0x1

    invoke-direct {v3, v4, p0}, Lbu2/f;-><init>(ILm91/u;)V

    const v4, 0x64cb774e

    invoke-static {v4, v6, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0xe

    or-int/lit16 v7, v0, 0xc00

    const/4 v8, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v8}, Ll0/f;->a(Landroidx/compose/ui/Modifier;Lb2/h;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v2

    goto :goto_6

    :cond_7
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v3, p1

    :goto_6
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_8

    new-instance v0, La01/i;

    const/16 v5, 0xe

    move-object v1, p0

    move v2, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, La01/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final e(Lbu2/h;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 15

    move-object/from16 v0, p1

    const-string v1, "$this$BoxWithConstraints"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p3, 0x6

    const/4 v2, 0x4

    if-nez v1, :cond_1

    move-object/from16 v1, p2

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p3, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p3

    :goto_1
    and-int/lit8 v3, v1, 0x13

    const/16 v4, 0x12

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v3, v4, :cond_2

    move v3, v6

    goto :goto_2

    :cond_2
    move v3, v5

    :goto_2
    and-int/2addr v1, v6

    move-object/from16 v4, p2

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1, v3}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_5

    check-cast v0, Landroidx/compose/foundation/layout/c;

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/c;->d()F

    move-result v0

    const/4 v1, 0x7

    int-to-float v1, v1

    int-to-float v2, v2

    mul-float/2addr v1, v2

    add-float v13, v1, v0

    invoke-virtual {p0}, Lbu2/h;->b()J

    move-result-wide v0

    const/4 v3, 0x0

    invoke-static {v3, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v8

    sget-object v0, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v4, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly3/c;

    const-wide/high16 v10, 0x3fe0000000000000L    # 0.5

    double-to-float v3, v10

    mul-float/2addr v3, v2

    invoke-interface {v1, v3}, Ly3/c;->q0(F)F

    move-result v11

    invoke-virtual {v4, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly3/c;

    invoke-interface {v1, v3}, Ly3/c;->q0(F)F

    move-result v12

    invoke-virtual {v4, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/c;

    int-to-float v1, v6

    invoke-interface {v0, v1}, Ly3/c;->q0(F)F

    move-result v14

    sget-object v0, Lb2/t;->w:Lb2/t;

    mul-float/2addr v1, v2

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v13, v0}, Landroidx/compose/foundation/layout/d;->o(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v4, v8, v9}, Lp1/q;->f(J)Z

    move-result v1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v4, v11}, Lp1/q;->d(F)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v4, v12}, Lp1/q;->d(F)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v4, v13}, Lp1/q;->d(F)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v4, v14}, Lp1/q;->d(F)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_3

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v2, v1, :cond_4

    :cond_3
    new-instance v7, Lbu2/i;

    move-object v10, p0

    invoke-direct/range {v7 .. v14}, Lbu2/i;-><init>(JLbu2/h;FFFF)V

    invoke-virtual {v4, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v7

    :cond_4
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v2, v4, v5}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_3

    :cond_5
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(JLbu2/h;FFFFLk2/e;)Ll83/a0;
    .locals 12

    move-object/from16 v0, p7

    const-string v1, "$this$Canvas"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Li2/t;->b:Li2/s;

    const v1, 0x3d4ccccd    # 0.05f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    new-instance v3, Li2/x;

    invoke-direct {v3, p0, p1}, Li2/x;-><init>(J)V

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0x3dcccccd    # 0.1f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p2}, Lbu2/h;->b()J

    move-result-wide v5

    new-instance v3, Li2/x;

    invoke-direct {v3, v5, v6}, Li2/x;-><init>(J)V

    new-instance v5, Ll83/k;

    invoke-direct {v5, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0x3f666666    # 0.9f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p2}, Lbu2/h;->b()J

    move-result-wide v6

    new-instance v3, Li2/x;

    invoke-direct {v3, v6, v7}, Li2/x;-><init>(J)V

    new-instance v6, Ll83/k;

    invoke-direct {v6, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0x3f733333    # 0.95f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    new-instance v3, Li2/x;

    invoke-direct {v3, p0, p1}, Li2/x;-><init>(J)V

    new-instance p0, Ll83/k;

    invoke-direct {p0, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4, v5, v6, p0}, [Ll83/k;

    move-result-object v3

    const-wide/16 v6, 0x0

    const/16 v8, 0xe

    const-wide/16 v4, 0x0

    invoke-static/range {v2 .. v8}, Li2/s;->e(Li2/s;[Ll83/k;JJI)Li2/k0;

    move-result-object v1

    const/4 p0, 0x2

    new-array p0, p0, [F

    const/4 p1, 0x0

    aput p3, p0, p1

    const/4 p1, 0x1

    aput p4, p0, p1

    new-instance v7, Li2/k;

    new-instance p1, Landroid/graphics/DashPathEffect;

    const/4 v2, 0x0

    invoke-direct {p1, p0, v2}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-direct {v7, p1}, Li2/k;-><init>(Landroid/graphics/PathEffect;)V

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long p0, p0

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    const/16 v5, 0x20

    shl-long/2addr p0, v5

    const-wide v8, 0xffffffffL

    and-long/2addr v3, v8

    or-long/2addr p0, v3

    move/from16 v3, p5

    invoke-interface {v0, v3}, Ly3/c;->q0(F)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v10, v2

    shl-long v2, v3, v5

    and-long v4, v10, v8

    or-long/2addr v4, v2

    const/4 v8, 0x0

    const/16 v9, 0x1d0

    move-wide v2, p0

    move/from16 v6, p6

    invoke-static/range {v0 .. v9}, Lk2/e;->j(Lk2/e;Li2/t;JJFLi2/t0;FI)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lbu2/h;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lbu2/j;->d(Lbu2/h;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
