.class public final synthetic Ls40/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field public final synthetic w:Lcom/stripe/android/view/StripeEditText;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/view/StripeEditText;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls40/c1;->w:Lcom/stripe/android/view/StripeEditText;

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    sget p1, Lcom/stripe/android/view/StripeEditText;->U:I

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 p3, 0x0

    if-nez p1, :cond_1

    const/16 p1, 0x43

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, p3

    :goto_0
    iget-object p2, p0, Ls40/c1;->w:Lcom/stripe/android/view/StripeEditText;

    iput-boolean p1, p2, Lcom/stripe/android/view/StripeEditText;->H:Z

    if-eqz p1, :cond_1

    invoke-virtual {p2}, Landroid/widget/TextView;->length()I

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p2, Lcom/stripe/android/view/StripeEditText;->J:Ls40/e1;

    if-eqz p1, :cond_1

    check-cast p1, Lq30/u0;

    invoke-virtual {p1}, Lq30/u0;->E()V

    :cond_1
    return p3
.end method
