.class public final Lio/seon/androidsdk/service/c1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/hardware/SensorManager;

.field public final b:Landroid/hardware/Sensor;

.field public final c:Landroid/hardware/Sensor;

.field public final d:Landroid/hardware/Sensor;

.field public final e:Landroid/hardware/Sensor;

.field public final f:Landroid/hardware/Sensor;

.field public g:Z

.field public h:J

.field public i:J

.field public j:Lio/seon/androidsdk/service/e;

.field public k:Lio/seon/androidsdk/service/e;

.field public l:Lio/seon/androidsdk/service/e;

.field public m:Lio/seon/androidsdk/service/n0;

.field public n:Lio/seon/androidsdk/service/e;

.field public final o:Lio/seon/androidsdk/service/y0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/seon/androidsdk/service/c1;->g:Z

    new-instance v0, Lio/seon/androidsdk/service/y0;

    invoke-direct {v0, p0}, Lio/seon/androidsdk/service/y0;-><init>(Lio/seon/androidsdk/service/c1;)V

    iput-object v0, p0, Lio/seon/androidsdk/service/c1;->o:Lio/seon/androidsdk/service/y0;

    sget-object v0, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "sensor"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/SensorManager;

    iput-object p1, p0, Lio/seon/androidsdk/service/c1;->a:Landroid/hardware/SensorManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :try_start_1
    iget-object p1, p0, Lio/seon/androidsdk/service/c1;->a:Landroid/hardware/SensorManager;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object p1

    iput-object p1, p0, Lio/seon/androidsdk/service/c1;->b:Landroid/hardware/Sensor;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    :try_start_2
    iget-object p1, p0, Lio/seon/androidsdk/service/c1;->a:Landroid/hardware/SensorManager;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object p1

    iput-object p1, p0, Lio/seon/androidsdk/service/c1;->c:Landroid/hardware/Sensor;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :catchall_2
    :try_start_3
    iget-object p1, p0, Lio/seon/androidsdk/service/c1;->a:Landroid/hardware/SensorManager;

    const/4 v0, 0x5

    invoke-virtual {p1, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object p1

    iput-object p1, p0, Lio/seon/androidsdk/service/c1;->d:Landroid/hardware/Sensor;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :catchall_3
    :try_start_4
    iget-object p1, p0, Lio/seon/androidsdk/service/c1;->a:Landroid/hardware/SensorManager;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object p1

    iput-object p1, p0, Lio/seon/androidsdk/service/c1;->e:Landroid/hardware/Sensor;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    :catchall_4
    :try_start_5
    iget-object p1, p0, Lio/seon/androidsdk/service/c1;->a:Landroid/hardware/SensorManager;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object p1

    iput-object p1, p0, Lio/seon/androidsdk/service/c1;->f:Landroid/hardware/Sensor;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    :catchall_5
    :try_start_6
    invoke-virtual {p0}, Lio/seon/androidsdk/service/c1;->b()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    :catchall_6
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/HashMap;
    .locals 11

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    iget-object v1, p0, Lio/seon/androidsdk/service/c1;->l:Lio/seon/androidsdk/service/e;

    invoke-virtual {v1}, Lio/seon/androidsdk/service/e;->i()Lio/seon/androidsdk/service/h;

    move-result-object v1

    iget-object v2, p0, Lio/seon/androidsdk/service/c1;->m:Lio/seon/androidsdk/service/n0;

    new-instance v3, Lai/j;

    iget v4, v2, Lio/seon/androidsdk/service/e1;->d:I

    const/16 v5, 0x14

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    new-array v5, v4, [[F

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    const/4 v8, 0x1

    if-ge v7, v4, :cond_0

    iget v9, v2, Lio/seon/androidsdk/service/e1;->c:I

    sub-int/2addr v9, v8

    sub-int/2addr v9, v7

    iget v8, v2, Lio/seon/androidsdk/service/e1;->e:I

    add-int/2addr v9, v8

    rem-int/2addr v9, v8

    iget-object v8, v2, Lio/seon/androidsdk/service/e1;->g:Ljava/lang/Object;

    check-cast v8, [[F

    aget-object v8, v8, v9

    array-length v9, v8

    invoke-static {v8, v9}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v8

    aput-object v8, v5, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_0
    iget v2, v2, Lio/seon/androidsdk/service/e1;->d:I

    invoke-direct {v3, v5, v2}, Lai/j;-><init>(Ljava/lang/Object;I)V

    iget-object v2, p0, Lio/seon/androidsdk/service/c1;->j:Lio/seon/androidsdk/service/e;

    invoke-virtual {v2}, Lio/seon/androidsdk/service/e;->g()La0/i;

    move-result-object v2

    iget-object v4, p0, Lio/seon/androidsdk/service/c1;->k:Lio/seon/androidsdk/service/e;

    invoke-virtual {v4}, Lio/seon/androidsdk/service/e;->g()La0/i;

    move-result-object v4

    iget-object v5, p0, Lio/seon/androidsdk/service/c1;->n:Lio/seon/androidsdk/service/e;

    invoke-virtual {v5}, Lio/seon/androidsdk/service/e;->h()Lio/seon/androidsdk/service/h;

    move-result-object v5

    const-string v7, "light"

    new-instance v9, Lio/seon/androidsdk/service/g0;

    const/4 v10, 0x2

    invoke-direct {v9, v1, v10}, Lio/seon/androidsdk/service/g0;-><init>(Ljava/lang/Object;I)V

    sget-object v1, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x0

    :try_start_1
    invoke-virtual {v9}, Lio/seon/androidsdk/service/g0;->a()Ljava/lang/Object;

    move-result-object v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-object v9, v1

    :goto_1
    :try_start_2
    invoke-virtual {v0, v7, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "prox"

    new-instance v9, Lio/seon/androidsdk/service/g0;

    const/4 v10, 0x3

    invoke-direct {v9, v3, v10}, Lio/seon/androidsdk/service/g0;-><init>(Ljava/lang/Object;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    invoke-virtual {v9}, Lio/seon/androidsdk/service/g0;->a()Ljava/lang/Object;

    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-object v3, v1

    :goto_2
    :try_start_4
    invoke-virtual {v0, v7, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "acc"

    new-instance v7, Lio/seon/androidsdk/service/b1;

    invoke-direct {v7, v2, v6}, Lio/seon/androidsdk/service/b1;-><init>(La0/i;I)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :try_start_5
    invoke-virtual {v7}, Lio/seon/androidsdk/service/b1;->a()Ljava/lang/Object;

    move-result-object v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_3

    :catchall_2
    move-object v2, v1

    :goto_3
    :try_start_6
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "gyro"

    new-instance v3, Lio/seon/androidsdk/service/b1;

    invoke-direct {v3, v4, v8}, Lio/seon/androidsdk/service/b1;-><init>(La0/i;I)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    :try_start_7
    invoke-virtual {v3}, Lio/seon/androidsdk/service/b1;->a()Ljava/lang/Object;

    move-result-object v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_4

    :catchall_3
    move-object v3, v1

    :goto_4
    :try_start_8
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "mag"

    new-instance v3, Lio/seon/androidsdk/service/g0;

    const/4 v4, 0x4

    invoke-direct {v3, v5, v4}, Lio/seon/androidsdk/service/g0;-><init>(Ljava/lang/Object;I)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    :try_start_9
    invoke-virtual {v3}, Lio/seon/androidsdk/service/g0;->a()Ljava/lang/Object;

    move-result-object v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :catchall_4
    :try_start_a
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "duration"

    iget-wide v2, p0, Lio/seon/androidsdk/service/c1;->i:J

    iget-wide v4, p0, Lio/seon/androidsdk/service/c1;->h:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0

    goto :goto_5

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "error"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "bhvr"

    invoke-static {v2, v1}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_5
    return-object v0
.end method

.method public final b()V
    .locals 4

    new-instance v0, Lio/seon/androidsdk/service/e;

    invoke-direct {v0}, Lio/seon/androidsdk/service/e;-><init>()V

    iput-object v0, p0, Lio/seon/androidsdk/service/c1;->j:Lio/seon/androidsdk/service/e;

    new-instance v0, Lio/seon/androidsdk/service/e;

    invoke-direct {v0}, Lio/seon/androidsdk/service/e;-><init>()V

    iput-object v0, p0, Lio/seon/androidsdk/service/c1;->k:Lio/seon/androidsdk/service/e;

    new-instance v0, Lio/seon/androidsdk/service/e;

    const/4 v1, 0x2

    const/16 v2, 0x3e8

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, Lio/seon/androidsdk/service/e;-><init>(III)V

    iput-object v0, p0, Lio/seon/androidsdk/service/c1;->l:Lio/seon/androidsdk/service/e;

    new-instance v0, Lio/seon/androidsdk/service/n0;

    invoke-direct {v0}, Lio/seon/androidsdk/service/n0;-><init>()V

    iput-object v0, p0, Lio/seon/androidsdk/service/c1;->m:Lio/seon/androidsdk/service/n0;

    new-instance v0, Lio/seon/androidsdk/service/e;

    const/4 v1, 0x0

    invoke-direct {v0, v2, v3, v1}, Lio/seon/androidsdk/service/e;-><init>(III)V

    iput-object v0, p0, Lio/seon/androidsdk/service/c1;->n:Lio/seon/androidsdk/service/e;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lio/seon/androidsdk/service/c1;->h:J

    const-wide/16 v0, -0x2

    iput-wide v0, p0, Lio/seon/androidsdk/service/c1;->i:J

    return-void
.end method

.method public final c()V
    .locals 2

    :try_start_0
    iget-boolean v0, p0, Lio/seon/androidsdk/service/c1;->g:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/seon/androidsdk/service/c1;->b()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/seon/androidsdk/service/c1;->g:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lio/seon/androidsdk/service/c1;->h:J

    new-instance v0, Lio/seon/androidsdk/service/a1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/seon/androidsdk/service/a1;-><init>(Lio/seon/androidsdk/service/c1;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {v0}, Lio/seon/androidsdk/service/a1;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :try_start_2
    new-instance v0, Lio/seon/androidsdk/service/a1;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/seon/androidsdk/service/a1;-><init>(Lio/seon/androidsdk/service/c1;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    invoke-virtual {v0}, Lio/seon/androidsdk/service/a1;->run()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    :try_start_4
    new-instance v0, Lio/seon/androidsdk/service/a1;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lio/seon/androidsdk/service/a1;-><init>(Lio/seon/androidsdk/service/c1;I)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :try_start_5
    invoke-virtual {v0}, Lio/seon/androidsdk/service/a1;->run()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    :try_start_6
    new-instance v0, Lio/seon/androidsdk/service/a1;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Lio/seon/androidsdk/service/a1;-><init>(Lio/seon/androidsdk/service/c1;I)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    :try_start_7
    invoke-virtual {v0}, Lio/seon/androidsdk/service/a1;->run()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :catchall_3
    :try_start_8
    new-instance v0, Lio/seon/androidsdk/service/a1;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1}, Lio/seon/androidsdk/service/a1;-><init>(Lio/seon/androidsdk/service/c1;I)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    :try_start_9
    invoke-virtual {v0}, Lio/seon/androidsdk/service/a1;->run()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :catch_0
    :catchall_4
    :cond_0
    return-void
.end method

.method public final d()V
    .locals 2

    :try_start_0
    iget-boolean v0, p0, Lio/seon/androidsdk/service/c1;->g:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/seon/androidsdk/service/c1;->g:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lio/seon/androidsdk/service/c1;->i:J

    iget-object v0, p0, Lio/seon/androidsdk/service/c1;->a:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lio/seon/androidsdk/service/c1;->o:Lio/seon/androidsdk/service/y0;

    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    new-instance v0, Lio/seon/androidsdk/exception/BehaviouralMonitoringException;

    const-string v1, "You have to start monitoring before collecting the results!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Lio/seon/androidsdk/exception/BehaviouralMonitoringException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :catch_1
    return-void

    :goto_0
    throw v0
.end method
