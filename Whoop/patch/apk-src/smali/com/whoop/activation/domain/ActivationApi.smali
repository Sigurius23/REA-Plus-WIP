.class public interface abstract Lcom/whoop/activation/domain/ActivationApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008`\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00052\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J$\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0001\u0010\t\u001a\u00020\u00082\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0001\u0010\r\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00a7@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0015\u0010\u0010J\u001a\u0010\u0019\u001a\u00020\u00182\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u0016H\u00a7@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH\u00a7@\u00a2\u0006\u0004\u0008\u001c\u0010\u0013J\u0010\u0010\u001e\u001a\u00020\u001dH\u00a7@\u00a2\u0006\u0004\u0008\u001e\u0010\u0013J\u001a\u0010\u001f\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u001f\u0010\u0010J\u001a\u0010!\u001a\u00020\n2\u0008\u0008\u0001\u0010\u0017\u001a\u00020 H\u00a7@\u00a2\u0006\u0004\u0008!\u0010\"\u00a8\u0006#\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/activation/domain/ActivationApi;",
        "",
        "",
        "email",
        "strapSignature",
        "Lcom/whoop/activation/domain/models/ActivationFlowCreateAccountResponse;",
        "startAccount",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/activation/domain/models/ActivationFlowSignupBody;",
        "signupBody",
        "Lcom/whoop/domain/model/AuthMaterial;",
        "signUp",
        "(Lcom/whoop/activation/domain/models/ActivationFlowSignupBody;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "region",
        "Lcom/whoop/activation/domain/models/ActivationFlowConsentsResponse;",
        "consents",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/activation/domain/models/ActivationFlowDeviceEducationResponse;",
        "getDeviceEducation",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/activation/domain/models/PostPairingEmailResponse;",
        "getPostPairingScreens",
        "Lcom/whoop/activation/domain/models/EmailCheckRequest;",
        "request",
        "Lcom/whoop/activation/domain/models/EmailCheckResponse;",
        "checkEmail",
        "(Lcom/whoop/activation/domain/models/EmailCheckRequest;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/activation/domain/models/InAppJoinFlowResponse;",
        "fetchInAppJoinFlowV2",
        "Lcom/whoop/activation/domain/models/InAppJoinFlowCountryResponse;",
        "fetchInAppJoinFlowCountryV2",
        "fetchInAppJoinFlowCreateAccount",
        "Lcom/whoop/activation/domain/models/InAppJoinFlowSignUpRequest;",
        "joinSignUp",
        "(Lcom/whoop/activation/domain/models/InAppJoinFlowSignUpRequest;Lq83/d;)Ljava/lang/Object;",
        "activation_release"
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
.method public abstract checkEmail(Lcom/whoop/activation/domain/models/EmailCheckRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/activation/domain/models/EmailCheckRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/activation/domain/models/EmailCheckRequest;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/activation/domain/models/EmailCheckResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "onboarding-service/v2/emails/check"
    .end annotation
.end method

.method public abstract consents(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "region"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/activation/domain/models/ActivationFlowConsentsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "onboarding-service/v2/consents"
    .end annotation
.end method

.method public abstract fetchInAppJoinFlowCountryV2(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/activation/domain/models/InAppJoinFlowCountryResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "onboarding-service/v2/join/country"
    .end annotation
.end method

.method public abstract fetchInAppJoinFlowCreateAccount(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "email"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/activation/domain/models/ActivationFlowCreateAccountResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "onboarding-service/v2/join/create-account"
    .end annotation
.end method

.method public abstract fetchInAppJoinFlowV2(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/activation/domain/models/InAppJoinFlowResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "onboarding-service/v2/join/email-screen"
    .end annotation
.end method

.method public abstract getDeviceEducation(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/activation/domain/models/ActivationFlowDeviceEducationResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "onboarding-service/v1/account/device-education"
    .end annotation
.end method

.method public abstract getPostPairingScreens(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Strap-Signature"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/activation/domain/models/PostPairingEmailResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "onboarding-service/v1/account/post-pairing"
    .end annotation
.end method

.method public abstract joinSignUp(Lcom/whoop/activation/domain/models/InAppJoinFlowSignUpRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/activation/domain/models/InAppJoinFlowSignUpRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/activation/domain/models/InAppJoinFlowSignUpRequest;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/domain/model/AuthMaterial;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "onboarding-service/v1/join/sign-up"
    .end annotation
.end method

.method public abstract signUp(Lcom/whoop/activation/domain/models/ActivationFlowSignupBody;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/activation/domain/models/ActivationFlowSignupBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Strap-Signature"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/activation/domain/models/ActivationFlowSignupBody;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/domain/model/AuthMaterial;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "onboarding-service/v1/account/sign-up"
    .end annotation
.end method

.method public abstract startAccount(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "email"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Strap-Signature"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/activation/domain/models/ActivationFlowCreateAccountResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "onboarding-service/v1/account/start"
    .end annotation
.end method
