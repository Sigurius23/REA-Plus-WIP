.class public final Lcom/whoop/weightlifting/data/domain/WorkoutTemplateKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0005*\u00020\u0006\u001a\n\u0010\u0000\u001a\u00020\u0007*\u00020\u0008\u00a8\u0006\t"
    }
    d2 = {
        "toDto",
        "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;",
        "Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;",
        "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateGroupDto;",
        "Lcom/whoop/weightlifting/data/domain/WorkoutGroup;",
        "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;",
        "Lcom/whoop/weightlifting/data/domain/WorkoutExercise;",
        "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;",
        "Lcom/whoop/weightlifting/data/domain/WorkoutSet;",
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
.method public static final toDto(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;)Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;->getWorkoutTemplateKey()Ljava/lang/Long;

    move-result-object v2

    .line 2
    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;->getParentTemplateKey()Ljava/lang/Long;

    move-result-object v3

    .line 3
    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;->getName()Ljava/lang/String;

    move-result-object v4

    .line 4
    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;->getGroups()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 5
    new-instance v5, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 6
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 7
    check-cast v1, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    .line 8
    invoke-static {v1}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateKt;->toDto(Lcom/whoop/weightlifting/data/domain/WorkoutGroup;)Lcom/whoop/weightlifting/data/dto/WorkoutTemplateGroupDto;

    move-result-object v1

    .line 9
    invoke-interface {v5, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;->getSource()Ljava/lang/String;

    move-result-object v6

    .line 11
    new-instance v1, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;

    invoke-direct/range {v1 .. v6}, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    return-object v1
.end method

.method public static final toDto(Lcom/whoop/weightlifting/data/domain/WorkoutExercise;)Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getSets()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 21
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 23
    check-cast v2, Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    .line 24
    invoke-static {v2}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateKt;->toDto(Lcom/whoop/weightlifting/data/domain/WorkoutSet;)Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;

    move-result-object v2

    .line 25
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getExercise()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/weightlifting/data/domain/WeightliftingExerciseKt;->toDto(Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;)Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;

    move-result-object v0

    .line 27
    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getId()Ljava/util/UUID;

    move-result-object p0

    .line 28
    new-instance v2, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;

    invoke-direct {v2, v0, v1, p0}, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;-><init>(Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;Ljava/util/List;Ljava/util/UUID;)V

    return-object v2
.end method

.method public static final toDto(Lcom/whoop/weightlifting/data/domain/WorkoutGroup;)Lcom/whoop/weightlifting/data/dto/WorkoutTemplateGroupDto;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->getExercises()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 13
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 15
    check-cast v2, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    .line 16
    invoke-static {v2}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateKt;->toDto(Lcom/whoop/weightlifting/data/domain/WorkoutExercise;)Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;

    move-result-object v2

    .line 17
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->getId()Ljava/util/UUID;

    move-result-object p0

    .line 19
    new-instance v0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateGroupDto;

    invoke-direct {v0, v1, p0}, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateGroupDto;-><init>(Ljava/util/List;Ljava/util/UUID;)V

    return-object v0
.end method

.method public static final toDto(Lcom/whoop/weightlifting/data/domain/WorkoutSet;)Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    new-instance v0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;

    .line 30
    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getNumberOfRepsAsInt()I

    move-result v1

    .line 31
    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getTimeAsIntSeconds()Ljava/lang/Integer;

    move-result-object v2

    .line 32
    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getWeightAsFloat()F

    move-result v3

    .line 33
    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getId()Ljava/util/UUID;

    move-result-object p0

    .line 34
    invoke-direct {v0, v1, v2, v3, p0}, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;-><init>(ILjava/lang/Integer;FLjava/util/UUID;)V

    return-object v0
.end method
