.class public final Lcom/bumptech/glide/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks2;
.implements Lml/d;


# static fields
.field public static final L:Lpl/d;


# instance fields
.field public final E:Lml/h;

.field public final F:Lml/j;

.field public final G:Lbq/b;

.field public final H:Landroid/os/Handler;

.field public final I:Lml/a;

.field public final J:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final K:Lpl/d;

.field public final w:Lcom/bumptech/glide/b;

.field public final x:Landroid/content/Context;

.field public final y:Lml/c;

.field public final z:Lf1/p1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lpl/d;

    invoke-direct {v0}, Lpl/a;-><init>()V

    const-class v1, Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lpl/a;->c(Ljava/lang/Class;)Lpl/a;

    move-result-object v0

    check-cast v0, Lpl/d;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lpl/a;->P:Z

    sput-object v0, Lcom/bumptech/glide/h;->L:Lpl/d;

    new-instance v0, Lpl/d;

    invoke-direct {v0}, Lpl/a;-><init>()V

    const-class v2, Lkl/b;

    invoke-virtual {v0, v2}, Lpl/a;->c(Ljava/lang/Class;)Lpl/a;

    move-result-object v0

    check-cast v0, Lpl/d;

    iput-boolean v1, v0, Lpl/a;->P:Z

    new-instance v0, Lpl/d;

    invoke-direct {v0}, Lpl/a;-><init>()V

    sget-object v2, Lzk/k;->d:Lzk/k;

    invoke-virtual {v0, v2}, Lpl/a;->d(Lzk/k;)Lpl/a;

    move-result-object v0

    check-cast v0, Lpl/d;

    invoke-virtual {v0}, Lpl/a;->l()Lpl/a;

    move-result-object v0

    check-cast v0, Lpl/d;

    invoke-virtual {v0, v1}, Lpl/a;->r(Z)Lpl/a;

    move-result-object v0

    check-cast v0, Lpl/d;

    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/b;Lml/c;Lml/h;Landroid/content/Context;)V
    .locals 6

    new-instance v0, Lf1/p1;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lf1/p1;-><init>(I)V

    iget-object v1, p1, Lcom/bumptech/glide/b;->H:Ljc/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v2, Lml/j;

    invoke-direct {v2}, Lml/j;-><init>()V

    iput-object v2, p0, Lcom/bumptech/glide/h;->F:Lml/j;

    new-instance v2, Lbq/b;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Lbq/b;-><init>(Ljava/lang/Object;I)V

    iput-object v2, p0, Lcom/bumptech/glide/h;->G:Lbq/b;

    new-instance v3, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v3, p0, Lcom/bumptech/glide/h;->H:Landroid/os/Handler;

    iput-object p1, p0, Lcom/bumptech/glide/h;->w:Lcom/bumptech/glide/b;

    iput-object p2, p0, Lcom/bumptech/glide/h;->y:Lml/c;

    iput-object p3, p0, Lcom/bumptech/glide/h;->E:Lml/h;

    iput-object v0, p0, Lcom/bumptech/glide/h;->z:Lf1/p1;

    iput-object p4, p0, Lcom/bumptech/glide/h;->x:Landroid/content/Context;

    invoke-virtual {p4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p3

    new-instance p4, Lio/sentry/internal/debugmeta/c;

    invoke-direct {p4, p0, v0}, Lio/sentry/internal/debugmeta/c;-><init>(Lcom/bumptech/glide/h;Lf1/p1;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "ConnectivityMonitor"

    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    invoke-static {p3, v1}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v4, 0x1

    if-nez v1, :cond_0

    move v1, v4

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v5, 0x3

    invoke-static {v0, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_2

    if-eqz v1, :cond_1

    const-string v5, "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor"

    goto :goto_1

    :cond_1
    const-string v5, "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor"

    :goto_1
    invoke-static {v0, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    if-eqz v1, :cond_3

    new-instance v0, Lml/b;

    invoke-direct {v0, p3, p4}, Lml/b;-><init>(Landroid/content/Context;Lio/sentry/internal/debugmeta/c;)V

    goto :goto_2

    :cond_3
    new-instance v0, Lml/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :goto_2
    iput-object v0, p0, Lcom/bumptech/glide/h;->I:Lml/a;

    invoke-static {}, Ltl/l;->g()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-virtual {v3, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_3

    :cond_4
    invoke-interface {p2, p0}, Lml/c;->h(Lml/d;)V

    :goto_3
    invoke-interface {p2, v0}, Lml/c;->h(Lml/d;)V

    new-instance p2, Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object p3, p1, Lcom/bumptech/glide/b;->z:Lcom/bumptech/glide/c;

    iget-object p3, p3, Lcom/bumptech/glide/c;->e:Ljava/util/List;

    invoke-direct {p2, p3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p2, p0, Lcom/bumptech/glide/h;->J:Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object p2, p1, Lcom/bumptech/glide/b;->z:Lcom/bumptech/glide/c;

    monitor-enter p2

    :try_start_0
    iget-object p3, p2, Lcom/bumptech/glide/c;->i:Lpl/d;

    if-nez p3, :cond_5

    iget-object p3, p2, Lcom/bumptech/glide/c;->d:Lio/sentry/hints/j;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p3, Lpl/d;

    invoke-direct {p3}, Lpl/a;-><init>()V

    iput-boolean v4, p3, Lpl/a;->P:Z

    iput-object p3, p2, Lcom/bumptech/glide/c;->i:Lpl/d;

    goto :goto_4

    :catchall_0
    move-exception p1

    goto :goto_7

    :cond_5
    :goto_4
    iget-object p3, p2, Lcom/bumptech/glide/c;->i:Lpl/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p2

    monitor-enter p0

    :try_start_1
    invoke-virtual {p3}, Lpl/a;->b()Lpl/a;

    move-result-object p2

    check-cast p2, Lpl/d;

    iget-boolean p3, p2, Lpl/a;->P:Z

    if-eqz p3, :cond_7

    iget-boolean p3, p2, Lpl/a;->Q:Z

    if-eqz p3, :cond_6

    goto :goto_5

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "You cannot auto lock an already locked options object, try clone() first"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    :goto_5
    iput-boolean v4, p2, Lpl/a;->Q:Z

    iput-boolean v4, p2, Lpl/a;->P:Z

    iput-object p2, p0, Lcom/bumptech/glide/h;->K:Lpl/d;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    monitor-exit p0

    iget-object p2, p1, Lcom/bumptech/glide/b;->I:Ljava/util/ArrayList;

    monitor-enter p2

    :try_start_2
    iget-object p3, p1, Lcom/bumptech/glide/b;->I:Ljava/util/ArrayList;

    invoke-virtual {p3, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_8

    iget-object p1, p1, Lcom/bumptech/glide/b;->I:Ljava/util/ArrayList;

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit p2

    return-void

    :catchall_1
    move-exception p1

    goto :goto_6

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p3, "Cannot register already registered manager"

    invoke-direct {p1, p3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_6
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    :catchall_2
    move-exception p1

    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw p1

    :goto_7
    :try_start_4
    monitor-exit p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method


# virtual methods
.method public final i(Ljava/lang/Class;)Lcom/bumptech/glide/f;
    .locals 3

    new-instance v0, Lcom/bumptech/glide/f;

    iget-object v1, p0, Lcom/bumptech/glide/h;->w:Lcom/bumptech/glide/b;

    iget-object v2, p0, Lcom/bumptech/glide/h;->x:Landroid/content/Context;

    invoke-direct {v0, v1, p0, p1, v2}, Lcom/bumptech/glide/f;-><init>(Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;Ljava/lang/Class;Landroid/content/Context;)V

    return-object v0
.end method

.method public final j()Lcom/bumptech/glide/f;
    .locals 2

    const-class v0, Landroid/graphics/Bitmap;

    invoke-virtual {p0, v0}, Lcom/bumptech/glide/h;->i(Ljava/lang/Class;)Lcom/bumptech/glide/f;

    move-result-object v0

    sget-object v1, Lcom/bumptech/glide/h;->L:Lpl/d;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/f;->w(Lpl/a;)Lcom/bumptech/glide/f;

    move-result-object v0

    return-object v0
.end method

.method public final k(Lql/i;)V
    .locals 4

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/h;->p(Lql/i;)Z

    move-result v0

    invoke-interface {p1}, Lql/i;->d()Lpl/b;

    move-result-object v1

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/bumptech/glide/h;->w:Lcom/bumptech/glide/b;

    iget-object v2, v0, Lcom/bumptech/glide/b;->I:Ljava/util/ArrayList;

    monitor-enter v2

    :try_start_0
    iget-object v0, v0, Lcom/bumptech/glide/b;->I:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/bumptech/glide/h;

    invoke-virtual {v3, p1}, Lcom/bumptech/glide/h;->p(Lql/i;)Z

    move-result v3

    if-eqz v3, :cond_1

    monitor-exit v2

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_2
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_3

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lql/i;->f(Lpl/b;)V

    check-cast v1, Lpl/e;

    invoke-virtual {v1}, Lpl/e;->c()V

    return-void

    :goto_0
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_3
    :goto_1
    return-void
.end method

.method public final l(Ljava/lang/Integer;)Lcom/bumptech/glide/f;
    .locals 6

    const-class v0, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lcom/bumptech/glide/h;->i(Ljava/lang/Class;)Lcom/bumptech/glide/f;

    move-result-object v0

    iput-object p1, v0, Lcom/bumptech/glide/f;->Y:Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lcom/bumptech/glide/f;->a0:Z

    iget-object p1, v0, Lcom/bumptech/glide/f;->T:Landroid/content/Context;

    sget-object v1, Lsl/b;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lsl/b;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwk/e;

    if-nez v3, :cond_2

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Cannot resolve info for"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "AppVersionSignature"

    invoke-static {v5, v4, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_0

    iget v3, v3, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_0
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_1
    new-instance v4, Lsl/d;

    invoke-direct {v4, v3}, Lsl/d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v1, v4}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwk/e;

    if-nez v1, :cond_1

    move-object v3, v4

    goto :goto_2

    :cond_1
    move-object v3, v1

    :cond_2
    :goto_2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget p1, p1, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p1, p1, 0x30

    new-instance v1, Lsl/a;

    invoke-direct {v1, p1, v3}, Lsl/a;-><init>(ILwk/e;)V

    new-instance p1, Lpl/d;

    invoke-direct {p1}, Lpl/a;-><init>()V

    invoke-virtual {p1, v1}, Lpl/a;->q(Lwk/e;)Lpl/a;

    move-result-object p1

    check-cast p1, Lpl/d;

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/f;->w(Lpl/a;)Lcom/bumptech/glide/f;

    move-result-object p1

    return-object p1
.end method

.method public final m(Ljava/lang/String;)Lcom/bumptech/glide/f;
    .locals 1

    const-class v0, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lcom/bumptech/glide/h;->i(Ljava/lang/Class;)Lcom/bumptech/glide/f;

    move-result-object v0

    iput-object p1, v0, Lcom/bumptech/glide/f;->Y:Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lcom/bumptech/glide/f;->a0:Z

    return-object v0
.end method

.method public final declared-synchronized n()V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/h;->z:Lf1/p1;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lf1/p1;->x:Z

    iget-object v1, v0, Lf1/p1;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    invoke-static {v1}, Ltl/l;->d(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpl/b;

    check-cast v2, Lpl/e;

    invoke-virtual {v2}, Lpl/e;->f()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, v2, Lpl/e;->c:Ljava/lang/Object;

    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v2}, Lpl/e;->f()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v2}, Lpl/e;->c()V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    :goto_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v3, v0, Lf1/p1;->z:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :goto_2
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :cond_2
    monitor-exit p0

    return-void

    :catchall_1
    move-exception v0

    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v0
.end method

.method public final declared-synchronized o()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/h;->z:Lf1/p1;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lf1/p1;->x:Z

    iget-object v1, v0, Lf1/p1;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    invoke-static {v1}, Ltl/l;->d(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpl/b;

    check-cast v2, Lpl/e;

    invoke-virtual {v2}, Lpl/e;->e()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Lpl/e;->f()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Lpl/e;->a()V

    goto :goto_0

    :cond_1
    iget-object v0, v0, Lf1/p1;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    return-void
.end method

.method public final declared-synchronized onDestroy()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/h;->F:Lml/j;

    invoke-virtual {v0}, Lml/j;->onDestroy()V

    iget-object v0, p0, Lcom/bumptech/glide/h;->F:Lml/j;

    iget-object v0, v0, Lml/j;->w:Ljava/util/Set;

    invoke-static {v0}, Ltl/l;->d(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lql/i;

    invoke-virtual {p0, v1}, Lcom/bumptech/glide/h;->k(Lql/i;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/h;->F:Lml/j;

    iget-object v0, v0, Lml/j;->w:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    iget-object v0, p0, Lcom/bumptech/glide/h;->z:Lf1/p1;

    iget-object v1, v0, Lf1/p1;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    invoke-static {v1}, Ltl/l;->d(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpl/b;

    invoke-virtual {v0, v2}, Lf1/p1;->f(Lpl/b;)Z

    goto :goto_1

    :cond_1
    iget-object v0, v0, Lf1/p1;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lcom/bumptech/glide/h;->y:Lml/c;

    invoke-interface {v0, p0}, Lml/c;->k(Lml/d;)V

    iget-object v0, p0, Lcom/bumptech/glide/h;->y:Lml/c;

    iget-object v1, p0, Lcom/bumptech/glide/h;->I:Lml/a;

    invoke-interface {v0, v1}, Lml/c;->k(Lml/d;)V

    iget-object v0, p0, Lcom/bumptech/glide/h;->H:Landroid/os/Handler;

    iget-object v1, p0, Lcom/bumptech/glide/h;->G:Lbq/b;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/bumptech/glide/h;->w:Lcom/bumptech/glide/b;

    iget-object v1, v0, Lcom/bumptech/glide/b;->I:Ljava/util/ArrayList;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v2, v0, Lcom/bumptech/glide/b;->I:Ljava/util/ArrayList;

    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v0, v0, Lcom/bumptech/glide/b;->I:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit p0

    return-void

    :catchall_1
    move-exception v0

    goto :goto_2

    :cond_2
    :try_start_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Cannot unregister not yet registered manager"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    throw v0

    :goto_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method public final onLowMemory()V
    .locals 0

    return-void
.end method

.method public final declared-synchronized onStart()V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/bumptech/glide/h;->o()V

    iget-object v0, p0, Lcom/bumptech/glide/h;->F:Lml/j;

    invoke-virtual {v0}, Lml/j;->onStart()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized onStop()V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/bumptech/glide/h;->n()V

    iget-object v0, p0, Lcom/bumptech/glide/h;->F:Lml/j;

    invoke-virtual {v0}, Lml/j;->onStop()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final onTrimMemory(I)V
    .locals 0

    return-void
.end method

.method public final declared-synchronized p(Lql/i;)Z
    .locals 3

    monitor-enter p0

    :try_start_0
    invoke-interface {p1}, Lql/i;->d()Lpl/b;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    iget-object v2, p0, Lcom/bumptech/glide/h;->z:Lf1/p1;

    invoke-virtual {v2, v0}, Lf1/p1;->f(Lpl/b;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/bumptech/glide/h;->F:Lml/j;

    iget-object v0, v0, Lml/j;->w:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lql/i;->f(Lpl/b;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    monitor-exit p0

    const/4 p1, 0x0

    return p1

    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized toString()Ljava/lang/String;
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{tracker="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/bumptech/glide/h;->z:Lf1/p1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", treeNode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/bumptech/glide/h;->E:Lml/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
