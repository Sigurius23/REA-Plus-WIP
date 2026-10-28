.class public Lcom/whoop/realtime/presentation/views/a;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/realtime/presentation/views/a$a;,
        Lcom/whoop/realtime/presentation/views/a$b;
    }
.end annotation


# instance fields
.field private final E:I

.field private F:I

.field private G:F

.field private H:Lcom/whoop/realtime/presentation/views/a$b;

.field private final I:Lcom/whoop/realtime/presentation/views/a$a;

.field private final w:I

.field private final x:Landroid/graphics/Paint;

.field private final y:I

.field private final z:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/whoop/realtime/presentation/views/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    .line 3
    invoke-virtual {p0, p2}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 5
    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    const v2, 0x1010030

    const/4 v3, 0x1

    invoke-virtual {p1, v2, v1, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 7
    iget p1, v1, Landroid/util/TypedValue;->data:I

    const/16 v1, 0x26

    .line 8
    invoke-static {p1, v1}, Lcom/whoop/realtime/presentation/views/a;->b(IB)I

    move-result p1

    iput p1, p0, Lcom/whoop/realtime/presentation/views/a;->E:I

    .line 9
    new-instance v1, Lcom/whoop/realtime/presentation/views/a$a;

    invoke-direct {v1, p2}, Lcom/whoop/realtime/presentation/views/a$a;-><init>(I)V

    iput-object v1, p0, Lcom/whoop/realtime/presentation/views/a;->I:Lcom/whoop/realtime/presentation/views/a$a;

    const p2, -0xcc4a1b

    .line 10
    filled-new-array {p2}, [I

    move-result-object p2

    invoke-virtual {v1, p2}, Lcom/whoop/realtime/presentation/views/a$a;->b([I)V

    const/4 p2, 0x0

    mul-float/2addr p2, v0

    float-to-int p2, p2

    .line 11
    iput p2, p0, Lcom/whoop/realtime/presentation/views/a;->w:I

    .line 12
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Lcom/whoop/realtime/presentation/views/a;->x:Landroid/graphics/Paint;

    .line 13
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 p1, 0x40400000    # 3.0f

    mul-float/2addr v0, p1

    float-to-int p1, v0

    .line 14
    iput p1, p0, Lcom/whoop/realtime/presentation/views/a;->y:I

    .line 15
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/whoop/realtime/presentation/views/a;->z:Landroid/graphics/Paint;

    return-void
.end method

.method private static b(IB)I
    .locals 2

    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    move-result v0

    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    move-result v1

    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    move-result p0

    invoke-static {p1, v0, v1, p0}, Landroid/graphics/Color;->argb(IIII)I

    move-result p0

    return p0
.end method


# virtual methods
.method public a(IF)V
    .locals 0

    iput p1, p0, Lcom/whoop/realtime/presentation/views/a;->F:I

    iput p2, p0, Lcom/whoop/realtime/presentation/views/a;->G:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 18

    move-object/from16 v0, p0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    iget-object v3, v0, Lcom/whoop/realtime/presentation/views/a;->H:Lcom/whoop/realtime/presentation/views/a$b;

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, v0, Lcom/whoop/realtime/presentation/views/a;->I:Lcom/whoop/realtime/presentation/views/a$a;

    :goto_0
    if-lez v2, :cond_3

    iget v2, v0, Lcom/whoop/realtime/presentation/views/a;->F:I

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v4

    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    move-result v2

    iget v5, v0, Lcom/whoop/realtime/presentation/views/a;->F:I

    invoke-interface {v3, v5}, Lcom/whoop/realtime/presentation/views/a$b;->a(I)I

    move-result v5

    iget v6, v0, Lcom/whoop/realtime/presentation/views/a;->G:F

    const/4 v7, 0x0

    cmpl-float v6, v6, v7

    if-lez v6, :cond_2

    iget v6, v0, Lcom/whoop/realtime/presentation/views/a;->F:I

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v7

    add-int/lit8 v7, v7, -0x1

    if-ge v6, v7, :cond_2

    iget v6, v0, Lcom/whoop/realtime/presentation/views/a;->F:I

    add-int/lit8 v6, v6, 0x1

    invoke-interface {v3, v6}, Lcom/whoop/realtime/presentation/views/a$b;->a(I)I

    move-result v3

    if-eq v5, v3, :cond_1

    iget v6, v0, Lcom/whoop/realtime/presentation/views/a;->G:F

    invoke-static {v5, v3, v6}, Lin2/c;->a(IIF)I

    move-result v5

    :cond_1
    iget v3, v0, Lcom/whoop/realtime/presentation/views/a;->F:I

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    iget v6, v0, Lcom/whoop/realtime/presentation/views/a;->G:F

    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v7

    int-to-float v7, v7

    mul-float/2addr v6, v7

    iget v7, v0, Lcom/whoop/realtime/presentation/views/a;->G:F

    const/high16 v8, 0x3f800000    # 1.0f

    sub-float v9, v8, v7

    int-to-float v4, v4

    mul-float/2addr v9, v4

    add-float/2addr v9, v6

    float-to-int v4, v9

    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v7, v3

    iget v3, v0, Lcom/whoop/realtime/presentation/views/a;->G:F

    sub-float/2addr v8, v3

    int-to-float v2, v2

    mul-float/2addr v8, v2

    add-float/2addr v8, v7

    float-to-int v2, v8

    :cond_2
    iget-object v3, v0, Lcom/whoop/realtime/presentation/views/a;->z:Landroid/graphics/Paint;

    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v7, v4

    iget v3, v0, Lcom/whoop/realtime/presentation/views/a;->y:I

    sub-int v3, v1, v3

    int-to-float v8, v3

    int-to-float v9, v2

    int-to-float v10, v1

    iget-object v11, v0, Lcom/whoop/realtime/presentation/views/a;->z:Landroid/graphics/Paint;

    move-object/from16 v6, p1

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_3
    iget v2, v0, Lcom/whoop/realtime/presentation/views/a;->w:I

    sub-int v2, v1, v2

    int-to-float v14, v2

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v15, v2

    int-to-float v1, v1

    iget-object v2, v0, Lcom/whoop/realtime/presentation/views/a;->x:Landroid/graphics/Paint;

    const/4 v13, 0x0

    move-object/from16 v12, p1

    move/from16 v16, v1

    move-object/from16 v17, v2

    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public setCustomTabColorizer(Lcom/whoop/realtime/presentation/views/a$b;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/realtime/presentation/views/a;->H:Lcom/whoop/realtime/presentation/views/a$b;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public varargs setSelectedIndicatorColors([I)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whoop/realtime/presentation/views/a;->H:Lcom/whoop/realtime/presentation/views/a$b;

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/a;->I:Lcom/whoop/realtime/presentation/views/a$a;

    invoke-virtual {v0, p1}, Lcom/whoop/realtime/presentation/views/a$a;->b([I)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
