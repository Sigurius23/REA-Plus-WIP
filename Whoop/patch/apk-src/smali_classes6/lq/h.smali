.class public abstract Llq/h;
.super Llq/i;
.source "SourceFile"


# instance fields
.field public final c:Landroid/graphics/Rect;

.field public final d:Landroid/graphics/Rect;

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Llq/i;-><init>()V

    .line 2
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Llq/h;->c:Landroid/graphics/Rect;

    .line 3
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Llq/h;->d:Landroid/graphics/Rect;

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Llq/h;->e:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 p1, 0x0

    .line 5
    invoke-direct {p0, p1}, Llq/i;-><init>(I)V

    .line 6
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Llq/h;->c:Landroid/graphics/Rect;

    .line 7
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Llq/h;->d:Landroid/graphics/Rect;

    .line 8
    iput p1, p0, Llq/h;->e:I

    return-void
.end method


# virtual methods
.method public final J(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)V
    .locals 13

    invoke-virtual/range {p1 .. p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->k(Landroid/view/View;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior;->L(Ljava/util/ArrayList;)Lcom/google/android/material/appbar/AppBarLayout;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Lq4/e;

    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    iget v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v2, v3

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v3

    iget v4, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v3, v4

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v4

    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    move-result v5

    sub-int/2addr v4, v5

    iget v5, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr v4, v5

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v5

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v6

    add-int/2addr v6, v5

    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    move-result v5

    sub-int/2addr v6, v5

    iget v5, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr v6, v5

    iget-object v10, p0, Llq/h;->c:Landroid/graphics/Rect;

    invoke-virtual {v10, v2, v3, v4, v6}, Landroid/graphics/Rect;->set(IIII)V

    invoke-virtual {p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->getLastWindowInsets()Lh5/q1;

    move-result-object v2

    if-eqz v2, :cond_0

    sget-object v3, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {p1}, Landroid/view/View;->getFitsSystemWindows()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getFitsSystemWindows()Z

    move-result p1

    if-nez p1, :cond_0

    iget p1, v10, Landroid/graphics/Rect;->left:I

    invoke-virtual {v2}, Lh5/q1;->b()I

    move-result v3

    add-int/2addr v3, p1

    iput v3, v10, Landroid/graphics/Rect;->left:I

    iget p1, v10, Landroid/graphics/Rect;->right:I

    invoke-virtual {v2}, Lh5/q1;->c()I

    move-result v2

    sub-int/2addr p1, v2

    iput p1, v10, Landroid/graphics/Rect;->right:I

    :cond_0
    iget p1, v1, Lq4/e;->c:I

    if-nez p1, :cond_1

    const p1, 0x800033

    :cond_1
    move v7, p1

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    iget-object v11, p0, Llq/h;->d:Landroid/graphics/Rect;

    move/from16 v12, p3

    invoke-static/range {v7 .. v12}, Landroid/view/Gravity;->apply(IIILandroid/graphics/Rect;Landroid/graphics/Rect;I)V

    invoke-virtual {p0, v0}, Llq/h;->K(Landroid/view/View;)I

    move-result p1

    iget v1, v11, Landroid/graphics/Rect;->left:I

    iget v2, v11, Landroid/graphics/Rect;->top:I

    sub-int/2addr v2, p1

    iget v3, v11, Landroid/graphics/Rect;->right:I

    iget v4, v11, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v4, p1

    invoke-virtual {p2, v1, v2, v3, v4}, Landroid/view/View;->layout(IIII)V

    iget p1, v11, Landroid/graphics/Rect;->top:I

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result p2

    sub-int/2addr p1, p2

    iput p1, p0, Llq/h;->e:I

    return-void

    :cond_2
    invoke-virtual/range {p1 .. p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->q(Landroid/view/View;I)V

    const/4 p1, 0x0

    iput p1, p0, Llq/h;->e:I

    return-void
.end method

.method public final K(Landroid/view/View;)I
    .locals 5

    iget v0, p0, Llq/h;->f:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    instance-of v0, p1, Lcom/google/android/material/appbar/AppBarLayout;

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    check-cast p1, Lcom/google/android/material/appbar/AppBarLayout;

    invoke-virtual {p1}, Lcom/google/android/material/appbar/AppBarLayout;->getTotalScrollRange()I

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/material/appbar/AppBarLayout;->getDownNestedPreScrollRange()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Lq4/e;

    iget-object p1, p1, Lq4/e;->a:Lq4/b;

    instance-of v4, p1, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;

    if-eqz v4, :cond_1

    check-cast p1, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;

    invoke-virtual {p1}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->K()I

    move-result p1

    goto :goto_0

    :cond_1
    move p1, v1

    :goto_0
    if-eqz v3, :cond_2

    add-int v4, v0, p1

    if-gt v4, v3, :cond_2

    goto :goto_1

    :cond_2
    sub-int/2addr v0, v3

    if-eqz v0, :cond_3

    int-to-float p1, p1

    int-to-float v0, v0

    div-float/2addr p1, v0

    const/high16 v0, 0x3f800000    # 1.0f

    add-float v2, p1, v0

    :cond_3
    :goto_1
    iget p1, p0, Llq/h;->f:I

    int-to-float v0, p1

    mul-float/2addr v2, v0

    float-to-int v0, v2

    invoke-static {v0, v1, p1}, Lrj/j;->r(III)I

    move-result p1

    return p1
.end method

.method public final q(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;IIII)Z
    .locals 7

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    const/4 v3, -0x2

    if-ne v0, v3, :cond_5

    :cond_0
    invoke-virtual/range {p1 .. p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->k(Landroid/view/View;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior;->L(Ljava/util/ArrayList;)Lcom/google/android/material/appbar/AppBarLayout;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-static {p5}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    if-lez v4, :cond_1

    sget-object v5, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v3}, Landroid/view/View;->getFitsSystemWindows()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->getLastWindowInsets()Lh5/q1;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lh5/q1;->d()I

    move-result v6

    invoke-virtual {v5}, Lh5/q1;->a()I

    move-result v5

    add-int/2addr v5, v6

    add-int/2addr v4, v5

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    :cond_2
    :goto_0
    invoke-virtual {v3}, Lcom/google/android/material/appbar/AppBarLayout;->getTotalScrollRange()I

    move-result v5

    add-int/2addr v5, v4

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    instance-of v4, p0, Lcom/google/android/material/search/SearchBar$ScrollingViewBehavior;

    if-eqz v4, :cond_3

    neg-int v3, v3

    int-to-float v3, v3

    invoke-virtual {p2, v3}, Landroid/view/View;->setTranslationY(F)V

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    invoke-virtual {p2, v4}, Landroid/view/View;->setTranslationY(F)V

    sub-int/2addr v5, v3

    :goto_1
    if-ne v0, v2, :cond_4

    const/high16 v0, 0x40000000    # 2.0f

    goto :goto_2

    :cond_4
    const/high16 v0, -0x80000000

    :goto_2
    invoke-static {v5, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    move-object v0, p1

    move-object v1, p2

    move v2, p3

    move v3, p4

    move v5, p6

    invoke-virtual/range {v0 .. v5}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->r(Landroid/view/View;IIII)V

    const/4 v0, 0x1

    return v0

    :cond_5
    const/4 v0, 0x0

    return v0
.end method
