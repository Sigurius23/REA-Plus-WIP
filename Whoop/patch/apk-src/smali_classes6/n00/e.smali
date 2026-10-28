.class public final Ln00/e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Ln00/k;


# direct methods
.method public synthetic constructor <init>(Ln00/k;Lq83/d;I)V
    .locals 0

    iput p3, p0, Ln00/e;->w:I

    iput-object p1, p0, Ln00/e;->y:Ln00/k;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Ln00/e;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ln00/e;

    iget-object v0, p0, Ln00/e;->y:Ln00/k;

    const/4 v1, 0x2

    invoke-direct {p1, v0, p2, v1}, Ln00/e;-><init>(Ln00/k;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Ln00/e;

    iget-object v0, p0, Ln00/e;->y:Ln00/k;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Ln00/e;-><init>(Ln00/k;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Ln00/e;

    iget-object v0, p0, Ln00/e;->y:Ln00/k;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Ln00/e;-><init>(Ln00/k;Lq83/d;I)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ln00/e;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Ln00/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln00/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln00/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Ln00/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln00/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln00/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Ln00/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln00/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln00/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Ln00/e;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ln00/e;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_0
    move-object v0, v2

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, p0, Ln00/e;->x:I

    iget-object p1, p0, Ln00/e;->y:Ln00/k;

    iget-object v1, p1, Ln00/k;->z:Lxz/x;

    iget-object v1, v1, Lxz/x;->l:Lec3/r1;

    new-instance v3, Landroidx/room/e;

    const/4 v4, 0x0

    const/16 v5, 0x17

    invoke-direct {v3, p1, v4, v5}, Landroidx/room/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v1, v3, p0}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_0

    :cond_3
    move-object p1, v2

    :goto_0
    if-ne p1, v0, :cond_0

    :goto_1
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ln00/e;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_6

    if-ne v1, v3, :cond_5

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_4
    move-object v0, v2

    goto :goto_3

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, p0, Ln00/e;->x:I

    iget-object p1, p0, Ln00/e;->y:Ln00/k;

    iget-object v1, p1, Ln00/k;->K:Lg40/f3;

    iget-object v1, v1, Lg40/f3;->x:Ln53/e;

    new-instance v3, Ld33/x;

    const/4 v4, 0x2

    const/4 v5, 0x6

    const/4 v6, 0x0

    invoke-direct {v3, v4, v5, v6}, Ld33/x;-><init>(IILq83/d;)V

    invoke-static {v3, v1}, Lec3/v;->I(Lc93/m;Lec3/l;)Lfc3/k;

    move-result-object v1

    new-instance v3, Lh20/i0;

    const/16 v4, 0x1d

    invoke-direct {v3, p1, v6, v4}, Lh20/i0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v1, v3, p0}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_2

    :cond_7
    move-object p1, v2

    :goto_2
    if-ne p1, v0, :cond_4

    :goto_3
    return-object v0

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ln00/e;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_a

    if-ne v1, v3, :cond_9

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_8
    move-object v0, v2

    goto :goto_5

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, p0, Ln00/e;->x:I

    iget-object p1, p0, Ln00/e;->y:Ln00/k;

    iget-object v1, p1, Ln00/k;->M:Lg40/f3;

    iget-object v1, v1, Lg40/f3;->q:Lec3/r1;

    new-instance v3, Landroidx/room/y;

    const/4 v4, 0x4

    invoke-direct {v3, v4, v1, p1}, Landroidx/room/y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p1, Ln00/k;->K:Lg40/f3;

    iget-object v1, v1, Lg40/f3;->q:Lec3/r1;

    new-instance v4, Lch/o;

    const/4 v5, 0x2

    invoke-direct {v4, v1, v5}, Lch/o;-><init>(Lec3/l;I)V

    iget-object v1, p1, Ln00/k;->L:Lg40/z1;

    iget-object v1, v1, Lg40/z1;->l:Ln53/e;

    new-instance v5, Ln00/j;

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-direct {v5, v6, v7}, Ls83/i;-><init>(ILq83/d;)V

    invoke-static {v3, v4, v1, v5}, Lec3/v;->p(Lec3/l;Lec3/l;Lec3/l;Lc93/n;)Lec3/j1;

    move-result-object v1

    new-instance v3, Lb30/i5;

    const/4 v4, 0x4

    invoke-direct {v3, p1, v7, v4}, Lb30/i5;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v1, v3, p0}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_b

    goto :goto_4

    :cond_b
    move-object p1, v2

    :goto_4
    if-ne p1, v0, :cond_8

    :goto_5
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
