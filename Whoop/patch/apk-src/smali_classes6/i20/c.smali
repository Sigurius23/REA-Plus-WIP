.class public final synthetic Li20/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;I)V
    .locals 0

    iput p2, p0, Li20/c;->w:I

    iput-object p1, p0, Li20/c;->x:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Li20/c;->w:I

    iget-object v1, p0, Li20/c;->x:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->x:Landroidx/lifecycle/y1;

    invoke-virtual {v0}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li20/p;

    iget-object v0, v0, Li20/p;->w:Li20/k1;

    iget-object v1, v0, Li20/k1;->a:Leb/u0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Leb/a0;->z()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Li20/l1;->k(Li20/k1;)V

    :cond_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    sget v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->z:I

    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "getIntent(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract.extra_args"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Li20/h;

    return-object v0

    :pswitch_1
    iget-object v0, v1, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->w:Li20/o;

    return-object v0

    :pswitch_2
    sget v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->z:I

    iget-object v0, v1, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->y:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li20/h;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_3
    sget v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->z:I

    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    const-string v1, "getApplication(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
