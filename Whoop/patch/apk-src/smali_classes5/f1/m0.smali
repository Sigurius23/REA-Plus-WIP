.class public final Lf1/m0;
.super Ls83/h;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic x:I

.field public y:I

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILkotlin/jvm/functions/Function1;Lq83/d;)V
    .locals 0

    iput p1, p0, Lf1/m0;->x:I

    iput-object p2, p0, Lf1/m0;->E:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/h;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Lf1/m0;->x:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lf1/m0;

    iget-object v1, p0, Lf1/m0;->E:Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1, p2}, Lf1/m0;-><init>(ILkotlin/jvm/functions/Function1;Lq83/d;)V

    iput-object p1, v0, Lf1/m0;->z:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance v0, Lf1/m0;

    iget-object v1, p0, Lf1/m0;->E:Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, p2}, Lf1/m0;-><init>(ILkotlin/jvm/functions/Function1;Lq83/d;)V

    iput-object p1, v0, Lf1/m0;->z:Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lf1/m0;->x:I

    check-cast p1, Lu2/b;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lf1/m0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf1/m0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf1/m0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lf1/m0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf1/m0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf1/m0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lf1/m0;->x:I

    iget-object v1, p0, Lf1/m0;->E:Lkotlin/jvm/functions/Function1;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v3, 0x1

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v4, p0, Lf1/m0;->y:I

    const/4 v5, 0x2

    if-eqz v4, :cond_2

    if-eq v4, v3, :cond_1

    if-ne v4, v5, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v2, p0, Lf1/m0;->z:Ljava/lang/Object;

    check-cast v2, Lu2/b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lf1/m0;->z:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Lu2/b;

    iput-object v2, p0, Lf1/m0;->z:Ljava/lang/Object;

    iput v3, p0, Lf1/m0;->y:I

    invoke-static {v2, p0}, Ls30/e;->d(Lu2/b;Ls83/a;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    check-cast p1, Lu2/r;

    invoke-virtual {p1}, Lu2/r;->a()V

    iget-wide v3, p1, Lu2/r;->c:J

    new-instance p1, Lh2/b;

    invoke-direct {p1, v3, v4}, Lh2/b;-><init>(J)V

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Lf1/m0;->z:Ljava/lang/Object;

    iput v5, p0, Lf1/m0;->y:I

    sget-object p1, Lh0/o3;->a:Lh0/d3;

    sget-object p1, Lu2/l;->x:Lu2/l;

    invoke-static {v2, p1, p0}, Lh0/o3;->j(Lu2/b;Lu2/l;Ls83/a;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Lu2/r;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lu2/r;->a()V

    :cond_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_2
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v4, p0, Lf1/m0;->y:I

    if-eqz v4, :cond_7

    if-ne v4, v3, :cond_6

    iget-object v2, p0, Lf1/m0;->z:Ljava/lang/Object;

    check-cast v2, Lu2/b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lf1/m0;->z:Ljava/lang/Object;

    check-cast p1, Lu2/b;

    :goto_3
    sget-object v2, Lu2/l;->w:Lu2/l;

    iput-object p1, p0, Lf1/m0;->z:Ljava/lang/Object;

    iput v3, p0, Lf1/m0;->y:I

    check-cast p1, Lu2/g0;

    invoke-virtual {p1, v2, p0}, Lu2/g0;->a(Lu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_8

    return-object v0

    :cond_8
    move-object v6, v2

    move-object v2, p1

    move-object p1, v6

    :goto_4
    check-cast p1, Lu2/k;

    invoke-static {p1}, Lf1/y0;->w(Lu2/k;)Z

    move-result p1

    xor-int/2addr p1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-object p1, v2

    goto :goto_3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
