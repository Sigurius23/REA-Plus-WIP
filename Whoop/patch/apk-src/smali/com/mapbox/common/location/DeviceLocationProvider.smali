.class public interface abstract Lcom/mapbox/common/location/DeviceLocationProvider;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/common/location/LocationProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/common/location/DeviceLocationProvider$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0006J\u0011\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/mapbox/common/location/DeviceLocationProvider;",
        "Lcom/mapbox/common/location/LocationProvider;",
        "Landroid/app/PendingIntent;",
        "pendingIntent",
        "Ll83/a0;",
        "requestLocationUpdates",
        "(Landroid/app/PendingIntent;)V",
        "removeLocationUpdates",
        "",
        "getName",
        "()Ljava/lang/String;",
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
.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract removeLocationUpdates(Landroid/app/PendingIntent;)V
.end method

.method public abstract requestLocationUpdates(Landroid/app/PendingIntent;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/SecurityException;
        }
    .end annotation
.end method
