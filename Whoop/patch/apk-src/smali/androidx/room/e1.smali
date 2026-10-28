.class public final Landroidx/room/e1;
.super Landroidx/lifecycle/p0;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/room/z0;

.field public final b:Lcom/google/crypto/tink/internal/l0;

.field public final c:Z

.field public final d:Landroidx/room/p1;

.field public final e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final f:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final g:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final h:Lq83/j;

.field public final i:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Landroidx/room/z0;Lcom/google/crypto/tink/internal/l0;Z[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "database"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "container"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/p0;-><init>()V

    iput-object p1, p0, Landroidx/room/e1;->a:Landroidx/room/z0;

    iput-object p2, p0, Landroidx/room/e1;->b:Lcom/google/crypto/tink/internal/l0;

    iput-boolean p3, p0, Landroidx/room/e1;->c:Z

    new-instance p2, Landroidx/room/p1;

    invoke-direct {p2, p4, p0}, Landroidx/room/p1;-><init>([Ljava/lang/String;Landroidx/room/e1;)V

    iput-object p2, p0, Landroidx/room/e1;->d:Landroidx/room/p1;

    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p4, 0x1

    invoke-direct {p2, p4}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p2, p0, Landroidx/room/e1;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p4, 0x0

    invoke-direct {p2, p4}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p2, p0, Landroidx/room/e1;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p2, p4}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p2, p0, Landroidx/room/e1;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Landroidx/room/z0;->inCompatibilityMode()Z

    move-result p2

    if-eqz p2, :cond_1

    if-eqz p3, :cond_0

    invoke-virtual {p1}, Landroidx/room/z0;->getTransactionContext$room_runtime()Lq83/j;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/room/z0;->getQueryContext()Lq83/j;

    move-result-object p1

    goto :goto_0

    :cond_1
    sget-object p1, Lq83/k;->w:Lq83/k;

    :goto_0
    iput-object p1, p0, Landroidx/room/e1;->h:Lq83/j;

    iput-object p5, p0, Landroidx/room/e1;->i:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public static final b(Landroidx/room/e1;Ls83/c;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Landroidx/room/e1;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v1, p0, Landroidx/room/e1;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    instance-of v2, p1, Landroidx/room/q1;

    if-eqz v2, :cond_0

    move-object v2, p1

    check-cast v2, Landroidx/room/q1;

    iget v3, v2, Landroidx/room/q1;->z:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Landroidx/room/q1;->z:I

    goto :goto_0

    :cond_0
    new-instance v2, Landroidx/room/q1;

    invoke-direct {v2, p0, p1}, Landroidx/room/q1;-><init>(Landroidx/room/e1;Ls83/c;)V

    :goto_0
    iget-object p1, v2, Landroidx/room/q1;->x:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Landroidx/room/q1;->z:I

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v7, :cond_1

    iget v4, v2, Landroidx/room/q1;->w:I

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v9, v4

    move-object v4, p1

    move p1, v9

    goto :goto_1

    :catchall_0
    move-exception p0

    goto/16 :goto_3

    :catch_0
    move-exception p0

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/e1;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v6, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Landroidx/room/e1;->a:Landroidx/room/z0;

    invoke-virtual {p1}, Landroidx/room/z0;->getInvalidationTracker()Landroidx/room/v;

    move-result-object p1

    iget-object v4, p0, Landroidx/room/e1;->d:Landroidx/room/p1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v8, "observer"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Landroidx/room/j2;

    invoke-direct {v8, p1, v4}, Landroidx/room/j2;-><init>(Landroidx/room/v;Landroidx/room/p1;)V

    invoke-virtual {p1, v8}, Landroidx/room/v;->a(Landroidx/room/s;)Z

    move-result v4

    if-eqz v4, :cond_3

    new-instance v4, Landroidx/room/t;

    const/4 v8, 0x0

    invoke-direct {v4, p1, v5, v8}, Landroidx/room/t;-><init>(Landroidx/room/v;Lq83/d;I)V

    invoke-static {v4}, Le93/b;->Z(Lc93/m;)Ljava/lang/Object;

    :cond_3
    invoke-virtual {v1, v6, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-eqz p1, :cond_7

    move-object v4, v5

    move p1, v6

    :goto_1
    :try_start_1
    invoke-virtual {v0, v7, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v8, :cond_5

    :try_start_2
    iput v7, v2, Landroidx/room/q1;->w:I

    iput v7, v2, Landroidx/room/q1;->z:I

    iget-object p1, p0, Landroidx/room/e1;->a:Landroidx/room/z0;

    iget-boolean v4, p0, Landroidx/room/e1;->c:Z

    iget-object v8, p0, Landroidx/room/e1;->i:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v7, v4, v8, v2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne p1, v3, :cond_4

    return-object v3

    :cond_4
    move-object v4, p1

    move p1, v7

    goto :goto_1

    :goto_2
    :try_start_3
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Exception while computing database live data."

    invoke-direct {p1, v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_5
    if-eqz p1, :cond_6

    invoke-virtual {p0, v4}, Landroidx/lifecycle/p0;->postValue(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_6
    invoke-virtual {v1, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_4

    :goto_3
    invoke-virtual {v1, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    throw p0

    :cond_7
    move p1, v6

    :goto_4
    if-eqz p1, :cond_8

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-nez p1, :cond_3

    :cond_8
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final onActive()V
    .locals 5

    invoke-super {p0}, Landroidx/lifecycle/p0;->onActive()V

    iget-object v0, p0, Landroidx/room/e1;->b:Lcom/google/crypto/tink/internal/l0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroidx/room/e1;->a:Landroidx/room/z0;

    invoke-virtual {v0}, Landroidx/room/z0;->getCoroutineScope()Lbc3/c0;

    move-result-object v0

    new-instance v1, Landroidx/room/o1;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, p0, v3, v2}, Landroidx/room/o1;-><init>(Landroidx/room/e1;Lq83/d;I)V

    const/4 v2, 0x2

    iget-object v4, p0, Landroidx/room/e1;->h:Lq83/j;

    invoke-static {v0, v4, v3, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final onInactive()V
    .locals 1

    invoke-super {p0}, Landroidx/lifecycle/p0;->onInactive()V

    iget-object v0, p0, Landroidx/room/e1;->b:Lcom/google/crypto/tink/internal/l0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method
