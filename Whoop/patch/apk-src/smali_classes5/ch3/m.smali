.class public final Lch3/m;
.super Ljava/util/concurrent/atomic/AtomicLong;
.source "SourceFile"

# interfaces
.implements Lxg3/i;


# instance fields
.field public final w:Lxg3/s;

.field public final x:[Ljava/lang/Object;

.field public y:I


# direct methods
.method public constructor <init>(Lxg3/s;[Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lch3/m;->w:Lxg3/s;

    iput-object p2, p0, Lch3/m;->x:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final request(J)V
    .locals 10

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_a

    const-wide v3, 0x7fffffffffffffffL

    cmp-long v3, p1, v3

    iget-object v4, p0, Lch3/m;->x:[Ljava/lang/Object;

    iget-object v5, p0, Lch3/m;->w:Lxg3/s;

    if-nez v3, :cond_3

    invoke-static {p0, p1, p2}, Lch3/d;->b(Ljava/util/concurrent/atomic/AtomicLong;J)J

    move-result-wide p1

    cmp-long p1, p1, v0

    if-nez p1, :cond_9

    array-length p1, v4

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p1, :cond_1

    aget-object v0, v4, p2

    invoke-virtual {v5}, Lxg3/s;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {v5, v0}, Lxg3/h;->onNext(Ljava/lang/Object;)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v5}, Lxg3/s;->a()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v5}, Lxg3/h;->onCompleted()V

    return-void

    :cond_3
    if-eqz v2, :cond_9

    invoke-static {p0, p1, p2}, Lch3/d;->b(Ljava/util/concurrent/atomic/AtomicLong;J)J

    move-result-wide v2

    cmp-long v2, v2, v0

    if-nez v2, :cond_9

    array-length v2, v4

    iget v3, p0, Lch3/m;->y:I

    :cond_4
    move-wide v6, v0

    :cond_5
    :goto_1
    cmp-long v8, p1, v0

    if-eqz v8, :cond_8

    if-eq v3, v2, :cond_8

    invoke-virtual {v5}, Lxg3/s;->a()Z

    move-result v8

    if-eqz v8, :cond_6

    goto :goto_2

    :cond_6
    aget-object v8, v4, v3

    invoke-interface {v5, v8}, Lxg3/h;->onNext(Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    if-ne v3, v2, :cond_7

    invoke-virtual {v5}, Lxg3/s;->a()Z

    move-result p1

    if-nez p1, :cond_9

    invoke-interface {v5}, Lxg3/h;->onCompleted()V

    return-void

    :cond_7
    const-wide/16 v8, 0x1

    sub-long/2addr p1, v8

    sub-long/2addr v6, v8

    goto :goto_1

    :cond_8
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide p1

    add-long/2addr p1, v6

    cmp-long v8, p1, v0

    if-nez v8, :cond_5

    iput v3, p0, Lch3/m;->y:I

    invoke-virtual {p0, v6, v7}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    move-result-wide p1

    cmp-long v6, p1, v0

    if-nez v6, :cond_4

    :cond_9
    :goto_2
    return-void

    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "n >= 0 required but it was "

    invoke-static {p1, p2, v1}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
