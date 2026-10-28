.class public final Ll43/b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lt23/b4;


# direct methods
.method public synthetic constructor <init>(Lt23/b4;Lq83/d;I)V
    .locals 0

    iput p3, p0, Ll43/b;->w:I

    iput-object p1, p0, Ll43/b;->y:Lt23/b4;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Ll43/b;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ll43/b;

    iget-object v0, p0, Ll43/b;->y:Lt23/b4;

    const/4 v1, 0x7

    invoke-direct {p1, v0, p2, v1}, Ll43/b;-><init>(Lt23/b4;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Ll43/b;

    iget-object v0, p0, Ll43/b;->y:Lt23/b4;

    const/4 v1, 0x6

    invoke-direct {p1, v0, p2, v1}, Ll43/b;-><init>(Lt23/b4;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Ll43/b;

    iget-object v0, p0, Ll43/b;->y:Lt23/b4;

    const/4 v1, 0x5

    invoke-direct {p1, v0, p2, v1}, Ll43/b;-><init>(Lt23/b4;Lq83/d;I)V

    return-object p1

    :pswitch_2
    new-instance p1, Ll43/b;

    iget-object v0, p0, Ll43/b;->y:Lt23/b4;

    const/4 v1, 0x4

    invoke-direct {p1, v0, p2, v1}, Ll43/b;-><init>(Lt23/b4;Lq83/d;I)V

    return-object p1

    :pswitch_3
    new-instance p1, Ll43/b;

    iget-object v0, p0, Ll43/b;->y:Lt23/b4;

    const/4 v1, 0x3

    invoke-direct {p1, v0, p2, v1}, Ll43/b;-><init>(Lt23/b4;Lq83/d;I)V

    return-object p1

    :pswitch_4
    new-instance p1, Ll43/b;

    iget-object v0, p0, Ll43/b;->y:Lt23/b4;

    const/4 v1, 0x2

    invoke-direct {p1, v0, p2, v1}, Ll43/b;-><init>(Lt23/b4;Lq83/d;I)V

    return-object p1

    :pswitch_5
    new-instance p1, Ll43/b;

    iget-object v0, p0, Ll43/b;->y:Lt23/b4;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Ll43/b;-><init>(Lt23/b4;Lq83/d;I)V

    return-object p1

    :pswitch_6
    new-instance p1, Ll43/b;

    iget-object v0, p0, Ll43/b;->y:Lt23/b4;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Ll43/b;-><init>(Lt23/b4;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ll43/b;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Ll43/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ll43/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ll43/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Ll43/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ll43/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ll43/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Ll43/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ll43/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ll43/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p1, p2}, Ll43/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ll43/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ll43/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_3
    invoke-virtual {p0, p1, p2}, Ll43/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ll43/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ll43/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p0, p1, p2}, Ll43/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ll43/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ll43/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_5
    invoke-virtual {p0, p1, p2}, Ll43/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ll43/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ll43/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-virtual {p0, p1, p2}, Ll43/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ll43/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ll43/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Ll43/b;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ll43/b;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ll43/b;->y:Lt23/b4;

    iget-object p1, p1, Lt23/b4;->E:Ly33/c;

    iget-object p1, p1, Ly33/c;->j:Lf53/k;

    iget-object p1, p1, Lf53/k;->h:Lec3/h2;

    sget-object v1, Lf53/g;->y:Lf53/g;

    invoke-static {p1, v1}, Lx30/s0;->x(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p1

    new-instance v1, Ld33/x;

    const/4 v3, 0x2

    const/16 v4, 0x8

    const/4 v5, 0x0

    invoke-direct {v1, v3, v4, v5}, Ld33/x;-><init>(IILq83/d;)V

    iput v2, p0, Ll43/b;->x:I

    invoke-static {p1, v1, p0}, Lec3/v;->z(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    :goto_1
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ll43/b;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    if-ne v1, v2, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v2, p0, Ll43/b;->x:I

    iget-object p1, p0, Ll43/b;->y:Lt23/b4;

    invoke-virtual {p1, p0}, Lt23/b4;->w(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    move-object p1, v0

    :cond_5
    :goto_2
    return-object p1

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ll43/b;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_7

    if-ne v1, v2, :cond_6

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    goto :goto_3

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ll43/b;->y:Lt23/b4;

    iget-object v1, p1, Lt23/b4;->V:Ld33/c;

    iget-object v1, v1, Ld33/c;->a:Lec3/h2;

    new-instance v3, Lt23/m3;

    const/4 v4, 0x4

    invoke-direct {v3, p1, v4}, Lt23/m3;-><init>(Lt23/b4;I)V

    iput v2, p0, Ll43/b;->x:I

    new-instance p1, Lw;

    const/16 v2, 0x13

    invoke-direct {p1, v3, v2}, Lw;-><init>(Lec3/m;I)V

    new-instance v2, Lw;

    const/16 v3, 0x12

    invoke-direct {v2, p1, v3}, Lw;-><init>(Lec3/m;I)V

    new-instance p1, La6/t;

    const/4 v3, 0x2

    invoke-direct {p1, v2, v3}, La6/t;-><init>(Lec3/m;I)V

    invoke-virtual {v1, p1, p0}, Lec3/h2;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    :goto_3
    return-object v0

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ll43/b;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_9

    if-eq v1, v2, :cond_8

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    invoke-static {p1}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object p1

    throw p1

    :cond_9
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ll43/b;->y:Lt23/b4;

    iget-object v1, p1, Lt23/b4;->E:Ly33/c;

    iget-object v1, v1, Ly33/c;->j:Lf53/k;

    iget-object v1, v1, Lf53/k;->j:Lec3/h2;

    new-instance v3, Lt23/m3;

    const/4 v4, 0x3

    invoke-direct {v3, p1, v4}, Lt23/m3;-><init>(Lt23/b4;I)V

    iput v2, p0, Ll43/b;->x:I

    invoke-virtual {v1, v3, p0}, Lec3/h2;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    return-object v0

    :pswitch_3
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ll43/b;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_b

    if-ne v1, v2, :cond_a

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    goto :goto_4

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ll43/b;->y:Lt23/b4;

    iget-object v1, p1, Lt23/b4;->E:Ly33/c;

    iget-object v1, v1, Ly33/c;->j:Lf53/k;

    iget-object v1, v1, Lf53/k;->f:Lec3/w1;

    new-instance v3, Lt23/m3;

    const/4 v4, 0x2

    invoke-direct {v3, p1, v4}, Lt23/m3;-><init>(Lt23/b4;I)V

    iput v2, p0, Ll43/b;->x:I

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v3, p0}, Lec3/w1;->k(Lec3/w1;Lec3/m;Lq83/d;)V

    :goto_4
    return-object v0

    :pswitch_4
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ll43/b;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_d

    if-eq v1, v2, :cond_c

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    invoke-static {p1}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object p1

    throw p1

    :cond_d
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ll43/b;->y:Lt23/b4;

    iget-object v1, p1, Lt23/b4;->E:Ly33/c;

    iget-object v1, v1, Ly33/c;->j:Lf53/k;

    iget-object v1, v1, Lf53/k;->j:Lec3/h2;

    new-instance v3, Lt23/m3;

    const/4 v4, 0x1

    invoke-direct {v3, p1, v4}, Lt23/m3;-><init>(Lt23/b4;I)V

    iput v2, p0, Ll43/b;->x:I

    invoke-virtual {v1, v3, p0}, Lec3/h2;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    return-object v0

    :pswitch_5
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ll43/b;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_f

    if-ne v1, v2, :cond_e

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    goto :goto_5

    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_f
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ll43/b;->y:Lt23/b4;

    iget-object v1, p1, Lt23/b4;->E:Ly33/c;

    iget-object v1, v1, Ly33/c;->j:Lf53/k;

    iget-object v1, v1, Lf53/k;->g:Lec3/w1;

    new-instance v3, Lt23/m3;

    const/4 v4, 0x0

    invoke-direct {v3, p1, v4}, Lt23/m3;-><init>(Lt23/b4;I)V

    iput v2, p0, Ll43/b;->x:I

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v3, p0}, Lec3/w1;->k(Lec3/w1;Lec3/m;Lq83/d;)V

    :goto_5
    return-object v0

    :pswitch_6
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ll43/b;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_12

    if-ne v1, v3, :cond_11

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_10
    move-object v0, v2

    goto :goto_7

    :cond_11
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_12
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, p0, Ll43/b;->x:I

    new-instance p1, Lt23/q3;

    const/4 v1, 0x0

    const/4 v3, 0x1

    iget-object v4, p0, Ll43/b;->y:Lt23/b4;

    invoke-direct {p1, v4, v1, v3}, Lt23/q3;-><init>(Lt23/b4;Lq83/d;I)V

    invoke-static {p1, p0}, Lvd/e;->X(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_13

    goto :goto_6

    :cond_13
    move-object p1, v2

    :goto_6
    if-ne p1, v0, :cond_10

    :goto_7
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
