.class public final Lec3/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lec3/e0;->w:I

    iput-object p2, p0, Lec3/e0;->y:Ljava/lang/Object;

    iput-object p3, p0, Lec3/e0;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lec3/e0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lmc/c;

    iget-object p2, p0, Lec3/e0;->y:Ljava/lang/Object;

    check-cast p2, Lmc/f;

    iget-object v0, p0, Lec3/e0;->x:Ljava/lang/Object;

    check-cast v0, Lqc/q;

    invoke-interface {p2, v0, p1}, Lmc/f;->d(Lqc/q;Lmc/c;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lj0/h;

    iget-object p2, p0, Lec3/e0;->y:Ljava/lang/Object;

    check-cast p2, Landroidx/compose/material/ripple/RippleNode;

    instance-of v0, p1, Lj0/n;

    if-eqz v0, :cond_1

    iget-boolean v0, p2, Landroidx/compose/material/ripple/RippleNode;->V:Z

    if-eqz v0, :cond_0

    check-cast p1, Lj0/n;

    invoke-virtual {p2, p1}, Landroidx/compose/material/ripple/RippleNode;->X0(Lj0/n;)V

    goto :goto_0

    :cond_0
    iget-object p2, p2, Landroidx/compose/material/ripple/RippleNode;->W:La0/q0;

    invoke-virtual {p2, p1}, La0/q0;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lec3/e0;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v1, p2, Landroidx/compose/material/ripple/RippleNode;->S:Lc33/c;

    if-nez v1, :cond_2

    new-instance v1, Lc33/c;

    iget-boolean v2, p2, Landroidx/compose/material/ripple/RippleNode;->P:Z

    iget-object v3, p2, Landroidx/compose/material/ripple/RippleNode;->R:Lc93/a;

    invoke-direct {v1, v3, v2}, Lc33/c;-><init>(Lc93/a;Z)V

    invoke-static {p2}, La3/g;->h(La3/r;)V

    iput-object v1, p2, Landroidx/compose/material/ripple/RippleNode;->S:Lc33/c;

    :cond_2
    invoke-virtual {v1, p1, v0}, Lc33/c;->e(Lj0/h;Lbc3/c0;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Lj0/h;

    iget-object p2, p0, Lec3/e0;->y:Ljava/lang/Object;

    check-cast p2, Ljava/util/ArrayList;

    instance-of v0, p1, Lj0/l;

    if-eqz v0, :cond_3

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    instance-of v0, p1, Lj0/m;

    if-eqz v0, :cond_4

    check-cast p1, Lj0/m;

    invoke-virtual {p1}, Lj0/m;->a()Lj0/l;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    instance-of v0, p1, Lj0/k;

    if-eqz v0, :cond_5

    check-cast p1, Lj0/k;

    invoke-virtual {p1}, Lj0/k;->a()Lj0/l;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_5
    :goto_1
    iget-object p1, p0, Lec3/e0;->x:Ljava/lang/Object;

    check-cast p1, Lp1/c1;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {p1, p2}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    instance-of v0, p2, Lec3/i1;

    if-eqz v0, :cond_6

    move-object v0, p2

    check-cast v0, Lec3/i1;

    iget v1, v0, Lec3/i1;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_6

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/i1;->x:I

    goto :goto_2

    :cond_6
    new-instance v0, Lec3/i1;

    invoke-direct {v0, p0, p2}, Lec3/i1;-><init>(Lec3/e0;Lq83/d;)V

    :goto_2
    iget-object p2, v0, Lec3/i1;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/i1;->x:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_9

    if-eq v2, v4, :cond_8

    if-ne v2, v3, :cond_7

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    iget-object p1, v0, Lec3/i1;->E:Lec3/m;

    iget-object v2, v0, Lec3/i1;->z:Ljava/lang/Object;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_9
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lec3/e0;->y:Ljava/lang/Object;

    check-cast p2, Lec3/m;

    iput-object p1, v0, Lec3/i1;->z:Ljava/lang/Object;

    iput-object p2, v0, Lec3/i1;->E:Lec3/m;

    iput v4, v0, Lec3/i1;->x:I

    iget-object v2, p0, Lec3/e0;->x:Ljava/lang/Object;

    invoke-interface {v2, p1, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_a

    goto :goto_5

    :cond_a
    move-object v2, p1

    move-object p1, p2

    :goto_3
    const/4 p2, 0x0

    iput-object p2, v0, Lec3/i1;->z:Ljava/lang/Object;

    iput-object p2, v0, Lec3/i1;->E:Lec3/m;

    iput v3, v0, Lec3/i1;->x:I

    invoke-interface {p1, v2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    goto :goto_5

    :cond_b
    :goto_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_5
    return-object v1

    :pswitch_3
    instance-of v0, p2, Lec3/y0;

    if-eqz v0, :cond_c

    move-object v0, p2

    check-cast v0, Lec3/y0;

    iget v1, v0, Lec3/y0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_c

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/y0;->y:I

    goto :goto_6

    :cond_c
    new-instance v0, Lec3/y0;

    invoke-direct {v0, p0, p2}, Lec3/y0;-><init>(Lec3/e0;Lq83/d;)V

    :goto_6
    iget-object p2, v0, Lec3/y0;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/y0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_e

    if-ne v2, v3, :cond_d

    iget-object p1, v0, Lec3/y0;->E:Ljava/lang/Object;

    iget-object v0, v0, Lec3/y0;->w:Lec3/e0;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_7

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lec3/e0;->y:Ljava/lang/Object;

    check-cast p2, Lc93/m;

    iput-object p0, v0, Lec3/y0;->w:Lec3/e0;

    iput-object p1, v0, Lec3/y0;->E:Ljava/lang/Object;

    iput v3, v0, Lec3/y0;->y:I

    invoke-interface {p2, p1, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_f

    goto :goto_8

    :cond_f
    move-object v0, p0

    :goto_7
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_10

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_8
    return-object v1

    :cond_10
    iget-object p2, v0, Lec3/e0;->x:Ljava/lang/Object;

    check-cast p2, Lkotlin/jvm/internal/g0;

    iput-object p1, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance p1, Lkotlinx/coroutines/flow/internal/AbortFlowException;

    invoke-direct {p1, v0}, Lkotlinx/coroutines/flow/internal/AbortFlowException;-><init>(Ljava/lang/Object;)V

    throw p1

    :pswitch_4
    instance-of v0, p2, Lec3/d0;

    if-eqz v0, :cond_11

    move-object v0, p2

    check-cast v0, Lec3/d0;

    iget v1, v0, Lec3/d0;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_11

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/d0;->z:I

    goto :goto_9

    :cond_11
    new-instance v0, Lec3/d0;

    invoke-direct {v0, p0, p2}, Lec3/d0;-><init>(Lec3/e0;Lq83/d;)V

    :goto_9
    iget-object p2, v0, Lec3/d0;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/d0;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_13

    if-ne v2, v3, :cond_12

    iget-object p1, v0, Lec3/d0;->w:Lec3/e0;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_a

    :catchall_0
    move-exception p2

    goto :goto_d

    :cond_12
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_13
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p0, Lec3/e0;->y:Ljava/lang/Object;

    check-cast p2, Lec3/m;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    iput-object p0, v0, Lec3/d0;->w:Lec3/e0;

    iput v3, v0, Lec3/d0;->z:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne p1, v1, :cond_14

    goto :goto_b

    :cond_14
    :goto_a
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_b
    return-object v1

    :catchall_1
    move-exception p2

    :goto_c
    move-object p1, p0

    goto :goto_d

    :catchall_2
    move-exception p1

    move-object p2, p1

    goto :goto_c

    :goto_d
    iget-object p1, p1, Lec3/e0;->x:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/g0;

    iput-object p2, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    throw p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
