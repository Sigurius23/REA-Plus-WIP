.class public final Landroidx/glance/appwidget/protobuf/o;
.super Landroidx/glance/appwidget/protobuf/p;
.source "SourceFile"


# instance fields
.field public final g:[B

.field public final h:I

.field public i:I

.field public final j:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p2, :cond_1

    const/16 v0, 0x14

    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    new-array v0, p2, [B

    iput-object v0, p0, Landroidx/glance/appwidget/protobuf/o;->g:[B

    iput p2, p0, Landroidx/glance/appwidget/protobuf/o;->h:I

    if-eqz p1, :cond_0

    iput-object p1, p0, Landroidx/glance/appwidget/protobuf/o;->j:Ljava/io/OutputStream;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "out"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "bufferSize must be >= 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final A0(IJ)V
    .locals 1

    const/16 v0, 0x14

    invoke-virtual {p0, v0}, Landroidx/glance/appwidget/protobuf/o;->I0(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/glance/appwidget/protobuf/o;->E0(II)V

    invoke-virtual {p0, p2, p3}, Landroidx/glance/appwidget/protobuf/o;->G0(J)V

    return-void
.end method

.method public final B0(J)V
    .locals 1

    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Landroidx/glance/appwidget/protobuf/o;->I0(I)V

    invoke-virtual {p0, p1, p2}, Landroidx/glance/appwidget/protobuf/o;->G0(J)V

    return-void
.end method

.method public final C0(I)V
    .locals 5

    iget v0, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    and-int/lit16 v2, p1, 0xff

    int-to-byte v2, v2

    iget-object v3, p0, Landroidx/glance/appwidget/protobuf/o;->g:[B

    aput-byte v2, v3, v0

    add-int/lit8 v2, v0, 0x2

    iput v2, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    shr-int/lit8 v4, p1, 0x8

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v3, v1

    add-int/lit8 v1, v0, 0x3

    iput v1, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    shr-int/lit8 v4, p1, 0x10

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v3, v2

    add-int/lit8 v0, v0, 0x4

    iput v0, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    shr-int/lit8 p1, p1, 0x18

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v3, v1

    return-void
.end method

.method public final D0(J)V
    .locals 9

    iget v0, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    const-wide/16 v2, 0xff

    and-long v4, p1, v2

    long-to-int v4, v4

    int-to-byte v4, v4

    iget-object v5, p0, Landroidx/glance/appwidget/protobuf/o;->g:[B

    aput-byte v4, v5, v0

    add-int/lit8 v4, v0, 0x2

    iput v4, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    const/16 v6, 0x8

    shr-long v7, p1, v6

    and-long/2addr v7, v2

    long-to-int v7, v7

    int-to-byte v7, v7

    aput-byte v7, v5, v1

    add-int/lit8 v1, v0, 0x3

    iput v1, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    const/16 v7, 0x10

    shr-long v7, p1, v7

    and-long/2addr v7, v2

    long-to-int v7, v7

    int-to-byte v7, v7

    aput-byte v7, v5, v4

    add-int/lit8 v4, v0, 0x4

    iput v4, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    const/16 v7, 0x18

    shr-long v7, p1, v7

    and-long/2addr v2, v7

    long-to-int v2, v2

    int-to-byte v2, v2

    aput-byte v2, v5, v1

    add-int/lit8 v1, v0, 0x5

    iput v1, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    const/16 v2, 0x20

    shr-long v2, p1, v2

    long-to-int v2, v2

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, v5, v4

    add-int/lit8 v2, v0, 0x6

    iput v2, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    const/16 v3, 0x28

    shr-long v3, p1, v3

    long-to-int v3, v3

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v5, v1

    add-int/lit8 v1, v0, 0x7

    iput v1, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    const/16 v3, 0x30

    shr-long v3, p1, v3

    long-to-int v3, v3

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v5, v2

    add-int/2addr v0, v6

    iput v0, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    const/16 v0, 0x38

    shr-long/2addr p1, v0

    long-to-int p1, p1

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v5, v1

    return-void
.end method

.method public final E0(II)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    or-int/2addr p1, p2

    invoke-virtual {p0, p1}, Landroidx/glance/appwidget/protobuf/o;->F0(I)V

    return-void
.end method

.method public final F0(I)V
    .locals 4

    sget-boolean v0, Landroidx/glance/appwidget/protobuf/p;->f:Z

    iget-object v1, p0, Landroidx/glance/appwidget/protobuf/o;->g:[B

    if-eqz v0, :cond_1

    :goto_0
    and-int/lit8 v0, p1, -0x80

    if-nez v0, :cond_0

    iget v0, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    int-to-long v2, v0

    int-to-byte p1, p1

    invoke-static {v1, v2, v3, p1}, Landroidx/glance/appwidget/protobuf/k1;->k([BJB)V

    return-void

    :cond_0
    iget v0, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    int-to-long v2, v0

    or-int/lit16 v0, p1, 0x80

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    invoke-static {v1, v2, v3, v0}, Landroidx/glance/appwidget/protobuf/k1;->k([BJB)V

    ushr-int/lit8 p1, p1, 0x7

    goto :goto_0

    :cond_1
    :goto_1
    and-int/lit8 v0, p1, -0x80

    if-nez v0, :cond_2

    iget v0, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    int-to-byte p1, p1

    aput-byte p1, v1, v0

    return-void

    :cond_2
    iget v0, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    or-int/lit16 v2, p1, 0x80

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    ushr-int/lit8 p1, p1, 0x7

    goto :goto_1
.end method

.method public final G0(J)V
    .locals 9

    sget-boolean v0, Landroidx/glance/appwidget/protobuf/p;->f:Z

    const/4 v1, 0x7

    const-wide/16 v2, 0x0

    const-wide/16 v4, -0x80

    iget-object v6, p0, Landroidx/glance/appwidget/protobuf/o;->g:[B

    if-eqz v0, :cond_1

    :goto_0
    and-long v7, p1, v4

    cmp-long v0, v7, v2

    if-nez v0, :cond_0

    iget v0, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    int-to-long v0, v0

    long-to-int p1, p1

    int-to-byte p1, p1

    invoke-static {v6, v0, v1, p1}, Landroidx/glance/appwidget/protobuf/k1;->k([BJB)V

    return-void

    :cond_0
    iget v0, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    add-int/lit8 v7, v0, 0x1

    iput v7, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

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

    iget v0, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    long-to-int p1, p1

    int-to-byte p1, p1

    aput-byte p1, v6, v0

    return-void

    :cond_2
    iget v0, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    add-int/lit8 v7, v0, 0x1

    iput v7, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    long-to-int v7, p1

    or-int/lit16 v7, v7, 0x80

    and-int/lit16 v7, v7, 0xff

    int-to-byte v7, v7

    aput-byte v7, v6, v0

    ushr-long/2addr p1, v1

    goto :goto_1
.end method

.method public final H0()V
    .locals 4

    iget v0, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    iget-object v1, p0, Landroidx/glance/appwidget/protobuf/o;->j:Ljava/io/OutputStream;

    iget-object v2, p0, Landroidx/glance/appwidget/protobuf/o;->g:[B

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0}, Ljava/io/OutputStream;->write([BII)V

    iput v3, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    return-void
.end method

.method public final I0(I)V
    .locals 2

    iget v0, p0, Landroidx/glance/appwidget/protobuf/o;->h:I

    iget v1, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    sub-int/2addr v0, v1

    if-ge v0, p1, :cond_0

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/o;->H0()V

    :cond_0
    return-void
.end method

.method public final J0([BII)V
    .locals 4

    iget v0, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    iget v1, p0, Landroidx/glance/appwidget/protobuf/o;->h:I

    sub-int v2, v1, v0

    iget-object v3, p0, Landroidx/glance/appwidget/protobuf/o;->g:[B

    if-lt v2, p3, :cond_0

    invoke-static {p1, p2, v3, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    add-int/2addr p1, p3

    iput p1, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    return-void

    :cond_0
    invoke-static {p1, p2, v3, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p2, v2

    sub-int/2addr p3, v2

    iput v1, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/o;->H0()V

    if-gt p3, v1, :cond_1

    const/4 v0, 0x0

    invoke-static {p1, p2, v3, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput p3, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/glance/appwidget/protobuf/o;->j:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    :goto_0
    return-void
.end method

.method public final c0([BII)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroidx/glance/appwidget/protobuf/o;->J0([BII)V

    return-void
.end method

.method public final m0(B)V
    .locals 2

    iget v0, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    iget v1, p0, Landroidx/glance/appwidget/protobuf/o;->h:I

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/o;->H0()V

    :cond_0
    iget v0, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    iget-object v1, p0, Landroidx/glance/appwidget/protobuf/o;->g:[B

    aput-byte p1, v1, v0

    return-void
.end method

.method public final n0(IZ)V
    .locals 1

    const/16 v0, 0xb

    invoke-virtual {p0, v0}, Landroidx/glance/appwidget/protobuf/o;->I0(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/glance/appwidget/protobuf/o;->E0(II)V

    int-to-byte p1, p2

    iget p2, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    add-int/lit8 v0, p2, 0x1

    iput v0, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    iget-object v0, p0, Landroidx/glance/appwidget/protobuf/o;->g:[B

    aput-byte p1, v0, p2

    return-void
.end method

.method public final o0(ILandroidx/glance/appwidget/protobuf/i;)V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Landroidx/glance/appwidget/protobuf/o;->x0(II)V

    invoke-virtual {p2}, Landroidx/glance/appwidget/protobuf/i;->size()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/glance/appwidget/protobuf/o;->z0(I)V

    check-cast p2, Landroidx/glance/appwidget/protobuf/h;

    iget-object p1, p2, Landroidx/glance/appwidget/protobuf/h;->z:[B

    invoke-virtual {p2}, Landroidx/glance/appwidget/protobuf/h;->f()I

    move-result v0

    invoke-virtual {p2}, Landroidx/glance/appwidget/protobuf/h;->size()I

    move-result p2

    invoke-virtual {p0, p1, v0, p2}, Landroidx/glance/appwidget/protobuf/o;->c0([BII)V

    return-void
.end method

.method public final p0(II)V
    .locals 1

    const/16 v0, 0xe

    invoke-virtual {p0, v0}, Landroidx/glance/appwidget/protobuf/o;->I0(I)V

    const/4 v0, 0x5

    invoke-virtual {p0, p1, v0}, Landroidx/glance/appwidget/protobuf/o;->E0(II)V

    invoke-virtual {p0, p2}, Landroidx/glance/appwidget/protobuf/o;->C0(I)V

    return-void
.end method

.method public final q0(I)V
    .locals 1

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Landroidx/glance/appwidget/protobuf/o;->I0(I)V

    invoke-virtual {p0, p1}, Landroidx/glance/appwidget/protobuf/o;->C0(I)V

    return-void
.end method

.method public final r0(IJ)V
    .locals 1

    const/16 v0, 0x12

    invoke-virtual {p0, v0}, Landroidx/glance/appwidget/protobuf/o;->I0(I)V

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Landroidx/glance/appwidget/protobuf/o;->E0(II)V

    invoke-virtual {p0, p2, p3}, Landroidx/glance/appwidget/protobuf/o;->D0(J)V

    return-void
.end method

.method public final s0(J)V
    .locals 1

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Landroidx/glance/appwidget/protobuf/o;->I0(I)V

    invoke-virtual {p0, p1, p2}, Landroidx/glance/appwidget/protobuf/o;->D0(J)V

    return-void
.end method

.method public final t0(II)V
    .locals 1

    const/16 v0, 0x14

    invoke-virtual {p0, v0}, Landroidx/glance/appwidget/protobuf/o;->I0(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/glance/appwidget/protobuf/o;->E0(II)V

    if-ltz p2, :cond_0

    invoke-virtual {p0, p2}, Landroidx/glance/appwidget/protobuf/o;->F0(I)V

    return-void

    :cond_0
    int-to-long p1, p2

    invoke-virtual {p0, p1, p2}, Landroidx/glance/appwidget/protobuf/o;->G0(J)V

    return-void
.end method

.method public final u0(I)V
    .locals 2

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Landroidx/glance/appwidget/protobuf/o;->z0(I)V

    return-void

    :cond_0
    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, Landroidx/glance/appwidget/protobuf/o;->B0(J)V

    return-void
.end method

.method public final v0(ILandroidx/glance/appwidget/protobuf/a;Landroidx/glance/appwidget/protobuf/b1;)V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Landroidx/glance/appwidget/protobuf/o;->x0(II)V

    invoke-virtual {p2, p3}, Landroidx/glance/appwidget/protobuf/a;->b(Landroidx/glance/appwidget/protobuf/b1;)I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/glance/appwidget/protobuf/o;->z0(I)V

    iget-object p1, p0, Landroidx/glance/appwidget/protobuf/p;->d:Landroidx/glance/appwidget/protobuf/m0;

    invoke-interface {p3, p2, p1}, Landroidx/glance/appwidget/protobuf/b1;->i(Ljava/lang/Object;Landroidx/glance/appwidget/protobuf/m0;)V

    return-void
.end method

.method public final w0(ILjava/lang/String;)V
    .locals 5

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Landroidx/glance/appwidget/protobuf/o;->x0(II)V

    :try_start_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    mul-int/lit8 p1, p1, 0x3

    invoke-static {p1}, Landroidx/glance/appwidget/protobuf/p;->j0(I)I

    move-result v0
    :try_end_0
    .catch Landroidx/glance/appwidget/protobuf/m1; {:try_start_0 .. :try_end_0} :catch_0

    add-int v1, v0, p1

    iget v2, p0, Landroidx/glance/appwidget/protobuf/o;->h:I

    if-le v1, v2, :cond_0

    :try_start_1
    new-array v0, p1, [B

    sget-object v1, Landroidx/glance/appwidget/protobuf/n1;->a:Le4/a;

    const/4 v2, 0x0

    invoke-virtual {v1, p2, v0, v2, p1}, Le4/a;->v(Ljava/lang/String;[BII)I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/glance/appwidget/protobuf/o;->z0(I)V

    invoke-virtual {p0, v0, v2, p1}, Landroidx/glance/appwidget/protobuf/o;->J0([BII)V

    return-void

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_0
    iget p1, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    sub-int p1, v2, p1

    if-le v1, p1, :cond_1

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/o;->H0()V

    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    invoke-static {p1}, Landroidx/glance/appwidget/protobuf/p;->j0(I)I

    move-result p1

    iget v1, p0, Landroidx/glance/appwidget/protobuf/o;->i:I
    :try_end_1
    .catch Landroidx/glance/appwidget/protobuf/m1; {:try_start_1 .. :try_end_1} :catch_0

    iget-object v3, p0, Landroidx/glance/appwidget/protobuf/o;->g:[B

    if-ne p1, v0, :cond_2

    add-int v0, v1, p1

    :try_start_2
    iput v0, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    sub-int/2addr v2, v0

    sget-object v4, Landroidx/glance/appwidget/protobuf/n1;->a:Le4/a;

    invoke-virtual {v4, p2, v3, v0, v2}, Le4/a;->v(Ljava/lang/String;[BII)I

    move-result v0

    iput v1, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    sub-int v2, v0, v1

    sub-int/2addr v2, p1

    invoke-virtual {p0, v2}, Landroidx/glance/appwidget/protobuf/o;->F0(I)V

    iput v0, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    return-void

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    goto :goto_1

    :cond_2
    invoke-static {p2}, Landroidx/glance/appwidget/protobuf/n1;->b(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/glance/appwidget/protobuf/o;->F0(I)V

    iget v0, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    sget-object v2, Landroidx/glance/appwidget/protobuf/n1;->a:Le4/a;

    invoke-virtual {v2, p2, v3, v0, p1}, Le4/a;->v(Ljava/lang/String;[BII)I

    move-result p1

    iput p1, p0, Landroidx/glance/appwidget/protobuf/o;->i:I
    :try_end_2
    .catch Landroidx/glance/appwidget/protobuf/m1; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_1

    return-void

    :goto_0
    :try_start_3
    new-instance v0, Landroidx/glance/appwidget/protobuf/CodedOutputStream$OutOfSpaceException;

    invoke-direct {v0, p1}, Landroidx/glance/appwidget/protobuf/CodedOutputStream$OutOfSpaceException;-><init>(Ljava/lang/IndexOutOfBoundsException;)V

    throw v0

    :goto_1
    iput v1, p0, Landroidx/glance/appwidget/protobuf/o;->i:I

    throw p1
    :try_end_3
    .catch Landroidx/glance/appwidget/protobuf/m1; {:try_start_3 .. :try_end_3} :catch_0

    :goto_2
    invoke-virtual {p0, p2, p1}, Landroidx/glance/appwidget/protobuf/p;->l0(Ljava/lang/String;Landroidx/glance/appwidget/protobuf/m1;)V

    return-void
.end method

.method public final x0(II)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    or-int/2addr p1, p2

    invoke-virtual {p0, p1}, Landroidx/glance/appwidget/protobuf/o;->z0(I)V

    return-void
.end method

.method public final y0(II)V
    .locals 1

    const/16 v0, 0x14

    invoke-virtual {p0, v0}, Landroidx/glance/appwidget/protobuf/o;->I0(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/glance/appwidget/protobuf/o;->E0(II)V

    invoke-virtual {p0, p2}, Landroidx/glance/appwidget/protobuf/o;->F0(I)V

    return-void
.end method

.method public final z0(I)V
    .locals 1

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Landroidx/glance/appwidget/protobuf/o;->I0(I)V

    invoke-virtual {p0, p1}, Landroidx/glance/appwidget/protobuf/o;->F0(I)V

    return-void
.end method
