.class public interface abstract Lcom/whoop/service/network/LanguageApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008f\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\u00082\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0004\u0008\t\u0010\nJ$\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ$\u0010\u000f\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u0016\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0010\u0010\u0005\u00a8\u0006\u0011\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/service/network/LanguageApi;",
        "",
        "Lpg3/v0;",
        "Ll83/a0;",
        "updateLanguagePreference",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "platform",
        "Lcom/whoop/data/remote/domain/response/EnabledLanguagesResponse;",
        "getEnabledLanguagesForPicker",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "regions",
        "Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;",
        "getAllowedLanguagesAuthedWithHeader",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "getAllowedLanguagesOnboardingWithHeader",
        "optOutOfArabicBeta",
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
.method public abstract getAllowedLanguagesAuthedWithHeader(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "platform"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Regions"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "language-service/v2/user/mobile/allowed"
    .end annotation
.end method

.method public abstract getAllowedLanguagesOnboardingWithHeader(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "platform"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Regions"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "language-service/v2/user/mobile/allowed/onboarding"
    .end annotation
.end method

.method public abstract getEnabledLanguagesForPicker(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "platform"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/domain/response/EnabledLanguagesResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "language-service/v2/user/mobile/enabled"
    .end annotation
.end method

.method public abstract optOutOfArabicBeta(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "language-service/v1/user/mobile/arabic-beta/opt-out"
    .end annotation
.end method

.method public abstract updateLanguagePreference(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "language-service/v1/tracking/mobile"
    .end annotation
.end method
