.class public final Lp20/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# instance fields
.field public final synthetic w:I

.field public final x:Lv03/h;


# direct methods
.method public constructor <init>(Lng3/o;Lv03/e;)V
    .locals 0

    const/4 p1, 0x4

    iput p1, p0, Lp20/i;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lp20/i;->x:Lv03/h;

    return-void
.end method

.method public synthetic constructor <init>(Lv03/h;I)V
    .locals 0

    .line 1
    iput p2, p0, Lp20/i;->w:I

    iput-object p1, p0, Lp20/i;->x:Lv03/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lp20/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lp20/i;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyz/b;

    new-instance v1, Lyz/a;

    invoke-direct {v1, v0}, Lyz/a;-><init>(Lyz/b;)V

    return-object v1

    :pswitch_0
    iget-object v0, p0, Lp20/i;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    new-instance v1, Lxz/n0;

    invoke-direct {v1, v0}, Lxz/n0;-><init>(Landroid/content/Context;)V

    return-object v1

    :pswitch_1
    iget-object v0, p0, Lp20/i;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb20/f;

    new-instance v1, Lx30/t0;

    invoke-direct {v1, v0}, Lx30/t0;-><init>(Lb20/f;)V

    return-object v1

    :pswitch_2
    iget-object v0, p0, Lp20/i;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln20/d;

    new-instance v1, Lwz/l1;

    invoke-direct {v1, v0}, Lwz/l1;-><init>(Ln20/d;)V

    return-object v1

    :pswitch_3
    iget-object v0, p0, Lp20/i;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/k1;

    const-string v1, "savedStateHandle"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lxz/f0;

    invoke-direct {v1, v0}, Lxz/f0;-><init>(Landroidx/lifecycle/k1;)V

    return-object v1

    :pswitch_4
    iget-object v0, p0, Lp20/i;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le10/r0;

    const-string v1, "confirmationHandler"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lt10/c;

    invoke-direct {v1, v0}, Lt10/c;-><init>(Le10/r0;)V

    return-object v1

    :pswitch_5
    iget-object v0, p0, Lp20/i;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "paymentElementCallbackIdentifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ld10/a;->a(Ljava/lang/String;)Ld10/b;

    const/4 v0, 0x0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lp20/i;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-string v1, "appContext"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lux/y;->y:Lux/y;

    if-nez v1, :cond_2

    new-instance v1, Lux/x;

    invoke-direct {v1, v0}, Lux/x;-><init>(Landroid/content/Context;)V

    iget-object v0, v1, Lux/x;->a:Landroid/content/SharedPreferences;

    const-string v1, "key_publishable_key"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v3, Lux/y;

    const-string v4, "key_account_id"

    invoke-interface {v0, v4, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v1, v0}, Lux/y;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v1, v3

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_1

    sput-object v1, Lux/y;->y:Lux/y;

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "PaymentConfiguration was not initialized. Call PaymentConfiguration.init()."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_1
    return-object v1

    :pswitch_7
    iget-object v0, p0, Lp20/i;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh20/w3;

    const-string v1, "args"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lh20/w3;->y:Ljava/lang/String;

    invoke-static {v0}, Ls93/k;->c(Ljava/lang/Object;)V

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lp20/i;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/k1;

    const-string v1, "savedStateHandle"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lxz/f0;

    invoke-direct {v1, v0}, Lxz/f0;-><init>(Landroidx/lifecycle/k1;)V

    return-object v1

    :pswitch_9
    iget-object v0, p0, Lp20/i;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "paymentElementCallbackIdentifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ld10/a;->a(Ljava/lang/String;)Ld10/b;

    const/4 v0, 0x0

    return-object v0

    :pswitch_a
    const-string v0, "paymentConfiguration"

    iget-object v1, p0, Lp20/i;->x:Lv03/h;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ln10/j0;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ln10/j0;-><init>(Lk83/a;I)V

    return-object v0

    :pswitch_b
    iget-object v0, p0, Lp20/i;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-string v1, "appContext"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lux/y;->y:Lux/y;

    if-nez v1, :cond_5

    new-instance v1, Lux/x;

    invoke-direct {v1, v0}, Lux/x;-><init>(Landroid/content/Context;)V

    iget-object v0, v1, Lux/x;->a:Landroid/content/SharedPreferences;

    const-string v1, "key_publishable_key"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    new-instance v3, Lux/y;

    const-string v4, "key_account_id"

    invoke-interface {v0, v4, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v1, v0}, Lux/y;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v1, v3

    goto :goto_2

    :cond_3
    move-object v1, v2

    :goto_2
    if-eqz v1, :cond_4

    sput-object v1, Lux/y;->y:Lux/y;

    goto :goto_3

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "PaymentConfiguration was not initialized. Call PaymentConfiguration.init()."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_3
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
