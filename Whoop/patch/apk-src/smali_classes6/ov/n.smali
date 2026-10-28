.class public final Lov/n;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lov/o;


# direct methods
.method public synthetic constructor <init>(Lov/o;I)V
    .locals 0

    iput p2, p0, Lov/n;->w:I

    iput-object p1, p0, Lov/n;->x:Lov/o;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lov/n;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lcom/mapbox/maps/InteractionContext;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lov/n;->x:Lov/o;

    iget-object v0, p1, Lov/o;->z:Lov/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, v0, Lov/e;->a:Lou/c;

    if-eqz v0, :cond_1

    iget-object p1, p1, Lov/o;->P:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    invoke-static {p1}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1

    :cond_1
    const-string p1, "detector"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    const-string p1, "moveGestureListener"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    check-cast p1, Lcom/mapbox/maps/InteractionContext;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mapbox/maps/InteractionContext;->getScreenCoordinate()Lcom/mapbox/maps/ScreenCoordinate;

    move-result-object p1

    const-string v0, "it.screenCoordinate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lov/n;->x:Lov/o;

    iget-object v1, v0, Lov/o;->z:Lov/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_8

    iget-object v1, v1, Lov/e;->a:Lou/c;

    if-eqz v1, :cond_7

    iget-object v3, v0, Lov/o;->P:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_6

    iget-object v1, v1, Lou/e;->n:Landroid/graphics/PointF;

    iget v3, v1, Landroid/graphics/PointF;->x:F

    float-to-double v3, v3

    iget v1, v1, Landroid/graphics/PointF;->y:F

    float-to-double v5, v1

    iget-object v1, v0, Lov/o;->r0:Lcom/mapbox/maps/util/CoreGesturesHandler;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lcom/mapbox/maps/util/CoreGesturesHandler;->notifyCoreGestureStarted()V

    iget-object v1, v0, Lov/o;->I:Lcom/mapbox/maps/MapboxMap;

    if-eqz v1, :cond_4

    new-instance v7, Lcom/mapbox/maps/ScreenCoordinate;

    invoke-direct {v7, v3, v4, v5, v6}, Lcom/mapbox/maps/ScreenCoordinate;-><init>(DD)V

    invoke-interface {v1, v7, p1}, Lmv/a;->cameraForDrag(Lcom/mapbox/maps/ScreenCoordinate;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions;

    move-result-object p1

    iget-object v0, v0, Lov/o;->K:Lfv/a;

    if-eqz v0, :cond_3

    sget-object v1, Lov/o;->v0:Lfv/p;

    check-cast v0, Lfv/h;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lfv/h;->h(Lcom/mapbox/maps/CameraOptions;Lfv/p;Landroid/animation/AnimatorListenerAdapter;)Lcom/mapbox/common/Cancelable;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_3
    const-string p1, "cameraAnimationsPlugin"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_4
    const-string p1, "mapCameraManagerDelegate"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_5
    const-string p1, "coreGesturesHandler"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_6
    invoke-static {v3}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1

    :cond_7
    const-string p1, "detector"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_8
    const-string p1, "moveGestureListener"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :pswitch_1
    check-cast p1, Lcom/mapbox/maps/InteractionContext;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lov/n;->x:Lov/o;

    invoke-virtual {p1}, Lov/o;->h()V

    iget-object v0, p1, Lov/o;->z:Lov/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_b

    iget-object v0, v0, Lov/e;->a:Lou/c;

    if-eqz v0, :cond_a

    iget-object p1, p1, Lov/o;->P:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_9

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_9
    invoke-static {p1}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1

    :cond_a
    const-string p1, "detector"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_b
    const-string p1, "moveGestureListener"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :pswitch_2
    check-cast p1, Lcom/mapbox/maps/InteractionContext;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mapbox/maps/InteractionContext;->getScreenCoordinate()Lcom/mapbox/maps/ScreenCoordinate;

    move-result-object p1

    const-string v0, "it.screenCoordinate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lov/n;->x:Lov/o;

    iget-object v1, v0, Lov/o;->N:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_e

    iget-object v0, v0, Lov/o;->I:Lcom/mapbox/maps/MapboxMap;

    if-eqz v0, :cond_d

    invoke-interface {v0, p1}, Lmv/a;->coordinateForPixel(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/geojson/Point;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_0

    :cond_c
    invoke-static {p1}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1

    :cond_d
    const-string p1, "mapCameraManagerDelegate"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_e
    :goto_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_3
    check-cast p1, Lcom/mapbox/maps/InteractionContext;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mapbox/maps/InteractionContext;->getScreenCoordinate()Lcom/mapbox/maps/ScreenCoordinate;

    move-result-object p1

    const-string v0, "context.screenCoordinate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lov/n;->x:Lov/o;

    iget-object v1, v0, Lov/o;->M:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_11

    iget-object v0, v0, Lov/o;->I:Lcom/mapbox/maps/MapboxMap;

    if-eqz v0, :cond_10

    invoke-interface {v0, p1}, Lmv/a;->coordinateForPixel(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/geojson/Point;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_1

    :cond_f
    invoke-static {p1}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1

    :cond_10
    const-string p1, "mapCameraManagerDelegate"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_11
    :goto_1
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_4
    check-cast p1, Lcom/mapbox/maps/MapboxStyleManager;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lov/n;->x:Lov/o;

    iput-object p1, v0, Lov/o;->F:Lcom/mapbox/maps/MapboxStyleManager;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
