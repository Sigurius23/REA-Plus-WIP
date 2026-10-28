.class public final Lsi/i;
.super Lsi/b;
.source "SourceFile"


# instance fields
.field public A:Lti/r;

.field public final q:Ljava/lang/String;

.field public final r:Z

.field public final s:La0/y;

.field public final t:La0/y;

.field public final u:Landroid/graphics/RectF;

.field public final v:I

.field public final w:I

.field public final x:Lti/i;

.field public final y:Lti/i;

.field public final z:Lti/i;


# direct methods
.method public constructor <init>(Lqi/w;Lzi/b;Lyi/e;)V
    .locals 11

    iget v0, p3, Lyi/e;->h:I

    invoke-static {v0}, Le4/p;->e(I)I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-eq v0, v1, :cond_0

    sget-object v0, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_0
    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    goto :goto_0

    :cond_1
    sget-object v0, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    goto :goto_0

    :goto_1
    iget v0, p3, Lyi/e;->i:I

    invoke-static {v0}, Le4/p;->e(I)I

    move-result v0

    const/4 v10, 0x0

    if-eqz v0, :cond_4

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    move-object v4, v10

    goto :goto_3

    :cond_2
    sget-object v0, Landroid/graphics/Paint$Join;->BEVEL:Landroid/graphics/Paint$Join;

    :goto_2
    move-object v4, v0

    goto :goto_3

    :cond_3
    sget-object v0, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    goto :goto_2

    :cond_4
    sget-object v0, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    goto :goto_2

    :goto_3
    iget v5, p3, Lyi/e;->j:F

    iget-object v6, p3, Lyi/e;->d:Lxi/a;

    iget-object v7, p3, Lyi/e;->g:Lxi/b;

    iget-object v8, p3, Lyi/e;->k:Ljava/util/ArrayList;

    iget-object v9, p3, Lyi/e;->l:Lxi/b;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v9}, Lsi/b;-><init>(Lqi/w;Lzi/b;Landroid/graphics/Paint$Cap;Landroid/graphics/Paint$Join;FLxi/a;Lxi/b;Ljava/util/ArrayList;Lxi/b;)V

    new-instance v1, La0/y;

    invoke-direct {v1, v10}, La0/y;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lsi/i;->s:La0/y;

    new-instance v1, La0/y;

    invoke-direct {v1, v10}, La0/y;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lsi/i;->t:La0/y;

    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    iput-object v1, p0, Lsi/i;->u:Landroid/graphics/RectF;

    iget-object v1, p3, Lyi/e;->a:Ljava/lang/String;

    iput-object v1, p0, Lsi/i;->q:Ljava/lang/String;

    iget v1, p3, Lyi/e;->b:I

    iput v1, p0, Lsi/i;->v:I

    iget-boolean v1, p3, Lyi/e;->m:Z

    iput-boolean v1, p0, Lsi/i;->r:Z

    iget-object v1, p1, Lqi/w;->w:Lqi/i;

    invoke-virtual {v1}, Lqi/i;->b()F

    move-result v1

    const/high16 v3, 0x42000000    # 32.0f

    div-float/2addr v1, v3

    float-to-int v1, v1

    iput v1, p0, Lsi/i;->w:I

    iget-object v1, p3, Lyi/e;->c:Lxi/a;

    invoke-virtual {v1}, Lxi/a;->k0()Lti/d;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lti/i;

    iput-object v3, p0, Lsi/i;->x:Lti/i;

    invoke-virtual {v1, p0}, Lti/d;->a(Lti/a;)V

    invoke-virtual {p2, v1}, Lzi/b;->f(Lti/d;)V

    iget-object v1, p3, Lyi/e;->e:Lxi/a;

    invoke-virtual {v1}, Lxi/a;->k0()Lti/d;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lti/i;

    iput-object v3, p0, Lsi/i;->y:Lti/i;

    invoke-virtual {v1, p0}, Lti/d;->a(Lti/a;)V

    invoke-virtual {p2, v1}, Lzi/b;->f(Lti/d;)V

    iget-object v1, p3, Lyi/e;->f:Lxi/a;

    invoke-virtual {v1}, Lxi/a;->k0()Lti/d;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lti/i;

    iput-object v3, p0, Lsi/i;->z:Lti/i;

    invoke-virtual {v1, p0}, Lti/d;->a(Lti/a;)V

    invoke-virtual {p2, v1}, Lzi/b;->f(Lti/d;)V

    return-void
.end method


