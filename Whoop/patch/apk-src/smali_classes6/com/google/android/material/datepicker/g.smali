.class public final Lcom/google/android/material/datepicker/g;
.super Lh5/b;
.source "SourceFile"


# instance fields
.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/datepicker/g;->d:I

    invoke-direct {p0}, Lh5/b;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Landroid/view/View;Li5/f;)V
    .locals 2

    iget v0, p0, Lcom/google/android/material/datepicker/g;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lh5/b;->a:Landroid/view/View$AccessibilityDelegate;

    iget-object v1, p2, Li5/f;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1, v1}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Li5/f;->i(Lg9/b;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lh5/b;->a:Landroid/view/View$AccessibilityDelegate;

    iget-object v1, p2, Li5/f;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1, v1}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Li5/f;->k(Z)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lh5/b;->a:Landroid/view/View$AccessibilityDelegate;

    iget-object v1, p2, Li5/f;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1, v1}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Li5/f;->i(Lg9/b;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
