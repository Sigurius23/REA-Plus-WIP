.class Lfx2/g$a;
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

    iput-object p1, p0, Lfx2/g$a;->a:Lfx2/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;)V
    .locals 2

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->getWhoopStrapId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->getWhoopStrapId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->getHardwareVersion()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->getHardwareVersion()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_1
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->getFirmwareVersion()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->getFirmwareVersion()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->getBluetoothVersion()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->getBluetoothVersion()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_3
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->getSigProcVersion()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_4

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    return-void

    :cond_4
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->getSigProcVersion()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2}, Ltb/c;->L(ILjava/lang/String;)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;

    invoke-virtual {p0, p1, p2}, Lfx2/g$a;->a(Ltb/c;Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `whoop_labs_strap_info` (`whoop_strap_id`,`hardware_version`,`firmware_version`,`bluetooth_version`,`sig_proc_version`) VALUES (?,?,?,?,?)"

    return-object v0
.end method
