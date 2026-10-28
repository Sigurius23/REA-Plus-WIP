.class public abstract Lcom/mapbox/common/location/BaseDeviceLocationProvider;
.super Lcom/mapbox/common/location/BaseLocationProvider;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/common/location/DeviceLocationProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;,
        Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;,
        Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;,
        Lcom/mapbox/common/location/BaseDeviceLocationProvider$Companion;,
        Lcom/mapbox/common/location/BaseDeviceLocationProvider$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\t\u0008 \u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0004@ABCB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH$\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\tH$\u00a2\u0006\u0004\u0008\u000c\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0012J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H&\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H&\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u001d\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH&\u00a2\u0006\u0004\u0008 \u0010!J\u001d\u0010#\u001a\u00020\t2\u000c\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016\u00a2\u0006\u0004\u0008#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010%\u001a\u0004\u0008&\u0010\'R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010(\u001a\u0004\u0008)\u0010*R\u001c\u0010,\u001a\u00020+8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000c\n\u0004\u0008,\u0010-\u0012\u0004\u0008.\u0010\u000bR\u001b\u00103\u001a\u00020\u00178DX\u0084\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008/\u00100\u001a\u0004\u00081\u00102R\"\u00105\u001a\u0002048\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u00085\u00106\u001a\u0004\u00087\u00108\"\u0004\u00089\u0010:R\u001a\u0010?\u001a\u00020;8&X\u00a7\u0004\u00a2\u0006\u000c\u0012\u0004\u0008>\u0010\u000b\u001a\u0004\u0008<\u0010=\u00a8\u0006D"
    }
    d2 = {
        "Lcom/mapbox/common/location/BaseDeviceLocationProvider;",
        "Lcom/mapbox/common/location/BaseLocationProvider;",
        "Lcom/mapbox/common/location/DeviceLocationProvider;",
        "Landroid/content/Context;",
        "context",
        "Lcom/mapbox/common/location/LocationProviderRequest;",
        "request",
        "<init>",
        "(Landroid/content/Context;Lcom/mapbox/common/location/LocationProviderRequest;)V",
        "Ll83/a0;",
        "doStart",
        "()V",
        "doStop",
        "start",
        "stop",
        "Lcom/mapbox/common/location/LocationObserver;",
        "observer",
        "addLocationObserver",
        "(Lcom/mapbox/common/location/LocationObserver;)V",
        "Landroid/os/Looper;",
        "looper",
        "(Lcom/mapbox/common/location/LocationObserver;Landroid/os/Looper;)V",
        "removeLocationObserver",
        "Landroid/app/PendingIntent;",
        "pendingIntent",
        "requestLocationUpdates",
        "(Landroid/app/PendingIntent;)V",
        "removeLocationUpdates",
        "Landroid/content/Intent;",
        "intent",
        "",
        "Lcom/mapbox/common/location/Location;",
        "extractResult",
        "(Landroid/content/Intent;)Ljava/util/List;",
        "locations",
        "notifyLocationUpdate",
        "(Ljava/util/List;)V",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "Lcom/mapbox/common/location/LocationProviderRequest;",
        "getRequest",
        "()Lcom/mapbox/common/location/LocationProviderRequest;",
        "Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;",
        "state",
        "Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;",
        "getState$annotations",
        "locationUpdatePendingIntent$delegate",
        "Ll83/h;",
        "getLocationUpdatePendingIntent",
        "()Landroid/app/PendingIntent;",
        "locationUpdatePendingIntent",
        "Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;",
        "currentMode",
        "Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;",
        "getCurrentMode",
        "()Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;",
        "setCurrentMode",
        "(Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;)V",
        "",
        "getPersistentId",
        "()I",
        "getPersistentId$annotations",
        "persistentId",
        "Companion",
        "DeviceLocationProviderMode",
        "DeviceLocationProviderState",
        "LocationCancelable",
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
.field private static final Companion:Lcom/mapbox/common/location/BaseDeviceLocationProvider$Companion;

.field private static final TAG:Ljava/lang/String; = "DeviceLocationProvider"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final context:Landroid/content/Context;

.field private currentMode:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;

.field private final locationUpdatePendingIntent$delegate:Ll83/h;

.field private final request:Lcom/mapbox/common/location/LocationProviderRequest;

.field public state:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/common/location/BaseDeviceLocationProvider$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/common/location/BaseDeviceLocationProvider$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->Companion:Lcom/mapbox/common/location/BaseDeviceLocationProvider$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/mapbox/common/location/LocationProviderRequest;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/mapbox/common/location/BaseLocationProvider;-><init>()V

    iput-object p1, p0, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->context:Landroid/content/Context;

    iput-object p2, p0, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->request:Lcom/mapbox/common/location/LocationProviderRequest;

    sget-object p1, Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;->STOPPED:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;

    iput-object p1, p0, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->state:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;

    new-instance p1, Lcom/mapbox/common/location/BaseDeviceLocationProvider$locationUpdatePendingIntent$2;

    invoke-direct {p1, p0}, Lcom/mapbox/common/location/BaseDeviceLocationProvider$locationUpdatePendingIntent$2;-><init>(Lcom/mapbox/common/location/BaseDeviceLocationProvider;)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->locationUpdatePendingIntent$delegate:Ll83/h;

    sget-object p1, Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;->NONE:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;

    iput-object p1, p0, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->currentMode:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;

    return-void
.end method

.method public static synthetic getPersistentId$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getState$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public declared-synchronized addLocationObserver(Lcom/mapbox/common/location/LocationObserver;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-super {p0, p1}, Lcom/mapbox/common/location/BaseLocationProvider;->addLocationObserver(Lcom/mapbox/common/location/LocationObserver;)V

    .line 2
    invoke-virtual {p0}, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized addLocationObserver(Lcom/mapbox/common/location/LocationObserver;Landroid/os/Looper;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "looper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-super {p0, p1, p2}, Lcom/mapbox/common/location/BaseLocationProvider;->addLocationObserver(Lcom/mapbox/common/location/LocationObserver;Landroid/os/Looper;)V

    .line 5
    invoke-virtual {p0}, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public abstract doStart()V
.end method

.method public abstract doStop()V
.end method

.method public abstract extractResult(Landroid/content/Intent;)Ljava/util/List;
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
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->context:Landroid/content/Context;

    return-object v0
.end method

.method public final getCurrentMode()Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->currentMode:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;

    return-object v0
.end method

.method public final getLocationUpdatePendingIntent()Landroid/app/PendingIntent;
    .locals 2

    iget-object v0, p0, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->locationUpdatePendingIntent$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-locationUpdatePendingIntent>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/app/PendingIntent;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/mapbox/common/location/DeviceLocationProvider$DefaultImpls;->getName(Lcom/mapbox/common/location/DeviceLocationProvider;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract getPersistentId()I
.end method

.method public final getRequest()Lcom/mapbox/common/location/LocationProviderRequest;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->request:Lcom/mapbox/common/location/LocationProviderRequest;

    return-object v0
.end method

.method public declared-synchronized notifyLocationUpdate(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/mapbox/common/location/Location;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "locations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->state:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;

    sget-object v1, Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;->STARTED:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;

    if-ne v0, v1, :cond_0

    invoke-super {p0, p1}, Lcom/mapbox/common/location/BaseLocationProvider;->notifyLocationUpdate(Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized removeLocationObserver(Lcom/mapbox/common/location/LocationObserver;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/mapbox/common/location/BaseLocationProvider;->removeLocationObserver(Lcom/mapbox/common/location/LocationObserver;)V

    invoke-virtual {p0}, Lcom/mapbox/common/location/BaseLocationProvider;->getObservers()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->stop()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public abstract removeLocationUpdates(Landroid/app/PendingIntent;)V
.end method

.method public abstract requestLocationUpdates(Landroid/app/PendingIntent;)V
.end method

.method public final setCurrentMode(Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->currentMode:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;

    return-void
.end method

.method public final start()V
    .locals 5

    const-string v0, "DeviceLocationProvider"

    const-string v1, "Skipping request to start: state == "

    const-string v2, "Start called for "

    :try_start_0
    sget-object v3, Lcom/mapbox/common/MapboxCommonLogger;->INSTANCE:Lcom/mapbox/common/MapboxCommonLogger;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v0, v2}, Lcom/mapbox/common/MapboxCommonLogger;->logD$common_release(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->state:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;

    sget-object v4, Lcom/mapbox/common/location/BaseDeviceLocationProvider$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v4, v2

    const/4 v4, 0x1

    if-eq v2, v4, :cond_1

    const/4 v4, 0x2

    if-eq v2, v4, :cond_1

    const/4 v1, 0x3

    if-eq v2, v1, :cond_0

    const/4 v1, 0x4

    if-eq v2, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;->STARTING:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;

    iput-object v1, p0, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->state:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;

    invoke-virtual {p0}, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->doStart()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->state:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lcom/mapbox/common/MapboxCommonLogger;->logW$common_release(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-static {v1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v1

    :goto_2
    invoke-static {v1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_2

    sget-object v2, Lcom/mapbox/common/MapboxCommonLogger;->INSTANCE:Lcom/mapbox/common/MapboxCommonLogger;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed to start: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/mapbox/common/MapboxCommonLogger;->logE$common_release(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;->STOPPED:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;

    iput-object v0, p0, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->state:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;

    :cond_2
    return-void
.end method

.method public final declared-synchronized stop()V
    .locals 6

    const-string v0, "Failed to stop: "

    const-string v1, "Skipping request to stop: state == "

    const-string v2, "Stop called for "

    monitor-enter p0

    :try_start_0
    sget-object v3, Lcom/mapbox/common/MapboxCommonLogger;->INSTANCE:Lcom/mapbox/common/MapboxCommonLogger;

    const-string v4, "DeviceLocationProvider"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v4, v2}, Lcom/mapbox/common/MapboxCommonLogger;->logD$common_release(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->state:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;

    sget-object v4, Lcom/mapbox/common/location/BaseDeviceLocationProvider$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v4, v2

    const/4 v4, 0x1

    if-eq v2, v4, :cond_1

    const/4 v4, 0x2

    if-eq v2, v4, :cond_1

    const/4 v4, 0x3

    if-eq v2, v4, :cond_0

    const/4 v4, 0x4

    if-eq v2, v4, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, "DeviceLocationProvider"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->state:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v2, v1}, Lcom/mapbox/common/MapboxCommonLogger;->logW$common_release(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    sget-object v1, Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;->STOPPING:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;

    iput-object v1, p0, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->state:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;

    invoke-virtual {p0}, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->doStop()V

    :goto_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    :try_start_1
    invoke-static {v1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v1

    :goto_2
    invoke-static {v1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_2

    sget-object v2, Lcom/mapbox/common/MapboxCommonLogger;->INSTANCE:Lcom/mapbox/common/MapboxCommonLogger;

    const-string v3, "DeviceLocationProvider"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lcom/mapbox/common/MapboxCommonLogger;->logE$common_release(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_4

    :cond_2
    :goto_3
    monitor-exit p0

    return-void

    :goto_4
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method
