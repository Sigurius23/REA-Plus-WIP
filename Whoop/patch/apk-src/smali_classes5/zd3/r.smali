.class public final Lzd3/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lyd3/d;

.field public final b:Lzd3/q;

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:Z

.field public final i:Z

.field public final j:Lud3/a;

.field public final k:Lzd3/t;

.field public final l:Lzd3/o;

.field public final m:Z

.field public n:Lbd3/v;

.field public o:Lzd3/w;

.field public p:Lud3/b1;

.field public final q:Lm83/m;


# direct methods
.method public constructor <init>(Lyd3/d;Lzd3/q;IIIIIZZLud3/a;Lzd3/t;Lzd3/o;Lud3/o0;)V
    .locals 1

    const-string v0, "taskRunner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionPool"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "routeDatabase"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd3/r;->a:Lyd3/d;

    iput-object p2, p0, Lzd3/r;->b:Lzd3/q;

    iput p3, p0, Lzd3/r;->c:I

    iput p4, p0, Lzd3/r;->d:I

    iput p5, p0, Lzd3/r;->e:I

    iput p6, p0, Lzd3/r;->f:I

    iput p7, p0, Lzd3/r;->g:I

    iput-boolean p8, p0, Lzd3/r;->h:Z

    iput-boolean p9, p0, Lzd3/r;->i:Z

    iput-object p10, p0, Lzd3/r;->j:Lud3/a;

    iput-object p11, p0, Lzd3/r;->k:Lzd3/t;

    iput-object p12, p0, Lzd3/r;->l:Lzd3/o;

    iget-object p1, p13, Lud3/o0;->b:Ljava/lang/String;

    const-string p2, "GET"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Lzd3/r;->m:Z

    new-instance p1, Lm83/m;

    invoke-direct {p1}, Lm83/m;-><init>()V

    iput-object p1, p0, Lzd3/r;->q:Lm83/m;

    return-void
.end method


