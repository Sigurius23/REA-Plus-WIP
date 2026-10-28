.class public Lml/i;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# instance fields
.field public E:Lcom/bumptech/glide/h;

.field public F:Landroidx/fragment/app/m0;

.field public final w:Lb5/d;

.field public final x:Lla/b;

.field public final y:Ljava/util/HashSet;

.field public z:Lml/i;


# direct methods
.method public constructor <init>()V
    .locals 3

    new-instance v0, Lb5/d;

    invoke-direct {v0}, Lb5/d;-><init>()V

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v1, Lla/b;

    const/4 v2, 0x7

    invoke-direct {v1, p0, v2}, Lla/b;-><init>(Ljava/lang/Object;I)V

    iput-object v1, p0, Lml/i;->x:Lla/b;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Lml/i;->y:Ljava/util/HashSet;

    iput-object v0, p0, Lml/i;->w:Lb5/d;

    return-void
.end method


# virtual methods
.method public final A()Lla/b;
    .locals 1

    iget-object v0, p0, Lml/i;->x:Lla/b;

    return-object v0
.end method

.method public final B(Landroid/content/Context;Landroidx/fragment/app/o1;)V
    .locals 2

    iget-object v0, p0, Lml/i;->z:Lml/i;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lml/i;->y:Ljava/util/HashSet;

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    iput-object v1, p0, Lml/i;->z:Lml/i;

    :cond_0
    invoke-static {p1}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Lcom/bumptech/glide/b;

    move-result-object v0

    iget-object v0, v0, Lcom/bumptech/glide/b;->G:Lml/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lml/g;->k(Landroid/content/Context;)Z

    move-result p1

    invoke-virtual {v0, p2, v1, p1}, Lml/g;->j(Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;Z)Lml/i;

    move-result-object p1

    iput-object p1, p0, Lml/i;->z:Lml/i;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/m0;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lml/i;->z:Lml/i;

    iget-object p1, p1, Lml/i;->y:Ljava/util/HashSet;

    invoke-virtual {p1, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public final C(Landroidx/fragment/app/m0;)V
    .locals 2

    iput-object p1, p0, Lml/i;->F:Landroidx/fragment/app/m0;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-virtual {v0}, Landroidx/fragment/app/m0;->getParentFragment()Landroidx/fragment/app/m0;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->getParentFragment()Landroidx/fragment/app/m0;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Landroidx/fragment/app/m0;->getFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lml/i;->B(Landroid/content/Context;Landroidx/fragment/app/o1;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final D(Lcom/bumptech/glide/h;)V
    .locals 0

    iput-object p1, p0, Lml/i;->E:Lcom/bumptech/glide/h;

    return-void
.end method

.method public final onAttach(Landroid/content/Context;)V
    .locals 3

    invoke-super {p0, p1}, Landroidx/fragment/app/m0;->onAttach(Landroid/content/Context;)V

    move-object p1, p0

    :goto_0
    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getParentFragment()Landroidx/fragment/app/m0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getParentFragment()Landroidx/fragment/app/m0;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getFragmentManager()Landroidx/fragment/app/o1;

    move-result-object p1

    const/4 v0, 0x5

    const-string v1, "SupportRMFragment"

    if-nez p1, :cond_1

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "Unable to register fragment with root, ancestor detached"

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p0, v2, p1}, Lml/i;->B(Landroid/content/Context;Landroidx/fragment/app/o1;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "Unable to register fragment with root"

    invoke-static {v1, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_2
    return-void
.end method

.method public final onDestroy()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/m0;->onDestroy()V

    const/4 v0, 0x1

    iget-object v1, p0, Lml/i;->w:Lb5/d;

    iput-boolean v0, v1, Lb5/d;->x:Z

    iget-object v0, v1, Lb5/d;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    invoke-static {v0}, Ltl/l;->d(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lml/d;

    invoke-interface {v1}, Lml/d;->onDestroy()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lml/i;->z:Lml/i;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lml/i;->y:Ljava/util/HashSet;

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lml/i;->z:Lml/i;

    :cond_1
    return-void
.end method

.method public final onDetach()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/m0;->onDetach()V

    const/4 v0, 0x0

    iput-object v0, p0, Lml/i;->F:Landroidx/fragment/app/m0;

    iget-object v1, p0, Lml/i;->z:Lml/i;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lml/i;->y:Ljava/util/HashSet;

    invoke-virtual {v1, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    iput-object v0, p0, Lml/i;->z:Lml/i;

    :cond_0
    return-void
.end method

.method public final onStart()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/m0;->onStart()V

    iget-object v0, p0, Lml/i;->w:Lb5/d;

    invoke-virtual {v0}, Lb5/d;->b()V

    return-void
.end method

.method public final onStop()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/m0;->onStop()V

    const/4 v0, 0x0

    iget-object v1, p0, Lml/i;->w:Lb5/d;

    iput-boolean v0, v1, Lb5/d;->w:Z

    iget-object v0, v1, Lb5/d;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    invoke-static {v0}, Ltl/l;->d(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lml/d;

    invoke-interface {v1}, Lml/d;->onStop()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Landroidx/fragment/app/m0;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{parent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getParentFragment()Landroidx/fragment/app/m0;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lml/i;->F:Landroidx/fragment/app/m0;

    :goto_0
    const-string v2, "}"

    invoke-static {v0, v1, v2}, Ld;->q(Ljava/lang/StringBuilder;Landroidx/fragment/app/m0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final y()Lb5/d;
    .locals 1

    iget-object v0, p0, Lml/i;->w:Lb5/d;

    return-object v0
.end method

.method public final z()Lcom/bumptech/glide/h;
    .locals 1

    iget-object v0, p0, Lml/i;->E:Lcom/bumptech/glide/h;

    return-object v0
.end method
