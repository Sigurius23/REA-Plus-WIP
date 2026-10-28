.class Lfx2/g$c;
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

    iput-object p1, p0, Lfx2/g$c;->a:Lfx2/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;)V
    .locals 4

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;->getStepId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;->getInputLabel()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;->getInputLabel()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;->getMin()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;->getMin()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    :goto_1
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;->getMax()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;->getMax()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    :goto_2
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;->getMinErrorText()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;->getMinErrorText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_3
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;->getMaxErrorText()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_4

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;->getMaxErrorText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_4
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;->getHint()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_5

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;->getHint()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_5
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;->getRowCount()Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x8

    if-nez v0, :cond_6

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    return-void

    :cond_6
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;->getRowCount()Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    int-to-long v2, p2

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;

    invoke-virtual {p0, p1, p2}, Lfx2/g$c;->a(Ltb/c;Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `whoop_labs_protocol_step_config` (`step_id`,`input_label`,`min`,`max`,`min_error_text`,`max_error_text`,`hint`,`row_count`) VALUES (?,?,?,?,?,?,?,?)"

    return-object v0
.end method
