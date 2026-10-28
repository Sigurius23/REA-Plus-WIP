.class public interface abstract Li2/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Li2/s0;Lh2/c;)V
    .locals 5

    sget-object v0, Li2/r0;->w:Li2/r0;

    check-cast p0, Li2/j;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Li2/j;->n(Lh2/c;)V

    iget-object v1, p0, Li2/j;->b:Landroid/graphics/RectF;

    if-nez v1, :cond_0

    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    iput-object v1, p0, Li2/j;->b:Landroid/graphics/RectF;

    :cond_0
    iget-object v1, p0, Li2/j;->b:Landroid/graphics/RectF;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v2, p1, Lh2/c;->a:F

    iget v3, p1, Lh2/c;->b:F

    iget v4, p1, Lh2/c;->c:F

    iget p1, p1, Lh2/c;->d:F

    invoke-virtual {v1, v2, v3, v4, p1}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object p1, p0, Li2/j;->a:Landroid/graphics/Path;

    iget-object p0, p0, Li2/j;->b:Landroid/graphics/RectF;

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v0}, Li2/m;->b(Li2/r0;)Landroid/graphics/Path$Direction;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    return-void
.end method

.method public static b(Li2/s0;Lh2/d;)V
    .locals 13

    sget-object v0, Li2/r0;->w:Li2/r0;

    check-cast p0, Li2/j;

    iget-object v1, p0, Li2/j;->b:Landroid/graphics/RectF;

    if-nez v1, :cond_0

    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    iput-object v1, p0, Li2/j;->b:Landroid/graphics/RectF;

    :cond_0
    iget-object v1, p0, Li2/j;->b:Landroid/graphics/RectF;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v2, p1, Lh2/d;->a:F

    iget-wide v3, p1, Lh2/d;->h:J

    iget-wide v5, p1, Lh2/d;->g:J

    iget-wide v7, p1, Lh2/d;->f:J

    iget-wide v9, p1, Lh2/d;->e:J

    iget v11, p1, Lh2/d;->b:F

    iget v12, p1, Lh2/d;->c:F

    iget p1, p1, Lh2/d;->d:F

    invoke-virtual {v1, v2, v11, v12, p1}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object p1, p0, Li2/j;->c:[F

    if-nez p1, :cond_1

    const/16 p1, 0x8

    new-array p1, p1, [F

    iput-object p1, p0, Li2/j;->c:[F

    :cond_1
    iget-object p1, p0, Li2/j;->c:[F

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v1, 0x20

    shr-long v11, v9, v1

    long-to-int v2, v11

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    const/4 v11, 0x0

    aput v2, p1, v11

    const-wide v11, 0xffffffffL

    and-long/2addr v9, v11

    long-to-int v2, v9

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    const/4 v9, 0x1

    aput v2, p1, v9

    shr-long v9, v7, v1

    long-to-int v2, v9

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    const/4 v9, 0x2

    aput v2, p1, v9

    and-long/2addr v7, v11

    long-to-int v2, v7

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    const/4 v7, 0x3

    aput v2, p1, v7

    shr-long v7, v5, v1

    long-to-int v2, v7

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    const/4 v7, 0x4

    aput v2, p1, v7

    and-long/2addr v5, v11

    long-to-int v2, v5

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    const/4 v5, 0x5

    aput v2, p1, v5

    shr-long v1, v3, v1

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    const/4 v2, 0x6

    aput v1, p1, v2

    and-long v1, v3, v11

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    const/4 v2, 0x7

    aput v1, p1, v2

    iget-object p1, p0, Li2/j;->a:Landroid/graphics/Path;

    iget-object v1, p0, Li2/j;->b:Landroid/graphics/RectF;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p0, p0, Li2/j;->c:[F

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v0}, Li2/m;->b(Li2/r0;)Landroid/graphics/Path$Direction;

    move-result-object v0

    invoke-virtual {p1, v1, p0, v0}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    return-void
.end method

.method public static synthetic c(Li2/s0;Li2/s0;)V
    .locals 2

    const-wide/16 v0, 0x0

    check-cast p0, Li2/j;

    invoke-virtual {p0, p1, v0, v1}, Li2/j;->d(Li2/s0;J)V

    return-void
.end method
