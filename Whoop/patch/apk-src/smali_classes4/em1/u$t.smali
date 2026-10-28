.class final Lem1/u$t;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lem1/u;->p0(Lem1/t;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.home.presentation.HomeViewModel$sendViewEvent$1"
    f = "HomeViewModel.kt"
    l = {
        0x1f0,
        0x1f1,
        0x1f2,
        0x1f3,
        0x1f4,
        0x1f5,
        0x1f6,
        0x1f7,
        0x1f8,
        0x1f9,
        0x1fa,
        0x1fb,
        0x1fc,
        0x1fe,
        0x1ff,
        0x200,
        0x202
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lem1/t;

.field final synthetic y:Lem1/u;


# direct methods
.method public constructor <init>(Lem1/t;Lem1/u;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lem1/t;",
            "Lem1/u;",
            "Lq83/d<",
            "-",
            "Lem1/u$t;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lem1/u$t;->x:Lem1/t;

    iput-object p2, p0, Lem1/u$t;->y:Lem1/u;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lem1/u$t;

    iget-object v0, p0, Lem1/u$t;->x:Lem1/t;

    iget-object v1, p0, Lem1/u$t;->y:Lem1/u;

    invoke-direct {p1, v0, v1, p2}, Lem1/u$t;-><init>(Lem1/t;Lem1/u;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lem1/u$t;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lem1/u$t;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lem1/u$t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lem1/u$t;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lem1/u$t;->w:I

    packed-switch v1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lem1/u$t;->x:Lem1/t;

    instance-of v1, p1, Lem1/n;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lem1/u$t;->y:Lem1/u;

    invoke-static {p1}, Lem1/u;->y(Lem1/u;)Lec3/o1;

    move-result-object p1

    iget-object v1, p0, Lem1/u$t;->x:Lem1/t;

    iput v2, p0, Lem1/u$t;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_12

    goto/16 :goto_0

    :cond_0
    instance-of v1, p1, Lem1/i;

    if-eqz v1, :cond_1

    iget-object p1, p0, Lem1/u$t;->y:Lem1/u;

    invoke-static {p1}, Lem1/u;->l(Lem1/u;)Lec3/o1;

    move-result-object p1

    iget-object v1, p0, Lem1/u$t;->x:Lem1/t;

    const/4 v2, 0x2

    iput v2, p0, Lem1/u$t;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_12

    goto/16 :goto_0

    :cond_1
    instance-of v1, p1, Lem1/k;

    if-eqz v1, :cond_2

    iget-object p1, p0, Lem1/u$t;->y:Lem1/u;

    invoke-static {p1}, Lem1/u;->q(Lem1/u;)Lec3/o1;

    move-result-object p1

    iget-object v1, p0, Lem1/u$t;->x:Lem1/t;

    const/4 v2, 0x3

    iput v2, p0, Lem1/u$t;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_12

    goto/16 :goto_0

    :cond_2
    instance-of v1, p1, Lem1/q;

    if-eqz v1, :cond_3

    iget-object p1, p0, Lem1/u$t;->y:Lem1/u;

    invoke-static {p1}, Lem1/u;->F(Lem1/u;)Lec3/o1;

    move-result-object p1

    iget-object v1, p0, Lem1/u$t;->x:Lem1/t;

    const/4 v2, 0x4

    iput v2, p0, Lem1/u$t;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_12

    goto/16 :goto_0

    :cond_3
    instance-of v1, p1, Lem1/p;

    if-eqz v1, :cond_4

    iget-object p1, p0, Lem1/u$t;->y:Lem1/u;

    invoke-static {p1}, Lem1/u;->E(Lem1/u;)Lec3/o1;

    move-result-object p1

    iget-object v1, p0, Lem1/u$t;->x:Lem1/t;

    const/4 v2, 0x5

    iput v2, p0, Lem1/u$t;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_12

    goto/16 :goto_0

    :cond_4
    instance-of v1, p1, Lem1/j;

    if-eqz v1, :cond_5

    iget-object p1, p0, Lem1/u$t;->y:Lem1/u;

    invoke-static {p1}, Lem1/u;->n(Lem1/u;)Lec3/o1;

    move-result-object p1

    iget-object v1, p0, Lem1/u$t;->x:Lem1/t;

    const/4 v2, 0x6

    iput v2, p0, Lem1/u$t;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_12

    goto/16 :goto_0

    :cond_5
    instance-of v1, p1, Lem1/e;

    if-eqz v1, :cond_6

    iget-object p1, p0, Lem1/u$t;->y:Lem1/u;

    invoke-static {p1}, Lem1/u;->t(Lem1/u;)Lec3/o1;

    move-result-object p1

    iget-object v1, p0, Lem1/u$t;->x:Lem1/t;

    const/4 v2, 0x7

    iput v2, p0, Lem1/u$t;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_12

    goto/16 :goto_0

    :cond_6
    instance-of v1, p1, Lem1/d;

    if-eqz v1, :cond_7

    iget-object p1, p0, Lem1/u$t;->y:Lem1/u;

    invoke-static {p1}, Lem1/u;->r(Lem1/u;)Lec3/o1;

    move-result-object p1

    iget-object v1, p0, Lem1/u$t;->x:Lem1/t;

    const/16 v2, 0x8

    iput v2, p0, Lem1/u$t;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_12

    goto/16 :goto_0

    :cond_7
    instance-of v1, p1, Lem1/h;

    if-eqz v1, :cond_8

    iget-object p1, p0, Lem1/u$t;->y:Lem1/u;

    invoke-static {p1}, Lem1/u;->w(Lem1/u;)Lec3/o1;

    move-result-object p1

    iget-object v1, p0, Lem1/u$t;->x:Lem1/t;

    const/16 v2, 0x9

    iput v2, p0, Lem1/u$t;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_12

    goto/16 :goto_0

    :cond_8
    instance-of v1, p1, Lem1/c;

    if-eqz v1, :cond_9

    iget-object p1, p0, Lem1/u$t;->y:Lem1/u;

    invoke-static {p1}, Lem1/u;->p(Lem1/u;)Lec3/o1;

    move-result-object p1

    iget-object v1, p0, Lem1/u$t;->x:Lem1/t;

    const/16 v2, 0xa

    iput v2, p0, Lem1/u$t;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_12

    goto/16 :goto_0

    :cond_9
    instance-of v1, p1, Lem1/b0;

    if-eqz v1, :cond_a

    iget-object p1, p0, Lem1/u$t;->y:Lem1/u;

    invoke-static {p1}, Lem1/u;->H(Lem1/u;)Lec3/o1;

    move-result-object p1

    iget-object v1, p0, Lem1/u$t;->x:Lem1/t;

    const/16 v2, 0xb

    iput v2, p0, Lem1/u$t;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_12

    goto/16 :goto_0

    :cond_a
    instance-of v1, p1, Lem1/b;

    if-eqz v1, :cond_b

    iget-object p1, p0, Lem1/u$t;->y:Lem1/u;

    invoke-static {p1}, Lem1/u;->o(Lem1/u;)Lec3/o1;

    move-result-object p1

    iget-object v1, p0, Lem1/u$t;->x:Lem1/t;

    const/16 v2, 0xc

    iput v2, p0, Lem1/u$t;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_12

    goto/16 :goto_0

    :cond_b
    instance-of v1, p1, Lem1/g;

    if-eqz v1, :cond_c

    iget-object v1, p0, Lem1/u$t;->y:Lem1/u;

    check-cast p1, Lem1/g;

    const/16 v2, 0xd

    iput v2, p0, Lem1/u$t;->w:I

    invoke-static {v1, p1, p0}, Lem1/u;->L(Lem1/u;Lem1/g;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_12

    goto/16 :goto_0

    :cond_c
    instance-of v1, p1, Lem1/s;

    if-eqz v1, :cond_d

    iget-object v0, p0, Lem1/u$t;->y:Lem1/u;

    check-cast p1, Lem1/s;

    invoke-static {v0, p1}, Lem1/u;->M(Lem1/u;Lem1/s;)V

    goto/16 :goto_1

    :cond_d
    instance-of v1, p1, Lem1/z;

    if-eqz v1, :cond_e

    iget-object p1, p0, Lem1/u$t;->y:Lem1/u;

    invoke-static {p1}, Lem1/u;->G(Lem1/u;)Lec3/o1;

    move-result-object p1

    iget-object v1, p0, Lem1/u$t;->x:Lem1/t;

    const/16 v2, 0xe

    iput v2, p0, Lem1/u$t;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_12

    goto :goto_0

    :cond_e
    instance-of v1, p1, Lem1/a;

    if-eqz v1, :cond_f

    iget-object p1, p0, Lem1/u$t;->y:Lem1/u;

    invoke-static {p1}, Lem1/u;->j(Lem1/u;)Lec3/o1;

    move-result-object p1

    iget-object v1, p0, Lem1/u$t;->x:Lem1/t;

    const/16 v2, 0xf

    iput v2, p0, Lem1/u$t;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_12

    goto :goto_0

    :cond_f
    instance-of v1, p1, Lem1/w;

    if-eqz v1, :cond_10

    iget-object p1, p0, Lem1/u$t;->y:Lem1/u;

    invoke-static {p1}, Lem1/u;->A(Lem1/u;)Lec3/o1;

    move-result-object p1

    iget-object v1, p0, Lem1/u$t;->x:Lem1/t;

    const/16 v2, 0x10

    iput v2, p0, Lem1/u$t;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_12

    goto :goto_0

    :cond_10
    instance-of v1, p1, Lem1/y;

    if-eqz v1, :cond_11

    iget-object p1, p0, Lem1/u$t;->y:Lem1/u;

    invoke-static {p1}, Lem1/u;->B(Lem1/u;)Lec3/p1;

    move-result-object p1

    new-instance v0, Lil1/y;

    iget-object v1, p0, Lem1/u$t;->x:Lem1/t;

    check-cast v1, Lem1/y;

    invoke-virtual {v1}, Lem1/y;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lil1/y;-><init>(ZLjava/lang/String;)V

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_1

    :cond_11
    instance-of p1, p1, Lem1/x;

    if-eqz p1, :cond_12

    iget-object p1, p0, Lem1/u$t;->y:Lem1/u;

    const/16 v1, 0x11

    iput v1, p0, Lem1/u$t;->w:I

    invoke-static {p1, p0}, Lem1/u;->N(Lem1/u;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_12

    :goto_0
    return-object v0

    :cond_12
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
