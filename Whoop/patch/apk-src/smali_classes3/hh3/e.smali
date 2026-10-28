.class public final Lhh3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Queue;


# static fields
.field public static final I:I

.field public static final J:Ljava/lang/Object;


# instance fields
.field public E:Ljava/util/concurrent/atomic/AtomicReferenceArray;

.field public final F:I

.field public G:Ljava/util/concurrent/atomic/AtomicReferenceArray;

.field public final H:Ljava/util/concurrent/atomic/AtomicLong;

.field public final w:Ljava/util/concurrent/atomic/AtomicLong;

.field public final x:I

.field public y:J

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "jctools.spsc.max.lookahead.step"

    const/16 v1, 0x1000

    invoke-static {v0, v1}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sput v0, Lhh3/e;->I:I

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lhh3/e;->J:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p1}, Ldt/b;->M(I)I

    move-result p1

    add-int/lit8 v0, p1, -0x1

    new-instance v1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v1, p0, Lhh3/e;->w:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance v2, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v2, p0, Lhh3/e;->H:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance v2, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    add-int/lit8 v3, p1, 0x1

    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>(I)V

    iput-object v2, p0, Lhh3/e;->E:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    iput v0, p0, Lhh3/e;->z:I

    div-int/lit8 v3, p1, 0x4

    sget v4, Lhh3/e;->I:I

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    iput v3, p0, Lhh3/e;->x:I

    iput-object v2, p0, Lhh3/e;->G:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    iput v0, p0, Lhh3/e;->F:I

    add-int/lit8 p1, p1, -0x2

    int-to-long v2, p1

    iput-wide v2, p0, Lhh3/e;->y:J

    const-wide/16 v2, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->lazySet(J)V

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final clear()V
    .locals 1

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lhh3/e;->poll()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lhh3/e;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final element()Ljava/lang/Object;
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final isEmpty()Z
    .locals 4

    iget-object v0, p0, Lhh3/e;->w:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    iget-object v2, p0, Lhh3/e;->H:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final offer(Ljava/lang/Object;)Z
    .locals 14

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lhh3/e;->E:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    iget-object v1, p0, Lhh3/e;->w:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v2

    long-to-int v4, v2

    iget v5, p0, Lhh3/e;->z:I

    and-int/2addr v4, v5

    iget-wide v6, p0, Lhh3/e;->y:J

    cmp-long v6, v2, v6

    const-wide/16 v7, 0x1

    const/4 v9, 0x1

    if-gez v6, :cond_0

    add-long/2addr v2, v7

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->lazySet(J)V

    invoke-virtual {v0, v4, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->lazySet(ILjava/lang/Object;)V

    return v9

    :cond_0
    iget v6, p0, Lhh3/e;->x:I

    int-to-long v10, v6

    add-long/2addr v10, v2

    long-to-int v6, v10

    and-int/2addr v6, v5

    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_1

    sub-long/2addr v10, v7

    iput-wide v10, p0, Lhh3/e;->y:J

    add-long/2addr v2, v7

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->lazySet(J)V

    invoke-virtual {v0, v4, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->lazySet(ILjava/lang/Object;)V

    return v9

    :cond_1
    add-long v10, v2, v7

    long-to-int v6, v10

    and-int/2addr v6, v5

    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-virtual {v1, v10, v11}, Ljava/util/concurrent/atomic/AtomicLong;->lazySet(J)V

    invoke-virtual {v0, v4, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->lazySet(ILjava/lang/Object;)V

    return v9

    :cond_2
    int-to-long v5, v5

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v12

    new-instance v13, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-direct {v13, v12}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>(I)V

    iput-object v13, p0, Lhh3/e;->E:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    add-long/2addr v2, v5

    sub-long/2addr v2, v7

    iput-wide v2, p0, Lhh3/e;->y:J

    invoke-virtual {v1, v10, v11}, Ljava/util/concurrent/atomic/AtomicLong;->lazySet(J)V

    invoke-virtual {v13, v4, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->lazySet(ILjava/lang/Object;)V

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result p1

    sub-int/2addr p1, v9

    invoke-virtual {v0, p1, v13}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->lazySet(ILjava/lang/Object;)V

    sget-object p1, Lhh3/e;->J:Ljava/lang/Object;

    invoke-virtual {v0, v4, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->lazySet(ILjava/lang/Object;)V

    return v9
.end method

.method public final peek()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lhh3/e;->G:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    iget-object v1, p0, Lhh3/e;->H:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v1

    iget v3, p0, Lhh3/e;->F:I

    long-to-int v1, v1

    and-int/2addr v1, v3

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lhh3/e;->J:Ljava/lang/Object;

    if-ne v2, v3, :cond_0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    iput-object v0, p0, Lhh3/e;->G:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    return-object v2
.end method

.method public final poll()Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lhh3/e;->G:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    iget-object v1, p0, Lhh3/e;->H:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v2

    iget v4, p0, Lhh3/e;->F:I

    long-to-int v5, v2

    and-int/2addr v4, v5

    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lhh3/e;->J:Ljava/lang/Object;

    const/4 v7, 0x1

    if-ne v5, v6, :cond_0

    move v6, v7

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    :goto_0
    const-wide/16 v8, 0x1

    const/4 v10, 0x0

    if-eqz v5, :cond_1

    if-nez v6, :cond_1

    add-long/2addr v2, v8

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->lazySet(J)V

    invoke-virtual {v0, v4, v10}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->lazySet(ILjava/lang/Object;)V

    return-object v5

    :cond_1
    if-eqz v6, :cond_3

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v5

    sub-int/2addr v5, v7

    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    iput-object v0, p0, Lhh3/e;->G:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    add-long/2addr v2, v8

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->lazySet(J)V

    invoke-virtual {v0, v4, v10}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->lazySet(ILjava/lang/Object;)V

    return-object v5

    :cond_3
    :goto_1
    return-object v10
.end method

.method public final remove()Ljava/lang/Object;
    .locals 1

    .line 2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final size()I
    .locals 7

    iget-object v0, p0, Lhh3/e;->H:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v1

    :goto_0
    iget-object v3, p0, Lhh3/e;->w:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v3

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v5

    cmp-long v1, v1, v5

    if-nez v1, :cond_0

    sub-long/2addr v3, v5

    long-to-int v0, v3

    return v0

    :cond_0
    move-wide v1, v5

    goto :goto_0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 0

    .line 2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method
