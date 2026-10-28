.class public final Lce3/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lne3/o0;


# instance fields
.field public E:J

.field public final F:Ljava/util/ArrayDeque;

.field public G:Z

.field public final H:Lce3/w;

.field public final I:Lce3/v;

.field public final J:Lce3/x;

.field public final K:Lce3/x;

.field public L:Lce3/a;

.field public M:Ljava/io/IOException;

.field public final w:I

.field public final x:Lce3/q;

.field public final y:Lde3/a;

.field public z:J


# direct methods
.method public constructor <init>(ILce3/q;ZZLud3/d0;)V
    .locals 3

    const-string v0, "connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lce3/y;->w:I

    iput-object p2, p0, Lce3/y;->x:Lce3/q;

    new-instance v0, Lde3/a;

    invoke-direct {v0, p1}, Lde3/a;-><init>(I)V

    iput-object v0, p0, Lce3/y;->y:Lde3/a;

    iget-object p1, p2, Lce3/q;->S:Lce3/d0;

    invoke-virtual {p1}, Lce3/d0;->a()I

    move-result p1

    int-to-long v0, p1

    iput-wide v0, p0, Lce3/y;->E:J

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lce3/y;->F:Ljava/util/ArrayDeque;

    new-instance v0, Lce3/w;

    iget-object p2, p2, Lce3/q;->R:Lce3/d0;

    invoke-virtual {p2}, Lce3/d0;->a()I

    move-result p2

    int-to-long v1, p2

    invoke-direct {v0, p0, v1, v2, p4}, Lce3/w;-><init>(Lce3/y;JZ)V

    iput-object v0, p0, Lce3/y;->H:Lce3/w;

    new-instance p2, Lce3/v;

    invoke-direct {p2, p0, p3}, Lce3/v;-><init>(Lce3/y;Z)V

    iput-object p2, p0, Lce3/y;->I:Lce3/v;

    new-instance p2, Lce3/x;

    invoke-direct {p2, p0}, Lce3/x;-><init>(Lce3/y;)V

    iput-object p2, p0, Lce3/y;->J:Lce3/x;

    new-instance p2, Lce3/x;

    invoke-direct {p2, p0}, Lce3/x;-><init>(Lce3/y;)V

    iput-object p2, p0, Lce3/y;->K:Lce3/x;

    if-eqz p5, :cond_1

    invoke-virtual {p0}, Lce3/y;->h()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p1, p5}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "locally-initiated streams shouldn\'t have headers yet"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {p0}, Lce3/y;->h()Z

    move-result p1

    if-eqz p1, :cond_2

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "remotely-initiated streams should have headers"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()V
    .locals 2

    sget-object v0, Lwd3/h;->a:Ljava/util/TimeZone;

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lce3/y;->H:Lce3/w;

    iget-boolean v1, v0, Lce3/w;->x:Z

    if-nez v1, :cond_1

    iget-boolean v0, v0, Lce3/w;->E:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lce3/y;->I:Lce3/v;

    iget-boolean v1, v0, Lce3/v;->w:Z

    if-nez v1, :cond_0

    iget-boolean v0, v0, Lce3/v;->y:Z

    if-eqz v0, :cond_1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    :goto_0
    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p0}, Lce3/y;->i()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    if-eqz v0, :cond_2

    sget-object v0, Lce3/a;->H:Lce3/a;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lce3/y;->c(Lce3/a;Ljava/io/IOException;)V

    return-void

    :cond_2
    if-nez v1, :cond_3

    iget-object v0, p0, Lce3/y;->x:Lce3/q;

    iget v1, p0, Lce3/y;->w:I

    invoke-virtual {v0, v1}, Lce3/q;->i(I)Lce3/y;

    :cond_3
    return-void

    :goto_2
    monitor-exit p0

    throw v0
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lce3/y;->I:Lce3/v;

    iget-boolean v1, v0, Lce3/v;->y:Z

    if-nez v1, :cond_3

    iget-boolean v0, v0, Lce3/v;->w:Z

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lce3/y;->g()Lce3/a;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lce3/y;->M:Ljava/io/IOException;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lokhttp3/internal/http2/StreamResetException;

    invoke-virtual {p0}, Lce3/y;->g()Lce3/a;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Lokhttp3/internal/http2/StreamResetException;-><init>(Lce3/a;)V

    :goto_0
    throw v0

    :cond_1
    return-void

    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "stream finished"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "stream closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c(Lce3/a;Ljava/io/IOException;)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Lce3/y;->e(Lce3/a;Ljava/io/IOException;)Z

    move-result p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget p2, p0, Lce3/y;->w:I

    iget-object v0, p0, Lce3/y;->x:Lce3/q;

    iget-object v0, v0, Lce3/q;->X:Lce3/z;

    invoke-virtual {v0, p2, p1}, Lce3/z;->x(ILce3/a;)V

    return-void
