.class public final Lbe/d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lh0/e1;Lh0/k;Lq83/d;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lbe/d;->w:I

    .line 1
    iput-object p1, p0, Lbe/d;->z:Ljava/lang/Object;

    iput-object p2, p0, Lbe/d;->E:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 2
    iput p3, p0, Lbe/d;->w:I

    iput-object p1, p0, Lbe/d;->E:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Lq83/d;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p3, p0, Lbe/d;->w:I

    iput-object p2, p0, Lbe/d;->E:Ljava/lang/Object;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lq83/d;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lbe/d;->w:I

    .line 4
    check-cast p2, Lkotlin/jvm/internal/m;

    iput-object p2, p0, Lbe/d;->E:Ljava/lang/Object;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lbe/d;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lec3/m;

    check-cast p2, [Ljava/lang/Object;

    check-cast p3, Lq83/d;

    new-instance v0, Lbe/d;

    iget-object v1, p0, Lbe/d;->E:Ljava/lang/Object;

    check-cast v1, Lx30/t;

    const/16 v2, 0xa

    invoke-direct {v0, p3, v1, v2}, Lbe/d;-><init>(Lq83/d;Ljava/lang/Object;I)V

    iput-object p1, v0, Lbe/d;->y:Ljava/lang/Object;

    iput-object p2, v0, Lbe/d;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lbe/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    new-instance v0, Lbe/d;

    iget-object v1, p0, Lbe/d;->E:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/m;

    invoke-direct {v0, p3, v1}, Lbe/d;-><init>(Lq83/d;Lkotlin/jvm/functions/Function1;)V

    iput-object p1, v0, Lbe/d;->y:Ljava/lang/Object;

    iput-object p2, v0, Lbe/d;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lbe/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    new-instance v0, Lbe/d;

    iget-object v1, p0, Lbe/d;->E:Ljava/lang/Object;

    check-cast v1, Lec3/f2;

    const/16 v2, 0x8

    invoke-direct {v0, p3, v1, v2}, Lbe/d;-><init>(Lq83/d;Ljava/lang/Object;I)V

    iput-object p1, v0, Lbe/d;->y:Ljava/lang/Object;

    iput-object p2, v0, Lbe/d;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lbe/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ly00/o4;

    check-cast p2, Lh20/a;

    check-cast p3, Lq83/d;

    new-instance v0, Lbe/d;

    iget-object v1, p0, Lbe/d;->E:Ljava/lang/Object;

    check-cast v1, Lu10/d;

    const/4 v2, 0x7

    invoke-direct {v0, v1, p3, v2}, Lbe/d;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lbe/d;->y:Ljava/lang/Object;

    iput-object p2, v0, Lbe/d;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lbe/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    new-instance v0, Lbe/d;

    iget-object v1, p0, Lbe/d;->E:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x6

    invoke-direct {v0, p3, v1, v2}, Lbe/d;-><init>(Lq83/d;Ljava/lang/Object;I)V

    iput-object p1, v0, Lbe/d;->y:Ljava/lang/Object;

    iput-object p2, v0, Lbe/d;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lbe/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lec3/m;

    check-cast p2, [Ljava/lang/Object;

    check-cast p3, Lq83/d;

    new-instance v0, Lbe/d;

    iget-object v1, p0, Lbe/d;->E:Ljava/lang/Object;

    check-cast v1, Lc93/p;

    const/4 v2, 0x5

    invoke-direct {v0, p3, v1, v2}, Lbe/d;-><init>(Lq83/d;Ljava/lang/Object;I)V

    iput-object p1, v0, Lbe/d;->y:Ljava/lang/Object;

    iput-object p2, v0, Lbe/d;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lbe/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lec3/m;

    check-cast p2, [Ljava/lang/Object;

    check-cast p3, Lq83/d;

    new-instance v0, Lbe/d;

    iget-object v1, p0, Lbe/d;->E:Ljava/lang/Object;

    check-cast v1, Lc93/o;

    const/4 v2, 0x4

    invoke-direct {v0, p3, v1, v2}, Lbe/d;-><init>(Lq83/d;Ljava/lang/Object;I)V

    iput-object p1, v0, Lbe/d;->y:Ljava/lang/Object;

    iput-object p2, v0, Lbe/d;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lbe/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lh0/a;

    check-cast p2, Lh0/h1;

    check-cast p3, Lq83/d;

    new-instance p2, Lbe/d;

    iget-object v0, p0, Lbe/d;->z:Ljava/lang/Object;

    check-cast v0, Lh0/e1;

    iget-object v1, p0, Lbe/d;->E:Ljava/lang/Object;

    check-cast v1, Lh0/k;

    invoke-direct {p2, v0, v1, p3}, Lbe/d;-><init>(Lh0/e1;Lh0/k;Lq83/d;)V

    iput-object p1, p2, Lbe/d;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p2, p1}, Lbe/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lec3/m;

    check-cast p2, [Ljava/lang/Object;

    check-cast p3, Lq83/d;

    new-instance v0, Lbe/d;

    iget-object v1, p0, Lbe/d;->E:Ljava/lang/Object;

    check-cast v1, La33/d;

    const/4 v2, 0x2

    invoke-direct {v0, p3, v1, v2}, Lbe/d;-><init>(Lq83/d;Ljava/lang/Object;I)V

    iput-object p1, v0, Lbe/d;->y:Ljava/lang/Object;

    iput-object p2, v0, Lbe/d;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lbe/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lec3/m;

    check-cast p2, [Ljava/lang/Object;

    check-cast p3, Lq83/d;

    new-instance v0, Lbe/d;

    iget-object v1, p0, Lbe/d;->E:Ljava/lang/Object;

    const/4 v2, 0x1

    invoke-direct {v0, p3, v1, v2}, Lbe/d;-><init>(Lq83/d;Ljava/lang/Object;I)V

    iput-object p1, v0, Lbe/d;->y:Ljava/lang/Object;

    iput-object p2, v0, Lbe/d;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lbe/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Luf/u;

    check-cast p2, Lyf/e;

    check-cast p3, Lq83/d;

    new-instance v0, Lbe/d;

    iget-object v1, p0, Lbe/d;->E:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p3, v2}, Lbe/d;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lbe/d;->y:Ljava/lang/Object;

    iput-object p2, v0, Lbe/d;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lbe/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lbe/d;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lbe/d;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lbe/d;->y:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lbe/d;->z:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    invoke-static {v1}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    iget-object v3, p0, Lbe/d;->E:Ljava/lang/Object;

    check-cast v3, Lx30/t;

    iget-object v3, v3, Lx30/t;->a:Lg40/k0;

    invoke-static {v1, v3}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->D0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg40/h1;

    iput v2, p0, Lbe/d;->x:I

    invoke-interface {p1, v1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lbe/d;->x:I

    const/4 v2, 0x1

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    if-eqz v1, :cond_5

    if-ne v1, v2, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_3
    move-object v0, v3

    goto :goto_4

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lbe/d;->y:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lbe/d;->z:Ljava/lang/Object;

    check-cast v1, Ld33/h1;

    iget-object v4, p0, Lbe/d;->E:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/internal/m;

    invoke-interface {v4, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lec3/l;

    iput v2, p0, Lbe/d;->x:I

    invoke-static {p1}, Lec3/v;->y(Lec3/m;)V

    new-instance v2, La6/t;

    const/4 v4, 0x2

    invoke-direct {v2, p1, v4}, La6/t;-><init>(Lec3/m;I)V

    invoke-interface {v1, v2, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_2

    :cond_6
    move-object p1, v3

    :goto_2
    if-ne p1, v0, :cond_7

    goto :goto_3

    :cond_7
    move-object p1, v3

    :goto_3
    if-ne p1, v0, :cond_3

    :goto_4
    return-object v0

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lbe/d;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_9

    if-ne v1, v2, :cond_8

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lbe/d;->y:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lbe/d;->z:Ljava/lang/Object;

    check-cast v1, Le33/v0;

    iget-object v1, p0, Lbe/d;->E:Ljava/lang/Object;

    check-cast v1, Lec3/f2;

    new-instance v3, Lch/o;

    const/4 v4, 0x7

    invoke-direct {v3, v1, v4}, Lch/o;-><init>(Lec3/l;I)V

    sget-object v1, Lw23/a;->x:Lw23/a;

    sget-object v4, Lec3/v;->b:Lds2/a;

    invoke-static {v3, v1, v4}, Lec3/v;->u(Lec3/l;Lkotlin/jvm/functions/Function1;Lc93/m;)Lec3/j;

    move-result-object v1

    new-instance v3, Lt23/b;

    const/4 v4, 0x3

    const/4 v5, 0x6

    const/4 v6, 0x0

    invoke-direct {v3, v4, v5, v6}, Lt23/b;-><init>(IILq83/d;)V

    invoke-static {v1, v3}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v1

    iput v2, p0, Lbe/d;->x:I

    invoke-static {p1, v1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    goto :goto_6

    :cond_a
    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_6
    return-object v0

    :pswitch_2
    iget-object v0, p0, Lbe/d;->E:Ljava/lang/Object;

    check-cast v0, Lu10/d;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lbe/d;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_c

    if-ne v2, v3, :cond_b

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_7

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lbe/d;->y:Ljava/lang/Object;

    check-cast p1, Ly00/o4;

    iget-object v2, p0, Lbe/d;->z:Ljava/lang/Object;

    check-cast v2, Lh20/a;

    iget-object v4, v0, Lu10/d;->a:Lk83/a;

    invoke-interface {v4}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lh20/z4;

    new-instance v5, Lu10/b;

    const/4 v6, 0x1

    invoke-direct {v5, v0, v6}, Lu10/b;-><init>(Lu10/d;I)V

    const/4 v0, 0x0

    iput-object v0, p0, Lbe/d;->y:Ljava/lang/Object;

    iput v3, p0, Lbe/d;->x:I

    invoke-virtual {v4, p1, v2, v5, p0}, Lh20/z4;->a(Ly00/o4;Lh20/a;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_d

    goto :goto_8

    :cond_d
    :goto_7
    new-instance v1, Ll83/n;

    invoke-direct {v1, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    :goto_8
    return-object v1

    :pswitch_3
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lbe/d;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_f

    if-ne v1, v2, :cond_e

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_9

    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_f
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lbe/d;->y:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lbe/d;->z:Ljava/lang/Object;

    iget-object v3, p0, Lbe/d;->E:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-interface {v3, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lec3/l;

    iput v2, p0, Lbe/d;->x:I

    invoke-static {p1, v1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_10

    goto :goto_a

    :cond_10
    :goto_9
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_a
    return-object v0

    :pswitch_4
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lbe/d;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_12

    if-ne v1, v2, :cond_11

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_b

    :cond_11
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_12
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lbe/d;->y:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lbe/d;->z:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aget-object v5, v1, v3

    aget-object v6, v1, v2

    const/4 v3, 0x2

    aget-object v7, v1, v3

    const/4 v3, 0x3

    aget-object v8, v1, v3

    const/4 v3, 0x4

    aget-object v9, v1, v3

    const/4 v3, 0x5

    aget-object v10, v1, v3

    iget-object v1, p0, Lbe/d;->E:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Lc93/p;

    invoke-interface/range {v4 .. v10}, Lc93/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput v2, p0, Lbe/d;->x:I

    invoke-interface {p1, v1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_13

    goto :goto_c

    :cond_13
    :goto_b
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_c
    return-object v0

    :pswitch_5
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lbe/d;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_15

    if-ne v1, v2, :cond_14

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_d

    :cond_14
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_15
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lbe/d;->y:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lbe/d;->z:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aget-object v5, v1, v3

    aget-object v6, v1, v2

    const/4 v3, 0x2

    aget-object v7, v1, v3

    const/4 v3, 0x3

    aget-object v8, v1, v3

    const/4 v3, 0x4

    aget-object v9, v1, v3

    iget-object v1, p0, Lbe/d;->E:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Lc93/o;

    invoke-interface/range {v4 .. v9}, Lc93/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput v2, p0, Lbe/d;->x:I

    invoke-interface {p1, v1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_16

    goto :goto_e

    :cond_16
    :goto_d
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_e
    return-object v0

    :pswitch_6
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lbe/d;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_18

    if-ne v1, v2, :cond_17

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_f

    :cond_17
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_18
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lbe/d;->y:Ljava/lang/Object;

    check-cast p1, Lh0/a;

    iget-object v1, p0, Lbe/d;->z:Ljava/lang/Object;

    check-cast v1, Lh0/e1;

    iget-object v3, p0, Lbe/d;->E:Ljava/lang/Object;

    check-cast v3, Lh0/k;

    new-instance v4, Lfd3/a;

    const/16 v5, 0x18

    invoke-direct {v4, v5, v3, p1}, Lfd3/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput v2, p0, Lbe/d;->x:I

    invoke-virtual {v1, v4, p0}, Lh0/e1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_19

    goto :goto_10

    :cond_19
    :goto_f
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_10
    return-object v0

    :pswitch_7
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lbe/d;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1b

    if-ne v1, v2, :cond_1a

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_12

    :cond_1a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1b
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lbe/d;->y:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lbe/d;->z:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    invoke-static {v1}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    iget-object v3, p0, Lbe/d;->E:Ljava/lang/Object;

    check-cast v3, La33/d;

    iget-object v3, v3, La33/d;->y:Ljava/lang/Object;

    check-cast v3, Lg40/k0;

    invoke-static {v1, v3}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg40/h1;

    if-eqz v3, :cond_1c

    goto :goto_11

    :cond_1d
    const/4 v3, 0x0

    :goto_11
    iput v2, p0, Lbe/d;->x:I

    invoke-interface {p1, v3, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1e

    goto :goto_13

    :cond_1e
    :goto_12
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_13
    return-object v0

    :pswitch_8
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lbe/d;->x:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_21

    if-eq v1, v3, :cond_20

    if-ne v1, v2, :cond_1f

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, p0

    goto :goto_15

    :cond_1f
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_20
    iget-object v1, p0, Lbe/d;->y:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, p0

    goto :goto_14

    :cond_21
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lbe/d;->y:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lec3/m;

    iget-object p1, p0, Lbe/d;->z:Ljava/lang/Object;

    check-cast p1, [Ljava/lang/Object;

    const/4 v4, 0x0

    aget-object v6, p1, v4

    aget-object v7, p1, v3

    aget-object v8, p1, v2

    const/4 v4, 0x3

    aget-object v9, p1, v4

    iput-object v1, p0, Lbe/d;->y:Ljava/lang/Object;

    iput v3, p0, Lbe/d;->x:I

    iget-object v5, p0, Lbe/d;->E:Ljava/lang/Object;

    move-object v10, p0

    invoke-interface/range {v5 .. v10}, Lc93/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_22

    goto :goto_16

    :cond_22
    :goto_14
    const/4 v3, 0x0

    iput-object v3, v10, Lbe/d;->y:Ljava/lang/Object;

    iput v2, v10, Lbe/d;->x:I

    invoke-interface {v1, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_23

    goto :goto_16

    :cond_23
    :goto_15
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_16
    return-object v0

    :pswitch_9
    move-object v10, p0

    iget-object v0, v10, Lbe/d;->y:Ljava/lang/Object;

    check-cast v0, Luf/u;

    iget-object v1, v10, Lbe/d;->z:Ljava/lang/Object;

    check-cast v1, Lyf/e;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v10, Lbe/d;->x:I

    const/4 v4, 0x1

    if-eqz v3, :cond_25

    if-ne v3, v4, :cond_24

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_17

    :cond_24
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_25
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v0, Luf/u;->b:Ljava/lang/Object;

    check-cast p1, Lvf/b;

    iget-object p1, p1, Lvf/b;->x:Lcg/j;

    iget-object p1, p1, Lcg/j;->z:Lbd3/k;

    iget-object v3, v10, Lbe/d;->E:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v5, "value"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Lbd3/k;->e(Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, v10, Lbe/d;->y:Ljava/lang/Object;

    iput-object p1, v10, Lbe/d;->z:Ljava/lang/Object;

    iput v4, v10, Lbe/d;->x:I

    invoke-interface {v1, v0, p0}, Lyf/e;->a(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_26

    move-object p1, v2

    :cond_26
    :goto_17
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
