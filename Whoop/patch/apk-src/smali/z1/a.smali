.class public final Lz1/a;
.super Lz1/b;
.source "SourceFile"


# virtual methods
.method public final C(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lz1/b;
    .locals 2

    new-instance v0, Lja3/l;

    const/4 v1, 0x4

    invoke-direct {v0, v1, p1, p2}, Lja3/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Lb11/b;

    const/16 p2, 0x16

    invoke-direct {p1, v0, p2}, Lb11/b;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-static {p1}, Lz1/l;->f(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz1/f;

    check-cast p1, Lz1/b;

    return-object p1
.end method

.method public final c()V
    .locals 2

    sget-object v0, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lz1/f;->o()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final k()V
    .locals 1

    invoke-static {}, Lz1/t;->a()V

    const/4 v0, 0x0

    throw v0
.end method

.method public final l()V
    .locals 1

    invoke-static {}, Lz1/t;->a()V

    const/4 v0, 0x0

    throw v0
.end method

.method public final m()V
    .locals 0

    invoke-static {}, Lz1/l;->a()V

    return-void
.end method

.method public final u(Lkotlin/jvm/functions/Function1;)Lz1/f;
    .locals 2

    new-instance v0, Ldc3/s;

    const/16 v1, 0x10

    invoke-direct {v0, p1, v1}, Ldc3/s;-><init>(Ljava/lang/Object;I)V

    new-instance p1, Lb11/b;

    const/16 v1, 0x16

    invoke-direct {p1, v0, v1}, Lb11/b;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-static {p1}, Lz1/l;->f(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz1/f;

    check-cast p1, Lz1/e;

    return-object p1
.end method

.method public final w()Lz1/q;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
