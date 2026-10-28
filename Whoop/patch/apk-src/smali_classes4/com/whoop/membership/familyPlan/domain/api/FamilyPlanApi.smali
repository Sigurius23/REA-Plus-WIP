.class public interface abstract Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001a\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ&\u0010\u000e\u001a\u00020\r2\u0014\u0008\u0001\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u00a7@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00a7@\u00a2\u0006\u0004\u0008\u0011\u0010\u0004J*\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u000b2\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;",
        "",
        "Lcom/whoop/membership/familyPlan/domain/model/FamilyPlanScreenResponse;",
        "fetchFamilyPlanScreen",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "isNewMember",
        "Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;",
        "familyPlanInvite",
        "(ZLq83/d;)Ljava/lang/Object;",
        "",
        "",
        "body",
        "Lcom/whoop/membership/extensions/domain/models/ProgressContent;",
        "familyPlanInvitationMobile",
        "(Ljava/util/Map;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/membership/familyPlan/domain/model/RemoveFamilyMemberDialogResponse;",
        "fetchRemoveMemberDialog",
        "familyPlanId",
        "familyMemberUserId",
        "Lpg3/v0;",
        "Ll83/a0;",
        "deleteFamilyMember",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "membership_release"
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
.method public abstract deleteFamilyMember(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "familyPlanId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "familyMemberUserId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "membership-service/v1/family-plans/{familyPlanId}/member/{familyMemberUserId}"
    .end annotation
.end method

.method public abstract familyPlanInvitationMobile(Ljava/util/Map;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/util/Map;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/membership/extensions/domain/models/ProgressContent;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "membership-service/v1/family-plan-invitations/mobile"
    .end annotation
.end method

.method public abstract familyPlanInvite(ZLq83/d;)Ljava/lang/Object;
    .param p1    # Z
        .annotation runtime Lwg3/t;
            value = "isNewMember"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lq83/d<",
            "-",
            "Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "membership-service/v1/family-plans-native/invite"
    .end annotation
.end method

.method public abstract fetchFamilyPlanScreen(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/membership/familyPlan/domain/model/FamilyPlanScreenResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "membership-service/v1/family-plans-native/hub"
    .end annotation
.end method

.method public abstract fetchRemoveMemberDialog(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/membership/familyPlan/domain/model/RemoveFamilyMemberDialogResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "membership-service/v1/family-plans-native/delete"
    .end annotation
.end method
