.class public final Lcom/stripe/android/link/NativeLinkActivityContract;
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
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/stripe/android/link/NativeLinkActivityContract;",
        "Lk/b;",
        "Lwz/k;",
        "Lwz/q;",
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

.field public final b:Lb10/d;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lb10/d;)V
    .locals 1

    const-string v0, "paymentElementCallbackIdentifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestSurface"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/NativeLinkActivityContract;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/link/NativeLinkActivityContract;->b:Lb10/d;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lwz/k;)Landroid/content/Intent;
    .locals 12

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
    sget v1, Lcom/stripe/android/link/LinkActivity;->E:I

    iget-object v3, p2, Lwz/k;->a:Lwz/g0;

    iget-object v4, p2, Lwz/k;->b:Lv00/c0;

    iget-object v7, v0, Lux/y;->x:Ljava/lang/String;

    iget-object v6, v0, Lux/y;->w:Ljava/lang/String;

    iget-object v8, p2, Lwz/k;->c:Lwz/h0;

    iget-object v11, p2, Lwz/k;->e:Lwz/n0;

    iget-object v9, p2, Lwz/k;->d:Lwz/d;

    new-instance v2, Lwz/g1;

    iget-object v5, p0, Lcom/stripe/android/link/NativeLinkActivityContract;->b:Lb10/d;

    iget-object v10, p0, Lcom/stripe/android/link/NativeLinkActivityContract;->a:Ljava/lang/String;

    invoke-direct/range {v2 .. v11}, Lwz/g1;-><init>(Lwz/g0;Lv00/c0;Lb10/d;Ljava/lang/String;Ljava/lang/String;Lwz/h0;Lwz/d;Ljava/lang/String;Lwz/n0;)V

    new-instance p2, Landroid/content/Intent;

    const-class v0, Lcom/stripe/android/link/LinkActivity;

    invoke-direct {p2, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p1, "native_link_args"

    invoke-virtual {p2, p1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p1

    const-string p2, "putExtra(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final b(ILandroid/content/Intent;)Lwz/q;
    .locals 2

    sget-object v0, Lwz/b;->w:Lwz/b;

    if-eqz p1, :cond_3

    const v1, 0x11f5b

    if-eq p1, v1, :cond_0

    new-instance p1, Lwz/m;

    invoke-direct {p1, v0}, Lwz/m;-><init>(Lwz/e;)V

    return-object p1

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string p2, "com.stripe.android.link.LinkActivityContract.extra_result"

    const-class v1, Lwz/q;

    invoke-static {p1, v1, p2}, Ldt/b;->u(Landroid/os/Bundle;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwz/q;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_2

    new-instance p1, Lwz/m;

    invoke-direct {p1, v0}, Lwz/m;-><init>(Lwz/e;)V

    :cond_2
    return-object p1

    :cond_3
    new-instance p1, Lwz/m;

    invoke-direct {p1, v0}, Lwz/m;-><init>(Lwz/e;)V

    return-object p1
.end method

.method public final bridge synthetic createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 0

    check-cast p2, Lwz/k;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/NativeLinkActivityContract;->a(Landroid/content/Context;Lwz/k;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/NativeLinkActivityContract;->b(ILandroid/content/Intent;)Lwz/q;

    move-result-object p1

    return-object p1
.end method
