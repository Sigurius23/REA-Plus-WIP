.class public final Leh3/o;
.super Ljava/util/concurrent/atomic/AtomicBoolean;
.source "SourceFile"

# interfaces
.implements Lxg3/t;


# instance fields
.field public final synthetic w:I

.field public final x:Leh3/p;

.field public final y:Lxg3/t;


# direct methods
.method public synthetic constructor <init>(Leh3/p;Lxg3/t;I)V
    .locals 0

    iput p3, p0, Leh3/o;->w:I

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, Leh3/o;->x:Leh3/p;

    iput-object p2, p0, Leh3/o;->y:Lxg3/t;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget v0, p0, Leh3/o;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Leh3/o;->x:Leh3/p;

    iget-object v0, v0, Leh3/p;->w:Lgh3/m;

    iget-boolean v0, v0, Lgh3/m;->x:Z

    return v0

    :pswitch_0
    iget-object v0, p0, Leh3/o;->x:Leh3/p;

    iget-object v0, v0, Leh3/p;->w:Lgh3/m;

    iget-boolean v0, v0, Lgh3/m;->x:Z

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()V
    .locals 4

    iget v0, p0, Leh3/o;->w:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Leh3/o;->y:Lxg3/t;

    check-cast v0, Lmh3/c;

    iget-object v1, p0, Leh3/o;->x:Leh3/p;

    invoke-virtual {v0, v1}, Lmh3/c;->e(Lxg3/t;)V

    :cond_0
    return-void

    :pswitch_0
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Leh3/o;->y:Lxg3/t;

    check-cast v0, Lgh3/m;

    iget-object v1, p0, Leh3/o;->x:Leh3/p;

    iget-boolean v2, v0, Lgh3/m;->x:Z

    if-nez v2, :cond_3

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, Lgh3/m;->w:Ljava/util/LinkedList;

    iget-boolean v3, v0, Lgh3/m;->x:Z

    if-nez v3, :cond_2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v2, v1}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    move-result v2

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Leh3/p;->b()V

    goto :goto_2

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_2
    :goto_0
    :try_start_1
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :cond_3
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
