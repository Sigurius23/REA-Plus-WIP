.class public final Lhk0/t;
.super Lhk0/m;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lhk0/t;",
        "Lhk0/m;",
        "Ljava/nio/ByteBuffer;",
        "buffer",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "",
        "d0",
        "()Z",
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

    sget-object p1, Lhk0/n;->UNKNOWN:Lhk0/n;

    iput-object p1, p0, Lhk0/t;->g:Lhk0/n;

    const-string p1, "Rev2UnknownMetadataPacket"

    iput-object p1, p0, Lhk0/t;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public K()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lhk0/t;->h:Ljava/lang/String;

    return-object v0
.end method

.method public b0()Lhk0/n;
    .locals 1

    iget-object v0, p0, Lhk0/t;->g:Lhk0/n;

    return-object v0
.end method

.method public d0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
