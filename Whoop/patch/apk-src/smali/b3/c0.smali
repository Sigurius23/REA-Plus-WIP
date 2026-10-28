.class public final Lb3/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lb3/c0;->w:I

    iput-object p1, p0, Lb3/c0;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method private final b(Landroid/view/View;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 2

    iget v0, p0, Lb3/c0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb3/c0;->x:Ljava/lang/Object;

    check-cast v0, Li2/f;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iget-boolean v1, v0, Li2/f;->d:Z

    if-nez v1, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iget-object v1, v0, Li2/f;->e:Li2/e;

    invoke-virtual {p1, v1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    const/4 p1, 0x1

    iput-boolean p1, v0, Li2/f;->d:Z

    :cond_0
    :pswitch_0
    return-void

    :pswitch_1
    iget-object p1, p0, Lb3/c0;->x:Ljava/lang/Object;

    check-cast p1, Lb3/h0;

    iget-object v0, p1, Lb3/h0;->g:Landroid/view/accessibility/AccessibilityManager;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityManager;->getEnabledAccessibilityServiceList(I)Ljava/util/List;

    move-result-object v1

    iput-object v1, p1, Lb3/h0;->k:Ljava/util/List;

    iget-object v1, p1, Lb3/h0;->i:Lb3/a0;

    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityManager;->addAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z

    iget-object p1, p1, Lb3/h0;->j:Lb3/b0;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityManager;->addTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 4

    iget v0, p0, Lb3/c0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb3/c0;->x:Ljava/lang/Object;

    check-cast v0, Li2/f;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iget-boolean v1, v0, Li2/f;->d:Z

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iget-object v1, v0, Li2/f;->e:Li2/e;

    invoke-virtual {p1, v1}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    const/4 p1, 0x0

    iput-boolean p1, v0, Li2/f;->d:Z

    :cond_0
    return-void

    :pswitch_0
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object p1, p0, Lb3/c0;->x:Ljava/lang/Object;

    check-cast p1, Lbc3/c2;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-void

    :pswitch_1
    iget-object p1, p0, Lb3/c0;->x:Ljava/lang/Object;

    check-cast p1, Lb3/a;

    invoke-static {p1}, Lx30/s0;->q(Landroid/view/View;)Lxb3/i;

    move-result-object v0

    invoke-interface {v0}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/ViewParent;

    instance-of v3, v1, Landroid/view/View;

    if-eqz v3, :cond_1

    check-cast v1, Landroid/view/View;

    const-string v3, "<this>"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x7f0a07c5

    invoke-virtual {v1, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Ljava/lang/Boolean;

    if-eqz v3, :cond_2

    check-cast v1, Ljava/lang/Boolean;

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :cond_3
    if-eqz v2, :cond_1

    const/4 v2, 0x1

    :cond_4
    if-nez v2, :cond_5

    invoke-virtual {p1}, Lb3/a;->d()V

    :cond_5
    return-void

    :pswitch_2
    iget-object p1, p0, Lb3/c0;->x:Ljava/lang/Object;

    check-cast p1, Lb3/h0;

    iget-object v0, p1, Lb3/h0;->l:Landroid/os/Handler;

    iget-object v1, p1, Lb3/h0;->N:Landroidx/lifecycle/z0;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p1, Lb3/h0;->g:Landroid/view/accessibility/AccessibilityManager;

    iget-object v1, p1, Lb3/h0;->i:Lb3/a0;

    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityManager;->removeAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z

    iget-object p1, p1, Lb3/h0;->j:Lb3/b0;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
