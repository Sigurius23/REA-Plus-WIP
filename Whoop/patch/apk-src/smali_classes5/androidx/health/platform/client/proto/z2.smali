.class public abstract Landroidx/health/platform/client/proto/z2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/health/platform/client/proto/x2;

.field public static final b:Landroidx/health/platform/client/proto/y2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/health/platform/client/proto/x2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/health/platform/client/proto/z2;->a:Landroidx/health/platform/client/proto/x2;

    new-instance v0, Landroidx/health/platform/client/proto/y2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/health/platform/client/proto/z2;->b:Landroidx/health/platform/client/proto/y2;

    return-void
.end method

.method public static a([BILandroidx/health/platform/client/proto/d;)I
    .locals 2

    invoke-static {p0, p1, p2}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result p1

    iget v0, p2, Landroidx/health/platform/client/proto/d;->a:I

    if-ltz v0, :cond_2

    array-length v1, p0

    sub-int/2addr v1, p1

    if-gt v0, v1, :cond_1

    if-nez v0, :cond_0

    sget-object p0, Landroidx/health/platform/client/proto/h;->y:Landroidx/health/platform/client/proto/h;

    iput-object p0, p2, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    return p1

    :cond_0
    invoke-static {p0, p1, v0}, Landroidx/health/platform/client/proto/h;->d([BII)Landroidx/health/platform/client/proto/h;

    move-result-object p0

    iput-object p0, p2, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    add-int/2addr p1, v0

    return p1

    :cond_1
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->d()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object p0

    throw p0

    :cond_2
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->b()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object p0

    throw p0
.end method

.method public static b(I[B)I
    .locals 2

    aget-byte v0, p1, p0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v1, p0, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 v1, p0, 0x2

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 p0, p0, 0x3

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x18

    or-int/2addr p0, v0

    return p0
.end method

.method public static c(I[B)J
    .locals 7

    aget-byte v0, p1, p0

    int-to-long v0, v0

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    add-int/lit8 v4, p0, 0x1

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x8

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 v4, p0, 0x2

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x10

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 v4, p0, 0x3

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x18

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 v4, p0, 0x4

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x20

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 v4, p0, 0x5

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x28

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 v4, p0, 0x6

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x30

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 p0, p0, 0x7

    aget-byte p0, p1, p0

    int-to-long p0, p0

    and-long/2addr p0, v2

    const/16 v2, 0x38

    shl-long/2addr p0, v2

    or-long/2addr p0, v0

    return-wide p0
.end method

.method public static d(Landroidx/health/platform/client/proto/u2;I[BIILandroidx/health/platform/client/proto/w0;Landroidx/health/platform/client/proto/d;)I
    .locals 7

    invoke-interface {p0}, Landroidx/health/platform/client/proto/u2;->d()Landroidx/health/platform/client/proto/u0;

    move-result-object v0

    move-object v1, p0

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p6

    invoke-static/range {v0 .. v5}, Landroidx/health/platform/client/proto/z2;->s(Ljava/lang/Object;Landroidx/health/platform/client/proto/u2;[BIILandroidx/health/platform/client/proto/d;)I

    move-result p0

    invoke-interface {v1, v0}, Landroidx/health/platform/client/proto/u2;->b(Ljava/lang/Object;)V

    iput-object v0, v5, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    invoke-interface {p5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    if-ge p0, v4, :cond_1

    move-object v6, v5

    move v5, v4

    invoke-static {v2, p0, v6}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v4

    iget p2, v6, Landroidx/health/platform/client/proto/d;->a:I

    if-eq p1, p2, :cond_0

    goto :goto_1

    :cond_0
    move-object v3, v2

    move-object v2, v1

    invoke-interface {v2}, Landroidx/health/platform/client/proto/u2;->d()Landroidx/health/platform/client/proto/u0;

    move-result-object v1

    invoke-static/range {v1 .. v6}, Landroidx/health/platform/client/proto/z2;->s(Ljava/lang/Object;Landroidx/health/platform/client/proto/u2;[BIILandroidx/health/platform/client/proto/d;)I

    move-result p0

    move-object p2, v1

    move-object v1, v2

    move-object v2, v3

    move v4, v5

    move-object v5, v6

    invoke-interface {v1, p2}, Landroidx/health/platform/client/proto/u2;->b(Ljava/lang/Object;)V

    iput-object p2, v5, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    invoke-interface {p5, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    :goto_1
    return p0
.end method

.method public static e([BILandroidx/health/platform/client/proto/d;)I
    .locals 3

    invoke-static {p0, p1, p2}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result p1

    iget v0, p2, Landroidx/health/platform/client/proto/d;->a:I

    if-ltz v0, :cond_1

    if-nez v0, :cond_0

    const-string p0, ""

    iput-object p0, p2, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    return p1

    :cond_0
    new-instance v1, Ljava/lang/String;

    sget-object v2, Landroidx/health/platform/client/proto/x0;->a:Ljava/nio/charset/Charset;

    invoke-direct {v1, p0, p1, v0, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    iput-object v1, p2, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    add-int/2addr p1, v0

    return p1

    :cond_1
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->b()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object p0

    throw p0
.end method

.method public static f([BILandroidx/health/platform/client/proto/d;)I
    .locals 2

    invoke-static {p0, p1, p2}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result p1

    iget v0, p2, Landroidx/health/platform/client/proto/d;->a:I

    if-ltz v0, :cond_1

    if-nez v0, :cond_0

    const-string p0, ""

    iput-object p0, p2, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    return p1

    :cond_0
    sget-object v1, Landroidx/health/platform/client/proto/q3;->a:Landroidx/health/platform/client/proto/z2;

    invoke-virtual {v1, p0, p1, v0}, Landroidx/health/platform/client/proto/z2;->h([BII)Ljava/lang/String;

    move-result-object p0

    iput-object p0, p2, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    add-int/2addr p1, v0

    return p1

    :cond_1
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->b()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object p0

    throw p0
.end method

.method public static g(I[BIILandroidx/health/platform/client/proto/e3;Landroidx/health/platform/client/proto/d;)I
    .locals 8

    ushr-int/lit8 v0, p0, 0x3

    const-string v1, "Protocol message contained an invalid tag (zero)."

    if-eqz v0, :cond_b

    and-int/lit8 v0, p0, 0x7

    if-eqz v0, :cond_a

    const/4 v2, 0x1

    if-eq v0, v2, :cond_9

    const/4 v2, 0x2

    if-eq v0, v2, :cond_5

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    const/4 p3, 0x5

    if-ne v0, p3, :cond_0

    invoke-static {p2, p1}, Landroidx/health/platform/client/proto/z2;->b(I[B)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p4, p0, p1}, Landroidx/health/platform/client/proto/e3;->d(ILjava/lang/Object;)V

    add-int/lit8 p2, p2, 0x4

    return p2

    :cond_0
    new-instance p0, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    invoke-direct {p0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {}, Landroidx/health/platform/client/proto/e3;->c()Landroidx/health/platform/client/proto/e3;

    move-result-object v6

    and-int/lit8 v0, p0, -0x8

    or-int/lit8 v0, v0, 0x4

    const/4 v1, 0x0

    :goto_0
    if-ge p2, p3, :cond_2

    invoke-static {p1, p2, p5}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v4

    iget v2, p5, Landroidx/health/platform/client/proto/d;->a:I

    if-ne v2, v0, :cond_3

    move v1, v2

    move p2, v4

    :cond_2
    move v5, p3

    goto :goto_1

    :cond_3
    move-object v3, p1

    move v5, p3

    move-object v7, p5

    invoke-static/range {v2 .. v7}, Landroidx/health/platform/client/proto/z2;->g(I[BIILandroidx/health/platform/client/proto/e3;Landroidx/health/platform/client/proto/d;)I

    move-result p2

    move v1, v2

    goto :goto_0

    :goto_1
    if-gt p2, v5, :cond_4

    if-ne v1, v0, :cond_4

    invoke-virtual {p4, p0, v6}, Landroidx/health/platform/client/proto/e3;->d(ILjava/lang/Object;)V

    return p2

    :cond_4
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->c()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object p0

    throw p0

    :cond_5
    move-object v3, p1

    move-object v7, p5

    invoke-static {v3, p2, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result p1

    iget p2, v7, Landroidx/health/platform/client/proto/d;->a:I

    if-ltz p2, :cond_8

    array-length p3, v3

    sub-int/2addr p3, p1

    if-gt p2, p3, :cond_7

    if-nez p2, :cond_6

    sget-object p3, Landroidx/health/platform/client/proto/h;->y:Landroidx/health/platform/client/proto/h;

    invoke-virtual {p4, p0, p3}, Landroidx/health/platform/client/proto/e3;->d(ILjava/lang/Object;)V

    goto :goto_2

    :cond_6
    invoke-static {v3, p1, p2}, Landroidx/health/platform/client/proto/h;->d([BII)Landroidx/health/platform/client/proto/h;

    move-result-object p3

    invoke-virtual {p4, p0, p3}, Landroidx/health/platform/client/proto/e3;->d(ILjava/lang/Object;)V

    :goto_2
    add-int/2addr p1, p2

    return p1

    :cond_7
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->d()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object p0

    throw p0

    :cond_8
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->b()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object p0

    throw p0

    :cond_9
    move-object v3, p1

    invoke-static {p2, v3}, Landroidx/health/platform/client/proto/z2;->c(I[B)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p4, p0, p1}, Landroidx/health/platform/client/proto/e3;->d(ILjava/lang/Object;)V

    add-int/lit8 p2, p2, 0x8

    return p2

    :cond_a
    move-object v3, p1

    move-object v7, p5

    invoke-static {v3, p2, v7}, Landroidx/health/platform/client/proto/z2;->l([BILandroidx/health/platform/client/proto/d;)I

    move-result p1

    iget-wide p2, v7, Landroidx/health/platform/client/proto/d;->b:J

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p4, p0, p2}, Landroidx/health/platform/client/proto/e3;->d(ILjava/lang/Object;)V

    return p1

    :cond_b
    new-instance p0, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    invoke-direct {p0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static i(I[BILandroidx/health/platform/client/proto/d;)I
    .locals 2

    and-int/lit8 p0, p0, 0x7f

    add-int/lit8 v0, p2, 0x1

    aget-byte v1, p1, p2

    if-ltz v1, :cond_0

    shl-int/lit8 p1, v1, 0x7

    or-int/2addr p0, p1

    iput p0, p3, Landroidx/health/platform/client/proto/d;->a:I

    return v0

    :cond_0
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0x7

    or-int/2addr p0, v1

    add-int/lit8 v1, p2, 0x2

    aget-byte v0, p1, v0

    if-ltz v0, :cond_1

    shl-int/lit8 p1, v0, 0xe

    or-int/2addr p0, p1

    iput p0, p3, Landroidx/health/platform/client/proto/d;->a:I

    return v1

    :cond_1
    and-int/lit8 v0, v0, 0x7f

    shl-int/lit8 v0, v0, 0xe

    or-int/2addr p0, v0

    add-int/lit8 v0, p2, 0x3

    aget-byte v1, p1, v1

    if-ltz v1, :cond_2

    shl-int/lit8 p1, v1, 0x15

    or-int/2addr p0, p1

    iput p0, p3, Landroidx/health/platform/client/proto/d;->a:I

    return v0

    :cond_2
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0x15

    or-int/2addr p0, v1

    add-int/lit8 p2, p2, 0x4

    aget-byte v0, p1, v0

    if-ltz v0, :cond_3

    shl-int/lit8 p1, v0, 0x1c

    or-int/2addr p0, p1

    iput p0, p3, Landroidx/health/platform/client/proto/d;->a:I

    return p2

    :cond_3
    and-int/lit8 v0, v0, 0x7f

    shl-int/lit8 v0, v0, 0x1c

    or-int/2addr p0, v0

    :goto_0
    add-int/lit8 v0, p2, 0x1

    aget-byte p2, p1, p2

    if-gez p2, :cond_4

    move p2, v0

    goto :goto_0

    :cond_4
    iput p0, p3, Landroidx/health/platform/client/proto/d;->a:I

    return v0
.end method

.method public static j([BILandroidx/health/platform/client/proto/d;)I
    .locals 1

    add-int/lit8 v0, p1, 0x1

    aget-byte p1, p0, p1

    if-ltz p1, :cond_0

    iput p1, p2, Landroidx/health/platform/client/proto/d;->a:I

    return v0

    :cond_0
    invoke-static {p1, p0, v0, p2}, Landroidx/health/platform/client/proto/z2;->i(I[BILandroidx/health/platform/client/proto/d;)I

    move-result p0

    return p0
.end method

.method public static k(I[BIILandroidx/health/platform/client/proto/w0;Landroidx/health/platform/client/proto/d;)I
    .locals 2

    check-cast p4, Landroidx/health/platform/client/proto/v0;

    invoke-static {p1, p2, p5}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result p2

    iget v0, p5, Landroidx/health/platform/client/proto/d;->a:I

    invoke-virtual {p4, v0}, Landroidx/health/platform/client/proto/v0;->c(I)V

    :goto_0
    if-ge p2, p3, :cond_1

    invoke-static {p1, p2, p5}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v0

    iget v1, p5, Landroidx/health/platform/client/proto/d;->a:I

    if-eq p0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1, v0, p5}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result p2

    iget v0, p5, Landroidx/health/platform/client/proto/d;->a:I

    invoke-virtual {p4, v0}, Landroidx/health/platform/client/proto/v0;->c(I)V

    goto :goto_0

    :cond_1
    :goto_1
    return p2
.end method

.method public static l([BILandroidx/health/platform/client/proto/d;)I
    .locals 9

    add-int/lit8 v0, p1, 0x1

    aget-byte v1, p0, p1

    int-to-long v1, v1

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-ltz v3, :cond_0

    iput-wide v1, p2, Landroidx/health/platform/client/proto/d;->b:J

    return v0

    :cond_0
    const-wide/16 v3, 0x7f

    and-long/2addr v1, v3

    add-int/lit8 p1, p1, 0x2

    aget-byte v0, p0, v0

    and-int/lit8 v3, v0, 0x7f

    int-to-long v3, v3

    const/4 v5, 0x7

    shl-long/2addr v3, v5

    or-long/2addr v1, v3

    move v3, v5

    :goto_0
    if-gez v0, :cond_1

    add-int/lit8 v0, p1, 0x1

    aget-byte p1, p0, p1

    add-int/2addr v3, v5

    and-int/lit8 v4, p1, 0x7f

    int-to-long v6, v4

    shl-long/2addr v6, v3

    or-long/2addr v1, v6

    move v8, v0

    move v0, p1

    move p1, v8

    goto :goto_0

    :cond_1
    iput-wide v1, p2, Landroidx/health/platform/client/proto/d;->b:J

    return p1
.end method

.method public static m(I)I
    .locals 1

    ushr-int/lit8 v0, p0, 0x1

    and-int/lit8 p0, p0, 0x1

    neg-int p0, p0

    xor-int/2addr p0, v0

    return p0
.end method

.method public static n(J)J
    .locals 4

    const/4 v0, 0x1

    ushr-long v0, p0, v0

    const-wide/16 v2, 0x1

    and-long/2addr p0, v2

    neg-long p0, p0

    xor-long/2addr p0, v0

    return-wide p0
.end method

.method public static p(Landroidx/health/platform/client/proto/h;)Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/h;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Landroidx/health/platform/client/proto/h;->size()I

    move-result v2

    if-ge v1, v2, :cond_4

    invoke-virtual {p0, v1}, Landroidx/health/platform/client/proto/h;->a(I)B

    move-result v2

    const/16 v3, 0x22

    if-eq v2, v3, :cond_3

    const/16 v3, 0x27

    if-eq v2, v3, :cond_2

    const/16 v3, 0x5c

    if-eq v2, v3, :cond_1

    packed-switch v2, :pswitch_data_0

    const/16 v4, 0x20

    if-lt v2, v4, :cond_0

    const/16 v4, 0x7e

    if-gt v2, v4, :cond_0

    int-to-char v2, v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    ushr-int/lit8 v3, v2, 0x6

    and-int/lit8 v3, v3, 0x3

    add-int/lit8 v3, v3, 0x30

    int-to-char v3, v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    ushr-int/lit8 v3, v2, 0x3

    and-int/lit8 v3, v3, 0x7

    add-int/lit8 v3, v3, 0x30

    int-to-char v3, v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 v2, v2, 0x7

    add-int/lit8 v2, v2, 0x30

    int-to-char v2, v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_0
    const-string v2, "\\r"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_1
    const-string v2, "\\f"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_2
    const-string v2, "\\v"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_3
    const-string v2, "\\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_4
    const-string v2, "\\t"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_5
    const-string v2, "\\b"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_6
    const-string v2, "\\a"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string v2, "\\\\"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    const-string v2, "\\\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_3
    const-string v2, "\\\""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static q(B)Z
    .locals 1

    const/16 v0, -0x41

    if-le p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static s(Ljava/lang/Object;Landroidx/health/platform/client/proto/u2;[BIILandroidx/health/platform/client/proto/d;)I
    .locals 6

    add-int/lit8 v0, p3, 0x1

    aget-byte p3, p2, p3

    if-gez p3, :cond_0

    invoke-static {p3, p2, v0, p5}, Landroidx/health/platform/client/proto/z2;->i(I[BILandroidx/health/platform/client/proto/d;)I

    move-result v0

    iget p3, p5, Landroidx/health/platform/client/proto/d;->a:I

    :cond_0
    move v3, v0

    if-ltz p3, :cond_1

    sub-int/2addr p4, v3

    if-gt p3, p4, :cond_1

    add-int v4, v3, p3

    move-object v1, p0

    move-object v0, p1

    move-object v2, p2

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Landroidx/health/platform/client/proto/u2;->e(Ljava/lang/Object;[BIILandroidx/health/platform/client/proto/d;)V

    iput-object v1, v5, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    return v4

    :cond_1
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->d()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object p0

    throw p0
.end method

.method public static u(I[BIILandroidx/health/platform/client/proto/d;)I
    .locals 3

    ushr-int/lit8 v0, p0, 0x3

    const-string v1, "Protocol message contained an invalid tag (zero)."

    if-eqz v0, :cond_8

    and-int/lit8 v0, p0, 0x7

    if-eqz v0, :cond_7

    const/4 v2, 0x1

    if-eq v0, v2, :cond_6

    const/4 v2, 0x2

    if-eq v0, v2, :cond_5

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    const/4 p0, 0x5

    if-ne v0, p0, :cond_0

    add-int/lit8 p2, p2, 0x4

    return p2

    :cond_0
    new-instance p0, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    invoke-direct {p0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    and-int/lit8 p0, p0, -0x8

    or-int/lit8 p0, p0, 0x4

    const/4 v0, 0x0

    :goto_0
    if-ge p2, p3, :cond_3

    invoke-static {p1, p2, p4}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result p2

    iget v0, p4, Landroidx/health/platform/client/proto/d;->a:I

    if-ne v0, p0, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v0, p1, p2, p3, p4}, Landroidx/health/platform/client/proto/z2;->u(I[BIILandroidx/health/platform/client/proto/d;)I

    move-result p2

    goto :goto_0

    :cond_3
    :goto_1
    if-gt p2, p3, :cond_4

    if-ne v0, p0, :cond_4

    return p2

    :cond_4
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->c()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object p0

    throw p0

    :cond_5
    invoke-static {p1, p2, p4}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result p0

    iget p1, p4, Landroidx/health/platform/client/proto/d;->a:I

    add-int/2addr p0, p1

    return p0

    :cond_6
    add-int/lit8 p2, p2, 0x8

    return p2

    :cond_7
    invoke-static {p1, p2, p4}, Landroidx/health/platform/client/proto/z2;->l([BILandroidx/health/platform/client/proto/d;)I

    move-result p0

    return p0

    :cond_8
    new-instance p0, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    invoke-direct {p0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract h([BII)Ljava/lang/String;
.end method

.method public abstract o(Ljava/lang/String;[BII)I
.end method

.method public r([BII)Z
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroidx/health/platform/client/proto/z2;->t([BII)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public abstract t([BII)I
.end method
