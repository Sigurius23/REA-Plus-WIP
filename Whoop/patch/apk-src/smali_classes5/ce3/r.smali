.class public final Lce3/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lae3/g;


# static fields
.field public static final g:Ljava/util/List;

.field public static final h:Ljava/util/List;


# instance fields
.field public final a:Lzd3/p;

.field public final b:Lae3/i;

.field public final c:Lce3/q;

.field public volatile d:Lce3/y;

.field public final e:Lud3/m0;

.field public volatile f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const-string v10, ":scheme"

    const-string v11, ":authority"

    const-string v0, "connection"

    const-string v1, "host"

    const-string v2, "keep-alive"

    const-string v3, "proxy-connection"

    const-string v4, "te"

    const-string v5, "transfer-encoding"

    const-string v6, "encoding"

    const-string v7, "upgrade"

    const-string v8, ":method"

    const-string v9, ":path"

    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwd3/h;->k([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lce3/r;->g:Ljava/util/List;

    const-string v7, "encoding"

    const-string v8, "upgrade"

    const-string v1, "connection"

    const-string v2, "host"

    const-string v3, "keep-alive"

    const-string v4, "proxy-connection"

    const-string v5, "te"

    const-string v6, "transfer-encoding"

    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwd3/h;->k([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lce3/r;->h:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lud3/l0;Lzd3/p;Lae3/i;Lce3/q;)V
    .locals 1

    const-string v0, "chain"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "http2Connection"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lce3/r;->a:Lzd3/p;

    iput-object p3, p0, Lce3/r;->b:Lae3/i;

    iput-object p4, p0, Lce3/r;->c:Lce3/q;

    iget-object p1, p1, Lud3/l0;->s:Ljava/util/List;

    sget-object p2, Lud3/m0;->G:Lud3/m0;

    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p2, Lud3/m0;->F:Lud3/m0;

    :goto_0
    iput-object p2, p0, Lce3/r;->e:Lud3/m0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lce3/r;->d:Lce3/y;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lce3/y;->I:Lce3/v;

    invoke-virtual {v0}, Lce3/v;->close()V

    return-void
.end method

.method public final b(Lud3/x0;)J
    .locals 2

    invoke-static {p1}, Lae3/h;->a(Lud3/x0;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    invoke-static {p1}, Lwd3/h;->e(Lud3/x0;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final c(Lud3/x0;)Lne3/p0;
    .locals 0

    iget-object p1, p0, Lce3/r;->d:Lce3/y;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p1, p1, Lce3/y;->H:Lce3/w;

    return-object p1
.end method

.method public final cancel()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lce3/r;->f:Z

    iget-object v0, p0, Lce3/r;->d:Lce3/y;

    if-eqz v0, :cond_0

    sget-object v1, Lce3/a;->H:Lce3/a;

    invoke-virtual {v0, v1}, Lce3/y;->f(Lce3/a;)V

    :cond_0
    return-void
.end method

.method public final d()Z
    .locals 5

    iget-object v0, p0, Lce3/r;->d:Lce3/y;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, Lce3/y;->H:Lce3/w;

    iget-boolean v3, v2, Lce3/w;->x:Z

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    iget-object v2, v2, Lce3/w;->z:Lne3/h;

    invoke-virtual {v2}, Lne3/h;->o()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    move v2, v1

    :goto_0
    monitor-exit v0

    if-ne v2, v4, :cond_1

    return v4

    :cond_1
    return v1

    :goto_1
    monitor-exit v0

    throw v1

    :cond_2
    return v1
.end method

.method public final e(Z)Lud3/w0;
    .locals 10

    iget-object v0, p0, Lce3/r;->d:Lce3/y;

    if-eqz v0, :cond_f

    monitor-enter v0

    :cond_0
    :goto_0
    :try_start_0
    iget-object v1, v0, Lce3/y;->F:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    invoke-virtual {v0}, Lce3/y;->g()Lce3/a;

    move-result-object v1

    if-nez v1, :cond_7

    const/4 v1, 0x1

    if-nez p1, :cond_3

    iget-object v3, v0, Lce3/y;->x:Lce3/q;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v0, Lce3/y;->I:Lce3/v;

    iget-boolean v4, v3, Lce3/v;->y:Z

    if-nez v4, :cond_2

    iget-boolean v3, v3, Lce3/v;->w:Z

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    move v3, v2

    goto :goto_2

    :cond_2
    :goto_1
    move v3, v1

    :goto_2
    if-eqz v3, :cond_4

    :cond_3
    move v2, v1

    :cond_4
    if-eqz v2, :cond_5

    iget-object v1, v0, Lce3/y;->J:Lce3/x;

    invoke-virtual {v1}, Lne3/d;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_8

    :cond_5
    :goto_3
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v2, :cond_0

    :try_start_2
    iget-object v1, v0, Lce3/y;->J:Lce3/x;

    invoke-virtual {v1}, Lce3/x;->l()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_4

    :catch_0
    :try_start_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    new-instance p1, Ljava/io/InterruptedIOException;

    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_4
    if-eqz v2, :cond_6

    :try_start_4
    iget-object v1, v0, Lce3/y;->J:Lce3/x;

    invoke-virtual {v1}, Lce3/x;->l()V

    :cond_6
    throw p1

    :cond_7
    iget-object v1, v0, Lce3/y;->F:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_d

    iget-object v1, v0, Lce3/y;->F:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    const-string v3, "removeFirst(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lud3/d0;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit v0

    iget-object v0, p0, Lce3/r;->e:Lud3/m0;

    const-string v3, "protocol"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lkotlin/jvm/internal/k0;

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5}, Lkotlin/jvm/internal/k0;-><init>(IZ)V

    invoke-virtual {v1}, Lud3/d0;->size()I

    move-result v4

    const/4 v5, 0x0

    move-object v6, v5

    :goto_5
    if-ge v2, v4, :cond_a

    invoke-virtual {v1, v2}, Lud3/d0;->c(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v2}, Lud3/d0;->g(I)Ljava/lang/String;

    move-result-object v8

    const-string v9, ":status"

    invoke-virtual {v7, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const-string v6, "HTTP/1.1 "

    invoke-virtual {v6, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroidx/room/c1;->I(Ljava/lang/String;)Lae3/k;

    move-result-object v6

    goto :goto_6

    :cond_8
    sget-object v9, Lce3/r;->h:Ljava/util/List;

    invoke-interface {v9, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_9

    invoke-virtual {v3, v7, v8}, Lkotlin/jvm/internal/k0;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_9
    :goto_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_a
    if-eqz v6, :cond_c

    new-instance v1, Lud3/w0;

    invoke-direct {v1}, Lud3/w0;-><init>()V

    iput-object v0, v1, Lud3/w0;->b:Lud3/m0;

    iget v0, v6, Lae3/k;->b:I

    iput v0, v1, Lud3/w0;->c:I

    iget-object v0, v6, Lae3/k;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iput-object v0, v1, Lud3/w0;->d:Ljava/lang/String;

    invoke-virtual {v3}, Lkotlin/jvm/internal/k0;->g()Lud3/d0;

    move-result-object v0

    invoke-virtual {v1, v0}, Lud3/w0;->c(Lud3/d0;)V

    if-eqz p1, :cond_b

    iget p1, v1, Lud3/w0;->c:I

    const/16 v0, 0x64

    if-ne p1, v0, :cond_b

    return-object v5

    :cond_b
    return-object v1

    :cond_c
    new-instance p1, Ljava/net/ProtocolException;

    const-string v0, "Expected \':status\' header not present"

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    :try_start_5
    iget-object p1, v0, Lce3/y;->M:Ljava/io/IOException;

    if-eqz p1, :cond_e

    goto :goto_7

    :cond_e
    new-instance p1, Lokhttp3/internal/http2/StreamResetException;

    invoke-virtual {v0}, Lce3/y;->g()Lce3/a;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {p1, v1}, Lokhttp3/internal/http2/StreamResetException;-><init>(Lce3/a;)V

    :goto_7
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_8
    monitor-exit v0

    throw p1

    :cond_f
    new-instance p1, Ljava/io/IOException;

    const-string v0, "stream wasn\'t created"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f(Lud3/o0;)V
    .locals 14

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lce3/r;->d:Lce3/y;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p1, Lud3/o0;->d:Lud3/v0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    iget-object v3, p1, Lud3/o0;->c:Lud3/d0;

    new-instance v4, Ljava/util/ArrayList;

    invoke-virtual {v3}, Lud3/d0;->size()I

    move-result v5

    add-int/lit8 v5, v5, 0x4

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v5, Lce3/c;

    sget-object v6, Lce3/c;->f:Lne3/l;

    iget-object v7, p1, Lud3/o0;->b:Ljava/lang/String;

    invoke-direct {v5, v7, v6}, Lce3/c;-><init>(Ljava/lang/String;Lne3/l;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v5, Lce3/c;

    sget-object v6, Lce3/c;->g:Lne3/l;

    iget-object v7, p1, Lud3/o0;->a:Lud3/e0;

    const-string v8, "url"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7}, Lud3/e0;->b()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7}, Lud3/e0;->d()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_2

    const/16 v10, 0x3f

    invoke-static {v10, v8, v9}, Ldc/b;->k(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    :cond_2
    invoke-direct {v5, v8, v6}, Lce3/c;-><init>(Ljava/lang/String;Lne3/l;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v5, "Host"

    iget-object p1, p1, Lud3/o0;->c:Lud3/d0;

    invoke-virtual {p1, v5}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    new-instance v5, Lce3/c;

    sget-object v6, Lce3/c;->i:Lne3/l;

    invoke-direct {v5, p1, v6}, Lce3/c;-><init>(Ljava/lang/String;Lne3/l;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    new-instance p1, Lce3/c;

    sget-object v5, Lce3/c;->h:Lne3/l;

    iget-object v6, v7, Lud3/e0;->a:Ljava/lang/String;

    invoke-direct {p1, v6, v5}, Lce3/c;-><init>(Ljava/lang/String;Lne3/l;)V

    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Lud3/d0;->size()I

    move-result p1

    move v5, v1

    :goto_1
    if-ge v5, p1, :cond_6

    invoke-virtual {v3, v5}, Lud3/d0;->c(I)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v8, "US"

    const-string v9, "toLowerCase(...)"

    invoke-static {v7, v8, v6, v7, v9}, Lr80/c;->q(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lce3/r;->g:Ljava/util/List;

    invoke-interface {v7, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const-string v7, "te"

    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-virtual {v3, v5}, Lud3/d0;->g(I)Ljava/lang/String;

    move-result-object v7

    const-string v8, "trailers"

    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    :cond_4
    new-instance v7, Lce3/c;

    invoke-virtual {v3, v5}, Lud3/d0;->g(I)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v6, v8}, Lce3/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_6
    iget-object v8, p0, Lce3/r;->c:Lce3/q;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    xor-int/lit8 v9, v0, 0x1

    iget-object p1, v8, Lce3/q;->X:Lce3/z;

    monitor-enter p1

    :try_start_0
    monitor-enter v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget v3, v8, Lce3/q;->E:I

    const v5, 0x3fffffff    # 1.9999999f

    if-le v3, v5, :cond_7

    sget-object v3, Lce3/a;->G:Lce3/a;

    invoke-virtual {v8, v3}, Lce3/q;->k(Lce3/a;)V

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :cond_7
    :goto_2
    iget-boolean v3, v8, Lce3/q;->F:Z

    if-nez v3, :cond_d

    iget v7, v8, Lce3/q;->E:I

    add-int/lit8 v3, v7, 0x2

    iput v3, v8, Lce3/q;->E:I

    new-instance v6, Lce3/y;

    const/4 v11, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v11}, Lce3/y;-><init>(ILce3/q;ZZLud3/d0;)V

    if-eqz v0, :cond_8

    iget-wide v10, v8, Lce3/q;->U:J

    iget-wide v12, v8, Lce3/q;->V:J

    cmp-long v0, v10, v12

    if-gez v0, :cond_8

    iget-wide v10, v6, Lce3/y;->z:J

    iget-wide v12, v6, Lce3/y;->E:J

    cmp-long v0, v10, v12

    if-ltz v0, :cond_9

    :cond_8
    move v1, v2

    :cond_9
    invoke-virtual {v6}, Lce3/y;->i()Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, v8, Lce3/q;->x:Ljava/util/LinkedHashMap;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_a
    :try_start_2
    monitor-exit v8

    iget-object v0, v8, Lce3/q;->X:Lce3/z;

    invoke-virtual {v0, v9, v7, v4}, Lce3/z;->m(ZILjava/util/ArrayList;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit p1

    if-eqz v1, :cond_b

    iget-object p1, v8, Lce3/q;->X:Lce3/z;

    invoke-virtual {p1}, Lce3/z;->flush()V

    :cond_b
    iput-object v6, p0, Lce3/r;->d:Lce3/y;

    iget-boolean p1, p0, Lce3/r;->f:Z

    if-nez p1, :cond_c

    iget-object p1, p0, Lce3/r;->d:Lce3/y;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p1, p1, Lce3/y;->J:Lce3/x;

    iget-object v0, p0, Lce3/r;->b:Lae3/i;

    iget v0, v0, Lae3/i;->g:I

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Lne3/r0;->g(JLjava/util/concurrent/TimeUnit;)Lne3/r0;

    iget-object p1, p0, Lce3/r;->d:Lce3/y;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p1, p1, Lce3/y;->K:Lce3/x;

    iget-object v0, p0, Lce3/r;->b:Lae3/i;

    iget v0, v0, Lae3/i;->h:I

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1, v2}, Lne3/r0;->g(JLjava/util/concurrent/TimeUnit;)Lne3/r0;

    return-void

    :cond_c
    iget-object p1, p0, Lce3/r;->d:Lce3/y;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object v0, Lce3/a;->H:Lce3/a;

    invoke-virtual {p1, v0}, Lce3/y;->f(Lce3/a;)V

    new-instance p1, Ljava/io/IOException;

    const-string v0, "Canceled"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_1
    move-exception v0

    goto :goto_4

    :cond_d
    :try_start_3
    new-instance v0, Lokhttp3/internal/http2/ConnectionShutdownException;

    invoke-direct {v0}, Lokhttp3/internal/http2/ConnectionShutdownException;-><init>()V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_3
    :try_start_4
    monitor-exit v8

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_4
    monitor-exit p1

    throw v0
.end method

.method public final g(Lud3/o0;J)Lne3/n0;
    .locals 0

    const-string p2, "request"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lce3/r;->d:Lce3/y;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p1, p1, Lce3/y;->I:Lce3/v;

    return-object p1
.end method

.method public final h()V
    .locals 1

    iget-object v0, p0, Lce3/r;->c:Lce3/q;

    iget-object v0, v0, Lce3/q;->X:Lce3/z;

    invoke-virtual {v0}, Lce3/z;->flush()V

    return-void
.end method

.method public final i()Lne3/o0;
    .locals 1

    iget-object v0, p0, Lce3/r;->d:Lce3/y;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final j()Lae3/f;
    .locals 1

    iget-object v0, p0, Lce3/r;->a:Lzd3/p;

    return-object v0
.end method
