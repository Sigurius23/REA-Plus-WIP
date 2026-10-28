.class public final synthetic Lb30/u5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;I)V
    .locals 0

    iput p2, p0, Lb30/u5;->w:I

    iput-object p1, p0, Lb30/u5;->x:Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lb30/u5;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb30/u5;->x:Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "extra_activity_result"

    sget-object v2, Lb30/y5;->w:Lb30/y5;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "putExtra(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, -0x1

    iget-object v2, p0, Lb30/u5;->x:Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;

    invoke-virtual {v2, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {v2}, Landroid/app/Activity;->finish()V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
