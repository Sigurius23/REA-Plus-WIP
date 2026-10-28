.class public interface abstract Lcom/whoop/membership/management/domain/api/MembershipManagementApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001a\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00a7@\u00a2\u0006\u0004\u0008\u000b\u0010\u0004J*\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0008\u0008\u0001\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u000eH\u00a7@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/membership/management/domain/api/MembershipManagementApi;",
        "",
        "Lcom/whoop/membership/management/domain/models/MembershipManagementScreenResponse;",
        "fetchMembershipManagementScreen",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/membership/management/domain/models/MembershipAdjustmentCheckoutScreenBody;",
        "body",
        "Lcom/whoop/membership/management/domain/models/MembershipAdjustmentCheckoutScreenResponse;",
        "fetchMembershipAdjustmentCheckoutScreen",
        "(Lcom/whoop/membership/management/domain/models/MembershipAdjustmentCheckoutScreenBody;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/membership/management/domain/models/ManageMembershipScreenResponse;",
        "fetchManageMembershipScreen",
        "",
        "url",
        "Lkotlinx/serialization/json/JsonObject;",
        "Lpg3/v0;",
        "Ll83/a0;",
        "placeDynamicCheckout",
        "(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lq83/d;)Ljava/lang/Object;",
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
.method public abstract fetchManageMembershipScreen(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/membership/management/domain/models/ManageMembershipScreenResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "membership-service/v1/membership-management"
    .end annotation
.end method

.method public abstract fetchMembershipAdjustmentCheckoutScreen(Lcom/whoop/membership/management/domain/models/MembershipAdjustmentCheckoutScreenBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/membership/management/domain/models/MembershipAdjustmentCheckoutScreenBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/membership/management/domain/models/MembershipAdjustmentCheckoutScreenBody;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/membership/management/domain/models/MembershipAdjustmentCheckoutScreenResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "membership-service/v1/membership-management/adjustments"
    .end annotation
.end method

.method public abstract fetchMembershipManagementScreen(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/membership/management/domain/models/MembershipManagementScreenResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "membership-service/v1/membership-management/membership-and-billing"
    .end annotation
.end method

.method public abstract placeDynamicCheckout(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/y;
        .end annotation
    .end param
    .param p2    # Lkotlinx/serialization/json/JsonObject;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlinx/serialization/json/JsonObject;",
            "Lq83/d<",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
    .end annotation
.end method
