.class public final synthetic Lp90/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p2, p0, Lp90/h;->w:I

    iput-object p1, p0, Lp90/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lp90/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lp90/h;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, La81/t;

    invoke-static {v0, p1}, Lsc0/h;->f(Lkotlin/jvm/functions/Function1;La81/t;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lp90/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lsc0/g;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lp90/h;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v0}, Ls41/c;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lp90/h;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v0}, Ls41/c;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lp90/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Ls32/f;->h(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lp90/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Ls32/c;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lp90/h;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lny2/a;

    invoke-static {v0, p1}, Lry2/e;->a(Lkotlin/jvm/functions/Function1;Lny2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lp90/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lre1/j;->i(ILkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lp90/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lr90/f;->j(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lp90/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, Lr90/c;->a(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lp90/h;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lg2/v;

    invoke-static {v0, p1}, Lr41/h;->g(Lkotlin/jvm/functions/Function1;Lg2/v;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lp90/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lqv1/a;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lp90/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lqj2/b;->c(ILkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lp90/h;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Llj2/a$h;

    invoke-static {v0, p1}, Lqj2/a;->i(Lkotlin/jvm/functions/Function1;Llj2/a$h;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lp90/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lq71/d;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lp90/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lq71/a;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lp90/h;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v0}, Lq01/a;->c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lp90/h;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v0}, Lq01/a;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lp90/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, Lpz0/d;->c(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lp90/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lpp1/i;->t(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lp90/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lpj2/q;->B(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lp90/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lpj2/q;->s(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lp90/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lpj2/i;->M(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lp90/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lpj2/i;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lp90/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lpj2/i;->N(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lp90/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lpj2/i;->G(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lp90/h;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Llj2/a$h;

    invoke-static {v0, p1}, Lpj2/i;->K(Lkotlin/jvm/functions/Function1;Llj2/a$h;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lp90/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lpj2/i;->v(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lp90/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lpj2/c;->c(ILkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lp90/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lp90/i;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
