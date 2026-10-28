.class public final Lq00/e0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ly00/c0;

.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ly00/c0;Lq83/d;I)V
    .locals 0

    iput p5, p0, Lq00/e0;->w:I

    iput-object p1, p0, Lq00/e0;->y:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lq00/e0;->z:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lq00/e0;->E:Ly00/c0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7

    iget p1, p0, Lq00/e0;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance v0, Lq00/e0;

    iget-object v3, p0, Lq00/e0;->E:Ly00/c0;

    const/4 v5, 0x2

    iget-object v1, p0, Lq00/e0;->y:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lq00/e0;->z:Lkotlin/jvm/functions/Function1;

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lq00/e0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ly00/c0;Lq83/d;I)V

    return-object v0

    :pswitch_0
    move-object v5, p2

    new-instance v1, Lq00/e0;

    iget-object v4, p0, Lq00/e0;->E:Ly00/c0;

    const/4 v6, 0x1

    iget-object v2, p0, Lq00/e0;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lq00/e0;->z:Lkotlin/jvm/functions/Function1;

    invoke-direct/range {v1 .. v6}, Lq00/e0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ly00/c0;Lq83/d;I)V

    return-object v1

    :pswitch_1
    move-object v5, p2

    new-instance v1, Lq00/e0;

    iget-object v4, p0, Lq00/e0;->E:Ly00/c0;

    const/4 v6, 0x0

    iget-object v2, p0, Lq00/e0;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lq00/e0;->z:Lkotlin/jvm/functions/Function1;

    invoke-direct/range {v1 .. v6}, Lq00/e0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ly00/c0;Lq83/d;I)V

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

    iget v0, p0, Lq00/e0;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lq00/e0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lq00/e0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lq00/e0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lq00/e0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lq00/e0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lq00/e0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lq00/e0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lq00/e0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lq00/e0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lq00/e0;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lq00/e0;->x:I

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

    iput v2, p0, Lq00/e0;->x:I

    iget-object p1, p0, Lq00/e0;->y:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    iget-object p1, p0, Lq00/e0;->z:Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lq00/e0;->E:Ly00/c0;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lq00/e0;->x:I

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

    iput v2, p0, Lq00/e0;->x:I

    iget-object p1, p0, Lq00/e0;->y:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    iget-object p1, p0, Lq00/e0;->z:Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lq00/e0;->E:Ly00/c0;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_3
    return-object v0

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lq00/e0;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_7

    if-ne v1, v2, :cond_6

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v2, p0, Lq00/e0;->x:I

    iget-object p1, p0, Lq00/e0;->y:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto :goto_5

    :cond_8
    :goto_4
    iget-object p1, p0, Lq00/e0;->z:Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lq00/e0;->E:Ly00/c0;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_5
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
