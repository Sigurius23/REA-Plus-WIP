.class public final synthetic Ld20/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;I)V
    .locals 0

    iput p2, p0, Ld20/j;->w:I

    iput-object p1, p0, Ld20/j;->x:Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Ld20/j;->w:I

    const/4 v1, 0x0

    iget-object v2, p0, Ld20/j;->x:Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;

    packed-switch v0, :pswitch_data_0

    sget v0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;->z:I

    iget-object v0, v2, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;->x:Ld20/l;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "args"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    sget v0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;->z:I

    invoke-virtual {v2}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f0d0636

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    check-cast v0, Landroidx/fragment/app/FragmentContainerView;

    new-instance v1, Liz/a;

    invoke-direct {v1, v0}, Liz/a;-><init>(Landroidx/fragment/app/FragmentContainerView;)V

    return-object v1

    :cond_1
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "rootView"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    iget-object v0, v2, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;->y:La20/h;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
