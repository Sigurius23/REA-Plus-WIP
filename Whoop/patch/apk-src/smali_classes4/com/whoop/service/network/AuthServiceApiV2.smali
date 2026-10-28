.class public interface abstract Lcom/whoop/service/network/AuthServiceApiV2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J*\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u000b\u001a\u00020\nH\u00a7@\u00a2\u0006\u0004\u0008\u000b\u0010\rJ\u0016\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0006H\u00a7@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J*\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0001\u0010\u0011\u001a\u00020\n2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0012H\u00a7@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/service/network/AuthServiceApiV2;",
        "",
        "Lcom/whoop/service/network/model/ForgotPasswordRequest;",
        "request",
        "",
        "shouldCreatePassword",
        "Lpg3/v0;",
        "Ll83/a0;",
        "forgotPassword",
        "(Lcom/whoop/service/network/model/ForgotPasswordRequest;ZLq83/d;)Ljava/lang/Object;",
        "",
        "refreshToken",
        "Lcom/whoop/domain/model/AuthMaterial;",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/service/network/model/PasswordRequirementsResponse;",
        "getPasswordRequirements",
        "(Lq83/d;)Ljava/lang/Object;",
        "token",
        "Lcom/whoop/service/network/model/ResetPasswordRequest;",
        "resetPassword",
        "(Ljava/lang/String;Lcom/whoop/service/network/model/ResetPasswordRequest;Lq83/d;)Ljava/lang/Object;",
        "core_release"
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
.method public abstract forgotPassword(Lcom/whoop/service/network/model/ForgotPasswordRequest;ZLq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/service/network/model/ForgotPasswordRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .param p2    # Z
        .annotation runtime Lwg3/t;
            value = "v2"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/service/network/model/ForgotPasswordRequest;",
            "Z",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "auth-service/v2/whoop/forgot-password"
    .end annotation
.end method

.method public abstract getPasswordRequirements(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/service/network/model/PasswordRequirementsResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "auth-service/v2/whoop/password/requirements"
    .end annotation
.end method

.method public abstract refreshToken(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "Authorization"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/domain/model/AuthMaterial;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "auth-service/v2/whoop/refresh"
    .end annotation
.end method

.method public abstract resetPassword(Ljava/lang/String;Lcom/whoop/service/network/model/ResetPasswordRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "Authorization"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/service/network/model/ResetPasswordRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/service/network/model/ResetPasswordRequest;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "auth-service/v2/whoop/reset-password"
    .end annotation
.end method
