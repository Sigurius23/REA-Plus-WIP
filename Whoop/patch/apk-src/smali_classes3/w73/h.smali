.class public final Lw73/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll73/d;
.implements Ln73/b;


# instance fields
.field public final w:Lt73/a;

.field public x:Ln73/b;

.field public y:J

.field public z:Z


# direct methods
.method public constructor <init>(Lt73/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw73/h;->w:Lt73/a;

    return-void
.end method


# virtual methods
.method public final b(Ln73/b;)V
    .locals 1

    iget-object v0, p0, Lw73/h;->x:Ln73/b;

    invoke-static {v0, p1}, Lq73/c;->c(Ln73/b;Ln73/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lw73/h;->x:Ln73/b;

    iget-object p1, p0, Lw73/h;->w:Lt73/a;

    invoke-static {p1, p0}, Lq73/c;->b(Ljava/util/concurrent/atomic/AtomicReference;Ln73/b;)Z

    :cond_0
    return-void
.end method

.method public final dispose()V
    .locals 1

    iget-object v0, p0, Lw73/h;->x:Ln73/b;

    invoke-interface {v0}, Ln73/b;->dispose()V

    return-void
.end method

.method public final isDisposed()Z
    .locals 1

    iget-object v0, p0, Lw73/h;->x:Ln73/b;

    invoke-interface {v0}, Ln73/b;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public final onComplete()V
    .locals 2

    iget-boolean v0, p0, Lw73/h;->z:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lw73/h;->z:Z

    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    iget-object v1, p0, Lw73/h;->w:Lt73/a;

    invoke-virtual {v1, v0}, Lt73/a;->a(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Lw73/h;->z:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lw73/h;->z:Z

    iget-object v0, p0, Lw73/h;->w:Lt73/a;

    invoke-virtual {v0, p1}, Lt73/a;->a(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 4

    iget-boolean v0, p0, Lw73/h;->z:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-wide v0, p0, Lw73/h;->y:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lw73/h;->z:Z

    iget-object v0, p0, Lw73/h;->x:Ln73/b;

    invoke-interface {v0}, Ln73/b;->dispose()V

    sget-object v0, Lq73/c;->w:Lq73/c;

    iget-object v1, p0, Lw73/h;->w:Lt73/a;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    :try_start_0
    iget-object v0, v1, Lt73/a;->w:Lmm/d;

    invoke-virtual {v0, p1}, Lmm/d;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lbi/g;->a0(Ljava/lang/Throwable;)V

    invoke-static {p1}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    return-void

    :cond_1
    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lw73/h;->y:J

    return-void
.end method
