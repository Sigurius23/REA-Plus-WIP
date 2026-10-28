.class public final Lcom/mapbox/common/location/AndroidDeviceLocationProvider;
.super Lcom/mapbox/common/location/BaseDeviceLocationProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/common/location/AndroidDeviceLocationProvider$LocationRequestAttributes;,
        Lcom/mapbox/common/location/AndroidDeviceLocationProvider$Companion;,
        Lcom/mapbox/common/location/AndroidDeviceLocationProvider$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0008*\u00011\u0008\u0000\u0018\u0000 :2\u00020\u0001:\u0002:;B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0015\u00a2\u0006\u0004\u0008\u0010\u0010\u000cJ\u000f\u0010\u0011\u001a\u00020\nH\u0015\u00a2\u0006\u0004\u0008\u0011\u0010\u000cJ\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0017\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0017\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001d\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u0011\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\u0008\"\u0010#J\u0011\u0010$\u001a\u0004\u0018\u00010\u0006H\u0007\u00a2\u0006\u0004\u0008$\u0010#J\u000f\u0010%\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008%\u0010#R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010&R\u0016\u0010\'\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010&R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008)\u0010*\u001a\u0004\u0008+\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00103R \u00105\u001a\u0002048\u0016X\u0097\u0004\u00a2\u0006\u0012\n\u0004\u00085\u00106\u0012\u0004\u00089\u0010\u000c\u001a\u0004\u00087\u00108\u00a8\u0006<"
    }
    d2 = {
        "Lcom/mapbox/common/location/AndroidDeviceLocationProvider;",
        "Lcom/mapbox/common/location/BaseDeviceLocationProvider;",
        "Landroid/content/Context;",
        "context",
        "Lcom/mapbox/common/location/LocationProviderRequest;",
        "request",
        "",
        "locationProviderName",
        "<init>",
        "(Landroid/content/Context;Lcom/mapbox/common/location/LocationProviderRequest;Ljava/lang/String;)V",
        "Ll83/a0;",
        "createLocationManagerWithHandlerThread",
        "()V",
        "Lcom/mapbox/common/location/AndroidDeviceLocationProvider$LocationRequestAttributes;",
        "extractAttributesFromRequest",
        "()Lcom/mapbox/common/location/AndroidDeviceLocationProvider$LocationRequestAttributes;",
        "doStart",
        "doStop",
        "Landroid/app/PendingIntent;",
        "pendingIntent",
        "requestLocationUpdates",
        "(Landroid/app/PendingIntent;)V",
        "removeLocationUpdates",
        "Lcom/mapbox/common/location/GetLocationCallback;",
        "callback",
        "Lcom/mapbox/common/Cancelable;",
        "getLastLocation",
        "(Lcom/mapbox/common/location/GetLocationCallback;)Lcom/mapbox/common/Cancelable;",
        "Landroid/content/Intent;",
        "intent",
        "",
        "Lcom/mapbox/common/location/Location;",
        "extractResult",
        "(Landroid/content/Intent;)Ljava/util/List;",
        "getName",
        "()Ljava/lang/String;",
        "getLocationProviderName",
        "toString",
        "Ljava/lang/String;",
        "providerName",
        "Landroid/location/LocationManager;",
        "locationManager$delegate",
        "Ll83/h;",
        "getLocationManager",
        "()Landroid/location/LocationManager;",
        "locationManager",
        "Landroid/os/HandlerThread;",
        "locationManagerHandlerThread",
        "Landroid/os/HandlerThread;",
        "com/mapbox/common/location/AndroidDeviceLocationProvider$locationListener$1",
        "locationListener",
        "Lcom/mapbox/common/location/AndroidDeviceLocationProvider$locationListener$1;",
        "",
        "persistentId",
        "I",
        "getPersistentId",
        "()I",
        "getPersistentId$annotations",
        "Companion",
        "LocationRequestAttributes",
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
.field private static final Companion:Lcom/mapbox/common/location/AndroidDeviceLocationProvider$Companion;

.field private static final TAG:Ljava/lang/String; = "AndroidDeviceLocationProvider"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final locationListener:Lcom/mapbox/common/location/AndroidDeviceLocationProvider$locationListener$1;

.field private final locationManager$delegate:Ll83/h;

.field private locationManagerHandlerThread:Landroid/os/HandlerThread;

.field private final locationProviderName:Ljava/lang/String;

.field private final persistentId:I

.field private final providerName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/common/location/AndroidDeviceLocationProvider$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->Companion:Lcom/mapbox/common/location/AndroidDeviceLocationProvider$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/mapbox/common/location/LocationProviderRequest;Ljava/lang/String;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/mapbox/common/location/BaseDeviceLocationProvider;-><init>(Landroid/content/Context;Lcom/mapbox/common/location/LocationProviderRequest;)V

    iput-object p3, p0, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->locationProviderName:Ljava/lang/String;

    if-nez p3, :cond_1

    const/4 p3, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/mapbox/common/location/LocationProviderRequest;->getAccuracy()Lcom/mapbox/common/location/AccuracyLevel;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p3

    :goto_0
    sget-object v1, Lcom/mapbox/common/location/AccuracyLevel;->PASSIVE:Lcom/mapbox/common/location/AccuracyLevel;

    if-ne v0, v1, :cond_1

    const-string p3, "passive"

    :cond_1
    iput-object p3, p0, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->providerName:Ljava/lang/String;

    new-instance v0, Lcom/mapbox/common/location/AndroidDeviceLocationProvider$locationManager$2;

    invoke-direct {v0, p1}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider$locationManager$2;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->locationManager$delegate:Ll83/h;

    new-instance p1, Lcom/mapbox/common/location/AndroidDeviceLocationProvider$locationListener$1;

    invoke-direct {p1, p0}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider$locationListener$1;-><init>(Lcom/mapbox/common/location/AndroidDeviceLocationProvider;)V

    iput-object p1, p0, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->locationListener:Lcom/mapbox/common/location/AndroidDeviceLocationProvider$locationListener$1;

    sget-object p1, Lcom/mapbox/common/location/DeviceLocationProviderType;->ANDROID:Lcom/mapbox/common/location/DeviceLocationProviderType;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    filled-new-array {p1, p3, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->persistentId:I

    return-void
.end method

.method public static synthetic b(Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;Lcom/mapbox/common/location/GetLocationCallback;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->getLastLocation$lambda$4(Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;Lcom/mapbox/common/location/GetLocationCallback;)V

    return-void
.end method

.method public static synthetic c(Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;Lcom/mapbox/common/location/GetLocationCallback;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->getLastLocation$lambda$3(Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;Lcom/mapbox/common/location/GetLocationCallback;)V

    return-void
.end method

.method private final createLocationManagerWithHandlerThread()V
    .locals 2

    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "locationManagerHandlerThread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->locationManagerHandlerThread:Landroid/os/HandlerThread;

    return-void
.end method

.method public static synthetic d(Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;Lcom/mapbox/common/location/GetLocationCallback;Landroid/location/Location;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->getLastLocation$lambda$2(Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;Lcom/mapbox/common/location/GetLocationCallback;Landroid/location/Location;)V

    return-void
.end method

.method private final extractAttributesFromRequest()Lcom/mapbox/common/location/AndroidDeviceLocationProvider$LocationRequestAttributes;
    .locals 5

    invoke-virtual {p0}, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->getRequest()Lcom/mapbox/common/location/LocationProviderRequest;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/mapbox/common/location/LocationProviderSettingsExtKt;->toCriteria(Lcom/mapbox/common/location/LocationProviderRequest;)Lcom/mapbox/bindgen/Expected;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/Criteria;

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Landroid/location/Criteria;

    invoke-direct {v0}, Landroid/location/Criteria;-><init>()V

    :cond_1
    invoke-virtual {p0}, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->getRequest()Lcom/mapbox/common/location/LocationProviderRequest;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/mapbox/common/location/LocationProviderRequest;->getInterval()Lcom/mapbox/common/location/IntervalSettings;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/mapbox/common/location/IntervalSettings;->getMinimumInterval()Ljava/lang/Long;

    move-result-object v1

    if-nez v1, :cond_3

    :cond_2
    const-wide/16 v1, 0x3e8

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-virtual {p0}, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->getRequest()Lcom/mapbox/common/location/LocationProviderRequest;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lcom/mapbox/common/location/LocationProviderRequest;->getDisplacement()Ljava/lang/Float;

    move-result-object v3

    if-nez v3, :cond_5

    :cond_4
    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    :cond_5
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    new-instance v4, Lcom/mapbox/common/location/AndroidDeviceLocationProvider$LocationRequestAttributes;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider$LocationRequestAttributes;-><init>(Landroid/location/Criteria;JF)V

    return-object v4
.end method

.method private static final getLastLocation$lambda$2(Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;Lcom/mapbox/common/location/GetLocationCallback;Landroid/location/Location;)V
    .locals 1

    const-string v0, "$cancelable"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/common/location/AndroidDeviceLocationProvider$getLastLocation$1$1;

    invoke-direct {v0, p1, p2}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider$getLastLocation$1$1;-><init>(Lcom/mapbox/common/location/GetLocationCallback;Landroid/location/Location;)V

    invoke-virtual {p0, v0}, Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;->invokeIfNotCanceled(Lc93/a;)V

    return-void
.end method

.method private static final getLastLocation$lambda$3(Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;Lcom/mapbox/common/location/GetLocationCallback;)V
    .locals 1

    const-string v0, "$cancelable"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/common/location/AndroidDeviceLocationProvider$getLastLocation$2$1;

    invoke-direct {v0, p1}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider$getLastLocation$2$1;-><init>(Lcom/mapbox/common/location/GetLocationCallback;)V

    invoke-virtual {p0, v0}, Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;->invokeIfNotCanceled(Lc93/a;)V

    return-void
.end method

.method private static final getLastLocation$lambda$4(Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;Lcom/mapbox/common/location/GetLocationCallback;)V
    .locals 1

    const-string v0, "$cancelable"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/common/location/AndroidDeviceLocationProvider$getLastLocation$3$1;

    invoke-direct {v0, p1}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider$getLastLocation$3$1;-><init>(Lcom/mapbox/common/location/GetLocationCallback;)V

    invoke-virtual {p0, v0}, Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;->invokeIfNotCanceled(Lc93/a;)V

    return-void
.end method

.method private final getLocationManager()Landroid/location/LocationManager;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->locationManager$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    return-object v0
.end method

.method public static synthetic getPersistentId$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public declared-synchronized doStart()V
    .locals 18
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "Started location updates with mode "

    const-string v2, "Permission status: "

    monitor-enter p0

    :try_start_0
    invoke-direct {v1}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->createLocationManagerWithHandlerThread()V

    invoke-direct {v1}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->extractAttributesFromRequest()Lcom/mapbox/common/location/AndroidDeviceLocationProvider$LocationRequestAttributes;

    move-result-object v3

    invoke-virtual {v3}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider$LocationRequestAttributes;->component1()Landroid/location/Criteria;

    move-result-object v8

    invoke-virtual {v3}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider$LocationRequestAttributes;->component2()J

    move-result-wide v5

    invoke-virtual {v3}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider$LocationRequestAttributes;->component3()F

    move-result v7

    invoke-virtual {v1}, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/mapbox/common/location/LocationServiceUtils;->getPermissionStatus(Landroid/content/Context;)Lcom/mapbox/common/location/PermissionStatus;

    move-result-object v3

    sget-object v15, Lcom/mapbox/common/MapboxCommonLogger;->INSTANCE:Lcom/mapbox/common/MapboxCommonLogger;

    const-string v4, "AndroidDeviceLocationProvider"

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v15, v4, v2}, Lcom/mapbox/common/MapboxCommonLogger;->logD$common_release(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;->NONE:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;

    sget-object v2, Lcom/mapbox/common/location/AndroidDeviceLocationProvider$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v2, v2, v4

    const/4 v4, 0x1

    if-eq v2, v4, :cond_2

    const/4 v4, 0x2

    if-eq v2, v4, :cond_2

    const/4 v4, 0x3

    if-eq v2, v4, :cond_0

    sget-object v0, Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;->STOPPED:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;

    iput-object v0, v1, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->state:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto/16 :goto_2

    :cond_0
    :try_start_1
    sget-object v2, Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;->PENDING_INTENT:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;

    iget-object v4, v1, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->providerName:Ljava/lang/String;

    if-eqz v4, :cond_1

    invoke-direct {v1}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->getLocationManager()Landroid/location/LocationManager;

    move-result-object v9

    iget-object v10, v1, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->providerName:Ljava/lang/String;

    invoke-virtual {v1}, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->getLocationUpdatePendingIntent()Landroid/app/PendingIntent;

    move-result-object v14

    move-wide v11, v5

    move v13, v7

    invoke-virtual/range {v9 .. v14}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/app/PendingIntent;)V

    goto :goto_0

    :cond_1
    invoke-direct {v1}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->getLocationManager()Landroid/location/LocationManager;

    move-result-object v4

    invoke-virtual {v1}, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->getLocationUpdatePendingIntent()Landroid/app/PendingIntent;

    move-result-object v9

    invoke-virtual/range {v4 .. v9}, Landroid/location/LocationManager;->requestLocationUpdates(JFLandroid/location/Criteria;Landroid/app/PendingIntent;)V

    :goto_0
    move-object v11, v15

    goto :goto_1

    :cond_2
    sget-object v2, Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;->CALLBACK:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;

    iget-object v4, v1, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->locationManagerHandlerThread:Landroid/os/HandlerThread;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Ljava/lang/Thread;->start()V

    :cond_3
    iget-object v4, v1, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->providerName:Ljava/lang/String;

    const/4 v9, 0x0

    if-eqz v4, :cond_5

    move-object v4, v9

    invoke-direct {v1}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->getLocationManager()Landroid/location/LocationManager;

    move-result-object v9

    iget-object v10, v1, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->providerName:Ljava/lang/String;

    iget-object v14, v1, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->locationListener:Lcom/mapbox/common/location/AndroidDeviceLocationProvider$locationListener$1;

    iget-object v8, v1, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->locationManagerHandlerThread:Landroid/os/HandlerThread;

    if-eqz v8, :cond_4

    invoke-virtual {v8}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v4

    :cond_4
    move-wide v11, v5

    move v13, v7

    move-object v5, v15

    move-object v15, v4

    invoke-virtual/range {v9 .. v15}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V

    move-object v11, v5

    goto :goto_1

    :cond_5
    move-wide v11, v5

    move-object v6, v9

    move-object v5, v15

    invoke-direct {v1}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->getLocationManager()Landroid/location/LocationManager;

    move-result-object v4

    iget-object v9, v1, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->locationListener:Lcom/mapbox/common/location/AndroidDeviceLocationProvider$locationListener$1;

    iget-object v10, v1, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->locationManagerHandlerThread:Landroid/os/HandlerThread;

    if-eqz v10, :cond_6

    invoke-virtual {v10}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v6

    :cond_6
    move-object v10, v6

    move-wide/from16 v16, v11

    move-object v11, v5

    move-wide/from16 v5, v16

    invoke-virtual/range {v4 .. v10}, Landroid/location/LocationManager;->requestLocationUpdates(JFLandroid/location/Criteria;Landroid/location/LocationListener;Landroid/os/Looper;)V

    :goto_1
    invoke-virtual {v1, v2}, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->setCurrentMode(Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;)V

    sget-object v2, Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;->STARTED:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;

    iput-object v2, v1, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->state:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;

    const-string v2, "AndroidDeviceLocationProvider"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->getCurrentMode()Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v2, v0}, Lcom/mapbox/common/MapboxCommonLogger;->logD$common_release(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/common/location/PermissionStatus;->BACKGROUND:Lcom/mapbox/common/location/PermissionStatus;

    if-ne v3, v0, :cond_7

    sget-object v0, Lcom/mapbox/common/location/LocationUpdatesReceiver;->Companion:Lcom/mapbox/common/location/LocationUpdatesReceiver$Companion;

    invoke-virtual {v1}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->getPersistentId()I

    move-result v2

    invoke-virtual {v0, v2, v1}, Lcom/mapbox/common/location/LocationUpdatesReceiver$Companion;->addDeviceLocationProvider$common_release(ILcom/mapbox/common/location/BaseDeviceLocationProvider;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_7
    monitor-exit p0

    return-void

    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public declared-synchronized doStop()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    const-string v0, "Failed to stop: Cannot stop Android device location provider. Invalid mode: "

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->getCurrentMode()Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;

    move-result-object v1

    sget-object v2, Lcom/mapbox/common/location/AndroidDeviceLocationProvider$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/mapbox/common/MapboxCommonLogger;->INSTANCE:Lcom/mapbox/common/MapboxCommonLogger;

    const-string v2, "AndroidDeviceLocationProvider"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->getCurrentMode()Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/mapbox/common/MapboxCommonLogger;->logE$common_release(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->getLocationManager()Landroid/location/LocationManager;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->getLocationUpdatePendingIntent()Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeUpdates(Landroid/app/PendingIntent;)V

    sget-object v0, Lcom/mapbox/common/location/LocationUpdatesReceiver;->Companion:Lcom/mapbox/common/location/LocationUpdatesReceiver$Companion;

    invoke-virtual {p0}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->getPersistentId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/mapbox/common/location/LocationUpdatesReceiver$Companion;->removeDeviceLocationProvider$common_release(I)V

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->getLocationManager()Landroid/location/LocationManager;

    move-result-object v0

    iget-object v1, p0, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->locationListener:Lcom/mapbox/common/location/AndroidDeviceLocationProvider$locationListener$1;

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    iget-object v0, p0, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->locationManagerHandlerThread:Landroid/os/HandlerThread;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quitSafely()Z

    :cond_3
    :goto_0
    sget-object v0, Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;->STOPPED:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;

    iput-object v0, p0, Lcom/mapbox/common/location/BaseDeviceLocationProvider;->state:Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

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
    .locals 2
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

    const-string v0, "location"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.location.Location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/location/Location;

    invoke-static {p1}, Lcom/mapbox/common/location/LocationServiceUtils;->toCommonLocation(Landroid/location/Location;)Lcom/mapbox/common/location/Location;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public getLastLocation(Lcom/mapbox/common/location/GetLocationCallback;)Lcom/mapbox/common/Cancelable;
    .locals 13
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    const-string v0, "failed to get last known location: "

    const-string v1, "AndroidDeviceLocationProvider"

    const-string v2, "callback"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;

    invoke-direct {v3, p0}, Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;-><init>(Lcom/mapbox/common/location/BaseDeviceLocationProvider;)V

    :try_start_0
    invoke-direct {p0}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->getLocationManager()Landroid/location/LocationManager;

    move-result-object v4

    invoke-virtual {v4}, Landroid/location/LocationManager;->getAllProviders()Ljava/util/List;

    move-result-object v4

    const-string v5, "locationManager.allProviders"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-direct {p0}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->getLocationManager()Landroid/location/LocationManager;

    move-result-object v7

    invoke-virtual {v7, v6}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catch_0
    move-exception v4

    goto/16 :goto_3

    :cond_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_2

    const/4 v4, 0x0

    goto :goto_2

    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_3

    :goto_1
    move-object v4, v5

    goto :goto_2

    :cond_3
    move-object v6, v5

    check-cast v6, Landroid/location/Location;

    sget-object v7, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v6}, Landroid/location/Location;->getElapsedRealtimeNanos()J

    move-result-wide v8

    invoke-virtual {v7, v8, v9}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v6

    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Landroid/location/Location;

    sget-object v10, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v9}, Landroid/location/Location;->getElapsedRealtimeNanos()J

    move-result-wide v11

    invoke-virtual {v10, v11, v12}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v9

    cmp-long v11, v6, v9

    if-gez v11, :cond_5

    move-object v5, v8

    move-wide v6, v9

    :cond_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_4

    goto :goto_1

    :goto_2
    check-cast v4, Landroid/location/Location;

    if-eqz v4, :cond_6

    new-instance v5, Lcom/mapbox/common/location/d;

    const/4 v6, 0x1

    invoke-direct {v5, v3, p1, v4, v6}, Lcom/mapbox/common/location/d;-><init>(Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;Lcom/mapbox/common/location/GetLocationCallback;Landroid/location/Location;I)V

    invoke-virtual {v2, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-object v3

    :cond_6
    new-instance v4, Lcom/mapbox/common/location/LocationError;

    sget-object v5, Lcom/mapbox/common/location/LocationErrorCode;->NOT_AVAILABLE:Lcom/mapbox/common/location/LocationErrorCode;

    const-string v6, "no last known location available"

    invoke-direct {v4, v5, v6}, Lcom/mapbox/common/location/LocationError;-><init>(Lcom/mapbox/common/location/LocationErrorCode;Ljava/lang/String;)V

    sget-object v5, Lcom/mapbox/common/MapboxCommonLogger;->INSTANCE:Lcom/mapbox/common/MapboxCommonLogger;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/mapbox/common/location/LocationError;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v1, v4}, Lcom/mapbox/common/MapboxCommonLogger;->logW$common_release(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Lcom/mapbox/common/location/e;

    const/4 v5, 0x1

    invoke-direct {v4, v5, v3, p1}, Lcom/mapbox/common/location/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v3

    :goto_3
    sget-object v5, Lcom/mapbox/common/MapboxCommonLogger;->INSTANCE:Lcom/mapbox/common/MapboxCommonLogger;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v1, v0}, Lcom/mapbox/common/MapboxCommonLogger;->logW$common_release(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/common/location/e;

    const/4 v1, 0x2

    invoke-direct {v0, v1, v3, p1}, Lcom/mapbox/common/location/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-object v3
.end method

.method public final getLocationProviderName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->locationProviderName:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "mapbox-android"

    return-object v0
.end method

.method public getPersistentId()I
    .locals 1

    iget v0, p0, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->persistentId:I

    return v0
.end method

.method public removeLocationUpdates(Landroid/app/PendingIntent;)V
    .locals 1

    const-string v0, "pendingIntent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->getLocationManager()Landroid/location/LocationManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/location/LocationManager;->removeUpdates(Landroid/app/PendingIntent;)V

    return-void
.end method

.method public requestLocationUpdates(Landroid/app/PendingIntent;)V
    .locals 8
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    const-string v0, "pendingIntent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->extractAttributesFromRequest()Lcom/mapbox/common/location/AndroidDeviceLocationProvider$LocationRequestAttributes;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider$LocationRequestAttributes;->component1()Landroid/location/Criteria;

    move-result-object v1

    invoke-virtual {v0}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider$LocationRequestAttributes;->component2()J

    move-result-wide v4

    invoke-virtual {v0}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider$LocationRequestAttributes;->component3()F

    move-result v6

    const-string v0, "passive"

    if-nez v1, :cond_0

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_0
    invoke-direct {p0}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->getLocationManager()Landroid/location/LocationManager;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v1, v3}, Landroid/location/LocationManager;->getBestProvider(Landroid/location/Criteria;Z)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    move-object v3, v2

    goto :goto_1

    :cond_1
    sget-object v2, Lcom/mapbox/common/MapboxCommonLogger;->INSTANCE:Lcom/mapbox/common/MapboxCommonLogger;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v7, "Provider not found for criteria ["

    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]. Using PASSIVE_PROVIDER"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "AndroidDeviceLocationProvider"

    invoke-virtual {v2, v3, v1}, Lcom/mapbox/common/MapboxCommonLogger;->logW$common_release(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :goto_1
    invoke-direct {p0}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->getLocationManager()Landroid/location/LocationManager;

    move-result-object v2

    move-object v7, p1

    invoke-virtual/range {v2 .. v7}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/app/PendingIntent;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AndroidDeviceLocationProvider("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->getPersistentId()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "): [providerName: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->locationProviderName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", request: "

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
