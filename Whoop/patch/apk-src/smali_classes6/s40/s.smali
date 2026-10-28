.class public final Ls40/s;
.super Ls40/h1;
.source "SourceFile"


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;I)V
    .locals 0

    iput p2, p0, Ls40/s;->w:I

    iput-object p1, p0, Ls40/s;->x:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    iget p1, p0, Ls40/s;->w:I

    packed-switch p1, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object p1, p0, Ls40/s;->x:Landroid/view/View;

    check-cast p1, Lcom/stripe/android/view/CardMultilineWidget;

    sget-object v0, Lcom/stripe/android/view/CardMultilineWidget;->f0:[Lj93/z;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    iget p1, p0, Ls40/s;->w:I

    packed-switch p1, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object p1, p0, Ls40/s;->x:Landroid/view/View;

    check-cast p1, Lcom/stripe/android/view/StripeEditText;

    if-nez p4, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1, p2}, Lcom/stripe/android/view/StripeEditText;->setLastKeyDelete$payments_core_release(Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
