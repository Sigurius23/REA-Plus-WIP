.class public final Lm/m0;
.super Lq/b;
.source "SourceFile"

# interfaces
.implements Lr/j;


# instance fields
.field public E:Lqg3/d;

.field public F:Ljava/lang/ref/WeakReference;

.field public final synthetic G:Lm/n0;

.field public final y:Landroid/content/Context;

.field public final z:Lr/l;


# direct methods
.method public constructor <init>(Lm/n0;Landroid/content/Context;Lqg3/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm/m0;->G:Lm/n0;

    iput-object p2, p0, Lm/m0;->y:Landroid/content/Context;

    iput-object p3, p0, Lm/m0;->E:Lqg3/d;

    new-instance p1, Lr/l;

    invoke-direct {p1, p2}, Lr/l;-><init>(Landroid/content/Context;)V

    const/4 p2, 0x1

    iput p2, p1, Lr/l;->m:I

    iput-object p1, p0, Lm/m0;->z:Lr/l;

    iput-object p0, p1, Lr/l;->f:Lr/j;

    return-void
.end method


# virtual methods
.method public final a(Lr/l;Landroid/view/MenuItem;)Z
    .locals 0

    iget-object p1, p0, Lm/m0;->E:Lqg3/d;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lqg3/d;->x:Ljava/lang/Object;

    check-cast p1, Lq/a;

    invoke-interface {p1, p0, p2}, Lq/a;->o(Lq/b;Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Lr/l;)V
    .locals 0

    iget-object p1, p0, Lm/m0;->E:Lqg3/d;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lm/m0;->i()V

    iget-object p1, p0, Lm/m0;->G:Lm/n0;

    iget-object p1, p1, Lm/n0;->f:Landroidx/appcompat/widget/ActionBarContextView;

    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarContextView;->z:Ls/h;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ls/h;->l()Z

    :cond_1
    :goto_0
    return-void
.end method

.method public final c()V
    .locals 4

    iget-object v0, p0, Lm/m0;->G:Lm/n0;

    iget-object v1, v0, Lm/n0;->i:Lm/m0;

    if-eq v1, p0, :cond_0

    return-void

    :cond_0
    iget-boolean v1, v0, Lm/n0;->p:Z

    if-eqz v1, :cond_1

    iput-object p0, v0, Lm/n0;->j:Lm/m0;

    iget-object v1, p0, Lm/m0;->E:Lqg3/d;

    iput-object v1, v0, Lm/n0;->k:Lqg3/d;

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lm/m0;->E:Lqg3/d;

    invoke-virtual {v1, p0}, Lqg3/d;->D(Lq/b;)V

    :goto_0
    const/4 v1, 0x0

    iput-object v1, p0, Lm/m0;->E:Lqg3/d;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lm/n0;->z(Z)V

    iget-object v2, v0, Lm/n0;->f:Landroidx/appcompat/widget/ActionBarContextView;

    iget-object v3, v2, Landroidx/appcompat/widget/ActionBarContextView;->K:Landroid/view/View;

    if-nez v3, :cond_2

    invoke-virtual {v2}, Landroidx/appcompat/widget/ActionBarContextView;->e()V

    :cond_2
    iget-object v2, v0, Lm/n0;->c:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    iget-boolean v3, v0, Lm/n0;->u:Z

    invoke-virtual {v2, v3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    iput-object v1, v0, Lm/n0;->i:Lm/m0;

    return-void
.end method

.method public final d()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lm/m0;->F:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final e()Lr/l;
    .locals 1

    iget-object v0, p0, Lm/m0;->z:Lr/l;

    return-object v0
.end method

.method public final f()Landroid/view/MenuInflater;
    .locals 2

    new-instance v0, Lq/j;

    iget-object v1, p0, Lm/m0;->y:Landroid/content/Context;

    invoke-direct {v0, v1}, Lq/j;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final g()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lm/m0;->G:Lm/n0;

    iget-object v0, v0, Lm/n0;->f:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final h()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lm/m0;->G:Lm/n0;

    iget-object v0, v0, Lm/n0;->f:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final i()V
    .locals 2

    iget-object v0, p0, Lm/m0;->G:Lm/n0;

    iget-object v0, v0, Lm/n0;->i:Lm/m0;

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lm/m0;->z:Lr/l;

    invoke-virtual {v0}, Lr/l;->z()V

    :try_start_0
    iget-object v1, p0, Lm/m0;->E:Lqg3/d;

    invoke-virtual {v1, p0, v0}, Lqg3/d;->z(Lq/b;Landroid/view/Menu;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lr/l;->y()V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Lr/l;->y()V

    throw v1
.end method

.method public final j()Z
    .locals 1

    iget-object v0, p0, Lm/m0;->G:Lm/n0;

    iget-object v0, v0, Lm/n0;->f:Landroidx/appcompat/widget/ActionBarContextView;

    iget-boolean v0, v0, Landroidx/appcompat/widget/ActionBarContextView;->S:Z

    return v0
.end method

.method public final k(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lm/m0;->G:Lm/n0;

    iget-object v0, v0, Lm/n0;->f:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setCustomView(Landroid/view/View;)V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lm/m0;->F:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public final l(I)V
    .locals 1

    iget-object v0, p0, Lm/m0;->G:Lm/n0;

    iget-object v0, v0, Lm/n0;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm/m0;->m(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final m(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lm/m0;->G:Lm/n0;

    iget-object v0, v0, Lm/n0;->f:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setSubtitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final n(I)V
    .locals 1

    iget-object v0, p0, Lm/m0;->G:Lm/n0;

    iget-object v0, v0, Lm/n0;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm/m0;->o(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final o(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lm/m0;->G:Lm/n0;

    iget-object v0, v0, Lm/n0;->f:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final p(Z)V
    .locals 1

    iput-boolean p1, p0, Lq/b;->x:Z

    iget-object v0, p0, Lm/m0;->G:Lm/n0;

    iget-object v0, v0, Lm/n0;->f:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitleOptional(Z)V

    return-void
.end method
