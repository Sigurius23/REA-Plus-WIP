.class public final Lev/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/mapbox/maps/MapboxMap;

.field public final b:Lcom/mapbox/maps/module/MapTelemetry;

.field public final c:Lcom/mapbox/maps/geofencing/MapGeofencingConsent;


# direct methods
.method public constructor <init>(Lcom/mapbox/maps/MapboxMap;Lcom/mapbox/maps/module/MapTelemetry;Lcom/mapbox/maps/geofencing/MapGeofencingConsent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lev/f;->a:Lcom/mapbox/maps/MapboxMap;

    iput-object p2, p0, Lev/f;->b:Lcom/mapbox/maps/module/MapTelemetry;

    iput-object p3, p0, Lev/f;->c:Lcom/mapbox/maps/geofencing/MapGeofencingConsent;

    return-void
.end method
