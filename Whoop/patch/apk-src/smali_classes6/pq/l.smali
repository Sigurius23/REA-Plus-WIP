.class public Lpq/l;
.super Lm/d0;
.source "SourceFile"


# instance fields
.field private waitingForDismissAllowingStateLoss:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lm/d0;-><init>()V

    return-void
.end method

.method public static access$100(Lpq/l;)V
    .locals 1

    iget-boolean v0, p0, Lpq/l;->waitingForDismissAllowingStateLoss:Z

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroidx/fragment/app/y;->dismissAllowingStateLoss()V

    return-void

    :cond_0
    invoke-super {p0}, Landroidx/fragment/app/y;->dismiss()V

    return-void
.end method


# virtual methods
.method public dismiss()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lpq/l;->z(Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0}, Landroidx/fragment/app/y;->dismiss()V

    :cond_0
    return-void
.end method

.method public dismissAllowingStateLoss()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lpq/l;->z(Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0}, Landroidx/fragment/app/y;->dismissAllowingStateLoss()V

    :cond_0
    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2

    new-instance p1, Lpq/k;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/y;->getTheme()I

    move-result v1

    invoke-direct {p1, v0, v1}, Lpq/k;-><init>(Landroid/content/Context;I)V

    return-object p1
.end method

.method public final z(Z)Z
    .locals 3

    invoke-virtual {p0}, Landroidx/fragment/app/y;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    instance-of v1, v0, Lpq/k;

    if-eqz v1, :cond_3

    check-cast v0, Lpq/k;

    invoke-virtual {v0}, Lpq/k;->l()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object v1

    iget-boolean v2, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->I:Z

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Lpq/k;->m()Z

    move-result v0

    if-eqz v0, :cond_3

    iput-boolean p1, p0, Lpq/l;->waitingForDismissAllowingStateLoss:Z

    iget v0, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:I

    const/4 v2, 0x5

    if-ne v0, v2, :cond_1

    if-eqz p1, :cond_0

    invoke-super {p0}, Landroidx/fragment/app/y;->dismissAllowingStateLoss()V

    goto :goto_0

    :cond_0
    invoke-super {p0}, Landroidx/fragment/app/y;->dismiss()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/y;->getDialog()Landroid/app/Dialog;

    move-result-object p1

    instance-of p1, p1, Lpq/k;

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Landroidx/fragment/app/y;->getDialog()Landroid/app/Dialog;

    move-result-object p1

    check-cast p1, Lpq/k;

    invoke-virtual {p1}, Lpq/k;->n()V

    :cond_2
    new-instance p1, Lpq/i;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lpq/i;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->I(Lpq/c;)V

    invoke-virtual {v1, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->W(I)V

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method
