.class public final Lce3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final a0:Lce3/d0;


# instance fields
.field public E:I

.field public F:Z

.field public final G:Lyd3/d;

.field public final H:Lyd3/c;

.field public final I:Lyd3/c;

.field public final J:Lyd3/c;

.field public final K:Lce3/c0;

.field public L:J

.field public M:J

.field public N:J

.field public O:J

.field public P:J

.field public final Q:Lce3/b;

.field public final R:Lce3/d0;

.field public S:Lce3/d0;

.field public final T:Lde3/a;

.field public U:J

.field public V:J

.field public final W:Ls/m2;

.field public final X:Lce3/z;

.field public final Y:Lce3/p;

.field public final Z:Ljava/util/LinkedHashSet;

.field public final w:Lce3/n;

.field public final x:Ljava/util/LinkedHashMap;

.field public final y:Ljava/lang/String;

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lce3/d0;

    invoke-direct {v0}, Lce3/d0;-><init>()V

    const/4 v1, 0x4

    const v2, 0xffff

    invoke-virtual {v0, v1, v2}, Lce3/d0;->c(II)V

    const/4 v1, 0x5

    const/16 v2, 0x4000

    invoke-virtual {v0, v1, v2}, Lce3/d0;->c(II)V

    sput-object v0, Lce3/q;->a0:Lce3/d0;

    return-void
.end method

.method public constructor <init>(La3/i2;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, La3/i2;->e:Ljava/lang/Object;

    check-cast v0, Lce3/n;

    iput-object v0, p0, Lce3/q;->w:Lce3/n;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lce3/q;->x:Ljava/util/LinkedHashMap;

    iget-object v0, p1, La3/i2;->d:Ljava/io/Serializable;

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iput-object v0, p0, Lce3/q;->y:Ljava/lang/String;

    const/4 v2, 0x3

    iput v2, p0, Lce3/q;->E:I

    iget-object v2, p1, La3/i2;->b:Ljava/lang/Object;

    check-cast v2, Lyd3/d;

    iput-object v2, p0, Lce3/q;->G:Lyd3/d;

    invoke-virtual {v2}, Lyd3/d;->d()Lyd3/c;

    move-result-object v3

    iput-object v3, p0, Lce3/q;->H:Lyd3/c;

    invoke-virtual {v2}, Lyd3/d;->d()Lyd3/c;

    move-result-object v4

    iput-object v4, p0, Lce3/q;->I:Lyd3/c;

    invoke-virtual {v2}, Lyd3/d;->d()Lyd3/c;

    move-result-object v2

    iput-object v2, p0, Lce3/q;->J:Lyd3/c;

    sget-object v2, Lce3/c0;->a:Lce3/c0;

    iput-object v2, p0, Lce3/q;->K:Lce3/c0;

    iget-object v2, p1, La3/i2;->f:Ljava/lang/Object;

    check-cast v2, Lce3/b;

    iput-object v2, p0, Lce3/q;->Q:Lce3/b;

    new-instance v2, Lce3/d0;

    invoke-direct {v2}, Lce3/d0;-><init>()V

    const/4 v4, 0x4

    const/high16 v5, 0x1000000

    invoke-virtual {v2, v4, v5}, Lce3/d0;->c(II)V

    iput-object v2, p0, Lce3/q;->R:Lce3/d0;

    sget-object v2, Lce3/q;->a0:Lce3/d0;

    iput-object v2, p0, Lce3/q;->S:Lce3/d0;

    new-instance v4, Lde3/a;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lde3/a;-><init>(I)V

    iput-object v4, p0, Lce3/q;->T:Lde3/a;

    invoke-virtual {v2}, Lce3/d0;->a()I

    move-result v2

    int-to-long v4, v2

    iput-wide v4, p0, Lce3/q;->V:J

    iget-object v2, p1, La3/i2;->c:Ljava/lang/Object;

    check-cast v2, Ls/m2;

    if-eqz v2, :cond_1

    iput-object v2, p0, Lce3/q;->W:Ls/m2;

    new-instance v1, Lce3/z;

    iget-object v4, v2, Ls/m2;->y:Ljava/lang/Object;

    check-cast v4, Lne3/h0;

    invoke-direct {v1, v4}, Lce3/z;-><init>(Lne3/h0;)V

    iput-object v1, p0, Lce3/q;->X:Lce3/z;

    new-instance v1, Lce3/p;

    new-instance v4, Lce3/u;

    iget-object v2, v2, Ls/m2;->x:Ljava/lang/Object;

    check-cast v2, Lne3/j0;

    invoke-direct {v4, v2}, Lce3/u;-><init>(Lne3/j0;)V

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0, v4}, Lce3/p;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v1, p0, Lce3/q;->Y:Lce3/p;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v1, p0, Lce3/q;->Z:Ljava/util/LinkedHashSet;

    iget p1, p1, La3/i2;->a:I

    if-eqz p1, :cond_0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    int-to-long v4, p1

    invoke-virtual {v1, v4, v5}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v1

    const-string p1, " ping"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lce3/h;

    const/4 v4, 0x0

    invoke-direct {v0, p0, v1, v2, v4}, Lce3/h;-><init>(Ljava/lang/Object;JI)V

    const-string v4, "name"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lle3/f;

    invoke-direct {v4, p1, v0}, Lle3/f;-><init>(Ljava/lang/String;Lc93/a;)V

    invoke-virtual {v3, v4, v1, v2}, Lyd3/c;->d(Lyd3/a;J)V

    :cond_0
    return-void

    :cond_1
    const-string p1, "socket"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    const-string p1, "connectionName"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final J(IJ)V
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lce3/q;->y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] windowUpdate"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v6, Lce3/i;

    invoke-direct {v6, p0, p1, p2, p3}, Lce3/i;-><init>(Lce3/q;IJ)V

    const/4 v7, 0x6

    iget-object v2, p0, Lce3/q;->H:Lyd3/c;

    const-wide/16 v4, 0x0

    invoke-static/range {v2 .. v7}, Lyd3/c;->c(Lyd3/c;Ljava/lang/String;JLc93/a;I)V

    return-void