# virtual methods
.method public final c(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILdj/a;)V
    .locals 17

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lsi/i;->r:Z

    if-eqz v1, :cond_0

    return-void

    :cond_0
    iget-object v1, v0, Lsi/i;->u:Landroid/graphics/RectF;

    const/4 v2, 0x0

    move-object/from16 v3, p2

    invoke-virtual {v0, v1, v3, v2}, Lsi/b;->e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    iget v1, v0, Lsi/i;->v:I

    const/4 v2, 0x1

    iget-object v4, v0, Lsi/i;->x:Lti/i;

    iget-object v5, v0, Lsi/i;->z:Lti/i;

    iget-object v6, v0, Lsi/i;->y:Lti/i;

    if-ne v1, v2, :cond_2

    invoke-virtual {v0}, Lsi/i;->h()I

    move-result v1

    int-to-long v1, v1

    iget-object v7, v0, Lsi/i;->s:La0/y;

    invoke-virtual {v7, v1, v2}, La0/y;->c(J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/graphics/LinearGradient;

    if-eqz v8, :cond_1

    goto/16 :goto_1

    :cond_1
    invoke-virtual {v6}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/graphics/PointF;

    invoke-virtual {v5}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/PointF;

    invoke-virtual {v4}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lyi/c;

    iget-object v8, v4, Lyi/c;->b:[I

    invoke-virtual {v0, v8}, Lsi/i;->f([I)[I

    move-result-object v14

    iget-object v15, v4, Lyi/c;->a:[F

    iget v10, v6, Landroid/graphics/PointF;->x:F

    iget v11, v6, Landroid/graphics/PointF;->y:F

    iget v12, v5, Landroid/graphics/PointF;->x:F

    iget v13, v5, Landroid/graphics/PointF;->y:F

    new-instance v9, Landroid/graphics/LinearGradient;

    sget-object v16, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct/range {v9 .. v16}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    invoke-virtual {v7, v1, v2, v9}, La0/y;->g(JLjava/lang/Object;)V

    :goto_0
    move-object v8, v9

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lsi/i;->h()I

    move-result v1

    int-to-long v1, v1

    iget-object v7, v0, Lsi/i;->t:La0/y;

    invoke-virtual {v7, v1, v2}, La0/y;->c(J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/graphics/RadialGradient;

    if-eqz v8, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v6}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/graphics/PointF;

    invoke-virtual {v5}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/PointF;

    invoke-virtual {v4}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lyi/c;

    iget-object v8, v4, Lyi/c;->b:[I

    invoke-virtual {v0, v8}, Lsi/i;->f([I)[I

    move-result-object v13

    iget-object v14, v4, Lyi/c;->a:[F

    iget v10, v6, Landroid/graphics/PointF;->x:F

    iget v11, v6, Landroid/graphics/PointF;->y:F

    iget v4, v5, Landroid/graphics/PointF;->x:F

    iget v5, v5, Landroid/graphics/PointF;->y:F

    sub-float/2addr v4, v10

    float-to-double v8, v4

    sub-float/2addr v5, v11

    float-to-double v4, v5

    invoke-static {v8, v9, v4, v5}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v4

    double-to-float v12, v4

    new-instance v9, Landroid/graphics/RadialGradient;

    sget-object v15, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct/range {v9 .. v15}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    invoke-virtual {v7, v1, v2, v9}, La0/y;->g(JLjava/lang/Object;)V

    goto :goto_0

    :goto_1
    iget-object v1, v0, Lsi/b;->i:Lri/a;

    invoke-virtual {v1, v8}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    invoke-super/range {p0 .. p4}, Lsi/b;->c(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILdj/a;)V

    return-void
.end method

.method public final f([I)[I
    .locals 4

    iget-object v0, p0, Lsi/i;->A:Lti/r;

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
    .locals 2

    invoke-super {p0, p1, p2}, Lsi/b;->g(Ld1/j;Ljava/lang/Object;)V

    sget-object v0, Lqi/a0;->G:[Ljava/lang/Integer;

    if-ne p2, v0, :cond_2

    iget-object p2, p0, Lsi/i;->A:Lti/r;

    iget-object v0, p0, Lsi/b;->f:Lzi/b;

    if-eqz p2, :cond_0

    invoke-virtual {v0, p2}, Lzi/b;->m(Lti/d;)V

    :cond_0
    const/4 p2, 0x0

    if-nez p1, :cond_1

    iput-object p2, p0, Lsi/i;->A:Lti/r;

    return-void

    :cond_1
    new-instance v1, Lti/r;

    invoke-direct {v1, p1, p2}, Lti/r;-><init>(Ld1/j;Ljava/lang/Object;)V

    iput-object v1, p0, Lsi/i;->A:Lti/r;

    invoke-virtual {v1, p0}, Lti/d;->a(Lti/a;)V

    iget-object p1, p0, Lsi/i;->A:Lti/r;

    invoke-virtual {v0, p1}, Lzi/b;->f(Lti/d;)V

    :cond_2
    return-void
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lsi/i;->q:Ljava/lang/String;

    return-object v0
.end method

.method public final h()I
    .locals 4

    iget-object v0, p0, Lsi/i;->y:Lti/i;

    iget v0, v0, Lti/d;->d:F

    iget v1, p0, Lsi/i;->w:I

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget-object v2, p0, Lsi/i;->z:Lti/i;

    iget v2, v2, Lti/d;->d:F

    mul-float/2addr v2, v1

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iget-object v3, p0, Lsi/i;->x:Lti/i;

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
