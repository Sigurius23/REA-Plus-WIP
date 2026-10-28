.class Lfx2/g$j;
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

    iput-object p1, p0, Lfx2/g$j;->a:Lfx2/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;)V
    .locals 4

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;->getStudyId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    iget-object v0, p0, Lfx2/g$j;->a:Lfx2/g;

    invoke-static {v0}, Lfx2/g;->n0(Lfx2/g;)Lcom/whoop/data/local/room/entity/converter/DatesTypeConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;->getStartTime()Lorg/joda/time/DateTime;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/data/local/room/entity/converter/DatesTypeConverter;->dateTimeToString(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lfx2/g$j;->a:Lfx2/g;

    invoke-static {v0}, Lfx2/g;->n0(Lfx2/g;)Lcom/whoop/data/local/room/entity/converter/DatesTypeConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;->getEndTime()Lorg/joda/time/DateTime;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/data/local/room/entity/converter/DatesTypeConverter;->dateTimeToString(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_1

    :cond_1
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_1
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;->getHrDeviceConnected()Z

    move-result v0

    const/4 v1, 0x4

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    iget-object v0, p0, Lfx2/g$j;->a:Lfx2/g;

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;->getStatus()Lcom/whoop/whooplabs/data/room/entity/StudyStatus;

    move-result-object v1

    invoke-static {v0, v1}, Lfx2/g;->q0(Lfx2/g;Lcom/whoop/whooplabs/data/room/entity/StudyStatus;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;->getCampaignId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x6

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;->getPdfFileName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;->getPdfFileName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;->getProtocolStep()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x8

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;->getProtocolCompleted()Z

    move-result p2

    const/16 v0, 0x9

    int-to-long v1, p2

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    invoke-virtual {p0, p1, p2}, Lfx2/g$j;->a(Ltb/c;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR IGNORE INTO `whoop_labs_study` (`study_id`,`start_time`,`end_time`,`hr_device_connected`,`status`,`campaign_id`,`pdf_file_name`,`protocol_step`,`protocol_completed`) VALUES (?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method
