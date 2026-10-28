.class public final Lou/i;
.super Lou/h;
.source "SourceFile"


# static fields
.field public static final y:Ljava/util/HashSet;


# instance fields
.field public v:F

.field public w:F

.field public x:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lou/i;->y:Ljava/util/HashSet;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final b(I)Z
    .locals 1

    iget p1, p0, Lou/i;->w:F

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget v0, p0, Lou/i;->v:F

    cmpl-float p1, p1, v0

    if-ltz p1, :cond_0

    const/4 p1, 0x2

    invoke-super {p0, p1}, Lou/e;->b(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final c()Z
    .locals 14

    new-instance v0, Lou/g;

    iget-object v1, p0, Lou/e;->l:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-direct {v0, v3, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Lou/e;->m:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lou/d;

    iget v1, v0, Lou/d;->b:F

    float-to-double v5, v1

    iget v1, v0, Lou/d;->a:F

    float-to-double v7, v1

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v5

    iget v1, v0, Lou/d;->d:F

    float-to-double v7, v1

    iget v0, v0, Lou/d;->c:F

    float-to-double v0, v0

    invoke-static {v7, v8, v0, v1}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v0

    sub-double/2addr v5, v0

    invoke-static {v5, v6}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v0

    double-to-float v0, v0

    iput v0, p0, Lou/i;->x:F

    iget v1, p0, Lou/i;->w:F

    add-float/2addr v1, v0

    iput v1, p0, Lou/i;->w:F

    iget-boolean v1, p0, Lou/h;->q:Z

    const/4 v3, 0x2

    const/4 v5, 0x0

    if-eqz v1, :cond_b

    const/4 v1, 0x0

    cmpl-float v1, v0, v1

    if-eqz v1, :cond_b

    iget-object v1, p0, Lou/a;->h:Ljava/lang/Object;

    check-cast v1, Lov/f;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v1, Lov/f;->a:Lov/o;

    iget-object v6, v1, Lov/o;->I:Lcom/mapbox/maps/MapboxMap;

    if-eqz v6, :cond_a

    invoke-interface {v6}, Lmv/a;->getCameraState()Lcom/mapbox/maps/CameraState;

    move-result-object v6

    invoke-virtual {v6}, Lcom/mapbox/maps/CameraState;->getBearing()D

    move-result-wide v6

    iget-object v8, v1, Lov/o;->K:Lfv/a;

    const-string v9, "cameraAnimationsPlugin"

    if-eqz v8, :cond_9

    check-cast v8, Lfv/h;

    invoke-virtual {v8}, Lfv/h;->i()Lcom/mapbox/maps/ScreenCoordinate;

    move-result-object v8

    iput-object v8, v1, Lov/o;->m0:Lcom/mapbox/maps/ScreenCoordinate;

    float-to-double v10, v0

    add-double/2addr v6, v10

    iget-object v0, v1, Lov/o;->u0:Lpv/b;

    iget-object v0, v0, Lpv/b;->J:Lcom/mapbox/maps/ScreenCoordinate;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lou/e;->n:Landroid/graphics/PointF;

    new-instance v8, Lcom/mapbox/maps/ScreenCoordinate;

    iget v10, v0, Landroid/graphics/PointF;->x:F

    float-to-double v10, v10

    iget v0, v0, Landroid/graphics/PointF;->y:F

    float-to-double v12, v0

    invoke-direct {v8, v10, v11, v12, v13}, Lcom/mapbox/maps/ScreenCoordinate;-><init>(DD)V

    move-object v0, v8

    :goto_0
    iget-object v8, v1, Lov/o;->r0:Lcom/mapbox/maps/util/CoreGesturesHandler;

    if-eqz v8, :cond_8

    invoke-virtual {v8}, Lcom/mapbox/maps/util/CoreGesturesHandler;->notifyCoreGestureStarted()V

    iget-object v8, v1, Lov/o;->u0:Lpv/b;

    iget-boolean v8, v8, Lpv/b;->z:Z

    if-eqz v8, :cond_4

    iget-object v8, v1, Lov/o;->K:Lfv/a;

    if-eqz v8, :cond_3

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Double;

    move-result-object v6

    invoke-static {v6, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    const-string v7, "targets"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v10, Lfv/i;

    array-length v11, v6

    invoke-static {v6, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    const-string v11, "Maps-Gestures"

    invoke-direct {v10, v6, v5, v11}, Lfv/i;-><init>([Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/String;)V

    sget-object v6, Lov/m;->y:Lov/m;

    invoke-static {v8, v10, v6}, Lvp/c;->A(Lfv/a;Lfv/i;Lkotlin/jvm/functions/Function1;)Lgv/e;

    move-result-object v6

    iget-object v8, v1, Lov/o;->K:Lfv/a;

    if-eqz v8, :cond_2

    filled-new-array {v0}, [Lcom/mapbox/maps/ScreenCoordinate;

    move-result-object v0

    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Lfv/i;

    array-length v8, v0

    invoke-static {v0, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v7, v0, v5, v11}, Lfv/i;-><init>([Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/String;)V

    sget-object v0, Lov/m;->x:Lov/m;

    new-instance v8, Lgv/a;

    invoke-direct {v8, v7, v0}, Lgv/a;-><init>(Lfv/i;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, v1, Lov/o;->K:Lfv/a;

    if-eqz v0, :cond_1

    new-array v3, v3, [Landroid/animation/ValueAnimator;

    aput-object v8, v3, v2

    aput-object v6, v3, v4

    check-cast v0, Lfv/h;

    invoke-virtual {v0, v3}, Lfv/h;->j([Landroid/animation/ValueAnimator;)V

    goto :goto_1

    :cond_1
    invoke-static {v9}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :cond_2
    invoke-static {v9}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :cond_3
    invoke-static {v9}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :cond_4
    iget-object v2, v1, Lov/o;->K:Lfv/a;

    if-eqz v2, :cond_7

    new-instance v3, Lcom/mapbox/maps/CameraOptions$Builder;

    invoke-direct {v3}, Lcom/mapbox/maps/CameraOptions$Builder;-><init>()V

    invoke-virtual {v3, v0}, Lcom/mapbox/maps/CameraOptions$Builder;->anchor(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions$Builder;

    move-result-object v0

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/mapbox/maps/CameraOptions$Builder;->bearing(Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/CameraOptions$Builder;->build()Lcom/mapbox/maps/CameraOptions;

    move-result-object v0

    const-string v3, "Builder()\n          .anc\u2026aring)\n          .build()"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lov/o;->v0:Lfv/p;

    check-cast v2, Lfv/h;

    invoke-virtual {v2, v0, v3, v5}, Lfv/h;->h(Lcom/mapbox/maps/CameraOptions;Lfv/p;Landroid/animation/AnimatorListenerAdapter;)Lcom/mapbox/common/Cancelable;

    :goto_1
    iget-object v0, v1, Lov/o;->K:Lfv/a;

    if-eqz v0, :cond_6

    iget-object v2, v1, Lov/o;->m0:Lcom/mapbox/maps/ScreenCoordinate;

    check-cast v0, Lfv/h;

    invoke-virtual {v0, v2}, Lfv/h;->k(Lcom/mapbox/maps/ScreenCoordinate;)V

    iget-object v0, v1, Lov/o;->Q:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_5

    return v4

    :cond_5
    invoke-static {v0}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object v0

    throw v0

    :cond_6
    invoke-static {v9}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :cond_7
    invoke-static {v9}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :cond_8
    const-string v0, "coreGesturesHandler"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :cond_9
    invoke-static {v9}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :cond_a
    const-string v0, "mapCameraManagerDelegate"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :cond_b
    invoke-virtual {p0, v3}, Lou/i;->b(I)Z

    move-result v0

    if-eqz v0, :cond_15

    iget-object v0, p0, Lou/a;->h:Ljava/lang/Object;

    check-cast v0, Lov/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lov/f;->a:Lov/o;

    iget-object v1, v0, Lov/o;->u0:Lpv/b;

    iget-boolean v1, v1, Lpv/b;->w:Z

    if-nez v1, :cond_c

    goto/16 :goto_2

    :cond_c
    iget v1, p0, Lou/i;->x:F

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    iget-object v3, p0, Lou/a;->d:Landroid/view/MotionEvent;

    invoke-virtual {v3}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v6

    long-to-double v6, v6

    iget-object v3, p0, Lou/a;->e:Landroid/view/MotionEvent;

    invoke-virtual {v3}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v8

    long-to-double v8, v8

    cmpg-double v3, v6, v8

    if-nez v3, :cond_d

    goto/16 :goto_2

    :cond_d
    float-to-double v10, v1

    sub-double/2addr v6, v8

    div-double/2addr v10, v6

    iget v1, p0, Lou/i;->w:F

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const-wide v6, 0x3fa47ae147ae147bL    # 0.04

    cmpg-double v3, v10, v6

    if-ltz v3, :cond_15

    const-wide v6, 0x3fb1eb851eb851ecL    # 0.07

    cmpl-double v3, v10, v6

    if-lez v3, :cond_e

    const/high16 v3, 0x40a00000    # 5.0f

    cmpg-float v3, v1, v3

    if-ltz v3, :cond_15

    :cond_e
    const-wide v6, 0x3fc3333333333333L    # 0.15

    cmpl-double v3, v10, v6

    if-lez v3, :cond_f

    const/high16 v3, 0x40e00000    # 7.0f

    cmpg-float v3, v1, v3

    if-ltz v3, :cond_15

    :cond_f
    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    cmpl-double v3, v10, v6

    if-lez v3, :cond_10

    const/high16 v3, 0x41700000    # 15.0f

    cmpg-float v3, v1, v3

    if-ltz v3, :cond_15

    :cond_10
    iget-object v3, v0, Lov/o;->y:Lio/sentry/android/replay/video/d;

    if-eqz v3, :cond_14

    iget-object v3, v3, Lio/sentry/android/replay/video/d;->d:Ljava/lang/Object;

    check-cast v3, Lou/o;

    iget-boolean v5, v3, Lou/h;->q:Z

    if-eqz v5, :cond_11

    const/high16 v6, 0x41800000    # 16.0f

    cmpg-float v1, v1, v6

    if-gez v1, :cond_11

    goto :goto_2

    :cond_11
    iget-object v1, v0, Lov/o;->u0:Lpv/b;

    iget-boolean v1, v1, Lpv/b;->O:Z

    if-eqz v1, :cond_12

    iget v1, v0, Lov/o;->h0:F

    iput v1, v3, Lou/o;->E:F

    if-eqz v5, :cond_12

    iput-boolean v4, v3, Lou/h;->r:Z

    :cond_12
    invoke-virtual {v0}, Lov/o;->h()V

    iget-object v0, v0, Lov/o;->Q:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_13

    invoke-virtual {p0}, Lou/h;->h()V

    return v4

    :cond_13
    invoke-static {v0}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object v0

    throw v0

    :cond_14
    const-string v0, "gesturesManager"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :cond_15
    :goto_2
    return v2
.end method

.method public final g()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lou/i;->w:F

    return-void
.end method

.method public final i()V
    .locals 19

    move-object/from16 v0, p0

    invoke-super {v0}, Lou/h;->i()V

    iget v1, v0, Lou/i;->x:F

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-nez v1, :cond_0

    iput v2, v0, Lou/h;->t:F

    iput v2, v0, Lou/h;->u:F

    :cond_0
    iget v1, v0, Lou/h;->t:F

    iget v3, v0, Lou/h;->u:F

    iget-object v4, v0, Lou/e;->n:Landroid/graphics/PointF;

    iget v5, v4, Landroid/graphics/PointF;->x:F

    mul-float/2addr v3, v5

    iget v4, v4, Landroid/graphics/PointF;->y:F

    mul-float/2addr v4, v1

    add-float/2addr v4, v3

    float-to-double v3, v4

    float-to-double v5, v5

    const-wide/high16 v7, 0x4000000000000000L    # 2.0

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    iget-object v1, v0, Lou/e;->n:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    float-to-double v9, v1

    invoke-static {v9, v10, v7, v8}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v9

    add-double/2addr v9, v5

    div-double/2addr v3, v9

    double-to-float v1, v3

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    iget v3, v0, Lou/i;->x:F

    cmpg-float v2, v3, v2

    if-gez v2, :cond_1

    neg-float v1, v1

    :cond_1
    iget-object v2, v0, Lou/a;->h:Ljava/lang/Object;

    check-cast v2, Lov/f;

    iget v3, v0, Lou/h;->t:F

    iget v4, v0, Lou/h;->u:F

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v2, Lov/f;->a:Lov/o;

    iget-object v5, v2, Lov/o;->u0:Lpv/b;

    iget-boolean v5, v5, Lpv/b;->O:Z

    const/4 v6, 0x0

    const-string v9, "gesturesManager"

    if-eqz v5, :cond_3

    iget-object v5, v2, Lov/o;->y:Lio/sentry/android/replay/video/d;

    if-eqz v5, :cond_2

    iget-object v5, v5, Lio/sentry/android/replay/video/d;->d:Ljava/lang/Object;

    check-cast v5, Lou/o;

    iget v10, v2, Lov/o;->l0:F

    iput v10, v5, Lou/o;->E:F

    goto :goto_0

    :cond_2
    invoke-static {v9}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6

    :cond_3
    :goto_0
    iget-object v5, v2, Lov/o;->Q:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v5}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-nez v10, :cond_10

    iget v5, v2, Lov/o;->i0:F

    mul-float/2addr v1, v5

    const/high16 v5, 0x41f00000    # 30.0f

    cmpl-float v10, v5, v1

    if-lez v10, :cond_4

    goto :goto_1

    :cond_4
    move v1, v5

    :goto_1
    const/high16 v5, -0x3e100000    # -30.0f

    cmpg-float v10, v5, v1

    if-gez v10, :cond_5

    goto :goto_2

    :cond_5
    move v1, v5

    :goto_2
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    add-float/2addr v4, v3

    iget v3, v0, Lou/i;->x:F

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    div-float/2addr v3, v4

    float-to-double v3, v3

    iget-object v5, v2, Lov/o;->u0:Lpv/b;

    iget-boolean v5, v5, Lpv/b;->L:Z

    if-eqz v5, :cond_f

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v5

    iget v10, v2, Lov/o;->j0:F

    cmpg-float v5, v5, v10

    if-ltz v5, :cond_f

    iget-object v5, v2, Lov/o;->y:Lio/sentry/android/replay/video/d;

    if-eqz v5, :cond_e

    iget-object v5, v5, Lio/sentry/android/replay/video/d;->d:Ljava/lang/Object;

    check-cast v5, Lou/o;

    iget-boolean v5, v5, Lou/h;->q:Z

    if-eqz v5, :cond_6

    iget-wide v9, v2, Lov/o;->k0:D

    cmpg-double v3, v3, v9

    if-gez v3, :cond_6

    goto/16 :goto_5

    :cond_6
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v3

    float-to-double v3, v3

    const/4 v5, 0x1

    int-to-double v9, v5

    const-wide v11, 0x4005bf0a8b145769L    # Math.E

    invoke-static {v11, v12, v7, v8}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v7

    div-double/2addr v9, v7

    add-double/2addr v9, v3

    invoke-static {v9, v10}, Ljava/lang/Math;->log(D)D

    move-result-wide v3

    const/4 v7, 0x2

    int-to-double v8, v7

    add-double/2addr v3, v8

    const-wide v8, 0x4062c00000000000L    # 150.0

    mul-double/2addr v3, v8

    double-to-long v3, v3

    iget-object v8, v2, Lov/o;->u0:Lpv/b;

    iget-object v8, v8, Lpv/b;->J:Lcom/mapbox/maps/ScreenCoordinate;

    if-eqz v8, :cond_7

    goto :goto_3

    :cond_7
    iget-object v8, v0, Lou/e;->n:Landroid/graphics/PointF;

    new-instance v9, Lcom/mapbox/maps/ScreenCoordinate;

    iget v10, v8, Landroid/graphics/PointF;->x:F

    float-to-double v10, v10

    iget v8, v8, Landroid/graphics/PointF;->y:F

    float-to-double v12, v8

    invoke-direct {v9, v10, v11, v12, v13}, Lcom/mapbox/maps/ScreenCoordinate;-><init>(DD)V

    move-object v8, v9

    :goto_3
    iget-object v9, v2, Lov/o;->q0:Lh8/a;

    const/16 v10, 0x10

    int-to-long v10, v10

    div-long v10, v3, v10

    const-wide/16 v12, 0x1

    add-long/2addr v10, v12

    cmp-long v14, v12, v10

    move-object/from16 v16, v6

    if-gtz v14, :cond_9

    move-wide v14, v12

    move-wide/from16 v17, v14

    move v6, v1

    :goto_4
    long-to-float v12, v14

    long-to-float v13, v10

    div-float/2addr v12, v13

    invoke-virtual {v9, v12}, Lh8/b;->getInterpolation(F)F

    move-result v12

    int-to-float v13, v5

    invoke-static {v13, v12, v1, v6}, Lb9/y;->a(FFFF)F

    move-result v6

    cmp-long v12, v14, v10

    if-eqz v12, :cond_8

    add-long v14, v14, v17

    goto :goto_4

    :cond_8
    move v1, v6

    :cond_9
    iget-object v6, v2, Lov/o;->I:Lcom/mapbox/maps/MapboxMap;

    if-eqz v6, :cond_d

    invoke-interface {v6}, Lmv/a;->getCameraState()Lcom/mapbox/maps/CameraState;

    move-result-object v6

    invoke-virtual {v6}, Lcom/mapbox/maps/CameraState;->getBearing()D

    move-result-wide v10

    float-to-double v12, v1

    add-double/2addr v12, v10

    iget-object v1, v2, Lov/o;->K:Lfv/a;

    const-string v6, "cameraAnimationsPlugin"

    if-eqz v1, :cond_c

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v12

    filled-new-array {v12}, [Ljava/lang/Double;

    move-result-object v12

    invoke-static {v12, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v12

    const-string v13, "targets"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    new-instance v11, Lfv/i;

    array-length v14, v12

    invoke-static {v12, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v12

    const-string v14, "Maps-Gestures"

    invoke-direct {v11, v12, v10, v14}, Lfv/i;-><init>([Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/String;)V

    new-instance v10, Lov/l;

    invoke-direct {v10, v9, v3, v4, v5}, Lov/l;-><init>(Lh8/a;JI)V

    invoke-static {v1, v11, v10}, Lvp/c;->A(Lfv/a;Lfv/i;Lkotlin/jvm/functions/Function1;)Lgv/e;

    move-result-object v1

    iget-object v10, v2, Lov/o;->r0:Lcom/mapbox/maps/util/CoreGesturesHandler;

    if-eqz v10, :cond_b

    invoke-virtual {v10}, Lcom/mapbox/maps/util/CoreGesturesHandler;->getCoreGestureAnimatorHandler()Landroid/animation/AnimatorListenerAdapter;

    move-result-object v10

    invoke-virtual {v1, v10}, Lgv/d;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    new-instance v10, Lcom/mapbox/maps/ScreenCoordinate;

    invoke-virtual {v8}, Lcom/mapbox/maps/ScreenCoordinate;->getX()D

    move-result-wide v11

    invoke-virtual {v8}, Lcom/mapbox/maps/ScreenCoordinate;->getY()D

    move-result-wide v7

    invoke-direct {v10, v11, v12, v7, v8}, Lcom/mapbox/maps/ScreenCoordinate;-><init>(DD)V

    iget-object v7, v2, Lov/o;->K:Lfv/a;

    if-eqz v7, :cond_a

    filled-new-array {v10}, [Lcom/mapbox/maps/ScreenCoordinate;

    move-result-object v6

    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Lfv/i;

    array-length v8, v6

    invoke-static {v6, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    invoke-direct {v7, v6, v10, v14}, Lfv/i;-><init>([Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/String;)V

    new-instance v6, Lov/l;

    const/4 v8, 0x0

    invoke-direct {v6, v9, v3, v4, v8}, Lov/l;-><init>(Lh8/a;JI)V

    new-instance v3, Lgv/a;

    invoke-direct {v3, v7, v6}, Lgv/a;-><init>(Lfv/i;Lkotlin/jvm/functions/Function1;)V

    new-instance v4, Lov/k;

    invoke-direct {v4, v2, v8}, Lov/k;-><init>(Lov/o;I)V

    invoke-virtual {v3, v4}, Lgv/d;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    const/4 v15, 0x2

    new-array v4, v15, [Landroid/animation/ValueAnimator;

    aput-object v1, v4, v8

    aput-object v3, v4, v5

    iput-object v4, v2, Lov/o;->o0:[Landroid/animation/ValueAnimator;

    invoke-virtual {v2, v4}, Lov/o;->n([Landroid/animation/ValueAnimator;)V

    return-void

    :cond_a
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v16

    :cond_b
    const-string v1, "coreGesturesHandler"

    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v16

    :cond_c
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v16

    :cond_d
    const-string v1, "mapCameraManagerDelegate"

    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v16

    :cond_e
    move-object/from16 v16, v6

    invoke-static {v9}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v16

    :cond_f
    :goto_5
    return-void

    :cond_10
    invoke-static {v5}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object v1

    throw v1
.end method

.method public final j()Ljava/util/HashSet;
    .locals 1

    sget-object v0, Lou/i;->y:Ljava/util/HashSet;

    return-object v0
.end method
