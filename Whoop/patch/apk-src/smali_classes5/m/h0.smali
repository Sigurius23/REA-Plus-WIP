.class public final Lm/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls/q2;
.implements Lr/j;


# instance fields
.field public final synthetic w:Lm/i0;


# direct methods
.method public synthetic constructor <init>(Lm/i0;)V
    .locals 0

    iput-object p1, p0, Lm/h0;->w:Lm/i0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lr/l;Landroid/view/MenuItem;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public b(Lr/l;)V
    .locals 4

    iget-object v0, p0, Lm/h0;->w:Lm/i0;

    iget-object v1, v0, Lm/i0;->b:Landroid/view/Window$Callback;

    iget-object v0, v0, Lm/i0;->a:Ls/t2;

    iget-object v0, v0, Ls/t2;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->x()Z

    move-result v0

    const/16 v2, 0x6c

    if-eqz v0, :cond_0

    invoke-interface {v1, v2, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    const/4 v3, 0x0

    invoke-interface {v1, v0, v3, p1}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1, v2, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_1
    return-void
.end method

.method public c(I)Landroid/view/View;
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, Landroid/view/View;

    iget-object v0, p0, Lm/h0;->w:Lm/i0;

    iget-object v0, v0, Lm/i0;->a:Ls/t2;

    iget-object v0, v0, Ls/t2;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public d(I)V
    .locals 2

    if-nez p1, :cond_0

    iget-object p1, p0, Lm/h0;->w:Lm/i0;

    iget-boolean v0, p1, Lm/i0;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p1, Lm/i0;->a:Ls/t2;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ls/t2;->l:Z

    iput-boolean v1, p1, Lm/i0;->d:Z

    :cond_0
    return-void
.end method
