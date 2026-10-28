.class public final Lcom/google/android/material/datepicker/j;
.super Lh5/b;
.source "SourceFile"


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lcom/google/android/material/datepicker/j;->d:I

    iput-object p1, p0, Lcom/google/android/material/datepicker/j;->e:Ljava/lang/Object;

    invoke-direct {p0}, Lh5/b;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    iget v0, p0, Lcom/google/android/material/datepicker/j;->d:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, Lh5/b;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void

    :pswitch_0
    invoke-super {p0, p1, p2}, Lh5/b;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/j;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/material/internal/CheckableImageButton;

    iget-boolean p1, p1, Lcom/google/android/material/internal/CheckableImageButton;->z:Z

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setChecked(Z)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Landroid/view/View;Li5/f;)V
    .locals 7

    iget v0, p0, Lcom/google/android/material/datepicker/j;->d:I

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/material/datepicker/j;->e:Ljava/lang/Object;

    iget-object v3, p0, Lh5/b;->a:Landroid/view/View$AccessibilityDelegate;

    packed-switch v0, :pswitch_data_0

    iget-object v0, p2, Li5/f;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v3, p1, v0}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    check-cast v2, Lcom/google/android/material/button/MaterialButtonToggleGroup;

    sget v0, Lcom/google/android/material/button/MaterialButtonToggleGroup;->K:I

    instance-of v0, p1, Lcom/google/android/material/button/MaterialButton;

    const/4 v3, 0x0

    const/4 v4, -0x1

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    move v0, v3

    move v5, v0

    :goto_0
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v6

    if-ge v0, v6, :cond_3

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    if-ne v6, p1, :cond_1

    move v4, v5

    goto :goto_1

    :cond_1
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    instance-of v6, v6, Lcom/google/android/material/button/MaterialButton;

    if-eqz v6, :cond_2

    invoke-virtual {v2, v0}, Lcom/google/android/material/button/MaterialButtonToggleGroup;->c(I)Z

    move-result v6

    if-eqz v6, :cond_2

    add-int/lit8 v5, v5, 0x1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    check-cast p1, Lcom/google/android/material/button/MaterialButton;

    iget-boolean p1, p1, Lcom/google/android/material/button/MaterialButton;->O:Z

    invoke-static {v3, v1, v4, v1, p1}, Laj/d;->s(IIIIZ)Laj/d;

    move-result-object p1

    invoke-virtual {p2, p1}, Li5/f;->j(Laj/d;)V

    return-void

    :pswitch_0
    iget-object v0, p2, Li5/f;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v3, p1, v0}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    const/high16 p1, 0x100000

    invoke-virtual {p2, p1}, Li5/f;->a(I)V

    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setDismissable(Z)V

    return-void

    :pswitch_1
    iget-object p2, p2, Li5/f;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v3, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    check-cast v2, Lcom/google/android/material/internal/NavigationMenuItemView;

    iget-boolean p1, v2, Lcom/google/android/material/internal/NavigationMenuItemView;->I:Z

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    return-void

    :pswitch_2
    iget-object p2, p2, Li5/f;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v3, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    check-cast v2, Lcom/google/android/material/internal/CheckableImageButton;

    iget-boolean p1, v2, Lcom/google/android/material/internal/CheckableImageButton;->E:Z

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    iget-boolean p1, v2, Lcom/google/android/material/internal/CheckableImageButton;->z:Z

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    return-void

    :pswitch_3
    iget-object p2, p2, Li5/f;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v3, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    check-cast v2, Lcom/google/android/material/datepicker/m;

    iget-object p1, v2, Lcom/google/android/material/datepicker/m;->L:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_4

    const p1, 0x7f1408fe

    invoke-virtual {v2, p1}, Landroidx/fragment/app/m0;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_4
    const p1, 0x7f1408fc

    invoke-virtual {v2, p1}, Landroidx/fragment/app/m0;->getString(I)Ljava/lang/String;

    move-result-object p1

    :goto_2
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setHintText(Ljava/lang/CharSequence;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public g(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 1

    iget v0, p0, Lcom/google/android/material/datepicker/j;->d:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2, p3}, Lh5/b;->g(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    return p1

    :pswitch_0
    const/high16 v0, 0x100000

    if-ne p2, v0, :cond_0

    iget-object p1, p0, Lcom/google/android/material/datepicker/j;->e:Ljava/lang/Object;

    check-cast p1, Lmr/l;

    check-cast p1, Lmr/n;

    const/4 p2, 0x3

    invoke-virtual {p1, p2}, Lmr/l;->a(I)V

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1, p2, p3}, Lh5/b;->g(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    :goto_0
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method
