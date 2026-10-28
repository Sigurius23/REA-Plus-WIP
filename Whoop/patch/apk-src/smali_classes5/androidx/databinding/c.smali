.class public Landroidx/databinding/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public final E:Landroidx/databinding/b;

.field public w:Ljava/util/ArrayList;

.field public x:J

.field public y:[J

.field public z:I


# direct methods
.method public constructor <init>(Landroidx/databinding/b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/databinding/c;->w:Ljava/util/ArrayList;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Landroidx/databinding/c;->x:J

    iput-object p1, p0, Landroidx/databinding/c;->E:Landroidx/databinding/b;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Ljava/lang/Object;)V
    .locals 1

    monitor-enter p0

    if-eqz p1, :cond_2

    :try_start_0
    iget-object v0, p0, Landroidx/databinding/c;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->lastIndexOf(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    invoke-virtual {p0, v0}, Landroidx/databinding/c;->b(I)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Landroidx/databinding/c;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :cond_2
    :try_start_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "callback cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final b(I)Z
    .locals 10

    const-wide/16 v0, 0x0

    const-wide/16 v2, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/16 v6, 0x40

    if-ge p1, v6, :cond_1

    shl-long/2addr v2, p1

    iget-wide v6, p0, Landroidx/databinding/c;->x:J

    and-long/2addr v2, v6

    cmp-long p1, v2, v0

    if-eqz p1, :cond_0

    return v4

    :cond_0
    return v5

    :cond_1
    iget-object v7, p0, Landroidx/databinding/c;->y:[J

    if-nez v7, :cond_2

    return v5

    :cond_2
    div-int/lit8 v8, p1, 0x40

    sub-int/2addr v8, v4

    array-length v9, v7

    if-lt v8, v9, :cond_3

    return v5

    :cond_3
    aget-wide v7, v7, v8

    rem-int/2addr p1, v6

    shl-long/2addr v2, p1

    and-long/2addr v2, v7

    cmp-long p1, v2, v0

    if-eqz p1, :cond_4

    return v4

    :cond_4
    return v5
.end method

.method public final declared-synchronized c(Landroidx/databinding/a;I)V
    .locals 8

    monitor-enter p0

    :try_start_0
    iget v0, p0, Landroidx/databinding/c;->z:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroidx/databinding/c;->z:I

    iget-object v0, p0, Landroidx/databinding/c;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    iget-object v0, p0, Landroidx/databinding/c;->y:[J

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    invoke-virtual {p0, p1, p2, v0}, Landroidx/databinding/c;->e(Landroidx/databinding/a;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    add-int/lit8 v0, v0, 0x2

    mul-int/lit8 v4, v0, 0x40

    const-wide/16 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    :try_start_1
    invoke-virtual/range {v1 .. v7}, Landroidx/databinding/c;->d(Landroidx/databinding/a;IIIJ)V

    iget p1, v1, Landroidx/databinding/c;->z:I

    add-int/lit8 p1, p1, -0x1

    iput p1, v1, Landroidx/databinding/c;->z:I

    if-nez p1, :cond_3

    iget-object p1, v1, Landroidx/databinding/c;->y:[J

    const-wide/16 v2, 0x0

    if-eqz p1, :cond_2

    array-length p1, p1

    add-int/lit8 p1, p1, -0x1

    :goto_1
    if-ltz p1, :cond_2

    iget-object p2, v1, Landroidx/databinding/c;->y:[J

    aget-wide v4, p2, p1

    cmp-long p2, v4, v2

    if-eqz p2, :cond_1

    add-int/lit8 p2, p1, 0x1

    mul-int/lit8 p2, p2, 0x40

    invoke-virtual {p0, p2, v4, v5}, Landroidx/databinding/c;->g(IJ)V

    iget-object p2, v1, Landroidx/databinding/c;->y:[J

    aput-wide v2, p2, p1

    goto :goto_3

    :catchall_0
    move-exception v0

    :goto_2
    move-object p1, v0

    goto :goto_4

    :cond_1
    :goto_3
    add-int/lit8 p1, p1, -0x1

    goto :goto_1

    :cond_2
    iget-wide p1, v1, Landroidx/databinding/c;->x:J

    cmp-long v0, p1, v2

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, p2}, Landroidx/databinding/c;->g(IJ)V

    iput-wide v2, v1, Landroidx/databinding/c;->x:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    monitor-exit p0

    return-void

    :catchall_1
    move-exception v0

    move-object v1, p0

    goto :goto_2

    :goto_4
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final clone()Ljava/lang/Object;
    .locals 6

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/databinding/c;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v2, 0x0

    :try_start_1
    iput-wide v2, v1, Landroidx/databinding/c;->x:J

    iput-object v0, v1, Landroidx/databinding/c;->y:[J

    const/4 v0, 0x0

    iput v0, v1, Landroidx/databinding/c;->z:I

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Landroidx/databinding/c;->w:Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/databinding/c;->w:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    :goto_0
    if-ge v0, v2, :cond_1

    invoke-virtual {p0, v0}, Landroidx/databinding/c;->b(I)Z

    move-result v3

    if-nez v3, :cond_0

    iget-object v3, v1, Landroidx/databinding/c;->w:Ljava/util/ArrayList;

    iget-object v4, p0, Landroidx/databinding/c;->w:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_3

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_0
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_1
    move-exception v1

    move-object v5, v1

    move-object v1, v0

    move-object v0, v5

    :goto_2
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_1
    monitor-exit p0

    return-object v1

    :goto_3
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method public final d(Landroidx/databinding/a;IIIJ)V
    .locals 6

    const-wide/16 v0, 0x1

    :goto_0
    if-ge p3, p4, :cond_1

    and-long v2, p5, v0

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    iget-object v2, p0, Landroidx/databinding/c;->w:Ljava/util/ArrayList;

    invoke-virtual {v2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Landroidx/databinding/c;->E:Landroidx/databinding/b;

    invoke-virtual {v3, v2, p1, p2}, Landroidx/databinding/b;->a(Ljava/lang/Object;Landroidx/databinding/a;I)V

    :cond_0
    const/4 v2, 0x1

    shl-long/2addr v0, v2

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final e(Landroidx/databinding/a;II)V
    .locals 7

    const/16 v1, 0x40

    if-gez p3, :cond_0

    iget-object v2, p0, Landroidx/databinding/c;->w:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v4

    const/4 v3, 0x0

    iget-wide v5, p0, Landroidx/databinding/c;->x:J

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    invoke-virtual/range {v0 .. v6}, Landroidx/databinding/c;->d(Landroidx/databinding/a;IIIJ)V

    return-void

    :cond_0
    iget-object v2, p0, Landroidx/databinding/c;->y:[J

    aget-wide v5, v2, p3

    add-int/lit8 v2, p3, 0x1

    mul-int/lit8 v3, v2, 0x40

    iget-object v1, p0, Landroidx/databinding/c;->w:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v2, v3, 0x40

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v4

    add-int/lit8 v1, p3, -0x1

    invoke-virtual {p0, p1, p2, v1}, Landroidx/databinding/c;->e(Landroidx/databinding/a;II)V

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    invoke-virtual/range {v0 .. v6}, Landroidx/databinding/c;->d(Landroidx/databinding/a;IIIJ)V

    return-void
.end method

.method public final declared-synchronized f(Ljava/lang/Object;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget v0, p0, Landroidx/databinding/c;->z:I

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/databinding/c;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object v0, p0, Landroidx/databinding/c;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_1

    invoke-virtual {p0, p1}, Landroidx/databinding/c;->h(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final g(IJ)V
    .locals 7

    add-int/lit8 v0, p1, 0x3f

    const-wide/high16 v1, -0x8000000000000000L

    :goto_0
    if-lt v0, p1, :cond_1

    and-long v3, p2, v1

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-eqz v3, :cond_0

    iget-object v3, p0, Landroidx/databinding/c;->w:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_0
    const/4 v3, 0x1

    ushr-long/2addr v1, v3

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final h(I)V
    .locals 8

    const-wide/16 v0, 0x1

    const/16 v2, 0x40

    if-ge p1, v2, :cond_0

    shl-long/2addr v0, p1

    iget-wide v2, p0, Landroidx/databinding/c;->x:J

    or-long/2addr v0, v2

    iput-wide v0, p0, Landroidx/databinding/c;->x:J

    return-void

    :cond_0
    div-int/lit8 v3, p1, 0x40

    add-int/lit8 v3, v3, -0x1

    iget-object v4, p0, Landroidx/databinding/c;->y:[J

    if-nez v4, :cond_1

    iget-object v4, p0, Landroidx/databinding/c;->w:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    div-int/2addr v4, v2

    new-array v4, v4, [J

    iput-object v4, p0, Landroidx/databinding/c;->y:[J

    goto :goto_0

    :cond_1
    array-length v4, v4

    if-gt v4, v3, :cond_2

    iget-object v4, p0, Landroidx/databinding/c;->w:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    div-int/2addr v4, v2

    new-array v4, v4, [J

    iget-object v5, p0, Landroidx/databinding/c;->y:[J

    array-length v6, v5

    const/4 v7, 0x0

    invoke-static {v5, v7, v4, v7, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v4, p0, Landroidx/databinding/c;->y:[J

    :cond_2
    :goto_0
    rem-int/2addr p1, v2

    shl-long/2addr v0, p1

    iget-object p1, p0, Landroidx/databinding/c;->y:[J

    aget-wide v4, p1, v3

    or-long/2addr v0, v4

    aput-wide v0, p1, v3

    return-void
.end method
