.class public final Lti/n;
.super Lti/d;
.source "SourceFile"


# instance fields
.field public final i:Landroid/graphics/PointF;

.field public final j:Landroid/graphics/PointF;

.field public final k:Lti/h;

.field public final l:Lti/h;

.field public m:Ld1/j;

.field public n:Ld1/j;


# direct methods
.method public constructor <init>(Lti/h;Lti/h;)V
    .locals 1

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {p0, v0}, Lti/d;-><init>(Ljava/util/List;)V

    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lti/n;->i:Landroid/graphics/PointF;

    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lti/n;->j:Landroid/graphics/PointF;

    iput-object p1, p0, Lti/n;->k:Lti/h;

    iput-object p2, p0, Lti/n;->l:Lti/h;

    iget p1, p0, Lti/d;->d:F

    invoke-virtual {p0, p1}, Lti/n;->i(F)V

    return-void
.end method


# virtual methods
.method public final e()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lti/n;->l()Landroid/graphics/PointF;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic f(Lej/a;F)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Lti/n;->l()Landroid/graphics/PointF;

    move-result-object p1

    return-object p1
.end method

.method public final i(F)V
    .locals 2

    iget-object v0, p0, Lti/n;->k:Lti/h;

    invoke-virtual {v0, p1}, Lti/d;->i(F)V

    iget-object v1, p0, Lti/n;->l:Lti/h;

    invoke-virtual {v1, p1}, Lti/d;->i(F)V

    invoke-virtual {v0}, Lti/d;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {v1}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget-object v1, p0, Lti/n;->i:Landroid/graphics/PointF;

    invoke-virtual {v1, p1, v0}, Landroid/graphics/PointF;->set(FF)V

    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lti/d;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lti/a;

    invoke-interface {v0}, Lti/a;->a()V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final l()Landroid/graphics/PointF;
    .locals 12

    iget-object v0, p0, Lti/n;->m:Ld1/j;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lti/n;->k:Lti/h;

    iget-object v2, v0, Lti/d;->c:Lti/b;

    invoke-interface {v2}, Lti/b;->b()Lej/a;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v3, v2, Lej/a;->h:Ljava/lang/Float;

    iget-object v4, p0, Lti/n;->m:Ld1/j;

    iget v5, v2, Lej/a;->g:F

    if-nez v3, :cond_0

    move v6, v5

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    move v6, v3

    :goto_0
    iget-object v3, v2, Lej/a;->b:Ljava/lang/Object;

    move-object v7, v3

    check-cast v7, Ljava/lang/Float;

    iget-object v2, v2, Lej/a;->c:Ljava/lang/Object;

    move-object v8, v2

    check-cast v8, Ljava/lang/Float;

    invoke-virtual {v0}, Lti/d;->c()F

    move-result v9

    invoke-virtual {v0}, Lti/d;->d()F

    move-result v10

    iget v11, v0, Lti/d;->d:F

    invoke-virtual/range {v4 .. v11}, Ld1/j;->A(FFLjava/lang/Object;Ljava/lang/Object;FFF)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    iget-object v2, p0, Lti/n;->n:Ld1/j;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lti/n;->l:Lti/h;

    iget-object v3, v2, Lti/d;->c:Lti/b;

    invoke-interface {v3}, Lti/b;->b()Lej/a;

    move-result-object v3

    if-eqz v3, :cond_3

    iget-object v1, v3, Lej/a;->h:Ljava/lang/Float;

    iget-object v4, p0, Lti/n;->n:Ld1/j;

    iget v5, v3, Lej/a;->g:F

    if-nez v1, :cond_2

    move v6, v5

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    move v6, v1

    :goto_2
    iget-object v1, v3, Lej/a;->b:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Ljava/lang/Float;

    iget-object v1, v3, Lej/a;->c:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Ljava/lang/Float;

    invoke-virtual {v2}, Lti/d;->c()F

    move-result v9

    invoke-virtual {v2}, Lti/d;->d()F

    move-result v10

    iget v11, v2, Lti/d;->d:F

    invoke-virtual/range {v4 .. v11}, Ld1/j;->A(FFLjava/lang/Object;Ljava/lang/Object;FFF)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    :cond_3
    const/4 v2, 0x0

    iget-object v3, p0, Lti/n;->i:Landroid/graphics/PointF;

    iget-object v4, p0, Lti/n;->j:Landroid/graphics/PointF;

    if-nez v0, :cond_4

    iget v0, v3, Landroid/graphics/PointF;->x:F

    invoke-virtual {v4, v0, v2}, Landroid/graphics/PointF;->set(FF)V

    goto :goto_3

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {v4, v0, v2}, Landroid/graphics/PointF;->set(FF)V

    :goto_3
    if-nez v1, :cond_5

    iget v0, v4, Landroid/graphics/PointF;->x:F

    iget v1, v3, Landroid/graphics/PointF;->y:F

    invoke-virtual {v4, v0, v1}, Landroid/graphics/PointF;->set(FF)V

    return-object v4

    :cond_5
    iget v0, v4, Landroid/graphics/PointF;->x:F

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/graphics/PointF;->set(FF)V

    return-object v4
.end method

.method public final m(Ld1/j;)V
    .locals 1

    iget-object v0, p0, Lti/n;->m:Ld1/j;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    iput-object p1, p0, Lti/n;->m:Ld1/j;

    return-void
.end method

.method public final n(Ld1/j;)V
    .locals 1

    iget-object v0, p0, Lti/n;->n:Ld1/j;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    iput-object p1, p0, Lti/n;->n:Ld1/j;

    return-void
.end method
