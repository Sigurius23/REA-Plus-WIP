.class public abstract Luo/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final x:[Lcom/google/android/gms/common/c;


# instance fields
.field public volatile a:Ljava/lang/String;

.field public b:Lbd3/u;

.field public final c:Landroid/content/Context;

.field public final d:Luo/h0;

.field public final e:Luo/y;

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;

.field public h:Luo/v;

.field public i:Luo/b;

.field public j:Landroid/os/IInterface;

.field public final k:Ljava/util/ArrayList;

.field public l:Luo/a0;

.field public m:I

.field public final n:Luo/k;

.field public final o:Luo/k;

.field public final p:I

.field public final q:Ljava/lang/String;

.field public volatile r:Ljava/lang/String;

.field public volatile s:Lbp/a;

.field public t:Lcom/google/android/gms/common/a;

.field public u:Z

.field public volatile v:Luo/d0;

.field public final w:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Lcom/google/android/gms/common/c;

    sput-object v0, Luo/c;->x:[Lcom/google/android/gms/common/c;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Luo/h0;Lcom/google/android/gms/common/GoogleApiAvailability;ILuo/k;Luo/k;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Luo/c;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Luo/c;->f:Ljava/lang/Object;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Luo/c;->g:Ljava/lang/Object;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Luo/c;->k:Ljava/util/ArrayList;

    const/4 v1, 0x1

    iput v1, p0, Luo/c;->m:I

    iput-object v0, p0, Luo/c;->t:Lcom/google/android/gms/common/a;

    const/4 v1, 0x0

    iput-boolean v1, p0, Luo/c;->u:Z

    iput-object v0, p0, Luo/c;->v:Luo/d0;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Luo/c;->w:Ljava/util/concurrent/atomic/AtomicInteger;

    const-string v0, "Context must not be null"

    invoke-static {p1, v0}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Luo/c;->c:Landroid/content/Context;

    const-string p1, "Looper must not be null"

    invoke-static {p2, p1}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "Supervisor must not be null"

    invoke-static {p3, p1}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Luo/c;->d:Luo/h0;

    const-string p1, "API availability must not be null"

    invoke-static {p4, p1}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Luo/y;

    invoke-direct {p1, p0, p2}, Luo/y;-><init>(Luo/c;Landroid/os/Looper;)V

    iput-object p1, p0, Luo/c;->e:Luo/y;

    iput p5, p0, Luo/c;->p:I

    iput-object p6, p0, Luo/c;->n:Luo/k;

    iput-object p7, p0, Luo/c;->o:Luo/k;

    iput-object p8, p0, Luo/c;->q:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract b()I
.end method

.method public final c()V
    .locals 2

    invoke-virtual {p0}, Luo/c;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not connected. Call connect() and wait for onConnected() to be called."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public abstract d(Landroid/os/IBinder;)Landroid/os/IInterface;
.end method

.method public e()V
    .locals 5

    iget-object v0, p0, Luo/c;->w:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    iget-object v0, p0, Luo/c;->k:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x0

    if-ge v2, v1, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Luo/u;

    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iput-object v3, v4, Luo/u;->a:Ljava/lang/Boolean;

    monitor-exit v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1

    :catchall_1
    move-exception v1

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object v1, p0, Luo/c;->g:Ljava/lang/Object;

    monitor-enter v1

    :try_start_3
    iput-object v3, p0, Luo/c;->h:Luo/v;

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    const/4 v0, 0x1

    invoke-virtual {p0, v0, v3}, Luo/c;->t(ILandroid/os/IInterface;)V

    return-void

    :catchall_2
    move-exception v0

    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw v0

    :goto_1
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v1
.end method

.method public final f(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Luo/c;->a:Ljava/lang/String;

    invoke-virtual {p0}, Luo/c;->e()V

    return-void
.end method

.method public g()[Lcom/google/android/gms/common/c;
    .locals 1

    sget-object v0, Luo/c;->x:[Lcom/google/android/gms/common/c;

    return-object v0
.end method

.method public h()Landroid/os/Bundle;
    .locals 1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method public final i(Luo/i;Ljava/util/Set;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    invoke-virtual {v1}, Luo/c;->h()Landroid/os/Bundle;

    move-result-object v2

    new-instance v3, Luo/g;

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1f

    if-ge v4, v5, :cond_0

    iget-object v4, v1, Luo/c;->r:Ljava/lang/String;

    :goto_0
    move-object/from16 v17, v4

    goto :goto_1

    :cond_0
    iget-object v4, v1, Luo/c;->s:Lbp/a;

    if-nez v4, :cond_1

    iget-object v4, v1, Luo/c;->r:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iget-object v4, v1, Luo/c;->s:Lbp/a;

    iget-object v4, v4, Lbp/a;->a:Landroid/content/AttributionSource;

    if-nez v4, :cond_2

    iget-object v4, v1, Luo/c;->r:Ljava/lang/String;

    goto :goto_0

    :cond_2
    invoke-virtual {v4}, Landroid/content/AttributionSource;->getAttributionTag()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_3

    iget-object v4, v1, Luo/c;->r:Ljava/lang/String;

    goto :goto_0

    :cond_3
    invoke-virtual {v4}, Landroid/content/AttributionSource;->getAttributionTag()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :goto_1
    iget v5, v1, Luo/c;->p:I

    sget v6, Lcom/google/android/gms/common/d;->GOOGLE_PLAY_SERVICES_VERSION_CODE:I

    sget-object v9, Luo/g;->O:[Lcom/google/android/gms/common/api/Scope;

    new-instance v10, Landroid/os/Bundle;

    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    sget-object v12, Luo/g;->P:[Lcom/google/android/gms/common/c;

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/4 v4, 0x6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x1

    move-object v13, v12

    invoke-direct/range {v3 .. v17}, Luo/g;-><init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Lcom/google/android/gms/common/c;[Lcom/google/android/gms/common/c;ZIZLjava/lang/String;)V

    iget-object v4, v1, Luo/c;->c:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Luo/g;->z:Ljava/lang/String;

    iput-object v2, v3, Luo/g;->G:Landroid/os/Bundle;

    if-eqz v0, :cond_4

    const/4 v2, 0x0

    new-array v2, v2, [Lcom/google/android/gms/common/api/Scope;

    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/common/api/Scope;

    iput-object v0, v3, Luo/g;->F:[Lcom/google/android/gms/common/api/Scope;

    :cond_4
    invoke-virtual {v1}, Luo/c;->a()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_5

    new-instance v0, Landroid/accounts/Account;

    const-string v4, "<<default account>>"

    const-string v5, "com.google"

    invoke-direct {v0, v4, v5}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, v3, Luo/g;->H:Landroid/accounts/Account;

    if-eqz p1, :cond_6

    move-object/from16 v0, p1

    check-cast v0, Lip/a;

    invoke-virtual {v0}, Lip/a;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    iput-object v0, v3, Luo/g;->E:Landroid/os/IBinder;

    goto :goto_2

    :cond_5
    instance-of v0, v1, Lsp/k;

    if-eqz v0, :cond_6

    iput-object v2, v3, Luo/g;->H:Landroid/accounts/Account;

    :cond_6
    :goto_2
    sget-object v0, Luo/c;->x:[Lcom/google/android/gms/common/c;

    iput-object v0, v3, Luo/g;->I:[Lcom/google/android/gms/common/c;

    invoke-virtual {v1}, Luo/c;->g()[Lcom/google/android/gms/common/c;

    move-result-object v0

    iput-object v0, v3, Luo/g;->J:[Lcom/google/android/gms/common/c;

    invoke-virtual {v1}, Luo/c;->p()Z

    move-result v0

    const/4 v4, 0x1

    if-eqz v0, :cond_7

    iput-boolean v4, v3, Luo/g;->M:Z

    :cond_7
    :try_start_0
    iget-object v5, v1, Luo/c;->g:Ljava/lang/Object;

    monitor-enter v5
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v0, v1, Luo/c;->h:Luo/v;

    if-eqz v0, :cond_8

    new-instance v6, Luo/z;

    iget-object v7, v1, Luo/c;->w:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v7

    invoke-direct {v6, v1, v7}, Luo/z;-><init>(Luo/c;I)V

    invoke-virtual {v0, v6, v3}, Luo/v;->s(Luo/z;Luo/g;)V

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_8
    const-string v0, "GmsClient"

    const-string v3, "mServiceBroker is null, client disconnected"

    invoke-static {v0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_3
    monitor-exit v5

    return-void

    :goto_4
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v0

    goto :goto_5

    :catch_1
    move-exception v0

    goto :goto_5

    :catch_2
    move-exception v0

    goto :goto_6

    :catch_3
    move-exception v0

    goto :goto_7

    :goto_5
    const-string v3, "GmsClient"

    const-string v5, "IGmsServiceBroker.getService failed"

    invoke-static {v3, v5, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v0, v1, Luo/c;->w:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    new-instance v3, Luo/b0;

    const/16 v5, 0x8

    invoke-direct {v3, v1, v5, v2, v2}, Luo/b0;-><init>(Luo/c;ILandroid/os/IBinder;Landroid/os/Bundle;)V

    iget-object v2, v1, Luo/c;->e:Luo/y;

    const/4 v5, -0x1

    invoke-virtual {v2, v4, v0, v5, v3}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void

    :goto_6
    throw v0

    :goto_7
    const-string v2, "GmsClient"

    const-string v3, "IGmsServiceBroker.getService failed"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v0, v1, Luo/c;->w:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    iget-object v2, v1, Luo/c;->e:Luo/y;

    const/4 v3, 0x6

    const/4 v4, 0x3

    invoke-virtual {v2, v3, v0, v4}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final j()Landroid/os/IInterface;
    .locals 3

    iget-object v0, p0, Luo/c;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Luo/c;->m:I

    const/4 v2, 0x5

    if-eq v1, v2, :cond_0

    invoke-virtual {p0}, Luo/c;->c()V

    iget-object v1, p0, Luo/c;->j:Landroid/os/IInterface;

    const-string v2, "Client is connected but service is null"

    invoke-static {v1, v2}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    new-instance v1, Landroid/os/DeadObjectException;

    invoke-direct {v1}, Landroid/os/DeadObjectException;-><init>()V

    throw v1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public abstract k()Ljava/lang/String;
.end method

.method public abstract l()Ljava/lang/String;
.end method

.method public m()Z
    .locals 2

    invoke-virtual {p0}, Luo/c;->b()I

    move-result v0

    const v1, 0xc9e4920

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final n()Z
    .locals 3

    iget-object v0, p0, Luo/c;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Luo/c;->m:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final o()Z
    .locals 4

    iget-object v0, p0, Luo/c;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Luo/c;->m:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :cond_1
    :goto_0
    monitor-exit v0

    return v3

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public p()Z
    .locals 1

    instance-of v0, p0, Lip/e;

    return v0
.end method

.method public final synthetic q(IILandroid/os/IInterface;)Z
    .locals 2

    iget-object v0, p0, Luo/c;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Luo/c;->m:I

    if-eq v1, p1, :cond_0

    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2, p3}, Luo/c;->t(ILandroid/os/IInterface;)V

    monitor-exit v0

    const/4 p1, 0x1

    return p1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final synthetic r()V
    .locals 4

    iget-object v0, p0, Luo/c;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Luo/c;->m:I

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x3

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Luo/c;->u:Z

    const/4 v0, 0x5

    goto :goto_0

    :cond_0
    const/4 v0, 0x4

    :goto_0
    iget-object v1, p0, Luo/c;->e:Luo/y;

    iget-object v2, p0, Luo/c;->w:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    const/16 v3, 0x10

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final synthetic s()Z
    .locals 1

    iget-boolean v0, p0, Luo/c;->u:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Luo/c;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    :try_start_0
    invoke-virtual {p0}, Luo/c;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final t(ILandroid/os/IInterface;)V
    .locals 10

    const-string v0, " on com.google.android.gms"

    const-string v1, " on com.google.android.gms"

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x4

    if-eq p1, v4, :cond_0

    move v5, v2

    goto :goto_0

    :cond_0
    move v5, v3

    :goto_0
    if-nez p2, :cond_1

    move v6, v2

    goto :goto_1

    :cond_1
    move v6, v3

    :goto_1
    if-ne v5, v6, :cond_2

    move v2, v3

    :cond_2
    invoke-static {v2}, Luo/w;->a(Z)V

    iget-object v2, p0, Luo/c;->f:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iput p1, p0, Luo/c;->m:I

    iput-object p2, p0, Luo/c;->j:Landroid/os/IInterface;

    const/4 v5, 0x0

    if-eq p1, v3, :cond_c

    const/4 v3, 0x2

    if-eq p1, v3, :cond_4

    const/4 v3, 0x3

    if-eq p1, v3, :cond_4

    if-eq p1, v4, :cond_3

    goto/16 :goto_3

    :cond_3
    invoke-static {p2}, Luo/w;->f(Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    goto/16 :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_4
    const-string p1, "Calling connect() while still connected, missing disconnect() for "

    const-string p2, "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "

    const-string v3, "unable to connect to service: "

    iget-object v4, p0, Luo/c;->l:Luo/a0;

    if-eqz v4, :cond_6

    iget-object v6, p0, Luo/c;->b:Lbd3/u;

    if-eqz v6, :cond_6

    const-string v7, "GmsClient"

    iget-object v6, v6, Lbd3/u;->x:Ljava/lang/String;

    const-string v8, "com.google.android.gms"

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    add-int/lit8 v9, v9, 0x46

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    add-int/2addr v9, v8

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v7, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Luo/c;->d:Luo/h0;

    iget-object v1, p0, Luo/c;->b:Lbd3/u;

    iget-object v1, v1, Lbd3/u;->x:Ljava/lang/String;

    invoke-static {v1}, Luo/w;->f(Ljava/lang/Object;)V

    iget-object v6, p0, Luo/c;->b:Lbd3/u;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v6, p0, Luo/c;->q:Ljava/lang/String;

    if-nez v6, :cond_5

    iget-object v6, p0, Luo/c;->c:Landroid/content/Context;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_5
    iget-object v6, p0, Luo/c;->b:Lbd3/u;

    iget-boolean v6, v6, Lbd3/u;->w:Z

    invoke-virtual {p1, v1, v4, v6}, Luo/h0;->b(Ljava/lang/String;Landroid/content/ServiceConnection;Z)V

    iget-object p1, p0, Luo/c;->w:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    :cond_6
    new-instance p1, Luo/a0;

    iget-object v1, p0, Luo/c;->w:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    invoke-direct {p1, p0, v1}, Luo/a0;-><init>(Luo/c;I)V

    iput-object p1, p0, Luo/c;->l:Luo/a0;

    new-instance v1, Lbd3/u;

    invoke-virtual {p0}, Luo/c;->l()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Luo/c;->m()Z

    move-result v6

    invoke-direct {v1, v4, v6}, Lbd3/u;-><init>(Ljava/lang/String;Z)V

    iput-object v1, p0, Luo/c;->b:Lbd3/u;

    if-eqz v6, :cond_8

    invoke-virtual {p0}, Luo/c;->b()I

    move-result v1

    const v4, 0x1110e58

    if-lt v1, v4, :cond_7

    goto :goto_2

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    iget-object v0, p0, Luo/c;->b:Lbd3/u;

    iget-object v0, v0, Lbd3/u;->x:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    :goto_2
    iget-object p2, p0, Luo/c;->d:Luo/h0;

    iget-object v1, p0, Luo/c;->b:Lbd3/u;

    iget-object v1, v1, Lbd3/u;->x:Ljava/lang/String;

    invoke-static {v1}, Luo/w;->f(Ljava/lang/Object;)V

    iget-object v4, p0, Luo/c;->b:Lbd3/u;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, p0, Luo/c;->q:Ljava/lang/String;

    if-nez v4, :cond_9

    iget-object v4, p0, Luo/c;->c:Landroid/content/Context;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    :cond_9
    iget-object v6, p0, Luo/c;->b:Lbd3/u;

    iget-boolean v6, v6, Lbd3/u;->w:Z

    new-instance v7, Luo/e0;

    invoke-direct {v7, v1, v6}, Luo/e0;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {p2, v7, p1, v4}, Luo/h0;->a(Luo/e0;Luo/a0;Ljava/lang/String;)Lcom/google/android/gms/common/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/common/a;->b()Z

    move-result p2

    if-nez p2, :cond_e

    const-string p2, "GmsClient"

    iget-object v1, p0, Luo/c;->b:Lbd3/u;

    iget-object v1, v1, Lbd3/u;->x:Ljava/lang/String;

    const-string v4, "com.google.android.gms"

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, 0x22

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v6, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget p2, p1, Lcom/google/android/gms/common/a;->x:I

    const/4 v0, -0x1

    if-ne p2, v0, :cond_a

    const/16 p2, 0x10

    :cond_a
    iget-object v1, p1, Lcom/google/android/gms/common/a;->y:Landroid/app/PendingIntent;

    if-eqz v1, :cond_b

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    const-string v1, "pendingIntent"

    iget-object p1, p1, Lcom/google/android/gms/common/a;->y:Landroid/app/PendingIntent;

    invoke-virtual {v5, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_b
    iget-object p1, p0, Luo/c;->w:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    new-instance v1, Luo/c0;

    invoke-direct {v1, p0, p2, v5}, Luo/c0;-><init>(Luo/c;ILandroid/os/Bundle;)V

    iget-object p2, p0, Luo/c;->e:Luo/y;

    const/4 v3, 0x7

    invoke-virtual {p2, v3, p1, v0, v1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_3

    :cond_c
    iget-object p1, p0, Luo/c;->l:Luo/a0;

    if-eqz p1, :cond_e

    iget-object p2, p0, Luo/c;->d:Luo/h0;

    iget-object v0, p0, Luo/c;->b:Lbd3/u;

    iget-object v0, v0, Lbd3/u;->x:Ljava/lang/String;

    invoke-static {v0}, Luo/w;->f(Ljava/lang/Object;)V

    iget-object v1, p0, Luo/c;->b:Lbd3/u;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Luo/c;->q:Ljava/lang/String;

    if-nez v1, :cond_d

    iget-object v1, p0, Luo/c;->c:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_d
    iget-object v1, p0, Luo/c;->b:Lbd3/u;

    iget-boolean v1, v1, Lbd3/u;->w:Z

    invoke-virtual {p2, v0, p1, v1}, Luo/h0;->b(Ljava/lang/String;Landroid/content/ServiceConnection;Z)V

    iput-object v5, p0, Luo/c;->l:Luo/a0;

    :cond_e
    :goto_3
    monitor-exit v2

    return-void

    :goto_4
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
