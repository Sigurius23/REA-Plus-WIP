.class public final synthetic Lq12/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(ILp1/c1;)V
    .locals 0

    iput p1, p0, Lq12/c;->w:I

    iput-object p2, p0, Lq12/c;->x:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lq12/c;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ll3/r0;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq12/c;->x:Lp1/c1;

    invoke-interface {v0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lq12/c;->x:Lp1/c1;

    check-cast p1, Lv41/s;

    invoke-static {v0, p1}, Lwz0/d;->d(Lp1/c1;Lv41/s;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lq12/c;->x:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lwq2/b;->e(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lq12/c;->x:Lp1/c1;

    check-cast p1, Lw81/d;

    invoke-static {v0, p1}, Lwo1/t;->b(Lp1/c1;Lw81/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lq12/c;->x:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lwi0/e;->g(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lq12/c;->x:Lp1/c1;

    invoke-static {v0, p1}, Lwi0/e;->f(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lq12/c;->x:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lvo1/t;->l(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lq12/c;->x:Lp1/c1;

    check-cast p1, Lw81/d;

    invoke-static {v0, p1}, Lv81/c;->c(Lp1/c1;Lw81/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lq12/c;->x:Lp1/c1;

    check-cast p1, Lg2/v;

    invoke-static {v0, p1}, Lv80/b;->b(Lp1/c1;Lg2/v;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lq12/c;->x:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lv01/c;->e(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lq12/c;->x:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lv01/c;->b(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lq12/c;->x:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lux0/b;->a(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lq12/c;->x:Lp1/c1;

    check-cast p1, Lcom/whoop/design/models/modal/AnyModal;

    invoke-static {v0, p1}, Luu2/w;->l(Lp1/c1;Lcom/whoop/design/models/modal/AnyModal;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lq12/c;->x:Lp1/c1;

    invoke-static {v0, p1}, Lu71/g;->e(Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lq12/c;->x:Lp1/c1;

    check-cast p1, Ly2/y;

    invoke-static {v0, p1}, Lu11/i;->l(Lp1/c1;Ly2/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lh2/b;

    iget-object v0, p0, Lq12/c;->x:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_f
    check-cast p1, Ljava/util/List;

    iget-object v0, p0, Lq12/c;->x:Lp1/c1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lq12/c;->x:Lp1/c1;

    check-cast p1, Lg2/v;

    invoke-static {v0, p1}, Lt11/e;->c(Lp1/c1;Lg2/v;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lq12/c;->x:Lp1/c1;

    check-cast p1, Ly2/y;

    invoke-static {v0, p1}, Lsz0/x0;->d(Lp1/c1;Ly2/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lq12/c;->x:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lst1/n;->g(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lq12/c;->x:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lry2/b;->e(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lq12/c;->x:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lrx0/g;->g(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lq12/c;->x:Lp1/c1;

    check-cast p1, Ll3/r0;

    invoke-static {v0, p1}, Lrq2/c0;->j(Lp1/c1;Ll3/r0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lq12/c;->x:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lr90/f;->c(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lq12/c;->x:Lp1/c1;

    invoke-static {v0, p1}, Lr51/e;->f(Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lq12/c;->x:Lp1/c1;

    check-cast p1, Lg2/v;

    invoke-static {v0, p1}, Lr41/h;->j(Lp1/c1;Lg2/v;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lq12/c;->x:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lqq2/b;->d(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lq12/c;->x:Lp1/c1;

    check-cast p1, Ly2/y;

    invoke-static {v0, p1}, Lqm1/e;->e(Lp1/c1;Ly2/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lq12/c;->x:Lp1/c1;

    check-cast p1, Lnl0/k;

    invoke-static {v0, p1}, Lq12/d;->b(Lp1/c1;Lnl0/k;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lq12/c;->x:Lp1/c1;

    check-cast p1, Lnl0/m;

    invoke-static {v0, p1}, Lq12/d;->a(Lp1/c1;Lnl0/m;)Ll83/a0;

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
