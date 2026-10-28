.class public final synthetic Lcom/mapbox/common/location/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;

.field public final synthetic y:Lcom/mapbox/common/location/GetLocationCallback;

.field public final synthetic z:Landroid/location/Location;


# direct methods
.method public synthetic constructor <init>(Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;Lcom/mapbox/common/location/GetLocationCallback;Landroid/location/Location;I)V
    .locals 0

    iput p4, p0, Lcom/mapbox/common/location/d;->w:I

    iput-object p1, p0, Lcom/mapbox/common/location/d;->x:Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;

    iput-object p2, p0, Lcom/mapbox/common/location/d;->y:Lcom/mapbox/common/location/GetLocationCallback;

    iput-object p3, p0, Lcom/mapbox/common/location/d;->z:Landroid/location/Location;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lcom/mapbox/common/location/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/mapbox/common/location/d;->y:Lcom/mapbox/common/location/GetLocationCallback;

    iget-object v1, p0, Lcom/mapbox/common/location/d;->z:Landroid/location/Location;

    iget-object v2, p0, Lcom/mapbox/common/location/d;->x:Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;

    invoke-static {v2, v0, v1}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->d(Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;Lcom/mapbox/common/location/GetLocationCallback;Landroid/location/Location;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/mapbox/common/location/d;->y:Lcom/mapbox/common/location/GetLocationCallback;

    iget-object v1, p0, Lcom/mapbox/common/location/d;->z:Landroid/location/Location;

    iget-object v2, p0, Lcom/mapbox/common/location/d;->x:Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;

    invoke-static {v2, v0, v1}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider$getLastLocation$1$1;->c(Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;Lcom/mapbox/common/location/GetLocationCallback;Landroid/location/Location;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
