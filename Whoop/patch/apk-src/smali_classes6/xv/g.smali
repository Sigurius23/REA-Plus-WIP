.class public final Lxv/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lev/s;
.implements Lev/l;


# instance fields
.field public E:Lyv/b;

.field public final F:Lrm/p;

.field public G:Lcom/mapbox/common/Cancelable;

.field public final w:Lkotlin/jvm/functions/Function1;

.field public x:Lxv/b;

.field public y:Lcom/mapbox/maps/MapboxMap;

.field public z:Lcom/mapbox/maps/MapboxMap;


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, Lxv/e;->y:Lxv/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lxv/g;->w:Lkotlin/jvm/functions/Function1;

    sget-object v0, Lxv/e;->z:Lxv/e;

    invoke-static {v0}, Lrv/n;->b(Lkotlin/jvm/functions/Function1;)Lyv/b;

    move-result-object v0

    iput-object v0, p0, Lxv/g;->E:Lyv/b;

    new-instance v0, Lrm/p;

    const/16 v1, 0x13

    invoke-direct {v0, p0, v1}, Lrm/p;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lxv/g;->F:Lrm/p;

    return-void
.end method

.method public static synthetic e(Lxv/g;)V
    .locals 1

    iget-object v0, p0, Lxv/g;->z:Lcom/mapbox/maps/MapboxMap;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lmv/a;->getCameraState()Lcom/mapbox/maps/CameraState;

    move-result-object v0

    invoke-virtual {p0, v0}, Lxv/g;->b(Lcom/mapbox/maps/CameraState;)V

    return-void

    :cond_0
    const-string p0, "mapCameraManagerDelegate"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lxv/g;->G:Lcom/mapbox/common/Cancelable;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/mapbox/common/Cancelable;->cancel()V

    :cond_0
    return-void
.end method

