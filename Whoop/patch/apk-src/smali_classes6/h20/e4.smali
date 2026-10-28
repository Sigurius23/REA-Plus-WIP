.class public final Lh20/e4;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lh20/k4;


# direct methods
.method public synthetic constructor <init>(Lh20/k4;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lh20/e4;->w:I

    iput-object p1, p0, Lh20/e4;->y:Lh20/k4;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Lh20/e4;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lh20/e4;

    iget-object v0, p0, Lh20/e4;->y:Lh20/k4;

    const/4 v1, 0x3

    invoke-direct {p1, v0, p2, v1}, Lh20/e4;-><init>(Lh20/k4;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lh20/e4;

    iget-object v0, p0, Lh20/e4;->y:Lh20/k4;

    const/4 v1, 0x2

    invoke-direct {p1, v0, p2, v1}, Lh20/e4;-><init>(Lh20/k4;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Lh20/e4;

    iget-object v0, p0, Lh20/e4;->y:Lh20/k4;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Lh20/e4;-><init>(Lh20/k4;Lq83/d;I)V

    return-object p1

    :pswitch_2
    new-instance p1, Lh20/e4;

    iget-object v0, p0, Lh20/e4;->y:Lh20/k4;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Lh20/e4;-><init>(Lh20/k4;Lq83/d;I)V

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

    iget v0, p0, Lh20/e4;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lh20/e4;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/e4;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/e4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lh20/e4;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/e4;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/e4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lh20/e4;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/e4;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/e4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lh20/e4;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/e4;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/e4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 7

    iget v0, p0, Lh20/e4;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lh20/e4;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_0
    move-object v0, v2

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lh20/e4;->y:Lh20/k4;

    iget-object p1, p1, Le30/c;->O:Lec3/w1;

    iput v3, p0, Lh20/e4;->x:I

    invoke-virtual {p1, v2, p0}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_0

    :goto_0
    return-object v0

    :pswitch_0
    iget-object v0, p0, Lh20/e4;->y:Lh20/k4;

    iget-object v1, v0, Lh20/k4;->c0:Lh20/w3;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lh20/e4;->x:I

    const/4 v4, 0x1

    if-eqz v3, :cond_4

    if-ne v3, v4, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v0, Lh20/k4;->d0:La30/a0;

    iget-object v3, v1, Lh20/w3;->w:La30/t0;

    new-instance v5, La30/n0;

    iget-object v6, v1, Lh20/w3;->x:Lh20/x1;

    invoke-direct {v5, v6}, La30/n0;-><init>(Lh20/x1;)V

    new-instance v6, La30/u0;

    iget-object v0, v0, Lh20/k4;->s0:Le10/r0;

    iget-boolean v0, v0, Le10/r0;->i:Z

    iget-boolean v1, v1, Lh20/w3;->E:Z

    invoke-direct {v6, v0, v1}, La30/u0;-><init>(ZZ)V

    iput v4, p0, Lh20/e4;->x:I

    invoke-virtual {p1, v3, v5, v6, p0}, La30/a0;->g(La30/t0;La30/n0;La30/u0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    new-instance v2, Ll83/n;

    invoke-direct {v2, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    :goto_2
    return-object v2

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lh20/e4;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_7

    if-ne v1, v2, :cond_6

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lh20/e4;->y:Lh20/k4;

    iget-object v1, p1, Lh20/k4;->s0:Le10/r0;

    iget-object v1, v1, Le10/r0;->k:Lec3/r1;

    new-instance v3, Landroidx/room/e;

    const/4 v4, 0x0

    const/16 v5, 0xc

    invoke-direct {v3, p1, v4, v5}, Landroidx/room/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput v2, p0, Lh20/e4;->x:I

    invoke-static {v1, v3, p0}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto :goto_4

    :cond_8
    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_4
    return-object v0

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lh20/e4;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_a

    if-ne v1, v2, :cond_9

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v2, p0, Lh20/e4;->x:I

    iget-object p1, p0, Lh20/e4;->y:Lh20/k4;

    invoke-static {p1, p0}, Lh20/k4;->A(Lh20/k4;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_b

    goto :goto_6

    :cond_b
    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_6
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
