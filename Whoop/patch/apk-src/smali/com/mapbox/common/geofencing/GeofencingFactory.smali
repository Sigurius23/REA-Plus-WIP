.class public final Lcom/mapbox/common/geofencing/GeofencingFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/common/geofencing/GeofencingFactory$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\u0008\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0005R\u0016\u0010\u0008\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/mapbox/common/geofencing/GeofencingFactory;",
        "",
        "",
        "nativePeer",
        "<init>",
        "(J)V",
        "Ll83/a0;",
        "setPeer",
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
.field public static final Companion:Lcom/mapbox/common/geofencing/GeofencingFactory$Companion;


# instance fields
.field private peer:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/common/geofencing/GeofencingFactory$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/common/geofencing/GeofencingFactory$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/common/geofencing/GeofencingFactory;->Companion:Lcom/mapbox/common/geofencing/GeofencingFactory$Companion;

    sget-object v0, Lcom/mapbox/common/BaseMapboxInitializer;->Companion:Lcom/mapbox/common/BaseMapboxInitializer$Companion;

    const-class v1, Lcom/mapbox/common/MapboxSDKCommonInitializerImpl;

    invoke-virtual {v0, v1}, Lcom/mapbox/common/BaseMapboxInitializer$Companion;->init(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1, p2}, Lcom/mapbox/common/geofencing/GeofencingFactory;->setPeer(J)V

    return-void
.end method

.method public static synthetic a(J)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mapbox/common/geofencing/GeofencingFactory;->setPeer$lambda$0(J)V

    return-void
.end method

.method public static final synthetic access$cleanNativePeer(J)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mapbox/common/geofencing/GeofencingFactory;->cleanNativePeer(J)V

    return-void
.end method

.method private static final native cleanNativePeer(J)V
.end method

.method public static final native getOrCreate()Lcom/mapbox/common/geofencing/GeofencingService;
.end method

.method public static final native reset()V
.end method

.method private static final setPeer$lambda$0(J)V
    .locals 1

    sget-object v0, Lcom/mapbox/common/geofencing/GeofencingFactory;->Companion:Lcom/mapbox/common/geofencing/GeofencingFactory$Companion;

    invoke-static {v0, p0, p1}, Lcom/mapbox/common/geofencing/GeofencingFactory$Companion;->access$cleanNativePeer(Lcom/mapbox/common/geofencing/GeofencingFactory$Companion;J)V

    return-void
.end method

.method public static final native setUserDefined(Lcom/mapbox/common/geofencing/GeofencingService;)V
.end method


# virtual methods
.method public final setPeer(J)V
    .locals 2

    iput-wide p1, p0, Lcom/mapbox/common/geofencing/GeofencingFactory;->peer:J

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/mapbox/common/geofencing/a;

    const/16 v1, 0x9

    invoke-direct {v0, p1, p2, v1}, Lcom/mapbox/common/geofencing/a;-><init>(JI)V

    invoke-static {p0, v0}, Lcom/mapbox/bindgen/CleanerService;->register(Ljava/lang/Object;Ljava/lang/Runnable;)V

    return-void
.end method
