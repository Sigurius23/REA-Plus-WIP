.class public interface abstract Lcom/whoop/sms/common/data/SmsVerificationApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0016\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0004H\u00a7@\u00a2\u0006\u0004\u0008\t\u0010\nJ \u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00042\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0016\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u0011\u0010\nJ\u0016\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u0013\u0010\n\u00a8\u0006\u0014\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/sms/common/data/SmsVerificationApi;",
        "",
        "Lcom/whoop/sms/common/data/SmsVerificationRequest;",
        "request",
        "Lpg3/v0;",
        "Ll83/a0;",
        "sendVerificationCode",
        "(Lcom/whoop/sms/common/data/SmsVerificationRequest;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/sms/common/data/TextingSettingsAvailabilityResponse;",
        "textingSettingsAvailability",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "code",
        "Lcom/whoop/sms/common/data/SmsVerifyResponse;",
        "verifyCode",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/sms/common/data/SmsPhoneNumberResponse;",
        "phoneNumber",
        "Lcom/whoop/sms/common/data/SmsPrefilledBodyResponse;",
        "prefilledBody",
        "sms_release"
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
.method public abstract phoneNumber(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/sms/common/data/SmsPhoneNumberResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "messaging-service/v1/sms/onboarding/phone-number"
    .end annotation
.end method

.method public abstract prefilledBody(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/sms/common/data/SmsPrefilledBodyResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "messaging-service/v1/sms/onboarding/body"
    .end annotation
.end method

.method public abstract sendVerificationCode(Lcom/whoop/sms/common/data/SmsVerificationRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/sms/common/data/SmsVerificationRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/sms/common/data/SmsVerificationRequest;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "messaging-service/v1/sms/verification"
    .end annotation
.end method

.method public abstract textingSettingsAvailability(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/sms/common/data/TextingSettingsAvailabilityResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "messaging-service/v1/sms/feature-eligibility"
    .end annotation
.end method

.method public abstract verifyCode(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "code"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/sms/common/data/SmsVerifyResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "messaging-service/v1/sms/verify/{code}"
    .end annotation
.end method
