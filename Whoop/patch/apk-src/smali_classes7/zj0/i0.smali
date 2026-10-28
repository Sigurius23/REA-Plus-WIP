.class public final Lzj0/i0;
.super Lck0/a;
.source "SourceFile"

# interfaces
.implements Lzj0/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzj0/i0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0010\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u000f8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u000c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u000c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u000c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u0017\u00a8\u0006\u001f"
    }
    d2 = {
        "Lzj0/i0;",
        "Lck0/a;",
        "Lzj0/i;",
        "Ljava/nio/ByteBuffer;",
        "buffer",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "",
        "b0",
        "()Z",
        "",
        "index",
        "",
        "c0",
        "(I)J",
        "",
        "toString",
        "()Ljava/lang/String;",
        "k",
        "Ljava/lang/String;",
        "K",
        "packetName",
        "q",
        "()J",
        "writePage",
        "e",
        "trimPage",
        "t",
        "totalPages",
        "l",
        "a",
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


# static fields
.field public static final l:Lzj0/i0$a;


# instance fields
.field private final k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lzj0/i0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzj0/i0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lzj0/i0;->l:Lzj0/i0$a;

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 1

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lck0/a;-><init>(Ljava/nio/ByteBuffer;)V

    const-string p1, "Rev2GetDataRangeResponsePacket"

    iput-object p1, p0, Lzj0/i0;->k:Ljava/lang/String;

    return-void
.end method

.method private final b0()Z
    .locals 2

    invoke-virtual {p0}, Lck0/a;->X()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    const/16 v1, 0x61

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private final c0(I)J
    .locals 2

    invoke-virtual {p0}, Lck0/a;->X()Ljava/nio/ByteBuffer;

    move-result-object v0

    mul-int/lit8 p1, p1, 0x4

    add-int/lit8 p1, p1, 0x21

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

.method public K()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzj0/i0;->k:Ljava/lang/String;

    return-object v0
.end method

.method public e()J
    .locals 2

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lzj0/i0;->c0(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public q()J
    .locals 2

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lzj0/i0;->c0(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public t()J
    .locals 2

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lzj0/i0;->c0(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    invoke-direct {p0}, Lzj0/i0;->b0()Z

    move-result v0

    const-string v1, " (Result: "

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lzj0/i0;->K()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lzj0/h;->V()Lwj0/b;

    move-result-object v2

    invoke-virtual {p0}, Lzj0/i0;->D()J

    move-result-wide v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " Behind: "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " pages)"

    invoke-static {v3, v4, v0, v5}, Ld;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lzj0/i0;->K()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lzj0/h;->V()Lwj0/b;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", no body)"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
