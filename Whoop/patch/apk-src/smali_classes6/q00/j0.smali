.class public final Lq00/j0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lq00/p0;


# direct methods
.method public synthetic constructor <init>(Lq00/p0;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lq00/j0;->w:I

    iput-object p1, p0, Lq00/j0;->y:Lq00/p0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Lq00/j0;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lq00/j0;

    iget-object v0, p0, Lq00/j0;->y:Lq00/p0;

    const/4 v1, 0x4

    invoke-direct {p1, v0, p2, v1}, Lq00/j0;-><init>(Lq00/p0;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lq00/j0;

    iget-object v0, p0, Lq00/j0;->y:Lq00/p0;

    const/4 v1, 0x3

    invoke-direct {p1, v0, p2, v1}, Lq00/j0;-><init>(Lq00/p0;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Lq00/j0;

    iget-object v0, p0, Lq00/j0;->y:Lq00/p0;

    const/4 v1, 0x2

    invoke-direct {p1, v0, p2, v1}, Lq00/j0;-><init>(Lq00/p0;Lq83/d;I)V

    return-object p1

    :pswitch_2
    new-instance p1, Lq00/j0;

    iget-object v0, p0, Lq00/j0;->y:Lq00/p0;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Lq00/j0;-><init>(Lq00/p0;Lq83/d;I)V

    return-object p1

    :pswitch_3
    new-instance p1, Lq00/j0;

    iget-object v0, p0, Lq00/j0;->y:Lq00/p0;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Lq00/j0;-><init>(Lq00/p0;Lq83/d;I)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lq00/j0;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lq00/j0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lq00/j0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lq00/j0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lq00/j0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lq00/j0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lq00/j0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lq00/j0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lq00/j0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lq00/j0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lq00/j0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lq00/j0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lq00/j0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p0, p1, p2}, Lq00/j0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lq00/j0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lq00/j0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget v0, p0, Lq00/j0;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lq00/j0;->x:I

    const/4 v2, 0x1

    iget-object v3, p0, Lq00/j0;->y:Lq00/p0;

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v3, Lq00/p0;->y:Lxz/x;

    iput v2, p0, Lq00/j0;->x:I

    invoke-virtual {p1, p0}, Lxz/x;->d(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_3

    :cond_2
    :goto_0
    instance-of v0, p1, Ll83/m;

    if-nez v0, :cond_3

    :try_start_0
    check-cast p1, Ly00/k2;

    new-instance v0, Ljz/f;

    iget-object p1, p1, Ly00/k2;->x:Ljava/lang/String;

    iget-object v1, v3, Lq00/p0;->x:Ld00/l;

    iget-object v1, v1, Ld00/l;->x:Ljava/lang/String;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, Ljz/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object p1, v0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :cond_3
    :goto_1
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_5

    check-cast p1, Ljz/f;

    iget-object v1, v3, Lq00/p0;->M:Lec3/h2;

    :cond_4
    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lq00/i0;

    new-instance v11, Lq00/b;

    invoke-direct {v11, p1}, Lq00/b;-><init>(Ljz/f;)V

    const/4 v12, 0x0

    const v13, 0xfefffff

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v2 .. v13}, Lq00/i0;->a(Lq00/i0;Ljava/util/ArrayList;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Lzy/c;Ll40/a;Ll40/a;Lq00/c;Lzy/c;I)Lq00/i0;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_5
    const-string p1, "Failed to create Link account session"

    invoke-static {v3, v0, p1}, Lq00/p0;->j(Lq00/p0;Ljava/lang/Throwable;Ljava/lang/String;)V

    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_3
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lq00/j0;->x:I

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

    iget-object p1, p0, Lq00/j0;->y:Lq00/p0;

    iget-object v1, p1, Lq00/p0;->P:Lx30/e0;

    iget-object v1, v1, Lx30/e0;->q:Ln53/e;

    new-instance v3, Lq00/k0;

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-direct {v3, p1, v4, v5}, Lq00/k0;-><init>(Lq00/p0;Lq83/d;I)V

    iput v2, p0, Lq00/j0;->x:I

    invoke-static {v1, v3, p0}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto :goto_5

    :cond_8
    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_5
    return-object v0

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lq00/j0;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_a

    if-ne v1, v2, :cond_9

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_6

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lq00/j0;->y:Lq00/p0;

    iget-object v1, p1, Lq00/p0;->O:Lg40/f3;

    iget-object v1, v1, Lg40/f3;->x:Ln53/e;

    new-instance v3, Lq00/k0;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v3, p1, v4, v5}, Lq00/k0;-><init>(Lq00/p0;Lq83/d;I)V

    iput v2, p0, Lq00/j0;->x:I

    invoke-static {v1, v3, p0}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_b

    goto :goto_7

    :cond_b
    :goto_6
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_7
    return-object v0

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lq00/j0;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_d

    if-ne v1, v2, :cond_c

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_8

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lq00/j0;->y:Lq00/p0;

    iget-object v1, p1, Lq00/p0;->y:Lxz/x;

    iget-object v1, v1, Lxz/x;->i:Lec3/r1;

    new-instance v3, Lch/i;

    const/4 v4, 0x2

    invoke-direct {v3, v1, v4}, Lch/i;-><init>(Lec3/l;I)V

    new-instance v1, Ln20/j;

    const/4 v4, 0x0

    const/16 v5, 0x11

    invoke-direct {v1, p1, v4, v5}, Ln20/j;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput v2, p0, Lq00/j0;->x:I

    invoke-static {v3, v1, p0}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_e

    goto :goto_9

    :cond_e
    :goto_8
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_9
    return-object v0

    :pswitch_3
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lq00/j0;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_10

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_a

    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_10
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lq00/j0;->y:Lq00/p0;

    iget-object v1, p1, Lq00/p0;->H:Lwz/n0;

    invoke-static {v1}, Lq00/p0;->n(Lwz/n0;)Ljava/lang/String;

    move-result-object v1

    iput v2, p0, Lq00/j0;->x:I

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2, p0}, Lq00/p0;->o(Ljava/lang/String;ZLs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_11

    goto :goto_b

    :cond_11
    :goto_a
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_b
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
