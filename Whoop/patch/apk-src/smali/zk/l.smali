.class public final Lzk/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzk/q;
.implements Lzk/s;


# static fields
.field public static final i:Z


# instance fields
.field public final a:Lzk/w;

.field public final b:Lyl/a;

.field public final c:Lbl/e;

.field public final d:Lio/sentry/android/core/d;

.field public final e:Lbd3/k;

.field public final f:Lio/sentry/android/core/util/a;

.field public final g:Lae3/k;

.field public final h:Lzt/q;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "Engine"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    sput-boolean v0, Lzk/l;->i:Z

    return-void
.end method

.method public constructor <init>(Lbl/e;Lad3/z;Lcl/b;Lcl/b;Lcl/b;Lcl/b;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzk/l;->c:Lbl/e;

    new-instance v0, Lio/sentry/android/core/util/a;

    invoke-direct {v0, p2}, Lio/sentry/android/core/util/a;-><init>(Lad3/z;)V

    iput-object v0, p0, Lzk/l;->f:Lio/sentry/android/core/util/a;

    new-instance p2, Lzt/q;

    const/16 v1, 0x17

    invoke-direct {p2, v1}, Lzt/q;-><init>(I)V

    iput-object p2, p0, Lzk/l;->h:Lzt/q;

    monitor-enter p0

    :try_start_0
    monitor-enter p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iput-object p0, p2, Lzt/q;->E:Ljava/lang/Object;

    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    new-instance p2, Lyl/a;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lzk/l;->b:Lyl/a;

    new-instance p2, Lzk/w;

    invoke-direct {p2}, Lzk/w;-><init>()V

    iput-object p2, p0, Lzk/l;->a:Lzk/w;

    new-instance v1, Lio/sentry/android/core/d;

    move-object v7, p0

    move-object v6, p0

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v1 .. v7}, Lio/sentry/android/core/d;-><init>(Lcl/b;Lcl/b;Lcl/b;Lcl/b;Lzk/l;Lzk/l;)V

    iput-object v1, v6, Lzk/l;->d:Lio/sentry/android/core/d;

    new-instance p2, Lae3/k;

    invoke-direct {p2, v0}, Lae3/k;-><init>(Lio/sentry/android/core/util/a;)V

    iput-object p2, v6, Lzk/l;->g:Lae3/k;

    new-instance p2, Lbd3/k;

    invoke-direct {p2}, Lbd3/k;-><init>()V

    iput-object p2, v6, Lzk/l;->e:Lbd3/k;

    iput-object v6, p1, Lbl/e;->d:Lzk/l;

    return-void

    :catchall_0
    move-exception v0

    move-object v6, p0

    :goto_0
    move-object p1, v0

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v6, p0

    :goto_1
    move-object p1, v0

    :try_start_3
    monitor-exit p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :try_start_4
    throw p1

    :catchall_2
    move-exception v0

    goto :goto_0

    :catchall_3
    move-exception v0

    goto :goto_1

    :goto_2
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p1
.end method

