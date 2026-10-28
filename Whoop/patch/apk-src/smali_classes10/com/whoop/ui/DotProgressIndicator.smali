.class public final Lcom/whoop/ui/DotProgressIndicator;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0018\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ7\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0014\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008 \u0010\u001eR\"\u0010(\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\"\u0010#\u001a\u0004\u0008$\u0010%\"\u0004\u0008&\u0010\'R\"\u0010,\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008)\u0010#\u001a\u0004\u0008*\u0010%\"\u0004\u0008+\u0010\'R\u0016\u0010.\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008-\u0010#R\u0016\u0010/\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001eR\u0016\u00101\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00080\u0010\u001eR\u0016\u00103\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00082\u0010#R\u0016\u00104\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008#\u0010\u001eR\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u00086\u00107R\u0016\u0010:\u001a\u0002058\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u00089\u00107R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R\u0016\u0010@\u001a\u00020;8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008?\u0010=\u00a8\u0006A"
    }
    d2 = {
        "Lcom/whoop/ui/DotProgressIndicator;",
        "Landroid/view/View;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "Landroid/content/res/TypedArray;",
        "arr",
        "Ll83/a0;",
        "b",
        "(Landroid/content/res/TypedArray;)V",
        "a",
        "()V",
        "",
        "changed",
        "",
        "left",
        "top",
        "right",
        "bottom",
        "onLayout",
        "(ZIIII)V",
        "Landroid/graphics/Canvas;",
        "canvas",
        "onDraw",
        "(Landroid/graphics/Canvas;)V",
        "",
        "w",
        "F",
        "circleMargin",
        "x",
        "circleRadius",
        "y",
        "I",
        "getDotProgressPageCount",
        "()I",
        "setDotProgressPageCount",
        "(I)V",
        "dotProgressPageCount",
        "z",
        "getDotProgressCurrentPageCount",
        "setDotProgressCurrentPageCount",
        "dotProgressCurrentPageCount",
        "E",
        "horizontalProgressPosition",
        "circleCenterY",
        "G",
        "firstCircleCenterX",
        "H",
        "currentPosition",
        "currentPositionOffset",
        "Landroid/graphics/Paint;",
        "J",
        "Landroid/graphics/Paint;",
        "unselectedCirclePaint",
        "K",
        "selectedCirclePaint",
        "Landroid/graphics/Path;",
        "L",
        "Landroid/graphics/Path;",
        "firstCirclePath",
        "M",
        "circleClipTemp",
        "legacy_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private E:I

.field private F:F

.field private G:F

.field private H:I

.field private I:F

.field private J:Landroid/graphics/Paint;

.field private K:Landroid/graphics/Paint;

.field private L:Landroid/graphics/Path;

.field private M:Landroid/graphics/Path;

.field private w:F

.field private x:F

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    sget-object v0, Lvu1/j;->h:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/ui/DotProgressIndicator;->b(Landroid/content/res/TypedArray;)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private final a()V
    .locals 7

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v2, v0

    iget v3, p0, Lcom/whoop/ui/DotProgressIndicator;->w:F

    iget v4, p0, Lcom/whoop/ui/DotProgressIndicator;->y:I

    add-int/lit8 v5, v4, -0x1

    int-to-float v5, v5

    mul-float/2addr v3, v5

    sub-float/2addr v2, v3

    int-to-float v3, v4

    div-float/2addr v2, v3

    int-to-float v3, v1

    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v2

    const/4 v3, 0x2

    int-to-float v4, v3

    div-float/2addr v2, v4

    iput v2, p0, Lcom/whoop/ui/DotProgressIndicator;->x:F

    div-int/2addr v1, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    add-int/2addr v2, v1

    int-to-float v1, v2

    iput v1, p0, Lcom/whoop/ui/DotProgressIndicator;->F:F

    iget v1, p0, Lcom/whoop/ui/DotProgressIndicator;->x:F

    mul-float/2addr v1, v4

    iget v2, p0, Lcom/whoop/ui/DotProgressIndicator;->y:I

    int-to-float v5, v2

    mul-float/2addr v1, v5

    iget v5, p0, Lcom/whoop/ui/DotProgressIndicator;->w:F

    const/4 v6, 0x1

    sub-int/2addr v2, v6

    int-to-float v2, v2

    mul-float/2addr v5, v2

    add-float/2addr v5, v1

    iget v1, p0, Lcom/whoop/ui/DotProgressIndicator;->E:I

    if-eq v1, v6, :cond_2

    if-eq v1, v3, :cond_1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    move-result v0

    :goto_0
    int-to-float v0, v0

    goto :goto_2

    :cond_0
    div-int/2addr v0, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    add-int/2addr v1, v0

    int-to-float v0, v1

    div-float/2addr v5, v4

    :goto_1
    sub-float/2addr v0, v5

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    move-result v0

    goto :goto_0

    :goto_2
    iget v1, p0, Lcom/whoop/ui/DotProgressIndicator;->x:F

    add-float/2addr v0, v1

    iput v0, p0, Lcom/whoop/ui/DotProgressIndicator;->G:F

    iget-object v0, p0, Lcom/whoop/ui/DotProgressIndicator;->L:Landroid/graphics/Path;

    const/4 v1, 0x0

    const-string v2, "firstCirclePath"

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    iget-object v0, p0, Lcom/whoop/ui/DotProgressIndicator;->L:Landroid/graphics/Path;

    if-eqz v0, :cond_3

    iget v1, p0, Lcom/whoop/ui/DotProgressIndicator;->G:F

    iget v2, p0, Lcom/whoop/ui/DotProgressIndicator;->F:F

    iget v3, p0, Lcom/whoop/ui/DotProgressIndicator;->x:F

    sget-object v4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method private final b(Landroid/content/res/TypedArray;)V
    .locals 7

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/whoop/ui/DotProgressIndicator;->J:Landroid/graphics/Paint;

    const v2, -0x777778

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/whoop/ui/DotProgressIndicator;->K:Landroid/graphics/Paint;

    const/4 v2, -0x1

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v2, 0x41000000    # 8.0f

    mul-float/2addr v0, v2

    iput v0, p0, Lcom/whoop/ui/DotProgressIndicator;->w:F

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/DotProgressIndicator;->L:Landroid/graphics/Path;

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/DotProgressIndicator;->M:Landroid/graphics/Path;

    iput v1, p0, Lcom/whoop/ui/DotProgressIndicator;->H:I

    const v0, 0x3dcccccd    # 0.1f

    iput v0, p0, Lcom/whoop/ui/DotProgressIndicator;->I:F

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_a

    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v3

    sget v4, Lvu1/j;->j:I

    if-ne v3, v4, :cond_0

    iget v4, p0, Lcom/whoop/ui/DotProgressIndicator;->w:F

    float-to-int v4, v4

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    int-to-float v3, v3

    iput v3, p0, Lcom/whoop/ui/DotProgressIndicator;->w:F

    goto :goto_1

    :cond_0
    sget v4, Lvu1/j;->k:I

    const/4 v5, 0x0

    if-ne v3, v4, :cond_3

    iget-object v4, p0, Lcom/whoop/ui/DotProgressIndicator;->K:Landroid/graphics/Paint;

    const-string v6, "selectedCirclePaint"

    if-eqz v4, :cond_2

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Landroid/graphics/Paint;->getColor()I

    move-result v5

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_1

    :cond_1
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :cond_2
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :cond_3
    sget v4, Lvu1/j;->l:I

    if-ne v3, v4, :cond_6

    iget-object v4, p0, Lcom/whoop/ui/DotProgressIndicator;->J:Landroid/graphics/Paint;

    const-string v6, "unselectedCirclePaint"

    if-eqz v4, :cond_5

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Landroid/graphics/Paint;->getColor()I

    move-result v5

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_1

    :cond_4
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :cond_5
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :cond_6
    sget v4, Lvu1/j;->m:I

    if-ne v3, v4, :cond_7

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v3

    iput v3, p0, Lcom/whoop/ui/DotProgressIndicator;->y:I

    goto :goto_1

    :cond_7
    sget v4, Lvu1/j;->i:I

    if-ne v3, v4, :cond_8

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v3

    iput v3, p0, Lcom/whoop/ui/DotProgressIndicator;->z:I

    goto :goto_1

    :cond_8
    sget v4, Lvu1/j;->n:I

    if-ne v3, v4, :cond_9

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v3

    iput v3, p0, Lcom/whoop/ui/DotProgressIndicator;->E:I

    :cond_9
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_a
    return-void
.end method


# virtual methods
.method public final getDotProgressCurrentPageCount()I
    .locals 1

    iget v0, p0, Lcom/whoop/ui/DotProgressIndicator;->z:I

    return v0
.end method

.method public final getDotProgressPageCount()I
    .locals 1

    iget v0, p0, Lcom/whoop/ui/DotProgressIndicator;->y:I

    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    const/4 v0, 0x2

    int-to-float v0, v0

    iget v1, p0, Lcom/whoop/ui/DotProgressIndicator;->x:F

    mul-float/2addr v0, v1

    iget v1, p0, Lcom/whoop/ui/DotProgressIndicator;->w:F

    add-float/2addr v0, v1

    iget v1, p0, Lcom/whoop/ui/DotProgressIndicator;->y:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    iget v3, p0, Lcom/whoop/ui/DotProgressIndicator;->G:F

    int-to-float v4, v2

    mul-float/2addr v4, v0

    add-float/2addr v4, v3

    iget v3, p0, Lcom/whoop/ui/DotProgressIndicator;->F:F

    iget v5, p0, Lcom/whoop/ui/DotProgressIndicator;->x:F

    iget v6, p0, Lcom/whoop/ui/DotProgressIndicator;->z:I

    const/4 v7, 0x0

    if-ge v2, v6, :cond_1

    iget-object v6, p0, Lcom/whoop/ui/DotProgressIndicator;->K:Landroid/graphics/Paint;

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "selectedCirclePaint"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v7

    :cond_1
    iget-object v6, p0, Lcom/whoop/ui/DotProgressIndicator;->J:Landroid/graphics/Paint;

    if-eqz v6, :cond_2

    :goto_1
    invoke-virtual {p1, v4, v3, v5, v6}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const-string p1, "unselectedCirclePaint"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v7

    :cond_3
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    invoke-direct {p0}, Lcom/whoop/ui/DotProgressIndicator;->a()V

    return-void
.end method

.method public final setDotProgressCurrentPageCount(I)V
    .locals 0

    iput p1, p0, Lcom/whoop/ui/DotProgressIndicator;->z:I

    return-void
.end method

.method public final setDotProgressPageCount(I)V
    .locals 0

    iput p1, p0, Lcom/whoop/ui/DotProgressIndicator;->y:I

    return-void
.end method
