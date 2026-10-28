.class public interface abstract Lcom/whoop/activation/domain/ActivationAuthenticatedApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001a\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\u0006J$\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\n\u001a\u00020\tH\u00a7@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ*\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u000eH\u00a7@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J*\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0008\u0008\u0001\u0010\u0015\u001a\u00020\u00142\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00182\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0019\u0010\u0006J(\u0010\u001d\u001a\u00020\u001c2\n\u0008\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fH\u00a7@\u00a2\u0006\u0004\u0008 \u0010!J\u001c\u0010#\u001a\u00020\"2\n\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008#\u0010\u0006J&\u0010&\u001a\u00020\u00112\n\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0001\u0010%\u001a\u00020$H\u00a7@\u00a2\u0006\u0004\u0008&\u0010\'J\u001c\u0010)\u001a\u00020(2\n\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008)\u0010\u0006J\u001c\u0010+\u001a\u00020*2\n\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008+\u0010\u0006J&\u0010-\u001a\u00020\u00112\n\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0001\u0010%\u001a\u00020,H\u00a7@\u00a2\u0006\u0004\u0008-\u0010.J\u0010\u00100\u001a\u00020/H\u00a7@\u00a2\u0006\u0004\u00080\u0010!J\u001c\u00102\u001a\u0002012\n\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u00082\u0010\u0006J(\u00105\u001a\u0002042\n\u0008\u0001\u00103\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u00085\u0010\u001eJ\u0010\u00107\u001a\u000206H\u00a7@\u00a2\u0006\u0004\u00087\u0010!J\u001a\u00109\u001a\u00020\u00112\u0008\u0008\u0001\u0010%\u001a\u000208H\u00a7@\u00a2\u0006\u0004\u00089\u0010:J\u0010\u0010<\u001a\u00020;H\u00a7@\u00a2\u0006\u0004\u0008<\u0010!J\u001c\u0010>\u001a\u00020=2\n\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008>\u0010\u0006J(\u0010?\u001a\u00020\u001c2\n\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008?\u0010\u001e\u00a8\u0006@\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;",
        "",
        "",
        "strapSignature",
        "Lcom/whoop/activation/domain/models/ActivationFlowCreateAccountResponse;",
        "startAccountAuthenticated",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/activation/domain/models/ActivationFlowActivateResponse;",
        "activateAccount",
        "Lcom/whoop/activation/domain/models/ActivationBody;",
        "activationBody",
        "Lcom/whoop/activation/domain/models/PostAccountInfoResponse;",
        "postAccountInfo",
        "(Ljava/lang/String;Lcom/whoop/activation/domain/models/ActivationBody;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/activation/domain/models/UpsertProfileBody;",
        "upsertProfileBody",
        "Lpg3/v0;",
        "Ll83/a0;",
        "upsertUserProfile",
        "(Ljava/lang/String;Lcom/whoop/activation/domain/models/UpsertProfileBody;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/activation/domain/models/FinishAccountCreationBody;",
        "finishAccountCreationBody",
        "finishAccountCreation",
        "(Lcom/whoop/activation/domain/models/FinishAccountCreationBody;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/activation/domain/models/PostPairingEmailResponse;",
        "getPostPairingAuthScreens",
        "userId",
        "flow",
        "Lcom/whoop/navigation/e;",
        "fetchPostSignInDestination",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/activation/domain/models/HwOnlyProfileResponse;",
        "fetchHwOnlyProfile",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/activation/domain/models/HwOnlyPermissionsResponse;",
        "fetchHwOnlyPermissions",
        "Lcom/whoop/activation/domain/models/HwOnlyPermissionsBody;",
        "body",
        "putHwOnlyPermissions",
        "(Ljava/lang/String;Lcom/whoop/activation/domain/models/HwOnlyPermissionsBody;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/activation/domain/models/HwOnlyAfterActivationResponse;",
        "fetchHwOnlyAfterActivation",
        "Lcom/whoop/activation/domain/models/MedicarePermissionsResponse;",
        "fetchMedicarePermissions",
        "Lcom/whoop/activation/domain/models/MedicarePermissionsBody;",
        "putMedicarePermissions",
        "(Ljava/lang/String;Lcom/whoop/activation/domain/models/MedicarePermissionsBody;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/activation/domain/models/AlProfileResponse;",
        "fetchAlProfile",
        "Lcom/whoop/activation/domain/models/MedicareAfterActivationResponse;",
        "fetchMedicareAfterActivation",
        "source",
        "Lcom/whoop/activation/domain/models/AfterActivationFinalScreensResponse;",
        "fetchAfterActivationFinalScreens",
        "Lcom/whoop/activation/domain/models/AlPermissionsResponse;",
        "fetchAlPermissions",
        "Lcom/whoop/activation/domain/models/AlPermissionsBody;",
        "putAlPermissions",
        "(Lcom/whoop/activation/domain/models/AlPermissionsBody;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/activation/domain/models/AlAfterActivationResponse;",
        "fetchAlAfterActivation",
        "Lcom/whoop/activation/domain/models/AccountTransitionLegacyAfterActivationResponse;",
        "fetchAccountTransitionLegacyAfterActivation",
        "fetchAppDestination",
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


# direct methods
.method public static synthetic a(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Ljava/lang/String;Ljava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    if-nez p5, :cond_2

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    move-object p2, v0

    :cond_1
    invoke-interface {p0, p1, p2, p3}, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;->fetchPostSignInDestination(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: fetchPostSignInDestination"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract activateAccount(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
            "Lcom/whoop/activation/domain/models/ActivationFlowActivateResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "onboarding-service/v1/account/activate"
    .end annotation
.end method

.method public abstract fetchAccountTransitionLegacyAfterActivation(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
            "Lcom/whoop/activation/domain/models/AccountTransitionLegacyAfterActivationResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "onboarding-service/v1/wearable-transition/legacy-after-activation"
    .end annotation
.end method

.method public abstract fetchAfterActivationFinalScreens(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "source"
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
            "Lcom/whoop/activation/domain/models/AfterActivationFinalScreensResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "onboarding-service/v1/account/after-activation-final-screens"
    .end annotation
.end method

.method public abstract fetchAlAfterActivation(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/activation/domain/models/AlAfterActivationResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "onboarding-service/v1/advanced-labs/after-activation"
    .end annotation
.end method

.method public abstract fetchAlPermissions(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/activation/domain/models/AlPermissionsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "onboarding-service/v1/advanced-labs/permissions"
    .end annotation
.end method

.method public abstract fetchAlProfile(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/activation/domain/models/AlProfileResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "onboarding-service/v1/advanced-labs/profile"
    .end annotation
.end method

.method public abstract fetchAppDestination(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Strap-Signature"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "flow"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/navigation/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "onboarding-service/v1/app/destination"
    .end annotation
.end method

.method public abstract fetchHwOnlyAfterActivation(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
            "Lcom/whoop/activation/domain/models/HwOnlyAfterActivationResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "onboarding-service/v1/hw-only/after-activation"
    .end annotation
.end method

.method public abstract fetchHwOnlyPermissions(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
            "Lcom/whoop/activation/domain/models/HwOnlyPermissionsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "onboarding-service/v1/hw-only/permissions"
    .end annotation
.end method

.method public abstract fetchHwOnlyProfile(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/activation/domain/models/HwOnlyProfileResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "onboarding-service/v1/hw-only/profile"
    .end annotation
.end method

.method public abstract fetchMedicareAfterActivation(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
            "Lcom/whoop/activation/domain/models/MedicareAfterActivationResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "onboarding-service/v1/medicare/after-activation"
    .end annotation
.end method

.method public abstract fetchMedicarePermissions(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
            "Lcom/whoop/activation/domain/models/MedicarePermissionsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "onboarding-service/v1/medicare/permissions"
    .end annotation
.end method

.method public abstract fetchPostSignInDestination(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "userid"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "flow"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/navigation/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "onboarding-service/v1/join/post-signin-destination"
    .end annotation
.end method

.method public abstract finishAccountCreation(Lcom/whoop/activation/domain/models/FinishAccountCreationBody;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/activation/domain/models/FinishAccountCreationBody;
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
            "Lcom/whoop/activation/domain/models/FinishAccountCreationBody;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "onboarding-service/v1/account/sign-up"
    .end annotation
.end method

.method public abstract getPostPairingAuthScreens(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
        value = "onboarding-service/v1/account/post-pairing-auth"
    .end annotation
.end method

.method public abstract postAccountInfo(Ljava/lang/String;Lcom/whoop/activation/domain/models/ActivationBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Strap-Signature"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/activation/domain/models/ActivationBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/activation/domain/models/ActivationBody;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/activation/domain/models/PostAccountInfoResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "onboarding-service/v1/account/activate"
    .end annotation
.end method

.method public abstract putAlPermissions(Lcom/whoop/activation/domain/models/AlPermissionsBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/activation/domain/models/AlPermissionsBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/activation/domain/models/AlPermissionsBody;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "onboarding-service/v1/advanced-labs/permissions"
    .end annotation
.end method

.method public abstract putHwOnlyPermissions(Ljava/lang/String;Lcom/whoop/activation/domain/models/HwOnlyPermissionsBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Strap-Signature"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/activation/domain/models/HwOnlyPermissionsBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/activation/domain/models/HwOnlyPermissionsBody;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "onboarding-service/v1/hw-only/permissions"
    .end annotation
.end method

.method public abstract putMedicarePermissions(Ljava/lang/String;Lcom/whoop/activation/domain/models/MedicarePermissionsBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Strap-Signature"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/activation/domain/models/MedicarePermissionsBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/activation/domain/models/MedicarePermissionsBody;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "onboarding-service/v1/medicare/permissions"
    .end annotation
.end method

.method public abstract startAccountAuthenticated(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
            "Lcom/whoop/activation/domain/models/ActivationFlowCreateAccountResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "onboarding-service/v1/account/start-auth"
    .end annotation
.end method

.method public abstract upsertUserProfile(Ljava/lang/String;Lcom/whoop/activation/domain/models/UpsertProfileBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Strap-Signature"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/activation/domain/models/UpsertProfileBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/activation/domain/models/UpsertProfileBody;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "onboarding-service/v1/account/profile"
    .end annotation
.end method