.method public final b(Lcom/mapbox/maps/CameraState;)V
    .locals 4

    invoke-virtual {p1}, Lcom/mapbox/maps/CameraState;->getCenter()Lcom/mapbox/geojson/Point;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/geojson/Point;->latitude()D

    move-result-wide v0

    invoke-virtual {p1}, Lcom/mapbox/maps/CameraState;->getZoom()D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/mapbox/maps/Projection;->getMetersPerPixelAtLatitude(DD)D

    move-result-wide v0

    iget-object p1, p0, Lxv/g;->x:Lxv/b;

    const/4 v2, 0x0

    const-string v3, "scaleBar"

    if-eqz p1, :cond_1

    if-eqz p1, :cond_0

    move-object v2, p1

    check-cast v2, Lxv/f;

    invoke-virtual {v2}, Lxv/f;->getPixelRatio()F

    move-result v2

    float-to-double v2, v2

    div-double/2addr v0, v2

    double-to-float v0, v0

    check-cast p1, Lxv/f;

    invoke-virtual {p1, v0}, Lxv/f;->setDistancePerPixel(F)V

    return-void

    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method public final c(Landroid/view/View;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lxv/b;

    if-eqz v0, :cond_0

    check-cast p1, Lxv/b;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    iput-object p1, p0, Lxv/g;->x:Lxv/b;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The provided view needs to implement ScaleBarContract.ScaleBarView"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f(Lev/i;)V
    .locals 1

    iget-object v0, p1, Lev/i;->b:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/MapboxMap;

    iput-object v0, p0, Lxv/g;->z:Lcom/mapbox/maps/MapboxMap;

    iget-object p1, p1, Lev/i;->e:Ljava/lang/Object;

    check-cast p1, Lcom/mapbox/maps/MapboxMap;

    iput-object p1, p0, Lxv/g;->y:Lcom/mapbox/maps/MapboxMap;

    return-void
.end method

.method public final g(Lcom/mapbox/maps/MapView;Landroid/util/AttributeSet;F)Landroid/view/View;
    .locals 4

    const-string v0, "mapView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "mapView.context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lxv/a;->a:[I

    const/4 v3, 0x0

    invoke-virtual {v0, p2, v2, v3, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    const-string v0, "context.obtainStyledAttr\u2026ble.mapbox_MapView, 0, 0)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Ljv/a;

    const/4 v2, 0x3

    invoke-direct {v0, p2, p3, v2}, Ljv/a;-><init>(Landroid/content/res/TypedArray;FI)V

    invoke-static {v0}, Lrv/n;->b(Lkotlin/jvm/functions/Function1;)Lyv/b;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    iput-object v0, p0, Lxv/g;->E:Lyv/b;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lxv/g;->w:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxv/f;

    const-string p2, "null cannot be cast to non-null type com.mapbox.maps.plugin.scalebar.ScaleBar"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p3}, Lxv/f;->setPixelRatio(F)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    throw p1
.end method

.method public final h()V
    .locals 23

    move-object/from16 v0, p0

    iget-object v1, v0, Lxv/g;->E:Lyv/b;

    iget-boolean v1, v1, Lyv/b;->w:Z

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v1, v0, Lxv/g;->G:Lcom/mapbox/common/Cancelable;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Lcom/mapbox/common/Cancelable;->cancel()V

    :cond_1
    iget-object v1, v0, Lxv/g;->E:Lyv/b;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v4, v1, Lyv/b;->x:I

    iget v5, v1, Lyv/b;->y:F

    iget v6, v1, Lyv/b;->z:F

    iget v7, v1, Lyv/b;->E:F

    iget v8, v1, Lyv/b;->F:F

    iget v9, v1, Lyv/b;->G:I

    iget v10, v1, Lyv/b;->H:I

    iget v11, v1, Lyv/b;->I:I

    iget v12, v1, Lyv/b;->J:F

    iget v13, v1, Lyv/b;->K:F

    iget v14, v1, Lyv/b;->L:F

    iget v15, v1, Lyv/b;->M:F

    iget v2, v1, Lyv/b;->N:F

    iget-boolean v3, v1, Lyv/b;->O:Z

    move/from16 v16, v2

    move/from16 v17, v3

    iget-wide v2, v1, Lyv/b;->P:J

    move-wide/from16 v18, v2

    iget-boolean v2, v1, Lyv/b;->Q:Z

    iget v3, v1, Lyv/b;->R:F

    iget-boolean v1, v1, Lyv/b;->S:Z

    move/from16 v20, v2

    new-instance v2, Lyv/b;

    move/from16 v21, v3

    const/4 v3, 0x0

    move/from16 v22, v1

    invoke-direct/range {v2 .. v22}, Lyv/b;-><init>(ZIFFFFIIIFFFFFZJZFZ)V

    iput-object v2, v0, Lxv/g;->E:Lyv/b;

    iget-object v1, v0, Lxv/g;->x:Lxv/b;

    if-eqz v1, :cond_2

    check-cast v1, Lxv/f;

    invoke-virtual {v1, v3}, Lxv/f;->setEnable(Z)V

    return-void

    :cond_2
    const-string v1, "scaleBar"

    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v1, 0x0

    throw v1
.end method

.method public final initialize()V
    .locals 3

    iget-object v0, p0, Lxv/g;->x:Lxv/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v2, p0, Lxv/g;->E:Lyv/b;

    check-cast v0, Lxv/f;

    invoke-virtual {v0, v2}, Lxv/f;->setSettings(Lyv/b;)V

    invoke-static {p0}, Lxv/g;->e(Lxv/g;)V

    iget-object v0, p0, Lxv/g;->y:Lcom/mapbox/maps/MapboxMap;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lxv/g;->F:Lrm/p;

    invoke-interface {v0, v1}, Lmv/d;->subscribeCameraChangedCoalesced(Lcom/mapbox/maps/CameraChangedCoalescedCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object v0

    iput-object v0, p0, Lxv/g;->G:Lcom/mapbox/common/Cancelable;

    return-void

    :cond_0
    const-string v0, "mapListenerDelegate"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    const-string v0, "scaleBar"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public final onSizeChanged(II)V
    .locals 0

    iget-object p2, p0, Lxv/g;->x:Lxv/b;

    if-eqz p2, :cond_1

    int-to-float p1, p1

    check-cast p2, Lxv/f;

    invoke-virtual {p2, p1}, Lxv/f;->setMapViewWidth(F)V

    iget-object p1, p0, Lxv/g;->E:Lyv/b;

    iget-boolean p1, p1, Lyv/b;->w:Z

    if-eqz p1, :cond_0

    invoke-static {p0}, Lxv/g;->e(Lxv/g;)V

    :cond_0
    return-void

    :cond_1
    const-string p1, "scaleBar"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method
