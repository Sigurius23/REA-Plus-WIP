.class public final Lsi/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsi/e;
.implements Lsi/m;
.implements Lsi/j;
.implements Lti/a;
.implements Lsi/k;


# instance fields
.field public final a:Landroid/graphics/Matrix;

.field public final b:Landroid/graphics/Path;

.field public final c:Lqi/w;

.field public final d:Lzi/b;

.field public final e:Ljava/lang/String;

.field public final f:Z

.field public final g:Lti/h;

.field public final h:Lti/h;

.field public final i:Lti/q;

.field public j:Lsi/d;


# direct methods
.method public constructor <init>(Lqi/w;Lzi/b;Lyi/j;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lsi/p;->a:Landroid/graphics/Matrix;

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lsi/p;->b:Landroid/graphics/Path;

    iput-object p1, p0, Lsi/p;->c:Lqi/w;

    iput-object p2, p0, Lsi/p;->d:Lzi/b;

    iget-object p1, p3, Lyi/j;->a:Ljava/lang/String;

    iput-object p1, p0, Lsi/p;->e:Ljava/lang/String;

    iget-boolean p1, p3, Lyi/j;->e:Z

    iput-boolean p1, p0, Lsi/p;->f:Z

    iget-object p1, p3, Lyi/j;->b:Lxi/b;

    invoke-virtual {p1}, Lxi/b;->H0()Lti/h;

    move-result-object p1

    iput-object p1, p0, Lsi/p;->g:Lti/h;

    invoke-virtual {p2, p1}, Lzi/b;->f(Lti/d;)V

    invoke-virtual {p1, p0}, Lti/d;->a(Lti/a;)V

    iget-object p1, p3, Lyi/j;->c:Lxi/b;

    invoke-virtual {p1}, Lxi/b;->H0()Lti/h;

    move-result-object p1

    iput-object p1, p0, Lsi/p;->h:Lti/h;

    invoke-virtual {p2, p1}, Lzi/b;->f(Lti/d;)V

    invoke-virtual {p1, p0}, Lti/d;->a(Lti/a;)V

    iget-object p1, p3, Lyi/j;->d:Lxi/e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p3, Lti/q;

    invoke-direct {p3, p1}, Lti/q;-><init>(Lxi/e;)V

    iput-object p3, p0, Lsi/p;->i:Lti/q;

    invoke-virtual {p3, p2}, Lti/q;->a(Lzi/b;)V

    invoke-virtual {p3, p0}, Lti/q;->b(Lti/a;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lsi/p;->c:Lqi/w;

    invoke-virtual {v0}, Lqi/w;->invalidateSelf()V

    return-void
.end method

.method public final b(Ljava/util/List;Ljava/util/List;)V
    .locals 1

    iget-object v0, p0, Lsi/p;->j:Lsi/d;

    invoke-virtual {v0, p1, p2}, Lsi/d;->b(Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public final c(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILdj/a;)V
    .locals 9

    iget-object v0, p0, Lsi/p;->g:Lti/h;

    invoke-virtual {v0}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget-object v1, p0, Lsi/p;->h:Lti/h;

    invoke-virtual {v1}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    iget-object v2, p0, Lsi/p;->i:Lti/q;

    iget-object v3, v2, Lti/q;->m:Lti/d;

    invoke-virtual {v3}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    const/high16 v4, 0x42c80000    # 100.0f

    div-float/2addr v3, v4

    iget-object v5, v2, Lti/q;->n:Lti/d;

    invoke-virtual {v5}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Float;

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    div-float/2addr v5, v4

    float-to-int v4, v0

    add-int/lit8 v4, v4, -0x1

    :goto_0
    if-ltz v4, :cond_0

    iget-object v6, p0, Lsi/p;->a:Landroid/graphics/Matrix;

    invoke-virtual {v6, p2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    int-to-float v7, v4

    add-float v8, v7, v1

    invoke-virtual {v2, v8}, Lti/q;->f(F)Landroid/graphics/Matrix;

    move-result-object v8

    invoke-virtual {v6, v8}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    int-to-float v8, p3

    div-float/2addr v7, v0

    invoke-static {v3, v5, v7}, Ldj/g;->f(FFF)F

    move-result v7

    mul-float/2addr v7, v8

    iget-object v8, p0, Lsi/p;->j:Lsi/d;

    float-to-int v7, v7

    invoke-virtual {v8, p1, v6, v7, p4}, Lsi/d;->c(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILdj/a;)V

    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final d(Lwi/e;ILjava/util/ArrayList;Lwi/e;)V
    .locals 3

    invoke-static {p1, p2, p3, p4, p0}, Ldj/g;->g(Lwi/e;ILjava/util/ArrayList;Lwi/e;Lsi/k;)V

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lsi/p;->j:Lsi/d;

    iget-object v1, v1, Lsi/d;->i:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lsi/p;->j:Lsi/d;

    iget-object v1, v1, Lsi/d;->i:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsi/c;

    instance-of v2, v1, Lsi/k;

    if-eqz v2, :cond_0

    check-cast v1, Lsi/k;

    invoke-static {p1, p2, p3, p4, v1}, Ldj/g;->g(Lwi/e;ILjava/util/ArrayList;Lwi/e;Lsi/k;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 1

    iget-object v0, p0, Lsi/p;->j:Lsi/d;

    invoke-virtual {v0, p1, p2, p3}, Lsi/d;->e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    return-void
.end method

.method public final f(Ljava/util/ListIterator;)V
    .locals 8

    iget-object v0, p0, Lsi/p;->j:Lsi/d;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsi/c;

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {p1}, Ljava/util/ListIterator;->remove()V

    goto :goto_1

    :cond_2
    invoke-static {v6}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    new-instance v1, Lsi/d;

    iget-boolean v5, p0, Lsi/p;->f:Z

    const/4 v7, 0x0

    iget-object v2, p0, Lsi/p;->c:Lqi/w;

    iget-object v3, p0, Lsi/p;->d:Lzi/b;

    const-string v4, "Repeater"

    invoke-direct/range {v1 .. v7}, Lsi/d;-><init>(Lqi/w;Lzi/b;Ljava/lang/String;ZLjava/util/ArrayList;Lxi/e;)V

    iput-object v1, p0, Lsi/p;->j:Lsi/d;

    return-void
.end method

.method public final g(Ld1/j;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lsi/p;->i:Lti/q;

    invoke-virtual {v0, p1, p2}, Lti/q;->c(Ld1/j;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lqi/a0;->p:Ljava/lang/Float;

    if-ne p2, v0, :cond_1

    iget-object p2, p0, Lsi/p;->g:Lti/h;

    invoke-virtual {p2, p1}, Lti/d;->j(Ld1/j;)V

    return-void

    :cond_1
    sget-object v0, Lqi/a0;->q:Ljava/lang/Float;

    if-ne p2, v0, :cond_2

    iget-object p2, p0, Lsi/p;->h:Lti/h;

    invoke-virtual {p2, p1}, Lti/d;->j(Ld1/j;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lsi/p;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final getPath()Landroid/graphics/Path;
    .locals 6

    iget-object v0, p0, Lsi/p;->j:Lsi/d;

    invoke-virtual {v0}, Lsi/d;->getPath()Landroid/graphics/Path;

    move-result-object v0

    iget-object v1, p0, Lsi/p;->b:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    iget-object v2, p0, Lsi/p;->g:Lti/h;

    invoke-virtual {v2}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    iget-object v3, p0, Lsi/p;->h:Lti/h;

    invoke-virtual {v3}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    float-to-int v2, v2

    add-int/lit8 v2, v2, -0x1

    :goto_0
    if-ltz v2, :cond_0

    int-to-float v4, v2

    add-float/2addr v4, v3

    iget-object v5, p0, Lsi/p;->i:Lti/q;

    invoke-virtual {v5, v4}, Lti/q;->f(F)Landroid/graphics/Matrix;

    move-result-object v4

    iget-object v5, p0, Lsi/p;->a:Landroid/graphics/Matrix;

    invoke-virtual {v5, v4}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    invoke-virtual {v1, v0, v5}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method
