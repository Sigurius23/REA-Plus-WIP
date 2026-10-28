.class public Lcom/whoop/ui/ProgressDialLayout;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/ui/ProgressDialLayout$a;
    }
.end annotation


# instance fields
.field private w:Lcom/whoop/ui/ProgressDialLayout$a;

.field private x:Z

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whoop/ui/ProgressDialLayout;->x:Z

    sget-object v0, Lvu1/j;->J:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/ui/ProgressDialLayout;->b(Landroid/content/res/TypedArray;)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private a(Landroid/view/View;)Z
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/ProgressDialLayout;->w:Lcom/whoop/ui/ProgressDialLayout$a;

    if-eqz v0, :cond_0

    iget-object v1, v0, Lcom/whoop/ui/ProgressDialLayout$a;->a:Lcom/whoop/ui/ProgressDial;

    if-eq p1, v1, :cond_0

    iget-object v0, v0, Lcom/whoop/ui/ProgressDialLayout$a;->b:Landroid/view/ViewGroup;

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private b(Landroid/content/res/TypedArray;)V
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lvu1/g;->b:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    new-instance v0, Lcom/whoop/ui/ProgressDialLayout$a;

    invoke-direct {v0, p0}, Lcom/whoop/ui/ProgressDialLayout$a;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Lcom/whoop/ui/ProgressDialLayout;->w:Lcom/whoop/ui/ProgressDialLayout$a;

    if-eqz p1, :cond_3

    iget-object v0, v0, Lcom/whoop/ui/ProgressDialLayout$a;->a:Lcom/whoop/ui/ProgressDial;

    sget v1, Lvu1/j;->U:I

    invoke-virtual {v0}, Lcom/whoop/ui/ProgressDial;->getThickness()F

    move-result v2

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/whoop/ui/ProgressDial;->setThickness(F)V

    iget-object v0, p0, Lcom/whoop/ui/ProgressDialLayout;->w:Lcom/whoop/ui/ProgressDialLayout$a;

    iget-object v0, v0, Lcom/whoop/ui/ProgressDialLayout$a;->a:Lcom/whoop/ui/ProgressDial;

    sget v1, Lvu1/j;->L:I

    invoke-virtual {v0}, Lcom/whoop/ui/ProgressDial;->getFillColor()I

    move-result v2

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/whoop/ui/ProgressDial;->setFillColor(I)V

    iget-object v0, p0, Lcom/whoop/ui/ProgressDialLayout;->w:Lcom/whoop/ui/ProgressDialLayout$a;

    iget-object v0, v0, Lcom/whoop/ui/ProgressDialLayout$a;->a:Lcom/whoop/ui/ProgressDial;

    sget v1, Lvu1/j;->T:I

    invoke-virtual {v0}, Lcom/whoop/ui/ProgressDial;->getFillStartColor()I

    move-result v2

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/whoop/ui/ProgressDial;->setFillStartColor(I)V

    iget-object v0, p0, Lcom/whoop/ui/ProgressDialLayout;->w:Lcom/whoop/ui/ProgressDialLayout$a;

    iget-object v0, v0, Lcom/whoop/ui/ProgressDialLayout$a;->a:Lcom/whoop/ui/ProgressDial;

    sget v1, Lvu1/j;->Q:I

    invoke-virtual {v0}, Lcom/whoop/ui/ProgressDial;->getFillEndColor()I

    move-result v2

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/whoop/ui/ProgressDial;->setFillEndColor(I)V

    iget-object v0, p0, Lcom/whoop/ui/ProgressDialLayout;->w:Lcom/whoop/ui/ProgressDialLayout$a;

    iget-object v0, v0, Lcom/whoop/ui/ProgressDialLayout$a;->a:Lcom/whoop/ui/ProgressDial;

    sget v1, Lvu1/j;->P:I

    invoke-virtual {v0}, Lcom/whoop/ui/ProgressDial;->getEmptyColor()I

    move-result v2

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/whoop/ui/ProgressDial;->setEmptyColor(I)V

    iget-object v0, p0, Lcom/whoop/ui/ProgressDialLayout;->w:Lcom/whoop/ui/ProgressDialLayout$a;

    iget-object v0, v0, Lcom/whoop/ui/ProgressDialLayout$a;->a:Lcom/whoop/ui/ProgressDial;

    sget v1, Lvu1/j;->O:I

    invoke-virtual {v0}, Lcom/whoop/ui/ProgressDial;->getDrawEmptyArc()Z

    move-result v2

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/whoop/ui/ProgressDial;->setDrawEmptyArc(Z)V

    iget-object v0, p0, Lcom/whoop/ui/ProgressDialLayout;->w:Lcom/whoop/ui/ProgressDialLayout$a;

    iget-object v0, v0, Lcom/whoop/ui/ProgressDialLayout$a;->a:Lcom/whoop/ui/ProgressDial;

    sget v1, Lvu1/j;->R:I

    invoke-virtual {v0}, Lcom/whoop/ui/ProgressDial;->getGapLength()F

    move-result v2

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/whoop/ui/ProgressDial;->setGapLength(F)V

    sget v0, Lvu1/j;->K:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/ui/ProgressDialLayout;->w:Lcom/whoop/ui/ProgressDialLayout$a;

    iget-object v0, v0, Lcom/whoop/ui/ProgressDialLayout$a;->a:Lcom/whoop/ui/ProgressDial;

    sget v2, Lvu1/j;->K:I

    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/whoop/ui/ProgressDial;->setBackgroundColor(I)V

    :cond_0
    sget v0, Lvu1/j;->N:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lvu1/j;->N:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/whoop/ui/ProgressDialLayout;->y:I

    :cond_1
    sget v0, Lvu1/j;->M:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_2

    sget v0, Lvu1/j;->M:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/whoop/ui/ProgressDialLayout;->z:I

    :cond_2
    sget v0, Lvu1/j;->S:I

    iget-boolean v1, p0, Lcom/whoop/ui/ProgressDialLayout;->x:Z

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/whoop/ui/ProgressDialLayout;->setMeasureInside(Z)V

    :cond_3
    return-void
