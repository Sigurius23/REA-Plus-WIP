.class public final Loe3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lne3/p0;


# instance fields
.field public final w:Ljava/io/InputStream;

.field public final x:Loe3/h;

.field public final synthetic y:Lzt/q;


# direct methods
.method public constructor <init>(Lzt/q;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loe3/e;->y:Lzt/q;

    iget-object p1, p1, Lzt/q;->x:Ljava/lang/Object;

    check-cast p1, Ljava/net/Socket;

    invoke-virtual {p1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    iput-object v0, p0, Loe3/e;->w:Ljava/io/InputStream;

    new-instance v0, Loe3/h;

    invoke-direct {v0, p1}, Loe3/h;-><init>(Ljava/net/Socket;)V

    iput-object v0, p0, Loe3/e;->x:Loe3/h;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 5

    iget-object v0, p0, Loe3/e;->y:Lzt/q;

    iget-object v1, p0, Loe3/e;->x:Loe3/h;

    invoke-virtual {v1}, Lne3/d;->i()V

    :try_start_0
    iget-object v2, v0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v0, v0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Ljava/net/Socket;

    const-string v3, "<this>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v3

    and-int/lit8 v4, v3, 0x2

    if-eqz v4, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    or-int/lit8 v4, v3, 0x2

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v3

    if-eqz v3, :cond_0

    move v2, v4

    :goto_0
    if-eqz v2, :cond_6

    const/4 v3, 0x3

    if-eq v2, v3, :cond_4

    invoke-virtual {v0}, Ljava/net/Socket;->isClosed()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {v0}, Ljava/net/Socket;->isInputShutdown()Z

    move-result v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    :try_start_1
    invoke-virtual {v0}, Ljava/net/Socket;->shutdownInput()V
    :try_end_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_5

    :catch_0
    move-exception v0

    goto :goto_3

    :catch_1
    :try_start_2
    iget-object v0, p0, Loe3/e;->w:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :cond_3
    :goto_1
    invoke-virtual {v1}, Lne3/d;->j()Z

    return-void

    :cond_4
    :try_start_3
    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_2
    invoke-virtual {v1}, Lne3/d;->j()Z

    move-result v0

    if-nez v0, :cond_5

    return-void

    :cond_5
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Loe3/h;->l(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    :cond_6
    invoke-virtual {v1}, Lne3/d;->j()Z

    return-void

    :goto_3
    :try_start_4
    invoke-virtual {v1}, Lne3/d;->j()Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_4

    :cond_7
    invoke-virtual {v1, v0}, Loe3/h;->l(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    :goto_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_5
    invoke-virtual {v1}, Lne3/d;->j()Z

    throw v0
.end method

.method public final h1(Lne3/h;J)J
    .locals 4

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-nez v2, :cond_0

    return-wide v0

    :cond_0
    if-ltz v2, :cond_6

    iget-object v0, p0, Loe3/e;->x:Loe3/h;

    invoke-virtual {v0}, Lne3/r0;->f()V

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lne3/h;->k1(I)Lne3/k0;

    move-result-object v1

    iget v2, v1, Lne3/k0;->c:I

    rsub-int v2, v2, 0x2000

    int-to-long v2, v2

    invoke-static {p2, p3, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    long-to-int p2, p2

    :try_start_0
    invoke-virtual {v0}, Lne3/d;->i()V
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object p3, p0, Loe3/e;->w:Ljava/io/InputStream;

    iget-object v2, v1, Lne3/k0;->a:[B

    iget v3, v1, Lne3/k0;->c:I

    invoke-virtual {p3, v2, v3, p2}, Ljava/io/InputStream;->read([BII)I

    move-result p2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v0}, Lne3/d;->j()Z

    move-result p3
    :try_end_2
    .catch Ljava/lang/AssertionError; {:try_start_2 .. :try_end_2} :catch_0

    if-nez p3, :cond_3

    const/4 p3, -0x1

    if-ne p2, p3, :cond_2

    iget p2, v1, Lne3/k0;->b:I

    iget p3, v1, Lne3/k0;->c:I

    if-ne p2, p3, :cond_1

    invoke-virtual {v1}, Lne3/k0;->a()Lne3/k0;

    move-result-object p2

    iput-object p2, p1, Lne3/h;->w:Lne3/k0;

    invoke-static {v1}, Lne3/l0;->a(Lne3/k0;)V

    :cond_1
    const-wide/16 p1, -0x1

    return-wide p1

    :cond_2
    iget p3, v1, Lne3/k0;->c:I

    add-int/2addr p3, p2

    iput p3, v1, Lne3/k0;->c:I

    iget-wide v0, p1, Lne3/h;->x:J

    int-to-long p2, p2

    add-long/2addr v0, p2

    iput-wide v0, p1, Lne3/h;->x:J

    return-wide p2

    :cond_3
    const/4 p1, 0x0

    :try_start_3
    invoke-virtual {v0, p1}, Loe3/h;->l(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_3
    .catch Ljava/lang/AssertionError; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    move-exception p1

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    :try_start_4
    invoke-virtual {v0}, Lne3/d;->j()Z

    move-result p2

    if-nez p2, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {v0, p1}, Loe3/h;->l(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    :goto_0
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_1
    :try_start_5
    invoke-virtual {v0}, Lne3/d;->j()Z

    throw p1
    :try_end_5
    .catch Ljava/lang/AssertionError; {:try_start_5 .. :try_end_5} :catch_0

    :goto_2
    invoke-static {p1}, Loe3/k;->b(Ljava/lang/AssertionError;)Z

    move-result p2

    if-eqz p2, :cond_5

    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_5
    throw p1

    :cond_6
    const-string p1, "byteCount < 0: "

    invoke-static {p2, p3, p1}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final timeout()Lne3/r0;
    .locals 1

    iget-object v0, p0, Loe3/e;->x:Loe3/h;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "source("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Loe3/e;->y:Lzt/q;

    iget-object v1, v1, Lzt/q;->x:Ljava/lang/Object;

    check-cast v1, Ljava/net/Socket;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
