.class public final Lxr/a;
.super Lxr/u;
.source "SourceFile"


# instance fields
.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lxr/a;->x:I

    iput-object p1, p0, Lxr/a;->y:Ljava/lang/Object;

    invoke-direct {p0}, Lxr/u;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 5

    iget v0, p0, Lxr/a;->x:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lxr/a;->y:Ljava/lang/Object;

    check-cast v0, Lxr/b;

    iget-object v0, v0, Lxr/b;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lxr/a;->y:Ljava/lang/Object;

    check-cast v1, Lxr/b;

    iget-object v1, v1, Lxr/b;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_0

    iget-object v1, p0, Lxr/a;->y:Ljava/lang/Object;

    check-cast v1, Lxr/b;

    iget-object v1, v1, Lxr/b;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lxr/a;->y:Ljava/lang/Object;

    check-cast v1, Lxr/b;

    iget-object v1, v1, Lxr/b;->b:Lxr/t;

    const-string v3, "Leaving the connection open for other ongoing calls."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v3, v2}, Lxr/t;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lxr/a;->y:Ljava/lang/Object;

    check-cast v1, Lxr/b;

    iget-object v3, v1, Lxr/b;->n:Lxr/r;

    if-eqz v3, :cond_1

    iget-object v1, v1, Lxr/b;->b:Lxr/t;

    const-string v3, "Unbind from service."

    new-array v4, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v3, v4}, Lxr/t;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lxr/a;->y:Ljava/lang/Object;

    check-cast v1, Lxr/b;

    iget-object v3, v1, Lxr/b;->a:Landroid/content/Context;

    iget-object v1, v1, Lxr/b;->m:Landroidx/room/b0;

    invoke-virtual {v3, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    iget-object v1, p0, Lxr/a;->y:Ljava/lang/Object;

    check-cast v1, Lxr/b;

    iput-boolean v2, v1, Lxr/b;->g:Z

    const/4 v2, 0x0

    iput-object v2, v1, Lxr/b;->n:Lxr/r;

    iput-object v2, v1, Lxr/b;->m:Landroidx/room/b0;

    :cond_1
    iget-object v1, p0, Lxr/a;->y:Ljava/lang/Object;

    check-cast v1, Lxr/b;

    invoke-virtual {v1}, Lxr/b;->d()V

    monitor-exit v0

    :goto_0
    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :pswitch_0
    iget-object v0, p0, Lxr/a;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/room/b0;

    iget-object v0, v0, Landroidx/room/b0;->x:Ljava/lang/Object;

    check-cast v0, Lxr/b;

    iget-object v1, v0, Lxr/b;->b:Lxr/t;

    const-string v2, "unlinkToDeath"

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v4}, Lxr/t;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, v0, Lxr/b;->n:Lxr/r;

    check-cast v1, Lxr/p;

    iget-object v1, v1, Lxr/p;->f:Landroid/os/IBinder;

    iget-object v2, v0, Lxr/b;->k:Lvr/f;

    invoke-interface {v1, v2, v3}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    const/4 v1, 0x0

    iput-object v1, v0, Lxr/b;->n:Lxr/r;

    iput-boolean v3, v0, Lxr/b;->g:Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
