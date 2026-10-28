.class public final Lrv/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# instance fields
.field public final a:Landroid/view/WindowManager;

.field public final b:Landroid/hardware/SensorManager;

.field public final c:Ljava/util/LinkedHashSet;

.field public final d:Ljava/util/LinkedHashSet;

.field public final e:Landroid/hardware/Sensor;

.field public final f:Landroid/hardware/Sensor;

.field public final g:Landroid/hardware/Sensor;

.field public final h:[F

.field public i:[F

.field public j:J

.field public k:[F

.field public l:[F

.field public final m:[F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.WindowManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Lrv/j;->a:Landroid/view/WindowManager;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "sensor"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.hardware.SensorManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/hardware/SensorManager;

    iput-object p1, p0, Lrv/j;->b:Landroid/hardware/SensorManager;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lrv/j;->c:Ljava/util/LinkedHashSet;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lrv/j;->d:Ljava/util/LinkedHashSet;

    const/16 v0, 0x9

    new-array v0, v0, [F

    iput-object v0, p0, Lrv/j;->h:[F

    const/4 v0, 0x3

    new-array v1, v0, [F

    iput-object v1, p0, Lrv/j;->k:[F

    new-array v1, v0, [F

    iput-object v1, p0, Lrv/j;->l:[F

    new-array v0, v0, [F

    iput-object v0, p0, Lrv/j;->m:[F

    const/16 v0, 0xb

    invoke-virtual {p1, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v0

    iput-object v0, p0, Lrv/j;->e:Landroid/hardware/Sensor;

    if-nez v0, :cond_0

    const-string v0, "LocationCompassProvider"

    const-string v1, "Rotation vector sensor not supported on device, falling back to accelerometer and magnetic field."

    invoke-static {v0, v1}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v0

    iput-object v0, p0, Lrv/j;->f:Landroid/hardware/Sensor;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object p1

    iput-object p1, p0, Lrv/j;->g:Landroid/hardware/Sensor;

    :cond_0
    return-void
.end method


# virtual methods
.method public final onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    if-nez p2, :cond_1

    const-string p1, "LocationCompassProvider"

    const-string p2, "Compass sensor is unreliable, device calibration is needed."

    invoke-static {p1, p2}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lrv/j;->d:Ljava/util/LinkedHashSet;

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public final onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "event"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    invoke-virtual {v2}, Landroid/hardware/Sensor;->getType()I

    move-result v2

    const v3, 0x3ee66666    # 0.45f

    const/4 v4, 0x0

    const-string v5, "event.values"

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eq v2, v7, :cond_4

    if-eq v2, v6, :cond_1

    const/16 v3, 0xb

    if-eq v2, v3, :cond_0

    goto :goto_4

    :cond_0
    iget-object v1, v1, Landroid/hardware/SensorEvent;->values:[F

    iput-object v1, v0, Lrv/j;->i:[F

    goto :goto_4

    :cond_1
    iget-object v1, v1, Landroid/hardware/SensorEvent;->values:[F

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lrv/j;->l:[F

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    array-length v5, v1

    move v8, v4

    :goto_0
    if-ge v8, v5, :cond_3

    aget v9, v2, v8

    aget v10, v1, v8

    invoke-static {v10, v9, v3, v9}, Lb9/y;->a(FFFF)F

    move-result v9

    aput v9, v2, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_3
    move-object v1, v2

    :goto_1
    iput-object v1, v0, Lrv/j;->l:[F

    goto :goto_4

    :cond_4
    iget-object v1, v1, Landroid/hardware/SensorEvent;->values:[F

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lrv/j;->k:[F

    if-nez v2, :cond_5

    goto :goto_3

    :cond_5
    array-length v5, v1

    move v8, v4

    :goto_2
    if-ge v8, v5, :cond_6

    aget v9, v2, v8

    aget v10, v1, v8

    invoke-static {v10, v9, v3, v9}, Lb9/y;->a(FFFF)F

    move-result v9

    aput v9, v2, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_6
    move-object v1, v2

    :goto_3
    iput-object v1, v0, Lrv/j;->k:[F

    :goto_4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iget-wide v8, v0, Lrv/j;->j:J

    cmp-long v3, v1, v8

    if-gez v3, :cond_7

    return-void

    :cond_7
    iget-object v3, v0, Lrv/j;->i:[F

    iget-object v5, v0, Lrv/j;->h:[F

    if-eqz v3, :cond_8

    invoke-static {v5, v3}, Landroid/hardware/SensorManager;->getRotationMatrixFromVector([F[F)V

    goto :goto_5

    :cond_8
    iget-object v3, v0, Lrv/j;->k:[F

    iget-object v8, v0, Lrv/j;->l:[F

    const/4 v9, 0x0

    invoke-static {v5, v9, v3, v8}, Landroid/hardware/SensorManager;->getRotationMatrix([F[F[F[F)Z

    :goto_5
    iget-object v3, v0, Lrv/j;->a:Landroid/view/WindowManager;

    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v8

    invoke-virtual {v8}, Landroid/view/Display;->getRotation()I

    move-result v8

    const/4 v9, 0x3

    if-eq v8, v7, :cond_b

    if-eq v8, v6, :cond_a

    if-eq v8, v9, :cond_9

    move v12, v6

    move v8, v7

    goto :goto_6

    :cond_9
    move v12, v7

    const/16 v8, 0x82

    goto :goto_6

    :cond_a
    const/16 v8, 0x81

    const/16 v12, 0x82

    goto :goto_6

    :cond_b
    move v8, v6

    const/16 v12, 0x81

    :goto_6
    const/16 v13, 0x9

    new-array v13, v13, [F

    invoke-static {v5, v8, v12, v13}, Landroid/hardware/SensorManager;->remapCoordinateSystem([FII[F)Z

    iget-object v14, v0, Lrv/j;->m:[F

    invoke-static {v13, v14}, Landroid/hardware/SensorManager;->getOrientation([F[F)[F

    aget v15, v14, v7

    float-to-double v10, v15

    const-wide v16, -0x4016de04abbbd2e8L    # -0.7853981633974483

    cmpg-double v15, v10, v16

    const/16 v16, 0x83

    if-gez v15, :cond_f

    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/Display;->getRotation()I

    move-result v3

    if-eq v3, v7, :cond_e

    if-eq v3, v6, :cond_d

    if-eq v3, v9, :cond_c

    move v6, v7

    move v7, v9

    goto/16 :goto_9

    :cond_c
    move/from16 v6, v16

    goto/16 :goto_9

    :cond_d
    move/from16 v7, v16

    :goto_7
    const/16 v6, 0x81

    goto :goto_9

    :cond_e
    move v6, v9

    :goto_8
    const/16 v7, 0x81

    goto :goto_9

    :cond_f
    const-wide v17, 0x3fe921fb54442d18L    # 0.7853981633974483

    cmpl-double v10, v10, v17

    if-lez v10, :cond_13

    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/Display;->getRotation()I

    move-result v3

    if-eq v3, v7, :cond_12

    if-eq v3, v6, :cond_11

    if-eq v3, v9, :cond_10

    move v6, v7

    move/from16 v7, v16

    goto :goto_9

    :cond_10
    move v6, v9

    goto :goto_9

    :cond_11
    move v7, v9

    goto :goto_7

    :cond_12
    move/from16 v6, v16

    goto :goto_8

    :cond_13
    aget v10, v14, v6

    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    move-result v10

    float-to-double v10, v10

    const-wide v16, 0x3ff921fb54442d18L    # 1.5707963267948966

    cmpl-double v10, v10, v16

    if-lez v10, :cond_16

    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/Display;->getRotation()I

    move-result v3

    if-eq v3, v7, :cond_15

    if-eq v3, v6, :cond_14

    if-eq v3, v9, :cond_17

    move v6, v7

    const/16 v7, 0x82

    goto :goto_9

    :cond_14
    move v7, v6

    goto :goto_7

    :cond_15
    const/16 v6, 0x82

    goto :goto_8

    :cond_16
    move v6, v8

    move v7, v12

    :cond_17
    :goto_9
    invoke-static {v5, v6, v7, v13}, Landroid/hardware/SensorManager;->remapCoordinateSystem([FII[F)Z

    invoke-static {v13, v14}, Landroid/hardware/SensorManager;->getOrientation([F[F)[F

    aget v3, v14, v4

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v3

    double-to-float v3, v3

    iget-object v4, v0, Lrv/j;->c:Ljava/util/LinkedHashSet;

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_18

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lrv/h;

    iget-object v5, v5, Lrv/h;->a:Ldc3/u;

    float-to-double v6, v3

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    invoke-static {v5, v6}, Lvd/f;->X(Ldc3/x;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    :cond_18
    const-wide/16 v3, 0x1f4

    add-long/2addr v1, v3

    iput-wide v1, v0, Lrv/j;->j:J

    return-void
.end method
