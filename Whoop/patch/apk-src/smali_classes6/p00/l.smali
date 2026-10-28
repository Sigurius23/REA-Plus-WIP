.class public final Lp00/l;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lp00/o;


# direct methods
.method public synthetic constructor <init>(Lp00/o;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lp00/l;->w:I

    iput-object p1, p0, Lp00/l;->y:Lp00/o;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Lp00/l;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lp00/l;

    iget-object v0, p0, Lp00/l;->y:Lp00/o;

    const/4 v1, 0x3

    invoke-direct {p1, v0, p2, v1}, Lp00/l;-><init>(Lp00/o;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lp00/l;

    iget-object v0, p0, Lp00/l;->y:Lp00/o;

    const/4 v1, 0x2

    invoke-direct {p1, v0, p2, v1}, Lp00/l;-><init>(Lp00/o;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Lp00/l;

    iget-object v0, p0, Lp00/l;->y:Lp00/o;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Lp00/l;-><init>(Lp00/o;Lq83/d;I)V

    return-object p1

    :pswitch_2
    new-instance p1, Lp00/l;

    iget-object v0, p0, Lp00/l;->y:Lp00/o;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Lp00/l;-><init>(Lp00/o;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lp00/l;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lp00/l;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp00/l;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp00/l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lp00/l;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp00/l;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp00/l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lp00/l;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp00/l;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp00/l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lp00/l;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp00/l;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp00/l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget v0, p0, Lp00/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v1, p0, Lp00/l;->y:Lp00/o;

    iget-object v2, v1, Lp00/o;->K:Lkotlin/jvm/functions/Function1;

    iget-object v3, v1, Lp00/o;->y:Lxz/x;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lp00/l;->x:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v0, :cond_2

    if-eq v0, v6, :cond_1

    if-ne v0, v5, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v1, Lp00/o;->w:Ld00/l;

    iget-boolean v0, p1, Ld00/l;->E:Z

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    move-object p1, v7

    :goto_0
    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    iput v6, p0, Lp00/l;->x:I

    invoke-virtual {v3, p0}, Lxz/x;->n(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v4, :cond_5

    goto/16 :goto_4

    :cond_5
    :goto_1
    instance-of v0, p1, Ll83/m;

    if-nez v0, :cond_7

    :try_start_0
    check-cast p1, Lcom/stripe/android/model/ConsumerSessionRefresh;

    iget-object p1, v3, Lxz/x;->a:Lxz/f0;

    iget-object p1, p1, Lxz/f0;->b:Lec3/r1;

    iget-object p1, p1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwz/d;

    iget-object p1, p1, Lwz/d;->w:Ld00/l;

    if-eqz p1, :cond_6

    goto :goto_2

    :cond_6
    const-string p1, "Required value was null."

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :cond_7
    :goto_2
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_9

    check-cast p1, Ld00/l;

    iget-object v0, p1, Ld00/l;->M:Ljava/lang/String;

    if-nez v0, :cond_8

    new-instance p1, Lwz/m;

    invoke-static {v3}, Ls3/d;->j(Lxz/x;)Lwz/e;

    move-result-object v0

    invoke-direct {p1, v0}, Lwz/m;-><init>(Lwz/e;)V

    invoke-interface {v2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_8
    iget-object v2, v1, Lp00/o;->x:Lxz/f0;

    new-instance v3, Lwz/d;

    iget-object v9, p1, Ld00/l;->w:Lcom/stripe/android/model/ConsumerSession;

    iget-object v10, p1, Ld00/l;->x:Ljava/lang/String;

    iget-object v11, p1, Ld00/l;->y:Lcom/stripe/android/model/DisplayablePaymentDetails;

    iget-object v12, p1, Ld00/l;->z:Ld00/m;

    const-string p1, "consumerSession"

    invoke-static {v9, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Ld00/l;

    const/4 v13, 0x1

    invoke-direct/range {v8 .. v13}, Ld00/l;-><init>(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Ld00/m;Z)V

    invoke-direct {v3, v8, v7}, Lwz/d;-><init>(Ld00/l;Lwz/c;)V

    invoke-virtual {v2, v3}, Lxz/f0;->a(Lwz/d;)V

    iget-object p1, v1, Lp00/o;->G:Lwz/s1;

    iget-object p1, p1, Lwz/s1;->a:Lec3/w1;

    iput v5, p0, Lp00/l;->x:I

    invoke-virtual {p1, v0, p0}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v4, :cond_a

    goto :goto_4

    :cond_9
    new-instance p1, Lwz/o;

    sget-object v1, Lwz/b;->w:Lwz/b;

    invoke-direct {p1, v0, v1}, Lwz/o;-><init>(Ljava/lang/Throwable;Lwz/e;)V

    invoke-interface {v2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    :goto_3
    sget-object v4, Ll83/a0;->a:Ll83/a0;

    :goto_4
    return-object v4

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lp00/l;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_d

    if-ne v1, v3, :cond_c

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_b
    move-object v0, v2

    goto :goto_6

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, p0, Lp00/l;->x:I

    iget-object p1, p0, Lp00/l;->y:Lp00/o;

    iget-object v1, p1, Lp00/o;->G:Lwz/s1;

    iget-object v1, v1, Lwz/s1;->b:Lec3/w1;

    new-instance v3, Ln20/j;

    const/4 v4, 0x0

    const/16 v5, 0xb

    invoke-direct {v3, p1, v4, v5}, Ln20/j;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v1, v3, p0}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_e

    goto :goto_5

    :cond_e
    move-object p1, v2

    :goto_5
    if-ne p1, v0, :cond_b

    :goto_6
    return-object v0

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lp00/l;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_10

    if-eq v1, v2, :cond_f

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_f
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_7

    :cond_10
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lp00/l;->y:Lp00/o;

    iget-object v1, p1, Lp00/o;->O:Lec3/r1;

    new-instance v3, Lu;

    const/16 v4, 0x14

    invoke-direct {v3, p1, v4}, Lu;-><init>(Ljava/lang/Object;I)V

    iput v2, p0, Lp00/l;->x:I

    iget-object p1, v1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p1, v3, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_11

    return-object v0

    :cond_11
    :goto_7
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lp00/l;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_13

    if-ne v1, v2, :cond_12

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_8

    :cond_12
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_13
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lp00/l;->y:Lp00/o;

    iget-object p1, p1, Lp00/o;->y:Lxz/x;

    iput v2, p0, Lp00/l;->x:I

    invoke-virtual {p1, p0}, Lxz/x;->i(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_14

    goto :goto_9

    :cond_14
    :goto_8
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_9
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
