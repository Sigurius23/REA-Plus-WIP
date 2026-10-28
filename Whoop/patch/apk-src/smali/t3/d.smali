.class public final Lt3/d;
.super Landroid/text/TextPaint;
.source "SourceFile"


# instance fields
.field public a:Li2/h;

.field public b:Lw3/l;

.field public c:I

.field public d:Li2/z0;

.field public e:Li2/x;

.field public f:Li2/t;

.field public g:Lp1/f0;

.field public h:Lh2/e;

.field public i:Lk2/f;


# virtual methods
.method public final a()Li2/q0;
    .locals 1

    iget-object v0, p0, Lt3/d;->a:Li2/h;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Li2/h;

    invoke-direct {v0, p0}, Li2/h;-><init>(Landroid/graphics/Paint;)V

    iput-object v0, p0, Lt3/d;->a:Li2/h;

    return-object v0
.end method

.method public final b(I)V
    .locals 1

    iget v0, p0, Lt3/d;->c:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lt3/d;->a()Li2/q0;

    move-result-object v0

    check-cast v0, Li2/h;

    invoke-virtual {v0, p1}, Li2/h;->d(I)V

    iput p1, p0, Lt3/d;->c:I

    return-void
.end method

.method public final c(Li2/t;JF)V
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    iput-object v0, p0, Lt3/d;->g:Lp1/f0;

    iput-object v0, p0, Lt3/d;->f:Li2/t;

    iput-object v0, p0, Lt3/d;->h:Lh2/e;

    invoke-virtual {p0, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-void

    :cond_0
    instance-of v1, p1, Li2/c1;

    if-eqz v1, :cond_1

    check-cast p1, Li2/c1;

    iget-wide p1, p1, Li2/c1;->c:J

    invoke-static {p4, p1, p2}, Ls3/d;->p(FJ)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lt3/d;->d(J)V

    return-void

    :cond_1
    instance-of v1, p1, Li2/y0;

    if-eqz v1, :cond_7

    iget-object v1, p0, Lt3/d;->f:Li2/t;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    iget-object v1, p0, Lt3/d;->h:Lh2/e;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_0

    :cond_2
    iget-wide v3, v1, Lh2/e;->a:J

    invoke-static {v3, v4, p2, p3}, Lh2/e;->b(JJ)Z

    move-result v1

    :goto_0
    if-nez v1, :cond_5

    :cond_3
    const-wide v3, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v1, p2, v3

    if-eqz v1, :cond_4

    const/4 v2, 0x1

    :cond_4
    if-eqz v2, :cond_5

    iput-object p1, p0, Lt3/d;->f:Li2/t;

    new-instance v1, Lh2/e;

    invoke-direct {v1, p2, p3}, Lh2/e;-><init>(J)V

    iput-object v1, p0, Lt3/d;->h:Lh2/e;

    new-instance v1, Lce3/h;

    const/4 v2, 0x1

    invoke-direct {v1, p1, p2, p3, v2}, Lce3/h;-><init>(Ljava/lang/Object;JI)V

    invoke-static {v1}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object p1

    iput-object p1, p0, Lt3/d;->g:Lp1/f0;

    :cond_5
    invoke-virtual {p0}, Lt3/d;->a()Li2/q0;

    move-result-object p1

    iget-object p2, p0, Lt3/d;->g:Lp1/f0;

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/graphics/Shader;

    goto :goto_1

    :cond_6
    move-object p2, v0

    :goto_1
    check-cast p1, Li2/h;

    invoke-virtual {p1, p2}, Li2/h;->i(Landroid/graphics/Shader;)V

    iput-object v0, p0, Lt3/d;->e:Li2/x;

    invoke-static {p0, p4}, Ldt/b;->O(Landroid/text/TextPaint;F)V

    return-void

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final d(J)V
    .locals 4

    iget-object v0, p0, Lt3/d;->e:Li2/x;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    iget-wide v2, v0, Li2/x;->a:J

    invoke-static {v2, v3, p1, p2}, Li2/x;->d(JJ)Z

    move-result v0

    :goto_0
    if-nez v0, :cond_2

    const-wide/16 v2, 0x10

    cmp-long v0, p1, v2

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    if-eqz v1, :cond_2

    new-instance v0, Li2/x;

    invoke-direct {v0, p1, p2}, Li2/x;-><init>(J)V

    iput-object v0, p0, Lt3/d;->e:Li2/x;

    invoke-static {p1, p2}, Li2/w0;->H(J)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setColor(I)V

    const/4 p1, 0x0

    iput-object p1, p0, Lt3/d;->g:Lp1/f0;

    iput-object p1, p0, Lt3/d;->f:Li2/t;

    iput-object p1, p0, Lt3/d;->h:Lh2/e;

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    :cond_2
    return-void
.end method

.method public final e(Lk2/f;)V
    .locals 2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lt3/d;->i:Lk2/f;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iput-object p1, p0, Lt3/d;->i:Lk2/f;

    sget-object v0, Lk2/h;->a:Lk2/h;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    return-void

    :cond_1
    instance-of v0, p1, Lk2/i;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lt3/d;->a()Li2/q0;

    move-result-object v0

    const/4 v1, 0x1

    check-cast v0, Li2/h;

    invoke-virtual {v0, v1}, Li2/h;->m(I)V

    invoke-virtual {p0}, Lt3/d;->a()Li2/q0;

    move-result-object v0

    check-cast p1, Lk2/i;

    iget v1, p1, Lk2/i;->a:F

    check-cast v0, Li2/h;

    invoke-virtual {v0, v1}, Li2/h;->l(F)V

    invoke-virtual {p0}, Lt3/d;->a()Li2/q0;

    move-result-object v0

    iget v1, p1, Lk2/i;->b:F

    check-cast v0, Li2/h;

    iget-object v0, v0, Li2/h;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    invoke-virtual {p0}, Lt3/d;->a()Li2/q0;

    move-result-object v0

    iget v1, p1, Lk2/i;->d:I

    check-cast v0, Li2/h;

    invoke-virtual {v0, v1}, Li2/h;->k(I)V

    invoke-virtual {p0}, Lt3/d;->a()Li2/q0;

    move-result-object v0

    iget v1, p1, Lk2/i;->c:I

    check-cast v0, Li2/h;

    invoke-virtual {v0, v1}, Li2/h;->j(I)V

    invoke-virtual {p0}, Lt3/d;->a()Li2/q0;

    move-result-object v0

    iget-object p1, p1, Lk2/i;->e:Li2/t0;

    check-cast v0, Li2/h;

    invoke-virtual {v0, p1}, Li2/h;->h(Li2/t0;)V

    return-void

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_0
    return-void
.end method

.method public final f(Li2/z0;)V
    .locals 5

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lt3/d;->d:Li2/z0;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iput-object p1, p0, Lt3/d;->d:Li2/z0;

    sget-object v0, Li2/z0;->d:Li2/z0;

    invoke-virtual {p1, v0}, Li2/z0;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/graphics/Paint;->clearShadowLayer()V

    return-void

    :cond_1
    iget-object p1, p0, Lt3/d;->d:Li2/z0;

    iget v0, p1, Li2/z0;->c:F

    const/4 v1, 0x0

    cmpg-float v1, v0, v1

    if-nez v1, :cond_2

    const/4 v0, 0x1

    :cond_2
    iget-wide v1, p1, Li2/z0;->b:J

    const/16 p1, 0x20

    shr-long/2addr v1, p1

    long-to-int p1, v1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    iget-object v1, p0, Lt3/d;->d:Li2/z0;

    iget-wide v1, v1, Li2/z0;->b:J

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    iget-object v2, p0, Lt3/d;->d:Li2/z0;

    iget-wide v2, v2, Li2/z0;->a:J

    invoke-static {v2, v3}, Li2/w0;->H(J)I

    move-result v2

    invoke-virtual {p0, v0, p1, v1, v2}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final g(Lw3/l;)V
    .locals 3

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lt3/d;->b:Lw3/l;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iput-object p1, p0, Lt3/d;->b:Lw3/l;

    iget p1, p1, Lw3/l;->a:I

    or-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, p1, :cond_1

    move p1, v2

    goto :goto_0

    :cond_1
    move p1, v1

    :goto_0
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    iget-object p1, p0, Lt3/d;->b:Lw3/l;

    iget p1, p1, Lw3/l;->a:I

    or-int/lit8 v0, p1, 0x2

    if-ne v0, p1, :cond_2

    move v1, v2

    :cond_2
    invoke-virtual {p0, v1}, Landroid/graphics/Paint;->setStrikeThruText(Z)V

    :cond_3
    :goto_1
    return-void
.end method
