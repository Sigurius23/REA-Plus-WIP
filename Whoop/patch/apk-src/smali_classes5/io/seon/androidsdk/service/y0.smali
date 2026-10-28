.class public final Lio/seon/androidsdk/service/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# instance fields
.field public final synthetic a:Lio/seon/androidsdk/service/c1;


# direct methods
.method public constructor <init>(Lio/seon/androidsdk/service/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/seon/androidsdk/service/y0;->a:Lio/seon/androidsdk/service/c1;

    return-void
.end method


# virtual methods
.method public final onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public final onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 3

    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    if-eqz v0, :cond_6

    array-length v1, v0

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    invoke-virtual {p1}, Landroid/hardware/Sensor;->getType()I

    move-result p1

    const/4 v1, 0x1

    iget-object v2, p0, Lio/seon/androidsdk/service/y0;->a:Lio/seon/androidsdk/service/c1;

    if-eq p1, v1, :cond_5

    const/4 v1, 0x2

    if-eq p1, v1, :cond_4

    const/4 v1, 0x4

    if-eq p1, v1, :cond_3

    const/4 v1, 0x5

    if-eq p1, v1, :cond_2

    const/16 v1, 0x8

    if-eq p1, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, v2, Lio/seon/androidsdk/service/c1;->m:Lio/seon/androidsdk/service/n0;

    invoke-virtual {p1, v0}, Lio/seon/androidsdk/service/n0;->a([F)V

    return-void

    :cond_2
    iget-object p1, v2, Lio/seon/androidsdk/service/c1;->l:Lio/seon/androidsdk/service/e;

    invoke-virtual {p1, v0}, Lio/seon/androidsdk/service/e1;->a([F)V

    return-void

    :cond_3
    iget-object p1, v2, Lio/seon/androidsdk/service/c1;->k:Lio/seon/androidsdk/service/e;

    invoke-virtual {p1, v0}, Lio/seon/androidsdk/service/e;->a([F)V

    return-void

    :cond_4
    iget-object p1, v2, Lio/seon/androidsdk/service/c1;->n:Lio/seon/androidsdk/service/e;

    invoke-virtual {p1, v0}, Lio/seon/androidsdk/service/e;->a([F)V

    return-void

    :cond_5
    iget-object p1, v2, Lio/seon/androidsdk/service/c1;->j:Lio/seon/androidsdk/service/e;

    invoke-virtual {p1, v0}, Lio/seon/androidsdk/service/e;->a([F)V

    :cond_6
    :goto_0
    return-void
.end method
