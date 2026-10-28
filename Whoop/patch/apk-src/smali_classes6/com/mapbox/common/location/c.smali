.class public final synthetic Lcom/mapbox/common/location/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcq/d;


# instance fields
.field public final synthetic w:Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;

.field public final synthetic x:Lcom/mapbox/common/location/GetLocationCallback;


# direct methods
.method public synthetic constructor <init>(Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;Lcom/mapbox/common/location/GetLocationCallback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/common/location/c;->w:Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;

    iput-object p2, p0, Lcom/mapbox/common/location/c;->x:Lcom/mapbox/common/location/GetLocationCallback;

    return-void
.end method


# virtual methods
.method public final q(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    iget-object v0, p0, Lcom/mapbox/common/location/c;->w:Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;

    iget-object v1, p0, Lcom/mapbox/common/location/c;->x:Lcom/mapbox/common/location/GetLocationCallback;

    invoke-static {v0, v1, p1}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->h(Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;Lcom/mapbox/common/location/GetLocationCallback;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