.method public static c(Ljava/lang/String;JLzk/r;)V
    .locals 1

    const-string v0, " in "

    invoke-static {p0, v0}, Le4/p;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-static {p1, p2}, Ltl/g;->a(J)D

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p1, "ms, key: "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "Engine"

    invoke-static {p1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static f(Lzk/z;)V
    .locals 1

    instance-of v0, p0, Lzk/t;

    if-eqz v0, :cond_0

    check-cast p0, Lzk/t;

    invoke-virtual {p0}, Lzk/t;->e()V

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot release anything but an EngineResource"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a(Lcom/bumptech/glide/c;Ljava/lang/Object;Lwk/e;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/d;Lzk/k;Ltl/b;ZZLwk/h;ZZLpl/e;Ljava/util/concurrent/Executor;)Lz63/d;
    .locals 23

    move-object/from16 v2, p0

    sget-boolean v0, Lzk/l;->i:Z

    if-eqz v0, :cond_0

    invoke-static {}, Ltl/g;->b()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    iget-object v3, v2, Lzk/l;->b:Lyl/a;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Lzk/r;

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move/from16 v7, p4

    move/from16 v8, p5

    move-object/from16 v10, p6

    move-object/from16 v11, p7

    move-object/from16 v9, p10

    move-object/from16 v12, p13

    invoke-direct/range {v4 .. v12}, Lzk/r;-><init>(Ljava/lang/Object;Lwk/e;IILjava/util/Map;Ljava/lang/Class;Ljava/lang/Class;Lwk/h;)V

    monitor-enter p0

    move/from16 v3, p14

    :try_start_0
    invoke-virtual {v2, v4, v3, v0, v1}, Lzk/l;->b(Lzk/r;ZJ)Lzk/t;

    move-result-object v5

    if-nez v5, :cond_1

    move-object/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move/from16 v13, p11

    move/from16 v14, p12

    move-object/from16 v15, p13

    move/from16 v17, p15

    move-object/from16 v18, p16

    move-object/from16 v19, p17

    move-wide/from16 v21, v0

    move/from16 v16, v3

    move-object/from16 v20, v4

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    invoke-virtual/range {v2 .. v22}, Lzk/l;->g(Lcom/bumptech/glide/c;Ljava/lang/Object;Lwk/e;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/d;Lzk/k;Ljava/util/Map;ZZLwk/h;ZZLpl/e;Ljava/util/concurrent/Executor;Lzk/r;J)Lz63/d;

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    move-object v0, v5

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v1, Lwk/a;->E:Lwk/a;

    move-object/from16 v2, p16

    invoke-virtual {v2, v0, v1}, Lpl/e;->k(Lzk/z;Lwk/a;)V

    const/4 v0, 0x0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final b(Lzk/r;ZJ)Lzk/t;
    .locals 8

    const/4 v0, 0x0

    if-nez p2, :cond_0

    move-object v7, p0

    goto/16 :goto_4

    :cond_0
    iget-object p2, p0, Lzk/l;->h:Lzt/q;

    monitor-enter p2

    :try_start_0
    iget-object v1, p2, Lzt/q;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzk/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    if-nez v1, :cond_1

    monitor-exit p2

    move-object v2, v0

    goto :goto_1

    :cond_1
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzk/t;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    if-nez v2, :cond_2

    :try_start_2
    invoke-virtual {p2, v1}, Lzt/q;->r(Lzk/a;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    move-object v7, p0

    goto/16 :goto_8

    :cond_2
    :goto_0
    monitor-exit p2

    :goto_1
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lzk/t;->b()V

    :cond_3
    if-eqz v2, :cond_5

    sget-boolean p2, Lzk/l;->i:Z

    if-eqz p2, :cond_4

    const-string p2, "Loaded resource from active resources"

    invoke-static {p2, p3, p4, p1}, Lzk/l;->c(Ljava/lang/String;JLzk/r;)V

    :cond_4
    return-object v2

    :cond_5
    iget-object v1, p0, Lzk/l;->c:Lbl/e;

    monitor-enter v1

    :try_start_3
    iget-object p2, v1, Ltl/h;->a:Ljava/util/LinkedHashMap;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-eqz p2, :cond_6

    :try_start_4
    iget-wide v2, v1, Ltl/h;->c:J

    invoke-virtual {v1, p2}, Lbl/e;->b(Ljava/lang/Object;)I

    move-result v4

    int-to-long v4, v4

    sub-long/2addr v2, v4

    iput-wide v2, v1, Ltl/h;->c:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object p1, v0

    move-object v7, p0

    goto :goto_6

    :cond_6
    :goto_2
    monitor-exit v1

    move-object v3, p2

    check-cast v3, Lzk/z;

    if-nez v3, :cond_7

    move-object v7, p0

    move-object v6, p1

    move-object v3, v0

    goto :goto_3

    :cond_7
    instance-of p2, v3, Lzk/t;

    if-eqz p2, :cond_8

    check-cast v3, Lzk/t;

    move-object v7, p0

    move-object v6, p1

    goto :goto_3

    :cond_8
    new-instance v2, Lzk/t;

    const/4 v4, 0x1

    const/4 v5, 0x1

    move-object v7, p0

    move-object v6, p1

    invoke-direct/range {v2 .. v7}, Lzk/t;-><init>(Lzk/z;ZZLwk/e;Lzk/s;)V

    move-object v3, v2

    :goto_3
    if-eqz v3, :cond_9

    invoke-virtual {v3}, Lzk/t;->b()V

    iget-object p1, v7, Lzk/l;->h:Lzt/q;

    invoke-virtual {p1, v6, v3}, Lzt/q;->b(Lwk/e;Lzk/t;)V

    :cond_9
    if-eqz v3, :cond_b

    sget-boolean p1, Lzk/l;->i:Z

    if-eqz p1, :cond_a

    const-string p1, "Loaded resource from cache"

    invoke-static {p1, p3, p4, v6}, Lzk/l;->c(Ljava/lang/String;JLzk/r;)V

    :cond_a
    return-object v3

    :cond_b
    :goto_4
    return-object v0

    :catchall_2
    move-exception v0

    move-object v7, p0

    :goto_5
    move-object p1, v0

    :goto_6
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    throw p1

    :catchall_3
    move-exception v0

    goto :goto_5

    :catchall_4
    move-exception v0

    move-object v7, p0

    :goto_7
    move-object p1, v0

    :goto_8
    :try_start_6
    monitor-exit p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    throw p1

    :catchall_5
    move-exception v0

    goto :goto_7
.end method

.method public final declared-synchronized d(Lzk/p;Lwk/e;Lzk/t;)V
    .locals 1

    monitor-enter p0

    if-eqz p3, :cond_0

    :try_start_0
    invoke-virtual {p3}, Lzk/t;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzk/l;->h:Lzt/q;

    invoke-virtual {v0, p2, p3}, Lzt/q;->b(Lwk/e;Lzk/t;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p3, p0, Lzk/l;->a:Lzk/w;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p3, p3, Lzk/w;->a:Ljava/lang/Object;

    check-cast p3, Ljava/util/HashMap;

    invoke-virtual {p3, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p3, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final e(Lwk/e;Lzk/t;)V
    .locals 2

    iget-object v0, p0, Lzk/l;->h:Lzt/q;

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzk/a;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lzk/a;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    invoke-virtual {p2}, Lzk/t;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lzk/l;->c:Lbl/e;

    invoke-virtual {v0, p1, p2}, Ltl/h;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzk/z;

    return-void

    :cond_1
    iget-object p1, p0, Lzk/l;->e:Lbd3/k;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Lbd3/k;->m(Lzk/z;Z)V

    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final g(Lcom/bumptech/glide/c;Ljava/lang/Object;Lwk/e;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/d;Lzk/k;Ljava/util/Map;ZZLwk/h;ZZLpl/e;Ljava/util/concurrent/Executor;Lzk/r;J)Lz63/d;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p16

    move-object/from16 v2, p17

    move-object/from16 v6, p18

    move-wide/from16 v3, p19

    iget-object v5, v0, Lzk/l;->a:Lzk/w;

    iget-object v7, v5, Lzk/w;->a:Ljava/lang/Object;

    check-cast v7, Ljava/util/HashMap;

    invoke-virtual {v7, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lzk/p;

    sget-boolean v20, Lzk/l;->i:Z

    if-eqz v7, :cond_1

    invoke-virtual {v7, v1, v2}, Lzk/p;->a(Lpl/e;Ljava/util/concurrent/Executor;)V

    if-eqz v20, :cond_0

    const-string v2, "Added to existing load"

    invoke-static {v2, v3, v4, v6}, Lzk/l;->c(Ljava/lang/String;JLzk/r;)V

    :cond_0
    new-instance v2, Lz63/d;

    invoke-direct {v2, v0, v1, v7}, Lz63/d;-><init>(Lzk/l;Lpl/e;Lzk/p;)V

    return-object v2

    :cond_1
    iget-object v7, v0, Lzk/l;->d:Lio/sentry/android/core/d;

    iget-object v7, v7, Lio/sentry/android/core/d;->g:Ljava/lang/Object;

    check-cast v7, Ls/m2;

    invoke-virtual {v7}, Ls/m2;->b()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lzk/p;

    move/from16 v8, p14

    move/from16 v9, p15

    invoke-virtual {v7, v6, v8, v9}, Lzk/p;->f(Lzk/r;ZZ)V

    iget-object v8, v0, Lzk/l;->g:Lae3/k;

    iget-object v9, v8, Lae3/k;->d:Ljava/lang/Object;

    check-cast v9, Ls/m2;

    invoke-virtual {v9}, Ls/m2;->b()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lzk/i;

    iget v10, v8, Lae3/k;->b:I

    add-int/lit8 v11, v10, 0x1

    iput v11, v8, Lae3/k;->b:I

    move-object/from16 v4, p1

    move/from16 v8, p4

    move-object/from16 v11, p7

    move-object/from16 v12, p8

    move-object/from16 v13, p9

    move-object/from16 v14, p10

    move/from16 v15, p11

    move/from16 v16, p12

    move-object/from16 v17, p13

    move-object v0, v5

    move-object/from16 v18, v7

    move-object v3, v9

    move/from16 v19, v10

    move-object/from16 v5, p2

    move-object/from16 v7, p3

    move/from16 v9, p5

    move-object/from16 v10, p6

    invoke-virtual/range {v3 .. v19}, Lzk/i;->i(Lcom/bumptech/glide/c;Ljava/lang/Object;Lzk/r;Lwk/e;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/d;Lzk/k;Ljava/util/Map;ZZLwk/h;Lzk/p;I)V

    move-object/from16 v7, v18

    iget-object v0, v0, Lzk/w;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v7, v1, v2}, Lzk/p;->a(Lpl/e;Ljava/util/concurrent/Executor;)V

    invoke-virtual {v7, v3}, Lzk/p;->j(Lzk/i;)V

    if-eqz v20, :cond_2

    const-string v0, "Started new load"

    move-wide/from16 v3, p19

    invoke-static {v0, v3, v4, v6}, Lzk/l;->c(Ljava/lang/String;JLzk/r;)V

    :cond_2
    new-instance v0, Lz63/d;

    move-object/from16 v2, p0

    invoke-direct {v0, v2, v1, v7}, Lz63/d;-><init>(Lzk/l;Lpl/e;Lzk/p;)V

    return-object v0
.end method
