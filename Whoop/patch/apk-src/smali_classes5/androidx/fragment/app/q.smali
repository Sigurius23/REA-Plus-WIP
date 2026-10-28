.class public final Landroidx/fragment/app/q;
.super Landroidx/fragment/app/o2;
.source "SourceFile"


# instance fields
.field public final c:Ljava/util/ArrayList;

.field public final d:Landroidx/fragment/app/p2;

.field public final e:Landroidx/fragment/app/p2;

.field public final f:Landroidx/fragment/app/k2;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/util/ArrayList;

.field public final i:Ljava/util/ArrayList;

.field public final j:La0/g;

.field public final k:Ljava/util/ArrayList;

.field public final l:Ljava/util/ArrayList;

.field public final m:La0/g;

.field public final n:La0/g;

.field public final o:Z

.field public final p:Lb5/d;

.field public q:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Landroidx/fragment/app/p2;Landroidx/fragment/app/p2;Landroidx/fragment/app/k2;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;La0/g;Ljava/util/ArrayList;Ljava/util/ArrayList;La0/g;La0/g;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/q;->c:Ljava/util/ArrayList;

    iput-object p2, p0, Landroidx/fragment/app/q;->d:Landroidx/fragment/app/p2;

    iput-object p3, p0, Landroidx/fragment/app/q;->e:Landroidx/fragment/app/p2;

    iput-object p4, p0, Landroidx/fragment/app/q;->f:Landroidx/fragment/app/k2;

    iput-object p5, p0, Landroidx/fragment/app/q;->g:Ljava/lang/Object;

    iput-object p6, p0, Landroidx/fragment/app/q;->h:Ljava/util/ArrayList;

    iput-object p7, p0, Landroidx/fragment/app/q;->i:Ljava/util/ArrayList;

    iput-object p8, p0, Landroidx/fragment/app/q;->j:La0/g;

    iput-object p9, p0, Landroidx/fragment/app/q;->k:Ljava/util/ArrayList;

    iput-object p10, p0, Landroidx/fragment/app/q;->l:Ljava/util/ArrayList;

    iput-object p11, p0, Landroidx/fragment/app/q;->m:La0/g;

    iput-object p12, p0, Landroidx/fragment/app/q;->n:La0/g;

    iput-boolean p13, p0, Landroidx/fragment/app/q;->o:Z

    new-instance p1, Lb5/d;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/q;->p:Lb5/d;

    return-void
.end method

