.class Lfx2/g$e;
.super Landroidx/room/i;
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
        "Landroidx/room/i;"
    }
.end annotation


# instance fields
.field final synthetic a:Lfx2/g;


# direct methods
.method public constructor <init>(Lfx2/g;)V
    .locals 0

    iput-object p1, p0, Lfx2/g$e;->a:Lfx2/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Lcom/whoop/whooplabs/data/room/entity/LabsCampaignToLegalDocumentCrossRef;)V
    .locals 3

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/LabsCampaignToLegalDocumentCrossRef;->getCampaignId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/LabsCampaignToLegalDocumentCrossRef;->getLegalId()I

    move-result p2

    int-to-long v0, p2

    const/4 p2, 0x2

    invoke-interface {p1, p2, v0, v1}, Ltb/c;->p(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/whoop/whooplabs/data/room/entity/LabsCampaignToLegalDocumentCrossRef;

    invoke-virtual {p0, p1, p2}, Lfx2/g$e;->a(Ltb/c;Lcom/whoop/whooplabs/data/room/entity/LabsCampaignToLegalDocumentCrossRef;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM `legal_document_to_campaign` WHERE `campaign_id` = ? AND `legal_id` = ?"

    return-object v0
.end method
