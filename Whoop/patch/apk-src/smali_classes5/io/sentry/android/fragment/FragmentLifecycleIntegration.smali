.class public final Lio/sentry/android/fragment/FragmentLifecycleIntegration;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;
.implements Lio/sentry/t1;
.implements Ljava/io/Closeable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cB\u0011\u0008\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\rB!\u0008\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lio/sentry/android/fragment/FragmentLifecycleIntegration;",
        "Landroid/app/Application$ActivityLifecycleCallbacks;",
        "Lio/sentry/t1;",
        "Ljava/io/Closeable;",
        "Landroid/app/Application;",
        "application",
        "",
        "Lio/sentry/android/fragment/b;",
        "filterFragmentLifecycleBreadcrumbs",
        "",
        "enableAutoFragmentLifecycleTracing",
        "<init>",
        "(Landroid/app/Application;Ljava/util/Set;Z)V",
        "(Landroid/app/Application;)V",
        "enableFragmentLifecycleBreadcrumbs",
        "(Landroid/app/Application;ZZ)V",
        "sentry-android-fragment_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public E:Lio/sentry/q6;

.field public final w:Landroid/app/Application;

.field public final x:Ljava/util/Set;

.field public final y:Z

.field public z:Lio/sentry/i4;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lio/sentry/l5;->d()Lio/sentry/l5;

    move-result-object v0

    const-string v1, "maven:io.sentry:sentry-android-fragment"

    const-string v2, "8.41.0"

    invoke-virtual {v0, v1, v2}, Lio/sentry/l5;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;)V
    .locals 2

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    sget-object v0, Lio/sentry/android/fragment/b;->Companion:Lio/sentry/android/fragment/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    invoke-static {}, Lio/sentry/android/fragment/b;->access$getStates$cp()Ljava/util/Set;

    move-result-object v0

    const/4 v1, 0x0

    .line 7
    invoke-direct {p0, p1, v0, v1}, Lio/sentry/android/fragment/FragmentLifecycleIntegration;-><init>(Landroid/app/Application;Ljava/util/Set;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;Ljava/util/Set;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Application;",
            "Ljava/util/Set<",
            "+",
            "Lio/sentry/android/fragment/b;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filterFragmentLifecycleBreadcrumbs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/sentry/android/fragment/FragmentLifecycleIntegration;->w:Landroid/app/Application;

    .line 3
    iput-object p2, p0, Lio/sentry/android/fragment/FragmentLifecycleIntegration;->x:Ljava/util/Set;

    .line 4
    iput-boolean p3, p0, Lio/sentry/android/fragment/FragmentLifecycleIntegration;->y:Z

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;ZZ)V
    .locals 1

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    sget-object v0, Lio/sentry/android/fragment/b;->Companion:Lio/sentry/android/fragment/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    invoke-static {}, Lio/sentry/android/fragment/b;->access$getStates$cp()Ljava/util/Set;

    move-result-object v0

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    .line 10
    sget-object v0, Lm83/a0;->w:Lm83/a0;

    .line 11
    :cond_1
    invoke-direct {p0, p1, v0, p3}, Lio/sentry/android/fragment/FragmentLifecycleIntegration;-><init>(Landroid/app/Application;Ljava/util/Set;Z)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/fragment/FragmentLifecycleIntegration;->w:Landroid/app/Application;

    invoke-virtual {v0, p0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object v0, p0, Lio/sentry/android/fragment/FragmentLifecycleIntegration;->E:Lio/sentry/q6;

    if-eqz v0, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "FragmentLifecycleIntegration removed."

    invoke-interface {v0, v1, v3, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    const-string v0, "options"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    :cond_1
    return-void
.end method

.method public final m(Lio/sentry/q6;)V
    .locals 3

    sget-object v0, Lio/sentry/i4;->a:Lio/sentry/i4;

    iput-object v0, p0, Lio/sentry/android/fragment/FragmentLifecycleIntegration;->z:Lio/sentry/i4;

    iput-object p1, p0, Lio/sentry/android/fragment/FragmentLifecycleIntegration;->E:Lio/sentry/q6;

    iget-object v0, p0, Lio/sentry/android/fragment/FragmentLifecycleIntegration;->w:Landroid/app/Application;

    invoke-virtual {v0, p0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FragmentLifecycleIntegration installed."

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    const-string p1, "FragmentLifecycle"

    invoke-static {p1}, Ljc/x;->i(Ljava/lang/String;)V

    return-void
.end method

.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 3

    const-string p2, "activity"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p2, p1, Landroidx/fragment/app/r0;

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    check-cast p1, Landroidx/fragment/app/r0;

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object p1

    if-eqz p1, :cond_2

    new-instance p2, Lio/sentry/android/fragment/c;

    iget-object v1, p0, Lio/sentry/android/fragment/FragmentLifecycleIntegration;->z:Lio/sentry/i4;

    if-eqz v1, :cond_1

    iget-object v0, p0, Lio/sentry/android/fragment/FragmentLifecycleIntegration;->x:Ljava/util/Set;

    iget-boolean v2, p0, Lio/sentry/android/fragment/FragmentLifecycleIntegration;->y:Z

    invoke-direct {p2, v1, v0, v2}, Lio/sentry/android/fragment/c;-><init>(Lio/sentry/i4;Ljava/util/Set;Z)V

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Landroidx/fragment/app/o1;->X(Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;Z)V

    return-void

    :cond_1
    const-string p1, "scopes"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_2
    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "outState"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
