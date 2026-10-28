.class public final Lle3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public E:Z

.field public F:I

.field public G:J

.field public H:Z

.field public I:Z

.field public J:Z

.field public final K:Lne3/h;

.field public final L:Lne3/h;

.field public M:Lle3/a;

.field public final N:[B

.field public final w:Lne3/j;

.field public final x:Lle3/i;

.field public final y:Z

.field public final z:Z


# direct methods
.method public constructor <init>(Lne3/j;Lle3/i;ZZ)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lle3/j;->w:Lne3/j;

    iput-object p2, p0, Lle3/j;->x:Lle3/i;

    iput-boolean p3, p0, Lle3/j;->y:Z

    iput-boolean p4, p0, Lle3/j;->z:Z

    new-instance p1, Lne3/h;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lle3/j;->K:Lne3/h;

    new-instance p1, Lne3/h;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lle3/j;->L:Lne3/h;

    const/4 p1, 0x0

    iput-object p1, p0, Lle3/j;->N:[B

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 11

    invoke-virtual {p0}, Lle3/j;->i()V

    iget-boolean v0, p0, Lle3/j;->I:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lle3/j;->h()V

    return-void

    :cond_0
    iget v0, p0, Lle3/j;->F:I

    const/4 v1, 0x1

    const-string v2, "toHexString(...)"

    if-eq v0, v1, :cond_2

    const/4 v3, 0x2

    if-ne v0, v3, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/net/ProtocolException;

    sget-object v3, Lwd3/h;->a:Ljava/util/TimeZone;

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "Unknown opcode: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    :goto_0
    iget-boolean v3, p0, Lle3/j;->E:Z

    if-nez v3, :cond_11

    iget-wide v3, p0, Lle3/j;->G:J

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    iget-object v8, p0, Lle3/j;->L:Lne3/h;

    if-lez v7, :cond_3

    iget-object v7, p0, Lle3/j;->w:Lne3/j;

    invoke-interface {v7, v8, v3, v4}, Lne3/j;->j0(Lne3/h;J)V

    :cond_3
    iget-boolean v3, p0, Lle3/j;->H:Z

    if-nez v3, :cond_7

    :goto_1
    iget-boolean v3, p0, Lle3/j;->E:Z

    if-nez v3, :cond_5

    invoke-virtual {p0}, Lle3/j;->i()V

    iget-boolean v3, p0, Lle3/j;->I:Z

    if-nez v3, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lle3/j;->h()V

    goto :goto_1

    :cond_5
    :goto_2
    iget v3, p0, Lle3/j;->F:I

    if-nez v3, :cond_6

    goto :goto_0

    :cond_6
    new-instance v0, Ljava/net/ProtocolException;

    iget v1, p0, Lle3/j;->F:I

    sget-object v3, Lwd3/h;->a:Ljava/util/TimeZone;

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "Expected continuation opcode. Got: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    iget-boolean v2, p0, Lle3/j;->J:Z

    if-eqz v2, :cond_f

    iget-object v2, p0, Lle3/j;->M:Lle3/a;

    if-nez v2, :cond_8

    new-instance v2, Lle3/a;

    iget-boolean v3, p0, Lle3/j;->z:Z

    invoke-direct {v2, v3, v1}, Lle3/a;-><init>(ZI)V

    iput-object v2, p0, Lle3/j;->M:Lle3/a;

    :cond_8
    iget-object v3, v2, Lle3/a;->y:Lne3/h;

    iget-wide v9, v3, Lne3/h;->x:J

    cmp-long v4, v9, v5

    if-nez v4, :cond_e

    iget-object v4, v2, Lle3/a;->z:Ljava/lang/Object;

    check-cast v4, Ljava/util/zip/Inflater;

    if-nez v4, :cond_9

    new-instance v4, Ljava/util/zip/Inflater;

    invoke-direct {v4, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    iput-object v4, v2, Lle3/a;->z:Ljava/lang/Object;

    :cond_9
    iget-object v5, v2, Lle3/a;->E:Ljava/io/Closeable;

    check-cast v5, Lne3/x;

    if-nez v5, :cond_a

    new-instance v5, Lne3/x;

    invoke-static {v3}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v6

    invoke-direct {v5, v6, v4}, Lne3/x;-><init>(Lne3/j0;Ljava/util/zip/Inflater;)V

    iput-object v5, v2, Lle3/a;->E:Ljava/io/Closeable;

    :cond_a
    iget-boolean v6, v2, Lle3/a;->x:Z

    if-eqz v6, :cond_b

    invoke-virtual {v4}, Ljava/util/zip/Inflater;->reset()V

    :cond_b
    invoke-virtual {v3, v8}, Lne3/h;->N0(Lne3/p0;)J

    const v6, 0xffff

    invoke-virtual {v3, v6}, Lne3/h;->p1(I)V

    invoke-virtual {v4}, Ljava/util/zip/Inflater;->getBytesRead()J

    move-result-wide v6

    iget-wide v9, v3, Lne3/h;->x:J

    add-long/2addr v6, v9

    :cond_c
    const-wide v9, 0x7fffffffffffffffL

    invoke-virtual {v5, v8, v9, v10}, Lne3/x;->b(Lne3/h;J)J

    invoke-virtual {v4}, Ljava/util/zip/Inflater;->getBytesRead()J

    move-result-wide v9

    cmp-long v9, v9, v6

    if-gez v9, :cond_d

    invoke-virtual {v4}, Ljava/util/zip/Inflater;->finished()Z

    move-result v9

    if-eqz v9, :cond_c

    :cond_d
    invoke-virtual {v4}, Ljava/util/zip/Inflater;->getBytesRead()J

    move-result-wide v9

    cmp-long v4, v9, v6

    if-gez v4, :cond_f

    invoke-virtual {v3}, Lne3/h;->b()V

    invoke-virtual {v5}, Lne3/x;->close()V

    const/4 v3, 0x0

    iput-object v3, v2, Lle3/a;->E:Ljava/io/Closeable;

    iput-object v3, v2, Lle3/a;->z:Ljava/lang/Object;

    goto :goto_3

    :cond_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Failed requirement."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    :goto_3
    iget-object v2, p0, Lle3/j;->x:Lle3/i;

    if-ne v0, v1, :cond_10

    invoke-virtual {v8}, Lne3/h;->S0()Ljava/lang/String;

    move-result-object v0

    check-cast v2, Lle3/g;

    iget-object v1, v2, Lle3/g;->b:Lud3/f1;

    invoke-virtual {v1, v2, v0}, Lud3/f1;->onMessage(Lud3/e1;Ljava/lang/String;)V

    return-void

    :cond_10
    iget-wide v0, v8, Lne3/h;->x:J

    invoke-virtual {v8, v0, v1}, Lne3/h;->m0(J)Lne3/l;

    move-result-object v0

    check-cast v2, Lle3/g;

    const-string v1, "bytes"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v2, Lle3/g;->b:Lud3/f1;

    invoke-virtual {v1, v2, v0}, Lud3/f1;->onMessage(Lud3/e1;Lne3/l;)V

    return-void

    :cond_11
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lle3/j;->M:Lle3/a;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lwd3/f;->b(Ljava/io/Closeable;)V

    :cond_0
    iget-object v0, p0, Lle3/j;->w:Lne3/j;

    invoke-static {v0}, Lwd3/f;->b(Ljava/io/Closeable;)V

    return-void
.end method

.method public final h()V
    .locals 9

    iget-wide v0, p0, Lle3/j;->G:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    iget-object v4, p0, Lle3/j;->w:Lne3/j;

    iget-object v5, p0, Lle3/j;->K:Lne3/h;

    invoke-interface {v4, v5, v0, v1}, Lne3/j;->j0(Lne3/h;J)V

    :cond_0
    iget v0, p0, Lle3/j;->F:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/net/ProtocolException;

    iget v1, p0, Lle3/j;->F:I

    sget-object v2, Lwd3/h;->a:Ljava/util/TimeZone;

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toHexString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "Unknown control opcode: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lle3/j;->x:Lle3/i;

    iget-object v1, p0, Lle3/j;->K:Lne3/h;

    iget-wide v2, v1, Lne3/h;->x:J

    invoke-virtual {v1, v2, v3}, Lne3/h;->m0(J)Lne3/l;

    move-result-object v1

    check-cast v0, Lle3/g;

    monitor-enter v0

    :try_start_0
    const-string v2, "payload"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    iput-boolean v1, v0, Lle3/g;->x:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :pswitch_1
    iget-object v0, p0, Lle3/j;->x:Lle3/i;

    iget-object v1, p0, Lle3/j;->K:Lne3/h;

    iget-wide v2, v1, Lne3/h;->x:J

    invoke-virtual {v1, v2, v3}, Lne3/h;->m0(J)Lne3/l;

    move-result-object v1

    check-cast v0, Lle3/g;

    monitor-enter v0

    :try_start_2
    const-string v2, "payload"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v2, v0, Lle3/g;->v:Z

    if-nez v2, :cond_2

    iget-boolean v2, v0, Lle3/g;->s:Z

    if-eqz v2, :cond_1

    iget-object v2, v0, Lle3/g;->q:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :catchall_1
    move-exception v1

    goto :goto_1

    :cond_1
    iget-object v2, v0, Lle3/g;->p:Ljava/util/ArrayDeque;

    invoke-virtual {v2, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lle3/g;->f()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    return-void

    :cond_2
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1

    :pswitch_2
    const-string v0, ""

    iget-object v1, p0, Lle3/j;->K:Lne3/h;

    iget-wide v4, v1, Lne3/h;->x:J

    const-wide/16 v6, 0x1

    cmp-long v6, v4, v6

    if-eqz v6, :cond_b

    cmp-long v2, v4, v2

    if-eqz v2, :cond_8

    invoke-virtual {v1}, Lne3/h;->readShort()S

    move-result v0

    iget-object v1, p0, Lle3/j;->K:Lne3/h;

    invoke-virtual {v1}, Lne3/h;->S0()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x3e8

    if-lt v0, v2, :cond_6

    const/16 v2, 0x1388

    if-lt v0, v2, :cond_3

    goto :goto_3

    :cond_3
    const/16 v2, 0x3ec

    if-gt v2, v0, :cond_4

    const/16 v2, 0x3ef

    if-ge v0, v2, :cond_4

    goto :goto_2

    :cond_4
    const/16 v2, 0x3f7

    if-gt v2, v0, :cond_5

    const/16 v2, 0xbb8

    if-ge v0, v2, :cond_5

    :goto_2
    const-string v2, "Code "

    const-string v3, " is reserved and may not be used."

    invoke-static {v0, v2, v3}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_4

    :cond_5
    const/4 v2, 0x0

    goto :goto_4

    :cond_6
    :goto_3
    const-string v2, "Code must be in range [1000,5000): "

    invoke-static {v0, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_4
    if-nez v2, :cond_7

    goto :goto_5

    :cond_7
    new-instance v0, Ljava/net/ProtocolException;

    invoke-direct {v0, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    const/16 v1, 0x3ed

    move v8, v1

    move-object v1, v0

    move v0, v8

    :goto_5
    iget-object v2, p0, Lle3/j;->x:Lle3/i;

    check-cast v2, Lle3/g;

    const/4 v3, -0x1

    if-eq v0, v3, :cond_a

    monitor-enter v2

    :try_start_4
    iget v4, v2, Lle3/g;->t:I

    if-ne v4, v3, :cond_9

    iput v0, v2, Lle3/g;->t:I

    iput-object v1, v2, Lle3/g;->u:Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    monitor-exit v2

    iget-object v3, v2, Lle3/g;->b:Lud3/f1;

    invoke-virtual {v3, v2, v0, v1}, Lud3/f1;->onClosing(Lud3/e1;ILjava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lle3/j;->E:Z

    return-void

    :catchall_2
    move-exception v0

    goto :goto_6

    :cond_9
    :try_start_5
    const-string v0, "already closed"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :goto_6
    monitor-exit v2

    throw v0

    :cond_a
    const-string v0, "Failed requirement."

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_b
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Malformed close payload length of 1."

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i()V
    .locals 8

    iget-boolean v0, p0, Lle3/j;->E:Z

    if-nez v0, :cond_13

    iget-object v0, p0, Lle3/j;->w:Lne3/j;

    invoke-interface {v0}, Lne3/p0;->timeout()Lne3/r0;

    move-result-object v1

    invoke-virtual {v1}, Lne3/r0;->h()J

    move-result-wide v1

    invoke-interface {v0}, Lne3/p0;->timeout()Lne3/r0;

    move-result-object v3

    invoke-virtual {v3}, Lne3/r0;->b()Lne3/r0;

    :try_start_0
    invoke-interface {v0}, Lne3/j;->readByte()B

    move-result v3

    sget-object v4, Lwd3/f;->a:[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Lne3/p0;->timeout()Lne3/r0;

    move-result-object v4

    sget-object v5, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v4, v1, v2, v5}, Lne3/r0;->g(JLjava/util/concurrent/TimeUnit;)Lne3/r0;

    and-int/lit8 v1, v3, 0xf

    iput v1, p0, Lle3/j;->F:I

    and-int/lit16 v2, v3, 0x80

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v5

    :goto_0
    iput-boolean v2, p0, Lle3/j;->H:Z

    and-int/lit8 v6, v3, 0x8

    if-eqz v6, :cond_1

    move v6, v4

    goto :goto_1

    :cond_1
    move v6, v5

    :goto_1
    iput-boolean v6, p0, Lle3/j;->I:Z

    if-eqz v6, :cond_3

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Control frames must be final."

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_2
    and-int/lit8 v2, v3, 0x40

    if-eqz v2, :cond_4

    move v2, v4

    goto :goto_3

    :cond_4
    move v2, v5

    :goto_3
    const-string v6, "Unexpected rsv1 flag"

    if-eq v1, v4, :cond_6

    const/4 v7, 0x2

    if-eq v1, v7, :cond_6

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    new-instance v0, Ljava/net/ProtocolException;

    invoke-direct {v0, v6}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    if-eqz v2, :cond_8

    iget-boolean v1, p0, Lle3/j;->y:Z

    if-eqz v1, :cond_7

    move v1, v4

    goto :goto_4

    :cond_7
    new-instance v0, Ljava/net/ProtocolException;

    invoke-direct {v0, v6}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    move v1, v5

    :goto_4
    iput-boolean v1, p0, Lle3/j;->J:Z

    :goto_5
    and-int/lit8 v1, v3, 0x20

    if-nez v1, :cond_12

    and-int/lit8 v1, v3, 0x10

    if-nez v1, :cond_11

    invoke-interface {v0}, Lne3/j;->readByte()B

    move-result v1

    and-int/lit16 v2, v1, 0x80

    if-eqz v2, :cond_9

    move v5, v4

    :cond_9
    if-eq v5, v4, :cond_10

    and-int/lit8 v1, v1, 0x7f

    int-to-long v1, v1

    iput-wide v1, p0, Lle3/j;->G:J

    const-wide/16 v3, 0x7e

    cmp-long v3, v1, v3

    if-nez v3, :cond_a

    invoke-interface {v0}, Lne3/j;->readShort()S

    move-result v1

    const v2, 0xffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    iput-wide v1, p0, Lle3/j;->G:J

    goto :goto_6

    :cond_a
    const-wide/16 v3, 0x7f

    cmp-long v1, v1, v3

    if-nez v1, :cond_c

    invoke-interface {v0}, Lne3/j;->readLong()J

    move-result-wide v1

    iput-wide v1, p0, Lle3/j;->G:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-ltz v1, :cond_b

    goto :goto_6

    :cond_b
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Frame length 0x"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Lle3/j;->G:J

    sget-object v4, Lwd3/h;->a:Ljava/util/TimeZone;

    invoke-static {v2, v3}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v2

    const-string v3, "toHexString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " > 0x7FFFFFFFFFFFFFFF"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    :goto_6
    iget-boolean v1, p0, Lle3/j;->I:Z

    if-eqz v1, :cond_e

    iget-wide v1, p0, Lle3/j;->G:J

    const-wide/16 v3, 0x7d

    cmp-long v1, v1, v3

    if-gtz v1, :cond_d

    goto :goto_7

    :cond_d
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Control frame must be less than 125B."

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    :goto_7
    if-eqz v5, :cond_f

    iget-object v1, p0, Lle3/j;->N:[B

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lne3/j;->readFully([B)V

    :cond_f
    return-void

    :cond_10
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Server-sent frames must not be masked."

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Unexpected rsv3 flag"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Unexpected rsv2 flag"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v3

    invoke-interface {v0}, Lne3/p0;->timeout()Lne3/r0;

    move-result-object v0

    sget-object v4, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v4}, Lne3/r0;->g(JLjava/util/concurrent/TimeUnit;)Lne3/r0;

    throw v3

    :cond_13
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
