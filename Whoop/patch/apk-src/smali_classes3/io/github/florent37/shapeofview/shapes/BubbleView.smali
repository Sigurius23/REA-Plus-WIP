.class public Lio/github/florent37/shapeofview/shapes/BubbleView;
.super Ls53/c;
.source "SourceFile"


# instance fields
.field public H:I

.field public I:F

.field public J:F

.field public K:F

.field public L:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    invoke-direct {p0, p1, p2}, Ls53/c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x1

    iput v0, p0, Lio/github/florent37/shapeofview/shapes/BubbleView;->H:I

    if-eqz p2, :cond_0

    sget-object v1, Ls53/a;->a:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/high16 p2, 0x41200000    # 10.0f

    invoke-virtual {p0, p2}, Ls53/c;->a(F)F

    move-result v1

    float-to-int v1, v1

    const/4 v2, 0x4

    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    int-to-float v1, v1

    iput v1, p0, Lio/github/florent37/shapeofview/shapes/BubbleView;->I:F

    const/4 v1, 0x2

    iget v2, p0, Lio/github/florent37/shapeofview/shapes/BubbleView;->H:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v1

    iput v1, p0, Lio/github/florent37/shapeofview/shapes/BubbleView;->H:I

    invoke-virtual {p0, p2}, Ls53/c;->a(F)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lio/github/florent37/shapeofview/shapes/BubbleView;->J:F

    invoke-virtual {p0, p2}, Ls53/c;->a(F)F

    move-result p2

    float-to-int p2, p2

    const/4 v0, 0x3

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Lio/github/florent37/shapeofview/shapes/BubbleView;->K:F

    const/4 p2, 0x0

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    iput p2, p0, Lio/github/florent37/shapeofview/shapes/BubbleView;->L:F

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_0
    new-instance p1, Lty/c;

    const/4 p2, 0x4

    invoke-direct {p1, p0, p2}, Lty/c;-><init>(Ljava/lang/Object;I)V

    invoke-super {p0, p1}, Ls53/c;->setClipPathCreator(Lt53/a;)V

    return-void
.end method


# virtual methods
.method public getArrowHeight()F
    .locals 1

    iget v0, p0, Lio/github/florent37/shapeofview/shapes/BubbleView;->J:F

    return v0
.end method

.method public getArrowHeightDp()F
    .locals 2

    invoke-virtual {p0}, Lio/github/florent37/shapeofview/shapes/BubbleView;->getArrowHeight()F

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v0, v1

    return v0
.end method

.method public getArrowWidth()F
    .locals 1

    iget v0, p0, Lio/github/florent37/shapeofview/shapes/BubbleView;->K:F

    return v0
.end method

.method public getBorderRadius()F
    .locals 1

    iget v0, p0, Lio/github/florent37/shapeofview/shapes/BubbleView;->I:F

    return v0
.end method

.method public getBorderRadiusDp()F
    .locals 2

    invoke-virtual {p0}, Lio/github/florent37/shapeofview/shapes/BubbleView;->getBorderRadius()F

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v0, v1

    return v0
.end method

.method public getPosition()I
    .locals 1

    iget v0, p0, Lio/github/florent37/shapeofview/shapes/BubbleView;->H:I

    return v0
.end method

.method public setArrowHeight(F)V
    .locals 0

    iput p1, p0, Lio/github/florent37/shapeofview/shapes/BubbleView;->J:F

    invoke-virtual {p0}, Ls53/c;->b()V

    return-void
.end method

.method public setArrowHeightDp(F)V
    .locals 0

    invoke-virtual {p0, p1}, Ls53/c;->a(F)F

    move-result p1

    invoke-virtual {p0, p1}, Lio/github/florent37/shapeofview/shapes/BubbleView;->setArrowHeight(F)V

    return-void
.end method

.method public setArrowWidth(F)V
    .locals 0

    iput p1, p0, Lio/github/florent37/shapeofview/shapes/BubbleView;->K:F

    invoke-virtual {p0}, Ls53/c;->b()V

    return-void
.end method

.method public setArrowWidthDp(F)V
    .locals 0

    invoke-virtual {p0, p1}, Ls53/c;->a(F)F

    move-result p1

    invoke-virtual {p0, p1}, Lio/github/florent37/shapeofview/shapes/BubbleView;->setArrowWidth(F)V

    return-void
.end method

.method public setBorderRadius(F)V
    .locals 0

    iput p1, p0, Lio/github/florent37/shapeofview/shapes/BubbleView;->I:F

    invoke-virtual {p0}, Ls53/c;->b()V

    return-void
.end method

.method public setBorderRadiusDp(F)V
    .locals 0

    invoke-virtual {p0, p1}, Ls53/c;->a(F)F

    move-result p1

    iput p1, p0, Lio/github/florent37/shapeofview/shapes/BubbleView;->I:F

    invoke-virtual {p0}, Ls53/c;->b()V

    return-void
.end method

.method public setPosition(I)V
    .locals 0

    iput p1, p0, Lio/github/florent37/shapeofview/shapes/BubbleView;->H:I

    invoke-virtual {p0}, Ls53/c;->b()V

    return-void
.end method

.method public setPositionPer(F)V
    .locals 0

    iput p1, p0, Lio/github/florent37/shapeofview/shapes/BubbleView;->L:F

    invoke-virtual {p0}, Ls53/c;->b()V

    return-void
.end method
