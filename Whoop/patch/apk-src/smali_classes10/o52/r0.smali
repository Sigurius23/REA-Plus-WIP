.class public final Lo52/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/common/location/LocationObserver;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u001c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lo52/r0;",
        "Lcom/mapbox/common/location/LocationObserver;",
        "Lo52/d;",
        "activity",
        "<init>",
        "(Lo52/d;)V",
        "",
        "Lcom/mapbox/common/location/Location;",
        "locations",
        "Ll83/a0;",
        "onLocationUpdateReceived",
        "(Ljava/util/List;)V",
        "Ljava/lang/ref/WeakReference;",
        "a",
        "Ljava/lang/ref/WeakReference;",
        "activityWeakReference",
        "Ltr2/n;",
        "b",
        "Ltr2/n;",
        "getLogger",
        "()Ltr2/n;",
        "logger",
        "realtime-activity_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lo52/d;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lo52/d;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo52/r0;->a:Ljava/lang/ref/WeakReference;

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string v0, "StartActivityLocationCallback"

    invoke-virtual {p1, v0}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    iput-object p1, p0, Lo52/r0;->b:Ltr2/n;

    return-void
.end method


# virtual methods
.method public onLocationUpdateReceived(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/mapbox/common/location/Location;",
            ">;)V"
        }
    .end annotation

    const-string v0, "locations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo52/r0;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo52/d;

    invoke-static {p1}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mapbox/common/location/Location;

    if-eqz p1, :cond_1

    iget-object v1, p0, Lo52/r0;->b:Ltr2/n;

    invoke-virtual {p1}, Lcom/mapbox/common/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-virtual {p1}, Lcom/mapbox/common/location/Location;->getLongitude()D

    move-result-wide v4

    const-string v6, "Location was fetched - Latitude: "

    const-string v7, " , Longitude: "

    invoke-static {v6, v2, v3, v7}, Lb9/y;->s(Ljava/lang/String;DLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {v1, v2, v3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    if-eqz v0, :cond_0

    :try_start_0
    invoke-interface {v0}, Lo52/d;->getMapboxMap()Lcom/mapbox/maps/MapboxMap;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Lcom/mapbox/maps/CameraOptions$Builder;

    invoke-direct {v2}, Lcom/mapbox/maps/CameraOptions$Builder;-><init>()V

    const-wide/high16 v3, 0x402c000000000000L    # 14.0

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/mapbox/maps/CameraOptions$Builder;->zoom(Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions$Builder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/mapbox/common/location/Location;->getLongitude()D

    move-result-wide v3

    invoke-virtual {p1}, Lcom/mapbox/common/location/Location;->getLatitude()D

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Lcom/mapbox/geojson/Point;->fromLngLat(DD)Lcom/mapbox/geojson/Point;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/mapbox/maps/CameraOptions$Builder;->center(Lcom/mapbox/geojson/Point;)Lcom/mapbox/maps/CameraOptions$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mapbox/maps/CameraOptions$Builder;->build()Lcom/mapbox/maps/CameraOptions;

    move-result-object p1

    const-string v2, "build(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v2, 0x3e8

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    new-instance v3, Lfv/p;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v2, v4}, Lfv/p;-><init>(Ljava/lang/String;Ljava/lang/Long;Landroid/animation/TimeInterpolator;)V

    new-instance v2, Lb2/z;

    const/16 v4, 0xc

    invoke-direct {v2, v4, p1, v3}, Lb2/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Lmv/e;->cameraAnimationsPlugin(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, Lo52/d;->c()V

    :cond_1
    return-void
.end method
