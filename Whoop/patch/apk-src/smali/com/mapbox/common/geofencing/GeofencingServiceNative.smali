.class public final Lcom/mapbox/common/geofencing/GeofencingServiceNative;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/common/geofencing/GeofencingService;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/common/geofencing/GeofencingServiceNative$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u0000 *2\u00020\u0001:\u0001*B\u0011\u0008\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0097 \u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\rH\u0097 \u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ \u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0012H\u0097 \u00a2\u0006\u0004\u0008\u0013\u0010\u0014J \u0010\u0018\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u0017H\u0097 \u00a2\u0006\u0004\u0008\u0018\u0010\u0019J \u0010\u001b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u001aH\u0097 \u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u001dH\u0097 \u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ \u0010#\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010\t\u001a\u00020\"H\u0097 \u00a2\u0006\u0004\u0008#\u0010$J \u0010&\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010\t\u001a\u00020%H\u0097 \u00a2\u0006\u0004\u0008&\u0010\'R\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008(\u0010)\u00a8\u0006+"
    }
    d2 = {
        "Lcom/mapbox/common/geofencing/GeofencingServiceNative;",
        "Lcom/mapbox/common/geofencing/GeofencingService;",
        "",
        "nativePeer",
        "<init>",
        "(J)V",
        "Lcom/mapbox/common/geofencing/GeofencingOptions;",
        "options",
        "Lcom/mapbox/common/geofencing/ConfigureCallback;",
        "callback",
        "Ll83/a0;",
        "configure",
        "(Lcom/mapbox/common/geofencing/GeofencingOptions;Lcom/mapbox/common/geofencing/ConfigureCallback;)V",
        "Lcom/mapbox/common/geofencing/GetOptionsCallback;",
        "getOptions",
        "(Lcom/mapbox/common/geofencing/GetOptionsCallback;)V",
        "Lcom/mapbox/geojson/Feature;",
        "feature",
        "Lcom/mapbox/common/geofencing/AddFeatureCallback;",
        "addFeature",
        "(Lcom/mapbox/geojson/Feature;Lcom/mapbox/common/geofencing/AddFeatureCallback;)V",
        "",
        "identifier",
        "Lcom/mapbox/common/geofencing/GetFeatureCallback;",
        "getFeature",
        "(Ljava/lang/String;Lcom/mapbox/common/geofencing/GetFeatureCallback;)V",
        "Lcom/mapbox/common/geofencing/RemoveFeatureCallback;",
        "removeFeature",
        "(Ljava/lang/String;Lcom/mapbox/common/geofencing/RemoveFeatureCallback;)V",
        "Lcom/mapbox/common/geofencing/ClearFeaturesCallback;",
        "clearFeatures",
        "(Lcom/mapbox/common/geofencing/ClearFeaturesCallback;)V",
        "Lcom/mapbox/common/geofencing/GeofencingObserver;",
        "observer",
        "Lcom/mapbox/common/geofencing/AddObserverCallback;",
        "addObserver",
        "(Lcom/mapbox/common/geofencing/GeofencingObserver;Lcom/mapbox/common/geofencing/AddObserverCallback;)V",
        "Lcom/mapbox/common/geofencing/RemoveObserverCallback;",
        "removeObserver",
        "(Lcom/mapbox/common/geofencing/GeofencingObserver;Lcom/mapbox/common/geofencing/RemoveObserverCallback;)V",
        "peer",
        "J",
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
.field public static final Companion:Lcom/mapbox/common/geofencing/GeofencingServiceNative$Companion;


# instance fields
.field private peer:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/common/geofencing/GeofencingServiceNative$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/common/geofencing/GeofencingServiceNative$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/common/geofencing/GeofencingServiceNative;->Companion:Lcom/mapbox/common/geofencing/GeofencingServiceNative$Companion;

    return-void
.end method

.method private constructor <init>(J)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/mapbox/common/geofencing/GeofencingServiceNative;->peer:J

    new-instance v0, Lcom/mapbox/common/geofencing/a;

    const/16 v1, 0xb

    invoke-direct {v0, p1, p2, v1}, Lcom/mapbox/common/geofencing/a;-><init>(JI)V

    invoke-static {p0, v0}, Lcom/mapbox/bindgen/CleanerService;->register(Ljava/lang/Object;Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final _init_$lambda$0(J)V
    .locals 1

    sget-object v0, Lcom/mapbox/common/geofencing/GeofencingServiceNative;->Companion:Lcom/mapbox/common/geofencing/GeofencingServiceNative$Companion;

    invoke-static {v0, p0, p1}, Lcom/mapbox/common/geofencing/GeofencingServiceNative$Companion;->access$cleanNativePeer(Lcom/mapbox/common/geofencing/GeofencingServiceNative$Companion;J)V

    return-void
.end method

.method public static synthetic a(J)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mapbox/common/geofencing/GeofencingServiceNative;->_init_$lambda$0(J)V

    return-void
.end method

.method public static final synthetic access$cleanNativePeer(J)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mapbox/common/geofencing/GeofencingServiceNative;->cleanNativePeer(J)V

    return-void
.end method

.method private static final native cleanNativePeer(J)V
.end method


# virtual methods
.method public native addFeature(Lcom/mapbox/geojson/Feature;Lcom/mapbox/common/geofencing/AddFeatureCallback;)V
.end method

.method public native addObserver(Lcom/mapbox/common/geofencing/GeofencingObserver;Lcom/mapbox/common/geofencing/AddObserverCallback;)V
.end method

.method public native clearFeatures(Lcom/mapbox/common/geofencing/ClearFeaturesCallback;)V
.end method

.method public native configure(Lcom/mapbox/common/geofencing/GeofencingOptions;Lcom/mapbox/common/geofencing/ConfigureCallback;)V
.end method

.method public native getFeature(Ljava/lang/String;Lcom/mapbox/common/geofencing/GetFeatureCallback;)V
.end method

.method public native getOptions(Lcom/mapbox/common/geofencing/GetOptionsCallback;)V
.end method

.method public native removeFeature(Ljava/lang/String;Lcom/mapbox/common/geofencing/RemoveFeatureCallback;)V
.end method

.method public native removeObserver(Lcom/mapbox/common/geofencing/GeofencingObserver;Lcom/mapbox/common/geofencing/RemoveObserverCallback;)V
.end method
