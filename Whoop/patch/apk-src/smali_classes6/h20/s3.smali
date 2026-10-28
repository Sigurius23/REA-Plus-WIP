.class public final synthetic Lh20/s3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/paymentsheet/PaymentSheetActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/PaymentSheetActivity;I)V
    .locals 0

    iput p2, p0, Lh20/s3;->w:I

    iput-object p1, p0, Lh20/s3;->x:Lcom/stripe/android/paymentsheet/PaymentSheetActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lh20/s3;->w:I

    iget-object v1, p0, Lh20/s3;->x:Lcom/stripe/android/paymentsheet/PaymentSheetActivity;

    packed-switch v0, :pswitch_data_0

    sget v0, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->z:I

    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "getIntent(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "com.stripe.android.paymentsheet.PaymentSheetContract.extra_args"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lh20/w3;

    return-object v0

    :pswitch_0
    iget-object v0, v1, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->w:La20/h;

    return-object v0

    :pswitch_1
    sget v0, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->z:I

    iget-object v0, v1, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->y:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh20/w3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
