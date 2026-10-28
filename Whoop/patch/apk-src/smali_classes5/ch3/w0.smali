.class public final Lch3/w0;
.super Ljava/util/concurrent/atomic/AtomicBoolean;
.source "SourceFile"

# interfaces
.implements Lxg3/q;
.implements Lxg3/t;


# instance fields
.field public final w:Lxg3/r;

.field public final x:Lfh3/a;


# direct methods
.method public constructor <init>(Lxg3/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, Lch3/w0;->w:Lxg3/r;

    new-instance p1, Lfh3/a;

    invoke-direct {p1}, Lfh3/a;-><init>()V

    iput-object p1, p0, Lch3/w0;->x:Lfh3/a;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public final b()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lch3/w0;->x:Lfh3/a;

    invoke-virtual {v0}, Lfh3/a;->b()V

    :cond_0
    return-void
.end method

.method public final c(Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Lch3/w0;->x:Lfh3/a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-eqz v1, :cond_0

    :try_start_0
    iget-object v1, p0, Lch3/w0;->w:Lxg3/r;

    invoke-virtual {v1, p1}, Lxg3/r;->d(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lfh3/a;->b()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Lfh3/a;->b()V

    throw p1

    :cond_0
    invoke-static {p1}, Ljh3/a;->a(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lch3/w0;->x:Lfh3/a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-eqz v1, :cond_0

    :try_start_0
    iget-object v1, p0, Lch3/w0;->w:Lxg3/r;

    invoke-virtual {v1, p1}, Lxg3/r;->e(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lfh3/a;->b()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Lfh3/a;->b()V

    throw p1

    :cond_0
    return-void
.end method
