.class public Lm/c0;
.super Lg/m;
.source "SourceFile"

# interfaces
.implements Lm/n;


# instance fields
.field private final E:Lh5/j;

.field private z:Lm/q;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 4

    const/4 v0, 0x1

    const v1, 0x7f0401d3

    if-nez p2, :cond_0

    new-instance v2, Landroid/util/TypedValue;

    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    invoke-virtual {v3, v1, v2, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v2, v2, Landroid/util/TypedValue;->resourceId:I

    goto :goto_0

    :cond_0
    move v2, p2

    :goto_0
    invoke-direct {p0, p1, v2}, Lg/m;-><init>(Landroid/content/Context;I)V

    new-instance v2, Lm/b0;

    invoke-direct {v2, p0}, Lm/b0;-><init>(Lm/c0;)V

    iput-object v2, p0, Lm/c0;->E:Lh5/j;

    invoke-virtual {p0}, Lm/c0;->c()Lm/q;

    move-result-object v2

    if-nez p2, :cond_1

    new-instance p2, Landroid/util/TypedValue;

    invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    invoke-virtual {p1, v1, p2, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget p2, p2, Landroid/util/TypedValue;->resourceId:I

    :cond_1
    move-object p1, v2

    check-cast p1, Lm/a0;

    iput p2, p1, Lm/a0;->t0:I

    invoke-virtual {v2}, Lm/q;->i()V

    return-void
.end method


# virtual methods
.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 3

    invoke-virtual {p0}, Lm/c0;->c()Lm/q;

    move-result-object v0

    check-cast v0, Lm/a0;

    invoke-virtual {v0}, Lm/a0;->B()V

    iget-object v1, v0, Lm/a0;->a0:Landroid/view/ViewGroup;

    const v2, 0x1020002

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, v0, Lm/a0;->M:Lm/w;

    iget-object p2, v0, Lm/a0;->L:Landroid/view/Window;

    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object p2

    invoke-virtual {p1, p2}, Lm/w;->a(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public c()Lm/q;
    .locals 3

    iget-object v0, p0, Lm/c0;->z:Lm/q;

    if-nez v0, :cond_0

    sget-object v0, Lm/q;->w:Landroidx/room/u1;

    new-instance v0, Lm/a0;

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-direct {v0, v1, v2, p0, p0}, Lm/a0;-><init>(Landroid/content/Context;Landroid/view/Window;Lm/n;Ljava/lang/Object;)V

    iput-object v0, p0, Lm/c0;->z:Lm/q;

    :cond_0
    iget-object v0, p0, Lm/c0;->z:Lm/q;

    return-object v0
.end method

.method public final d()V
    .locals 1

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/lifecycle/o1;->n(Landroid/view/View;Landroidx/lifecycle/g0;)V

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, Lts/o;->G(Landroid/view/View;Lpb/f;)V

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/room/c1;->M(Landroid/view/View;Lg/b0;)V

    return-void
.end method

.method public dismiss()V
    .locals 1

    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    invoke-virtual {p0}, Lm/c0;->c()Lm/q;

    move-result-object v0

    invoke-virtual {v0}, Lm/q;->j()V

    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    iget-object v0, p0, Lm/c0;->E:Lh5/j;

    invoke-static {v0, p1}, Lvd/f;->p(Lh5/j;Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public e(Landroid/view/KeyEvent;)Z
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Dialog;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public f(I)Z
    .locals 1

    invoke-virtual {p0}, Lm/c0;->c()Lm/q;

    move-result-object v0

    invoke-virtual {v0, p1}, Lm/q;->l(I)Z

    move-result p1

    return p1
.end method

.method public findViewById(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lm/c0;->c()Lm/q;

    move-result-object v0

    check-cast v0, Lm/a0;

    invoke-virtual {v0}, Lm/a0;->B()V

    iget-object v0, v0, Lm/a0;->L:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public invalidateOptionsMenu()V
    .locals 1

    invoke-virtual {p0}, Lm/c0;->c()Lm/q;

    move-result-object v0

    invoke-virtual {v0}, Lm/q;->g()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-virtual {p0}, Lm/c0;->c()Lm/q;

    move-result-object v0

    invoke-virtual {v0}, Lm/q;->f()V

    invoke-super {p0, p1}, Lg/m;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lm/c0;->c()Lm/q;

    move-result-object p1

    invoke-virtual {p1}, Lm/q;->i()V

    return-void
.end method

.method public onStop()V
    .locals 2

    invoke-super {p0}, Lg/m;->onStop()V

    invoke-virtual {p0}, Lm/c0;->c()Lm/q;

    move-result-object v0

    check-cast v0, Lm/a0;

    invoke-virtual {v0}, Lm/a0;->E()V

    iget-object v0, v0, Lm/a0;->O:Lm/b;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lm/b;->u(Z)V

    :cond_0
    return-void
.end method

.method public onSupportActionModeFinished(Lq/b;)V
    .locals 0

    return-void
.end method

.method public onSupportActionModeStarted(Lq/b;)V
    .locals 0

    return-void
.end method

.method public onWindowStartingSupportActionMode(Lq/a;)Lq/b;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public setContentView(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm/c0;->d()V

    .line 2
    invoke-virtual {p0}, Lm/c0;->c()Lm/q;

    move-result-object v0

    invoke-virtual {v0, p1}, Lm/q;->m(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Lm/c0;->d()V

    .line 4
    invoke-virtual {p0}, Lm/c0;->c()Lm/q;

    move-result-object v0

    invoke-virtual {v0, p1}, Lm/q;->n(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 5
    invoke-virtual {p0}, Lm/c0;->d()V

    .line 6
    invoke-virtual {p0}, Lm/c0;->c()Lm/q;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lm/q;->o(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setTitle(I)V
    .locals 2

    .line 3
    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(I)V

    .line 4
    invoke-virtual {p0}, Lm/c0;->c()Lm/q;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lm/q;->p(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 2
    invoke-virtual {p0}, Lm/c0;->c()Lm/q;

    move-result-object v0

    invoke-virtual {v0, p1}, Lm/q;->p(Ljava/lang/CharSequence;)V

    return-void
.end method
