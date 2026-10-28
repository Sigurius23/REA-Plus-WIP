.class public final Lti/e;
.super Lti/j;
.source "SourceFile"


# instance fields
.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;I)V
    .locals 0

    iput p2, p0, Lti/e;->i:I

    invoke-direct {p0, p1}, Lti/d;-><init>(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final f(Lej/a;F)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lti/e;->i:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p1, Lej/a;->b:Ljava/lang/Object;

    if-eqz v0, :cond_6

    iget-object v1, p1, Lej/a;->c:Ljava/lang/Object;

    const v2, 0x2ec8fb09

    if-nez v1, :cond_1

    iget v1, p1, Lej/a;->k:I

    if-ne v1, v2, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, p1, Lej/a;->k:I

    :cond_0
    iget v1, p1, Lej/a;->k:I

    goto :goto_0

    :cond_1
    iget v3, p1, Lej/a;->l:I

    if-ne v3, v2, :cond_2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, p1, Lej/a;->l:I

    :cond_2
    iget v1, p1, Lej/a;->l:I

    :goto_0
    iget-object v3, p0, Lti/d;->e:Ld1/j;

    if-eqz v3, :cond_3

    iget v4, p1, Lej/a;->g:F

    iget-object v5, p1, Lej/a;->h:Ljava/lang/Float;

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    move-object v6, v0

    check-cast v6, Ljava/lang/Integer;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {p0}, Lti/d;->d()F

    move-result v9

    iget v10, p0, Lti/d;->d:F

    move v8, p2

    invoke-virtual/range {v3 .. v10}, Ld1/j;->A(FFLjava/lang/Object;Ljava/lang/Object;FFF)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_1

    :cond_3
    move v8, p2

    :cond_4
    iget p2, p1, Lej/a;->k:I

    if-ne p2, v2, :cond_5

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iput p2, p1, Lej/a;->k:I

    :cond_5
    iget p1, p1, Lej/a;->k:I

    sget-object p2, Ldj/g;->a:Landroid/graphics/PointF;

    int-to-float p2, p1

    sub-int/2addr v1, p1

    int-to-float p1, v1

    mul-float/2addr p1, v8

    add-float/2addr p1, p2

    float-to-int p1, p1

    :goto_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Missing values for keyframe."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    move v8, p2

    invoke-virtual {p0, p1, v8}, Lti/e;->l(Lej/a;F)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public l(Lej/a;F)I
    .locals 10

    iget-object v0, p1, Lej/a;->b:Ljava/lang/Object;

    iget-object v1, p1, Lej/a;->b:Ljava/lang/Object;

    if-eqz v0, :cond_2

    iget-object v0, p1, Lej/a;->c:Ljava/lang/Object;

    if-eqz v0, :cond_2

    iget-object v2, p0, Lti/d;->e:Ld1/j;

    if-eqz v2, :cond_0

    iget-object v0, p1, Lej/a;->h:Ljava/lang/Float;

    if-eqz v0, :cond_0

    iget v3, p1, Lej/a;->g:F

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v4

    move-object v5, v1

    check-cast v5, Ljava/lang/Integer;

    iget-object v0, p1, Lej/a;->c:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {p0}, Lti/d;->d()F

    move-result v8

    iget v9, p0, Lti/d;->d:F

    move v7, p2

    invoke-virtual/range {v2 .. v9}, Ld1/j;->A(FFLjava/lang/Object;Ljava/lang/Object;FFF)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_0
    move v7, p2

    :cond_1
    const/4 p2, 0x0

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v7, p2, v0}, Ldj/g;->b(FFF)F

    move-result p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object p1, p1, Lej/a;->c:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p2, v0, p1}, Le93/b;->z(FII)I

    move-result p1

    return p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Missing values for keyframe."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
