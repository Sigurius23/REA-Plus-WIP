.class public final Lov/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lou/c;

.field public final synthetic b:Lov/o;


# direct methods
.method public constructor <init>(Lov/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lov/e;->b:Lov/o;

    return-void
.end method


# virtual methods
.method public final a(Lou/c;FF)V
    .locals 11

    iget-object v0, p1, Lou/e;->l:Ljava/util/ArrayList;

    const/4 v1, 0x0

    cmpg-float v2, p2, v1

    if-nez v2, :cond_0

    cmpg-float v1, p3, v1

    if-nez v1, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x2

    if-le v1, v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lov/e;->b:Lov/o;

    iget-object v3, v1, Lov/o;->u0:Lpv/b;

    iget-boolean v3, v3, Lpv/b;->Q:Z

    const/4 v4, 0x1

    if-nez v3, :cond_2

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v0, v4, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, v1, Lov/o;->y:Lio/sentry/android/replay/video/d;

    if-eqz v0, :cond_9

    iget-object v0, v0, Lio/sentry/android/replay/video/d;->f:Ljava/lang/Object;

    check-cast v0, Lou/j;

    iget-boolean v0, v0, Lou/h;->q:Z

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p1, Lou/e;->n:Landroid/graphics/PointF;

    iget v3, v0, Landroid/graphics/PointF;->x:F

    float-to-double v5, v3

    iget v0, v0, Landroid/graphics/PointF;->y:F

    float-to-double v7, v0

    invoke-static {v5, v6}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    const-string v3, " to perform map panning!"

    const-string v9, "Gestures"

    if-nez v0, :cond_8

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-static {v7, v8}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-static {p2}, Ljava/lang/Float;->isInfinite(F)Z

    move-result p1

    if-nez p1, :cond_7

    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-nez p1, :cond_7

    invoke-static {p3}, Ljava/lang/Float;->isInfinite(F)Z

    move-result p1

    if-nez p1, :cond_7

    invoke-static {p3}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-nez p1, :cond_7

    new-instance p1, Lcom/mapbox/maps/ScreenCoordinate;

    invoke-direct {p1, v5, v6, v7, v8}, Lcom/mapbox/maps/ScreenCoordinate;-><init>(DD)V

    invoke-virtual {v1, p1}, Lov/o;->m(Lcom/mapbox/maps/ScreenCoordinate;)Z

    move-result p1

    if-eqz p1, :cond_4

    :goto_0
    return-void

    :cond_4
    iget-object p1, v1, Lov/o;->u0:Lpv/b;

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, p1, Lpv/b;->F:I

    const-wide/16 v9, 0x0

    if-ne p1, v2, :cond_5

    move-wide p1, v9

    goto :goto_1

    :cond_5
    float-to-double p1, p2

    :goto_1
    iget-object v2, v1, Lov/o;->u0:Lpv/b;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, v2, Lpv/b;->F:I

    if-ne v0, v4, :cond_6

    goto :goto_2

    :cond_6
    float-to-double v9, p3

    :goto_2
    sub-double/2addr v5, p1

    sub-double/2addr v7, v9

    invoke-virtual {v1}, Lov/o;->k()Lmv/c;

    move-result-object p1

    new-instance p2, Lcom/mapbox/maps/PlatformEventInfo;

    sget-object p3, Lcom/mapbox/maps/PlatformEventType;->DRAG:Lcom/mapbox/maps/PlatformEventType;

    new-instance v0, Lcom/mapbox/maps/ScreenCoordinate;

    invoke-direct {v0, v5, v6, v7, v8}, Lcom/mapbox/maps/ScreenCoordinate;-><init>(DD)V

    invoke-direct {p2, p3, v0}, Lcom/mapbox/maps/PlatformEventInfo;-><init>(Lcom/mapbox/maps/PlatformEventType;Lcom/mapbox/maps/ScreenCoordinate;)V

    invoke-interface {p1, p2}, Lmv/c;->dispatch(Lcom/mapbox/maps/PlatformEventInfo;)V

    return-void

    :cond_7
    const-string p1, "Invalid distanceX="

    const-string v0, " or distanceY="

    invoke-static {p1, p2, v0, p3, v3}, Lr80/c;->n(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v9, p1}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_8
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Invalid focal point="

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Lou/e;->n:Landroid/graphics/PointF;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v9, p1}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_9
    const-string p1, "gesturesManager"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method
