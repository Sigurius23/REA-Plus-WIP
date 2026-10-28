.class public final synthetic Lyy/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lyy/b0;->w:I

    iput-object p1, p0, Lyy/b0;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 22

    move-object/from16 v1, p0

    iget v0, v1, Lyy/b0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Lyy/b0;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lzx/o;

    new-instance v6, Lbi/p;

    const/4 v0, 0x7

    invoke-direct {v6, v0}, Lbi/p;-><init>(I)V

    new-instance v9, Lzx/n;

    new-instance v10, Lso/q;

    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    iput-object v6, v10, Lso/q;->w:Ljava/lang/Object;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v0

    iput-object v0, v10, Lso/q;->x:Ljava/lang/Object;

    const-string v3, "appContext"

    iget-object v12, v2, Lzx/o;->d:Landroid/content/Context;

    const/4 v4, 0x0

    :try_start_0
    invoke-static {v12, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lux/y;->y:Lux/y;

    if-nez v0, :cond_2

    new-instance v0, Lux/x;

    invoke-direct {v0, v12}, Lux/x;-><init>(Landroid/content/Context;)V

    iget-object v0, v0, Lux/x;->a:Landroid/content/SharedPreferences;

    const-string v5, "key_publishable_key"

    invoke-interface {v0, v5, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    new-instance v7, Lux/y;

    const-string v8, "key_account_id"

    invoke-interface {v0, v8, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v5, v0}, Lux/y;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v7

    goto :goto_0

    :cond_0
    move-object v0, v4

    :goto_0
    if-eqz v0, :cond_1

    sput-object v0, Lux/y;->y:Lux/y;

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v5, "PaymentConfiguration was not initialized. Call PaymentConfiguration.init()."

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_1
    iget-object v0, v0, Lux/y;->w:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_2
    instance-of v5, v0, Ll83/m;

    if-nez v5, :cond_3

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    sget-object v7, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->q0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    invoke-virtual {v2, v7, v5}, Lzx/o;->a(Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/lang/String;)V

    :cond_3
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_4

    const-string v5, "pk_undefined"

    sget-object v7, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->r0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    invoke-virtual {v2, v7, v5}, Lzx/o;->a(Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/lang/String;)V

    :cond_4
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v5

    if-nez v5, :cond_5

    check-cast v0, Ljava/lang/String;

    new-instance v5, Lzx/w;

    new-instance v11, Lb10/z0;

    invoke-static {v12, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v13, Lar0/a;

    const/16 v3, 0xb

    invoke-direct {v13, v0, v3}, Lar0/a;-><init>(Ljava/lang/String;I)V

    iget-object v14, v2, Lzx/o;->b:Lb10/d;

    const/16 v20, 0x0

    const v21, 0xfff8

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v11 .. v21}, Lb10/z0;-><init>(Landroid/content/Context;Lc93/a;Lb10/d;Lqy/d;Lq83/j;Ljava/util/Set;Lyy/j;Lb10/b;Ljava/util/Set;I)V

    move-object v3, v5

    new-instance v5, Lyy/f;

    const/4 v7, 0x6

    invoke-direct {v5, v0, v4, v7}, Lyy/f;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    new-instance v7, Lyy/j;

    invoke-direct {v7}, Lyy/j;-><init>()V

    new-instance v8, Lb10/b;

    iget-object v2, v2, Lzx/o;->a:Ljava/util/Set;

    invoke-direct {v8, v12, v2, v0}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Ljava/lang/String;)V

    move-object v4, v11

    invoke-direct/range {v3 .. v8}, Lzx/w;-><init>(Lb10/z0;Lyy/f;Lbi/p;Lyy/j;Lb10/b;)V

    move-object v5, v3

    goto :goto_3

    :cond_5
    new-instance v5, Lzd3/x;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v0

    iput-object v0, v5, Lzd3/x;->w:Ljava/lang/Object;

    :goto_3
    new-instance v0, Lt9/u;

    const/16 v2, 0xc

    invoke-direct {v0, v2}, Lt9/u;-><init>(I)V

    invoke-direct {v9, v10, v5, v0, v6}, Lzx/n;-><init>(Lso/q;Lzx/f;Lt9/u;Lbi/p;)V

    return-object v9

    :pswitch_0
    iget-object v0, v1, Lyy/b0;->x:Ljava/lang/Object;

    check-cast v0, Lwo2/b;

    invoke-static {v0}, Lzo2/g;->b(Lwo2/b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, v1, Lyy/b0;->x:Ljava/lang/Object;

    check-cast v0, Lzk1/c;

    invoke-static {v0}, Lzk1/a;->f(Lzk1/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, v1, Lyy/b0;->x:Ljava/lang/Object;

    check-cast v0, Lxi1/b;

    invoke-static {v0}, Lzi1/i;->b(Lxi1/b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, v1, Lyy/b0;->x:Ljava/lang/Object;

    check-cast v0, Lyi1/b;

    invoke-static {v0}, Lzi1/h;->b(Lyi1/b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, v1, Lyy/b0;->x:Ljava/lang/Object;

    check-cast v0, Lti0/e;

    invoke-static {v0}, Lzi0/a;->n(Lti0/e;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, v1, Lyy/b0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/access/omronauth/view/OmronAuthFragment;

    invoke-static {v0}, Lcom/whoop/access/omronauth/view/OmronAuthFragment;->z(Lcom/whoop/access/omronauth/view/OmronAuthFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, v1, Lyy/b0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/payments/feature/paymentmethodmanagement/view/PaymentMethodManagementFragment;

    invoke-static {v0}, Lcom/whoop/payments/feature/paymentmethodmanagement/view/PaymentMethodManagementFragment;->y(Lcom/whoop/payments/feature/paymentmethodmanagement/view/PaymentMethodManagementFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, v1, Lyy/b0;->x:Ljava/lang/Object;

    check-cast v0, Landroid/app/RemoteAction;

    invoke-virtual {v0}, Landroid/app/RemoteAction;->getActionIntent()Landroid/app/PendingIntent;

    move-result-object v0

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x22

    if-lt v2, v3, :cond_6

    invoke-static {v0}, Lb3/g1;->q(Landroid/app/PendingIntent;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v0}, Landroid/app/PendingIntent;->send()V

    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_8
    iget-object v0, v1, Lyy/b0;->x:Ljava/lang/Object;

    check-cast v0, Lx0/g;

    invoke-interface {v0}, Lx0/g;->close()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_9
    iget-object v0, v1, Lyy/b0;->x:Ljava/lang/Object;

    check-cast v0, Lb1/f;

    invoke-interface {v0}, Lb1/f;->s()Lx0/c;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, v1, Lyy/b0;->x:Ljava/lang/Object;

    check-cast v0, Lyy/f;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
