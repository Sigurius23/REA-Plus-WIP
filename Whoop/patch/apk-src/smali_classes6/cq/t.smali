.class public final Lcq/t;
.super Lto/h;
.source "SourceFile"


# instance fields
.field public final x:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lto/i;)V
    .locals 1

    invoke-direct {p0, p1}, Lto/h;-><init>(Lto/i;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcq/t;->x:Ljava/util/ArrayList;

    const-string v0, "TaskOnStopCallback"

    invoke-interface {p1, v0, p0}, Lto/i;->o(Ljava/lang/String;Lto/h;)V

    return-void
.end method

.method public static j(Landroid/app/Activity;)Lcq/t;
    .locals 2

    invoke-static {p0}, Lto/h;->b(Landroid/app/Activity;)Lto/i;

    move-result-object p0

    monitor-enter p0

    :try_start_0
    const-string v0, "TaskOnStopCallback"

    const-class v1, Lcq/t;

    invoke-interface {p0, v1, v0}, Lto/i;->d(Ljava/lang/Class;Ljava/lang/String;)Lto/h;

    move-result-object v0

    check-cast v0, Lcq/t;

    if-nez v0, :cond_0

    new-instance v0, Lcq/t;

    invoke-direct {v0, p0}, Lcq/t;-><init>(Lto/i;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method public final i()V
    .locals 3

    iget-object v0, p0, Lcq/t;->x:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcq/p;

    if-eqz v2, :cond_0

    invoke-interface {v2}, Lcq/p;->b()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final k(Lcq/p;)V
    .locals 2

    iget-object v0, p0, Lcq/t;->x:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
