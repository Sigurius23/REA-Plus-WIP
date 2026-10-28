.class public final synthetic Ls40/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/view/PaymentAuthWebViewActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/view/PaymentAuthWebViewActivity;I)V
    .locals 0

    iput p2, p0, Ls40/p0;->w:I

    iput-object p1, p0, Ls40/p0;->x:Lcom/stripe/android/view/PaymentAuthWebViewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Ls40/p0;->w:I

    iget-object v1, p0, Ls40/p0;->x:Lcom/stripe/android/view/PaymentAuthWebViewActivity;

    packed-switch v0, :pswitch_data_0

    sget v0, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->E:I

    new-instance v0, Ls40/r0;

    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v2

    const-string v3, "getApplication(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->p()Lqy/d;

    move-result-object v3

    iget-object v1, v1, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->x:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lyx/b;

    if-eqz v1, :cond_0

    invoke-direct {v0, v2, v3, v1}, Ls40/r0;-><init>(Landroid/app/Application;Lqy/d;Lyx/b;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    sget v0, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->E:I

    iget-object v0, v1, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->x:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyx/b;

    if-eqz v0, :cond_1

    iget-boolean v0, v0, Lyx/b;->F:Z

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    sget-object v0, Lqy/e;->a:Lqy/d;

    goto :goto_0

    :cond_1
    sget-object v0, Lqy/e;->b:Lqy/d;

    :goto_0
    return-object v0

    :pswitch_1
    sget v0, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->E:I

    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "getIntent(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "extra_args"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lyx/b;

    return-object v0

    :pswitch_2
    sget v0, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->E:I

    invoke-virtual {v1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-static {v0}, Liz/d;->a(Landroid/view/LayoutInflater;)Liz/d;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
