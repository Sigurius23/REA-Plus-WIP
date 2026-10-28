.class public final Lio/sentry/android/fragment/c;
.super Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;
.source "SourceFile"


# instance fields
.field public final a:Lio/sentry/d1;

.field public final b:Ljava/util/Set;

.field public final c:Z

.field public final d:Ljava/util/WeakHashMap;


# direct methods
.method public constructor <init>(Lio/sentry/i4;Ljava/util/Set;Z)V
    .locals 1

    const-string v0, "scopes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filterFragmentLifecycleBreadcrumbs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;-><init>()V

    iput-object p1, p0, Lio/sentry/android/fragment/c;->a:Lio/sentry/d1;

    iput-object p2, p0, Lio/sentry/android/fragment/c;->b:Ljava/util/Set;

    iput-boolean p3, p0, Lio/sentry/android/fragment/c;->c:Z

    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, Lio/sentry/android/fragment/c;->d:Ljava/util/WeakHashMap;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;Landroidx/fragment/app/r0;)V
    .locals 0

    const-string p1, "fragment"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "context"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lio/sentry/android/fragment/b;->ATTACHED:Lio/sentry/android/fragment/b;

    invoke-virtual {p0, p2, p1}, Lio/sentry/android/fragment/c;->l(Landroidx/fragment/app/m0;Lio/sentry/android/fragment/b;)V

    return-void
.end method

