.class public Lcom/whoop/ui/old/Battery;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private E:I

.field private F:I

.field private G:Landroid/graphics/Paint;

.field private H:Landroid/graphics/Paint;

.field private I:Landroid/graphics/Paint;

.field private J:Landroid/graphics/RectF;

.field private K:Landroid/graphics/RectF;

.field private L:Landroid/graphics/RectF;

.field private M:I

.field private N:B

.field private O:I

.field private P:I

.field private Q:Z

.field private w:I

.field private x:I

.field private y:I

.field private z:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/old/Battery;->G:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/old/Battery;->H:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/old/Battery;->I:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/old/Battery;->J:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/old/Battery;->K:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/old/Battery;->L:Landroid/graphics/RectF;

    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/whoop/ui/old/Battery;->N:B

    const/16 v1, 0x38

    invoke-static {p1, v1}, Lcn2/a;->a(Landroid/content/Context;I)I

    move-result v1

    iput v1, p0, Lcom/whoop/ui/old/Battery;->E:I

    const/16 v1, 0x12

    invoke-static {p1, v1}, Lcn2/a;->a(Landroid/content/Context;I)I

    move-result v1

    iput v1, p0, Lcom/whoop/ui/old/Battery;->F:I

    const/4 v1, 0x2

    invoke-static {p1, v1}, Lcn2/a;->a(Landroid/content/Context;I)I

    move-result v1

    iput v1, p0, Lcom/whoop/ui/old/Battery;->y:I

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    iput v1, p0, Lcom/whoop/ui/old/Battery;->z:F

    iget-object v1, p0, Lcom/whoop/ui/old/Battery;->G:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v1, p0, Lcom/whoop/ui/old/Battery;->G:Landroid/graphics/Paint;

    iget v2, p0, Lcom/whoop/ui/old/Battery;->y:I

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v1, p0, Lcom/whoop/ui/old/Battery;->G:Landroid/graphics/Paint;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setFlags(I)V

    iget-object v1, p0, Lcom/whoop/ui/old/Battery;->H:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v1, p0, Lcom/whoop/ui/old/Battery;->I:Landroid/graphics/Paint;

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v1, p0, Lcom/whoop/ui/old/Battery;->I:Landroid/graphics/Paint;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setFlags(I)V

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v1

    if-nez v1, :cond_0

    sget v0, Lvu1/a;->O:I

    invoke-static {p1, v0}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/whoop/ui/old/Battery;->setOutlineColor(I)V

    sget v0, Lvu1/a;->x:I

    invoke-static {p1, v0}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/whoop/ui/old/Battery;->O:I

    sget v0, Lvu1/a;->w:I

    invoke-static {p1, v0}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/whoop/ui/old/Battery;->P:I

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lcom/whoop/ui/old/Battery;->setOutlineColor(I)V

    const v0, -0xffff01

    iput v0, p0, Lcom/whoop/ui/old/Battery;->O:I

    const/high16 v0, -0x10000

    iput v0, p0, Lcom/whoop/ui/old/Battery;->P:I

    :goto_0
    sget-object v0, Lvu1/j;->a:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    sget p2, Lvu1/j;->e:I

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/whoop/ui/old/Battery;->Q:Z

    :goto_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p2

    if-ge v0, p2, :cond_4

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result p2

    sget v1, Lvu1/j;->d:I

    if-ne p2, v1, :cond_1

    invoke-direct {p0}, Lcom/whoop/ui/old/Battery;->getOutlineColor()I

    move-result v1

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/whoop/ui/old/Battery;->setOutlineColor(I)V

    goto :goto_2

    :cond_1
    sget v1, Lvu1/j;->b:I

    if-ne p2, v1, :cond_2

    iget v1, p0, Lcom/whoop/ui/old/Battery;->P:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/whoop/ui/old/Battery;->setBatteryColorBad(I)V

    goto :goto_2

    :cond_2
    sget v1, Lvu1/j;->c:I

    if-ne p2, v1, :cond_3

    iget v1, p0, Lcom/whoop/ui/old/Battery;->O:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/whoop/ui/old/Battery;->setBatteryColorGood(I)V

    :cond_3
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p1

    if-eqz p1, :cond_5

    const/16 p1, 0x32

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/whoop/ui/old/Battery;->setBatteryLevelPct(Ljava/lang/Byte;)V

    :cond_5
    return-void
