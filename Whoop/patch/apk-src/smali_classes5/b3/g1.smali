.class public abstract Lb3/g1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final A(Lr7/s;)Landroid/health/connect/datatypes/units/Length;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lr7/s;->a()D

    move-result-wide v0

    invoke-static {v0, v1}, Landroid/health/connect/datatypes/units/Length;->fromMeters(D)Landroid/health/connect/datatypes/units/Length;

    move-result-object p0

    const-string v0, "fromMeters(inMeters)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lr7/b0;->b()D

    move-result-wide v0

    invoke-static {v0, v1}, Landroid/health/connect/datatypes/units/Mass;->fromGrams(D)Landroid/health/connect/datatypes/units/Mass;

    move-result-object p0

    const-string v0, "fromGrams(inGrams)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/health/connect/datatypes/Metadata$Builder;

    invoke-direct {v0}, Landroid/health/connect/datatypes/Metadata$Builder;-><init>()V

    iget-object v1, p0, Ln7/c;->f:Ln7/b;

    if-eqz v1, :cond_2

    new-instance v2, Landroid/health/connect/datatypes/Device$Builder;

    invoke-direct {v2}, Landroid/health/connect/datatypes/Device$Builder;-><init>()V

    iget v3, v1, Ln7/b;->c:I

    invoke-virtual {v2, v3}, Landroid/health/connect/datatypes/Device$Builder;->setType(I)Landroid/health/connect/datatypes/Device$Builder;

    iget-object v3, v1, Ln7/b;->a:Ljava/lang/String;

    if-eqz v3, :cond_0

    invoke-virtual {v2, v3}, Landroid/health/connect/datatypes/Device$Builder;->setManufacturer(Ljava/lang/String;)Landroid/health/connect/datatypes/Device$Builder;

    :cond_0
    iget-object v1, v1, Ln7/b;->b:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {v2, v1}, Landroid/health/connect/datatypes/Device$Builder;->setModel(Ljava/lang/String;)Landroid/health/connect/datatypes/Device$Builder;

    :cond_1
    invoke-virtual {v2}, Landroid/health/connect/datatypes/Device$Builder;->build()Landroid/health/connect/datatypes/Device;

    move-result-object v1

    const-string v2, "PlatformDeviceBuilder()\n\u2026       }\n        .build()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/health/connect/datatypes/Metadata$Builder;->setDevice(Landroid/health/connect/datatypes/Device;)Landroid/health/connect/datatypes/Metadata$Builder;

    :cond_2
    iget-object v1, p0, Ln7/c;->c:Ljava/time/Instant;

    invoke-virtual {v0, v1}, Landroid/health/connect/datatypes/Metadata$Builder;->setLastModifiedTime(Ljava/time/Instant;)Landroid/health/connect/datatypes/Metadata$Builder;

    iget-object v1, p0, Ln7/c;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/health/connect/datatypes/Metadata$Builder;->setId(Ljava/lang/String;)Landroid/health/connect/datatypes/Metadata$Builder;

    iget-object v1, p0, Ln7/c;->b:Ln7/a;

    invoke-static {v1}, Lb3/g1;->y(Ln7/a;)Landroid/health/connect/datatypes/DataOrigin;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/health/connect/datatypes/Metadata$Builder;->setDataOrigin(Landroid/health/connect/datatypes/DataOrigin;)Landroid/health/connect/datatypes/Metadata$Builder;

    iget-object v1, p0, Ln7/c;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/health/connect/datatypes/Metadata$Builder;->setClientRecordId(Ljava/lang/String;)Landroid/health/connect/datatypes/Metadata$Builder;

    iget-wide v1, p0, Ln7/c;->e:J

    invoke-virtual {v0, v1, v2}, Landroid/health/connect/datatypes/Metadata$Builder;->setClientRecordVersion(J)Landroid/health/connect/datatypes/Metadata$Builder;

    iget p0, p0, Ln7/c;->g:I

    sget-object v1, Li7/a;->E:Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    goto :goto_0

    :cond_3
    const/4 p0, 0x0

    :goto_0
    invoke-virtual {v0, p0}, Landroid/health/connect/datatypes/Metadata$Builder;->setRecordingMethod(I)Landroid/health/connect/datatypes/Metadata$Builder;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/Metadata$Builder;->build()Landroid/health/connect/datatypes/Metadata;

    move-result-object p0

    const-string v0, "PlatformMetadataBuilder(\u2026       }\n        .build()"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final D(Lr7/h0;)Landroid/health/connect/datatypes/units/Power;
    .locals 2

    invoke-virtual {p0}, Lr7/h0;->a()D

    move-result-wide v0

    invoke-static {v0, v1}, Landroid/health/connect/datatypes/units/Power;->fromWatts(D)Landroid/health/connect/datatypes/units/Power;

    move-result-object p0

    const-string v0, "fromWatts(inWatts)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final E(Lj93/d;)Ljava/lang/Class;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li7/h;->a:Ljava/lang/Object;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported record type "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final F(Lr7/q0;)Landroid/health/connect/datatypes/units/Velocity;
    .locals 2

    invoke-virtual {p0}, Lr7/q0;->a()D

    move-result-wide v0

    invoke-static {v0, v1}, Landroid/health/connect/datatypes/units/Velocity;->fromMetersPerSecond(D)Landroid/health/connect/datatypes/units/Velocity;

    move-result-object p0

    const-string v0, "fromMetersPerSecond(inMetersPerSecond)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final G(Lm7/h1;)Landroid/health/connect/datatypes/WheelchairPushesRecord;
    .locals 7

    new-instance v0, Landroid/health/connect/datatypes/WheelchairPushesRecord$Builder;

    iget-object v0, p0, Lm7/h1;->f:Ln7/c;

    invoke-static {v0}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v2

    iget-object v3, p0, Lm7/h1;->a:Ljava/time/Instant;

    iget-object v4, p0, Lm7/h1;->c:Ljava/time/Instant;

    iget-wide v5, p0, Lm7/h1;->e:J

    new-instance v1, Landroid/health/connect/datatypes/WheelchairPushesRecord$Builder;

    invoke-direct/range {v1 .. v6}, Landroid/health/connect/datatypes/WheelchairPushesRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;J)V

    iget-object v0, p0, Lm7/h1;->b:Ljava/time/ZoneOffset;

    if-eqz v0, :cond_0

    invoke-virtual {v1, v0}, Landroid/health/connect/datatypes/WheelchairPushesRecord$Builder;->setStartZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/WheelchairPushesRecord$Builder;

    :cond_0
    iget-object p0, p0, Lm7/h1;->d:Ljava/time/ZoneOffset;

    if-eqz p0, :cond_1

    invoke-virtual {v1, p0}, Landroid/health/connect/datatypes/WheelchairPushesRecord$Builder;->setEndZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/WheelchairPushesRecord$Builder;

    :cond_1
    invoke-virtual {v1}, Landroid/health/connect/datatypes/WheelchairPushesRecord$Builder;->build()Landroid/health/connect/datatypes/WheelchairPushesRecord;

    move-result-object p0

    const-string v0, "PlatformWheelchairPushes\u2026       }\n        .build()"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final H(Landroid/health/connect/datatypes/units/Energy;)Lr7/k;
    .locals 3

    sget-object v0, Lr7/k;->y:Lr7/e;

    invoke-virtual {p0}, Landroid/health/connect/datatypes/units/Energy;->getInCalories()D

    move-result-wide v0

    new-instance p0, Lr7/k;

    sget-object v2, Lr7/j;->w:Lr7/f;

    invoke-direct {p0, v0, v1, v2}, Lr7/k;-><init>(DLr7/j;)V

    return-object p0
.end method

