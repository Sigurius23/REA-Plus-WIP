.class public final Lcom/whoop/weightlifting/data/domain/WeightliftingExerciseKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "toDto",
        "Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;",
        "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;",
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


# direct methods
.method public static final toDto(Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;)Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;
    .locals 27

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getExerciseId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getPushCoreName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getTrackable()Z

    move-result v5

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getEquipment()Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;->getSerializedValue()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getTranslatedEquipment()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getExerciseType()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getLaterality()Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;->getSerializedValue()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getMovementPattern()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getTranslatedMovementPattern()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getImageUrl()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getVideoUrl()Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getInstructions()Ljava/util/List;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getTrainingTypes()Ljava/util/List;

    move-result-object v15

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getMuscleGroups()Ljava/util/List;

    move-result-object v16

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getTranslatedMuscleGroups()Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getDeleted()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v18

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getCreatedAt()Ljava/lang/String;

    move-result-object v19

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getUpdatedAt()Ljava/lang/String;

    move-result-object v20

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getVolumeInputFormat()Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;->getSerializedValue()Ljava/lang/String;

    move-result-object v21

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getCustomExerciseInfo()Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/whoop/weightlifting/data/domain/CustomExerciseKt;->toDto(Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;)Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;

    move-result-object v0

    :goto_0
    move-object/from16 v22, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    const/high16 v25, 0x600000

    const/16 v26, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v1 .. v26}, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
