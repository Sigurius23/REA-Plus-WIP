.class public Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;
.super Llq/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/appbar/AppBarLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BaseBehavior"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/google/android/material/appbar/AppBarLayout;",
        ">",
        "Llq/g;"
    }
.end annotation


# instance fields
.field public j:I

.field public k:I

.field public l:Landroid/animation/ValueAnimator;

.field public m:Lcom/google/android/material/appbar/d;

.field public n:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Llq/i;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Llq/g;->f:I

    .line 3
    iput v0, p0, Llq/g;->h:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Llq/i;-><init>(I)V

    const/4 p1, -0x1

    .line 5
    iput p1, p0, Llq/g;->f:I

    .line 6
    iput p1, p0, Llq/g;->h:I

    return-void
.end method

.method public static N(Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;Landroidx/coordinatorlayout/widget/CoordinatorLayout;)Landroid/view/View;
    .locals 3

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p0, :cond_1

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Lq4/e;

    iget-object v2, v2, Lq4/e;->a:Lq4/b;

    instance-of v2, v2, Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior;

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static P(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)Landroid/view/View;
    .locals 4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    instance-of v3, v2, Lh5/p;

    if-nez v3, :cond_1

    instance-of v3, v2, Landroid/widget/AbsListView;

    if-nez v3, :cond_1

    instance-of v3, v2, Landroid/widget/ScrollView;

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-object v2

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static T(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;IIZ)V
    .locals 6

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result v0

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v5

    if-lt v0, v5, :cond_0

    invoke-virtual {v4}, Landroid/view/View;->getBottom()I

    move-result v5

    if-gt v0, v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_3

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Llq/b;

    iget v0, v0, Llq/b;->a:I

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_3

    sget-object v1, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v4}, Landroid/view/View;->getMinimumHeight()I

    move-result v1

    const/4 v3, 0x1

    if-lez p3, :cond_2

    and-int/lit8 p3, v0, 0xc

    if-eqz p3, :cond_2

    neg-int p2, p2

    invoke-virtual {v4}, Landroid/view/View;->getBottom()I

    move-result p3

    sub-int/2addr p3, v1

    invoke-virtual {p1}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I

    move-result v0

    sub-int/2addr p3, v0

    if-lt p2, p3, :cond_3

    goto :goto_2

    :cond_2
    and-int/lit8 p3, v0, 0x2

    if-eqz p3, :cond_3

    neg-int p2, p2

    invoke-virtual {v4}, Landroid/view/View;->getBottom()I

    move-result p3

    sub-int/2addr p3, v1

    invoke-virtual {p1}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I

    move-result v0

    sub-int/2addr p3, v0

    if-lt p2, p3, :cond_3

    goto :goto_2

    :cond_3
    move v3, v2

    :goto_2
    iget-boolean p2, p1, Lcom/google/android/material/appbar/AppBarLayout;->L:Z

    if-eqz p2, :cond_4

    invoke-static {p0}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->P(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/material/appbar/AppBarLayout;->g(Landroid/view/View;)Z

    move-result v3

    :cond_4
    invoke-virtual {p1, v3}, Lcom/google/android/material/appbar/AppBarLayout;->f(Z)Z

    move-result p2

    if-nez p4, :cond_7

    if-eqz p2, :cond_a

    iget-object p2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->x:Lq/f;

    iget-object p2, p2, Lq/f;->E:Ljava/lang/Object;

    check-cast p2, La0/f1;

    invoke-virtual {p2, p1}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    iget-object p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->z:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    if-eqz p2, :cond_5

    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_5
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p2

    :goto_3
    if-ge v2, p2, :cond_a

    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    check-cast p3, Lq4/e;

    iget-object p3, p3, Lq4/e;->a:Lq4/b;

    instance-of p4, p3, Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior;

    if-eqz p4, :cond_6

    check-cast p3, Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior;

    iget p0, p3, Llq/h;->f:I

    if-eqz p0, :cond_a

    goto :goto_4

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_7
    :goto_4
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    if-eqz p0, :cond_8

    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    :cond_8
    invoke-virtual {p1}, Landroid/view/View;->getForeground()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    if-eqz p0, :cond_9

    invoke-virtual {p1}, Landroid/view/View;->getForeground()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    :cond_9
    invoke-virtual {p1}, Landroid/view/View;->getStateListAnimator()Landroid/animation/StateListAnimator;

    move-result-object p0

    if-eqz p0, :cond_a

    invoke-virtual {p1}, Landroid/view/View;->getStateListAnimator()Landroid/animation/StateListAnimator;

    move-result-object p0

    invoke-virtual {p0}, Landroid/animation/StateListAnimator;->jumpToCurrentState()V

    :cond_a
    return-void
.end method


# virtual methods
.method public final B(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/os/Parcelable;)V
    .locals 1

    check-cast p2, Lcom/google/android/material/appbar/AppBarLayout;

    instance-of v0, p3, Lcom/google/android/material/appbar/d;

    if-eqz v0, :cond_0

    check-cast p3, Lcom/google/android/material/appbar/d;

    iput-object p3, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->m:Lcom/google/android/material/appbar/d;

    invoke-virtual {p3}, Lv5/b;->b()Landroid/os/Parcelable;

    move-result-object p3

    invoke-super {p0, p1, p2, p3}, Lq4/b;->B(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/os/Parcelable;)V

    return-void

    :cond_0
    invoke-super {p0, p1, p2, p3}, Lq4/b;->B(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/os/Parcelable;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->m:Lcom/google/android/material/appbar/d;

    return-void
.end method

.method public final C(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)Landroid/os/Parcelable;
    .locals 0

    check-cast p2, Lcom/google/android/material/appbar/AppBarLayout;

    invoke-super {p0, p1, p2}, Lq4/b;->C(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)Landroid/os/Parcelable;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->R(Landroid/os/Parcelable;Lcom/google/android/material/appbar/AppBarLayout;)Lcom/google/android/material/appbar/d;

    move-result-object p2

    if-nez p2, :cond_0

    return-object p1

    :cond_0
    return-object p2
.end method

.method public final E(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)Z
    .locals 0

    check-cast p2, Lcom/google/android/material/appbar/AppBarLayout;

    and-int/lit8 p4, p5, 0x2

    if-eqz p4, :cond_1

    iget-boolean p4, p2, Lcom/google/android/material/appbar/AppBarLayout;->L:Z

    if-nez p4, :cond_0

    invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->getTotalScrollRange()I

    move-result p4

    if-eqz p4, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    invoke-virtual {p3}, Landroid/view/View;->getHeight()I

    move-result p3

    sub-int/2addr p1, p3

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result p2

    if-gt p1, p2, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    iget-object p2, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->l:Landroid/animation/ValueAnimator;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_2
    const/4 p2, 0x0

    iput-object p2, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->n:Ljava/lang/ref/WeakReference;

    iput p6, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->k:I

    return p1
.end method

.method public final G(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;I)V
    .locals 1

    check-cast p2, Lcom/google/android/material/appbar/AppBarLayout;

    iget v0, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->k:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    if-ne p4, v0, :cond_1

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->S(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;)V

    iget-boolean p1, p2, Lcom/google/android/material/appbar/AppBarLayout;->L:Z

    if-eqz p1, :cond_1

    invoke-virtual {p2, p3}, Lcom/google/android/material/appbar/AppBarLayout;->g(Landroid/view/View;)Z

    move-result p1

    invoke-virtual {p2, p1}, Lcom/google/android/material/appbar/AppBarLayout;->f(Z)Z

    :cond_1
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->n:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public final K()I
    .locals 2

    invoke-virtual {p0}, Llq/i;->I()I

    move-result v0

    iget v1, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->j:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final L(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;III)I
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p4

    move-object/from16 v3, p2

    check-cast v3, Lcom/google/android/material/appbar/AppBarLayout;

    invoke-virtual {v0}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->K()I

    move-result v4

    const/4 v5, 0x0

    if-eqz v2, :cond_c

    if-lt v4, v2, :cond_c

    move/from16 v6, p5

    if-gt v4, v6, :cond_c

    invoke-static/range {p3 .. p5}, Lrj/j;->r(III)I

    move-result v2

    if-eq v4, v2, :cond_d

    iget-boolean v6, v3, Lcom/google/android/material/appbar/AppBarLayout;->E:Z

    if-eqz v6, :cond_4

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v6

    invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v7

    move v8, v5

    :goto_0
    if-ge v8, v7, :cond_4

    invoke-virtual {v3, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v9

    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v10

    check-cast v10, Llq/b;

    iget-object v11, v10, Llq/b;->c:Landroid/view/animation/Interpolator;

    invoke-virtual {v9}, Landroid/view/View;->getTop()I

    move-result v12

    if-lt v6, v12, :cond_3

    invoke-virtual {v9}, Landroid/view/View;->getBottom()I

    move-result v12

    if-gt v6, v12, :cond_3

    if-eqz v11, :cond_4

    iget v7, v10, Llq/b;->a:I

    and-int/lit8 v8, v7, 0x1

    if-eqz v8, :cond_0

    invoke-virtual {v9}, Landroid/view/View;->getHeight()I

    move-result v8

    iget v12, v10, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v8, v12

    iget v10, v10, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v8, v10

    and-int/lit8 v7, v7, 0x2

    if-eqz v7, :cond_1

    sget-object v7, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v9}, Landroid/view/View;->getMinimumHeight()I

    move-result v7

    sub-int/2addr v8, v7

    goto :goto_1

    :cond_0
    move v8, v5

    :cond_1
    :goto_1
    sget-object v7, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v9}, Landroid/view/View;->getFitsSystemWindows()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {v3}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I

    move-result v7

    sub-int/2addr v8, v7

    :cond_2
    if-lez v8, :cond_4

    invoke-virtual {v9}, Landroid/view/View;->getTop()I

    move-result v7

    sub-int/2addr v6, v7

    int-to-float v7, v8

    int-to-float v6, v6

    div-float/2addr v6, v7

    invoke-interface {v11, v6}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result v6

    mul-float/2addr v6, v7

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    invoke-static {v2}, Ljava/lang/Integer;->signum(I)I

    move-result v7

    invoke-virtual {v9}, Landroid/view/View;->getTop()I

    move-result v8

    add-int/2addr v8, v6

    mul-int/2addr v8, v7

    goto :goto_2

    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_4
    move v8, v2

    :goto_2
    iget-object v6, v0, Llq/i;->a:Llq/j;

    if-eqz v6, :cond_5

    invoke-virtual {v6, v8}, Llq/j;->b(I)Z

    move-result v6

    goto :goto_3

    :cond_5
    iput v8, v0, Llq/i;->b:I

    move v6, v5

    :goto_3
    sub-int v7, v4, v2

    sub-int v8, v2, v8

    iput v8, v0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->j:I

    const/4 v8, 0x1

    if-eqz v6, :cond_9

    move v9, v5

    :goto_4
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v10

    if-ge v9, v10, :cond_9

    invoke-virtual {v3, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v10

    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v10

    check-cast v10, Llq/b;

    iget-object v11, v10, Llq/b;->b:Lio/sentry/internal/debugmeta/c;

    if-eqz v11, :cond_8

    iget v10, v10, Llq/b;->a:I

    and-int/2addr v10, v8

    if-eqz v10, :cond_8

    invoke-virtual {v3, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v10

    invoke-virtual {v0}, Llq/i;->I()I

    move-result v12

    int-to-float v12, v12

    iget-object v13, v11, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v13, Landroid/graphics/Rect;

    iget-object v11, v11, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v11, Landroid/graphics/Rect;

    invoke-virtual {v10, v11}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    invoke-virtual {v3, v10, v11}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-virtual {v3}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I

    move-result v14

    neg-int v14, v14

    invoke-virtual {v11, v5, v14}, Landroid/graphics/Rect;->offset(II)V

    iget v14, v11, Landroid/graphics/Rect;->top:I

    int-to-float v14, v14

    invoke-static {v12}, Ljava/lang/Math;->abs(F)F

    move-result v12

    sub-float/2addr v14, v12

    const/4 v12, 0x0

    cmpg-float v15, v14, v12

    if-gtz v15, :cond_7

    invoke-virtual {v11}, Landroid/graphics/Rect;->height()I

    move-result v15

    int-to-float v15, v15

    div-float v15, v14, v15

    invoke-static {v15}, Ljava/lang/Math;->abs(F)F

    move-result v15

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v15, v12, v8}, Lrj/j;->q(FFF)F

    move-result v12

    neg-float v14, v14

    sub-float v12, v8, v12

    mul-float/2addr v12, v12

    sub-float/2addr v8, v12

    invoke-virtual {v11}, Landroid/graphics/Rect;->height()I

    move-result v11

    int-to-float v11, v11

    const v12, 0x3e99999a    # 0.3f

    mul-float/2addr v11, v12

    mul-float/2addr v11, v8

    sub-float/2addr v14, v11

    invoke-virtual {v10, v14}, Landroid/view/View;->setTranslationY(F)V

    invoke-virtual {v10, v13}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    neg-float v8, v14

    float-to-int v8, v8

    invoke-virtual {v13, v5, v8}, Landroid/graphics/Rect;->offset(II)V

    invoke-virtual {v13}, Landroid/graphics/Rect;->height()I

    move-result v8

    int-to-float v8, v8

    cmpl-float v8, v14, v8

    if-ltz v8, :cond_6

    const/4 v8, 0x4

    invoke-virtual {v10, v8}, Landroid/view/View;->setVisibility(I)V

    goto :goto_5

    :cond_6
    invoke-virtual {v10, v5}, Landroid/view/View;->setVisibility(I)V

    :goto_5
    sget-object v8, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v10, v13}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    goto :goto_6

    :cond_7
    sget-object v8, Lh5/p0;->a:Ljava/util/WeakHashMap;

    const/4 v8, 0x0

    invoke-virtual {v10, v8}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    invoke-virtual {v10, v12}, Landroid/view/View;->setTranslationY(F)V

    invoke-virtual {v10, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_8
    :goto_6
    add-int/lit8 v9, v9, 0x1

    const/4 v8, 0x1

    goto/16 :goto_4

    :cond_9
    if-nez v6, :cond_a

    iget-boolean v6, v3, Lcom/google/android/material/appbar/AppBarLayout;->E:Z

    if-eqz v6, :cond_a

    invoke-virtual {v1, v3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->f(Landroid/view/View;)V

    :cond_a
    invoke-virtual {v0}, Llq/i;->I()I

    move-result v6

    invoke-virtual {v3, v6}, Lcom/google/android/material/appbar/AppBarLayout;->d(I)V

    if-ge v2, v4, :cond_b

    const/4 v8, -0x1

    goto :goto_7

    :cond_b
    const/4 v8, 0x1

    :goto_7
    invoke-static {v1, v3, v2, v8, v5}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->T(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;IIZ)V

    move v5, v7

    goto :goto_8

    :cond_c
    iput v5, v0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->j:I

    :cond_d
    :goto_8
    invoke-static {v1}, Lh5/p0;->c(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    move-result-object v2

    if-eqz v2, :cond_e

    return v5

    :cond_e
    new-instance v2, Lcom/google/android/material/appbar/b;

    invoke-direct {v2, v1, v0, v3}, Lcom/google/android/material/appbar/b;-><init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;Lcom/google/android/material/appbar/AppBarLayout;)V

    invoke-static {v1, v2}, Lh5/p0;->n(Landroid/view/View;Lh5/b;)V

    return v5
.end method

.method public final O(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;I)V
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->K()I

    move-result v0

    sub-int/2addr v0, p3

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpl-float v1, v2, v1

    if-lez v1, :cond_0

    int-to-float v0, v0

    div-float/2addr v0, v2

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x3

    goto :goto_0

    :cond_0
    int-to-float v0, v0

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    add-float/2addr v0, v1

    const/high16 v1, 0x43160000    # 150.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->K()I

    move-result v1

    if-ne v1, p3, :cond_2

    iget-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->l:Landroid/animation/ValueAnimator;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->l:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_1
    return-void

    :cond_2
    iget-object v2, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->l:Landroid/animation/ValueAnimator;

    if-nez v2, :cond_3

    new-instance v2, Landroid/animation/ValueAnimator;

    invoke-direct {v2}, Landroid/animation/ValueAnimator;-><init>()V

    iput-object v2, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->l:Landroid/animation/ValueAnimator;

    sget-object v3, Lkq/a;->e:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget-object v2, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->l:Landroid/animation/ValueAnimator;

    new-instance v3, Lcom/google/android/material/appbar/a;

    invoke-direct {v3, p1, p0, p2}, Lcom/google/android/material/appbar/a;-><init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;Lcom/google/android/material/appbar/AppBarLayout;)V

    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    goto :goto_1

    :cond_3
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->cancel()V

    :goto_1
    iget-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->l:Landroid/animation/ValueAnimator;

    const/16 p2, 0x258

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    int-to-long v2, p2

    invoke-virtual {p1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->l:Landroid/animation/ValueAnimator;

    filled-new-array {v1, p3}, [I

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->setIntValues([I)V

    iget-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->l:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method public final Q(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;Landroid/view/View;I[I)V
    .locals 8

    if-eqz p4, :cond_1

    if-gez p4, :cond_0

    invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->getTotalScrollRange()I

    move-result v0

    neg-int v0, v0

    invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->getDownNestedPreScrollRange()I

    move-result v1

    add-int/2addr v1, v0

    :goto_0
    move v6, v0

    move v7, v1

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->getUpNestedPreScrollRange()I

    move-result v0

    neg-int v0, v0

    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    if-eq v6, v7, :cond_1

    invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->K()I

    move-result v0

    sub-int v5, v0, p4

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-virtual/range {v2 .. v7}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->L(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;III)I

    move-result p1

    const/4 p2, 0x1

    aput p1, p5, p2

    goto :goto_2

    :cond_1
    move-object v4, p2

    :goto_2
    iget-boolean p1, v4, Lcom/google/android/material/appbar/AppBarLayout;->L:Z

    if-eqz p1, :cond_2

    invoke-virtual {v4, p3}, Lcom/google/android/material/appbar/AppBarLayout;->g(Landroid/view/View;)Z

    move-result p1

    invoke-virtual {v4, p1}, Lcom/google/android/material/appbar/AppBarLayout;->f(Z)Z

    :cond_2
    return-void
.end method

.method public final R(Landroid/os/Parcelable;Lcom/google/android/material/appbar/AppBarLayout;)Lcom/google/android/material/appbar/d;
    .locals 7

    invoke-virtual {p0}, Llq/i;->I()I

    move-result v0

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_5

    invoke-virtual {p2, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getBottom()I

    move-result v5

    add-int/2addr v5, v0

    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v6

    add-int/2addr v6, v0

    if-gtz v6, :cond_4

    if-ltz v5, :cond_4

    new-instance v1, Lcom/google/android/material/appbar/d;

    if-nez p1, :cond_0

    sget-object p1, Lv5/b;->x:Lv5/b;

    :cond_0
    invoke-direct {v1, p1}, Lv5/b;-><init>(Landroid/os/Parcelable;)V

    const/4 p1, 0x1

    if-nez v0, :cond_1

    move v6, p1

    goto :goto_1

    :cond_1
    move v6, v2

    :goto_1
    iput-boolean v6, v1, Lcom/google/android/material/appbar/d;->z:Z

    if-nez v6, :cond_2

    neg-int v0, v0

    invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->getTotalScrollRange()I

    move-result v6

    if-lt v0, v6, :cond_2

    move v0, p1

    goto :goto_2

    :cond_2
    move v0, v2

    :goto_2
    iput-boolean v0, v1, Lcom/google/android/material/appbar/d;->y:Z

    iput v3, v1, Lcom/google/android/material/appbar/d;->E:I

    sget-object v0, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v4}, Landroid/view/View;->getMinimumHeight()I

    move-result v0

    invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I

    move-result p2

    add-int/2addr p2, v0

    if-ne v5, p2, :cond_3

    move v2, p1

    :cond_3
    iput-boolean v2, v1, Lcom/google/android/material/appbar/d;->G:Z

    int-to-float p1, v5

    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    move-result p2

    int-to-float p2, p2

    div-float/2addr p1, p2

    iput p1, v1, Lcom/google/android/material/appbar/d;->F:F

    return-object v1

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    const/4 p1, 0x0

    return-object p1
.end method

.method public final S(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;)V
    .locals 12

    invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I

    move-result v0

    invoke-virtual {p2}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->K()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    const/16 v5, 0x20

    if-ge v4, v2, :cond_2

    invoke-virtual {p2, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    move-result v7

    invoke-virtual {v6}, Landroid/view/View;->getBottom()I

    move-result v8

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Llq/b;

    iget v9, v6, Llq/b;->a:I

    and-int/2addr v9, v5

    if-ne v9, v5, :cond_0

    iget v9, v6, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    sub-int/2addr v7, v9

    iget v6, v6, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v8, v6

    :cond_0
    neg-int v6, v0

    if-gt v7, v6, :cond_1

    if-lt v8, v6, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, -0x1

    :goto_1
    if-ltz v4, :cond_9

    invoke-virtual {p2, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Llq/b;

    iget v7, v6, Llq/b;->a:I

    and-int/lit8 v8, v7, 0x11

    const/16 v9, 0x11

    if-ne v8, v9, :cond_9

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v8

    neg-int v8, v8

    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v9

    neg-int v9, v9

    if-nez v4, :cond_3

    sget-object v4, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {p2}, Landroid/view/View;->getFitsSystemWindows()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v2}, Landroid/view/View;->getFitsSystemWindows()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I

    move-result v4

    sub-int/2addr v8, v4

    :cond_3
    and-int/lit8 v4, v7, 0x2

    const/4 v10, 0x2

    if-ne v4, v10, :cond_4

    sget-object v4, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v2}, Landroid/view/View;->getMinimumHeight()I

    move-result v2

    add-int/2addr v9, v2

    goto :goto_2

    :cond_4
    and-int/lit8 v4, v7, 0x5

    const/4 v11, 0x5

    if-ne v4, v11, :cond_6

    sget-object v4, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v2}, Landroid/view/View;->getMinimumHeight()I

    move-result v2

    add-int/2addr v2, v9

    if-ge v0, v2, :cond_5

    move v8, v2

    goto :goto_2

    :cond_5
    move v9, v2

    :cond_6
    :goto_2
    and-int/lit8 v2, v7, 0x20

    if-ne v2, v5, :cond_7

    iget v2, v6, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v8, v2

    iget v2, v6, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    sub-int/2addr v9, v2

    :cond_7
    add-int v2, v9, v8

    div-int/2addr v2, v10

    if-ge v0, v2, :cond_8

    move v8, v9

    :cond_8
    add-int/2addr v8, v1

    invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->getTotalScrollRange()I

    move-result v0

    neg-int v0, v0

    invoke-static {v8, v0, v3}, Lrj/j;->r(III)I

    move-result v0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->O(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;I)V

    :cond_9
    return-void
.end method

.method public final p(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z
    .locals 4

    check-cast p2, Lcom/google/android/material/appbar/AppBarLayout;

    invoke-super {p0, p1, p2, p3}, Llq/i;->p(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z

    invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->getPendingAction()I

    move-result p3

    iget-object v0, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->m:Lcom/google/android/material/appbar/d;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    and-int/lit8 v3, p3, 0x8

    if-nez v3, :cond_3

    iget-boolean p3, v0, Lcom/google/android/material/appbar/d;->y:Z

    if-eqz p3, :cond_0

    invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->getTotalScrollRange()I

    move-result p3

    neg-int p3, p3

    invoke-virtual {p0, p1, p2, p3}, Llq/g;->M(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)V

    goto :goto_2

    :cond_0
    iget-boolean p3, v0, Lcom/google/android/material/appbar/d;->z:Z

    if-eqz p3, :cond_1

    invoke-virtual {p0, p1, p2, v1}, Llq/g;->M(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)V

    goto :goto_2

    :cond_1
    iget p3, v0, Lcom/google/android/material/appbar/d;->E:I

    invoke-virtual {p2, p3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p3

    invoke-virtual {p3}, Landroid/view/View;->getBottom()I

    move-result v0

    neg-int v0, v0

    iget-object v3, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->m:Lcom/google/android/material/appbar/d;

    iget-boolean v3, v3, Lcom/google/android/material/appbar/d;->G:Z

    if-eqz v3, :cond_2

    sget-object v3, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {p3}, Landroid/view/View;->getMinimumHeight()I

    move-result p3

    invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I

    move-result v3

    add-int/2addr v3, p3

    add-int/2addr v3, v0

    goto :goto_0

    :cond_2
    invoke-virtual {p3}, Landroid/view/View;->getHeight()I

    move-result p3

    int-to-float p3, p3

    iget-object v3, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->m:Lcom/google/android/material/appbar/d;

    iget v3, v3, Lcom/google/android/material/appbar/d;->F:F

    mul-float/2addr p3, v3

    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p3

    add-int v3, p3, v0

    :goto_0
    invoke-virtual {p0, p1, p2, v3}, Llq/g;->M(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)V

    goto :goto_2

    :cond_3
    if-eqz p3, :cond_8

    and-int/lit8 v0, p3, 0x4

    if-eqz v0, :cond_4

    move v0, v2

    goto :goto_1

    :cond_4
    move v0, v1

    :goto_1
    and-int/lit8 v3, p3, 0x2

    if-eqz v3, :cond_6

    invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->getUpNestedPreScrollRange()I

    move-result p3

    neg-int p3, p3

    if-eqz v0, :cond_5

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->O(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;I)V

    goto :goto_2

    :cond_5
    invoke-virtual {p0, p1, p2, p3}, Llq/g;->M(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)V

    goto :goto_2

    :cond_6
    and-int/2addr p3, v2

    if-eqz p3, :cond_8

    if-eqz v0, :cond_7

    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->O(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;I)V

    goto :goto_2

    :cond_7
    invoke-virtual {p0, p1, p2, v1}, Llq/g;->M(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)V

    :cond_8
    :goto_2
    iput v1, p2, Lcom/google/android/material/appbar/AppBarLayout;->F:I

    const/4 p3, 0x0

    iput-object p3, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->m:Lcom/google/android/material/appbar/d;

    invoke-virtual {p0}, Llq/i;->I()I

    move-result p3

    invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->getTotalScrollRange()I

    move-result v0

    neg-int v0, v0

    invoke-static {p3, v0, v1}, Lrj/j;->r(III)I

    move-result p3

    iget-object v0, p0, Llq/i;->a:Llq/j;

    if-eqz v0, :cond_9

    invoke-virtual {v0, p3}, Llq/j;->b(I)Z

    goto :goto_3

    :cond_9
    iput p3, p0, Llq/i;->b:I

    :goto_3
    invoke-virtual {p0}, Llq/i;->I()I

    move-result p3

    invoke-static {p1, p2, p3, v1, v2}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->T(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;IIZ)V

    invoke-virtual {p0}, Llq/i;->I()I

    move-result p3

    invoke-virtual {p2, p3}, Lcom/google/android/material/appbar/AppBarLayout;->d(I)V

    invoke-static {p1}, Lh5/p0;->c(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    move-result-object p3

    if-eqz p3, :cond_a

    return v2

    :cond_a
    new-instance p3, Lcom/google/android/material/appbar/b;

    invoke-direct {p3, p1, p0, p2}, Lcom/google/android/material/appbar/b;-><init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;Lcom/google/android/material/appbar/AppBarLayout;)V

    invoke-static {p1, p3}, Lh5/p0;->n(Landroid/view/View;Lh5/b;)V

    return v2
.end method

.method public final q(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;IIII)Z
    .locals 7

    check-cast p2, Lcom/google/android/material/appbar/AppBarLayout;

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lq4/e;

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    const/4 v1, -0x2

    if-ne v0, v1, :cond_0

    const/4 p5, 0x0

    invoke-static {p5, p5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p5

    invoke-virtual/range {p1 .. p6}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->r(Landroid/view/View;IIII)V

    const/4 p1, 0x1

    return p1

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-super/range {v0 .. v6}, Lq4/b;->q(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;IIII)Z

    move-result p1

    return p1
.end method

.method public final bridge synthetic u(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[II)V
    .locals 0

    check-cast p2, Lcom/google/android/material/appbar/AppBarLayout;

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    invoke-virtual/range {p1 .. p6}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->Q(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;Landroid/view/View;I[I)V

    return-void
.end method

.method public final x(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;IIIII[I)V
    .locals 0

    move-object p3, p2

    check-cast p3, Lcom/google/android/material/appbar/AppBarLayout;

    if-gez p7, :cond_0

    invoke-virtual {p3}, Lcom/google/android/material/appbar/AppBarLayout;->getDownNestedScrollRange()I

    move-result p2

    neg-int p5, p2

    invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->K()I

    move-result p2

    sub-int p4, p2, p7

    const/4 p6, 0x0

    move-object p2, p1

    move-object p1, p0

    invoke-virtual/range {p1 .. p6}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->L(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;III)I

    move-result p4

    const/4 p5, 0x1

    aput p4, p9, p5

    goto :goto_0

    :cond_0
    move-object p2, p1

    move-object p1, p0

    :goto_0
    if-nez p7, :cond_2

    invoke-static {p2}, Lh5/p0;->c(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    move-result-object p4

    if-eqz p4, :cond_1

    goto :goto_1

    :cond_1
    new-instance p4, Lcom/google/android/material/appbar/b;

    invoke-direct {p4, p2, p0, p3}, Lcom/google/android/material/appbar/b;-><init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;Lcom/google/android/material/appbar/AppBarLayout;)V

    invoke-static {p2, p4}, Lh5/p0;->n(Landroid/view/View;Lh5/b;)V

    :cond_2
    :goto_1
    return-void
.end method
