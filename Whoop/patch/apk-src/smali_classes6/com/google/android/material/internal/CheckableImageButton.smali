.class public Lcom/google/android/material/internal/CheckableImageButton;
.super Landroidx/appcompat/widget/AppCompatImageButton;
.source "SourceFile"

# interfaces
.implements Landroid/widget/Checkable;


# static fields
.field public static final G:[I


# instance fields
.field public E:Z

.field public F:Z

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const v0, 0x10100a0

    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Lcom/google/android/material/internal/CheckableImageButton;->G:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f0402c3

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/AppCompatImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/material/internal/CheckableImageButton;->E:Z

    iput-boolean p1, p0, Lcom/google/android/material/internal/CheckableImageButton;->F:Z

    new-instance p1, Lcom/google/android/material/datepicker/j;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lcom/google/android/material/datepicker/j;-><init>(Ljava/lang/Object;I)V

    invoke-static {p0, p1}, Lh5/p0;->n(Landroid/view/View;Lh5/b;)V

    return-void
.end method


# virtual methods
.method public final isChecked()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/material/internal/CheckableImageButton;->z:Z

    return v0
.end method

.method public final onCreateDrawableState(I)[I
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/material/internal/CheckableImageButton;->z:Z

    if-eqz v0, :cond_0

    add-int/lit8 p1, p1, 0x1

    invoke-super {p0, p1}, Landroid/view/View;->onCreateDrawableState(I)[I

    move-result-object p1

    sget-object v0, Lcom/google/android/material/internal/CheckableImageButton;->G:[I

    invoke-static {p1, v0}, Landroid/view/View;->mergeDrawableStates([I[I)[I

    move-result-object p1

    return-object p1

    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onCreateDrawableState(I)[I

    move-result-object p1

    return-object p1
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    instance-of v0, p1, Lcr/a;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_0
    check-cast p1, Lcr/a;

    invoke-virtual {p1}, Lv5/b;->b()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget-boolean p1, p1, Lcr/a;->y:Z

    invoke-virtual {p0, p1}, Lcom/google/android/material/internal/CheckableImageButton;->setChecked(Z)V

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Lcr/a;

    invoke-direct {v1, v0}, Lv5/b;-><init>(Landroid/os/Parcelable;)V

    iget-boolean v0, p0, Lcom/google/android/material/internal/CheckableImageButton;->z:Z

    iput-boolean v0, v1, Lcr/a;->y:Z

    return-object v1
.end method

.method public setCheckable(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/material/internal/CheckableImageButton;->E:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lcom/google/android/material/internal/CheckableImageButton;->E:Z

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    :cond_0
    return-void
.end method

.method public setChecked(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/material/internal/CheckableImageButton;->E:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/material/internal/CheckableImageButton;->z:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lcom/google/android/material/internal/CheckableImageButton;->z:Z

    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    const/16 p1, 0x800

    invoke-virtual {p0, p1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    :cond_0
    return-void
.end method

.method public setPressable(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/material/internal/CheckableImageButton;->F:Z

    return-void
.end method

.method public setPressed(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/material/internal/CheckableImageButton;->F:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->setPressed(Z)V

    :cond_0
    return-void
.end method

.method public final toggle()V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/material/internal/CheckableImageButton;->z:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/material/internal/CheckableImageButton;->setChecked(Z)V

    return-void
.end method
