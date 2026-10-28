.class public Lgn2/c;
.super Landroid/graphics/drawable/LayerDrawable;
.source "SourceFile"


# static fields
.field static E:I = 0x1

.field static z:I


# instance fields
.field private w:F

.field private x:I

.field private y:Lgn2/b;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/drawable/ShapeDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/ShapeDrawable;-><init>()V

    new-instance v1, Landroid/graphics/drawable/ShapeDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/ShapeDrawable;-><init>()V

    invoke-direct {p0, v0, v1}, Lgn2/c;-><init>(Landroid/graphics/drawable/ShapeDrawable;Landroid/graphics/drawable/ShapeDrawable;)V

    return-void
.end method

.method private constructor <init>(Landroid/graphics/drawable/ShapeDrawable;Landroid/graphics/drawable/ShapeDrawable;)V
    .locals 0

    .line 2
    invoke-static {p1, p2}, Lgn2/c;->a(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)[Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 3
    invoke-direct {p0}, Lgn2/c;->d()V

    return-void
.end method

.method public static a(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)[Landroid/graphics/drawable/Drawable;
    .locals 2

    const/4 v0, 0x2

    new-array v0, v0, [Landroid/graphics/drawable/Drawable;

    sget v1, Lgn2/c;->z:I

    aput-object p0, v0, v1

    sget p0, Lgn2/c;->E:I

    aput-object p1, v0, p0

    return-object v0
.end method

.method private b()Landroid/graphics/drawable/ShapeDrawable;
    .locals 1

    sget v0, Lgn2/c;->z:I

    invoke-virtual {p0, v0}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/ShapeDrawable;

    return-object v0
.end method

.method private c()Landroid/graphics/drawable/ShapeDrawable;
    .locals 1

    sget v0, Lgn2/c;->E:I

    invoke-virtual {p0, v0}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/ShapeDrawable;

    return-object v0
.end method

.method private d()V
    .locals 3

    new-instance v0, Lgn2/b;

    invoke-direct {v0}, Lgn2/b;-><init>()V

    iput-object v0, p0, Lgn2/c;->y:Lgn2/b;

    invoke-direct {p0}, Lgn2/c;->c()Landroid/graphics/drawable/ShapeDrawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v1

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const/high16 v0, 0x41400000    # 12.0f

    invoke-virtual {p0, v0}, Lgn2/c;->j(F)V

    return-void
.end method

.method private e()V
    .locals 9

    iget-object v1, p0, Lgn2/c;->y:Lgn2/b;

    iget v2, p0, Lgn2/c;->x:I

    invoke-virtual {v1, v2}, Lgn2/b;->a(I)Landroid/graphics/drawable/shapes/Shape;

    move-result-object v1

    invoke-direct {p0}, Lgn2/c;->c()Landroid/graphics/drawable/ShapeDrawable;

    move-result-object v6

    invoke-direct {p0}, Lgn2/c;->b()Landroid/graphics/drawable/ShapeDrawable;

    move-result-object v7

    invoke-virtual {v6, v1}, Landroid/graphics/drawable/ShapeDrawable;->setShape(Landroid/graphics/drawable/shapes/Shape;)V

    invoke-virtual {v7, v1}, Landroid/graphics/drawable/ShapeDrawable;->setShape(Landroid/graphics/drawable/shapes/Shape;)V

    iget v1, p0, Lgn2/c;->w:F

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v1, v8

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v2, v1

    sget v1, Lgn2/c;->E:I

    move v3, v2

    move v4, v2

    move v5, v2

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/drawable/LayerDrawable;->setLayerInset(IIIII)V

    iget v1, p0, Lgn2/c;->w:F

    div-float/2addr v1, v8

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    double-to-int v1, v1

    move v2, v1

    sget v1, Lgn2/c;->z:I

    move v3, v2

    add-int/lit8 v2, v3, 0x1

    add-int/lit8 v4, v3, -0x1

    move v3, v2

    move v5, v4

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/drawable/LayerDrawable;->setLayerInset(IIIII)V

    invoke-virtual {p0, v7}, Landroid/graphics/drawable/LayerDrawable;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0, v6}, Landroid/graphics/drawable/LayerDrawable;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method


# virtual methods
.method public f(I)V
    .locals 0

    iput p1, p0, Lgn2/c;->x:I

    invoke-direct {p0}, Lgn2/c;->e()V

    return-void
.end method

.method public g(I)V
    .locals 1

    invoke-direct {p0}, Lgn2/c;->b()Landroid/graphics/drawable/ShapeDrawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public h(I)V
    .locals 1

    invoke-direct {p0}, Lgn2/c;->c()Landroid/graphics/drawable/ShapeDrawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public i(Z)V
    .locals 1

    invoke-direct {p0}, Lgn2/c;->b()Landroid/graphics/drawable/ShapeDrawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v0

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    return-void
.end method

.method public j(F)V
    .locals 2

    invoke-direct {p0}, Lgn2/c;->b()Landroid/graphics/drawable/ShapeDrawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v0

    const/4 v1, 0x0

    cmpg-float v1, p1, v1

    if-gtz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iput p1, p0, Lgn2/c;->w:F

    invoke-direct {p0}, Lgn2/c;->c()Landroid/graphics/drawable/ShapeDrawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-direct {p0}, Lgn2/c;->e()V

    return-void
.end method
