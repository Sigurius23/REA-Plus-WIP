.class public final Lc6/j;
.super Lc6/c;
.source "SourceFile"

# interfaces
.implements La6/l1;


# virtual methods
.method public final d(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Lc6/i;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lc6/i;

    iget v1, v0, Lc6/i;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lc6/i;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lc6/i;

    check-cast p2, Ls83/c;

    invoke-direct {v0, p0, p2}, Lc6/i;-><init>(Lc6/j;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lc6/i;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lc6/i;->F:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    iget-object v4, p0, Lc6/c;->b:Lne3/e0;

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v5, :cond_1

    iget-object p1, v0, Lc6/i;->y:Lne3/h0;

    iget-object v1, v0, Lc6/i;->x:Lne3/z;

    iget-object v0, v0, Lc6/i;->w:Lne3/z;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p2

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lc6/c;->c:Lc6/a;

    iget-object p2, p2, Lc6/a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    if-nez p2, :cond_c

    :try_start_1
    iget-object p2, p0, Lc6/c;->a:Lne3/p;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "file"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v4}, Lne3/p;->o0(Lne3/e0;)Lne3/z;

    move-result-object p2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    invoke-static {p2}, Lne3/z;->h(Lne3/z;)Lne3/n;

    move-result-object v2

    invoke-static {v2}, Lne3/b;->b(Lne3/n0;)Lne3/h0;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    :try_start_3
    iput-object p2, v0, Lc6/i;->w:Lne3/z;

    iput-object p2, v0, Lc6/i;->x:Lne3/z;

    iput-object v2, v0, Lc6/i;->y:Lne3/h0;

    iput v5, v0, Lc6/i;->F:I

    new-instance v0, Lne3/g0;

    invoke-direct {v0, v2}, Lne3/g0;-><init>(Lne3/h0;)V

    check-cast p1, Lio/getstream/video/android/core/notifications/internal/storage/DevicePreferences;

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    sget-object v5, Ldd3/a;->b:Ldd3/a;

    sget-object v7, Lio/getstream/video/android/core/notifications/internal/storage/DevicePreferences;->Companion:Lio/getstream/video/android/core/notifications/internal/storage/a;

    invoke-virtual {v7}, Lio/getstream/video/android/core/notifications/internal/storage/a;->serializer()Lwc3/c;

    move-result-object v7

    check-cast v7, Lwc3/j;

    invoke-virtual {v5, v7, p1}, Ldd3/a;->b(Lwc3/j;Ljava/lang/Object;)[B

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :goto_1
    if-ne v3, v1, :cond_4

    return-object v1

    :cond_4
    move-object v0, p2

    move-object v1, v0

    move-object p1, v2

    :goto_2
    :try_start_4
    invoke-virtual {v1}, Lne3/z;->flush()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz p1, :cond_5

    :try_start_5
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_4

    :cond_5
    :goto_3
    move-object p1, v6

    :goto_4
    move-object p2, v0

    goto :goto_8

    :goto_5
    move-object v0, p2

    move-object p2, p1

    move-object p1, v2

    goto :goto_6

    :catchall_2
    move-exception p1

    goto :goto_5

    :goto_6
    if-eqz p1, :cond_6

    :try_start_6
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_7

    :catchall_3
    move-exception p1

    :try_start_7
    invoke-static {p2, p1}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    goto :goto_7

    :catchall_4
    move-exception p1

    move-object p2, v0

    goto :goto_9

    :cond_6
    :goto_7
    move-object p1, p2

    goto :goto_4

    :goto_8
    if-nez p1, :cond_7

    if-eqz p2, :cond_9

    :try_start_8
    invoke-interface {p2}, Ljava/io/Closeable;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    goto :goto_b

    :catchall_5
    move-exception v6

    goto :goto_b

    :cond_7
    :try_start_9
    throw p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    :catchall_6
    move-exception p1

    :goto_9
    if-eqz p2, :cond_8

    :try_start_a
    invoke-interface {p2}, Ljava/io/Closeable;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    goto :goto_a

    :catchall_7
    move-exception p2

    :try_start_b
    invoke-static {p1, p2}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_a

    :catch_0
    move-exception p1

    goto :goto_c

    :cond_8
    :goto_a
    move-object v6, p1

    :cond_9
    :goto_b
    if-nez v6, :cond_a

    return-object v3

    :cond_a
    throw v6
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0

    :goto_c
    instance-of p2, p1, Ljava/io/FileNotFoundException;

    if-eqz p2, :cond_b

    invoke-virtual {v4}, Lne3/e0;->c()Lne3/e0;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    check-cast p1, Ljava/io/FileNotFoundException;

    invoke-static {p2, p1}, Lse/h;->V(Ljava/lang/String;Ljava/io/FileNotFoundException;)Ljava/lang/Exception;

    move-result-object p1

    :cond_b
    throw p1

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This scope has already been closed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
