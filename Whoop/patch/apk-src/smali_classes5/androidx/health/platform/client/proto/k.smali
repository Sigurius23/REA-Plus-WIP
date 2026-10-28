.class public final Landroidx/health/platform/client/proto/k;
.super Landroidx/health/platform/client/proto/z2;
.source "SourceFile"


# static fields
.field public static final g:Ljava/util/logging/Logger;

.field public static final h:Z


# instance fields
.field public c:Landroidx/health/platform/client/proto/g1;

.field public final d:[B

.field public final e:I

.field public f:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Landroidx/health/platform/client/proto/k;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Landroidx/health/platform/client/proto/k;->g:Ljava/util/logging/Logger;

    sget-boolean v0, Landroidx/health/platform/client/proto/n3;->e:Z

    sput-boolean v0, Landroidx/health/platform/client/proto/k;->h:Z

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length v0, p1

    sub-int/2addr v0, p2

    or-int/2addr v0, p2

    const/4 v1, 0x0

    if-ltz v0, :cond_0

    iput-object p1, p0, Landroidx/health/platform/client/proto/k;->d:[B

    iput v1, p0, Landroidx/health/platform/client/proto/k;->f:I

    iput p2, p0, Landroidx/health/platform/client/proto/k;->e:I

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

.method public static A(I)I
    .locals 0

    if-ltz p0, :cond_0

    invoke-static {p0}, Landroidx/health/platform/client/proto/k;->D(I)I

    move-result p0

    return p0

    :cond_0
    const/16 p0, 0xa

    return p0
.end method

.method public static B(Ljava/lang/String;)I
    .locals 1

    :try_start_0
    invoke-static {p0}, Landroidx/health/platform/client/proto/q3;->b(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Landroidx/health/platform/client/proto/p3; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v0, Landroidx/health/platform/client/proto/x0;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    array-length p0, p0

    :goto_0
    invoke-static {p0}, Landroidx/health/platform/client/proto/k;->D(I)I

    move-result v0

    add-int/2addr v0, p0

    return v0
.end method

.method public static C(I)I
    .locals 0

    shl-int/lit8 p0, p0, 0x3

    invoke-static {p0}, Landroidx/health/platform/client/proto/k;->D(I)I

    move-result p0

    return p0
.end method

.method public static D(I)I
    .locals 1

    and-int/lit8 v0, p0, -0x80

    if-nez v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    and-int/lit16 v0, p0, -0x4000

    if-nez v0, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    const/high16 v0, -0x200000

    and-int/2addr v0, p0

    if-nez v0, :cond_2

    const/4 p0, 0x3

    return p0

    :cond_2
    const/high16 v0, -0x10000000

    and-int/2addr p0, v0

    if-nez p0, :cond_3

    const/4 p0, 0x4

    return p0

    :cond_3
    const/4 p0, 0x5

    return p0
.end method

.method public static E(J)I
    .locals 6

    const-wide/16 v0, -0x80

    and-long/2addr v0, p0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    cmp-long v0, p0, v2

    if-gez v0, :cond_1

    const/16 p0, 0xa

    return p0

    :cond_1
    const-wide v4, -0x800000000L

    and-long/2addr v4, p0

    cmp-long v0, v4, v2

    if-eqz v0, :cond_2

    const/16 v0, 0x1c

    ushr-long/2addr p0, v0

    const/4 v0, 0x6

    goto :goto_0

    :cond_2
    const/4 v0, 0x2

    :goto_0
    const-wide/32 v4, -0x200000

    and-long/2addr v4, p0

    cmp-long v4, v4, v2

    if-eqz v4, :cond_3

    add-int/lit8 v0, v0, 0x2

    const/16 v4, 0xe

    ushr-long/2addr p0, v4

    :cond_3
    const-wide/16 v4, -0x4000

    and-long/2addr p0, v4

    cmp-long p0, p0, v2

    if-eqz p0, :cond_4

    add-int/2addr v0, v1

    :cond_4
    return v0
.end method

.method public static v(ILandroidx/health/platform/client/proto/h;)I
    .locals 0

    invoke-static {p0}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result p0

    invoke-static {p1}, Landroidx/health/platform/client/proto/k;->w(Landroidx/health/platform/client/proto/h;)I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method

.method public static w(Landroidx/health/platform/client/proto/h;)I
    .locals 1

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/h;->size()I

    move-result p0

    invoke-static {p0}, Landroidx/health/platform/client/proto/k;->D(I)I

    move-result v0

    add-int/2addr v0, p0

    return v0
.end method

.method public static x(I)I
    .locals 0

    invoke-static {p0}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result p0

    add-int/lit8 p0, p0, 0x4

    return p0
.end method

.method public static y(I)I
    .locals 0

    invoke-static {p0}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result p0

    add-int/lit8 p0, p0, 0x8

    return p0
.end method

.method public static z(ILandroidx/health/platform/client/proto/a;Landroidx/health/platform/client/proto/u2;)I
    .locals 0

    invoke-static {p0}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result p0

    mul-int/lit8 p0, p0, 0x2

    invoke-virtual {p1, p2}, Landroidx/health/platform/client/proto/a;->b(Landroidx/health/platform/client/proto/u2;)I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method


# virtual methods
.method public final F(B)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Landroidx/health/platform/client/proto/k;->d:[B

    iget v1, p0, Landroidx/health/platform/client/proto/k;->f:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Landroidx/health/platform/client/proto/k;->f:I

    aput-byte p1, v0, v1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Landroidx/health/platform/client/proto/CodedOutputStream$OutOfSpaceException;

    iget v1, p0, Landroidx/health/platform/client/proto/k;->f:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Landroidx/health/platform/client/proto/k;->e:I

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

    invoke-direct {v0, v1, p1}, Landroidx/health/platform/client/proto/CodedOutputStream$OutOfSpaceException;-><init>(Ljava/lang/String;Ljava/lang/IndexOutOfBoundsException;)V

    throw v0
.end method

.method public final G([BII)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Landroidx/health/platform/client/proto/k;->d:[B

    iget v1, p0, Landroidx/health/platform/client/proto/k;->f:I

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Landroidx/health/platform/client/proto/k;->f:I

    add-int/2addr p1, p3

    iput p1, p0, Landroidx/health/platform/client/proto/k;->f:I
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Landroidx/health/platform/client/proto/CodedOutputStream$OutOfSpaceException;

    iget v0, p0, Landroidx/health/platform/client/proto/k;->f:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Landroidx/health/platform/client/proto/k;->e:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    filled-new-array {v0, v1, p3}, [Ljava/lang/Object;

    move-result-object p3

    const-string v0, "Pos: %d, limit: %d, len: %d"

    invoke-static {v0, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Landroidx/health/platform/client/proto/CodedOutputStream$OutOfSpaceException;-><init>(Ljava/lang/String;Ljava/lang/IndexOutOfBoundsException;)V

    throw p2
.end method

.method public final H(Landroidx/health/platform/client/proto/h;)V
    .locals 2

    invoke-virtual {p1}, Landroidx/health/platform/client/proto/h;->size()I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/health/platform/client/proto/k;->P(I)V

    iget-object v0, p1, Landroidx/health/platform/client/proto/h;->x:[B

    invoke-virtual {p1}, Landroidx/health/platform/client/proto/h;->e()I

    move-result v1

    invoke-virtual {p1}, Landroidx/health/platform/client/proto/h;->size()I

    move-result p1

    invoke-virtual {p0, v0, v1, p1}, Landroidx/health/platform/client/proto/k;->G([BII)V

    return-void
.end method

.method public final I(II)V
    .locals 1

    const/4 v0, 0x5

    invoke-virtual {p0, p1, v0}, Landroidx/health/platform/client/proto/k;->O(II)V

    invoke-virtual {p0, p2}, Landroidx/health/platform/client/proto/k;->J(I)V

    return-void
.end method

.method public final J(I)V
    .locals 5

    :try_start_0
    iget-object v0, p0, Landroidx/health/platform/client/proto/k;->d:[B

    iget v1, p0, Landroidx/health/platform/client/proto/k;->f:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Landroidx/health/platform/client/proto/k;->f:I

    and-int/lit16 v3, p1, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    add-int/lit8 v3, v1, 0x2

    iput v3, p0, Landroidx/health/platform/client/proto/k;->f:I

    shr-int/lit8 v4, p1, 0x8

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v0, v2

    add-int/lit8 v2, v1, 0x3

    iput v2, p0, Landroidx/health/platform/client/proto/k;->f:I

    shr-int/lit8 v4, p1, 0x10

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v0, v3

    add-int/lit8 v1, v1, 0x4

    iput v1, p0, Landroidx/health/platform/client/proto/k;->f:I

    shr-int/lit8 p1, p1, 0x18

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v0, v2
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Landroidx/health/platform/client/proto/CodedOutputStream$OutOfSpaceException;

    iget v1, p0, Landroidx/health/platform/client/proto/k;->f:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Landroidx/health/platform/client/proto/k;->e:I

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

    invoke-direct {v0, v1, p1}, Landroidx/health/platform/client/proto/CodedOutputStream$OutOfSpaceException;-><init>(Ljava/lang/String;Ljava/lang/IndexOutOfBoundsException;)V

    throw v0
.end method

.method public final K(IJ)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Landroidx/health/platform/client/proto/k;->O(II)V

    invoke-virtual {p0, p2, p3}, Landroidx/health/platform/client/proto/k;->L(J)V

    return-void
.end method

.method public final L(J)V
    .locals 7

    :try_start_0
    iget-object v0, p0, Landroidx/health/platform/client/proto/k;->d:[B

    iget v1, p0, Landroidx/health/platform/client/proto/k;->f:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Landroidx/health/platform/client/proto/k;->f:I

    long-to-int v3, p1

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    add-int/lit8 v3, v1, 0x2

    iput v3, p0, Landroidx/health/platform/client/proto/k;->f:I

    const/16 v4, 0x8

    shr-long v5, p1, v4

    long-to-int v5, v5

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, v0, v2

    add-int/lit8 v2, v1, 0x3

    iput v2, p0, Landroidx/health/platform/client/proto/k;->f:I

    const/16 v5, 0x10

    shr-long v5, p1, v5

    long-to-int v5, v5

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, v0, v3

    add-int/lit8 v3, v1, 0x4

    iput v3, p0, Landroidx/health/platform/client/proto/k;->f:I

    const/16 v5, 0x18

    shr-long v5, p1, v5

    long-to-int v5, v5

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, v0, v2

    add-int/lit8 v2, v1, 0x5

    iput v2, p0, Landroidx/health/platform/client/proto/k;->f:I

    const/16 v5, 0x20

    shr-long v5, p1, v5

    long-to-int v5, v5

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, v0, v3

    add-int/lit8 v3, v1, 0x6

    iput v3, p0, Landroidx/health/platform/client/proto/k;->f:I

    const/16 v5, 0x28

    shr-long v5, p1, v5

    long-to-int v5, v5

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, v0, v2

    add-int/lit8 v2, v1, 0x7

    iput v2, p0, Landroidx/health/platform/client/proto/k;->f:I

    const/16 v5, 0x30

    shr-long v5, p1, v5

    long-to-int v5, v5

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, v0, v3

    add-int/2addr v1, v4

    iput v1, p0, Landroidx/health/platform/client/proto/k;->f:I

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

    new-instance p2, Landroidx/health/platform/client/proto/CodedOutputStream$OutOfSpaceException;

    iget v0, p0, Landroidx/health/platform/client/proto/k;->f:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Landroidx/health/platform/client/proto/k;->e:I

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

    invoke-direct {p2, v0, p1}, Landroidx/health/platform/client/proto/CodedOutputStream$OutOfSpaceException;-><init>(Ljava/lang/String;Ljava/lang/IndexOutOfBoundsException;)V

    throw p2
.end method

.method public final M(I)V
    .locals 2

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Landroidx/health/platform/client/proto/k;->P(I)V

    return-void

    :cond_0
    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, Landroidx/health/platform/client/proto/k;->R(J)V

    return-void
.end method

.method public final N(Ljava/lang/String;)V
    .locals 6

    iget v0, p0, Landroidx/health/platform/client/proto/k;->f:I

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    mul-int/lit8 v1, v1, 0x3

    invoke-static {v1}, Landroidx/health/platform/client/proto/k;->D(I)I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v2}, Landroidx/health/platform/client/proto/k;->D(I)I

    move-result v2
    :try_end_0
    .catch Landroidx/health/platform/client/proto/p3; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    iget v3, p0, Landroidx/health/platform/client/proto/k;->e:I

    iget-object v4, p0, Landroidx/health/platform/client/proto/k;->d:[B

    if-ne v2, v1, :cond_0

    add-int v1, v0, v2

    :try_start_1
    iput v1, p0, Landroidx/health/platform/client/proto/k;->f:I

    sub-int/2addr v3, v1

    sget-object v5, Landroidx/health/platform/client/proto/q3;->a:Landroidx/health/platform/client/proto/z2;

    invoke-virtual {v5, p1, v4, v1, v3}, Landroidx/health/platform/client/proto/z2;->o(Ljava/lang/String;[BII)I

    move-result v1

    iput v0, p0, Landroidx/health/platform/client/proto/k;->f:I

    sub-int v3, v1, v0

    sub-int/2addr v3, v2

    invoke-virtual {p0, v3}, Landroidx/health/platform/client/proto/k;->P(I)V

    iput v1, p0, Landroidx/health/platform/client/proto/k;->f:I

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_1

    :cond_0
    invoke-static {p1}, Landroidx/health/platform/client/proto/q3;->b(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Landroidx/health/platform/client/proto/k;->P(I)V

    iget v1, p0, Landroidx/health/platform/client/proto/k;->f:I

    sub-int/2addr v3, v1

    sget-object v2, Landroidx/health/platform/client/proto/q3;->a:Landroidx/health/platform/client/proto/z2;

    invoke-virtual {v2, p1, v4, v1, v3}, Landroidx/health/platform/client/proto/z2;->o(Ljava/lang/String;[BII)I

    move-result v1

    iput v1, p0, Landroidx/health/platform/client/proto/k;->f:I
    :try_end_1
    .catch Landroidx/health/platform/client/proto/p3; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :goto_0
    new-instance v0, Landroidx/health/platform/client/proto/CodedOutputStream$OutOfSpaceException;

    invoke-direct {v0, p1}, Landroidx/health/platform/client/proto/CodedOutputStream$OutOfSpaceException;-><init>(Ljava/lang/IndexOutOfBoundsException;)V

    throw v0

    :goto_1
    iput v0, p0, Landroidx/health/platform/client/proto/k;->f:I

    sget-object v0, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v2, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!"

    sget-object v3, Landroidx/health/platform/client/proto/k;->g:Ljava/util/logging/Logger;

    invoke-virtual {v3, v0, v2, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v0, Landroidx/health/platform/client/proto/x0;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    :try_start_2
    array-length v0, p1

    invoke-virtual {p0, v0}, Landroidx/health/platform/client/proto/k;->P(I)V

    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Landroidx/health/platform/client/proto/k;->G([BII)V
    :try_end_2
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_2

    return-void

    :catch_2
    move-exception p1

    new-instance v0, Landroidx/health/platform/client/proto/CodedOutputStream$OutOfSpaceException;

    invoke-direct {v0, p1}, Landroidx/health/platform/client/proto/CodedOutputStream$OutOfSpaceException;-><init>(Ljava/lang/IndexOutOfBoundsException;)V

    throw v0
.end method

.method public final O(II)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    or-int/2addr p1, p2

    invoke-virtual {p0, p1}, Landroidx/health/platform/client/proto/k;->P(I)V

    return-void
.end method

.method public final P(I)V
    .locals 4

    :goto_0
    and-int/lit8 v0, p1, -0x80

    iget-object v1, p0, Landroidx/health/platform/client/proto/k;->d:[B

    if-nez v0, :cond_0

    :try_start_0
    iget v0, p0, Landroidx/health/platform/client/proto/k;->f:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Landroidx/health/platform/client/proto/k;->f:I

    int-to-byte p1, p1

    aput-byte p1, v1, v0

    return-void

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget v0, p0, Landroidx/health/platform/client/proto/k;->f:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Landroidx/health/platform/client/proto/k;->f:I

    and-int/lit8 v2, p1, 0x7f

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    aput-byte v2, v1, v0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    ushr-int/lit8 p1, p1, 0x7

    goto :goto_0

    :goto_1
    new-instance v0, Landroidx/health/platform/client/proto/CodedOutputStream$OutOfSpaceException;

    iget v1, p0, Landroidx/health/platform/client/proto/k;->f:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Landroidx/health/platform/client/proto/k;->e:I

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

    invoke-direct {v0, v1, p1}, Landroidx/health/platform/client/proto/CodedOutputStream$OutOfSpaceException;-><init>(Ljava/lang/String;Ljava/lang/IndexOutOfBoundsException;)V

    throw v0
.end method

.method public final Q(IJ)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/health/platform/client/proto/k;->O(II)V

    invoke-virtual {p0, p2, p3}, Landroidx/health/platform/client/proto/k;->R(J)V

    return-void
.end method

.method public final R(J)V
    .locals 10

    sget-boolean v0, Landroidx/health/platform/client/proto/k;->h:Z

    iget v1, p0, Landroidx/health/platform/client/proto/k;->e:I

    const/4 v2, 0x7

    const-wide/16 v3, 0x0

    const-wide/16 v5, -0x80

    iget-object v7, p0, Landroidx/health/platform/client/proto/k;->d:[B

    if-eqz v0, :cond_1

    iget v0, p0, Landroidx/health/platform/client/proto/k;->f:I

    sub-int v0, v1, v0

    const/16 v8, 0xa

    if-lt v0, v8, :cond_1

    :goto_0
    and-long v0, p1, v5

    cmp-long v0, v0, v3

    if-nez v0, :cond_0

    iget v0, p0, Landroidx/health/platform/client/proto/k;->f:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Landroidx/health/platform/client/proto/k;->f:I

    int-to-long v0, v0

    long-to-int p1, p1

    int-to-byte p1, p1

    invoke-static {v7, v0, v1, p1}, Landroidx/health/platform/client/proto/n3;->k([BJB)V

    return-void

    :cond_0
    iget v0, p0, Landroidx/health/platform/client/proto/k;->f:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Landroidx/health/platform/client/proto/k;->f:I

    int-to-long v0, v0

    long-to-int v8, p1

    and-int/lit8 v8, v8, 0x7f

    or-int/lit16 v8, v8, 0x80

    int-to-byte v8, v8

    invoke-static {v7, v0, v1, v8}, Landroidx/health/platform/client/proto/n3;->k([BJB)V

    ushr-long/2addr p1, v2

    goto :goto_0

    :cond_1
    :goto_1
    and-long v8, p1, v5

    cmp-long v0, v8, v3

    if-nez v0, :cond_2

    :try_start_0
    iget v0, p0, Landroidx/health/platform/client/proto/k;->f:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Landroidx/health/platform/client/proto/k;->f:I

    long-to-int p1, p1

    int-to-byte p1, p1

    aput-byte p1, v7, v0

    return-void

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_2
    iget v0, p0, Landroidx/health/platform/client/proto/k;->f:I

    add-int/lit8 v8, v0, 0x1

    iput v8, p0, Landroidx/health/platform/client/proto/k;->f:I

    long-to-int v8, p1

    and-int/lit8 v8, v8, 0x7f

    or-int/lit16 v8, v8, 0x80

    int-to-byte v8, v8

    aput-byte v8, v7, v0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    ushr-long/2addr p1, v2

    goto :goto_1

    :goto_2
    new-instance p2, Landroidx/health/platform/client/proto/CodedOutputStream$OutOfSpaceException;

    iget v0, p0, Landroidx/health/platform/client/proto/k;->f:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

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

    invoke-direct {p2, v0, p1}, Landroidx/health/platform/client/proto/CodedOutputStream$OutOfSpaceException;-><init>(Ljava/lang/String;Ljava/lang/IndexOutOfBoundsException;)V

    throw p2
.end method