.end method


# virtual methods
.method public addView(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/whoop/ui/ProgressDialLayout;->a(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/whoop/ui/ProgressDialLayout;->w:Lcom/whoop/ui/ProgressDialLayout$a;

    iget-object v0, v0, Lcom/whoop/ui/ProgressDialLayout$a;->b:Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void

    .line 3
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public addView(Landroid/view/View;I)V
    .locals 1

    .line 4
    invoke-direct {p0, p1}, Lcom/whoop/ui/ProgressDialLayout;->a(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    iget-object p2, p0, Lcom/whoop/ui/ProgressDialLayout;->w:Lcom/whoop/ui/ProgressDialLayout$a;

    iget-object p2, p2, Lcom/whoop/ui/ProgressDialLayout$a;->b:Landroid/view/ViewGroup;

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void

    .line 6
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public addView(Landroid/view/View;II)V
    .locals 1

    .line 13
    invoke-direct {p0, p1}, Lcom/whoop/ui/ProgressDialLayout;->a(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 14
    iget-object v0, p0, Lcom/whoop/ui/ProgressDialLayout;->w:Lcom/whoop/ui/ProgressDialLayout$a;

    iget-object v0, v0, Lcom/whoop/ui/ProgressDialLayout$a;->b:Landroid/view/ViewGroup;

    invoke-virtual {v0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    return-void

    .line 15
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    return-void
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 7
    invoke-direct {p0, p1}, Lcom/whoop/ui/ProgressDialLayout;->a(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    iget-object p2, p0, Lcom/whoop/ui/ProgressDialLayout;->w:Lcom/whoop/ui/ProgressDialLayout$a;

    iget-object p2, p2, Lcom/whoop/ui/ProgressDialLayout$a;->b:Landroid/view/ViewGroup;

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void

    .line 9
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 10
    invoke-direct {p0, p1}, Lcom/whoop/ui/ProgressDialLayout;->a(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 11
    iget-object p2, p0, Lcom/whoop/ui/ProgressDialLayout;->w:Lcom/whoop/ui/ProgressDialLayout$a;

    iget-object p2, p2, Lcom/whoop/ui/ProgressDialLayout$a;->b:Landroid/view/ViewGroup;

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void

    .line 12
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public getProgressDial()Lcom/whoop/ui/ProgressDial;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/ProgressDialLayout;->w:Lcom/whoop/ui/ProgressDialLayout$a;

    iget-object v0, v0, Lcom/whoop/ui/ProgressDialLayout$a;->a:Lcom/whoop/ui/ProgressDial;

    return-object v0
.end method

.method public onLayout(ZIIII)V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p2

    div-int/lit8 p2, p2, 0x2

    iget-object p3, p0, Lcom/whoop/ui/ProgressDialLayout;->w:Lcom/whoop/ui/ProgressDialLayout$a;

    iget-object p3, p3, Lcom/whoop/ui/ProgressDialLayout$a;->a:Lcom/whoop/ui/ProgressDial;

    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    div-int/lit8 p3, p3, 0x2

    iget-object p4, p0, Lcom/whoop/ui/ProgressDialLayout;->w:Lcom/whoop/ui/ProgressDialLayout$a;

    iget-object p4, p4, Lcom/whoop/ui/ProgressDialLayout$a;->a:Lcom/whoop/ui/ProgressDial;

    sub-int p5, p1, p3

    sub-int v0, p2, p3

    add-int v1, p1, p3

    add-int/2addr p3, p2

    invoke-virtual {p4, p5, v0, v1, p3}, Landroid/view/View;->layout(IIII)V

    iget-object p3, p0, Lcom/whoop/ui/ProgressDialLayout;->w:Lcom/whoop/ui/ProgressDialLayout$a;

    iget-object p3, p3, Lcom/whoop/ui/ProgressDialLayout$a;->b:Landroid/view/ViewGroup;

    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    div-int/lit8 p3, p3, 0x2

    iget-object p4, p0, Lcom/whoop/ui/ProgressDialLayout;->w:Lcom/whoop/ui/ProgressDialLayout$a;

    iget-object p4, p4, Lcom/whoop/ui/ProgressDialLayout$a;->b:Landroid/view/ViewGroup;

    sub-int p5, p1, p3

    sub-int v0, p2, p3

    add-int/2addr p1, p3

    add-int/2addr p2, p3

    invoke-virtual {p4, p5, v0, p1, p2}, Landroid/view/ViewGroup;->layout(IIII)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 2

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    iget p2, p0, Lcom/whoop/ui/ProgressDialLayout;->y:I

    if-eqz p2, :cond_0

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    :cond_0
    iget p2, p0, Lcom/whoop/ui/ProgressDialLayout;->z:I

    if-eqz p2, :cond_1

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    :cond_1
    const/high16 p2, 0x40000000    # 2.0f

    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    iget-object v0, p0, Lcom/whoop/ui/ProgressDialLayout;->w:Lcom/whoop/ui/ProgressDialLayout$a;

    iget-object v0, v0, Lcom/whoop/ui/ProgressDialLayout$a;->a:Lcom/whoop/ui/ProgressDial;

    invoke-virtual {v0, p1, p1}, Landroid/view/View;->measure(II)V

    iget-boolean v0, p0, Lcom/whoop/ui/ProgressDialLayout;->x:Z

    if-eqz v0, :cond_2

    iget-object p1, p0, Lcom/whoop/ui/ProgressDialLayout;->w:Lcom/whoop/ui/ProgressDialLayout$a;

    iget-object p1, p1, Lcom/whoop/ui/ProgressDialLayout$a;->a:Lcom/whoop/ui/ProgressDial;

    invoke-virtual {p1}, Lcom/whoop/ui/ProgressDial;->getMeasuredInnerDiameter()F

    move-result p1

    float-to-int p1, p1

    mul-int/2addr p1, p1

    div-int/lit8 p1, p1, 0x2

    int-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-int p1, v0

    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    :cond_2
    iget-object p2, p0, Lcom/whoop/ui/ProgressDialLayout;->w:Lcom/whoop/ui/ProgressDialLayout$a;

    iget-object p2, p2, Lcom/whoop/ui/ProgressDialLayout$a;->b:Landroid/view/ViewGroup;

    invoke-virtual {p2, p1, p1}, Landroid/view/View;->measure(II)V

    return-void
.end method

.method public setMeasureInside(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/ui/ProgressDialLayout;->x:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lcom/whoop/ui/ProgressDialLayout;->x:Z

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method public setProgress(F)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iget-object v0, p0, Lcom/whoop/ui/ProgressDialLayout;->w:Lcom/whoop/ui/ProgressDialLayout$a;

    iget-object v0, v0, Lcom/whoop/ui/ProgressDialLayout$a;->a:Lcom/whoop/ui/ProgressDial;

    invoke-virtual {v0, p1}, Lcom/whoop/ui/ProgressDial;->setProgress(F)V

    return-void
.end method
