.class public final Lxw/b;
.super Lxw/a;
.source "SourceFile"


# direct methods
.method public static c([B)Lxw/b;
    .locals 13

    new-instance v0, Lxw/b;

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    array-length v2, p0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-nez v2, :cond_1

    const-string p0, ""

    goto/16 :goto_4

    :cond_1
    div-int/lit8 v3, v2, 0x3

    mul-int/lit8 v4, v3, 0x3

    const/4 v5, 0x2

    if-nez v2, :cond_2

    move v3, v1

    goto :goto_1

    :cond_2
    shl-int/2addr v3, v5

    rem-int/lit8 v6, v2, 0x3

    if-nez v6, :cond_3

    goto :goto_1

    :cond_3
    add-int/2addr v3, v6

    add-int/lit8 v3, v3, 0x1

    :goto_1
    new-array v6, v3, [B

    move v7, v1

    move v8, v7

    :goto_2
    if-ge v7, v4, :cond_4

    add-int/lit8 v9, v7, 0x1

    aget-byte v10, p0, v7

    and-int/lit16 v10, v10, 0xff

    shl-int/lit8 v10, v10, 0x10

    add-int/lit8 v11, v7, 0x2

    aget-byte v9, p0, v9

    and-int/lit16 v9, v9, 0xff

    shl-int/lit8 v9, v9, 0x8

    or-int/2addr v9, v10

    add-int/lit8 v7, v7, 0x3

    aget-byte v10, p0, v11

    and-int/lit16 v10, v10, 0xff

    or-int/2addr v9, v10

    add-int/lit8 v10, v8, 0x1

    ushr-int/lit8 v11, v9, 0x12

    and-int/lit8 v11, v11, 0x3f

    invoke-static {v11}, Lrs/b;->i(I)B

    move-result v11

    aput-byte v11, v6, v8

    add-int/lit8 v11, v8, 0x2

    ushr-int/lit8 v12, v9, 0xc

    and-int/lit8 v12, v12, 0x3f

    invoke-static {v12}, Lrs/b;->i(I)B

    move-result v12

    aput-byte v12, v6, v10

    add-int/lit8 v10, v8, 0x3

    ushr-int/lit8 v12, v9, 0x6

    and-int/lit8 v12, v12, 0x3f

    invoke-static {v12}, Lrs/b;->i(I)B

    move-result v12

    aput-byte v12, v6, v11

    add-int/lit8 v8, v8, 0x4

    and-int/lit8 v9, v9, 0x3f

    invoke-static {v9}, Lrs/b;->i(I)B

    move-result v9

    aput-byte v9, v6, v10

    goto :goto_2

    :cond_4
    sub-int v7, v2, v4

    if-lez v7, :cond_7

    aget-byte v4, p0, v4

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0xa

    if-ne v7, v5, :cond_5

    add-int/lit8 v2, v2, -0x1

    aget-byte p0, p0, v2

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 v1, p0, 0x2

    :cond_5
    or-int p0, v4, v1

    if-ne v7, v5, :cond_6

    add-int/lit8 v1, v3, -0x3

    shr-int/lit8 v2, p0, 0xc

    invoke-static {v2}, Lrs/b;->i(I)B

    move-result v2

    aput-byte v2, v6, v1

    add-int/lit8 v1, v3, -0x2

    ushr-int/lit8 v2, p0, 0x6

    and-int/lit8 v2, v2, 0x3f

    invoke-static {v2}, Lrs/b;->i(I)B

    move-result v2

    aput-byte v2, v6, v1

    add-int/lit8 v3, v3, -0x1

    and-int/lit8 p0, p0, 0x3f

    invoke-static {p0}, Lrs/b;->i(I)B

    move-result p0

    aput-byte p0, v6, v3

    goto :goto_3

    :cond_6
    add-int/lit8 v1, v3, -0x2

    shr-int/lit8 v2, p0, 0xc

    invoke-static {v2}, Lrs/b;->i(I)B

    move-result v2

    aput-byte v2, v6, v1

    add-int/lit8 v3, v3, -0x1

    ushr-int/lit8 p0, p0, 0x6

    and-int/lit8 p0, p0, 0x3f

    invoke-static {p0}, Lrs/b;->i(I)B

    move-result p0

    aput-byte p0, v6, v3

    :cond_7
    :goto_3
    new-instance p0, Ljava/lang/String;

    sget-object v1, Lxw/f;->a:Ljava/nio/charset/Charset;

    invoke-direct {p0, v6, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    :goto_4
    invoke-direct {v0, p0}, Lxw/a;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static d(Ljava/lang/String;)Lxw/b;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lxw/b;

    invoke-direct {v0, p0}, Lxw/a;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lxw/b;

    if-eqz v0, :cond_0

    check-cast p1, Lxw/a;

    iget-object p1, p1, Lxw/a;->w:Ljava/lang/String;

    iget-object v0, p0, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
