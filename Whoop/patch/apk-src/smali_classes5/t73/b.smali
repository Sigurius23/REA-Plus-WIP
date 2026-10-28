.class public final Lt73/b;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Ll73/d;
.implements Ln73/b;


# instance fields
.field public final w:Lp73/b;

.field public final x:Lp73/b;

.field public final y:Ljc/a;

.field public final z:Ljc/b;


# direct methods
.method public constructor <init>(Lp73/b;Lp73/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lt73/b;->w:Lp73/b;

    iput-object p2, p0, Lt73/b;->x:Lp73/b;

    sget-object p1, Lr73/a;->b:Ljc/a;

    iput-object p1, p0, Lt73/b;->y:Ljc/a;

    sget-object p1, Lr73/a;->c:Ljc/b;

    iput-object p1, p0, Lt73/b;->z:Ljc/b;

    return-void
.end method


# virtual methods
.method public final b(Ln73/b;)V
    .locals 1

    invoke-static {p0, p1}, Lq73/c;->b(Ljava/util/concurrent/atomic/AtomicReference;Ln73/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lt73/b;->z:Ljc/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lbi/g;->a0(Ljava/lang/Throwable;)V

    invoke-interface {p1}, Ln73/b;->dispose()V

    invoke-virtual {p0, v0}, Lt73/b;->onError(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final dispose()V
    .locals 0

    invoke-static {p0}, Lq73/c;->a(Ljava/util/concurrent/atomic/AtomicReference;)V

    return-void
.end method

.method public final isDisposed()Z
    .locals 2

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lq73/c;->w:Lq73/c;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final onComplete()V
    .locals 1

    invoke-virtual {p0}, Lt73/b;->isDisposed()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lq73/c;->w:Lq73/c;

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    :try_start_0
    iget-object v0, p0, Lt73/b;->y:Ljc/a;

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

    invoke-virtual {p0}, Lt73/b;->isDisposed()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lq73/c;->w:Lq73/c;

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    :try_start_0
    iget-object v0, p0, Lt73/b;->x:Lp73/b;

    invoke-interface {v0, p1}, Lp73/b;->accept(Ljava/lang/Object;)V
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

    invoke-virtual {p0}, Lt73/b;->isDisposed()Z

    move-result v0

    if-nez v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lt73/b;->w:Lp73/b;

    invoke-interface {v0, p1}, Lp73/b;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lbi/g;->a0(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln73/b;

    invoke-interface {v0}, Ln73/b;->dispose()V

    invoke-virtual {p0, p1}, Lt73/b;->onError(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
