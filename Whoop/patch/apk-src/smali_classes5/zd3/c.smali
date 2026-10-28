.class public final Lzd3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzd3/v;
.implements Lae3/f;


# instance fields
.field public final a:Lyd3/d;

.field public final b:Lzd3/q;

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:Z

.field public final i:Lzd3/o;

.field public final j:Lzd3/r;

.field public final k:Lud3/b1;

.field public final l:Ljava/util/List;

.field public final m:I

.field public final n:Lud3/o0;

.field public final o:I

.field public final p:Z

.field public volatile q:Z

.field public r:Ljava/net/Socket;

.field public s:Ljava/net/Socket;

.field public t:Lud3/c0;

.field public u:Lud3/m0;

.field public v:Ls/m2;

.field public w:Lzd3/p;


# direct methods
.method public constructor <init>(Lyd3/d;Lzd3/q;IIIIIZLzd3/o;Lzd3/r;Lud3/b1;Ljava/util/List;ILud3/o0;IZ)V
    .locals 1

    const-string v0, "taskRunner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionPool"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "route"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd3/c;->a:Lyd3/d;

    iput-object p2, p0, Lzd3/c;->b:Lzd3/q;

    iput p3, p0, Lzd3/c;->c:I

    iput p4, p0, Lzd3/c;->d:I

    iput p5, p0, Lzd3/c;->e:I

    iput p6, p0, Lzd3/c;->f:I

    iput p7, p0, Lzd3/c;->g:I

    iput-boolean p8, p0, Lzd3/c;->h:Z

    iput-object p9, p0, Lzd3/c;->i:Lzd3/o;

    iput-object p10, p0, Lzd3/c;->j:Lzd3/r;

    iput-object p11, p0, Lzd3/c;->k:Lud3/b1;

    iput-object p12, p0, Lzd3/c;->l:Ljava/util/List;

    iput p13, p0, Lzd3/c;->m:I

    iput-object p14, p0, Lzd3/c;->n:Lud3/o0;

    move/from16 p1, p15

    iput p1, p0, Lzd3/c;->o:I

    move/from16 p1, p16

    iput-boolean p1, p0, Lzd3/c;->p:Z

    return-void
.end method

.method public static l(Lzd3/c;ILud3/o0;IZI)Lzd3/c;
    .locals 19

    move-object/from16 v0, p0

    and-int/lit8 v1, p5, 0x1

    if-eqz v1, :cond_0

    iget v1, v0, Lzd3/c;->m:I

    move v15, v1

    goto :goto_0

    :cond_0
    move/from16 v15, p1

    :goto_0
    and-int/lit8 v1, p5, 0x2

    if-eqz v1, :cond_1

    iget-object v1, v0, Lzd3/c;->n:Lud3/o0;

    move-object/from16 v16, v1

    goto :goto_1

    :cond_1
    move-object/from16 v16, p2

    :goto_1
    and-int/lit8 v1, p5, 0x4

    if-eqz v1, :cond_2

    iget v1, v0, Lzd3/c;->o:I

    move/from16 v17, v1

    goto :goto_2

    :cond_2
    move/from16 v17, p3

    :goto_2
    and-int/lit8 v1, p5, 0x8

    if-eqz v1, :cond_3

    iget-boolean v1, v0, Lzd3/c;->p:Z

    move/from16 v18, v1

    goto :goto_3

    :cond_3
    move/from16 v18, p4

    :goto_3
    new-instance v2, Lzd3/c;

    iget-object v3, v0, Lzd3/c;->a:Lyd3/d;

    iget-object v4, v0, Lzd3/c;->b:Lzd3/q;

    iget v5, v0, Lzd3/c;->c:I

    iget v6, v0, Lzd3/c;->d:I

    iget v7, v0, Lzd3/c;->e:I

    iget v8, v0, Lzd3/c;->f:I

    iget v9, v0, Lzd3/c;->g:I

    iget-boolean v10, v0, Lzd3/c;->h:Z

    iget-object v11, v0, Lzd3/c;->i:Lzd3/o;

    iget-object v12, v0, Lzd3/c;->j:Lzd3/r;

    iget-object v13, v0, Lzd3/c;->k:Lud3/b1;

    iget-object v14, v0, Lzd3/c;->l:Ljava/util/List;

    invoke-direct/range {v2 .. v18}, Lzd3/c;-><init>(Lyd3/d;Lzd3/q;IIIIIZLzd3/o;Lzd3/r;Lud3/b1;Ljava/util/List;ILud3/o0;IZ)V

    return-object v2
.end method


