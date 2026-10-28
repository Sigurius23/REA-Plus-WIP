.class public abstract Lfc3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public w:[Lfc3/c;

.field public x:I

.field public y:I

.field public z:Lfc3/y;


# virtual methods
.method public final c()Lfc3/c;
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lfc3/a;->w:[Lfc3/c;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lfc3/a;->f()[Lfc3/c;

    move-result-object v0

    iput-object v0, p0, Lfc3/a;->w:[Lfc3/c;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    iget v1, p0, Lfc3/a;->x:I

    array-length v2, v0

    if-lt v1, v2, :cond_1

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "copyOf(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    check-cast v1, [Lfc3/c;

    iput-object v1, p0, Lfc3/a;->w:[Lfc3/c;

    check-cast v0, [Lfc3/c;

    :cond_1
    :goto_0
    iget v1, p0, Lfc3/a;->y:I

    :cond_2
    aget-object v2, v0, v1

    if-nez v2, :cond_3

    invoke-virtual {p0}, Lfc3/a;->e()Lfc3/c;

    move-result-object v2

    aput-object v2, v0, v1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    array-length v3, v0

    if-lt v1, v3, :cond_4

    const/4 v1, 0x0

    :cond_4
    invoke-virtual {v2, p0}, Lfc3/c;->a(Lfc3/a;)Z

    move-result v3

    if-eqz v3, :cond_2

    iput v1, p0, Lfc3/a;->y:I

    iget v0, p0, Lfc3/a;->x:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lfc3/a;->x:I

    iget-object v0, p0, Lfc3/a;->z:Lfc3/y;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    if-eqz v0, :cond_5

    invoke-virtual {v0, v1}, Lfc3/y;->v(I)V

    :cond_5
    return-object v2

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public abstract e()Lfc3/c;
.end method

.method public abstract f()[Lfc3/c;
.end method

.method public final g(Lfc3/c;)V
    .locals 6

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lfc3/a;->x:I

    const/4 v1, -0x1

    add-int/2addr v0, v1

    iput v0, p0, Lfc3/a;->x:I

    iget-object v2, p0, Lfc3/a;->z:Lfc3/y;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    iput v3, p0, Lfc3/a;->y:I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Lfc3/c;->b(Lfc3/a;)[Lq83/d;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    array-length v0, p1

    :goto_1
    if-ge v3, v0, :cond_2

    aget-object v4, p1, v3

    if-eqz v4, :cond_1

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    invoke-interface {v4, v5}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {v2, v1}, Lfc3/y;->v(I)V

    :cond_3
    return-void

    :goto_2
    monitor-exit p0

    throw p1
.end method

.method public final h()Lfc3/y;
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lfc3/a;->z:Lfc3/y;

    if-nez v0, :cond_0

    new-instance v0, Lfc3/y;

    iget v1, p0, Lfc3/a;->x:I

    sget-object v2, Ldc3/a;->x:Ldc3/a;

    const/4 v3, 0x1

    const v4, 0x7fffffff

    invoke-direct {v0, v3, v4, v2}, Lec3/w1;-><init>(IILdc3/a;)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lec3/w1;->a(Ljava/lang/Object;)Z

    iput-object v0, p0, Lfc3/a;->z:Lfc3/y;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0

    throw v0
.end method
