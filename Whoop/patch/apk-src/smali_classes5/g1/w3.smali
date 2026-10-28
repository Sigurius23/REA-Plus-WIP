.class public final Lg1/w3;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lg1/y3;


# direct methods
.method public synthetic constructor <init>(Lg1/y3;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lg1/w3;->w:I

    iput-object p1, p0, Lg1/w3;->y:Lg1/y3;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Lg1/w3;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lg1/w3;

    iget-object v0, p0, Lg1/w3;->y:Lg1/y3;

    const/4 v1, 0x3

    invoke-direct {p1, v0, p2, v1}, Lg1/w3;-><init>(Lg1/y3;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lg1/w3;

    iget-object v0, p0, Lg1/w3;->y:Lg1/y3;

    const/4 v1, 0x2

    invoke-direct {p1, v0, p2, v1}, Lg1/w3;-><init>(Lg1/y3;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Lg1/w3;

    iget-object v0, p0, Lg1/w3;->y:Lg1/y3;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Lg1/w3;-><init>(Lg1/y3;Lq83/d;I)V

    return-object p1

    :pswitch_2
    new-instance p1, Lg1/w3;

    iget-object v0, p0, Lg1/w3;->y:Lg1/y3;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Lg1/w3;-><init>(Lg1/y3;Lq83/d;I)V

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

    iget v0, p0, Lg1/w3;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lg1/w3;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg1/w3;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg1/w3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lg1/w3;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg1/w3;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg1/w3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lg1/w3;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg1/w3;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg1/w3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lg1/w3;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg1/w3;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg1/w3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lg1/w3;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lg1/w3;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_0
    move-object v0, v2

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, p0, Lg1/w3;->x:I

    iget-object p1, p0, Lg1/w3;->y:Lg1/y3;

    iget-object v1, p1, Lg1/y3;->b:Lg1/a0;

    invoke-virtual {v1}, Lg1/a0;->e()Lg1/k3;

    move-result-object v1

    sget-object v3, Lg1/z3;->y:Lg1/z3;

    iget-object v1, v1, Lg1/k3;->a:Ljava/util/Map;

    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    :cond_3
    move-object p1, v2

    goto :goto_0

    :cond_4
    invoke-static {p1, v3, p0}, Lg1/y3;->a(Lg1/y3;Lg1/z3;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    :goto_0
    if-ne p1, v0, :cond_0

    :goto_1
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lg1/w3;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_7

    if-ne v1, v3, :cond_6

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_5
    move-object v0, v2

    goto :goto_3

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, p0, Lg1/w3;->x:I

    iget-object p1, p0, Lg1/w3;->y:Lg1/y3;

    iget-object v1, p1, Lg1/y3;->b:Lg1/a0;

    invoke-virtual {v1}, Lg1/a0;->e()Lg1/k3;

    move-result-object v1

    sget-object v3, Lg1/z3;->x:Lg1/z3;

    iget-object v1, v1, Lg1/k3;->a:Ljava/util/Map;

    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    :cond_8
    move-object p1, v2

    goto :goto_2

    :cond_9
    invoke-static {p1, v3, p0}, Lg1/y3;->a(Lg1/y3;Lg1/z3;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    :goto_2
    if-ne p1, v0, :cond_5

    :goto_3
    return-object v0

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lg1/w3;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_b

    if-ne v1, v2, :cond_a

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v2, p0, Lg1/w3;->x:I

    iget-object p1, p0, Lg1/w3;->y:Lg1/y3;

    invoke-virtual {p1, p0}, Lg1/y3;->d(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_c

    goto :goto_5

    :cond_c
    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_5
    return-object v0

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lg1/w3;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_e

    if-ne v1, v2, :cond_d

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_6

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v2, p0, Lg1/w3;->x:I

    iget-object p1, p0, Lg1/w3;->y:Lg1/y3;

    invoke-virtual {p1, p0}, Lg1/y3;->d(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_f

    goto :goto_7

    :cond_f
    :goto_6
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_7
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
