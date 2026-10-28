.class public final Lgh3/k;
.super Ljava/util/concurrent/atomic/AtomicBoolean;
.source "SourceFile"

# interfaces
.implements Lxg3/i;
.implements Lbh3/a;


# instance fields
.field public final w:Lxg3/s;

.field public final x:Ljava/lang/Object;

.field public final y:Lbh3/g;


# direct methods
.method public constructor <init>(Lxg3/s;Ljava/lang/Object;Lbh3/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, Lgh3/k;->w:Lxg3/s;

    iput-object p2, p0, Lgh3/k;->x:Ljava/lang/Object;

    iput-object p3, p0, Lgh3/k;->y:Lbh3/g;

    return-void
.end method


# virtual methods
.method public final call()V
    .locals 3

    iget-object v0, p0, Lgh3/k;->w:Lxg3/s;

    invoke-virtual {v0}, Lxg3/s;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lgh3/k;->x:Ljava/lang/Object;

    :try_start_0
    invoke-interface {v0, v1}, Lxg3/h;->onNext(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lxg3/s;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    :goto_0
    return-void

    :cond_1
    invoke-interface {v0}, Lxg3/h;->onCompleted()V

    return-void

    :catchall_0
    move-exception v2

    invoke-static {v2, v0, v1}, Ldt/b;->X(Ljava/lang/Throwable;Lxg3/h;Ljava/lang/Object;)V

    return-void
.end method

.method public final request(J)V
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_1

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-virtual {p0, p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lgh3/k;->y:Lbh3/g;

    invoke-interface {p1, p0}, Lbh3/g;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxg3/t;

    iget-object p2, p0, Lgh3/k;->w:Lxg3/s;

    invoke-virtual {p2, p1}, Lxg3/s;->c(Lxg3/t;)V

    :cond_0
    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "n >= 0 required but it was "

    invoke-static {p1, p2, v1}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ScalarAsyncProducer["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lgh3/k;->x:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
