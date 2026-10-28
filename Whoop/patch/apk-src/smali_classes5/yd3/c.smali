.class public final Lyd3/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lyd3/d;

.field public final b:Ljava/lang/String;

.field public c:Z

.field public d:Lyd3/a;

.field public final e:Ljava/util/ArrayList;

.field public f:Z


# direct methods
.method public constructor <init>(Lyd3/d;Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyd3/c;->a:Lyd3/d;

    iput-object p2, p0, Lyd3/c;->b:Ljava/lang/String;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lyd3/c;->e:Ljava/util/ArrayList;

    return-void
.end method

.method public static c(Lyd3/c;Ljava/lang/String;JLc93/a;I)V
    .locals 1

    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_0

    const-wide/16 p2, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    const/4 p5, 0x1

    goto :goto_0

    :cond_1
    const/4 p5, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyd3/b;

    invoke-direct {v0, p4, p1, p5}, Lyd3/b;-><init>(Lc93/a;Ljava/lang/String;Z)V

    invoke-virtual {p0, v0, p2, p3}, Lyd3/c;->d(Lyd3/a;J)V

    return-void
.end method

.method public static synthetic e(Lyd3/c;Lyd3/a;)V
    .locals 2

    const-wide/16 v0, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lyd3/c;->d(Lyd3/a;J)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lyd3/c;->a:Lyd3/d;

    sget-object v1, Lwd3/h;->a:Ljava/util/TimeZone;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lyd3/c;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lyd3/c;->a:Lyd3/d;

    invoke-virtual {v1, p0}, Lyd3/d;->c(Lyd3/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public final b()Z
    .locals 6

    iget-object v0, p0, Lyd3/c;->d:Lyd3/a;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Lyd3/a;->b:Z

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lyd3/c;->f:Z

    :cond_0
    iget-object v0, p0, Lyd3/c;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v1

    const/4 v3, 0x0

    :goto_0
    const/4 v4, -0x1

    if-ge v4, v2, :cond_3

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lyd3/a;

    iget-boolean v4, v4, Lyd3/a;->b:Z

    if-eqz v4, :cond_2

    iget-object v3, p0, Lyd3/c;->a:Lyd3/d;

    iget-object v3, v3, Lyd3/d;->b:Ljava/util/logging/Logger;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lyd3/a;

    sget-object v5, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v3, v5}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v5

    if-eqz v5, :cond_1

    const-string v5, "canceled"

    invoke-static {v3, v4, p0, v5}, Ls93/h;->b(Ljava/util/logging/Logger;Lyd3/a;Lyd3/c;Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move v3, v1

    :cond_2
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_3
    return v3
.end method

.method public final d(Lyd3/a;J)V
    .locals 2

    const-string v0, "task"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyd3/c;->a:Lyd3/d;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lyd3/c;->c:Z

    if-eqz v1, :cond_3

    iget-boolean p2, p1, Lyd3/a;->b:Z

    if-eqz p2, :cond_1

    iget-object p2, p0, Lyd3/c;->a:Lyd3/d;

    iget-object p2, p2, Lyd3/d;->b:Ljava/util/logging/Logger;

    sget-object p3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {p2, p3}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result p3

    if-eqz p3, :cond_0

    const-string p3, "schedule canceled (queue is shutdown)"

    invoke-static {p2, p1, p0, p3}, Ls93/h;->b(Ljava/util/logging/Logger;Lyd3/a;Lyd3/c;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :cond_1
    :try_start_1
    iget-object p2, p0, Lyd3/c;->a:Lyd3/d;

    iget-object p2, p2, Lyd3/d;->b:Ljava/util/logging/Logger;

    sget-object p3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {p2, p3}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result p3

    if-eqz p3, :cond_2

    const-string p3, "schedule failed (queue is shutdown)"

    invoke-static {p2, p1, p0, p3}, Ls93/h;->b(Ljava/util/logging/Logger;Lyd3/a;Lyd3/c;Ljava/lang/String;)V

    :cond_2
    new-instance p1, Ljava/util/concurrent/RejectedExecutionException;

    invoke-direct {p1}, Ljava/util/concurrent/RejectedExecutionException;-><init>()V

    throw p1

    :cond_3
    const/4 v1, 0x0

    invoke-virtual {p0, p1, p2, p3, v1}, Lyd3/c;->f(Lyd3/a;JZ)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lyd3/c;->a:Lyd3/d;

    invoke-virtual {p1, p0}, Lyd3/d;->c(Lyd3/c;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_4
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public final f(Lyd3/a;JZ)Z
    .locals 11

    iget-object v0, p0, Lyd3/c;->a:Lyd3/d;

    iget-object v0, v0, Lyd3/d;->b:Ljava/util/logging/Logger;

    const-string v1, "task"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p1, Lyd3/a;->c:Lyd3/c;

    if-ne v1, p0, :cond_0

    goto :goto_0

    :cond_0
    if-nez v1, :cond_9

    iput-object p0, p1, Lyd3/a;->c:Lyd3/c;

    :goto_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    add-long v3, v1, p2

    iget-object v5, p0, Lyd3/c;->e:Ljava/util/ArrayList;

    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v6

    const/4 v7, 0x0

    const/4 v8, -0x1

    if-eq v6, v8, :cond_2

    iget-wide v9, p1, Lyd3/a;->d:J

    cmp-long v9, v9, v3

    if-gtz v9, :cond_1

    sget-object p2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v0, p2}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result p2

    if-eqz p2, :cond_8

    const-string p2, "already scheduled"

    invoke-static {v0, p1, p0, p2}, Ls93/h;->b(Ljava/util/logging/Logger;Lyd3/a;Lyd3/c;Ljava/lang/String;)V

    return v7

    :cond_1
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_2
    iput-wide v3, p1, Lyd3/a;->d:J

    sget-object v6, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v0, v6}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v6

    if-eqz v6, :cond_4

    if-eqz p4, :cond_3

    sub-long/2addr v3, v1

    invoke-static {v3, v4}, Ls93/h;->o(J)Ljava/lang/String;

    move-result-object p4

    const-string v3, "run again after "

    invoke-virtual {v3, p4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    goto :goto_1

    :cond_3
    sub-long/2addr v3, v1

    invoke-static {v3, v4}, Ls93/h;->o(J)Ljava/lang/String;

    move-result-object p4

    const-string v3, "scheduled after "

    invoke-virtual {v3, p4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    :goto_1
    invoke-static {v0, p1, p0, p4}, Ls93/h;->b(Ljava/util/logging/Logger;Lyd3/a;Lyd3/c;Ljava/lang/String;)V

    :cond_4
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p4

    move v0, v7

    :goto_2
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lyd3/a;

    iget-wide v3, v3, Lyd3/a;->d:J

    sub-long/2addr v3, v1

    cmp-long v3, v3, p2

    if-lez v3, :cond_5

    goto :goto_3

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_6
    move v0, v8

    :goto_3
    if-ne v0, v8, :cond_7

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    :cond_7
    invoke-virtual {v5, v0, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    if-nez v0, :cond_8

    const/4 p1, 0x1

    return p1

    :cond_8
    return v7

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "task is in multiple queues"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final g()V
    .locals 2

    iget-object v0, p0, Lyd3/c;->a:Lyd3/d;

    sget-object v1, Lwd3/h;->a:Ljava/util/TimeZone;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lyd3/c;->c:Z

    invoke-virtual {p0}, Lyd3/c;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lyd3/c;->a:Lyd3/d;

    invoke-virtual {v1, p0}, Lyd3/d;->c(Lyd3/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lyd3/c;->b:Ljava/lang/String;

    return-object v0
.end method
