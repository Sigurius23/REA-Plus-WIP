.class public final Lzj0/a0;
.super Lzj0/b;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\u000c\u001a\u00020\u00068\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u0008R\u0011\u0010\u0010\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lzj0/a0;",
        "Lzj0/b;",
        "Ljava/nio/ByteBuffer;",
        "payload",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "f",
        "Ljava/lang/String;",
        "K",
        "packetName",
        "Lba2/c;",
        "Y",
        "()Lba2/c;",
        "ledDrive",
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
.field private final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 0

    invoke-direct {p0, p1}, Lzj0/b;-><init>(Ljava/nio/ByteBuffer;)V

    const-string p1, "LedDriveGetResponsePacket"

    iput-object p1, p0, Lzj0/a0;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public K()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzj0/a0;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final Y()Lba2/c;
    .locals 3

    new-instance v0, Lba2/c;

    invoke-virtual {p0}, Lzj0/b;->X()J

    move-result-wide v1

    long-to-int v1, v1

    int-to-byte v1, v1

    invoke-static {v1}, Luk0/b;->b(B)S

    move-result v1

    invoke-direct {v0, v1}, Lba2/c;-><init>(S)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-super {p0}, Lzj0/h;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lzj0/a0;->Y()Lba2/c;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " (Drive:"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
