.class public final Lzj0/v0;
.super Lzj0/c;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\t\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lzj0/v0;",
        "Lzj0/c;",
        "Ljava/nio/ByteBuffer;",
        "payload",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;",
        "d0",
        "()Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;",
        "statusMessage",
        "",
        "K",
        "()Ljava/lang/String;",
        "packetName",
        "connectivity_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 3

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, p1, v2, v0, v1}, Lzj0/c;-><init>(Ljava/nio/ByteBuffer;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public K()Ljava/lang/String;
    .locals 1

    const-string v0, "SetAlarmTimeResponsePacket"

    return-object v0
.end method

.method public final d0()Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;
    .locals 3

    invoke-virtual {p0}, Lzj0/c;->a0()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->Companion:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage$Companion;

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v1

    invoke-static {v1}, Lwj0/a;->a(B)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage$Companion;->fromCode(I)Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->UNKNOWN:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    return-object v0
.end method
