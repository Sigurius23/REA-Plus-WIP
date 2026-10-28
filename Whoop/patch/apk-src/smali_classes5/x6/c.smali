.class public final Lx6/c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lx6/d;


# direct methods
.method public synthetic constructor <init>(Lx6/d;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lx6/c;->w:I

    iput-object p1, p0, Lx6/c;->y:Lx6/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Lx6/c;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lx6/c;

    iget-object v0, p0, Lx6/c;->y:Lx6/d;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Lx6/c;-><init>(Lx6/d;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lx6/c;

    iget-object v0, p0, Lx6/c;->y:Lx6/d;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Lx6/c;-><init>(Lx6/d;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lx6/c;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lx6/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lx6/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lx6/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lx6/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lx6/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lx6/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    iget v0, p0, Lx6/c;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lx6/c;->x:I

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

    iget-object p1, p0, Lx6/c;->y:Lx6/d;

    iput v2, p0, Lx6/c;->x:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lx6/c;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, p1, v2, v3}, Lx6/c;-><init>(Lx6/d;Lq83/d;I)V

    const-wide/16 v2, 0x1388

    invoke-static {v2, v3, v1, p0}, Lbc3/k2;->d(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lx6/c;->x:I

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

    iget-object p1, p0, Lx6/c;->y:Lx6/d;

    invoke-virtual {p1}, Lx6/d;->a()V

    iget-object p1, p0, Lx6/c;->y:Lx6/d;

    iput v2, p0, Lx6/c;->x:I

    new-instance v1, Lbc3/m;

    invoke-static {p0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v1}, Lbc3/m;->s()V

    iget-object v2, p1, Lx6/d;->z:Ljava/lang/Object;

    monitor-enter v2

    const/16 v3, 0x14

    :try_start_0
    iput v3, p1, Lx6/d;->E:I

    iput-object v1, p1, Lx6/d;->G:Lbc3/m;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    new-instance v2, Ls;

    const/16 v3, 0x1b

    invoke-direct {v2, p1, v3}, Ls;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_3
    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit v2

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
