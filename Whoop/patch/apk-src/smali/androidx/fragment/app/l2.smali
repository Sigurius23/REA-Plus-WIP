.class public final Landroidx/fragment/app/l2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/r;
.implements Lpb/f;
.implements Landroidx/lifecycle/f2;


# instance fields
.field public E:Landroidx/lifecycle/i0;

.field public F:Lpb/e;

.field public final w:Landroidx/fragment/app/m0;

.field public final x:Landroidx/lifecycle/e2;

.field public final y:Landroidx/fragment/app/z;

.field public z:Landroidx/lifecycle/a2;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/m0;Landroidx/lifecycle/e2;Landroidx/fragment/app/z;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/l2;->E:Landroidx/lifecycle/i0;

    iput-object v0, p0, Landroidx/fragment/app/l2;->F:Lpb/e;

    iput-object p1, p0, Landroidx/fragment/app/l2;->w:Landroidx/fragment/app/m0;

    iput-object p2, p0, Landroidx/fragment/app/l2;->x:Landroidx/lifecycle/e2;

    iput-object p3, p0, Landroidx/fragment/app/l2;->y:Landroidx/fragment/app/z;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/v;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/l2;->E:Landroidx/lifecycle/i0;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/i0;->g(Landroidx/lifecycle/v;)V

    return-void
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/l2;->E:Landroidx/lifecycle/i0;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/lifecycle/i0;

    invoke-direct {v0, p0}, Landroidx/lifecycle/i0;-><init>(Landroidx/lifecycle/g0;)V

    iput-object v0, p0, Landroidx/fragment/app/l2;->E:Landroidx/lifecycle/i0;

    new-instance v0, Lrb/a;

    new-instance v1, Lm83/p;

    const/16 v2, 0xa

    invoke-direct {v1, p0, v2}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v0, p0, v1}, Lrb/a;-><init>(Lpb/f;Lm83/p;)V

    new-instance v1, Lpb/e;

    invoke-direct {v1, v0}, Lpb/e;-><init>(Lrb/a;)V

    iput-object v1, p0, Landroidx/fragment/app/l2;->F:Lpb/e;

    invoke-virtual {v0}, Lrb/a;->a()V

    iget-object v0, p0, Landroidx/fragment/app/l2;->y:Landroidx/fragment/app/z;

    invoke-virtual {v0}, Landroidx/fragment/app/z;->run()V

    :cond_0
    return-void
.end method

.method public final getDefaultViewModelCreationExtras()Ll8/c;
    .locals 5

    iget-object v0, p0, Landroidx/fragment/app/l2;->w:Landroidx/fragment/app/m0;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    :goto_0
    instance-of v2, v1, Landroid/content/ContextWrapper;

    if-eqz v2, :cond_1

    instance-of v2, v1, Landroid/app/Application;

    if-eqz v2, :cond_0

    check-cast v1, Landroid/app/Application;

    goto :goto_1

    :cond_0
    check-cast v1, Landroid/content/ContextWrapper;

    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_1
    new-instance v2, Ll8/e;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ll8/e;-><init>(I)V

    iget-object v3, v2, Ll8/c;->a:Ljava/util/LinkedHashMap;

    if-eqz v1, :cond_2

    sget-object v4, Landroidx/lifecycle/z1;->d:Lio/sentry/hints/j;

    invoke-interface {v3, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    sget-object v1, Landroidx/lifecycle/o1;->a:Lqt/e;

    invoke-interface {v3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Landroidx/lifecycle/o1;->b:Lio/sentry/hints/j;

    invoke-interface {v3, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_3

    sget-object v1, Landroidx/lifecycle/o1;->c:Lqt/e;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    invoke-interface {v3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-object v2
.end method

.method public final getDefaultViewModelProviderFactory()Landroidx/lifecycle/a2;
    .locals 4

    iget-object v0, p0, Landroidx/fragment/app/l2;->w:Landroidx/fragment/app/m0;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->getDefaultViewModelProviderFactory()Landroidx/lifecycle/a2;

    move-result-object v1

    iget-object v2, v0, Landroidx/fragment/app/m0;->mDefaultFactory:Landroidx/lifecycle/a2;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    iput-object v1, p0, Landroidx/fragment/app/l2;->z:Landroidx/lifecycle/a2;

    return-object v1

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/l2;->z:Landroidx/lifecycle/a2;

    if-nez v1, :cond_3

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    :goto_0
    instance-of v2, v1, Landroid/content/ContextWrapper;

    if-eqz v2, :cond_2

    instance-of v2, v1, Landroid/app/Application;

    if-eqz v2, :cond_1

    check-cast v1, Landroid/app/Application;

    goto :goto_1

    :cond_1
    check-cast v1, Landroid/content/ContextWrapper;

    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_1
    new-instance v2, Landroidx/lifecycle/s1;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v3

    invoke-direct {v2, v1, v0, v3}, Landroidx/lifecycle/s1;-><init>(Landroid/app/Application;Lpb/f;Landroid/os/Bundle;)V

    iput-object v2, p0, Landroidx/fragment/app/l2;->z:Landroidx/lifecycle/a2;

    :cond_3
    iget-object v0, p0, Landroidx/fragment/app/l2;->z:Landroidx/lifecycle/a2;

    return-object v0
.end method

.method public final getLifecycle()Landroidx/lifecycle/x;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/l2;->b()V

    iget-object v0, p0, Landroidx/fragment/app/l2;->E:Landroidx/lifecycle/i0;

    return-object v0
.end method

.method public final getSavedStateRegistry()Lpb/d;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/l2;->b()V

    iget-object v0, p0, Landroidx/fragment/app/l2;->F:Lpb/e;

    iget-object v0, v0, Lpb/e;->b:Lpb/d;

    return-object v0
.end method

.method public final getViewModelStore()Landroidx/lifecycle/e2;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/l2;->b()V

    iget-object v0, p0, Landroidx/fragment/app/l2;->x:Landroidx/lifecycle/e2;

    return-object v0
.end method
