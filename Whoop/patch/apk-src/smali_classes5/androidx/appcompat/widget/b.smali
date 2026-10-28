.class public final Landroidx/appcompat/widget/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/x;


# instance fields
.field public w:Lr/l;

.field public x:Lr/n;

.field public final synthetic y:Landroidx/appcompat/widget/Toolbar;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/Toolbar;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/appcompat/widget/b;->y:Landroidx/appcompat/widget/Toolbar;

    return-void
.end method


# virtual methods
.method public final b(Lr/n;)Z
    .locals 4

    iget-object v0, p0, Landroidx/appcompat/widget/b;->y:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->g()V

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->H:Landroid/widget/ImageButton;

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eq v1, v0, :cond_1

    instance-of v2, v1, Landroid/view/ViewGroup;

    if-eqz v2, :cond_0

    check-cast v1, Landroid/view/ViewGroup;

    iget-object v2, v0, Landroidx/appcompat/widget/Toolbar;->H:Landroid/widget/ImageButton;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->H:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_1
    invoke-virtual {p1}, Lr/n;->getActionView()Landroid/view/View;

    move-result-object v1

    iput-object v1, v0, Landroidx/appcompat/widget/Toolbar;->I:Landroid/view/View;

    iput-object p1, p0, Landroidx/appcompat/widget/b;->x:Lr/n;

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eq v1, v0, :cond_3

    instance-of v2, v1, Landroid/view/ViewGroup;

    if-eqz v2, :cond_2

    check-cast v1, Landroid/view/ViewGroup;

    iget-object v2, v0, Landroidx/appcompat/widget/Toolbar;->I:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_2
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->l()Ls/p2;

    move-result-object v1

    iget v2, v0, Landroidx/appcompat/widget/Toolbar;->N:I

    and-int/lit8 v2, v2, 0x70

    const v3, 0x800003

    or-int/2addr v2, v3

    iput v2, v1, Lm/a;->a:I

    const/4 v2, 0x2

    iput v2, v1, Ls/p2;->b:I

    iget-object v2, v0, Landroidx/appcompat/widget/Toolbar;->I:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->I:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_3
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->C()V

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    const/4 v1, 0x1

    iput-boolean v1, p1, Lr/n;->D:Z

    iget-object p1, p1, Lr/n;->o:Lr/l;

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Lr/l;->q(Z)V

    iget-object p1, v0, Landroidx/appcompat/widget/Toolbar;->I:Landroid/view/View;

    instance-of v2, p1, Lq/c;

    if-eqz v2, :cond_4

    check-cast p1, Lq/c;

    check-cast p1, Lr/p;

    iget-object p1, p1, Lr/p;->w:Landroid/view/CollapsibleActionView;

    invoke-interface {p1}, Landroid/view/CollapsibleActionView;->onActionViewExpanded()V

    :cond_4
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->K()V

    return v1
.end method

.method public final d()V
    .locals 4

    iget-object v0, p0, Landroidx/appcompat/widget/b;->x:Lr/n;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/appcompat/widget/b;->w:Lr/l;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lr/l;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Landroidx/appcompat/widget/b;->w:Lr/l;

    invoke-virtual {v2, v1}, Lr/l;->getItem(I)Landroid/view/MenuItem;

    move-result-object v2

    iget-object v3, p0, Landroidx/appcompat/widget/b;->x:Lr/n;

    if-ne v2, v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/widget/b;->x:Lr/n;

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/b;->e(Lr/n;)Z

    :cond_2
    :goto_1
    return-void
.end method

.method public final e(Lr/n;)Z
    .locals 3

    iget-object v0, p0, Landroidx/appcompat/widget/b;->y:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->I:Landroid/view/View;

    instance-of v2, v1, Lq/c;

    if-eqz v2, :cond_0

    check-cast v1, Lq/c;

    check-cast v1, Lr/p;

    iget-object v1, v1, Lr/p;->w:Landroid/view/CollapsibleActionView;

    invoke-interface {v1}, Landroid/view/CollapsibleActionView;->onActionViewCollapsed()V

    :cond_0
    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->I:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->H:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/appcompat/widget/Toolbar;->I:Landroid/view/View;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->a()V

    iput-object v1, p0, Landroidx/appcompat/widget/b;->x:Lr/n;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    const/4 v1, 0x0

    iput-boolean v1, p1, Lr/n;->D:Z

    iget-object p1, p1, Lr/n;->o:Lr/l;

    invoke-virtual {p1, v1}, Lr/l;->q(Z)V

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->K()V

    const/4 p1, 0x1

    return p1
.end method

.method public final f(Landroid/content/Context;Lr/l;)V
    .locals 1

    iget-object p1, p0, Landroidx/appcompat/widget/b;->w:Lr/l;

    if-eqz p1, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/b;->x:Lr/n;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Lr/l;->e(Lr/n;)Z

    :cond_0
    iput-object p2, p0, Landroidx/appcompat/widget/b;->w:Lr/l;

    return-void
.end method

.method public final g(Lr/l;Z)V
    .locals 0

    return-void
.end method

.method public final i()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final j(Lr/d0;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
