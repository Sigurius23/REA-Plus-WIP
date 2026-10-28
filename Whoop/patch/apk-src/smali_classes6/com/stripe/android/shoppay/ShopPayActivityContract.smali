.class public final Lcom/stripe/android/shoppay/ShopPayActivityContract;
.super Lk/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk/b;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/stripe/android/shoppay/ShopPayActivityContract;",
        "Lk/b;",
        "Lh30/e;",
        "Lh30/i;",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "paymentElementCallbackIdentifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/shoppay/ShopPayActivityContract;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 10

    check-cast p2, Lh30/e;

    const-string v0, "input"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lux/y;->y:Lux/y;

    if-nez v0, :cond_2

    new-instance v0, Lux/x;

    invoke-direct {v0, p1}, Lux/x;-><init>(Landroid/content/Context;)V

    iget-object v0, v0, Lux/x;->a:Landroid/content/SharedPreferences;

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

    move-object v0, v3

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    sput-object v0, Lux/y;->y:Lux/y;

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "PaymentConfiguration was not initialized. Call PaymentConfiguration.init()."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    sget v1, Lcom/stripe/android/shoppay/ShopPayActivity;->E:I

    new-instance v2, Lh30/j;

    iget-object v3, p2, Lh30/e;->a:Lv00/c0;

    iget-object v4, p2, Lh30/e;->b:Lh20/g3;

    iget-object v5, v0, Lux/y;->w:Ljava/lang/String;

    iget-object v6, v0, Lux/y;->x:Ljava/lang/String;

    iget-object v8, p2, Lh30/e;->c:Ljava/lang/String;

    iget-object v9, p2, Lh30/e;->d:Ljava/lang/String;

    iget-object v7, p0, Lcom/stripe/android/shoppay/ShopPayActivityContract;->a:Ljava/lang/String;

    invoke-direct/range {v2 .. v9}, Lh30/j;-><init>(Lv00/c0;Lh20/g3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p2, Landroid/content/Intent;

    const-class v0, Lcom/stripe/android/shoppay/ShopPayActivity;

    invoke-direct {p2, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p1, "shop_pay_args"

    invoke-virtual {p2, p1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p1

    const-string p2, "putExtra(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 1

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string p2, "com.stripe.android.shoppay.ShopPayActivityContract.extra_result"

    const-class v0, Lh30/i;

    invoke-static {p1, v0, p2}, Ldt/b;->u(Landroid/os/Bundle;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh30/i;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    new-instance p1, Lh30/h;

    new-instance p2, Ljava/lang/Throwable;

    const-string v0, "No result"

    invoke-direct {p2, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lh30/h;-><init>(Ljava/lang/Throwable;)V

    :cond_1
    return-object p1
.end method
