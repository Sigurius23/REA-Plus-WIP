.class public final synthetic La20/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;I)V
    .locals 0

    iput p2, p0, La20/a;->w:I

    iput-object p1, p0, La20/a;->x:Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, La20/a;->w:I

    iget-object v1, p0, La20/a;->x:Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;

    packed-switch v0, :pswitch_data_0

    sget v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->z:I

    iget-object v0, v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->w:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz10/e;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    sget v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->z:I

    new-instance v0, La20/h;

    new-instance v2, La20/a;

    const/4 v3, 0x2

    invoke-direct {v2, v1, v3}, La20/a;-><init>(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;I)V

    const/4 v1, 0x0

    invoke-direct {v0, v2, v1}, La20/h;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :pswitch_1
    sget v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->z:I

    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "getIntent(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_args"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lz10/e;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
