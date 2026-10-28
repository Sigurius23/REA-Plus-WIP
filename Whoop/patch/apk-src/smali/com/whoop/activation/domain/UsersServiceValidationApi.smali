.class public interface abstract Lcom/whoop/activation/domain/UsersServiceValidationApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J \u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0008H\u00a7@\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/activation/domain/UsersServiceValidationApi;",
        "",
        "Lcom/whoop/data/remote/domain/request/onboarding/CheckEmailRequestBody;",
        "body",
        "Lpg3/v0;",
        "",
        "checkIfEmailIsTaken",
        "(Lcom/whoop/data/remote/domain/request/onboarding/CheckEmailRequestBody;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/data/remote/domain/request/onboarding/CheckUsernameRequestBody;",
        "checkIfUsernameIsTaken",
        "(Lcom/whoop/data/remote/domain/request/onboarding/CheckUsernameRequestBody;Lq83/d;)Ljava/lang/Object;",
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
.method public abstract checkIfEmailIsTaken(Lcom/whoop/data/remote/domain/request/onboarding/CheckEmailRequestBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/data/remote/domain/request/onboarding/CheckEmailRequestBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/remote/domain/request/onboarding/CheckEmailRequestBody;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ljava/lang/Boolean;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "users-service/v1/users/check/email"
    .end annotation
.end method

.method public abstract checkIfUsernameIsTaken(Lcom/whoop/data/remote/domain/request/onboarding/CheckUsernameRequestBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/data/remote/domain/request/onboarding/CheckUsernameRequestBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/remote/domain/request/onboarding/CheckUsernameRequestBody;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ljava/lang/Boolean;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "users-service/v1/users/check/username"
    .end annotation
.end method
