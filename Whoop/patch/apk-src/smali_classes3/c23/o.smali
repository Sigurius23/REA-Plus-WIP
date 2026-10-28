.class public final Lc23/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public E:F

.field public F:F

.field public G:Z

.field public H:Z

.field public final I:Landroid/view/GestureDetector;

.field public final J:Lc23/b;

.field public final K:Landroid/graphics/Matrix;

.field public final L:Landroid/graphics/Matrix;

.field public final M:Landroid/graphics/Matrix;

.field public final N:Landroid/graphics/RectF;

.field public final O:[F

.field public P:Landroid/view/View$OnClickListener;

.field public Q:Landroid/view/View$OnLongClickListener;

.field public R:Lc23/h;

.field public S:Lc23/l;

.field public T:I

.field public U:I

.field public V:Z

.field public W:Landroid/widget/ImageView$ScaleType;

.field public final X:Lro/i;

.field public final w:Lio/getstream/photoview/PhotoView;

.field public final x:Landroid/view/animation/AccelerateDecelerateInterpolator;

.field public y:I

.field public z:F


# direct methods
.method public constructor <init>(Lio/getstream/photoview/PhotoView;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc23/o;->w:Lio/getstream/photoview/PhotoView;

    new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    iput-object v0, p0, Lc23/o;->x:Landroid/view/animation/AccelerateDecelerateInterpolator;

    const/16 v0, 0xc8

    iput v0, p0, Lc23/o;->y:I

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lc23/o;->z:F

    const/high16 v0, 0x3fe00000    # 1.75f

    iput v0, p0, Lc23/o;->E:F

    const/high16 v0, 0x40400000    # 3.0f

    iput v0, p0, Lc23/o;->F:F

    const/4 v0, 0x1

    iput-boolean v0, p0, Lc23/o;->G:Z

    new-instance v1, Landroid/view/GestureDetector;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    new-instance v3, Lc23/n;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lc23/n;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v1, v2, v3}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v1, p0, Lc23/o;->I:Landroid/view/GestureDetector;

    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    iput-object v2, p0, Lc23/o;->K:Landroid/graphics/Matrix;

    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    iput-object v2, p0, Lc23/o;->L:Landroid/graphics/Matrix;

    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    iput-object v2, p0, Lc23/o;->M:Landroid/graphics/Matrix;

    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, p0, Lc23/o;->N:Landroid/graphics/RectF;

    const/16 v2, 0x9

    new-array v2, v2, [F

    iput-object v2, p0, Lc23/o;->O:[F

    const/4 v2, 0x2

    iput v2, p0, Lc23/o;->T:I

    iput v2, p0, Lc23/o;->U:I

    iput-boolean v0, p0, Lc23/o;->V:Z

    sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    iput-object v0, p0, Lc23/o;->W:Landroid/widget/ImageView$ScaleType;

    new-instance v0, Lro/i;

    const/16 v2, 0xb

    invoke-direct {v0, p0, v2}, Lro/i;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lc23/o;->X:Lro/i;

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    invoke-virtual {p1, p0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    invoke-virtual {p1}, Landroid/view/View;->isInEditMode()Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v2, Lc23/b;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v3, "getContext(...)"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, p1, v0}, Lc23/b;-><init>(Landroid/content/Context;Lro/i;)V

    iput-object v2, p0, Lc23/o;->J:Lc23/b;

    new-instance p1, Lc23/j;

    invoke-direct {p1, p0}, Lc23/j;-><init>(Lc23/o;)V

    invoke-virtual {v1, p1}, Landroid/view/GestureDetector;->setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    invoke-virtual {p0}, Lc23/o;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lc23/o;->c()Landroid/graphics/Matrix;

    move-result-object v0

    iget-object v1, p0, Lc23/o;->w:Lio/getstream/photoview/PhotoView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    :cond_0
    return-void
.end method

.method public final b()Z
    .locals 13

    invoke-virtual {p0}, Lc23/o;->c()Landroid/graphics/Matrix;

    move-result-object v0

    iget-object v1, p0, Lc23/o;->w:Lio/getstream/photoview/PhotoView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    int-to-float v2, v2

    iget-object v5, p0, Lc23/o;->N:Landroid/graphics/RectF;

    invoke-virtual {v5, v3, v3, v4, v2}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {v0, v5}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    const/4 v0, 0x0

    if-nez v5, :cond_1

    return v0

    :cond_1
    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    move-result v2

    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    move-result v4

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v6

    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    sub-int/2addr v6, v7

    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    move-result v7

    sub-int/2addr v6, v7

    int-to-float v6, v6

    cmpg-float v7, v2, v6

    const/4 v8, -0x1

    const/4 v9, 0x3

    const/4 v10, 0x1

    const/4 v11, 0x2

    if-gtz v7, :cond_4

    iget-object v7, p0, Lc23/o;->W:Landroid/widget/ImageView$ScaleType;

    sget-object v12, Lc23/m;->a:[I

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v7, v12, v7

    if-eq v7, v11, :cond_3

    if-eq v7, v9, :cond_2

    sub-float/2addr v6, v2

    int-to-float v2, v11

    div-float/2addr v6, v2

    iget v2, v5, Landroid/graphics/RectF;->top:F

    :goto_1
    sub-float/2addr v6, v2

    goto :goto_2

    :cond_2
    sub-float/2addr v6, v2

    iget v2, v5, Landroid/graphics/RectF;->top:F

    goto :goto_1

    :cond_3
    iget v2, v5, Landroid/graphics/RectF;->top:F

    neg-float v6, v2

    :goto_2
    iput v11, p0, Lc23/o;->U:I

    goto :goto_3

    :cond_4
    iget v2, v5, Landroid/graphics/RectF;->top:F

    cmpl-float v7, v2, v3

    if-lez v7, :cond_5

    iput v0, p0, Lc23/o;->U:I

    neg-float v6, v2

    goto :goto_3

    :cond_5
    iget v2, v5, Landroid/graphics/RectF;->bottom:F

    cmpg-float v7, v2, v6

    if-gez v7, :cond_6

    iput v10, p0, Lc23/o;->U:I

    sub-float/2addr v6, v2

    goto :goto_3

    :cond_6
    iput v8, p0, Lc23/o;->U:I

    move v6, v3

    :goto_3
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    move-result v7

    sub-int/2addr v2, v7

    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    sub-int/2addr v2, v1

    int-to-float v1, v2

    cmpg-float v2, v4, v1

    if-gtz v2, :cond_9

    iget-object v0, p0, Lc23/o;->W:Landroid/widget/ImageView$ScaleType;

    sget-object v2, Lc23/m;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    if-eq v0, v11, :cond_8

    if-eq v0, v9, :cond_7

    sub-float/2addr v1, v4

    int-to-float v0, v11

    div-float/2addr v1, v0

    iget v0, v5, Landroid/graphics/RectF;->left:F

    :goto_4
    sub-float/2addr v1, v0

    move v3, v1

    goto :goto_5

    :cond_7
    sub-float/2addr v1, v4

    iget v0, v5, Landroid/graphics/RectF;->left:F

    goto :goto_4

    :cond_8
    iget v0, v5, Landroid/graphics/RectF;->left:F

    neg-float v0, v0

    move v3, v0

    :goto_5
    iput v11, p0, Lc23/o;->T:I

    goto :goto_6

    :cond_9
    iget v2, v5, Landroid/graphics/RectF;->left:F

    cmpl-float v4, v2, v3

    if-lez v4, :cond_a

    iput v0, p0, Lc23/o;->T:I

    neg-float v3, v2

    goto :goto_6

    :cond_a
    iget v0, v5, Landroid/graphics/RectF;->right:F

    cmpg-float v2, v0, v1

    if-gez v2, :cond_b

    sub-float v3, v1, v0

    iput v10, p0, Lc23/o;->T:I

    goto :goto_6

    :cond_b
    iput v8, p0, Lc23/o;->T:I

    :goto_6
    iget-object v0, p0, Lc23/o;->M:Landroid/graphics/Matrix;

    invoke-virtual {v0, v3, v6}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    return v10
.end method

.method public final c()Landroid/graphics/Matrix;
    .locals 2

    iget-object v0, p0, Lc23/o;->K:Landroid/graphics/Matrix;

    iget-object v1, p0, Lc23/o;->L:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object v0, p0, Lc23/o;->M:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    return-object v1
.end method

.method public final d()F
    .locals 6

    iget-object v0, p0, Lc23/o;->M:Landroid/graphics/Matrix;

    iget-object v1, p0, Lc23/o;->O:[F

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    const/4 v2, 0x0

    aget v2, v1, v2

    float-to-double v2, v2

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    double-to-float v2, v2

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    const/4 v0, 0x3

    aget v0, v1, v0

    float-to-double v0, v0

    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    double-to-float v0, v0

    add-float/2addr v2, v0

    float-to-double v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method

.method public final e(FFFZ)V
    .locals 7

    iget v0, p0, Lc23/o;->z:F

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_1

    iget v0, p0, Lc23/o;->F:F

    cmpl-float v0, p1, v0

    if-gtz v0, :cond_1

    if-eqz p4, :cond_0

    new-instance v1, Lc23/k;

    invoke-virtual {p0}, Lc23/o;->d()F

    move-result v3

    move-object v2, p0

    move v4, p1

    move v5, p2

    move v6, p3

    invoke-direct/range {v1 .. v6}, Lc23/k;-><init>(Lc23/o;FFFF)V

    iget-object p1, v2, Lc23/o;->w:Lio/getstream/photoview/PhotoView;

    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_0
    move-object v2, p0

    move v4, p1

    move v5, p2

    move v6, p3

    iget-object p1, v2, Lc23/o;->M:Landroid/graphics/Matrix;

    invoke-virtual {p1, v4, v4, v5, v6}, Landroid/graphics/Matrix;->setScale(FFFF)V

    invoke-virtual {p0}, Lc23/o;->a()V

    return-void

    :cond_1
    move-object v2, p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Scale must be within the range of minScale and maxScale"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f()V
    .locals 4

    iget-boolean v0, p0, Lc23/o;->V:Z

    iget-object v1, p0, Lc23/o;->w:Lio/getstream/photoview/PhotoView;

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lc23/o;->g(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lc23/o;->M:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    const/16 v2, 0x168

    int-to-float v2, v2

    const/4 v3, 0x0

    rem-float/2addr v3, v2

    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->postRotate(F)Z

    invoke-virtual {p0}, Lc23/o;->a()V

    invoke-virtual {p0}, Lc23/o;->c()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    invoke-virtual {p0}, Lc23/o;->b()Z

    return-void
.end method

.method public final g(Landroid/graphics/drawable/Drawable;)V
    .locals 12

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lc23/o;->w:Lio/getstream/photoview/PhotoView;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    int-to-float v2, v2

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p1

    iget-object v4, p0, Lc23/o;->K:Landroid/graphics/Matrix;

    invoke-virtual {v4}, Landroid/graphics/Matrix;->reset()V

    int-to-float v3, v3

    div-float v5, v1, v3

    int-to-float p1, p1

    div-float v6, v2, p1

    iget-object v7, p0, Lc23/o;->W:Landroid/widget/ImageView$ScaleType;

    sget-object v8, Lc23/m;->a:[I

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v7, v8, v7

    const/4 v9, 0x5

    const/high16 v10, 0x40000000    # 2.0f

    const/4 v11, 0x0

    if-eq v7, v9, :cond_b

    const/4 v9, 0x6

    if-eq v7, v9, :cond_9

    const/4 v9, 0x7

    if-eq v7, v9, :cond_6

    new-instance v5, Landroid/graphics/RectF;

    invoke-direct {v5, v11, v11, v3, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    new-instance v6, Landroid/graphics/RectF;

    invoke-direct {v6, v11, v11, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    float-to-int v1, v11

    rem-int/lit16 v1, v1, 0xb4

    if-eqz v1, :cond_1

    new-instance v5, Landroid/graphics/RectF;

    invoke-direct {v5, v11, v11, p1, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    :cond_1
    iget-object p1, p0, Lc23/o;->W:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v8, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_5

    const/4 v1, 0x2

    if-eq p1, v1, :cond_4

    const/4 v1, 0x3

    if-eq p1, v1, :cond_3

    const/4 v1, 0x4

    if-eq p1, v1, :cond_2

    goto :goto_1

    :cond_2
    sget-object p1, Landroid/graphics/Matrix$ScaleToFit;->FILL:Landroid/graphics/Matrix$ScaleToFit;

    invoke-virtual {v4, v5, v6, p1}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    goto :goto_1

    :cond_3
    sget-object p1, Landroid/graphics/Matrix$ScaleToFit;->END:Landroid/graphics/Matrix$ScaleToFit;

    invoke-virtual {v4, v5, v6, p1}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    goto :goto_1

    :cond_4
    sget-object p1, Landroid/graphics/Matrix$ScaleToFit;->START:Landroid/graphics/Matrix$ScaleToFit;

    invoke-virtual {v4, v5, v6, p1}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    goto :goto_1

    :cond_5
    sget-object p1, Landroid/graphics/Matrix$ScaleToFit;->CENTER:Landroid/graphics/Matrix$ScaleToFit;

    invoke-virtual {v4, v5, v6, p1}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    goto :goto_1

    :cond_6
    cmpl-float v7, v5, v6

    if-lez v7, :cond_7

    move v5, v6

    :cond_7
    const/high16 v6, 0x3f800000    # 1.0f

    cmpl-float v7, v6, v5

    if-lez v7, :cond_8

    goto :goto_0

    :cond_8
    move v5, v6

    :goto_0
    invoke-virtual {v4, v5, v5}, Landroid/graphics/Matrix;->postScale(FF)Z

    mul-float/2addr v3, v5

    sub-float/2addr v1, v3

    div-float/2addr v1, v10

    mul-float/2addr p1, v5

    sub-float/2addr v2, p1

    div-float/2addr v2, v10

    invoke-virtual {v4, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto :goto_1

    :cond_9
    cmpg-float v7, v5, v6

    if-gez v7, :cond_a

    move v5, v6

    :cond_a
    invoke-virtual {v4, v5, v5}, Landroid/graphics/Matrix;->postScale(FF)Z

    mul-float/2addr v3, v5

    sub-float/2addr v1, v3

    div-float/2addr v1, v10

    mul-float/2addr p1, v5

    sub-float/2addr v2, p1

    div-float/2addr v2, v10

    invoke-virtual {v4, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto :goto_1

    :cond_b
    sub-float/2addr v1, v3

    div-float/2addr v1, v10

    sub-float/2addr v2, p1

    div-float/2addr v2, v10

    invoke-virtual {v4, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    :goto_1
    iget-object p1, p0, Lc23/o;->M:Landroid/graphics/Matrix;

    invoke-virtual {p1}, Landroid/graphics/Matrix;->reset()V

    const/16 v1, 0x168

    int-to-float v1, v1

    rem-float/2addr v11, v1

    invoke-virtual {p1, v11}, Landroid/graphics/Matrix;->postRotate(F)Z

    invoke-virtual {p0}, Lc23/o;->a()V

    invoke-virtual {p0}, Lc23/o;->c()Landroid/graphics/Matrix;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    invoke-virtual {p0}, Lc23/o;->b()Z

    return-void
.end method

.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 1

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-ne p2, p6, :cond_1

    if-ne p3, p7, :cond_1

    if-ne p4, p8, :cond_1

    if-eq p5, p9, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iget-object p1, p0, Lc23/o;->w:Lio/getstream/photoview/PhotoView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lc23/o;->g(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 9

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ev"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lc23/o;->V:Z

    const/4 v6, 0x0

    if-eqz v0, :cond_c

    move-object v0, p1

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v2, 0x0

    const/4 v7, 0x1

    if-eqz v0, :cond_4

    if-eq v0, v7, :cond_0

    const/4 v3, 0x3

    if-eq v0, v3, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {p0}, Lc23/o;->d()F

    move-result v0

    iget v3, p0, Lc23/o;->z:F

    cmpg-float v0, v0, v3

    iget-object v3, p0, Lc23/o;->w:Lio/getstream/photoview/PhotoView;

    iget-object v4, p0, Lc23/o;->N:Landroid/graphics/RectF;

    const/4 v5, 0x0

    if-gez v0, :cond_2

    invoke-virtual {p0}, Lc23/o;->b()Z

    invoke-virtual {p0}, Lc23/o;->c()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v3}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v4, v5, v5, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {v0, v4}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    move-object v2, v4

    :cond_1
    if-eqz v2, :cond_6

    new-instance v0, Lc23/k;

    move-object v4, v2

    invoke-virtual {p0}, Lc23/o;->d()F

    move-result v2

    iget v3, p0, Lc23/o;->z:F

    move-object v5, v4

    invoke-virtual {v5}, Landroid/graphics/RectF;->centerX()F

    move-result v4

    invoke-virtual {v5}, Landroid/graphics/RectF;->centerY()F

    move-result v5

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lc23/k;-><init>(Lc23/o;FFFF)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :goto_0
    move v0, v7

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Lc23/o;->d()F

    move-result v0

    iget v8, p0, Lc23/o;->F:F

    cmpl-float v0, v0, v8

    if-lez v0, :cond_6

    invoke-virtual {p0}, Lc23/o;->b()Z

    invoke-virtual {p0}, Lc23/o;->c()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v3}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v4, v5, v5, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {v0, v4}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    move-object v2, v4

    :cond_3
    if-eqz v2, :cond_6

    new-instance v0, Lc23/k;

    move-object v4, v2

    invoke-virtual {p0}, Lc23/o;->d()F

    move-result v2

    iget v3, p0, Lc23/o;->F:F

    move-object v5, v4

    invoke-virtual {v5}, Landroid/graphics/RectF;->centerX()F

    move-result v4

    invoke-virtual {v5}, Landroid/graphics/RectF;->centerY()F

    move-result v5

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lc23/k;-><init>(Lc23/o;FFFF)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-interface {v0, v7}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_5
    iget-object v0, p0, Lc23/o;->S:Lc23/l;

    if-eqz v0, :cond_6

    iget-object v0, v0, Lc23/l;->w:Landroid/widget/OverScroller;

    invoke-virtual {v0, v7}, Landroid/widget/OverScroller;->forceFinished(Z)V

    iput-object v2, p0, Lc23/o;->S:Lc23/l;

    :cond_6
    :goto_1
    move v0, v6

    :goto_2
    iget-object v2, p0, Lc23/o;->J:Lc23/b;

    if-eqz v2, :cond_a

    iget-object v0, v2, Lc23/b;->d:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    move-result v3

    iget-boolean v4, v2, Lc23/b;->f:Z

    :try_start_0
    invoke-virtual {v0, p2}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    invoke-virtual {v2, p2}, Lc23/b;->a(Landroid/view/MotionEvent;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    if-nez v3, :cond_7

    invoke-virtual {v0}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    move-result v0

    if-nez v0, :cond_7

    move v0, v7

    goto :goto_3

    :cond_7
    move v0, v6

    :goto_3
    if-nez v4, :cond_8

    iget-boolean v2, v2, Lc23/b;->f:Z

    if-nez v2, :cond_8

    move v2, v7

    goto :goto_4

    :cond_8
    move v2, v6

    :goto_4
    if-eqz v0, :cond_9

    if-eqz v2, :cond_9

    move v6, v7

    :cond_9
    iput-boolean v6, p0, Lc23/o;->H:Z

    move v0, v7

    :cond_a
    iget-object v2, p0, Lc23/o;->I:Landroid/view/GestureDetector;

    invoke-virtual {v2, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v2

    if-eqz v2, :cond_b

    goto :goto_5

    :cond_b
    move v7, v0

    :goto_5
    return v7

    :cond_c
    return v6
.end method
