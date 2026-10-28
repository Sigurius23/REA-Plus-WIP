.class public interface abstract Lcom/whoop/whooplabs/data/network/WhoopLabsApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008f\u0018\u00002\u00020\u0001J\\\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0001\u0010\t\u001a\u00020\u0008H\u00a7@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ \u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0008\u0008\u0001\u0010\t\u001a\u00020\u000eH\u00a7@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J \u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u0011H\u00a7@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J*\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u00112\u0008\u0008\u0001\u0010\t\u001a\u00020\u0015H\u00a7@\u00a2\u0006\u0004\u0008\u0013\u0010\u0016J \u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u0011H\u00a7@\u00a2\u0006\u0004\u0008\u0017\u0010\u0014J4\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0008\u0008\u0001\u0010\t\u001a\u00020\u00182\u0008\u0008\u0001\u0010\u0019\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u0011H\u00a7@\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/network/WhoopLabsApi;",
        "",
        "",
        "hardwareVersion",
        "firmwareVersion",
        "bluetoothVersion",
        "sigProcVersion",
        "whoopStrapId",
        "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;",
        "body",
        "Lpg3/v0;",
        "Ll83/a0;",
        "uploadStudy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/LegalDocumentCompletedDto;",
        "markLegalDocumentAsCompleted",
        "(Lcom/whoop/whooplabs/data/remote/domain/dto/LegalDocumentCompletedDto;Lq83/d;)Ljava/lang/Object;",
        "",
        "campaignId",
        "abandonCampaign",
        "(ILq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/AbandonCampaignBody;",
        "(ILcom/whoop/whooplabs/data/remote/domain/dto/AbandonCampaignBody;Lq83/d;)Ljava/lang/Object;",
        "stopStudy",
        "Lud3/v0;",
        "deviceName",
        "packetLength",
        "uploadRawDataFromThirdParty",
        "(Lud3/v0;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;",
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
.method public abstract abandonCampaign(ILcom/whoop/whooplabs/data/remote/domain/dto/AbandonCampaignBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "campaignId"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/whooplabs/data/remote/domain/dto/AbandonCampaignBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/AbandonCampaignBody;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/h;
        hasBody = true
        method = "DELETE"
        path = "/research-service/v2/research/campaigns/{campaignId}"
    .end annotation
.end method

.method public abstract abandonCampaign(ILq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "campaignId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "/research-service/v2/research/campaigns/{campaignId}"
    .end annotation
.end method

.method public abstract markLegalDocumentAsCompleted(Lcom/whoop/whooplabs/data/remote/domain/dto/LegalDocumentCompletedDto;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/whooplabs/data/remote/domain/dto/LegalDocumentCompletedDto;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/LegalDocumentCompletedDto;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "research-service/v1/research/legal"
    .end annotation
.end method

.method public abstract stopStudy(ILq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "campaign_id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "/research-service/v1/campaigns/{campaign_id}/event"
    .end annotation
.end method

.method public abstract uploadRawDataFromThirdParty(Lud3/v0;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .param p1    # Lud3/v0;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Research-Device-Name"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Research-Packet-Length"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lud3/v0;",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/research-service/v1/bthr"
    .end annotation
.end method

.method public abstract uploadStudy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;Lq83/d;)Ljava/lang/Object;
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
    .param p6    # Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;
        .annotation runtime Lwg3/a;
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
            "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "research-service/v2/research/study"
    .end annotation
.end method
