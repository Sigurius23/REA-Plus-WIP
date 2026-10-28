.class public interface abstract Lcom/mapbox/common/location/LocationProvider;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008\u0005\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\n\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH&\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/mapbox/common/location/LocationProvider;",
        "",
        "Lcom/mapbox/common/location/LocationObserver;",
        "observer",
        "Ll83/a0;",
        "addLocationObserver",
        "(Lcom/mapbox/common/location/LocationObserver;)V",
        "Landroid/os/Looper;",
        "looper",
        "(Lcom/mapbox/common/location/LocationObserver;Landroid/os/Looper;)V",
        "removeLocationObserver",
        "Lcom/mapbox/common/location/GetLocationCallback;",
        "callback",
        "Lcom/mapbox/common/Cancelable;",
        "getLastLocation",
        "(Lcom/mapbox/common/location/GetLocationCallback;)Lcom/mapbox/common/Cancelable;",
        "common_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract addLocationObserver(Lcom/mapbox/common/location/LocationObserver;)V
.end method

.method public abstract addLocationObserver(Lcom/mapbox/common/location/LocationObserver;Landroid/os/Looper;)V
.end method

.method public abstract getLastLocation(Lcom/mapbox/common/location/GetLocationCallback;)Lcom/mapbox/common/Cancelable;
.end method

.method public abstract removeLocationObserver(Lcom/mapbox/common/location/LocationObserver;)V
.end method
