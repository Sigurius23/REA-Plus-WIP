.class public interface abstract Lcom/whoop/integrations/domain/IntegrationsApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001a\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\u000b\u0010\tJ\u001a\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\r\u0010\tJ \u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\u0010\u0010\tJ \u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\u0011\u0010\tJ\u0016\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u00a7@\u00a2\u0006\u0004\u0008\u0012\u0010\u0004J*\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0014\u001a\u00020\u0013H\u00a7@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/integrations/domain/IntegrationsApi;",
        "",
        "Lcom/whoop/integrations/domain/models/IntegrationsDiscoveryComponentsModel;",
        "fetchIntegrationsDiscoveryScreenComponents",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "integrationId",
        "Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;",
        "fetchIntegrationDetailScreenComponents",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;",
        "fetchIntegrationDetailScreenV2Components",
        "Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;",
        "fetchIntegrationDisclaimerScreenComponents",
        "Lpg3/v0;",
        "Ll83/a0;",
        "disconnectIntegration",
        "disconnect3P",
        "triggerHealthexSync",
        "Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsRequest;",
        "body",
        "updatePrivacyControls",
        "(Ljava/lang/String;Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsRequest;Lq83/d;)Ljava/lang/Object;",
        "integrations_release"
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
.method public abstract disconnect3P(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "integrationId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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
        value = "integrations-bff/v1/integrations/3p/{integrationId}"
    .end annotation
.end method

.method public abstract disconnectIntegration(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "integrationId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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
        value = "integrations-bff/v1/integrations/{integrationId}"
    .end annotation
.end method

.method public abstract fetchIntegrationDetailScreenComponents(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "integrationId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "integrations-bff/v1/integrations/{integrationId}/details"
    .end annotation
.end method

.method public abstract fetchIntegrationDetailScreenV2Components(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "integrationId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "integrations-bff/v2/integrations/{integrationId}/details"
    .end annotation
.end method

.method public abstract fetchIntegrationDisclaimerScreenComponents(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "integrationId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "integrations-bff/v1/integrations/{integrationId}/medical-disclaimer"
    .end annotation
.end method

.method public abstract fetchIntegrationsDiscoveryScreenComponents(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/integrations/domain/models/IntegrationsDiscoveryComponentsModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "integrations-bff/v1/integrations/discovery"
    .end annotation
.end method

.method public abstract triggerHealthexSync(Lq83/d;)Ljava/lang/Object;
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
        value = "integrations-bff/v1/integrations/healthex/sync/trigger"
    .end annotation
.end method

.method public abstract updatePrivacyControls(Ljava/lang/String;Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "integrationId"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsRequest;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "integrations-bff/v1/integrations/{integrationId}/user/settings"
    .end annotation
.end method
