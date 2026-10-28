.class public final Lcom/mapbox/common/geofencing/GeofencingObserverNative;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/common/geofencing/GeofencingObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/common/geofencing/GeofencingObserverNative$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\u0008\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0097 \u00a2\u0006\u0004\u0008\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0097 \u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u0018\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0097 \u00a2\u0006\u0004\u0008\u000c\u0010\nJ\u0018\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\rH\u0097 \u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u0011H\u0097 \u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/mapbox/common/geofencing/GeofencingObserverNative;",
        "Lcom/mapbox/common/geofencing/GeofencingObserver;",
        "",
        "nativePeer",
        "<init>",
        "(J)V",
        "Lcom/mapbox/common/geofencing/GeofencingEvent;",
        "event",
        "Ll83/a0;",
        "onEntry",
        "(Lcom/mapbox/common/geofencing/GeofencingEvent;)V",
        "onDwell",
        "onExit",
        "Lcom/mapbox/common/geofencing/GeofencingError;",
        "error",
        "onError",
        "(Lcom/mapbox/common/geofencing/GeofencingError;)V",
        "",
        "isConsentGiven",
        "onUserConsentChanged",
        "(Z)V",
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
.field public static final Companion:Lcom/mapbox/common/geofencing/GeofencingObserverNative$Companion;


# instance fields
.field private peer:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/common/geofencing/GeofencingObserverNative$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/common/geofencing/GeofencingObserverNative$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/common/geofencing/GeofencingObserverNative;->Companion:Lcom/mapbox/common/geofencing/GeofencingObserverNative$Companion;

    return-void
.end method

.method private constructor <init>(J)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/mapbox/common/geofencing/GeofencingObserverNative;->peer:J

    new-instance v0, Lcom/mapbox/common/geofencing/a;

    const/16 v1, 0xa

    invoke-direct {v0, p1, p2, v1}, Lcom/mapbox/common/geofencing/a;-><init>(JI)V

    invoke-static {p0, v0}, Lcom/mapbox/bindgen/CleanerService;->register(Ljava/lang/Object;Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final _init_$lambda$0(J)V
    .locals 1

    sget-object v0, Lcom/mapbox/common/geofencing/GeofencingObserverNative;->Companion:Lcom/mapbox/common/geofencing/GeofencingObserverNative$Companion;

    invoke-static {v0, p0, p1}, Lcom/mapbox/common/geofencing/GeofencingObserverNative$Companion;->access$cleanNativePeer(Lcom/mapbox/common/geofencing/GeofencingObserverNative$Companion;J)V

    return-void
.end method

.method public static synthetic a(J)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mapbox/common/geofencing/GeofencingObserverNative;->_init_$lambda$0(J)V

    return-void
.end method

.method public static final synthetic access$cleanNativePeer(J)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mapbox/common/geofencing/GeofencingObserverNative;->cleanNativePeer(J)V

    return-void
.end method

.method private static final native cleanNativePeer(J)V
.end method


# virtual methods
.method public native onDwell(Lcom/mapbox/common/geofencing/GeofencingEvent;)V
.end method

.method public native onEntry(Lcom/mapbox/common/geofencing/GeofencingEvent;)V
.end method

.method public native onError(Lcom/mapbox/common/geofencing/GeofencingError;)V
.end method

.method public native onExit(Lcom/mapbox/common/geofencing/GeofencingEvent;)V
.end method

.method public native onUserConsentChanged(Z)V
.end method
