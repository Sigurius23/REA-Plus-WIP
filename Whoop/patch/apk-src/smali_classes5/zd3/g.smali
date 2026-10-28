.class public final Lzd3/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lzd3/o;

.field public final b:Lud3/a0;

.field public final c:Lzd3/h;

.field public final d:Lae3/g;

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>(Lzd3/o;Lud3/a0;Lzd3/h;Lae3/g;)V
    .locals 1

    const-string v0, "eventListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "finder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd3/g;->a:Lzd3/o;

    iput-object p2, p0, Lzd3/g;->b:Lud3/a0;

    iput-object p3, p0, Lzd3/g;->c:Lzd3/h;

    iput-object p4, p0, Lzd3/g;->d:Lae3/g;

    return-void
.end method

.method public static a(Lzd3/g;JZLjava/io/IOException;I)Ljava/io/IOException;
    .locals 7

    iget-object v0, p0, Lzd3/g;->a:Lzd3/o;

    and-int/lit8 v1, p5, 0x4

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    move p5, v3

    goto :goto_1

    :cond_1
    move p5, v2

    :goto_1
    iget-object v4, p0, Lzd3/g;->b:Lud3/a0;

    if-eqz p4, :cond_2

    invoke-virtual {p0, p4}, Lzd3/g;->f(Ljava/io/IOException;)V

    :cond_2
    if-eqz p5, :cond_4

    if-eqz p4, :cond_3

    invoke-virtual {v4, v0, p4}, Lud3/a0;->requestFailed(Lud3/j;Ljava/io/IOException;)V

    goto :goto_2

    :cond_3
    invoke-virtual {v4, v0, p1, p2}, Lud3/a0;->requestBodyEnd(Lud3/j;J)V

    :cond_4
    :goto_2
    if-eqz v1, :cond_6

    if-eqz p4, :cond_5

    invoke-virtual {v4, v0, p4}, Lud3/a0;->responseFailed(Lud3/j;Ljava/io/IOException;)V

    goto :goto_3

    :cond_5
    invoke-virtual {v4, v0, p1, p2}, Lud3/a0;->responseBodyEnd(Lud3/j;J)V

    :cond_6
    :goto_3
    if-eqz p5, :cond_7

    if-nez p3, :cond_7

    move p1, v2

    goto :goto_4

    :cond_7
    move p1, v2

    move v2, v3

    :goto_4
    if-eqz v1, :cond_8

    if-nez p3, :cond_8

    move p2, v3

    move v3, p1

    goto :goto_5

    :cond_8
    move p2, v3

    :goto_5
    if-eqz p5, :cond_9

    if-eqz p3, :cond_9

    move v5, p1

    goto :goto_6

    :cond_9
    move v5, p2

    :goto_6
    if-eqz v1, :cond_a

    if-eqz p3, :cond_a

    move v4, p1

    :goto_7
    move-object v1, p0

    move-object v6, p4

    goto :goto_8

    :cond_a
    move v4, p2

    goto :goto_7

    :goto_8
    invoke-virtual/range {v0 .. v6}, Lzd3/o;->h(Lzd3/g;ZZZZLjava/io/IOException;)Ljava/io/IOException;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Lud3/o0;Z)Lzd3/e;
    .locals 6

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-boolean p2, p0, Lzd3/g;->e:Z

    iget-object p2, p1, Lud3/o0;->d:Lud3/v0;

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lud3/v0;->contentLength()J

    move-result-wide v3

    iget-object p2, p0, Lzd3/g;->b:Lud3/a0;

    iget-object v0, p0, Lzd3/g;->a:Lzd3/o;

    invoke-virtual {p2, v0}, Lud3/a0;->requestBodyStart(Lud3/j;)V

    iget-object p2, p0, Lzd3/g;->d:Lae3/g;

    invoke-interface {p2, p1, v3, v4}, Lae3/g;->g(Lud3/o0;J)Lne3/n0;

    move-result-object v2

    new-instance v0, Lzd3/e;

    const/4 v5, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lzd3/e;-><init>(Lzd3/g;Lne3/n0;JZ)V

    return-object v0
.end method

