.class public final Lcz/c0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lcz/n0;


# direct methods
.method public synthetic constructor <init>(Lcz/n0;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lcz/c0;->w:I

    iput-object p1, p0, Lcz/c0;->y:Lcz/n0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Lcz/c0;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lcz/c0;

    iget-object v0, p0, Lcz/c0;->y:Lcz/n0;

    const/4 v1, 0x4

    invoke-direct {p1, v0, p2, v1}, Lcz/c0;-><init>(Lcz/n0;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lcz/c0;

    iget-object v0, p0, Lcz/c0;->y:Lcz/n0;

    const/4 v1, 0x3

    invoke-direct {p1, v0, p2, v1}, Lcz/c0;-><init>(Lcz/n0;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Lcz/c0;

    iget-object v0, p0, Lcz/c0;->y:Lcz/n0;

    const/4 v1, 0x2

    invoke-direct {p1, v0, p2, v1}, Lcz/c0;-><init>(Lcz/n0;Lq83/d;I)V

    return-object p1

    :pswitch_2
    new-instance p1, Lcz/c0;

    iget-object v0, p0, Lcz/c0;->y:Lcz/n0;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Lcz/c0;-><init>(Lcz/n0;Lq83/d;I)V

    return-object p1

    :pswitch_3
    new-instance p1, Lcz/c0;

    iget-object v0, p0, Lcz/c0;->y:Lcz/n0;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Lcz/c0;-><init>(Lcz/n0;Lq83/d;I)V

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

    iget v0, p0, Lcz/c0;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lcz/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcz/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcz/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lcz/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcz/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcz/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lcz/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcz/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcz/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lcz/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcz/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcz/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p0, p1, p2}, Lcz/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcz/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcz/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 6

    iget v0, p0, Lcz/c0;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcz/c0;->x:I

    const/4 v2, 0x1

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

    iget-object p1, p0, Lcz/c0;->y:Lcz/n0;

    iget-object v1, p1, Lcz/n0;->G:Lcz/i;

    iget-object p1, p1, Lcz/n0;->z:Lcz/b;

    iput v2, p0, Lcz/c0;->x:I

    check-cast v1, Lcz/w0;

    invoke-virtual {v1, p1, p0}, Lcz/w0;->a(Lcz/b;Ls83/c;)Ljava/io/Serializable;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    new-instance v0, Ll83/n;

    invoke-direct {v0, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    :goto_1
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcz/c0;->x:I

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

    iget-object p1, p0, Lcz/c0;->y:Lcz/n0;

    iget-object v1, p1, Lcz/n0;->J:Lec3/h2;

    new-instance v3, Lcz/d0;

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-direct {v3, p1, v4, v5}, Lcz/d0;-><init>(Lcz/n0;Lq83/d;I)V

    iput v2, p0, Lcz/c0;->x:I

    invoke-static {v1, v3, p0}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_3
    return-object v0

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcz/c0;->x:I

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

    iget-object p1, p0, Lcz/c0;->y:Lcz/n0;

    iget-object v1, p1, Lcz/n0;->J:Lec3/h2;

    new-instance v3, Le;

    const/4 v4, 0x0

    const/16 v5, 0x19

    invoke-direct {v3, p1, v4, v5}, Le;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput v2, p0, Lcz/c0;->x:I

    invoke-static {v1, v3, p0}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto :goto_5

    :cond_8
    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_5
    return-object v0

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcz/c0;->x:I

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

    iget-object p1, p0, Lcz/c0;->y:Lcz/n0;

    iget-object v1, p1, Lcz/n0;->S:Ln53/e;

    new-instance v3, Lcz/d0;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v3, p1, v4, v5}, Lcz/d0;-><init>(Lcz/n0;Lq83/d;I)V

    iput v2, p0, Lcz/c0;->x:I

    invoke-static {v1, v3, p0}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_b

    goto :goto_7

    :cond_b
    :goto_6
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_7
    return-object v0

    :pswitch_3
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcz/c0;->x:I

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

    iput v2, p0, Lcz/c0;->x:I

    iget-object p1, p0, Lcz/c0;->y:Lcz/n0;

    invoke-static {p1, p0}, Lcz/n0;->g(Lcz/n0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_e

    goto :goto_9

    :cond_e
    :goto_8
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_9
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
