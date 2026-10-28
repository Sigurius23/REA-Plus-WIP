.class public interface abstract Lcom/whoop/healthconnect/domain/HealthConnectApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J \u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0008H\u00a7@\u00a2\u0006\u0004\u0008\t\u0010\nJ \u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ&\u0010\u0012\u001a\u00020\u00112\n\u0008\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u000eH\u00a7@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/healthconnect/domain/HealthConnectApi;",
        "",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionRequestBody;",
        "body",
        "Lpg3/v0;",
        "Ll83/a0;",
        "sendExerciseSessionRecords",
        "(Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionRequestBody;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;",
        "sendBodyMeasurementRecords",
        "(Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionRequestBody;",
        "sendNutritionRecords",
        "(Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionRequestBody;Lq83/d;)Ljava/lang/Object;",
        "",
        "token",
        "permissionsCsv",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;",
        "fetchWhoopEvents",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "health-connect_release"
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
.method public abstract fetchWhoopEvents(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "token"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "permissions"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "candidate-service/v1/googlehealthconnect/events"
    .end annotation
.end method

.method public abstract sendBodyMeasurementRecords(Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "candidate-service/v1/googlehealthconnect/body-measurement"
    .end annotation
.end method

.method public abstract sendExerciseSessionRecords(Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionRequestBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionRequestBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionRequestBody;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "candidate-service/v1/googlehealthconnect/exercise-session"
    .end annotation
.end method

.method public abstract sendNutritionRecords(Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionRequestBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionRequestBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionRequestBody;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "candidate-service/v1/googlehealthconnect/nutrition"
    .end annotation
.end method
