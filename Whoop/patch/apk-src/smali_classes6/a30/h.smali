.class public final La30/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# instance fields
.field public final synthetic w:I

.field public final x:Lv03/h;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lv03/h;I)V
    .locals 0

    .line 1
    iput p3, p0, La30/h;->w:I

    iput-object p2, p0, La30/h;->x:Lv03/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lv03/h;I)V
    .locals 0

    .line 2
    iput p2, p0, La30/h;->w:I

    iput-object p1, p0, La30/h;->x:Lv03/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/app/Application;)Lt40/f;
    .locals 4

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc00/c;->a:Lc00/c;

    sget-object v1, Lc00/c;->b:Lt40/f;

    if-nez v1, :cond_1

    monitor-enter v0

    :try_start_0
    sget-object v1, Lc00/c;->b:Lt40/f;

    if-nez v1, :cond_0

    new-instance v1, Lt40/f;

    new-instance v2, Ln;

    const/16 v3, 0x1b

    invoke-direct {v2, v3}, Ln;-><init>(I)V

    new-instance v3, Lq30/u0;

    invoke-direct {v3, p0}, Lq30/u0;-><init>(Landroid/app/Application;)V

    invoke-direct {v1, v2, v3}, Lt40/f;-><init>(Ln;Lq30/u0;)V

    sput-object v1, Lc00/c;->b:Lt40/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0

    throw p0

    :cond_1
    return-object v1
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 8

    iget v0, p0, La30/h;->w:I

    const-string v1, "getPackageName(...)"

    const-string v2, "viewModel"

    const-string v3, "args"

    const-string v4, "paymentElementCallbackIdentifier"

    const-string v5, "context"

    const/4 v6, 0x0

    iget-object v7, p0, La30/h;->x:Lv03/h;

    packed-switch v0, :pswitch_data_0

    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh20/f0;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lh20/f0;->F:Ljava/util/Set;

    invoke-static {v0}, Ls93/k;->c(Ljava/lang/Object;)V

    check-cast v0, Ljava/util/Set;

    return-object v0

    :pswitch_0
    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh20/f0;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lh20/f0;->w:La30/f1;

    iget-object v0, v0, La30/f1;->E:Lv00/c0;

    invoke-static {v0}, Ls93/k;->c(Ljava/lang/Object;)V

    return-object v0

    :pswitch_1
    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lal0/f;

    const/16 v2, 0x8

    invoke-direct {v1, v0, v2}, Lal0/f;-><init>(Landroid/content/Context;I)V

    return-object v1

    :pswitch_2
    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj20/c;

    const-string v1, "defaultAddressLauncherEventReporter"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :pswitch_3
    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxz/x;

    new-instance v1, Lg10/a;

    invoke-direct {v1, v0}, Lg10/a;-><init>(Lxz/x;)V

    return-object v1

    :pswitch_4
    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ld10/a;->a(Ljava/lang/String;)Ld10/b;

    return-object v6

    :pswitch_5
    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln20/u;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lm40/w;

    const/16 v2, 0x1e

    invoke-direct {v1, v0, v2}, Lm40/w;-><init>(Landroid/content/Context;I)V

    return-object v1

    :pswitch_7
    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln20/u;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ln20/u;->g()Ln20/h;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, Ln20/h;->w:La30/f1;

    if-eqz v0, :cond_0

    iget-object v6, v0, La30/f1;->E:Lv00/c0;

    :cond_0
    return-object v6

    :pswitch_8
    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    const-string v2, "application"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :pswitch_9
    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ld10/a;->a(Ljava/lang/String;)Ld10/b;

    return-object v6

    :pswitch_a
    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ld10/a;->a(Ljava/lang/String;)Ld10/b;

    return-object v6

    :pswitch_b
    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Lcom/stripe/android/shoppay/ShopPayActivityContract;

    invoke-direct {v1, v0}, Lcom/stripe/android/shoppay/ShopPayActivityContract;-><init>(Ljava/lang/String;)V

    return-object v1

    :pswitch_c
    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwz/l1;

    new-instance v1, Lh20/x;

    invoke-direct {v1, v0}, Lh20/x;-><init>(Lwz/l1;)V

    return-object v1

    :pswitch_d
    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc20/h;

    const-string v1, "unsupportedNextActionHandler"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    const-string v1, "com.stripe.android.payments.wechatpay.WeChatPayNextActionHandler"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentNextActionHandler<com.stripe.android.model.StripeIntent>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lc20/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-static {v1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v1

    :goto_0
    instance-of v2, v1, Ll83/m;

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    check-cast v0, Lc20/e;

    return-object v0

    :pswitch_e
    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Le4/a;->G(Landroid/content/Context;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lv10/a;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v0}, Lv10/a;-><init>(Ljava/lang/String;)V

    return-object v2

    :pswitch_10
    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh20/h;

    new-instance v1, Le10/k0;

    invoke-direct {v1, v0}, Le10/k0;-><init>(Lh20/h;)V

    return-object v1

    :pswitch_11
    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "getResources(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :pswitch_12
    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function1;

    new-instance v1, Lc20/h;

    invoke-direct {v1, v0}, Lc20/h;-><init>(Lkotlin/jvm/functions/Function1;)V

    return-object v1

    :pswitch_13
    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function1;

    new-instance v1, Lc20/c;

    invoke-direct {v1, v0}, Lc20/c;-><init>(Lkotlin/jvm/functions/Function1;)V

    return-object v1

    :pswitch_14
    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    invoke-static {v0}, La30/h;->a(Landroid/app/Application;)Lt40/f;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxz/x;

    const-string v1, "linkAccountManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lg10/a;

    invoke-direct {v1, v0}, Lg10/a;-><init>(Lxz/x;)V

    return-object v1

    :pswitch_16
    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ld10/a;->a(Ljava/lang/String;)Ld10/b;

    return-object v6

    :pswitch_17
    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-string v1, "appContext"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lux/y;->y:Lux/y;

    if-nez v1, :cond_4

    new-instance v1, Lux/x;

    invoke-direct {v1, v0}, Lux/x;-><init>(Landroid/content/Context;)V

    const-string v0, "key_publishable_key"

    iget-object v1, v1, Lux/x;->a:Landroid/content/SharedPreferences;

    invoke-interface {v1, v0, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v2, Lux/y;

    const-string v3, "key_account_id"

    invoke-interface {v1, v3, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v0, v1}, Lux/y;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v6, v2

    :cond_2
    if-eqz v6, :cond_3

    sput-object v6, Lux/y;->y:Lux/y;

    move-object v1, v6

    goto :goto_2

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "PaymentConfiguration was not initialized. Call PaymentConfiguration.init()."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_2
    return-object v1

    :pswitch_18
    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lqy/e;->a:Lqy/d;

    goto :goto_3

    :cond_5
    sget-object v0, Lqy/e;->b:Lqy/d;

    :goto_3
    return-object v0

    :pswitch_19
    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    new-instance v1, Lbz/i;

    invoke-direct {v1, v0}, Lbz/i;-><init>(Landroid/content/Context;)V

    return-object v1

    :pswitch_1a
    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwz/g0;

    new-instance v1, Lb00/a;

    invoke-direct {v1, v0}, Lb00/a;-><init>(Lwz/g0;)V

    return-object v1

    :pswitch_1b
    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz20/g;

    new-instance v1, La30/e0;

    invoke-direct {v1, v0}, La30/e0;-><init>(Lz20/g;)V

    return-object v1

    :pswitch_1c
    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwz/l1;

    new-instance v1, La30/g;

    invoke-direct {v1, v0}, La30/g;-><init>(Lwz/l1;)V

    return-object v1

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
