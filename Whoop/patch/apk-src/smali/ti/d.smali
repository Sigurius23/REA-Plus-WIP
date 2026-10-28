.class public abstract Lti/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:Z

.field public final c:Lti/b;

.field public d:F

.field public e:Ld1/j;

.field public f:Ljava/lang/Object;

.field public g:F

.field public h:F


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lti/d;->a:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lti/d;->b:Z

    const/4 v0, 0x0

    iput v0, p0, Lti/d;->d:F

    const/4 v0, 0x0

    iput-object v0, p0, Lti/d;->f:Ljava/lang/Object;

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lti/d;->g:F

    iput v0, p0, Lti/d;->h:F

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Lt9/p;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lt9/p;-><init>(I)V

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v1, :cond_1

    new-instance v0, Lti/c;

    invoke-direct {v0, p1}, Lti/c;-><init>(Ljava/util/List;)V

    :goto_0
    move-object p1, v0

    goto :goto_1

    :cond_1
    new-instance v0, Lbl/f;

    invoke-direct {v0, p1}, Lbl/f;-><init>(Ljava/util/List;)V

    goto :goto_0

    :goto_1
    iput-object p1, p0, Lti/d;->c:Lti/b;

    return-void
.end method


# virtual methods
.method public final a(Lti/a;)V
    .locals 1

    iget-object v0, p0, Lti/d;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b()F
    .locals 2

    iget v0, p0, Lti/d;->h:F

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    iget-object v0, p0, Lti/d;->c:Lti/b;

    invoke-interface {v0}, Lti/b;->e()F

    move-result v0

    iput v0, p0, Lti/d;->h:F

    :cond_0
    iget v0, p0, Lti/d;->h:F

    return v0
.end method

.method public final c()F
    .locals 2

    iget-object v0, p0, Lti/d;->c:Lti/b;

    invoke-interface {v0}, Lti/b;->b()Lej/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lej/a;->c()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v0, v0, Lej/a;->d:Landroid/view/animation/Interpolator;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lti/d;->d()F

    move-result v1

    invoke-interface {v0, v1}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result v0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final d()F
    .locals 3

    iget-boolean v0, p0, Lti/d;->b:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lti/d;->c:Lti/b;

    invoke-interface {v0}, Lti/b;->b()Lej/a;

    move-result-object v0

    invoke-virtual {v0}, Lej/a;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    :goto_0
    const/4 v0, 0x0

    return v0

    :cond_1
    iget v1, p0, Lti/d;->d:F

    invoke-virtual {v0}, Lej/a;->b()F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {v0}, Lej/a;->a()F

    move-result v2

    invoke-virtual {v0}, Lej/a;->b()F

    move-result v0

    sub-float/2addr v2, v0

    div-float/2addr v1, v2

    return v1
.end method

.method public e()Ljava/lang/Object;
    .locals 4

    invoke-virtual {p0}, Lti/d;->d()F

    move-result v0

    iget-object v1, p0, Lti/d;->e:Ld1/j;

    iget-object v2, p0, Lti/d;->c:Lti/b;

    if-nez v1, :cond_0

    invoke-interface {v2, v0}, Lti/b;->a(F)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lti/d;->k()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v0, p0, Lti/d;->f:Ljava/lang/Object;

    return-object v0

    :cond_0
    invoke-interface {v2}, Lti/b;->b()Lej/a;

    move-result-object v1

    iget-object v2, v1, Lej/a;->e:Landroid/view/animation/Interpolator;

    iget-object v3, v1, Lej/a;->f:Landroid/view/animation/Interpolator;

    if-eqz v2, :cond_1

    if-eqz v3, :cond_1

    invoke-interface {v2, v0}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result v2

    invoke-interface {v3, v0}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result v3

    invoke-virtual {p0, v1, v0, v2, v3}, Lti/d;->g(Lej/a;FFF)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lti/d;->c()F

    move-result v0

    invoke-virtual {p0, v1, v0}, Lti/d;->f(Lej/a;F)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lti/d;->f:Ljava/lang/Object;

    return-object v0
.end method

.method public abstract f(Lej/a;F)Ljava/lang/Object;
.end method

.method public g(Lej/a;FFF)Ljava/lang/Object;
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "This animation does not support split dimensions!"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public h()V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lti/d;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lti/a;

    invoke-interface {v1}, Lti/a;->a()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public i(F)V
    .locals 4

    iget-object v0, p0, Lti/d;->c:Lti/b;

    invoke-interface {v0}, Lti/b;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    iget v1, p0, Lti/d;->g:F

    const/high16 v2, -0x40800000    # -1.0f

    cmpl-float v1, v1, v2

    if-nez v1, :cond_1

    invoke-interface {v0}, Lti/b;->d()F

    move-result v1

    iput v1, p0, Lti/d;->g:F

    :cond_1
    iget v1, p0, Lti/d;->g:F

    cmpg-float v3, p1, v1

    if-gez v3, :cond_3

    cmpl-float p1, v1, v2

    if-nez p1, :cond_2

    invoke-interface {v0}, Lti/b;->d()F

    move-result p1

    iput p1, p0, Lti/d;->g:F

    :cond_2
    iget p1, p0, Lti/d;->g:F

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lti/d;->b()F

    move-result v1

    cmpl-float v1, p1, v1

    if-lez v1, :cond_4

    invoke-virtual {p0}, Lti/d;->b()F

    move-result p1

    :cond_4
    :goto_0
    iget v1, p0, Lti/d;->d:F

    cmpl-float v1, p1, v1

    if-nez v1, :cond_5

    goto :goto_1

    :cond_5
    iput p1, p0, Lti/d;->d:F

    invoke-interface {v0, p1}, Lti/b;->c(F)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {p0}, Lti/d;->h()V

    :cond_6
    :goto_1
    return-void
.end method

.method public final j(Ld1/j;)V
    .locals 1

    iget-object v0, p0, Lti/d;->e:Ld1/j;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    iput-object p1, p0, Lti/d;->e:Ld1/j;

    return-void
.end method

.method public k()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
