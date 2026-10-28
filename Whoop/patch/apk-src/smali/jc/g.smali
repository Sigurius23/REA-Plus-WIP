.class public final Ljc/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpc/a;


# static fields
.field public static final l:Ljava/lang/String;


# instance fields
.field public a:Landroid/os/PowerManager$WakeLock;

.field public final b:Landroid/content/Context;

.field public final c:Lic/b;

.field public final d:Lsc/b;

.field public final e:Landroidx/work/impl/WorkDatabase;

.field public final f:Ljava/util/HashMap;

.field public final g:Ljava/util/HashMap;

.field public final h:Ljava/util/HashMap;

.field public final i:Ljava/util/HashSet;

.field public final j:Ljava/util/ArrayList;

.field public final k:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "Processor"

    invoke-static {v0}, Lic/w;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ljc/g;->l:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lic/b;Lsc/b;Landroidx/work/impl/WorkDatabase;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljc/g;->b:Landroid/content/Context;

    iput-object p2, p0, Ljc/g;->c:Lic/b;

    iput-object p3, p0, Ljc/g;->d:Lsc/b;

    iput-object p4, p0, Ljc/g;->e:Landroidx/work/impl/WorkDatabase;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ljc/g;->g:Ljava/util/HashMap;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ljc/g;->f:Ljava/util/HashMap;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Ljc/g;->i:Ljava/util/HashSet;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ljc/g;->j:Ljava/util/ArrayList;

    const/4 p1, 0x0

    iput-object p1, p0, Ljc/g;->a:Landroid/os/PowerManager$WakeLock;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljc/g;->k:Ljava/lang/Object;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ljc/g;->h:Ljava/util/HashMap;

    return-void
.end method

.method public static d(Ljava/lang/String;Ljc/i0;I)Z
    .locals 2

    sget-object v0, Ljc/g;->l:Ljava/lang/String;

    if-eqz p1, :cond_0

    iget-object p1, p1, Ljc/i0;->n:Lbc3/l1;

    new-instance v1, Landroidx/work/impl/WorkerStoppedException;

    invoke-direct {v1, p2}, Landroidx/work/impl/WorkerStoppedException;-><init>(I)V

    invoke-virtual {p1, v1}, Lbc3/t1;->p(Ljava/util/concurrent/CancellationException;)V

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "WorkerWrapper interrupted for "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, v0, p0}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0

    :cond_0
    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "WorkerWrapper could not be found for "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, v0, p0}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final a(Ljc/d;)V
    .locals 2

    iget-object v0, p0, Ljc/g;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ljc/g;->j:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final b(Ljava/lang/String;)Ljc/i0;
    .locals 5

    iget-object v0, p0, Ljc/g;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljc/i0;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    iget-object v0, p0, Ljc/g;->g:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljc/i0;

    :cond_1
    iget-object v2, p0, Ljc/g;->h:Ljava/util/HashMap;

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v1, :cond_3

    iget-object p1, p0, Ljc/g;->k:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v1, p0, Ljc/g;->f:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ljc/g;->b:Landroid/content/Context;

    invoke-static {v1}, Lpc/b;->c(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v2, p0, Ljc/g;->b:Landroid/content/Context;

    invoke-virtual {v2, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    :try_start_2
    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v2

    sget-object v3, Ljc/g;->l:Ljava/lang/String;

    const-string v4, "Unable to stop foreground service"

    invoke-virtual {v2, v3, v4, v1}, Lic/w;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    iget-object v1, p0, Ljc/g;->a:Landroid/os/PowerManager$WakeLock;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->release()V

    const/4 v1, 0x0

    iput-object v1, p0, Ljc/g;->a:Landroid/os/PowerManager$WakeLock;

    goto :goto_2

    :catchall_1
    move-exception v0

    goto :goto_3

    :cond_2
    :goto_2
    monitor-exit p1

    goto :goto_4

    :goto_3
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    :cond_3
    :goto_4
    return-object v0
.end method

.method public final c(Ljava/lang/String;)Ljc/i0;
    .locals 1

    iget-object v0, p0, Ljc/g;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljc/i0;

    if-nez v0, :cond_0

    iget-object v0, p0, Ljc/g;->g:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljc/i0;

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final e(Lqc/j;)V
    .locals 3

    iget-object v0, p0, Ljc/g;->d:Lsc/b;

    iget-object v0, v0, Lsc/b;->d:Lcq/s;

    new-instance v1, Lio/sentry/android/core/r0;

    const/16 v2, 0x9

    invoke-direct {v1, v2, p0, p1}, Lio/sentry/android/core/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcq/s;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
