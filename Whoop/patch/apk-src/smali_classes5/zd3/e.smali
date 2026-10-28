.class public final Lzd3/e;
.super Lne3/r;
.source "SourceFile"


# instance fields
.field public E:Z

.field public F:Z

.field public final synthetic G:Lzd3/g;

.field public final w:J

.field public final x:Z

.field public y:Z

.field public z:J


# direct methods
.method public constructor <init>(Lzd3/g;Lne3/n0;JZ)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lzd3/e;->G:Lzd3/g;

    invoke-direct {p0, p2}, Lne3/r;-><init>(Lne3/n0;)V

    iput-wide p3, p0, Lzd3/e;->w:J

    iput-boolean p5, p0, Lzd3/e;->x:Z

    iput-boolean p5, p0, Lzd3/e;->E:Z

    return-void
.end method


# virtual methods
.method public final b(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 7

    iget-boolean v0, p0, Lzd3/e;->y:Z

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lzd3/e;->y:Z

    iget-wide v2, p0, Lzd3/e;->z:J

    iget-boolean v4, p0, Lzd3/e;->x:Z

    const/4 v6, 0x4

    iget-object v1, p0, Lzd3/e;->G:Lzd3/g;

    move-object v5, p1

    invoke-static/range {v1 .. v6}, Lzd3/g;->a(Lzd3/g;JZLjava/io/IOException;I)Ljava/io/IOException;

    move-result-object p1

    return-object p1
.end method

.method public final close()V
    .locals 4

    iget-boolean v0, p0, Lzd3/e;->F:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lzd3/e;->F:Z

    const-wide/16 v0, -0x1

    iget-wide v2, p0, Lzd3/e;->w:J

    cmp-long v0, v2, v0

    if-eqz v0, :cond_2

    iget-wide v0, p0, Lzd3/e;->z:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "unexpected end of stream"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    :try_start_0
    invoke-super {p0}, Lne3/r;->close()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lzd3/e;->b(Ljava/io/IOException;)Ljava/io/IOException;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, Lzd3/e;->b(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    throw v0
.end method

.method public final flush()V
    .locals 1

    :try_start_0
    invoke-super {p0}, Lne3/r;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, Lzd3/e;->b(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    throw v0
.end method

.method public final write(Lne3/h;J)V
    .locals 4

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lzd3/e;->F:Z

    if-nez v0, :cond_3

    const-wide/16 v0, -0x1

    iget-wide v2, p0, Lzd3/e;->w:J

    cmp-long v0, v2, v0

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lzd3/e;->z:J

    add-long/2addr v0, p2

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/net/ProtocolException;

    const-string v0, "expected "

    const-string v1, " bytes but received "

    invoke-static {v2, v3, v0, v1}, Lyb0/f;->b(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lzd3/e;->z:J

    add-long/2addr v1, p2

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    :try_start_0
    iget-boolean v0, p0, Lzd3/e;->E:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lzd3/e;->E:Z

    iget-object v0, p0, Lzd3/e;->G:Lzd3/g;

    iget-object v1, v0, Lzd3/g;->b:Lud3/a0;

    iget-object v0, v0, Lzd3/g;->a:Lzd3/o;

    invoke-virtual {v1, v0}, Lud3/a0;->requestBodyStart(Lud3/j;)V

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_2
    :goto_1
    invoke-super {p0, p1, p2, p3}, Lne3/r;->write(Lne3/h;J)V

    iget-wide v0, p0, Lzd3/e;->z:J

    add-long/2addr v0, p2

    iput-wide v0, p0, Lzd3/e;->z:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_2
    invoke-virtual {p0, p1}, Lzd3/e;->b(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
