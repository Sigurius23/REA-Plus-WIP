.class public final Lat/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[B

.field public final b:[B


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x40

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    iput-object v0, p0, Lat/m;->a:[B

    const/16 v0, 0x80

    new-array v0, v0, [B

    iput-object v0, p0, Lat/m;->b:[B

    const/4 v1, 0x0

    move v2, v1

    .line 1
    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_0

    const/4 v3, -0x1

    aput-byte v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    iget-object v2, p0, Lat/m;->a:[B

    array-length v3, v2

    if-ge v1, v3, :cond_1

    aget-byte v2, v2, v1

    int-to-byte v3, v1

    aput-byte v3, v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    return-void

    nop

    :array_0
    .array-data 1
        0x41t
        0x42t
        0x43t
        0x44t
        0x45t
        0x46t
        0x47t
        0x48t
        0x49t
        0x4at
        0x4bt
        0x4ct
        0x4dt
        0x4et
        0x4ft
        0x50t
        0x51t
        0x52t
        0x53t
        0x54t
        0x55t
        0x56t
        0x57t
        0x58t
        0x59t
        0x5at
        0x61t
        0x62t
        0x63t
        0x64t
        0x65t
        0x66t
        0x67t
        0x68t
        0x69t
        0x6at
        0x6bt
        0x6ct
        0x6dt
        0x6et
        0x6ft
        0x70t
        0x71t
        0x72t
        0x73t
        0x74t
        0x75t
        0x76t
        0x77t
        0x78t
        0x79t
        0x7at
        0x30t
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x2bt
        0x2ft
    .end array-data
.end method

.method public constructor <init>([B[B)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lat/m;->a:[B

    .line 4
    iput-object p2, p0, Lat/m;->b:[B

    return-void
.end method

.method public static a(IILjava/lang/String;)I
    .locals 2

    :goto_0
    if-ge p0, p1, :cond_1

    invoke-virtual {p2, p0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0xa

    if-eq v0, v1, :cond_0

    const/16 v1, 0xd

    if-eq v0, v1, :cond_0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_1

    :cond_0
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_1
    return p0
.end method

.method public static f()Lat/m;
    .locals 3

    const/16 v0, 0x20

    invoke-static {v0}, Lse/b;->W(I)[B

    move-result-object v1

    array-length v2, v1

    if-ne v2, v0, :cond_0

    invoke-static {v1}, Lcom/google/crypto/tink/internal/a;->h([B)[B

    move-result-object v0

    invoke-static {v0}, Lcom/google/crypto/tink/internal/a;->p([B)[B

    move-result-object v0

    new-instance v2, Lat/m;

    invoke-direct {v2, v0, v1}, Lat/m;-><init>([B[B)V

    return-object v2

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Given secret seed length is not 32"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public b(Ljava/io/ByteArrayOutputStream;Ljava/lang/String;)V
    .locals 17

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const/16 v2, 0x36

    new-array v3, v2, [B

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    :goto_0
    const/16 v5, 0x20

    const/16 v6, 0x9

    const/16 v7, 0xd

    const/16 v8, 0xa

    if-lez v4, :cond_1

    add-int/lit8 v9, v4, -0x1

    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-eq v9, v8, :cond_0

    if-eq v9, v7, :cond_0

    if-eq v9, v6, :cond_0

    if-ne v9, v5, :cond_1

    :cond_0
    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    :cond_1
    if-nez v4, :cond_2

    return-void

    :cond_2
    const/4 v9, 0x0

    move v10, v4

    move v11, v9

    :goto_1
    const/4 v12, 0x4

    if-lez v10, :cond_5

    if-eq v11, v12, :cond_5

    add-int/lit8 v12, v10, -0x1

    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-eq v12, v8, :cond_4

    if-eq v12, v7, :cond_4

    if-eq v12, v6, :cond_4

    if-ne v12, v5, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v11, v11, 0x1

    :cond_4
    :goto_2
    add-int/lit8 v10, v10, -0x1

    goto :goto_1

    :cond_5
    invoke-static {v9, v10, v1}, Lat/m;->a(IILjava/lang/String;)I

    move-result v5

    move-object/from16 v6, p0

    move v7, v9

    :goto_3
    iget-object v8, v6, Lat/m;->b:[B

    if-ge v5, v10, :cond_8

    add-int/lit8 v11, v5, 0x1

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    aget-byte v5, v8, v5

    invoke-static {v11, v10, v1}, Lat/m;->a(IILjava/lang/String;)I

    move-result v11

    add-int/lit8 v13, v11, 0x1

    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    aget-byte v11, v8, v11

    invoke-static {v13, v10, v1}, Lat/m;->a(IILjava/lang/String;)I

    move-result v13

    add-int/lit8 v14, v13, 0x1

    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    aget-byte v13, v8, v13

    invoke-static {v14, v10, v1}, Lat/m;->a(IILjava/lang/String;)I

    move-result v14

    add-int/lit8 v15, v14, 0x1

    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    aget-byte v8, v8, v14

    or-int v14, v5, v11

    or-int/2addr v14, v13

    or-int/2addr v14, v8

    if-ltz v14, :cond_7

    add-int/lit8 v14, v7, 0x1

    shl-int/lit8 v5, v5, 0x2

    shr-int/lit8 v16, v11, 0x4

    or-int v5, v5, v16

    int-to-byte v5, v5

    aput-byte v5, v3, v7

    add-int/lit8 v5, v7, 0x2

    shl-int/lit8 v11, v11, 0x4

    shr-int/lit8 v16, v13, 0x2

    or-int v11, v11, v16

    int-to-byte v11, v11

    aput-byte v11, v3, v14

    add-int/lit8 v7, v7, 0x3

    shl-int/lit8 v11, v13, 0x6

    or-int/2addr v8, v11

    int-to-byte v8, v8

    aput-byte v8, v3, v5

    if-ne v7, v2, :cond_6

    invoke-virtual {v0, v3}, Ljava/io/OutputStream;->write([B)V

    move v7, v9

    :cond_6
    invoke-static {v15, v10, v1}, Lat/m;->a(IILjava/lang/String;)I

    move-result v5

    goto :goto_3

    :cond_7
    new-instance v0, Ljava/io/IOException;

    const-string v1, "invalid characters encountered in base64 data"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    if-lez v7, :cond_9

    invoke-virtual {v0, v3, v9, v7}, Ljava/io/OutputStream;->write([BII)V

    :cond_9
    invoke-static {v5, v4, v1}, Lat/m;->a(IILjava/lang/String;)I

    move-result v2

    add-int/lit8 v3, v2, 0x1

    invoke-static {v3, v4, v1}, Lat/m;->a(IILjava/lang/String;)I

    move-result v3

    add-int/lit8 v5, v3, 0x1

    invoke-static {v5, v4, v1}, Lat/m;->a(IILjava/lang/String;)I

    move-result v5

    add-int/lit8 v7, v5, 0x1

    invoke-static {v7, v4, v1}, Lat/m;->a(IILjava/lang/String;)I

    move-result v4

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v4, 0x3d

    const-string v7, "invalid characters encountered at end of base64 data"

    if-ne v5, v4, :cond_c

    if-ne v1, v4, :cond_b

    aget-byte v1, v8, v2

    aget-byte v2, v8, v3

    or-int v3, v1, v2

    if-ltz v3, :cond_a

    shl-int/lit8 v1, v1, 0x2

    shr-int/2addr v2, v12

    :goto_4
    or-int/2addr v1, v2

    :goto_5
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    goto :goto_6

    :cond_a
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    if-ne v1, v4, :cond_e

    aget-byte v1, v8, v2

    aget-byte v2, v8, v3

    aget-byte v3, v8, v5

    or-int v4, v1, v2

    or-int/2addr v4, v3

    if-ltz v4, :cond_d

    shl-int/lit8 v1, v1, 0x2

    shr-int/lit8 v4, v2, 0x4

    or-int/2addr v1, v4

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    shl-int/lit8 v1, v2, 0x4

    shr-int/lit8 v2, v3, 0x2

    goto :goto_4

    :cond_d
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    aget-byte v2, v8, v2

    aget-byte v3, v8, v3

    aget-byte v4, v8, v5

    aget-byte v1, v8, v1

    or-int v5, v2, v3

    or-int/2addr v5, v4

    or-int/2addr v5, v1

    if-ltz v5, :cond_f

    shl-int/lit8 v2, v2, 0x2

    shr-int/lit8 v5, v3, 0x4

    or-int/2addr v2, v5

    invoke-virtual {v0, v2}, Ljava/io/OutputStream;->write(I)V

    shl-int/lit8 v2, v3, 0x4

    shr-int/lit8 v3, v4, 0x2

    or-int/2addr v2, v3

    invoke-virtual {v0, v2}, Ljava/io/OutputStream;->write(I)V

    shl-int/lit8 v2, v4, 0x6

    or-int/2addr v1, v2

    goto :goto_5

    :goto_6
    return-void

    :cond_f
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c([BILjava/io/ByteArrayOutputStream;)V
    .locals 19

    if-gez p2, :cond_0

    return-void

    :cond_0
    const/16 v0, 0x48

    new-array v0, v0, [B

    const/4 v1, 0x0

    move/from16 v2, p2

    move v3, v1

    :goto_0
    if-lez v2, :cond_4

    const/16 v4, 0x36

    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    move-result v4

    add-int v5, v3, v4

    add-int/lit8 v6, v5, -0x2

    move-object/from16 v7, p0

    move v9, v1

    move v8, v3

    :goto_1
    iget-object v10, v7, Lat/m;->a:[B

    const/4 v11, 0x2

    if-ge v8, v6, :cond_1

    add-int/lit8 v12, v8, 0x1

    aget-byte v13, p1, v8

    add-int/lit8 v14, v8, 0x2

    aget-byte v12, p1, v12

    and-int/lit16 v12, v12, 0xff

    add-int/lit8 v8, v8, 0x3

    aget-byte v14, p1, v14

    and-int/lit16 v15, v14, 0xff

    add-int/lit8 v16, v9, 0x1

    ushr-int/lit8 v17, v13, 0x2

    and-int/lit8 v17, v17, 0x3f

    aget-byte v17, v10, v17

    aput-byte v17, v0, v9

    add-int/lit8 v17, v9, 0x2

    shl-int/lit8 v13, v13, 0x4

    ushr-int/lit8 v18, v12, 0x4

    or-int v13, v13, v18

    and-int/lit8 v13, v13, 0x3f

    aget-byte v13, v10, v13

    aput-byte v13, v0, v16

    add-int/lit8 v13, v9, 0x3

    shl-int/lit8 v11, v12, 0x2

    ushr-int/lit8 v12, v15, 0x6

    or-int/2addr v11, v12

    and-int/lit8 v11, v11, 0x3f

    aget-byte v11, v10, v11

    aput-byte v11, v0, v17

    add-int/lit8 v9, v9, 0x4

    and-int/lit8 v11, v14, 0x3f

    aget-byte v10, v10, v11

    aput-byte v10, v0, v13

    goto :goto_1

    :cond_1
    sub-int v3, v8, v3

    sub-int v3, v4, v3

    const/16 v6, 0x3d

    const/4 v12, 0x1

    if-eq v3, v12, :cond_3

    if-eq v3, v11, :cond_2

    :goto_2
    move-object/from16 v3, p3

    goto :goto_3

    :cond_2
    add-int/lit8 v3, v8, 0x1

    aget-byte v8, p1, v8

    and-int/lit16 v8, v8, 0xff

    aget-byte v3, p1, v3

    and-int/lit16 v3, v3, 0xff

    add-int/lit8 v12, v9, 0x1

    ushr-int/lit8 v13, v8, 0x2

    and-int/lit8 v13, v13, 0x3f

    aget-byte v13, v10, v13

    aput-byte v13, v0, v9

    add-int/lit8 v13, v9, 0x2

    shl-int/lit8 v8, v8, 0x4

    ushr-int/lit8 v14, v3, 0x4

    or-int/2addr v8, v14

    and-int/lit8 v8, v8, 0x3f

    aget-byte v8, v10, v8

    aput-byte v8, v0, v12

    add-int/lit8 v8, v9, 0x3

    shl-int/2addr v3, v11

    and-int/lit8 v3, v3, 0x3f

    aget-byte v3, v10, v3

    aput-byte v3, v0, v13

    add-int/lit8 v9, v9, 0x4

    aput-byte v6, v0, v8

    goto :goto_2

    :cond_3
    aget-byte v3, p1, v8

    and-int/lit16 v3, v3, 0xff

    add-int/lit8 v8, v9, 0x1

    ushr-int/lit8 v11, v3, 0x2

    and-int/lit8 v11, v11, 0x3f

    aget-byte v11, v10, v11

    aput-byte v11, v0, v9

    add-int/lit8 v11, v9, 0x2

    shl-int/lit8 v3, v3, 0x4

    and-int/lit8 v3, v3, 0x3f

    aget-byte v3, v10, v3

    aput-byte v3, v0, v8

    add-int/lit8 v3, v9, 0x3

    aput-byte v6, v0, v11

    add-int/lit8 v9, v9, 0x4

    aput-byte v6, v0, v3

    goto :goto_2

    :goto_3
    invoke-virtual {v3, v0, v1, v9}, Ljava/io/OutputStream;->write([BII)V

    sub-int/2addr v2, v4

    move v3, v5

    goto/16 :goto_0

    :cond_4
    move-object/from16 v7, p0

    return-void
.end method

.method public d()[B
    .locals 2

    iget-object v0, p0, Lat/m;->b:[B

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    return-object v0
.end method

.method public e()[B
    .locals 2

    iget-object v0, p0, Lat/m;->a:[B

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    return-object v0
.end method
