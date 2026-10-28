.class public final synthetic Ls40/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/view/CardMultilineWidget;


# direct methods
.method public synthetic constructor <init>(ILcom/stripe/android/view/CardMultilineWidget;)V
    .locals 0

    iput p1, p0, Ls40/n;->w:I

    iput-object p2, p0, Ls40/n;->x:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget v0, p0, Ls40/n;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ls40/n;->x:Lcom/stripe/android/view/CardMultilineWidget;

    iget-object v0, v0, Lcom/stripe/android/view/CardMultilineWidget;->z:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    return-void

    :pswitch_0
    iget-object v0, p0, Ls40/n;->x:Lcom/stripe/android/view/CardMultilineWidget;

    iget-object v0, v0, Lcom/stripe/android/view/CardMultilineWidget;->F:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    return-void

    :pswitch_1
    iget-object v0, p0, Ls40/n;->x:Lcom/stripe/android/view/CardMultilineWidget;

    iget-object v0, v0, Lcom/stripe/android/view/CardMultilineWidget;->E:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
