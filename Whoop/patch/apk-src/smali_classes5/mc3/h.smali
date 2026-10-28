.class public Lmc3/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic E:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic F:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final synthetic G:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field public static final synthetic y:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic z:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;


# instance fields
.field private volatile synthetic _availablePermits$volatile:I

.field private volatile synthetic deqIdx$volatile:J

.field private volatile synthetic enqIdx$volatile:J

.field private volatile synthetic head$volatile:Ljava/lang/Object;

.field private volatile synthetic tail$volatile:Ljava/lang/Object;

.field public final w:I

.field public final x:Lbc3/l;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "head$volatile"

    const-class v1, Lmc3/h;

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lmc3/h;->y:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "deqIdx$volatile"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, Lmc3/h;->z:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "tail$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lmc3/h;->E:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "enqIdx$volatile"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, Lmc3/h;->F:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "_availablePermits$volatile"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lmc3/h;->G:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lmc3/h;->w:I

    if-lez p1, :cond_1

    if-ltz p2, :cond_0

    if-gt p2, p1, :cond_0

    new-instance v0, Lmc3/k;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const-wide/16 v3, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lmc3/k;-><init>(JLmc3/k;I)V

    iput-object v0, p0, Lmc3/h;->head$volatile:Ljava/lang/Object;

    iput-object v0, p0, Lmc3/h;->tail$volatile:Ljava/lang/Object;

    sub-int/2addr p1, p2

    iput p1, p0, Lmc3/h;->_availablePermits$volatile:I

    new-instance p1, Lbc3/l;

    const/4 p2, 0x6

    invoke-direct {p1, p0, p2}, Lbc3/l;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lmc3/h;->x:Lbc3/l;

    return-void

    :cond_0
    const-string p2, "The number of acquired permits should be in 0.."

    invoke-static {p1, p2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    const-string p2, "Semaphore should have at least 1 permit, but had "

    invoke-static {p1, p2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final a(Ls83/c;)Ljava/lang/Object;
    .locals 4

    :cond_0
    sget-object v0, Lmc3/h;->G:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndDecrement(Ljava/lang/Object;)I

    move-result v1

    iget v2, p0, Lmc3/h;->w:I

    if-gt v1, v2, :cond_0

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    if-lez v1, :cond_1

    goto :goto_2

    :cond_1
    invoke-static {p1}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->t(Lq83/d;)Lbc3/m;

    move-result-object p1

    :try_start_0
    invoke-virtual {p0, p1}, Lmc3/h;->c(Lbc3/o2;)Z

    move-result v1

    if-nez v1, :cond_4

    :cond_2
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndDecrement(Ljava/lang/Object;)I

    move-result v1

    if-gt v1, v2, :cond_2

    if-lez v1, :cond_3

    iget-object v0, p0, Lmc3/h;->x:Lbc3/l;

    invoke-virtual {p1, v3, v0}, Lbc3/m;->g(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0, p1}, Lmc3/h;->c(Lbc3/o2;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_2

    :cond_4
    :goto_0
    invoke-virtual {p1}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_5

    goto :goto_1

    :cond_5
    move-object p1, v3

    :goto_1
    if-ne p1, v0, :cond_6

    return-object p1

    :cond_6
    :goto_2
    return-object v3

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Lbc3/m;->A()V

    throw v0
.end method

.method public final c(Lbc3/o2;)Z
    .locals 14

    sget-object v0, Lmc3/h;->E:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lmc3/k;

    sget-object v2, Lmc3/h;->F:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v2

    sget-object v4, Lmc3/f;->w:Lmc3/f;

    sget v5, Lmc3/j;->f:I

    int-to-long v5, v5

    div-long v5, v2, v5

    :goto_0
    invoke-static {v1, v5, v6, v4}, Lhc3/b;->b(Lhc3/v;JLc93/m;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, Lhc3/b;->d(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4

    invoke-static {v7}, Lhc3/b;->c(Ljava/lang/Object;)Lhc3/v;

    move-result-object v8

    :cond_0
    :goto_1
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lhc3/v;

    iget-wide v10, v9, Lhc3/v;->y:J

    iget-wide v12, v8, Lhc3/v;->y:J

    cmp-long v10, v10, v12

    if-ltz v10, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v8}, Lhc3/v;->j()Z

    move-result v10

    if-nez v10, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0, p0, v9, v8}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-virtual {v9}, Lhc3/v;->f()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v9}, Lhc3/c;->e()V

    goto :goto_2

    :cond_3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-eq v10, v9, :cond_2

    invoke-virtual {v8}, Lhc3/v;->f()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-virtual {v8}, Lhc3/c;->e()V

    goto :goto_1

    :cond_4
    :goto_2
    invoke-static {v7}, Lhc3/b;->c(Ljava/lang/Object;)Lhc3/v;

    move-result-object v0

    check-cast v0, Lmc3/k;

    iget-object v1, v0, Lmc3/k;->E:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    sget v4, Lmc3/j;->f:I

    int-to-long v4, v4

    rem-long/2addr v2, v4

    long-to-int v2, v2

    :cond_5
    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->compareAndSet(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_6

    invoke-interface {p1, v0, v2}, Lbc3/o2;->b(Lhc3/v;I)V

    return v4

    :cond_6
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_5

    sget-object v3, Lmc3/j;->b:Lhc3/x;

    sget-object v5, Lmc3/j;->c:Lhc3/x;

    :cond_7
    invoke-virtual {v1, v2, v3, v5}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->compareAndSet(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    check-cast p1, Lbc3/k;

    iget-object v0, p0, Lmc3/h;->x:Lbc3/l;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    invoke-interface {p1, v1, v0}, Lbc3/k;->g(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V

    return v4

    :cond_8
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, v3, :cond_7

    const/4 p1, 0x0

    return p1
.end method

.method public final d()V
    .locals 14

    :cond_0
    sget-object v0, Lmc3/h;->G:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndIncrement(Ljava/lang/Object;)I

    move-result v1

    iget v2, p0, Lmc3/h;->w:I

    if-ge v1, v2, :cond_11

    if-ltz v1, :cond_1

    goto/16 :goto_7

    :cond_1
    sget-object v0, Lmc3/h;->y:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lmc3/k;

    sget-object v2, Lmc3/h;->z:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v2

    sget v4, Lmc3/j;->f:I

    int-to-long v4, v4

    div-long v4, v2, v4

    sget-object v6, Lmc3/g;->w:Lmc3/g;

    :goto_0
    invoke-static {v1, v4, v5, v6}, Lhc3/b;->b(Lhc3/v;JLc93/m;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, Lhc3/b;->d(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    invoke-static {v7}, Lhc3/b;->c(Ljava/lang/Object;)Lhc3/v;

    move-result-object v8

    :cond_2
    :goto_1
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lhc3/v;

    iget-wide v10, v9, Lhc3/v;->y:J

    iget-wide v12, v8, Lhc3/v;->y:J

    cmp-long v10, v10, v12

    if-ltz v10, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v8}, Lhc3/v;->j()Z

    move-result v10

    if-nez v10, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {v0, p0, v9, v8}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-virtual {v9}, Lhc3/v;->f()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {v9}, Lhc3/c;->e()V

    goto :goto_2

    :cond_5
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-eq v10, v9, :cond_4

    invoke-virtual {v8}, Lhc3/v;->f()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-virtual {v8}, Lhc3/c;->e()V

    goto :goto_1

    :cond_6
    :goto_2
    invoke-static {v7}, Lhc3/b;->c(Ljava/lang/Object;)Lhc3/v;

    move-result-object v0

    check-cast v0, Lmc3/k;

    iget-object v1, v0, Lmc3/k;->E:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v0}, Lhc3/c;->b()V

    iget-wide v6, v0, Lhc3/v;->y:J

    cmp-long v0, v6, v4

    const/4 v4, 0x0

    if-lez v0, :cond_7

    goto :goto_6

    :cond_7
    sget v0, Lmc3/j;->f:I

    int-to-long v5, v0

    rem-long/2addr v2, v5

    long-to-int v0, v2

    sget-object v2, Lmc3/j;->b:Lhc3/x;

    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->getAndSet(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    if-nez v2, :cond_c

    sget v2, Lmc3/j;->a:I

    move v5, v4

    :goto_3
    if-ge v5, v2, :cond_9

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Lmc3/j;->c:Lhc3/x;

    if-ne v6, v7, :cond_8

    :goto_4
    move v4, v3

    goto :goto_6

    :cond_8
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_9
    sget-object v5, Lmc3/j;->b:Lhc3/x;

    sget-object v6, Lmc3/j;->d:Lhc3/x;

    :cond_a
    invoke-virtual {v1, v0, v5, v6}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->compareAndSet(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    move v4, v3

    goto :goto_5

    :cond_b
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v5, :cond_a

    :goto_5
    xor-int/2addr v4, v3

    goto :goto_6

    :cond_c
    sget-object v0, Lmc3/j;->e:Lhc3/x;

    if-ne v2, v0, :cond_d

    goto :goto_6

    :cond_d
    instance-of v0, v2, Lbc3/k;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-eqz v0, :cond_e

    check-cast v2, Lbc3/k;

    iget-object v0, p0, Lmc3/h;->x:Lbc3/l;

    invoke-interface {v2, v1, v0}, Lbc3/k;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lhc3/x;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-interface {v2, v0}, Lbc3/k;->n(Ljava/lang/Object;)V

    goto :goto_4

    :cond_e
    instance-of v0, v2, Llc3/g;

    if-eqz v0, :cond_10

    check-cast v2, Llc3/g;

    check-cast v2, Llc3/f;

    invoke-virtual {v2, p0, v1}, Llc3/f;->g(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_f

    goto :goto_4

    :cond_f
    :goto_6
    if-eqz v4, :cond_0

    :goto_7
    return-void

    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "unexpected: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    :goto_8
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    if-le v1, v2, :cond_12

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    if-nez v1, :cond_12

    goto :goto_8

    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "The number of released permits cannot be greater than "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
