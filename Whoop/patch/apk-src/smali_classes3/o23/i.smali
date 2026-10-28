.class public final Lo23/i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lo23/j;


# direct methods
.method public synthetic constructor <init>(Lo23/j;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lo23/i;->w:I

    iput-object p1, p0, Lo23/i;->y:Lo23/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Lo23/i;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lo23/i;

    iget-object v0, p0, Lo23/i;->y:Lo23/j;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Lo23/i;-><init>(Lo23/j;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lo23/i;

    iget-object v0, p0, Lo23/i;->y:Lo23/j;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Lo23/i;-><init>(Lo23/j;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lo23/i;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lo23/i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lo23/i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lo23/i;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lo23/i;->x:I

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

    iget-object p1, p0, Lo23/i;->y:Lo23/j;

    iput v2, p0, Lo23/i;->x:I

    invoke-virtual {p1, p0}, Lo23/j;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    move-object p1, v0

    :cond_2
    :goto_0
    return-object p1

    :pswitch_0
    iget-object v0, p0, Lo23/i;->y:Lo23/j;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lo23/i;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_4

    if-ne v2, v3, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v0, Lo23/j;->a:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo23/d;

    iget-object v2, v0, Lo23/j;->e:Lac3/b;

    invoke-virtual {v2, p1}, Lac3/b;->b(Lo23/d;)V

    iput v3, p0, Lo23/i;->x:I

    invoke-interface {p1, p0}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    move-object v1, p1

    check-cast v1, Ln23/h;

    iget-object v1, v0, Lo23/j;->d:Le53/d;

    iget-object v2, v1, Le53/d;->a:Ljava/lang/Object;

    const/4 v3, 0x0

    iput-object v3, v1, Le53/d;->a:Ljava/lang/Object;

    if-eqz v2, :cond_6

    iget-object v0, v0, Lo23/j;->b:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_6
    move-object v1, p1

    :goto_2
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
