.class public final Lcom/mapbox/common/geofencing/GeofencingFactory$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mapbox/common/geofencing/GeofencingFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 \u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u0087 \u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u000c\u001a\u00020\u0006H\u0087 \u00a2\u0006\u0004\u0008\u000c\u0010\u0003J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0087 \u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/mapbox/common/geofencing/GeofencingFactory$Companion;",
        "",
        "<init>",
        "()V",
        "",
        "peer",
        "Ll83/a0;",
        "cleanNativePeer",
        "(J)V",
        "Lcom/mapbox/common/geofencing/GeofencingService;",
        "getOrCreate",
        "()Lcom/mapbox/common/geofencing/GeofencingService;",
        "reset",
        "custom",
        "setUserDefined",
        "(Lcom/mapbox/common/geofencing/GeofencingService;)V",
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
    invoke-direct {p0}, Lcom/mapbox/common/geofencing/GeofencingFactory$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$cleanNativePeer(Lcom/mapbox/common/geofencing/GeofencingFactory$Companion;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/mapbox/common/geofencing/GeofencingFactory$Companion;->cleanNativePeer(J)V

    return-void
.end method

.method private final cleanNativePeer(J)V
    .locals 0

    invoke-static {p1, p2}, Lcom/mapbox/common/geofencing/GeofencingFactory;->access$cleanNativePeer(J)V

    return-void
.end method


# virtual methods
.method public final getOrCreate()Lcom/mapbox/common/geofencing/GeofencingService;
    .locals 1

    invoke-static {}, Lcom/mapbox/common/geofencing/GeofencingFactory;->getOrCreate()Lcom/mapbox/common/geofencing/GeofencingService;

    move-result-object v0

    return-object v0
.end method

.method public final reset()V
    .locals 0

    invoke-static {}, Lcom/mapbox/common/geofencing/GeofencingFactory;->reset()V

    return-void
.end method

.method public final setUserDefined(Lcom/mapbox/common/geofencing/GeofencingService;)V
    .locals 0

    invoke-static {p1}, Lcom/mapbox/common/geofencing/GeofencingFactory;->setUserDefined(Lcom/mapbox/common/geofencing/GeofencingService;)V

    return-void
.end method
