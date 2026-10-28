.class public final Loq/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Loq/a;->w:I

    iput-object p1, p0, Loq/a;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    iget p2, p0, Loq/a;->w:I

    packed-switch p2, :pswitch_data_0

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    iget-object p1, p0, Loq/a;->x:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/view/CardNumberTextInputLayout;

    iget-object p2, p1, Lcom/stripe/android/view/CardNumberTextInputLayout;->e1:Ls40/a0;

    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p3

    instance-of p4, p3, Landroid/view/ViewGroup;

    if-eqz p4, :cond_0

    check-cast p3, Landroid/view/ViewGroup;

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    if-eqz p3, :cond_1

    invoke-virtual {p3, p2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1
    new-instance p3, Lh5/r0;

    invoke-direct {p3, p1}, Lh5/r0;-><init>(Landroid/view/ViewGroup;)V

    invoke-virtual {p3}, Lh5/r0;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_3

    invoke-virtual {p3}, Lh5/r0;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/widget/FrameLayout;

    invoke-virtual {p3, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p4

    if-eqz p4, :cond_2

    check-cast p4, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    move-result p3

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p5

    const p6, 0x7f070550

    invoke-virtual {p5, p6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p5

    sub-int/2addr p3, p5

    invoke-virtual {p4, p3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p3, 0x7f070551

    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    iput p1, p4, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    invoke-virtual {p2, p4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/util/NoSuchElementException;

    const-string p2, "Sequence is empty."

    invoke-direct {p1, p2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    const/4 p1, 0x0

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
