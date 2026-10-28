.class public final Lcom/google/android/material/textfield/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic w:Lcom/google/android/material/textfield/q;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/textfield/o;->w:Lcom/google/android/material/textfield/q;

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcom/google/android/material/textfield/o;->w:Lcom/google/android/material/textfield/q;

    iget-object v0, p1, Lcom/google/android/material/textfield/q;->T:Landroid/view/accessibility/AccessibilityManager;

    iget-object v1, p1, Lcom/google/android/material/textfield/q;->U:Lcom/google/android/material/textfield/k;

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    sget-object v1, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p1, Lcom/google/android/material/textfield/q;->U:Lcom/google/android/material/textfield/k;

    new-instance v1, Li5/b;

    invoke-direct {v1, p1}, Li5/b;-><init>(Lcom/google/android/material/textfield/k;)V

    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityManager;->addTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    :cond_0
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcom/google/android/material/textfield/o;->w:Lcom/google/android/material/textfield/q;

    iget-object v0, p1, Lcom/google/android/material/textfield/q;->U:Lcom/google/android/material/textfield/k;

    if-eqz v0, :cond_0

    iget-object p1, p1, Lcom/google/android/material/textfield/q;->T:Landroid/view/accessibility/AccessibilityManager;

    if-eqz p1, :cond_0

    new-instance v1, Li5/b;

    invoke-direct {v1, v0}, Li5/b;-><init>(Lcom/google/android/material/textfield/k;)V

    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    :cond_0
    return-void
.end method
