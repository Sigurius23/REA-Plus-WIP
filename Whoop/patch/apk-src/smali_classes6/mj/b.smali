.class public final Lmj/b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 1
    iput p5, p0, Lmj/b;->w:I

    iput-object p1, p0, Lmj/b;->z:Ljava/lang/Object;

    iput p2, p0, Lmj/b;->y:I

    iput-object p3, p0, Lmj/b;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lp6/s0;Landroid/content/Context;ILq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lmj/b;->w:I

    .line 2
    iput-object p1, p0, Lmj/b;->z:Ljava/lang/Object;

    iput-object p2, p0, Lmj/b;->E:Ljava/lang/Object;

    iput p3, p0, Lmj/b;->y:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7

    iget p1, p0, Lmj/b;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance v0, Lmj/b;

    iget-object p1, p0, Lmj/b;->z:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lsz/z;

    iget-object p1, p0, Lmj/b;->E:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Landroid/content/Intent;

    const/4 v5, 0x2

    iget v2, p0, Lmj/b;->y:I

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lmj/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;Lq83/d;I)V

    return-object v0

    :pswitch_0
    move-object v4, p2

    new-instance p1, Lmj/b;

    iget-object p2, p0, Lmj/b;->z:Ljava/lang/Object;

    check-cast p2, Lp6/s0;

    iget-object v0, p0, Lmj/b;->E:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iget v1, p0, Lmj/b;->y:I

    invoke-direct {p1, p2, v0, v1, v4}, Lmj/b;-><init>(Lp6/s0;Landroid/content/Context;ILq83/d;)V

    return-object p1

    :pswitch_1
    move-object v4, p2

    new-instance v1, Lmj/b;

    iget-object p1, p0, Lmj/b;->z:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Lq0/b;

    iget-object p1, p0, Lmj/b;->E:Ljava/lang/Object;

    check-cast p1, Lp1/a1;

    const/4 v6, 0x0

    iget v3, p0, Lmj/b;->y:I

    move-object v5, v4

    move-object v4, p1

    invoke-direct/range {v1 .. v6}, Lmj/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;Lq83/d;I)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lmj/b;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lmj/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lmj/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lmj/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lmj/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lmj/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lmj/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lmj/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lmj/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lmj/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lmj/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmj/b;->z:Ljava/lang/Object;

    check-cast v0, Lsz/z;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lmj/b;->x:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lmj/b;->E:Ljava/lang/Object;

    check-cast p1, Landroid/content/Intent;

    iput v4, p0, Lmj/b;->x:I

    iget v2, p0, Lmj/b;->y:I

    invoke-virtual {v0, v2, p1, p0}, Lsz/z;->n(ILandroid/content/Intent;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    check-cast p1, Lsz/o;

    iget-object v0, v0, Lsz/z;->K:Lec3/w1;

    iput v3, p0, Lmj/b;->x:I

    invoke-virtual {v0, p1, p0}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_2
    return-object v1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lmj/b;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_6

    if-ne v1, v2, :cond_5

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, p0

    goto :goto_3

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lmj/b;->z:Ljava/lang/Object;

    check-cast p1, Lp6/s0;

    invoke-virtual {p1}, Lp6/s0;->f()Lp6/g0;

    move-result-object v3

    iget-object p1, p0, Lmj/b;->E:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Landroid/content/Context;

    iput v2, p0, Lmj/b;->x:I

    iget v5, p0, Lmj/b;->y:I

    const/4 v6, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    move-object v7, p0

    invoke-static/range {v3 .. v9}, Lp6/g0;->r(Lp6/g0;Landroid/content/Context;ILandroid/os/Bundle;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_4

    :cond_7
    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_4
    return-object v0

    :pswitch_1
    move-object v7, p0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v7, Lmj/b;->x:I

    iget v2, v7, Lmj/b;->y:I

    const/4 v3, 0x1

    if-eqz v1, :cond_9

    if-ne v1, v3, :cond_8

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v7, Lmj/b;->z:Ljava/lang/Object;

    check-cast p1, Lq0/b;

    iput v3, v7, Lmj/b;->x:I

    const/4 v1, 0x0

    const/4 v3, 0x6

    invoke-static {p1, v2, v1, p0, v3}, Lq0/y;->g(Lq0/y;ILd0/e2;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    goto :goto_6

    :cond_a
    :goto_5
    iget-object p1, v7, Lmj/b;->E:Ljava/lang/Object;

    check-cast p1, Lp1/a1;

    check-cast p1, Lp1/h1;

    invoke-virtual {p1, v2}, Lp1/h1;->y(I)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_6
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
