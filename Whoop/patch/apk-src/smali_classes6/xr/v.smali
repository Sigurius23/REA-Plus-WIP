.class public final Lxr/v;
.super Lxr/u;
.source "SourceFile"


# instance fields
.field public final synthetic x:Lcq/i;

.field public final synthetic y:Lsr/g;

.field public final synthetic z:Lxr/b;


# direct methods
.method public constructor <init>(Lxr/b;Lcq/i;Lcq/i;Lsr/g;)V
    .locals 0

    iput-object p3, p0, Lxr/v;->x:Lcq/i;

    iput-object p4, p0, Lxr/v;->y:Lsr/g;

    iput-object p1, p0, Lxr/v;->z:Lxr/b;

    invoke-direct {p0, p2}, Lxr/u;-><init>(Lcq/i;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 5

    iget-object v0, p0, Lxr/v;->z:Lxr/b;

    iget-object v0, v0, Lxr/b;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lxr/v;->z:Lxr/b;

    iget-object v2, p0, Lxr/v;->x:Lcq/i;

    iget-object v3, v1, Lxr/b;->e:Ljava/util/HashSet;

    invoke-virtual {v3, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v3, v2, Lcq/i;->a:Lcq/u;

    new-instance v4, Lt9/u;

    invoke-direct {v4, v1, v2}, Lt9/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v4}, Lcq/u;->addOnCompleteListener(Lcq/d;)Lcom/google/android/gms/tasks/Task;

    iget-object v1, p0, Lxr/v;->z:Lxr/b;

    iget-object v1, v1, Lxr/b;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lxr/v;->z:Lxr/b;

    iget-object v1, v1, Lxr/b;->b:Lxr/t;

    const-string v2, "Already connected to the service."

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lxr/t;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lxr/v;->z:Lxr/b;

    iget-object v2, p0, Lxr/v;->y:Lsr/g;

    invoke-static {v1, v2}, Lxr/b;->b(Lxr/b;Lsr/g;)V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
