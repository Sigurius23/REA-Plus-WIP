.class public final Le83/e;
.super Le83/c;
.source "SourceFile"


# static fields
.field public static final E:[Le83/d;

.field public static final z:[Le83/d;


# instance fields
.field public final x:Ljava/util/concurrent/atomic/AtomicReference;

.field public y:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v1, v0, [Le83/d;

    sput-object v1, Le83/e;->z:[Le83/d;

    new-array v0, v0, [Le83/d;

    sput-object v0, Le83/e;->E:[Le83/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Le83/e;->E:[Le83/d;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Le83/e;->x:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final b(Leg3/b;)V
    .locals 2

    iget-object v0, p0, Le83/e;->x:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Le83/e;->z:[Le83/d;

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, Leg3/b;->cancel()V

    return-void

    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, Leg3/b;->request(J)V

    return-void
.end method

.method public final c(Ll73/b;)V
    .locals 6

    new-instance v0, Le83/d;

    invoke-direct {v0, p1, p0}, Le83/d;-><init>(Ll73/b;Le83/e;)V

    invoke-interface {p1, v0}, Leg3/a;->b(Leg3/b;)V

    :goto_0
    iget-object v1, p0, Le83/e;->x:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Le83/d;

    sget-object v3, Le83/e;->z:[Le83/d;

    if-ne v2, v3, :cond_1

    iget-object v0, p0, Le83/e;->y:Ljava/lang/Throwable;

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Leg3/a;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    invoke-interface {p1}, Leg3/a;->onComplete()V

    return-void

    :cond_1
    array-length v3, v2

    add-int/lit8 v4, v3, 0x1

    new-array v4, v4, [Le83/d;

    const/4 v5, 0x0

    invoke-static {v2, v5, v4, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aput-object v0, v4, v3

    :cond_2
    invoke-virtual {v1, v2, v4}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v1

    const-wide/high16 v3, -0x8000000000000000L

    cmp-long p1, v1, v3

    if-nez p1, :cond_3

    invoke-virtual {p0, v0}, Le83/e;->d(Le83/d;)V

    :cond_3
    return-void

    :cond_4
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v2, :cond_2

    goto :goto_0
.end method

.method public final d(Le83/d;)V
    .locals 7

    :cond_0
    iget-object v0, p0, Le83/e;->x:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Le83/d;

    sget-object v2, Le83/e;->z:[Le83/d;

    if-eq v1, v2, :cond_6

    sget-object v2, Le83/e;->E:[Le83/d;

    if-ne v1, v2, :cond_1

    goto :goto_3

    :cond_1
    array-length v3, v1

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_3

    aget-object v6, v1, v5

    if-ne v6, p1, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    const/4 v5, -0x1

    :goto_1
    if-gez v5, :cond_4

    goto :goto_3

    :cond_4
    const/4 v6, 0x1

    if-ne v3, v6, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 v2, v3, -0x1

    new-array v2, v2, [Le83/d;

    invoke-static {v1, v4, v2, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v4, v5, 0x1

    sub-int/2addr v3, v5

    sub-int/2addr v3, v6

    invoke-static {v1, v4, v2, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_2
    invoke-static {v0, v1, v2}, Ld13/a;->w(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_6
    :goto_3
    return-void
.end method

.method public final onComplete()V
    .locals 8

    iget-object v0, p0, Le83/e;->x:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Le83/e;->z:[Le83/d;

    if-ne v1, v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le83/d;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v4

    const-wide/high16 v6, -0x8000000000000000L

    cmp-long v4, v4, v6

    if-eqz v4, :cond_1

    iget-object v3, v3, Le83/d;->w:Ll73/b;

    invoke-interface {v3}, Leg3/a;->onComplete()V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 8

    const-string v0, "onError called with null. Null values are generally not allowed in 2.x operators and sources."

    invoke-static {p1, v0}, Lr73/a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le83/e;->x:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Le83/e;->z:[Le83/d;

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iput-object p1, p0, Le83/e;->y:Ljava/lang/Throwable;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le83/d;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v4

    const-wide/high16 v6, -0x8000000000000000L

    cmp-long v4, v4, v6

    if-eqz v4, :cond_1

    iget-object v3, v3, Le83/d;->w:Ll73/b;

    invoke-interface {v3, p1}, Leg3/a;->onError(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_1
    invoke-static {p1}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 14

    const-string v0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources."

    invoke-static {p1, v0}, Lr73/a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le83/e;->x:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le83/d;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_6

    aget-object v3, v0, v2

    iget-object v4, v3, Le83/d;->w:Ll73/b;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v5

    const-wide/high16 v7, -0x8000000000000000L

    cmp-long v9, v5, v7

    if-nez v9, :cond_0

    goto :goto_1

    :cond_0
    const-wide/16 v9, 0x0

    cmp-long v5, v5, v9

    if-eqz v5, :cond_5

    invoke-interface {v4, p1}, Leg3/a;->onNext(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v4

    cmp-long v6, v4, v7

    if-nez v6, :cond_2

    goto :goto_1

    :cond_2
    const-wide v11, 0x7fffffffffffffffL

    cmp-long v6, v4, v11

    if-nez v6, :cond_3

    goto :goto_1

    :cond_3
    const-wide/16 v11, 0x1

    sub-long v11, v4, v11

    cmp-long v6, v11, v9

    if-gez v6, :cond_4

    new-instance v6, Ljava/lang/IllegalStateException;

    const-string v13, "More produced than requested: "

    invoke-static {v11, v12, v13}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v6, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v6}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    move-wide v11, v9

    :cond_4
    invoke-virtual {v3, v4, v5, v11, v12}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_5
    invoke-virtual {v3}, Le83/d;->cancel()V

    new-instance v3, Lio/reactivex/exceptions/MissingBackpressureException;

    const-string v5, "Could not emit value due to lack of requests"

    invoke-direct {v3, v5}, Lio/reactivex/exceptions/MissingBackpressureException;-><init>(Ljava/lang/String;)V

    invoke-interface {v4, v3}, Leg3/a;->onError(Ljava/lang/Throwable;)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_6
    return-void
.end method