.end method

.method private a()V
    .locals 8

    iget-object v0, p0, Lcom/whoop/ui/old/Battery;->J:Landroid/graphics/RectF;

    iget v1, p0, Lcom/whoop/ui/old/Battery;->z:F

    iget v2, p0, Lcom/whoop/ui/old/Battery;->x:I

    int-to-double v2, v2

    iget v4, p0, Lcom/whoop/ui/old/Battery;->y:I

    int-to-double v4, v4

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    mul-double/2addr v4, v6

    sub-double/2addr v2, v4

    double-to-float v2, v2

    iget v3, p0, Lcom/whoop/ui/old/Battery;->w:I

    int-to-float v3, v3

    sub-float/2addr v3, v1

    invoke-virtual {v0, v1, v1, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v0, p0, Lcom/whoop/ui/old/Battery;->K:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/whoop/ui/old/Battery;->J:Landroid/graphics/RectF;

    iget v2, v1, Landroid/graphics/RectF;->right:F

    iget v3, p0, Lcom/whoop/ui/old/Battery;->z:F

    add-float/2addr v2, v3

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v1

    iget v3, p0, Lcom/whoop/ui/old/Battery;->w:I

    div-int/lit8 v3, v3, 0xa

    int-to-float v3, v3

    sub-float/2addr v1, v3

    iget v3, p0, Lcom/whoop/ui/old/Battery;->x:I

    int-to-float v3, v3

    iget-object v4, p0, Lcom/whoop/ui/old/Battery;->J:Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/graphics/RectF;->centerY()F

    move-result v4

    iget v5, p0, Lcom/whoop/ui/old/Battery;->w:I

    div-int/lit8 v5, v5, 0xa

    int-to-float v5, v5

    add-float/2addr v4, v5

    invoke-virtual {v0, v2, v1, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v0, p0, Lcom/whoop/ui/old/Battery;->L:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/whoop/ui/old/Battery;->J:Landroid/graphics/RectF;

    iget v2, v1, Landroid/graphics/RectF;->left:F

    iget v3, p0, Lcom/whoop/ui/old/Battery;->z:F

    add-float/2addr v2, v3

    const/high16 v4, 0x3f800000    # 1.0f

    sub-float/2addr v2, v4

    iget v5, v1, Landroid/graphics/RectF;->top:F

    add-float/2addr v5, v3

    sub-float/2addr v5, v4

    iget v4, v1, Landroid/graphics/RectF;->right:F

    sub-float/2addr v4, v3

    const/high16 v6, 0x40000000    # 2.0f

    add-float/2addr v4, v6

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v1, v3

    add-float/2addr v1, v6

    invoke-virtual {v0, v2, v5, v4, v1}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v0, p0, Lcom/whoop/ui/old/Battery;->L:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->left:F

    iget v2, v0, Landroid/graphics/RectF;->right:F

    iget-byte v3, p0, Lcom/whoop/ui/old/Battery;->N:B

    int-to-float v3, v3

    const/high16 v4, 0x42c80000    # 100.0f

    div-float/2addr v3, v4

    invoke-static {v1, v2, v3}, Lx43/j;->M(FFF)F

    move-result v1

    iput v1, v0, Landroid/graphics/RectF;->right:F

    return-void
.end method

.method private getOutlineColor()I
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/old/Battery;->G:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    return v0
.end method

.method private setIsGoodLevel(Z)V
    .locals 1

    if-eqz p1, :cond_0

    iget p1, p0, Lcom/whoop/ui/old/Battery;->O:I

    goto :goto_0

    :cond_0
    iget p1, p0, Lcom/whoop/ui/old/Battery;->P:I

    :goto_0
    iget-object v0, p0, Lcom/whoop/ui/old/Battery;->I:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    iget-boolean v0, p0, Lcom/whoop/ui/old/Battery;->Q:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/whoop/ui/old/Battery;->setOutlineColor(I)V

    :cond_1
    return-void
.end method


# virtual methods
.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    iget-byte v0, p0, Lcom/whoop/ui/old/Battery;->N:B

    if-ltz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/ui/old/Battery;->L:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/whoop/ui/old/Battery;->I:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    :cond_0
    iget-object v0, p0, Lcom/whoop/ui/old/Battery;->J:Landroid/graphics/RectF;

    iget v1, p0, Lcom/whoop/ui/old/Battery;->M:I

    int-to-float v2, v1

    int-to-float v1, v1

    iget-object v3, p0, Lcom/whoop/ui/old/Battery;->G:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/whoop/ui/old/Battery;->K:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/whoop/ui/old/Battery;->G:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    move-object p1, p0

    sub-int/2addr p4, p2

    iput p4, p1, Lcom/whoop/ui/old/Battery;->x:I

    sub-int/2addr p5, p3

    iput p5, p1, Lcom/whoop/ui/old/Battery;->w:I

    div-int/lit8 p5, p5, 0x8

    iput p5, p1, Lcom/whoop/ui/old/Battery;->M:I

    invoke-direct {p0}, Lcom/whoop/ui/old/Battery;->a()V

    return-void
.end method

.method public onMeasure(II)V
    .locals 4

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    const/high16 v2, -0x80000000

    const/high16 v3, 0x40000000    # 2.0f

    if-ne v0, v3, :cond_0

    iput p1, p0, Lcom/whoop/ui/old/Battery;->x:I

    goto :goto_0

    :cond_0
    if-ne v0, v2, :cond_1

    iget v0, p0, Lcom/whoop/ui/old/Battery;->E:I

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lcom/whoop/ui/old/Battery;->x:I

    goto :goto_0

    :cond_1
    iget p1, p0, Lcom/whoop/ui/old/Battery;->E:I

    iput p1, p0, Lcom/whoop/ui/old/Battery;->x:I

    :goto_0
    if-ne v1, v3, :cond_2

    iput p2, p0, Lcom/whoop/ui/old/Battery;->w:I

    goto :goto_1

    :cond_2
    if-ne v1, v2, :cond_3

    iget p1, p0, Lcom/whoop/ui/old/Battery;->F:I

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lcom/whoop/ui/old/Battery;->w:I

    goto :goto_1

    :cond_3
    iget p1, p0, Lcom/whoop/ui/old/Battery;->F:I

    iput p1, p0, Lcom/whoop/ui/old/Battery;->w:I

    :goto_1
    iget p1, p0, Lcom/whoop/ui/old/Battery;->x:I

    iget p2, p0, Lcom/whoop/ui/old/Battery;->w:I

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public setBatteryColorBad(I)V
    .locals 0

    iput p1, p0, Lcom/whoop/ui/old/Battery;->P:I

    iget-byte p1, p0, Lcom/whoop/ui/old/Battery;->N:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/whoop/ui/old/Battery;->setBatteryLevelPct(Ljava/lang/Byte;)V

    return-void
.end method

.method public setBatteryColorGood(I)V
    .locals 0

    iput p1, p0, Lcom/whoop/ui/old/Battery;->O:I

    iget-byte p1, p0, Lcom/whoop/ui/old/Battery;->N:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/whoop/ui/old/Battery;->setBatteryLevelPct(Ljava/lang/Byte;)V

    return-void
.end method

.method public setBatteryLevelPct(Ljava/lang/Byte;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    move-result v0

    invoke-static {v0}, Lkk0/a;->i(B)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, Lcom/whoop/ui/old/Battery;->setIsGoodLevel(Z)V

    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    move-result p1

    iput-byte p1, p0, Lcom/whoop/ui/old/Battery;->N:B

    invoke-direct {p0}, Lcom/whoop/ui/old/Battery;->a()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setOutlineColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/old/Battery;->G:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/whoop/ui/old/Battery;->H:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public setOutlineColorResource(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/whoop/ui/old/Battery;->setOutlineColor(I)V

    return-void
.end method

.method public setOutlineWithFillColor(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/whoop/ui/old/Battery;->Q:Z

    iget-byte p1, p0, Lcom/whoop/ui/old/Battery;->N:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/whoop/ui/old/Battery;->setBatteryLevelPct(Ljava/lang/Byte;)V

    return-void
.end method
