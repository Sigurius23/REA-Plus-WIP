.class public final Lmp/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final w:Ljava/io/ByteArrayInputStream;

.field public x:Lmp/c1;

.field public final y:[B

.field public final z:Lla/b;


# direct methods
.method public constructor <init>(Ljava/io/ByteArrayInputStream;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    new-array v0, v0, [B

    iput-object v0, p0, Lmp/d1;->y:[B

    new-instance v0, Lla/b;

    const/16 v1, 0x9

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lla/b;-><init>(IB)V

    iput-object v0, p0, Lmp/d1;->z:Lla/b;

    iput-object p1, p0, Lmp/d1;->w:Ljava/io/ByteArrayInputStream;

    return-void
.end method


# virtual methods
.method public final J(B)V
    .locals 4

    invoke-virtual {p0}, Lmp/d1;->k()Lmp/c1;

    iget-object v0, p0, Lmp/d1;->x:Lmp/c1;

    iget-byte v0, v0, Lmp/c1;->a:B

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    shr-int/lit8 p1, p1, 0x5

    new-instance v0, Ljava/lang/IllegalStateException;

    and-int/lit8 p1, p1, 0x7

    iget-object v1, p0, Lmp/d1;->x:Lmp/c1;

    iget-byte v1, v1, Lmp/c1;->a:B

    shr-int/lit8 v1, v1, 0x5

    and-int/lit8 v1, v1, 0x7

    const-string v2, "expected major type "

    const-string v3, " but found "

    invoke-static {p1, v1, v2, v3}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final T(I[B)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    if-eq v0, p1, :cond_1

    iget-object v1, p0, Lmp/d1;->w:Ljava/io/ByteArrayInputStream;

    sub-int v2, p1, v0

    invoke-virtual {v1, p2, v0, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Lmp/d1;->x:Lmp/c1;

    return-void
.end method

.method public final a0()[B
    .locals 4

    invoke-virtual {p0}, Lmp/d1;->x()V

    invoke-virtual {p0}, Lmp/d1;->s()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_1

    const-wide/32 v2, 0x7fffffff

    cmp-long v2, v0, v2

    if-gtz v2, :cond_1

    iget-object v2, p0, Lmp/d1;->w:Ljava/io/ByteArrayInputStream;

    invoke-virtual {v2}, Ljava/io/InputStream;->available()I

    move-result v2

    int-to-long v2, v2

    cmp-long v2, v2, v0

    if-ltz v2, :cond_0

    long-to-int v0, v0

    new-array v1, v0, [B

    invoke-virtual {p0, v0, v1}, Lmp/d1;->T(I[B)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "the maximum supported byte/text string length is 2147483647 bytes"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()J
    .locals 4

    const/16 v0, -0x80

    invoke-virtual {p0, v0}, Lmp/d1;->J(B)V

    invoke-virtual {p0}, Lmp/d1;->x()V

    invoke-virtual {p0}, Lmp/d1;->s()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_1

    if-lez v2, :cond_0

    iget-object v2, p0, Lmp/d1;->z:Lla/b;

    iget-object v2, v2, Lla/b;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayDeque;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    :cond_0
    return-wide v0

    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "the maximum supported array length is 9223372036854775807"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lmp/d1;->w:Ljava/io/ByteArrayInputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    iget-object v0, p0, Lmp/d1;->z:Lla/b;

    invoke-virtual {v0}, Lla/b;->I()V

    return-void
.end method

.method public final h()J
    .locals 5

    invoke-virtual {p0}, Lmp/d1;->k()Lmp/c1;

    iget-object v0, p0, Lmp/d1;->x:Lmp/c1;

    iget-byte v0, v0, Lmp/c1;->a:B

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/16 v1, 0x20

    if-ne v0, v1, :cond_3

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lmp/d1;->s()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-ltz v3, :cond_2

    if-eqz v0, :cond_1

    return-wide v1

    :cond_1
    not-long v0, v1

    return-wide v0

    :cond_2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "the maximum supported unsigned/negative integer is 9223372036854775807"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    iget-object v1, p0, Lmp/d1;->x:Lmp/c1;

    iget-byte v1, v1, Lmp/c1;->a:B

    shr-int/lit8 v1, v1, 0x5

    and-int/lit8 v1, v1, 0x7

    const-string v2, "expected major type 0 or 1 but found "

    invoke-static {v1, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final i()J
    .locals 5

    const/16 v0, -0x60

    invoke-virtual {p0, v0}, Lmp/d1;->J(B)V

    invoke-virtual {p0}, Lmp/d1;->x()V

    invoke-virtual {p0}, Lmp/d1;->s()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_1

    const-wide v3, 0x3fffffffffffffffL    # 1.9999999999999998

    cmp-long v3, v0, v3

    if-gtz v3, :cond_1

    if-lez v2, :cond_0

    add-long v2, v0, v0

    iget-object v4, p0, Lmp/d1;->z:Lla/b;

    iget-object v4, v4, Lla/b;->x:Ljava/lang/Object;

    check-cast v4, Ljava/util/ArrayDeque;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    :cond_0
    return-wide v0

    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "the maximum supported map length is 4611686018427387903L"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final k()Lmp/c1;
    .locals 10

    iget-object v0, p0, Lmp/d1;->x:Lmp/c1;

    if-nez v0, :cond_c

    iget-object v0, p0, Lmp/d1;->w:Ljava/io/ByteArrayInputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    const/4 v1, -0x1

    iget-object v2, p0, Lmp/d1;->z:Lla/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {v2}, Lla/b;->I()V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v1, Lmp/c1;

    invoke-direct {v1, v0}, Lmp/c1;-><init>(I)V

    iput-object v1, p0, Lmp/d1;->x:Lmp/c1;

    const/16 v0, -0x80

    const-wide/16 v3, -0x5

    const-wide/16 v5, -0x2

    const-wide/16 v7, -0x1

    iget-byte v9, v1, Lmp/c1;->a:B

    if-eq v9, v0, :cond_6

    const/16 v0, -0x60

    if-eq v9, v0, :cond_6

    const/16 v0, -0x40

    if-eq v9, v0, :cond_6

    const/16 v0, -0x20

    if-eq v9, v0, :cond_3

    if-eqz v9, :cond_6

    const/16 v0, 0x20

    if-eq v9, v0, :cond_6

    const/16 v0, 0x40

    if-eq v9, v0, :cond_2

    const/16 v0, 0x60

    if-ne v9, v0, :cond_1

    invoke-virtual {v2, v5, v6}, Lla/b;->J(J)V

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    iget-object v1, p0, Lmp/d1;->x:Lmp/c1;

    iget-byte v1, v1, Lmp/c1;->a:B

    shr-int/lit8 v1, v1, 0x5

    and-int/lit8 v1, v1, 0x7

    const-string v2, "invalid major type: "

    invoke-static {v1, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-virtual {v2, v7, v8}, Lla/b;->J(J)V

    goto :goto_0

    :cond_3
    iget-byte v0, v1, Lmp/c1;->b:B

    const/16 v1, 0x1f

    if-ne v0, v1, :cond_6

    invoke-virtual {v2}, Lla/b;->K()J

    move-result-wide v0

    const-wide/16 v5, 0x0

    cmp-long v5, v0, v5

    if-gez v5, :cond_5

    cmp-long v0, v0, v3

    if-eqz v0, :cond_4

    iget-object v0, v2, Lla/b;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    goto/16 :goto_1

    :cond_4
    new-instance v0, Ljava/io/IOException;

    const-string v1, "expected a value for dangling key in indefinite-length map"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    const-string v2, "expected indefinite length scope but found "

    invoke-static {v0, v1, v2}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6
    invoke-virtual {v2}, Lla/b;->K()J

    move-result-wide v0

    cmp-long v9, v0, v7

    if-eqz v9, :cond_a

    cmp-long v0, v0, v5

    if-eqz v0, :cond_b

    :goto_0
    invoke-virtual {v2}, Lla/b;->K()J

    move-result-wide v0

    iget-object v2, v2, Lla/b;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayDeque;

    const-wide/16 v5, 0x1

    cmp-long v5, v0, v5

    if-nez v5, :cond_7

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    goto :goto_1

    :cond_7
    if-lez v5, :cond_8

    add-long/2addr v0, v7

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_1

    :cond_8
    const-wide/16 v5, -0x4

    cmp-long v7, v0, v5

    if-nez v7, :cond_9

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_1

    :cond_9
    cmp-long v0, v0, v3

    if-nez v0, :cond_c

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_1

    :cond_a
    move-wide v5, v0

    :cond_b
    const-string v0, "expected non-string scope but found "

    invoke-static {v5, v6, v0}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_c
    :goto_1
    iget-object v0, p0, Lmp/d1;->x:Lmp/c1;

    return-object v0
.end method

.method public final m()Z
    .locals 2

    const/16 v0, -0x20

    invoke-virtual {p0, v0}, Lmp/d1;->J(B)V

    iget-object v0, p0, Lmp/d1;->x:Lmp/c1;

    iget-byte v0, v0, Lmp/c1;->b:B

    const/16 v1, 0x18

    if-gt v0, v1, :cond_2

    invoke-virtual {p0}, Lmp/d1;->s()J

    move-result-wide v0

    long-to-int v0, v0

    const/16 v1, 0x14

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/16 v1, 0x15

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "expected FALSE or TRUE"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "expected simple value"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final s()J
    .locals 24

    move-object/from16 v0, p0

    iget-object v1, v0, Lmp/d1;->x:Lmp/c1;

    iget-byte v1, v1, Lmp/c1;->b:B

    const/4 v2, 0x0

    const/16 v3, 0x18

    if-ge v1, v3, :cond_0

    int-to-long v3, v1

    iput-object v2, v0, Lmp/d1;->x:Lmp/c1;

    return-wide v3

    :cond_0
    const-wide/16 v4, 0xff

    if-ne v1, v3, :cond_2

    iget-object v1, v0, Lmp/d1;->w:Ljava/io/ByteArrayInputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->read()I

    move-result v1

    const/4 v3, -0x1

    if-eq v1, v3, :cond_1

    iput-object v2, v0, Lmp/d1;->x:Lmp/c1;

    int-to-long v1, v1

    and-long/2addr v1, v4

    return-wide v1

    :cond_1
    new-instance v1, Ljava/io/EOFException;

    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    throw v1

    :cond_2
    const/16 v2, 0x19

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/16 v9, 0x8

    iget-object v10, v0, Lmp/d1;->y:[B

    if-ne v1, v2, :cond_3

    invoke-virtual {v0, v8, v10}, Lmp/d1;->T(I[B)V

    aget-byte v1, v10, v7

    int-to-long v1, v1

    aget-byte v3, v10, v6

    int-to-long v6, v3

    and-long/2addr v1, v4

    shl-long/2addr v1, v9

    and-long v3, v6, v4

    or-long/2addr v1, v3

    return-wide v1

    :cond_3
    const/16 v2, 0x1a

    const/16 v11, 0x10

    const/4 v12, 0x3

    const/4 v13, 0x4

    if-ne v1, v2, :cond_4

    invoke-virtual {v0, v13, v10}, Lmp/d1;->T(I[B)V

    aget-byte v1, v10, v7

    int-to-long v1, v1

    aget-byte v6, v10, v6

    int-to-long v6, v6

    aget-byte v8, v10, v8

    int-to-long v13, v8

    aget-byte v8, v10, v12

    move v15, v3

    move-wide/from16 v16, v4

    int-to-long v3, v8

    and-long v1, v1, v16

    shl-long/2addr v1, v15

    and-long v5, v6, v16

    and-long v7, v13, v16

    shl-long/2addr v5, v11

    or-long/2addr v1, v5

    shl-long v5, v7, v9

    or-long/2addr v1, v5

    and-long v3, v3, v16

    or-long/2addr v1, v3

    return-wide v1

    :cond_4
    move v15, v3

    move-wide/from16 v16, v4

    const/16 v2, 0x1b

    if-ne v1, v2, :cond_5

    invoke-virtual {v0, v9, v10}, Lmp/d1;->T(I[B)V

    aget-byte v1, v10, v7

    int-to-long v1, v1

    aget-byte v5, v10, v6

    int-to-long v5, v5

    aget-byte v7, v10, v8

    int-to-long v7, v7

    aget-byte v12, v10, v12

    const/4 v14, 0x7

    const/16 v18, 0x5

    int-to-long v3, v12

    aget-byte v12, v10, v13

    int-to-long v12, v12

    move/from16 v19, v9

    aget-byte v9, v10, v18

    move/from16 v20, v11

    move-wide/from16 v21, v12

    int-to-long v11, v9

    const/4 v9, 0x6

    aget-byte v9, v10, v9

    move/from16 v23, v14

    move v13, v15

    int-to-long v14, v9

    aget-byte v9, v10, v23

    int-to-long v9, v9

    and-long v21, v21, v16

    shl-long v21, v21, v13

    and-long v1, v1, v16

    and-long v5, v5, v16

    and-long v7, v7, v16

    and-long v3, v3, v16

    and-long v11, v11, v16

    and-long v13, v14, v16

    const/16 v15, 0x38

    shl-long/2addr v1, v15

    const/16 v15, 0x30

    shl-long/2addr v5, v15

    or-long/2addr v1, v5

    const/16 v5, 0x28

    shl-long v5, v7, v5

    or-long/2addr v1, v5

    const/16 v5, 0x20

    shl-long/2addr v3, v5

    or-long/2addr v1, v3

    or-long v1, v1, v21

    shl-long v3, v11, v20

    or-long/2addr v1, v3

    shl-long v3, v13, v19

    or-long/2addr v1, v3

    and-long v3, v9, v16

    or-long/2addr v1, v3

    return-wide v1

    :cond_5
    const/16 v18, 0x5

    const/16 v23, 0x7

    new-instance v1, Ljava/io/IOException;

    iget-object v2, v0, Lmp/d1;->x:Lmp/c1;

    iget-byte v3, v2, Lmp/c1;->b:B

    iget-byte v2, v2, Lmp/c1;->a:B

    shr-int/lit8 v2, v2, 0x5

    and-int/lit8 v2, v2, 0x7

    const-string v4, "invalid additional information "

    const-string v5, " for major type "

    invoke-static {v3, v2, v4, v5}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final x()V
    .locals 3

    invoke-virtual {p0}, Lmp/d1;->k()Lmp/c1;

    iget-object v0, p0, Lmp/d1;->x:Lmp/c1;

    iget-byte v0, v0, Lmp/c1;->b:B

    const/16 v1, 0x1f

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    iget-object v1, p0, Lmp/d1;->x:Lmp/c1;

    iget-byte v1, v1, Lmp/c1;->b:B

    const-string v2, "expected definite length but found "

    invoke-static {v1, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