# virtual methods
.method public final a()Lzd3/p;
    .locals 3

    iget-object v0, p0, Lzd3/c;->i:Lzd3/o;

    iget-object v0, v0, Lzd3/o;->w:Lud3/l0;

    iget-object v0, v0, Lud3/l0;->D:Lzd3/t;

    iget-object v1, p0, Lzd3/c;->k:Lud3/b1;

    monitor-enter v0

    :try_start_0
    const-string v2, "route"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lzd3/t;->a:Ljava/lang/Object;

    check-cast v2, Ljava/util/LinkedHashSet;

    invoke-interface {v2, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v0

    iget-object v0, p0, Lzd3/c;->w:Lzd3/p;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v1, p0, Lzd3/c;->k:Lud3/b1;

    const-string v2, "route"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lzd3/c;->j:Lzd3/r;

    iget-object v2, p0, Lzd3/c;->l:Ljava/util/List;

    invoke-virtual {v1, p0, v2}, Lzd3/r;->d(Lzd3/c;Ljava/util/List;)Lzd3/s;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v0, v1, Lzd3/s;->a:Lzd3/p;

    return-object v0

    :cond_0
    monitor-enter v0

    :try_start_1
    iget-object v1, p0, Lzd3/c;->b:Lzd3/q;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lwd3/h;->a:Ljava/util/TimeZone;

    iget-object v2, v1, Lzd3/q;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    iget-object v2, v1, Lzd3/q;->b:Lyd3/c;

    iget-object v1, v1, Lzd3/q;->c:Lyd3/b;

    invoke-static {v2, v1}, Lyd3/c;->e(Lyd3/c;Lyd3/a;)V

    iget-object v1, p0, Lzd3/c;->i:Lzd3/o;

    invoke-virtual {v1, v0}, Lzd3/o;->b(Lzd3/p;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    iget-object v1, p0, Lzd3/c;->i:Lzd3/o;

    iget-object v2, v1, Lzd3/o;->E:Lud3/a0;

    invoke-virtual {v2, v1, v0}, Lud3/a0;->connectionAcquired(Lud3/j;Lud3/p;)V

    return-object v0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :catchall_1
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lzd3/c;->u:Lud3/m0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final c()V
    .locals 0

    return-void
.end method

.method public final cancel()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzd3/c;->q:Z

    iget-object v0, p0, Lzd3/c;->r:Ljava/net/Socket;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lwd3/h;->c(Ljava/net/Socket;)V

    :cond_0
    return-void
.end method

.method public final d()Lzd3/u;
    .locals 22

    move-object/from16 v1, p0

    iget-object v2, v1, Lzd3/c;->b:Lzd3/q;

    iget-object v4, v1, Lzd3/c;->i:Lzd3/o;

    iget-object v0, v4, Lzd3/o;->E:Lud3/a0;

    iget-object v9, v4, Lzd3/o;->T:Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object v14, v1, Lzd3/c;->r:Ljava/net/Socket;

    if-eqz v14, :cond_13

    invoke-virtual {v1}, Lzd3/c;->b()Z

    move-result v3

    if-nez v3, :cond_12

    iget-object v3, v1, Lzd3/c;->k:Lud3/b1;

    iget-object v5, v3, Lud3/b1;->a:Lud3/a;

    iget-object v6, v3, Lud3/b1;->b:Ljava/net/Proxy;

    iget-object v7, v3, Lud3/b1;->a:Lud3/a;

    iget-object v5, v5, Lud3/a;->j:Ljava/util/List;

    invoke-virtual {v9, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    const/4 v10, 0x0

    :try_start_0
    iget-object v11, v1, Lzd3/c;->n:Lud3/o0;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_7
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v11, :cond_2

    :try_start_1
    invoke-virtual {v1}, Lzd3/c;->k()Lzd3/u;

    move-result-object v11

    iget-object v12, v11, Lzd3/u;->b:Lzd3/v;

    if-nez v12, :cond_0

    iget-object v12, v11, Lzd3/u;->c:Ljava/lang/Throwable;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v12, :cond_2

    goto :goto_1

    :catchall_0
    move-exception v0

    const/4 v8, 0x0

    goto/16 :goto_a

    :catch_0
    move-exception v0

    move-object v8, v0

    move-object/from16 v21, v2

    move-object v2, v10

    :goto_0
    const/16 v20, 0x0

    goto/16 :goto_6

    :cond_0
    :goto_1
    invoke-virtual {v9, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, v1, Lzd3/c;->s:Ljava/net/Socket;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lwd3/h;->c(Ljava/net/Socket;)V

    :cond_1
    invoke-static {v14}, Lwd3/h;->c(Ljava/net/Socket;)V

    return-object v11

    :cond_2
    :try_start_2
    iget-object v11, v7, Lud3/a;->c:Ljavax/net/ssl/SSLSocketFactory;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_7
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v12, 0x1

    const-string v13, "socket"

    if-eqz v11, :cond_6

    :try_start_3
    iget-object v11, v1, Lzd3/c;->v:Ls/m2;

    if-eqz v11, :cond_5

    iget-object v11, v11, Ls/m2;->x:Ljava/lang/Object;

    check-cast v11, Lne3/j0;

    iget-object v11, v11, Lne3/j0;->x:Lne3/h;

    invoke-virtual {v11}, Lne3/h;->o()Z

    move-result v11

    if-eqz v11, :cond_4

    iget-object v11, v1, Lzd3/c;->v:Ls/m2;

    if-eqz v11, :cond_3

    iget-object v11, v11, Ls/m2;->y:Ljava/lang/Object;

    check-cast v11, Lne3/h0;

    iget-object v11, v11, Lne3/h0;->x:Lne3/h;

    invoke-virtual {v11}, Lne3/h;->o()Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-virtual {v0, v4}, Lud3/a0;->secureConnectStart(Lud3/j;)V

    iget-object v11, v7, Lud3/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    iget-object v7, v7, Lud3/a;->h:Lud3/e0;

    iget-object v15, v7, Lud3/e0;->d:Ljava/lang/String;

    iget v7, v7, Lud3/e0;->e:I

    invoke-virtual {v11, v14, v15, v7, v12}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v7

    const-string v11, "null cannot be cast to non-null type javax.net.ssl.SSLSocket"

    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Ljavax/net/ssl/SSLSocket;

    invoke-virtual {v1, v5, v7}, Lzd3/c;->n(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lzd3/c;

    move-result-object v11

    iget v15, v11, Lzd3/c;->o:I

    invoke-interface {v5, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lud3/r;

    invoke-virtual {v11, v5, v7}, Lzd3/c;->m(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lzd3/c;

    move-result-object v5
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    iget-boolean v11, v11, Lzd3/c;->p:Z

    invoke-virtual {v15, v7, v11}, Lud3/r;->a(Ljavax/net/ssl/SSLSocket;Z)V

    invoke-virtual {v1, v7, v15}, Lzd3/c;->j(Ljavax/net/ssl/SSLSocket;Lud3/r;)V

    iget-object v7, v1, Lzd3/c;->t:Lud3/c0;

    invoke-virtual {v0, v4, v7}, Lud3/a0;->secureConnectEnd(Lud3/j;Lud3/c0;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object v7, v10

    goto :goto_3

    :catch_1
    move-exception v0

    move-object v8, v0

    move-object/from16 v21, v2

    move-object v2, v10

    const/16 v20, 0x0

    move-object v10, v5

    goto/16 :goto_6

    :cond_3
    :try_start_5
    invoke-static {v13}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v10

    :cond_4
    new-instance v0, Ljava/io/IOException;

    const-string v5, "TLS tunnel buffered too many bytes!"

    invoke-direct {v0, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    invoke-static {v13}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v10
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :cond_6
    :try_start_6
    iput-object v14, v1, Lzd3/c;->s:Ljava/net/Socket;

    iget-object v5, v7, Lud3/a;->i:Ljava/util/List;

    sget-object v7, Lud3/m0;->G:Lud3/m0;

    invoke-interface {v5, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    goto :goto_2

    :cond_7
    sget-object v7, Lud3/m0;->z:Lud3/m0;

    :goto_2
    iput-object v7, v1, Lzd3/c;->u:Lud3/m0;
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_7
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-object v5, v10

    move-object v7, v5

    :goto_3
    :try_start_7
    new-instance v10, Lzd3/p;

    iget-object v11, v1, Lzd3/c;->a:Lyd3/d;

    move v15, v12

    iget-object v12, v1, Lzd3/c;->b:Lzd3/q;

    move-object/from16 v16, v13

    iget-object v13, v1, Lzd3/c;->k:Lud3/b1;

    move/from16 v17, v15

    iget-object v15, v1, Lzd3/c;->s:Ljava/net/Socket;

    invoke-static {v15}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :try_start_8
    iget-object v7, v1, Lzd3/c;->t:Lud3/c0;

    iget-object v8, v1, Lzd3/c;->u:Lud3/m0;

    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    move-object/from16 v21, v2

    :try_start_9
    iget-object v2, v1, Lzd3/c;->v:Ls/m2;

    if-eqz v2, :cond_8

    move-object/from16 v19, v2

    iget v2, v1, Lzd3/c;->g:I

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    move-object/from16 v16, v7

    move/from16 v7, v17

    move-object/from16 v18, v19

    move/from16 v19, v2

    move-object/from16 v17, v8

    const/4 v2, 0x0

    :try_start_a
    invoke-direct/range {v10 .. v19}, Lzd3/p;-><init>(Lyd3/d;Lzd3/q;Lud3/b1;Ljava/net/Socket;Ljava/net/Socket;Lud3/c0;Lud3/m0;Ls/m2;I)V

    iput-object v10, v1, Lzd3/c;->w:Lzd3/p;

    invoke-virtual {v10}, Lzd3/p;->i()V

    iget-object v8, v3, Lud3/b1;->c:Ljava/net/InetSocketAddress;

    iget-object v10, v1, Lzd3/c;->u:Lud3/m0;

    invoke-virtual {v0, v4, v8, v6, v10}, Lud3/a0;->connectEnd(Lud3/j;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lud3/m0;)V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_3
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :try_start_b
    new-instance v0, Lzd3/u;

    const/4 v8, 0x6

    invoke-direct {v0, v1, v2, v2, v8}, Lzd3/u;-><init>(Lzd3/v;Lzd3/c;Ljava/lang/Throwable;I)V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_2
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    invoke-virtual {v9, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-object v0

    :catchall_1
    move-exception v0

    move v8, v7

    goto/16 :goto_a

    :catch_2
    move-exception v0

    move-object v8, v0

    move-object v10, v5

    move/from16 v20, v7

    goto :goto_6

    :catch_3
    move-exception v0

    :goto_4
    move-object v8, v0

    move-object v10, v5

    goto/16 :goto_0

    :catch_4
    move-exception v0

    :goto_5
    const/4 v2, 0x0

    goto :goto_4

    :cond_8
    const/4 v2, 0x0

    :try_start_c
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_3
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    :catch_5
    move-exception v0

    move-object/from16 v21, v2

    goto :goto_5

    :catch_6
    move-exception v0

    move-object/from16 v21, v2

    move-object v2, v7

    goto :goto_4

    :catch_7
    move-exception v0

    move-object/from16 v21, v2

    move-object v2, v10

    move-object v8, v0

    goto/16 :goto_0

    :goto_6
    :try_start_d
    iget-object v0, v4, Lzd3/o;->E:Lud3/a0;

    iget-object v5, v3, Lud3/b1;->c:Ljava/net/InetSocketAddress;

    const/4 v7, 0x0

    move-object v3, v0

    invoke-virtual/range {v3 .. v8}, Lud3/a0;->connectFailed(Lud3/j;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lud3/m0;Ljava/io/IOException;)V

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v0, v1, Lzd3/c;->h:Z

    if-eqz v0, :cond_d

    instance-of v0, v8, Ljava/net/ProtocolException;

    if-eqz v0, :cond_9

    goto :goto_8

    :cond_9
    instance-of v0, v8, Ljava/io/InterruptedIOException;

    if-eqz v0, :cond_a

    goto :goto_8

    :cond_a
    instance-of v0, v8, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz v0, :cond_b

    invoke-virtual {v8}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Ljava/security/cert/CertificateException;

    if-eqz v0, :cond_b

    goto :goto_8

    :cond_b
    instance-of v0, v8, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-eqz v0, :cond_c

    goto :goto_8

    :cond_c
    instance-of v0, v8, Ljavax/net/ssl/SSLException;

    if-eqz v0, :cond_d

    goto :goto_9

    :goto_7
    move/from16 v8, v20

    goto :goto_a

    :cond_d
    :goto_8
    move-object v10, v2

    :goto_9
    new-instance v0, Lzd3/u;

    invoke-direct {v0, v1, v10, v8}, Lzd3/u;-><init>(Lzd3/v;Lzd3/v;Ljava/lang/Throwable;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    invoke-virtual {v9, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    if-nez v20, :cond_f

    iget-object v2, v1, Lzd3/c;->s:Ljava/net/Socket;

    if-eqz v2, :cond_e

    invoke-static {v2}, Lwd3/h;->c(Ljava/net/Socket;)V

    :cond_e
    invoke-static {v14}, Lwd3/h;->c(Ljava/net/Socket;)V

    :cond_f
    return-object v0

    :catchall_2
    move-exception v0

    goto :goto_7

    :goto_a
    invoke-virtual {v9, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    if-nez v8, :cond_11

    iget-object v2, v1, Lzd3/c;->s:Ljava/net/Socket;

    if-eqz v2, :cond_10

    invoke-static {v2}, Lwd3/h;->c(Ljava/net/Socket;)V

    :cond_10
    invoke-static {v14}, Lwd3/h;->c(Ljava/net/Socket;)V

    :cond_11
    throw v0

    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "already connected"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_13
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "TCP not connected"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e()Lud3/b1;
    .locals 1

    iget-object v0, p0, Lzd3/c;->k:Lud3/b1;

    return-object v0
.end method

.method public final f()Lzd3/v;
    .locals 18

    move-object/from16 v0, p0

    new-instance v1, Lzd3/c;

    iget v2, v0, Lzd3/c;->o:I

    iget-boolean v3, v0, Lzd3/c;->p:Z

    move/from16 v16, v2

    iget-object v2, v0, Lzd3/c;->a:Lyd3/d;

    move/from16 v17, v3

    iget-object v3, v0, Lzd3/c;->b:Lzd3/q;

    iget v4, v0, Lzd3/c;->c:I

    iget v5, v0, Lzd3/c;->d:I

    iget v6, v0, Lzd3/c;->e:I

    iget v7, v0, Lzd3/c;->f:I

    iget v8, v0, Lzd3/c;->g:I

    iget-boolean v9, v0, Lzd3/c;->h:Z

    iget-object v10, v0, Lzd3/c;->i:Lzd3/o;

    iget-object v11, v0, Lzd3/c;->j:Lzd3/r;

    iget-object v12, v0, Lzd3/c;->k:Lud3/b1;

    iget-object v13, v0, Lzd3/c;->l:Ljava/util/List;

    iget v14, v0, Lzd3/c;->m:I

    iget-object v15, v0, Lzd3/c;->n:Lud3/o0;

    invoke-direct/range {v1 .. v17}, Lzd3/c;-><init>(Lyd3/d;Lzd3/q;IIIIIZLzd3/o;Lzd3/r;Lud3/b1;Ljava/util/List;ILud3/o0;IZ)V

    return-object v1
.end method

.method public final g()Lzd3/u;
    .locals 12

    iget-object v1, p0, Lzd3/c;->b:Lzd3/q;

    iget-object v2, p0, Lzd3/c;->k:Lud3/b1;

    iget-object v4, p0, Lzd3/c;->i:Lzd3/o;

    iget-object v9, v4, Lzd3/o;->T:Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object v0, p0, Lzd3/c;->r:Ljava/net/Socket;

    if-nez v0, :cond_3

    invoke-virtual {v9, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    const/4 v10, 0x0

    const/4 v3, 0x0

    :try_start_0
    iget-object v0, v4, Lzd3/o;->E:Lud3/a0;

    iget-object v5, v2, Lud3/b1;->c:Ljava/net/InetSocketAddress;

    iget-object v6, v2, Lud3/b1;->b:Ljava/net/Proxy;

    invoke-virtual {v0, v4, v5, v6}, Lud3/a0;->connectStart(Lud3/j;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lzd3/c;->i()V

    const/4 v3, 0x1

    new-instance v0, Lzd3/u;

    const/4 v5, 0x6

    invoke-direct {v0, p0, v10, v10, v5}, Lzd3/u;-><init>(Lzd3/v;Lzd3/c;Ljava/lang/Throwable;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v9, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object v8, v0

    move v11, v3

    :try_start_1
    iget-object v0, v2, Lud3/b1;->a:Lud3/a;

    iget-object v0, v2, Lud3/b1;->b:Ljava/net/Proxy;

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v3, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v0, v3, :cond_0

    iget-object v0, v2, Lud3/b1;->a:Lud3/a;

    iget-object v3, v0, Lud3/a;->g:Ljava/net/ProxySelector;

    iget-object v0, v0, Lud3/a;->h:Lud3/e0;

    invoke-virtual {v0}, Lud3/e0;->k()Ljava/net/URI;

    move-result-object v0

    iget-object v5, v2, Lud3/b1;->b:Ljava/net/Proxy;

    invoke-virtual {v5}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v5

    invoke-virtual {v3, v0, v5, v8}, Ljava/net/ProxySelector;->connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V

    goto :goto_0

    :catchall_1
    move-exception v0

    move v3, v11

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v3, v4, Lzd3/o;->E:Lud3/a0;

    iget-object v5, v2, Lud3/b1;->c:Ljava/net/InetSocketAddress;

    iget-object v6, v2, Lud3/b1;->b:Ljava/net/Proxy;

    const/4 v7, 0x0

    invoke-virtual/range {v3 .. v8}, Lud3/a0;->connectFailed(Lud3/j;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lud3/m0;Ljava/io/IOException;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lzd3/u;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v10, v8, v1}, Lzd3/u;-><init>(Lzd3/v;Lzd3/c;Ljava/lang/Throwable;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-virtual {v9, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    if-nez v11, :cond_1

    iget-object v1, p0, Lzd3/c;->r:Ljava/net/Socket;

    if-eqz v1, :cond_1

    invoke-static {v1}, Lwd3/h;->c(Ljava/net/Socket;)V

    :cond_1
    return-object v0

    :goto_1
    invoke-virtual {v9, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    if-nez v3, :cond_2

    iget-object v1, p0, Lzd3/c;->r:Ljava/net/Socket;

    if-eqz v1, :cond_2

    invoke-static {v1}, Lwd3/h;->c(Ljava/net/Socket;)V

    :cond_2
    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "TCP already connected"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final h(Lzd3/o;Ljava/io/IOException;)V
    .locals 0

    return-void
.end method

.method public final i()V
    .locals 4

    iget-object v0, p0, Lzd3/c;->k:Lud3/b1;

    iget-object v0, v0, Lud3/b1;->b:Ljava/net/Proxy;

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lzd3/b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_0
    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    new-instance v0, Ljava/net/Socket;

    iget-object v1, p0, Lzd3/c;->k:Lud3/b1;

    iget-object v1, v1, Lud3/b1;->b:Ljava/net/Proxy;

    invoke-direct {v0, v1}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lzd3/c;->k:Lud3/b1;

    iget-object v0, v0, Lud3/b1;->a:Lud3/a;

    iget-object v0, v0, Lud3/a;->b:Ljavax/net/SocketFactory;

    invoke-virtual {v0}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :goto_1
    iput-object v0, p0, Lzd3/c;->r:Ljava/net/Socket;

    iget-boolean v1, p0, Lzd3/c;->q:Z

    if-nez v1, :cond_3

    iget v1, p0, Lzd3/c;->f:I

    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    :try_start_0
    sget-object v1, Lfe3/e;->a:Lfe3/e;

    sget-object v1, Lfe3/e;->a:Lfe3/e;

    iget-object v2, p0, Lzd3/c;->k:Lud3/b1;

    iget-object v2, v2, Lud3/b1;->c:Ljava/net/InetSocketAddress;

    iget v3, p0, Lzd3/c;->e:I

    invoke-virtual {v1, v0, v2, v3}, Lfe3/e;->f(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    new-instance v1, Lzt/q;

    invoke-direct {v1, v0}, Lzt/q;-><init>(Ljava/net/Socket;)V

    new-instance v0, Ls/m2;

    invoke-direct {v0, v1}, Ls/m2;-><init>(Lne3/o0;)V

    iput-object v0, p0, Lzd3/c;->v:Ls/m2;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "throw with null exception"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return-void

    :cond_2
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Ljava/net/ConnectException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to connect to "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lzd3/c;->k:Lud3/b1;

    iget-object v3, v3, Lud3/b1;->c:Ljava/net/InetSocketAddress;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v1

    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "canceled"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final j(Ljavax/net/ssl/SSLSocket;Lud3/r;)V
    .locals 9

    const-string v0, "Hostname "

    const-string v1, "\n            |Hostname "

    iget-object v2, p0, Lzd3/c;->k:Lud3/b1;

    iget-object v2, v2, Lud3/b1;->a:Lud3/a;

    :try_start_0
    iget-boolean v3, p2, Lud3/r;->b:Z

    if-eqz v3, :cond_0

    sget-object v3, Lfe3/e;->a:Lfe3/e;

    sget-object v3, Lfe3/e;->a:Lfe3/e;

    iget-object v4, v2, Lud3/a;->h:Lud3/e0;

    iget-object v4, v4, Lud3/e0;->d:Ljava/lang/String;

    iget-object v5, v2, Lud3/a;->i:Ljava/util/List;

    invoke-virtual {v3, p1, v4, v5}, Lfe3/e;->e(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    goto :goto_0

    :catchall_0
    move-exception p2

    goto/16 :goto_3

    :cond_0
    :goto_0
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v3}, Lts/o;->u(Ljavax/net/ssl/SSLSession;)Lud3/c0;

    move-result-object v4

    iget-object v5, v2, Lud3/a;->d:Ljavax/net/ssl/HostnameVerifier;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v6, v2, Lud3/a;->h:Lud3/e0;

    iget-object v6, v6, Lud3/e0;->d:Ljava/lang/String;

    invoke-interface {v5, v6, v3}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v4}, Lud3/c0;->a()Ljava/util/List;

    move-result-object p2

    move-object v3, p2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/security/cert/X509Certificate;

    new-instance v0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v2, Lud3/a;->h:Lud3/e0;

    iget-object v1, v1, Lud3/e0;->d:Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " not verified:\n            |    certificate: "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lud3/l;->c:Lud3/l;

    sget-object v1, Lne3/l;->z:Lne3/k;

    invoke-virtual {p2}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v1

    invoke-interface {v1}, Ljava/security/Key;->getEncoded()[B

    move-result-object v1

    const-string v2, "getEncoded(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, -0x499602d2

    invoke-static {v2, v1}, Lne3/k;->c(I[B)Lne3/l;

    move-result-object v1

    const-string v2, "SHA-256"

    invoke-virtual {v1, v2}, Lne3/l;->c(Ljava/lang/String;)Lne3/l;

    move-result-object v1

    iget-object v1, v1, Lne3/l;->w:[B

    invoke-static {v1}, Lne3/a;->b([B)Ljava/lang/String;

    move-result-object v1

    const-string v2, "sha256/"

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n            |    DN: "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v1

    invoke-interface {v1}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n            |    subjectAltNames: "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x7

    invoke-static {p2, v1}, Lje3/c;->a(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {p2, v2}, Lje3/c;->a(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    move-result-object p2

    check-cast v1, Ljava/util/Collection;

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {v1, p2}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\n            "

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lyb3/s;->t(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p2, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v2, Lud3/a;->h:Lud3/e0;

    iget-object v0, v0, Lud3/e0;->d:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not verified (no certificates)"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    iget-object v0, v2, Lud3/a;->e:Lud3/l;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v1, Lud3/c0;

    iget-object v3, v4, Lud3/c0;->a:Lud3/c1;

    iget-object v5, v4, Lud3/c0;->b:Lud3/o;

    iget-object v6, v4, Lud3/c0;->c:Ljava/util/List;

    new-instance v7, Lc41/m;

    const/4 v8, 0x4

    invoke-direct {v7, v0, v4, v2, v8}, Lc41/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-direct {v1, v3, v5, v6, v7}, Lud3/c0;-><init>(Lud3/c1;Lud3/o;Ljava/util/List;Lc93/a;)V

    iput-object v1, p0, Lzd3/c;->t:Lud3/c0;

    iget-object v1, v2, Lud3/a;->h:Lud3/e0;

    iget-object v1, v1, Lud3/e0;->d:Ljava/lang/String;

    const-string v2, "hostname"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lud3/l;->a:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_5

    iget-boolean p2, p2, Lud3/r;->b:Z

    if-eqz p2, :cond_3

    sget-object p2, Lfe3/e;->a:Lfe3/e;

    sget-object p2, Lfe3/e;->a:Lfe3/e;

    invoke-virtual {p2, p1}, Lfe3/e;->g(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_3
    const/4 p2, 0x0

    :goto_1
    iput-object p1, p0, Lzd3/c;->s:Ljava/net/Socket;

    new-instance v0, Lzt/q;

    invoke-direct {v0, p1}, Lzt/q;-><init>(Ljava/net/Socket;)V

    new-instance v1, Ls/m2;

    invoke-direct {v1, v0}, Ls/m2;-><init>(Lne3/o0;)V

    iput-object v1, p0, Lzd3/c;->v:Ls/m2;

    if-eqz p2, :cond_4

    sget-object v0, Lud3/m0;->x:Lud3/t;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2}, Lud3/t;->e(Ljava/lang/String;)Lud3/m0;

    move-result-object p2

    goto :goto_2

    :cond_4
    sget-object p2, Lud3/m0;->z:Lud3/m0;

    :goto_2
    iput-object p2, p0, Lzd3/c;->u:Lud3/m0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object p1, Lfe3/e;->a:Lfe3/e;

    sget-object p1, Lfe3/e;->a:Lfe3/e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_5
    :try_start_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p2, Ljava/lang/ClassCastException;

    invoke-direct {p2}, Ljava/lang/ClassCastException;-><init>()V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    sget-object v0, Lfe3/e;->a:Lfe3/e;

    sget-object v0, Lfe3/e;->a:Lfe3/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lwd3/h;->c(Ljava/net/Socket;)V

    throw p2
.end method

.method public final k()Lzd3/u;
    .locals 12

    iget-object v0, p0, Lzd3/c;->n:Lud3/o0;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v1, p0, Lzd3/c;->k:Lud3/b1;

    iget-object v2, v1, Lud3/b1;->a:Lud3/a;

    iget-object v6, v1, Lud3/b1;->b:Ljava/net/Proxy;

    iget-object v2, v2, Lud3/a;->h:Lud3/e0;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "CONNECT "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x1

    invoke-static {v2, v4}, Lwd3/h;->i(Lud3/e0;Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " HTTP/1.1"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_0
    new-instance v3, Lbe3/g;

    iget-object v5, p0, Lzd3/c;->v:Ls/m2;

    const-string v7, "socket"

    const/4 v9, 0x0

    if-eqz v5, :cond_a

    invoke-direct {v3, v9, p0, v5}, Lbe3/g;-><init>(Lud3/l0;Lae3/f;Ls/m2;)V

    iget-object v5, p0, Lzd3/c;->v:Ls/m2;

    if-eqz v5, :cond_9

    iget-object v5, v5, Ls/m2;->x:Ljava/lang/Object;

    check-cast v5, Lne3/j0;

    iget-object v5, v5, Lne3/j0;->w:Lne3/p0;

    invoke-interface {v5}, Lne3/p0;->timeout()Lne3/r0;

    move-result-object v5

    iget v8, p0, Lzd3/c;->c:I

    int-to-long v10, v8

    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v5, v10, v11, v8}, Lne3/r0;->g(JLjava/util/concurrent/TimeUnit;)Lne3/r0;

    iget-object v5, p0, Lzd3/c;->v:Ls/m2;

    if-eqz v5, :cond_8

    iget-object v5, v5, Ls/m2;->y:Ljava/lang/Object;

    check-cast v5, Lne3/h0;

    iget-object v5, v5, Lne3/h0;->w:Lne3/n0;

    invoke-interface {v5}, Lne3/n0;->timeout()Lne3/r0;

    move-result-object v5

    iget v7, p0, Lzd3/c;->d:I

    int-to-long v10, v7

    invoke-virtual {v5, v10, v11, v8}, Lne3/r0;->g(JLjava/util/concurrent/TimeUnit;)Lne3/r0;

    iget-object v5, v0, Lud3/o0;->c:Lud3/d0;

    invoke-virtual {v3, v5, v2}, Lbe3/g;->m(Lud3/d0;Ljava/lang/String;)V

    invoke-virtual {v3}, Lbe3/g;->a()V

    const/4 v5, 0x0

    invoke-virtual {v3, v5}, Lbe3/g;->e(Z)Lud3/w0;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v0, v5, Lud3/w0;->a:Lud3/o0;

    invoke-virtual {v5}, Lud3/w0;->a()Lud3/x0;

    move-result-object v0

    iget v5, v0, Lud3/x0;->z:I

    invoke-virtual {v3, v0}, Lbe3/g;->l(Lud3/x0;)V

    const/16 v3, 0xc8

    if-eq v5, v3, :cond_4

    const/16 v3, 0x197

    if-ne v5, v3, :cond_3

    iget-object v3, v1, Lud3/b1;->a:Lud3/a;

    iget-object v3, v3, Lud3/a;->f:Lud3/c;

    invoke-interface {v3, v1, v0}, Lud3/c;->a(Lud3/b1;Lud3/x0;)Lud3/o0;

    move-result-object v3

    if-eqz v3, :cond_2

    const-string v5, "Connection"

    iget-object v0, v0, Lud3/x0;->F:Lud3/d0;

    invoke-virtual {v0, v5}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    move-object v0, v9

    :cond_0
    const-string v5, "close"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, v3

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Failed to authenticate with proxy"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unexpected response code for CONNECT: "

    invoke-static {v5, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    move-object v3, v9

    :goto_1
    if-nez v3, :cond_5

    new-instance v0, Lzd3/u;

    const/4 v1, 0x6

    invoke-direct {v0, p0, v9, v9, v1}, Lzd3/u;-><init>(Lzd3/v;Lzd3/c;Ljava/lang/Throwable;I)V

    return-object v0

    :cond_5
    iget-object v0, p0, Lzd3/c;->r:Ljava/net/Socket;

    if-eqz v0, :cond_6

    invoke-static {v0}, Lwd3/h;->c(Ljava/net/Socket;)V

    :cond_6
    iget v0, p0, Lzd3/c;->m:I

    add-int/2addr v0, v4

    const/16 v2, 0x15

    iget-object v4, p0, Lzd3/c;->i:Lzd3/o;

    if-ge v0, v2, :cond_7

    iget-object v2, v4, Lzd3/o;->E:Lud3/a0;

    iget-object v1, v1, Lud3/b1;->c:Ljava/net/InetSocketAddress;

    invoke-virtual {v2, v4, v1, v6, v9}, Lud3/a0;->connectEnd(Lud3/j;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lud3/m0;)V

    new-instance v1, Lzd3/u;

    const/4 v6, 0x0

    const/16 v7, 0xc

    const/4 v5, 0x0

    move-object v2, p0

    move-object v4, v3

    move v3, v0

    invoke-static/range {v2 .. v7}, Lzd3/c;->l(Lzd3/c;ILud3/o0;IZI)Lzd3/c;

    move-result-object v0

    const/4 v3, 0x4

    invoke-direct {v1, p0, v0, v9, v3}, Lzd3/u;-><init>(Lzd3/v;Lzd3/c;Ljava/lang/Throwable;I)V

    return-object v1

    :cond_7
    move-object v2, p0

    new-instance v8, Ljava/net/ProtocolException;

    const-string v0, "Too many tunnel connections attempted: 21"

    invoke-direct {v8, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    iget-object v3, v4, Lzd3/o;->E:Lud3/a0;

    iget-object v5, v1, Lud3/b1;->c:Ljava/net/InetSocketAddress;

    const/4 v7, 0x0

    invoke-virtual/range {v3 .. v8}, Lud3/a0;->connectFailed(Lud3/j;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lud3/m0;Ljava/io/IOException;)V

    iget-object v0, v2, Lzd3/c;->b:Lzd3/q;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lzd3/u;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v9, v8, v1}, Lzd3/u;-><init>(Lzd3/v;Lzd3/c;Ljava/lang/Throwable;I)V

    return-object v0

    :cond_8
    move-object v2, p0

    invoke-static {v7}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v9

    :cond_9
    move-object v2, p0

    invoke-static {v7}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v9

    :cond_a
    move-object v2, p0

    invoke-static {v7}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v9
.end method

.method public final m(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lzd3/c;
    .locals 9

    const-string v0, "connectionSpecs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lzd3/c;->o:I

    add-int/lit8 v1, v0, 0x1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    move v6, v1

    :goto_0
    if-ge v6, v2, :cond_4

    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/r;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v3, v1, Lud3/r;->a:Z

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    iget-object v3, v1, Lud3/r;->d:[Ljava/lang/String;

    if-eqz v3, :cond_1

    invoke-virtual {p2}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lp83/a;->w:Lp83/a;

    invoke-static {v3, v4, v5}, Lwd3/f;->h([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, v1, Lud3/r;->c:[Ljava/lang/String;

    if-eqz v1, :cond_2

    invoke-virtual {p2}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lud3/o;->c:Lud3/n;

    invoke-static {v1, v3, v4}, Lwd3/f;->h([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z

    move-result v1

    if-nez v1, :cond_2

    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, -0x1

    if-eq v0, p1, :cond_3

    const/4 p1, 0x1

    :goto_2
    move v7, p1

    goto :goto_3

    :cond_3
    const/4 p1, 0x0

    goto :goto_2

    :goto_3
    const/4 v8, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v8}, Lzd3/c;->l(Lzd3/c;ILud3/o0;IZI)Lzd3/c;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 p1, 0x0

    return-object p1
.end method

.method public final n(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lzd3/c;
    .locals 5

    const-string v0, "connectionSpecs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lzd3/c;->o:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lzd3/c;->m(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lzd3/c;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Ljava/net/UnknownServiceException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to find acceptable protocols. isFallback="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, ", modes="

    const-string v3, ", supported protocols="

    iget-boolean v4, p0, Lzd3/c;->p:Z

    invoke-static {v2, v3, v1, p1, v4}, Lm4/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Z)V

    invoke-virtual {p2}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "toString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
