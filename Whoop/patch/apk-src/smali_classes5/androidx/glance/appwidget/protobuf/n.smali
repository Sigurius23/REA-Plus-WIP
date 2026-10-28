.class public final Landroidx/glance/appwidget/protobuf/n;
.super Landroidx/glance/appwidget/protobuf/p;
.source "SourceFile"


# instance fields
.field public final g:[B

.field public final h:I

.field public i:I


# direct methods
.method public constructor <init>([BI)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length v0, p1

    sub-int/2addr v0, p2

    or-int/2addr v0, p2

    const/4 v1, 0x0

    if-ltz v0, :cond_0

    iput-object p1, p0, Landroidx/glance/appwidget/protobuf/n;->g:[B

    iput v1, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    iput p2, p0, Landroidx/glance/appwidget/protobuf/n;->h:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    array-length p1, p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p1, v1, p2}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final A0(IJ)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/glance/appwidget/protobuf/n;->x0(II)V

    invoke-virtual {p0, p2, p3}, Landroidx/glance/appwidget/protobuf/n;->B0(J)V

    return-void
.end method

.method public final B0(J)V
    .locals 9

    sget-boolean v0, Landroidx/glance/appwidget/protobuf/p;->f:Z

    const/4 v1, 0x7

    const-wide/16 v2, 0x0

    const-wide/16 v4, -0x80

    iget-object v6, p0, Landroidx/glance/appwidget/protobuf/n;->g:[B

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/n;->C0()I

    move-result v0

    const/16 v7, 0xa

    if-lt v0, v7, :cond_1

    :goto_0
    and-long v7, p1, v4

    cmp-long v0, v7, v2

    if-nez v0, :cond_0

    iget v0, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    int-to-long v0, v0

    long-to-int p1, p1

    int-to-byte p1, p1

    invoke-static {v6, v0, v1, p1}, Landroidx/glance/appwidget/protobuf/k1;->k([BJB)V

    return-void

    :cond_0
    iget v0, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    add-int/lit8 v7, v0, 0x1

    iput v7, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    int-to-long v7, v0

    long-to-int v0, p1

    or-int/lit16 v0, v0, 0x80

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    invoke-static {v6, v7, v8, v0}, Landroidx/glance/appwidget/protobuf/k1;->k([BJB)V

    ushr-long/2addr p1, v1

    goto :goto_0

    :cond_1
    :goto_1
    and-long v7, p1, v4

    cmp-long v0, v7, v2

    if-nez v0, :cond_2

    :try_start_0
    iget v0, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    long-to-int p1, p1

    int-to-byte p1, p1

    aput-byte p1, v6, v0

    return-void

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_2
    iget v0, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    add-int/lit8 v7, v0, 0x1

    iput v7, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    long-to-int v7, p1

    or-int/lit16 v7, v7, 0x80

    and-int/lit16 v7, v7, 0xff

    int-to-byte v7, v7

    aput-byte v7, v6, v0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    ushr-long/2addr p1, v1

    goto :goto_1

    :goto_2
    new-instance p2, Landroidx/glance/appwidget/protobuf/CodedOutputStream$OutOfSpaceException;

    iget v0, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Landroidx/glance/appwidget/protobuf/n;->h:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Pos: %d, limit: %d, len: %d"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Landroidx/glance/appwidget/protobuf/CodedOutputStream$OutOfSpaceException;-><init>(Ljava/lang/String;Ljava/lang/IndexOutOfBoundsException;)V

    throw p2
.end method

.method public final C0()I
    .locals 2

    iget v0, p0, Landroidx/glance/appwidget/protobuf/n;->h:I

    iget v1, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final c0([BII)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Landroidx/glance/appwidget/protobuf/n;->g:[B

    iget v1, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    add-int/2addr p1, p3

    iput p1, p0, Landroidx/glance/appwidget/protobuf/n;->i:I
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Landroidx/glance/appwidget/protobuf/CodedOutputStream$OutOfSpaceException;

    iget v0, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Landroidx/glance/appwidget/protobuf/n;->h:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    filled-new-array {v0, v1, p3}, [Ljava/lang/Object;

    move-result-object p3

    const-string v0, "Pos: %d, limit: %d, len: %d"

    invoke-static {v0, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Landroidx/glance/appwidget/protobuf/CodedOutputStream$OutOfSpaceException;-><init>(Ljava/lang/String;Ljava/lang/IndexOutOfBoundsException;)V

    throw p2
.end method

.method public final m0(B)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Landroidx/glance/appwidget/protobuf/n;->g:[B

    iget v1, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    aput-byte p1, v0, v1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Landroidx/glance/appwidget/protobuf/CodedOutputStream$OutOfSpaceException;

    iget v1, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Landroidx/glance/appwidget/protobuf/n;->h:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Pos: %d, limit: %d, len: %d"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroidx/glance/appwidget/protobuf/CodedOutputStream$OutOfSpaceException;-><init>(Ljava/lang/String;Ljava/lang/IndexOutOfBoundsException;)V

    throw v0
.end method

.method public final n0(IZ)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/glance/appwidget/protobuf/n;->x0(II)V

    int-to-byte p1, p2

    invoke-virtual {p0, p1}, Landroidx/glance/appwidget/protobuf/n;->m0(B)V

    return-void
.end method

.method public final o0(ILandroidx/glance/appwidget/protobuf/i;)V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Landroidx/glance/appwidget/protobuf/n;->x0(II)V

    invoke-virtual {p2}, Landroidx/glance/appwidget/protobuf/i;->size()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/glance/appwidget/protobuf/n;->z0(I)V

    check-cast p2, Landroidx/glance/appwidget/protobuf/h;

    iget-object p1, p2, Landroidx/glance/appwidget/protobuf/h;->z:[B

    invoke-virtual {p2}, Landroidx/glance/appwidget/protobuf/h;->f()I

    move-result v0

    invoke-virtual {p2}, Landroidx/glance/appwidget/protobuf/h;->size()I

    move-result p2

    invoke-virtual {p0, p1, v0, p2}, Landroidx/glance/appwidget/protobuf/n;->c0([BII)V

    return-void
.end method

.method public final p0(II)V
    .locals 1

    const/4 v0, 0x5

    invoke-virtual {p0, p1, v0}, Landroidx/glance/appwidget/protobuf/n;->x0(II)V

    invoke-virtual {p0, p2}, Landroidx/glance/appwidget/protobuf/n;->q0(I)V

    return-void
.end method

.method public final q0(I)V
    .locals 5

    :try_start_0
    iget-object v0, p0, Landroidx/glance/appwidget/protobuf/n;->g:[B

    iget v1, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    and-int/lit16 v3, p1, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    add-int/lit8 v3, v1, 0x2

    iput v3, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    shr-int/lit8 v4, p1, 0x8

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v0, v2

    add-int/lit8 v2, v1, 0x3

    iput v2, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    shr-int/lit8 v4, p1, 0x10

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v0, v3

    add-int/lit8 v1, v1, 0x4

    iput v1, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    shr-int/lit8 p1, p1, 0x18

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v0, v2
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Landroidx/glance/appwidget/protobuf/CodedOutputStream$OutOfSpaceException;

    iget v1, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Landroidx/glance/appwidget/protobuf/n;->h:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Pos: %d, limit: %d, len: %d"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroidx/glance/appwidget/protobuf/CodedOutputStream$OutOfSpaceException;-><init>(Ljava/lang/String;Ljava/lang/IndexOutOfBoundsException;)V

    throw v0
.end method

.method public final r0(IJ)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Landroidx/glance/appwidget/protobuf/n;->x0(II)V

    invoke-virtual {p0, p2, p3}, Landroidx/glance/appwidget/protobuf/n;->s0(J)V

    return-void
.end method

.method public final s0(J)V
    .locals 7

    :try_start_0
    iget-object v0, p0, Landroidx/glance/appwidget/protobuf/n;->g:[B

    iget v1, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    long-to-int v3, p1

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    add-int/lit8 v3, v1, 0x2

    iput v3, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    const/16 v4, 0x8

    shr-long v5, p1, v4

    long-to-int v5, v5

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, v0, v2

    add-int/lit8 v2, v1, 0x3

    iput v2, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    const/16 v5, 0x10

    shr-long v5, p1, v5

    long-to-int v5, v5

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, v0, v3

    add-int/lit8 v3, v1, 0x4

    iput v3, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    const/16 v5, 0x18

    shr-long v5, p1, v5

    long-to-int v5, v5

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, v0, v2

    add-int/lit8 v2, v1, 0x5

    iput v2, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    const/16 v5, 0x20

    shr-long v5, p1, v5

    long-to-int v5, v5

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, v0, v3

    add-int/lit8 v3, v1, 0x6

    iput v3, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    const/16 v5, 0x28

    shr-long v5, p1, v5

    long-to-int v5, v5

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, v0, v2

    add-int/lit8 v2, v1, 0x7

    iput v2, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    const/16 v5, 0x30

    shr-long v5, p1, v5

    long-to-int v5, v5

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, v0, v3

    add-int/2addr v1, v4

    iput v1, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    const/16 v1, 0x38

    shr-long/2addr p1, v1

    long-to-int p1, p1

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v0, v2
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Landroidx/glance/appwidget/protobuf/CodedOutputStream$OutOfSpaceException;

    iget v0, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Landroidx/glance/appwidget/protobuf/n;->h:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Pos: %d, limit: %d, len: %d"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Landroidx/glance/appwidget/protobuf/CodedOutputStream$OutOfSpaceException;-><init>(Ljava/lang/String;Ljava/lang/IndexOutOfBoundsException;)V

    throw p2
.end method

.method public final t0(II)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/glance/appwidget/protobuf/n;->x0(II)V

    invoke-virtual {p0, p2}, Landroidx/glance/appwidget/protobuf/n;->u0(I)V

    return-void
.end method

.method public final u0(I)V
    .locals 2

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Landroidx/glance/appwidget/protobuf/n;->z0(I)V

    return-void

    :cond_0
    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, Landroidx/glance/appwidget/protobuf/n;->B0(J)V

    return-void
.end method

.method public final v0(ILandroidx/glance/appwidget/protobuf/a;Landroidx/glance/appwidget/protobuf/b1;)V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Landroidx/glance/appwidget/protobuf/n;->x0(II)V

    invoke-virtual {p2, p3}, Landroidx/glance/appwidget/protobuf/a;->b(Landroidx/glance/appwidget/protobuf/b1;)I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/glance/appwidget/protobuf/n;->z0(I)V

    iget-object p1, p0, Landroidx/glance/appwidget/protobuf/p;->d:Landroidx/glance/appwidget/protobuf/m0;

    invoke-interface {p3, p2, p1}, Landroidx/glance/appwidget/protobuf/b1;->i(Ljava/lang/Object;Landroidx/glance/appwidget/protobuf/m0;)V

    return-void
.end method

.method public final w0(ILjava/lang/String;)V
    .locals 5

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Landroidx/glance/appwidget/protobuf/n;->x0(II)V

    iget p1, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    :try_start_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    mul-int/lit8 v0, v0, 0x3

    invoke-static {v0}, Landroidx/glance/appwidget/protobuf/p;->j0(I)I

    move-result v0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v1}, Landroidx/glance/appwidget/protobuf/p;->j0(I)I

    move-result v1
    :try_end_0
    .catch Landroidx/glance/appwidget/protobuf/m1; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v2, p0, Landroidx/glance/appwidget/protobuf/n;->g:[B

    if-ne v1, v0, :cond_0

    add-int v0, p1, v1

    :try_start_1
    iput v0, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/n;->C0()I

    move-result v3

    sget-object v4, Landroidx/glance/appwidget/protobuf/n1;->a:Le4/a;

    invoke-virtual {v4, p2, v2, v0, v3}, Le4/a;->v(Ljava/lang/String;[BII)I

    move-result v0

    iput p1, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    sub-int v2, v0, p1

    sub-int/2addr v2, v1

    invoke-virtual {p0, v2}, Landroidx/glance/appwidget/protobuf/n;->z0(I)V

    iput v0, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-static {p2}, Landroidx/glance/appwidget/protobuf/n1;->b(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/glance/appwidget/protobuf/n;->z0(I)V

    iget v0, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/n;->C0()I

    move-result v1

    sget-object v3, Landroidx/glance/appwidget/protobuf/n1;->a:Le4/a;

    invoke-virtual {v3, p2, v2, v0, v1}, Le4/a;->v(Ljava/lang/String;[BII)I

    move-result v0

    iput v0, p0, Landroidx/glance/appwidget/protobuf/n;->i:I
    :try_end_1
    .catch Landroidx/glance/appwidget/protobuf/m1; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :goto_0
    new-instance p2, Landroidx/glance/appwidget/protobuf/CodedOutputStream$OutOfSpaceException;

    invoke-direct {p2, p1}, Landroidx/glance/appwidget/protobuf/CodedOutputStream$OutOfSpaceException;-><init>(Ljava/lang/IndexOutOfBoundsException;)V

    throw p2

    :goto_1
    iput p1, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    invoke-virtual {p0, p2, v0}, Landroidx/glance/appwidget/protobuf/p;->l0(Ljava/lang/String;Landroidx/glance/appwidget/protobuf/m1;)V

    return-void
.end method

.method public final x0(II)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    or-int/2addr p1, p2

    invoke-virtual {p0, p1}, Landroidx/glance/appwidget/protobuf/n;->z0(I)V

    return-void
.end method

.method public final y0(II)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/glance/appwidget/protobuf/n;->x0(II)V

    invoke-virtual {p0, p2}, Landroidx/glance/appwidget/protobuf/n;->z0(I)V

    return-void
.end method

.method public final z0(I)V
    .locals 4

    :goto_0
    and-int/lit8 v0, p1, -0x80

    iget-object v1, p0, Landroidx/glance/appwidget/protobuf/n;->g:[B

    if-nez v0, :cond_0

    :try_start_0
    iget v0, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    int-to-byte p1, p1

    aput-byte p1, v1, v0

    return-void

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget v0, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    or-int/lit16 v2, p1, 0x80

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, v1, v0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    ushr-int/lit8 p1, p1, 0x7

    goto :goto_0

    :goto_1
    new-instance v0, Landroidx/glance/appwidget/protobuf/CodedOutputStream$OutOfSpaceException;

    iget v1, p0, Landroidx/glance/appwidget/protobuf/n;->i:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Landroidx/glance/appwidget/protobuf/n;->h:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Pos: %d, limit: %d, len: %d"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroidx/glance/appwidget/protobuf/CodedOutputStream$OutOfSpaceException;-><init>(Ljava/lang/String;Ljava/lang/IndexOutOfBoundsException;)V

    throw v0
.end method
