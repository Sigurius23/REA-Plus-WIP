.class public abstract Lb4/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lb4/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb4/m;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lb4/n;->a:Lb4/m;

    return-void
.end method

.method public static final a(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    move-object v4, p3

    check-cast v4, Lp1/q;

    const v0, -0x7655255a

    invoke-virtual {v4, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    and-int/lit8 v2, p4, 0x30

    if-nez v2, :cond_2

    invoke-virtual {v4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/16 v2, 0x20

    goto :goto_1

    :cond_1
    const/16 v2, 0x10

    :goto_1
    or-int/2addr v1, v2

    :cond_2
    invoke-virtual {v4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x100

    goto :goto_2

    :cond_3
    const/16 v2, 0x80

    :goto_2
    or-int/2addr v1, v2

    and-int/lit16 v2, v1, 0x93

    const/16 v5, 0x92

    if-eq v2, v5, :cond_4

    const/4 v2, 0x1

    goto :goto_3

    :cond_4
    const/4 v2, 0x0

    :goto_3
    and-int/lit8 v5, v1, 0x1

    invoke-virtual {v4, v5, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_5

    and-int/lit8 v2, v1, 0xe

    or-int/lit16 v2, v2, 0x180

    and-int/lit8 v5, v1, 0x70

    or-int/2addr v2, v5

    const v5, 0xe000

    shl-int/lit8 v1, v1, 0x6

    and-int/2addr v1, v5

    or-int v5, v2, v1

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    invoke-static/range {v0 .. v5}, Lb4/n;->b(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_5
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_6

    new-instance v5, Lj;

    const/4 v10, 0x7

    move-object v6, p0

    move-object v7, p1

    move-object v8, p2

    move v9, p4

    invoke-direct/range {v5 .. v10}, Lj;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v5, v0, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static final b(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move/from16 v5, p5

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    const v0, 0x1e584780

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v3, v5, 0x30

    move-object/from16 v7, p1

    if-nez v3, :cond_3

    invoke-virtual {v11, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit16 v3, v5, 0x180

    if-nez v3, :cond_5

    const/4 v3, 0x0

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v0, v3

    :cond_5
    or-int/lit16 v0, v0, 0xc00

    and-int/lit16 v3, v5, 0x6000

    const/16 v6, 0x4000

    if-nez v3, :cond_7

    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    move v3, v6

    goto :goto_4

    :cond_6
    const/16 v3, 0x2000

    :goto_4
    or-int/2addr v0, v3

    :cond_7
    and-int/lit16 v3, v0, 0x2493

    const/16 v8, 0x2492

    const/4 v9, 0x0

    if-eq v3, v8, :cond_8

    const/4 v3, 0x1

    goto :goto_5

    :cond_8
    move v3, v9

    :goto_5
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v11, v8, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v3, v8, :cond_9

    new-instance v3, Lb01/f;

    const/16 v12, 0x1a

    invoke-direct {v3, v12}, Lb01/f;-><init>(I)V

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v3, Lkotlin/jvm/functions/Function1;

    sget-object v12, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:Lp1/u2;

    invoke-virtual {v11, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/view/View;

    invoke-virtual {v11, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    const/4 v15, 0x0

    if-nez v13, :cond_a

    if-ne v14, v8, :cond_c

    :cond_a
    :try_start_0
    invoke-static {v12}, Landroidx/fragment/app/o1;->F(Landroid/view/View;)Landroidx/fragment/app/m0;

    move-result-object v13

    if-eqz v13, :cond_b

    move-object v14, v13

    goto :goto_6

    :cond_b
    new-instance v13, Ljava/lang/IllegalStateException;

    new-instance v14, Ljava/lang/StringBuilder;

    const-string v10, "View "

    invoke-direct {v14, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v10, " does not have a Fragment set"

    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v13, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v13
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-object v14, v15

    :goto_6
    invoke-virtual {v11, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v14, Landroidx/fragment/app/m0;

    sget-object v10, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v11, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/content/Context;

    invoke-virtual {v11, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    and-int/lit8 v13, v0, 0xe

    if-ne v13, v2, :cond_d

    const/4 v2, 0x1

    goto :goto_7

    :cond_d
    move v2, v9

    :goto_7
    or-int/2addr v2, v12

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v2, :cond_e

    if-ne v12, v8, :cond_f

    :cond_e
    new-instance v12, La20/g;

    const/16 v2, 0x1c

    invoke-direct {v12, v2, v14, v1}, La20/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v11, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v12, Lkotlin/jvm/functions/Function1;

    const v2, 0x433d3ca8

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    and-int/lit16 v2, v0, 0x1c00

    const/16 v13, 0x800

    if-ne v2, v13, :cond_10

    const/4 v2, 0x1

    goto :goto_8

    :cond_10
    move v2, v9

    :goto_8
    invoke-virtual {v11, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v2, v13

    invoke-virtual {v11, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v2, v13

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v2, :cond_11

    if-ne v13, v8, :cond_12

    :cond_11
    new-instance v13, Lq;

    const/16 v2, 0x9

    invoke-direct {v13, v3, v14, v10, v2}, Lq;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v11, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v13, Lkotlin/jvm/functions/Function1;

    const v2, 0xe000

    and-int/2addr v2, v0

    if-ne v2, v6, :cond_13

    const/4 v9, 0x1

    :cond_13
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v9, :cond_14

    if-ne v2, v8, :cond_15

    :cond_14
    new-instance v2, La61/a;

    const/4 v6, 0x5

    invoke-direct {v2, v4, v6}, La61/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object v10, v2

    check-cast v10, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v0, v0, 0x70

    move-object v9, v13

    const/4 v13, 0x0

    move-object v6, v12

    move-object v8, v15

    move v12, v0

    invoke-static/range {v6 .. v13}, Landroidx/compose/ui/viewinterop/a;->b(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_9

    :cond_16
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object/from16 v3, p2

    :goto_9
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_17

    new-instance v0, Lm;

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v5}, Lm;-><init>(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method public static final c(Landroid/view/View;Landroid/view/View;)Z
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-ne p1, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    invoke-interface {p1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static final d(Lg2/k;Landroid/view/View;Landroid/view/View;)Landroid/graphics/Rect;
    .locals 6

    const/4 v0, 0x2

    new-array v1, v0, [I

    invoke-virtual {p1, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    new-array p1, v0, [I

    invoke-virtual {p2, p1}, Landroid/view/View;->getLocationOnScreen([I)V

    check-cast p0, Lg2/l;

    iget-object p0, p0, Lg2/l;->c:Lg2/x;

    invoke-static {p0}, Lg2/g;->h(Lg2/x;)Lg2/x;

    move-result-object p0

    const/4 p2, 0x0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lg2/g;->k(Lg2/x;)Lh2/c;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, p2

    :goto_0
    if-nez p0, :cond_1

    return-object p2

    :cond_1
    new-instance p2, Landroid/graphics/Rect;

    iget v0, p0, Lh2/c;->a:F

    float-to-int v0, v0

    const/4 v2, 0x0

    aget v3, v1, v2

    add-int/2addr v0, v3

    aget v2, p1, v2

    sub-int/2addr v0, v2

    iget v4, p0, Lh2/c;->b:F

    float-to-int v4, v4

    const/4 v5, 0x1

    aget v1, v1, v5

    add-int/2addr v4, v1

    aget p1, p1, v5

    sub-int/2addr v4, p1

    iget v5, p0, Lh2/c;->c:F

    float-to-int v5, v5

    add-int/2addr v5, v3

    sub-int/2addr v5, v2

    iget p0, p0, Lh2/c;->d:F

    float-to-int p0, p0

    add-int/2addr p0, v1

    sub-int/2addr p0, p1

    invoke-direct {p2, v0, v4, v5, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object p2
.end method

.method public static final e(Lb2/v;)Landroid/view/View;
    .locals 1

    iget-object p0, p0, Lb2/v;->w:Lb2/v;

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object p0

    iget-object p0, p0, La3/n0;->N:Lb4/l;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lb4/l;->getInteropView()Landroid/view/View;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Could not fetch interop view"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final f(Landroid/view/View;La3/n0;)V
    .locals 4

    iget-object p1, p1, La3/n0;->e0:La3/l1;

    iget-object p1, p1, La3/l1;->d:Ljava/lang/Object;

    check-cast p1, Landroidx/compose/ui/node/a;

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1}, Landroidx/compose/ui/node/NodeCoordinator;->Z(J)J

    move-result-wide v0

    const/16 p1, 0x20

    shr-long v2, v0, p1

    long-to-int p1, v2

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    add-int/2addr v1, p1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    add-int/2addr v2, v0

    invoke-virtual {p0, p1, v0, v1, v2}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method public static final g(I)F
    .locals 1

    int-to-float p0, p0

    const/4 v0, -0x1

    int-to-float v0, v0

    mul-float/2addr p0, v0

    return p0
.end method

.method public static final h(F)F
    .locals 1

    const/high16 v0, -0x40800000    # -1.0f

    mul-float/2addr p0, v0

    return p0
.end method

.method public static final i(I)I
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x2

    return p0
.end method

.method public static final j(Landroid/view/ViewGroup;La1/b;)V
    .locals 4

    instance-of v0, p0, Landroidx/fragment/app/FragmentContainerView;

    if-eqz v0, :cond_0

    invoke-virtual {p1, p0}, La1/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_1

    check-cast v2, Landroid/view/ViewGroup;

    invoke-static {v2, p1}, Lb4/n;->j(Landroid/view/ViewGroup;La1/b;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method
