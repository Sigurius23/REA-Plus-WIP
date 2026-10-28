.class public abstract Lib/a0;
.super Lib/j;
.source "SourceFile"


# direct methods
.method public static e(Lib/w;I)I
    .locals 2

    iget v0, p0, Lib/w;->a:I

    iget v1, p0, Lib/w;->b:I

    iget p0, p0, Lib/w;->c:I

    div-int/2addr v0, p0

    mul-int/2addr v0, p0

    sub-int/2addr p1, v1

    add-int/2addr p1, p0

    add-int/lit8 p1, p1, -0x1

    div-int/2addr p1, p0

    mul-int/2addr p1, p0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p0

    const/4 p1, 0x0

    invoke-static {p1, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method

.method public static f(Lib/w;II)I
    .locals 0

    sub-int/2addr p2, p1

    iget p0, p0, Lib/w;->b:I

    invoke-static {p2, p0}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0
.end method


# virtual methods
.method public b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final g(ZIIILjava/util/concurrent/Executor;Lib/k;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZIII",
            "Ljava/util/concurrent/Executor;",
            "Lib/k;",
            ")V"
        }
    .end annotation

    new-instance v0, Lib/v;

    invoke-direct {v0, p0, p1, p4, p6}, Lib/v;-><init>(Lib/a0;ZILib/k;)V

    new-instance p1, Lib/w;

    invoke-direct {p1, p2, p3, p4}, Lib/w;-><init>(III)V

    invoke-virtual {p0, p1, v0}, Lib/a0;->i(Lib/w;Lib/u;)V

    iget-object p1, v0, Lib/v;->a:Lib/i;

    iget-object p2, p1, Lib/i;->e:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    iput-object p5, p1, Lib/i;->f:Ljava/lang/Object;

    monitor-exit p2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final h(IIILjava/util/concurrent/Executor;Lib/k;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III",
            "Ljava/util/concurrent/Executor;",
            "Lib/k;",
            ")V"
        }
    .end annotation

    new-instance v0, Lib/y;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lib/y;-><init>(Lib/a0;IILjava/util/concurrent/Executor;Lib/k;)V

    if-nez p3, :cond_0

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-virtual {v0, p1}, Lib/y;->a(Ljava/util/List;)V

    return-void

    :cond_0
    new-instance p1, Lib/z;

    invoke-direct {p1, v3, p3}, Lib/z;-><init>(II)V

    invoke-virtual {p0, p1, v0}, Lib/a0;->j(Lib/z;Lib/x;)V

    return-void
.end method

.method public abstract i(Lib/w;Lib/u;)V
.end method

.method public abstract j(Lib/z;Lib/x;)V
.end method

.method public k()Lib/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lib/d;"
        }
    .end annotation

    new-instance v0, Lib/t;

    invoke-direct {v0, p0}, Lib/t;-><init>(Lib/a0;)V

    return-object v0
.end method
