.class public final Landroidx/room/u1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final x:Ljava/util/ArrayDeque;

.field public final y:Ljava/util/concurrent/Executor;

.field public z:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcq/r;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Landroidx/room/u1;->w:I

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/room/u1;->E:Ljava/lang/Object;

    .line 11
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Landroidx/room/u1;->x:Ljava/util/ArrayDeque;

    .line 12
    iput-object p1, p0, Landroidx/room/u1;->y:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;I)V
    .locals 0

    iput p2, p0, Landroidx/room/u1;->w:I

    packed-switch p2, :pswitch_data_0

    .line 1
    const-string p2, "executor"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/u1;->y:Ljava/util/concurrent/Executor;

    .line 3
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Landroidx/room/u1;->x:Ljava/util/ArrayDeque;

    .line 4
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/u1;->E:Ljava/lang/Object;

    return-void

    .line 5
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Landroidx/room/u1;->y:Ljava/util/concurrent/Executor;

    .line 7
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Landroidx/room/u1;->x:Ljava/util/ArrayDeque;

    .line 8
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/u1;->E:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget v0, p0, Landroidx/room/u1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/room/u1;->E:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/room/u1;->x:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    iput-object v1, p0, Landroidx/room/u1;->z:Ljava/lang/Runnable;

    if-eqz v1, :cond_0

    iget-object v2, p0, Landroidx/room/u1;->y:Ljava/util/concurrent/Executor;

    check-cast v2, Lcq/r;

    invoke-virtual {v2, v1}, Lcq/r;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :pswitch_0
    iget-object v0, p0, Landroidx/room/u1;->x:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    iput-object v0, p0, Landroidx/room/u1;->z:Ljava/lang/Runnable;

    if-eqz v0, :cond_1

    iget-object v1, p0, Landroidx/room/u1;->y:Ljava/util/concurrent/Executor;

    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_1
    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/room/u1;->E:Ljava/lang/Object;

    monitor-enter v0

    :try_start_1
    iget-object v1, p0, Landroidx/room/u1;->x:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/Runnable;

    iput-object v2, p0, Landroidx/room/u1;->z:Ljava/lang/Runnable;

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroidx/room/u1;->y:Ljava/util/concurrent/Executor;

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v1

    goto :goto_3

    :cond_2
    :goto_2
    monitor-exit v0

    return-void

    :goto_3
    monitor-exit v0

    throw v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final execute(Ljava/lang/Runnable;)V
    .locals 5

    iget v0, p0, Landroidx/room/u1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/room/u1;->E:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/room/u1;->x:Ljava/util/ArrayDeque;

    new-instance v2, Landroidx/lifecycle/m;

    const/16 v3, 0x1a

    invoke-direct {v2, v3, p0, p1}, Landroidx/lifecycle/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Landroidx/room/u1;->z:Ljava/lang/Runnable;

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroidx/room/u1;->a()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :pswitch_0
    iget-object v0, p0, Landroidx/room/u1;->E:Ljava/lang/Object;

    monitor-enter v0

    :try_start_1
    iget-object v1, p0, Landroidx/room/u1;->x:Ljava/util/ArrayDeque;

    new-instance v2, Lcq/m;

    const/16 v3, 0xb

    const/4 v4, 0x0

    invoke-direct {v2, p0, p1, v4, v3}, Lcq/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Landroidx/room/u1;->z:Ljava/lang/Runnable;

    if-nez p1, :cond_1

    invoke-virtual {p0}, Landroidx/room/u1;->a()V

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_3

    :cond_1
    :goto_2
    monitor-exit v0

    return-void

    :goto_3
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p1

    :pswitch_1
    const-string v0, "command"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/room/u1;->E:Ljava/lang/Object;

    monitor-enter v0

    :try_start_2
    iget-object v1, p0, Landroidx/room/u1;->x:Ljava/util/ArrayDeque;

    new-instance v2, Landroidx/lifecycle/m;

    const/4 v3, 0x1

    invoke-direct {v2, p1, p0, v3}, Landroidx/lifecycle/m;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    iget-object p1, p0, Landroidx/room/u1;->z:Ljava/lang/Runnable;

    if-nez p1, :cond_2

    invoke-virtual {p0}, Landroidx/room/u1;->a()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception p1

    goto :goto_5

    :cond_2
    :goto_4
    monitor-exit v0

    return-void

    :goto_5
    monitor-exit v0

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
