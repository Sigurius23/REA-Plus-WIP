.class public final Lne3/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lne3/n0;


# instance fields
.field public final E:Ljava/util/zip/CRC32;

.field public final w:Lne3/h0;

.field public final x:Ljava/util/zip/Deflater;

.field public final y:Lne3/m;

.field public z:Z


# direct methods
.method public constructor <init>(Lne3/i;)V
    .locals 3

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lne3/h0;

    invoke-direct {v0, p1}, Lne3/h0;-><init>(Lne3/n0;)V

    iput-object v0, p0, Lne3/u;->w:Lne3/h0;

    new-instance p1, Ljava/util/zip/Deflater;

    const/4 v1, -0x1

    const/4 v2, 0x1

    invoke-direct {p1, v1, v2}, Ljava/util/zip/Deflater;-><init>(IZ)V

    iput-object p1, p0, Lne3/u;->x:Ljava/util/zip/Deflater;

    new-instance v1, Lne3/m;

    invoke-direct {v1, v0, p1}, Lne3/m;-><init>(Lne3/h0;Ljava/util/zip/Deflater;)V

    iput-object v1, p0, Lne3/u;->y:Lne3/m;

    new-instance p1, Ljava/util/zip/CRC32;

    invoke-direct {p1}, Ljava/util/zip/CRC32;-><init>()V

    iput-object p1, p0, Lne3/u;->E:Ljava/util/zip/CRC32;

    const/16 p1, 0x1f8b

    iget-object v0, v0, Lne3/h0;->x:Lne3/h;

    invoke-virtual {v0, p1}, Lne3/h;->r1(I)V

    const/16 p1, 0x8

    invoke-virtual {v0, p1}, Lne3/h;->m1(I)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lne3/h;->m1(I)V

    invoke-virtual {v0, p1}, Lne3/h;->p1(I)V

    invoke-virtual {v0, p1}, Lne3/h;->m1(I)V

    invoke-virtual {v0, p1}, Lne3/h;->m1(I)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    iget-object v0, p0, Lne3/u;->x:Ljava/util/zip/Deflater;

    iget-object v1, p0, Lne3/u;->w:Lne3/h0;

    iget-boolean v2, p0, Lne3/u;->z:Z

    if-eqz v2, :cond_0

    goto :goto_3

    :cond_0
    :try_start_0
    iget-object v2, p0, Lne3/u;->y:Lne3/m;

    iget-object v3, v2, Lne3/m;->x:Ljava/util/zip/Deflater;

    invoke-virtual {v3}, Ljava/util/zip/Deflater;->finish()V

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lne3/m;->b(Z)V

    iget-object v2, p0, Lne3/u;->E:Ljava/util/zip/CRC32;

    invoke-virtual {v2}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v1, v2}, Lne3/h0;->v0(I)Lne3/i;

    invoke-virtual {v0}, Ljava/util/zip/Deflater;->getBytesRead()J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v1, v2}, Lne3/h0;->v0(I)Lne3/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    goto :goto_0

    :catchall_0
    move-exception v2

    :goto_0
    :try_start_1
    invoke-virtual {v0}, Ljava/util/zip/Deflater;->end()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    if-nez v2, :cond_1

    move-object v2, v0

    :cond_1
    :goto_1
    :try_start_2
    invoke-virtual {v1}, Lne3/h0;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v0

    if-nez v2, :cond_2

    move-object v2, v0

    :cond_2
    :goto_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lne3/u;->z:Z

    if-nez v2, :cond_3

    :goto_3
    return-void

    :cond_3
    throw v2
.end method

.method public final flush()V
    .locals 1

    iget-object v0, p0, Lne3/u;->y:Lne3/m;

    invoke-virtual {v0}, Lne3/m;->flush()V

    return-void
.end method

.method public final timeout()Lne3/r0;
    .locals 1

    iget-object v0, p0, Lne3/u;->w:Lne3/h0;

    iget-object v0, v0, Lne3/h0;->w:Lne3/n0;

    invoke-interface {v0}, Lne3/n0;->timeout()Lne3/r0;

    move-result-object v0

    return-object v0
.end method

.method public final write(Lne3/h;J)V
    .locals 9

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_2

    if-nez v2, :cond_0

    return-void

    :cond_0
    iget-object v2, p1, Lne3/h;->w:Lne3/k0;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-wide v3, p2

    :goto_0
    cmp-long v5, v3, v0

    if-lez v5, :cond_1

    iget v5, v2, Lne3/k0;->c:I

    iget v6, v2, Lne3/k0;->b:I

    sub-int/2addr v5, v6

    int-to-long v5, v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    long-to-int v5, v5

    iget-object v6, v2, Lne3/k0;->a:[B

    iget v7, v2, Lne3/k0;->b:I

    iget-object v8, p0, Lne3/u;->E:Ljava/util/zip/CRC32;

    invoke-virtual {v8, v6, v7, v5}, Ljava/util/zip/CRC32;->update([BII)V

    int-to-long v5, v5

    sub-long/2addr v3, v5

    iget-object v2, v2, Lne3/k0;->f:Lne3/k0;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lne3/u;->y:Lne3/m;

    invoke-virtual {v0, p1, p2, p3}, Lne3/m;->write(Lne3/h;J)V

    return-void

    :cond_2
    const-string p1, "byteCount < 0: "

    invoke-static {p2, p3, p1}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
