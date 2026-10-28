.class public interface abstract Lcom/whoop/stress/domain/StressMonitorApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00082\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\t\u0010\u0006J$\u0010\n\u001a\u00020\u00082\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\n\u0010\u000bJj\u0010\u0016\u001a\u00020\u00082\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0001\u0010\r\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u00102\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0015\u001a\u00020\u0014H\u00a7@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\u0008\u0008\u0001\u0010\u0018\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u001a\u0010\u0006J\u0010\u0010\u001c\u001a\u00020\u001bH\u00a7@\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\u0008\u0008\u0001\u0010\u0015\u001a\u00020\u001eH\u00a7@\u00a2\u0006\u0004\u0008 \u0010!J\u001a\u0010\"\u001a\u00020\u00192\u0008\u0008\u0001\u0010\u0018\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\"\u0010\u0006J$\u0010&\u001a\u00020%2\u0008\u0008\u0001\u0010#\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0015\u001a\u00020$H\u00a7@\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010)\u001a\u00020(H\u00a7@\u00a2\u0006\u0004\u0008)\u0010\u001d\u00a8\u0006*\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/stress/domain/StressMonitorApi;",
        "",
        "",
        "dateRequested",
        "Lcom/whoop/stress/domain/model/StressCalendar;",
        "getStressCalendar",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "timestamp",
        "Lcom/whoop/stress/domain/model/StressMonitorDto;",
        "getStressMonitor",
        "getStressMonitorOnSpecificDate",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "strapId",
        "hardwareVersion",
        "firmwareVersion",
        "sigProcVersion",
        "",
        "binaryVersion",
        "binaryFlags",
        "contentLength",
        "Lud3/v0;",
        "body",
        "updateStressMonitor",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lud3/v0;Lq83/d;)Ljava/lang/Object;",
        "interventionType",
        "Lcom/whoop/stress/domain/model/StressSession;",
        "getStressIntervention",
        "Lcom/whoop/design/models/items/graph/StressGraphingCardModel;",
        "getCoachingLandingStressGraph",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/stress/domain/StressInterventionSessionData;",
        "Ll83/a0;",
        "submitSession",
        "(Lcom/whoop/stress/domain/StressInterventionSessionData;Lq83/d;)Ljava/lang/Object;",
        "getStressInterventionFullRelease",
        "intervention",
        "Lcom/whoop/stress/domain/SessionCustomizationData;",
        "Lcom/whoop/stress/domain/model/StressIntervention;",
        "getCustomizedIntervention",
        "(Ljava/lang/String;Lcom/whoop/stress/domain/SessionCustomizationData;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/educationModels/FeatureEducationDto;",
        "getStressEducation",
        "stress_release"
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
.method public abstract getCoachingLandingStressGraph(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/design/models/items/graph/StressGraphingCardModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/health-service/v2/stress-bff/coaching-entry-point"
    .end annotation
.end method

.method public abstract getCustomizedIntervention(Ljava/lang/String;Lcom/whoop/stress/domain/SessionCustomizationData;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "intervention"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/stress/domain/SessionCustomizationData;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/stress/domain/SessionCustomizationData;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/stress/domain/model/StressIntervention;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "/health-service/v3/intervention/{intervention}/settings/bff"
    .end annotation
.end method

.method public abstract getStressCalendar(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "date_requested"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/stress/domain/model/StressCalendar;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/health-service/v2/stress-bff/{date_requested}/calendar"
    .end annotation
.end method

.method public abstract getStressEducation(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/educationModels/FeatureEducationDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "onboarding-service/v1/features/educations/STRESS_MONITOR "
    .end annotation
.end method

.method public abstract getStressIntervention(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "type"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/stress/domain/model/StressSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/health-service/v2/stress/intervention/{type}/bff"
    .end annotation
.end method

.method public abstract getStressInterventionFullRelease(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "type"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/stress/domain/model/StressSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/health-service/v3/intervention/{type}/bff"
    .end annotation
.end method

.method public abstract getStressMonitor(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "timestamp"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/stress/domain/model/StressMonitorDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/health-service/v2/stress-bff"
    .end annotation
.end method

.method public abstract getStressMonitorOnSpecificDate(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "date_requested"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "timestamp"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/stress/domain/model/StressMonitorDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/health-service/v2/stress-bff/{date_requested}"
    .end annotation
.end method

.method public abstract submitSession(Lcom/whoop/stress/domain/StressInterventionSessionData;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/stress/domain/StressInterventionSessionData;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/stress/domain/StressInterventionSessionData;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/recovery-activities-service/v2/activity"
    .end annotation
.end method

.method public abstract updateStressMonitor(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lud3/v0;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "timestamp"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Strap-Id"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-HW-Version"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-FW-Version"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-DSP-Version"
        .end annotation
    .end param
    .param p6    # I
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Binary-Version"
        .end annotation
    .end param
    .param p7    # I
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Binary-Flags"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "Content-Length"
        .end annotation
    .end param
    .param p9    # Lud3/v0;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Ljava/lang/String;",
            "Lud3/v0;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/stress/domain/model/StressMonitorDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/health-service/v2/stress-bff"
    .end annotation
.end method
