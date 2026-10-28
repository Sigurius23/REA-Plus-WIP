.class public final Ld4/f;
.super Lhg3/i;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final h0(Ld4/g;Ld4/g;)V
    .locals 0

    iput-object p2, p1, Ld4/g;->b:Ld4/g;

    return-void
.end method

.method public final i0(Ld4/g;Ljava/lang/Thread;)V
    .locals 0

    iput-object p2, p1, Ld4/g;->a:Ljava/lang/Thread;

    return-void
.end method

.method public final w(Ld4/h;Ld4/d;Ld4/d;)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Ld4/h;->x:Ld4/d;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Ld4/h;->x:Ld4/d;

    const/4 p2, 0x1

    monitor-exit p1

    return p2

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    monitor-exit p1

    return p2

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public final x(Ld4/h;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Ld4/h;->w:Ljava/lang/Object;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Ld4/h;->w:Ljava/lang/Object;

    const/4 p2, 0x1

    monitor-exit p1

    return p2

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    monitor-exit p1

    return p2

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public final y(Ld4/h;Ld4/g;Ld4/g;)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Ld4/h;->y:Ld4/g;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Ld4/h;->y:Ld4/g;

    const/4 p2, 0x1

    monitor-exit p1

    return p2

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    monitor-exit p1

    return p2

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method
