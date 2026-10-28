.class public final Lkv/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lev/s;
.implements Lev/g;
.implements Lev/b;


# instance fields
.field public E:D

.field public F:Lfv/a;

.field public G:Z

.field public H:Llv/b;

.field public final I:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final w:Lkotlin/jvm/functions/Function1;

.field public final x:Landroid/animation/ValueAnimator;

.field public y:Lkv/a;

.field public z:Lcom/mapbox/maps/MapboxMap;


# direct methods
.method public constructor <init>()V
    .locals 17

    move-object/from16 v0, p0

    const/4 v1, 0x2

    new-array v2, v1, [F

    fill-array-data v2, :array_0

    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v2

    const-string v3, "ofFloat(1f, 0f)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v3, Lkv/c;->w:Lkv/c;

    iput-object v3, v0, Lkv/d;->w:Lkotlin/jvm/functions/Function1;

    iput-object v2, v0, Lkv/d;->x:Landroid/animation/ValueAnimator;

    new-instance v4, Llv/b;

    const/4 v5, 0x1

    const v6, 0x800035

    const/high16 v7, 0x40800000    # 4.0f

    const/high16 v11, 0x3f800000    # 1.0f

    const/4 v12, 0x0

    const/16 v16, 0x0

    move v8, v7

    move v9, v7

    move v10, v7

    move v13, v5

    move v14, v5

    move v15, v5

    invoke-direct/range {v4 .. v16}, Llv/b;-><init>(ZIFFFFFFZZZLcom/mapbox/maps/ImageHolder;)V

    iput-object v4, v0, Lkv/d;->H:Llv/b;

    new-instance v3, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v3}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v3, v0, Lkv/d;->I:Ljava/util/concurrent/CopyOnWriteArraySet;

    const-wide/16 v3, 0x1f4

    invoke-virtual {v2, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    invoke-virtual {v2, v3, v4}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    new-instance v3, Lb30/q3;

    invoke-direct {v3, v0, v1}, Lb30/q3;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    new-instance v1, Ldb/e;

    const/4 v3, 0x4

    invoke-direct {v1, v0, v3}, Ldb/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lkv/d;->I:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    iget-object v0, p0, Lkv/d;->x:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    iget-object v0, p0, Lkv/d;->y:Lkv/a;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    check-cast v0, Lkv/b;

    invoke-virtual {v0, v1}, Lkv/b;->setCompassEnabled(Z)V

    return-void

    :cond_0
    const-string v0, "compassView"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final b()V
    .locals 7

    iget-object v0, p0, Lkv/d;->H:Llv/b;

    iget-boolean v1, v0, Llv/b;->w:Z

    invoke-virtual {v0}, Llv/b;->b()Llv/a;

    move-result-object v0

    iput-boolean v1, v0, Llv/a;->a:Z

    invoke-virtual {v0}, Llv/a;->a()Llv/b;

    move-result-object v0

    iput-object v0, p0, Lkv/d;->H:Llv/b;

    iget-object v0, p0, Lkv/d;->y:Lkv/a;

    const/4 v2, 0x0

    const-string v3, "compassView"

    if-eqz v0, :cond_8

    check-cast v0, Lkv/b;

    invoke-virtual {v0, v1}, Lkv/b;->setCompassEnabled(Z)V

    iget-wide v4, p0, Lkv/d;->E:D

    invoke-virtual {p0, v4, v5}, Lkv/d;->h(D)V

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lkv/d;->e()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lkv/d;->y:Lkv/a;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lkv/d;->H:Llv/b;

    iget v1, v1, Llv/b;->G:F

    check-cast v0, Lkv/b;

    invoke-virtual {v0, v1}, Lkv/b;->setCompassAlpha(F)V

    iget-object v0, p0, Lkv/d;->y:Lkv/a;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    check-cast v0, Lkv/b;

    invoke-virtual {v0, v1}, Lkv/b;->setCompassVisible(Z)V

    goto :goto_0

    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_2
    iget-object v0, p0, Lkv/d;->y:Lkv/a;

    if-eqz v0, :cond_7

    const/4 v1, 0x0

    check-cast v0, Lkv/b;

    invoke-virtual {v0, v1}, Lkv/b;->setCompassAlpha(F)V

    iget-object v0, p0, Lkv/d;->y:Lkv/a;

    if-eqz v0, :cond_6

    const/4 v1, 0x0

    check-cast v0, Lkv/b;

    invoke-virtual {v0, v1}, Lkv/b;->setCompassVisible(Z)V

    :goto_0
    iget-object v0, p0, Lkv/d;->y:Lkv/a;

    if-eqz v0, :cond_5

    iget-object v1, p0, Lkv/d;->H:Llv/b;

    iget v1, v1, Llv/b;->x:I

    check-cast v0, Lkv/b;

    invoke-virtual {v0, v1}, Lkv/b;->setCompassGravity(I)V

    iget-object v1, p0, Lkv/d;->H:Llv/b;

    iget-object v1, v1, Llv/b;->L:Lcom/mapbox/maps/ImageHolder;

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1}, Lcom/mapbox/maps/ImageHolder;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v3

    if-eqz v3, :cond_3

    new-instance v4, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-direct {v4, v5, v3}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-virtual {v0, v4}, Lkv/b;->setCompassImage(Landroid/graphics/drawable/Drawable;)V

    :cond_3
    invoke-virtual {v1}, Lcom/mapbox/maps/ImageHolder;->getDrawableId()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    const/4 v3, -0x1

    if-eq v1, v3, :cond_4

    invoke-static {v2, v1}, Lq83/g;->x(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lkv/b;->setCompassImage(Landroid/graphics/drawable/Drawable;)V

    :cond_4
    iget-object v1, p0, Lkv/d;->H:Llv/b;

    iget v1, v1, Llv/b;->H:F

    invoke-virtual {v0, v1}, Lkv/b;->setCompassRotation(F)V

    iget-object v1, p0, Lkv/d;->H:Llv/b;

    iget-boolean v1, v1, Llv/b;->w:Z

    invoke-virtual {v0, v1}, Lkv/b;->setCompassEnabled(Z)V

    iget-object v1, p0, Lkv/d;->H:Llv/b;

    iget v1, v1, Llv/b;->G:F

    invoke-virtual {v0, v1}, Lkv/b;->setCompassAlpha(F)V

    iget-object v1, p0, Lkv/d;->H:Llv/b;

    iget v2, v1, Llv/b;->y:F

    float-to-int v2, v2

    iget v3, v1, Llv/b;->z:F

    float-to-int v3, v3

    iget v4, v1, Llv/b;->E:F

    float-to-int v4, v4

    iget v1, v1, Llv/b;->F:F

    float-to-int v1, v1

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    const-string v6, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {v5, v2, v3, v4, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    iget-wide v1, p0, Lkv/d;->E:D

    invoke-virtual {p0, v1, v2}, Lkv/d;->h(D)V

    invoke-interface {v0}, Lkv/a;->requestLayout()V

    return-void

    :cond_5
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_6
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_7
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_8
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method public final c(Landroid/view/View;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lkv/a;

    if-eqz v0, :cond_0

    check-cast p1, Lkv/a;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    iput-object p1, p0, Lkv/d;->y:Lkv/a;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lkv/d;->i(Z)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The provided view needs to implement CompassContract.CompassView"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final d(Lcom/mapbox/geojson/Point;Lcom/mapbox/maps/EdgeInsets;DDD)V
    .locals 0

    invoke-virtual {p0, p7, p8}, Lkv/d;->h(D)V

    return-void
.end method

.method public final e()Z
    .locals 7

    iget-object v0, p0, Lkv/d;->H:Llv/b;

    iget-boolean v0, v0, Llv/b;->J:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lkv/d;->y:Lkv/a;

    const/4 v1, 0x0

    const-string v2, "compassView"

    if-eqz v0, :cond_2

    check-cast v0, Lkv/b;

    invoke-virtual {v0}, Lkv/b;->getCompassRotation()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v3, v0

    const-wide v5, 0x4076700000000000L    # 359.0

    cmpl-double v0, v3, v5

    if-gez v0, :cond_1

    iget-object v0, p0, Lkv/d;->y:Lkv/a;

    if-eqz v0, :cond_0

    check-cast v0, Lkv/b;

    invoke-virtual {v0}, Lkv/b;->getCompassRotation()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_3

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public final f(Lev/i;)V
    .locals 2

    iget-object v0, p1, Lev/i;->b:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/MapboxMap;

    iput-object v0, p0, Lkv/d;->z:Lcom/mapbox/maps/MapboxMap;

    invoke-interface {v0}, Lmv/a;->getCameraState()Lcom/mapbox/maps/CameraState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/CameraState;->getBearing()D

    move-result-wide v0

    iput-wide v0, p0, Lkv/d;->E:D

    iget-object p1, p1, Lev/i;->i:Ljava/lang/Object;

    check-cast p1, Lcom/mapbox/maps/MapController;

    const-string v0, "MAPBOX_CAMERA_PLUGIN_ID"

    invoke-interface {p1, v0}, Lmv/f;->getPlugin(Ljava/lang/String;)Lev/j;

    move-result-object p1

    check-cast p1, Lfv/a;

    if-eqz p1, :cond_0

    iput-object p1, p0, Lkv/d;->F:Lfv/a;

    return-void

    :cond_0
    new-instance p1, Lcom/mapbox/maps/plugin/InvalidPluginConfigurationException;

    const-string v0, "Can\'t look up an instance of plugin, is it available on the clazz path and loaded through the map?"

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final g(Lcom/mapbox/maps/MapView;Landroid/util/AttributeSet;F)Landroid/view/View;
    .locals 4

    const-string v0, "mapView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "mapView.context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lkv/e;->a:[I

    const/4 v3, 0x0

    invoke-virtual {v0, p2, v2, v3, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    const-string v0, "context.obtainStyledAttr\u2026ble.mapbox_MapView, 0, 0)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Ljv/a;

    const/4 v2, 0x1

    invoke-direct {v0, p2, p3, v2}, Ljv/a;-><init>(Landroid/content/res/TypedArray;FI)V

    new-instance p3, Llv/a;

    invoke-direct {p3}, Llv/a;-><init>()V

    invoke-virtual {v0, p3}, Ljv/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p3}, Llv/a;->a()Llv/b;

    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    iput-object p3, p0, Lkv/d;->H:Llv/b;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lkv/d;->w:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Lkv/b;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p0, p2, Lkv/b;->w:Lkv/d;

    check-cast p1, Landroid/view/View;

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    throw p1
.end method

.method public final h(D)V
    .locals 1

    iput-wide p1, p0, Lkv/d;->E:D

    iget-object v0, p0, Lkv/d;->y:Lkv/a;

    if-eqz v0, :cond_0

    double-to-float p1, p1

    neg-float p1, p1

    check-cast v0, Lkv/b;

    invoke-virtual {v0, p1}, Lkv/b;->setCompassRotation(F)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lkv/d;->i(Z)V

    return-void

    :cond_0
    const-string p1, "compassView"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final i(Z)V
    .locals 6

    iget-object v0, p0, Lkv/d;->y:Lkv/a;

    const/4 v1, 0x0

    const-string v2, "compassView"

    if-eqz v0, :cond_8

    check-cast v0, Lkv/b;

    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lkv/d;->e()Z

    move-result v0

    const/4 v3, 0x0

    iget-object v4, p0, Lkv/d;->x:Landroid/animation/ValueAnimator;

    const/4 v5, 0x1

    if-eqz v0, :cond_5

    iget-boolean v0, p0, Lkv/d;->G:Z

    if-eqz v0, :cond_1

    :goto_0
    return-void

    :cond_1
    iput-boolean v5, p0, Lkv/d;->G:Z

    if-eqz p1, :cond_2

    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->start()V

    return-void

    :cond_2
    iget-object p1, p0, Lkv/d;->y:Lkv/a;

    if-eqz p1, :cond_4

    check-cast p1, Lkv/b;

    invoke-virtual {p1, v3}, Lkv/b;->setCompassVisible(Z)V

    iget-object p1, p0, Lkv/d;->y:Lkv/a;

    if-eqz p1, :cond_3

    const/4 v0, 0x0

    check-cast p1, Lkv/b;

    invoke-virtual {p1, v0}, Lkv/b;->setCompassAlpha(F)V

    return-void

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_5
    iput-boolean v3, p0, Lkv/d;->G:Z

    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->cancel()V

    iget-object p1, p0, Lkv/d;->y:Lkv/a;

    if-eqz p1, :cond_7

    check-cast p1, Lkv/b;

    invoke-virtual {p1, v5}, Lkv/b;->setCompassVisible(Z)V

    iget-object p1, p0, Lkv/d;->y:Lkv/a;

    if-eqz p1, :cond_6

    iget-object v0, p0, Lkv/d;->H:Llv/b;

    iget v0, v0, Llv/b;->G:F

    check-cast p1, Lkv/b;

    invoke-virtual {p1, v0}, Lkv/b;->setCompassAlpha(F)V

    return-void

    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_7
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_8
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public initialize()V
    .locals 0

    invoke-virtual {p0}, Lkv/d;->b()V

    return-void
.end method

.method public final onStart()V
    .locals 2

    iget-wide v0, p0, Lkv/d;->E:D

    invoke-virtual {p0, v0, v1}, Lkv/d;->h(D)V

    return-void
.end method

.method public final onStop()V
    .locals 1

    iget-object v0, p0, Lkv/d;->x:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    return-void
.end method
