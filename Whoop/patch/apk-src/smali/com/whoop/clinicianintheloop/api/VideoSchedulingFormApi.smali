.class public interface abstract Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J$\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0001\u0010\n\u001a\u00020\tH\u00a7@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ$\u0010\u000e\u001a\u00020\u000b2\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0001\u0010\n\u001a\u00020\tH\u00a7@\u00a2\u0006\u0004\u0008\u000e\u0010\r\u00a8\u0006\u000f\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormApi;",
        "",
        "",
        "usState",
        "appointmentId",
        "Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;",
        "getSchedulingForm",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "appointmentType",
        "Lcom/whoop/clinicianintheloop/api/SaveVideoSchedulingFormRequest;",
        "request",
        "Lcom/whoop/navigation/e;",
        "saveSchedulingForm",
        "(Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/SaveVideoSchedulingFormRequest;Lq83/d;)Ljava/lang/Object;",
        "rescheduleSchedulingForm",
        "clinician-in-the-loop_release"
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
.method public abstract getSchedulingForm(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "usState"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "appointmentId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "clinician-in-the-loop-service/v1/scheduling/availability"
    .end annotation
.end method

.method public abstract rescheduleSchedulingForm(Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/SaveVideoSchedulingFormRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "appointmentId"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/clinicianintheloop/api/SaveVideoSchedulingFormRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/clinicianintheloop/api/SaveVideoSchedulingFormRequest;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/navigation/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "clinician-in-the-loop-service/v1/scheduling/reschedule"
    .end annotation
.end method

.method public abstract saveSchedulingForm(Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/SaveVideoSchedulingFormRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "appointmentType"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/clinicianintheloop/api/SaveVideoSchedulingFormRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/clinicianintheloop/api/SaveVideoSchedulingFormRequest;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/navigation/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "clinician-in-the-loop-service/v1/scheduling"
    .end annotation
.end method
