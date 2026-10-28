.class public abstract Lxj0/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u000f\u0010\u000c\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Ldk0/c;",
        "endPacket",
        "Lst0/v;",
        "deviceType",
        "Lxj0/q;",
        "d",
        "(Ldk0/c;Lst0/v;)Lxj0/q;",
        "c",
        "(Lst0/v;)Lxj0/q;",
        "Ljava/nio/ByteBuffer;",
        "b",
        "(Ldk0/c;)Ljava/nio/ByteBuffer;",
        "a",
        "()Ljava/nio/ByteBuffer;",
        "connectivity_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private static final a()Ljava/nio/ByteBuffer;
    .locals 3

    const/16 v0, 0x9

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Llt0/d;->a()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v1, Lwj0/b;->FAILURE:Lwj0/b;

    invoke-virtual {v1}, Lwj0/b;->getByteValue()B

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    const/4 v1, 0x4

    new-array v2, v1, [B

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    new-array v1, v1, [B

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    return-object v0
.end method

.method private static final b(Ldk0/c;)Ljava/nio/ByteBuffer;
    .locals 3

    invoke-interface {p0}, Ldk0/c;->e()[B

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-interface {p0}, Ldk0/c;->w()[B

    move-result-object p0

    if-nez p0, :cond_1

    return-object v1

    :cond_1
    const/16 v1, 0x9

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-static {}, Llt0/d;->a()Ljava/nio/ByteOrder;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v1

    sget-object v2, Lwj0/b;->SUCCESS:Lwj0/b;

    invoke-virtual {v2}, Lwj0/b;->getByteValue()B

    move-result v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    invoke-virtual {v1, p0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    return-object v1
.end method

.method public static final c(Lst0/v;)Lxj0/q;
    .locals 2

    const-string v0, "deviceType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxj0/q;

    invoke-static {}, Lxj0/r;->a()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lxj0/q;-><init>(Ljava/nio/ByteBuffer;Lst0/v;)V

    return-object v0
.end method

.method public static final d(Ldk0/c;Lst0/v;)Lxj0/q;
    .locals 1

    const-string v0, "endPacket"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lxj0/r;->b(Ldk0/c;)Ljava/nio/ByteBuffer;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lxj0/q;

    invoke-direct {v0, p0, p1}, Lxj0/q;-><init>(Ljava/nio/ByteBuffer;Lst0/v;)V

    return-object v0
.end method
