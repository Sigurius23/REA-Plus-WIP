.class public final Lcom/mapbox/common/location/GoogleDeviceLocationProvider;
.super Lcom/mapbox/common/location/BaseDeviceLocationProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/common/location/GoogleDeviceLocationProvider$Companion;,
        Lcom/mapbox/common/location/GoogleDeviceLocationProvider$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000u\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0006*\u0001/\u0008\u0000\u0018\u0000 72\u00020\u0001:\u00017B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0015\u00a2\u0006\u0004\u0008\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0014\u00a2\u0006\u0004\u0008\u000f\u0010\rJ\u001d\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0011\u0010!\u001a\u0004\u0018\u00010 H\u0016\u00a2\u0006\u0004\u0008!\u0010\"J\u000f\u0010#\u001a\u00020 H\u0016\u00a2\u0006\u0004\u0008#\u0010\"R(\u0010%\u001a\u00020$8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008%\u0010&\u0012\u0004\u0008+\u0010\r\u001a\u0004\u0008\'\u0010(\"\u0004\u0008)\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u001a\u00103\u001a\u0002028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00083\u00104\u001a\u0004\u00085\u00106\u00a8\u00068"
    }
    d2 = {
        "Lcom/mapbox/common/location/GoogleDeviceLocationProvider;",
        "Lcom/mapbox/common/location/BaseDeviceLocationProvider;",
        "Landroid/content/Context;",
        "context",
        "Lcom/mapbox/common/location/LocationProviderRequest;",
        "request",
        "<init>",
        "(Landroid/content/Context;Lcom/mapbox/common/location/LocationProviderRequest;)V",
        "Landroid/os/Looper;",
        "createFusedLocationClientHandler",
        "()Landroid/os/Looper;",
        "Ll83/a0;",
        "quitFusedLocationClientHandler",
        "()V",
        "doStart",
        "doStop",
        "Landroid/content/Intent;",
        "intent",
        "",
        "Lcom/mapbox/common/location/Location;",
        "extractResult",
        "(Landroid/content/Intent;)Ljava/util/List;",
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
        "toString",
        "Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;",
        "fusedLocationProviderClient",
        "Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;",
        "getFusedLocationProviderClient",
        "()Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;",
        "setFusedLocationProviderClient",
        "(Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;)V",
        "getFusedLocationProviderClient$annotations",
        "Landroid/os/HandlerThread;",
        "fusedLocationClientHandlerThread",
        "Landroid/os/HandlerThread;",
        "com/mapbox/common/location/GoogleDeviceLocationProvider$locationCallback$1",
        "locationCallback",
        "Lcom/mapbox/common/location/GoogleDeviceLocationProvider$locationCallback$1;",
        "",
        "persistentId",
        "I",
        "getPersistentId",
        "()I",
        "Companion",
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
.field public static final Companion:Lcom/mapbox/common/location/GoogleDeviceLocationProvider$Companion;

.field private static final TAG:Ljava/lang/String; = "GoogleDeviceLocationProvider"


# instance fields
.field private fusedLocationClientHandlerThread:Landroid/os/HandlerThread;

.field private fusedLocationProviderClient:Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;

.field private final locationCallback:Lcom/mapbox/common/location/GoogleDeviceLocationProvider$locationCallback$1;

.field private final persistentId:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->Companion:Lcom/mapbox/common/location/GoogleDeviceLocationProvider$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/mapbox/common/location/LocationProviderRequest;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/mapbox/common/location/BaseDeviceLocationProvider;-><init>(Landroid/content/Context;Lcom/mapbox/common/location/LocationProviderRequest;)V

    new-instance v0, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;

    invoke-direct {v0, p1}, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->fusedLocationProviderClient:Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;

    new-instance p1, Lcom/mapbox/common/location/GoogleDeviceLocationProvider$locationCallback$1;

    invoke-direct {p1, p0}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider$locationCallback$1;-><init>(Lcom/mapbox/common/location/GoogleDeviceLocationProvider;)V

    iput-object p1, p0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->locationCallback:Lcom/mapbox/common/location/GoogleDeviceLocationProvider$locationCallback$1;

    sget-object p1, Lcom/mapbox/common/location/DeviceLocationProviderType;->GOOGLE_PLAY_SERVICES:Lcom/mapbox/common/location/DeviceLocationProviderType;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->persistentId:I

    return-void
.end method

.method public static final synthetic access$quitFusedLocationClientHandler(Lcom/mapbox/common/location/GoogleDeviceLocationProvider;)V
    .locals 0

    invoke-direct {p0}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->quitFusedLocationClientHandler()V

    return-void
.end method

.method public static synthetic b(Lcom/mapbox/common/location/PermissionStatus;Lcom/mapbox/common/location/GoogleDeviceLocationProvider;Lkotlin/jvm/internal/g0;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->doStart$lambda$1(Lcom/mapbox/common/location/PermissionStatus;Lcom/mapbox/common/location/GoogleDeviceLocationProvider;Lkotlin/jvm/internal/g0;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-static {p1, p0}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->doStart$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private final createFusedLocationClientHandler()Landroid/os/Looper;
    .locals 2

    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "fusedLocationClientHandlerThread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->fusedLocationClientHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    iget-object v0, p0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->fusedLocationClientHandlerThread:Landroid/os/HandlerThread;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static synthetic d(Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->removeLocationUpdates$lambda$10(Ljava/lang/Exception;)V

    return-void
.end method

.method private static final doStart$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final doStart$lambda$1(Lcom/mapbox/common/location/PermissionStatus;Lcom/mapbox/common/location/GoogleDeviceLocationProvider;Lkotlin/jvm/internal/g0;Ljava/lang/Exception;)V
    .locals 3

    const-string v0, "$permission"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$pendingMode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exception"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/common/MapboxCommonLogger;->INSTANCE:Lcom/mapbox/common/MapboxCommonLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to start: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const-string v1, "GoogleDeviceLocationProvider"

    invoke-virtual {v0, v1, p3}, Lcom/mapbox/common/MapboxCommonLogger;->logE$common_release(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p3, Lcom/mapbox/common/location/PermissionStatus;->DENIED:Lcom/mapbox/common/location/PermissionStatus;

    if-ne p0, p3, :cond_0

    const-string p0, "common/location/googleProviderNoPermissions"

    invoke-static {p0}, Lcom/mapbox/common/FeatureTelemetryCounter;->create(Ljava/lang/String;)Lcom/mapbox/common/FeatureTelemetryCounter;

    move-result-object p0

    invoke-virtual {p0}, Lcom/mapbox/common/FeatureTelemetryCounter;->increment()V

    goto :goto_0

    :cond_0
    const-string p0, "common/location/googleProviderFailed"

    invoke-static {p0}, Lcom/mapbox/common/FeatureTelemetryCounter;->create(Ljava/lang/String;)Lcom/mapbox/common/FeatureTelemetryCounter;

    move-result-object p0

    invoke-virtual {p0}, Lcom/mapbox/common/FeatureTelemetryCounter;->increment()V

    :goto_0
    sget-object p0, Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;->STOPPED:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;

    iput-object p0, p1, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->state:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;

    iget-object p0, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object p2, Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;->CALLBACK:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;

    if-ne p0, p2, :cond_1

    invoke-direct {p1}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->quitFusedLocationClientHandler()V

    :cond_1
    return-void
.end method

.method private static final doStop$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final doStop$lambda$3(Lcom/mapbox/common/location/GoogleDeviceLocationProvider;Ljava/lang/Exception;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/common/MapboxCommonLogger;->INSTANCE:Lcom/mapbox/common/MapboxCommonLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to stop: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "GoogleDeviceLocationProvider"

    invoke-virtual {v0, v1, p1}, Lcom/mapbox/common/MapboxCommonLogger;->logE$common_release(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->quitFusedLocationClientHandler()V

    return-void
.end method

.method public static synthetic e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-static {p1, p0}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->doStop$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic f(Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->requestLocationUpdates$lambda$8(Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic g(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-static {p1, p0}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->requestLocationUpdates$lambda$7(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic getFusedLocationProviderClient$annotations()V
    .locals 0

    return-void
.end method

.method private static final getLastLocation$lambda$6(Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;Lcom/mapbox/common/location/GetLocationCallback;Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    const-string v0, "$cancelable"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider$getLastLocation$1$1;

    invoke-direct {v0, p2, p0, p1}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider$getLastLocation$1$1;-><init>(Lcom/google/android/gms/tasks/Task;Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;Lcom/mapbox/common/location/GetLocationCallback;)V

    invoke-virtual {p0, v0}, Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;->invokeIfNotCanceled(Lc93/a;)V

    return-void
.end method

.method public static synthetic h(Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;Lcom/mapbox/common/location/GetLocationCallback;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->getLastLocation$lambda$6(Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;Lcom/mapbox/common/location/GetLocationCallback;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method public static synthetic i(Lcom/mapbox/common/location/GoogleDeviceLocationProvider;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->doStop$lambda$3(Lcom/mapbox/common/location/GoogleDeviceLocationProvider;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic j(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-static {p1, p0}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->removeLocationUpdates$lambda$9(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private final quitFusedLocationClientHandler()V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->fusedLocationClientHandlerThread:Landroid/os/HandlerThread;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quitSafely()Z

    :cond_0
    return-void
.end method

.method private static final removeLocationUpdates$lambda$10(Ljava/lang/Exception;)V
    .locals 3

    const-string v0, "exception"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/common/MapboxCommonLogger;->INSTANCE:Lcom/mapbox/common/MapboxCommonLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to remove location updates: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "GoogleDeviceLocationProvider"

    invoke-virtual {v0, v1, p0}, Lcom/mapbox/common/MapboxCommonLogger;->logE$common_release(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final removeLocationUpdates$lambda$9(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final requestLocationUpdates$lambda$7(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final requestLocationUpdates$lambda$8(Ljava/lang/Exception;)V
    .locals 3

    const-string v0, "exception"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/common/MapboxCommonLogger;->INSTANCE:Lcom/mapbox/common/MapboxCommonLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to request location updates: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "GoogleDeviceLocationProvider"

    invoke-virtual {v0, v1, p0}, Lcom/mapbox/common/MapboxCommonLogger;->logE$common_release(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public declared-synchronized doStart()V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    const-string v0, "Permission status: "

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->getRequest()Lcom/mapbox/common/location/LocationProviderRequest;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lcom/mapbox/common/location/LocationProviderSettingsExtKt;->toLocationRequest(Lcom/mapbox/common/location/LocationProviderRequest;)Lcom/mapbox/bindgen/Expected;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/location/LocationRequest;

    if-nez v1, :cond_1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_2

    :cond_0
    :goto_0
    invoke-static {}, Lcom/google/android/gms/location/LocationRequest;->b()Lcom/google/android/gms/location/LocationRequest;

    move-result-object v1

    :cond_1
    invoke-virtual {p0}, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/mapbox/common/location/LocationServiceUtils;->getPermissionStatus(Landroid/content/Context;)Lcom/mapbox/common/location/PermissionStatus;

    move-result-object v2

    sget-object v3, Lcom/mapbox/common/MapboxCommonLogger;->INSTANCE:Lcom/mapbox/common/MapboxCommonLogger;

    const-string v4, "GoogleDeviceLocationProvider"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Lcom/mapbox/common/MapboxCommonLogger;->logD$common_release(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lkotlin/jvm/internal/g0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v3, Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;->NONE:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;

    iput-object v3, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object v3, Lcom/mapbox/common/location/GoogleDeviceLocationProvider$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    const/4 v4, 0x1

    if-eq v3, v4, :cond_4

    const/4 v4, 0x2

    if-eq v3, v4, :cond_4

    const/4 v4, 0x3

    if-eq v3, v4, :cond_3

    const/4 v1, 0x4

    if-ne v3, v1, :cond_2

    new-instance v1, Ljava/lang/Exception;

    const-string v3, "Cannot start Google device location provider: permission denied"

    invoke-direct {v1, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    new-instance v3, Lcom/mapbox/common/location/FailedTask;

    invoke-direct {v3, v1}, Lcom/mapbox/common/location/FailedTask;-><init>(Ljava/lang/Exception;)V

    goto :goto_1

    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_3
    sget-object v3, Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;->PENDING_INTENT:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;

    iput-object v3, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object v3, p0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->fusedLocationProviderClient:Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;

    invoke-virtual {p0}, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->getLocationUpdatePendingIntent()Landroid/app/PendingIntent;

    move-result-object v4

    invoke-virtual {v3, v1, v4}, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;

    move-result-object v3

    goto :goto_1

    :cond_4
    sget-object v3, Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;->CALLBACK:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;

    iput-object v3, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object v3, p0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->fusedLocationProviderClient:Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;

    iget-object v4, p0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->locationCallback:Lcom/mapbox/common/location/GoogleDeviceLocationProvider$locationCallback$1;

    invoke-direct {p0}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->createFusedLocationClientHandler()Landroid/os/Looper;

    move-result-object v5

    invoke-virtual {v3, v1, v4, v5}, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Ltp/g;Landroid/os/Looper;)Lcom/google/android/gms/tasks/Task;

    move-result-object v3

    :goto_1
    if-eqz v3, :cond_5

    new-instance v1, Lcom/mapbox/common/location/GoogleDeviceLocationProvider$doStart$1;

    invoke-direct {v1, p0, v0}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider$doStart$1;-><init>(Lcom/mapbox/common/location/GoogleDeviceLocationProvider;Lkotlin/jvm/internal/g0;)V

    new-instance v4, Lcom/mapbox/common/location/a;

    const/4 v5, 0x2

    invoke-direct {v4, v1, v5}, Lcom/mapbox/common/location/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v3, v4}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcq/f;)Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    if-eqz v1, :cond_5

    new-instance v3, Lcom/mapbox/common/location/b;

    invoke-direct {v3, v2, p0, v0}, Lcom/mapbox/common/location/b;-><init>(Lcom/mapbox/common/location/PermissionStatus;Lcom/mapbox/common/location/GoogleDeviceLocationProvider;Lkotlin/jvm/internal/g0;)V

    invoke-virtual {v1, v3}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcq/e;)Lcom/google/android/gms/tasks/Task;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_5
    monitor-exit p0

    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized doStop()V
    .locals 5

    const-string v0, "Cannot stop Google device location provider. Invalid mode: "

    const-string v1, "doStop() called with currentMode: "

    monitor-enter p0

    :try_start_0
    sget-object v2, Lcom/mapbox/common/MapboxCommonLogger;->INSTANCE:Lcom/mapbox/common/MapboxCommonLogger;

    const-string v3, "GoogleDeviceLocationProvider"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->getCurrentMode()Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Lcom/mapbox/common/MapboxCommonLogger;->logD$common_release(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->getCurrentMode()Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;

    move-result-object v1

    sget-object v2, Lcom/mapbox/common/location/GoogleDeviceLocationProvider$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    new-instance v1, Lcom/mapbox/common/location/FailedTask;

    new-instance v2, Ljava/lang/Exception;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->getCurrentMode()Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lcom/mapbox/common/location/FailedTask;-><init>(Ljava/lang/Exception;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    iget-object v0, p0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->fusedLocationProviderClient:Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;

    invoke-virtual {p0}, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->getLocationUpdatePendingIntent()Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->removeLocationUpdates(Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->fusedLocationProviderClient:Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;

    iget-object v1, p0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->locationCallback:Lcom/mapbox/common/location/GoogleDeviceLocationProvider$locationCallback$1;

    invoke-virtual {v0, v1}, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->removeLocationUpdates(Ltp/g;)Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_3

    new-instance v0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider$doStop$1;

    invoke-direct {v0, p0}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider$doStop$1;-><init>(Lcom/mapbox/common/location/GoogleDeviceLocationProvider;)V

    new-instance v2, Lcom/mapbox/common/location/a;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, Lcom/mapbox/common/location/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcq/f;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v1, Lab/g0;

    const/16 v2, 0xf

    invoke-direct {v1, p0, v2}, Lab/g0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcq/e;)Lcom/google/android/gms/tasks/Task;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public extractResult(Landroid/content/Intent;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            ")",
            "Ljava/util/List<",
            "Lcom/mapbox/common/location/Location;",
            ">;"
        }
    .end annotation

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/location/LocationResult;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string v0, "com.google.android.gms.location.EXTRA_LOCATION_RESULT"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/location/LocationResult;

    :goto_0
    if-eqz p1, :cond_2

    iget-object p1, p1, Lcom/google/android/gms/location/LocationResult;->w:Ljava/util/List;

    const-string v0, "locationResult.locations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/location/Location;

    const-string v2, "location"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/mapbox/common/location/LocationServiceUtils;->toCommonLocation(Landroid/location/Location;)Lcom/mapbox/common/location/Location;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    return-object v0

    :cond_2
    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final getFusedLocationProviderClient()Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->fusedLocationProviderClient:Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;

    return-object v0
.end method

.method public getLastLocation(Lcom/mapbox/common/location/GetLocationCallback;)Lcom/mapbox/common/Cancelable;
    .locals 3

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;

    invoke-direct {v0, p0}, Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;-><init>(Lcom/mapbox/common/location/BaseDeviceLocationProvider;)V

    iget-object v1, p0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->fusedLocationProviderClient:Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;

    invoke-virtual {v1}, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->getLastLocation()Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Lcom/mapbox/common/location/c;

    invoke-direct {v2, v0, p1}, Lcom/mapbox/common/location/c;-><init>(Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;Lcom/mapbox/common/location/GetLocationCallback;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcq/d;)Lcom/google/android/gms/tasks/Task;

    :cond_0
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "mapbox-google"

    return-object v0
.end method

.method public getPersistentId()I
    .locals 1

    iget v0, p0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->persistentId:I

    return v0
.end method

.method public removeLocationUpdates(Landroid/app/PendingIntent;)V
    .locals 3

    const-string v0, "pendingIntent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->fusedLocationProviderClient:Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;

    invoke-virtual {v0, p1}, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->removeLocationUpdates(Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object v0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider$removeLocationUpdates$1;->INSTANCE:Lcom/mapbox/common/location/GoogleDeviceLocationProvider$removeLocationUpdates$1;

    new-instance v1, Lcom/mapbox/common/location/a;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/mapbox/common/location/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {p1, v1}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcq/f;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Lc9/g;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lc9/g;-><init>(I)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcq/e;)Lcom/google/android/gms/tasks/Task;

    :cond_0
    return-void
.end method

.method public requestLocationUpdates(Landroid/app/PendingIntent;)V
    .locals 3

    const-string v0, "pendingIntent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->getRequest()Lcom/mapbox/common/location/LocationProviderRequest;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/mapbox/common/location/LocationProviderSettingsExtKt;->toLocationRequest(Lcom/mapbox/common/location/LocationProviderRequest;)Lcom/mapbox/bindgen/Expected;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/LocationRequest;

    if-nez v0, :cond_1

    :cond_0
    invoke-static {}, Lcom/google/android/gms/location/LocationRequest;->b()Lcom/google/android/gms/location/LocationRequest;

    move-result-object v0

    :cond_1
    iget-object v1, p0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->fusedLocationProviderClient:Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;

    invoke-virtual {v1, v0, p1}, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    if-eqz p1, :cond_2

    sget-object v0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider$requestLocationUpdates$1;->INSTANCE:Lcom/mapbox/common/location/GoogleDeviceLocationProvider$requestLocationUpdates$1;

    new-instance v1, Lcom/mapbox/common/location/a;

    const/4 v2, 0x3

    invoke-direct {v1, v0, v2}, Lcom/mapbox/common/location/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {p1, v1}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcq/f;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    if-eqz p1, :cond_2

    new-instance v0, Lc9/g;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lc9/g;-><init>(I)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcq/e;)Lcom/google/android/gms/tasks/Task;

    :cond_2
    return-void
.end method

.method public final setFusedLocationProviderClient(Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->fusedLocationProviderClient:Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "GoogleDeviceLocationProvider("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->getPersistentId()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "): [request: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->getRequest()Lcom/mapbox/common/location/LocationProviderRequest;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
