.class public abstract Ltt0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(I)I
    .locals 1

    rem-int/lit8 v0, p0, 0x4

    if-eqz v0, :cond_0

    rsub-int/lit8 v0, v0, 0x4

    add-int/2addr v0, p0

    return v0

    :cond_0
    return p0
.end method

.method public static b(I)Z
    .locals 0

    rem-int/lit8 p0, p0, 0x4

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static c(Ljava/nio/ByteBuffer;)Z
    .locals 0

    invoke-virtual {p0}, Ljava/nio/Buffer;->limit()I

    move-result p0

    invoke-static {p0}, Ltt0/d;->b(I)Z

    move-result p0

    return p0
.end method

.method public static d(Ljava/nio/ByteBuffer;ILjava/nio/ByteBuffer;)V
    .locals 0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->mark()Ljava/nio/Buffer;

    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->reset()Ljava/nio/Buffer;

    return-void
.end method
