.class public final Lcom/mapbox/maps/MapProvider;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/maps/MapProvider$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J%\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ%\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008!\u0010\"J-\u0010*\u001a\u00020)2\u0006\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\r2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020\'\u00a2\u0006\u0004\u0008*\u0010+J\u0015\u0010,\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008,\u0010-J\r\u0010.\u001a\u00020\'\u00a2\u0006\u0004\u0008.\u0010/J\r\u00101\u001a\u000200\u00a2\u0006\u0004\u00081\u0010\u0003R\u0016\u00102\u001a\u00020%8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u00106\u00a8\u00067"
    }
    d2 = {
        "Lcom/mapbox/maps/MapProvider;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Lpu/b;",
        "type",
        "",
        "Lcom/mapbox/common/module/provider/ModuleProviderArgument;",
        "paramsProvider",
        "(Landroid/content/Context;Lpu/b;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;",
        "Lcom/mapbox/maps/MapView;",
        "Lcom/mapbox/maps/MapController;",
        "getController",
        "(Lcom/mapbox/maps/MapView;)Lcom/mapbox/maps/MapController;",
        "Lcom/mapbox/maps/MapInitOptions;",
        "mapInitOptions",
        "Lcom/mapbox/maps/MapClient;",
        "mapClient",
        "Lcom/mapbox/maps/NativeMapImpl;",
        "getNativeMapWrapper",
        "(Lcom/mapbox/maps/MapInitOptions;Lcom/mapbox/maps/MapClient;)Lcom/mapbox/maps/NativeMapImpl;",
        "mapView",
        "Lcom/mapbox/maps/Map;",
        "getNativeMapCore",
        "(Lcom/mapbox/maps/MapView;)Lcom/mapbox/maps/Map;",
        "nativeMap",
        "Lcom/mapbox/maps/NativeObserver;",
        "nativeObserver",
        "",
        "pixelRatio",
        "Lcom/mapbox/maps/MapboxMap;",
        "getMapboxMap",
        "(Lcom/mapbox/maps/NativeMapImpl;Lcom/mapbox/maps/NativeObserver;F)Lcom/mapbox/maps/MapboxMap;",
        "mapboxMap",
        "mapController",
        "Lcom/mapbox/maps/module/MapTelemetry;",
        "telemetry",
        "Lcom/mapbox/maps/geofencing/MapGeofencingConsent;",
        "mapGeofencingConsent",
        "Lev/k;",
        "getMapPluginRegistry",
        "(Lcom/mapbox/maps/MapboxMap;Lcom/mapbox/maps/MapController;Lcom/mapbox/maps/module/MapTelemetry;Lcom/mapbox/maps/geofencing/MapGeofencingConsent;)Lev/k;",
        "getMapTelemetryInstance",
        "(Landroid/content/Context;)Lcom/mapbox/maps/module/MapTelemetry;",
        "getMapGeofencingConsent",
        "()Lcom/mapbox/maps/geofencing/MapGeofencingConsent;",
        "Ll83/a0;",
        "flushPendingEvents",
        "mapTelemetry",
        "Lcom/mapbox/maps/module/MapTelemetry;",
        "Lbc3/c0;",
        "mainScope",
        "Lbc3/c0;",
        "maps-sdk_release"
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
.field public static final INSTANCE:Lcom/mapbox/maps/MapProvider;

.field private static final mainScope:Lbc3/c0;

.field private static mapTelemetry:Lcom/mapbox/maps/module/MapTelemetry;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/maps/MapProvider;

    invoke-direct {v0}, Lcom/mapbox/maps/MapProvider;-><init>()V

    sput-object v0, Lcom/mapbox/maps/MapProvider;->INSTANCE:Lcom/mapbox/maps/MapProvider;

    new-instance v0, Lbc3/b0;

    const-string v1, "MapController"

    invoke-direct {v0, v1}, Lbc3/b0;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq83/a;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    sget-object v1, Lbc3/q0;->a:Lkc3/e;

    sget-object v1, Lhc3/o;->a:Lbc3/w1;

    invoke-interface {v0, v1}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    sput-object v0, Lcom/mapbox/maps/MapProvider;->mainScope:Lbc3/c0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/mapbox/bindgen/Expected;)V
    .locals 0

    invoke-static {p0}, Lcom/mapbox/maps/MapProvider;->flushPendingEvents$lambda$1(Lcom/mapbox/bindgen/Expected;)V

    return-void
.end method

.method public static final synthetic access$getMapTelemetry$p()Lcom/mapbox/maps/module/MapTelemetry;
    .locals 1

    sget-object v0, Lcom/mapbox/maps/MapProvider;->mapTelemetry:Lcom/mapbox/maps/module/MapTelemetry;

    return-object v0
