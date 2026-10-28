.class Lfx2/g$h;
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

    iput-object p1, p0, Lfx2/g$h;->a:Lfx2/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;)V
    .locals 7

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->getCampaignId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->getResultId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x2

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->getOrder()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x3

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    iget-object v0, p0, Lfx2/g$h;->a:Lfx2/g;

    invoke-static {v0}, Lfx2/g;->n0(Lfx2/g;)Lcom/whoop/data/local/room/entity/converter/DatesTypeConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->getStartTimestamp()Lorg/joda/time/DateTime;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/data/local/room/entity/converter/DatesTypeConverter;->dateTimeToString(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lfx2/g$h;->a:Lfx2/g;

    invoke-static {v0}, Lfx2/g;->n0(Lfx2/g;)Lcom/whoop/data/local/room/entity/converter/DatesTypeConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->getEndTimestamp()Lorg/joda/time/DateTime;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/data/local/room/entity/converter/DatesTypeConverter;->dateTimeToString(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_1

    :cond_1
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_1
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->getTypeformSubmitted()Z

    move-result v0

    const/4 v1, 0x6

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->getTextOption()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->getTextOption()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->getNumberInput()Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x8

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->getNumberInput()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    :goto_3
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->getTextInput()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x9

    if-nez v0, :cond_4

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->getTextInput()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_4
    iget-object v0, p0, Lfx2/g$h;->a:Lfx2/g;

    invoke-static {v0}, Lfx2/g;->n0(Lfx2/g;)Lcom/whoop/data/local/room/entity/converter/DatesTypeConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->getTimestampInput()Lorg/joda/time/DateTime;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/data/local/room/entity/converter/DatesTypeConverter;->dateTimeToString(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    if-nez v0, :cond_5

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_5

    :cond_5
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_5
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->getMysticReading()Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;

    move-result-object v0

    const/16 v1, 0xe

    const/16 v2, 0xd

    const/16 v3, 0xc

    const/16 v4, 0xb

    if-eqz v0, :cond_a

    iget-object v5, p0, Lfx2/g$h;->a:Lfx2/g;

    invoke-static {v5}, Lfx2/g;->n0(Lfx2/g;)Lcom/whoop/data/local/room/entity/converter/DatesTypeConverter;

    move-result-object v5

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->getTimestamp()Lorg/joda/time/Instant;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/whoop/data/local/room/entity/converter/DatesTypeConverter;->instantToString(Lorg/joda/time/Instant;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_6

    invoke-interface {p1, v4}, Ltb/c;->u(I)V

    goto :goto_6

    :cond_6
    invoke-interface {p1, v4, v5}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_6
    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->getSystolic()Ljava/lang/Integer;

    move-result-object v4

    if-nez v4, :cond_7

    invoke-interface {p1, v3}, Ltb/c;->u(I)V

    goto :goto_7

    :cond_7
    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->getSystolic()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    int-to-long v4, v4

    invoke-interface {p1, v3, v4, v5}, Ltb/c;->p(IJ)V

    :goto_7
    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->getDiastolic()Ljava/lang/Integer;

    move-result-object v3

    if-nez v3, :cond_8

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_8

    :cond_8
    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->getDiastolic()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    int-to-long v3, v3

    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    :goto_8
    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->getHeartRate()Ljava/lang/Integer;

    move-result-object v2

    if-nez v2, :cond_9

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_9

    :cond_9
    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->getHeartRate()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    goto :goto_9

    :cond_a
    invoke-interface {p1, v4}, Ltb/c;->u(I)V

    invoke-interface {p1, v3}, Ltb/c;->u(I)V

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    :goto_9
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->getCampaignId()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xf

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->getResultId()I

    move-result p2

    int-to-long v0, p2

    const/16 p2, 0x10

    invoke-interface {p1, p2, v0, v1}, Ltb/c;->p(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;

    invoke-virtual {p0, p1, p2}, Lfx2/g$h;->a(Ltb/c;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "UPDATE OR ABORT `whoop_labs_protocol_step_result` SET `campaign_id` = ?,`result_id` = ?,`step_order` = ?,`start_timestamp` = ?,`end_timestamp` = ?,`typeform_submitted` = ?,`text_option` = ?,`number_input` = ?,`text_input` = ?,`timestamp_input` = ?,`timestamp` = ?,`systolic` = ?,`diastolic` = ?,`heart_rate` = ? WHERE `campaign_id` = ? AND `result_id` = ?"

    return-object v0
.end method
