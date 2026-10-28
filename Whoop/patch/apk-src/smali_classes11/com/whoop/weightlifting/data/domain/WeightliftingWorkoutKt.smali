.class public final Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u0002\u001a\u00020\u0005*\u00020\u0006\u001a\n\u0010\u0002\u001a\u00020\u0007*\u00020\u0008\u001a\n\u0010\u0002\u001a\u00020\t*\u00020\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "WEIGHTLIFTING_WORKOUT_ACTIVITY_TYPE",
        "",
        "toDto",
        "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;",
        "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;",
        "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutGroupDto;",
        "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutGroup;",
        "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutExerciseDto;",
        "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;",
        "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;",
        "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;",
        "weightlifting_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final WEIGHTLIFTING_WORKOUT_ACTIVITY_TYPE:Ljava/lang/String; = "weightlifting_msk"


# direct methods
.method public static final toDto(Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;
    .locals 16

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->getDateTimeRange()Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->getDuring()Ljava/lang/String;

    move-result-object v3

    .line 2
    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->getTimezone()Lorg/joda/time/DateTimeZone;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/DateTimeZone;->getID()Ljava/lang/String;

    move-result-object v4

    const-string v0, "getID(...)"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->getName()Ljava/lang/String;

    move-result-object v5

    .line 4
    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->getMskTotalVolumeKg()D

    move-result-wide v6

    double-to-float v0, v6

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    .line 5
    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->getRawMskStrainScore()D

    move-result-wide v7

    double-to-float v7, v7

    .line 6
    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->getMskIntensityPercent()D

    move-result-wide v8

    double-to-float v8, v8

    .line 7
    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->getScaledMskStrainScore()D

    move-result-wide v9

    double-to-float v9, v9

    .line 8
    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->getWorkoutTemplateId()Ljava/lang/Long;

    move-result-object v10

    .line 9
    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->getRpe()Ljava/lang/Integer;

    move-result-object v11

    .line 10
    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->getWorkoutGroups()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 11
    new-instance v12, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v12, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 13
    check-cast v2, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutGroup;

    .line 14
    invoke-static {v2}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutKt;->toDto(Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutGroup;)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutGroupDto;

    move-result-object v2

    .line 15
    invoke-interface {v12, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->isSimpleStrengthLogging()Z

    move-result v13

    .line 17
    new-instance v1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    const/4 v2, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    invoke-direct/range {v1 .. v15}, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FFFLjava/lang/Long;Ljava/lang/Integer;Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final toDto(Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutExerciseDto;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;->getExerciseDetails()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/weightlifting/data/domain/WeightliftingExerciseKt;->toDto(Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;)Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;

    move-result-object v0

    .line 26
    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;->getSets()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 27
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 29
    check-cast v2, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;

    .line 30
    invoke-static {v2}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutKt;->toDto(Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;

    move-result-object v2

    .line 31
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 32
    :cond_0
    new-instance p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutExerciseDto;

    invoke-direct {p0, v1, v0}, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutExerciseDto;-><init>(Ljava/util/List;Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;)V

    return-object p0
.end method

.method public static final toDto(Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutGroup;)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutGroupDto;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutGroup;->getWorkoutExercises()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 21
    check-cast v1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;

    .line 22
    invoke-static {v1}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutKt;->toDto(Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutExerciseDto;

    move-result-object v1

    .line 23
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 24
    :cond_0
    new-instance p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutGroupDto;

    invoke-direct {p0, v0}, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutGroupDto;-><init>(Ljava/util/List;)V

    return-object p0
.end method

.method public static final toDto(Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    new-instance v1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;

    .line 34
    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->getNumberOfReps()Ljava/lang/Integer;

    move-result-object v2

    .line 35
    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->getTimeInSeconds()Ljava/lang/Integer;

    move-result-object v3

    .line 36
    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->getWeight()Ljava/lang/Float;

    move-result-object v4

    .line 37
    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->getId()Ljava/util/UUID;

    move-result-object v5

    .line 38
    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->isExerciseTrackable()Z

    move-result v6

    .line 39
    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->getDateTimeRange()Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    move-result-object v0

    const/4 v7, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->getDuring()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v7

    .line 40
    :goto_0
    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->getStrapLocation()Lcom/whoop/weightlifting/data/domain/StrapLocation;

    move-result-object v8

    if-eqz v8, :cond_1

    invoke-virtual {v8}, Lcom/whoop/weightlifting/data/domain/StrapLocation;->getSerializedValue()Ljava/lang/String;

    move-result-object v8

    goto :goto_1

    :cond_1
    move-object v8, v7

    .line 41
    :goto_1
    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->getStrapLaterality()Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/domain/StrapLaterality;->getSerializedValue()Ljava/lang/String;

    move-result-object v7

    :cond_2
    move-object v9, v7

    move-object v7, v0

    .line 42
    invoke-direct/range {v1 .. v9}, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/UUID;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method
