.class public final Lc6/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La6/g1;


# instance fields
.field public final a:Lne3/p;

.field public final b:Lne3/e0;

.field public final c:Lz5/b;

.field public final d:La6/d1;

.field public final e:Lc6/d;

.field public final f:Lc6/a;

.field public final g:Lmc3/c;


# direct methods
.method public constructor <init>(Lne3/p;Lne3/e0;Lz5/b;La6/d1;Lc6/d;)V
    .locals 1

    const-string v0, "fileSystem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coordinator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc6/h;->a:Lne3/p;

    iput-object p2, p0, Lc6/h;->b:Lne3/e0;

    iput-object p3, p0, Lc6/h;->c:Lz5/b;

    iput-object p4, p0, Lc6/h;->d:La6/d1;

    iput-object p5, p0, Lc6/h;->e:Lc6/d;

    new-instance p1, Lc6/a;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lc6/a;-><init>(I)V

    iput-object p1, p0, Lc6/h;->f:Lc6/a;

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, Lc6/h;->g:Lmc3/c;

    return-void
.end method


# virtual methods
.method public final b(La6/r;Ls83/c;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p2, Lc6/f;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lc6/f;

    iget v1, v0, Lc6/f;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lc6/f;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lc6/f;

    invoke-direct {v0, p0, p2}, Lc6/f;-><init>(Lc6/h;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lc6/f;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lc6/f;->E:I

    iget-object v3, p0, Lc6/h;->g:Lmc3/c;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-boolean p1, v0, Lc6/f;->w:Z

    iget-object v0, v0, Lc6/f;->x:Lc6/c;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lc6/h;->f:Lc6/a;

    iget-object p2, p2, Lc6/a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    if-nez p2, :cond_7

    invoke-virtual {v3}, Lmc3/c;->tryLock()Z

    move-result p2

    :try_start_1
    new-instance v2, Lc6/c;

    iget-object v6, p0, Lc6/h;->a:Lne3/p;

    iget-object v7, p0, Lc6/h;->b:Lne3/e0;

    iget-object v8, p0, Lc6/h;->c:Lz5/b;

    invoke-direct {v2, v6, v7, v8}, Lc6/c;-><init>(Lne3/p;Lne3/e0;Lz5/b;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    :try_start_2
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    iput-object v2, v0, Lc6/f;->x:Lc6/c;

    iput-boolean p2, v0, Lc6/f;->w:Z

    iput v4, v0, Lc6/f;->E:I

    invoke-virtual {p1, v2, v6, v0}, La6/r;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move v0, p2

    move-object p2, p1

    move p1, v0

    move-object v0, v2

    :goto_1
    :try_start_3
    invoke-interface {v0}, La6/a;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-object v0, v5

    goto :goto_2

    :catchall_1
    move-exception v0

    :goto_2
    if-nez v0, :cond_5

    if-eqz p1, :cond_4

    invoke-virtual {v3, v5}, Lmc3/c;->i(Ljava/lang/Object;)V

    :cond_4
    return-object p2

    :cond_5
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p2

    goto :goto_5

    :catchall_3
    move-exception p1

    move v0, p2

    move-object p2, p1

    move p1, v0

    move-object v0, v2

    :goto_3
    :try_start_5
    invoke-interface {v0}, La6/a;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    goto :goto_4

    :catchall_4
    move-exception v0

    :try_start_6
    invoke-static {p2, v0}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_4
    throw p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_5
    move-exception p1

    move v9, p2

    move-object p2, p1

    move p1, v9

    :goto_5
    if-eqz p1, :cond_6

    invoke-virtual {v3, v5}, Lmc3/c;->i(Ljava/lang/Object;)V

    :cond_6
    throw p2

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "StorageConnection has already been disposed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(La6/h0;Ls83/c;)Ljava/lang/Object;
    .locals 9

    const-string v0, ".tmp"

    instance-of v1, p2, Lc6/g;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Lc6/g;

    iget v2, v1, Lc6/g;->F:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lc6/g;->F:I

    goto :goto_0

    :cond_0
    new-instance v1, Lc6/g;

    invoke-direct {v1, p0, p2}, Lc6/g;-><init>(Lc6/h;Ls83/c;)V

    :goto_0
    iget-object p2, v1, Lc6/g;->z:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lc6/g;->F:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    iget-object v6, p0, Lc6/h;->b:Lne3/e0;

    iget-object v7, p0, Lc6/h;->a:Lne3/p;

    const/4 v8, 0x0

    if-eqz v3, :cond_3

    if-eq v3, v5, :cond_2

    if-ne v3, v4, :cond_1

    iget-object p1, v1, Lc6/g;->y:Ljava/lang/Object;

    check-cast p1, La6/a;

    iget-object v0, v1, Lc6/g;->x:Lne3/e0;

    iget-object v1, v1, Lc6/g;->w:Ljava/lang/Object;

    check-cast v1, Lmc3/a;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p2

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v1, Lc6/g;->y:Ljava/lang/Object;

    check-cast p1, Lmc3/a;

    iget-object v3, v1, Lc6/g;->x:Lne3/e0;

    iget-object v5, v1, Lc6/g;->w:Ljava/lang/Object;

    check-cast v5, Lc93/m;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, p1

    move-object p1, v5

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lc6/h;->f:Lc6/a;

    iget-object p2, p2, Lc6/a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    if-nez p2, :cond_a

    invoke-virtual {v6}, Lne3/e0;->c()Lne3/e0;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual {v7, v3}, Lne3/p;->i(Lne3/e0;)V

    iput-object p1, v1, Lc6/g;->w:Ljava/lang/Object;

    iput-object v3, v1, Lc6/g;->x:Lne3/e0;

    iget-object p2, p0, Lc6/h;->g:Lmc3/c;

    iput-object p2, v1, Lc6/g;->y:Ljava/lang/Object;

    iput v5, v1, Lc6/g;->F:I

    invoke-virtual {p2, v1}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v2, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    :try_start_1
    invoke-virtual {v6}, Lne3/e0;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lne3/e0;->e(Ljava/lang/String;)Lne3/e0;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    :try_start_2
    invoke-virtual {v7, v0}, Lne3/p;->m(Lne3/e0;)V

    new-instance v3, Lc6/j;

    iget-object v5, p0, Lc6/h;->c:Lz5/b;

    invoke-direct {v3, v7, v0, v5}, Lc6/c;-><init>(Lne3/p;Lne3/e0;Lz5/b;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    :try_start_3
    iput-object p2, v1, Lc6/g;->w:Ljava/lang/Object;

    iput-object v0, v1, Lc6/g;->x:Lne3/e0;

    iput-object v3, v1, Lc6/g;->y:Ljava/lang/Object;

    iput v4, v1, Lc6/g;->F:I

    invoke-interface {p1, v3, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    if-ne p1, v2, :cond_5

    :goto_2
    return-object v2

    :cond_5
    move-object v1, p2

    move-object p1, v3

    :goto_3
    :try_start_4
    invoke-interface {p1}, La6/a;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    move-object p1, v8

    goto :goto_4

    :catchall_1
    move-exception p1

    :goto_4
    if-nez p1, :cond_7

    :try_start_5
    invoke-virtual {v7, v0}, Lne3/p;->x(Lne3/e0;)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {v7, v0, v6}, Lne3/p;->h(Lne3/e0;Lne3/e0;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_5

    :catchall_2
    move-exception p1

    move-object p2, v1

    goto :goto_9

    :catch_0
    move-exception p1

    move-object p2, v1

    goto :goto_8

    :cond_6
    :goto_5
    invoke-interface {v1, v8}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_7
    :try_start_6
    throw p1
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_3
    move-exception p1

    move-object v1, p2

    move-object p2, p1

    move-object p1, v3

    :goto_6
    :try_start_7
    invoke-interface {p1}, La6/a;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    goto :goto_7

    :catchall_4
    move-exception p1

    :try_start_8
    invoke-static {p2, p1}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_7
    throw p2
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :catchall_5
    move-exception p1

    goto :goto_9

    :catch_1
    move-exception p1

    :goto_8
    :try_start_9
    invoke-virtual {v7, v0}, Lne3/p;->x(Lne3/e0;)Z

    move-result v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    if-eqz v1, :cond_8

    :try_start_a
    invoke-virtual {v7, v0}, Lne3/p;->m(Lne3/e0;)V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_2
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    :catch_2
    :cond_8
    :try_start_b
    throw p1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    :goto_9
    invoke-interface {p2, v8}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "must have a parent path"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "StorageConnection has already been disposed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final close()V
    .locals 2

    const/4 v0, 0x1

    iget-object v1, p0, Lc6/h;->f:Lc6/a;

    iget-object v1, v1, Lc6/a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Lc6/h;->e:Lc6/d;

    invoke-virtual {v0}, Lc6/d;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public final e()La6/d1;
    .locals 1

    iget-object v0, p0, Lc6/h;->d:La6/d1;

    return-object v0
.end method
