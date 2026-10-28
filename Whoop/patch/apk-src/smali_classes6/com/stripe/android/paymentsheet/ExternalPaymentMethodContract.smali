.class public final Lcom/stripe/android/paymentsheet/ExternalPaymentMethodContract;
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
        "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodContract;",
        "Lk/b;",
        "Lh20/m;",
        "Lg20/v;",
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
.field public final a:Lb20/f;


# direct methods
.method public constructor <init>(Lb20/f;)V
    .locals 1

    const-string v0, "errorReporter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodContract;->a:Lb20/f;

    return-void
.end method


# virtual methods
.method public final createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 2

    check-cast p2, Lh20/m;

    const-string v0, "input"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-class v1, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodProxyActivity;

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    move-result-object p1

    const-string v0, "external_payment_method_type"

    iget-object v1, p2, Lh20/m;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    const-string v0, "payment_element_identifier"

    iget-object v1, p2, Lh20/m;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    const-string v0, "external_payment_method_billing_details"

    iget-object p2, p2, Lh20/m;->c:Ly00/v3;

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p1

    const-string p2, "putExtra(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 3

    const/4 v0, -0x1

    if-eq p1, v0, :cond_3

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_0

    sget-object p2, Lb20/e;->V:Lb20/e;

    const-string v0, "result_code"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    const/4 v0, 0x2

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodContract;->a:Lb20/f;

    invoke-static {v2, p2, v1, p1, v0}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    new-instance p1, Lg20/u;

    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid result code returned by external payment method activity"

    invoke-direct {p2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lg20/u;-><init>(Ljava/lang/Throwable;)V

    return-object p1

    :cond_0
    new-instance p1, Lg20/u;

    new-instance v0, Lcom/stripe/android/core/exception/LocalStripeException;

    if-eqz p2, :cond_1

    const-string v1, "external_payment_method_error_message"

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_1
    const-string p2, "externalPaymentMethodFailure"

    invoke-direct {v0, v1, p2}, Lcom/stripe/android/core/exception/LocalStripeException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lg20/u;-><init>(Ljava/lang/Throwable;)V

    return-object p1

    :cond_2
    sget-object p1, Lg20/s;->w:Lg20/s;

    return-object p1

    :cond_3
    sget-object p1, Lg20/t;->w:Lg20/t;

    return-object p1
.end method
