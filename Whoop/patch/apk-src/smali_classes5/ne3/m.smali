.class public final Lne3/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lne3/n0;


# instance fields
.field public final w:Lne3/h0;

.field public final x:Ljava/util/zip/Deflater;

.field public y:Z


# direct methods
.method public constructor <init>(Lne3/h0;Ljava/util/zip/Deflater;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lne3/m;->w:Lne3/h0;

    iput-object p2, p0, Lne3/m;->x:Ljava/util/zip/Deflater;

    return-void
.end method


# virtual methods
.method public final b(Z)V
    .locals 8

    iget-object v0, p0, Lne3/m;->w:Lne3/h0;

    iget-object v1, v0, Lne3/h0;->x:Lne3/h;

    :cond_0
    :goto_0
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lne3/h;->k1(I)Lne3/k0;

    move-result-object v2

    iget-object v3, v2, Lne3/k0;->a:[B

    iget-object v4, p0, Lne3/m;->x:Ljava/util/zip/Deflater;

    if-eqz p1, :cond_1

    :try_start_0
    iget v5, v2, Lne3/k0;->c:I

    rsub-int v6, v5, 0x2000

    const/4 v7, 0x2

    invoke-virtual {v4, v3, v5, v6, v7}, Ljava/util/zip/Deflater;->deflate([BIII)I

    move-result v3

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    iget v5, v2, Lne3/k0;->c:I

    rsub-int v6, v5, 0x2000

    invoke-virtual {v4, v3, v5, v6}, Ljava/util/zip/Deflater;->deflate([BII)I

    move-result v3
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    if-lez v3, :cond_2

    iget v4, v2, Lne3/k0;->c:I

    add-int/2addr v4, v3

    iput v4, v2, Lne3/k0;->c:I

    iget-wide v4, v1, Lne3/h;->x:J

    int-to-long v2, v3

    add-long/2addr v4, v2

    iput-wide v4, v1, Lne3/h;->x:J

    invoke-virtual {v0}, Lne3/h0;->b()Lne3/i;

    goto :goto_0

    :cond_2
    invoke-virtual {v4}, Ljava/util/zip/Deflater;->needsInput()Z

    move-result v3

    if-eqz v3, :cond_0

    iget p1, v2, Lne3/k0;->b:I

    iget v0, v2, Lne3/k0;->c:I

    if-ne p1, v0, :cond_3

    invoke-virtual {v2}, Lne3/k0;->a()Lne3/k0;

    move-result-object p1

    iput-object p1, v1, Lne3/h;->w:Lne3/k0;

    invoke-static {v2}, Lne3/l0;->a(Lne3/k0;)V

    :cond_3
    return-void

    :goto_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Deflater already closed"

    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final close()V
    .locals 2

    iget-object v0, p0, Lne3/m;->x:Ljava/util/zip/Deflater;

    iget-boolean v1, p0, Lne3/m;->y:Z

    if-eqz v1, :cond_0

    goto :goto_3

    :cond_0
    :try_start_0
    invoke-virtual {v0}, Ljava/util/zip/Deflater;->finish()V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lne3/m;->b(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    goto :goto_0

    :catchall_0
    move-exception v1

    :goto_0
    :try_start_1
    invoke-virtual {v0}, Ljava/util/zip/Deflater;->end()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    if-nez v1, :cond_1

    move-object v1, v0

    :cond_1
    :goto_1
    :try_start_2
    iget-object v0, p0, Lne3/m;->w:Lne3/h0;

    invoke-virtual {v0}, Lne3/h0;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v0

    if-nez v1, :cond_2

    move-object v1, v0

    :cond_2
    :goto_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lne3/m;->y:Z

    if-nez v1, :cond_3

    :goto_3
    return-void

    :cond_3
    throw v1
.end method

.method public final flush()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lne3/m;->b(Z)V

    iget-object v0, p0, Lne3/m;->w:Lne3/h0;

    invoke-virtual {v0}, Lne3/h0;->flush()V

    return-void
.end method

.method public final timeout()Lne3/r0;
    .locals 1

    iget-object v0, p0, Lne3/m;->w:Lne3/h0;

    iget-object v0, v0, Lne3/h0;->w:Lne3/n0;

    invoke-interface {v0}, Lne3/n0;->timeout()Lne3/r0;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DeflaterSink("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lne3/m;->w:Lne3/h0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final write(Lne3/h;J)V
    .locals 7

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v1, p1, Lne3/h;->x:J

    const-wide/16 v3, 0x0

    move-wide v5, p2

    invoke-static/range {v1 .. v6}, Lne3/b;->e(JJJ)V

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    iget-object v1, p0, Lne3/m;->x:Ljava/util/zip/Deflater;

    const/4 v2, 0x0

    if-lez v0, :cond_1

    iget-object v0, p1, Lne3/h;->w:Lne3/k0;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v3, v0, Lne3/k0;->c:I

    iget v4, v0, Lne3/k0;->b:I

    sub-int/2addr v3, v4

    int-to-long v3, v3

    invoke-static {p2, p3, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    long-to-int v3, v3

    iget-object v4, v0, Lne3/k0;->a:[B

    iget v5, v0, Lne3/k0;->b:I

    invoke-virtual {v1, v4, v5, v3}, Ljava/util/zip/Deflater;->setInput([BII)V

    invoke-virtual {p0, v2}, Lne3/m;->b(Z)V

    iget-wide v1, p1, Lne3/h;->x:J

    int-to-long v4, v3

    sub-long/2addr v1, v4

    iput-wide v1, p1, Lne3/h;->x:J

    iget v1, v0, Lne3/k0;->b:I

    add-int/2addr v1, v3

    iput v1, v0, Lne3/k0;->b:I

    iget v2, v0, Lne3/k0;->c:I

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lne3/k0;->a()Lne3/k0;

    move-result-object v1

    iput-object v1, p1, Lne3/h;->w:Lne3/k0;

    invoke-static {v0}, Lne3/l0;->a(Lne3/k0;)V

    :cond_0
    sub-long/2addr p2, v4

    goto :goto_0

    :cond_1
    sget-object p1, Loe3/b;->b:[B

    invoke-virtual {v1, p1, v2, v2}, Ljava/util/zip/Deflater;->setInput([BII)V

    return-void
.end method
