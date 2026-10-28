.class public final Lz33/a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:Ljava/util/Iterator;

.field public y:I

.field public final synthetic z:Ljava/util/Set;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Set;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lz33/a;->w:I

    iput-object p1, p0, Lz33/a;->z:Ljava/util/Set;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Lz33/a;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lz33/a;

    iget-object v0, p0, Lz33/a;->z:Ljava/util/Set;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Lz33/a;-><init>(Ljava/util/Set;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lz33/a;

    iget-object v0, p0, Lz33/a;->z:Ljava/util/Set;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Lz33/a;-><init>(Ljava/util/Set;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lz33/a;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lz33/a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lz33/a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lz33/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lz33/a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lz33/a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lz33/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget v0, p0, Lz33/a;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lz33/a;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lz33/a;->x:Ljava/util/Iterator;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lz33/a;->z:Ljava/util/Set;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v1, p1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf53/f;

    iput-object v1, p0, Lz33/a;->x:Ljava/util/Iterator;

    iput v2, p0, Lz33/a;->y:I

    iget v3, p1, Lf53/f;->a:I

    packed-switch v3, :pswitch_data_1

    iget-object p1, p1, Lf53/f;->b:Ljava/lang/Object;

    check-cast p1, Lt23/c0;

    invoke-virtual {p1}, Lt23/c0;->g()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    sget-object v5, Lb23/g;->y:Lb23/g;

    iget-object v6, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    const/4 v7, 0x0

    if-eqz v4, :cond_3

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    iget-wide v8, p1, Lt23/c0;->P:J

    iget-object v4, p1, Lt23/c0;->g:Lt23/b4;

    iget-wide v10, v4, Lt23/b4;->P:J

    const-string v4, "[NetworkStateListener#onDisconnected] #network; old lastDisconnect:"

    const-string v12, ", clientImpl.leaveAfterDisconnectSeconds:"

    invoke-static {v8, v9, v4, v12}, Lyb0/f;->b(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v5, v6, v4, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iput-wide v3, p1, Lt23/c0;->P:J

    invoke-virtual {p1}, Lt23/c0;->g()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    iget-object v6, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    iget-wide v8, p1, Lt23/c0;->P:J

    const-string v4, "[NetworkStateListener#onDisconnected] #network; new lastDisconnect:"

    invoke-static {v8, v9, v4}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v5, v6, v4, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    iget-object v3, p1, Lt23/c0;->n:Lhc3/d;

    new-instance v4, Lt23/i;

    const/4 v6, 0x2

    invoke-direct {v4, p1, v7, v6}, Lt23/i;-><init>(Lt23/c0;Lq83/d;I)V

    const/4 v6, 0x3

    invoke-static {v3, v7, v7, v4, v6}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v3

    iput-object v3, p1, Lt23/c0;->O:Lbc3/c2;

    invoke-virtual {p1}, Lt23/c0;->g()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    iget-object v6, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    iget-wide v8, p1, Lt23/c0;->P:J

    const-string p1, "[NetworkStateListener#onDisconnected] #network; at "

    invoke-static {v8, v9, p1}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v3, v5, v6, p1, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    goto :goto_1

    :pswitch_0
    iget-object p1, p1, Lf53/f;->b:Ljava/lang/Object;

    check-cast p1, Lf53/j;

    iget-object p1, p1, Lf53/j;->l:Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1, p0}, Lio/sentry/internal/debugmeta/c;->B(Ls83/i;)Ljava/lang/Object;

    move-result-object p1

    sget-object v3, Lr83/a;->w:Lr83/a;

    if-ne p1, v3, :cond_6

    goto :goto_1

    :cond_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_1
    if-ne p1, v0, :cond_2

    goto :goto_2

    :cond_7
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_2
    return-object v0

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lz33/a;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_9

    if-ne v1, v2, :cond_8

    iget-object v1, p0, Lz33/a;->x:Ljava/util/Iterator;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lz33/a;->z:Ljava/util/Set;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v1, p1

    :cond_a
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_12

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf53/f;

    iput-object v1, p0, Lz33/a;->x:Ljava/util/Iterator;

    iput v2, p0, Lz33/a;->y:I

    iget v3, p1, Lf53/f;->a:I

    packed-switch v3, :pswitch_data_2

    iget-object p1, p1, Lf53/f;->b:Ljava/lang/Object;

    check-cast p1, Lt23/c0;

    iget-object v3, p1, Lt23/c0;->O:Lbc3/c2;

    const/4 v4, 0x0

    if-eqz v3, :cond_b

    invoke-virtual {v3, v4}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_b
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iget-wide v7, p1, Lt23/c0;->P:J

    sub-long/2addr v5, v7

    invoke-virtual {p1}, Lt23/c0;->g()Lb23/k;

    move-result-object v3

    iget-object v7, v3, Lb23/k;->c:Lb23/e;

    iget-object v8, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v9, Lb23/g;->y:Lb23/g;

    invoke-interface {v7, v9, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_c

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    iget-wide v10, p1, Lt23/c0;->P:J

    iget v7, p1, Lt23/c0;->Q:I

    const-string v12, "[NetworkStateListener#onConnected] #network; no args, elapsedTimeMils:"

    const-string v13, ", lastDisconnect:"

    invoke-static {v5, v6, v12, v13}, Lyb0/f;->b(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v10, ", reconnectDeadlineMils:"

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v3, v9, v8, v7, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_c
    iget-wide v3, p1, Lt23/c0;->P:J

    const-wide/16 v7, 0x0

    cmp-long v3, v3, v7

    if-lez v3, :cond_d

    iget v3, p1, Lt23/c0;->Q:I

    int-to-long v3, v3

    cmp-long v3, v5, v3

    if-gez v3, :cond_d

    sget-object v3, Lstream/video/sfu/models/WebsocketReconnectStrategy;->WEBSOCKET_RECONNECT_STRATEGY_FAST:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    goto :goto_4

    :cond_d
    sget-object v3, Lstream/video/sfu/models/WebsocketReconnectStrategy;->WEBSOCKET_RECONNECT_STRATEGY_REJOIN:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    :goto_4
    const-string v4, "NetworkStateListener#onConnected"

    invoke-virtual {p1, v3, v4, p0}, Lt23/c0;->s(Lstream/video/sfu/models/WebsocketReconnectStrategy;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object v3, Lr83/a;->w:Lr83/a;

    if-ne p1, v3, :cond_e

    goto :goto_6

    :cond_e
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    goto :goto_6

    :pswitch_2
    iget-object p1, p1, Lf53/f;->b:Ljava/lang/Object;

    check-cast p1, Lf53/j;

    iget-object p1, p1, Lf53/j;->l:Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1}, Lio/sentry/internal/debugmeta/c;->t()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    sget-object v5, Lb23/g;->z:Lb23/g;

    iget-object v6, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_f

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    const-string v4, "[onNetworkAvailable] no args"

    const/4 v7, 0x0

    invoke-interface {v3, v5, v6, v4, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_f
    invoke-virtual {p1}, Lio/sentry/internal/debugmeta/c;->w()Ly43/b;

    move-result-object p1

    sget-object v3, Lg53/p;->a:Lg53/p;

    invoke-virtual {p1, v3, p0}, Ly43/b;->a(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v3, Lr83/a;->w:Lr83/a;

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    if-ne p1, v3, :cond_10

    goto :goto_5

    :cond_10
    move-object p1, v4

    :goto_5
    if-ne p1, v3, :cond_11

    goto :goto_6

    :cond_11
    move-object p1, v4

    :goto_6
    if-ne p1, v0, :cond_a

    goto :goto_7

    :cond_12
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_7
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_2
    .end packed-switch
.end method
