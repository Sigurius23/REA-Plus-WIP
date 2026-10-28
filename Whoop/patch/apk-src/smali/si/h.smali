.class public final Lsi/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsi/e;
.implements Lti/a;
.implements Lsi/k;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:Lzi/b;

.field public final d:La0/y;

.field public final e:La0/y;

.field public final f:Landroid/graphics/Path;

.field public final g:Lri/a;

.field public final h:Landroid/graphics/RectF;

.field public final i:Ljava/util/ArrayList;

.field public final j:I

.field public final k:Lti/i;

.field public final l:Lti/e;

.field public final m:Lti/i;

.field public final n:Lti/i;

.field public o:Lti/r;

.field public p:Lti/r;

.field public final q:Lqi/w;

.field public final r:I

.field public s:Lti/d;

.field public t:F


# direct methods
.method public constructor <init>(Lqi/w;Lqi/i;Lzi/b;Lyi/d;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La0/y;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La0/y;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lsi/h;->d:La0/y;

    new-instance v0, La0/y;

    invoke-direct {v0, v1}, La0/y;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lsi/h;->e:La0/y;

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lsi/h;->f:Landroid/graphics/Path;

    new-instance v1, Lri/a;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v1, p0, Lsi/h;->g:Lri/a;

    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    iput-object v1, p0, Lsi/h;->h:Landroid/graphics/RectF;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lsi/h;->i:Ljava/util/ArrayList;

    const/4 v1, 0x0

    iput v1, p0, Lsi/h;->t:F

    iput-object p3, p0, Lsi/h;->c:Lzi/b;

    iget-object v1, p4, Lyi/d;->g:Ljava/lang/String;

    iput-object v1, p0, Lsi/h;->a:Ljava/lang/String;

    iget-boolean v1, p4, Lyi/d;->h:Z

    iput-boolean v1, p0, Lsi/h;->b:Z

    iput-object p1, p0, Lsi/h;->q:Lqi/w;

    iget p1, p4, Lyi/d;->a:I

    iput p1, p0, Lsi/h;->j:I

    iget-object p1, p4, Lyi/d;->b:Landroid/graphics/Path$FillType;

    invoke-virtual {v0, p1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    invoke-virtual {p2}, Lqi/i;->b()F

    move-result p1

    const/high16 p2, 0x42000000    # 32.0f

    div-float/2addr p1, p2

    float-to-int p1, p1

    iput p1, p0, Lsi/h;->r:I

    iget-object p1, p4, Lyi/d;->c:Lxi/a;

    invoke-virtual {p1}, Lxi/a;->k0()Lti/d;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Lti/i;

    iput-object p2, p0, Lsi/h;->k:Lti/i;

    invoke-virtual {p1, p0}, Lti/d;->a(Lti/a;)V

    invoke-virtual {p3, p1}, Lzi/b;->f(Lti/d;)V

    iget-object p1, p4, Lyi/d;->d:Lxi/a;

    invoke-virtual {p1}, Lxi/a;->k0()Lti/d;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Lti/e;

    iput-object p2, p0, Lsi/h;->l:Lti/e;

    invoke-virtual {p1, p0}, Lti/d;->a(Lti/a;)V

    invoke-virtual {p3, p1}, Lzi/b;->f(Lti/d;)V

    iget-object p1, p4, Lyi/d;->e:Lxi/a;

    invoke-virtual {p1}, Lxi/a;->k0()Lti/d;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Lti/i;

    iput-object p2, p0, Lsi/h;->m:Lti/i;

    invoke-virtual {p1, p0}, Lti/d;->a(Lti/a;)V

    invoke-virtual {p3, p1}, Lzi/b;->f(Lti/d;)V

    iget-object p1, p4, Lyi/d;->f:Lxi/a;

    invoke-virtual {p1}, Lxi/a;->k0()Lti/d;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Lti/i;

    iput-object p2, p0, Lsi/h;->n:Lti/i;

    invoke-virtual {p1, p0}, Lti/d;->a(Lti/a;)V

    invoke-virtual {p3, p1}, Lzi/b;->f(Lti/d;)V

    invoke-virtual {p3}, Lzi/b;->j()Lty/c;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p3}, Lzi/b;->j()Lty/c;

    move-result-object p1

    invoke-virtual {p1}, Lty/c;->l()Lxi/b;

    move-result-object p1

    invoke-virtual {p1}, Lxi/b;->H0()Lti/h;

    move-result-object p1

    iput-object p1, p0, Lsi/h;->s:Lti/d;

    invoke-virtual {p1, p0}, Lti/d;->a(Lti/a;)V

    iget-object p1, p0, Lsi/h;->s:Lti/d;

    invoke-virtual {p3, p1}, Lzi/b;->f(Lti/d;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lsi/h;->q:Lqi/w;

    invoke-virtual {v0}, Lqi/w;->invalidateSelf()V

    return-void
.end method

.method public final b(Ljava/util/List;Ljava/util/List;)V
    .locals 2

    const/4 p1, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_1

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsi/c;

    instance-of v1, v0, Lsi/m;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lsi/h;->i:Ljava/util/ArrayList;

    check-cast v0, Lsi/m;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final c(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILdj/a;)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    iget-boolean v3, v0, Lsi/h;->b:Z

    if-eqz v3, :cond_0

    return-void

    :cond_0
    iget-object v3, v0, Lsi/h;->f:Landroid/graphics/Path;

    invoke-virtual {v3}, Landroid/graphics/Path;->reset()V

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    iget-object v6, v0, Lsi/h;->i:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v5, v7, :cond_1

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lsi/m;

    invoke-interface {v6}, Lsi/m;->getPath()Landroid/graphics/Path;

    move-result-object v6

    invoke-virtual {v3, v6, v1}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    iget-object v5, v0, Lsi/h;->h:Landroid/graphics/RectF;

    invoke-virtual {v3, v5, v4}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    iget v5, v0, Lsi/h;->j:I

    const/high16 v6, 0x3f800000    # 1.0f

    iget-object v7, v0, Lsi/h;->k:Lti/i;

    iget-object v8, v0, Lsi/h;->n:Lti/i;

    iget-object v9, v0, Lsi/h;->m:Lti/i;

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-ne v5, v12, :cond_4

    invoke-virtual {v0}, Lsi/h;->h()I

    move-result v5

    int-to-long v13, v5

    iget-object v5, v0, Lsi/h;->d:La0/y;

    invoke-virtual {v5, v13, v14}, La0/y;->c(J)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroid/graphics/LinearGradient;

    if-eqz v15, :cond_2

    goto/16 :goto_4

    :cond_2
    invoke-virtual {v9}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/graphics/PointF;

    invoke-virtual {v8}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/graphics/PointF;

    invoke-virtual {v7}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lyi/c;

    iget-object v15, v7, Lyi/c;->b:[I

    invoke-virtual {v0, v15}, Lsi/h;->f([I)[I

    move-result-object v15

    iget-object v7, v7, Lyi/c;->a:[F

    move/from16 v16, v4

    array-length v4, v15

    if-ge v4, v10, :cond_3

    new-array v4, v10, [I

    aget v7, v15, v16

    aput v7, v4, v16

    aget v7, v15, v16

    aput v7, v4, v12

    new-array v7, v10, [F

    aput v11, v7, v16

    aput v6, v7, v12

    move-object/from16 v22, v4

    :goto_1
    move-object/from16 v23, v7

    goto :goto_2

    :cond_3
    move-object/from16 v22, v15

    goto :goto_1

    :goto_2
    new-instance v17, Landroid/graphics/LinearGradient;

    iget v4, v9, Landroid/graphics/PointF;->x:F

    iget v6, v9, Landroid/graphics/PointF;->y:F

    iget v7, v8, Landroid/graphics/PointF;->x:F

    iget v8, v8, Landroid/graphics/PointF;->y:F

    sget-object v24, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    move/from16 v18, v4

    move/from16 v19, v6

    move/from16 v20, v7

    move/from16 v21, v8

    invoke-direct/range {v17 .. v24}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    move-object/from16 v15, v17

    invoke-virtual {v5, v13, v14, v15}, La0/y;->g(JLjava/lang/Object;)V

    goto/16 :goto_4

    :cond_4
    move/from16 v16, v4

    invoke-virtual {v0}, Lsi/h;->h()I

    move-result v4

    int-to-long v4, v4

    iget-object v13, v0, Lsi/h;->e:La0/y;

    invoke-virtual {v13, v4, v5}, La0/y;->c(J)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroid/graphics/RadialGradient;

    if-eqz v14, :cond_5

    move-object v15, v14

    goto :goto_4

    :cond_5
    invoke-virtual {v9}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/graphics/PointF;

    invoke-virtual {v8}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/graphics/PointF;

    invoke-virtual {v7}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lyi/c;

    iget-object v14, v7, Lyi/c;->b:[I

    invoke-virtual {v0, v14}, Lsi/h;->f([I)[I

    move-result-object v14

    iget-object v7, v7, Lyi/c;->a:[F

    array-length v15, v14

    if-ge v15, v10, :cond_6

    new-array v7, v10, [I

    aget v15, v14, v16

    aput v15, v7, v16

    aget v14, v14, v16

    aput v14, v7, v12

    new-array v10, v10, [F

    aput v11, v10, v16

    aput v6, v10, v12

    move-object/from16 v21, v7

    move-object/from16 v22, v10

    goto :goto_3

    :cond_6
    move-object/from16 v22, v7

    move-object/from16 v21, v14

    :goto_3
    iget v6, v9, Landroid/graphics/PointF;->x:F

    iget v7, v9, Landroid/graphics/PointF;->y:F

    iget v9, v8, Landroid/graphics/PointF;->x:F

    iget v8, v8, Landroid/graphics/PointF;->y:F

    sub-float/2addr v9, v6

    float-to-double v9, v9

    sub-float/2addr v8, v7

    float-to-double v14, v8

    invoke-static {v9, v10, v14, v15}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v8

    double-to-float v8, v8

    cmpg-float v9, v8, v11

    if-gtz v9, :cond_7

    const v8, 0x3a83126f    # 0.001f

    :cond_7
    move/from16 v20, v8

    new-instance v17, Landroid/graphics/RadialGradient;

    sget-object v23, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    move/from16 v18, v6

    move/from16 v19, v7

    invoke-direct/range {v17 .. v23}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    move-object/from16 v6, v17

    invoke-virtual {v13, v4, v5, v6}, La0/y;->g(JLjava/lang/Object;)V

    move-object v15, v6

    :goto_4
    invoke-virtual {v15, v1}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    iget-object v1, v0, Lsi/h;->g:Lri/a;

    invoke-virtual {v1, v15}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    iget-object v4, v0, Lsi/h;->o:Lti/r;

    if-eqz v4, :cond_8

    invoke-virtual {v4}, Lti/r;->e()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/ColorFilter;

    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    :cond_8
    iget-object v4, v0, Lsi/h;->s:Lti/d;

    if-eqz v4, :cond_b

    invoke-virtual {v4}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    cmpl-float v5, v4, v11

    if-nez v5, :cond_9

    const/4 v5, 0x0

    invoke-virtual {v1, v5}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    goto :goto_5

    :cond_9
    iget v5, v0, Lsi/h;->t:F

    cmpl-float v5, v4, v5

    if-eqz v5, :cond_a

    new-instance v5, Landroid/graphics/BlurMaskFilter;

    sget-object v6, Landroid/graphics/BlurMaskFilter$Blur;->NORMAL:Landroid/graphics/BlurMaskFilter$Blur;

    invoke-direct {v5, v4, v6}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    invoke-virtual {v1, v5}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    :cond_a
    :goto_5
    iput v4, v0, Lsi/h;->t:F

    :cond_b
    iget-object v4, v0, Lsi/h;->l:Lti/e;

    invoke-virtual {v4}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    int-to-float v4, v4

    const/high16 v5, 0x42c80000    # 100.0f

    div-float/2addr v4, v5

    move/from16 v5, p3

    int-to-float v5, v5

    mul-float/2addr v5, v4

    float-to-int v5, v5

    invoke-static {v5}, Ldj/g;->c(I)I

    move-result v5

    invoke-virtual {v1, v5}, Lri/a;->setAlpha(I)V

    if-eqz v2, :cond_c

    const/high16 v5, 0x437f0000    # 255.0f

    mul-float/2addr v4, v5

    float-to-int v4, v4

    invoke-virtual {v2, v4, v1}, Ldj/a;->a(ILri/a;)V

    :cond_c
    move-object/from16 v2, p1

    invoke-virtual {v2, v3, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final d(Lwi/e;ILjava/util/ArrayList;Lwi/e;)V
    .locals 0

    invoke-static {p1, p2, p3, p4, p0}, Ldj/g;->g(Lwi/e;ILjava/util/ArrayList;Lwi/e;Lsi/k;)V

    return-void
.end method

.method public final e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 4

    iget-object p3, p0, Lsi/h;->f:Landroid/graphics/Path;

    invoke-virtual {p3}, Landroid/graphics/Path;->reset()V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lsi/h;->i:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_0

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lsi/m;

    invoke-interface {v2}, Lsi/m;->getPath()Landroid/graphics/Path;

    move-result-object v2

    invoke-virtual {p3, v2, p2}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p3, p1, v0}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    iget p2, p1, Landroid/graphics/RectF;->left:F

    const/high16 p3, 0x3f800000    # 1.0f

    sub-float/2addr p2, p3

    iget v0, p1, Landroid/graphics/RectF;->top:F

    sub-float/2addr v0, p3

    iget v1, p1, Landroid/graphics/RectF;->right:F

    add-float/2addr v1, p3

    iget v2, p1, Landroid/graphics/RectF;->bottom:F

    add-float/2addr v2, p3

    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/graphics/RectF;->set(FFFF)V

    return-void
.end method

.method public final f([I)[I
    .locals 4

    iget-object v0, p0, Lsi/h;->p:Lti/r;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lti/r;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Integer;

    array-length v1, p1

    array-length v2, v0

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    :goto_0
    array-length v1, p1

    if-ge v3, v1, :cond_1

    aget-object v1, v0, v3

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    aput v1, p1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    array-length p1, v0

    new-array p1, p1, [I

    :goto_1
    array-length v1, v0

    if-ge v3, v1, :cond_1

    aget-object v1, v0, v3

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    aput v1, p1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    return-object p1
.end method

.method public final g(Ld1/j;Ljava/lang/Object;)V
    .locals 3

    sget-object v0, Lqi/a0;->a:Landroid/graphics/PointF;

    const/4 v0, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-ne p2, v0, :cond_0

    iget-object p2, p0, Lsi/h;->l:Lti/e;

    invoke-virtual {p2, p1}, Lti/d;->j(Ld1/j;)V

    return-void

    :cond_0
    sget-object v0, Lqi/a0;->F:Landroid/graphics/ColorFilter;

    const/4 v1, 0x0

    iget-object v2, p0, Lsi/h;->c:Lzi/b;

    if-ne p2, v0, :cond_3

    iget-object p2, p0, Lsi/h;->o:Lti/r;

    if-eqz p2, :cond_1

    invoke-virtual {v2, p2}, Lzi/b;->m(Lti/d;)V

    :cond_1
    if-nez p1, :cond_2

    iput-object v1, p0, Lsi/h;->o:Lti/r;

    return-void

    :cond_2
    new-instance p2, Lti/r;

    invoke-direct {p2, p1, v1}, Lti/r;-><init>(Ld1/j;Ljava/lang/Object;)V

    iput-object p2, p0, Lsi/h;->o:Lti/r;

    invoke-virtual {p2, p0}, Lti/d;->a(Lti/a;)V

    iget-object p1, p0, Lsi/h;->o:Lti/r;

    invoke-virtual {v2, p1}, Lzi/b;->f(Lti/d;)V

    return-void

    :cond_3
    sget-object v0, Lqi/a0;->G:[Ljava/lang/Integer;

    if-ne p2, v0, :cond_6

    iget-object p2, p0, Lsi/h;->p:Lti/r;

    if-eqz p2, :cond_4

    invoke-virtual {v2, p2}, Lzi/b;->m(Lti/d;)V

    :cond_4
    if-nez p1, :cond_5

    iput-object v1, p0, Lsi/h;->p:Lti/r;

    return-void

    :cond_5
    iget-object p2, p0, Lsi/h;->d:La0/y;

    invoke-virtual {p2}, La0/y;->a()V

    iget-object p2, p0, Lsi/h;->e:La0/y;

    invoke-virtual {p2}, La0/y;->a()V

    new-instance p2, Lti/r;

    invoke-direct {p2, p1, v1}, Lti/r;-><init>(Ld1/j;Ljava/lang/Object;)V

    iput-object p2, p0, Lsi/h;->p:Lti/r;

    invoke-virtual {p2, p0}, Lti/d;->a(Lti/a;)V

    iget-object p1, p0, Lsi/h;->p:Lti/r;

    invoke-virtual {v2, p1}, Lzi/b;->f(Lti/d;)V

    return-void

    :cond_6
    sget-object v0, Lqi/a0;->e:Ljava/lang/Float;

    if-ne p2, v0, :cond_8

    iget-object p2, p0, Lsi/h;->s:Lti/d;

    if-eqz p2, :cond_7

    invoke-virtual {p2, p1}, Lti/d;->j(Ld1/j;)V

    return-void

    :cond_7
    new-instance p2, Lti/r;

    invoke-direct {p2, p1, v1}, Lti/r;-><init>(Ld1/j;Ljava/lang/Object;)V

    iput-object p2, p0, Lsi/h;->s:Lti/d;

    invoke-virtual {p2, p0}, Lti/d;->a(Lti/a;)V

    iget-object p1, p0, Lsi/h;->s:Lti/d;

    invoke-virtual {v2, p1}, Lzi/b;->f(Lti/d;)V

    :cond_8
    return-void
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lsi/h;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final h()I
    .locals 4

    iget-object v0, p0, Lsi/h;->m:Lti/i;

    iget v0, v0, Lti/d;->d:F

    iget v1, p0, Lsi/h;->r:I

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget-object v2, p0, Lsi/h;->n:Lti/i;

    iget v2, v2, Lti/d;->d:F

    mul-float/2addr v2, v1

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iget-object v3, p0, Lsi/h;->k:Lti/i;

    iget v3, v3, Lti/d;->d:F

    mul-float/2addr v3, v1

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v1

    if-eqz v0, :cond_0

    const/16 v3, 0x20f

    mul-int/2addr v3, v0

    goto :goto_0

    :cond_0
    const/16 v3, 0x11

    :goto_0
    if-eqz v2, :cond_1

    mul-int/lit8 v3, v3, 0x1f

    mul-int/2addr v3, v2

    :cond_1
    if-eqz v1, :cond_2

    mul-int/lit8 v3, v3, 0x1f

    mul-int/2addr v3, v1

    :cond_2
    return v3
.end method
