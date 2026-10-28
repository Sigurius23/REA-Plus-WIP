.class public final Lzg3/b;
.super Lxg3/j;
.source "SourceFile"


# instance fields
.field public final w:Landroid/os/Handler;

.field public final x:Lyg3/b;

.field public volatile y:Z


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzg3/b;->w:Landroid/os/Handler;

    sget-object p1, Lyg3/a;->b:Lyg3/a;

    iget-object p1, p1, Lyg3/a;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_0
    const/4 v0, 0x0

    sget-object v1, Lyg3/b;->a:Lyg3/b;

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    :cond_2
    :goto_0
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lyg3/b;

    iput-object p1, p0, Lzg3/b;->x:Lyg3/b;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lzg3/b;->y:Z

    return v0
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzg3/b;->y:Z

    iget-object v0, p0, Lzg3/b;->w:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public final c(Lbh3/a;)Lxg3/t;
    .locals 3

    const-wide/16 v0, 0x0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, p1, v0, v1, v2}, Lzg3/b;->d(Lbh3/a;JLjava/util/concurrent/TimeUnit;)Lxg3/t;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lbh3/a;JLjava/util/concurrent/TimeUnit;)Lxg3/t;
    .locals 3

    sget-object v0, Lmh3/e;->a:Lmh3/d;

    iget-boolean v1, p0, Lzg3/b;->y:Z

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p0, Lzg3/b;->x:Lyg3/b;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lzg3/c;

    iget-object v2, p0, Lzg3/b;->w:Landroid/os/Handler;

    invoke-direct {v1, p1, v2}, Lzg3/c;-><init>(Lbh3/a;Landroid/os/Handler;)V

    invoke-static {v2, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;Ljava/lang/Runnable;)Landroid/os/Message;

    move-result-object p1

    iput-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    iget-object v2, p0, Lzg3/b;->w:Landroid/os/Handler;

    invoke-virtual {p4, p2, p3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p2

    invoke-virtual {v2, p1, p2, p3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    iget-boolean p1, p0, Lzg3/b;->y:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lzg3/b;->w:Landroid/os/Handler;

    invoke-virtual {p1, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-object v0

    :cond_1
    return-object v1
.end method
