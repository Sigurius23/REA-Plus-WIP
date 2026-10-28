.class final Lcom/mapbox/common/geofencing/RemoveFeatureCallbackNative;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/common/geofencing/RemoveFeatureCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/common/geofencing/RemoveFeatureCallbackNative$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\u0008\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J$\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u0096 \u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/mapbox/common/geofencing/RemoveFeatureCallbackNative;",
        "Lcom/mapbox/common/geofencing/RemoveFeatureCallback;",
        "",
        "nativePeer",
        "<init>",
        "(J)V",
        "Lcom/mapbox/bindgen/Expected;",
        "Lcom/mapbox/common/geofencing/GeofencingError;",
        "Lcom/mapbox/bindgen/None;",
        "result",
        "Ll83/a0;",
        "run",
        "(Lcom/mapbox/bindgen/Expected;)V",
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
.field public static final Companion:Lcom/mapbox/common/geofencing/RemoveFeatureCallbackNative$Companion;


# instance fields
.field private peer:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/common/geofencing/RemoveFeatureCallbackNative$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/common/geofencing/RemoveFeatureCallbackNative$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/common/geofencing/RemoveFeatureCallbackNative;->Companion:Lcom/mapbox/common/geofencing/RemoveFeatureCallbackNative$Companion;

    return-void
.end method

.method private constructor <init>(J)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/mapbox/common/geofencing/RemoveFeatureCallbackNative;->peer:J

    new-instance v0, Lcom/mapbox/common/geofencing/a;

    const/4 v1, 0x7

    invoke-direct {v0, p1, p2, v1}, Lcom/mapbox/common/geofencing/a;-><init>(JI)V

    invoke-static {p0, v0}, Lcom/mapbox/bindgen/CleanerService;->register(Ljava/lang/Object;Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final _init_$lambda$0(J)V
    .locals 1

    sget-object v0, Lcom/mapbox/common/geofencing/RemoveFeatureCallbackNative;->Companion:Lcom/mapbox/common/geofencing/RemoveFeatureCallbackNative$Companion;

    invoke-static {v0, p0, p1}, Lcom/mapbox/common/geofencing/RemoveFeatureCallbackNative$Companion;->access$cleanNativePeer(Lcom/mapbox/common/geofencing/RemoveFeatureCallbackNative$Companion;J)V

    return-void
.end method

.method public static synthetic a(J)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mapbox/common/geofencing/RemoveFeatureCallbackNative;->_init_$lambda$0(J)V

    return-void
.end method

.method public static final synthetic access$cleanNativePeer(J)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mapbox/common/geofencing/RemoveFeatureCallbackNative;->cleanNativePeer(J)V

    return-void
.end method

.method private static final native cleanNativePeer(J)V
.end method


# virtual methods
.method public native run(Lcom/mapbox/bindgen/Expected;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/bindgen/Expected<",
            "Lcom/mapbox/common/geofencing/GeofencingError;",
            "Lcom/mapbox/bindgen/None;",
            ">;)V"
        }
    .end annotation
.end method
