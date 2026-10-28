.class public final Landroidx/fragment/app/d1;
.super Lg/t;
.source "SourceFile"


# instance fields
.field public final synthetic d:Landroidx/fragment/app/o1;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/o1;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/d1;->d:Landroidx/fragment/app/o1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lg/t;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 5

    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v1

    iget-object v2, p0, Landroidx/fragment/app/d1;->d:Landroidx/fragment/app/o1;

    const-string v3, "FragmentManager"

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-static {v0}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "cancelBackStackTransition for transition "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v2, Landroidx/fragment/app/o1;->h:Landroidx/fragment/app/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iget-object v0, v2, Landroidx/fragment/app/o1;->h:Landroidx/fragment/app/a;

    if-eqz v0, :cond_3

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroidx/fragment/app/a;->u:Z

    invoke-virtual {v0}, Landroidx/fragment/app/a;->i()V

    iget-object v0, v2, Landroidx/fragment/app/o1;->h:Landroidx/fragment/app/a;

    new-instance v3, Landroidx/fragment/app/m;

    const/4 v4, 0x3

    invoke-direct {v3, v2, v4}, Landroidx/fragment/app/m;-><init>(Ljava/lang/Object;I)V

    iget-object v4, v0, Landroidx/fragment/app/c2;->s:Ljava/util/ArrayList;

    if-nez v4, :cond_2

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v0, Landroidx/fragment/app/c2;->s:Ljava/util/ArrayList;

    :cond_2
    iget-object v0, v0, Landroidx/fragment/app/c2;->s:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v2, Landroidx/fragment/app/o1;->h:Landroidx/fragment/app/a;

    invoke-virtual {v0}, Landroidx/fragment/app/a;->j()I

    const/4 v0, 0x1

    iput-boolean v0, v2, Landroidx/fragment/app/o1;->i:Z

    invoke-virtual {v2, v0}, Landroidx/fragment/app/o1;->z(Z)Z

    invoke-virtual {v2}, Landroidx/fragment/app/o1;->G()V

    iput-boolean v1, v2, Landroidx/fragment/app/o1;->i:Z

    const/4 v0, 0x0

    iput-object v0, v2, Landroidx/fragment/app/o1;->h:Landroidx/fragment/app/a;

    :cond_3
    return-void
.end method

