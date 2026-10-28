.class public final Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity;
.super Lm/m;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity;",
        "Lm/m;",
        "<init>",
        "()V",
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
.field public w:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lm/m;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Landroidx/fragment/app/r0;->onCreate(Landroid/os/Bundle;)V

    if-eqz p1, :cond_0

    const-string v0, "has_confirm_started"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity;->w:Z

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v0, "extra_custom_method_type"

    const-class v1, Lh20/y1;

    invoke-static {p1, v1, v0}, Ldt/b;->u(Landroid/os/Bundle;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh20/y1;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "payment_element_identifier"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz p1, :cond_2

    const-string v2, "extra_payment_method_billing_details"

    const-class v3, Ly00/v3;

    invoke-static {p1, v3, v2}, Ldt/b;->u(Landroid/os/Bundle;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly00/v3;

    :cond_2
    if-eqz v0, :cond_3

    iget-boolean p1, p0, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity;->w:Z

    if-nez p1, :cond_3

    if-eqz v1, :cond_3

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity;->w:Z

    invoke-static {v1}, Ld10/a;->a(Ljava/lang/String;)Ld10/b;

    :cond_3
    return-void
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 1

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lg/l;->onNewIntent(Landroid/content/Intent;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    return-void
.end method

.method public final onResume()V
    .locals 4

    invoke-super {p0}, Landroidx/fragment/app/r0;->onResume()V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    const-string v1, "extra_custom_method_type"

    const-class v2, Lh20/y1;

    invoke-static {v0, v2, v1}, Ldt/b;->u(Landroid/os/Bundle;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh20/y1;

    const-string v2, "custom_payment_method_result"

    const-class v3, Lc10/m;

    invoke-static {v0, v3, v2}, Ldt/b;->u(Landroid/os/Bundle;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc10/m;

    if-nez v1, :cond_1

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_1
    if-eqz v0, :cond_5

    instance-of v1, v0, Lc10/k;

    if-eqz v1, :cond_2

    sget-object v0, Li10/e;->w:Li10/e;

    goto :goto_0

    :cond_2
    instance-of v1, v0, Lc10/j;

    if-eqz v1, :cond_3

    sget-object v0, Li10/d;->w:Li10/d;

    goto :goto_0

    :cond_3
    instance-of v1, v0, Lc10/l;

    if-eqz v1, :cond_4

    new-instance v1, Li10/f;

    new-instance v2, Lcom/stripe/android/core/exception/LocalStripeException;

    check-cast v0, Lc10/l;

    iget-object v0, v0, Lc10/l;->w:Ljava/lang/String;

    const-string v3, "customPaymentMethodFailure"

    invoke-direct {v2, v0, v3}, Lcom/stripe/android/core/exception/LocalStripeException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Li10/f;-><init>(Ljava/lang/Throwable;)V

    move-object v0, v1

    :goto_0
    new-instance v1, Ll83/k;

    const-string v2, "CUSTOM_PAYMENT_METHOD_RESULT"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_4
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_5
    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "outState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "has_confirm_started"

    iget-boolean v1, p0, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity;->w:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-super {p0, p1}, Lg/l;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method
