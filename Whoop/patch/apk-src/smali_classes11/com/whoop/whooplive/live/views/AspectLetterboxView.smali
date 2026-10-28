.class public Lcom/whoop/whooplive/live/views/AspectLetterboxView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private E:Landroid/graphics/Rect;

.field private w:F

.field private x:Landroid/graphics/Paint;

.field private y:I

.field private z:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    sget-object v0, Lpz2/h;->a:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/live/views/AspectLetterboxView;->a(Landroid/content/res/TypedArray;)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private a(Landroid/content/res/TypedArray;)V
    .locals 2

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/whoop/whooplive/live/views/AspectLetterboxView;->x:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/whoop/whooplive/live/views/AspectLetterboxView;->z:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/whoop/whooplive/live/views/AspectLetterboxView;->E:Landroid/graphics/Rect;

    if-eqz p1, :cond_0

    sget v0, Lpz2/h;->b:I

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/whoop/whooplive/live/views/AspectLetterboxView;->setAspectRatio(F)V

    sget v0, Lpz2/h;->c:I

    sget v1, Lvu1/a;->a:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/whoop/whooplive/live/views/AspectLetterboxView;->setShadeColor(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public getAspectRatio()F
    .locals 1

    iget v0, p0, Lcom/whoop/whooplive/live/views/AspectLetterboxView;->w:F

    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/AspectLetterboxView;->z:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/whoop/whooplive/live/views/AspectLetterboxView;->x:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/AspectLetterboxView;->E:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/whoop/whooplive/live/views/AspectLetterboxView;->x:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 2

    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    move-object p1, p0

    sub-int v0, p4, p2

    sub-int p3, p5, p3

    int-to-float v0, v0

    iget v1, p1, Lcom/whoop/whooplive/live/views/AspectLetterboxView;->w:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    sub-int/2addr p3, v0

    div-int/lit8 p3, p3, 0x2

    iget-object v0, p1, Lcom/whoop/whooplive/live/views/AspectLetterboxView;->z:Landroid/graphics/Rect;

    const/4 v1, 0x0

    invoke-virtual {v0, p2, v1, p4, p3}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v0, p1, Lcom/whoop/whooplive/live/views/AspectLetterboxView;->E:Landroid/graphics/Rect;

    sub-int p3, p5, p3

    invoke-virtual {v0, p2, p3, p4, p5}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method

.method public setAspectRatio(F)V
    .locals 0

    iput p1, p0, Lcom/whoop/whooplive/live/views/AspectLetterboxView;->w:F

    return-void
.end method

.method public setShadeColor(I)V
    .locals 1

    iput p1, p0, Lcom/whoop/whooplive/live/views/AspectLetterboxView;->y:I

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/AspectLetterboxView;->x:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method