.method public static h(Landroid/view/View;Ljava/util/ArrayList;)V
    .locals 4

    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    move-object v0, p0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->isTransitionGroup()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p0, :cond_3

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_1

    invoke-static {v2, p1}, Landroidx/fragment/app/q;->h(Landroid/view/View;Ljava/util/ArrayList;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 5

    iget-object v0, p0, Landroidx/fragment/app/q;->f:Landroidx/fragment/app/k2;

    invoke-virtual {v0}, Landroidx/fragment/app/k2;->l()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Landroidx/fragment/app/q;->c:Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/r;

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x22

    if-lt v3, v4, :cond_3

    iget-object v2, v2, Landroidx/fragment/app/r;->b:Ljava/lang/Object;

    if-eqz v2, :cond_3

    invoke-virtual {v0, v2}, Landroidx/fragment/app/k2;->m(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v1, p0, Landroidx/fragment/app/q;->g:Ljava/lang/Object;

    if-eqz v1, :cond_2

    invoke-virtual {v0, v1}, Landroidx/fragment/app/k2;->m(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/4 v0, 0x1

    return v0

    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public final c(Landroid/view/ViewGroup;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/fragment/app/q;->p:Lb5/d;

    invoke-virtual {p1}, Lb5/d;->a()V

    return-void
.end method

.method public final d(Landroid/view/ViewGroup;)V
    .locals 13

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->isLaidOut()Z

    move-result v0

    iget-object v1, p0, Landroidx/fragment/app/q;->c:Ljava/util/ArrayList;

    const-string v2, "FragmentManager"

    const/4 v3, 0x2

    if-nez v0, :cond_1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/r;

    iget-object v4, v1, Landroidx/fragment/app/l;->a:Landroidx/fragment/app/p2;

    invoke-static {v3}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v5

    if-eqz v5, :cond_0

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "SpecialEffectsController: Container "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " has not been laid out. Completing operation "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v1, v1, Landroidx/fragment/app/l;->a:Landroidx/fragment/app/p2;

    invoke-virtual {v1, p0}, Landroidx/fragment/app/p2;->c(Landroidx/fragment/app/o2;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/q;->q:Ljava/lang/Object;

    const-string v4, " to "

    iget-object v5, p0, Landroidx/fragment/app/q;->f:Landroidx/fragment/app/k2;

    iget-object v6, p0, Landroidx/fragment/app/q;->e:Landroidx/fragment/app/p2;

    iget-object v7, p0, Landroidx/fragment/app/q;->d:Landroidx/fragment/app/p2;

    if-eqz v0, :cond_2

    invoke-virtual {v5, v0}, Landroidx/fragment/app/k2;->c(Ljava/lang/Object;)V

    invoke-static {v3}, Landroidx/fragment/app/o1;->M(I)Z

    move-result p1

    if-eqz p1, :cond_5

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Ending execution of operations from "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_2
    invoke-virtual {p0, p1, v6, v7}, Landroidx/fragment/app/q;->i(Landroid/view/ViewGroup;Landroidx/fragment/app/p2;Landroidx/fragment/app/p2;)Ll83/k;

    move-result-object v0

    iget-object v8, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v8, Ljava/util/ArrayList;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    new-instance v9, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v1, v10}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/fragment/app/r;

    iget-object v10, v10, Landroidx/fragment/app/l;->a:Landroidx/fragment/app/p2;

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/fragment/app/p2;

    iget-object v10, v9, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    new-instance v11, Landroidx/fragment/app/n;

    const/4 v12, 0x1

    invoke-direct {v11, v9, p0, v12}, Landroidx/fragment/app/n;-><init>(Landroidx/fragment/app/p2;Landroidx/fragment/app/q;I)V

    iget-object v9, p0, Landroidx/fragment/app/q;->p:Lb5/d;

    invoke-virtual {v5, v10, v0, v9, v11}, Landroidx/fragment/app/k2;->u(Landroidx/fragment/app/m0;Ljava/lang/Object;Lb5/d;Ljava/lang/Runnable;)V

    goto :goto_2

    :cond_4
    new-instance v1, Landroidx/fragment/app/o;

    invoke-direct {v1, p0, p1, v0}, Landroidx/fragment/app/o;-><init>(Landroidx/fragment/app/q;Landroid/view/ViewGroup;Ljava/lang/Object;)V

    invoke-virtual {p0, v8, p1, v1}, Landroidx/fragment/app/q;->k(Ljava/util/ArrayList;Landroid/view/ViewGroup;Lc93/a;)V

    invoke-static {v3}, Landroidx/fragment/app/o1;->M(I)Z

    move-result p1

    if-eqz p1, :cond_5

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Completed executing operations from "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    return-void
.end method

.method public final e(Lg/a;Landroid/view/ViewGroup;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/fragment/app/q;->q:Ljava/lang/Object;

    if-eqz p2, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/q;->f:Landroidx/fragment/app/k2;

    iget p1, p1, Lg/a;->c:F

    invoke-virtual {v0, p2, p1}, Landroidx/fragment/app/k2;->r(Ljava/lang/Object;F)V

    :cond_0
    return-void
.end method

.method public final f(Landroid/view/ViewGroup;)V
    .locals 11

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->isLaidOut()Z

    move-result v0

    const-string v1, "FragmentManager"

    iget-object v2, p0, Landroidx/fragment/app/q;->c:Ljava/util/ArrayList;

    if-nez v0, :cond_2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/r;

    iget-object v2, v2, Landroidx/fragment/app/l;->a:Landroidx/fragment/app/p2;

    const/4 v3, 0x2

    invoke-static {v3}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "SpecialEffectsController: Container "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " has not been laid out. Skipping onStart for operation "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    move-object v6, p0

    goto/16 :goto_3

    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/q;->j()Z

    move-result v0

    iget-object v3, p0, Landroidx/fragment/app/q;->e:Landroidx/fragment/app/p2;

    iget-object v4, p0, Landroidx/fragment/app/q;->d:Landroidx/fragment/app/p2;

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroidx/fragment/app/q;->g:Ljava/lang/Object;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroidx/fragment/app/q;->b()Z

    move-result v5

    if-nez v5, :cond_3

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Ignoring shared elements transition "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " between "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " and "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed."

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    invoke-virtual {p0}, Landroidx/fragment/app/q;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/q;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v9, Lkotlin/jvm/internal/g0;

    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1, v3, v4}, Landroidx/fragment/app/q;->i(Landroid/view/ViewGroup;Landroidx/fragment/app/p2;Landroidx/fragment/app/p2;)Ll83/k;

    move-result-object v0

    iget-object v1, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    iget-object v8, v0, Ll83/k;->x:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/r;

    iget-object v3, v3, Landroidx/fragment/app/l;->a:Landroidx/fragment/app/p2;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/p2;

    new-instance v3, Landroidx/fragment/app/m;

    const/4 v4, 0x0

    invoke-direct {v3, v9, v4}, Landroidx/fragment/app/m;-><init>(Ljava/lang/Object;I)V

    iget-object v4, v2, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    new-instance v4, Landroidx/fragment/app/n;

    const/4 v5, 0x0

    invoke-direct {v4, v2, p0, v5}, Landroidx/fragment/app/n;-><init>(Landroidx/fragment/app/p2;Landroidx/fragment/app/q;I)V

    iget-object v2, p0, Landroidx/fragment/app/q;->f:Landroidx/fragment/app/k2;

    iget-object v5, p0, Landroidx/fragment/app/q;->p:Lb5/d;

    invoke-virtual {v2, v8, v5, v3, v4}, Landroidx/fragment/app/k2;->v(Ljava/lang/Object;Lb5/d;Landroidx/fragment/app/m;Ljava/lang/Runnable;)V

    goto :goto_2

    :cond_5
    new-instance v5, Landroidx/fragment/app/p;

    const/4 v10, 0x0

    move-object v6, p0

    move-object v7, p1

    invoke-direct/range {v5 .. v10}, Landroidx/fragment/app/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;I)V

    invoke-virtual {p0, v1, v7, v5}, Landroidx/fragment/app/q;->k(Ljava/util/ArrayList;Landroid/view/ViewGroup;Lc93/a;)V

    :goto_3
    return-void
.end method

.method public final i(Landroid/view/ViewGroup;Landroidx/fragment/app/p2;Landroidx/fragment/app/p2;)Ll83/k;
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    new-instance v4, Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    iget-object v6, v0, Landroidx/fragment/app/q;->c:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    iget-object v13, v0, Landroidx/fragment/app/q;->i:Ljava/util/ArrayList;

    iget-object v14, v0, Landroidx/fragment/app/q;->h:Ljava/util/ArrayList;

    iget-object v15, v0, Landroidx/fragment/app/q;->g:Ljava/lang/Object;

    iget-object v8, v0, Landroidx/fragment/app/q;->f:Landroidx/fragment/app/k2;

    if-eqz v12, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/fragment/app/r;

    iget-object v12, v12, Landroidx/fragment/app/r;->d:Ljava/lang/Object;

    if-eqz v12, :cond_2

    if-eqz v3, :cond_2

    if-eqz v2, :cond_2

    iget-object v12, v0, Landroidx/fragment/app/q;->j:La0/g;

    invoke-virtual {v12}, La0/f1;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_2

    if-eqz v15, :cond_2

    iget-object v12, v2, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    iget-object v9, v3, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    move-object/from16 v20, v6

    iget-boolean v6, v0, Landroidx/fragment/app/q;->o:Z

    move-object/from16 v21, v7

    iget-object v7, v0, Landroidx/fragment/app/q;->m:La0/g;

    move/from16 v22, v11

    const/4 v11, 0x1

    invoke-static {v12, v9, v6, v7, v11}, Landroidx/fragment/app/d2;->a(Landroidx/fragment/app/m0;Landroidx/fragment/app/m0;ZLa0/g;Z)V

    new-instance v6, Landroidx/fragment/app/d;

    const/4 v9, 0x1

    invoke-direct {v6, v2, v3, v0, v9}, Landroidx/fragment/app/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v1, v6}, Lh5/w;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    invoke-virtual {v7}, La0/g;->values()Ljava/util/Collection;

    move-result-object v6

    invoke-virtual {v14, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v6, v0, Landroidx/fragment/app/q;->l:Ljava/util/ArrayList;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_0

    const/4 v9, 0x0

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    const-string v9, "exitingNames[0]"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v7, v6}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    invoke-virtual {v8, v6, v15}, Landroidx/fragment/app/k2;->s(Landroid/view/View;Ljava/lang/Object;)V

    move-object v10, v6

    :cond_0
    iget-object v6, v0, Landroidx/fragment/app/q;->n:La0/g;

    invoke-virtual {v6}, La0/g;->values()Ljava/util/Collection;

    move-result-object v7

    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v7, v0, Landroidx/fragment/app/q;->k:Ljava/util/ArrayList;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_1

    const/4 v9, 0x0

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    const-string v9, "enteringNames[0]"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v6, v7}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    if-eqz v6, :cond_1

    new-instance v7, La8/c;

    invoke-direct {v7, v8, v6, v5}, La8/c;-><init>(Landroidx/fragment/app/k2;Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-static {v1, v7}, Lh5/w;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_1
    move/from16 v11, v22

    :goto_1
    invoke-virtual {v8, v15, v4, v14}, Landroidx/fragment/app/k2;->w(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    const/4 v15, 0x0

    const/16 v16, 0x0

    iget-object v14, v0, Landroidx/fragment/app/q;->g:Ljava/lang/Object;

    move-object/from16 v17, v14

    move-object/from16 v18, v13

    move-object v13, v8

    invoke-virtual/range {v13 .. v18}, Landroidx/fragment/app/k2;->q(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    move-object/from16 v6, v20

    move-object/from16 v7, v21

    goto/16 :goto_0

    :cond_2
    move-object/from16 v20, v6

    move-object/from16 v21, v7

    move/from16 v22, v11

    move-object/from16 v6, v20

    move-object/from16 v7, v21

    move/from16 v11, v22

    goto/16 :goto_0

    :cond_3
    move-object/from16 v20, v6

    move/from16 v22, v11

    move-object v6, v13

    move-object v13, v8

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {v20 .. v20}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v11, 0x0

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    const-string v0, "FragmentManager"

    if-eqz v12, :cond_e

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/fragment/app/r;

    move-object/from16 v24, v6

    iget-object v6, v12, Landroidx/fragment/app/l;->a:Landroidx/fragment/app/p2;

    move-object/from16 v25, v8

    iget-object v8, v12, Landroidx/fragment/app/r;->b:Ljava/lang/Object;

    invoke-virtual {v13, v8}, Landroidx/fragment/app/k2;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_d

    move-object/from16 v26, v14

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v27, v15

    iget-object v15, v6, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    move-object/from16 v28, v11

    iget-object v11, v15, Landroidx/fragment/app/m0;->mView:Landroid/view/View;

    move-object/from16 v29, v9

    const-string v9, "operation.fragment.mView"

    invoke-static {v11, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11, v14}, Landroidx/fragment/app/q;->h(Landroid/view/View;Ljava/util/ArrayList;)V

    if-eqz v27, :cond_6

    if-eq v6, v3, :cond_4

    if-ne v6, v2, :cond_6

    :cond_4
    if-ne v6, v3, :cond_5

    invoke-static/range {v26 .. v26}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v9

    check-cast v9, Ljava/util/Collection;

    invoke-virtual {v14, v9}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    goto :goto_3

    :cond_5
    invoke-static/range {v24 .. v24}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v9

    check-cast v9, Ljava/util/Collection;

    invoke-virtual {v14, v9}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    :cond_6
    :goto_3
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-virtual {v13, v4, v8}, Landroidx/fragment/app/k2;->a(Landroid/view/View;Ljava/lang/Object;)V

    move-object v9, v14

    goto :goto_4

    :cond_7
    invoke-virtual {v13, v8, v14}, Landroidx/fragment/app/k2;->b(Ljava/lang/Object;Ljava/util/ArrayList;)V

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v18, v8

    move-object/from16 v17, v8

    move-object/from16 v16, v13

    move-object/from16 v19, v14

    invoke-virtual/range {v16 .. v21}, Landroidx/fragment/app/k2;->q(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    move-object/from16 v9, v19

    iget v11, v6, Landroidx/fragment/app/p2;->a:I

    const/4 v14, 0x3

    if-ne v11, v14, :cond_8

    const/4 v11, 0x0

    iput-boolean v11, v6, Landroidx/fragment/app/p2;->i:Z

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v11, v15, Landroidx/fragment/app/m0;->mView:Landroid/view/View;

    invoke-virtual {v14, v11}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v11, v15, Landroidx/fragment/app/m0;->mView:Landroid/view/View;

    invoke-virtual {v13, v8, v11, v14}, Landroidx/fragment/app/k2;->p(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    new-instance v11, Landroidx/fragment/app/m;

    const/4 v14, 0x1

    invoke-direct {v11, v9, v14}, Landroidx/fragment/app/m;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1, v11}, Lh5/w;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    :cond_8
    :goto_4
    iget v6, v6, Landroidx/fragment/app/p2;->a:I

    const-string v11, "View: "

    const-string v14, "transitioningViews"

    const/4 v15, 0x2

    if-ne v6, v15, :cond_a

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    if-eqz v22, :cond_9

    invoke-virtual {v13, v8, v5}, Landroidx/fragment/app/k2;->t(Ljava/lang/Object;Landroid/graphics/Rect;)V

    :cond_9
    invoke-static {v15}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v6

    if-eqz v6, :cond_b

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v15, "Entering Transition: "

    invoke-direct {v6, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    const-string v6, ">>>>> EnteringViews <<<<<"

    invoke-static {v0, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v9, v14}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, Landroid/view/View;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v0, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_5

    :cond_a
    invoke-virtual {v13, v10, v8}, Landroidx/fragment/app/k2;->s(Landroid/view/View;Ljava/lang/Object;)V

    const/16 v23, 0x2

    invoke-static/range {v23 .. v23}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v6

    if-eqz v6, :cond_b

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v15, "Exiting Transition: "

    invoke-direct {v6, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    const-string v6, ">>>>> ExitingViews <<<<<"

    invoke-static {v0, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v9, v14}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, Landroid/view/View;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v0, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_6

    :cond_b
    iget-boolean v0, v12, Landroidx/fragment/app/r;->c:Z

    if-eqz v0, :cond_c

    move-object/from16 v6, v29

    invoke-virtual {v13, v6, v8}, Landroidx/fragment/app/k2;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move-object/from16 v0, p0

    move-object/from16 v6, v24

    move-object/from16 v8, v25

    move-object/from16 v14, v26

    move-object/from16 v15, v27

    move-object/from16 v11, v28

    goto/16 :goto_2

    :cond_c
    move-object/from16 v9, v28

    move-object/from16 v6, v29

    invoke-virtual {v13, v9, v8}, Landroidx/fragment/app/k2;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    move-object/from16 v0, p0

    move-object v9, v6

    move-object/from16 v6, v24

    move-object/from16 v8, v25

    move-object/from16 v14, v26

    move-object/from16 v15, v27

    goto/16 :goto_2

    :cond_d
    move-object v6, v9

    move-object v9, v11

    move-object/from16 v0, p0

    move-object/from16 v8, v25

    move-object v9, v6

    move-object/from16 v6, v24

    goto/16 :goto_2

    :cond_e
    move-object v6, v9

    move-object v9, v11

    move-object v8, v15

    invoke-virtual {v13, v6, v9, v8}, Landroidx/fragment/app/k2;->n(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/16 v23, 0x2

    invoke-static/range {v23 .. v23}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v2

    if-eqz v2, :cond_f

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Final merged transition: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_f
    new-instance v0, Ll83/k;

    invoke-direct {v0, v7, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public final j()Z
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/q;->c:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/r;

    iget-object v1, v1, Landroidx/fragment/app/l;->a:Landroidx/fragment/app/p2;

    iget-object v1, v1, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    iget-boolean v1, v1, Landroidx/fragment/app/m0;->mTransitioning:Z

    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final k(Ljava/util/ArrayList;Landroid/view/ViewGroup;Lc93/a;)V
    .locals 12

    const/4 v0, 0x4

    invoke-static {p1, v0}, Landroidx/fragment/app/d2;->d(Ljava/util/ArrayList;I)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, p0, Landroidx/fragment/app/q;->i:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v7, 0x0

    move v1, v7

    :goto_0
    const/4 v2, 0x0

    if-ge v1, v0, :cond_0

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View;

    sget-object v6, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {v5}, Lh5/h0;->f(Landroid/view/View;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v5, v2}, Lh5/h0;->m(Landroid/view/View;Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v0

    iget-object v5, p0, Landroidx/fragment/app/q;->h:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    const-string v0, ">>>>> Beginning transition <<<<<"

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, ">>>>> SharedElementFirstOutViews <<<<<"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const-string v8, " Name: "

    const-string v9, "View: "

    if-eqz v6, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    const-string v10, "sharedElementFirstOutViews"

    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Landroid/view/View;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v8, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {v6}, Lh5/h0;->f(Landroid/view/View;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_1
    const-string v0, ">>>>> SharedElementLastInViews <<<<<"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    const-string v10, "sharedElementLastInViews"

    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Landroid/view/View;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v11, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {v6}, Lh5/h0;->f(Landroid/view/View;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_2
    invoke-interface {p3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-object p3, v2

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    move v0, v7

    :goto_3
    if-ge v0, v2, :cond_6

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    sget-object v8, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {v1}, Lh5/h0;->f(Landroid/view/View;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez v8, :cond_3

    goto :goto_5

    :cond_3
    invoke-static {v1, p3}, Lh5/h0;->m(Landroid/view/View;Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/fragment/app/q;->j:La0/g;

    invoke-virtual {v1, v8}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    move v9, v7

    :goto_4
    if-ge v9, v2, :cond_5

    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-static {v1, v8}, Lh5/h0;->m(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_5

    :cond_4
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_5
    :goto_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_6
    new-instance v1, Landroidx/fragment/app/j2;

    invoke-direct/range {v1 .. v6}, Landroidx/fragment/app/j2;-><init>(ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    invoke-static {p2, v1}, Lh5/w;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    invoke-static {p1, v7}, Landroidx/fragment/app/d2;->d(Ljava/util/ArrayList;I)V

    iget-object p1, p0, Landroidx/fragment/app/q;->g:Ljava/lang/Object;

    iget-object p2, p0, Landroidx/fragment/app/q;->f:Landroidx/fragment/app/k2;

    invoke-virtual {p2, p1, v5, v3}, Landroidx/fragment/app/k2;->x(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    return-void
.end method
