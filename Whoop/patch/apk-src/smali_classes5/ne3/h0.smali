.class public final Lne3/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lne3/i;


# instance fields
.field public final w:Lne3/n0;

.field public final x:Lne3/h;

.field public y:Z


# direct methods
.method public constructor <init>(Lne3/n0;)V
    .locals 1

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lne3/h0;->w:Lne3/n0;

    new-instance p1, Lne3/h;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lne3/h0;->x:Lne3/h;

    return-void
.end method


# virtual methods
.method public final H(J)Lne3/i;
    .locals 1

    iget-boolean v0, p0, Lne3/h0;->y:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lne3/h0;->x:Lne3/h;

    invoke-static {p1, p2}, Lne3/b;->h(J)J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Lne3/h;->q1(J)V

    invoke-virtual {p0}, Lne3/h0;->b()Lne3/i;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final L0(IILjava/lang/String;)Lne3/i;
    .locals 1

    const-string v0, "string"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lne3/h0;->y:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lne3/h0;->x:Lne3/h;

    invoke-virtual {v0, p1, p2, p3}, Lne3/h;->t1(IILjava/lang/String;)V

    invoke-virtual {p0}, Lne3/h0;->b()Lne3/i;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final N0(Lne3/p0;)J
    .locals 6

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    :goto_0
    iget-object v2, p0, Lne3/h0;->x:Lne3/h;

    const-wide/16 v3, 0x2000

    invoke-interface {p1, v2, v3, v4}, Lne3/p0;->h1(Lne3/h;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v4, v2, v4

    if-eqz v4, :cond_0

    add-long/2addr v0, v2

    invoke-virtual {p0}, Lne3/h0;->b()Lne3/i;

    goto :goto_0

    :cond_0
    return-wide v0
.end method

.method public final Q(Lne3/l;)Lne3/i;
    .locals 1

    const-string v0, "byteString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lne3/h0;->y:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lne3/h0;->x:Lne3/h;

    invoke-virtual {v0, p1}, Lne3/h;->l1(Lne3/l;)V

    invoke-virtual {p0}, Lne3/h0;->b()Lne3/i;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final S(Ljava/lang/String;)Lne3/i;
    .locals 1

    const-string v0, "string"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lne3/h0;->y:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lne3/h0;->x:Lne3/h;

    invoke-virtual {v0, p1}, Lne3/h;->u1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lne3/h0;->b()Lne3/i;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b()Lne3/i;
    .locals 5

    iget-boolean v0, p0, Lne3/h0;->y:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lne3/h0;->x:Lne3/h;

    invoke-virtual {v0}, Lne3/h;->h()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-lez v3, :cond_0

    iget-object v3, p0, Lne3/h0;->w:Lne3/n0;

    invoke-interface {v3, v0, v1, v2}, Lne3/n0;->write(Lne3/h;J)V

    :cond_0
    return-object p0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final close()V
    .locals 6

    iget-object v0, p0, Lne3/h0;->w:Lne3/n0;

    iget-boolean v1, p0, Lne3/h0;->y:Z

    if-nez v1, :cond_3

    :try_start_0
    iget-object v1, p0, Lne3/h0;->x:Lne3/h;

    iget-wide v2, v1, Lne3/h;->x:J

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-lez v4, :cond_0

    invoke-interface {v0, v1, v2, v3}, Lne3/n0;->write(Lne3/h;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v1, 0x0

    :goto_1
    :try_start_1
    invoke-interface {v0}, Lne3/n0;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    if-nez v1, :cond_1

    move-object v1, v0

    :cond_1
    :goto_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lne3/h0;->y:Z

    if-nez v1, :cond_2

    goto :goto_3

    :cond_2
    throw v1

    :cond_3
    :goto_3
    return-void
.end method

.method public final e()Lne3/i;
    .locals 5

    iget-boolean v0, p0, Lne3/h0;->y:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lne3/h0;->x:Lne3/h;

    iget-wide v1, v0, Lne3/h;->x:J

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-lez v3, :cond_0

    iget-object v3, p0, Lne3/h0;->w:Lne3/n0;

    invoke-interface {v3, v0, v1, v2}, Lne3/n0;->write(Lne3/h;J)V

    :cond_0
    return-object p0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final f()Lne3/h;
    .locals 1

    iget-object v0, p0, Lne3/h0;->x:Lne3/h;

    return-object v0
.end method

.method public final flush()V
    .locals 5

    iget-boolean v0, p0, Lne3/h0;->y:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lne3/h0;->x:Lne3/h;

    iget-wide v1, v0, Lne3/h;->x:J

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    iget-object v4, p0, Lne3/h0;->w:Lne3/n0;

    if-lez v3, :cond_0

    invoke-interface {v4, v0, v1, v2}, Lne3/n0;->write(Lne3/h;J)V

    :cond_0
    invoke-interface {v4}, Lne3/n0;->flush()V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final h0(J)Lne3/i;
    .locals 1

    iget-boolean v0, p0, Lne3/h0;->y:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lne3/h0;->x:Lne3/h;

    invoke-virtual {v0, p1, p2}, Lne3/h;->n1(J)V

    invoke-virtual {p0}, Lne3/h0;->b()Lne3/i;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final isOpen()Z
    .locals 1

    iget-boolean v0, p0, Lne3/h0;->y:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final timeout()Lne3/r0;
    .locals 1

    iget-object v0, p0, Lne3/h0;->w:Lne3/n0;

    invoke-interface {v0}, Lne3/n0;->timeout()Lne3/r0;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "buffer("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lne3/h0;->w:Lne3/n0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final v0(I)Lne3/i;
    .locals 1

    iget-boolean v0, p0, Lne3/h0;->y:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lne3/h0;->x:Lne3/h;

    invoke-static {p1}, Lne3/b;->g(I)I

    move-result p1

    invoke-virtual {v0, p1}, Lne3/h;->p1(I)V

    invoke-virtual {p0}, Lne3/h0;->b()Lne3/i;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final write(Ljava/nio/ByteBuffer;)I
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-boolean v0, p0, Lne3/h0;->y:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lne3/h0;->x:Lne3/h;

    .line 3
    invoke-virtual {v0, p1}, Lne3/h;->write(Ljava/nio/ByteBuffer;)I

    move-result p1

    .line 4
    invoke-virtual {p0}, Lne3/h0;->b()Lne3/i;

    return p1

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final write([B)Lne3/i;
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    iget-boolean v0, p0, Lne3/h0;->y:Z

    if-nez v0, :cond_0

    .line 12
    iget-object v0, p0, Lne3/h0;->x:Lne3/h;

    .line 13
    invoke-virtual {v0, p1}, Lne3/h;->write([B)V

    .line 14
    invoke-virtual {p0}, Lne3/h0;->b()Lne3/i;

    return-object p0

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final write([BII)Lne3/i;
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    iget-boolean v0, p0, Lne3/h0;->y:Z

    if-nez v0, :cond_0

    .line 17
    iget-object v0, p0, Lne3/h0;->x:Lne3/h;

    .line 18
    invoke-virtual {v0, p1, p2, p3}, Lne3/h;->write([BII)V

    .line 19
    invoke-virtual {p0}, Lne3/h0;->b()Lne3/i;

    return-object p0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final write(Lne3/h;J)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    iget-boolean v0, p0, Lne3/h0;->y:Z

    if-nez v0, :cond_0

    .line 7
    iget-object v0, p0, Lne3/h0;->x:Lne3/h;

    .line 8
    invoke-virtual {v0, p1, p2, p3}, Lne3/h;->write(Lne3/h;J)V

    .line 9
    invoke-virtual {p0}, Lne3/h0;->b()Lne3/i;

    return-void

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final writeByte(I)Lne3/i;
    .locals 1

    iget-boolean v0, p0, Lne3/h0;->y:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lne3/h0;->x:Lne3/h;

    invoke-virtual {v0, p1}, Lne3/h;->m1(I)V

    invoke-virtual {p0}, Lne3/h0;->b()Lne3/i;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final writeInt(I)Lne3/i;
    .locals 1

    iget-boolean v0, p0, Lne3/h0;->y:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lne3/h0;->x:Lne3/h;

    invoke-virtual {v0, p1}, Lne3/h;->p1(I)V

    invoke-virtual {p0}, Lne3/h0;->b()Lne3/i;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final writeShort(I)Lne3/i;
    .locals 1

    iget-boolean v0, p0, Lne3/h0;->y:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lne3/h0;->x:Lne3/h;

    invoke-virtual {v0, p1}, Lne3/h;->r1(I)V

    invoke-virtual {p0}, Lne3/h0;->b()Lne3/i;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
