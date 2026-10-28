.class public final Lch3/o;
.super Ljava/util/concurrent/atomic/AtomicLong;
.source "SourceFile"

# interfaces
.implements Lxg3/i;


# instance fields
.field public final w:Lxg3/s;

.field public final x:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Lxg3/s;Ljava/util/Iterator;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lch3/o;->w:Lxg3/s;

    iput-object p2, p0, Lch3/o;->x:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final request(J)V
    .locals 9

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    cmp-long v0, p1, v2

    iget-object v1, p0, Lch3/o;->x:Ljava/util/Iterator;

    iget-object v4, p0, Lch3/o;->w:Lxg3/s;

    const-wide/16 v5, 0x0

    if-nez v0, :cond_4

    invoke-virtual {p0, v5, v6, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_1
    invoke-virtual {v4}, Lxg3/s;->a()Z

    move-result p1

    if-eqz p1, :cond_2

    goto/16 :goto_1

    :cond_2
    :try_start_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    invoke-interface {v4, p1}, Lxg3/h;->onNext(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lxg3/s;->a()Z

    move-result p1

    if-eqz p1, :cond_3

    goto/16 :goto_1

    :cond_3
    :try_start_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez p1, :cond_1

    invoke-virtual {v4}, Lxg3/s;->a()Z

    move-result p1

    if-nez p1, :cond_b

    invoke-interface {v4}, Lxg3/h;->onCompleted()V

    goto :goto_1

    :catchall_0
    move-exception p1

    invoke-static {p1, v4}, Ldt/b;->W(Ljava/lang/Throwable;Lxg3/h;)V

    goto :goto_1

    :catchall_1
    move-exception p1

    invoke-static {p1, v4}, Ldt/b;->W(Ljava/lang/Throwable;Lxg3/h;)V

    goto :goto_1

    :cond_4
    cmp-long v0, p1, v5

    if-lez v0, :cond_b

    invoke-static {p0, p1, p2}, Lch3/d;->b(Ljava/util/concurrent/atomic/AtomicLong;J)J

    move-result-wide v2

    cmp-long v0, v2, v5

    if-nez v0, :cond_b

    :cond_5
    move-wide v2, v5

    :cond_6
    :goto_0
    cmp-long v0, v2, p1

    if-eqz v0, :cond_a

    invoke-virtual {v4}, Lxg3/s;->a()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_1

    :cond_7
    :try_start_2
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    invoke-interface {v4, v0}, Lxg3/h;->onNext(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lxg3/s;->a()Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_1

    :cond_8
    :try_start_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-nez v0, :cond_9

    invoke-virtual {v4}, Lxg3/s;->a()Z

    move-result p1

    if-nez p1, :cond_b

    invoke-interface {v4}, Lxg3/h;->onCompleted()V

    goto :goto_1

    :cond_9
    const-wide/16 v7, 0x1

    add-long/2addr v2, v7

    goto :goto_0

    :catchall_2
    move-exception p1

    invoke-static {p1, v4}, Ldt/b;->W(Ljava/lang/Throwable;Lxg3/h;)V

    goto :goto_1

    :catchall_3
    move-exception p1

    invoke-static {p1, v4}, Ldt/b;->W(Ljava/lang/Throwable;Lxg3/h;)V

    goto :goto_1

    :cond_a
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide p1

    cmp-long v0, v2, p1

    if-nez v0, :cond_6

    invoke-static {p0, v2, v3}, Lch3/d;->d(Ljava/util/concurrent/atomic/AtomicLong;J)J

    move-result-wide p1

    cmp-long v0, p1, v5

    if-nez v0, :cond_5

    :cond_b
    :goto_1
    return-void
.end method
