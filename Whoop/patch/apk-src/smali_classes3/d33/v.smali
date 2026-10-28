.class public final Ld33/v;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Ld33/h1;


# direct methods
.method public synthetic constructor <init>(Ld33/h1;Lq83/d;I)V
    .locals 0

    iput p3, p0, Ld33/v;->w:I

    iput-object p1, p0, Ld33/v;->y:Ld33/h1;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Ld33/v;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ld33/v;

    iget-object v1, p0, Ld33/v;->y:Ld33/h1;

    const/4 v2, 0x1

    invoke-direct {v0, v1, p1, v2}, Ld33/v;-><init>(Ld33/h1;Lq83/d;I)V

    return-object v0

    :pswitch_0
    new-instance v0, Ld33/v;

    iget-object v1, p0, Ld33/v;->y:Ld33/h1;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, Ld33/v;-><init>(Ld33/h1;Lq83/d;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ld33/v;->w:I

    check-cast p1, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1}, Ld33/v;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld33/v;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Ld33/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1}, Ld33/v;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld33/v;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Ld33/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Ld33/v;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld33/v;->y:Ld33/h1;

    iget-object v1, v0, Ld33/h1;->b:Lt23/c0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Ld33/v;->x:I

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v5, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_0
    move-object v2, v4

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ld33/h1;->s()Lb23/k;

    move-result-object p1

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v3, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->y:Lb23/g;

    invoke-interface {v0, v6, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    iget-object v0, v1, Lt23/c0;->p:Lt23/s0;

    iget-object v0, v0, Lt23/s0;->h:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v7, "[createPublisher] rejoin attempt EXECUTE, connection state: "

    const-string v8, " "

    invoke-static {v0, v7, v8}, Lih0/d0;->j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v7, 0x0

    invoke-interface {p1, v6, v3, v0, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iput v5, p0, Ld33/v;->x:I

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lstream/video/sfu/models/WebsocketReconnectStrategy;->WEBSOCKET_RECONNECT_STRATEGY_REJOIN:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    const-string v0, "Publisher#ERROR_CODE_REQUEST_VALIDATION_FAILED"

    invoke-virtual {v1, p1, v0, p0}, Lt23/c0;->s(Lstream/video/sfu/models/WebsocketReconnectStrategy;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_4

    goto :goto_0

    :cond_4
    move-object p1, v4

    :goto_0
    if-ne p1, v2, :cond_0

    :goto_1
    return-object v2

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ld33/v;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_7

    if-eq v1, v2, :cond_5

    const/4 v0, 0x2

    if-ne v1, v0, :cond_6

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld33/v;->y:Ld33/h1;

    invoke-virtual {p1}, Ld33/h1;->t()Ly33/e;

    move-result-object p1

    iget-object p1, p1, Ly33/e;->e:Lh53/f;

    iput v2, p0, Ld33/v;->x:I

    invoke-virtual {p1, p0}, Lh53/f;->i(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto :goto_3

    :cond_8
    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_3
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
