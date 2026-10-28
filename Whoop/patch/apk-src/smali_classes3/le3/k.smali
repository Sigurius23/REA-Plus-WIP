.class public final Lle3/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final E:J

.field public final F:Lne3/h;

.field public final G:Lne3/h;

.field public H:Z

.field public I:Lle3/a;

.field public final J:[B

.field public final K:Lne3/f;

.field public final w:Lne3/i;

.field public final x:Ljava/util/Random;

.field public final y:Z

.field public final z:Z


# direct methods
.method public constructor <init>(Lne3/i;Ljava/util/Random;ZZJ)V
    .locals 1

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lle3/k;->w:Lne3/i;

    iput-object p2, p0, Lle3/k;->x:Ljava/util/Random;

    iput-boolean p3, p0, Lle3/k;->y:Z

    iput-boolean p4, p0, Lle3/k;->z:Z

    iput-wide p5, p0, Lle3/k;->E:J

    new-instance p2, Lne3/h;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lle3/k;->F:Lne3/h;

    invoke-interface {p1}, Lne3/i;->f()Lne3/h;

    move-result-object p1

    iput-object p1, p0, Lle3/k;->G:Lne3/h;

    const/4 p1, 0x4

    new-array p1, p1, [B

    iput-object p1, p0, Lle3/k;->J:[B

    new-instance p1, Lne3/f;

    invoke-direct {p1}, Lne3/f;-><init>()V

    iput-object p1, p0, Lle3/k;->K:Lne3/f;

    return-void
.end method


# virtual methods
.method public final b(ILne3/l;)V
    .locals 7

    iget-boolean v0, p0, Lle3/k;->H:Z

    if-nez v0, :cond_4

    invoke-virtual {p2}, Lne3/l;->d()I

    move-result v0

    int-to-long v1, v0

    const-wide/16 v3, 0x7d

    cmp-long v1, v1, v3

    if-gtz v1, :cond_3

    or-int/lit16 p1, p1, 0x80

    iget-object v1, p0, Lle3/k;->G:Lne3/h;

    invoke-virtual {v1, p1}, Lne3/h;->m1(I)V

    or-int/lit16 p1, v0, 0x80

    invoke-virtual {v1, p1}, Lne3/h;->m1(I)V

    iget-object p1, p0, Lle3/k;->J:[B

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v2, p0, Lle3/k;->x:Ljava/util/Random;

    invoke-virtual {v2, p1}, Ljava/util/Random;->nextBytes([B)V

    invoke-virtual {v1, p1}, Lne3/h;->write([B)V

    if-lez v0, :cond_2

    iget-wide v2, v1, Lne3/h;->x:J

    invoke-virtual {v1, p2}, Lne3/h;->l1(Lne3/l;)V

    iget-object p2, p0, Lle3/k;->K:Lne3/f;

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1, p2}, Lne3/h;->a0(Lne3/f;)Lne3/f;

    invoke-virtual {p2, v2, v3}, Lne3/f;->i(J)I

    array-length v0, p1

    const/4 v1, 0x0

    :cond_0
    iget-object v2, p2, Lne3/f;->E:[B

    iget v3, p2, Lne3/f;->F:I

    iget v4, p2, Lne3/f;->G:I

    if-eqz v2, :cond_1

    :goto_0
    if-ge v3, v4, :cond_1

    rem-int/2addr v1, v0

    aget-byte v5, v2, v3

    aget-byte v6, p1, v1

    xor-int/2addr v5, v6

    int-to-byte v5, v5

    aput-byte v5, v2, v3

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Lne3/f;->b()I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    invoke-virtual {p2}, Lne3/f;->close()V

    :cond_2
    iget-object p1, p0, Lle3/k;->w:Lne3/i;

    invoke-interface {p1}, Lne3/i;->flush()V

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Payload size must be less than or equal to 125"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lle3/k;->I:Lle3/a;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lwd3/f;->b(Ljava/io/Closeable;)V

    :cond_0
    iget-object v0, p0, Lle3/k;->w:Lne3/i;

    invoke-static {v0}, Lwd3/f;->b(Ljava/io/Closeable;)V

    return-void
.end method

.method public final h(ILne3/l;)V
    .locals 11

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lle3/k;->H:Z

    if-nez v0, :cond_a

    iget-object v0, p0, Lle3/k;->F:Lne3/h;

    invoke-virtual {v0, p2}, Lne3/h;->l1(Lne3/l;)V

    or-int/lit16 v1, p1, 0x80

    iget-boolean v2, p0, Lle3/k;->y:Z

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    if-eqz v2, :cond_4

    invoke-virtual {p2}, Lne3/l;->d()I

    move-result p2

    int-to-long v6, p2

    iget-wide v8, p0, Lle3/k;->E:J

    cmp-long p2, v6, v8

    if-ltz p2, :cond_4

    iget-object p2, p0, Lle3/k;->I:Lle3/a;

    if-nez p2, :cond_0

    new-instance p2, Lle3/a;

    iget-boolean v1, p0, Lle3/k;->z:Z

    const/4 v2, 0x0

    invoke-direct {p2, v1, v2}, Lle3/a;-><init>(ZI)V

    iput-object p2, p0, Lle3/k;->I:Lle3/a;

    :cond_0
    iget-object v1, p2, Lle3/a;->E:Ljava/io/Closeable;

    check-cast v1, Lne3/m;

    iget-object v2, p2, Lle3/a;->y:Lne3/h;

    iget-wide v6, v2, Lne3/h;->x:J

    cmp-long v6, v6, v4

    if-nez v6, :cond_3

    iget-boolean v6, p2, Lle3/a;->x:Z

    if-eqz v6, :cond_1

    iget-object p2, p2, Lle3/a;->z:Ljava/lang/Object;

    check-cast p2, Ljava/util/zip/Deflater;

    invoke-virtual {p2}, Ljava/util/zip/Deflater;->reset()V

    :cond_1
    iget-wide v6, v0, Lne3/h;->x:J

    invoke-virtual {v1, v0, v6, v7}, Lne3/m;->write(Lne3/h;J)V

    invoke-virtual {v1}, Lne3/m;->flush()V

    sget-object p2, Lle3/b;->a:Lne3/l;

    iget-wide v6, v2, Lne3/h;->x:J

    iget-object v1, p2, Lne3/l;->w:[B

    array-length v1, v1

    int-to-long v8, v1

    sub-long/2addr v6, v8

    invoke-virtual {v2, v6, v7, p2}, Lne3/h;->d0(JLne3/l;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-wide v6, v2, Lne3/h;->x:J

    const/4 p2, 0x4

    int-to-long v8, p2

    sub-long/2addr v6, v8

    sget-object p2, Lne3/b;->a:Lne3/f;

    invoke-virtual {v2, p2}, Lne3/h;->a0(Lne3/f;)Lne3/f;

    move-result-object p2

    :try_start_0
    invoke-virtual {p2, v6, v7}, Lne3/f;->h(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p2}, Lne3/f;->close()V

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {p2, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_2
    invoke-virtual {v2, v3}, Lne3/h;->m1(I)V

    :goto_0
    iget-wide v6, v2, Lne3/h;->x:J

    invoke-virtual {v0, v2, v6, v7}, Lne3/h;->write(Lne3/h;J)V

    or-int/lit16 v1, p1, 0xc0

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Failed requirement."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_1
    iget-wide p1, v0, Lne3/h;->x:J

    iget-object v2, p0, Lle3/k;->G:Lne3/h;

    invoke-virtual {v2, v1}, Lne3/h;->m1(I)V

    const-wide/16 v6, 0x7d

    cmp-long v1, p1, v6

    if-gtz v1, :cond_5

    long-to-int v1, p1

    const/16 v6, 0x80

    or-int/2addr v1, v6

    invoke-virtual {v2, v1}, Lne3/h;->m1(I)V

    goto :goto_2

    :cond_5
    const-wide/32 v6, 0xffff

    cmp-long v1, p1, v6

    if-gtz v1, :cond_6

    const/16 v1, 0xfe

    invoke-virtual {v2, v1}, Lne3/h;->m1(I)V

    long-to-int v1, p1

    invoke-virtual {v2, v1}, Lne3/h;->r1(I)V

    goto :goto_2

    :cond_6
    const/16 v1, 0xff

    invoke-virtual {v2, v1}, Lne3/h;->m1(I)V

    invoke-virtual {v2, p1, p2}, Lne3/h;->q1(J)V

    :goto_2
    iget-object v1, p0, Lle3/k;->J:[B

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v6, p0, Lle3/k;->x:Ljava/util/Random;

    invoke-virtual {v6, v1}, Ljava/util/Random;->nextBytes([B)V

    invoke-virtual {v2, v1}, Lne3/h;->write([B)V

    cmp-long v6, p1, v4

    if-lez v6, :cond_9

    iget-object v6, p0, Lle3/k;->K:Lne3/f;

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, v6}, Lne3/h;->a0(Lne3/f;)Lne3/f;

    invoke-virtual {v6, v4, v5}, Lne3/f;->i(J)I

    array-length v4, v1

    :cond_7
    iget-object v5, v6, Lne3/f;->E:[B

    iget v7, v6, Lne3/f;->F:I

    iget v8, v6, Lne3/f;->G:I

    if-eqz v5, :cond_8

    :goto_3
    if-ge v7, v8, :cond_8

    rem-int/2addr v3, v4

    aget-byte v9, v5, v7

    aget-byte v10, v1, v3

    xor-int/2addr v9, v10

    int-to-byte v9, v9

    aput-byte v9, v5, v7

    add-int/lit8 v7, v7, 0x1

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_8
    invoke-virtual {v6}, Lne3/f;->b()I

    move-result v5

    const/4 v7, -0x1

    if-ne v5, v7, :cond_7

    invoke-virtual {v6}, Lne3/f;->close()V

    :cond_9
    invoke-virtual {v2, v0, p1, p2}, Lne3/h;->write(Lne3/h;J)V

    iget-object p1, p0, Lle3/k;->w:Lne3/i;

    invoke-interface {p1}, Lne3/i;->flush()V

    return-void

    :cond_a
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
