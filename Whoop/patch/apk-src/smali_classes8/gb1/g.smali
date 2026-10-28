.class public abstract Lgb1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a;\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0008\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u001a9\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0008\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "Ly3/f;",
        "width",
        "Li2/x;",
        "color",
        "Li2/a1;",
        "shape",
        "on",
        "off",
        "d",
        "(Landroidx/compose/ui/Modifier;FJLi2/a1;FF)Landroidx/compose/ui/Modifier;",
        "Li2/t;",
        "brush",
        "e",
        "(Landroidx/compose/ui/Modifier;FLi2/t;Li2/a1;FF)Landroidx/compose/ui/Modifier;",
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
.method public static synthetic a(Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;Li2/t;Lkotlin/jvm/internal/d0;Lkotlin/jvm/internal/g0;Li2/p0;FFLk2/c;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lgb1/g;->h(Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;Li2/t;Lkotlin/jvm/internal/d0;Lkotlin/jvm/internal/g0;Li2/p0;FFLk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Li2/a1;FFFLi2/t;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static/range {p0 .. p7}, Lgb1/g;->f(Li2/a1;FFFLi2/t;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Li2/a1;FFFLi2/t;Lf2/d;)Lf2/g;
    .locals 0

    invoke-static/range {p0 .. p5}, Lgb1/g;->g(Li2/a1;FFFLi2/t;Lf2/d;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;FJLi2/a1;FF)Landroidx/compose/ui/Modifier;
    .locals 2

    const-string v0, "$this$dashedBorder"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shape"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-wide v0, p2

    new-instance p2, Li2/c1;

    invoke-direct {p2, v0, v1}, Li2/c1;-><init>(J)V

    move-object p3, p4

    move p4, p5

    move p5, p6

    invoke-static/range {p0 .. p5}, Lgb1/g;->e(Landroidx/compose/ui/Modifier;FLi2/t;Li2/a1;FF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;FLi2/t;Li2/a1;FF)Landroidx/compose/ui/Modifier;
    .locals 7

    const-string v0, "$this$dashedBorder"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "brush"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shape"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lgb1/e;

    move v3, p1

    move-object v6, p2

    move-object v2, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v1 .. v6}, Lgb1/e;-><init>(Li2/a1;FFFLi2/t;)V

    invoke-static {p0, v1}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Li2/a1;FFFLi2/t;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 7

    const-string p7, "$this$composed"

    invoke-static {p5, p7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p6, Lp1/q;

    const p7, 0x1d4c4316

    invoke-virtual {p6, p7}, Lp1/q;->e0(I)V

    invoke-virtual {p6, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p7

    invoke-virtual {p6, p1}, Lp1/q;->d(F)Z

    move-result v0

    or-int/2addr p7, v0

    invoke-virtual {p6, p2}, Lp1/q;->d(F)Z

    move-result v0

    or-int/2addr p7, v0

    invoke-virtual {p6, p3}, Lp1/q;->d(F)Z

    move-result v0

    or-int/2addr p7, v0

    invoke-virtual {p6, p4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p7, v0

    invoke-virtual {p6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p7, :cond_0

    sget-object p7, Lp1/l;->a:Lp1/v0;

    if-ne v0, p7, :cond_1

    :cond_0
    new-instance v1, Le81/b0;

    move-object v2, p0

    move v3, p1

    move v4, p2

    move v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Le81/b0;-><init>(Li2/a1;FFFLi2/t;)V

    invoke-virtual {p6, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v0, v1

    :cond_1
    check-cast v0, Lkotlin/jvm/functions/Function1;

    sget-object p0, Lb2/t;->w:Lb2/t;

    invoke-static {p0, v0}, Landroidx/compose/ui/draw/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-interface {p5, p0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p6, p1}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final g(Li2/a1;FFFLi2/t;Lf2/d;)Lf2/g;
    .locals 25

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p5

    const-string v3, "$this$drawWithCache"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v2, Lf2/d;->w:Lf2/b;

    invoke-interface {v3}, Lf2/b;->d()J

    move-result-wide v3

    iget-object v5, v2, Lf2/d;->w:Lf2/b;

    invoke-interface {v5}, Lf2/b;->getLayoutDirection()Ly3/m;

    move-result-object v5

    invoke-interface {v0, v3, v4, v5, v2}, Li2/a1;->a(JLy3/m;Ly3/c;)Li2/p0;

    move-result-object v13

    const/4 v3, 0x0

    invoke-static {v1, v3}, Ly3/f;->b(FF)Z

    move-result v4

    if-eqz v4, :cond_0

    const/high16 v1, 0x3f800000    # 1.0f

    :goto_0
    move v5, v1

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, Lf2/d;->getDensity()F

    move-result v4

    mul-float/2addr v1, v4

    goto :goto_0

    :goto_1
    new-instance v1, Lkotlin/jvm/internal/g0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v11, Lkotlin/jvm/internal/g0;

    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    new-instance v12, Lkotlin/jvm/internal/g0;

    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    new-instance v14, Lkotlin/jvm/internal/d0;

    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    new-instance v15, Lkotlin/jvm/internal/g0;

    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    cmpl-float v4, v5, v3

    if-lez v4, :cond_1

    iget-object v4, v2, Lf2/d;->w:Lf2/b;

    invoke-interface {v4}, Lf2/b;->d()J

    move-result-wide v6

    invoke-static {v6, v7}, Lh2/e;->d(J)F

    move-result v4

    cmpl-float v4, v4, v3

    if-lez v4, :cond_1

    instance-of v4, v13, Li2/n0;

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x2

    if-eqz v4, :cond_2

    new-instance v4, Lk2/i;

    invoke-virtual {v2}, Lf2/d;->getDensity()F

    move-result v0

    mul-float v0, v0, p2

    invoke-virtual {v2}, Lf2/d;->getDensity()F

    move-result v9

    mul-float v9, v9, p3

    new-array v8, v8, [F

    aput v0, v8, v7

    aput v9, v8, v6

    new-instance v9, Li2/k;

    new-instance v0, Landroid/graphics/DashPathEffect;

    invoke-direct {v0, v8, v3}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-direct {v9, v0}, Li2/k;-><init>(Landroid/graphics/PathEffect;)V

    const/16 v10, 0xe

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lk2/i;-><init>(FFIILi2/t0;I)V

    iput-object v4, v11, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :cond_1
    move-object v7, v11

    goto/16 :goto_4

    :cond_2
    const v4, 0x3f99999a    # 1.2f

    mul-float v17, v5, v4

    int-to-float v4, v8

    div-float v9, v17, v4

    sub-float/2addr v5, v9

    iput v5, v14, Lkotlin/jvm/internal/d0;->w:F

    iget-object v5, v2, Lf2/d;->w:Lf2/b;

    invoke-interface {v5}, Lf2/b;->d()J

    move-result-wide v9

    const/16 v5, 0x20

    shr-long/2addr v9, v5

    long-to-int v9, v9

    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    iget v10, v14, Lkotlin/jvm/internal/d0;->w:F

    mul-float/2addr v10, v4

    sub-float/2addr v9, v10

    iget-object v10, v2, Lf2/d;->w:Lf2/b;

    invoke-interface {v10}, Lf2/b;->d()J

    move-result-wide v18

    const-wide v23, 0xffffffffL

    move v10, v5

    move/from16 p1, v6

    and-long v5, v18, v23

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    iget v6, v14, Lkotlin/jvm/internal/d0;->w:F

    mul-float/2addr v6, v4

    sub-float/2addr v5, v6

    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    move v9, v10

    move-object v6, v11

    int-to-long v10, v4

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    shl-long/2addr v10, v9

    and-long v4, v4, v23

    or-long/2addr v4, v10

    iget-object v10, v2, Lf2/d;->w:Lf2/b;

    invoke-interface {v10}, Lf2/b;->getLayoutDirection()Ly3/m;

    move-result-object v10

    invoke-interface {v0, v4, v5, v10, v2}, Li2/a1;->a(JLy3/m;Ly3/c;)Li2/p0;

    move-result-object v0

    iput-object v0, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance v16, Lk2/i;

    invoke-virtual {v2}, Lf2/d;->getDensity()F

    move-result v0

    mul-float v0, v0, p2

    invoke-virtual {v2}, Lf2/d;->getDensity()F

    move-result v4

    mul-float v4, v4, p3

    new-array v5, v8, [F

    aput v0, v5, v7

    aput v4, v5, p1

    new-instance v0, Li2/k;

    new-instance v4, Landroid/graphics/DashPathEffect;

    invoke-direct {v4, v5, v3}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-direct {v0, v4}, Li2/k;-><init>(Landroid/graphics/PathEffect;)V

    const/16 v22, 0xe

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v21, v0

    invoke-direct/range {v16 .. v22}, Lk2/i;-><init>(FFIILi2/t0;I)V

    move-object/from16 v0, v16

    iput-object v0, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    instance-of v0, v13, Li2/o0;

    const/4 v3, 0x0

    if-eqz v0, :cond_3

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v0

    move-object v4, v13

    check-cast v4, Li2/o0;

    iget-object v4, v4, Li2/o0;->a:Lh2/d;

    invoke-static {v0, v4}, Li2/s0;->b(Li2/s0;Lh2/d;)V

    goto :goto_2

    :cond_3
    instance-of v0, v13, Li2/m0;

    if-eqz v0, :cond_4

    move-object v0, v13

    check-cast v0, Li2/m0;

    iget-object v0, v0, Li2/m0;->a:Li2/s0;

    goto :goto_2

    :cond_4
    move-object v0, v3

    :goto_2
    iput-object v0, v12, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object v0, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    instance-of v4, v0, Li2/o0;

    if-eqz v4, :cond_5

    check-cast v0, Li2/o0;

    iget-object v0, v0, Li2/o0;->a:Lh2/d;

    invoke-static {v0}, Lj93/l0;->O(Lh2/d;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v3

    iget-object v0, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Li2/o0;

    iget-object v0, v0, Li2/o0;->a:Lh2/d;

    invoke-static {v3, v0}, Li2/s0;->b(Li2/s0;Lh2/d;)V

    iget v0, v14, Lkotlin/jvm/internal/d0;->w:F

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v7, v0

    shl-long/2addr v4, v9

    and-long v7, v7, v23

    or-long/2addr v4, v7

    invoke-virtual {v3, v4, v5}, Li2/j;->m(J)V

    goto :goto_3

    :cond_5
    iget-object v0, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    instance-of v0, v0, Li2/m0;

    if-eqz v0, :cond_6

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v3

    iget-object v0, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Li2/m0;

    iget-object v0, v0, Li2/m0;->a:Li2/s0;

    iget v4, v14, Lkotlin/jvm/internal/d0;->w:F

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v7, v5

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    shl-long/2addr v7, v9

    and-long v4, v4, v23

    or-long/2addr v4, v7

    invoke-virtual {v3, v0, v4, v5}, Li2/j;->d(Li2/s0;J)V

    :cond_6
    :goto_3
    iput-object v3, v15, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v7, v6

    :goto_4
    new-instance v6, Lgb1/f;

    move-object/from16 v10, p4

    move-object v8, v1

    move-object v9, v12

    move-object v11, v14

    move-object v12, v15

    move/from16 v14, p2

    move/from16 v15, p3

    invoke-direct/range {v6 .. v15}, Lgb1/f;-><init>(Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;Li2/t;Lkotlin/jvm/internal/d0;Lkotlin/jvm/internal/g0;Li2/p0;FF)V

    invoke-virtual {v2, v6}, Lf2/d;->a(Lkotlin/jvm/functions/Function1;)Lf2/g;

    move-result-object v0

    return-object v0
.end method

.method private static final h(Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;Li2/t;Lkotlin/jvm/internal/d0;Lkotlin/jvm/internal/g0;Li2/p0;FFLk2/c;)Ll83/a0;
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p6

    move-object/from16 v6, p9

    const-string v7, "$this$onDrawWithContent"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v7, v6

    check-cast v7, La3/p0;

    iget-object v8, v7, La3/p0;->w:Lk2/b;

    invoke-virtual {v7}, La3/p0;->a()V

    iget-object v7, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz v7, :cond_6

    iget-object v9, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    const-wide v17, 0xffffffffL

    const/16 v19, 0x20

    if-eqz v9, :cond_5

    iget-object v11, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz v11, :cond_5

    instance-of v7, v9, Li2/o0;

    const/4 v11, 0x1

    const/16 v20, 0x0

    if-eqz v7, :cond_0

    check-cast v9, Li2/o0;

    iget-object v7, v9, Li2/o0;->a:Lh2/d;

    invoke-static {v7}, Lj93/l0;->O(Lh2/d;)Z

    move-result v7

    if-eqz v7, :cond_0

    move/from16 v21, v11

    goto :goto_0

    :cond_0
    move/from16 v21, v20

    :goto_0
    iget-object v7, v8, Lk2/b;->x:La3/p;

    invoke-virtual {v7}, La3/p;->A()J

    move-result-wide v12

    invoke-virtual {v7}, La3/p;->w()Li2/v;

    move-result-object v9

    invoke-interface {v9}, Li2/v;->q()V

    :try_start_0
    iget-object v9, v7, La3/p;->x:Ljava/lang/Object;

    check-cast v9, Laj/d;

    iget-object v14, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v14, Li2/s0;

    invoke-virtual {v9, v14, v11}, Laj/d;->b(Li2/s0;I)V

    if-eqz v21, :cond_1

    move-object/from16 v14, p4

    iget v14, v14, Lkotlin/jvm/internal/d0;->w:F

    invoke-virtual {v9, v14, v14}, Laj/d;->B(FF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v6, v7

    move-wide v4, v12

    goto/16 :goto_7

    :cond_1
    :goto_1
    const-string v9, "null cannot be cast to non-null type androidx.compose.ui.graphics.Outline.Rounded"

    if-eqz v21, :cond_2

    :try_start_1
    iget-object v1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Li2/o0;

    iget-object v1, v1, Li2/o0;->a:Lh2/d;

    iget v14, v1, Lh2/d;->a:F

    iget v15, v1, Lh2/d;->b:F

    invoke-static {v14}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v14

    int-to-long v10, v14

    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v14

    int-to-long v14, v14

    shl-long v10, v10, v19

    and-long v14, v14, v17

    or-long/2addr v10, v14

    invoke-virtual {v1}, Lh2/d;->b()F

    move-result v14

    invoke-virtual {v1}, Lh2/d;->a()F

    move-result v15

    invoke-static {v14}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    move-object/from16 v23, v7

    int-to-long v6, v14

    :try_start_2
    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v14

    int-to-long v14, v14

    shl-long v6, v6, v19

    and-long v14, v14, v17

    or-long/2addr v6, v14

    iget-wide v14, v1, Lh2/d;->e:J

    iget-object v0, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lk2/f;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    const/4 v1, 0x2

    const/16 v16, 0xd0

    move-wide/from16 v24, v12

    move-wide v12, v14

    const/4 v14, 0x0

    move-object v15, v0

    move v2, v1

    move-object v1, v8

    move-object v0, v9

    move-wide v8, v10

    move-wide/from16 v4, v24

    const/16 v22, 0x1

    move-wide v10, v6

    move-object/from16 v7, p3

    move-object/from16 v6, p9

    :try_start_3
    invoke-static/range {v6 .. v16}, Lk2/e;->J0(Lk2/e;Li2/t;JJJFLk2/f;I)V

    move-object v12, v0

    goto :goto_4

    :catchall_1
    move-exception v0

    :goto_2
    move-object/from16 v6, v23

    goto/16 :goto_7

    :catchall_2
    move-exception v0

    :goto_3
    move-wide v4, v12

    goto :goto_2

    :catchall_3
    move-exception v0

    move-object/from16 v23, v7

    goto :goto_3

    :cond_2
    move-object/from16 v6, p5

    move-object/from16 v23, v7

    move-object v1, v8

    move/from16 v22, v11

    move-wide v4, v12

    const/4 v2, 0x2

    move-object v12, v9

    iget-object v6, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz v6, :cond_3

    move-object v7, v6

    check-cast v7, Li2/s0;

    iget-object v0, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v10, v0

    check-cast v10, Lk2/f;

    const/16 v11, 0x34

    const/4 v9, 0x0

    move-object/from16 v8, p3

    move-object/from16 v6, p9

    invoke-static/range {v6 .. v11}, Lk2/e;->L(Lk2/e;Li2/s0;Li2/t;FLk2/f;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_3
    :goto_4
    invoke-virtual/range {v23 .. v23}, La3/p;->w()Li2/v;

    move-result-object v0

    invoke-interface {v0}, Li2/v;->g()V

    move-object/from16 v6, v23

    invoke-virtual {v6, v4, v5}, La3/p;->U(J)V

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v4

    shr-long v4, v4, v19

    long-to-int v0, v4

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v4

    and-long v4, v4, v17

    long-to-int v0, v4

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    iget-object v11, v1, Lk2/b;->x:La3/p;

    invoke-virtual {v11}, La3/p;->A()J

    move-result-wide v13

    invoke-virtual {v11}, La3/p;->w()Li2/v;

    move-result-object v0

    invoke-interface {v0}, Li2/v;->q()V

    :try_start_4
    iget-object v0, v11, La3/p;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Laj/d;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x1

    invoke-virtual/range {v4 .. v9}, Laj/d;->d(FFFFI)V

    const/4 v0, 0x0

    if-eqz v21, :cond_4

    invoke-static {v3, v12}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v3

    check-cast v1, Li2/o0;

    iget-object v1, v1, Li2/o0;->a:Lh2/d;

    iget v3, v1, Lh2/d;->a:F

    iget v4, v1, Lh2/d;->b:F

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v5, v3

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    shl-long v5, v5, v19

    and-long v3, v3, v17

    or-long/2addr v3, v5

    invoke-virtual {v1}, Lh2/d;->b()F

    move-result v5

    invoke-virtual {v1}, Lh2/d;->a()F

    move-result v6

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v7, v5

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v5, v5

    shl-long v7, v7, v19

    and-long v5, v5, v17

    or-long/2addr v5, v7

    iget-wide v7, v1, Lh2/d;->e:J

    new-instance v23, Lk2/i;

    move-object/from16 v1, p9

    check-cast v1, La3/p0;

    move/from16 v9, p7

    invoke-virtual {v1, v9}, La3/p0;->q0(F)F

    move-result v9

    move/from16 v10, p8

    invoke-virtual {v1, v10}, La3/p0;->q0(F)F

    move-result v1

    new-array v2, v2, [F

    aput v9, v2, v20

    aput v1, v2, v22

    new-instance v1, Li2/k;

    new-instance v9, Landroid/graphics/DashPathEffect;

    invoke-direct {v9, v2, v0}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-direct {v1, v9}, Li2/k;-><init>(Landroid/graphics/PathEffect;)V

    const/16 v29, 0xe

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v28, v1

    invoke-direct/range {v23 .. v29}, Lk2/i;-><init>(FFIILi2/t0;I)V

    move-wide v2, v3

    move-wide v4, v5

    move-wide v6, v7

    const/4 v8, 0x0

    const/16 v10, 0xc0

    move-object/from16 v1, p3

    move-object/from16 v0, p9

    move-object/from16 v9, v23

    invoke-static/range {v0 .. v10}, Lk2/e;->J0(Lk2/e;Li2/t;JJJFLk2/f;I)V

    goto :goto_5

    :catchall_4
    move-exception v0

    goto :goto_6

    :cond_4
    move-object/from16 v1, p2

    move/from16 v9, p7

    move/from16 v10, p8

    iget-object v1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Li2/s0;

    new-instance v3, Lk2/i;

    move-object/from16 v4, p9

    check-cast v4, La3/p0;

    invoke-virtual {v4, v9}, La3/p0;->q0(F)F

    move-result v5

    invoke-virtual {v4, v10}, La3/p0;->q0(F)F

    move-result v4

    new-array v2, v2, [F

    aput v5, v2, v20

    aput v4, v2, v22

    new-instance v8, Li2/k;

    new-instance v4, Landroid/graphics/DashPathEffect;

    invoke-direct {v4, v2, v0}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-direct {v8, v4}, Li2/k;-><init>(Landroid/graphics/PathEffect;)V

    const/16 v9, 0xe

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lk2/i;-><init>(FFIILi2/t0;I)V

    move-object v4, v3

    const/4 v3, 0x0

    const/16 v5, 0x30

    move-object/from16 v2, p3

    move-object/from16 v0, p9

    invoke-static/range {v0 .. v5}, Lk2/e;->L(Lk2/e;Li2/s0;Li2/t;FLk2/f;I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    :goto_5
    invoke-static {v11, v13, v14}, Ld;->z(La3/p;J)V

    goto :goto_8

    :goto_6
    invoke-static {v11, v13, v14}, Ld;->z(La3/p;J)V

    throw v0

    :goto_7
    invoke-static {v6, v4, v5}, Ld;->z(La3/p;J)V

    throw v0

    :cond_5
    move-object v1, v8

    const/4 v2, 0x2

    check-cast v7, Lk2/i;

    iget v3, v7, Lk2/i;->a:F

    int-to-float v2, v2

    div-float v2, v3, v2

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v6, v2

    shl-long v4, v4, v19

    and-long v6, v6, v17

    or-long/2addr v4, v6

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v6

    shr-long v6, v6, v19

    long-to-int v2, v6

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    sub-float/2addr v2, v3

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v6

    and-long v6, v6, v17

    long-to-int v1, v6

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    sub-float/2addr v1, v3

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v6, v1

    shl-long v1, v2, v19

    and-long v6, v6, v17

    or-long/2addr v1, v6

    iget-object v0, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lk2/f;

    const/4 v8, 0x0

    const/16 v9, 0x68

    const/4 v6, 0x0

    move-wide/from16 v30, v4

    move-wide v4, v1

    move-wide/from16 v2, v30

    move-object/from16 v1, p3

    move-object/from16 v0, p9

    invoke-static/range {v0 .. v9}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    :cond_6
    :goto_8
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
