.class public final Lio/sentry/android/core/ViewHierarchyEventProcessor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/b0;


# instance fields
.field public final w:Lio/sentry/android/core/SentryAndroidOptions;

.field public final x:Lio/sentry/android/core/internal/util/g;


# direct methods
.method public constructor <init>(Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "SentryAndroidOptions is required"

    invoke-static {p1, v0}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/sentry/android/core/ViewHierarchyEventProcessor;->w:Lio/sentry/android/core/SentryAndroidOptions;

    new-instance v0, Lio/sentry/android/core/internal/util/g;

    const-wide/16 v1, 0x7d0

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lio/sentry/android/core/internal/util/g;-><init>(JI)V

    iput-object v0, p0, Lio/sentry/android/core/ViewHierarchyEventProcessor;->x:Lio/sentry/android/core/internal/util/g;

    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachViewHierarchy()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "ViewHierarchy"

    invoke-static {p1}, Ljc/x;->i(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static a(Landroid/view/View;Lio/sentry/protocol/k0;Ljava/util/List;)V
    .locals 5

    instance-of v0, p0, Landroid/view/ViewGroup;

    if-nez v0, :cond_0

    goto :goto_4

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/compose/viewhierarchy/ComposeViewHierarchyExporter;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v2, p0, Landroidx/compose/ui/node/Owner;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object p2, v1, Lio/sentry/compose/viewhierarchy/ComposeViewHierarchyExporter;->b:Lio/sentry/compose/a;

    if-nez p2, :cond_3

    iget-object p2, v1, Lio/sentry/compose/viewhierarchy/ComposeViewHierarchyExporter;->c:Lio/sentry/util/a;

    invoke-virtual {p2}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object p2

    :try_start_0
    iget-object v0, v1, Lio/sentry/compose/viewhierarchy/ComposeViewHierarchyExporter;->b:Lio/sentry/compose/a;

    if-nez v0, :cond_2

    new-instance v0, Lio/sentry/compose/a;

    iget-object v2, v1, Lio/sentry/compose/viewhierarchy/ComposeViewHierarchyExporter;->a:Lio/sentry/v0;

    invoke-direct {v0, v2}, Lio/sentry/compose/a;-><init>(Lio/sentry/v0;)V

    iput-object v0, v1, Lio/sentry/compose/viewhierarchy/ComposeViewHierarchyExporter;->b:Lio/sentry/compose/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v0, 0x0

    invoke-static {p2, v0}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    goto :goto_3

    :goto_2
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p1

    invoke-static {p2, p0}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw p1

    :cond_3
    :goto_3
    check-cast p0, Landroidx/compose/ui/node/Owner;

    invoke-interface {p0}, Landroidx/compose/ui/node/Owner;->getRoot()La3/n0;

    move-result-object p0

    iget-object p2, v1, Lio/sentry/compose/viewhierarchy/ComposeViewHierarchyExporter;->b:Lio/sentry/compose/a;

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {p2, p1, p0}, Lio/sentry/compose/viewhierarchy/ComposeViewHierarchyExporter;->a(Lio/sentry/compose/a;Lio/sentry/protocol/k0;La3/n0;)V

    return-void

    :cond_4
    check-cast p0, Landroid/view/ViewGroup;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-nez v0, :cond_5

    :goto_4
    return-void

    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_5
    if-ge v2, v0, :cond_7

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-static {v3}, Lio/sentry/android/core/ViewHierarchyEventProcessor;->c(Landroid/view/View;)Lio/sentry/protocol/k0;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v3, v4, p2}, Lio/sentry/android/core/ViewHierarchyEventProcessor;->a(Landroid/view/View;Lio/sentry/protocol/k0;Ljava/util/List;)V

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_7
    iput-object v1, p1, Lio/sentry/protocol/k0;->K:Ljava/util/List;

    return-void
.end method

.method public static c(Landroid/view/View;)Lio/sentry/protocol/k0;
    .locals 3

    new-instance v0, Lio/sentry/protocol/k0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p0}, Lts/o;->v(Landroid/view/KeyEvent$Callback;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/protocol/k0;->x:Ljava/lang/String;

    :try_start_0
    invoke-static {p0}, Lio/sentry/android/core/internal/gestures/i;->b(Landroid/view/View;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/protocol/k0;->y:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    invoke-virtual {p0}, Landroid/view/View;->getX()F

    move-result v1

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/protocol/k0;->G:Ljava/lang/Double;

    invoke-virtual {p0}, Landroid/view/View;->getY()F

    move-result v1

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/protocol/k0;->H:Ljava/lang/Double;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/protocol/k0;->E:Ljava/lang/Double;

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/protocol/k0;->F:Ljava/lang/Double;

    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    move-result v1

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/protocol/k0;->J:Ljava/lang/Double;

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result p0

    if-eqz p0, :cond_2

    const/4 v1, 0x4

    if-eq p0, v1, :cond_1

    const/16 v1, 0x8

    if-eq p0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string p0, "gone"

    iput-object p0, v0, Lio/sentry/protocol/k0;->I:Ljava/lang/String;

    goto :goto_0

    :cond_1
    const-string p0, "invisible"

    iput-object p0, v0, Lio/sentry/protocol/k0;->I:Ljava/lang/String;

    goto :goto_0

    :cond_2
    const-string p0, "visible"

    iput-object p0, v0, Lio/sentry/protocol/k0;->I:Ljava/lang/String;

    :goto_0
    return-object v0
.end method


# virtual methods
.method public final h(Lio/sentry/e5;Lio/sentry/g0;)Lio/sentry/e5;
    .locals 10

    invoke-virtual {p1}, Lio/sentry/e5;->g()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v0, p0, Lio/sentry/android/core/ViewHierarchyEventProcessor;->w:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v0}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachViewHierarchy()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v1, "attachViewHierarchy is disabled."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p2, v0, v1, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p1

    :cond_1
    invoke-static {p2}, Lhg3/i;->X(Lio/sentry/g0;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto/16 :goto_2

    :cond_2
    iget-object v1, p0, Lio/sentry/android/core/ViewHierarchyEventProcessor;->x:Lio/sentry/android/core/internal/util/g;

    invoke-virtual {v1}, Lio/sentry/android/core/internal/util/g;->a()Z

    move-result v1

    invoke-virtual {v0}, Lio/sentry/android/core/SentryAndroidOptions;->getBeforeViewHierarchyCaptureCallback()Lio/sentry/android/core/f1;

    if-eqz v1, :cond_3

    goto/16 :goto_2

    :cond_3
    sget-object v1, Lio/sentry/android/core/k0;->b:Lio/sentry/android/core/k0;

    iget-object v1, v1, Lio/sentry/android/core/k0;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/ref/WeakReference;

    const/4 v3, 0x0

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    goto :goto_0

    :cond_4
    move-object v1, v3

    :goto_0
    invoke-virtual {v0}, Lio/sentry/q6;->getViewHierarchyExporters()Ljava/util/List;

    move-result-object v7

    invoke-virtual {v0}, Lio/sentry/q6;->getThreadChecker()Lio/sentry/util/thread/a;

    move-result-object v4

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v9

    if-nez v1, :cond_5

    sget-object v0, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v1, "Missing activity for view hierarchy snapshot."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {v9, v0, v1, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-nez v0, :cond_6

    sget-object v0, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v1, "Missing window for view hierarchy snapshot."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {v9, v0, v1, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_6
    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object v6

    if-nez v6, :cond_7

    sget-object v0, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v1, "Missing decor view for view hierarchy snapshot."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {v9, v0, v1, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_7
    :try_start_0
    invoke-interface {v4}, Lio/sentry/util/thread/a;->a()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_8

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v1, Lio/sentry/protocol/j0;

    const-string v2, "android_view_system"

    invoke-direct {v1, v2, v0}, Lio/sentry/protocol/j0;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-static {v6}, Lio/sentry/android/core/ViewHierarchyEventProcessor;->c(Landroid/view/View;)Lio/sentry/protocol/k0;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v6, v2, v7}, Lio/sentry/android/core/ViewHierarchyEventProcessor;->a(Landroid/view/View;Lio/sentry/protocol/k0;Ljava/util/List;)V

    move-object v3, v1

    goto :goto_1

    :cond_8
    new-instance v8, Ljava/util/concurrent/CountDownLatch;

    invoke-direct {v8, v2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    new-instance v5, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v5, v3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    new-instance v4, Lij/k;

    invoke-direct/range {v4 .. v9}, Lij/k;-><init>(Ljava/util/concurrent/atomic/AtomicReference;Landroid/view/View;Ljava/util/List;Ljava/util/concurrent/CountDownLatch;Lio/sentry/v0;)V

    invoke-virtual {v1, v4}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x3e8

    invoke-virtual {v8, v1, v2, v0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/protocol/j0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v3, v0

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v2, "Failed to process view hierarchy."

    invoke-interface {v9, v1, v2, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    :goto_1
    if-eqz v3, :cond_a

    invoke-static {v3}, Lio/sentry/a;->c(Lio/sentry/protocol/j0;)Lio/sentry/a;

    move-result-object v0

    iput-object v0, p2, Lio/sentry/g0;->e:Lio/sentry/a;

    :cond_a
    :goto_2
    return-object p1
.end method

.method public final i(Lio/sentry/protocol/d0;Lio/sentry/g0;)Lio/sentry/protocol/d0;
    .locals 0

    return-object p1
.end method
