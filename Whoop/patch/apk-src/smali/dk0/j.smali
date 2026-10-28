.class public final Ldk0/j;
.super Llt0/b;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0010\n\n\u0002\u0008\u000f\n\u0002\u0010\u0017\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u000c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u0015R\u0011\u0010\u001c\u001a\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u0015R\u0011\u0010\u001e\u001a\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u0015R\u0011\u0010 \u001a\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010\u0015R\u0011\u0010\"\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\u0011R\u0011\u0010&\u001a\u00020#8F\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010%R\u0011\u0010*\u001a\u00020\'8F\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010)R\u0011\u0010,\u001a\u00020\'8F\u00a2\u0006\u0006\u001a\u0004\u0008+\u0010)\u00a8\u0006-"
    }
    d2 = {
        "Ldk0/j;",
        "Llt0/b;",
        "Ljava/nio/ByteBuffer;",
        "rawData",
        "payload",
        "<init>",
        "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V",
        "",
        "shortValue",
        "position",
        "b0",
        "(II)I",
        "",
        "Q",
        "()J",
        "dataSequenceNumber",
        "m0",
        "()I",
        "statusFlags",
        "",
        "d0",
        "()S",
        "heartKeyArrhythmiaCheckResult",
        "e0",
        "heartKeyArrhythmiaCheckStatus",
        "h0",
        "heartKeyProgressPercentage",
        "i0",
        "heartKeyUnreadableReason",
        "f0",
        "heartKeyAverageHr",
        "g0",
        "heartKeyHeartRate",
        "l0",
        "numOfEcgSamples",
        "",
        "c0",
        "()[S",
        "filteredEcgData",
        "",
        "j0",
        "()Z",
        "hkRunning",
        "k0",
        "leadsOn",
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
.method public constructor <init>(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V
    .locals 1

    const-string v0, "rawData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p1}, Llt0/b;-><init>(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method private final b0(II)I
    .locals 1

    const/4 v0, 0x1

    shl-int p2, v0, p2

    and-int/2addr p1, p2

    if-eqz p1, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public Q()J
    .locals 2

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    invoke-static {v0}, Luk0/b;->d(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public final c0()[S
    .locals 6

    invoke-virtual {p0}, Ldk0/j;->l0()I

    move-result v1

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v2

    const/16 v4, 0x8

    const/4 v5, 0x0

    const/16 v0, 0x1a

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lor2/k;->b(IILjava/nio/ByteBuffer;Ltr2/n;ILjava/lang/Object;)[S

    move-result-object v0

    return-object v0
.end method

.method public final d0()S
    .locals 2

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v0

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    invoke-static {v0}, Luk0/b;->b(B)S

    move-result v0

    return v0
.end method

.method public final e0()S
    .locals 2

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    invoke-static {v0}, Luk0/b;->b(B)S

    move-result v0

    return v0
.end method

.method public final f0()S
    .locals 2

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v0

    const/16 v1, 0x13

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    invoke-static {v0}, Luk0/b;->b(B)S

    move-result v0

    return v0
.end method

.method public final g0()S
    .locals 2

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v0

    const/16 v1, 0x14

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    invoke-static {v0}, Luk0/b;->b(B)S

    move-result v0

    return v0
.end method

.method public final h0()S
    .locals 2

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v0

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    invoke-static {v0}, Luk0/b;->b(B)S

    move-result v0

    return v0
.end method

.method public final i0()S
    .locals 2

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v0

    const/16 v1, 0x12

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    invoke-static {v0}, Luk0/b;->b(B)S

    move-result v0

    return v0
.end method

.method public final j0()Z
    .locals 2

    invoke-virtual {p0}, Ldk0/j;->m0()I

    move-result v0

    const/16 v1, 0x9

    invoke-direct {p0, v0, v1}, Ldk0/j;->b0(II)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final k0()Z
    .locals 2

    invoke-virtual {p0}, Ldk0/j;->m0()I

    move-result v0

    const/16 v1, 0xb

    invoke-direct {p0, v0, v1}, Ldk0/j;->b0(II)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final l0()I
    .locals 3

    sget-object v0, Luk0/b;->a:Luk0/b;

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v1

    const/16 v2, 0x18

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v1

    invoke-virtual {v0, v1}, Luk0/b;->e(S)I

    move-result v0

    return v0
.end method

.method public final m0()I
    .locals 3

    sget-object v0, Luk0/b;->a:Luk0/b;

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v1

    const/16 v2, 0xd

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v1

    invoke-virtual {v0, v1}, Luk0/b;->e(S)I

    move-result v0

    return v0
.end method