.method public static final I(Landroid/health/connect/datatypes/ExerciseRoute;)Lm7/r;
    .locals 14

    invoke-virtual {p0}, Landroid/health/connect/datatypes/ExerciseRoute;->getRouteLocations()Ljava/util/List;

    move-result-object p0

    const-string v0, "routeLocations"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/health/connect/datatypes/ExerciseRoute$Location;

    new-instance v2, Lm7/q;

    invoke-virtual {v1}, Landroid/health/connect/datatypes/ExerciseRoute$Location;->getTime()Ljava/time/Instant;

    move-result-object v3

    const-string v4, "value.time"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/health/connect/datatypes/ExerciseRoute$Location;->getLatitude()D

    move-result-wide v4

    invoke-virtual {v1}, Landroid/health/connect/datatypes/ExerciseRoute$Location;->getLongitude()D

    move-result-wide v6

    invoke-virtual {v1}, Landroid/health/connect/datatypes/ExerciseRoute$Location;->getHorizontalAccuracy()Landroid/health/connect/datatypes/units/Length;

    move-result-object v8

    const/4 v9, 0x0

    if-eqz v8, :cond_0

    sget-object v10, Lr7/s;->y:Lr7/l;

    invoke-virtual {v8}, Landroid/health/connect/datatypes/units/Length;->getInMeters()D

    move-result-wide v10

    invoke-static {v10, v11}, Lr7/l;->a(D)Lr7/s;

    move-result-object v8

    goto :goto_1

    :cond_0
    move-object v8, v9

    :goto_1
    invoke-virtual {v1}, Landroid/health/connect/datatypes/ExerciseRoute$Location;->getVerticalAccuracy()Landroid/health/connect/datatypes/units/Length;

    move-result-object v10

    if-eqz v10, :cond_1

    sget-object v11, Lr7/s;->y:Lr7/l;

    invoke-virtual {v10}, Landroid/health/connect/datatypes/units/Length;->getInMeters()D

    move-result-wide v10

    invoke-static {v10, v11}, Lr7/l;->a(D)Lr7/s;

    move-result-object v10

    goto :goto_2

    :cond_1
    move-object v10, v9

    :goto_2
    invoke-virtual {v1}, Landroid/health/connect/datatypes/ExerciseRoute$Location;->getAltitude()Landroid/health/connect/datatypes/units/Length;

    move-result-object v1

    if-eqz v1, :cond_2

    sget-object v9, Lr7/s;->y:Lr7/l;

    invoke-virtual {v1}, Landroid/health/connect/datatypes/units/Length;->getInMeters()D

    move-result-wide v11

    invoke-static {v11, v12}, Lr7/l;->a(D)Lr7/s;

    move-result-object v9

    :cond_2
    move-object v13, v10

    move-object v10, v9

    move-object v9, v13

    invoke-direct/range {v2 .. v10}, Lm7/q;-><init>(Ljava/time/Instant;DDLr7/s;Lr7/s;Lr7/s;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    new-instance p0, Lm7/r;

    invoke-direct {p0, v0}, Lm7/r;-><init>(Ljava/util/ArrayList;)V

    return-object p0
.end method

.method public static final J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;
    .locals 10

    invoke-virtual {p0}, Landroid/health/connect/datatypes/Metadata;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Landroid/health/connect/datatypes/Metadata;->getDataOrigin()Landroid/health/connect/datatypes/DataOrigin;

    move-result-object v0

    const-string v2, "dataOrigin"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ln7/a;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/DataOrigin;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v3, "packageName"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v0}, Ln7/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/health/connect/datatypes/Metadata;->getLastModifiedTime()Ljava/time/Instant;

    move-result-object v3

    invoke-virtual {p0}, Landroid/health/connect/datatypes/Metadata;->getClientRecordId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Landroid/health/connect/datatypes/Metadata;->getClientRecordVersion()J

    move-result-wide v5

    invoke-virtual {p0}, Landroid/health/connect/datatypes/Metadata;->getRecordingMethod()I

    move-result v0

    sget-object v7, Li7/a;->F:Ljava/util/LinkedHashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_0
    move v8, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, Landroid/health/connect/datatypes/Metadata;->getDevice()Landroid/health/connect/datatypes/Device;

    move-result-object p0

    const-string v0, "device"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Ln7/b;

    invoke-virtual {p0}, Landroid/health/connect/datatypes/Device;->getManufacturer()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroid/health/connect/datatypes/Device;->getModel()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p0}, Landroid/health/connect/datatypes/Device;->getType()I

    move-result p0

    invoke-direct {v7, v0, v9, p0}, Ln7/b;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    new-instance v0, Ln7/c;

    const-string p0, "id"

    invoke-static {v1, p0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "lastModifiedTime"

    invoke-static {v3, p0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {v0 .. v8}, Ln7/c;-><init>(Ljava/lang/String;Ln7/a;Ljava/time/Instant;Ljava/lang/String;JLn7/b;I)V

    return-object v0
.end method

.method public static final K(Landroid/health/connect/datatypes/Record;)Lm7/r0;
    .locals 64

    move-object/from16 v0, p0

    instance-of v1, v0, Landroid/health/connect/datatypes/ActiveCaloriesBurnedRecord;

    const-string v2, "energy"

    const-string v3, "endTime"

    const-string v4, "startTime"

    const-string v5, "metadata"

    if-eqz v1, :cond_0

    check-cast v0, Landroid/health/connect/datatypes/ActiveCaloriesBurnedRecord;

    new-instance v6, Lm7/a;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/ActiveCaloriesBurnedRecord;->getStartTime()Ljava/time/Instant;

    move-result-object v7

    invoke-static {v7, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/ActiveCaloriesBurnedRecord;->getStartZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v8

    invoke-virtual {v0}, Landroid/health/connect/datatypes/ActiveCaloriesBurnedRecord;->getEndTime()Ljava/time/Instant;

    move-result-object v9

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/ActiveCaloriesBurnedRecord;->getEndZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v10

    invoke-virtual {v0}, Landroid/health/connect/datatypes/ActiveCaloriesBurnedRecord;->getEnergy()Landroid/health/connect/datatypes/units/Energy;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lb3/g1;->H(Landroid/health/connect/datatypes/units/Energy;)Lr7/k;

    move-result-object v11

    invoke-virtual {v0}, Landroid/health/connect/datatypes/ActiveCaloriesBurnedRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v12

    invoke-direct/range {v6 .. v12}, Lm7/a;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/k;Ln7/c;)V

    return-object v6

    :cond_0
    instance-of v1, v0, Landroid/health/connect/datatypes/BasalBodyTemperatureRecord;

    const-string v6, "temperature"

    const-string v7, "time"

    if-eqz v1, :cond_1

    check-cast v0, Landroid/health/connect/datatypes/BasalBodyTemperatureRecord;

    new-instance v8, Lm7/b;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BasalBodyTemperatureRecord;->getTime()Ljava/time/Instant;

    move-result-object v9

    invoke-static {v9, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BasalBodyTemperatureRecord;->getZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v10

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BasalBodyTemperatureRecord;->getTemperature()Landroid/health/connect/datatypes/units/Temperature;

    move-result-object v1

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/health/connect/datatypes/units/Temperature;->getInCelsius()D

    move-result-wide v1

    new-instance v11, Lr7/k0;

    invoke-direct {v11, v1, v2}, Lr7/k0;-><init>(D)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BasalBodyTemperatureRecord;->getMeasurementLocation()I

    move-result v12

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BasalBodyTemperatureRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v13

    invoke-direct/range {v8 .. v13}, Lm7/b;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/k0;ILn7/c;)V

    return-object v8

    :cond_1
    instance-of v1, v0, Landroid/health/connect/datatypes/BasalMetabolicRateRecord;

    if-eqz v1, :cond_2

    check-cast v0, Landroid/health/connect/datatypes/BasalMetabolicRateRecord;

    new-instance v1, Lm7/c;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BasalMetabolicRateRecord;->getTime()Ljava/time/Instant;

    move-result-object v2

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BasalMetabolicRateRecord;->getZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v3

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BasalMetabolicRateRecord;->getBasalMetabolicRate()Landroid/health/connect/datatypes/units/Power;

    move-result-object v4

    const-string v6, "basalMetabolicRate"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lr7/h0;->y:Lr7/d0;

    invoke-virtual {v4}, Landroid/health/connect/datatypes/units/Power;->getInWatts()D

    move-result-wide v6

    invoke-static {v6, v7}, Lr7/d0;->a(D)Lr7/h0;

    move-result-object v4

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BasalMetabolicRateRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v0

    invoke-direct {v1, v2, v3, v4, v0}, Lm7/c;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/h0;Ln7/c;)V

    return-object v1

    :cond_2
    instance-of v1, v0, Landroid/health/connect/datatypes/BloodGlucoseRecord;

    const/4 v8, 0x0

    if-eqz v1, :cond_6

    check-cast v0, Landroid/health/connect/datatypes/BloodGlucoseRecord;

    new-instance v9, Lm7/d;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BloodGlucoseRecord;->getTime()Ljava/time/Instant;

    move-result-object v10

    invoke-static {v10, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BloodGlucoseRecord;->getZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v11

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BloodGlucoseRecord;->getLevel()Landroid/health/connect/datatypes/units/BloodGlucose;

    move-result-object v1

    const-string v2, "level"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lr7/d;->y:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Landroid/health/connect/datatypes/units/BloodGlucose;->getInMillimolesPerLiter()D

    move-result-wide v1

    invoke-static {v1, v2}, Lds/q;->D(D)Lr7/d;

    move-result-object v12

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BloodGlucoseRecord;->getSpecimenSource()I

    move-result v1

    sget-object v2, Li7/a;->x:Ljava/util/LinkedHashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    move v13, v1

    goto :goto_0

    :cond_3
    move v13, v8

    :goto_0
    invoke-virtual {v0}, Landroid/health/connect/datatypes/BloodGlucoseRecord;->getMealType()I

    move-result v1

    sget-object v2, Li7/a;->h:Ljava/util/LinkedHashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    move v14, v1

    goto :goto_1

    :cond_4
    move v14, v8

    :goto_1
    invoke-virtual {v0}, Landroid/health/connect/datatypes/BloodGlucoseRecord;->getRelationToMeal()I

    move-result v1

    sget-object v2, Li7/a;->z:Ljava/util/LinkedHashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v8

    :cond_5
    move v15, v8

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BloodGlucoseRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v16

    invoke-direct/range {v9 .. v16}, Lm7/d;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/d;IIILn7/c;)V

    return-object v9

    :cond_6
    instance-of v1, v0, Landroid/health/connect/datatypes/BloodPressureRecord;

    if-eqz v1, :cond_9

    check-cast v0, Landroid/health/connect/datatypes/BloodPressureRecord;

    new-instance v9, Lm7/e;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BloodPressureRecord;->getTime()Ljava/time/Instant;

    move-result-object v10

    invoke-static {v10, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BloodPressureRecord;->getZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v11

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BloodPressureRecord;->getSystolic()Landroid/health/connect/datatypes/units/Pressure;

    move-result-object v1

    const-string v2, "systolic"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/health/connect/datatypes/units/Pressure;->getInMillimetersOfMercury()D

    move-result-wide v1

    new-instance v12, Lr7/j0;

    invoke-direct {v12, v1, v2}, Lr7/j0;-><init>(D)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BloodPressureRecord;->getDiastolic()Landroid/health/connect/datatypes/units/Pressure;

    move-result-object v1

    const-string v2, "diastolic"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/health/connect/datatypes/units/Pressure;->getInMillimetersOfMercury()D

    move-result-wide v1

    new-instance v13, Lr7/j0;

    invoke-direct {v13, v1, v2}, Lr7/j0;-><init>(D)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BloodPressureRecord;->getBodyPosition()I

    move-result v1

    sget-object v2, Li7/a;->d:Ljava/util/LinkedHashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    move v14, v1

    goto :goto_2

    :cond_7
    move v14, v8

    :goto_2
    invoke-virtual {v0}, Landroid/health/connect/datatypes/BloodPressureRecord;->getMeasurementLocation()I

    move-result v1

    sget-object v2, Li7/a;->p:Ljava/util/LinkedHashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v8

    :cond_8
    move v15, v8

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BloodPressureRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v16

    invoke-direct/range {v9 .. v16}, Lm7/e;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/j0;Lr7/j0;IILn7/c;)V

    return-object v9

    :cond_9
    instance-of v1, v0, Landroid/health/connect/datatypes/BodyFatRecord;

    const-string v9, "percentage"

    if-eqz v1, :cond_a

    check-cast v0, Landroid/health/connect/datatypes/BodyFatRecord;

    new-instance v1, Lm7/f;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BodyFatRecord;->getTime()Ljava/time/Instant;

    move-result-object v2

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BodyFatRecord;->getZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v3

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BodyFatRecord;->getPercentage()Landroid/health/connect/datatypes/units/Percentage;

    move-result-object v4

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lr7/c0;

    invoke-virtual {v4}, Landroid/health/connect/datatypes/units/Percentage;->getValue()D

    move-result-wide v7

    invoke-direct {v6, v7, v8}, Lr7/c0;-><init>(D)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BodyFatRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v0

    invoke-direct {v1, v2, v3, v6, v0}, Lm7/f;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/c0;Ln7/c;)V

    return-object v1

    :cond_a
    instance-of v1, v0, Landroid/health/connect/datatypes/BodyTemperatureRecord;

    if-eqz v1, :cond_c

    check-cast v0, Landroid/health/connect/datatypes/BodyTemperatureRecord;

    new-instance v9, Lm7/h;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BodyTemperatureRecord;->getTime()Ljava/time/Instant;

    move-result-object v10

    invoke-static {v10, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BodyTemperatureRecord;->getZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v11

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BodyTemperatureRecord;->getTemperature()Landroid/health/connect/datatypes/units/Temperature;

    move-result-object v1

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/health/connect/datatypes/units/Temperature;->getInCelsius()D

    move-result-wide v1

    new-instance v12, Lr7/k0;

    invoke-direct {v12, v1, v2}, Lr7/k0;-><init>(D)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BodyTemperatureRecord;->getMeasurementLocation()I

    move-result v1

    sget-object v2, Li7/a;->n:Ljava/util/LinkedHashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v8

    :cond_b
    move v13, v8

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BodyTemperatureRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v14

    invoke-direct/range {v9 .. v14}, Lm7/h;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/k0;ILn7/c;)V

    return-object v9

    :cond_c
    instance-of v1, v0, Landroid/health/connect/datatypes/BodyWaterMassRecord;

    if-eqz v1, :cond_d

    check-cast v0, Landroid/health/connect/datatypes/BodyWaterMassRecord;

    new-instance v1, Lm7/i;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BodyWaterMassRecord;->getTime()Ljava/time/Instant;

    move-result-object v2

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BodyWaterMassRecord;->getZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v3

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BodyWaterMassRecord;->getBodyWaterMass()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v4

    const-string v6, "bodyWaterMass"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v4}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v6

    invoke-static {v6, v7}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v4

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BodyWaterMassRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v0

    invoke-direct {v1, v2, v3, v4, v0}, Lm7/i;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/b0;Ln7/c;)V

    return-object v1

    :cond_d
    instance-of v1, v0, Landroid/health/connect/datatypes/BoneMassRecord;

    const-string v6, "mass"

    if-eqz v1, :cond_e

    check-cast v0, Landroid/health/connect/datatypes/BoneMassRecord;

    new-instance v1, Lm7/j;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BoneMassRecord;->getTime()Ljava/time/Instant;

    move-result-object v2

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BoneMassRecord;->getZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v3

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BoneMassRecord;->getMass()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v4

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v4}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v6

    invoke-static {v6, v7}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v4

    invoke-virtual {v0}, Landroid/health/connect/datatypes/BoneMassRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v0

    invoke-direct {v1, v2, v3, v4, v0}, Lm7/j;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/b0;Ln7/c;)V

    return-object v1

    :cond_e
    instance-of v1, v0, Landroid/health/connect/datatypes/CervicalMucusRecord;

    if-eqz v1, :cond_11

    check-cast v0, Landroid/health/connect/datatypes/CervicalMucusRecord;

    new-instance v9, Lm7/k;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/CervicalMucusRecord;->getTime()Ljava/time/Instant;

    move-result-object v10

    invoke-static {v10, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/CervicalMucusRecord;->getZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v11

    invoke-virtual {v0}, Landroid/health/connect/datatypes/CervicalMucusRecord;->getAppearance()I

    move-result v1

    sget-object v2, Li7/a;->b:Ljava/util/LinkedHashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_f

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    move v12, v1

    goto :goto_3

    :cond_f
    move v12, v8

    :goto_3
    invoke-virtual {v0}, Landroid/health/connect/datatypes/CervicalMucusRecord;->getSensation()I

    move-result v1

    sget-object v2, Li7/a;->t:Ljava/util/LinkedHashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_10

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v8

    :cond_10
    move v13, v8

    invoke-virtual {v0}, Landroid/health/connect/datatypes/CervicalMucusRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v14

    invoke-direct/range {v9 .. v14}, Lm7/k;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;IILn7/c;)V

    return-object v9

    :cond_11
    instance-of v1, v0, Landroid/health/connect/datatypes/CyclingPedalingCadenceRecord;

    const-string v10, "samples"

    const-string v11, "it"

    const/16 v12, 0xa

    if-eqz v1, :cond_13

    check-cast v0, Landroid/health/connect/datatypes/CyclingPedalingCadenceRecord;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/CyclingPedalingCadenceRecord;->getStartTime()Ljava/time/Instant;

    move-result-object v14

    invoke-static {v14, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/CyclingPedalingCadenceRecord;->getStartZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v15

    invoke-virtual {v0}, Landroid/health/connect/datatypes/CyclingPedalingCadenceRecord;->getEndTime()Ljava/time/Instant;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/CyclingPedalingCadenceRecord;->getEndZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v17

    invoke-virtual {v0}, Landroid/health/connect/datatypes/CyclingPedalingCadenceRecord;->getSamples()Ljava/util/List;

    move-result-object v2

    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v2, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_12

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/health/connect/datatypes/CyclingPedalingCadenceRecord$CyclingPedalingCadenceRecordSample;

    invoke-static {v4, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lm7/l;

    invoke-virtual {v4}, Landroid/health/connect/datatypes/CyclingPedalingCadenceRecord$CyclingPedalingCadenceRecordSample;->getTime()Ljava/time/Instant;

    move-result-object v8

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Landroid/health/connect/datatypes/CyclingPedalingCadenceRecord$CyclingPedalingCadenceRecordSample;->getRevolutionsPerMinute()D

    move-result-wide v9

    invoke-direct {v6, v9, v10, v8}, Lm7/l;-><init>(DLjava/time/Instant;)V

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_12
    new-instance v2, Lb2/d;

    const/4 v4, 0x6

    invoke-direct {v2, v4}, Lb2/d;-><init>(I)V

    invoke-static {v3, v2}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v18

    invoke-virtual {v0}, Landroid/health/connect/datatypes/CyclingPedalingCadenceRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v19

    new-instance v13, Lm7/m;

    move-object/from16 v16, v1

    invoke-direct/range {v13 .. v19}, Lm7/m;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/util/List;Ln7/c;)V

    return-object v13

    :cond_13
    instance-of v1, v0, Landroid/health/connect/datatypes/DistanceRecord;

    if-eqz v1, :cond_14

    check-cast v0, Landroid/health/connect/datatypes/DistanceRecord;

    new-instance v6, Lm7/n;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/DistanceRecord;->getStartTime()Ljava/time/Instant;

    move-result-object v7

    invoke-static {v7, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/DistanceRecord;->getStartZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v8

    invoke-virtual {v0}, Landroid/health/connect/datatypes/DistanceRecord;->getEndTime()Ljava/time/Instant;

    move-result-object v9

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/DistanceRecord;->getEndZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v10

    invoke-virtual {v0}, Landroid/health/connect/datatypes/DistanceRecord;->getDistance()Landroid/health/connect/datatypes/units/Length;

    move-result-object v1

    const-string v2, "distance"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lr7/s;->y:Lr7/l;

    invoke-virtual {v1}, Landroid/health/connect/datatypes/units/Length;->getInMeters()D

    move-result-wide v1

    invoke-static {v1, v2}, Lr7/l;->a(D)Lr7/s;

    move-result-object v11

    invoke-virtual {v0}, Landroid/health/connect/datatypes/DistanceRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v12

    invoke-direct/range {v6 .. v12}, Lm7/n;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/s;Ln7/c;)V

    return-object v6

    :cond_14
    instance-of v1, v0, Landroid/health/connect/datatypes/ElevationGainedRecord;

    if-eqz v1, :cond_15

    check-cast v0, Landroid/health/connect/datatypes/ElevationGainedRecord;

    new-instance v6, Lm7/o;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/ElevationGainedRecord;->getStartTime()Ljava/time/Instant;

    move-result-object v7

    invoke-static {v7, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/ElevationGainedRecord;->getStartZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v8

    invoke-virtual {v0}, Landroid/health/connect/datatypes/ElevationGainedRecord;->getEndTime()Ljava/time/Instant;

    move-result-object v9

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/ElevationGainedRecord;->getEndZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v10

    invoke-virtual {v0}, Landroid/health/connect/datatypes/ElevationGainedRecord;->getElevation()Landroid/health/connect/datatypes/units/Length;

    move-result-object v1

    const-string v2, "elevation"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lr7/s;->y:Lr7/l;

    invoke-virtual {v1}, Landroid/health/connect/datatypes/units/Length;->getInMeters()D

    move-result-wide v1

    invoke-static {v1, v2}, Lr7/l;->a(D)Lr7/s;

    move-result-object v11

    invoke-virtual {v0}, Landroid/health/connect/datatypes/ElevationGainedRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v12

    invoke-direct/range {v6 .. v12}, Lm7/o;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/s;Ln7/c;)V

    return-object v6

    :cond_15
    instance-of v1, v0, Landroid/health/connect/datatypes/ExerciseSessionRecord;

    const/4 v13, 0x0

    if-eqz v1, :cond_1f

    check-cast v0, Landroid/health/connect/datatypes/ExerciseSessionRecord;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/ExerciseSessionRecord;->getStartTime()Ljava/time/Instant;

    move-result-object v15

    invoke-virtual {v0}, Landroid/health/connect/datatypes/ExerciseSessionRecord;->getStartZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v16

    invoke-virtual {v0}, Landroid/health/connect/datatypes/ExerciseSessionRecord;->getEndTime()Ljava/time/Instant;

    move-result-object v1

    invoke-virtual {v0}, Landroid/health/connect/datatypes/ExerciseSessionRecord;->getEndZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v18

    invoke-virtual {v0}, Landroid/health/connect/datatypes/ExerciseSessionRecord;->getExerciseType()I

    move-result v2

    sget-object v6, Li7/a;->f:Ljava/util/LinkedHashMap;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_16

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    move/from16 v19, v2

    goto :goto_5

    :cond_16
    move/from16 v19, v8

    :goto_5
    invoke-virtual {v0}, Landroid/health/connect/datatypes/ExerciseSessionRecord;->getTitle()Ljava/lang/CharSequence;

    move-result-object v2

    if-eqz v2, :cond_17

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v20, v2

    goto :goto_6

    :cond_17
    move-object/from16 v20, v13

    :goto_6
    invoke-virtual {v0}, Landroid/health/connect/datatypes/ExerciseSessionRecord;->getNotes()Ljava/lang/CharSequence;

    move-result-object v2

    if-eqz v2, :cond_18

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v21, v2

    goto :goto_7

    :cond_18
    move-object/from16 v21, v13

    :goto_7
    invoke-virtual {v0}, Landroid/health/connect/datatypes/ExerciseSessionRecord;->getLaps()Ljava/util/List;

    move-result-object v2

    const-string v6, "laps"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v2, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/health/connect/datatypes/ExerciseLap;

    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v9, Lm7/p;

    invoke-virtual {v7}, Landroid/health/connect/datatypes/ExerciseLap;->getStartTime()Ljava/time/Instant;

    move-result-object v10

    invoke-static {v10, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7}, Landroid/health/connect/datatypes/ExerciseLap;->getEndTime()Ljava/time/Instant;

    move-result-object v14

    invoke-static {v14, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7}, Landroid/health/connect/datatypes/ExerciseLap;->getLength()Landroid/health/connect/datatypes/units/Length;

    move-result-object v7

    if-eqz v7, :cond_19

    sget-object v17, Lr7/s;->y:Lr7/l;

    invoke-virtual {v7}, Landroid/health/connect/datatypes/units/Length;->getInMeters()D

    move-result-wide v22

    invoke-static/range {v22 .. v23}, Lr7/l;->a(D)Lr7/s;

    move-result-object v7

    goto :goto_9

    :cond_19
    move-object v7, v13

    :goto_9
    invoke-direct {v9, v10, v14, v7}, Lm7/p;-><init>(Ljava/time/Instant;Ljava/time/Instant;Lr7/s;)V

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_1a
    new-instance v2, Lb2/d;

    const/4 v7, 0x7

    invoke-direct {v2, v7}, Lb2/d;-><init>(I)V

    invoke-static {v6, v2}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v24

    invoke-virtual {v0}, Landroid/health/connect/datatypes/ExerciseSessionRecord;->getSegments()Ljava/util/List;

    move-result-object v2

    const-string v6, "segments"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v2, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/health/connect/datatypes/ExerciseSegment;

    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v9, Lm7/v;

    invoke-virtual {v7}, Landroid/health/connect/datatypes/ExerciseSegment;->getStartTime()Ljava/time/Instant;

    move-result-object v10

    invoke-static {v10, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7}, Landroid/health/connect/datatypes/ExerciseSegment;->getEndTime()Ljava/time/Instant;

    move-result-object v12

    invoke-static {v12, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7}, Landroid/health/connect/datatypes/ExerciseSegment;->getSegmentType()I

    move-result v13

    sget-object v14, Li7/a;->D:Ljava/util/LinkedHashMap;

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v14, v13}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Integer;

    if-eqz v13, :cond_1b

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v13

    goto :goto_b

    :cond_1b
    move v13, v8

    :goto_b
    invoke-virtual {v7}, Landroid/health/connect/datatypes/ExerciseSegment;->getRepetitionsCount()I

    move-result v7

    invoke-direct {v9, v10, v12, v13, v7}, Lm7/v;-><init>(Ljava/time/Instant;Ljava/time/Instant;II)V

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_1c
    new-instance v2, Lb2/d;

    const/16 v7, 0x8

    invoke-direct {v2, v7}, Lb2/d;-><init>(I)V

    invoke-static {v6, v2}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v23

    invoke-virtual {v0}, Landroid/health/connect/datatypes/ExerciseSessionRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v2

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v22

    invoke-virtual {v0}, Landroid/health/connect/datatypes/ExerciseSessionRecord;->getRoute()Landroid/health/connect/datatypes/ExerciseRoute;

    move-result-object v2

    if-eqz v2, :cond_1d

    new-instance v0, Lm7/t;

    invoke-static {v2}, Lb3/g1;->I(Landroid/health/connect/datatypes/ExerciseRoute;)Lm7/r;

    move-result-object v2

    invoke-direct {v0, v2}, Lm7/t;-><init>(Lm7/r;)V

    :goto_c
    move-object/from16 v25, v0

    goto :goto_d

    :cond_1d
    invoke-virtual {v0}, Landroid/health/connect/datatypes/ExerciseSessionRecord;->hasRoute()Z

    move-result v0

    if-eqz v0, :cond_1e

    new-instance v0, Lm7/s;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_c

    :cond_1e
    new-instance v0, Lm7/u;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_c

    :goto_d
    new-instance v14, Lm7/w;

    invoke-static {v15, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v17, v1

    invoke-direct/range {v14 .. v25}, Lm7/w;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;ILjava/lang/String;Ljava/lang/String;Ln7/c;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/j;)V

    return-object v14

    :cond_1f
    instance-of v1, v0, Landroid/health/connect/datatypes/FloorsClimbedRecord;

    if-eqz v1, :cond_20

    check-cast v0, Landroid/health/connect/datatypes/FloorsClimbedRecord;

    new-instance v6, Lm7/x;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/FloorsClimbedRecord;->getStartTime()Ljava/time/Instant;

    move-result-object v7

    invoke-static {v7, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/FloorsClimbedRecord;->getStartZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v8

    invoke-virtual {v0}, Landroid/health/connect/datatypes/FloorsClimbedRecord;->getEndTime()Ljava/time/Instant;

    move-result-object v9

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/FloorsClimbedRecord;->getEndZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v10

    invoke-virtual {v0}, Landroid/health/connect/datatypes/FloorsClimbedRecord;->getFloors()D

    move-result-wide v11

    invoke-virtual {v0}, Landroid/health/connect/datatypes/FloorsClimbedRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v13

    invoke-direct/range {v6 .. v13}, Lm7/x;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;DLn7/c;)V

    return-object v6

    :cond_20
    instance-of v1, v0, Landroid/health/connect/datatypes/HeartRateRecord;

    if-eqz v1, :cond_22

    check-cast v0, Landroid/health/connect/datatypes/HeartRateRecord;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/HeartRateRecord;->getStartTime()Ljava/time/Instant;

    move-result-object v14

    invoke-static {v14, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/HeartRateRecord;->getStartZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v15

    invoke-virtual {v0}, Landroid/health/connect/datatypes/HeartRateRecord;->getEndTime()Ljava/time/Instant;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/HeartRateRecord;->getEndZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v17

    invoke-virtual {v0}, Landroid/health/connect/datatypes/HeartRateRecord;->getSamples()Ljava/util/List;

    move-result-object v2

    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v2, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_21

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/health/connect/datatypes/HeartRateRecord$HeartRateSample;

    invoke-static {v4, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lm7/y;

    invoke-virtual {v4}, Landroid/health/connect/datatypes/HeartRateRecord$HeartRateSample;->getTime()Ljava/time/Instant;

    move-result-object v8

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Landroid/health/connect/datatypes/HeartRateRecord$HeartRateSample;->getBeatsPerMinute()J

    move-result-wide v9

    invoke-direct {v6, v9, v10, v8}, Lm7/y;-><init>(JLjava/time/Instant;)V

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_21
    new-instance v2, Lb2/d;

    const/16 v4, 0x9

    invoke-direct {v2, v4}, Lb2/d;-><init>(I)V

    invoke-static {v3, v2}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v18

    invoke-virtual {v0}, Landroid/health/connect/datatypes/HeartRateRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v19

    new-instance v13, Lm7/z;

    move-object/from16 v16, v1

    invoke-direct/range {v13 .. v19}, Lm7/z;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/util/List;Ln7/c;)V

    return-object v13

    :cond_22
    instance-of v1, v0, Landroid/health/connect/datatypes/HeartRateVariabilityRmssdRecord;

    if-eqz v1, :cond_23

    check-cast v0, Landroid/health/connect/datatypes/HeartRateVariabilityRmssdRecord;

    new-instance v8, Lm7/a0;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/HeartRateVariabilityRmssdRecord;->getTime()Ljava/time/Instant;

    move-result-object v9

    invoke-static {v9, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/HeartRateVariabilityRmssdRecord;->getZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v10

    invoke-virtual {v0}, Landroid/health/connect/datatypes/HeartRateVariabilityRmssdRecord;->getHeartRateVariabilityMillis()D

    move-result-wide v11

    invoke-virtual {v0}, Landroid/health/connect/datatypes/HeartRateVariabilityRmssdRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v13

    invoke-direct/range {v8 .. v13}, Lm7/a0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;DLn7/c;)V

    return-object v8

    :cond_23
    instance-of v1, v0, Landroid/health/connect/datatypes/HeightRecord;

    if-eqz v1, :cond_24

    check-cast v0, Landroid/health/connect/datatypes/HeightRecord;

    new-instance v1, Lm7/b0;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/HeightRecord;->getTime()Ljava/time/Instant;

    move-result-object v2

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/HeightRecord;->getZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v3

    invoke-virtual {v0}, Landroid/health/connect/datatypes/HeightRecord;->getHeight()Landroid/health/connect/datatypes/units/Length;

    move-result-object v4

    const-string v6, "height"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lr7/s;->y:Lr7/l;

    invoke-virtual {v4}, Landroid/health/connect/datatypes/units/Length;->getInMeters()D

    move-result-wide v6

    invoke-static {v6, v7}, Lr7/l;->a(D)Lr7/s;

    move-result-object v4

    invoke-virtual {v0}, Landroid/health/connect/datatypes/HeightRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v0

    invoke-direct {v1, v2, v3, v4, v0}, Lm7/b0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/s;Ln7/c;)V

    return-object v1

    :cond_24
    instance-of v1, v0, Landroid/health/connect/datatypes/HydrationRecord;

    if-eqz v1, :cond_25

    check-cast v0, Landroid/health/connect/datatypes/HydrationRecord;

    new-instance v6, Lm7/d0;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/HydrationRecord;->getStartTime()Ljava/time/Instant;

    move-result-object v7

    invoke-static {v7, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/HydrationRecord;->getStartZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v8

    invoke-virtual {v0}, Landroid/health/connect/datatypes/HydrationRecord;->getEndTime()Ljava/time/Instant;

    move-result-object v9

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/HydrationRecord;->getEndZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v10

    invoke-virtual {v0}, Landroid/health/connect/datatypes/HydrationRecord;->getVolume()Landroid/health/connect/datatypes/units/Volume;

    move-result-object v1

    const-string v2, "volume"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lr7/w0;->y:Lr7/r0;

    invoke-virtual {v1}, Landroid/health/connect/datatypes/units/Volume;->getInLiters()D

    move-result-wide v1

    new-instance v11, Lr7/w0;

    sget-object v3, Lr7/v0;->w:Lr7/t0;

    invoke-direct {v11, v1, v2, v3}, Lr7/w0;-><init>(DLr7/v0;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/HydrationRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v12

    invoke-direct/range {v6 .. v12}, Lm7/d0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/w0;Ln7/c;)V

    return-object v6

    :cond_25
    instance-of v1, v0, Landroid/health/connect/datatypes/IntermenstrualBleedingRecord;

    if-eqz v1, :cond_26

    check-cast v0, Landroid/health/connect/datatypes/IntermenstrualBleedingRecord;

    new-instance v1, Lm7/f0;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/IntermenstrualBleedingRecord;->getTime()Ljava/time/Instant;

    move-result-object v2

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/IntermenstrualBleedingRecord;->getZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v3

    invoke-virtual {v0}, Landroid/health/connect/datatypes/IntermenstrualBleedingRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v0

    invoke-direct {v1, v2, v3, v0}, Lm7/f0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ln7/c;)V

    return-object v1

    :cond_26
    instance-of v1, v0, Landroid/health/connect/datatypes/LeanBodyMassRecord;

    if-eqz v1, :cond_27

    check-cast v0, Landroid/health/connect/datatypes/LeanBodyMassRecord;

    new-instance v1, Lm7/h0;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/LeanBodyMassRecord;->getTime()Ljava/time/Instant;

    move-result-object v2

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/LeanBodyMassRecord;->getZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v3

    invoke-virtual {v0}, Landroid/health/connect/datatypes/LeanBodyMassRecord;->getMass()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v4

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v4}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v6

    invoke-static {v6, v7}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v4

    invoke-virtual {v0}, Landroid/health/connect/datatypes/LeanBodyMassRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v0

    invoke-direct {v1, v2, v3, v4, v0}, Lm7/h0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/b0;Ln7/c;)V

    return-object v1

    :cond_27
    instance-of v1, v0, Landroid/health/connect/datatypes/MenstruationFlowRecord;

    if-eqz v1, :cond_29

    check-cast v0, Landroid/health/connect/datatypes/MenstruationFlowRecord;

    new-instance v1, Lm7/j0;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/MenstruationFlowRecord;->getTime()Ljava/time/Instant;

    move-result-object v2

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/MenstruationFlowRecord;->getZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v3

    invoke-virtual {v0}, Landroid/health/connect/datatypes/MenstruationFlowRecord;->getFlow()I

    move-result v4

    sget-object v6, Li7/a;->l:Ljava/util/LinkedHashMap;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-eqz v4, :cond_28

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v8

    :cond_28
    invoke-virtual {v0}, Landroid/health/connect/datatypes/MenstruationFlowRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v0

    invoke-direct {v1, v2, v3, v8, v0}, Lm7/j0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;ILn7/c;)V

    return-object v1

    :cond_29
    instance-of v1, v0, Landroid/health/connect/datatypes/MenstruationPeriodRecord;

    if-eqz v1, :cond_2a

    check-cast v0, Landroid/health/connect/datatypes/MenstruationPeriodRecord;

    new-instance v6, Lm7/k0;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/MenstruationPeriodRecord;->getStartTime()Ljava/time/Instant;

    move-result-object v7

    invoke-static {v7, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/MenstruationPeriodRecord;->getStartZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v8

    invoke-virtual {v0}, Landroid/health/connect/datatypes/MenstruationPeriodRecord;->getEndTime()Ljava/time/Instant;

    move-result-object v9

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/MenstruationPeriodRecord;->getEndZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v10

    invoke-virtual {v0}, Landroid/health/connect/datatypes/MenstruationPeriodRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v11

    invoke-direct/range {v6 .. v11}, Lm7/k0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Ln7/c;)V

    return-object v6

    :cond_2a
    instance-of v1, v0, Landroid/health/connect/datatypes/NutritionRecord;

    if-eqz v1, :cond_56

    check-cast v0, Landroid/health/connect/datatypes/NutritionRecord;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getStartTime()Ljava/time/Instant;

    move-result-object v15

    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getStartZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v16

    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getEndTime()Ljava/time/Instant;

    move-result-object v1

    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getEndZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v18

    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getMealName()Ljava/lang/String;

    move-result-object v61

    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getMealType()I

    move-result v2

    sget-object v6, Li7/a;->h:Ljava/util/LinkedHashMap;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_2b

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    :cond_2b
    move/from16 v62, v8

    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v2

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v63

    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getBiotin()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_2c

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v19, v2

    goto :goto_f

    :cond_2c
    move-object/from16 v19, v13

    :goto_f
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getCaffeine()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_2d

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v20, v2

    goto :goto_10

    :cond_2d
    move-object/from16 v20, v13

    :goto_10
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getCalcium()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_2e

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v21, v2

    goto :goto_11

    :cond_2e
    move-object/from16 v21, v13

    :goto_11
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getEnergy()Landroid/health/connect/datatypes/units/Energy;

    move-result-object v2

    if-eqz v2, :cond_2f

    invoke-static {v2}, Lb3/g1;->H(Landroid/health/connect/datatypes/units/Energy;)Lr7/k;

    move-result-object v2

    move-object/from16 v22, v2

    goto :goto_12

    :cond_2f
    move-object/from16 v22, v13

    :goto_12
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getEnergyFromFat()Landroid/health/connect/datatypes/units/Energy;

    move-result-object v2

    if-eqz v2, :cond_30

    invoke-static {v2}, Lb3/g1;->H(Landroid/health/connect/datatypes/units/Energy;)Lr7/k;

    move-result-object v2

    move-object/from16 v23, v2

    goto :goto_13

    :cond_30
    move-object/from16 v23, v13

    :goto_13
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getChloride()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_31

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v24, v2

    goto :goto_14

    :cond_31
    move-object/from16 v24, v13

    :goto_14
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getCholesterol()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_32

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v25, v2

    goto :goto_15

    :cond_32
    move-object/from16 v25, v13

    :goto_15
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getChromium()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_33

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v26, v2

    goto :goto_16

    :cond_33
    move-object/from16 v26, v13

    :goto_16
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getCopper()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_34

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v27, v2

    goto :goto_17

    :cond_34
    move-object/from16 v27, v13

    :goto_17
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getDietaryFiber()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_35

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v28, v2

    goto :goto_18

    :cond_35
    move-object/from16 v28, v13

    :goto_18
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getFolate()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_36

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v29, v2

    goto :goto_19

    :cond_36
    move-object/from16 v29, v13

    :goto_19
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getFolicAcid()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_37

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v30, v2

    goto :goto_1a

    :cond_37
    move-object/from16 v30, v13

    :goto_1a
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getIodine()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_38

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v31, v2

    goto :goto_1b

    :cond_38
    move-object/from16 v31, v13

    :goto_1b
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getIron()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_39

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v32, v2

    goto :goto_1c

    :cond_39
    move-object/from16 v32, v13

    :goto_1c
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getMagnesium()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_3a

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v33, v2

    goto :goto_1d

    :cond_3a
    move-object/from16 v33, v13

    :goto_1d
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getManganese()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_3b

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v34, v2

    goto :goto_1e

    :cond_3b
    move-object/from16 v34, v13

    :goto_1e
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getMolybdenum()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_3c

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v35, v2

    goto :goto_1f

    :cond_3c
    move-object/from16 v35, v13

    :goto_1f
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getMonounsaturatedFat()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_3d

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v36, v2

    goto :goto_20

    :cond_3d
    move-object/from16 v36, v13

    :goto_20
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getNiacin()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_3e

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v37, v2

    goto :goto_21

    :cond_3e
    move-object/from16 v37, v13

    :goto_21
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getPantothenicAcid()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_3f

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v38, v2

    goto :goto_22

    :cond_3f
    move-object/from16 v38, v13

    :goto_22
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getPhosphorus()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_40

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v39, v2

    goto :goto_23

    :cond_40
    move-object/from16 v39, v13

    :goto_23
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getPolyunsaturatedFat()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_41

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v40, v2

    goto :goto_24

    :cond_41
    move-object/from16 v40, v13

    :goto_24
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getPotassium()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_42

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v41, v2

    goto :goto_25

    :cond_42
    move-object/from16 v41, v13

    :goto_25
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getProtein()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_43

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v42, v2

    goto :goto_26

    :cond_43
    move-object/from16 v42, v13

    :goto_26
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getRiboflavin()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_44

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v43, v2

    goto :goto_27

    :cond_44
    move-object/from16 v43, v13

    :goto_27
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getSaturatedFat()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_45

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v44, v2

    goto :goto_28

    :cond_45
    move-object/from16 v44, v13

    :goto_28
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getSelenium()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_46

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v45, v2

    goto :goto_29

    :cond_46
    move-object/from16 v45, v13

    :goto_29
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getSodium()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_47

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v46, v2

    goto :goto_2a

    :cond_47
    move-object/from16 v46, v13

    :goto_2a
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getSugar()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_48

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v47, v2

    goto :goto_2b

    :cond_48
    move-object/from16 v47, v13

    :goto_2b
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getThiamin()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_49

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v48, v2

    goto :goto_2c

    :cond_49
    move-object/from16 v48, v13

    :goto_2c
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getTotalCarbohydrate()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_4a

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v49, v2

    goto :goto_2d

    :cond_4a
    move-object/from16 v49, v13

    :goto_2d
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getTotalFat()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_4b

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v50, v2

    goto :goto_2e

    :cond_4b
    move-object/from16 v50, v13

    :goto_2e
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getTransFat()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_4c

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v51, v2

    goto :goto_2f

    :cond_4c
    move-object/from16 v51, v13

    :goto_2f
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getUnsaturatedFat()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_4d

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v52, v2

    goto :goto_30

    :cond_4d
    move-object/from16 v52, v13

    :goto_30
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getVitaminA()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_4e

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v53, v2

    goto :goto_31

    :cond_4e
    move-object/from16 v53, v13

    :goto_31
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getVitaminB12()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_4f

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v54, v2

    goto :goto_32

    :cond_4f
    move-object/from16 v54, v13

    :goto_32
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getVitaminB6()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_50

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v55, v2

    goto :goto_33

    :cond_50
    move-object/from16 v55, v13

    :goto_33
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getVitaminC()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_51

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v56, v2

    goto :goto_34

    :cond_51
    move-object/from16 v56, v13

    :goto_34
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getVitaminD()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_52

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v57, v2

    goto :goto_35

    :cond_52
    move-object/from16 v57, v13

    :goto_35
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getVitaminE()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_53

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v58, v2

    goto :goto_36

    :cond_53
    move-object/from16 v58, v13

    :goto_36
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getVitaminK()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v2

    if-eqz v2, :cond_54

    sget-object v5, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v2}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v2

    move-object/from16 v59, v2

    goto :goto_37

    :cond_54
    move-object/from16 v59, v13

    :goto_37
    invoke-virtual {v0}, Landroid/health/connect/datatypes/NutritionRecord;->getZinc()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v0

    if-eqz v0, :cond_55

    sget-object v2, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v5

    invoke-static {v5, v6}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v13

    :cond_55
    move-object/from16 v60, v13

    new-instance v14, Lm7/m0;

    invoke-static {v15, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v17, v1

    invoke-direct/range {v14 .. v63}, Lm7/m0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/k;Lr7/k;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Ljava/lang/String;ILn7/c;)V

    return-object v14

    :cond_56
    instance-of v1, v0, Landroid/health/connect/datatypes/OvulationTestRecord;

    if-eqz v1, :cond_58

    check-cast v0, Landroid/health/connect/datatypes/OvulationTestRecord;

    new-instance v1, Lm7/n0;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/OvulationTestRecord;->getTime()Ljava/time/Instant;

    move-result-object v2

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/OvulationTestRecord;->getZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v3

    invoke-virtual {v0}, Landroid/health/connect/datatypes/OvulationTestRecord;->getResult()I

    move-result v4

    sget-object v6, Li7/a;->r:Ljava/util/LinkedHashMap;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-eqz v4, :cond_57

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v8

    :cond_57
    invoke-virtual {v0}, Landroid/health/connect/datatypes/OvulationTestRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v0

    invoke-direct {v1, v2, v3, v8, v0}, Lm7/n0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;ILn7/c;)V

    return-object v1

    :cond_58
    instance-of v1, v0, Landroid/health/connect/datatypes/OxygenSaturationRecord;

    if-eqz v1, :cond_59

    check-cast v0, Landroid/health/connect/datatypes/OxygenSaturationRecord;

    new-instance v1, Lm7/o0;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/OxygenSaturationRecord;->getTime()Ljava/time/Instant;

    move-result-object v2

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/OxygenSaturationRecord;->getZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v3

    invoke-virtual {v0}, Landroid/health/connect/datatypes/OxygenSaturationRecord;->getPercentage()Landroid/health/connect/datatypes/units/Percentage;

    move-result-object v4

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lr7/c0;

    invoke-virtual {v4}, Landroid/health/connect/datatypes/units/Percentage;->getValue()D

    move-result-wide v7

    invoke-direct {v6, v7, v8}, Lr7/c0;-><init>(D)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/OxygenSaturationRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v0

    invoke-direct {v1, v2, v3, v6, v0}, Lm7/o0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/c0;Ln7/c;)V

    return-object v1

    :cond_59
    instance-of v1, v0, Landroid/health/connect/datatypes/PowerRecord;

    if-eqz v1, :cond_5b

    check-cast v0, Landroid/health/connect/datatypes/PowerRecord;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/PowerRecord;->getStartTime()Ljava/time/Instant;

    move-result-object v14

    invoke-static {v14, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/PowerRecord;->getStartZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v15

    invoke-virtual {v0}, Landroid/health/connect/datatypes/PowerRecord;->getEndTime()Ljava/time/Instant;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/PowerRecord;->getEndZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v17

    invoke-virtual {v0}, Landroid/health/connect/datatypes/PowerRecord;->getSamples()Ljava/util/List;

    move-result-object v2

    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v2, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_38
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/health/connect/datatypes/PowerRecord$PowerRecordSample;

    invoke-static {v4, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lm7/p0;

    invoke-virtual {v4}, Landroid/health/connect/datatypes/PowerRecord$PowerRecordSample;->getTime()Ljava/time/Instant;

    move-result-object v8

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Landroid/health/connect/datatypes/PowerRecord$PowerRecordSample;->getPower()Landroid/health/connect/datatypes/units/Power;

    move-result-object v4

    const-string v9, "power"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v9, Lr7/h0;->y:Lr7/d0;

    invoke-virtual {v4}, Landroid/health/connect/datatypes/units/Power;->getInWatts()D

    move-result-wide v9

    invoke-static {v9, v10}, Lr7/d0;->a(D)Lr7/h0;

    move-result-object v4

    invoke-direct {v6, v8, v4}, Lm7/p0;-><init>(Ljava/time/Instant;Lr7/h0;)V

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_38

    :cond_5a
    new-instance v2, Lb2/d;

    invoke-direct {v2, v12}, Lb2/d;-><init>(I)V

    invoke-static {v3, v2}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v18

    invoke-virtual {v0}, Landroid/health/connect/datatypes/PowerRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v19

    new-instance v13, Lm7/q0;

    move-object/from16 v16, v1

    invoke-direct/range {v13 .. v19}, Lm7/q0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/util/List;Ln7/c;)V

    return-object v13

    :cond_5b
    instance-of v1, v0, Landroid/health/connect/datatypes/RespiratoryRateRecord;

    if-eqz v1, :cond_5c

    check-cast v0, Landroid/health/connect/datatypes/RespiratoryRateRecord;

    new-instance v8, Lm7/s0;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/RespiratoryRateRecord;->getTime()Ljava/time/Instant;

    move-result-object v9

    invoke-static {v9, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/RespiratoryRateRecord;->getZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v10

    invoke-virtual {v0}, Landroid/health/connect/datatypes/RespiratoryRateRecord;->getRate()D

    move-result-wide v11

    invoke-virtual {v0}, Landroid/health/connect/datatypes/RespiratoryRateRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v13

    invoke-direct/range {v8 .. v13}, Lm7/s0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;DLn7/c;)V

    return-object v8

    :cond_5c
    instance-of v1, v0, Landroid/health/connect/datatypes/RestingHeartRateRecord;

    if-eqz v1, :cond_5d

    check-cast v0, Landroid/health/connect/datatypes/RestingHeartRateRecord;

    new-instance v8, Lm7/t0;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/RestingHeartRateRecord;->getTime()Ljava/time/Instant;

    move-result-object v9

    invoke-static {v9, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/RestingHeartRateRecord;->getZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v10

    invoke-virtual {v0}, Landroid/health/connect/datatypes/RestingHeartRateRecord;->getBeatsPerMinute()J

    move-result-wide v11

    invoke-virtual {v0}, Landroid/health/connect/datatypes/RestingHeartRateRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v13

    invoke-direct/range {v8 .. v13}, Lm7/t0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;JLn7/c;)V

    return-object v8

    :cond_5d
    instance-of v1, v0, Landroid/health/connect/datatypes/SexualActivityRecord;

    if-eqz v1, :cond_5f

    check-cast v0, Landroid/health/connect/datatypes/SexualActivityRecord;

    new-instance v1, Lm7/v0;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/SexualActivityRecord;->getTime()Ljava/time/Instant;

    move-result-object v2

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/SexualActivityRecord;->getZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v3

    invoke-virtual {v0}, Landroid/health/connect/datatypes/SexualActivityRecord;->getProtectionUsed()I

    move-result v4

    sget-object v6, Li7/a;->v:Ljava/util/LinkedHashMap;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-eqz v4, :cond_5e

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v8

    :cond_5e
    invoke-virtual {v0}, Landroid/health/connect/datatypes/SexualActivityRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v0

    invoke-direct {v1, v2, v3, v8, v0}, Lm7/v0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;ILn7/c;)V

    return-object v1

    :cond_5f
    instance-of v1, v0, Landroid/health/connect/datatypes/SleepSessionRecord;

    if-eqz v1, :cond_64

    check-cast v0, Landroid/health/connect/datatypes/SleepSessionRecord;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/SleepSessionRecord;->getStartTime()Ljava/time/Instant;

    move-result-object v15

    invoke-virtual {v0}, Landroid/health/connect/datatypes/SleepSessionRecord;->getStartZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v16

    invoke-virtual {v0}, Landroid/health/connect/datatypes/SleepSessionRecord;->getEndTime()Ljava/time/Instant;

    move-result-object v1

    invoke-virtual {v0}, Landroid/health/connect/datatypes/SleepSessionRecord;->getEndZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v18

    invoke-virtual {v0}, Landroid/health/connect/datatypes/SleepSessionRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v2

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v22

    invoke-virtual {v0}, Landroid/health/connect/datatypes/SleepSessionRecord;->getTitle()Ljava/lang/CharSequence;

    move-result-object v2

    if-eqz v2, :cond_60

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v19, v2

    goto :goto_39

    :cond_60
    move-object/from16 v19, v13

    :goto_39
    invoke-virtual {v0}, Landroid/health/connect/datatypes/SleepSessionRecord;->getNotes()Ljava/lang/CharSequence;

    move-result-object v2

    if-eqz v2, :cond_61

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v13

    :cond_61
    move-object/from16 v20, v13

    invoke-virtual {v0}, Landroid/health/connect/datatypes/SleepSessionRecord;->getStages()Ljava/util/List;

    move-result-object v0

    const-string v2, "stages"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v0, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_63

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/health/connect/datatypes/SleepSessionRecord$Stage;

    invoke-static {v5, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lm7/w0;

    invoke-virtual {v5}, Landroid/health/connect/datatypes/SleepSessionRecord$Stage;->getStartTime()Ljava/time/Instant;

    move-result-object v7

    invoke-static {v7, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Landroid/health/connect/datatypes/SleepSessionRecord$Stage;->getEndTime()Ljava/time/Instant;

    move-result-object v9

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Landroid/health/connect/datatypes/SleepSessionRecord$Stage;->getType()I

    move-result v5

    sget-object v10, Li7/a;->B:Ljava/util/LinkedHashMap;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v10, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    if-eqz v5, :cond_62

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_3b

    :cond_62
    move v5, v8

    :goto_3b
    invoke-direct {v6, v7, v9, v5}, Lm7/w0;-><init>(Ljava/time/Instant;Ljava/time/Instant;I)V

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3a

    :cond_63
    new-instance v0, Lb2/d;

    const/16 v5, 0xb

    invoke-direct {v0, v5}, Lb2/d;-><init>(I)V

    invoke-static {v2, v0}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v21

    new-instance v14, Lm7/x0;

    invoke-static {v15, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v17, v1

    invoke-direct/range {v14 .. v22}, Lm7/x0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ln7/c;)V

    return-object v14

    :cond_64
    instance-of v1, v0, Landroid/health/connect/datatypes/SpeedRecord;

    if-eqz v1, :cond_66

    check-cast v0, Landroid/health/connect/datatypes/SpeedRecord;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/SpeedRecord;->getStartTime()Ljava/time/Instant;

    move-result-object v14

    invoke-static {v14, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/SpeedRecord;->getStartZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v15

    invoke-virtual {v0}, Landroid/health/connect/datatypes/SpeedRecord;->getEndTime()Ljava/time/Instant;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/SpeedRecord;->getEndZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v17

    invoke-virtual {v0}, Landroid/health/connect/datatypes/SpeedRecord;->getSamples()Ljava/util/List;

    move-result-object v2

    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v2, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_65

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/health/connect/datatypes/SpeedRecord$SpeedRecordSample;

    invoke-static {v4, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lm7/z0;

    invoke-virtual {v4}, Landroid/health/connect/datatypes/SpeedRecord$SpeedRecordSample;->getTime()Ljava/time/Instant;

    move-result-object v8

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Landroid/health/connect/datatypes/SpeedRecord$SpeedRecordSample;->getSpeed()Landroid/health/connect/datatypes/units/Velocity;

    move-result-object v4

    const-string v9, "speed"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v9, Lr7/q0;->y:Lr7/l0;

    invoke-virtual {v4}, Landroid/health/connect/datatypes/units/Velocity;->getInMetersPerSecond()D

    move-result-wide v9

    invoke-static {v9, v10}, Lr7/l0;->a(D)Lr7/q0;

    move-result-object v4

    invoke-direct {v6, v8, v4}, Lm7/z0;-><init>(Ljava/time/Instant;Lr7/q0;)V

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3c

    :cond_65
    new-instance v2, Lb2/d;

    const/16 v4, 0xc

    invoke-direct {v2, v4}, Lb2/d;-><init>(I)V

    invoke-static {v3, v2}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v18

    invoke-virtual {v0}, Landroid/health/connect/datatypes/SpeedRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v19

    new-instance v13, Lm7/a1;

    move-object/from16 v16, v1

    invoke-direct/range {v13 .. v19}, Lm7/a1;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/util/List;Ln7/c;)V

    return-object v13

    :cond_66
    instance-of v1, v0, Landroid/health/connect/datatypes/StepsCadenceRecord;

    if-eqz v1, :cond_68

    check-cast v0, Landroid/health/connect/datatypes/StepsCadenceRecord;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/StepsCadenceRecord;->getStartTime()Ljava/time/Instant;

    move-result-object v14

    invoke-static {v14, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/StepsCadenceRecord;->getStartZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v15

    invoke-virtual {v0}, Landroid/health/connect/datatypes/StepsCadenceRecord;->getEndTime()Ljava/time/Instant;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/StepsCadenceRecord;->getEndZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v17

    invoke-virtual {v0}, Landroid/health/connect/datatypes/StepsCadenceRecord;->getSamples()Ljava/util/List;

    move-result-object v2

    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v2, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_67

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/health/connect/datatypes/StepsCadenceRecord$StepsCadenceRecordSample;

    invoke-static {v4, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lm7/b1;

    invoke-virtual {v4}, Landroid/health/connect/datatypes/StepsCadenceRecord$StepsCadenceRecordSample;->getTime()Ljava/time/Instant;

    move-result-object v8

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Landroid/health/connect/datatypes/StepsCadenceRecord$StepsCadenceRecordSample;->getRate()D

    move-result-wide v9

    invoke-direct {v6, v9, v10, v8}, Lm7/b1;-><init>(DLjava/time/Instant;)V

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3d

    :cond_67
    new-instance v2, Lb2/d;

    const/16 v4, 0xd

    invoke-direct {v2, v4}, Lb2/d;-><init>(I)V

    invoke-static {v3, v2}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v18

    invoke-virtual {v0}, Landroid/health/connect/datatypes/StepsCadenceRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v19

    new-instance v13, Lm7/c1;

    move-object/from16 v16, v1

    invoke-direct/range {v13 .. v19}, Lm7/c1;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/util/List;Ln7/c;)V

    return-object v13

    :cond_68
    instance-of v1, v0, Landroid/health/connect/datatypes/StepsRecord;

    if-eqz v1, :cond_69

    check-cast v0, Landroid/health/connect/datatypes/StepsRecord;

    new-instance v6, Lm7/d1;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/StepsRecord;->getStartTime()Ljava/time/Instant;

    move-result-object v7

    invoke-static {v7, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/StepsRecord;->getStartZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v8

    invoke-virtual {v0}, Landroid/health/connect/datatypes/StepsRecord;->getEndTime()Ljava/time/Instant;

    move-result-object v9

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/StepsRecord;->getEndZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v10

    invoke-virtual {v0}, Landroid/health/connect/datatypes/StepsRecord;->getCount()J

    move-result-wide v11

    invoke-virtual {v0}, Landroid/health/connect/datatypes/StepsRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v13

    invoke-direct/range {v6 .. v13}, Lm7/d1;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;JLn7/c;)V

    return-object v6

    :cond_69
    instance-of v1, v0, Landroid/health/connect/datatypes/TotalCaloriesBurnedRecord;

    if-eqz v1, :cond_6a

    check-cast v0, Landroid/health/connect/datatypes/TotalCaloriesBurnedRecord;

    new-instance v6, Lm7/e1;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/TotalCaloriesBurnedRecord;->getStartTime()Ljava/time/Instant;

    move-result-object v7

    invoke-static {v7, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/TotalCaloriesBurnedRecord;->getStartZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v8

    invoke-virtual {v0}, Landroid/health/connect/datatypes/TotalCaloriesBurnedRecord;->getEndTime()Ljava/time/Instant;

    move-result-object v9

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/TotalCaloriesBurnedRecord;->getEndZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v10

    invoke-virtual {v0}, Landroid/health/connect/datatypes/TotalCaloriesBurnedRecord;->getEnergy()Landroid/health/connect/datatypes/units/Energy;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lb3/g1;->H(Landroid/health/connect/datatypes/units/Energy;)Lr7/k;

    move-result-object v11

    invoke-virtual {v0}, Landroid/health/connect/datatypes/TotalCaloriesBurnedRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v12

    invoke-direct/range {v6 .. v12}, Lm7/e1;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/k;Ln7/c;)V

    return-object v6

    :cond_6a
    instance-of v1, v0, Landroid/health/connect/datatypes/Vo2MaxRecord;

    if-eqz v1, :cond_6c

    check-cast v0, Landroid/health/connect/datatypes/Vo2MaxRecord;

    new-instance v9, Lm7/f1;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/Vo2MaxRecord;->getTime()Ljava/time/Instant;

    move-result-object v10

    invoke-static {v10, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/Vo2MaxRecord;->getZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v11

    invoke-virtual {v0}, Landroid/health/connect/datatypes/Vo2MaxRecord;->getVo2MillilitersPerMinuteKilogram()D

    move-result-wide v12

    invoke-virtual {v0}, Landroid/health/connect/datatypes/Vo2MaxRecord;->getMeasurementMethod()I

    move-result v1

    sget-object v2, Li7/a;->j:Ljava/util/LinkedHashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_6b

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v8

    :cond_6b
    move v14, v8

    invoke-virtual {v0}, Landroid/health/connect/datatypes/Vo2MaxRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v15

    invoke-direct/range {v9 .. v15}, Lm7/f1;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;DILn7/c;)V

    return-object v9

    :cond_6c
    instance-of v1, v0, Landroid/health/connect/datatypes/WeightRecord;

    if-eqz v1, :cond_6d

    check-cast v0, Landroid/health/connect/datatypes/WeightRecord;

    new-instance v1, Lm7/g1;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/WeightRecord;->getTime()Ljava/time/Instant;

    move-result-object v2

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/WeightRecord;->getZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v3

    invoke-virtual {v0}, Landroid/health/connect/datatypes/WeightRecord;->getWeight()Landroid/health/connect/datatypes/units/Mass;

    move-result-object v4

    const-string v6, "weight"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lr7/b0;->y:Lr7/t;

    invoke-virtual {v4}, Landroid/health/connect/datatypes/units/Mass;->getInGrams()D

    move-result-wide v6

    invoke-static {v6, v7}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v4

    invoke-virtual {v0}, Landroid/health/connect/datatypes/WeightRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v0

    invoke-direct {v1, v2, v3, v4, v0}, Lm7/g1;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/b0;Ln7/c;)V

    return-object v1

    :cond_6d
    instance-of v1, v0, Landroid/health/connect/datatypes/WheelchairPushesRecord;

    if-eqz v1, :cond_6e

    check-cast v0, Landroid/health/connect/datatypes/WheelchairPushesRecord;

    new-instance v6, Lm7/h1;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/WheelchairPushesRecord;->getStartTime()Ljava/time/Instant;

    move-result-object v7

    invoke-static {v7, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/WheelchairPushesRecord;->getStartZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v8

    invoke-virtual {v0}, Landroid/health/connect/datatypes/WheelchairPushesRecord;->getEndTime()Ljava/time/Instant;

    move-result-object v9

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/health/connect/datatypes/WheelchairPushesRecord;->getEndZoneOffset()Ljava/time/ZoneOffset;

    move-result-object v10

    invoke-virtual {v0}, Landroid/health/connect/datatypes/WheelchairPushesRecord;->getCount()J

    move-result-wide v11

    invoke-virtual {v0}, Landroid/health/connect/datatypes/WheelchairPushesRecord;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb3/g1;->J(Landroid/health/connect/datatypes/Metadata;)Ln7/c;

    move-result-object v13

    invoke-direct/range {v6 .. v13}, Lm7/h1;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;JLn7/c;)V

    return-object v6

    :cond_6e
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unsupported record "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static L(Landroid/window/BackEvent;)F
    .locals 1

    const-string v0, "backEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/window/BackEvent;->getTouchX()F

    move-result p0

    return p0
.end method

.method public static M(Landroid/window/BackEvent;)F
    .locals 1

    const-string v0, "backEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/window/BackEvent;->getTouchY()F

    move-result p0

    return p0
.end method

.method public static final a(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Ll3/r0;Lh2/c;)V
    .locals 6

    invoke-virtual {p2}, Lh2/c;->i()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p2, Lh2/c;->b:F

    iget-object v1, p1, Ll3/r0;->b:Ll3/w;

    invoke-virtual {v1, v0}, Ll3/w;->e(F)I

    move-result v0

    iget p2, p2, Lh2/c;->d:F

    invoke-virtual {v1, p2}, Ll3/w;->e(F)I

    move-result p2

    if-gt v0, p2, :cond_0

    :goto_0
    invoke-virtual {p1, v0}, Ll3/r0;->f(I)F

    move-result v2

    invoke-virtual {v1, v0}, Ll3/w;->f(I)F

    move-result v3

    invoke-virtual {p1, v0}, Ll3/r0;->g(I)F

    move-result v4

    invoke-virtual {v1, v0}, Ll3/w;->b(I)F

    move-result v5

    invoke-virtual {p0, v2, v3, v4, v5}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->addVisibleLineBounds(FFFF)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    if-eq v0, p2, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final b(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Ll3/r0;Lh2/c;)V
    .locals 6

    invoke-virtual {p2}, Lh2/c;->i()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p2, Lh2/c;->b:F

    iget-object v1, p1, Ll3/r0;->b:Ll3/w;

    invoke-virtual {v1, v0}, Ll3/w;->e(F)I

    move-result v0

    iget p2, p2, Lh2/c;->d:F

    invoke-virtual {v1, p2}, Ll3/w;->e(F)I

    move-result p2

    if-gt v0, p2, :cond_0

    :goto_0
    invoke-virtual {p1, v0}, Ll3/r0;->f(I)F

    move-result v2

    invoke-virtual {v1, v0}, Ll3/w;->f(I)F

    move-result v3

    invoke-virtual {p1, v0}, Ll3/r0;->g(I)F

    move-result v4

    invoke-virtual {v1, v0}, Ll3/w;->b(I)F

    move-result v5

    invoke-virtual {p0, v2, v3, v4, v5}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->addVisibleLineBounds(FFFF)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    if-eq v0, p2, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final c(Landroid/app/Activity;)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    const v2, 0x7f01005e

    const v3, 0x7f01005d

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0, v3, v2}, Landroid/app/Activity;->overrideActivityTransition(III)V

    return-void

    :cond_0
    invoke-virtual {p0, v3, v2}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method public static d(Landroid/view/inputmethod/HandwritingGesture;Lck1/c;)I
    .locals 2

    invoke-virtual {p0}, Landroid/view/inputmethod/HandwritingGesture;->getFallbackText()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x3

    return p0

    :cond_0
    new-instance v0, Lq3/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lq3/a;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p1, v0}, Lck1/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x5

    return p0
.end method

.method public static e(Landroid/view/VelocityTracker;I)F
    .locals 0

    invoke-virtual {p0, p1}, Landroid/view/VelocityTracker;->getAxisVelocity(I)F

    move-result p0

    return p0
.end method

.method public static f(Lm3/m;Landroid/graphics/RectF;ILkk1/b;)[I
    .locals 3

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    new-instance p2, Lxl/a;

    iget-object v0, p0, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p0}, Lm3/m;->j()Lcom/google/android/material/textfield/p;

    move-result-object v1

    const/16 v2, 0x15

    invoke-direct {p2, v2, v0, v1}, Lxl/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ln3/a;

    invoke-direct {v0, p2}, Ln3/a;-><init>(Lxl/a;)V

    goto :goto_0

    :cond_0
    new-instance p2, Landroid/text/GraphemeClusterSegmentFinder;

    iget-object p2, p0, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {p2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object p2

    iget-object v0, p0, Lm3/m;->a:Landroid/text/TextPaint;

    new-instance v1, Landroid/text/GraphemeClusterSegmentFinder;

    invoke-direct {v1, p2, v0}, Landroid/text/GraphemeClusterSegmentFinder;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;)V

    move-object v0, v1

    :goto_0
    iget-object p0, p0, Lm3/m;->f:Landroid/text/Layout;

    new-instance p2, Lm3/a;

    invoke-direct {p2, p3}, Lm3/a;-><init>(Lkk1/b;)V

    invoke-virtual {p0, p1, v0, p2}, Landroid/text/Layout;->getRangeForRect(Landroid/graphics/RectF;Landroid/text/SegmentFinder;Landroid/text/Layout$TextInclusionStrategy;)[I

    move-result-object p0

    return-object p0
.end method

.method public static g(Landroid/view/ViewConfiguration;)F
    .locals 0

    invoke-virtual {p0}, Landroid/view/ViewConfiguration;->getScaledHandwritingGestureLineMargin()I

    move-result p0

    int-to-float p0, p0

    return p0
.end method

.method public static h(Landroid/view/ViewConfiguration;)F
    .locals 0

    invoke-virtual {p0}, Landroid/view/ViewConfiguration;->getScaledHandwritingSlop()I

    move-result p0

    int-to-float p0, p0

    return p0
.end method

.method public static i(Landroid/view/ViewConfiguration;III)I
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity(III)I

    move-result p0

    return p0
.end method

.method public static j(Landroid/view/ViewConfiguration;III)I
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity(III)I

    move-result p0

    return p0
.end method

.method public static k(Landroid/view/accessibility/AccessibilityManager;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityManager;->isRequestFromAccessibilityTool()Z

    move-result p0

    return p0
.end method

.method public static final l(Lj2/c;)Landroid/graphics/ColorSpace;
    .locals 1

    sget-object v0, Lj2/d;->v:Lj2/q;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Landroid/graphics/ColorSpace$Named;->BT2020_HLG:Landroid/graphics/ColorSpace$Named;

    invoke-static {p0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object v0, Lj2/d;->w:Lj2/q;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Landroid/graphics/ColorSpace$Named;->BT2020_PQ:Landroid/graphics/ColorSpace$Named;

    invoke-static {p0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static m(JLl3/g;ZLck1/c;)V
    .locals 6

    const-wide v0, 0xffffffffL

    if-eqz p3, :cond_7

    sget p3, Ll3/u0;->c:I

    const/16 p3, 0x20

    shr-long v2, p0, p3

    long-to-int p3, v2

    and-long v2, p0, v0

    long-to-int v2, v2

    const/16 v3, 0xa

    if-lez p3, :cond_0

    invoke-static {p2, p3}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    move-result v4

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    iget-object v5, p2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v2, v5, :cond_1

    invoke-static {p2, v2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v3

    :cond_1
    invoke-static {v4}, Lo73/a;->S(I)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v3}, Lo73/a;->R(I)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-static {v3}, Lo73/a;->Q(I)Z

    move-result v5

    if-eqz v5, :cond_4

    :cond_2
    invoke-static {v4}, Ljava/lang/Character;->charCount(I)I

    move-result p0

    sub-int/2addr p3, p0

    if-eqz p3, :cond_3

    invoke-static {p2, p3}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    move-result v4

    invoke-static {v4}, Lo73/a;->S(I)Z

    move-result p0

    if-nez p0, :cond_2

    :cond_3
    invoke-static {p3, v2}, Lj93/l0;->f(II)J

    move-result-wide p0

    goto :goto_1

    :cond_4
    invoke-static {v3}, Lo73/a;->S(I)Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-static {v4}, Lo73/a;->R(I)Z

    move-result v5

    if-nez v5, :cond_5

    invoke-static {v4}, Lo73/a;->Q(I)Z

    move-result v4

    if-eqz v4, :cond_7

    :cond_5
    invoke-static {v3}, Ljava/lang/Character;->charCount(I)I

    move-result p0

    add-int/2addr v2, p0

    iget-object p0, p2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    if-eq v2, p0, :cond_6

    invoke-static {p2, v2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v3

    invoke-static {v3}, Lo73/a;->S(I)Z

    move-result p0

    if-nez p0, :cond_5

    :cond_6
    invoke-static {p3, v2}, Lj93/l0;->f(II)J

    move-result-wide p0

    :cond_7
    :goto_1
    new-instance p2, Lq3/x;

    and-long/2addr v0, p0

    long-to-int p3, v0

    invoke-direct {p2, p3, p3}, Lq3/x;-><init>(II)V

    invoke-static {p0, p1}, Ll3/u0;->d(J)I

    move-result p0

    new-instance p1, Lq3/f;

    const/4 p3, 0x0

    invoke-direct {p1, p0, p3}, Lq3/f;-><init>(II)V

    const/4 p0, 0x2

    new-array p0, p0, [Lq3/h;

    aput-object p2, p0, p3

    const/4 p2, 0x1

    aput-object p1, p0, p2

    new-instance p1, Ld1/h;

    invoke-direct {p1, p0}, Ld1/h;-><init>([Lq3/h;)V

    invoke-virtual {p4, p1}, Lck1/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static n(Lu0/s0;Landroid/view/inputmethod/HandwritingGesture;Lf1/s1;Lb3/j3;Lck1/c;)I
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    iget-object v5, v0, Lu0/s0;->j:Ll3/g;

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Lu0/s0;->d()Lu0/p1;

    move-result-object v6

    const/4 v7, 0x0

    if-eqz v6, :cond_1

    iget-object v6, v6, Lu0/p1;->a:Ll3/r0;

    iget-object v6, v6, Ll3/r0;->a:Ll3/q0;

    if-eqz v6, :cond_1

    iget-object v6, v6, Ll3/q0;->a:Ll3/g;

    goto :goto_0

    :cond_1
    move-object v6, v7

    :goto_0
    invoke-virtual {v5, v6}, Ll3/g;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    :goto_1
    const/4 v0, 0x3

    return v0

    :cond_2
    instance-of v6, v1, Landroid/view/inputmethod/SelectGesture;

    const-wide v8, 0xffffffffL

    const/16 v10, 0x20

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eqz v6, :cond_5

    check-cast v1, Landroid/view/inputmethod/SelectGesture;

    invoke-virtual {v1}, Landroid/view/inputmethod/SelectGesture;->getSelectionArea()Landroid/graphics/RectF;

    move-result-object v3

    invoke-static {v3}, Li2/w0;->K(Landroid/graphics/RectF;)Lh2/c;

    move-result-object v3

    invoke-virtual {v1}, Landroid/view/inputmethod/SelectGesture;->getGranularity()I

    move-result v5

    if-eq v5, v12, :cond_3

    goto :goto_2

    :cond_3
    move v11, v12

    :goto_2
    invoke-static {v0, v3, v11}, Lo73/a;->L(Lu0/s0;Lh2/c;I)J

    move-result-wide v5

    invoke-static {v5, v6}, Ll3/u0;->c(J)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {v1, v4}, Lb3/g1;->d(Landroid/view/inputmethod/HandwritingGesture;Lck1/c;)I

    move-result v0

    return v0

    :cond_4
    new-instance v0, Lq3/x;

    shr-long v10, v5, v10

    long-to-int v1, v10

    and-long/2addr v5, v8

    long-to-int v3, v5

    invoke-direct {v0, v1, v3}, Lq3/x;-><init>(II)V

    invoke-virtual {v4, v0}, Lck1/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v2, :cond_c

    invoke-virtual {v2, v12}, Lf1/s1;->h(Z)V

    return v12

    :cond_5
    instance-of v6, v1, Landroid/view/inputmethod/DeleteGesture;

    if-eqz v6, :cond_9

    check-cast v1, Landroid/view/inputmethod/DeleteGesture;

    invoke-virtual {v1}, Landroid/view/inputmethod/DeleteGesture;->getGranularity()I

    move-result v2

    if-eq v2, v12, :cond_6

    move v2, v11

    goto :goto_3

    :cond_6
    move v2, v12

    :goto_3
    invoke-virtual {v1}, Landroid/view/inputmethod/DeleteGesture;->getDeletionArea()Landroid/graphics/RectF;

    move-result-object v3

    invoke-static {v3}, Li2/w0;->K(Landroid/graphics/RectF;)Lh2/c;

    move-result-object v3

    invoke-static {v0, v3, v2}, Lo73/a;->L(Lu0/s0;Lh2/c;I)J

    move-result-wide v6

    invoke-static {v6, v7}, Ll3/u0;->c(J)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {v1, v4}, Lb3/g1;->d(Landroid/view/inputmethod/HandwritingGesture;Lck1/c;)I

    move-result v0

    return v0

    :cond_7
    if-ne v2, v12, :cond_8

    move v11, v12

    :cond_8
    invoke-static {v6, v7, v5, v11, v4}, Lb3/g1;->m(JLl3/g;ZLck1/c;)V

    return v12

    :cond_9
    instance-of v6, v1, Landroid/view/inputmethod/SelectRangeGesture;

    if-eqz v6, :cond_d

    check-cast v1, Landroid/view/inputmethod/SelectRangeGesture;

    invoke-virtual {v1}, Landroid/view/inputmethod/SelectRangeGesture;->getSelectionStartArea()Landroid/graphics/RectF;

    move-result-object v3

    invoke-static {v3}, Li2/w0;->K(Landroid/graphics/RectF;)Lh2/c;

    move-result-object v3

    invoke-virtual {v1}, Landroid/view/inputmethod/SelectRangeGesture;->getSelectionEndArea()Landroid/graphics/RectF;

    move-result-object v5

    invoke-static {v5}, Li2/w0;->K(Landroid/graphics/RectF;)Lh2/c;

    move-result-object v5

    invoke-virtual {v1}, Landroid/view/inputmethod/SelectRangeGesture;->getGranularity()I

    move-result v6

    if-eq v6, v12, :cond_a

    goto :goto_4

    :cond_a
    move v11, v12

    :goto_4
    invoke-static {v0, v3, v5, v11}, Lo73/a;->k(Lu0/s0;Lh2/c;Lh2/c;I)J

    move-result-wide v5

    invoke-static {v5, v6}, Ll3/u0;->c(J)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {v1, v4}, Lb3/g1;->d(Landroid/view/inputmethod/HandwritingGesture;Lck1/c;)I

    move-result v0

    return v0

    :cond_b
    new-instance v0, Lq3/x;

    shr-long v10, v5, v10

    long-to-int v1, v10

    and-long/2addr v5, v8

    long-to-int v3, v5

    invoke-direct {v0, v1, v3}, Lq3/x;-><init>(II)V

    invoke-virtual {v4, v0}, Lck1/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v2, :cond_c

    invoke-virtual {v2, v12}, Lf1/s1;->h(Z)V

    :cond_c
    return v12

    :cond_d
    instance-of v2, v1, Landroid/view/inputmethod/DeleteRangeGesture;

    if-eqz v2, :cond_11

    check-cast v1, Landroid/view/inputmethod/DeleteRangeGesture;

    invoke-virtual {v1}, Landroid/view/inputmethod/DeleteRangeGesture;->getGranularity()I

    move-result v2

    if-eq v2, v12, :cond_e

    move v2, v11

    goto :goto_5

    :cond_e
    move v2, v12

    :goto_5
    invoke-virtual {v1}, Landroid/view/inputmethod/DeleteRangeGesture;->getDeletionStartArea()Landroid/graphics/RectF;

    move-result-object v3

    invoke-static {v3}, Li2/w0;->K(Landroid/graphics/RectF;)Lh2/c;

    move-result-object v3

    invoke-virtual {v1}, Landroid/view/inputmethod/DeleteRangeGesture;->getDeletionEndArea()Landroid/graphics/RectF;

    move-result-object v6

    invoke-static {v6}, Li2/w0;->K(Landroid/graphics/RectF;)Lh2/c;

    move-result-object v6

    invoke-static {v0, v3, v6, v2}, Lo73/a;->k(Lu0/s0;Lh2/c;Lh2/c;I)J

    move-result-wide v6

    invoke-static {v6, v7}, Ll3/u0;->c(J)Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {v1, v4}, Lb3/g1;->d(Landroid/view/inputmethod/HandwritingGesture;Lck1/c;)I

    move-result v0

    return v0

    :cond_f
    if-ne v2, v12, :cond_10

    move v11, v12

    :cond_10
    invoke-static {v6, v7, v5, v11, v4}, Lb3/g1;->m(JLl3/g;ZLck1/c;)V

    return v12

    :cond_11
    instance-of v2, v1, Landroid/view/inputmethod/JoinOrSplitGesture;

    const/4 v6, 0x2

    const/4 v8, -0x1

    if-eqz v2, :cond_1a

    check-cast v1, Landroid/view/inputmethod/JoinOrSplitGesture;

    if-nez v3, :cond_12

    invoke-static {v1, v4}, Lb3/g1;->d(Landroid/view/inputmethod/HandwritingGesture;Lck1/c;)I

    move-result v0

    return v0

    :cond_12
    invoke-virtual {v1}, Landroid/view/inputmethod/JoinOrSplitGesture;->getJoinOrSplitPoint()Landroid/graphics/PointF;

    move-result-object v2

    invoke-static {v2}, Lo73/a;->m(Landroid/graphics/PointF;)J

    move-result-wide v13

    invoke-static {v0, v13, v14, v3}, Lo73/a;->j(Lu0/s0;JLb3/j3;)I

    move-result v2

    if-eq v2, v8, :cond_19

    invoke-virtual {v0}, Lu0/s0;->d()Lu0/p1;

    move-result-object v0

    if-eqz v0, :cond_13

    iget-object v0, v0, Lu0/p1;->a:Ll3/r0;

    invoke-static {v0, v2}, Lo73/a;->l(Ll3/r0;I)Z

    move-result v0

    if-ne v0, v12, :cond_13

    goto :goto_9

    :cond_13
    move v0, v2

    :goto_6
    if-lez v0, :cond_15

    invoke-static {v5, v0}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    move-result v1

    invoke-static {v1}, Lo73/a;->R(I)Z

    move-result v3

    if-nez v3, :cond_14

    goto :goto_7

    :cond_14
    invoke-static {v1}, Ljava/lang/Character;->charCount(I)I

    move-result v1

    sub-int/2addr v0, v1

    goto :goto_6

    :cond_15
    :goto_7
    iget-object v1, v5, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v2, v1, :cond_17

    invoke-static {v5, v2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v1

    invoke-static {v1}, Lo73/a;->R(I)Z

    move-result v3

    if-nez v3, :cond_16

    goto :goto_8

    :cond_16
    invoke-static {v1}, Ljava/lang/Character;->charCount(I)I

    move-result v1

    add-int/2addr v2, v1

    goto :goto_7

    :cond_17
    :goto_8
    invoke-static {v0, v2}, Lj93/l0;->f(II)J

    move-result-wide v0

    invoke-static {v0, v1}, Ll3/u0;->c(J)Z

    move-result v2

    if-eqz v2, :cond_18

    shr-long/2addr v0, v10

    long-to-int v0, v0

    new-instance v1, Lq3/x;

    invoke-direct {v1, v0, v0}, Lq3/x;-><init>(II)V

    new-instance v0, Lq3/a;

    const-string v2, " "

    invoke-direct {v0, v2, v12}, Lq3/a;-><init>(Ljava/lang/String;I)V

    new-array v2, v6, [Lq3/h;

    aput-object v1, v2, v11

    aput-object v0, v2, v12

    new-instance v0, Ld1/h;

    invoke-direct {v0, v2}, Ld1/h;-><init>([Lq3/h;)V

    invoke-virtual {v4, v0}, Lck1/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return v12

    :cond_18
    invoke-static {v0, v1, v5, v11, v4}, Lb3/g1;->m(JLl3/g;ZLck1/c;)V

    return v12

    :cond_19
    :goto_9
    invoke-static {v1, v4}, Lb3/g1;->d(Landroid/view/inputmethod/HandwritingGesture;Lck1/c;)I

    move-result v0

    return v0

    :cond_1a
    instance-of v2, v1, Landroid/view/inputmethod/InsertGesture;

    if-eqz v2, :cond_1e

    check-cast v1, Landroid/view/inputmethod/InsertGesture;

    if-nez v3, :cond_1b

    invoke-static {v1, v4}, Lb3/g1;->d(Landroid/view/inputmethod/HandwritingGesture;Lck1/c;)I

    move-result v0

    return v0

    :cond_1b
    invoke-virtual {v1}, Landroid/view/inputmethod/InsertGesture;->getInsertionPoint()Landroid/graphics/PointF;

    move-result-object v2

    invoke-static {v2}, Lo73/a;->m(Landroid/graphics/PointF;)J

    move-result-wide v9

    invoke-static {v0, v9, v10, v3}, Lo73/a;->j(Lu0/s0;JLb3/j3;)I

    move-result v2

    if-eq v2, v8, :cond_1d

    invoke-virtual {v0}, Lu0/s0;->d()Lu0/p1;

    move-result-object v0

    if-eqz v0, :cond_1c

    iget-object v0, v0, Lu0/p1;->a:Ll3/r0;

    invoke-static {v0, v2}, Lo73/a;->l(Ll3/r0;I)Z

    move-result v0

    if-ne v0, v12, :cond_1c

    goto :goto_a

    :cond_1c
    invoke-virtual {v1}, Landroid/view/inputmethod/InsertGesture;->getTextToInsert()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lq3/x;

    invoke-direct {v1, v2, v2}, Lq3/x;-><init>(II)V

    new-instance v2, Lq3/a;

    invoke-direct {v2, v0, v12}, Lq3/a;-><init>(Ljava/lang/String;I)V

    new-array v0, v6, [Lq3/h;

    aput-object v1, v0, v11

    aput-object v2, v0, v12

    new-instance v1, Ld1/h;

    invoke-direct {v1, v0}, Ld1/h;-><init>([Lq3/h;)V

    invoke-virtual {v4, v1}, Lck1/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return v12

    :cond_1d
    :goto_a
    invoke-static {v1, v4}, Lb3/g1;->d(Landroid/view/inputmethod/HandwritingGesture;Lck1/c;)I

    move-result v0

    return v0

    :cond_1e
    instance-of v2, v1, Landroid/view/inputmethod/RemoveSpaceGesture;

    if-eqz v2, :cond_28

    check-cast v1, Landroid/view/inputmethod/RemoveSpaceGesture;

    invoke-virtual {v0}, Lu0/s0;->d()Lu0/p1;

    move-result-object v2

    if-eqz v2, :cond_1f

    iget-object v7, v2, Lu0/p1;->a:Ll3/r0;

    :cond_1f
    invoke-virtual {v1}, Landroid/view/inputmethod/RemoveSpaceGesture;->getStartPoint()Landroid/graphics/PointF;

    move-result-object v2

    invoke-static {v2}, Lo73/a;->m(Landroid/graphics/PointF;)J

    move-result-wide v13

    invoke-virtual {v1}, Landroid/view/inputmethod/RemoveSpaceGesture;->getEndPoint()Landroid/graphics/PointF;

    move-result-object v2

    move v9, v10

    invoke-static {v2}, Lo73/a;->m(Landroid/graphics/PointF;)J

    move-result-wide v10

    invoke-virtual {v0}, Lu0/s0;->c()Ly2/y;

    move-result-object v0

    if-eqz v7, :cond_24

    iget-object v2, v7, Ll3/r0;->b:Ll3/w;

    if-nez v0, :cond_20

    goto :goto_c

    :cond_20
    invoke-interface {v0, v13, v14}, Ly2/y;->y(J)J

    move-result-wide v13

    invoke-interface {v0, v10, v11}, Ly2/y;->y(J)J

    move-result-wide v10

    invoke-static {v2, v13, v14, v3}, Lo73/a;->J(Ll3/w;JLb3/j3;)I

    move-result v0

    invoke-static {v2, v10, v11, v3}, Lo73/a;->J(Ll3/w;JLb3/j3;)I

    move-result v3

    if-ne v0, v8, :cond_21

    if-ne v3, v8, :cond_23

    sget-wide v2, Ll3/u0;->b:J

    goto :goto_d

    :cond_21
    if-ne v3, v8, :cond_22

    goto :goto_b

    :cond_22
    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    :goto_b
    move v3, v0

    :cond_23
    invoke-virtual {v2, v3}, Ll3/w;->f(I)F

    move-result v0

    invoke-virtual {v2, v3}, Ll3/w;->b(I)F

    move-result v3

    add-float/2addr v3, v0

    int-to-float v0, v6

    div-float/2addr v3, v0

    new-instance v0, Lh2/c;

    shr-long/2addr v13, v9

    long-to-int v7, v13

    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v13

    shr-long/2addr v10, v9

    long-to-int v10, v10

    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v11

    invoke-static {v13, v11}, Ljava/lang/Math;->min(FF)F

    move-result v11

    const v13, 0x3dcccccd    # 0.1f

    sub-float v14, v3, v13

    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v10

    invoke-static {v7, v10}, Ljava/lang/Math;->max(FF)F

    move-result v7

    add-float/2addr v3, v13

    invoke-direct {v0, v11, v14, v7, v3}, Lh2/c;-><init>(FFFF)V

    sget-object v3, Ll3/p0;->a:Li7/g;

    const/4 v15, 0x0

    invoke-virtual {v2, v0, v15, v3}, Ll3/w;->h(Lh2/c;ILi7/g;)J

    move-result-wide v2

    goto :goto_d

    :cond_24
    :goto_c
    sget-wide v2, Ll3/u0;->b:J

    :goto_d
    invoke-static {v2, v3}, Ll3/u0;->c(J)Z

    move-result v0

    if-eqz v0, :cond_25

    invoke-static {v1, v4}, Lb3/g1;->d(Landroid/view/inputmethod/HandwritingGesture;Lck1/c;)I

    move-result v0

    return v0

    :cond_25
    new-instance v0, Lkotlin/jvm/internal/e0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput v8, v0, Lkotlin/jvm/internal/e0;->w:I

    new-instance v7, Lkotlin/jvm/internal/e0;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    iput v8, v7, Lkotlin/jvm/internal/e0;->w:I

    invoke-static {v2, v3}, Ll3/u0;->f(J)I

    move-result v10

    invoke-static {v2, v3}, Ll3/u0;->e(J)I

    move-result v11

    invoke-virtual {v5, v10, v11}, Ll3/g;->e(II)Ll3/g;

    move-result-object v5

    iget-object v5, v5, Ll3/g;->x:Ljava/lang/String;

    new-instance v10, Lyb3/p;

    const-string v11, "\\s+"

    invoke-direct {v10, v11}, Lyb3/p;-><init>(Ljava/lang/String;)V

    new-instance v11, Lcom/whoop/profile/view/edit/n;

    const/4 v13, 0x7

    invoke-direct {v11, v13, v0, v7}, Lcom/whoop/profile/view/edit/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v5, v11}, Lyb3/p;->g(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object v5

    iget v0, v0, Lkotlin/jvm/internal/e0;->w:I

    if-eq v0, v8, :cond_27

    iget v10, v7, Lkotlin/jvm/internal/e0;->w:I

    if-ne v10, v8, :cond_26

    goto :goto_e

    :cond_26
    shr-long v8, v2, v9

    long-to-int v1, v8

    add-int v8, v1, v0

    add-int/2addr v1, v10

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v9

    invoke-static {v2, v3}, Ll3/u0;->d(J)I

    move-result v2

    iget v3, v7, Lkotlin/jvm/internal/e0;->w:I

    sub-int/2addr v2, v3

    sub-int/2addr v9, v2

    invoke-virtual {v5, v0, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v2, "substring(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lq3/x;

    invoke-direct {v2, v8, v1}, Lq3/x;-><init>(II)V

    new-instance v1, Lq3/a;

    invoke-direct {v1, v0, v12}, Lq3/a;-><init>(Ljava/lang/String;I)V

    new-array v0, v6, [Lq3/h;

    const/4 v15, 0x0

    aput-object v2, v0, v15

    aput-object v1, v0, v12

    new-instance v1, Ld1/h;

    invoke-direct {v1, v0}, Ld1/h;-><init>([Lq3/h;)V

    invoke-virtual {v4, v1}, Lck1/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return v12

    :cond_27
    :goto_e
    invoke-static {v1, v4}, Lb3/g1;->d(Landroid/view/inputmethod/HandwritingGesture;Lck1/c;)I

    move-result v0

    return v0

    :cond_28
    return v6
.end method

.method public static o(Lu0/s0;Landroid/view/inputmethod/PreviewableHandwritingGesture;Lf1/s1;Landroid/os/CancellationSignal;)Z
    .locals 5

    iget-object v0, p0, Lu0/s0;->j:Ll3/g;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto/16 :goto_6

    :cond_0
    invoke-virtual {p0}, Lu0/s0;->d()Lu0/p1;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v2, v2, Lu0/p1;->a:Ll3/r0;

    iget-object v2, v2, Ll3/r0;->a:Ll3/q0;

    if-eqz v2, :cond_1

    iget-object v2, v2, Ll3/q0;->a:Ll3/g;

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v2}, Ll3/g;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_6

    :cond_2
    instance-of v0, p1, Landroid/view/inputmethod/SelectGesture;

    const/4 v2, 0x1

    if-eqz v0, :cond_6

    check-cast p1, Landroid/view/inputmethod/SelectGesture;

    if-eqz p2, :cond_12

    invoke-virtual {p1}, Landroid/view/inputmethod/SelectGesture;->getSelectionArea()Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Li2/w0;->K(Landroid/graphics/RectF;)Lh2/c;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/inputmethod/SelectGesture;->getGranularity()I

    move-result p1

    if-eq p1, v2, :cond_3

    move p1, v1

    goto :goto_1

    :cond_3
    move p1, v2

    :goto_1
    invoke-static {p0, v0, p1}, Lo73/a;->L(Lu0/s0;Lh2/c;I)J

    move-result-wide p0

    iget-object v0, p2, Lf1/s1;->d:Lu0/s0;

    if-eqz v0, :cond_4

    invoke-virtual {v0, p0, p1}, Lu0/s0;->f(J)V

    :cond_4
    iget-object v0, p2, Lf1/s1;->d:Lu0/s0;

    if-eqz v0, :cond_5

    sget-wide v3, Ll3/u0;->b:J

    invoke-virtual {v0, v3, v4}, Lu0/s0;->e(J)V

    :cond_5
    invoke-static {p0, p1}, Ll3/u0;->c(J)Z

    move-result p0

    if-nez p0, :cond_12

    invoke-virtual {p2, v1}, Lf1/s1;->s(Z)V

    sget-object p0, Lu0/g0;->w:Lu0/g0;

    invoke-virtual {p2, p0}, Lf1/s1;->p(Lu0/g0;)V

    goto/16 :goto_5

    :cond_6
    instance-of v0, p1, Landroid/view/inputmethod/DeleteGesture;

    if-eqz v0, :cond_a

    check-cast p1, Landroid/view/inputmethod/DeleteGesture;

    if-eqz p2, :cond_12

    invoke-virtual {p1}, Landroid/view/inputmethod/DeleteGesture;->getDeletionArea()Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Li2/w0;->K(Landroid/graphics/RectF;)Lh2/c;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/inputmethod/DeleteGesture;->getGranularity()I

    move-result p1

    if-eq p1, v2, :cond_7

    move p1, v1

    goto :goto_2

    :cond_7
    move p1, v2

    :goto_2
    invoke-static {p0, v0, p1}, Lo73/a;->L(Lu0/s0;Lh2/c;I)J

    move-result-wide p0

    iget-object v0, p2, Lf1/s1;->d:Lu0/s0;

    if-eqz v0, :cond_8

    invoke-virtual {v0, p0, p1}, Lu0/s0;->e(J)V

    :cond_8
    iget-object v0, p2, Lf1/s1;->d:Lu0/s0;

    if-eqz v0, :cond_9

    sget-wide v3, Ll3/u0;->b:J

    invoke-virtual {v0, v3, v4}, Lu0/s0;->f(J)V

    :cond_9
    invoke-static {p0, p1}, Ll3/u0;->c(J)Z

    move-result p0

    if-nez p0, :cond_12

    invoke-virtual {p2, v1}, Lf1/s1;->s(Z)V

    sget-object p0, Lu0/g0;->w:Lu0/g0;

    invoke-virtual {p2, p0}, Lf1/s1;->p(Lu0/g0;)V

    goto/16 :goto_5

    :cond_a
    instance-of v0, p1, Landroid/view/inputmethod/SelectRangeGesture;

    if-eqz v0, :cond_e

    check-cast p1, Landroid/view/inputmethod/SelectRangeGesture;

    if-eqz p2, :cond_12

    invoke-virtual {p1}, Landroid/view/inputmethod/SelectRangeGesture;->getSelectionStartArea()Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Li2/w0;->K(Landroid/graphics/RectF;)Lh2/c;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/inputmethod/SelectRangeGesture;->getSelectionEndArea()Landroid/graphics/RectF;

    move-result-object v3

    invoke-static {v3}, Li2/w0;->K(Landroid/graphics/RectF;)Lh2/c;

    move-result-object v3

    invoke-virtual {p1}, Landroid/view/inputmethod/SelectRangeGesture;->getGranularity()I

    move-result p1

    if-eq p1, v2, :cond_b

    move p1, v1

    goto :goto_3

    :cond_b
    move p1, v2

    :goto_3
    invoke-static {p0, v0, v3, p1}, Lo73/a;->k(Lu0/s0;Lh2/c;Lh2/c;I)J

    move-result-wide p0

    iget-object v0, p2, Lf1/s1;->d:Lu0/s0;

    if-eqz v0, :cond_c

    invoke-virtual {v0, p0, p1}, Lu0/s0;->f(J)V

    :cond_c
    iget-object v0, p2, Lf1/s1;->d:Lu0/s0;

    if-eqz v0, :cond_d

    sget-wide v3, Ll3/u0;->b:J

    invoke-virtual {v0, v3, v4}, Lu0/s0;->e(J)V

    :cond_d
    invoke-static {p0, p1}, Ll3/u0;->c(J)Z

    move-result p0

    if-nez p0, :cond_12

    invoke-virtual {p2, v1}, Lf1/s1;->s(Z)V

    sget-object p0, Lu0/g0;->w:Lu0/g0;

    invoke-virtual {p2, p0}, Lf1/s1;->p(Lu0/g0;)V

    goto :goto_5

    :cond_e
    instance-of v0, p1, Landroid/view/inputmethod/DeleteRangeGesture;

    if-eqz v0, :cond_14

    check-cast p1, Landroid/view/inputmethod/DeleteRangeGesture;

    if-eqz p2, :cond_12

    invoke-virtual {p1}, Landroid/view/inputmethod/DeleteRangeGesture;->getDeletionStartArea()Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Li2/w0;->K(Landroid/graphics/RectF;)Lh2/c;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/inputmethod/DeleteRangeGesture;->getDeletionEndArea()Landroid/graphics/RectF;

    move-result-object v3

    invoke-static {v3}, Li2/w0;->K(Landroid/graphics/RectF;)Lh2/c;

    move-result-object v3

    invoke-virtual {p1}, Landroid/view/inputmethod/DeleteRangeGesture;->getGranularity()I

    move-result p1

    if-eq p1, v2, :cond_f

    move p1, v1

    goto :goto_4

    :cond_f
    move p1, v2

    :goto_4
    invoke-static {p0, v0, v3, p1}, Lo73/a;->k(Lu0/s0;Lh2/c;Lh2/c;I)J

    move-result-wide p0

    iget-object v0, p2, Lf1/s1;->d:Lu0/s0;

    if-eqz v0, :cond_10

    invoke-virtual {v0, p0, p1}, Lu0/s0;->e(J)V

    :cond_10
    iget-object v0, p2, Lf1/s1;->d:Lu0/s0;

    if-eqz v0, :cond_11

    sget-wide v3, Ll3/u0;->b:J

    invoke-virtual {v0, v3, v4}, Lu0/s0;->f(J)V

    :cond_11
    invoke-static {p0, p1}, Ll3/u0;->c(J)Z

    move-result p0

    if-nez p0, :cond_12

    invoke-virtual {p2, v1}, Lf1/s1;->s(Z)V

    sget-object p0, Lu0/g0;->w:Lu0/g0;

    invoke-virtual {p2, p0}, Lf1/s1;->p(Lu0/g0;)V

    :cond_12
    :goto_5
    if-eqz p3, :cond_13

    new-instance p0, Ld1/g;

    const/4 p1, 0x0

    invoke-direct {p0, p2, p1}, Ld1/g;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p3, p0}, Landroid/os/CancellationSignal;->setOnCancelListener(Landroid/os/CancellationSignal$OnCancelListener;)V

    :cond_13
    return v2

    :cond_14
    :goto_6
    return v1
.end method

.method public static p(Landroid/window/BackEvent;)F
    .locals 1

    const-string v0, "backEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/window/BackEvent;->getProgress()F

    move-result p0

    return p0
.end method

.method public static q(Landroid/app/PendingIntent;)V
    .locals 3

    :try_start_0
    invoke-static {}, Landroid/app/ActivityOptions;->makeBasic()Landroid/app/ActivityOptions;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/ActivityOptions;->setPendingIntentBackgroundActivityStartMode(I)Landroid/app/ActivityOptions;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ActivityOptions;->toBundle()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/app/PendingIntent;->send(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/app/PendingIntent$CanceledException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "error sending pendingIntent: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " error: "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "TextClassification"

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static r(Landroid/view/accessibility/AccessibilityEvent;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityEvent;->setAccessibilityDataSensitive(Z)V

    return-void
.end method

.method public static s(Landroid/view/inputmethod/EditorInfo;)V
    .locals 7

    const-class v0, Landroid/view/inputmethod/SelectGesture;

    const-class v1, Landroid/view/inputmethod/DeleteGesture;

    const-class v2, Landroid/view/inputmethod/SelectRangeGesture;

    const-class v3, Landroid/view/inputmethod/DeleteRangeGesture;

    const-class v4, Landroid/view/inputmethod/JoinOrSplitGesture;

    const-class v5, Landroid/view/inputmethod/InsertGesture;

    const-class v6, Landroid/view/inputmethod/RemoveSpaceGesture;

    filled-new-array/range {v0 .. v6}, [Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/view/inputmethod/EditorInfo;->setSupportedHandwritingGestures(Ljava/util/List;)V

    const-class v0, Landroid/view/inputmethod/SelectGesture;

    const-class v1, Landroid/view/inputmethod/DeleteGesture;

    const-class v2, Landroid/view/inputmethod/SelectRangeGesture;

    const-class v3, Landroid/view/inputmethod/DeleteRangeGesture;

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/view/inputmethod/EditorInfo;->setSupportedHandwritingGesturePreviews(Ljava/util/Set;)V

    return-void
.end method

.method public static t(Landroid/widget/TextView;IF)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroid/widget/TextView;->setLineHeight(IF)V

    return-void
.end method

.method public static u(Landroid/view/SurfaceView;)V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Landroid/view/SurfaceView;->setSurfaceLifecycle(I)V

    return-void
.end method

.method public static v(Landroid/window/BackEvent;)I
    .locals 1

    const-string v0, "backEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/window/BackEvent;->getSwipeEdge()I

    move-result p0

    return p0
.end method

.method public static final w(Landroid/health/connect/HealthConnectException;)Ljava/lang/Exception;
    .locals 2

    invoke-virtual {p0}, Landroid/health/connect/HealthConnectException;->getErrorCode()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/4 v1, 0x6

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    return-object v0

    :cond_0
    new-instance v0, Landroid/os/RemoteException;

    invoke-virtual {p0}, Landroid/health/connect/HealthConnectException;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/SecurityException;

    invoke-direct {v0, p0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/Throwable;)V

    return-object v0

    :cond_2
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    return-object v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static final x(Landroid/health/connect/InsertRecordsResponse;)Lp7/b;
    .locals 3

    invoke-virtual {p0}, Landroid/health/connect/InsertRecordsResponse;->getRecords()Ljava/util/List;

    move-result-object p0

    const-string v0, "records"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/health/connect/datatypes/Record;

    invoke-virtual {v1}, Landroid/health/connect/datatypes/Record;->getMetadata()Landroid/health/connect/datatypes/Metadata;

    move-result-object v1

    invoke-virtual {v1}, Landroid/health/connect/datatypes/Metadata;->getId()Ljava/lang/String;

    move-result-object v1

    const-string v2, "record.metadata.id"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Lp7/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-object p0
.end method

.method public static final y(Ln7/a;)Landroid/health/connect/datatypes/DataOrigin;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/health/connect/datatypes/DataOrigin$Builder;

    invoke-direct {v0}, Landroid/health/connect/datatypes/DataOrigin$Builder;-><init>()V

    iget-object p0, p0, Ln7/a;->a:Ljava/lang/String;

    invoke-virtual {v0, p0}, Landroid/health/connect/datatypes/DataOrigin$Builder;->setPackageName(Ljava/lang/String;)Landroid/health/connect/datatypes/DataOrigin$Builder;

    invoke-virtual {v0}, Landroid/health/connect/datatypes/DataOrigin$Builder;->build()Landroid/health/connect/datatypes/DataOrigin;

    move-result-object p0

    const-string v0, "PlatformDataOriginBuilde\u2026me(packageName) }.build()"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final z(Lr7/k;)Landroid/health/connect/datatypes/units/Energy;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lr7/k;->b()D

    move-result-wide v0

    invoke-static {v0, v1}, Landroid/health/connect/datatypes/units/Energy;->fromCalories(D)Landroid/health/connect/datatypes/units/Energy;

    move-result-object p0

    const-string v0, "fromCalories(inCalories)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
