.class public interface abstract Lcom/whoop/settings/accountheader/api/NativeAccountHeaderApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001a\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001a\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u000b\u001a\u00020\nH\u00a7@\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/settings/accountheader/api/NativeAccountHeaderApi;",
        "",
        "Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;",
        "fetchHeader",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "plan",
        "Lcom/whoop/settings/accountheader/model/SwitchBillingPlanModalModel;",
        "fetchSwitchBillingPlanModal",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/settings/accountheader/model/SwitchBillingPlanRequest;",
        "switchBillingPlanRequest",
        "Lcom/whoop/settings/accountheader/model/SwitchBillingPlanResponseModel;",
        "switchBillingPlan",
        "(Lcom/whoop/settings/accountheader/model/SwitchBillingPlanRequest;Lq83/d;)Ljava/lang/Object;",
        "settings_release"
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
.method public abstract fetchHeader(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "membership-service/v1/membership/native-account-header"
    .end annotation
.end method

.method public abstract fetchSwitchBillingPlanModal(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "plan"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/settings/accountheader/model/SwitchBillingPlanModalModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "membership-service/v1/upsell/switch-plan"
    .end annotation
.end method

.method public abstract switchBillingPlan(Lcom/whoop/settings/accountheader/model/SwitchBillingPlanRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/settings/accountheader/model/SwitchBillingPlanRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/settings/accountheader/model/SwitchBillingPlanRequest;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/settings/accountheader/model/SwitchBillingPlanResponseModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "membership-service/v1/billing/annual/switch"
    .end annotation
.end method
