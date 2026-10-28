.class public final Lob/b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Z

.field public final synthetic G:Landroidx/room/z0;

.field public final synthetic H:Lkotlin/jvm/functions/Function1;

.field public final synthetic w:I

.field public x:Landroidx/room/w1;

.field public y:I

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ZZLandroidx/room/z0;Lq83/d;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p6, p0, Lob/b;->w:I

    iput-boolean p1, p0, Lob/b;->E:Z

    iput-boolean p2, p0, Lob/b;->F:Z

    iput-object p3, p0, Lob/b;->G:Landroidx/room/z0;

    iput-object p5, p0, Lob/b;->H:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 9

    iget v0, p0, Lob/b;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, Lob/b;

    iget-object v6, p0, Lob/b;->H:Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x1

    iget-boolean v2, p0, Lob/b;->E:Z

    iget-boolean v3, p0, Lob/b;->F:Z

    iget-object v4, p0, Lob/b;->G:Landroidx/room/z0;

    move-object v5, p2

    invoke-direct/range {v1 .. v7}, Lob/b;-><init>(ZZLandroidx/room/z0;Lq83/d;Lkotlin/jvm/functions/Function1;I)V

    iput-object p1, v1, Lob/b;->z:Ljava/lang/Object;

    return-object v1

    :pswitch_0
    move-object v5, p2

    new-instance v2, Lob/b;

    iget-object v7, p0, Lob/b;->H:Lkotlin/jvm/functions/Function1;

    const/4 v8, 0x0

    iget-boolean v3, p0, Lob/b;->E:Z

    iget-boolean v4, p0, Lob/b;->F:Z

    move-object v6, v5

    iget-object v5, p0, Lob/b;->G:Landroidx/room/z0;

    invoke-direct/range {v2 .. v8}, Lob/b;-><init>(ZZLandroidx/room/z0;Lq83/d;Lkotlin/jvm/functions/Function1;I)V

    iput-object p1, v2, Lob/b;->z:Ljava/lang/Object;

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lob/b;->w:I

    check-cast p1, Landroidx/room/x1;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lob/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lob/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lob/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lob/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lob/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lob/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lob/b;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lob/b;->y:I

    iget-object v2, p0, Lob/b;->H:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lob/b;->G:Landroidx/room/z0;

    iget-boolean v4, p0, Lob/b;->F:Z

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v1, :cond_4

    if-eq v1, v8, :cond_3

    if-eq v1, v7, :cond_2

    if-eq v1, v6, :cond_1

    if-ne v1, v5, :cond_0

    iget-object v0, p0, Lob/b;->z:Ljava/lang/Object;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lob/b;->z:Ljava/lang/Object;

    check-cast v1, Landroidx/room/x1;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_2
    iget-object v1, p0, Lob/b;->x:Landroidx/room/w1;

    iget-object v7, p0, Lob/b;->z:Ljava/lang/Object;

    check-cast v7, Landroidx/room/x1;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object v1, p0, Lob/b;->x:Landroidx/room/w1;

    iget-object v8, p0, Lob/b;->z:Ljava/lang/Object;

    check-cast v8, Landroidx/room/x1;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lob/b;->z:Ljava/lang/Object;

    check-cast p1, Landroidx/room/x1;

    iget-boolean v1, p0, Lob/b;->E:Z

    if-eqz v1, :cond_d

    if-eqz v4, :cond_5

    sget-object v1, Landroidx/room/w1;->w:Landroidx/room/w1;

    goto :goto_0

    :cond_5
    sget-object v1, Landroidx/room/w1;->x:Landroidx/room/w1;

    :goto_0
    if-nez v4, :cond_9

    iput-object p1, p0, Lob/b;->z:Ljava/lang/Object;

    iput-object v1, p0, Lob/b;->x:Landroidx/room/w1;

    iput v8, p0, Lob/b;->y:I

    invoke-interface {p1, p0}, Landroidx/room/x1;->a(Lq83/d;)Ljava/lang/Boolean;

    move-result-object v8

    if-ne v8, v0, :cond_6

    goto/16 :goto_6

    :cond_6
    move-object v10, v8

    move-object v8, p1

    move-object p1, v10

    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_8

    invoke-virtual {v3}, Landroidx/room/z0;->getInvalidationTracker()Landroidx/room/v;

    move-result-object p1

    iput-object v8, p0, Lob/b;->z:Ljava/lang/Object;

    iput-object v1, p0, Lob/b;->x:Landroidx/room/w1;

    iput v7, p0, Lob/b;->y:I

    invoke-virtual {p1, p0}, Landroidx/room/v;->d(Ls83/i;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_6

    :cond_7
    move-object v7, v8

    :goto_2
    move-object p1, v1

    move-object v1, v7

    goto :goto_3

    :cond_8
    move-object p1, v1

    move-object v1, v8

    goto :goto_3

    :cond_9
    move-object v10, v1

    move-object v1, p1

    move-object p1, v10

    :goto_3
    new-instance v7, Lob/a;

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-direct {v7, v8, v2, v9}, Lob/a;-><init>(ILkotlin/jvm/functions/Function1;Lq83/d;)V

    iput-object v1, p0, Lob/b;->z:Ljava/lang/Object;

    iput-object v9, p0, Lob/b;->x:Landroidx/room/w1;

    iput v6, p0, Lob/b;->y:I

    invoke-interface {v1, p1, v7, p0}, Landroidx/room/x1;->b(Landroidx/room/w1;Lc93/m;Ls83/i;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    goto :goto_6

    :cond_a
    :goto_4
    if-nez v4, :cond_c

    iput-object p1, p0, Lob/b;->z:Ljava/lang/Object;

    iput v5, p0, Lob/b;->y:I

    invoke-interface {v1, p0}, Landroidx/room/x1;->a(Lq83/d;)Ljava/lang/Boolean;

    move-result-object v1

    if-ne v1, v0, :cond_b

    goto :goto_6

    :cond_b
    move-object v0, p1

    move-object p1, v1

    :goto_5
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_e

    invoke-virtual {v3}, Landroidx/room/z0;->getInvalidationTracker()Landroidx/room/v;

    move-result-object p1

    iget-object v1, p1, Landroidx/room/v;->c:Landroidx/room/i2;

    iget-object v2, p1, Landroidx/room/v;->f:Landroidx/room/r;

    iget-object p1, p1, Landroidx/room/v;->g:Landroidx/room/r;

    invoke-virtual {v1, v2, p1}, Landroidx/room/i2;->e(Lc93/a;Lc93/a;)V

    goto :goto_6

    :cond_c
    move-object v0, p1

    goto :goto_6

    :cond_d
    const-string v0, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Llb/b0;

    invoke-interface {p1}, Llb/b0;->d()Ltb/a;

    move-result-object p1

    invoke-interface {v2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :cond_e
    :goto_6
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lob/b;->y:I

    iget-object v2, p0, Lob/b;->H:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lob/b;->G:Landroidx/room/z0;

    iget-boolean v4, p0, Lob/b;->F:Z

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v1, :cond_13

    if-eq v1, v8, :cond_12

    if-eq v1, v7, :cond_11

    if-eq v1, v6, :cond_10

    if-ne v1, v5, :cond_f

    iget-object v0, p0, Lob/b;->z:Ljava/lang/Object;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_c

    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_10
    iget-object v1, p0, Lob/b;->z:Ljava/lang/Object;

    check-cast v1, Landroidx/room/x1;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_b

    :cond_11
    iget-object v1, p0, Lob/b;->x:Landroidx/room/w1;

    iget-object v7, p0, Lob/b;->z:Ljava/lang/Object;

    check-cast v7, Landroidx/room/x1;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_9

    :cond_12
    iget-object v1, p0, Lob/b;->x:Landroidx/room/w1;

    iget-object v8, p0, Lob/b;->z:Ljava/lang/Object;

    check-cast v8, Landroidx/room/x1;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_8

    :cond_13
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lob/b;->z:Ljava/lang/Object;

    check-cast p1, Landroidx/room/x1;

    iget-boolean v1, p0, Lob/b;->E:Z

    if-eqz v1, :cond_1c

    if-eqz v4, :cond_14

    sget-object v1, Landroidx/room/w1;->w:Landroidx/room/w1;

    goto :goto_7

    :cond_14
    sget-object v1, Landroidx/room/w1;->x:Landroidx/room/w1;

    :goto_7
    if-nez v4, :cond_18

    iput-object p1, p0, Lob/b;->z:Ljava/lang/Object;

    iput-object v1, p0, Lob/b;->x:Landroidx/room/w1;

    iput v8, p0, Lob/b;->y:I

    invoke-interface {p1, p0}, Landroidx/room/x1;->a(Lq83/d;)Ljava/lang/Boolean;

    move-result-object v8

    if-ne v8, v0, :cond_15

    goto/16 :goto_d

    :cond_15
    move-object v10, v8

    move-object v8, p1

    move-object p1, v10

    :goto_8
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_17

    invoke-virtual {v3}, Landroidx/room/z0;->getInvalidationTracker()Landroidx/room/v;

    move-result-object p1

    iput-object v8, p0, Lob/b;->z:Ljava/lang/Object;

    iput-object v1, p0, Lob/b;->x:Landroidx/room/w1;

    iput v7, p0, Lob/b;->y:I

    invoke-virtual {p1, p0}, Landroidx/room/v;->d(Ls83/i;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_16

    goto :goto_d

    :cond_16
    move-object v7, v8

    :goto_9
    move-object p1, v1

    move-object v1, v7

    goto :goto_a

    :cond_17
    move-object p1, v1

    move-object v1, v8

    goto :goto_a

    :cond_18
    move-object v10, v1

    move-object v1, p1

    move-object p1, v10

    :goto_a
    new-instance v7, Lob/a;

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct {v7, v8, v2, v9}, Lob/a;-><init>(ILkotlin/jvm/functions/Function1;Lq83/d;)V

    iput-object v1, p0, Lob/b;->z:Ljava/lang/Object;

    iput-object v9, p0, Lob/b;->x:Landroidx/room/w1;

    iput v6, p0, Lob/b;->y:I

    invoke-interface {v1, p1, v7, p0}, Landroidx/room/x1;->b(Landroidx/room/w1;Lc93/m;Ls83/i;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_19

    goto :goto_d

    :cond_19
    :goto_b
    if-nez v4, :cond_1b

    iput-object p1, p0, Lob/b;->z:Ljava/lang/Object;

    iput v5, p0, Lob/b;->y:I

    invoke-interface {v1, p0}, Landroidx/room/x1;->a(Lq83/d;)Ljava/lang/Boolean;

    move-result-object v1

    if-ne v1, v0, :cond_1a

    goto :goto_d

    :cond_1a
    move-object v0, p1

    move-object p1, v1

    :goto_c
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_1d

    invoke-virtual {v3}, Landroidx/room/z0;->getInvalidationTracker()Landroidx/room/v;

    move-result-object p1

    iget-object v1, p1, Landroidx/room/v;->c:Landroidx/room/i2;

    iget-object v2, p1, Landroidx/room/v;->f:Landroidx/room/r;

    iget-object p1, p1, Landroidx/room/v;->g:Landroidx/room/r;

    invoke-virtual {v1, v2, p1}, Landroidx/room/i2;->e(Lc93/a;Lc93/a;)V

    goto :goto_d

    :cond_1b
    move-object v0, p1

    goto :goto_d

    :cond_1c
    const-string v0, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Llb/b0;

    invoke-interface {p1}, Llb/b0;->d()Ltb/a;

    move-result-object p1

    invoke-interface {v2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :cond_1d
    :goto_d
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
