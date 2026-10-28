.class Lfx2/g$n;
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

    iput-object p1, p0, Lfx2/g$n;->a:Lfx2/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Lcom/whoop/whooplabs/data/domain/ProtocolStep;)V
    .locals 5

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getCampaignId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x2

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getText()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getOrder()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x4

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getTypeFormUrl()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getTypeFormUrl()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_1
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getImageAlt()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getImageAlt()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_3
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isBpStep()Z

    move-result v0

    const/16 v1, 0x8

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isTimerActive()Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_4

    move-object v0, v1

    goto :goto_4

    :cond_4
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isTimerActive()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_4
    const/16 v2, 0x9

    if-nez v0, :cond_5

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v3, v0

    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    :goto_5
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isBtHr()Z

    move-result v0

    const/16 v2, 0xa

    int-to-long v3, v0

    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getTitle()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0xb

    if-nez v0, :cond_6

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_6

    :cond_6
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_6
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0xc

    if-nez v0, :cond_7

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_7

    :cond_7
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_7
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getCta()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0xd

    if-nez v0, :cond_8

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_8

    :cond_8
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getCta()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_8
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getTypeFormTitle()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0xe

    if-nez v0, :cond_9

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_9

    :cond_9
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getTypeFormTitle()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_9
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSystolicLabel()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0xf

    if-nez v0, :cond_a

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_a

    :cond_a
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSystolicLabel()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_a
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSystolicTooLowText()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x10

    if-nez v0, :cond_b

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_b

    :cond_b
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSystolicTooLowText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_b
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSystolicTooHighText()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x11

    if-nez v0, :cond_c

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_c

    :cond_c
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSystolicTooHighText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_c
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSystolicRequiredText()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x12

    if-nez v0, :cond_d

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_d

    :cond_d
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSystolicRequiredText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_d
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSystolicMax()Ljava/lang/Integer;

    move-result-object v0

    const/16 v2, 0x13

    if-nez v0, :cond_e

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_e

    :cond_e
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSystolicMax()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v3, v0

    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    :goto_e
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSystolicMin()Ljava/lang/Integer;

    move-result-object v0

    const/16 v2, 0x14

    if-nez v0, :cond_f

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_f

    :cond_f
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSystolicMin()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v3, v0

    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    :goto_f
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSystolicSuffix()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x15

    if-nez v0, :cond_10

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_10

    :cond_10
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSystolicSuffix()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_10
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSystolicRequired()Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_11

    move-object v0, v1

    goto :goto_11

    :cond_11
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSystolicRequired()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_11
    const/16 v2, 0x16

    if-nez v0, :cond_12

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_12

    :cond_12
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v3, v0

    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    :goto_12
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getDiastolicLabel()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x17

    if-nez v0, :cond_13

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_13

    :cond_13
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getDiastolicLabel()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_13
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getDiastolicTooLowText()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x18

    if-nez v0, :cond_14

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_14

    :cond_14
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getDiastolicTooLowText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_14
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getDiastolicTooHighText()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x19

    if-nez v0, :cond_15

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_15

    :cond_15
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getDiastolicTooHighText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_15
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getDiastolicRequiredText()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x1a

    if-nez v0, :cond_16

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_16

    :cond_16
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getDiastolicRequiredText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_16
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getDiastolicMax()Ljava/lang/Integer;

    move-result-object v0

    const/16 v2, 0x1b

    if-nez v0, :cond_17

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_17

    :cond_17
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getDiastolicMax()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v3, v0

    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    :goto_17
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getDiastolicMin()Ljava/lang/Integer;

    move-result-object v0

    const/16 v2, 0x1c

    if-nez v0, :cond_18

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_18

    :cond_18
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getDiastolicMin()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v3, v0

    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    :goto_18
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getDiastolicSuffix()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x1d

    if-nez v0, :cond_19

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_19

    :cond_19
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getDiastolicSuffix()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_19
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getDiastolicRequired()Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_1a

    move-object v0, v1

    goto :goto_1a

    :cond_1a
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getDiastolicRequired()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_1a
    const/16 v2, 0x1e

    if-nez v0, :cond_1b

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_1b

    :cond_1b
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v3, v0

    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    :goto_1b
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getHrLabel()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x1f

    if-nez v0, :cond_1c

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_1c

    :cond_1c
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getHrLabel()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_1c
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getHrTooLowText()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x20

    if-nez v0, :cond_1d

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_1d

    :cond_1d
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getHrTooLowText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_1d
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getHrTooHighText()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x21

    if-nez v0, :cond_1e

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_1e

    :cond_1e
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getHrTooHighText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_1e
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getHrRequiredText()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x22

    if-nez v0, :cond_1f

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_1f

    :cond_1f
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getHrRequiredText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_1f
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getHrMax()Ljava/lang/Integer;

    move-result-object v0

    const/16 v2, 0x23

    if-nez v0, :cond_20

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_20

    :cond_20
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getHrMax()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v3, v0

    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    :goto_20
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getHrMin()Ljava/lang/Integer;

    move-result-object v0

    const/16 v2, 0x24

    if-nez v0, :cond_21

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_21

    :cond_21
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getHrMin()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v3, v0

    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    :goto_21
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getHrSuffix()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x25

    if-nez v0, :cond_22

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_22

    :cond_22
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getHrSuffix()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_22
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getHrRequired()Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_23

    goto :goto_23

    :cond_23
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getHrRequired()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_23
    const/16 v0, 0x26

    if-nez v1, :cond_24

    invoke-interface {p1, v0}, Ltb/c;->u(I)V

    goto :goto_24

    :cond_24
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-long v1, v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    :goto_24
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getInputType()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x27

    if-nez v0, :cond_25

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_25

    :cond_25
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getInputType()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_25
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getInputRequired()Z

    move-result v0

    const/16 v1, 0x28

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getRequiredRegex()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x29

    if-nez v0, :cond_26

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_26

    :cond_26
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getRequiredRegex()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_26
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getBlockedRegex()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2a

    if-nez v0, :cond_27

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_27

    :cond_27
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getBlockedRegex()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_27
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isCountDownTimerRequired()Z

    move-result v0

    const/16 v1, 0x2b

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getCountDownTimerSeconds()Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x2c

    if-nez v0, :cond_28

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_28

    :cond_28
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getCountDownTimerSeconds()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    :goto_28
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSurveyFormId()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2d

    if-nez v0, :cond_29

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_29

    :cond_29
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSurveyFormId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_29
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSurveyVendorMetadata()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2e

    if-nez v0, :cond_2a

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_2a

    :cond_2a
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSurveyVendorMetadata()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_2a
    iget-object v0, p0, Lfx2/g$n;->a:Lfx2/g;

    invoke-static {v0}, Lfx2/g;->p0(Lfx2/g;)Lcom/whoop/whooplabs/data/domain/SurveyProviderConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSurveyProvider()Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/whoop/whooplabs/data/domain/SurveyProviderConverter;->fromSurveyProvider(Lcom/whoop/whooplabs/data/domain/SurveyProvider;)Ljava/lang/String;

    move-result-object p2

    const/16 v0, 0x2f

    if-nez p2, :cond_2b

    invoke-interface {p1, v0}, Ltb/c;->u(I)V

    return-void

    :cond_2b
    invoke-interface {p1, v0, p2}, Ltb/c;->L(ILjava/lang/String;)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    invoke-virtual {p0, p1, p2}, Lfx2/g$n;->a(Ltb/c;Lcom/whoop/whooplabs/data/domain/ProtocolStep;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `protocol_step` (`campaign_id`,`step_id`,`text`,`step_order`,`typeform_url`,`image_url`,`image_alt`,`is_bp`,`is_timer_active`,`is_bthr`,`title`,`sub_title`,`cta`,`typeform_title`,`systolic_label`,`systolic_too_low_text`,`systolic_too_high_text`,`systolic_required_text`,`systolic_max`,`systolic_min`,`systolic_suffix`,`systolic_required`,`diastolic_label`,`diastolic_too_low_text`,`diastolic_too_high_text`,`diastolic_required_text`,`diastolic_max`,`diastolic_min`,`diastolic_suffix`,`diastolic_required`,`heart_rate_label`,`heart_rate_too_low_text`,`heart_rate_too_high_text`,`heart_required_text`,`heart_rate_max`,`heart_rate_min`,`heart_rate_suffix`,`heart_rate_required`,`input_type`,`input_required`,`required_regex`,`blocked_regex`,`countdown_timer_required`,`countdown_timer_seconds`,`survey_form_id`,`survey_vendor_metadata`,`survey_provider`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method
