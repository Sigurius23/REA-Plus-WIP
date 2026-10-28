.class public Lde/hdodenhof/circleimageview/CircleImageView;
.super Landroid/widget/ImageView;
.source "SourceFile"


# static fields
.field public static final U:Landroid/widget/ImageView$ScaleType;

.field public static final V:Landroid/graphics/Bitmap$Config;


# instance fields
.field public final E:Landroid/graphics/Paint;

.field public final F:Landroid/graphics/Paint;

.field public G:I

.field public H:I

.field public I:I

.field public J:Landroid/graphics/Bitmap;

.field public K:Landroid/graphics/BitmapShader;

.field public L:I

.field public M:I

.field public N:F

.field public O:F

.field public P:Landroid/graphics/ColorFilter;

.field public Q:Z

.field public R:Z

.field public S:Z

.field public T:Z

.field public final w:Landroid/graphics/RectF;

.field public final x:Landroid/graphics/RectF;

.field public final y:Landroid/graphics/Matrix;

.field public final z:Landroid/graphics/Paint;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    sput-object v0, Lde/hdodenhof/circleimageview/CircleImageView;->U:Landroid/widget/ImageView$ScaleType;

    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    sput-object v0, Lde/hdodenhof/circleimageview/CircleImageView;->V:Landroid/graphics/Bitmap$Config;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->w:Landroid/graphics/RectF;

    .line 3
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->x:Landroid/graphics/RectF;

    .line 4
    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->y:Landroid/graphics/Matrix;

    .line 5
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->z:Landroid/graphics/Paint;

    .line 6
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->E:Landroid/graphics/Paint;

    .line 7
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->F:Landroid/graphics/Paint;

    const/high16 p1, -0x1000000

    .line 8
    iput p1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->G:I

    const/4 p1, 0x0

    .line 9
    iput p1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->H:I

    .line 10
    iput p1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->I:I

    .line 11
    invoke-virtual {p0}, Lde/hdodenhof/circleimageview/CircleImageView;->a()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    const/4 v0, 0x0

    .line 12
    invoke-direct {p0, p1, p2, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 13
    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    iput-object v1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->w:Landroid/graphics/RectF;

    .line 14
    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    iput-object v1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->x:Landroid/graphics/RectF;

    .line 15
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->y:Landroid/graphics/Matrix;

    .line 16
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->z:Landroid/graphics/Paint;

    .line 17
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->E:Landroid/graphics/Paint;

    .line 18
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->F:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    .line 19
    iput v1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->G:I

    .line 20
    iput v0, p0, Lde/hdodenhof/circleimageview/CircleImageView;->H:I

    .line 21
    iput v0, p0, Lde/hdodenhof/circleimageview/CircleImageView;->I:I

    .line 22
    sget-object v2, Lw03/a;->a:[I

    invoke-virtual {p1, p2, v2, v0, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x2

    .line 23
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lde/hdodenhof/circleimageview/CircleImageView;->H:I

    .line 24
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lde/hdodenhof/circleimageview/CircleImageView;->G:I

    const/4 p2, 0x1

    .line 25
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lde/hdodenhof/circleimageview/CircleImageView;->S:Z

    const/4 p2, 0x3

    .line 26
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lde/hdodenhof/circleimageview/CircleImageView;->I:I

    .line 27
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 28
    invoke-virtual {p0}, Lde/hdodenhof/circleimageview/CircleImageView;->a()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    sget-object v0, Lde/hdodenhof/circleimageview/CircleImageView;->U:Landroid/widget/ImageView$ScaleType;

    invoke-super {p0, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lde/hdodenhof/circleimageview/CircleImageView;->Q:Z

    new-instance v0, Ls53/b;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Ls53/b;-><init>(Landroid/view/View;I)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    iget-boolean v0, p0, Lde/hdodenhof/circleimageview/CircleImageView;->R:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lde/hdodenhof/circleimageview/CircleImageView;->c()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lde/hdodenhof/circleimageview/CircleImageView;->R:Z

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 7

    iget-boolean v0, p0, Lde/hdodenhof/circleimageview/CircleImageView;->T:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-object v1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->J:Landroid/graphics/Bitmap;

    goto :goto_3

    :cond_0
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    instance-of v2, v0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v2, :cond_2

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_2

    :cond_2
    :try_start_0
    instance-of v2, v0, Landroid/graphics/drawable/ColorDrawable;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v3, Lde/hdodenhof/circleimageview/CircleImageView;->V:Landroid/graphics/Bitmap$Config;

    if-eqz v2, :cond_3

    const/4 v2, 0x2

    :try_start_1
    invoke-static {v2, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    invoke-static {v2, v4, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    :goto_0
    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v3}, Landroid/graphics/Canvas;->getWidth()I

    move-result v4

    invoke-virtual {v3}, Landroid/graphics/Canvas;->getHeight()I

    move-result v5

    const/4 v6, 0x0

    invoke-virtual {v0, v6, v6, v4, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    invoke-virtual {v0, v3}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object v1, v2

    goto :goto_2

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_2
    iput-object v1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->J:Landroid/graphics/Bitmap;

    :goto_3
    invoke-virtual {p0}, Lde/hdodenhof/circleimageview/CircleImageView;->c()V

    return-void
.end method

.method public final c()V
    .locals 8

    iget-boolean v0, p0, Lde/hdodenhof/circleimageview/CircleImageView;->Q:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iput-boolean v1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->R:Z

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lde/hdodenhof/circleimageview/CircleImageView;->J:Landroid/graphics/Bitmap;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void

    :cond_2
    new-instance v0, Landroid/graphics/BitmapShader;

    iget-object v2, p0, Lde/hdodenhof/circleimageview/CircleImageView;->J:Landroid/graphics/Bitmap;

    sget-object v3, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct {v0, v2, v3, v3}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    iput-object v0, p0, Lde/hdodenhof/circleimageview/CircleImageView;->K:Landroid/graphics/BitmapShader;

    iget-object v0, p0, Lde/hdodenhof/circleimageview/CircleImageView;->z:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    iget-object v2, p0, Lde/hdodenhof/circleimageview/CircleImageView;->K:Landroid/graphics/BitmapShader;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    iget-object v3, p0, Lde/hdodenhof/circleimageview/CircleImageView;->E:Landroid/graphics/Paint;

    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget v2, p0, Lde/hdodenhof/circleimageview/CircleImageView;->G:I

    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget v2, p0, Lde/hdodenhof/circleimageview/CircleImageView;->H:I

    int-to-float v2, v2

    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    iget-object v3, p0, Lde/hdodenhof/circleimageview/CircleImageView;->F:Landroid/graphics/Paint;

    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget v1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->I:I

    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->J:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    iput v1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->M:I

    iget-object v1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->J:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    iput v1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->L:I

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    int-to-float v4, v4

    sub-int/2addr v1, v3

    int-to-float v1, v1

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v1, v5

    add-float/2addr v1, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    int-to-float v4, v4

    sub-int/2addr v2, v3

    int-to-float v2, v2

    div-float/2addr v2, v5

    add-float/2addr v2, v4

    new-instance v4, Landroid/graphics/RectF;

    int-to-float v3, v3

    add-float v6, v1, v3

    add-float/2addr v3, v2

    invoke-direct {v4, v1, v2, v6, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    iget-object v1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->x:Landroid/graphics/RectF;

    invoke-virtual {v1, v4}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v2

    iget v3, p0, Lde/hdodenhof/circleimageview/CircleImageView;->H:I

    int-to-float v3, v3

    sub-float/2addr v2, v3

    div-float/2addr v2, v5

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v3

    iget v4, p0, Lde/hdodenhof/circleimageview/CircleImageView;->H:I

    int-to-float v4, v4

    sub-float/2addr v3, v4

    div-float/2addr v3, v5

    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v2

    iput v2, p0, Lde/hdodenhof/circleimageview/CircleImageView;->O:F

    iget-object v2, p0, Lde/hdodenhof/circleimageview/CircleImageView;->w:Landroid/graphics/RectF;

    invoke-virtual {v2, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    iget-boolean v1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->S:Z

    if-nez v1, :cond_3

    iget v1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->H:I

    if-lez v1, :cond_3

    int-to-float v1, v1

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float/2addr v1, v3

    invoke-virtual {v2, v1, v1}, Landroid/graphics/RectF;->inset(FF)V

    :cond_3
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v1

    div-float/2addr v1, v5

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v3

    div-float/2addr v3, v5

    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    move-result v1

    iput v1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->N:F

    if-eqz v0, :cond_4

    iget-object v1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->P:Landroid/graphics/ColorFilter;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    :cond_4
    const/4 v0, 0x0

    iget-object v1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->y:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget v0, p0, Lde/hdodenhof/circleimageview/CircleImageView;->L:I

    int-to-float v0, v0

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v3

    mul-float/2addr v3, v0

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v0

    iget v4, p0, Lde/hdodenhof/circleimageview/CircleImageView;->M:I

    int-to-float v4, v4

    mul-float/2addr v0, v4

    cmpl-float v0, v3, v0

    const/high16 v3, 0x3f000000    # 0.5f

    const/4 v4, 0x0

    if-lez v0, :cond_5

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v0

    iget v5, p0, Lde/hdodenhof/circleimageview/CircleImageView;->M:I

    int-to-float v5, v5

    div-float/2addr v0, v5

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v5

    iget v6, p0, Lde/hdodenhof/circleimageview/CircleImageView;->L:I

    int-to-float v6, v6

    mul-float/2addr v6, v0

    sub-float/2addr v5, v6

    mul-float/2addr v5, v3

    move v7, v5

    move v5, v4

    move v4, v7

    goto :goto_0

    :cond_5
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v0

    iget v5, p0, Lde/hdodenhof/circleimageview/CircleImageView;->L:I

    int-to-float v5, v5

    div-float/2addr v0, v5

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v5

    iget v6, p0, Lde/hdodenhof/circleimageview/CircleImageView;->M:I

    int-to-float v6, v6

    mul-float/2addr v6, v0

    sub-float/2addr v5, v6

    mul-float/2addr v5, v3

    :goto_0
    invoke-virtual {v1, v0, v0}, Landroid/graphics/Matrix;->setScale(FF)V

    add-float/2addr v4, v3

    float-to-int v0, v4

    int-to-float v0, v0

    iget v4, v2, Landroid/graphics/RectF;->left:F

    add-float/2addr v0, v4

    add-float/2addr v5, v3

    float-to-int v3, v5

    int-to-float v3, v3

    iget v2, v2, Landroid/graphics/RectF;->top:F

    add-float/2addr v3, v2

    invoke-virtual {v1, v0, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    iget-object v0, p0, Lde/hdodenhof/circleimageview/CircleImageView;->K:Landroid/graphics/BitmapShader;

    invoke-virtual {v0, v1}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public getBorderColor()I
    .locals 1

    iget v0, p0, Lde/hdodenhof/circleimageview/CircleImageView;->G:I

    return v0
.end method

.method public getBorderWidth()I
    .locals 1

    iget v0, p0, Lde/hdodenhof/circleimageview/CircleImageView;->H:I

    return v0
.end method

.method public getCircleBackgroundColor()I
    .locals 1

    iget v0, p0, Lde/hdodenhof/circleimageview/CircleImageView;->I:I

    return v0
.end method

.method public getColorFilter()Landroid/graphics/ColorFilter;
    .locals 1

    iget-object v0, p0, Lde/hdodenhof/circleimageview/CircleImageView;->P:Landroid/graphics/ColorFilter;

    return-object v0
.end method

.method public getScaleType()Landroid/widget/ImageView$ScaleType;
    .locals 1

    sget-object v0, Lde/hdodenhof/circleimageview/CircleImageView;->U:Landroid/widget/ImageView$ScaleType;

    return-object v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    iget-boolean v0, p0, Lde/hdodenhof/circleimageview/CircleImageView;->T:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    return-void

    :cond_0
    iget-object v0, p0, Lde/hdodenhof/circleimageview/CircleImageView;->J:Landroid/graphics/Bitmap;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget v0, p0, Lde/hdodenhof/circleimageview/CircleImageView;->I:I

    iget-object v1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->w:Landroid/graphics/RectF;

    if-eqz v0, :cond_2

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v2

    iget v3, p0, Lde/hdodenhof/circleimageview/CircleImageView;->N:F

    iget-object v4, p0, Lde/hdodenhof/circleimageview/CircleImageView;->F:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_2
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v1

    iget v2, p0, Lde/hdodenhof/circleimageview/CircleImageView;->N:F

    iget-object v3, p0, Lde/hdodenhof/circleimageview/CircleImageView;->z:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget v0, p0, Lde/hdodenhof/circleimageview/CircleImageView;->H:I

    if-lez v0, :cond_3

    iget-object v0, p0, Lde/hdodenhof/circleimageview/CircleImageView;->x:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v1

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    move-result v0

    iget v2, p0, Lde/hdodenhof/circleimageview/CircleImageView;->O:F

    iget-object v3, p0, Lde/hdodenhof/circleimageview/CircleImageView;->E:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v0, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    invoke-virtual {p0}, Lde/hdodenhof/circleimageview/CircleImageView;->c()V

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7

    iget-boolean v0, p0, Lde/hdodenhof/circleimageview/CircleImageView;->T:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iget-object v2, p0, Lde/hdodenhof/circleimageview/CircleImageView;->x:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerX()F

    move-result v3

    sub-float/2addr v0, v3

    float-to-double v3, v0

    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v3

    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    move-result v0

    sub-float/2addr v1, v0

    float-to-double v0, v1

    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    add-double/2addr v0, v3

    iget v2, p0, Lde/hdodenhof/circleimageview/CircleImageView;->O:F

    float-to-double v2, v2

    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_2

    :goto_0
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public setAdjustViewBounds(Z)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "adjustViewBounds not supported."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setBorderColor(I)V
    .locals 1

    iget v0, p0, Lde/hdodenhof/circleimageview/CircleImageView;->G:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->G:I

    iget-object v0, p0, Lde/hdodenhof/circleimageview/CircleImageView;->E:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setBorderOverlay(Z)V
    .locals 1

    iget-boolean v0, p0, Lde/hdodenhof/circleimageview/CircleImageView;->S:Z

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->S:Z

    invoke-virtual {p0}, Lde/hdodenhof/circleimageview/CircleImageView;->c()V

    return-void
.end method

.method public setBorderWidth(I)V
    .locals 1

    iget v0, p0, Lde/hdodenhof/circleimageview/CircleImageView;->H:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->H:I

    invoke-virtual {p0}, Lde/hdodenhof/circleimageview/CircleImageView;->c()V

    return-void
.end method

.method public setCircleBackgroundColor(I)V
    .locals 1

    iget v0, p0, Lde/hdodenhof/circleimageview/CircleImageView;->I:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->I:I

    iget-object v0, p0, Lde/hdodenhof/circleimageview/CircleImageView;->F:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setCircleBackgroundColorResource(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lde/hdodenhof/circleimageview/CircleImageView;->setCircleBackgroundColor(I)V

    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    iget-object v0, p0, Lde/hdodenhof/circleimageview/CircleImageView;->P:Landroid/graphics/ColorFilter;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->P:Landroid/graphics/ColorFilter;

    iget-object v0, p0, Lde/hdodenhof/circleimageview/CircleImageView;->z:Landroid/graphics/Paint;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setDisableCircularTransformation(Z)V
    .locals 1

    iget-boolean v0, p0, Lde/hdodenhof/circleimageview/CircleImageView;->T:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lde/hdodenhof/circleimageview/CircleImageView;->T:Z

    invoke-virtual {p0}, Lde/hdodenhof/circleimageview/CircleImageView;->b()V

    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    invoke-virtual {p0}, Lde/hdodenhof/circleimageview/CircleImageView;->b()V

    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Lde/hdodenhof/circleimageview/CircleImageView;->b()V

    return-void
.end method

.method public setImageResource(I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p0}, Lde/hdodenhof/circleimageview/CircleImageView;->b()V

    return-void
.end method

.method public setImageURI(Landroid/net/Uri;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageURI(Landroid/net/Uri;)V

    invoke-virtual {p0}, Lde/hdodenhof/circleimageview/CircleImageView;->b()V

    return-void
.end method

.method public final setPadding(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->setPadding(IIII)V

    invoke-virtual {p0}, Lde/hdodenhof/circleimageview/CircleImageView;->c()V

    return-void
.end method

.method public final setPaddingRelative(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->setPaddingRelative(IIII)V

    invoke-virtual {p0}, Lde/hdodenhof/circleimageview/CircleImageView;->c()V

    return-void
.end method

.method public setScaleType(Landroid/widget/ImageView$ScaleType;)V
    .locals 3

    sget-object v0, Lde/hdodenhof/circleimageview/CircleImageView;->U:Landroid/widget/ImageView$ScaleType;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ScaleType "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " not supported."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
