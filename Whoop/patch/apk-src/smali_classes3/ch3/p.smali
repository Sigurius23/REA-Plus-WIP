.class public final Lch3/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxg3/e;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lch3/p;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 3
    iput-object p1, p0, Lch3/p;->x:Ljava/lang/Object;

    return-void

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "iterable must not be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lch3/p;->w:I

    iput-object p1, p0, Lch3/p;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 5

    iget v0, p0, Lch3/p;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lxg3/s;

    iget-object v0, p0, Lch3/p;->x:Ljava/lang/Object;

    check-cast v0, Lpg3/b0;

    invoke-virtual {v0}, Lpg3/b0;->clone()Lpg3/e;

    move-result-object v0

    new-instance v1, Lqg3/c;

    invoke-direct {v1, v0, p1}, Lqg3/c;-><init>(Lpg3/e;Lxg3/s;)V

    invoke-virtual {p1, v1}, Lxg3/s;->c(Lxg3/t;)V

    invoke-virtual {p1, v1}, Lxg3/s;->f(Lxg3/i;)V

    :try_start_0
    check-cast v0, Lpg3/b0;

    invoke-virtual {v0}, Lpg3/b0;->b()Lpg3/v0;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v2, 0x2

    if-eqz v0, :cond_3

    const/4 v3, 0x3

    const/4 v4, 0x1

    if-eq v0, v4, :cond_2

    if-eq v0, v2, :cond_1

    if-eq v0, v3, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Unknown state: "

    invoke-static {v0, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_2
    invoke-virtual {v1, v4, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1, p1}, Lqg3/c;->c(Lpg3/v0;)V

    goto :goto_0

    :cond_3
    iput-object p1, v1, Lqg3/c;->z:Lpg3/v0;

    const/4 v0, 0x0

    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Ldt/b;->V(Ljava/lang/Throwable;)V

    const/4 v0, 0x3

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-boolean v0, v1, Lqg3/c;->y:Z

    if-nez v0, :cond_4

    :try_start_1
    iget-object v0, v1, Lqg3/c;->x:Lxg3/s;

    invoke-interface {v0, p1}, Lxg3/h;->onError(Ljava/lang/Throwable;)V
    :try_end_1
    .catch Lrx/exceptions/OnCompletedFailedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lrx/exceptions/OnErrorFailedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lrx/exceptions/OnErrorNotImplementedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-static {v0}, Ldt/b;->V(Ljava/lang/Throwable;)V

    new-instance v1, Lrx/exceptions/CompositeException;

    filled-new-array {p1, v0}, [Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v1, p1}, Lrx/exceptions/CompositeException;-><init>([Ljava/lang/Throwable;)V

    sget-object p1, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {p1}, Ljh3/f;->b()Ljh3/d;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :catch_0
    sget-object p1, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {p1}, Ljh3/f;->b()Ljh3/d;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_4
    :goto_0
    return-void

    :pswitch_0
    check-cast p1, Lxg3/s;

    iget-object v0, p0, Lch3/p;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    invoke-interface {p1, v0}, Lxg3/h;->onError(Ljava/lang/Throwable;)V

    return-void

    :pswitch_1
    check-cast p1, Lxg3/s;

    :try_start_2
    iget-object v0, p0, Lch3/p;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-virtual {p1}, Lxg3/s;->a()Z

    move-result v2

    if-nez v2, :cond_6

    if-nez v1, :cond_5

    invoke-interface {p1}, Lxg3/h;->onCompleted()V

    goto :goto_1

    :cond_5
    new-instance v1, Lch3/o;

    invoke-direct {v1, p1, v0}, Lch3/o;-><init>(Lxg3/s;Ljava/util/Iterator;)V

    invoke-virtual {p1, v1}, Lxg3/s;->f(Lxg3/i;)V

    goto :goto_1

    :catchall_2
    move-exception v0

    invoke-static {v0, p1}, Ldt/b;->W(Ljava/lang/Throwable;Lxg3/h;)V

    :cond_6
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
