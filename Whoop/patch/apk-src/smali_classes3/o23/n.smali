.class public final Lo23/n;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lo23/o;


# direct methods
.method public synthetic constructor <init>(Lo23/o;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lo23/n;->w:I

    iput-object p1, p0, Lo23/n;->y:Lo23/o;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Lo23/n;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lo23/n;

    iget-object v0, p0, Lo23/n;->y:Lo23/o;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Lo23/n;-><init>(Lo23/o;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lo23/n;

    iget-object v0, p0, Lo23/n;->y:Lo23/o;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Lo23/n;-><init>(Lo23/o;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lo23/n;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lo23/n;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/n;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lo23/n;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/n;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lo23/n;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lo23/n;->x:I

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

    iput v2, p0, Lo23/n;->x:I

    iget-object p1, p0, Lo23/n;->y:Lo23/o;

    invoke-virtual {p1, p0}, Lo23/o;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    move-object p1, v0

    :cond_2
    :goto_0
    return-object p1

    :pswitch_0
    iget-object v0, p0, Lo23/n;->y:Lo23/o;

    iget-object v1, v0, Lo23/o;->c:Lac3/a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lo23/n;->x:I

    const/4 v4, 0x1

    if-eqz v3, :cond_4

    if-ne v3, v4, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v0, Lo23/o;->b:Lo23/d;

    iput v4, p0, Lo23/n;->x:I

    invoke-interface {p1, p0}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_5

    goto :goto_5

    :cond_5
    :goto_1
    move-object v2, p1

    check-cast v2, Ln23/h;

    invoke-virtual {v1}, Lac3/a;->a()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_6

    goto :goto_2

    :cond_6
    move-object p1, v3

    :goto_2
    check-cast p1, Ln23/h;

    if-eqz p1, :cond_9

    iget-object v0, v0, Lo23/o;->d:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    instance-of v2, p1, Ln23/g;

    if-eqz v2, :cond_7

    check-cast p1, Ln23/g;

    iget-object p1, p1, Ln23/g;->a:Ljava/lang/Object;

    new-instance v2, Ln23/g;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v2, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    move-object p1, v2

    goto :goto_3

    :cond_7
    instance-of v0, p1, Ln23/f;

    if-eqz v0, :cond_8

    goto :goto_3

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_9
    move-object p1, v3

    :goto_3
    invoke-virtual {v1}, Lac3/a;->a()Z

    move-result v0

    if-nez v0, :cond_a

    move-object v2, p1

    goto :goto_4

    :cond_a
    move-object v2, v3

    :goto_4
    if-nez v2, :cond_b

    new-instance v2, Ln23/f;

    new-instance p1, Ln23/a;

    const-string v0, "The call was canceled before complete its execution."

    invoke-direct {p1, v0}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, p1}, Ln23/f;-><init>(Ln23/e;)V

    :cond_b
    :goto_5
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