.method public final d()V
    .locals 11

    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v1

    iget-object v2, p0, Landroidx/fragment/app/d1;->d:Landroidx/fragment/app/o1;

    const-string v3, "FragmentManager"

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v1, v2, Landroidx/fragment/app/o1;->j:Landroidx/fragment/app/d1;

    iget-object v4, v2, Landroidx/fragment/app/o1;->o:Ljava/util/ArrayList;

    const/4 v5, 0x1

    iput-boolean v5, v2, Landroidx/fragment/app/o1;->i:Z

    invoke-virtual {v2, v5}, Landroidx/fragment/app/o1;->z(Z)Z

    const/4 v6, 0x0

    iput-boolean v6, v2, Landroidx/fragment/app/o1;->i:Z

    iget-object v7, v2, Landroidx/fragment/app/o1;->h:Landroidx/fragment/app/a;

    if-eqz v7, :cond_a

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_2

    new-instance v7, Ljava/util/LinkedHashSet;

    iget-object v8, v2, Landroidx/fragment/app/o1;->h:Landroidx/fragment/app/a;

    invoke-static {v8}, Landroidx/fragment/app/o1;->H(Landroidx/fragment/app/a;)Ljava/util/HashSet;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lhb/i;

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/fragment/app/m0;

    invoke-virtual {v8, v10, v5}, Lhb/i;->a(Landroidx/fragment/app/m0;Z)V

    goto :goto_0

    :cond_2
    iget-object v4, v2, Landroidx/fragment/app/o1;->h:Landroidx/fragment/app/a;

    iget-object v4, v4, Landroidx/fragment/app/c2;->c:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/fragment/app/b2;

    iget-object v7, v7, Landroidx/fragment/app/b2;->b:Landroidx/fragment/app/m0;

    if-eqz v7, :cond_3

    iput-boolean v6, v7, Landroidx/fragment/app/m0;->mTransitioning:Z

    goto :goto_1

    :cond_4
    new-instance v4, Ljava/util/ArrayList;

    iget-object v7, v2, Landroidx/fragment/app/o1;->h:Landroidx/fragment/app/a;

    invoke-static {v7}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v2, v4, v6, v5}, Landroidx/fragment/app/o1;->f(Ljava/util/ArrayList;II)Ljava/util/HashSet;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/s;

    iget-object v6, v5, Landroidx/fragment/app/s;->c:Ljava/util/ArrayList;

    invoke-static {v0}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v7

    if-eqz v7, :cond_5

    const-string v7, "SpecialEffectsController: Completing Back "

    invoke-static {v3, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    invoke-virtual {v5, v6}, Landroidx/fragment/app/s;->m(Ljava/util/List;)V

    invoke-virtual {v5, v6}, Landroidx/fragment/app/s;->c(Ljava/util/List;)V

    goto :goto_2

    :cond_6
    iget-object v4, v2, Landroidx/fragment/app/o1;->h:Landroidx/fragment/app/a;

    iget-object v4, v4, Landroidx/fragment/app/c2;->c:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_7
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/b2;

    iget-object v5, v5, Landroidx/fragment/app/b2;->b:Landroidx/fragment/app/m0;

    if-eqz v5, :cond_7

    iget-object v6, v5, Landroidx/fragment/app/m0;->mContainer:Landroid/view/ViewGroup;

    if-nez v6, :cond_7

    invoke-virtual {v2, v5}, Landroidx/fragment/app/o1;->g(Landroidx/fragment/app/m0;)Landroidx/fragment/app/z1;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/fragment/app/z1;->k()V

    goto :goto_3

    :cond_8
    const/4 v4, 0x0

    iput-object v4, v2, Landroidx/fragment/app/o1;->h:Landroidx/fragment/app/a;

    invoke-virtual {v2}, Landroidx/fragment/app/o1;->n0()V

    invoke-static {v0}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v0

    if-eqz v0, :cond_9

    const-string v0, "Op is being set to null"

    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "OnBackPressedCallback enabled="

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lg/t;->g()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " for  FragmentManager "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_9
    return-void

    :cond_a
    invoke-virtual {v1}, Lg/t;->g()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-static {v0}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v0

    if-eqz v0, :cond_b

    const-string v0, "Calling popBackStackImmediate via onBackPressed callback"

    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_b
    invoke-virtual {v2}, Landroidx/fragment/app/o1;->T()Z

    return-void

    :cond_c
    invoke-static {v0}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v0

    if-eqz v0, :cond_d

    const-string v0, "Calling onBackPressed via onBackPressed callback"

    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_d
    iget-object v0, v2, Landroidx/fragment/app/o1;->g:Lg/z;

    invoke-virtual {v0}, Lg/z;->d()V

    return-void
.end method

.method public final e(Lg/a;)V
    .locals 11

    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v1

    const-string v2, "FragmentManager"

    iget-object v3, p0, Landroidx/fragment/app/d1;->d:Landroidx/fragment/app/o1;

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v1, v3, Landroidx/fragment/app/o1;->h:Landroidx/fragment/app/a;

    if-eqz v1, :cond_5

    new-instance v1, Ljava/util/ArrayList;

    iget-object v4, v3, Landroidx/fragment/app/o1;->h:Landroidx/fragment/app/a;

    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-virtual {v3, v1, v4, v5}, Landroidx/fragment/app/o1;->f(Ljava/util/ArrayList;II)Ljava/util/HashSet;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/s;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "backEvent"

    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v6

    if-eqz v6, :cond_2

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "SpecialEffectsController: Processing Progress "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lg/a;->a()F

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    iget-object v6, v5, Landroidx/fragment/app/s;->c:Ljava/util/ArrayList;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/fragment/app/p2;

    iget-object v8, v8, Landroidx/fragment/app/p2;->k:Ljava/util/ArrayList;

    invoke-static {v7, v8}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_3
    invoke-static {v7}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v6}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    move v8, v4

    :goto_1
    if-ge v8, v7, :cond_1

    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/fragment/app/o2;

    iget-object v10, v5, Landroidx/fragment/app/s;->a:Landroid/view/ViewGroup;

    invoke-virtual {v9, p1, v10}, Landroidx/fragment/app/o2;->e(Lg/a;Landroid/view/ViewGroup;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_4
    iget-object p1, v3, Landroidx/fragment/app/o1;->o:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhb/i;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_2

    :cond_5
    return-void
.end method

.method public final f(Lg/a;)V
    .locals 2

    const/4 p1, 0x3

    invoke-static {p1}, Landroidx/fragment/app/o1;->M(I)Z

    move-result p1

    iget-object v0, p0, Landroidx/fragment/app/d1;->d:Landroidx/fragment/app/o1;

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "FragmentManager"

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/o1;->w()V

    new-instance p1, Landroidx/fragment/app/m1;

    invoke-direct {p1, v0}, Landroidx/fragment/app/m1;-><init>(Landroidx/fragment/app/o1;)V

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroidx/fragment/app/o1;->x(Landroidx/fragment/app/k1;Z)V

    return-void
.end method
