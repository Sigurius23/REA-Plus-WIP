.class public final Lcom/mapbox/common/geofencing/GeofencingUtils$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mapbox/common/geofencing/GeofencingUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 \u00a2\u0006\u0004\u0008\u0007\u0010\u0008J \u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000bH\u0087 \u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tH\u0087 \u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tH\u0087 \u00a2\u0006\u0004\u0008\u0011\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/mapbox/common/geofencing/GeofencingUtils$Companion;",
        "",
        "<init>",
        "()V",
        "",
        "peer",
        "Ll83/a0;",
        "cleanNativePeer",
        "(J)V",
        "",
        "isConsentGiven",
        "Lcom/mapbox/common/geofencing/GeofencingUtilsUserConsentResponseCallback;",
        "callback",
        "setUserConsent",
        "(ZLcom/mapbox/common/geofencing/GeofencingUtilsUserConsentResponseCallback;)V",
        "getUserConsent",
        "()Z",
        "isActive",
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
    invoke-direct {p0}, Lcom/mapbox/common/geofencing/GeofencingUtils$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$cleanNativePeer(Lcom/mapbox/common/geofencing/GeofencingUtils$Companion;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/mapbox/common/geofencing/GeofencingUtils$Companion;->cleanNativePeer(J)V

    return-void
.end method

.method private final cleanNativePeer(J)V
    .locals 0

    invoke-static {p1, p2}, Lcom/mapbox/common/geofencing/GeofencingUtils;->access$cleanNativePeer(J)V

    return-void
.end method


# virtual methods
.method public final getUserConsent()Z
    .locals 1

    invoke-static {}, Lcom/mapbox/common/geofencing/GeofencingUtils;->getUserConsent()Z

    move-result v0

    return v0
.end method

.method public final isActive()Z
    .locals 1

    invoke-static {}, Lcom/mapbox/common/geofencing/GeofencingUtils;->isActive()Z

    move-result v0

    return v0
.end method

.method public final setUserConsent(ZLcom/mapbox/common/geofencing/GeofencingUtilsUserConsentResponseCallback;)V
    .locals 0

    invoke-static {p1, p2}, Lcom/mapbox/common/geofencing/GeofencingUtils;->setUserConsent(ZLcom/mapbox/common/geofencing/GeofencingUtilsUserConsentResponseCallback;)V

    return-void
.end method
