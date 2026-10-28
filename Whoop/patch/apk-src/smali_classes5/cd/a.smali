.class public final Lcd/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcd/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    const/4 v0, 0x5

    iput v0, p0, Lcd/a;->a:I

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lux/y;->y:Lux/y;

    if-nez v0, :cond_2

    .line 3
    new-instance v0, Lux/x;

    invoke-direct {v0, p1}, Lux/x;-><init>(Landroid/content/Context;)V

    .line 4
    iget-object p1, v0, Lux/x;->a:Landroid/content/SharedPreferences;

    const-string v0, "key_publishable_key"

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    new-instance v2, Lux/y;

    .line 6
    const-string v3, "key_account_id"

    invoke-interface {p1, v3, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 7
    invoke-direct {v2, v0, p1}, Lux/y;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v2

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    .line 8
    sput-object v0, Lux/y;->y:Lux/y;

    goto :goto_1

    .line 9
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 10
    const-string v0, "PaymentConfiguration was not initialized. Call PaymentConfiguration.init()."

    .line 11
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 12
    :cond_2
    :goto_1
    iget-object p1, v0, Lux/y;->w:Ljava/lang/String;

    .line 13
    iget-object v0, v0, Lux/y;->x:Ljava/lang/String;

    .line 14
    invoke-direct {p0, p1, v0}, Lcd/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lcd/a;->a:I

    const-string v0, "publishableKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p2, p0, Lcd/a;->b:Ljava/lang/String;

    .line 17
    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 18
    const-string p2, "sk_"

    const/4 v0, 0x0

    .line 19
    invoke-static {p1, p2, v0}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p2

    if-nez p2, :cond_1

    .line 20
    const-string p2, "rk_"

    .line 21
    invoke-static {p1, p2, v0}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p2

    if-nez p2, :cond_0

    .line 22
    iput-object p1, p0, Lcd/a;->c:Ljava/lang/String;

    .line 23
    const-string p1, "22.6.1"

    iput-object p1, p0, Lcd/a;->d:Ljava/lang/String;

    return-void

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid Publishable Key: You are using a restricted key instead of a publishable one. For more info, see https://stripe.com/docs/keys"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 25
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid Publishable Key: You are using a secret key instead of a publishable one. For more info, see https://stripe.com/docs/keys"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 26
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid Publishable Key: You must use a valid Stripe API key to make a Stripe API request. For more info, see https://stripe.com/docs/keys"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Lre/a0;
    .locals 1

    new-instance v0, Lre/a0;

    invoke-direct {v0, p0}, Lre/a0;-><init>(Lcd/a;)V

    return-object v0
.end method

.method public b()Lre/e1;
    .locals 1

    new-instance v0, Lre/e1;

    invoke-direct {v0, p0}, Lre/e1;-><init>(Lcd/a;)V

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    iget v0, p0, Lcd/a;->a:I

    packed-switch v0, :pswitch_data_0

    iput-object p1, p0, Lcd/a;->b:Ljava/lang/String;

    return-void

    :pswitch_0
    iput-object p1, p0, Lcd/a;->b:Ljava/lang/String;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcd/a;->c:Ljava/lang/String;

    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcd/a;->d:Ljava/lang/String;

    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcd/a;->c:Ljava/lang/String;

    return-void
.end method

.method public g(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcd/a;->d:Ljava/lang/String;

    return-void
.end method
