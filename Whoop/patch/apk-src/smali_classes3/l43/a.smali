.class public final Ll43/a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lt23/c0;

.field public final synthetic z:Lj43/g;


# direct methods
.method public synthetic constructor <init>(Lt23/c0;Lj43/g;Lq83/d;I)V
    .locals 0

    iput p4, p0, Ll43/a;->w:I

    iput-object p1, p0, Ll43/a;->y:Lt23/c0;

    iput-object p2, p0, Ll43/a;->z:Lj43/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget p1, p0, Ll43/a;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ll43/a;

    iget-object v0, p0, Ll43/a;->z:Lj43/g;

    const/4 v1, 0x1

    iget-object v2, p0, Ll43/a;->y:Lt23/c0;

    invoke-direct {p1, v2, v0, p2, v1}, Ll43/a;-><init>(Lt23/c0;Lj43/g;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Ll43/a;

    iget-object v0, p0, Ll43/a;->z:Lj43/g;

    const/4 v1, 0x0

    iget-object v2, p0, Ll43/a;->y:Lt23/c0;

    invoke-direct {p1, v2, v0, p2, v1}, Ll43/a;-><init>(Lt23/c0;Lj43/g;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ll43/a;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Ll43/a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ll43/a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ll43/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Ll43/a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ll43/a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ll43/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    iget v0, p0, Ll43/a;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ll43/a;->x:I

    const/4 v2, 0x1

    const/4 v3, 0x0

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

    iput v2, p0, Ll43/a;->x:I

    iget-object p1, p0, Ll43/a;->y:Lt23/c0;

    const-string v1, "memberCount == 2"

    invoke-virtual {p1, v1, v3, p0}, Lt23/c0;->x(Ljava/lang/String;Ltx/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    iget-object p1, p0, Ll43/a;->z:Lj43/g;

    invoke-virtual {p1}, Lj43/g;->c()Lb23/k;

    move-result-object p1

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v1, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->z:Lb23/g;

    invoke-interface {v0, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v0, "[handleIncomingCallTaskRemoved] Ended incoming call for both users"

    invoke-interface {p1, v2, v1, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ll43/a;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_5

    if-ne v1, v2, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lc43/r;

    const-string v1, "Android Service Task Removed"

    invoke-direct {p1, v1}, Lc43/r;-><init>(Ljava/lang/String;)V

    iput v2, p0, Ll43/a;->x:I

    iget-object v1, p0, Ll43/a;->y:Lt23/c0;

    const-string v2, "CallService.EndCall"

    invoke-virtual {v1, v2, p1, p0}, Lt23/c0;->x(Ljava/lang/String;Ltx/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    iget-object p1, p0, Ll43/a;->z:Lj43/g;

    invoke-virtual {p1}, Lj43/g;->c()Lb23/k;

    move-result-object p1

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v1, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->z:Lb23/g;

    invoke-interface {v0, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v0, "[onTaskRemoved] Ended outgoing call for all users"

    const/4 v3, 0x0

    invoke-interface {p1, v2, v1, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_3
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
