.class public final synthetic Lg20/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;I)V
    .locals 0

    iput p2, p0, Lg20/e;->w:I

    iput-object p1, p0, Lg20/e;->x:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lg20/e;->w:I

    iget-object v1, p0, Lg20/e;->x:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->x:La20/h;

    return-object v0

    :pswitch_0
    sget v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->z:I

    iget-object v0, v1, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->w:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg20/l;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    sget v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->z:I

    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "getIntent(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "extra_args"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lg20/l;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