.method public final c()Lzd3/p;
    .locals 2

    iget-object v0, p0, Lzd3/g;->d:Lae3/g;

    invoke-interface {v0}, Lae3/g;->j()Lae3/f;

    move-result-object v0

    instance-of v1, v0, Lzd3/p;

    if-eqz v1, :cond_0

    check-cast v0, Lzd3/p;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "no connection for CONNECT tunnels"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d(Lud3/x0;)Lae3/j;
    .locals 8

    iget-object v0, p0, Lzd3/g;->d:Lae3/g;

    :try_start_0
    const-string v1, "Content-Type"

    iget-object v2, p1, Lud3/x0;->F:Lud3/d0;

    invoke-virtual {v2, v1}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    :cond_0
    invoke-interface {v0, p1}, Lae3/g;->b(Lud3/x0;)J

    move-result-wide v5

    invoke-interface {v0, p1}, Lae3/g;->c(Lud3/x0;)Lne3/p0;

    move-result-object v4

    new-instance v2, Lzd3/f;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v7, 0x0

    move-object v3, p0

    :try_start_1
    invoke-direct/range {v2 .. v7}, Lzd3/f;-><init>(Lzd3/g;Lne3/p0;JZ)V

    new-instance p1, Lae3/j;

    invoke-static {v2}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v0

    invoke-direct {p1, v1, v5, v6, v0}, Lae3/j;-><init>(Ljava/lang/String;JLne3/j0;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    :goto_0
    move-object p1, v0

    goto :goto_1

    :catch_1
    move-exception v0

    move-object v3, p0

    goto :goto_0

    :goto_1
    iget-object v0, v3, Lzd3/g;->b:Lud3/a0;

    iget-object v1, v3, Lzd3/g;->a:Lzd3/o;

    invoke-virtual {v0, v1, p1}, Lud3/a0;->responseFailed(Lud3/j;Ljava/io/IOException;)V

    invoke-virtual {p0, p1}, Lzd3/g;->f(Ljava/io/IOException;)V

    throw p1
.end method

.method public final e(Z)Lud3/w0;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lzd3/g;->d:Lae3/g;

    invoke-interface {v0, p1}, Lae3/g;->e(Z)Lud3/w0;

    move-result-object p1

    if-eqz p1, :cond_0

    iput-object p0, p1, Lud3/w0;->n:Lzd3/g;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    return-object p1

    :goto_0
    iget-object v0, p0, Lzd3/g;->b:Lud3/a0;

    iget-object v1, p0, Lzd3/g;->a:Lzd3/o;

    invoke-virtual {v0, v1, p1}, Lud3/a0;->responseFailed(Lud3/j;Ljava/io/IOException;)V

    invoke-virtual {p0, p1}, Lzd3/g;->f(Ljava/io/IOException;)V

    throw p1
.end method

.method public final f(Ljava/io/IOException;)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzd3/g;->f:Z

    iget-object v0, p0, Lzd3/g;->d:Lae3/g;

    invoke-interface {v0}, Lae3/g;->j()Lae3/f;

    move-result-object v0

    iget-object v1, p0, Lzd3/g;->a:Lzd3/o;

    invoke-interface {v0, v1, p1}, Lae3/f;->h(Lzd3/o;Ljava/io/IOException;)V

    return-void
.end method

.method public final g()Lz63/d;
    .locals 3

    iget-object v0, p0, Lzd3/g;->a:Lzd3/o;

    iget-boolean v1, v0, Lzd3/o;->K:Z

    if-nez v1, :cond_4

    const/4 v1, 0x1

    iput-boolean v1, v0, Lzd3/o;->K:Z

    iget-object v2, v0, Lzd3/o;->F:Lzd3/n;

    invoke-virtual {v2}, Lne3/d;->j()Z

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, Lzd3/o;->S:Lzd3/g;

    if-eqz v2, :cond_3

    iget-boolean v2, v0, Lzd3/o;->O:Z

    if-nez v2, :cond_2

    iget-boolean v2, v0, Lzd3/o;->P:Z

    if-nez v2, :cond_2

    iget-boolean v2, v0, Lzd3/o;->M:Z

    if-nez v2, :cond_1

    iget-boolean v2, v0, Lzd3/o;->N:Z

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    iput-boolean v2, v0, Lzd3/o;->N:Z

    iput-boolean v1, v0, Lzd3/o;->O:Z

    iput-boolean v1, v0, Lzd3/o;->P:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    iget-object v0, p0, Lzd3/g;->d:Lae3/g;

    invoke-interface {v0}, Lae3/g;->j()Lae3/f;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type okhttp3.internal.connection.RealConnection"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lzd3/p;

    iget-object v1, v0, Lzd3/p;->e:Ljava/net/Socket;

    invoke-virtual {v1, v2}, Ljava/net/Socket;->setSoTimeout(I)V

    invoke-virtual {v0}, Lzd3/p;->c()V

    new-instance v0, Lz63/d;

    invoke-direct {v0, p0}, Lz63/d;-><init>(Lzd3/g;)V

    return-object v0

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Check failed."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Check failed."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Check failed."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Check failed."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit v0

    throw v1

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
