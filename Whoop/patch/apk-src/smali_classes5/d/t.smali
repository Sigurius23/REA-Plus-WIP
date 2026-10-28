.class public final Ld/t;
.super Ld/g;
.source "SourceFile"


# instance fields
.field public final d:I

.field public final e:[Ld/g;


# direct methods
.method public constructor <init>([BI)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ld/g;-><init>([BI)V

    const/4 p1, 0x0

    iput-object p1, p0, Ld/t;->e:[Ld/g;

    const/16 p1, 0x3e8

    iput p1, p0, Ld/t;->d:I

    return-void
.end method

.method public constructor <init>([Ld/g;)V
    .locals 1

    .line 2
    invoke-static {p1}, Ld/t;->m([Ld/g;)[B

    move-result-object v0

    invoke-direct {p0, v0}, Ld/g;-><init>([B)V

    iput-object p1, p0, Ld/t;->e:[Ld/g;

    const/16 p1, 0x3e8

    iput p1, p0, Ld/t;->d:I

    return-void
.end method

.method public static m([Ld/g;)[B
    .locals 8

    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    if-eq v0, v2, :cond_3

    add-int/lit8 v3, v0, -0x1

    move v4, v1

    move v5, v4

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v6, p0, v4

    iget-object v6, v6, Ld/g;->a:[B

    aget-byte v7, v6, v1

    if-nez v7, :cond_0

    array-length v6, v6

    sub-int/2addr v6, v2

    add-int/2addr v5, v6

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "only the last nested bitstring can have padding"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    aget-object v3, p0, v3

    iget-object v3, v3, Ld/g;->a:[B

    aget-byte v4, v3, v1

    array-length v3, v3

    add-int/2addr v5, v3

    new-array v3, v5, [B

    aput-byte v4, v3, v1

    move v4, v2

    :goto_1
    if-ge v1, v0, :cond_2

    aget-object v5, p0, v1

    iget-object v5, v5, Ld/g;->a:[B

    array-length v6, v5

    sub-int/2addr v6, v2

    invoke-static {v5, v2, v3, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v4, v6

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-object v3

    :cond_3
    aget-object p0, p0, v1

    iget-object p0, p0, Ld/g;->a:[B

    return-object p0

    :cond_4
    new-array p0, v2, [B

    aput-byte v1, p0, v1

    return-object p0
.end method


# virtual methods
.method public final c(Z)I
    .locals 5

    invoke-virtual {p0}, Ld/t;->h()Z

    move-result v0

    iget-object v1, p0, Ld/g;->a:[B

    if-nez v0, :cond_0

    array-length v0, v1

    invoke-static {v0, p1}, Lro/i;->b(IZ)I

    move-result p1

    return p1

    :cond_0
    if-eqz p1, :cond_1

    const/4 p1, 0x4

    goto :goto_0

    :cond_1
    const/4 p1, 0x3

    :goto_0
    iget-object v0, p0, Ld/t;->e:[Ld/g;

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    const/4 v1, 0x0

    :goto_1
    array-length v3, v0

    if-ge v1, v3, :cond_2

    aget-object v3, v0, v1

    invoke-virtual {v3, v2}, Ld/b1;->c(Z)I

    move-result v3

    add-int/2addr p1, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return p1

    :cond_3
    array-length v0, v1

    const/4 v3, 0x2

    if-ge v0, v3, :cond_4

    return p1

    :cond_4
    array-length v0, v1

    sub-int/2addr v0, v3

    iget v3, p0, Ld/t;->d:I

    add-int/lit8 v4, v3, -0x1

    div-int/2addr v0, v4

    invoke-static {v3, v2}, Lro/i;->b(IZ)I

    move-result v3

    mul-int/2addr v3, v0

    add-int/2addr v3, p1

    array-length p1, v1

    mul-int/2addr v4, v0

    sub-int/2addr p1, v4

    invoke-static {p1, v2}, Lro/i;->b(IZ)I

    move-result p1

    add-int/2addr p1, v3

    return p1
.end method

.method public final f(Lro/i;Z)V
    .locals 10

    invoke-virtual {p0}, Ld/t;->h()Z

    move-result v0

    const/4 v1, 0x3

    iget-object v2, p0, Ld/g;->a:[B

    const/4 v3, 0x0

    if-nez v0, :cond_0

    array-length v0, v2

    invoke-virtual {p1, v1, p2}, Lro/i;->n(IZ)V

    invoke-virtual {p1, v0}, Lro/i;->d(I)V

    iget-object p1, p1, Lro/i;->x:Ljava/lang/Object;

    check-cast p1, Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p1, v2, v3, v0}, Ljava/io/OutputStream;->write([BII)V

    return-void

    :cond_0
    const/16 v0, 0x23

    invoke-virtual {p1, v0, p2}, Lro/i;->n(IZ)V

    iget-object p2, p1, Lro/i;->x:Ljava/lang/Object;

    check-cast p2, Ljava/io/ByteArrayOutputStream;

    const/16 v0, 0x80

    invoke-virtual {p2, v0}, Ljava/io/OutputStream;->write(I)V

    iget-object v0, p0, Ld/t;->e:[Ld/g;

    if-eqz v0, :cond_1

    invoke-virtual {p1, v0}, Lro/i;->j([Ld/b1;)V

    goto :goto_1

    :cond_1
    array-length v0, v2

    const/4 v4, 0x2

    if-ge v0, v4, :cond_2

    goto :goto_1

    :cond_2
    aget-byte v0, v2, v3

    array-length v4, v2

    add-int/lit8 v5, v4, -0x1

    iget v6, p0, Ld/t;->d:I

    add-int/lit8 v7, v6, -0x1

    :goto_0
    const/4 v8, 0x1

    if-le v5, v7, :cond_3

    sub-int v9, v4, v5

    invoke-virtual {p1, v1, v8}, Lro/i;->n(IZ)V

    invoke-virtual {p1, v6}, Lro/i;->d(I)V

    invoke-virtual {p2, v3}, Ljava/io/OutputStream;->write(I)V

    invoke-virtual {p2, v2, v9, v7}, Ljava/io/OutputStream;->write([BII)V

    sub-int/2addr v5, v7

    goto :goto_0

    :cond_3
    sub-int/2addr v4, v5

    invoke-virtual {p1, v1, v8}, Lro/i;->n(IZ)V

    add-int/lit8 v1, v5, 0x1

    invoke-virtual {p1, v1}, Lro/i;->d(I)V

    invoke-virtual {p2, v0}, Ljava/io/OutputStream;->write(I)V

    invoke-virtual {p2, v2, v4, v5}, Ljava/io/OutputStream;->write([BII)V

    :goto_1
    invoke-virtual {p2, v3}, Ljava/io/OutputStream;->write(I)V

    invoke-virtual {p2, v3}, Ljava/io/OutputStream;->write(I)V

    return-void
.end method

.method public final h()Z
    .locals 2

    iget-object v0, p0, Ld/t;->e:[Ld/g;

    if-nez v0, :cond_1

    iget-object v0, p0, Ld/g;->a:[B

    array-length v0, v0

    iget v1, p0, Ld/t;->d:I

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
