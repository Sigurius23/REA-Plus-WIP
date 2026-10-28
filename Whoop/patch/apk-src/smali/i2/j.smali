.class public final Li2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li2/s0;


# instance fields
.field public final a:Landroid/graphics/Path;

.field public b:Landroid/graphics/RectF;

.field public c:[F

.field public d:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>(Landroid/graphics/Path;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li2/j;->a:Landroid/graphics/Path;

    return-void
.end method

.method public static n(Lh2/c;)V
    .locals 1

    iget v0, p0, Lh2/c;->a:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lh2/c;->b:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lh2/c;->c:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_1

    iget p0, p0, Lh2/c;->d:F

    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    const-string p0, "Invalid rectangle, make sure no value is NaN"

    invoke-static {p0}, Li2/m;->c(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final d(Li2/s0;J)V
    .locals 3

    instance-of v0, p1, Li2/j;

    if-eqz v0, :cond_0

    check-cast p1, Li2/j;

    iget-object p1, p1, Li2/j;->a:Landroid/graphics/Path;

    const/16 v0, 0x20

    shr-long v0, p2, v0

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    const-wide v1, 0xffffffffL

    and-long/2addr p2, v1

    long-to-int p2, p2

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    iget-object p3, p0, Li2/j;->a:Landroid/graphics/Path;

    invoke-virtual {p3, p1, v0, p2}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;FF)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Unable to obtain android.graphics.Path"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e(Lh2/c;FF)V
    .locals 4

    iget v0, p1, Lh2/c;->a:F

    iget v1, p1, Lh2/c;->b:F

    iget v2, p1, Lh2/c;->c:F

    iget p1, p1, Lh2/c;->d:F

    iget-object v3, p0, Li2/j;->b:Landroid/graphics/RectF;

    if-nez v3, :cond_0

    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    iput-object v3, p0, Li2/j;->b:Landroid/graphics/RectF;

    :cond_0
    iget-object v3, p0, Li2/j;->b:Landroid/graphics/RectF;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3, v0, v1, v2, p1}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object p1, p0, Li2/j;->b:Landroid/graphics/RectF;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, p0, Li2/j;->a:Landroid/graphics/Path;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, p3, v1}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    return-void
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, Li2/j;->a:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    return-void
.end method

.method public final g()Lh2/c;
    .locals 5

    iget-object v0, p0, Li2/j;->b:Landroid/graphics/RectF;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Li2/j;->b:Landroid/graphics/RectF;

    :cond_0
    iget-object v0, p0, Li2/j;->b:Landroid/graphics/RectF;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v1, p0, Li2/j;->a:Landroid/graphics/Path;

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    new-instance v1, Lh2/c;

    iget v2, v0, Landroid/graphics/RectF;->left:F

    iget v3, v0, Landroid/graphics/RectF;->top:F

    iget v4, v0, Landroid/graphics/RectF;->right:F

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    invoke-direct {v1, v2, v3, v4, v0}, Lh2/c;-><init>(FFFF)V

    return-object v1
.end method

.method public final h(FF)V
    .locals 1

    iget-object v0, p0, Li2/j;->a:Landroid/graphics/Path;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Path;->lineTo(FF)V

    return-void
.end method

.method public final i(FF)V
    .locals 1

    iget-object v0, p0, Li2/j;->a:Landroid/graphics/Path;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Path;->moveTo(FF)V

    return-void
.end method

.method public final j(Li2/s0;Li2/s0;I)Z
    .locals 2

    const/4 v0, 0x0

    invoke-static {p3, v0}, Lv8/b;->o(II)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p3, Landroid/graphics/Path$Op;->DIFFERENCE:Landroid/graphics/Path$Op;

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {p3, v0}, Lv8/b;->o(II)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p3, Landroid/graphics/Path$Op;->INTERSECT:Landroid/graphics/Path$Op;

    goto :goto_0

    :cond_1
    const/4 v0, 0x4

    invoke-static {p3, v0}, Lv8/b;->o(II)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p3, Landroid/graphics/Path$Op;->REVERSE_DIFFERENCE:Landroid/graphics/Path$Op;

    goto :goto_0

    :cond_2
    const/4 v0, 0x2

    invoke-static {p3, v0}, Lv8/b;->o(II)Z

    move-result p3

    if-eqz p3, :cond_3

    sget-object p3, Landroid/graphics/Path$Op;->UNION:Landroid/graphics/Path$Op;

    goto :goto_0

    :cond_3
    sget-object p3, Landroid/graphics/Path$Op;->XOR:Landroid/graphics/Path$Op;

    :goto_0
    instance-of v0, p1, Li2/j;

    const-string v1, "Unable to obtain android.graphics.Path"

    if-eqz v0, :cond_5

    check-cast p1, Li2/j;

    iget-object p1, p1, Li2/j;->a:Landroid/graphics/Path;

    instance-of v0, p2, Li2/j;

    if-eqz v0, :cond_4

    check-cast p2, Li2/j;

    iget-object p2, p2, Li2/j;->a:Landroid/graphics/Path;

    iget-object v0, p0, Li2/j;->a:Landroid/graphics/Path;

    invoke-virtual {v0, p1, p2, p3}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    move-result p1

    return p1

    :cond_4
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final k()V
    .locals 1

    iget-object v0, p0, Li2/j;->a:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    return-void
.end method

.method public final l(I)V
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    sget-object p1, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    goto :goto_0

    :cond_0
    sget-object p1, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    :goto_0
    iget-object v0, p0, Li2/j;->a:Landroid/graphics/Path;

    invoke-virtual {v0, p1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    return-void
.end method

.method public final m(J)V
    .locals 4

    iget-object v0, p0, Li2/j;->d:Landroid/graphics/Matrix;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Li2/j;->d:Landroid/graphics/Matrix;

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    :goto_0
    iget-object v0, p0, Li2/j;->d:Landroid/graphics/Matrix;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v1, 0x20

    shr-long v1, p1, v1

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    const-wide v2, 0xffffffffL

    and-long/2addr p1, v2

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-virtual {v0, v1, p1}, Landroid/graphics/Matrix;->setTranslate(FF)V

    iget-object p1, p0, Li2/j;->d:Landroid/graphics/Matrix;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p2, p0, Li2/j;->a:Landroid/graphics/Path;

    invoke-virtual {p2, p1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    return-void
.end method
