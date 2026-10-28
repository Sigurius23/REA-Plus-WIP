.class public Lml/f;
.super Landroid/app/Fragment;
.source "SourceFile"


# instance fields
.field public E:Lml/f;

.field public F:Landroid/app/Fragment;

.field public final w:Lb5/d;

.field public final x:Lla/b;

.field public final y:Ljava/util/HashSet;

.field public z:Lcom/bumptech/glide/h;


# direct methods
.method public constructor <init>()V
    .locals 3

    new-instance v0, Lb5/d;

    invoke-direct {v0}, Lb5/d;-><init>()V

    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    new-instance v1, Lla/b;

    const/4 v2, 0x6

    invoke-direct {v1, p0, v2}, Lla/b;-><init>(Ljava/lang/Object;I)V

    iput-object v1, p0, Lml/f;->x:Lla/b;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Lml/f;->y:Ljava/util/HashSet;

    iput-object v0, p0, Lml/f;->w:Lb5/d;

    return-void
.end method


# virtual methods
.method public final a()Lb5/d;
    .locals 1

    iget-object v0, p0, Lml/f;->w:Lb5/d;

    return-object v0
.end method

.method public final b()Lcom/bumptech/glide/h;
    .locals 1

    iget-object v0, p0, Lml/f;->z:Lcom/bumptech/glide/h;

    return-object v0
.end method

.method public final c()Lla/b;
    .locals 1

    iget-object v0, p0, Lml/f;->x:Lla/b;

    return-object v0
.end method

.method public final d(Landroid/app/Activity;)V
    .locals 3

    iget-object v0, p0, Lml/f;->E:Lml/f;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lml/f;->y:Ljava/util/HashSet;

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    iput-object v1, p0, Lml/f;->E:Lml/f;

    :cond_0
    invoke-static {p1}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Lcom/bumptech/glide/b;

    move-result-object v0

    iget-object v0, v0, Lcom/bumptech/glide/b;->G:Lml/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v2

    invoke-static {p1}, Lml/g;->k(Landroid/content/Context;)Z

    move-result p1

    invoke-virtual {v0, v2, v1, p1}, Lml/g;->i(Landroid/app/FragmentManager;Landroid/app/Fragment;Z)Lml/f;

    move-result-object p1

    iput-object p1, p0, Lml/f;->E:Lml/f;

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lml/f;->E:Lml/f;

    iget-object p1, p1, Lml/f;->y:Ljava/util/HashSet;

    invoke-virtual {p1, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public final e(Landroid/app/Fragment;)V
    .locals 1

    iput-object p1, p0, Lml/f;->F:Landroid/app/Fragment;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {p0, p1}, Lml/f;->d(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public final f(Lcom/bumptech/glide/h;)V
    .locals 0

    iput-object p1, p0, Lml/f;->z:Lcom/bumptech/glide/h;

    return-void
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Fragment;->onAttach(Landroid/app/Activity;)V

    :try_start_0
    invoke-virtual {p0, p1}, Lml/f;->d(Landroid/app/Activity;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const/4 v0, 0x5

    const-string v1, "RMFragment"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Unable to register fragment with root"

    invoke-static {v1, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    return-void
.end method

.method public final onDestroy()V
    .locals 2

    invoke-super {p0}, Landroid/app/Fragment;->onDestroy()V

    const/4 v0, 0x1

    iget-object v1, p0, Lml/f;->w:Lb5/d;

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
    iget-object v0, p0, Lml/f;->E:Lml/f;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lml/f;->y:Ljava/util/HashSet;

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lml/f;->E:Lml/f;

    :cond_1
    return-void
.end method

.method public final onDetach()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onDetach()V

    iget-object v0, p0, Lml/f;->E:Lml/f;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lml/f;->y:Ljava/util/HashSet;

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lml/f;->E:Lml/f;

    :cond_0
    return-void
.end method

.method public final onStart()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onStart()V

    iget-object v0, p0, Lml/f;->w:Lb5/d;

    invoke-virtual {v0}, Lb5/d;->b()V

    return-void
.end method

.method public final onStop()V
    .locals 2

    invoke-super {p0}, Landroid/app/Fragment;->onStop()V

    const/4 v0, 0x0

    iget-object v1, p0, Lml/f;->w:Lb5/d;

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
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Landroid/app/Fragment;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{parent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/app/Fragment;->getParentFragment()Landroid/app/Fragment;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lml/f;->F:Landroid/app/Fragment;

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
