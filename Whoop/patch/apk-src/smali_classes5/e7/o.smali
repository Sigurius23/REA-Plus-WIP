.class public final Le7/o;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public w:Ljava/util/List;

.field public x:I

.field public final synthetic y:Le7/r;

.field public final synthetic z:Ljava/util/List;


# direct methods
.method public constructor <init>(Le7/r;Ljava/util/List;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Le7/o;->y:Le7/r;

    iput-object p2, p0, Le7/o;->z:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3

    new-instance v0, Le7/o;

    iget-object v1, p0, Le7/o;->y:Le7/r;

    iget-object v2, p0, Le7/o;->z:Ljava/util/List;

    invoke-direct {v0, v1, v2, p1}, Le7/o;-><init>(Le7/r;Ljava/util/List;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Le7/o;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le7/o;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Le7/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le7/o;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, v0, Le7/o;->w:Ljava/util/List;

    check-cast v1, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Le7/o;->z:Ljava/util/List;

    move-object v4, v2

    check-cast v4, Ljava/util/List;

    iput-object v4, v0, Le7/o;->w:Ljava/util/List;

    iput v3, v0, Le7/o;->x:I

    new-instance v4, Lbc3/m;

    invoke-static {v0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v5

    invoke-direct {v4, v3, v5}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v4}, Lbc3/m;->s()V

    iget-object v3, v0, Le7/o;->y:Le7/r;

    iget-object v5, v3, Le7/r;->d:Landroid/health/connect/HealthConnectManager;

    check-cast v2, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v2, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_ab

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lm7/r0;

    const-string v9, "<this>"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v9, v8, Lm7/a;

    if-eqz v9, :cond_4

    check-cast v8, Lm7/a;

    new-instance v9, Landroid/health/connect/datatypes/ActiveCaloriesBurnedRecord$Builder;

    iget-object v9, v8, Lm7/a;->f:Ln7/c;

    invoke-static {v9}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v9

    iget-object v10, v8, Lm7/a;->a:Ljava/time/Instant;

    iget-object v11, v8, Lm7/a;->c:Ljava/time/Instant;

    iget-object v12, v8, Lm7/a;->e:Lr7/k;

    invoke-static {v12}, Lb3/g1;->z(Lr7/k;)Landroid/health/connect/datatypes/units/Energy;

    move-result-object v12

    new-instance v13, Landroid/health/connect/datatypes/ActiveCaloriesBurnedRecord$Builder;

    invoke-direct {v13, v9, v10, v11, v12}, Landroid/health/connect/datatypes/ActiveCaloriesBurnedRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;Landroid/health/connect/datatypes/units/Energy;)V

    iget-object v9, v8, Lm7/a;->b:Ljava/time/ZoneOffset;

    if-eqz v9, :cond_2

    invoke-virtual {v13, v9}, Landroid/health/connect/datatypes/ActiveCaloriesBurnedRecord$Builder;->setStartZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/ActiveCaloriesBurnedRecord$Builder;

    :cond_2
    iget-object v8, v8, Lm7/a;->d:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_3

    invoke-virtual {v13, v8}, Landroid/health/connect/datatypes/ActiveCaloriesBurnedRecord$Builder;->setEndZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/ActiveCaloriesBurnedRecord$Builder;

    :cond_3
    invoke-virtual {v13}, Landroid/health/connect/datatypes/ActiveCaloriesBurnedRecord$Builder;->build()Landroid/health/connect/datatypes/ActiveCaloriesBurnedRecord;

    move-result-object v8

    const-string v9, "PlatformActiveCaloriesBu\u2026       }\n        .build()"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_4
    instance-of v9, v8, Lm7/b;

    const-string v10, "fromCelsius(inCelsius)"

    if-eqz v9, :cond_7

    check-cast v8, Lm7/b;

    new-instance v9, Landroid/health/connect/datatypes/BasalBodyTemperatureRecord$Builder;

    iget-object v9, v8, Lm7/b;->e:Ln7/c;

    invoke-static {v9}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v9

    iget-object v12, v8, Lm7/b;->a:Ljava/time/Instant;

    iget v13, v8, Lm7/b;->d:I

    sget-object v14, Li7/a;->m:Ljava/lang/Object;

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v14, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Integer;

    if-eqz v13, :cond_5

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v11

    goto :goto_1

    :cond_5
    const/4 v11, 0x0

    :goto_1
    iget-object v13, v8, Lm7/b;->c:Lr7/k0;

    iget-wide v13, v13, Lr7/k0;->w:D

    invoke-static {v13, v14}, Landroid/health/connect/datatypes/units/Temperature;->fromCelsius(D)Landroid/health/connect/datatypes/units/Temperature;

    move-result-object v13

    invoke-static {v13, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v10, Landroid/health/connect/datatypes/BasalBodyTemperatureRecord$Builder;

    invoke-direct {v10, v9, v12, v11, v13}, Landroid/health/connect/datatypes/BasalBodyTemperatureRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;ILandroid/health/connect/datatypes/units/Temperature;)V

    iget-object v8, v8, Lm7/b;->b:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_6

    invoke-virtual {v10, v8}, Landroid/health/connect/datatypes/BasalBodyTemperatureRecord$Builder;->setZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/BasalBodyTemperatureRecord$Builder;

    :cond_6
    invoke-virtual {v10}, Landroid/health/connect/datatypes/BasalBodyTemperatureRecord$Builder;->build()Landroid/health/connect/datatypes/BasalBodyTemperatureRecord;

    move-result-object v8

    const-string v9, "PlatformBasalBodyTempera\u2026(it) } }\n        .build()"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_7
    instance-of v9, v8, Lm7/c;

    if-eqz v9, :cond_9

    check-cast v8, Lm7/c;

    new-instance v9, Landroid/health/connect/datatypes/BasalMetabolicRateRecord$Builder;

    iget-object v9, v8, Lm7/c;->d:Ln7/c;

    invoke-static {v9}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v9

    iget-object v10, v8, Lm7/c;->a:Ljava/time/Instant;

    iget-object v11, v8, Lm7/c;->c:Lr7/h0;

    invoke-static {v11}, Lb3/g1;->D(Lr7/h0;)Landroid/health/connect/datatypes/units/Power;

    move-result-object v11

    new-instance v12, Landroid/health/connect/datatypes/BasalMetabolicRateRecord$Builder;

    invoke-direct {v12, v9, v10, v11}, Landroid/health/connect/datatypes/BasalMetabolicRateRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Landroid/health/connect/datatypes/units/Power;)V

    iget-object v8, v8, Lm7/c;->b:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_8

    invoke-virtual {v12, v8}, Landroid/health/connect/datatypes/BasalMetabolicRateRecord$Builder;->setZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/BasalMetabolicRateRecord$Builder;

    :cond_8
    invoke-virtual {v12}, Landroid/health/connect/datatypes/BasalMetabolicRateRecord$Builder;->build()Landroid/health/connect/datatypes/BasalMetabolicRateRecord;

    move-result-object v8

    const-string v9, "PlatformBasalMetabolicRa\u2026(it) } }\n        .build()"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_9
    instance-of v9, v8, Lm7/d;

    if-eqz v9, :cond_e

    check-cast v8, Lm7/d;

    new-instance v9, Landroid/health/connect/datatypes/BloodGlucoseRecord$Builder;

    iget-object v9, v8, Lm7/d;->g:Ln7/c;

    invoke-static {v9}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v13

    iget-object v14, v8, Lm7/d;->a:Ljava/time/Instant;

    iget v9, v8, Lm7/d;->d:I

    sget-object v10, Li7/a;->w:Ljava/lang/Object;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    if-eqz v9, :cond_a

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    move v15, v9

    goto :goto_2

    :cond_a
    const/4 v15, 0x0

    :goto_2
    iget-object v9, v8, Lm7/d;->c:Lr7/d;

    invoke-virtual {v9}, Lr7/d;->a()D

    move-result-wide v9

    invoke-static {v9, v10}, Landroid/health/connect/datatypes/units/BloodGlucose;->fromMillimolesPerLiter(D)Landroid/health/connect/datatypes/units/BloodGlucose;

    move-result-object v9

    const-string v10, "fromMillimolesPerLiter(inMillimolesPerLiter)"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget v10, v8, Lm7/d;->f:I

    sget-object v12, Li7/a;->y:Ljava/lang/Object;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v12, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    if-eqz v10, :cond_b

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    move/from16 v17, v10

    goto :goto_3

    :cond_b
    const/16 v17, 0x0

    :goto_3
    iget v10, v8, Lm7/d;->e:I

    sget-object v12, Li7/a;->g:Ljava/lang/Object;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v12, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    if-eqz v10, :cond_c

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v11

    move/from16 v18, v11

    goto :goto_4

    :cond_c
    const/16 v18, 0x0

    :goto_4
    new-instance v12, Landroid/health/connect/datatypes/BloodGlucoseRecord$Builder;

    move-object/from16 v16, v9

    invoke-direct/range {v12 .. v18}, Landroid/health/connect/datatypes/BloodGlucoseRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;ILandroid/health/connect/datatypes/units/BloodGlucose;II)V

    iget-object v8, v8, Lm7/d;->b:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_d

    invoke-virtual {v12, v8}, Landroid/health/connect/datatypes/BloodGlucoseRecord$Builder;->setZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/BloodGlucoseRecord$Builder;

    :cond_d
    invoke-virtual {v12}, Landroid/health/connect/datatypes/BloodGlucoseRecord$Builder;->build()Landroid/health/connect/datatypes/BloodGlucoseRecord;

    move-result-object v8

    const-string v9, "PlatformBloodGlucoseReco\u2026(it) } }\n        .build()"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_e
    instance-of v9, v8, Lm7/e;

    if-eqz v9, :cond_12

    check-cast v8, Lm7/e;

    new-instance v9, Landroid/health/connect/datatypes/BloodPressureRecord$Builder;

    iget-object v9, v8, Lm7/e;->g:Ln7/c;

    invoke-static {v9}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v13

    iget-object v14, v8, Lm7/e;->a:Ljava/time/Instant;

    iget v9, v8, Lm7/e;->f:I

    sget-object v10, Li7/a;->o:Ljava/lang/Object;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    if-eqz v9, :cond_f

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    move v15, v9

    goto :goto_5

    :cond_f
    const/4 v15, 0x0

    :goto_5
    iget-object v9, v8, Lm7/e;->c:Lr7/j0;

    iget-wide v9, v9, Lr7/j0;->w:D

    invoke-static {v9, v10}, Landroid/health/connect/datatypes/units/Pressure;->fromMillimetersOfMercury(D)Landroid/health/connect/datatypes/units/Pressure;

    move-result-object v9

    const-string v10, "fromMillimetersOfMercury(inMillimetersOfMercury)"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v12, v8, Lm7/e;->d:Lr7/j0;

    iget-wide v11, v12, Lr7/j0;->w:D

    invoke-static {v11, v12}, Landroid/health/connect/datatypes/units/Pressure;->fromMillimetersOfMercury(D)Landroid/health/connect/datatypes/units/Pressure;

    move-result-object v11

    invoke-static {v11, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget v10, v8, Lm7/e;->e:I

    sget-object v12, Li7/a;->c:Ljava/lang/Object;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v12, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    if-eqz v10, :cond_10

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    move/from16 v18, v10

    goto :goto_6

    :cond_10
    const/16 v18, 0x0

    :goto_6
    new-instance v12, Landroid/health/connect/datatypes/BloodPressureRecord$Builder;

    move-object/from16 v16, v9

    move-object/from16 v17, v11

    invoke-direct/range {v12 .. v18}, Landroid/health/connect/datatypes/BloodPressureRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;ILandroid/health/connect/datatypes/units/Pressure;Landroid/health/connect/datatypes/units/Pressure;I)V

    iget-object v8, v8, Lm7/e;->b:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_11

    invoke-virtual {v12, v8}, Landroid/health/connect/datatypes/BloodPressureRecord$Builder;->setZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/BloodPressureRecord$Builder;

    :cond_11
    invoke-virtual {v12}, Landroid/health/connect/datatypes/BloodPressureRecord$Builder;->build()Landroid/health/connect/datatypes/BloodPressureRecord;

    move-result-object v8

    const-string v9, "PlatformBloodPressureRec\u2026(it) } }\n        .build()"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_12
    instance-of v9, v8, Lm7/f;

    const-string v11, "fromValue(value)"

    if-eqz v9, :cond_14

    check-cast v8, Lm7/f;

    new-instance v9, Landroid/health/connect/datatypes/BodyFatRecord$Builder;

    iget-object v9, v8, Lm7/f;->d:Ln7/c;

    invoke-static {v9}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v9

    iget-object v10, v8, Lm7/f;->a:Ljava/time/Instant;

    iget-object v12, v8, Lm7/f;->c:Lr7/c0;

    iget-wide v12, v12, Lr7/c0;->w:D

    invoke-static {v12, v13}, Landroid/health/connect/datatypes/units/Percentage;->fromValue(D)Landroid/health/connect/datatypes/units/Percentage;

    move-result-object v12

    invoke-static {v12, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v11, Landroid/health/connect/datatypes/BodyFatRecord$Builder;

    invoke-direct {v11, v9, v10, v12}, Landroid/health/connect/datatypes/BodyFatRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Landroid/health/connect/datatypes/units/Percentage;)V

    iget-object v8, v8, Lm7/f;->b:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_13

    invoke-virtual {v11, v8}, Landroid/health/connect/datatypes/BodyFatRecord$Builder;->setZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/BodyFatRecord$Builder;

    :cond_13
    invoke-virtual {v11}, Landroid/health/connect/datatypes/BodyFatRecord$Builder;->build()Landroid/health/connect/datatypes/BodyFatRecord;

    move-result-object v8

    const-string v9, "PlatformBodyFatRecordBui\u2026(it) } }\n        .build()"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_14
    instance-of v9, v8, Lm7/h;

    if-eqz v9, :cond_17

    check-cast v8, Lm7/h;

    new-instance v9, Landroid/health/connect/datatypes/BodyTemperatureRecord$Builder;

    iget-object v9, v8, Lm7/h;->e:Ln7/c;

    invoke-static {v9}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v9

    iget-object v11, v8, Lm7/h;->a:Ljava/time/Instant;

    iget v12, v8, Lm7/h;->d:I

    sget-object v13, Li7/a;->m:Ljava/lang/Object;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v13, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Integer;

    if-eqz v12, :cond_15

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    goto :goto_7

    :cond_15
    const/4 v12, 0x0

    :goto_7
    iget-object v13, v8, Lm7/h;->c:Lr7/k0;

    iget-wide v13, v13, Lr7/k0;->w:D

    invoke-static {v13, v14}, Landroid/health/connect/datatypes/units/Temperature;->fromCelsius(D)Landroid/health/connect/datatypes/units/Temperature;

    move-result-object v13

    invoke-static {v13, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v10, Landroid/health/connect/datatypes/BodyTemperatureRecord$Builder;

    invoke-direct {v10, v9, v11, v12, v13}, Landroid/health/connect/datatypes/BodyTemperatureRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;ILandroid/health/connect/datatypes/units/Temperature;)V

    iget-object v8, v8, Lm7/h;->b:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_16

    invoke-virtual {v10, v8}, Landroid/health/connect/datatypes/BodyTemperatureRecord$Builder;->setZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/BodyTemperatureRecord$Builder;

    :cond_16
    invoke-virtual {v10}, Landroid/health/connect/datatypes/BodyTemperatureRecord$Builder;->build()Landroid/health/connect/datatypes/BodyTemperatureRecord;

    move-result-object v8

    const-string v9, "PlatformBodyTemperatureR\u2026(it) } }\n        .build()"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_17
    instance-of v9, v8, Lm7/i;

    if-eqz v9, :cond_19

    check-cast v8, Lm7/i;

    new-instance v9, Landroid/health/connect/datatypes/BodyWaterMassRecord$Builder;

    iget-object v9, v8, Lm7/i;->d:Ln7/c;

    invoke-static {v9}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v9

    iget-object v10, v8, Lm7/i;->a:Ljava/time/Instant;

    iget-object v11, v8, Lm7/i;->c:Lr7/b0;

    invoke-static {v11}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v11

    new-instance v12, Landroid/health/connect/datatypes/BodyWaterMassRecord$Builder;

    invoke-direct {v12, v9, v10, v11}, Landroid/health/connect/datatypes/BodyWaterMassRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Landroid/health/connect/datatypes/units/Mass;)V

    iget-object v8, v8, Lm7/i;->b:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_18

    invoke-virtual {v12, v8}, Landroid/health/connect/datatypes/BodyWaterMassRecord$Builder;->setZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/BodyWaterMassRecord$Builder;

    :cond_18
    invoke-virtual {v12}, Landroid/health/connect/datatypes/BodyWaterMassRecord$Builder;->build()Landroid/health/connect/datatypes/BodyWaterMassRecord;

    move-result-object v8

    const-string v9, "PlatformBodyWaterMassRec\u2026(it) } }\n        .build()"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_19
    instance-of v9, v8, Lm7/j;

    if-eqz v9, :cond_1b

    check-cast v8, Lm7/j;

    new-instance v9, Landroid/health/connect/datatypes/BoneMassRecord$Builder;

    iget-object v9, v8, Lm7/j;->d:Ln7/c;

    invoke-static {v9}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v9

    iget-object v10, v8, Lm7/j;->a:Ljava/time/Instant;

    iget-object v11, v8, Lm7/j;->c:Lr7/b0;

    invoke-static {v11}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v11

    new-instance v12, Landroid/health/connect/datatypes/BoneMassRecord$Builder;

    invoke-direct {v12, v9, v10, v11}, Landroid/health/connect/datatypes/BoneMassRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Landroid/health/connect/datatypes/units/Mass;)V

    iget-object v8, v8, Lm7/j;->b:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_1a

    invoke-virtual {v12, v8}, Landroid/health/connect/datatypes/BoneMassRecord$Builder;->setZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/BoneMassRecord$Builder;

    :cond_1a
    invoke-virtual {v12}, Landroid/health/connect/datatypes/BoneMassRecord$Builder;->build()Landroid/health/connect/datatypes/BoneMassRecord;

    move-result-object v8

    const-string v9, "PlatformBoneMassRecordBu\u2026(it) } }\n        .build()"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_1b
    instance-of v9, v8, Lm7/k;

    if-eqz v9, :cond_1f

    check-cast v8, Lm7/k;

    new-instance v9, Landroid/health/connect/datatypes/CervicalMucusRecord$Builder;

    iget-object v9, v8, Lm7/k;->e:Ln7/c;

    invoke-static {v9}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v9

    iget-object v10, v8, Lm7/k;->a:Ljava/time/Instant;

    iget v11, v8, Lm7/k;->d:I

    sget-object v12, Li7/a;->s:Ljava/lang/Object;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Integer;

    if-eqz v11, :cond_1c

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    goto :goto_8

    :cond_1c
    const/4 v11, 0x0

    :goto_8
    iget v12, v8, Lm7/k;->c:I

    sget-object v13, Li7/a;->a:Ljava/lang/Object;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v13, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Integer;

    if-eqz v12, :cond_1d

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    goto :goto_9

    :cond_1d
    const/4 v12, 0x0

    :goto_9
    new-instance v13, Landroid/health/connect/datatypes/CervicalMucusRecord$Builder;

    invoke-direct {v13, v9, v10, v11, v12}, Landroid/health/connect/datatypes/CervicalMucusRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;II)V

    iget-object v8, v8, Lm7/k;->b:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_1e

    invoke-virtual {v13, v8}, Landroid/health/connect/datatypes/CervicalMucusRecord$Builder;->setZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/CervicalMucusRecord$Builder;

    :cond_1e
    invoke-virtual {v13}, Landroid/health/connect/datatypes/CervicalMucusRecord$Builder;->build()Landroid/health/connect/datatypes/CervicalMucusRecord;

    move-result-object v8

    const-string v9, "PlatformCervicalMucusRec\u2026(it) } }\n        .build()"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_1f
    instance-of v9, v8, Lm7/m;

    if-eqz v9, :cond_23

    check-cast v8, Lm7/m;

    iget-object v9, v8, Lm7/m;->f:Ln7/c;

    invoke-static {v9}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v9

    iget-object v10, v8, Lm7/m;->a:Ljava/time/Instant;

    iget-object v11, v8, Lm7/m;->c:Ljava/time/Instant;

    iget-object v12, v8, Lm7/m;->e:Ljava/util/List;

    check-cast v12, Ljava/lang/Iterable;

    new-instance v13, Ljava/util/ArrayList;

    invoke-static {v12, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_a
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_20

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lm7/l;

    new-instance v15, Landroid/health/connect/datatypes/CyclingPedalingCadenceRecord$CyclingPedalingCadenceRecordSample;

    move-object/from16 p1, v8

    iget-wide v7, v14, Lm7/l;->b:D

    iget-object v14, v14, Lm7/l;->a:Ljava/time/Instant;

    new-instance v15, Landroid/health/connect/datatypes/CyclingPedalingCadenceRecord$CyclingPedalingCadenceRecordSample;

    invoke-direct {v15, v7, v8, v14}, Landroid/health/connect/datatypes/CyclingPedalingCadenceRecord$CyclingPedalingCadenceRecordSample;-><init>(DLjava/time/Instant;)V

    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v8, p1

    const/16 v7, 0xa

    goto :goto_a

    :cond_20
    move-object/from16 p1, v8

    new-instance v7, Landroid/health/connect/datatypes/CyclingPedalingCadenceRecord$Builder;

    invoke-direct {v7, v9, v10, v11, v13}, Landroid/health/connect/datatypes/CyclingPedalingCadenceRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;Ljava/util/List;)V

    iget-object v9, v8, Lm7/m;->b:Ljava/time/ZoneOffset;

    if-eqz v9, :cond_21

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/CyclingPedalingCadenceRecord$Builder;->setStartZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/CyclingPedalingCadenceRecord$Builder;

    :cond_21
    iget-object v8, v8, Lm7/m;->d:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_22

    invoke-virtual {v7, v8}, Landroid/health/connect/datatypes/CyclingPedalingCadenceRecord$Builder;->setEndZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/CyclingPedalingCadenceRecord$Builder;

    :cond_22
    invoke-virtual {v7}, Landroid/health/connect/datatypes/CyclingPedalingCadenceRecord$Builder;->build()Landroid/health/connect/datatypes/CyclingPedalingCadenceRecord;

    move-result-object v8

    const-string v7, "PlatformCyclingPedalingC\u2026       }\n        .build()"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_23
    instance-of v7, v8, Lm7/n;

    if-eqz v7, :cond_26

    check-cast v8, Lm7/n;

    new-instance v7, Landroid/health/connect/datatypes/DistanceRecord$Builder;

    iget-object v7, v8, Lm7/n;->f:Ln7/c;

    invoke-static {v7}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v7

    iget-object v9, v8, Lm7/n;->a:Ljava/time/Instant;

    iget-object v10, v8, Lm7/n;->c:Ljava/time/Instant;

    iget-object v11, v8, Lm7/n;->e:Lr7/s;

    invoke-static {v11}, Lb3/g1;->A(Lr7/s;)Landroid/health/connect/datatypes/units/Length;

    move-result-object v11

    new-instance v12, Landroid/health/connect/datatypes/DistanceRecord$Builder;

    invoke-direct {v12, v7, v9, v10, v11}, Landroid/health/connect/datatypes/DistanceRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;Landroid/health/connect/datatypes/units/Length;)V

    iget-object v7, v8, Lm7/n;->b:Ljava/time/ZoneOffset;

    if-eqz v7, :cond_24

    invoke-virtual {v12, v7}, Landroid/health/connect/datatypes/DistanceRecord$Builder;->setStartZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/DistanceRecord$Builder;

    :cond_24
    iget-object v7, v8, Lm7/n;->d:Ljava/time/ZoneOffset;

    if-eqz v7, :cond_25

    invoke-virtual {v12, v7}, Landroid/health/connect/datatypes/DistanceRecord$Builder;->setEndZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/DistanceRecord$Builder;

    :cond_25
    invoke-virtual {v12}, Landroid/health/connect/datatypes/DistanceRecord$Builder;->build()Landroid/health/connect/datatypes/DistanceRecord;

    move-result-object v8

    const-string v7, "PlatformDistanceRecordBu\u2026       }\n        .build()"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_26
    instance-of v7, v8, Lm7/o;

    if-eqz v7, :cond_29

    check-cast v8, Lm7/o;

    new-instance v7, Landroid/health/connect/datatypes/ElevationGainedRecord$Builder;

    iget-object v7, v8, Lm7/o;->f:Ln7/c;

    invoke-static {v7}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v7

    iget-object v9, v8, Lm7/o;->a:Ljava/time/Instant;

    iget-object v10, v8, Lm7/o;->c:Ljava/time/Instant;

    iget-object v11, v8, Lm7/o;->e:Lr7/s;

    invoke-static {v11}, Lb3/g1;->A(Lr7/s;)Landroid/health/connect/datatypes/units/Length;

    move-result-object v11

    invoke-static {v7, v9, v10, v11}, Li7/d;->a(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;Landroid/health/connect/datatypes/units/Length;)Landroid/health/connect/datatypes/ElevationGainedRecord$Builder;

    move-result-object v7

    iget-object v9, v8, Lm7/o;->b:Ljava/time/ZoneOffset;

    if-eqz v9, :cond_27

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/ElevationGainedRecord$Builder;->setStartZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/ElevationGainedRecord$Builder;

    :cond_27
    iget-object v8, v8, Lm7/o;->d:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_28

    invoke-virtual {v7, v8}, Landroid/health/connect/datatypes/ElevationGainedRecord$Builder;->setEndZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/ElevationGainedRecord$Builder;

    :cond_28
    invoke-virtual {v7}, Landroid/health/connect/datatypes/ElevationGainedRecord$Builder;->build()Landroid/health/connect/datatypes/ElevationGainedRecord;

    move-result-object v8

    const-string v7, "PlatformElevationGainedR\u2026       }\n        .build()"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_29
    instance-of v7, v8, Lm7/w;

    if-eqz v7, :cond_38

    check-cast v8, Lm7/w;

    new-instance v7, Landroid/health/connect/datatypes/ExerciseSessionRecord$Builder;

    iget-object v7, v8, Lm7/w;->h:Ln7/c;

    invoke-static {v7}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v7

    iget-object v9, v8, Lm7/w;->a:Ljava/time/Instant;

    iget-object v10, v8, Lm7/w;->c:Ljava/time/Instant;

    iget v11, v8, Lm7/w;->e:I

    sget-object v12, Li7/a;->e:Ljava/lang/Object;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Integer;

    if-eqz v11, :cond_2a

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    goto :goto_b

    :cond_2a
    const/4 v11, 0x0

    :goto_b
    invoke-static {v7, v9, v10, v11}, Le7/h;->b(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;I)Landroid/health/connect/datatypes/ExerciseSessionRecord$Builder;

    move-result-object v7

    iget-object v9, v8, Lm7/w;->b:Ljava/time/ZoneOffset;

    if-eqz v9, :cond_2b

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/ExerciseSessionRecord$Builder;->setStartZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/ExerciseSessionRecord$Builder;

    :cond_2b
    iget-object v9, v8, Lm7/w;->d:Ljava/time/ZoneOffset;

    if-eqz v9, :cond_2c

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/ExerciseSessionRecord$Builder;->setEndZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/ExerciseSessionRecord$Builder;

    :cond_2c
    iget-object v9, v8, Lm7/w;->g:Ljava/lang/String;

    if-eqz v9, :cond_2d

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/ExerciseSessionRecord$Builder;->setNotes(Ljava/lang/CharSequence;)Landroid/health/connect/datatypes/ExerciseSessionRecord$Builder;

    :cond_2d
    iget-object v9, v8, Lm7/w;->f:Ljava/lang/String;

    if-eqz v9, :cond_2e

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/ExerciseSessionRecord$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/health/connect/datatypes/ExerciseSessionRecord$Builder;

    :cond_2e
    iget-object v9, v8, Lm7/w;->j:Ljava/util/List;

    check-cast v9, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    const/16 v15, 0xa

    invoke-static {v9, v15}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_c
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_30

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lm7/p;

    invoke-static {}, Li7/d;->h()V

    iget-object v12, v11, Lm7/p;->a:Ljava/time/Instant;

    iget-object v13, v11, Lm7/p;->b:Ljava/time/Instant;

    invoke-static {v12, v13}, Li7/c;->a(Ljava/time/Instant;Ljava/time/Instant;)Landroid/health/connect/datatypes/ExerciseLap$Builder;

    move-result-object v12

    iget-object v11, v11, Lm7/p;->c:Lr7/s;

    if-eqz v11, :cond_2f

    invoke-static {v11}, Lb3/g1;->A(Lr7/s;)Landroid/health/connect/datatypes/units/Length;

    move-result-object v11

    invoke-virtual {v12, v11}, Landroid/health/connect/datatypes/ExerciseLap$Builder;->setLength(Landroid/health/connect/datatypes/units/Length;)Landroid/health/connect/datatypes/ExerciseLap$Builder;

    :cond_2f
    invoke-virtual {v12}, Landroid/health/connect/datatypes/ExerciseLap$Builder;->build()Landroid/health/connect/datatypes/ExerciseLap;

    move-result-object v11

    const-string v12, "PlatformExerciseLapBuild\u2026h()) } }\n        .build()"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_30
    invoke-virtual {v7, v10}, Landroid/health/connect/datatypes/ExerciseSessionRecord$Builder;->setLaps(Ljava/util/List;)Landroid/health/connect/datatypes/ExerciseSessionRecord$Builder;

    iget-object v9, v8, Lm7/w;->i:Ljava/util/List;

    check-cast v9, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    const/16 v15, 0xa

    invoke-static {v9, v15}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_d
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_32

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lm7/v;

    invoke-static {}, Li7/d;->n()V

    iget-object v12, v11, Lm7/v;->a:Ljava/time/Instant;

    iget-object v13, v11, Lm7/v;->b:Ljava/time/Instant;

    iget v14, v11, Lm7/v;->c:I

    sget-object v15, Li7/a;->C:Ljava/lang/Object;

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-interface {v15, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Integer;

    if-eqz v14, :cond_31

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    goto :goto_e

    :cond_31
    const/4 v14, 0x0

    :goto_e
    invoke-static {v12, v13, v14}, Li7/d;->b(Ljava/time/Instant;Ljava/time/Instant;I)Landroid/health/connect/datatypes/ExerciseSegment$Builder;

    move-result-object v12

    iget v11, v11, Lm7/v;->d:I

    invoke-virtual {v12, v11}, Landroid/health/connect/datatypes/ExerciseSegment$Builder;->setRepetitionsCount(I)Landroid/health/connect/datatypes/ExerciseSegment$Builder;

    move-result-object v11

    invoke-virtual {v11}, Landroid/health/connect/datatypes/ExerciseSegment$Builder;->build()Landroid/health/connect/datatypes/ExerciseSegment;

    move-result-object v11

    const-string v12, "PlatformExerciseSegmentB\u2026titions)\n        .build()"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_32
    invoke-virtual {v7, v10}, Landroid/health/connect/datatypes/ExerciseSessionRecord$Builder;->setSegments(Ljava/util/List;)Landroid/health/connect/datatypes/ExerciseSessionRecord$Builder;

    iget-object v8, v8, Lm7/w;->k:Lkotlin/jvm/internal/j;

    instance-of v9, v8, Lm7/t;

    if-eqz v9, :cond_37

    check-cast v8, Lm7/t;

    iget-object v8, v8, Lm7/t;->a:Lm7/r;

    iget-object v8, v8, Lm7/r;->a:Ljava/util/ArrayList;

    new-instance v9, Ljava/util/ArrayList;

    const/16 v15, 0xa

    invoke-static {v8, v15}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_f
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_36

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lm7/q;

    invoke-static {}, Li7/c;->o()V

    iget-object v11, v10, Lm7/q;->a:Ljava/time/Instant;

    iget-wide v12, v10, Lm7/q;->b:D

    iget-wide v14, v10, Lm7/q;->c:D

    invoke-static {v11, v12, v13, v14, v15}, Li7/c;->b(Ljava/time/Instant;DD)Landroid/health/connect/datatypes/ExerciseRoute$Location$Builder;

    move-result-object v11

    iget-object v12, v10, Lm7/q;->d:Lr7/s;

    if-eqz v12, :cond_33

    invoke-static {v12}, Lb3/g1;->A(Lr7/s;)Landroid/health/connect/datatypes/units/Length;

    move-result-object v12

    invoke-virtual {v11, v12}, Landroid/health/connect/datatypes/ExerciseRoute$Location$Builder;->setHorizontalAccuracy(Landroid/health/connect/datatypes/units/Length;)Landroid/health/connect/datatypes/ExerciseRoute$Location$Builder;

    :cond_33
    iget-object v12, v10, Lm7/q;->e:Lr7/s;

    if-eqz v12, :cond_34

    invoke-static {v12}, Lb3/g1;->A(Lr7/s;)Landroid/health/connect/datatypes/units/Length;

    move-result-object v12

    invoke-virtual {v11, v12}, Landroid/health/connect/datatypes/ExerciseRoute$Location$Builder;->setVerticalAccuracy(Landroid/health/connect/datatypes/units/Length;)Landroid/health/connect/datatypes/ExerciseRoute$Location$Builder;

    :cond_34
    iget-object v10, v10, Lm7/q;->f:Lr7/s;

    if-eqz v10, :cond_35

    invoke-static {v10}, Lb3/g1;->A(Lr7/s;)Landroid/health/connect/datatypes/units/Length;

    move-result-object v10

    invoke-virtual {v11, v10}, Landroid/health/connect/datatypes/ExerciseRoute$Location$Builder;->setAltitude(Landroid/health/connect/datatypes/units/Length;)Landroid/health/connect/datatypes/ExerciseRoute$Location$Builder;

    :cond_35
    invoke-virtual {v11}, Landroid/health/connect/datatypes/ExerciseRoute$Location$Builder;->build()Landroid/health/connect/datatypes/ExerciseRoute$Location;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_36
    invoke-static {v9}, Li7/c;->c(Ljava/util/ArrayList;)Landroid/health/connect/datatypes/ExerciseRoute;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/health/connect/datatypes/ExerciseSessionRecord$Builder;->setRoute(Landroid/health/connect/datatypes/ExerciseRoute;)Landroid/health/connect/datatypes/ExerciseSessionRecord$Builder;

    :cond_37
    invoke-virtual {v7}, Landroid/health/connect/datatypes/ExerciseSessionRecord$Builder;->build()Landroid/health/connect/datatypes/ExerciseSessionRecord;

    move-result-object v8

    const-string v7, "PlatformExerciseSessionR\u2026       }\n        .build()"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_38
    instance-of v7, v8, Lm7/x;

    if-eqz v7, :cond_3b

    check-cast v8, Lm7/x;

    invoke-static {}, Le7/h;->r()V

    iget-object v7, v8, Lm7/x;->f:Ln7/c;

    invoke-static {v7}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v7

    iget-object v9, v8, Lm7/x;->a:Ljava/time/Instant;

    iget-object v10, v8, Lm7/x;->c:Ljava/time/Instant;

    iget-wide v11, v8, Lm7/x;->e:D

    invoke-static {v7, v9, v10, v11, v12}, Le7/h;->c(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;D)Landroid/health/connect/datatypes/FloorsClimbedRecord$Builder;

    move-result-object v7

    iget-object v9, v8, Lm7/x;->b:Ljava/time/ZoneOffset;

    if-eqz v9, :cond_39

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/FloorsClimbedRecord$Builder;->setStartZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/FloorsClimbedRecord$Builder;

    :cond_39
    iget-object v8, v8, Lm7/x;->d:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_3a

    invoke-virtual {v7, v8}, Landroid/health/connect/datatypes/FloorsClimbedRecord$Builder;->setEndZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/FloorsClimbedRecord$Builder;

    :cond_3a
    invoke-virtual {v7}, Landroid/health/connect/datatypes/FloorsClimbedRecord$Builder;->build()Landroid/health/connect/datatypes/FloorsClimbedRecord;

    move-result-object v8

    const-string v7, "PlatformFloorsClimbedRec\u2026       }\n        .build()"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_3b
    instance-of v7, v8, Lm7/z;

    if-eqz v7, :cond_3f

    check-cast v8, Lm7/z;

    iget-object v7, v8, Lm7/z;->f:Ln7/c;

    invoke-static {v7}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v7

    iget-object v9, v8, Lm7/z;->a:Ljava/time/Instant;

    iget-object v10, v8, Lm7/z;->c:Ljava/time/Instant;

    iget-object v11, v8, Lm7/z;->e:Ljava/util/List;

    check-cast v11, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    const/16 v15, 0xa

    invoke-static {v11, v15}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_10
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_3c

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lm7/y;

    invoke-static {}, Li7/c;->s()V

    iget-wide v14, v13, Lm7/y;->b:J

    iget-object v13, v13, Lm7/y;->a:Ljava/time/Instant;

    invoke-static {v14, v15, v13}, Le7/h;->e(JLjava/time/Instant;)Landroid/health/connect/datatypes/HeartRateRecord$HeartRateSample;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_10

    :cond_3c
    invoke-static {v7, v9, v10, v12}, Le7/h;->d(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;Ljava/util/ArrayList;)Landroid/health/connect/datatypes/HeartRateRecord$Builder;

    move-result-object v7

    iget-object v9, v8, Lm7/z;->b:Ljava/time/ZoneOffset;

    if-eqz v9, :cond_3d

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/HeartRateRecord$Builder;->setStartZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/HeartRateRecord$Builder;

    :cond_3d
    iget-object v8, v8, Lm7/z;->d:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_3e

    invoke-virtual {v7, v8}, Landroid/health/connect/datatypes/HeartRateRecord$Builder;->setEndZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/HeartRateRecord$Builder;

    :cond_3e
    invoke-virtual {v7}, Landroid/health/connect/datatypes/HeartRateRecord$Builder;->build()Landroid/health/connect/datatypes/HeartRateRecord;

    move-result-object v8

    const-string v7, "PlatformHeartRateRecordB\u2026       }\n        .build()"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_3f
    instance-of v7, v8, Lm7/a0;

    if-eqz v7, :cond_41

    check-cast v8, Lm7/a0;

    invoke-static {}, Li7/c;->t()V

    iget-object v7, v8, Lm7/a0;->d:Ln7/c;

    invoke-static {v7}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v7

    iget-object v9, v8, Lm7/a0;->a:Ljava/time/Instant;

    iget-wide v10, v8, Lm7/a0;->c:D

    invoke-static {v7, v9, v10, v11}, Li7/c;->d(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;D)Landroid/health/connect/datatypes/HeartRateVariabilityRmssdRecord$Builder;

    move-result-object v7

    iget-object v8, v8, Lm7/a0;->b:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_40

    invoke-virtual {v7, v8}, Landroid/health/connect/datatypes/HeartRateVariabilityRmssdRecord$Builder;->setZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/HeartRateVariabilityRmssdRecord$Builder;

    :cond_40
    invoke-virtual {v7}, Landroid/health/connect/datatypes/HeartRateVariabilityRmssdRecord$Builder;->build()Landroid/health/connect/datatypes/HeartRateVariabilityRmssdRecord;

    move-result-object v8

    const-string v7, "PlatformHeartRateVariabi\u2026(it) } }\n        .build()"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_41
    instance-of v7, v8, Lm7/b0;

    if-eqz v7, :cond_43

    check-cast v8, Lm7/b0;

    invoke-static {}, Li7/c;->q()V

    iget-object v7, v8, Lm7/b0;->d:Ln7/c;

    invoke-static {v7}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v7

    iget-object v9, v8, Lm7/b0;->a:Ljava/time/Instant;

    iget-object v10, v8, Lm7/b0;->c:Lr7/s;

    invoke-static {v10}, Lb3/g1;->A(Lr7/s;)Landroid/health/connect/datatypes/units/Length;

    move-result-object v10

    invoke-static {v7, v9, v10}, Li7/c;->e(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Landroid/health/connect/datatypes/units/Length;)Landroid/health/connect/datatypes/HeightRecord$Builder;

    move-result-object v7

    iget-object v8, v8, Lm7/b0;->b:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_42

    invoke-virtual {v7, v8}, Landroid/health/connect/datatypes/HeightRecord$Builder;->setZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/HeightRecord$Builder;

    :cond_42
    invoke-virtual {v7}, Landroid/health/connect/datatypes/HeightRecord$Builder;->build()Landroid/health/connect/datatypes/HeightRecord;

    move-result-object v8

    const-string v7, "PlatformHeightRecordBuil\u2026(it) } }\n        .build()"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_43
    instance-of v7, v8, Lm7/d0;

    if-eqz v7, :cond_46

    check-cast v8, Lm7/d0;

    invoke-static {}, Li7/c;->p()V

    iget-object v7, v8, Lm7/d0;->f:Ln7/c;

    invoke-static {v7}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v7

    iget-object v9, v8, Lm7/d0;->a:Ljava/time/Instant;

    iget-object v10, v8, Lm7/d0;->c:Ljava/time/Instant;

    iget-object v11, v8, Lm7/d0;->e:Lr7/w0;

    invoke-virtual {v11}, Lr7/w0;->a()D

    move-result-wide v11

    invoke-static {v11, v12}, Landroid/health/connect/datatypes/units/Volume;->fromLiters(D)Landroid/health/connect/datatypes/units/Volume;

    move-result-object v11

    const-string v12, "fromLiters(inLiters)"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v9, v10, v11}, Li7/c;->f(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;Landroid/health/connect/datatypes/units/Volume;)Landroid/health/connect/datatypes/HydrationRecord$Builder;

    move-result-object v7

    iget-object v9, v8, Lm7/d0;->b:Ljava/time/ZoneOffset;

    if-eqz v9, :cond_44

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/HydrationRecord$Builder;->setStartZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/HydrationRecord$Builder;

    :cond_44
    iget-object v8, v8, Lm7/d0;->d:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_45

    invoke-virtual {v7, v8}, Landroid/health/connect/datatypes/HydrationRecord$Builder;->setEndZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/HydrationRecord$Builder;

    :cond_45
    invoke-virtual {v7}, Landroid/health/connect/datatypes/HydrationRecord$Builder;->build()Landroid/health/connect/datatypes/HydrationRecord;

    move-result-object v8

    const-string v7, "PlatformHydrationRecordB\u2026       }\n        .build()"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_46
    instance-of v7, v8, Lm7/f0;

    if-eqz v7, :cond_48

    check-cast v8, Lm7/f0;

    invoke-static {}, Le7/h;->v()V

    iget-object v7, v8, Lm7/f0;->c:Ln7/c;

    invoke-static {v7}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v7

    iget-object v9, v8, Lm7/f0;->a:Ljava/time/Instant;

    invoke-static {v7, v9}, Le7/h;->f(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;)Landroid/health/connect/datatypes/IntermenstrualBleedingRecord$Builder;

    move-result-object v7

    iget-object v8, v8, Lm7/f0;->b:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_47

    invoke-virtual {v7, v8}, Landroid/health/connect/datatypes/IntermenstrualBleedingRecord$Builder;->setZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/IntermenstrualBleedingRecord$Builder;

    :cond_47
    invoke-virtual {v7}, Landroid/health/connect/datatypes/IntermenstrualBleedingRecord$Builder;->build()Landroid/health/connect/datatypes/IntermenstrualBleedingRecord;

    move-result-object v8

    const-string v7, "PlatformIntermenstrualBl\u2026(it) } }\n        .build()"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_48
    instance-of v7, v8, Lm7/h0;

    if-eqz v7, :cond_4a

    check-cast v8, Lm7/h0;

    invoke-static {}, Li7/d;->i()V

    iget-object v7, v8, Lm7/h0;->d:Ln7/c;

    invoke-static {v7}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v7

    iget-object v9, v8, Lm7/h0;->a:Ljava/time/Instant;

    iget-object v10, v8, Lm7/h0;->c:Lr7/b0;

    invoke-static {v10}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v10

    invoke-static {v7, v9, v10}, Li7/d;->c(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/LeanBodyMassRecord$Builder;

    move-result-object v7

    iget-object v8, v8, Lm7/h0;->b:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_49

    invoke-virtual {v7, v8}, Landroid/health/connect/datatypes/LeanBodyMassRecord$Builder;->setZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/LeanBodyMassRecord$Builder;

    :cond_49
    invoke-virtual {v7}, Landroid/health/connect/datatypes/LeanBodyMassRecord$Builder;->build()Landroid/health/connect/datatypes/LeanBodyMassRecord;

    move-result-object v8

    const-string v7, "PlatformLeanBodyMassReco\u2026(it) } }\n        .build()"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_4a
    instance-of v7, v8, Lm7/j0;

    if-eqz v7, :cond_4d

    check-cast v8, Lm7/j0;

    invoke-static {}, Le7/h;->y()V

    iget-object v7, v8, Lm7/j0;->d:Ln7/c;

    invoke-static {v7}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v7

    iget-object v9, v8, Lm7/j0;->a:Ljava/time/Instant;

    iget v10, v8, Lm7/j0;->c:I

    sget-object v11, Li7/a;->k:Ljava/lang/Object;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    if-eqz v10, :cond_4b

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v11

    goto :goto_11

    :cond_4b
    const/4 v11, 0x0

    :goto_11
    invoke-static {v7, v9, v11}, Le7/h;->g(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;I)Landroid/health/connect/datatypes/MenstruationFlowRecord$Builder;

    move-result-object v7

    iget-object v8, v8, Lm7/j0;->b:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_4c

    invoke-virtual {v7, v8}, Landroid/health/connect/datatypes/MenstruationFlowRecord$Builder;->setZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/MenstruationFlowRecord$Builder;

    :cond_4c
    invoke-virtual {v7}, Landroid/health/connect/datatypes/MenstruationFlowRecord$Builder;->build()Landroid/health/connect/datatypes/MenstruationFlowRecord;

    move-result-object v8

    const-string v7, "PlatformMenstruationFlow\u2026(it) } }\n        .build()"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_4d
    instance-of v7, v8, Lm7/k0;

    if-eqz v7, :cond_50

    check-cast v8, Lm7/k0;

    invoke-static {}, Le7/h;->x()V

    iget-object v7, v8, Lm7/k0;->e:Ln7/c;

    invoke-static {v7}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v7

    iget-object v9, v8, Lm7/k0;->a:Ljava/time/Instant;

    iget-object v10, v8, Lm7/k0;->c:Ljava/time/Instant;

    invoke-static {v7, v9, v10}, Le7/h;->h(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;)Landroid/health/connect/datatypes/MenstruationPeriodRecord$Builder;

    move-result-object v7

    iget-object v9, v8, Lm7/k0;->b:Ljava/time/ZoneOffset;

    if-eqz v9, :cond_4e

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/MenstruationPeriodRecord$Builder;->setStartZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/MenstruationPeriodRecord$Builder;

    :cond_4e
    iget-object v8, v8, Lm7/k0;->d:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_4f

    invoke-virtual {v7, v8}, Landroid/health/connect/datatypes/MenstruationPeriodRecord$Builder;->setEndZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/MenstruationPeriodRecord$Builder;

    :cond_4f
    invoke-virtual {v7}, Landroid/health/connect/datatypes/MenstruationPeriodRecord$Builder;->build()Landroid/health/connect/datatypes/MenstruationPeriodRecord;

    move-result-object v8

    const-string v7, "PlatformMenstruationPeri\u2026       }\n        .build()"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_50
    instance-of v7, v8, Lm7/m0;

    if-eqz v7, :cond_7f

    check-cast v8, Lm7/m0;

    invoke-static {}, Li7/c;->w()V

    iget-object v7, v8, Lm7/m0;->W:Ln7/c;

    invoke-static {v7}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v7

    iget-object v9, v8, Lm7/m0;->a:Ljava/time/Instant;

    iget-object v10, v8, Lm7/m0;->c:Ljava/time/Instant;

    invoke-static {v7, v9, v10}, Li7/c;->g(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    move-result-object v7

    iget v9, v8, Lm7/m0;->V:I

    sget-object v10, Li7/a;->g:Ljava/lang/Object;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    if-eqz v9, :cond_51

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v11

    goto :goto_12

    :cond_51
    const/4 v11, 0x0

    :goto_12
    invoke-virtual {v7, v11}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setMealType(I)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    move-result-object v7

    iget-object v9, v8, Lm7/m0;->b:Ljava/time/ZoneOffset;

    if-eqz v9, :cond_52

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setStartZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_52
    iget-object v9, v8, Lm7/m0;->d:Ljava/time/ZoneOffset;

    if-eqz v9, :cond_53

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setEndZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_53
    iget-object v9, v8, Lm7/m0;->e:Lr7/b0;

    if-eqz v9, :cond_54

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setBiotin(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_54
    iget-object v9, v8, Lm7/m0;->f:Lr7/b0;

    if-eqz v9, :cond_55

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setCaffeine(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_55
    iget-object v9, v8, Lm7/m0;->g:Lr7/b0;

    if-eqz v9, :cond_56

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setCalcium(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_56
    iget-object v9, v8, Lm7/m0;->j:Lr7/b0;

    if-eqz v9, :cond_57

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setChloride(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_57
    iget-object v9, v8, Lm7/m0;->k:Lr7/b0;

    if-eqz v9, :cond_58

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setCholesterol(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_58
    iget-object v9, v8, Lm7/m0;->l:Lr7/b0;

    if-eqz v9, :cond_59

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setChromium(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_59
    iget-object v9, v8, Lm7/m0;->m:Lr7/b0;

    if-eqz v9, :cond_5a

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setCopper(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_5a
    iget-object v9, v8, Lm7/m0;->n:Lr7/b0;

    if-eqz v9, :cond_5b

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setDietaryFiber(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_5b
    iget-object v9, v8, Lm7/m0;->h:Lr7/k;

    if-eqz v9, :cond_5c

    invoke-static {v9}, Lb3/g1;->z(Lr7/k;)Landroid/health/connect/datatypes/units/Energy;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setEnergy(Landroid/health/connect/datatypes/units/Energy;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_5c
    iget-object v9, v8, Lm7/m0;->i:Lr7/k;

    if-eqz v9, :cond_5d

    invoke-static {v9}, Lb3/g1;->z(Lr7/k;)Landroid/health/connect/datatypes/units/Energy;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setEnergyFromFat(Landroid/health/connect/datatypes/units/Energy;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_5d
    iget-object v9, v8, Lm7/m0;->o:Lr7/b0;

    if-eqz v9, :cond_5e

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setFolate(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_5e
    iget-object v9, v8, Lm7/m0;->p:Lr7/b0;

    if-eqz v9, :cond_5f

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setFolicAcid(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_5f
    iget-object v9, v8, Lm7/m0;->q:Lr7/b0;

    if-eqz v9, :cond_60

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setIodine(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_60
    iget-object v9, v8, Lm7/m0;->r:Lr7/b0;

    if-eqz v9, :cond_61

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setIron(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_61
    iget-object v9, v8, Lm7/m0;->s:Lr7/b0;

    if-eqz v9, :cond_62

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setMagnesium(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_62
    iget-object v9, v8, Lm7/m0;->t:Lr7/b0;

    if-eqz v9, :cond_63

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setManganese(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_63
    iget-object v9, v8, Lm7/m0;->u:Lr7/b0;

    if-eqz v9, :cond_64

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setMolybdenum(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_64
    iget-object v9, v8, Lm7/m0;->v:Lr7/b0;

    if-eqz v9, :cond_65

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setMonounsaturatedFat(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_65
    iget-object v9, v8, Lm7/m0;->U:Ljava/lang/String;

    if-eqz v9, :cond_66

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setMealName(Ljava/lang/String;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_66
    iget-object v9, v8, Lm7/m0;->w:Lr7/b0;

    if-eqz v9, :cond_67

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setNiacin(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_67
    iget-object v9, v8, Lm7/m0;->x:Lr7/b0;

    if-eqz v9, :cond_68

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setPantothenicAcid(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_68
    iget-object v9, v8, Lm7/m0;->y:Lr7/b0;

    if-eqz v9, :cond_69

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setPhosphorus(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_69
    iget-object v9, v8, Lm7/m0;->z:Lr7/b0;

    if-eqz v9, :cond_6a

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setPolyunsaturatedFat(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_6a
    iget-object v9, v8, Lm7/m0;->A:Lr7/b0;

    if-eqz v9, :cond_6b

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setPotassium(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_6b
    iget-object v9, v8, Lm7/m0;->B:Lr7/b0;

    if-eqz v9, :cond_6c

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setProtein(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_6c
    iget-object v9, v8, Lm7/m0;->C:Lr7/b0;

    if-eqz v9, :cond_6d

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setRiboflavin(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_6d
    iget-object v9, v8, Lm7/m0;->D:Lr7/b0;

    if-eqz v9, :cond_6e

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setSaturatedFat(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_6e
    iget-object v9, v8, Lm7/m0;->E:Lr7/b0;

    if-eqz v9, :cond_6f

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setSelenium(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_6f
    iget-object v9, v8, Lm7/m0;->F:Lr7/b0;

    if-eqz v9, :cond_70

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setSodium(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_70
    iget-object v9, v8, Lm7/m0;->G:Lr7/b0;

    if-eqz v9, :cond_71

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setSugar(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_71
    iget-object v9, v8, Lm7/m0;->H:Lr7/b0;

    if-eqz v9, :cond_72

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setThiamin(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_72
    iget-object v9, v8, Lm7/m0;->I:Lr7/b0;

    if-eqz v9, :cond_73

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setTotalCarbohydrate(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_73
    iget-object v9, v8, Lm7/m0;->J:Lr7/b0;

    if-eqz v9, :cond_74

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setTotalFat(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_74
    iget-object v9, v8, Lm7/m0;->K:Lr7/b0;

    if-eqz v9, :cond_75

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setTransFat(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_75
    iget-object v9, v8, Lm7/m0;->L:Lr7/b0;

    if-eqz v9, :cond_76

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setUnsaturatedFat(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_76
    iget-object v9, v8, Lm7/m0;->M:Lr7/b0;

    if-eqz v9, :cond_77

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setVitaminA(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_77
    iget-object v9, v8, Lm7/m0;->O:Lr7/b0;

    if-eqz v9, :cond_78

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setVitaminB6(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_78
    iget-object v9, v8, Lm7/m0;->N:Lr7/b0;

    if-eqz v9, :cond_79

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setVitaminB12(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_79
    iget-object v9, v8, Lm7/m0;->P:Lr7/b0;

    if-eqz v9, :cond_7a

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setVitaminC(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_7a
    iget-object v9, v8, Lm7/m0;->Q:Lr7/b0;

    if-eqz v9, :cond_7b

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setVitaminD(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_7b
    iget-object v9, v8, Lm7/m0;->R:Lr7/b0;

    if-eqz v9, :cond_7c

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setVitaminE(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_7c
    iget-object v9, v8, Lm7/m0;->S:Lr7/b0;

    if-eqz v9, :cond_7d

    invoke-static {v9}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setVitaminK(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_7d
    iget-object v8, v8, Lm7/m0;->T:Lr7/b0;

    if-eqz v8, :cond_7e

    invoke-static {v8}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->setZinc(Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/NutritionRecord$Builder;

    :cond_7e
    invoke-virtual {v7}, Landroid/health/connect/datatypes/NutritionRecord$Builder;->build()Landroid/health/connect/datatypes/NutritionRecord;

    move-result-object v8

    const-string v7, "PlatformNutritionRecordB\u2026       }\n        .build()"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_7f
    instance-of v7, v8, Lm7/n0;

    if-eqz v7, :cond_82

    check-cast v8, Lm7/n0;

    invoke-static {}, Le7/h;->t()V

    iget-object v7, v8, Lm7/n0;->d:Ln7/c;

    invoke-static {v7}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v7

    iget-object v9, v8, Lm7/n0;->a:Ljava/time/Instant;

    iget v10, v8, Lm7/n0;->c:I

    sget-object v11, Li7/a;->q:Ljava/lang/Object;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    if-eqz v10, :cond_80

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v11

    goto :goto_13

    :cond_80
    const/4 v11, 0x0

    :goto_13
    invoke-static {v7, v9, v11}, Le7/h;->i(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;I)Landroid/health/connect/datatypes/OvulationTestRecord$Builder;

    move-result-object v7

    iget-object v8, v8, Lm7/n0;->b:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_81

    invoke-virtual {v7, v8}, Landroid/health/connect/datatypes/OvulationTestRecord$Builder;->setZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/OvulationTestRecord$Builder;

    :cond_81
    invoke-virtual {v7}, Landroid/health/connect/datatypes/OvulationTestRecord$Builder;->build()Landroid/health/connect/datatypes/OvulationTestRecord;

    move-result-object v8

    const-string v7, "PlatformOvulationTestRec\u2026(it) } }\n        .build()"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_82
    instance-of v7, v8, Lm7/o0;

    if-eqz v7, :cond_84

    check-cast v8, Lm7/o0;

    invoke-static {}, Li7/c;->n()V

    iget-object v7, v8, Lm7/o0;->d:Ln7/c;

    invoke-static {v7}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v7

    iget-object v9, v8, Lm7/o0;->a:Ljava/time/Instant;

    iget-object v10, v8, Lm7/o0;->c:Lr7/c0;

    iget-wide v12, v10, Lr7/c0;->w:D

    invoke-static {v12, v13}, Landroid/health/connect/datatypes/units/Percentage;->fromValue(D)Landroid/health/connect/datatypes/units/Percentage;

    move-result-object v10

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v9, v10}, Li7/c;->h(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Landroid/health/connect/datatypes/units/Percentage;)Landroid/health/connect/datatypes/OxygenSaturationRecord$Builder;

    move-result-object v7

    iget-object v8, v8, Lm7/o0;->b:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_83

    invoke-virtual {v7, v8}, Landroid/health/connect/datatypes/OxygenSaturationRecord$Builder;->setZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/OxygenSaturationRecord$Builder;

    :cond_83
    invoke-virtual {v7}, Landroid/health/connect/datatypes/OxygenSaturationRecord$Builder;->build()Landroid/health/connect/datatypes/OxygenSaturationRecord;

    move-result-object v8

    const-string v7, "PlatformOxygenSaturation\u2026(it) } }\n        .build()"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_84
    instance-of v7, v8, Lm7/q0;

    if-eqz v7, :cond_88

    check-cast v8, Lm7/q0;

    iget-object v7, v8, Lm7/q0;->f:Ln7/c;

    invoke-static {v7}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v7

    iget-object v9, v8, Lm7/q0;->a:Ljava/time/Instant;

    iget-object v10, v8, Lm7/q0;->c:Ljava/time/Instant;

    iget-object v11, v8, Lm7/q0;->e:Ljava/util/List;

    check-cast v11, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    const/16 v15, 0xa

    invoke-static {v11, v15}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_14
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_85

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lm7/p0;

    invoke-static {}, Li7/d;->l()V

    iget-object v14, v13, Lm7/p0;->b:Lr7/h0;

    invoke-static {v14}, Lb3/g1;->D(Lr7/h0;)Landroid/health/connect/datatypes/units/Power;

    move-result-object v14

    iget-object v13, v13, Lm7/p0;->a:Ljava/time/Instant;

    invoke-static {v14, v13}, Li7/d;->d(Landroid/health/connect/datatypes/units/Power;Ljava/time/Instant;)Landroid/health/connect/datatypes/PowerRecord$PowerRecordSample;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_14

    :cond_85
    invoke-static {v7, v9, v10, v12}, Le7/h;->j(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;Ljava/util/ArrayList;)Landroid/health/connect/datatypes/PowerRecord$Builder;

    move-result-object v7

    iget-object v9, v8, Lm7/q0;->b:Ljava/time/ZoneOffset;

    if-eqz v9, :cond_86

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/PowerRecord$Builder;->setStartZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/PowerRecord$Builder;

    :cond_86
    iget-object v8, v8, Lm7/q0;->d:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_87

    invoke-virtual {v7, v8}, Landroid/health/connect/datatypes/PowerRecord$Builder;->setEndZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/PowerRecord$Builder;

    :cond_87
    invoke-virtual {v7}, Landroid/health/connect/datatypes/PowerRecord$Builder;->build()Landroid/health/connect/datatypes/PowerRecord;

    move-result-object v8

    const-string v7, "PlatformPowerRecordBuild\u2026       }\n        .build()"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_88
    instance-of v7, v8, Lm7/s0;

    if-eqz v7, :cond_8a

    check-cast v8, Lm7/s0;

    invoke-static {}, Li7/c;->r()V

    iget-object v7, v8, Lm7/s0;->d:Ln7/c;

    invoke-static {v7}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v7

    iget-object v9, v8, Lm7/s0;->a:Ljava/time/Instant;

    iget-wide v10, v8, Lm7/s0;->c:D

    invoke-static {v7, v9, v10, v11}, Li7/c;->i(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;D)Landroid/health/connect/datatypes/RespiratoryRateRecord$Builder;

    move-result-object v7

    iget-object v8, v8, Lm7/s0;->b:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_89

    invoke-virtual {v7, v8}, Landroid/health/connect/datatypes/RespiratoryRateRecord$Builder;->setZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/RespiratoryRateRecord$Builder;

    :cond_89
    invoke-virtual {v7}, Landroid/health/connect/datatypes/RespiratoryRateRecord$Builder;->build()Landroid/health/connect/datatypes/RespiratoryRateRecord;

    move-result-object v8

    const-string v7, "PlatformRespiratoryRateR\u2026(it) } }\n        .build()"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_8a
    instance-of v7, v8, Lm7/t0;

    if-eqz v7, :cond_8c

    check-cast v8, Lm7/t0;

    invoke-static {}, Li7/c;->u()V

    iget-object v7, v8, Lm7/t0;->d:Ln7/c;

    invoke-static {v7}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v7

    iget-object v9, v8, Lm7/t0;->a:Ljava/time/Instant;

    iget-wide v10, v8, Lm7/t0;->c:J

    invoke-static {v7, v9, v10, v11}, Li7/c;->j(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;J)Landroid/health/connect/datatypes/RestingHeartRateRecord$Builder;

    move-result-object v7

    iget-object v8, v8, Lm7/t0;->b:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_8b

    invoke-virtual {v7, v8}, Landroid/health/connect/datatypes/RestingHeartRateRecord$Builder;->setZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/RestingHeartRateRecord$Builder;

    :cond_8b
    invoke-virtual {v7}, Landroid/health/connect/datatypes/RestingHeartRateRecord$Builder;->build()Landroid/health/connect/datatypes/RestingHeartRateRecord;

    move-result-object v8

    const-string v7, "PlatformRestingHeartRate\u2026(it) } }\n        .build()"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_8c
    instance-of v7, v8, Lm7/v0;

    if-eqz v7, :cond_8f

    check-cast v8, Lm7/v0;

    invoke-static {}, Le7/h;->s()V

    iget-object v7, v8, Lm7/v0;->d:Ln7/c;

    invoke-static {v7}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v7

    iget-object v9, v8, Lm7/v0;->a:Ljava/time/Instant;

    iget v10, v8, Lm7/v0;->c:I

    sget-object v11, Li7/a;->u:Ljava/lang/Object;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    if-eqz v10, :cond_8d

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v11

    goto :goto_15

    :cond_8d
    const/4 v11, 0x0

    :goto_15
    invoke-static {v7, v9, v11}, Le7/h;->k(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;I)Landroid/health/connect/datatypes/SexualActivityRecord$Builder;

    move-result-object v7

    iget-object v8, v8, Lm7/v0;->b:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_8e

    invoke-virtual {v7, v8}, Landroid/health/connect/datatypes/SexualActivityRecord$Builder;->setZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/SexualActivityRecord$Builder;

    :cond_8e
    invoke-virtual {v7}, Landroid/health/connect/datatypes/SexualActivityRecord$Builder;->build()Landroid/health/connect/datatypes/SexualActivityRecord;

    move-result-object v8

    const-string v7, "PlatformSexualActivityRe\u2026(it) } }\n        .build()"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_8f
    instance-of v7, v8, Lm7/x0;

    if-eqz v7, :cond_96

    check-cast v8, Lm7/x0;

    invoke-static {}, Le7/h;->u()V

    iget-object v7, v8, Lm7/x0;->h:Ln7/c;

    invoke-static {v7}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v7

    iget-object v9, v8, Lm7/x0;->a:Ljava/time/Instant;

    iget-object v10, v8, Lm7/x0;->c:Ljava/time/Instant;

    invoke-static {v7, v9, v10}, Le7/h;->l(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;)Landroid/health/connect/datatypes/SleepSessionRecord$Builder;

    move-result-object v7

    iget-object v9, v8, Lm7/x0;->b:Ljava/time/ZoneOffset;

    if-eqz v9, :cond_90

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/SleepSessionRecord$Builder;->setStartZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/SleepSessionRecord$Builder;

    :cond_90
    iget-object v9, v8, Lm7/x0;->d:Ljava/time/ZoneOffset;

    if-eqz v9, :cond_91

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/SleepSessionRecord$Builder;->setEndZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/SleepSessionRecord$Builder;

    :cond_91
    iget-object v9, v8, Lm7/x0;->f:Ljava/lang/String;

    if-eqz v9, :cond_92

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/SleepSessionRecord$Builder;->setNotes(Ljava/lang/CharSequence;)Landroid/health/connect/datatypes/SleepSessionRecord$Builder;

    :cond_92
    iget-object v9, v8, Lm7/x0;->e:Ljava/lang/String;

    if-eqz v9, :cond_93

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/SleepSessionRecord$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/health/connect/datatypes/SleepSessionRecord$Builder;

    :cond_93
    iget-object v8, v8, Lm7/x0;->g:Ljava/util/List;

    check-cast v8, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    const/16 v15, 0xa

    invoke-static {v8, v15}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_16
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_95

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lm7/w0;

    invoke-static {}, Li7/d;->m()V

    iget-object v11, v10, Lm7/w0;->a:Ljava/time/Instant;

    iget-object v12, v10, Lm7/w0;->b:Ljava/time/Instant;

    iget v10, v10, Lm7/w0;->c:I

    sget-object v13, Li7/a;->A:Ljava/lang/Object;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v13, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    if-eqz v10, :cond_94

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    goto :goto_17

    :cond_94
    const/4 v10, 0x0

    :goto_17
    invoke-static {v11, v12, v10}, Li7/d;->e(Ljava/time/Instant;Ljava/time/Instant;I)Landroid/health/connect/datatypes/SleepSessionRecord$Stage;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_16

    :cond_95
    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/SleepSessionRecord$Builder;->setStages(Ljava/util/List;)Landroid/health/connect/datatypes/SleepSessionRecord$Builder;

    invoke-virtual {v7}, Landroid/health/connect/datatypes/SleepSessionRecord$Builder;->build()Landroid/health/connect/datatypes/SleepSessionRecord;

    move-result-object v8

    const-string v7, "PlatformSleepSessionReco\u2026       }\n        .build()"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_96
    instance-of v7, v8, Lm7/a1;

    if-eqz v7, :cond_9a

    check-cast v8, Lm7/a1;

    iget-object v7, v8, Lm7/a1;->f:Ln7/c;

    invoke-static {v7}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v7

    iget-object v9, v8, Lm7/a1;->a:Ljava/time/Instant;

    iget-object v10, v8, Lm7/a1;->c:Ljava/time/Instant;

    iget-object v11, v8, Lm7/a1;->e:Ljava/util/List;

    check-cast v11, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    const/16 v15, 0xa

    invoke-static {v11, v15}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_18
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_97

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lm7/z0;

    invoke-static {}, Li7/d;->k()V

    iget-object v14, v13, Lm7/z0;->b:Lr7/q0;

    invoke-static {v14}, Lb3/g1;->F(Lr7/q0;)Landroid/health/connect/datatypes/units/Velocity;

    move-result-object v14

    iget-object v13, v13, Lm7/z0;->a:Ljava/time/Instant;

    invoke-static {v14, v13}, Li7/d;->f(Landroid/health/connect/datatypes/units/Velocity;Ljava/time/Instant;)Landroid/health/connect/datatypes/SpeedRecord$SpeedRecordSample;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_18

    :cond_97
    invoke-static {v7, v9, v10, v12}, Le7/h;->m(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;Ljava/util/ArrayList;)Landroid/health/connect/datatypes/SpeedRecord$Builder;

    move-result-object v7

    iget-object v9, v8, Lm7/a1;->b:Ljava/time/ZoneOffset;

    if-eqz v9, :cond_98

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/SpeedRecord$Builder;->setStartZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/SpeedRecord$Builder;

    :cond_98
    iget-object v8, v8, Lm7/a1;->d:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_99

    invoke-virtual {v7, v8}, Landroid/health/connect/datatypes/SpeedRecord$Builder;->setEndZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/SpeedRecord$Builder;

    :cond_99
    invoke-virtual {v7}, Landroid/health/connect/datatypes/SpeedRecord$Builder;->build()Landroid/health/connect/datatypes/SpeedRecord;

    move-result-object v8

    const-string v7, "PlatformSpeedRecordBuild\u2026       }\n        .build()"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_9a
    instance-of v7, v8, Lm7/c1;

    if-eqz v7, :cond_9e

    check-cast v8, Lm7/c1;

    iget-object v7, v8, Lm7/c1;->f:Ln7/c;

    invoke-static {v7}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v7

    iget-object v9, v8, Lm7/c1;->a:Ljava/time/Instant;

    iget-object v10, v8, Lm7/c1;->c:Ljava/time/Instant;

    iget-object v11, v8, Lm7/c1;->e:Ljava/util/List;

    check-cast v11, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    const/16 v15, 0xa

    invoke-static {v11, v15}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_19
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_9b

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lm7/b1;

    invoke-static {}, Le7/h;->w()V

    iget-wide v14, v13, Lm7/b1;->b:D

    iget-object v13, v13, Lm7/b1;->a:Ljava/time/Instant;

    invoke-static {v14, v15, v13}, Le7/h;->o(DLjava/time/Instant;)Landroid/health/connect/datatypes/StepsCadenceRecord$StepsCadenceRecordSample;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v15, 0xa

    goto :goto_19

    :cond_9b
    invoke-static {v7, v9, v10, v12}, Le7/h;->n(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;Ljava/util/ArrayList;)Landroid/health/connect/datatypes/StepsCadenceRecord$Builder;

    move-result-object v7

    iget-object v9, v8, Lm7/c1;->b:Ljava/time/ZoneOffset;

    if-eqz v9, :cond_9c

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/StepsCadenceRecord$Builder;->setStartZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/StepsCadenceRecord$Builder;

    :cond_9c
    iget-object v8, v8, Lm7/c1;->d:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_9d

    invoke-virtual {v7, v8}, Landroid/health/connect/datatypes/StepsCadenceRecord$Builder;->setEndZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/StepsCadenceRecord$Builder;

    :cond_9d
    invoke-virtual {v7}, Landroid/health/connect/datatypes/StepsCadenceRecord$Builder;->build()Landroid/health/connect/datatypes/StepsCadenceRecord;

    move-result-object v8

    const-string v7, "PlatformStepsCadenceReco\u2026       }\n        .build()"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_9e
    instance-of v7, v8, Lm7/d1;

    if-eqz v7, :cond_a1

    check-cast v8, Lm7/d1;

    invoke-static {}, Li7/c;->m()V

    iget-object v7, v8, Lm7/d1;->f:Ln7/c;

    invoke-static {v7}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v7

    iget-object v9, v8, Lm7/d1;->a:Ljava/time/Instant;

    iget-object v10, v8, Lm7/d1;->c:Ljava/time/Instant;

    iget-wide v11, v8, Lm7/d1;->e:J

    invoke-static {v7, v9, v10, v11, v12}, Li7/c;->k(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;J)Landroid/health/connect/datatypes/StepsRecord$Builder;

    move-result-object v7

    iget-object v9, v8, Lm7/d1;->b:Ljava/time/ZoneOffset;

    if-eqz v9, :cond_9f

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/StepsRecord$Builder;->setStartZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/StepsRecord$Builder;

    :cond_9f
    iget-object v8, v8, Lm7/d1;->d:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_a0

    invoke-virtual {v7, v8}, Landroid/health/connect/datatypes/StepsRecord$Builder;->setEndZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/StepsRecord$Builder;

    :cond_a0
    invoke-virtual {v7}, Landroid/health/connect/datatypes/StepsRecord$Builder;->build()Landroid/health/connect/datatypes/StepsRecord;

    move-result-object v8

    const-string v7, "PlatformStepsRecordBuild\u2026       }\n        .build()"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_a1
    instance-of v7, v8, Lm7/e1;

    if-eqz v7, :cond_a4

    check-cast v8, Lm7/e1;

    invoke-static {}, Li7/d;->j()V

    iget-object v7, v8, Lm7/e1;->f:Ln7/c;

    invoke-static {v7}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v7

    iget-object v9, v8, Lm7/e1;->a:Ljava/time/Instant;

    iget-object v10, v8, Lm7/e1;->c:Ljava/time/Instant;

    iget-object v11, v8, Lm7/e1;->e:Lr7/k;

    invoke-static {v11}, Lb3/g1;->z(Lr7/k;)Landroid/health/connect/datatypes/units/Energy;

    move-result-object v11

    invoke-static {v7, v9, v10, v11}, Li7/d;->g(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;Landroid/health/connect/datatypes/units/Energy;)Landroid/health/connect/datatypes/TotalCaloriesBurnedRecord$Builder;

    move-result-object v7

    iget-object v9, v8, Lm7/e1;->b:Ljava/time/ZoneOffset;

    if-eqz v9, :cond_a2

    invoke-virtual {v7, v9}, Landroid/health/connect/datatypes/TotalCaloriesBurnedRecord$Builder;->setStartZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/TotalCaloriesBurnedRecord$Builder;

    :cond_a2
    iget-object v8, v8, Lm7/e1;->d:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_a3

    invoke-virtual {v7, v8}, Landroid/health/connect/datatypes/TotalCaloriesBurnedRecord$Builder;->setEndZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/TotalCaloriesBurnedRecord$Builder;

    :cond_a3
    invoke-virtual {v7}, Landroid/health/connect/datatypes/TotalCaloriesBurnedRecord$Builder;->build()Landroid/health/connect/datatypes/TotalCaloriesBurnedRecord;

    move-result-object v8

    const-string v7, "PlatformTotalCaloriesBur\u2026       }\n        .build()"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_a4
    instance-of v7, v8, Lm7/f1;

    if-eqz v7, :cond_a7

    check-cast v8, Lm7/f1;

    invoke-static {}, Le7/h;->z()V

    iget-object v7, v8, Lm7/f1;->e:Ln7/c;

    invoke-static {v7}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v7

    iget-object v9, v8, Lm7/f1;->a:Ljava/time/Instant;

    iget v10, v8, Lm7/f1;->d:I

    sget-object v11, Li7/a;->i:Ljava/lang/Object;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    if-eqz v10, :cond_a5

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v11

    goto :goto_1a

    :cond_a5
    const/4 v11, 0x0

    :goto_1a
    iget-wide v12, v8, Lm7/f1;->c:D

    invoke-static {v7, v9, v11, v12, v13}, Le7/h;->p(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;ID)Landroid/health/connect/datatypes/Vo2MaxRecord$Builder;

    move-result-object v7

    iget-object v8, v8, Lm7/f1;->b:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_a6

    invoke-virtual {v7, v8}, Landroid/health/connect/datatypes/Vo2MaxRecord$Builder;->setZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/Vo2MaxRecord$Builder;

    :cond_a6
    invoke-virtual {v7}, Landroid/health/connect/datatypes/Vo2MaxRecord$Builder;->build()Landroid/health/connect/datatypes/Vo2MaxRecord;

    move-result-object v8

    const-string v7, "PlatformVo2MaxRecordBuil\u2026(it) } }\n        .build()"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1b

    :cond_a7
    instance-of v7, v8, Lm7/g1;

    if-eqz v7, :cond_a9

    check-cast v8, Lm7/g1;

    invoke-static {}, Li7/c;->v()V

    iget-object v7, v8, Lm7/g1;->d:Ln7/c;

    invoke-static {v7}, Lb3/g1;->C(Ln7/c;)Landroid/health/connect/datatypes/Metadata;

    move-result-object v7

    iget-object v9, v8, Lm7/g1;->a:Ljava/time/Instant;

    iget-object v10, v8, Lm7/g1;->c:Lr7/b0;

    invoke-static {v10}, Lb3/g1;->B(Lr7/b0;)Landroid/health/connect/datatypes/units/Mass;

    move-result-object v10

    invoke-static {v7, v9, v10}, Li7/c;->l(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/WeightRecord$Builder;

    move-result-object v7

    iget-object v8, v8, Lm7/g1;->b:Ljava/time/ZoneOffset;

    if-eqz v8, :cond_a8

    invoke-virtual {v7, v8}, Landroid/health/connect/datatypes/WeightRecord$Builder;->setZoneOffset(Ljava/time/ZoneOffset;)Landroid/health/connect/datatypes/WeightRecord$Builder;

    :cond_a8
    invoke-virtual {v7}, Landroid/health/connect/datatypes/WeightRecord$Builder;->build()Landroid/health/connect/datatypes/WeightRecord;

    move-result-object v8

    const-string v7, "PlatformWeightRecordBuil\u2026(it) } }\n        .build()"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1b

    :cond_a9
    instance-of v7, v8, Lm7/h1;

    if-eqz v7, :cond_aa

    check-cast v8, Lm7/h1;

    invoke-static {v8}, Lb3/g1;->G(Lm7/h1;)Landroid/health/connect/datatypes/WheelchairPushesRecord;

    move-result-object v8

    :goto_1b
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v7, 0xa

    goto/16 :goto_0

    :cond_aa
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unsupported record "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_ab
    iget-object v2, v3, Le7/r;->b:Ljava/util/concurrent/Executor;

    new-instance v3, Lb5/e;

    invoke-direct {v3, v4}, Lb5/e;-><init>(Lbc3/m;)V

    invoke-virtual {v5, v6, v2, v3}, Landroid/health/connect/HealthConnectManager;->insertRecords(Ljava/util/List;Ljava/util/concurrent/Executor;Landroid/os/OutcomeReceiver;)V

    invoke-virtual {v4}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lr83/a;->w:Lr83/a;

    if-ne v2, v1, :cond_ac

    return-object v1

    :cond_ac
    return-object v2
.end method
