.class public final Lcom/whoop/whooplabs/data/domain/LabsCampaignKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0005\u001a\u00020\u0006*\u0004\u0018\u00010\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u00018\u0006X\u0087T\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0008"
    }
    d2 = {
        "LABS_CAMPAIGN_TABLE",
        "",
        "LABS_CAMPAIGN_INFO_QUERY",
        "getLABS_CAMPAIGN_INFO_QUERY$annotations",
        "()V",
        "hasBtHrAdditionalCollection",
        "",
        "Lcom/whoop/whooplabs/data/domain/LabsCampaign;",
        "whooplabs_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final LABS_CAMPAIGN_INFO_QUERY:Ljava/lang/String; = "SELECT * FROM labs_campaign LIMIT 1"

.field public static final LABS_CAMPAIGN_TABLE:Ljava/lang/String; = "labs_campaign"


# direct methods
.method public static synthetic getLABS_CAMPAIGN_INFO_QUERY$annotations()V
    .locals 0

    return-void
.end method

.method public static final hasBtHrAdditionalCollection(Lcom/whoop/whooplabs/data/domain/LabsCampaign;)Z
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->getBthrAdditionalCollectionLength()Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
