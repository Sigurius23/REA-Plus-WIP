.class public final Lzj0/q;
.super Lzj0/h;
.source "SourceFile"

# interfaces
.implements Lzj0/i;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\n\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0010\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\r\u00a8\u0006\u0013"
    }
    d2 = {
        "Lzj0/q;",
        "Lzj0/h;",
        "Lzj0/i;",
        "Ljava/nio/ByteBuffer;",
        "payload",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "",
        "index",
        "",
        "X",
        "(I)J",
        "q",
        "()J",
        "writePage",
        "e",
        "trimPage",
        "t",
        "totalPages",
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
    .locals 2

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lzj0/h;-><init>(Ljava/nio/ByteBuffer;Lst0/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method private final X(I)J
    .locals 2

    mul-int/lit8 p1, p1, 0x4

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    invoke-static {p1}, Luk0/b;->d(I)J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public bridge D()J
    .locals 2

    invoke-super {p0}, Lzj0/i;->D()J

    move-result-wide v0

    return-wide v0
.end method

.method public e()J
    .locals 2

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lzj0/q;->X(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public q()J
    .locals 2

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lzj0/q;->X(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public t()J
    .locals 2

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lzj0/q;->X(I)J

    move-result-wide v0

    return-wide v0
.end method
