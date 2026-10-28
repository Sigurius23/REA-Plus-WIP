.class public final Lt23/i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lt23/c0;


# direct methods
.method public synthetic constructor <init>(Lt23/c0;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lt23/i;->w:I

    iput-object p1, p0, Lt23/i;->y:Lt23/c0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Lt23/i;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lt23/i;

    iget-object v0, p0, Lt23/i;->y:Lt23/c0;

    const/4 v1, 0x4

    invoke-direct {p1, v0, p2, v1}, Lt23/i;-><init>(Lt23/c0;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lt23/i;

    iget-object v0, p0, Lt23/i;->y:Lt23/c0;

    const/4 v1, 0x3

    invoke-direct {p1, v0, p2, v1}, Lt23/i;-><init>(Lt23/c0;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Lt23/i;

    iget-object v0, p0, Lt23/i;->y:Lt23/c0;

    const/4 v1, 0x2

    invoke-direct {p1, v0, p2, v1}, Lt23/i;-><init>(Lt23/c0;Lq83/d;I)V

    return-object p1

    :pswitch_2
    new-instance p1, Lt23/i;

    iget-object v0, p0, Lt23/i;->y:Lt23/c0;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Lt23/i;-><init>(Lt23/c0;Lq83/d;I)V

    return-object p1

    :pswitch_3
    new-instance p1, Lt23/i;

    iget-object v0, p0, Lt23/i;->y:Lt23/c0;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Lt23/i;-><init>(Lt23/c0;Lq83/d;I)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lt23/i;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lt23/i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lt23/i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lt23/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lt23/i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lt23/i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lt23/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lt23/i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lt23/i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lt23/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lt23/i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lt23/i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lt23/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p0, p1, p2}, Lt23/i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lt23/i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lt23/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lt23/i;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lt23/i;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-eq v1, v2, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-static {p1}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object p1

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lt23/i;->y:Lt23/c0;

    iget-object v1, p1, Lt23/c0;->C:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld33/h1;

    if-eqz v1, :cond_2

    iget-object v1, v1, Ld33/h1;->z:Lec3/h2;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le33/v0;

    if-eqz v1, :cond_2

    iget-object v1, v1, Le33/u;->s:Lec3/h2;

    if-eqz v1, :cond_2

    new-instance v3, Lt23/x;

    invoke-direct {v3, p1}, Lt23/x;-><init>(Lt23/c0;)V

    iput v2, p0, Lt23/i;->x:I

    invoke-virtual {v1, v3, p0}, Lec3/h2;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_0
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lt23/i;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    if-eq v1, v2, :cond_3

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {p1}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object p1

    throw p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lt23/i;->y:Lt23/c0;

    iget-object v1, p1, Lt23/c0;->C:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld33/h1;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ld33/h1;->t()Ly33/e;

    move-result-object v1

    iget-object v1, v1, Ly33/e;->e:Lh53/f;

    iget-object v1, v1, Lh53/f;->e:Lec3/w1;

    new-instance v3, Lt23/h;

    const/4 v4, 0x1

    invoke-direct {v3, p1, v4}, Lt23/h;-><init>(Lt23/c0;I)V

    iput v2, p0, Lt23/i;->x:I

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v3, p0}, Lec3/w1;->k(Lec3/w1;Lec3/m;Lq83/d;)V

    goto :goto_1

    :cond_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object v0

    :pswitch_1
    iget-object v0, p0, Lt23/i;->y:Lt23/c0;

    iget-object v1, v0, Lt23/c0;->g:Lt23/b4;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lt23/i;->x:I

    const/4 v4, 0x1

    if-eqz v3, :cond_7

    if-ne v3, v4, :cond_6

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-wide v5, v1, Lt23/b4;->P:J

    const/16 p1, 0x3e8

    int-to-long v7, p1

    mul-long/2addr v5, v7

    iput v4, p0, Lt23/i;->x:I

    invoke-static {v5, v6, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_8

    goto/16 :goto_4

    :cond_8
    :goto_2
    iget-object p1, v0, Lt23/c0;->p:Lt23/s0;

    iget-object p1, p1, Lt23/s0;->h:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt23/q2;

    instance-of v2, p1, Lt23/h2;

    const/4 v3, 0x0

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    if-eqz v2, :cond_a

    invoke-virtual {v0}, Lt23/c0;->g()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v5, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v6, "[NetworkStateListener#onDisconnected] #network; Already reconnected ("

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ") \u2014 not leaving"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v5, v2, p1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    :goto_3
    move-object v2, v4

    goto :goto_4

    :cond_a
    iget-wide v5, v1, Lt23/b4;->P:J

    const-string v2, "Leaving after being disconnected for "

    invoke-static {v5, v6, v2}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lt23/c0;->g()Lb23/k;

    move-result-object v5

    iget-object v6, v5, Lb23/k;->c:Lb23/e;

    iget-object v7, v5, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->y:Lb23/g;

    invoke-interface {v6, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_b

    iget-object v5, v5, Lb23/k;->b:Lb23/j;

    iget-wide v9, v1, Lt23/b4;->P:J

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v6, "[NetworkStateListener#onDisconnected] #network; Leaving after being disconnected for "

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, " (connection="

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v5, v8, v7, p1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_b
    new-instance p1, Lt23/d0;

    sget-object v1, Lt23/g;->x:Lt23/g;

    invoke-direct {p1, v1, v2}, Lt23/d0;-><init>(Lt23/g;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lt23/c0;->p(Lt23/i0;)V

    goto :goto_3

    :goto_4
    return-object v2

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lt23/i;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_e

    if-ne v1, v3, :cond_d

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_c
    move-object v0, v2

    goto :goto_6

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, p0, Lt23/i;->x:I

    sget-object p1, Lstream/video/sfu/models/WebsocketReconnectStrategy;->WEBSOCKET_RECONNECT_STRATEGY_MIGRATE:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    const-string v1, "migrate"

    iget-object v3, p0, Lt23/i;->y:Lt23/c0;

    invoke-virtual {v3, p1, v1, p0}, Lt23/c0;->s(Lstream/video/sfu/models/WebsocketReconnectStrategy;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_f

    goto :goto_5

    :cond_f
    move-object p1, v2

    :goto_5
    if-ne p1, v0, :cond_c

    :goto_6
    return-object v0

    :pswitch_3
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lt23/i;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_11

    if-eq v1, v2, :cond_10

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_10
    invoke-static {p1}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object p1

    throw p1

    :cond_11
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lt23/i;->y:Lt23/c0;

    iget-object v1, p1, Lt23/c0;->x:La00/g;

    iget-object v1, v1, La00/g;->E:Ljava/lang/Object;

    check-cast v1, Lec3/h2;

    new-instance v3, Lt23/h;

    const/4 v4, 0x0

    invoke-direct {v3, p1, v4}, Lt23/h;-><init>(Lt23/c0;I)V

    iput v2, p0, Lt23/i;->x:I

    invoke-virtual {v1, v3, p0}, Lec3/h2;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
