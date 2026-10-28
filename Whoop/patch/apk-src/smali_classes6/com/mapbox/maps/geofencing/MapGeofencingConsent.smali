.class public interface abstract Lcom/mapbox/maps/geofencing/MapGeofencingConsent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/mapbox/maps/MapboxExperimental;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008g\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\'\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008\u000b\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/mapbox/maps/geofencing/MapGeofencingConsent;",
        "",
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
        "sdk-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract getUserConsent()Z
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation
.end method

.method public abstract setUserConsent(ZLcom/mapbox/common/geofencing/GeofencingUtilsUserConsentResponseCallback;)V
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation
.end method

.method public abstract shouldShowConsent()Z
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation
.end method
