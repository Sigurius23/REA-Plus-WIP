.class public final Lg83/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln73/b;
.implements Lb83/a;


# instance fields
.field public E:Lab/h0;

.field public F:Z

.field public volatile G:Z

.field public H:J

.field public final w:Ll73/d;

.field public final x:Lg83/b;

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Ll73/d;Lg83/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg83/a;->w:Ll73/d;

    iput-object p2, p0, Lg83/a;->x:Lg83/b;

    return-void
.end method


# virtual methods
.method public final a(JLjava/lang/Object;)V
    .locals 2

    iget-boolean v0, p0, Lg83/a;->G:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Lg83/a;->F:Z

    if-nez v0, :cond_5

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lg83/a;->G:Z

    if-eqz v0, :cond_1

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    iget-wide v0, p0, Lg83/a;->H:J

    cmp-long p1, v0, p1

    if-nez p1, :cond_2

    monitor-exit p0

    return-void

    :cond_2
    iget-boolean p1, p0, Lg83/a;->z:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, Lg83/a;->E:Lab/h0;

    if-nez p1, :cond_3

    new-instance p1, Lab/h0;

    const/4 p2, 0x2

    const/4 v0, 0x0

    invoke-direct {p1, p2, v0}, Lab/h0;-><init>(IB)V

    iput-object p1, p0, Lg83/a;->E:Lab/h0;

    :cond_3
    invoke-virtual {p1, p3}, Lab/h0;->f(Ljava/lang/Object;)V

    monitor-exit p0

    return-void

    :cond_4
    const/4 p1, 0x1

    iput-boolean p1, p0, Lg83/a;->y:Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean p1, p0, Lg83/a;->F:Z

    goto :goto_1

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_5
    :goto_1
    invoke-virtual {p0, p3}, Lg83/a;->test(Ljava/lang/Object;)Z

    return-void
.end method

.method public final dispose()V
    .locals 1

    iget-boolean v0, p0, Lg83/a;->G:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lg83/a;->G:Z

    iget-object v0, p0, Lg83/a;->x:Lg83/b;

    invoke-virtual {v0, p0}, Lg83/b;->e(Lg83/a;)V

    :cond_0
    return-void
.end method

.method public final isDisposed()Z
    .locals 1

    iget-boolean v0, p0, Lg83/a;->G:Z

    return v0
.end method

.method public final test(Ljava/lang/Object;)Z
    .locals 2

    iget-boolean v0, p0, Lg83/a;->G:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lg83/a;->w:Ll73/d;

    sget-object v1, Lb83/h;->w:Lb83/h;

    if-ne p1, v1, :cond_0

    invoke-interface {v0}, Ll73/d;->onComplete()V

    goto :goto_0

    :cond_0
    instance-of v1, p1, Lb83/f;

    if-eqz v1, :cond_1

    check-cast p1, Lb83/f;

    iget-object p1, p1, Lb83/f;->w:Ljava/lang/Throwable;

    invoke-interface {v0, p1}, Ll73/d;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    invoke-interface {v0, p1}, Ll73/d;->onNext(Ljava/lang/Object;)V

    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
