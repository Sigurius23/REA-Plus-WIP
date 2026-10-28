.class public final Lvr/g;
.super Lvr/e;
.source "SourceFile"


# instance fields
.field public final synthetic x:Lcq/i;

.field public final synthetic y:Lur/e;

.field public final synthetic z:Lvr/i;


# direct methods
.method public constructor <init>(Lvr/i;Lcq/i;Lcq/i;Lur/e;)V
    .locals 0

    iput-object p3, p0, Lvr/g;->x:Lcq/i;

    iput-object p4, p0, Lvr/g;->y:Lur/e;

    iput-object p1, p0, Lvr/g;->z:Lvr/i;

    invoke-direct {p0, p2}, Lvr/e;-><init>(Lcq/i;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Lvr/g;->z:Lvr/i;

    iget-object v0, v0, Lvr/i;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lvr/g;->z:Lvr/i;

    iget-object v2, p0, Lvr/g;->x:Lcq/i;

    iget-object v3, v1, Lvr/i;->e:Ljava/util/HashSet;

    invoke-virtual {v3, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v3, v2, Lcq/i;->a:Lcq/u;

    new-instance v4, Lq3/i;

    invoke-direct {v4, v1, v2}, Lq3/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v4}, Lcq/u;->addOnCompleteListener(Lcq/d;)Lcom/google/android/gms/tasks/Task;

    iget-object v1, p0, Lvr/g;->z:Lvr/i;

    iget-object v1, v1, Lvr/i;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lvr/g;->z:Lvr/i;

    iget-object v1, v1, Lvr/i;->b:Ldb/j0;

    const-string v2, "Already connected to the service."

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Ldb/j0;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lvr/g;->z:Lvr/i;

    iget-object v2, p0, Lvr/g;->y:Lur/e;

    invoke-static {v1, v2}, Lvr/i;->b(Lvr/i;Lur/e;)V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
