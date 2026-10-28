.class public final Lcom/whoop/community/presentation/ui/SimpleDial;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0017\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ7\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\u001fR*\u0010+\u001a\u00020#2\u0006\u0010$\u001a\u00020#8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(\"\u0004\u0008)\u0010*R*\u0010/\u001a\u00020#2\u0006\u0010$\u001a\u00020#8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008,\u0010&\u001a\u0004\u0008-\u0010(\"\u0004\u0008.\u0010*R*\u00105\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00068\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008&\u00100\u001a\u0004\u00081\u00102\"\u0004\u00083\u00104R*\u00109\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00068\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00086\u00100\u001a\u0004\u00087\u00102\"\u0004\u00088\u00104\u00a8\u0006:"
    }
    d2 = {
        "Lcom/whoop/community/presentation/ui/SimpleDial;",
        "Landroid/view/View;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "defStyleAttr",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Ll83/a0;",
        "a",
        "()V",
        "",
        "changed",
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
        "Landroid/graphics/RectF;",
        "w",
        "Landroid/graphics/RectF;",
        "drawRect",
        "Landroid/graphics/Paint;",
        "x",
        "Landroid/graphics/Paint;",
        "emptyPaint",
        "y",
        "dialPaint",
        "",
        "value",
        "z",
        "F",
        "getThickness",
        "()F",
        "setThickness",
        "(F)V",
        "thickness",
        "E",
        "getProgress",
        "setProgress",
        "progress",
        "I",
        "getEmptyColor",
        "()I",
        "setEmptyColor",
        "(I)V",
        "emptyColor",
        "G",
        "getFullColor",
        "setFullColor",
        "fullColor",
        "community_release"
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
.field private E:F

.field private F:I

.field private G:I

.field private final w:Landroid/graphics/RectF;

.field private final x:Landroid/graphics/Paint;

.field private final y:Landroid/graphics/Paint;

.field private z:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/whoop/community/presentation/ui/SimpleDial;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    new-instance p3, Landroid/graphics/RectF;

    invoke-direct {p3}, Landroid/graphics/RectF;-><init>()V

    iput-object p3, p0, Lcom/whoop/community/presentation/ui/SimpleDial;->w:Landroid/graphics/RectF;

    .line 4
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    .line 5
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/4 v1, 0x1

    .line 6
    invoke-virtual {p3, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 7
    iput-object p3, p0, Lcom/whoop/community/presentation/ui/SimpleDial;->x:Landroid/graphics/Paint;

    .line 8
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    .line 9
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 10
    invoke-virtual {p3, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 11
    iput-object p3, p0, Lcom/whoop/community/presentation/ui/SimpleDial;->y:Landroid/graphics/Paint;

    const/high16 p3, 0x40000000    # 2.0f

    .line 12
    iput p3, p0, Lcom/whoop/community/presentation/ui/SimpleDial;->z:F

    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    const/4 v2, 0x0

    .line 14
    invoke-virtual {p0, v1, v2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    const/16 v1, 0x20

    .line 15
    invoke-virtual {p0, v1}, Landroid/view/View;->setMinimumHeight(I)V

    .line 16
    invoke-virtual {p0, v1}, Landroid/view/View;->setMinimumWidth(I)V

    .line 17
    sget-object v1, Lxp0/f0;->g:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p2

    if-ltz p2, :cond_3

    move v1, v0

    .line 19
    :goto_0
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    .line 20
    sget v3, Lxp0/f0;->h:I

    if-ne v2, v3, :cond_0

    .line 21
    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    invoke-virtual {p0, v2}, Lcom/whoop/community/presentation/ui/SimpleDial;->setEmptyColor(I)V

    goto :goto_1

    .line 22
    :cond_0
    sget v3, Lxp0/f0;->i:I

    if-ne v2, v3, :cond_1

    const/high16 v3, -0x1000000

    .line 23
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    invoke-virtual {p0, v2}, Lcom/whoop/community/presentation/ui/SimpleDial;->setFullColor(I)V

    goto :goto_1

    .line 24
    :cond_1
    sget v3, Lxp0/f0;->j:I

    if-ne v2, v3, :cond_2

    .line 25
    invoke-virtual {p1, v2, p3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-virtual {p0, v2}, Lcom/whoop/community/presentation/ui/SimpleDial;->setThickness(F)V

    :cond_2
    :goto_1
    if-eq v1, p2, :cond_3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 26
    :cond_3
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 27
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/community/presentation/ui/SimpleDial;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final a()V
    .locals 4

    iget v0, p0, Lcom/whoop/community/presentation/ui/SimpleDial;->z:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/community/presentation/ui/SimpleDial;->w:Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v2, v0

    iput v2, v1, Landroid/graphics/RectF;->left:F

    iget-object v1, p0, Lcom/whoop/community/presentation/ui/SimpleDial;->w:Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v2, v0

    iput v2, v1, Landroid/graphics/RectF;->top:F

    iget-object v1, p0, Lcom/whoop/community/presentation/ui/SimpleDial;->w:Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v2, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v2, v3

    iput v2, v1, Landroid/graphics/RectF;->right:F

    iget-object v1, p0, Lcom/whoop/community/presentation/ui/SimpleDial;->w:Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v2, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr v2, v0

    iput v2, v1, Landroid/graphics/RectF;->bottom:F

    iget-object v0, p0, Lcom/whoop/community/presentation/ui/SimpleDial;->x:Landroid/graphics/Paint;

    iget v1, p0, Lcom/whoop/community/presentation/ui/SimpleDial;->z:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, Lcom/whoop/community/presentation/ui/SimpleDial;->y:Landroid/graphics/Paint;

    iget v1, p0, Lcom/whoop/community/presentation/ui/SimpleDial;->z:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method


# virtual methods
.method public final getEmptyColor()I
    .locals 1

    iget v0, p0, Lcom/whoop/community/presentation/ui/SimpleDial;->F:I

    return v0
.end method

.method public final getFullColor()I
    .locals 1

    iget v0, p0, Lcom/whoop/community/presentation/ui/SimpleDial;->G:I

    return v0
.end method

.method public final getProgress()F
    .locals 1

    iget v0, p0, Lcom/whoop/community/presentation/ui/SimpleDial;->E:F

    return v0
.end method

.method public final getThickness()F
    .locals 1

    iget v0, p0, Lcom/whoop/community/presentation/ui/SimpleDial;->z:F

    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 13

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v2, p0, Lcom/whoop/community/presentation/ui/SimpleDial;->w:Landroid/graphics/RectF;

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/whoop/community/presentation/ui/SimpleDial;->x:Landroid/graphics/Paint;

    const/4 v3, 0x0

    const/high16 v4, 0x43b40000    # 360.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget-object v8, p0, Lcom/whoop/community/presentation/ui/SimpleDial;->w:Landroid/graphics/RectF;

    iget p1, p0, Lcom/whoop/community/presentation/ui/SimpleDial;->E:F

    const/high16 v0, 0x43b40000    # 360.0f

    mul-float v10, p1, v0

    const/4 v11, 0x0

    iget-object v12, p0, Lcom/whoop/community/presentation/ui/SimpleDial;->y:Landroid/graphics/Paint;

    const/high16 v9, -0x3d4c0000    # -90.0f

    move-object v7, v1

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    invoke-direct {p0}, Lcom/whoop/community/presentation/ui/SimpleDial;->a()V

    return-void
.end method

.method public final setEmptyColor(I)V
    .locals 1

    iput p1, p0, Lcom/whoop/community/presentation/ui/SimpleDial;->F:I

    iget-object v0, p0, Lcom/whoop/community/presentation/ui/SimpleDial;->x:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setFullColor(I)V
    .locals 1

    iput p1, p0, Lcom/whoop/community/presentation/ui/SimpleDial;->G:I

    iget-object v0, p0, Lcom/whoop/community/presentation/ui/SimpleDial;->y:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setProgress(F)V
    .locals 0

    iput p1, p0, Lcom/whoop/community/presentation/ui/SimpleDial;->E:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setThickness(F)V
    .locals 0

    iput p1, p0, Lcom/whoop/community/presentation/ui/SimpleDial;->z:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
