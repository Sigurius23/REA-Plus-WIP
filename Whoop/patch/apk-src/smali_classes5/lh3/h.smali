.class public final Llh3/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public volatile b:Llh3/g;

.field public c:Llh3/g;

.field public d:I

.field public volatile e:Z

.field public f:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Llh3/h;->a:I

    new-instance p1, Llh3/g;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Llh3/g;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Llh3/h;->c:Llh3/g;

    iput-object p1, p0, Llh3/h;->b:Llh3/g;

    return-void
.end method


# virtual methods
.method public final a(Llh3/f;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v2, v1, Llh3/f;->w:Lxg3/s;

    const/4 v4, 0x1

    :cond_1
    iget-object v5, v1, Llh3/f;->x:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v5

    iget-object v7, v1, Llh3/f;->z:Llh3/g;

    const-wide/16 v8, 0x0

    if-nez v7, :cond_2

    iget-object v7, v0, Llh3/h;->b:Llh3/g;

    :cond_2
    move-wide v10, v8

    :goto_0
    cmp-long v12, v10, v5

    const/4 v13, 0x0

    const/4 v14, 0x0

    if-eqz v12, :cond_8

    invoke-virtual {v2}, Lxg3/s;->a()Z

    move-result v15

    if-eqz v15, :cond_3

    iput-object v14, v1, Llh3/f;->z:Llh3/g;

    return-void

    :cond_3
    iget-boolean v15, v0, Llh3/h;->e:Z

    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v3, v16

    check-cast v3, Llh3/g;

    if-nez v3, :cond_4

    const/16 v16, 0x1

    goto :goto_1

    :cond_4
    move/from16 v16, v13

    :goto_1
    if-eqz v15, :cond_6

    if-eqz v16, :cond_6

    iput-object v14, v1, Llh3/f;->z:Llh3/g;

    iget-object v1, v0, Llh3/h;->f:Ljava/lang/Throwable;

    if-eqz v1, :cond_5

    invoke-interface {v2, v1}, Lxg3/h;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_5
    invoke-interface {v2}, Lxg3/h;->onCompleted()V

    return-void

    :cond_6
    if-eqz v16, :cond_7

    goto :goto_2

    :cond_7
    iget-object v7, v3, Llh3/g;->w:Ljava/lang/Object;

    invoke-interface {v2, v7}, Lxg3/h;->onNext(Ljava/lang/Object;)V

    const-wide/16 v12, 0x1

    add-long/2addr v10, v12

    move-object v7, v3

    goto :goto_0

    :cond_8
    :goto_2
    if-nez v12, :cond_c

    invoke-virtual {v2}, Lxg3/s;->a()Z

    move-result v3

    if-eqz v3, :cond_9

    iput-object v14, v1, Llh3/f;->z:Llh3/g;

    return-void

    :cond_9
    iget-boolean v3, v0, Llh3/h;->e:Z

    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_a

    const/4 v13, 0x1

    :cond_a
    if-eqz v3, :cond_c

    if-eqz v13, :cond_c

    iput-object v14, v1, Llh3/f;->z:Llh3/g;

    iget-object v1, v0, Llh3/h;->f:Ljava/lang/Throwable;

    if-eqz v1, :cond_b

    invoke-interface {v2, v1}, Lxg3/h;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_b
    invoke-interface {v2}, Lxg3/h;->onCompleted()V

    return-void

    :cond_c
    cmp-long v3, v10, v8

    if-eqz v3, :cond_d

    const-wide v8, 0x7fffffffffffffffL

    cmp-long v3, v5, v8

    if-eqz v3, :cond_d

    iget-object v3, v1, Llh3/f;->x:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v3, v10, v11}, Lch3/d;->d(Ljava/util/concurrent/atomic/AtomicLong;J)J

    :cond_d
    iput-object v7, v1, Llh3/f;->z:Llh3/g;

    neg-int v3, v4

    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v4

    if-nez v4, :cond_1

    :goto_3
    return-void
.end method
