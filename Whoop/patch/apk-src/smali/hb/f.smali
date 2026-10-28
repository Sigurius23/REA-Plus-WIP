.class public Lhb/f;
.super Leb/i1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhb/f$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Leb/i1;"
    }
.end annotation

.annotation runtime Leb/h1;
    value = "fragment"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0017\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "Lhb/f;",
        "Leb/i1;",
        "Lhb/g;",
        "a",
        "navigation-fragment_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final c:Landroid/content/Context;

.field public final d:Landroidx/fragment/app/o1;

.field public final e:I

.field public final f:Ljava/util/LinkedHashSet;

.field public final g:Ljava/util/ArrayList;

.field public final h:Lb3/i3;

.field public final i:La3/m1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/fragment/app/o1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb/f;->c:Landroid/content/Context;

    iput-object p2, p0, Lhb/f;->d:Landroidx/fragment/app/o1;

    iput p3, p0, Lhb/f;->e:I

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lhb/f;->f:Ljava/util/LinkedHashSet;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lhb/f;->g:Ljava/util/ArrayList;

    new-instance p1, Lb3/i3;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p2}, Lb3/i3;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lhb/f;->h:Lb3/i3;

    new-instance p1, La3/m1;

    const/16 p2, 0xe

    invoke-direct {p1, p0, p2}, La3/m1;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lhb/f;->i:La3/m1;

    return-void
.end method

