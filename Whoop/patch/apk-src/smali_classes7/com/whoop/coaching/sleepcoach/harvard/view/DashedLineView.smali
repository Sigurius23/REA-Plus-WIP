.class public Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private E:F

.field private F:I

.field private G:I

.field private H:I

.field private I:I

.field private J:Z

.field private w:Landroid/graphics/Paint;

.field private final x:[F

.field private y:I

.field private z:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x2

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->x:[F

    sget-object v0, Lqe2/h;->a:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->a(Landroid/content/res/TypedArray;)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private a(Landroid/content/res/TypedArray;)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->w:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->J:Z

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lvu1/a;->d0:I

    invoke-static {v0, v1}, Lin2/j;->c(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->y:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lqe2/c;->b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    iput v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->z:F

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lqe2/c;->a:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    iput v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->E:F

    goto :goto_0

    :cond_0
    const/16 v0, -0x100

    iput v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->y:I

    const/high16 v0, 0x40c00000    # 6.0f

    iput v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->z:F

    iput v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->E:F

    :goto_0
    if-eqz p1, :cond_1

    sget v0, Lqe2/h;->b:I

    iget v1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->y:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->y:I

    sget v0, Lqe2/h;->e:I

    iget v1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->z:F

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->z:F

    sget v0, Lqe2/h;->c:I

    iget v1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->E:F

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->E:F

    sget v0, Lqe2/h;->d:I

    iget-boolean v1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->J:Z

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->J:Z

    :cond_1
    invoke-direct {p0}, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->b()V

    return-void
.end method

.method private b()V
    .locals 6

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->x:[F

    const/4 v1, 0x0

    iget v2, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->z:F

    aput v2, v0, v1

    const/4 v1, 0x1

    iget v2, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->E:F

    aput v2, v0, v1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->w:Landroid/graphics/Paint;

    iget-boolean v1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->J:Z

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    :goto_0
    int-to-float v1, v1

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    goto :goto_0

    :goto_1
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->w:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/DashPathEffect;

    iget-object v2, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->x:[F

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->w:Landroid/graphics/Paint;

    iget v1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->y:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-boolean v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->J:Z

    const/high16 v1, 0x40000000    # 2.0f

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->G:I

    iput v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->F:I

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v0, v2

    int-to-float v0, v0

    iget v2, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->z:F

    cmpl-float v3, v0, v2

    if-lez v3, :cond_1

    iget v3, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->E:F

    add-float/2addr v3, v2

    sub-float/2addr v0, v2

    div-float v2, v0, v3

    float-to-double v4, v2

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    double-to-int v2, v4

    int-to-float v2, v2

    mul-float/2addr v2, v3

    sub-float/2addr v0, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v0, v1

    add-float/2addr v2, v0

    float-to-int v1, v2

    iput v1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->H:I

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    sub-float/2addr v1, v0

    float-to-int v0, v1

    iput v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->I:I

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    iput v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->H:I

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->I:I

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->I:I

    iput v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->H:I

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    sub-int/2addr v0, v2

    int-to-float v0, v0

    iget v2, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->z:F

    cmpl-float v3, v0, v2

    if-lez v3, :cond_3

    iget v3, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->E:F

    add-float/2addr v3, v2

    sub-float/2addr v0, v2

    div-float v2, v0, v3

    float-to-double v4, v2

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    double-to-int v2, v4

    int-to-float v2, v2

    mul-float/2addr v2, v3

    sub-float/2addr v0, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v0, v1

    add-float/2addr v2, v0

    float-to-int v1, v2

    iput v1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->F:I

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    sub-float/2addr v1, v0

    float-to-int v0, v1

    iput v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->G:I

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    iput v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->F:I

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->G:I

    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method


# virtual methods
.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 7

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->F:I

    int-to-float v2, v0

    iget v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->H:I

    int-to-float v3, v0

    iget v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->G:I

    int-to-float v4, v0

    iget v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->I:I

    int-to-float v5, v0

    iget-object v6, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->w:Landroid/graphics/Paint;

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    invoke-direct {p0}, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->b()V

    return-void
.end method

.method public setLineColor(I)V
    .locals 0

    iput p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->y:I

    invoke-direct {p0}, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->b()V

    return-void
.end method

.method public setLineColorResource(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/whoop/coaching/sleepcoach/harvard/view/DashedLineView;->setLineColor(I)V

    return-void
.end method
