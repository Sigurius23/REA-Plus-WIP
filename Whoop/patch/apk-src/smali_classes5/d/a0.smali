.class public final Ld/a0;
.super Ld/x0;
.source "SourceFile"


# instance fields
.field public final d:I

.field public final e:[Ld/x0;


# direct methods
.method public constructor <init>([B[Ld/x0;)V
    .locals 0

    invoke-direct {p0, p1}, Ld/x0;-><init>([B)V

    iput-object p2, p0, Ld/a0;->e:[Ld/x0;

    const/16 p1, 0x3e8

    iput p1, p0, Ld/a0;->d:I

    return-void
.end method

.method public static m([Ld/x0;)[B
    .locals 7

    array-length v0, p0

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_2

    move v1, v2

    move v3, v1

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v4, p0, v1

    iget-object v4, v4, Ld/x0;->a:[B

    array-length v4, v4

    add-int/2addr v3, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-array v1, v3, [B

    move v3, v2

    move v4, v3

    :goto_1
    if-ge v3, v0, :cond_1

    aget-object v5, p0, v3

    iget-object v5, v5, Ld/x0;->a:[B

    array-length v6, v5

    invoke-static {v5, v2, v1, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v5, v5

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    return-object v1

    :cond_2
    aget-object p0, p0, v2

    iget-object p0, p0, Ld/x0;->a:[B

    return-object p0

    :cond_3
    sget-object p0, Ld/x0;->c:[B

    return-object p0
.end method


# virtual methods
.method public final c(Z)I
    .locals 5

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x3

    :goto_0
    iget-object v0, p0, Ld/a0;->e:[Ld/x0;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    const/4 v2, 0x0

    :goto_1
    array-length v3, v0

    if-ge v2, v3, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3, v1}, Ld/b1;->c(Z)I

    move-result v3

    add-int/2addr p1, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return p1

    :cond_2
    iget-object v0, p0, Ld/x0;->a:[B

    array-length v2, v0

    iget v3, p0, Ld/a0;->d:I

    div-int/2addr v2, v3

    invoke-static {v3, v1}, Lro/i;->b(IZ)I

    move-result v4

    mul-int/2addr v4, v2

    add-int/2addr v4, p1

    array-length p1, v0

    mul-int/2addr v2, v3

    sub-int/2addr p1, v2

    if-lez p1, :cond_3

    invoke-static {p1, v1}, Lro/i;->b(IZ)I

    move-result p1

    add-int/2addr p1, v4

    return p1

    :cond_3
    return v4
.end method

.method public final f(Lro/i;Z)V
    .locals 6

    const/16 v0, 0x24

    invoke-virtual {p1, v0, p2}, Lro/i;->n(IZ)V

    iget-object p2, p1, Lro/i;->x:Ljava/lang/Object;

    check-cast p2, Ljava/io/ByteArrayOutputStream;

    const/16 v0, 0x80

    invoke-virtual {p2, v0}, Ljava/io/OutputStream;->write(I)V

    const/4 v0, 0x0

    iget-object v1, p0, Ld/a0;->e:[Ld/x0;

    if-eqz v1, :cond_0

    invoke-virtual {p1, v1}, Lro/i;->j([Ld/b1;)V

    goto :goto_1

    :cond_0
    move v1, v0

    :goto_0
    iget-object v2, p0, Ld/x0;->a:[B

    array-length v3, v2

    if-ge v1, v3, :cond_1

    array-length v3, v2

    sub-int/2addr v3, v1

    iget v4, p0, Ld/a0;->d:I

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x4

    invoke-virtual {p1, v5, v4}, Lro/i;->n(IZ)V

    invoke-virtual {p1, v3}, Lro/i;->d(I)V

    invoke-virtual {p2, v2, v1, v3}, Ljava/io/OutputStream;->write([BII)V

    add-int/2addr v1, v3

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {p2, v0}, Ljava/io/OutputStream;->write(I)V

    invoke-virtual {p2, v0}, Ljava/io/OutputStream;->write(I)V

    return-void
.end method

.method public final h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