# virtual methods
.method public final a(Lzd3/p;)Z
    .locals 4

    iget-object v0, p0, Lzd3/r;->q:Lm83/m;

    invoke-virtual {v0}, Lm83/m;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lzd3/r;->p:Lud3/b1;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    if-eqz p1, :cond_5

    monitor-enter p1

    :try_start_0
    iget v0, p1, Lzd3/p;->m:I

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    iget-boolean v0, p1, Lzd3/p;->k:Z

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p1, Lzd3/p;->c:Lud3/b1;

    iget-object v0, v0, Lud3/b1;->a:Lud3/a;

    iget-object v0, v0, Lud3/a;->h:Lud3/e0;

    iget-object v3, p0, Lzd3/r;->j:Lud3/a;

    iget-object v3, v3, Lud3/a;->h:Lud3/e0;

    invoke-static {v0, v3}, Lwd3/h;->a(Lud3/e0;Lud3/e0;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget-object v2, p1, Lzd3/p;->c:Lud3/b1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p1

    if-eqz v2, :cond_5

    iput-object v2, p0, Lzd3/r;->p:Lud3/b1;

    return v1

    :catchall_0
    move-exception v0

    monitor-exit p1

    throw v0

    :cond_5
    iget-object p1, p0, Lzd3/r;->n:Lbd3/v;

    if-eqz p1, :cond_6

    iget v0, p1, Lbd3/v;->x:I

    iget-object p1, p1, Lbd3/v;->y:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge v0, p1, :cond_6

    return v1

    :cond_6
    iget-object p1, p0, Lzd3/r;->o:Lzd3/w;

    if-nez p1, :cond_7

    :goto_1
    return v1

    :cond_7
    invoke-virtual {p1}, Lzd3/w;->a()Z

    move-result p1

    return p1
.end method

.method public final b()Lzd3/v;
    .locals 12

    iget-object v0, p0, Lzd3/r;->l:Lzd3/o;

    iget-object v0, v0, Lzd3/o;->J:Lzd3/p;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    :goto_0
    move-object v3, v1

    goto :goto_3

    :cond_0
    iget-boolean v3, p0, Lzd3/r;->m:Z

    invoke-virtual {v0, v3}, Lzd3/p;->g(Z)Z

    move-result v3

    monitor-enter v0

    if-nez v3, :cond_1

    :try_start_0
    iput-boolean v2, v0, Lzd3/p;->k:Z

    iget-object v3, p0, Lzd3/r;->l:Lzd3/o;

    invoke-virtual {v3}, Lzd3/o;->j()Ljava/net/Socket;

    move-result-object v3

    goto :goto_2

    :catchall_0
    move-exception v1

    goto/16 :goto_11

    :cond_1
    iget-boolean v3, v0, Lzd3/p;->k:Z

    if-nez v3, :cond_3

    iget-object v3, v0, Lzd3/p;->c:Lud3/b1;

    iget-object v3, v3, Lud3/b1;->a:Lud3/a;

    iget-object v3, v3, Lud3/a;->h:Lud3/e0;

    invoke-virtual {p0, v3}, Lzd3/r;->e(Lud3/e0;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    move-object v3, v1

    goto :goto_2

    :cond_3
    :goto_1
    iget-object v3, p0, Lzd3/r;->l:Lzd3/o;

    invoke-virtual {v3}, Lzd3/o;->j()Ljava/net/Socket;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    monitor-exit v0

    iget-object v4, p0, Lzd3/r;->l:Lzd3/o;

    iget-object v4, v4, Lzd3/o;->J:Lzd3/p;

    if-eqz v4, :cond_5

    if-nez v3, :cond_4

    new-instance v3, Lzd3/s;

    invoke-direct {v3, v0}, Lzd3/s;-><init>(Lzd3/p;)V

    goto :goto_3

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    if-eqz v3, :cond_6

    invoke-static {v3}, Lwd3/h;->c(Ljava/net/Socket;)V

    :cond_6
    iget-object v3, p0, Lzd3/r;->l:Lzd3/o;

    iget-object v4, v3, Lzd3/o;->E:Lud3/a0;

    invoke-virtual {v4, v3, v0}, Lud3/a0;->connectionReleased(Lud3/j;Lud3/p;)V

    goto :goto_0

    :goto_3
    if-eqz v3, :cond_7

    return-object v3

    :cond_7
    invoke-virtual {p0, v1, v1}, Lzd3/r;->d(Lzd3/c;Ljava/util/List;)Lzd3/s;

    move-result-object v0

    if-eqz v0, :cond_8

    return-object v0

    :cond_8
    iget-object v0, p0, Lzd3/r;->q:Lm83/m;

    invoke-virtual {v0}, Lm83/m;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    iget-object v0, p0, Lzd3/r;->q:Lm83/m;

    invoke-virtual {v0}, Lm83/m;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzd3/v;

    return-object v0

    :cond_9
    iget-object v0, p0, Lzd3/r;->p:Lud3/b1;

    if-eqz v0, :cond_a

    iput-object v1, p0, Lzd3/r;->p:Lud3/b1;

    invoke-virtual {p0, v0, v1}, Lzd3/r;->c(Lud3/b1;Ljava/util/ArrayList;)Lzd3/c;

    move-result-object v0

    goto/16 :goto_10

    :cond_a
    iget-object v0, p0, Lzd3/r;->n:Lbd3/v;

    if-eqz v0, :cond_c

    iget v3, v0, Lbd3/v;->x:I

    iget-object v4, v0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_c

    iget v2, v0, Lbd3/v;->x:I

    iget-object v3, v0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v2, v4, :cond_b

    iget v2, v0, Lbd3/v;->x:I

    add-int/lit8 v4, v2, 0x1

    iput v4, v0, Lbd3/v;->x:I

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lud3/b1;

    invoke-virtual {p0, v0, v1}, Lzd3/r;->c(Lud3/b1;Ljava/util/ArrayList;)Lzd3/c;

    move-result-object v0

    goto/16 :goto_10

    :cond_b
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_c
    iget-object v0, p0, Lzd3/r;->o:Lzd3/w;

    if-nez v0, :cond_d

    new-instance v0, Lzd3/w;

    iget-object v1, p0, Lzd3/r;->j:Lud3/a;

    iget-object v3, p0, Lzd3/r;->k:Lzd3/t;

    iget-object v4, p0, Lzd3/r;->l:Lzd3/o;

    iget-boolean v5, p0, Lzd3/r;->i:Z

    invoke-direct {v0, v1, v3, v4, v5}, Lzd3/w;-><init>(Lud3/a;Lzd3/t;Lzd3/o;Z)V

    iput-object v0, p0, Lzd3/r;->o:Lzd3/w;

    :cond_d
    invoke-virtual {v0}, Lzd3/w;->a()Z

    move-result v1

    if-eqz v1, :cond_2a

    invoke-virtual {v0}, Lzd3/w;->a()Z

    move-result v1

    if-eqz v1, :cond_29

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_e
    iget v3, v0, Lzd3/w;->f:I

    iget-object v4, v0, Lzd3/w;->e:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_24

    iget-object v3, v0, Lzd3/w;->a:Lud3/a;

    const-string v4, "No route to "

    iget v5, v0, Lzd3/w;->f:I

    iget-object v6, v0, Lzd3/w;->e:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_23

    iget-object v5, v0, Lzd3/w;->e:Ljava/util/List;

    iget v6, v0, Lzd3/w;->f:I

    add-int/lit8 v7, v6, 0x1

    iput v7, v0, Lzd3/w;->f:I

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/net/Proxy;

    iget-object v6, v0, Lzd3/w;->c:Lzd3/o;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, v0, Lzd3/w;->g:Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v8

    sget-object v9, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v8, v9, :cond_12

    invoke-virtual {v5}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v8

    sget-object v9, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    if-ne v8, v9, :cond_f

    goto :goto_5

    :cond_f
    invoke-virtual {v5}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v8

    instance-of v9, v8, Ljava/net/InetSocketAddress;

    if-eqz v9, :cond_11

    check-cast v8, Ljava/net/InetSocketAddress;

    invoke-virtual {v8}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v9

    if-nez v9, :cond_10

    invoke-virtual {v8}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    move-result-object v9

    const-string v10, "getHostName(...)"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_4

    :cond_10
    invoke-virtual {v9}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v9

    const-string v10, "getHostAddress(...)"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_4
    invoke-virtual {v8}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v8

    goto :goto_6

    :cond_11
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Proxy.address() is not an InetSocketAddress: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_12
    :goto_5
    iget-object v8, v3, Lud3/a;->h:Lud3/e0;

    iget-object v9, v8, Lud3/e0;->d:Ljava/lang/String;

    iget v8, v8, Lud3/e0;->e:I

    :goto_6
    if-gt v2, v8, :cond_22

    const/high16 v10, 0x10000

    if-ge v8, v10, :cond_22

    invoke-virtual {v5}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v4

    sget-object v10, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    if-ne v4, v10, :cond_13

    invoke-static {v9, v8}, Ljava/net/InetSocketAddress;->createUnresolved(Ljava/lang/String;I)Ljava/net/InetSocketAddress;

    move-result-object v3

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_d

    :cond_13
    sget-object v4, Lwd3/e;->a:Lyb3/p;

    const-string v4, "<this>"

    invoke-static {v9, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lwd3/e;->a:Lyb3/p;

    invoke-virtual {v4, v9}, Lyb3/p;->e(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_14

    invoke-static {v9}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto :goto_7

    :cond_14
    iget-object v4, v6, Lzd3/o;->E:Lud3/a0;

    invoke-virtual {v4, v6, v9}, Lud3/a0;->dnsStart(Lud3/j;Ljava/lang/String;)V

    iget-object v4, v3, Lud3/a;->a:Lud3/v;

    invoke-interface {v4, v9}, Lud3/v;->lookup(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_21

    iget-object v3, v6, Lzd3/o;->E:Lud3/a0;

    invoke-virtual {v3, v6, v9, v4}, Lud3/a0;->dnsEnd(Lud3/j;Ljava/lang/String;Ljava/util/List;)V

    move-object v3, v4

    :goto_7
    iget-boolean v4, v0, Lzd3/w;->d:Z

    if-eqz v4, :cond_1d

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    const/4 v6, 0x2

    if-ge v4, v6, :cond_15

    goto/16 :goto_b

    :cond_15
    move-object v4, v3

    check-cast v4, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_17

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Ljava/net/InetAddress;

    instance-of v11, v11, Ljava/net/Inet6Address;

    if-eqz v11, :cond_16

    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_16
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_17
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1d

    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_18

    goto :goto_b

    :cond_18
    sget-object v3, Lwd3/f;->a:[B

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v9

    :cond_19
    :goto_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1b

    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1a

    goto :goto_a

    :cond_1a
    invoke-static {v9}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v3

    goto :goto_b

    :cond_1b
    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1c

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v9, v3}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_1c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_19

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v9, v3}, Ln83/c;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_1d
    :goto_b
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/net/InetAddress;

    new-instance v6, Ljava/net/InetSocketAddress;

    invoke-direct {v6, v4, v8}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_1e
    :goto_d
    iget-object v3, v0, Lzd3/w;->g:Ljava/lang/Object;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_20

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/net/InetSocketAddress;

    new-instance v6, Lud3/b1;

    iget-object v7, v0, Lzd3/w;->a:Lud3/a;

    invoke-direct {v6, v7, v5, v4}, Lud3/b1;-><init>(Lud3/a;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V

    iget-object v4, v0, Lzd3/w;->b:Lzd3/t;

    monitor-enter v4

    :try_start_1
    iget-object v7, v4, Lzd3/t;->a:Ljava/lang/Object;

    check-cast v7, Ljava/util/LinkedHashSet;

    invoke-interface {v7, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v4

    if-eqz v7, :cond_1f

    iget-object v4, v0, Lzd3/w;->h:Ljava/util/ArrayList;

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_1f
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :catchall_1
    move-exception v0

    :try_start_2
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    :cond_20
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_e

    goto :goto_f

    :cond_21
    new-instance v0, Ljava/net/UnknownHostException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v3, Lud3/a;->a:Lud3/v;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " returned no addresses for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_22
    new-instance v0, Ljava/net/SocketException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3a

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "; port is out of range"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_23
    new-instance v1, Ljava/net/SocketException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v3, Lud3/a;->h:Lud3/e0;

    iget-object v3, v3, Lud3/e0;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "; exhausted proxy configurations: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Lzd3/w;->e:Ljava/util/List;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_24
    :goto_f
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_25

    iget-object v2, v0, Lzd3/w;->h:Ljava/util/ArrayList;

    invoke-static {v1, v2}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    iget-object v0, v0, Lzd3/w;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    :cond_25
    new-instance v0, Lbd3/v;

    invoke-direct {v0, v1}, Lbd3/v;-><init>(Ljava/util/ArrayList;)V

    iput-object v0, p0, Lzd3/r;->n:Lbd3/v;

    iget-object v2, p0, Lzd3/r;->l:Lzd3/o;

    iget-boolean v2, v2, Lzd3/o;->R:Z

    if-nez v2, :cond_28

    iget v2, v0, Lbd3/v;->x:I

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_27

    iget v2, v0, Lbd3/v;->x:I

    add-int/lit8 v3, v2, 0x1

    iput v3, v0, Lbd3/v;->x:I

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lud3/b1;

    invoke-virtual {p0, v0, v1}, Lzd3/r;->c(Lud3/b1;Ljava/util/ArrayList;)Lzd3/c;

    move-result-object v0

    :goto_10
    iget-object v1, v0, Lzd3/c;->l:Ljava/util/List;

    invoke-virtual {p0, v0, v1}, Lzd3/r;->d(Lzd3/c;Ljava/util/List;)Lzd3/s;

    move-result-object v1

    if-eqz v1, :cond_26

    return-object v1

    :cond_26
    return-object v0

    :cond_27
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_28
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Canceled"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_29
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_2a
    new-instance v0, Ljava/io/IOException;

    const-string v1, "exhausted all routes"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_11
    monitor-exit v0

    throw v1
.end method

.method public final c(Lud3/b1;Ljava/util/ArrayList;)Lzd3/c;
    .locals 30

    move-object/from16 v10, p0

    move-object/from16 v11, p1

    const-string v0, "route"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v11, Lud3/b1;->a:Lud3/a;

    iget-object v1, v0, Lud3/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v1, :cond_2

    iget-object v0, v0, Lud3/a;->j:Ljava/util/List;

    sget-object v1, Lud3/r;->f:Lud3/r;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v11, Lud3/b1;->a:Lud3/a;

    iget-object v0, v0, Lud3/a;->h:Lud3/e0;

    iget-object v0, v0, Lud3/e0;->d:Ljava/lang/String;

    sget-object v1, Lfe3/e;->a:Lfe3/e;

    sget-object v1, Lfe3/e;->a:Lfe3/e;

    invoke-virtual {v1, v0}, Lfe3/e;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/net/UnknownServiceException;

    const-string v2, "CLEARTEXT communication to "

    const-string v3, " not permitted by network security policy"

    invoke-static {v2, v0, v3}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    new-instance v0, Ljava/net/UnknownServiceException;

    const-string v1, "CLEARTEXT communication not enabled for client"

    invoke-direct {v0, v1}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, v0, Lud3/a;->i:Ljava/util/List;

    sget-object v1, Lud3/m0;->G:Lud3/m0;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    :goto_0
    iget-object v0, v11, Lud3/b1;->b:Ljava/net/Proxy;

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_3

    goto :goto_1

    :cond_3
    iget-object v0, v11, Lud3/b1;->a:Lud3/a;

    iget-object v1, v0, Lud3/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v1, :cond_5

    iget-object v0, v0, Lud3/a;->i:Ljava/util/List;

    sget-object v1, Lud3/m0;->G:Lud3/m0;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    move-object v14, v2

    goto/16 :goto_3

    :cond_5
    :goto_2
    new-instance v0, Lud3/n0;

    invoke-direct {v0}, Lud3/n0;-><init>()V

    iget-object v1, v11, Lud3/b1;->a:Lud3/a;

    iget-object v1, v1, Lud3/a;->h:Lud3/e0;

    const-string v3, "url"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lud3/n0;->a:Lud3/e0;

    const-string v1, "CONNECT"

    invoke-virtual {v0, v1, v2}, Lud3/n0;->e(Ljava/lang/String;Lud3/v0;)V

    iget-object v1, v11, Lud3/b1;->a:Lud3/a;

    iget-object v2, v1, Lud3/a;->h:Lud3/e0;

    const/4 v3, 0x1

    invoke-static {v2, v3}, Lwd3/h;->i(Lud3/e0;Z)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Host"

    invoke-virtual {v0, v3, v2}, Lud3/n0;->c(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "Proxy-Connection"

    const-string v3, "Keep-Alive"

    invoke-virtual {v0, v2, v3}, Lud3/n0;->c(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "User-Agent"

    const-string v3, "okhttp/5.3.2"

    invoke-virtual {v0, v2, v3}, Lud3/n0;->c(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v13, Lud3/o0;

    invoke-direct {v13, v0}, Lud3/o0;-><init>(Lud3/n0;)V

    sget-object v19, Lud3/a1;->x:Lud3/z0;

    sget-object v29, Lud3/d1;->A:Lud3/t;

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3}, Lkotlin/jvm/internal/k0;-><init>(IZ)V

    sget-object v14, Lud3/m0;->z:Lud3/m0;

    const-string v2, "Proxy-Authenticate"

    invoke-static {v2}, Lva3/b;->e(Ljava/lang/String;)V

    const-string v3, "OkHttp-Preemptive"

    invoke-static {v3, v2}, Lva3/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/k0;->j(Ljava/lang/String;)V

    invoke-static {v0, v2, v3}, Lva3/b;->b(Lkotlin/jvm/internal/k0;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lkotlin/jvm/internal/k0;->g()Lud3/d0;

    move-result-object v18

    new-instance v12, Lud3/x0;

    const-string v15, "Preemptive Authenticate"

    const/16 v16, 0x197

    const/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, -0x1

    const-wide/16 v26, -0x1

    const/16 v28, 0x0

    invoke-direct/range {v12 .. v29}, Lud3/x0;-><init>(Lud3/o0;Lud3/m0;Ljava/lang/String;ILud3/c0;Lud3/d0;Lud3/a1;Lne3/o0;Lud3/x0;Lud3/x0;Lud3/x0;JJLzd3/g;Lud3/d1;)V

    iget-object v0, v1, Lud3/a;->f:Lud3/c;

    invoke-interface {v0, v11, v12}, Lud3/c;->a(Lud3/b1;Lud3/x0;)Lud3/o0;

    move-result-object v0

    if-nez v0, :cond_6

    move-object v2, v13

    goto :goto_1

    :cond_6
    move-object v2, v0

    goto :goto_1

    :goto_3
    new-instance v0, Lzd3/c;

    iget-object v1, v10, Lzd3/r;->a:Lyd3/d;

    iget-object v2, v10, Lzd3/r;->b:Lzd3/q;

    iget v3, v10, Lzd3/r;->c:I

    iget v4, v10, Lzd3/r;->d:I

    iget v5, v10, Lzd3/r;->e:I

    iget v6, v10, Lzd3/r;->f:I

    iget v7, v10, Lzd3/r;->g:I

    iget-boolean v8, v10, Lzd3/r;->h:Z

    iget-object v9, v10, Lzd3/r;->l:Lzd3/o;

    const/4 v15, -0x1

    const/16 v16, 0x0

    const/4 v13, 0x0

    move-object/from16 v12, p2

    invoke-direct/range {v0 .. v16}, Lzd3/c;-><init>(Lyd3/d;Lzd3/q;IIIIIZLzd3/o;Lzd3/r;Lud3/b1;Ljava/util/List;ILud3/o0;IZ)V

    return-object v0

    :cond_7
    new-instance v0, Ljava/net/UnknownServiceException;

    const-string v1, "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"

    invoke-direct {v0, v1}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d(Lzd3/c;Ljava/util/List;)Lzd3/s;
    .locals 10

    iget-object v0, p0, Lzd3/r;->b:Lzd3/q;

    iget-boolean v1, p0, Lzd3/r;->m:Z

    iget-object v2, p0, Lzd3/r;->j:Lud3/a;

    iget-object v3, p0, Lzd3/r;->l:Lzd3/o;

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lzd3/c;->b()Z

    move-result v6

    if-eqz v6, :cond_0

    move v6, v5

    goto :goto_0

    :cond_0
    move v6, v4

    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lzd3/q;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v7, "iterator(...)"

    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/4 v8, 0x0

    if-eqz v7, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lzd3/p;

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    monitor-enter v7

    if-eqz v6, :cond_3

    :try_start_0
    iget-object v9, v7, Lzd3/p;->j:Lce3/q;

    if-eqz v9, :cond_2

    move v9, v5

    goto :goto_2

    :cond_2
    move v9, v4

    :goto_2
    if-nez v9, :cond_3

    :goto_3
    move v9, v4

    goto :goto_4

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_3
    invoke-virtual {v7, v2, p2}, Lzd3/p;->f(Lud3/a;Ljava/util/List;)Z

    move-result v9

    if-nez v9, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v3, v7}, Lzd3/o;->b(Lzd3/p;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v9, v5

    :goto_4
    monitor-exit v7

    if-eqz v9, :cond_1

    invoke-virtual {v7, v1}, Lzd3/p;->g(Z)Z

    move-result v9

    if-eqz v9, :cond_5

    goto :goto_6

    :cond_5
    monitor-enter v7

    :try_start_1
    iput-boolean v5, v7, Lzd3/p;->k:Z

    invoke-virtual {v3}, Lzd3/o;->j()Ljava/net/Socket;

    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v7

    if-eqz v8, :cond_1

    invoke-static {v8}, Lwd3/h;->c(Ljava/net/Socket;)V

    goto :goto_1

    :catchall_1
    move-exception p1

    monitor-exit v7

    throw p1

    :goto_5
    monitor-exit v7

    throw p1

    :cond_6
    move-object v7, v8

    :goto_6
    if-nez v7, :cond_7

    return-object v8

    :cond_7
    if-eqz p1, :cond_8

    iget-object p2, p1, Lzd3/c;->k:Lud3/b1;

    iput-object p2, p0, Lzd3/r;->p:Lud3/b1;

    iget-object p1, p1, Lzd3/c;->s:Ljava/net/Socket;

    if-eqz p1, :cond_8

    invoke-static {p1}, Lwd3/h;->c(Ljava/net/Socket;)V

    :cond_8
    iget-object p1, p0, Lzd3/r;->l:Lzd3/o;

    iget-object p2, p1, Lzd3/o;->E:Lud3/a0;

    invoke-virtual {p2, p1, v7}, Lud3/a0;->connectionAcquired(Lud3/j;Lud3/p;)V

    new-instance p1, Lzd3/s;

    invoke-direct {p1, v7}, Lzd3/s;-><init>(Lzd3/p;)V

    return-object p1
.end method

.method public final e(Lud3/e0;)Z
    .locals 3

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lzd3/r;->j:Lud3/a;

    iget-object v0, v0, Lud3/a;->h:Lud3/e0;

    iget v1, p1, Lud3/e0;->e:I

    iget v2, v0, Lud3/e0;->e:I

    if-ne v1, v2, :cond_0

    iget-object p1, p1, Lud3/e0;->d:Ljava/lang/String;

    iget-object v0, v0, Lud3/e0;->d:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
