.class public Lcom/whoop/ui/ProgressBar;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private E:Landroid/graphics/RectF;

.field private F:Landroid/graphics/RectF;

.field private G:Landroid/graphics/RectF;

.field private H:F

.field private I:Landroid/animation/Animator;

.field private w:Landroid/graphics/Paint;

.field private x:Landroid/graphics/Paint;

.field private y:Landroid/graphics/RectF;

.field private z:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    sget-object v0, Lnf1/h;->e:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/ui/ProgressBar;->b(Landroid/content/res/TypedArray;)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private b(Landroid/content/res/TypedArray;)V
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/ProgressBar;->y:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v1, v2, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lcom/whoop/ui/ProgressBar;->z:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/ProgressBar;->E:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/ProgressBar;->F:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/ProgressBar;->G:Landroid/graphics/RectF;

    iget-object v0, p0, Lcom/whoop/ui/ProgressBar;->F:Landroid/graphics/RectF;

    iput v1, v0, Landroid/graphics/RectF;->top:F

    iput v2, v0, Landroid/graphics/RectF;->bottom:F

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/ProgressBar;->w:Landroid/graphics/Paint;

    const v1, -0x777778

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/ProgressBar;->x:Landroid/graphics/Paint;

    const v1, -0xffff01

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 v0, 0x3fa00000    # 1.25f

    iput v0, p0, Lcom/whoop/ui/ProgressBar;->H:F

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/whoop/ui/ProgressBar;->w:Landroid/graphics/Paint;

    sget v1, Lnf1/h;->f:I

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v2

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/whoop/ui/ProgressBar;->x:Landroid/graphics/Paint;

    sget v1, Lnf1/h;->g:I

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v2

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p1

    if-eqz p1, :cond_1

    const/high16 p1, 0x3f400000    # 0.75f

    invoke-virtual {p0, p1}, Lcom/whoop/ui/ProgressBar;->setLeftPercent(F)V

    const p1, 0x3faccccd    # 1.35f

    invoke-virtual {p0, p1}, Lcom/whoop/ui/ProgressBar;->setRightPercent(F)V

    :cond_1
    return-void
.end method

.method private c()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/ui/ProgressBar;->E:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/whoop/ui/ProgressBar;->y:Landroid/graphics/RectF;

    iget v2, v1, Landroid/graphics/RectF;->left:F

    iget v1, v1, Landroid/graphics/RectF;->right:F

    iget-object v3, p0, Lcom/whoop/ui/ProgressBar;->z:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->left:F

    invoke-static {v2, v1, v3}, Lx43/j;->M(FFF)F

    move-result v1

    iput v1, v0, Landroid/graphics/RectF;->left:F

    iget-object v0, p0, Lcom/whoop/ui/ProgressBar;->E:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/whoop/ui/ProgressBar;->y:Landroid/graphics/RectF;

    iget v2, v1, Landroid/graphics/RectF;->left:F

    iget v1, v1, Landroid/graphics/RectF;->right:F

    iget-object v3, p0, Lcom/whoop/ui/ProgressBar;->z:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    invoke-static {v2, v1, v3}, Lx43/j;->M(FFF)F

    move-result v1

    iput v1, v0, Landroid/graphics/RectF;->right:F

    iget-object v0, p0, Lcom/whoop/ui/ProgressBar;->E:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/whoop/ui/ProgressBar;->y:Landroid/graphics/RectF;

    iget v2, v1, Landroid/graphics/RectF;->top:F

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    iget-object v3, p0, Lcom/whoop/ui/ProgressBar;->z:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->top:F

    invoke-static {v2, v1, v3}, Lx43/j;->M(FFF)F

    move-result v1

    iput v1, v0, Landroid/graphics/RectF;->top:F

    iget-object v0, p0, Lcom/whoop/ui/ProgressBar;->E:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/whoop/ui/ProgressBar;->y:Landroid/graphics/RectF;

    iget v2, v1, Landroid/graphics/RectF;->top:F

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    iget-object v3, p0, Lcom/whoop/ui/ProgressBar;->z:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    invoke-static {v2, v1, v3}, Lx43/j;->M(FFF)F

    move-result v1

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    invoke-direct {p0}, Lcom/whoop/ui/ProgressBar;->d()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method private d()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/ui/ProgressBar;->G:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/whoop/ui/ProgressBar;->E:Landroid/graphics/RectF;

    iget v2, v1, Landroid/graphics/RectF;->left:F

    iget v1, v1, Landroid/graphics/RectF;->right:F

    iget-object v3, p0, Lcom/whoop/ui/ProgressBar;->F:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->left:F

    invoke-static {v2, v1, v3}, Lx43/j;->M(FFF)F

    move-result v1

    iput v1, v0, Landroid/graphics/RectF;->left:F

    iget-object v0, p0, Lcom/whoop/ui/ProgressBar;->G:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/whoop/ui/ProgressBar;->E:Landroid/graphics/RectF;

    iget v2, v1, Landroid/graphics/RectF;->left:F

    iget v1, v1, Landroid/graphics/RectF;->right:F

    iget-object v3, p0, Lcom/whoop/ui/ProgressBar;->F:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    invoke-static {v2, v1, v3}, Lx43/j;->M(FFF)F

    move-result v1

    iput v1, v0, Landroid/graphics/RectF;->right:F

    iget-object v0, p0, Lcom/whoop/ui/ProgressBar;->G:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/whoop/ui/ProgressBar;->E:Landroid/graphics/RectF;

    iget v2, v1, Landroid/graphics/RectF;->top:F

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    iget-object v3, p0, Lcom/whoop/ui/ProgressBar;->F:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->top:F

    invoke-static {v2, v1, v3}, Lx43/j;->M(FFF)F

    move-result v1

    iput v1, v0, Landroid/graphics/RectF;->top:F

    iget-object v0, p0, Lcom/whoop/ui/ProgressBar;->G:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/whoop/ui/ProgressBar;->E:Landroid/graphics/RectF;

    iget v2, v1, Landroid/graphics/RectF;->top:F

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    iget-object v3, p0, Lcom/whoop/ui/ProgressBar;->F:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    invoke-static {v2, v1, v3}, Lx43/j;->M(FFF)F

    move-result v1

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method private e()V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/ProgressBar;->I:Landroid/animation/Animator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whoop/ui/ProgressBar;->I:Landroid/animation/Animator;

    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, Lcom/whoop/ui/ProgressBar;->setHiddenPercent(F)V

    invoke-direct {p0}, Lcom/whoop/ui/ProgressBar;->e()V

    return-void
