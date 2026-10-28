.class public final synthetic Ln20/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/b;
.implements Lkotlin/jvm/internal/f;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ln20/i;


# direct methods
.method public synthetic constructor <init>(Ln20/i;I)V
    .locals 0

    iput p2, p0, Ln20/g;->w:I

    iput-object p1, p0, Ln20/g;->x:Ln20/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 7

    iget v0, p0, Ln20/g;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lb30/a6;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ln20/g;->x:Ln20/i;

    sget-object v1, Lb30/y5;->w:Lb30/y5;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    iget-object p1, v0, Ln20/i;->h:Ln20/u;

    iget-object p1, p1, Ln20/u;->E:Lq20/y;

    if-eqz p1, :cond_0

    iput-boolean v2, p1, Lq20/y;->w:Z

    :cond_0
    invoke-virtual {v0}, Ln20/i;->c()V

    goto :goto_0

    :cond_1
    sget-object v1, Lb30/z5;->w:Lb30/z5;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, v0, Ln20/i;->e:Lh20/c4;

    new-instance v0, Lh20/y3;

    invoke-direct {v0, v2}, Lh20/y3;-><init>(Z)V

    invoke-interface {p1, v0}, Lh20/c4;->a(Lh20/b4;)V

    :goto_0
    return-void

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    check-cast p1, Lh20/n0;

    iget-object v0, p0, Ln20/g;->x:Ln20/i;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lh20/n0;->b()Lwz/d;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v2, v0, Ln20/i;->l:Lxz/f0;

    invoke-virtual {v2, v1}, Lxz/f0;->a(Lwz/d;)V

    :cond_3
    const/4 v1, 0x0

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lh20/n0;->f()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_6

    iget-object v3, v0, Ln20/i;->h:Ln20/u;

    invoke-virtual {v3}, Ln20/u;->g()Ln20/h;

    move-result-object v3

    iget-object v4, v0, Ln20/i;->h:Ln20/u;

    if-eqz v3, :cond_5

    iget-object v5, v3, Ln20/h;->w:La30/f1;

    iget-object v5, v5, La30/f1;->x:La30/a;

    if-eqz v5, :cond_4

    const/4 v6, 0x2

    invoke-static {v5, v2, v1, v6}, La30/a;->b(La30/a;Ljava/util/List;Ljava/lang/String;I)La30/a;

    move-result-object v2

    goto :goto_1

    :cond_4
    move-object v2, v1

    :goto_1
    const/4 v5, 0x5

    invoke-static {v3, v2, v1, v5}, Ln20/h;->f(Ln20/h;La30/a;Lv00/c0;I)Ln20/h;

    move-result-object v2

    goto :goto_2

    :cond_5
    move-object v2, v1

    :goto_2
    iget-object v3, v4, Ln20/u;->x:Landroidx/lifecycle/k1;

    const-string v4, "state"

    invoke-virtual {v3, v2, v4}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_6
    instance-of v2, p1, Lh20/m0;

    if-eqz v2, :cond_8

    iget-object v2, v0, Ln20/i;->h:Ln20/u;

    check-cast p1, Lh20/m0;

    iget-object p1, p1, Lh20/m0;->x:Lq20/y;

    const/4 v3, 0x1

    iput-boolean v3, p1, Lq20/y;->w:Z

    iput-object p1, v2, Ln20/u;->E:Lq20/y;

    iget-object p1, v0, Ln20/i;->h:Ln20/u;

    iget-object p1, p1, Ln20/u;->E:Lq20/y;

    if-eqz p1, :cond_7

    iget-object v1, v0, Ln20/i;->c:Lpg3/p;

    invoke-virtual {v1, p1}, Lpg3/p;->f(Lq20/y;)Lq20/e;

    move-result-object v1

    :cond_7
    iget-object p1, v0, Ln20/i;->d:Lh20/s;

    iget-object p1, p1, Lh20/s;->a:Lp1/c1;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh20/e0;

    invoke-interface {p1, v1}, Lh20/e0;->a(Lq20/e;)V

    goto :goto_5

    :cond_8
    if-eqz p1, :cond_a

    instance-of v2, p1, Lh20/l0;

    if-eqz v2, :cond_9

    goto :goto_3

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_a
    :goto_3
    iget-object v2, v0, Ln20/i;->h:Ln20/u;

    check-cast p1, Lh20/l0;

    if-eqz p1, :cond_b

    iget-object p1, p1, Lh20/l0;->y:Lq20/y;

    goto :goto_4

    :cond_b
    move-object p1, v1

    :goto_4
    iput-object p1, v2, Ln20/u;->E:Lq20/y;

    iget-object p1, v0, Ln20/i;->h:Ln20/u;

    iget-object p1, p1, Ln20/u;->E:Lq20/y;

    if-eqz p1, :cond_c

    iget-object v1, v0, Ln20/i;->c:Lpg3/p;

    invoke-virtual {v1, p1}, Lpg3/p;->f(Lq20/y;)Lq20/e;

    move-result-object v1

    :cond_c
    iget-object p1, v0, Ln20/i;->d:Lh20/s;

    iget-object p1, p1, Lh20/s;->a:Lp1/c1;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh20/e0;

    invoke-interface {p1, v1}, Lh20/e0;->a(Lq20/e;)V

    :goto_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    iget v0, p0, Ln20/g;->w:I

    packed-switch v0, :pswitch_data_0

    instance-of v0, p1, Lj/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    instance-of v0, p1, Lkotlin/jvm/internal/f;

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lkotlin/jvm/internal/f;->getFunctionDelegate()Ll83/e;

    move-result-object v0

    check-cast p1, Lkotlin/jvm/internal/f;

    invoke-interface {p1}, Lkotlin/jvm/internal/f;->getFunctionDelegate()Ll83/e;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    :cond_0
    return v1

    :pswitch_0
    instance-of v0, p1, Lj/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    instance-of v0, p1, Lkotlin/jvm/internal/f;

    if-eqz v0, :cond_1

    invoke-interface {p0}, Lkotlin/jvm/internal/f;->getFunctionDelegate()Ll83/e;

    move-result-object v0

    check-cast p1, Lkotlin/jvm/internal/f;

    invoke-interface {p1}, Lkotlin/jvm/internal/f;->getFunctionDelegate()Ll83/e;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    :cond_1
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getFunctionDelegate()Ll83/e;
    .locals 9

    iget v0, p0, Ln20/g;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, Lkotlin/jvm/internal/i;

    const-string v7, "onSepaMandateResult$paymentsheet_release(Lcom/stripe/android/paymentsheet/ui/SepaMandateResult;)V"

    const/4 v3, 0x0

    const/4 v2, 0x1

    const-class v4, Ln20/i;

    iget-object v5, p0, Ln20/g;->x:Ln20/i;

    const-string v6, "onSepaMandateResult"

    invoke-direct/range {v1 .. v7}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :pswitch_0
    new-instance v2, Lkotlin/jvm/internal/i;

    const-string v8, "onPaymentOptionResult$paymentsheet_release(Lcom/stripe/android/paymentsheet/PaymentOptionsActivityResult;)V"

    const/4 v4, 0x0

    const/4 v3, 0x1

    const-class v5, Ln20/i;

    iget-object v6, p0, Ln20/g;->x:Ln20/i;

    const-string v7, "onPaymentOptionResult"

    invoke-direct/range {v2 .. v8}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Ln20/g;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-interface {p0}, Lkotlin/jvm/internal/f;->getFunctionDelegate()Ll83/e;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0

    :pswitch_0
    invoke-interface {p0}, Lkotlin/jvm/internal/f;->getFunctionDelegate()Ll83/e;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
