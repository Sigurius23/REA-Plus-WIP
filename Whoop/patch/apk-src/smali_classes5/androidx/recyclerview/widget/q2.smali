.class public final Landroidx/recyclerview/widget/q2;
.super Lh5/b;
.source "SourceFile"


# instance fields
.field public final d:Landroidx/recyclerview/widget/RecyclerView;

.field public final e:Landroidx/recyclerview/widget/p2;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    invoke-direct {p0}, Lh5/b;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/q2;->d:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p1, p0, Landroidx/recyclerview/widget/q2;->e:Landroidx/recyclerview/widget/p2;

    if-eqz p1, :cond_0

    iput-object p1, p0, Landroidx/recyclerview/widget/q2;->e:Landroidx/recyclerview/widget/p2;

    return-void

    :cond_0
    new-instance p1, Landroidx/recyclerview/widget/p2;

    invoke-direct {p1, p0}, Landroidx/recyclerview/widget/p2;-><init>(Landroidx/recyclerview/widget/q2;)V

    iput-object p1, p0, Landroidx/recyclerview/widget/q2;->e:Landroidx/recyclerview/widget/p2;

    return-void
.end method


# virtual methods
.method public final c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    invoke-super {p0, p1, p2}, Lh5/b;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    instance-of v0, p1, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/q2;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->hasPendingAdapterUpdates()Z

    move-result v0

    if-nez v0, :cond_0

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/u1;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/u1;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/u1;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    :cond_0
    return-void
.end method

.method public final d(Landroid/view/View;Li5/f;)V
    .locals 2

    iget-object v0, p0, Lh5/b;->a:Landroid/view/View$AccessibilityDelegate;

    iget-object v1, p2, Li5/f;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1, v1}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    iget-object p1, p0, Landroidx/recyclerview/widget/q2;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->hasPendingAdapterUpdates()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/u1;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/u1;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/u1;->onInitializeAccessibilityNodeInfo(Li5/f;)V

    :cond_0
    return-void
.end method

.method public final g(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 1

    invoke-super {p0, p1, p2, p3}, Lh5/b;->g(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    iget-object p1, p0, Landroidx/recyclerview/widget/q2;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->hasPendingAdapterUpdates()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/u1;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/u1;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Landroidx/recyclerview/widget/u1;->performAccessibilityAction(ILandroid/os/Bundle;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
