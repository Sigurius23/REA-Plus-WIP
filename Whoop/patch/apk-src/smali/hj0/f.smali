.class public abstract Lhj0/f;
.super Lm/m;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private E:Z

.field private final F:Lz82/b;

.field private final G:Lz82/e;

.field private final H:Lhj0/e;

.field private final w:Lcom/whoop/ui/l;

.field private final x:Lcom/whoop/ui/l;

.field private y:Lcom/whoop/ui/WhoopToolbar;

.field private z:Lcom/whoop/ui/ProgressBar;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lm/m;-><init>()V

    new-instance v0, Lcom/whoop/ui/l;

    invoke-direct {v0}, Lcom/whoop/ui/l;-><init>()V

    iput-object v0, p0, Lhj0/f;->w:Lcom/whoop/ui/l;

    new-instance v0, Lcom/whoop/ui/l;

    invoke-direct {v0}, Lcom/whoop/ui/l;-><init>()V

    iput-object v0, p0, Lhj0/f;->x:Lcom/whoop/ui/l;

    const-class v0, Lz82/b;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz82/b;

    iput-object v0, p0, Lhj0/f;->F:Lz82/b;

    invoke-interface {v0}, Lz82/b;->l()Lz82/e;

    move-result-object v0

    iput-object v0, p0, Lhj0/f;->G:Lz82/e;

    const-class v0, Lhj0/e;

    invoke-static {v0, v1, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhj0/e;

    iput-object v0, p0, Lhj0/f;->H:Lhj0/e;

    return-void
.end method

.method public static y(Landroid/content/Intent;)V
    .locals 2

    const-string v0, "BaseTransitionType"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public A(Lcom/whoop/ui/WhoopToolbar;)V
    .locals 0

    iput-object p1, p0, Lhj0/f;->y:Lcom/whoop/ui/WhoopToolbar;

    invoke-virtual {p0, p1}, Lm/m;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    return-void
.end method

.method public B()V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x500

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    return-void
.end method

.method public finish()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->finish()V

    invoke-virtual {p0}, Lhj0/f;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Lnf1/a;->q:I

    sget v1, Lnf1/a;->p:I

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    :cond_0
    invoke-virtual {p0}, Lhj0/f;->x()Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lnf1/a;->s:I

    sget v1, Lnf1/a;->r:I

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    :cond_1
    return-void
.end method

.method public o(Lxg3/t;)V
    .locals 1

    iget-object v0, p0, Lhj0/f;->w:Lcom/whoop/ui/l;

    invoke-virtual {v0, p1}, Lcom/whoop/ui/l;->a(Lxg3/t;)V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/r0;->onActivityResult(IILandroid/content/Intent;)V

    invoke-virtual {p0}, Lhj0/f;->v()Landroidx/fragment/app/o1;

    move-result-object v0

    iget-object v0, v0, Landroidx/fragment/app/o1;->c:Landroidx/fragment/app/a2;

    invoke-virtual {v0}, Landroidx/fragment/app/a2;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/m0;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1, p2, p3}, Landroidx/fragment/app/m0;->onActivityResult(IILandroid/content/Intent;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public onContentChanged()V
    .locals 4

    invoke-super {p0}, Lm/m;->onContentChanged()V

    sget v0, Lnf1/d;->k:I

    invoke-virtual {p0, v0}, Lm/m;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whoop/ui/WhoopToolbar;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Lhj0/f;->A(Lcom/whoop/ui/WhoopToolbar;)V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    instance-of v3, v2, Landroid/widget/TextView;

    if-eqz v3, :cond_0

    check-cast v2, Landroid/widget/TextView;

    sget v3, Lvu1/d;->a:I

    invoke-static {v2, v3}, Lin2/j;->a(Landroid/widget/TextView;I)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    sget v0, Lnf1/d;->n:I

    invoke-virtual {p0, v0}, Lm/m;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whoop/ui/ProgressBar;

    iput-object v0, p0, Lhj0/f;->z:Lcom/whoop/ui/ProgressBar;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/whoop/ui/ProgressBar;->a()V

    :cond_2
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/r0;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lm/m;->onDestroy()V

    iget-object v0, p0, Lhj0/f;->w:Lcom/whoop/ui/l;

    invoke-virtual {v0}, Lcom/whoop/ui/l;->b()V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    iget-boolean v0, p0, Lhj0/f;->E:Z

    if-eqz v0, :cond_0

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lhj0/f;->finish()V

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onPause()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/r0;->onPause()V

    iget-object v0, p0, Lhj0/f;->H:Lhj0/e;

    invoke-interface {v0, p0}, Lhj0/e;->onActivityPaused(Landroid/app/Activity;)V

    iget-object v0, p0, Lhj0/f;->x:Lcom/whoop/ui/l;

    invoke-virtual {v0}, Lcom/whoop/ui/l;->b()V

    return-void
.end method

.method public onResume()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/r0;->onResume()V

    iget-object v0, p0, Lhj0/f;->H:Lhj0/e;

    invoke-interface {v0, p0}, Lhj0/e;->onActivityResumed(Landroid/app/Activity;)V

    invoke-virtual {p0}, Lhj0/f;->p()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lhj0/f;->F:Lz82/b;

    invoke-interface {v1, v0}, Lfi0/a;->g(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public p()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public r()Lcom/whoop/ui/l;
    .locals 1

    iget-object v0, p0, Lhj0/f;->w:Lcom/whoop/ui/l;

    return-object v0
.end method

.method public s()Lz82/e;
    .locals 1

    iget-object v0, p0, Lhj0/f;->G:Lz82/e;

    return-object v0
.end method

.method public t()I
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const-string v2, "BaseTransitionType"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public u()Lm/b;
    .locals 1

    invoke-virtual {p0}, Lm/m;->getSupportActionBar()Lm/b;

    move-result-object v0

    return-object v0
.end method

.method public v()Landroidx/fragment/app/o1;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v0

    return-object v0
.end method

.method public w()Z
    .locals 2

    invoke-virtual {p0}, Lhj0/f;->t()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public x()Z
    .locals 2

    invoke-virtual {p0}, Lhj0/f;->t()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public z()V
    .locals 3

    invoke-virtual {p0}, Lhj0/f;->u()Lm/b;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lhj0/f;->u()Lm/b;

    move-result-object v0

    invoke-virtual {v0, v1}, Lm/b;->o(Z)V

    invoke-virtual {p0}, Lhj0/f;->u()Lm/b;

    move-result-object v0

    sget v2, Lvu1/c;->j:I

    invoke-virtual {v0, v2}, Lm/b;->r(I)V

    :cond_0
    iput-boolean v1, p0, Lhj0/f;->E:Z

    return-void
.end method
