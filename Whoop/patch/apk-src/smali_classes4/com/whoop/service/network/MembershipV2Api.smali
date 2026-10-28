.class public interface abstract Lcom/whoop/service/network/MembershipV2Api;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\u0006\u0010\u0004J \u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001a\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0001\u0010\u000e\u001a\u00020\rH\u00a7@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J&\u0010\u0017\u001a\u00020\u00162\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u00122\n\u0008\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00a7@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H\u00a7@\u00a2\u0006\u0004\u0008\u001a\u0010\u0004J\u0010\u0010\u001c\u001a\u00020\u001bH\u00a7@\u00a2\u0006\u0004\u0008\u001c\u0010\u0004J\u001c\u0010\u001f\u001a\u00020\u001e2\n\u0008\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0014H\u00a7@\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0016\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00120\tH\u00a7@\u00a2\u0006\u0004\u0008!\u0010\u0004J\u0016\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\"0\tH\u00a7@\u00a2\u0006\u0004\u0008#\u0010\u0004\u00a8\u0006$\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/service/network/MembershipV2Api;",
        "",
        "Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto;",
        "fetchUserStraps",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/service/network/model/RestoreBffModel;",
        "getRestoreInfo",
        "Lcom/whoop/data/remote/domain/request/RecordUserStrapRequestBody;",
        "strap",
        "Lpg3/v0;",
        "Ll83/a0;",
        "recordUserStrap",
        "(Lcom/whoop/data/remote/domain/request/RecordUserStrapRequestBody;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/data/remote/domain/request/CommunityOfferRequestBodyV2;",
        "community",
        "Lcom/whoop/service/network/model/WhoopOffer;",
        "fetchWhoopCommunityReferralV2",
        "(Lcom/whoop/data/remote/domain/request/CommunityOfferRequestBodyV2;Lq83/d;)Ljava/lang/Object;",
        "",
        "source",
        "",
        "communityId",
        "Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;",
        "getReferralContentV2",
        "(Ljava/lang/String;Ljava/lang/Integer;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/data/remote/domain/dto/growth/SubscriptionPause;",
        "getSubscriptionPause",
        "Lcom/whoop/data/remote/domain/dto/growth/PauseEligibility;",
        "getSubscriptionPauseEligibility",
        "targetUserId",
        "Lcom/whoop/data/remote/domain/dto/growth/MembershipTierContent;",
        "getMembershipTierContent",
        "(Ljava/lang/Integer;Lq83/d;)Ljava/lang/Object;",
        "getMembershipStatus",
        "Lcom/whoop/data/remote/domain/dto/growth/AffiliateDto;",
        "getAffiliate",
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
.method public abstract fetchUserStraps(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "straps"
    .end annotation
.end method

.method public abstract fetchWhoopCommunityReferralV2(Lcom/whoop/data/remote/domain/request/CommunityOfferRequestBodyV2;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/data/remote/domain/request/CommunityOfferRequestBodyV2;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/remote/domain/request/CommunityOfferRequestBodyV2;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/service/network/model/WhoopOffer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "referrals"
    .end annotation
.end method

.method public abstract getAffiliate(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/data/remote/domain/dto/growth/AffiliateDto;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "affiliate"
    .end annotation
.end method

.method public abstract getMembershipStatus(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "membership/status"
    .end annotation
.end method

.method public abstract getMembershipTierContent(Ljava/lang/Integer;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Lwg3/t;
            value = "targetUserId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/domain/dto/growth/MembershipTierContent;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "memberships/tier-content"
    .end annotation
.end method

.method public abstract getReferralContentV2(Ljava/lang/String;Ljava/lang/Integer;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "source"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Integer;
        .annotation runtime Lwg3/t;
            value = "communityId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "referral-content"
    .end annotation
.end method

.method public abstract getRestoreInfo(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/service/network/model/RestoreBffModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "restore/native-page"
    .end annotation
.end method

.method public abstract getSubscriptionPause(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/domain/dto/growth/SubscriptionPause;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "subscription/pause"
    .end annotation
.end method

.method public abstract getSubscriptionPauseEligibility(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/domain/dto/growth/PauseEligibility;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "subscription/pause/eligibility"
    .end annotation
.end method

.method public abstract recordUserStrap(Lcom/whoop/data/remote/domain/request/RecordUserStrapRequestBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/data/remote/domain/request/RecordUserStrapRequestBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/remote/domain/request/RecordUserStrapRequestBody;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "straps"
    .end annotation
.end method
