.class public final Lb9/f1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lb9/e1;

.field public final b:Lb9/d1;

.field public c:I

.field public d:Ljava/lang/Object;

.field public final e:Landroid/os/Looper;

.field public f:Z


# direct methods
.method public constructor <init>(Lb9/d1;Lb9/e1;Lu8/o0;ILandroid/os/Looper;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb9/f1;->b:Lb9/d1;

    iput-object p2, p0, Lb9/f1;->a:Lb9/e1;

    iput-object p5, p0, Lb9/f1;->e:Landroid/os/Looper;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Z)V
    .locals 0

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final b()V
    .locals 3

    iget-boolean v0, p0, Lb9/f1;->f:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lva3/g;->i(Z)V

    iput-boolean v1, p0, Lb9/f1;->f:Z

    iget-object v0, p0, Lb9/f1;->b:Lb9/d1;

    check-cast v0, Lb9/l0;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, v0, Lb9/l0;->d0:Z

    if-nez v1, :cond_1

    iget-object v1, v0, Lb9/l0;->J:Landroid/os/Looper;

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lb9/l0;->H:Lx8/r;

    const/16 v2, 0xe

    invoke-virtual {v1, v2, p0}, Lx8/r;->a(ILjava/lang/Object;)Lx8/q;

    move-result-object v1

    invoke-virtual {v1}, Lx8/q;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    :try_start_1
    const-string v1, "ExoPlayerImplInternal"

    const-string v2, "Ignoring messages sent after release."

    invoke-static {v1, v2}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lb9/f1;->a(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method
