.class public final Lpp/b;
.super Lpp/p;
.source "SourceFile"


# instance fields
.field public M:Lcom/google/android/gms/tasks/Task;


# direct methods
.method public static N(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    instance-of v0, p0, Lpp/f;

    if-nez v0, :cond_2

    instance-of v0, p0, Lpp/g;

    if-nez v0, :cond_1

    sget-object v0, Lpp/p;->I:Ljava/lang/Object;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x0

    :cond_0
    return-object p0

    :cond_1
    check-cast p0, Lpp/g;

    iget-object p0, p0, Lpp/g;->a:Ljava/lang/Throwable;

    new-instance v0, Ljava/util/concurrent/ExecutionException;

    invoke-direct {v0, p0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_2
    check-cast p0, Lpp/f;

    iget-object p0, p0, Lpp/f;->a:Ljava/lang/Throwable;

    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Task was cancelled."

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v0
.end method

.method public static O(Lpp/b;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lpp/b;->get()Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_0
    return-object p0

    :catchall_0
    move-exception p0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :goto_1
    throw p0

    :catch_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static P(Lpp/b;)V
    .locals 3

    sget-object v0, Lpp/p;->L:Lbi/g;

    invoke-virtual {v0, p0}, Lbi/g;->g0(Lpp/b;)Lpp/o;

    move-result-object v0

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v2, v0, Lpp/o;->a:Ljava/lang/Thread;

    if-eqz v2, :cond_0

    iput-object v1, v0, Lpp/o;->a:Ljava/lang/Thread;

    invoke-static {v2}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_0
    iget-object v0, v0, Lpp/o;->b:Lpp/o;

    goto :goto_0

    :cond_1
    iput-object v1, p0, Lpp/b;->M:Lcom/google/android/gms/tasks/Task;

    sget-object v0, Lpp/p;->L:Lbi/g;

    invoke-virtual {v0, p0}, Lbi/g;->h0(Lpp/b;)Lpp/h;

    move-result-object p0

    move-object v0, v1

    :goto_1
    if-eqz p0, :cond_2

    iget-object v2, p0, Lpp/h;->a:Lpp/h;

    iput-object v0, p0, Lpp/h;->a:Lpp/h;

    move-object v0, p0

    move-object p0, v2

    goto :goto_1

    :cond_2
    if-nez v0, :cond_3

    return-void

    :cond_3
    throw v1
.end method


# virtual methods
.method public final Q(Ljava/lang/StringBuilder;)V
    .locals 3

    const-string v0, "]"

    :try_start_0
    invoke-static {p0}, Lpp/b;->O(Lpp/b;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "SUCCESS, result=["

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v1, :cond_0

    const-string v1, "null"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v1

    goto :goto_2

    :cond_0
    if-ne v1, p0, :cond_1

    const-string v1, "this future"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "@"

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    const-string v1, "UNKNOWN, cause=["

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " thrown from get()]"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :catch_2
    const-string v0, "CANCELLED"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :goto_2
    const-string v2, "FAILURE, cause=["

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final cancel(Z)Z
    .locals 4

    iget-object v0, p0, Lpp/p;->F:Ljava/lang/Object;

    if-nez v0, :cond_2

    sget-boolean v1, Lpp/p;->K:Z

    if-eqz v1, :cond_0

    new-instance v1, Lpp/f;

    new-instance v2, Ljava/util/concurrent/CancellationException;

    const-string v3, "Future.cancel() was called."

    invoke-direct {v2, v3}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, p1, v2}, Lpp/f;-><init>(ZLjava/lang/RuntimeException;)V

    goto :goto_2

    :cond_0
    if-eqz p1, :cond_1

    sget-object p1, Lpp/f;->b:Lpp/f;

    :goto_0
    move-object v1, p1

    goto :goto_1

    :cond_1
    sget-object p1, Lpp/f;->c:Lpp/f;

    goto :goto_0

    :goto_1
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    sget-object p1, Lpp/p;->L:Lbi/g;

    invoke-virtual {p1, p0, v0, v1}, Lbi/g;->i0(Lpp/p;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {p0}, Lpp/b;->P(Lpp/b;)V

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final get()Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lpp/o;->c:Lpp/o;

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v1

    if-nez v1, :cond_6

    .line 2
    iget-object v1, p0, Lpp/p;->F:Ljava/lang/Object;

    if-eqz v1, :cond_0

    .line 3
    invoke-static {v1}, Lpp/b;->N(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v1, p0, Lpp/p;->H:Lpp/o;

    if-eq v1, v0, :cond_5

    new-instance v2, Lpp/o;

    .line 4
    invoke-direct {v2}, Lpp/o;-><init>()V

    :cond_1
    sget-object v3, Lpp/p;->L:Lbi/g;

    .line 5
    invoke-virtual {v3, v2, v1}, Lbi/g;->e0(Lpp/o;Lpp/o;)V

    .line 6
    invoke-virtual {v3, p0, v1, v2}, Lbi/g;->f0(Lpp/p;Lpp/o;Lpp/o;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 7
    :cond_2
    invoke-static {p0}, Ljava/util/concurrent/locks/LockSupport;->park(Ljava/lang/Object;)V

    .line 8
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_3

    .line 9
    iget-object v0, p0, Lpp/p;->F:Ljava/lang/Object;

    if-eqz v0, :cond_2

    .line 10
    invoke-static {v0}, Lpp/b;->N(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 11
    :cond_3
    invoke-virtual {p0, v2}, Lpp/p;->M(Lpp/o;)V

    new-instance v0, Ljava/lang/InterruptedException;

    .line 12
    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    throw v0

    .line 13
    :cond_4
    iget-object v1, p0, Lpp/p;->H:Lpp/o;

    if-ne v1, v0, :cond_1

    :cond_5
    iget-object v0, p0, Lpp/p;->F:Ljava/lang/Object;

    .line 14
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Lpp/b;->N(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 15
    :cond_6
    new-instance v0, Ljava/lang/InterruptedException;

    .line 16
    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    throw v0
.end method

.method public final get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v3, p3

    .line 17
    sget-object v4, Lpp/o;->c:Lpp/o;

    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v5

    .line 18
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v7

    if-nez v7, :cond_13

    .line 19
    iget-object v7, v0, Lpp/p;->F:Ljava/lang/Object;

    if-eqz v7, :cond_0

    .line 20
    invoke-static {v7}, Lpp/b;->N(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :cond_0
    const-wide/16 v7, 0x0

    cmp-long v9, v5, v7

    if-lez v9, :cond_1

    .line 21
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v9

    add-long/2addr v9, v5

    goto :goto_0

    :cond_1
    move-wide v9, v7

    :goto_0
    const-wide/16 v11, 0x3e8

    cmp-long v13, v5, v11

    if-ltz v13, :cond_8

    iget-object v13, v0, Lpp/p;->H:Lpp/o;

    if-eq v13, v4, :cond_7

    new-instance v14, Lpp/o;

    .line 22
    invoke-direct {v14}, Lpp/o;-><init>()V

    :goto_1
    sget-object v15, Lpp/p;->L:Lbi/g;

    .line 23
    invoke-virtual {v15, v14, v13}, Lbi/g;->e0(Lpp/o;Lpp/o;)V

    .line 24
    invoke-virtual {v15, v0, v13, v14}, Lbi/g;->f0(Lpp/p;Lpp/o;Lpp/o;)Z

    move-result v13

    if-eqz v13, :cond_5

    move-wide v15, v7

    :cond_2
    const-wide v7, 0x1dcd64ffffffffffL    # 3.98785104510193E-165

    .line 25
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    invoke-static {v0, v4, v5}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(Ljava/lang/Object;J)V

    .line 26
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v4

    if-nez v4, :cond_4

    .line 27
    iget-object v4, v0, Lpp/p;->F:Ljava/lang/Object;

    if-eqz v4, :cond_3

    .line 28
    invoke-static {v4}, Lpp/b;->N(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    .line 29
    :cond_3
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    sub-long v5, v9, v4

    cmp-long v4, v5, v11

    if-gez v4, :cond_2

    .line 30
    invoke-virtual {v0, v14}, Lpp/p;->M(Lpp/o;)V

    goto :goto_3

    .line 31
    :cond_4
    invoke-virtual {v0, v14}, Lpp/p;->M(Lpp/o;)V

    new-instance v1, Ljava/lang/InterruptedException;

    .line 32
    invoke-direct {v1}, Ljava/lang/InterruptedException;-><init>()V

    throw v1

    :cond_5
    move-wide v15, v7

    .line 33
    iget-object v13, v0, Lpp/p;->H:Lpp/o;

    if-ne v13, v4, :cond_6

    goto :goto_2

    :cond_6
    move-wide v7, v15

    goto :goto_1

    :cond_7
    :goto_2
    iget-object v1, v0, Lpp/p;->F:Ljava/lang/Object;

    .line 34
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Lpp/b;->N(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :cond_8
    move-wide v15, v7

    :goto_3
    cmp-long v4, v5, v15

    if-lez v4, :cond_b

    .line 35
    iget-object v4, v0, Lpp/p;->F:Ljava/lang/Object;

    if-eqz v4, :cond_9

    .line 36
    invoke-static {v4}, Lpp/b;->N(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    .line 37
    :cond_9
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v4

    if-nez v4, :cond_a

    .line 38
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    sub-long v5, v9, v4

    goto :goto_3

    .line 39
    :cond_a
    new-instance v1, Ljava/lang/InterruptedException;

    .line 40
    invoke-direct {v1}, Ljava/lang/InterruptedException;-><init>()V

    throw v1

    .line 41
    :cond_b
    invoke-virtual {v0}, Lpp/b;->toString()Ljava/lang/String;

    move-result-object v4

    .line 42
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    .line 43
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    add-int/lit8 v9, v9, 0x8

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v10

    new-instance v13, Ljava/lang/StringBuilder;

    add-int/2addr v9, v10

    invoke-direct {v13, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 44
    const-string v9, "Waited "

    const-string v10, " "

    invoke-static {v13, v9, v1, v2, v10}, Lb9/y;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 45
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    add-long v8, v5, v11

    cmp-long v2, v8, v15

    if-gez v2, :cond_11

    const-string v2, " (plus "

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    neg-long v5, v5

    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 46
    invoke-virtual {v3, v5, v6, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v8

    .line 47
    invoke-virtual {v3, v8, v9}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v2

    sub-long/2addr v5, v2

    cmp-long v2, v8, v15

    const/4 v3, 0x1

    if-eqz v2, :cond_c

    cmp-long v11, v5, v11

    if-lez v11, :cond_d

    :cond_c
    move v11, v3

    goto :goto_4

    :cond_d
    const/4 v11, 0x0

    :goto_4
    if-lez v2, :cond_f

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    .line 48
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v12

    add-int/2addr v12, v2

    add-int/2addr v12, v3

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    add-int/2addr v12, v2

    invoke-direct {v3, v12}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 49
    invoke-static {v3, v1, v8, v9, v10}, Lb9/y;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 50
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    if-eqz v11, :cond_e

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_e
    invoke-virtual {v1, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_f
    if-eqz v11, :cond_10

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    .line 51
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v3, v2

    new-instance v2, Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0xd

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " nanoseconds "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_10
    const-string v2, "delay)"

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 52
    :cond_11
    invoke-virtual {v0}, Lpp/b;->isDone()Z

    move-result v2

    if-eqz v2, :cond_12

    const-string v2, " but future completed as timeout expired"

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 53
    new-instance v2, Ljava/util/concurrent/TimeoutException;

    invoke-direct {v2, v1}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_12
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    .line 54
    new-instance v3, Ljava/util/concurrent/TimeoutException;

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    add-int/lit8 v2, v2, 0x5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    new-instance v6, Ljava/lang/StringBuilder;

    add-int/2addr v2, v5

    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, " for "

    .line 55
    invoke-static {v6, v1, v2, v4}, Lb9/y;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 56
    invoke-direct {v3, v1}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 57
    :cond_13
    new-instance v1, Ljava/lang/InterruptedException;

    .line 58
    invoke-direct {v1}, Ljava/lang/InterruptedException;-><init>()V

    throw v1
.end method

.method public final isCancelled()Z
    .locals 1

    iget-object v0, p0, Lpp/p;->F:Ljava/lang/Object;

    instance-of v0, v0, Lpp/f;

    return v0
.end method

.method public final isDone()Z
    .locals 1

    iget-object v0, p0, Lpp/p;->F:Ljava/lang/Object;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lpp/b;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "com.google.common.util.concurrent."

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpp/p;->F:Ljava/lang/Object;

    instance-of v1, v1, Lpp/f;

    const-string v2, "]"

    if-eqz v1, :cond_1

    const-string v1, "CANCELLED"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_1
    invoke-virtual {p0}, Lpp/b;->isDone()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, v0}, Lpp/b;->Q(Ljava/lang/StringBuilder;)V

    goto :goto_4

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    const-string v3, "PENDING"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :try_start_0
    iget-object v3, p0, Lpp/b;->M:Lcom/google/android/gms/tasks/Task;

    if-nez v3, :cond_3

    const-string v3, ""

    goto :goto_1

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_1
    const/4 v4, 0x0

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v5, :cond_7

    :cond_4
    move-object v3, v4

    goto :goto_3

    :catchall_0
    move-exception v3

    instance-of v4, v3, Ljava/lang/Error;

    if-eqz v4, :cond_6

    instance-of v4, v3, Ljava/lang/StackOverflowError;

    if-eqz v4, :cond_5

    goto :goto_2

    :cond_5
    check-cast v3, Ljava/lang/Error;

    throw v3

    :cond_6
    :goto_2
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Exception thrown from implementation: "

    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :cond_7
    :goto_3
    if-eqz v3, :cond_8

    const-string v4, ", info=["

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    invoke-virtual {p0}, Lpp/b;->isDone()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    invoke-virtual {v0, v1, v3}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Lpp/b;->Q(Ljava/lang/StringBuilder;)V

    :cond_9
    :goto_4
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
