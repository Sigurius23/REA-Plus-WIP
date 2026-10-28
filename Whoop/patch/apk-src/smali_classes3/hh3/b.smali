.class public final Lhh3/b;
.super Lhh3/a;
.source "SourceFile"


# static fields
.field public static final G:Ljava/lang/Integer;


# instance fields
.field public final E:Ljava/util/concurrent/atomic/AtomicLong;

.field public final F:I

.field public final y:Ljava/util/concurrent/atomic/AtomicLong;

.field public z:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "jctools.spsc.max.lookahead.step"

    const/16 v1, 0x1000

    invoke-static {v0, v1}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lhh3/b;->G:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0, p1}, Lhh3/a;-><init>(I)V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Lhh3/b;->y:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Lhh3/b;->E:Ljava/util/concurrent/atomic/AtomicLong;

    div-int/lit8 p1, p1, 0x4

    sget-object v0, Lhh3/b;->G:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lhh3/b;->F:I

    return-void
.end method


# virtual methods
.method public final isEmpty()Z
    .locals 4

    iget-object v0, p0, Lhh3/b;->y:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    iget-object v2, p0, Lhh3/b;->E:Ljava/util/concurrent/atomic/AtomicLong;

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

.method public final offer(Ljava/lang/Object;)Z
    .locals 9

    if-eqz p1, :cond_2

    iget-object v0, p0, Lhh3/b;->y:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v1

    long-to-int v3, v1

    iget v4, p0, Lhh3/a;->x:I

    and-int/2addr v3, v4

    iget-wide v5, p0, Lhh3/b;->z:J

    cmp-long v5, v1, v5

    iget-object v6, p0, Lhh3/a;->w:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    if-ltz v5, :cond_1

    iget v5, p0, Lhh3/b;->F:I

    int-to-long v7, v5

    add-long/2addr v7, v1

    long-to-int v5, v7

    and-int/2addr v4, v5

    invoke-virtual {v6, v4}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_0

    iput-wide v7, p0, Lhh3/b;->z:J

    goto :goto_0

    :cond_0
    invoke-virtual {v6, v3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    invoke-virtual {v6, v3, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->lazySet(ILjava/lang/Object;)V

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->lazySet(J)V

    const/4 p1, 0x1

    return p1

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null is not a valid element"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final peek()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lhh3/b;->E:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    long-to-int v0, v0

    iget v1, p0, Lhh3/a;->x:I

    and-int/2addr v0, v1

    iget-object v1, p0, Lhh3/a;->w:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final poll()Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lhh3/b;->E:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v1

    long-to-int v3, v1

    iget v4, p0, Lhh3/a;->x:I

    and-int/2addr v3, v4

    iget-object v4, p0, Lhh3/a;->w:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v4, v3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    const/4 v6, 0x0

    if-nez v5, :cond_0

    return-object v6

    :cond_0
    invoke-virtual {v4, v3, v6}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->lazySet(ILjava/lang/Object;)V

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->lazySet(J)V

    return-object v5
.end method

.method public final size()I
    .locals 7

    iget-object v0, p0, Lhh3/b;->E:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v1

    :goto_0
    iget-object v3, p0, Lhh3/b;->y:Ljava/util/concurrent/atomic/AtomicLong;

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
