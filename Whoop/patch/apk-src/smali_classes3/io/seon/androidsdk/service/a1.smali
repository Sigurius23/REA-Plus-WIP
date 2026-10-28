.class public final synthetic Lio/seon/androidsdk/service/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/seon/androidsdk/service/c1;


# direct methods
.method public synthetic constructor <init>(Lio/seon/androidsdk/service/c1;I)V
    .locals 0

    iput p2, p0, Lio/seon/androidsdk/service/a1;->w:I

    iput-object p1, p0, Lio/seon/androidsdk/service/a1;->x:Lio/seon/androidsdk/service/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, Lio/seon/androidsdk/service/a1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/seon/androidsdk/service/a1;->x:Lio/seon/androidsdk/service/c1;

    iget-object v1, v0, Lio/seon/androidsdk/service/c1;->a:Landroid/hardware/SensorManager;

    iget-object v2, v0, Lio/seon/androidsdk/service/c1;->o:Lio/seon/androidsdk/service/y0;

    iget-object v0, v0, Lio/seon/androidsdk/service/c1;->f:Landroid/hardware/Sensor;

    const/4 v3, 0x3

    invoke-virtual {v1, v2, v0, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/seon/androidsdk/service/a1;->x:Lio/seon/androidsdk/service/c1;

    iget-object v1, v0, Lio/seon/androidsdk/service/c1;->a:Landroid/hardware/SensorManager;

    iget-object v2, v0, Lio/seon/androidsdk/service/c1;->o:Lio/seon/androidsdk/service/y0;

    iget-object v0, v0, Lio/seon/androidsdk/service/c1;->d:Landroid/hardware/Sensor;

    const/4 v3, 0x3

    invoke-virtual {v1, v2, v0, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    return-void

    :pswitch_1
    iget-object v0, p0, Lio/seon/androidsdk/service/a1;->x:Lio/seon/androidsdk/service/c1;

    iget-object v1, v0, Lio/seon/androidsdk/service/c1;->a:Landroid/hardware/SensorManager;

    iget-object v2, v0, Lio/seon/androidsdk/service/c1;->o:Lio/seon/androidsdk/service/y0;

    iget-object v0, v0, Lio/seon/androidsdk/service/c1;->e:Landroid/hardware/Sensor;

    const/4 v3, 0x3

    invoke-virtual {v1, v2, v0, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    return-void

    :pswitch_2
    iget-object v0, p0, Lio/seon/androidsdk/service/a1;->x:Lio/seon/androidsdk/service/c1;

    iget-object v1, v0, Lio/seon/androidsdk/service/c1;->a:Landroid/hardware/SensorManager;

    iget-object v2, v0, Lio/seon/androidsdk/service/c1;->o:Lio/seon/androidsdk/service/y0;

    iget-object v0, v0, Lio/seon/androidsdk/service/c1;->c:Landroid/hardware/Sensor;

    const/4 v3, 0x3

    invoke-virtual {v1, v2, v0, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    return-void

    :pswitch_3
    iget-object v0, p0, Lio/seon/androidsdk/service/a1;->x:Lio/seon/androidsdk/service/c1;

    iget-object v1, v0, Lio/seon/androidsdk/service/c1;->a:Landroid/hardware/SensorManager;

    iget-object v2, v0, Lio/seon/androidsdk/service/c1;->o:Lio/seon/androidsdk/service/y0;

    iget-object v0, v0, Lio/seon/androidsdk/service/c1;->b:Landroid/hardware/Sensor;

    const/4 v3, 0x3

    invoke-virtual {v1, v2, v0, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
