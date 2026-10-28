.class public final Lou/o;
.super Lou/h;
.source "SourceFile"


# static fields
.field public static final H:Ljava/util/HashSet;


# instance fields
.field public A:F

.field public B:F

.field public C:F

.field public D:F

.field public E:F

.field public F:Z

.field public G:F

.field public final v:Landroid/view/GestureDetector;

.field public w:Z

.field public x:Landroid/graphics/PointF;

.field public y:F

.field public z:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lou/o;->H:Ljava/util/HashSet;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const/16 v1, 0xf

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lio/sentry/android/replay/video/d;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lou/h;-><init>(Landroid/content/Context;Lio/sentry/android/replay/video/d;)V

    new-instance p2, Lc23/n;

    const/4 v0, 0x1

    invoke-direct {p2, p0, v0}, Lc23/n;-><init>(Ljava/lang/Object;I)V

    new-instance v0, Landroid/view/GestureDetector;

    invoke-direct {v0, p1, p2}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lou/o;->v:Landroid/view/GestureDetector;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;)Z
    .locals 4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    iget-boolean v1, p0, Lou/o;->w:Z

    if-eqz v1, :cond_3

    const/4 v1, 0x5

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lou/h;->q:Z

    if-nez v1, :cond_3

    if-ne v0, v2, :cond_3

    iput-boolean v3, p0, Lou/o;->w:Z

    goto :goto_1

    :cond_1
    :goto_0
    iget-boolean v0, p0, Lou/h;->q:Z

    if-eqz v0, :cond_2

    if-eqz v0, :cond_3

    iput-boolean v2, p0, Lou/h;->r:Z

    goto :goto_1

    :cond_2
    iput-boolean v3, p0, Lou/o;->w:Z

    :cond_3
    :goto_1
    invoke-super {p0, p1}, Lou/h;->a(Landroid/view/MotionEvent;)Z

    move-result v0

    iget-object v1, p0, Lou/o;->v:Landroid/view/GestureDetector;

    invoke-virtual {v1, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    or-int/2addr p1, v0

    return p1
.end method

.method public final c()Z
    .locals 14

    iget-boolean v0, p0, Lou/h;->q:Z

    iget-object v1, p0, Lou/e;->l:Ljava/util/ArrayList;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lou/o;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v0, v3, :cond_0

    invoke-virtual {p0}, Lou/o;->i()V

    return v2

    :cond_0
    iget-boolean v0, p0, Lou/o;->w:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lou/o;->x:Landroid/graphics/PointF;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lou/e;->n:Landroid/graphics/PointF;

    :goto_0
    const/4 v4, 0x0

    iput v4, p0, Lou/o;->A:F

    iput v4, p0, Lou/o;->B:F

    move v5, v2

    :goto_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v5, v6, :cond_2

    iget v6, p0, Lou/o;->A:F

    iget-object v7, p0, Lou/a;->d:Landroid/view/MotionEvent;

    invoke-virtual {v7, v5}, Landroid/view/MotionEvent;->getX(I)F

    move-result v7

    iget v8, v0, Landroid/graphics/PointF;->x:F

    sub-float/2addr v7, v8

    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v7

    add-float/2addr v7, v6

    iput v7, p0, Lou/o;->A:F

    iget v6, p0, Lou/o;->B:F

    iget-object v7, p0, Lou/a;->d:Landroid/view/MotionEvent;

    invoke-virtual {v7, v5}, Landroid/view/MotionEvent;->getY(I)F

    move-result v7

    iget v8, v0, Landroid/graphics/PointF;->y:F

    sub-float/2addr v7, v8

    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v7

    add-float/2addr v7, v6

    iput v7, p0, Lou/o;->B:F

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    iget v0, p0, Lou/o;->A:F

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v0, v5

    iput v0, p0, Lou/o;->A:F

    iget v6, p0, Lou/o;->B:F

    mul-float/2addr v6, v5

    iput v6, p0, Lou/o;->B:F

    iget-boolean v5, p0, Lou/o;->w:Z

    if-eqz v5, :cond_3

    iput v6, p0, Lou/o;->z:F

    goto :goto_2

    :cond_3
    float-to-double v7, v0

    float-to-double v5, v6

    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v5

    double-to-float v0, v5

    iput v0, p0, Lou/o;->z:F

    :goto_2
    iget v0, p0, Lou/o;->y:F

    cmpl-float v0, v0, v4

    if-nez v0, :cond_4

    iget v0, p0, Lou/o;->z:F

    iput v0, p0, Lou/o;->y:F

    :cond_4
    iget v0, p0, Lou/o;->y:F

    iget v5, p0, Lou/o;->z:F

    sub-float/2addr v0, v5

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iput v0, p0, Lou/o;->D:F

    iget-boolean v0, p0, Lou/o;->w:Z

    const/high16 v5, 0x3f800000    # 1.0f

    if-eqz v0, :cond_b

    iget-object v0, p0, Lou/a;->d:Landroid/view/MotionEvent;

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget-object v6, p0, Lou/o;->x:Landroid/graphics/PointF;

    iget v6, v6, Landroid/graphics/PointF;->y:F

    cmpg-float v0, v0, v6

    if-gez v0, :cond_5

    iget v0, p0, Lou/o;->z:F

    iget v6, p0, Lou/o;->C:F

    cmpg-float v0, v0, v6

    if-ltz v0, :cond_6

    :cond_5
    iget-object v0, p0, Lou/a;->d:Landroid/view/MotionEvent;

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget-object v6, p0, Lou/o;->x:Landroid/graphics/PointF;

    iget v6, v6, Landroid/graphics/PointF;->y:F

    cmpl-float v0, v0, v6

    if-lez v0, :cond_7

    iget v0, p0, Lou/o;->z:F

    iget v6, p0, Lou/o;->C:F

    cmpl-float v0, v0, v6

    if-lez v0, :cond_7

    :cond_6
    move v0, v3

    goto :goto_3

    :cond_7
    move v0, v2

    :goto_3
    iget v6, p0, Lou/o;->z:F

    iget v7, p0, Lou/o;->C:F

    div-float/2addr v6, v7

    sub-float v6, v5, v6

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v6

    const/high16 v7, 0x3f000000    # 0.5f

    mul-float/2addr v6, v7

    iget v7, p0, Lou/o;->C:F

    cmpg-float v7, v7, v4

    if-gtz v7, :cond_9

    :cond_8
    move v6, v5

    goto :goto_4

    :cond_9
    if-eqz v0, :cond_a

    add-float/2addr v6, v5

    goto :goto_4

    :cond_a
    sub-float v6, v5, v6

    goto :goto_4

    :cond_b
    iget v0, p0, Lou/o;->C:F

    cmpl-float v6, v0, v4

    if-lez v6, :cond_8

    iget v6, p0, Lou/o;->z:F

    div-float/2addr v6, v0

    :goto_4
    iput v6, p0, Lou/o;->G:F

    cmpg-float v0, v6, v5

    if-gez v0, :cond_c

    move v0, v3

    goto :goto_5

    :cond_c
    move v0, v2

    :goto_5
    iput-boolean v0, p0, Lou/o;->F:Z

    iget-boolean v0, p0, Lou/h;->q:Z

    const-string v5, "mapCameraManagerDelegate"

    const/4 v6, 0x0

    if-eqz v0, :cond_1f

    iget v0, p0, Lou/o;->z:F

    cmpl-float v0, v0, v4

    if-lez v0, :cond_1f

    iget-object v0, p0, Lou/a;->h:Ljava/lang/Object;

    check-cast v0, Lov/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lov/g;->a:Lov/o;

    iget-object v1, v0, Lov/o;->u0:Lpv/b;

    iget-object v1, v1, Lpv/b;->J:Lcom/mapbox/maps/ScreenCoordinate;

    if-eqz v1, :cond_d

    goto :goto_6

    :cond_d
    iget-boolean v1, v0, Lov/o;->c0:Z

    if-eqz v1, :cond_e

    iget-object v1, v0, Lov/o;->T:Lcom/mapbox/maps/ScreenCoordinate;

    goto :goto_6

    :cond_e
    iget-object v1, p0, Lou/e;->n:Landroid/graphics/PointF;

    new-instance v4, Lcom/mapbox/maps/ScreenCoordinate;

    iget v7, v1, Landroid/graphics/PointF;->x:F

    float-to-double v7, v7

    iget v1, v1, Landroid/graphics/PointF;->y:F

    float-to-double v9, v1

    invoke-direct {v4, v7, v8, v9, v10}, Lcom/mapbox/maps/ScreenCoordinate;-><init>(DD)V

    move-object v1, v4

    :goto_6
    iget-object v4, v0, Lov/o;->K:Lfv/a;

    const-string v7, "cameraAnimationsPlugin"

    if-eqz v4, :cond_1e

    check-cast v4, Lfv/h;

    invoke-virtual {v4}, Lfv/h;->i()Lcom/mapbox/maps/ScreenCoordinate;

    move-result-object v4

    iput-object v4, v0, Lov/o;->g0:Lcom/mapbox/maps/ScreenCoordinate;

    iget-object v4, v0, Lov/o;->r0:Lcom/mapbox/maps/util/CoreGesturesHandler;

    if-eqz v4, :cond_1d

    invoke-virtual {v4}, Lcom/mapbox/maps/util/CoreGesturesHandler;->notifyCoreGestureStarted()V

    iget-boolean v4, v0, Lov/o;->c0:Z

    sget-object v8, Lov/o;->v0:Lfv/p;

    if-eqz v4, :cond_12

    iget-object v4, p0, Lou/a;->d:Landroid/view/MotionEvent;

    invoke-virtual {v4}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    float-to-double v4, v4

    iget-object v9, v0, Lov/o;->T:Lcom/mapbox/maps/ScreenCoordinate;

    invoke-virtual {v9}, Lcom/mapbox/maps/ScreenCoordinate;->getY()D

    move-result-wide v9

    sub-double/2addr v4, v9

    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    move-result-wide v4

    iget-object v9, p0, Lou/a;->d:Landroid/view/MotionEvent;

    invoke-virtual {v9}, Landroid/view/MotionEvent;->getY()F

    move-result v9

    float-to-double v9, v9

    iget-object v11, v0, Lov/o;->T:Lcom/mapbox/maps/ScreenCoordinate;

    invoke-virtual {v11}, Lcom/mapbox/maps/ScreenCoordinate;->getY()D

    move-result-wide v11

    cmpg-double v9, v9, v11

    if-gez v9, :cond_f

    move v2, v3

    :cond_f
    iget-wide v9, v0, Lov/o;->e0:D

    const-wide/16 v11, 0x0

    sub-double/2addr v4, v11

    sub-double/2addr v9, v11

    div-double/2addr v4, v9

    const-wide/high16 v9, 0x4010000000000000L    # 4.0

    mul-double/2addr v4, v9

    add-double/2addr v4, v11

    iget-wide v9, v0, Lov/o;->f0:D

    if-eqz v2, :cond_10

    sub-double/2addr v9, v4

    goto :goto_7

    :cond_10
    add-double/2addr v9, v4

    :goto_7
    iget-object v2, v0, Lov/o;->u0:Lpv/b;

    iget v2, v2, Lpv/b;->P:F

    float-to-double v4, v2

    mul-double/2addr v9, v4

    iget-object v2, v0, Lov/o;->K:Lfv/a;

    if-eqz v2, :cond_11

    new-instance v4, Lcom/mapbox/maps/CameraOptions$Builder;

    invoke-direct {v4}, Lcom/mapbox/maps/CameraOptions$Builder;-><init>()V

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/mapbox/maps/CameraOptions$Builder;->zoom(Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions$Builder;

    move-result-object v4

    invoke-virtual {v4, v1}, Lcom/mapbox/maps/CameraOptions$Builder;->anchor(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mapbox/maps/CameraOptions$Builder;->build()Lcom/mapbox/maps/CameraOptions;

    move-result-object v1

    const-string v4, "Builder()\n          .zoo\u2026Point)\n          .build()"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lfv/h;

    invoke-virtual {v2, v1, v8, v6}, Lfv/h;->h(Lcom/mapbox/maps/CameraOptions;Lfv/p;Landroid/animation/AnimatorListenerAdapter;)Lcom/mapbox/common/Cancelable;

    goto/16 :goto_8

    :cond_11
    invoke-static {v7}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6

    :cond_12
    iget v4, p0, Lou/o;->G:F

    float-to-double v9, v4

    invoke-static {v9, v10}, Ljava/lang/Math;->log(D)D

    move-result-wide v9

    const-wide v11, 0x3ff921fb54442d18L    # 1.5707963267948966

    invoke-static {v11, v12}, Ljava/lang/Math;->log(D)D

    move-result-wide v11

    div-double/2addr v9, v11

    const-wide v11, 0x3fe4ccccc0000000L    # 0.6499999761581421

    mul-double/2addr v9, v11

    iget-object v4, v0, Lov/o;->u0:Lpv/b;

    iget v11, v4, Lpv/b;->P:F

    float-to-double v11, v11

    mul-double/2addr v9, v11

    iget-boolean v4, v4, Lpv/b;->z:Z

    if-eqz v4, :cond_18

    iget-object v4, v0, Lov/o;->K:Lfv/a;

    if-eqz v4, :cond_17

    iget-object v4, v0, Lov/o;->I:Lcom/mapbox/maps/MapboxMap;

    if-eqz v4, :cond_16

    invoke-interface {v4}, Lmv/a;->getCameraState()Lcom/mapbox/maps/CameraState;

    move-result-object v4

    invoke-virtual {v4}, Lcom/mapbox/maps/CameraState;->getZoom()D

    move-result-wide v11

    add-double/2addr v11, v9

    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Double;

    move-result-object v4

    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    const-string v8, "targets"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v9, v0, Lov/o;->I:Lcom/mapbox/maps/MapboxMap;

    if-eqz v9, :cond_15

    invoke-interface {v9}, Lmv/a;->getCameraState()Lcom/mapbox/maps/CameraState;

    move-result-object v5

    invoke-virtual {v5}, Lcom/mapbox/maps/CameraState;->getZoom()D

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    new-instance v9, Lfv/i;

    array-length v10, v4

    invoke-static {v4, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    const-string v10, "Maps-Gestures"

    invoke-direct {v9, v4, v5, v10}, Lfv/i;-><init>([Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/String;)V

    sget-object v4, Lov/m;->E:Lov/m;

    new-instance v5, Lgv/i;

    invoke-direct {v5, v9, v4}, Lgv/i;-><init>(Lfv/i;Lkotlin/jvm/functions/Function1;)V

    iget-object v4, v0, Lov/o;->K:Lfv/a;

    if-eqz v4, :cond_14

    filled-new-array {v1}, [Lcom/mapbox/maps/ScreenCoordinate;

    move-result-object v1

    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lfv/i;

    array-length v8, v1

    invoke-static {v1, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v4, v1, v6, v10}, Lfv/i;-><init>([Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/String;)V

    sget-object v1, Lov/m;->z:Lov/m;

    new-instance v8, Lgv/a;

    invoke-direct {v8, v4, v1}, Lgv/a;-><init>(Lfv/i;Lkotlin/jvm/functions/Function1;)V

    iget-object v1, v0, Lov/o;->K:Lfv/a;

    if-eqz v1, :cond_13

    const/4 v4, 0x2

    new-array v4, v4, [Landroid/animation/ValueAnimator;

    aput-object v8, v4, v2

    aput-object v5, v4, v3

    check-cast v1, Lfv/h;

    invoke-virtual {v1, v4}, Lfv/h;->j([Landroid/animation/ValueAnimator;)V

    goto :goto_8

    :cond_13
    invoke-static {v7}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6

    :cond_14
    invoke-static {v7}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6

    :cond_15
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6

    :cond_16
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6

    :cond_17
    invoke-static {v7}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6

    :cond_18
    iget-object v2, v0, Lov/o;->K:Lfv/a;

    if-eqz v2, :cond_1c

    new-instance v4, Lcom/mapbox/maps/CameraOptions$Builder;

    invoke-direct {v4}, Lcom/mapbox/maps/CameraOptions$Builder;-><init>()V

    iget-object v11, v0, Lov/o;->I:Lcom/mapbox/maps/MapboxMap;

    if-eqz v11, :cond_1b

    invoke-interface {v11}, Lmv/a;->getCameraState()Lcom/mapbox/maps/CameraState;

    move-result-object v5

    invoke-virtual {v5}, Lcom/mapbox/maps/CameraState;->getZoom()D

    move-result-wide v11

    add-double/2addr v11, v9

    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/mapbox/maps/CameraOptions$Builder;->zoom(Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions$Builder;

    move-result-object v4

    invoke-virtual {v4, v1}, Lcom/mapbox/maps/CameraOptions$Builder;->anchor(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mapbox/maps/CameraOptions$Builder;->build()Lcom/mapbox/maps/CameraOptions;

    move-result-object v1

    const-string v4, "Builder()\n            .z\u2026int)\n            .build()"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lfv/h;

    invoke-virtual {v2, v1, v8, v6}, Lfv/h;->h(Lcom/mapbox/maps/CameraOptions;Lfv/p;Landroid/animation/AnimatorListenerAdapter;)Lcom/mapbox/common/Cancelable;

    :goto_8
    iget-object v1, v0, Lov/o;->K:Lfv/a;

    if-eqz v1, :cond_1a

    iget-object v2, v0, Lov/o;->g0:Lcom/mapbox/maps/ScreenCoordinate;

    check-cast v1, Lfv/h;

    invoke-virtual {v1, v2}, Lfv/h;->k(Lcom/mapbox/maps/ScreenCoordinate;)V

    iget-object v1, v0, Lov/o;->R:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_19

    iget v1, p0, Lou/o;->z:F

    iget v2, p0, Lou/o;->C:F

    sub-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    iput v1, v0, Lov/o;->d0:F

    move v2, v3

    goto/16 :goto_d

    :cond_19
    invoke-static {v1}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object v0

    throw v0

    :cond_1a
    invoke-static {v7}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6

    :cond_1b
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6

    :cond_1c
    invoke-static {v7}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6

    :cond_1d
    const-string v0, "coreGesturesHandler"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6

    :cond_1e
    invoke-static {v7}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6

    :cond_1f
    iget-boolean v0, p0, Lou/o;->w:Z

    if-eqz v0, :cond_20

    const/16 v0, 0xf

    goto :goto_9

    :cond_20
    move v0, v3

    :goto_9
    invoke-virtual {p0, v0}, Lou/e;->b(I)Z

    move-result v0

    if-eqz v0, :cond_2f

    iget v0, p0, Lou/o;->D:F

    iget v7, p0, Lou/o;->E:F

    cmpl-float v0, v0, v7

    if-ltz v0, :cond_2f

    iget-object v0, p0, Lou/a;->h:Ljava/lang/Object;

    check-cast v0, Lov/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lov/g;->a:Lov/o;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v1, v3, :cond_21

    move v1, v3

    goto :goto_a

    :cond_21
    move v1, v2

    :goto_a
    iput-boolean v1, v0, Lov/o;->c0:Z

    const-string v7, "gestureState"

    if-eqz v1, :cond_24

    iget-object v1, v0, Lov/o;->u0:Lpv/b;

    iget-boolean v1, v1, Lpv/b;->I:Z

    if-nez v1, :cond_22

    goto/16 :goto_c

    :cond_22
    iget-object v1, v0, Lov/o;->E:Lqg3/d;

    if-eqz v1, :cond_23

    sget-object v2, Lov/a;->y:Lov/a;

    invoke-virtual {v1, v2}, Lqg3/d;->B(Lov/a;)V

    goto/16 :goto_b

    :cond_23
    invoke-static {v7}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6

    :cond_24
    iget-object v1, v0, Lov/o;->u0:Lpv/b;

    iget-boolean v1, v1, Lpv/b;->x:Z

    if-nez v1, :cond_25

    goto/16 :goto_c

    :cond_25
    iget v1, p0, Lou/o;->C:F

    cmpl-float v4, v1, v4

    if-lez v4, :cond_2e

    iget v4, p0, Lou/o;->z:F

    iget-object v8, p0, Lou/a;->d:Landroid/view/MotionEvent;

    invoke-virtual {v8}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v8

    long-to-double v8, v8

    iget-object v10, p0, Lou/a;->e:Landroid/view/MotionEvent;

    invoke-virtual {v10}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v10

    long-to-double v10, v10

    cmpg-double v12, v8, v10

    if-nez v12, :cond_26

    goto/16 :goto_c

    :cond_26
    sub-float/2addr v4, v1

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v1

    float-to-double v12, v1

    sub-double/2addr v8, v10

    div-double/2addr v12, v8

    iget v1, v0, Lov/o;->Y:F

    float-to-double v8, v1

    cmpg-double v1, v12, v8

    if-gez v1, :cond_27

    goto/16 :goto_c

    :cond_27
    iget-object v1, v0, Lov/o;->y:Lio/sentry/android/replay/video/d;

    if-eqz v1, :cond_2d

    iget-object v1, v1, Lio/sentry/android/replay/video/d;->e:Ljava/lang/Object;

    check-cast v1, Lou/i;

    iget-boolean v4, v1, Lou/h;->q:Z

    if-nez v4, :cond_2a

    iget v1, v1, Lou/i;->x:F

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    float-to-double v8, v1

    const-wide v10, 0x3fd999999999999aL    # 0.4

    cmpl-double v1, v8, v10

    if-lez v1, :cond_28

    iget v1, v0, Lov/o;->Z:F

    float-to-double v8, v1

    cmpg-double v1, v12, v8

    if-gez v1, :cond_28

    goto :goto_c

    :cond_28
    iget-object v1, v0, Lov/o;->u0:Lpv/b;

    iget-boolean v1, v1, Lpv/b;->z:Z

    if-nez v1, :cond_2a

    iget-object v1, v0, Lov/o;->E:Lqg3/d;

    if-eqz v1, :cond_29

    sget-object v2, Lov/a;->x:Lov/a;

    invoke-virtual {v1, v2}, Lqg3/d;->B(Lov/a;)V

    goto :goto_b

    :cond_29
    invoke-static {v7}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6

    :cond_2a
    :goto_b
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-double v1, v1

    iput-wide v1, v0, Lov/o;->e0:D

    iget-object v1, v0, Lov/o;->I:Lcom/mapbox/maps/MapboxMap;

    if-eqz v1, :cond_2c

    invoke-interface {v1}, Lmv/a;->getCameraState()Lcom/mapbox/maps/CameraState;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mapbox/maps/CameraState;->getZoom()D

    move-result-wide v1

    iput-wide v1, v0, Lov/o;->f0:D

    invoke-virtual {v0}, Lov/o;->h()V

    iget-object v1, v0, Lov/o;->R:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_2b

    iget v1, p0, Lou/o;->z:F

    iget v2, p0, Lou/o;->C:F

    sub-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    iput v1, v0, Lov/o;->d0:F

    move v2, v3

    goto :goto_c

    :cond_2b
    invoke-static {v1}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object v0

    throw v0

    :cond_2c
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6

    :cond_2d
    const-string v0, "gesturesManager"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6

    :cond_2e
    :goto_c
    if-eqz v2, :cond_2f

    invoke-virtual {p0}, Lou/h;->h()V

    :cond_2f
    :goto_d
    iget v0, p0, Lou/o;->z:F

    iput v0, p0, Lou/o;->C:F

    return v2
.end method

.method public final d()I
    .locals 1

    iget-boolean v0, p0, Lou/h;->q:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lou/o;->w:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final e()Z
    .locals 2

    invoke-super {p0}, Lou/e;->e()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lou/o;->w:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lou/e;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final g()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lou/o;->y:F

    iput v0, p0, Lou/o;->D:F

    iput v0, p0, Lou/o;->z:F

    iput v0, p0, Lou/o;->C:F

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lou/o;->G:F

    return-void
.end method

.method public final i()V
    .locals 15

    invoke-super {p0}, Lou/h;->i()V

    iget-object v0, p0, Lou/a;->h:Ljava/lang/Object;

    check-cast v0, Lov/g;

    iget v1, p0, Lou/h;->t:F

    iget v2, p0, Lou/h;->u:F

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v0, Lov/g;->a:Lov/o;

    iget-object v0, v3, Lov/o;->E:Lqg3/d;

    const/4 v4, 0x0

    if-eqz v0, :cond_a

    iget-boolean v5, v3, Lov/o;->c0:Z

    if-eqz v5, :cond_0

    sget-object v5, Lov/a;->y:Lov/a;

    goto :goto_0

    :cond_0
    sget-object v5, Lov/a;->x:Lov/a;

    :goto_0
    invoke-virtual {v0, v5}, Lqg3/d;->A(Lov/a;)V

    iget-object v0, v3, Lov/o;->R:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_9

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v1

    add-float/2addr v1, v0

    iget-object v0, v3, Lov/o;->u0:Lpv/b;

    iget-boolean v0, v0, Lpv/b;->K:Z

    if-eqz v0, :cond_8

    iget v0, v3, Lov/o;->a0:F

    cmpg-float v0, v1, v0

    if-ltz v0, :cond_8

    iget v0, v3, Lov/o;->d0:F

    div-float/2addr v0, v1

    float-to-double v5, v0

    iget-wide v7, v3, Lov/o;->b0:D

    cmpg-double v0, v5, v7

    if-gez v0, :cond_1

    goto/16 :goto_4

    :cond_1
    float-to-double v0, v1

    iget-boolean v2, p0, Lou/o;->F:Z

    const-wide/high16 v5, 0x4004000000000000L    # 2.5

    mul-double/2addr v0, v5

    const-wide v7, 0x3f1a36e2eb1c432dL    # 1.0E-4

    mul-double/2addr v0, v7

    cmpl-double v7, v5, v0

    if-lez v7, :cond_2

    move-wide v5, v0

    :cond_2
    const-wide/16 v0, 0x0

    cmpg-double v7, v0, v5

    if-gez v7, :cond_3

    goto :goto_1

    :cond_3
    move-wide v5, v0

    :goto_1
    if-eqz v2, :cond_4

    neg-double v5, v5

    :cond_4
    move-wide v6, v5

    iget-object v0, v3, Lov/o;->I:Lcom/mapbox/maps/MapboxMap;

    if-eqz v0, :cond_7

    invoke-interface {v0}, Lmv/a;->getCameraState()Lcom/mapbox/maps/CameraState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/CameraState;->getZoom()D

    move-result-wide v4

    iget-object v0, v3, Lov/o;->u0:Lpv/b;

    iget-object v0, v0, Lpv/b;->J:Lcom/mapbox/maps/ScreenCoordinate;

    if-eqz v0, :cond_5

    :goto_2
    move-object v8, v0

    goto :goto_3

    :cond_5
    iget-boolean v0, v3, Lov/o;->c0:Z

    if-eqz v0, :cond_6

    iget-object v0, v3, Lov/o;->T:Lcom/mapbox/maps/ScreenCoordinate;

    goto :goto_2

    :cond_6
    iget-object v0, p0, Lou/e;->n:Landroid/graphics/PointF;

    new-instance v1, Lcom/mapbox/maps/ScreenCoordinate;

    iget v2, v0, Landroid/graphics/PointF;->x:F

    float-to-double v8, v2

    iget v0, v0, Landroid/graphics/PointF;->y:F

    float-to-double v10, v0

    invoke-direct {v1, v8, v9, v10, v11}, Lcom/mapbox/maps/ScreenCoordinate;-><init>(DD)V

    move-object v8, v1

    :goto_3
    invoke-static {v6, v7}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const/4 v2, 0x1

    int-to-double v9, v2

    const-wide v11, 0x4005bf0a8b145769L    # Math.E

    const-wide/high16 v13, 0x4000000000000000L    # 2.0

    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v11

    div-double/2addr v9, v11

    add-double/2addr v9, v0

    invoke-static {v9, v10}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    const/4 v2, 0x2

    int-to-double v9, v2

    add-double/2addr v0, v9

    const-wide v9, 0x4062c00000000000L    # 150.0

    mul-double/2addr v0, v9

    double-to-long v9, v0

    invoke-virtual/range {v3 .. v10}, Lov/o;->i(DDLcom/mapbox/maps/ScreenCoordinate;J)[Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, v3, Lov/o;->n0:[Landroid/animation/ValueAnimator;

    invoke-virtual {v3, v0}, Lov/o;->n([Landroid/animation/ValueAnimator;)V

    goto :goto_4

    :cond_7
    const-string v0, "mapCameraManagerDelegate"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_8
    :goto_4
    const/4 v0, 0x0

    iput-boolean v0, p0, Lou/o;->w:Z

    return-void

    :cond_9
    invoke-static {v0}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object v0

    throw v0

    :cond_a
    const-string v0, "gestureState"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4
.end method

.method public final j()Ljava/util/HashSet;
    .locals 1

    sget-object v0, Lou/o;->H:Ljava/util/HashSet;

    return-object v0
.end method