.end method

.method public static final synthetic access$paramsProvider(Lcom/mapbox/maps/MapProvider;Landroid/content/Context;Lpu/b;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/mapbox/maps/MapProvider;->paramsProvider(Landroid/content/Context;Lpu/b;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/mapbox/bindgen/Expected;)V
    .locals 0

    invoke-static {p0}, Lcom/mapbox/maps/MapProvider;->flushPendingEvents$lambda$3(Lcom/mapbox/bindgen/Expected;)V

    return-void
.end method

.method private static final flushPendingEvents$lambda$1(Lcom/mapbox/bindgen/Expected;)V
    .locals 1

    const-string v0, "expected"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_0

    const-string v0, "EventsService flush error: "

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "MapController"

    invoke-static {v0, p0}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private static final flushPendingEvents$lambda$3(Lcom/mapbox/bindgen/Expected;)V
    .locals 1

    const-string v0, "expected"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_0

    const-string v0, "TelemetryService flush error: "

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "MapController"

    invoke-static {v0, p0}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private final getController(Lcom/mapbox/maps/MapView;)Lcom/mapbox/maps/MapController;
    .locals 0

    invoke-virtual {p1}, Lcom/mapbox/maps/MapView;->getMapController$maps_sdk_release()Lcom/mapbox/maps/MapController;

    move-result-object p1

    return-object p1
.end method

.method private final paramsProvider(Landroid/content/Context;Lpu/b;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;
    .locals 2

    sget-object v0, Lcom/mapbox/maps/MapProvider$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    new-instance p2, Lcom/mapbox/common/module/provider/ModuleProviderArgument;

    const-class v0, Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, v0, p1}, Lcom/mapbox/common/module/provider/ModuleProviderArgument;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    filled-new-array {p2}, [Lcom/mapbox/common/module/provider/ModuleProviderArgument;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " module is not supported by the Maps SDK"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final flushPendingEvents()V
    .locals 5

    new-instance v0, Lcom/mapbox/common/EventsServerOptions;

    new-instance v1, Lcom/mapbox/common/SdkInformation;

    const-string v2, "mapbox-maps-android"

    const-string v3, "11.13.4"

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Lcom/mapbox/common/SdkInformation;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1, v4}, Lcom/mapbox/common/EventsServerOptions;-><init>(Lcom/mapbox/common/SdkInformation;Lcom/mapbox/common/DeferredDeliveryServiceOptions;)V

    invoke-static {v0}, Lcom/mapbox/common/EventsService;->getOrCreate(Lcom/mapbox/common/EventsServerOptions;)Lcom/mapbox/common/EventsService;

    move-result-object v0

    new-instance v1, Lc9/g;

    const/16 v2, 0x11

    invoke-direct {v1, v2}, Lc9/g;-><init>(I)V

    invoke-virtual {v0, v1}, Lcom/mapbox/common/EventsService;->flush(Lcom/mapbox/common/FlushOperationResultCallback;)V

    invoke-static {}, Lcom/mapbox/common/TelemetryService;->getOrCreate()Lcom/mapbox/common/TelemetryService;

    move-result-object v0

    new-instance v1, Lc9/g;

    const/16 v2, 0x12

    invoke-direct {v1, v2}, Lc9/g;-><init>(I)V

    invoke-virtual {v0, v1}, Lcom/mapbox/common/TelemetryService;->flush(Lcom/mapbox/common/FlushOperationResultCallback;)V

    return-void
.end method

.method public final getMapGeofencingConsent()Lcom/mapbox/maps/geofencing/MapGeofencingConsent;
    .locals 1

    new-instance v0, Lcom/mapbox/maps/MapGeofencingConsentImpl;

    invoke-direct {v0}, Lcom/mapbox/maps/MapGeofencingConsentImpl;-><init>()V

    return-object v0
.end method

.method public final getMapPluginRegistry(Lcom/mapbox/maps/MapboxMap;Lcom/mapbox/maps/MapController;Lcom/mapbox/maps/module/MapTelemetry;Lcom/mapbox/maps/geofencing/MapGeofencingConsent;)Lev/k;
    .locals 4

    const-string v0, "mapboxMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "telemetry"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapGeofencingConsent"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lev/k;

    new-instance v1, Lev/i;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object p1, v1, Lev/i;->a:Ljava/lang/Object;

    iput-object p1, v1, Lev/i;->b:Ljava/lang/Object;

    iput-object p1, v1, Lev/i;->c:Ljava/lang/Object;

    iput-object p1, v1, Lev/i;->d:Ljava/lang/Object;

    new-instance v2, Lev/h;

    const/4 v3, 0x0

    invoke-direct {v2, v1, p3, p4, v3}, Lev/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v2}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p3

    iput-object p3, v1, Lev/i;->h:Ljava/lang/Object;

    iput-object p2, v1, Lev/i;->i:Ljava/lang/Object;

    iput-object p1, v1, Lev/i;->e:Ljava/lang/Object;

    iput-object p1, v1, Lev/i;->f:Ljava/lang/Object;

    iput-object p1, v1, Lev/i;->g:Ljava/lang/Object;

    invoke-direct {v0, v1}, Lev/k;-><init>(Lev/i;)V

    return-object v0
