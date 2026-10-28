.class public final Lt73/a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Ln73/b;


# instance fields
.field public final w:Lmm/d;

.field public final x:Lmm/d;


# direct methods
.method public constructor <init>(Lmm/d;Lmm/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lt73/a;->w:Lmm/d;

    iput-object p2, p0, Lt73/a;->x:Lmm/d;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    sget-object v0, Lq73/c;->w:Lq73/c;

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    :try_start_0
    iget-object v0, p0, Lt73/a;->x:Lmm/d;

    invoke-virtual {v0, p1}, Lmm/d;->accept(Ljava/lang/Object;)V
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
