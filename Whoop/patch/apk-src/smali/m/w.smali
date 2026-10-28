.class public final Lm/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Window$Callback;


# instance fields
.field public E:Z

.field public final synthetic F:Lm/a0;

.field public final w:Landroid/view/Window$Callback;

.field public x:Lm/h0;

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Lm/a0;Landroid/view/Window$Callback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm/w;->F:Lm/a0;

    if-eqz p2, :cond_0

    iput-object p2, p0, Lm/w;->w:Landroid/view/Window$Callback;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Window callback may not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(Landroid/view/Window$Callback;)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v0, p0, Lm/w;->y:Z

    invoke-interface {p1}, Landroid/view/Window$Callback;->onContentChanged()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v1, p0, Lm/w;->y:Z

    return-void

    :catchall_0
    move-exception p1

    iput-boolean v1, p0, Lm/w;->y:Z

    throw p1
.end method

.method public final b(ILandroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Lm/w;->w:Landroid/view/Window$Callback;

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public final c(ILandroid/view/Menu;)V
    .locals 1

    iget-object v0, p0, Lm/w;->w:Landroid/view/Window$Callback;

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    return-void
.end method

.method public final d(Ljava/util/List;Landroid/view/Menu;I)V
    .locals 1

    iget-object v0, p0, Lm/w;->w:Landroid/view/Window$Callback;

    invoke-static {v0, p1, p2, p3}, Lq/n;->a(Landroid/view/Window$Callback;Ljava/util/List;Landroid/view/Menu;I)V

    return-void
.end method

.method public final dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lm/w;->w:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    iget-boolean v0, p0, Lm/w;->z:Z

    iget-object v1, p0, Lm/w;->w:Landroid/view/Window$Callback;

    if-eqz v0, :cond_0

    invoke-interface {v1, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Lm/w;->F:Lm/a0;

    invoke-virtual {v0, p1}, Lm/a0;->z(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-interface {v1, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z
    .locals 5

    iget-object v0, p0, Lm/w;->w:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_3

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    iget-object v2, p0, Lm/w;->F:Lm/a0;

    invoke-virtual {v2}, Lm/a0;->E()V

    iget-object v3, v2, Lm/a0;->O:Lm/b;

    if-eqz v3, :cond_0

    invoke-virtual {v3, v0, p1}, Lm/b;->i(ILandroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, v2, Lm/a0;->m0:Lm/z;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v3

    invoke-virtual {v2, v0, v3, p1}, Lm/a0;->J(Lm/z;ILandroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, v2, Lm/a0;->m0:Lm/z;

    if-eqz p1, :cond_3

    iput-boolean v1, p1, Lm/z;->l:Z

    return v1

    :cond_1
    iget-object v0, v2, Lm/a0;->m0:Lm/z;

    const/4 v3, 0x0

    if-nez v0, :cond_2

    invoke-virtual {v2, v3}, Lm/a0;->D(I)Lm/z;

    move-result-object v0

    invoke-virtual {v2, v0, p1}, Lm/a0;->K(Lm/z;Landroid/view/KeyEvent;)Z

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v4

    invoke-virtual {v2, v0, v4, p1}, Lm/a0;->J(Lm/z;ILandroid/view/KeyEvent;)Z

    move-result p1

    iput-boolean v3, v0, Lm/z;->k:Z

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    return v3

    :cond_3
    :goto_0
    return v1
.end method

.method public final dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    iget-object v0, p0, Lm/w;->w:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lm/w;->w:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final dispatchTrackballEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lm/w;->w:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchTrackballEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final onActionModeFinished(Landroid/view/ActionMode;)V
    .locals 1

    iget-object v0, p0, Lm/w;->w:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onActionModeFinished(Landroid/view/ActionMode;)V

    return-void
.end method

.method public final onActionModeStarted(Landroid/view/ActionMode;)V
    .locals 1

    iget-object v0, p0, Lm/w;->w:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onActionModeStarted(Landroid/view/ActionMode;)V

    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 1

    iget-object v0, p0, Lm/w;->w:Landroid/view/Window$Callback;

    invoke-interface {v0}, Landroid/view/Window$Callback;->onAttachedToWindow()V

    return-void
.end method

.method public final onContentChanged()V
    .locals 1

    iget-boolean v0, p0, Lm/w;->y:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm/w;->w:Landroid/view/Window$Callback;

    invoke-interface {v0}, Landroid/view/Window$Callback;->onContentChanged()V

    :cond_0
    return-void
.end method

.method public final onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 1

    if-nez p1, :cond_0

    instance-of v0, p2, Lr/l;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lm/w;->w:Landroid/view/Window$Callback;

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public final onCreatePanelView(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lm/w;->x:Lm/h0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lm/h0;->c(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lm/w;->w:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    iget-object v0, p0, Lm/w;->w:Landroid/view/Window$Callback;

    invoke-interface {v0}, Landroid/view/Window$Callback;->onDetachedFromWindow()V

    return-void
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Lm/w;->w:Landroid/view/Window$Callback;

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public final onMenuOpened(ILandroid/view/Menu;)Z
    .locals 2

    invoke-virtual {p0, p1, p2}, Lm/w;->b(ILandroid/view/Menu;)Z

    const/16 p2, 0x6c

    const/4 v0, 0x1

    iget-object v1, p0, Lm/w;->F:Lm/a0;

    if-ne p1, p2, :cond_0

    invoke-virtual {v1}, Lm/a0;->E()V

    iget-object p1, v1, Lm/a0;->O:Lm/b;

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Lm/b;->c(Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1
    :goto_0
    return v0
.end method

.method public final onPanelClosed(ILandroid/view/Menu;)V
    .locals 2

    iget-boolean v0, p0, Lm/w;->E:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm/w;->w:Landroid/view/Window$Callback;

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2}, Lm/w;->c(ILandroid/view/Menu;)V

    const/16 p2, 0x6c

    iget-object v0, p0, Lm/w;->F:Lm/a0;

    const/4 v1, 0x0

    if-ne p1, p2, :cond_1

    invoke-virtual {v0}, Lm/a0;->E()V

    iget-object p1, v0, Lm/a0;->O:Lm/b;

    if-eqz p1, :cond_2

    invoke-virtual {p1, v1}, Lm/b;->c(Z)V

    return-void

    :cond_1
    if-nez p1, :cond_2

    invoke-virtual {v0, p1}, Lm/a0;->D(I)Lm/z;

    move-result-object p1

    iget-boolean p2, p1, Lm/z;->m:Z

    if-eqz p2, :cond_2

    invoke-virtual {v0, p1, v1}, Lm/a0;->x(Lm/z;Z)V

    :cond_2
    return-void
.end method

.method public final onPointerCaptureChanged(Z)V
    .locals 1

    iget-object v0, p0, Lm/w;->w:Landroid/view/Window$Callback;

    invoke-static {v0, p1}, Lq/o;->a(Landroid/view/Window$Callback;Z)V

    return-void
.end method

.method public final onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 3

    instance-of v0, p3, Lr/l;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lr/l;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    if-nez v0, :cond_1

    return v1

    :cond_1
    if-eqz v0, :cond_2

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lr/l;->x(Z)V

    :cond_2
    iget-object v2, p0, Lm/w;->x:Lm/h0;

    if-eqz v2, :cond_3

    invoke-virtual {v2, p1}, Lm/h0;->d(I)V

    :cond_3
    iget-object v2, p0, Lm/w;->w:Landroid/view/Window$Callback;

    invoke-interface {v2, p1, p2, p3}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result p1

    if-eqz v0, :cond_4

    invoke-virtual {v0, v1}, Lr/l;->x(Z)V

    :cond_4
    return p1
.end method

.method public final onProvideKeyboardShortcuts(Ljava/util/List;Landroid/view/Menu;I)V
    .locals 2

    iget-object v0, p0, Lm/w;->F:Lm/a0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lm/a0;->D(I)Lm/z;

    move-result-object v0

    iget-object v0, v0, Lm/z;->h:Lr/l;

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, v0, p3}, Lm/w;->d(Ljava/util/List;Landroid/view/Menu;I)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lm/w;->d(Ljava/util/List;Landroid/view/Menu;I)V

    return-void
.end method

.method public final onSearchRequested()Z
    .locals 1

    .line 2
    iget-object v0, p0, Lm/w;->w:Landroid/view/Window$Callback;

    invoke-interface {v0}, Landroid/view/Window$Callback;->onSearchRequested()Z

    move-result v0

    return v0
.end method

.method public final onSearchRequested(Landroid/view/SearchEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lm/w;->w:Landroid/view/Window$Callback;

    invoke-static {v0, p1}, Lq/m;->a(Landroid/view/Window$Callback;Landroid/view/SearchEvent;)Z

    move-result p1

    return p1
.end method

.method public final onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V
    .locals 1

    iget-object v0, p0, Lm/w;->w:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V

    return-void
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 1

    iget-object v0, p0, Lm/w;->w:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onWindowFocusChanged(Z)V

    return-void
.end method

.method public final onWindowStartingActionMode(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
    .locals 0

    .line 5
    const/4 p1, 0x0

    return-object p1
.end method

.method public final onWindowStartingActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;
    .locals 2

    if-eqz p2, :cond_0

    .line 1
    iget-object v0, p0, Lm/w;->w:Landroid/view/Window$Callback;

    invoke-static {v0, p1, p2}, Lq/m;->b(Landroid/view/Window$Callback;Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1

    .line 2
    :cond_0
    new-instance p2, Lq/f;

    iget-object v0, p0, Lm/w;->F:Lm/a0;

    iget-object v1, v0, Lm/a0;->K:Landroid/content/Context;

    invoke-direct {p2, v1, p1}, Lq/f;-><init>(Landroid/content/Context;Landroid/view/ActionMode$Callback;)V

    .line 3
    invoke-virtual {v0, p2}, Lm/a0;->q(Lq/a;)Lq/b;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p2, p1}, Lq/f;->t0(Lq/b;)Lq/g;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
