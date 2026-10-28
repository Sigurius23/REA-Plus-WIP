.class public interface abstract Lcom/whoop/strengthworkout/api/StrengthWorkoutApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00052\u0014\u0008\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001a\u0010\u000c\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0004\u0008\u000c\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0004\u0008\u000e\u0010\u000bJ\u001a\u0010\u0011\u001a\u00020\t2\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u000fH\u00a7@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J \u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00132\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0004\u0008\u0015\u0010\u000bJ\u001a\u0010\u0018\u001a\u00020\u00172\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u0016H\u00a7@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/strengthworkout/api/StrengthWorkoutApi;",
        "",
        "",
        "",
        "query",
        "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutExercisesResponse;",
        "getExercises",
        "(Ljava/util/Map;Lq83/d;)Ljava/lang/Object;",
        "exerciseId",
        "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutExerciseResponse;",
        "getExercise",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "getSuggestedExercises",
        "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutExerciseHistoryResponse;",
        "getExerciseHistory",
        "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutCustomExerciseBody;",
        "body",
        "createCustomExercise",
        "(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutCustomExerciseBody;Lq83/d;)Ljava/lang/Object;",
        "Lpg3/v0;",
        "Ll83/a0;",
        "deleteCustomExercise",
        "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;",
        "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveResponse;",
        "saveWorkout",
        "(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;Lq83/d;)Ljava/lang/Object;",
        "strength-workout_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract createCustomExercise(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutCustomExerciseBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutCustomExerciseBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutCustomExerciseBody;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutExerciseResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "core-details-bff/v1/just-lift/custom-exercises"
    .end annotation
.end method

.method public abstract deleteCustomExercise(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "exerciseId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "core-details-bff/v1/just-lift/custom-exercises/{exerciseId}"
    .end annotation
.end method

.method public abstract getExercise(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "exerciseId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutExerciseResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "core-details-bff/v1/just-lift/exercises/{exerciseId}"
    .end annotation
.end method

.method public abstract getExerciseHistory(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "exerciseId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutExerciseHistoryResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "core-details-bff/v1/just-lift/exercises/{exerciseId}/history"
    .end annotation
.end method

.method public abstract getExercises(Ljava/util/Map;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/util/Map;
        .annotation runtime Lwg3/u;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutExercisesResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "core-details-bff/v1/just-lift/exercises"
    .end annotation
.end method

.method public abstract getSuggestedExercises(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "exerciseId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutExercisesResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "core-details-bff/v1/just-lift/exercises/{exerciseId}/suggested"
    .end annotation
.end method

.method public abstract saveWorkout(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "core-details-bff/v1/just-lift/workouts"
    .end annotation
.end method
