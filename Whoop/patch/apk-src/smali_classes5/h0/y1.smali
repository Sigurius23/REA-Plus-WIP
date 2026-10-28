.class public final Lh0/y1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILq83/d;)V
    .locals 0

    iput p2, p0, Lh0/y1;->w:I

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Lh0/y1;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lh0/y1;

    const/4 v1, 0x2

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, p2}, Lh0/y1;-><init>(IILq83/d;)V

    iput-object p1, v0, Lh0/y1;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance v0, Lh0/y1;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p2}, Lh0/y1;-><init>(IILq83/d;)V

    iput-object p1, v0, Lh0/y1;->y:Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lh0/y1;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lu2/v;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh0/y1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/y1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/y1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh0/y1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/y1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/y1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lh0/y1;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lh0/y1;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v8, p0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lh0/y1;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lu2/v;

    iput v2, p0, Lh0/y1;->x:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    sget-object v7, Lpj/m;->w:Lpj/m;

    const/4 v9, 0x7

    move-object v8, p0

    invoke-static/range {v3 .. v9}, Lh0/o3;->e(Lu2/v;Lkotlin/jvm/functions/Function1;Lm12/c;Lg1/d6;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object v0

    :pswitch_0
    move-object v8, p0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v8, Lh0/y1;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    if-ne v1, v2, :cond_3

    iget-object v1, v8, Lh0/y1;->y:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v8, Lh0/y1;->y:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    move-object v1, p1

    :cond_5
    :goto_2
    invoke-interface {v1}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->x(Lq83/j;)Z

    move-result p1

    if-eqz p1, :cond_6

    new-instance p1, Lev2/b;

    const/16 v3, 0xd

    invoke-direct {p1, v3}, Lev2/b;-><init>(I)V

    iput-object v1, v8, Lh0/y1;->y:Ljava/lang/Object;

    iput v2, v8, Lh0/y1;->x:I

    invoke-interface {p0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v3

    invoke-static {v3}, Lp1/x;->v(Lq83/j;)Lp1/w0;

    move-result-object v3

    invoke-interface {v3, p1, p0}, Lp1/w0;->k(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_3

    :cond_6
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_3
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
