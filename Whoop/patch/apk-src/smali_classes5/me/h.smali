.class public final Lme/h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lvg/n;


# direct methods
.method public synthetic constructor <init>(Lvg/n;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lme/h;->w:I

    iput-object p1, p0, Lme/h;->y:Lvg/n;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Lme/h;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lme/h;

    iget-object v1, p0, Lme/h;->y:Lvg/n;

    const/4 v2, 0x1

    invoke-direct {v0, v1, p1, v2}, Lme/h;-><init>(Lvg/n;Lq83/d;I)V

    return-object v0

    :pswitch_0
    new-instance v0, Lme/h;

    iget-object v1, p0, Lme/h;->y:Lvg/n;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, Lme/h;-><init>(Lvg/n;Lq83/d;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lme/h;->w:I

    check-cast p1, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1}, Lme/h;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lme/h;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lme/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1}, Lme/h;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lme/h;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lme/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lme/h;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lme/h;->x:I

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

    iput v2, p0, Lme/h;->x:I

    iget-object p1, p0, Lme/h;->y:Lvg/n;

    invoke-static {p1, p0}, Lx30/s0;->v(Lvg/n;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    move-object p1, v0

    :cond_2
    :goto_0
    return-object p1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lme/h;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    if-ne v1, v2, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v2, p0, Lme/h;->x:I

    iget-object p1, p0, Lme/h;->y:Lvg/n;

    invoke-static {p1, p0}, Lx30/s0;->v(Lvg/n;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    check-cast p1, Lce/j;

    invoke-virtual {p1}, Lce/j;->a()Lce/k;

    move-result-object v0

    :goto_2
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
