.class public Lzj0/h;
.super Llt0/c;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u000f\n\u0002\u0010\u0005\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0016\u0018\u00002\u00020\u0001B\u0019\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0006\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR.\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u00028F@BX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u000b8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\rR\u0014\u0010\u001e\u001a\u00020\u001b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001dR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010!R\u0013\u0010&\u001a\u0004\u0018\u00010#8F\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010%R\u0014\u0010(\u001a\u00020\u001b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010\u001dR\u0014\u0010,\u001a\u00020)8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010+R\u0011\u00100\u001a\u00020-8F\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010/\u00a8\u00061"
    }
    d2 = {
        "Lzj0/h;",
        "Llt0/c;",
        "Ljava/nio/ByteBuffer;",
        "payload",
        "Lzj0/f0;",
        "codec",
        "<init>",
        "(Ljava/nio/ByteBuffer;Lzj0/f0;)V",
        "Lst0/v;",
        "whoopDeviceType",
        "(Ljava/nio/ByteBuffer;Lst0/v;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "c",
        "Lzj0/f0;",
        "data",
        "d",
        "Ljava/nio/ByteBuffer;",
        "S",
        "()Ljava/nio/ByteBuffer;",
        "setData",
        "(Ljava/nio/ByteBuffer;)V",
        "e",
        "Ljava/lang/String;",
        "K",
        "packetName",
        "",
        "R",
        "()B",
        "commandByte",
        "Llt0/e;",
        "Q",
        "()Llt0/e;",
        "command",
        "Llt0/l;",
        "U",
        "()Llt0/l;",
        "puffinCommand",
        "T",
        "originSequenceNumber",
        "Lwj0/b;",
        "V",
        "()Lwj0/b;",
        "result",
        "",
        "W",
        "()Z",
        "isResultSuccess",
        "connectivity-core_release"
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
.field private final c:Lzj0/f0;

.field private d:Ljava/nio/ByteBuffer;

.field private final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;Lst0/v;)V
    .locals 1

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopDeviceType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    sget-object v0, Lzj0/f0;->a:Lzj0/f0$a;

    invoke-virtual {v0, p2}, Lzj0/f0$a;->a(Lst0/v;)Lzj0/f0;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lzj0/h;-><init>(Ljava/nio/ByteBuffer;Lzj0/f0;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/nio/ByteBuffer;Lst0/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Lst0/v;->MAVERICK:Lst0/v;

    :cond_0
    invoke-direct {p0, p1, p2}, Lzj0/h;-><init>(Ljava/nio/ByteBuffer;Lst0/v;)V

    return-void
.end method

.method private constructor <init>(Ljava/nio/ByteBuffer;Lzj0/f0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Llt0/c;-><init>(Ljava/nio/ByteBuffer;)V

    .line 2
    iput-object p2, p0, Lzj0/h;->c:Lzj0/f0;

    .line 3
    const-string p1, "CommandResponsePacket"

    iput-object p1, p0, Lzj0/h;->e:Ljava/lang/String;

    return-void
.end method

.method private final R()B
    .locals 2

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    return v0
.end method


# virtual methods
.method public K()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzj0/h;->e:Ljava/lang/String;

    return-object v0
.end method

.method public Q()Llt0/e;
    .locals 2

    iget-object v0, p0, Lzj0/h;->c:Lzj0/f0;

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-interface {v0, v1}, Lzj0/f0;->a(Ljava/nio/ByteBuffer;)Llt0/a;

    move-result-object v0

    instance-of v1, v0, Llt0/e;

    if-eqz v1, :cond_0

    check-cast v0, Llt0/e;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final S()Ljava/nio/ByteBuffer;
    .locals 2

    iget-object v0, p0, Lzj0/h;->d:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Lzj0/h;->c:Lzj0/f0;

    invoke-interface {v1}, Lzj0/f0;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Llt0/d;->a()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lzj0/h;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    :cond_0
    iget-object v0, p0, Lzj0/h;->d:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public T()B
    .locals 2

    iget-object v0, p0, Lzj0/h;->c:Lzj0/f0;

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-interface {v0, v1}, Lzj0/f0;->d(Ljava/nio/ByteBuffer;)B

    move-result v0

    return v0
.end method

.method public final U()Llt0/l;
    .locals 2

    sget-object v0, Llt0/a;->k:Llt0/a$a;

    invoke-direct {p0}, Lzj0/h;->R()B

    move-result v1

    invoke-virtual {v0, v1}, Llt0/a$a;->a(B)Llt0/l;

    move-result-object v0

    return-object v0
.end method

.method public V()Lwj0/b;
    .locals 2

    iget-object v0, p0, Lzj0/h;->c:Lzj0/f0;

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-interface {v0, v1}, Lzj0/f0;->b(Ljava/nio/ByteBuffer;)Lwj0/b;

    move-result-object v0

    return-object v0
.end method

.method public final W()Z
    .locals 2

    invoke-virtual {p0}, Lzj0/h;->V()Lwj0/b;

    move-result-object v0

    sget-object v1, Lwj0/b;->SUCCESS:Lwj0/b;

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lzj0/h;->V()Lwj0/b;

    move-result-object v0

    sget-object v1, Lwj0/b;->PENDING:Lwj0/b;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Lzj0/h;->K()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lzj0/h;->Q()Llt0/e;

    move-result-object v1

    invoke-virtual {p0}, Lzj0/h;->T()B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    invoke-virtual {p0}, Lzj0/h;->V()Lwj0/b;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " (Cmd:"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " Origin Seq#:"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ") Result:"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
