.class public Lcom/google/firebase/messaging/FirebaseMessaging;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final j:J

.field public static k:Lu93/d0;

.field public static l:Lst/a;

.field public static m:Ljava/util/concurrent/ScheduledThreadPoolExecutor;


# instance fields
.field public final a:Ldt/g;

.field public final b:Landroid/content/Context;

.field public final c:Lcom/google/crypto/tink/internal/k0;

.field public final d:Lzt/j;

.field public final e:Leh/a;

.field public final f:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field public final g:Ljava/util/concurrent/ThreadPoolExecutor;

.field public final h:Lio/sentry/android/core/j1;

.field public i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x8

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v0

    sput-wide v0, Lcom/google/firebase/messaging/FirebaseMessaging;->j:J

    new-instance v0, Lgt/f;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lgt/f;-><init>(I)V

    sput-object v0, Lcom/google/firebase/messaging/FirebaseMessaging;->l:Lst/a;

    return-void
.end method

.method public constructor <init>(Ldt/g;Lst/a;Lst/a;Ltt/d;Lst/a;Lpt/b;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    new-instance v2, Lio/sentry/android/core/j1;

    invoke-virtual {v1}, Ldt/g;->a()V

    iget-object v3, v1, Ldt/g;->a:Landroid/content/Context;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const/4 v4, 0x0

    iput v4, v2, Lio/sentry/android/core/j1;->b:I

    iput-object v3, v2, Lio/sentry/android/core/j1;->c:Ljava/lang/Object;

    new-instance v5, Lcom/google/crypto/tink/internal/k0;

    new-instance v6, Lso/b;

    invoke-virtual {v1}, Ldt/g;->a()V

    iget-object v7, v1, Ldt/g;->a:Landroid/content/Context;

    invoke-direct {v6, v7}, Lso/b;-><init>(Landroid/content/Context;)V

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    iput-object v1, v5, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    iput-object v2, v5, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    iput-object v6, v5, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    move-object/from16 v6, p2

    iput-object v6, v5, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    move-object/from16 v6, p3

    iput-object v6, v5, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    move-object/from16 v6, p4

    iput-object v6, v5, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    new-instance v6, Lap/b;

    const-string v7, "Firebase-Messaging-Task"

    invoke-direct {v6, v7}, Lap/b;-><init>(Ljava/lang/String;)V

    invoke-static {v6}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v6

    new-instance v7, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v8, Lap/b;

    const-string v9, "Firebase-Messaging-Init"

    invoke-direct {v8, v9}, Lap/b;-><init>(Ljava/lang/String;)V

    const/4 v9, 0x1

    invoke-direct {v7, v9, v8}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    new-instance v10, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v15, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v16, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct/range {v16 .. v16}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v8, Lap/b;

    const-string v11, "Firebase-Messaging-File-Io"

    invoke-direct {v8, v11}, Lap/b;-><init>(Ljava/lang/String;)V

    const/4 v11, 0x0

    const/4 v12, 0x1

    const-wide/16 v13, 0x1e

    move-object/from16 v17, v8

    invoke-direct/range {v10 .. v17}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-boolean v4, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->i:Z

    sput-object p5, Lcom/google/firebase/messaging/FirebaseMessaging;->l:Lst/a;

    iput-object v1, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Ldt/g;

    new-instance v8, Leh/a;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    iput-object v0, v8, Leh/a;->d:Ljava/lang/Object;

    move-object/from16 v11, p6

    iput-object v11, v8, Leh/a;->b:Ljava/lang/Object;

    iput-object v8, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->e:Leh/a;

    invoke-virtual {v1}, Ldt/g;->a()V

    iget-object v8, v1, Ldt/g;->a:Landroid/content/Context;

    iput-object v8, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Landroid/content/Context;

    new-instance v11, Lcom/iterable/iterableapi/e;

    const/4 v12, 0x2

    invoke-direct {v11, v12}, Lcom/iterable/iterableapi/e;-><init>(I)V

    iput-object v2, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->h:Lio/sentry/android/core/j1;

    iput-object v5, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->c:Lcom/google/crypto/tink/internal/k0;

    new-instance v12, Lzt/j;

    check-cast v6, Ljava/util/concurrent/ExecutorService;

    invoke-direct {v12, v6}, Lzt/j;-><init>(Ljava/util/concurrent/ExecutorService;)V

    iput-object v12, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->d:Lzt/j;

    iput-object v7, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->f:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    iput-object v10, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->g:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v1}, Ldt/g;->a()V

    instance-of v1, v3, Landroid/app/Application;

    if-eqz v1, :cond_0

    check-cast v3, Landroid/app/Application;

    invoke-virtual {v3, v11}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v6, "Context "

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " was not an application, can\'t register for lifecycle callbacks. Some notification events may be dropped as a result."

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "FirebaseMessaging"

    invoke-static {v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    new-instance v1, Lzt/k;

    invoke-direct {v1, v0, v4}, Lzt/k;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;I)V

    invoke-virtual {v7, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    new-instance v1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v3, Lap/b;

    const-string v4, "Firebase-Messaging-Topics-Io"

    invoke-direct {v3, v4}, Lap/b;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v9, v3}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    sget v3, Lzt/w;->j:I

    new-instance v3, Lzt/v;

    move-object/from16 p4, v0

    move-object/from16 p3, v1

    move-object/from16 p5, v2

    move-object/from16 p1, v3

    move-object/from16 p6, v5

    move-object/from16 p2, v8

    invoke-direct/range {p1 .. p6}, Lzt/v;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledThreadPoolExecutor;Lcom/google/firebase/messaging/FirebaseMessaging;Lio/sentry/android/core/j1;Lcom/google/crypto/tink/internal/k0;)V

    move-object/from16 v2, p1

    invoke-static {v1, v2}, Lcom/google/android/gms/tasks/Tasks;->b(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcq/u;

    move-result-object v1

    new-instance v2, Lvd1/c;

    const/4 v3, 0x5

    invoke-direct {v2, v0, v3}, Lvd1/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v7, v2}, Lcq/u;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcq/f;)Lcom/google/android/gms/tasks/Task;

    new-instance v1, Lzt/k;

    invoke-direct {v1, v0, v9}, Lzt/k;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;I)V

    invoke-virtual {v7, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static b(Ljava/lang/Runnable;J)V
    .locals 4

    const-class v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/firebase/messaging/FirebaseMessaging;->m:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v2, Lap/b;

    const-string v3, "TAG"

    invoke-direct {v2, v3}, Lap/b;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x1

    invoke-direct {v1, v3, v2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    sput-object v1, Lcom/google/firebase/messaging/FirebaseMessaging;->m:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, Lcom/google/firebase/messaging/FirebaseMessaging;->m:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, p0, p1, p2, v2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static declared-synchronized c()Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 2

    const-class v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Ldt/g;->b()Ldt/g;

    move-result-object v1

    invoke-static {v1}, Lcom/google/firebase/messaging/FirebaseMessaging;->getInstance(Ldt/g;)Lcom/google/firebase/messaging/FirebaseMessaging;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static declared-synchronized d(Landroid/content/Context;)Lu93/d0;
    .locals 2

    const-class v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/firebase/messaging/FirebaseMessaging;->k:Lu93/d0;

    if-nez v1, :cond_0

    new-instance v1, Lu93/d0;

    invoke-direct {v1, p0}, Lu93/d0;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/google/firebase/messaging/FirebaseMessaging;->k:Lu93/d0;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p0, Lcom/google/firebase/messaging/FirebaseMessaging;->k:Lu93/d0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static declared-synchronized getInstance(Ldt/g;)Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-class v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    monitor-enter v0

    :try_start_0
    const-class v1, Lcom/google/firebase/messaging/FirebaseMessaging;

    invoke-virtual {p0}, Ldt/g;->a()V

    iget-object p0, p0, Ldt/g;->d:Lgt/g;

    invoke-interface {p0, v1}, Lgt/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/messaging/FirebaseMessaging;

    const-string v1, "Firebase Messaging component is not present"

    invoke-static {p0, v1}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 7

    invoke-virtual {p0}, Lcom/google/firebase/messaging/FirebaseMessaging;->f()Lzt/r;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->j(Lzt/r;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v0, v0, Lzt/r;->a:Ljava/lang/String;

    return-object v0

    :cond_0
    iget-object v1, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Ldt/g;

    invoke-static {v1}, Lio/sentry/android/core/j1;->c(Ldt/g;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->d:Lzt/j;

    const-string v3, "Making new request for: "

    const-string v4, "Joining ongoing request for: "

    monitor-enter v2

    :try_start_0
    iget-object v5, v2, Lzt/j;->b:Ljava/lang/Object;

    check-cast v5, La0/g;

    invoke-virtual {v5, v1}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/tasks/Task;

    const/4 v6, 0x3

    if-eqz v5, :cond_2

    const-string v0, "FirebaseMessaging"

    invoke-static {v0, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "FirebaseMessaging"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_1
    :goto_0
    monitor-exit v2

    goto :goto_1

    :cond_2
    :try_start_1
    const-string v4, "FirebaseMessaging"

    invoke-static {v4, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_3

    const-string v4, "FirebaseMessaging"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    iget-object v3, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->c:Lcom/google/crypto/tink/internal/k0;

    iget-object v4, v3, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v4, Ldt/g;

    invoke-static {v4}, Lio/sentry/android/core/j1;->c(Ldt/g;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "*"

    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v3, v4, v5, v6}, Lcom/google/crypto/tink/internal/k0;->T(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lcom/google/android/gms/tasks/Task;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/crypto/tink/internal/k0;->o(Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object v3

    iget-object v4, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->g:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v5, Lbc/i;

    const/16 v6, 0x11

    invoke-direct {v5, p0, v1, v0, v6}, Lbc/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcq/h;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v3, v2, Lzt/j;->a:Ljava/lang/Object;

    check-cast v3, Ljava/util/concurrent/Executor;

    new-instance v4, Lbu/d;

    invoke-direct {v4, v2, v1}, Lbu/d;-><init>(Lzt/j;Ljava/lang/String;)V

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcq/b;)Lcom/google/android/gms/tasks/Task;

    move-result-object v5

    iget-object v0, v2, Lzt/j;->b:Ljava/lang/Object;

    check-cast v0, La0/g;

    invoke-virtual {v0, v1, v5}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v2

    :goto_1
    :try_start_2
    invoke-static {v5}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    :goto_2
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :goto_3
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method public final e()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Ldt/g;

    invoke-virtual {v0}, Ldt/g;->a()V

    iget-object v1, v0, Ldt/g;->b:Ljava/lang/String;

    const-string v2, "[DEFAULT]"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ldt/g;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lzt/r;
    .locals 4

    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->d(Landroid/content/Context;)Lu93/d0;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/firebase/messaging/FirebaseMessaging;->e()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Ldt/g;

    invoke-static {v2}, Lio/sentry/android/core/j1;->c(Ldt/g;)Ljava/lang/String;

    move-result-object v2

    monitor-enter v0

    :try_start_0
    iget-object v3, v0, Lu93/d0;->w:Ljava/lang/Object;

    check-cast v3, Landroid/content/SharedPreferences;

    invoke-static {v1, v2}, Lu93/d0;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v3, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lzt/r;->b(Ljava/lang/String;)Lzt/r;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final g()V
    .locals 6

    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->c:Lcom/google/crypto/tink/internal/k0;

    iget-object v0, v0, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v0, Lso/b;

    iget-object v1, v0, Lso/b;->c:Lce3/a0;

    invoke-virtual {v1}, Lce3/a0;->b()I

    move-result v1

    const v2, 0xe5ee4e0

    if-lt v1, v2, :cond_0

    iget-object v0, v0, Lso/b;->b:Landroid/content/Context;

    invoke-static {v0}, Lso/o;->b(Landroid/content/Context;)Lso/o;

    move-result-object v0

    sget-object v1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    new-instance v2, Lso/n;

    monitor-enter v0

    :try_start_0
    iget v3, v0, Lso/o;->a:I

    add-int/lit8 v4, v3, 0x1

    iput v4, v0, Lso/o;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    const/4 v4, 0x1

    const/4 v5, 0x5

    invoke-direct {v2, v3, v5, v1, v4}, Lso/n;-><init>(IILandroid/os/Bundle;I)V

    invoke-virtual {v0, v2}, Lso/o;->c(Lso/n;)Lcq/u;

    move-result-object v0

    sget-object v1, Lso/p;->w:Lso/p;

    sget-object v2, Lso/e;->w:Lso/e;

    invoke-virtual {v0, v1, v2}, Lcq/u;->continueWith(Ljava/util/concurrent/Executor;Lcq/b;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    goto :goto_0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "SERVICE_NOT_AVAILABLE"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->c(Ljava/lang/Exception;)Lcq/u;

    move-result-object v0

    :goto_0
    iget-object v1, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->f:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v2, Lrm/p;

    const/16 v3, 0x19

    invoke-direct {v2, p0, v3}, Lrm/p;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcq/f;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public final h()Z
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Landroid/content/Context;

    invoke-static {v0}, Le3/b;->c(Landroid/content/Context;)V

    invoke-static {v0}, Le3/b;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Ldt/g;

    invoke-virtual {v0}, Ldt/g;->a()V

    iget-object v0, v0, Ldt/g;->d:Lgt/g;

    const-class v1, Let/a;

    invoke-interface {v0, v1}, Lgt/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Lva3/l;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/google/firebase/messaging/FirebaseMessaging;->l:Lst/a;

    if-eqz v0, :cond_2

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_2
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method public final declared-synchronized i(J)V
    .locals 4

    monitor-enter p0

    const-wide/16 v0, 0x2

    mul-long/2addr v0, p1

    const-wide/16 v2, 0x1e

    :try_start_0
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    sget-wide v2, Lcom/google/firebase/messaging/FirebaseMessaging;->j:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    new-instance v2, Lzt/s;

    invoke-direct {v2, p0, v0, v1}, Lzt/s;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;J)V

    invoke-static {v2, p1, p2}, Lcom/google/firebase/messaging/FirebaseMessaging;->b(Ljava/lang/Runnable;J)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final j(Lzt/r;)Z
    .locals 7

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->h:Lio/sentry/android/core/j1;

    invoke-virtual {v0}, Lio/sentry/android/core/j1;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-wide v3, p1, Lzt/r;->c:J

    sget-wide v5, Lzt/r;->d:J

    add-long/2addr v3, v5

    cmp-long v1, v1, v3

    if-gtz v1, :cond_1

    iget-object p1, p1, Lzt/r;->b:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
