.class public final Lou/j;
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

    sput-object v0, Lou/j;->y:Ljava/util/HashSet;

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final b(I)Z
    .locals 1

    iget p1, p0, Lou/j;->x:F

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget v0, p0, Lou/j;->w:F

    cmpl-float p1, p1, v0

    if-ltz p1, :cond_0

    const/4 p1, 0x3

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
    .locals 11

    iget-object v0, p0, Lou/a;->e:Landroid/view/MotionEvent;

    iget-object v1, p0, Lou/e;->l:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    iget-object v3, p0, Lou/a;->e:Landroid/view/MotionEvent;

    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v3, v5}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v5

    invoke-virtual {v3, v5}, Landroid/view/MotionEvent;->getY(I)F

    move-result v3

    add-float/2addr v3, v0

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr v3, v0

    iget-object v5, p0, Lou/a;->d:Landroid/view/MotionEvent;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/view/MotionEvent;->getY(I)F

    move-result v5

    iget-object v6, p0, Lou/a;->d:Landroid/view/MotionEvent;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v6, v1}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v1

    invoke-virtual {v6, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    add-float/2addr v1, v5

    div-float/2addr v1, v0

    sub-float/2addr v1, v3

    iget v0, p0, Lou/j;->x:F

    add-float/2addr v0, v1

    iput v0, p0, Lou/j;->x:F

    iget-boolean v0, p0, Lou/h;->q:Z

    const/4 v3, 0x0

    if-eqz v0, :cond_9

    const/4 v0, 0x0

    cmpl-float v0, v1, v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lou/a;->h:Ljava/lang/Object;

    check-cast v0, Lov/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lov/h;->a:Lov/o;

    iget-object v5, v0, Lov/o;->I:Lcom/mapbox/maps/MapboxMap;

    const-string v6, "mapCameraManagerDelegate"

    if-eqz v5, :cond_8

    invoke-interface {v5}, Lmv/a;->getCameraState()Lcom/mapbox/maps/CameraState;

    move-result-object v5

    invoke-virtual {v5}, Lcom/mapbox/maps/CameraState;->getPitch()D

    move-result-wide v7

    const v5, 0x3dcccccd    # 0.1f

    mul-float/2addr v1, v5

    float-to-double v9, v1

    sub-double/2addr v7, v9

    const-wide v9, 0x4055400000000000L    # 85.0

    cmpl-double v1, v9, v7

    if-lez v1, :cond_0

    goto :goto_0

    :cond_0
    move-wide v7, v9

    :goto_0
    const-wide/16 v9, 0x0

    cmpg-double v1, v9, v7

    if-gez v1, :cond_1

    goto :goto_1

    :cond_1
    move-wide v7, v9

    :goto_1
    iget-boolean v1, v0, Lov/o;->X:Z

    if-nez v1, :cond_2

    iget-boolean v1, v0, Lov/o;->W:Z

    if-eqz v1, :cond_3

    :cond_2
    iget-object v1, v0, Lov/o;->I:Lcom/mapbox/maps/MapboxMap;

    if-eqz v1, :cond_7

    invoke-interface {v1}, Lmv/a;->getCameraState()Lcom/mapbox/maps/CameraState;

    move-result-object v5

    invoke-virtual {v5}, Lcom/mapbox/maps/CameraState;->getCenter()Lcom/mapbox/geojson/Point;

    move-result-object v5

    const-string v6, "mapCameraManagerDelegate.cameraState.center"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v5}, Lmv/a;->pixelForCoordinate(Lcom/mapbox/geojson/Point;)Lcom/mapbox/maps/ScreenCoordinate;

    move-result-object v1

    iput-object v1, v0, Lov/o;->V:Lcom/mapbox/maps/ScreenCoordinate;

    iput-boolean v2, v0, Lov/o;->X:Z

    iput-boolean v2, v0, Lov/o;->W:Z

    :cond_3
    iget-object v1, v0, Lov/o;->r0:Lcom/mapbox/maps/util/CoreGesturesHandler;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lcom/mapbox/maps/util/CoreGesturesHandler;->notifyCoreGestureStarted()V

    iget-object v1, v0, Lov/o;->K:Lfv/a;

    if-eqz v1, :cond_5

    new-instance v2, Lcom/mapbox/maps/CameraOptions$Builder;

    invoke-direct {v2}, Lcom/mapbox/maps/CameraOptions$Builder;-><init>()V

    iget-object v5, v0, Lov/o;->V:Lcom/mapbox/maps/ScreenCoordinate;

    invoke-virtual {v2, v5}, Lcom/mapbox/maps/CameraOptions$Builder;->anchor(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions$Builder;

    move-result-object v2

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/mapbox/maps/CameraOptions$Builder;->pitch(Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions$Builder;

    move-result-object v2

    invoke-virtual {v2}, Lcom/mapbox/maps/CameraOptions$Builder;->build()Lcom/mapbox/maps/CameraOptions;

    move-result-object v2

    const-string v5, "Builder().anchor(cameraC\u2026ate).pitch(pitch).build()"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lov/o;->v0:Lfv/p;

    check-cast v1, Lfv/h;

    invoke-virtual {v1, v2, v5, v3}, Lfv/h;->h(Lcom/mapbox/maps/CameraOptions;Lfv/p;Landroid/animation/AnimatorListenerAdapter;)Lcom/mapbox/common/Cancelable;

    iget-object v0, v0, Lov/o;->S:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_4

    return v4

    :cond_4
    invoke-static {v0}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object v0

    throw v0

    :cond_5
    const-string v0, "cameraAnimationsPlugin"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_6
    const-string v0, "coreGesturesHandler"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_7
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_8
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_9
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lou/j;->b(I)Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p0, Lou/a;->h:Ljava/lang/Object;

    check-cast v0, Lov/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lov/h;->a:Lov/o;

    iget-object v1, v0, Lov/o;->u0:Lpv/b;

    iget-boolean v1, v1, Lpv/b;->E:Z

    if-nez v1, :cond_a

    goto :goto_2

    :cond_a
    invoke-virtual {v0}, Lov/o;->h()V

    iget-object v1, v0, Lov/o;->E:Lqg3/d;

    if-eqz v1, :cond_c

    sget-object v2, Lov/a;->z:Lov/a;

    invoke-virtual {v1, v2}, Lqg3/d;->B(Lov/a;)V

    iget-object v0, v0, Lov/o;->S:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_b

    invoke-virtual {p0}, Lou/h;->h()V

    return v4

    :cond_b
    invoke-static {v0}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object v0

    throw v0

    :cond_c
    const-string v0, "gestureState"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_d
    :goto_2
    return v2
.end method

.method public final e()Z
    .locals 10

    invoke-super {p0}, Lou/e;->e()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    new-instance v0, Lou/g;

    iget-object v2, p0, Lou/e;->l:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-direct {v0, v4, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, p0, Lou/e;->m:Ljava/util/HashMap;

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lou/d;

    iget v2, v0, Lou/d;->d:F

    float-to-double v4, v2

    iget v0, v0, Lou/d;->c:F

    float-to-double v6, v0

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v4

    iget v0, p0, Lou/j;->v:F

    float-to-double v6, v0

    cmpg-double v0, v4, v6

    if-lez v0, :cond_0

    const-wide v8, 0x4066800000000000L    # 180.0

    sub-double/2addr v8, v4

    cmpg-double v0, v8, v6

    if-gtz v0, :cond_1

    :cond_0
    return v3

    :cond_1
    return v1
.end method

.method public final g()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lou/j;->x:F

    return-void
.end method

.method public final i()V
    .locals 3

    invoke-super {p0}, Lou/h;->i()V

    iget-object v0, p0, Lou/a;->h:Ljava/lang/Object;

    check-cast v0, Lov/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lov/h;->a:Lov/o;

    iget-object v1, v0, Lov/o;->E:Lqg3/d;

    if-eqz v1, :cond_1

    sget-object v2, Lov/a;->z:Lov/a;

    invoke-virtual {v1, v2}, Lqg3/d;->A(Lov/a;)V

    iget-object v0, v0, Lov/o;->S:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object v0

    throw v0

    :cond_1
    const-string v0, "gestureState"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final j()Ljava/util/HashSet;
    .locals 1

    sget-object v0, Lou/j;->y:Ljava/util/HashSet;

    return-object v0
.end method
