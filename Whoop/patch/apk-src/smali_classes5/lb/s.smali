.class public final Llb/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Lc93/a;

.field public final c:Ljava/util/concurrent/locks/ReentrantLock;

.field public d:I

.field public e:Z

.field public final f:[Llb/h;

.field public final g:Lmc3/i;

.field public final h:Lm83/m;


# direct methods
.method public constructor <init>(ILc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Llb/s;->a:I

    iput-object p2, p0, Llb/s;->b:Lc93/a;

    new-instance p2, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p2}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p2, p0, Llb/s;->c:Ljava/util/concurrent/locks/ReentrantLock;

    new-array p2, p1, [Llb/h;

    iput-object p2, p0, Llb/s;->f:[Llb/h;

    invoke-static {p1}, Lmc3/j;->a(I)Lmc3/i;

    move-result-object p2

    iput-object p2, p0, Llb/s;->g:Lmc3/i;

    new-instance p2, Lm83/m;

    invoke-direct {p2, p1}, Lm83/m;-><init>(I)V

    iput-object p2, p0, Llb/s;->h:Lm83/m;

    return-void
.end method


# virtual methods
.method public final a(Ls83/c;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Llb/s;->h:Lm83/m;

    instance-of v1, p1, Llb/q;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Llb/q;

    iget v2, v1, Llb/q;->y:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Llb/q;->y:I

    goto :goto_0

    :cond_0
    new-instance v1, Llb/q;

    invoke-direct {v1, p0, p1}, Llb/q;-><init>(Llb/s;Ls83/c;)V

    :goto_0
    iget-object p1, v1, Llb/q;->w:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Llb/q;->y:I

    iget-object v4, p0, Llb/s;->g:Lmc3/i;

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v5, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v5, v1, Llb/q;->y:I

    invoke-virtual {v4, v1}, Lmc3/h;->a(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    return-object v2

    :cond_3
    :goto_1
    :try_start_0
    iget-object p1, p0, Llb/s;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-boolean v1, p0, Llb/s;->e:Z

    if-nez v1, :cond_6

    invoke-virtual {v0}, Lm83/m;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    iget v1, p0, Llb/s;->d:I

    iget v2, p0, Llb/s;->a:I

    if-lt v1, v2, :cond_4

    goto :goto_2

    :cond_4
    new-instance v1, Llb/h;

    iget-object v2, p0, Llb/s;->b:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltb/a;

    invoke-direct {v1, v2}, Llb/h;-><init>(Ltb/a;)V

    iget-object v2, p0, Llb/s;->f:[Llb/h;

    iget v3, p0, Llb/s;->d:I

    add-int/lit8 v5, v3, 0x1

    iput v5, p0, Llb/s;->d:I

    aput-object v1, v2, v3

    invoke-virtual {v0, v1}, Lm83/m;->addLast(Ljava/lang/Object;)V

    :cond_5
    :goto_2
    invoke-virtual {v0}, Lm83/m;->removeLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llb/h;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object v0

    :catchall_0
    move-exception p1

    goto :goto_4

    :catchall_1
    move-exception v0

    goto :goto_3

    :cond_6
    :try_start_3
    const-string v0, "Connection pool is closed"

    const/16 v1, 0x15

    invoke-static {v1, v0}, Lhg3/i;->l0(ILjava/lang/String;)V

    const/4 v0, 0x0

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_3
    :try_start_4
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_4
    invoke-virtual {v4}, Lmc3/h;->d()V

    throw p1
.end method

.method public final b(JLio/getstream/chat/android/client/b;Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p4, Llb/r;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Llb/r;

    iget v1, v0, Llb/r;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llb/r;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Llb/r;

    invoke-direct {v0, p0, p4}, Llb/r;-><init>(Llb/s;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Llb/r;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llb/r;->F:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-wide p1, v0, Llb/r;->w:J

    iget-object p3, v0, Llb/r;->y:Lkotlin/jvm/internal/g0;

    iget-object v2, v0, Llb/r;->x:Lc93/a;

    :try_start_0
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p4

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    :goto_1
    new-instance p4, Lkotlin/jvm/internal/g0;

    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    :try_start_1
    new-instance v2, Lg20/p;

    const/16 v5, 0x17

    invoke-direct {v2, p4, p0, v4, v5}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p3, v0, Llb/r;->x:Lc93/a;

    iput-object p4, v0, Llb/r;->y:Lkotlin/jvm/internal/g0;

    iput-wide p1, v0, Llb/r;->w:J

    iput v3, v0, Llb/r;->F:I

    invoke-static {p1, p2, v2, v0}, Lbc3/k2;->c(JLc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v2, p3

    move-object p3, p4

    :goto_2
    move-object p4, p3

    move-object p3, v2

    move-object v2, v0

    move-object v0, v4

    goto :goto_4

    :catchall_1
    move-exception v2

    move-object v6, v2

    move-object v2, p3

    move-object p3, p4

    move-object p4, v6

    :goto_3
    move-object v6, p4

    move-object p4, p3

    move-object p3, v2

    move-object v2, v0

    move-object v0, v6

    :goto_4
    :try_start_2
    instance-of v5, v0, Lkotlinx/coroutines/TimeoutCancellationException;

    if-eqz v5, :cond_4

    invoke-interface {p3}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_5

    :catchall_2
    move-exception p1

    goto :goto_6

    :cond_4
    if-nez v0, :cond_6

    iget-object p4, p4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz p4, :cond_5

    return-object p4

    :cond_5
    :goto_5
    move-object v0, v2

    goto :goto_1

    :cond_6
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :goto_6
    iget-object p2, p4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p2, Llb/h;

    if-eqz p2, :cond_7

    invoke-virtual {p0, p2}, Llb/s;->e(Llb/h;)V

    :cond_7
    throw p1
.end method

.method public final c()V
    .locals 5

    iget-object v0, p0, Llb/s;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Llb/s;->e:Z

    iget-object v1, p0, Llb/s;->f:[Llb/h;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Llb/h;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_0
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :goto_2
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v1
.end method

.method public final d(Ljava/lang/StringBuilder;)V
    .locals 12

    const-string v0, ", "

    iget-object v1, p0, Llb/s;->h:Lm83/m;

    iget-object v2, p0, Llb/s;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v3

    iget v4, v1, Lm83/m;->y:I

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    if-ge v6, v4, :cond_0

    invoke-virtual {v1, v6}, Lm83/m;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v3, v7}, Ln83/c;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_3

    :cond_0
    invoke-static {v3}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v6

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v3, 0x9

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " ("

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "capacity="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Llb/s;->a:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "permits="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Llb/s;->g:Lmc3/i;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lmc3/h;->G:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v4, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v3

    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queue=(size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Lm83/h;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v10, 0x0

    const/16 v11, 0x3f

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0xa

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llb/s;->f:[Llb/h;

    array-length v3, v1

    move v4, v5

    :goto_1
    if-ge v5, v3, :cond_3

    aget-object v6, v1, v5

    add-int/lit8 v4, v4, 0x1

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "\t\t["

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, "] - "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v6, :cond_1

    iget-object v8, v6, Llb/h;->w:Ltb/a;

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    goto :goto_2

    :cond_1
    const/4 v8, 0x0

    :goto_2
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-eqz v6, :cond_2

    invoke-virtual {v6, p1}, Llb/h;->k(Ljava/lang/StringBuilder;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :goto_3
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1
.end method

.method public final e(Llb/h;)V
    .locals 2

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llb/s;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    iget-object v1, p0, Llb/s;->h:Lm83/m;

    invoke-virtual {v1, p1}, Lm83/m;->addLast(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    iget-object p1, p0, Llb/s;->g:Lmc3/i;

    invoke-virtual {p1}, Lmc3/h;->d()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1
.end method
