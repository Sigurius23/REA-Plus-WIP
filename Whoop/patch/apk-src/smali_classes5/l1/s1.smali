.class public final Ll1/s1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Ll1/t1;


# direct methods
.method public synthetic constructor <init>(Ll1/t1;Lq83/d;I)V
    .locals 0

    iput p3, p0, Ll1/s1;->w:I

    iput-object p1, p0, Ll1/s1;->y:Ll1/t1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Ll1/s1;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ll1/s1;

    iget-object v0, p0, Ll1/s1;->y:Ll1/t1;

    const/4 v1, 0x3

    invoke-direct {p1, v0, p2, v1}, Ll1/s1;-><init>(Ll1/t1;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Ll1/s1;

    iget-object v0, p0, Ll1/s1;->y:Ll1/t1;

    const/4 v1, 0x2

    invoke-direct {p1, v0, p2, v1}, Ll1/s1;-><init>(Ll1/t1;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Ll1/s1;

    iget-object v0, p0, Ll1/s1;->y:Ll1/t1;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Ll1/s1;-><init>(Ll1/t1;Lq83/d;I)V

    return-object p1

    :pswitch_2
    new-instance p1, Ll1/s1;

    iget-object v0, p0, Ll1/s1;->y:Ll1/t1;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Ll1/s1;-><init>(Ll1/t1;Lq83/d;I)V

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

    iget v0, p0, Ll1/s1;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Ll1/s1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ll1/s1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ll1/s1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Ll1/s1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ll1/s1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ll1/s1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Ll1/s1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ll1/s1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ll1/s1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p1, p2}, Ll1/s1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ll1/s1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ll1/s1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 11

    iget v0, p0, Ll1/s1;->w:I

    iget-object v1, p0, Ll1/s1;->y:Ll1/t1;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x1

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v5, p0, Ll1/s1;->x:I

    if-eqz v5, :cond_1

    if-ne v5, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v4, p0, Ll1/s1;->x:I

    invoke-static {v1, p0}, Ll1/t1;->a1(Ll1/t1;Ls83/i;)Ljava/lang/Object;

    move-object v3, v0

    :goto_0
    return-object v3

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v5, p0, Ll1/s1;->x:I

    if-eqz v5, :cond_3

    if-ne v5, v4, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v4, p0, Ll1/s1;->x:I

    invoke-static {v1, p0}, Ll1/t1;->a1(Ll1/t1;Ls83/i;)Ljava/lang/Object;

    move-object v3, v0

    :goto_1
    return-object v3

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v5, p0, Ll1/s1;->x:I

    if-eqz v5, :cond_5

    if-ne v5, v4, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v8, p0

    goto :goto_5

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move v5, v4

    iget-object v4, v1, Ll1/t1;->Z:Ld0/e;

    iget-boolean p1, v1, Ll1/t1;->U:Z

    if-eqz p1, :cond_6

    iget-boolean p1, v1, Ll1/t1;->Q:Z

    if-eqz p1, :cond_6

    iget p1, v1, Ll1/t1;->S:F

    :goto_2
    move v6, v5

    goto :goto_3

    :cond_6
    iget p1, v1, Ll1/t1;->T:F

    goto :goto_2

    :goto_3
    new-instance v5, Ly3/f;

    invoke-direct {v5, p1}, Ly3/f;-><init>(F)V

    iget-boolean p1, v1, Ll1/t1;->Q:Z

    if-eqz p1, :cond_7

    sget-object p1, Ll1/x1;->a:Lp1/u2;

    invoke-static {v1, p1}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll1/r2;

    sget-object v1, Lo1/n;->x:Lo1/n;

    invoke-static {p1, v1}, Ll1/k3;->j(Ll1/r2;Lo1/n;)Ld0/i1;

    move-result-object p1

    goto :goto_4

    :cond_7
    invoke-static {}, Ld0/f;->t()Ld0/g1;

    move-result-object p1

    :goto_4
    iput v6, p0, Ll1/s1;->x:I

    const/4 v7, 0x0

    const/16 v9, 0xc

    move-object v8, p0

    move-object v6, p1

    invoke-static/range {v4 .. v9}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    move-object v3, v0

    :cond_8
    :goto_5
    return-object v3

    :pswitch_2
    move-object v8, p0

    move v6, v4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v4, v8, Ll1/s1;->x:I

    if-eqz v4, :cond_a

    if-ne v4, v6, :cond_9

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_7

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v4, v1, Ll1/t1;->X:Ld0/e;

    if-eqz v4, :cond_e

    iget-object p1, v1, Ll1/t1;->W:Ll1/e4;

    if-nez p1, :cond_b

    sget-object p1, Ll1/h4;->a:Ll1/h4;

    sget-object p1, Ll1/n;->a:Lp1/u2;

    invoke-static {v1, p1}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll1/m;

    sget-object v2, Lf1/a2;->a:Lp1/b0;

    invoke-static {v1, v2}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf1/y1;

    invoke-static {p1, v2}, Ll1/h4;->c(Ll1/m;Lf1/y1;)Ll1/e4;

    move-result-object p1

    :cond_b
    iget-boolean v2, v1, Ll1/t1;->Q:Z

    const/4 v5, 0x0

    iget-boolean v7, v1, Ll1/t1;->U:Z

    invoke-virtual {p1, v2, v5, v7}, Ll1/e4;->c(ZZZ)J

    move-result-wide v9

    new-instance v5, Li2/x;

    invoke-direct {v5, v9, v10}, Li2/x;-><init>(J)V

    iget-boolean p1, v1, Ll1/t1;->Q:Z

    if-eqz p1, :cond_c

    sget-object p1, Ll1/x1;->a:Lp1/u2;

    invoke-static {v1, p1}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll1/r2;

    sget-object v1, Lo1/n;->z:Lo1/n;

    invoke-static {p1, v1}, Ll1/k3;->j(Ll1/r2;Lo1/n;)Ld0/i1;

    move-result-object p1

    goto :goto_6

    :cond_c
    invoke-static {}, Ld0/f;->t()Ld0/g1;

    move-result-object p1

    :goto_6
    iput v6, v8, Ll1/s1;->x:I

    const/4 v7, 0x0

    const/16 v9, 0xc

    move-object v6, p1

    invoke-static/range {v4 .. v9}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_d

    move-object v3, v0

    goto :goto_8

    :cond_d
    :goto_7
    check-cast p1, Ld0/j;

    :cond_e
    :goto_8
    return-object v3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
