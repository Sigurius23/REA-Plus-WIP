.class Lfx2/g$l;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfx2/g;-><init>(Landroidx/room/z0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/k;"
    }
.end annotation


# instance fields
.field final synthetic a:Lfx2/g;


# direct methods
.method public constructor <init>(Lfx2/g;)V
    .locals 0

    iput-object p1, p0, Lfx2/g$l;->a:Lfx2/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Lcom/whoop/whooplabs/data/domain/LabsCampaign;)V
    .locals 6

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->getCampaignId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->getDescription()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_1
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_2
    iget-object v0, p0, Lfx2/g$l;->a:Lfx2/g;

    invoke-static {v0}, Lfx2/g;->n0(Lfx2/g;)Lcom/whoop/data/local/room/entity/converter/DatesTypeConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->getParticipationCooldownDate()Lorg/joda/time/LocalDateTime;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/data/local/room/entity/converter/DatesTypeConverter;->localDateTimeToString(Lorg/joda/time/LocalDateTime;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_3

    :cond_3
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_3
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->getAdditionalCollectionLength()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_4

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->getAdditionalCollectionLength()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    :goto_4
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->getBthrAdditionalCollectionLength()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_5

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->getBthrAdditionalCollectionLength()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    :goto_5
    iget-object v0, p0, Lfx2/g$l;->a:Lfx2/g;

    invoke-static {v0}, Lfx2/g;->o0(Lfx2/g;)Lcom/whoop/whooplabs/data/domain/StringListConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->getDataTypes()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/whooplabs/data/domain/StringListConverter;->fromStringList(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x8

    if-nez v0, :cond_6

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_6

    :cond_6
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_6
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->getProtocol()Lcom/whoop/whooplabs/data/domain/LabsProtocol;

    move-result-object v0

    const/16 v1, 0x9

    const/16 v2, 0xb

    const/16 v3, 0xa

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/LabsProtocol;->getProtocolId()I

    move-result v4

    int-to-long v4, v4

    invoke-interface {p1, v1, v4, v5}, Ltb/c;->p(IJ)V

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/LabsProtocol;->getProtocolName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_7

    invoke-interface {p1, v3}, Ltb/c;->u(I)V

    goto :goto_7

    :cond_7
    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/LabsProtocol;->getProtocolName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v3, v1}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_7
    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/LabsProtocol;->getPdfUrl()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_8

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_8

    :cond_8
    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/LabsProtocol;->getPdfUrl()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    goto :goto_8

    :cond_9
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    invoke-interface {p1, v3}, Ltb/c;->u(I)V

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    :goto_8
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->getSession()Lcom/whoop/whooplabs/data/domain/LabsSession;

    move-result-object p2

    const/16 v0, 0xc

    if-eqz p2, :cond_a

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/LabsSession;->getCampaignSessionId()I

    move-result p2

    int-to-long v1, p2

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    return-void

    :cond_a
    invoke-interface {p1, v0}, Ltb/c;->u(I)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    invoke-virtual {p0, p1, p2}, Lfx2/g$l;->a(Ltb/c;Lcom/whoop/whooplabs/data/domain/LabsCampaign;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `labs_campaign` (`campaign_id`,`description`,`name`,`subtitle`,`participation_cooldown_date`,`additional_collection_length`,`bthr_additional_collection_length`,`data_types`,`protocol_id`,`protocol_name`,`pdf_url`,`campaign_session_id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method
