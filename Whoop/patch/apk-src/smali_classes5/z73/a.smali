.class public final Lz73/a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Ll73/b;
.implements Leg3/b;
.implements Ln73/b;


# instance fields
.field public final w:Lcom/whoop/data/repositories/c;

.field public final x:Ljc/a;

.field public final y:Ljc/a;

.field public final z:Lv73/c;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lz73/a;->w:Lcom/whoop/data/repositories/c;

    sget-object p1, Lr73/a;->d:Ljc/a;

    iput-object p1, p0, Lz73/a;->x:Ljc/a;

    sget-object p1, Lr73/a;->b:Ljc/a;

    iput-object p1, p0, Lz73/a;->y:Ljc/a;

    sget-object p1, Lv73/c;->w:Lv73/c;

    iput-object p1, p0, Lz73/a;->z:Lv73/c;

    return-void
.end method


# virtual methods
.method public final b(Leg3/b;)V
    .locals 2

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Leg3/b;->cancel()V

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, La83/c;->w:La83/c;

    if-eq v0, v1, :cond_2

    new-instance v0, Lio/reactivex/exceptions/ProtocolViolationException;

    const-string v1, "Subscription already set!"

    invoke-direct {v0, v1}, Lio/reactivex/exceptions/ProtocolViolationException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_3

    :try_start_0
    iget-object v0, p0, Lz73/a;->z:Lv73/c;

    invoke-virtual {v0, p0}, Lv73/c;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lbi/g;->a0(Ljava/lang/Throwable;)V

    invoke-interface {p1}, Leg3/b;->cancel()V

    invoke-virtual {p0, v0}, Lz73/a;->onError(Ljava/lang/Throwable;)V

    :cond_3
    return-void
.end method

.method public final cancel()V
    .locals 0

    invoke-static {p0}, La83/c;->a(Ljava/util/concurrent/atomic/AtomicReference;)V

    return-void
.end method

.method public final dispose()V
    .locals 0

    invoke-static {p0}, La83/c;->a(Ljava/util/concurrent/atomic/AtomicReference;)V

    return-void
.end method

.method public final isDisposed()Z
    .locals 2

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, La83/c;->w:La83/c;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final onComplete()V
    .locals 2

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, La83/c;->w:La83/c;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    :try_start_0
    iget-object v0, p0, Lz73/a;->y:Ljc/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lbi/g;->a0(Ljava/lang/Throwable;)V

    invoke-static {v0}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 2

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, La83/c;->w:La83/c;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    :try_start_0
    iget-object v0, p0, Lz73/a;->x:Ljc/a;

    invoke-virtual {v0, p1}, Ljc/a;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lbi/g;->a0(Ljava/lang/Throwable;)V

    new-instance v1, Lio/reactivex/exceptions/CompositeException;

    filled-new-array {p1, v0}, [Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v1, p1}, Lio/reactivex/exceptions/CompositeException;-><init>([Ljava/lang/Throwable;)V

    invoke-static {v1}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    invoke-static {p1}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Lz73/a;->isDisposed()Z

    move-result v0

    if-nez v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lz73/a;->w:Lcom/whoop/data/repositories/c;

    invoke-virtual {v0, p1}, Lcom/whoop/data/repositories/c;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lbi/g;->a0(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leg3/b;

    invoke-interface {v0}, Leg3/b;->cancel()V

    invoke-virtual {p0, p1}, Lz73/a;->onError(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final request(J)V
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leg3/b;

    invoke-interface {v0, p1, p2}, Leg3/b;->request(J)V

    return-void
.end method
