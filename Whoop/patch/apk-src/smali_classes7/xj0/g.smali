.class public final Lxj0/g;
.super Lxj0/b;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lxj0/g;",
        "Lxj0/b;",
        "<init>",
        "()V",
        "",
        "i",
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
.field private final i:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 6

    sget-object v1, Llt0/e;->EXIT_HIGH_FREQ_SYNC:Llt0/e;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lxj0/b;-><init>(Llt0/a;Ljava/nio/ByteBuffer;Lst0/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "ExitHighFreqSyncPacket"

    iput-object v1, v0, Lxj0/g;->i:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public K()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxj0/g;->i:Ljava/lang/String;

    return-object v0
.end method
