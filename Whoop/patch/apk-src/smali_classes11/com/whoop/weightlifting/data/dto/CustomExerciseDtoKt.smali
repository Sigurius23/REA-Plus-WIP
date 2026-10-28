.class public final Lcom/whoop/weightlifting/data/dto/CustomExerciseDtoKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0005*\u00020\u0006\u001a\n\u0010\u0000\u001a\u00020\u0007*\u00020\u0008\u00a8\u0006\t"
    }
    d2 = {
        "toDomain",
        "Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;",
        "Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;",
        "Lcom/whoop/weightlifting/data/domain/LinkedExercise;",
        "Lcom/whoop/weightlifting/data/dto/LinkedExerciseDto;",
        "Lcom/whoop/weightlifting/data/domain/FilterOptions;",
        "Lcom/whoop/weightlifting/data/dto/FilterOptionsDto;",
        "Lcom/whoop/weightlifting/data/domain/FilterItem;",
        "Lcom/whoop/weightlifting/data/dto/FilterItemDto;",
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
.method public static final toDomain(Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;)Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;

    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;->getLinkedExercise()Lcom/whoop/weightlifting/data/dto/LinkedExerciseDto;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lcom/whoop/weightlifting/data/dto/CustomExerciseDtoKt;->toDomain(Lcom/whoop/weightlifting/data/dto/LinkedExerciseDto;)Lcom/whoop/weightlifting/data/domain/LinkedExercise;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-direct {v0, p0}, Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;-><init>(Lcom/whoop/weightlifting/data/domain/LinkedExercise;)V

    return-object v0
.end method

.method public static final toDomain(Lcom/whoop/weightlifting/data/dto/FilterItemDto;)Lcom/whoop/weightlifting/data/domain/FilterItem;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    new-instance v0, Lcom/whoop/weightlifting/data/domain/FilterItem;

    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/dto/FilterItemDto;->getInternalValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/dto/FilterItemDto;->getTranslatedValue()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lcom/whoop/weightlifting/data/domain/FilterItem;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final toDomain(Lcom/whoop/weightlifting/data/dto/FilterOptionsDto;)Lcom/whoop/weightlifting/data/domain/FilterOptions;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/dto/FilterOptionsDto;->getEquipment()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 4
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 6
    check-cast v3, Lcom/whoop/weightlifting/data/dto/FilterItemDto;

    .line 7
    invoke-static {v3}, Lcom/whoop/weightlifting/data/dto/CustomExerciseDtoKt;->toDomain(Lcom/whoop/weightlifting/data/dto/FilterItemDto;)Lcom/whoop/weightlifting/data/domain/FilterItem;

    move-result-object v3

    .line 8
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/dto/FilterOptionsDto;->getMuscleGroups()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 10
    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 11
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 12
    check-cast v4, Lcom/whoop/weightlifting/data/dto/FilterItemDto;

    .line 13
    invoke-static {v4}, Lcom/whoop/weightlifting/data/dto/CustomExerciseDtoKt;->toDomain(Lcom/whoop/weightlifting/data/dto/FilterItemDto;)Lcom/whoop/weightlifting/data/domain/FilterItem;

    move-result-object v4

    .line 14
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 15
    :cond_1
    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/dto/FilterOptionsDto;->getMovementPatterns()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 17
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 18
    check-cast v2, Lcom/whoop/weightlifting/data/dto/FilterItemDto;

    .line 19
    invoke-static {v2}, Lcom/whoop/weightlifting/data/dto/CustomExerciseDtoKt;->toDomain(Lcom/whoop/weightlifting/data/dto/FilterItemDto;)Lcom/whoop/weightlifting/data/domain/FilterItem;

    move-result-object v2

    .line 20
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 21
    :cond_2
    new-instance p0, Lcom/whoop/weightlifting/data/domain/FilterOptions;

    invoke-direct {p0, v1, v3, v0}, Lcom/whoop/weightlifting/data/domain/FilterOptions;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object p0
.end method

.method public static final toDomain(Lcom/whoop/weightlifting/data/dto/LinkedExerciseDto;)Lcom/whoop/weightlifting/data/domain/LinkedExercise;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/whoop/weightlifting/data/domain/LinkedExercise;

    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/dto/LinkedExerciseDto;->getExerciseId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/dto/LinkedExerciseDto;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/dto/LinkedExerciseDto;->getImageUrl()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lcom/whoop/weightlifting/data/domain/LinkedExercise;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
