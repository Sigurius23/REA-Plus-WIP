.class Lfx2/g$d;
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

    iput-object p1, p0, Lfx2/g$d;->a:Lfx2/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;)V
    .locals 2

    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;->getHrDeviceId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    return-void

    :cond_0
    invoke-virtual {p2}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;->getHrDeviceId()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2}, Ltb/c;->L(ILjava/lang/String;)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;

    invoke-virtual {p0, p1, p2}, Lfx2/g$d;->a(Ltb/c;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM `whoop_labs_hr_device` WHERE `hr_device_id` = ?"

    return-object v0
.end method
