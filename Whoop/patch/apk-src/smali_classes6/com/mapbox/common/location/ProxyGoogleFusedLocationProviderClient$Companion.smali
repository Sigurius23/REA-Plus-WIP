.class public final Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R(\u0010\t\u001a\u00020\u00088\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0004\u0008\t\u0010\n\u0012\u0004\u0008\u000f\u0010\u0003\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR(\u0010\u0010\u001a\u00020\u00088\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0004\u0008\u0010\u0010\n\u0012\u0004\u0008\u0013\u0010\u0003\u001a\u0004\u0008\u0011\u0010\u000c\"\u0004\u0008\u0012\u0010\u000eR(\u0010\u0014\u001a\u00020\u00088\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0004\u0008\u0014\u0010\n\u0012\u0004\u0008\u0017\u0010\u0003\u001a\u0004\u0008\u0015\u0010\u000c\"\u0004\u0008\u0016\u0010\u000eR(\u0010\u0018\u001a\u00020\u00088\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0004\u0008\u0018\u0010\n\u0012\u0004\u0008\u001b\u0010\u0003\u001a\u0004\u0008\u0019\u0010\u000c\"\u0004\u0008\u001a\u0010\u000eR\u001b\u0010\u001f\u001a\u00020\u00048@X\u0080\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u0006R\u0014\u0010!\u001a\u00020 8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0016\u0010#\u001a\u00020\u00088\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008#\u0010\n\u00a8\u0006$"
    }
    d2 = {
        "Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient$Companion;",
        "",
        "<init>",
        "()V",
        "",
        "verifyAndCacheMethods$common_release",
        "()Z",
        "verifyAndCacheMethods",
        "Ljava/lang/reflect/Method;",
        "requestLocationUpdatesCallback",
        "Ljava/lang/reflect/Method;",
        "getRequestLocationUpdatesCallback",
        "()Ljava/lang/reflect/Method;",
        "setRequestLocationUpdatesCallback",
        "(Ljava/lang/reflect/Method;)V",
        "getRequestLocationUpdatesCallback$annotations",
        "requestLocationUpdatesPendingIntent",
        "getRequestLocationUpdatesPendingIntent",
        "setRequestLocationUpdatesPendingIntent",
        "getRequestLocationUpdatesPendingIntent$annotations",
        "removeLocationUpdatesCallback",
        "getRemoveLocationUpdatesCallback",
        "setRemoveLocationUpdatesCallback",
        "getRemoveLocationUpdatesCallback$annotations",
        "removeLocationUpdatesPendingIntent",
        "getRemoveLocationUpdatesPendingIntent",
        "setRemoveLocationUpdatesPendingIntent",
        "getRemoveLocationUpdatesPendingIntent$annotations",
        "available$delegate",
        "Ll83/h;",
        "getAvailable$common_release",
        "available",
        "",
        "GOOGLE_FUSED_LOCATION_PROVIDER_CLIENT",
        "Ljava/lang/String;",
        "getLastLocation",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient$Companion;-><init>()V

    return-void
.end method

.method public static synthetic getRemoveLocationUpdatesCallback$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getRemoveLocationUpdatesPendingIntent$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getRequestLocationUpdatesCallback$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getRequestLocationUpdatesPendingIntent$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final getAvailable$common_release()Z
    .locals 1

    invoke-static {}, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->access$getAvailable$delegate$cp()Ll83/h;

    move-result-object v0

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getRemoveLocationUpdatesCallback()Ljava/lang/reflect/Method;
    .locals 1

    sget-object v0, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->removeLocationUpdatesCallback:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "removeLocationUpdatesCallback"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getRemoveLocationUpdatesPendingIntent()Ljava/lang/reflect/Method;
    .locals 1

    sget-object v0, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->removeLocationUpdatesPendingIntent:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "removeLocationUpdatesPendingIntent"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getRequestLocationUpdatesCallback()Ljava/lang/reflect/Method;
    .locals 1

    sget-object v0, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->requestLocationUpdatesCallback:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "requestLocationUpdatesCallback"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getRequestLocationUpdatesPendingIntent()Ljava/lang/reflect/Method;
    .locals 1

    sget-object v0, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->requestLocationUpdatesPendingIntent:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "requestLocationUpdatesPendingIntent"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final setRemoveLocationUpdatesCallback(Ljava/lang/reflect/Method;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->removeLocationUpdatesCallback:Ljava/lang/reflect/Method;

    return-void
.end method

.method public final setRemoveLocationUpdatesPendingIntent(Ljava/lang/reflect/Method;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->removeLocationUpdatesPendingIntent:Ljava/lang/reflect/Method;

    return-void
.end method

.method public final setRequestLocationUpdatesCallback(Ljava/lang/reflect/Method;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->requestLocationUpdatesCallback:Ljava/lang/reflect/Method;

    return-void
.end method

.method public final setRequestLocationUpdatesPendingIntent(Ljava/lang/reflect/Method;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->requestLocationUpdatesPendingIntent:Ljava/lang/reflect/Method;

    return-void
.end method

.method public final verifyAndCacheMethods$common_release()Z
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mapbox/common/location/IncompatibleGooglePlayServicesLocationVersion;
        }
    .end annotation

    const-string v0, "removeLocationUpdates"

    const-string v1, "getMethod(\n             \u2026s.java,\n                )"

    const-class v2, Landroid/app/PendingIntent;

    const-string v3, "getMethod(\n             \u2026ss.java\n                )"

    const-class v4, Ltp/g;

    const-class v5, Lcom/google/android/gms/location/LocationRequest;

    const-string v6, "requestLocationUpdates"

    const-string v7, "ActivityRecognitionObserver"

    :try_start_0
    const-class v8, Lcom/google/android/gms/location/FusedLocationProviderClient;

    invoke-virtual {v8}, Ljava/lang/Class;->isInterface()Z

    move-result v9

    if-eqz v9, :cond_0

    const-string v9, "common/location/googlePlay21"

    invoke-static {v9}, Lcom/mapbox/common/FeatureTelemetryCounter;->create(Ljava/lang/String;)Lcom/mapbox/common/FeatureTelemetryCounter;

    move-result-object v9

    invoke-virtual {v9}, Lcom/mapbox/common/FeatureTelemetryCounter;->increment()V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_2

    :catch_2
    move-exception v0

    goto/16 :goto_3

    :cond_0
    const-string v9, "common/location/googlePlay18to20"

    invoke-static {v9}, Lcom/mapbox/common/FeatureTelemetryCounter;->create(Ljava/lang/String;)Lcom/mapbox/common/FeatureTelemetryCounter;

    move-result-object v9

    invoke-virtual {v9}, Lcom/mapbox/common/FeatureTelemetryCounter;->increment()V

    :goto_0
    sget-object v9, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->Companion:Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient$Companion;

    const-class v10, Landroid/os/Looper;

    filled-new-array {v5, v4, v10}, [Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v8, v6, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    invoke-static {v10, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v10}, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient$Companion;->setRequestLocationUpdatesCallback(Ljava/lang/reflect/Method;)V

    filled-new-array {v5, v2}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v8, v6, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v5}, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient$Companion;->setRequestLocationUpdatesPendingIntent(Ljava/lang/reflect/Method;)V

    filled-new-array {v4}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v8, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v4}, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient$Companion;->setRemoveLocationUpdatesCallback(Ljava/lang/reflect/Method;)V

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient$Companion;->setRemoveLocationUpdatesPendingIntent(Ljava/lang/reflect/Method;)V

    const-string v0, "getLastLocation"

    const/4 v1, 0x0

    invoke-virtual {v8, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const-string v1, "getMethod(\"getLastLocation\")"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;->access$setGetLastLocation$cp(Ljava/lang/reflect/Method;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :goto_1
    sget-object v1, Lcom/mapbox/common/MapboxCommonLogger;->INSTANCE:Lcom/mapbox/common/MapboxCommonLogger;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Required method not accessible: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v7, v0}, Lcom/mapbox/common/MapboxCommonLogger;->logW$common_release(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/common/location/IncompatibleGooglePlayServicesLocationVersion;

    invoke-direct {v0}, Lcom/mapbox/common/location/IncompatibleGooglePlayServicesLocationVersion;-><init>()V

    throw v0

    :goto_2
    sget-object v1, Lcom/mapbox/common/MapboxCommonLogger;->INSTANCE:Lcom/mapbox/common/MapboxCommonLogger;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Required method not found: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v7, v0}, Lcom/mapbox/common/MapboxCommonLogger;->logW$common_release(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/common/location/IncompatibleGooglePlayServicesLocationVersion;

    invoke-direct {v0}, Lcom/mapbox/common/location/IncompatibleGooglePlayServicesLocationVersion;-><init>()V

    throw v0

    :goto_3
    sget-object v1, Lcom/mapbox/common/MapboxCommonLogger;->INSTANCE:Lcom/mapbox/common/MapboxCommonLogger;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Required class not found: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v7, v0}, Lcom/mapbox/common/MapboxCommonLogger;->logW$common_release(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0
.end method
