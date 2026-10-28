.class public final Lx6/o;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lp6/l;


# direct methods
.method public synthetic constructor <init>(Lp6/l;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lx6/o;->w:I

    iput-object p1, p0, Lx6/o;->z:Lp6/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Lx6/o;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lx6/o;

    iget-object v1, p0, Lx6/o;->z:Lp6/l;

    const/4 v2, 0x1

    invoke-direct {v0, v1, p2, v2}, Lx6/o;-><init>(Lp6/l;Lq83/d;I)V

    iput-object p1, v0, Lx6/o;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance v0, Lx6/o;

    iget-object v1, p0, Lx6/o;->z:Lp6/l;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p2, v2}, Lx6/o;-><init>(Lp6/l;Lq83/d;I)V

    iput-object p1, v0, Lx6/o;->y:Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lx6/o;->w:I

    check-cast p1, Lx6/k;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lx6/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lx6/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lx6/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lx6/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lx6/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lx6/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    iget v0, p0, Lx6/o;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lx6/o;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_0
    move-object v0, v2

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lx6/o;->y:Ljava/lang/Object;

    check-cast p1, Lx6/k;

    iget-object v1, p0, Lx6/o;->z:Lp6/l;

    iget-object v1, v1, Lp6/l;->a:Ljava/lang/String;

    iput v3, p0, Lx6/o;->x:I

    iget-object p1, p1, Lx6/k;->a:Ljava/util/LinkedHashMap;

    invoke-interface {p1, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp6/l;

    if-eqz p1, :cond_3

    iget-object v1, p1, Lp6/l;->d:Ldc3/h;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Ldc3/h;->r(Ljava/lang/Throwable;)Z

    iget-object v1, p1, Lp6/l;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v4, 0x0

    invoke-virtual {v1, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object p1, p1, Lp6/l;->m:Lbc3/l1;

    invoke-virtual {p1, v3}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_3
    if-ne v2, v0, :cond_0

    :goto_0
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lx6/o;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_5

    if-ne v1, v2, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lx6/o;->y:Ljava/lang/Object;

    check-cast p1, Lx6/k;

    iput v2, p0, Lx6/o;->x:I

    iget-object v1, p0, Lx6/o;->z:Lp6/l;

    invoke-virtual {p1, v1, p0}, Lx6/k;->b(Lp6/l;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    move-object p1, v0

    :cond_6
    :goto_1
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
