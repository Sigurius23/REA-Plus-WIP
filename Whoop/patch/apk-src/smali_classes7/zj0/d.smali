.class public Lzj0/d;
.super Lzj0/b;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\u000c\u001a\u00020\u00068\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u0008R\u0011\u0010\u0010\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lzj0/d;",
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
        "Lba2/a;",
        "Y",
        "()Lba2/a;",
        "biasOffset",
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

    const-string p1, "BiasOffsetGetResponsePacket"

    iput-object p1, p0, Lzj0/d;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public K()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzj0/d;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final Y()Lba2/a;
    .locals 3

    new-instance v0, Lba2/a;

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    invoke-direct {v0, v1}, Lba2/a;-><init>(I)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-super {p0}, Lzj0/h;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lzj0/d;->Y()Lba2/a;

    move-result-object v1

    invoke-virtual {v1}, Lba2/a;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, " (Offset:"

    const-string v3, ")"

    invoke-static {v0, v2, v1, v3}, Ldc/b;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
