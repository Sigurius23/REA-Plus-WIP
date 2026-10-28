.class public interface abstract Lcom/mapbox/common/location/LocationService;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/common/location/LocationService$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H&\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH&\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH&\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ\'\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\r2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018H&\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ9\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0016\u0010\u001fJ/\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010!\u001a\u00020 2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&\u00a2\u0006\u0004\u0008\u0016\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lcom/mapbox/common/location/LocationService;",
        "",
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
.method public abstract getAccuracyAuthorization()Lcom/mapbox/common/location/AccuracyAuthorization;
.end method

.method public abstract getDeviceLocationProvider(Lcom/mapbox/common/location/DeviceLocationProviderType;Lcom/mapbox/common/location/LocationProviderRequest;Z)Lcom/mapbox/bindgen/Expected;
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
.end method

.method public abstract getDeviceLocationProvider(Lcom/mapbox/common/location/ExtendedLocationProviderParameters;Lcom/mapbox/common/location/LocationProviderRequest;)Lcom/mapbox/bindgen/Expected;
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
.end method

.method public abstract getDeviceLocationProvider(Lcom/mapbox/common/location/LocationProviderRequest;)Lcom/mapbox/bindgen/Expected;
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

.method public abstract getPermissionStatus()Lcom/mapbox/common/location/PermissionStatus;
.end method

.method public abstract isAvailable()Z
.end method

.method public abstract registerObserver(Lcom/mapbox/common/location/LocationServiceObserver;)V
.end method

.method public abstract setUserDefinedDeviceLocationProviderFactory(Lcom/mapbox/common/location/DeviceLocationProviderFactory;)V
.end method

.method public abstract unregisterObserver(Lcom/mapbox/common/location/LocationServiceObserver;)V
.end method
