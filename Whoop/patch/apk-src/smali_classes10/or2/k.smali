.class public abstract Lor2/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0017\n\u0002\u0008\u0003\u001a1\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "",
        "offset",
        "numOfSamples",
        "Ljava/nio/ByteBuffer;",
        "byteBuffer",
        "Ltr2/n;",
        "logger",
        "",
        "a",
        "(IILjava/nio/ByteBuffer;Ltr2/n;)[S",
        "essentials_release"
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
.method public static final a(IILjava/nio/ByteBuffer;Ltr2/n;)[S
    .locals 1

    const-string v0, "byteBuffer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-array p1, p1, [S

    invoke-virtual {p2, p0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/nio/ShortBuffer;->get([S)Ljava/nio/ShortBuffer;

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p0

    const/4 p1, 0x0

    if-eqz p3, :cond_0

    const-string p2, "Caught an exception when trying to convert byte buffer to short array:"

    new-array v0, p1, [Lqr2/a$a;

    invoke-interface {p3, p2, p0, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_0
    new-array p0, p1, [S

    return-object p0
.end method

.method public static synthetic b(IILjava/nio/ByteBuffer;Ltr2/n;ILjava/lang/Object;)[S
    .locals 0

    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lor2/k;->a(IILjava/nio/ByteBuffer;Ltr2/n;)[S

    move-result-object p0

    return-object p0
.end method
