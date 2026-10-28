.class public final Lcom/iterable/iterableapi/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    iput p1, p0, Lcom/iterable/iterableapi/e;->w:I

    packed-switch p1, :pswitch_data_0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    const/4 v0, 0x6

    const v1, 0x7fffffff

    .line 2
    invoke-static {v1, v0, p1}, Lq83/g;->d(IILdc3/a;)Ldc3/h;

    move-result-object p1

    iput-object p1, p0, Lcom/iterable/iterableapi/e;->x:Ljava/lang/Object;

    return-void

    .line 3
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 5
    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/iterable/iterableapi/e;->x:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lcom/iterable/iterableapi/g;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/iterable/iterableapi/e;->w:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/iterable/iterableapi/e;->x:Ljava/lang/Object;

    return-void
.end method

.method private final a(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method private final b(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method private final c(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method private final d(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method private final e(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method private final f(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method private final g(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method private final h(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 3

    iget p2, p0, Lcom/iterable/iterableapi/e;->w:I

    packed-switch p2, :pswitch_data_0

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_7

    iget-object p2, p0, Lcom/iterable/iterableapi/e;->x:Ljava/lang/Object;

    check-cast p2, Ljava/util/Set;

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_3

    :cond_0
    const-string p2, "FirebaseMessaging"

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v1, "gcm.n.analytics_data"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v1, "Failed trying to get analytics data from Intent extras."

    invoke-static {p2, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    :goto_0
    const-string p1, "1"

    if-nez v0, :cond_2

    const/4 v1, 0x0

    goto :goto_1

    :cond_2
    const-string v1, "google.c.a.e"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    :goto_1
    if-eqz v1, :cond_7

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    const-string v1, "google.c.a.tc"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v1, 0x3

    if-eqz p1, :cond_5

    invoke-static {}, Ldt/g;->b()Ldt/g;

    move-result-object p1

    invoke-virtual {p1}, Ldt/g;->a()V

    iget-object p1, p1, Ldt/g;->d:Lgt/g;

    const-class v2, Let/a;

    invoke-interface {p1, v2}, Lgt/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lr;->t(Ljava/lang/Object;)V

    invoke-static {p2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "Received event with track-conversion=true. Setting user property and reengagement event"

    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    const-string p1, "Unable to set user property for conversion tracking:  analytics library is missing"

    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_5
    invoke-static {p2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_6

    const-string p1, "Received event with track-conversion=false. Do not set user property"

    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_6
    :goto_2
    const-string p1, "_no"

    invoke-static {v0, p1}, Lva3/l;->p(Landroid/os/Bundle;Ljava/lang/String;)V

    :cond_7
    :goto_3
    return-void

    :pswitch_0
    const-string p2, "activity"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/iterable/iterableapi/e;->x:Ljava/lang/Object;

    check-cast p2, Ldc3/h;

    new-instance v0, Lek/a;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const/4 p1, 0x1

    invoke-direct {v0, v1, p1}, Lek/a;-><init>(Ljava/lang/ref/WeakReference;I)V

    invoke-interface {p2, v0}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    :pswitch_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 3

    iget v0, p0, Lcom/iterable/iterableapi/e;->w:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/iterable/iterableapi/e;->x:Ljava/lang/Object;

    check-cast v0, Ldc3/h;

    new-instance v1, Lek/a;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const/4 p1, 0x6

    invoke-direct {v1, v2, p1}, Lek/a;-><init>(Ljava/lang/ref/WeakReference;I)V

    invoke-interface {v0, v1}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    :pswitch_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 3

    iget v0, p0, Lcom/iterable/iterableapi/e;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/iterable/iterableapi/e;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void

    :pswitch_0
    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/iterable/iterableapi/e;->x:Ljava/lang/Object;

    check-cast v0, Ldc3/h;

    new-instance v1, Lek/a;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const/4 p1, 0x4

    invoke-direct {v1, v2, p1}, Lek/a;-><init>(Ljava/lang/ref/WeakReference;I)V

    invoke-interface {v0, v1}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/iterable/iterableapi/e;->x:Ljava/lang/Object;

    check-cast v0, Lcom/iterable/iterableapi/g;

    iget-object v1, v0, Lcom/iterable/iterableapi/g;->b:Ljava/lang/ref/WeakReference;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    if-ne v1, p1, :cond_2

    iput-object v2, v0, Lcom/iterable/iterableapi/g;->b:Ljava/lang/ref/WeakReference;

    :cond_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 3

    iget v0, p0, Lcom/iterable/iterableapi/e;->w:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/iterable/iterableapi/e;->x:Ljava/lang/Object;

    check-cast v0, Ldc3/h;

    new-instance v1, Lek/a;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const/4 p1, 0x3

    invoke-direct {v1, v2, p1}, Lek/a;-><init>(Ljava/lang/ref/WeakReference;I)V

    invoke-interface {v0, v1}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/iterable/iterableapi/e;->x:Ljava/lang/Object;

    check-cast v0, Lcom/iterable/iterableapi/g;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, Lcom/iterable/iterableapi/g;->b:Ljava/lang/ref/WeakReference;

    iget-boolean v1, v0, Lcom/iterable/iterableapi/g;->d:Z

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    invoke-static {p1}, Le93/b;->M(Landroid/content/pm/PackageManager;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, v0, Lcom/iterable/iterableapi/g;->d:Z

    iget-object p1, v0, Lcom/iterable/iterableapi/g;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/iterable/iterableapi/f;

    invoke-interface {v0}, Lcom/iterable/iterableapi/f;->b()V

    goto :goto_0

    :cond_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    iget v0, p0, Lcom/iterable/iterableapi/e;->w:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "outState"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :pswitch_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 3

    iget v0, p0, Lcom/iterable/iterableapi/e;->w:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/iterable/iterableapi/e;->x:Ljava/lang/Object;

    check-cast v0, Ldc3/h;

    new-instance v1, Lek/a;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const/4 p1, 0x2

    invoke-direct {v1, v2, p1}, Lek/a;-><init>(Ljava/lang/ref/WeakReference;I)V

    invoke-interface {v0, v1}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_1
    iget-object p1, p0, Lcom/iterable/iterableapi/e;->x:Ljava/lang/Object;

    check-cast p1, Lcom/iterable/iterableapi/g;

    iget-object v0, p1, Lcom/iterable/iterableapi/g;->a:Landroid/os/Handler;

    iget-object v1, p1, Lcom/iterable/iterableapi/g;->f:Landroidx/databinding/s;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget v0, p1, Lcom/iterable/iterableapi/g;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p1, Lcom/iterable/iterableapi/g;->c:I

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 3

    iget v0, p0, Lcom/iterable/iterableapi/e;->w:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/iterable/iterableapi/e;->x:Ljava/lang/Object;

    check-cast v0, Ldc3/h;

    new-instance v1, Lek/a;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const/4 p1, 0x5

    invoke-direct {v1, v2, p1}, Lek/a;-><init>(Ljava/lang/ref/WeakReference;I)V

    invoke-interface {v0, v1}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_1
    iget-object p1, p0, Lcom/iterable/iterableapi/e;->x:Ljava/lang/Object;

    check-cast p1, Lcom/iterable/iterableapi/g;

    iget v0, p1, Lcom/iterable/iterableapi/g;->c:I

    if-lez v0, :cond_0

    add-int/lit8 v0, v0, -0x1

    iput v0, p1, Lcom/iterable/iterableapi/g;->c:I

    :cond_0
    iget v0, p1, Lcom/iterable/iterableapi/g;->c:I

    if-nez v0, :cond_1

    iget-boolean v0, p1, Lcom/iterable/iterableapi/g;->d:Z

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcom/iterable/iterableapi/g;->a:Landroid/os/Handler;

    iget-object p1, p1, Lcom/iterable/iterableapi/g;->f:Landroidx/databinding/s;

    const-wide/16 v1, 0x3e8

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
