.class public final Lh5/a;
.super Landroid/view/View$AccessibilityDelegate;
.source "SourceFile"


# instance fields
.field public final a:Lh5/b;


# direct methods
.method public constructor <init>(Lh5/b;)V
    .locals 0

    invoke-direct {p0}, Landroid/view/View$AccessibilityDelegate;-><init>()V

    iput-object p1, p0, Lh5/a;->a:Lh5/b;

    return-void
.end method


# virtual methods
.method public final dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    iget-object v0, p0, Lh5/a;->a:Lh5/b;

    invoke-virtual {v0, p1, p2}, Lh5/b;->a(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public final getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;
    .locals 1

    iget-object v0, p0, Lh5/a;->a:Lh5/b;

    invoke-virtual {v0, p1}, Lh5/b;->b(Landroid/view/View;)Lad3/z;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p1, Lad3/z;->x:Ljava/lang/Object;

    check-cast p1, Landroid/view/accessibility/AccessibilityNodeProvider;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    iget-object v0, p0, Lh5/a;->a:Lh5/b;

    invoke-virtual {v0, p1, p2}, Lh5/b;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 5

    new-instance v0, Li5/f;

    invoke-direct {v0, p2}, Li5/f;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    sget-object v1, Lh5/p0;->a:Ljava/util/WeakHashMap;

    new-instance v1, Lh5/d0;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lh5/d0;-><init>(I)V

    invoke-virtual {v1, p1}, Lh5/d0;->a(Landroid/view/View;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScreenReaderFocusable(Z)V

    new-instance v1, Lh5/d0;

    const/4 v4, 0x3

    invoke-direct {v1, v4}, Lh5/d0;-><init>(I)V

    invoke-virtual {v1, p1}, Lh5/d0;->a(Landroid/view/View;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    invoke-virtual {p2, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setHeading(Z)V

    invoke-static {p1}, Lh5/p0;->d(Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPaneTitle(Ljava/lang/CharSequence;)V

    new-instance v1, Lh5/d0;

    const/4 v3, 0x2

    invoke-direct {v1, v3}, Lh5/d0;-><init>(I)V

    invoke-virtual {v1, p1}, Lh5/d0;->a(Landroid/view/View;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1e

    if-lt v3, v4, :cond_2

    invoke-static {p2, v1}, Le3/c;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    const-string v4, "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"

    invoke-virtual {v3, v4, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    :goto_2
    iget-object v1, p0, Lh5/a;->a:Lh5/b;

    invoke-virtual {v1, p1, v0}, Lh5/b;->d(Landroid/view/View;Li5/f;)V

    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    const p2, 0x7f0a0c2d

    invoke-virtual {p1, p2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_3

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    :cond_3
    :goto_3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    if-ge v2, p2, :cond_4

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Li5/d;

    invoke-virtual {v0, p2}, Li5/f;->b(Li5/d;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_4
    return-void
.end method

.method public final onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    iget-object v0, p0, Lh5/a;->a:Lh5/b;

    invoke-virtual {v0, p1, p2}, Lh5/b;->e(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public final onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    iget-object v0, p0, Lh5/a;->a:Lh5/b;

    invoke-virtual {v0, p1, p2, p3}, Lh5/b;->f(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public final performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 1

    iget-object v0, p0, Lh5/a;->a:Lh5/b;

    invoke-virtual {v0, p1, p2, p3}, Lh5/b;->g(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public final sendAccessibilityEvent(Landroid/view/View;I)V
    .locals 1

    iget-object v0, p0, Lh5/a;->a:Lh5/b;

    invoke-virtual {v0, p1, p2}, Lh5/b;->h(Landroid/view/View;I)V

    return-void
.end method

.method public final sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    iget-object v0, p0, Lh5/a;->a:Lh5/b;

    invoke-virtual {v0, p1, p2}, Lh5/b;->i(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method
