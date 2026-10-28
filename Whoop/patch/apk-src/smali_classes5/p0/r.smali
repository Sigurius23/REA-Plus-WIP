.class public final Lp0/r;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lp0/t;


# direct methods
.method public synthetic constructor <init>(Lp0/t;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lp0/r;->w:I

    iput-object p1, p0, Lp0/r;->y:Lp0/t;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Lp0/r;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lp0/r;

    iget-object v0, p0, Lp0/r;->y:Lp0/t;

    const/4 v1, 0x4

    invoke-direct {p1, v0, p2, v1}, Lp0/r;-><init>(Lp0/t;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lp0/r;

    iget-object v0, p0, Lp0/r;->y:Lp0/t;

    const/4 v1, 0x3

    invoke-direct {p1, v0, p2, v1}, Lp0/r;-><init>(Lp0/t;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Lp0/r;

    iget-object v0, p0, Lp0/r;->y:Lp0/t;

    const/4 v1, 0x2

    invoke-direct {p1, v0, p2, v1}, Lp0/r;-><init>(Lp0/t;Lq83/d;I)V

    return-object p1

    :pswitch_2
    new-instance p1, Lp0/r;

    iget-object v0, p0, Lp0/r;->y:Lp0/t;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Lp0/r;-><init>(Lp0/t;Lq83/d;I)V

    return-object p1

    :pswitch_3
    new-instance p1, Lp0/r;

    iget-object v0, p0, Lp0/r;->y:Lp0/t;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Lp0/r;-><init>(Lp0/t;Lq83/d;I)V

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

    iget v0, p0, Lp0/r;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lp0/r;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp0/r;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp0/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lp0/r;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp0/r;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp0/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lp0/r;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp0/r;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp0/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lp0/r;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp0/r;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp0/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p0, p1, p2}, Lp0/r;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp0/r;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp0/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lp0/r;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v2, p0, Lp0/r;->y:Lp0/t;

    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v4, 0x1

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v5, p0, Lp0/r;->x:I

    if-eqz v5, :cond_1

    if-ne v5, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v2, Lp0/t;->p:Ld0/e;

    iput v4, p0, Lp0/r;->x:I

    invoke-virtual {p1, p0}, Ld0/e;->h(Ls83/i;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    move-object v1, v0

    :cond_2
    :goto_0
    return-object v1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v5, p0, Lp0/r;->x:I

    if-eqz v5, :cond_4

    if-ne v5, v4, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v2, Lp0/t;->p:Ld0/e;

    iput v4, p0, Lp0/r;->x:I

    invoke-virtual {p1, p0}, Ld0/e;->h(Ls83/i;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    move-object v1, v0

    :cond_5
    :goto_1
    return-object v1

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v5, p0, Lp0/r;->x:I

    if-eqz v5, :cond_7

    if-ne v5, v4, :cond_6

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v2, Lp0/t;->o:Ld0/e;

    iput v4, p0, Lp0/r;->x:I

    invoke-virtual {p1, p0}, Ld0/e;->h(Ls83/i;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    move-object v1, v0

    :cond_8
    :goto_2
    return-object v1

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v5, p0, Lp0/r;->x:I

    const-wide/16 v6, 0x0

    if-eqz v5, :cond_a

    if-ne v5, v4, :cond_9

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v2, Lp0/t;->o:Ld0/e;

    new-instance v3, Ly3/j;

    invoke-direct {v3, v6, v7}, Ly3/j;-><init>(J)V

    iput v4, p0, Lp0/r;->x:I

    invoke-virtual {p1, v3, p0}, Ld0/e;->g(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_b

    move-object v1, v0

    goto :goto_4

    :cond_b
    :goto_3
    sget p1, Lp0/t;->t:I

    invoke-virtual {v2, v6, v7}, Lp0/t;->m(J)V

    const/4 p1, 0x0

    invoke-virtual {v2, p1}, Lp0/t;->l(Z)V

    :goto_4
    return-object v1

    :pswitch_3
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v5, p0, Lp0/r;->x:I

    if-eqz v5, :cond_d

    if-ne v5, v4, :cond_c

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v2, Lp0/t;->p:Ld0/e;

    new-instance v2, Ljava/lang/Float;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v2, v3}, Ljava/lang/Float;-><init>(F)V

    iput v4, p0, Lp0/r;->x:I

    invoke-virtual {p1, v2, p0}, Ld0/e;->g(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_e

    move-object v1, v0

    :cond_e
    :goto_5
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
