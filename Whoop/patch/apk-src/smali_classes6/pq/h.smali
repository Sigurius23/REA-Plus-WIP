.class public final Lpq/h;
.super Lh5/b;
.source "SourceFile"


# instance fields
.field public final synthetic d:Lpq/k;


# direct methods
.method public constructor <init>(Lpq/k;)V
    .locals 0

    iput-object p1, p0, Lpq/h;->d:Lpq/k;

    invoke-direct {p0}, Lh5/b;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Landroid/view/View;Li5/f;)V
    .locals 2

    iget-object v0, p2, Li5/f;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    iget-object v1, p0, Lh5/b;->a:Landroid/view/View$AccessibilityDelegate;

    invoke-virtual {v1, p1, v0}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    iget-object p1, p0, Lpq/h;->d:Lpq/k;

    iget-boolean p1, p1, Lpq/k;->K:Z

    if-eqz p1, :cond_0

    const/high16 p1, 0x100000

    invoke-virtual {p2, p1}, Li5/f;->a(I)V

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setDismissable(Z)V

    return-void

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setDismissable(Z)V

    return-void
.end method

.method public final g(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 2

    const/high16 v0, 0x100000

    if-ne p2, v0, :cond_0

    iget-object v0, p0, Lpq/h;->d:Lpq/k;

    iget-boolean v1, v0, Lpq/k;->K:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lpq/k;->cancel()V

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1, p2, p3}, Lh5/b;->g(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method
