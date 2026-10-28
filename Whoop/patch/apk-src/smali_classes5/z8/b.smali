.class public abstract Lz8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz8/f;


# instance fields
.field public final w:Z

.field public final x:Ljava/util/ArrayList;

.field public y:I

.field public z:Lz8/g;


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lz8/b;->w:Z

    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lz8/b;->x:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 8

    iget-object v0, p0, Lz8/b;->z:Lz8/g;

    sget v1, Lx8/t;->a:I

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget v3, p0, Lz8/b;->y:I

    if-ge v2, v3, :cond_3

    iget-object v3, p0, Lz8/b;->x:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz8/n;

    iget-boolean v4, p0, Lz8/b;->w:Z

    check-cast v3, Lp9/f;

    monitor-enter v3

    :try_start_0
    sget-object v5, Lp9/f;->p:Lzr/w0;

    if-eqz v4, :cond_1

    iget v4, v0, Lz8/g;->h:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v5, 0x8

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_0

    goto :goto_1

    :cond_0
    const/4 v4, 0x1

    goto :goto_2

    :cond_1
    :goto_1
    move v4, v1

    :goto_2
    if-nez v4, :cond_2

    monitor-exit v3

    goto :goto_3

    :cond_2
    :try_start_1
    iget-wide v4, v3, Lp9/f;->i:J

    int-to-long v6, p1

    add-long/2addr v4, v6

    iput-wide v4, v3, Lp9/f;->i:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v3

    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_3
    return-void
.end method

.method public final addTransferListener(Lz8/n;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lz8/b;->x:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget p1, p0, Lz8/b;->y:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lz8/b;->y:I

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 13

    iget-object v0, p0, Lz8/b;->z:Lz8/g;

    sget v1, Lx8/t;->a:I

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget v3, p0, Lz8/b;->y:I

    if-ge v2, v3, :cond_7

    iget-object v3, p0, Lz8/b;->x:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz8/n;

    iget-boolean v4, p0, Lz8/b;->w:Z

    move-object v5, v3

    check-cast v5, Lp9/f;

    monitor-enter v5

    :try_start_0
    sget-object v3, Lp9/f;->p:Lzr/w0;

    const/4 v3, 0x1

    if-eqz v4, :cond_1

    iget v4, v0, Lz8/g;->h:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v6, 0x8

    and-int/2addr v4, v6

    if-ne v4, v6, :cond_0

    goto :goto_1

    :cond_0
    move v4, v3

    goto :goto_2

    :cond_1
    :goto_1
    move v4, v1

    :goto_2
    if-nez v4, :cond_2

    monitor-exit v5

    goto :goto_5

    :cond_2
    :try_start_1
    iget v4, v5, Lp9/f;->g:I

    if-lez v4, :cond_3

    move v4, v3

    goto :goto_3

    :cond_3
    move v4, v1

    :goto_3
    invoke-static {v4}, Lva3/g;->i(Z)V

    iget-object v4, v5, Lp9/f;->d:Lx8/p;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v11

    iget-wide v6, v5, Lp9/f;->h:J

    sub-long v6, v11, v6

    long-to-int v6, v6

    iget-wide v7, v5, Lp9/f;->j:J

    int-to-long v9, v6

    add-long/2addr v7, v9

    iput-wide v7, v5, Lp9/f;->j:J

    iget-wide v7, v5, Lp9/f;->k:J

    iget-wide v9, v5, Lp9/f;->i:J

    add-long/2addr v7, v9

    iput-wide v7, v5, Lp9/f;->k:J

    if-lez v6, :cond_6

    long-to-float v4, v9

    const/high16 v7, 0x45fa0000    # 8000.0f

    mul-float/2addr v4, v7

    int-to-float v7, v6

    div-float/2addr v4, v7

    iget-object v7, v5, Lp9/f;->f:Lp9/p;

    long-to-double v8, v9

    invoke-static {v8, v9}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v8

    double-to-int v8, v8

    invoke-virtual {v7, v4, v8}, Lp9/p;->a(FI)V

    iget-wide v7, v5, Lp9/f;->j:J

    const-wide/16 v9, 0x7d0

    cmp-long v4, v7, v9

    if-gez v4, :cond_4

    iget-wide v7, v5, Lp9/f;->k:J

    const-wide/32 v9, 0x80000

    cmp-long v4, v7, v9

    if-ltz v4, :cond_5

    goto :goto_4

    :catchall_0
    move-exception v0

    goto :goto_6

    :cond_4
    :goto_4
    iget-object v4, v5, Lp9/f;->f:Lp9/p;

    invoke-virtual {v4}, Lp9/p;->b()F

    move-result v4

    float-to-long v7, v4

    iput-wide v7, v5, Lp9/f;->l:J

    :cond_5
    iget-wide v7, v5, Lp9/f;->i:J

    iget-wide v9, v5, Lp9/f;->l:J

    invoke-virtual/range {v5 .. v10}, Lp9/f;->b(IJJ)V

    iput-wide v11, v5, Lp9/f;->h:J

    const-wide/16 v6, 0x0

    iput-wide v6, v5, Lp9/f;->i:J

    :cond_6
    iget v4, v5, Lp9/f;->g:I

    sub-int/2addr v4, v3

    iput v4, v5, Lp9/f;->g:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v5

    :goto_5
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :goto_6
    :try_start_2
    monitor-exit v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :cond_7
    const/4 v0, 0x0

    iput-object v0, p0, Lz8/b;->z:Lz8/g;

    return-void
.end method

.method public final d()V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lz8/b;->y:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lz8/b;->x:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz8/n;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final h(Lz8/g;)V
    .locals 7

    iput-object p1, p0, Lz8/b;->z:Lz8/g;

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p0, Lz8/b;->y:I

    if-ge v1, v2, :cond_4

    iget-object v2, p0, Lz8/b;->x:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz8/n;

    iget-boolean v3, p0, Lz8/b;->w:Z

    check-cast v2, Lp9/f;

    monitor-enter v2

    :try_start_0
    sget-object v4, Lp9/f;->p:Lzr/w0;

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    iget v3, p1, Lz8/g;->h:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v5, 0x8

    and-int/2addr v3, v5

    if-ne v3, v5, :cond_0

    goto :goto_1

    :cond_0
    move v3, v4

    goto :goto_2

    :cond_1
    :goto_1
    move v3, v0

    :goto_2
    if-nez v3, :cond_2

    monitor-exit v2

    goto :goto_4

    :cond_2
    :try_start_1
    iget v3, v2, Lp9/f;->g:I

    if-nez v3, :cond_3

    iget-object v3, v2, Lp9/f;->d:Lx8/p;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    iput-wide v5, v2, Lp9/f;->h:J

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_3
    :goto_3
    iget v3, v2, Lp9/f;->g:I

    add-int/2addr v3, v4

    iput v3, v2, Lp9/f;->g:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v2

    :goto_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :goto_5
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_4
    return-void
.end method
