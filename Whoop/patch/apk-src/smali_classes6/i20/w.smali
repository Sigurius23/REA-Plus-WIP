.class public final synthetic Li20/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;I)V
    .locals 0

    iput p2, p0, Li20/w;->w:I

    iput-object p1, p0, Li20/w;->x:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Li20/w;->w:I

    iget-object v1, p0, Li20/w;->x:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->x:Landroidx/lifecycle/y1;

    invoke-virtual {v0}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li20/v0;

    invoke-virtual {v0}, Li20/v0;->g()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    sget v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->y:I

    new-instance v0, La20/h;

    iget-object v1, v1, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->w:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li20/c0;

    if-eqz v1, :cond_0

    new-instance v2, Lhm/d;

    const/4 v3, 0x6

    invoke-direct {v2, v1, v3}, Lhm/d;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v0, v2, v3}, La20/h;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    sget v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->y:I

    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "getIntent(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "com.stripe.android.paymentsheet.addresselement.AutocompleteContract.extra_args"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Li20/c0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
