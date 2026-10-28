.class public final synthetic Ls40/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/stripe/android/view/CardMultilineWidget;


# direct methods
.method public synthetic constructor <init>(ILcom/stripe/android/view/CardMultilineWidget;)V
    .locals 0

    iput p1, p0, Ls40/o;->a:I

    iput-object p2, p0, Ls40/o;->b:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 2

    iget p1, p0, Ls40/o;->a:I

    iget-object v0, p0, Ls40/o;->b:Lcom/stripe/android/view/CardMultilineWidget;

    packed-switch p1, :pswitch_data_0

    iget-boolean p1, v0, Lcom/stripe/android/view/CardMultilineWidget;->w:Z

    return-void

    :pswitch_0
    iget-object p1, v0, Lcom/stripe/android/view/CardMultilineWidget;->y:Lcom/stripe/android/view/CardBrandView;

    if-eqz p2, :cond_1

    iget-boolean p2, v0, Lcom/stripe/android/view/CardMultilineWidget;->a0:Z

    if-nez p2, :cond_2

    invoke-virtual {v0}, Lcom/stripe/android/view/CardMultilineWidget;->getBrand()Ly00/i;

    move-result-object p2

    iget-object v1, v0, Lcom/stripe/android/view/CardMultilineWidget;->E:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ly00/i;->d(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean p2, v0, Lcom/stripe/android/view/CardMultilineWidget;->V:Z

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/CardBrandView;->setShouldShowErrorIcon(Z)V

    goto :goto_0

    :cond_1
    iget-boolean p2, v0, Lcom/stripe/android/view/CardMultilineWidget;->V:Z

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/CardBrandView;->setShouldShowErrorIcon(Z)V

    :cond_2
    :goto_0
    return-void

    :pswitch_1
    sget-object p1, Lcom/stripe/android/view/CardMultilineWidget;->f0:[Lj93/z;

    if-eqz p2, :cond_3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_3
    return-void

    :pswitch_2
    sget-object p1, Lcom/stripe/android/view/CardMultilineWidget;->f0:[Lj93/z;

    if-eqz p2, :cond_4

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
