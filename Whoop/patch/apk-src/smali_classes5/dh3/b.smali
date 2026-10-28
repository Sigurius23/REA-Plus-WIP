.class public final Ldh3/b;
.super Ljava/util/concurrent/atomic/AtomicBoolean;
.source "SourceFile"

# interfaces
.implements Lxg3/i;


# instance fields
.field public final w:Lxg3/s;

.field public final x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lxg3/s;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, Ldh3/b;->w:Lxg3/s;

    iput-object p2, p0, Ldh3/b;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final request(J)V
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-ltz p1, :cond_4

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-virtual {p0, p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Ldh3/b;->w:Lxg3/s;

    invoke-virtual {p1}, Lxg3/s;->a()Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    iget-object p2, p0, Ldh3/b;->x:Ljava/lang/Object;

    :try_start_0
    invoke-interface {p1, p2}, Lxg3/h;->onNext(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Lxg3/s;->a()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {p1}, Lxg3/h;->onCompleted()V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p1, p2}, Ldt/b;->X(Ljava/lang/Throwable;Lxg3/h;Ljava/lang/Object;)V

    :cond_3
    :goto_0
    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "n >= 0 required"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
