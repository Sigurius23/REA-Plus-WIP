.class public final Lu0/c0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lu2/v;

.field public final synthetic z:Lu0/d1;


# direct methods
.method public synthetic constructor <init>(Lu2/v;Lu0/d1;Lq83/d;I)V
    .locals 0

    iput p4, p0, Lu0/c0;->w:I

    iput-object p1, p0, Lu0/c0;->y:Lu2/v;

    iput-object p2, p0, Lu0/c0;->z:Lu0/d1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget p1, p0, Lu0/c0;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lu0/c0;

    iget-object v0, p0, Lu0/c0;->z:Lu0/d1;

    const/4 v1, 0x2

    iget-object v2, p0, Lu0/c0;->y:Lu2/v;

    invoke-direct {p1, v2, v0, p2, v1}, Lu0/c0;-><init>(Lu2/v;Lu0/d1;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lu0/c0;

    iget-object v0, p0, Lu0/c0;->z:Lu0/d1;

    const/4 v1, 0x1

    iget-object v2, p0, Lu0/c0;->y:Lu2/v;

    invoke-direct {p1, v2, v0, p2, v1}, Lu0/c0;-><init>(Lu2/v;Lu0/d1;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Lu0/c0;

    iget-object v0, p0, Lu0/c0;->z:Lu0/d1;

    const/4 v1, 0x0

    iget-object v2, p0, Lu0/c0;->y:Lu2/v;

    invoke-direct {p1, v2, v0, p2, v1}, Lu0/c0;-><init>(Lu2/v;Lu0/d1;Lq83/d;I)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lu0/c0;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lu0/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lu0/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lu0/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lu0/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lu0/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lu0/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lu0/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lu0/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lu0/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lu0/c0;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lu0/c0;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v8, p0

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

    iput v3, p0, Lu0/c0;->x:I

    new-instance v4, Lf1/h0;

    const/4 p1, 0x1

    iget-object v1, p0, Lu0/c0;->z:Lu0/d1;

    invoke-direct {v4, v1, p1}, Lf1/h0;-><init>(Lu0/d1;I)V

    new-instance v5, Lu0/v0;

    const/4 p1, 0x0

    invoke-direct {v5, v1, p1}, Lu0/v0;-><init>(Lu0/d1;I)V

    new-instance v6, Lu0/v0;

    const/4 p1, 0x1

    invoke-direct {v6, v1, p1}, Lu0/v0;-><init>(Lu0/d1;I)V

    new-instance v7, Ltx0/a;

    const/4 p1, 0x4

    invoke-direct {v7, v1, p1}, Ltx0/a;-><init>(Ljava/lang/Object;I)V

    iget-object v3, p0, Lu0/c0;->y:Lu2/v;

    move-object v8, p0

    invoke-static/range {v3 .. v8}, Lh0/z0;->f(Lu2/v;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_0

    :cond_3
    move-object p1, v2

    :goto_0
    if-ne p1, v0, :cond_0

    :goto_1
    return-object v0

    :pswitch_0
    move-object v8, p0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v8, Lu0/c0;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_6

    if-ne v1, v3, :cond_5

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_4
    move-object v0, v2

    goto :goto_3

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, v8, Lu0/c0;->x:I

    new-instance p1, Lf1/v0;

    const/4 v1, 0x0

    const/4 v3, 0x5

    iget-object v4, v8, Lu0/c0;->z:Lu0/d1;

    invoke-direct {p1, v4, v1, v3}, Lf1/v0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iget-object v1, v8, Lu0/c0;->y:Lu2/v;

    invoke-static {v1, p1, p0}, Lh0/q3;->g(Lu2/v;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_2

    :cond_7
    move-object p1, v2

    :goto_2
    if-ne p1, v0, :cond_4

    :goto_3
    return-object v0

    :pswitch_1
    move-object v8, p0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v8, Lu0/c0;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_9

    if-ne v1, v2, :cond_8

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v2, v8, Lu0/c0;->x:I

    iget-object p1, v8, Lu0/c0;->y:Lu2/v;

    iget-object v1, v8, Lu0/c0;->z:Lu0/d1;

    invoke-static {p1, v1, p0}, Lu0/n0;->k(Lu2/v;Lu0/d1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    goto :goto_5

    :cond_a
    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_5
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