.end method

.method public final cancel()V
    .locals 1

    sget-object v0, Lce3/a;->H:Lce3/a;

    invoke-virtual {p0, v0}, Lce3/y;->f(Lce3/a;)V

    return-void
.end method

.method public final d()Lne3/n0;
    .locals 1

    iget-object v0, p0, Lce3/y;->I:Lce3/v;

    return-object v0
.end method

.method public final e(Lce3/a;Ljava/io/IOException;)Z
    .locals 2

    sget-object v0, Lwd3/h;->a:Ljava/util/TimeZone;

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lce3/y;->g()Lce3/a;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    iput-object p1, p0, Lce3/y;->L:Lce3/a;

    iput-object p2, p0, Lce3/y;->M:Ljava/io/IOException;

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    iget-object p1, p0, Lce3/y;->H:Lce3/w;

    iget-boolean p1, p1, Lce3/w;->x:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lce3/y;->I:Lce3/v;

    iget-boolean p1, p1, Lce3/v;->w:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_1

    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    monitor-exit p0

    iget-object p1, p0, Lce3/y;->x:Lce3/q;

    iget p2, p0, Lce3/y;->w:I

    invoke-virtual {p1, p2}, Lce3/q;->i(I)Lce3/y;

    const/4 p1, 0x1

    return p1

    :goto_0
    monitor-exit p0

    throw p1
.end method

.method public final f(Lce3/a;)V
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lce3/y;->e(Lce3/a;Ljava/io/IOException;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lce3/y;->x:Lce3/q;

    iget v1, p0, Lce3/y;->w:I

    invoke-virtual {v0, v1, p1}, Lce3/q;->x(ILce3/a;)V

    return-void
.end method

.method public final g()Lce3/a;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lce3/y;->L:Lce3/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final getSource()Lne3/p0;
    .locals 1

    iget-object v0, p0, Lce3/y;->H:Lce3/w;

    return-object v0
.end method

.method public final h()Z
    .locals 4

    iget v0, p0, Lce3/y;->w:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iget-object v3, p0, Lce3/y;->x:Lce3/q;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ne v1, v0, :cond_1

    return v1

    :cond_1
    return v2
.end method

.method public final i()Z
    .locals 3

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lce3/y;->g()Lce3/a;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lce3/y;->H:Lce3/w;

    iget-boolean v2, v0, Lce3/w;->x:Z

    if-nez v2, :cond_1

    iget-boolean v0, v0, Lce3/w;->E:Z

    if-eqz v0, :cond_3

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lce3/y;->I:Lce3/v;

    iget-boolean v2, v0, Lce3/v;->w:Z

    if-nez v2, :cond_2

    iget-boolean v0, v0, Lce3/v;->y:Z

    if-eqz v0, :cond_3

    :cond_2
    iget-boolean v0, p0, Lce3/y;->G:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_3

    monitor-exit p0

    return v1

    :cond_3
    monitor-exit p0

    const/4 v0, 0x1

    return v0

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public final j(Lud3/d0;Z)V
    .locals 2

    const-string v0, "headers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lwd3/h;->a:Ljava/util/TimeZone;

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lce3/y;->G:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    const-string v0, ":status"

    invoke-virtual {p1, v0}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, ":method"

    invoke-virtual {p1, v0}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lce3/y;->H:Lce3/w;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    iput-boolean v1, p0, Lce3/y;->G:Z

    iget-object v0, p0, Lce3/y;->F:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    :goto_1
    if-eqz p2, :cond_2

    iget-object p1, p0, Lce3/y;->H:Lce3/w;

    iput-boolean v1, p1, Lce3/w;->x:Z

    :cond_2
    invoke-virtual {p0}, Lce3/y;->i()Z

    move-result p1

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    if-nez p1, :cond_3

    iget-object p1, p0, Lce3/y;->x:Lce3/q;

    iget p2, p0, Lce3/y;->w:I

    invoke-virtual {p1, p2}, Lce3/q;->i(I)Lce3/y;

    :cond_3
    return-void

    :goto_2
    monitor-exit p0

    throw p1
.end method
