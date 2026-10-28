.class public final Lcom/mapbox/maps/MapGeofencingConsentImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/maps/geofencing/MapGeofencingConsent;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/mapbox/maps/MapGeofencingConsentImpl;",
        "Lcom/mapbox/maps/geofencing/MapGeofencingConsent;",
        "<init>",
        "()V",
        "",
        "isConsentGiven",
        "Lcom/mapbox/common/geofencing/GeofencingUtilsUserConsentResponseCallback;",
        "callback",
        "Ll83/a0;",
        "setUserConsent",
        "(ZLcom/mapbox/common/geofencing/GeofencingUtilsUserConsentResponseCallback;)V",
        "getUserConsent",
        "()Z",
        "shouldShowConsent",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getUserConsent()Z
    .locals 1

    sget-object v0, Lcom/mapbox/common/geofencing/GeofencingUtils;->Companion:Lcom/mapbox/common/geofencing/GeofencingUtils$Companion;

    invoke-virtual {v0}, Lcom/mapbox/common/geofencing/GeofencingUtils$Companion;->getUserConsent()Z

    move-result v0

    return v0
.end method

.method public setUserConsent(ZLcom/mapbox/common/geofencing/GeofencingUtilsUserConsentResponseCallback;)V
    .locals 1

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/common/geofencing/GeofencingUtils;->Companion:Lcom/mapbox/common/geofencing/GeofencingUtils$Companion;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/common/geofencing/GeofencingUtils$Companion;->setUserConsent(ZLcom/mapbox/common/geofencing/GeofencingUtilsUserConsentResponseCallback;)V

    return-void
.end method

.method public shouldShowConsent()Z
    .locals 2

    sget-object v0, Lcom/mapbox/common/geofencing/GeofencingUtils;->Companion:Lcom/mapbox/common/geofencing/GeofencingUtils$Companion;

    invoke-virtual {v0}, Lcom/mapbox/common/geofencing/GeofencingUtils$Companion;->getUserConsent()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/mapbox/common/geofencing/GeofencingUtils$Companion;->isActive()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
