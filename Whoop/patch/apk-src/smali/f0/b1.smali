.class public final Lf0/b1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public E:Ljava/lang/Object;

.field public F:Ljava/lang/Object;

.field public G:Ljava/lang/Object;

.field public H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic J:Ljava/lang/Object;

.field public final synthetic K:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lf0/z0;Lf0/c1;Lc93/m;Ljava/lang/Object;Lq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lf0/b1;->w:I

    .line 1
    iput-object p1, p0, Lf0/b1;->J:Ljava/lang/Object;

    iput-object p2, p0, Lf0/b1;->I:Ljava/lang/Object;

    check-cast p3, Ls83/i;

    iput-object p3, p0, Lf0/b1;->K:Ljava/lang/Object;

    iput-object p4, p0, Lf0/b1;->G:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lne3/j;Lq83/j;Le63/e;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lf0/b1;->w:I

    .line 2
    iput-object p1, p0, Lf0/b1;->I:Ljava/lang/Object;

    iput-object p2, p0, Lf0/b1;->J:Ljava/lang/Object;

    iput-object p3, p0, Lf0/b1;->K:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 10

    iget v0, p0, Lf0/b1;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lf0/b1;

    iget-object v1, p0, Lf0/b1;->I:Ljava/lang/Object;

    check-cast v1, Lne3/j;

    iget-object v2, p0, Lf0/b1;->J:Ljava/lang/Object;

    check-cast v2, Lq83/j;

    iget-object v3, p0, Lf0/b1;->K:Ljava/lang/Object;

    check-cast v3, Le63/e;

    invoke-direct {v0, v1, v2, v3, p2}, Lf0/b1;-><init>(Lne3/j;Lq83/j;Le63/e;Lq83/d;)V

    iput-object p1, v0, Lf0/b1;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance v4, Lf0/b1;

    iget-object v0, p0, Lf0/b1;->J:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lf0/z0;

    iget-object v0, p0, Lf0/b1;->I:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lf0/c1;

    iget-object v0, p0, Lf0/b1;->K:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Ls83/i;

    iget-object v8, p0, Lf0/b1;->G:Ljava/lang/Object;

    move-object v9, p2

    invoke-direct/range {v4 .. v9}, Lf0/b1;-><init>(Lf0/z0;Lf0/c1;Lc93/m;Ljava/lang/Object;Lq83/d;)V

    iput-object p1, v4, Lf0/b1;->F:Ljava/lang/Object;

    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lf0/b1;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lio/ktor/utils/io/u;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lf0/b1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf0/b1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf0/b1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lf0/b1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf0/b1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf0/b1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lf0/b1;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lf0/b1;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v1, p0, Lf0/b1;->H:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/e0;

    iget-object v5, p0, Lf0/b1;->G:Ljava/lang/Object;

    check-cast v5, Lne3/j;

    iget-object v6, p0, Lf0/b1;->F:Ljava/lang/Object;

    check-cast v6, Le63/e;

    iget-object v7, p0, Lf0/b1;->E:Ljava/lang/Object;

    check-cast v7, Lq83/j;

    iget-object v8, p0, Lf0/b1;->z:Ljava/lang/Object;

    check-cast v8, Ljava/io/Closeable;

    iget-object v9, p0, Lf0/b1;->y:Ljava/lang/Object;

    check-cast v9, Lio/ktor/utils/io/u;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lf0/b1;->y:Ljava/lang/Object;

    check-cast p1, Lio/ktor/utils/io/u;

    iget-object v1, p0, Lf0/b1;->I:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Lne3/j;

    iget-object v1, p0, Lf0/b1;->J:Ljava/lang/Object;

    check-cast v1, Lq83/j;

    iget-object v5, p0, Lf0/b1;->K:Ljava/lang/Object;

    check-cast v5, Le63/e;

    :try_start_1
    new-instance v6, Lkotlin/jvm/internal/e0;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    move-object v9, p1

    move-object v7, v1

    move-object v1, v6

    move-object v6, v5

    move-object v5, v8

    :cond_2
    :goto_0
    invoke-interface {v5}, Ljava/nio/channels/Channel;->isOpen()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {v7}, Lbc3/f0;->x(Lq83/j;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget p1, v1, Lkotlin/jvm/internal/e0;->w:I

    if-ltz p1, :cond_3

    iget-object p1, v9, Lio/ktor/utils/io/u;->w:Lio/ktor/utils/io/m;

    new-instance v10, Lc0/h;

    const/4 v11, 0x4

    invoke-direct {v10, v1, v5, v6, v11}, Lc0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v9, p0, Lf0/b1;->y:Ljava/lang/Object;

    iput-object v8, p0, Lf0/b1;->z:Ljava/lang/Object;

    iput-object v7, p0, Lf0/b1;->E:Ljava/lang/Object;

    iput-object v6, p0, Lf0/b1;->F:Ljava/lang/Object;

    iput-object v5, p0, Lf0/b1;->G:Ljava/lang/Object;

    iput-object v1, p0, Lf0/b1;->H:Ljava/lang/Object;

    iput v3, p0, Lf0/b1;->x:I

    invoke-static {p1, v3, v10, p0}, Lio/ktor/utils/io/m;->J(Lio/ktor/utils/io/m;ILc0/h;Ls83/c;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v0, :cond_2

    goto :goto_4

    :cond_3
    move-object p1, v2

    goto :goto_2

    :goto_1
    move-object v12, v4

    move-object v4, p1

    move-object p1, v12

    :goto_2
    if-nez v8, :cond_4

    goto :goto_3

    :cond_4
    :try_start_2
    invoke-interface {v8}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    if-nez v4, :cond_5

    move-object v4, v0

    goto :goto_3

    :cond_5
    invoke-static {v4, v0}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_3
    if-nez v4, :cond_6

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-object v0, v2

    :goto_4
    return-object v0

    :cond_6
    throw v4

    :pswitch_0
    iget-object v0, p0, Lf0/b1;->I:Ljava/lang/Object;

    check-cast v0, Lf0/c1;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lf0/b1;->x:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_9

    if-eq v2, v4, :cond_8

    if-ne v2, v3, :cond_7

    iget-object v0, p0, Lf0/b1;->y:Ljava/lang/Object;

    check-cast v0, Lf0/c1;

    iget-object v1, p0, Lf0/b1;->z:Ljava/lang/Object;

    check-cast v1, Lmc3/a;

    iget-object v2, p0, Lf0/b1;->F:Ljava/lang/Object;

    check-cast v2, Lf0/a1;

    :try_start_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto/16 :goto_6

    :catchall_2
    move-exception p1

    goto/16 :goto_9

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    iget-object v0, p0, Lf0/b1;->H:Ljava/lang/Object;

    check-cast v0, Lf0/c1;

    iget-object v2, p0, Lf0/b1;->E:Ljava/lang/Object;

    iget-object v4, p0, Lf0/b1;->y:Ljava/lang/Object;

    check-cast v4, Lc93/m;

    iget-object v6, p0, Lf0/b1;->z:Ljava/lang/Object;

    check-cast v6, Lmc3/a;

    iget-object v7, p0, Lf0/b1;->F:Ljava/lang/Object;

    check-cast v7, Lf0/a1;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p1, v6

    goto :goto_5

    :cond_9
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lf0/b1;->F:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    new-instance v2, Lf0/a1;

    iget-object v6, p0, Lf0/b1;->J:Ljava/lang/Object;

    check-cast v6, Lf0/z0;

    invoke-interface {p1}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object p1

    sget-object v7, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {p1, v7}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p1, Lbc3/k1;

    invoke-direct {v2, v6, p1}, Lf0/a1;-><init>(Lf0/z0;Lbc3/k1;)V

    invoke-static {v0, v2}, Lf0/c1;->a(Lf0/c1;Lf0/a1;)V

    iget-object p1, v0, Lf0/c1;->b:Lmc3/c;

    iget-object v6, p0, Lf0/b1;->K:Ljava/lang/Object;

    check-cast v6, Ls83/i;

    iget-object v7, p0, Lf0/b1;->G:Ljava/lang/Object;

    iput-object v2, p0, Lf0/b1;->F:Ljava/lang/Object;

    iput-object p1, p0, Lf0/b1;->z:Ljava/lang/Object;

    iput-object v6, p0, Lf0/b1;->y:Ljava/lang/Object;

    iput-object v7, p0, Lf0/b1;->E:Ljava/lang/Object;

    iput-object v0, p0, Lf0/b1;->H:Ljava/lang/Object;

    iput v4, p0, Lf0/b1;->x:I

    invoke-virtual {p1, p0}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_a

    goto :goto_8

    :cond_a
    move-object v4, v7

    move-object v7, v2

    move-object v2, v4

    move-object v4, v6

    :goto_5
    :try_start_4
    iput-object v7, p0, Lf0/b1;->F:Ljava/lang/Object;

    iput-object p1, p0, Lf0/b1;->z:Ljava/lang/Object;

    iput-object v0, p0, Lf0/b1;->y:Ljava/lang/Object;

    iput-object v5, p0, Lf0/b1;->E:Ljava/lang/Object;

    iput-object v5, p0, Lf0/b1;->H:Ljava/lang/Object;

    iput v3, p0, Lf0/b1;->x:I

    invoke-interface {v4, v2, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    if-ne v2, v1, :cond_b

    goto :goto_8

    :cond_b
    move-object v1, p1

    move-object p1, v2

    move-object v2, v7

    :goto_6
    :try_start_5
    iget-object v0, v0, Lf0/c1;->a:Ljava/util/concurrent/atomic/AtomicReference;

    :cond_c
    invoke-virtual {v0, v2, v5}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    goto :goto_7

    :cond_d
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    if-eq v3, v2, :cond_c

    :goto_7
    invoke-interface {v1, v5}, Lmc3/a;->i(Ljava/lang/Object;)V

    move-object v1, p1

    :goto_8
    return-object v1

    :catchall_3
    move-exception p1

    goto :goto_b

    :catchall_4
    move-exception v1

    move-object v2, v1

    move-object v1, p1

    move-object p1, v2

    move-object v2, v7

    :goto_9
    :try_start_6
    iget-object v0, v0, Lf0/c1;->a:Ljava/util/concurrent/atomic/AtomicReference;

    :goto_a
    invoke-virtual {v0, v2, v5}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_e

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_e

    goto :goto_a

    :cond_e
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :goto_b
    invoke-interface {v1, v5}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
