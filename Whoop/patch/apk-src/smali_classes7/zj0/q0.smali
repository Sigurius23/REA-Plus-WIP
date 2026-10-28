.class public final Lzj0/q0;
.super Lzj0/h;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lzj0/q0;",
        "Lzj0/h;",
        "Ljava/nio/ByteBuffer;",
        "payload",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "",
        "f",
        "I",
        "getRevision",
        "()I",
        "revision",
        "Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;",
        "g",
        "Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;",
        "X",
        "()Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;",
        "statusMessage",
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


# instance fields
.field private final f:I

.field private final g:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 2

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lzj0/h;-><init>(Ljava/nio/ByteBuffer;Lst0/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    invoke-static {p1}, Lwj0/a;->a(B)I

    move-result p1

    iput p1, p0, Lzj0/q0;->f:I

    sget-object p1, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->Companion:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage$Companion;

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    invoke-static {v0}, Lwj0/a;->a(B)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage$Companion;->fromCode(I)Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    move-result-object p1

    iput-object p1, p0, Lzj0/q0;->g:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    return-void
.end method


# virtual methods
.method public final X()Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;
    .locals 1

    iget-object v0, p0, Lzj0/q0;->g:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    return-object v0
.end method
