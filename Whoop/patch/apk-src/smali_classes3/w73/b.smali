.class public final Lw73/b;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Ll73/d;


# instance fields
.field public final w:Lw73/c;

.field public final x:I


# direct methods
.method public constructor <init>(Lw73/c;I)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lw73/b;->w:Lw73/c;

    iput p2, p0, Lw73/b;->x:I

    return-void
.end method


# virtual methods
.method public final b(Ln73/b;)V
    .locals 0

    invoke-static {p0, p1}, Lq73/c;->b(Ljava/util/concurrent/atomic/AtomicReference;Ln73/b;)Z

    return-void
.end method

.method public final onComplete()V
    .locals 5

    iget-object v0, p0, Lw73/b;->w:Lw73/c;

    iget v1, p0, Lw73/b;->x:I

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, Lw73/c;->z:[Ljava/lang/Object;

    if-nez v2, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    aget-object v1, v2, v1

    const/4 v3, 0x1

    if-nez v1, :cond_1

    move v1, v3

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_2

    iget v4, v0, Lw73/c;->J:I

    add-int/2addr v4, v3

    iput v4, v0, Lw73/c;->J:I

    array-length v2, v2

    if-ne v4, v2, :cond_3

    :cond_2
    iput-boolean v3, v0, Lw73/c;->G:Z

    :cond_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Lw73/c;->a()V

    :cond_4
    invoke-virtual {v0}, Lw73/c;->c()V

    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lw73/b;->w:Lw73/c;

    iget-object v1, v0, Lw73/c;->H:Lb83/b;

    invoke-virtual {v1, p1}, Lb83/b;->a(Ljava/lang/Throwable;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lw73/c;->a()V

    invoke-virtual {v0}, Lw73/c;->c()V

    return-void

    :cond_0
    invoke-static {p1}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 5

    iget-object v0, p0, Lw73/b;->w:Lw73/c;

    iget v1, p0, Lw73/b;->x:I

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, Lw73/c;->z:[Ljava/lang/Object;

    if-nez v2, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    aget-object v3, v2, v1

    iget v4, v0, Lw73/c;->I:I

    if-nez v3, :cond_1

    add-int/lit8 v4, v4, 0x1

    iput v4, v0, Lw73/c;->I:I

    :cond_1
    aput-object p1, v2, v1

    array-length p1, v2

    if-ne v4, p1, :cond_2

    iget-object p1, v0, Lw73/c;->E:Lx73/b;

    invoke-virtual {v2}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v1}, Lx73/b;->offer(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_3

    invoke-virtual {v0}, Lw73/c;->c()V

    :cond_3
    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