.end method

.method public final b(Lce3/a;Lce3/a;Ljava/io/IOException;)V
    .locals 3

    sget-object v0, Lwd3/h;->a:Ljava/util/TimeZone;

    :try_start_0
    invoke-virtual {p0, p1}, Lce3/q;->k(Lce3/a;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    monitor-enter p0

    :try_start_1
    iget-object p1, p0, Lce3/q;->x:Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    iget-object p1, p0, Lce3/q;->x:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    new-array v1, v0, [Lce3/y;

    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    iget-object v1, p0, Lce3/q;->x:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit p0

    check-cast p1, [Lce3/y;

    if-eqz p1, :cond_1

    array-length v1, p1

    :goto_1
    if-ge v0, v1, :cond_1

    aget-object v2, p1, v0

    :try_start_2
    invoke-virtual {v2, p2, p3}, Lce3/y;->c(Lce3/a;Ljava/io/IOException;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :try_start_3
    iget-object p1, p0, Lce3/q;->X:Lce3/z;

    invoke-virtual {p1}, Lce3/z;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    :try_start_4
    iget-object p1, p0, Lce3/q;->W:Ls/m2;

    invoke-virtual {p1}, Ls/m2;->cancel()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    :catch_3
    iget-object p1, p0, Lce3/q;->H:Lyd3/c;

    invoke-virtual {p1}, Lyd3/c;->g()V

    iget-object p1, p0, Lce3/q;->I:Lyd3/c;

    invoke-virtual {p1}, Lyd3/c;->g()V

    iget-object p1, p0, Lce3/q;->J:Lyd3/c;

    invoke-virtual {p1}, Lyd3/c;->g()V

    return-void

    :goto_2
    monitor-exit p0

    throw p1
.end method

.method public final close()V
    .locals 3

    sget-object v0, Lce3/a;->y:Lce3/a;

    sget-object v1, Lce3/a;->H:Lce3/a;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lce3/q;->b(Lce3/a;Lce3/a;Ljava/io/IOException;)V

    return-void
.end method

.method public final h(I)Lce3/y;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lce3/q;->x:Ljava/util/LinkedHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lce3/y;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final i(I)Lce3/y;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lce3/q;->x:Ljava/util/LinkedHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lce3/y;

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final k(Lce3/a;)V
    .locals 4

    iget-object v0, p0, Lce3/q;->X:Lce3/z;

    monitor-enter v0

    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-boolean v1, p0, Lce3/q;->F:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v1, :cond_0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :try_start_3
    iput-boolean v1, p0, Lce3/q;->F:Z

    iget v1, p0, Lce3/q;->z:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    monitor-exit p0

    iget-object v2, p0, Lce3/q;->X:Lce3/z;

    sget-object v3, Lwd3/f;->a:[B

    invoke-virtual {v2, v1, p1, v3}, Lce3/z;->k(ILce3/a;[B)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit v0

    return-void

    :catchall_1
    move-exception p1

    :try_start_5
    monitor-exit p0

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_0
    monitor-exit v0

    throw p1
.end method

.method public final m(J)V
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lce3/q;->T:Lde3/a;

    const-wide/16 v3, 0x0

    const/4 v5, 0x2

    move-wide v1, p1

    invoke-static/range {v0 .. v5}, Lde3/a;->b(Lde3/a;JJI)V

    iget-object p1, p0, Lce3/q;->T:Lde3/a;

    invoke-virtual {p1}, Lde3/a;->a()J

    move-result-wide v3

    iget-object p1, p0, Lce3/q;->R:Lce3/d0;

    invoke-virtual {p1}, Lce3/d0;->a()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    int-to-long p1, p1

    cmp-long p1, v3, p1

    if-ltz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1, v3, v4}, Lce3/q;->J(IJ)V

    iget-object v0, p0, Lce3/q;->T:Lde3/a;

    const-wide/16 v1, 0x0

    const/4 v5, 0x1

    invoke-static/range {v0 .. v5}, Lde3/a;->b(Lde3/a;JJI)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p1, p0, Lce3/q;->Q:Lce3/b;

    iget-object p2, p0, Lce3/q;->T:Lde3/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "windowCounter"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw p1
.end method

.method public final s(IZLne3/h;J)V
    .locals 8

    const-wide/16 v0, 0x0

    cmp-long v2, p4, v0

    const/4 v3, 0x0

    if-nez v2, :cond_0

    iget-object p4, p0, Lce3/q;->X:Lce3/z;

    invoke-virtual {p4, p2, p1, p3, v3}, Lce3/z;->h(ZILne3/h;I)V

    return-void

    :cond_0
    :goto_0
    cmp-long v2, p4, v0

    if-lez v2, :cond_4

    monitor-enter p0

    :goto_1
    :try_start_0
    iget-wide v4, p0, Lce3/q;->U:J

    iget-wide v6, p0, Lce3/q;->V:J

    cmp-long v2, v4, v6

    if-ltz v2, :cond_2

    iget-object v2, p0, Lce3/q;->x:Ljava/util/LinkedHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->wait()V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    sub-long/2addr v6, v4

    :try_start_1
    invoke-static {p4, p5, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    long-to-int v2, v4

    iget-object v4, p0, Lce3/q;->X:Lce3/z;

    iget v4, v4, Lce3/z;->y:I

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    iget-wide v4, p0, Lce3/q;->U:J

    int-to-long v6, v2

    add-long/2addr v4, v6

    iput-wide v4, p0, Lce3/q;->U:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    sub-long/2addr p4, v6

    iget-object v4, p0, Lce3/q;->X:Lce3/z;

    if-eqz p2, :cond_3

    cmp-long v5, p4, v0

    if-nez v5, :cond_3

    const/4 v5, 0x1

    goto :goto_2

    :cond_3
    move v5, v3

    :goto_2
    invoke-virtual {v4, v5, p1, p3, v2}, Lce3/z;->h(ZILne3/h;I)V

    goto :goto_0

    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    new-instance p1, Ljava/io/InterruptedIOException;

    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_3
    monitor-exit p0

    throw p1

    :cond_4
    return-void
.end method

.method public final x(ILce3/a;)V
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lce3/q;->y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] writeSynReset"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v6, Lce3/j;

    invoke-direct {v6, p0, p1, p2}, Lce3/j;-><init>(Lce3/q;ILce3/a;)V

    const/4 v7, 0x6

    iget-object v2, p0, Lce3/q;->H:Lyd3/c;

    const-wide/16 v4, 0x0

    invoke-static/range {v2 .. v7}, Lyd3/c;->c(Lyd3/c;Ljava/lang/String;JLc93/a;I)V

    return-void
.end method
