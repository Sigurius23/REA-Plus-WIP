.class public final Lch3/e;
.super Lxg3/s;
.source "SourceFile"


# instance fields
.field public final E:Lch3/f;

.field public final F:I

.field public G:Z


# direct methods
.method public constructor <init>(Lch3/f;I)V
    .locals 0

    invoke-direct {p0}, Lxg3/s;-><init>()V

    iput-object p1, p0, Lch3/e;->E:Lch3/f;

    iput p2, p0, Lch3/e;->F:I

    iget p1, p1, Lch3/f;->z:I

    int-to-long p1, p1

    invoke-virtual {p0, p1, p2}, Lxg3/s;->e(J)V

    return-void
.end method


# virtual methods
.method public final onCompleted()V
    .locals 3

    iget-boolean v0, p0, Lch3/e;->G:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lch3/e;->G:Z

    const/4 v0, 0x0

    iget v1, p0, Lch3/e;->F:I

    iget-object v2, p0, Lch3/e;->E:Lch3/f;

    invoke-virtual {v2, v1, v0}, Lch3/f;->e(ILjava/lang/Object;)V

    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 5

    iget-boolean v0, p0, Lch3/e;->G:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljh3/a;->a(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lch3/e;->E:Lch3/f;

    iget-object v1, v0, Lch3/f;->J:Ljava/util/concurrent/atomic/AtomicReference;

    :goto_0
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Throwable;

    if-eqz v2, :cond_2

    instance-of v3, v2, Lrx/exceptions/CompositeException;

    if-eqz v3, :cond_1

    move-object v3, v2

    check-cast v3, Lrx/exceptions/CompositeException;

    new-instance v4, Ljava/util/ArrayList;

    iget-object v3, v3, Lrx/exceptions/CompositeException;->w:Ljava/util/List;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Lrx/exceptions/CompositeException;

    invoke-direct {v3, v4}, Lrx/exceptions/CompositeException;-><init>(Ljava/util/List;)V

    goto :goto_1

    :cond_1
    new-instance v3, Lrx/exceptions/CompositeException;

    filled-new-array {v2, p1}, [Ljava/lang/Throwable;

    move-result-object v4

    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-direct {v3, v4}, Lrx/exceptions/CompositeException;-><init>(Ljava/util/List;)V

    goto :goto_1

    :cond_2
    move-object v3, p1

    :cond_3
    :goto_1
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 p1, 0x1

    iput-boolean p1, p0, Lch3/e;->G:Z

    const/4 p1, 0x0

    iget v1, p0, Lch3/e;->F:I

    invoke-virtual {v0, v1, p1}, Lch3/f;->e(ILjava/lang/Object;)V

    return-void

    :cond_4
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4

    if-eq v4, v2, :cond_3

    goto :goto_0
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 2

    iget-boolean v0, p0, Lch3/e;->G:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    sget-object p1, Lch3/d;->b:Lch3/b;

    :cond_1
    iget v0, p0, Lch3/e;->F:I

    iget-object v1, p0, Lch3/e;->E:Lch3/f;

    invoke-virtual {v1, v0, p1}, Lch3/f;->e(ILjava/lang/Object;)V

    return-void
.end method
