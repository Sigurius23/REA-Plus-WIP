.class public final Llh3/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxg3/h;


# instance fields
.field public E:Z

.field public final w:Lxg3/s;

.field public x:Z

.field public y:Z

.field public z:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lxg3/s;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Llh3/m;->x:Z

    iput-object p1, p0, Llh3/m;->w:Lxg3/s;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-boolean v0, p0, Llh3/m;->E:Z

    if-nez v0, :cond_2

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Llh3/m;->x:Z

    iget-boolean v0, p0, Llh3/m;->y:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Llh3/m;->z:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Llh3/m;->z:Ljava/util/ArrayList;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Llh3/m;->z:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit p0

    return-void

    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Llh3/m;->E:Z

    goto :goto_2

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_2
    :goto_2
    iget-object v0, p0, Llh3/m;->w:Lxg3/s;

    invoke-static {v0, p1}, Lch3/d;->a(Lxg3/h;Ljava/lang/Object;)Z

    return-void
.end method

.method public final onCompleted()V
    .locals 1

    iget-object v0, p0, Llh3/m;->w:Lxg3/s;

    invoke-interface {v0}, Lxg3/h;->onCompleted()V

    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Llh3/m;->w:Lxg3/s;

    invoke-interface {v0, p1}, Lxg3/h;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Llh3/m;->w:Lxg3/s;

    invoke-interface {v0, p1}, Lxg3/h;->onNext(Ljava/lang/Object;)V

    return-void
.end method
