.class public final Lw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lec3/m;


# direct methods
.method public synthetic constructor <init>(Lec3/m;I)V
    .locals 0

    iput p2, p0, Lw;->w:I

    iput-object p1, p0, Lw;->x:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lec3/l;Lq83/d;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lec3/v0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lec3/v0;

    iget v1, v0, Lec3/v0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/v0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lec3/v0;

    invoke-direct {v0, p0, p2}, Lec3/v0;-><init>(Lw;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lec3/v0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/v0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, v0, Lec3/v0;->y:I

    iget-object p2, p0, Lw;->x:Lec3/m;

    invoke-static {p2, p1, v0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lw;->w:I

    const/4 v1, 0x0

    iget-object v2, p0, Lw;->x:Lec3/m;

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    const/high16 v5, -0x80000000

    const/4 v6, 0x1

    packed-switch v0, :pswitch_data_0

    instance-of v0, p2, Lzx/r;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lzx/r;

    iget v1, v0, Lzx/r;->x:I

    and-int v7, v1, v5

    if-eqz v7, :cond_0

    sub-int/2addr v1, v5

    iput v1, v0, Lzx/r;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lzx/r;

    invoke-direct {v0, p0, p2}, Lzx/r;-><init>(Lw;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lzx/r;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v5, v0, Lzx/r;->x:I

    if-eqz v5, :cond_2

    if-ne v5, v6, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Lzx/d;

    new-instance p2, Lzx/b;

    iget-object v4, p1, Lzx/d;->a:Ljava/lang/Object;

    iget-object p1, p1, Lzx/d;->b:Ljava/util/List;

    invoke-direct {p2, v4, p1}, Lzx/b;-><init>(Ljava/util/List;Ljava/util/List;)V

    iput v6, v0, Lzx/r;->x:I

    invoke-interface {v2, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    move-object v3, v1

    :cond_3
    :goto_1
    return-object v3

    :pswitch_0
    instance-of v0, p2, Lzx/q;

    if-eqz v0, :cond_4

    move-object v0, p2

    check-cast v0, Lzx/q;

    iget v1, v0, Lzx/q;->x:I

    and-int v7, v1, v5

    if-eqz v7, :cond_4

    sub-int/2addr v1, v5

    iput v1, v0, Lzx/q;->x:I

    goto :goto_2

    :cond_4
    new-instance v0, Lzx/q;

    invoke-direct {v0, p0, p2}, Lzx/q;-><init>(Lw;Lq83/d;)V

    :goto_2
    iget-object p2, v0, Lzx/q;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v5, v0, Lzx/q;->x:I

    if-eqz v5, :cond_6

    if-ne v5, v6, :cond_5

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p2, p1, Lzx/d;

    if-eqz p2, :cond_7

    iput v6, v0, Lzx/q;->x:I

    invoke-interface {v2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    move-object v3, v1

    :cond_7
    :goto_3
    return-object v3

    :pswitch_1
    instance-of v0, p2, Lx30/n0;

    if-eqz v0, :cond_8

    move-object v0, p2

    check-cast v0, Lx30/n0;

    iget v1, v0, Lx30/n0;->x:I

    and-int v7, v1, v5

    if-eqz v7, :cond_8

    sub-int/2addr v1, v5

    iput v1, v0, Lx30/n0;->x:I

    goto :goto_4

    :cond_8
    new-instance v0, Lx30/n0;

    invoke-direct {v0, p0, p2}, Lx30/n0;-><init>(Lw;Lq83/d;)V

    :goto_4
    iget-object p2, v0, Lx30/n0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v5, v0, Lx30/n0;->x:I

    if-eqz v5, :cond_a

    if-ne v5, v6, :cond_9

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Lzx/e;

    invoke-interface {p1}, Lzx/e;->a()Ljava/util/List;

    move-result-object p1

    iput v6, v0, Lx30/n0;->x:I

    invoke-interface {v2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    move-object v3, v1

    :cond_b
    :goto_5
    return-object v3

    :pswitch_2
    instance-of v0, p2, Lx30/m0;

    if-eqz v0, :cond_c

    move-object v0, p2

    check-cast v0, Lx30/m0;

    iget v1, v0, Lx30/m0;->x:I

    and-int v7, v1, v5

    if-eqz v7, :cond_c

    sub-int/2addr v1, v5

    iput v1, v0, Lx30/m0;->x:I

    goto :goto_6

    :cond_c
    new-instance v0, Lx30/m0;

    invoke-direct {v0, p0, p2}, Lx30/m0;-><init>(Lw;Lq83/d;)V

    :goto_6
    iget-object p2, v0, Lx30/m0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v5, v0, Lx30/m0;->x:I

    if-eqz v5, :cond_e

    if-ne v5, v6, :cond_d

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_7

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p2, p1, Lzx/d;

    if-eqz p2, :cond_f

    iput v6, v0, Lx30/m0;->x:I

    invoke-interface {v2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_f

    move-object v3, v1

    :cond_f
    :goto_7
    return-object v3

    :pswitch_3
    instance-of v0, p2, Lx20/u;

    if-eqz v0, :cond_10

    move-object v0, p2

    check-cast v0, Lx20/u;

    iget v1, v0, Lx20/u;->x:I

    and-int v7, v1, v5

    if-eqz v7, :cond_10

    sub-int/2addr v1, v5

    iput v1, v0, Lx20/u;->x:I

    goto :goto_8

    :cond_10
    new-instance v0, Lx20/u;

    invoke-direct {v0, p0, p2}, Lx20/u;-><init>(Lw;Lq83/d;)V

    :goto_8
    iget-object p2, v0, Lx20/u;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v5, v0, Lx20/u;->x:I

    if-eqz v5, :cond_12

    if-ne v5, v6, :cond_11

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_a

    :cond_11
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_12
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Lcom/stripe/android/model/StripeIntent$Status;

    if-eqz p1, :cond_13

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    packed-switch p1, :pswitch_data_1

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_4
    sget-object p1, Lx20/o;->x:Lx20/o;

    goto :goto_9

    :pswitch_5
    sget-object p1, Lx20/o;->w:Lx20/o;

    goto :goto_9

    :pswitch_6
    sget-object p1, Lx20/o;->y:Lx20/o;

    goto :goto_9

    :cond_13
    sget-object p1, Lx20/o;->w:Lx20/o;

    :goto_9
    iput v6, v0, Lx20/u;->x:I

    invoke-interface {v2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_14

    move-object v3, v1

    :cond_14
    :goto_a
    return-object v3

    :pswitch_7
    instance-of v0, p2, Lw23/e;

    if-eqz v0, :cond_15

    move-object v0, p2

    check-cast v0, Lw23/e;

    iget v1, v0, Lw23/e;->x:I

    and-int v7, v1, v5

    if-eqz v7, :cond_15

    sub-int/2addr v1, v5

    iput v1, v0, Lw23/e;->x:I

    goto :goto_b

    :cond_15
    new-instance v0, Lw23/e;

    invoke-direct {v0, p0, p2}, Lw23/e;-><init>(Lw;Lq83/d;)V

    :goto_b
    iget-object p2, v0, Lw23/e;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v5, v0, Lw23/e;->x:I

    if-eqz v5, :cond_17

    if-ne v5, v6, :cond_16

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_c

    :cond_16
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_17
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    xor-int/2addr p1, v6

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput v6, v0, Lw23/e;->x:I

    invoke-interface {v2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_18

    move-object v3, v1

    :cond_18
    :goto_c
    return-object v3

    :pswitch_8
    instance-of v0, p2, Lw23/d;

    if-eqz v0, :cond_19

    move-object v0, p2

    check-cast v0, Lw23/d;

    iget v7, v0, Lw23/d;->x:I

    and-int v8, v7, v5

    if-eqz v8, :cond_19

    sub-int/2addr v7, v5

    iput v7, v0, Lw23/d;->x:I

    goto :goto_d

    :cond_19
    new-instance v0, Lw23/d;

    invoke-direct {v0, p0, p2}, Lw23/d;-><init>(Lw;Lq83/d;)V

    :goto_d
    iget-object p2, v0, Lw23/d;->w:Ljava/lang/Object;

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v7, v0, Lw23/d;->x:I

    if-eqz v7, :cond_1b

    if-ne v7, v6, :cond_1a

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_e

    :cond_1a
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1b
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object v4, p2

    check-cast v4, Lt23/g2;

    iget-object v4, v4, Lt23/g2;->h:Ll83/p;

    invoke-virtual {v4}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_1c

    move-object v1, p2

    :cond_1d
    iput v6, v0, Lw23/d;->x:I

    invoke-interface {v2, v1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v5, :cond_1e

    move-object v3, v5

    :cond_1e
    :goto_e
    return-object v3

    :pswitch_9
    instance-of v0, p2, Lw23/b;

    if-eqz v0, :cond_1f

    move-object v0, p2

    check-cast v0, Lw23/b;

    iget v1, v0, Lw23/b;->x:I

    and-int v7, v1, v5

    if-eqz v7, :cond_1f

    sub-int/2addr v1, v5

    iput v1, v0, Lw23/b;->x:I

    goto :goto_f

    :cond_1f
    new-instance v0, Lw23/b;

    invoke-direct {v0, p0, p2}, Lw23/b;-><init>(Lw;Lq83/d;)V

    :goto_f
    iget-object p2, v0, Lw23/b;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v5, v0, Lw23/b;->x:I

    if-eqz v5, :cond_21

    if-ne v5, v6, :cond_20

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_10

    :cond_20
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_21
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, p1

    check-cast p2, Lorg/webrtc/PeerConnection$PeerConnectionState;

    sget-object v4, Lorg/webrtc/PeerConnection$PeerConnectionState;->CONNECTED:Lorg/webrtc/PeerConnection$PeerConnectionState;

    if-ne p2, v4, :cond_22

    iput v6, v0, Lw23/b;->x:I

    invoke-interface {v2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_22

    move-object v3, v1

    :cond_22
    :goto_10
    return-object v3

    :pswitch_a
    instance-of v0, p2, Lt23/p3;

    if-eqz v0, :cond_23

    move-object v0, p2

    check-cast v0, Lt23/p3;

    iget v7, v0, Lt23/p3;->x:I

    and-int v8, v7, v5

    if-eqz v8, :cond_23

    sub-int/2addr v7, v5

    iput v7, v0, Lt23/p3;->x:I

    goto :goto_11

    :cond_23
    new-instance v0, Lt23/p3;

    invoke-direct {v0, p0, p2}, Lt23/p3;-><init>(Lw;Lq83/d;)V

    :goto_11
    iget-object p2, v0, Lt23/p3;->w:Ljava/lang/Object;

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v7, v0, Lt23/p3;->x:I

    if-eqz v7, :cond_25

    if-ne v7, v6, :cond_24

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_12

    :cond_24
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_25
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ld33/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput v6, v0, Lt23/p3;->x:I

    invoke-interface {v2, v1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v5, :cond_26

    move-object v3, v5

    :cond_26
    :goto_12
    return-object v3

    :pswitch_b
    instance-of v0, p2, Lt23/o3;

    if-eqz v0, :cond_27

    move-object v0, p2

    check-cast v0, Lt23/o3;

    iget v1, v0, Lt23/o3;->x:I

    and-int v2, v1, v5

    if-eqz v2, :cond_27

    sub-int/2addr v1, v5

    iput v1, v0, Lt23/o3;->x:I

    goto :goto_13

    :cond_27
    new-instance v0, Lt23/o3;

    invoke-direct {v0, p0, p2}, Lt23/o3;-><init>(Lw;Lq83/d;)V

    :goto_13
    iget-object p2, v0, Lt23/o3;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v0, v0, Lt23/o3;->x:I

    if-eqz v0, :cond_29

    if-ne v0, v6, :cond_28

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_14

    :cond_28
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_29
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ld33/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Ld33/a;->w:Ld33/a;

    :goto_14
    return-object v3

    :pswitch_c
    instance-of v0, p2, Lt23/r0;

    if-eqz v0, :cond_2a

    move-object v0, p2

    check-cast v0, Lt23/r0;

    iget v1, v0, Lt23/r0;->x:I

    and-int v7, v1, v5

    if-eqz v7, :cond_2a

    sub-int/2addr v1, v5

    iput v1, v0, Lt23/r0;->x:I

    goto :goto_15

    :cond_2a
    new-instance v0, Lt23/r0;

    invoke-direct {v0, p0, p2}, Lt23/r0;-><init>(Lw;Lq83/d;)V

    :goto_15
    iget-object p2, v0, Lt23/r0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v5, v0, Lt23/r0;->x:I

    if-eqz v5, :cond_2c

    if-ne v5, v6, :cond_2b

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_17

    :cond_2b
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2c
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Long;

    if-eqz p1, :cond_2d

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    goto :goto_16

    :cond_2d
    const-wide/16 p1, 0x0

    :goto_16
    const-wide/16 v4, 0x3e8

    div-long/2addr p1, v4

    sget-object v4, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {p1, p2, v4}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide p1

    invoke-static {p1, p2}, Lkotlin/time/Duration;->box-impl(J)Lkotlin/time/Duration;

    move-result-object p1

    iput v6, v0, Lt23/r0;->x:I

    invoke-interface {v2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2e

    move-object v3, v1

    :cond_2e
    :goto_17
    return-object v3

    :pswitch_d
    instance-of v0, p2, Lt23/d;

    if-eqz v0, :cond_2f

    move-object v0, p2

    check-cast v0, Lt23/d;

    iget v1, v0, Lt23/d;->x:I

    and-int v7, v1, v5

    if-eqz v7, :cond_2f

    sub-int/2addr v1, v5

    iput v1, v0, Lt23/d;->x:I

    goto :goto_18

    :cond_2f
    new-instance v0, Lt23/d;

    invoke-direct {v0, p0, p2}, Lt23/d;-><init>(Lw;Lq83/d;)V

    :goto_18
    iget-object p2, v0, Lt23/d;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v5, v0, Lt23/d;->x:I

    if-eqz v5, :cond_31

    if-ne v5, v6, :cond_30

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_19

    :cond_30
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_31
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Lorg/webrtc/PeerConnection$PeerConnectionState;

    iput v6, v0, Lt23/d;->x:I

    invoke-interface {v2, v3, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_32

    move-object v3, v1

    :cond_32
    :goto_19
    return-object v3

    :pswitch_e
    instance-of v0, p2, Lt23/c;

    if-eqz v0, :cond_33

    move-object v0, p2

    check-cast v0, Lt23/c;

    iget v1, v0, Lt23/c;->x:I

    and-int v7, v1, v5

    if-eqz v7, :cond_33

    sub-int/2addr v1, v5

    iput v1, v0, Lt23/c;->x:I

    goto :goto_1a

    :cond_33
    new-instance v0, Lt23/c;

    invoke-direct {v0, p0, p2}, Lt23/c;-><init>(Lw;Lq83/d;)V

    :goto_1a
    iget-object p2, v0, Lt23/c;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v5, v0, Lt23/c;->x:I

    if-eqz v5, :cond_35

    if-ne v5, v6, :cond_34

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1b

    :cond_34
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_35
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, p1

    check-cast p2, Lorg/webrtc/PeerConnection$PeerConnectionState;

    sget-object v4, Lorg/webrtc/PeerConnection$PeerConnectionState;->CONNECTED:Lorg/webrtc/PeerConnection$PeerConnectionState;

    if-ne p2, v4, :cond_36

    iput v6, v0, Lt23/c;->x:I

    invoke-interface {v2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_36

    move-object v3, v1

    :cond_36
    :goto_1b
    return-object v3

    :pswitch_f
    instance-of v0, p2, Lrv/g;

    if-eqz v0, :cond_37

    move-object v0, p2

    check-cast v0, Lrv/g;

    iget v1, v0, Lrv/g;->x:I

    and-int v7, v1, v5

    if-eqz v7, :cond_37

    sub-int/2addr v1, v5

    iput v1, v0, Lrv/g;->x:I

    goto :goto_1c

    :cond_37
    new-instance v0, Lrv/g;

    invoke-direct {v0, p0, p2}, Lrv/g;-><init>(Lw;Lq83/d;)V

    :goto_1c
    iget-object p2, v0, Lrv/g;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v5, v0, Lrv/g;->x:I

    if-eqz v5, :cond_39

    if-ne v5, v6, :cond_38

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1d

    :cond_38
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_39
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Lcom/mapbox/common/location/Location;

    invoke-virtual {p1}, Lcom/mapbox/common/location/Location;->getBearing()Ljava/lang/Double;

    move-result-object p1

    if-nez p1, :cond_3a

    goto :goto_1d

    :cond_3a
    iput v6, v0, Lrv/g;->x:I

    invoke-interface {v2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3b

    move-object v3, v1

    :cond_3b
    :goto_1d
    return-object v3

    :pswitch_10
    instance-of v0, p2, Lrv/b;

    if-eqz v0, :cond_3c

    move-object v0, p2

    check-cast v0, Lrv/b;

    iget v1, v0, Lrv/b;->x:I

    and-int v7, v1, v5

    if-eqz v7, :cond_3c

    sub-int/2addr v1, v5

    iput v1, v0, Lrv/b;->x:I

    goto :goto_1e

    :cond_3c
    new-instance v0, Lrv/b;

    invoke-direct {v0, p0, p2}, Lrv/b;-><init>(Lw;Lq83/d;)V

    :goto_1e
    iget-object p2, v0, Lrv/b;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v5, v0, Lrv/b;->x:I

    if-eqz v5, :cond_3e

    if-ne v5, v6, :cond_3d

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1f

    :cond_3d
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3e
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Lcom/mapbox/common/location/Location;

    invoke-virtual {p1}, Lcom/mapbox/common/location/Location;->getAltitude()Ljava/lang/Double;

    move-result-object p2

    if-eqz p2, :cond_3f

    invoke-virtual {p1}, Lcom/mapbox/common/location/Location;->getLongitude()D

    move-result-wide v7

    invoke-virtual {p1}, Lcom/mapbox/common/location/Location;->getLatitude()D

    move-result-wide v9

    invoke-virtual {p1}, Lcom/mapbox/common/location/Location;->getAltitude()Ljava/lang/Double;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v11

    invoke-static/range {v7 .. v12}, Lcom/mapbox/geojson/Point;->fromLngLat(DDD)Lcom/mapbox/geojson/Point;

    move-result-object p2

    if-nez p2, :cond_40

    :cond_3f
    invoke-virtual {p1}, Lcom/mapbox/common/location/Location;->getLongitude()D

    move-result-wide v4

    invoke-virtual {p1}, Lcom/mapbox/common/location/Location;->getLatitude()D

    move-result-wide p1

    invoke-static {v4, v5, p1, p2}, Lcom/mapbox/geojson/Point;->fromLngLat(DD)Lcom/mapbox/geojson/Point;

    move-result-object p2

    :cond_40
    iput v6, v0, Lrv/b;->x:I

    invoke-interface {v2, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_41

    move-object v3, v1

    :cond_41
    :goto_1f
    return-object v3

    :pswitch_11
    instance-of v0, p2, Lp43/a;

    if-eqz v0, :cond_42

    move-object v0, p2

    check-cast v0, Lp43/a;

    iget v7, v0, Lp43/a;->x:I

    and-int v8, v7, v5

    if-eqz v8, :cond_42

    sub-int/2addr v7, v5

    iput v7, v0, Lp43/a;->x:I

    goto :goto_20

    :cond_42
    new-instance v0, Lp43/a;

    invoke-direct {v0, p0, p2}, Lp43/a;-><init>(Lw;Lq83/d;)V

    :goto_20
    iget-object p2, v0, Lp43/a;->w:Ljava/lang/Object;

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v7, v0, Lp43/a;->x:I

    if-eqz v7, :cond_44

    if-ne v7, v6, :cond_43

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_21

    :cond_43
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_44
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Lio/getstream/video/android/core/notifications/internal/storage/DevicePreferences;

    if-eqz p1, :cond_45

    invoke-virtual {p1}, Lio/getstream/video/android/core/notifications/internal/storage/DevicePreferences;->getUserDevice()Lio/getstream/video/android/model/Device;

    move-result-object v1

    :cond_45
    iput v6, v0, Lp43/a;->x:I

    invoke-interface {v2, v1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v5, :cond_46

    move-object v3, v5

    :cond_46
    :goto_21
    return-object v3

    :pswitch_12
    instance-of v0, p2, Lo20/d;

    if-eqz v0, :cond_47

    move-object v0, p2

    check-cast v0, Lo20/d;

    iget v1, v0, Lo20/d;->x:I

    and-int v7, v1, v5

    if-eqz v7, :cond_47

    sub-int/2addr v1, v5

    iput v1, v0, Lo20/d;->x:I

    goto :goto_22

    :cond_47
    new-instance v0, Lo20/d;

    invoke-direct {v0, p0, p2}, Lo20/d;-><init>(Lw;Lq83/d;)V

    :goto_22
    iget-object p2, v0, Lo20/d;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v5, v0, Lo20/d;->x:I

    if-eqz v5, :cond_49

    if-ne v5, v6, :cond_48

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_23

    :cond_48
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_49
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    iput v6, v0, Lo20/d;->x:I

    invoke-interface {v2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4a

    move-object v3, v1

    :cond_4a
    :goto_23
    return-object v3

    :pswitch_13
    instance-of v0, p2, Lo20/c;

    if-eqz v0, :cond_4b

    move-object v0, p2

    check-cast v0, Lo20/c;

    iget v1, v0, Lo20/c;->x:I

    and-int v7, v1, v5

    if-eqz v7, :cond_4b

    sub-int/2addr v1, v5

    iput v1, v0, Lo20/c;->x:I

    goto :goto_24

    :cond_4b
    new-instance v0, Lo20/c;

    invoke-direct {v0, p0, p2}, Lo20/c;-><init>(Lw;Lq83/d;)V

    :goto_24
    iget-object p2, v0, Lo20/c;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v5, v0, Lo20/c;->x:I

    if-eqz v5, :cond_4d

    if-ne v5, v6, :cond_4c

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_29

    :cond_4c
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4d
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4e
    :goto_25
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4f

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ll83/k;

    iget-object v5, v5, Ll83/k;->w:Ljava/lang/Object;

    sget-object v7, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getSaveForFutureUse$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4e

    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_25

    :cond_4f
    new-instance p1, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {p2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {p1, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_26
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_50

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll83/k;

    iget-object v5, v5, Ll83/k;->x:Ljava/lang/Object;

    check-cast v5, Ll40/a;

    iget-object v5, v5, Ll40/a;->a:Ljava/lang/String;

    invoke-static {v5}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_26

    :cond_50
    new-instance p2, Ljava/util/ArrayList;

    invoke-static {p1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {p2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_27
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_52

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_51

    sget-object v4, Lq20/h;->x:Lq20/h;

    goto :goto_28

    :cond_51
    sget-object v4, Lq20/h;->y:Lq20/h;

    :goto_28
    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_27

    :cond_52
    invoke-static {p2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq20/h;

    if-nez p1, :cond_53

    sget-object p1, Lq20/h;->z:Lq20/h;

    :cond_53
    iput v6, v0, Lo20/c;->x:I

    invoke-interface {v2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_54

    move-object v3, v1

    :cond_54
    :goto_29
    return-object v3

    :pswitch_14
    instance-of v0, p2, Ln00/i;

    if-eqz v0, :cond_55

    move-object v0, p2

    check-cast v0, Ln00/i;

    iget v1, v0, Ln00/i;->x:I

    and-int v7, v1, v5

    if-eqz v7, :cond_55

    sub-int/2addr v1, v5

    iput v1, v0, Ln00/i;->x:I

    goto :goto_2a

    :cond_55
    new-instance v0, Ln00/i;

    invoke-direct {v0, p0, p2}, Ln00/i;-><init>(Lw;Lq83/d;)V

    :goto_2a
    iget-object p2, v0, Ln00/i;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v5, v0, Ln00/i;->x:I

    if-eqz v5, :cond_57

    if-ne v5, v6, :cond_56

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2b

    :cond_56
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_57
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Lg40/s3;

    invoke-interface {p1}, Lg40/s3;->isValid()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput v6, v0, Ln00/i;->x:I

    invoke-interface {v2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_58

    move-object v3, v1

    :cond_58
    :goto_2b
    return-object v3

    :pswitch_15
    instance-of v0, p2, Lg40/n1;

    if-eqz v0, :cond_59

    move-object v0, p2

    check-cast v0, Lg40/n1;

    iget v7, v0, Lg40/n1;->x:I

    and-int v8, v7, v5

    if-eqz v8, :cond_59

    sub-int/2addr v7, v5

    iput v7, v0, Lg40/n1;->x:I

    goto :goto_2c

    :cond_59
    new-instance v0, Lg40/n1;

    invoke-direct {v0, p0, p2}, Lg40/n1;-><init>(Lw;Lq83/d;)V

    :goto_2c
    iget-object p2, v0, Lg40/n1;->w:Ljava/lang/Object;

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v7, v0, Lg40/n1;->x:I

    if-eqz v7, :cond_5b

    if-ne v7, v6, :cond_5a

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2e

    :cond_5a
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5b
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll83/k;

    if-eqz p1, :cond_5d

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ll40/a;

    if-eqz p1, :cond_5d

    iget-boolean p2, p1, Ll40/a;->b:Z

    if-eqz p2, :cond_5c

    goto :goto_2d

    :cond_5c
    move-object p1, v1

    :goto_2d
    if-eqz p1, :cond_5d

    iget-object v1, p1, Ll40/a;->a:Ljava/lang/String;

    :cond_5d
    if-eqz v1, :cond_5e

    iput v6, v0, Lg40/n1;->x:I

    invoke-interface {v2, v1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v5, :cond_5e

    move-object v3, v5

    :cond_5e
    :goto_2e
    return-object v3

    :pswitch_16
    instance-of v0, p2, Lg1/m7;

    if-eqz v0, :cond_5f

    move-object v0, p2

    check-cast v0, Lg1/m7;

    iget v1, v0, Lg1/m7;->x:I

    and-int v7, v1, v5

    if-eqz v7, :cond_5f

    sub-int/2addr v1, v5

    iput v1, v0, Lg1/m7;->x:I

    goto :goto_2f

    :cond_5f
    new-instance v0, Lg1/m7;

    invoke-direct {v0, p0, p2}, Lg1/m7;-><init>(Lw;Lq83/d;)V

    :goto_2f
    iget-object p2, v0, Lg1/m7;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v5, v0, Lg1/m7;->x:I

    if-eqz v5, :cond_61

    if-ne v5, v6, :cond_60

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_30

    :cond_60
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_61
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, p1

    check-cast p2, Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_62

    iput v6, v0, Lg1/m7;->x:I

    invoke-interface {v2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_62

    move-object v3, v1

    :cond_62
    :goto_30
    return-object v3

    :pswitch_17
    check-cast p1, Lec3/l;

    invoke-virtual {p0, p1, p2}, Lw;->b(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_18
    instance-of v0, p2, Lec3/e;

    if-eqz v0, :cond_63

    move-object v0, p2

    check-cast v0, Lec3/e;

    iget v1, v0, Lec3/e;->y:I

    and-int v7, v1, v5

    if-eqz v7, :cond_63

    sub-int/2addr v1, v5

    iput v1, v0, Lec3/e;->y:I

    goto :goto_31

    :cond_63
    new-instance v0, Lec3/e;

    invoke-direct {v0, p0, p2}, Lec3/e;-><init>(Lw;Lq83/d;)V

    :goto_31
    iget-object p2, v0, Lec3/e;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v5, v0, Lec3/e;->y:I

    if-eqz v5, :cond_65

    if-ne v5, v6, :cond_64

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_32

    :cond_64
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_65
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p2

    invoke-static {p2}, Lbc3/f0;->o(Lq83/j;)V

    iput v6, v0, Lec3/e;->y:I

    invoke-interface {v2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_66

    move-object v3, v1

    :cond_66
    :goto_32
    return-object v3

    :pswitch_19
    instance-of v0, p2, Ld30/t;

    if-eqz v0, :cond_67

    move-object v0, p2

    check-cast v0, Ld30/t;

    iget v1, v0, Ld30/t;->x:I

    and-int v7, v1, v5

    if-eqz v7, :cond_67

    sub-int/2addr v1, v5

    iput v1, v0, Ld30/t;->x:I

    goto :goto_33

    :cond_67
    new-instance v0, Ld30/t;

    invoke-direct {v0, p0, p2}, Ld30/t;-><init>(Lw;Lq83/d;)V

    :goto_33
    iget-object p2, v0, Ld30/t;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v5, v0, Ld30/t;->x:I

    if-eqz v5, :cond_69

    if-ne v5, v6, :cond_68

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_34

    :cond_68
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_69
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, p1

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_6a

    iput v6, v0, Ld30/t;->x:I

    invoke-interface {v2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6a

    move-object v3, v1

    :cond_6a
    :goto_34
    return-object v3

    :pswitch_1a
    instance-of v0, p2, Lch/n;

    if-eqz v0, :cond_6b

    move-object v0, p2

    check-cast v0, Lch/n;

    iget v7, v0, Lch/n;->x:I

    and-int v8, v7, v5

    if-eqz v8, :cond_6b

    sub-int/2addr v7, v5

    iput v7, v0, Lch/n;->x:I

    goto :goto_35

    :cond_6b
    new-instance v0, Lch/n;

    invoke-direct {v0, p0, p2}, Lch/n;-><init>(Lw;Lq83/d;)V

    :goto_35
    iget-object p2, v0, Lch/n;->w:Ljava/lang/Object;

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v7, v0, Lch/n;->x:I

    if-eqz v7, :cond_6d

    if-ne v7, v6, :cond_6c

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_39

    :cond_6c
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6d
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ly3/a;

    iget-wide p1, p1, Ly3/a;->a:J

    sget-object v4, Lch/v;->b:Lnh/e;

    const-wide/16 v7, 0x3

    and-long/2addr v7, p1

    long-to-int v4, v7

    and-int/lit8 v7, v4, 0x1

    shl-int/2addr v7, v6

    and-int/lit8 v4, v4, 0x2

    shr-int/2addr v4, v6

    mul-int/lit8 v4, v4, 0x3

    add-int/2addr v4, v7

    const/16 v7, 0x21

    shr-long v7, p1, v7

    long-to-int v7, v7

    add-int/lit8 v8, v4, 0xd

    shl-int v8, v6, v8

    sub-int/2addr v8, v6

    and-int/2addr v7, v8

    sub-int/2addr v7, v6

    add-int/lit8 v8, v4, 0x2e

    shr-long v8, p1, v8

    long-to-int v8, v8

    rsub-int/lit8 v4, v4, 0x12

    shl-int v4, v6, v4

    sub-int/2addr v4, v6

    and-int/2addr v4, v8

    sub-int/2addr v4, v6

    const/4 v8, 0x0

    if-nez v7, :cond_6e

    move v7, v6

    goto :goto_36

    :cond_6e
    move v7, v8

    :goto_36
    if-nez v4, :cond_6f

    move v8, v6

    :cond_6f
    or-int v4, v7, v8

    if-eqz v4, :cond_70

    goto :goto_38

    :cond_70
    invoke-static {p1, p2}, Ly3/a;->e(J)Z

    move-result v1

    sget-object v4, Lnh/b;->a:Lnh/b;

    if-eqz v1, :cond_71

    invoke-static {p1, p2}, Ly3/a;->i(J)I

    move-result v1

    new-instance v7, Lnh/a;

    invoke-direct {v7, v1}, Lnh/a;-><init>(I)V

    goto :goto_37

    :cond_71
    move-object v7, v4

    :goto_37
    invoke-static {p1, p2}, Ly3/a;->d(J)Z

    move-result v1

    if-eqz v1, :cond_72

    invoke-static {p1, p2}, Ly3/a;->h(J)I

    move-result p1

    new-instance v4, Lnh/a;

    invoke-direct {v4, p1}, Lnh/a;-><init>(I)V

    :cond_72
    new-instance v1, Lnh/h;

    invoke-direct {v1, v7, v4}, Lnh/h;-><init>(Ldt/b;Ldt/b;)V

    :goto_38
    if-eqz v1, :cond_73

    iput v6, v0, Lch/n;->x:I

    invoke-interface {v2, v1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v5, :cond_73

    move-object v3, v5

    :cond_73
    :goto_39
    return-object v3

    :pswitch_1b
    instance-of v0, p2, Lbm/f;

    if-eqz v0, :cond_74

    move-object v0, p2

    check-cast v0, Lbm/f;

    iget v1, v0, Lbm/f;->x:I

    and-int v7, v1, v5

    if-eqz v7, :cond_74

    sub-int/2addr v1, v5

    iput v1, v0, Lbm/f;->x:I

    goto :goto_3a

    :cond_74
    new-instance v0, Lbm/f;

    invoke-direct {v0, p0, p2}, Lbm/f;-><init>(Lw;Lq83/d;)V

    :goto_3a
    iget-object p2, v0, Lbm/f;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v5, v0, Lbm/f;->x:I

    if-eqz v5, :cond_76

    if-ne v5, v6, :cond_75

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3b

    :cond_75
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_76
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, p1

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_77

    iput v6, v0, Lbm/f;->x:I

    invoke-interface {v2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_77

    move-object v3, v1

    :cond_77
    :goto_3b
    return-object v3

    :pswitch_1c
    instance-of v0, p2, Lb30/p0;

    if-eqz v0, :cond_78

    move-object v0, p2

    check-cast v0, Lb30/p0;

    iget v1, v0, Lb30/p0;->x:I

    and-int v7, v1, v5

    if-eqz v7, :cond_78

    sub-int/2addr v1, v5

    iput v1, v0, Lb30/p0;->x:I

    goto :goto_3c

    :cond_78
    new-instance v0, Lb30/p0;

    invoke-direct {v0, p0, p2}, Lb30/p0;-><init>(Lw;Lq83/d;)V

    :goto_3c
    iget-object p2, v0, Lb30/p0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v5, v0, Lb30/p0;->x:I

    if-eqz v5, :cond_7a

    if-ne v5, v6, :cond_79

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3d

    :cond_79
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7a
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, p1

    check-cast p2, Lq20/y;

    instance-of v4, p2, Lq20/w;

    if-nez v4, :cond_7b

    instance-of v4, p2, Lq20/m;

    if-nez v4, :cond_7b

    sget-object v4, Lq20/j;->x:Lq20/j;

    invoke-static {p2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_7c

    :cond_7b
    iput v6, v0, Lb30/p0;->x:I

    invoke-interface {v2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7c

    move-object v3, v1

    :cond_7c
    :goto_3d
    return-object v3

    :pswitch_1d
    instance-of v0, p2, Lv;

    if-eqz v0, :cond_7d

    move-object v0, p2

    check-cast v0, Lv;

    iget v1, v0, Lv;->x:I

    and-int v7, v1, v5

    if-eqz v7, :cond_7d

    sub-int/2addr v1, v5

    iput v1, v0, Lv;->x:I

    goto :goto_3e

    :cond_7d
    new-instance v0, Lv;

    invoke-direct {v0, p0, p2}, Lv;-><init>(Lw;Lq83/d;)V

    :goto_3e
    iget-object p2, v0, Lv;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v5, v0, Lv;->x:I

    if-eqz v5, :cond_7f

    if-ne v5, v6, :cond_7e

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3f

    :cond_7e
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7f
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, p1

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_80

    iput v6, v0, Lv;->x:I

    invoke-interface {v2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_80

    move-object v3, v1

    :cond_80
    :goto_3f
    return-object v3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_6
        :pswitch_4
        :pswitch_6
    .end packed-switch
.end method