.end method

.method public getHiddenPercent()F
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/ProgressBar;->z:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->top:F

    return v0
.end method

.method public getRolloverPercent()F
    .locals 1

    iget v0, p0, Lcom/whoop/ui/ProgressBar;->H:F

    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 14

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/whoop/ui/ProgressBar;->E:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/whoop/ui/ProgressBar;->w:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/whoop/ui/ProgressBar;->G:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->left:F

    iget v5, v0, Landroid/graphics/RectF;->right:F

    cmpg-float v1, v1, v5

    if-gez v1, :cond_0

    iget-object v1, p0, Lcom/whoop/ui/ProgressBar;->x:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/whoop/ui/ProgressBar;->E:Landroid/graphics/RectF;

    iget v3, v1, Landroid/graphics/RectF;->left:F

    iget v4, v0, Landroid/graphics/RectF;->top:F

    iget v6, v0, Landroid/graphics/RectF;->bottom:F

    iget-object v7, p0, Lcom/whoop/ui/ProgressBar;->x:Landroid/graphics/Paint;

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget-object p1, p0, Lcom/whoop/ui/ProgressBar;->G:Landroid/graphics/RectF;

    iget v9, p1, Landroid/graphics/RectF;->left:F

    iget v10, p1, Landroid/graphics/RectF;->top:F

    iget-object v0, p0, Lcom/whoop/ui/ProgressBar;->E:Landroid/graphics/RectF;

    iget v11, v0, Landroid/graphics/RectF;->right:F

    iget v12, p1, Landroid/graphics/RectF;->bottom:F

    iget-object v13, p0, Lcom/whoop/ui/ProgressBar;->x:Landroid/graphics/Paint;

    move-object v8, v2

    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    iget-object p1, p0, Lcom/whoop/ui/ProgressBar;->y:Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p2

    int-to-float p2, p2

    iput p2, p1, Landroid/graphics/RectF;->left:F

    iget-object p1, p0, Lcom/whoop/ui/ProgressBar;->y:Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p3

    sub-int/2addr p2, p3

    int-to-float p2, p2

    iput p2, p1, Landroid/graphics/RectF;->right:F

    iget-object p1, p0, Lcom/whoop/ui/ProgressBar;->y:Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p2

    int-to-float p2, p2

    iput p2, p1, Landroid/graphics/RectF;->top:F

    iget-object p1, p0, Lcom/whoop/ui/ProgressBar;->y:Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p3

    sub-int/2addr p2, p3

    int-to-float p2, p2

    iput p2, p1, Landroid/graphics/RectF;->bottom:F

    invoke-direct {p0}, Lcom/whoop/ui/ProgressBar;->c()V

    return-void
.end method

.method public setHiddenPercent(F)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/ProgressBar;->z:Landroid/graphics/RectF;

    iput p1, v0, Landroid/graphics/RectF;->top:F

    invoke-direct {p0}, Lcom/whoop/ui/ProgressBar;->c()V

    return-void
.end method

.method public setLeftPercent(F)V
    .locals 1

    iget v0, p0, Lcom/whoop/ui/ProgressBar;->H:F

    rem-float/2addr p1, v0

    iget-object v0, p0, Lcom/whoop/ui/ProgressBar;->F:Landroid/graphics/RectF;

    iput p1, v0, Landroid/graphics/RectF;->left:F

    invoke-direct {p0}, Lcom/whoop/ui/ProgressBar;->d()V

    return-void
.end method

.method public setRightPercent(F)V
    .locals 1

    iget v0, p0, Lcom/whoop/ui/ProgressBar;->H:F

    rem-float/2addr p1, v0

    iget-object v0, p0, Lcom/whoop/ui/ProgressBar;->F:Landroid/graphics/RectF;

    iput p1, v0, Landroid/graphics/RectF;->right:F

    invoke-direct {p0}, Lcom/whoop/ui/ProgressBar;->d()V

    return-void
.end method
