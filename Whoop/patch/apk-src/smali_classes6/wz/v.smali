.class public final Lwz/v;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lwz/y;


# direct methods
.method public synthetic constructor <init>(Lwz/y;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lwz/v;->w:I

    iput-object p1, p0, Lwz/v;->y:Lwz/y;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Lwz/v;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lwz/v;

    iget-object v0, p0, Lwz/v;->y:Lwz/y;

    const/4 v1, 0x2

    invoke-direct {p1, v0, p2, v1}, Lwz/v;-><init>(Lwz/y;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lwz/v;

    iget-object v0, p0, Lwz/v;->y:Lwz/y;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Lwz/v;-><init>(Lwz/y;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Lwz/v;

    iget-object v0, p0, Lwz/v;->y:Lwz/y;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Lwz/v;-><init>(Lwz/y;Lq83/d;I)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lwz/v;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lwz/v;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lwz/v;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lwz/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lwz/v;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lwz/v;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lwz/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lwz/v;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lwz/v;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lwz/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lwz/v;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lwz/v;->x:I

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

    iput v2, p0, Lwz/v;->x:I

    iget-object p1, p0, Lwz/v;->y:Lwz/y;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {p1, v1, v2, p0, v3}, Lwz/y;->t(Lwz/y;ZLcom/stripe/android/model/ConsumerSessionRefresh;Ls83/c;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lwz/v;->x:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_5

    if-eq v1, v3, :cond_4

    if-ne v1, v2, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_3

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lwz/v;->y:Lwz/y;

    iget-object v1, p1, Lwz/y;->K:Lwz/n0;

    instance-of v4, v1, Lwz/l0;

    if-nez v4, :cond_8

    instance-of v4, v1, Lwz/m0;

    if-nez v4, :cond_8

    instance-of v4, v1, Lwz/i0;

    if-nez v4, :cond_8

    instance-of v4, v1, Lwz/j0;

    if-eqz v4, :cond_6

    goto :goto_2

    :cond_6
    instance-of v3, v1, Lwz/k0;

    if-eqz v3, :cond_7

    check-cast v1, Lwz/k0;

    iget-object v1, v1, Lwz/k0;->w:Lwz/u0;

    iput v2, p0, Lwz/v;->x:I

    invoke-static {p1, v1, p0}, Lwz/y;->g(Lwz/y;Lwz/u0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    goto :goto_4

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    :goto_2
    iput v3, p0, Lwz/v;->x:I

    invoke-static {p1, p0}, Lwz/y;->j(Lwz/y;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    goto :goto_4

    :cond_9
    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_4
    return-object v0

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lwz/v;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_b

    if-ne v1, v2, :cond_a

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_5

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lwz/v;->y:Lwz/y;

    iget-object p1, p1, Lwz/y;->x:Lxz/x;

    iput v2, p0, Lwz/v;->x:I

    invoke-virtual {p1, p0}, Lxz/x;->i(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_c

    goto :goto_6

    :cond_c
    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_6
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