.end method

.method public final getMapTelemetryInstance(Landroid/content/Context;)Lcom/mapbox/maps/module/MapTelemetry;
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/MapProvider;->mapTelemetry:Lcom/mapbox/maps/module/MapTelemetry;

    if-nez v0, :cond_0

    sget-object v0, Lcom/mapbox/common/module/provider/MapboxModuleProvider;->INSTANCE:Lcom/mapbox/common/module/provider/MapboxModuleProvider;

    new-instance v1, Lcom/mapbox/maps/MapProvider$getMapTelemetryInstance$2;

    invoke-direct {v1, p1}, Lcom/mapbox/maps/MapProvider$getMapTelemetryInstance$2;-><init>(Landroid/content/Context;)V

    sget-object p1, Lpu/b;->F:Lpu/b;

    invoke-virtual {v0, p1, v1}, Lcom/mapbox/common/module/provider/MapboxModuleProvider;->createModule(Lpu/b;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mapbox/maps/module/MapTelemetry;

    sput-object p1, Lcom/mapbox/maps/MapProvider;->mapTelemetry:Lcom/mapbox/maps/module/MapTelemetry;

    :cond_0
    sget-object p1, Lcom/mapbox/maps/MapProvider;->mainScope:Lbc3/c0;

    new-instance v0, Lcom/mapbox/maps/MapProvider$getMapTelemetryInstance$3;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/maps/MapProvider$getMapTelemetryInstance$3;-><init>(Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {p1, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p1, Lcom/mapbox/maps/MapProvider;->mapTelemetry:Lcom/mapbox/maps/module/MapTelemetry;

    if-eqz p1, :cond_1

    return-object p1

    :cond_1
    const-string p1, "mapTelemetry"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public final getMapboxMap(Lcom/mapbox/maps/NativeMapImpl;Lcom/mapbox/maps/NativeObserver;F)Lcom/mapbox/maps/MapboxMap;
    .locals 1

    const-string v0, "nativeMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeObserver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/MapboxMap;->Companion:Lcom/mapbox/maps/MapboxMap$Companion;

    invoke-virtual {v0, p1, p2, p3}, Lcom/mapbox/maps/MapboxMap$Companion;->invoke$maps_sdk_release(Lcom/mapbox/maps/NativeMapImpl;Lcom/mapbox/maps/NativeObserver;F)Lcom/mapbox/maps/MapboxMap;

    move-result-object p1

    return-object p1
.end method

.method public final getNativeMapCore(Lcom/mapbox/maps/MapView;)Lcom/mapbox/maps/Map;
    .locals 1

    const-string v0, "mapView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/mapbox/maps/MapProvider;->getController(Lcom/mapbox/maps/MapView;)Lcom/mapbox/maps/MapController;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mapbox/maps/MapController;->getNativeMap()Lcom/mapbox/maps/NativeMapImpl;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mapbox/maps/NativeMapImpl;->getMap()Lcom/mapbox/maps/Map;

    move-result-object p1

    return-object p1
.end method

.method public final getNativeMapWrapper(Lcom/mapbox/maps/MapInitOptions;Lcom/mapbox/maps/MapClient;)Lcom/mapbox/maps/NativeMapImpl;
    .locals 2

    const-string v0, "mapInitOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapClient"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/maps/NativeMapImpl;

    new-instance v1, Lcom/mapbox/maps/Map;

    invoke-virtual {p1}, Lcom/mapbox/maps/MapInitOptions;->getMapOptions()Lcom/mapbox/maps/MapOptions;

    move-result-object p1

    invoke-direct {v1, p2, p1}, Lcom/mapbox/maps/Map;-><init>(Lcom/mapbox/maps/MapClient;Lcom/mapbox/maps/MapOptions;)V

    invoke-direct {v0, v1}, Lcom/mapbox/maps/NativeMapImpl;-><init>(Lcom/mapbox/maps/Map;)V

    return-object v0
.end method
