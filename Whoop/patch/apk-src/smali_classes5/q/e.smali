.class public final Lq/e;
.super Lq/b;
.source "SourceFile"

# interfaces
.implements Lr/j;


# instance fields
.field public final E:Lqg3/d;

.field public F:Ljava/lang/ref/WeakReference;

.field public G:Z

.field public final H:Lr/l;

.field public final y:Landroid/content/Context;

.field public final z:Landroidx/appcompat/widget/ActionBarContextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/appcompat/widget/ActionBarContextView;Lqg3/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/e;->y:Landroid/content/Context;

    iput-object p2, p0, Lq/e;->z:Landroidx/appcompat/widget/ActionBarContextView;

    iput-object p3, p0, Lq/e;->E:Lqg3/d;

    new-instance p1, Lr/l;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Lr/l;-><init>(Landroid/content/Context;)V

    const/4 p2, 0x1

    iput p2, p1, Lr/l;->m:I

    iput-object p1, p0, Lq/e;->H:Lr/l;

    iput-object p0, p1, Lr/l;->f:Lr/j;

    return-void
.end method


# virtual methods
.method public final a(Lr/l;Landroid/view/MenuItem;)Z
    .locals 0

    iget-object p1, p0, Lq/e;->E:Lqg3/d;

    iget-object p1, p1, Lqg3/d;->x:Ljava/lang/Object;

    check-cast p1, Lq/a;

    invoke-interface {p1, p0, p2}, Lq/a;->o(Lq/b;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public final b(Lr/l;)V
    .locals 0

    invoke-virtual {p0}, Lq/e;->i()V

    iget-object p1, p0, Lq/e;->z:Landroidx/appcompat/widget/ActionBarContextView;

    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarContextView;->z:Ls/h;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ls/h;->l()Z

    :cond_0
    return-void
.end method

.method public final c()V
    .locals 1

    iget-boolean v0, p0, Lq/e;->G:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lq/e;->G:Z

    iget-object v0, p0, Lq/e;->E:Lqg3/d;

    invoke-virtual {v0, p0}, Lqg3/d;->D(Lq/b;)V

    return-void
.end method

.method public final d()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lq/e;->F:Ljava/lang/ref/WeakReference;

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

    iget-object v0, p0, Lq/e;->H:Lr/l;

    return-object v0
.end method

.method public final f()Landroid/view/MenuInflater;
    .locals 2

    new-instance v0, Lq/j;

    iget-object v1, p0, Lq/e;->z:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lq/j;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final g()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lq/e;->z:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final h()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lq/e;->z:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final i()V
    .locals 2

    iget-object v0, p0, Lq/e;->E:Lqg3/d;

    iget-object v1, p0, Lq/e;->H:Lr/l;

    invoke-virtual {v0, p0, v1}, Lqg3/d;->z(Lq/b;Landroid/view/Menu;)Z

    return-void
.end method

.method public final j()Z
    .locals 1

    iget-object v0, p0, Lq/e;->z:Landroidx/appcompat/widget/ActionBarContextView;

    iget-boolean v0, v0, Landroidx/appcompat/widget/ActionBarContextView;->S:Z

    return v0
.end method

.method public final k(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lq/e;->z:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setCustomView(Landroid/view/View;)V

    if-eqz p1, :cond_0

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lq/e;->F:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public final l(I)V
    .locals 1

    iget-object v0, p0, Lq/e;->y:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lq/e;->m(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final m(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lq/e;->z:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setSubtitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final n(I)V
    .locals 1

    iget-object v0, p0, Lq/e;->y:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lq/e;->o(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final o(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lq/e;->z:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final p(Z)V
    .locals 1

    iput-boolean p1, p0, Lq/b;->x:Z

    iget-object v0, p0, Lq/e;->z:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitleOptional(Z)V

    return-void
.end method
