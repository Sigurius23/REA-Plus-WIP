.class public final Landroidx/recyclerview/widget/p2;
.super Lh5/b;
.source "SourceFile"


# instance fields
.field public final d:Landroidx/recyclerview/widget/q2;

.field public final e:Ljava/util/WeakHashMap;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/q2;)V
    .locals 1

    invoke-direct {p0}, Lh5/b;-><init>()V

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/p2;->e:Ljava/util/WeakHashMap;

    iput-object p1, p0, Landroidx/recyclerview/widget/p2;->d:Landroidx/recyclerview/widget/q2;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/p2;->e:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh5/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lh5/b;->a(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Lh5/b;->a:Landroid/view/View$AccessibilityDelegate;

    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public final b(Landroid/view/View;)Lad3/z;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/p2;->e:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh5/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lh5/b;->b(Landroid/view/View;)Lad3/z;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-super {p0, p1}, Lh5/b;->b(Landroid/view/View;)Lad3/z;

    move-result-object p1

    return-object p1
.end method

.method public final c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/p2;->e:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh5/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lh5/b;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void

    :cond_0
    invoke-super {p0, p1, p2}, Lh5/b;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public final d(Landroid/view/View;Li5/f;)V
    .locals 4

    iget-object v0, p2, Li5/f;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    iget-object v1, p0, Landroidx/recyclerview/widget/p2;->d:Landroidx/recyclerview/widget/q2;

    iget-object v2, v1, Landroidx/recyclerview/widget/q2;->d:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/q2;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->hasPendingAdapterUpdates()Z

    move-result v2

    iget-object v3, p0, Lh5/b;->a:Landroid/view/View$AccessibilityDelegate;

    if-nez v2, :cond_1

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/u1;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/u1;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Landroidx/recyclerview/widget/u1;->onInitializeAccessibilityNodeInfoForItem(Landroid/view/View;Li5/f;)V

    iget-object v1, p0, Landroidx/recyclerview/widget/p2;->e:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh5/b;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1, p2}, Lh5/b;->d(Landroid/view/View;Li5/f;)V

    return-void

    :cond_0
    invoke-virtual {v3, p1, v0}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    return-void

    :cond_1
    invoke-virtual {v3, p1, v0}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    return-void
.end method

.method public final e(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/p2;->e:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh5/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lh5/b;->e(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void

    :cond_0
    invoke-super {p0, p1, p2}, Lh5/b;->e(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public final f(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/p2;->e:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh5/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Lh5/b;->f(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Lh5/b;->a:Landroid/view/View$AccessibilityDelegate;

    invoke-virtual {v0, p1, p2, p3}, Landroid/view/View$AccessibilityDelegate;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public final g(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/p2;->d:Landroidx/recyclerview/widget/q2;

    iget-object v1, v0, Landroidx/recyclerview/widget/q2;->d:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/q2;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->hasPendingAdapterUpdates()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/u1;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroidx/recyclerview/widget/p2;->e:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh5/b;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1, p2, p3}, Lh5/b;->g(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1, p2, p3}, Lh5/b;->g(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result v1

    if-eqz v1, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/u1;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Landroidx/recyclerview/widget/u1;->performAccessibilityActionForItem(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    return p1

    :cond_2
    invoke-super {p0, p1, p2, p3}, Lh5/b;->g(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public final h(Landroid/view/View;I)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/p2;->e:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh5/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lh5/b;->h(Landroid/view/View;I)V

    return-void

    :cond_0
    invoke-super {p0, p1, p2}, Lh5/b;->h(Landroid/view/View;I)V

    return-void
.end method

.method public final i(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/p2;->e:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh5/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lh5/b;->i(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void

    :cond_0
    invoke-super {p0, p1, p2}, Lh5/b;->i(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method
