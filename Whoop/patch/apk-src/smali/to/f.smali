.class public final Lto/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# static fields
.field public static final P:Lcom/google/android/gms/common/api/Status;

.field public static final Q:Lcom/google/android/gms/common/api/Status;

.field public static final R:Ljava/lang/Object;

.field public static S:Lto/f;


# instance fields
.field public final E:Landroid/content/Context;

.field public final F:Lcom/google/android/gms/common/GoogleApiAvailability;

.field public final G:Lp0/n0;

.field public final H:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final I:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final J:Ljava/util/concurrent/ConcurrentHashMap;

.field public K:Lto/s;

.field public final L:La0/h;

.field public final M:La0/h;

.field public final N:Ljp/d;

.field public volatile O:Z

.field public w:J

.field public x:Z

.field public y:Luo/m;

.field public z:Lwo/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/4 v1, 0x4

    const-string v2, "Sign-out occurred while this API call was in progress."

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/a;)V

    sput-object v0, Lto/f;->P:Lcom/google/android/gms/common/api/Status;

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const-string v2, "The user must be signed in to make this API call."

    invoke-direct {v0, v1, v2, v3, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/a;)V

    sput-object v0, Lto/f;->Q:Lcom/google/android/gms/common/api/Status;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lto/f;->R:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/GoogleApiAvailability;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x2710

    iput-wide v0, p0, Lto/f;->w:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lto/f;->x:Z

    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v1, p0, Lto/f;->H:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v1, p0, Lto/f;->I:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v3, 0x5

    const/high16 v4, 0x3f400000    # 0.75f

    invoke-direct {v1, v3, v4, v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    iput-object v1, p0, Lto/f;->J:Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v1, 0x0

    iput-object v1, p0, Lto/f;->K:Lto/s;

    new-instance v1, La0/h;

    invoke-direct {v1, v0}, La0/h;-><init>(I)V

    iput-object v1, p0, Lto/f;->L:La0/h;

    new-instance v1, La0/h;

    invoke-direct {v1, v0}, La0/h;-><init>(I)V

    iput-object v1, p0, Lto/f;->M:La0/h;

    iput-boolean v2, p0, Lto/f;->O:Z

    iput-object p1, p0, Lto/f;->E:Landroid/content/Context;

    new-instance v1, Ljp/d;

    invoke-direct {v1, p2, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    iput-object v1, p0, Lto/f;->N:Ljp/d;

    iput-object p3, p0, Lto/f;->F:Lcom/google/android/gms/common/GoogleApiAvailability;

    new-instance p2, Lp0/n0;

    invoke-direct {p2, p3}, Lp0/n0;-><init>(Lcom/google/android/gms/common/GoogleApiAvailability;)V

    iput-object p2, p0, Lto/f;->G:Lp0/n0;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    sget-object p2, Lzo/b;->e:Ljava/lang/Boolean;

    if-nez p2, :cond_0

    const-string p2, "android.hardware.type.automotive"

    invoke-virtual {p1, p2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    sput-object p1, Lzo/b;->e:Ljava/lang/Boolean;

    :cond_0
    sget-object p1, Lzo/b;->e:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    iput-boolean v0, p0, Lto/f;->O:Z

    :cond_1
    const/4 p1, 0x6

    invoke-virtual {v1, p1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public static a()V
    .locals 3

    sget-object v0, Lto/f;->R:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lto/f;->S:Lto/f;

    if-eqz v1, :cond_0

    iget-object v2, v1, Lto/f;->I:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    iget-object v1, v1, Lto/f;->N:Ljp/d;

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static d(Lto/a;Lcom/google/android/gms/common/a;)Lcom/google/android/gms/common/api/Status;
    .locals 5

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    iget-object p0, p0, Lto/a;->b:Lcom/google/android/gms/common/api/f;

    iget-object p0, p0, Lcom/google/android/gms/common/api/f;->b:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x3f

    add-int/2addr v2, v3

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "API: "

    const-string v3, " is not available on this device. Connection failed with: "

    invoke-static {v4, v2, p0, v3, v1}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/16 v1, 0x11

    iget-object v2, p1, Lcom/google/android/gms/common/a;->y:Landroid/app/PendingIntent;

    invoke-direct {v0, v1, p0, v2, p1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/a;)V

    return-object v0
.end method

.method public static e(Landroid/content/Context;)Lto/f;
    .locals 5

    sget-object v0, Lto/f;->R:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lto/f;->S:Lto/f;

    if-nez v1, :cond_1

    sget-object v1, Luo/h0;->g:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    sget-object v2, Luo/h0;->i:Landroid/os/HandlerThread;

    if-eqz v2, :cond_0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    new-instance v2, Landroid/os/HandlerThread;

    const-string v3, "GoogleApiHandler"

    const/16 v4, 0x9

    invoke-direct {v2, v3, v4}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    sput-object v2, Luo/h0;->i:Landroid/os/HandlerThread;

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    sget-object v2, Luo/h0;->i:Landroid/os/HandlerThread;

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    :try_start_2
    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lto/f;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailability;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailability;

    move-result-object v3

    invoke-direct {v2, p0, v1, v3}, Lto/f;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/GoogleApiAvailability;)V

    sput-object v2, Lto/f;->S:Lto/f;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p0

    goto :goto_3

    :goto_1
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p0

    :cond_1
    :goto_2
    sget-object p0, Lto/f;->S:Lto/f;

    monitor-exit v0

    return-object p0

    :goto_3
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p0
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/common/api/h;)Lto/v;
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/h;->getApiKey()Lto/a;

    move-result-object v0

    iget-object v1, p0, Lto/f;->J:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lto/v;

    if-nez v2, :cond_0

    new-instance v2, Lto/v;

    invoke-direct {v2, p0, p1}, Lto/v;-><init>(Lto/f;Lcom/google/android/gms/common/api/h;)V

    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object p1, v2, Lto/v;->g:Lcom/google/android/gms/common/api/d;

    invoke-interface {p1}, Lcom/google/android/gms/common/api/d;->a()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lto/f;->M:La0/h;

    invoke-virtual {p1, v0}, La0/h;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {v2}, Lto/v;->o()V

    return-object v2
.end method

.method public final c(Lcq/i;ILcom/google/android/gms/common/api/h;)V
    .locals 2

    if-eqz p2, :cond_0

    invoke-virtual {p3}, Lcom/google/android/gms/common/api/h;->getApiKey()Lto/a;

    move-result-object p3

    invoke-static {p0, p2, p3}, Lto/b0;->a(Lto/f;ILto/a;)Lto/b0;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p1, p1, Lcq/i;->a:Lcq/u;

    iget-object p3, p0, Lto/f;->N:Ljp/d;

    invoke-static {p3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lc5/l;

    const/4 v1, 0x3

    invoke-direct {v0, p3, v1}, Lc5/l;-><init>(Landroid/os/Handler;I)V

    invoke-virtual {p1, v0, p2}, Lcq/u;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcq/d;)Lcom/google/android/gms/tasks/Task;

    :cond_0
    return-void
.end method

.method public final f(Lto/s;)V
    .locals 2

    sget-object v0, Lto/f;->R:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lto/f;->K:Lto/s;

    if-eq v1, p1, :cond_0

    iput-object p1, p0, Lto/f;->K:Lto/s;

    iget-object v1, p0, Lto/f;->L:La0/h;

    invoke-virtual {v1}, La0/h;->clear()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lto/f;->L:La0/h;

    invoke-virtual {p1}, Lto/s;->n()La0/h;

    move-result-object p1

    invoke-virtual {v1, p1}, La0/h;->addAll(Ljava/util/Collection;)Z

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final g()Z
    .locals 3

    iget-boolean v0, p0, Lto/f;->x:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Luo/k;->a()Luo/k;

    move-result-object v0

    iget-object v0, v0, Luo/k;->a:Ljava/lang/Object;

    check-cast v0, Luo/l;

    if-eqz v0, :cond_1

    iget-boolean v0, v0, Luo/l;->x:Z

    if-eqz v0, :cond_2

    :cond_1
    iget-object v0, p0, Lto/f;->G:Lp0/n0;

    iget-object v0, v0, Lp0/n0;->x:Ljava/lang/Object;

    check-cast v0, Landroid/util/SparseIntArray;

    monitor-enter v0

    const/4 v1, -0x1

    const v2, 0xc1fa340

    :try_start_0
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->get(II)I

    move-result v2

    monitor-exit v0

    if-eq v2, v1, :cond_3

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x0

    return v0

    :cond_3
    :goto_1
    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final h(Lcom/google/android/gms/common/api/h;Lto/l;Lto/r;Ljava/lang/Runnable;)Lcq/u;
    .locals 3

    new-instance v0, Lcq/i;

    invoke-direct {v0}, Lcq/i;-><init>()V

    invoke-virtual {p2}, Lto/l;->c()I

    move-result v1

    invoke-virtual {p0, v0, v1, p1}, Lto/f;->c(Lcq/i;ILcom/google/android/gms/common/api/h;)V

    new-instance v1, Lto/l0;

    new-instance v2, Lto/f0;

    invoke-direct {v2, p2, p3, p4}, Lto/f0;-><init>(Lto/l;Lto/r;Ljava/lang/Runnable;)V

    invoke-direct {v1, v2, v0}, Lto/l0;-><init>(Lto/f0;Lcq/i;)V

    new-instance p2, Lto/e0;

    iget-object p3, p0, Lto/f;->I:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p3

    invoke-direct {p2, v1, p3, p1}, Lto/e0;-><init>(Lto/n0;ILcom/google/android/gms/common/api/h;)V

    const/16 p1, 0x8

    iget-object p3, p0, Lto/f;->N:Ljp/d;

    invoke-virtual {p3, p1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    iget-object p1, v0, Lcq/i;->a:Lcq/u;

    return-object p1
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 11

    const-string v0, "GoogleApiManager"

    iget-object v1, p0, Lto/f;->N:Ljp/d;

    iget-object v2, p0, Lto/f;->J:Ljava/util/concurrent/ConcurrentHashMap;

    iget v3, p1, Landroid/os/Message;->what:I

    const/16 v4, 0xd

    const-wide/32 v5, 0x493e0

    const/16 v7, 0x11

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    packed-switch v3, :pswitch_data_0

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    new-instance v1, Ljava/lang/StringBuilder;

    add-int/lit8 p1, p1, 0x14

    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p1, "Unknown message id: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v8

    :pswitch_0
    iput-boolean v8, p0, Lto/f;->x:Z

    return v10

    :pswitch_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lto/c0;

    iget-wide v2, p1, Lto/c0;->c:J

    iget-object v0, p1, Lto/c0;->a:Luo/j;

    iget v4, p1, Lto/c0;->b:I

    const-wide/16 v5, 0x0

    cmp-long v5, v2, v5

    if-nez v5, :cond_1

    new-instance p1, Luo/m;

    filled-new-array {v0}, [Luo/j;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p1, v4, v0}, Luo/m;-><init>(ILjava/util/List;)V

    iget-object v0, p0, Lto/f;->z:Lwo/b;

    if-nez v0, :cond_0

    iget-object v0, p0, Lto/f;->E:Landroid/content/Context;

    invoke-static {v0}, Ls30/b;->l(Landroid/content/Context;)Lwo/b;

    move-result-object v0

    iput-object v0, p0, Lto/f;->z:Lwo/b;

    :cond_0
    iget-object v0, p0, Lto/f;->z:Lwo/b;

    invoke-virtual {v0, p1}, Lwo/b;->c(Luo/m;)Lcom/google/android/gms/tasks/Task;

    return v10

    :cond_1
    iget-object v5, p0, Lto/f;->y:Luo/m;

    if-eqz v5, :cond_7

    invoke-virtual {v5}, Luo/m;->f()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v5}, Luo/m;->b()I

    move-result v5

    if-ne v5, v4, :cond_3

    if-eqz v6, :cond_2

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v5

    iget p1, p1, Lto/c0;->d:I

    if-lt v5, p1, :cond_2

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lto/f;->y:Luo/m;

    invoke-virtual {p1, v0}, Luo/m;->h(Luo/j;)V

    goto :goto_1

    :cond_3
    :goto_0
    invoke-virtual {v1, v7}, Landroid/os/Handler;->removeMessages(I)V

    iget-object p1, p0, Lto/f;->y:Luo/m;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Luo/m;->b()I

    move-result v5

    if-gtz v5, :cond_4

    invoke-virtual {p0}, Lto/f;->g()Z

    move-result v5

    if-eqz v5, :cond_6

    :cond_4
    iget-object v5, p0, Lto/f;->z:Lwo/b;

    if-nez v5, :cond_5

    iget-object v5, p0, Lto/f;->E:Landroid/content/Context;

    invoke-static {v5}, Ls30/b;->l(Landroid/content/Context;)Lwo/b;

    move-result-object v5

    iput-object v5, p0, Lto/f;->z:Lwo/b;

    :cond_5
    iget-object v5, p0, Lto/f;->z:Lwo/b;

    invoke-virtual {v5, p1}, Lwo/b;->c(Luo/m;)Lcom/google/android/gms/tasks/Task;

    :cond_6
    iput-object v9, p0, Lto/f;->y:Luo/m;

    :cond_7
    :goto_1
    iget-object p1, p0, Lto/f;->y:Luo/m;

    if-nez p1, :cond_22

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Luo/m;

    invoke-direct {v0, v4, p1}, Luo/m;-><init>(ILjava/util/List;)V

    iput-object v0, p0, Lto/f;->y:Luo/m;

    invoke-virtual {v1, v7}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v1, p1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return v10

    :pswitch_2
    iget-object p1, p0, Lto/f;->y:Luo/m;

    if-eqz p1, :cond_22

    invoke-virtual {p1}, Luo/m;->b()I

    move-result v0

    if-gtz v0, :cond_8

    invoke-virtual {p0}, Lto/f;->g()Z

    move-result v0

    if-eqz v0, :cond_a

    :cond_8
    iget-object v0, p0, Lto/f;->z:Lwo/b;

    if-nez v0, :cond_9

    iget-object v0, p0, Lto/f;->E:Landroid/content/Context;

    invoke-static {v0}, Ls30/b;->l(Landroid/content/Context;)Lwo/b;

    move-result-object v0

    iput-object v0, p0, Lto/f;->z:Lwo/b;

    :cond_9
    iget-object v0, p0, Lto/f;->z:Lwo/b;

    invoke-virtual {v0, p1}, Lwo/b;->c(Luo/m;)Lcom/google/android/gms/tasks/Task;

    :cond_a
    iput-object v9, p0, Lto/f;->y:Luo/m;

    return v10

    :pswitch_3
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lto/w;

    invoke-virtual {p1}, Lto/w;->a()Lto/a;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_22

    invoke-virtual {p1}, Lto/w;->a()Lto/a;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lto/v;

    iget-object v1, v0, Lto/v;->o:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_22

    iget-object v1, v0, Lto/v;->r:Lto/f;

    iget-object v2, v1, Lto/f;->N:Ljp/d;

    const/16 v3, 0xf

    invoke-virtual {v2, v3, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v1, v1, Lto/f;->N:Ljp/d;

    const/16 v2, 0x10

    invoke-virtual {v1, v2, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    invoke-virtual {p1}, Lto/w;->b()Lcom/google/android/gms/common/c;

    move-result-object p1

    iget-object v1, v0, Lto/v;->f:Ljava/util/LinkedList;

    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_b
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lto/n0;

    instance-of v5, v4, Lto/d0;

    if-eqz v5, :cond_b

    move-object v5, v4

    check-cast v5, Lto/d0;

    invoke-virtual {v5, v0}, Lto/d0;->f(Lto/v;)[Lcom/google/android/gms/common/c;

    move-result-object v5

    if-eqz v5, :cond_b

    invoke-static {v5, p1}, Ls30/e;->f([Ljava/lang/Object;Lcom/google/android/gms/common/c;)Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_c
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_3
    if-ge v8, v0, :cond_22

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lto/n0;

    invoke-virtual {v1, v3}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    new-instance v4, Lcom/google/android/gms/common/api/UnsupportedApiCallException;

    invoke-direct {v4, p1}, Lcom/google/android/gms/common/api/UnsupportedApiCallException;-><init>(Lcom/google/android/gms/common/c;)V

    invoke-virtual {v3, v4}, Lto/n0;->b(Ljava/lang/Exception;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :pswitch_4
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lto/w;

    invoke-virtual {p1}, Lto/w;->a()Lto/a;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_22

    invoke-virtual {p1}, Lto/w;->a()Lto/a;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lto/v;

    iget-object v1, v0, Lto/v;->o:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    goto/16 :goto_d

    :cond_d
    iget-boolean p1, v0, Lto/v;->n:Z

    if-nez p1, :cond_22

    iget-object p1, v0, Lto/v;->g:Lcom/google/android/gms/common/api/d;

    check-cast p1, Luo/c;

    invoke-virtual {p1}, Luo/c;->n()Z

    move-result p1

    if-nez p1, :cond_e

    invoke-virtual {v0}, Lto/v;->o()V

    return v10

    :cond_e
    invoke-virtual {v0}, Lto/v;->d()V

    return v10

    :pswitch_5
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lto/t;

    invoke-virtual {p1}, Lto/t;->a()Lto/a;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    invoke-virtual {p1}, Lto/t;->b()Lcq/i;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lcq/i;->b(Ljava/lang/Object;)V

    return v10

    :cond_f
    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lto/v;

    invoke-virtual {v0, v8}, Lto/v;->i(Z)Z

    move-result v0

    invoke-virtual {p1}, Lto/t;->b()Lcq/i;

    move-result-object p1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcq/i;->b(Ljava/lang/Object;)V

    return v10

    :pswitch_6
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_22

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lto/v;

    invoke-virtual {p1, v10}, Lto/v;->i(Z)Z

    return v10

    :pswitch_7
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_22

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lto/v;

    iget-object v0, p1, Lto/v;->r:Lto/f;

    iget-object v1, v0, Lto/f;->N:Ljp/d;

    invoke-static {v1}, Luo/w;->c(Landroid/os/Handler;)V

    iget-boolean v1, p1, Lto/v;->n:Z

    if-eqz v1, :cond_22

    if-eqz v1, :cond_10

    iget-object v1, p1, Lto/v;->r:Lto/f;

    iget-object v2, p1, Lto/v;->h:Lto/a;

    iget-object v3, v1, Lto/f;->N:Ljp/d;

    const/16 v4, 0xb

    invoke-virtual {v3, v4, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v1, v1, Lto/f;->N:Ljp/d;

    const/16 v3, 0x9

    invoke-virtual {v1, v3, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iput-boolean v8, p1, Lto/v;->n:Z

    :cond_10
    iget-object v1, v0, Lto/f;->E:Landroid/content/Context;

    iget-object v0, v0, Lto/f;->F:Lcom/google/android/gms/common/GoogleApiAvailability;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/GoogleApiAvailability;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result v0

    const/16 v1, 0x12

    if-ne v0, v1, :cond_11

    const-string v0, "Connection timed out waiting for Google Play services update to complete."

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    const/16 v2, 0x15

    invoke-direct {v1, v2, v0, v9, v9}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/a;)V

    goto :goto_4

    :cond_11
    const-string v0, "API failed to connect while resuming due to an unknown error."

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    const/16 v2, 0x16

    invoke-direct {v1, v2, v0, v9, v9}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/a;)V

    :goto_4
    invoke-virtual {p1, v1}, Lto/v;->g(Lcom/google/android/gms/common/api/Status;)V

    iget-object p1, p1, Lto/v;->g:Lcom/google/android/gms/common/api/d;

    const-string v0, "Timing out connection while resuming."

    check-cast p1, Luo/c;

    invoke-virtual {p1, v0}, Luo/c;->f(Ljava/lang/String;)V

    return v10

    :pswitch_8
    iget-object p1, p0, Lto/f;->M:La0/h;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, La0/b;

    invoke-direct {v0, p1}, La0/b;-><init>(La0/h;)V

    :cond_12
    :goto_5
    invoke-virtual {v0}, La0/m;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_13

    invoke-virtual {v0}, La0/m;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lto/a;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lto/v;

    if-eqz v1, :cond_12

    invoke-virtual {v1}, Lto/v;->n()V

    goto :goto_5

    :cond_13
    invoke-virtual {p1}, La0/h;->clear()V

    return v10

    :pswitch_9
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_22

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lto/v;

    iget-object v0, p1, Lto/v;->r:Lto/f;

    iget-object v0, v0, Lto/f;->N:Ljp/d;

    invoke-static {v0}, Luo/w;->c(Landroid/os/Handler;)V

    iget-boolean v0, p1, Lto/v;->n:Z

    if-eqz v0, :cond_22

    invoke-virtual {p1}, Lto/v;->o()V

    return v10

    :pswitch_a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/common/api/h;

    invoke-virtual {p0, p1}, Lto/f;->b(Lcom/google/android/gms/common/api/h;)Lto/v;

    return v10

    :pswitch_b
    iget-object p1, p0, Lto/f;->E:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Landroid/app/Application;

    if-eqz v0, :cond_22

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    invoke-static {p1}, Lto/c;->a(Landroid/app/Application;)V

    sget-object p1, Lto/c;->E:Lto/c;

    new-instance v0, Lto/u;

    invoke-direct {v0, p0}, Lto/u;-><init>(Lto/f;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    monitor-enter p1

    :try_start_0
    iget-object v1, p1, Lto/c;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p1, Lto/c;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object p1, p1, Lto/c;->x:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-nez v1, :cond_16

    sget-object v1, Lzo/b;->g:Ljava/lang/Boolean;

    if-nez v1, :cond_14

    invoke-static {}, Landroid/os/Process;->isIsolated()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    sput-object v1, Lzo/b;->g:Ljava/lang/Boolean;

    :cond_14
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_15

    new-instance v1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    invoke-direct {v1}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    invoke-static {v1}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    invoke-virtual {p1, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result p1

    if-nez p1, :cond_16

    iget p1, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    const/16 v1, 0x64

    if-le p1, v1, :cond_16

    invoke-virtual {v0, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_6

    :cond_15
    move p1, v10

    goto :goto_7

    :cond_16
    :goto_6
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    :goto_7
    if-nez p1, :cond_22

    iput-wide v5, p0, Lto/f;->w:J

    return v10

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :pswitch_c
    iget v1, p1, Landroid/os/Message;->arg1:I

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/common/a;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_17
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_18

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lto/v;

    iget v5, v3, Lto/v;->l:I

    if-ne v5, v1, :cond_17

    goto :goto_8

    :cond_18
    move-object v3, v9

    :goto_8
    if-eqz v3, :cond_1a

    iget v0, p1, Lcom/google/android/gms/common/a;->x:I

    if-ne v0, v4, :cond_19

    iget-object v1, p0, Lto/f;->F:Lcom/google/android/gms/common/GoogleApiAvailability;

    new-instance v2, Lcom/google/android/gms/common/api/Status;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/common/GoogleApiAvailability;->getErrorString(I)Ljava/lang/String;

    move-result-object v0

    iget-object p1, p1, Lcom/google/android/gms/common/a;->z:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    add-int/lit8 v1, v1, 0x45

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    add-int/2addr v1, v4

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Error resolution was canceled by the user, original error message: "

    const-string v4, ": "

    invoke-static {v5, v1, v0, v4, p1}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, v7, p1, v9, v9}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/a;)V

    invoke-virtual {v3, v2}, Lto/v;->g(Lcom/google/android/gms/common/api/Status;)V

    return v10

    :cond_19
    iget-object v0, v3, Lto/v;->h:Lto/a;

    invoke-static {v0, p1}, Lto/f;->d(Lto/a;Lcom/google/android/gms/common/a;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {v3, p1}, Lto/v;->g(Lcom/google/android/gms/common/api/Status;)V

    return v10

    :cond_1a
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    new-instance v2, Ljava/lang/StringBuilder;

    add-int/lit8 p1, p1, 0x41

    invoke-direct {v2, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p1, "Could not find API instance "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " while trying to fail enqueued calls."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    invoke-static {v0, p1, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return v10

    :pswitch_d
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lto/e0;

    iget-object v0, p1, Lto/e0;->c:Lcom/google/android/gms/common/api/h;

    iget-object v1, p1, Lto/e0;->a:Lto/n0;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/h;->getApiKey()Lto/a;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lto/v;

    if-nez v2, :cond_1b

    invoke-virtual {p0, v0}, Lto/f;->b(Lcom/google/android/gms/common/api/h;)Lto/v;

    move-result-object v2

    :cond_1b
    iget-object v0, v2, Lto/v;->g:Lcom/google/android/gms/common/api/d;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/d;->a()Z

    move-result v0

    if-eqz v0, :cond_1c

    iget-object v0, p0, Lto/f;->I:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    iget p1, p1, Lto/e0;->b:I

    if-eq v0, p1, :cond_1c

    sget-object p1, Lto/f;->P:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {v1, p1}, Lto/n0;->a(Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {v2}, Lto/v;->n()V

    return v10

    :cond_1c
    invoke-virtual {v2, v1}, Lto/v;->m(Lto/n0;)V

    return v10

    :pswitch_e
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_22

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lto/v;

    iget-object v1, v0, Lto/v;->r:Lto/f;

    iget-object v1, v1, Lto/f;->N:Ljp/d;

    invoke-static {v1}, Luo/w;->c(Landroid/os/Handler;)V

    iput-object v9, v0, Lto/v;->p:Lcom/google/android/gms/common/a;

    invoke-virtual {v0}, Lto/v;->o()V

    goto :goto_9

    :pswitch_f
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lto/o0;

    invoke-virtual {p1}, Lto/o0;->a()La0/c;

    move-result-object v0

    invoke-virtual {v0}, La0/c;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_a
    move-object v1, v0

    check-cast v1, La0/m;

    invoke-virtual {v1}, La0/m;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_22

    invoke-virtual {v1}, La0/m;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lto/a;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lto/v;

    if-nez v3, :cond_1d

    new-instance v0, Lcom/google/android/gms/common/a;

    invoke-direct {v0, v4}, Lcom/google/android/gms/common/a;-><init>(I)V

    invoke-virtual {p1, v1, v0, v9}, Lto/o0;->c(Lto/a;Lcom/google/android/gms/common/a;Ljava/lang/String;)V

    return v10

    :cond_1d
    iget-object v5, v3, Lto/v;->r:Lto/f;

    iget-object v6, v3, Lto/v;->g:Lcom/google/android/gms/common/api/d;

    check-cast v6, Luo/c;

    invoke-virtual {v6}, Luo/c;->n()Z

    move-result v7

    if-eqz v7, :cond_1f

    sget-object v3, Lcom/google/android/gms/common/a;->E:Lcom/google/android/gms/common/a;

    invoke-virtual {v6}, Luo/c;->n()Z

    move-result v5

    if-eqz v5, :cond_1e

    iget-object v5, v6, Luo/c;->b:Lbd3/u;

    if-eqz v5, :cond_1e

    const-string v5, "com.google.android.gms"

    invoke-virtual {p1, v1, v3, v5}, Lto/o0;->c(Lto/a;Lcom/google/android/gms/common/a;Ljava/lang/String;)V

    goto :goto_a

    :cond_1e
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Failed to connect when checking package"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1f
    iget-object v6, v5, Lto/f;->N:Ljp/d;

    invoke-static {v6}, Luo/w;->c(Landroid/os/Handler;)V

    iget-object v6, v3, Lto/v;->p:Lcom/google/android/gms/common/a;

    if-eqz v6, :cond_20

    invoke-virtual {p1, v1, v6, v9}, Lto/o0;->c(Lto/a;Lcom/google/android/gms/common/a;Ljava/lang/String;)V

    goto :goto_a

    :cond_20
    iget-object v1, v5, Lto/f;->N:Ljp/d;

    invoke-static {v1}, Luo/w;->c(Landroid/os/Handler;)V

    iget-object v1, v3, Lto/v;->j:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Lto/v;->o()V

    goto :goto_a

    :pswitch_10
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eq v10, p1, :cond_21

    goto :goto_b

    :cond_21
    const-wide/16 v5, 0x2710

    :goto_b
    iput-wide v5, p0, Lto/f;->w:J

    const/16 p1, 0xc

    invoke-virtual {v1, p1}, Landroid/os/Handler;->removeMessages(I)V

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_22

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lto/a;

    invoke-virtual {v1, p1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v2

    iget-wide v3, p0, Lto/f;->w:J

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_c

    :cond_22
    :goto_d
    return v10

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_d
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_d
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Lcom/google/android/gms/common/a;I)V
    .locals 3

    iget-object v0, p0, Lto/f;->F:Lcom/google/android/gms/common/GoogleApiAvailability;

    iget-object v1, p0, Lto/f;->E:Landroid/content/Context;

    invoke-virtual {v0, v1, p1, p2}, Lcom/google/android/gms/common/GoogleApiAvailability;->zad(Landroid/content/Context;Lcom/google/android/gms/common/a;I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x5

    const/4 v1, 0x0

    iget-object v2, p0, Lto/f;->N:Ljp/d;

    invoke-virtual {v2, v0, p2, v1, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_0
    return-void
.end method
