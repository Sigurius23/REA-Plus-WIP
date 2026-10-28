.class public final Lb30/h2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lb30/h2;->w:I

    iput-object p1, p0, Lb30/h2;->z:Lc93/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Lb30/h2;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lb30/h2;

    iget-object v1, p0, Lb30/h2;->z:Lc93/a;

    const/4 v2, 0x2

    invoke-direct {v0, v1, p2, v2}, Lb30/h2;-><init>(Lc93/a;Lq83/d;I)V

    iput-object p1, v0, Lb30/h2;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance v0, Lb30/h2;

    iget-object v1, p0, Lb30/h2;->z:Lc93/a;

    const/4 v2, 0x1

    invoke-direct {v0, v1, p2, v2}, Lb30/h2;-><init>(Lc93/a;Lq83/d;I)V

    iput-object p1, v0, Lb30/h2;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_1
    new-instance v0, Lb30/h2;

    iget-object v1, p0, Lb30/h2;->z:Lc93/a;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p2, v2}, Lb30/h2;-><init>(Lc93/a;Lq83/d;I)V

    iput-object p1, v0, Lb30/h2;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lb30/h2;->w:I

    check-cast p1, Lu2/v;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lb30/h2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb30/h2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb30/h2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lb30/h2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb30/h2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb30/h2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lb30/h2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb30/h2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb30/h2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    iget v0, p0, Lb30/h2;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lb30/h2;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v6, p0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lb30/h2;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lu2/v;

    new-instance v7, Lh0/l0;

    const/16 p1, 0x15

    iget-object v1, p0, Lb30/h2;->z:Lc93/a;

    invoke-direct {v7, v1, p1}, Lh0/l0;-><init>(Lc93/a;I)V

    iput v2, p0, Lb30/h2;->x:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x7

    move-object v8, p0

    invoke-static/range {v3 .. v9}, Lh0/o3;->e(Lu2/v;Lkotlin/jvm/functions/Function1;Lm12/c;Lg1/d6;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    move-object v6, v8

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object v0

    :pswitch_0
    move-object v6, p0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lb30/h2;->x:I

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

    iget-object p1, v6, Lb30/h2;->y:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lu2/v;

    new-instance v5, Lh0/l0;

    const/4 p1, 0x3

    iget-object v3, v6, Lb30/h2;->z:Lc93/a;

    invoke-direct {v5, v3, p1}, Lh0/l0;-><init>(Lc93/a;I)V

    iput v2, v6, Lb30/h2;->x:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x7

    invoke-static/range {v1 .. v7}, Lh0/o3;->e(Lu2/v;Lkotlin/jvm/functions/Function1;Lm12/c;Lg1/d6;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_3
    return-object v0

    :pswitch_1
    move-object v6, p0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lb30/h2;->x:I

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

    iget-object p1, v6, Lb30/h2;->y:Ljava/lang/Object;

    check-cast p1, Lu2/v;

    new-instance v1, Lb30/g2;

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v5, v6, Lb30/h2;->z:Lc93/a;

    invoke-direct {v1, v5, v3, v4}, Lb30/g2;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput v2, v6, Lb30/h2;->x:I

    invoke-static {p1, v1, p0}, Lh0/q3;->g(Lu2/v;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto :goto_5

    :cond_8
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
