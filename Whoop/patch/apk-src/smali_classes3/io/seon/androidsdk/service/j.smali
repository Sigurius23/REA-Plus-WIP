.class public final Lio/seon/androidsdk/service/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lio/seon/androidsdk/service/j;->w:I

    iput-object p1, p0, Lio/seon/androidsdk/service/j;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lio/seon/androidsdk/service/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/seon/androidsdk/service/j;->x:Ljava/lang/Object;

    check-cast v0, Lp8/a;

    iget-object v1, v0, Lp8/a;->z:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v2, v0, Lp8/a;->E:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    const/16 v2, 0xa

    const/4 v4, 0x0

    :try_start_0
    invoke-static {v2}, Landroid/os/Process;->setThreadPriority(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v2, v0, Lp8/a;->G:Lro/d;

    invoke-virtual {v2}, Lro/d;->d()Ljava/lang/Object;

    move-result-object v4
    :try_end_1
    .catch Landroidx/core/os/OperationCanceledException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v2

    :try_start_2
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v5

    if-eqz v5, :cond_0

    :goto_0
    invoke-static {}, Landroid/os/Binder;->flushPendingCommands()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v0, v4}, Lp8/a;->a(Ljava/lang/Object;)V

    return-object v4

    :catchall_0
    move-exception v2

    goto :goto_1

    :cond_0
    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_1
    :try_start_4
    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception v1

    invoke-virtual {v0, v4}, Lp8/a;->a(Ljava/lang/Object;)V

    throw v1

    :pswitch_0
    iget-object v0, p0, Lio/seon/androidsdk/service/j;->x:Ljava/lang/Object;

    check-cast v0, Llu/c;

    monitor-enter v0

    :try_start_5
    iget-object v1, p0, Lio/seon/androidsdk/service/j;->x:Ljava/lang/Object;

    check-cast v1, Llu/c;

    iget-object v2, v1, Llu/c;->I:Ljava/io/BufferedWriter;

    if-nez v2, :cond_1

    monitor-exit v0

    goto :goto_2

    :catchall_2
    move-exception v1

    goto :goto_3

    :cond_1
    invoke-virtual {v1}, Llu/c;->p0()V

    iget-object v1, p0, Lio/seon/androidsdk/service/j;->x:Ljava/lang/Object;

    check-cast v1, Llu/c;

    invoke-virtual {v1}, Llu/c;->m()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/seon/androidsdk/service/j;->x:Ljava/lang/Object;

    check-cast v1, Llu/c;

    invoke-virtual {v1}, Llu/c;->a0()V

    iget-object v1, p0, Lio/seon/androidsdk/service/j;->x:Ljava/lang/Object;

    check-cast v1, Llu/c;

    const/4 v2, 0x0

    iput v2, v1, Llu/c;->K:I

    :cond_2
    monitor-exit v0

    :goto_2
    const/4 v0, 0x0

    return-object v0

    :goto_3
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw v1

    :pswitch_1
    iget-object v0, p0, Lio/seon/androidsdk/service/j;->x:Ljava/lang/Object;

    check-cast v0, Ljava/security/KeyPairGenerator;

    invoke-virtual {v0}, Ljava/security/KeyPairGenerator;->generateKeyPair()Ljava/security/KeyPair;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
