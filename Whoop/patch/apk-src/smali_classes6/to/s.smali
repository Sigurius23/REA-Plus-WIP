.class public final Lto/s;
.super Lto/r0;
.source "SourceFile"


# instance fields
.field public final F:La0/h;

.field public final G:Lto/f;


# direct methods
.method public constructor <init>(Lto/i;Lto/f;Lcom/google/android/gms/common/GoogleApiAvailability;)V
    .locals 1

    invoke-direct {p0, p1, p3}, Lto/r0;-><init>(Lto/i;Lcom/google/android/gms/common/GoogleApiAvailability;)V

    new-instance p3, La0/h;

    const/4 v0, 0x0

    invoke-direct {p3, v0}, La0/h;-><init>(I)V

    iput-object p3, p0, Lto/s;->F:La0/h;

    iput-object p2, p0, Lto/s;->G:Lto/f;

    const-string p2, "ConnectionlessLifecycleHelper"

    invoke-interface {p1, p2, p0}, Lto/i;->o(Ljava/lang/String;Lto/h;)V

    return-void
.end method

.method public static m(Landroid/app/Activity;Lto/f;Lto/a;)V
    .locals 2

    invoke-static {p0}, Lto/h;->b(Landroid/app/Activity;)Lto/i;

    move-result-object p0

    const-string v0, "ConnectionlessLifecycleHelper"

    const-class v1, Lto/s;

    invoke-interface {p0, v1, v0}, Lto/i;->d(Ljava/lang/Class;Ljava/lang/String;)Lto/h;

    move-result-object v0

    check-cast v0, Lto/s;

    if-nez v0, :cond_0

    new-instance v0, Lto/s;

    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailability;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailability;

    move-result-object v1

    invoke-direct {v0, p0, p1, v1}, Lto/s;-><init>(Lto/i;Lto/f;Lcom/google/android/gms/common/GoogleApiAvailability;)V

    :cond_0
    iget-object p0, v0, Lto/s;->F:La0/h;

    invoke-virtual {p0, p2}, La0/h;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1, v0}, Lto/f;->f(Lto/s;)V

    return-void
.end method


# virtual methods
.method public final f()V
    .locals 1

    iget-object v0, p0, Lto/s;->F:La0/h;

    invoke-virtual {v0}, La0/h;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lto/s;->G:Lto/f;

    invoke-virtual {v0, p0}, Lto/f;->f(Lto/s;)V

    :cond_0
    return-void
.end method

.method public final h()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lto/r0;->x:Z

    iget-object v0, p0, Lto/s;->F:La0/h;

    invoke-virtual {v0}, La0/h;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lto/s;->G:Lto/f;

    invoke-virtual {v0, p0}, Lto/f;->f(Lto/s;)V

    :cond_0
    return-void
.end method

.method public final i()V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Lto/r0;->x:Z

    iget-object v0, p0, Lto/s;->G:Lto/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lto/f;->R:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, v0, Lto/f;->K:Lto/s;

    if-ne v2, p0, :cond_0

    const/4 v2, 0x0

    iput-object v2, v0, Lto/f;->K:Lto/s;

    iget-object v0, v0, Lto/f;->L:La0/h;

    invoke-virtual {v0}, La0/h;->clear()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final j(Lcom/google/android/gms/common/a;I)V
    .locals 1

    iget-object v0, p0, Lto/s;->G:Lto/f;

    invoke-virtual {v0, p1, p2}, Lto/f;->i(Lcom/google/android/gms/common/a;I)V

    return-void
.end method

.method public final k()V
    .locals 2

    iget-object v0, p0, Lto/s;->G:Lto/f;

    iget-object v0, v0, Lto/f;->N:Ljp/d;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final n()La0/h;
    .locals 1

    iget-object v0, p0, Lto/s;->F:La0/h;

    return-object v0
.end method
