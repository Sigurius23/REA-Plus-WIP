.class public final La63/c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILq83/d;)V
    .locals 0

    .line 1
    iput p2, p0, La63/c;->w:I

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 2
    iput p3, p0, La63/c;->w:I

    iput-object p1, p0, La63/c;->z:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, La63/c;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lr63/e;

    check-cast p2, Lf63/d;

    check-cast p3, Lq83/d;

    new-instance p2, La63/c;

    iget-object v0, p0, La63/c;->z:Ljava/lang/Object;

    check-cast v0, Lv53/c;

    const/4 v1, 0x5

    invoke-direct {p2, v0, p3, v1}, La63/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, La63/c;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p2, p1}, La63/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lec3/m;

    check-cast p2, [Ljava/lang/Object;

    check-cast p3, Lq83/d;

    new-instance v0, La63/c;

    const/4 v1, 0x3

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, p3}, La63/c;-><init>(IILq83/d;)V

    iput-object p1, v0, La63/c;->y:Ljava/lang/Object;

    iput-object p2, v0, La63/c;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, La63/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lr63/e;

    check-cast p3, Lq83/d;

    new-instance p2, La63/c;

    iget-object v0, p0, La63/c;->z:Ljava/lang/Object;

    check-cast v0, Lb63/f;

    const/4 v1, 0x3

    invoke-direct {p2, v0, p3, v1}, La63/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, La63/c;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p2, p1}, La63/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lr63/e;

    check-cast p3, Lq83/d;

    new-instance p2, La63/c;

    iget-object v0, p0, La63/c;->z:Ljava/lang/Object;

    check-cast v0, Lv53/c;

    const/4 v1, 0x2

    invoke-direct {p2, v0, p3, v1}, La63/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, La63/c;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p2, p1}, La63/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lr63/e;

    check-cast p2, Lf63/d;

    check-cast p3, Lq83/d;

    new-instance v0, La63/c;

    const/4 v1, 0x3

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, p3}, La63/c;-><init>(IILq83/d;)V

    iput-object p1, v0, La63/c;->y:Ljava/lang/Object;

    iput-object p2, v0, La63/c;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, La63/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lr63/e;

    check-cast p2, Lf63/c;

    check-cast p3, Lq83/d;

    new-instance v0, La63/c;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p3}, La63/c;-><init>(IILq83/d;)V

    iput-object p1, v0, La63/c;->y:Ljava/lang/Object;

    iput-object p2, v0, La63/c;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, La63/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, La63/c;->w:I

    sget-object v1, Lbc3/j1;->w:Lbc3/j1;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v7, 0x1

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La63/c;->x:I

    if-eqz v1, :cond_1

    if-ne v1, v7, :cond_0

    iget-object v0, p0, La63/c;->y:Ljava/lang/Object;

    check-cast v0, Lr63/e;

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

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La63/c;->y:Ljava/lang/Object;

    check-cast p1, Lr63/e;

    :try_start_1
    iput-object p1, p0, La63/c;->y:Ljava/lang/Object;

    iput v7, p0, La63/c;->x:I

    invoke-virtual {p1, p0}, Lr63/e;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v0, :cond_2

    move-object v5, v0

    :cond_2
    :goto_0
    return-object v5

    :catchall_1
    move-exception v0

    move-object v10, v0

    move-object v0, p1

    move-object p1, v10

    :goto_1
    iget-object v1, p0, La63/c;->z:Ljava/lang/Object;

    check-cast v1, Lv53/c;

    iget-object v1, v1, Lv53/c;->J:Lad3/z;

    iget-object v0, v0, Lr63/e;->w:Ljava/lang/Object;

    check-cast v0, Lw53/b;

    invoke-virtual {v0}, Lw53/b;->d()Lf63/c;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v1, Lad3/z;->x:Ljava/lang/Object;

    check-cast v0, Lp63/a;

    sget-object v1, Lg63/b;->d:Lio/sentry/hints/j;

    invoke-virtual {v0, v1}, Lp63/a;->a(Lio/sentry/hints/j;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc3/x1;

    if-eqz v0, :cond_3

    sget-object v1, Lhc3/k;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhc3/k;

    :goto_2
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {v1}, Lhc3/k;->f()Lhc3/k;

    move-result-object v1

    goto :goto_2

    :cond_3
    throw p1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La63/c;->x:I

    if-eqz v1, :cond_5

    if-ne v1, v7, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_6

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La63/c;->y:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, La63/c;->z:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    check-cast v1, [Lmc/c;

    array-length v2, v1

    :goto_3
    sget-object v6, Lmc/a;->a:Lmc/a;

    if-ge v3, v2, :cond_7

    aget-object v8, v1, v3

    invoke-static {v8, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    move-object v4, v8

    goto :goto_4

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_7
    :goto_4
    if-nez v4, :cond_8

    goto :goto_5

    :cond_8
    move-object v6, v4

    :goto_5
    iput v7, p0, La63/c;->x:I

    invoke-interface {p1, v6, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    move-object v5, v0

    :cond_9
    :goto_6
    return-object v5

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La63/c;->x:I

    if-eqz v1, :cond_c

    if-eq v1, v7, :cond_b

    if-ne v1, v2, :cond_a

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_9

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    iget-object v1, p0, La63/c;->y:Ljava/lang/Object;

    check-cast v1, Lr63/e;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_7

    :cond_c
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La63/c;->y:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lr63/e;

    iget-object p1, p0, La63/c;->z:Ljava/lang/Object;

    check-cast p1, Lb63/f;

    iget-object v3, v1, Lr63/e;->w:Ljava/lang/Object;

    check-cast v3, Le63/d;

    invoke-virtual {v1}, Lr63/e;->b()Ljava/lang/Object;

    move-result-object v6

    iput-object v1, p0, La63/c;->y:Ljava/lang/Object;

    iput v7, p0, La63/c;->x:I

    invoke-virtual {p1, v3, v6, p0}, Lb63/f;->a(Le63/d;Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_d

    goto :goto_8

    :cond_d
    :goto_7
    if-nez p1, :cond_e

    goto :goto_9

    :cond_e
    iput-object v4, p0, La63/c;->y:Ljava/lang/Object;

    iput v2, p0, La63/c;->x:I

    invoke-virtual {v1, p1, p0}, Lr63/e;->d(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_f

    :goto_8
    move-object v5, v0

    :cond_f
    :goto_9
    return-object v5

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v4, p0, La63/c;->x:I

    if-eqz v4, :cond_11

    if-ne v4, v7, :cond_10

    iget-object v0, p0, La63/c;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/u;

    :try_start_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_a

    :catchall_2
    move-exception p1

    goto :goto_c

    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_11
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La63/c;->y:Ljava/lang/Object;

    check-cast p1, Lr63/e;

    iget-object v4, p1, Lr63/e;->w:Ljava/lang/Object;

    check-cast v4, Le63/d;

    iget-object v4, v4, Le63/d;->e:Lbc3/e2;

    new-instance v6, Lbc3/e2;

    invoke-direct {v6, v4}, Lbc3/l1;-><init>(Lbc3/k1;)V

    iget-object v4, p0, La63/c;->z:Ljava/lang/Object;

    check-cast v4, Lv53/c;

    iget-object v4, v4, Lv53/c;->z:Lq83/j;

    invoke-interface {v4, v1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v1, Lbc3/k1;

    new-instance v4, La3/m1;

    invoke-direct {v4, v6, v2}, La3/m1;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v1, v4}, Lbc3/k1;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;

    move-result-object v1

    new-instance v2, La63/a0;

    invoke-direct {v2, v1, v3}, La63/a0;-><init>(Lbc3/s0;I)V

    invoke-virtual {v6, v2}, Lbc3/t1;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;

    :try_start_3
    iget-object v1, p1, Lr63/e;->w:Ljava/lang/Object;

    check-cast v1, Le63/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v6, v1, Le63/d;->e:Lbc3/e2;

    iput-object v6, p0, La63/c;->y:Ljava/lang/Object;

    iput v7, p0, La63/c;->x:I

    invoke-virtual {p1, p0}, Lr63/e;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    if-ne p1, v0, :cond_12

    move-object v5, v0

    goto :goto_b

    :cond_12
    move-object v0, v6

    :goto_a
    invoke-interface {v0}, Lbc3/u;->complete()Z

    :goto_b
    return-object v5

    :catchall_3
    move-exception p1

    move-object v0, v6

    :goto_c
    :try_start_4
    invoke-interface {v0, p1}, Lbc3/u;->completeExceptionally(Ljava/lang/Throwable;)Z

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    :catchall_4
    move-exception p1

    invoke-interface {v0}, Lbc3/u;->complete()Z

    throw p1

    :pswitch_3
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, p0, La63/c;->x:I

    if-eqz v2, :cond_14

    if-ne v2, v7, :cond_13

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_d

    :cond_13
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_14
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La63/c;->y:Ljava/lang/Object;

    check-cast p1, Lr63/e;

    iget-object v2, p0, La63/c;->z:Ljava/lang/Object;

    check-cast v2, Lf63/d;

    iget-object v3, v2, Lf63/d;->a:Ls63/a;

    iget-object v2, v2, Lf63/d;->b:Ljava/lang/Object;

    instance-of v6, v2, Lio/ktor/utils/io/q;

    if-nez v6, :cond_15

    goto :goto_d

    :cond_15
    iget-object v6, v3, Ls63/a;->a:Lj93/d;

    const-class v8, Ljava/io/InputStream;

    sget-object v9, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v9, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_16

    check-cast v2, Lio/ktor/utils/io/q;

    iget-object v6, p1, Lr63/e;->w:Ljava/lang/Object;

    check-cast v6, Lw53/b;

    invoke-virtual {v6}, Lw53/b;->getCoroutineContext()Lq83/j;

    move-result-object v6

    invoke-interface {v6, v1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v1

    check-cast v1, Lbc3/k1;

    invoke-static {v1, v2}, Lio/ktor/utils/io/jvm/javaio/d;->a(Lbc3/k1;Lio/ktor/utils/io/q;)Lio/ktor/utils/io/jvm/javaio/h;

    move-result-object v1

    new-instance v2, La63/k;

    invoke-direct {v2, v1, p1}, La63/k;-><init>(Lio/ktor/utils/io/jvm/javaio/h;Lr63/e;)V

    new-instance v1, Lf63/d;

    invoke-direct {v1, v3, v2}, Lf63/d;-><init>(Ls63/a;Ljava/lang/Object;)V

    iput-object v4, p0, La63/c;->y:Ljava/lang/Object;

    iput v7, p0, La63/c;->x:I

    invoke-virtual {p1, v1, p0}, Lr63/e;->d(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_16

    move-object v5, v0

    :cond_16
    :goto_d
    return-object v5

    :pswitch_4
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La63/c;->x:I

    if-eqz v1, :cond_18

    if-ne v1, v7, :cond_17

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_f

    :cond_17
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_18
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La63/c;->y:Ljava/lang/Object;

    check-cast p1, Lr63/e;

    iget-object v1, p0, La63/c;->z:Ljava/lang/Object;

    check-cast v1, Lf63/c;

    invoke-virtual {v1}, Lf63/c;->a()Lw53/b;

    move-result-object v2

    invoke-virtual {v2}, Lw53/b;->c()Le63/b;

    move-result-object v2

    invoke-interface {v2}, Le63/b;->getAttributes()Lo63/f;

    move-result-object v2

    sget-object v3, La63/e;->b:Lo63/a;

    invoke-virtual {v2, v3}, Lo63/f;->d(Lo63/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/jvm/functions/Function3;

    if-nez v2, :cond_19

    goto :goto_f

    :cond_19
    invoke-virtual {v1}, Lf63/c;->b()Lio/ktor/utils/io/q;

    move-result-object v3

    invoke-interface {v1}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v6

    invoke-interface {v1}, Li63/s;->getHeaders()Li63/m;

    move-result-object v8

    sget-object v9, Li63/r;->a:Ljava/util/List;

    const-string v9, "Content-Length"

    invoke-interface {v8, v9}, Lo63/m;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_1a

    invoke-static {v8}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    goto :goto_e

    :cond_1a
    move-object v8, v4

    :goto_e
    invoke-static {v3, v6, v8, v2}, Lug/m;->I(Lio/ktor/utils/io/q;Lq83/j;Ljava/lang/Long;Lkotlin/jvm/functions/Function3;)Lio/ktor/utils/io/n;

    move-result-object v2

    invoke-static {v1, v2}, Lv8/b;->a0(Lf63/c;Lio/ktor/utils/io/n;)Lc63/a;

    move-result-object v1

    iput-object v4, p0, La63/c;->y:Ljava/lang/Object;

    iput v7, p0, La63/c;->x:I

    invoke-virtual {p1, v1, p0}, Lr63/e;->d(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1b

    move-object v5, v0

    :cond_1b
    :goto_f
    return-object v5

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
