.class public final Lcom/mapbox/common/location/LocationServiceNative;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/common/location/LocationService;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/common/location/LocationServiceNative$LocationServicePeerCleaner;,
        Lcom/mapbox/common/location/LocationServiceNative$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u0000 +2\u00020\u0001:\u0002+,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096 \u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u0096 \u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u0096 \u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0096 \u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0096 \u00a2\u0006\u0004\u0008\u0014\u0010\u0013J&\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0097 \u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00112\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096 \u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ5\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010!\u001a\u00020 2\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\"\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010#J-\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010%\u001a\u00020$2\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010&R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\'\u001a\u0004\u0008(\u0010)\"\u0004\u0008*\u0010\u0005\u00a8\u0006-"
    }
    d2 = {
        "Lcom/mapbox/common/location/LocationServiceNative;",
        "Lcom/mapbox/common/location/LocationService;",
        "",
        "peer",
        "<init>",
        "(J)V",
        "",
        "isAvailable",
        "()Z",
        "Lcom/mapbox/common/location/PermissionStatus;",
        "getPermissionStatus",
        "()Lcom/mapbox/common/location/PermissionStatus;",
        "Lcom/mapbox/common/location/AccuracyAuthorization;",
        "getAccuracyAuthorization",
        "()Lcom/mapbox/common/location/AccuracyAuthorization;",
        "Lcom/mapbox/common/location/LocationServiceObserver;",
        "observer",
        "Ll83/a0;",
        "registerObserver",
        "(Lcom/mapbox/common/location/LocationServiceObserver;)V",
        "unregisterObserver",
        "Lcom/mapbox/common/location/LocationProviderRequest;",
        "request",
        "Lcom/mapbox/bindgen/Expected;",
        "Lcom/mapbox/common/location/LocationError;",
        "Lcom/mapbox/common/location/DeviceLocationProvider;",
        "getDeviceLocationProvider",
        "(Lcom/mapbox/common/location/LocationProviderRequest;)Lcom/mapbox/bindgen/Expected;",
        "Lcom/mapbox/common/location/DeviceLocationProviderFactory;",
        "factory",
        "setUserDefinedDeviceLocationProviderFactory",
        "(Lcom/mapbox/common/location/DeviceLocationProviderFactory;)V",
        "Lcom/mapbox/common/location/DeviceLocationProviderType;",
        "type",
        "allowUserDefined",
        "(Lcom/mapbox/common/location/DeviceLocationProviderType;Lcom/mapbox/common/location/LocationProviderRequest;Z)Lcom/mapbox/bindgen/Expected;",
        "Lcom/mapbox/common/location/ExtendedLocationProviderParameters;",
        "extendedParameters",
        "(Lcom/mapbox/common/location/ExtendedLocationProviderParameters;Lcom/mapbox/common/location/LocationProviderRequest;)Lcom/mapbox/bindgen/Expected;",
        "J",
        "getPeer",
        "()J",
        "setPeer",
        "Companion",
        "LocationServicePeerCleaner",
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
.field public static final Companion:Lcom/mapbox/common/location/LocationServiceNative$Companion;


# instance fields
.field private peer:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/common/location/LocationServiceNative$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/common/location/LocationServiceNative$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/common/location/LocationServiceNative;->Companion:Lcom/mapbox/common/location/LocationServiceNative$Companion;

    return-void
.end method

.method public constructor <init>(J)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/mapbox/common/location/LocationServiceNative;->peer:J

    new-instance v0, Lcom/mapbox/common/location/LocationServiceNative$LocationServicePeerCleaner;

    invoke-direct {v0, p1, p2}, Lcom/mapbox/common/location/LocationServiceNative$LocationServicePeerCleaner;-><init>(J)V

    invoke-static {p0, v0}, Lcom/mapbox/bindgen/CleanerService;->register(Ljava/lang/Object;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static final native cleanNativePeer(J)V
.end method


# virtual methods
.method public native getAccuracyAuthorization()Lcom/mapbox/common/location/AccuracyAuthorization;
.end method

.method public getDeviceLocationProvider(Lcom/mapbox/common/location/DeviceLocationProviderType;Lcom/mapbox/common/location/LocationProviderRequest;Z)Lcom/mapbox/bindgen/Expected;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/common/location/DeviceLocationProviderType;",
            "Lcom/mapbox/common/location/LocationProviderRequest;",
            "Z)",
            "Lcom/mapbox/bindgen/Expected<",
            "Lcom/mapbox/common/location/LocationError;",
            "Lcom/mapbox/common/location/DeviceLocationProvider;",
            ">;"
        }
    .end annotation

    const-string p2, "type"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "There should be no native LocationService"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getDeviceLocationProvider(Lcom/mapbox/common/location/ExtendedLocationProviderParameters;Lcom/mapbox/common/location/LocationProviderRequest;)Lcom/mapbox/bindgen/Expected;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/common/location/ExtendedLocationProviderParameters;",
            "Lcom/mapbox/common/location/LocationProviderRequest;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Lcom/mapbox/common/location/LocationError;",
            "Lcom/mapbox/common/location/DeviceLocationProvider;",
            ">;"
        }
    .end annotation

    const-string p2, "extendedParameters"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "There should be no native LocationService"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public native getDeviceLocationProvider(Lcom/mapbox/common/location/LocationProviderRequest;)Lcom/mapbox/bindgen/Expected;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/common/location/LocationProviderRequest;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Lcom/mapbox/common/location/LocationError;",
            "Lcom/mapbox/common/location/DeviceLocationProvider;",
            ">;"
        }
    .end annotation
.end method

.method public final getPeer()J
    .locals 2

    iget-wide v0, p0, Lcom/mapbox/common/location/LocationServiceNative;->peer:J

    return-wide v0
.end method

.method public native getPermissionStatus()Lcom/mapbox/common/location/PermissionStatus;
.end method

.method public native isAvailable()Z
.end method

.method public native registerObserver(Lcom/mapbox/common/location/LocationServiceObserver;)V
.end method

.method public final setPeer(J)V
    .locals 0

    iput-wide p1, p0, Lcom/mapbox/common/location/LocationServiceNative;->peer:J

    return-void
.end method

.method public native setUserDefinedDeviceLocationProviderFactory(Lcom/mapbox/common/location/DeviceLocationProviderFactory;)V
.end method

.method public native unregisterObserver(Lcom/mapbox/common/location/LocationServiceObserver;)V
.end method
