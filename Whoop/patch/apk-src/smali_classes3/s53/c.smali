.class public abstract Ls53/c;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public E:Z

.field public F:Landroid/graphics/Bitmap;

.field public final G:Landroid/graphics/Path;

.field public final w:Landroid/graphics/Paint;

.field public final x:Landroid/graphics/Path;

.field public y:Landroid/graphics/drawable/Drawable;

.field public final z:Lq30/w0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Ls53/c;->w:Landroid/graphics/Paint;

    new-instance v2, Landroid/graphics/Path;

    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    iput-object v2, p0, Ls53/c;->x:Landroid/graphics/Path;

    new-instance v2, Landroid/graphics/PorterDuffXfermode;

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->DST_OUT:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v2, v3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    const/4 v3, 0x0

    iput-object v3, p0, Ls53/c;->y:Landroid/graphics/drawable/Drawable;

    new-instance v4, Lq30/w0;

    const/16 v5, 0xd

    invoke-direct {v4, v5}, Lq30/w0;-><init>(I)V

    iput-object v4, p0, Ls53/c;->z:Lq30/w0;

    iput-boolean v1, p0, Ls53/c;->E:Z

    new-instance v4, Landroid/graphics/Path;

    invoke-direct {v4}, Landroid/graphics/Path;-><init>()V

    iput-object v4, p0, Ls53/c;->G:Landroid/graphics/Path;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    invoke-virtual {p0, v1}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    const/4 v4, 0x0

    invoke-virtual {p0, v4}, Landroid/view/View;->setWillNotDraw(Z)V

    const v5, -0xffff01

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v5, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    invoke-virtual {p0, v1, v3}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    if-eqz p2, :cond_1

    sget-object v0, Ls53/a;->b:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, -0x1

    invoke-virtual {p1, v4, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    if-eq p2, v0, :cond_0

    invoke-virtual {p0, v0}, Ls53/c;->setDrawable(I)V

    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_1
    return-void
.end method


# virtual methods
.method public final a(F)F
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr p1, v0

    return p1
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ls53/c;->E:Z

    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    return-void
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 24

    move-object/from16 v1, p0

    invoke-super/range {p0 .. p1}, Landroid/view/View;->dispatchDraw(Landroid/graphics/Canvas;)V

    iget-boolean v0, v1, Ls53/c;->E:Z

    iget-object v3, v1, Ls53/c;->G:Landroid/graphics/Path;

    const/4 v9, 0x0

    if-eqz v0, :cond_14

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v10

    invoke-virtual {v3}, Landroid/graphics/Path;->reset()V

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    const/high16 v11, 0x3f800000    # 1.0f

    mul-float v6, v4, v11

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v4

    int-to-float v4, v4

    mul-float v7, v4, v11

    sget-object v8, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    iget-object v5, v1, Ls53/c;->z:Lq30/w0;

    if-eqz v5, :cond_12

    iget-object v6, v5, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v6, Landroid/graphics/Path;

    if-lez v0, :cond_12

    if-lez v10, :cond_12

    invoke-virtual {v6}, Landroid/graphics/Path;->reset()V

    iget-object v7, v5, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v7, Lt53/a;

    if-eqz v7, :cond_c

    check-cast v7, Lty/c;

    new-instance v8, Landroid/graphics/RectF;

    int-to-float v12, v0

    int-to-float v13, v10

    invoke-direct {v8, v9, v9, v12, v13}, Landroid/graphics/RectF;-><init>(FFFF)V

    iget-object v7, v7, Lty/c;->x:Ljava/lang/Object;

    check-cast v7, Lio/github/florent37/shapeofview/shapes/BubbleView;

    iget v12, v7, Lio/github/florent37/shapeofview/shapes/BubbleView;->I:F

    new-instance v13, Landroid/graphics/Path;

    invoke-direct {v13}, Landroid/graphics/Path;-><init>()V

    cmpg-float v14, v12, v9

    if-gez v14, :cond_0

    move v15, v9

    goto :goto_0

    :cond_0
    move v15, v12

    :goto_0
    if-gez v14, :cond_1

    move/from16 v16, v9

    goto :goto_1

    :cond_1
    move/from16 v16, v12

    :goto_1
    if-gez v14, :cond_2

    move/from16 v17, v9

    goto :goto_2

    :cond_2
    move/from16 v17, v12

    :goto_2
    if-gez v14, :cond_3

    move v12, v9

    :cond_3
    iget v14, v7, Lio/github/florent37/shapeofview/shapes/BubbleView;->H:I

    move/from16 v18, v11

    const/4 v11, 0x3

    move/from16 v19, v9

    if-ne v14, v11, :cond_4

    iget v9, v7, Lio/github/florent37/shapeofview/shapes/BubbleView;->J:F

    :cond_4
    const/4 v4, 0x2

    if-ne v14, v4, :cond_5

    iget v11, v7, Lio/github/florent37/shapeofview/shapes/BubbleView;->J:F

    goto :goto_3

    :cond_5
    move/from16 v11, v19

    :goto_3
    const/4 v4, 0x4

    if-ne v14, v4, :cond_6

    iget v4, v7, Lio/github/florent37/shapeofview/shapes/BubbleView;->J:F

    move/from16 v20, v4

    goto :goto_4

    :cond_6
    move/from16 v20, v19

    :goto_4
    const/4 v4, 0x1

    if-ne v14, v4, :cond_7

    iget v14, v7, Lio/github/florent37/shapeofview/shapes/BubbleView;->J:F

    goto :goto_5

    :cond_7
    move/from16 v14, v19

    :goto_5
    iget v4, v8, Landroid/graphics/RectF;->left:F

    add-float/2addr v9, v4

    move/from16 v21, v4

    iget v4, v8, Landroid/graphics/RectF;->top:F

    add-float/2addr v11, v4

    iget v4, v8, Landroid/graphics/RectF;->right:F

    move/from16 v22, v4

    sub-float v4, v22, v20

    move/from16 v20, v12

    iget v12, v8, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v12, v14

    add-float v14, v21, v22

    move/from16 v21, v14

    iget v14, v7, Lio/github/florent37/shapeofview/shapes/BubbleView;->L:F

    mul-float v14, v14, v21

    const/high16 v21, 0x40000000    # 2.0f

    div-float v15, v15, v21

    move/from16 v22, v15

    add-float v15, v9, v22

    invoke-virtual {v13, v15, v11}, Landroid/graphics/Path;->moveTo(FF)V

    iget v2, v7, Lio/github/florent37/shapeofview/shapes/BubbleView;->H:I

    move-object/from16 v23, v3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_8

    iget v2, v7, Lio/github/florent37/shapeofview/shapes/BubbleView;->K:F

    sub-float v2, v14, v2

    invoke-virtual {v13, v2, v11}, Landroid/graphics/Path;->lineTo(FF)V

    iget v2, v8, Landroid/graphics/RectF;->top:F

    invoke-virtual {v13, v14, v2}, Landroid/graphics/Path;->lineTo(FF)V

    iget v2, v7, Lio/github/florent37/shapeofview/shapes/BubbleView;->K:F

    add-float/2addr v2, v14

    invoke-virtual {v13, v2, v11}, Landroid/graphics/Path;->lineTo(FF)V

    :cond_8
    div-float v16, v16, v21

    sub-float v2, v4, v16

    invoke-virtual {v13, v2, v11}, Landroid/graphics/Path;->lineTo(FF)V

    add-float v2, v11, v16

    invoke-virtual {v13, v4, v11, v4, v2}, Landroid/graphics/Path;->quadTo(FFFF)V

    iget v2, v7, Lio/github/florent37/shapeofview/shapes/BubbleView;->H:I

    const/4 v3, 0x4

    if-ne v2, v3, :cond_9

    iget v2, v7, Lio/github/florent37/shapeofview/shapes/BubbleView;->L:F

    sub-float v2, v18, v2

    mul-float/2addr v2, v12

    sub-float v2, v12, v2

    iget v3, v7, Lio/github/florent37/shapeofview/shapes/BubbleView;->K:F

    sub-float/2addr v2, v3

    invoke-virtual {v13, v4, v2}, Landroid/graphics/Path;->lineTo(FF)V

    iget v2, v8, Landroid/graphics/RectF;->right:F

    iget v3, v7, Lio/github/florent37/shapeofview/shapes/BubbleView;->L:F

    sub-float v3, v18, v3

    mul-float/2addr v3, v12

    sub-float v3, v12, v3

    invoke-virtual {v13, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    iget v2, v7, Lio/github/florent37/shapeofview/shapes/BubbleView;->L:F

    sub-float v2, v18, v2

    mul-float/2addr v2, v12

    sub-float v2, v12, v2

    iget v3, v7, Lio/github/florent37/shapeofview/shapes/BubbleView;->K:F

    add-float/2addr v2, v3

    invoke-virtual {v13, v4, v2}, Landroid/graphics/Path;->lineTo(FF)V

    :cond_9
    div-float v2, v20, v21

    sub-float v3, v12, v2

    invoke-virtual {v13, v4, v3}, Landroid/graphics/Path;->lineTo(FF)V

    sub-float v2, v4, v2

    invoke-virtual {v13, v4, v12, v2, v12}, Landroid/graphics/Path;->quadTo(FFFF)V

    iget v2, v7, Lio/github/florent37/shapeofview/shapes/BubbleView;->H:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_a

    iget v2, v7, Lio/github/florent37/shapeofview/shapes/BubbleView;->K:F

    add-float/2addr v2, v14

    invoke-virtual {v13, v2, v12}, Landroid/graphics/Path;->lineTo(FF)V

    iget v2, v8, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v13, v14, v2}, Landroid/graphics/Path;->lineTo(FF)V

    iget v2, v7, Lio/github/florent37/shapeofview/shapes/BubbleView;->K:F

    sub-float/2addr v14, v2

    invoke-virtual {v13, v14, v12}, Landroid/graphics/Path;->lineTo(FF)V

    :cond_a
    div-float v17, v17, v21

    add-float v2, v9, v17

    invoke-virtual {v13, v2, v12}, Landroid/graphics/Path;->lineTo(FF)V

    sub-float v2, v12, v17

    invoke-virtual {v13, v9, v12, v9, v2}, Landroid/graphics/Path;->quadTo(FFFF)V

    iget v2, v7, Lio/github/florent37/shapeofview/shapes/BubbleView;->H:I

    const/4 v3, 0x3

    if-ne v2, v3, :cond_b

    iget v2, v7, Lio/github/florent37/shapeofview/shapes/BubbleView;->L:F

    sub-float v2, v18, v2

    mul-float/2addr v2, v12

    sub-float v2, v12, v2

    iget v3, v7, Lio/github/florent37/shapeofview/shapes/BubbleView;->K:F

    add-float/2addr v2, v3

    invoke-virtual {v13, v9, v2}, Landroid/graphics/Path;->lineTo(FF)V

    iget v2, v8, Landroid/graphics/RectF;->left:F

    iget v3, v7, Lio/github/florent37/shapeofview/shapes/BubbleView;->L:F

    sub-float v3, v18, v3

    mul-float/2addr v3, v12

    sub-float v3, v12, v3

    invoke-virtual {v13, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    iget v2, v7, Lio/github/florent37/shapeofview/shapes/BubbleView;->L:F

    sub-float v2, v18, v2

    mul-float/2addr v2, v12

    sub-float/2addr v12, v2

    iget v2, v7, Lio/github/florent37/shapeofview/shapes/BubbleView;->K:F

    sub-float/2addr v12, v2

    invoke-virtual {v13, v9, v12}, Landroid/graphics/Path;->lineTo(FF)V

    :cond_b
    add-float v2, v11, v22

    invoke-virtual {v13, v9, v2}, Landroid/graphics/Path;->lineTo(FF)V

    invoke-virtual {v13, v9, v11, v15, v11}, Landroid/graphics/Path;->quadTo(FFFF)V

    invoke-virtual {v13}, Landroid/graphics/Path;->close()V

    goto :goto_6

    :cond_c
    move-object/from16 v23, v3

    move/from16 v19, v9

    const/4 v13, 0x0

    :goto_6
    if-eqz v13, :cond_d

    invoke-virtual {v6, v13}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    :cond_d
    iget-object v2, v1, Ls53/c;->x:Landroid/graphics/Path;

    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    invoke-virtual {v2, v6}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    invoke-virtual {v1}, Landroid/view/View;->isInEditMode()Z

    move-result v3

    if-nez v3, :cond_e

    iget-object v3, v1, Ls53/c;->y:Landroid/graphics/drawable/Drawable;

    if-eqz v3, :cond_11

    :cond_e
    iget-object v3, v1, Ls53/c;->F:Landroid/graphics/Bitmap;

    if-eqz v3, :cond_f

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    :cond_f
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v10, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    iput-object v3, v1, Ls53/c;->F:Landroid/graphics/Bitmap;

    new-instance v3, Landroid/graphics/Canvas;

    iget-object v4, v1, Ls53/c;->F:Landroid/graphics/Bitmap;

    invoke-direct {v3, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iget-object v4, v1, Ls53/c;->y:Landroid/graphics/drawable/Drawable;

    if-eqz v4, :cond_10

    const/4 v6, 0x0

    invoke-virtual {v4, v6, v6, v0, v10}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v0, v1, Ls53/c;->y:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v3}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    goto :goto_7

    :cond_10
    iget-object v0, v5, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Paint;

    invoke-virtual {v3, v2, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_11
    :goto_7
    sget-object v0, Landroid/graphics/Path$Op;->DIFFERENCE:Landroid/graphics/Path$Op;

    move-object/from16 v3, v23

    invoke-virtual {v3, v2, v0}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    sget-object v0, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {v1}, Lh5/h0;->e(Landroid/view/View;)F

    move-result v0

    cmpl-float v0, v0, v19

    if-lez v0, :cond_13

    :try_start_0
    invoke-virtual {v1}, Ls53/c;->getOutlineProvider()Landroid/view/ViewOutlineProvider;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_8

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_8

    :cond_12
    move/from16 v19, v9

    :cond_13
    :goto_8
    invoke-virtual {v1}, Landroid/view/View;->postInvalidate()V

    const/4 v6, 0x0

    iput-boolean v6, v1, Ls53/c;->E:Z

    goto :goto_9

    :cond_14
    move/from16 v19, v9

    :goto_9
    invoke-virtual {v1}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    iget-object v2, v1, Ls53/c;->w:Landroid/graphics/Paint;

    if-nez v0, :cond_15

    iget-object v0, v1, Ls53/c;->y:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_16

    :cond_15
    move-object/from16 v4, p1

    goto :goto_a

    :cond_16
    move-object/from16 v4, p1

    invoke-virtual {v4, v3, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_b

    :goto_a
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    iget-object v0, v1, Ls53/c;->F:Landroid/graphics/Bitmap;

    move/from16 v3, v19

    invoke-virtual {v4, v0, v3, v3, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :goto_b
    return-void
.end method

.method public getOutlineProvider()Landroid/view/ViewOutlineProvider;
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    new-instance v0, Ls53/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ls53/b;-><init>(Landroid/view/View;I)V

    return-object v0
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ls53/c;->b()V

    :cond_0
    return-void
.end method

.method public setBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 0

    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 0

    return-void
.end method

.method public setClipPathCreator(Lt53/a;)V
    .locals 1

    iget-object v0, p0, Ls53/c;->z:Lq30/w0;

    iput-object p1, v0, Lq30/w0;->z:Ljava/lang/Object;

    invoke-virtual {p0}, Ls53/c;->b()V

    return-void
.end method

.method public setDrawable(I)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lq83/g;->x(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Ls53/c;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls53/c;->y:Landroid/graphics/drawable/Drawable;

    .line 2
    invoke-virtual {p0}, Ls53/c;->b()V

    return-void
.end method
