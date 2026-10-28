.class public final Lw73/c;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Ln73/b;


# instance fields
.field public final E:Lx73/b;

.field public volatile F:Z

.field public volatile G:Z

.field public final H:Lb83/b;

.field public I:I

.field public J:I

.field public final w:Ll73/d;

.field public final x:Lq30/u0;

.field public final y:[Lw73/b;

.field public z:[Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll73/d;Lq30/u0;II)V
    .locals 1

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    new-instance v0, Lb83/b;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lw73/c;->H:Lb83/b;

    iput-object p1, p0, Lw73/c;->w:Ll73/d;

    iput-object p2, p0, Lw73/c;->x:Lq30/u0;

    new-array p1, p3, [Ljava/lang/Object;

    iput-object p1, p0, Lw73/c;->z:[Ljava/lang/Object;

    new-array p1, p3, [Lw73/b;

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p3, :cond_0

    new-instance v0, Lw73/b;

    invoke-direct {v0, p0, p2}, Lw73/b;-><init>(Lw73/c;I)V

    aput-object v0, p1, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lw73/c;->y:[Lw73/b;

    new-instance p1, Lx73/b;

    invoke-direct {p1, p4}, Lx73/b;-><init>(I)V

    iput-object p1, p0, Lw73/c;->E:Lx73/b;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lw73/c;->y:[Lw73/b;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Lq73/c;->a(Ljava/util/concurrent/atomic/AtomicReference;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final b(Lx73/b;)V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lw73/c;->z:[Ljava/lang/Object;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Lx73/b;->clear()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final c()V
    .locals 7

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lw73/c;->E:Lx73/b;

    iget-object v1, p0, Lw73/c;->w:Ll73/d;

    const/4 v2, 0x1

    move v3, v2

    :cond_1
    :goto_0
    iget-boolean v4, p0, Lw73/c;->F:Z

    if-eqz v4, :cond_2

    invoke-virtual {p0, v0}, Lw73/c;->b(Lx73/b;)V

    return-void

    :cond_2
    iget-object v4, p0, Lw73/c;->H:Lb83/b;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {p0}, Lw73/c;->a()V

    invoke-virtual {p0, v0}, Lw73/c;->b(Lx73/b;)V

    iget-object v0, p0, Lw73/c;->H:Lb83/b;

    invoke-virtual {v0}, Lb83/b;->b()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {v1, v0}, Ll73/d;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_3
    iget-boolean v4, p0, Lw73/c;->G:Z

    invoke-virtual {v0}, Lx73/b;->poll()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Ljava/lang/Object;

    if-nez v5, :cond_4

    move v6, v2

    goto :goto_1

    :cond_4
    const/4 v6, 0x0

    :goto_1
    if-eqz v4, :cond_6

    if-eqz v6, :cond_6

    invoke-virtual {p0, v0}, Lw73/c;->b(Lx73/b;)V

    iget-object v0, p0, Lw73/c;->H:Lb83/b;

    invoke-virtual {v0}, Lb83/b;->b()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_5

    invoke-interface {v1}, Ll73/d;->onComplete()V

    return-void

    :cond_5
    invoke-interface {v1, v0}, Ll73/d;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_6
    if-eqz v6, :cond_7

    neg-int v3, v3

    invoke-virtual {p0, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v3

    if-nez v3, :cond_1

    :goto_2
    return-void

    :cond_7
    :try_start_0
    iget-object v4, p0, Lw73/c;->x:Lq30/u0;

    invoke-virtual {v4, v5}, Lq30/u0;->z(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "The combiner returned a null value"

    invoke-static {v4, v5}, Lr73/a;->a(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1, v4}, Ll73/d;->onNext(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v2

    invoke-static {v2}, Lbi/g;->a0(Ljava/lang/Throwable;)V

    iget-object v3, p0, Lw73/c;->H:Lb83/b;

    invoke-virtual {v3, v2}, Lb83/b;->a(Ljava/lang/Throwable;)Z

    invoke-virtual {p0}, Lw73/c;->a()V

    invoke-virtual {p0, v0}, Lw73/c;->b(Lx73/b;)V

    iget-object v0, p0, Lw73/c;->H:Lb83/b;

    invoke-virtual {v0}, Lb83/b;->b()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {v1, v0}, Ll73/d;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final dispose()V
    .locals 1

    iget-boolean v0, p0, Lw73/c;->F:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lw73/c;->F:Z

    invoke-virtual {p0}, Lw73/c;->a()V

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lw73/c;->E:Lx73/b;

    invoke-virtual {p0, v0}, Lw73/c;->b(Lx73/b;)V

    :cond_0
    return-void
.end method

.method public final isDisposed()Z
    .locals 1

    iget-boolean v0, p0, Lw73/c;->F:Z

    return v0
.end method
