.class public final Led3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[B

.field public b:I

.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    sget-object v0, Llo/y;->f:[B

    iput-object v0, p0, Led3/a;->a:[B

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    new-array v0, p1, [B

    iput-object v0, p0, Led3/a;->a:[B

    .line 9
    iput p1, p0, Led3/a;->c:I

    return-void
.end method

.method public constructor <init>([BIB)V
    .locals 0

    packed-switch p2, :pswitch_data_0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Led3/a;->a:[B

    .line 12
    array-length p1, p1

    iput p1, p0, Led3/a;->c:I

    return-void

    .line 13
    :pswitch_0
    array-length p2, p1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Led3/a;->a:[B

    const/4 p1, 0x0

    .line 16
    iput p1, p0, Led3/a;->b:I

    .line 17
    iput p2, p0, Led3/a;->c:I

    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>([BIIZ)V
    .locals 0

    packed-switch p3, :pswitch_data_0

    const-string p3, "array"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Led3/a;->a:[B

    iput p2, p0, Led3/a;->b:I

    return-void

    .line 2
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Led3/a;->a:[B

    .line 4
    iput p2, p0, Led3/a;->c:I

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public static d(III)V
    .locals 12

    if-ne p1, p2, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Field "

    const-string v2, ": expected "

    invoke-static {p0, v1, v2}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string v1, "varint"

    const-string v2, "fixed64"

    const-string v3, "length-delimited"

    const-string v4, "fixed32"

    const-string v5, "unknown"

    const/4 v6, 0x5

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz p1, :cond_4

    if-eq p1, v8, :cond_3

    if-eq p1, v7, :cond_2

    if-eq p1, v6, :cond_1

    move-object v9, v5

    goto :goto_0

    :cond_1
    move-object v9, v4

    goto :goto_0

    :cond_2
    move-object v9, v3

    goto :goto_0

    :cond_3
    move-object v9, v2

    goto :goto_0

    :cond_4
    move-object v9, v1

    :goto_0
    const-string v10, ") but got "

    const-string v11, " (wire type "

    invoke-static {p1, v9, v11, v10, p0}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    if-eqz p2, :cond_8

    if-eq p2, v8, :cond_7

    if-eq p2, v7, :cond_6

    if-eq p2, v6, :cond_5

    move-object v1, v5

    goto :goto_1

    :cond_5
    move-object v1, v4

    goto :goto_1

    :cond_6
    move-object v1, v3

    goto :goto_1

    :cond_7
    move-object v1, v2

    :cond_8
    :goto_1
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public A()I
    .locals 5

    iget-object v0, p0, Led3/a;->a:[B

    iget v1, p0, Led3/a;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Led3/a;->b:I

    aget-byte v3, v0, v1

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x10

    add-int/lit8 v4, v1, 0x2

    iput v4, p0, Led3/a;->b:I

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x3

    iput v1, p0, Led3/a;->b:I

    aget-byte v0, v0, v4

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v2

    return v0
.end method

.method public B()I
    .locals 4

    invoke-virtual {p0}, Led3/a;->i()I

    move-result v0

    if-ltz v0, :cond_0

    return v0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const/16 v2, 0x1d

    const-string v3, "Top bit not zero: "

    invoke-static {v2, v0, v3}, Lr80/c;->j(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public C()J
    .locals 5

    invoke-virtual {p0}, Led3/a;->p()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_0

    return-wide v0

    :cond_0
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    const/16 v4, 0x26

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Top bit not zero: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public D()I
    .locals 4

    iget-object v0, p0, Led3/a;->a:[B

    iget v1, p0, Led3/a;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Led3/a;->b:I

    aget-byte v3, v0, v1

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x8

    add-int/lit8 v1, v1, 0x2

    iput v1, p0, Led3/a;->b:I

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v3

    return v0
.end method

.method public E()J
    .locals 11

    iget-object v0, p0, Led3/a;->a:[B

    iget v1, p0, Led3/a;->b:I

    aget-byte v0, v0, v1

    int-to-long v0, v0

    const/4 v2, 0x7

    move v3, v2

    :goto_0
    const/4 v4, 0x6

    const/4 v5, 0x1

    if-ltz v3, :cond_2

    shl-int v6, v5, v3

    int-to-long v7, v6

    and-long/2addr v7, v0

    const-wide/16 v9, 0x0

    cmp-long v7, v7, v9

    if-nez v7, :cond_1

    if-ge v3, v4, :cond_0

    sub-int/2addr v6, v5

    int-to-long v6, v6

    and-long/2addr v0, v6

    sub-int/2addr v2, v3

    goto :goto_1

    :cond_0
    if-ne v3, v2, :cond_2

    move v2, v5

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_5

    :goto_2
    if-ge v5, v2, :cond_4

    iget-object v3, p0, Led3/a;->a:[B

    iget v6, p0, Led3/a;->b:I

    add-int/2addr v6, v5

    aget-byte v3, v3, v6

    and-int/lit16 v6, v3, 0xc0

    const/16 v7, 0x80

    if-ne v6, v7, :cond_3

    shl-long/2addr v0, v4

    and-int/lit8 v3, v3, 0x3f

    int-to-long v6, v3

    or-long/2addr v0, v6

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_3
    new-instance v2, Ljava/lang/NumberFormatException;

    new-instance v3, Ljava/lang/StringBuilder;

    const/16 v4, 0x3e

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Invalid UTF-8 sequence continuation byte: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_4
    iget v3, p0, Led3/a;->b:I

    add-int/2addr v3, v2

    iput v3, p0, Led3/a;->b:I

    return-wide v0

    :cond_5
    new-instance v2, Ljava/lang/NumberFormatException;

    new-instance v3, Ljava/lang/StringBuilder;

    const/16 v4, 0x37

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Invalid UTF-8 sequence first byte: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public F()J
    .locals 6

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x40

    if-ge v2, v3, :cond_2

    iget v3, p0, Led3/a;->b:I

    iget v4, p0, Led3/a;->c:I

    if-ge v3, v4, :cond_1

    iget-object v4, p0, Led3/a;->a:[B

    add-int/lit8 v5, v3, 0x1

    iput v5, p0, Led3/a;->b:I

    aget-byte v3, v4, v3

    and-int/lit8 v4, v3, 0x7f

    int-to-long v4, v4

    shl-long/2addr v4, v2

    or-long/2addr v0, v4

    and-int/lit16 v3, v3, 0x80

    if-nez v3, :cond_0

    return-wide v0

    :cond_0
    add-int/lit8 v2, v2, 0x7

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/io/EOFException;

    const-string v1, "Truncated varint"

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Malformed varint"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public G(Z)J
    .locals 8

    iget v0, p0, Led3/a;->c:I

    iget v1, p0, Led3/a;->b:I

    if-ne v0, v1, :cond_1

    if-eqz p1, :cond_0

    const-wide/16 v0, -0x1

    return-wide v0

    :cond_0
    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string v0, "Unexpected EOF"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object p1, p0, Led3/a;->a:[B

    add-int/lit8 v2, v0, 0x1

    aget-byte v3, p1, v0

    int-to-long v3, v3

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-ltz v7, :cond_2

    iput v2, p0, Led3/a;->c:I

    return-wide v3

    :cond_2
    sub-int/2addr v1, v0

    const/4 v7, 0x1

    if-le v1, v7, :cond_3

    add-int/lit8 v0, v0, 0x2

    aget-byte p1, p1, v2

    int-to-long v1, p1

    const/4 p1, 0x7

    shl-long/2addr v1, p1

    xor-long/2addr v1, v3

    cmp-long p1, v1, v5

    if-gez p1, :cond_3

    iput v0, p0, Led3/a;->c:I

    const-wide/16 v3, -0x80

    xor-long v0, v1, v3

    return-wide v0

    :cond_3
    const/4 p1, 0x0

    :goto_0
    const/16 v0, 0x40

    if-ge p1, v0, :cond_5

    invoke-virtual {p0}, Led3/a;->e()I

    move-result v0

    and-int/lit8 v1, v0, 0x7f

    int-to-long v1, v1

    shl-long/2addr v1, p1

    or-long/2addr v5, v1

    and-int/lit16 v0, v0, 0x80

    if-nez v0, :cond_4

    return-wide v5

    :cond_4
    add-int/lit8 p1, p1, 0x7

    goto :goto_0

    :cond_5
    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string v0, "Input stream is malformed: Varint too long (exceeded 64 bits)"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public H(I)V
    .locals 2

    iget-object v0, p0, Led3/a;->a:[B

    array-length v1, v0

    if-ge v1, p1, :cond_0

    new-array v0, p1, [B

    :cond_0
    invoke-virtual {p0, p1, v0}, Led3/a;->I(I[B)V

    return-void
.end method

.method public I(I[B)V
    .locals 0

    iput-object p2, p0, Led3/a;->a:[B

    iput p1, p0, Led3/a;->c:I

    const/4 p1, 0x0

    iput p1, p0, Led3/a;->b:I

    return-void
.end method

.method public J(I)V
    .locals 1

    if-ltz p1, :cond_0

    iget-object v0, p0, Led3/a;->a:[B

    array-length v0, v0

    if-gt p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Llo/a;->e(Z)V

    iput p1, p0, Led3/a;->c:I

    return-void
.end method

.method public K(I)V
    .locals 1

    if-ltz p1, :cond_0

    iget v0, p0, Led3/a;->c:I

    if-gt p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Llo/a;->e(Z)V

    iput p1, p0, Led3/a;->b:I

    return-void
.end method

.method public L(I)V
    .locals 1

    iget v0, p0, Led3/a;->b:I

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, Led3/a;->K(I)V

    return-void
.end method

.method public M(I)V
    .locals 3

    iget v0, p0, Led3/a;->c:I

    if-eqz p1, :cond_6

    const/4 v1, 0x1

    if-eq p1, v1, :cond_4

    const/4 v1, 0x2

    if-eq p1, v1, :cond_2

    const/4 v1, 0x5

    if-ne p1, v1, :cond_1

    iget p1, p0, Led3/a;->b:I

    sub-int/2addr v0, p1

    const/4 v1, 0x4

    if-lt v0, v1, :cond_0

    add-int/2addr p1, v1

    iput p1, p0, Led3/a;->b:I

    return-void

    :cond_0
    new-instance p1, Ljava/io/EOFException;

    const-string v0, "Not enough bytes to skip fixed32"

    invoke-direct {p1, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unknown wire type: "

    invoke-static {p1, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-virtual {p0}, Led3/a;->F()J

    move-result-wide v1

    long-to-int p1, v1

    iget v1, p0, Led3/a;->b:I

    sub-int/2addr v0, v1

    if-lt v0, p1, :cond_3

    add-int/2addr v1, p1

    iput v1, p0, Led3/a;->b:I

    return-void

    :cond_3
    new-instance p1, Ljava/io/EOFException;

    const-string v0, "Not enough bytes to skip length-delimited"

    invoke-direct {p1, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    iget p1, p0, Led3/a;->b:I

    sub-int/2addr v0, p1

    const/16 v1, 0x8

    if-lt v0, v1, :cond_5

    add-int/2addr p1, v1

    iput p1, p0, Led3/a;->b:I

    return-void

    :cond_5
    new-instance p1, Ljava/io/EOFException;

    const-string v0, "Not enough bytes to skip fixed64"

    invoke-direct {p1, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-virtual {p0}, Led3/a;->F()J

    return-void
.end method

.method public a()I
    .locals 2

    iget v0, p0, Led3/a;->c:I

    iget v1, p0, Led3/a;->b:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public b(I)V
    .locals 2

    iget-object v0, p0, Led3/a;->a:[B

    array-length v1, v0

    if-le p1, v1, :cond_0

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Led3/a;->a:[B

    :cond_0
    return-void
.end method

.method public c(I)V
    .locals 4

    iget v0, p0, Led3/a;->b:I

    iget v1, p0, Led3/a;->c:I

    sub-int v1, v0, v1

    if-gt p1, v1, :cond_0

    return-void

    :cond_0
    new-instance v1, Lkotlinx/serialization/SerializationException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unexpected EOF, available "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, p0, Led3/a;->c:I

    sub-int/2addr v0, v3

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " bytes, requested: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public e()I
    .locals 3

    iget v0, p0, Led3/a;->c:I

    iget v1, p0, Led3/a;->b:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Led3/a;->a:[B

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Led3/a;->c:I

    aget-byte v0, v1, v0

    and-int/lit16 v0, v0, 0xff

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public f()Z
    .locals 4

    invoke-virtual {p0}, Led3/a;->F()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public g([BII)V
    .locals 2

    iget-object v0, p0, Led3/a;->a:[B

    iget v1, p0, Led3/a;->b:I

    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Led3/a;->b:I

    add-int/2addr p1, p3

    iput p1, p0, Led3/a;->b:I

    return-void
.end method

.method public h()[B
    .locals 5

    invoke-virtual {p0}, Led3/a;->F()J

    move-result-wide v0

    long-to-int v0, v0

    if-ltz v0, :cond_1

    iget v1, p0, Led3/a;->c:I

    iget v2, p0, Led3/a;->b:I

    sub-int/2addr v1, v2

    if-lt v1, v0, :cond_0

    new-array v1, v0, [B

    iget-object v3, p0, Led3/a;->a:[B

    const/4 v4, 0x0

    invoke-static {v3, v2, v1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v2, p0, Led3/a;->b:I

    add-int/2addr v2, v0

    iput v2, p0, Led3/a;->b:I

    return-object v1

    :cond_0
    new-instance v0, Ljava/io/EOFException;

    const-string v1, "Not enough bytes for length-delimited field"

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Negative length: "

    invoke-static {v0, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public i()I
    .locals 5

    iget-object v0, p0, Led3/a;->a:[B

    iget v1, p0, Led3/a;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Led3/a;->b:I

    aget-byte v3, v0, v1

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x18

    add-int/lit8 v4, v1, 0x2

    iput v4, p0, Led3/a;->b:I

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v2, v3

    add-int/lit8 v3, v1, 0x3

    iput v3, p0, Led3/a;->b:I

    aget-byte v4, v0, v4

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x8

    or-int/2addr v2, v4

    add-int/lit8 v1, v1, 0x4

    iput v1, p0, Led3/a;->b:I

    aget-byte v0, v0, v3

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v2

    return v0
.end method

.method public j()Ljava/lang/String;
    .locals 8

    invoke-virtual {p0}, Led3/a;->a()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget v0, p0, Led3/a;->b:I

    :goto_0
    iget v1, p0, Led3/a;->c:I

    const/16 v2, 0xd

    const/16 v3, 0xa

    if-ge v0, v1, :cond_2

    iget-object v1, p0, Led3/a;->a:[B

    aget-byte v1, v1, v0

    sget v4, Llo/y;->a:I

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    iget v1, p0, Led3/a;->b:I

    sub-int v4, v0, v1

    const/4 v5, 0x3

    if-lt v4, v5, :cond_3

    iget-object v4, p0, Led3/a;->a:[B

    aget-byte v6, v4, v1

    const/16 v7, -0x11

    if-ne v6, v7, :cond_3

    add-int/lit8 v6, v1, 0x1

    aget-byte v6, v4, v6

    const/16 v7, -0x45

    if-ne v6, v7, :cond_3

    add-int/lit8 v6, v1, 0x2

    aget-byte v4, v4, v6

    const/16 v6, -0x41

    if-ne v4, v6, :cond_3

    add-int/2addr v1, v5

    iput v1, p0, Led3/a;->b:I

    :cond_3
    iget-object v1, p0, Led3/a;->a:[B

    iget v4, p0, Led3/a;->b:I

    sub-int v5, v0, v4

    sget v6, Llo/y;->a:I

    new-instance v6, Ljava/lang/String;

    sget-object v7, Lyr/d;->c:Ljava/nio/charset/Charset;

    invoke-direct {v6, v1, v4, v5, v7}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    iput v0, p0, Led3/a;->b:I

    iget v1, p0, Led3/a;->c:I

    if-ne v0, v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v4, p0, Led3/a;->a:[B

    aget-byte v5, v4, v0

    if-ne v5, v2, :cond_5

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Led3/a;->b:I

    if-ne v0, v1, :cond_5

    goto :goto_2

    :cond_5
    iget v0, p0, Led3/a;->b:I

    aget-byte v1, v4, v0

    if-ne v1, v3, :cond_6

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Led3/a;->b:I

    :cond_6
    :goto_2
    return-object v6
.end method

.method public k()I
    .locals 5

    iget-object v0, p0, Led3/a;->a:[B

    iget v1, p0, Led3/a;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Led3/a;->b:I

    aget-byte v3, v0, v1

    and-int/lit16 v3, v3, 0xff

    add-int/lit8 v4, v1, 0x2

    iput v4, p0, Led3/a;->b:I

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v2, v3

    add-int/lit8 v3, v1, 0x3

    iput v3, p0, Led3/a;->b:I

    aget-byte v4, v0, v4

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x10

    or-int/2addr v2, v4

    add-int/lit8 v1, v1, 0x4

    iput v1, p0, Led3/a;->b:I

    aget-byte v0, v0, v3

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    or-int/2addr v0, v2

    return v0
.end method

.method public l()J
    .locals 11

    iget-object v0, p0, Led3/a;->a:[B

    iget v1, p0, Led3/a;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Led3/a;->b:I

    aget-byte v3, v0, v1

    int-to-long v3, v3

    const-wide/16 v5, 0xff

    and-long/2addr v3, v5

    add-int/lit8 v7, v1, 0x2

    iput v7, p0, Led3/a;->b:I

    aget-byte v2, v0, v2

    int-to-long v8, v2

    and-long/2addr v8, v5

    const/16 v2, 0x8

    shl-long/2addr v8, v2

    or-long/2addr v3, v8

    add-int/lit8 v8, v1, 0x3

    iput v8, p0, Led3/a;->b:I

    aget-byte v7, v0, v7

    int-to-long v9, v7

    and-long/2addr v9, v5

    const/16 v7, 0x10

    shl-long/2addr v9, v7

    or-long/2addr v3, v9

    add-int/lit8 v7, v1, 0x4

    iput v7, p0, Led3/a;->b:I

    aget-byte v8, v0, v8

    int-to-long v8, v8

    and-long/2addr v8, v5

    const/16 v10, 0x18

    shl-long/2addr v8, v10

    or-long/2addr v3, v8

    add-int/lit8 v8, v1, 0x5

    iput v8, p0, Led3/a;->b:I

    aget-byte v7, v0, v7

    int-to-long v9, v7

    and-long/2addr v9, v5

    const/16 v7, 0x20

    shl-long/2addr v9, v7

    or-long/2addr v3, v9

    add-int/lit8 v7, v1, 0x6

    iput v7, p0, Led3/a;->b:I

    aget-byte v8, v0, v8

    int-to-long v8, v8

    and-long/2addr v8, v5

    const/16 v10, 0x28

    shl-long/2addr v8, v10

    or-long/2addr v3, v8

    add-int/lit8 v8, v1, 0x7

    iput v8, p0, Led3/a;->b:I

    aget-byte v7, v0, v7

    int-to-long v9, v7

    and-long/2addr v9, v5

    const/16 v7, 0x30

    shl-long/2addr v9, v7

    or-long/2addr v3, v9

    add-int/2addr v1, v2

    iput v1, p0, Led3/a;->b:I

    aget-byte v0, v0, v8

    int-to-long v0, v0

    and-long/2addr v0, v5

    const/16 v2, 0x38

    shl-long/2addr v0, v2

    or-long/2addr v0, v3

    return-wide v0
.end method

.method public m()J
    .locals 10

    iget-object v0, p0, Led3/a;->a:[B

    iget v1, p0, Led3/a;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Led3/a;->b:I

    aget-byte v3, v0, v1

    int-to-long v3, v3

    const-wide/16 v5, 0xff

    and-long/2addr v3, v5

    add-int/lit8 v7, v1, 0x2

    iput v7, p0, Led3/a;->b:I

    aget-byte v2, v0, v2

    int-to-long v8, v2

    and-long/2addr v8, v5

    const/16 v2, 0x8

    shl-long/2addr v8, v2

    or-long v2, v3, v8

    add-int/lit8 v4, v1, 0x3

    iput v4, p0, Led3/a;->b:I

    aget-byte v7, v0, v7

    int-to-long v7, v7

    and-long/2addr v7, v5

    const/16 v9, 0x10

    shl-long/2addr v7, v9

    or-long/2addr v2, v7

    add-int/lit8 v1, v1, 0x4

    iput v1, p0, Led3/a;->b:I

    aget-byte v0, v0, v4

    int-to-long v0, v0

    and-long/2addr v0, v5

    const/16 v4, 0x18

    shl-long/2addr v0, v4

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public n()I
    .locals 4

    invoke-virtual {p0}, Led3/a;->k()I

    move-result v0

    if-ltz v0, :cond_0

    return v0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const/16 v2, 0x1d

    const-string v3, "Top bit not zero: "

    invoke-static {v2, v0, v3}, Lr80/c;->j(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public o()I
    .locals 4

    iget-object v0, p0, Led3/a;->a:[B

    iget v1, p0, Led3/a;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Led3/a;->b:I

    aget-byte v3, v0, v1

    and-int/lit16 v3, v3, 0xff

    add-int/lit8 v1, v1, 0x2

    iput v1, p0, Led3/a;->b:I

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    or-int/2addr v0, v3

    return v0
.end method

.method public p()J
    .locals 10

    iget-object v0, p0, Led3/a;->a:[B

    iget v1, p0, Led3/a;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Led3/a;->b:I

    aget-byte v3, v0, v1

    int-to-long v3, v3

    const-wide/16 v5, 0xff

    and-long/2addr v3, v5

    const/16 v7, 0x38

    shl-long/2addr v3, v7

    add-int/lit8 v7, v1, 0x2

    iput v7, p0, Led3/a;->b:I

    aget-byte v2, v0, v2

    int-to-long v8, v2

    and-long/2addr v8, v5

    const/16 v2, 0x30

    shl-long/2addr v8, v2

    or-long v2, v3, v8

    add-int/lit8 v4, v1, 0x3

    iput v4, p0, Led3/a;->b:I

    aget-byte v7, v0, v7

    int-to-long v7, v7

    and-long/2addr v7, v5

    const/16 v9, 0x28

    shl-long/2addr v7, v9

    or-long/2addr v2, v7

    add-int/lit8 v7, v1, 0x4

    iput v7, p0, Led3/a;->b:I

    aget-byte v4, v0, v4

    int-to-long v8, v4

    and-long/2addr v8, v5

    const/16 v4, 0x20

    shl-long/2addr v8, v4

    or-long/2addr v2, v8

    add-int/lit8 v4, v1, 0x5

    iput v4, p0, Led3/a;->b:I

    aget-byte v7, v0, v7

    int-to-long v7, v7

    and-long/2addr v7, v5

    const/16 v9, 0x18

    shl-long/2addr v7, v9

    or-long/2addr v2, v7

    add-int/lit8 v7, v1, 0x6

    iput v7, p0, Led3/a;->b:I

    aget-byte v4, v0, v4

    int-to-long v8, v4

    and-long/2addr v8, v5

    const/16 v4, 0x10

    shl-long/2addr v8, v4

    or-long/2addr v2, v8

    add-int/lit8 v4, v1, 0x7

    iput v4, p0, Led3/a;->b:I

    aget-byte v7, v0, v7

    int-to-long v7, v7

    and-long/2addr v7, v5

    const/16 v9, 0x8

    shl-long/2addr v7, v9

    or-long/2addr v2, v7

    add-int/2addr v1, v9

    iput v1, p0, Led3/a;->b:I

    aget-byte v0, v0, v4

    int-to-long v0, v0

    and-long/2addr v0, v5

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public q()Led3/a;
    .locals 4

    invoke-virtual {p0}, Led3/a;->h()[B

    move-result-object v0

    new-instance v1, Led3/a;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v1, v0, v2, v3}, Led3/a;-><init>([BIB)V

    return-object v1
.end method

.method public r()Ljava/lang/String;
    .locals 6

    invoke-virtual {p0}, Led3/a;->a()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget v0, p0, Led3/a;->b:I

    :goto_0
    iget v1, p0, Led3/a;->c:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Led3/a;->a:[B

    aget-byte v1, v1, v0

    if-eqz v1, :cond_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Led3/a;->a:[B

    iget v2, p0, Led3/a;->b:I

    sub-int v3, v0, v2

    sget v4, Llo/y;->a:I

    new-instance v4, Ljava/lang/String;

    sget-object v5, Lyr/d;->c:Ljava/nio/charset/Charset;

    invoke-direct {v4, v1, v2, v3, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    iput v0, p0, Led3/a;->b:I

    iget v1, p0, Led3/a;->c:I

    if-ge v0, v1, :cond_2

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Led3/a;->b:I

    :cond_2
    return-object v4
.end method

.method public s(I)Ljava/lang/String;
    .locals 5

    if-nez p1, :cond_0

    const-string p1, ""

    return-object p1

    :cond_0
    iget v0, p0, Led3/a;->b:I

    add-int v1, v0, p1

    add-int/lit8 v1, v1, -0x1

    iget v2, p0, Led3/a;->c:I

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Led3/a;->a:[B

    aget-byte v1, v2, v1

    if-nez v1, :cond_1

    add-int/lit8 v1, p1, -0x1

    goto :goto_0

    :cond_1
    move v1, p1

    :goto_0
    iget-object v2, p0, Led3/a;->a:[B

    sget v3, Llo/y;->a:I

    new-instance v3, Ljava/lang/String;

    sget-object v4, Lyr/d;->c:Ljava/nio/charset/Charset;

    invoke-direct {v3, v2, v0, v1, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    iget v0, p0, Led3/a;->b:I

    add-int/2addr v0, p1

    iput v0, p0, Led3/a;->b:I

    return-object v3
.end method

.method public t()S
    .locals 4

    iget-object v0, p0, Led3/a;->a:[B

    iget v1, p0, Led3/a;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Led3/a;->b:I

    aget-byte v3, v0, v1

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x8

    add-int/lit8 v1, v1, 0x2

    iput v1, p0, Led3/a;->b:I

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v3

    int-to-short v0, v0

    return v0
.end method

.method public u()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0}, Led3/a;->h()[B

    move-result-object v1

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0
.end method

.method public v(ILjava/nio/charset/Charset;)Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Led3/a;->a:[B

    iget v2, p0, Led3/a;->b:I

    invoke-direct {v0, v1, v2, p1, p2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    iget p2, p0, Led3/a;->b:I

    add-int/2addr p2, p1

    iput p2, p0, Led3/a;->b:I

    return-object v0
.end method

.method public w()I
    .locals 4

    invoke-virtual {p0}, Led3/a;->y()I

    move-result v0

    invoke-virtual {p0}, Led3/a;->y()I

    move-result v1

    invoke-virtual {p0}, Led3/a;->y()I

    move-result v2

    invoke-virtual {p0}, Led3/a;->y()I

    move-result v3

    shl-int/lit8 v0, v0, 0x15

    shl-int/lit8 v1, v1, 0xe

    or-int/2addr v0, v1

    shl-int/lit8 v1, v2, 0x7

    or-int/2addr v0, v1

    or-int/2addr v0, v3

    return v0
.end method

.method public x()I
    .locals 2

    iget v0, p0, Led3/a;->b:I

    iget v1, p0, Led3/a;->c:I

    if-ge v0, v1, :cond_0

    invoke-virtual {p0}, Led3/a;->F()J

    move-result-wide v0

    long-to-int v0, v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public y()I
    .locals 3

    iget-object v0, p0, Led3/a;->a:[B

    iget v1, p0, Led3/a;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Led3/a;->b:I

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public z()J
    .locals 10

    iget-object v0, p0, Led3/a;->a:[B

    iget v1, p0, Led3/a;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Led3/a;->b:I

    aget-byte v3, v0, v1

    int-to-long v3, v3

    const-wide/16 v5, 0xff

    and-long/2addr v3, v5

    const/16 v7, 0x18

    shl-long/2addr v3, v7

    add-int/lit8 v7, v1, 0x2

    iput v7, p0, Led3/a;->b:I

    aget-byte v2, v0, v2

    int-to-long v8, v2

    and-long/2addr v8, v5

    const/16 v2, 0x10

    shl-long/2addr v8, v2

    or-long v2, v3, v8

    add-int/lit8 v4, v1, 0x3

    iput v4, p0, Led3/a;->b:I

    aget-byte v7, v0, v7

    int-to-long v7, v7

    and-long/2addr v7, v5

    const/16 v9, 0x8

    shl-long/2addr v7, v9

    or-long/2addr v2, v7

    add-int/lit8 v1, v1, 0x4

    iput v1, p0, Led3/a;->b:I

    aget-byte v0, v0, v4

    int-to-long v0, v0

    and-long/2addr v0, v5

    or-long/2addr v0, v2

    return-wide v0
.end method
