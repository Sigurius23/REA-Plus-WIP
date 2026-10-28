.class public final Lc0/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lc0/a0;->w:I

    iput-object p1, p0, Lc0/a0;->x:Ljava/lang/Object;

    iput-object p2, p0, Lc0/a0;->y:Ljava/lang/Object;

    iput-object p3, p0, Lc0/a0;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/b0;Lec3/m;Lc93/m;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lc0/a0;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc0/a0;->x:Ljava/lang/Object;

    iput-object p2, p0, Lc0/a0;->y:Ljava/lang/Object;

    check-cast p3, Ls83/i;

    iput-object p3, p0, Lc0/a0;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lc0/a0;->w:I

    packed-switch v0, :pswitch_data_0

    instance-of v0, p2, Llb/i;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Llb/i;

    iget v1, v0, Llb/i;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llb/i;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Llb/i;

    invoke-direct {v0, p0, p2}, Llb/i;-><init>(Lc0/a0;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Llb/i;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llb/i;->x:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Llb/i;->y:Lec3/m;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lc0/a0;->x:Ljava/lang/Object;

    check-cast p2, Lec3/m;

    check-cast p1, Ljava/util/Set;

    iget-object p1, p0, Lc0/a0;->y:Ljava/lang/Object;

    check-cast p1, Landroidx/room/z0;

    iget-object v2, p0, Lc0/a0;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iput-object p2, v0, Llb/i;->y:Lec3/m;

    iput v4, v0, Llb/i;->x:I

    const/4 v5, 0x0

    invoke-static {p1, v4, v5, v2, v0}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_3

    :cond_4
    move-object v11, p2

    move-object p2, p1

    move-object p1, v11

    :goto_1
    const/4 v2, 0x0

    iput-object v2, v0, Llb/i;->y:Lec3/m;

    iput v3, v0, Llb/i;->x:I

    invoke-interface {p1, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_3
    return-object v1

    :pswitch_0
    iget-object v0, p0, Lc0/a0;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/g0;

    instance-of v1, p2, Lh0/f;

    if-eqz v1, :cond_6

    move-object v1, p2

    check-cast v1, Lh0/f;

    iget v2, v1, Lh0/f;->E:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_6

    sub-int/2addr v2, v3

    iput v2, v1, Lh0/f;->E:I

    goto :goto_4

    :cond_6
    new-instance v1, Lh0/f;

    invoke-direct {v1, p0, p2}, Lh0/f;-><init>(Lc0/a0;Lq83/d;)V

    :goto_4
    iget-object p2, v1, Lh0/f;->y:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lh0/f;->E:I

    const/4 v4, 0x1

    if-eqz v3, :cond_8

    if-ne v3, v4, :cond_7

    iget-object p1, v1, Lh0/f;->w:Ljava/lang/Object;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p2, Lbc3/k1;

    if-eqz p2, :cond_9

    new-instance v3, Landroidx/compose/foundation/gestures/AnchoredDragFinishedSignal;

    invoke-direct {v3}, Landroidx/compose/foundation/gestures/AnchoredDragFinishedSignal;-><init>()V

    invoke-interface {p2, v3}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    iput-object p1, v1, Lh0/f;->w:Ljava/lang/Object;

    iput-object p2, v1, Lh0/f;->x:Lbc3/k1;

    iput v4, v1, Lh0/f;->E:I

    invoke-interface {p2, v1}, Lbc3/k1;->join(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v2, :cond_9

    goto :goto_6

    :cond_9
    :goto_5
    move-object v7, p1

    iget-object p1, p0, Lc0/a0;->y:Ljava/lang/Object;

    move-object v8, p1

    check-cast v8, Lbc3/c0;

    sget-object p1, Lbc3/d0;->z:Lbc3/d0;

    new-instance v5, La6/v;

    iget-object p2, p0, Lc0/a0;->z:Ljava/lang/Object;

    move-object v6, p2

    check-cast v6, Lc93/m;

    const/16 v10, 0x8

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v10}, La6/v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v8, v9, p1, v5, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    :goto_6
    return-object v2

    :pswitch_1
    instance-of v0, p2, Lec3/m1;

    if-eqz v0, :cond_a

    move-object v0, p2

    check-cast v0, Lec3/m1;

    iget v1, v0, Lec3/m1;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_a

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/m1;->E:I

    goto :goto_7

    :cond_a
    new-instance v0, Lec3/m1;

    invoke-direct {v0, p0, p2}, Lec3/m1;-><init>(Lc0/a0;Lq83/d;)V

    :goto_7
    iget-object p2, v0, Lec3/m1;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/m1;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_d

    if-eq v2, v4, :cond_c

    if-ne v2, v3, :cond_b

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_9

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    iget-object p1, v0, Lec3/m1;->x:Lkotlin/jvm/internal/g0;

    iget-object v2, v0, Lec3/m1;->w:Lc0/a0;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_8

    :cond_d
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lc0/a0;->x:Ljava/lang/Object;

    check-cast p2, Lkotlin/jvm/internal/g0;

    iget-object v2, p0, Lc0/a0;->y:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function3;

    iget-object v5, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iput-object p0, v0, Lec3/m1;->w:Lc0/a0;

    iput-object p2, v0, Lec3/m1;->x:Lkotlin/jvm/internal/g0;

    iput v4, v0, Lec3/m1;->E:I

    invoke-interface {v2, v5, p1, v0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_e

    goto :goto_a

    :cond_e
    move-object v2, p2

    move-object p2, p1

    move-object p1, v2

    move-object v2, p0

    :goto_8
    iput-object p2, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object p1, v2, Lc0/a0;->z:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p2, v2, Lc0/a0;->x:Ljava/lang/Object;

    check-cast p2, Lkotlin/jvm/internal/g0;

    iget-object p2, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    const/4 v2, 0x0

    iput-object v2, v0, Lec3/m1;->w:Lc0/a0;

    iput-object v2, v0, Lec3/m1;->x:Lkotlin/jvm/internal/g0;

    iput v3, v0, Lec3/m1;->E:I

    invoke-interface {p1, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_f

    goto :goto_a

    :cond_f
    :goto_9
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_a
    return-object v1

    :pswitch_2
    iget-object v0, p0, Lc0/a0;->y:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    instance-of v1, p2, Lec3/n0;

    if-eqz v1, :cond_10

    move-object v1, p2

    check-cast v1, Lec3/n0;

    iget v2, v1, Lec3/n0;->y:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_10

    sub-int/2addr v2, v3

    iput v2, v1, Lec3/n0;->y:I

    goto :goto_b

    :cond_10
    new-instance v1, Lec3/n0;

    invoke-direct {v1, p0, p2}, Lec3/n0;-><init>(Lc0/a0;Lq83/d;)V

    :goto_b
    iget-object p2, v1, Lec3/n0;->w:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lec3/n0;->y:I

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v3, :cond_14

    if-eq v3, v6, :cond_11

    if-ne v3, v5, :cond_13

    :cond_11
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_12
    move-object v2, v4

    goto :goto_c

    :cond_13
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_14
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lc0/a0;->x:Ljava/lang/Object;

    check-cast p2, Lkotlin/jvm/internal/e0;

    iget v3, p2, Lkotlin/jvm/internal/e0;->w:I

    add-int/2addr v3, v6

    iput v3, p2, Lkotlin/jvm/internal/e0;->w:I

    if-ge v3, v6, :cond_15

    iput v6, v1, Lec3/n0;->y:I

    invoke-interface {v0, p1, v1}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_12

    goto :goto_c

    :cond_15
    iput v5, v1, Lec3/n0;->y:I

    iget-object p2, p0, Lc0/a0;->z:Ljava/lang/Object;

    invoke-static {v0, p1, p2, v1}, Lec3/v;->d(Lec3/m;Ljava/lang/Object;Ljava/lang/Object;Ls83/c;)V

    :goto_c
    return-object v2

    :pswitch_3
    instance-of v0, p2, Lec3/k0;

    if-eqz v0, :cond_16

    move-object v0, p2

    check-cast v0, Lec3/k0;

    iget v1, v0, Lec3/k0;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_16

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/k0;->E:I

    goto :goto_d

    :cond_16
    new-instance v0, Lec3/k0;

    invoke-direct {v0, p0, p2}, Lec3/k0;-><init>(Lc0/a0;Lq83/d;)V

    :goto_d
    iget-object p2, v0, Lec3/k0;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/k0;->E:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    const/4 v6, 0x1

    if-eqz v2, :cond_1b

    if-eq v2, v6, :cond_17

    if-eq v2, v4, :cond_1a

    if-ne v2, v3, :cond_19

    :cond_17
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_18
    move-object v1, v5

    goto :goto_f

    :cond_19
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1a
    iget-object p1, v0, Lec3/k0;->x:Ljava/lang/Object;

    iget-object v2, v0, Lec3/k0;->w:Lc0/a0;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_e

    :cond_1b
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lc0/a0;->x:Ljava/lang/Object;

    check-cast p2, Lkotlin/jvm/internal/b0;

    iget-boolean p2, p2, Lkotlin/jvm/internal/b0;->w:Z

    if-eqz p2, :cond_1c

    iget-object p2, p0, Lc0/a0;->y:Ljava/lang/Object;

    check-cast p2, Lec3/m;

    iput v6, v0, Lec3/k0;->E:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_18

    goto :goto_f

    :cond_1c
    iget-object p2, p0, Lc0/a0;->z:Ljava/lang/Object;

    check-cast p2, Ls83/i;

    iput-object p0, v0, Lec3/k0;->w:Lc0/a0;

    iput-object p1, v0, Lec3/k0;->x:Ljava/lang/Object;

    iput v4, v0, Lec3/k0;->E:I

    invoke-interface {p2, p1, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_1d

    goto :goto_f

    :cond_1d
    move-object v2, p0

    :goto_e
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_18

    iget-object p2, v2, Lc0/a0;->x:Ljava/lang/Object;

    check-cast p2, Lkotlin/jvm/internal/b0;

    iput-boolean v6, p2, Lkotlin/jvm/internal/b0;->w:Z

    iget-object p2, v2, Lc0/a0;->y:Ljava/lang/Object;

    check-cast p2, Lec3/m;

    const/4 v2, 0x0

    iput-object v2, v0, Lec3/k0;->w:Lc0/a0;

    iput-object v2, v0, Lec3/k0;->x:Ljava/lang/Object;

    iput v3, v0, Lec3/k0;->E:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_18

    :goto_f
    return-object v1

    :pswitch_4
    iget-object v0, p0, Lc0/a0;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/g0;

    iget-object v1, p0, Lc0/a0;->x:Ljava/lang/Object;

    check-cast v1, Lec3/j;

    instance-of v2, p2, Lec3/i;

    if-eqz v2, :cond_1e

    move-object v2, p2

    check-cast v2, Lec3/i;

    iget v3, v2, Lec3/i;->y:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_1e

    sub-int/2addr v3, v4

    iput v3, v2, Lec3/i;->y:I

    goto :goto_10

    :cond_1e
    new-instance v2, Lec3/i;

    invoke-direct {v2, p0, p2}, Lec3/i;-><init>(Lc0/a0;Lq83/d;)V

    :goto_10
    iget-object p2, v2, Lec3/i;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lec3/i;->y:I

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    const/4 v6, 0x1

    if-eqz v4, :cond_21

    if-ne v4, v6, :cond_20

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_1f
    move-object v3, v5

    goto :goto_11

    :cond_20
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_21
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, v1, Lec3/j;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iget-object v4, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object v7, Lfc3/b;->b:Lhc3/x;

    if-eq v4, v7, :cond_22

    iget-object v1, v1, Lec3/j;->y:Lc93/m;

    invoke-interface {v1, v4, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_1f

    :cond_22
    iput-object p2, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object p2, p0, Lc0/a0;->z:Ljava/lang/Object;

    check-cast p2, Lec3/m;

    iput v6, v2, Lec3/i;->y:I

    invoke-interface {p2, p1, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_1f

    :goto_11
    return-object v3

    :pswitch_5
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object p2, p0, Lc0/a0;->y:Ljava/lang/Object;

    check-cast p2, Ld0/z1;

    iget-object v0, p0, Lc0/a0;->x:Ljava/lang/Object;

    check-cast v0, Lp1/r1;

    if-eqz p1, :cond_23

    iget-object p1, p0, Lc0/a0;->z:Ljava/lang/Object;

    check-cast p1, Lp1/c1;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc93/m;

    iget-object v1, p2, Ld0/z1;->a:Lal/a;

    invoke-virtual {v1}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v1

    iget-object p2, p2, Ld0/z1;->d:Lp1/k1;

    invoke-virtual {p2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, v1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_12

    :cond_23
    const/4 p1, 0x0

    :goto_12
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
