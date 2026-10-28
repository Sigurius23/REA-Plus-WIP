.class public final Lzk/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzk/z;


# instance fields
.field public final E:Lwk/e;

.field public F:I

.field public G:Z

.field public final w:Z

.field public final x:Z

.field public final y:Lzk/z;

.field public final z:Lzk/s;


# direct methods
.method public constructor <init>(Lzk/z;ZZLwk/e;Lzk/s;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Argument must not be null"

    invoke-static {p1, v0}, Lpf/c;->p(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lzk/t;->y:Lzk/z;

    iput-boolean p2, p0, Lzk/t;->w:Z

    iput-boolean p3, p0, Lzk/t;->x:Z

    iput-object p4, p0, Lzk/t;->E:Lwk/e;

    invoke-static {p5, v0}, Lpf/c;->p(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p5, p0, Lzk/t;->z:Lzk/s;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lzk/t;->F:I

    if-gtz v0, :cond_2

    iget-boolean v0, p0, Lzk/t;->G:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzk/t;->G:Z

    iget-boolean v0, p0, Lzk/t;->x:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzk/t;->y:Lzk/z;

    invoke-interface {v0}, Lzk/z;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot recycle a resource that has already been recycled"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot recycle a resource while it is still acquired"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized b()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lzk/t;->G:Z

    if-nez v0, :cond_0

    iget v0, p0, Lzk/t;->F:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lzk/t;->F:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot acquire a recycled resource"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final c()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lzk/t;->y:Lzk/z;

    invoke-interface {v0}, Lzk/z;->c()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lzk/t;->w:Z

    return v0
.end method

.method public final e()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lzk/t;->F:I

    if-lez v0, :cond_2

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iput v0, p0, Lzk/t;->F:I

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    iget-object v0, p0, Lzk/t;->z:Lzk/s;

    iget-object v1, p0, Lzk/t;->E:Lwk/e;

    check-cast v0, Lzk/l;

    invoke-virtual {v0, v1, p0}, Lzk/l;->e(Lwk/e;Lzk/t;)V

    :cond_1
    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_2
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot release a recycled or not yet acquired resource"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lzk/t;->y:Lzk/z;

    invoke-interface {v0}, Lzk/z;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getSize()I
    .locals 1

    iget-object v0, p0, Lzk/t;->y:Lzk/z;

    invoke-interface {v0}, Lzk/z;->getSize()I

    move-result v0

    return v0
.end method

.method public final declared-synchronized toString()Ljava/lang/String;
    .locals 2

    const-string v0, "EngineResource{isMemoryCacheable="

    monitor-enter p0

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v0, p0, Lzk/t;->w:Z

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", listener="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lzk/t;->z:Lzk/s;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", key="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lzk/t;->E:Lwk/e;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", acquired="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lzk/t;->F:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", isRecycled="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lzk/t;->G:Z

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", resource="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lzk/t;->y:Lzk/z;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x7d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
