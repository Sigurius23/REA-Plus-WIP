.class public abstract Lod1/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lod1/t$b;,
        Lod1/t$c;,
        Lod1/t$h;,
        Lod1/t$i;,
        Lod1/t$g;,
        Lod1/t$f;,
        Lod1/t$d;,
        Lod1/t$a;,
        Lod1/t$e;
    }
.end annotation


# instance fields
.field private final a:Ltr2/n;

.field private final b:Ljava/lang/String;

.field private volatile c:Lod1/t$h;

.field private d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lod1/t$i;",
            "Lod1/t$h;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lod1/t$c;",
            "Lod1/t$b;",
            ">;"
        }
    .end annotation
.end field

.field private f:Z

.field private g:I

.field private h:Lod1/t$h;

.field private i:Z

.field private j:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "StateMachine"

    invoke-static {v0}, Ltr2/n;->d(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    iput-object v0, p0, Lod1/t;->a:Ltr2/n;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lod1/t;->d:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lod1/t;->e:Ljava/util/Map;

    iput-object p1, p0, Lod1/t;->b:Ljava/lang/String;

    invoke-static {}, Lx82/d;->a()Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lod1/t;->j:Landroid/os/Handler;

    return-void
.end method

.method public static synthetic a(Lod1/t;I)V
    .locals 0

    invoke-direct {p0, p1}, Lod1/t;->k(I)V

    return-void
.end method

.method private e()V
    .locals 2

    iget-object v0, p0, Lod1/t;->j:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method private f()V
    .locals 5

    iget v0, p0, Lod1/t;->g:I

    iget-boolean v1, p0, Lod1/t;->i:Z

    if-eqz v1, :cond_0

    const/16 v1, 0xfa

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lod1/t;->c:Lod1/t$h;

    invoke-static {v1}, Lod1/t$h;->c(Lod1/t$h;)I

    move-result v1

    mul-int/lit16 v1, v1, 0x3e8

    :goto_0
    invoke-direct {p0}, Lod1/t;->e()V

    iget-object v2, p0, Lod1/t;->j:Landroid/os/Handler;

    new-instance v3, Lb9/g0;

    const/4 v4, 0x5

    invoke-direct {v3, p0, v0, v4}, Lb9/g0;-><init>(Ljava/lang/Object;II)V

    int-to-long v0, v1

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private synthetic k(I)V
    .locals 1

    iget v0, p0, Lod1/t;->g:I

    if-ne v0, p1, :cond_0

    invoke-virtual {p0}, Lod1/t;->n()V

    :cond_0
    return-void
.end method

.method private p(Lod1/t$b;)V
    .locals 7

    invoke-static {p1}, Lod1/t$b;->b(Lod1/t$b;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lod1/t$g;->WILDCARD:Lod1/t$g;

    const-string v4, ") which is not among the states configured for the state machine."

    const-string v5, "\".  Event "

    const-string v6, "Invalid event configured for state machine \""

    if-eq v2, v3, :cond_1

    iget-object v2, p0, Lod1/t;->d:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lod1/t;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " has a transition referencing a \"from\" state ("

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_1
    iget-object v2, p0, Lod1/t;->d:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lod1/t;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " has a transition referencing a \"to\" state ("

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    return-void
.end method


# virtual methods
.method public declared-synchronized b(Lod1/t$b;)V
    .locals 3

    const-string v0, "multiple events with key "

    monitor-enter p0

    :try_start_0
    iget-boolean v1, p0, Lod1/t;->f:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lod1/t;->e:Ljava/util/Map;

    invoke-static {p1}, Lod1/t$b;->a(Lod1/t$b;)Lod1/t$c;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v0, p0, Lod1/t;->e:Ljava/util/Map;

    invoke-static {p1}, Lod1/t$b;->a(Lod1/t$b;)Lod1/t$c;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lod1/t$b;->a(Lod1/t$b;)Lod1/t$c;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "can\'t add event after StateMachine has been built"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized c(Lod1/t$h;)V
    .locals 3

    const-string v0, "multiple states with key "

    monitor-enter p0

    :try_start_0
    iget-boolean v1, p0, Lod1/t;->f:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Lod1/t;->d:Ljava/util/Map;

    invoke-static {p1}, Lod1/t$h;->b(Lod1/t$h;)Lod1/t$i;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v0, p0, Lod1/t;->d:Ljava/util/Map;

    invoke-static {p1}, Lod1/t$h;->b(Lod1/t$h;)Lod1/t$i;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lod1/t;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iput-object p1, p0, Lod1/t;->h:Lod1/t$h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lod1/t$h;->b(Lod1/t$h;)Lod1/t$i;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "can\'t add state after StateMachine has been built"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized d()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lod1/t;->f:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lod1/t;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lod1/t;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lod1/t;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lod1/t$b;

    invoke-direct {p0, v1}, Lod1/t;->p(Lod1/t$b;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lod1/t;->h()Lod1/t$h;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lod1/t;->o(Lod1/t$h;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lod1/t;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "StateMachine cannot be built with no events"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "StateMachine cannot be built with no states"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "can\'t build StateMachine after it has previously been built"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized g()Lod1/t$h;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lod1/t;->c:Lod1/t$h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized h()Lod1/t$h;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lod1/t;->h:Lod1/t$h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized i()Lod1/t$h;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lod1/t;->d:Ljava/util/Map;

    sget-object v1, Lod1/t$g;->TIMEOUT:Lod1/t$g;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lod1/t$h;

    if-nez v0, :cond_0

    iget-object v0, p0, Lod1/t;->h:Lod1/t$h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized j(Lod1/t$c;Ljava/lang/Object;)Z
    .locals 5

    const-string v0, "No transition found from "

    const-string v1, "State changed from "

    const-string v2, "state machine "

    monitor-enter p0

    :try_start_0
    const-string v3, "EventKey provided to handleEvent must be non-null"

    invoke-static {p1, v3}, Lod1/t$f;->b(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v3, p0, Lod1/t;->f:Z

    if-eqz v3, :cond_3

    iget-object v3, p0, Lod1/t;->e:Ljava/util/Map;

    invoke-interface {v3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lod1/t$b;

    if-eqz v3, :cond_2

    iget-object v2, p0, Lod1/t;->c:Lod1/t$h;

    invoke-static {v2}, Lod1/t$h;->b(Lod1/t$h;)Lod1/t$i;

    move-result-object v2

    invoke-virtual {v3, v2}, Lod1/t$b;->c(Lod1/t$i;)Lod1/t$i;

    move-result-object v2

    if-nez v2, :cond_0

    sget-object v2, Lod1/t$g;->WILDCARD:Lod1/t$g;

    invoke-virtual {v3, v2}, Lod1/t$b;->c(Lod1/t$i;)Lod1/t$i;

    move-result-object v2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_1

    :cond_0
    :goto_0
    const/4 v3, 0x0

    if-eqz v2, :cond_1

    iget-object v0, p0, Lod1/t;->d:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lod1/t$h;

    iget-object v2, p0, Lod1/t;->a:Ltr2/n;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lod1/t;->g()Lod1/t$h;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " to "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " with key "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {v2, p1, v1}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p0, v0, p2}, Lod1/t;->o(Lod1/t$h;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :cond_1
    :try_start_1
    iget-object p2, p0, Lod1/t;->a:Ltr2/n;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lod1/t;->g()Lod1/t$h;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " with key "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v3, [Lqr2/a$a;

    invoke-interface {p2, p1, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v3

    :cond_2
    :try_start_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lod1/t;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " does not handle events with key "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "state machine must be built before it can handle events"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_1
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public declared-synchronized l(Lod1/t$i;)Lod1/t$h;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lod1/t;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lod1/t$h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public m(Lod1/t$i;Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public n()V
    .locals 3

    iget-object v0, p0, Lod1/t;->a:Ltr2/n;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, ".doTimeoutCheck State "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lod1/t;->c:Lod1/t$h;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " timed out"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p0}, Lod1/t;->i()Lod1/t$h;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lod1/t;->o(Lod1/t$h;Ljava/lang/Object;)V

    return-void
.end method

.method public declared-synchronized o(Lod1/t$h;Ljava/lang/Object;)V
    .locals 2

    const-string v0, "Transitioning from "

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lod1/t;->e()V

    iget-object v1, p0, Lod1/t;->c:Lod1/t$h;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lod1/t;->c:Lod1/t$h;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget v1, p0, Lod1/t;->g:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lod1/t;->g:I

    iput-object p1, p0, Lod1/t;->c:Lod1/t$h;

    iget-object p1, p0, Lod1/t;->c:Lod1/t$h;

    invoke-virtual {p1}, Lod1/t$h;->d()Lod1/t$i;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lod1/t;->m(Lod1/t$i;Ljava/lang/Object;)V

    iget-object p1, p0, Lod1/t;->c:Lod1/t$h;

    invoke-static {p1}, Lod1/t$h;->c(Lod1/t$h;)I

    move-result p1

    if-lez p1, :cond_1

    invoke-direct {p0}, Lod1/t;->f()V

    :cond_1
    iget-object p1, p0, Lod1/t;->c:Lod1/t$h;

    invoke-static {p1}, Lod1/t$h;->a(Lod1/t$h;)Lod1/t$a;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lod1/t;->c:Lod1/t$h;

    invoke-static {p1}, Lod1/t$h;->a(Lod1/t$h;)Lod1/t$a;

    move-result-object p1

    invoke-interface {p1, p2}, Lod1/t$a;->a(Ljava/lang/Object;)Lod1/t$e;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p2, p0, Lod1/t;->a:Ltr2/n;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lod1/t;->c:Lod1/t$h;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " to "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lod1/t$e;->b(Lod1/t$e;)Lod1/t$h;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p2, v0, v1}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-static {p1}, Lod1/t$e;->b(Lod1/t$e;)Lod1/t$h;

    move-result-object p2

    invoke-static {p1}, Lod1/t$e;->a(Lod1/t$e;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Lod1/t;->o(Lod1/t$h;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