.method public static k(Lhb/f;Ljava/lang/String;I)V
    .locals 3

    and-int/lit8 v0, p2, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/lit8 p2, p2, 0x4

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    iget-object p0, p0, Lhb/f;->g:Ljava/util/ArrayList;

    if-eqz v1, :cond_2

    new-instance p2, Leb/z;

    const/4 v1, 0x1

    invoke-direct {p2, p1, v1}, Leb/z;-><init>(Ljava/lang/String;I)V

    invoke-static {p0, p2}, Lm83/s;->j1(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    :cond_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    new-instance v0, Ll83/k;

    invoke-direct {v0, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static n()Z
    .locals 2

    const-string v0, "FragmentManager"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "FragmentNavigator"

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public final a()Leb/n0;
    .locals 1

    new-instance v0, Lhb/g;

    invoke-direct {v0, p0}, Leb/n0;-><init>(Leb/i1;)V

    return-object v0
.end method

.method public final d(Ljava/util/List;Leb/x0;)V
    .locals 7

    iget-object v0, p0, Lhb/f;->d:Landroidx/fragment/app/o1;

    invoke-virtual {v0}, Landroidx/fragment/app/o1;->Q()Z

    move-result v1

    const-string v2, "FragmentNavigator"

    if-eqz v1, :cond_0

    const-string p1, "Ignoring navigate() call: FragmentManager has already saved its state"

    invoke-static {v2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/q;

    invoke-virtual {p0}, Leb/i1;->b()Leb/t;

    move-result-object v3

    iget-object v3, v3, Leb/t;->e:Lec3/r1;

    iget-object v3, v3, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz p2, :cond_1

    if-nez v3, :cond_1

    iget-boolean v4, p2, Leb/x0;->b:Z

    if-eqz v4, :cond_1

    iget-object v4, p0, Lhb/f;->f:Ljava/util/LinkedHashSet;

    iget-object v5, v1, Leb/q;->F:Ljava/lang/String;

    invoke-interface {v4, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v3, v1, Leb/q;->F:Ljava/lang/String;

    new-instance v4, Landroidx/fragment/app/n1;

    const/4 v5, 0x0

    invoke-direct {v4, v0, v3, v5}, Landroidx/fragment/app/n1;-><init>(Landroidx/fragment/app/o1;Ljava/lang/String;I)V

    const/4 v3, 0x0

    invoke-virtual {v0, v4, v3}, Landroidx/fragment/app/o1;->x(Landroidx/fragment/app/k1;Z)V

    invoke-virtual {p0}, Leb/i1;->b()Leb/t;

    move-result-object v3

    invoke-virtual {v3, v1}, Leb/t;->i(Leb/q;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v1, p2}, Lhb/f;->m(Leb/q;Leb/x0;)Landroidx/fragment/app/a;

    move-result-object v4

    iget-object v5, v1, Leb/q;->F:Ljava/lang/String;

    if-nez v3, :cond_3

    invoke-virtual {p0}, Leb/i1;->b()Leb/t;

    move-result-object v3

    iget-object v3, v3, Leb/t;->e:Lec3/r1;

    iget-object v3, v3, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Leb/q;

    const/4 v6, 0x6

    if-eqz v3, :cond_2

    iget-object v3, v3, Leb/q;->F:Ljava/lang/String;

    invoke-static {p0, v3, v6}, Lhb/f;->k(Lhb/f;Ljava/lang/String;I)V

    :cond_2
    invoke-static {p0, v5, v6}, Lhb/f;->k(Lhb/f;Ljava/lang/String;I)V

    invoke-virtual {v4, v5}, Landroidx/fragment/app/c2;->c(Ljava/lang/String;)V

    :cond_3
    invoke-virtual {v4}, Landroidx/fragment/app/a;->j()I

    invoke-static {}, Lhb/f;->n()Z

    move-result v3

    if-eqz v3, :cond_4

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Calling pushWithTransition via navigate() on entry "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    invoke-virtual {p0}, Leb/i1;->b()Leb/t;

    move-result-object v3

    invoke-virtual {v3, v1}, Leb/t;->i(Leb/q;)V

    goto/16 :goto_0

    :cond_5
    return-void
.end method

.method public final e(Leb/t;)V
    .locals 3

    invoke-super {p0, p1}, Leb/i1;->e(Leb/t;)V

    invoke-static {}, Lhb/f;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "FragmentNavigator"

    const-string v1, "onAttach"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    new-instance v0, Lhb/e;

    invoke-direct {v0, p1, p0}, Lhb/e;-><init>(Leb/t;Lhb/f;)V

    iget-object v1, p0, Lhb/f;->d:Landroidx/fragment/app/o1;

    iget-object v2, v1, Landroidx/fragment/app/o1;->q:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lhb/i;

    invoke-direct {v0, p1, p0}, Lhb/i;-><init>(Leb/t;Lhb/f;)V

    iget-object p1, v1, Landroidx/fragment/app/o1;->o:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final f(Leb/q;)V
    .locals 6

    iget-object v0, p1, Leb/q;->F:Ljava/lang/String;

    iget-object v1, p0, Lhb/f;->d:Landroidx/fragment/app/o1;

    invoke-virtual {v1}, Landroidx/fragment/app/o1;->Q()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string p1, "FragmentNavigator"

    const-string v0, "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state"

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/4 v2, 0x0

    invoke-virtual {p0, p1, v2}, Lhb/f;->m(Leb/q;Leb/x0;)Landroidx/fragment/app/a;

    move-result-object v2

    invoke-virtual {p0}, Leb/i1;->b()Leb/t;

    move-result-object v3

    iget-object v3, v3, Leb/t;->e:Lec3/r1;

    iget-object v3, v3, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x1

    if-le v4, v5, :cond_2

    invoke-static {v3}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v4

    sub-int/2addr v4, v5

    invoke-static {v4, v3}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Leb/q;

    if-eqz v3, :cond_1

    iget-object v3, v3, Leb/q;->F:Ljava/lang/String;

    const/4 v4, 0x6

    invoke-static {p0, v3, v4}, Lhb/f;->k(Lhb/f;Ljava/lang/String;I)V

    :cond_1
    const/4 v3, 0x4

    invoke-static {p0, v0, v3}, Lhb/f;->k(Lhb/f;Ljava/lang/String;I)V

    new-instance v3, Landroidx/fragment/app/l1;

    const/4 v4, -0x1

    invoke-direct {v3, v1, v0, v4, v5}, Landroidx/fragment/app/l1;-><init>(Landroidx/fragment/app/o1;Ljava/lang/String;II)V

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4}, Landroidx/fragment/app/o1;->x(Landroidx/fragment/app/k1;Z)V

    const/4 v1, 0x2

    invoke-static {p0, v0, v1}, Lhb/f;->k(Lhb/f;Ljava/lang/String;I)V

    invoke-virtual {v2, v0}, Landroidx/fragment/app/c2;->c(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v2}, Landroidx/fragment/app/a;->j()I

    invoke-virtual {p0}, Leb/i1;->b()Leb/t;

    move-result-object v0

    invoke-virtual {v0, p1}, Leb/t;->c(Leb/q;)V

    return-void
.end method

.method public final g(Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "androidx-nav-fragment:navigator:savedIds"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lhb/f;->f:Ljava/util/LinkedHashSet;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    invoke-static {v0, p1}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    :cond_0
    return-void
.end method

.method public final h()Landroid/os/Bundle;
    .locals 3

    iget-object v0, p0, Lhb/f;->f:Ljava/util/LinkedHashSet;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v0, Ll83/k;

    const-string v2, "androidx-nav-fragment:navigator:savedIds"

    invoke-direct {v0, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public final i(Leb/q;Z)V
    .locals 11

    const-string v0, "popUpTo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lhb/f;->d:Landroidx/fragment/app/o1;

    invoke-virtual {v0}, Landroidx/fragment/app/o1;->Q()Z

    move-result v1

    const-string v2, "FragmentNavigator"

    if-eqz v1, :cond_0

    const-string p1, "Ignoring popBackStack() call: FragmentManager has already saved its state"

    invoke-static {v2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-virtual {p0}, Leb/i1;->b()Leb/t;

    move-result-object v1

    iget-object v1, v1, Leb/t;->e:Lec3/r1;

    iget-object v1, v1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v3

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    invoke-interface {v1, v3, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v4

    invoke-static {v1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Leb/q;

    const/4 v6, 0x1

    sub-int/2addr v3, v6

    invoke-static {v3, v1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/q;

    if-eqz v1, :cond_1

    iget-object v1, v1, Leb/q;->F:Ljava/lang/String;

    const/4 v3, 0x6

    invoke-static {p0, v1, v3}, Lhb/f;->k(Lhb/f;Ljava/lang/String;I)V

    :cond_1
    check-cast v4, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Leb/q;

    iget-object v9, p0, Lhb/f;->g:Ljava/util/ArrayList;

    invoke-static {v9}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object v9

    sget-object v10, Lhb/j;->w:Lhb/j;

    invoke-static {v9, v10}, Lxb3/k;->A(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/s;

    move-result-object v9

    iget-object v10, v8, Leb/q;->F:Ljava/lang/String;

    invoke-static {v9, v10}, Lxb3/k;->o(Lxb3/i;Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_3

    iget-object v8, v8, Leb/q;->F:Ljava/lang/String;

    iget-object v9, v5, Leb/q;->F:Ljava/lang/String;

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2

    :cond_3
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Leb/q;

    iget-object v3, v3, Leb/q;->F:Ljava/lang/String;

    const/4 v7, 0x4

    invoke-static {p0, v3, v7}, Lhb/f;->k(Lhb/f;Ljava/lang/String;I)V

    goto :goto_1

    :cond_5
    const/4 v1, 0x0

    if-eqz p2, :cond_7

    invoke-static {v4}, Lm83/s;->n1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Leb/q;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "FragmentManager cannot save the state of the initial destination "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_6
    iget-object v6, v4, Leb/q;->F:Ljava/lang/String;

    new-instance v7, Landroidx/fragment/app/n1;

    const/4 v8, 0x1

    invoke-direct {v7, v0, v6, v8}, Landroidx/fragment/app/n1;-><init>(Landroidx/fragment/app/o1;Ljava/lang/String;I)V

    invoke-virtual {v0, v7, v1}, Landroidx/fragment/app/o1;->x(Landroidx/fragment/app/k1;Z)V

    iget-object v6, p0, Lhb/f;->f:Ljava/util/LinkedHashSet;

    iget-object v4, v4, Leb/q;->F:Ljava/lang/String;

    invoke-interface {v6, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    iget-object v3, p1, Leb/q;->F:Ljava/lang/String;

    new-instance v4, Landroidx/fragment/app/l1;

    const/4 v5, -0x1

    invoke-direct {v4, v0, v3, v5, v6}, Landroidx/fragment/app/l1;-><init>(Landroidx/fragment/app/o1;Ljava/lang/String;II)V

    invoke-virtual {v0, v4, v1}, Landroidx/fragment/app/o1;->x(Landroidx/fragment/app/k1;Z)V

    :cond_8
    invoke-static {}, Lhb/f;->n()Z

    move-result v0

    if-eqz v0, :cond_9

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Calling popWithTransition via popBackStack() on entry "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " with savedState "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_9
    invoke-virtual {p0}, Leb/i1;->b()Leb/t;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Leb/t;->f(Leb/q;Z)V

    return-void
.end method

.method public final l(Landroidx/fragment/app/m0;Leb/q;Leb/t;)V
    .locals 5

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getViewModelStore()Landroidx/lifecycle/e2;

    move-result-object v0

    const-string v1, "fragment.viewModelStore"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lb0/b;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lb0/b;-><init>(I)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lhb/f$a;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    sget-object v4, Lhb/h;->w:Lhb/h;

    invoke-virtual {v1, v2, v4}, Lb0/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1}, Lb0/b;->c()Ll8/d;

    move-result-object v1

    sget-object v2, Ll8/a;->b:Ll8/a;

    const-string v4, "defaultCreationExtras"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lzt/q;

    invoke-direct {v4, v0, v1, v2}, Lzt/q;-><init>(Landroidx/lifecycle/e2;Landroidx/lifecycle/a2;Ll8/c;)V

    invoke-static {v3}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const-string v1, "modelClass"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1, v0}, Lzt/q;->w(Ljava/lang/String;Lj93/d;)Landroidx/lifecycle/w1;

    move-result-object v0

    check-cast v0, Lhb/f$a;

    new-instance v1, Ljava/lang/ref/WeakReference;

    new-instance v2, La3/m0;

    invoke-direct {v2, p2, p3, p0, p1}, La3/m0;-><init>(Leb/q;Leb/t;Lhb/f;Landroidx/fragment/app/m0;)V

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, Lhb/f$a;->w:Ljava/lang/ref/WeakReference;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Local and anonymous classes can not be ViewModels"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final m(Leb/q;Leb/x0;)Landroidx/fragment/app/a;
    .locals 7

    iget-object v0, p1, Leb/q;->x:Leb/n0;

    const-string v1, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lhb/g;

    invoke-virtual {p1}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0}, Lhb/g;->p()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x2e

    iget-object v5, p0, Lhb/f;->c:Landroid/content/Context;

    if-ne v3, v4, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    iget-object v3, p0, Lhb/f;->d:Landroidx/fragment/app/o1;

    invoke-virtual {v3}, Landroidx/fragment/app/o1;->J()Landroidx/fragment/app/w0;

    move-result-object v4

    invoke-virtual {v5}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v4, v5, v0}, Landroidx/fragment/app/w0;->a(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroidx/fragment/app/m0;

    move-result-object v0

    const-string v4, "fragmentManager.fragment\u2026t.classLoader, className)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroidx/fragment/app/m0;->setArguments(Landroid/os/Bundle;)V

    new-instance v1, Landroidx/fragment/app/a;

    invoke-direct {v1, v3}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/o1;)V

    const/4 v3, -0x1

    if-eqz p2, :cond_1

    iget v4, p2, Leb/x0;->f:I

    goto :goto_0

    :cond_1
    move v4, v3

    :goto_0
    if-eqz p2, :cond_2

    iget v5, p2, Leb/x0;->g:I

    goto :goto_1

    :cond_2
    move v5, v3

    :goto_1
    if-eqz p2, :cond_3

    iget v6, p2, Leb/x0;->h:I

    goto :goto_2

    :cond_3
    move v6, v3

    :goto_2
    if-eqz p2, :cond_4

    iget p2, p2, Leb/x0;->i:I

    goto :goto_3

    :cond_4
    move p2, v3

    :goto_3
    if-ne v4, v3, :cond_5

    if-ne v5, v3, :cond_5

    if-ne v6, v3, :cond_5

    if-eq p2, v3, :cond_a

    :cond_5
    if-eq v4, v3, :cond_6

    goto :goto_4

    :cond_6
    move v4, v2

    :goto_4
    if-eq v5, v3, :cond_7

    goto :goto_5

    :cond_7
    move v5, v2

    :goto_5
    if-eq v6, v3, :cond_8

    goto :goto_6

    :cond_8
    move v6, v2

    :goto_6
    if-eq p2, v3, :cond_9

    move v2, p2

    :cond_9
    invoke-virtual {v1, v4, v5, v6, v2}, Landroidx/fragment/app/c2;->f(IIII)V

    :cond_a
    iget p2, p0, Lhb/f;->e:I

    iget-object p1, p1, Leb/q;->F:Ljava/lang/String;

    invoke-virtual {v1, p2, v0, p1}, Landroidx/fragment/app/c2;->e(ILandroidx/fragment/app/m0;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Landroidx/fragment/app/a;->o(Landroidx/fragment/app/m0;)Landroidx/fragment/app/a;

    const/4 p1, 0x1

    iput-boolean p1, v1, Landroidx/fragment/app/c2;->r:Z

    return-object v1
.end method
