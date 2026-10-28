.class public final Lou/f;
.super Lou/e;
.source "SourceFile"


# instance fields
.field public p:J

.field public q:F

.field public r:Z

.field public s:Z

.field public t:I


# virtual methods
.method public final a(Landroid/view/MotionEvent;)Z
    .locals 8

    invoke-super {p0, p1}, Lou/e;->a(Landroid/view/MotionEvent;)Z

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p1

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p1, v2, :cond_9

    if-eq p1, v0, :cond_3

    const/4 v0, 0x5

    if-eq p1, v0, :cond_1

    const/4 v0, 0x6

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean v2, p0, Lou/f;->s:Z

    return v1

    :cond_1
    iget-boolean p1, p0, Lou/f;->s:Z

    if-eqz p1, :cond_2

    iput-boolean v2, p0, Lou/f;->r:Z

    :cond_2
    iget-object p1, p0, Lou/e;->l:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    iput p1, p0, Lou/f;->t:I

    return v1

    :cond_3
    iget-boolean p1, p0, Lou/f;->r:Z

    if-eqz p1, :cond_4

    :goto_0
    return v1

    :cond_4
    iget-object p1, p0, Lou/e;->m:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lou/d;

    iget v3, v0, Lou/d;->c:F

    iget v4, v0, Lou/d;->a:F

    sub-float/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    iget v4, v0, Lou/d;->d:F

    iget v0, v0, Lou/d;->b:F

    sub-float/2addr v4, v0

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v4, p0, Lou/f;->q:F

    cmpl-float v3, v3, v4

    if-gtz v3, :cond_7

    cmpl-float v0, v0, v4

    if-lez v0, :cond_6

    goto :goto_1

    :cond_6
    move v0, v1

    goto :goto_2

    :cond_7
    :goto_1
    move v0, v2

    :goto_2
    iput-boolean v0, p0, Lou/f;->r:Z

    if-eqz v0, :cond_5

    goto :goto_3

    :cond_8
    move v2, v1

    :goto_3
    iput-boolean v2, p0, Lou/f;->r:Z

    return v1

    :cond_9
    const/4 p1, 0x4

    invoke-virtual {p0, p1}, Lou/f;->b(I)Z

    move-result p1

    if-eqz p1, :cond_d

    iget-object p1, p0, Lou/a;->h:Ljava/lang/Object;

    check-cast p1, Lov/j;

    iget v3, p0, Lou/f;->t:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lov/j;->a:Lov/o;

    iget-object v4, p1, Lov/o;->u0:Lpv/b;

    iget-boolean v4, v4, Lpv/b;->H:Z

    if-eqz v4, :cond_d

    if-eq v3, v0, :cond_a

    goto :goto_5

    :cond_a
    iget-object v0, p1, Lov/o;->K:Lfv/a;

    if-eqz v0, :cond_c

    iget-object v3, p1, Lov/o;->L:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-static {v3}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    check-cast v0, Lfv/h;

    invoke-virtual {v0, v3}, Lfv/h;->b(Ljava/util/List;)V

    iget-object v0, p1, Lov/o;->u0:Lpv/b;

    iget-object v0, v0, Lpv/b;->J:Lcom/mapbox/maps/ScreenCoordinate;

    if-eqz v0, :cond_b

    invoke-virtual {p1, v1, v0}, Lov/o;->l(ZLcom/mapbox/maps/ScreenCoordinate;)V

    :goto_4
    move v1, v2

    goto :goto_5

    :cond_b
    iget-object v0, p0, Lou/e;->n:Landroid/graphics/PointF;

    new-instance v3, Lcom/mapbox/maps/ScreenCoordinate;

    iget v4, v0, Landroid/graphics/PointF;->x:F

    float-to-double v4, v4

    iget v0, v0, Landroid/graphics/PointF;->y:F

    float-to-double v6, v0

    invoke-direct {v3, v4, v5, v6, v7}, Lcom/mapbox/maps/ScreenCoordinate;-><init>(DD)V

    invoke-virtual {p1, v1, v3}, Lov/o;->l(ZLcom/mapbox/maps/ScreenCoordinate;)V

    goto :goto_4

    :cond_c
    const-string p1, "cameraAnimationsPlugin"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_d
    :goto_5
    invoke-virtual {p0}, Lou/f;->g()V

    return v1
.end method

.method public final b(I)Z
    .locals 5

    iget p1, p0, Lou/f;->t:I

    const/4 v0, 0x1

    if-le p1, v0, :cond_0

    iget-boolean p1, p0, Lou/f;->r:Z

    if-nez p1, :cond_0

    iget-wide v1, p0, Lou/a;->f:J

    iget-wide v3, p0, Lou/f;->p:J

    cmp-long p1, v1, v3

    if-gez p1, :cond_0

    const/4 p1, 0x4

    invoke-super {p0, p1}, Lou/e;->b(I)Z

    move-result p1

    if-eqz p1, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final g()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lou/f;->t:I

    iput-boolean v0, p0, Lou/f;->r:Z

    iput-boolean v0, p0, Lou/f;->s:Z

    return-void
.end method
