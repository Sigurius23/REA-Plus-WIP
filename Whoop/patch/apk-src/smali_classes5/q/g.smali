.class public final Lq/g;
.super Landroid/view/ActionMode;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lq/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lq/b;)V
    .locals 0

    invoke-direct {p0}, Landroid/view/ActionMode;-><init>()V

    iput-object p1, p0, Lq/g;->a:Landroid/content/Context;

    iput-object p2, p0, Lq/g;->b:Lq/b;

    return-void
.end method


# virtual methods
.method public final finish()V
    .locals 1

    iget-object v0, p0, Lq/g;->b:Lq/b;

    invoke-virtual {v0}, Lq/b;->c()V

    return-void
.end method

.method public final getCustomView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lq/g;->b:Lq/b;

    invoke-virtual {v0}, Lq/b;->d()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public final getMenu()Landroid/view/Menu;
    .locals 3

    new-instance v0, Lr/a0;

    iget-object v1, p0, Lq/g;->b:Lq/b;

    invoke-virtual {v1}, Lq/b;->e()Lr/l;

    move-result-object v1

    iget-object v2, p0, Lq/g;->a:Landroid/content/Context;

    invoke-direct {v0, v2, v1}, Lr/a0;-><init>(Landroid/content/Context;Lr/l;)V

    return-object v0
.end method

.method public final getMenuInflater()Landroid/view/MenuInflater;
    .locals 1

    iget-object v0, p0, Lq/g;->b:Lq/b;

    invoke-virtual {v0}, Lq/b;->f()Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lq/g;->b:Lq/b;

    invoke-virtual {v0}, Lq/b;->g()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final getTag()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lq/g;->b:Lq/b;

    iget-object v0, v0, Lq/b;->w:Ljava/lang/Object;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lq/g;->b:Lq/b;

    invoke-virtual {v0}, Lq/b;->h()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final getTitleOptionalHint()Z
    .locals 1

    iget-object v0, p0, Lq/g;->b:Lq/b;

    iget-boolean v0, v0, Lq/b;->x:Z

    return v0
.end method

.method public final invalidate()V
    .locals 1

    iget-object v0, p0, Lq/g;->b:Lq/b;

    invoke-virtual {v0}, Lq/b;->i()V

    return-void
.end method

.method public final isTitleOptional()Z
    .locals 1

    iget-object v0, p0, Lq/g;->b:Lq/b;

    invoke-virtual {v0}, Lq/b;->j()Z

    move-result v0

    return v0
.end method

.method public final setCustomView(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lq/g;->b:Lq/b;

    invoke-virtual {v0, p1}, Lq/b;->k(Landroid/view/View;)V

    return-void
.end method

.method public final setSubtitle(I)V
    .locals 1

    .line 2
    iget-object v0, p0, Lq/g;->b:Lq/b;

    invoke-virtual {v0, p1}, Lq/b;->l(I)V

    return-void
.end method

.method public final setSubtitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq/g;->b:Lq/b;

    invoke-virtual {v0, p1}, Lq/b;->m(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTag(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lq/g;->b:Lq/b;

    iput-object p1, v0, Lq/b;->w:Ljava/lang/Object;

    return-void
.end method

.method public final setTitle(I)V
    .locals 1

    .line 2
    iget-object v0, p0, Lq/g;->b:Lq/b;

    invoke-virtual {v0, p1}, Lq/b;->n(I)V

    return-void
.end method

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq/g;->b:Lq/b;

    invoke-virtual {v0, p1}, Lq/b;->o(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTitleOptionalHint(Z)V
    .locals 1

    iget-object v0, p0, Lq/g;->b:Lq/b;

    invoke-virtual {v0, p1}, Lq/b;->p(Z)V

    return-void
.end method
