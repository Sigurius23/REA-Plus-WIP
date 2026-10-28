.class public Lcom/whoop/ui/ProgressDial;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private E:Landroid/graphics/Paint;

.field private F:I

.field private G:I

.field private H:Z

.field private I:Z

.field protected J:Landroid/graphics/RectF;

.field protected K:F

.field private L:F

.field private M:F

.field protected N:F

.field private O:F

.field private P:Landroid/graphics/Matrix;

.field private Q:Z

.field private R:Landroid/graphics/Paint;

.field private w:Landroid/graphics/Paint;

.field private x:Landroid/graphics/Paint;

.field private y:Landroid/graphics/Paint;

.field private z:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/whoop/ui/ProgressDial;->H:Z

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/whoop/ui/ProgressDial;->I:Z

    .line 4
    iput-boolean v0, p0, Lcom/whoop/ui/ProgressDial;->Q:Z

    .line 5
    sget-object v0, Lvu1/j;->y:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 6
    invoke-direct {p0, p1}, Lcom/whoop/ui/ProgressDial;->a(Landroid/content/res/TypedArray;)V

    .line 7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 8
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lcom/whoop/ui/ProgressDial;->H:Z

    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lcom/whoop/ui/ProgressDial;->I:Z

    .line 11
    iput-boolean v0, p0, Lcom/whoop/ui/ProgressDial;->Q:Z

    .line 12
    sget-object v1, Lvu1/j;->y:[I

    .line 13
    invoke-virtual {p1, p2, v1, p3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 14
    invoke-direct {p0, p1}, Lcom/whoop/ui/ProgressDial;->a(Landroid/content/res/TypedArray;)V

    .line 15
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private a(Landroid/content/res/TypedArray;)V
    .locals 5

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/ProgressDial;->J:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/ProgressDial;->w:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFlags(I)V

    iget-object v0, p0, Lcom/whoop/ui/ProgressDial;->w:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/ProgressDial;->x:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFlags(I)V

    iget-object v0, p0, Lcom/whoop/ui/ProgressDial;->x:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/ProgressDial;->E:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFlags(I)V

    iget-object v0, p0, Lcom/whoop/ui/ProgressDial;->E:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/ProgressDial;->z:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFlags(I)V

    iget-object v0, p0, Lcom/whoop/ui/ProgressDial;->z:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lcom/whoop/ui/ProgressDial;->z:Landroid/graphics/Paint;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lvu1/a;->u:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/whoop/ui/ProgressDial;->z:Landroid/graphics/Paint;

    const/high16 v3, 0x41200000    # 10.0f

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/ProgressDial;->R:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFlags(I)V

    iget-object v0, p0, Lcom/whoop/ui/ProgressDial;->R:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lcom/whoop/ui/ProgressDial;->R:Landroid/graphics/Paint;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v4, Lvu1/a;->y:I

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/whoop/ui/ProgressDial;->R:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/ProgressDial;->P:Landroid/graphics/Matrix;

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const v0, 0x3f2147ae    # 0.63f

    iput v0, p0, Lcom/whoop/ui/ProgressDial;->M:F

    const v0, 0x3f333333    # 0.7f

    iput v0, p0, Lcom/whoop/ui/ProgressDial;->N:F

    const/16 v0, 0x93

    const/16 v3, 0xe7

    invoke-static {v2, v0, v3}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/whoop/ui/ProgressDial;->setFillColor(I)V

    const/16 v0, 0x33

    const/16 v3, 0x3a

    const/16 v4, 0x27

    invoke-static {v4, v0, v3}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/whoop/ui/ProgressDial;->setEmptyColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/high16 v3, 0x40400000    # 3.0f

    invoke-static {v1, v3, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/whoop/ui/ProgressDial;->setThickness(F)V

    const/high16 v0, 0x40a00000    # 5.0f

    invoke-virtual {p0, v0}, Lcom/whoop/ui/ProgressDial;->setGapLength(F)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v3, Lvu1/b;->h:I

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/whoop/ui/ProgressDial;->setThickness(F)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v3, Lvu1/f;->b:I

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lcom/whoop/ui/ProgressDial;->setGapLength(F)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v3, Lvu1/a;->J:I

    invoke-static {v0, v3}, Lin2/j;->c(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/whoop/ui/ProgressDial;->setFillColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v3, Lvu1/a;->K:I

    invoke-static {v0, v3}, Lin2/j;->c(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/whoop/ui/ProgressDial;->setEmptyColor(I)V

    :goto_0
    if-eqz p1, :cond_2

    sget v0, Lvu1/j;->A:I

    invoke-virtual {p0}, Lcom/whoop/ui/ProgressDial;->getFillColor()I

    move-result v3

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/whoop/ui/ProgressDial;->setFillColor(I)V

    sget v0, Lvu1/j;->G:I

    invoke-virtual {p0}, Lcom/whoop/ui/ProgressDial;->getFillColor()I

    move-result v3

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/whoop/ui/ProgressDial;->setFillStartColor(I)V

    sget v0, Lvu1/j;->D:I

    invoke-virtual {p0}, Lcom/whoop/ui/ProgressDial;->getFillColor()I

    move-result v3

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/whoop/ui/ProgressDial;->setFillEndColor(I)V

    sget v0, Lvu1/j;->C:I

    invoke-virtual {p0}, Lcom/whoop/ui/ProgressDial;->getEmptyColor()I

    move-result v3

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/whoop/ui/ProgressDial;->setEmptyColor(I)V

    sget v0, Lvu1/j;->B:I

    iget-boolean v3, p0, Lcom/whoop/ui/ProgressDial;->H:Z

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/whoop/ui/ProgressDial;->setDrawEmptyArc(Z)V

    sget v0, Lvu1/j;->H:I

    invoke-virtual {p0}, Lcom/whoop/ui/ProgressDial;->getThickness()F

    move-result v3

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/whoop/ui/ProgressDial;->setThickness(F)V

    sget v0, Lvu1/j;->E:I

    invoke-virtual {p0}, Lcom/whoop/ui/ProgressDial;->getGapLength()F

    move-result v3

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/whoop/ui/ProgressDial;->setGapLength(F)V

    sget v0, Lvu1/j;->I:I

    invoke-virtual {p0}, Lcom/whoop/ui/ProgressDial;->getEmptyGoalColor()I

    move-result v3

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/whoop/ui/ProgressDial;->setEmptyGoalColor(I)V

    sget v0, Lvu1/j;->z:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lvu1/j;->z:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/whoop/ui/ProgressDial;->setBackgroundColor(I)V

    :cond_1
    sget v0, Lvu1/j;->F:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_2

    sget v0, Lvu1/j;->F:I

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p1

    iput p1, p0, Lcom/whoop/ui/ProgressDial;->M:F

    :cond_2
    const/4 p1, 0x0

    invoke-virtual {p0, v1, p1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 4

    iget v0, p0, Lcom/whoop/ui/ProgressDial;->F:I

    iget v1, p0, Lcom/whoop/ui/ProgressDial;->G:I

    if-ne v0, v1, :cond_0

    iget-object v1, p0, Lcom/whoop/ui/ProgressDial;->w:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/whoop/ui/ProgressDial;->w:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-void

    :cond_0
    new-instance v0, Landroid/graphics/SweepGradient;

    iget v1, p0, Lcom/whoop/ui/ProgressDial;->F:I

    iget v2, p0, Lcom/whoop/ui/ProgressDial;->G:I

    const/4 v3, 0x0

    invoke-direct {v0, v3, v3, v1, v2}, Landroid/graphics/SweepGradient;-><init>(FFII)V

    iget-object v1, p0, Lcom/whoop/ui/ProgressDial;->P:Landroid/graphics/Matrix;

    invoke-virtual {v1}, Landroid/graphics/Matrix;->reset()V

    iget-object v1, p0, Lcom/whoop/ui/ProgressDial;->P:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Shader;->getLocalMatrix(Landroid/graphics/Matrix;)Z

    iget-object v1, p0, Lcom/whoop/ui/ProgressDial;->P:Landroid/graphics/Matrix;

    const/high16 v2, -0x3d4c0000    # -90.0f

    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postRotate(F)Z

    iget-object v1, p0, Lcom/whoop/ui/ProgressDial;->P:Landroid/graphics/Matrix;

    iget-object v2, p0, Lcom/whoop/ui/ProgressDial;->J:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->centerX()F

    move-result v2

    iget-object v3, p0, Lcom/whoop/ui/ProgressDial;->J:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->centerY()F

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    iget-object v1, p0, Lcom/whoop/ui/ProgressDial;->P:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    iget-object v1, p0, Lcom/whoop/ui/ProgressDial;->w:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-void
.end method

.method public c()V
    .locals 4

    invoke-virtual {p0}, Lcom/whoop/ui/ProgressDial;->d()Z

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/whoop/ui/ProgressDial;->Q:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/whoop/ui/ProgressDial;->K:F

    div-float/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/ui/ProgressDial;->J:Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v2, v0

    iput v2, v1, Landroid/graphics/RectF;->left:F

    iget-object v1, p0, Lcom/whoop/ui/ProgressDial;->J:Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v2, v0

    iput v2, v1, Landroid/graphics/RectF;->top:F

    iget-object v1, p0, Lcom/whoop/ui/ProgressDial;->J:Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v2, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v2, v3

    iput v2, v1, Landroid/graphics/RectF;->right:F

    iget-object v1, p0, Lcom/whoop/ui/ProgressDial;->J:Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v2, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr v2, v0

    iput v2, v1, Landroid/graphics/RectF;->bottom:F

    goto :goto_1

    :cond_1
    :goto_0
    iget v0, p0, Lcom/whoop/ui/ProgressDial;->K:F

    div-float/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/ui/ProgressDial;->J:Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v2, v0

    iget v3, p0, Lcom/whoop/ui/ProgressDial;->O:F

    add-float/2addr v2, v3

    iput v2, v1, Landroid/graphics/RectF;->left:F

    iget-object v1, p0, Lcom/whoop/ui/ProgressDial;->J:Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v2, v0

    iget v3, p0, Lcom/whoop/ui/ProgressDial;->O:F

    add-float/2addr v2, v3

    iput v2, v1, Landroid/graphics/RectF;->top:F

    iget-object v1, p0, Lcom/whoop/ui/ProgressDial;->J:Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v2, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v2, v3

    iget v3, p0, Lcom/whoop/ui/ProgressDial;->O:F

    sub-float/2addr v2, v3

    iput v2, v1, Landroid/graphics/RectF;->right:F

    iget-object v1, p0, Lcom/whoop/ui/ProgressDial;->J:Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v2, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr v2, v0

    iget v0, p0, Lcom/whoop/ui/ProgressDial;->O:F

    sub-float/2addr v2, v0

    iput v2, v1, Landroid/graphics/RectF;->bottom:F

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/ui/ProgressDial;->b()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/ui/ProgressDial;->I:Z

    return v0
.end method

.method public getDrawEmptyArc()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/ui/ProgressDial;->H:Z

    return v0
.end method

.method public getDrawRect()Landroid/graphics/RectF;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/ProgressDial;->J:Landroid/graphics/RectF;

    return-object v0
.end method

.method public getEmptyColor()I
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/ProgressDial;->x:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    return v0
.end method

.method public getEmptyGoalColor()I
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/ProgressDial;->E:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    return v0
.end method

.method public getFillColor()I
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/ProgressDial;->w:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    return v0
.end method

.method public getFillEndColor()I
    .locals 1

    iget v0, p0, Lcom/whoop/ui/ProgressDial;->G:I

    return v0
.end method

.method public getFillStartColor()I
    .locals 1

    iget v0, p0, Lcom/whoop/ui/ProgressDial;->F:I

    return v0
.end method

.method public getGapLength()F
    .locals 1

    iget v0, p0, Lcom/whoop/ui/ProgressDial;->L:F

    return v0
.end method

.method public getMeasuredInnerDiameter()F
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, p0, Lcom/whoop/ui/ProgressDial;->K:F

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    return v0
.end method

.method public getProgress()F
    .locals 1

    iget v0, p0, Lcom/whoop/ui/ProgressDial;->M:F

    return v0
.end method

.method public getThickness()F
    .locals 1

    iget v0, p0, Lcom/whoop/ui/ProgressDial;->K:F

    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 19

    move-object/from16 v0, p0

    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget v1, v0, Lcom/whoop/ui/ProgressDial;->N:F

    const/high16 v2, 0x43b40000    # 360.0f

    mul-float v6, v1, v2

    iget-object v12, v0, Lcom/whoop/ui/ProgressDial;->y:Landroid/graphics/Paint;

    if-eqz v12, :cond_0

    iget-object v8, v0, Lcom/whoop/ui/ProgressDial;->J:Landroid/graphics/RectF;

    const/high16 v10, 0x43b40000    # 360.0f

    const/4 v11, 0x1

    const/4 v9, 0x0

    move-object/from16 v7, p1

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    :cond_0
    iget v1, v0, Lcom/whoop/ui/ProgressDial;->M:F

    const/4 v9, 0x0

    cmpl-float v1, v1, v9

    const/high16 v10, 0x40000000    # 2.0f

    const/high16 v11, 0x3f800000    # 1.0f

    const/high16 v12, 0x42b40000    # 90.0f

    if-nez v1, :cond_2

    iget-boolean v1, v0, Lcom/whoop/ui/ProgressDial;->H:Z

    if-eqz v1, :cond_1

    iget-object v14, v0, Lcom/whoop/ui/ProgressDial;->J:Landroid/graphics/RectF;

    const/16 v17, 0x0

    iget-object v1, v0, Lcom/whoop/ui/ProgressDial;->x:Landroid/graphics/Paint;

    const/high16 v15, -0x3d4c0000    # -90.0f

    const/high16 v16, 0x43b40000    # 360.0f

    move-object/from16 v13, p1

    move-object/from16 v18, v1

    invoke-virtual/range {v13 .. v18}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/ui/ProgressDial;->d()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v4, v0, Lcom/whoop/ui/ProgressDial;->J:Landroid/graphics/RectF;

    const/4 v7, 0x0

    iget-object v8, v0, Lcom/whoop/ui/ProgressDial;->E:Landroid/graphics/Paint;

    const/high16 v5, -0x3d4c0000    # -90.0f

    move-object/from16 v3, p1

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lcom/whoop/ui/ProgressDial;->d()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v4, v0, Lcom/whoop/ui/ProgressDial;->J:Landroid/graphics/RectF;

    const/4 v7, 0x0

    iget-object v8, v0, Lcom/whoop/ui/ProgressDial;->E:Landroid/graphics/Paint;

    const/high16 v5, -0x3d4c0000    # -90.0f

    move-object/from16 v3, p1

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    :cond_3
    iget v1, v0, Lcom/whoop/ui/ProgressDial;->M:F

    mul-float v16, v1, v2

    iget-object v14, v0, Lcom/whoop/ui/ProgressDial;->J:Landroid/graphics/RectF;

    const/16 v17, 0x0

    iget-object v1, v0, Lcom/whoop/ui/ProgressDial;->w:Landroid/graphics/Paint;

    const/high16 v15, -0x3d4c0000    # -90.0f

    move-object/from16 v13, p1

    move-object/from16 v18, v1

    invoke-virtual/range {v13 .. v18}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget-boolean v1, v0, Lcom/whoop/ui/ProgressDial;->H:Z

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Lcom/whoop/ui/ProgressDial;->d()Z

    move-result v1

    if-nez v1, :cond_4

    iget v1, v0, Lcom/whoop/ui/ProgressDial;->M:F

    sub-float v1, v11, v1

    mul-float/2addr v1, v2

    iget v3, v0, Lcom/whoop/ui/ProgressDial;->L:F

    mul-float v4, v3, v10

    sub-float/2addr v1, v4

    cmpl-float v4, v1, v9

    if-lez v4, :cond_4

    sub-float v16, v16, v12

    add-float v15, v16, v3

    iget-object v14, v0, Lcom/whoop/ui/ProgressDial;->J:Landroid/graphics/RectF;

    const/16 v17, 0x0

    iget-object v3, v0, Lcom/whoop/ui/ProgressDial;->x:Landroid/graphics/Paint;

    move-object/from16 v13, p1

    move/from16 v16, v1

    move-object/from16 v18, v3

    invoke-virtual/range {v13 .. v18}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    :cond_4
    :goto_0
    invoke-virtual {v0}, Lcom/whoop/ui/ProgressDial;->d()Z

    move-result v1

    if-eqz v1, :cond_6

    iget v1, v0, Lcom/whoop/ui/ProgressDial;->N:F

    mul-float v3, v1, v2

    sub-float/2addr v11, v1

    mul-float/2addr v11, v2

    iget v1, v0, Lcom/whoop/ui/ProgressDial;->L:F

    mul-float/2addr v10, v1

    sub-float v16, v11, v10

    cmpl-float v4, v16, v9

    if-lez v4, :cond_5

    sub-float/2addr v3, v12

    add-float v15, v3, v1

    iget-object v14, v0, Lcom/whoop/ui/ProgressDial;->J:Landroid/graphics/RectF;

    const/16 v17, 0x0

    iget-object v1, v0, Lcom/whoop/ui/ProgressDial;->x:Landroid/graphics/Paint;

    move-object/from16 v13, p1

    move-object/from16 v18, v1

    invoke-virtual/range {v13 .. v18}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    :cond_5
    iget-object v14, v0, Lcom/whoop/ui/ProgressDial;->J:Landroid/graphics/RectF;

    sub-float v15, v6, v12

    const/16 v17, 0x0

    iget-object v1, v0, Lcom/whoop/ui/ProgressDial;->z:Landroid/graphics/Paint;

    const/high16 v16, 0x3f800000    # 1.0f

    move-object/from16 v13, p1

    move-object/from16 v18, v1

    invoke-virtual/range {v13 .. v18}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget-boolean v1, v0, Lcom/whoop/ui/ProgressDial;->Q:Z

    if-eqz v1, :cond_6

    iget v1, v0, Lcom/whoop/ui/ProgressDial;->M:F

    mul-float/2addr v1, v2

    iget-object v14, v0, Lcom/whoop/ui/ProgressDial;->J:Landroid/graphics/RectF;

    sub-float v15, v1, v12

    const/16 v17, 0x0

    iget-object v1, v0, Lcom/whoop/ui/ProgressDial;->R:Landroid/graphics/Paint;

    const/high16 v16, 0x3f800000    # 1.0f

    move-object/from16 v13, p1

    move-object/from16 v18, v1

    invoke-virtual/range {v13 .. v18}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    :cond_6
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    invoke-virtual {p0}, Lcom/whoop/ui/ProgressDial;->c()V

    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/ProgressDial;->y:Landroid/graphics/Paint;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/ProgressDial;->y:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFlags(I)V

    iget-object v0, p0, Lcom/whoop/ui/ProgressDial;->y:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lcom/whoop/ui/ProgressDial;->y:Landroid/graphics/Paint;

    iget v1, p0, Lcom/whoop/ui/ProgressDial;->K:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    :cond_0
    iget-object v0, p0, Lcom/whoop/ui/ProgressDial;->y:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setBackgroundColorResource(I)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lin2/j;->c(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/whoop/ui/ProgressDial;->setBackgroundColor(I)V

    :cond_0
    return-void
.end method

.method public setDrawEmptyArc(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/whoop/ui/ProgressDial;->H:Z

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setDrawGoalLine(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/whoop/ui/ProgressDial;->I:Z

    return-void
.end method

.method public setEmptyColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/ProgressDial;->x:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setEmptyGoalColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/ProgressDial;->E:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setFillColor(I)V
    .locals 0

    iput p1, p0, Lcom/whoop/ui/ProgressDial;->F:I

    iput p1, p0, Lcom/whoop/ui/ProgressDial;->G:I

    invoke-virtual {p0}, Lcom/whoop/ui/ProgressDial;->b()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setFillColorResource(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lin2/j;->c(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/whoop/ui/ProgressDial;->setFillColor(I)V

    return-void
.end method

.method public setFillEndColor(I)V
    .locals 0

    iput p1, p0, Lcom/whoop/ui/ProgressDial;->G:I

    invoke-virtual {p0}, Lcom/whoop/ui/ProgressDial;->b()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setFillStartColor(I)V
    .locals 0

    iput p1, p0, Lcom/whoop/ui/ProgressDial;->F:I

    invoke-virtual {p0}, Lcom/whoop/ui/ProgressDial;->b()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setGapLength(F)V
    .locals 0

    iput p1, p0, Lcom/whoop/ui/ProgressDial;->L:F

    invoke-virtual {p0}, Lcom/whoop/ui/ProgressDial;->c()V

    return-void
.end method

.method public setGoalMargin(F)V
    .locals 0

    iput p1, p0, Lcom/whoop/ui/ProgressDial;->O:F

    return-void
.end method

.method public setGoalPct(F)V
    .locals 0
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iput p1, p0, Lcom/whoop/ui/ProgressDial;->N:F

    return-void
.end method

.method public setProgress(F)V
    .locals 0
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iput p1, p0, Lcom/whoop/ui/ProgressDial;->M:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setThickness(F)V
    .locals 1

    iput p1, p0, Lcom/whoop/ui/ProgressDial;->K:F

    iget-object v0, p0, Lcom/whoop/ui/ProgressDial;->w:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, Lcom/whoop/ui/ProgressDial;->x:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, Lcom/whoop/ui/ProgressDial;->z:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, Lcom/whoop/ui/ProgressDial;->R:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, Lcom/whoop/ui/ProgressDial;->E:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, Lcom/whoop/ui/ProgressDial;->y:Landroid/graphics/Paint;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/ui/ProgressDial;->c()V

    return-void
.end method
