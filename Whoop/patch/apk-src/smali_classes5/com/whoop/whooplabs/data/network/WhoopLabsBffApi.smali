.class public interface abstract Lcom/whoop/whooplabs/data/network/WhoopLabsBffApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001JL\u0010\t\u001a\u00020\u00082\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008\t\u0010\nJV\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u000b2\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJV\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u000b2\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0011\u0010\u000fJV\u0010\u0013\u001a\u00020\u00122\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u000b2\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0013\u0010\u000fJJ\u0010\u0015\u001a\u00020\u00142\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u000b2\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016JV\u0010\u0018\u001a\u00020\u00122\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u000b2\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0018\u0010\u000fJ\\\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00192\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u000b2\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u001b\u0010\u000fJ\\\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00192\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u000b2\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u001c\u0010\u000fJ`\u0010 \u001a\u00020\u001f2\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u000b2\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0001\u0010\u001e\u001a\u00020\u001dH\u00a7@\u00a2\u0006\u0004\u0008 \u0010!JR\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\"0\u00192\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008#\u0010\nJ\\\u0010&\u001a\u0008\u0012\u0004\u0012\u00020%0\u00192\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0003\u0010$\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008&\u0010\'\u00a8\u0006(\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/network/WhoopLabsBffApi;",
        "",
        "",
        "hardwareVersion",
        "firmwareVersion",
        "bluetoothVersion",
        "sigProcVersion",
        "whoopStrapId",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignListScreenResponse;",
        "fetchCampaignListScreen",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "",
        "campaignId",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;",
        "fetchCampaignDetailsScreen",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;",
        "fetchCampaignExtendedDetailsScreen",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;",
        "fetchCampaignStepsScreen",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleScreenResponse;",
        "fetchCampaignScheduleScreen",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "sessionId",
        "fetchCampaignStepsScreenBySessionId",
        "Lpg3/v0;",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;",
        "fetchCampaignScreening",
        "fetchCampaignScreeningBySessionId",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/ScreeningSubmissionDto;",
        "body",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;",
        "submitScreening",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/ScreeningSubmissionDto;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/HomeScreenResponse;",
        "fetchHome",
        "campaignFilter",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CompletedCampaignsScreenResponse;",
        "fetchCompletedCampaigns",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "whooplabs_release"
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
.method public abstract fetchCampaignDetailsScreen(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "campaignId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-HW-Version"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-FW-Version"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Nordic-Version"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-DSP-Version"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Strap-Id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/research-service/research-bff-service/v1/campaigns/{campaignId}"
    .end annotation
.end method

.method public abstract fetchCampaignExtendedDetailsScreen(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "campaignId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-HW-Version"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-FW-Version"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Nordic-Version"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-DSP-Version"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Strap-Id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/research-service/research-bff-service/v1/campaigns/{campaignId}/details"
    .end annotation
.end method

.method public abstract fetchCampaignListScreen(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-HW-Version"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-FW-Version"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Nordic-Version"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-DSP-Version"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Strap-Id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignListScreenResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/research-service/research-bff-service/v1/campaigns"
    .end annotation
.end method

.method public abstract fetchCampaignScheduleScreen(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "campaignId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-HW-Version"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-FW-Version"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Nordic-Version"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-DSP-Version"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleScreenResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/research-service/research-bff-service/v1/campaigns/{campaignId}/schedule"
    .end annotation
.end method

.method public abstract fetchCampaignScreening(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "campaignId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-HW-Version"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-FW-Version"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Nordic-Version"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-DSP-Version"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Strap-Id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/research-service/research-bff-service/v1/campaigns/{campaignId}/screening"
    .end annotation
.end method

.method public abstract fetchCampaignScreeningBySessionId(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "sessionId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-HW-Version"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-FW-Version"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Nordic-Version"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-DSP-Version"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Strap-Id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/research-service/research-bff-service/v1/campaigns/sessions/{sessionId}/screening"
    .end annotation
.end method

.method public abstract fetchCampaignStepsScreen(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "campaignId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-HW-Version"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-FW-Version"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Nordic-Version"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-DSP-Version"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Strap-Id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/research-service/research-bff-service/v1/campaigns/{campaignId}/steps"
    .end annotation
.end method

.method public abstract fetchCampaignStepsScreenBySessionId(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "sessionId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-HW-Version"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-FW-Version"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Nordic-Version"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-DSP-Version"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Strap-Id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/research-service/research-bff-service/v1/campaigns/sessions/{sessionId}/steps"
    .end annotation
.end method

.method public abstract fetchCompletedCampaigns(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-HW-Version"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-FW-Version"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Nordic-Version"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-DSP-Version"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Strap-Id"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "campaign_filter"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CompletedCampaignsScreenResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/research-service/research-bff-service/v2/list"
    .end annotation
.end method

.method public abstract fetchHome(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-HW-Version"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-FW-Version"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Nordic-Version"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-DSP-Version"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Strap-Id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/HomeScreenResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/research-service/research-bff-service/v2/home"
    .end annotation
.end method

.method public abstract submitScreening(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/ScreeningSubmissionDto;Lq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "sessionId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-HW-Version"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-FW-Version"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Nordic-Version"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-DSP-Version"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Strap-Id"
        .end annotation
    .end param
    .param p7    # Lcom/whoop/whooplabs/data/remote/domain/dto/ScreeningSubmissionDto;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/ScreeningSubmissionDto;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/research-service/research-bff-service/v1/campaigns/sessions/{sessionId}/screening"
    .end annotation
.end method
