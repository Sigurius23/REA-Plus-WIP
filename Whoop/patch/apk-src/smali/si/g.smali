.class public final Lsi/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsi/e;
.implements Lti/a;
.implements Lsi/k;


# instance fields
.field public final a:Landroid/graphics/Path;

.field public final b:Lri/a;

.field public final c:Lzi/b;

.field public final d:Ljava/lang/String;

.field public final e:Z

.field public final f:Ljava/util/ArrayList;

.field public final g:Lti/e;

.field public final h:Lti/e;

.field public i:Lti/r;

.field public final j:Lqi/w;

.field public k:Lti/d;

.field public l:F


# direct methods
.method public constructor <init>(Lqi/w;Lzi/b;Lyi/m;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lsi/g;->a:Landroid/graphics/Path;

    new-instance v1, Lri/a;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v1, p0, Lsi/g;->b:Lri/a;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lsi/g;->f:Ljava/util/ArrayList;

    iput-object p2, p0, Lsi/g;->c:Lzi/b;

    iget-object v1, p3, Lyi/m;->c:Ljava/lang/String;

    iget-object v2, p3, Lyi/m;->e:Lxi/a;

    iget-object v3, p3, Lyi/m;->d:Lxi/a;

    iput-object v1, p0, Lsi/g;->d:Ljava/lang/String;

    iget-boolean v1, p3, Lyi/m;->f:Z

    iput-boolean v1, p0, Lsi/g;->e:Z

    iput-object p1, p0, Lsi/g;->j:Lqi/w;

    invoke-virtual {p2}, Lzi/b;->j()Lty/c;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Lzi/b;->j()Lty/c;

    move-result-object p1

    invoke-virtual {p1}, Lty/c;->l()Lxi/b;

    move-result-object p1

    invoke-virtual {p1}, Lxi/b;->H0()Lti/h;

    move-result-object p1

    iput-object p1, p0, Lsi/g;->k:Lti/d;

    invoke-virtual {p1, p0}, Lti/d;->a(Lti/a;)V

    iget-object p1, p0, Lsi/g;->k:Lti/d;

    invoke-virtual {p2, p1}, Lzi/b;->f(Lti/d;)V

    :cond_0
    if-eqz v3, :cond_1

    iget-object p1, p3, Lyi/m;->b:Landroid/graphics/Path$FillType;

    invoke-virtual {v0, p1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    invoke-virtual {v3}, Lxi/a;->k0()Lti/d;

    move-result-object p1

    move-object p3, p1

    check-cast p3, Lti/e;

    iput-object p3, p0, Lsi/g;->g:Lti/e;

    invoke-virtual {p1, p0}, Lti/d;->a(Lti/a;)V

    invoke-virtual {p2, p1}, Lzi/b;->f(Lti/d;)V

    invoke-virtual {v2}, Lxi/a;->k0()Lti/d;

    move-result-object p1

    move-object p3, p1

    check-cast p3, Lti/e;

    iput-object p3, p0, Lsi/g;->h:Lti/e;

    invoke-virtual {p1, p0}, Lti/d;->a(Lti/a;)V

    invoke-virtual {p2, p1}, Lzi/b;->f(Lti/d;)V

    return-void

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Lsi/g;->g:Lti/e;

    iput-object p1, p0, Lsi/g;->h:Lti/e;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lsi/g;->j:Lqi/w;

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

    iget-object v1, p0, Lsi/g;->f:Ljava/util/ArrayList;

    check-cast v0, Lsi/m;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final c(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILdj/a;)V
    .locals 6

    iget-boolean v0, p0, Lsi/g;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lsi/g;->g:Lti/e;

    iget-object v1, v0, Lti/d;->c:Lti/b;

    invoke-interface {v1}, Lti/b;->b()Lej/a;

    move-result-object v1

    invoke-virtual {v0}, Lti/d;->c()F

    move-result v2

    invoke-virtual {v0, v1, v2}, Lti/e;->l(Lej/a;F)I

    move-result v0

    iget-object v1, p0, Lsi/g;->h:Lti/e;

    invoke-virtual {v1}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    int-to-float p3, p3

    mul-float/2addr p3, v1

    float-to-int p3, p3

    invoke-static {p3}, Ldj/g;->c(I)I

    move-result p3

    shl-int/lit8 p3, p3, 0x18

    const v2, 0xffffff

    and-int/2addr v0, v2

    or-int/2addr p3, v0

    iget-object v0, p0, Lsi/g;->b:Lri/a;

    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p3, p0, Lsi/g;->i:Lti/r;

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Lti/r;->e()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/graphics/ColorFilter;

    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    :cond_1
    iget-object p3, p0, Lsi/g;->k:Lti/d;

    if-eqz p3, :cond_5

    invoke-virtual {p3}, Lti/d;->e()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Float;

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result p3

    const/4 v2, 0x0

    cmpl-float v2, p3, v2

    if-nez v2, :cond_2

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    goto :goto_1

    :cond_2
    iget v2, p0, Lsi/g;->l:F

    cmpl-float v2, p3, v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lsi/g;->c:Lzi/b;

    iget v3, v2, Lzi/b;->A:F

    cmpl-float v3, v3, p3

    if-nez v3, :cond_3

    iget-object v2, v2, Lzi/b;->B:Landroid/graphics/BlurMaskFilter;

    goto :goto_0

    :cond_3
    new-instance v3, Landroid/graphics/BlurMaskFilter;

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    sget-object v5, Landroid/graphics/BlurMaskFilter$Blur;->NORMAL:Landroid/graphics/BlurMaskFilter$Blur;

    invoke-direct {v3, v4, v5}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    iput-object v3, v2, Lzi/b;->B:Landroid/graphics/BlurMaskFilter;

    iput p3, v2, Lzi/b;->A:F

    move-object v2, v3

    :goto_0
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    :cond_4
    :goto_1
    iput p3, p0, Lsi/g;->l:F

    :cond_5
    if-eqz p4, :cond_6

    const/high16 p3, 0x437f0000    # 255.0f

    mul-float/2addr v1, p3

    float-to-int p3, v1

    invoke-virtual {p4, p3, v0}, Ldj/a;->a(ILri/a;)V

    goto :goto_2

    :cond_6
    invoke-virtual {v0}, Landroid/graphics/Paint;->clearShadowLayer()V

    :goto_2
    iget-object p3, p0, Lsi/g;->a:Landroid/graphics/Path;

    invoke-virtual {p3}, Landroid/graphics/Path;->reset()V

    const/4 p4, 0x0

    :goto_3
    iget-object v1, p0, Lsi/g;->f:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge p4, v2, :cond_7

    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsi/m;

    invoke-interface {v1}, Lsi/m;->getPath()Landroid/graphics/Path;

    move-result-object v1

    invoke-virtual {p3, v1, p2}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    add-int/lit8 p4, p4, 0x1

    goto :goto_3

    :cond_7
    invoke-virtual {p1, p3, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final d(Lwi/e;ILjava/util/ArrayList;Lwi/e;)V
    .locals 0

    invoke-static {p1, p2, p3, p4, p0}, Ldj/g;->g(Lwi/e;ILjava/util/ArrayList;Lwi/e;Lsi/k;)V

    return-void
.end method

.method public final e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 4

    iget-object p3, p0, Lsi/g;->a:Landroid/graphics/Path;

    invoke-virtual {p3}, Landroid/graphics/Path;->reset()V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lsi/g;->f:Ljava/util/ArrayList;

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

.method public final g(Ld1/j;Ljava/lang/Object;)V
    .locals 3

    sget-object v0, Lqi/a0;->a:Landroid/graphics/PointF;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-ne p2, v0, :cond_0

    iget-object p2, p0, Lsi/g;->g:Lti/e;

    invoke-virtual {p2, p1}, Lti/d;->j(Ld1/j;)V

    return-void

    :cond_0
    const/4 v0, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-ne p2, v0, :cond_1

    iget-object p2, p0, Lsi/g;->h:Lti/e;

    invoke-virtual {p2, p1}, Lti/d;->j(Ld1/j;)V

    return-void

    :cond_1
    sget-object v0, Lqi/a0;->F:Landroid/graphics/ColorFilter;

    const/4 v1, 0x0

    iget-object v2, p0, Lsi/g;->c:Lzi/b;

    if-ne p2, v0, :cond_4

    iget-object p2, p0, Lsi/g;->i:Lti/r;

    if-eqz p2, :cond_2

    invoke-virtual {v2, p2}, Lzi/b;->m(Lti/d;)V

    :cond_2
    if-nez p1, :cond_3

    iput-object v1, p0, Lsi/g;->i:Lti/r;

    return-void

    :cond_3
    new-instance p2, Lti/r;

    invoke-direct {p2, p1, v1}, Lti/r;-><init>(Ld1/j;Ljava/lang/Object;)V

    iput-object p2, p0, Lsi/g;->i:Lti/r;

    invoke-virtual {p2, p0}, Lti/d;->a(Lti/a;)V

    iget-object p1, p0, Lsi/g;->i:Lti/r;

    invoke-virtual {v2, p1}, Lzi/b;->f(Lti/d;)V

    return-void

    :cond_4
    sget-object v0, Lqi/a0;->e:Ljava/lang/Float;

    if-ne p2, v0, :cond_6

    iget-object p2, p0, Lsi/g;->k:Lti/d;

    if-eqz p2, :cond_5

    invoke-virtual {p2, p1}, Lti/d;->j(Ld1/j;)V

    return-void

    :cond_5
    new-instance p2, Lti/r;

    invoke-direct {p2, p1, v1}, Lti/r;-><init>(Ld1/j;Ljava/lang/Object;)V

    iput-object p2, p0, Lsi/g;->k:Lti/d;

    invoke-virtual {p2, p0}, Lti/d;->a(Lti/a;)V

    iget-object p1, p0, Lsi/g;->k:Lti/d;

    invoke-virtual {v2, p1}, Lzi/b;->f(Lti/d;)V

    :cond_6
    return-void
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lsi/g;->d:Ljava/lang/String;

    return-object v0
.end method
