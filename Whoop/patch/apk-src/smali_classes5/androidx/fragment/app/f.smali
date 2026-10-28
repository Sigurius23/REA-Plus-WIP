.class public final Landroidx/fragment/app/f;
.super Landroidx/fragment/app/o2;
.source "SourceFile"


# instance fields
.field public final c:Landroidx/fragment/app/g;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/g;

    return-void
.end method


# virtual methods
.method public final c(Landroid/view/ViewGroup;)V
    .locals 3

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/g;

    iget-object v1, v0, Landroidx/fragment/app/l;->a:Landroidx/fragment/app/p2;

    iget-object v2, v1, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    iget-object v2, v2, Landroidx/fragment/app/m0;->mView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->clearAnimation()V

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    iget-object p1, v0, Landroidx/fragment/app/l;->a:Landroidx/fragment/app/p2;

    invoke-virtual {p1, p0}, Landroidx/fragment/app/p2;->c(Landroidx/fragment/app/o2;)V

    const/4 p1, 0x2

    invoke-static {p1}, Landroidx/fragment/app/o1;->M(I)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Animation from operation "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " has been cancelled."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "FragmentManager"

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public final d(Landroid/view/ViewGroup;)V
    .locals 5

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/g;

    iget-object v1, v0, Landroidx/fragment/app/l;->a:Landroidx/fragment/app/p2;

    invoke-virtual {v0}, Landroidx/fragment/app/l;->a()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, p0}, Landroidx/fragment/app/p2;->c(Landroidx/fragment/app/o2;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, v1, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    iget-object v3, v3, Landroidx/fragment/app/m0;->mView:Landroid/view/View;

    const-string v4, "context"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Landroidx/fragment/app/g;->b(Landroid/content/Context;)Landroidx/fragment/app/s0;

    move-result-object v0

    const-string v2, "Required value was null."

    if-eqz v0, :cond_4

    iget-object v0, v0, Landroidx/fragment/app/s0;->a:Landroid/view/animation/Animation;

    if-eqz v0, :cond_3

    iget v2, v1, Landroidx/fragment/app/p2;->a:I

    const/4 v4, 0x1

    if-eq v2, v4, :cond_1

    invoke-virtual {v3, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    invoke-virtual {v1, p0}, Landroidx/fragment/app/p2;->c(Landroidx/fragment/app/o2;)V

    return-void

    :cond_1
    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    new-instance v2, Landroidx/fragment/app/t0;

    invoke-direct {v2, v0, p1, v3}, Landroidx/fragment/app/t0;-><init>(Landroid/view/animation/Animation;Landroid/view/ViewGroup;Landroid/view/View;)V

    new-instance v0, Landroidx/fragment/app/e;

    invoke-direct {v0, v1, p1, v3, p0}, Landroidx/fragment/app/e;-><init>(Landroidx/fragment/app/p2;Landroid/view/ViewGroup;Landroid/view/View;Landroidx/fragment/app/f;)V

    invoke-virtual {v2, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    invoke-virtual {v3, v2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    const/4 p1, 0x2

    invoke-static {p1}, Landroidx/fragment/app/o1;->M(I)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Animation from operation "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " has started."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "FragmentManager"

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
