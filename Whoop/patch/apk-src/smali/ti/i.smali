.class public final Lti/i;
.super Lti/j;
.source "SourceFile"


# instance fields
.field public final synthetic i:I

.field public final j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/List;I)V
    .locals 2

    iput p2, p0, Lti/i;->i:I

    packed-switch p2, :pswitch_data_0

    invoke-direct {p0, p1}, Lti/d;-><init>(Ljava/util/List;)V

    const/4 p2, 0x0

    move v0, p2

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge p2, v1, :cond_1

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lej/a;

    iget-object v1, v1, Lej/a;->b:Ljava/lang/Object;

    check-cast v1, Lyi/c;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lyi/c;->b:[I

    array-length v1, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Lyi/c;

    new-array p2, v0, [F

    new-array v0, v0, [I

    invoke-direct {p1, p2, v0}, Lyi/c;-><init>([F[I)V

    iput-object p1, p0, Lti/i;->j:Ljava/lang/Object;

    return-void

    :pswitch_0
    invoke-direct {p0, p1}, Lti/d;-><init>(Ljava/util/List;)V

    new-instance p1, Lej/c;

    invoke-direct {p1}, Lej/c;-><init>()V

    iput-object p1, p0, Lti/i;->j:Ljava/lang/Object;

    return-void

    :pswitch_1
    invoke-direct {p0, p1}, Lti/d;-><init>(Ljava/util/List;)V

    new-instance p1, Landroid/graphics/PointF;

    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    iput-object p1, p0, Lti/i;->j:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final f(Lej/a;F)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lti/i;->i:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lti/i;->j:Ljava/lang/Object;

    check-cast v0, Lej/c;

    iget-object v1, p1, Lej/a;->b:Ljava/lang/Object;

    if-eqz v1, :cond_2

    iget-object v2, p1, Lej/a;->c:Ljava/lang/Object;

    if-eqz v2, :cond_2

    move-object v6, v1

    check-cast v6, Lej/c;

    move-object v7, v2

    check-cast v7, Lej/c;

    iget-object v3, p0, Lti/d;->e:Ld1/j;

    if-eqz v3, :cond_0

    iget v4, p1, Lej/a;->g:F

    iget-object p1, p1, Lej/a;->h:Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v5

    invoke-virtual {p0}, Lti/d;->d()F

    move-result v9

    iget v10, p0, Lti/d;->d:F

    move v8, p2

    invoke-virtual/range {v3 .. v10}, Ld1/j;->A(FFLjava/lang/Object;Ljava/lang/Object;FFF)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lej/c;

    if-eqz p1, :cond_1

    move-object v0, p1

    goto :goto_0

    :cond_0
    move v8, p2

    :cond_1
    iget p1, v6, Lej/c;->a:F

    iget p2, v7, Lej/c;->a:F

    invoke-static {p1, p2, v8}, Ldj/g;->f(FFF)F

    move-result p1

    iget p2, v6, Lej/c;->b:F

    iget v1, v7, Lej/c;->b:F

    invoke-static {p2, v1, v8}, Ldj/g;->f(FFF)F

    move-result p2

    iput p1, v0, Lej/c;->a:F

    iput p2, v0, Lej/c;->b:F

    :goto_0
    return-object v0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Missing values for keyframe."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    move v8, p2

    invoke-virtual {p0, p1, v8, v8, v8}, Lti/i;->l(Lej/a;FFF)Landroid/graphics/PointF;

    move-result-object p1

    return-object p1

    :pswitch_1
    move v8, p2

    iget-object p2, p0, Lti/i;->j:Ljava/lang/Object;

    check-cast p2, Lyi/c;

    iget-object v0, p1, Lej/a;->b:Ljava/lang/Object;

    check-cast v0, Lyi/c;

    iget-object p1, p1, Lej/a;->c:Ljava/lang/Object;

    check-cast p1, Lyi/c;

    iget-object v1, p2, Lyi/c;->b:[I

    iget-object v2, p2, Lyi/c;->a:[F

    invoke-virtual {v0, p1}, Lyi/c;->equals(Ljava/lang/Object;)Z

    move-result v3

    iget-object v4, v0, Lyi/c;->b:[I

    if-eqz v3, :cond_3

    invoke-virtual {p2, v0}, Lyi/c;->a(Lyi/c;)V

    goto :goto_3

    :cond_3
    const/4 v3, 0x0

    cmpg-float v3, v8, v3

    if-gtz v3, :cond_4

    invoke-virtual {p2, v0}, Lyi/c;->a(Lyi/c;)V

    goto :goto_3

    :cond_4
    const/high16 v3, 0x3f800000    # 1.0f

    cmpl-float v3, v8, v3

    if-ltz v3, :cond_5

    invoke-virtual {p2, p1}, Lyi/c;->a(Lyi/c;)V

    goto :goto_3

    :cond_5
    array-length v3, v4

    iget-object v5, p1, Lyi/c;->b:[I

    array-length v6, v5

    if-ne v3, v6, :cond_8

    const/4 v3, 0x0

    :goto_1
    array-length v6, v4

    if-ge v3, v6, :cond_6

    iget-object v6, v0, Lyi/c;->a:[F

    aget v6, v6, v3

    iget-object v7, p1, Lyi/c;->a:[F

    aget v7, v7, v3

    invoke-static {v6, v7, v8}, Ldj/g;->f(FFF)F

    move-result v6

    aput v6, v2, v3

    aget v6, v4, v3

    aget v7, v5, v3

    invoke-static {v8, v6, v7}, Le93/b;->z(FII)I

    move-result v6

    aput v6, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_6
    array-length p1, v4

    :goto_2
    array-length v0, v2

    if-ge p1, v0, :cond_7

    array-length v0, v4

    add-int/lit8 v0, v0, -0x1

    aget v0, v2, v0

    aput v0, v2, p1

    array-length v0, v4

    add-int/lit8 v0, v0, -0x1

    aget v0, v1, v0

    aput v0, v1, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    :cond_7
    :goto_3
    return-object p2

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Cannot interpolate between gradients. Lengths vary ("

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v0, v4

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " vs "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v0, v5

    const-string v1, ")"

    invoke-static {p2, v0, v1}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic g(Lej/a;FFF)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lti/i;->i:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2, p3, p4}, Lti/d;->g(Lej/a;FFF)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lti/i;->l(Lej/a;FFF)Landroid/graphics/PointF;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public l(Lej/a;FFF)Landroid/graphics/PointF;
    .locals 11

    iget-object v0, p0, Lti/i;->j:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/PointF;

    iget-object v1, p1, Lej/a;->b:Ljava/lang/Object;

    if-eqz v1, :cond_1

    iget-object v2, p1, Lej/a;->c:Ljava/lang/Object;

    if-eqz v2, :cond_1

    move-object v6, v1

    check-cast v6, Landroid/graphics/PointF;

    move-object v7, v2

    check-cast v7, Landroid/graphics/PointF;

    iget-object v3, p0, Lti/d;->e:Ld1/j;

    if-eqz v3, :cond_0

    iget v4, p1, Lej/a;->g:F

    iget-object p1, p1, Lej/a;->h:Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v5

    invoke-virtual {p0}, Lti/d;->d()F

    move-result v9

    iget v10, p0, Lti/d;->d:F

    move v8, p2

    invoke-virtual/range {v3 .. v10}, Ld1/j;->A(FFLjava/lang/Object;Ljava/lang/Object;FFF)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/PointF;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    iget p1, v6, Landroid/graphics/PointF;->x:F

    iget p2, v7, Landroid/graphics/PointF;->x:F

    invoke-static {p2, p1, p3, p1}, Lb9/y;->a(FFFF)F

    move-result p1

    iget p2, v6, Landroid/graphics/PointF;->y:F

    iget p3, v7, Landroid/graphics/PointF;->y:F

    invoke-static {p3, p2, p4, p2}, Lb9/y;->a(FFFF)F

    move-result p2

    invoke-virtual {v0, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    return-object v0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Missing values for keyframe."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
