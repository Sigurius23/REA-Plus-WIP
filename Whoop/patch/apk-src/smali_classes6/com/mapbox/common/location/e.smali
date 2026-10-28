.class public final synthetic Lcom/mapbox/common/location/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lcom/mapbox/common/location/e;->w:I

    iput-object p2, p0, Lcom/mapbox/common/location/e;->x:Ljava/lang/Object;

    iput-object p3, p0, Lcom/mapbox/common/location/e;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lcom/mapbox/common/location/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/mapbox/common/location/e;->x:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/common/location/LocationObserver;

    iget-object v1, p0, Lcom/mapbox/common/location/e;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1}, Lcom/mapbox/common/location/BaseLocationProvider;->a(Lcom/mapbox/common/location/LocationObserver;Ljava/util/List;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/mapbox/common/location/e;->x:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;

    iget-object v1, p0, Lcom/mapbox/common/location/e;->y:Ljava/lang/Object;

    check-cast v1, Lcom/mapbox/common/location/GetLocationCallback;

    invoke-static {v0, v1}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->b(Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;Lcom/mapbox/common/location/GetLocationCallback;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/mapbox/common/location/e;->x:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;

    iget-object v1, p0, Lcom/mapbox/common/location/e;->y:Ljava/lang/Object;

    check-cast v1, Lcom/mapbox/common/location/GetLocationCallback;

    invoke-static {v0, v1}, Lcom/mapbox/common/location/AndroidDeviceLocationProvider;->c(Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;Lcom/mapbox/common/location/GetLocationCallback;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lcom/mapbox/common/location/e;->x:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;

    iget-object v1, p0, Lcom/mapbox/common/location/e;->y:Ljava/lang/Object;

    check-cast v1, Lcom/mapbox/common/location/GetLocationCallback;

    invoke-static {v0, v1}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider$getLastLocation$1$1;->a(Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;Lcom/mapbox/common/location/GetLocationCallback;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
