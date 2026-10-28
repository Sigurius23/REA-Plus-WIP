.class public Landroidx/recyclerview/widget/x0;
.super Landroidx/recyclerview/widget/j2;
.source "SourceFile"


# instance fields
.field public final i:Landroid/view/animation/LinearInterpolator;

.field public final j:Landroid/view/animation/DecelerateInterpolator;

.field public k:Landroid/graphics/PointF;

.field public final l:Landroid/util/DisplayMetrics;

.field public m:Z

.field public n:F

.field public o:I

.field public p:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/j2;-><init>()V

    new-instance v0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/x0;->i:Landroid/view/animation/LinearInterpolator;

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/x0;->j:Landroid/view/animation/DecelerateInterpolator;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/recyclerview/widget/x0;->m:Z

    iput v0, p0, Landroidx/recyclerview/widget/x0;->o:I

    iput v0, p0, Landroidx/recyclerview/widget/x0;->p:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iput-object p1, p0, Landroidx/recyclerview/widget/x0;->l:Landroid/util/DisplayMetrics;

    return-void
.end method

.method public static e(IIIII)I
    .locals 1

    const/4 v0, -0x1

    if-eq p4, v0, :cond_4

    if-eqz p4, :cond_1

    const/4 p0, 0x1

    if-ne p4, p0, :cond_0

    sub-int/2addr p3, p1

    return p3

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    sub-int/2addr p2, p0

    if-lez p2, :cond_2

    return p2

    :cond_2
    sub-int/2addr p3, p1

    if-gez p3, :cond_3

    return p3

    :cond_3
    const/4 p0, 0x0

    return p0

    :cond_4
    sub-int/2addr p2, p0

    return p2
.end method


# virtual methods
.method public c(Landroid/view/View;Landroidx/recyclerview/widget/h2;)V
    .locals 6

    iget-object v0, p0, Landroidx/recyclerview/widget/x0;->k:Landroid/graphics/PointF;

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v0, :cond_2

    iget v0, v0, Landroid/graphics/PointF;->x:F

    cmpl-float v0, v0, v4

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-lez v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    move v0, v2

    goto :goto_1

    :cond_2
    :goto_0
    move v0, v1

    :goto_1
    invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/x0;->f(Landroid/view/View;I)I

    move-result v0

    iget-object v5, p0, Landroidx/recyclerview/widget/x0;->k:Landroid/graphics/PointF;

    if-eqz v5, :cond_5

    iget v5, v5, Landroid/graphics/PointF;->y:F

    cmpl-float v4, v5, v4

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    if-lez v4, :cond_4

    move v1, v3

    goto :goto_2

    :cond_4
    move v1, v2

    :cond_5
    :goto_2
    invoke-virtual {p0, p1, v1}, Landroidx/recyclerview/widget/x0;->g(Landroid/view/View;I)I

    move-result p1

    mul-int v1, v0, v0

    mul-int v2, p1, p1

    add-int/2addr v2, v1

    int-to-double v1, v2

    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    double-to-int v1, v1

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/x0;->i(I)I

    move-result v1

    int-to-double v1, v1

    const-wide v4, 0x3fd57a786c22680aL    # 0.3356

    div-double/2addr v1, v4

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v1, v1

    if-lez v1, :cond_6

    neg-int v0, v0

    neg-int p1, p1

    iput v0, p2, Landroidx/recyclerview/widget/h2;->a:I

    iput p1, p2, Landroidx/recyclerview/widget/h2;->b:I

    iput v1, p2, Landroidx/recyclerview/widget/h2;->c:I

    iget-object p1, p0, Landroidx/recyclerview/widget/x0;->j:Landroid/view/animation/DecelerateInterpolator;

    iput-object p1, p2, Landroidx/recyclerview/widget/h2;->e:Landroid/view/animation/Interpolator;

    iput-boolean v3, p2, Landroidx/recyclerview/widget/h2;->f:Z

    :cond_6
    return-void
.end method

.method public f(Landroid/view/View;I)I
    .locals 4

    iget-object v0, p0, Landroidx/recyclerview/widget/j2;->c:Landroidx/recyclerview/widget/u1;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->canScrollHorizontally()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/v1;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/u1;->getDecoratedLeft(Landroid/view/View;)I

    move-result v2

    iget v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int/2addr v2, v3

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/u1;->getDecoratedRight(Landroid/view/View;)I

    move-result p1

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr p1, v1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getPaddingLeft()I

    move-result v1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getPaddingRight()I

    move-result v0

    sub-int/2addr v3, v0

    invoke-static {v2, p1, v1, v3, p2}, Landroidx/recyclerview/widget/x0;->e(IIIII)I

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public g(Landroid/view/View;I)I
    .locals 4

    iget-object v0, p0, Landroidx/recyclerview/widget/j2;->c:Landroidx/recyclerview/widget/u1;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->canScrollVertically()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/v1;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/u1;->getDecoratedTop(Landroid/view/View;)I

    move-result v2

    iget v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    sub-int/2addr v2, v3

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/u1;->getDecoratedBottom(Landroid/view/View;)I

    move-result p1

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr p1, v1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getPaddingTop()I

    move-result v1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getHeight()I

    move-result v3

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getPaddingBottom()I

    move-result v0

    sub-int/2addr v3, v0

    invoke-static {v2, p1, v1, v3, p2}, Landroidx/recyclerview/widget/x0;->e(IIIII)I

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public h(Landroid/util/DisplayMetrics;)F
    .locals 1

    iget p1, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float p1, p1

    const/high16 v0, 0x41c80000    # 25.0f

    div-float/2addr v0, p1

    return v0
.end method

.method public i(I)I
    .locals 2

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    int-to-float p1, p1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/x0;->m:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/x0;->l:Landroid/util/DisplayMetrics;

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/x0;->h(Landroid/util/DisplayMetrics;)F

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/x0;->n:F

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/recyclerview/widget/x0;->m:Z

    :cond_0
    iget v0, p0, Landroidx/recyclerview/widget/x0;->n:F

    mul-float/2addr p1, v0

    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int p1, v0

    return p1
.end method
