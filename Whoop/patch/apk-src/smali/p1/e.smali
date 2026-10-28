.class public final Lp1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/w0;


# instance fields
.field public E:La0/q0;

.field public F:La0/q0;

.field public final w:Lc93/a;

.field public final x:Ljava/lang/Object;

.field public y:Ljava/lang/Throwable;

.field public final z:Lx1/a;


# direct methods
.method public constructor <init>(Lc93/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/e;->w:Lc93/a;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/e;->x:Ljava/lang/Object;

    new-instance p1, Lx1/a;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Lp1/e;->z:Lx1/a;

    new-instance p1, La0/q0;

    invoke-direct {p1}, La0/q0;-><init>()V

    iput-object p1, p0, Lp1/e;->E:La0/q0;

    new-instance p1, La0/q0;

    invoke-direct {p1}, La0/q0;-><init>()V

    iput-object p1, p0, Lp1/e;->F:La0/q0;

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 7

    iget-object v0, p0, Lp1/e;->x:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lp1/e;->E:La0/q0;

    iget-object v2, p0, Lp1/e;->F:La0/q0;

    iput-object v2, p0, Lp1/e;->E:La0/q0;

    iput-object v1, p0, Lp1/e;->F:La0/q0;

    iget-object v2, p0, Lp1/e;->z:Lx1/a;

    :cond_0
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v3

    ushr-int/lit8 v4, v3, 0x1b

    and-int/lit8 v4, v4, 0xf

    add-int/lit8 v4, v4, 0x1

    and-int/lit8 v4, v4, 0xf

    shl-int/lit8 v4, v4, 0x1b

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v3

    if-eqz v3, :cond_0

    iget v2, v1, La0/q0;->b:I

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    invoke-virtual {v1, v3}, La0/q0;->e(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp1/d;

    iget-object v5, v4, Lp1/d;->a:Lkotlin/jvm/functions/Function1;

    if-nez v5, :cond_1

    goto :goto_2

    :cond_1
    iget-object v4, v4, Lp1/d;->b:Lbc3/m;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v4, :cond_2

    :try_start_1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-interface {v5, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v5

    :try_start_2
    invoke-static {v5}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v5

    :goto_1
    invoke-virtual {v4, v5}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :cond_2
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, La0/q0;->c()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    return-void

    :goto_3
    monitor-exit v0

    throw p1
.end method

.method public final fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p2, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final get(Lq83/i;)Lq83/h;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->D(Lq83/h;Lq83/i;)Lq83/h;

    move-result-object p1

    return-object p1
.end method

.method public final k(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 7

    new-instance v0, Lbc3/m;

    invoke-static {p2}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p2

    const/4 v1, 0x1

    invoke-direct {v0, v1, p2}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    new-instance p2, Lp1/d;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p1, p2, Lp1/d;->a:Lkotlin/jvm/functions/Function1;

    iput-object v0, p2, Lp1/d;->b:Lbc3/m;

    new-instance p1, Lkotlin/jvm/internal/e0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/4 v2, -0x1

    iput v2, p1, Lkotlin/jvm/internal/e0;->w:I

    iget-object v2, p0, Lp1/e;->x:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v3, p0, Lp1/e;->y:Ljava/lang/Throwable;

    if-eqz v3, :cond_0

    invoke-static {v3}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    invoke-virtual {v0, p1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    goto/16 :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_0
    :try_start_1
    iget-object v3, p0, Lp1/e;->z:Lx1/a;

    :cond_1
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v4

    add-int/lit8 v5, v4, 0x1

    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v4

    if-eqz v4, :cond_1

    const v3, 0x7ffffff

    and-int/2addr v3, v5

    const/4 v4, 0x0

    if-ne v3, v1, :cond_2

    move v3, v1

    goto :goto_0

    :cond_2
    move v3, v4

    :goto_0
    ushr-int/lit8 v5, v5, 0x1b

    and-int/lit8 v5, v5, 0xf

    iput v5, p1, Lkotlin/jvm/internal/e0;->w:I

    iget-object v5, p0, Lp1/e;->E:La0/q0;

    invoke-virtual {v5, p2}, La0/q0;->a(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v2

    new-instance v2, Landroidx/lifecycle/h2;

    const/4 v5, 0x2

    invoke-direct {v2, p2, p0, p1, v5}, Landroidx/lifecycle/h2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v2}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    if-eqz v3, :cond_7

    iget-object p1, p0, Lp1/e;->w:Lc93/a;

    :try_start_2
    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p1

    iget-object p2, p0, Lp1/e;->x:Ljava/lang/Object;

    monitor-enter p2

    :try_start_3
    iget-object v2, p0, Lp1/e;->y:Ljava/lang/Throwable;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-eqz v2, :cond_3

    monitor-exit p2

    goto :goto_3

    :cond_3
    :try_start_4
    iput-object p1, p0, Lp1/e;->y:Ljava/lang/Throwable;

    iget-object v2, p0, Lp1/e;->E:La0/q0;

    iget-object v3, v2, La0/q0;->a:[Ljava/lang/Object;

    iget v2, v2, La0/q0;->b:I

    :goto_1
    if-ge v4, v2, :cond_5

    aget-object v5, v3, v4

    check-cast v5, Lp1/d;

    iget-object v5, v5, Lp1/d;->b:Lbc3/m;

    if-eqz v5, :cond_4

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v6

    invoke-virtual {v5, v6}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :catchall_2
    move-exception p1

    goto :goto_2

    :cond_5
    iget-object p1, p0, Lp1/e;->E:La0/q0;

    invoke-virtual {p1}, La0/q0;->c()V

    iget-object p1, p0, Lp1/e;->z:Lx1/a;

    :cond_6
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    ushr-int/lit8 v3, v2, 0x1b

    and-int/lit8 v3, v3, 0xf

    add-int/2addr v3, v1

    and-int/lit8 v3, v3, 0xf

    shl-int/lit8 v3, v3, 0x1b

    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-eqz v2, :cond_6

    monitor-exit p2

    goto :goto_3

    :goto_2
    monitor-exit p2

    throw p1

    :cond_7
    :goto_3
    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    return-object p1

    :goto_4
    monitor-exit v2

    throw p1
.end method

.method public final minusKey(Lq83/i;)Lq83/j;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->Q(Lq83/h;Lq83/i;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

.method public final plus(Lq83/j;)Lq83/j;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object p1

    return-object p1
.end method
