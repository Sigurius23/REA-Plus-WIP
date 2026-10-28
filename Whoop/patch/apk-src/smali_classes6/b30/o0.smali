.class public final Lb30/o0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lb30/q0;


# direct methods
.method public synthetic constructor <init>(Lb30/q0;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lb30/o0;->w:I

    iput-object p1, p0, Lb30/o0;->y:Lb30/q0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Lb30/o0;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lb30/o0;

    iget-object v0, p0, Lb30/o0;->y:Lb30/q0;

    const/4 v1, 0x7

    invoke-direct {p1, v0, p2, v1}, Lb30/o0;-><init>(Lb30/q0;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lb30/o0;

    iget-object v0, p0, Lb30/o0;->y:Lb30/q0;

    const/4 v1, 0x6

    invoke-direct {p1, v0, p2, v1}, Lb30/o0;-><init>(Lb30/q0;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Lb30/o0;

    iget-object v0, p0, Lb30/o0;->y:Lb30/q0;

    const/4 v1, 0x5

    invoke-direct {p1, v0, p2, v1}, Lb30/o0;-><init>(Lb30/q0;Lq83/d;I)V

    return-object p1

    :pswitch_2
    new-instance p1, Lb30/o0;

    iget-object v0, p0, Lb30/o0;->y:Lb30/q0;

    const/4 v1, 0x4

    invoke-direct {p1, v0, p2, v1}, Lb30/o0;-><init>(Lb30/q0;Lq83/d;I)V

    return-object p1

    :pswitch_3
    new-instance p1, Lb30/o0;

    iget-object v0, p0, Lb30/o0;->y:Lb30/q0;

    const/4 v1, 0x3

    invoke-direct {p1, v0, p2, v1}, Lb30/o0;-><init>(Lb30/q0;Lq83/d;I)V

    return-object p1

    :pswitch_4
    new-instance p1, Lb30/o0;

    iget-object v0, p0, Lb30/o0;->y:Lb30/q0;

    const/4 v1, 0x2

    invoke-direct {p1, v0, p2, v1}, Lb30/o0;-><init>(Lb30/q0;Lq83/d;I)V

    return-object p1

    :pswitch_5
    new-instance p1, Lb30/o0;

    iget-object v0, p0, Lb30/o0;->y:Lb30/q0;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Lb30/o0;-><init>(Lb30/q0;Lq83/d;I)V

    return-object p1

    :pswitch_6
    new-instance p1, Lb30/o0;

    iget-object v0, p0, Lb30/o0;->y:Lb30/q0;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Lb30/o0;-><init>(Lb30/q0;Lq83/d;I)V

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

    iget v0, p0, Lb30/o0;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lb30/o0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb30/o0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb30/o0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lb30/o0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb30/o0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb30/o0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lb30/o0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb30/o0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb30/o0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lb30/o0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb30/o0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb30/o0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_3
    invoke-virtual {p0, p1, p2}, Lb30/o0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb30/o0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb30/o0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_4
    invoke-virtual {p0, p1, p2}, Lb30/o0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb30/o0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb30/o0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_5
    invoke-virtual {p0, p1, p2}, Lb30/o0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb30/o0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb30/o0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_6
    invoke-virtual {p0, p1, p2}, Lb30/o0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb30/o0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb30/o0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

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

    iget v0, p0, Lb30/o0;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lb30/o0;->x:I

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

    iget-object p1, p0, Lb30/o0;->y:Lb30/q0;

    iget-object v1, p1, Lb30/q0;->g:Ln53/e;

    new-instance v3, Lb30/n0;

    const/4 v4, 0x7

    invoke-direct {v3, p1, v4}, Lb30/n0;-><init>(Lb30/q0;I)V

    iput v2, p0, Lb30/o0;->x:I

    invoke-virtual {v1, v3, p0}, Ln53/e;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lb30/o0;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v2, :cond_2

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object p1

    throw p1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lb30/o0;->y:Lb30/q0;

    iget-object v1, p1, Lb30/q0;->o:Lec3/h2;

    iget-object v3, p1, Lb30/q0;->i:Lec3/f2;

    iget-object v4, p1, Lb30/q0;->a:Lec3/f2;

    new-instance v5, Lf;

    invoke-direct {v5, p1}, Lf;-><init>(Lb30/q0;)V

    invoke-static {v1, v3, v4, v5}, Lbi/g;->t(Lec3/f2;Lec3/f2;Lec3/f2;Lkotlin/jvm/functions/Function3;)Ln53/e;

    move-result-object v1

    new-instance v3, Lb30/n0;

    const/4 v4, 0x6

    invoke-direct {v3, p1, v4}, Lb30/n0;-><init>(Lb30/q0;I)V

    iput v2, p0, Lb30/o0;->x:I

    invoke-virtual {v1, v3, p0}, Ln53/e;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    return-object v0

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lb30/o0;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_6

    if-ne v1, v3, :cond_5

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_4
    move-object v0, v2

    goto :goto_1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lb30/o0;->y:Lb30/q0;

    iget-object v1, p1, Lb30/q0;->h:Lec3/f2;

    new-instance v4, Lb30/n0;

    const/4 v5, 0x5

    invoke-direct {v4, p1, v5}, Lb30/n0;-><init>(Lb30/q0;I)V

    iput v3, p0, Lb30/o0;->x:I

    new-instance p1, Lw;

    const/4 v3, 0x1

    invoke-direct {p1, v4, v3}, Lw;-><init>(Lec3/m;I)V

    invoke-interface {v1, p1, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_0

    :cond_7
    move-object p1, v2

    :goto_0
    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lb30/o0;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_9

    if-eq v1, v2, :cond_8

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_9
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lb30/o0;->y:Lb30/q0;

    iget-object v1, p1, Lb30/q0;->f:Lec3/f2;

    new-instance v3, Lb30/n0;

    const/4 v4, 0x4

    invoke-direct {v3, p1, v4}, Lb30/n0;-><init>(Lb30/q0;I)V

    iput v2, p0, Lb30/o0;->x:I

    invoke-interface {v1, v3, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    return-object v0

    :cond_a
    :goto_2
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :pswitch_3
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lb30/o0;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_c

    if-eq v1, v2, :cond_b

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_c
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lb30/o0;->y:Lb30/q0;

    iget-object v1, p1, Lb30/q0;->d:Lec3/f2;

    new-instance v3, Lb30/n0;

    const/4 v4, 0x3

    invoke-direct {v3, p1, v4}, Lb30/n0;-><init>(Lb30/q0;I)V

    iput v2, p0, Lb30/o0;->x:I

    invoke-interface {v1, v3, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_d

    return-object v0

    :cond_d
    :goto_3
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :pswitch_4
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lb30/o0;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_f

    if-eq v1, v2, :cond_e

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_f
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lb30/o0;->y:Lb30/q0;

    iget-object v1, p1, Lb30/q0;->c:Lec3/f2;

    new-instance v3, Lb30/n0;

    const/4 v4, 0x2

    invoke-direct {v3, p1, v4}, Lb30/n0;-><init>(Lb30/q0;I)V

    iput v2, p0, Lb30/o0;->x:I

    invoke-interface {v1, v3, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_10

    return-object v0

    :cond_10
    :goto_4
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :pswitch_5
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lb30/o0;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_12

    if-eq v1, v2, :cond_11

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_11
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_12
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lb30/o0;->y:Lb30/q0;

    iget-object v1, p1, Lb30/q0;->b:Lec3/f2;

    new-instance v3, Lb30/n0;

    const/4 v4, 0x1

    invoke-direct {v3, p1, v4}, Lb30/n0;-><init>(Lb30/q0;I)V

    iput v2, p0, Lb30/o0;->x:I

    invoke-interface {v1, v3, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_13

    return-object v0

    :cond_13
    :goto_5
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :pswitch_6
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lb30/o0;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_15

    if-eq v1, v2, :cond_14

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_14
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_6

    :cond_15
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lb30/o0;->y:Lb30/q0;

    iget-object v1, p1, Lb30/q0;->a:Lec3/f2;

    new-instance v3, Lb30/n0;

    const/4 v4, 0x0

    invoke-direct {v3, p1, v4}, Lb30/n0;-><init>(Lb30/q0;I)V

    iput v2, p0, Lb30/o0;->x:I

    invoke-interface {v1, v3, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_16

    return-object v0

    :cond_16
    :goto_6
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

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
