.class public final Lcom/mapbox/common/location/DeviceLocationProviderNative;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/common/location/DeviceLocationProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/common/location/DeviceLocationProviderNative$DeviceLocationProviderPeerCleaner;,
        Lcom/mapbox/common/location/DeviceLocationProviderNative$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0000\u0018\u0000  2\u00020\u0001:\u0002 !B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0096 \u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\t\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0096 \u00a2\u0006\u0004\u0008\u000e\u0010\nJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0096 \u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00082\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00082\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096 \u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010\u0005\u00a8\u0006\""
    }
    d2 = {
        "Lcom/mapbox/common/location/DeviceLocationProviderNative;",
        "Lcom/mapbox/common/location/DeviceLocationProvider;",
        "",
        "peer",
        "<init>",
        "(J)V",
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
        "Landroid/app/PendingIntent;",
        "pendingIntent",
        "requestLocationUpdates",
        "(Landroid/app/PendingIntent;)V",
        "removeLocationUpdates",
        "",
        "getName",
        "()Ljava/lang/String;",
        "J",
        "getPeer",
        "()J",
        "setPeer",
        "Companion",
        "DeviceLocationProviderPeerCleaner",
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


# static fields
.field public static final Companion:Lcom/mapbox/common/location/DeviceLocationProviderNative$Companion;


# instance fields
.field private peer:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/common/location/DeviceLocationProviderNative$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/common/location/DeviceLocationProviderNative$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/common/location/DeviceLocationProviderNative;->Companion:Lcom/mapbox/common/location/DeviceLocationProviderNative$Companion;

    return-void
.end method

.method public constructor <init>(J)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/mapbox/common/location/DeviceLocationProviderNative;->peer:J

    new-instance v0, Lcom/mapbox/common/location/DeviceLocationProviderNative$DeviceLocationProviderPeerCleaner;

    invoke-direct {v0, p1, p2}, Lcom/mapbox/common/location/DeviceLocationProviderNative$DeviceLocationProviderPeerCleaner;-><init>(J)V

    invoke-static {p0, v0}, Lcom/mapbox/bindgen/CleanerService;->register(Ljava/lang/Object;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static final native cleanNativePeer(J)V
.end method


# virtual methods
.method public native addLocationObserver(Lcom/mapbox/common/location/LocationObserver;)V
.end method

.method public addLocationObserver(Lcom/mapbox/common/location/LocationObserver;Landroid/os/Looper;)V
    .locals 1

    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "looper"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "There should be no native DeviceLocationProvider"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public native getLastLocation(Lcom/mapbox/common/location/GetLocationCallback;)Lcom/mapbox/common/Cancelable;
.end method

.method public native getName()Ljava/lang/String;
.end method

.method public final getPeer()J
    .locals 2

    iget-wide v0, p0, Lcom/mapbox/common/location/DeviceLocationProviderNative;->peer:J

    return-wide v0
.end method

.method public native removeLocationObserver(Lcom/mapbox/common/location/LocationObserver;)V
.end method

.method public removeLocationUpdates(Landroid/app/PendingIntent;)V
    .locals 1

    const-string v0, "pendingIntent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "There should be no native DeviceLocationProvider"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public requestLocationUpdates(Landroid/app/PendingIntent;)V
    .locals 1

    const-string v0, "pendingIntent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "There should be no native DeviceLocationProvider"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setPeer(J)V
    .locals 0

    iput-wide p1, p0, Lcom/mapbox/common/location/DeviceLocationProviderNative;->peer:J

    return-void
.end method
