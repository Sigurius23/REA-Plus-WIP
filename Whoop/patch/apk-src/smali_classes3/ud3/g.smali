.class public final Lud3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# instance fields
.field public final w:Lxd3/f;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 3

    sget-object v0, Lne3/p;->w:Lne3/a0;

    sget-object v1, Lne3/e0;->x:Ljava/lang/String;

    invoke-static {p1}, Ljc/b;->p(Ljava/io/File;)Lne3/e0;

    move-result-object p1

    const-string v1, "fileSystem"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lyd3/d;->l:Lyd3/d;

    const-string v2, "taskRunner"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v2, Lxd3/f;

    invoke-direct {v2, v0, p1, v1}, Lxd3/f;-><init>(Lne3/p;Lne3/e0;Lyd3/d;)V

    iput-object v2, p0, Lud3/g;->w:Lxd3/f;

    return-void
.end method

.method public static s(Lud3/x0;Lud3/x0;)V
    .locals 4

    const-string v0, "cached"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lud3/e;

    invoke-direct {v0, p1}, Lud3/e;-><init>(Lud3/x0;)V

    iget-object p0, p0, Lud3/x0;->G:Lud3/a1;

    const-string p1, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lud3/d;

    iget-object p0, p0, Lud3/d;->y:Lxd3/d;

    :try_start_0
    iget-object p1, p0, Lxd3/d;->z:Lxd3/f;

    iget-object v1, p0, Lxd3/d;->w:Ljava/lang/String;

    iget-wide v2, p0, Lxd3/d;->x:J

    invoke-virtual {p1, v2, v3, v1}, Lxd3/f;->i(JLjava/lang/String;)Lb9/b;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_1
    invoke-virtual {v0, p0}, Lud3/e;->c(Lb9/b;)V

    invoke-virtual {p0}, Lb9/b;->e()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_0
    const/4 p0, 0x0

    :catch_1
    if-eqz p0, :cond_1

    :try_start_2
    invoke-virtual {p0}, Lb9/b;->a()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final b(Lud3/o0;)Lud3/x0;
    .locals 13

    iget-object v0, p1, Lud3/o0;->a:Lud3/e0;

    invoke-static {v0}, Lrg/a;->n(Lud3/e0;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, p0, Lud3/g;->w:Lxd3/f;

    invoke-virtual {v3, v1}, Lxd3/f;->k(Ljava/lang/String;)Lxd3/d;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    if-nez v1, :cond_0

    goto/16 :goto_3

    :cond_0
    :try_start_1
    new-instance v3, Lud3/e;

    iget-object v4, v1, Lxd3/d;->y:Ljava/util/ArrayList;

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lne3/p0;

    invoke-direct {v3, v4}, Lud3/e;-><init>(Lne3/p0;)V

    iget-object v4, v3, Lud3/e;->c:Ljava/lang/String;

    iget-object v5, v3, Lud3/e;->b:Lud3/d0;

    iget-object v6, v3, Lud3/e;->a:Lud3/e0;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    const-string v7, "Content-Type"

    iget-object v8, v3, Lud3/e;->g:Lud3/d0;

    invoke-virtual {v8, v7}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v9, "Content-Length"

    invoke-virtual {v8, v9}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lud3/o0;

    const-string v11, "url"

    invoke-static {v6, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "headers"

    invoke-static {v5, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "method"

    invoke-static {v4, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v11, Lud3/n0;

    invoke-direct {v11}, Lud3/n0;-><init>()V

    iput-object v6, v11, Lud3/n0;->a:Lud3/e0;

    invoke-virtual {v11, v5}, Lud3/n0;->d(Lud3/d0;)V

    const-string v12, "\u0000"

    invoke-virtual {v4, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1

    move-object v12, v4

    goto :goto_0

    :cond_1
    const-string v12, "GET"

    :goto_0
    invoke-virtual {v11, v12, v2}, Lud3/n0;->e(Ljava/lang/String;Lud3/v0;)V

    invoke-direct {v10, v11}, Lud3/o0;-><init>(Lud3/n0;)V

    new-instance v11, Lud3/w0;

    invoke-direct {v11}, Lud3/w0;-><init>()V

    iput-object v10, v11, Lud3/w0;->a:Lud3/o0;

    const-string v10, "protocol"

    iget-object v12, v3, Lud3/e;->d:Lud3/m0;

    invoke-static {v12, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v12, v11, Lud3/w0;->b:Lud3/m0;

    iget v10, v3, Lud3/e;->e:I

    iput v10, v11, Lud3/w0;->c:I

    const-string v10, "message"

    iget-object v12, v3, Lud3/e;->f:Ljava/lang/String;

    invoke-static {v12, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v12, v11, Lud3/w0;->d:Ljava/lang/String;

    invoke-virtual {v11, v8}, Lud3/w0;->c(Lud3/d0;)V

    new-instance v8, Lud3/d;

    invoke-direct {v8, v1, v7, v9}, Lud3/d;-><init>(Lxd3/d;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v8, v11, Lud3/w0;->g:Lud3/a1;

    iget-object v1, v3, Lud3/e;->h:Lud3/c0;

    iput-object v1, v11, Lud3/w0;->e:Lud3/c0;

    iget-wide v7, v3, Lud3/e;->i:J

    iput-wide v7, v11, Lud3/w0;->l:J

    iget-wide v7, v3, Lud3/e;->j:J

    iput-wide v7, v11, Lud3/w0;->m:J

    invoke-virtual {v11}, Lud3/w0;->a()Lud3/x0;

    move-result-object v1

    invoke-virtual {v6, v0}, Lud3/e0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p1, Lud3/o0;->b:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, v1, Lud3/x0;->F:Lud3/d0;

    invoke-static {v0}, Lrg/a;->u(Lud3/d0;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v3, v0, Ljava/util/Collection;

    if-eqz v3, :cond_2

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v5, v3}, Lud3/d0;->j(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    iget-object v6, p1, Lud3/o0;->c:Lud3/d0;

    invoke-virtual {v6, v3}, Lud3/d0;->j(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_2

    :cond_4
    :goto_1
    return-object v1

    :cond_5
    :goto_2
    iget-object p1, v1, Lud3/x0;->G:Lud3/a1;

    invoke-static {p1}, Lwd3/f;->b(Ljava/io/Closeable;)V

    return-object v2

    :catch_0
    invoke-static {v1}, Lwd3/f;->b(Ljava/io/Closeable;)V

    :catch_1
    :goto_3
    return-object v2
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lud3/g;->w:Lxd3/f;

    invoke-virtual {v0}, Lxd3/f;->close()V

    return-void
.end method

.method public final flush()V
    .locals 1

    iget-object v0, p0, Lud3/g;->w:Lxd3/f;

    invoke-virtual {v0}, Lxd3/f;->flush()V

    return-void
.end method

.method public final h(Lud3/x0;)Lc33/c;
    .locals 6

    iget-object v0, p1, Lud3/x0;->w:Lud3/o0;

    iget-object v1, v0, Lud3/o0;->b:Ljava/lang/String;

    invoke-static {v1}, Lwb3/f;->H(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    :try_start_0
    invoke-virtual {p0, v0}, Lud3/g;->i(Lud3/o0;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v3

    :cond_0
    const-string v2, "GET"

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p1, Lud3/x0;->F:Lud3/d0;

    invoke-static {v1}, Lrg/a;->u(Lud3/d0;)Ljava/util/Set;

    move-result-object v1

    const-string v2, "*"

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    new-instance v1, Lud3/e;

    invoke-direct {v1, p1}, Lud3/e;-><init>(Lud3/x0;)V

    :try_start_1
    iget-object p1, p0, Lud3/g;->w:Lxd3/f;

    iget-object v0, v0, Lud3/o0;->a:Lud3/e0;

    invoke-static {v0}, Lrg/a;->n(Lud3/e0;)Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lxd3/f;->T:Lyb3/p;

    const-wide/16 v4, -0x1

    invoke-virtual {p1, v4, v5, v0}, Lxd3/f;->i(JLjava/lang/String;)Lb9/b;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    :try_start_2
    invoke-virtual {v1, p1}, Lud3/e;->c(Lb9/b;)V

    new-instance v0, Lc33/c;

    invoke-direct {v0, p0, p1}, Lc33/c;-><init>(Lud3/g;Lb9/b;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    return-object v0

    :catch_1
    move-object p1, v3

    :catch_2
    if-eqz p1, :cond_4

    :try_start_3
    invoke-virtual {p1}, Lb9/b;->a()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :cond_4
    :goto_0
    return-object v3
.end method

.method public final i(Lud3/o0;)V
    .locals 5

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lud3/g;->w:Lxd3/f;

    iget-object p1, p1, Lud3/o0;->a:Lud3/e0;

    invoke-static {p1}, Lrg/a;->n(Lud3/e0;)Ljava/lang/String;

    move-result-object p1

    monitor-enter v0

    :try_start_0
    const-string v1, "key"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lxd3/f;->m()V

    invoke-virtual {v0}, Lxd3/f;->b()V

    invoke-static {p1}, Lxd3/f;->p0(Ljava/lang/String;)V

    iget-object v1, v0, Lxd3/f;->I:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxd3/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {v0, p1}, Lxd3/f;->b0(Lxd3/c;)V

    iget-wide v1, v0, Lxd3/f;->G:J

    iget-wide v3, v0, Lxd3/f;->y:J

    cmp-long p1, v1, v3

    if-gtz p1, :cond_1

    const/4 p1, 0x0

    iput-boolean p1, v0, Lxd3/f;->O:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized k()V
    .locals 0

    monitor-enter p0

    monitor-exit p0

    return-void
.end method

.method public final declared-synchronized m(Lpg3/o;)V
    .locals 0

    monitor-enter p0

    monitor-exit p0

    return-void
.end method
