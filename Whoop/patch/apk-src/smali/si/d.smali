.class public final Lsi/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsi/e;
.implements Lsi/m;
.implements Lti/a;
.implements Lwi/f;


# instance fields
.field public final a:Lbd3/v;

.field public final b:Landroid/graphics/RectF;

.field public final c:Ldj/h;

.field public final d:Landroid/graphics/Matrix;

.field public final e:Landroid/graphics/Path;

.field public final f:Landroid/graphics/RectF;

.field public final g:Ljava/lang/String;

.field public final h:Z

.field public final i:Ljava/util/ArrayList;

.field public final j:Lqi/w;

.field public k:Ljava/util/ArrayList;

.field public final l:Lti/q;


# direct methods
.method public constructor <init>(Lqi/w;Lzi/b;Ljava/lang/String;ZLjava/util/ArrayList;Lxi/e;)V
    .locals 3

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Lbd3/v;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lbd3/v;-><init>(IB)V

    iput-object v0, p0, Lsi/d;->a:Lbd3/v;

    .line 15
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lsi/d;->b:Landroid/graphics/RectF;

    .line 16
    new-instance v0, Ldj/h;

    invoke-direct {v0}, Ldj/h;-><init>()V

    iput-object v0, p0, Lsi/d;->c:Ldj/h;

    .line 17
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lsi/d;->d:Landroid/graphics/Matrix;

    .line 18
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lsi/d;->e:Landroid/graphics/Path;

    .line 19
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lsi/d;->f:Landroid/graphics/RectF;

    .line 20
    iput-object p3, p0, Lsi/d;->g:Ljava/lang/String;

    .line 21
    iput-object p1, p0, Lsi/d;->j:Lqi/w;

    .line 22
    iput-boolean p4, p0, Lsi/d;->h:Z

    .line 23
    iput-object p5, p0, Lsi/d;->i:Ljava/util/ArrayList;

    if-eqz p6, :cond_0

    .line 24
    new-instance p1, Lti/q;

    invoke-direct {p1, p6}, Lti/q;-><init>(Lxi/e;)V

    .line 25
    iput-object p1, p0, Lsi/d;->l:Lti/q;

    .line 26
    invoke-virtual {p1, p2}, Lti/q;->a(Lzi/b;)V

    .line 27
    invoke-virtual {p1, p0}, Lti/q;->b(Lti/a;)V

    .line 28
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 29
    invoke-virtual {p5}, Ljava/util/ArrayList;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    :goto_0
    if-ltz p2, :cond_2

    .line 30
    invoke-virtual {p5, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lsi/c;

    .line 31
    instance-of p4, p3, Lsi/j;

    if-eqz p4, :cond_1

    .line 32
    check-cast p3, Lsi/j;

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    .line 33
    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    :goto_1
    if-ltz p2, :cond_3

    .line 34
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lsi/j;

    invoke-virtual {p5}, Ljava/util/ArrayList;->size()I

    move-result p4

    invoke-virtual {p5, p4}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p4

    invoke-interface {p3, p4}, Lsi/j;->f(Ljava/util/ListIterator;)V

    add-int/lit8 p2, p2, -0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public constructor <init>(Lqi/w;Lzi/b;Lyi/n;Lqi/i;)V
    .locals 7

    .line 1
    iget-object v3, p3, Lyi/n;->a:Ljava/lang/String;

    .line 2
    iget-boolean v4, p3, Lyi/n;->c:Z

    .line 3
    iget-object p3, p3, Lyi/n;->b:Ljava/util/List;

    .line 4
    new-instance v5, Ljava/util/ArrayList;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v0, 0x0

    move v1, v0

    .line 5
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 6
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lyi/b;

    invoke-interface {v2, p1, p4, p2}, Lyi/b;->a(Lqi/w;Lqi/i;Lzi/b;)Lsi/c;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 7
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 8
    :cond_1
    :goto_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p4

    if-ge v0, p4, :cond_3

    .line 9
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lyi/b;

    .line 10
    instance-of v1, p4, Lxi/e;

    if-eqz v1, :cond_2

    .line 11
    check-cast p4, Lxi/e;

    :goto_2
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v6, p4

    goto :goto_3

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    const/4 p4, 0x0

    goto :goto_2

    .line 12
    :goto_3
    invoke-direct/range {v0 .. v6}, Lsi/d;-><init>(Lqi/w;Lzi/b;Ljava/lang/String;ZLjava/util/ArrayList;Lxi/e;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lsi/d;->j:Lqi/w;

    invoke-virtual {v0}, Lqi/w;->invalidateSelf()V

    return-void
.end method

.method public final b(Ljava/util/List;Ljava/util/List;)V
    .locals 3

    new-instance p2, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lsi/d;->i:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/2addr v2, v0

    invoke-direct {p2, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    :goto_0
    if-ltz p1, :cond_0

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsi/c;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, p1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, p2, v2}, Lsi/c;->b(Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final c(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILdj/a;)V
    .locals 7

    iget-boolean v0, p0, Lsi/d;->h:Z

    if-eqz v0, :cond_0

    goto/16 :goto_7

    :cond_0
    iget-object v0, p0, Lsi/d;->d:Landroid/graphics/Matrix;

    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object v1, p0, Lsi/d;->l:Lti/q;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lti/q;->e()Landroid/graphics/Matrix;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    iget-object v1, v1, Lti/q;->j:Lti/d;

    if-nez v1, :cond_1

    const/16 v1, 0x64

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :goto_0
    int-to-float v1, v1

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    int-to-float p3, p3

    mul-float/2addr v1, p3

    const/high16 p3, 0x437f0000    # 255.0f

    div-float/2addr v1, p3

    mul-float/2addr v1, p3

    float-to-int p3, v1

    :cond_2
    iget-object v1, p0, Lsi/d;->j:Lqi/w;

    iget-boolean v2, v1, Lqi/w;->S:Z

    const/16 v3, 0xff

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lsi/d;->h()Z

    move-result v2

    if-eqz v2, :cond_3

    if-ne p3, v3, :cond_4

    :cond_3
    if-eqz p4, :cond_5

    iget-boolean v1, v1, Lqi/w;->T:Z

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Lsi/d;->h()Z

    move-result v1

    if-eqz v1, :cond_5

    :cond_4
    move v1, v4

    goto :goto_1

    :cond_5
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_6

    goto :goto_2

    :cond_6
    move v3, p3

    :goto_2
    iget-object v2, p0, Lsi/d;->c:Ldj/h;

    if-eqz v1, :cond_9

    iget-object v5, p0, Lsi/d;->b:Landroid/graphics/RectF;

    const/4 v6, 0x0

    invoke-virtual {v5, v6, v6, v6, v6}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {p0, v5, p2, v4}, Lsi/d;->e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    iget-object p2, p0, Lsi/d;->a:Lbd3/v;

    iput p3, p2, Lbd3/v;->x:I

    const/4 p3, 0x0

    if-eqz p4, :cond_8

    iget v6, p4, Ldj/a;->d:I

    invoke-static {v6}, Landroid/graphics/Color;->alpha(I)I

    move-result v6

    if-lez v6, :cond_7

    iput-object p4, p2, Lbd3/v;->y:Ljava/lang/Object;

    goto :goto_3

    :cond_7
    iput-object p3, p2, Lbd3/v;->y:Ljava/lang/Object;

    :goto_3
    move-object p4, p3

    goto :goto_4

    :cond_8
    iput-object p3, p2, Lbd3/v;->y:Ljava/lang/Object;

    :goto_4
    invoke-virtual {v2, p1, v5, p2}, Ldj/h;->e(Landroid/graphics/Canvas;Landroid/graphics/RectF;Lbd3/v;)Landroid/graphics/Canvas;

    move-result-object p1

    goto :goto_5

    :cond_9
    if-eqz p4, :cond_a

    new-instance p2, Ldj/a;

    invoke-direct {p2, p4}, Ldj/a;-><init>(Ldj/a;)V

    invoke-virtual {p2, v3}, Ldj/a;->b(I)V

    move-object p4, p2

    :cond_a
    :goto_5
    iget-object p2, p0, Lsi/d;->i:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p3

    sub-int/2addr p3, v4

    :goto_6
    if-ltz p3, :cond_c

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lsi/e;

    if-eqz v5, :cond_b

    check-cast v4, Lsi/e;

    invoke-interface {v4, p1, v0, v3, p4}, Lsi/e;->c(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILdj/a;)V

    :cond_b
    add-int/lit8 p3, p3, -0x1

    goto :goto_6

    :cond_c
    if-eqz v1, :cond_d

    invoke-virtual {v2}, Ldj/h;->c()V

    :cond_d
    :goto_7
    return-void
.end method

.method public final d(Lwi/e;ILjava/util/ArrayList;Lwi/e;)V
    .locals 3

    iget-object v0, p0, Lsi/d;->g:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lwi/e;->e(ILjava/lang/String;)Z

    move-result v1

    const-string v2, "__container"

    if-nez v1, :cond_0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p4, v0}, Lwi/e;->a(Ljava/lang/String;)Lwi/e;

    move-result-object p4

    invoke-virtual {p1, p2, v0}, Lwi/e;->b(ILjava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p4, p0}, Lwi/e;->g(Lwi/f;)Lwi/e;

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {p1, p2, v0}, Lwi/e;->f(ILjava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1, p2, v0}, Lwi/e;->d(ILjava/lang/String;)I

    move-result v0

    add-int/2addr v0, p2

    const/4 p2, 0x0

    :goto_0
    iget-object v1, p0, Lsi/d;->i:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge p2, v2, :cond_3

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsi/c;

    instance-of v2, v1, Lwi/f;

    if-eqz v2, :cond_2

    check-cast v1, Lwi/f;

    invoke-interface {v1, p1, v0, p3, p4}, Lwi/f;->d(Lwi/e;ILjava/util/ArrayList;Lwi/e;)V

    :cond_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public final e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 5

    iget-object v0, p0, Lsi/d;->d:Landroid/graphics/Matrix;

    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object p2, p0, Lsi/d;->l:Lti/q;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lti/q;->e()Landroid/graphics/Matrix;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    :cond_0
    iget-object p2, p0, Lsi/d;->f:Landroid/graphics/RectF;

    const/4 v1, 0x0

    invoke-virtual {p2, v1, v1, v1, v1}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v1, p0, Lsi/d;->i:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    :goto_0
    if-ltz v2, :cond_2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lsi/c;

    instance-of v4, v3, Lsi/e;

    if-eqz v4, :cond_1

    check-cast v3, Lsi/e;

    invoke-interface {v3, p2, v0, p3}, Lsi/e;->e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    invoke-virtual {p1, p2}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    :cond_1
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final f()Ljava/util/List;
    .locals 3

    iget-object v0, p0, Lsi/d;->k:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lsi/d;->k:Ljava/util/ArrayList;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lsi/d;->i:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsi/c;

    instance-of v2, v1, Lsi/m;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lsi/d;->k:Ljava/util/ArrayList;

    check-cast v1, Lsi/m;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lsi/d;->k:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final g(Ld1/j;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lsi/d;->l:Lti/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lti/q;->c(Ld1/j;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final getPath()Landroid/graphics/Path;
    .locals 6

    iget-object v0, p0, Lsi/d;->d:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    iget-object v1, p0, Lsi/d;->l:Lti/q;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lti/q;->e()Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    :cond_0
    iget-object v1, p0, Lsi/d;->e:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    iget-boolean v2, p0, Lsi/d;->h:Z

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lsi/d;->i:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    :goto_0
    if-ltz v3, :cond_3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lsi/c;

    instance-of v5, v4, Lsi/m;

    if-eqz v5, :cond_2

    check-cast v4, Lsi/m;

    invoke-interface {v4}, Lsi/m;->getPath()Landroid/graphics/Path;

    move-result-object v4

    invoke-virtual {v1, v4, v0}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    :cond_2
    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-object v1
.end method

.method public final h()Z
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    iget-object v3, p0, Lsi/d;->i:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v1, v4, :cond_1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v3, v3, Lsi/e;

    if-eqz v3, :cond_0

    add-int/lit8 v2, v2, 0x1

    const/4 v3, 0x2

    if-lt v2, v3, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method
