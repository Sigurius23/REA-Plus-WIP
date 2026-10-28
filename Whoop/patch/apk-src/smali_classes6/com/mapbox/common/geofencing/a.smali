.class public final synthetic Lcom/mapbox/common/geofencing/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J


# direct methods
.method public synthetic constructor <init>(JI)V
    .locals 0

    iput p3, p0, Lcom/mapbox/common/geofencing/a;->w:I

    iput-wide p1, p0, Lcom/mapbox/common/geofencing/a;->x:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lcom/mapbox/common/geofencing/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-wide v0, p0, Lcom/mapbox/common/geofencing/a;->x:J

    invoke-static {v0, v1}, Lcom/mapbox/common/geofencing/GeofencingUtils;->a(J)V

    return-void

    :pswitch_0
    iget-wide v0, p0, Lcom/mapbox/common/geofencing/a;->x:J

    invoke-static {v0, v1}, Lcom/mapbox/common/geofencing/GeofencingServiceNative;->a(J)V

    return-void

    :pswitch_1
    iget-wide v0, p0, Lcom/mapbox/common/geofencing/a;->x:J

    invoke-static {v0, v1}, Lcom/mapbox/common/geofencing/GeofencingObserverNative;->a(J)V

    return-void

    :pswitch_2
    iget-wide v0, p0, Lcom/mapbox/common/geofencing/a;->x:J

    invoke-static {v0, v1}, Lcom/mapbox/common/geofencing/GeofencingFactory;->a(J)V

    return-void

    :pswitch_3
    iget-wide v0, p0, Lcom/mapbox/common/geofencing/a;->x:J

    invoke-static {v0, v1}, Lcom/mapbox/common/geofencing/RemoveObserverCallbackNative;->a(J)V

    return-void

    :pswitch_4
    iget-wide v0, p0, Lcom/mapbox/common/geofencing/a;->x:J

    invoke-static {v0, v1}, Lcom/mapbox/common/geofencing/RemoveFeatureCallbackNative;->a(J)V

    return-void

    :pswitch_5
    iget-wide v0, p0, Lcom/mapbox/common/geofencing/a;->x:J

    invoke-static {v0, v1}, Lcom/mapbox/common/geofencing/GetOptionsCallbackNative;->a(J)V

    return-void

    :pswitch_6
    iget-wide v0, p0, Lcom/mapbox/common/geofencing/a;->x:J

    invoke-static {v0, v1}, Lcom/mapbox/common/geofencing/GetFeatureCallbackNative;->a(J)V

    return-void

    :pswitch_7
    iget-wide v0, p0, Lcom/mapbox/common/geofencing/a;->x:J

    invoke-static {v0, v1}, Lcom/mapbox/common/geofencing/GeofencingUtilsUserConsentResponseCallbackNative;->a(J)V

    return-void

    :pswitch_8
    iget-wide v0, p0, Lcom/mapbox/common/geofencing/a;->x:J

    invoke-static {v0, v1}, Lcom/mapbox/common/geofencing/ConfigureCallbackNative;->a(J)V

    return-void

    :pswitch_9
    iget-wide v0, p0, Lcom/mapbox/common/geofencing/a;->x:J

    invoke-static {v0, v1}, Lcom/mapbox/common/geofencing/ClearFeaturesCallbackNative;->a(J)V

    return-void

    :pswitch_a
    iget-wide v0, p0, Lcom/mapbox/common/geofencing/a;->x:J

    invoke-static {v0, v1}, Lcom/mapbox/common/geofencing/AddObserverCallbackNative;->a(J)V

    return-void

    :pswitch_b
    iget-wide v0, p0, Lcom/mapbox/common/geofencing/a;->x:J

    invoke-static {v0, v1}, Lcom/mapbox/common/geofencing/AddFeatureCallbackNative;->a(J)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
