.class public final Lyd/a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lvo/b;

.field public final synthetic G:Lwb3/f;

.field public H:Lvg/n;

.field public I:Ls/m2;

.field public J:Ls/m2;

.field public K:Ljava/lang/Object;

.field public L:I

.field public w:I

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lrg/f;

.field public final synthetic z:Lcf/j;


# direct methods
.method public constructor <init>(Lrg/f;Lq83/d;Lcf/j;Lkotlin/jvm/functions/Function1;Lvo/b;Lwb3/f;)V
    .locals 0

    iput-object p1, p0, Lyd/a;->y:Lrg/f;

    iput-object p3, p0, Lyd/a;->z:Lcf/j;

    iput-object p4, p0, Lyd/a;->E:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lyd/a;->F:Lvo/b;

    iput-object p6, p0, Lyd/a;->G:Lwb3/f;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7

    new-instance v0, Lyd/a;

    iget-object v5, p0, Lyd/a;->F:Lvo/b;

    iget-object v6, p0, Lyd/a;->G:Lwb3/f;

    iget-object v1, p0, Lyd/a;->y:Lrg/f;

    iget-object v3, p0, Lyd/a;->z:Lcf/j;

    iget-object v4, p0, Lyd/a;->E:Lkotlin/jvm/functions/Function1;

    move-object v2, p2

    invoke-direct/range {v0 .. v6}, Lyd/a;-><init>(Lrg/f;Lq83/d;Lcf/j;Lkotlin/jvm/functions/Function1;Lvo/b;Lwb3/f;)V

    iput-object p1, v0, Lyd/a;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lyd/a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lyd/a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lyd/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lyd/a;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lyd/a;->w:I

    const/4 v2, 0x1

    iget-object v3, p0, Lyd/a;->z:Lcf/j;

    const/4 v4, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_a

    :pswitch_1
    iget v1, p0, Lyd/a;->L:I

    iget-object v2, p0, Lyd/a;->K:Ljava/lang/Object;

    check-cast v2, Lnf/h;

    iget-object v3, p0, Lyd/a;->J:Ls/m2;

    iget-object v5, p0, Lyd/a;->I:Ls/m2;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_2
    iget-object v0, p0, Lyd/a;->K:Ljava/lang/Object;

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ldf/d;

    throw v4

    :cond_0
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :pswitch_3
    iget-object v0, p0, Lyd/a;->K:Ljava/lang/Object;

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ldf/c;

    throw v4

    :cond_1
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :pswitch_4
    iget-object v0, p0, Lyd/a;->K:Ljava/lang/Object;

    if-nez v0, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ljava/util/Set;

    throw v4

    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :pswitch_5
    iget-object v0, p0, Lyd/a;->K:Ljava/lang/Object;

    if-nez v0, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Long;

    throw v4

    :cond_3
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :pswitch_6
    iget-object v0, p0, Lyd/a;->K:Ljava/lang/Object;

    if-nez v0, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Boolean;

    throw v4

    :cond_4
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :pswitch_7
    iget v1, p0, Lyd/a;->L:I

    iget-object v2, p0, Lyd/a;->K:Ljava/lang/Object;

    check-cast v2, Lyd/c;

    iget-object v5, p0, Lyd/a;->J:Ls/m2;

    iget-object v6, p0, Lyd/a;->I:Ls/m2;

    iget-object v7, p0, Lyd/a;->H:Lvg/n;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_8
    iget v1, p0, Lyd/a;->L:I

    iget-object v2, p0, Lyd/a;->K:Ljava/lang/Object;

    check-cast v2, Lyd/c;

    iget-object v5, p0, Lyd/a;->J:Ls/m2;

    iget-object v6, p0, Lyd/a;->I:Ls/m2;

    iget-object v7, p0, Lyd/a;->H:Lvg/n;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_9
    iget v1, p0, Lyd/a;->L:I

    iget-object v2, p0, Lyd/a;->K:Ljava/lang/Object;

    check-cast v2, Lyd/c;

    iget-object v5, p0, Lyd/a;->J:Ls/m2;

    iget-object v6, p0, Lyd/a;->I:Ls/m2;

    iget-object v7, p0, Lyd/a;->H:Lvg/n;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_a
    iget v1, p0, Lyd/a;->L:I

    iget-object v2, p0, Lyd/a;->K:Ljava/lang/Object;

    check-cast v2, Lyd/c;

    iget-object v5, p0, Lyd/a;->J:Ls/m2;

    iget-object v6, p0, Lyd/a;->I:Ls/m2;

    iget-object v7, p0, Lyd/a;->H:Lvg/n;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_b
    iget v1, p0, Lyd/a;->L:I

    iget-object v5, p0, Lyd/a;->K:Ljava/lang/Object;

    check-cast v5, Lyd/c;

    iget-object v6, p0, Lyd/a;->J:Ls/m2;

    iget-object v7, p0, Lyd/a;->I:Ls/m2;

    iget-object v8, p0, Lyd/a;->H:Lvg/n;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_c
    iget v1, p0, Lyd/a;->L:I

    iget-object v5, p0, Lyd/a;->K:Ljava/lang/Object;

    check-cast v5, Lcf/f;

    iget-object v6, p0, Lyd/a;->J:Ls/m2;

    iget-object v7, p0, Lyd/a;->I:Ls/m2;

    iget-object v8, p0, Lyd/a;->H:Lvg/n;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_d
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lvg/n;->a:Lvg/m;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, Lvg/m;->b:Lvg/r;

    new-instance p1, Lme/h;

    const/4 v1, 0x1

    invoke-direct {p1, v8, v4, v1}, Lme/h;-><init>(Lvg/n;Lq83/d;I)V

    new-instance v7, Ls/m2;

    invoke-direct {v7, p1}, Ls/m2;-><init>(Lkotlin/jvm/functions/Function1;)V

    new-instance p1, La6/e;

    const/16 v1, 0x11

    invoke-direct {p1, v7, v4, v1}, La6/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    new-instance v6, Ls/m2;

    invoke-direct {v6, p1}, Ls/m2;-><init>(Lkotlin/jvm/functions/Function1;)V

    instance-of p1, v3, Lcf/f;

    const/4 v1, 0x0

    if-eqz p1, :cond_6

    move-object v5, v3

    check-cast v5, Lcf/f;

    iput-object v4, p0, Lyd/a;->x:Ljava/lang/Object;

    iput-object v8, p0, Lyd/a;->H:Lvg/n;

    iput-object v7, p0, Lyd/a;->I:Ls/m2;

    iput-object v6, p0, Lyd/a;->J:Ls/m2;

    iput-object v5, p0, Lyd/a;->K:Ljava/lang/Object;

    iput v1, p0, Lyd/a;->L:I

    iput v2, p0, Lyd/a;->w:I

    invoke-static {v8, v6, p0}, Lx30/s0;->C(Lvg/n;Ls/m2;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto/16 :goto_9

    :cond_5
    :goto_0
    check-cast p1, Leg/o;

    invoke-interface {v5, p1}, Lcf/f;->h(Leg/o;)V

    :cond_6
    iget-object p1, p0, Lyd/a;->E:Lkotlin/jvm/functions/Function1;

    if-eqz p1, :cond_7

    invoke-interface {p1, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    invoke-interface {v3}, Lcf/j;->o()Lcf/e;

    move-result-object p1

    if-nez p1, :cond_8

    sget-object p1, Ldf/b;->b:Ljf/a;

    invoke-static {p1, v8}, Ljf/e;->b(Ljf/a;Lvg/l;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcf/e;

    :cond_8
    invoke-interface {v3, p1}, Lcf/j;->d(Lcf/e;)V

    move-object v5, v3

    check-cast v5, Lyd/c;

    invoke-interface {v5}, Lyd/c;->n()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_c

    invoke-interface {v5}, Lyd/c;->a()Lff/a;

    move-result-object p1

    if-eqz p1, :cond_a

    iput-object v4, p0, Lyd/a;->x:Ljava/lang/Object;

    iput-object v8, p0, Lyd/a;->H:Lvg/n;

    iput-object v7, p0, Lyd/a;->I:Ls/m2;

    iput-object v6, p0, Lyd/a;->J:Ls/m2;

    iput-object v5, p0, Lyd/a;->K:Ljava/lang/Object;

    iput v1, p0, Lyd/a;->L:I

    const/4 v9, 0x2

    iput v9, p0, Lyd/a;->w:I

    invoke-interface {p1, p0}, Lff/a;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    goto/16 :goto_9

    :cond_9
    :goto_1
    check-cast p1, Ljava/lang/String;

    goto :goto_2

    :cond_a
    move-object p1, v4

    :goto_2
    if-nez p1, :cond_c

    iput-object v4, p0, Lyd/a;->x:Ljava/lang/Object;

    iput-object v8, p0, Lyd/a;->H:Lvg/n;

    iput-object v7, p0, Lyd/a;->I:Ls/m2;

    iput-object v6, p0, Lyd/a;->J:Ls/m2;

    iput-object v5, p0, Lyd/a;->K:Ljava/lang/Object;

    iput v1, p0, Lyd/a;->L:I

    const/4 p1, 0x3

    iput p1, p0, Lyd/a;->w:I

    invoke-static {v4, v6, p0, v2}, Lvd/f;->J(Lvg/n;Ls/m2;Ls83/i;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_b

    goto/16 :goto_9

    :cond_b
    move-object v2, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    :goto_3
    check-cast p1, Ljava/lang/String;

    move-object v8, v7

    move-object v7, v6

    move-object v6, v5

    move-object v5, v2

    :cond_c
    invoke-interface {v5, p1}, Lyd/c;->j(Ljava/lang/String;)V

    move-object v2, v3

    check-cast v2, Lyd/c;

    invoke-interface {v2}, Lyd/c;->b()Ljava/lang/Boolean;

    move-result-object p1

    if-nez p1, :cond_e

    iput-object v4, p0, Lyd/a;->x:Ljava/lang/Object;

    iput-object v8, p0, Lyd/a;->H:Lvg/n;

    iput-object v7, p0, Lyd/a;->I:Ls/m2;

    iput-object v6, p0, Lyd/a;->J:Ls/m2;

    iput-object v2, p0, Lyd/a;->K:Ljava/lang/Object;

    iput v1, p0, Lyd/a;->L:I

    const/4 p1, 0x4

    iput p1, p0, Lyd/a;->w:I

    sget-object p1, Lvg/n;->a:Lvg/m;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lvg/m;->b:Lvg/r;

    invoke-static {p1, v6, p0}, Lvd/e;->V(Lvg/n;Ls/m2;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_d

    goto/16 :goto_9

    :cond_d
    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    :goto_4
    check-cast p1, Ljava/lang/Boolean;

    goto :goto_5

    :cond_e
    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    :goto_5
    invoke-interface {v2, p1}, Lyd/c;->c(Ljava/lang/Boolean;)V

    move-object v2, v3

    check-cast v2, Lyd/c;

    invoke-interface {v2}, Lyd/c;->e()Ljava/lang/Boolean;

    move-result-object p1

    if-nez p1, :cond_10

    iput-object v4, p0, Lyd/a;->x:Ljava/lang/Object;

    iput-object v7, p0, Lyd/a;->H:Lvg/n;

    iput-object v6, p0, Lyd/a;->I:Ls/m2;

    iput-object v5, p0, Lyd/a;->J:Ls/m2;

    iput-object v2, p0, Lyd/a;->K:Ljava/lang/Object;

    iput v1, p0, Lyd/a;->L:I

    const/4 p1, 0x5

    iput p1, p0, Lyd/a;->w:I

    sget-object p1, Lvg/n;->a:Lvg/m;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lvg/m;->b:Lvg/r;

    invoke-static {p1, v5, p0}, Lvd/e;->U(Lvg/n;Ls/m2;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_f

    goto/16 :goto_9

    :cond_f
    :goto_6
    check-cast p1, Ljava/lang/Boolean;

    :cond_10
    invoke-interface {v2, p1}, Lyd/c;->i(Ljava/lang/Boolean;)V

    move-object v2, v3

    check-cast v2, Lyd/c;

    invoke-interface {v2}, Lyd/c;->k()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_12

    iput-object v4, p0, Lyd/a;->x:Ljava/lang/Object;

    iput-object v7, p0, Lyd/a;->H:Lvg/n;

    iput-object v6, p0, Lyd/a;->I:Ls/m2;

    iput-object v5, p0, Lyd/a;->J:Ls/m2;

    iput-object v2, p0, Lyd/a;->K:Ljava/lang/Object;

    iput v1, p0, Lyd/a;->L:I

    const/4 p1, 0x6

    iput p1, p0, Lyd/a;->w:I

    invoke-static {v7, v5, p0}, Lup/d;->M(Lvg/n;Ls/m2;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_11

    goto :goto_9

    :cond_11
    :goto_7
    check-cast p1, Ljava/lang/String;

    :cond_12
    invoke-interface {v2, p1}, Lyd/c;->f(Ljava/lang/String;)V

    instance-of p1, v3, Lnf/h;

    if-eqz p1, :cond_15

    move-object v2, v3

    check-cast v2, Lnf/h;

    invoke-interface {v2}, Lnf/h;->g()Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_14

    iput-object v4, p0, Lyd/a;->x:Ljava/lang/Object;

    iput-object v4, p0, Lyd/a;->H:Lvg/n;

    iput-object v6, p0, Lyd/a;->I:Ls/m2;

    iput-object v5, p0, Lyd/a;->J:Ls/m2;

    iput-object v2, p0, Lyd/a;->K:Ljava/lang/Object;

    iput v1, p0, Lyd/a;->L:I

    const/16 p1, 0xc

    iput p1, p0, Lyd/a;->w:I

    invoke-static {v7, v5, p0}, Ls2/d;->s(Lvg/n;Ls/m2;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_13

    goto :goto_9

    :cond_13
    move-object v3, v5

    move-object v5, v6

    :goto_8
    check-cast p1, Ljava/util/List;

    move-object v6, v5

    move-object v5, v3

    :cond_14
    invoke-interface {v2, p1}, Lnf/h;->m(Ljava/util/List;)V

    :cond_15
    iget-object p1, p0, Lyd/a;->F:Lvo/b;

    iget-object v2, p0, Lyd/a;->G:Lwb3/f;

    invoke-virtual {p1, v2}, Lvo/b;->n(Lwb3/f;)V

    iput-object v4, p0, Lyd/a;->x:Ljava/lang/Object;

    iput-object v4, p0, Lyd/a;->H:Lvg/n;

    iput-object v4, p0, Lyd/a;->I:Ls/m2;

    iput-object v4, p0, Lyd/a;->J:Ls/m2;

    iput-object v4, p0, Lyd/a;->K:Ljava/lang/Object;

    iput v1, p0, Lyd/a;->L:I

    const/16 v1, 0xd

    iput v1, p0, Lyd/a;->w:I

    invoke-virtual {p1, v2, v6, v5, p0}, Lvo/b;->o(Lwb3/f;Ls/m2;Ls/m2;Lyd/a;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_16

    :goto_9
    return-object v0

    :cond_16
    :goto_a
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
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
