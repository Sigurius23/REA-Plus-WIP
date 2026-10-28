.class public Lcom/whoop/ui/WhoopZoomageView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"

# interfaces
.implements Landroid/view/ScaleGestureDetector$OnScaleGestureListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/ui/WhoopZoomageView$f;,
        Lcom/whoop/ui/WhoopZoomageView$g;
    }
.end annotation


# instance fields
.field private E:[F

.field private F:[F

.field private G:F

.field private H:F

.field private I:F

.field private J:F

.field private final K:Landroid/graphics/RectF;

.field private L:Z

.field private M:Z

.field private N:Z

.field private O:Z

.field private P:Z

.field private Q:Z

.field private R:F

.field private S:Lcom/whoop/ui/WhoopZoomageView$f;

.field private T:Landroid/graphics/PointF;

.field private U:F

.field private V:F

.field private W:F

.field private a0:I

.field private b0:Landroid/view/ScaleGestureDetector;

.field private c0:Landroid/view/GestureDetector;

.field private d0:Z

.field private e0:Z

.field private f0:Landroid/graphics/Path;

.field private g0:Z

.field private final h0:Landroid/view/GestureDetector$OnGestureListener;

.field private final w:I

.field private x:Landroid/widget/ImageView$ScaleType;

.field private y:Landroid/graphics/Matrix;

.field private z:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 v0, 0xc8

    iput v0, p0, Lcom/whoop/ui/WhoopZoomageView;->w:I

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->y:Landroid/graphics/Matrix;

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->z:Landroid/graphics/Matrix;

    const/16 v0, 0x9

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->E:[F

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->F:[F

    const v0, 0x3f19999a    # 0.6f

    iput v0, p0, Lcom/whoop/ui/WhoopZoomageView;->G:F

    const/high16 v1, 0x41000000    # 8.0f

    iput v1, p0, Lcom/whoop/ui/WhoopZoomageView;->H:F

    iput v0, p0, Lcom/whoop/ui/WhoopZoomageView;->I:F

    iput v1, p0, Lcom/whoop/ui/WhoopZoomageView;->J:F

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/PointF;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->T:Landroid/graphics/PointF;

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/whoop/ui/WhoopZoomageView;->U:F

    iput v0, p0, Lcom/whoop/ui/WhoopZoomageView;->V:F

    iput v0, p0, Lcom/whoop/ui/WhoopZoomageView;->W:F

    const/4 v0, 0x1

    iput v0, p0, Lcom/whoop/ui/WhoopZoomageView;->a0:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whoop/ui/WhoopZoomageView;->d0:Z

    iput-boolean v0, p0, Lcom/whoop/ui/WhoopZoomageView;->e0:Z

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->f0:Landroid/graphics/Path;

    new-instance v0, Lcom/whoop/ui/WhoopZoomageView$d;

    invoke-direct {v0, p0}, Lcom/whoop/ui/WhoopZoomageView$d;-><init>(Lcom/whoop/ui/WhoopZoomageView;)V

    iput-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->h0:Landroid/view/GestureDetector$OnGestureListener;

    invoke-direct {p0, p1, p2}, Lcom/whoop/ui/WhoopZoomageView;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static bridge synthetic c(Lcom/whoop/ui/WhoopZoomageView;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whoop/ui/WhoopZoomageView;->d0:Z

    return-void
.end method

.method public static bridge synthetic d(Lcom/whoop/ui/WhoopZoomageView;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/whoop/ui/WhoopZoomageView;->e0:Z

    return-void
.end method

.method private e(IF)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->E:[F

    aget v0, v0, p1

    const/4 v1, 0x2

    new-array v1, v1, [F

    const/4 v2, 0x0

    aput v0, v1, v2

    const/4 v0, 0x1

    aput p2, v1, v0

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p2

    new-instance v0, Lcom/whoop/ui/WhoopZoomageView$c;

    invoke-direct {v0, p0, p1}, Lcom/whoop/ui/WhoopZoomageView$c;-><init>(Lcom/whoop/ui/WhoopZoomageView;I)V

    invoke-virtual {p2, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const-wide/16 v0, 0xc8

    invoke-virtual {p2, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method private f(Landroid/graphics/Matrix;I)V
    .locals 8

    const/16 v0, 0x9

    new-array v0, v0, [F

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->getValues([F)V

    new-instance v3, Landroid/graphics/Matrix;

    invoke-virtual {p0}, Landroid/widget/ImageView;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object v1

    invoke-direct {v3, v1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    iget-object v1, p0, Lcom/whoop/ui/WhoopZoomageView;->E:[F

    invoke-virtual {v3, v1}, Landroid/graphics/Matrix;->getValues([F)V

    const/4 v1, 0x0

    aget v2, v0, v1

    iget-object v4, p0, Lcom/whoop/ui/WhoopZoomageView;->E:[F

    aget v1, v4, v1

    sub-float v6, v2, v1

    const/4 v1, 0x4

    aget v2, v0, v1

    aget v1, v4, v1

    sub-float v7, v2, v1

    const/4 v1, 0x2

    aget v2, v0, v1

    aget v5, v4, v1

    sub-float/2addr v2, v5

    const/4 v5, 0x5

    aget v0, v0, v5

    aget v4, v4, v5

    sub-float v5, v0, v4

    new-array v0, v1, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    new-instance v1, Lcom/whoop/ui/WhoopZoomageView$a;

    move v4, v2

    move-object v2, p0

    invoke-direct/range {v1 .. v7}, Lcom/whoop/ui/WhoopZoomageView$a;-><init>(Lcom/whoop/ui/WhoopZoomageView;Landroid/graphics/Matrix;FFFF)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance v1, Lcom/whoop/ui/WhoopZoomageView$b;

    invoke-direct {v1, p0, p1}, Lcom/whoop/ui/WhoopZoomageView$b;-><init>(Lcom/whoop/ui/WhoopZoomageView;Landroid/graphics/Matrix;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    int-to-long p1, p2

    invoke-virtual {v0, p1, p2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private g()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->z:Landroid/graphics/Matrix;

    const/16 v1, 0xc8

    invoke-direct {p0, v0, v1}, Lcom/whoop/ui/WhoopZoomageView;->f(Landroid/graphics/Matrix;I)V

    return-void
.end method

.method private getCurrentDisplayedHeight()F
    .locals 3

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/whoop/ui/WhoopZoomageView;->E:[F

    const/4 v2, 0x4

    aget v1, v1, v2

    mul-float/2addr v0, v1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private getCurrentDisplayedWidth()F
    .locals 3

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/whoop/ui/WhoopZoomageView;->E:[F

    const/4 v2, 0x0

    aget v1, v1, v2

    mul-float/2addr v0, v1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private h()V
    .locals 4

    invoke-direct {p0}, Lcom/whoop/ui/WhoopZoomageView;->getCurrentDisplayedWidth()F

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget v3, v0, Landroid/graphics/RectF;->left:F

    cmpl-float v3, v3, v2

    if-lez v3, :cond_0

    invoke-direct {p0, v1, v2}, Lcom/whoop/ui/WhoopZoomageView;->e(IF)V

    return-void

    :cond_0
    iget v0, v0, Landroid/graphics/RectF;->right:F

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    cmpg-float v0, v0, v2

    if-gez v0, :cond_3

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->right:F

    sub-float/2addr v0, v2

    invoke-direct {p0, v1, v0}, Lcom/whoop/ui/WhoopZoomageView;->e(IF)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget v3, v0, Landroid/graphics/RectF;->left:F

    cmpg-float v3, v3, v2

    if-gez v3, :cond_2

    invoke-direct {p0, v1, v2}, Lcom/whoop/ui/WhoopZoomageView;->e(IF)V

    return-void

    :cond_2
    iget v0, v0, Landroid/graphics/RectF;->right:F

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    cmpl-float v0, v0, v2

    if-lez v0, :cond_3

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->right:F

    sub-float/2addr v0, v2

    invoke-direct {p0, v1, v0}, Lcom/whoop/ui/WhoopZoomageView;->e(IF)V

    :cond_3
    return-void
.end method

.method private i()V
    .locals 4

    invoke-direct {p0}, Lcom/whoop/ui/WhoopZoomageView;->getCurrentDisplayedHeight()F

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    const/4 v1, 0x5

    const/4 v2, 0x0

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget v3, v0, Landroid/graphics/RectF;->top:F

    cmpl-float v3, v3, v2

    if-lez v3, :cond_0

    invoke-direct {p0, v1, v2}, Lcom/whoop/ui/WhoopZoomageView;->e(IF)V

    return-void

    :cond_0
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    cmpg-float v0, v0, v2

    if-gez v0, :cond_3

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->top:F

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v0, v2

    invoke-direct {p0, v1, v0}, Lcom/whoop/ui/WhoopZoomageView;->e(IF)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget v3, v0, Landroid/graphics/RectF;->top:F

    cmpg-float v3, v3, v2

    if-gez v3, :cond_2

    invoke-direct {p0, v1, v2}, Lcom/whoop/ui/WhoopZoomageView;->e(IF)V

    return-void

    :cond_2
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    cmpl-float v0, v0, v2

    if-lez v0, :cond_3

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->top:F

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v0, v2

    invoke-direct {p0, v1, v0}, Lcom/whoop/ui/WhoopZoomageView;->e(IF)V

    :cond_3
    return-void
.end method

.method private init(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    new-instance v0, Landroid/view/ScaleGestureDetector;

    invoke-direct {v0, p1, p0}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    iput-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->b0:Landroid/view/ScaleGestureDetector;

    new-instance v0, Landroid/view/GestureDetector;

    iget-object v1, p0, Lcom/whoop/ui/WhoopZoomageView;->h0:Landroid/view/GestureDetector$OnGestureListener;

    invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->c0:Landroid/view/GestureDetector;

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->b0:Landroid/view/ScaleGestureDetector;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ScaleGestureDetector;->setQuickScaleEnabled(Z)V

    invoke-virtual {p0}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->x:Landroid/widget/ImageView$ScaleType;

    sget-object v0, Lvu1/j;->P0:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    sget v2, Lvu1/j;->a1:I

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, p0, Lcom/whoop/ui/WhoopZoomageView;->M:Z

    sget v2, Lvu1/j;->Z0:I

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, p0, Lcom/whoop/ui/WhoopZoomageView;->L:Z

    sget v2, Lvu1/j;->Q0:I

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, p0, Lcom/whoop/ui/WhoopZoomageView;->P:Z

    sget v2, Lvu1/j;->R0:I

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, p0, Lcom/whoop/ui/WhoopZoomageView;->Q:Z

    sget v2, Lvu1/j;->Y0:I

    invoke-virtual {v0, v2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, p0, Lcom/whoop/ui/WhoopZoomageView;->O:Z

    sget v2, Lvu1/j;->U0:I

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, p0, Lcom/whoop/ui/WhoopZoomageView;->N:Z

    sget v2, Lvu1/j;->X0:I

    const v3, 0x3f19999a    # 0.6f

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p0, Lcom/whoop/ui/WhoopZoomageView;->G:F

    sget v2, Lvu1/j;->W0:I

    const/high16 v3, 0x41000000    # 8.0f

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p0, Lcom/whoop/ui/WhoopZoomageView;->H:F

    sget v2, Lvu1/j;->V0:I

    const/high16 v3, 0x40400000    # 3.0f

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p0, Lcom/whoop/ui/WhoopZoomageView;->R:F

    sget v2, Lvu1/j;->S0:I

    sget-object v3, Lcom/whoop/ui/WhoopZoomageView$f;->UNDER:Lcom/whoop/ui/WhoopZoomageView$f;

    iget v3, v3, Lcom/whoop/ui/WhoopZoomageView$f;->id:I

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    invoke-static {v2}, Lcom/whoop/ui/WhoopZoomageView$f;->fromValue(I)Lcom/whoop/ui/WhoopZoomageView$f;

    move-result-object v2

    iput-object v2, p0, Lcom/whoop/ui/WhoopZoomageView;->S:Lcom/whoop/ui/WhoopZoomageView$f;

    sget-object v2, Lvu1/j;->P0:[I

    invoke-virtual {p1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    sget p2, Lvu1/j;->T0:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/whoop/ui/WhoopZoomageView;->g0:Z

    invoke-direct {p0}, Lcom/whoop/ui/WhoopZoomageView;->u()V

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private j()V
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/ui/WhoopZoomageView;->Q:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/whoop/ui/WhoopZoomageView;->h()V

    invoke-direct {p0}, Lcom/whoop/ui/WhoopZoomageView;->i()V

    :cond_0
    return-void
.end method

.method private k(F)F
    .locals 4

    invoke-direct {p0}, Lcom/whoop/ui/WhoopZoomageView;->getCurrentDisplayedWidth()F

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    const/4 v1, 0x0

    if-ltz v0, :cond_1

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    cmpg-float v2, v0, v1

    if-gtz v2, :cond_0

    add-float/2addr v0, p1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->b0:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget p1, p1, Landroid/graphics/RectF;->left:F

    neg-float p1, p1

    return p1

    :cond_0
    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->right:F

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_3

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->right:F

    add-float/2addr v0, p1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_3

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->b0:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float p1, p1

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->right:F

    sub-float/2addr p1, v0

    return p1

    :cond_1
    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->b0:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget v2, v0, Landroid/graphics/RectF;->left:F

    cmpl-float v3, v2, v1

    if-ltz v3, :cond_2

    add-float v3, v2, p1

    cmpg-float v1, v3, v1

    if-gez v1, :cond_2

    neg-float p1, v2

    return p1

    :cond_2
    iget v0, v0, Landroid/graphics/RectF;->right:F

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_3

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->right:F

    add-float/2addr v0, p1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float p1, p1

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->right:F

    sub-float/2addr p1, v0

    :cond_3
    return p1
.end method

.method private l(F)F
    .locals 4

    invoke-direct {p0}, Lcom/whoop/ui/WhoopZoomageView;->getCurrentDisplayedHeight()F

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    const/4 v1, 0x0

    if-ltz v0, :cond_1

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->top:F

    cmpg-float v2, v0, v1

    if-gtz v2, :cond_0

    add-float/2addr v0, p1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->b0:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget p1, p1, Landroid/graphics/RectF;->top:F

    neg-float p1, p1

    return p1

    :cond_0
    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_3

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    add-float/2addr v0, p1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_3

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->b0:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-float p1, p1

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr p1, v0

    return p1

    :cond_1
    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->b0:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget v2, v0, Landroid/graphics/RectF;->top:F

    cmpl-float v3, v2, v1

    if-ltz v3, :cond_2

    add-float v3, v2, p1

    cmpg-float v1, v3, v1

    if-gez v1, :cond_2

    neg-float p1, v2

    return p1

    :cond_2
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_3

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    add-float/2addr v0, p1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-float p1, p1

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr p1, v0

    :cond_3
    return p1
.end method

.method private m(FF)F
    .locals 3

    sub-float/2addr p1, p2

    iget-boolean p2, p0, Lcom/whoop/ui/WhoopZoomageView;->O:Z

    if-eqz p2, :cond_0

    invoke-direct {p0, p1}, Lcom/whoop/ui/WhoopZoomageView;->k(F)F

    move-result p1

    :cond_0
    iget-object p2, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget v0, p2, Landroid/graphics/RectF;->right:F

    add-float v1, v0, p1

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    if-gez v1, :cond_1

    neg-float p1, v0

    return p1

    :cond_1
    iget p2, p2, Landroid/graphics/RectF;->left:F

    add-float/2addr p2, p1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    cmpl-float p2, p2, v0

    if-lez p2, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float p1, p1

    iget-object p2, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget p2, p2, Landroid/graphics/RectF;->left:F

    sub-float/2addr p1, p2

    :cond_2
    return p1
.end method

.method private n(FF)F
    .locals 3

    sub-float/2addr p1, p2

    iget-boolean p2, p0, Lcom/whoop/ui/WhoopZoomageView;->O:Z

    if-eqz p2, :cond_0

    invoke-direct {p0, p1}, Lcom/whoop/ui/WhoopZoomageView;->l(F)F

    move-result p1

    :cond_0
    iget-object p2, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget v0, p2, Landroid/graphics/RectF;->bottom:F

    add-float v1, v0, p1

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    if-gez v1, :cond_1

    neg-float p1, v0

    return p1

    :cond_1
    iget p2, p2, Landroid/graphics/RectF;->top:F

    add-float/2addr p2, p1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    cmpl-float p2, p2, v0

    if-lez p2, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-float p1, p1

    iget-object p2, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    iget p2, p2, Landroid/graphics/RectF;->top:F

    sub-float/2addr p1, p2

    :cond_2
    return p1
.end method

.method private r()V
    .locals 3

    sget-object v0, Lcom/whoop/ui/WhoopZoomageView$e;->a:[I

    iget-object v1, p0, Lcom/whoop/ui/WhoopZoomageView;->S:Lcom/whoop/ui/WhoopZoomageView$f;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/whoop/ui/WhoopZoomageView;->j()V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/whoop/ui/WhoopZoomageView;->o()V

    return-void

    :cond_2
    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->E:[F

    aget v0, v0, v2

    iget-object v1, p0, Lcom/whoop/ui/WhoopZoomageView;->F:[F

    aget v1, v1, v2

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    invoke-virtual {p0}, Lcom/whoop/ui/WhoopZoomageView;->o()V

    return-void

    :cond_3
    invoke-direct {p0}, Lcom/whoop/ui/WhoopZoomageView;->j()V

    return-void

    :cond_4
    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->E:[F

    aget v0, v0, v2

    iget-object v1, p0, Lcom/whoop/ui/WhoopZoomageView;->F:[F

    aget v1, v1, v2

    cmpg-float v0, v0, v1

    if-gez v0, :cond_5

    invoke-virtual {p0}, Lcom/whoop/ui/WhoopZoomageView;->o()V

    return-void

    :cond_5
    invoke-direct {p0}, Lcom/whoop/ui/WhoopZoomageView;->j()V

    return-void
.end method

.method private s()V
    .locals 3

    const/16 v0, 0x9

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->F:[F

    new-instance v0, Landroid/graphics/Matrix;

    invoke-virtual {p0}, Landroid/widget/ImageView;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    iput-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->z:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/whoop/ui/WhoopZoomageView;->F:[F

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    iget v0, p0, Lcom/whoop/ui/WhoopZoomageView;->G:F

    iget-object v1, p0, Lcom/whoop/ui/WhoopZoomageView;->F:[F

    const/4 v2, 0x0

    aget v1, v1, v2

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/whoop/ui/WhoopZoomageView;->I:F

    iget v0, p0, Lcom/whoop/ui/WhoopZoomageView;->H:F

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/whoop/ui/WhoopZoomageView;->J:F

    return-void
.end method

.method private t([F)V
    .locals 7

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->K:Landroid/graphics/RectF;

    const/4 v1, 0x2

    aget v2, p1, v1

    const/4 v3, 0x5

    aget v4, p1, v3

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v5

    int-to-float v5, v5

    const/4 v6, 0x0

    aget v6, p1, v6

    mul-float/2addr v5, v6

    aget v1, p1, v1

    add-float/2addr v5, v1

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    int-to-float v1, v1

    const/4 v6, 0x4

    aget v6, p1, v6

    mul-float/2addr v1, v6

    aget p1, p1, v3

    add-float/2addr v1, p1

    invoke-virtual {v0, v2, v4, v5, v1}, Landroid/graphics/RectF;->set(FFFF)V

    :cond_0
    return-void
.end method

.method private u()V
    .locals 4

    iget v0, p0, Lcom/whoop/ui/WhoopZoomageView;->G:F

    iget v1, p0, Lcom/whoop/ui/WhoopZoomageView;->H:F

    cmpl-float v2, v0, v1

    if-gez v2, :cond_4

    const/4 v2, 0x0

    cmpg-float v3, v0, v2

    if-ltz v3, :cond_3

    cmpg-float v2, v1, v2

    if-ltz v2, :cond_2

    iget v2, p0, Lcom/whoop/ui/WhoopZoomageView;->R:F

    cmpl-float v2, v2, v1

    if-lez v2, :cond_0

    iput v1, p0, Lcom/whoop/ui/WhoopZoomageView;->R:F

    :cond_0
    iget v1, p0, Lcom/whoop/ui/WhoopZoomageView;->R:F

    cmpg-float v1, v1, v0

    if-gez v1, :cond_1

    iput v0, p0, Lcom/whoop/ui/WhoopZoomageView;->R:F

    :cond_1
    return-void

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "maxScale must be greater than 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "minScale must be greater than 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "minScale must be less than maxScale"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public getAnimateOnReset()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/ui/WhoopZoomageView;->P:Z

    return v0
.end method

.method public getAutoCenter()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/ui/WhoopZoomageView;->Q:Z

    return v0
.end method

.method public getAutoResetMode()Lcom/whoop/ui/WhoopZoomageView$f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->S:Lcom/whoop/ui/WhoopZoomageView$f;

    return-object v0
.end method

.method public getCurrentScaleFactor()F
    .locals 1

    iget v0, p0, Lcom/whoop/ui/WhoopZoomageView;->W:F

    return v0
.end method

.method public getDoubleTapToZoom()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/ui/WhoopZoomageView;->N:Z

    return v0
.end method

.method public getDoubleTapToZoomScaleFactor()F
    .locals 1

    iget v0, p0, Lcom/whoop/ui/WhoopZoomageView;->R:F

    return v0
.end method

.method public getRestrictBounds()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/ui/WhoopZoomageView;->O:Z

    return v0
.end method

.method public o()V
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/ui/WhoopZoomageView;->P:Z

    invoke-virtual {p0, v0}, Lcom/whoop/ui/WhoopZoomageView;->p(Z)V

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/ui/WhoopZoomageView;->g0:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->f0:Landroid/graphics/Path;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public onScale(Landroid/view/ScaleGestureDetector;)Z
    .locals 4

    iget v0, p0, Lcom/whoop/ui/WhoopZoomageView;->U:F

    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getScaleFactor()F

    move-result p1

    mul-float/2addr p1, v0

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->E:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    div-float/2addr p1, v0

    iput p1, p0, Lcom/whoop/ui/WhoopZoomageView;->V:F

    mul-float/2addr p1, v0

    iget v2, p0, Lcom/whoop/ui/WhoopZoomageView;->I:F

    cmpg-float v3, p1, v2

    if-gez v3, :cond_0

    div-float/2addr v2, v0

    iput v2, p0, Lcom/whoop/ui/WhoopZoomageView;->V:F

    goto :goto_0

    :cond_0
    iget v2, p0, Lcom/whoop/ui/WhoopZoomageView;->J:F

    cmpl-float p1, p1, v2

    if-lez p1, :cond_1

    div-float/2addr v2, v0

    iput v2, p0, Lcom/whoop/ui/WhoopZoomageView;->V:F

    :cond_1
    :goto_0
    return v1
.end method

.method public onScaleBegin(Landroid/view/ScaleGestureDetector;)Z
    .locals 1

    iget-object p1, p0, Lcom/whoop/ui/WhoopZoomageView;->E:[F

    const/4 v0, 0x0

    aget p1, p1, v0

    iput p1, p0, Lcom/whoop/ui/WhoopZoomageView;->U:F

    const/4 p1, 0x1

    return p1
.end method

.method public onScaleEnd(Landroid/view/ScaleGestureDetector;)V
    .locals 0

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lcom/whoop/ui/WhoopZoomageView;->V:F

    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    iget-object p3, p0, Lcom/whoop/ui/WhoopZoomageView;->f0:Landroid/graphics/Path;

    invoke-virtual {p3}, Landroid/graphics/Path;->reset()V

    iget-object p3, p0, Lcom/whoop/ui/WhoopZoomageView;->f0:Landroid/graphics/Path;

    div-int/lit8 p1, p1, 0x2

    int-to-float p1, p1

    div-int/lit8 p2, p2, 0x2

    int-to-float p2, p2

    sget-object p4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {p3, p1, p2, p1, p4}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7

    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    move-result v0

    if-nez v0, :cond_b

    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-boolean v0, p0, Lcom/whoop/ui/WhoopZoomageView;->M:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/whoop/ui/WhoopZoomageView;->L:Z

    if-eqz v0, :cond_b

    :cond_0
    invoke-virtual {p0}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v0

    sget-object v1, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    if-eq v0, v1, :cond_1

    invoke-super {p0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    :cond_1
    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->F:[F

    if-nez v0, :cond_2

    invoke-direct {p0}, Lcom/whoop/ui/WhoopZoomageView;->s()V

    :cond_2
    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->y:Landroid/graphics/Matrix;

    invoke-virtual {p0}, Landroid/widget/ImageView;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->y:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/whoop/ui/WhoopZoomageView;->E:[F

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->E:[F

    invoke-direct {p0, v0}, Lcom/whoop/ui/WhoopZoomageView;->t([F)V

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->b0:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->c0:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    iget-boolean v0, p0, Lcom/whoop/ui/WhoopZoomageView;->N:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/whoop/ui/WhoopZoomageView;->d0:Z

    if-eqz v0, :cond_4

    iput-boolean v2, p0, Lcom/whoop/ui/WhoopZoomageView;->d0:Z

    iput-boolean v2, p0, Lcom/whoop/ui/WhoopZoomageView;->e0:Z

    iget-object p1, p0, Lcom/whoop/ui/WhoopZoomageView;->E:[F

    aget p1, p1, v2

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->F:[F

    aget v0, v0, v2

    cmpl-float p1, p1, v0

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lcom/whoop/ui/WhoopZoomageView;->o()V

    goto :goto_0

    :cond_3
    new-instance p1, Landroid/graphics/Matrix;

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->y:Landroid/graphics/Matrix;

    invoke-direct {p1, v0}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    iget v0, p0, Lcom/whoop/ui/WhoopZoomageView;->R:F

    iget-object v2, p0, Lcom/whoop/ui/WhoopZoomageView;->b0:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v2}, Landroid/view/ScaleGestureDetector;->getFocusX()F

    move-result v2

    iget-object v3, p0, Lcom/whoop/ui/WhoopZoomageView;->b0:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v3}, Landroid/view/ScaleGestureDetector;->getFocusY()F

    move-result v3

    invoke-virtual {p1, v0, v0, v2, v3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    const/16 v0, 0xc8

    invoke-direct {p0, p1, v0}, Lcom/whoop/ui/WhoopZoomageView;->f(Landroid/graphics/Matrix;I)V

    :goto_0
    return v1

    :cond_4
    iget-boolean v0, p0, Lcom/whoop/ui/WhoopZoomageView;->e0:Z

    if-nez v0, :cond_a

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    iget v3, p0, Lcom/whoop/ui/WhoopZoomageView;->a0:I

    if-eq v0, v3, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v3, 0x2

    if-ne v0, v3, :cond_9

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->b0:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0}, Landroid/view/ScaleGestureDetector;->getFocusX()F

    move-result v0

    iget-object v3, p0, Lcom/whoop/ui/WhoopZoomageView;->b0:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v3}, Landroid/view/ScaleGestureDetector;->getFocusY()F

    move-result v3

    iget-boolean v4, p0, Lcom/whoop/ui/WhoopZoomageView;->L:Z

    if-eqz v4, :cond_6

    iget-object v4, p0, Lcom/whoop/ui/WhoopZoomageView;->T:Landroid/graphics/PointF;

    iget v4, v4, Landroid/graphics/PointF;->x:F

    invoke-direct {p0, v0, v4}, Lcom/whoop/ui/WhoopZoomageView;->m(FF)F

    move-result v4

    iget-object v5, p0, Lcom/whoop/ui/WhoopZoomageView;->T:Landroid/graphics/PointF;

    iget v5, v5, Landroid/graphics/PointF;->y:F

    invoke-direct {p0, v3, v5}, Lcom/whoop/ui/WhoopZoomageView;->n(FF)F

    move-result v5

    iget-object v6, p0, Lcom/whoop/ui/WhoopZoomageView;->y:Landroid/graphics/Matrix;

    invoke-virtual {v6, v4, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    :cond_6
    iget-boolean v4, p0, Lcom/whoop/ui/WhoopZoomageView;->M:Z

    if-eqz v4, :cond_7

    iget-object v4, p0, Lcom/whoop/ui/WhoopZoomageView;->y:Landroid/graphics/Matrix;

    iget v5, p0, Lcom/whoop/ui/WhoopZoomageView;->V:F

    invoke-virtual {v4, v5, v5, v0, v3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    iget-object v4, p0, Lcom/whoop/ui/WhoopZoomageView;->E:[F

    aget v4, v4, v2

    iget-object v5, p0, Lcom/whoop/ui/WhoopZoomageView;->F:[F

    aget v2, v5, v2

    div-float/2addr v4, v2

    iput v4, p0, Lcom/whoop/ui/WhoopZoomageView;->W:F

    :cond_7
    iget-object v2, p0, Lcom/whoop/ui/WhoopZoomageView;->y:Landroid/graphics/Matrix;

    invoke-virtual {p0, v2}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    iget-object v2, p0, Lcom/whoop/ui/WhoopZoomageView;->T:Landroid/graphics/PointF;

    invoke-virtual {v2, v0, v3}, Landroid/graphics/PointF;->set(FF)V

    goto :goto_2

    :cond_8
    :goto_1
    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->T:Landroid/graphics/PointF;

    iget-object v2, p0, Lcom/whoop/ui/WhoopZoomageView;->b0:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v2}, Landroid/view/ScaleGestureDetector;->getFocusX()F

    move-result v2

    iget-object v3, p0, Lcom/whoop/ui/WhoopZoomageView;->b0:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v3}, Landroid/view/ScaleGestureDetector;->getFocusY()F

    move-result v3

    invoke-virtual {v0, v2, v3}, Landroid/graphics/PointF;->set(FF)V

    :cond_9
    :goto_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-ne v0, v1, :cond_a

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/whoop/ui/WhoopZoomageView;->V:F

    invoke-direct {p0}, Lcom/whoop/ui/WhoopZoomageView;->r()V

    :cond_a
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result p1

    iput p1, p0, Lcom/whoop/ui/WhoopZoomageView;->a0:I

    return v1

    :cond_b
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public p(Z)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/whoop/ui/WhoopZoomageView;->g()V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/whoop/ui/WhoopZoomageView;->z:Landroid/graphics/Matrix;

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    return-void
.end method

.method public q()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whoop/ui/WhoopZoomageView;->F:[F

    return-void
.end method

.method public setAnimateOnReset(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/whoop/ui/WhoopZoomageView;->P:Z

    return-void
.end method

.method public setAutoCenter(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/whoop/ui/WhoopZoomageView;->Q:Z

    return-void
.end method

.method public setAutoResetMode(Lcom/whoop/ui/WhoopZoomageView$f;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/ui/WhoopZoomageView;->S:Lcom/whoop/ui/WhoopZoomageView$f;

    return-void
.end method

.method public setDoubleTapToZoom(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/whoop/ui/WhoopZoomageView;->N:Z

    return-void
.end method

.method public setDoubleTapToZoomScaleFactor(F)V
    .locals 0

    iput p1, p0, Lcom/whoop/ui/WhoopZoomageView;->R:F

    invoke-direct {p0}, Lcom/whoop/ui/WhoopZoomageView;->u()V

    return-void
.end method

.method public setEnabled(Z)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/whoop/ui/WhoopZoomageView;->x:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, p1}, Lcom/whoop/ui/WhoopZoomageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    :cond_0
    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object p1, p0, Lcom/whoop/ui/WhoopZoomageView;->x:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, p1}, Lcom/whoop/ui/WhoopZoomageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lcom/whoop/ui/WhoopZoomageView;->x:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, p1}, Lcom/whoop/ui/WhoopZoomageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    return-void
.end method

.method public setImageResource(I)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    iget-object p1, p0, Lcom/whoop/ui/WhoopZoomageView;->x:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, p1}, Lcom/whoop/ui/WhoopZoomageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    return-void
.end method

.method public setImageURI(Landroid/net/Uri;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageURI(Landroid/net/Uri;)V

    iget-object p1, p0, Lcom/whoop/ui/WhoopZoomageView;->x:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, p1}, Lcom/whoop/ui/WhoopZoomageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    return-void
.end method

.method public setRestrictBounds(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/whoop/ui/WhoopZoomageView;->O:Z

    return-void
.end method

.method public setScaleType(Landroid/widget/ImageView$ScaleType;)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    iput-object p1, p0, Lcom/whoop/ui/WhoopZoomageView;->x:Landroid/widget/ImageView$ScaleType;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/ui/WhoopZoomageView;->F:[F

    :cond_0
    return-void
.end method

.method public setTranslatable(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/whoop/ui/WhoopZoomageView;->L:Z

    return-void
.end method

.method public setZoomable(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/whoop/ui/WhoopZoomageView;->M:Z

    return-void
.end method
