.class public final Lck/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;
.implements Lkk/e;


# instance fields
.field public final E:Ljava/util/LinkedHashSet;

.field public final F:Ljava/util/LinkedHashSet;

.field public G:Z

.field public final w:Lcom/iterable/iterableapi/e;

.field public x:Landroid/content/pm/PackageInfo;

.field public y:Lgj/d;

.field public z:Lgj/g;


# direct methods
.method public constructor <init>(Lcom/iterable/iterableapi/e;)V
    .locals 1

    const-string v0, "activityLifecycleObserver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lck/e;->w:Lcom/iterable/iterableapi/e;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lck/e;->E:Ljava/util/LinkedHashSet;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lck/e;->F:Ljava/util/LinkedHashSet;

    return-void
.end method


# virtual methods
.method public final b(Lgj/d;)V
    .locals 13

    iput-object p1, p0, Lck/e;->y:Lgj/d;

    iget-object v0, p1, Lgj/d;->a:Lgj/g;

    iput-object v0, p0, Lck/e;->z:Lgj/g;

    iget-object v0, v0, Lgj/g;->b:Landroid/content/Context;

    const-string v1, "null cannot be cast to non-null type android.app.Application"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/app/Application;

    iget-object v1, p0, Lck/e;->z:Lgj/g;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    iget-object v1, v1, Lgj/g;->r:Ljava/util/Set;

    sget-object v3, Lgj/e;->x:Lgj/e;

    invoke-interface {v1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    const-string v3, "{\n                applic\u2026ageName, 0)\n            }"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-object v1, p1, Lgj/d;->k:Lfk/a;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Cannot find package with application.packageName: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lfk/a;->error(Ljava/lang/String;)V

    new-instance v1, Landroid/content/pm/PackageInfo;

    invoke-direct {v1}, Landroid/content/pm/PackageInfo;-><init>()V

    :goto_0
    iput-object v1, p0, Lck/e;->x:Landroid/content/pm/PackageInfo;

    new-instance v4, Lwe/o;

    iget-object v0, p0, Lck/e;->y:Lgj/d;

    if-eqz v0, :cond_3

    invoke-direct {v4, v0}, Lwe/o;-><init>(Lgj/d;)V

    iget-object v1, p0, Lck/e;->x:Landroid/content/pm/PackageInfo;

    if-eqz v1, :cond_2

    iget-object v6, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-virtual {v1}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lgj/d;->f()Lik/b;

    move-result-object v5

    sget-object v1, Lik/a;->G:Lik/a;

    invoke-interface {v5, v1}, Lik/b;->c(Lik/a;)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lik/a;->H:Lik/a;

    invoke-interface {v5, v3}, Lik/b;->c(Lik/a;)Ljava/lang/String;

    move-result-object v3

    const/4 v8, 0x4

    const-string v9, "[Amplitude] Build"

    const-string v10, "[Amplitude] Version"

    if-nez v3, :cond_0

    new-instance v1, Ll83/k;

    invoke-direct {v1, v10, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v9, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v3}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    const-string v3, "[Amplitude] Application Installed"

    invoke-static {v0, v3, v1, v8}, Lgj/d;->j(Lgj/d;Ljava/lang/String;Ljava/util/Map;I)V

    goto :goto_1

    :cond_0
    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1

    new-instance v11, Ll83/k;

    const-string v12, "[Amplitude] Previous Version"

    invoke-direct {v11, v12, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v12, "[Amplitude] Previous Build"

    invoke-direct {v1, v12, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v10, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v10, Ll83/k;

    invoke-direct {v10, v9, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v11, v1, v3, v10}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    const-string v3, "[Amplitude] Application Updated"

    invoke-static {v0, v3, v1, v8}, Lgj/d;->j(Lgj/d;Ljava/lang/String;Ljava/util/Map;I)V

    :cond_1
    :goto_1
    iget-object v1, v0, Lgj/d;->c:Lbc3/c0;

    iget-object v0, v0, Lgj/d;->f:Lbc3/z;

    new-instance v3, Landroidx/lifecycle/e1;

    const/4 v8, 0x0

    const/16 v9, 0x8

    invoke-direct/range {v3 .. v9}, Landroidx/lifecycle/e1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v4, 0x2

    invoke-static {v1, v0, v2, v3, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iget-object p1, p1, Lgj/d;->c:Lbc3/c0;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    new-instance v1, La6/c;

    const/16 v3, 0xb

    invoke-direct {v1, p0, v2, v3}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {p1, v0, v2, v1, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_2
    const-string p1, "packageInfo"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_3
    const-string p1, "androidAmplitude"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_4
    return-void

    :cond_5
    const-string p1, "androidConfiguration"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method public final getType()Lkk/d;
    .locals 1

    sget-object v0, Lkk/d;->z:Lkk/d;

    return-object v0
.end method

.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 2

    const-string p2, "activity"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iget-object v0, p0, Lck/e;->E:Ljava/util/LinkedHashSet;

    invoke-interface {v0, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object p2, p0, Lck/e;->z:Lgj/g;

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    iget-object p2, p2, Lgj/g;->r:Ljava/util/Set;

    sget-object v1, Lgj/e;->z:Lgj/e;

    invoke-interface {p2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    new-instance p2, Lwe/o;

    iget-object v1, p0, Lck/e;->y:Lgj/d;

    if-eqz v1, :cond_0

    invoke-direct {p2, v1}, Lwe/o;-><init>(Lgj/d;)V

    iget-object p2, p2, Lwe/o;->x:Ljava/lang/Object;

    check-cast p2, Ll83/p;

    invoke-virtual {p2}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_1

    sget-object p2, Lyj/b;->a:Ljava/util/WeakHashMap;

    new-instance p2, Lek/d;

    const/4 v0, 0x0

    invoke-direct {p2, v1, v0}, Lek/d;-><init>(Ljava/lang/Object;I)V

    iget-object v0, v1, Lgj/d;->k:Lfk/a;

    invoke-static {p1, p2, v0}, Lyj/b;->a(Landroid/app/Activity;Lek/d;Lfk/a;)V

    return-void

    :cond_0
    const-string p1, "androidAmplitude"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void

    :cond_2
    const-string p1, "androidConfiguration"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 3

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lck/e;->E:Ljava/util/LinkedHashSet;

    invoke-interface {v1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lck/e;->z:Lgj/g;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, v0, Lgj/g;->r:Ljava/util/Set;

    sget-object v2, Lgj/e;->z:Lgj/e;

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lwe/o;

    iget-object v2, p0, Lck/e;->y:Lgj/d;

    if-eqz v2, :cond_0

    invoke-direct {v0, v2}, Lwe/o;-><init>(Lgj/d;)V

    iget-object v0, v0, Lwe/o;->x:Ljava/lang/Object;

    check-cast v0, Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lyj/b;->a:Ljava/util/WeakHashMap;

    iget-object v0, v2, Lgj/d;->k:Lfk/a;

    invoke-static {p1, v0}, Lyj/b;->b(Landroid/app/Activity;Lfk/a;)V

    return-void

    :cond_0
    const-string p1, "androidAmplitude"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    return-void

    :cond_2
    const-string p1, "androidConfiguration"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 7

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lck/e;->y:Lgj/d;

    const-string v1, "androidAmplitude"

    const/4 v2, 0x0

    if-eqz v0, :cond_7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    new-instance v5, Ljk/a;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    const-string v6, "dummy_exit_foreground"

    iput-object v6, v5, Ljk/a;->M:Ljava/lang/String;

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v5, Ljk/a;->c:Ljava/lang/Long;

    iget-object v3, v0, Lgj/d;->g:Lgj/m;

    invoke-virtual {v3, v5}, Lgj/m;->N(Ljk/a;)V

    iget-object v3, v0, Lgj/d;->a:Lgj/g;

    iget-boolean v3, v3, Lgj/g;->j:Z

    if-eqz v3, :cond_0

    iget-object v3, v0, Lgj/d;->c:Lbc3/c0;

    iget-object v4, v0, Lgj/d;->d:Lbc3/z;

    new-instance v5, Landroidx/room/z1;

    const/4 v6, 0x6

    invoke-direct {v5, v0, v2, v6}, Landroidx/room/z1;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v0, 0x2

    invoke-static {v3, v4, v2, v5, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    iget-object v0, p0, Lck/e;->z:Lgj/g;

    if-eqz v0, :cond_6

    iget-object v0, v0, Lgj/g;->r:Ljava/util/Set;

    sget-object v3, Lgj/e;->E:Lgj/e;

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Lwe/o;

    iget-object v3, p0, Lck/e;->y:Lgj/d;

    if-eqz v3, :cond_4

    invoke-direct {v0, v3}, Lwe/o;-><init>(Lgj/d;)V

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    instance-of v1, v0, Lzj/c;

    if-eqz v1, :cond_1

    check-cast v0, Lzj/c;

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lzj/c;->a()Landroid/view/Window$Callback;

    move-result-object v0

    instance-of v1, v0, Lzj/d;

    if-nez v1, :cond_2

    move-object v2, v0

    :cond_2
    invoke-virtual {p1, v2}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    return-void

    :cond_3
    iget-object p1, v3, Lgj/d;->k:Lfk/a;

    const-string v0, "Failed to stop user interaction event tracking: Activity window is null"

    invoke-interface {p1, v0}, Lfk/a;->error(Ljava/lang/String;)V

    return-void

    :cond_4
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_5
    return-void

    :cond_6
    const-string p1, "androidConfiguration"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_7
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 10

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lck/e;->y:Lgj/d;

    const-string v1, "androidAmplitude"

    const/4 v2, 0x0

    if-eqz v0, :cond_5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    new-instance v5, Ljk/a;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    const-string v6, "dummy_enter_foreground"

    iput-object v6, v5, Ljk/a;->M:Ljava/lang/String;

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v5, Ljk/a;->c:Ljava/lang/Long;

    iget-object v0, v0, Lgj/d;->g:Lgj/m;

    invoke-virtual {v0, v5}, Lgj/m;->N(Ljk/a;)V

    iget-object v0, p0, Lck/e;->z:Lgj/g;

    if-eqz v0, :cond_4

    iget-object v0, v0, Lgj/g;->r:Ljava/util/Set;

    sget-object v3, Lgj/e;->E:Lgj/e;

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Lwe/o;

    iget-object v3, p0, Lck/e;->y:Lgj/d;

    if-eqz v3, :cond_2

    iget-object v1, v3, Lgj/d;->k:Lfk/a;

    invoke-direct {v0, v3}, Lwe/o;-><init>(Lgj/d;)V

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v2

    if-nez v2, :cond_0

    new-instance v2, Lzj/d;

    invoke-direct {v2}, Lzj/d;-><init>()V

    :cond_0
    move-object v5, v2

    new-instance v4, Lzj/c;

    new-instance v7, Lek/d;

    const/4 v2, 0x1

    invoke-direct {v7, v3, v2}, Lek/d;-><init>(Ljava/lang/Object;I)V

    invoke-static {}, Lak/f;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v2

    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Ljava/util/List;

    iget-object v9, v3, Lgj/d;->k:Lfk/a;

    move-object v6, p1

    invoke-direct/range {v4 .. v9}, Lzj/c;-><init>(Landroid/view/Window$Callback;Landroid/app/Activity;Lek/d;Ljava/util/List;Lfk/a;)V

    invoke-virtual {v0, v4}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    :cond_1
    if-nez v2, :cond_3

    const-string p1, "Failed to track user interaction event: Activity window is null"

    invoke-interface {v1, p1}, Lfk/a;->error(Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_3
    return-void

    :cond_4
    const-string p1, "androidConfiguration"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_5
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "bundle"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 10

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lck/e;->E:Ljava/util/LinkedHashSet;

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lck/e;->onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lck/e;->F:Ljava/util/LinkedHashSet;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lck/e;->z:Lgj/g;

    const-string v2, "androidConfiguration"

    const/4 v3, 0x0

    if-eqz v0, :cond_f

    iget-object v0, v0, Lgj/g;->r:Ljava/util/Set;

    sget-object v4, Lgj/e;->x:Lgj/e;

    invoke-interface {v0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v4, 0x4

    const-string v5, "androidAmplitude"

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    new-instance v0, Lwe/o;

    iget-object v1, p0, Lck/e;->y:Lgj/d;

    if-eqz v1, :cond_2

    invoke-direct {v0, v1}, Lwe/o;-><init>(Lgj/d;)V

    iget-object v0, p0, Lck/e;->x:Landroid/content/pm/PackageInfo;

    if-eqz v0, :cond_1

    iget-boolean v6, p0, Lck/e;->G:Z

    iget-object v7, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-virtual {v0}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    new-instance v8, Ll83/k;

    const-string v9, "[Amplitude] From Background"

    invoke-direct {v8, v9, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Ll83/k;

    const-string v9, "[Amplitude] Version"

    invoke-direct {v6, v9, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v7, Ll83/k;

    const-string v9, "[Amplitude] Build"

    invoke-direct {v7, v9, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v8, v6, v7}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    const-string v6, "[Amplitude] Application Opened"

    invoke-static {v1, v6, v0, v4}, Lgj/d;->j(Lgj/d;Ljava/lang/String;Ljava/util/Map;I)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lck/e;->G:Z

    goto :goto_0

    :cond_1
    const-string p1, "packageInfo"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_2
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_3
    :goto_0
    iget-object v0, p0, Lck/e;->z:Lgj/g;

    if-eqz v0, :cond_e

    iget-object v0, v0, Lgj/g;->r:Ljava/util/Set;

    sget-object v1, Lgj/e;->y:Lgj/e;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v0, Lwe/o;

    iget-object v1, p0, Lck/e;->y:Lgj/d;

    if-eqz v1, :cond_5

    invoke-direct {v0, v1}, Lwe/o;-><init>(Lgj/d;)V

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Landroid/app/Activity;->getReferrer()Landroid/net/Uri;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    :cond_4
    move-object v6, v3

    :goto_1
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v7, "uri.toString()"

    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Ll83/k;

    const-string v8, "[Amplitude] Link URL"

    invoke-direct {v7, v8, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ll83/k;

    const-string v8, "[Amplitude] Link Referrer"

    invoke-direct {v0, v8, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v7, v0}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    const-string v6, "[Amplitude] Deep Link Opened"

    invoke-static {v1, v6, v0, v4}, Lgj/d;->j(Lgj/d;Ljava/lang/String;Ljava/util/Map;I)V

    goto :goto_2

    :cond_5
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_6
    :goto_2
    iget-object v0, p0, Lck/e;->z:Lgj/g;

    if-eqz v0, :cond_d

    iget-object v0, v0, Lgj/g;->r:Ljava/util/Set;

    sget-object v1, Lgj/e;->z:Lgj/e;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    new-instance v0, Lwe/o;

    iget-object v1, p0, Lck/e;->y:Lgj/d;

    if-eqz v1, :cond_b

    iget-object v2, v1, Lgj/d;->k:Lfk/a;

    invoke-direct {v0, v1}, Lwe/o;-><init>(Lgj/d;)V

    :try_start_0
    const-string v0, "[Amplitude] Screen Viewed"

    const-string v5, "[Amplitude] Screen Name"

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    if-eqz v6, :cond_7

    invoke-virtual {p1}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    move-result-object p1

    const/16 v7, 0x80

    invoke-virtual {v6, p1, v7}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    move-result-object p1

    goto :goto_3

    :cond_7
    move-object p1, v3

    :goto_3
    if-eqz p1, :cond_9

    invoke-virtual {p1, v6}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v6

    if-eqz v6, :cond_9

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_8

    goto :goto_4

    :cond_8
    move-object v3, v6

    goto :goto_5

    :cond_9
    :goto_4
    if-eqz p1, :cond_a

    iget-object v3, p1, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    :cond_a
    :goto_5
    new-instance p1, Ll83/k;

    invoke-direct {p1, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p1

    invoke-static {v1, v0, p1, v4}, Lgj/d;->j(Lgj/d;Ljava/lang/String;Ljava/util/Map;I)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_6

    :catch_1
    move-exception p1

    goto :goto_7

    :goto_6
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to track screen viewed event: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, p1}, Lfk/a;->error(Ljava/lang/String;)V

    goto :goto_8

    :goto_7
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to get activity info: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, p1}, Lfk/a;->error(Ljava/lang/String;)V

    goto :goto_8

    :cond_b
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_c
    :goto_8
    return-void

    :cond_d
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_e
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_f
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 3

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object v0, p0, Lck/e;->F:Ljava/util/LinkedHashSet;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lck/e;->z:Lgj/g;

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    iget-object p1, p1, Lgj/g;->r:Ljava/util/Set;

    sget-object v2, Lgj/e;->x:Lgj/e;

    invoke-interface {p1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lwe/o;

    iget-object v0, p0, Lck/e;->y:Lgj/d;

    if-eqz v0, :cond_0

    invoke-direct {p1, v0}, Lwe/o;-><init>(Lgj/d;)V

    const-string p1, "[Amplitude] Application Backgrounded"

    const/4 v2, 0x6

    invoke-static {v0, p1, v1, v2}, Lgj/d;->j(Lgj/d;Ljava/lang/String;Ljava/util/Map;I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lck/e;->G:Z

    return-void

    :cond_0
    const-string p1, "androidAmplitude"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    return-void

    :cond_2
    const-string p1, "androidConfiguration"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method
