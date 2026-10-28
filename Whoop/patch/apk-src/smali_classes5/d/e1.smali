.class public final Ld/e1;
.super Ld/c0;
.source "SourceFile"


# virtual methods
.method public final c(Z)I
    .locals 1

    invoke-virtual {p0}, Ld/e1;->m()[B

    move-result-object v0

    array-length v0, v0

    invoke-static {v0, p1}, Lro/i;->b(IZ)I

    move-result p1

    return p1
.end method

.method public final f(Lro/i;Z)V
    .locals 2

    invoke-virtual {p0}, Ld/e1;->m()[B

    move-result-object v0

    const/16 v1, 0x18

    invoke-virtual {p1, v1, p2, v0}, Lro/i;->f(IZ[B)V

    return-void
.end method

.method public final j()Ld/b1;
    .locals 0

    return-object p0
.end method

.method public final k()Ld/b1;
    .locals 0

    return-object p0
.end method

.method public final m()[B
    .locals 7

    iget-object v0, p0, Ld/c0;->a:[B

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aget-byte v1, v0, v1

    const/16 v2, 0x5a

    if-ne v1, v2, :cond_8

    const/16 v1, 0xa

    invoke-virtual {p0, v1}, Ld/c0;->l(I)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_6

    const/16 v1, 0xb

    invoke-virtual {p0, v1}, Ld/c0;->l(I)Z

    move-result v1

    if-eqz v1, :cond_6

    const/16 v1, 0xc

    invoke-virtual {p0, v1}, Ld/c0;->l(I)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0xd

    invoke-virtual {p0, v1}, Ld/c0;->l(I)Z

    move-result v1

    if-eqz v1, :cond_4

    move v1, v3

    :goto_0
    array-length v4, v0

    if-eq v1, v4, :cond_3

    aget-byte v4, v0, v1

    const/16 v5, 0x2e

    if-ne v4, v5, :cond_2

    const/16 v4, 0xe

    if-ne v1, v4, :cond_2

    array-length v1, v0

    add-int/lit8 v1, v1, -0x2

    :goto_1
    if-lez v1, :cond_0

    aget-byte v4, v0, v1

    const/16 v6, 0x30

    if-ne v4, v6, :cond_0

    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_0
    aget-byte v4, v0, v1

    if-ne v4, v5, :cond_1

    add-int/lit8 v4, v1, 0x1

    new-array v4, v4, [B

    invoke-static {v0, v3, v4, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aput-byte v2, v4, v1

    return-object v4

    :cond_1
    add-int/lit8 v4, v1, 0x2

    new-array v4, v4, [B

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v3, v4, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aput-byte v2, v4, v1

    return-object v4

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-object v0

    :cond_4
    array-length v1, v0

    add-int/lit8 v1, v1, 0x2

    new-array v1, v1, [B

    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sget v2, Lwg/c;->a:I

    const/4 v2, 0x3

    new-array v4, v2, [B

    move v5, v3

    :goto_2
    if-eq v5, v2, :cond_5

    const-string v6, "00Z"

    invoke-virtual {v6, v5}, Ljava/lang/String;->charAt(I)C

    move-result v6

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_5
    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {v4, v3, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1

    :cond_6
    array-length v1, v0

    add-int/lit8 v1, v1, 0x4

    new-array v1, v1, [B

    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sget v2, Lwg/c;->a:I

    const/4 v2, 0x5

    new-array v4, v2, [B

    move v5, v3

    :goto_3
    if-eq v5, v2, :cond_7

    const-string v6, "0000Z"

    invoke-virtual {v6, v5}, Ljava/lang/String;->charAt(I)C

    move-result v6

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_7
    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {v4, v3, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1

    :cond_8
    return-object v0
.end method
