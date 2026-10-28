.class public final Ld/g0;
.super Ljava/io/FilterInputStream;
.source "SourceFile"


# instance fields
.field public final w:I

.field public final x:Z

.field public final y:[[B


# direct methods
.method public constructor <init>(Ljava/io/ByteArrayInputStream;IZ)V
    .locals 1

    const/16 v0, 0xb

    .line 1
    new-array v0, v0, [[B

    invoke-direct {p0, p1, p2, p3, v0}, Ld/g0;-><init>(Ljava/io/InputStream;IZ[[B)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;IZ[[B)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    iput p2, p0, Ld/g0;->w:I

    iput-boolean p3, p0, Ld/g0;->x:Z

    iput-object p4, p0, Ld/g0;->y:[[B

    return-void
.end method

.method public constructor <init>([B)V
    .locals 2

    .line 3
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    array-length p1, p1

    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, v0, p1, v1}, Ld/g0;-><init>(Ljava/io/ByteArrayInputStream;IZ)V

    return-void
.end method

.method public static b(Ljava/io/InputStream;I)I
    .locals 4

    const/16 v0, 0x1f

    and-int/2addr p1, v0

    if-ne p1, v0, :cond_6

    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result p1

    const-string v1, "EOF found inside tag value."

    if-ge p1, v0, :cond_1

    if-gez p1, :cond_0

    new-instance p0, Ljava/io/EOFException;

    invoke-direct {p0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "corrupted stream - high tag number < 31 found"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    and-int/lit8 v0, p1, 0x7f

    if-eqz v0, :cond_5

    :goto_0
    and-int/lit16 p1, p1, 0x80

    if-eqz p1, :cond_4

    ushr-int/lit8 p1, v0, 0x18

    if-nez p1, :cond_3

    shl-int/lit8 p1, v0, 0x7

    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v0

    if-ltz v0, :cond_2

    and-int/lit8 v2, v0, 0x7f

    or-int/2addr p1, v2

    move v3, v0

    move v0, p1

    move p1, v3

    goto :goto_0

    :cond_2
    new-instance p0, Ljava/io/EOFException;

    invoke-direct {p0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Tag number more than 31 bits"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    return v0

    :cond_5
    new-instance p0, Ljava/io/IOException;

    const-string p1, "corrupted stream - invalid high tag number found"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    return p1
.end method

.method public static h(Ljava/io/InputStream;IZ)I
    .locals 5

    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v0

    ushr-int/lit8 v1, v0, 0x7

    if-nez v1, :cond_0

    return v0

    :cond_0
    const/16 v1, 0x80

    if-ne v1, v0, :cond_1

    const/4 p0, -0x1

    return p0

    :cond_1
    if-ltz v0, :cond_8

    const/16 v1, 0xff

    if-eq v1, v0, :cond_7

    and-int/lit8 v0, v0, 0x7f

    const/4 v1, 0x0

    move v2, v1

    :cond_2
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v3

    if-ltz v3, :cond_6

    ushr-int/lit8 v4, v1, 0x17

    if-nez v4, :cond_5

    shl-int/lit8 v1, v1, 0x8

    add-int/2addr v1, v3

    add-int/lit8 v2, v2, 0x1

    if-lt v2, v0, :cond_2

    if-lt v1, p1, :cond_4

    if-eqz p2, :cond_3

    goto :goto_0

    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string p2, "corrupted stream - out of bounds length found: "

    const-string v0, " >= "

    invoke-static {v1, p1, p2, v0}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    :goto_0
    return v1

    :cond_5
    new-instance p0, Ljava/io/IOException;

    const-string p1, "long form definite-length more than 31 bits"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    new-instance p0, Ljava/io/EOFException;

    const-string p1, "EOF found reading length"

    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_7
    new-instance p0, Ljava/io/IOException;

    const-string p1, "invalid long form definite-length 0xFF"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    new-instance p0, Ljava/io/EOFException;

    const-string p1, "EOF found when length expected"

    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static m(ILd/c;[[B)Ld/b1;
    .locals 5

    const-string v0, "unsupported tag "

    const-string v1, "unknown tag "

    const/4 v2, 0x0

    const/16 v3, 0x1000

    const/4 v4, 0x1

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    :try_start_0
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " encountered"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    invoke-static {p1}, Ld/g0;->x(Ld/c;)[C

    move-result-object p0

    new-instance p1, Ld/y0;

    invoke-direct {p1, p0}, Ld/y0;-><init>([C)V

    return-object p1

    :pswitch_2
    invoke-virtual {p1}, Ld/c;->h()[B

    move-result-object p0

    new-instance p1, Ld/i0;

    invoke-direct {p1, p0}, Ld/i0;-><init>([B)V

    return-object p1

    :pswitch_3
    invoke-virtual {p1}, Ld/c;->h()[B

    move-result-object p0

    new-instance p1, Ld/c1;

    invoke-direct {p1, p0}, Ld/c1;-><init>([B)V

    return-object p1

    :pswitch_4
    invoke-virtual {p1}, Ld/c;->h()[B

    move-result-object p0

    new-instance p1, Ld/m0;

    invoke-direct {p1, p0}, Ld/m0;-><init>([B)V

    return-object p1

    :pswitch_5
    invoke-virtual {p1}, Ld/c;->h()[B

    move-result-object p0

    new-instance p1, Ld/f1;

    invoke-direct {p1, p0}, Ld/f1;-><init>([B)V

    return-object p1

    :pswitch_6
    invoke-virtual {p1}, Ld/c;->h()[B

    move-result-object p0

    new-instance p1, Ld/c0;

    invoke-direct {p1, p0}, Ld/c0;-><init>([B)V

    return-object p1

    :pswitch_7
    invoke-virtual {p1}, Ld/c;->h()[B

    move-result-object p0

    new-instance p1, Ld/k;

    invoke-direct {p1, p0}, Ld/k;-><init>([B)V

    return-object p1

    :pswitch_8
    invoke-virtual {p1}, Ld/c;->h()[B

    move-result-object p0

    new-instance p1, Ld/b;

    invoke-direct {p1, p0}, Ld/b;-><init>([B)V

    return-object p1

    :pswitch_9
    invoke-virtual {p1}, Ld/c;->h()[B

    move-result-object p0

    new-instance p1, Ld/l0;

    invoke-direct {p1, p0}, Ld/l0;-><init>([B)V

    return-object p1

    :pswitch_a
    invoke-virtual {p1}, Ld/c;->h()[B

    move-result-object p0

    new-instance p1, Ld/b0;

    invoke-direct {p1, p0}, Ld/b0;-><init>([B)V

    return-object p1

    :pswitch_b
    invoke-virtual {p1}, Ld/c;->h()[B

    move-result-object p0

    new-instance p1, Ld/u;

    invoke-direct {p1, p0}, Ld/u;-><init>([B)V

    return-object p1

    :pswitch_c
    invoke-virtual {p1}, Ld/c;->h()[B

    move-result-object p0

    new-instance p1, Ld/h;

    invoke-direct {p1, p0}, Ld/h;-><init>([B)V

    return-object p1

    :pswitch_d
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " encountered"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_e
    iget p0, p1, Ld/c;->z:I

    sget-object v0, Ld/d1;->c:Ljava/util/HashMap;

    if-gt p0, v3, :cond_0

    invoke-static {p1, p2}, Ld/g0;->s(Ld/c;[[B)[B

    move-result-object p0

    invoke-static {p0}, Ld/d1;->l([B)Ld/d1;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "exceeded relative OID contents length limit"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_f
    invoke-virtual {p1}, Ld/c;->h()[B

    move-result-object p0

    new-instance p1, Ld/f0;

    invoke-direct {p1, p0}, Ld/f0;-><init>([B)V

    return-object p1

    :pswitch_10
    invoke-static {p1, p2}, Ld/g0;->s(Ld/c;[[B)[B

    move-result-object p0

    array-length p1, p0

    if-le p1, v4, :cond_1

    new-instance p1, Ld/v;

    invoke-direct {p1, p0}, Ld/v;-><init>([B)V

    return-object p1

    :cond_1
    array-length p1, p0

    if-eqz p1, :cond_4

    aget-byte p1, p0, v2

    and-int/lit16 p1, p1, 0xff

    sget-object p2, Ld/v;->b:[Ld/v;

    const/16 v0, 0xc

    if-lt p1, v0, :cond_2

    new-instance p1, Ld/v;

    invoke-direct {p1, p0}, Ld/v;-><init>([B)V

    return-object p1

    :cond_2
    aget-object v0, p2, p1

    if-nez v0, :cond_3

    new-instance v0, Ld/v;

    invoke-direct {v0, p0}, Ld/v;-><init>([B)V

    aput-object v0, p2, p1

    :cond_3
    return-object v0

    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "ENUMERATED has zero length"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_11
    invoke-virtual {p1}, Ld/c;->h()[B

    move-result-object p0

    new-instance p1, Ld/n0;

    new-instance p2, Ld/f1;

    invoke-direct {p2, p0}, Ld/f1;-><init>([B)V

    invoke-direct {p1, p2}, Ld/n0;-><init>(Ld/f1;)V

    return-object p1

    :pswitch_12
    iget p0, p1, Ld/c;->z:I

    sget-object v0, Ld/s0;->c:Ljava/util/HashMap;

    if-gt p0, v3, :cond_8

    invoke-static {p1, p2}, Ld/g0;->s(Ld/c;[[B)[B

    move-result-object p0

    array-length p1, p0

    if-gt p1, v3, :cond_7

    new-instance p1, Ld/p0;

    invoke-direct {p1, p0}, Ld/p0;-><init>([B)V

    sget-object p2, Ld/s0;->c:Ljava/util/HashMap;

    monitor-enter p2
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld/s0;

    if-eqz p1, :cond_5

    monitor-exit p2

    return-object p1

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_5
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {p0}, Ld/d1;->m([B)Z

    move-result p1

    if-eqz p1, :cond_6

    new-instance p1, Ld/s0;

    invoke-virtual {p0}, [B->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [B

    invoke-direct {p1, p0}, Ld/s0;-><init>([B)V

    return-object p1

    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "invalid OID contents"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_0

    :goto_0
    :try_start_3
    monitor-exit p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p0

    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "exceeded OID contents length limit"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "exceeded OID contents length limit"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_13
    invoke-virtual {p1}, Ld/c;->h()[B

    move-result-object p0

    array-length p0, p0

    if-nez p0, :cond_9

    sget-object p0, Ld/e;->a:Ld/e;

    return-object p0

    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "malformed NULL encoding encountered"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_14
    invoke-virtual {p1}, Ld/c;->h()[B

    move-result-object p0

    new-instance p1, Ld/l;

    invoke-direct {p1, p0}, Ld/x0;-><init>([B)V

    return-object p1

    :pswitch_15
    invoke-virtual {p1}, Ld/c;->h()[B

    move-result-object p0

    invoke-static {p0}, Ld/g;->l([B)Ld/g;

    move-result-object p0

    return-object p0

    :pswitch_16
    invoke-virtual {p1}, Ld/c;->h()[B

    move-result-object p0

    new-instance p1, Ld/j0;

    invoke-direct {p1, p0}, Ld/j0;-><init>([B)V

    return-object p1

    :pswitch_17
    invoke-static {p1, p2}, Ld/g0;->s(Ld/c;[[B)[B

    move-result-object p0

    array-length p1, p0

    if-ne p1, v4, :cond_c

    aget-byte p0, p0, v2

    const/4 p1, -0x1

    if-eq p0, p1, :cond_b

    if-eqz p0, :cond_a

    new-instance p1, Ld/n;

    invoke-direct {p1, p0}, Ld/n;-><init>(B)V

    return-object p1

    :cond_a
    sget-object p0, Ld/n;->b:Ld/n;

    return-object p0

    :cond_b
    sget-object p0, Ld/n;->c:Ld/n;

    return-object p0

    :cond_c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "BOOLEAN value should have 1 byte in it"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p0

    new-instance p1, La/h;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p0, p2}, La/h;-><init>(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    throw p1

    :catch_1
    move-exception p0

    new-instance p1, La/h;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p0, p2}, La/h;-><init>(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_0
        :pswitch_0
        :pswitch_10
        :pswitch_0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
    .end packed-switch
.end method

.method public static s(Ld/c;[[B)[B
    .locals 5

    iget v0, p0, Ld/c;->z:I

    array-length v1, p1

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Ld/c;->h()[B

    move-result-object p0

    return-object p0

    :cond_0
    aget-object v1, p1, v0

    if-nez v1, :cond_1

    new-array v1, v0, [B

    aput-object v1, p1, v0

    :cond_1
    array-length p1, v1

    if-ne v0, p1, :cond_7

    if-nez v0, :cond_2

    return-object v1

    :cond_2
    iget p1, p0, Ld/p;->x:I

    if-ge v0, p1, :cond_6

    iget-object p1, p0, Ld/p;->w:Ljava/io/InputStream;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_4

    sub-int v4, v2, v3

    invoke-virtual {p1, v1, v3, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v4

    if-gez v4, :cond_3

    goto :goto_1

    :cond_3
    add-int/2addr v3, v4

    goto :goto_0

    :cond_4
    :goto_1
    sub-int/2addr v0, v3

    iput v0, p0, Ld/c;->z:I

    if-nez v0, :cond_5

    invoke-virtual {p0}, Ld/p;->b()V

    return-object v1

    :cond_5
    new-instance p1, Ljava/io/EOFException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DEF length "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ld/c;->y:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " object truncated by "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, Ld/c;->z:I

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "corrupted stream - out of bounds length found: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p0, p0, Ld/c;->z:I

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " >= "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "buffer length not right for data"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static x(Ld/c;)[C
    .locals 11

    iget v0, p0, Ld/c;->z:I

    and-int/lit8 v1, v0, 0x1

    if-nez v1, :cond_a

    div-int/lit8 v1, v0, 0x2

    new-array v2, v1, [C

    const/16 v3, 0x8

    new-array v4, v3, [B

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    const-string v7, "EOF encountered in middle of BMPString"

    const/4 v8, 0x2

    if-lt v0, v3, :cond_3

    move v9, v5

    :goto_1
    if-ge v9, v3, :cond_1

    rsub-int/lit8 v10, v9, 0x8

    invoke-virtual {p0, v4, v9, v10}, Ld/c;->read([BII)I

    move-result v10

    if-gez v10, :cond_0

    goto :goto_2

    :cond_0
    add-int/2addr v9, v10

    goto :goto_1

    :cond_1
    :goto_2
    if-ne v9, v3, :cond_2

    aget-byte v7, v4, v5

    shl-int/2addr v7, v3

    const/4 v9, 0x1

    aget-byte v9, v4, v9

    and-int/lit16 v9, v9, 0xff

    or-int/2addr v7, v9

    int-to-char v7, v7

    aput-char v7, v2, v6

    add-int/lit8 v7, v6, 0x1

    aget-byte v8, v4, v8

    shl-int/2addr v8, v3

    const/4 v9, 0x3

    aget-byte v9, v4, v9

    and-int/lit16 v9, v9, 0xff

    or-int/2addr v8, v9

    int-to-char v8, v8

    aput-char v8, v2, v7

    add-int/lit8 v7, v6, 0x2

    const/4 v8, 0x4

    aget-byte v8, v4, v8

    shl-int/2addr v8, v3

    const/4 v9, 0x5

    aget-byte v9, v4, v9

    and-int/lit16 v9, v9, 0xff

    or-int/2addr v8, v9

    int-to-char v8, v8

    aput-char v8, v2, v7

    add-int/lit8 v7, v6, 0x3

    const/4 v8, 0x6

    aget-byte v8, v4, v8

    shl-int/2addr v8, v3

    const/4 v9, 0x7

    aget-byte v9, v4, v9

    and-int/lit16 v9, v9, 0xff

    or-int/2addr v8, v9

    int-to-char v8, v8

    aput-char v8, v2, v7

    add-int/lit8 v6, v6, 0x4

    add-int/lit8 v0, v0, -0x8

    goto :goto_0

    :cond_2
    new-instance p0, Ljava/io/EOFException;

    invoke-direct {p0, v7}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    if-lez v0, :cond_8

    move v9, v5

    :goto_3
    if-ge v9, v0, :cond_5

    sub-int v10, v0, v9

    invoke-virtual {p0, v4, v9, v10}, Ld/c;->read([BII)I

    move-result v10

    if-gez v10, :cond_4

    goto :goto_4

    :cond_4
    add-int/2addr v9, v10

    goto :goto_3

    :cond_5
    :goto_4
    if-ne v9, v0, :cond_7

    :cond_6
    add-int/lit8 v7, v5, 0x1

    aget-byte v9, v4, v5

    shl-int/2addr v9, v3

    add-int/2addr v5, v8

    aget-byte v7, v4, v7

    and-int/lit16 v7, v7, 0xff

    add-int/lit8 v10, v6, 0x1

    or-int/2addr v7, v9

    int-to-char v7, v7

    aput-char v7, v2, v6

    move v6, v10

    if-lt v5, v0, :cond_6

    goto :goto_5

    :cond_7
    new-instance p0, Ljava/io/EOFException;

    invoke-direct {p0, v7}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    :goto_5
    iget p0, p0, Ld/c;->z:I

    if-nez p0, :cond_9

    if-ne v1, v6, :cond_9

    return-object v2

    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0

    :cond_a
    new-instance p0, Ljava/io/IOException;

    const-string v0, "malformed BMPString encoding encountered"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final J(Ld/c;)Ld/s;
    .locals 5

    iget v0, p1, Ld/c;->z:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    new-instance p1, Ld/s;

    invoke-direct {p1, v2}, Ld/s;-><init>(I)V

    return-object p1

    :cond_0
    new-instance v1, Ld/g0;

    iget-boolean v3, p0, Ld/g0;->x:Z

    iget-object v4, p0, Ld/g0;->y:[[B

    invoke-direct {v1, p1, v0, v3, v4}, Ld/g0;-><init>(Ljava/io/InputStream;IZ[[B)V

    invoke-virtual {v1}, Ld/g0;->i()Ld/b1;

    move-result-object p1

    if-nez p1, :cond_1

    new-instance p1, Ld/s;

    invoke-direct {p1, v2}, Ld/s;-><init>(I)V

    return-object p1

    :cond_1
    new-instance v0, Ld/s;

    const/16 v2, 0xa

    invoke-direct {v0, v2}, Ld/s;-><init>(I)V

    :cond_2
    invoke-virtual {v0, p1}, Ld/s;->e(Ld/b1;)V

    invoke-virtual {v1}, Ld/g0;->i()Ld/b1;

    move-result-object p1

    if-nez p1, :cond_2

    return-object v0
.end method

.method public final i()Ld/b1;
    .locals 10

    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v0

    const/4 v1, 0x0

    if-gtz v0, :cond_1

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "unexpected end-of-contents marker"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {p0, v0}, Ld/g0;->b(Ljava/io/InputStream;I)I

    move-result v5

    iget v2, p0, Ld/g0;->w:I

    const/4 v3, 0x0

    invoke-static {p0, v2, v3}, Ld/g0;->h(Ljava/io/InputStream;IZ)I

    move-result v4

    if-ltz v4, :cond_2

    :try_start_0
    invoke-virtual {p0, v0, v5, v4}, Ld/g0;->k(III)Ld/b1;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, La/h;

    const-string v2, "corrupted stream detected"

    invoke-direct {v1, v0, v2}, La/h;-><init>(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    throw v1

    :cond_2
    and-int/lit8 v4, v0, 0x20

    if-eqz v4, :cond_d

    new-instance v4, Ld/i;

    invoke-direct {v4, p0, v2}, Ld/i;-><init>(Ljava/io/InputStream;I)V

    new-instance v6, Lab/h0;

    iget-object v7, p0, Ld/g0;->y:[[B

    const/4 v8, 0x5

    invoke-direct {v6, v4, v2, v7, v8}, Lab/h0;-><init>(Ljava/lang/Object;ILjava/io/Serializable;I)V

    and-int/lit16 v4, v0, 0xc0

    move v0, v3

    const/4 v3, 0x4

    move v2, v3

    const/4 v3, 0x3

    const/4 v7, 0x1

    if-eqz v4, :cond_5

    invoke-virtual {v6}, Lab/h0;->c()Ld/s;

    move-result-object v1

    iget v6, v1, Ld/s;->a:I

    if-ne v6, v7, :cond_3

    new-instance v2, Ld/d0;

    invoke-virtual {v1, v0}, Ld/s;->d(I)Ld/q;

    move-result-object v6

    const/4 v7, 0x1

    invoke-direct/range {v2 .. v7}, Ld/d0;-><init>(IIILd/q;I)V

    return-object v2

    :cond_3
    move v3, v2

    new-instance v2, Ld/d0;

    sget-object v0, Ld/y;->a:Ld/e0;

    if-ge v6, v7, :cond_4

    sget-object v0, Ld/y;->a:Ld/e0;

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_4
    new-instance v0, Ld/e0;

    invoke-direct {v0, v1}, Ld/h1;-><init>(Ld/s;)V

    goto :goto_0

    :goto_1
    const/4 v7, 0x1

    invoke-direct/range {v2 .. v7}, Ld/d0;-><init>(IIILd/q;I)V

    return-object v2

    :cond_5
    move v9, v3

    move v3, v2

    move v2, v9

    const/16 v4, 0x1000

    if-eq v5, v2, :cond_b

    if-eq v5, v3, :cond_9

    const/16 v0, 0x8

    if-eq v5, v0, :cond_8

    const/16 v0, 0x10

    if-eq v5, v0, :cond_7

    const/16 v0, 0x11

    if-ne v5, v0, :cond_6

    new-instance v0, Ld/k0;

    invoke-virtual {v6}, Lab/h0;->c()Ld/s;

    move-result-object v1

    invoke-direct {v0, v1}, Ld/a;-><init>(Ld/s;)V

    return-object v0

    :cond_6
    new-instance v0, Ljava/io/IOException;

    const-string v1, "unknown BER object encountered"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ld/e0;

    invoke-virtual {v6}, Lab/h0;->c()Ld/s;

    move-result-object v1

    invoke-direct {v0, v1}, Ld/h1;-><init>(Ld/s;)V

    return-object v0

    :cond_8
    :try_start_1
    new-instance v0, Ld/u0;

    new-instance v1, Ld/x;

    invoke-virtual {v6}, Lab/h0;->c()Ld/s;

    move-result-object v2

    invoke-direct {v1, v2, v7}, Ld/x;-><init>(Ld/s;I)V

    const/4 v2, -0x1

    iput v2, v1, Ld/x;->c:I

    invoke-direct {v0, v1}, Ld/u0;-><init>(Ld/x;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    :catch_1
    move-exception v0

    new-instance v1, La/h;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, La/h;-><init>(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    throw v1

    :cond_9
    new-instance v2, Ld/a0;

    new-instance v3, Ld/v0;

    invoke-direct {v3, v6}, Ld/v0;-><init>(Lab/h0;)V

    new-instance v5, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v5}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-array v6, v4, [B

    :goto_2
    invoke-virtual {v3, v6, v0, v4}, Ld/v0;->read([BII)I

    move-result v7

    if-ltz v7, :cond_a

    invoke-virtual {v5, v6, v0, v7}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_2

    :cond_a
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-direct {v2, v0, v1}, Ld/a0;-><init>([B[Ld/x0;)V

    return-object v2

    :cond_b
    new-instance v1, Ld/t0;

    invoke-direct {v1, v6}, Ld/t0;-><init>(Lab/h0;)V

    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-array v3, v4, [B

    :goto_3
    invoke-virtual {v1, v3, v0, v4}, Ld/t0;->read([BII)I

    move-result v5

    if-ltz v5, :cond_c

    invoke-virtual {v2, v3, v0, v5}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_3

    :cond_c
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    iget v1, v1, Ld/t0;->y:I

    new-instance v2, Ld/t;

    invoke-direct {v2, v0, v1}, Ld/t;-><init>([BI)V

    return-object v2

    :cond_d
    new-instance v0, Ljava/io/IOException;

    const-string v1, "indefinite-length primitive encoding encountered"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final k(III)Ld/b1;
    .locals 6

    new-instance v0, Ld/c;

    iget v1, p0, Ld/g0;->w:I

    invoke-direct {v0, p0, p3, v1}, Ld/c;-><init>(Ljava/io/InputStream;II)V

    and-int/lit16 p3, p1, 0xe0

    if-nez p3, :cond_0

    iget-object p1, p0, Ld/g0;->y:[[B

    invoke-static {p2, v0, p1}, Ld/g0;->m(ILd/c;[[B)Ld/b1;

    move-result-object p1

    return-object p1

    :cond_0
    and-int/lit16 v2, p1, 0xc0

    const/4 v1, 0x3

    const/4 p3, -0x1

    const/4 v3, 0x0

    move v4, v1

    const/4 v1, 0x4

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    and-int/lit8 p1, p1, 0x20

    if-eqz p1, :cond_3

    invoke-virtual {p0, v0}, Ld/g0;->J(Ld/c;)Ld/s;

    move-result-object p1

    iget v0, p1, Ld/s;->a:I

    if-ne v0, v5, :cond_1

    new-instance v0, Ld/d0;

    move v1, v4

    invoke-virtual {p1, v3}, Ld/s;->d(I)Ld/q;

    move-result-object v4

    const/4 v5, 0x2

    move v3, p2

    invoke-direct/range {v0 .. v5}, Ld/d0;-><init>(IIILd/q;I)V

    return-object v0

    :cond_1
    move v3, p2

    move p2, v0

    new-instance v0, Ld/d0;

    sget-object v4, Ld/w0;->a:Ld/x;

    if-ge p2, v5, :cond_2

    sget-object p1, Ld/w0;->a:Ld/x;

    move-object v4, p1

    goto :goto_0

    :cond_2
    new-instance p2, Ld/x;

    invoke-direct {p2, p1, v5}, Ld/x;-><init>(Ld/s;I)V

    iput p3, p2, Ld/x;->c:I

    move-object v4, p2

    :goto_0
    const/4 v5, 0x2

    invoke-direct/range {v0 .. v5}, Ld/d0;-><init>(IIILd/q;I)V

    return-object v0

    :cond_3
    move v3, p2

    invoke-virtual {v0}, Ld/c;->h()[B

    move-result-object p1

    new-instance v0, Ld/d0;

    new-instance v4, Ld/l;

    invoke-direct {v4, p1}, Ld/x0;-><init>([B)V

    const/4 v5, 0x2

    invoke-direct/range {v0 .. v5}, Ld/d0;-><init>(IIILd/q;I)V

    return-object v0

    :cond_4
    move p1, p2

    move p2, v1

    move v1, v4

    if-eq p1, v1, :cond_10

    if-eq p1, p2, :cond_d

    const/16 p2, 0x8

    if-eq p1, p2, :cond_b

    const/16 p2, 0x10

    if-eq p1, p2, :cond_7

    const/16 p2, 0x11

    if-ne p1, p2, :cond_6

    invoke-virtual {p0, v0}, Ld/g0;->J(Ld/c;)Ld/s;

    move-result-object p1

    sget-object p2, Ld/w0;->a:Ld/x;

    iget p2, p1, Ld/s;->a:I

    if-ge p2, v5, :cond_5

    sget-object p1, Ld/w0;->b:Ld/z;

    return-object p1

    :cond_5
    new-instance p2, Ld/z;

    invoke-direct {p2, p1}, Ld/z;-><init>(Ld/s;)V

    iput p3, p2, Ld/z;->d:I

    return-object p2

    :cond_6
    new-instance p2, Ljava/io/IOException;

    const-string p3, "unknown tag "

    const-string v0, " encountered"

    invoke-static {p1, p3, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_7
    iget p1, v0, Ld/c;->z:I

    if-ge p1, v5, :cond_8

    sget-object p1, Ld/w0;->a:Ld/x;

    return-object p1

    :cond_8
    iget-boolean p1, p0, Ld/g0;->x:Z

    if-eqz p1, :cond_9

    new-instance p1, Ld/m;

    invoke-virtual {v0}, Ld/c;->h()[B

    move-result-object p2

    invoke-direct {p1}, Ld/h1;-><init>()V

    iput-object p2, p1, Ld/m;->b:[B

    return-object p1

    :cond_9
    invoke-virtual {p0, v0}, Ld/g0;->J(Ld/c;)Ld/s;

    move-result-object p1

    sget-object p2, Ld/w0;->a:Ld/x;

    iget p2, p1, Ld/s;->a:I

    if-ge p2, v5, :cond_a

    sget-object p1, Ld/w0;->a:Ld/x;

    return-object p1

    :cond_a
    new-instance p2, Ld/x;

    invoke-direct {p2, p1, v5}, Ld/x;-><init>(Ld/s;I)V

    iput p3, p2, Ld/x;->c:I

    return-object p2

    :cond_b
    invoke-virtual {p0, v0}, Ld/g0;->J(Ld/c;)Ld/s;

    move-result-object p1

    sget-object p2, Ld/w0;->a:Ld/x;

    iget p2, p1, Ld/s;->a:I

    if-ge p2, v5, :cond_c

    sget-object p1, Ld/w0;->a:Ld/x;

    goto :goto_1

    :cond_c
    new-instance p2, Ld/x;

    invoke-direct {p2, p1, v5}, Ld/x;-><init>(Ld/s;I)V

    iput p3, p2, Ld/x;->c:I

    move-object p1, p2

    :goto_1
    new-instance p2, Ld/u0;

    invoke-direct {p2, p1}, Ld/u0;-><init>(Ld/x;)V

    return-object p2

    :cond_d
    invoke-virtual {p0, v0}, Ld/g0;->J(Ld/c;)Ld/s;

    move-result-object p1

    iget p2, p1, Ld/s;->a:I

    new-array p3, p2, [Ld/x0;

    :goto_2
    if-eq v3, p2, :cond_f

    invoke-virtual {p1, v3}, Ld/s;->d(I)Ld/q;

    move-result-object v0

    instance-of v1, v0, Ld/x0;

    if-eqz v1, :cond_e

    check-cast v0, Ld/x0;

    aput-object v0, p3, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_e
    new-instance p1, La/h;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "unknown object encountered in constructed OCTET STRING: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_f
    new-instance p1, Ld/a0;

    invoke-static {p3}, Ld/a0;->m([Ld/x0;)[B

    move-result-object p2

    invoke-direct {p1, p2, p3}, Ld/a0;-><init>([B[Ld/x0;)V

    return-object p1

    :cond_10
    invoke-virtual {p0, v0}, Ld/g0;->J(Ld/c;)Ld/s;

    move-result-object p1

    iget p2, p1, Ld/s;->a:I

    new-array p3, p2, [Ld/g;

    :goto_3
    if-eq v3, p2, :cond_12

    invoke-virtual {p1, v3}, Ld/s;->d(I)Ld/q;

    move-result-object v0

    instance-of v1, v0, Ld/g;

    if-eqz v1, :cond_11

    check-cast v0, Ld/g;

    aput-object v0, p3, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_11
    new-instance p1, La/h;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "unknown object encountered in constructed BIT STRING: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_12
    new-instance p1, Ld/t;

    invoke-direct {p1, p3}, Ld/t;-><init>([Ld/g;)V

    return-object p1
.end method
