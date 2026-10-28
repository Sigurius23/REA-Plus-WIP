.class public Lcom/whoop/whooplive/selfie/DraggableViewGroup;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whooplive/selfie/DraggableViewGroup$a;,
        Lcom/whoop/whooplive/selfie/DraggableViewGroup$b;
    }
.end annotation


# instance fields
.field private E:I

.field private F:I

.field private G:F

.field private H:F

.field private I:Landroid/view/ScaleGestureDetector;

.field private J:Landroid/view/GestureDetector;

.field private K:F

.field private L:F

.field private M:F

.field private N:F

.field private O:Z

.field private P:I

.field private Q:Landroid/view/View;

.field private R:Landroid/graphics/Rect;

.field S:[I

.field private T:Llh3/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llh3/e;"
        }
    .end annotation
.end field

.field private U:Llh3/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llh3/e;"
        }
    .end annotation
.end field

.field private w:Ltr2/n;

.field private x:Z

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->K:F

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->R:Landroid/graphics/Rect;

    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->S:[I

    invoke-static {}, Llh3/e;->Y()Llh3/e;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->T:Llh3/e;

    invoke-static {}, Llh3/e;->Y()Llh3/e;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->U:Llh3/e;

    sget-object v0, Lpz2/h;->d:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->t(Landroid/content/res/TypedArray;)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public static bridge synthetic a(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)I
    .locals 0

    iget p0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->P:I

    return p0
.end method

.method public static bridge synthetic b(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->Q:Landroid/view/View;

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)F
    .locals 0

    iget p0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->M:F

    return p0
.end method

.method public static bridge synthetic d(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)F
    .locals 0

    iget p0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->N:F

    return p0
.end method

.method public static bridge synthetic e(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->w:Ltr2/n;

    return-object p0
.end method

.method public static bridge synthetic f(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)F
    .locals 0

    iget p0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->G:F

    return p0
.end method

.method public static bridge synthetic g(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)F
    .locals 0

    iget p0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->H:F

    return p0
.end method

.method private getParentHeight()I
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    return v0
.end method

.method private getParentWidth()I
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    return v0
.end method

.method public static bridge synthetic h(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)Llh3/e;
    .locals 0

    iget-object p0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->T:Llh3/e;

    return-object p0
.end method

.method public static bridge synthetic i(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)F
    .locals 0

    iget p0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->K:F

    return p0
.end method

.method public static bridge synthetic j(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)F
    .locals 0

    iget p0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->L:F

    return p0
.end method

.method public static bridge synthetic k(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)Llh3/e;
    .locals 0

    iget-object p0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->U:Llh3/e;

    return-object p0
.end method

.method public static bridge synthetic l(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->O:Z

    return p0
.end method

.method public static bridge synthetic m(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->x:Z

    return p0
.end method

.method public static bridge synthetic n(Lcom/whoop/whooplive/selfie/DraggableViewGroup;I)V
    .locals 0

    iput p1, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->P:I

    return-void
.end method

.method public static bridge synthetic o(Lcom/whoop/whooplive/selfie/DraggableViewGroup;F)V
    .locals 0

    iput p1, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->M:F

    return-void
.end method

.method public static bridge synthetic p(Lcom/whoop/whooplive/selfie/DraggableViewGroup;F)V
    .locals 0

    iput p1, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->N:F

    return-void
.end method

.method public static bridge synthetic q(Lcom/whoop/whooplive/selfie/DraggableViewGroup;F)V
    .locals 0

    iput p1, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->K:F

    return-void
.end method

.method public static bridge synthetic r(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->O:Z

    return-void
.end method

.method private s(Landroid/view/View;II)Z
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->R:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->R:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->left:I

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p1}, Landroid/view/View;->getScaleX()F

    move-result v3

    mul-float/2addr v3, v2

    float-to-int v2, v3

    add-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->right:I

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->R:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->top:I

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p1}, Landroid/view/View;->getScaleY()F

    move-result v3

    mul-float/2addr v3, v2

    float-to-int v2, v3

    add-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->S:[I

    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->R:Landroid/graphics/Rect;

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->S:[I

    const/4 v1, 0x0

    aget v1, v0, v1

    const/4 v2, 0x1

    aget v0, v0, v2

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Rect;->offset(II)V

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->R:Landroid/graphics/Rect;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Rect;->contains(II)Z

    move-result p1

    return p1
.end method

.method private t(Landroid/content/res/TypedArray;)V
    .locals 4

    new-instance v0, Ltr2/o;

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object v1

    invoke-virtual {v1}, Le50/b;->d()Ltr2/n;

    move-result-object v1

    const-string v2, "DraggableViewGroup"

    invoke-direct {v0, v1, v2}, Ltr2/o;-><init>(Ltr2/n;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->w:Ltr2/n;

    new-instance v0, Landroid/view/GestureDetector;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lcom/whoop/whooplive/selfie/DraggableViewGroup$a;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/whoop/whooplive/selfie/DraggableViewGroup$a;-><init>(Lcom/whoop/whooplive/selfie/DraggableViewGroup;I)V

    invoke-direct {v0, v1, v2}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->J:Landroid/view/GestureDetector;

    new-instance v0, Landroid/view/ScaleGestureDetector;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lcom/whoop/whooplive/selfie/DraggableViewGroup$b;

    invoke-direct {v2, p0, v3}, Lcom/whoop/whooplive/selfie/DraggableViewGroup$b;-><init>(Lcom/whoop/whooplive/selfie/DraggableViewGroup;I)V

    invoke-direct {v0, v1, v2}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->I:Landroid/view/ScaleGestureDetector;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lpz2/c;->b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->L:F

    if-eqz p1, :cond_0

    sget v0, Lpz2/h;->k:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->setSyncWithSiblings(Z)V

    sget v0, Lpz2/h;->f:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->y:I

    sget v0, Lpz2/h;->g:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->z:I

    sget v0, Lpz2/h;->h:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->E:I

    sget v0, Lpz2/h;->e:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->F:I

    sget v0, Lpz2/h;->i:I

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->G:F

    sget v0, Lpz2/h;->j:I

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p1

    iput p1, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->H:F

    :cond_0
    return-void
.end method


# virtual methods
.method public onFinishInflate()V
    .locals 3

    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->Q:Landroid/view/View;

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "DraggableViewGroup "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " must have exactly 1 child View."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->Q:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    float-to-int v2, v2

    invoke-direct {p0, v0, v1, v2}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->s(Landroid/view/View;II)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->O:Z

    const/high16 v0, -0x80000000

    iput v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->P:I

    :cond_1
    iget-object v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->I:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->J:Landroid/view/GestureDetector;

    invoke-virtual {v1, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    or-int/2addr p1, v0

    return p1
.end method

.method public setSyncWithSiblings(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->x:Z

    return-void
.end method

.method public u()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->x:Z

    return v0
.end method

.method public v()Lxg3/g;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->T:Llh3/e;

    const/4 v1, 0x0

    sget-object v2, Lxg3/a;->b:Lxg3/a;

    const-wide/16 v3, 0x5

    invoke-virtual {v0, v3, v4, v1, v2}, Lxg3/g;->F(JLbh3/a;Lxg3/b;)Lxg3/g;

    move-result-object v0

    return-object v0
.end method

.method public w()Lxg3/g;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->U:Llh3/e;

    const/4 v1, 0x0

    sget-object v2, Lxg3/a;->b:Lxg3/a;

    const-wide/16 v3, 0x5

    invoke-virtual {v0, v3, v4, v1, v2}, Lxg3/g;->F(JLbh3/a;Lxg3/b;)Lxg3/g;

    move-result-object v0

    return-object v0
.end method

.method public x(II)V
    .locals 14

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->Q:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->Q:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    iget-object v2, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->Q:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    int-to-float v3, v1

    iget-object v4, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->Q:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getScaleX()F

    move-result v4

    mul-float/2addr v4, v3

    float-to-int v3, v4

    int-to-float v4, v2

    iget-object v5, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->Q:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getScaleY()F

    move-result v5

    mul-float/2addr v5, v4

    float-to-int v4, v5

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->getParentWidth()I

    move-result v5

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->getParentHeight()I

    move-result v6

    div-int/lit8 v1, v1, 0x2

    add-int v7, p1, v1

    div-int/lit8 v8, v3, 0x2

    sub-int/2addr v7, v8

    div-int/lit8 v2, v2, 0x2

    add-int v9, p2, v2

    div-int/lit8 v10, v4, 0x2

    sub-int/2addr v9, v10

    add-int v11, v7, v3

    add-int v12, v9, v4

    iget v13, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->y:I

    if-ge v11, v13, :cond_0

    sub-int/2addr v13, v1

    add-int/2addr v13, v8

    sub-int p1, v13, v3

    :cond_0
    iget v3, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->z:I

    sub-int v11, v5, v3

    if-le v7, v11, :cond_1

    sub-int/2addr v5, v3

    sub-int/2addr v5, v1

    add-int p1, v5, v8

    :cond_1
    iget v1, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->E:I

    if-ge v12, v1, :cond_2

    sub-int/2addr v1, v2

    add-int/2addr v1, v10

    sub-int/2addr v1, v4

    goto :goto_0

    :cond_2
    move/from16 v1, p2

    :goto_0
    iget v3, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->F:I

    sub-int v4, v6, v3

    if-le v9, v4, :cond_3

    sub-int/2addr v6, v3

    sub-int/2addr v6, v2

    add-int v1, v6, v10

    :cond_3
    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->Q:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public y(F)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->Q:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleX(F)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->Q:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleY(F)V

    return-void
.end method
