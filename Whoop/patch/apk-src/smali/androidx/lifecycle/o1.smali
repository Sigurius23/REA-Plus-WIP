.class public abstract Landroidx/lifecycle/o1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lqt/e;

.field public static final b:Lio/sentry/hints/j;

.field public static final c:Lqt/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqt/e;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lqt/e;-><init>(I)V

    sput-object v0, Landroidx/lifecycle/o1;->a:Lqt/e;

    new-instance v0, Lio/sentry/hints/j;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lio/sentry/hints/j;-><init>(I)V

    sput-object v0, Landroidx/lifecycle/o1;->b:Lio/sentry/hints/j;

    new-instance v0, Lqt/e;

    invoke-direct {v0, v1}, Lqt/e;-><init>(I)V

    sput-object v0, Landroidx/lifecycle/o1;->c:Lqt/e;

    return-void
.end method

.method public static final a(Landroidx/lifecycle/p0;)Lec3/l;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La6/c;

    const/4 v1, 0x0

    const/4 v2, 0x5

    invoke-direct {v0, p0, v1, v2}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0}, Lec3/v;->j(Lc93/m;)Lec3/c;

    move-result-object p0

    const/4 v0, -0x1

    const/4 v1, 0x2

    invoke-static {p0, v0, v1}, Lec3/v;->i(Lec3/l;II)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;
    .locals 2

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Lq83/k;->w:Lq83/k;

    :cond_0
    const-string p2, "<this>"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Le;

    const/4 v0, 0x0

    const/16 v1, 0x8

    invoke-direct {p2, p0, v0, v1}, Le;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {p1, p2}, Landroidx/lifecycle/x1;->c(Lq83/j;Lc93/m;)Landroidx/lifecycle/j;

    move-result-object p1

    instance-of p2, p0, Lec3/f2;

    if-eqz p2, :cond_2

    invoke-static {}, Lt/a;->V()Lt/a;

    move-result-object p2

    iget-object p2, p2, Lt/a;->a:Lt/b;

    invoke-virtual {p2}, Lt/b;->V()Z

    move-result p2

    if-eqz p2, :cond_1

    check-cast p0, Lec3/f2;

    invoke-interface {p0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroidx/lifecycle/u0;->setValue(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    check-cast p0, Lec3/f2;

    invoke-interface {p0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    :cond_2
    return-object p1
.end method

.method public static final c(Landroidx/lifecycle/w1;Lpb/d;Landroidx/lifecycle/x;)V
    .locals 1

    const-string v0, "registry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "androidx.lifecycle.savedstate.vm.tag"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/w1;->getCloseable(Ljava/lang/String;)Ljava/lang/AutoCloseable;

    move-result-object p0

    check-cast p0, Landroidx/lifecycle/m1;

    if-eqz p0, :cond_0

    iget-boolean v0, p0, Landroidx/lifecycle/m1;->y:Z

    if-nez v0, :cond_0

    invoke-virtual {p0, p2, p1}, Landroidx/lifecycle/m1;->b(Landroidx/lifecycle/x;Lpb/d;)V

    invoke-static {p2, p1}, Landroidx/lifecycle/o1;->q(Landroidx/lifecycle/x;Lpb/d;)V

    :cond_0
    return-void
.end method

.method public static final d(Lpb/d;Landroidx/lifecycle/x;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/m1;
    .locals 4

    const-string v0, "registry"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lpb/d;->a(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p3, v0

    :goto_0
    if-nez p3, :cond_1

    new-instance p3, Landroidx/lifecycle/k1;

    invoke-direct {p3}, Landroidx/lifecycle/k1;-><init>()V

    goto :goto_2

    :cond_1
    const-class v0, Landroidx/lifecycle/k1;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    invoke-virtual {p3}, Landroid/os/BaseBundle;->size()I

    move-result v0

    new-instance v1, Ln83/f;

    invoke-direct {v1, v0}, Ln83/f;-><init>(I)V

    invoke-virtual {p3}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p3, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ln83/f;->b()Ln83/f;

    move-result-object p3

    new-instance v0, Landroidx/lifecycle/k1;

    invoke-direct {v0, p3}, Landroidx/lifecycle/k1;-><init>(Ln83/f;)V

    move-object p3, v0

    :goto_2
    new-instance v0, Landroidx/lifecycle/m1;

    invoke-direct {v0, p2, p3}, Landroidx/lifecycle/m1;-><init>(Ljava/lang/String;Landroidx/lifecycle/k1;)V

    invoke-virtual {v0, p1, p0}, Landroidx/lifecycle/m1;->b(Landroidx/lifecycle/x;Lpb/d;)V

    invoke-static {p1, p0}, Landroidx/lifecycle/o1;->q(Landroidx/lifecycle/x;Lpb/d;)V

    return-object v0
.end method

.method public static final e(Ll8/c;)Landroidx/lifecycle/k1;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/lifecycle/o1;->a:Lqt/e;

    invoke-virtual {p0, v0}, Ll8/c;->a(Ll8/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpb/f;

    if-eqz v0, :cond_c

    sget-object v1, Landroidx/lifecycle/o1;->b:Lio/sentry/hints/j;

    invoke-virtual {p0, v1}, Ll8/c;->a(Ll8/b;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/f2;

    if-eqz v1, :cond_b

    sget-object v2, Landroidx/lifecycle/o1;->c:Lqt/e;

    invoke-virtual {p0, v2}, Ll8/c;->a(Ll8/b;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Bundle;

    sget-object v3, Landroidx/lifecycle/d2;->b:Lio/sentry/hints/j;

    invoke-virtual {p0, v3}, Ll8/c;->a(Ll8/b;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_a

    invoke-interface {v0}, Lpb/f;->getSavedStateRegistry()Lpb/d;

    move-result-object v0

    invoke-virtual {v0}, Lpb/d;->b()Lpb/c;

    move-result-object v0

    instance-of v3, v0, Landroidx/lifecycle/q1;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    check-cast v0, Landroidx/lifecycle/q1;

    goto :goto_0

    :cond_0
    move-object v0, v4

    :goto_0
    if-eqz v0, :cond_9

    invoke-static {v1}, Landroidx/lifecycle/o1;->k(Landroidx/lifecycle/f2;)Landroidx/lifecycle/r1;

    move-result-object v1

    iget-object v1, v1, Landroidx/lifecycle/r1;->w:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/lifecycle/k1;

    if-nez v3, :cond_8

    invoke-virtual {v0}, Landroidx/lifecycle/q1;->b()V

    iget-object v3, v0, Landroidx/lifecycle/q1;->c:Landroid/os/Bundle;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3, p0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v3, p0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v5

    if-nez v5, :cond_3

    const/4 v5, 0x0

    new-array v6, v5, [Ll83/k;

    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Ll83/k;

    invoke-static {v5}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object v5

    :cond_3
    invoke-virtual {v3, p0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    iput-object v4, v0, Landroidx/lifecycle/q1;->c:Landroid/os/Bundle;

    :cond_4
    move-object v4, v5

    :goto_1
    if-nez v4, :cond_5

    goto :goto_2

    :cond_5
    move-object v2, v4

    :goto_2
    if-nez v2, :cond_6

    new-instance v0, Landroidx/lifecycle/k1;

    invoke-direct {v0}, Landroidx/lifecycle/k1;-><init>()V

    goto :goto_4

    :cond_6
    const-class v0, Landroidx/lifecycle/k1;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    invoke-virtual {v2}, Landroid/os/BaseBundle;->size()I

    move-result v0

    new-instance v3, Ln83/f;

    invoke-direct {v3, v0}, Ln83/f;-><init>(I)V

    invoke-virtual {v2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_7
    invoke-virtual {v3}, Ln83/f;->b()Ln83/f;

    move-result-object v0

    new-instance v2, Landroidx/lifecycle/k1;

    invoke-direct {v2, v0}, Landroidx/lifecycle/k1;-><init>(Ln83/f;)V

    move-object v0, v2

    :goto_4
    invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :cond_8
    return-object v3

    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "enableSavedStateHandles() wasn\'t called prior to createSavedStateHandle() call"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "CreationExtras must have a value by `VIEW_MODEL_KEY`"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final f(Lpb/f;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/w;->x:Landroidx/lifecycle/w;

    if-eq v0, v1, :cond_1

    sget-object v1, Landroidx/lifecycle/w;->y:Landroidx/lifecycle/w;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Lpb/f;->getSavedStateRegistry()Lpb/d;

    move-result-object v0

    invoke-virtual {v0}, Lpb/d;->b()Lpb/c;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Landroidx/lifecycle/q1;

    invoke-interface {p0}, Lpb/f;->getSavedStateRegistry()Lpb/d;

    move-result-object v1

    move-object v2, p0

    check-cast v2, Landroidx/lifecycle/f2;

    invoke-direct {v0, v1, v2}, Landroidx/lifecycle/q1;-><init>(Lpb/d;Landroidx/lifecycle/f2;)V

    invoke-interface {p0}, Lpb/f;->getSavedStateRegistry()Lpb/d;

    move-result-object v1

    const-string v2, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    invoke-virtual {v1, v2, v0}, Lpb/d;->c(Ljava/lang/String;Lpb/c;)V

    invoke-interface {p0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p0

    new-instance v1, Landroidx/lifecycle/l1;

    invoke-direct {v1, v0}, Landroidx/lifecycle/l1;-><init>(Landroidx/lifecycle/q1;)V

    invoke-virtual {p0, v1}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    :cond_2
    return-void
.end method

.method public static final g(Landroid/view/View;)Landroidx/lifecycle/g0;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    const/4 v0, 0x0

    if-eqz p0, :cond_3

    const v1, 0x7f0a0d66

    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Landroidx/lifecycle/g0;

    if-eqz v2, :cond_0

    check-cast v1, Landroidx/lifecycle/g0;

    goto :goto_1

    :cond_0
    move-object v1, v0

    :goto_1
    if-eqz v1, :cond_1

    return-object v1

    :cond_1
    invoke-static {p0}, Ldt/b;->v(Landroid/view/View;)Landroid/view/ViewParent;

    move-result-object p0

    instance-of v1, p0, Landroid/view/View;

    if-eqz v1, :cond_2

    check-cast p0, Landroid/view/View;

    goto :goto_0

    :cond_2
    move-object p0, v0

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public static final h(Landroid/view/View;)Landroidx/lifecycle/f2;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    const/4 v0, 0x0

    if-eqz p0, :cond_3

    const v1, 0x7f0a0d69

    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Landroidx/lifecycle/f2;

    if-eqz v2, :cond_0

    check-cast v1, Landroidx/lifecycle/f2;

    goto :goto_1

    :cond_0
    move-object v1, v0

    :goto_1
    if-eqz v1, :cond_1

    return-object v1

    :cond_1
    invoke-static {p0}, Ldt/b;->v(Landroid/view/View;)Landroid/view/ViewParent;

    move-result-object p0

    instance-of v1, p0, Landroid/view/View;

    if-eqz v1, :cond_2

    check-cast p0, Landroid/view/View;

    goto :goto_0

    :cond_2
    move-object p0, v0

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public static final i(Landroidx/lifecycle/x;)Landroidx/lifecycle/b0;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p0}, Landroidx/lifecycle/x;->c()Landroidx/lifecycle/c;

    move-result-object v0

    iget-object v0, v0, Landroidx/lifecycle/c;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/b0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Landroidx/lifecycle/b0;

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v1

    sget-object v2, Lbc3/q0;->a:Lkc3/e;

    sget-object v2, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v2}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v2

    invoke-static {v1, v2}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroidx/lifecycle/b0;-><init>(Landroidx/lifecycle/x;Lq83/j;)V

    invoke-virtual {p0}, Landroidx/lifecycle/x;->c()Landroidx/lifecycle/c;

    move-result-object v1

    iget-object v1, v1, Landroidx/lifecycle/c;->a:Ljava/util/concurrent/atomic/AtomicReference;

    :cond_1
    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object p0, Lbc3/q0;->a:Lkc3/e;

    sget-object p0, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {p0}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object p0

    new-instance v1, La6/q;

    const/4 v3, 0x3

    invoke-direct {v1, v0, v2, v3}, La6/q;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v3, 0x2

    invoke-static {v0, p0, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-object v0

    :cond_2
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    goto :goto_0
.end method

.method public static final j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p0

    invoke-static {p0}, Landroidx/lifecycle/o1;->i(Landroidx/lifecycle/x;)Landroidx/lifecycle/b0;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Landroidx/lifecycle/f2;)Landroidx/lifecycle/r1;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/lifecycle/n1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x4

    invoke-static {p0, v0, v1}, Lqt/e;->f(Landroidx/lifecycle/f2;Landroidx/lifecycle/n1;I)Landroidx/lifecycle/d2;

    move-result-object p0

    const-class v0, Landroidx/lifecycle/r1;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const-string v1, "modelClass"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Landroidx/lifecycle/d2;->a:Ljava/lang/Object;

    check-cast p0, Lzt/q;

    const-string v1, "androidx.lifecycle.internal.SavedStateHandlesVM"

    invoke-virtual {p0, v1, v0}, Lzt/q;->w(Ljava/lang/String;Lj93/d;)Landroidx/lifecycle/w1;

    move-result-object p0

    check-cast p0, Landroidx/lifecycle/r1;

    return-object p0
.end method

.method public static final l(Landroidx/lifecycle/x;Landroidx/lifecycle/w;Lc93/m;Ls83/i;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Landroidx/lifecycle/w;->x:Landroidx/lifecycle/w;

    if-eq p1, v0, :cond_2

    invoke-virtual {p0}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/w;->w:Landroidx/lifecycle/w;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Landroidx/lifecycle/y0;

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v2 .. v7}, Landroidx/lifecycle/y0;-><init>(Landroidx/lifecycle/x;Landroidx/lifecycle/w;Lc93/m;Lq83/d;I)V

    invoke-static {v2, p3}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_1

    return-object p0

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final m(Landroidx/lifecycle/g0;Landroidx/lifecycle/w;Lc93/m;Ls83/i;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p0

    invoke-static {p0, p1, p2, p3}, Landroidx/lifecycle/o1;->l(Landroidx/lifecycle/x;Landroidx/lifecycle/w;Lc93/m;Ls83/i;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final n(Landroid/view/View;Landroidx/lifecycle/g0;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a0d66

    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public static final o(Landroid/view/View;Landroidx/lifecycle/f2;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a0d69

    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public static final p(Landroidx/lifecycle/x;Landroidx/lifecycle/w;ZLbc3/w1;Lc93/a;Ls83/c;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lbc3/m;

    invoke-static {p5}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p5

    const/4 v1, 0x1

    invoke-direct {v0, v1, p5}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    new-instance p5, Landroidx/lifecycle/i2;

    invoke-direct {p5, p1, p0, v0, p4}, Landroidx/lifecycle/i2;-><init>(Landroidx/lifecycle/w;Landroidx/lifecycle/x;Lbc3/m;Lc93/a;)V

    const/4 p1, 0x0

    if-eqz p2, :cond_0

    new-instance p2, Landroidx/lifecycle/g2;

    invoke-direct {p2, p0, p5, p1}, Landroidx/lifecycle/g2;-><init>(Landroidx/lifecycle/x;Landroidx/lifecycle/i2;I)V

    sget-object p4, Lq83/k;->w:Lq83/k;

    invoke-virtual {p3, p4, p2}, Lbc3/z;->dispatch(Lq83/j;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p5}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    :goto_0
    new-instance p2, Landroidx/lifecycle/h2;

    invoke-direct {p2, p3, p0, p5, p1}, Landroidx/lifecycle/h2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, p2}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p0
.end method

.method public static q(Landroidx/lifecycle/x;Lpb/d;)V
    .locals 2

    invoke-virtual {p0}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/w;->x:Landroidx/lifecycle/w;

    if-eq v0, v1, :cond_1

    sget-object v1, Landroidx/lifecycle/w;->z:Landroidx/lifecycle/w;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/lifecycle/l;

    invoke-direct {v0, p0, p1}, Landroidx/lifecycle/l;-><init>(Landroidx/lifecycle/x;Lpb/d;)V

    invoke-virtual {p0, v0}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    return-void

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lpb/d;->d()V

    return-void
.end method

.method public static final r(Landroidx/lifecycle/x;Landroidx/lifecycle/w;Lc93/m;Ls83/i;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v0}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v0

    new-instance v1, Landroidx/lifecycle/y0;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Landroidx/lifecycle/y0;-><init>(Landroidx/lifecycle/x;Landroidx/lifecycle/w;Lc93/m;Lq83/d;I)V

    invoke-static {v0, v1, p3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
