.class public final Lb5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lml/c;


# instance fields
.field public w:Z

.field public x:Z

.field public y:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 8
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lb5/d;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(ZZLandroidx/lifecycle/k1;)V
    .locals 1

    const-string v0, "savedStateHandle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lb5/d;->w:Z

    .line 3
    iput-boolean p2, p0, Lb5/d;->x:Z

    .line 4
    iput-object p3, p0, Lb5/d;->y:Ljava/lang/Object;

    .line 5
    const-string p2, "KEY_HAS_AUTOMATICALLY_LAUNCHED_CARD_SCAN"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p3, p1, p2}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lb5/d;->w:Z

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lb5/d;->w:Z

    iput-boolean v0, p0, Lb5/d;->x:Z

    iget-object v0, p0, Lb5/d;->y:Ljava/lang/Object;

    check-cast v0, Lbc/i;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    :try_start_1
    iget-object v2, v0, Lbc/i;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Runnable;

    iget-object v3, v0, Lbc/i;->z:Ljava/lang/Object;

    check-cast v3, Lbc/w;

    iget-object v0, v0, Lbc/i;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Runnable;

    if-nez v2, :cond_1

    invoke-virtual {v3}, Lbc/w;->cancel()V

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :goto_0
    monitor-enter p0

    :try_start_2
    iput-boolean v1, p0, Lb5/d;->x:Z

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    throw v0

    :catchall_2
    move-exception v0

    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw v0

    :cond_2
    :goto_1
    monitor-enter p0

    :try_start_4
    iput-boolean v1, p0, Lb5/d;->x:Z

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0

    return-void

    :catchall_3
    move-exception v0

    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    throw v0

    :goto_2
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v0
.end method

.method public b()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb5/d;->w:Z

    iget-object v0, p0, Lb5/d;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    invoke-static {v0}, Ltl/l;->d(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lml/d;

    invoke-interface {v1}, Lml/d;->onStart()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public h(Lml/d;)V
    .locals 1

    iget-object v0, p0, Lb5/d;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-boolean v0, p0, Lb5/d;->x:Z

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lml/d;->onDestroy()V

    return-void

    :cond_0
    iget-boolean v0, p0, Lb5/d;->w:Z

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lml/d;->onStart()V

    return-void

    :cond_1
    invoke-interface {p1}, Lml/d;->onStop()V

    return-void
.end method

.method public k(Lml/d;)V
    .locals 1

    iget-object v0, p0, Lb5/d;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method
