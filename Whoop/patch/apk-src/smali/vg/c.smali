.class public final Lvg/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final synthetic F:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic G:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public volatile synthetic E:I

.field public final w:J

.field public final x:Lug/a;

.field public final y:Lmc3/i;

.field public volatile synthetic z:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-string v1, "z"

    const-class v2, Lvg/c;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lvg/c;->F:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "E"

    invoke-static {v2, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lvg/c;->G:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(JLug/a;)V
    .locals 1

    const-string v0, "clock"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lvg/c;->w:J

    iput-object p3, p0, Lvg/c;->x:Lug/a;

    const/4 p1, 0x1

    invoke-static {p1}, Lmc3/j;->a(I)Lmc3/i;

    move-result-object p1

    iput-object p1, p0, Lvg/c;->y:Lmc3/i;

    const/4 p1, 0x0

    iput-object p1, p0, Lvg/c;->z:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, Lvg/c;->E:I

    return-void
.end method


# virtual methods
.method public final b(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p2, Lvg/b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lvg/b;

    iget v1, v0, Lvg/b;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lvg/b;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lvg/b;

    invoke-direct {v0, p0, p2}, Lvg/b;-><init>(Lvg/c;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lvg/b;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lvg/b;->G:I

    const-string v3, "value is closed"

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lvg/b;->y:Lvg/h;

    iget-object v0, v0, Lvg/b;->x:Lmc3/e;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lvg/b;->z:I

    iget-object v2, v0, Lvg/b;->x:Lmc3/e;

    iget-object v5, v0, Lvg/b;->w:Ls83/i;

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, v2

    move v2, p1

    move-object p1, v5

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lvg/c;->y:Lmc3/i;

    move-object v2, p1

    check-cast v2, Ls83/i;

    iput-object v2, v0, Lvg/b;->w:Ls83/i;

    iput-object p2, v0, Lvg/b;->x:Lmc3/e;

    const/4 v2, 0x0

    iput v2, v0, Lvg/b;->z:I

    iput v5, v0, Lvg/b;->G:I

    invoke-virtual {p2, v0}, Lmc3/h;->a(Ls83/c;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    :try_start_1
    iget v5, p0, Lvg/c;->E:I

    if-nez v5, :cond_a

    iget-object v5, p0, Lvg/c;->z:Ljava/lang/Object;

    check-cast v5, Lvg/h;

    if-eqz v5, :cond_6

    iget-object v6, p0, Lvg/c;->x:Lug/a;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Lug/b;->x:Lt9/p;

    invoke-static {}, Lt9/p;->t()Lug/b;

    move-result-object v6

    invoke-virtual {v5}, Lvg/h;->a()Lug/b;

    move-result-object v7

    iget-wide v8, p0, Lvg/c;->w:J

    invoke-virtual {v7, v8, v9}, Lug/b;->c(J)Lug/b;

    move-result-object v7

    invoke-virtual {v6, v7}, Lug/b;->a(Lug/b;)I

    move-result v6

    if-ltz v6, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v5}, Lvg/h;->b()Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    check-cast p2, Lmc3/h;

    invoke-virtual {p2}, Lmc3/h;->d()V

    return-object p1

    :catchall_1
    move-exception p1

    move-object v0, p2

    goto :goto_5

    :cond_6
    :goto_2
    const/4 v6, 0x0

    :try_start_2
    iput-object v6, v0, Lvg/b;->w:Ls83/i;

    iput-object p2, v0, Lvg/b;->x:Lmc3/e;

    iput-object v5, v0, Lvg/b;->y:Lvg/h;

    iput v2, v0, Lvg/b;->z:I

    iput v4, v0, Lvg/b;->G:I

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne p1, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    move-object v0, p2

    move-object p2, p1

    move-object p1, v5

    :goto_4
    :try_start_3
    check-cast p2, Lvg/h;

    iget v1, p0, Lvg/c;->E:I

    if-nez v1, :cond_9

    sget-object v1, Lvg/c;->F:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p0, p1, p2}, Lte0/d;->B(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Lvg/c;Lvg/h;Lvg/h;)Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {p2}, Lvg/h;->b()Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    check-cast v0, Lmc3/h;

    invoke-virtual {v0}, Lmc3/h;->d()V

    return-object p1

    :cond_8
    :try_start_4
    const-string p1, "value changed during getOrLoad"

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_a
    :try_start_5
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_5
    check-cast v0, Lmc3/h;

    invoke-virtual {v0}, Lmc3/h;->d()V

    throw p1
.end method

.method public final close()V
    .locals 3

    sget-object v0, Lvg/c;->G:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lvg/c;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lvg/h;

    sget-object v1, Lvg/c;->F:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p0, v0}, Lte0/d;->A(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Lvg/c;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-void
.end method
