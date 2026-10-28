.class public Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
.super Lcr/q;
.source "SourceFile"

# interfaces
.implements Lzq/a;
.implements Lkr/v;
.implements Lq4/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;,
        Lcom/google/android/material/floatingactionbutton/FloatingActionButton$Behavior;
    }
.end annotation


# instance fields
.field public E:Landroid/graphics/PorterDuff$Mode;

.field public F:Landroid/content/res/ColorStateList;

.field public G:I

.field public H:I

.field public I:I

.field public J:I

.field public K:Z

.field public final L:Landroid/graphics/Rect;

.field public final M:Landroid/graphics/Rect;

.field public final N:Ls/t;

.field public final O:Ld/s;

.field public P:Lar/m;

.field public x:Landroid/content/res/ColorStateList;

.field public y:Landroid/graphics/PorterDuff$Mode;

.field public z:Landroid/content/res/ColorStateList;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v2, p2

    const v4, 0x7f04025b

    const v7, 0x7f1504fd

    move-object/from16 v1, p1

    invoke-static {v1, v2, v4, v7}, Lqr/a;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, v2, v4}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    iput v1, v0, Lcr/q;->w:I

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->L:Landroid/graphics/Rect;

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->M:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v8, 0x0

    new-array v6, v8, [I

    sget-object v3, Ljq/a;->o:[I

    const v5, 0x7f1504fd

    invoke-static/range {v1 .. v6}, Lcr/m;->g(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    move-result-object v3

    const/4 v5, 0x1

    invoke-static {v3, v1, v5}, Lkotlin/jvm/internal/j;->C(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v6

    iput-object v6, v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->x:Landroid/content/res/ColorStateList;

    const/4 v6, 0x2

    const/4 v9, -0x1

    invoke-virtual {v3, v6, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    const/4 v10, 0x0

    invoke-static {v6, v10}, Lcr/m;->h(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v6

    iput-object v6, v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->y:Landroid/graphics/PorterDuff$Mode;

    const/16 v6, 0xc

    invoke-static {v3, v1, v6}, Lkotlin/jvm/internal/j;->C(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v6

    iput-object v6, v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->F:Landroid/content/res/ColorStateList;

    const/4 v6, 0x7

    invoke-virtual {v3, v6, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->G:I

    const/4 v6, 0x6

    invoke-virtual {v3, v6, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    iput v6, v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->H:I

    const/4 v6, 0x3

    invoke-virtual {v3, v6, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    const/4 v9, 0x4

    const/4 v10, 0x0

    invoke-virtual {v3, v9, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v9

    const/16 v11, 0x9

    invoke-virtual {v3, v11, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v11

    const/16 v12, 0xb

    invoke-virtual {v3, v12, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v10

    const/16 v12, 0x10

    invoke-virtual {v3, v12, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v12

    iput-boolean v12, v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->K:Z

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v12

    const v13, 0x7f070360

    invoke-virtual {v12, v13}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v12

    const/16 v13, 0xa

    invoke-virtual {v3, v13, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v13

    invoke-virtual {v0, v13}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setMaxImageSize(I)V

    const/16 v13, 0xf

    invoke-static {v3, v1, v13}, Lkq/e;->a(Landroid/content/res/TypedArray;Landroid/content/Context;I)Lkq/e;

    move-result-object v13

    const/16 v14, 0x8

    invoke-static {v3, v1, v14}, Lkq/e;->a(Landroid/content/res/TypedArray;Landroid/content/Context;I)Lkq/e;

    move-result-object v14

    sget-object v15, Ljq/a;->A:[I

    invoke-virtual {v1, v2, v15, v4, v7}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v7

    invoke-virtual {v7, v8, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v15

    invoke-virtual {v7, v5, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    invoke-virtual {v7}, Landroid/content/res/TypedArray;->recycle()V

    sget-object v7, Lkr/k;->m:Lkr/h;

    invoke-static {v1, v15, v4, v7}, Lkr/k;->a(Landroid/content/Context;IILkr/c;)Lkr/j;

    move-result-object v1

    invoke-virtual {v1}, Lkr/j;->a()Lkr/k;

    move-result-object v1

    const/4 v4, 0x5

    invoke-virtual {v3, v4, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    invoke-virtual {v3, v8, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    invoke-virtual {v0, v5}, Landroid/view/View;->setEnabled(Z)V

    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    new-instance v3, Ls/t;

    invoke-direct {v3, v0}, Ls/t;-><init>(Landroid/widget/ImageView;)V

    iput-object v3, v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->N:Ls/t;

    const v5, 0x7f04025b

    invoke-virtual {v3, v2, v5}, Ls/t;->b(Landroid/util/AttributeSet;I)V

    new-instance v2, Ld/s;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const/4 v3, 0x0

    iput-boolean v3, v2, Ld/s;->b:Z

    iput v3, v2, Ld/s;->a:I

    iput-object v0, v2, Ld/s;->c:Ljava/lang/Object;

    iput-object v2, v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->O:Ld/s;

    invoke-direct {v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v2

    invoke-virtual {v2, v1}, Lar/k;->n(Lkr/k;)V

    invoke-direct {v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v1

    iget-object v2, v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->x:Landroid/content/res/ColorStateList;

    iget-object v3, v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->y:Landroid/graphics/PorterDuff$Mode;

    iget-object v5, v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->F:Landroid/content/res/ColorStateList;

    invoke-virtual {v1, v2, v3, v5, v6}, Lar/k;->g(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;Landroid/content/res/ColorStateList;I)V

    invoke-direct {v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v1

    iput v12, v1, Lar/k;->k:I

    invoke-direct {v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v1

    iget v2, v1, Lar/k;->h:F

    cmpl-float v2, v2, v9

    if-eqz v2, :cond_0

    iput v9, v1, Lar/k;->h:F

    iget v2, v1, Lar/k;->i:F

    iget v3, v1, Lar/k;->j:F

    invoke-virtual {v1, v9, v2, v3}, Lar/k;->k(FFF)V

    :cond_0
    invoke-direct {v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v1

    iget v2, v1, Lar/k;->i:F

    cmpl-float v2, v2, v11

    if-eqz v2, :cond_1

    iput v11, v1, Lar/k;->i:F

    iget v2, v1, Lar/k;->h:F

    iget v3, v1, Lar/k;->j:F

    invoke-virtual {v1, v2, v11, v3}, Lar/k;->k(FFF)V

    :cond_1
    invoke-direct {v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v1

    iget v2, v1, Lar/k;->j:F

    cmpl-float v2, v2, v10

    if-eqz v2, :cond_2

    iput v10, v1, Lar/k;->j:F

    iget v2, v1, Lar/k;->h:F

    iget v3, v1, Lar/k;->i:F

    invoke-virtual {v1, v2, v3, v10}, Lar/k;->k(FFF)V

    :cond_2
    invoke-direct {v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v1

    iput-object v13, v1, Lar/k;->m:Lkq/e;

    invoke-direct {v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v1

    iput-object v14, v1, Lar/k;->n:Lkq/e;

    invoke-direct {v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v1

    iput-boolean v4, v1, Lar/k;->f:Z

    sget-object v1, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    return-void
.end method

.method public static synthetic b(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private getImpl()Lar/k;
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->P:Lar/m;

    if-nez v0, :cond_0

    new-instance v0, Lar/m;

    new-instance v1, Lro/i;

    const/4 v2, 0x5

    invoke-direct {v1, p0, v2}, Lro/i;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v0, p0, v1}, Lar/k;-><init>(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Lro/i;)V

    iput-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->P:Lar/m;

    :cond_0
    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->P:Lar/m;

    return-object v0
.end method


# virtual methods
.method public final c(I)I
    .locals 3

    iget v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->H:I

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v1, -0x1

    const/4 v2, 0x1

    if-eq p1, v1, :cond_2

    if-eq p1, v2, :cond_1

    const p1, 0x7f0700a1

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    return p1

    :cond_1
    const p1, 0x7f0700a0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    return p1

    :cond_2
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget p1, p1, Landroid/content/res/Configuration;->screenWidthDp:I

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->screenHeightDp:I

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    const/16 v0, 0x1d6

    if-ge p1, v0, :cond_3

    invoke-virtual {p0, v2}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->c(I)I

    move-result p1

    return p1

    :cond_3
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->c(I)I

    move-result p1

    return p1
.end method

.method public final d()V
    .locals 6

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v0

    iget-object v1, v0, Lar/k;->s:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_0

    iget v2, v0, Lar/k;->r:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    goto :goto_0

    :cond_0
    iget v2, v0, Lar/k;->r:I

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    :goto_0
    return-void

    :cond_1
    iget-object v2, v0, Lar/k;->l:Landroid/animation/Animator;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/animation/Animator;->cancel()V

    :cond_2
    iget-object v2, v0, Lar/k;->s:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    sget-object v3, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v2}, Landroid/view/View;->isLaidOut()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v2}, Landroid/view/View;->isInEditMode()Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v1, v0, Lar/k;->n:Lkq/e;

    if-eqz v1, :cond_3

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2, v2}, Lar/k;->b(Lkq/e;FFF)Landroid/animation/AnimatorSet;

    move-result-object v1

    goto :goto_1

    :cond_3
    sget v4, Lar/k;->C:I

    sget v5, Lar/k;->D:I

    const/4 v1, 0x0

    const v2, 0x3ecccccd    # 0.4f

    const v3, 0x3ecccccd    # 0.4f

    invoke-virtual/range {v0 .. v5}, Lar/k;->c(FFFII)Landroid/animation/AnimatorSet;

    move-result-object v1

    :goto_1
    new-instance v2, Landroidx/recyclerview/widget/b0;

    invoke-direct {v2, v0}, Landroidx/recyclerview/widget/b0;-><init>(Lar/k;)V

    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->start()V

    return-void

    :cond_4
    const/4 v0, 0x4

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcr/q;->a(IZ)V

    return-void
.end method

.method public final drawableStateChanged()V
    .locals 2

    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Lar/k;->j([I)V

    return-void
.end method

.method public final e()V
    .locals 4

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->z:Landroid/content/res/ColorStateList;

    if-nez v1, :cond_1

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

    return-void

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v1

    iget-object v2, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->E:Landroid/graphics/PorterDuff$Mode;

    if-nez v2, :cond_2

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    :cond_2
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v1, v2}, Ls/p;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void
.end method

.method public final f()V
    .locals 10

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v0

    iget-object v1, v0, Lar/k;->s:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    iget-object v2, v0, Lar/k;->x:Landroid/graphics/Matrix;

    iget-object v3, v0, Lar/k;->s:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_0

    iget v4, v0, Lar/k;->r:I

    const/4 v6, 0x2

    if-ne v4, v6, :cond_1

    goto :goto_0

    :cond_0
    iget v4, v0, Lar/k;->r:I

    if-eq v4, v5, :cond_1

    :goto_0
    return-void

    :cond_1
    iget-object v4, v0, Lar/k;->l:Landroid/animation/Animator;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Landroid/animation/Animator;->cancel()V

    :cond_2
    iget-object v4, v0, Lar/k;->m:Lkq/e;

    const/4 v6, 0x0

    if-nez v4, :cond_3

    goto :goto_1

    :cond_3
    move v5, v6

    :goto_1
    sget-object v4, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v3}, Landroid/view/View;->isLaidOut()Z

    move-result v4

    const/high16 v7, 0x3f800000    # 1.0f

    if-eqz v4, :cond_9

    invoke-virtual {v3}, Landroid/view/View;->isInEditMode()Z

    move-result v4

    if-nez v4, :cond_9

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v4

    if-eqz v4, :cond_7

    const/4 v4, 0x0

    invoke-virtual {v1, v4}, Landroid/view/View;->setAlpha(F)V

    const v8, 0x3ecccccd    # 0.4f

    if-eqz v5, :cond_4

    move v9, v8

    goto :goto_2

    :cond_4
    move v9, v4

    :goto_2
    invoke-virtual {v1, v9}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setScaleY(F)V

    if-eqz v5, :cond_5

    move v9, v8

    goto :goto_3

    :cond_5
    move v9, v4

    :goto_3
    invoke-virtual {v1, v9}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setScaleX(F)V

    if-eqz v5, :cond_6

    move v4, v8

    :cond_6
    iput v4, v0, Lar/k;->p:F

    invoke-virtual {v0, v4, v2}, Lar/k;->a(FLandroid/graphics/Matrix;)V

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    :cond_7
    iget-object v1, v0, Lar/k;->m:Lkq/e;

    if-eqz v1, :cond_8

    invoke-virtual {v0, v1, v7, v7, v7}, Lar/k;->b(Lkq/e;FFF)Landroid/animation/AnimatorSet;

    move-result-object v1

    goto :goto_4

    :cond_8
    sget v4, Lar/k;->A:I

    sget v5, Lar/k;->B:I

    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual/range {v0 .. v5}, Lar/k;->c(FFFII)Landroid/animation/AnimatorSet;

    move-result-object v1

    :goto_4
    new-instance v2, Lar/d;

    invoke-direct {v2, v0, v6}, Lar/d;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->start()V

    return-void

    :cond_9
    invoke-virtual {v1, v6, v6}, Lcr/q;->a(IZ)V

    invoke-virtual {v1, v7}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {v1, v7}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setScaleY(F)V

    invoke-virtual {v1, v7}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setScaleX(F)V

    iput v7, v0, Lar/k;->p:F

    invoke-virtual {v0, v7, v2}, Lar/k;->a(FLandroid/graphics/Matrix;)V

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    return-void
.end method

.method public getBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->x:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->y:Landroid/graphics/PorterDuff$Mode;

    return-object v0
.end method

.method public getBehavior()Lq4/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lq4/b;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$Behavior;

    invoke-direct {v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$Behavior;-><init>()V

    return-object v0
.end method

.method public getCompatElevation()F
    .locals 1

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v0

    invoke-virtual {v0}, Lar/k;->e()F

    move-result v0

    return v0
.end method

.method public getCompatHoveredFocusedTranslationZ()F
    .locals 1

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v0

    iget v0, v0, Lar/k;->i:F

    return v0
.end method

.method public getCompatPressedTranslationZ()F
    .locals 1

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v0

    iget v0, v0, Lar/k;->j:F

    return v0
.end method

.method public getContentBackground()Landroid/graphics/drawable/Drawable;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v0

    iget-object v0, v0, Lar/k;->e:Landroid/graphics/drawable/LayerDrawable;

    return-object v0
.end method

.method public getCustomSize()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->H:I

    return v0
.end method

.method public getExpandedComponentIdHint()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->O:Ld/s;

    iget v0, v0, Ld/s;->a:I

    return v0
.end method

.method public getHideMotionSpec()Lkq/e;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v0

    iget-object v0, v0, Lar/k;->n:Lkq/e;

    return-object v0
.end method

.method public getRippleColor()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->F:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getRippleColorStateList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->F:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getShapeAppearanceModel()Lkr/k;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v0

    iget-object v0, v0, Lar/k;->a:Lkr/k;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0
.end method

.method public getShowMotionSpec()Lkq/e;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v0

    iget-object v0, v0, Lar/k;->m:Lkq/e;

    return-object v0
.end method

.method public getSize()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->G:I

    return v0
.end method

.method public getSizeDimension()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->G:I

    invoke-virtual {p0, v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->c(I)I

    move-result v0

    return v0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getBackgroundTintList()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public getSupportImageTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->z:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getSupportImageTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->E:Landroid/graphics/PorterDuff$Mode;

    return-object v0
.end method

.method public getUseCompatPadding()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->K:Z

    return v0
.end method

.method public final jumpDrawablesToCurrentState()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v0

    invoke-virtual {v0}, Lar/k;->h()V

    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 4

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v0

    iget-object v1, v0, Lar/k;->s:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    iget-object v2, v0, Lar/k;->b:Lkr/g;

    if-eqz v2, :cond_0

    invoke-static {v1, v2}, Lse/b;->c0(Landroid/view/View;Lkr/g;)V

    :cond_0
    instance-of v2, v0, Lar/m;

    if-nez v2, :cond_2

    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    iget-object v2, v0, Lar/k;->y:Lar/g;

    if-nez v2, :cond_1

    new-instance v2, Lar/g;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lar/g;-><init>(Ljava/lang/Object;I)V

    iput-object v2, v0, Lar/k;->y:Lar/g;

    :cond_1
    iget-object v0, v0, Lar/k;->y:Lar/g;

    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_2
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 3

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v0

    iget-object v1, v0, Lar/k;->s:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    iget-object v2, v0, Lar/k;->y:Lar/g;

    if-eqz v2, :cond_0

    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    const/4 v1, 0x0

    iput-object v1, v0, Lar/k;->y:Lar/g;

    :cond_0
    return-void
.end method

.method public final onMeasure(II)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getSizeDimension()I

    move-result v0

    iget v1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->J:I

    sub-int v1, v0, v1

    div-int/lit8 v1, v1, 0x2

    iput v1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->I:I

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v1

    invoke-virtual {v1}, Lar/k;->q()V

    invoke-static {v0, p1}, Landroid/view/View;->resolveSize(II)I

    move-result p1

    invoke-static {v0, p2}, Landroid/view/View;->resolveSize(II)I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    iget-object p2, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->L:Landroid/graphics/Rect;

    iget v0, p2, Landroid/graphics/Rect;->left:I

    add-int/2addr v0, p1

    iget v1, p2, Landroid/graphics/Rect;->right:I

    add-int/2addr v0, v1

    iget v1, p2, Landroid/graphics/Rect;->top:I

    add-int/2addr p1, v1

    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    add-int/2addr p1, p2

    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 3

    instance-of v0, p1, Lnr/a;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_0
    check-cast p1, Lnr/a;

    invoke-virtual {p1}, Lv5/b;->b()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget-object p1, p1, Lnr/a;->y:La0/f1;

    const-string v0, "expandableWidgetHelper"

    invoke-virtual {p1, v0}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->O:Ld/s;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "expanded"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v0, Ld/s;->b:Z

    const-string v1, "expandedComponentIdHint"

    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, v0, Ld/s;->a:I

    iget-boolean p1, v0, Ld/s;->b:Z

    if-eqz p1, :cond_1

    iget-object p1, v0, Ld/s;->c:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    if-eqz v1, :cond_1

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    invoke-virtual {v0, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->f(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 5

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    :cond_0
    new-instance v1, Lnr/a;

    invoke-direct {v1, v0}, Lnr/a;-><init>(Landroid/os/Parcelable;)V

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->O:Ld/s;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "expanded"

    iget-boolean v4, v0, Ld/s;->b:Z

    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v3, "expandedComponentIdHint"

    iget v0, v0, Ld/s;->a:I

    invoke-virtual {v2, v3, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, v1, Lnr/a;->y:La0/f1;

    const-string v3, "expandableWidgetHelper"

    invoke-virtual {v0, v3, v2}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    iget-object v2, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->M:Landroid/graphics/Rect;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v3, v0, v1}, Landroid/graphics/Rect;->set(IIII)V

    iget v0, v2, Landroid/graphics/Rect;->left:I

    iget-object v1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->L:Landroid/graphics/Rect;

    iget v4, v1, Landroid/graphics/Rect;->left:I

    add-int/2addr v0, v4

    iput v0, v2, Landroid/graphics/Rect;->left:I

    iget v0, v2, Landroid/graphics/Rect;->top:I

    iget v4, v1, Landroid/graphics/Rect;->top:I

    add-int/2addr v0, v4

    iput v0, v2, Landroid/graphics/Rect;->top:I

    iget v0, v2, Landroid/graphics/Rect;->right:I

    iget v4, v1, Landroid/graphics/Rect;->right:I

    sub-int/2addr v0, v4

    iput v0, v2, Landroid/graphics/Rect;->right:I

    iget v0, v2, Landroid/graphics/Rect;->bottom:I

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v0, v1

    iput v0, v2, Landroid/graphics/Rect;->bottom:I

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->P:Lar/m;

    iget-boolean v1, v0, Lar/k;->f:Z

    if-eqz v1, :cond_0

    iget v1, v0, Lar/k;->k:I

    iget-object v0, v0, Lar/k;->s:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getSizeDimension()I

    move-result v0

    sub-int/2addr v1, v0

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    neg-int v0, v0

    invoke-virtual {v2, v0, v0}, Landroid/graphics/Rect;->inset(II)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Rect;->contains(II)Z

    move-result v0

    if-nez v0, :cond_1

    return v3

    :cond_1
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setBackgroundColor(I)V
    .locals 1

    const-string p1, "FloatingActionButton"

    const-string v0, "Setting a custom background is not supported."

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    const-string p1, "FloatingActionButton"

    const-string v0, "Setting a custom background is not supported."

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    const-string p1, "FloatingActionButton"

    const-string v0, "Setting a custom background is not supported."

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public setBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->x:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_2

    iput-object p1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->x:Landroid/content/res/ColorStateList;

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v0

    iget-object v1, v0, Lar/k;->b:Lkr/g;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lkr/g;->setTintList(Landroid/content/res/ColorStateList;)V

    :cond_0
    iget-object v0, v0, Lar/k;->d:Lar/b;

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v1

    iget v2, v0, Lar/b;->m:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v1

    iput v1, v0, Lar/b;->m:I

    :cond_1
    iput-object p1, v0, Lar/b;->p:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lar/b;->n:Z

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_2
    return-void
.end method

.method public setBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->y:Landroid/graphics/PorterDuff$Mode;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->y:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v0

    iget-object v0, v0, Lar/k;->b:Lkr/g;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lkr/g;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setCompatElevation(F)V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v0

    iget v1, v0, Lar/k;->h:F

    cmpl-float v1, v1, p1

    if-eqz v1, :cond_0

    iput p1, v0, Lar/k;->h:F

    iget v1, v0, Lar/k;->i:F

    iget v2, v0, Lar/k;->j:F

    invoke-virtual {v0, p1, v1, v2}, Lar/k;->k(FFF)V

    :cond_0
    return-void
.end method

.method public setCompatElevationResource(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setCompatElevation(F)V

    return-void
.end method

.method public setCompatHoveredFocusedTranslationZ(F)V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v0

    iget v1, v0, Lar/k;->i:F

    cmpl-float v1, v1, p1

    if-eqz v1, :cond_0

    iput p1, v0, Lar/k;->i:F

    iget v1, v0, Lar/k;->h:F

    iget v2, v0, Lar/k;->j:F

    invoke-virtual {v0, v1, p1, v2}, Lar/k;->k(FFF)V

    :cond_0
    return-void
.end method

.method public setCompatHoveredFocusedTranslationZResource(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setCompatHoveredFocusedTranslationZ(F)V

    return-void
.end method

.method public setCompatPressedTranslationZ(F)V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v0

    iget v1, v0, Lar/k;->j:F

    cmpl-float v1, v1, p1

    if-eqz v1, :cond_0

    iput p1, v0, Lar/k;->j:F

    iget v1, v0, Lar/k;->h:F

    iget v2, v0, Lar/k;->i:F

    invoke-virtual {v0, v1, v2, p1}, Lar/k;->k(FFF)V

    :cond_0
    return-void
.end method

.method public setCompatPressedTranslationZResource(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setCompatPressedTranslationZ(F)V

    return-void
.end method

.method public setCustomSize(I)V
    .locals 1

    if-ltz p1, :cond_1

    iget v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->H:I

    if-eq p1, v0, :cond_0

    iput p1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->H:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Custom size must be non-negative"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setElevation(F)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->setElevation(F)V

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v0

    iget-object v0, v0, Lar/k;->b:Lkr/g;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lkr/g;->l(F)V

    :cond_0
    return-void
.end method

.method public setEnsureMinTouchTargetSize(Z)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v0

    iget-boolean v0, v0, Lar/k;->f:Z

    if-eq p1, v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v0

    iput-boolean p1, v0, Lar/k;->f:Z

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method public setExpandedComponentIdHint(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->O:Ld/s;

    iput p1, v0, Ld/s;->a:I

    return-void
.end method

.method public setHideMotionSpec(Lkq/e;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v0

    iput-object p1, v0, Lar/k;->n:Lkq/e;

    return-void
.end method

.method public setHideMotionSpecResource(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lkq/e;->b(Landroid/content/Context;I)Lkq/e;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setHideMotionSpec(Lkq/e;)V

    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eq v0, p1, :cond_0

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object p1

    iget v0, p1, Lar/k;->p:F

    iput v0, p1, Lar/k;->p:F

    iget-object v1, p1, Lar/k;->x:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0, v1}, Lar/k;->a(FLandroid/graphics/Matrix;)V

    iget-object p1, p1, Lar/k;->s:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    iget-object p1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->z:Landroid/content/res/ColorStateList;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->e()V

    :cond_0
    return-void
.end method

.method public setImageResource(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->N:Ls/t;

    invoke-virtual {v0, p1}, Ls/t;->c(I)V

    invoke-virtual {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->e()V

    return-void
.end method

.method public setMaxImageSize(I)V
    .locals 2

    iput p1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->J:I

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v0

    iget v1, v0, Lar/k;->q:I

    if-eq v1, p1, :cond_0

    iput p1, v0, Lar/k;->q:I

    iget p1, v0, Lar/k;->p:F

    iput p1, v0, Lar/k;->p:F

    iget-object v1, v0, Lar/k;->x:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1, v1}, Lar/k;->a(FLandroid/graphics/Matrix;)V

    iget-object p1, v0, Lar/k;->s:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    :cond_0
    return-void
.end method

.method public setRippleColor(I)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setRippleColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setRippleColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->F:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_0

    .line 3
    iput-object p1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->F:Landroid/content/res/ColorStateList;

    .line 4
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->F:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, v0}, Lar/k;->m(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setScaleX(F)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setScaleX(F)V

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public setScaleY(F)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setScaleY(F)V

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public setShadowPaddingEnabled(Z)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v0

    iput-boolean p1, v0, Lar/k;->g:Z

    invoke-virtual {v0}, Lar/k;->q()V

    return-void
.end method

.method public setShapeAppearanceModel(Lkr/k;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lar/k;->n(Lkr/k;)V

    return-void
.end method

.method public setShowMotionSpec(Lkq/e;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object v0

    iput-object p1, v0, Lar/k;->m:Lkq/e;

    return-void
.end method

.method public setShowMotionSpecResource(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lkq/e;->b(Landroid/content/Context;I)Lkq/e;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setShowMotionSpec(Lkq/e;)V

    return-void
.end method

.method public setSize(I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->H:I

    iget v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->G:I

    if-eq p1, v0, :cond_0

    iput p1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->G:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public setSupportImageTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->z:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->z:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->e()V

    :cond_0
    return-void
.end method

.method public setSupportImageTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->E:Landroid/graphics/PorterDuff$Mode;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->E:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->e()V

    :cond_0
    return-void
.end method

.method public setTranslationX(F)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setTranslationX(F)V

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object p1

    invoke-virtual {p1}, Lar/k;->l()V

    return-void
.end method

.method public setTranslationY(F)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object p1

    invoke-virtual {p1}, Lar/k;->l()V

    return-void
.end method

.method public setTranslationZ(F)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setTranslationZ(F)V

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object p1

    invoke-virtual {p1}, Lar/k;->l()V

    return-void
.end method

.method public setUseCompatPadding(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->K:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->K:Z

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()Lar/k;

    move-result-object p1

    invoke-virtual {p1}, Lar/k;->i()V

    :cond_0
    return-void
.end method

.method public setVisibility(I)V
    .locals 0

    invoke-super {p0, p1}, Lcr/q;->setVisibility(I)V

    return-void
.end method
