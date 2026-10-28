.class public interface abstract Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J$\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\tH\u00a7@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ$\u0010\u000f\u001a\u00020\n2\u0008\u0008\u0001\u0010\r\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u000eH\u00a7@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeApi;",
        "",
        "",
        "appointmentType",
        "Lcom/whoop/clinicianintheloop/api/SaveVideoSchedulingIntakeRequest;",
        "request",
        "Lcom/whoop/navigation/e;",
        "saveVideoSchedulingIntakeOnDemand",
        "(Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/SaveVideoSchedulingIntakeRequest;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/clinicianintheloop/api/SavePersonalIntakeRequest;",
        "Ll83/a0;",
        "savePersonalIntake",
        "(Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/SavePersonalIntakeRequest;Lq83/d;)Ljava/lang/Object;",
        "appointmentId",
        "Lcom/whoop/clinicianintheloop/api/SaveHealthIntakeRequest;",
        "saveHealthIntake",
        "(Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/SaveHealthIntakeRequest;Lq83/d;)Ljava/lang/Object;",
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
.method public abstract saveHealthIntake(Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/SaveHealthIntakeRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "appointmentId"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/clinicianintheloop/api/SaveHealthIntakeRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/clinicianintheloop/api/SaveHealthIntakeRequest;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "clinician-in-the-loop-service/v1/health-intake"
    .end annotation
.end method

.method public abstract savePersonalIntake(Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/SavePersonalIntakeRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "appointmentType"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/clinicianintheloop/api/SavePersonalIntakeRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/clinicianintheloop/api/SavePersonalIntakeRequest;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "clinician-in-the-loop-service/v1/scheduling/personal-intake"
    .end annotation
.end method

.method public abstract saveVideoSchedulingIntakeOnDemand(Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/SaveVideoSchedulingIntakeRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "appointmentType"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/clinicianintheloop/api/SaveVideoSchedulingIntakeRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/clinicianintheloop/api/SaveVideoSchedulingIntakeRequest;",
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
