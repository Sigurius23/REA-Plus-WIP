.class public final Lov/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lou/m;


# instance fields
.field public final w:F

.field public final synthetic x:Lov/o;


# direct methods
.method public constructor <init>(Lov/o;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lov/i;->x:Lov/o;

    iput p2, p0, Lov/i;->w:F

    return-void
.end method


# virtual methods
.method public final onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final onDoubleTapEvent(Landroid/view/MotionEvent;)Z
    .locals 9

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    iget-object v1, p0, Lov/i;->x:Lov/o;

    const/4 v2, 0x1

    if-nez v0, :cond_2

    invoke-static {p1}, Ldc/a;->l(Landroid/view/MotionEvent;)Lcom/mapbox/maps/ScreenCoordinate;

    move-result-object v0

    iput-object v0, v1, Lov/o;->T:Lcom/mapbox/maps/ScreenCoordinate;

    iget-object v0, v1, Lov/o;->E:Lqg3/d;

    if-eqz v0, :cond_1

    sget-object v3, Lov/a;->w:Lov/a;

    invoke-virtual {v0, v3}, Lqg3/d;->B(Lov/a;)V

    iput-boolean v2, v1, Lov/o;->t0:Z

    goto :goto_0

    :cond_1
    const-string p1, "gestureState"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_2
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-ne v0, v2, :cond_6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-double v3, v0

    iget-object v0, v1, Lov/o;->T:Lcom/mapbox/maps/ScreenCoordinate;

    invoke-virtual {v0}, Lcom/mapbox/maps/ScreenCoordinate;->getX()D

    move-result-wide v5

    sub-double/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->abs(D)D

    move-result-wide v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-double v5, p1

    iget-object p1, v1, Lov/o;->T:Lcom/mapbox/maps/ScreenCoordinate;

    invoke-virtual {p1}, Lcom/mapbox/maps/ScreenCoordinate;->getY()D

    move-result-wide v7

    sub-double/2addr v5, v7

    invoke-static {v5, v6}, Ljava/lang/Math;->abs(D)D

    move-result-wide v5

    iget p1, p0, Lov/i;->w:F

    float-to-double v7, p1

    cmpl-double p1, v3, v7

    if-gtz p1, :cond_6

    cmpl-double p1, v5, v7

    if-lez p1, :cond_3

    goto :goto_1

    :cond_3
    iget-object p1, v1, Lov/o;->u0:Lpv/b;

    iget-boolean v0, p1, Lpv/b;->G:Z

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    iget-object p1, p1, Lpv/b;->J:Lcom/mapbox/maps/ScreenCoordinate;

    if-eqz p1, :cond_5

    iput-object p1, v1, Lov/o;->T:Lcom/mapbox/maps/ScreenCoordinate;

    :cond_5
    iget-object p1, v1, Lov/o;->T:Lcom/mapbox/maps/ScreenCoordinate;

    invoke-virtual {v1, v2, p1}, Lov/o;->l(ZLcom/mapbox/maps/ScreenCoordinate;)V

    return v2

    :cond_6
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final onDown(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 22

    move/from16 v0, p3

    move/from16 v1, p4

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    :cond_0
    move-object/from16 v2, p0

    goto/16 :goto_3

    :cond_1
    move-object/from16 v2, p0

    iget-object v3, v2, Lov/i;->x:Lov/o;

    iget-object v4, v3, Lov/o;->u0:Lpv/b;

    iget-boolean v4, v4, Lpv/b;->y:Z

    if-nez v4, :cond_2

    goto/16 :goto_3

    :cond_2
    invoke-static/range {p2 .. p2}, Ldc/a;->l(Landroid/view/MotionEvent;)Lcom/mapbox/maps/ScreenCoordinate;

    move-result-object v4

    invoke-virtual {v3, v4}, Lov/o;->m(Lcom/mapbox/maps/ScreenCoordinate;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    iget-object v4, v3, Lov/o;->O:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_f

    iget-object v4, v3, Lov/o;->u0:Lpv/b;

    iget-boolean v4, v4, Lpv/b;->M:Z

    if-nez v4, :cond_4

    goto/16 :goto_3

    :cond_4
    iget v4, v3, Lov/o;->x:F

    div-float v5, v0, v4

    float-to-double v5, v5

    div-float v7, v1, v4

    float-to-double v7, v7

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v5

    const-wide v7, 0x408f400000000000L    # 1000.0

    cmpg-double v7, v5, v7

    if-gez v7, :cond_5

    goto/16 :goto_3

    :cond_5
    iget-object v7, v3, Lov/o;->I:Lcom/mapbox/maps/MapboxMap;

    const/4 v8, 0x0

    const-string v9, "mapCameraManagerDelegate"

    if-eqz v7, :cond_e

    invoke-interface {v7}, Lmv/a;->getCameraState()Lcom/mapbox/maps/CameraState;

    move-result-object v7

    invoke-virtual {v7}, Lcom/mapbox/maps/CameraState;->getPitch()D

    move-result-wide v10

    const-wide/high16 v12, 0x404e000000000000L    # 60.0

    cmpg-double v7, v10, v12

    const-wide/high16 v14, 0x4024000000000000L    # 10.0

    const-wide/16 v16, 0x0

    if-gez v7, :cond_6

    div-double/2addr v10, v14

    goto :goto_0

    :cond_6
    cmpg-double v7, v12, v10

    if-gtz v7, :cond_7

    const-wide v18, 0x4055400000000000L    # 85.0

    cmpg-double v7, v10, v18

    if-gtz v7, :cond_7

    const-wide/high16 v18, 0x4018000000000000L    # 6.0

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->log(D)D

    move-result-wide v18

    const-wide v20, 0x4072c00000000000L    # 300.0

    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->log(D)D

    move-result-wide v20

    sub-double v20, v20, v18

    sub-double/2addr v10, v12

    mul-double v10, v10, v20

    const-wide/high16 v12, 0x4039000000000000L    # 25.0

    div-double/2addr v10, v12

    add-double v10, v10, v18

    invoke-static {v10, v11}, Ljava/lang/Math;->exp(D)D

    move-result-wide v10

    goto :goto_0

    :cond_7
    move-wide/from16 v10, v16

    :goto_0
    float-to-double v12, v4

    div-double/2addr v10, v12

    add-double/2addr v10, v14

    iget-object v4, v3, Lov/o;->u0:Lpv/b;

    const-string v7, "<this>"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v4, v4, Lpv/b;->F:I

    const/4 v12, 0x2

    if-ne v4, v12, :cond_8

    move-wide/from16 v12, v16

    goto :goto_1

    :cond_8
    float-to-double v12, v0

    div-double/2addr v12, v10

    :goto_1
    iget-object v0, v3, Lov/o;->u0:Lpv/b;

    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, v0, Lpv/b;->F:I

    const/4 v4, 0x1

    if-ne v0, v4, :cond_9

    goto :goto_2

    :cond_9
    float-to-double v0, v1

    div-double v16, v0, v10

    :goto_2
    iget-object v0, v3, Lov/o;->K:Lfv/a;

    const-string v1, "cameraAnimationsPlugin"

    if-eqz v0, :cond_d

    iget-object v7, v3, Lov/o;->L:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-static {v7}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v7

    check-cast v0, Lfv/h;

    invoke-virtual {v0, v7}, Lfv/h;->b(Ljava/util/List;)V

    div-double/2addr v5, v10

    double-to-long v5, v5

    new-instance v0, Lcom/mapbox/maps/ScreenCoordinate;

    iget-object v7, v3, Lov/o;->U:Lcom/mapbox/maps/ScreenCoordinate;

    invoke-virtual {v7}, Lcom/mapbox/maps/ScreenCoordinate;->getX()D

    move-result-wide v10

    iget-object v7, v3, Lov/o;->U:Lcom/mapbox/maps/ScreenCoordinate;

    invoke-virtual {v7}, Lcom/mapbox/maps/ScreenCoordinate;->getY()D

    move-result-wide v14

    const-wide/high16 v18, 0x4000000000000000L    # 2.0

    mul-double v14, v14, v18

    invoke-direct {v0, v10, v11, v14, v15}, Lcom/mapbox/maps/ScreenCoordinate;-><init>(DD)V

    iget-object v7, v3, Lov/o;->K:Lfv/a;

    if-eqz v7, :cond_c

    iget-object v1, v3, Lov/o;->I:Lcom/mapbox/maps/MapboxMap;

    if-eqz v1, :cond_b

    new-instance v9, Lcom/mapbox/maps/ScreenCoordinate;

    invoke-virtual {v0}, Lcom/mapbox/maps/ScreenCoordinate;->getX()D

    move-result-wide v10

    add-double/2addr v10, v12

    invoke-virtual {v0}, Lcom/mapbox/maps/ScreenCoordinate;->getY()D

    move-result-wide v12

    add-double v12, v12, v16

    invoke-direct {v9, v10, v11, v12, v13}, Lcom/mapbox/maps/ScreenCoordinate;-><init>(DD)V

    invoke-interface {v1, v0, v9}, Lmv/a;->cameraForDrag(Lcom/mapbox/maps/ScreenCoordinate;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions;

    move-result-object v0

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iget-object v5, v3, Lov/o;->q0:Lh8/a;

    const-string v6, "interpolator"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lfv/p;

    const-string v9, "Maps-Gestures"

    invoke-direct {v6, v9, v1, v5}, Lfv/p;-><init>(Ljava/lang/String;Ljava/lang/Long;Landroid/animation/TimeInterpolator;)V

    iget-object v1, v3, Lov/o;->r0:Lcom/mapbox/maps/util/CoreGesturesHandler;

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Lcom/mapbox/maps/util/CoreGesturesHandler;->getCoreGestureAnimatorHandler()Landroid/animation/AnimatorListenerAdapter;

    move-result-object v1

    check-cast v7, Lfv/h;

    invoke-virtual {v7, v0, v6, v1}, Lfv/h;->h(Lcom/mapbox/maps/CameraOptions;Lfv/p;Landroid/animation/AnimatorListenerAdapter;)Lcom/mapbox/common/Cancelable;

    return v4

    :cond_a
    const-string v0, "coreGesturesHandler"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v8

    :cond_b
    invoke-static {v9}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v8

    :cond_c
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v8

    :cond_d
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v8

    :cond_e
    invoke-static {v9}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v8

    :cond_f
    invoke-static {v4}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object v0

    throw v0

    :goto_3
    const/4 v0, 0x0

    return v0
.end method

.method public final onLongPress(Landroid/view/MotionEvent;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lov/i;->x:Lov/o;

    invoke-virtual {v0}, Lov/o;->k()Lmv/c;

    move-result-object v0

    new-instance v1, Lcom/mapbox/maps/PlatformEventInfo;

    sget-object v2, Lcom/mapbox/maps/PlatformEventType;->LONG_CLICK:Lcom/mapbox/maps/PlatformEventType;

    invoke-static {p1}, Ldc/a;->l(Landroid/view/MotionEvent;)Lcom/mapbox/maps/ScreenCoordinate;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lcom/mapbox/maps/PlatformEventInfo;-><init>(Lcom/mapbox/maps/PlatformEventType;Lcom/mapbox/maps/ScreenCoordinate;)V

    invoke-interface {v0, v1}, Lmv/c;->dispatch(Lcom/mapbox/maps/PlatformEventInfo;)V

    return-void
.end method

.method public final onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final onShowPress(Landroid/view/MotionEvent;)V
    .locals 0

    return-void
.end method

.method public final onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lov/i;->x:Lov/o;

    invoke-virtual {v1}, Lov/o;->k()Lmv/c;

    move-result-object v1

    new-instance v2, Lcom/mapbox/maps/PlatformEventInfo;

    sget-object v3, Lcom/mapbox/maps/PlatformEventType;->CLICK:Lcom/mapbox/maps/PlatformEventType;

    invoke-static {p1}, Ldc/a;->l(Landroid/view/MotionEvent;)Lcom/mapbox/maps/ScreenCoordinate;

    move-result-object p1

    invoke-direct {v2, v3, p1}, Lcom/mapbox/maps/PlatformEventInfo;-><init>(Lcom/mapbox/maps/PlatformEventType;Lcom/mapbox/maps/ScreenCoordinate;)V

    invoke-interface {v1, v2}, Lmv/c;->dispatch(Lcom/mapbox/maps/PlatformEventInfo;)V

    return v0
.end method

.method public final onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object p1, p0, Lov/i;->x:Lov/o;

    iget-object v0, p1, Lov/o;->K:Lfv/a;

    if-eqz v0, :cond_0

    iget-object p1, p1, Lov/o;->L:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-static {p1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast v0, Lfv/h;

    invoke-virtual {v0, p1}, Lfv/h;->b(Ljava/util/List;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const-string p1, "cameraAnimationsPlugin"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method
