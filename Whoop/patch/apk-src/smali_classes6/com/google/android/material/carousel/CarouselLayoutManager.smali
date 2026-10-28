.class public Lcom/google/android/material/carousel/CarouselLayoutManager;
.super Landroidx/recyclerview/widget/u1;
.source "SourceFile"

# interfaces
.implements Landroidx/recyclerview/widget/i2;


# instance fields
.field public final a:Ld0/f0;

.field public b:La9/a;

.field public final c:Landroid/view/View$OnLayoutChangeListener;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    new-instance v0, Ld0/f0;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ld0/f0;-><init>(I)V

    .line 2
    invoke-direct {p0}, Landroidx/recyclerview/widget/u1;-><init>()V

    .line 3
    new-instance v1, Lsq/a;

    invoke-direct {v1}, Lsq/a;-><init>()V

    .line 4
    new-instance v1, Ldb/k;

    const/4 v2, 0x5

    invoke-direct {v1, p0, v2}, Ldb/k;-><init>(Ljava/lang/Object;I)V

    iput-object v1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->c:Landroid/view/View$OnLayoutChangeListener;

    .line 5
    iput-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->a:Ld0/f0;

    .line 6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->requestLayout()V

    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->setOrientation(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation

    .line 8
    invoke-direct {p0}, Landroidx/recyclerview/widget/u1;-><init>()V

    .line 9
    new-instance p3, Lsq/a;

    invoke-direct {p3}, Lsq/a;-><init>()V

    .line 10
    new-instance p3, Ldb/k;

    const/4 p4, 0x5

    invoke-direct {p3, p0, p4}, Ldb/k;-><init>(Ljava/lang/Object;I)V

    iput-object p3, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->c:Landroid/view/View$OnLayoutChangeListener;

    .line 11
    new-instance p3, Ld0/f0;

    const/4 p4, 0x3

    invoke-direct {p3, p4}, Ld0/f0;-><init>(I)V

    .line 12
    iput-object p3, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->a:Ld0/f0;

    .line 13
    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->requestLayout()V

    if-eqz p2, :cond_0

    .line 14
    sget-object p3, Ljq/a;->g:[I

    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x0

    .line 15
    invoke-virtual {p1, p2, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 16
    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->requestLayout()V

    .line 17
    invoke-virtual {p1, p2, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/google/android/material/carousel/CarouselLayoutManager;->setOrientation(I)V

    .line 18
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final canScrollHorizontally()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->d()Z

    move-result v0

    return v0
.end method

.method public final canScrollVertically()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->d()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final computeHorizontalScrollExtent(Landroidx/recyclerview/widget/k2;)I
    .locals 0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getChildCount()I

    const/4 p1, 0x0

    return p1
.end method

.method public final computeHorizontalScrollOffset(Landroidx/recyclerview/widget/k2;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final computeHorizontalScrollRange(Landroidx/recyclerview/widget/k2;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final computeScrollVectorForPosition(I)Landroid/graphics/PointF;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final computeVerticalScrollExtent(Landroidx/recyclerview/widget/k2;)I
    .locals 0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getChildCount()I

    const/4 p1, 0x0

    return p1
.end method

.method public final computeVerticalScrollOffset(Landroidx/recyclerview/widget/k2;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final computeVerticalScrollRange(Landroidx/recyclerview/widget/k2;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->b:La9/a;

    iget v0, v0, La9/a;->x:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final e()Z
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final generateDefaultLayoutParams()Landroidx/recyclerview/widget/v1;
    .locals 2

    new-instance v0, Landroidx/recyclerview/widget/v1;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroidx/recyclerview/widget/v1;-><init>(II)V

    return-object v0
.end method

.method public final getDecoratedBoundsWithMargins(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/u1;->getDecoratedBoundsWithMargins(Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-virtual {p2}, Landroid/graphics/Rect;->centerY()I

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->d()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Landroid/graphics/Rect;->centerX()I

    :cond_0
    const/4 p1, 0x0

    throw p1
.end method

.method public final isAutoMeasureEnabled()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final measureChildWithMargins(Landroid/view/View;II)V
    .locals 0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final onAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 5

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/u1;->onAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->a:Ld0/f0;

    iget v2, v1, Ld0/f0;->w:F

    const/4 v3, 0x0

    cmpl-float v4, v2, v3

    if-lez v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f070151

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    :goto_0
    iput v2, v1, Ld0/f0;->w:F

    iget v2, v1, Ld0/f0;->x:F

    cmpl-float v3, v2, v3

    if-lez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f070150

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    :goto_1
    iput v2, v1, Ld0/f0;->x:F

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->requestLayout()V

    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->c:Landroid/view/View$OnLayoutChangeListener;

    invoke-virtual {p1, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    return-void
.end method

.method public final onDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/c2;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/u1;->onDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView;)V

    iget-object p2, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->c:Landroid/view/View$OnLayoutChangeListener;

    invoke-virtual {p1, p2}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    return-void
.end method

.method public final onFocusSearchFailed(Landroid/view/View;ILandroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;)Landroid/view/View;
    .locals 3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getChildCount()I

    move-result p3

    if-nez p3, :cond_0

    goto/16 :goto_4

    :cond_0
    iget-object p3, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->b:La9/a;

    iget p3, p3, La9/a;->x:I

    const/high16 p4, -0x80000000

    const/4 v0, -0x1

    const/4 v1, 0x1

    if-eq p2, v1, :cond_5

    const/4 v2, 0x2

    if-eq p2, v2, :cond_3

    const/16 v2, 0x11

    if-eq p2, v2, :cond_7

    const/16 v2, 0x21

    if-eq p2, v2, :cond_6

    const/16 v2, 0x42

    if-eq p2, v2, :cond_4

    const/16 v2, 0x82

    if-eq p2, v2, :cond_2

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v2, "Unknown focus request:"

    invoke-direct {p3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "CarouselLayoutManager"

    invoke-static {p3, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    move p2, p4

    goto :goto_2

    :cond_2
    if-ne p3, v1, :cond_1

    :cond_3
    :goto_0
    move p2, v1

    goto :goto_2

    :cond_4
    if-nez p3, :cond_1

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->e()Z

    move-result p2

    if-eqz p2, :cond_3

    :cond_5
    :goto_1
    move p2, v0

    goto :goto_2

    :cond_6
    if-ne p3, v1, :cond_1

    goto :goto_1

    :cond_7
    if-nez p3, :cond_1

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->e()Z

    move-result p2

    if-eqz p2, :cond_5

    goto :goto_0

    :goto_2
    if-ne p2, p4, :cond_8

    goto :goto_4

    :cond_8
    const/4 p3, 0x0

    if-ne p2, v0, :cond_d

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/u1;->getPosition(Landroid/view/View;)I

    move-result p1

    if-nez p1, :cond_9

    goto :goto_4

    :cond_9
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/u1;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/u1;->getPosition(Landroid/view/View;)I

    move-result p1

    sub-int/2addr p1, v1

    if-ltz p1, :cond_b

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getItemCount()I

    move-result p2

    if-lt p1, p2, :cond_a

    goto :goto_3

    :cond_a
    iget-object p1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->b:La9/a;

    invoke-virtual {p1}, La9/a;->l()I

    const/4 p1, 0x0

    throw p1

    :cond_b
    :goto_3
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->e()Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getChildCount()I

    move-result p1

    add-int/lit8 p3, p1, -0x1

    :cond_c
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/u1;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_d
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/u1;->getPosition(Landroid/view/View;)I

    move-result p1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getItemCount()I

    move-result p2

    sub-int/2addr p2, v1

    if-ne p1, p2, :cond_e

    :goto_4
    const/4 p1, 0x0

    return-object p1

    :cond_e
    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getChildCount()I

    move-result p1

    sub-int/2addr p1, v1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/u1;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/u1;->getPosition(Landroid/view/View;)I

    move-result p1

    add-int/2addr p1, v1

    if-ltz p1, :cond_10

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getItemCount()I

    move-result p2

    if-lt p1, p2, :cond_f

    goto :goto_5

    :cond_f
    iget-object p1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->b:La9/a;

    invoke-virtual {p1}, La9/a;->l()I

    const/4 p1, 0x0

    throw p1

    :cond_10
    :goto_5
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->e()Z

    move-result p1

    if-eqz p1, :cond_11

    goto :goto_6

    :cond_11
    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getChildCount()I

    move-result p1

    add-int/lit8 p3, p1, -0x1

    :goto_6
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/u1;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/u1;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getChildCount()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/u1;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/u1;->getPosition(Landroid/view/View;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/u1;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/u1;->getPosition(Landroid/view/View;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    :cond_0
    return-void
.end method

.method public final onItemsAdded(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/u1;->onItemsAdded(Landroidx/recyclerview/widget/RecyclerView;II)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getItemCount()I

    return-void
.end method

.method public final onItemsRemoved(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/u1;->onItemsRemoved(Landroidx/recyclerview/widget/RecyclerView;II)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getItemCount()I

    return-void
.end method

.method public final onLayoutChildren(Landroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;)V
    .locals 2

    invoke-virtual {p2}, Landroidx/recyclerview/widget/k2;->b()I

    move-result p2

    if-lez p2, :cond_2

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->d()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getWidth()I

    move-result p2

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getHeight()I

    move-result p2

    :goto_0
    int-to-float p2, p2

    const/4 v0, 0x0

    cmpg-float p2, p2, v0

    if-gtz p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->e()Z

    const-wide v0, 0x7fffffffffffffffL

    const/4 p2, 0x0

    invoke-virtual {p1, p2, v0, v1}, Landroidx/recyclerview/widget/c2;->l(IJ)Landroidx/recyclerview/widget/o2;

    move-result-object p1

    iget-object p1, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {p0, p1, p2, p2}, Lcom/google/android/material/carousel/CarouselLayoutManager;->measureChildWithMargins(Landroid/view/View;II)V

    const/4 p1, 0x0

    throw p1

    :cond_2
    :goto_1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/u1;->removeAndRecycleAllViews(Landroidx/recyclerview/widget/c2;)V

    return-void
.end method

.method public final onLayoutCompleted(Landroidx/recyclerview/widget/k2;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getChildCount()I

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/u1;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/u1;->getPosition(Landroid/view/View;)I

    return-void
.end method

.method public final requestChildRectangleOnScreen(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final scrollHorizontallyBy(ILandroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;)I
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->d()Z

    move-result p3

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getChildCount()I

    move-result p3

    if-eqz p3, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-wide v1, 0x7fffffffffffffffL

    invoke-virtual {p2, v0, v1, v2}, Landroidx/recyclerview/widget/c2;->l(IJ)Landroidx/recyclerview/widget/o2;

    move-result-object p1

    iget-object p1, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {p0, p1, v0, v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->measureChildWithMargins(Landroid/view/View;II)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    return v0
.end method

.method public final scrollToPosition(I)V
    .locals 0

    return-void
.end method

.method public final scrollVerticallyBy(ILandroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;)I
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->canScrollVertically()Z

    move-result p3

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getChildCount()I

    move-result p3

    if-eqz p3, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-wide v1, 0x7fffffffffffffffL

    invoke-virtual {p2, v0, v1, v2}, Landroidx/recyclerview/widget/c2;->l(IJ)Landroidx/recyclerview/widget/o2;

    move-result-object p1

    iget-object p1, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {p0, p1, v0, v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->measureChildWithMargins(Landroid/view/View;II)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    return v0
.end method

.method public final setOrientation(I)V
    .locals 2

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid orientation:"

    invoke-static {p1, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/u1;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->b:La9/a;

    if-eqz v1, :cond_3

    iget v1, v1, La9/a;->x:I

    if-eq p1, v1, :cond_2

    goto :goto_1

    :cond_2
    return-void

    :cond_3
    :goto_1
    if-eqz p1, :cond_5

    if-ne p1, v0, :cond_4

    new-instance p1, Lsq/b;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lsq/b;-><init>(Lcom/google/android/material/carousel/CarouselLayoutManager;I)V

    goto :goto_2

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "invalid orientation"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Lsq/b;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lsq/b;-><init>(Lcom/google/android/material/carousel/CarouselLayoutManager;I)V

    :goto_2
    iput-object p1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->b:La9/a;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->requestLayout()V

    return-void
.end method

.method public final smoothScrollToPosition(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/k2;I)V
    .locals 0

    new-instance p2, Lcom/google/android/material/datepicker/w;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p0, p1}, Lcom/google/android/material/datepicker/w;-><init>(Lcom/google/android/material/carousel/CarouselLayoutManager;Landroid/content/Context;)V

    iput p3, p2, Landroidx/recyclerview/widget/j2;->a:I

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/u1;->startSmoothScroll(Landroidx/recyclerview/widget/j2;)V

    return-void
.end method
