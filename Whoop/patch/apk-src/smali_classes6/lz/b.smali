.class public final Llz/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/a2;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Llz/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Class;Ll8/c;)Landroidx/lifecycle/w1;
    .locals 8

    iget p1, p0, Llz/b;->a:I

    const-string v0, "extras"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    packed-switch p1, :pswitch_data_0

    invoke-static {p2}, Lup/d;->K(Ll8/c;)Landroid/app/Application;

    move-result-object p1

    invoke-static {p2}, Landroidx/lifecycle/o1;->e(Ll8/c;)Landroidx/lifecycle/k1;

    move-result-object v6

    sget-object p2, Lux/y;->y:Lux/y;

    if-nez p2, :cond_2

    new-instance p2, Lux/x;

    invoke-direct {p2, p1}, Lux/x;-><init>(Landroid/content/Context;)V

    iget-object p2, p2, Lux/x;->a:Landroid/content/SharedPreferences;

    const-string v0, "key_publishable_key"

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v2, Lux/y;

    const-string v3, "key_account_id"

    invoke-interface {p2, v3, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v2, v0, p2}, Lux/y;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object p2, v2

    goto :goto_0

    :cond_0
    move-object p2, v1

    :goto_0
    if-eqz p2, :cond_1

    sput-object p2, Lux/y;->y:Lux/y;

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "PaymentConfiguration was not initialized. Call PaymentConfiguration.init()."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    new-instance v1, Lv10/r;

    new-instance v2, Lyy/j;

    invoke-direct {v2}, Lyy/j;-><init>()V

    new-instance v3, Lb10/b;

    iget-object p2, p2, Lux/y;->w:Ljava/lang/String;

    sget-object v0, Lm83/a0;->w:Lm83/a0;

    invoke-direct {v3, p1, v0, p2}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Ljava/lang/String;)V

    :try_start_0
    const-string p2, "com.android.chrome"

    new-instance v0, Landroidx/room/b0;

    invoke-direct {v0}, Landroidx/room/b0;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    iput-object v4, v0, Landroidx/room/b0;->x:Ljava/lang/Object;

    new-instance v4, Landroid/content/Intent;

    const-string v5, "android.support.customtabs.action.CustomTabsService"

    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_3

    invoke-virtual {v4, p2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    :cond_3
    const/16 p2, 0x21

    invoke-virtual {p1, v4, v0, p2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p2, v0

    invoke-static {p2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    :goto_2
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    instance-of v4, p2, Ll83/m;

    if-eqz v4, :cond_4

    move-object p2, v0

    :cond_4
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_5

    sget-object p2, Lry/a;->w:Lry/a;

    :goto_3
    move-object v4, p2

    goto :goto_4

    :cond_5
    sget-object p2, Lry/a;->x:Lry/a;

    goto :goto_3

    :goto_4
    const p2, 0x7f141002

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string p1, "getString(...)"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {v1 .. v6}, Lv10/r;-><init>(Lyy/j;Lb10/b;Lry/a;Ljava/lang/String;Landroidx/lifecycle/k1;)V

    return-object v1

    :pswitch_0
    invoke-static {p2}, Landroidx/lifecycle/o1;->e(Ll8/c;)Landroidx/lifecycle/k1;

    move-result-object v4

    sget-object p1, Landroidx/lifecycle/z1;->d:Lio/sentry/hints/j;

    invoke-virtual {p2, p1}, Ll8/c;->a(Ll8/b;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type android.content.Context"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    const-string p1, "getPackageName(...)"

    invoke-static {v7, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lmz/a;->a:Lq30/w0;

    sget-object v3, Lmz/a;->d:Lqy/d;

    sget-object v6, Lmz/a;->c:Lkc3/d;

    new-instance v5, Lxl/a;

    new-instance p1, Lgm/r;

    new-instance p2, Lab/i0;

    const/16 v0, 0xe

    invoke-direct {p2, v6, v3, v0}, Lab/i0;-><init>(Lq83/j;Lqy/d;I)V

    sget-object v0, Lmz/a;->b:Lad3/r;

    invoke-direct {p1, p2, v0, v3}, Lgm/r;-><init>(Lab/i0;Lad3/c;Lqy/d;)V

    sget-object p2, Lmz/a;->a:Lq30/w0;

    invoke-direct {v5, p1, p2}, Lxl/a;-><init>(Lgm/r;Lq30/w0;)V

    new-instance v2, Llz/i;

    invoke-direct/range {v2 .. v7}, Llz/i;-><init>(Lqy/d;Landroidx/lifecycle/k1;Lxl/a;Lbc3/z;Ljava/lang/String;)V

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