.method public final b(Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;)V
    .locals 4

    const-string p1, "fragment"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lio/sentry/android/fragment/b;->CREATED:Lio/sentry/android/fragment/b;

    invoke-virtual {p0, p2, p1}, Lio/sentry/android/fragment/c;->l(Landroidx/fragment/app/m0;Lio/sentry/android/fragment/b;)V

    invoke-virtual {p2}, Landroidx/fragment/app/m0;->isAdded()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lio/sentry/android/fragment/c;->a:Lio/sentry/d1;

    invoke-interface {p1}, Lio/sentry/d1;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->isEnableScreenTracking()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/whoop/data/repositories/c;

    const/16 v1, 0x9

    invoke-direct {v0, v1, p0, p2}, Lcom/whoop/data/repositories/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Lio/sentry/d1;->s(Lio/sentry/e4;)V

    :cond_0
    invoke-interface {p1}, Lio/sentry/d1;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->isTracingEnabled()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lio/sentry/android/fragment/c;->c:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lio/sentry/android/fragment/c;->d:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p2}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    new-instance v1, Lkotlin/jvm/internal/g0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Lcom/whoop/data/repositories/c;

    const/16 v3, 0xa

    invoke-direct {v2, v1, v3}, Lcom/whoop/data/repositories/c;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p1, v2}, Lio/sentry/d1;->s(Lio/sentry/e4;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    :cond_2
    iget-object v1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Lio/sentry/l1;

    if-eqz v1, :cond_3

    const-string v2, "ui.load"

    invoke-interface {v1, v2, p1}, Lio/sentry/l1;->w(Ljava/lang/String;Ljava/lang/String;)Lio/sentry/l1;

    move-result-object p1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_4

    invoke-virtual {v0, p2, p1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lio/sentry/l1;->t()Lio/sentry/e7;

    move-result-object p1

    const-string p2, "auto.ui.fragment"

    iput-object p2, p1, Lio/sentry/e7;->I:Ljava/lang/String;

    :cond_4
    :goto_1
    return-void
.end method

.method public final c(Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;)V
    .locals 0

    const-string p1, "fragment"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lio/sentry/android/fragment/b;->DESTROYED:Lio/sentry/android/fragment/b;

    invoke-virtual {p0, p2, p1}, Lio/sentry/android/fragment/c;->l(Landroidx/fragment/app/m0;Lio/sentry/android/fragment/b;)V

    invoke-virtual {p0, p2}, Lio/sentry/android/fragment/c;->m(Landroidx/fragment/app/m0;)V

    return-void
.end method

.method public final d(Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;)V
    .locals 0

    const-string p1, "fragment"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lio/sentry/android/fragment/b;->DETACHED:Lio/sentry/android/fragment/b;

    invoke-virtual {p0, p2, p1}, Lio/sentry/android/fragment/c;->l(Landroidx/fragment/app/m0;Lio/sentry/android/fragment/b;)V

    return-void
.end method

.method public final e(Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;)V
    .locals 0

    const-string p1, "fragment"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lio/sentry/android/fragment/b;->PAUSED:Lio/sentry/android/fragment/b;

    invoke-virtual {p0, p2, p1}, Lio/sentry/android/fragment/c;->l(Landroidx/fragment/app/m0;Lio/sentry/android/fragment/b;)V

    return-void
.end method

.method public final f(Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;)V
    .locals 0

    const-string p1, "fragment"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lio/sentry/android/fragment/b;->RESUMED:Lio/sentry/android/fragment/b;

    invoke-virtual {p0, p2, p1}, Lio/sentry/android/fragment/c;->l(Landroidx/fragment/app/m0;Lio/sentry/android/fragment/b;)V

    return-void
.end method

.method public final g(Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;Landroid/os/Bundle;)V
    .locals 0

    const-string p1, "fragment"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lio/sentry/android/fragment/b;->SAVE_INSTANCE_STATE:Lio/sentry/android/fragment/b;

    invoke-virtual {p0, p2, p1}, Lio/sentry/android/fragment/c;->l(Landroidx/fragment/app/m0;Lio/sentry/android/fragment/b;)V

    return-void
.end method

.method public final h(Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;)V
    .locals 0

    const-string p1, "fragment"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lio/sentry/android/fragment/b;->STARTED:Lio/sentry/android/fragment/b;

    invoke-virtual {p0, p2, p1}, Lio/sentry/android/fragment/c;->l(Landroidx/fragment/app/m0;Lio/sentry/android/fragment/b;)V

    invoke-virtual {p0, p2}, Lio/sentry/android/fragment/c;->m(Landroidx/fragment/app/m0;)V

    return-void
.end method

.method public final i(Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;)V
    .locals 0

    const-string p1, "fragment"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lio/sentry/android/fragment/b;->STOPPED:Lio/sentry/android/fragment/b;

    invoke-virtual {p0, p2, p1}, Lio/sentry/android/fragment/c;->l(Landroidx/fragment/app/m0;Lio/sentry/android/fragment/b;)V

    return-void
.end method

.method public final j(Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;Landroid/view/View;)V
    .locals 0

    const-string p1, "fragment"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "view"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lio/sentry/android/fragment/b;->VIEW_CREATED:Lio/sentry/android/fragment/b;

    invoke-virtual {p0, p2, p1}, Lio/sentry/android/fragment/c;->l(Landroidx/fragment/app/m0;Lio/sentry/android/fragment/b;)V

    return-void
.end method

.method public final k(Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;)V
    .locals 0

    const-string p1, "fragment"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lio/sentry/android/fragment/b;->VIEW_DESTROYED:Lio/sentry/android/fragment/b;

    invoke-virtual {p0, p2, p1}, Lio/sentry/android/fragment/c;->l(Landroidx/fragment/app/m0;Lio/sentry/android/fragment/b;)V

    return-void
.end method

.method public final l(Landroidx/fragment/app/m0;Lio/sentry/android/fragment/b;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/fragment/c;->b:Ljava/util/Set;

    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lio/sentry/e;

    invoke-direct {v0}, Lio/sentry/e;-><init>()V

    const-string v1, "navigation"

    iput-object v1, v0, Lio/sentry/e;->E:Ljava/lang/String;

    const-string v1, "state"

    invoke-virtual {p2}, Lio/sentry/android/fragment/b;->getBreadcrumbName$sentry_android_fragment_release()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2, v1}, Lio/sentry/e;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    :cond_1
    const-string v1, "screen"

    invoke-virtual {v0, p2, v1}, Lio/sentry/e;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "ui.fragment.lifecycle"

    iput-object p2, v0, Lio/sentry/e;->G:Ljava/lang/String;

    sget-object p2, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    iput-object p2, v0, Lio/sentry/e;->I:Lio/sentry/n5;

    new-instance p2, Lio/sentry/g0;

    invoke-direct {p2}, Lio/sentry/g0;-><init>()V

    const-string v1, "android:fragment"

    invoke-virtual {p2, p1, v1}, Lio/sentry/g0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/sentry/android/fragment/c;->a:Lio/sentry/d1;

    invoke-interface {p1, v0, p2}, Lio/sentry/d1;->i(Lio/sentry/e;Lio/sentry/g0;)V

    return-void
.end method

.method public final m(Landroidx/fragment/app/m0;)V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/fragment/c;->a:Lio/sentry/d1;

    invoke-interface {v0}, Lio/sentry/d1;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->isTracingEnabled()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lio/sentry/android/fragment/c;->c:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/android/fragment/c;->d:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/l1;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Lio/sentry/l1;->c()Lio/sentry/i7;

    move-result-object v2

    if-nez v2, :cond_1

    sget-object v2, Lio/sentry/i7;->OK:Lio/sentry/i7;

    :cond_1
    invoke-interface {v1, v2}, Lio/sentry/l1;->l(Lio/sentry/i7;)V

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/l1;

    :cond_2
    :goto_0
    return-void
.end method
