.class public final Lmt0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmt0/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\t\n\u0002\u0008\t\u0008\u0086\u0008\u0018\u0000 02\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0019R\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR.\u0010(\u001a\u0004\u0018\u00010!2\u0008\u0010\"\u001a\u0004\u0018\u00010!8F@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008#\u0010$\u001a\u0004\u0008\u001b\u0010%\"\u0004\u0008&\u0010\'R$\u0010.\u001a\u00020)2\u0006\u0010*\u001a\u00020)8B@BX\u0082\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001e\u0010+\"\u0004\u0008,\u0010-R\u0014\u0010/\u001a\u00020\u000f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010\u0011R\u0011\u00101\u001a\u00020!8F\u00a2\u0006\u0006\u001a\u0004\u00080\u0010%\u00a8\u00062"
    }
    d2 = {
        "Lmt0/b;",
        "",
        "Llt0/i;",
        "frame",
        "<init>",
        "(Llt0/i;)V",
        "",
        "i",
        "()Z",
        "Llt0/n;",
        "j",
        "()Llt0/n;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Llt0/i;",
        "b",
        "()Llt0/i;",
        "I",
        "offsetData",
        "c",
        "minLength",
        "Ltr2/n;",
        "d",
        "Ltr2/n;",
        "logger",
        "Ljava/nio/ByteBuffer;",
        "value",
        "e",
        "Ljava/nio/ByteBuffer;",
        "()Ljava/nio/ByteBuffer;",
        "g",
        "(Ljava/nio/ByteBuffer;)V",
        "payload",
        "",
        "crc",
        "()J",
        "h",
        "(J)V",
        "payloadCrc",
        "payloadCrcOffset",
        "f",
        "rawData",
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


# static fields
.field public static final f:Lmt0/b$a;


# instance fields
.field private final a:Llt0/i;

.field private final b:I

.field private final c:I

.field private final d:Ltr2/n;

.field private e:Ljava/nio/ByteBuffer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lmt0/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmt0/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lmt0/b;->f:Lmt0/b$a;

    return-void
.end method

.method public constructor <init>(Llt0/i;)V
    .locals 1

    const-string v0, "frame"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmt0/b;->a:Llt0/i;

    invoke-virtual {p1}, Llt0/i;->c()I

    move-result p1

    iput p1, p0, Lmt0/b;->b:I

    add-int/lit8 p1, p1, 0x4

    iput p1, p0, Lmt0/b;->c:I

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string v0, "FramedPacket"

    invoke-virtual {p1, v0}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    iput-object p1, p0, Lmt0/b;->d:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Lmt0/b;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lmt0/b;->h(J)V

    return-void
.end method

.method private final d()J
    .locals 2

    invoke-virtual {p0}, Lmt0/b;->f()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-direct {p0}, Lmt0/b;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    invoke-static {v0}, Luk0/b;->d(I)J

    move-result-wide v0

    return-wide v0
.end method

.method private final e()I
    .locals 1

    invoke-virtual {p0}, Lmt0/b;->f()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    add-int/lit8 v0, v0, -0x4

    return v0
.end method

.method private final h(J)V
    .locals 3

    invoke-virtual {p0}, Lmt0/b;->f()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-direct {p0}, Lmt0/b;->e()I

    move-result v1

    sget-object v2, Luk0/b;->a:Luk0/b;

    invoke-virtual {v2, p1, p2}, Luk0/b;->c(J)I

    move-result p1

    invoke-virtual {v0, v1, p1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    return-void
.end method


# virtual methods
.method public final b()Llt0/i;
    .locals 1

    iget-object v0, p0, Lmt0/b;->a:Llt0/i;

    return-object v0
.end method

.method public final c()Ljava/nio/ByteBuffer;
    .locals 5

    iget-object v0, p0, Lmt0/b;->e:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lmt0/b;->a:Llt0/i;

    invoke-virtual {v0}, Llt0/i;->g()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    iget v1, p0, Lmt0/b;->c:I

    if-le v0, v1, :cond_1

    iget-object v0, p0, Lmt0/b;->a:Llt0/i;

    invoke-virtual {v0}, Llt0/i;->g()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    iget v1, p0, Lmt0/b;->b:I

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-static {}, Llt0/d;->a()Ljava/nio/ByteOrder;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v1

    iget-object v2, p0, Lmt0/b;->a:Llt0/i;

    invoke-virtual {v2}, Llt0/i;->g()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    iget-object v3, p0, Lmt0/b;->a:Llt0/i;

    invoke-virtual {v3}, Llt0/i;->g()Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v3

    iget v4, p0, Lmt0/b;->b:I

    add-int/2addr v3, v4

    invoke-static {v2, v3, v0}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    iput-object v1, p0, Lmt0/b;->e:Ljava/nio/ByteBuffer;

    return-object v1

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lmt0/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lmt0/b;

    iget-object v1, p0, Lmt0/b;->a:Llt0/i;

    iget-object p1, p1, Lmt0/b;->a:Llt0/i;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final f()Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Lmt0/b;->a:Llt0/i;

    invoke-virtual {v0}, Llt0/i;->g()Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public final g(Ljava/nio/ByteBuffer;)V
    .locals 2

    iput-object p1, p0, Lmt0/b;->e:Ljava/nio/ByteBuffer;

    iget-object v0, p0, Lmt0/b;->a:Llt0/i;

    invoke-virtual {v0}, Llt0/i;->g()Ljava/nio/ByteBuffer;

    move-result-object v0

    iget v1, p0, Lmt0/b;->b:I

    invoke-static {v0, v1, p1}, Ltt0/d;->d(Ljava/nio/ByteBuffer;ILjava/nio/ByteBuffer;)V

    return-void
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lmt0/b;->a:Llt0/i;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final i()Z
    .locals 2

    invoke-virtual {p0}, Lmt0/b;->j()Llt0/n;

    move-result-object v0

    sget-object v1, Llt0/n;->SUCCESS:Llt0/n;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final j()Llt0/n;
    .locals 9

    iget-object v0, p0, Lmt0/b;->a:Llt0/i;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Llt0/i;->q(Z)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lmt0/b;->d:Ltr2/n;

    const-string v2, "Packet validation failed: Frame validation failed"

    new-array v3, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lmt0/b;->a:Llt0/i;

    invoke-virtual {v0, v1}, Llt0/i;->r(Z)Llt0/n;

    move-result-object v0

    sget-object v1, Llt0/n;->FAIL_OTHER:Llt0/n;

    if-ne v0, v1, :cond_0

    sget-object v0, Llt0/n;->FAIL_FRAME_INVALID:Llt0/n;

    :cond_0
    return-object v0

    :cond_1
    invoke-virtual {p0}, Lmt0/b;->f()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    iget v2, p0, Lmt0/b;->c:I

    if-ge v0, v2, :cond_2

    iget-object v0, p0, Lmt0/b;->d:Ltr2/n;

    const-string v2, "Packet validation failed: data too short"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v0, Llt0/n;->FAIL_TOO_SHORT:Llt0/n;

    return-object v0

    :cond_2
    invoke-virtual {p0}, Lmt0/b;->f()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    invoke-static {v0}, Ltt0/d;->b(I)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lmt0/b;->d:Ltr2/n;

    const-string v2, "Packet validation failed: data unaligned"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v0, Llt0/n;->FAIL_UNALIGNED:Llt0/n;

    return-object v0

    :cond_3
    invoke-virtual {p0}, Lmt0/b;->c()Ljava/nio/ByteBuffer;

    move-result-object v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lmt0/b;->d:Ltr2/n;

    const-string v2, "Packet validation failed: no payload"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v0, Llt0/n;->FAIL_NO_PAYLOAD:Llt0/n;

    return-object v0

    :cond_4
    sget-object v0, Ltt0/c;->a:Ltt0/c;

    invoke-virtual {p0}, Lmt0/b;->c()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {p0}, Lmt0/b;->d()J

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Ltt0/c;->a(Ljava/nio/ByteBuffer;J)Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {p0}, Lmt0/b;->c()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Ltt0/c;->c(Ljava/nio/ByteBuffer;)J

    move-result-wide v2

    invoke-direct {p0}, Lmt0/b;->d()J

    move-result-wide v4

    invoke-virtual {p0}, Lmt0/b;->f()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lze1/b;->b(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object v0

    iget-object v6, p0, Lmt0/b;->d:Ltr2/n;

    const-string v7, "Payload validation failed: CRC failure. Computed: "

    const-string v8, " Expected: "

    invoke-static {v2, v3, v7, v8}, Lyb0/f;->b(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, " Full Packet: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v6, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v0, Llt0/n;->FAIL_CRC32:Llt0/n;

    return-object v0

    :cond_5
    sget-object v0, Llt0/n;->SUCCESS:Llt0/n;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lmt0/b;->a:Llt0/i;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "FramedPacket(frame="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
