.class public Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;
.super Lq4/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BaseBehavior"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;",
        ">",
        "Lq4/b;"
    }
.end annotation


# instance fields
.field public a:Landroid/graphics/Rect;

.field public final b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;->b:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    sget-object v0, Ljq/a;->p:[I

    .line 5
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x0

    const/4 v0, 0x1

    .line 6
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;->b:Z

    .line 7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public final I(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;Lcom/google/android/material/floatingactionbutton/FloatingActionButton;)Z
    .locals 2

    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lq4/e;

    iget-boolean v1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;->b:Z

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget v0, v0, Lq4/e;->f:I

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p3}, Lcr/q;->getUserSetVisibility()I

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_2
    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;->a:Landroid/graphics/Rect;

    if-nez v0, :cond_3

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;->a:Landroid/graphics/Rect;

    :cond_3
    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;->a:Landroid/graphics/Rect;

    invoke-static {p1, p2, v0}, Lcr/d;->a(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;)V

    iget p1, v0, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->getMinimumHeightForVisibleOverlappingContent()I

    move-result p2

    if-gt p1, p2, :cond_4

    invoke-virtual {p3}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->d()V

    goto :goto_1

    :cond_4
    invoke-virtual {p3}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->f()V

    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final J(Landroid/view/View;Lcom/google/android/material/floatingactionbutton/FloatingActionButton;)Z
    .locals 2

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lq4/e;

    iget-boolean v1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;->b:Z

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget v0, v0, Lq4/e;->f:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Lcr/q;->getUserSetVisibility()I

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_2
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lq4/e;

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v1, v0

    if-ge p1, v1, :cond_3

    invoke-virtual {p2}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->d()V

    goto :goto_1

    :cond_3
    invoke-virtual {p2}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->f()V

    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final f(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/graphics/Rect;)Z
    .locals 4

    check-cast p2, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    iget-object p1, p2, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->L:Landroid/graphics/Rect;

    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v0

    iget v1, p1, Landroid/graphics/Rect;->left:I

    add-int/2addr v0, v1

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v1

    iget v2, p1, Landroid/graphics/Rect;->top:I

    add-int/2addr v1, v2

    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    move-result v2

    iget v3, p1, Landroid/graphics/Rect;->right:I

    sub-int/2addr v2, v3

    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    move-result p2

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p2, p1

    invoke-virtual {p3, v0, v1, v2, p2}, Landroid/graphics/Rect;->set(IIII)V

    const/4 p1, 0x1

    return p1
.end method

.method public final k(Lq4/e;)V
    .locals 1

    iget v0, p1, Lq4/e;->h:I

    if-nez v0, :cond_0

    const/16 v0, 0x50

    iput v0, p1, Lq4/e;->h:I

    :cond_0
    return-void
.end method

.method public final l(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z
    .locals 2

    check-cast p2, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    instance-of v0, p3, Lcom/google/android/material/appbar/AppBarLayout;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p3, Lcom/google/android/material/appbar/AppBarLayout;

    invoke-virtual {p0, p1, p3, p2}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;->I(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;Lcom/google/android/material/floatingactionbutton/FloatingActionButton;)Z

    goto :goto_1

    :cond_0
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    instance-of v0, p1, Lq4/e;

    if-eqz v0, :cond_1

    check-cast p1, Lq4/e;

    iget-object p1, p1, Lq4/e;->a:Lq4/b;

    instance-of p1, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    goto :goto_0

    :cond_1
    move p1, v1

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p0, p3, p2}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;->J(Landroid/view/View;Lcom/google/android/material/floatingactionbutton/FloatingActionButton;)Z

    :cond_2
    :goto_1
    return v1
.end method

.method public final p(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z
    .locals 7

    check-cast p2, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->k(Landroid/view/View;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    instance-of v5, v4, Lcom/google/android/material/appbar/AppBarLayout;

    if-eqz v5, :cond_0

    check-cast v4, Lcom/google/android/material/appbar/AppBarLayout;

    invoke-virtual {p0, p1, v4, p2}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;->I(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;Lcom/google/android/material/floatingactionbutton/FloatingActionButton;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_0
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    instance-of v6, v5, Lq4/e;

    if-eqz v6, :cond_1

    check-cast v5, Lq4/e;

    iget-object v5, v5, Lq4/e;->a:Lq4/b;

    instance-of v5, v5, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    goto :goto_1

    :cond_1
    move v5, v2

    :goto_1
    if-eqz v5, :cond_2

    invoke-virtual {p0, v4, p2}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;->J(Landroid/view/View;Lcom/google/android/material/floatingactionbutton/FloatingActionButton;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    invoke-virtual {p1, p2, p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->q(Landroid/view/View;I)V

    iget-object p3, p2, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->L:Landroid/graphics/Rect;

    const/4 v0, 0x1

    if-eqz p3, :cond_9

    invoke-virtual {p3}, Landroid/graphics/Rect;->centerX()I

    move-result v1

    if-lez v1, :cond_9

    invoke-virtual {p3}, Landroid/graphics/Rect;->centerY()I

    move-result v1

    if-lez v1, :cond_9

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Lq4/e;

    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v4

    iget v5, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr v4, v5

    if-lt v3, v4, :cond_4

    iget v3, p3, Landroid/graphics/Rect;->right:I

    goto :goto_3

    :cond_4
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v3

    iget v4, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    if-gt v3, v4, :cond_5

    iget v3, p3, Landroid/graphics/Rect;->left:I

    neg-int v3, v3

    goto :goto_3

    :cond_5
    move v3, v2

    :goto_3
    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    move-result v4

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    iget v5, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr p1, v5

    if-lt v4, p1, :cond_6

    iget v2, p3, Landroid/graphics/Rect;->bottom:I

    goto :goto_4

    :cond_6
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result p1

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-gt p1, v1, :cond_7

    iget p1, p3, Landroid/graphics/Rect;->top:I

    neg-int v2, p1

    :cond_7
    :goto_4
    if-eqz v2, :cond_8

    sget-object p1, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {p2, v2}, Landroid/view/View;->offsetTopAndBottom(I)V

    :cond_8
    if-eqz v3, :cond_9

    sget-object p1, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {p2, v3}, Landroid/view/View;->offsetLeftAndRight(I)V

    :cond_9
    return v0
.end method
