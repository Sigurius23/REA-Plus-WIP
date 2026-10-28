.class public abstract Ljn2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a5\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\t0\u00082\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000c\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010\u00b2\u0006\u000c\u0010\u000f\u001a\u00020\u00038\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "Li2/x;",
        "animationAccentColor",
        "",
        "alpha",
        "e",
        "(Landroidx/compose/ui/Modifier;JF)Landroidx/compose/ui/Modifier;",
        "color",
        "",
        "Ll83/k;",
        "j",
        "(JF)[Ll83/k;",
        "opacity",
        "d",
        "(JF)J",
        "angle",
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
.method public static synthetic a(JFLp1/t2;Lf2/d;)Lf2/g;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ljn2/c;->h(JFLp1/t2;Lf2/d;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(JFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static/range {p0 .. p5}, Ljn2/c;->f(JFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(JFFFLp1/t2;Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ljn2/c;->i(JFFFLp1/t2;Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(JF)J
    .locals 4

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p2, v0, v1}, Le93/b;->m(FFF)F

    move-result p2

    invoke-static {p0, p1}, Li2/x;->i(J)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v2, 0x7f7fffff    # Float.MAX_VALUE

    cmpg-float v0, v0, v2

    if-gtz v0, :cond_0

    invoke-static {p0, p1}, Li2/x;->h(J)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v2

    if-gtz v0, :cond_0

    invoke-static {p0, p1}, Li2/x;->f(J)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v2

    if-gtz v0, :cond_0

    sub-float v0, v1, p2

    invoke-static {p0, p1}, Li2/x;->i(J)F

    move-result v2

    mul-float/2addr v2, p2

    add-float/2addr v2, v0

    invoke-static {p0, p1}, Li2/x;->h(J)F

    move-result v3

    mul-float/2addr v3, p2

    add-float/2addr v3, v0

    invoke-static {p0, p1}, Li2/x;->f(J)F

    move-result p0

    mul-float/2addr p0, p2

    add-float/2addr p0, v0

    const/16 p1, 0x10

    invoke-static {v2, v3, p0, v1, p1}, Li2/w0;->f(FFFFI)J

    move-result-wide p0

    return-wide p0

    :cond_0
    sget-wide p0, Li2/x;->f:J

    return-wide p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;JF)Landroidx/compose/ui/Modifier;
    .locals 1

    const-string v0, "$this$rotatingGradientBorder"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljn2/a;

    invoke-direct {v0, p1, p2, p3}, Ljn2/a;-><init>(JF)V

    invoke-static {p0, v0}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final f(JFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 17

    move-object/from16 v0, p3

    const-string v1, "$this$composed"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p4

    check-cast v7, Lp1/q;

    const v1, 0x7499a73e

    invoke-virtual {v7, v1}, Lp1/q;->e0(I)V

    const-string v1, "streak-rotation"

    const/4 v10, 0x0

    invoke-static {v1, v7, v10}, Ld0/f;->s(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ld0/l0;

    move-result-object v2

    sget-object v1, Ld0/b0;->c:Lb23/h;

    const/4 v3, 0x2

    const/16 v4, 0x7d0

    invoke-static {v4, v10, v1, v3}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x6

    invoke-static {v1, v3, v4}, Ld0/f;->q(Ld0/y;Ld0/v0;I)Ld0/i0;

    move-result-object v5

    const/16 v8, 0x71b8

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/high16 v4, 0x43b40000    # 360.0f

    const-string v6, "streak rotation transition"

    invoke-static/range {v2 .. v9}, Ld0/f;->g(Ld0/l0;FFLd0/i0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/j0;

    move-result-object v15

    invoke-virtual {v7, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    move-wide/from16 v12, p0

    invoke-virtual {v7, v12, v13}, Lp1/q;->f(J)Z

    move-result v2

    or-int/2addr v1, v2

    move/from16 v14, p2

    invoke-virtual {v7, v14}, Lp1/q;->d(F)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v2, v1, :cond_1

    :cond_0
    new-instance v11, Lcz0/l;

    const/16 v16, 0x2

    invoke-direct/range {v11 .. v16}, Lcz0/l;-><init>(JFLjava/lang/Object;I)V

    invoke-virtual {v7, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v11

    :cond_1
    check-cast v2, Lkotlin/jvm/functions/Function1;

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v2}, Landroidx/compose/ui/draw/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-interface {v0, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    return-object v0
.end method

.method private static final g(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final h(JFLp1/t2;Lf2/d;)Lf2/g;
    .locals 10

    const-string v0, "$this$drawWithCache"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/high16 v0, 0x3fd0000000000000L    # 0.25

    double-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-virtual {p4}, Lf2/d;->getDensity()F

    move-result v2

    mul-float v8, v2, v0

    const/4 v0, 0x3

    int-to-float v0, v0

    mul-float/2addr v0, v1

    invoke-virtual {p4}, Lf2/d;->getDensity()F

    move-result v1

    mul-float v7, v1, v0

    new-instance v3, Ljn2/b;

    move-wide v4, p0

    move v6, p2

    move-object v9, p3

    invoke-direct/range {v3 .. v9}, Ljn2/b;-><init>(JFFFLp1/t2;)V

    invoke-virtual {p4, v3}, Lf2/d;->a(Lkotlin/jvm/functions/Function1;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method private static final i(JFFFLp1/t2;Lk2/c;)Ll83/a0;
    .locals 25

    move-object/from16 v0, p6

    const-string v1, "$this$onDrawWithContent"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    check-cast v1, La3/p0;

    invoke-virtual {v1}, La3/p0;->a()V

    iget-object v1, v1, La3/p0;->w:Lk2/b;

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v2

    const/16 v4, 0x20

    shr-long/2addr v2, v4

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    const/4 v3, 0x0

    cmpg-float v2, v2, v3

    sget-object v11, Ll83/a0;->a:Ll83/a0;

    if-lez v2, :cond_1

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v5

    const-wide v7, 0xffffffffL

    and-long/2addr v5, v7

    long-to-int v2, v5

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    cmpg-float v2, v2, v3

    if-gtz v2, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-static/range {p5 .. p5}, Ljn2/c;->g(Lp1/t2;)F

    move-result v2

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v2

    double-to-float v2, v2

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v5

    double-to-float v5, v5

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v9

    shr-long/2addr v9, v4

    long-to-int v3, v9

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v9

    and-long/2addr v9, v7

    long-to-int v6, v9

    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    float-to-double v9, v3

    float-to-double v12, v6

    invoke-static {v9, v10, v12, v13}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v9

    double-to-float v3, v9

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v3, v6

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v9

    shr-long/2addr v9, v4

    long-to-int v9, v9

    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    div-float/2addr v9, v6

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v12

    and-long/2addr v12, v7

    long-to-int v10, v12

    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v10

    div-float/2addr v10, v6

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v6

    const v12, 0x7f7fffff    # Float.MAX_VALUE

    cmpg-float v6, v6, v12

    if-gtz v6, :cond_1

    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    move-result v6

    cmpg-float v6, v6, v12

    if-gtz v6, :cond_1

    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    move-result v6

    cmpg-float v6, v6, v12

    if-gtz v6, :cond_1

    mul-float/2addr v5, v3

    sub-float v6, v9, v5

    mul-float/2addr v2, v3

    sub-float v3, v10, v2

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    int-to-long v12, v6

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v14, v3

    shl-long/2addr v12, v4

    and-long/2addr v14, v7

    or-long v18, v12, v14

    add-float/2addr v9, v5

    add-float/2addr v10, v2

    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v5, v5

    shl-long/2addr v2, v4

    and-long/2addr v5, v7

    or-long v20, v2, v5

    sget-object v16, Li2/t;->b:Li2/s;

    invoke-static/range {p0 .. p2}, Ljn2/c;->j(JF)[Ll83/k;

    move-result-object v2

    array-length v3, v2

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, [Ll83/k;

    const/16 v22, 0x8

    invoke-static/range {v16 .. v22}, Li2/s;->e(Li2/s;[Ll83/k;JJI)Li2/k0;

    move-result-object v2

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v5

    invoke-static/range {p3 .. p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v9, v1

    invoke-static/range {p3 .. p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v12, v1

    shl-long v3, v9, v4

    and-long/2addr v7, v12

    or-long/2addr v3, v7

    new-instance v9, Lk2/i;

    const/16 v17, 0x0

    const/16 v18, 0x1e

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move/from16 v13, p4

    move-object v12, v9

    invoke-direct/range {v12 .. v18}, Lk2/i;-><init>(FFIILi2/t0;I)V

    const/16 v10, 0xd2

    move-wide/from16 v23, v5

    move-wide v6, v3

    move-wide/from16 v4, v23

    move-object v1, v2

    const-wide/16 v2, 0x0

    const/4 v8, 0x0

    invoke-static/range {v0 .. v10}, Lk2/e;->J0(Lk2/e;Li2/t;JJJFLk2/f;I)V

    :cond_1
    :goto_0
    return-object v11
.end method

.method private static final j(JF)[Ll83/k;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JF)[",
            "Ll83/k;"
        }
    .end annotation

    const v0, 0x3f19999a    # 0.6f

    invoke-static {p0, p1, v0}, Ljn2/c;->d(JF)J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    sget-wide v3, Li2/x;->m:J

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    new-instance v6, Ll83/k;

    invoke-direct {v6, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0x3e978d50    # 0.296f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-static {p0, p1}, Li2/x;->e(J)F

    move-result v5

    mul-float/2addr v5, p2

    invoke-static {v5, p0, p1}, Li2/x;->c(FJ)J

    move-result-wide v7

    new-instance v5, Li2/x;

    invoke-direct {v5, v7, v8}, Li2/x;-><init>(J)V

    new-instance v7, Ll83/k;

    invoke-direct {v7, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0x3ecccccd    # 0.4f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-static {v0, v1}, Li2/x;->e(J)F

    move-result v5

    mul-float/2addr v5, p2

    invoke-static {v5, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v0

    new-instance v5, Li2/x;

    invoke-direct {v5, v0, v1}, Li2/x;-><init>(J)V

    new-instance v8, Ll83/k;

    invoke-direct {v8, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0x3f051eb8    # 0.52f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {p0, p1}, Li2/x;->e(J)F

    move-result v1

    mul-float/2addr v1, p2

    invoke-static {v1, p0, p1}, Li2/x;->c(FJ)J

    move-result-wide p0

    new-instance p2, Li2/x;

    invoke-direct {p2, p0, p1}, Li2/x;-><init>(J)V

    new-instance v9, Ll83/k;

    invoke-direct {v9, v0, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const p0, 0x3f4ccccd    # 0.8f

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    new-instance p1, Li2/x;

    invoke-direct {p1, v3, v4}, Li2/x;-><init>(J)V

    new-instance v10, Ll83/k;

    invoke-direct {v10, p0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 p0, 0x3f800000    # 1.0f

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    new-instance p1, Li2/x;

    invoke-direct {p1, v3, v4}, Li2/x;-><init>(J)V

    new-instance v11, Ll83/k;

    invoke-direct {v11, p0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v6 .. v11}, [Ll83/k;

    move-result-object p0

    return-object p0
.end method
