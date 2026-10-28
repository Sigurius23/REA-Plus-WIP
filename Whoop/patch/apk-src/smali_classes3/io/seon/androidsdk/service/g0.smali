.class public final synthetic Lio/seon/androidsdk/service/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/seon/androidsdk/service/t0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lio/seon/androidsdk/service/g0;->a:I

    iput-object p1, p0, Lio/seon/androidsdk/service/g0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 18

    move-object/from16 v1, p0

    iget v0, v1, Lio/seon/androidsdk/service/g0;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Lio/seon/androidsdk/service/g0;->b:Ljava/lang/Object;

    check-cast v0, Lio/seon/androidsdk/service/j1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/util/TimeZone;->getOffset(J)I

    move-result v0

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const v3, 0x36ee80

    div-int v3, v0, v3

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const v4, 0xea60

    div-int v4, v0, v4

    rem-int/lit8 v4, v4, 0x3c

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v3, v4}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "%02d:%02d"

    invoke-static {v2, v4, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    if-ltz v0, :cond_0

    const-string v0, "+"

    goto :goto_0

    :cond_0
    const-string v0, "-"

    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, v1, Lio/seon/androidsdk/service/g0;->b:Ljava/lang/Object;

    check-cast v0, Lio/seon/androidsdk/service/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iget v3, v0, Lio/seon/androidsdk/service/h;->a:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const-string v4, "med"

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v3, v0, Lio/seon/androidsdk/service/h;->b:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const-string v4, "max"

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v3, v0, Lio/seon/androidsdk/service/h;->c:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const-string v4, "min"

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v3, v0, Lio/seon/androidsdk/service/h;->d:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const-string v4, "p95"

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, v0, Lio/seon/androidsdk/service/h;->e:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v3, "sample"

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2

    :pswitch_1
    iget-object v0, v1, Lio/seon/androidsdk/service/g0;->b:Ljava/lang/Object;

    check-cast v0, Lai/j;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iget-object v3, v0, Lai/j;->x:Ljava/lang/Object;

    check-cast v3, [[F

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    const/4 v5, 0x0

    move v6, v5

    :goto_1
    array-length v7, v3

    if-ge v6, v7, :cond_2

    aget-object v7, v3, v6

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    move v9, v5

    :goto_2
    array-length v10, v7

    if-ge v9, v10, :cond_1

    aget v10, v7, v9

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_1
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_2
    const-string v3, "elems"

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, v0, Lai/j;->w:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v3, "sample"

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2

    :pswitch_2
    iget-object v0, v1, Lio/seon/androidsdk/service/g0;->b:Ljava/lang/Object;

    check-cast v0, Lio/seon/androidsdk/service/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iget v3, v0, Lio/seon/androidsdk/service/h;->c:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const-string v4, "min"

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v3, v0, Lio/seon/androidsdk/service/h;->b:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const-string v4, "max"

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v3, v0, Lio/seon/androidsdk/service/h;->a:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const-string v4, "med"

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v3, v0, Lio/seon/androidsdk/service/h;->d:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const-string v4, "p95"

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, v0, Lio/seon/androidsdk/service/h;->e:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v3, "sample"

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2

    :pswitch_3
    iget-object v0, v1, Lio/seon/androidsdk/service/g0;->b:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lio/seon/androidsdk/service/p0;

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    const/4 v4, 0x3

    const/4 v5, 0x0

    :try_start_0
    invoke-virtual {v2}, Lio/seon/androidsdk/service/p0;->l()Landroid/location/Location;

    move-result-object v0

    invoke-virtual {v0}, Landroid/location/Location;->getAltitude()D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    :goto_3
    move-object v0, v5

    goto :goto_4

    :catch_0
    move-exception v0

    sget-object v6, Lio/seon/androidsdk/service/g;->d:Lbu/c;

    invoke-virtual {v6, v4, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_3

    :goto_4
    const-string v6, "altitude"

    invoke-virtual {v3, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_1
    invoke-virtual {v2}, Lio/seon/androidsdk/service/p0;->l()Landroid/location/Location;

    move-result-object v0

    invoke-virtual {v0}, Landroid/location/Location;->getBearing()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_6

    :catchall_1
    :goto_5
    move-object v0, v5

    goto :goto_6

    :catch_1
    move-exception v0

    sget-object v6, Lio/seon/androidsdk/service/g;->d:Lbu/c;

    invoke-virtual {v6, v4, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_5

    :goto_6
    const-string v6, "bearing"

    invoke-virtual {v3, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_2
    invoke-virtual {v2}, Lio/seon/androidsdk/service/p0;->l()Landroid/location/Location;

    move-result-object v0

    invoke-virtual {v0}, Landroid/location/Location;->getBearingAccuracyDegrees()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_8

    :catchall_2
    :goto_7
    move-object v0, v5

    goto :goto_8

    :catch_2
    move-exception v0

    sget-object v6, Lio/seon/androidsdk/service/g;->d:Lbu/c;

    invoke-virtual {v6, v4, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_7

    :goto_8
    const-string v6, "bearing_accuracy"

    invoke-virtual {v3, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_3
    invoke-virtual {v2}, Lio/seon/androidsdk/service/p0;->l()Landroid/location/Location;

    move-result-object v0

    invoke-virtual {v0}, Landroid/location/Location;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_3

    goto :goto_a

    :cond_3
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_9
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v0, v8}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v6, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_9

    :catchall_3
    :cond_4
    :goto_a
    move-object v6, v5

    goto :goto_b

    :catch_3
    move-exception v0

    sget-object v6, Lio/seon/androidsdk/service/g;->d:Lbu/c;

    invoke-virtual {v6, v4, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_a

    :cond_5
    :goto_b
    const-string v0, "extras"

    invoke-virtual {v3, v0, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_4
    invoke-virtual {v2}, Lio/seon/androidsdk/service/p0;->l()Landroid/location/Location;

    move-result-object v0

    invoke-virtual {v0}, Landroid/location/Location;->getSpeed()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_d

    :catchall_4
    :goto_c
    move-object v0, v5

    goto :goto_d

    :catch_4
    move-exception v0

    sget-object v6, Lio/seon/androidsdk/service/g;->d:Lbu/c;

    invoke-virtual {v6, v4, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_c

    :goto_d
    const-string v6, "speed"

    invoke-virtual {v3, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_5
    invoke-virtual {v2}, Lio/seon/androidsdk/service/p0;->l()Landroid/location/Location;

    move-result-object v0

    invoke-virtual {v0}, Landroid/location/Location;->getSpeedAccuracyMetersPerSecond()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    goto :goto_f

    :catchall_5
    :goto_e
    move-object v0, v5

    goto :goto_f

    :catch_5
    move-exception v0

    sget-object v6, Lio/seon/androidsdk/service/g;->d:Lbu/c;

    invoke-virtual {v6, v4, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_e

    :goto_f
    const-string v6, "speed_accuracy"

    invoke-virtual {v3, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_6
    invoke-virtual {v2}, Lio/seon/androidsdk/service/p0;->l()Landroid/location/Location;

    move-result-object v0

    invoke-virtual {v0}, Landroid/location/Location;->getVerticalAccuracyMeters()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    goto :goto_11

    :catchall_6
    :goto_10
    move-object v0, v5

    goto :goto_11

    :catch_6
    move-exception v0

    sget-object v6, Lio/seon/androidsdk/service/g;->d:Lbu/c;

    invoke-virtual {v6, v4, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_10

    :goto_11
    const-string v6, "vertical_accuracy"

    invoke-virtual {v3, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_7
    invoke-virtual {v2}, Lio/seon/androidsdk/service/p0;->l()Landroid/location/Location;

    move-result-object v0

    invoke-virtual {v0}, Landroid/location/Location;->getTime()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    goto :goto_13

    :catchall_7
    :goto_12
    move-object v0, v5

    goto :goto_13

    :catch_7
    move-exception v0

    sget-object v6, Lio/seon/androidsdk/service/g;->d:Lbu/c;

    invoke-virtual {v6, v4, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_12

    :goto_13
    const-string v6, "timestamp"

    invoke-virtual {v3, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_8
    invoke-virtual {v2}, Lio/seon/androidsdk/service/p0;->l()Landroid/location/Location;

    move-result-object v0

    invoke-virtual {v0}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    goto :goto_16

    :catch_8
    move-exception v0

    goto :goto_15

    :catchall_8
    :goto_14
    move-object v0, v5

    goto :goto_16

    :goto_15
    sget-object v6, Lio/seon/androidsdk/service/g;->d:Lbu/c;

    invoke-virtual {v6, v4, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_14

    :goto_16
    const-string v6, "provider"

    invoke-virtual {v3, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_9
    iget-object v0, v2, Lio/seon/androidsdk/service/p0;->m:Landroid/location/Location;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v6

    invoke-virtual {v0}, Landroid/location/Location;->getElapsedRealtimeNanos()J

    move-result-wide v8

    sub-long/2addr v6, v8

    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v6, v7}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    goto :goto_18

    :catchall_9
    :goto_17
    move-object v0, v5

    goto :goto_18

    :catch_9
    move-exception v0

    sget-object v6, Lio/seon/androidsdk/service/g;->d:Lbu/c;

    invoke-virtual {v6, v4, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_17

    :goto_18
    const-string v6, "age_sec"

    invoke-virtual {v3, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_a
    iget-object v0, v2, Lio/seon/androidsdk/service/p0;->h:Landroid/location/LocationManager;

    if-nez v0, :cond_6

    iget-object v0, v2, Lio/seon/androidsdk/service/p0;->e:Ljava/util/ArrayList;

    :goto_19
    move-object v5, v0

    goto :goto_1a

    :cond_6
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/location/LocationManager;->getProviders(Z)Ljava/util/List;

    move-result-object v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    goto :goto_19

    :catch_a
    move-exception v0

    sget-object v2, Lio/seon/androidsdk/service/g;->d:Lbu/c;

    invoke-virtual {v2, v4, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    :catchall_a
    :goto_1a
    const-string v0, "providers_enabled"

    invoke-virtual {v3, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v3

    :pswitch_4
    iget-object v0, v1, Lio/seon/androidsdk/service/g0;->b:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/iterable/iterableapi/g1;

    const-string v3, "\n"

    const-string v4, "\\A"

    new-instance v0, Ljava/util/ArrayList;

    sget-object v5, Lox/a;->a:[Ljava/lang/String;

    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v2, v0}, Lcom/iterable/iterableapi/g1;->e(Ljava/util/ArrayList;)Z

    move-result v0

    if-nez v0, :cond_1c

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v6, Lox/a;->b:[Ljava/lang/String;

    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v2, v0}, Lcom/iterable/iterableapi/g1;->e(Ljava/util/ArrayList;)Z

    move-result v0

    if-nez v0, :cond_1c

    const-string v6, "su"

    invoke-static {v6}, Lcom/iterable/iterableapi/g1;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1c

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    const-string v0, "ro.debuggable"

    const-string v8, "1"

    invoke-virtual {v7, v0, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "ro.secure"

    const-string v8, "0"

    invoke-virtual {v7, v0, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_b
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    const-string v9, "getprop"

    invoke-virtual {v0, v9}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    if-nez v0, :cond_8

    :cond_7
    :goto_1b
    const/4 v0, 0x0

    goto :goto_1d

    :cond_8
    new-instance v9, Ljava/util/Scanner;

    invoke-direct {v9, v0}, Ljava/util/Scanner;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v9, v4}, Ljava/util/Scanner;->useDelimiter(Ljava/lang/String;)Ljava/util/Scanner;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Scanner;->next()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_c
    .catch Ljava/util/NoSuchElementException; {:try_start_b .. :try_end_b} :catch_b

    goto :goto_1d

    :catch_b
    move-exception v0

    goto :goto_1c

    :catch_c
    move-exception v0

    :goto_1c
    sget v9, Lce/w;->E:I

    if-lez v9, :cond_7

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_1b

    :goto_1d
    if-nez v0, :cond_9

    const/4 v12, 0x0

    goto :goto_20

    :cond_9
    array-length v10, v0

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_1e
    if-ge v11, v10, :cond_c

    aget-object v13, v0, v11

    invoke-virtual {v7}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v14

    invoke-interface {v14}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :cond_a
    :goto_1f
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_b

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-virtual {v13, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v16

    if-eqz v16, :cond_a

    invoke-virtual {v7, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v5, v16

    check-cast v5, Ljava/lang/String;

    const-string v8, "["

    const-string v9, "]"

    invoke-static {v8, v5, v9}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v13, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_a

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, " = "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " detected!"

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lce/w;->m0(Ljava/lang/String;)V

    const/4 v12, 0x1

    goto :goto_1f

    :cond_b
    add-int/lit8 v11, v11, 0x1

    goto :goto_1e

    :cond_c
    :goto_20
    if-nez v12, :cond_1c

    :try_start_c
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    const-string v5, "mount"

    invoke-virtual {v0, v5}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    if-nez v0, :cond_e

    :cond_d
    :goto_21
    const/4 v0, 0x0

    goto :goto_23

    :cond_e
    new-instance v5, Ljava/util/Scanner;

    invoke-direct {v5, v0}, Ljava/util/Scanner;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v5, v4}, Ljava/util/Scanner;->useDelimiter(Ljava/lang/String;)Ljava/util/Scanner;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Scanner;->next()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_e
    .catch Ljava/util/NoSuchElementException; {:try_start_c .. :try_end_c} :catch_d

    goto :goto_23

    :catch_d
    move-exception v0

    goto :goto_22

    :catch_e
    move-exception v0

    :goto_22
    sget v3, Lce/w;->E:I

    if-lez v3, :cond_d

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_21

    :goto_23
    if-nez v0, :cond_f

    const/4 v5, 0x0

    goto/16 :goto_29

    :cond_f
    array-length v3, v0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_24
    if-ge v4, v3, :cond_14

    aget-object v7, v0, v4

    const-string v8, " "

    invoke-virtual {v7, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    array-length v9, v8

    const/4 v10, 0x6

    if-ge v9, v10, :cond_11

    const-string v8, "Error formatting mount line: "

    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lce/w;->G(Ljava/io/Serializable;)V

    :cond_10
    move-object/from16 v17, v0

    goto :goto_28

    :cond_11
    const/4 v9, 0x2

    aget-object v9, v8, v9

    const/4 v10, 0x5

    aget-object v8, v8, v10

    const/4 v10, 0x0

    :goto_25
    const/4 v11, 0x7

    if-ge v10, v11, :cond_10

    sget-object v11, Lox/a;->d:[Ljava/lang/String;

    aget-object v11, v11, v10

    invoke-virtual {v9, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_13

    const-string v12, "("

    const-string v13, ""

    invoke-virtual {v8, v12, v13}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v8

    const-string v12, ")"

    invoke-virtual {v8, v12, v13}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v8

    const-string v12, ","

    invoke-virtual {v8, v12}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v12

    array-length v13, v12

    const/4 v14, 0x0

    :goto_26
    if-ge v14, v13, :cond_13

    aget-object v15, v12, v14

    move-object/from16 v17, v0

    const-string v0, "rw"

    invoke-virtual {v15, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_12

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " path is mounted with rw permissions! "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lce/w;->m0(Ljava/lang/String;)V

    const/4 v5, 0x1

    goto :goto_27

    :cond_12
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v0, v17

    goto :goto_26

    :cond_13
    move-object/from16 v17, v0

    :goto_27
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v0, v17

    goto :goto_25

    :goto_28
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v0, v17

    goto :goto_24

    :cond_14
    :goto_29
    if-nez v5, :cond_1c

    sget-object v0, Landroid/os/Build;->TAGS:Ljava/lang/String;

    if-eqz v0, :cond_15

    const-string v3, "test-keys"

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_15

    const/4 v0, 0x1

    goto :goto_2a

    :cond_15
    const/4 v0, 0x0

    :goto_2a
    if-nez v0, :cond_1c

    :try_start_d
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    const-string v3, "which"

    filled-new-array {v3, v6}, [Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Runtime;->exec([Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v8
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_b

    :try_start_e
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/InputStreamReader;

    invoke-virtual {v8}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_c

    if-eqz v0, :cond_16

    const/4 v0, 0x1

    goto :goto_2b

    :cond_16
    const/4 v0, 0x0

    :goto_2b
    invoke-virtual {v8}, Ljava/lang/Process;->destroy()V

    goto :goto_2c

    :catchall_b
    const/4 v8, 0x0

    :catchall_c
    if-eqz v8, :cond_17

    invoke-virtual {v8}, Ljava/lang/Process;->destroy()V

    :cond_17
    const/4 v0, 0x0

    :goto_2c
    if-nez v0, :cond_1c

    new-instance v0, Lcom/scottyab/rootbeer/RootBeerNative;

    sget-boolean v0, Lcom/scottyab/rootbeer/RootBeerNative;->a:Z

    if-nez v0, :cond_19

    const-string v0, "We could not load the native library to test for root"

    invoke-static {v0}, Lce/w;->G(Ljava/io/Serializable;)V

    :catch_f
    :cond_18
    const/4 v0, 0x0

    goto :goto_2e

    :cond_19
    invoke-static {}, Lox/a;->a()[Ljava/lang/String;

    move-result-object v0

    array-length v3, v0

    new-array v4, v3, [Ljava/lang/String;

    const/4 v5, 0x0

    :goto_2d
    if-ge v5, v3, :cond_1a

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v8, v0, v5

    invoke-static {v8, v6, v7}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_2d

    :cond_1a
    new-instance v0, Lcom/scottyab/rootbeer/RootBeerNative;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :try_start_f
    iget-boolean v2, v2, Lcom/iterable/iterableapi/g1;->w:Z

    invoke-virtual {v0, v2}, Lcom/scottyab/rootbeer/RootBeerNative;->setLogDebugMessages(Z)I

    invoke-virtual {v0, v4}, Lcom/scottyab/rootbeer/RootBeerNative;->checkForRoot([Ljava/lang/Object;)I

    move-result v0
    :try_end_f
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_f .. :try_end_f} :catch_f

    if-lez v0, :cond_18

    const/4 v0, 0x1

    :goto_2e
    if-nez v0, :cond_1c

    const-string v0, "magisk"

    invoke-static {v0}, Lcom/iterable/iterableapi/g1;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1b

    goto :goto_2f

    :cond_1b
    const/4 v5, 0x0

    goto :goto_30

    :cond_1c
    :goto_2f
    const/4 v5, 0x1

    :goto_30
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
