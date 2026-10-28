.class public final Lv73/h;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Ll73/b;
.implements Leg3/b;


# instance fields
.field public volatile E:Z

.field public final F:Ljava/util/concurrent/atomic/AtomicLong;

.field public final G:Ljava/util/concurrent/atomic/AtomicReference;

.field public final w:Ll73/b;

.field public x:Ljava/lang/Object;

.field public volatile y:Z

.field public z:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Ll73/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Lv73/h;->F:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lv73/h;->G:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p1, p0, Lv73/h;->w:Ll73/b;

    return-void
.end method


# virtual methods
.method public final a(ZZLl73/b;Ljava/util/concurrent/atomic/AtomicReference;)Z
    .locals 3

    iget-boolean v0, p0, Lv73/h;->E:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p4, v1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    return v2

    :cond_0
    if-eqz p1, :cond_2

    iget-object p1, p0, Lv73/h;->z:Ljava/lang/Throwable;

    if-eqz p1, :cond_1

    invoke-virtual {p4, v1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    invoke-interface {p3, p1}, Leg3/a;->onError(Ljava/lang/Throwable;)V

    return v2

    :cond_1
    if-eqz p2, :cond_2

    invoke-interface {p3}, Leg3/a;->onComplete()V

    return v2

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Leg3/b;)V
    .locals 2

    iget-object v0, p0, Lv73/h;->x:Ljava/lang/Object;

    invoke-static {v0, p1}, La83/c;->c(Leg3/b;Leg3/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lv73/h;->x:Ljava/lang/Object;

    iget-object v0, p0, Lv73/h;->w:Ll73/b;

    invoke-interface {v0, p0}, Leg3/a;->b(Leg3/b;)V

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, Leg3/b;->request(J)V

    :cond_0
    return-void
.end method

.method public final c()V
    .locals 15

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_4

    :cond_0
    iget-object v0, p0, Lv73/h;->w:Ll73/b;

    iget-object v1, p0, Lv73/h;->F:Ljava/util/concurrent/atomic/AtomicLong;

    iget-object v2, p0, Lv73/h;->G:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v3, 0x1

    move v4, v3

    :cond_1
    const-wide/16 v5, 0x0

    move-wide v7, v5

    :goto_0
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v9

    cmp-long v9, v7, v9

    const/4 v10, 0x0

    if-eqz v9, :cond_5

    iget-boolean v9, p0, Lv73/h;->y:Z

    const/4 v11, 0x0

    invoke-virtual {v2, v11}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_2

    move v12, v3

    goto :goto_1

    :cond_2
    move v12, v10

    :goto_1
    invoke-virtual {p0, v9, v12, v0, v2}, Lv73/h;->a(ZZLl73/b;Ljava/util/concurrent/atomic/AtomicReference;)Z

    move-result v9

    if-eqz v9, :cond_3

    goto :goto_4

    :cond_3
    if-eqz v12, :cond_4

    goto :goto_2

    :cond_4
    invoke-interface {v0, v11}, Leg3/a;->onNext(Ljava/lang/Object;)V

    const-wide/16 v9, 0x1

    add-long/2addr v7, v9

    goto :goto_0

    :cond_5
    :goto_2
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v11

    cmp-long v9, v7, v11

    if-nez v9, :cond_7

    iget-boolean v9, p0, Lv73/h;->y:Z

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_6

    move v10, v3

    :cond_6
    invoke-virtual {p0, v9, v10, v0, v2}, Lv73/h;->a(ZZLl73/b;Ljava/util/concurrent/atomic/AtomicReference;)Z

    move-result v9

    if-eqz v9, :cond_7

    goto :goto_4

    :cond_7
    cmp-long v9, v7, v5

    if-eqz v9, :cond_b

    :cond_8
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v9

    const-wide v11, 0x7fffffffffffffffL

    cmp-long v11, v9, v11

    if-nez v11, :cond_9

    goto :goto_3

    :cond_9
    sub-long v11, v9, v7

    cmp-long v13, v11, v5

    if-gez v13, :cond_a

    new-instance v13, Ljava/lang/IllegalStateException;

    const-string v14, "More produced than requested: "

    invoke-static {v11, v12, v14}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v13, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v13}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    move-wide v11, v5

    :cond_a
    invoke-virtual {v1, v9, v10, v11, v12}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result v9

    if-eqz v9, :cond_8

    :cond_b
    :goto_3
    neg-int v4, v4

    invoke-virtual {p0, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v4

    if-nez v4, :cond_1

    :goto_4
    return-void
.end method

.method public final cancel()V
    .locals 2

    iget-boolean v0, p0, Lv73/h;->E:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lv73/h;->E:Z

    iget-object v0, p0, Lv73/h;->x:Ljava/lang/Object;

    invoke-interface {v0}, Leg3/b;->cancel()V

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lv73/h;->G:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final onComplete()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lv73/h;->y:Z

    invoke-virtual {p0}, Lv73/h;->c()V

    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, Lv73/h;->z:Ljava/lang/Throwable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lv73/h;->y:Z

    invoke-virtual {p0}, Lv73/h;->c()V

    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lv73/h;->G:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lv73/h;->c()V

    return-void
.end method

.method public final request(J)V
    .locals 1

    invoke-static {p1, p2}, La83/c;->b(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv73/h;->F:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, p1, p2}, Lhg3/i;->p(Ljava/util/concurrent/atomic/AtomicLong;J)V

    invoke-virtual {p0}, Lv73/h;->c()V

    :cond_0
    return-void
.end method
