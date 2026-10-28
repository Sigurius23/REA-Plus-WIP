.class public final La6/o;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:La6/i0;


# direct methods
.method public synthetic constructor <init>(La6/i0;Lq83/d;I)V
    .locals 0

    iput p3, p0, La6/o;->w:I

    iput-object p1, p0, La6/o;->y:La6/i0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, La6/o;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, La6/o;

    iget-object v0, p0, La6/o;->y:La6/i0;

    const/4 v1, 0x2

    invoke-direct {p1, v0, p2, v1}, La6/o;-><init>(La6/i0;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, La6/o;

    iget-object v0, p0, La6/o;->y:La6/i0;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, La6/o;-><init>(La6/i0;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, La6/o;

    iget-object v0, p0, La6/o;->y:La6/i0;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, La6/o;-><init>(La6/i0;Lq83/d;I)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, La6/o;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, La6/o;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La6/o;->y:La6/i0;

    iget-object v1, v0, La6/i0;->g:Lbu/c;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, La6/o;->x:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lbu/c;->C()La6/e1;

    move-result-object p1

    instance-of p1, p1, La6/s0;

    if-eqz p1, :cond_3

    invoke-virtual {v1}, Lbu/c;->C()La6/e1;

    move-result-object v2

    goto :goto_3

    :cond_3
    :try_start_1
    iput v5, p0, La6/o;->x:I

    invoke-static {v0, p0}, La6/i0;->e(La6/i0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v2, :cond_4

    goto :goto_3

    :cond_4
    :goto_0
    iput v4, p0, La6/o;->x:I

    const/4 p1, 0x0

    invoke-static {v0, p1, p0}, La6/i0;->f(La6/i0;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_5

    goto :goto_3

    :cond_5
    :goto_1
    move-object v2, p1

    check-cast v2, La6/e1;

    goto :goto_3

    :goto_2
    new-instance v2, La6/v0;

    const/4 v0, -0x1

    invoke-direct {v2, v0, p1}, La6/v0;-><init>(ILjava/lang/Throwable;)V

    :goto_3
    return-object v2

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La6/o;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x2

    const/4 v4, 0x1

    iget-object v5, p0, La6/o;->y:La6/i0;

    if-eqz v1, :cond_9

    if-eq v1, v4, :cond_8

    if-ne v1, v3, :cond_7

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_6
    move-object v0, v2

    goto :goto_6

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_9
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v5, La6/i0;->h:Lzt/q;

    iput v4, p0, La6/o;->x:I

    iget-object p1, p1, Lzt/q;->y:Ljava/lang/Object;

    check-cast p1, Lbc3/t;

    invoke-virtual {p1, p0}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    goto :goto_4

    :cond_a
    move-object p1, v2

    :goto_4
    if-ne p1, v0, :cond_b

    goto :goto_6

    :cond_b
    :goto_5
    invoke-virtual {v5}, La6/i0;->h()La6/d1;

    move-result-object p1

    iget-object p1, p1, La6/d1;->c:Lec3/s1;

    const/4 v1, -0x1

    invoke-static {p1, v1, v3}, Lec3/v;->i(Lec3/l;II)Lec3/l;

    move-result-object p1

    new-instance v1, La6/z;

    const/4 v4, 0x0

    invoke-direct {v1, v5, v4}, La6/z;-><init>(Ljava/lang/Object;I)V

    iput v3, p0, La6/o;->x:I

    invoke-interface {p1, v1, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_6
    return-object v0

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La6/o;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_d

    if-ne v1, v2, :cond_c

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_7

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v2, p0, La6/o;->x:I

    iget-object p1, p0, La6/o;->y:La6/i0;

    invoke-static {p1, p0}, La6/i0;->d(La6/i0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_e

    goto :goto_8

    :cond_e
    :goto_7
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_8
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
