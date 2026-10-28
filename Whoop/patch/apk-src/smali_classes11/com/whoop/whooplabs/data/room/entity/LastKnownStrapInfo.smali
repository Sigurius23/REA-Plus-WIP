.class public final Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aH\u00d6\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;",
        "",
        "whoopStrapId",
        "",
        "hardwareVersion",
        "firmwareVersion",
        "bluetoothVersion",
        "sigProcVersion",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "getWhoopStrapId",
        "()Ljava/lang/String;",
        "getHardwareVersion",
        "getFirmwareVersion",
        "getBluetoothVersion",
        "getSigProcVersion",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
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


# static fields
.field public static final $stable:I


# instance fields
.field private final bluetoothVersion:Ljava/lang/String;

.field private final firmwareVersion:Ljava/lang/String;

.field private final hardwareVersion:Ljava/lang/String;

.field private final sigProcVersion:Ljava/lang/String;

.field private final whoopStrapId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "whoopStrapId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hardwareVersion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firmwareVersion"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothVersion"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sigProcVersion"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->whoopStrapId:Ljava/lang/String;

    iput-object p2, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->hardwareVersion:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->firmwareVersion:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->bluetoothVersion:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->sigProcVersion:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->whoopStrapId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->hardwareVersion:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->firmwareVersion:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->bluetoothVersion:Ljava/lang/String;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->sigProcVersion:Ljava/lang/String;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->whoopStrapId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->hardwareVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->firmwareVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->bluetoothVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->sigProcVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;
    .locals 7

    const-string v0, "whoopStrapId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hardwareVersion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firmwareVersion"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothVersion"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sigProcVersion"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;

    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->whoopStrapId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->whoopStrapId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->hardwareVersion:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->hardwareVersion:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->firmwareVersion:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->firmwareVersion:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->bluetoothVersion:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->bluetoothVersion:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->sigProcVersion:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->sigProcVersion:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getBluetoothVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->bluetoothVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final getFirmwareVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->firmwareVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final getHardwareVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->hardwareVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final getSigProcVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->sigProcVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final getWhoopStrapId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->whoopStrapId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->whoopStrapId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->hardwareVersion:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->firmwareVersion:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->bluetoothVersion:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->sigProcVersion:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->whoopStrapId:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->hardwareVersion:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->firmwareVersion:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->bluetoothVersion:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;->sigProcVersion:Ljava/lang/String;

    const-string v5, ", hardwareVersion="

    const-string v6, ", firmwareVersion="

    const-string v7, "LastKnownStrapInfo(whoopStrapId="

    invoke-static {v7, v0, v5, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", bluetoothVersion="

    const-string v5, ", sigProcVersion="

    invoke-static {v0, v2, v1, v3, v5}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ")"

    invoke-static {v4, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
