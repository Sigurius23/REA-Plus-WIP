.class public final Luo/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final g:Ljava/lang/Object;

.field public static h:Luo/h0;

.field public static i:Landroid/os/HandlerThread;


# instance fields
.field public final a:Ljava/util/HashMap;

.field public final b:Landroid/content/Context;

.field public volatile c:Ljp/d;

.field public final d:Lyo/a;

.field public final e:J

.field public final f:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Luo/h0;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Luo/h0;->a:Ljava/util/HashMap;

    new-instance v0, Luo/g0;

    invoke-direct {v0, p0}, Luo/g0;-><init>(Luo/h0;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Luo/h0;->b:Landroid/content/Context;

    new-instance p1, Ljp/d;

    invoke-direct {p1, p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    iput-object p1, p0, Luo/h0;->c:Ljp/d;

    invoke-static {}, Lyo/a;->a()Lyo/a;

    move-result-object p1

    iput-object p1, p0, Luo/h0;->d:Lyo/a;

    const-wide/16 p1, 0x1388

    iput-wide p1, p0, Luo/h0;->e:J

    const-wide/32 p1, 0x493e0

    iput-wide p1, p0, Luo/h0;->f:J

    return-void
.end method


# virtual methods
.method public final a(Luo/e0;Luo/a0;Ljava/lang/String;)Lcom/google/android/gms/common/a;
    .locals 6

    iget-object v0, p0, Luo/h0;->a:Ljava/util/HashMap;

    const-string v1, "Trying to bind a GmsServiceConnection that was already connected before.  config="

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Luo/f0;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    new-instance v2, Luo/f0;

    invoke-direct {v2, p0, p1}, Luo/f0;-><init>(Luo/h0;Luo/e0;)V

    iget-object v1, v2, Luo/f0;->w:Ljava/util/HashMap;

    invoke-virtual {v1, p2, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, p3, v3}, Luo/f0;->a(Ljava/lang/String;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/common/a;

    move-result-object v3

    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object v4, p0, Luo/h0;->c:Ljp/d;

    const/4 v5, 0x0

    invoke-virtual {v4, v5, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v4, v2, Luo/f0;->w:Ljava/util/HashMap;

    invoke-virtual {v4, p2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    iget-object p1, v2, Luo/f0;->w:Ljava/util/HashMap;

    invoke-virtual {p1, p2, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget p1, v2, Luo/f0;->x:I

    const/4 v1, 0x1

    if-eq p1, v1, :cond_2

    const/4 p2, 0x2

    if-eq p1, p2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v2, p3, v3}, Luo/f0;->a(Ljava/lang/String;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/common/a;

    move-result-object v3

    goto :goto_0

    :cond_2
    iget-object p1, v2, Luo/f0;->F:Landroid/content/ComponentName;

    iget-object p3, v2, Luo/f0;->z:Landroid/os/IBinder;

    invoke-virtual {p2, p1, p3}, Luo/a0;->onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V

    :goto_0
    iget-boolean p1, v2, Luo/f0;->y:Z

    if-eqz p1, :cond_3

    sget-object p1, Lcom/google/android/gms/common/a;->E:Lcom/google/android/gms/common/a;

    monitor-exit v0

    return-object p1

    :cond_3
    if-nez v3, :cond_4

    new-instance v3, Lcom/google/android/gms/common/a;

    const/4 p1, -0x1

    invoke-direct {v3, p1}, Lcom/google/android/gms/common/a;-><init>(I)V

    :cond_4
    monitor-exit v0

    return-object v3

    :cond_5
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Luo/e0;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p3

    add-int/lit8 p3, p3, 0x51

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final b(Ljava/lang/String;Landroid/content/ServiceConnection;Z)V
    .locals 3

    new-instance v0, Luo/e0;

    invoke-direct {v0, p1, p3}, Luo/e0;-><init>(Ljava/lang/String;Z)V

    const-string p1, "ServiceConnection must not be null"

    invoke-static {p2, p1}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Luo/h0;->a:Ljava/util/HashMap;

    const-string p3, "Trying to unbind a GmsServiceConnection  that was not bound before.  config="

    const-string v1, "Nonexistent connection status for service config: "

    monitor-enter p1

    :try_start_0
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Luo/f0;

    if-eqz v2, :cond_2

    iget-object v1, v2, Luo/f0;->w:Ljava/util/HashMap;

    invoke-virtual {v1, p2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object p3, v2, Luo/f0;->w:Ljava/util/HashMap;

    invoke-virtual {p3, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, v2, Luo/f0;->w:Ljava/util/HashMap;

    invoke-virtual {p2}, Ljava/util/HashMap;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Luo/h0;->c:Ljp/d;

    const/4 p3, 0x0

    invoke-virtual {p2, p3, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p2

    iget-object p3, p0, Luo/h0;->c:Ljp/d;

    iget-wide v0, p0, Luo/h0;->e:J

    invoke-virtual {p3, p2, v0, v1}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p1

    return-void

    :cond_1
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Luo/e0;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x4c

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Luo/e0;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x32

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method
