.class public final Ls33/b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ls33/c;

.field public final synthetic w:I

.field public x:Lmc3/c;

.field public y:Ls33/c;

.field public z:I


# direct methods
.method public synthetic constructor <init>(Ls33/c;Lq83/d;I)V
    .locals 0

    iput p3, p0, Ls33/b;->w:I

    iput-object p1, p0, Ls33/b;->E:Ls33/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Ls33/b;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ls33/b;

    iget-object v0, p0, Ls33/b;->E:Ls33/c;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Ls33/b;-><init>(Ls33/c;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Ls33/b;

    iget-object v0, p0, Ls33/b;->E:Ls33/c;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Ls33/b;-><init>(Ls33/c;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ls33/b;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Ls33/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls33/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls33/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Ls33/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls33/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls33/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Ls33/b;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ls33/b;->z:I

    const/4 v2, 0x2

    iget-object v3, p0, Ls33/b;->E:Ls33/c;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Ls33/b;->y:Ls33/c;

    iget-object v6, p0, Ls33/b;->x:Lmc3/c;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :goto_0
    iget-object p1, v3, Ls33/c;->a:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_6

    iput-object v5, p0, Ls33/b;->x:Lmc3/c;

    iput-object v5, p0, Ls33/b;->y:Ls33/c;

    iput v4, p0, Ls33/b;->z:I

    const-wide/16 v6, 0x7530

    invoke-static {v6, v7, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_3

    :cond_3
    :goto_1
    iget-object v6, v3, Ls33/c;->h:Lmc3/c;

    iput-object v6, p0, Ls33/b;->x:Lmc3/c;

    iput-object v3, p0, Ls33/b;->y:Ls33/c;

    iput v2, p0, Ls33/b;->z:I

    invoke-virtual {v6, p0}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_3

    :cond_4
    move-object v1, v3

    :goto_2
    :try_start_0
    iget-object p1, v1, Ls33/c;->b:Ljava/util/LinkedHashSet;

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v1

    if-le v1, v4, :cond_5

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v1

    div-int/2addr v1, v2

    invoke-static {p1}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object v7

    invoke-static {v7, v1}, Lxb3/k;->D(Lxb3/i;I)Lxb3/i;

    move-result-object v1

    invoke-static {v1}, Lxb3/k;->F(Lxb3/i;)Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {p1, v1}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_5
    invoke-interface {v6, v5}, Lmc3/a;->i(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-interface {v6, v5}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1

    :cond_6
    iget-object p1, v3, Ls33/c;->c:Lbc3/c2;

    if-eqz p1, :cond_7

    invoke-virtual {p1, v5}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_7
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_3
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ls33/b;->z:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    iget-object v4, p0, Ls33/b;->E:Ls33/c;

    if-eqz v1, :cond_a

    if-eq v1, v3, :cond_9

    if-ne v1, v2, :cond_8

    iget-object v0, p0, Ls33/b;->y:Ls33/c;

    iget-object v1, p0, Ls33/b;->x:Lmc3/c;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_a
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, p0, Ls33/b;->z:I

    const-wide/16 v5, 0xa8c

    invoke-static {v5, v6, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_b

    goto :goto_7

    :cond_b
    :goto_4
    iget-object v1, v4, Ls33/c;->h:Lmc3/c;

    iput-object v1, p0, Ls33/b;->x:Lmc3/c;

    iput-object v4, p0, Ls33/b;->y:Ls33/c;

    iput v2, p0, Ls33/b;->z:I

    invoke-virtual {v1, p0}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_c

    goto :goto_7

    :cond_c
    move-object v0, v4

    :goto_5
    const/4 p1, 0x0

    :try_start_1
    iget-object v2, v0, Ls33/c;->a:Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_d

    iget-object v0, v0, Ls33/c;->a:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2, v3}, Lm83/s;->z0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, p1, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_6

    :catchall_1
    move-exception v0

    goto :goto_8

    :cond_d
    :goto_6
    invoke-interface {v1, p1}, Lmc3/a;->i(Ljava/lang/Object;)V

    iget-object v0, v4, Ls33/c;->a:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_e

    iget-object v0, v4, Ls33/c;->g:Lhc3/d;

    new-instance v1, Ls33/b;

    const/4 v2, 0x0

    invoke-direct {v1, v4, p1, v2}, Ls33/b;-><init>(Ls33/c;Lq83/d;I)V

    const/4 v2, 0x3

    invoke-static {v0, p1, p1, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, v4, Ls33/c;->f:Lbc3/c2;

    :cond_e
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_7
    return-object v0

    :goto_8
    invoke-interface {v1, p1}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
