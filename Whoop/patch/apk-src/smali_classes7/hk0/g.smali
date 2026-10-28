.class public final Lhk0/g;
.super Lhk0/m;
.source "SourceFile"

# interfaces
.implements Ldk0/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\u000c\u001a\u00020\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lhk0/g;",
        "Lhk0/m;",
        "Ldk0/a;",
        "Ljava/nio/ByteBuffer;",
        "buffer",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "Lhk0/n;",
        "g",
        "Lhk0/n;",
        "b0",
        "()Lhk0/n;",
        "subtype",
        "",
        "h",
        "Ljava/lang/String;",
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


# instance fields
.field private final g:Lhk0/n;

.field private final h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 1

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lhk0/m;-><init>(Ljava/nio/ByteBuffer;)V

    sget-object p1, Lhk0/n;->HISTORY_COMPLETE:Lhk0/n;

    iput-object p1, p0, Lhk0/g;->g:Lhk0/n;

    const-string p1, "Rev2HistoryCompleteMetadataPacket"

    iput-object p1, p0, Lhk0/g;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public K()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lhk0/g;->h:Ljava/lang/String;

    return-object v0
.end method

.method public b0()Lhk0/n;
    .locals 1

    iget-object v0, p0, Lhk0/g;->g:Lhk0/n;

    return-object v0
.end method
