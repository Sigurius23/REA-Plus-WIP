.class public final synthetic Lwr0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lwr0/r;->w:I

    iput-object p2, p0, Lwr0/r;->y:Ljava/lang/Object;

    iput-object p3, p0, Lwr0/r;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p3, p0, Lwr0/r;->w:I

    iput-object p1, p0, Lwr0/r;->x:Ljava/lang/Object;

    iput-object p2, p0, Lwr0/r;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lwr0/r;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lwr0/r;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;

    iget-object v1, p0, Lwr0/r;->x:Ljava/lang/Object;

    check-cast v1, Lwn2/i;

    invoke-static {v0, v1}, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;->A(Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;Lwn2/i;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lwr0/r;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lwr0/r;->y:Ljava/lang/Object;

    check-cast v1, Lwn2/i;

    invoke-static {v0, v1}, Lyn2/b;->i(Lkotlin/jvm/functions/Function1;Lwn2/i;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lwr0/r;->y:Ljava/lang/Object;

    check-cast v0, Lyl2/k;

    iget-object v1, p0, Lwr0/r;->x:Ljava/lang/Object;

    check-cast v1, Lny0/h;

    invoke-static {v0, v1}, Lyl2/k;->b(Lyl2/k;Lny0/h;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lwr0/r;->y:Ljava/lang/Object;

    check-cast v0, Lyl2/k;

    iget-object v1, p0, Lwr0/r;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/navigation/e;

    invoke-static {v0, v1}, Lyl2/k;->e(Lyl2/k;Lcom/whoop/navigation/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lwr0/r;->y:Ljava/lang/Object;

    check-cast v0, Lyl2/k;

    iget-object v1, p0, Lwr0/r;->x:Ljava/lang/Object;

    check-cast v1, Lyl2/b;

    invoke-static {v0, v1}, Lyl2/k;->k(Lyl2/k;Lyl2/b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lwr0/r;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lwr0/r;->x:Ljava/lang/Object;

    check-cast v1, Ll21/c;

    invoke-static {v0, v1}, Lyl0/n;->a(Ljava/lang/String;Ll21/c;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lwr0/r;->y:Ljava/lang/Object;

    check-cast v0, Ltk2/m$b;

    iget-object v1, p0, Lwr0/r;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lyk2/l;->b(Ltk2/m$b;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lwr0/r;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lwr0/r;->y:Ljava/lang/Object;

    check-cast v1, Lxd2/h$p;

    invoke-static {v0, v1}, Lyd2/k;->u(Lkotlin/jvm/functions/Function1;Lxd2/h$p;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lwr0/r;->y:Ljava/lang/Object;

    check-cast v0, Lxd2/m;

    iget-object v1, p0, Lwr0/r;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lyd2/d;->b(Lxd2/m;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lwr0/r;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lwr0/r;->y:Ljava/lang/Object;

    check-cast v1, Lxc2/d$b;

    invoke-static {v0, v1}, Lyc2/c;->r(Lkotlin/jvm/functions/Function1;Lxc2/d$b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, p0, Lwr0/r;->y:Ljava/lang/Object;

    check-cast v0, Lyb3/p;

    iget-object v1, p0, Lwr0/r;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lyb3/p;->a(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, p0, Lwr0/r;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lwr0/r;->y:Ljava/lang/Object;

    check-cast v1, Lwb0/c;

    invoke-static {v0, v1}, Lyb0/g;->h(Lkotlin/jvm/functions/Function1;Lwb0/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v0, p0, Lwr0/r;->y:Ljava/lang/Object;

    check-cast v0, Ly80/d;

    iget-object v1, p0, Lwr0/r;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Ly80/c;->c(Ly80/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    iget-object v0, p0, Lwr0/r;->y:Ljava/lang/Object;

    check-cast v0, Ly31/e;

    iget-object v1, p0, Lwr0/r;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Ly31/b;->c(Ly31/e;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_d
    iget-object v0, p0, Lwr0/r;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lwr0/r;->y:Ljava/lang/Object;

    check-cast v1, Ly11/l;

    invoke-static {v0, v1}, Ly11/h;->a(Lkotlin/jvm/functions/Function1;Ly11/l;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    iget-object v0, p0, Lwr0/r;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lwr0/r;->y:Ljava/lang/Object;

    check-cast v1, Lxz0/f;

    invoke-static {v0, v1}, Lxz0/e;->b(Lkotlin/jvm/functions/Function1;Lxz0/f;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_f
    iget-object v0, p0, Lwr0/r;->y:Ljava/lang/Object;

    check-cast v0, Luw1/h;

    iget-object v1, p0, Lwr0/r;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lxw1/f;->d(Luw1/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_10
    iget-object v0, p0, Lwr0/r;->y:Ljava/lang/Object;

    check-cast v0, Lvp2/c$c;

    iget-object v1, p0, Lwr0/r;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lxp2/f;->f(Lvp2/c$c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_11
    iget-object v0, p0, Lwr0/r;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lwr0/r;->y:Ljava/lang/Object;

    check-cast v1, Lxl0/d;

    invoke-static {v0, v1}, Lxl0/c;->c(Lkotlin/jvm/functions/Function1;Lxl0/d;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_12
    iget-object v0, p0, Lwr0/r;->y:Ljava/lang/Object;

    check-cast v0, Lqh0/b;

    iget-object v1, p0, Lwr0/r;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lxh0/c;->i(Lqh0/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_13
    iget-object v0, p0, Lwr0/r;->y:Ljava/lang/Object;

    check-cast v0, Lx71/d;

    iget-object v1, p0, Lwr0/r;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lx71/b;->c(Lx71/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    iget-object v0, p0, Lwr0/r;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v1, p0, Lwr0/r;->x:Ljava/lang/Object;

    check-cast v1, Lx6/p;

    new-instance v2, Lsz/q;

    const/16 v3, 0x11

    const/4 v4, 0x0

    invoke-direct {v2, v1, v4, v3}, Lsz/q;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v1, 0x3

    invoke-static {v0, v4, v4, v2, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_15
    iget-object v0, p0, Lwr0/r;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lwr0/r;->y:Ljava/lang/Object;

    check-cast v1, Lx51/a;

    invoke-static {v0, v1}, Lx51/c;->f(Lkotlin/jvm/functions/Function1;Lx51/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    iget-object v0, p0, Lwr0/r;->y:Ljava/lang/Object;

    check-cast v0, Lv30/e;

    iget-object v1, p0, Lwr0/r;->x:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v0, v1}, Lv30/e;->a(Landroid/content/Context;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_17
    iget-object v0, p0, Lwr0/r;->y:Ljava/lang/Object;

    check-cast v0, Lx30/c;

    iget-object v1, p0, Lwr0/r;->x:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    new-instance v2, Landroid/content/Intent;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Ls3/c;->a:Ls/m2;

    invoke-virtual {v0}, Ls/m2;->i()Ls3/b;

    move-result-object v0

    invoke-virtual {v0}, Ls3/b;->a()Ls3/a;

    move-result-object v0

    iget-object v3, v0, Ls3/a;->a:Ljava/util/Locale;

    invoke-virtual {v3}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "toLowerCase(...)"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Ls3/a;->a:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "toUpperCase(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "_"

    invoke-static {v3, v4, v0}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v3, 0x1

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v3, "https://static.afterpay.com/modal/%s.html"

    invoke-static {v3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    const-string v3, "android.intent.action.VIEW"

    invoke-direct {v2, v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {v1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_18
    iget-object v0, p0, Lwr0/r;->y:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;

    iget-object v1, p0, Lwr0/r;->x:Ljava/lang/Object;

    check-cast v1, Lp1/t2;

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx20/p;

    iget-object v1, v1, Lx20/p;->c:Lx20/o;

    sget-object v2, Lx20/o;->y:Lx20/o;

    if-ne v1, v2, :cond_0

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->y:Landroidx/lifecycle/y1;

    invoke-virtual {v0}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx20/w;

    invoke-virtual {v0}, Lx20/w;->j()V

    :cond_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_19
    iget-object v0, p0, Lwr0/r;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lwr0/r;->y:Ljava/lang/Object;

    check-cast v1, Lx11/c;

    invoke-static {v0, v1}, Lx11/a;->a(Lkotlin/jvm/functions/Function1;Lx11/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    iget-object v0, p0, Lwr0/r;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lwr0/r;->y:Ljava/lang/Object;

    check-cast v1, Lx01/c;

    invoke-static {v0, v1}, Lx01/b;->b(Lkotlin/jvm/functions/Function1;Lx01/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    iget-object v0, p0, Lwr0/r;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lwr0/r;->y:Ljava/lang/Object;

    check-cast v1, Lwr0/l0;

    invoke-static {v0, v1}, Lwr0/j0;->g(Lkotlin/jvm/functions/Function1;Lwr0/l0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1c
    iget-object v0, p0, Lwr0/r;->y:Ljava/lang/Object;

    check-cast v0, Lwr0/t;

    iget-object v1, p0, Lwr0/r;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lwr0/s;->d(Lwr0/t;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

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
