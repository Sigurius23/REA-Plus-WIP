.class public final Lhb/d;
.super Leb/i1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Leb/i1;"
    }
.end annotation

.annotation runtime Leb/h1;
    value = "dialog"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lhb/d;",
        "Leb/i1;",
        "Lhb/b;",
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

.field public final e:Ljava/util/LinkedHashSet;

.field public final f:Lpb/a;

.field public final g:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/fragment/app/o1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb/d;->c:Landroid/content/Context;

    iput-object p2, p0, Lhb/d;->d:Landroidx/fragment/app/o1;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lhb/d;->e:Ljava/util/LinkedHashSet;

    new-instance p1, Lpb/a;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p2}, Lpb/a;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lhb/d;->f:Lpb/a;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lhb/d;->g:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public final a()Leb/n0;
    .locals 1

    new-instance v0, Lhb/b;

    invoke-direct {v0, p0}, Leb/n0;-><init>(Leb/i1;)V

    return-object v0
.end method

.method public final d(Ljava/util/List;Leb/x0;)V
    .locals 4

    iget-object p2, p0, Lhb/d;->d:Landroidx/fragment/app/o1;

    invoke-virtual {p2}, Landroidx/fragment/app/o1;->Q()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "DialogFragmentNavigator"

    const-string p2, "Ignoring navigate() call: FragmentManager has already saved its state"

    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/q;

    invoke-virtual {p0, v0}, Lhb/d;->k(Leb/q;)Landroidx/fragment/app/y;

    move-result-object v1

    iget-object v2, v0, Leb/q;->F:Ljava/lang/String;

    invoke-virtual {v1, p2, v2}, Landroidx/fragment/app/y;->show(Landroidx/fragment/app/o1;Ljava/lang/String;)V

    invoke-virtual {p0}, Leb/i1;->b()Leb/t;

    move-result-object v1

    iget-object v1, v1, Leb/t;->e:Lec3/r1;

    iget-object v1, v1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v1}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/q;

    invoke-virtual {p0}, Leb/i1;->b()Leb/t;

    move-result-object v2

    iget-object v2, v2, Leb/t;->f:Lec3/r1;

    iget-object v2, v2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2, v1}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {p0}, Leb/i1;->b()Leb/t;

    move-result-object v3

    invoke-virtual {v3, v0}, Leb/t;->i(Leb/q;)V

    if-eqz v1, :cond_1

    if-nez v2, :cond_1

    invoke-virtual {p0}, Leb/i1;->b()Leb/t;

    move-result-object v0

    invoke-virtual {v0, v1}, Leb/t;->b(Leb/q;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final e(Leb/t;)V
    .locals 3

    invoke-super {p0, p1}, Leb/i1;->e(Leb/t;)V

    iget-object p1, p1, Leb/t;->e:Lec3/r1;

    iget-object p1, p1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    iget-object v1, p0, Lhb/d;->d:Landroidx/fragment/app/o1;

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/q;

    iget-object v2, v0, Leb/q;->F:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroidx/fragment/app/o1;->E(Ljava/lang/String;)Landroidx/fragment/app/m0;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/y;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/fragment/app/m0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lhb/d;->f:Lpb/a;

    invoke-virtual {v1, v0}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lhb/d;->e:Ljava/util/LinkedHashSet;

    iget-object v0, v0, Leb/q;->F:Ljava/lang/String;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p1, Lhb/a;

    invoke-direct {p1, p0}, Lhb/a;-><init>(Lhb/d;)V

    iget-object v0, v1, Landroidx/fragment/app/o1;->q:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final f(Leb/q;)V
    .locals 6

    iget-object v0, p1, Leb/q;->F:Ljava/lang/String;

    iget-object v1, p0, Lhb/d;->d:Landroidx/fragment/app/o1;

    invoke-virtual {v1}, Landroidx/fragment/app/o1;->Q()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string p1, "DialogFragmentNavigator"

    const-string v0, "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state"

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v2, p0, Lhb/d;->g:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/y;

    const/4 v3, 0x0

    if-nez v2, :cond_2

    invoke-virtual {v1, v0}, Landroidx/fragment/app/o1;->E(Ljava/lang/String;)Landroidx/fragment/app/m0;

    move-result-object v2

    instance-of v4, v2, Landroidx/fragment/app/y;

    if-eqz v4, :cond_1

    check-cast v2, Landroidx/fragment/app/y;

    goto :goto_0

    :cond_1
    move-object v2, v3

    :cond_2
    :goto_0
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroidx/fragment/app/m0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v4

    iget-object v5, p0, Lhb/d;->f:Lpb/a;

    invoke-virtual {v4, v5}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    invoke-virtual {v2}, Landroidx/fragment/app/y;->dismiss()V

    :cond_3
    invoke-virtual {p0, p1}, Lhb/d;->k(Leb/q;)Landroidx/fragment/app/y;

    move-result-object v2

    invoke-virtual {v2, v1, v0}, Landroidx/fragment/app/y;->show(Landroidx/fragment/app/o1;Ljava/lang/String;)V

    invoke-virtual {p0}, Leb/i1;->b()Leb/t;

    move-result-object v1

    iget-object v2, v1, Leb/t;->e:Lec3/r1;

    iget-object v2, v2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    invoke-interface {v2, v4}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v2

    :cond_4
    invoke-interface {v2}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v2}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Leb/q;

    iget-object v5, v4, Leb/q;->F:Ljava/lang/String;

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    iget-object v0, v1, Leb/t;->c:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Set;

    invoke-static {v4, v2}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v2

    invoke-static {p1, v2}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {v1, p1}, Leb/t;->c(Leb/q;)V

    return-void

    :cond_5
    new-instance p1, Ljava/util/NoSuchElementException;

    const-string v0, "List contains no element matching the predicate."

    invoke-direct {p1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final i(Leb/q;Z)V
    .locals 4

    const-string v0, "popUpTo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lhb/d;->d:Landroidx/fragment/app/o1;

    invoke-virtual {v0}, Landroidx/fragment/app/o1;->Q()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p1, "DialogFragmentNavigator"

    const-string p2, "Ignoring popBackStack() call: FragmentManager has already saved its state"

    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

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

    move-result v2

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    invoke-interface {v1, v2, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->n1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Leb/q;

    iget-object v3, v3, Leb/q;->F:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroidx/fragment/app/o1;->E(Ljava/lang/String;)Landroidx/fragment/app/m0;

    move-result-object v3

    if-eqz v3, :cond_1

    check-cast v3, Landroidx/fragment/app/y;

    invoke-virtual {v3}, Landroidx/fragment/app/y;->dismiss()V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v2, p1, p2}, Lhb/d;->l(ILeb/q;Z)V

    return-void
.end method

.method public final k(Leb/q;)Landroidx/fragment/app/y;
    .locals 6

    iget-object v0, p1, Leb/q;->x:Leb/n0;

    const-string v1, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lhb/b;

    iget-object v1, v0, Lhb/b;->L:Ljava/lang/String;

    const-string v2, "DialogFragment class was not set"

    if-eqz v1, :cond_3

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x2e

    iget-object v5, p0, Lhb/d;->c:Landroid/content/Context;

    if-ne v3, v4, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_0
    iget-object v3, p0, Lhb/d;->d:Landroidx/fragment/app/o1;

    invoke-virtual {v3}, Landroidx/fragment/app/o1;->J()Landroidx/fragment/app/w0;

    move-result-object v3

    invoke-virtual {v5}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v3, v4, v1}, Landroidx/fragment/app/w0;->a(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroidx/fragment/app/m0;

    move-result-object v1

    const-string v3, "fragmentManager.fragment\u2026t.classLoader, className)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Landroidx/fragment/app/y;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_1

    check-cast v1, Landroidx/fragment/app/y;

    invoke-virtual {p1}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroidx/fragment/app/m0;->setArguments(Landroid/os/Bundle;)V

    invoke-virtual {v1}, Landroidx/fragment/app/m0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v0

    iget-object v2, p0, Lhb/d;->f:Lpb/a;

    invoke-virtual {v0, v2}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    iget-object v0, p0, Lhb/d;->g:Ljava/util/LinkedHashMap;

    iget-object p1, p1, Leb/q;->F:Ljava/lang/String;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Dialog destination "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Lhb/b;->L:Ljava/lang/String;

    if-eqz v0, :cond_2

    const-string v1, " is not an instance of DialogFragment"

    invoke-static {v0, v1, p1}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final l(ILeb/q;Z)V
    .locals 2

    invoke-virtual {p0}, Leb/i1;->b()Leb/t;

    move-result-object v0

    iget-object v0, v0, Leb/t;->e:Lec3/r1;

    iget-object v0, v0, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    add-int/lit8 p1, p1, -0x1

    invoke-static {p1, v0}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leb/q;

    invoke-virtual {p0}, Leb/i1;->b()Leb/t;

    move-result-object v0

    iget-object v0, v0, Leb/t;->f:Lec3/r1;

    iget-object v0, v0, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0, p1}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p0}, Leb/i1;->b()Leb/t;

    move-result-object v1

    invoke-virtual {v1, p2, p3}, Leb/t;->f(Leb/q;Z)V

    if-eqz p1, :cond_0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Leb/i1;->b()Leb/t;

    move-result-object p2

    invoke-virtual {p2, p1}, Leb/t;->b(Leb/q;)V

    :cond_0
    return-void
.end method
