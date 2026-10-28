.class public interface abstract Lcom/whoop/weightlifting/data/WeightliftingApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J*\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001a\u0010\u000e\u001a\u00020\u00042\u0008\u0008\u0001\u0010\r\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ \u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u0011H\u00a7@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u0016H\u00a7@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u001b2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u001c\u0010\u0006J\u001a\u0010\u001f\u001a\u00020\u001e2\u0008\u0008\u0001\u0010\u001d\u001a\u00020\u0011H\u00a7@\u00a2\u0006\u0004\u0008\u001f\u0010\u0015J \u0010!\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0008\u0008\u0001\u0010\r\u001a\u00020 H\u00a7@\u00a2\u0006\u0004\u0008!\u0010\"J\u001c\u0010%\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020$0#0\tH\u00a7@\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010(\u001a\u00020\'H\u00a7@\u00a2\u0006\u0004\u0008(\u0010&J\u001a\u0010*\u001a\u00020$2\u0008\u0008\u0001\u0010)\u001a\u00020\u0011H\u00a7@\u00a2\u0006\u0004\u0008*\u0010\u0015J\u001a\u0010,\u001a\u00020+2\u0008\u0008\u0001\u0010)\u001a\u00020\u0011H\u00a7@\u00a2\u0006\u0004\u0008,\u0010\u0015J\u0010\u0010.\u001a\u00020-H\u00a7@\u00a2\u0006\u0004\u0008.\u0010&J\u001a\u00100\u001a\u00020/2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0011H\u00a7@\u00a2\u0006\u0004\u00080\u0010\u0015J\u001a\u00102\u001a\u00020$2\u0008\u0008\u0001\u0010\r\u001a\u000201H\u00a7@\u00a2\u0006\u0004\u00082\u00103J \u00104\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0008\u0008\u0001\u0010)\u001a\u00020\u0011H\u00a7@\u00a2\u0006\u0004\u00084\u0010\u0015\u00a8\u00065\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/WeightliftingApi;",
        "",
        "",
        "workoutTemplateId",
        "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;",
        "getWorkoutTemplate",
        "(JLq83/d;)Ljava/lang/Object;",
        "id",
        "updatedTemplate",
        "Lpg3/v0;",
        "Ll83/a0;",
        "updateWorkoutTemplate",
        "(JLcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;Lq83/d;)Ljava/lang/Object;",
        "body",
        "upsertWorkoutTemplate",
        "(Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;Lq83/d;)Ljava/lang/Object;",
        "deleteWorkoutTemplate",
        "",
        "activityId",
        "Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;",
        "getLinkWorkoutBFFData",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;",
        "request",
        "Lcom/whoop/weightlifting/data/dto/LinkWorkoutResponse;",
        "linkWorkoutToActivity",
        "(Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/weightlifting/data/dto/ShareableWorkoutLinkResponse;",
        "createShareableWorkoutLink",
        "sharedWorkoutId",
        "Lcom/whoop/weightlifting/data/dto/SharedWorkoutResponse;",
        "getSharedWorkout",
        "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;",
        "saveWeightliftingWorkout",
        "(Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Lq83/d;)Ljava/lang/Object;",
        "",
        "Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;",
        "getExerciseList",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/weightlifting/data/dto/ExerciseData;",
        "getExerciseListV2",
        "exerciseId",
        "getExerciseDetailsById",
        "Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;",
        "getExerciseDetails",
        "Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;",
        "getWorkoutLibraryV3",
        "Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;",
        "getWorkoutDetails",
        "Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;",
        "upsertCustomExercise",
        "(Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;Lq83/d;)Ljava/lang/Object;",
        "deleteCustomExercise",
        "weightlifting_release"
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
.method public abstract createShareableWorkoutLink(JLq83/d;)Ljava/lang/Object;
    .param p1    # J
        .annotation runtime Lwg3/s;
            value = "workoutTemplateId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/data/dto/ShareableWorkoutLinkResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "weightlifting-service/v1/share/{workoutTemplateId}"
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
        value = "weightlifting-service/v2/custom-exercise/{exerciseId}"
    .end annotation
.end method

.method public abstract deleteWorkoutTemplate(JLq83/d;)Ljava/lang/Object;
    .param p1    # J
        .annotation runtime Lwg3/s;
            value = "workoutTemplateId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "weightlifting-service/v2/workout-template/{workoutTemplateId}"
    .end annotation
.end method

.method public abstract getExerciseDetails(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
            "Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "weightlifting-service/v3/exercise/{exerciseId}"
    .end annotation
.end method

.method public abstract getExerciseDetailsById(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
            "Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "weightlifting-service/v1/exercise/{exerciseId}"
    .end annotation
.end method

.method public abstract getExerciseList(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "weightlifting-service/v1/exercise"
    .end annotation
.end method

.method public abstract getExerciseListV2(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/data/dto/ExerciseData;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "weightlifting-service/v2/exercise"
    .end annotation
.end method

.method public abstract getLinkWorkoutBFFData(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "activityId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "weightlifting-service/v1/link-workout"
    .end annotation
.end method

.method public abstract getSharedWorkout(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "sharedWorkoutId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/data/dto/SharedWorkoutResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "weightlifting-service/v1/share/{sharedWorkoutId}"
    .end annotation
.end method

.method public abstract getWorkoutDetails(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "workoutTemplateId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "weightlifting-service/v2/prebuilt-workout-template/{workoutTemplateId}"
    .end annotation
.end method

.method public abstract getWorkoutLibraryV3(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "weightlifting-service/v3/workout-library"
    .end annotation
.end method

.method public abstract getWorkoutTemplate(JLq83/d;)Ljava/lang/Object;
    .param p1    # J
        .annotation runtime Lwg3/s;
            value = "workoutTemplateKey"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "weightlifting-service/v2/workout-template/{workoutTemplateKey}"
    .end annotation
.end method

.method public abstract linkWorkoutToActivity(Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/data/dto/LinkWorkoutResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "weightlifting-service/v2/weightlifting-workout/link-cardio-workout"
    .end annotation
.end method

.method public abstract saveWeightliftingWorkout(Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "weightlifting-service/v2/weightlifting-workout/activity"
    .end annotation
.end method

.method public abstract updateWorkoutTemplate(JLcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;Lq83/d;)Ljava/lang/Object;
    .param p1    # J
        .annotation runtime Lwg3/s;
            value = "workoutTemplateKey"
        .end annotation
    .end param
    .param p3    # Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "weightlifting-service/v2/workout-template/{workoutTemplateKey}"
    .end annotation
.end method

.method public abstract upsertCustomExercise(Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "weightlifting-service/v2/custom-exercise"
    .end annotation
.end method

.method public abstract upsertWorkoutTemplate(Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "weightlifting-service/v3/workout-template"
    .end annotation
.end method
