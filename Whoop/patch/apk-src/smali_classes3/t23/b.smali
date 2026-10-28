.class public final Lt23/b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public synthetic y:Lec3/m;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILq83/d;)V
    .locals 0

    iput p2, p0, Lt23/b;->w:I

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lt23/b;->w:I

    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lt23/b;

    const/4 v1, 0x3

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2, p3}, Lt23/b;-><init>(IILq83/d;)V

    iput-object p1, v0, Lt23/b;->y:Lec3/m;

    iput-object p2, v0, Lt23/b;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lt23/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    new-instance v0, Lt23/b;

    const/4 v1, 0x3

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, p3}, Lt23/b;-><init>(IILq83/d;)V

    iput-object p1, v0, Lt23/b;->y:Lec3/m;

    iput-object p2, v0, Lt23/b;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lt23/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    new-instance v0, Lt23/b;

    const/4 v1, 0x3

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, p3}, Lt23/b;-><init>(IILq83/d;)V

    iput-object p1, v0, Lt23/b;->y:Lec3/m;

    iput-object p2, v0, Lt23/b;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lt23/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    new-instance v0, Lt23/b;

    const/4 v1, 0x3

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, p3}, Lt23/b;-><init>(IILq83/d;)V

    iput-object p1, v0, Lt23/b;->y:Lec3/m;

    iput-object p2, v0, Lt23/b;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lt23/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    new-instance v0, Lt23/b;

    const/4 v1, 0x3

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, p3}, Lt23/b;-><init>(IILq83/d;)V

    iput-object p1, v0, Lt23/b;->y:Lec3/m;

    iput-object p2, v0, Lt23/b;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lt23/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    new-instance v0, Lt23/b;

    const/4 v1, 0x3

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, p3}, Lt23/b;-><init>(IILq83/d;)V

    iput-object p1, v0, Lt23/b;->y:Lec3/m;

    iput-object p2, v0, Lt23/b;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lt23/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance v0, Lt23/b;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p3}, Lt23/b;-><init>(IILq83/d;)V

    iput-object p1, v0, Lt23/b;->y:Lec3/m;

    iput-object p2, v0, Lt23/b;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lt23/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lt23/b;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lt23/b;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lt23/b;->y:Lec3/m;

    iget-object v1, p0, Lt23/b;->z:Ljava/lang/Object;

    check-cast v1, Lt23/g2;

    if-nez v1, :cond_2

    new-instance v1, La6/u;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v1, v4, v3}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_2
    iget-object v1, v1, Lt23/g2;->p:Lec3/h2;

    new-instance v3, Lch/o;

    const/16 v4, 0x8

    invoke-direct {v3, v1, v4}, Lch/o;-><init>(Lec3/l;I)V

    move-object v1, v3

    :goto_0
    iput v2, p0, Lt23/b;->x:I

    invoke-static {p1, v1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_2
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lt23/b;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_5

    if-ne v1, v2, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    goto :goto_3

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lt23/b;->y:Lec3/m;

    iget-object v1, p0, Lt23/b;->z:Ljava/lang/Object;

    check-cast v1, Le33/v0;

    iget-object v3, v1, Le33/u;->r:Lec3/h2;

    iput v2, p0, Lt23/b;->x:I

    invoke-static {p1}, Lec3/v;->y(Lec3/m;)V

    new-instance v2, Landroidx/room/x;

    const/16 v4, 0x13

    invoke-direct {v2, v4, p1, v1}, Landroidx/room/x;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Lw;

    const/16 v1, 0x14

    invoke-direct {p1, v2, v1}, Lw;-><init>(Lec3/m;I)V

    invoke-virtual {v3, p1, p0}, Lec3/h2;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    :goto_3
    return-object v0

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lt23/b;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_7

    if-ne v1, v2, :cond_6

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    goto :goto_4

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lt23/b;->y:Lec3/m;

    iget-object v1, p0, Lt23/b;->z:Ljava/lang/Object;

    check-cast v1, Ld33/h1;

    iget-object v1, v1, Ld33/h1;->z:Lec3/h2;

    iput v2, p0, Lt23/b;->x:I

    invoke-static {p1}, Lec3/v;->y(Lec3/m;)V

    new-instance v2, La6/t;

    const/4 v3, 0x2

    invoke-direct {v2, p1, v3}, La6/t;-><init>(Lec3/m;I)V

    invoke-virtual {v1, v2, p0}, Lec3/h2;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    :goto_4
    return-object v0

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lt23/b;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_9

    if-ne v1, v2, :cond_8

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    goto :goto_5

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lt23/b;->y:Lec3/m;

    iget-object v1, p0, Lt23/b;->z:Ljava/lang/Object;

    check-cast v1, Le33/n;

    iget-object v3, v1, Le33/u;->s:Lec3/h2;

    iput v2, p0, Lt23/b;->x:I

    invoke-static {p1}, Lec3/v;->y(Lec3/m;)V

    new-instance v2, Landroidx/room/x;

    const/16 v4, 0xf

    invoke-direct {v2, v4, p1, v1}, Landroidx/room/x;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v2, p0}, Lec3/h2;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    :goto_5
    return-object v0

    :pswitch_3
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lt23/b;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_b

    if-ne v1, v2, :cond_a

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    goto :goto_6

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lt23/b;->y:Lec3/m;

    iget-object v1, p0, Lt23/b;->z:Ljava/lang/Object;

    check-cast v1, Ld33/h1;

    iget-object v1, v1, Ld33/h1;->A:Lec3/h2;

    iput v2, p0, Lt23/b;->x:I

    invoke-static {p1}, Lec3/v;->y(Lec3/m;)V

    new-instance v2, La6/t;

    const/4 v3, 0x2

    invoke-direct {v2, p1, v3}, La6/t;-><init>(Lec3/m;I)V

    invoke-virtual {v1, v2, p0}, Lec3/h2;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    :goto_6
    return-object v0

    :pswitch_4
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lt23/b;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_d

    if-ne v1, v2, :cond_c

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_7

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lt23/b;->y:Lec3/m;

    iget-object v1, p0, Lt23/b;->z:Ljava/lang/Object;

    check-cast v1, Le33/n;

    iget-object v1, v1, Le33/u;->r:Lec3/h2;

    iput v2, p0, Lt23/b;->x:I

    invoke-static {p1, v1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_e

    goto :goto_8

    :cond_e
    :goto_7
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_8
    return-object v0

    :pswitch_5
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lt23/b;->x:I

    const/4 v2, 0x1

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    if-eqz v1, :cond_11

    if-ne v1, v2, :cond_10

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_f
    move-object v0, v3

    goto :goto_c

    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_11
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lt23/b;->y:Lec3/m;

    iget-object v1, p0, Lt23/b;->z:Ljava/lang/Object;

    check-cast v1, Ld33/h1;

    iget-object v1, v1, Ld33/h1;->A:Lec3/h2;

    new-instance v4, Lch/i;

    const/4 v5, 0x2

    invoke-direct {v4, v1, v5}, Lch/i;-><init>(Lec3/l;I)V

    new-instance v1, Lt23/b;

    const/4 v5, 0x3

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-direct {v1, v5, v6, v7}, Lt23/b;-><init>(IILq83/d;)V

    invoke-static {v4, v1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v1

    iput v2, p0, Lt23/b;->x:I

    invoke-static {p1}, Lec3/v;->y(Lec3/m;)V

    new-instance v2, Lw;

    const/16 v4, 0x10

    invoke-direct {v2, p1, v4}, Lw;-><init>(Lec3/m;I)V

    new-instance p1, Lw;

    const/16 v4, 0xf

    invoke-direct {p1, v2, v4}, Lw;-><init>(Lec3/m;I)V

    invoke-virtual {v1, p1, p0}, Lfc3/g;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_12

    goto :goto_9

    :cond_12
    move-object p1, v3

    :goto_9
    if-ne p1, v0, :cond_13

    goto :goto_a

    :cond_13
    move-object p1, v3

    :goto_a
    if-ne p1, v0, :cond_14

    goto :goto_b

    :cond_14
    move-object p1, v3

    :goto_b
    if-ne p1, v0, :cond_f

    :goto_c
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
