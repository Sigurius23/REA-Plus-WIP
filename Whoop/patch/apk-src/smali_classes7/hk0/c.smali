.class public final Lhk0/c;
.super Lhk0/b;
.source "SourceFile"

# interfaces
.implements Lot0/b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\u000c\u001a\u00020\u00078\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lhk0/c;",
        "Lhk0/b;",
        "Lot0/b;",
        "Ljava/nio/ByteBuffer;",
        "buffer",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "",
        "e",
        "Ljava/lang/String;",
        "getPacketName",
        "()Ljava/lang/String;",
        "packetName",
        "Lfk2/a;",
        "getTimestamp",
        "()Lfk2/a;",
        "timestamp",
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
.field private final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 1

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lhk0/b;-><init>(Ljava/nio/ByteBuffer;)V

    const-string p1, "Rev2ConsoleOutputEventPacket"

    iput-object p1, p0, Lhk0/c;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getTimestamp()Lfk2/a;
    .locals 1

    invoke-virtual {p0}, Lhk0/b;->X()Lfk2/a;

    move-result-object v0

    return-object v0
.end method
